package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class InventoryManager extends com.moon.module.Module {

public com.moon.setting.ModeSetting<com.moon.bB> s;

public com.moon.setting.MultiSelectSetting<com.moon.bC> t;

public com.moon.setting.IntegerSetting u;

public com.moon.setting.IntegerSetting v;

public com.moon.setting.IntegerSetting w;

public com.moon.setting.BooleanSetting x;

public com.moon.setting.BooleanSetting y;

public com.moon.setting.BooleanSetting z;

public com.moon.setting.BooleanSetting A;

public com.moon.setting.IntegerSetting B;

private com.moon.setting.SettingGroup C;

public com.moon.setting.IntegerSetting D;

public com.moon.setting.MultiSelectSetting<com.moon.bA> E;

private com.moon.setting.IntegerSetting F;

private com.moon.setting.SettingGroup G;

private com.moon.nW H;

private com.moon.nW I;

private com.moon.nW J;

private com.moon.nH K;

private java.lang.Integer L;

private long M;

private com.moon.module.impl.KillAura N;

private boolean O;

private static long P;

private static java.lang.String[] Q;

private static java.lang.String[] R;

private static java.util.Map S;

private static long[] T;

private static java.lang.Integer[] U;

private static java.util.Map V;

private static long[] W;

private static java.lang.Long[] X;

private static java.util.Map Y;

public InventoryManager(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_927b7e1289a7cdfb(com.moon.module.impl.InventoryManager receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.InventoryManager.P ^ 82500419915758L);

    com.moon.module.impl.InventoryManager.__sourceConstructorInit_927b7e1289a7cdfb_0(((com.moon.module.impl.InventoryManager)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.InventoryManager)(receiver)).s = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_5(27422, (2952050802160319854L ^ local5_life2)))), ((java.lang.Class)(com.moon.bB.class))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_9(24941, (6471004081234753284L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bB.NONE))))).a()));

    java.lang.String __sourceSpill27_23 = com.moon.bF.b();

    com.moon.module.impl.InventoryManager __sourceSpill27_24 = receiver;

    com.moon.mi __sourceSpill27_25 = com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_16(20215, (9086372033438029975L ^ local5_life2)))), ((java.lang.Class)(com.moon.bC.class)));

    java.lang.String __sourceSpill27_26 = __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_20(13337, (3978698881405903457L ^ local5_life2));

    com.moon.bC[] __stackOp27_27_0 = new com.moon.bC[__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_22(5864, (8228616054981577661L ^ local5_life2))];

    com.moon.bC[] __sourceSpill27_29 = __stackOp27_27_0;

    (__stackOp27_27_0)[0] = com.moon.bC.AUTO_CLEAN;

    com.moon.bC[] __stackOp27_30_0 = __sourceSpill27_29;

    com.moon.bC[] __sourceSpill27_32 = __stackOp27_30_0;

    (__stackOp27_30_0)[1] = com.moon.bC.AUTO_ARMOR;

    com.moon.bC[] __stackOp27_33_0 = __sourceSpill27_32;

    com.moon.bC[] __sourceSpill27_35 = __stackOp27_33_0;

    (__stackOp27_33_0)[2] = com.moon.bC.AUTO_SWORD;

    com.moon.bC[] __stackOp27_36_0 = __sourceSpill27_35;

    com.moon.bC[] __sourceSpill27_38 = __stackOp27_36_0;

    (__stackOp27_36_0)[3] = com.moon.bC.AUTO_SOUP;

    com.moon.bC[] __stackOp27_39_0 = __sourceSpill27_38;

    com.moon.bC[] __sourceSpill27_41 = __stackOp27_39_0;

    (__stackOp27_39_0)[4] = com.moon.bC.AUTO_POTION;

    com.moon.bC[] __stackOp27_42_0 = __sourceSpill27_41;

    com.moon.bC[] __sourceSpill27_44 = __stackOp27_42_0;

    (__stackOp27_42_0)[5] = com.moon.bC.MOVE_BLOCKS;

    ((com.moon.module.impl.InventoryManager)(__sourceSpill27_24)).t = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(__sourceSpill27_25)).a(((java.lang.String)(__sourceSpill27_26)), ((java.lang.Enum[])(__sourceSpill27_44))))).a()));

    java.lang.String local7_life48 = __sourceSpill27_23;

    ((com.moon.module.impl.InventoryManager)(receiver)).u = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_50(1659, (2909447166255648778L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_53(15690, (6089289823692843825L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_55(5658, (4253454001866787667L ^ local5_life2)))), ((int)(1)), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_57(9439, (6366693094247463301L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_59(16696, (3223051993042426983L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).v = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_64(25450, (1193278717585667339L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_67(16324, (4528439658057099686L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_69(29546, (8262748569523498547L ^ local5_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_71(28339, (2604707942295974885L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_73(29546, (8262748569523498547L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).w = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_78(29578, (4571566393915352559L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_81(19416, (4450244831321300389L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_83(19852, (1030076742530404550L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_85(11641, (3928984528042520619L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_87(22309, (83641184606784118L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_89(14378, (7052006514935653757L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_91(receiver)))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_96(25477, (3033492149454616041L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_99(10967, (4077284433462426810L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_101(receiver)))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_106(26474, (5190694812698358035L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_109(3213, (8625699463197055723L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_111(receiver)))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_116(32749, (5666360572729272718L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_119(18545, (5590566689974001155L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_121(receiver)))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).A = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_126(8096, (6750258214021417416L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_129(6770, (2708527062990179340L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_131(receiver)))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).B = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_136(22028, (5306542978985427056L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_139(7421, (8428855640964123286L ^ local5_life2)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_141(12759, (5534135509201218703L ^ local5_life2)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_143(receiver)))))).a()));

    com.moon.module.impl.InventoryManager __sourceSpill27_152 = receiver;

    com.moon.me __sourceSpill27_153 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill27_154 = __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_149(4063, (3021703969032624560L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp27_155_0 = new com.moon.setting.Setting[__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_151(12759, (5534135509201218703L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill27_157 = __stackOp27_155_0;

    (__stackOp27_155_0)[0] = ((com.moon.module.impl.InventoryManager)(receiver)).w;

    com.moon.setting.Setting[] __stackOp27_158_0 = __sourceSpill27_157;

    com.moon.setting.Setting[] __sourceSpill27_160 = __stackOp27_158_0;

    (__stackOp27_158_0)[1] = ((com.moon.module.impl.InventoryManager)(receiver)).x;

    com.moon.setting.Setting[] __stackOp27_161_0 = __sourceSpill27_160;

    com.moon.setting.Setting[] __sourceSpill27_163 = __stackOp27_161_0;

    (__stackOp27_161_0)[2] = ((com.moon.module.impl.InventoryManager)(receiver)).y;

    com.moon.setting.Setting[] __stackOp27_164_0 = __sourceSpill27_163;

    com.moon.setting.Setting[] __sourceSpill27_166 = __stackOp27_164_0;

    (__stackOp27_164_0)[3] = ((com.moon.module.impl.InventoryManager)(receiver)).z;

    com.moon.setting.Setting[] __stackOp27_167_0 = __sourceSpill27_166;

    com.moon.setting.Setting[] __sourceSpill27_169 = __stackOp27_167_0;

    (__stackOp27_167_0)[4] = ((com.moon.module.impl.InventoryManager)(receiver)).A;

    com.moon.setting.Setting[] __stackOp27_170_0 = __sourceSpill27_169;

    com.moon.setting.Setting[] __sourceSpill27_172 = __stackOp27_170_0;

    (__stackOp27_170_0)[5] = ((com.moon.module.impl.InventoryManager)(receiver)).B;

    ((com.moon.module.impl.InventoryManager)(__sourceSpill27_152)).C = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(((com.moon.me)(__sourceSpill27_153)).a(((java.lang.String)(__sourceSpill27_154)), ((com.moon.setting.Setting[])(__sourceSpill27_172))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_174(receiver)))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).D = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_179(26327, (2526956127889141949L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_182(27977, (9032737558098262829L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_184(10826, (7097381903185803038L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_186(29546, (8262748569523498547L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_188(20797, (5775502740933413987L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_190(29546, (8262748569523498547L ^ local5_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_192(receiver)))))).a()));

    com.moon.module.impl.InventoryManager __sourceSpill27_202 = receiver;

    com.moon.mi __sourceSpill27_203 = com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_197(30365, (7761363358383677690L ^ local5_life2)))), ((java.lang.Class)(com.moon.bA.class)));

    java.lang.String __sourceSpill27_204 = __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_201(11804, (807538115713661039L ^ local5_life2));

    com.moon.bA[] __stackOp27_205_0 = new com.moon.bA[4];

    com.moon.bA[] __sourceSpill27_207 = __stackOp27_205_0;

    (__stackOp27_205_0)[0] = com.moon.bA.INSTANT_HEAL;

    com.moon.bA[] __stackOp27_208_0 = __sourceSpill27_207;

    com.moon.bA[] __sourceSpill27_210 = __stackOp27_208_0;

    (__stackOp27_208_0)[1] = com.moon.bA.SPEED;

    com.moon.bA[] __stackOp27_211_0 = __sourceSpill27_210;

    com.moon.bA[] __sourceSpill27_213 = __stackOp27_211_0;

    (__stackOp27_211_0)[2] = com.moon.bA.REGENERATION;

    com.moon.bA[] __stackOp27_214_0 = __sourceSpill27_213;

    com.moon.bA[] __sourceSpill27_216 = __stackOp27_214_0;

    (__stackOp27_214_0)[3] = com.moon.bA.RESISTANCE;

    ((com.moon.module.impl.InventoryManager)(__sourceSpill27_202)).E = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(__sourceSpill27_203)).a(((java.lang.String)(__sourceSpill27_204)), ((java.lang.Enum[])(__sourceSpill27_216))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).F = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_221(7490, (5710131701419625272L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_224(8969, (6569305174172923254L ^ local5_life2)))), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_226(22511, (8280817217638369983L ^ local5_life2)))), ((int)(1)), ((int)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_228(16862, (5821641847893826693L ^ local5_life2)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_230(receiver)))))).a()));

    com.moon.module.impl.InventoryManager __sourceSpill27_237 = receiver;

    com.moon.me __sourceSpill27_238 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill27_239 = __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_236(3190, (6941397284971829784L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp27_240_0 = new com.moon.setting.Setting[3];

    com.moon.setting.Setting[] __sourceSpill27_242 = __stackOp27_240_0;

    (__stackOp27_240_0)[0] = ((com.moon.module.impl.InventoryManager)(receiver)).E;

    com.moon.setting.Setting[] __stackOp27_243_0 = __sourceSpill27_242;

    com.moon.setting.Setting[] __sourceSpill27_245 = __stackOp27_243_0;

    (__stackOp27_243_0)[1] = ((com.moon.module.impl.InventoryManager)(receiver)).F;

    com.moon.setting.Setting[] __stackOp27_246_0 = __sourceSpill27_245;

    com.moon.setting.Setting[] __sourceSpill27_248 = __stackOp27_246_0;

    (__stackOp27_246_0)[2] = ((com.moon.module.impl.InventoryManager)(receiver)).D;

    ((com.moon.module.impl.InventoryManager)(__sourceSpill27_237)).G = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(((com.moon.me)(__sourceSpill27_238)).a(((java.lang.String)(__sourceSpill27_239)), ((com.moon.setting.Setting[])(__sourceSpill27_248))))).a(((java.util.function.Supplier)(__sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_250(receiver)))))).a()));

    ((com.moon.module.impl.InventoryManager)(receiver)).H = ((com.moon.nW)(new com.moon.nW()));

    ((com.moon.module.impl.InventoryManager)(receiver)).I = ((com.moon.nW)(new com.moon.nW()));

    ((com.moon.module.impl.InventoryManager)(receiver)).J = ((com.moon.nW)(new com.moon.nW()));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.bF.b(((java.lang.String)("zQGSK")));

    }

    return;

}



static {
P = ((long)(((moom._a)(moom._c.a(((long)(-6427327269840498229L)), ((long)(6735340106694557756L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(241631442372473L)))));
    S = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.module.impl.InventoryManager.P ^ 104758847430973L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill278_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill278_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill278_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill278_14 = new byte[8];
    (__sourceSpill278_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill278_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation278_16 = __sourceSpill278_14;
    ((javax.crypto.Cipher)(__sourceSpill278_11)).init(((int)(__sourceSpill278_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill278_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation278_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[28];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "\003<Óooé\f5Ú{Éú\022JXds´r\024i¥(3\bhÓGäo\013-í¹wo«Úª¥\030/Â¤l¢´/êlã\024)µ'¹ux!\035W¸Î áçÝeU\037¥\005[Ü®{àäÚ´Ny+ãäCqs\002<Ñâ(«EÙò-P\0345uH^ÙØ¦\000NÓè\026\020¥_ÚÈiÀÎ!ý«\030·-N.\fN(CD?Ýx\tÇ_^¾iYXqüé¹ \001Rm]6I'h¬þ^\003\033]\024é0»ÇÌÖèQU¹a!¨jÓhØî6 óÑ\n´ÿ\000Úv©x+ewÓN\016\036FUÀ\021[\030±ÐI¤0\016@ÐQ*E2¢KIVîb¥\020ø\030gøÑõ©n¶Íì!Ìb08êÆ\000ÃèæÜ¾Ûp(|\003\036íÂ¡Þ½`hR\004êY Ü<2Ë zìÚÍö\023ÏQn\t§`º F\013,RQÁnÁ¢væmå¯âhb\023Ê&Þ\nßÞ\030kîØk% \007þ^íÌf¬­ViA£ÉDINõd\rPeªB_'\023³ñr(Ü½Sg*©\\q\034%T\031ZÊoU\002\007)8%2Ô\000Ñ»WªÏ¨©\017\021úùËE D¦m½7Á¼»¤\t\016±w\027ÚÃ«?X'\027E¬hf(\030Âs(vL\001(ÿrTS)\033½¶i2xS\016[©Uð%¹;c\riJ©ÍæèÉ!\030*zñ\000dj¸e\020\026$FI\024\027\0041$¬J\r\020 Ök\033úE>¾Ý\033Ä\004~y¨äoði»tû5Sé¦\020ü\r±\003D&\030Æ½Ox_2\005çµq8·Qz\"\030ïrIÕ\ru\030?º\022£l·N\021;«+R!óÈÎþDr|\020àÐ\021÷¼~$C_TI\005H03\006\031$%Ù¸ËË^4Ã°SÜ't\\oøù¤ÊªÂÞ[úÑ{öÒÅ\025ºÛåÌ\033}ìV@ ù\006¦ZJ\026¯¬ÛD@®/\\sB\023ê`\t¡mï\004·W¾\030\177ýÛííª\0070yÞëcn\001ÂÔeHØb{+(\013Ê\007ÿ&p\"Gt«\033º©Ñ]\017HÜdP0{_<§\030#¹\033\026C7\030w³Ä\003nç\fò}\ní>\022K,ã\036\020!\020ï1ñE\026º¤\032\\\032rP/Ð\b~ Æ\177ÃôªÑþNöþ$q\002#ïôÈxÌë0hn\037s\"ÿÙÆÓ"))).length();
    int local27_life24 = 48;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill278_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill278_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill278_29)).doFinal(((byte[])(__sourceSpill278_28)));
        java.lang.String __sourceSpill278_34 = ((java.lang.String)(com.moon.module.impl.InventoryManager.c(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill278_35 = local31_life19;
        int __sourceSpill278_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill278_35)[__sourceSpill278_36] = __sourceSpill278_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "¯3ÑTÀ]y÷1qK¡\024_Y\033ªÃ%ÝÜª1\030ò.\037Úcqwÿ\004|yô\037¶ß=dø\021cfÙ-"))).length();
    local27_life24 = 24;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill278_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill278_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill278_42)).doFinal(((byte[])(__sourceSpill278_41)));
        java.lang.String __sourceSpill278_47 = ((java.lang.String)(com.moon.module.impl.InventoryManager.c(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill278_48 = local31_life19;
        int __sourceSpill278_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill278_48)[__sourceSpill278_49] = __sourceSpill278_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    Q = ((java.lang.String[])(local31_life19));
    R = ((java.lang.String[])(new java.lang.String[28]));
    V = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill278_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill278_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill278_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill278_60 = new byte[8];
    (__sourceSpill278_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill278_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation278_62 = __sourceSpill278_60;
    ((javax.crypto.Cipher)(__sourceSpill278_57)).init(((int)(__sourceSpill278_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill278_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation278_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[19];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "ôº'ÆX\027\034\003g6\007árÅMy¦PHw[\0169u3ÍSiÎ`×+\033C\013C5\013Çõ\021ÔÍ4ðÃ­P¥Û_\006õ\025ÓÔl3ÔVUÝ÷»TÞ¿\fËÞOâ\rd\037!?~\013\025<R\016&\003J\032Â>\031®¸q¦\033¼v7*0âðd½\036|ú\007\000À^Á^%P"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill278_71 = local15_life67;
        int __sourceSpill278_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill278_71)).substring(((int)(__sourceSpill278_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill278_76 = local17_life65;
        int __sourceSpill278_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill278_79 = new byte[8];
        (__sourceSpill278_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill278_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill278_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill278_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill278_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill278_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill278_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill278_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill278_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill278_80)).doFinal(((byte[])(__sourceSpill278_79)));
        (__sourceSpill278_76)[__sourceSpill278_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "g3òÇ-Þ6&\n°'\033ý"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill278_84 = local15_life67;
        int __sourceSpill278_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill278_84)).substring(((int)(__sourceSpill278_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill278_89 = local17_life65;
        int __sourceSpill278_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill278_92 = new byte[8];
        (__sourceSpill278_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill278_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill278_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill278_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill278_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill278_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill278_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill278_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill278_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill278_93)).doFinal(((byte[])(__sourceSpill278_92)));
        (__sourceSpill278_89)[__sourceSpill278_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    T = ((long[])(local17_life65));
    U = ((java.lang.Integer[])(new java.lang.Integer[19]));
    Y = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill278_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill278_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill278_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill278_105 = new byte[8];
    (__sourceSpill278_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill278_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation278_107 = __sourceSpill278_105;
    ((javax.crypto.Cipher)(__sourceSpill278_102)).init(((int)(__sourceSpill278_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill278_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation278_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[3];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "ø Í_w\002\\/7t¨+ö¢o\000/«ß"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill278_116 = local4_life112;
        int __sourceSpill278_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill278_116)).substring(((int)(__sourceSpill278_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill278_121 = local6_life110;
        int __sourceSpill278_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill278_124 = new byte[8];
        (__sourceSpill278_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill278_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill278_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill278_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill278_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill278_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill278_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill278_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill278_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill278_125)).doFinal(((byte[])(__sourceSpill278_124)));
        (__sourceSpill278_121)[__sourceSpill278_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    W = ((long[])(local6_life110));
    X = ((java.lang.Long[])(new java.lang.Long[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_927b7e1289a7cdfb_0(com.moon.module.impl.InventoryManager a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral2519_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long e(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27310);
    if (((com.moon.module.impl.InventoryManager.X)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.module.impl.InventoryManager.W)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.InventoryManager.Y)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.InventoryManager.Y)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/lG", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.module.impl.InventoryManager.X)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.module.impl.InventoryManager.X)[life3_8])).longValue();
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.module.impl.InventoryManager.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2521_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.InventoryManager.c(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13611);
    if (((com.moon.module.impl.InventoryManager.R)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.InventoryManager.S)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.InventoryManager.S)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lG", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.InventoryManager.Q)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.InventoryManager.R)[life5_8] = com.moon.module.impl.InventoryManager.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.InventoryManager.R)[life5_8];
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
        byte[] spill1123_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1123_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1123_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1123_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1123_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1123_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void onEnable() {
this.M = ((long)(((com.moon.module.impl.InventoryManager)(this)).a()));
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.InventoryManager.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2524_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15898;
      if (U[var3] == null) {
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
         long var5 = T[var3];
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
         Object[] var9 = (Object[])V.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               V.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lG", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         U[var3] = var15;
      }

      return U[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(int p0) {
((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).bD)).c = ((int)(p0));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).cm)).a(((moom.yK)(new moom.zc(p0))));
    return;
}


public void a(com.moon.event.MoveEvent p0) {
com.moon.module.impl.InventoryManager lexicalValue237_18_0;
    com.moon.module.impl.InventoryManager lexicalValue237_30_0;
    net.minecraft.client.gui.GuiScreen lexicalValue237_49_0;
    java.lang.Object lexicalValue237_57_0;
    com.moon.module.impl.InventoryManager lexicalValue237_60_0;
    com.moon.module.impl.InventoryManager lexicalValue237_110_0;
    com.moon.module.impl.InventoryManager lexicalValue237_131_0;
    com.moon.module.impl.InventoryManager lexicalValue237_135_0;
    int lexicalValue237_156_0;
    net.minecraft.client.entity.EntityPlayerSP lexicalValue237_192_0;
    int lexicalValue237_214_0;
    int lexicalValue237_232_0;
    int lexicalValue237_269_0;
    int lexicalValue237_285_0;
    int lexicalValue237_294_0;
    int lexicalValue237_317_0;
    com.moon.module.impl.InventoryManager lexicalValue237_350_0;
    int lexicalValue237_357_0;
    int lexicalValue237_457_0;
    int lexicalValue237_495_0;
    int lexicalValue237_522_0;
    int lexicalValue237_532_0;
    com.moon.module.impl.InventoryManager lexicalValue237_538_0;
    com.moon.module.impl.InventoryManager lexicalValue237_565_0;
    com.moon.module.impl.InventoryManager lexicalValue237_574_0;
    int lexicalValue237_577_0;
    int lexicalValue237_643_0;
    int lexicalValue237_680_0;
    int lexicalValue237_686_0;
    int lexicalValue237_689_0;
    int lexicalValue237_689_1;
    com.moon.module.impl.InventoryManager spill237_0;
    net.minecraft.client.gui.GuiScreen spill237_1;
    net.minecraft.client.gui.GuiScreen spill237_2;
    com.moon.module.impl.InventoryManager spill237_3;
    com.moon.module.impl.InventoryManager spill237_4;
    com.moon.module.impl.InventoryManager spill237_5;
    boolean spill237_6;
    int spill237_7;
    int spill237_8;
    net.minecraft.client.entity.EntityPlayerSP spill237_9;
    boolean spill237_10;
    boolean spill237_11;
    boolean spill237_12;
    boolean spill237_13;
    com.moon.module.impl.InventoryManager spill237_14;
    com.moon.module.impl.InventoryManager spill237_15;
    com.moon.module.impl.InventoryManager spill237_16;
    boolean spill237_17;
    int spill237_18;
    boolean spill237_19;
    com.moon.module.impl.InventoryManager spill237_20;
    boolean spill237_21;
    boolean spill237_22;
    int spill237_23;
    int spill237_24;
    int spill237_25;
    boolean spill237_26;
    int spill237_27;
    int spill237_28;
    boolean spill237_29;
    com.moon.module.impl.InventoryManager spill237_30;
    int spill237_31;
    com.moon.module.impl.InventoryManager spill237_32;
    int spill237_33;
    int spill237_34;
    boolean spill237_35;
    int spill237_36;
    long life2_3;
    java.lang.String life4_5;
    int life5_117;
    int life5_221;
    int life6_229;
    int life5_457;
    int life5_493;
    int life6_566;
    int life7_572;
    int life8_578;
    int life9_584;
    int life6_845;
    int life7_926;
    lexical_join_695: {
    lexical_join_689: {
    lexical_join_686: {
    lexical_join_680: {
    lexical_join_676: {
    lexical_join_643: {
    lexical_join_639: {
    lexical_join_577: {
    lexical_join_574: {
    lexical_join_573: {
    lexical_join_572: {
    lexical_join_565: {
    lexical_join_538: {
    lexical_join_537: {
    lexical_join_532: {
    lexical_join_522: {
    lexical_join_516: {
    lexical_join_495: {
    lexical_join_491: {
    lexical_join_457: {
    lexical_join_453: {
    lexical_join_357: {
    lexical_join_356: {
    lexical_join_350: {
    lexical_join_349: {
    lexical_join_317: {
    lexical_join_311: {
    lexical_join_294: {
    lexical_join_289: {
    lexical_join_285: {
    lexical_join_273: {
    lexical_join_269: {
    lexical_join_257: {
    lexical_join_232: {
    lexical_join_227: {
    lexical_join_214: {
    lexical_join_210: {
    lexical_join_205: {
    lexical_join_198: {
    lexical_join_192: {
    lexical_join_179: {
    lexical_join_156: {
    lexical_join_135: {
    lexical_join_134: {
    lexical_join_133: {
    lexical_join_131: {
    lexical_join_110: {
    lexical_join_109: {
    lexical_join_68: {
    lexical_join_63: {
    lexical_join_60: {
    lexical_join_57: {
    lexical_join_49: {
    lexical_join_47: {
    lexical_join_30: {
    lexical_join_29: {
    lexical_join_18: {
    lexical_join_17: {
    life2_3 = (com.moon.module.impl.InventoryManager.P ^ 33048271637624L);
    life4_5 = com.moon.bF.b();
    spill237_0 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_18_0 = spill237_0;
        break lexical_join_18;
    }
    if (!((((com.moon.module.impl.InventoryManager)(spill237_0)).K == null))) {
        break lexical_join_17;
    }
    this.K = ((com.moon.nH)(new com.moon.nH(this)));
    }
    lexicalValue237_18_0 = this;
    }
    if (!((life4_5 != null))) {
        lexicalValue237_30_0 = lexicalValue237_18_0;
        break lexical_join_30;
    }
    if (!((((com.moon.module.impl.InventoryManager)(lexicalValue237_18_0)).N == null))) {
        break lexical_join_29;
    }
    this.N = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    lexicalValue237_30_0 = this;
    }
    ((com.moon.module.impl.InventoryManager)(lexicalValue237_30_0)).setSuffix(((java.lang.String)(java.lang.String.valueOf(((java.lang.Object)(((com.moon.setting.IntegerSetting)(this.u)).getValue()))))));
    spill237_1 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).P;
    if (!((life4_5 != null))) {
        lexicalValue237_49_0 = spill237_1;
        break lexical_join_49;
    }
    if (!((spill237_1 != null))) {
        break lexical_join_47;
    }
    spill237_2 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).P;
    if (!((life4_5 != null))) {
        lexicalValue237_49_0 = spill237_2;
        break lexical_join_49;
    }
    if (!((((spill237_2 instanceof moom.hu) ? 1 : 0) == 0))) {
        break lexical_join_47;
    }
    return;
    }
    lexicalValue237_49_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).P;
    }
    if (!((life4_5 != null))) {
        lexicalValue237_57_0 = lexicalValue237_49_0;
        break lexical_join_57;
    }
    if (!((lexicalValue237_49_0 == null))) {
        break lexical_join_63;
    }
    spill237_3 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_60_0 = spill237_3;
        break lexical_join_60;
    }
    lexicalValue237_57_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.InventoryManager)(spill237_3)).s)).getValue();
    }
    if (!((lexicalValue237_57_0 == com.moon.bB.OPEN))) {
        break lexical_join_63;
    }
    lexicalValue237_60_0 = this;
    }
    ((com.moon.nW)(((com.moon.module.impl.InventoryManager)(lexicalValue237_60_0)).H)).a__Void();
    return;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() != com.moon.event.MovePhase.PRE))) {
        break lexical_join_68;
    }
    return;
    }
    spill237_4 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_110_0 = spill237_4;
        break lexical_join_110;
    }
    if (!(((com.moon.module.impl.InventoryManager)(spill237_4)).O)) {
        break lexical_join_109;
    }
    life5_117 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).bD)).c;
    ((com.moon.module.impl.InventoryManager)(this)).a(((int)(((java.lang.Integer)(this.L)).intValue())));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).cm)).a(((moom.yK)(new moom.zb(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).a__xW()))));
    ((com.moon.module.impl.InventoryManager)(this)).a(((int)(life5_117)));
    this.L = ((java.lang.Integer)(null));
    this.O = ((boolean)(false));
    ((com.moon.nW)(this.H)).a__Void();
    ((com.moon.nW)(this.J)).a__Void();
    return;
    }
    lexicalValue237_110_0 = this;
    }
    if (!((life4_5 != null))) {
        lexicalValue237_135_0 = lexicalValue237_110_0;
        break lexical_join_135;
    }
    if (!((((com.moon.module.impl.InventoryManager)(lexicalValue237_110_0)).L != null))) {
        break lexical_join_134;
    }
    ((com.moon.event.MoveEvent)(p0)).b(((float)(0x1.68p6f)));
    spill237_5 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_131_0 = spill237_5;
        break lexical_join_131;
    }
    if (!(((com.moon.nW)(((com.moon.module.impl.InventoryManager)(spill237_5)).I)).b(((long)(((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.D)).getValue())))).intValue())))))) {
        break lexical_join_133;
    }
    lexicalValue237_131_0 = this;
    }
    ((com.moon.module.impl.InventoryManager)(lexicalValue237_131_0)).O = ((boolean)(true));
    }
    return;
    }
    lexicalValue237_135_0 = this;
    }
    spill237_6 = ((com.moon.nW)(((com.moon.module.impl.InventoryManager)(lexicalValue237_135_0)).H)).b(((long)((this.M - __sourceIntrinsic_9f71572286bb_invokedynamic237_62(962, (7060011227934378424L ^ life2_3))))));
    if (!((life4_5 != null))) {
        lexicalValue237_156_0 = ((spill237_6) ? 1 : 0);
        break lexical_join_156;
    }
    if (!(spill237_6)) {
        break lexical_join_695;
    }
    this.M = ((long)(((com.moon.module.impl.InventoryManager)(this)).a()));
    lexicalValue237_156_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_ARMOR)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_214_0 = lexicalValue237_156_0;
        break lexical_join_214;
    }
    if (!((lexicalValue237_156_0 != 0))) {
        break lexical_join_210;
    }
    life5_221 = 0;
    lexical_cycle_161: while (true) {
    lexical_join_177: {
    if (!((life5_221 < 4))) {
        break lexical_join_210;
    }
    life6_229 = ((com.moon.nH)(this.K)).b(((int)(life5_221)));
    if (!((life4_5 != null))) {
        break lexical_join_177;
    }
    spill237_7 = life6_229;
    spill237_8 = -1;
    if (!((life4_5 != null))) {
        lexicalValue237_689_0 = spill237_7;
        lexicalValue237_689_1 = spill237_8;
        break lexical_join_689;
    }
    if (!((spill237_7 == spill237_8))) {
        break lexical_join_179;
    }
    life5_221 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_161; }
    break lexical_cycle_161;
    }
    }
    spill237_9 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K;
    if (!((life4_5 != null))) {
        lexicalValue237_192_0 = spill237_9;
        break lexical_join_192;
    }
    if (!((((moom.wB)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(spill237_9)).bF)).a__wB(((int)((life5_221 + 5)))))).a__xW() != null))) {
        break lexical_join_205;
    }
    lexicalValue237_192_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K;
    }
    if (!((((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(lexicalValue237_192_0)).bD)).f() == -1))) {
        break lexical_join_198;
    }
    if (!((life4_5 == null))) {
        break lexical_join_210;
    }
    }
    ((com.moon.nH)(this.K)).a__Void(((int)((life5_221 + 5))));
    return;
    }
    ((com.moon.nH)(this.K)).a__Void(((int)(life6_229)));
    return;
    }
    lexicalValue237_214_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_SWORD)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_232_0 = lexicalValue237_214_0;
        break lexical_join_232;
    }
    if (!((lexicalValue237_214_0 != 0))) {
        break lexical_join_227;
    }
    spill237_10 = ((com.moon.module.impl.InventoryManager)(this)).a(((int)(0)), ((int)(((com.moon.nH)(this.K)).f())));
    if (!((life4_5 != null))) {
        lexicalValue237_232_0 = ((spill237_10) ? 1 : 0);
        break lexical_join_232;
    }
    if (!(spill237_10)) {
        break lexical_join_227;
    }
    return;
    }
    lexicalValue237_232_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.z)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_294_0 = lexicalValue237_232_0;
        break lexical_join_294;
    }
    if (!((lexicalValue237_232_0 != 0))) {
        break lexical_join_289;
    }
    spill237_11 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        lexicalValue237_294_0 = ((spill237_11) ? 1 : 0);
        break lexical_join_294;
    }
    if (!(spill237_11)) {
        break lexical_join_289;
    }
    spill237_12 = ((com.moon.module.impl.InventoryManager)(this)).a(((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue())), ((int)(((com.moon.nH)(this.K)).a())));
    if (!((life4_5 != null))) {
        lexicalValue237_269_0 = ((spill237_12) ? 1 : 0);
        break lexical_join_269;
    }
    if (!(spill237_12)) {
        break lexical_join_257;
    }
    return;
    }
    lexicalValue237_269_0 = ((((com.moon.module.impl.InventoryManager)(this)).a(((int)((((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue() + 1))), ((int)(((com.moon.nH)(this.K)).b())))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_285_0 = lexicalValue237_269_0;
        break lexical_join_285;
    }
    if (!((lexicalValue237_269_0 != 0))) {
        break lexical_join_273;
    }
    return;
    }
    lexicalValue237_285_0 = ((((com.moon.module.impl.InventoryManager)(this)).a(((int)((((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue() + 2))), ((int)(((com.moon.nH)(this.K)).c())))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_294_0 = lexicalValue237_285_0;
        break lexical_join_294;
    }
    if (!((lexicalValue237_285_0 != 0))) {
        break lexical_join_289;
    }
    return;
    }
    lexicalValue237_294_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.y)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_317_0 = lexicalValue237_294_0;
        break lexical_join_317;
    }
    if (!((lexicalValue237_294_0 != 0))) {
        break lexical_join_311;
    }
    spill237_13 = ((com.moon.module.impl.InventoryManager)(this)).a(((int)(__sourceIntrinsic_9f71572286bb_invokedynamic237_133(19172, (7088577119793239098L ^ life2_3)))), ((int)(((com.moon.nH)(this.K)).e())));
    if (!((life4_5 != null))) {
        lexicalValue237_317_0 = ((spill237_13) ? 1 : 0);
        break lexical_join_317;
    }
    if (!(spill237_13)) {
        break lexical_join_311;
    }
    return;
    }
    spill237_14 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_350_0 = spill237_14;
        break lexical_join_350;
    }
    lexicalValue237_317_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.InventoryManager)(spill237_14)).t)).isSelected(((java.lang.Enum)(com.moon.bC.MOVE_BLOCKS)))) ? 1 : 0);
    }
    if (!((lexicalValue237_317_0 != 0))) {
        break lexical_join_349;
    }
    spill237_15 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_350_0 = spill237_15;
        break lexical_join_350;
    }
    if (!((((com.moon.module.impl.InventoryManager)(spill237_15)).L == null))) {
        break lexical_join_349;
    }
    spill237_16 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_350_0 = spill237_16;
        break lexical_join_350;
    }
    life5_457 = ((com.moon.nH)(((com.moon.module.impl.InventoryManager)(spill237_16)).K)).d();
    if (!((life5_457 != -1))) {
        break lexical_join_349;
    }
    if (!((life5_457 != __sourceIntrinsic_9f71572286bb_invokedynamic237_145(31218, (1404757435096983349L ^ life2_3))))) {
        break lexical_join_349;
    }
    ((com.moon.nH)(this.K)).a(((int)(__sourceIntrinsic_9f71572286bb_invokedynamic237_147(4684, (1206824227056159878L ^ life2_3)))), ((int)(life5_457)));
    return;
    }
    lexicalValue237_350_0 = this;
    }
    if (!((((com.moon.gd)(((com.moon.module.impl.KillAura)(((com.moon.module.impl.InventoryManager)(lexicalValue237_350_0)).N)).a__gd())).a__sG() == null))) {
        break lexical_join_356;
    }
    lexicalValue237_357_0 = 1;
    break lexical_join_357;
    }
    lexicalValue237_357_0 = 0;
    }
    life5_493 = lexicalValue237_357_0;
    spill237_17 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_POTION)));
    if (!((life4_5 != null))) {
        lexicalValue237_577_0 = ((spill237_17) ? 1 : 0);
        break lexical_join_577;
    }
    if (!(spill237_17)) {
        break lexical_join_573;
    }
    spill237_18 = life5_493;
    if (!((life4_5 != null))) {
        lexicalValue237_577_0 = spill237_18;
        break lexical_join_577;
    }
    if (!((spill237_18 != 0))) {
        break lexical_join_573;
    }
    spill237_19 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).A;
    if (!((life4_5 != null))) {
        lexicalValue237_577_0 = ((spill237_19) ? 1 : 0);
        break lexical_join_577;
    }
    if (!(spill237_19)) {
        break lexical_join_573;
    }
    spill237_20 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_574_0 = spill237_20;
        break lexical_join_574;
    }
    if (!((((com.moon.module.impl.InventoryManager)(spill237_20)).L == null))) {
        break lexical_join_573;
    }
    spill237_21 = ((com.moon.nW)(this.J)).a(((long)((((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.D)).getValue())))).intValue()) + __sourceIntrinsic_9f71572286bb_invokedynamic237_166(30832, (9025964935088583179L ^ life2_3))))));
    if (!((life4_5 != null))) {
        lexicalValue237_577_0 = ((spill237_21) ? 1 : 0);
        break lexical_join_577;
    }
    if (!(spill237_21)) {
        break lexical_join_573;
    }
    life6_566 = ((com.moon.nH)(this.K)).a(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.i)).a__Int())));
    life7_572 = ((com.moon.nH)(this.K)).a(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)).a__Int())));
    life8_578 = ((com.moon.nH)(this.K)).a(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)).a__Int())));
    life9_584 = ((com.moon.nH)(this.K)).a(((int)(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n)).a__Int())));
    spill237_22 = ((com.moon.setting.MultiSelectSetting)(this.E)).isSelected(((java.lang.Enum)(com.moon.bA.INSTANT_HEAL)));
    if (!((life4_5 != null))) {
        lexicalValue237_457_0 = ((spill237_22) ? 1 : 0);
        break lexical_join_457;
    }
    if (!(spill237_22)) {
        break lexical_join_453;
    }
    spill237_23 = life6_566;
    if (!((life4_5 != null))) {
        lexicalValue237_457_0 = spill237_23;
        break lexical_join_457;
    }
    if (!((spill237_23 != -1))) {
        break lexical_join_453;
    }
    spill237_24 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).b__sourceReturn_bc607678b6())), ((float)(((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.F)).getValue())))).intValue()))));
    if (!((life4_5 != null))) {
        lexicalValue237_457_0 = spill237_24;
        break lexical_join_457;
    }
    if (!((spill237_24 <= 0))) {
        break lexical_join_453;
    }
    this.L = ((java.lang.Integer)(java.lang.Integer.valueOf(((int)(life6_566)))));
    if (!((life4_5 == null))) {
        break lexical_join_537;
    }
    }
    lexicalValue237_457_0 = ((((com.moon.setting.MultiSelectSetting)(this.E)).isSelected(((java.lang.Enum)(com.moon.bA.REGENERATION)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_495_0 = lexicalValue237_457_0;
        break lexical_join_495;
    }
    if (!((lexicalValue237_457_0 != 0))) {
        break lexical_join_491;
    }
    spill237_25 = life7_572;
    if (!((life4_5 != null))) {
        lexicalValue237_495_0 = spill237_25;
        break lexical_join_495;
    }
    if (!((spill237_25 != -1))) {
        break lexical_join_491;
    }
    spill237_26 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.m)));
    if (!((life4_5 != null))) {
        lexicalValue237_495_0 = ((spill237_26) ? 1 : 0);
        break lexical_join_495;
    }
    if (!((!spill237_26))) {
        break lexical_join_491;
    }
    spill237_27 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).b__sourceReturn_bc607678b6())), ((float)(((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.F)).getValue())))).intValue()))));
    if (!((life4_5 != null))) {
        lexicalValue237_495_0 = spill237_27;
        break lexical_join_495;
    }
    if (!((spill237_27 <= 0))) {
        break lexical_join_491;
    }
    this.L = ((java.lang.Integer)(java.lang.Integer.valueOf(((int)(life7_572)))));
    if (!((life4_5 == null))) {
        break lexical_join_537;
    }
    }
    lexicalValue237_495_0 = ((((com.moon.setting.MultiSelectSetting)(this.E)).isSelected(((java.lang.Enum)(com.moon.bA.SPEED)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_522_0 = lexicalValue237_495_0;
        break lexical_join_522;
    }
    if (!((lexicalValue237_495_0 != 0))) {
        break lexical_join_516;
    }
    spill237_28 = life8_578;
    if (!((life4_5 != null))) {
        lexicalValue237_522_0 = spill237_28;
        break lexical_join_522;
    }
    if (!((spill237_28 != -1))) {
        break lexical_join_516;
    }
    spill237_29 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.d)));
    if (!((life4_5 != null))) {
        lexicalValue237_522_0 = ((spill237_29) ? 1 : 0);
        break lexical_join_522;
    }
    if (!((!spill237_29))) {
        break lexical_join_516;
    }
    this.L = ((java.lang.Integer)(java.lang.Integer.valueOf(((int)(life8_578)))));
    if (!((life4_5 == null))) {
        break lexical_join_537;
    }
    }
    spill237_30 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_538_0 = spill237_30;
        break lexical_join_538;
    }
    lexicalValue237_522_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.InventoryManager)(spill237_30)).E)).isSelected(((java.lang.Enum)(com.moon.bA.RESISTANCE)))) ? 1 : 0);
    }
    if (!((lexicalValue237_522_0 != 0))) {
        break lexical_join_537;
    }
    spill237_31 = life9_584;
    if (!((life4_5 != null))) {
        lexicalValue237_532_0 = spill237_31;
        break lexical_join_532;
    }
    if (!((spill237_31 != -1))) {
        break lexical_join_537;
    }
    lexicalValue237_532_0 = ((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).a__Boolean(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.n)))) ? 1 : 0);
    }
    if (!((lexicalValue237_532_0 == 0))) {
        break lexical_join_537;
    }
    this.L = ((java.lang.Integer)(java.lang.Integer.valueOf(((int)(life9_584)))));
    }
    lexicalValue237_538_0 = this;
    }
    if (!((life4_5 != null))) {
        lexicalValue237_574_0 = lexicalValue237_538_0;
        break lexical_join_574;
    }
    if (!((((com.moon.module.impl.InventoryManager)(lexicalValue237_538_0)).L != null))) {
        break lexical_join_573;
    }
    spill237_32 = this;
    if (!((life4_5 != null))) {
        lexicalValue237_565_0 = spill237_32;
        break lexical_join_565;
    }
    if (!((((java.lang.Integer)(((com.moon.module.impl.InventoryManager)(spill237_32)).L)).intValue() > __sourceIntrinsic_9f71572286bb_invokedynamic237_243(4684, (1206824227056159878L ^ life2_3))))) {
        break lexical_join_572;
    }
    ((com.moon.nH)(this.K)).a(((int)(__sourceIntrinsic_9f71572286bb_invokedynamic237_245(4684, (1206824227056159878L ^ life2_3)))), ((int)(((java.lang.Integer)(this.L)).intValue())));
    lexicalValue237_565_0 = this;
    }
    ((com.moon.module.impl.InventoryManager)(lexicalValue237_565_0)).L = ((java.lang.Integer)(java.lang.Integer.valueOf(((int)(__sourceIntrinsic_9f71572286bb_invokedynamic237_249(4684, (1206824227056159878L ^ life2_3)))))));
    }
    return;
    }
    lexicalValue237_574_0 = this;
    }
    lexicalValue237_577_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.InventoryManager)(lexicalValue237_574_0)).t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_SOUP)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_680_0 = lexicalValue237_577_0;
        break lexical_join_680;
    }
    if (!((lexicalValue237_577_0 != 0))) {
        break lexical_join_676;
    }
    life6_845 = ((com.moon.nH)(this.K)).g();
    spill237_33 = life6_845;
    if (!((life4_5 != null))) {
        lexicalValue237_680_0 = spill237_33;
        break lexical_join_680;
    }
    if (!((spill237_33 != -1))) {
        break lexical_join_676;
    }
    spill237_34 = recovery.source.CarrierOps.fcmpg(((float)((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).b__sourceReturn_bc607678b6() + 0x1.0p0f))), ((float)(((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.F)).getValue())))).intValue()))));
    if (!((life4_5 != null))) {
        lexicalValue237_680_0 = spill237_34;
        break lexical_join_680;
    }
    if (!((spill237_34 <= 0))) {
        break lexical_join_676;
    }
    spill237_35 = ((com.moon.nW)(this.I)).a(((long)(__sourceIntrinsic_9f71572286bb_invokedynamic237_267(23027, (5664969360427127691L ^ life2_3)))));
    if (!((life4_5 != null))) {
        lexicalValue237_680_0 = ((spill237_35) ? 1 : 0);
        break lexical_join_680;
    }
    if (!(spill237_35)) {
        break lexical_join_676;
    }
    spill237_36 = life6_845;
    if (!((life4_5 != null))) {
        lexicalValue237_643_0 = spill237_36;
        break lexical_join_643;
    }
    if (!((spill237_36 > __sourceIntrinsic_9f71572286bb_invokedynamic237_270(4684, (1206824227056159878L ^ life2_3))))) {
        break lexical_join_639;
    }
    ((com.moon.nH)(this.K)).a(((int)(__sourceIntrinsic_9f71572286bb_invokedynamic237_272(4684, (1206824227056159878L ^ life2_3)))), ((int)(life6_845)));
    life6_845 = __sourceIntrinsic_9f71572286bb_invokedynamic237_274(4684, (1206824227056159878L ^ life2_3));
    }
    lexicalValue237_643_0 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).bD)).c;
    }
    life7_926 = lexicalValue237_643_0;
    ((com.moon.module.impl.InventoryManager)(this)).a(((int)(life6_845)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).cm)).a(((moom.yK)(new moom.zb(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).a__xW()))));
    ((com.moon.module.impl.InventoryManager)(this)).a(((int)(life7_926)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.InventoryManager.d)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.DROP_ITEM, moom.DT.f, moom.bs.DOWN))));
    ((com.moon.nW)(this.I)).a__Void();
    ((com.moon.nW)(this.J)).a__Void();
    }
    lexicalValue237_680_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN)))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        lexicalValue237_686_0 = lexicalValue237_680_0;
        break lexical_join_686;
    }
    if (!((lexicalValue237_680_0 != 0))) {
        break lexical_join_695;
    }
    lexicalValue237_686_0 = ((com.moon.nH)(this.K)).i();
    }
    life6_229 = lexicalValue237_686_0;
    lexicalValue237_689_0 = life6_229;
    lexicalValue237_689_1 = -1;
    }
    if (!((lexicalValue237_689_0 != lexicalValue237_689_1))) {
        break lexical_join_695;
    }
    ((com.moon.nH)(this.K)).a(((int)(life6_229)), ((boolean)(true)));
    }
    return;
}


