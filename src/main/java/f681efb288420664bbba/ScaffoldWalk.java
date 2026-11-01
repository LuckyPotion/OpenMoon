package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ScaffoldWalk extends com.moon.module.Module {

private com.moon.setting.ModeSetting<com.moon.bE> s;

private com.moon.setting.FloatSetting t;

private com.moon.setting.FloatSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.SettingGroup x;

private com.moon.setting.BooleanSetting y;

private com.moon.setting.ModeSetting<com.moon.bJ> z;

private com.moon.setting.BooleanSetting A;

private com.moon.setting.ModeSetting<com.moon.bI> B;

private com.moon.setting.BooleanSetting C;

private com.moon.setting.BooleanSetting D;

private com.moon.setting.BooleanSetting E;

private com.moon.setting.BooleanSetting F;

private com.moon.setting.IntegerSetting G;

private com.moon.setting.ModeSetting<com.moon.bG> H;

private com.moon.setting.BooleanSetting I;

private com.moon.setting.BooleanSetting J;

private com.moon.setting.FloatSetting K;

public com.moon.setting.MultiSelectSetting<com.moon.bH> L;

private com.moon.setting.IntegerSetting M;

private com.moon.setting.IntegerSetting N;

private com.moon.setting.IntegerSetting O;

private com.moon.setting.FloatSetting P;

private com.moon.setting.BooleanSetting Q;

private com.moon.setting.BooleanSetting R;

private com.moon.setting.IntegerSetting S;

private com.moon.setting.IntegerSetting T;

private com.moon.setting.SettingGroup U;

private com.moon.setting.SettingGroup V;

private com.moon.setting.SettingGroup W;

private com.moon.setting.BooleanSetting X;

private com.moon.setting.BooleanSetting Y;

private com.moon.setting.BooleanSetting Z;

private com.moon.setting.BooleanSetting aa;

private com.moon.setting.BooleanSetting ab;

private com.moon.setting.BooleanSetting ac;

private com.moon.setting.IntegerSetting ad;

private com.moon.setting.ModeSetting<com.moon.bF> ae;

private com.moon.setting.SettingGroup af;

private com.moon.gA ag;

private com.moon.gC ah;

private com.moon.gy ai;

private boolean aj;

private int ak;

private double al;

private boolean am;

private int an;

private com.moon.gE ao;

private static long cb;

private static java.lang.String[] kb;

private static java.lang.String[] lb;

private static java.util.Map mb;

private static long[] ob;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public ScaffoldWalk(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_3875ccab62719e41(com.moon.module.impl.ScaffoldWalk receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.ScaffoldWalk.cb ^ 1902091319335L);

    com.moon.module.impl.ScaffoldWalk.__sourceConstructorInit_3875ccab62719e41_0(((com.moon.module.impl.ScaffoldWalk)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    java.lang.String __sourceSpill29_15 = com.moon.bF.b();

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).s = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_6(16847, (6301935334268553267L ^ local5_life2)))), ((java.lang.Class)(com.moon.bE.class))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_10(2353, (8965766237991239874L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bE.SIMPLE))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_17(21662, (8883957964403891527L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_20(11316, (3376442097915504051L ^ local5_life2)))), ((float)(1048576000)), ((float)(1028443341)), ((float)(1050253722)), ((float)(1020054733))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_26(receiver)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).u = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_31(12808, (5519053821487430645L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_34(6520, (4067175128844832924L ^ local5_life2)))), ((float)(1080033280)), ((float)(0x1.0p0f)), ((float)(1086324736)), ((float)(1056964608))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_42(32286, (8036329855750141909L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_45(6572, (3759312667114410063L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_56 = receiver;

    com.moon.l_ __sourceSpill29_57 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_50(18412, (2391762412454628868L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_53(329, (4465774526903126165L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp29_58_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).v;

    com.moon.setting.BooleanSetting __sourceSpill29_60 = __stackOp29_58_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_58_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_56)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill29_57)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_61(__sourceSpill29_60)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_68 = receiver;

    com.moon.me __sourceSpill29_69 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill29_70 = __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_67(1663, (6220606837121027973L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp29_71_0 = new com.moon.setting.Setting[5];

    com.moon.setting.Setting[] __sourceSpill29_73 = __stackOp29_71_0;

    (__stackOp29_71_0)[0] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).s;

    com.moon.setting.Setting[] __stackOp29_74_0 = __sourceSpill29_73;

    com.moon.setting.Setting[] __sourceSpill29_76 = __stackOp29_74_0;

    (__stackOp29_74_0)[1] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).t;

    com.moon.setting.Setting[] __stackOp29_77_0 = __sourceSpill29_76;

    com.moon.setting.Setting[] __sourceSpill29_79 = __stackOp29_77_0;

    (__stackOp29_77_0)[2] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).u;

    com.moon.setting.Setting[] __stackOp29_80_0 = __sourceSpill29_79;

    com.moon.setting.Setting[] __sourceSpill29_82 = __stackOp29_80_0;

    (__stackOp29_80_0)[3] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).v;

    com.moon.setting.Setting[] __stackOp29_83_0 = __sourceSpill29_82;

    com.moon.setting.Setting[] __sourceSpill29_85 = __stackOp29_83_0;

    (__stackOp29_83_0)[4] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).w;

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_68)).x = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill29_69)).a(((java.lang.String)(__sourceSpill29_70)), ((com.moon.setting.Setting[])(__sourceSpill29_85))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_90(18702, (7966708132479877370L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_93(24932, (3316695039857780973L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_106 = receiver;

    com.moon.mc __sourceSpill29_107 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_98(22309, (3645769140107730651L ^ local5_life2)))), ((java.lang.Class)(com.moon.bJ.class))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_102(26531, (1712329118231064137L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bJ.HYPIXEL)));

    com.moon.setting.BooleanSetting __stackOp29_108_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).y;

    com.moon.setting.BooleanSetting __sourceSpill29_110 = __stackOp29_108_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_108_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_106)).z = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill29_107)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_111(__sourceSpill29_110)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).A = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_116(28837, (8171565455243639107L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_119(4728, (4991193586435890073L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_132 = receiver;

    com.moon.mc __sourceSpill29_133 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_124(20594, (8217761010161637770L ^ local5_life2)))), ((java.lang.Class)(com.moon.bI.class))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_128(11290, (3763744943123867127L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bI.NORMAL)));

    com.moon.setting.BooleanSetting __stackOp29_134_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).A;

    com.moon.setting.BooleanSetting __sourceSpill29_136 = __stackOp29_134_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_134_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_132)).B = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill29_133)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_137(__sourceSpill29_136)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_142(9590, (4034301718521654400L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_145(1363, (1183403337496792241L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_147(receiver)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_158 = receiver;

    com.moon.l_ __sourceSpill29_159 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_152(5164, (5974841289783811561L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_155(8983, (330329118609844887L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp29_160_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).A;

    com.moon.setting.BooleanSetting __sourceSpill29_162 = __stackOp29_160_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_160_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_158)).D = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill29_159)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_163(__sourceSpill29_162)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).E = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_168(2362, (4186412453812961505L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_171(15140, (2911189359560405704L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).F = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_176(4118, (559029061154445796L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_179(25205, (24579738067037182L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_190 = receiver;

    com.moon.mf __sourceSpill29_191 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_184(32712, (3161546696299574785L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_187(1152, (8387682802996284684L ^ local5_life2)))), ((int)(2)), ((int)(1)), ((int)(5)), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp29_192_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).F;

    com.moon.setting.BooleanSetting __sourceSpill29_194 = __stackOp29_192_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_192_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_190)).G = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill29_191)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_195(__sourceSpill29_194)))))).a()));

    java.lang.String local7_life199 = __sourceSpill29_15;

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).H = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_201(15264, (2118637654232314483L ^ local5_life2)))), ((java.lang.Class)(com.moon.bG.class))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_205(13982, (7501085840541040507L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bG.NORMAL))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).I = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_211(6566, (5296513288158187643L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_214(28561, (7840715566815864422L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).J = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_219(27349, (7932308126542586707L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_222(20114, (1181636027569489695L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_237 = receiver;

    com.moon.md __sourceSpill29_238 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_227(24585, (1708629221071055310L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_230(31565, (3441547593565827783L ^ local5_life2)))), ((float)(1045220557)), ((float)(1008981770)), ((float)(1056964608)), ((float)(981668463)));

    com.moon.setting.BooleanSetting __stackOp29_239_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).J;

    com.moon.setting.BooleanSetting __sourceSpill29_241 = __stackOp29_239_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_239_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_237)).K = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(__sourceSpill29_238)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_242(__sourceSpill29_241)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_252 = receiver;

    com.moon.mi __sourceSpill29_253 = com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_247(26226, (1376055659414384557L ^ local5_life2)))), ((java.lang.Class)(com.moon.bH.class)));

    java.lang.String __sourceSpill29_254 = __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_251(8472, (6475039435564034291L ^ local5_life2));

    com.moon.bH[] __stackOp29_255_0 = new com.moon.bH[1];

    com.moon.bH[] __sourceSpill29_257 = __stackOp29_255_0;

    (__stackOp29_255_0)[0] = com.moon.bH.EDGE;

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_252)).L = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(__sourceSpill29_253)).a(((java.lang.String)(__sourceSpill29_254)), ((java.lang.Enum[])(__sourceSpill29_257))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).M = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_262(22955, (5860350359204188271L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_265(7544, (2578029469229618428L ^ local5_life2)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_267(23516, (2786305063807215L ^ local5_life2)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_269(receiver)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).N = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_274(793, (4293315548856584922L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_277(10521, (2848140439672201439L ^ local5_life2)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_279(10848, (1959007534987319638L ^ local5_life2)))), ((int)(1))))).a(((com.moon.kR)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_281(receiver)))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_283(receiver)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).O = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_288(3863, (3212677082804160223L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_291(27354, (5656567102644216609L ^ local5_life2)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_293(3535, (1108365621236645631L ^ local5_life2)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_295(receiver)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).P = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_300(13415, (3707733057194704294L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_303(11517, (6894615650829608306L ^ local5_life2)))), ((float)(1069547520)), ((float)(1033476506)), ((float)(1092616192)), ((float)(1033476506))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_309(receiver)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).Q = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_314(6050, (3515549218666487418L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_317(25629, (7497941377855712712L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).R = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_322(30331, (5496989904061824933L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_325(6926, (4564029772886971111L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).S = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_330(17377, (6646343609596267028L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_333(28589, (3928377585766721135L ^ local5_life2)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_335(9008, (1953761987822522373L ^ local5_life2)))), ((int)(1))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_338(12617, (3133090836580022427L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).T = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_343(19051, (8293639308964316081L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_346(14690, (3704605312007876755L ^ local5_life2)))), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_348(10848, (1959007534987319638L ^ local5_life2)))), ((int)(1)), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_350(4024, (383927508203289743L ^ local5_life2)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_352(receiver)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_359 = receiver;

    com.moon.me __sourceSpill29_360 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill29_361 = __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_358(9001, (3708753488739773095L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp29_362_0 = new com.moon.setting.Setting[4];

    com.moon.setting.Setting[] __sourceSpill29_364 = __stackOp29_362_0;

    (__stackOp29_362_0)[0] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).Q;

    com.moon.setting.Setting[] __stackOp29_365_0 = __sourceSpill29_364;

    com.moon.setting.Setting[] __sourceSpill29_367 = __stackOp29_365_0;

    (__stackOp29_365_0)[1] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).R;

    com.moon.setting.Setting[] __stackOp29_368_0 = __sourceSpill29_367;

    com.moon.setting.Setting[] __sourceSpill29_370 = __stackOp29_368_0;

    (__stackOp29_368_0)[2] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).S;

    com.moon.setting.Setting[] __stackOp29_371_0 = __sourceSpill29_370;

    com.moon.setting.Setting[] __sourceSpill29_373 = __stackOp29_371_0;

    (__stackOp29_371_0)[3] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).T;

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_359)).U = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill29_360)).a(((java.lang.String)(__sourceSpill29_361)), ((com.moon.setting.Setting[])(__sourceSpill29_373))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_382 = receiver;

    com.moon.me __sourceSpill29_383 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill29_384 = __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_379(11201, (2077162108148130351L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp29_385_0 = new com.moon.setting.Setting[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_381(10880, (3134364160879827389L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill29_387 = __stackOp29_385_0;

    (__stackOp29_385_0)[0] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).y;

    com.moon.setting.Setting[] __stackOp29_388_0 = __sourceSpill29_387;

    com.moon.setting.Setting[] __sourceSpill29_390 = __stackOp29_388_0;

    (__stackOp29_388_0)[1] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).E;

    com.moon.setting.Setting[] __stackOp29_391_0 = __sourceSpill29_390;

    com.moon.setting.Setting[] __sourceSpill29_393 = __stackOp29_391_0;

    (__stackOp29_391_0)[2] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).A;

    com.moon.setting.Setting[] __stackOp29_394_0 = __sourceSpill29_393;

    com.moon.setting.Setting[] __sourceSpill29_396 = __stackOp29_394_0;

    (__stackOp29_394_0)[3] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).C;

    com.moon.setting.Setting[] __stackOp29_397_0 = __sourceSpill29_396;

    com.moon.setting.Setting[] __sourceSpill29_399 = __stackOp29_397_0;

    (__stackOp29_397_0)[4] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).D;

    com.moon.setting.Setting[] __stackOp29_400_0 = __sourceSpill29_399;

    com.moon.setting.Setting[] __sourceSpill29_402 = __stackOp29_400_0;

    (__stackOp29_400_0)[5] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).F;

    com.moon.setting.Setting[] __stackOp29_403_0 = __sourceSpill29_402;

    com.moon.setting.Setting[] __sourceSpill29_407 = __stackOp29_403_0;

    (__stackOp29_403_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_405(12536, (981064062293083082L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).I;

    com.moon.setting.Setting[] __stackOp29_408_0 = __sourceSpill29_407;

    com.moon.setting.Setting[] __sourceSpill29_412 = __stackOp29_408_0;

    (__stackOp29_408_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_410(23265, (8343407171348294106L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).J;

    com.moon.setting.Setting[] __stackOp29_413_0 = __sourceSpill29_412;

    com.moon.setting.Setting[] __sourceSpill29_417 = __stackOp29_413_0;

    (__stackOp29_413_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_415(5229, (5431414637795551061L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).K;

    com.moon.setting.Setting[] __stackOp29_418_0 = __sourceSpill29_417;

    com.moon.setting.Setting[] __sourceSpill29_422 = __stackOp29_418_0;

    (__stackOp29_418_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_420(20479, (8792163568742366400L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).G;

    com.moon.setting.Setting[] __stackOp29_423_0 = __sourceSpill29_422;

    com.moon.setting.Setting[] __sourceSpill29_427 = __stackOp29_423_0;

    (__stackOp29_423_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_425(10848, (1959007534987319638L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).z;

    com.moon.setting.Setting[] __stackOp29_428_0 = __sourceSpill29_427;

    com.moon.setting.Setting[] __sourceSpill29_432 = __stackOp29_428_0;

    (__stackOp29_428_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_430(7696, (7131679607062932780L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).B;

    com.moon.setting.Setting[] __stackOp29_433_0 = __sourceSpill29_432;

    com.moon.setting.Setting[] __sourceSpill29_437 = __stackOp29_433_0;

    (__stackOp29_433_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_435(809, (3641833691037937688L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).H;

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_382)).V = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill29_383)).a(((java.lang.String)(__sourceSpill29_384)), ((com.moon.setting.Setting[])(__sourceSpill29_437))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_444 = receiver;

    com.moon.me __sourceSpill29_445 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill29_446 = __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_443(19711, (4429555739994998135L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp29_447_0 = new com.moon.setting.Setting[5];

    com.moon.setting.Setting[] __sourceSpill29_449 = __stackOp29_447_0;

    (__stackOp29_447_0)[0] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).L;

    com.moon.setting.Setting[] __stackOp29_450_0 = __sourceSpill29_449;

    com.moon.setting.Setting[] __sourceSpill29_452 = __stackOp29_450_0;

    (__stackOp29_450_0)[1] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).M;

    com.moon.setting.Setting[] __stackOp29_453_0 = __sourceSpill29_452;

    com.moon.setting.Setting[] __sourceSpill29_455 = __stackOp29_453_0;

    (__stackOp29_453_0)[2] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).N;

    com.moon.setting.Setting[] __stackOp29_456_0 = __sourceSpill29_455;

    com.moon.setting.Setting[] __sourceSpill29_458 = __stackOp29_456_0;

    (__stackOp29_456_0)[3] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).O;

    com.moon.setting.Setting[] __stackOp29_459_0 = __sourceSpill29_458;

    com.moon.setting.Setting[] __sourceSpill29_461 = __stackOp29_459_0;

    (__stackOp29_459_0)[4] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).P;

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_444)).W = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill29_445)).a(((java.lang.String)(__sourceSpill29_446)), ((com.moon.setting.Setting[])(__sourceSpill29_461))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).X = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_466(21993, (8152145506651266089L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_469(21609, (7790218441326484903L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_483 = receiver;

    com.moon.l_ __sourceSpill29_484 = ((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_474(27537, (5111540532876763740L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_477(31484, (7796836434887275283L ^ local5_life2)))), ((boolean)(true))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_480(11926, (2194326898679588674L ^ local5_life2)))));

    com.moon.setting.BooleanSetting __stackOp29_485_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).X;

    com.moon.setting.BooleanSetting __sourceSpill29_487 = __stackOp29_485_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_485_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_483)).Y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill29_484)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_488(__sourceSpill29_487)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_499 = receiver;

    com.moon.l_ __sourceSpill29_500 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_493(17759, (7748075130241731731L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_496(12177, (6670638851064145502L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __stackOp29_501_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).X;

    com.moon.setting.BooleanSetting __sourceSpill29_503 = __stackOp29_501_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_501_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_499)).Z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill29_500)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_504(__sourceSpill29_503)))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).aa = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_509(64, (1581684234709698967L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_512(4345, (3591373103087720824L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_514(receiver)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_525 = receiver;

    com.moon.l_ __sourceSpill29_526 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_519(24031, (5735576866219578458L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_522(31467, (849945260237091595L ^ local5_life2)))), ((boolean)(false)));

    com.moon.setting.BooleanSetting __stackOp29_527_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).X;

    com.moon.setting.BooleanSetting __sourceSpill29_529 = __stackOp29_527_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_527_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_525)).ab = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill29_526)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_530(__sourceSpill29_529)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_544 = receiver;

    com.moon.l_ __sourceSpill29_545 = ((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_535(18086, (7982289294393921366L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_538(2908, (6779290814403084940L ^ local5_life2)))), ((boolean)(false))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_541(755, (6191191436040342282L ^ local5_life2)))));

    com.moon.setting.BooleanSetting __stackOp29_546_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).X;

    com.moon.setting.BooleanSetting __sourceSpill29_548 = __stackOp29_546_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_546_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_544)).ac = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill29_545)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_549(__sourceSpill29_548)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_564 = receiver;

    com.moon.mf __sourceSpill29_565 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_554(3661, (4537816725818869660L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_557(19167, (6724154999183721248L ^ local5_life2)))), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_559(23791, (187240824601014235L ^ local5_life2)))), ((int)(1)), ((int)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_561(6670, (2404272591680284962L ^ local5_life2)))), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp29_566_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).X;

    com.moon.setting.BooleanSetting __sourceSpill29_568 = __stackOp29_566_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_566_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_564)).ad = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill29_565)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_569(__sourceSpill29_568)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_582 = receiver;

    com.moon.mc __sourceSpill29_583 = ((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_574(10221, (1882930507374669351L ^ local5_life2)))), ((java.lang.Class)(com.moon.bF.class))))).a(((java.lang.String)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_578(23683, (1168322333947254101L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bF.BRUTEFORCE)));

    com.moon.setting.BooleanSetting __stackOp29_584_0 = ((com.moon.module.impl.ScaffoldWalk)(receiver)).X;

    com.moon.setting.BooleanSetting __sourceSpill29_586 = __stackOp29_584_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp29_584_0)));

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_582)).ae = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(__sourceSpill29_583)).a(((java.util.function.Supplier)(__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_587(__sourceSpill29_586)))))).a()));

    com.moon.module.impl.ScaffoldWalk __sourceSpill29_596 = receiver;

    com.moon.me __sourceSpill29_597 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill29_598 = __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_593(31607, (3820285527589941904L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp29_599_0 = new com.moon.setting.Setting[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_595(8964, (2203886875797819454L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill29_601 = __stackOp29_599_0;

    (__stackOp29_599_0)[0] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).X;

    com.moon.setting.Setting[] __stackOp29_602_0 = __sourceSpill29_601;

    com.moon.setting.Setting[] __sourceSpill29_604 = __stackOp29_602_0;

    (__stackOp29_602_0)[1] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).Y;

    com.moon.setting.Setting[] __stackOp29_605_0 = __sourceSpill29_604;

    com.moon.setting.Setting[] __sourceSpill29_607 = __stackOp29_605_0;

    (__stackOp29_605_0)[2] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).Z;

    com.moon.setting.Setting[] __stackOp29_608_0 = __sourceSpill29_607;

    com.moon.setting.Setting[] __sourceSpill29_610 = __stackOp29_608_0;

    (__stackOp29_608_0)[3] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).aa;

    com.moon.setting.Setting[] __stackOp29_611_0 = __sourceSpill29_610;

    com.moon.setting.Setting[] __sourceSpill29_613 = __stackOp29_611_0;

    (__stackOp29_611_0)[4] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).ab;

    com.moon.setting.Setting[] __stackOp29_614_0 = __sourceSpill29_613;

    com.moon.setting.Setting[] __sourceSpill29_616 = __stackOp29_614_0;

    (__stackOp29_614_0)[5] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).ac;

    com.moon.setting.Setting[] __stackOp29_617_0 = __sourceSpill29_616;

    com.moon.setting.Setting[] __sourceSpill29_621 = __stackOp29_617_0;

    (__stackOp29_617_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_619(6807, (6234136507963943342L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).ae;

    com.moon.setting.Setting[] __stackOp29_622_0 = __sourceSpill29_621;

    com.moon.setting.Setting[] __sourceSpill29_626 = __stackOp29_622_0;

    (__stackOp29_622_0)[__sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_624(29521, (2941405265613799535L ^ local5_life2))] = ((com.moon.module.impl.ScaffoldWalk)(receiver)).ad;

    ((com.moon.module.impl.ScaffoldWalk)(__sourceSpill29_596)).af = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill29_597)).a(((java.lang.String)(__sourceSpill29_598)), ((com.moon.setting.Setting[])(__sourceSpill29_626))))).a()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).ag = ((com.moon.gA)(new com.moon.gA(receiver)));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).ah = ((com.moon.gC)(new com.moon.gC()));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).ai = ((com.moon.gy)(new com.moon.gy(receiver)));

    ((com.moon.module.impl.ScaffoldWalk)(receiver)).ao = ((com.moon.gE)(new com.moon.gE()));

    if ((local7_life199 == null)) {

        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));

    }

    return;

}



