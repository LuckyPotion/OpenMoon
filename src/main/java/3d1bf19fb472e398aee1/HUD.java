package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class HUD extends com.moon.module.Module {

private boolean s;

protected com.moon.setting.BooleanSetting t;

protected com.moon.setting.ModeSetting<com.moon.b3> u;

protected com.moon.k5 v;

protected com.moon.setting.BooleanSetting w;

protected com.moon.setting.BooleanSetting x;

protected com.moon.setting.BooleanSetting y;

protected com.moon.setting.ModeSetting<com.moon.b0> z;

protected com.moon.setting.ColorSetting A;

protected com.moon.setting.ColorSetting B;

protected com.moon.setting.SettingGroup C;

protected com.moon.setting.BooleanSetting D;

protected com.moon.setting.BooleanSetting E;

protected com.moon.setting.BooleanSetting F;

protected com.moon.setting.SettingGroup G;

protected com.moon.setting.BooleanSetting H;

protected com.moon.setting.BooleanSetting I;

protected com.moon.setting.BooleanSetting J;

protected com.moon.setting.BooleanSetting K;

protected com.moon.setting.ModeSetting<com.moon.b0> L;

protected com.moon.setting.ColorSetting M;

protected com.moon.setting.ColorSetting N;

protected com.moon.setting.SettingGroup O;

protected com.moon.setting.BooleanSetting P;

protected com.moon.setting.BooleanSetting Q;

protected com.moon.setting.BooleanSetting R;

protected com.moon.setting.BooleanSetting S;

protected com.moon.setting.IntegerSetting T;

protected com.moon.setting.SettingGroup U;

protected com.moon.setting.SettingGroup V;

protected com.moon.setting.BooleanSetting W;

protected com.moon.setting.MultiSelectSetting<com.moon.module.ModuleCategory> X;

protected com.moon.setting.BooleanSetting Y;

protected com.moon.setting.BooleanSetting Z;

protected com.moon.setting.ModeSetting<com.moon.bX> aa;

protected com.moon.setting.ModeSetting<com.moon.bZ> ab;

protected com.moon.setting.ModeSetting<com.moon.bY> ac;

protected com.moon.setting.ColorSetting ad;

protected com.moon.setting.ColorSetting ae;

protected com.moon.setting.FloatSetting af;

protected com.moon.setting.FloatSetting ag;

protected com.moon.setting.SettingGroup ah;

protected com.moon.setting.BooleanSetting ai;

protected com.moon.setting.IntegerSetting aj;

protected com.moon.setting.BooleanSetting ak;

protected com.moon.setting.ColorSetting al;

protected com.moon.setting.BooleanSetting am;

protected com.moon.setting.IntegerSetting an;

protected com.moon.setting.IntegerSetting ao;

protected com.moon.setting.SettingGroup ap;

protected com.moon.setting.BooleanSetting aq;

protected com.moon.setting.ModeSetting<com.moon.b2> ar;

protected com.moon.setting.ModeSetting<com.moon.b1> as;

protected com.moon.setting.ColorSetting at;

protected com.moon.setting.ColorSetting au;

protected com.moon.setting.FloatSetting av;

protected com.moon.setting.SettingGroup aw;

protected com.moon.setting.IntegerSetting ax;

protected com.moon.setting.FloatSetting ay;

private com.moon.setting.SettingGroup az;

private com.moon.setting.ModeSetting<com.moon.bW> aA;

private com.moon.setting.FloatSetting aB;

private com.moon.hW aC;

private com.moon.hW aD;

private com.moon.hW aE;

private com.moon.hW aF;

private com.moon.hW aG;

private com.moon.hW aH;

private com.moon.hW aI;

private com.moon.hW aJ;

public java.util.List<com.moon.hi> aK;

public java.util.List<com.moon.hn> aL;

private com.moon.hq aM;

private static long cb;

private static java.lang.String[] kb;

private static java.lang.String[] lb;

private static java.util.Map mb;

private static long[] ob;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public HUD(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_79caec772487bd0a(com.moon.module.impl.HUD receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.HUD.cb ^ 13787779511473L);

    com.moon.module.impl.HUD.__sourceConstructorInit_79caec772487bd0a_0(((com.moon.module.impl.HUD)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.HUD)(receiver)).s = ((boolean)(true));

    ((com.moon.module.impl.HUD)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_6(5544, (4692051466916879819L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_9(28848, (2049634520122046663L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_22 = receiver;

    com.moon.mc __sourceSpill26_23 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_14(3752, (8570518156846581443L ^ local5_life2)))), ((java.lang.Class)(com.moon.b3.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_18(19419, (5754048449413022671L ^ local5_life2)))), ((java.lang.Enum)(com.moon.b3.LOGO)));

    com.moon.setting.BooleanSetting __stackOp26_24_0 = ((com.moon.module.impl.HUD)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill26_26 = __stackOp26_24_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_24_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_22)).u = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill26_23)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_27(__sourceSpill26_26)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).v = ((com.moon.k5)(((com.moon.mj)(((com.moon.mj)(((com.moon.mj)(com.moon.k5.a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_32(32077, (8238370468372755721L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_35(12607, (3786756516045093130L ^ local5_life2)))), ((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_37(1292, (3578634314310896985L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_39(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_44(7240, (6036261215652861049L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_47(29502, (670054019481484037L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_49(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_54(20540, (4918667648032348271L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_57(21614, (698795991647951878L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_59(receiver)))))).a()));

    net.minecraft.entity.Entity[] __sourceSpill26_74 = com.moon.bY.b();

    ((com.moon.module.impl.HUD)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_65(11109, (1514965891653788446L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_68(24451, (2625815126210647998L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_70(receiver)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_84 = receiver;

    com.moon.mc __sourceSpill26_85 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_76(8344, (3333932160049506493L ^ local5_life2)))), ((java.lang.Class)(com.moon.b0.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_80(7039, (5449167550381871874L ^ local5_life2)))), ((java.lang.Enum)(com.moon.b0.SYNC)));

    com.moon.setting.BooleanSetting __stackOp26_86_0 = ((com.moon.module.impl.HUD)(receiver)).t;

    com.moon.setting.BooleanSetting __sourceSpill26_88 = __stackOp26_86_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_86_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_84)).z = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill26_85)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_89(__sourceSpill26_88)))))).a()));

    net.minecraft.entity.Entity[] local7_life93 = __sourceSpill26_74;

    ((com.moon.module.impl.HUD)(receiver)).A = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_95(13399, (1779936818441649209L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_98(19386, (1223052477665772428L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_100(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).B = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_105(28416, (910154302382942052L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_108(9564, (3051254135725354367L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_110(receiver)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_119 = receiver;

    com.moon.me __sourceSpill26_120 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_121 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_116(26752, (8289039851401420994L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_122_0 = new com.moon.setting.Setting[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_118(21463, (8354349759736718190L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill26_124 = __stackOp26_122_0;

    (__stackOp26_122_0)[0] = ((com.moon.module.impl.HUD)(receiver)).t;

    com.moon.setting.Setting[] __stackOp26_125_0 = __sourceSpill26_124;

    com.moon.setting.Setting[] __sourceSpill26_127 = __stackOp26_125_0;

    (__stackOp26_125_0)[1] = ((com.moon.module.impl.HUD)(receiver)).u;

    com.moon.setting.Setting[] __stackOp26_128_0 = __sourceSpill26_127;

    com.moon.setting.Setting[] __sourceSpill26_130 = __stackOp26_128_0;

    (__stackOp26_128_0)[2] = ((com.moon.module.impl.HUD)(receiver)).v;

    com.moon.setting.Setting[] __stackOp26_131_0 = __sourceSpill26_130;

    com.moon.setting.Setting[] __sourceSpill26_133 = __stackOp26_131_0;

    (__stackOp26_131_0)[3] = ((com.moon.module.impl.HUD)(receiver)).w;

    com.moon.setting.Setting[] __stackOp26_134_0 = __sourceSpill26_133;

    com.moon.setting.Setting[] __sourceSpill26_136 = __stackOp26_134_0;

    (__stackOp26_134_0)[4] = ((com.moon.module.impl.HUD)(receiver)).x;

    com.moon.setting.Setting[] __stackOp26_137_0 = __sourceSpill26_136;

    com.moon.setting.Setting[] __sourceSpill26_139 = __stackOp26_137_0;

    (__stackOp26_137_0)[5] = ((com.moon.module.impl.HUD)(receiver)).y;

    com.moon.setting.Setting[] __stackOp26_140_0 = __sourceSpill26_139;

    com.moon.setting.Setting[] __sourceSpill26_144 = __stackOp26_140_0;

    (__stackOp26_140_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_142(9061, (3108256131199554505L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).z;

    com.moon.setting.Setting[] __stackOp26_145_0 = __sourceSpill26_144;

    com.moon.setting.Setting[] __sourceSpill26_149 = __stackOp26_145_0;

    (__stackOp26_145_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_147(5089, (8327599464039244612L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).A;

    com.moon.setting.Setting[] __stackOp26_150_0 = __sourceSpill26_149;

    com.moon.setting.Setting[] __sourceSpill26_154 = __stackOp26_150_0;

    (__stackOp26_150_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_152(21598, (6159690648463647996L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).B;

    ((com.moon.module.impl.HUD)(__sourceSpill26_119)).C = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_120)).a(((java.lang.String)(__sourceSpill26_121)), ((com.moon.setting.Setting[])(__sourceSpill26_154))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).D = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_159(22567, (4598340394784198762L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_162(17568, (7773587112384728268L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_173 = receiver;

    com.moon.l_ __sourceSpill26_174 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_167(15942, (1994331881336534626L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_170(1478, (3280359501834341856L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp26_175_0 = ((com.moon.module.impl.HUD)(receiver)).D;

    com.moon.setting.BooleanSetting __sourceSpill26_177 = __stackOp26_175_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_175_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_173)).E = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_174)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_178(__sourceSpill26_177)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_189 = receiver;

    com.moon.l_ __sourceSpill26_190 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_183(7207, (6157313285917168659L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_186(5803, (5448591562623344345L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp26_191_0 = ((com.moon.module.impl.HUD)(receiver)).D;

    com.moon.setting.BooleanSetting __sourceSpill26_193 = __stackOp26_191_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_191_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_189)).F = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_190)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_194(__sourceSpill26_193)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_201 = receiver;

    com.moon.me __sourceSpill26_202 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_203 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_200(2400, (8560235398497419568L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_204_0 = new com.moon.setting.Setting[3];

    com.moon.setting.Setting[] __sourceSpill26_206 = __stackOp26_204_0;

    (__stackOp26_204_0)[0] = ((com.moon.module.impl.HUD)(receiver)).D;

    com.moon.setting.Setting[] __stackOp26_207_0 = __sourceSpill26_206;

    com.moon.setting.Setting[] __sourceSpill26_209 = __stackOp26_207_0;

    (__stackOp26_207_0)[1] = ((com.moon.module.impl.HUD)(receiver)).E;

    com.moon.setting.Setting[] __stackOp26_210_0 = __sourceSpill26_209;

    com.moon.setting.Setting[] __sourceSpill26_212 = __stackOp26_210_0;

    (__stackOp26_210_0)[2] = ((com.moon.module.impl.HUD)(receiver)).F;

    ((com.moon.module.impl.HUD)(__sourceSpill26_201)).G = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_202)).a(((java.lang.String)(__sourceSpill26_203)), ((com.moon.setting.Setting[])(__sourceSpill26_212))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).H = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_217(23372, (6990183490364937054L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_220(15569, (1064600423947400432L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).I = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_225(28550, (3676438610890467297L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_228(13654, (1578382719686999300L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).J = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_233(28185, (5291435400199808577L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_236(19117, (3871742371230777986L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).K = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_241(4564, (369095087118834093L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_244(1478, (3280359501834341856L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).L = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_249(679, (4889518997762034329L ^ local5_life2)))), ((java.lang.Class)(com.moon.b0.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_253(12238, (2574346125523609478L ^ local5_life2)))), ((java.lang.Enum)(com.moon.b0.SYNC))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).M = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_259(1849, (7627755199826677504L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_262(16293, (582745225109993443L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_264(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).N = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_269(31829, (9178066939444769824L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_272(23771, (3683187649024038094L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_274(receiver)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_283 = receiver;

    com.moon.me __sourceSpill26_284 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_285 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_280(4552, (2148733132271311257L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_286_0 = new com.moon.setting.Setting[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_282(1131, (6072915199474660555L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill26_288 = __stackOp26_286_0;

    (__stackOp26_286_0)[0] = ((com.moon.module.impl.HUD)(receiver)).H;

    com.moon.setting.Setting[] __stackOp26_289_0 = __sourceSpill26_288;

    com.moon.setting.Setting[] __sourceSpill26_291 = __stackOp26_289_0;

    (__stackOp26_289_0)[1] = ((com.moon.module.impl.HUD)(receiver)).I;

    com.moon.setting.Setting[] __stackOp26_292_0 = __sourceSpill26_291;

    com.moon.setting.Setting[] __sourceSpill26_294 = __stackOp26_292_0;

    (__stackOp26_292_0)[2] = ((com.moon.module.impl.HUD)(receiver)).J;

    com.moon.setting.Setting[] __stackOp26_295_0 = __sourceSpill26_294;

    com.moon.setting.Setting[] __sourceSpill26_297 = __stackOp26_295_0;

    (__stackOp26_295_0)[3] = ((com.moon.module.impl.HUD)(receiver)).K;

    com.moon.setting.Setting[] __stackOp26_298_0 = __sourceSpill26_297;

    com.moon.setting.Setting[] __sourceSpill26_300 = __stackOp26_298_0;

    (__stackOp26_298_0)[4] = ((com.moon.module.impl.HUD)(receiver)).L;

    com.moon.setting.Setting[] __stackOp26_301_0 = __sourceSpill26_300;

    com.moon.setting.Setting[] __sourceSpill26_303 = __stackOp26_301_0;

    (__stackOp26_301_0)[5] = ((com.moon.module.impl.HUD)(receiver)).M;

    com.moon.setting.Setting[] __stackOp26_304_0 = __sourceSpill26_303;

    com.moon.setting.Setting[] __sourceSpill26_308 = __stackOp26_304_0;

    (__stackOp26_304_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_306(24834, (1687338920543687096L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).N;

    ((com.moon.module.impl.HUD)(__sourceSpill26_283)).O = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_284)).a(((java.lang.String)(__sourceSpill26_285)), ((com.moon.setting.Setting[])(__sourceSpill26_308))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).P = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_313(8862, (5357904806337866418L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_316(17568, (7773587112384728268L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).Q = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_321(12007, (1970783720249157296L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_324(26245, (389693663438319282L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).R = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_329(23680, (5177241232661746934L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_332(25, (3242302344651524220L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_343 = receiver;

    com.moon.l_ __sourceSpill26_344 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_337(21996, (2184907434695040423L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_340(10739, (9212168513086415272L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp26_345_0 = ((com.moon.module.impl.HUD)(receiver)).P;

    com.moon.setting.BooleanSetting __sourceSpill26_347 = __stackOp26_345_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_345_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_343)).S = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_344)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_348(__sourceSpill26_347)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_363 = receiver;

    com.moon.mf __sourceSpill26_364 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_353(17969, (8272693782779399712L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_356(20616, (6686846891476916462L ^ local5_life2)))), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_358(262, (3113430434274537890L ^ local5_life2)))), ((int)(5)), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_360(25160, (8240309933447484135L ^ local5_life2)))), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp26_365_0 = ((com.moon.module.impl.HUD)(receiver)).P;

    com.moon.setting.BooleanSetting __sourceSpill26_367 = __stackOp26_365_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_365_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_363)).T = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill26_364)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_368(__sourceSpill26_367)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_375 = receiver;

    com.moon.me __sourceSpill26_376 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_377 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_374(7593, (6133434935706605024L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_378_0 = new com.moon.setting.Setting[5];

    com.moon.setting.Setting[] __sourceSpill26_380 = __stackOp26_378_0;

    (__stackOp26_378_0)[0] = ((com.moon.module.impl.HUD)(receiver)).P;

    com.moon.setting.Setting[] __stackOp26_381_0 = __sourceSpill26_380;

    com.moon.setting.Setting[] __sourceSpill26_383 = __stackOp26_381_0;

    (__stackOp26_381_0)[1] = ((com.moon.module.impl.HUD)(receiver)).Q;

    com.moon.setting.Setting[] __stackOp26_384_0 = __sourceSpill26_383;

    com.moon.setting.Setting[] __sourceSpill26_386 = __stackOp26_384_0;

    (__stackOp26_384_0)[2] = ((com.moon.module.impl.HUD)(receiver)).R;

    com.moon.setting.Setting[] __stackOp26_387_0 = __sourceSpill26_386;

    com.moon.setting.Setting[] __sourceSpill26_389 = __stackOp26_387_0;

    (__stackOp26_387_0)[3] = ((com.moon.module.impl.HUD)(receiver)).S;

    com.moon.setting.Setting[] __stackOp26_390_0 = __sourceSpill26_389;

    com.moon.setting.Setting[] __sourceSpill26_392 = __stackOp26_390_0;

    (__stackOp26_390_0)[4] = ((com.moon.module.impl.HUD)(receiver)).T;

    ((com.moon.module.impl.HUD)(__sourceSpill26_375)).U = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_376)).a(((java.lang.String)(__sourceSpill26_377)), ((com.moon.setting.Setting[])(__sourceSpill26_392))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_399 = receiver;

    com.moon.me __sourceSpill26_400 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_401 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_398(31007, (3516164255752171828L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_402_0 = new com.moon.setting.Setting[1];

    com.moon.setting.Setting[] __sourceSpill26_404 = __stackOp26_402_0;

    (__stackOp26_402_0)[0] = ((com.moon.module.impl.HUD)(receiver)).U;

    ((com.moon.module.impl.HUD)(__sourceSpill26_399)).V = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_400)).a(((java.lang.String)(__sourceSpill26_401)), ((com.moon.setting.Setting[])(__sourceSpill26_404))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).W = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_409(31525, (8356667829968188271L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_412(17568, (7773587112384728268L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).X = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_417(4757, (4679216485021539055L ^ local5_life2)))), ((java.lang.Class)(com.moon.module.ModuleCategory.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_421(29744, (7794769378902621289L ^ local5_life2)))), ((java.lang.Enum[])(com.moon.module.ModuleCategory.values()))))).a(((com.moon.kR)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_424()))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_435 = receiver;

    com.moon.l_ __sourceSpill26_436 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_429(29936, (7347409921075035289L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_432(1478, (3280359501834341856L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp26_437_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_439 = __stackOp26_437_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_437_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_435)).Y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_436)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_440(__sourceSpill26_439)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_451 = receiver;

    com.moon.l_ __sourceSpill26_452 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_445(32334, (6136577893213517366L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_448(16219, (4048634390753965851L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp26_453_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_455 = __stackOp26_453_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_453_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_451)).Z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_452)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_456(__sourceSpill26_455)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_469 = receiver;

    com.moon.mc __sourceSpill26_470 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_461(3944, (5031672932682942210L ^ local5_life2)))), ((java.lang.Class)(com.moon.bX.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_465(22747, (6640965469595242723L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bX.SPACE)));

    com.moon.setting.BooleanSetting __stackOp26_471_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_473 = __stackOp26_471_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_471_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_469)).aa = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill26_470)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_474(__sourceSpill26_473)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_487 = receiver;

    com.moon.mc __sourceSpill26_488 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_479(16132, (5626486491050800990L ^ local5_life2)))), ((java.lang.Class)(com.moon.bZ.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_483(21062, (8085765186935659108L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bZ.NORMAL)));

    com.moon.setting.BooleanSetting __stackOp26_489_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_491 = __stackOp26_489_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_489_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_487)).ab = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill26_488)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_492(__sourceSpill26_491)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_505 = receiver;

    com.moon.mc __sourceSpill26_506 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_497(15587, (136740115301070035L ^ local5_life2)))), ((java.lang.Class)(com.moon.bY.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_501(1378, (3570823291394182402L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bY.GRADIENT)));

    com.moon.setting.BooleanSetting __stackOp26_507_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_509 = __stackOp26_507_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_507_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_505)).ac = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill26_506)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_510(__sourceSpill26_509)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_523 = receiver;

    com.moon.mb __sourceSpill26_524 = ((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_515(13134, (4806707232396213053L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_518(16293, (582745225109993443L ^ local5_life2)))), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_520(27851, (6394376241975270504L ^ local5_life2)))));

    com.moon.setting.BooleanSetting __stackOp26_525_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_527 = __stackOp26_525_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_525_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_523)).ad = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(__sourceSpill26_524)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_528(__sourceSpill26_527)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).ae = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_533(30689, (326514258434244496L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_536(23771, (3683187649024038094L ^ local5_life2)))), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_538(16924, (4479280985750909629L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_540(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).af = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_545(24198, (397655969686689425L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_548(7546, (4571179639655617855L ^ local5_life2)))), ((float)(1061997773)), ((float)(1036831949)), ((float)(1069547520)), ((float)(1036831949))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_554(receiver)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_569 = receiver;

    com.moon.md __sourceSpill26_570 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_559(27764, (1813813186950374411L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_562(25069, (5559926139917609469L ^ local5_life2)))), ((float)(1091567616)), ((float)(1084227584)), ((float)(1096810496)), ((float)(1048576000)));

    com.moon.setting.BooleanSetting __stackOp26_571_0 = ((com.moon.module.impl.HUD)(receiver)).Y;

    com.moon.setting.BooleanSetting __sourceSpill26_573 = __stackOp26_571_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_571_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_569)).ag = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(__sourceSpill26_570)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_574(__sourceSpill26_573)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_583 = receiver;

    com.moon.me __sourceSpill26_584 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_585 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_580(29154, (5674102584089360847L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_586_0 = new com.moon.setting.Setting[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_582(2867, (5412870074135608203L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill26_588 = __stackOp26_586_0;

    (__stackOp26_586_0)[0] = ((com.moon.module.impl.HUD)(receiver)).Y;

    com.moon.setting.Setting[] __stackOp26_589_0 = __sourceSpill26_588;

    com.moon.setting.Setting[] __sourceSpill26_591 = __stackOp26_589_0;

    (__stackOp26_589_0)[1] = ((com.moon.module.impl.HUD)(receiver)).Z;

    com.moon.setting.Setting[] __stackOp26_592_0 = __sourceSpill26_591;

    com.moon.setting.Setting[] __sourceSpill26_594 = __stackOp26_592_0;

    (__stackOp26_592_0)[2] = ((com.moon.module.impl.HUD)(receiver)).aa;

    com.moon.setting.Setting[] __stackOp26_595_0 = __sourceSpill26_594;

    com.moon.setting.Setting[] __sourceSpill26_597 = __stackOp26_595_0;

    (__stackOp26_595_0)[3] = ((com.moon.module.impl.HUD)(receiver)).ab;

    com.moon.setting.Setting[] __stackOp26_598_0 = __sourceSpill26_597;

    com.moon.setting.Setting[] __sourceSpill26_600 = __stackOp26_598_0;

    (__stackOp26_598_0)[4] = ((com.moon.module.impl.HUD)(receiver)).ac;

    com.moon.setting.Setting[] __stackOp26_601_0 = __sourceSpill26_600;

    com.moon.setting.Setting[] __sourceSpill26_603 = __stackOp26_601_0;

    (__stackOp26_601_0)[5] = ((com.moon.module.impl.HUD)(receiver)).ad;

    com.moon.setting.Setting[] __stackOp26_604_0 = __sourceSpill26_603;

    com.moon.setting.Setting[] __sourceSpill26_608 = __stackOp26_604_0;

    (__stackOp26_604_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_606(24834, (1687338920543687096L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).ae;

    com.moon.setting.Setting[] __stackOp26_609_0 = __sourceSpill26_608;

    com.moon.setting.Setting[] __sourceSpill26_613 = __stackOp26_609_0;

    (__stackOp26_609_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_611(1131, (6072915199474660555L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).af;

    com.moon.setting.Setting[] __stackOp26_614_0 = __sourceSpill26_613;

    com.moon.setting.Setting[] __sourceSpill26_618 = __stackOp26_614_0;

    (__stackOp26_614_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_616(29877, (8166911346184946716L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).ag;

    com.moon.me __sourceSpill26_621 = ((com.moon.me)(__sourceSpill26_584)).a(((java.lang.String)(__sourceSpill26_585)), ((com.moon.setting.Setting[])(__sourceSpill26_618)));

    com.moon.setting.BooleanSetting __stackOp26_622_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_624 = __stackOp26_622_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_622_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_583)).ah = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_621)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_625(__sourceSpill26_624)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_636 = receiver;

    com.moon.l_ __sourceSpill26_637 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_630(23717, (7802184462473499848L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_633(17568, (7773587112384728268L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp26_638_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_640 = __stackOp26_638_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_638_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_636)).ai = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_637)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_641(__sourceSpill26_640)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).aj = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_646(12547, (4956379873612757333L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_649(13362, (5297522167239965789L ^ local5_life2)))), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_651(6460, (2405097986275797398L ^ local5_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_653(2729, (8661861705426041359L ^ local5_life2)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_655(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).ak = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_660(21271, (4194444261208267582L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_663(2189, (4648709295232073938L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_665(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).al = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_670(1833, (4518349141862141771L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_673(18176, (8254692225267765071L ^ local5_life2)))), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_675(9466, (9185513244150649938L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_677(receiver)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_688 = receiver;

    com.moon.l_ __sourceSpill26_689 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_682(23632, (4073859919325139982L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_685(23791, (1721340151452931233L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp26_690_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_692 = __stackOp26_690_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_690_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_688)).am = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_689)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_693(__sourceSpill26_692)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).an = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_698(28937, (6737071378039191893L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_701(14105, (5522916384121126698L ^ local5_life2)))), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_703(24834, (1687338920543687096L ^ local5_life2)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_705(receiver)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_718 = receiver;

    com.moon.mf __sourceSpill26_719 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_710(16847, (9044625052805532046L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_713(28875, (3073124652028475636L ^ local5_life2)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_715(14723, (5089117386572548388L ^ local5_life2)))), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp26_720_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_722 = __stackOp26_720_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_720_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_718)).ao = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill26_719)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_723(__sourceSpill26_722)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_732 = receiver;

    com.moon.me __sourceSpill26_733 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_734 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_729(13248, (2573744328702589938L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_735_0 = new com.moon.setting.Setting[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_731(24834, (1687338920543687096L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill26_737 = __stackOp26_735_0;

    (__stackOp26_735_0)[0] = ((com.moon.module.impl.HUD)(receiver)).ai;

    com.moon.setting.Setting[] __stackOp26_738_0 = __sourceSpill26_737;

    com.moon.setting.Setting[] __sourceSpill26_740 = __stackOp26_738_0;

    (__stackOp26_738_0)[1] = ((com.moon.module.impl.HUD)(receiver)).ak;

    com.moon.setting.Setting[] __stackOp26_741_0 = __sourceSpill26_740;

    com.moon.setting.Setting[] __sourceSpill26_743 = __stackOp26_741_0;

    (__stackOp26_741_0)[2] = ((com.moon.module.impl.HUD)(receiver)).al;

    com.moon.setting.Setting[] __stackOp26_744_0 = __sourceSpill26_743;

    com.moon.setting.Setting[] __sourceSpill26_746 = __stackOp26_744_0;

    (__stackOp26_744_0)[3] = ((com.moon.module.impl.HUD)(receiver)).aj;

    com.moon.setting.Setting[] __stackOp26_747_0 = __sourceSpill26_746;

    com.moon.setting.Setting[] __sourceSpill26_749 = __stackOp26_747_0;

    (__stackOp26_747_0)[4] = ((com.moon.module.impl.HUD)(receiver)).am;

    com.moon.setting.Setting[] __stackOp26_750_0 = __sourceSpill26_749;

    com.moon.setting.Setting[] __sourceSpill26_752 = __stackOp26_750_0;

    (__stackOp26_750_0)[5] = ((com.moon.module.impl.HUD)(receiver)).an;

    com.moon.me __sourceSpill26_755 = ((com.moon.me)(__sourceSpill26_733)).a(((java.lang.String)(__sourceSpill26_734)), ((com.moon.setting.Setting[])(__sourceSpill26_752)));

    com.moon.setting.BooleanSetting __stackOp26_756_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_758 = __stackOp26_756_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_756_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_732)).ap = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_755)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_759(__sourceSpill26_758)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_770 = receiver;

    com.moon.l_ __sourceSpill26_771 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_764(620, (526507943881951787L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_767(17568, (7773587112384728268L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp26_772_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_774 = __stackOp26_772_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_772_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_770)).aq = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill26_771)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_775(__sourceSpill26_774)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).ar = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_780(28755, (7878661703175157774L ^ local5_life2)))), ((java.lang.Class)(com.moon.b2.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_784(6323, (290835523291631773L ^ local5_life2)))), ((java.lang.Enum)(com.moon.b2.RIGHT))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_787(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).as = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_792(28660, (4013270141748946837L ^ local5_life2)))), ((java.lang.Class)(com.moon.b1.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_796(1516, (7646781982416588287L ^ local5_life2)))), ((java.lang.Enum)(com.moon.b1.SYNC))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_799(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).at = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_804(27716, (2079401149133333556L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_807(16293, (582745225109993443L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_809(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).au = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_814(309, (9002862503602178325L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_817(23771, (3683187649024038094L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_819(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).av = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_824(18854, (2523868253569417628L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_827(31800, (5845843162793718860L ^ local5_life2)))), ((float)(1061997773)), ((float)(1036831949)), ((float)(1069547520)), ((float)(1036831949))))).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_833(receiver)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_842 = receiver;

    com.moon.me __sourceSpill26_843 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_844 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_839(20251, (275343527432914739L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_845_0 = new com.moon.setting.Setting[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_841(24834, (1687338920543687096L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill26_847 = __stackOp26_845_0;

    (__stackOp26_845_0)[0] = ((com.moon.module.impl.HUD)(receiver)).aq;

    com.moon.setting.Setting[] __stackOp26_848_0 = __sourceSpill26_847;

    com.moon.setting.Setting[] __sourceSpill26_850 = __stackOp26_848_0;

    (__stackOp26_848_0)[1] = ((com.moon.module.impl.HUD)(receiver)).ar;

    com.moon.setting.Setting[] __stackOp26_851_0 = __sourceSpill26_850;

    com.moon.setting.Setting[] __sourceSpill26_853 = __stackOp26_851_0;

    (__stackOp26_851_0)[2] = ((com.moon.module.impl.HUD)(receiver)).as;

    com.moon.setting.Setting[] __stackOp26_854_0 = __sourceSpill26_853;

    com.moon.setting.Setting[] __sourceSpill26_856 = __stackOp26_854_0;

    (__stackOp26_854_0)[3] = ((com.moon.module.impl.HUD)(receiver)).at;

    com.moon.setting.Setting[] __stackOp26_857_0 = __sourceSpill26_856;

    com.moon.setting.Setting[] __sourceSpill26_859 = __stackOp26_857_0;

    (__stackOp26_857_0)[4] = ((com.moon.module.impl.HUD)(receiver)).au;

    com.moon.setting.Setting[] __stackOp26_860_0 = __sourceSpill26_859;

    com.moon.setting.Setting[] __sourceSpill26_862 = __stackOp26_860_0;

    (__stackOp26_860_0)[5] = ((com.moon.module.impl.HUD)(receiver)).av;

    com.moon.me __sourceSpill26_865 = ((com.moon.me)(__sourceSpill26_843)).a(((java.lang.String)(__sourceSpill26_844)), ((com.moon.setting.Setting[])(__sourceSpill26_862)));

    com.moon.setting.BooleanSetting __stackOp26_866_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_868 = __stackOp26_866_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_866_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_842)).aw = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_865)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_869(__sourceSpill26_868)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_882 = receiver;

    com.moon.mf __sourceSpill26_883 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_874(21558, (6016687057393720348L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_877(25468, (1242696540619057920L ^ local5_life2)))), ((int)(3)), ((int)(1)), ((int)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_879(14723, (5089117386572548388L ^ local5_life2)))), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp26_884_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_886 = __stackOp26_884_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_884_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_882)).ax = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill26_883)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_887(__sourceSpill26_886)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_901 = receiver;

    com.moon.md __sourceSpill26_902 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_892(25197, (2665570395376691745L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_895(26720, (158990193755955292L ^ local5_life2)))), ((float)(1077936128)), ((float)(0x1.0p0f)), ((float)(1084227584)), ((float)(1056964608)));

    com.moon.setting.BooleanSetting __stackOp26_903_0 = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.BooleanSetting __sourceSpill26_905 = __stackOp26_903_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp26_903_0)));

    ((com.moon.module.impl.HUD)(__sourceSpill26_901)).ay = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(__sourceSpill26_902)).a(((java.util.function.Supplier)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_906(__sourceSpill26_905)))))).a()));

    com.moon.module.impl.HUD __sourceSpill26_915 = receiver;

    com.moon.me __sourceSpill26_916 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill26_917 = __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_912(15204, (8484579724060685104L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp26_918_0 = new com.moon.setting.Setting[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_914(29877, (8166911346184946716L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill26_920 = __stackOp26_918_0;

    (__stackOp26_918_0)[0] = ((com.moon.module.impl.HUD)(receiver)).W;

    com.moon.setting.Setting[] __stackOp26_921_0 = __sourceSpill26_920;

    com.moon.setting.Setting[] __sourceSpill26_923 = __stackOp26_921_0;

    (__stackOp26_921_0)[1] = ((com.moon.module.impl.HUD)(receiver)).X;

    com.moon.setting.Setting[] __stackOp26_924_0 = __sourceSpill26_923;

    com.moon.setting.Setting[] __sourceSpill26_926 = __stackOp26_924_0;

    (__stackOp26_924_0)[2] = ((com.moon.module.impl.HUD)(receiver)).ah;

    com.moon.setting.Setting[] __stackOp26_927_0 = __sourceSpill26_926;

    com.moon.setting.Setting[] __sourceSpill26_929 = __stackOp26_927_0;

    (__stackOp26_927_0)[3] = ((com.moon.module.impl.HUD)(receiver)).ap;

    com.moon.setting.Setting[] __stackOp26_930_0 = __sourceSpill26_929;

    com.moon.setting.Setting[] __sourceSpill26_932 = __stackOp26_930_0;

    (__stackOp26_930_0)[4] = ((com.moon.module.impl.HUD)(receiver)).aw;

    com.moon.setting.Setting[] __stackOp26_933_0 = __sourceSpill26_932;

    com.moon.setting.Setting[] __sourceSpill26_935 = __stackOp26_933_0;

    (__stackOp26_933_0)[5] = ((com.moon.module.impl.HUD)(receiver)).ax;

    com.moon.setting.Setting[] __stackOp26_936_0 = __sourceSpill26_935;

    com.moon.setting.Setting[] __sourceSpill26_940 = __stackOp26_936_0;

    (__stackOp26_936_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_938(24834, (1687338920543687096L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).ay;

    com.moon.setting.Setting[] __stackOp26_941_0 = __sourceSpill26_940;

    com.moon.setting.Setting[] __sourceSpill26_945 = __stackOp26_941_0;

    (__stackOp26_941_0)[__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_943(1131, (6072915199474660555L ^ local5_life2))] = ((com.moon.module.impl.HUD)(receiver)).ao;

    ((com.moon.module.impl.HUD)(__sourceSpill26_915)).az = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill26_916)).a(((java.lang.String)(__sourceSpill26_917)), ((com.moon.setting.Setting[])(__sourceSpill26_945))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).aA = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_950(26241, (7744202735339155138L ^ local5_life2)))), ((java.lang.Class)(com.moon.bW.class))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_954(1478, (3280359501834341856L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bW.ROBOTO))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).aB = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_960(20144, (4452632904902805198L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_963(32242, (3163840179516650965L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(1056964608)), ((float)(1082130432)), ((float)(1036831949))))).a(((com.moon.kR)(__sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_968(receiver)))))).a()));

    ((com.moon.module.impl.HUD)(receiver)).aK = ((java.util.List)(new java.util.ArrayList()));

    ((com.moon.module.impl.HUD)(receiver)).aL = ((java.util.List)(new java.util.ArrayList()));

    if ((local7_life93 != null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));

    }

    return;

}



static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-3913612852370733023L)), ((long)(-2854828129186731936L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240336530916732L)))));
    mb = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.HUD.cb ^ 25561994434770L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill277_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill277_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill277_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill277_14 = new byte[8];
    (__sourceSpill277_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill277_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation277_16 = __sourceSpill277_14;
    ((javax.crypto.Cipher)(__sourceSpill277_11)).init(((int)(__sourceSpill277_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill277_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation277_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[103];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Qø§àÜÝ8Ô/uSá-\f3­\033!K\017a£ëEä§Ú´Â\030\"çQ=uöÌ×{ª\003\031ÎGq¨c¼\"þ\036g\030.w\036²q=áå@ÚXÆ¾\022fÿ\"µ^à\030\035\fZÃI95À¹á\027ÿõð!Ó«;c¿:(\"° D]Sw«¾:\0264\nCîW\005ÛÁK3º°1Èt\rCdû¯O÷ åõ ^·I\035÷¬åÁ(+xsCÇ<N\003rqm»MEüï¿¦H\0209!\013ÝÍåWªÕe$ª¾Ä8»ªyBh\026\036T\024U!YåÑç[«*¸ò¿\177Áê\003-v+¥þJºí\031òýe]ò0\007$v\034Jú«.¡7(ªêÊ§[¬WÞ´ÿÓwÙÛp\032%­\034îBl\007;¦÷Ü£5\t Ç­Yr+W{ÚÞ\017Q¤ÅNý\003Ñ´»,Îõx\001,û\013V¡WK(ÁÄ\037||U\\itÒy¦:Â\024×Î_a¤\007\013\036ø8\rÎ®Åÿß\004ÿ%{{(LÂóùí\007¶\037qê6Æ\007¹\033æ4!âí_¾\037\005%ð\000ÚÎ \025²üÀ3I \000 áú2ï÷à\f·¹ÌX¾\\së¡J8ÌÄ-\000m\001ß¹N¾(°÷#ØQ\022£\030ºî\r>«{ötzó\022W=Áÿyß\027Dhÿ\025é\0375T: j1»g9åi(úÏàL~~\003I]}Ú\003Ù\0065¨¼Ñ\036IÄ\020¨«#Eúì,-èzñe\016Ïæ(ÌÁ¥îjµ\bWÌQ\\ozù9Q7ä×µ5!\177¡Úô,¶\037\006Ï\bm\037\t\016¥¥\030pw_ðá\fVM\031ôõ\017V-ëëýfçKÀ ,g\004\007>~Ò|Ø\016³LE\000«*D¡in¸\"Y\0324(\013Ñ[úÖµá\026Àd+2£\002?°æ«$]Ýc#Ó]¤Q;Í«8ì\007'(½5mO/\036ÍBøQµ]\016ô\"oA^\003ÄêS\bb\tw5\0251£OoÑo.8\030È(ÎÓsÛlëÙéd¯Ùdß.oð-(20\000ïùäK\n¢|AG\032Ø\034ûÏO\022D·«w\f¾Ó[¯x¶F¤kèWÇ\017\003\" Ñ \006Ù-\030­#\036¾(²Â®\0039H\f\177\bB\034æÂåvá\030Ý\035\025ÇXÙ2Â½\021-­¶>\001\021ýoÞ^P(\033jrF\005Å«tr\013yÆL®Ï2ÏÌe÷{\002VI\034r¸:\023ë\036\033ÿ\020M\025\023ÿRn\036êÁ6¢\021æ\027 ÿõs\034\027`rý£\004Q;p\004¸p(($w¯\021'Ê\007åz¶\027 +ðÙQö&å\bßSc\037Ö6Q\036Ï.òRÉ~HQîÓ\036\fÖ#\020ñ¾n\177Êöâ&Ìù<=\037?w(@s\r«³{Ïö²°Ðøúþ\b¶¢æÓÍw\023¸\025Îc1\005ô^QÛ¾í %Båa1\nm\021ßóþ¸£ #,üí/Dù5\000ÇáfXÐ j\024M+ÌÖ\033§O¯\020\177%ôói\013`}\020ËµÖì}\004\bØ \017½¤>»\t\00217²¸Øy\bî\bH®tOu²ÜØÊ¿D»\027\006\030Vê\000Fãô¶ðýy³Øv¿Gd\036+\030fý\022Yp^º]\002SRÿ¹!\034Ø­\0327\n¼\177þ\020\0258FxäÎBRl:ä(|\030µáÆzLBøD\036rUjç#vûË_ìg_8iB\007j>Ìóì@Ò\016'\017¢ï-Fö¿aFÞ\007éjc6µíJ-}?¦%´_\022ÜØ«g\024\027Ç(\007Þ>u`©¯Lµ¡P¥Î1\n\026F¾|`ãzþª¬±X®\007C©jÁA(×Ûß8ÁÐ%\f0\031±09b­Ôûõèª¦½\b~ÆKÞg\"õ8üiNg(\021\n\032%÷ýÃ¡á'\035xÊÈèy\025YLß\026-\027Êy¼CL¦CäD4\0309#O3r\000Ï\031Ë>§íÂòFc<RÒ\"Q8¤zõcïj\nÁÉ\027ÿC\0231Òé¢¶Ê¸Þî°íw\">r\016à2ðbH@5X\0130´±¶ÇQ¡³¬Á§\036\030Ç<M-qÕ~\037\013xÎV³øGmBa<Ô\034/s(+5-ú6\tÜ{PÌrÆZ¸a£¡sÔÈ¸ß\020¯Îâ7\021æ@±\036\006(ýyûë\bÅ]è\025©°\b.,Q\026«Jò¯eBH^ÉFÀ\017ñy\032\030×`7aj±`Ë\033Ì}\rßÄk~vÔÖn\035\030,®2Â\031³èÖñU,çÓÏÁ\004¢¤\020@q4àÚ]\177×â'©Ê0!ÿ½÷¸Àûôå\023Ñ\030%X½ra3r\177¯sº¼?¡ii\002TÉOwû\033\037\024%v\027à¯âí(H0Ø°ï¸T!\005>A­OÔ*ú»Ðv²ÀTlÎ\\µä©FÂ½3\013±\r\003ú\033 @¹ú­jñÁXÞ«\022á.t¯¨A\030F+ªÙÖð8=jëïEQÏ \bÇP]Ç®¦P¬XíF\000l|\030ÕÐJm~¡£ï\032Yf\030ê\002ì\nÃ^¸9t¬Õ6{5\0239\033¨ïÙà_r\020ÝÉ³¨ãíÄZ±@°ÛC\003'M(0¡p5\bg\fN\037`Ý\024z\005\001©a³¶øð@?D5WòòÕ\003ÂêWÒ\030Ö%º\005Ä³ö®@\003\rìôwè\005ãªX\033\034(þö\007Â6O^Y1ËågÞx@\000\031dRÑ\017yX\003+\022ØkÃþ9/Uc+í{ D¦\036! \fg¡\006(²;êÿ_\013²)/º/½èl^Xîþi÷ù ³ùÚ¡ÂvÖÌ\027¿hµÀí@\035Ô*\007`1[ñOe0× \b\016u0\006úUJèÐ\024+ÇÕA\021Rº\003þØhÂ]IdØu0ª\026ÉAo°?ff\"ø»cÔå\b¦bE>d^iF!ù³ÓWm¿{pg|O¢\021ÁX&\020üïl\022Î\0000Ôc^«\032ý·¦\030ºÚÐÎù\":ÆÚNæÆ@(áÊ´Çâ D$w\013\004û\bjÝM×Ö/f\005Y:\026N\021Ô 7nLæe ·ÐäuÙö\003Jû/\004±\022²Éêa\013ÏBc:¿©\001\032Ú_i`(kH!À¥Ä}*òÙHøë !MBåx·÷\rUSÚ./\0138\013Êål°íy\030\016Æ<gfÂ;ªcFo O\033û@N'ä\030;#u*tAZ.T:Dë\rØU\b\037¹øÝÈ\030÷°Dí\033KË\001µSkd¦¼ë«õ3ë&E:\020çç°»Ù\027é¦¹/7Xr(JO\013³\0329\016=\"°Å[RvDñ'náõ©'\033èx\031ÜôFâ\006¿º\030Fôe\013\021&ß­+înÐäþD+=«%¨\030tK=ÂÃ?ÒÏ[iëo7r­*h\177\177%\002\006(\022ß,\026ËÆb!]òiï\030Bl_E\005³\"ê7ý¬D½þ¥iæ<\035ìõl0á [GÇµ\f«DßDQÚðîGó|æCÞ\037\f(X\006í¶Â(i\téw\037\016@\017¬Ä°í¢#\003áÁV{øê\021°Â'ëe\026à¸½4P\020_,DÇª/¼¼1¨ìß{(\036c!5-¡Í$@¥ÒJß^ÐÆo\006Â¿+¨ä\002*Í}ËPnGë4\n¦ ­2V2Ö¸YGvïÆ\034ÞOÏEjc%÷Ò.uÎ\005/¥k\030/f\031óG\035­©\002\021o ÿ(\006\013\brÆq\000)ée\030\035\036\\uû\nn¨ÿsL\003[&%+LTÉw\030<R§8û¥zk|÷â¯0×[²ôoÂ»º\030#RðV=(saÔP'\bÑµ`j\032í¶¡8\030Ïý|ÆnúYùÔ\026\031ñ¾ÎÖ¶èÚ1+tv<\020ýA[\033xÂz\n|¥ë\"O[» \0200-È+nP!I\035E<$^u¸Å$Úf<º+8É¦\032m*dµ^\003ÅG´4G\nÚî\037ÁÁù§#\013á½*³±óáÓ\022\007q1½\037Î\016\"ÝÍÆë]ã(õyõ]¯Z\n«¨vÓÍãS\003;W/GÚ\ng¥\024¿ëàc²5Ûñ£ÁÒ¦\004(]eî°ÉøCE¥æÿÿøü\002t^f8Î4È\030&x^0dätãKÙ(\022 C\025\021½54!ÖSÿ\020yvú\003Ç\013\rê¿:\035S\032\034D\005V\030ó\"æR¢&Å\tkþ_&6bc\022&:ÃØ(\022=°âBz(ãÔ¬b´\027¡¢Ù|YLüz{Ý[âÅaQÒþì5ã{ f\031/¤yë?Ïw;:JÛnÿ¸·_ÃÒ\002\002\035öè³7 µH%þ+>G\0251ú9¯Üü\020\001\"l}ú{m.8O/ËÄ¢Ï¤kö2\024Z'«\177uª\022(]ÞW@8yàüå]W,v,(WøF4×\\4M¸EéW#*ß[)\036\030â¦*òÑyÉsÞ^Ú²Û¡ÒYOß±WÊ Ñwm9ø¨§_[Jë a~d­zÿ|JpÈ¤9æäd(÷Ï[¸lÍf>Cc:\020n\021WÌÓiysæ8\177:\005ÏoeÆ·/ÕI5ø\030Çõd.Ð_\026èªà\001rFù¸È\"\177±mAr\002"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill277_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill277_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill277_29)).doFinal(((byte[])(__sourceSpill277_28)));
        java.lang.String __sourceSpill277_34 = ((java.lang.String)(com.moon.module.impl.HUD.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill277_35 = local20_life19;
        int __sourceSpill277_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill277_35)[__sourceSpill277_36] = __sourceSpill277_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = " Ý\022\001\033\\\nÕª¬í«<í\030yV-ÍÔ½eåB)t+\000kÕøJ¹i¢Í"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill277_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill277_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill277_42)).doFinal(((byte[])(__sourceSpill277_41)));
        java.lang.String __sourceSpill277_47 = ((java.lang.String)(com.moon.module.impl.HUD.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill277_48 = local20_life19;
        int __sourceSpill277_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill277_48)[__sourceSpill277_49] = __sourceSpill277_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    kb = ((java.lang.String[])(local20_life19));
    lb = ((java.lang.String[])(new java.lang.String[103]));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill277_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill277_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill277_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill277_60 = new byte[8];
    (__sourceSpill277_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill277_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation277_62 = __sourceSpill277_60;
    ((javax.crypto.Cipher)(__sourceSpill277_57)).init(((int)(__sourceSpill277_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill277_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation277_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[19];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "aÃ\0046¸Ç§ù\022[f\"¸_ß÷»öùyü)U9brm\022ÂÈ\002Gf¶DUðâË\t°jJ\007I5¼æÙ~¡T\027ºLRáô:ÚÞR'u½P¿³\027¨ù·Úèàt\021û ­§QÆÜ¸d\003fË'bÓ?SöË>ÿ<Ù½\026â\025à3âJSXIvRwêqØOMvÜ¨"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill277_71 = local4_life67;
        int __sourceSpill277_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill277_71)).substring(((int)(__sourceSpill277_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill277_76 = local6_life65;
        int __sourceSpill277_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill277_79 = new byte[8];
        (__sourceSpill277_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill277_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill277_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill277_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill277_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill277_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill277_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill277_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill277_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill277_80)).doFinal(((byte[])(__sourceSpill277_79)));
        (__sourceSpill277_76)[__sourceSpill277_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "\006«!\007\026A=k\001\rRyl÷I"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill277_84 = local4_life67;
        int __sourceSpill277_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill277_84)).substring(((int)(__sourceSpill277_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill277_89 = local6_life65;
        int __sourceSpill277_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill277_92 = new byte[8];
        (__sourceSpill277_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill277_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill277_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill277_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill277_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill277_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill277_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill277_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill277_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill277_93)).doFinal(((byte[])(__sourceSpill277_92)));
        (__sourceSpill277_89)[__sourceSpill277_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    ob = ((long[])(local6_life65));
    pb = ((java.lang.Integer[])(new java.lang.Integer[19]));
}

private static native <E extends Throwable> void __sourceConstructorInit_79caec772487bd0a_0(com.moon.module.impl.HUD a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public com.moon.setting.ColorSetting i__kX() {
return this.au;
}


public com.moon.setting.SettingGroup i() {
return this.az;
}


public com.moon.setting.ModeSetting<com.moon.bW> i__kY() {
return this.aA;
}


public com.moon.setting.BooleanSetting i__kV() {
return this.I;
}


public com.moon.hW b() {
return this.aD;
}


public com.moon.setting.ModeSetting<com.moon.b0> b__kY() {
return this.z;
}


public java.util.List<com.moon.hi> b__List() {
return this.aK;
}


public com.moon.setting.ColorSetting b__kX() {
return this.B;
}


public com.moon.setting.SettingGroup b__k0() {
return this.G;
}


public com.moon.setting.IntegerSetting b__k1() {
return this.aj;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.w;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.ag;
}


public com.moon.setting.ColorSetting e__kX() {
return this.ad;
}


public com.moon.setting.IntegerSetting e__k1() {
return this.ax;
}


public com.moon.setting.FloatSetting e__kZ() {
return this.aB;
}


public com.moon.hW e() {
return this.aG;
}


public com.moon.setting.ModeSetting<com.moon.bZ> e__kY() {
return this.ab;
}


public com.moon.setting.SettingGroup e__k0() {
return this.V;
}


public com.moon.setting.BooleanSetting e__kV() {
return this.D;
}


public com.moon.setting.BooleanSetting s() {
return this.ai;
}


public com.moon.setting.SettingGroup c__k0() {
return this.O;
}


public com.moon.hW c() {
return this.aE;
}


public com.moon.setting.IntegerSetting c__k1() {
return this.an;
}


public com.moon.setting.FloatSetting c__kZ() {
return this.av;
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
        byte[] spill1100_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1100_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1100_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1100_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1100_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1100_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public boolean c__Boolean() {
return ((((this.s) ? 1 : 0)) != 0);
}


public com.moon.setting.BooleanSetting c__kV() {
return this.x;
}


public java.util.List<com.moon.hn> c__List() {
return this.aL;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14949);
    if (((com.moon.module.impl.HUD.lb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.HUD.mb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.HUD.mb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lY", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.HUD.kb)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.HUD.lb)[life5_8] = com.moon.module.impl.HUD.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.HUD.lb)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.HUD.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2492_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.ColorSetting c__kX() {
return this.M;
}


public com.moon.setting.ModeSetting<com.moon.b0> c__kY() {
return this.L;
}


public com.moon.setting.BooleanSetting n() {
return this.R;
}


public com.moon.setting.BooleanSetting h__kV() {
return this.H;
}


public com.moon.setting.ColorSetting h__kX() {
return this.at;
}


public com.moon.setting.ModeSetting<com.moon.b1> h__kY() {
return this.as;
}


public com.moon.hW h() {
return this.aJ;
}


public com.moon.setting.SettingGroup h__k0() {
return this.aw;
}


public com.moon.setting.SettingGroup f__k0() {
return this.ah;
}


public com.moon.setting.ColorSetting f__kX() {
return this.ae;
}


public com.moon.setting.BooleanSetting f__kV() {
return this.E;
}


public com.moon.setting.ModeSetting<com.moon.bY> f__kY() {
return this.ac;
}


public com.moon.hW f() {
return this.aH;
}


public com.moon.setting.BooleanSetting l() {
return this.P;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2493_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.HUD.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.IntegerSetting d__k1() {
return this.ao;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 700;
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
            throw new RuntimeException("com/moon/lY", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


public com.moon.setting.FloatSetting d__kZ() {
return this.ay;
}


public com.moon.hW d() {
return this.aF;
}


public com.moon.setting.ColorSetting d__kX() {
return this.N;
}


public com.moon.setting.SettingGroup d__k0() {
return this.U;
}


public com.moon.setting.ModeSetting<com.moon.bX> d__kY() {
return this.aa;
}


public com.moon.setting.BooleanSetting d__kV() {
return this.y;
}


public com.moon.module.impl.HUD a(com.moon.hq p0) {
this.aM = ((com.moon.hq)(p0));
    return this;
}


public void a(com.moon.eC p0) {
com.moon.module.impl.HUD lexicalValue234_23_0;
    com.moon.hW lexicalValue234_33_0;
    com.moon.hW lexicalValue234_42_0;
    com.moon.hW lexicalValue234_51_0;
    com.moon.hW lexicalValue234_60_0;
    com.moon.hW lexicalValue234_69_0;
    com.moon.hW lexicalValue234_78_0;
    com.moon.hW lexicalValue234_89_0;
    com.moon.module.impl.HUD lexicalValue234_168_0;
    com.moon.hi lexicalValue234_217_0;
    com.moon.hi lexicalValue234_268_0;
    float lexicalValue234_268_1;
    com.moon.hi lexicalValue234_273_0;
    float lexicalValue234_273_1;
    float lexicalValue234_273_2;
    com.moon.hi lexicalValue234_347_0;
    float lexicalValue234_347_1;
    com.moon.hi lexicalValue234_348_0;
    float lexicalValue234_348_1;
    float lexicalValue234_348_2;
    com.moon.hi lexicalValue234_352_0;
    float lexicalValue234_352_1;
    float lexicalValue234_352_2;
    net.minecraft.entity.Entity[] spill234_0;
    com.moon.module.impl.HUD spill234_1;
    com.moon.hW spill234_2;
    com.moon.module.impl.HUD spill234_3;
    com.moon.hi spill234_4;
    com.moon.hi spill234_5;
    float spill234_6;
    com.moon.hi spill234_7;
    float spill234_8;
    float spill234_9;
    com.moon.hi spill234_10;
    float spill234_11;
    long life2_3;
    com.moon.jm life5_12;
    net.minecraft.entity.Entity[] life4_13;
    java.util.Iterator life6_224;
    com.moon.hn life7_231;
    com.moon.hi life7_265;
    com.moon.hl life8_281;
    float life9_290;
    lexical_join_373: {
    lexical_join_202: {
    lexical_join_198: {
    lexical_join_168: {
    lexical_join_94: {
    lexical_join_89: {
    lexical_join_85: {
    lexical_join_78: {
    lexical_join_76: {
    lexical_join_69: {
    lexical_join_67: {
    lexical_join_60: {
    lexical_join_58: {
    lexical_join_51: {
    lexical_join_49: {
    lexical_join_42: {
    lexical_join_40: {
    lexical_join_33: {
    lexical_join_31: {
    lexical_join_23: {
    life2_3 = (com.moon.module.impl.HUD.cb ^ 9156702635978L);
    spill234_0 = com.moon.bY.b();
    life5_12 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(this.aA)).getValue())))).a__Supplier())).get()));
    life4_13 = spill234_0;
    spill234_1 = this;
    if (!((life4_13 == null))) {
        lexicalValue234_23_0 = spill234_1;
        break lexical_join_23;
    }
    if (!(((com.moon.module.impl.HUD)(spill234_1)).s)) {
        break lexical_join_373;
    }
    this.s = ((boolean)(false));
    lexicalValue234_23_0 = this;
    }
    spill234_2 = ((com.moon.module.impl.HUD)(lexicalValue234_23_0)).aC;
    if (!((life4_13 == null))) {
        lexicalValue234_33_0 = spill234_2;
        break lexical_join_33;
    }
    if (!((spill234_2 != null))) {
        break lexical_join_31;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aC)).a__hY())).g();
    }
    lexicalValue234_33_0 = this.aD;
    }
    if (!((life4_13 == null))) {
        lexicalValue234_42_0 = lexicalValue234_33_0;
        break lexical_join_42;
    }
    if (!((lexicalValue234_33_0 != null))) {
        break lexical_join_40;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aD)).a__hY())).g();
    }
    lexicalValue234_42_0 = this.aE;
    }
    if (!((life4_13 == null))) {
        lexicalValue234_51_0 = lexicalValue234_42_0;
        break lexical_join_51;
    }
    if (!((lexicalValue234_42_0 != null))) {
        break lexical_join_49;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aE)).a__hY())).g();
    }
    lexicalValue234_51_0 = this.aF;
    }
    if (!((life4_13 == null))) {
        lexicalValue234_60_0 = lexicalValue234_51_0;
        break lexical_join_60;
    }
    if (!((lexicalValue234_51_0 != null))) {
        break lexical_join_58;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aF)).a__hY())).g();
    }
    lexicalValue234_60_0 = this.aH;
    }
    if (!((life4_13 == null))) {
        lexicalValue234_69_0 = lexicalValue234_60_0;
        break lexical_join_69;
    }
    if (!((lexicalValue234_60_0 != null))) {
        break lexical_join_67;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aH)).a__hY())).g();
    }
    lexicalValue234_69_0 = this.aG;
    }
    if (!((life4_13 == null))) {
        lexicalValue234_78_0 = lexicalValue234_69_0;
        break lexical_join_78;
    }
    if (!((lexicalValue234_69_0 != null))) {
        break lexical_join_76;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aG)).a__hY())).g();
    }
    lexicalValue234_78_0 = this.aI;
    }
    if (!((life4_13 == null))) {
        lexicalValue234_89_0 = lexicalValue234_78_0;
        break lexical_join_89;
    }
    if (!((lexicalValue234_78_0 != null))) {
        break lexical_join_85;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aI)).a__hY())).g();
    }
    spill234_3 = this;
    if (!((life4_13 == null))) {
        lexicalValue234_168_0 = spill234_3;
        break lexical_join_168;
    }
    lexicalValue234_89_0 = ((com.moon.module.impl.HUD)(spill234_3)).aJ;
    }
    if (!((lexicalValue234_89_0 != null))) {
        break lexical_join_94;
    }
    ((com.moon.hY)(((com.moon.hW)(this.aJ)).a__hY())).g();
    }
    this.aC = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.RECTANGLE))))).a__hX())).c())).a()));
    this.aE = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a__hX())).c())).a()));
    this.aF = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a__hX())).c())).a(((com.moon.jm)(life5_12))))).a()));
    this.aI = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a__hX())).c())).a(((com.moon.jm)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)))))))).a()));
    this.aD = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a__hX())).c())).a()));
    this.aH = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a__hX())).c())).a()));
    this.aG = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a__hX())).c())).a(((com.moon.jm)(life5_12))))).a()));
    this.aJ = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a__hX())).c())).a()));
    lexicalValue234_168_0 = this;
    }
    life6_224 = ((java.util.List)(((com.moon.module.impl.HUD)(lexicalValue234_168_0)).aL)).iterator();
    lexical_cycle_171: while (true) {
    if (!(((java.util.Iterator)(life6_224)).hasNext())) {
        break lexical_join_198;
    }
    life7_231 = ((com.moon.hn)(((java.util.Iterator)(life6_224)).next()));
    ((com.moon.hn)(life7_231)).a(((com.moon.hW)(this.aC)));
    ((com.moon.hn)(life7_231)).b(((com.moon.hW)(this.aE)));
    ((com.moon.hn)(life7_231)).c(((com.moon.hW)(this.aD)));
    ((com.moon.hn)(life7_231)).d(((com.moon.hW)(this.aF)));
    if (!((life4_13 == null))) {
        break lexical_join_202;
    }
    if (!((life4_13 != null))) { continue lexical_cycle_171; }
    break lexical_cycle_171;
    }
    }
    life6_224 = ((java.util.List)(this.aK)).iterator();
    }
    lexical_cycle_202: while (true) {
    lexical_join_352: {
    lexical_join_348: {
    lexical_join_347: {
    lexical_join_339: {
    lexical_join_330: {
    lexical_join_273: {
    lexical_join_268: {
    lexical_join_260: {
    lexical_join_217: {
    lexical_join_216: {
    if (!(((java.util.Iterator)(life6_224)).hasNext())) {
        break lexical_join_373;
    }
    life7_265 = ((com.moon.hi)(((java.util.Iterator)(life6_224)).next()));
    spill234_4 = life7_265;
    if (!((life4_13 == null))) {
        lexicalValue234_217_0 = spill234_4;
        break lexical_join_217;
    }
    if (!((!((com.moon.hi)(spill234_4)).a__Boolean()))) {
        break lexical_join_216;
    }
    if (!((life4_13 != null))) { continue lexical_cycle_202; }
    }
    lexicalValue234_217_0 = life7_265;
    }
    life8_281 = ((com.moon.hi)(lexicalValue234_217_0)).a__hl();
    if (!((!((com.moon.hl)(life8_281)).b()))) {
        break lexical_join_260;
    }
    life9_290 = ((com.moon.jm)(life5_12)).a(((java.lang.String)(((com.moon.hl)(life8_281)).a__String())), ((float)(0x1.8p3f)));
    ((com.moon.jm)(life5_12)).a(((com.moon.hW)(this.aG)), ((java.lang.String)(((com.moon.hl)(life8_281)).a__String())), ((float)(0x1.8p3f)), ((float)(((((com.moon.hi)(life7_265)).a() + (((com.moon.hi)(life7_265)).c() / 0x1.0p1f)) - (life9_290 / 0x1.0p1f)))), ((float)((((com.moon.hi)(life7_265)).b() + 0x1.0p2f))), ((int)(-1)));
    ((com.moon.hi)(life7_265)).c(((float)(java.lang.Math.max(((float)(((com.moon.hi)(life7_265)).c())), ((float)((life9_290 + 0x1.0p3f)))))));
    }
    spill234_5 = life7_265;
    spill234_6 = ((com.moon.hi)(life7_265)).d();
    if (!(((com.moon.hl)(life8_281)).b())) {
        lexicalValue234_268_0 = spill234_5;
        lexicalValue234_268_1 = spill234_6;
        break lexical_join_268;
    }
    lexicalValue234_273_0 = spill234_5;
    lexicalValue234_273_1 = spill234_6;
    lexicalValue234_273_2 = 0x1.0p2f;
    break lexical_join_273;
    }
    lexicalValue234_273_0 = lexicalValue234_268_0;
    lexicalValue234_273_1 = lexicalValue234_268_1;
    lexicalValue234_273_2 = (0x1.0p3f + ((com.moon.jm)(life5_12)).a(((float)(0x1.8p3f))));
    }
    ((com.moon.hi)(lexicalValue234_273_0)).d(((float)(java.lang.Math.max(((float)(lexicalValue234_273_1)), ((float)(lexicalValue234_273_2))))));
    if (!((life4_13 == null))) {
        break lexical_join_339;
    }
    if (!((!((com.moon.hl)(life8_281)).a__Boolean()))) {
        break lexical_join_330;
    }
    ((com.moon.hW)(this.aE)).a(((com.moon.iX)(com.moon.i3.a(((float)((((com.moon.hi)(life7_265)).a() - 0x1.0p0f))), ((float)((((com.moon.hi)(life7_265)).b() - 0x1.0p0f))), ((float)((((com.moon.hi)(life7_265)).c() + 0x1.0p1f))), ((float)((((com.moon.hi)(life7_265)).d() + 0x1.0p1f))), ((float)(0x1.8p2f)), ((int)(__sourceIntrinsic_3a8b43439e1a_invokedynamic234_148(9909, (6801685639807624549L ^ life2_3))))))));
    ((com.moon.hW)(this.aD)).a(((com.moon.iX)(com.moon.i3.a(((float)((((com.moon.hi)(life7_265)).a() - 0x1.0p0f))), ((float)((((com.moon.hi)(life7_265)).b() - 0x1.0p0f))), ((float)((((com.moon.hi)(life7_265)).c() + 0x1.0p1f))), ((float)((((com.moon.hi)(life7_265)).d() + 0x1.0p1f))), ((float)(0x1.8p2f)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    }
    spill234_7 = life7_265;
    spill234_8 = ((com.moon.hi)(life7_265)).a();
    spill234_9 = 0x1.0p2f;
    if (!((life4_13 == null))) {
        lexicalValue234_348_0 = spill234_7;
        lexicalValue234_348_1 = spill234_8;
        lexicalValue234_348_2 = spill234_9;
        break lexical_join_348;
    }
    ((com.moon.hi)(spill234_7)).e(((float)((spill234_8 + spill234_9))));
    }
    spill234_10 = life7_265;
    spill234_11 = ((com.moon.hi)(life7_265)).b();
    if (!(((com.moon.hl)(life8_281)).b())) {
        lexicalValue234_347_0 = spill234_10;
        lexicalValue234_347_1 = spill234_11;
        break lexical_join_347;
    }
    lexicalValue234_352_0 = spill234_10;
    lexicalValue234_352_1 = spill234_11;
    lexicalValue234_352_2 = 0x1.0p2f;
    break lexical_join_352;
    }
    lexicalValue234_348_0 = lexicalValue234_347_0;
    lexicalValue234_348_1 = lexicalValue234_347_1;
    lexicalValue234_348_2 = 0x1.0p3f;
    }
    lexicalValue234_352_0 = lexicalValue234_348_0;
    lexicalValue234_352_1 = lexicalValue234_348_1;
    lexicalValue234_352_2 = (lexicalValue234_348_2 + ((com.moon.jm)(life5_12)).a(((float)(0x1.8p3f))));
    }
    ((com.moon.hi)(lexicalValue234_352_0)).f(((float)((lexicalValue234_352_1 + lexicalValue234_352_2))));
    ((com.moon.hi)(life7_265)).a(((com.moon.hW)(this.aC)));
    ((com.moon.hi)(life7_265)).c(((com.moon.hW)(this.aD)));
    ((com.moon.hi)(life7_265)).b(((com.moon.hW)(this.aE)));
    ((com.moon.hi)(life7_265)).d(((com.moon.hW)(this.aG)));
    if (!((life4_13 != null))) { continue lexical_cycle_202; }
    break lexical_cycle_202;
    }
    }
    return;
}


public com.moon.hW a() {
return this.aC;
}


public com.moon.setting.IntegerSetting a__k1() {
return this.T;
}


public com.moon.setting.ColorSetting a__kX() {
return this.A;
}


public com.moon.setting.SettingGroup a__k0() {
return this.C;
}


public com.moon.module.impl.HUD a(boolean p0) {
this.s = ((boolean)(p0));
    return this;
}


public com.moon.k5 a__k5() {
return this.v;
}


public com.moon.hq a__hq() {
return this.aM;
}


public void a(com.moon.event.TickEvent p0) {
((com.moon.module.impl.HUD)(this)).a(((boolean)(true)));
    return;
}


public com.moon.setting.ModeSetting<com.moon.b3> a__kY() {
return this.u;
}


public void a(com.moon.ej p0) {
com.moon.hW forwardValue839_30_0;
    com.moon.hW spill839_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_32: {
    forward_join_30: {
    forward_join_11: {
    life2_3 = (com.moon.module.impl.HUD.cb ^ 136324600569230L);
    life4_5 = com.moon.bY.b();
    if (!(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.HUD.d)).W)).aQ)) {
        break forward_join_11;
    }
    return;
    }
    spill839_0 = this.aD;
    if (!((life4_5 == null))) {
        forwardValue839_30_0 = spill839_0;
        break forward_join_30;
    }
    if (!((spill839_0 != null))) {
        break forward_join_32;
    }
    com.moon.hU.a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.aB)).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.aB)).getValue())))).floatValue())), ((float)(0x1.0p0f)));
    forwardValue839_30_0 = this.aD;
    }
    ((com.moon.hW)(forwardValue839_30_0)).b();
    com.moon.hU.a__Void();
    }
    return;
}


