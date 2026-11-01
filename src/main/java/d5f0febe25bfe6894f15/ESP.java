package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import com.moon.ESP2DArmorColorType;
import com.moon.ESP2DHealthColorType;
import com.moon.ESPTargetType;
import com.moon.bY;
import java.util.Map;
import net.minecraft.entity.Entity;
public class ESP extends com.moon.module.Module {

private com.moon.jb s;

private com.moon.setting.MultiSelectSetting<com.moon.ESPTargetType> t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.FloatSetting y;

private com.moon.setting.BooleanSetting z;

private com.moon.setting.ColorSetting A;

private com.moon.setting.SettingGroup B;

private com.moon.setting.BooleanSetting C;

private com.moon.setting.BooleanSetting D;

private com.moon.setting.ColorSetting E;

private com.moon.setting.SettingGroup F;

private com.moon.setting.BooleanSetting G;

private com.moon.setting.BooleanSetting H;

private com.moon.setting.ModeSetting<com.moon.ESP2DHealthColorType> I;

private com.moon.setting.ColorSetting J;

private com.moon.setting.ColorSetting K;

private com.moon.setting.SettingGroup L;

private com.moon.setting.BooleanSetting M;

private com.moon.setting.ModeSetting<com.moon.ESP2DArmorColorType> N;

private com.moon.setting.ColorSetting O;

private com.moon.setting.ColorSetting P;

private com.moon.setting.SettingGroup Q;

private com.moon.setting.BooleanSetting R;

private com.moon.setting.BooleanSetting S;

private com.moon.setting.BooleanSetting T;

private com.moon.setting.ColorSetting U;

private com.moon.setting.SettingGroup V;

private com.moon.setting.BooleanSetting W;

private com.moon.setting.MultiSelectSetting<com.moon.bU> X;

private com.moon.setting.SettingGroup Y;

private com.moon.setting.BooleanSetting Z;

private com.moon.setting.IntegerSetting aa;

private com.moon.setting.BezierSetting ab;

private com.moon.setting.BooleanSetting ac;

private com.moon.setting.IntegerSetting ad;

private com.moon.setting.FloatSetting ae;

private com.moon.setting.FloatSetting af;

private com.moon.setting.BooleanSetting ag;

private com.moon.setting.SettingGroup ah;

private com.moon.setting.ColorSetting ai;

private com.moon.setting.ColorSetting aj;

private com.moon.setting.ColorSetting ak;

private com.moon.setting.ColorSetting al;

private com.moon.setting.BooleanSetting am;

private com.moon.setting.IntegerSetting an;

private com.moon.setting.FloatSetting ao;

private com.moon.setting.FloatSetting ap;

private com.moon.setting.FloatSetting aq;

private com.moon.setting.SettingGroup ar;

private com.moon.setting.BooleanSetting as;

private com.moon.setting.SettingGroup at;

private com.moon.setting.BooleanSetting au;

private com.moon.setting.BooleanSetting av;

private com.moon.setting.FloatSetting aw;

private com.moon.setting.FloatSetting ax;

private com.moon.setting.FloatSetting ay;

private com.moon.setting.SettingGroup az;

private com.moon.setting.ColorSetting aA;

private com.moon.setting.ColorSetting aB;

private com.moon.setting.SettingGroup aC;

private static long cb;

private static java.lang.String[] kb;

private static java.lang.String[] lb;

private static java.util.Map mb;

private static long[] ob;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public ESP(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_cb7a85f46b88d745(com.moon.module.impl.ESP receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.ESP.cb ^ 76487583335898L);

    com.moon.module.impl.ESP.__sourceConstructorInit_cb7a85f46b88d745_0(((com.moon.module.impl.ESP)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.ESP)(receiver)).s = ((com.moon.jb)(((com.moon.je)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__je())).a()));

    com.moon.module.impl.ESP __sourceSpill25_14 = receiver;