static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-6482100000615456152L)), ((long)(-4546466017530145047L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183613086830320L)))));
    mb = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.ScaffoldWalk.cb ^ 24060544074175L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill285_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill285_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill285_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill285_14 = new byte[8];
    (__sourceSpill285_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill285_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation285_16 = __sourceSpill285_14;
    ((javax.crypto.Cipher)(__sourceSpill285_11)).init(((int)(__sourceSpill285_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill285_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation285_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[78];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\006\\wÜ\034ynEãÅô¬ß/)Ä\\á\006\031[Ä£<ö/ß@\030ÿléR\016L¿#dÇä¼ÂKZö\033áÍC\030¹Ú§¸Åp\026B\022+H\032ÅØúJ|\020û(EI\024c¬<MàÎÅ<³ e\007\006í\003ü°í2øå8ï1äÙ\025ºhÚ\007\r½A±§¡¢é(=mX\nùK§´ü\177~MØiÛÕ´y\013ø!^¶@ÂU,\021\030\0301×ßø\007 ¼¸È\\\bdàÆ,kCúÜ\021\n\013Q0$uBIËB =\004+û|\037\030ï\\!ÕÌ0´Þ~+¾ÍZEßfeU8ËÜ(:ð.-É\f¦æ´¶\033·õ\026Ç*m\r\025£\025ßj7ïþÖ>\031e\005\\Z¾(_iíGºqJ\016\177 U²@]\f÷UR\036}LºÄJ@Ç'¿ÔZ.Ë\000\t\017ñ\030ìLKcmrUî\000¸Þ*SYßÜç\005éü(\036/¨°\031FÐt²!}\017âgW\001>bùR?%ý¬ñ2§\037îI\177¹Y¨Ç·Ü/q0Ò\030Ò\0254ë»?¸Û¾MçÀÂæú>ÝG\031JhZÖá\013Æáq\rü²Låí\020\036TÖÞÿ§Æ^±òâkVÂ; ÿ\rApÇ\rÜ²\016ø5èÃÆÉÜ]\034÷wN8\024a#z(\027\030I=µ\016\004»\022_»>ç|U\026ñËóQ\020\bÙGÓëpHHîGþ®\026WüÚ(çE\037s\034ßcË¤\025/G©\013\025j%É0¦/=vC mpÐ¦\016¹ü(\003\002\030hø°YCY»©Nö´ÅéÜ\035]ÿ¡7àª±æK Måj%ùH;áâú¯Ô{¤¨9dÍ×\0254×f5`2{ú¤ a\0026¶>\t\023ò½¼¼Xò#Bäù¾C£¾5¢¦â.m\0302ðË\004\031½\034i}uÚ÷«àÔÎG¶è\032ã.(quIGñB0\t\034jþ.êP\0014íä{\026FY\0051â\r{@lhªCR*Y\020)\006À\bä`\bU\037Iñ+-\000(I\001)Þ\0307K\006+ê&'Õ\024»?cÁaÎ»b²Ô \0363@Ò£4ºt>£\rG f xÊÍ\030²ðÆ\020ë¤ùN~ªØz\035ýÚ\\çMèq4õX}]\006l_fC\177\016_DùE\0256\022åíF\005ìF\\`°=O;¹­ìÅ·¯ÔmVM\002\177Þ\005]Ñ\007Äj'Kì2òü\034\032óð-\f\0333õBKmvâ\t]}Âª(.RÓË­\035A\020n´þMÛN¸þó9$`t\005ûvB\bí7¬\004º'÷S Î³\030é?:8\016Ì±Àâ;\017Ï;Á\bÄsÆss©m\"\037w#!Ü\030dWÇòæ5Ê¾©ÞÞ*òBÿíì»ñ ËÂí.l\035±\030a¥tøÚ¸zào\000JiKEFªu\bÈ Ài}Aµå\007\016s\032\f¼OðêéÓ&¶ÂÍ\035\"\002\021ßX|\035Ò\024\034\016ÝÚð½msÌ\025\0265!F*_:îéP7\020¤æ¡ëÅ³Àr\fgÊ\"£\037wtpªD\004¨2OÑ\033\021B\033k9kÃ·Umé\001Î\020\022/´\0066fU¬8ÇB\030îo\001j¤¡ùbÛºÂkIáxüÅ \006Ï®xç/æWt¤SºÅ==1r1\002FåSã·6YO «yù¼\034ì¯\"w8|Ï-ê(:\021 }Û¸Û8¦2\0237-Ä(+;)Êw££\ny¶vcÄ£`³\\_Mâ-Tl©[5©ý\\Fcswÿ¿ $ \027£K,\004ö\005ó¤Þ)Ëß­Ü\024öÕ¸ç>ë£ òXØ½]üÈÉø×\035Õáás4G¯\177NruÔU\020§\002Lò Âºó\"Tí>ëÎ\r¾hïÍÍ \023¿¤\024=8rÉêë|xÔ\030_òóæ^eåw\f^?'¾ ¿IåmÂÓë\030YS!.g\\/Uÿb7üU¨35®ÂñönË\030z?/s,ñ¥ >\031\017\030Âz®k2Ï\032µ(_ü\034RN\0216+¿@~Éöß`\007\017h\n\0131Û%Ü\rb)·ùhQ\031Ò\003\030ÿeh\030\016E\t»ªÜuôUÑ½q·B­~ðÝë~»_®õ ÷/þ\034vºZ\037A¤ý%ªr¶A9#¶É;.éGÌ\027?ÉY\030Ú¬õWUmY\n\nÌRM\035|Añ¤42L l¢\037\026+8ÔÑÈ÷ÛÙÎe¡ WÕ×yå\035\t·ý Ï§øÿc)ò:\035¬\fbòQÿ\006D\030<(Õ)~\022]U¤@\023vu àÓzvÝðª_äÂ|[¹ÀÒnòDÅvH&{fÃ \001\036ASaÅmÕâ2bUÎÅH1Ó\033\033y·P>`¸G\0308!r©f%1à!®z%Cã,þÓ\032Óæ\030\021È8\000\006\033»NrMø½Ï\022ÿsÆ,/\033HÜ\f®Y \034ð\001Ïx$\006\013®\031´\n+@\fæ²-ËÖ$`Ü!æ§«æÝ¡ZÊë^\f\177ép´\025qýKí,\035ê×Vd\\3±°äàJ )yY\"½Ä\bvNe>\004\022´å¸Õ\031Ï,s&­ÍÂï\"(ãY±=\000à`á=Dæäî¿ÊcM\006½¬Ü}¿9ù\033â2ÛO\bò¿\026Dß(ßö¾P0+â\tõV¬\rGwS©ý\035¶Ñro¼ V:¯Å}\r§\027Ü¨\030ÿ(8-yÛºT\006CÇî%z)\177T×9<ïçÖÍ²\000ô=êÕÃº¹Cð\033AÙ\020\fJ\025ÕV\032µûù¦¾(#o=\017MSÞ1Âàºg\024´¸Ä ËGB`Æp?Þ_>l\037)0.\026ê\177D(!¿rq\0218\017°\n\023BµÑ'ÿ\tÀf}ÞÁêïÌ4Y§?zH³>£\035_¼ñ(Í£a+õÁë3Á­lÛfdé`®E?'4,w6-³tNýð5ãH%s£\033 B^DìX7º\n.wc}ÅDØ*Pòi8*ä# ³29Ï~ \032V\032þÑePÿ[{oñÉ·C\026D\027@)É ¨ÚÔe\023tWC¡3ªôÉOê\"}1 ;\t¸^ì7«Ça­çu Èhà!\025%ð¶\031ô«|º5Û+|+\022Vµ7 ÆW;F(§\006\002Éûµ\025ü/Q¿î×Âx6SSb!ÂÒÚÂ\006CÜËáKQ;H°8ÃæZ©§Ó\035F\\½¾©äo=\nÛÛª:4Ã\nT\025Âûô£0\034ÓÜR$&vÊ«M\024úè\032©×h4±prÒ(\020Ç\177A)ÉÀ2¨§µ5·'\r\024|Tqµÿ¬RñèÕzçºÓ\034ó8l\0202¥×ÁÓ\033óóÌO4\007\000 ámkÃ\026\020\026!lqEû\003HèH1×¬\037¹ÍhyvcÉa ×[@¾1.\004Âõfµ\"#¼ÊqEïøÛ¸\\\017ð\f \022ö¢GFbSm\036ËfæYqÇÈsKèd¶;JítZ\177Ð ]ìí>·s\032A]8¬\022WDî#E¹)·ËÀÁ!:\t(¹P\037®m§È6uÉÊ¼NE41\016\002ôß³\016tl­Ú(é=;ßNeìuGê© p*¬±½õ\034Íþ#¹\027èÁ\027Xø(¾\030\031³\002\"cÏ(®æû%\b;x<7îÅ_îþSÎ'tIhÆÙ\004hçh\006\003Ín­}\tG,"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill285_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill285_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill285_29)).doFinal(((byte[])(__sourceSpill285_28)));
        java.lang.String __sourceSpill285_34 = ((java.lang.String)(com.moon.module.impl.ScaffoldWalk.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill285_35 = local20_life19;
        int __sourceSpill285_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill285_35)[__sourceSpill285_36] = __sourceSpill285_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "Aëèõ\b¦Ê0Oe(Hi¿ÐåY\032dÆJ\"<¯ßwãí\025¨óRà.(\tG(X[ÙÂ\bUyÐ©÷!\000YìoÊ²¾ÞÁ®8Æ'Ã\0236êz`öû·Ç"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill285_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill285_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill285_42)).doFinal(((byte[])(__sourceSpill285_41)));
        java.lang.String __sourceSpill285_47 = ((java.lang.String)(com.moon.module.impl.ScaffoldWalk.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill285_48 = local20_life19;
        int __sourceSpill285_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill285_48)[__sourceSpill285_49] = __sourceSpill285_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    kb = ((java.lang.String[])(local20_life19));
    lb = ((java.lang.String[])(new java.lang.String[78]));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill285_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill285_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill285_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill285_60 = new byte[8];
    (__sourceSpill285_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill285_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation285_62 = __sourceSpill285_60;
    ((javax.crypto.Cipher)(__sourceSpill285_57)).init(((int)(__sourceSpill285_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill285_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation285_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[17];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = ":µ(ÿÚv®ÿ6¦^\034åH\020@{ª pÏÚyóCå×\024)ÉkMÐk0óí\033Fx9,ÒÝôñÑñÏï§HÕ\\7ÌeMàö(\fc\0164ÍÅFv\003µVáFÂm\016oÅ±á¦\004Ê2oDê<hO¾ÎH\0168/´Xõ"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill285_71 = local4_life67;
        int __sourceSpill285_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill285_71)).substring(((int)(__sourceSpill285_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill285_76 = local6_life65;
        int __sourceSpill285_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill285_79 = new byte[8];
        (__sourceSpill285_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill285_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill285_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill285_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill285_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill285_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill285_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill285_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill285_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill285_80)).doFinal(((byte[])(__sourceSpill285_79)));
        (__sourceSpill285_76)[__sourceSpill285_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "\tOV\b.\0252{÷d&!æÃ"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill285_84 = local4_life67;
        int __sourceSpill285_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill285_84)).substring(((int)(__sourceSpill285_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill285_89 = local6_life65;
        int __sourceSpill285_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill285_92 = new byte[8];
        (__sourceSpill285_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill285_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill285_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill285_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill285_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill285_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill285_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill285_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill285_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill285_93)).doFinal(((byte[])(__sourceSpill285_92)));
        (__sourceSpill285_89)[__sourceSpill285_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    ob = ((long[])(local6_life65));
    pb = ((java.lang.Integer[])(new java.lang.Integer[17]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3875ccab62719e41_0(com.moon.module.impl.ScaffoldWalk a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public com.moon.setting.BooleanSetting i() {
return this.I;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.w;
}


public com.moon.setting.ModeSetting<com.moon.bJ> b__kY() {
return this.z;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.u;
}


public com.moon.setting.SettingGroup b__k0() {
return this.U;
}


private int b() {
return com.moon.nI.a(((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.M)).getValue())))).intValue())), ((int)(java.lang.Math.max(((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.N)).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.M)).getValue())))).intValue()))))));
}


