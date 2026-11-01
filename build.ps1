param([string]$JavaHome=$env:JAVA_HOME,[switch]$VerifyOnly,[switch]$SourceOnly,[string]$SourceIndex='source-units.json',[switch]$SkipLastSuccess,[string]$IntrinsicPlan='INTRINSIC_PLAN.json',[string]$ConstructorPlan='CONSTRUCTOR_PLAN.json',[string]$EnumPlan='ENUM_PLAN.json',[string]$HandlerPlan='HANDLER_PLAN.json',[string]$AbiPlan='ABI_ALIAS_PLAN.json')

$ErrorActionPreference='Stop'

# PowerShell 7 does not always preload the framework ZIP APIs.  The source
# archive step is part of the reproducible build, so load the standard
# compression assembly explicitly instead of relying on the host session.
Add-Type -AssemblyName System.IO.Compression.FileSystem

$moonRoot=$PSScriptRoot

function Test-MoonSourceOnlyArchive([string]$moonArchivePath,[string]$moonRequiredEntry) {

    if(-not (Test-Path -LiteralPath $moonArchivePath -PathType Leaf)){throw "Source-only archive missing: $moonArchivePath"}

    $moonZip=[IO.Compression.ZipFile]::OpenRead($moonArchivePath)

    try {

        $moonSeen=[Collections.Generic.HashSet[string]]::new([StringComparer]::Ordinal)
        $moonClassCount=0
        $moonInvalid=@()
        $moonBadMagic=@()

        foreach($moonEntry in $moonZip.Entries){

            if(-not $moonSeen.Add($moonEntry.FullName)){throw "Duplicate archive entry: $($moonEntry.FullName)"}

            if($moonEntry.FullName.EndsWith('/')){throw "Directory entry is not allowed in source-only archive: $($moonEntry.FullName)"}

            if($moonEntry.FullName -notmatch '^(?:[A-Za-z0-9_$]+/)*[A-Za-z0-9_$]+\.class$'){$moonInvalid += $moonEntry.FullName;continue}

            $moonClassCount++
            $moonBytes=New-Object byte[] 4
            $moonInput=$moonEntry.Open()
            try{$moonRead=$moonInput.Read($moonBytes,0,4)}finally{$moonInput.Dispose()}
            if($moonRead -ne 4 -or $moonBytes[0] -ne 0xCA -or $moonBytes[1] -ne 0xFE -or $moonBytes[2] -ne 0xBA -or $moonBytes[3] -ne 0xBE){$moonBadMagic += $moonEntry.FullName}

        }

        if($moonInvalid.Count -gt 0){throw "Non-class entries in source-only archive: $($moonInvalid -join ', ')"}
        if($moonBadMagic.Count -gt 0){throw "Invalid class magic in source-only archive: $($moonBadMagic -join ', ')"}
        if(-not $moonSeen.Contains($moonRequiredEntry)){throw "Required client entrypoint is missing: $moonRequiredEntry"}
        if($moonClassCount -eq 0){throw 'Source-only archive has no class entries.'}

        return [ordered]@{entry_count=$moonSeen.Count;class_entries=$moonClassCount;required_entry=$moonRequiredEntry;passed=$true}

    } finally {$moonZip.Dispose()}

}

function Test-MoonResourceArchive([string]$moonArchivePath,[int]$moonExpectedEntries) {

    $moonZip=[IO.Compression.ZipFile]::OpenRead($moonArchivePath)
    try {
        $moonSeen=[Collections.Generic.HashSet[string]]::new([StringComparer]::Ordinal)
        foreach($moonEntry in $moonZip.Entries){
            if($moonEntry.FullName.EndsWith('/')){throw "Resource archive contains a directory entry: $($moonEntry.FullName)"}
            if(-not $moonSeen.Add($moonEntry.FullName)){throw "Duplicate resource entry: $($moonEntry.FullName)"}
        }
        if($moonSeen.Count -ne $moonExpectedEntries){throw "Resource entry count mismatch: $($moonSeen.Count) != $moonExpectedEntries"}
        return [ordered]@{entry_count=$moonSeen.Count;duplicate_entries=0;passed=$true}
    } finally {$moonZip.Dispose()}

}

$moonSaved=@{}

foreach($moonName in @('JAVA_TOOL_OPTIONS','_JAVA_OPTIONS','JDK_JAVA_OPTIONS','CLASSPATH')) {

    $moonSaved[$moonName]=[Environment]::GetEnvironmentVariable($moonName,'Process')

    Remove-Item -LiteralPath ('Env:'+$moonName) -ErrorAction SilentlyContinue

}