private boolean a(int p0, int p1) {
int forwardValue860_19_0;
    int spill860_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_19: {
    forward_join_18: {
    life3_3 = (com.moon.module.impl.InventoryManager.P ^ 54396110641789L);
    life5_5 = com.moon.bF.b();
    spill860_0 = p1;
    if (!((life5_5 != null))) {
        forwardValue860_19_0 = spill860_0;
        break forward_join_19;
    }
    if (!((spill860_0 != -1))) {
        break forward_join_18;
    }
    ((com.moon.nH)(this.K)).a(((int)(p0)), ((int)(p1)));
    return ((1) != 0);
    }
    forwardValue860_19_0 = 0;
    }
    return ((forwardValue860_19_0) != 0);
}


private long a() {
long local1 = (com.moon.module.impl.InventoryManager.P ^ 130294743736707L);
    int local3 = (com.moon.nI.a(((int)(0)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.v)).getValue())))).intValue()))) + __sourceIntrinsic_d3e4e16d7952_originalDynamicSite521_6(18731, (3324058357728197147L ^ local1)));
    local3 = (local3 - (local3 % __sourceIntrinsic_d3e4e16d7952_originalDynamicSite521_7(29546, (8262719398746456158L ^ local1))));
    return ((long) (((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.u)).getValue())))).intValue() + local3));
}