public com.moon.setting.IntegerSetting b__k1() {
return this.M;
}


public int e() {
return this.ak;
}


public com.moon.setting.SettingGroup e__k0() {
return this.af;
}


private boolean e__Boolean() {
int lexicalValue246_73_0;
    int lexicalValue246_75_0;
    java.lang.String spill246_0;
    int spill246_1;
    long life1_3;
    double life4_6;
    moom.CA life6_33;
    java.util.List life7_45;
    java.lang.String life3_46;
    java.util.Iterator life8_49;
    moom.CA life9_56;
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_66: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 35581734272259L);
    spill246_0 = com.moon.bF.b();
    life4_6 = -0x1.999999999999ap-4d;
    life6_33 = ((moom.CA)(new moom.CA(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).n, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).o, ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).p))).b(((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.t)).getValue())))).floatValue()))), ((double)(0x0.0p0d)), ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.t)).getValue())))).floatValue()))));
    life7_45 = ((net.minecraft.world.World)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).i)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)), ((moom.CA)(((moom.CA)(life6_33)).a(((double)(0x0.0p0d)), ((double)(life4_6)), ((double)(0x0.0p0d))))));
    life3_46 = spill246_0;
    life8_49 = ((java.util.List)(life7_45)).iterator();
    lexical_cycle_50: while (true) {
    if (!(((java.util.Iterator)(life8_49)).hasNext())) {
        break lexical_join_66;
    }
    life9_56 = ((moom.CA)(((java.util.Iterator)(life8_49)).next()));
    life4_6 = ((moom.CA)(life9_56)).b(((moom.CA)(life6_33)), ((double)(life4_6)));
    if (!((life3_46 != null))) {
        break lexical_join_74;
    }
    if (!((life3_46 == null))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    spill246_1 = recovery.source.CarrierOps.dcmpl(((double)(life4_6)), ((double)(0x0.0p0d)));
    if (!((life3_46 != null))) {
        lexicalValue246_73_0 = spill246_1;
        break lexical_join_73;
    }
    if (!((spill246_1 == 0))) {
        break lexical_join_74;
    }
    lexicalValue246_73_0 = 1;
    }
    lexicalValue246_75_0 = lexicalValue246_73_0;
    break lexical_join_75;
    }
    lexicalValue246_75_0 = 0;
    }
    return ((lexicalValue246_75_0) != 0);
}


