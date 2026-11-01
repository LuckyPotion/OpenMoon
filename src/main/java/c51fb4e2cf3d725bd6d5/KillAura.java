package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class KillAura extends com.moon.module.Module {

private com.moon.setting.FloatSetting s;

private com.moon.setting.FloatSetting t;

private com.moon.setting.IntegerSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.MultiSelectSetting<com.moon.be> w;

private com.moon.setting.ModeSetting<com.moon.bd> x;

private com.moon.setting.IntegerSetting y;

private com.moon.setting.ModeSetting<com.moon.bc> z;

private com.moon.setting.SettingGroup A;

private com.moon.setting.BooleanSetting B;

private com.moon.setting.BooleanSetting C;

private com.moon.setting.BooleanSetting D;

private com.moon.setting.FloatSetting E;

private com.moon.setting.BooleanSetting F;

private com.moon.setting.BooleanSetting G;

private com.moon.setting.BooleanSetting H;

private com.moon.setting.MultiSelectSetting<com.moon.bb> I;

private com.moon.setting.FloatSetting J;

private com.moon.setting.FloatSetting K;

private com.moon.setting.SettingGroup L;

private com.moon.setting.ModeSetting<com.moon.ba> M;

public com.moon.setting.BooleanSetting N;

public com.moon.setting.BooleanSetting O;

public com.moon.setting.BooleanSetting P;

public com.moon.setting.BooleanSetting Q;

public com.moon.setting.BooleanSetting R;

private com.moon.setting.SettingGroup S;

public com.moon.setting.BooleanSetting T;

public com.moon.setting.BooleanSetting U;

public com.moon.setting.BooleanSetting V;

public com.moon.setting.ModeSetting<com.moon.a9> W;

public com.moon.setting.ModeSetting<com.moon.a_> X;

private com.moon.setting.BooleanSetting Y;

private com.moon.setting.SettingGroup Z;

private com.moon.gd aa;

private com.moon.gc ab;

private com.moon.ga ac;

private com.moon.module.impl.ScaffoldWalk ad;

private boolean ae;

private static long cb;

private static java.lang.String[] kb;

private static java.lang.String[] lb;

private static java.util.Map mb;

private static long[] ob;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

public KillAura(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }

private static void __sourceConstructorBody_ec056532bc9106d3(com.moon.module.impl.KillAura receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {
long local5_life2 = (com.moon.module.impl.KillAura.cb ^ 87975382432731L);
    com.moon.module.impl.KillAura.__sourceConstructorInit_ec056532bc9106d3_0(((com.moon.module.impl.KillAura)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));
    ((com.moon.module.impl.KillAura)(receiver)).s = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_5(14160, (4548461541583853532L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_8(28503, (8628271888743616495L ^ local5_life2)))), ((float)(0x1.8000000000000p+1F)), ((float)(0x1.8000000000000p+1F)), ((float)(0x1.c000000000000p+2F)), ((float)(0x1.99999a0000000p-4F))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_17(29758, (5047539533091591322L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_20(29689, (5412140763817562984L ^ local5_life2)))), ((float)(0x1.8000000000000p+1F)), ((float)(0x1.8000000000000p+1F)), ((float)(0x1.8000000000000p+2F)), ((float)(0x1.99999a0000000p-4F))))).a(((com.moon.kR)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_26(receiver)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).u = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_31(22402, (393827209180772112L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_34(13840, (1213948968012388031L ^ local5_life2)))), ((int)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_36(18247, (2688813693287158070L ^ local5_life2)))), ((int)(1)), ((int)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_38(13492, (4304107869152649921L ^ local5_life2)))), ((int)(1))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_43(28309, (4425431706636340789L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_46(6928, (8994994470337919903L ^ local5_life2)))), ((boolean)(false))))).a()));
    boolean __sourceSpill28_57 = com.moon.bg.c();
    com.moon.module.impl.KillAura __sourceSpill28_58 = receiver;
    com.moon.mi __sourceSpill28_59 = com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_52(8588, (3386202007117332752L ^ local5_life2)))), ((java.lang.Class)(com.moon.be.class)));
    java.lang.String __sourceSpill28_60 = __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_56(14376, (7525319809632639155L ^ local5_life2));
    com.moon.be[] __stackOp28_61_0 = new com.moon.be[1];
    com.moon.be[] __sourceSpill28_63 = __stackOp28_61_0;
    (__stackOp28_61_0)[0] = com.moon.be.PLAYERS;
    ((com.moon.module.impl.KillAura)(__sourceSpill28_58)).w = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(__sourceSpill28_59)).a(((java.lang.String)(__sourceSpill28_60)), ((java.lang.Enum[])(__sourceSpill28_63))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).x = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_68(18415, (2717901244308809584L ^ local5_life2)))), ((java.lang.Class)(com.moon.bd.class))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_72(10244, (4983169621309294773L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bd.SINGLE))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).y = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_78(2737, (1038427798572640802L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_81(27096, (3418366982325717357L ^ local5_life2)))), ((int)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_83(19072, (5639558692960066811L ^ local5_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_85(14257, (79226035920642497L ^ local5_life2)))), ((int)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_87(4623, (1918985618150294651L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_89(receiver)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).z = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_94(6738, (8663852398616525542L ^ local5_life2)))), ((java.lang.Class)(com.moon.bc.class))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_98(883, (8972490034717402069L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bc.FOV))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_101(receiver)))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_108 = receiver;
    com.moon.me __sourceSpill28_109 = com.moon.setting.SettingGroup.a__me();
    java.lang.String __sourceSpill28_110 = __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_107(32419, (6086236785056996878L ^ local5_life2));
    com.moon.setting.Setting[] __stackOp28_111_0 = new com.moon.setting.Setting[4];
    com.moon.setting.Setting[] __sourceSpill28_113 = __stackOp28_111_0;
    (__stackOp28_111_0)[0] = ((com.moon.module.impl.KillAura)(receiver)).w;
    com.moon.setting.Setting[] __stackOp28_114_0 = __sourceSpill28_113;
    com.moon.setting.Setting[] __sourceSpill28_116 = __stackOp28_114_0;
    (__stackOp28_114_0)[1] = ((com.moon.module.impl.KillAura)(receiver)).x;
    com.moon.setting.Setting[] __stackOp28_117_0 = __sourceSpill28_116;
    com.moon.setting.Setting[] __sourceSpill28_119 = __stackOp28_117_0;
    (__stackOp28_117_0)[2] = ((com.moon.module.impl.KillAura)(receiver)).y;
    com.moon.setting.Setting[] __stackOp28_120_0 = __sourceSpill28_119;
    com.moon.setting.Setting[] __sourceSpill28_122 = __stackOp28_120_0;
    (__stackOp28_120_0)[3] = ((com.moon.module.impl.KillAura)(receiver)).z;
    ((com.moon.module.impl.KillAura)(__sourceSpill28_108)).A = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill28_109)).a(((java.lang.String)(__sourceSpill28_110)), ((com.moon.setting.Setting[])(__sourceSpill28_122))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).B = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_127(16630, (8620125265929429100L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_130(26116, (6006916088083662521L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_135(22257, (7563538693654967905L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_138(29446, (8753381727368762244L ^ local5_life2)))), ((boolean)(false))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_149 = receiver;
    com.moon.l_ __sourceSpill28_150 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_143(10830, (6820609506217986800L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_146(4225, (7422021766864089124L ^ local5_life2)))), ((boolean)(false)));
    com.moon.setting.BooleanSetting __stackOp28_151_0 = ((com.moon.module.impl.KillAura)(receiver)).C;
    com.moon.setting.BooleanSetting __sourceSpill28_153 = __stackOp28_151_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp28_151_0)));
    ((com.moon.module.impl.KillAura)(__sourceSpill28_149)).D = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill28_150)).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_154(__sourceSpill28_153)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).E = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_159(19795, (6357449964499037676L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_162(18187, (8310129089380968339L ^ local5_life2)))), ((float)(0x1.6800000000000p+6F)), ((float)(0x1.0p0f)), ((float)(0x1.6800000000000p+7F)), ((float)(0x1.0p0f))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).F = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_169(10795, (5797131379891374743L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_172(18721, (5554306717658507688L ^ local5_life2)))), ((boolean)(false))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).G = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_177(24624, (5969385908581908608L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_180(31350, (4924891694346722027L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).H = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_185(3019, (3363089886079101765L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_188(10571, (5941810243809544677L ^ local5_life2)))), ((boolean)(false))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).I = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_193(1488, (8659125851024991581L ^ local5_life2)))), ((java.lang.Class)(com.moon.bb.class))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_197(27171, (4151593894528109227L ^ local5_life2)))), ((java.lang.Enum[])(new com.moon.bb[0]))))).a()));
    boolean local7_life201 = __sourceSpill28_57;
    ((com.moon.module.impl.KillAura)(receiver)).J = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_203(2718, (3958104416224979492L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_206(13370, (5935961151933486211L ^ local5_life2)))), ((float)(0x1.0000000000000p-1F)), ((float)(0x1.99999a0000000p-5F)), ((float)(0x1.0p1f)), ((float)(0x1.99999a0000000p-5F))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_211(receiver)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).K = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_216(5024, (2035071106409837339L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_219(21804, (2486259891045987752L ^ local5_life2)))), ((float)(0x1.4000000000000p+1F)), ((float)(0x1.99999a0000000p-4F)), ((float)(0x1.9000000000000p+4F)), ((float)(0x1.99999a0000000p-4F))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_225(receiver)))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_234 = receiver;
    com.moon.me __sourceSpill28_235 = com.moon.setting.SettingGroup.a__me();
    java.lang.String __sourceSpill28_236 = __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_231(17044, (5385469057213555203L ^ local5_life2));
    com.moon.setting.Setting[] __stackOp28_237_0 = new com.moon.setting.Setting[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_233(32051, (5519757993074355017L ^ local5_life2))];
    com.moon.setting.Setting[] __sourceSpill28_239 = __stackOp28_237_0;
    (__stackOp28_237_0)[0] = ((com.moon.module.impl.KillAura)(receiver)).B;
    com.moon.setting.Setting[] __stackOp28_240_0 = __sourceSpill28_239;
    com.moon.setting.Setting[] __sourceSpill28_242 = __stackOp28_240_0;
    (__stackOp28_240_0)[1] = ((com.moon.module.impl.KillAura)(receiver)).C;
    com.moon.setting.Setting[] __stackOp28_243_0 = __sourceSpill28_242;
    com.moon.setting.Setting[] __sourceSpill28_245 = __stackOp28_243_0;
    (__stackOp28_243_0)[2] = ((com.moon.module.impl.KillAura)(receiver)).D;
    com.moon.setting.Setting[] __stackOp28_246_0 = __sourceSpill28_245;
    com.moon.setting.Setting[] __sourceSpill28_248 = __stackOp28_246_0;
    (__stackOp28_246_0)[3] = ((com.moon.module.impl.KillAura)(receiver)).E;
    com.moon.setting.Setting[] __stackOp28_249_0 = __sourceSpill28_248;
    com.moon.setting.Setting[] __sourceSpill28_251 = __stackOp28_249_0;
    (__stackOp28_249_0)[4] = ((com.moon.module.impl.KillAura)(receiver)).H;
    com.moon.setting.Setting[] __stackOp28_252_0 = __sourceSpill28_251;
    com.moon.setting.Setting[] __sourceSpill28_254 = __stackOp28_252_0;
    (__stackOp28_252_0)[5] = ((com.moon.module.impl.KillAura)(receiver)).F;
    com.moon.setting.Setting[] __stackOp28_255_0 = __sourceSpill28_254;
    com.moon.setting.Setting[] __sourceSpill28_259 = __stackOp28_255_0;
    (__stackOp28_255_0)[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_257(15368, (800436928500935281L ^ local5_life2))] = ((com.moon.module.impl.KillAura)(receiver)).G;
    com.moon.setting.Setting[] __stackOp28_260_0 = __sourceSpill28_259;
    com.moon.setting.Setting[] __sourceSpill28_264 = __stackOp28_260_0;
    (__stackOp28_260_0)[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_262(9551, (1040547172463817529L ^ local5_life2))] = ((com.moon.module.impl.KillAura)(receiver)).I;
    com.moon.setting.Setting[] __stackOp28_265_0 = __sourceSpill28_264;
    com.moon.setting.Setting[] __sourceSpill28_269 = __stackOp28_265_0;
    (__stackOp28_265_0)[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_267(8997, (579305447609775446L ^ local5_life2))] = ((com.moon.module.impl.KillAura)(receiver)).K;
    com.moon.setting.Setting[] __stackOp28_270_0 = __sourceSpill28_269;
    com.moon.setting.Setting[] __sourceSpill28_274 = __stackOp28_270_0;
    (__stackOp28_270_0)[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_272(21840, (5287618900944700200L ^ local5_life2))] = ((com.moon.module.impl.KillAura)(receiver)).J;
    ((com.moon.module.impl.KillAura)(__sourceSpill28_234)).L = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill28_235)).a(((java.lang.String)(__sourceSpill28_236)), ((com.moon.setting.Setting[])(__sourceSpill28_274))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).M = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_279(31804, (8546908547898367131L ^ local5_life2)))), ((java.lang.Class)(com.moon.ba.class))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_283(5507, (8548816187887138081L ^ local5_life2)))), ((java.lang.Enum)(com.moon.ba.ADVANCED))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).N = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_289(18004, (6191541944809383679L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_292(481, (3832650776677359969L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_294(receiver)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).O = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_299(2543, (9203588677393590606L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_302(16895, (3210793275644764513L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_304(receiver)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).P = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_309(12096, (8815573963121430506L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_312(29118, (4181460064199201083L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).Q = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_317(300, (6619457754721821060L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_320(16147, (725330443207450528L ^ local5_life2)))), ((boolean)(false))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_331 = receiver;
    com.moon.l_ __sourceSpill28_332 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_325(20844, (3612917998770287096L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_328(10277, (6418998214170445961L ^ local5_life2)))), ((boolean)(false)));
    com.moon.setting.BooleanSetting __stackOp28_333_0 = ((com.moon.module.impl.KillAura)(receiver)).Q;
    com.moon.setting.BooleanSetting __sourceSpill28_335 = __stackOp28_333_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp28_333_0)));
    ((com.moon.module.impl.KillAura)(__sourceSpill28_331)).R = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill28_332)).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_336(__sourceSpill28_335)))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_345 = receiver;
    com.moon.me __sourceSpill28_346 = com.moon.setting.SettingGroup.a__me();
    java.lang.String __sourceSpill28_347 = __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_342(6121, (5245343886005450591L ^ local5_life2));
    com.moon.setting.Setting[] __stackOp28_348_0 = new com.moon.setting.Setting[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_344(11239, (104183199287819664L ^ local5_life2))];
    com.moon.setting.Setting[] __sourceSpill28_350 = __stackOp28_348_0;
    (__stackOp28_348_0)[0] = ((com.moon.module.impl.KillAura)(receiver)).M;
    com.moon.setting.Setting[] __stackOp28_351_0 = __sourceSpill28_350;
    com.moon.setting.Setting[] __sourceSpill28_353 = __stackOp28_351_0;
    (__stackOp28_351_0)[1] = ((com.moon.module.impl.KillAura)(receiver)).N;
    com.moon.setting.Setting[] __stackOp28_354_0 = __sourceSpill28_353;
    com.moon.setting.Setting[] __sourceSpill28_356 = __stackOp28_354_0;
    (__stackOp28_354_0)[2] = ((com.moon.module.impl.KillAura)(receiver)).O;
    com.moon.setting.Setting[] __stackOp28_357_0 = __sourceSpill28_356;
    com.moon.setting.Setting[] __sourceSpill28_359 = __stackOp28_357_0;
    (__stackOp28_357_0)[3] = ((com.moon.module.impl.KillAura)(receiver)).P;
    com.moon.setting.Setting[] __stackOp28_360_0 = __sourceSpill28_359;
    com.moon.setting.Setting[] __sourceSpill28_362 = __stackOp28_360_0;
    (__stackOp28_360_0)[4] = ((com.moon.module.impl.KillAura)(receiver)).v;
    com.moon.setting.Setting[] __stackOp28_363_0 = __sourceSpill28_362;
    com.moon.setting.Setting[] __sourceSpill28_365 = __stackOp28_363_0;
    (__stackOp28_363_0)[5] = ((com.moon.module.impl.KillAura)(receiver)).Q;
    com.moon.setting.Setting[] __stackOp28_366_0 = __sourceSpill28_365;
    com.moon.setting.Setting[] __sourceSpill28_370 = __stackOp28_366_0;
    (__stackOp28_366_0)[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_368(8383, (6879727960249448141L ^ local5_life2))] = ((com.moon.module.impl.KillAura)(receiver)).R;
    ((com.moon.module.impl.KillAura)(__sourceSpill28_345)).S = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill28_346)).a(((java.lang.String)(__sourceSpill28_347)), ((com.moon.setting.Setting[])(__sourceSpill28_370))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).T = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_375(13864, (6041143354591286953L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_378(21702, (5834849578590368844L ^ local5_life2)))), ((boolean)(false))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_389 = receiver;
    com.moon.l_ __sourceSpill28_390 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_383(17345, (702583264159654743L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_386(3837, (8579028469333798500L ^ local5_life2)))), ((boolean)(false)));
    com.moon.setting.BooleanSetting __stackOp28_391_0 = ((com.moon.module.impl.KillAura)(receiver)).T;
    com.moon.setting.BooleanSetting __sourceSpill28_393 = __stackOp28_391_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp28_391_0)));
    ((com.moon.module.impl.KillAura)(__sourceSpill28_389)).U = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill28_390)).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_394(__sourceSpill28_393)))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_405 = receiver;
    com.moon.l_ __sourceSpill28_406 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_399(11973, (339817047018901094L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_402(20580, (2572041835267649763L ^ local5_life2)))), ((boolean)(true)));
    com.moon.setting.BooleanSetting __stackOp28_407_0 = ((com.moon.module.impl.KillAura)(receiver)).T;
    com.moon.setting.BooleanSetting __sourceSpill28_409 = __stackOp28_407_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp28_407_0)));
    ((com.moon.module.impl.KillAura)(__sourceSpill28_405)).V = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill28_406)).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_410(__sourceSpill28_409)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).W = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_415(9063, (6669684409674761168L ^ local5_life2)))), ((java.lang.Class)(com.moon.a9.class))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_419(24711, (2040675498126950446L ^ local5_life2)))), ((java.lang.Enum)(com.moon.a9.POST))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_422(receiver)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).X = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_427(6200, (8629038158161885322L ^ local5_life2)))), ((java.lang.Class)(com.moon.a_.class))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_431(16317, (7489751338732035880L ^ local5_life2)))), ((java.lang.Enum)(com.moon.a_.HURT_TIME))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_434(receiver)))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).Y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_439(2636, (1614045187848350407L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_442(13732, (8175417223965775138L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_444(receiver)))))).a()));
    com.moon.module.impl.KillAura __sourceSpill28_453 = receiver;
    com.moon.me __sourceSpill28_454 = com.moon.setting.SettingGroup.a__me();
    java.lang.String __sourceSpill28_455 = __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_450(28762, (4429265886131704025L ^ local5_life2));
    com.moon.setting.Setting[] __stackOp28_456_0 = new com.moon.setting.Setting[__sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_452(8383, (6879727960249448141L ^ local5_life2))];
    com.moon.setting.Setting[] __sourceSpill28_458 = __stackOp28_456_0;
    (__stackOp28_456_0)[0] = ((com.moon.module.impl.KillAura)(receiver)).T;
    com.moon.setting.Setting[] __stackOp28_459_0 = __sourceSpill28_458;
    com.moon.setting.Setting[] __sourceSpill28_461 = __stackOp28_459_0;
    (__stackOp28_459_0)[1] = ((com.moon.module.impl.KillAura)(receiver)).U;
    com.moon.setting.Setting[] __stackOp28_462_0 = __sourceSpill28_461;
    com.moon.setting.Setting[] __sourceSpill28_464 = __stackOp28_462_0;
    (__stackOp28_462_0)[2] = ((com.moon.module.impl.KillAura)(receiver)).V;
    com.moon.setting.Setting[] __stackOp28_465_0 = __sourceSpill28_464;
    com.moon.setting.Setting[] __sourceSpill28_467 = __stackOp28_465_0;
    (__stackOp28_465_0)[3] = ((com.moon.module.impl.KillAura)(receiver)).W;
    com.moon.setting.Setting[] __stackOp28_468_0 = __sourceSpill28_467;
    com.moon.setting.Setting[] __sourceSpill28_470 = __stackOp28_468_0;
    (__stackOp28_468_0)[4] = ((com.moon.module.impl.KillAura)(receiver)).X;
    com.moon.setting.Setting[] __stackOp28_471_0 = __sourceSpill28_470;
    com.moon.setting.Setting[] __sourceSpill28_473 = __stackOp28_471_0;
    (__stackOp28_471_0)[5] = ((com.moon.module.impl.KillAura)(receiver)).Y;
    ((com.moon.module.impl.KillAura)(__sourceSpill28_453)).Z = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill28_454)).a(((java.lang.String)(__sourceSpill28_455)), ((com.moon.setting.Setting[])(__sourceSpill28_473))))).a()));
    ((com.moon.module.impl.KillAura)(receiver)).aa = ((com.moon.gd)(new com.moon.gd(receiver)));
    ((com.moon.module.impl.KillAura)(receiver)).ab = ((com.moon.gc)(new com.moon.gc(receiver)));
    ((com.moon.module.impl.KillAura)(receiver)).ac = ((com.moon.ga)(new com.moon.ga(receiver)));
    if ((!local7_life201)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(6412046416130590150L)), ((long)(2625202139101655221L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(110833929866703L)))));
    mb = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.KillAura.cb ^ 19600249102559L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill279_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill279_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill279_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill279_14 = new byte[8];
    (__sourceSpill279_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill279_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation279_16 = __sourceSpill279_14;
    ((javax.crypto.Cipher)(__sourceSpill279_11)).init(((int)(__sourceSpill279_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill279_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation279_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[64];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Å¨\024ÎP\033\036ö\016¢{]9D¥òBÔí_~\032³T\\i#DäRþügDÞ;h\030\036GýõÜ\007yvv'÷í*\0179 Ü/F_VR\020KW¥NÀ\032 \013\032áPxJJ\030g¥âìÖßÐÿq#dõ*;¾À\024HJ HãÍñWÆRÈ^å¶*¨7YSÎìqÿ@#Mï|ûZÑ¼\030\007tç\037Uú\\õ\005MÔðe°?`ïñ(Â5\\xÔ²Õû,õÍ·>­\177òrÉfÈáX0TÒ#uï\027Ã¹ä@(KÝNd1yë\byò\fô^÷î\002\003hFöÚ@þæ~!á\\\036¤°aÛCkt\030V\000Í\r\023¤gû\f\006°òÝ\0329/]¿çé\035p(ÏÙõl3\fEdÉ¾²EAâÊ\177ò¡S\021ÑO\023Á-s0îß\\ð\023ª\005Â\020³\023ò#Û~:Îu|©¬.ë\020W»GY[Ë\023ÿ<£\013#lã\020½Í\020æÿR¢e½%*Ê(FX @)ùÃÝM¯ißyX`rþá<ßã\013&(°îsS\"çµkàö0f©+Æ,ï÷ÀP*\0369àÀÞRbó¯Øjõ\024W)\007û%ÔCûCQM\026Ç~|Ü\027+ IT+b\177\rw\004¸q·l<Ñ¶ [CÛcÔ;¼8Â\003,3Ã À.3ÞÚ4)¿\fÁdÈRñ îÈ:CÂ~6äÇ­0Ì?\fv\030°¤àØ_¨u\013ù]\036þd>+ÙÓèÇDÎï\f(¥ª*²\035^Ñø\020d|Q\n\f6ï\025ÐWFé\022\020gLIR¡½=[MX\030ùKb Í6=~¬C)m\007ø?Õ²\0131@\020«OZV\0338í­Ø¹?\006(\017ìWPî{èÀ§Ô¹ÄÊhÖ\nBZÃwåN1Ùoècè©dëÊ0&%]á3\033\001rÑ\033<å\013\fÑ\013\031B¥JªÄ\033÷z]ç\003a\177¾Im8ÝìÅ«w÷ÎÉ#(1¬\030Ù<d:\r@\"ýÓÏVc&ºm¾ùàjF·øÏ:^ÝÏIÑ´~gú(0ô-æ®\f³Hµ=VnÁÆ ´ÆJ\036ÛÌì5 DâèFÝ<ö¹îÒË\001(×#£¶\bR\026n\\\002\017$Ê\027¿}Jqë {9sõ8¼ù¼Þ*ú\003\\?XÊ(u;-Z\\YEªc9­al$\r:ñ¥µgþMþ²n:8ñ»èYÓ\030\025>r8ÁôÄ#ØRa×ßzâå\020¾£ßz(Ouc/\022\031­jÆ\027èÂØG!ÿ\021¢¼:Õí¹\f\036sK8ø¦ª&ly¿D þÜ(WÃD\003°.\017ÿ99f\027ñ7?EW'÷³ÞåDî(u0,ËBnÊ-\"ÅK'§B©¬t\035Ç\"DLhEðê\030\021»\006\024õEã(\023«!ê[ó\030Ç`nå\007.§\031·zÔÔ¥¤^\021bYçéÈ©;@û?\0160þÏ\024p\0257¾ #\025a,Í?ë%À&f©\034L\000G´¸\026¥!ýPþ;eÁ\031|`)#T1&K(áp9\020\032dÜÿà\fuû¨Ñ5àîg\003&²ÑþÌùq,/ÂóÆcóþ\030ÍÞ\034Ú¢[LE¥­ûW«\0344¦èóÄ[Ø(<h½þÐ\022Z7Ï3bb¼ÓMîGPà 5ónU|!\001\007\004ä÷ Ëv]&4·\031- \026¨v¥ýXmø¡Ö@o·\023ÊP\006 ÌtdÒ\0348e/¶F:Ã\025Â¯Ù|ù\017zR1Î@\f[\0360 ¶m\\m'R¶;µ-®\f6\006zy³XÒ`k².kB\tèÓ®õ\030\n$ô*ªÓû&*ï¤\026ØuÊ\020×³~¦ êP\022²Â¡Á¶½\013ãC\035ûé¹[ä\026¿l\tþ\nôí\025T ròO¯1Û¹\002k\031¢P;¼(\020\017Ûr#\177Å@¥\033%² \017Ê!MíØó\005¤Çf_¹J\030Ã¹+kqû-R\035Ñïwä .<E¦é[D~£{ó}ÚÚ\002MP\bØÔma»\035ÐrÑ(X^¥¢sOea5ïª;}L\"\\\007Þù\016ðc\026ÎE13\177©· mî0\\(ìªuE¤b\000§qÀxù\027!\177r\037¦`íó²k©dÎ\023X>N]¸\002\020©ßT\013ë3íd\002\026\022&\030;(»+Q¡¨æhÅ3OÃçy\032fÒÑfÂ&TS\021¥©}8Ï´B6ø»ÜàÖ ¥¢2oVd_÷\037}´\nû±\017Ñ6>*K\022?êiê\\I\032\001(NÏ\007\001ç\006{}±Y]Ïà\017ÐîAÎÿ¬'Ó4¾iê\002\007¨8^W<0q2Â©øÁ÷=\034ô1\032ôûo{#\032\n@§ê\rI\tká±{l&Eda)¨éäØ\030÷Fr'öß\024¸º÷K&JÊÉIÿ¤QdöÃ0UZc&ÒÆÂý¬B\036ÁØ%E\027,Ý\007\f²Ä\022{Þ\013át#Ó-½n >¶hÃS]CÀ\034\020ùTqÒíe\037j\034.þO(¦õùW¸ÌÖTzç\000·94Nú{hJè©Ð\026*GD2¢9Ö°Ýº#ã\030¹¨£\177Sß³r¤mø\007%¥\035£b Z<çó¡¹õ)ÙBd/ü@¶,cÁh x\177_Eè¹W6- ­¿G\031¶ªÀe´è\017\001ÀM$xeWFÀ:zç/ÉÔ&\027¶ð ÛÔc¬K\035©é^Â\ff\036Ðw¡\001Ïâä\007I<o\021\002Ieif(N¥zD#\rëp6îÐ\177U±ýMAÆ¥?ür~âÖ\027\026ÃÀ\">§sø\0201yO~k\033ö\032\0255úY¼ÆÝ\030û \bäDò\022®1Æ73xÊ=|¯\035I\030p¶L#ÑèË±½\021ûKMüÒ\030ZS3Ò¯X"))).length();
    int local16_life24 = 40;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill279_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill279_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill279_29)).doFinal(((byte[])(__sourceSpill279_28)));
        java.lang.String __sourceSpill279_34 = ((java.lang.String)(com.moon.module.impl.KillAura.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill279_35 = local20_life19;
        int __sourceSpill279_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill279_35)[__sourceSpill279_36] = __sourceSpill279_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "c¼<b.ÖµiÀ,KÂèÌÞµ\007ñÊ\032P7qEÃg\000n6vÓ×ÜlG)\020\031P;NúÑº±æ]>P(¯"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill279_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill279_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill279_42)).doFinal(((byte[])(__sourceSpill279_41)));
        java.lang.String __sourceSpill279_47 = ((java.lang.String)(com.moon.module.impl.KillAura.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill279_48 = local20_life19;
        int __sourceSpill279_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill279_48)[__sourceSpill279_49] = __sourceSpill279_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    kb = ((java.lang.String[])(local20_life19));
    lb = ((java.lang.String[])(new java.lang.String[64]));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill279_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill279_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill279_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill279_60 = new byte[8];
    (__sourceSpill279_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill279_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation279_62 = __sourceSpill279_60;
    ((javax.crypto.Cipher)(__sourceSpill279_57)).init(((int)(__sourceSpill279_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill279_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation279_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[12];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "sÌ[ÜïX¨-À¹©v \022}çP*°UÜ\000Å\004¦[O0\021¯`¢O¦11Ëjù^)­};ÐUbQSªÜX!Î\bv§6Ãà\037PVø\030=ÖÝÔ"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill279_71 = local4_life67;
        int __sourceSpill279_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill279_71)).substring(((int)(__sourceSpill279_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill279_76 = local6_life65;
        int __sourceSpill279_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill279_79 = new byte[8];
        (__sourceSpill279_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill279_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill279_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill279_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill279_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill279_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill279_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill279_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill279_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill279_80)).doFinal(((byte[])(__sourceSpill279_79)));
        (__sourceSpill279_76)[__sourceSpill279_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "Ð*Ü\0176âxF\035q\022{ð\n"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill279_84 = local4_life67;
        int __sourceSpill279_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill279_84)).substring(((int)(__sourceSpill279_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill279_89 = local6_life65;
        int __sourceSpill279_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill279_92 = new byte[8];
        (__sourceSpill279_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill279_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill279_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill279_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill279_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill279_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill279_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill279_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill279_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill279_93)).doFinal(((byte[])(__sourceSpill279_92)));
        (__sourceSpill279_89)[__sourceSpill279_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    ob = ((long[])(local6_life65));
    pb = ((java.lang.Integer[])(new java.lang.Integer[12]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ec056532bc9106d3_0(com.moon.module.impl.KillAura a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public com.moon.setting.BooleanSetting i() {
return this.O;
}


public com.moon.setting.ModeSetting<com.moon.bc> b__kY() {
return this.z;
}


public com.moon.setting.IntegerSetting b__k1() {
return this.y;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.t;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.B;
}


public com.moon.setting.MultiSelectSetting<com.moon.bb> b__k4() {
return this.I;
}


public com.moon.setting.SettingGroup b() {
return this.L;
}


public boolean e__Boolean() {
return ((((this.ae) ? 1 : 0)) != 0);
}


public com.moon.setting.BooleanSetting e() {
return this.F;
}


public com.moon.setting.ModeSetting<com.moon.a_> e__kY() {
return this.X;
}


public com.moon.setting.FloatSetting e__kZ() {
return this.K;
}


public void c__Void() {
com.moon.module.impl.KillAura forwardValue875_21_0;
    com.moon.module.impl.KillAura spill875_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_14: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 84948358250998L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill875_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue875_21_0 = spill875_0;
        break forward_join_21;
    }
    if (!(((com.moon.module.impl.KillAura)(spill875_0)).c__Boolean())) {
        break forward_join_14;
    }
    ((com.moon.f0)(((com.moon.module.impl.KillAura)(this)).a())).a__Void();
    }
    ((com.moon.gc)(this.ab)).a__Void();
    ((com.moon.gd)(this.aa)).a__Void();
    forwardValue875_21_0 = this;
    }
    __sourceIntrinsic_7ac46ee229a8_call875_10(forwardValue875_21_0);
    return;
}


public com.moon.setting.BooleanSetting c__kV() {
return this.C;
}


public com.moon.setting.SettingGroup c() {
return this.S;
}


public com.moon.setting.FloatSetting c__kZ() {
return this.E;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14436);
    if (((com.moon.module.impl.KillAura.lb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.KillAura.mb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.KillAura.mb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lb", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.KillAura.kb)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.KillAura.lb)[life5_8] = com.moon.module.impl.KillAura.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.KillAura.lb)[life5_8];
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.T)).getValue())))).booleanValue())) != 0);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2531_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.KillAura.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.setting.ModeSetting<com.moon.ba> c__kY() {
return this.M;
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
        byte[] spill1137_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1137_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1137_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1137_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1137_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1137_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.setting.BooleanSetting n() {
return this.U;
}


public com.moon.setting.BooleanSetting h() {
return this.N;
}


private void f__Void() {
com.moon.module.impl.KillAura forwardValue877_12_0;
    com.moon.module.impl.KillAura spill877_0;
    long life1_3;
    int life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 140337670403309L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill877_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue877_12_0 = spill877_0;
        break forward_join_12;
    }
    if (!((((com.moon.module.impl.KillAura)(spill877_0)).ad == null))) {
        break forward_join_18;
    }
    forwardValue877_12_0 = this;
    }
    ((com.moon.module.impl.KillAura)(forwardValue877_12_0)).ad = ((com.moon.module.impl.ScaffoldWalk)(((com.moon.module.impl.ScaffoldWalk)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ScaffoldWalk.class)))))));
    }
    return;
}


