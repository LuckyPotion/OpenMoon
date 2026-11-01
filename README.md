# OpenMoon

独立恢复的 Moon 客户端源码工程。源码、可读生成规则、锁定依赖和构建工具放在同一仓库；不以旧 owned class 归档代替源码实现。公开的 StylesFoundation/Moon 仅为参考链接，没有复制其源码补全本工程。

## 当前构建状态

- 覆盖 4093 个原类身份，显式编译 4097 个 Java 单元（含构建时辅助单元）。
- SourceOnly 源码构建入口已通过一次全量验证：4097/4097 源码单元、0 个 javac 错误，生成 7601 个精确类条目和 32.8 MiB 的客户端源码构建 JAR；结果以 `dist/SOURCE_ONLY_RESULT.json` 和 `dist/openmoon-source-only.jar` 为准。
- 该 JAR 是源码编译产物。构造器、枚举运行适配、异常处理、调用指令、ABI、声明恢复和 FinalArchiveAudit 属于独立的精确恢复审计，当前不把它们冒充为标准源码构建门槛，也不宣称完整客户端功能已验收。
- 构建使用明确的 JVM 异常源策略，不等同于普通 javac 严格模式：只将 JVM 允许的受检异常传播和 catch 可达性诊断单独记录，保留原 throw/catch、控制流及其他编译错误门槛。
- 客户端功能由用户人工验收；当前源码入口与原保护加载器之间的区别见 `RUNNING.md`。

## 构建

需要 JDK17。Windows 标准源码构建：

```powershell
./build.ps1 -SourceOnly -JavaHome 'C:/path/to/jdk-17'
```

该命令会校验 39 个锁定依赖、六份资源分卷，使用 `source-units.json` 打包 4097 个显式 Java 单元，并生成 `build/libs/openmoon-source-only.jar`。它只运行源码编译和基础归档检查；每次运行的完整证据在被 Git 忽略的 `build/` 中，稳定交付副本位于 `dist/`。

精确恢复审计入口仍是：

```powershell
./build.ps1 -JavaHome 'C:/path/to/jdk-17'
```

Gradle Wrapper 固定版本与分发 SHA，首次可下载 Gradle 本身；客户端依赖均已锁定在本地，不通过 Maven 随机解析：

```powershell
./gradle-build.ps1 -JavaHome 'C:/path/to/jdk-17' -Tasks @('build', '--offline')
```

Linux/macOS 使用 `./gradlew build --offline`，预先选择 JDK17 并清除 `JAVA_TOOL_OPTIONS`、`_JAVA_OPTIONS`、`JDK_JAVA_OPTIONS`、`CLASSPATH` 注入变量。Windows 入口会临时清理并恢复这些变量。

精确审计的顺序是：核验并恢复资源 → 编译工具 → 全量源码编译 → 构造器／枚举／异常处理／调用指令适配 → 原声明恢复 → 全量归档审计。所有失败阻断精确审计成功回执。两种入口的命令、SHA、诊断及中间归档都保存在被 Git 忽略的 `build/` 中。

## 工程布局

| 路径 | 内容 |
|---|---|
| `src/main/java/<identity>/` | 可编辑生产源码；独立目录保留 Windows 大小写冲突身份 |
| `source-units.json` | 每个源码路径、精确 Java ZIP 条目、原类身份与 SHA |
| `build-tools/` | 可读编译前端、适配器、声明元数据和源配方 |
| `*_PLAN.json` | 构造、枚举、异常区域、精确调用和方法别名规则 |
| `vendor/dependencies/` | 按固定顺序使用的 39 个真实 provider |
| `vendor/resources/parts/` | 六个资源分卷；每份不超过 50 MiB |
| `vendor/*lock.json` | 输入大小、SHA 和次序锁 |
| `docs/RECOVERY_JOURNEY.zh-CN.md` | 独立恢复的过程与失败记录说明 |
| `docs/THIRD_PARTY.md` | 第三方依赖材料与许可证条目盘点 |

原资源包超过 GitHub 单文件限制。两套构建入口均使用纯 Java17 的 `ResourceAssembler` 校验六份分卷，再重组出原字节、原 SHA 的 `vendor/resources/original-resources.jar`；该重组文件不提交。源码和构建规则也使用原字节 SHA，`.gitattributes` 禁止 Git 自动换行转换。

## 手工运行

先完成构建，再参考 `RUNNING.md`，把 `run.example.json` 复制为被忽略的 `run.local.json`。当前可指认的源码客户端入口是 `moom.iP`。用户需在本地提供真实 game/assets 路径、认证会话和已审的原生运行配置。

仓库不保存用户账号、token 或解密 key。构建成功不代表原 Launcher、保护启动层、services、JNI 或客户端模块已完成功能验收；已有合同缺口会单列，不能用局部成功替代。

## 来源

本仓库保留自身的独立恢复路径。外部参考：[StylesFoundation/Moon](https://github.com/StylesFoundation/Moon)。不声称两者版本一致，也不把第三方或原客户端材料统一重新授权为 MIT。