public void a__Void(com.moon.hq p0) {
((java.util.Map)(((com.moon.hq)(p0)).a__Map())).clear();
    return;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.t;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.af;
}


public com.moon.setting.MultiSelectSetting<com.moon.module.ModuleCategory> a__k4() {
return this.X;
}


public void a(com.moon.event.Render2DEvent p0) {
com.moon.event.RenderPhase forestValue193_23_0;
    com.moon.event.RenderPhase forestValue193_23_1;
    java.lang.Object forestValue193_82_0;
    com.moon.hi forestValue193_129_0;
    com.moon.event.RenderPhase spill193_0;
    com.moon.event.RenderPhase spill193_1;
    com.moon.event.RenderPhase spill193_2;
    int spill193_3;
    long spill193_4;
    com.moon.hi spill193_5;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    java.util.Iterator life5_97;
    com.moon.hn life6_104;
    com.moon.hi life6_122;
    forest_join_149: {
    forest_join_148: {
    forest_join_132: {
    forest_join_112: {
    forest_join_108: {
    forest_join_82: {
    forest_join_23: {
    forest_join_18: {
    forest_join_11: {
    life2_3 = (com.moon.module.impl.HUD.cb ^ 89398742055743L);
    life4_5 = com.moon.bY.b();
    if (!(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.HUD.d)).W)).aQ)) {
        break forest_join_11;
    }
    return;
    }
    spill193_0 = ((com.moon.event.Render2DEvent)(p0)).getPhase();
    spill193_1 = com.moon.event.RenderPhase.PRE;
    if (!((life4_5 == null))) {
        forestValue193_23_0 = spill193_0;
        forestValue193_23_1 = spill193_1;
        break forest_join_23;
    }
    if (!((spill193_0 == spill193_1))) {
        break forest_join_18;
    }
    break forest_join_149;
    }
    spill193_2 = ((com.moon.event.Render2DEvent)(p0)).getPhase();
    if (!((life4_5 == null))) {
        forestValue193_82_0 = spill193_2;
        break forest_join_82;
    }
    forestValue193_23_0 = spill193_2;
    forestValue193_23_1 = com.moon.event.RenderPhase.POST;
    }
    if (!((forestValue193_23_0 == forestValue193_23_1))) {
        break forest_join_149;
    }
    ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.HUD.d)).a__pA())).a(((boolean)(true)));
    spill193_3 = 28203;
    moom.kZ.i();
    spill193_4 = (5111941498589761800L ^ life2_3);
    moom.kZ.l();
    moom.kZ.a(((int)(__sourceIntrinsic_cd0609abcd78_invokedynamic193_14(spill193_3, spill193_4))), ((int)(__sourceIntrinsic_cd0609abcd78_invokedynamic193_15(13166, (1540989599124950094L ^ life2_3)))), ((int)(1)), ((int)(0)));
    com.moon.hU.a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.aB)).getValue())))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.aB)).getValue())))).floatValue())), ((float)(0x1.0p0f)));
    ((com.moon.hW)(this.aC)).b();
    ((com.moon.hW)(this.aE)).b();
    ((com.moon.hW)(this.aJ)).b();
    ((com.moon.hW)(this.aH)).b();
    ((com.moon.hW)(this.aG)).b();
    ((com.moon.hW)(this.aF)).b();
    ((com.moon.hW)(this.aI)).b();
    com.moon.hU.a__Void();
    moom.kZ.u();
    moom.kZ.l();
    forestValue193_82_0 = ((com.moon.setting.FloatSetting)(this.aB)).getValue();
    }
    moom.kZ.a(((float)(((java.lang.Float)(((java.lang.Float)(forestValue193_82_0)))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.aB)).getValue())))).floatValue())), ((float)(0x1.0p0f)));
    life5_97 = ((java.util.List)(this.aL)).iterator();
    forest_cycle_95: while (true) {
    if (!(((java.util.Iterator)(life5_97)).hasNext())) {
        break forest_join_108;
    }
    life6_104 = ((com.moon.hn)(((java.util.Iterator)(life5_97)).next()));
    ((com.moon.hn)(life6_104)).a__Void();
    if (!((life4_5 == null))) {
        break forest_join_112;
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_95;
    }
    break forest_cycle_95;
    }
    }
    life5_97 = ((java.util.List)(this.aK)).iterator();
    }
    forest_cycle_112: while (true) {
    forest_join_129: {
    forest_join_128: {
    if (!(((java.util.Iterator)(life5_97)).hasNext())) {
        break forest_join_132;
    }
    life6_122 = ((com.moon.hi)(((java.util.Iterator)(life5_97)).next()));
    if (!((life4_5 == null))) {
        break forest_join_148;
    }
    spill193_5 = life6_122;
    if (!((life4_5 == null))) {
        forestValue193_129_0 = spill193_5;
        break forest_join_129;
    }
    if (!((!((com.moon.hi)(spill193_5)).a__Boolean()))) {
        break forest_join_128;
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_112;
    }
    }
    forestValue193_129_0 = life6_122;
    }
    ((com.moon.hi)(forestValue193_129_0)).a__Void();
    if (!((life4_5 != null))) {
        continue forest_cycle_112;
    }
    break forest_cycle_112;
    }
    }
    moom.kZ.a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.aB)).getValue())))).floatValue()))), ((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.aB)).getValue())))).floatValue()))), ((float)(0x1.0p0f)));
    }
    moom.kZ.j();
    }
    return;
}


