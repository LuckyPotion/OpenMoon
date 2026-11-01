# OpenMoon

Independent Moon client source recovery with a source-derived runtime JAR. The repository includes all selected Java sources, recovery adapters, fixed external providers, Code-free metadata and split original resources required by the build. External source repositories are references only; their source is not imported.

[中文说明](README.zh-CN.md) · [Runtime setup](RUNNING.md) · [Recovery details](docs/RECOVERY_JOURNEY.zh-CN.md) · [Validation](docs/BUILD_VALIDATION.json)

## Build

Use JDK 17 and PowerShell 7 on Windows:

```powershell
./build.ps1 -JavaHome 'C:/path/to/jdk-17'
```

Or use the pinned Gradle wrapper and JDK 17:

```powershell
./gradle-build.ps1 -JavaHome 'C:/path/to/jdk-17' -Tasks @('build', '--offline')
```

On Linux/macOS select JDK 17 and use `./gradlew build --offline`. Clear `JAVA_TOOL_OPTIONS`, `_JAVA_OPTIONS`, `JDK_JAVA_OPTIONS` and `CLASSPATH` when invoking Gradle directly. The Windows wrappers isolate and restore those variables. Only Windows is covered by the recorded build runs.

Successful full builds produce:

| Output | Purpose |
|---|---|
| `dist/openmoon-client.jar` | Source-derived R classes, all 5152 original resource entries, explicit `moom.iP` main |
| `dist/lib/` | 40 SHA-locked runtime providers in manifest order; keep beside the JAR |
| `build/runs/<id>/` | Fresh compiler/adapters, source and runtime audits, JVM verification and packaging receipts |

The JAR is a client delivery artifact, not the old SourceOnly compilation snapshot. `-SourceOnly` remains a diagnostic mode and does not produce an accepted client delivery.

## What the build verifies

4097 selected source units cover 4093 owned identities. The build preserves case-sensitive names through indexed source ZIPs and writes class output directly into JARs, supporting case-insensitive file systems.

JDK 17 compilation uses the documented narrow JVM checked-exception source policy; ordinary strict javac acceptance is not claimed. Fresh constructor, enum, handler, intrinsic, ABI and declaration stages are followed by the final source archive audit and an evidenced S-to-R namespace projection.

The runtime projection preserves all 48329 original source declarations. Of 1198 explicitly proved added source forwarders, 764 map onto existing original R slots and are coalesced; 434 remain separately accounted for. The coalescence check covers 765 owned receiver cases. All original class/member access flags and sealed permits are retained. Twenty-three non-static ConstantValue attributes are restored from Code-free original R metadata. JDK17 output retains 13 class-version differences from the original R headers.

An independent Code-free audit checks the 3911 original R owners, 23419 fields and 47965 methods; 182 source-generated helper owners remain explicitly separate. Both the class archive and the fully packaged JAR must pass `-Xverify:all` loading/declaration queries for all 4093 owned classes. No client initializer or client main is invoked by the build.

## Recorded final validation

PowerShell and Gradle each completed a new full selected-source build on Windows / JDK 17.0.12. The source S, runtime R and client JAR hashes match across both entrypoints; every locked input remained unchanged. The Gradle application ZIP also contains the verified client plus all 40 runtime providers, with both start scripts checked.

The runtime static member gate checks 354237 method instructions, 158393 field instructions and 38987 method-handle sites, with zero failures or unresolved header types. It prevents packaging if a member is missing. Twenty-two enum compiler-helper renames now update their 44 field and 22 method references together; an independent 4093-class comparison found no unrelated ASM structure changes. A negative control rejects all 66 known pre-fix missing references before packaging. This static gate does not execute arbitrary bootstraps, prove protected receiver values or establish business behavior.

Final client SHA-256: `14EAE7DAF15299AFC1A3A61F8A382A9147323125A0F9679202B8F5F05B34CD9D`. See `docs/BUILD_VALIDATION.json` and `docs/validation/FRESH_SOURCE_REPLAYS.json` for actual counters and replay boundaries.

## Inputs and provenance

`vendor/DEPENDENCIES.lock.json` retains the original 39 compiler-query providers. `vendor/RUNTIME_DEPENDENCIES.lock.json` appends the authenticated original external runtime closure as provider 39, giving 40 runtime providers without replacing or reordering the original 39.

`vendor/BUILD_TOOLS.lock.json` pins build tools, source adapters, metadata and plans. The six resource parts reconstruct the exact original 5152-entry resource archive using Java 17; the assembled resource JAR and generated client distribution are ignored by Git. No captured key, original encrypted client archive or external workspace is required to build the checked-in source.

Historical machine locator leaves in handler recipes use logical provenance IDs. Their hashes and the transformation ledger remain in `docs/provenance/PORTABLE_RECIPES.json`; source, AST, instruction and opaque string payloads are preserved. Historical formal acceptance evidence is not rewritten.

## Run and remaining acceptance

Use the real local assets, native libraries and authenticated session settings described in [RUNNING.md](RUNNING.md). Keep `dist/lib` next to the JAR. The generated manifest points to the recovered `moom.iP` entry, rather than claiming that the historical Launcher/Bootstrap/Start chain has been restored.

Functional game/module/rendering/network/Via acceptance is performed manually by the user. Build, metadata and noninitializing JVM checks do not claim complete native/services behavior or arbitrary-state equivalence. The original `moom/lN` forwarding self-cycle is retained because it also exists in the formal S comparison; it is not silently repaired. Existing S/R difference contracts remain documented.

See [third-party notices](docs/THIRD_PARTY.md) before redistributing bundled materials. The recovered client and its dependencies retain their respective licensing terms; this repository does not grant a new MIT license to the original client.
