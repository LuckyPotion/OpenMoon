param([string]$JavaHome = $env:JAVA_HOME, [string[]]$Tasks = @('build'))
$ErrorActionPreference = 'Stop'
$moonSavedEnv = @{}
foreach ($moonName in @('JAVA_TOOL_OPTIONS','_JAVA_OPTIONS','JDK_JAVA_OPTIONS','CLASSPATH')) {
    $moonSavedEnv[$moonName] = [Environment]::GetEnvironmentVariable($moonName,'Process')
    Remove-Item -LiteralPath ('Env:'+$moonName) -ErrorAction SilentlyContinue
}
$moonSavedJava = $env:JAVA_HOME
try {
    if ($JavaHome) { $env:JAVA_HOME = $JavaHome }
    Push-Location $PSScriptRoot
    try { & (Join-Path $PSScriptRoot 'gradlew.bat') '--no-daemon' @Tasks; $moonExit = $LASTEXITCODE } finally { Pop-Location }
    if ($moonExit -ne 0) { throw "Gradle failed: $moonExit" }
} finally {
    $env:JAVA_HOME = $moonSavedJava
    foreach ($moonName in $moonSavedEnv.Keys) {
        if ($null -eq $moonSavedEnv[$moonName]) { Remove-Item -LiteralPath ('Env:'+$moonName) -ErrorAction SilentlyContinue }
        else { [Environment]::SetEnvironmentVariable($moonName,$moonSavedEnv[$moonName],'Process') }
    }
}