public com.moon.setting.BooleanSetting m() {
return this.Q;
}


public com.moon.setting.BooleanSetting o() {
return this.S;
}


public com.moon.setting.BooleanSetting p() {
return this.W;
}


public com.moon.setting.BooleanSetting k() {
return this.K;
}


public com.moon.setting.BooleanSetting t() {
return this.ak;
}


public com.moon.hW g() {
return this.aI;
}


public com.moon.setting.ModeSetting<com.moon.b2> g__kY() {
return this.ar;
}


public com.moon.setting.SettingGroup g__k0() {
return this.ap;
}


public com.moon.setting.ColorSetting g__kX() {
return this.al;
}


public com.moon.setting.BooleanSetting g__kV() {
return this.F;
}


public com.moon.setting.BooleanSetting v() {
return this.aq;
}


public com.moon.setting.BooleanSetting j() {
return this.J;
}


public com.moon.setting.BooleanSetting q() {
return this.Y;
}


public com.moon.setting.BooleanSetting u() {
return this.am;
}


public com.moon.setting.BooleanSetting r() {
return this.Z;
}


private java.lang.Boolean lambda$new$0() {
java.lang.Object forwardValue841_17_0;
    int forwardValue841_22_0;
    java.lang.Boolean spill841_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 131203800605404L);
    life3_5 = com.moon.bY.b();
    spill841_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue841_17_0 = spill841_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill841_0)).booleanValue())) {
        break forward_join_21;
    }
    forwardValue841_17_0 = ((com.moon.setting.ModeSetting)(this.u)).getValue();
    }
    if (!((forwardValue841_17_0 == com.moon.b3.TEXT))) {
        break forward_join_21;
    }
    forwardValue841_22_0 = 1;
    break forward_join_22;
    }
    forwardValue841_22_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue841_22_0))));
}