public com.moon.setting.IntegerSetting e__k1() {
return this.S;
}


public com.moon.setting.BooleanSetting e__kV() {
return this.C;
}


public com.moon.setting.ModeSetting<com.moon.bF> e__kY() {
return this.ae;
}


public com.moon.setting.SettingGroup c() {
return this.V;
}


public com.moon.setting.FloatSetting c__kZ() {
return this.K;
}


public com.moon.setting.ModeSetting<com.moon.bI> c__kY() {
return this.B;
}


public com.moon.setting.IntegerSetting c__k1() {
return this.N;
}


public com.moon.setting.BooleanSetting c__kV() {
return this.y;
}


private boolean c__Boolean() {
int forestValue207_46_0;
    int forestValue207_50_0;
    int forestValue207_52_0;
    java.lang.String spill207_0;
    int spill207_1;
    long life1_3;
    moom.DT life4_18;
    java.lang.String life3_19;
    forest_join_52: {
    forest_join_51: {
    forest_join_50: {
    forest_join_46: {
    forest_join_44: {
    forest_join_34: {
    forest_join_30: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 73519870786614L);
    spill207_0 = com.moon.bF.b();
    life4_18 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).n, (this.al - 0x1.0p-1d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).p);
    life3_19 = spill207_0;
    spill207_1 = (com.moon.gx.a)[((com.moon.bE)(((com.moon.bE)(((com.moon.setting.ModeSetting)(this.s)).getValue())))).ordinal()];
    if (!((life3_19 != null))) {
        forestValue207_46_0 = spill207_1;
        break forest_join_46;
    }
    switch (spill207_1) {
default:
{
        break forest_join_30;
    }
case 1:
{
        break forest_join_34;
    }
case 2:
{
        break forest_join_44;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    forestValue207_52_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).I)).a__fE(((moom.DT)(life4_18))))).a__ch())).a__Boolean(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).I)), ((moom.DT)(life4_18)))) ? 1 : 0);
    break forest_join_52;
    }
    forestValue207_46_0 = ((((com.moon.module.impl.ScaffoldWalk)(this)).e__Boolean()) ? 1 : 0);
    }
    if (!((life3_19 != null))) {
        forestValue207_50_0 = forestValue207_46_0;
        break forest_join_50;
    }
    if (!((forestValue207_46_0 == 0))) {
        break forest_join_51;
    }
    forestValue207_50_0 = 1;
    }
    forestValue207_52_0 = forestValue207_50_0;
    break forest_join_52;
    }
    forestValue207_52_0 = 0;
    }
    return ((forestValue207_52_0) != 0);
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.ScaffoldWalk.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32641);
    if (((com.moon.module.impl.ScaffoldWalk.lb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.ScaffoldWalk.mb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.ScaffoldWalk.mb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lK", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.ScaffoldWalk.kb)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.ScaffoldWalk.lb)[life5_8] = com.moon.module.impl.ScaffoldWalk.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.ScaffoldWalk.lb)[life5_8];
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
        byte[] spill1189_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1189_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1189_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1189_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1189_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1189_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void c__Void() {
java.lang.Object forwardValue916_36_0;
    com.moon.module.impl.ScaffoldWalk forwardValue916_59_0;
    net.minecraft.client.entity.EntityPlayerSP spill916_0;
    com.moon.module.impl.ScaffoldWalk spill916_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_59: {
    forward_join_53: {
    forward_join_36: {
    forward_join_12: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 37520316214450L);
    life3_5 = com.moon.bF.b();
    spill916_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K;
    if (!((life3_5 != null))) {
        forwardValue916_36_0 = spill916_0;
        break forward_join_36;
    }
    if (!((spill916_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    this.al = ((double)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).b())).c));
    ((com.moon.gF)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).bC)).a__Void();
    ((com.moon.gA)(this.ag)).a__Void();
    this.ak = ((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).bD)).c));
    spill916_1 = this;
    if (!((life3_5 != null))) {
        forwardValue916_59_0 = spill916_1;
        break forward_join_59;
    }
    forwardValue916_36_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(spill916_1)).A)).getValue();
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(forwardValue916_36_0)))).booleanValue())) {
        break forward_join_53;
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(((com.moon.setting.ModeSetting)(this.B)).getValue())))).a())).a(((com.moon.module.impl.ScaffoldWalk)(this)));
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(((com.moon.setting.ModeSetting)(this.B)).getValue())))).a())).c();
    }
    super.onEnable();
    this.am = ((boolean)(false));
    forwardValue916_59_0 = this;
    }
    ((com.moon.module.impl.ScaffoldWalk)(forwardValue916_59_0)).an = ((int)(0));
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2618_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.BooleanSetting n() {
return this.Y;
}


public com.moon.setting.BooleanSetting h() {
return this.F;
}


public int f() {
return this.an;
}


public com.moon.setting.BooleanSetting f__kV() {
return this.D;
}


public boolean f__Boolean() {
return ((((this.aj) ? 1 : 0)) != 0);
}


public com.moon.setting.IntegerSetting f__k1() {
return this.T;
}


private void f__Void() {
com.moon.gF forwardValue920_22_0;
    com.moon.gF spill920_0;
    long life1_3;
    java.lang.String life3_5;
    com.moon.gF life4_15;
    com.moon.gG life5_29;
    forward_join_33: {
    forward_join_22: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 56235536330268L);
    life3_5 = com.moon.bF.b();
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.v)).getValue())))).booleanValue())) {
        break forward_join_33;
    }
    life4_15 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).bC;
    spill920_0 = life4_15;
    if (!((life3_5 != null))) {
        forwardValue920_22_0 = spill920_0;
        break forward_join_22;
    }
    if (!(((com.moon.gF)(spill920_0)).b__Boolean())) {
        break forward_join_33;
    }
    forwardValue920_22_0 = life4_15;
    }
    life5_29 = ((com.moon.gF)(forwardValue920_22_0)).a();
    if (!(((com.moon.gG)(life5_29)).a__Boolean())) {
        break forward_join_33;
    }
    ((com.moon.gF)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).bC)).a(((int)(((com.moon.gG)(life5_29)).a())));
    }
    return;
}


public com.moon.setting.BooleanSetting l() {
return this.R;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2620_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.ScaffoldWalk.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.SettingGroup d() {
return this.W;
}


public com.moon.setting.IntegerSetting d__k1() {
return this.O;
}


public com.moon.setting.FloatSetting d__kZ() {
return this.P;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17776;
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
            throw new RuntimeException("com/moon/lK", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private boolean d__Boolean() {
int forwardValue917_38_0;
    int forwardValue917_40_0;
    java.lang.String spill917_0;
    boolean spill917_1;
    boolean spill917_2;
    long life1_3;
    moom.DT life4_18;
    java.lang.String life3_19;
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 95381713303272L);
    spill917_0 = com.moon.bF.b();
    life4_18 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).n, (this.al - 0x1.0p-1d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).p);
    life3_19 = spill917_0;
    spill917_1 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).I)).a__fE(((moom.DT)(life4_18))))).a__ch())).a__Boolean(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).I)), ((moom.DT)(life4_18)));
    if (!((life3_19 != null))) {
        forwardValue917_38_0 = ((spill917_1) ? 1 : 0);
        break forward_join_38;
    }
    if (!((!spill917_1))) {
        break forward_join_37;
    }
    spill917_2 = ((com.moon.module.impl.ScaffoldWalk)(this)).e__Boolean();
    if (!((life3_19 != null))) {
        forwardValue917_38_0 = ((spill917_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!((!spill917_2))) {
        break forward_join_39;
    }
    }
    forwardValue917_38_0 = 1;
    }
    forwardValue917_40_0 = forwardValue917_38_0;
    break forward_join_40;
    }
    forwardValue917_40_0 = 0;
    }
    return ((forwardValue917_40_0) != 0);
}


public com.moon.setting.BooleanSetting d__kV() {
return this.A;
}


public com.moon.setting.ModeSetting<com.moon.bG> d__kY() {
return this.H;
}


public void d__Void() {
java.lang.Object forwardValue918_25_0;
    int forwardValue918_51_0;
    net.minecraft.client.entity.EntityPlayerSP spill918_0;
    boolean spill918_1;
    long life1_3;
    java.lang.String life3_5;
    int life4_60;
    int life5_65;
    forward_join_51: {
    forward_join_44: {
    forward_join_25: {
    forward_join_12: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 2775730010237L);
    life3_5 = com.moon.bF.b();
    spill918_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K;
    if (!((life3_5 != null))) {
        forwardValue918_25_0 = spill918_0;
        break forward_join_25;
    }
    if (!((spill918_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    ((com.moon.gF)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).bC)).a(((int)(this.ak)));
    ((com.moon.gF)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).bC)).b();
    forwardValue918_25_0 = ((com.moon.setting.BooleanSetting)(this.A)).getValue();
    }
    spill918_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue918_25_0)))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue918_51_0 = ((spill918_1) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill918_1)) {
        break forward_join_44;
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(((com.moon.setting.ModeSetting)(this.B)).getValue())))).a())).a(((com.moon.module.impl.ScaffoldWalk)(this)));
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(((com.moon.setting.ModeSetting)(this.B)).getValue())))).a())).b();
    }
    ((com.moon.gE)(this.ao)).b();
    forwardValue918_51_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).W)).am)).b();
    }
    life4_60 = forwardValue918_51_0;
    life5_65 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).W)).ao)).b();
    moom.pz.a(((int)(life5_65)), ((boolean)(org.lwjgl.input.Keyboard.isKeyDown(((int)(life5_65))))));
    moom.pz.a(((int)(life4_60)), ((boolean)(org.lwjgl.input.Keyboard.isKeyDown(((int)(life4_60))))));
    super.onDisable();
    return;
}


