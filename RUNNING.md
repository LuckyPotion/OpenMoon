# 运行配置

先完成构建，保留 `dist/openmoon-client.jar` 和相邻的 `dist/lib/`。运行需要 JDK 17、游戏资源、native 库及会话参数，入口为 `moom.iP`。

## 本地配置

```powershell
Copy-Item run.example.json run.local.json
```

编辑 `run.local.json`：

| 字段 | 用途 |
|---|---|
| `mainClass` | 启动类，默认 `moom.iP` |
| `workingDirectory` | 游戏工作目录 |
| `nativeDirectory` | native 库所在目录 |
| `jvmArguments` | JVM 参数数组 |
| `programArguments` | 游戏参数数组 |

游戏参数按本地环境填写，包括 `--gameDir`、`--assetsDir`、`--assetIndex`、`--version`、`--username`、`--uuid` 和 `--accessToken`；此版本使用 assets index `1.8`。

`run.local.json` 已被 Git 忽略，用于保存本机路径与会话信息。

## 启动

```powershell
./run.ps1 -JavaHome 'C:/path/to/jdk-17'
```

也可在配置好 JVM/native 选项与游戏参数后直接运行：

```text
java <JVM 参数> -jar dist/openmoon-client.jar <游戏参数>
```