    com.moon.mi __sourceSpill25_15 = com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_9(20909, (1980124650091208447L ^ local5_life2)))), ((java.lang.Class)(com.moon.ESPTargetType.class)));

    java.lang.String __sourceSpill25_16 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_13(13720, (3644813518727887509L ^ local5_life2));

    com.moon.ESPTargetType[] __stackOp25_17_0 = new com.moon.ESPTargetType[1];

    com.moon.ESPTargetType[] __sourceSpill25_19 = __stackOp25_17_0;

    (__stackOp25_17_0)[0] = com.moon.ESPTargetType.PLAYER;

    ((com.moon.module.impl.ESP)(__sourceSpill25_14)).t = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(__sourceSpill25_15)).a(((java.lang.String)(__sourceSpill25_16)), ((java.lang.Enum[])(__sourceSpill25_19))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_24(21038, (8717956550485499242L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_27(2085, (8108001132987778889L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_32(4606, (6125465623958003378L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_35(22923, (6853092587399141080L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_46 = receiver;

    com.moon.l_ __sourceSpill25_47 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_40(11071, (2225139751255483462L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_43(16386, (4487913116143275865L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp25_48_0 = ((com.moon.module.impl.ESP)(receiver)).v;

    com.moon.setting.BooleanSetting __sourceSpill25_50 = __stackOp25_48_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_48_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_46)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill25_47)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_51(__sourceSpill25_50)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_56(8658, (2250896770768383653L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_59(29187, (7946903493220760848L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_61(receiver)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).y = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_66(31888, (2290056806043022251L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_69(8535, (1951719447429623348L ^ local5_life2)))), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((float)(1082130432)), ((float)(1036831949))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_73(receiver)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_84 = receiver;

    com.moon.l_ __sourceSpill25_85 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_78(30682, (5436883303612250315L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_81(24200, (2491524063139877374L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp25_86_0 = ((com.moon.module.impl.ESP)(receiver)).v;

    com.moon.setting.BooleanSetting __sourceSpill25_88 = __stackOp25_86_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_86_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_84)).z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill25_85)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_89(__sourceSpill25_88)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_100 = receiver;

    com.moon.mb __sourceSpill25_101 = ((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_94(18410, (2428270845931571367L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_97(4355, (867710771843702285L ^ local5_life2)))), ((int)(-1)));

    com.moon.setting.BooleanSetting __stackOp25_102_0 = ((com.moon.module.impl.ESP)(receiver)).v;

    com.moon.setting.BooleanSetting __sourceSpill25_104 = __stackOp25_102_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_102_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_100)).A = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(__sourceSpill25_101)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_105(__sourceSpill25_104)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_114 = receiver;

    com.moon.me __sourceSpill25_115 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_116 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_111(15558, (9044286727666742237L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_117_0 = new com.moon.setting.Setting[__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_113(25239, (6637207254061598691L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill25_119 = __stackOp25_117_0;

    (__stackOp25_117_0)[0] = ((com.moon.module.impl.ESP)(receiver)).v;

    com.moon.setting.Setting[] __stackOp25_120_0 = __sourceSpill25_119;

    com.moon.setting.Setting[] __sourceSpill25_122 = __stackOp25_120_0;

    (__stackOp25_120_0)[1] = ((com.moon.module.impl.ESP)(receiver)).w;

    com.moon.setting.Setting[] __stackOp25_123_0 = __sourceSpill25_122;

    com.moon.setting.Setting[] __sourceSpill25_125 = __stackOp25_123_0;

    (__stackOp25_123_0)[2] = ((com.moon.module.impl.ESP)(receiver)).x;

    com.moon.setting.Setting[] __stackOp25_126_0 = __sourceSpill25_125;

    com.moon.setting.Setting[] __sourceSpill25_128 = __stackOp25_126_0;

    (__stackOp25_126_0)[3] = ((com.moon.module.impl.ESP)(receiver)).y;

    com.moon.setting.Setting[] __stackOp25_129_0 = __sourceSpill25_128;

    com.moon.setting.Setting[] __sourceSpill25_131 = __stackOp25_129_0;

    (__stackOp25_129_0)[4] = ((com.moon.module.impl.ESP)(receiver)).z;

    com.moon.setting.Setting[] __stackOp25_132_0 = __sourceSpill25_131;

    com.moon.setting.Setting[] __sourceSpill25_134 = __stackOp25_132_0;

    (__stackOp25_132_0)[5] = ((com.moon.module.impl.ESP)(receiver)).A;

    ((com.moon.module.impl.ESP)(__sourceSpill25_114)).B = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_115)).a(((java.lang.String)(__sourceSpill25_116)), ((com.moon.setting.Setting[])(__sourceSpill25_134))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_139(16840, (1539917752672046771L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_142(27491, (4919863832378434603L ^ local5_life2)))), ((boolean)(true))))).a()));

    net.minecraft.entity.Entity[] __sourceSpill25_154 = com.moon.bY.b();

    com.moon.module.impl.ESP __sourceSpill25_155 = receiver;

    com.moon.l_ __sourceSpill25_156 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_148(20286, (3010430553822740537L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_151(1168, (4601888649945582585L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp25_157_0 = ((com.moon.module.impl.ESP)(receiver)).C;

    com.moon.setting.BooleanSetting __sourceSpill25_159 = __stackOp25_157_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_157_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_155)).D = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill25_156)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_160(__sourceSpill25_159)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).E = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_165(23515, (6089289786503419079L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_168(8357, (8905591816482500506L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_170(receiver)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_177 = receiver;

    com.moon.me __sourceSpill25_178 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_179 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_176(22115, (8973228627665967367L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_180_0 = new com.moon.setting.Setting[3];

    com.moon.setting.Setting[] __sourceSpill25_182 = __stackOp25_180_0;

    (__stackOp25_180_0)[0] = ((com.moon.module.impl.ESP)(receiver)).C;

    com.moon.setting.Setting[] __stackOp25_183_0 = __sourceSpill25_182;

    com.moon.setting.Setting[] __sourceSpill25_185 = __stackOp25_183_0;

    (__stackOp25_183_0)[1] = ((com.moon.module.impl.ESP)(receiver)).D;

    com.moon.setting.Setting[] __stackOp25_186_0 = __sourceSpill25_185;

    com.moon.setting.Setting[] __sourceSpill25_188 = __stackOp25_186_0;

    (__stackOp25_186_0)[2] = ((com.moon.module.impl.ESP)(receiver)).E;

    ((com.moon.module.impl.ESP)(__sourceSpill25_177)).F = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_178)).a(((java.lang.String)(__sourceSpill25_179)), ((com.moon.setting.Setting[])(__sourceSpill25_188))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).G = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_193(25377, (8927718902315772988L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_196(27491, (4919863832378434603L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_207 = receiver;

    com.moon.l_ __sourceSpill25_208 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_201(5874, (2970464722385410484L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_204(30844, (6724163607504713541L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp25_209_0 = ((com.moon.module.impl.ESP)(receiver)).G;

    com.moon.setting.BooleanSetting __sourceSpill25_211 = __stackOp25_209_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_209_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_207)).H = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill25_208)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_212(__sourceSpill25_211)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_225 = receiver;

    com.moon.mc __sourceSpill25_226 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_217(5249, (6382228858923523012L ^ local5_life2)))), ((java.lang.Class)(com.moon.ESP2DHealthColorType.class))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_221(6697, (2853893537777882417L ^ local5_life2)))), ((java.lang.Enum)(com.moon.ESP2DHealthColorType.NORMAL)));

    com.moon.setting.BooleanSetting __stackOp25_227_0 = ((com.moon.module.impl.ESP)(receiver)).G;

    com.moon.setting.BooleanSetting __sourceSpill25_229 = __stackOp25_227_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_227_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_225)).I = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill25_226)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_230(__sourceSpill25_229)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).J = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_235(21926, (8131981102424316667L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_238(8357, (8905591816482500506L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_240(receiver)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).K = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_245(10188, (2497144400418252946L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_248(17413, (4498951227894909781L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB()))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_252(receiver)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_259 = receiver;

    com.moon.me __sourceSpill25_260 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_261 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_258(17710, (878504110303496800L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_262_0 = new com.moon.setting.Setting[5];

    com.moon.setting.Setting[] __sourceSpill25_264 = __stackOp25_262_0;

    (__stackOp25_262_0)[0] = ((com.moon.module.impl.ESP)(receiver)).G;

    com.moon.setting.Setting[] __stackOp25_265_0 = __sourceSpill25_264;

    com.moon.setting.Setting[] __sourceSpill25_267 = __stackOp25_265_0;

    (__stackOp25_265_0)[1] = ((com.moon.module.impl.ESP)(receiver)).H;

    com.moon.setting.Setting[] __stackOp25_268_0 = __sourceSpill25_267;

    com.moon.setting.Setting[] __sourceSpill25_270 = __stackOp25_268_0;

    (__stackOp25_268_0)[2] = ((com.moon.module.impl.ESP)(receiver)).I;

    com.moon.setting.Setting[] __stackOp25_271_0 = __sourceSpill25_270;

    com.moon.setting.Setting[] __sourceSpill25_273 = __stackOp25_271_0;

    (__stackOp25_271_0)[3] = ((com.moon.module.impl.ESP)(receiver)).J;

    com.moon.setting.Setting[] __stackOp25_274_0 = __sourceSpill25_273;

    com.moon.setting.Setting[] __sourceSpill25_276 = __stackOp25_274_0;

    (__stackOp25_274_0)[4] = ((com.moon.module.impl.ESP)(receiver)).K;

    ((com.moon.module.impl.ESP)(__sourceSpill25_259)).L = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_260)).a(((java.lang.String)(__sourceSpill25_261)), ((com.moon.setting.Setting[])(__sourceSpill25_276))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).M = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_281(6296, (8229958106294982546L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_284(27491, (4919863832378434603L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_297 = receiver;

    com.moon.mc __sourceSpill25_298 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_289(19052, (5509026277590091030L ^ local5_life2)))), ((java.lang.Class)(com.moon.ESP2DArmorColorType.class))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_293(31891, (3403938495448249235L ^ local5_life2)))), ((java.lang.Enum)(com.moon.ESP2DArmorColorType.STATIC)));

    com.moon.setting.BooleanSetting __stackOp25_299_0 = ((com.moon.module.impl.ESP)(receiver)).M;

    com.moon.setting.BooleanSetting __sourceSpill25_301 = __stackOp25_299_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_299_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_297)).N = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill25_298)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_302(__sourceSpill25_301)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_313 = receiver;

    com.moon.mb __sourceSpill25_314 = ((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_307(27720, (3236984423824024327L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_310(8357, (8905591816482500506L ^ local5_life2)))), ((int)(-1)));

    com.moon.setting.BooleanSetting __stackOp25_315_0 = ((com.moon.module.impl.ESP)(receiver)).M;

    com.moon.setting.BooleanSetting __sourceSpill25_317 = __stackOp25_315_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_315_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_313)).O = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(__sourceSpill25_314)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_318(__sourceSpill25_317)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).P = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_323(25762, (1083950158175595451L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_326(13889, (3845984799968639313L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB()))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_330(receiver)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_337 = receiver;

    com.moon.me __sourceSpill25_338 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_339 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_336(5840, (2152399217888991722L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_340_0 = new com.moon.setting.Setting[4];

    com.moon.setting.Setting[] __sourceSpill25_342 = __stackOp25_340_0;

    (__stackOp25_340_0)[0] = ((com.moon.module.impl.ESP)(receiver)).M;

    com.moon.setting.Setting[] __stackOp25_343_0 = __sourceSpill25_342;

    com.moon.setting.Setting[] __sourceSpill25_345 = __stackOp25_343_0;

    (__stackOp25_343_0)[1] = ((com.moon.module.impl.ESP)(receiver)).N;

    com.moon.setting.Setting[] __stackOp25_346_0 = __sourceSpill25_345;

    com.moon.setting.Setting[] __sourceSpill25_348 = __stackOp25_346_0;

    (__stackOp25_346_0)[2] = ((com.moon.module.impl.ESP)(receiver)).O;

    com.moon.setting.Setting[] __stackOp25_349_0 = __sourceSpill25_348;

    com.moon.setting.Setting[] __sourceSpill25_351 = __stackOp25_349_0;

    (__stackOp25_349_0)[3] = ((com.moon.module.impl.ESP)(receiver)).P;

    com.moon.me __sourceSpill25_354 = ((com.moon.me)(__sourceSpill25_338)).a(((java.lang.String)(__sourceSpill25_339)), ((com.moon.setting.Setting[])(__sourceSpill25_351)));

    com.moon.setting.BooleanSetting __stackOp25_355_0 = ((com.moon.module.impl.ESP)(receiver)).u;

    com.moon.setting.BooleanSetting __sourceSpill25_357 = __stackOp25_355_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_355_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_337)).Q = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_354)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_358(__sourceSpill25_357)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).R = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_363(13285, (8855527185789500593L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_366(27491, (4919863832378434603L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_377 = receiver;

    com.moon.l_ __sourceSpill25_378 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_371(6126, (7581969239031847096L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_374(17945, (6398491039959861612L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp25_379_0 = ((com.moon.module.impl.ESP)(receiver)).R;

    com.moon.setting.BooleanSetting __sourceSpill25_381 = __stackOp25_379_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_379_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_377)).S = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill25_378)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_382(__sourceSpill25_381)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_393 = receiver;

    com.moon.l_ __sourceSpill25_394 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_387(17581, (6820255920352480183L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_390(3008, (7179081187671868568L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp25_395_0 = ((com.moon.module.impl.ESP)(receiver)).R;

    com.moon.setting.BooleanSetting __sourceSpill25_397 = __stackOp25_395_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_395_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_393)).T = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill25_394)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_398(__sourceSpill25_397)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).U = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_403(20177, (2386965326196359637L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_406(8357, (8905591816482500506L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_408(receiver)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_415 = receiver;

    com.moon.me __sourceSpill25_416 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_417 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_414(13718, (7530177051180907138L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_418_0 = new com.moon.setting.Setting[4];

    com.moon.setting.Setting[] __sourceSpill25_420 = __stackOp25_418_0;

    (__stackOp25_418_0)[0] = ((com.moon.module.impl.ESP)(receiver)).R;

    com.moon.setting.Setting[] __stackOp25_421_0 = __sourceSpill25_420;

    com.moon.setting.Setting[] __sourceSpill25_423 = __stackOp25_421_0;

    (__stackOp25_421_0)[1] = ((com.moon.module.impl.ESP)(receiver)).S;

    com.moon.setting.Setting[] __stackOp25_424_0 = __sourceSpill25_423;

    com.moon.setting.Setting[] __sourceSpill25_426 = __stackOp25_424_0;

    (__stackOp25_424_0)[2] = ((com.moon.module.impl.ESP)(receiver)).T;

    com.moon.setting.Setting[] __stackOp25_427_0 = __sourceSpill25_426;

    com.moon.setting.Setting[] __sourceSpill25_429 = __stackOp25_427_0;

    (__stackOp25_427_0)[3] = ((com.moon.module.impl.ESP)(receiver)).U;

    ((com.moon.module.impl.ESP)(__sourceSpill25_415)).V = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_416)).a(((java.lang.String)(__sourceSpill25_417)), ((com.moon.setting.Setting[])(__sourceSpill25_429))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).W = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_434(12118, (126826627984302160L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_437(27491, (4919863832378434603L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_447 = receiver;

    com.moon.mi __sourceSpill25_448 = com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_442(27303, (8289324288661087693L ^ local5_life2)))), ((java.lang.Class)(com.moon.bU.class)));

    java.lang.String __sourceSpill25_449 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_446(22773, (4454469421965334436L ^ local5_life2));

    com.moon.bU[] __stackOp25_450_0 = new com.moon.bU[1];

    com.moon.bU[] __sourceSpill25_452 = __stackOp25_450_0;

    (__stackOp25_450_0)[0] = com.moon.bU.BLOCK;

    com.moon.mi __sourceSpill25_455 = ((com.moon.mi)(__sourceSpill25_448)).a(((java.lang.String)(__sourceSpill25_449)), ((java.lang.Enum[])(__sourceSpill25_452)));

    com.moon.setting.BooleanSetting __stackOp25_456_0 = ((com.moon.module.impl.ESP)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill25_458 = __stackOp25_456_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_456_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_447)).X = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(__sourceSpill25_455)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_459(__sourceSpill25_458)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_466 = receiver;

    com.moon.me __sourceSpill25_467 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_468 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_465(24295, (192664787103109513L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_469_0 = new com.moon.setting.Setting[2];

    com.moon.setting.Setting[] __sourceSpill25_471 = __stackOp25_469_0;

    (__stackOp25_469_0)[0] = ((com.moon.module.impl.ESP)(receiver)).W;

    com.moon.setting.Setting[] __stackOp25_472_0 = __sourceSpill25_471;

    com.moon.setting.Setting[] __sourceSpill25_474 = __stackOp25_472_0;

    (__stackOp25_472_0)[1] = ((com.moon.module.impl.ESP)(receiver)).X;

    ((com.moon.module.impl.ESP)(__sourceSpill25_466)).Y = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_467)).a(((java.lang.String)(__sourceSpill25_468)), ((com.moon.setting.Setting[])(__sourceSpill25_474))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).Z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_479(2388, (4453132806062933592L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_482(1421, (8302676884159924876L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).aa = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_487(28668, (2411755888633372819L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_490(17398, (5632410317207489684L ^ local5_life2)))), ((int)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_492(12949, (7059411351598798819L ^ local5_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_494(16804, (8887091713043064017L ^ local5_life2)))), ((int)(1))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_505 = receiver;

    com.moon.l9 __sourceSpill25_506 = ((com.moon.l9)(com.moon.setting.BezierSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_499(4897, (7389753648970210333L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_502(6194, (4820965175455618828L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(1050253722)));

    float[][] __stackOp25_507_0 = new float[2][];

    float[][] __sourceSpill25_508 = __stackOp25_507_0;

    float[][] __sourceSpill25_509 = __stackOp25_507_0;

    int __sourceSpill25_510 = 0;

    float[] __stackOp25_511_0 = new float[2];

    float[] __sourceSpill25_513 = __stackOp25_511_0;

    (__stackOp25_511_0)[0] = 1048576000;

    float[] __stackOp25_514_0 = __sourceSpill25_513;

    float[] __sourceSpill25_515 = __stackOp25_514_0;

    (__stackOp25_514_0)[1] = 0x1.0p0f;

    (__sourceSpill25_509)[__sourceSpill25_510] = __sourceSpill25_515;

    float[][] __stackOp25_516_0 = __sourceSpill25_508;

    float[][] __sourceSpill25_517 = __stackOp25_516_0;

    float[][] __sourceSpill25_518 = __stackOp25_516_0;

    int __sourceSpill25_519 = 1;

    float[] __stackOp25_520_0 = new float[2];

    float[] __sourceSpill25_522 = __stackOp25_520_0;

    (__stackOp25_520_0)[0] = 1058642330;

    float[] __stackOp25_523_0 = __sourceSpill25_522;

    float[] __sourceSpill25_524 = __stackOp25_523_0;

    (__stackOp25_523_0)[1] = 0x1.0p0f;

    (__sourceSpill25_518)[__sourceSpill25_519] = __sourceSpill25_524;

    ((com.moon.module.impl.ESP)(__sourceSpill25_505)).ab = ((com.moon.setting.BezierSetting)(((com.moon.l9)(((com.moon.l9)(__sourceSpill25_506)).a(((float[][])(__sourceSpill25_517))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).ac = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_529(22097, (8962418862654904678L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_532(24464, (2085661542586208402L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_543 = receiver;

    com.moon.mf __sourceSpill25_544 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_537(10257, (518588310643222373L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_540(21415, (6409173883049860308L ^ local5_life2)))), ((int)(2)), ((int)(1)), ((int)(5)), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp25_545_0 = ((com.moon.module.impl.ESP)(receiver)).ac;

    com.moon.setting.BooleanSetting __sourceSpill25_547 = __stackOp25_545_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_545_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_543)).ad = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill25_544)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_548(__sourceSpill25_547)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_562 = receiver;

    com.moon.md __sourceSpill25_563 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_553(5495, (2036575429395356256L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_556(23089, (8796526033536996721L ^ local5_life2)))), ((float)(1077936128)), ((float)(0x1.0p0f)), ((float)(1092616192)), ((float)(1036831949)));

    com.moon.setting.BooleanSetting __stackOp25_564_0 = ((com.moon.module.impl.ESP)(receiver)).ac;

    com.moon.setting.BooleanSetting __sourceSpill25_566 = __stackOp25_564_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_564_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_562)).ae = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(__sourceSpill25_563)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_567(__sourceSpill25_566)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_580 = receiver;

    com.moon.md __sourceSpill25_581 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_572(23040, (2674976222549693809L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_575(28919, (3749378555610103703L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(1077936128)), ((float)(1036831949)));

    com.moon.setting.BooleanSetting __stackOp25_582_0 = ((com.moon.module.impl.ESP)(receiver)).ac;

    com.moon.setting.BooleanSetting __sourceSpill25_584 = __stackOp25_582_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_582_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_580)).af = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(__sourceSpill25_581)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_585(__sourceSpill25_584)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_596 = receiver;

    com.moon.l_ __sourceSpill25_597 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_590(2707, (5638293770328180178L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_593(24828, (3566234394769289162L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp25_598_0 = ((com.moon.module.impl.ESP)(receiver)).ac;

    com.moon.setting.BooleanSetting __sourceSpill25_600 = __stackOp25_598_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_598_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_596)).ag = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill25_597)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_601(__sourceSpill25_600)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_610 = receiver;

    com.moon.me __sourceSpill25_611 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_612 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_607(18010, (610550575946320162L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_613_0 = new com.moon.setting.Setting[__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_609(2719, (3260567596944764911L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill25_615 = __stackOp25_613_0;

    (__stackOp25_613_0)[0] = ((com.moon.module.impl.ESP)(receiver)).aa;

    com.moon.setting.Setting[] __stackOp25_616_0 = __sourceSpill25_615;

    com.moon.setting.Setting[] __sourceSpill25_618 = __stackOp25_616_0;

    (__stackOp25_616_0)[1] = ((com.moon.module.impl.ESP)(receiver)).ab;

    com.moon.setting.Setting[] __stackOp25_619_0 = __sourceSpill25_618;

    com.moon.setting.Setting[] __sourceSpill25_621 = __stackOp25_619_0;

    (__stackOp25_619_0)[2] = ((com.moon.module.impl.ESP)(receiver)).ac;

    com.moon.setting.Setting[] __stackOp25_622_0 = __sourceSpill25_621;

    com.moon.setting.Setting[] __sourceSpill25_624 = __stackOp25_622_0;

    (__stackOp25_622_0)[3] = ((com.moon.module.impl.ESP)(receiver)).ad;

    com.moon.setting.Setting[] __stackOp25_625_0 = __sourceSpill25_624;

    com.moon.setting.Setting[] __sourceSpill25_627 = __stackOp25_625_0;

    (__stackOp25_625_0)[4] = ((com.moon.module.impl.ESP)(receiver)).ae;

    com.moon.setting.Setting[] __stackOp25_628_0 = __sourceSpill25_627;

    com.moon.setting.Setting[] __sourceSpill25_630 = __stackOp25_628_0;

    (__stackOp25_628_0)[5] = ((com.moon.module.impl.ESP)(receiver)).af;

    com.moon.setting.Setting[] __stackOp25_631_0 = __sourceSpill25_630;

    com.moon.setting.Setting[] __sourceSpill25_635 = __stackOp25_631_0;

    (__stackOp25_631_0)[__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_633(28234, (9041857543386254131L ^ local5_life2))] = ((com.moon.module.impl.ESP)(receiver)).ag;

    ((com.moon.module.impl.ESP)(__sourceSpill25_610)).ah = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_611)).a(((java.lang.String)(__sourceSpill25_612)), ((com.moon.setting.Setting[])(__sourceSpill25_635))))).a()));

    net.minecraft.entity.Entity[] local7_life639 = __sourceSpill25_154;

    ((com.moon.module.impl.ESP)(receiver)).ai = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_641(23964, (4113633521330672279L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_644(9406, (4797623659992132568L ^ local5_life2)))), ((int)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_646(21070, (5693183095459346228L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_648(receiver)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).aj = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_653(31561, (2685666459098117156L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_656(8286, (4116757816551026486L ^ local5_life2)))), ((int)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_658(18128, (781352370059469736L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_660(receiver)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).ak = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_665(27266, (335817065732597225L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_668(21937, (5719093750605961960L ^ local5_life2)))), ((int)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_670(32761, (2838845809647835787L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_672(receiver)))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).al = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_677(30965, (5802371104650196918L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_680(9307, (3587122671833000705L ^ local5_life2)))), ((int)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_682(23721, (8055673628475914714L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).am = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_687(28319, (7218223383804076509L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_690(1065, (6993164065540574069L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).an = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_695(23371, (1842968992617419835L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_698(6546, (1088379212804134599L ^ local5_life2)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_700(9251, (9181847009023263060L ^ local5_life2)))), ((int)(1))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).ao = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_705(3732, (2234900836284334547L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_708(7455, (4555276638438199847L ^ local5_life2)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(1028443341))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).ap = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_714(31140, (6916853697856599723L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_717(24236, (5667524817055142322L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(1084227584)), ((float)(1028443341))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).aq = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_724(31587, (3352386949410419772L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_727(26226, (6324316943278139662L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(1084227584)), ((float)(1028443341))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_736 = receiver;

    com.moon.me __sourceSpill25_737 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_738 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_735(4318, (1050723078555803607L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_739_0 = new com.moon.setting.Setting[4];

    com.moon.setting.Setting[] __sourceSpill25_741 = __stackOp25_739_0;

    (__stackOp25_739_0)[0] = ((com.moon.module.impl.ESP)(receiver)).an;

    com.moon.setting.Setting[] __stackOp25_742_0 = __sourceSpill25_741;

    com.moon.setting.Setting[] __sourceSpill25_744 = __stackOp25_742_0;

    (__stackOp25_742_0)[1] = ((com.moon.module.impl.ESP)(receiver)).ao;

    com.moon.setting.Setting[] __stackOp25_745_0 = __sourceSpill25_744;

    com.moon.setting.Setting[] __sourceSpill25_747 = __stackOp25_745_0;

    (__stackOp25_745_0)[2] = ((com.moon.module.impl.ESP)(receiver)).ap;

    com.moon.setting.Setting[] __stackOp25_748_0 = __sourceSpill25_747;

    com.moon.setting.Setting[] __sourceSpill25_750 = __stackOp25_748_0;

    (__stackOp25_748_0)[3] = ((com.moon.module.impl.ESP)(receiver)).aq;

    ((com.moon.module.impl.ESP)(__sourceSpill25_736)).ar = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_737)).a(((java.lang.String)(__sourceSpill25_738)), ((com.moon.setting.Setting[])(__sourceSpill25_750))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).as = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_755(26248, (3251992028103469559L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_758(17400, (4234126164110757101L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_765 = receiver;

    com.moon.me __sourceSpill25_766 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_767 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_764(16959, (554830883056995672L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_768_0 = new com.moon.setting.Setting[4];

    com.moon.setting.Setting[] __sourceSpill25_770 = __stackOp25_768_0;

    (__stackOp25_768_0)[0] = ((com.moon.module.impl.ESP)(receiver)).ai;

    com.moon.setting.Setting[] __stackOp25_771_0 = __sourceSpill25_770;

    com.moon.setting.Setting[] __sourceSpill25_773 = __stackOp25_771_0;

    (__stackOp25_771_0)[1] = ((com.moon.module.impl.ESP)(receiver)).aj;

    com.moon.setting.Setting[] __stackOp25_774_0 = __sourceSpill25_773;

    com.moon.setting.Setting[] __sourceSpill25_776 = __stackOp25_774_0;

    (__stackOp25_774_0)[2] = ((com.moon.module.impl.ESP)(receiver)).ak;

    com.moon.setting.Setting[] __stackOp25_777_0 = __sourceSpill25_776;

    com.moon.setting.Setting[] __sourceSpill25_779 = __stackOp25_777_0;

    (__stackOp25_777_0)[3] = ((com.moon.module.impl.ESP)(receiver)).al;

    ((com.moon.module.impl.ESP)(__sourceSpill25_765)).at = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_766)).a(((java.lang.String)(__sourceSpill25_767)), ((com.moon.setting.Setting[])(__sourceSpill25_779))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).au = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_784(14912, (2708435318556210442L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_787(31685, (6596087805279958176L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).av = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_792(22471, (1625326021986605200L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_795(227, (4382306754310574069L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).aw = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_800(17367, (5275677708061625526L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_803(14699, (6502325820512450152L ^ local5_life2)))), ((float)(1050253722)), ((float)(1008981770)), ((float)(0x1.0p0f)), ((float)(1008981770))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).ax = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_811(5823, (6525466618406771117L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_814(32665, (352031659006882000L ^ local5_life2)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(1008981770))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).ay = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_820(11421, (7518664628775461792L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_823(18315, (6060125422600669326L ^ local5_life2)))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(1008981770))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_831 = receiver;

    com.moon.me __sourceSpill25_832 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_833 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_830(2366, (4835177557859305077L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_834_0 = new com.moon.setting.Setting[5];

    com.moon.setting.Setting[] __sourceSpill25_836 = __stackOp25_834_0;

    (__stackOp25_834_0)[0] = ((com.moon.module.impl.ESP)(receiver)).au;

    com.moon.setting.Setting[] __stackOp25_837_0 = __sourceSpill25_836;

    com.moon.setting.Setting[] __sourceSpill25_839 = __stackOp25_837_0;

    (__stackOp25_837_0)[1] = ((com.moon.module.impl.ESP)(receiver)).av;

    com.moon.setting.Setting[] __stackOp25_840_0 = __sourceSpill25_839;

    com.moon.setting.Setting[] __sourceSpill25_842 = __stackOp25_840_0;

    (__stackOp25_840_0)[2] = ((com.moon.module.impl.ESP)(receiver)).aw;

    com.moon.setting.Setting[] __stackOp25_843_0 = __sourceSpill25_842;

    com.moon.setting.Setting[] __sourceSpill25_845 = __stackOp25_843_0;

    (__stackOp25_843_0)[3] = ((com.moon.module.impl.ESP)(receiver)).ax;

    com.moon.setting.Setting[] __stackOp25_846_0 = __sourceSpill25_845;

    com.moon.setting.Setting[] __sourceSpill25_848 = __stackOp25_846_0;

    (__stackOp25_846_0)[4] = ((com.moon.module.impl.ESP)(receiver)).ay;

    ((com.moon.module.impl.ESP)(__sourceSpill25_831)).az = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_832)).a(((java.lang.String)(__sourceSpill25_833)), ((com.moon.setting.Setting[])(__sourceSpill25_848))))).a()));

    ((com.moon.module.impl.ESP)(receiver)).aA = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_853(28406, (6305419590223159688L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_856(21539, (8525347234649398076L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.BLUE)).getRGB()))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_871 = receiver;

    com.moon.mb __sourceSpill25_872 = ((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_863(14093, (5553889718542809215L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_866(3305, (3916166048147637217L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB())));

    com.moon.setting.BooleanSetting __stackOp25_873_0 = ((com.moon.module.impl.ESP)(receiver)).au;

    com.moon.setting.BooleanSetting __sourceSpill25_875 = __stackOp25_873_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp25_873_0)));

    ((com.moon.module.impl.ESP)(__sourceSpill25_871)).aB = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(__sourceSpill25_872)).a(((java.util.function.Supplier)(__sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_876(__sourceSpill25_875)))))).a()));

    com.moon.module.impl.ESP __sourceSpill25_883 = receiver;

    com.moon.me __sourceSpill25_884 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill25_885 = __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_882(20580, (5470434314569998105L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp25_886_0 = new com.moon.setting.Setting[2];

    com.moon.setting.Setting[] __sourceSpill25_888 = __stackOp25_886_0;

    (__stackOp25_886_0)[0] = ((com.moon.module.impl.ESP)(receiver)).aA;

    com.moon.setting.Setting[] __stackOp25_889_0 = __sourceSpill25_888;

    com.moon.setting.Setting[] __sourceSpill25_891 = __stackOp25_889_0;

    (__stackOp25_889_0)[1] = ((com.moon.module.impl.ESP)(receiver)).aB;

    ((com.moon.module.impl.ESP)(__sourceSpill25_883)).aC = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill25_884)).a(((java.lang.String)(__sourceSpill25_885)), ((com.moon.setting.Setting[])(__sourceSpill25_891))))).a()));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.bY.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));

    }

    return;

}



static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-827817283806296683L)), ((long)(294932936658976801L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(26554452903651L)))));
    mb = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.ESP.cb ^ 132045504384096L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill270_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill270_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill270_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill270_14 = new byte[8];
    (__sourceSpill270_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill270_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation270_16 = __sourceSpill270_14;
    ((javax.crypto.Cipher)(__sourceSpill270_11)).init(((int)(__sourceSpill270_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill270_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation270_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[106];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ÂaÇ\000«&¡øÞÎ¾eIf²ó.\036§*«é>n \000añl¯\036¬À²¯\035ß(Ã\r¹ùì=\027Ê÷à¿*`;Ð®\023\034»S6AZä\035YJXùN¡¨Tèã\020Û÷-®ê$Ù[Hh\000ö¾P(\023ïGçoP\\I\002Väñ'\b\rÐ¥\020±¹[+1\177[è¼s\002£\031[åÚ\020Ú\030nf¿_Å\034]¦#£ÈMX\026acA\004öH\021\\Ç¸ úÃ=5\022ê3ßü3\001qO r¹uú±Z%Á<Ã{°|\020ÌVõM%\177ÁVTA\003É÷2\030(T\023\fÆ©|Î\006ÖÏ¼ôÅTËî·'¨*¢ ìð41 p}²â\t»J²ºúöÐHBëmÖ²ê\"\fÛµg \036NQÝÄPòýI\035ôÐÍA\"|«i\020íKúAE³áª/()á©År3\020¬g>®ð\034L¯D¾1¹§ÈvV-£©åçªÿÙRk Úm»üëíBd,uï&\022\030µOÍSjáøàMÀck¤\020sÔ5BÏ÷Á/ûMÂo;×µ[\020Äh\037\027{=\035)\033¾H9\030ï\000\003¥ýd¥èv\"kðñ&tÏbÝ\000B\020bòMÙ\\\002#Û{8\001\036N ²àÖÿô[lyÞ\rÙU$¹4¯\002X©#\006<â­?é DõGP\"¼\023aP5Y«ä_T\016CÃ\023ê¾\0320À%\030(kÝd<;e-{ s\tû¾\030²\re±Q­!!RË\006U¢¥ÝD{w\030ô:ÕæéÖtT[\013öbí6áPÏÔÓIê ,Õ;\007Ó\177\tÚ\027\007@ª\tX|?\0321W\rñ\026µqß\033X¤ñ\030ÉHó¢cXÅü~ ¸Ýï­Å!#n!ÿ5dS\020\005ß\032¼\016)ï\001\006ó~øbÔ ûê×%Òd#öµHòOPÂWIîÃ\026dÑEÖÈ¾WK\n(Z\025¼1)\\+ä% qµÐªc\021\006ÐüÍ1ÍÃî\020fo1­\013.û,\034¸Ý(£\000|\t\0026^îò<\032;ë¦³¨;ÿMâµ°ó©X$\náÒjL÷G%\001~~k\020PP3\022;ÑcOÜðæ!\037\r(P=\006ï\0229ÄqG©q8HhWq3Õd´Â\023Nè9\034ÞgÄ½²\023×5*îµ\020ªÀAkàSÖä°Ö^¢ÿg îÍ¬Ûã\037'4Ë\020¥eoBÃÖs[×OV\026ÇU\013S(%)\020n\027þXZ$\025I\004j=[ !ê¢hDdÆ&Ëæ\177\\õ¸\013Ö [»¢%\0246´Ä\n(YÍÐ\024§¦èß×v55Ç<à\032¢»íì\t6W?\020SA-ÚµtM·\020pØÃ\016uQh(\025ÊYíj`(@i·<\027àÆGÖBt$ß1-TBSè\025¿ïåûEw¦©i4l¿îþ \"ÚFü;+8\013\003u\trç^xXw×|!T³rLÆA\037 É(@\037DEüÚ\002 ÞÅ1VÁr3m\"?ÖÛè±K\032sAK:èpû6[\031Ûx0î\035\005Y¬¨5\026G®ÄuM¾\007º¬Úá<æ8é?mz\026~³Y¥3Kù8`\016*ÿIý(§ÊÙ?@úÛ×-ë)R\004üA!¹ÇÚ½V\004uÒ.\023\030s\0072¯ôG(²¯Úé\fvvò(\033yá*Ê[ü­F×b¾ÿ\022IbjwÌ¶¡¹¼+\017´\020­³4-¯m\032c\f5##\016\0258åô\035!\031\020x=\026\013ÚrÆ§ê»\177\022©ÆA.\020§Ðd¡Z\036Çä\032g\0047UÂ¢¾\"îvQU¦Ìª\017çâf+W\030ÕY@ý\003Äñ*ÐlHÕ\006äÛÜ2\020ö\001/ê&\002yn±³Î(³Iv\002LÓw\r>xVeõ\021õ\004úÍæ§òu[Ñ\004^¡\031÷²2äÅV\030\035®à¹½²\007nÁ\002LöF¿\002¥\033N8ÜëCÀcøÅÓ¯]åû\031\022e¾ªNé$ý`NYX5Sæ©½*\bê4v\021rëÏHö®wäá÷\030Êïí\034î\035\031¿òÕXÔ8\000¶«^v\033\r(\013ü¯OQ$¨!]ò«ç!ã1\177&à@°\017¡ÔAlë(1s¦(55\fàf@(Ùê/]»ú%5ý\bêúUÒ)ë ¼ÁTªhÚÔ-à%\002>\022Ç5Õ$£\026\037\020.ó4çS²\003£ïûÃv(\030«öJno°XC\036\017ûô\033®©\035¨F¼Ïiy­*.eÐ<x¾ò? 0W×\017>cõhª²Zö©w\000Öø¹T%;\r µ\033ùmö§SÊ\021\177\fx«FQk\034¼M-h\030CS(ßNB* }G®5¼\023ÄÿÙ*×E) U­>¦hGp2\"IÁ¤D\031QÒê\027Ê\021\004×¢ðëèQÓ\030^\031(%\023\007ãä\177¥y=éPfE.¤ÅL Ï2pçµ?\000°Ø\031\031\bc`aµ>â¤#@\023Ðè:¥­Òa Ù¢£è¯dfËÀÅ;Bã¾-(É\030ÍÔµ®Mh·®}Óæ\030l³]ÑâæÁ(¦Ç\005²ÌÿÁ5\030áþÈ×»å Ä¦7#óõL¢Þ¡e9slO¹\026Økõ÷Ô6p×]Oö\030kö{\b·pCñ2\r\rÚnVcÑ1-Q5] eô~Ð\020Y5J^\035)êÛô¨\027½\017{Ó^\020\037\\÷ÆÓ\030\024vùÏÞ\034Å´¬F¡Õmõû\"ñ«ê½g ç¦ø{¿wÁY\027G1ÉýQRî<bä\027nÃÄýI\177¦Ë({Ð=Õ{¼re¸&\021á#ÄÔqÞ@&\016-¯Xe{©?L2Ì>¥\037Ì\026­ ÛEÇ\004ÐÔ\037÷Êºf»,\004¾\016¡\034]XÌíàÄÝ³\016U\035(\023RÖÌ_P\006É5s`Ðÿ\f\033ë\017ubüÏU´q5\033&\036\034F\006W«(ÌÔ(ÉÏd§úúÈUI­d§ØJ¤¾RL³ \0237;O«ä×2\033a\\±\030üíg@º,{ÃÝ,$¸Òº2Ía#$÷\027Û\030Ú\030dÅ¹¼I#\0270¶ãÚßp¡¤ì\024»TÓ\030Êùì\032Ôj£·%&=\020y±\bg\"%Õ¥\031òã0S\nµ_¸n\177Õæ<>ÿ3nxî?ÂfòÉú\177ß`J\020\020a\0245\006ÅÌæ?:qã\001×\020Ê}¹\nØ£\n\\æ#¤¡Ñ\034\030iÞÖl¶q|9¼a%4¢&Þj§´YèáÿÉ \017\bÜK½]`ít¤S\0333!¬.\032k^Ë]\032\020WcpÖÉn÷Â6ÿkK{³(®þ@¦ì\035UGËVË­^´$³¬d\016WD|\r)Z¦·Ì\000n:v\002eÈ$(£!yPrÏ\037I\025LjáÀFÊÖý5ËâËàÌ¤ÂÑLÓ'\013J~Enì  ¿Ã¿ÂÓ\030:3ì_|;´¹+p\000ô&`!âuÈÅ¡íO(Ç\035³ùi7MÁ60!¼Ò­Ù~sÝªßcñý­ýÊ*\"=\003±\034u-2¢\020Î\033ä³K.©ºù»\022¾2\b(aC\0244áu[ÆOµÕÏÑq¥\024ÿ.¿?sJVÍ*üØ¢TÑ!(KC\020ä6EçÊ­·ThÐkôÂ\020Æårn\027Ã¡K°<ÝÛÜ8(ª\bo¸ßÝ\026ª]Ë\t»)\036ÑQ2ª<ÐÑ_ýÇísBõíÀjYC&þ96(WZè?5)`'Ïk`°rX\033\030\013,\037¡¹ú\"òÐ]\033zèÓ¯\021ñß\030\021Î\024÷zþ3¿Ýåøv0ú¸3\003Î2(úB\020AP\032\005¥¦am-ÇÈ\fÿø\035VÒR\035ä¾Â/½ñâ,}áÊ:(?µhaæ\032Óçrj¿X\013\00047\016±Ù\025ûÃ5Y«0Z¾\013*\035~ð6Î\005f(ò\bÏÞûåËùæ Æö¤\003XS\027õÚgþ@\tî5wS©ù«_c°: Æ¢©\031;ÐoË¬>ý/k'ýÛ²®åÿ\033Ñ|Aô\004¡Øßû(;\034ÄµÅa±­Û\0016\"<è.ÐÅ\022vãfZk\001Ã\0246TK°m´×ßYTß}\030\035=ß\037p|=/V×Û¦úÎCB\0350³\026\031\037\020T:»ë_\005?zÐØêmª vÑÅ\027Z\"EÍ7¤\031á)\177Óx¯\0346\005å¨mÈÝêÙ§\020èlí\013BK­ìÃ'\004)¢ Ë3ü(1=à¹¡lm©\017a,j\017Å_\032gC³Q«·\020np±TÊ£Ë¼õçºú(èw\000ôÇ\r\016â1Ï_,\\Òï_f¨ów\177í\000O\025\fÍèM/IJÛÂù÷O(lx|\004\017nk­\026÷âïÔIãIòÀKÀJ4ëú\027ÀXË\002±y¢_ \027¼l\023®9½d£V/£¬\b> ËBS.SÿO\fßÊHø²EûO¨îtÔßkÒ(¼êÀÚ³\036ÍÕè\nMW·K©,mÊþÎe½_£u\001Ç`ÁSRvòT¿?¹ñÀO¹X¹~Â;vfª[ù(É©ê°Íú±\037À\030+³¡Ýÿ÷JM<\0060&Þ\003]Ê\r~¡M\rçi{F UÑÛ¼gUÒ¬'Ëä[àç[SÄC:]2Wæ@©ÙýÏæG\005"))).length();
    int local16_life24 = 40;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill270_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill270_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill270_29)).doFinal(((byte[])(__sourceSpill270_28)));
        java.lang.String __sourceSpill270_34 = ((java.lang.String)(com.moon.module.impl.ESP.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill270_35 = local20_life19;
        int __sourceSpill270_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill270_35)[__sourceSpill270_36] = __sourceSpill270_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "_CJ(pÞ,¾\006V@nµÈÀð¹N&xS+£ÏiÄM\030rU\177·j©7¢BH\0232ßRb.\017¾QY"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill270_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill270_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill270_42)).doFinal(((byte[])(__sourceSpill270_41)));
        java.lang.String __sourceSpill270_47 = ((java.lang.String)(com.moon.module.impl.ESP.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill270_48 = local20_life19;
        int __sourceSpill270_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill270_48)[__sourceSpill270_49] = __sourceSpill270_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    kb = ((java.lang.String[])(local20_life19));
    lb = ((java.lang.String[])(new java.lang.String[106]));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill270_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill270_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill270_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill270_60 = new byte[8];
    (__sourceSpill270_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill270_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation270_62 = __sourceSpill270_60;
    ((javax.crypto.Cipher)(__sourceSpill270_57)).init(((int)(__sourceSpill270_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill270_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation270_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[12];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "?\177nM~{Ò¶\032gxd¯&«×\013&Hå\tUÚ\nNEòÄû«µk»>#Héü\027ª±Ï³TrÚ\016Sñ1P\004A©ª3¿ý8ÔiEIàÿ»\004WUN "))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill270_71 = local4_life67;
        int __sourceSpill270_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill270_71)).substring(((int)(__sourceSpill270_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill270_76 = local6_life65;
        int __sourceSpill270_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill270_79 = new byte[8];
        (__sourceSpill270_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill270_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill270_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill270_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill270_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill270_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill270_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill270_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill270_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill270_80)).doFinal(((byte[])(__sourceSpill270_79)));
        (__sourceSpill270_76)[__sourceSpill270_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "\022\005óÜô×\026%¦¼ÅùW"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill270_84 = local4_life67;
        int __sourceSpill270_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill270_84)).substring(((int)(__sourceSpill270_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill270_89 = local6_life65;
        int __sourceSpill270_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill270_92 = new byte[8];
        (__sourceSpill270_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill270_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill270_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill270_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill270_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill270_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill270_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill270_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill270_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill270_93)).doFinal(((byte[])(__sourceSpill270_92)));
        (__sourceSpill270_89)[__sourceSpill270_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    ob = ((long[])(local6_life65));
    pb = ((java.lang.Integer[])(new java.lang.Integer[12]));
}

private static native <E extends Throwable> void __sourceConstructorInit_cb7a85f46b88d745_0(com.moon.module.impl.ESP a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public com.moon.setting.SettingGroup i() {
return this.at;
}


public com.moon.setting.FloatSetting i__kZ() {
return this.ay;
}


public com.moon.setting.BooleanSetting i__kV() {
return this.H;
}


public com.moon.setting.ColorSetting i__kX() {
return this.aj;
}


public com.moon.setting.ColorSetting b__kX() {
return this.E;
}


public com.moon.setting.ModeSetting<com.moon.ESP2DArmorColorType> b__kY() {
return this.N;
}


public com.moon.setting.MultiSelectSetting<com.moon.bU> b__k4() {
return this.X;
}


public com.moon.setting.IntegerSetting b__k1() {
return this.ad;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.ae;
}


public com.moon.setting.SettingGroup b() {
return this.F;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.v;
}


public com.moon.setting.FloatSetting e__kZ() {
return this.ap;
}


public com.moon.setting.ColorSetting e__kX() {
return this.O;
}


public com.moon.setting.SettingGroup e() {
return this.V;
}


public com.moon.setting.BooleanSetting e__kV() {
return this.z;
}


public com.moon.setting.BooleanSetting s() {
return this.as;
}


public com.moon.setting.IntegerSetting c__k1() {
return this.an;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2458_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.FloatSetting c__kZ() {
return this.af;
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
        byte[] spill1082_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1082_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1082_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1082_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1082_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1082_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16793);
    if (((com.moon.module.impl.ESP.lb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.ESP.mb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.ESP.mb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lV", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.ESP.kb)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.ESP.lb)[life5_8] = com.moon.module.impl.ESP.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.ESP.lb)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.ESP.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.BooleanSetting c__kV() {
return this.w;
}


public com.moon.setting.SettingGroup c() {
return this.L;
}


public com.moon.setting.ColorSetting c__kX() {
return this.J;
}


public com.moon.setting.BooleanSetting n() {
return this.W;
}


public com.moon.setting.ColorSetting h__kX() {
return this.ai;
}


public com.moon.setting.FloatSetting h__kZ() {
return this.ax;
}


public com.moon.setting.SettingGroup h() {
return this.ar;
}


public com.moon.setting.BooleanSetting h__kV() {
return this.G;
}


public com.moon.setting.SettingGroup f() {
return this.Y;
}


public com.moon.setting.FloatSetting f__kZ() {
return this.aq;
}


public com.moon.setting.BooleanSetting f__kV() {
return this.C;
}


public com.moon.setting.ColorSetting f__kX() {
return this.P;
}


public com.moon.setting.ColorSetting l__kX() {
return this.aA;
}


public com.moon.setting.BooleanSetting l() {
return this.S;
}


public com.moon.setting.BooleanSetting d__kV() {
return this.x;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.ESP.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2461_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lV"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.FloatSetting d__kZ() {
return this.ao;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27573;
      if (pb[var3] == null) {
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
         long var5 = ob[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lV", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


public com.moon.setting.SettingGroup d() {
return this.Q;
}


public com.moon.setting.ColorSetting d__kX() {
return this.K;
}


public com.moon.setting.ColorSetting a__kX() {
return this.A;
}


public com.moon.setting.BezierSetting a__kU() {
return this.ab;
}


public boolean a(net.minecraft.entity.Entity p0) {
long key = cb ^ 138050915486477L;

      Entity[] marker = bY.b();



      // PC 16 -> 73 -> 151 bypasses the filters when the captured marker is non-null.

      // A JVM boolean ireturn narrows the integer result to its low bit.

      if (marker != null) {

         return (p0.e__Int() & 1) != 0;

      }



      if (p0 == d.K) {

         return d.W.aP != 0;

      }



      // Preserve both virtual reads and their short-circuit order (PC 73 and 105).

      if (p0.e__Int() == d(11784, 7193316628864091566L ^ key)

            || p0.e__Int() == d(2833, 8553925482413088957L ^ key)) {

         return false;

      }



      if (p0.v__Boolean() && !this.t.isSelected(ESPTargetType.INVISIBLE)) {

         return false;

      }



      boolean isMob = p0 instanceof moom.sZ;

      if (isMob && this.t.isSelected(ESPTargetType.MOB)) {

         return true;

      }



      boolean isAnimal = p0 instanceof moom.sK

            || p0 instanceof net.minecraft.entity.passive.EntityVillager

            || p0 instanceof moom.tl;

      if (isAnimal && this.t.isSelected(ESPTargetType.ANIMAL)) {

         return true;

      }



      return p0 instanceof net.minecraft.entity.player.EntityPlayer

            && this.t.isSelected(ESPTargetType.PLAYER);
}


public void a(com.moon.event.EntityEvent p0) {
int forwardValue828_22_0;
    int forwardValue828_31_0;
    int forwardValue828_39_0;
    net.minecraft.entity.Entity[] spill828_0;
    boolean spill828_1;
    long life2_3;
    net.minecraft.entity.Entity life5_7;
    net.minecraft.entity.Entity[] life4_8;
    org.lwjgl.util.vector.Vector4f life6_11;
    forward_join_44: {
    forward_join_39: {
    forward_join_31: {
    forward_join_26: {
    forward_join_25: {
    forward_join_22: {
    life2_3 = (com.moon.module.impl.ESP.cb ^ 75321590288760L);
    spill828_0 = com.moon.bY.b();
    life5_7 = ((com.moon.event.EntityEvent)(p0)).getEntity();
    life4_8 = spill828_0;
    life6_11 = ((net.minecraft.entity.Entity)(life5_7)).a__Vector4f();
    if (!((life6_11 != null))) {
        break forward_join_25;
    }
    spill828_1 = ((com.moon.module.impl.ESP)(this)).a(((net.minecraft.entity.Entity)(life5_7)));
    if (!((life4_8 == null))) {
        forwardValue828_22_0 = ((spill828_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill828_1)) {
        break forward_join_25;
    }
    forwardValue828_22_0 = ((com.moon.nG.a(((net.minecraft.entity.Entity)(life5_7)))) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue828_31_0 = forwardValue828_22_0;
        break forward_join_31;
    }
    if (!((forwardValue828_22_0 == 0))) {
        break forward_join_26;
    }
    }
    return;
    }
    forwardValue828_31_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_8 == null))) {
        forwardValue828_39_0 = forwardValue828_31_0;
        break forward_join_39;
    }
    if (!((forwardValue828_31_0 != 0))) {
        break forward_join_44;
    }
    forwardValue828_39_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.C)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue828_39_0 != 0))) {
        break forward_join_44;
    }
    ((com.moon.event.EntityEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public com.moon.setting.IntegerSetting a__k1() {
return this.aa;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.y;
}


public com.moon.setting.ModeSetting<com.moon.ESP2DHealthColorType> a__kY() {
return this.I;
}


public com.moon.setting.MultiSelectSetting<com.moon.ESPTargetType> a__k4() {
return this.t;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.u;
}


public com.moon.jb a() {
return this.s;
}


public com.moon.setting.SettingGroup a__k0() {
return this.B;
}


public com.moon.setting.BooleanSetting m() {
return this.T;
}


public com.moon.setting.ColorSetting m__kX() {
return this.aB;
}


public com.moon.setting.BooleanSetting o() {
return this.Z;
}


public com.moon.setting.BooleanSetting p() {
return this.ac;
}


public com.moon.setting.BooleanSetting k__kV() {
return this.R;
}


public com.moon.setting.ColorSetting k__kX() {
return this.al;
}


public com.moon.setting.SettingGroup k() {
return this.aC;
}


public com.moon.setting.BooleanSetting t() {
return this.au;
}


public com.moon.setting.ColorSetting g__kX() {
return this.U;
}


public com.moon.setting.SettingGroup g() {
return this.ah;
}


public com.moon.setting.BooleanSetting g__kV() {
return this.D;
}


public com.moon.setting.FloatSetting g__kZ() {
return this.aw;
}


public com.moon.setting.BooleanSetting j__kV() {
return this.M;
}


public com.moon.setting.ColorSetting j__kX() {
return this.ak;
}


public com.moon.setting.SettingGroup j() {
return this.az;
}


public com.moon.setting.BooleanSetting q() {
return this.ag;
}


public com.moon.setting.BooleanSetting u() {
return this.av;
}


public com.moon.setting.BooleanSetting r() {
return this.am;
}


private java.lang.Boolean lambda$new$0() {
long key = cb ^ 103970821213499L;

      Entity[] marker = bY.b();

      boolean enabled = ((Boolean)this.v.getValue()).booleanValue();

      if (marker == null && enabled) {

         enabled = ((Boolean)this.w.getValue()).booleanValue();

      }

      return Boolean.valueOf(enabled);
}


private java.lang.Boolean lambda$new$1() {
long key = cb ^ 131968638512593L;

      Entity[] marker = bY.b();

      boolean enabled = ((Boolean)this.v.getValue()).booleanValue();

      if (marker == null && enabled) {

         enabled = ((Boolean)this.w.getValue()).booleanValue();

      }

      return Boolean.valueOf(enabled);
}


private java.lang.Boolean lambda$new$9() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.ESPTargetType.MOB))))));
}


private java.lang.Boolean lambda$new$3() {
long key = cb ^ 74498831551671L;

      Entity[] marker = bY.b();

      Object value = this.I.getValue();

      if (marker == null) {

         if (value == ESP2DHealthColorType.NORMAL) {

            return Boolean.valueOf(false);

         }

         value = this.G.getValue();

      }

      return Boolean.valueOf(((Boolean)value).booleanValue());
}


private java.lang.Boolean lambda$new$2() {
long key = cb ^ 64371788849204L;

      Entity[] marker = bY.b();

      boolean enabled = ((Boolean)this.C.getValue()).booleanValue();

      if (marker == null && enabled) {

         enabled = ((Boolean)this.D.getValue()).booleanValue();

      }

      return Boolean.valueOf(enabled);
}


private java.lang.Boolean lambda$new$4() {
long key = cb ^ 123742305353920L;

      Entity[] marker = bY.b();

      Object value = this.I.getValue();

      if (marker == null) {

         if (value != ESP2DHealthColorType.GRADIENT) {

            return Boolean.valueOf(false);

         }

         value = this.G.getValue();

      }

      return Boolean.valueOf(((Boolean)value).booleanValue());
}


private java.lang.Boolean lambda$new$8() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.ESPTargetType.ANIMAL))))));
}


private java.lang.Boolean lambda$new$6() {
long key = cb ^ 112382213438898L;

      Entity[] marker = bY.b();

      boolean enabled = ((Boolean)this.S.getValue()).booleanValue();

      if (marker == null && enabled) {

         enabled = ((Boolean)this.R.getValue()).booleanValue();

      }

      return Boolean.valueOf(enabled);
}


private java.lang.Boolean lambda$new$5() {
long key = cb ^ 2711960570274L;

      Entity[] marker = bY.b();

      Object value = this.N.getValue();

      if (marker == null) {

         if (value != ESP2DArmorColorType.GRADIENT) {

            return Boolean.valueOf(false);

         }

         value = this.M.getValue();

      }

      return Boolean.valueOf(((Boolean)value).booleanValue());
}


private java.lang.Boolean lambda$new$7() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.ESPTargetType.PLAYER))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_51(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_61(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_73(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_81(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_89(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_97(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_105(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_139(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_142(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_148(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_151(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_160(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_165(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_168(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_170(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_176(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_193(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_196(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_201(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_204(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_212(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_217(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_221(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_230(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_235(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_238(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_240(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_245(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_248(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_252(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_258(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_281(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_284(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_289(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_293(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_302(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_307(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_310(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_318(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_323(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_326(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_330(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_336(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_358(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_363(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_366(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_371(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_374(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_382(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_387(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_390(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_398(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_403(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_406(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_408(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_414(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_434(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_437(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_442(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_446(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_459(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_465(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_479(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_482(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_487(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_490(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_492(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_494(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_499(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_502(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_529(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_532(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_537(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_540(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_548(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_553(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_556(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_567(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_572(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_575(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_585(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_590(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_593(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_601(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_607(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_609(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_633(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_641(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_644(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_646(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_648(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_653(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_656(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_658(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_660(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_665(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_668(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_670(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_672(com.moon.module.impl.ESP a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_677(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_680(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_682(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_687(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_690(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_695(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_698(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_700(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_705(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_708(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_714(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_717(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_724(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_727(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_735(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_755(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_758(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_764(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_784(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_787(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_792(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_795(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_800(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_803(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_811(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_814(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_820(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_823(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_830(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_853(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_856(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_863(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_866(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_876(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cb7a85f46b88d745_originalDynamicSite25_882(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2458_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2461_0() throws E;
}