private java.lang.Boolean lambda$new$1() {
java.lang.Object forwardValue842_17_0;
    int forwardValue842_22_0;
    java.lang.Boolean spill842_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 25169008207557L);
    life3_5 = com.moon.bY.b();
    spill842_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue842_17_0 = spill842_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill842_0)).booleanValue())) {
        break forward_join_21;
    }
    forwardValue842_17_0 = ((com.moon.setting.ModeSetting)(this.u)).getValue();
    }
    if (!((forwardValue842_17_0 == com.moon.b3.TEXT))) {
        break forward_join_21;
    }
    forwardValue842_22_0 = 1;
    break forward_join_22;
    }
    forwardValue842_22_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue842_22_0))));
}


private java.lang.Boolean lambda$new$11() {
int forwardValue844_19_0;
    int forwardValue844_23_0;
    int forwardValue844_25_0;
    boolean spill844_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 129828585881120L);
    life3_5 = com.moon.bY.b();
    spill844_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.ai)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue844_19_0 = ((spill844_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill844_0)) {
        break forward_join_24;
    }
    forwardValue844_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.W)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue844_23_0 = forwardValue844_19_0;
        break forward_join_23;
    }
    if (!((forwardValue844_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue844_23_0 = 1;
    }
    forwardValue844_25_0 = forwardValue844_23_0;
    break forward_join_25;
    }
    forwardValue844_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue844_25_0))));
}