public com.moon.setting.BooleanSetting f() {
return this.G;
}


public com.moon.setting.BooleanSetting l() {
return this.R;
}


public com.moon.setting.BooleanSetting d__kV() {
return this.D;
}


public com.moon.setting.FloatSetting d__kZ() {
return this.J;
}


public void d__Void() {
com.moon.module.impl.KillAura forwardValue876_21_0;
    com.moon.module.impl.KillAura spill876_0;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_14: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 120788234523961L);
    life3_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill876_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue876_21_0 = spill876_0;
        break forward_join_21;
    }
    if (!(((com.moon.module.impl.KillAura)(spill876_0)).c__Boolean())) {
        break forward_join_14;
    }
    ((com.moon.f0)(((com.moon.module.impl.KillAura)(this)).a())).b();
    }
    ((com.moon.gc)(this.ab)).b__Void();
    ((com.moon.gd)(this.aa)).b();
    forwardValue876_21_0 = this;
    }
    __sourceIntrinsic_a91ecd6db48f_call876_10(forwardValue876_21_0);
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2535_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lb"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.KillAura.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3719;
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
            throw new RuntimeException("com/moon/lb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private boolean d__Boolean() {
com.moon.dL local1 = new com.moon.dL();
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(local1)));
    return ((com.moon.dL)(local1)).isCancelled();
}


