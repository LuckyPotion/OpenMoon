# 运行交付

先完成完整构建，得到 `dist/openmoon-client.jar` 与 `dist/lib/`。最终JAR的Main-Class为恢复源码入口 `moom.iP`；40个真实provider通过manifest相对Class-Path按锁定顺序供应。JAR与lib目录一起移动，不单独拿走JAR。

本轮仅进行不初始化的JVM加载与声明验证，未自动启动客户端、Launcher、native或业务网络。用户负责人工功能验收。

## 本地运行材料

将 `run.example.json` 复制为Git忽略的 `run.local.json`，填写真实工作目录、原有native目录、游戏/assets路径和合法会话参数。不要将账号、token、key或本机运行目录提交到仓库。原profile指定JDK17、assets index 1.8；源码入口解析accessToken、version、username/uuid、gameDir/assetsDir、assetIndex、userProperties/profileProperties、userType、显示与proxy选项。示例参数保持空数组，脚本会拒绝未配置的profile。

配置好现有运行边界后，由用户手动执行：

```powershell
./run.ps1 -JavaHome 'C:/path/to/jdk-17'
```

也可由用户提供同样的实际JVM/native设置和program arguments，手动运行 `java -jar dist/openmoon-client.jar ...`。不要重新抓key、换stock认证库或为了复核构建重开Launcher。Gradle `run`保留显式阻断，避免构建过程自动运行游戏。

## 入口与保留边界

历史profile的 `net.minecraft.client.main.Main` 与原资源manifest的 `com/moon/obfuscator/Bootstrap -> Start` 不等同于本交付入口。最终JAR把原manifest原字节保存在 `META-INF/openmoon-original/MANIFEST.MF`，并使用独立的新manifest指向 `moom.iP`；其余原资源原字节保留。没有把未恢复的保护Start载荷当作明文实现。

源码S静态归档与R运行影像分开记录；旧S失败没有改判为成功。当前R影像核验通过不代表全部原环境、调用栈观察、native/services或业务语义已经完成验证。保留23项Code-free常量元数据修复、13个JDK17 class-version差异、434额外转发和既有moom/lN原始转发自环等明确账目，详见 `docs/BUILD_VALIDATION.json` 和恢复过程文档。

构建交付还包含 `RUNTIME_MEMBER_CLOSURE.json`：这是打包前静态符号门槛，不初始化类；完整源码两入口与成包SHA见 `docs/BUILD_VALIDATION.json`。它与人工功能回归分别记账。