private java.lang.Boolean lambda$new$18() {
java.lang.Object forwardValue851_17_0;
    java.lang.Object forwardValue851_24_0;
    int forwardValue851_30_0;
    int forwardValue851_32_0;
    java.lang.Boolean spill851_0;
    boolean spill851_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_24: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 49053101903292L);
    life3_5 = com.moon.bY.b();
    spill851_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.aq)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue851_17_0 = spill851_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill851_0)).booleanValue())) {
        break forward_join_31;
    }
    forwardValue851_17_0 = ((com.moon.setting.ModeSetting)(this.as)).getValue();
    }
    if (!((life3_5 == null))) {
        forwardValue851_24_0 = forwardValue851_17_0;
        break forward_join_24;
    }
    if (!((forwardValue851_17_0 == com.moon.b1.GRADIENT))) {
        break forward_join_31;
    }
    forwardValue851_24_0 = ((com.moon.setting.BooleanSetting)(this.W)).getValue();
    }
    spill851_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue851_24_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue851_30_0 = ((spill851_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill851_1)) {
        break forward_join_31;
    }
    forwardValue851_30_0 = 1;
    }
    forwardValue851_32_0 = forwardValue851_30_0;
    break forward_join_32;
    }
    forwardValue851_32_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue851_32_0))));
}