public void a(com.moon.eu p0) {
com.moon.module.impl.ScaffoldWalk lexicalValue245_12_0;
    moom.DT lexicalValue245_30_0;
    int lexicalValue245_59_0;
    int lexicalValue245_61_0;
    int lexicalValue245_81_0;
    com.moon.module.impl.ScaffoldWalk lexicalValue245_97_0;
    int lexicalValue245_111_0;
    com.moon.module.impl.ScaffoldWalk lexicalValue245_129_0;
    int lexicalValue245_132_0;
    int lexicalValue245_145_0;
    int lexicalValue245_163_0;
    int lexicalValue245_173_0;
    java.lang.Object lexicalValue245_183_0;
    java.lang.Object lexicalValue245_198_0;
    int lexicalValue245_211_0;
    int lexicalValue245_213_0;
    java.lang.Object lexicalValue245_244_0;
    int lexicalValue245_269_0;
    int lexicalValue245_296_0;
    com.moon.module.impl.ScaffoldWalk lexicalValue245_313_0;
    com.moon.module.impl.ScaffoldWalk spill245_0;
    moom.DT spill245_1;
    boolean spill245_2;
    boolean spill245_3;
    int spill245_4;
    com.moon.module.impl.ScaffoldWalk spill245_5;
    int spill245_6;
    com.moon.module.impl.ScaffoldWalk spill245_7;
    java.lang.Boolean spill245_8;
    net.minecraft.client.entity.EntityPlayerSP spill245_9;
    net.minecraft.util.MovingObjectPosition spill245_10;
    int spill245_11;
    int spill245_12;
    net.minecraft.item.ItemStack spill245_13;
    int spill245_14;
    int spill245_15;
    com.moon.module.impl.ScaffoldWalk spill245_16;
    long life2_3;
    java.lang.String life4_5;
    moom.DT life5_42;
    int life6_44;
    int life7_85;
    int life5_327;
    moom.DT life6_331;
    net.minecraft.item.ItemStack life7_335;
    lexical_join_313: {
    lexical_join_312: {
    lexical_join_296: {
    lexical_join_290: {
    lexical_join_269: {
    lexical_join_265: {
    lexical_join_244: {
    lexical_join_213: {
    lexical_join_212: {
    lexical_join_211: {
    lexical_join_198: {
    lexical_join_188: {
    lexical_join_186: {
    lexical_join_183: {
    lexical_join_180: {
    lexical_join_173: {
    lexical_join_163: {
    lexical_join_158: {
    lexical_join_145: {
    lexical_join_140: {
    lexical_join_132: {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_111: {
    lexical_join_105: {
    lexical_join_30: {
    lexical_join_12: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 29002850711314L);
    life4_5 = com.moon.bF.b();
    spill245_0 = this;
    if (!((life4_5 != null))) {
        lexicalValue245_12_0 = spill245_0;
        break lexical_join_12;
    }
    if (!(((com.moon.module.impl.ScaffoldWalk)(spill245_0)).d__Boolean())) {
        break lexical_join_188;
    }
    lexicalValue245_12_0 = this;
    }
    spill245_1 = ((com.moon.gC)(((com.moon.module.impl.ScaffoldWalk)(lexicalValue245_12_0)).ah)).a__DT();
    if (!((life4_5 != null))) {
        lexicalValue245_30_0 = spill245_1;
        break lexical_join_30;
    }
    if (!((spill245_1 != null))) {
        break lexical_join_188;
    }
    lexicalValue245_30_0 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).n, (this.al - 0x1.0p-1d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).p);
    }
    life5_42 = lexicalValue245_30_0;
    life6_44 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_97: {
    lexical_join_84: {
    lexical_join_81: {
    lexical_join_68: {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_58: {
    if (!((life6_44 < 3))) {
        break lexical_join_105;
    }
    spill245_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this)).l())).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        lexicalValue245_111_0 = ((spill245_2) ? 1 : 0);
        break lexical_join_111;
    }
    if (!((life4_5 != null))) {
        lexicalValue245_59_0 = ((spill245_2) ? 1 : 0);
        break lexical_join_59;
    }
    if (!(spill245_2)) {
        break lexical_join_58;
    }
    spill245_3 = ((com.moon.gA)(this.ag)).a__Boolean(((moom.DT)(((com.moon.gC)(this.ah)).a__DT())), ((moom.bs)(((com.moon.gC)(this.ah)).a__bs())));
    if (!((life4_5 != null))) {
        lexicalValue245_59_0 = ((spill245_3) ? 1 : 0);
        break lexical_join_59;
    }
    if (!(spill245_3)) {
        break lexical_join_60;
    }
    }
    lexicalValue245_59_0 = 1;
    }
    lexicalValue245_61_0 = lexicalValue245_59_0;
    break lexical_join_61;
    }
    lexicalValue245_61_0 = 0;
    }
    life7_85 = lexicalValue245_61_0;
    spill245_4 = life7_85;
    if (!((life4_5 != null))) {
        lexicalValue245_81_0 = spill245_4;
        break lexical_join_81;
    }
    if (!((spill245_4 == 0))) {
        break lexical_join_68;
    }
    if (!((life4_5 == null))) {
        break lexical_join_105;
    }
    }
    ((com.moon.gy)(this.ai)).a(((moom.DT)(((com.moon.gC)(this.ah)).a__DT())), ((moom.bs)(((com.moon.gC)(this.ah)).a__bs())));
    spill245_5 = this;
    if (!((life4_5 != null))) {
        lexicalValue245_97_0 = spill245_5;
        break lexical_join_97;
    }
    lexicalValue245_81_0 = ((((com.moon.module.impl.ScaffoldWalk)(spill245_5)).e__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue245_81_0 != 0))) {
        break lexical_join_84;
    }
    if (!((life4_5 == null))) {
        break lexical_join_105;
    }
    }
    ((com.moon.gC)(this.ah)).a(((moom.DT)(life5_42)), ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.u)).getValue())))).floatValue()))));
    if (!((life4_5 != null))) {
        break lexical_join_103;
    }
    lexicalValue245_97_0 = this;
    }
    if (!((((com.moon.gC)(((com.moon.module.impl.ScaffoldWalk)(lexicalValue245_97_0)).ah)).a__DT() == null))) {
        break lexical_join_102;
    }
    if (!((life4_5 == null))) {
        break lexical_join_105;
    }
    }
    life6_44 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    life6_44 = ((((com.moon.module.impl.ScaffoldWalk)(this)).e__Boolean()) ? 1 : 0);
    lexicalValue245_111_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).A) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue245_132_0 = lexicalValue245_111_0;
        break lexical_join_132;
    }
    if (!((lexicalValue245_111_0 != 0))) {
        break lexical_join_128;
    }
    spill245_6 = life6_44;
    if (!((life4_5 != null))) {
        lexicalValue245_132_0 = spill245_6;
        break lexical_join_132;
    }
    if (!((spill245_6 == 0))) {
        break lexical_join_128;
    }
    spill245_7 = this;
    if (!((life4_5 != null))) {
        lexicalValue245_129_0 = spill245_7;
        break lexical_join_129;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.ScaffoldWalk)(spill245_7)).H)).getValue() == com.moon.bG.JUMP))) {
        break lexical_join_128;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).D__sourceReturn_da8c82d5d4();
    }
    lexicalValue245_129_0 = this;
    }
    lexicalValue245_132_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.ScaffoldWalk)(lexicalValue245_129_0)).L)).isSelected(((java.lang.Enum)(com.moon.bH.EDGE)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue245_145_0 = lexicalValue245_132_0;
        break lexical_join_145;
    }
    if (!((lexicalValue245_132_0 != 0))) {
        break lexical_join_140;
    }
    ((com.moon.gE)(this.ao)).a(((int)(((com.moon.module.impl.ScaffoldWalk)(this)).b())));
    }
    lexicalValue245_145_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.D)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue245_163_0 = lexicalValue245_145_0;
        break lexical_join_163;
    }
    if (!((lexicalValue245_145_0 != 0))) {
        break lexical_join_158;
    }
    moom.pz.a(((int)(((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).W)).ar)).b())), ((boolean)(false)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).c(((boolean)(false)));
    }
    lexicalValue245_163_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.y)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue245_173_0 = lexicalValue245_163_0;
        break lexical_join_173;
    }
    if (!((lexicalValue245_163_0 != 0))) {
        break lexical_join_186;
    }
    spill245_8 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.E)).getValue()));
    if (!((life4_5 != null))) {
        lexicalValue245_183_0 = spill245_8;
        break lexical_join_183;
    }
    lexicalValue245_173_0 = ((((java.lang.Boolean)(spill245_8)).booleanValue()) ? 1 : 0);
    }
    if (!((lexicalValue245_173_0 != 0))) {
        break lexical_join_180;
    }
    spill245_9 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K;
    if (!((life4_5 != null))) {
        lexicalValue245_183_0 = spill245_9;
        break lexical_join_183;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(spill245_9)).ae()))) {
        break lexical_join_186;
    }
    }
    lexicalValue245_183_0 = ((com.moon.setting.ModeSetting)(this.z)).getValue();
    }
    ((com.moon.gK)(((com.moon.bJ)(((com.moon.bJ)(lexicalValue245_183_0)))).a())).a();
    }
    if (!((life4_5 == null))) {
        break lexical_join_265;
    }
    }
    spill245_10 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).V;
    if (!((life4_5 != null))) {
        lexicalValue245_198_0 = spill245_10;
        break lexical_join_198;
    }
    if (!((spill245_10 != null))) {
        break lexical_join_265;
    }
    ((com.moon.module.impl.ScaffoldWalk)(this)).f__Void();
    lexicalValue245_198_0 = ((com.moon.setting.IntegerSetting)(this.S)).getValue();
    }
    spill245_11 = ((java.lang.Integer)(((java.lang.Integer)(lexicalValue245_198_0)))).intValue();
    if (!((life4_5 != null))) {
        lexicalValue245_211_0 = spill245_11;
        break lexical_join_211;
    }
    if (!((spill245_11 >= com.moon.nI.a(((int)(1)), ((int)(__sourceIntrinsic_10690d5e99fa_invokedynamic245_98(4024, (383905285675299770L ^ life2_3)))))))) {
        break lexical_join_212;
    }
    lexicalValue245_211_0 = 1;
    }
    lexicalValue245_213_0 = lexicalValue245_211_0;
    break lexical_join_213;
    }
    lexicalValue245_213_0 = 0;
    }
    life5_327 = lexicalValue245_213_0;
    life6_331 = ((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).V)).a();
    life7_335 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).c__xW();
    spill245_12 = life5_327;
    if (!((life4_5 != null))) {
        lexicalValue245_269_0 = spill245_12;
        break lexical_join_269;
    }
    if (!((spill245_12 != 0))) {
        break lexical_join_265;
    }
    if (!((life6_331 != null))) {
        break lexical_join_265;
    }
    spill245_13 = life7_335;
    if (!((life4_5 != null))) {
        lexicalValue245_244_0 = spill245_13;
        break lexical_join_244;
    }
    if (!((spill245_13 != null))) {
        break lexical_join_265;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).I)), ((net.minecraft.item.ItemStack)(life7_335)));
    lexicalValue245_244_0 = ((com.moon.setting.IntegerSetting)(this.T)).getValue();
    }
    spill245_14 = ((java.lang.Integer)(((java.lang.Integer)(lexicalValue245_244_0)))).intValue();
    if (!((life4_5 != null))) {
        lexicalValue245_269_0 = spill245_14;
        break lexical_join_269;
    }
    if (!((spill245_14 >= com.moon.nI.a(((int)(1)), ((int)(__sourceIntrinsic_10690d5e99fa_invokedynamic245_117(4024, (383905285675299770L ^ life2_3)))))))) {
        break lexical_join_265;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).I)), ((net.minecraft.item.ItemStack)(life7_335)));
    }
    lexicalValue245_269_0 = ((((com.moon.setting.MultiSelectSetting)(this.L)).isSelected(((java.lang.Enum)(com.moon.bH.DISTANCE)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue245_296_0 = lexicalValue245_269_0;
        break lexical_join_296;
    }
    if (!((lexicalValue245_269_0 != 0))) {
        break lexical_join_290;
    }
    spill245_15 = recovery.source.CarrierOps.dcmpl(((double)(((com.moon.gE)(this.ao)).a())), ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.P)).getValue())))).floatValue()))));
    if (!((life4_5 != null))) {
        lexicalValue245_296_0 = spill245_15;
        break lexical_join_296;
    }
    if (!((spill245_15 >= 0))) {
        break lexical_join_290;
    }
    ((com.moon.gE)(this.ao)).a(((int)(((com.moon.module.impl.ScaffoldWalk)(this)).b())));
    }
    spill245_16 = this;
    if (!((life4_5 != null))) {
        lexicalValue245_313_0 = spill245_16;
        break lexical_join_313;
    }
    lexicalValue245_296_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.ScaffoldWalk)(spill245_16)).L)).isSelected(((java.lang.Enum)(com.moon.bH.DELAY)))) ? 1 : 0);
    }
    if (!((lexicalValue245_296_0 != 0))) {
        break lexical_join_312;
    }
    if (!(((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).S % ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.O)).getValue())))).intValue()) == 0))) {
        break lexical_join_312;
    }
    ((com.moon.gE)(this.ao)).a(((int)(((com.moon.module.impl.ScaffoldWalk)(this)).b())));
    }
    lexicalValue245_313_0 = this;
    }
    ((com.moon.gE)(((com.moon.module.impl.ScaffoldWalk)(lexicalValue245_313_0)).ao)).a__Void();
    return;
}


public double a() {
return this.al;
}


