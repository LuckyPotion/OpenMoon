package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class iw {

private static org.tinylog.TaggedLogger a;

private java.nio.FloatBuffer b;

private java.nio.FloatBuffer c;

private com.moon.jG d;

private com.moon.jH e;

private com.moon.h3 f;

protected com.moon.jD g;

private com.moon.jE h;

private com.moon.jE i;

private static int[] j;

private static long v;

private static java.lang.String[] y;

private static java.lang.String[] z;

private static java.util.Map A;

private static long[] H;

private static java.lang.Integer[] I;

private static java.util.Map J;

private static long[] K;

private static java.lang.Long[] L;

private static java.util.Map M;

public iw() { super(); }


private static void __sourceConstructorBody_70614f7acf711762(com.moon.iw receiver) throws Throwable {

long local1_life2 = (com.moon.iw.v ^ 1491348382184L);

    com.moon.iw.__sourceConstructorInit_70614f7acf711762_0(((com.moon.iw)(receiver)));

    ((com.moon.iw)(receiver)).b = ((java.nio.FloatBuffer)(org.lwjgl.BufferUtils.createFloatBuffer(((int)(__sourceIntrinsic_70614f7acf711762_originalDynamicSite18_5(8081, (3200497510047032620L ^ local1_life2)))))));

    ((com.moon.iw)(receiver)).c = ((java.nio.FloatBuffer)(org.lwjgl.BufferUtils.createFloatBuffer(((int)(__sourceIntrinsic_70614f7acf711762_originalDynamicSite18_9(20249, (5328604931543856550L ^ local1_life2)))))));

    ((com.moon.iw)(receiver)).h = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_70614f7acf711762_originalDynamicSite18_14(9840, (9196419408609450597L ^ local1_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_70614f7acf711762_originalDynamicSite18_16(receiver)))))).a()));

    ((com.moon.iw)(receiver)).i = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_70614f7acf711762_originalDynamicSite18_22(27136, (8795321476791653905L ^ local1_life2))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_70614f7acf711762_originalDynamicSite18_24(receiver)))))).a()));

    return;

}