public com.moon.setting.SettingGroup d() {
return this.Z;
}


public com.moon.setting.ModeSetting<com.moon.a9> d__kY() {
return this.W;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue871_21_0;
    int forwardValue871_31_0;
    int forwardValue871_63_0;
    com.moon.module.impl.KillAura forwardValue871_65_0;
    boolean spill871_0;
    boolean spill871_1;
    com.moon.module.impl.KillAura spill871_2;
    long life2_3;
    int life4_5;
    org.lwjgl.util.vector.Vector2f life5_51;
    forward_join_67: {
    forward_join_65: {
    forward_join_63: {
    forward_join_58: {
    forward_join_31: {
    forward_join_28: {
    forward_join_21: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 26919848456370L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill871_0 = ((com.moon.module.impl.KillAura)(this)).d__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue871_21_0 = ((spill871_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!(spill871_0)) {
        break forward_join_12;
    }
    return;
    }
    ((com.moon.module.impl.KillAura)(this)).setSuffix(((java.lang.String)(((com.moon.bd)(((com.moon.bd)(((com.moon.setting.ModeSetting)(this.x)).getValue())))).a)));
    forwardValue871_21_0 = ((((com.moon.module.impl.KillAura)(this)).c__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue871_31_0 = forwardValue871_21_0;
        break forward_join_31;
    }
    if (!((forwardValue871_21_0 != 0))) {
        break forward_join_28;
    }
    ((com.moon.f0)(((com.moon.module.impl.KillAura)(this)).a())).a(((com.moon.event.MoveEvent)(p0)));
    }
    forwardValue871_31_0 = ((((com.moon.gc)(this.ab)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue871_31_0 != 0))) {
        break forward_join_67;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_67;
    }
    life5_51 = ((com.moon.gc)(this.ab)).b();
    spill871_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.B)).getValue())))).booleanValue();
    if (!((life4_5 != 0))) {
        forwardValue871_63_0 = ((spill871_1) ? 1 : 0);
        break forward_join_63;
    }
    if (!(spill871_1)) {
        break forward_join_58;
    }
    ((com.moon.event.MoveEvent)(p0)).a(((float)(((org.lwjgl.util.vector.Vector2f)(life5_51)).getX())));
    ((com.moon.event.MoveEvent)(p0)).b(((float)(((org.lwjgl.util.vector.Vector2f)(life5_51)).getY())));
    }
    spill871_2 = this;
    if (!((life4_5 != 0))) {
        forwardValue871_65_0 = spill871_2;
        break forward_join_65;
    }
    forwardValue871_63_0 = ((((com.moon.gd)(((com.moon.module.impl.KillAura)(spill871_2)).aa)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue871_63_0 != 0))) {
        break forward_join_67;
    }
    forwardValue871_65_0 = this;
    }
    ((com.moon.ga)(((com.moon.module.impl.KillAura)(forwardValue871_65_0)).ac)).a__Void();
    }
    return;
}


