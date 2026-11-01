# OpenMoon

Standalone Moon client source project, built with JDK 17.

[中文](README.zh-CN.md) · [Run configuration](RUNNING.md) · [Third-party notices](docs/THIRD_PARTY.md)

## Build

On Windows, use JDK 17 (tested with 17.0.12) and PowerShell 7:

```powershell
./build.ps1 -JavaHome 'C:/path/to/jdk-17'
```

Or use the Gradle wrapper:

```powershell
./gradle-build.ps1 -JavaHome 'C:/path/to/jdk-17' -Tasks @('build', '--offline')
```

With JDK 17 selected, run `./gradlew.bat build --offline` on Windows or `./gradlew build --offline` on Unix.

The build scripts handle source adaptation, validation and packaging. Output:

| Path | Contents |
|---|---|
| `dist/openmoon-client.jar` | Client JAR |
| `dist/lib/` | Runtime dependencies; keep beside the JAR |
| `build/runs/` | Build logs and validation results |

## Run

Copy `run.example.json` to `run.local.json`, then configure the game directory, assets, native libraries and session arguments. See [RUNNING.md](RUNNING.md).

```powershell
./run.ps1 -JavaHome 'C:/path/to/jdk-17'
```

## Layout

| Path | Purpose |
|---|---|
| `src/` | Java sources |
| `build-tools/` | Compiler adapters and build checks |
| `vendor/` | Pinned dependencies and resource parts |
| `source-units.json`, `*_PLAN.json` | Source index and build plans |