public com.moon.module.impl.ScaffoldWalk a(boolean p0) {
this.aj = ((boolean)(p0));
    return this;
}


public com.moon.gE a__gE() {
return this.ao;
}


public com.moon.gC a__gC() {
return this.ah;
}


public com.moon.gy a__gy() {
return this.ai;
}


public void a(com.moon.eA p0) {
long life2_3;
    com.moon.n4 life5_9;
    java.lang.String life4_10;
    forward_join_25: {
    forward_join_20: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 8921887704288L);
    java.lang.String spill1181_0 = com.moon.bF.b();
    life5_9 = ((com.moon.gD)(((com.moon.gA)(this.ag)).a())).b();
    life4_10 = spill1181_0;
    if (!((life4_10 != null))) { break forward_join_20; }
    if (!((life5_9 != null))) { break forward_join_25; }
    ((com.moon.eA)(p0)).a(((float)(((com.moon.n4)(life5_9)).a__Float())));
    }
    ((com.moon.eA)(p0)).b(((float)(((com.moon.n4)(life5_9)).b__Float())));
    }
    return;
}


public com.moon.gA a__gA() {
return this.ag;
}


public void a(com.moon.dR p0) {
long local2 = (com.moon.module.impl.ScaffoldWalk.cb ^ 25085118646051L);
    if ((((com.moon.setting.ModeSetting)(this.H)).getValue() == com.moon.bG.NORMAL)) {
        if ((((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).A) ? 1 : 0) != 0)) {
        ((com.moon.dR)(p0)).setCancelled(((boolean)(true)));
    }
    }
    return;
}


public void a(com.moon.dN p0) {
long local2 = (com.moon.module.impl.ScaffoldWalk.cb ^ 91703495324585L);
    java.lang.Object local4 = com.moon.bF.b();
    if ((local4 != null)) {
        if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue()) != 0)) {
        this.ak = ((int)(((com.moon.dN)(p0)).a__sourceReturn_8abf5c6871()));
    }
        ((com.moon.dN)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.et p0) {
long local2 = (com.moon.module.impl.ScaffoldWalk.cb ^ 121502878647719L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.et)(p0)).a(((int)(this.ak)));
    }
    return;
}


public void a(com.moon.eN p0) {
long local2 = (com.moon.module.impl.ScaffoldWalk.cb ^ 2839683173857L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.eN)(p0)).a(((int)(this.ak)));
    }
    return;
}


public com.moon.setting.MultiSelectSetting<com.moon.bH> a__k4() {
return this.L;
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue914_22_0;
    int forwardValue914_52_0;
    com.moon.module.impl.ScaffoldWalk forwardValue914_58_0;
    com.moon.module.impl.ScaffoldWalk forwardValue914_120_0;
    net.minecraft.client.entity.EntityPlayerSP spill914_0;
    com.moon.module.impl.ScaffoldWalk spill914_1;
    boolean spill914_2;
    boolean spill914_3;
    boolean spill914_4;
    com.moon.module.impl.ScaffoldWalk spill914_5;
    com.moon.module.impl.ScaffoldWalk spill914_6;
    long life2_3;
    java.lang.String life4_5;
    moom.DT life5_116;
    int life6_119;
    moom.DT life7_154;
    moom.bs life8_158;
    forward_join_134: {
    forward_join_120: {
    forward_join_119: {
    forward_join_100: {
    forward_join_90: {
    forward_join_64: {
    forward_join_58: {
    forward_join_57: {
    forward_join_52: {
    forward_join_45: {
    forward_join_22: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 99395497764749L);
    life4_5 = com.moon.bF.b();
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forward_join_15;
    }
    spill914_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K;
    if (!((life4_5 != null))) {
        forwardValue914_22_0 = spill914_0;
        break forward_join_22;
    }
    if (!((spill914_0 == null))) {
        break forward_join_16;
    }
    }
    return;
    }
    spill914_1 = this;
    if (!((life4_5 != null))) {
        forwardValue914_58_0 = spill914_1;
        break forward_join_58;
    }
    ((com.moon.module.impl.ScaffoldWalk)(spill914_1)).f__Void();
    forwardValue914_22_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(forwardValue914_22_0)).A))) {
        break forward_join_57;
    }
    spill914_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.y)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue914_52_0 = ((spill914_2) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill914_2)) {
        break forward_join_45;
    }
    spill914_3 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).W)).ap)).a__Boolean();
    if (!((life4_5 != null))) {
        forwardValue914_52_0 = ((spill914_3) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill914_3)) {
        break forward_join_45;
    }
    spill914_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).ae();
    if (!((life4_5 != null))) {
        forwardValue914_52_0 = ((spill914_4) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill914_4)) {
        break forward_join_57;
    }
    }
    spill914_5 = this;
    if (!((life4_5 != null))) {
        forwardValue914_58_0 = spill914_5;
        break forward_join_58;
    }
    forwardValue914_52_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(spill914_5)).E)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue914_52_0 != 0))) {
        break forward_join_57;
    }
    if (!((!((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).ae()))) {
        break forward_join_64;
    }
    }
    forwardValue914_58_0 = this;
    }
    ((com.moon.module.impl.ScaffoldWalk)(forwardValue914_58_0)).al = ((double)(java.lang.Math.floor(((double)(((moom.CA)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).b())).c)))));
    }
    life5_116 = new moom.DT(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).n, (this.al - 0x1.0p-1d), ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).p);
    life6_119 = ((((com.moon.module.impl.ScaffoldWalk)(this)).c__Boolean()) ? 1 : 0);
    if (!((life4_5 != null))) {
        break forward_join_100;
    }
    if (!((life6_119 == 0))) {
        break forward_join_90;
    }
    spill914_6 = this;
    if (!((life4_5 != null))) {
        forwardValue914_120_0 = spill914_6;
        break forward_join_120;
    }
    if (!(((com.moon.module.impl.ScaffoldWalk)(spill914_6)).d__Boolean())) {
        break forward_join_119;
    }
    }
    ((com.moon.gC)(this.ah)).a(((moom.DT)(life5_116)), ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.u)).getValue())))).floatValue()))));
    }
    life7_154 = ((com.moon.gC)(this.ah)).a__DT();
    life8_158 = ((com.moon.gC)(this.ah)).a__bs();
    if (!((life4_5 != null))) {
        break forward_join_134;
    }
    if (!((life6_119 != 0))) {
        break forward_join_119;
    }
    if (!((life7_154 != null))) {
        break forward_join_119;
    }
    ((com.moon.gA)(this.ag)).a(((moom.DT)(life7_154)), ((moom.bs)(life8_158)));
    }
    forwardValue914_120_0 = this;
    }
    ((com.moon.gD)(((com.moon.gA)(((com.moon.module.impl.ScaffoldWalk)(forwardValue914_120_0)).ag)).a())).a(((float)(((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.ScaffoldWalk)(this)).g())).getValue())))).intValue()))), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this)).r())).getValue())))).booleanValue())));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.eE p0) {
int forwardValue908_17_0;
    boolean spill908_0;
    long life2_3;
    java.lang.String life4_5;
    float life5_29;
    float[] life6_35;
    forward_join_36: {
    forward_join_17: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 92610359241740L);
    life4_5 = com.moon.bF.b();
    spill908_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.I)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue908_17_0 = ((spill908_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill908_0)) {
        break forward_join_36;
    }
    forwardValue908_17_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).ae()) ? 1 : 0);
    }
    if (!((forwardValue908_17_0 != 0))) {
        break forward_join_36;
    }
    life5_29 = ((com.moon.n4)(((com.moon.gD)(((com.moon.gA)(this.ag)).a())).b())).a__Float();
    life6_35 = com.moon.nE.a(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).w)), ((float)(life5_29)));
    ((com.moon.eE)(p0)).a(((float)((life6_35)[0])));
    }
    return;
}


public void a(com.moon.eF p0) {
int forwardValue909_39_0;
    int forwardValue909_43_0;
    int forwardValue909_45_0;
    int forwardValue909_59_0;
    float forwardValue909_76_0;
    float forwardValue909_77_0;
    float forwardValue909_77_1;
    float forwardValue909_84_0;
    float forwardValue909_85_0;
    float forwardValue909_85_1;
    java.lang.String spill909_0;
    boolean spill909_1;
    boolean spill909_2;
    int spill909_3;
    float spill909_4;
    float spill909_5;
    long life2_3;
    com.moon.n4 life5_9;
    float life6_21;
    java.lang.String life4_22;
    float life7_83;
    float[] life8_89;
    float life9_111;
    forward_join_107: {
    forward_join_85: {
    forward_join_84: {
    forward_join_77: {
    forward_join_76: {
    forward_join_59: {
    forward_join_45: {
    forward_join_44: {
    forward_join_43: {
    forward_join_39: {
    forward_join_36: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 139132413822980L);
    spill909_0 = com.moon.bF.b();
    life5_9 = ((com.moon.gD)(((com.moon.gA)(this.ag)).a())).b();
    life6_21 = ((((com.moon.eF)(p0)).b__sourceReturn_bc607678b6() * ((com.moon.eF)(p0)).b__sourceReturn_bc607678b6()) + (((com.moon.eF)(p0)).c() * ((com.moon.eF)(p0)).c()));
    life4_22 = spill909_0;
    spill909_1 = this.aj;
    if (!((life4_22 != null))) {
        forwardValue909_39_0 = ((spill909_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill909_1))) {
        break forward_join_36;
    }
    spill909_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this)).o())).getValue())))).booleanValue();
    if (!((life4_22 != null))) {
        forwardValue909_39_0 = ((spill909_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill909_2)) {
        break forward_join_107;
    }
    }
    forwardValue909_39_0 = recovery.source.CarrierOps.fcmpl(((float)(life6_21)), ((float)(0x1.0c6f7ap-20f)));
    }
    if (!((life4_22 != null))) {
        forwardValue909_43_0 = forwardValue909_39_0;
        break forward_join_43;
    }
    if (!((forwardValue909_39_0 > 0))) {
        break forward_join_44;
    }
    forwardValue909_43_0 = 1;
    }
    forwardValue909_45_0 = forwardValue909_43_0;
    break forward_join_45;
    }
    forwardValue909_45_0 = 0;
    }
    spill909_3 = (forwardValue909_45_0 & ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.I)).getValue())))).booleanValue()) ? 1 : 0));
    if (!((life4_22 != null))) {
        forwardValue909_59_0 = spill909_3;
        break forward_join_59;
    }
    if (!((spill909_3 != 0))) {
        break forward_join_107;
    }
    forwardValue909_59_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.X)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue909_59_0 != 0))) {
        break forward_join_107;
    }
    life7_83 = ((com.moon.n4)(life5_9)).a__Float();
    life8_89 = com.moon.nE.a(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).w)), ((float)(life7_83)));
    spill909_4 = 0x1.f5c29p-1f;
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).M())) {
        forwardValue909_76_0 = spill909_4;
        break forward_join_76;
    }
    forwardValue909_77_0 = spill909_4;
    forwardValue909_77_1 = 0x1.99999ap-3f;
    break forward_join_77;
    }
    forwardValue909_77_0 = forwardValue909_76_0;
    forwardValue909_77_1 = 0x1.0p0f;
    }
    spill909_5 = (forwardValue909_77_0 * forwardValue909_77_1);
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).t__Boolean())) {
        forwardValue909_84_0 = spill909_5;
        break forward_join_84;
    }
    forwardValue909_85_0 = spill909_5;
    forwardValue909_85_1 = 0x1.333334p-2f;
    break forward_join_85;
    }
    forwardValue909_85_0 = forwardValue909_84_0;
    forwardValue909_85_1 = 0x1.0p0f;
    }
    life9_111 = (forwardValue909_85_0 * forwardValue909_85_1);
    ((com.moon.eF)(p0)).a(((float)(life7_83)));
    ((com.moon.eF)(p0)).b(((float)(((life8_89)[0] * life9_111))));
    ((com.moon.eF)(p0)).c(((float)(((life8_89)[1] * life9_111))));
    }
    return;
}


