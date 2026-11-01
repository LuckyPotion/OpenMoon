package com.moon;


public class fS extends com.moon.e2<com.moon.module.impl.Timer> {

private com.moon.module.impl.HUD e;

private com.moon.module.impl.Effects f;

private boolean g;

private boolean h;

private long i;

private long j;

private float k;

private float l;

private float m;

private float n;

private java.lang.String o;

private static long q;

private static java.lang.String[] r;

private static java.lang.String[] s;

private static java.util.Map t;

private static long u;

private static long[] v;

private static java.lang.Long[] w;

private static java.util.Map x;

public fS() {
super(com.moon.module.impl.Timer.class);
    this.o = "";
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(6122553562128050817L)), ((long)(1917895193346252800L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(221455008868238L)))));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (com.moon.fS.q ^ 14905116023088L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill94_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill94_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill94_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill94_14 = new byte[8];
    (__sourceSpill94_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill94_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation94_16 = __sourceSpill94_14;
    ((javax.crypto.Cipher)(__sourceSpill94_11)).init(((int)(__sourceSpill94_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill94_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation94_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[4];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "À{ûû\020PÔí\024QïÑd\036\030eð Ë²\005\020Â¼\177hÜ#\017«À¢\036Åv"))).length();
    int local21_life24 = 16;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill94_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill94_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill94_29)).doFinal(((byte[])(__sourceSpill94_28)));
        java.lang.String __sourceSpill94_34 = ((java.lang.String)(com.moon.fS.a(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill94_35 = local25_life19;
        int __sourceSpill94_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill94_35)[__sourceSpill94_36] = __sourceSpill94_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    local24_life23 = ((java.lang.String)((local22_life21 = "\026ì\037$n\n\031ª§2Í¸pq\030TäVF;\0222bBR\024á\"Æë5ü"))).length();
    local21_life24 = 16;
    local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill94_41 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill94_42 = local18_life9;
        byte[] local26_life44 = ((javax.crypto.Cipher)(__sourceSpill94_42)).doFinal(((byte[])(__sourceSpill94_41)));
        java.lang.String __sourceSpill94_47 = ((java.lang.String)(com.moon.fS.a(((byte[])(local26_life44))))).intern();
        java.lang.String[] __sourceSpill94_48 = local25_life19;
        int __sourceSpill94_49 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill94_48)[__sourceSpill94_49] = __sourceSpill94_47;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    r = ((java.lang.String[])(local25_life19));
    s = ((java.lang.String[])(new java.lang.String[4]));
    javax.crypto.Cipher local11_life54;
    javax.crypto.Cipher __sourceSpill94_56 = (local11_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill94_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill94_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill94_59 = new byte[8];
    (__sourceSpill94_59)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local12_life60 = 1;
    while ((local12_life60 < 8)) {
        (__sourceSpill94_59)[local12_life60] = ((byte) ((int) ((local16_life7 << (local12_life60 * 8)) >>> 56)));
        local12_life60 += 1;
    }
    byte[] __sourcePreallocation94_61 = __sourceSpill94_59;
    ((javax.crypto.Cipher)(__sourceSpill94_56)).init(((int)(__sourceSpill94_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill94_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation94_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local13_life64 = 8510404962132521791L;
    byte[] __sourceSpill94_65 = new byte[8];
    (__sourceSpill94_65)[0] = ((byte) ((int) (local13_life64 >>> 56)));
    (__sourceSpill94_65)[1] = ((byte) ((int) (local13_life64 >>> 48)));
    (__sourceSpill94_65)[2] = ((byte) ((int) (local13_life64 >>> 40)));
    (__sourceSpill94_65)[3] = ((byte) ((int) (local13_life64 >>> 32)));
    (__sourceSpill94_65)[4] = ((byte) ((int) (local13_life64 >>> 24)));
    (__sourceSpill94_65)[5] = ((byte) ((int) (local13_life64 >>> 16)));
    (__sourceSpill94_65)[6] = ((byte) ((int) (local13_life64 >>> 8)));
    (__sourceSpill94_65)[7] = ((byte) ((int) local13_life64));
    javax.crypto.Cipher __sourceSpill94_66 = local11_life54;
    byte[] local15_life68 = ((javax.crypto.Cipher)(__sourceSpill94_66)).doFinal(((byte[])(__sourceSpill94_65)));
    u = ((long)((((((((((((long) (local15_life68)[0]) & 255L) << 56) | ((((long) (local15_life68)[1]) & 255L) << 48)) | ((((long) (local15_life68)[2]) & 255L) << 40)) | ((((long) (local15_life68)[3]) & 255L) << 32)) | ((((long) (local15_life68)[4]) & 255L) << 24)) | ((((long) (local15_life68)[5]) & 255L) << 16)) | ((((long) (local15_life68)[6]) & 255L) << 8)) | (((long) (local15_life68)[7]) & 255L))));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life72;
    javax.crypto.Cipher __sourceSpill94_74 = (local0_life72 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill94_75 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill94_76 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill94_77 = new byte[8];
    (__sourceSpill94_77)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life78 = 1;
    while ((local1_life78 < 8)) {
        (__sourceSpill94_77)[local1_life78] = ((byte) ((int) ((local16_life7 << (local1_life78 * 8)) >>> 56)));
        local1_life78 += 1;
    }
    byte[] __sourcePreallocation94_79 = __sourceSpill94_77;
    ((javax.crypto.Cipher)(__sourceSpill94_74)).init(((int)(__sourceSpill94_75)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill94_76)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation94_79)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life82 = new long[5];
    int local3_life83 = 0;
    java.lang.String local4_life84;
    int local5_life86 = ((java.lang.String)((local4_life84 = "R\022¿¤^4¨bU¤\fMyÈïùr¬}`~"))).length();
    int local2_life87 = 0;
    do {
        java.lang.String __sourceSpill94_88 = local4_life84;
        int __sourceSpill94_89 = local2_life87;
        local2_life87 += 8;
        byte[] local7_life92 = ((java.lang.String)(((java.lang.String)(__sourceSpill94_88)).substring(((int)(__sourceSpill94_89)), ((int)(local2_life87))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill94_93 = local6_life82;
        int __sourceSpill94_94 = local3_life83;
        local3_life83 += 1;
        long local8_life95 = (((((((((((long) (local7_life92)[0]) & 255L) << 56) | ((((long) (local7_life92)[1]) & 255L) << 48)) | ((((long) (local7_life92)[2]) & 255L) << 40)) | ((((long) (local7_life92)[3]) & 255L) << 32)) | ((((long) (local7_life92)[4]) & 255L) << 24)) | ((((long) (local7_life92)[5]) & 255L) << 16)) | ((((long) (local7_life92)[6]) & 255L) << 8)) | (((long) (local7_life92)[7]) & 255L));
        byte[] __sourceSpill94_96 = new byte[8];
        (__sourceSpill94_96)[0] = ((byte) ((int) (local8_life95 >>> 56)));
        (__sourceSpill94_96)[1] = ((byte) ((int) (local8_life95 >>> 48)));
        (__sourceSpill94_96)[2] = ((byte) ((int) (local8_life95 >>> 40)));
        (__sourceSpill94_96)[3] = ((byte) ((int) (local8_life95 >>> 32)));
        (__sourceSpill94_96)[4] = ((byte) ((int) (local8_life95 >>> 24)));
        (__sourceSpill94_96)[5] = ((byte) ((int) (local8_life95 >>> 16)));
        (__sourceSpill94_96)[6] = ((byte) ((int) (local8_life95 >>> 8)));
        (__sourceSpill94_96)[7] = ((byte) ((int) local8_life95));
        javax.crypto.Cipher __sourceSpill94_97 = local0_life72;
        byte[] local10_life99 = ((javax.crypto.Cipher)(__sourceSpill94_97)).doFinal(((byte[])(__sourceSpill94_96)));
        (__sourceSpill94_93)[__sourceSpill94_94] = (((((((((((long) (local10_life99)[0]) & 255L) << 56) | ((((long) (local10_life99)[1]) & 255L) << 48)) | ((((long) (local10_life99)[2]) & 255L) << 40)) | ((((long) (local10_life99)[3]) & 255L) << 32)) | ((((long) (local10_life99)[4]) & 255L) << 24)) | ((((long) (local10_life99)[5]) & 255L) << 16)) | ((((long) (local10_life99)[6]) & 255L) << 8)) | (((long) (local10_life99)[7]) & 255L));
    } while ((!(local2_life87 >= local5_life86)));
    local5_life86 = ((java.lang.String)((local4_life84 = "ð'½ÏT\026\\v£w¬f\031"))).length();
    local2_life87 = 0;
    do {
        java.lang.String __sourceSpill94_101 = local4_life84;
        int __sourceSpill94_102 = local2_life87;
        local2_life87 += 8;
        byte[] local7_life105 = ((java.lang.String)(((java.lang.String)(__sourceSpill94_101)).substring(((int)(__sourceSpill94_102)), ((int)(local2_life87))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill94_106 = local6_life82;
        int __sourceSpill94_107 = local3_life83;
        local3_life83 += 1;
        long local8_life108 = (((((((((((long) (local7_life105)[0]) & 255L) << 56) | ((((long) (local7_life105)[1]) & 255L) << 48)) | ((((long) (local7_life105)[2]) & 255L) << 40)) | ((((long) (local7_life105)[3]) & 255L) << 32)) | ((((long) (local7_life105)[4]) & 255L) << 24)) | ((((long) (local7_life105)[5]) & 255L) << 16)) | ((((long) (local7_life105)[6]) & 255L) << 8)) | (((long) (local7_life105)[7]) & 255L));
        byte[] __sourceSpill94_109 = new byte[8];
        (__sourceSpill94_109)[0] = ((byte) ((int) (local8_life108 >>> 56)));
        (__sourceSpill94_109)[1] = ((byte) ((int) (local8_life108 >>> 48)));
        (__sourceSpill94_109)[2] = ((byte) ((int) (local8_life108 >>> 40)));
        (__sourceSpill94_109)[3] = ((byte) ((int) (local8_life108 >>> 32)));
        (__sourceSpill94_109)[4] = ((byte) ((int) (local8_life108 >>> 24)));
        (__sourceSpill94_109)[5] = ((byte) ((int) (local8_life108 >>> 16)));
        (__sourceSpill94_109)[6] = ((byte) ((int) (local8_life108 >>> 8)));
        (__sourceSpill94_109)[7] = ((byte) ((int) local8_life108));
        javax.crypto.Cipher __sourceSpill94_110 = local0_life72;
        byte[] local10_life112 = ((javax.crypto.Cipher)(__sourceSpill94_110)).doFinal(((byte[])(__sourceSpill94_109)));
        (__sourceSpill94_106)[__sourceSpill94_107] = (((((((((((long) (local10_life112)[0]) & 255L) << 56) | ((((long) (local10_life112)[1]) & 255L) << 48)) | ((((long) (local10_life112)[2]) & 255L) << 40)) | ((((long) (local10_life112)[3]) & 255L) << 32)) | ((((long) (local10_life112)[4]) & 255L) << 24)) | ((((long) (local10_life112)[5]) & 255L) << 16)) | ((((long) (local10_life112)[6]) & 255L) << 8)) | (((long) (local10_life112)[7]) & 255L));
    } while ((!(local2_life87 >= local5_life86)));
    v = ((long[])(local6_life82));
    w = ((java.lang.Long[])(new java.lang.Long[5]));
}

private static native <E extends Throwable> void __sourceHandlerCall_ff091bc003c50a098f7c(com.moon.fS a0, com.moon.event.Render2DEvent a1) throws E;
private static final class __SourceHandler_ff091bc003c50a098f7c {

public static void f53(com.moon.fS receiver, com.moon.event.Render2DEvent p0) throws Throwable {
    java.lang.Object forestValue53_19_0;
    com.moon.hW forestValue53_138_0;
    float forestValue53_138_1;
    float forestValue53_138_2;
    float forestValue53_138_3;
    float forestValue53_138_4;
    float forestValue53_138_5;
    com.moon.aO forestValue53_138_6;
    com.moon.aO forestValue53_138_7;
    com.moon.hW forestValue53_140_0;
    float forestValue53_140_1;
    float forestValue53_140_2;
    float forestValue53_140_3;
    float forestValue53_140_4;
    float forestValue53_140_5;
    com.moon.aO forestValue53_140_6;
    com.moon.aO forestValue53_140_7;
    int forestValue53_140_8;
    boolean spill53_0;
    com.moon.event.RenderPhase spill53_1;
    java.lang.String spill53_2;
    long spill53_3;
    com.moon.hW spill53_4;
    float spill53_5;
    float spill53_6;
    float spill53_7;
    float spill53_8;
    float spill53_9;
    com.moon.aO spill53_10;
    com.moon.hW spill53_11;
    float spill53_12;
    float spill53_13;
    float spill53_14;
    float spill53_15;
    float spill53_16;
    com.moon.aO spill53_17;
    com.moon.aO spill53_18;
    long life2_3;
    int life4_7;
    com.moon.jm life5_28;
    moom.ir life6_30;
    java.lang.String life7_46;
    int life8_53;
    float life9_58;
    com.moon.hW life10_97;
    com.moon.hW life11_156;
    forest_join_174: {
    forest_join_140: {
    forest_join_138: {
    forest_join_19: {
    life2_3 = (__fieldRead53_0() ^ 18787799647184L);
    spill53_0 = __call53_1();
    __call53_2(receiver);
    life4_7 = __integerCategory53_3(spill53_0);
    spill53_1 = __call53_4(p0);
    if (!((life4_7 != 0))) {
        forestValue53_19_0 = spill53_1;
        break forest_join_19;
    }
    if (!((spill53_1 == __fieldRead53_5()))) {
        break forest_join_174;
    }
    forestValue53_19_0 = __call53_9(__call53_8(__cast53_7(__call53_6(receiver))));
    }
    if (!(__call53_11(__cast53_10(forestValue53_19_0)))) {
        break forest_join_174;
    }
    life5_28 = __call53_15(__call53_13(__call53_12()), __fieldRead53_14());
    life6_30 = __call53_16();
    long __stackOp53_19_0 = __fieldRead53_17(receiver);
    java.lang.String __stackOp53_19_1 = __invokedynamic53_18(17475, (6754655415390426683L ^ life2_3));
    spill53_2 = __stackOp53_19_1;
    spill53_3 = __stackOp53_19_0;
    __discardScalar53_20(__stackOp53_19_1);
    life7_46 = __invokedynamic53_22(spill53_2, spill53_3, __invokedynamic53_21(20102, (8340133199267126525L ^ life2_3)));
    life8_53 = __call53_27(__cast53_26(__call53_25(__call53_24(__fieldRead53_23(receiver)))));
    life9_58 = __call53_28(life5_28, life7_46, 0x1.4p3f);
    __fieldWrite53_30(receiver, (((((float) __call53_29(life6_30)) / 0x1.0p1f) - (life9_58 / 0x1.0p1f)) - 0x1.0p2f));
    __fieldWrite53_32(receiver, ((((float) __call53_31(life6_30)) / 0x1.0p1f) + 0x1.4p3f));
    __fieldWrite53_33(receiver, (life9_58 + 0x1.0p3f));
    __fieldWrite53_35(receiver, (__call53_34(life5_28, 0x1.0p3f) + 0x1.0p3f));
    life10_97 = __call53_39(__call53_38(__call53_36(), __fieldRead53_37()));
    spill53_4 = life10_97;
    spill53_5 = __fieldRead53_40(receiver);
    spill53_6 = __fieldRead53_41(receiver);
    spill53_7 = __fieldRead53_42(receiver);
    spill53_8 = __fieldRead53_43(receiver);
    spill53_9 = 0x1.0p2f;
    com.moon.aO __stackOp53_45_0 = __sourceUninitializedNEW53_44();
    spill53_10 = __stackOp53_45_0;
    __explicitNewInit53_47(__stackOp53_45_0, ((int) __fieldRead53_46()));
    __call53_51(spill53_4, __call53_50(spill53_5, spill53_6, spill53_7, spill53_8, spill53_9, __call53_49(__call53_48(spill53_10, 0x1.99999ap-2f))));
    spill53_11 = life10_97;
    spill53_12 = __fieldRead53_52(receiver);
    spill53_13 = __fieldRead53_53(receiver);
    spill53_14 = __fieldRead53_54(receiver);
    spill53_15 = __fieldRead53_55(receiver);
    spill53_16 = 0x1.0p2f;
    com.moon.aO __stackOp53_57_0 = __sourceUninitializedNEW53_56();
    spill53_17 = __stackOp53_57_0;
    spill53_18 = __stackOp53_57_0;
    if (!(__call53_63(__cast53_62(__call53_61(__call53_60(__cast53_59(__call53_58(receiver)))))))) {
        forestValue53_138_0 = spill53_11;
        forestValue53_138_1 = spill53_12;
        forestValue53_138_2 = spill53_13;
        forestValue53_138_3 = spill53_14;
        forestValue53_138_4 = spill53_15;
        forestValue53_138_5 = spill53_16;
        forestValue53_138_6 = spill53_17;
        forestValue53_138_7 = spill53_18;
        break forest_join_138;
    }
    forestValue53_140_0 = spill53_11;
    forestValue53_140_1 = spill53_12;
    forestValue53_140_2 = spill53_13;
    forestValue53_140_3 = spill53_14;
    forestValue53_140_4 = spill53_15;
    forestValue53_140_5 = spill53_16;
    forestValue53_140_6 = spill53_17;
    forestValue53_140_7 = spill53_18;
    forestValue53_140_8 = life8_53;
    break forest_join_140;
    }
    forestValue53_140_0 = forestValue53_138_0;
    forestValue53_140_1 = forestValue53_138_1;
    forestValue53_140_2 = forestValue53_138_2;
    forestValue53_140_3 = forestValue53_138_3;
    forestValue53_140_4 = forestValue53_138_4;
    forestValue53_140_5 = forestValue53_138_5;
    forestValue53_140_6 = forestValue53_138_6;
    forestValue53_140_7 = forestValue53_138_7;
    forestValue53_140_8 = __call53_65(__fieldRead53_64());
    }
    __explicitNewInit53_66(forestValue53_140_7, forestValue53_140_8);
    __call53_70(forestValue53_140_0, __call53_69(forestValue53_140_1, forestValue53_140_2, forestValue53_140_3, forestValue53_140_4, forestValue53_140_5, __call53_68(__call53_67(forestValue53_140_6, 0x1.99999ap-3f))));
    __call53_71(life10_97);
    life11_156 = __call53_76(__call53_75(__call53_74(__call53_72(), __fieldRead53_73()), life5_28));
    __call53_79(life5_28, life11_156, life7_46, 0x1.4p3f, (__fieldRead53_77(receiver) + 0x1.0p2f), (__fieldRead53_78(receiver) + 0x1.cp1f), -1);
    __call53_80(life11_156);
    __fieldWrite53_81(receiver, life7_46);
    }
    return;
}
private static native long __fieldRead53_0() throws Throwable;
private static native boolean __call53_1() throws Throwable;
private static native void __call53_2(com.moon.fS a0) throws Throwable;
private static native int __integerCategory53_3(boolean value) throws Throwable;
private static native com.moon.event.RenderPhase __call53_4(com.moon.event.Render2DEvent a0) throws Throwable;
private static native com.moon.event.RenderPhase __fieldRead53_5() throws Throwable;
private static native com.moon.module.Module __call53_6(com.moon.fS a0) throws Throwable;
private static native com.moon.module.impl.Timer __cast53_7(com.moon.module.Module a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call53_8(com.moon.module.impl.Timer a0) throws Throwable;
private static native java.lang.Object __call53_9(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast53_10(java.lang.Object a0) throws Throwable;
private static native boolean __call53_11(java.lang.Boolean a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call53_12() throws Throwable;
private static native com.moon.jo __call53_13(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead53_14() throws Throwable;
private static native com.moon.jm __call53_15(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native moom.ir __call53_16() throws Throwable;
private static native long __fieldRead53_17(com.moon.fS a0) throws Throwable;
private static native java.lang.String __invokedynamic53_18(int a0, long a1) throws Throwable;
private static native void __discardScalar53_20(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic53_21(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic53_22(java.lang.String a0, long a1, java.lang.String a2) throws Throwable;
private static native com.moon.module.impl.HUD __fieldRead53_23(com.moon.fS a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call53_24(com.moon.module.impl.HUD a0) throws Throwable;
private static native java.lang.Object __call53_25(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast53_26(java.lang.Object a0) throws Throwable;
private static native int __call53_27(java.lang.Integer a0) throws Throwable;
private static native float __call53_28(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native int __call53_29(moom.ir a0) throws Throwable;
private static native void __fieldWrite53_30(com.moon.fS a0, float a1) throws Throwable;
private static native int __call53_31(moom.ir a0) throws Throwable;
private static native void __fieldWrite53_32(com.moon.fS a0, float a1) throws Throwable;
private static native void __fieldWrite53_33(com.moon.fS a0, float a1) throws Throwable;
private static native float __call53_34(com.moon.jm a0, float a1) throws Throwable;
private static native void __fieldWrite53_35(com.moon.fS a0, float a1) throws Throwable;
private static native com.moon.hX __call53_36() throws Throwable;
private static native com.moon.cb __fieldRead53_37() throws Throwable;
private static native com.moon.hX __call53_38(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call53_39(com.moon.hX a0) throws Throwable;
private static native float __fieldRead53_40(com.moon.fS a0) throws Throwable;
private static native float __fieldRead53_41(com.moon.fS a0) throws Throwable;
private static native float __fieldRead53_42(com.moon.fS a0) throws Throwable;
private static native float __fieldRead53_43(com.moon.fS a0) throws Throwable;
private static native com.moon.aO __sourceUninitializedNEW53_44() throws Throwable;
private static native long __fieldRead53_46() throws Throwable;
private static native void __explicitNewInit53_47(com.moon.aO a0, int a1) throws Throwable;
private static native com.moon.aO __call53_48(com.moon.aO a0, float a1) throws Throwable;
private static native int __call53_49(com.moon.aO a0) throws Throwable;
private static native com.moon.i3 __call53_50(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call53_51(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native float __fieldRead53_52(com.moon.fS a0) throws Throwable;
private static native float __fieldRead53_53(com.moon.fS a0) throws Throwable;
private static native float __fieldRead53_54(com.moon.fS a0) throws Throwable;
private static native float __fieldRead53_55(com.moon.fS a0) throws Throwable;
private static native com.moon.aO __sourceUninitializedNEW53_56() throws Throwable;
private static native com.moon.module.Module __call53_58(com.moon.fS a0) throws Throwable;
private static native com.moon.module.impl.Timer __cast53_59(com.moon.module.Module a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call53_60(com.moon.module.impl.Timer a0) throws Throwable;
private static native java.lang.Object __call53_61(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast53_62(java.lang.Object a0) throws Throwable;
private static native boolean __call53_63(java.lang.Boolean a0) throws Throwable;
private static native java.awt.Color __fieldRead53_64() throws Throwable;
private static native int __call53_65(java.awt.Color a0) throws Throwable;
private static native void __explicitNewInit53_66(com.moon.aO a0, int a1) throws Throwable;
private static native com.moon.aO __call53_67(com.moon.aO a0, float a1) throws Throwable;
private static native int __call53_68(com.moon.aO a0) throws Throwable;
private static native com.moon.i3 __call53_69(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call53_70(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call53_71(com.moon.hW a0) throws Throwable;
private static native com.moon.hX __call53_72() throws Throwable;
private static native com.moon.cb __fieldRead53_73() throws Throwable;
private static native com.moon.hX __call53_74(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call53_75(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call53_76(com.moon.hX a0) throws Throwable;
private static native float __fieldRead53_77(com.moon.fS a0) throws Throwable;
private static native float __fieldRead53_78(com.moon.fS a0) throws Throwable;
private static native void __call53_79(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call53_80(com.moon.hW a0) throws Throwable;
private static native void __fieldWrite53_81(com.moon.fS a0, java.lang.String a1) throws Throwable;

}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.fS.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11364);
    if (((com.moon.fS.w)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.fS.v)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.fS.x)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.fS.x)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/fS", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.fS.w)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.fS.w)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1078_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void c() {
((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fS.a)).l)).c = ((float)(0x1.0p0f));
    return;
}


private void d() {
com.moon.fS forwardValue141_24_0;
    com.moon.fS spill141_0;
    com.moon.fS spill141_1;
    long life1_3;
    int life3_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (com.moon.fS.q ^ 9702382268875L);
    life3_5 = ((moom.sJ.ac()) ? 1 : 0);
    spill141_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue141_24_0 = spill141_0;
        break forward_join_24;
    }
    if (!((((com.moon.fS)(spill141_0)).e != null))) {
        break forward_join_16;
    }
    spill141_1 = this;
    if (!((life3_5 != 0))) {
        forwardValue141_24_0 = spill141_1;
        break forward_join_24;
    }
    if (!((((com.moon.fS)(spill141_1)).f == null))) {
        break forward_join_30;
    }
    }
    this.e = ((com.moon.module.impl.HUD)(((com.moon.module.impl.HUD)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))))));
    forwardValue141_24_0 = this;
    }
    ((com.moon.fS)(forwardValue141_24_0)).f = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    return;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31369);
    if (((com.moon.fS.s)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.fS.t)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.fS.t)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/fS", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.fS.r)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.fS.s)[life5_8] = com.moon.fS.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.fS.s)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.fS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1081_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/fS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.eJ p0) {
int forwardValue135_14_0;
    int forwardValue135_21_0;
    com.moon.fS forwardValue135_29_0;
    int forwardValue135_29_1;
    com.moon.fS forwardValue135_30_0;
    com.moon.fS forwardValue135_31_0;
    int forwardValue135_31_1;
    com.moon.fS forwardValue135_41_0;
    int forwardValue135_41_1;
    com.moon.fS forwardValue135_42_0;
    com.moon.fS forwardValue135_43_0;
    int forwardValue135_43_1;
    int spill135_0;
    com.moon.fS spill135_1;
    boolean spill135_2;
    com.moon.fS spill135_3;
    boolean spill135_4;
    long life2_3;
    int life4_5;
    forward_join_47: {
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_34: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_21: {
    forward_join_14: {
    life2_3 = (com.moon.fS.q ^ 127730350543231L);
    life4_5 = ((moom.sJ.ab()) ? 1 : 0);
    spill135_0 = ((com.moon.eJ)(p0)).a();
    if (!((life4_5 == 0))) {
        forwardValue135_14_0 = spill135_0;
        break forward_join_14;
    }
    if (!((spill135_0 == 2))) {
        break forward_join_47;
    }
    forwardValue135_14_0 = ((((com.moon.eJ)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forwardValue135_21_0 = forwardValue135_14_0;
        break forward_join_21;
    }
    if (!((forwardValue135_14_0 != 0))) {
        break forward_join_47;
    }
    forwardValue135_21_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.fS.a)).W)).aq)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue135_21_0 != 0))) {
        break forward_join_34;
    }
    spill135_1 = this;
    spill135_2 = this.g;
    if (!((life4_5 == 0))) {
        forwardValue135_29_0 = spill135_1;
        forwardValue135_29_1 = ((spill135_2) ? 1 : 0);
        break forward_join_29;
    }
    if (!((!spill135_2))) {
        forwardValue135_30_0 = spill135_1;
        break forward_join_30;
    }
    forwardValue135_29_0 = spill135_1;
    forwardValue135_29_1 = 1;
    }
    forwardValue135_31_0 = forwardValue135_29_0;
    forwardValue135_31_1 = forwardValue135_29_1;
    break forward_join_31;
    }
    forwardValue135_31_0 = forwardValue135_30_0;
    forwardValue135_31_1 = 0;
    }
    ((com.moon.fS)(forwardValue135_31_0)).g = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue135_31_1)));
    if (!((life4_5 != 0))) {
        break forward_join_47;
    }
    }
    spill135_3 = this;
    spill135_4 = this.h;
    if (!((life4_5 == 0))) {
        forwardValue135_41_0 = spill135_3;
        forwardValue135_41_1 = ((spill135_4) ? 1 : 0);
        break forward_join_41;
    }
    if (!((!spill135_4))) {
        forwardValue135_42_0 = spill135_3;
        break forward_join_42;
    }
    forwardValue135_41_0 = spill135_3;
    forwardValue135_41_1 = 1;
    }
    forwardValue135_43_0 = forwardValue135_41_0;
    forwardValue135_43_1 = forwardValue135_41_1;
    break forward_join_43;
    }
    forwardValue135_43_0 = forwardValue135_42_0;
    forwardValue135_43_1 = 0;
    }
    ((com.moon.fS)(forwardValue135_43_0)).h = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue135_43_1)));
    this.g = ((boolean)(false));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue138_22_0;
    int forwardValue138_39_0;
    int forwardValue138_50_0;
    moom.DM forwardValue138_80_0;
    moom.DM forwardValue138_85_0;
    java.lang.Object forwardValue138_85_1;
    moom.DM forwardValue138_95_0;
    float forwardValue138_95_1;
    float forwardValue138_95_2;
    moom.DM forwardValue138_97_0;
    moom.DM forwardValue138_98_0;
    float forwardValue138_98_1;
    int spill138_0;
    moom.DM spill138_1;
    float spill138_2;
    float spill138_3;
    java.lang.Boolean spill138_4;
    long life2_3;
    int life4_5;
    forward_join_105: {
    forward_join_101: {
    forward_join_98: {
    forward_join_97: {
    forward_join_95: {
    forward_join_85: {
    forward_join_80: {
    forward_join_50: {
    forward_join_39: {
    forward_join_37: {
    forward_join_22: {
    forward_join_20: {
    life2_3 = (com.moon.fS.q ^ 1155582852956L);
    life4_5 = ((moom.sJ.ac()) ? 1 : 0);
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_105;
    }
    spill138_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fS.a)).K)).S;
    if (!((life4_5 != 0))) {
        forwardValue138_22_0 = spill138_0;
        break forward_join_22;
    }
    if (!((spill138_0 <= 1))) {
        break forward_join_20;
    }
    this.i = ((long)(0L));
    }
    forwardValue138_22_0 = ((this.g) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue138_39_0 = forwardValue138_22_0;
        break forward_join_39;
    }
    if (!((forwardValue138_22_0 != 0))) {
        break forward_join_37;
    }
    ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fS.a)).l)).c = ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fS)(this)).a())))).b__kZ())).getValue())))).floatValue()));
    if (!((life4_5 == 0))) {
        break forward_join_105;
    }
    }
    forwardValue138_39_0 = ((this.h) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue138_50_0 = forwardValue138_39_0;
        break forward_join_50;
    }
    if (!((forwardValue138_39_0 != 0))) {
        break forward_join_101;
    }
    forwardValue138_50_0 = recovery.source.CarrierOps.lcmp(((long)(this.i)), ((long)(__sourceIntrinsic_9f71572286bb_invokedynamic138_23(18581, (5955576320990851214L ^ life2_3)))));
    }
    if (!((forwardValue138_50_0 <= 0))) {
        break forward_join_101;
    }
    spill138_1 = ((net.minecraft.client.Minecraft)(com.moon.fS.a)).l;
    spill138_2 = (((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.fS.a)).K)).S) % ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fS)(this)).a())))).c__kZ())).getValue())))).floatValue());
    spill138_3 = 0x0.0p0f;
    if (!((life4_5 != 0))) {
        forwardValue138_95_0 = spill138_1;
        forwardValue138_95_1 = spill138_2;
        forwardValue138_95_2 = spill138_3;
        break forward_join_95;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill138_2)), ((float)(spill138_3))) != 0))) {
        forwardValue138_80_0 = spill138_1;
        break forward_join_80;
    }
    spill138_4 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fS)(this)).a())))).a__kV())).getValue()));
    if (!((life4_5 != 0))) {
        forwardValue138_85_0 = spill138_1;
        forwardValue138_85_1 = spill138_4;
        break forward_join_85;
    }
    if (!((!((java.lang.Boolean)(spill138_4)).booleanValue()))) {
        forwardValue138_97_0 = spill138_1;
        break forward_join_97;
    }
    forwardValue138_80_0 = spill138_1;
    }
    forwardValue138_85_0 = forwardValue138_80_0;
    forwardValue138_85_1 = ((com.moon.setting.FloatSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fS)(this)).a())))).a__kZ())).getValue();
    }
    forwardValue138_95_0 = forwardValue138_85_0;
    forwardValue138_95_1 = java.lang.Math.min(((float)(((java.lang.Float)(((java.lang.Float)(forwardValue138_85_1)))).floatValue())), ((float)((((float) (-this.i)) / 0x1.9p5f))));
    forwardValue138_95_2 = 0x1.0p0f;
    }
    forwardValue138_98_0 = forwardValue138_95_0;
    forwardValue138_98_1 = java.lang.Math.max(((float)(forwardValue138_95_1)), ((float)(forwardValue138_95_2)));
    break forward_join_98;
    }
    forwardValue138_98_0 = forwardValue138_97_0;
    forwardValue138_98_1 = 0x1.0p0f;
    }
    ((moom.DM)(forwardValue138_98_0)).c = ((float)(forwardValue138_98_1));
    if (!((life4_5 == 0))) {
        break forward_join_105;
    }
    }
    ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.fS.a)).l)).c = ((float)(0x1.0p0f));
    }
    return;
}


