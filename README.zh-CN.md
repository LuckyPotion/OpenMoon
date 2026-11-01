# OpenMoon

Moon 客户端的独立源码恢复工程。仓库包含完整选定 Java 源码、恢复适配器、固定真实 provider、Code-free 元数据和原资源分卷；不从参考仓库导入客户端源码。

[English](README.md) · [运行配置](RUNNING.md) · [恢复过程](docs/RECOVERY_JOURNEY.zh-CN.md) · [实际验证记录](docs/BUILD_VALIDATION.json)

## 完整构建

Windows 使用 JDK17、PowerShell7：

```powershell
./build.ps1 -JavaHome 'C:/path/to/jdk-17'
```

Gradle 同样走完整恢复与交付流水线：

```powershell
./gradle-build.ps1 -JavaHome 'C:/path/to/jdk-17' -Tasks @('build', '--offline')
```

Linux/macOS 可选择 JDK17 后运行 `./gradlew build --offline`；已有正式构建回执只覆盖 Windows，不假报跨平台实测。直接运行 Gradle 前请清空 JAVA_TOOL_OPTIONS、_JAVA_OPTIONS、JDK_JAVA_OPTIONS、CLASSPATH；Windows 包装入口会临时隔离并恢复它们。

完整成功输出为 `dist/openmoon-client.jar` 和相邻 `dist/lib/` 中按顺序锁定的40份真实运行 provider。JAR包含4093 owned类及全部5152原资源；lib目录必须一并保留。`build/runs/<id>/` 保存源码编译、适配、独立审计、JVM验证与打包回执。`-SourceOnly` 只作诊断，不是最终客户端。

## 最终实测

Windows / JDK17.0.12 上，PowerShell 和 Gradle 各完成一轮新的完整源码构建，两入口的 S、R、客户端三组 SHA 分别完全相同，锁定输入漂移为0。Gradle application ZIP 另核实含主JAR与全部40运行provider，两个启动脚本均已静态检查。

新增打包前静态成员硬门槛：检查354237处方法指令、158393处字段指令及38987处method handle，失败0、缺失类型0。22个枚举在恢复编译器helper名时同步修改44个字段与22个方法引用，4093类独立结构对照确认无其他ASM结构变化。负控旧候选的66项缺失引用被实际拦截，未进入打包。该审计不执行任意bootstrap，不证明protected接收者值或业务行为。

最终客户端SHA-256：`14EAE7DAF15299AFC1A3A61F8A382A9147323125A0F9679202B8F5F05B34CD9D`。实测计数和双入口回执摘要见 `docs/BUILD_VALIDATION.json` 与 `docs/validation/FRESH_SOURCE_REPLAYS.json`。

## 验证边界

4097源码单元覆盖4093精确身份。通过索引源码ZIP与直接JAR输出保留大小写冲突，不把owner路径直接铺到大小写不敏感文件系统。JDK17使用窄化的JVM checked-exception源码策略，不声称普通strict javac接受全部原源码。

源码阶段保留48329个原方法声明并证明1198个额外转发。恢复R命名空间时，764个额外转发与已存在的原R槽重合并单列合并；434个仍明确保留。独立符号检查覆盖765个owned接收者案例。原访问flags和sealed permits不放宽、不删除；23个非static ConstantValue从Code-free原R元数据补回。相对原R有13个class版本差异，保留目标JDK17编译策略。

独立Code-free核验覆盖3911原R类、23419字段、47965方法，另182个源码生成helper身份单列。类归档及资源打包后的JAR都必须对4093类执行 `-Xverify:all` 不初始化加载/声明查询，失败必须为0；构建不会调用客户端main或请求应用初始化。

源码查询仍锁定原39个provider；运行锁在其后追加真实原包外部定义闭包，合计40个，不替换stock库或改变原39优先级。六个资源分卷由Java17重组为精确原资源归档。源码构建不需要捕获key、原加密客户端或本机历史工作区。

handler配方中的历史机器定位叶改为逻辑provenance ID；原SHA和逐文件转换账见 `docs/provenance/PORTABLE_RECIPES.json`。源码、AST、指令和不透明String载荷保持原值，不全局替换盘符。正式历史证据不改写。

客户端功能由用户人工验收；构建及不初始化JVM验证不冒充完整native/services、模块、ESP、联网或Via回归。正式S中既有的moom/lN转发自环保留，不把忠实保留说成已修复。历史S失败与S/R差异继续独立记账。

启动与认证/资源/native条件见 `RUNNING.md`；生成manifest显式采用源码入口moom.iP，不声称原Launcher/Bootstrap/Start链已经闭合。第三方许可与材料范围见 `docs/THIRD_PARTY.md`。