private java.lang.Boolean lambda$new$15() {
int forwardValue848_19_0;
    int forwardValue848_23_0;
    int forwardValue848_25_0;
    boolean spill848_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 107095796677181L);
    life3_5 = com.moon.bY.b();
    spill848_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.aq)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue848_19_0 = ((spill848_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill848_0)) {
        break forward_join_24;
    }
    forwardValue848_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.W)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue848_23_0 = forwardValue848_19_0;
        break forward_join_23;
    }
    if (!((forwardValue848_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue848_23_0 = 1;
    }
    forwardValue848_25_0 = forwardValue848_23_0;
    break forward_join_25;
    }
    forwardValue848_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue848_25_0))));
}


private java.lang.Boolean lambda$new$14() {
int forwardValue847_19_0;
    int forwardValue847_23_0;
    int forwardValue847_25_0;
    boolean spill847_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 49310769094236L);
    life3_5 = com.moon.bY.b();
    spill847_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.am)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue847_19_0 = ((spill847_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill847_0)) {
        break forward_join_24;
    }
    forwardValue847_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.W)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue847_23_0 = forwardValue847_19_0;
        break forward_join_23;
    }
    if (!((forwardValue847_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue847_23_0 = 1;
    }
    forwardValue847_25_0 = forwardValue847_23_0;
    break forward_join_25;
    }
    forwardValue847_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue847_25_0))));
}