public void a(com.moon.ei p0) {
long life2_3;
    int life4_7;
    com.moon.jm life5_12;
    java.lang.String life6_28;
    float life7_33;
    float life8_39;
    forward_join_61: {
    forward_join_56: {
    forward_join_50: {
    life2_3 = (com.moon.fS.q ^ 800870589884L);
    boolean spill136_0 = moom.sJ.ac();
    ((com.moon.fS)(this)).d();
    life4_7 = ((spill136_0) ? 1 : 0);
    life5_12 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    long __stackOp136_10_0 = this.i;
    java.lang.String __stackOp136_10_1 = __sourceIntrinsic_69cef81dd8fb_invokedynamic136_9(8494, (8945319793719940408L ^ life2_3));
    java.lang.String spill136_1 = __stackOp136_10_1;
    long spill136_2 = __stackOp136_10_0;
    recovery.source.CarrierOps.discard(__stackOp136_10_1);
    life6_28 = __sourceIntrinsic_69cef81dd8fb_invokedynamic136_13(spill136_1, spill136_2, __sourceIntrinsic_69cef81dd8fb_invokedynamic136_12(5161, (2565270052433371196L ^ life2_3)));
    life7_33 = ((com.moon.jm)(life5_12)).a(((java.lang.String)(life6_28)), ((float)(0x1.4p3f)));
    life8_39 = ((com.moon.jm)(life5_12)).a(((java.lang.String)(this.o)), ((float)(0x1.4p3f)));
    if (!((life4_7 != 0))) { break forward_join_50; }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life7_33)), ((float)(life8_39))) != 0))) { break forward_join_56; }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.f)).a__gW())).c();
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(this.f)).a())).a(((boolean)(true)));
    }
    if (!((life4_7 == 0))) { break forward_join_61; }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}