public void a(com.moon.event.PacketEvent p0) {
java.lang.Object forwardValue913_25_0;
    java.lang.Boolean spill913_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_29: {
    forward_join_25: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 15976631872653L);
    life4_5 = com.moon.bF.b();
    spill913_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue()));
    if (!((life4_5 != null))) {
        forwardValue913_25_0 = spill913_0;
        break forward_join_25;
    }
    if (!(((java.lang.Boolean)(spill913_0)).booleanValue())) {
        break forward_join_29;
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(((com.moon.setting.ModeSetting)(this.B)).getValue())))).a())).a(((com.moon.module.impl.ScaffoldWalk)(this)));
    forwardValue913_25_0 = ((com.moon.setting.ModeSetting)(this.B)).getValue();
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(forwardValue913_25_0)))).a())).a(((com.moon.event.PacketEvent)(p0)));
    }
    return;
}


public com.moon.setting.SettingGroup a__k0() {
return this.x;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.v;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.t;
}


public com.moon.setting.ModeSetting<com.moon.bE> a__kY() {
return this.s;
}


public void a(com.moon.dL p0) {
((com.moon.dL)(p0)).setCancelled(((boolean)(true)));
    return;
}


public com.moon.setting.IntegerSetting a__k1() {
return this.G;
}


public void a(com.moon.event.MotionEvent p0) {
java.lang.Object forwardValue911_31_0;
    int forwardValue911_42_0;
    java.lang.Object forwardValue911_54_0;
    boolean spill911_0;
    java.lang.Boolean spill911_1;
    boolean spill911_2;
    java.lang.Boolean spill911_3;
    long life2_3;
    java.lang.String life4_5;
    forward_join_58: {
    forward_join_54: {
    forward_join_42: {
    forward_join_35: {
    forward_join_31: {
    forward_join_28: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 87461170267205L);
    life4_5 = com.moon.bF.b();
    spill911_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.y)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue911_42_0 = ((spill911_0) ? 1 : 0);
        break forward_join_42;
    }
    if (!(spill911_0)) {
        break forward_join_35;
    }
    spill911_1 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.E)).getValue()));
    if (!((life4_5 != null))) {
        forwardValue911_31_0 = spill911_1;
        break forward_join_31;
    }
    if (!(((java.lang.Boolean)(spill911_1)).booleanValue())) {
        break forward_join_28;
    }
    spill911_2 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).ae();
    if (!((life4_5 != null))) {
        forwardValue911_42_0 = ((spill911_2) ? 1 : 0);
        break forward_join_42;
    }
    if (!((!spill911_2))) {
        break forward_join_35;
    }
    }
    forwardValue911_31_0 = ((com.moon.setting.ModeSetting)(this.z)).getValue();
    }
    ((com.moon.gK)(((com.moon.bJ)(((com.moon.bJ)(forwardValue911_31_0)))).a())).a(((com.moon.event.MotionEvent)(p0)));
    }
    spill911_3 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue()));
    if (!((life4_5 != null))) {
        forwardValue911_54_0 = spill911_3;
        break forward_join_54;
    }
    forwardValue911_42_0 = ((((java.lang.Boolean)(spill911_3)).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue911_42_0 != 0))) {
        break forward_join_58;
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(((com.moon.setting.ModeSetting)(this.B)).getValue())))).a())).a(((com.moon.module.impl.ScaffoldWalk)(this)));
    forwardValue911_54_0 = ((com.moon.setting.ModeSetting)(this.B)).getValue();
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(forwardValue911_54_0)))).a())).a(((com.moon.event.MotionEvent)(p0)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forestValue200004_18_0;
    int forestValue200004_49_0;
    int forestValue200004_50_0;
    int forestValue200004_50_1;
    int forestValue200004_60_0;
    int forestValue200004_61_0;
    int forestValue200004_61_1;
    int forestValue200004_75_0;
    net.minecraft.client.Minecraft forestValue200004_77_0;
    int forestValue200004_82_0;
    com.moon.module.impl.ScaffoldWalk forestValue200004_117_0;
    int forestValue200004_117_1;
    com.moon.module.impl.ScaffoldWalk forestValue200004_118_0;
    com.moon.module.impl.ScaffoldWalk forestValue200004_119_0;
    int forestValue200004_119_1;
    int forestValue200004_125_0;
    int forestValue200004_134_0;
    java.lang.Object forestValue200004_141_0;
    int forestValue200004_143_0;
    int forestValue200004_162_0;
    int forestValue200004_170_0;
    java.lang.Object forestValue200004_174_0;
    com.moon.module.impl.ScaffoldWalk forestValue200004_179_0;
    com.moon.module.impl.ScaffoldWalk forestValue200004_225_0;
    java.lang.Object forestValue200004_230_0;
    int forestValue200004_232_0;
    java.lang.Object forestValue200004_252_0;
    int forestValue200004_263_0;
    java.lang.Object forestValue200004_275_0;
    boolean spill200004_0;
    com.moon.event.MovePhase spill200004_1;
    int spill200004_2;
    int spill200004_3;
    boolean spill200004_4;
    net.minecraft.client.Minecraft spill200004_5;
    int spill200004_6;
    boolean spill200004_7;
    int spill200004_8;
    com.moon.module.impl.ScaffoldWalk spill200004_9;
    boolean spill200004_10;
    com.moon.module.impl.ScaffoldWalk spill200004_11;
    int spill200004_12;
    net.minecraft.client.entity.EntityPlayerSP spill200004_13;
    com.moon.event.MovePhase spill200004_14;
    boolean spill200004_15;
    com.moon.n4 spill200004_16;
    com.moon.module.impl.ScaffoldWalk spill200004_17;
    boolean spill200004_18;
    java.lang.Boolean spill200004_19;
    boolean spill200004_20;
    java.lang.Boolean spill200004_21;
    long life2_3;
    java.lang.String life4_5;
    int life5_37;
    int life6_42;
    int life7_90;
    com.moon.n4 life5_209;
    forest_join_279: {
    forest_join_275: {
    forest_join_263: {
    forest_join_256: {
    forest_join_252: {
    forest_join_249: {
    forest_join_232: {
    forest_join_230: {
    forest_join_227: {
    forest_join_225: {
    forest_join_214: {
    forest_join_179: {
    forest_join_178: {
    forest_join_174: {
    forest_join_170: {
    forest_join_162: {
    forest_join_143: {
    forest_join_141: {
    forest_join_136: {
    forest_join_134: {
    forest_join_133: {
    forest_join_125: {
    forest_join_123: {
    forest_join_119: {
    forest_join_118: {
    forest_join_117: {
    forest_join_82: {
    forest_join_81: {
    forest_join_77: {
    forest_join_75: {
    forest_join_61: {
    forest_join_60: {
    forest_join_50: {
    forest_join_49: {
    forest_join_24: {
    forest_join_18: {
    life2_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 18314556363995L);
    life4_5 = com.moon.bF.b();
    spill200004_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue200004_18_0 = ((spill200004_0) ? 1 : 0);
        break forest_join_18;
    }
    if (!((!spill200004_0))) {
        break forest_join_24;
    }
    forestValue200004_18_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).W)).ar)).b();
    }
    moom.pz.a(((int)(forestValue200004_18_0)), ((boolean)(false)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).c(((boolean)(false)));
    }
    spill200004_1 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    if (!((life4_5 != null))) {
        forestValue200004_141_0 = spill200004_1;
        break forest_join_141;
    }
    if (!((spill200004_1 == com.moon.event.MovePhase.PRE))) {
        break forest_join_136;
    }
    life5_37 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).W)).am)).b();
    life6_42 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).W)).ao)).b();
    spill200004_2 = life6_42;
    if (!(org.lwjgl.input.Keyboard.isKeyDown(((int)(life6_42))))) {
        forestValue200004_49_0 = spill200004_2;
        break forest_join_49;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).P == null))) {
        forestValue200004_49_0 = spill200004_2;
        break forest_join_49;
    }
    forestValue200004_50_0 = spill200004_2;
    forestValue200004_50_1 = 1;
    break forest_join_50;
    }
    forestValue200004_50_0 = forestValue200004_49_0;
    forestValue200004_50_1 = 0;
    }
    moom.pz.a(((int)(forestValue200004_50_0)), ((boolean)__sourceIntrinsic_integerToBoolean((forestValue200004_50_1))));
    spill200004_3 = life5_37;
    if (!(org.lwjgl.input.Keyboard.isKeyDown(((int)(life5_37))))) {
        forestValue200004_60_0 = spill200004_3;
        break forest_join_60;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).P == null))) {
        forestValue200004_60_0 = spill200004_3;
        break forest_join_60;
    }
    forestValue200004_61_0 = spill200004_3;
    forestValue200004_61_1 = 1;
    break forest_join_61;
    }
    forestValue200004_61_0 = forestValue200004_60_0;
    forestValue200004_61_1 = 0;
    }
    moom.pz.a(((int)(forestValue200004_61_0)), ((boolean)__sourceIntrinsic_integerToBoolean((forestValue200004_61_1))));
    spill200004_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).A;
    if (!((life4_5 != null))) {
        forestValue200004_75_0 = ((spill200004_4) ? 1 : 0);
        break forest_join_75;
    }
    if (!(spill200004_4)) {
        break forest_join_81;
    }
    spill200004_5 = com.moon.module.impl.ScaffoldWalk.d;
    if (!((life4_5 != null))) {
        forestValue200004_77_0 = spill200004_5;
        break forest_join_77;
    }
    forestValue200004_75_0 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(spill200004_5)).K)).bk)), ((float)(0x0.0p0f)));
    }
    if (!((forestValue200004_75_0 > 0))) {
        break forest_join_81;
    }
    forestValue200004_77_0 = com.moon.module.impl.ScaffoldWalk.d;
    }
    if (!((((net.minecraft.client.Minecraft)(forestValue200004_77_0)).P == null))) {
        break forest_join_81;
    }
    forestValue200004_82_0 = 1;
    break forest_join_82;
    }
    forestValue200004_82_0 = 0;
    }
    life7_90 = forestValue200004_82_0;
    spill200004_6 = life7_90;
    if (!((life4_5 != null))) {
        forestValue200004_143_0 = spill200004_6;
        break forest_join_143;
    }
    if (!((spill200004_6 != 0))) {
        break forest_join_136;
    }
    spill200004_7 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.F)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue200004_143_0 = ((spill200004_7) ? 1 : 0);
        break forest_join_143;
    }
    if (!(spill200004_7)) {
        break forest_join_136;
    }
    com.moon.module.impl.ScaffoldWalk __stackOp200004_48_0 = this;
    com.moon.module.impl.ScaffoldWalk __stackOp200004_50_0 = __stackOp200004_48_0;
    int __stackOp200004_50_1 = ((com.moon.module.impl.ScaffoldWalk)(__stackOp200004_48_0)).an;
    spill200004_8 = __stackOp200004_50_1;
    ((com.moon.module.impl.ScaffoldWalk)(__stackOp200004_50_0)).an = ((int)((__stackOp200004_50_1 + 1)));
    if (!((life4_5 != null))) {
        forestValue200004_125_0 = spill200004_8;
        break forest_join_125;
    }
    if (!((spill200004_8 >= ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.G)).getValue())))).intValue()))) {
        break forest_join_123;
    }
    spill200004_9 = this;
    spill200004_10 = this.am;
    if (!((life4_5 != null))) {
        forestValue200004_117_0 = spill200004_9;
        forestValue200004_117_1 = ((spill200004_10) ? 1 : 0);
        break forest_join_117;
    }
    if (!((!spill200004_10))) {
        forestValue200004_118_0 = spill200004_9;
        break forest_join_118;
    }
    forestValue200004_117_0 = spill200004_9;
    forestValue200004_117_1 = 1;
    }
    forestValue200004_119_0 = forestValue200004_117_0;
    forestValue200004_119_1 = forestValue200004_117_1;
    break forest_join_119;
    }
    forestValue200004_119_0 = forestValue200004_118_0;
    forestValue200004_119_1 = 0;
    }
    ((com.moon.module.impl.ScaffoldWalk)(forestValue200004_119_0)).am = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue200004_119_1)));
    this.an = ((int)(0));
    }
    forestValue200004_125_0 = ((this.am) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue200004_134_0 = forestValue200004_125_0;
        break forest_join_134;
    }
    if (!((forestValue200004_125_0 != 0))) {
        break forest_join_133;
    }
    moom.pz.a(((int)(life5_37)), ((boolean)(true)));
    if (!((life4_5 == null))) {
        break forest_join_136;
    }
    }
    forestValue200004_134_0 = life6_42;
    }
    moom.pz.a(((int)(forestValue200004_134_0)), ((boolean)(true)));
    }
    spill200004_11 = this;
    if (!((life4_5 != null))) {
        forestValue200004_179_0 = spill200004_11;
        break forest_join_179;
    }
    forestValue200004_141_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(spill200004_11)).J)).getValue();
    }
    forestValue200004_143_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(forestValue200004_141_0)))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue200004_143_0 != 0))) {
        break forest_join_178;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forest_join_178;
    }
    spill200004_12 = recovery.source.CarrierOps.dcmpl(((double)(com.moon.nJ.b())), ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.K)).getValue())))).floatValue()))));
    if (!((life4_5 != null))) {
        forestValue200004_162_0 = spill200004_12;
        break forest_join_162;
    }
    if (!((spill200004_12 > 0))) {
        break forest_join_178;
    }
    forestValue200004_162_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).ae()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue200004_170_0 = forestValue200004_162_0;
        break forest_join_170;
    }
    if (!((forestValue200004_162_0 != 0))) {
        break forest_join_178;
    }
    spill200004_13 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K;
    if (!((life4_5 != null))) {
        forestValue200004_174_0 = spill200004_13;
        break forest_join_174;
    }
    forestValue200004_170_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(spill200004_13)).A) ? 1 : 0);
    }
    if (!((forestValue200004_170_0 != 0))) {
        break forest_join_178;
    }
    forestValue200004_174_0 = ((com.moon.setting.FloatSetting)(this.K)).getValue();
    }
    com.moon.nJ.a__Void(((double)(((double) ((java.lang.Float)(((java.lang.Float)(forestValue200004_174_0)))).floatValue()))));
    }
    forestValue200004_179_0 = this;
    }
    life5_209 = ((com.moon.gD)(((com.moon.gA)(((com.moon.module.impl.ScaffoldWalk)(forestValue200004_179_0)).ag)).a())).b();
    spill200004_14 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    if (!((life4_5 != null))) {
        forestValue200004_230_0 = spill200004_14;
        break forest_join_230;
    }
    if (!((spill200004_14 == com.moon.event.MovePhase.PRE))) {
        break forest_join_227;
    }
    spill200004_15 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.X)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue200004_232_0 = ((spill200004_15) ? 1 : 0);
        break forest_join_232;
    }
    if (!(spill200004_15)) {
        break forest_join_227;
    }
    spill200004_16 = life5_209;
    if (!((life4_5 != null))) {
        forestValue200004_230_0 = spill200004_16;
        break forest_join_230;
    }
    if (!((spill200004_16 != null))) {
        break forest_join_227;
    }
    spill200004_17 = this;
    if (!((life4_5 != null))) {
        forestValue200004_225_0 = spill200004_17;
        break forest_join_225;
    }
    if (!((!((com.moon.module.impl.ScaffoldWalk)(spill200004_17)).aj))) {
        break forest_join_214;
    }
    spill200004_18 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.ScaffoldWalk)(this)).o())).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue200004_232_0 = ((spill200004_18) ? 1 : 0);
        break forest_join_232;
    }
    if (!(spill200004_18)) {
        break forest_join_227;
    }
    }
    ((com.moon.event.MoveEvent)(p0)).a(((float)(((com.moon.n4)(life5_209)).a__Float())));
    ((com.moon.event.MoveEvent)(p0)).b(((float)(((com.moon.n4)(life5_209)).b__Float())));
    forestValue200004_225_0 = this;
    }
    ((com.moon.module.impl.ScaffoldWalk)(forestValue200004_225_0)).aj = ((boolean)(false));
    }
    forestValue200004_230_0 = ((com.moon.setting.BooleanSetting)(this.y)).getValue();
    }
    forestValue200004_232_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(forestValue200004_230_0)))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue200004_263_0 = forestValue200004_232_0;
        break forest_join_263;
    }
    if (!((forestValue200004_232_0 != 0))) {
        break forest_join_256;
    }
    spill200004_19 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.E)).getValue()));
    if (!((life4_5 != null))) {
        forestValue200004_252_0 = spill200004_19;
        break forest_join_252;
    }
    if (!(((java.lang.Boolean)(spill200004_19)).booleanValue())) {
        break forest_join_249;
    }
    spill200004_20 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ScaffoldWalk.d)).K)).ae();
    if (!((life4_5 != null))) {
        forestValue200004_263_0 = ((spill200004_20) ? 1 : 0);
        break forest_join_263;
    }
    if (!((!spill200004_20))) {
        break forest_join_256;
    }
    }
    forestValue200004_252_0 = ((com.moon.setting.ModeSetting)(this.z)).getValue();
    }
    ((com.moon.gK)(((com.moon.bJ)(((com.moon.bJ)(forestValue200004_252_0)))).a())).a(((com.moon.event.MoveEvent)(p0)));
    }
    spill200004_21 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue()));
    if (!((life4_5 != null))) {
        forestValue200004_275_0 = spill200004_21;
        break forest_join_275;
    }
    forestValue200004_263_0 = ((((java.lang.Boolean)(spill200004_21)).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue200004_263_0 != 0))) {
        break forest_join_279;
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(((com.moon.setting.ModeSetting)(this.B)).getValue())))).a())).a(((com.moon.module.impl.ScaffoldWalk)(this)));
    forestValue200004_275_0 = ((com.moon.setting.ModeSetting)(this.B)).getValue();
    }
    ((com.moon.gH)(((com.moon.bI)(((com.moon.bI)(forestValue200004_275_0)))).a())).a(((com.moon.event.MoveEvent)(p0)));
    }
    return;
}


