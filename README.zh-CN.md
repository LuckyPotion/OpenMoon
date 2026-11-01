# OpenMoon

Moon 独立客户端源码工程，使用 JDK 17 构建。

[English](README.md) · [运行配置](RUNNING.md) · [第三方材料](docs/THIRD_PARTY.md)

## 构建

Windows 下使用 JDK 17（已验证 17.0.12）和 PowerShell 7：

```powershell
./build.ps1 -JavaHome 'C:/path/to/jdk-17'
```

也可使用 Gradle 包装脚本：

```powershell
./gradle-build.ps1 -JavaHome 'C:/path/to/jdk-17' -Tasks @('build', '--offline')
```

已选择 JDK 17 时，Windows 可运行 `./gradlew.bat build --offline`，Unix 可运行 `./gradlew build --offline`。

构建脚本负责源码适配、校验和打包，输出如下：

| 路径 | 内容 |
|---|---|
| `dist/openmoon-client.jar` | 客户端 JAR |
| `dist/lib/` | 运行依赖，须与 JAR 一起保留 |
| `build/runs/` | 构建日志与校验结果 |

## 运行

将 `run.example.json` 复制为 `run.local.json`，填写游戏目录、assets、native 库和会话参数。详见[运行配置](RUNNING.md)。

```powershell
./run.ps1 -JavaHome 'C:/path/to/jdk-17'
```

## 目录

| 路径 | 用途 |
|---|---|
| `src/` | Java 源码 |
| `build-tools/` | 编译适配与构建校验 |
| `vendor/` | 固定依赖与资源分卷 |
| `source-units.json`、`*_PLAN.json` | 源码索引与构建配置 |
