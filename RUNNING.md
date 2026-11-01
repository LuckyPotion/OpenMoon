# 源码构建的运行入口

当前工程可指认的客户端启动 main 是 `moom.iP.main(String[])`。正式保存源码先解析 jopt-simple 参数，创建 Session／游戏配置，再构造 `com.moon.pb`（继承 Minecraft）并调用其运行入口。`run.example.json` 与 Gradle application 默认值据此采用 `moom.iP`。这是静态源码身份结论，尚未证明客户端启动或功能通过。

原运行版本 `client.json` 的 `net.minecraft.client.main.Main` 属于原 Launcher／loader 配置。现有正式映射没有证明该绝对名与 S 源码 `moom.iP` 的直接重命名关系；当前源码清单和39个 provider 也没有该 Main 类，不能直接把原配置名字套到源码归档。

原资源 manifest 的 Main-Class 是 `com/moon/obfuscator/Bootstrap`；其正式源码调用默认包 `Start.main`。E盘正式原包中存在 Start.class 保护载荷，但它不是普通 classfile，当前源码和provider未供应可用 Start 实现。不要把 `java -jar` 的 manifest 链当作已闭合启动入口；`run.ps1` 通过显式 mainClass 启动，不依赖该 manifest。

先完成全量源码构建和所有适配器／末尾残留检查，再将 `run.example.json` 复制为 Git 忽略的 `run.local.json`，按现有获准环境填写：

| 字段 | 需要的实际材料 |
|---|---|
| `mainClass` | 当前源码启动入口 `moom.iP`；若采用原 loader 链，须先独立证明其身份映射和供应闭包 |
| `workingDirectory` | 实际游戏工作目录 |
| `nativeDirectory` | 原运行边界内真实 native 目录；使用原真实库，不替换 stock 库 |
| `jvmArguments` | 已审的 JVM／loader／native 初始化配置；不猜测新 agent，不重新抓 key |
| `programArguments` | 本地实际 game/assets 路径与当前合法会话参数；不把会话值提交到仓库或报告 |

原 profile 静态指定 JDK17、assets index 1.8。保存 main 明确解析 `accessToken`、`version`、username／uuid、gameDir／assetsDir、assetIndex、userProperties／profileProperties、userType、显示与proxy选项；需要值的来源仍是现有实际运行环境。示例保持参数空数组，运行脚本会拒绝缺少实际参数的 profile。

真实运行仍需：成功产物及锁定39个provider／原资源完整供应，官方1.8 assets 与实际工作目录，真实认证会话，以及已审的 decoder／loader／native 初始化。Java编译成功和目录／class存在不能替代这些条件。services、native实现和原模块／渲染／网络／Via功能回归尚未整体验收。

确认实际环境和运行授权后，手动使用：

```powershell
./run.ps1 -JavaHome 'C:/Program Files/Java/jdk-17'
```

脚本校验构建归档和vendor SHA，按精确顺序使用“当前源码构建JAR＋provider＋原资源”的classpath，读取本地profile。它不启动Launcher取key或自动登录。Gradle `run` 继续保持现有显式阻断，安装脚本仅使用源码身份默认值。本文的入口修正没有运行客户端、Launcher、native或业务网络。