public void a(com.moon.ej p0) {
int forwardValue137_24_0;
    com.moon.hW forwardValue137_52_0;
    float forwardValue137_52_1;
    float forwardValue137_52_2;
    float forwardValue137_52_3;
    float forwardValue137_52_4;
    float forwardValue137_52_5;
    int forwardValue137_52_6;
    com.moon.hW forwardValue137_57_0;
    float forwardValue137_57_1;
    float forwardValue137_57_2;
    float forwardValue137_57_3;
    float forwardValue137_57_4;
    float forwardValue137_57_5;
    com.moon.hW forwardValue137_59_0;
    float forwardValue137_59_1;
    float forwardValue137_59_2;
    float forwardValue137_59_3;
    float forwardValue137_59_4;
    float forwardValue137_59_5;
    int forwardValue137_59_6;
    com.moon.hW forwardValue137_60_0;
    float forwardValue137_60_1;
    float forwardValue137_60_2;
    float forwardValue137_60_3;
    float forwardValue137_60_4;
    float forwardValue137_60_5;
    com.moon.hW forwardValue137_61_0;
    float forwardValue137_61_1;
    float forwardValue137_61_2;
    float forwardValue137_61_3;
    float forwardValue137_61_4;
    float forwardValue137_61_5;
    int forwardValue137_61_6;
    int forwardValue137_72_0;
    boolean spill137_0;
    boolean spill137_1;
    com.moon.hW spill137_2;
    float spill137_3;
    float spill137_4;
    float spill137_5;
    float spill137_6;
    float spill137_7;
    boolean spill137_8;
    long life2_3;
    int life4_7;
    int life5_30;
    com.moon.hW life6_35;
    forward_join_73: {
    forward_join_72: {
    forward_join_71: {
    forward_join_65: {
    forward_join_61: {
    forward_join_60: {
    forward_join_59: {
    forward_join_57: {
    forward_join_52: {
    forward_join_24: {
    life2_3 = (com.moon.fS.q ^ 102914963181894L);
    spill137_0 = moom.sJ.ab();
    ((com.moon.fS)(this)).d();
    life4_7 = ((spill137_0) ? 1 : 0);
    spill137_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fS)(this)).a())))).b())).getValue())))).booleanValue();
    if (!((life4_7 == 0))) {
        forwardValue137_24_0 = ((spill137_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill137_1)) {
        break forward_join_65;
    }
    forwardValue137_24_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.e)).e__kX())).getValue())))).intValue();
    }
    life5_30 = forwardValue137_24_0;
    life6_35 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill137_2 = life6_35;
    spill137_3 = this.k;
    spill137_4 = this.l;
    spill137_5 = this.m;
    spill137_6 = this.n;
    spill137_7 = 0x1.0p2f;
    spill137_8 = ((com.moon.ej)(p0)).a();
    if (!((life4_7 == 0))) {
        forwardValue137_52_0 = spill137_2;
        forwardValue137_52_1 = spill137_3;
        forwardValue137_52_2 = spill137_4;
        forwardValue137_52_3 = spill137_5;
        forwardValue137_52_4 = spill137_6;
        forwardValue137_52_5 = spill137_7;
        forwardValue137_52_6 = ((spill137_8) ? 1 : 0);
        break forward_join_52;
    }
    if (!(spill137_8)) {
        forwardValue137_60_0 = spill137_2;
        forwardValue137_60_1 = spill137_3;
        forwardValue137_60_2 = spill137_4;
        forwardValue137_60_3 = spill137_5;
        forwardValue137_60_4 = spill137_6;
        forwardValue137_60_5 = spill137_7;
        break forward_join_60;
    }
    forwardValue137_52_0 = spill137_2;
    forwardValue137_52_1 = spill137_3;
    forwardValue137_52_2 = spill137_4;
    forwardValue137_52_3 = spill137_5;
    forwardValue137_52_4 = spill137_6;
    forwardValue137_52_5 = spill137_7;
    forwardValue137_52_6 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Timer)(((com.moon.module.impl.Timer)(((com.moon.fS)(this)).a())))).c())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_7 == 0))) {
        forwardValue137_59_0 = forwardValue137_52_0;
        forwardValue137_59_1 = forwardValue137_52_1;
        forwardValue137_59_2 = forwardValue137_52_2;
        forwardValue137_59_3 = forwardValue137_52_3;
        forwardValue137_59_4 = forwardValue137_52_4;
        forwardValue137_59_5 = forwardValue137_52_5;
        forwardValue137_59_6 = forwardValue137_52_6;
        break forward_join_59;
    }
    if (!((forwardValue137_52_6 != 0))) {
        forwardValue137_57_0 = forwardValue137_52_0;
        forwardValue137_57_1 = forwardValue137_52_1;
        forwardValue137_57_2 = forwardValue137_52_2;
        forwardValue137_57_3 = forwardValue137_52_3;
        forwardValue137_57_4 = forwardValue137_52_4;
        forwardValue137_57_5 = forwardValue137_52_5;
        break forward_join_57;
    }
    forwardValue137_61_0 = forwardValue137_52_0;
    forwardValue137_61_1 = forwardValue137_52_1;
    forwardValue137_61_2 = forwardValue137_52_2;
    forwardValue137_61_3 = forwardValue137_52_3;
    forwardValue137_61_4 = forwardValue137_52_4;
    forwardValue137_61_5 = forwardValue137_52_5;
    forwardValue137_61_6 = life5_30;
    break forward_join_61;
    }
    forwardValue137_59_0 = forwardValue137_57_0;
    forwardValue137_59_1 = forwardValue137_57_1;
    forwardValue137_59_2 = forwardValue137_57_2;
    forwardValue137_59_3 = forwardValue137_57_3;
    forwardValue137_59_4 = forwardValue137_57_4;
    forwardValue137_59_5 = forwardValue137_57_5;
    forwardValue137_59_6 = ((java.awt.Color)(java.awt.Color.BLACK)).getRGB();
    }
    forwardValue137_61_0 = forwardValue137_59_0;
    forwardValue137_61_1 = forwardValue137_59_1;
    forwardValue137_61_2 = forwardValue137_59_2;
    forwardValue137_61_3 = forwardValue137_59_3;
    forwardValue137_61_4 = forwardValue137_59_4;
    forwardValue137_61_5 = forwardValue137_59_5;
    forwardValue137_61_6 = forwardValue137_59_6;
    break forward_join_61;
    }
    forwardValue137_61_0 = forwardValue137_60_0;
    forwardValue137_61_1 = forwardValue137_60_1;
    forwardValue137_61_2 = forwardValue137_60_2;
    forwardValue137_61_3 = forwardValue137_60_3;
    forwardValue137_61_4 = forwardValue137_60_4;
    forwardValue137_61_5 = forwardValue137_60_5;
    forwardValue137_61_6 = -1;
    }
    ((com.moon.hW)(forwardValue137_61_0)).a(((com.moon.iX)(com.moon.i3.a(((float)(forwardValue137_61_1)), ((float)(forwardValue137_61_2)), ((float)(forwardValue137_61_3)), ((float)(forwardValue137_61_4)), ((float)(forwardValue137_61_5)), ((int)(forwardValue137_61_6))))));
    ((com.moon.hW)(life6_35)).b();
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_73;
    }
    if (!((life4_7 != 0))) {
        break forward_join_71;
    }
    forwardValue137_72_0 = 0;
    break forward_join_72;
    }
    forwardValue137_72_0 = 1;
    }
    moom.sJ.m(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue137_72_0))));
    }
    return;
}


