运行补充（2026-11-01）：源码查询的39份provider不变；`vendor/RUNTIME_DEPENDENCIES.lock.json`在原顺序后追加 `vendor/dependencies/39-authentic-runtime-closure.jar`，含1333份原包真实外部定义，owned/已有provider重叠均0。它不是新stock替代库，原材料许可沿原来源保留；不得将其当作本仓库新许可授权。新增构建工具ASM commons 9.9.1与已有ASM系列同源，作为build-only工具，不进入客户端owned实现。原provider许可证材料和NOTICE继续保存在各自原JAR内。

# 第三方材料

这里列出本恢复工程随仓库保存的固定二进制输入及其可见许可证条目。它们不是通用 Maven 缓存，也不因被提交到仓库就获得新的许可证。原项目与各依赖的许可范围分别保留；本仓库没有为原客户端材料另行授予 MIT 许可。

范围：`vendor/DEPENDENCIES.lock.json` 锁定的 39 个 provider，按锁定顺序检查 JAR ZIP 条目。
本次只读取条目名称和锁定元数据；依赖自身的 LICENSE/NOTICE/POM 原材料保持在各自 JAR 中，未改写、未重签、未把客户端源码归类为 MIT。

构建脚本会按 `vendor/DEPENDENCIES.lock.json` 和 `vendor/BUILD_TOOLS.lock.json` 校验文件大小、SHA-256、角色和顺序。资源分卷的字节校验由 `ResourceAssembler` 执行。盘点输出不包含解密 key、token 或其他高熵秘密值。

