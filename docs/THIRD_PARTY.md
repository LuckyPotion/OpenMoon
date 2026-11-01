# 第三方材料

客户端与依赖分别适用各自的许可条款。随包附带的 LICENSE、NOTICE 等文件保留在对应 JAR 或 ZIP 中。

## 运行依赖

文件与版本见 `vendor/RUNTIME_DEPENDENCIES.lock.json`。

| 组件 | 文件 | 包内许可文件 |
|---|---|---|
| `moon-client:extract:1.0` | `00-moon-client-external-deps-decoded.jar` | — |
| `com.google.guava:guava:31.1-jre` | `01-guava-31.1-jre.jar` | — |
| `io.netty:netty-all:4.1.68.Final` | `02-netty-all-4.1.68.Final.jar` | — |
| `com.google.protobuf:protobuf-java:3.21.7` | `03-protobuf-java-3.21.7.jar` | — |
| `com.google.code.gson:gson:2.10` | `04-gson-2.10.jar` | — |
| `org.apache.logging.log4j:log4j-api:2.19.0` | `05-log4j-api-2.19.0.jar` | `META-INF/LICENSE`<br>`META-INF/NOTICE` |
| `com.mojang:authlib:1.5.21` | `06-authlib-1.5.21.jar` | — |
| `org.apache.commons:commons-lang3:3.12.0` | `07-commons-lang3-3.12.0.jar` | `META-INF/LICENSE.txt`<br>`META-INF/NOTICE.txt` |
| `org.tinylog:tinylog-api:2.5.0` | `08-tinylog-api-2.5.0.jar` | — |
| `org.htmlunit:htmlunit:3.0.0` | `09-htmlunit-3.0.0.jar` | `org/htmlunit/javascript/polyfill/fetch/LICENSE`<br>`org/htmlunit/javascript/polyfill/proxy/LICENSE` |
| `net.sf.jopt-simple:jopt-simple:5.0.4` | `10-jopt-simple-5.0.4.jar` | — |
| `com.paulscode:soundsystem:20120107` | `11-soundsystem-20120107.jar` | — |
| `com.aayushatharva.brotli4j:brotli4j:1.11.0` | `12-brotli4j-1.11.0.jar` | — |
| `com.ibm.icu:icu4j:72.1` | `13-icu4j-72.1.jar` | `LICENSE` |
| `oshi-project:oshi-core:1.1` | `14-oshi-core-1.1.jar` | — |
| `org.java-websocket:Java-WebSocket:1.5.3` | `15-Java-WebSocket-1.5.3.jar` | — |
| `com.paulscode:codecjorbis:20101023` | `16-codecjorbis-20101023.jar` | — |
| `commons-codec:commons-codec:1.15` | `17-commons-codec-1.15.jar` | `META-INF/LICENSE.txt`<br>`META-INF/NOTICE.txt` |
| `org.lwjgl:lwjgl-stb:3.3.1` | `18-lwjgl-stb-3.3.1.jar` | — |
| `net.kyori:adventure-api:4.12.0` | `19-adventure-api-4.12.0.jar` | — |
| `net.kyori:adventure-text-minimessage:4.12.0` | `20-adventure-text-minimessage-4.12.0.jar` | — |
| `net.kyori:adventure-text-serializer-gson:4.12.0` | `21-adventure-text-serializer-gson-4.12.0.jar` | — |
| `net.kyori:adventure-text-serializer-legacy:4.12.0` | `22-adventure-text-serializer-legacy-4.12.0.jar` | — |
| `me.xdrop:fuzzywuzzy:1.4.0` | `23-fuzzywuzzy-1.4.0.jar` | — |
| `org.apache.commons:commons-text:1.10.0` | `24-commons-text-1.10.0.jar` | `META-INF/LICENSE.txt`<br>`META-INF/NOTICE.txt` |
| `com.google.guava:failureaccess:1.0.1` | `25-failureaccess-1.0.1.jar` | — |
| `net.kyori:examination-api:1.3.0` | `26-examination-api-1.3.0.jar` | — |
| `net.kyori:examination-string:1.3.0` | `27-examination-string-1.3.0.jar` | — |
| `commons-io:commons-io:2.11.0` | `28-commons-io-2.11.0.jar` | `META-INF/LICENSE.txt`<br>`META-INF/NOTICE.txt` |
| `org.lwjgl:lwjgl-jemalloc:3.3.1` | `29-lwjgl-jemalloc-3.3.1.jar` | — |
| `org.lwjgl:lwjgl-openal:3.3.1` | `30-lwjgl-openal-3.3.1.jar` | — |
| `org.lwjgl:lwjgl-opengl:3.3.1` | `31-lwjgl-opengl-3.3.1.jar` | — |
| `org.lwjgl:lwjgl:3.3.1` | `32-lwjgl-3.3.1.jar` | — |
| `org.luaj:luaj-jse:3.0.1` | `33-luaj-jse-3.0.1.jar` | — |
| `com.viaversion:viaversion:4.4.2` | `34-ViaVersion-4.4.2.jar` | `LICENSE` |
| `moon-client:authentic-external-closure:1.0` | `35-authentic-external-closure.jar` | — |
| `org.apache.httpcomponents:httpclient:4.5.14` | `36-httpclient-4.5.14.jar` | `META-INF/LICENSE`<br>`META-INF/NOTICE` |
| `org.apache.httpcomponents:httpcore:4.4.16` | `37-httpcore-4.4.16.jar` | `META-INF/LICENSE`<br>`META-INF/NOTICE` |
| `org.apache.httpcomponents:httpmime:4.5.14` | `38-httpmime-4.5.14.jar` | `META-INF/LICENSE`<br>`META-INF/NOTICE` |
| `moon-client:authentic-runtime-closure:1.0` | `39-authentic-runtime-closure.jar` | — |

## 构建工具

文件与 SHA-256 见 `vendor/BUILD_TOOLS.lock.json`。

| 文件 | 包内许可文件 |
|---|---|
| `04-gson-2.10.jar` | — |
| `asm-9.9.1.jar` | — |
| `asm-analysis-9.9.1.jar` | — |
| `asm-tree-9.9.1.jar` | — |
| `asm-commons-9.9.1.jar` | — |
| `generation-toolkit.zip` | — |

— 表示包内未找到上述名称的许可文件。