private java.lang.Boolean lambda$new$9() {
java.lang.Object forwardValue858_16_0;
    int forwardValue858_22_0;
    int forwardValue858_24_0;
    java.lang.Object spill858_0;
    boolean spill858_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 10299554217245L);
    life3_5 = com.moon.bY.b();
    spill858_0 = ((com.moon.setting.ModeSetting)(this.ac)).getValue();
    if (!((life3_5 == null))) {
        forwardValue858_16_0 = spill858_0;
        break forward_join_16;
    }
    if (!((spill858_0 == com.moon.bY.GRADIENT))) {
        break forward_join_23;
    }
    forwardValue858_16_0 = ((com.moon.setting.BooleanSetting)(this.W)).getValue();
    }
    spill858_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue858_16_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue858_22_0 = ((spill858_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill858_1)) {
        break forward_join_23;
    }
    forwardValue858_22_0 = 1;
    }
    forwardValue858_24_0 = forwardValue858_22_0;
    break forward_join_24;
    }
    forwardValue858_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue858_24_0))));
}


private java.lang.Boolean lambda$new$19() {
java.lang.Object forwardValue852_17_0;
    com.moon.b1 forwardValue852_17_1;
    int forwardValue852_21_0;
    java.lang.Object spill852_0;
    com.moon.b1 spill852_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 100458921278434L);
    life3_5 = com.moon.bY.b();
    spill852_0 = ((com.moon.setting.ModeSetting)(this.as)).getValue();
    spill852_1 = com.moon.b1.GRADIENT;
    if (!((life3_5 == null))) {
        forwardValue852_17_0 = spill852_0;
        forwardValue852_17_1 = spill852_1;
        break forward_join_17;
    }
    if (!((spill852_0 != spill852_1))) {
        break forward_join_18;
    }
    forwardValue852_17_0 = ((com.moon.setting.ModeSetting)(this.as)).getValue();
    forwardValue852_17_1 = com.moon.b1.PULSING;
    }
    if (!((forwardValue852_17_0 == forwardValue852_17_1))) {
        break forward_join_20;
    }
    }
    forwardValue852_21_0 = 1;
    break forward_join_21;
    }
    forwardValue852_21_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue852_21_0))));
}