private java.lang.Boolean lambda$new$0() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN))))));
}


private java.lang.Boolean lambda$new$1() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN))))));
}


private java.lang.Boolean lambda$new$9() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_POTION))))));
}


private java.lang.Boolean lambda$new$3() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN))))));
}


private java.lang.Boolean lambda$new$2() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN))))));
}


private java.lang.Boolean lambda$new$4() {
int forwardValue862_18_0;
    int forwardValue862_22_0;
    int forwardValue862_24_0;
    boolean spill862_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    life1_3 = (com.moon.module.impl.InventoryManager.P ^ 123058821208773L);
    life3_5 = com.moon.bF.b();
    spill862_0 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN)));
    if (!((life3_5 != null))) {
        forwardValue862_18_0 = ((spill862_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill862_0)) {
        break forward_join_23;
    }
    forwardValue862_18_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.z)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue862_22_0 = forwardValue862_18_0;
        break forward_join_22;
    }
    if (!((forwardValue862_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue862_22_0 = 1;
    }
    forwardValue862_24_0 = forwardValue862_22_0;
    break forward_join_24;
    }
    forwardValue862_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue862_24_0))));
}


private java.lang.Boolean lambda$new$8() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.E)).isSelected(((java.lang.Enum)(com.moon.bA.INSTANT_HEAL))))));
}