public com.moon.gd a__gd() {
return this.aa;
}


public com.moon.gc a__gc() {
return this.ab;
}


public com.moon.ga a__ga() {
return this.ac;
}


public com.moon.module.impl.ScaffoldWalk a__lK() {
return this.ad;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.ew p0) {
int forwardValue874_15_0;
    int forwardValue874_23_0;
    boolean spill874_0;
    long life2_3;
    int life4_5;
    forward_join_31: {
    forward_join_23: {
    forward_join_15: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 83284779264521L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill874_0 = ((com.moon.module.impl.KillAura)(this)).d__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue874_15_0 = ((spill874_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill874_0)) {
        break forward_join_12;
    }
    return;
    }
    forwardValue874_15_0 = ((((com.moon.gc)(this.ab)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue874_23_0 = forwardValue874_15_0;
        break forward_join_23;
    }
    if (!((forwardValue874_15_0 != 0))) {
        break forward_join_31;
    }
    forwardValue874_23_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.C)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue874_23_0 != 0))) {
        break forward_join_31;
    }
    ((com.moon.ew)(p0)).a(((float)(((org.lwjgl.util.vector.Vector2f)(((com.moon.gc)(this.ab)).b())).getX())));
    }
    return;
}


public void a(com.moon.eA p0) {
int forwardValue866_17_0;
    com.moon.gc forwardValue866_20_0;
    boolean spill866_0;
    com.moon.gc spill866_1;
    long life2_3;
    int life4_5;
    org.lwjgl.util.vector.Vector2f life5_30;
    forward_join_32: {
    forward_join_20: {
    forward_join_17: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 109093327596062L);
    life4_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill866_0 = ((com.moon.module.impl.KillAura)(this)).d__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue866_17_0 = ((spill866_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill866_0)) {
        break forward_join_12;
    }
    return;
    }
    spill866_1 = this.ab;
    if (!((life4_5 == 0))) {
        forwardValue866_20_0 = spill866_1;
        break forward_join_20;
    }
    forwardValue866_17_0 = ((((com.moon.gc)(spill866_1)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue866_17_0 != 0))) {
        break forward_join_32;
    }
    forwardValue866_20_0 = this.ab;
    }
    life5_30 = ((com.moon.gc)(forwardValue866_20_0)).b();
    ((com.moon.eA)(p0)).a(((float)(((org.lwjgl.util.vector.Vector2f)(life5_30)).getX())));
    ((com.moon.eA)(p0)).b(((float)(((org.lwjgl.util.vector.Vector2f)(life5_30)).getY())));
    }
    return;
}