static {
v = ((long)(((moom._a)(moom._c.a(((long)(-4768920947041221044L)), ((long)(-7367601939606762727L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(269553838956188L)))));
    long local31_life6 = (com.moon.iw.v ^ 59787954300172L);
    java.lang.Object __sourceSpill175_8 = null;
    A = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.iw.b(((int[])(__sourceSpill175_8)));
    javax.crypto.Cipher local22_life11;
    javax.crypto.Cipher __sourceSpill175_13 = (local22_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill175_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill175_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill175_16 = new byte[8];
    (__sourceSpill175_16)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local23_life17 = 1;
    while ((local23_life17 < 8)) {
        (__sourceSpill175_16)[local23_life17] = ((byte) ((int) ((local31_life6 << (local23_life17 * 8)) >>> 56)));
        local23_life17 += 1;
    }
    byte[] __sourcePreallocation175_18 = __sourceSpill175_16;
    ((javax.crypto.Cipher)(__sourceSpill175_13)).init(((int)(__sourceSpill175_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill175_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation175_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local29_life21 = new java.lang.String[6];
    int local27_life22 = 0;
    java.lang.String local26_life23;
    int local28_life25 = ((java.lang.String)((local26_life23 = "Sá~#Ê³³;\026ø}/ \t¾þ>æpñ3\023õ/u¡O\032ÀÕæ\020¦,^D.ã¨å\036uÕÒ@SÝw/°^´Ó|Ð'ÈVÓ¨é1VÚ9ù×acpùaöÈO\031\0378c\002\ttl\007Ôf:¿×zÍSõ3°ñQ\007)\r(k\0022R\025ZÎD´Ðá\007êú¶\007*\177<\030ëý//ÄõÅ¹8´;%ùZ\016É\020DÖ`QÔ+\016×{\034¥\017>"))).length();
    int local25_life26 = 48;
    int local24_life27 = -1;
    while (true) {
        local24_life27 += 1;
        byte[] __sourceSpill175_30 = ((java.lang.String)(((java.lang.String)(local26_life23)).substring(((int)(local24_life27)), ((int)((local24_life27 + local25_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill175_31 = local22_life11;
        byte[] local30_life33 = ((javax.crypto.Cipher)(__sourceSpill175_31)).doFinal(((byte[])(__sourceSpill175_30)));
        java.lang.String __sourceSpill175_36 = ((java.lang.String)(com.moon.iw.a(((byte[])(local30_life33))))).intern();
        java.lang.String[] __sourceSpill175_37 = local29_life21;
        int __sourceSpill175_38 = local27_life22;
        local27_life22 += 1;
        (__sourceSpill175_37)[__sourceSpill175_38] = __sourceSpill175_36;
        if (!(((local24_life27 = (local24_life27 + local25_life26)) < local28_life25))) { break; }
        local25_life26 = ((java.lang.String)(local26_life23)).charAt(((int)(local24_life27)));
    }
    local28_life25 = ((java.lang.String)((local26_life23 = "´\030²N ×¥2R4Zûql\030JD÷°+E\000Ë¯\003XQ2XÞhÀv8Ó§\020I-¢a#qtsÿ\023\013´PÕ"))).length();
    local25_life26 = 40;
    local24_life27 = -1;
    while (true) {
        local24_life27 += 1;
        byte[] __sourceSpill175_43 = ((java.lang.String)(((java.lang.String)(local26_life23)).substring(((int)(local24_life27)), ((int)((local24_life27 + local25_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill175_44 = local22_life11;
        byte[] local30_life46 = ((javax.crypto.Cipher)(__sourceSpill175_44)).doFinal(((byte[])(__sourceSpill175_43)));
        java.lang.String __sourceSpill175_49 = ((java.lang.String)(com.moon.iw.a(((byte[])(local30_life46))))).intern();
        java.lang.String[] __sourceSpill175_50 = local29_life21;
        int __sourceSpill175_51 = local27_life22;
        local27_life22 += 1;
        (__sourceSpill175_50)[__sourceSpill175_51] = __sourceSpill175_49;
        if (!(((local24_life27 = (local24_life27 + local25_life26)) < local28_life25))) { break; }
        local25_life26 = ((java.lang.String)(local26_life23)).charAt(((int)(local24_life27)));
    }
    y = ((java.lang.String[])(local29_life21));
    z = ((java.lang.String[])(new java.lang.String[6]));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life57;
    javax.crypto.Cipher __sourceSpill175_59 = (local11_life57 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill175_60 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill175_61 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill175_62 = new byte[8];
    (__sourceSpill175_62)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local12_life63 = 1;
    while ((local12_life63 < 8)) {
        (__sourceSpill175_62)[local12_life63] = ((byte) ((int) ((local31_life6 << (local12_life63 * 8)) >>> 56)));
        local12_life63 += 1;
    }
    byte[] __sourcePreallocation175_64 = __sourceSpill175_62;
    ((javax.crypto.Cipher)(__sourceSpill175_59)).init(((int)(__sourceSpill175_60)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill175_61)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation175_64)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life67 = new long[8];
    int local14_life68 = 0;
    java.lang.String local15_life69;
    int local16_life71 = ((java.lang.String)((local15_life69 = "B6±\034\023´l×Ð}^#Ìtc4\022aVM[(5 Ã4ÆGXëGy¯îr<&z¡9c*"))).length();
    int local13_life72 = 0;
    do {
        java.lang.String __sourceSpill175_73 = local15_life69;
        int __sourceSpill175_74 = local13_life72;
        local13_life72 += 8;
        byte[] local18_life77 = ((java.lang.String)(((java.lang.String)(__sourceSpill175_73)).substring(((int)(__sourceSpill175_74)), ((int)(local13_life72))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill175_78 = local17_life67;
        int __sourceSpill175_79 = local14_life68;
        local14_life68 += 1;
        long local19_life80 = (((((((((((long) (local18_life77)[0]) & 255L) << 56) | ((((long) (local18_life77)[1]) & 255L) << 48)) | ((((long) (local18_life77)[2]) & 255L) << 40)) | ((((long) (local18_life77)[3]) & 255L) << 32)) | ((((long) (local18_life77)[4]) & 255L) << 24)) | ((((long) (local18_life77)[5]) & 255L) << 16)) | ((((long) (local18_life77)[6]) & 255L) << 8)) | (((long) (local18_life77)[7]) & 255L));
        byte[] __sourceSpill175_81 = new byte[8];
        (__sourceSpill175_81)[0] = ((byte) ((int) (local19_life80 >>> 56)));
        (__sourceSpill175_81)[1] = ((byte) ((int) (local19_life80 >>> 48)));
        (__sourceSpill175_81)[2] = ((byte) ((int) (local19_life80 >>> 40)));
        (__sourceSpill175_81)[3] = ((byte) ((int) (local19_life80 >>> 32)));
        (__sourceSpill175_81)[4] = ((byte) ((int) (local19_life80 >>> 24)));
        (__sourceSpill175_81)[5] = ((byte) ((int) (local19_life80 >>> 16)));
        (__sourceSpill175_81)[6] = ((byte) ((int) (local19_life80 >>> 8)));
        (__sourceSpill175_81)[7] = ((byte) ((int) local19_life80));
        javax.crypto.Cipher __sourceSpill175_82 = local11_life57;
        byte[] local21_life84 = ((javax.crypto.Cipher)(__sourceSpill175_82)).doFinal(((byte[])(__sourceSpill175_81)));
        (__sourceSpill175_78)[__sourceSpill175_79] = (((((((((((long) (local21_life84)[0]) & 255L) << 56) | ((((long) (local21_life84)[1]) & 255L) << 48)) | ((((long) (local21_life84)[2]) & 255L) << 40)) | ((((long) (local21_life84)[3]) & 255L) << 32)) | ((((long) (local21_life84)[4]) & 255L) << 24)) | ((((long) (local21_life84)[5]) & 255L) << 16)) | ((((long) (local21_life84)[6]) & 255L) << 8)) | (((long) (local21_life84)[7]) & 255L));
    } while ((!(local13_life72 >= local16_life71)));
    local16_life71 = ((java.lang.String)((local15_life69 = "\b Ä\007ø¹0Ç\024õÛg\030\177C>"))).length();
    local13_life72 = 0;
    do {
        java.lang.String __sourceSpill175_86 = local15_life69;
        int __sourceSpill175_87 = local13_life72;
        local13_life72 += 8;
        byte[] local18_life90 = ((java.lang.String)(((java.lang.String)(__sourceSpill175_86)).substring(((int)(__sourceSpill175_87)), ((int)(local13_life72))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill175_91 = local17_life67;
        int __sourceSpill175_92 = local14_life68;
        local14_life68 += 1;
        long local19_life93 = (((((((((((long) (local18_life90)[0]) & 255L) << 56) | ((((long) (local18_life90)[1]) & 255L) << 48)) | ((((long) (local18_life90)[2]) & 255L) << 40)) | ((((long) (local18_life90)[3]) & 255L) << 32)) | ((((long) (local18_life90)[4]) & 255L) << 24)) | ((((long) (local18_life90)[5]) & 255L) << 16)) | ((((long) (local18_life90)[6]) & 255L) << 8)) | (((long) (local18_life90)[7]) & 255L));
        byte[] __sourceSpill175_94 = new byte[8];
        (__sourceSpill175_94)[0] = ((byte) ((int) (local19_life93 >>> 56)));
        (__sourceSpill175_94)[1] = ((byte) ((int) (local19_life93 >>> 48)));
        (__sourceSpill175_94)[2] = ((byte) ((int) (local19_life93 >>> 40)));
        (__sourceSpill175_94)[3] = ((byte) ((int) (local19_life93 >>> 32)));
        (__sourceSpill175_94)[4] = ((byte) ((int) (local19_life93 >>> 24)));
        (__sourceSpill175_94)[5] = ((byte) ((int) (local19_life93 >>> 16)));
        (__sourceSpill175_94)[6] = ((byte) ((int) (local19_life93 >>> 8)));
        (__sourceSpill175_94)[7] = ((byte) ((int) local19_life93));
        javax.crypto.Cipher __sourceSpill175_95 = local11_life57;
        byte[] local21_life97 = ((javax.crypto.Cipher)(__sourceSpill175_95)).doFinal(((byte[])(__sourceSpill175_94)));
        (__sourceSpill175_91)[__sourceSpill175_92] = (((((((((((long) (local21_life97)[0]) & 255L) << 56) | ((((long) (local21_life97)[1]) & 255L) << 48)) | ((((long) (local21_life97)[2]) & 255L) << 40)) | ((((long) (local21_life97)[3]) & 255L) << 32)) | ((((long) (local21_life97)[4]) & 255L) << 24)) | ((((long) (local21_life97)[5]) & 255L) << 16)) | ((((long) (local21_life97)[6]) & 255L) << 8)) | (((long) (local21_life97)[7]) & 255L));
    } while ((!(local13_life72 >= local16_life71)));
    H = ((long[])(local17_life67));
    I = ((java.lang.Integer[])(new java.lang.Integer[8]));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life102;
    javax.crypto.Cipher __sourceSpill175_104 = (local0_life102 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill175_105 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill175_106 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill175_107 = new byte[8];
    (__sourceSpill175_107)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local1_life108 = 1;
    while ((local1_life108 < 8)) {
        (__sourceSpill175_107)[local1_life108] = ((byte) ((int) ((local31_life6 << (local1_life108 * 8)) >>> 56)));
        local1_life108 += 1;
    }
    byte[] __sourcePreallocation175_109 = __sourceSpill175_107;
    ((javax.crypto.Cipher)(__sourceSpill175_104)).init(((int)(__sourceSpill175_105)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill175_106)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation175_109)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life112 = new long[2];
    int local3_life113 = 0;
    java.lang.String local4_life114;
    int local5_life116 = ((java.lang.String)((local4_life114 = "dÙée´Kã¥à\005(Pú"))).length();
    int local2_life117 = 0;
    do {
        java.lang.String __sourceSpill175_118 = local4_life114;
        int __sourceSpill175_119 = local2_life117;
        local2_life117 += 8;
        byte[] local7_life122 = ((java.lang.String)(((java.lang.String)(__sourceSpill175_118)).substring(((int)(__sourceSpill175_119)), ((int)(local2_life117))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill175_123 = local6_life112;
        int __sourceSpill175_124 = local3_life113;
        local3_life113 += 1;
        long local8_life125 = (((((((((((long) (local7_life122)[0]) & 255L) << 56) | ((((long) (local7_life122)[1]) & 255L) << 48)) | ((((long) (local7_life122)[2]) & 255L) << 40)) | ((((long) (local7_life122)[3]) & 255L) << 32)) | ((((long) (local7_life122)[4]) & 255L) << 24)) | ((((long) (local7_life122)[5]) & 255L) << 16)) | ((((long) (local7_life122)[6]) & 255L) << 8)) | (((long) (local7_life122)[7]) & 255L));
        byte[] __sourceSpill175_126 = new byte[8];
        (__sourceSpill175_126)[0] = ((byte) ((int) (local8_life125 >>> 56)));
        (__sourceSpill175_126)[1] = ((byte) ((int) (local8_life125 >>> 48)));
        (__sourceSpill175_126)[2] = ((byte) ((int) (local8_life125 >>> 40)));
        (__sourceSpill175_126)[3] = ((byte) ((int) (local8_life125 >>> 32)));
        (__sourceSpill175_126)[4] = ((byte) ((int) (local8_life125 >>> 24)));
        (__sourceSpill175_126)[5] = ((byte) ((int) (local8_life125 >>> 16)));
        (__sourceSpill175_126)[6] = ((byte) ((int) (local8_life125 >>> 8)));
        (__sourceSpill175_126)[7] = ((byte) ((int) local8_life125));
        javax.crypto.Cipher __sourceSpill175_127 = local0_life102;
        byte[] local10_life129 = ((javax.crypto.Cipher)(__sourceSpill175_127)).doFinal(((byte[])(__sourceSpill175_126)));
        (__sourceSpill175_123)[__sourceSpill175_124] = (((((((((((long) (local10_life129)[0]) & 255L) << 56) | ((((long) (local10_life129)[1]) & 255L) << 48)) | ((((long) (local10_life129)[2]) & 255L) << 40)) | ((((long) (local10_life129)[3]) & 255L) << 32)) | ((((long) (local10_life129)[4]) & 255L) << 24)) | ((((long) (local10_life129)[5]) & 255L) << 16)) | ((((long) (local10_life129)[6]) & 255L) << 8)) | (((long) (local10_life129)[7]) & 255L));
    } while ((!(local2_life117 >= local5_life116)));
    K = ((long[])(local6_life112));
    L = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite175_132(25275, (1587872655419939404L ^ local31_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_70614f7acf711762_0(com.moon.iw a0) throws E;

public static void b(int[] p0) {
j = ((int[])(p0));
    return;
}


public java.nio.FloatBuffer b__FloatBuffer() {
return this.c;
}


public com.moon.jE b() {
return this.i;
}


public static int[] b__ArrayInt() {
return com.moon.iw.j;
}


protected abstract void b__Void();

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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26611);
    if (((com.moon.iw.L)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.iw.K)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.iw.M)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iw.M)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/iw", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.iw.L)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.iw.L)[life3_8])).longValue();
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.iw.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral1692_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected abstract void c__Void();

private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3754;
      if (I[var3] == null) {
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
         long var5 = H[var3];
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
         Object[] var9 = (Object[])J.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               J.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/iw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         I[var3] = var15;
      }

      return I[var3];
}


protected void d() {
long local1 = (com.moon.iw.v ^ 21360708825411L);
    this.d = ((com.moon.jG)(new com.moon.jG()));
    this.e = ((com.moon.jH)(new com.moon.jH()));
    ((com.moon.jG)(this.d)).a();
    ((com.moon.jH)(this.e)).a(((int)(__sourceIntrinsic_6cce62949456_originalDynamicSite412_6(299, (6894614913743776572L ^ local1)))));
    ((com.moon.jH)(this.e)).a(((int)(__sourceIntrinsic_6cce62949456_originalDynamicSite412_9(299, (6894614913743776572L ^ local1)))), ((long)(__sourceIntrinsic_6cce62949456_originalDynamicSite412_10(8255, (7309921386859471732L ^ local1)))), ((int)(__sourceIntrinsic_6cce62949456_originalDynamicSite412_11(1874, (944472427481984327L ^ local1)))));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral1693_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.iw.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2051);
    if (((com.moon.iw.z)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iw.A)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iw.A)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iw", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iw.y)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iw.z)[life5_8] = com.moon.iw.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iw.z)[life5_8];
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
        byte[] spill636_0 = p0;
        life4_9 += 1;
        life5_44 = (spill636_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill636_1 = p0;
        life4_9 += 1;
        life5_76 = (spill636_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill636_2 = p0;
        life4_9 += 1;
        life5_91 = (spill636_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public abstract com.moon.iU a__iU();

public void a__Void() {
long local1_life2 = (com.moon.iw.v ^ 88800164248443L);
    com.moon.iU local3_life4 = ((com.moon.iw)(this)).a__iU();
    this.g = ((com.moon.jD)(new com.moon.jD(__sourceIntrinsic_b82a5b29b709_originalDynamicSite51_8(((com.moon.iU)(local3_life4)).c(), __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_7(7807, (5503527234197829880L ^ local1_life2))), __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_12(((com.moon.iU)(local3_life4)).b(), __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_11(11168, (979751672437050657L ^ local1_life2))), ((com.moon.iU)(local3_life4)).a__Boolean())));
    ((com.moon.iw)(this)).d();
    ((com.moon.jD)(this.g)).a__Void();
    this.f = ((com.moon.h3)(((com.moon.h4)(((com.moon.h4)(((com.moon.h4)(com.moon.h3.a__h4())).a(((java.lang.String)(((com.moon.iU)(local3_life4)).a__String()))))).a(((com.moon.jD)(this.g))))).a()));
    ((com.moon.iw)(this)).b__Void();
    ((com.moon.h3)(this.f)).a__Void();
    ((com.moon.h3)(this.f)).b__Void();
    ((com.moon.jE)(this.i)).a__Void();
    ((com.moon.jE)(this.h)).a__Void();
    org.lwjgl.opengl.GL15.glBindBuffer(((int)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite51_35(299, (6894681253719974148L ^ local1_life2)))), ((int)(0)));
    org.lwjgl.opengl.GL30C.glBindVertexArray(((int)(0)));
    org.lwjgl.opengl.GL20.glUseProgram(((int)(0)));
    ((org.tinylog.TaggedLogger)(com.moon.iw.a)).info(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_originalDynamicSite51_41(9329, (1635278148031021810L ^ local1_life2)))), ((java.lang.Object[])(new java.lang.Object[] {((java.lang.Object)(this)).getClass()})));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1696_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.jG a__jG() {
return this.d;
}


public com.moon.jE a__jE() {
return this.h;
}


public com.moon.jD a__jD() {
return this.g;
}


public com.moon.h3 a() {
return this.f;
}


public com.moon.jH a__jH() {
return this.e;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.hY p0) {
int forwardValue433_28_0;
    int forwardValue433_35_0;
    com.moon.hY forwardValue433_44_0;
    int forwardValue433_106_0;
    com.moon.hY forwardValue433_108_0;
    int forwardValue433_144_0;
    int forwardValue433_158_0;
    int forwardValue433_174_0;
    int forwardValue433_198_0;
    com.moon.hY forwardValue433_203_0;
    org.lwjgl.util.vector.Matrix4f forwardValue433_204_0;
    com.moon.hY forwardValue433_227_0;
    org.lwjgl.util.vector.Matrix4f forwardValue433_230_0;
    int forwardValue433_265_0;
    int forwardValue433_272_0;
    int forwardValue433_278_0;
    int forwardValue433_298_0;
    int forwardValue433_315_0;
    int forwardValue433_332_0;
    int forwardValue433_342_0;
    int[] spill433_0;
    boolean spill433_1;
    com.moon.hY spill433_2;
    boolean spill433_3;
    com.moon.hY spill433_4;
    boolean spill433_5;
    com.moon.hY spill433_6;
    com.moon.hY spill433_7;
    boolean spill433_8;
    long life2_3;
    int[] life4_18;
    float life5_143;
    float life6_145;
    float life7_147;
    float life8_149;
    float life9_151;
    float life10_153;
    float life11_155;
    float life12_157;
    float life13_159;
    float life14_161;
    org.lwjgl.util.vector.Matrix4f life15_282;
    forward_join_342: {
    forward_join_337: {
    forward_join_332: {
    forward_join_330: {
    forward_join_315: {
    forward_join_314: {
    forward_join_298: {
    forward_join_297: {
    forward_join_278: {
    forward_join_277: {
    forward_join_272: {
    forward_join_270: {
    forward_join_265: {
    forward_join_252: {
    forward_join_230: {
    forward_join_229: {
    forward_join_227: {
    forward_join_204: {
    forward_join_203: {
    forward_join_202: {
    forward_join_198: {
    forward_join_181: {
    forward_join_174: {
    forward_join_172: {
    forward_join_158: {
    forward_join_157: {
    forward_join_144: {
    forward_join_143: {
    forward_join_109: {
    forward_join_108: {
    forward_join_106: {
    forward_join_102: {
    forward_join_95: {
    forward_join_53: {
    forward_join_44: {
    forward_join_43: {
    forward_join_35: {
    forward_join_28: {
    forward_join_26: {
    life2_3 = (com.moon.iw.v ^ 41280305745728L);
    moom.kZ.a(((int)(__sourceIntrinsic_35337a3ac49e_invokedynamic433_1(20584, (3727595847538525306L ^ life2_3)))), ((float)(0x0.0p0f)));
    spill433_0 = com.moon.iw.b__ArrayInt();
    ((com.moon.jD)(this.g)).a__Void();
    ((com.moon.jG)(this.d)).a();
    life4_18 = spill433_0;
    spill433_1 = ((com.moon.hY)(p0)).g__Boolean();
    if (!((life4_18 == null))) {
        forwardValue433_28_0 = ((spill433_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill433_1))) {
        break forward_join_26;
    }
    ((com.moon.hY)(p0)).e();
    }
    forwardValue433_28_0 = ((((com.moon.hY)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_35_0 = forwardValue433_28_0;
        break forward_join_35;
    }
    if (!((forwardValue433_28_0 != 0))) {
        break forward_join_53;
    }
    spill433_2 = p0;
    if (!((life4_18 == null))) {
        forwardValue433_44_0 = spill433_2;
        break forward_join_44;
    }
    forwardValue433_35_0 = ((((com.moon.hY)(spill433_2)).f__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue433_35_0 == 0))) {
        break forward_join_43;
    }
    ((com.moon.hY)(p0)).f();
    if (!((life4_18 != null))) {
        break forward_join_95;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    forwardValue433_44_0 = p0;
    }
    ((com.moon.jH)(((com.moon.hY)(forwardValue433_44_0)).a__jH())).a(((int)(__sourceIntrinsic_35337a3ac49e_invokedynamic433_18(10058, (6587356588283278170L ^ life2_3)))));
    if (!((life4_18 != null))) {
        break forward_join_95;
    }
    }
    ((com.moon.jH)(this.e)).a(((int)(__sourceIntrinsic_35337a3ac49e_invokedynamic433_21(299, (6894625488011859263L ^ life2_3)))));
    ((com.moon.jH)(this.e)).a(((int)(__sourceIntrinsic_35337a3ac49e_invokedynamic433_24(299, (6894625488011859263L ^ life2_3)))), ((long)((((long) ((com.moon.iv)(((com.moon.hY)(p0)).a__iv())).b()) * __sourceIntrinsic_35337a3ac49e_invokedynamic433_27(21171, (8833002018143055866L ^ life2_3))))), ((int)(__sourceIntrinsic_35337a3ac49e_invokedynamic433_28(30108, (5173937790191296911L ^ life2_3)))));
    ((com.moon.jH)(this.e)).a(((int)(__sourceIntrinsic_35337a3ac49e_invokedynamic433_31(299, (6894625488011859263L ^ life2_3)))), ((long)(0L)), ((com.moon.iv)(((com.moon.hY)(p0)).a__iv())));
    }
    spill433_3 = ((com.moon.hY)(p0)).c__Boolean();
    if (!((life4_18 == null))) {
        forwardValue433_106_0 = ((spill433_3) ? 1 : 0);
        break forward_join_106;
    }
    if (!(spill433_3)) {
        break forward_join_102;
    }
    ((com.moon.hY)(p0)).b__Void();
    }
    spill433_4 = p0;
    if (!((life4_18 == null))) {
        forwardValue433_108_0 = spill433_4;
        break forward_join_108;
    }
    forwardValue433_106_0 = ((((com.moon.hY)(spill433_4)).d__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue433_106_0 != 0))) {
        break forward_join_109;
    }
    forwardValue433_108_0 = p0;
    }
    ((com.moon.hY)(forwardValue433_108_0)).c__Void();
    }
    life5_143 = com.moon.hU.a();
    life6_145 = com.moon.hU.b();
    life7_147 = com.moon.hU.c();
    life8_149 = com.moon.hU.d();
    life9_151 = com.moon.hU.e();
    life10_153 = com.moon.hU.f();
    life11_155 = com.moon.hU.g();
    life12_157 = com.moon.hU.h();
    life13_159 = com.moon.hU.i();
    life14_161 = com.moon.hU.j();
    spill433_5 = com.moon.hU.a__Boolean();
    if (!((life4_18 == null))) {
        forwardValue433_144_0 = ((spill433_5) ? 1 : 0);
        break forward_join_144;
    }
    if (!(spill433_5)) {
        break forward_join_143;
    }
    ((org.lwjgl.util.vector.Matrix4f)(((com.moon.hY)(p0)).a__Matrix4f())).scale(((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(life5_143, life6_145, life7_147))));
    }
    forwardValue433_144_0 = ((com.moon.hU.b__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_158_0 = forwardValue433_144_0;
        break forward_join_158;
    }
    if (!((forwardValue433_144_0 != 0))) {
        break forward_join_157;
    }
    ((org.lwjgl.util.vector.Matrix4f)(((com.moon.hY)(p0)).a__Matrix4f())).translate(((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(life8_149, life9_151, life10_153))));
    }
    forwardValue433_158_0 = ((com.moon.hU.c__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_174_0 = forwardValue433_158_0;
        break forward_join_174;
    }
    if (!((forwardValue433_158_0 != 0))) {
        break forward_join_172;
    }
    ((org.lwjgl.util.vector.Matrix4f)(((com.moon.hY)(p0)).a__Matrix4f())).rotate(((float)(life11_155)), ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(life12_157, life13_159, life14_161))));
    }
    forwardValue433_174_0 = ((((com.moon.hY)(p0)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_198_0 = forwardValue433_174_0;
        break forward_join_198;
    }
    if (!((forwardValue433_174_0 != 0))) {
        break forward_join_181;
    }
    ((com.moon.hY)(p0)).a(((com.moon.jD)(this.g)));
    }
    ((com.moon.h3)(this.f)).b__Void();
    ((com.moon.iw)(this)).c__Void();
    ((java.nio.FloatBuffer)(this.b)).clear();
    ((java.nio.FloatBuffer)(this.c)).clear();
    spill433_6 = p0;
    if (!((life4_18 == null))) {
        forwardValue433_203_0 = spill433_6;
        break forward_join_203;
    }
    forwardValue433_198_0 = ((((com.moon.hY)(spill433_6)).b__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue433_198_0 != 0))) {
        break forward_join_202;
    }
    forwardValue433_204_0 = ((com.moon.hY)(p0)).b__Matrix4f();
    break forward_join_204;
    }
    forwardValue433_203_0 = p0;
    }
    forwardValue433_204_0 = ((com.moon.hY)(forwardValue433_203_0)).a__Matrix4f();
    }
    com.moon.hV.a(((org.lwjgl.util.vector.Matrix4f)(forwardValue433_204_0)), ((java.nio.FloatBuffer)(this.b)));
    ((com.moon.jE)(this.h)).a(((boolean)(false)), ((java.nio.FloatBuffer)(this.b)));
    life15_282 = com.moon.hV.a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    spill433_7 = p0;
    if (!((life4_18 == null))) {
        forwardValue433_227_0 = spill433_7;
        break forward_join_227;
    }
    if (!(((com.moon.hY)(spill433_7)).b__Boolean())) {
        break forward_join_229;
    }
    forwardValue433_227_0 = p0;
    }
    forwardValue433_230_0 = ((com.moon.hY)(forwardValue433_227_0)).c__Matrix4f();
    break forward_join_230;
    }
    forwardValue433_230_0 = life15_282;
    }
    com.moon.hV.a(((org.lwjgl.util.vector.Matrix4f)(forwardValue433_230_0)), ((java.nio.FloatBuffer)(this.c)));
    ((com.moon.jE)(this.i)).a(((boolean)(false)), ((java.nio.FloatBuffer)(this.c)));
    org.lwjgl.opengl.GL15.glDrawArrays(((int)(((com.moon.hY)(p0)).c())), ((int)(0)), ((int)(((com.moon.hY)(p0)).b__Int())));
    spill433_8 = ((com.moon.hY)(p0)).h();
    if (!((life4_18 == null))) {
        forwardValue433_265_0 = ((spill433_8) ? 1 : 0);
        break forward_join_265;
    }
    if (!((!spill433_8))) {
        break forward_join_252;
    }
    ((com.moon.hY)(p0)).g();
    }
    org.lwjgl.opengl.GL15.glBindBuffer(((int)(__sourceIntrinsic_35337a3ac49e_invokedynamic433_96(299, (6894625488011859263L ^ life2_3)))), ((int)(0)));
    org.lwjgl.opengl.GL30C.glBindVertexArray(((int)(0)));
    org.lwjgl.opengl.GL20.glUseProgram(((int)(0)));
    forwardValue433_265_0 = ((((com.moon.hY)(p0)).c__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_272_0 = forwardValue433_265_0;
        break forward_join_272;
    }
    if (!((forwardValue433_265_0 != 0))) {
        break forward_join_270;
    }
    ((com.moon.hY)(p0)).d();
    }
    forwardValue433_272_0 = ((((com.moon.hY)(p0)).d__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_278_0 = forwardValue433_272_0;
        break forward_join_278;
    }
    if (!((forwardValue433_272_0 != 0))) {
        break forward_join_277;
    }
    moom.kZ.i(((int)(0)));
    }
    forwardValue433_278_0 = ((com.moon.hU.a__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_298_0 = forwardValue433_278_0;
        break forward_join_298;
    }
    if (!((forwardValue433_278_0 != 0))) {
        break forward_join_297;
    }
    ((org.lwjgl.util.vector.Matrix4f)(((com.moon.hY)(p0)).a__Matrix4f())).scale(((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f((0x1.0p0f / life5_143), (0x1.0p0f / life6_145), (0x1.0p0f / life7_147)))));
    }
    forwardValue433_298_0 = ((com.moon.hU.b__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_315_0 = forwardValue433_298_0;
        break forward_join_315;
    }
    if (!((forwardValue433_298_0 != 0))) {
        break forward_join_314;
    }
    ((org.lwjgl.util.vector.Matrix4f)(((com.moon.hY)(p0)).a__Matrix4f())).translate(((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f((-life8_149), (-life9_151), (-life10_153)))));
    }
    forwardValue433_315_0 = ((com.moon.hU.c__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_332_0 = forwardValue433_315_0;
        break forward_join_332;
    }
    if (!((forwardValue433_315_0 != 0))) {
        break forward_join_330;
    }
    ((org.lwjgl.util.vector.Matrix4f)(((com.moon.hY)(p0)).a__Matrix4f())).rotate(((float)((-life11_155))), ((org.lwjgl.util.vector.Vector3f)(new org.lwjgl.util.vector.Vector3f(life12_157, life13_159, life14_161))));
    }
    forwardValue433_332_0 = ((((com.moon.hY)(p0)).e__Boolean()) ? 1 : 0);
    }
    if (!((life4_18 == null))) {
        forwardValue433_342_0 = forwardValue433_332_0;
        break forward_join_342;
    }
    if (!((forwardValue433_332_0 != 0))) {
        break forward_join_337;
    }
    ((com.moon.hY)(p0)).a__Void();
    }
    forwardValue433_342_0 = __sourceIntrinsic_35337a3ac49e_invokedynamic433_121(19917, (5483786074237557212L ^ life2_3));
    }
    moom.kZ.a(((int)(forwardValue433_342_0)), ((float)(0x1.99999ap-4f)));
    return;
}


public java.nio.FloatBuffer a__FloatBuffer() {
return this.b;
}


private com.moon.jD lambda$new$0() {
return this.g;
}


private com.moon.jD lambda$new$1() {
return this.g;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite175_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_70614f7acf711762_originalDynamicSite18_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_70614f7acf711762_originalDynamicSite18_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_70614f7acf711762_originalDynamicSite18_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_70614f7acf711762_originalDynamicSite18_16(com.moon.iw a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_70614f7acf711762_originalDynamicSite18_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_70614f7acf711762_originalDynamicSite18_24(com.moon.iw a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_24(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_35337a3ac49e_invokedynamic433_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_35337a3ac49e_invokedynamic433_121(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1696_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_8(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_12(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_originalDynamicSite51_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite412_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite412_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_6cce62949456_originalDynamicSite412_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6cce62949456_originalDynamicSite412_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral1693_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral1692_0() throws E;
}