public com.moon.setting.BooleanSetting m() {
return this.X;
}


public com.moon.setting.BooleanSetting o() {
return this.Z;
}


public com.moon.setting.BooleanSetting p() {
return this.aa;
}


public com.moon.setting.BooleanSetting k() {
return this.Q;
}


public boolean g__Boolean() {
return ((((this.am) ? 1 : 0)) != 0);
}


public com.moon.setting.IntegerSetting g() {
return this.ad;
}


public com.moon.setting.BooleanSetting g__kV() {
return this.E;
}


public com.moon.setting.BooleanSetting j() {
return this.J;
}


public com.moon.setting.BooleanSetting q() {
return this.ab;
}


public com.moon.setting.BooleanSetting r() {
return this.ac;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.ScaffoldWalk.cb ^ 114129192526339L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.s)).getValue() == com.moon.bE.BOX) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
java.lang.Object forwardValue921_17_0;
    int forwardValue921_22_0;
    java.lang.Boolean spill921_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 104022063698815L);
    life3_5 = com.moon.bF.b();
    spill921_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue()));
    if (!((life3_5 != null))) {
        forwardValue921_17_0 = spill921_0;
        break forward_join_17;
    }
    if (!(((java.lang.Boolean)(spill921_0)).booleanValue())) {
        break forward_join_21;
    }
    forwardValue921_17_0 = ((com.moon.setting.ModeSetting)(this.B)).getValue();
    }
    if (!((forwardValue921_17_0 == com.moon.bI.HYPIXEL))) {
        break forward_join_21;
    }
    forwardValue921_22_0 = 1;
    break forward_join_22;
    }
    forwardValue921_22_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue921_22_0))));
}


private void lambda$new$3(java.lang.Integer p0, java.lang.Integer p1) {
long local3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 58738239186511L);
    if ((((java.lang.Integer)(p1)).intValue() < ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.M)).getValue())))).intValue())) {
        ((com.moon.setting.IntegerSetting)(this.M)).setValueFromSlider(((float)(((float) (((java.lang.Integer)(p1)).intValue() - ((com.moon.setting.IntegerSetting)(this.M)).getStep())))));
    }
    return;
}


private java.lang.Boolean lambda$new$2() {
java.util.stream.Stream __sourceSpill5_3 = java.util.Arrays.stream(((java.lang.Object[])(com.moon.bH.b)));
    com.moon.setting.MultiSelectSetting __sourceEffectfulDup5_4 = this.L;
    com.moon.setting.MultiSelectSetting __sourceSpill5_6 = __sourceEffectfulDup5_4;
    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup5_4)));
    return java.lang.Boolean.valueOf(((boolean)(((java.util.stream.Stream)(__sourceSpill5_3)).anyMatch(((java.util.function.Predicate)(__sourceIntrinsic_3194c839818b_originalDynamicSite5_7(__sourceSpill5_6)))))));
}


private java.lang.Boolean lambda$new$4() {
java.util.stream.Stream __sourceSpill6_3 = java.util.Arrays.stream(((java.lang.Object[])(com.moon.bH.b)));
    com.moon.setting.MultiSelectSetting __sourceEffectfulDup6_4 = this.L;
    com.moon.setting.MultiSelectSetting __sourceSpill6_6 = __sourceEffectfulDup6_4;
    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup6_4)));
    return java.lang.Boolean.valueOf(((boolean)(((java.util.stream.Stream)(__sourceSpill6_3)).anyMatch(((java.util.function.Predicate)(__sourceIntrinsic_5e615723d6f0_originalDynamicSite6_7(__sourceSpill6_6)))))));
}


private java.lang.Boolean lambda$new$8() {
int forwardValue923_19_0;
    int forwardValue923_23_0;
    int forwardValue923_25_0;
    boolean spill923_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 140524018225015L);
    life3_5 = com.moon.bF.b();
    spill923_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.X)).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue923_19_0 = ((spill923_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill923_0)) {
        break forward_join_24;
    }
    forwardValue923_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.Z)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue923_23_0 = forwardValue923_19_0;
        break forward_join_23;
    }
    if (!((forwardValue923_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue923_23_0 = 1;
    }
    forwardValue923_25_0 = forwardValue923_23_0;
    break forward_join_25;
    }
    forwardValue923_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue923_25_0))));
}


private java.lang.Boolean lambda$new$6() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.L)).isSelected(((java.lang.Enum)(com.moon.bH.DISTANCE))))));
}


private java.lang.Boolean lambda$new$5() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.L)).isSelected(((java.lang.Enum)(com.moon.bH.DELAY))))));
}


private java.lang.Boolean lambda$new$7() {
int forwardValue922_15_0;
    int forwardValue922_17_0;
    int spill922_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (com.moon.module.impl.ScaffoldWalk.cb ^ 98229742661975L);
    life3_5 = com.moon.bF.b();
    spill922_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.S)).getValue())))).intValue();
    if (!((life3_5 != null))) {
        forwardValue922_15_0 = spill922_0;
        break forward_join_15;
    }
    if (!((spill922_0 > 0))) {
        break forward_join_16;
    }
    forwardValue922_15_0 = 1;
    }
    forwardValue922_17_0 = forwardValue922_15_0;
    break forward_join_17;
    }
    forwardValue922_17_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue922_17_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_26(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_61(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_90(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_93(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_102(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_111(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_119(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_124(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_128(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_137(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_142(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_145(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_147(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_152(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_155(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_163(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_168(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_171(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_176(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_179(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_184(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_187(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_195(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_201(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_205(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_211(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_214(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_219(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_222(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_227(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_230(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_242(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_247(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_251(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_262(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_265(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_267(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_269(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_274(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_277(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_279(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_281(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_283(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_288(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_293(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_295(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_300(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_303(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_309(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_314(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_317(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_322(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_325(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_330(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_333(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_335(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_338(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_343(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_346(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_348(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_350(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_352(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_358(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_379(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_381(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_405(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_410(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_415(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_420(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_425(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_430(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_435(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_443(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_466(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_469(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_474(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_477(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_480(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_488(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_493(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_496(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_504(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_509(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_512(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_514(com.moon.module.impl.ScaffoldWalk a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_519(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_522(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_530(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_535(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_538(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_541(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_549(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_554(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_557(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_559(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_561(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_569(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_574(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_578(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_587(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_593(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_595(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_619(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3875ccab62719e41_originalDynamicSite29_624(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_10690d5e99fa_invokedynamic245_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_10690d5e99fa_invokedynamic245_117(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2618_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2620_0() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_3194c839818b_originalDynamicSite5_7(com.moon.setting.MultiSelectSetting a0) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_5e615723d6f0_originalDynamicSite6_7(com.moon.setting.MultiSelectSetting a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