public com.moon.setting.IntegerSetting a__k1() {
return this.u;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.v;
}


public com.moon.setting.MultiSelectSetting<com.moon.be> a__k4() {
return this.w;
}


public void a(com.moon.event.PacketEvent p0) {
int forwardValue872_16_0;
    com.moon.module.impl.KillAura forwardValue872_18_0;
    boolean spill872_0;
    com.moon.module.impl.KillAura spill872_1;
    long life2_3;
    int life4_5;
    forward_join_21: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 75689573147823L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill872_0 = ((com.moon.module.impl.KillAura)(this)).d__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue872_16_0 = ((spill872_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill872_0)) {
        break forward_join_12;
    }
    return;
    }
    spill872_1 = this;
    if (!((life4_5 != 0))) {
        forwardValue872_18_0 = spill872_1;
        break forward_join_18;
    }
    forwardValue872_16_0 = ((((com.moon.module.impl.KillAura)(spill872_1)).c__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue872_16_0 != 0))) {
        break forward_join_21;
    }
    forwardValue872_18_0 = this;
    }
    ((com.moon.f0)(((com.moon.module.impl.KillAura)(forwardValue872_18_0)).a())).a(((com.moon.event.PacketEvent)(p0)));
    }
    return;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.s;
}


public com.moon.f0 a() {
java.lang.Object forwardValue864_23_0;
    com.moon.f0 forwardValue864_25_0;
    java.lang.Boolean spill864_0;
    long life1_3;
    int life3_5;
    com.moon.f0 life4_30;
    forward_join_25: {
    forward_join_23: {
    forward_join_20: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 82994737138811L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill864_0 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.U)).getValue()));
    if (!((life3_5 == 0))) {
        forwardValue864_23_0 = spill864_0;
        break forward_join_23;
    }
    if (!(((java.lang.Boolean)(spill864_0)).booleanValue())) {
        break forward_join_20;
    }
    forwardValue864_25_0 = ((com.moon.a_)(((com.moon.a_)(((com.moon.setting.ModeSetting)(this.X)).getValue())))).a();
    break forward_join_25;
    }
    forwardValue864_23_0 = ((com.moon.setting.ModeSetting)(this.W)).getValue();
    }
    forwardValue864_25_0 = ((com.moon.a9)(((com.moon.a9)(forwardValue864_23_0)))).a();
    }
    life4_30 = forwardValue864_25_0;
    ((com.moon.f0)(life4_30)).a(((com.moon.module.impl.KillAura)(this)));
    return life4_30;
}


