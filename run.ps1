param([string]$JavaHome = $env:JAVA_HOME, [string]$Profile = 'run.local.json')
$ErrorActionPreference = 'Stop'
$moonRoot = $PSScriptRoot
$moonSavedEnv = @{}
foreach ($moonName in @('JAVA_TOOL_OPTIONS','_JAVA_OPTIONS','JDK_JAVA_OPTIONS','CLASSPATH')) {
    $moonSavedEnv[$moonName] = [Environment]::GetEnvironmentVariable($moonName,'Process')
    Remove-Item -LiteralPath ('Env:'+$moonName) -ErrorAction SilentlyContinue
}
try {
    if ($JavaHome) { $moonJava = Join-Path $JavaHome 'bin/java.exe' } else { $moonJava = (Get-Command java -ErrorAction Stop).Source }
    $moonProfilePath = if ([IO.Path]::IsPathRooted($Profile)) { $Profile } else { Join-Path $moonRoot $Profile }
    if (-not (Test-Path -LiteralPath $moonProfilePath)) { throw 'Create ignored run.local.json using run.example.json and RUNNING.md.' }
    $moonConfig = Get-Content -LiteralPath $moonProfilePath -Raw | ConvertFrom-Json
    if (-not $moonConfig.mainClass -or @($moonConfig.programArguments).Count -eq 0) { throw 'A confirmed main class and actual runtime arguments are required; see RUNNING.md.' }
    & (Join-Path $moonRoot 'build.ps1') -JavaHome $JavaHome -VerifyOnly
    $moonLatest = Get-Content -LiteralPath (Join-Path $moonRoot 'build/LAST_SUCCESS.json') -Raw | ConvertFrom-Json
    if ((Get-FileHash $moonLatest.archive -Algorithm SHA256).Hash -ne $moonLatest.archive_sha256) { throw 'Built archive SHA mismatch.' }
    $moonLock = Get-Content -LiteralPath (Join-Path $moonRoot 'vendor/RUNTIME_DEPENDENCIES.lock.json') -Raw | ConvertFrom-Json
    $moonClasspath = @($moonLatest.archive)
    $moonClasspath += @($moonLock.providers | Sort-Object index | ForEach-Object { Join-Path $moonRoot $_.path })
    $moonClasspath += @($moonLock.resources | ForEach-Object { Join-Path $moonRoot $_.path })
    $moonWork = if ([IO.Path]::IsPathRooted($moonConfig.workingDirectory)) { $moonConfig.workingDirectory } else { Join-Path $moonRoot $moonConfig.workingDirectory }
    New-Item -ItemType Directory -Force -Path $moonWork | Out-Null
    $moonArgs = @($moonConfig.jvmArguments)
    if ($moonConfig.nativeDirectory) { $moonArgs += '-Djava.library.path='+$moonConfig.nativeDirectory }
    $moonArgs += @('-classpath',($moonClasspath -join [IO.Path]::PathSeparator),$moonConfig.mainClass)
    $moonArgs += @($moonConfig.programArguments)
    Push-Location $moonWork
    try { & $moonJava @moonArgs; $moonExit = $LASTEXITCODE } finally { Pop-Location }
    if ($moonExit -ne 0) { throw "Client exited: $moonExit" }
} finally {
    foreach ($moonName in $moonSavedEnv.Keys) {
        if ($null -eq $moonSavedEnv[$moonName]) { Remove-Item -LiteralPath ('Env:'+$moonName) -ErrorAction SilentlyContinue }
        else { [Environment]::SetEnvironmentVariable($moonName,$moonSavedEnv[$moonName],'Process') }
    }
}