private java.lang.Boolean lambda$new$6() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN))))));
}


private java.lang.Boolean lambda$new$5() {
int forwardValue863_18_0;
    int forwardValue863_26_0;
    int forwardValue863_30_0;
    int forwardValue863_32_0;
    boolean spill863_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_26: {
    forward_join_18: {
    life1_3 = (com.moon.module.impl.InventoryManager.P ^ 28697389521222L);
    life3_5 = com.moon.bF.b();
    spill863_0 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_CLEAN)));
    if (!((life3_5 != null))) {
        forwardValue863_18_0 = ((spill863_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill863_0)) {
        break forward_join_31;
    }
    forwardValue863_18_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.z)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue863_26_0 = forwardValue863_18_0;
        break forward_join_26;
    }
    if (!((forwardValue863_18_0 != 0))) {
        break forward_join_31;
    }
    forwardValue863_26_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue863_30_0 = forwardValue863_26_0;
        break forward_join_30;
    }
    if (!((forwardValue863_26_0 != 0))) {
        break forward_join_31;
    }
    forwardValue863_30_0 = 1;
    }
    forwardValue863_32_0 = forwardValue863_30_0;
    break forward_join_32;
    }
    forwardValue863_32_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue863_32_0))));
}


private java.lang.Boolean lambda$new$7() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bC.AUTO_POTION))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_89(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_91(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_96(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_99(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_101(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_106(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_109(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_111(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_119(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_121(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_126(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_129(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_131(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_136(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_141(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_143(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_151(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_174(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_179(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_190(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_192(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_197(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_201(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_221(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_224(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_228(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_230(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_236(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_927b7e1289a7cdfb_originalDynamicSite27_250(com.moon.module.impl.InventoryManager a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3e4e16d7952_originalDynamicSite521_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3e4e16d7952_originalDynamicSite521_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_9f71572286bb_invokedynamic237_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_147(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_9f71572286bb_invokedynamic237_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_243(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_245(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_249(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_9f71572286bb_invokedynamic237_267(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_270(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_272(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic237_274(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2521_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2524_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral2519_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