public void a(com.moon.dP p0) {
int forwardValue865_17_0;
    boolean spill865_0;
    long life2_3;
    int life4_5;
    forward_join_22: {
    forward_join_17: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 37406182055419L);
    life4_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill865_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.R)).getValue())))).booleanValue();
    if (!((life4_5 == 0))) {
        forwardValue865_17_0 = ((spill865_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill865_0)) {
        break forward_join_22;
    }
    forwardValue865_17_0 = ((((com.moon.gd)(this.aa)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue865_17_0 != 0))) {
        break forward_join_22;
    }
    ((com.moon.dP)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.eD p0) {
long local2 = (com.moon.module.impl.KillAura.cb ^ 21473646740114L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.Q)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.eD)(p0)).a(((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.t)).getValue())))).floatValue()))));
    }
    return;
}


public void a(com.moon.eL p0) {
int forwardValue869_14_0;
    net.minecraft.item.ItemStack forwardValue869_24_0;
    int forwardValue869_32_0;
    boolean spill869_0;
    net.minecraft.item.ItemStack spill869_1;
    int spill869_2;
    long life2_3;
    int life4_5;
    forward_join_37: {
    forward_join_32: {
    forward_join_24: {
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 94658908166913L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill869_0 = ((com.moon.module.impl.KillAura)(this)).d__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue869_14_0 = ((spill869_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill869_0)) {
        break forward_join_12;
    }
    return;
    }
    forwardValue869_14_0 = ((((com.moon.module.impl.KillAura)(this)).c__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue869_14_0 != 0))) {
        break forward_join_37;
    }
    spill869_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.KillAura.d)).K)).a__xW();
    if (!((life4_5 != 0))) {
        forwardValue869_24_0 = spill869_1;
        break forward_join_24;
    }
    if (!((spill869_1 != null))) {
        break forward_join_37;
    }
    forwardValue869_24_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.KillAura.d)).K)).a__xW();
    }
    spill869_2 = ((((net.minecraft.item.ItemStack)(forwardValue869_24_0)).a__wQ() instanceof moom.xP) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue869_32_0 = spill869_2;
        break forward_join_32;
    }
    if (!((spill869_2 != 0))) {
        break forward_join_37;
    }
    forwardValue869_32_0 = ((((com.moon.gd)(this.aa)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue869_32_0 != 0))) {
        break forward_join_37;
    }
    ((com.moon.eL)(p0)).a(((boolean)(true)));
    }
    return;
}