public void a(com.moon.event.Render2DEvent p0) { __sourceHandlerCall_ff091bc003c50a098f7c(this, p0); }


public void a(com.moon.event.PacketEvent p0) {
int forwardValue139_28_0;
    com.moon.fS forwardValue139_85_0;
    boolean spill139_0;
    int spill139_1;
    com.moon.fS spill139_2;
    long life2_3;
    moom.yK life5_7;
    int life4_8;
    long life6_39;
    long life8_54;
    forward_join_87: {
    forward_join_85: {
    forward_join_84: {
    forward_join_78: {
    forward_join_66: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (com.moon.fS.q ^ 50041499558848L);
    spill139_0 = moom.sJ.ab();
    life5_7 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    life4_8 = ((spill139_0) ? 1 : 0);
    spill139_1 = ((life5_7 instanceof moom.zB) ? 1 : 0);
    if (!((life4_8 == 0))) {
        forwardValue139_28_0 = spill139_1;
        break forward_join_28;
    }
    if (!((spill139_1 != 0))) {
        break forward_join_26;
    }
    com.moon.fS __stackOp139_5_0 = this;
    ((com.moon.fS)(__stackOp139_5_0)).i = ((long)((((com.moon.fS)(__stackOp139_5_0)).i - __sourceIntrinsic_0d28a2dd2629_invokedynamic139_7(12878, (5405003743973316296L ^ life2_3)))));
    if (!((life4_8 != 0))) {
        break forward_join_87;
    }
    }
    forwardValue139_28_0 = ((life5_7 instanceof moom.y7) ? 1 : 0);
    }
    if (!((forwardValue139_28_0 != 0))) {
        break forward_join_87;
    }
    life6_39 = java.lang.System.currentTimeMillis();
    spill139_2 = this;
    if (!((life4_8 == 0))) {
        forwardValue139_85_0 = spill139_2;
        break forward_join_85;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(((com.moon.fS)(spill139_2)).j)), ((long)(0L))) != 0))) {
        break forward_join_84;
    }
    life8_54 = (life6_39 - this.j);
    if (!((life4_8 == 0))) {
        break forward_join_78;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(java.lang.Math.abs(((long)((life8_54 - __sourceIntrinsic_0d28a2dd2629_invokedynamic139_14(25218, (4046327263790810624L ^ life2_3)))))))), ((long)(__sourceIntrinsic_0d28a2dd2629_invokedynamic139_16(23047, (8910279524963352195L ^ life2_3))))) <= 0))) {
        break forward_join_66;
    }
    life8_54 = __sourceIntrinsic_0d28a2dd2629_invokedynamic139_18(19696, (3535433815907199093L ^ life2_3));
    }
    com.moon.fS __stackOp139_19_0 = this;
    ((com.moon.fS)(__stackOp139_19_0)).i = ((long)((((com.moon.fS)(__stackOp139_19_0)).i + (__sourceIntrinsic_0d28a2dd2629_invokedynamic139_21(19696, (3535433815907199093L ^ life2_3)) - life8_54))));
    }
    this.i = ((long)(java.lang.Math.min(((long)(this.i)), ((long)(0L)))));
    }
    forwardValue139_85_0 = this;
    }
    ((com.moon.fS)(forwardValue139_85_0)).j = ((long)(life6_39));
    }
    return;
}


private static java.lang.String a(byte[] p0) {
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
        byte[] spill279_0 = p0;
        life4_9 += 1;
        life5_44 = (spill279_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill279_1 = p0;
        life4_9 += 1;
        life5_76 = (spill279_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill279_2 = p0;
        life4_9 += 1;
        life5_91 = (spill279_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69cef81dd8fb_invokedynamic136_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69cef81dd8fb_invokedynamic136_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_69cef81dd8fb_invokedynamic136_13(java.lang.String a0, long a1, java.lang.String a2) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_9f71572286bb_invokedynamic138_23(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic139_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic139_14(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic139_16(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic139_18(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_0d28a2dd2629_invokedynamic139_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cd0609abcd78_invokedynamic53_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cd0609abcd78_invokedynamic53_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cd0609abcd78_invokedynamic53_22(java.lang.String a0, long a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1081_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1078_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