|序号|GAV|JAR|META-INF/LICENSE*|META-INF/NOTICE*|META-INF/maven POM|其他根级 LICENSE*|
|---:|---|---|---|---|---|---|
|0|`moon-client:extract:1.0`|`vendor/dependencies/00-moon-client-external-deps-decoded.jar`|未发现|未发现|未发现|未发现|
|1|`com.google.guava:guava:31.1-jre`|`vendor/dependencies/01-guava-31.1-jre.jar`|未发现|未发现|META-INF/maven/com.google.guava/guava/pom.properties<br>META-INF/maven/com.google.guava/guava/pom.xml|未发现|
|2|`io.netty:netty-all:4.1.68.Final`|`vendor/dependencies/02-netty-all-4.1.68.Final.jar`|未发现|未发现|META-INF/maven/io.netty/netty-all/pom.properties<br>META-INF/maven/io.netty/netty-all/pom.xml|未发现|
|3|`com.google.protobuf:protobuf-java:3.21.7`|`vendor/dependencies/03-protobuf-java-3.21.7.jar`|未发现|未发现|META-INF/maven/com.google.protobuf/protobuf-java/pom.properties<br>META-INF/maven/com.google.protobuf/protobuf-java/pom.xml|未发现|
|4|`com.google.code.gson:gson:2.10`|`vendor/dependencies/04-gson-2.10.jar`|未发现|未发现|META-INF/maven/com.google.code.gson/gson/pom.properties<br>META-INF/maven/com.google.code.gson/gson/pom.xml|未发现|
|5|`org.apache.logging.log4j:log4j-api:2.19.0`|`vendor/dependencies/05-log4j-api-2.19.0.jar`|META-INF/LICENSE|META-INF/NOTICE|META-INF/maven/org.apache.logging.log4j/log4j-api/pom.properties<br>META-INF/maven/org.apache.logging.log4j/log4j-api/pom.xml|未发现|
|6|`com.mojang:authlib:1.5.21`|`vendor/dependencies/06-authlib-1.5.21.jar`|未发现|未发现|未发现|未发现|
|7|`org.apache.commons:commons-lang3:3.12.0`|`vendor/dependencies/07-commons-lang3-3.12.0.jar`|META-INF/LICENSE.txt|META-INF/NOTICE.txt|META-INF/maven/org.apache.commons/commons-lang3/pom.properties<br>META-INF/maven/org.apache.commons/commons-lang3/pom.xml|未发现|
|8|`org.tinylog:tinylog-api:2.5.0`|`vendor/dependencies/08-tinylog-api-2.5.0.jar`|未发现|未发现|未发现|未发现|
|9|`org.htmlunit:htmlunit:3.0.0`|`vendor/dependencies/09-htmlunit-3.0.0.jar`|未发现|未发现|未发现|org/htmlunit/javascript/polyfill/fetch/LICENSE<br>org/htmlunit/javascript/polyfill/proxy/LICENSE|
|10|`net.sf.jopt-simple:jopt-simple:5.0.4`|`vendor/dependencies/10-jopt-simple-5.0.4.jar`|未发现|未发现|META-INF/maven/net.sf.jopt-simple/jopt-simple/pom.properties<br>META-INF/maven/net.sf.jopt-simple/jopt-simple/pom.xml|未发现|
|11|`com.paulscode:soundsystem:20120107`|`vendor/dependencies/11-soundsystem-20120107.jar`|未发现|未发现|META-INF/maven/com.paulscode/soundsystem/pom.properties<br>META-INF/maven/com.paulscode/soundsystem/pom.xml|未发现|
|12|`com.aayushatharva.brotli4j:brotli4j:1.11.0`|`vendor/dependencies/12-brotli4j-1.11.0.jar`|未发现|未发现|META-INF/maven/com.aayushatharva.brotli4j/brotli4j/pom.properties<br>META-INF/maven/com.aayushatharva.brotli4j/brotli4j/pom.xml|未发现|
|13|`com.ibm.icu:icu4j:72.1`|`vendor/dependencies/13-icu4j-72.1.jar`|未发现|未发现|未发现|LICENSE|
|14|`oshi-project:oshi-core:1.1`|`vendor/dependencies/14-oshi-core-1.1.jar`|未发现|未发现|META-INF/maven/oshi-project/oshi-core/pom.properties<br>META-INF/maven/oshi-project/oshi-core/pom.xml|未发现|
|15|`org.java-websocket:Java-WebSocket:1.5.3`|`vendor/dependencies/15-Java-WebSocket-1.5.3.jar`|未发现|未发现|META-INF/maven/org.java-websocket/Java-WebSocket/pom.properties<br>META-INF/maven/org.java-websocket/Java-WebSocket/pom.xml|未发现|
|16|`com.paulscode:codecjorbis:20101023`|`vendor/dependencies/16-codecjorbis-20101023.jar`|未发现|未发现|META-INF/maven/com.paulscode/codecjorbis/pom.properties<br>META-INF/maven/com.paulscode/codecjorbis/pom.xml|未发现|
|17|`commons-codec:commons-codec:1.15`|`vendor/dependencies/17-commons-codec-1.15.jar`|META-INF/LICENSE.txt|META-INF/NOTICE.txt|META-INF/maven/commons-codec/commons-codec/pom.properties<br>META-INF/maven/commons-codec/commons-codec/pom.xml|未发现|
|18|`org.lwjgl:lwjgl-stb:3.3.1`|`vendor/dependencies/18-lwjgl-stb-3.3.1.jar`|未发现|未发现|未发现|未发现|
|19|`net.kyori:adventure-api:4.12.0`|`vendor/dependencies/19-adventure-api-4.12.0.jar`|未发现|未发现|未发现|未发现|
|20|`net.kyori:adventure-text-minimessage:4.12.0`|`vendor/dependencies/20-adventure-text-minimessage-4.12.0.jar`|未发现|未发现|未发现|未发现|
|21|`net.kyori:adventure-text-serializer-gson:4.12.0`|`vendor/dependencies/21-adventure-text-serializer-gson-4.12.0.jar`|未发现|未发现|未发现|未发现|
|22|`net.kyori:adventure-text-serializer-legacy:4.12.0`|`vendor/dependencies/22-adventure-text-serializer-legacy-4.12.0.jar`|未发现|未发现|未发现|未发现|
|23|`me.xdrop:fuzzywuzzy:1.4.0`|`vendor/dependencies/23-fuzzywuzzy-1.4.0.jar`|未发现|未发现|META-INF/maven/me.xdrop/diffutils/pom.properties<br>META-INF/maven/me.xdrop/diffutils/pom.xml<br>META-INF/maven/me.xdrop/fuzzywuzzy-build/pom.properties<br>META-INF/maven/me.xdrop/fuzzywuzzy-build/pom.xml<br>META-INF/maven/me.xdrop/fuzzywuzzy/pom.properties<br>META-INF/maven/me.xdrop/fuzzywuzzy/pom.xml|未发现|
|24|`org.apache.commons:commons-text:1.10.0`|`vendor/dependencies/24-commons-text-1.10.0.jar`|META-INF/LICENSE.txt|META-INF/NOTICE.txt|META-INF/maven/org.apache.commons/commons-text/pom.properties<br>META-INF/maven/org.apache.commons/commons-text/pom.xml|未发现|
|25|`com.google.guava:failureaccess:1.0.1`|`vendor/dependencies/25-failureaccess-1.0.1.jar`|未发现|未发现|META-INF/maven/com.google.guava/failureaccess/pom.properties<br>META-INF/maven/com.google.guava/failureaccess/pom.xml|未发现|
|26|`net.kyori:examination-api:1.3.0`|`vendor/dependencies/26-examination-api-1.3.0.jar`|未发现|未发现|未发现|未发现|
|27|`net.kyori:examination-string:1.3.0`|`vendor/dependencies/27-examination-string-1.3.0.jar`|未发现|未发现|未发现|未发现|
|28|`commons-io:commons-io:2.11.0`|`vendor/dependencies/28-commons-io-2.11.0.jar`|META-INF/LICENSE.txt|META-INF/NOTICE.txt|META-INF/maven/commons-io/commons-io/pom.properties<br>META-INF/maven/commons-io/commons-io/pom.xml|未发现|
|29|`org.lwjgl:lwjgl-jemalloc:3.3.1`|`vendor/dependencies/29-lwjgl-jemalloc-3.3.1.jar`|未发现|未发现|未发现|未发现|
|30|`org.lwjgl:lwjgl-openal:3.3.1`|`vendor/dependencies/30-lwjgl-openal-3.3.1.jar`|未发现|未发现|未发现|未发现|
|31|`org.lwjgl:lwjgl-opengl:3.3.1`|`vendor/dependencies/31-lwjgl-opengl-3.3.1.jar`|未发现|未发现|未发现|未发现|
|32|`org.lwjgl:lwjgl:3.3.1`|`vendor/dependencies/32-lwjgl-3.3.1.jar`|未发现|未发现|未发现|未发现|
|33|`org.luaj:luaj-jse:3.0.1`|`vendor/dependencies/33-luaj-jse-3.0.1.jar`|未发现|未发现|未发现|未发现|
|34|`com.viaversion:viaversion:4.4.2`|`vendor/dependencies/34-ViaVersion-4.4.2.jar`|未发现|未发现|META-INF/maven/com.google.code.gson/gson/pom.properties<br>META-INF/maven/com.google.code.gson/gson/pom.xml<br>META-INF/maven/com.viaversion/opennbt/pom.properties<br>META-INF/maven/com.viaversion/opennbt/pom.xml<br>META-INF/maven/org.javassist/javassist/pom.properties<br>META-INF/maven/org.javassist/javassist/pom.xml|LICENSE|
|35|`moon-client:authentic-external-closure:1.0`|`vendor/dependencies/35-authentic-external-closure.jar`|未发现|未发现|未发现|未发现|
|36|`org.apache.httpcomponents:httpclient:4.5.14`|`vendor/dependencies/36-httpclient-4.5.14.jar`|META-INF/LICENSE|META-INF/NOTICE|META-INF/maven/org.apache.httpcomponents/httpclient/pom.properties<br>META-INF/maven/org.apache.httpcomponents/httpclient/pom.xml|未发现|
|37|`org.apache.httpcomponents:httpcore:4.4.16`|`vendor/dependencies/37-httpcore-4.4.16.jar`|META-INF/LICENSE|META-INF/NOTICE|META-INF/maven/org.apache.httpcomponents/httpcore/pom.properties<br>META-INF/maven/org.apache.httpcomponents/httpcore/pom.xml|未发现|
|38|`org.apache.httpcomponents:httpmime:4.5.14`|`vendor/dependencies/38-httpmime-4.5.14.jar`|META-INF/LICENSE|META-INF/NOTICE|META-INF/maven/org.apache.httpcomponents/httpmime/pom.properties<br>META-INF/maven/org.apache.httpcomponents/httpmime/pom.xml|未发现|

## 解释与保留项

- 表中“未发现”只表示该 JAR ZIP 内没有匹配的条目名称；不代表依赖无许可证，也不构成许可证类型判断。
- ICU4J 与 ViaVersion 发现根级 `LICENSE` 条目，但它们不计入 `META-INF/LICENSE*` 栏；其原始条目仍保留在 JAR。
- 未从 GAV、类名或源码注释推断 MIT/Apache/GPL 等授权；发布前应按每个上游项目的原始许可证和 NOTICE 完成法律复核。
- `src/main/java`、`src/compileSupport/java`、`vendor/dependencies/00-moon-client-external-deps-decoded.jar` 和 `35-authentic-external-closure.jar` 不因本表获得 MIT 或其他新授权。
- StylesFoundation/Moon 仅作为参考链接策略，不复制其源码，也不把其许可证外推到本候选仓库。
- 本清单不表示客户端可运行或功能验收通过，也不构成任何上游许可证的法律复核。源码编译入口使用项目自有的 JDK17 前端策略；它不等同于普通 strict javac 的许可证或兼容性声明。