public void a(com.moon.eF p0) {
int forwardValue868_15_0;
    int forwardValue868_23_0;
    int forwardValue868_54_0;
    float forwardValue868_59_0;
    float forwardValue868_59_1;
    int forwardValue868_90_0;
    boolean spill868_0;
    boolean spill868_1;
    float spill868_2;
    float spill868_3;
    boolean spill868_4;
    boolean spill868_5;
    long life2_3;
    int life4_5;
    float life5_44;
    float life6_49;
    float[] life7_81;
    float life8_83;
    com.moon.event.ActionEvent life9_97;
    com.moon.event.ActionEvent life9_122;
    forward_join_135: {
    forward_join_131: {
    forward_join_129: {
    forward_join_109: {
    forward_join_90: {
    forward_join_87: {
    forward_join_59: {
    forward_join_54: {
    forward_join_23: {
    forward_join_15: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 30972861769658L);
    life4_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill868_0 = ((com.moon.module.impl.KillAura)(this)).d__Boolean();
    if (!((life4_5 == 0))) {
        forwardValue868_15_0 = ((spill868_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!(spill868_0)) {
        break forward_join_12;
    }
    return;
    }
    forwardValue868_15_0 = ((((com.moon.gc)(this.ab)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue868_23_0 = forwardValue868_15_0;
        break forward_join_23;
    }
    if (!((forwardValue868_15_0 != 0))) {
        break forward_join_135;
    }
    forwardValue868_23_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.C)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue868_23_0 != 0))) {
        break forward_join_135;
    }
    life5_44 = ((((com.moon.eF)(p0)).b__sourceReturn_bc607678b6() * ((com.moon.eF)(p0)).b__sourceReturn_bc607678b6()) + (((com.moon.eF)(p0)).c() * ((com.moon.eF)(p0)).c()));
    life6_49 = ((org.lwjgl.util.vector.Vector2f)(((com.moon.gc)(this.ab)).b())).getX();
    spill868_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.D)).getValue())))).booleanValue();
    if (!((life4_5 == 0))) {
        forwardValue868_54_0 = ((spill868_1) ? 1 : 0);
        break forward_join_54;
    }
    if (!(spill868_1)) {
        break forward_join_131;
    }
    spill868_2 = life5_44;
    spill868_3 = 0x1.0c6f7ap-20f;
    if (!((life4_5 == 0))) {
        forwardValue868_59_0 = spill868_2;
        forwardValue868_59_1 = spill868_3;
        break forward_join_59;
    }
    forwardValue868_54_0 = recovery.source.CarrierOps.fcmpl(((float)(spill868_2)), ((float)(spill868_3)));
    }
    if (!((forwardValue868_54_0 > 0))) {
        break forward_join_135;
    }
    forwardValue868_59_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.KillAura.d)).K)).w;
    forwardValue868_59_1 = life6_49;
    }
    life7_81 = com.moon.nE.a(((float)(forwardValue868_59_0)), ((float)(forwardValue868_59_1)));
    life8_83 = 0x1.f5c29p-1f;
    spill868_4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.KillAura.d)).K)).M();
    if (!((life4_5 == 0))) {
        forwardValue868_90_0 = ((spill868_4) ? 1 : 0);
        break forward_join_90;
    }
    if (!(spill868_4)) {
        break forward_join_87;
    }
    life9_97 = new com.moon.event.ActionEvent(com.moon.event.ActionType.ITEM);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life9_97)));
    spill868_5 = ((com.moon.event.ActionEvent)(life9_97)).isCancelled();
    if (!((life4_5 == 0))) {
        forwardValue868_90_0 = ((spill868_5) ? 1 : 0);
        break forward_join_90;
    }
    if (!((!spill868_5))) {
        break forward_join_87;
    }
    life8_83 = (life8_83 * 0x1.99999ap-3f);
    }
    forwardValue868_90_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.KillAura.d)).K)).t__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue868_90_0 != 0))) {
        break forward_join_109;
    }
    life9_122 = new com.moon.event.ActionEvent(com.moon.event.ActionType.SNEAKING);
    ((com.moon.events.EventBus)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus())).publish(((java.lang.Object)(life9_122)));
    if (!((life4_5 == 0))) {
        break forward_join_129;
    }
    if (!((!((com.moon.event.ActionEvent)(life9_122)).isCancelled()))) {
        break forward_join_109;
    }
    life8_83 = (life8_83 * 0x1.333334p-2f);
    }
    ((com.moon.eF)(p0)).a(((float)(life6_49)));
    ((com.moon.eF)(p0)).b(((float)(((life7_81)[0] * life8_83))));
    ((com.moon.eF)(p0)).c(((float)(((life7_81)[1] * life8_83))));
    }
    if (!((life4_5 != 0))) {
        break forward_join_135;
    }
    }
    ((com.moon.eF)(p0)).a(((float)(life6_49)));
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.Minecraft forwardValue873_24_0;
    com.moon.module.impl.KillAura forwardValue873_37_0;
    boolean spill873_0;
    net.minecraft.client.Minecraft spill873_1;
    com.moon.module.impl.KillAura spill873_2;
    long life2_3;
    int life4_13;
    forward_join_37: {
    forward_join_33: {
    forward_join_27: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 54224042769816L);
    spill873_0 = com.moon.bg.b();
    ((com.moon.setting.FloatSetting)(this.s)).setDragMin(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.t)).getValue())))).floatValue())));
    life4_13 = ((spill873_0) ? 1 : 0);
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forward_join_26;
    }
    spill873_1 = com.moon.module.impl.KillAura.d;
    if (!((life4_13 == 0))) {
        forwardValue873_24_0 = spill873_1;
        break forward_join_24;
    }
    if (!((((net.minecraft.client.Minecraft)(spill873_1)).K != null))) {
        break forward_join_26;
    }
    forwardValue873_24_0 = com.moon.module.impl.KillAura.d;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue873_24_0)).I == null))) {
        break forward_join_27;
    }
    }
    return;
    }
    spill873_2 = this;
    if (!((life4_13 == 0))) {
        forwardValue873_37_0 = spill873_2;
        break forward_join_37;
    }
    if (!(((com.moon.module.impl.KillAura)(spill873_2)).d__Boolean())) {
        break forward_join_33;
    }
    return;
    }
    ((com.moon.gd)(this.aa)).c();
    forwardValue873_37_0 = this;
    }
    ((com.moon.gc)(((com.moon.module.impl.KillAura)(forwardValue873_37_0)).ab)).a(((net.minecraft.entity.EntityLivingBase)(((com.moon.gd)(this.aa)).a__sG())));
    return;
}


public com.moon.setting.ModeSetting<com.moon.bd> a__kY() {
return this.x;
}


public void a(com.moon.eE p0) {
int forwardValue867_17_0;
    int forwardValue867_25_0;
    int forwardValue867_31_0;
    boolean spill867_0;
    long life2_3;
    int life4_5;
    float life5_51;
    float[] life6_57;
    forward_join_49: {
    forward_join_31: {
    forward_join_25: {
    forward_join_17: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 115342877376678L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill867_0 = ((com.moon.module.impl.KillAura)(this)).d__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue867_17_0 = ((spill867_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill867_0)) {
        break forward_join_12;
    }
    return;
    }
    forwardValue867_17_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.C)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue867_25_0 = forwardValue867_17_0;
        break forward_join_25;
    }
    if (!((forwardValue867_17_0 != 0))) {
        break forward_join_49;
    }
    forwardValue867_25_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.D)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue867_31_0 = forwardValue867_25_0;
        break forward_join_31;
    }
    if (!((forwardValue867_25_0 != 0))) {
        break forward_join_49;
    }
    forwardValue867_31_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.KillAura.d)).K)).ae()) ? 1 : 0);
    }
    if (!((forwardValue867_31_0 != 0))) {
        break forward_join_49;
    }
    life5_51 = ((org.lwjgl.util.vector.Vector2f)(((com.moon.gc)(this.ab)).b())).getX();
    life6_57 = com.moon.nE.a(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.KillAura.d)).K)).w)), ((float)(life5_51)));
    ((com.moon.eE)(p0)).a(((float)((life6_57)[0])));
    }
    return;
}


public void a(com.moon.ep p0) {
int forwardValue870_19_0;
    com.moon.module.impl.KillAura forwardValue870_29_0;
    boolean spill870_0;
    com.moon.module.impl.KillAura spill870_1;
    long life2_3;
    int life4_5;
    forward_join_33: {
    forward_join_29: {
    forward_join_19: {
    life2_3 = (com.moon.module.impl.KillAura.cb ^ 125030812712375L);
    life4_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill870_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.P)).getValue())))).booleanValue();
    if (!((life4_5 == 0))) {
        forwardValue870_19_0 = ((spill870_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill870_0)) {
        break forward_join_33;
    }
    spill870_1 = this;
    if (!((life4_5 == 0))) {
        forwardValue870_29_0 = spill870_1;
        break forward_join_29;
    }
    forwardValue870_19_0 = ((((com.moon.gd)(((com.moon.module.impl.KillAura)(spill870_1)).aa)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue870_19_0 != 0))) {
        break forward_join_33;
    }
    ((com.moon.ga)(this.ac)).b__Void();
    ((com.moon.ga)(this.ac)).a(((int)(0)));
    forwardValue870_29_0 = this;
    }
    ((com.moon.ga)(((com.moon.module.impl.KillAura)(forwardValue870_29_0)).ac)).a(((boolean)(true)));
    }
    return;
}


