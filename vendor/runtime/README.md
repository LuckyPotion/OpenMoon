# Runtime dependency slice

`35-authentic-external-only.jar` retains the original bytes of the 24 external definitions needed at runtime. The 494 definitions owned by the client in the R namespace are excluded so launcher classpath ordering cannot load an older client implementation.

The original archive remains at `vendor/dependencies/35-authentic-external-closure.jar`. The runtime lock records its SHA and the slice provenance; packaging verifies the retained bytes and rejects every owned-class overlap.

To reproduce the slice into a new file with JDK 17:

```powershell
java --source 17 build-tools/generator-source/RuntimeDependencyBoundary.java filter vendor/dependencies/35-authentic-external-closure.jar build-tools/RUNTIME_S_TO_R.tsv build/external-only.jar
```
