package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class StorageEsp extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.FloatSetting w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.ColorSetting y;

private com.moon.setting.ColorSetting z;

private com.moon.setting.ColorSetting A;

private com.moon.setting.SettingGroup B;

private com.moon.setting.BooleanSetting C;

private com.moon.setting.ColorSetting D;

private com.moon.setting.ColorSetting E;

private com.moon.setting.ColorSetting F;

private com.moon.setting.BooleanSetting G;

private com.moon.setting.SettingGroup H;

private com.moon.setting.BooleanSetting I;

private com.moon.setting.BooleanSetting J;

private com.moon.setting.FloatSetting K;

private com.moon.setting.SettingGroup L;

private com.moon.setting.ColorSetting M;

private com.moon.setting.ColorSetting N;

private com.moon.setting.ColorSetting O;

private com.moon.setting.SettingGroup P;

private static long Q;

private static java.lang.String[] R;

private static java.lang.String[] S;

private static java.util.Map T;

private static long[] U;

private static java.lang.Integer[] V;

private static java.util.Map W;

public StorageEsp(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_ddd667e2153c9afe(com.moon.module.impl.StorageEsp receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.StorageEsp.Q ^ 50432589017381L);

    com.moon.module.impl.StorageEsp.__sourceConstructorInit_ddd667e2153c9afe_0(((com.moon.module.impl.StorageEsp)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.StorageEsp)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_5(27923, (5408516491655021219L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_8(1406, (2235884810490571477L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_13(193, (1021537377329770325L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_16(11386, (2909686726780797902L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_27 = receiver;

    com.moon.l_ __sourceSpill170_28 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_21(10034, (9210815941335533711L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_24(9047, (8963398324556090608L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp170_29_0 = ((com.moon.module.impl.StorageEsp)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill170_31 = __stackOp170_29_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp170_29_0)));

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_27)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill170_28)).a(((java.util.function.Supplier)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_32(__sourceSpill170_31)))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_37(28434, (5450984643661758627L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_40(4183, (6849086685754916850L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_42(receiver)))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).w = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_47(28713, (6458251675162189701L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_50(3493, (8078265969028456966L ^ local5_life2)))), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(1082130432)), ((float)(1036831949))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_54(receiver)))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_65 = receiver;

    com.moon.l_ __sourceSpill170_66 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_59(6170, (1494807101797889928L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_62(19021, (4816456624487015907L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp170_67_0 = ((com.moon.module.impl.StorageEsp)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill170_69 = __stackOp170_67_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp170_67_0)));

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_65)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill170_66)).a(((java.util.function.Supplier)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_70(__sourceSpill170_69)))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_81 = receiver;

    com.moon.mb __sourceSpill170_82 = ((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_75(8700, (6349000447587438188L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_78(12084, (8023490815140774055L ^ local5_life2)))), ((int)(-1)));

    com.moon.setting.BooleanSetting __stackOp170_83_0 = ((com.moon.module.impl.StorageEsp)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill170_85 = __stackOp170_83_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp170_83_0)));

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_81)).y = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(__sourceSpill170_82)).a(((java.util.function.Supplier)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_86(__sourceSpill170_85)))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_99 = receiver;

    com.moon.mb __sourceSpill170_100 = ((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_91(16222, (6396506701695865062L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_94(473, (2253889877754506863L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB())));

    com.moon.setting.BooleanSetting __stackOp170_101_0 = ((com.moon.module.impl.StorageEsp)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill170_103 = __stackOp170_101_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp170_101_0)));

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_99)).z = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(__sourceSpill170_100)).a(((java.util.function.Supplier)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_104(__sourceSpill170_103)))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_117 = receiver;

    com.moon.mb __sourceSpill170_118 = ((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_109(23573, (3773366576346117030L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_112(1993, (7957109039651809395L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.PINK)).getRGB())));

    com.moon.setting.BooleanSetting __stackOp170_119_0 = ((com.moon.module.impl.StorageEsp)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill170_121 = __stackOp170_119_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp170_119_0)));

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_117)).A = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(__sourceSpill170_118)).a(((java.util.function.Supplier)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_122(__sourceSpill170_121)))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_131 = receiver;

    com.moon.me __sourceSpill170_132 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill170_133 = __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_128(26385, (4781777891251226756L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp170_134_0 = new com.moon.setting.Setting[__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_130(7502, (5114338406091115560L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill170_136 = __stackOp170_134_0;

    (__stackOp170_134_0)[0] = ((com.moon.module.impl.StorageEsp)(receiver)).t;

    com.moon.setting.Setting[] __stackOp170_137_0 = __sourceSpill170_136;

    com.moon.setting.Setting[] __sourceSpill170_139 = __stackOp170_137_0;

    (__stackOp170_137_0)[1] = ((com.moon.module.impl.StorageEsp)(receiver)).u;

    com.moon.setting.Setting[] __stackOp170_140_0 = __sourceSpill170_139;

    com.moon.setting.Setting[] __sourceSpill170_142 = __stackOp170_140_0;

    (__stackOp170_140_0)[2] = ((com.moon.module.impl.StorageEsp)(receiver)).v;

    com.moon.setting.Setting[] __stackOp170_143_0 = __sourceSpill170_142;

    com.moon.setting.Setting[] __sourceSpill170_145 = __stackOp170_143_0;

    (__stackOp170_143_0)[3] = ((com.moon.module.impl.StorageEsp)(receiver)).w;

    com.moon.setting.Setting[] __stackOp170_146_0 = __sourceSpill170_145;

    com.moon.setting.Setting[] __sourceSpill170_148 = __stackOp170_146_0;

    (__stackOp170_146_0)[4] = ((com.moon.module.impl.StorageEsp)(receiver)).x;

    com.moon.setting.Setting[] __stackOp170_149_0 = __sourceSpill170_148;

    com.moon.setting.Setting[] __sourceSpill170_151 = __stackOp170_149_0;

    (__stackOp170_149_0)[5] = ((com.moon.module.impl.StorageEsp)(receiver)).y;

    com.moon.setting.Setting[] __stackOp170_152_0 = __sourceSpill170_151;

    com.moon.setting.Setting[] __sourceSpill170_156 = __stackOp170_152_0;

    (__stackOp170_152_0)[__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_154(2916, (7187502483334322688L ^ local5_life2))] = ((com.moon.module.impl.StorageEsp)(receiver)).z;

    com.moon.setting.Setting[] __stackOp170_157_0 = __sourceSpill170_156;

    com.moon.setting.Setting[] __sourceSpill170_161 = __stackOp170_157_0;

    (__stackOp170_157_0)[__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_159(8022, (5789868179783142963L ^ local5_life2))] = ((com.moon.module.impl.StorageEsp)(receiver)).A;

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_131)).B = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill170_132)).a(((java.lang.String)(__sourceSpill170_133)), ((com.moon.setting.Setting[])(__sourceSpill170_161))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_166(26882, (5749605183337793192L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_169(5704, (7961816500706146806L ^ local5_life2)))), ((boolean)(false))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_172(16411, (5678535190523064194L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).D = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_177(3227, (5637432963475923753L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_180(31226, (8120828505010771526L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.BLUE)).getRGB()))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).E = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_187(14744, (541225081790256702L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_190(9611, (6735375313632512546L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB()))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).F = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_197(10069, (4518426168982325444L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_200(3344, (8972234464430678699L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.PINK)).getRGB()))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).G = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_207(12749, (1664074841303572064L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_210(8861, (4363721389093211403L ^ local5_life2)))), ((boolean)(false))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_213(2005, (8997129750237407351L ^ local5_life2))))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_220 = receiver;

    com.moon.me __sourceSpill170_221 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill170_222 = __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_219(29899, (8293878474075872116L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp170_223_0 = new com.moon.setting.Setting[3];

    com.moon.setting.Setting[] __sourceSpill170_225 = __stackOp170_223_0;

    (__stackOp170_223_0)[0] = ((com.moon.module.impl.StorageEsp)(receiver)).D;

    com.moon.setting.Setting[] __stackOp170_226_0 = __sourceSpill170_225;

    com.moon.setting.Setting[] __sourceSpill170_228 = __stackOp170_226_0;

    (__stackOp170_226_0)[1] = ((com.moon.module.impl.StorageEsp)(receiver)).E;

    com.moon.setting.Setting[] __stackOp170_229_0 = __sourceSpill170_228;

    com.moon.setting.Setting[] __sourceSpill170_231 = __stackOp170_229_0;

    (__stackOp170_229_0)[2] = ((com.moon.module.impl.StorageEsp)(receiver)).F;

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_220)).H = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill170_221)).a(((java.lang.String)(__sourceSpill170_222)), ((com.moon.setting.Setting[])(__sourceSpill170_231))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).I = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_236(22272, (277932973190690980L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_239(22308, (3198001811528136892L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).J = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_244(9133, (853605874703289370L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_247(29970, (6645157477550758571L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).K = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_252(864, (4056242713793490171L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_255(5459, (723989635899325124L ^ local5_life2)))), ((float)(1050253722)), ((float)(1008981770)), ((float)(0x1.0p0f)), ((float)(1008981770))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_265 = receiver;

    com.moon.me __sourceSpill170_266 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill170_267 = __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_264(11640, (468618931681084109L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp170_268_0 = new com.moon.setting.Setting[2];

    com.moon.setting.Setting[] __sourceSpill170_270 = __stackOp170_268_0;

    (__stackOp170_268_0)[0] = ((com.moon.module.impl.StorageEsp)(receiver)).J;

    com.moon.setting.Setting[] __stackOp170_271_0 = __sourceSpill170_270;

    com.moon.setting.Setting[] __sourceSpill170_273 = __stackOp170_271_0;

    (__stackOp170_271_0)[1] = ((com.moon.module.impl.StorageEsp)(receiver)).K;

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_265)).L = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill170_266)).a(((java.lang.String)(__sourceSpill170_267)), ((com.moon.setting.Setting[])(__sourceSpill170_273))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).M = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_278(28088, (5127670542899315225L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_281(31226, (8120828505010771526L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.BLUE)).getRGB()))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).N = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_288(14539, (73189611316369252L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_291(9611, (6735375313632512546L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB()))))).a()));

    ((com.moon.module.impl.StorageEsp)(receiver)).O = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_298(7829, (2917392393241751869L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_301(3344, (8972234464430678699L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.PINK)).getRGB()))))).a()));

    com.moon.module.impl.StorageEsp __sourceSpill170_310 = receiver;

    com.moon.me __sourceSpill170_311 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill170_312 = __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_309(24588, (8984946018811121580L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp170_313_0 = new com.moon.setting.Setting[3];

    com.moon.setting.Setting[] __sourceSpill170_315 = __stackOp170_313_0;

    (__stackOp170_313_0)[0] = ((com.moon.module.impl.StorageEsp)(receiver)).M;

    com.moon.setting.Setting[] __stackOp170_316_0 = __sourceSpill170_315;

    com.moon.setting.Setting[] __sourceSpill170_318 = __stackOp170_316_0;

    (__stackOp170_316_0)[1] = ((com.moon.module.impl.StorageEsp)(receiver)).N;

    com.moon.setting.Setting[] __stackOp170_319_0 = __sourceSpill170_318;

    com.moon.setting.Setting[] __sourceSpill170_321 = __stackOp170_319_0;

    (__stackOp170_319_0)[2] = ((com.moon.module.impl.StorageEsp)(receiver)).O;

    ((com.moon.module.impl.StorageEsp)(__sourceSpill170_310)).P = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill170_311)).a(((java.lang.String)(__sourceSpill170_312)), ((com.moon.setting.Setting[])(__sourceSpill170_321))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ddd667e2153c9afe_0(com.moon.module.impl.StorageEsp a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
Q = ((long)(((moom._a)(moom._c.a(((long)(1344038644023543756L)), ((long)(187195937461344709L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16424571987824L)))));
    T = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.StorageEsp.Q ^ 97706605798227L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill290_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill290_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill290_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill290_14 = new byte[8];
    (__sourceSpill290_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill290_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation290_16 = __sourceSpill290_14;
    ((javax.crypto.Cipher)(__sourceSpill290_11)).init(((int)(__sourceSpill290_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill290_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation290_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[43];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\004ÁÏ\003\020Ì?ú/À§Ó¥¶ÿë§~Ý\022(jwô\034\024D4r¼«ZÙ2úÖ\024|ÂÏMvÁ\004ùÆJîæ\0209Û8¢ýö}ðñÕË{+Ä(\020×\027(öÌk®ê\031ç\"iHöûp>¸­J¢À \f\005\002@õÔÖv3l<  ,¼%DÇ}Ð\030ÖPîóUÏu\020OwÑ¹\016¤£A²FöJ¥\030æ0\002F*ô`RUW\\¡2æf=¾-»Ô\031\0203 pÜ§JÍ7¶£c\022\022T~\n\030ø&)\003A%Î3B\t\035<n\036zþã\030\030\t{v9´s\017G\023ÍcçÒ xS$­?ø\020\\]\036ï\037{¦\f¶£*%`(\f_äû­î\026`^y\025B¬%å\020Í=Ó\005\013\177¢ýdÌùQä\"G\r¦\003\022\030>L'Õ¶j/8Ç}ÿ\023\016Å\fèøç$?GÖ¢ ZÌ<Jï-mL#úzÏn7Õù\023\013ç\032\026ñ«Ó\0077ù÷\0138à(X*°\027«#®Ã½õ\177\fF®j¡à,à®D\016\r?N²\023hK+\n2Ï­\030U½ñ\035XÊ\027ºd,\000TÚ©Q¡ú¶\"C÷\030\003°~>¾noÇp7\0300qg\tggEmÙþ\020ÌÕ»\b¬\002*}«Ëõ\004G( NÇ)\b±6\\®£©Ô©îS!¹EÒ*´æË;H\032R©ð ¿E®¿í?½\004\003Í)i»\022AÁ\035üÀ  Qþo;² únGs¥^Îêo\fãûªqâ05\002ªÑÀ½·(8`Ò¹M1Aê§¾Ë¯Z\013\004kC\017förY\034ãë½*CåÏ\032æC|ûbÊ%\031²!pèwñÁjAá>>ç\177éÙÞ5oK$\024Êp\005çb7Ö¶)\037\007ú\0137R<Ü\013lfsÇÑ(ÔÆÑï\f\025Üù¾\035¿\001ì±ÓS\036ß'ï\027ÕÖº­-µZ\023Ö!P úÜÍ\020&\005Å¢Oxøz\016z\016M\004\030\032ZÇ)jy\034TÉb3¬$\025KjAeXùÌñ J\023Ù,Ê8¯m×Ùþë!\030Õ\nX\033@5\1771f§1¶_s\"\\ \bÉ!&lÆh¹¼Ú{Jy@M<§P«,ß]~\033\000¶\\ b¥-\016¼§ØpEzààÌ\034°¿á\027\025km1_\017\033ÎPó\020ê1¼¿(²\025\b\037\005Í~\020ÞãW'\027À^4\"úõC\020\002{QäÈ\017\\QH4O¤çzF@hæõ%\027õ«øÃíVÉµµ>³\\\033`'KÂ<(Ø¸Þü×®,«Ùð\027¶+5ÉEç\023\177Ra\033\021;é\023MÂaJDà÷ «\rÜ\026H67yKÏèÚºk \016³\032¶gøaõV'P¯l\032\020|àIn¬ä\016pëük\000Ý{ ß\005\tenh}\030øÒ\026dá¡zs[ðl\177qZ\001\fÚòÐk(²Ç'mR\006V\\Þ\t'g\013R3no\032\024Ê\005ÌÔbÿW\f(?é¯\025\023 \035-X(ç·Jþpà\n%äùVÞFÈÇýÕ\\:Gð\024\027 (n£Mx\030\037ø\001\0133;×q·B4õ\017t\035¹\0370Ü\004]\b\006³­H 7àû g·¸àþ¡c\räÖ§\034Øn*HwP^ï­J[f(bÏ Åw\020á¤{na`\020\000Ã*\024V2þËî Kóá\017a9WfÐÚsk/g\020ÎÙ¨\r5ä$m9\fÉ§_D\0200ÊÑÑöV[,µaÈä¸X\024º0\007\020­ùF<8JWt}ÂÄ\0014ÙÂ©­¿Vy\036c\f!$µsª\"õ\\¡ýé\ncuÂj¢pN\001èY@ªxË$,\177\035}òI­Óýhòud?\177cï:`«Îp"))).length();
    int local16_life24 = 56;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill290_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill290_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill290_29)).doFinal(((byte[])(__sourceSpill290_28)));
        java.lang.String __sourceSpill290_34 = ((java.lang.String)(com.moon.module.impl.StorageEsp.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill290_35 = local20_life19;
        int __sourceSpill290_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill290_35)[__sourceSpill290_36] = __sourceSpill290_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "ïöp\nÜWt¥\"Ò)/\030xÆj£ï¼\030eXÐOjêI½"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill290_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill290_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill290_42)).doFinal(((byte[])(__sourceSpill290_41)));
        java.lang.String __sourceSpill290_47 = ((java.lang.String)(com.moon.module.impl.StorageEsp.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill290_48 = local20_life19;
        int __sourceSpill290_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill290_48)[__sourceSpill290_49] = __sourceSpill290_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    R = ((java.lang.String[])(local20_life19));
    S = ((java.lang.String[])(new java.lang.String[43]));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill290_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill290_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill290_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill290_60 = new byte[8];
    (__sourceSpill290_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill290_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation290_62 = __sourceSpill290_60;
    ((javax.crypto.Cipher)(__sourceSpill290_57)).init(((int)(__sourceSpill290_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill290_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation290_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ÇÎÛDa7\bÜ·ÇëÔEö¯\021Í1"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill290_71 = local4_life67;
        int __sourceSpill290_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill290_71)).substring(((int)(__sourceSpill290_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill290_76 = local6_life65;
        int __sourceSpill290_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill290_79 = new byte[8];
        (__sourceSpill290_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill290_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill290_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill290_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill290_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill290_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill290_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill290_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill290_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill290_80)).doFinal(((byte[])(__sourceSpill290_79)));
        (__sourceSpill290_76)[__sourceSpill290_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    U = ((long[])(local6_life65));
    V = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public com.moon.setting.BooleanSetting i() {
return this.J;
}


public com.moon.setting.ColorSetting i__kX() {
return this.O;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.K;
}


public com.moon.setting.SettingGroup b() {
return this.H;
}


public com.moon.setting.ColorSetting b__kX() {
return this.z;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.t;
}


public com.moon.setting.ColorSetting e__kX() {
return this.E;
}


public com.moon.setting.BooleanSetting e() {
return this.x;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2690_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.StorageEsp.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.BooleanSetting c__kV() {
return this.u;
}


public com.moon.setting.SettingGroup c() {
return this.L;
}


public com.moon.setting.ColorSetting c__kX() {
return this.A;
}


private static java.lang.String c(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill1222_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1222_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1222_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1222_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1222_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1222_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21561);
    if (((com.moon.module.impl.StorageEsp.S)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.StorageEsp.T)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.StorageEsp.T)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/l3", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.module.impl.StorageEsp.R)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.StorageEsp.S)[life5_8] = com.moon.module.impl.StorageEsp.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.StorageEsp.S)[life5_8];
}


public com.moon.setting.ColorSetting h__kX() {
return this.N;
}


public com.moon.setting.BooleanSetting h() {
return this.I;
}


public com.moon.setting.ColorSetting f__kX() {
return this.F;
}


public com.moon.setting.BooleanSetting f() {
return this.C;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2693_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.SettingGroup d() {
return this.P;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.StorageEsp.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27372;
      if (V[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = U[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/l3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public com.moon.setting.BooleanSetting d__kV() {
return this.v;
}


public com.moon.setting.ColorSetting d__kX() {
return this.D;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.w;
}


public com.moon.setting.SettingGroup a() {
return this.B;
}


public com.moon.setting.ColorSetting a__kX() {
return this.y;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.s;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.ColorSetting g__kX() {
return this.M;
}


public com.moon.setting.BooleanSetting g() {
return this.G;
}


private java.lang.Boolean lambda$new$0() {
int forwardValue941_19_0;
    int forwardValue941_23_0;
    int forwardValue941_25_0;
    boolean spill941_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.StorageEsp.Q ^ 79576078696266L);
    life3_5 = com.moon.bY.b();
    spill941_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue941_19_0 = ((spill941_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill941_0)) {
        break forward_join_24;
    }
    forwardValue941_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue941_23_0 = forwardValue941_19_0;
        break forward_join_23;
    }
    if (!((forwardValue941_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue941_23_0 = 1;
    }
    forwardValue941_25_0 = forwardValue941_23_0;
    break forward_join_25;
    }
    forwardValue941_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue941_25_0))));
}


private java.lang.Boolean lambda$new$1() {
int forwardValue942_19_0;
    int forwardValue942_23_0;
    int forwardValue942_25_0;
    boolean spill942_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.StorageEsp.Q ^ 68120085108177L);
    life3_5 = com.moon.bY.b();
    spill942_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue942_19_0 = ((spill942_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill942_0)) {
        break forward_join_24;
    }
    forwardValue942_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue942_23_0 = forwardValue942_19_0;
        break forward_join_23;
    }
    if (!((forwardValue942_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue942_23_0 = 1;
    }
    forwardValue942_25_0 = forwardValue942_23_0;
    break forward_join_25;
    }
    forwardValue942_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue942_25_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_32(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_42(com.moon.module.impl.StorageEsp a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_54(com.moon.module.impl.StorageEsp a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_70(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_75(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_86(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_91(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_104(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_109(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_112(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_122(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_159(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_166(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_169(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_172(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_177(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_180(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_187(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_190(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_197(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_200(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_207(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_210(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_213(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_219(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_236(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_239(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_244(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_247(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_252(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_255(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_264(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_278(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_281(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_288(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_291(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_298(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_301(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ddd667e2153c9afe_originalDynamicSite170_309(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2690_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2693_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