public void a(com.moon.dZ p0) {
return;
}


public com.moon.setting.SettingGroup a__k0() {
return this.A;
}


public com.moon.setting.BooleanSetting m() {
return this.T;
}


public com.moon.setting.BooleanSetting o() {
return this.V;
}


public com.moon.setting.BooleanSetting p() {
return this.Y;
}


public com.moon.setting.BooleanSetting k() {
return this.Q;
}


public com.moon.setting.BooleanSetting g() {
return this.H;
}


public com.moon.setting.BooleanSetting j() {
return this.P;
}


private void lambda$new$0(java.lang.Float p0, java.lang.Float p1) {
((com.moon.setting.FloatSetting)(this.s)).setDragMin(((float)(((java.lang.Float)(p1)).floatValue())));
    return;
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.KillAura.cb ^ 50774813014940L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.x)).getValue() == com.moon.bd.SWITCH) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$9() {
java.lang.Object forwardValue882_16_0;
    int forwardValue882_26_0;
    int forwardValue882_30_0;
    int forwardValue882_32_0;
    java.lang.Object spill882_0;
    boolean spill882_1;
    long life1_3;
    int life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 33111087688702L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill882_0 = ((com.moon.setting.ModeSetting)(this.W)).getValue();
    if (!((life3_5 == 0))) {
        forwardValue882_16_0 = spill882_0;
        break forward_join_16;
    }
    if (!((spill882_0 == com.moon.a9.WATCHDOG))) {
        break forward_join_31;
    }
    forwardValue882_16_0 = ((com.moon.setting.BooleanSetting)(this.T)).getValue();
    }
    spill882_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue882_16_0)))).booleanValue();
    if (!((life3_5 == 0))) {
        forwardValue882_26_0 = ((spill882_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!(spill882_1)) {
        break forward_join_31;
    }
    forwardValue882_26_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.U)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue882_30_0 = forwardValue882_26_0;
        break forward_join_30;
    }
    if (!((forwardValue882_26_0 == 0))) {
        break forward_join_31;
    }
    forwardValue882_30_0 = 1;
    }
    forwardValue882_32_0 = forwardValue882_30_0;
    break forward_join_32;
    }
    forwardValue882_32_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue882_32_0))));
}


private java.lang.Boolean lambda$new$3() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.I)).isSelected(((java.lang.Enum)(com.moon.bb.CIRCULAR))))));
}


private java.lang.Boolean lambda$new$2() {
long local1 = (com.moon.module.impl.KillAura.cb ^ 118255135084682L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.x)).getValue() == com.moon.bd.SINGLE) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$4() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.I)).isSelected(((java.lang.Enum)(com.moon.bb.NORMAL))))));
}


private java.lang.Boolean lambda$new$8() {
int forwardValue881_19_0;
    int forwardValue881_23_0;
    int forwardValue881_25_0;
    boolean spill881_0;
    long life1_3;
    int life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 19095648453903L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill881_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.U)).getValue())))).booleanValue();
    if (!((life3_5 == 0))) {
        forwardValue881_19_0 = ((spill881_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill881_0)) {
        break forward_join_24;
    }
    forwardValue881_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.T)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue881_23_0 = forwardValue881_19_0;
        break forward_join_23;
    }
    if (!((forwardValue881_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue881_23_0 = 1;
    }
    forwardValue881_25_0 = forwardValue881_23_0;
    break forward_join_25;
    }
    forwardValue881_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue881_25_0))));
}


private java.lang.Boolean lambda$new$6() {
java.lang.Object forwardValue879_17_0;
    com.moon.ba forwardValue879_17_1;
    int forwardValue879_21_0;
    java.lang.Object spill879_0;
    com.moon.ba spill879_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 68077159221140L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill879_0 = ((com.moon.setting.ModeSetting)(this.M)).getValue();
    spill879_1 = com.moon.ba.ADVANCED;
    if (!((life3_5 == 0))) {
        forwardValue879_17_0 = spill879_0;
        forwardValue879_17_1 = spill879_1;
        break forward_join_17;
    }
    if (!((spill879_0 != spill879_1))) {
        break forward_join_18;
    }
    forwardValue879_17_0 = ((com.moon.setting.ModeSetting)(this.M)).getValue();
    forwardValue879_17_1 = com.moon.ba.HURT_TIME;
    }
    if (!((forwardValue879_17_0 == forwardValue879_17_1))) {
        break forward_join_20;
    }
    }
    forwardValue879_21_0 = 1;
    break forward_join_21;
    }
    forwardValue879_21_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue879_21_0))));
}


private java.lang.Boolean lambda$new$5() {
java.lang.Object forwardValue878_17_0;
    com.moon.ba forwardValue878_17_1;
    int forwardValue878_21_0;
    java.lang.Object spill878_0;
    com.moon.ba spill878_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 33127996852304L);
    life3_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill878_0 = ((com.moon.setting.ModeSetting)(this.M)).getValue();
    spill878_1 = com.moon.ba.ADVANCED;
    if (!((life3_5 != 0))) {
        forwardValue878_17_0 = spill878_0;
        forwardValue878_17_1 = spill878_1;
        break forward_join_17;
    }
    if (!((spill878_0 != spill878_1))) {
        break forward_join_18;
    }
    forwardValue878_17_0 = ((com.moon.setting.ModeSetting)(this.M)).getValue();
    forwardValue878_17_1 = com.moon.ba.HURT_TIME;
    }
    if (!((forwardValue878_17_0 == forwardValue878_17_1))) {
        break forward_join_20;
    }
    }
    forwardValue878_21_0 = 1;
    break forward_join_21;
    }
    forwardValue878_21_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue878_21_0))));
}


private java.lang.Boolean lambda$new$7() {
int forwardValue880_19_0;
    int forwardValue880_23_0;
    int forwardValue880_25_0;
    boolean spill880_0;
    long life1_3;
    int life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.KillAura.cb ^ 54170309796444L);
    life3_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill880_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.U)).getValue())))).booleanValue();
    if (!((life3_5 == 0))) {
        forwardValue880_19_0 = ((spill880_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill880_0))) {
        break forward_join_24;
    }
    forwardValue880_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.T)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == 0))) {
        forwardValue880_23_0 = forwardValue880_19_0;
        break forward_join_23;
    }
    if (!((forwardValue880_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue880_23_0 = 1;
    }
    forwardValue880_25_0 = forwardValue880_23_0;
    break forward_join_25;
    }
    forwardValue880_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue880_25_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_20(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_26(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_52(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_87(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_89(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_101(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_107(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_127(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_130(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_135(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_138(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_143(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_146(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_154(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_159(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_162(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_169(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_172(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_177(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_180(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_185(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_188(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_193(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_197(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_203(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_206(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_211(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_216(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_219(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_225(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_231(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_233(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_257(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_262(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_267(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_272(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_279(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_283(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_289(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_292(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_294(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_299(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_302(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_304(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_309(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_312(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_317(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_320(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_325(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_328(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_336(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_342(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_344(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_368(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_375(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_378(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_383(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_386(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_394(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_399(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_402(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_410(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_415(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_419(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_422(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_427(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_431(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_434(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_439(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_442(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_444(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_450(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec056532bc9106d3_originalDynamicSite28_452(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2531_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_7ac46ee229a8_call875_10(com.moon.module.impl.KillAura a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2535_0() throws E;

private static native <E extends Throwable> void __sourceIntrinsic_a91ecd6db48f_call876_10(com.moon.module.impl.KillAura a0) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