try {

    if($JavaHome){$moonJavac=Join-Path $JavaHome 'bin/javac.exe';$moonJava=Join-Path $JavaHome 'bin/java.exe'}

    else{$moonJavac=(Get-Command javac).Source;$moonJava=(Get-Command java).Source}

    $moonVersion=((& $moonJavac -version 2>&1)|Where-Object {$_ -match '^javac '}|Out-String).Trim()

    if($moonVersion -notmatch '^javac 17(?:\.|$)'){throw "JDK17 required: $moonVersion"}

    $moonLock=Get-Content (Join-Path $moonRoot 'vendor/DEPENDENCIES.lock.json') -Raw|ConvertFrom-Json

    $moonProviders=@($moonLock.providers|Sort-Object index)

    $moonToolLock=Get-Content (Join-Path $moonRoot 'vendor/BUILD_TOOLS.lock.json') -Raw|ConvertFrom-Json

    $moonRuntimeLock=Get-Content (Join-Path $moonRoot 'vendor/RUNTIME_DEPENDENCIES.lock.json') -Raw|ConvertFrom-Json

    foreach($moonBootstrap in @($moonToolLock.bootstrap_sources)+@($moonToolLock.bootstrap_metadata)) {

        if((Get-FileHash (Join-Path $moonRoot $moonBootstrap.path) -Algorithm SHA256).Hash -ne $moonBootstrap.sha256){throw "Bootstrap tool SHA mismatch: $($moonBootstrap.path)"}

    }

    & $moonJava '--source' '17' (Join-Path $moonRoot 'build-tools/ResourceAssembler.java') '--manifest' (Join-Path $moonRoot 'vendor/resources/resource-manifest.json')

    if($LASTEXITCODE -ne 0){throw 'Original resource reassembly failed.'}

    if($moonProviders.Count -ne $moonLock.required_provider_count){throw 'Locked provider count mismatch.'}

    foreach($moonRow in @($moonProviders)+@($moonRuntimeLock.providers)+@($moonLock.resources)+@($moonToolLock.tools)+@($moonToolLock.metadata)+@($moonToolLock.sources)+@($moonToolLock.frontend_sources)+@($moonToolLock.audit_sources)+@($moonToolLock.adapter_sources)+@($moonToolLock.plans)){

        if((Get-FileHash (Join-Path $moonRoot $moonRow.path) -Algorithm SHA256).Hash -ne $moonRow.sha256){throw "SHA mismatch: $($moonRow.path)"}

    }

    if($VerifyOnly){('Verified JDK17, '+$moonProviders.Count+' locked providers and original resource archive.');return}

    if($SourceOnly){
        Remove-Item -LiteralPath (Join-Path $moonRoot 'build/SOURCE_ONLY_RESULT.json') -Force -ErrorAction SilentlyContinue
        Remove-Item -LiteralPath (Join-Path $moonRoot 'build/libs/openmoon-source-only.jar') -Force -ErrorAction SilentlyContinue
    }

    $moonRun=Join-Path $moonRoot ('build/runs/'+[Guid]::NewGuid().ToString('N'))

    $moonTools=Join-Path $moonRun 'tool-classes'

    $moonEmpty=Join-Path $moonRun 'empty-sourcepath'

    New-Item -ItemType Directory -Force -Path $moonTools,$moonEmpty|Out-Null

    $moonIndexPath=if([IO.Path]::IsPathRooted($SourceIndex)){$SourceIndex}else{Join-Path $moonRoot $SourceIndex}

    $moonIndex=Get-Content $moonIndexPath -Raw|ConvertFrom-Json
    $moonUnits=@($moonIndex.units)

    if($moonUnits.Count -eq 0){throw 'Source index has no production Java units.'}
    if($SourceOnly -and $SourceIndex -eq 'source-units.json' -and $moonUnits.Count -ne 4097){throw "Source-only source-unit count mismatch: $($moonUnits.Count) != 4097"}

    $moonZip=Join-Path $moonRun 'sources.zip'

    $moonSeen=[Collections.Generic.HashSet[string]]::new([StringComparer]::Ordinal)

    $moonRows=@()

    $moonArchive=[IO.Compression.ZipFile]::Open($moonZip,[IO.Compression.ZipArchiveMode]::Create)

    try{foreach($moonUnit in $moonUnits){

        if($moonUnit.entry -notmatch '\.java$' -or $moonUnit.entry -match '(^/|\\|:|(^|/)\.\.?(/|$))'){throw 'Noncanonical exact source entry.'}

        if(-not $moonSeen.Add($moonUnit.entry)){throw "Duplicate source entry: $($moonUnit.entry)"}

        $moonSource=[IO.Path]::GetFullPath((Join-Path $moonRoot $moonUnit.path))

        if(-not $moonSource.StartsWith(($moonRoot+[IO.Path]::DirectorySeparatorChar),[StringComparison]::OrdinalIgnoreCase)){throw 'Source outside repository.'}

        $moonEntry=$moonArchive.CreateEntry($moonUnit.entry,[IO.Compression.CompressionLevel]::Optimal)

        $moonEntry.LastWriteTime=[DateTimeOffset]::new(2000,1,1,0,0,0,[TimeSpan]::Zero)

        $moonInput=[IO.File]::OpenRead($moonSource);$moonOutput=$moonEntry.Open()

        try{$moonInput.CopyTo($moonOutput)}finally{$moonInput.Dispose();$moonOutput.Dispose()}

        $moonSourceSha=(Get-FileHash $moonSource -Algorithm SHA256).Hash
        if($moonUnit.source_sha256 -and $moonSourceSha -ne $moonUnit.source_sha256){throw "Source SHA mismatch: $($moonUnit.path)"}
        if($moonUnit.owner -and $moonUnit.entry -ne ($moonUnit.owner+'.java')){throw "Source owner/entry mismatch: $($moonUnit.entry) != $($moonUnit.owner).java"}
        $moonRows += [ordered]@{path=$moonUnit.path;entry=$moonUnit.entry;owner=$moonUnit.owner;sha256=$moonSourceSha}

    }}finally{$moonArchive.Dispose()}

    $moonRows|ConvertTo-Json -Depth 5|Set-Content (Join-Path $moonRun 'SOURCE_INPUTS.json') -Encoding utf8

    $moonArgfile=Join-Path $moonRun 'tool-javac.args'

    $moonToolCp=(@($moonToolLock.tools|ForEach-Object {Join-Path $moonRoot $_.path}) -join [IO.Path]::PathSeparator)

    $moonExports=@('--add-exports=jdk.compiler/com.sun.tools.javac.api=ALL-UNNAMED','--add-exports=jdk.compiler/com.sun.tools.javac.util=ALL-UNNAMED')

    $moonToolSources=@(
        (Join-Path $moonRoot 'build-tools/ZipSourceCompiler.java'),
        (Join-Path $moonRoot 'build-tools/JvmExceptionSourcePolicy.java'),
        (Join-Path $moonRoot 'build-tools/EnumSourceAdapter.java')
    )

    if(-not $SourceOnly){
        $moonToolSources+=@(
            (Join-Path $moonRoot 'build-tools/SourceIntrinsicAdapter.java'),
            (Join-Path $moonRoot 'build-tools/ConstructorSourceAdapter.java'),
            (Join-Path $moonRoot 'build-tools/SourceDeclarationAdapter.java'),
            (Join-Path $moonRoot 'build-tools/PortableHandlerAdapter.java'),
            (Join-Path $moonRoot 'build-tools/SourceAbiAdapter.java'),
            (Join-Path $moonRoot 'build-tools/FinalArchiveAudit.java')
        )
        foreach($moonGenerator in @($moonToolLock.sources)){$moonToolSources+=(Join-Path $moonRoot $moonGenerator.path)}
    }

    $moonArgs=@('-source','17','-target','17')+$moonExports+@('-encoding','UTF-8','-proc:none','-implicit:none','-d',('"'+$moonTools.Replace('\','/')+'"'),'-classpath',('"'+$moonToolCp.Replace('\','/')+'"'),'-sourcepath',('"'+$moonEmpty.Replace('\','/')+'"'))
    foreach($moonToolSource in $moonToolSources){$moonArgs+=('"'+$moonToolSource.Replace('\','/')+'"')}

    [IO.File]::WriteAllLines($moonArgfile,$moonArgs,[Text.UTF8Encoding]::new($false))

    & $moonJavac ('@'+$moonArgfile) 1>(Join-Path $moonRun 'tool-javac.stdout.txt') 2>(Join-Path $moonRun 'tool-javac.stderr.txt')

    if($LASTEXITCODE -ne 0){throw "Build-tool javac failed; evidence: $moonRun"}

    $moonEnumPlanPath=if($EnumPlan){if([IO.Path]::IsPathRooted($EnumPlan)){$EnumPlan}else{Join-Path $moonRoot $EnumPlan}}else{$null}

    $moonEnumSymbol=$null

    if($moonEnumPlanPath -and (Test-Path -LiteralPath $moonEnumPlanPath)){

        $moonEnumSymbol=Join-Path $moonRun 'compile-only-enum-symbol.jar'

        & $moonJava '-classpath' ($moonTools+[IO.Path]::PathSeparator+$moonToolCp) 'EnumSourceAdapter' 'symbol' $moonEnumSymbol 1>(Join-Path $moonRun 'enum-symbol.stdout.txt') 2>(Join-Path $moonRun 'enum-symbol.stderr.txt')

        if($LASTEXITCODE -ne 0){throw "Enum compile-only symbol generation failed; evidence: $moonRun"}

    }

    $moonArgs=@('-Xmx6g','-Xss16m','-Dmoon.sourceAccessProjection=true')+$moonExports+@('-classpath',$moonTools,'ZipSourceCompiler','--root',$moonRoot,'--sources',$moonZip,'--out',(Join-Path $moonRun 'compile'),'--mode','compile','--release','17','--debug','all','--unreadable','fail')

    foreach($moonProvider in $moonProviders){$moonArgs+=@('--classpath',(Join-Path $moonRoot $moonProvider.path))}

    if($moonEnumSymbol){$moonArgs+=@('--classpath',$moonEnumSymbol)}

    [ordered]@{schema=2;compiler=$moonJavac;compiler_sha256=(Get-FileHash $moonJavac -Algorithm SHA256).Hash;java=$moonJava;version=$moonVersion;tool_javac_argv=@('@'+$moonArgfile);java_argv=$moonArgs;source_count=$moonUnits.Count;source_index_sha256=(Get-FileHash $moonIndexPath -Algorithm SHA256).Hash;sources_zip_sha256=(Get-FileHash $moonZip -Algorithm SHA256).Hash;sourcepath='Explicit in-memory source ZIP; ambient sourcepath empty';classpath=@($moonProviders.path);annotation_processing=$false;cleared_environment=@($moonSaved.Keys)}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'COMMAND.json') -Encoding utf8

    & $moonJava @moonArgs 1>(Join-Path $moonRun 'compile.stdout.txt') 2>(Join-Path $moonRun 'compile.stderr.txt')

    $moonExit=$LASTEXITCODE

    [ordered]@{schema=2;javac_exit=$moonExit;source_count=$moonUnits.Count;run=$moonRun}|ConvertTo-Json|Set-Content (Join-Path $moonRun 'RESULT.json') -Encoding utf8

    if($moonExit -ne 0){throw "Source javac failed ($moonExit); evidence: $moonRun/compile"}

    $moonResult=Get-Content (Join-Path $moonRun 'compile/result.json') -Raw|ConvertFrom-Json

    $moonReceipt=[ordered]@{schema=2;javac_exit=0;source_count=$moonUnits.Count;class_count=$moonResult.class_count;archive=$moonResult.output_jar;archive_sha256=$moonResult.output_sha256;run=$moonRun}

    if($SourceOnly){

        $moonSourceOnlyArchive=Join-Path $moonRoot 'build/libs/openmoon-source-only.jar'
        $moonSourceOnlyCheck=Test-MoonSourceOnlyArchive $moonReceipt.archive 'moom/iP.class'
        $moonResourcePath=Join-Path $moonRoot 'vendor/resources/original-resources.jar'
        $moonResourceRow=@($moonLock.resources|Where-Object {$_.path -eq 'vendor/resources/original-resources.jar'})|Select-Object -First 1
        if(-not $moonResourceRow -or -not (Test-Path -LiteralPath $moonResourcePath -PathType Leaf)){throw 'Reassembled original resource archive is missing.'}
        $moonResourceSha=(Get-FileHash $moonResourcePath -Algorithm SHA256).Hash
        if($moonResourceSha -ne $moonResourceRow.sha256){throw "Reassembled resource SHA mismatch: $moonResourceSha"}
        $moonResourceCheck=Test-MoonResourceArchive $moonResourcePath ([int]$moonResourceRow.entries)
        New-Item -ItemType Directory -Force -Path (Split-Path -Parent $moonSourceOnlyArchive)|Out-Null
        Copy-Item -LiteralPath $moonReceipt.archive -Destination $moonSourceOnlyArchive -Force
        $moonSourceOnlyArchiveSha=(Get-FileHash $moonSourceOnlyArchive -Algorithm SHA256).Hash
        $moonSourceOnlyResult=[ordered]@{
            schema=1
            mode='source-only'
            status='passed'
            source_count=$moonUnits.Count
            class_count=$moonResult.class_count
            javac_exit=0
            archive=$moonSourceOnlyArchive
            archive_sha256=$moonSourceOnlyArchiveSha
            compile_run=$moonRun
            source_index_sha256=(Get-FileHash $moonIndexPath -Algorithm SHA256).Hash
            provider_count=$moonProviders.Count
            resource_archive=$moonResourcePath
            resource_archive_sha256=$moonResourceSha
            resource_check=$moonResourceCheck
            archive_check=$moonSourceOnlyCheck
            compile_only_enum_symbol_generated=($null -ne $moonEnumSymbol)
            postcompile_stages_skipped=@('constructor','enum','handler','intrinsic','abi','declaration','final-audit')
            exact_recovery_audit_available='Run build.ps1 without -SourceOnly; its result is independent of this source-only artifact.'
        }
        $moonSourceOnlyResult|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRoot 'build/SOURCE_ONLY_RESULT.json') -Encoding utf8
        Write-Output $moonSourceOnlyArchive
        return

    }

    $moonCtorPlanPath=if($ConstructorPlan){if([IO.Path]::IsPathRooted($ConstructorPlan)){$ConstructorPlan}else{Join-Path $moonRoot $ConstructorPlan}}else{$null}

    if($moonCtorPlanPath -and (Test-Path -LiteralPath $moonCtorPlanPath)){

        $moonCtorArchive=Join-Path $moonRun 'constructor-classes.jar'

        $moonCtorArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'ConstructorSourceAdapter',$moonReceipt.archive,$moonCtorPlanPath,$moonCtorArchive)

        if($moonEnumPlanPath -and (Test-Path -LiteralPath $moonEnumPlanPath)){$moonCtorArgs+=@('--enum-plan',$moonEnumPlanPath)}

        $moonCtorArgs+=@($moonProviders|ForEach-Object{Join-Path $moonRoot $_.path})

        if($moonEnumSymbol){$moonCtorArgs+=$moonEnumSymbol}

        [ordered]@{schema=1;argv=$moonCtorArgs;plan_sha256=(Get-FileHash $moonCtorPlanPath -Algorithm SHA256).Hash;fresh_archive_sha256=$moonReceipt.archive_sha256;tool_source_sha256=(Get-FileHash (Join-Path $moonRoot 'build-tools/ConstructorSourceAdapter.java') -Algorithm SHA256).Hash}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'CONSTRUCTOR_COMMAND.json') -Encoding utf8

        & $moonJava @moonCtorArgs 1>(Join-Path $moonRun 'constructor.stdout.json') 2>(Join-Path $moonRun 'constructor.stderr.txt')

        $moonCtorExit=$LASTEXITCODE

        if($moonCtorExit -ne 0){[ordered]@{constructor_exit=$moonCtorExit;run=$moonRun}|ConvertTo-Json|Set-Content (Join-Path $moonRun 'CONSTRUCTOR_RESULT.json');throw "Constructor source adapter failed ($moonCtorExit); evidence: $moonRun"}

        $moonReceipt.raw_archive=$moonReceipt.archive;$moonReceipt.raw_archive_sha256=$moonReceipt.archive_sha256

        $moonReceipt.archive=$moonCtorArchive;$moonReceipt.archive_sha256=(Get-FileHash $moonCtorArchive -Algorithm SHA256).Hash

        $moonReceipt.constructor_exit=0;$moonReceipt.constructor_plan_sha256=(Get-FileHash $moonCtorPlanPath -Algorithm SHA256).Hash

        $moonReceipt.class_count=(Get-Content (Join-Path $moonRun 'constructor.stdout.json') -Raw|ConvertFrom-Json).output_entries

    }

    if($moonEnumPlanPath -and (Test-Path -LiteralPath $moonEnumPlanPath)){

        $moonEnumArchive=Join-Path $moonRun 'enum-classes.jar'

        $moonEnumAbiPlanPath=if($AbiPlan){if([IO.Path]::IsPathRooted($AbiPlan)){$AbiPlan}else{Join-Path $moonRoot $AbiPlan}}else{$null}
        $moonEnumArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'EnumSourceAdapter',$moonReceipt.archive,$moonEnumPlanPath,$moonEnumArchive,(Join-Path $moonRun 'ENUM_RESULT.json'))
        if($moonEnumAbiPlanPath -and (Test-Path -LiteralPath $moonEnumAbiPlanPath)){$moonEnumArgs+=@($moonEnumAbiPlanPath)}

        [ordered]@{argv=$moonEnumArgs;plan_sha256=(Get-FileHash $moonEnumPlanPath -Algorithm SHA256).Hash;input_archive_sha256=$moonReceipt.archive_sha256;compile_only_symbol_sha256=(Get-FileHash $moonEnumSymbol -Algorithm SHA256).Hash;abi_alias_plan_sha256=if($moonEnumAbiPlanPath -and (Test-Path -LiteralPath $moonEnumAbiPlanPath)){(Get-FileHash $moonEnumAbiPlanPath -Algorithm SHA256).Hash}else{$null}}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'ENUM_COMMAND.json') -Encoding utf8

        & $moonJava @moonEnumArgs 1>(Join-Path $moonRun 'enum.stdout.json') 2>(Join-Path $moonRun 'enum.stderr.txt')

        if($LASTEXITCODE -ne 0){throw "Enum source adapter failed; evidence: $moonRun"}

        if($moonReceipt.Contains('constructor_exit')){$moonReceipt.constructor_archive=$moonReceipt.archive;$moonReceipt.constructor_archive_sha256=$moonReceipt.archive_sha256}

        else{$moonReceipt.raw_archive=$moonReceipt.archive;$moonReceipt.raw_archive_sha256=$moonReceipt.archive_sha256}

        $moonReceipt.archive=$moonEnumArchive;$moonReceipt.archive_sha256=(Get-FileHash $moonEnumArchive -Algorithm SHA256).Hash

        $moonReceipt.enum_exit=0;$moonReceipt.enum_plan_sha256=(Get-FileHash $moonEnumPlanPath -Algorithm SHA256).Hash

    }

    $moonHandlerPlanPath=if($HandlerPlan){if([IO.Path]::IsPathRooted($HandlerPlan)){$HandlerPlan}else{Join-Path $moonRoot $HandlerPlan}}else{$null}

    if($moonHandlerPlanPath -and (Test-Path -LiteralPath $moonHandlerPlanPath)){

        $moonHandlerArchive=Join-Path $moonRun 'handler-classes.jar'

        $moonHandlerArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'PortableHandlerAdapter',$moonReceipt.archive,$moonHandlerPlanPath,$moonHandlerArchive,(Join-Path $moonRun 'HANDLER_RESULT.json'),(Join-Path $moonRoot 'build-tools/declarations.json'))

        $moonHandlerArgs+=@($moonProviders|ForEach-Object{Join-Path $moonRoot $_.path})

        [ordered]@{schema=1;argv=$moonHandlerArgs;plan_sha256=(Get-FileHash $moonHandlerPlanPath -Algorithm SHA256).Hash;input_archive_sha256=$moonReceipt.archive_sha256;tool_source_sha256=(Get-FileHash (Join-Path $moonRoot 'build-tools/PortableHandlerAdapter.java') -Algorithm SHA256).Hash;tool_javac=(Get-Content $moonArgfile -Raw);build_only_tools=@($moonToolLock.tools);fresh_generator_sources=@($moonToolLock.sources);Code_free_declarations=@($moonToolLock.metadata);toolkit_role='tracked generator sources compiled fresh take classpath priority over 149 fixed binary build tools; no owned client implementation or historical comparison main; never runtime classpath'}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'HANDLER_COMMAND.json') -Encoding utf8

        & $moonJava @moonHandlerArgs 1>(Join-Path $moonRun 'handler.stdout.json') 2>(Join-Path $moonRun 'handler.stderr.txt')

        $moonHandlerExit=$LASTEXITCODE

        if($moonHandlerExit -ne 0){[ordered]@{handler_exit=$moonHandlerExit;run=$moonRun}|ConvertTo-Json|Set-Content (Join-Path $moonRun 'HANDLER_FAILURE.json') -Encoding utf8;throw "Source handler adapter failed ($moonHandlerExit); evidence: $moonRun"}

        if($moonReceipt.Contains('enum_exit')){$moonReceipt.enum_archive=$moonReceipt.archive;$moonReceipt.enum_archive_sha256=$moonReceipt.archive_sha256}

        elseif($moonReceipt.Contains('constructor_exit')){$moonReceipt.constructor_archive=$moonReceipt.archive;$moonReceipt.constructor_archive_sha256=$moonReceipt.archive_sha256}

        else{$moonReceipt.raw_archive=$moonReceipt.archive;$moonReceipt.raw_archive_sha256=$moonReceipt.archive_sha256}

        $moonReceipt.archive=$moonHandlerArchive;$moonReceipt.archive_sha256=(Get-FileHash $moonHandlerArchive -Algorithm SHA256).Hash

        $moonReceipt.handler_exit=0;$moonReceipt.handler_plan_sha256=(Get-FileHash $moonHandlerPlanPath -Algorithm SHA256).Hash

        $moonReceipt.class_count=(Get-Content (Join-Path $moonRun 'HANDLER_RESULT.json') -Raw|ConvertFrom-Json).output_entries

    }

    $moonPlanPath=if($IntrinsicPlan){if([IO.Path]::IsPathRooted($IntrinsicPlan)){$IntrinsicPlan}else{Join-Path $moonRoot $IntrinsicPlan}}else{$null}

    if($moonPlanPath -and (Test-Path -LiteralPath $moonPlanPath)){

        $moonAdapted=Join-Path $moonRun 'runtime-classes.jar'

        $moonAdapterArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'SourceIntrinsicAdapter',$moonReceipt.archive,$moonPlanPath,$moonAdapted)
        $moonHandlerResultPath=Join-Path $moonRun 'HANDLER_RESULT.json'
        if($moonHandlerPlanPath -and (Test-Path -LiteralPath $moonHandlerPlanPath) -and (Test-Path -LiteralPath $moonHandlerResultPath)){$moonAdapterArgs+=@($moonHandlerPlanPath,$moonHandlerResultPath)}

        [ordered]@{schema=1;argv=$moonAdapterArgs;plan_sha256=(Get-FileHash $moonPlanPath -Algorithm SHA256).Hash;fresh_archive_sha256=$moonResult.output_sha256;adapter_source_sha256=(Get-FileHash (Join-Path $moonRoot 'build-tools/SourceIntrinsicAdapter.java') -Algorithm SHA256).Hash;build_only_tools=@($moonToolLock.tools)}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'ADAPTER_COMMAND.json') -Encoding utf8

        & $moonJava @moonAdapterArgs 1>(Join-Path $moonRun 'adapter.stdout.json') 2>(Join-Path $moonRun 'adapter.stderr.txt')

        $moonAdapterExit=$LASTEXITCODE

        if($moonAdapterExit -ne 0){[ordered]@{adapter_exit=$moonAdapterExit;run=$moonRun}|ConvertTo-Json|Set-Content (Join-Path $moonRun 'ADAPTER_RESULT.json');throw "Source intrinsic adapter failed ($moonAdapterExit); evidence: $moonRun"}

        if($moonReceipt.Contains('handler_exit')){$moonReceipt.handler_archive=$moonReceipt.archive;$moonReceipt.handler_archive_sha256=$moonReceipt.archive_sha256}

        elseif($moonReceipt.Contains('enum_exit')){$moonReceipt.enum_archive=$moonReceipt.archive;$moonReceipt.enum_archive_sha256=$moonReceipt.archive_sha256}

        elseif($moonReceipt.Contains('constructor_exit')){$moonReceipt.constructor_archive=$moonReceipt.archive;$moonReceipt.constructor_archive_sha256=$moonReceipt.archive_sha256}

        else{$moonReceipt.raw_archive=$moonReceipt.archive;$moonReceipt.raw_archive_sha256=$moonReceipt.archive_sha256}

        $moonReceipt.archive=$moonAdapted;$moonReceipt.archive_sha256=(Get-FileHash $moonAdapted -Algorithm SHA256).Hash

        $moonReceipt.adapter_exit=0;$moonReceipt.intrinsic_plan_sha256=(Get-FileHash $moonPlanPath -Algorithm SHA256).Hash

        $moonAdapterResult=Get-Content (Join-Path $moonRun 'adapter.stdout.json') -Raw|ConvertFrom-Json

        $moonReceipt.class_count=$moonAdapterResult.output_entries

    }

    $moonAbiPlanPath=if($AbiPlan){if([IO.Path]::IsPathRooted($AbiPlan)){$AbiPlan}else{Join-Path $moonRoot $AbiPlan}}else{$null}

    if($moonAbiPlanPath -and (Test-Path -LiteralPath $moonAbiPlanPath)){

        $moonAbiArchive=Join-Path $moonRun 'abi-classes.jar'

        $moonAbiArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'SourceAbiAdapter',$moonReceipt.archive,$moonAbiPlanPath,$moonAbiArchive,(Join-Path $moonRun 'ABI_RESULT.json'),(Join-Path $moonRoot 'build-tools/declarations.json'))

        [ordered]@{schema=1;argv=$moonAbiArgs;input_archive_sha256=$moonReceipt.archive_sha256;plan_sha256=(Get-FileHash $moonAbiPlanPath -Algorithm SHA256).Hash;tool_source_sha256=(Get-FileHash (Join-Path $moonRoot 'build-tools/SourceAbiAdapter.java') -Algorithm SHA256).Hash;metadata=@($moonToolLock.metadata);build_only_tools=@($moonToolLock.tools)}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'ABI_COMMAND.json') -Encoding utf8

        & $moonJava @moonAbiArgs 1>(Join-Path $moonRun 'abi.stdout.json') 2>(Join-Path $moonRun 'abi.stderr.txt')

        $moonAbiExit=$LASTEXITCODE

        if($moonAbiExit -ne 0){@{abi_exit=$moonAbiExit;run=$moonRun}|ConvertTo-Json|Set-Content (Join-Path $moonRun 'ABI_FAILURE.json');throw "Source ABI adapter failed ($moonAbiExit); evidence: $moonRun"}

        if($moonReceipt.Contains('adapter_exit')){$moonReceipt.intrinsic_archive=$moonReceipt.archive;$moonReceipt.intrinsic_archive_sha256=$moonReceipt.archive_sha256}

        elseif($moonReceipt.Contains('handler_exit')){$moonReceipt.handler_archive=$moonReceipt.archive;$moonReceipt.handler_archive_sha256=$moonReceipt.archive_sha256}

        elseif($moonReceipt.Contains('enum_exit')){$moonReceipt.enum_archive=$moonReceipt.archive;$moonReceipt.enum_archive_sha256=$moonReceipt.archive_sha256}

        elseif($moonReceipt.Contains('constructor_exit')){$moonReceipt.constructor_archive=$moonReceipt.archive;$moonReceipt.constructor_archive_sha256=$moonReceipt.archive_sha256}

        else{$moonReceipt.raw_archive=$moonReceipt.archive;$moonReceipt.raw_archive_sha256=$moonReceipt.archive_sha256}

        $moonReceipt.archive=$moonAbiArchive;$moonReceipt.archive_sha256=(Get-FileHash $moonAbiArchive -Algorithm SHA256).Hash;$moonReceipt.abi_exit=0;$moonReceipt.abi_plan_sha256=(Get-FileHash $moonAbiPlanPath -Algorithm SHA256).Hash

        $moonReceipt.class_count=(Get-Content (Join-Path $moonRun 'ABI_RESULT.json') -Raw|ConvertFrom-Json).output_entries

    }

    $moonDeclaredArchive=Join-Path $moonRun 'declaration-restored-classes.jar'

    $moonDeclarationArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'SourceDeclarationAdapter',$moonReceipt.archive,(Join-Path $moonRoot 'build-tools/declarations.json'),$moonDeclaredArchive,(Join-Path $moonRun 'DECLARATION_RESULT.json'),(Join-Path $moonRoot 'build-tools/runtime-declarations.json'))+@($moonProviders|ForEach-Object {Join-Path $moonRoot $_.path})

    [ordered]@{argv=$moonDeclarationArgs;fresh_archive_sha256=$moonReceipt.archive_sha256;metadata_sha256=(Get-FileHash (Join-Path $moonRoot 'build-tools/declarations.json') -Algorithm SHA256).Hash;compile_only_access_view_must_not_ship=$true}|ConvertTo-Json -Depth 5|Set-Content (Join-Path $moonRun 'DECLARATION_COMMAND.json') -Encoding utf8

    & $moonJava @moonDeclarationArgs 1>(Join-Path $moonRun 'declaration.stdout.json') 2>(Join-Path $moonRun 'declaration.stderr.txt')

    if($LASTEXITCODE -ne 0){throw "Declaration flags/coverage restoration failed; evidence: $moonRun"}

    $moonReceipt.pre_declaration_archive=$moonReceipt.archive;$moonReceipt.archive=$moonDeclaredArchive;$moonReceipt.archive_sha256=(Get-FileHash $moonDeclaredArchive -Algorithm SHA256).Hash;$moonReceipt.declaration_restore_exit=0

    & $moonJava '-classpath' ($moonTools+[IO.Path]::PathSeparator+$moonToolCp) 'SourceAbiAdapter' '--validate-final' $moonReceipt.archive 1>(Join-Path $moonRun 'abi-final-check.stdout.json') 2>(Join-Path $moonRun 'abi-final-check.stderr.txt')

    if($LASTEXITCODE -ne 0){throw "Unmapped source ABI initializer remains; evidence: $moonRun"}

    & $moonJava '-classpath' ($moonTools+[IO.Path]::PathSeparator+$moonToolCp) 'ConstructorSourceAdapter' '--validate-final' $moonReceipt.archive 1>(Join-Path $moonRun 'constructor-final-check.stdout.json') 2>(Join-Path $moonRun 'constructor-final-check.stderr.txt')

    if($LASTEXITCODE -ne 0){throw "Unadapted compile-only constructor intermediates remain; evidence: $moonRun"}

    & $moonJava '-classpath' ($moonTools+[IO.Path]::PathSeparator+$moonToolCp) 'EnumSourceAdapter' '--validate-final' $moonReceipt.archive 1>(Join-Path $moonRun 'enum-final-check.stdout.json') 2>(Join-Path $moonRun 'enum-final-check.stderr.txt')

    if($LASTEXITCODE -ne 0){throw "Unadapted enum carrier/compiler symbol remains; evidence: $moonRun"}

    $moonHandlerFinalArgs=@('-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'PortableHandlerAdapter','--validate-final',$moonReceipt.archive,(Join-Path $moonRoot 'ABI_ALIAS_PLAN.json'))

    [ordered]@{argv=$moonHandlerFinalArgs;archive_sha256=$moonReceipt.archive_sha256;handler_tool_source_sha256=(Get-FileHash (Join-Path $moonRoot 'build-tools/PortableHandlerAdapter.java') -Algorithm SHA256).Hash;build_only_tools=@($moonToolLock.tools)}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'HANDLER_FINAL_CHECK_COMMAND.json') -Encoding utf8

    & $moonJava @moonHandlerFinalArgs 1>(Join-Path $moonRun 'handler-final-check.stdout.json') 2>(Join-Path $moonRun 'handler-final-check.stderr.txt')

    if($LASTEXITCODE -ne 0){throw "Unadapted handler/native/carrier compilation intermediary remains; evidence: $moonRun"}

    & $moonJava '-classpath' ($moonTools+[IO.Path]::PathSeparator+$moonToolCp) 'SourceIntrinsicAdapter' '--validate-final' $moonReceipt.archive 1>(Join-Path $moonRun 'intrinsic-final-check.stdout.json') 2>(Join-Path $moonRun 'intrinsic-final-check.stderr.txt')

    if($LASTEXITCODE -ne 0){throw "Compiler scalar helper remains; evidence: $moonRun"}
    $moonAuditArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'FinalArchiveAudit',$moonReceipt.archive,(Join-Path $moonRoot 'build-tools/declarations.json'),(Join-Path $moonRun 'DECLARATION_RESULT.json'),(Join-Path $moonRun 'FINAL_AUDIT.json'))+@($moonProviders|ForEach-Object {Join-Path $moonRoot $_.path})
    [ordered]@{argv=$moonAuditArgs;input_archive_sha256=$moonReceipt.archive_sha256;ordered_providers=@($moonProviders);audit_source_sha256=(Get-FileHash (Join-Path $moonRoot 'build-tools/FinalArchiveAudit.java') -Algorithm SHA256).Hash}|ConvertTo-Json -Depth 8|Set-Content (Join-Path $moonRun 'FINAL_AUDIT_COMMAND.json') -Encoding utf8
    & $moonJava @moonAuditArgs 1>(Join-Path $moonRun 'final-audit.stdout.txt') 2>(Join-Path $moonRun 'final-audit.stderr.txt')
    if($LASTEXITCODE -ne 0){throw "Final owned identity/declaration/bytecode audit failed; evidence: $moonRun"}

    $moonDeliveryRoot=Join-Path $moonRun 'delivery'
    $moonDeliveryArgs=@('-Xmx6g','-classpath',($moonTools+[IO.Path]::PathSeparator+$moonToolCp),'ClientDelivery',$moonRoot,$moonReceipt.archive,(Join-Path $moonRun 'DECLARATION_RESULT.json'),$moonDeliveryRoot)
    [ordered]@{argv=$moonDeliveryArgs;source_S_sha256=$moonReceipt.archive_sha256}|ConvertTo-Json -Depth 6|Set-Content (Join-Path $moonRun 'CLIENT_DELIVERY_COMMAND.json') -Encoding utf8
    & $moonJava @moonDeliveryArgs 1>(Join-Path $moonRun 'client-delivery.stdout') 2>(Join-Path $moonRun 'client-delivery.stderr')
    if($LASTEXITCODE -ne 0){throw "Final runtime client delivery validation failed; evidence: $moonRun"}
    $moonDelivery=Get-Content (Join-Path $moonDeliveryRoot 'CLIENT_DELIVERY.json') -Raw|ConvertFrom-Json
    $moonReceipt.source_archive=$moonReceipt.archive;$moonReceipt.source_archive_sha256=$moonReceipt.archive_sha256
    $moonReceipt.archive=$moonDelivery.client_archive;$moonReceipt.archive_sha256=$moonDelivery.client_sha256
    $moonReceipt.runtime_archive=$moonDelivery.runtime_R_archive;$moonReceipt.runtime_archive_sha256=$moonDelivery.runtime_R_sha256
    $moonReceipt.client_delivery=(Join-Path $moonDeliveryRoot 'CLIENT_DELIVERY.json');$moonReceipt.client_JVM_failures=$moonDelivery.JVM_client_failures;$moonReceipt.client_static_member_failures=$moonDelivery.static_member_failures

    $moonReceipt|ConvertTo-Json|Set-Content (Join-Path $moonRun 'RESULT.json') -Encoding utf8

    if(-not $SkipLastSuccess){
        $moonReceipt|ConvertTo-Json|Set-Content (Join-Path $moonRoot 'build/LAST_SUCCESS.json') -Encoding utf8
        $moonDist=Join-Path $moonRoot 'dist';New-Item -ItemType Directory -Force -Path $moonDist|Out-Null
        Copy-Item -LiteralPath (Join-Path $moonDeliveryRoot 'openmoon-client.jar') -Destination $moonDist -Force
        Copy-Item -LiteralPath (Join-Path $moonDeliveryRoot 'lib') -Destination $moonDist -Recurse -Force
        Copy-Item -LiteralPath (Join-Path $moonDeliveryRoot 'CLIENT_DELIVERY.json') -Destination $moonDist -Force
        Copy-Item -LiteralPath (Join-Path $moonDeliveryRoot 'JVM_CLIENT.json') -Destination $moonDist -Force
        Copy-Item -LiteralPath (Join-Path $moonDeliveryRoot 'RUNTIME_IDENTITY.json') -Destination $moonDist -Force
        Copy-Item -LiteralPath (Join-Path $moonDeliveryRoot 'RUNTIME_MEMBER_CLOSURE.json') -Destination $moonDist -Force
    }

    $moonReceipt.archive

}finally{foreach($moonName in $moonSaved.Keys){

    if($null -eq $moonSaved[$moonName]){Remove-Item -LiteralPath ('Env:'+$moonName) -ErrorAction SilentlyContinue}

    else{[Environment]::SetEnvironmentVariable($moonName,$moonSaved[$moonName],'Process')}

}}