private void lambda$new$20(java.lang.Float p0, java.lang.Float p1) {
this.s = ((boolean)(true));
    return;
}


private java.lang.Boolean lambda$new$10() {
java.lang.Object forwardValue843_17_0;
    com.moon.bY forwardValue843_17_1;
    int forwardValue843_21_0;
    java.lang.Object spill843_0;
    com.moon.bY spill843_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 71674208156391L);
    life3_5 = com.moon.bY.b();
    spill843_0 = ((com.moon.setting.ModeSetting)(this.ac)).getValue();
    spill843_1 = com.moon.bY.PULSING;
    if (!((life3_5 == null))) {
        forwardValue843_17_0 = spill843_0;
        forwardValue843_17_1 = spill843_1;
        break forward_join_17;
    }
    if (!((spill843_0 != spill843_1))) {
        break forward_join_18;
    }
    forwardValue843_17_0 = ((com.moon.setting.ModeSetting)(this.ac)).getValue();
    forwardValue843_17_1 = com.moon.bY.GRADIENT;
    }
    if (!((forwardValue843_17_0 == forwardValue843_17_1))) {
        break forward_join_20;
    }
    }
    forwardValue843_21_0 = 1;
    break forward_join_21;
    }
    forwardValue843_21_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue843_21_0))));
}


private java.lang.Boolean lambda$new$13() {
int forwardValue846_19_0;
    int forwardValue846_23_0;
    int forwardValue846_25_0;
    boolean spill846_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 39713328762025L);
    life3_5 = com.moon.bY.b();
    spill846_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.ai)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue846_19_0 = ((spill846_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill846_0)) {
        break forward_join_24;
    }
    forwardValue846_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.W)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue846_23_0 = forwardValue846_19_0;
        break forward_join_23;
    }
    if (!((forwardValue846_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue846_23_0 = 1;
    }
    forwardValue846_25_0 = forwardValue846_23_0;
    break forward_join_25;
    }
    forwardValue846_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue846_25_0))));
}


private java.lang.Boolean lambda$new$16() {
int forwardValue849_19_0;
    int forwardValue849_23_0;
    int forwardValue849_25_0;
    boolean spill849_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 49823794932736L);
    life3_5 = com.moon.bY.b();
    spill849_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.aq)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue849_19_0 = ((spill849_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill849_0)) {
        break forward_join_24;
    }
    forwardValue849_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.W)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue849_23_0 = forwardValue849_19_0;
        break forward_join_23;
    }
    if (!((forwardValue849_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue849_23_0 = 1;
    }
    forwardValue849_25_0 = forwardValue849_23_0;
    break forward_join_25;
    }
    forwardValue849_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue849_25_0))));
}


private java.lang.Boolean lambda$new$12() {
int forwardValue845_19_0;
    int forwardValue845_23_0;
    int forwardValue845_25_0;
    boolean spill845_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 8392395764347L);
    life3_5 = com.moon.bY.b();
    spill845_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.ai)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue845_19_0 = ((spill845_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill845_0)) {
        break forward_join_24;
    }
    forwardValue845_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.W)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue845_23_0 = forwardValue845_19_0;
        break forward_join_23;
    }
    if (!((forwardValue845_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue845_23_0 = 1;
    }
    forwardValue845_25_0 = forwardValue845_23_0;
    break forward_join_25;
    }
    forwardValue845_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue845_25_0))));
}


private java.lang.Boolean lambda$new$17() {
java.lang.Object forwardValue850_17_0;
    java.lang.Object forwardValue850_24_0;
    int forwardValue850_30_0;
    int forwardValue850_32_0;
    java.lang.Boolean spill850_0;
    boolean spill850_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_24: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 88930751002192L);
    life3_5 = com.moon.bY.b();
    spill850_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.aq)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue850_17_0 = spill850_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill850_0)).booleanValue())) {
        break forward_join_31;
    }
    forwardValue850_17_0 = ((com.moon.setting.ModeSetting)(this.as)).getValue();
    }
    if (!((life3_5 == null))) {
        forwardValue850_24_0 = forwardValue850_17_0;
        break forward_join_24;
    }
    if (!((forwardValue850_17_0 != com.moon.b1.SYNC))) {
        break forward_join_31;
    }
    forwardValue850_24_0 = ((com.moon.setting.BooleanSetting)(this.W)).getValue();
    }
    spill850_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue850_24_0)))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue850_30_0 = ((spill850_1) ? 1 : 0);
        break forward_join_30;
    }
    if (!(spill850_1)) {
        break forward_join_31;
    }
    forwardValue850_30_0 = 1;
    }
    forwardValue850_32_0 = forwardValue850_30_0;
    break forward_join_32;
    }
    forwardValue850_32_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue850_32_0))));
}


private java.lang.Boolean lambda$new$3() {
java.lang.Object forwardValue854_17_0;
    int forwardValue854_22_0;
    java.lang.Boolean spill854_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 54326164852399L);
    life3_5 = com.moon.bY.b();
    spill854_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue854_17_0 = spill854_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill854_0)).booleanValue())) {
        break forward_join_21;
    }
    forwardValue854_17_0 = ((com.moon.setting.ModeSetting)(this.u)).getValue();
    }
    if (!((forwardValue854_17_0 == com.moon.b3.INFORMATIVE))) {
        break forward_join_21;
    }
    forwardValue854_22_0 = 1;
    break forward_join_22;
    }
    forwardValue854_22_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue854_22_0))));
}


private java.lang.Boolean lambda$new$2() {
java.lang.Object forwardValue853_17_0;
    int forwardValue853_22_0;
    java.lang.Boolean spill853_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 43321726600785L);
    life3_5 = com.moon.bY.b();
    spill853_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue853_17_0 = spill853_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill853_0)).booleanValue())) {
        break forward_join_21;
    }
    forwardValue853_17_0 = ((com.moon.setting.ModeSetting)(this.u)).getValue();
    }
    if (!((forwardValue853_17_0 == com.moon.b3.INFORMATIVE))) {
        break forward_join_21;
    }
    forwardValue853_22_0 = 1;
    break forward_join_22;
    }
    forwardValue853_22_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue853_22_0))));
}


private java.lang.Boolean lambda$new$4() {
java.lang.Object forwardValue855_17_0;
    int forwardValue855_22_0;
    java.lang.Boolean spill855_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 78880250492734L);
    life3_5 = com.moon.bY.b();
    spill855_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue855_17_0 = spill855_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill855_0)).booleanValue())) {
        break forward_join_21;
    }
    forwardValue855_17_0 = ((com.moon.setting.ModeSetting)(this.z)).getValue();
    }
    if (!((forwardValue855_17_0 != com.moon.b0.SYNC))) {
        break forward_join_21;
    }
    forwardValue855_22_0 = 1;
    break forward_join_22;
    }
    forwardValue855_22_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue855_22_0))));
}


private static void lambda$new$8(java.util.Map p0, java.util.Map p1) {
net.minecraft.entity.Entity[] spill90_0;
    long life2_3;
    java.util.Iterator life5_8;
    net.minecraft.entity.Entity[] life4_9;
    com.moon.module.ModuleCategory life6_16;
    int life7_22;
    int life8_28;
    lexical_join_46: {
    life2_3 = (com.moon.module.impl.HUD.cb ^ 8598701703261L);
    spill90_0 = com.moon.bY.b();
    life5_8 = ((java.util.Set)(((java.util.Map)(p0)).keySet())).iterator();
    life4_9 = spill90_0;
    lexical_cycle_10: while (true) {
    lexical_join_44: {
    lexical_join_42: {
    if (!(((java.util.Iterator)(life5_8)).hasNext())) {
        break lexical_join_46;
    }
    life6_16 = ((com.moon.module.ModuleCategory)(((java.util.Iterator)(life5_8)).next()));
    life7_22 = ((((java.lang.Boolean)(((java.lang.Boolean)(((java.util.Map)(p0)).get(((java.lang.Object)(life6_16))))))).booleanValue()) ? 1 : 0);
    life8_28 = ((((java.lang.Boolean)(((java.lang.Boolean)(((java.util.Map)(p1)).get(((java.lang.Object)(life6_16))))))).booleanValue()) ? 1 : 0);
    if (!((life4_9 == null))) {
        break lexical_join_42;
    }
    if (!((life8_28 != life7_22))) {
        break lexical_join_44;
    }
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(new com.moon.event.CategoryEvent(life6_16, ((life8_28) != 0)))));
    }
    if (!((life4_9 != null))) {
        break lexical_join_46;
    }
    }
    if (!((life4_9 != null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private java.lang.Boolean lambda$new$6() {
long local1 = (com.moon.module.impl.HUD.cb ^ 136414300059861L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.L)).getValue() != com.moon.b0.SYNC) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$5() {
java.lang.Object forwardValue856_17_0;
    int forwardValue856_22_0;
    java.lang.Boolean spill856_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.HUD.cb ^ 29579682852720L);
    life3_5 = com.moon.bY.b();
    spill856_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue()));
    if (!((life3_5 == null))) {
        forwardValue856_17_0 = spill856_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill856_0)).booleanValue())) {
        break forward_join_21;
    }
    forwardValue856_17_0 = ((com.moon.setting.ModeSetting)(this.z)).getValue();
    }
    if (!((forwardValue856_17_0 == com.moon.b0.GRADIENT))) {
        break forward_join_21;
    }
    forwardValue856_22_0 = 1;
    break forward_join_22;
    }
    forwardValue856_22_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue856_22_0))));
}


private java.lang.Boolean lambda$new$7() {
long local1 = (com.moon.module.impl.HUD.cb ^ 62045266164433L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.L)).getValue() == com.moon.b0.GRADIENT) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_27(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_39(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_49(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_59(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_70(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_89(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_95(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_100(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_105(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_110(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_152(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_159(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_162(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_167(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_170(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_178(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_183(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_186(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_194(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_200(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_217(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_220(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_225(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_228(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_233(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_236(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_241(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_244(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_249(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_253(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_259(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_262(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_264(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_269(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_272(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_274(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_280(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_282(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_306(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_313(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_316(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_321(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_324(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_329(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_332(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_337(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_340(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_348(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_353(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_356(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_358(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_360(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_368(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_374(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_398(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_409(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_412(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_417(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_421(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_424() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_429(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_432(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_440(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_445(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_448(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_456(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_461(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_465(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_474(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_479(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_483(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_492(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_497(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_501(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_510(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_515(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_518(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_520(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_528(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_533(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_536(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_538(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_540(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_545(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_548(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_554(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_559(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_562(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_574(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_580(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_582(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_606(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_611(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_616(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_625(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_630(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_633(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_641(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_646(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_649(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_651(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_653(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_655(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_660(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_663(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_665(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_670(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_673(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_675(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_677(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_682(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_685(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_693(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_698(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_701(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_703(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_705(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_710(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_713(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_715(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_723(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_729(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_731(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_759(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_764(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_767(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_775(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_780(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_784(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_787(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_792(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_796(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_799(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_804(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_807(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_809(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_814(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_817(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_819(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_824(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_827(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_833(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_839(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_841(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_869(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_874(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_877(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_879(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_887(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_892(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_895(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_906(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_912(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_914(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_938(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_943(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_950(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_954(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_960(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_963(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_79caec772487bd0a_originalDynamicSite26_968(com.moon.module.impl.HUD a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3a8b43439e1a_invokedynamic234_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd0609abcd78_invokedynamic193_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd0609abcd78_invokedynamic193_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2492_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2493_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
