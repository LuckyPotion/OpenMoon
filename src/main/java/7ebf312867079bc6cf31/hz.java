package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hz extends com.moon.hx {

private com.moon.nY f;

private com.moon.nX g;

private com.moon.module.impl.HUD h;

private com.moon.module.impl.Effects i;

private net.minecraft.entity.player.EntityPlayer j;

private net.minecraft.entity.player.EntityPlayer k;

private long l;

private long m;

private boolean n;

private boolean o;

private static long q;

private static java.lang.String r;

private static long[] s;

private static java.lang.Integer[] t;

private static java.util.Map u;

private static long[] v;

private static java.lang.Long[] w;

private static java.util.Map x;

public hz() { super(); }


private static void __sourceConstructorBody_750352107c0a325a(com.moon.hz receiver) throws Throwable {

long local1 = (com.moon.hz.q ^ 122607543939566L);

    com.moon.hz.__sourceConstructorInit_750352107c0a325a_0(((com.moon.hz)(receiver)));

    ((com.moon.hz)(receiver)).f = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_750352107c0a325a_originalDynamicSite987_2(29728, (5358982949795566958L ^ local1)), com.moon.cj.EASE_IN_OUT_BACK)));

    ((com.moon.hz)(receiver)).g = ((com.moon.nX)(new com.moon.nX()));

    return;

}



static {
q = ((long)(((moom._a)(moom._c.a(((long)(7472089060871580632L)), ((long)(-420864194051337068L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(252835096100631L)))));
    long local22_life6 = (com.moon.hz.q ^ 133855186328163L);
    javax.crypto.Cipher local24_life8;
    javax.crypto.Cipher __sourceSpill147_10 = (local24_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill147_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill147_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill147_13 = new byte[8];
    (__sourceSpill147_13)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local25_life14 = 1;
    while ((local25_life14 < 8)) {
        (__sourceSpill147_13)[local25_life14] = ((byte) ((int) ((local22_life6 << (local25_life14 * 8)) >>> 56)));
        local25_life14 += 1;
    }
    byte[] __sourcePreallocation147_15 = __sourceSpill147_13;
    ((javax.crypto.Cipher)(__sourceSpill147_10)).init(((int)(__sourceSpill147_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill147_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation147_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill147_19 = ((java.lang.String)("ûÐáØÛh|")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill147_20 = local24_life8;
    byte[] local26_life22 = ((javax.crypto.Cipher)(__sourceSpill147_20)).doFinal(((byte[])(__sourceSpill147_19)));
    r = ((java.lang.String)(((java.lang.String)(com.moon.hz.a(((byte[])(local26_life22))))).intern()));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life28;
    javax.crypto.Cipher __sourceSpill147_30 = (local11_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill147_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill147_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill147_33 = new byte[8];
    (__sourceSpill147_33)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local12_life34 = 1;
    while ((local12_life34 < 8)) {
        (__sourceSpill147_33)[local12_life34] = ((byte) ((int) ((local22_life6 << (local12_life34 * 8)) >>> 56)));
        local12_life34 += 1;
    }
    byte[] __sourcePreallocation147_35 = __sourceSpill147_33;
    ((javax.crypto.Cipher)(__sourceSpill147_30)).init(((int)(__sourceSpill147_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill147_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation147_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life38 = new long[5];
    int local14_life39 = 0;
    java.lang.String local15_life40;
    int local16_life42 = ((java.lang.String)((local15_life40 = "å/cìG»\nT§n\032}\031~·Xù`6Xbf\036\036"))).length();
    int local13_life43 = 0;
    do {
        java.lang.String __sourceSpill147_44 = local15_life40;
        int __sourceSpill147_45 = local13_life43;
        local13_life43 += 8;
        byte[] local18_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill147_44)).substring(((int)(__sourceSpill147_45)), ((int)(local13_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill147_49 = local17_life38;
        int __sourceSpill147_50 = local14_life39;
        local14_life39 += 1;
        long local19_life51 = (((((((((((long) (local18_life48)[0]) & 255L) << 56) | ((((long) (local18_life48)[1]) & 255L) << 48)) | ((((long) (local18_life48)[2]) & 255L) << 40)) | ((((long) (local18_life48)[3]) & 255L) << 32)) | ((((long) (local18_life48)[4]) & 255L) << 24)) | ((((long) (local18_life48)[5]) & 255L) << 16)) | ((((long) (local18_life48)[6]) & 255L) << 8)) | (((long) (local18_life48)[7]) & 255L));
        byte[] __sourceSpill147_52 = new byte[8];
        (__sourceSpill147_52)[0] = ((byte) ((int) (local19_life51 >>> 56)));
        (__sourceSpill147_52)[1] = ((byte) ((int) (local19_life51 >>> 48)));
        (__sourceSpill147_52)[2] = ((byte) ((int) (local19_life51 >>> 40)));
        (__sourceSpill147_52)[3] = ((byte) ((int) (local19_life51 >>> 32)));
        (__sourceSpill147_52)[4] = ((byte) ((int) (local19_life51 >>> 24)));
        (__sourceSpill147_52)[5] = ((byte) ((int) (local19_life51 >>> 16)));
        (__sourceSpill147_52)[6] = ((byte) ((int) (local19_life51 >>> 8)));
        (__sourceSpill147_52)[7] = ((byte) ((int) local19_life51));
        javax.crypto.Cipher __sourceSpill147_53 = local11_life28;
        byte[] local21_life55 = ((javax.crypto.Cipher)(__sourceSpill147_53)).doFinal(((byte[])(__sourceSpill147_52)));
        (__sourceSpill147_49)[__sourceSpill147_50] = (((((((((((long) (local21_life55)[0]) & 255L) << 56) | ((((long) (local21_life55)[1]) & 255L) << 48)) | ((((long) (local21_life55)[2]) & 255L) << 40)) | ((((long) (local21_life55)[3]) & 255L) << 32)) | ((((long) (local21_life55)[4]) & 255L) << 24)) | ((((long) (local21_life55)[5]) & 255L) << 16)) | ((((long) (local21_life55)[6]) & 255L) << 8)) | (((long) (local21_life55)[7]) & 255L));
    } while ((!(local13_life43 >= local16_life42)));
    local16_life42 = ((java.lang.String)((local15_life40 = "¤Ïï¯%ÝI«°\034øvU\001"))).length();
    local13_life43 = 0;
    do {
        java.lang.String __sourceSpill147_57 = local15_life40;
        int __sourceSpill147_58 = local13_life43;
        local13_life43 += 8;
        byte[] local18_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill147_57)).substring(((int)(__sourceSpill147_58)), ((int)(local13_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill147_62 = local17_life38;
        int __sourceSpill147_63 = local14_life39;
        local14_life39 += 1;
        long local19_life64 = (((((((((((long) (local18_life61)[0]) & 255L) << 56) | ((((long) (local18_life61)[1]) & 255L) << 48)) | ((((long) (local18_life61)[2]) & 255L) << 40)) | ((((long) (local18_life61)[3]) & 255L) << 32)) | ((((long) (local18_life61)[4]) & 255L) << 24)) | ((((long) (local18_life61)[5]) & 255L) << 16)) | ((((long) (local18_life61)[6]) & 255L) << 8)) | (((long) (local18_life61)[7]) & 255L));
        byte[] __sourceSpill147_65 = new byte[8];
        (__sourceSpill147_65)[0] = ((byte) ((int) (local19_life64 >>> 56)));
        (__sourceSpill147_65)[1] = ((byte) ((int) (local19_life64 >>> 48)));
        (__sourceSpill147_65)[2] = ((byte) ((int) (local19_life64 >>> 40)));
        (__sourceSpill147_65)[3] = ((byte) ((int) (local19_life64 >>> 32)));
        (__sourceSpill147_65)[4] = ((byte) ((int) (local19_life64 >>> 24)));
        (__sourceSpill147_65)[5] = ((byte) ((int) (local19_life64 >>> 16)));
        (__sourceSpill147_65)[6] = ((byte) ((int) (local19_life64 >>> 8)));
        (__sourceSpill147_65)[7] = ((byte) ((int) local19_life64));
        javax.crypto.Cipher __sourceSpill147_66 = local11_life28;
        byte[] local21_life68 = ((javax.crypto.Cipher)(__sourceSpill147_66)).doFinal(((byte[])(__sourceSpill147_65)));
        (__sourceSpill147_62)[__sourceSpill147_63] = (((((((((((long) (local21_life68)[0]) & 255L) << 56) | ((((long) (local21_life68)[1]) & 255L) << 48)) | ((((long) (local21_life68)[2]) & 255L) << 40)) | ((((long) (local21_life68)[3]) & 255L) << 32)) | ((((long) (local21_life68)[4]) & 255L) << 24)) | ((((long) (local21_life68)[5]) & 255L) << 16)) | ((((long) (local21_life68)[6]) & 255L) << 8)) | (((long) (local21_life68)[7]) & 255L));
    } while ((!(local13_life43 >= local16_life42)));
    s = ((long[])(local17_life38));
    t = ((java.lang.Integer[])(new java.lang.Integer[5]));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life73;
    javax.crypto.Cipher __sourceSpill147_75 = (local0_life73 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill147_76 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill147_77 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill147_78 = new byte[8];
    (__sourceSpill147_78)[0] = ((byte) ((int) (local22_life6 >>> 56)));
    int local1_life79 = 1;
    while ((local1_life79 < 8)) {
        (__sourceSpill147_78)[local1_life79] = ((byte) ((int) ((local22_life6 << (local1_life79 * 8)) >>> 56)));
        local1_life79 += 1;
    }
    byte[] __sourcePreallocation147_80 = __sourceSpill147_78;
    ((javax.crypto.Cipher)(__sourceSpill147_75)).init(((int)(__sourceSpill147_76)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill147_77)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation147_80)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life83 = new long[4];
    int local3_life84 = 0;
    java.lang.String local4_life85;
    int local5_life87 = ((java.lang.String)((local4_life85 = "JóÞáhMsR<\034$9%e¥"))).length();
    int local2_life88 = 0;
    do {
        java.lang.String __sourceSpill147_89 = local4_life85;
        int __sourceSpill147_90 = local2_life88;
        local2_life88 += 8;
        byte[] local7_life93 = ((java.lang.String)(((java.lang.String)(__sourceSpill147_89)).substring(((int)(__sourceSpill147_90)), ((int)(local2_life88))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill147_94 = local6_life83;
        int __sourceSpill147_95 = local3_life84;
        local3_life84 += 1;
        long local8_life96 = (((((((((((long) (local7_life93)[0]) & 255L) << 56) | ((((long) (local7_life93)[1]) & 255L) << 48)) | ((((long) (local7_life93)[2]) & 255L) << 40)) | ((((long) (local7_life93)[3]) & 255L) << 32)) | ((((long) (local7_life93)[4]) & 255L) << 24)) | ((((long) (local7_life93)[5]) & 255L) << 16)) | ((((long) (local7_life93)[6]) & 255L) << 8)) | (((long) (local7_life93)[7]) & 255L));
        byte[] __sourceSpill147_97 = new byte[8];
        (__sourceSpill147_97)[0] = ((byte) ((int) (local8_life96 >>> 56)));
        (__sourceSpill147_97)[1] = ((byte) ((int) (local8_life96 >>> 48)));
        (__sourceSpill147_97)[2] = ((byte) ((int) (local8_life96 >>> 40)));
        (__sourceSpill147_97)[3] = ((byte) ((int) (local8_life96 >>> 32)));
        (__sourceSpill147_97)[4] = ((byte) ((int) (local8_life96 >>> 24)));
        (__sourceSpill147_97)[5] = ((byte) ((int) (local8_life96 >>> 16)));
        (__sourceSpill147_97)[6] = ((byte) ((int) (local8_life96 >>> 8)));
        (__sourceSpill147_97)[7] = ((byte) ((int) local8_life96));
        javax.crypto.Cipher __sourceSpill147_98 = local0_life73;
        byte[] local10_life100 = ((javax.crypto.Cipher)(__sourceSpill147_98)).doFinal(((byte[])(__sourceSpill147_97)));
        (__sourceSpill147_94)[__sourceSpill147_95] = (((((((((((long) (local10_life100)[0]) & 255L) << 56) | ((((long) (local10_life100)[1]) & 255L) << 48)) | ((((long) (local10_life100)[2]) & 255L) << 40)) | ((((long) (local10_life100)[3]) & 255L) << 32)) | ((((long) (local10_life100)[4]) & 255L) << 24)) | ((((long) (local10_life100)[5]) & 255L) << 16)) | ((((long) (local10_life100)[6]) & 255L) << 8)) | (((long) (local10_life100)[7]) & 255L));
    } while ((!(local2_life88 >= local5_life87)));
    local5_life87 = ((java.lang.String)((local4_life85 = "ÿ¢Y\r£ j?|\032\0252>¸"))).length();
    local2_life88 = 0;
    do {
        java.lang.String __sourceSpill147_102 = local4_life85;
        int __sourceSpill147_103 = local2_life88;
        local2_life88 += 8;
        byte[] local7_life106 = ((java.lang.String)(((java.lang.String)(__sourceSpill147_102)).substring(((int)(__sourceSpill147_103)), ((int)(local2_life88))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill147_107 = local6_life83;
        int __sourceSpill147_108 = local3_life84;
        local3_life84 += 1;
        long local8_life109 = (((((((((((long) (local7_life106)[0]) & 255L) << 56) | ((((long) (local7_life106)[1]) & 255L) << 48)) | ((((long) (local7_life106)[2]) & 255L) << 40)) | ((((long) (local7_life106)[3]) & 255L) << 32)) | ((((long) (local7_life106)[4]) & 255L) << 24)) | ((((long) (local7_life106)[5]) & 255L) << 16)) | ((((long) (local7_life106)[6]) & 255L) << 8)) | (((long) (local7_life106)[7]) & 255L));
        byte[] __sourceSpill147_110 = new byte[8];
        (__sourceSpill147_110)[0] = ((byte) ((int) (local8_life109 >>> 56)));
        (__sourceSpill147_110)[1] = ((byte) ((int) (local8_life109 >>> 48)));
        (__sourceSpill147_110)[2] = ((byte) ((int) (local8_life109 >>> 40)));
        (__sourceSpill147_110)[3] = ((byte) ((int) (local8_life109 >>> 32)));
        (__sourceSpill147_110)[4] = ((byte) ((int) (local8_life109 >>> 24)));
        (__sourceSpill147_110)[5] = ((byte) ((int) (local8_life109 >>> 16)));
        (__sourceSpill147_110)[6] = ((byte) ((int) (local8_life109 >>> 8)));
        (__sourceSpill147_110)[7] = ((byte) ((int) local8_life109));
        javax.crypto.Cipher __sourceSpill147_111 = local0_life73;
        byte[] local10_life113 = ((javax.crypto.Cipher)(__sourceSpill147_111)).doFinal(((byte[])(__sourceSpill147_110)));
        (__sourceSpill147_107)[__sourceSpill147_108] = (((((((((((long) (local10_life113)[0]) & 255L) << 56) | ((((long) (local10_life113)[1]) & 255L) << 48)) | ((((long) (local10_life113)[2]) & 255L) << 40)) | ((((long) (local10_life113)[3]) & 255L) << 32)) | ((((long) (local10_life113)[4]) & 255L) << 24)) | ((((long) (local10_life113)[5]) & 255L) << 16)) | ((((long) (local10_life113)[6]) & 255L) << 8)) | (((long) (local10_life113)[7]) & 255L));
    } while ((!(local2_life88 >= local5_life87)));
    v = ((long[])(local6_life83));
    w = ((java.lang.Long[])(new java.lang.Long[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_750352107c0a325a_0(com.moon.hz a0) throws E;

private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.hz.b(((int)(local4)), ((long)(local5)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6647);
    if (((com.moon.hz.w)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.hz.v)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.hz.x)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hz.x)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/hz", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.hz.w)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.hz.w)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1550_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b__Void() {
com.moon.hz forwardValue407_33_0;
    int forwardValue407_51_0;
    com.moon.hz forwardValue407_57_0;
    java.lang.String spill407_0;
    com.moon.hz spill407_1;
    int spill407_2;
    com.moon.hz spill407_3;
    long life1_3;
    java.lang.String life3_14;
    forward_join_62: {
    forward_join_57: {
    forward_join_52: {
    forward_join_51: {
    forward_join_36: {
    forward_join_33: {
    life1_3 = (com.moon.hz.q ^ 42914833249183L);
    ((com.moon.hz)(this)).d__sourceReturn_da8c82d5d4();
    spill407_0 = net.minecraft.command.CommandBase.b();
    ((com.moon.nY)(this.f)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.o)));
    life3_14 = spill407_0;
    spill407_1 = this;
    if (!((life3_14 != null))) {
        forwardValue407_33_0 = spill407_1;
        break forward_join_33;
    }
    if (!((((com.moon.hz)(spill407_1)).a__tn() != this.j))) {
        break forward_join_36;
    }
    this.l = ((long)(__sourceIntrinsic_9bf881b104f5_invokedynamic407_8(32324, (9137396533943819641L ^ life1_3))));
    this.m = ((long)(java.lang.System.currentTimeMillis()));
    forwardValue407_33_0 = this;
    }
    ((com.moon.hz)(forwardValue407_33_0)).j = ((net.minecraft.entity.player.EntityPlayer)(((com.moon.hz)(this)).a__tn()));
    }
    spill407_2 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.m))), ((long)(this.l)));
    if (!((life3_14 != null))) {
        forwardValue407_51_0 = spill407_2;
        break forward_join_51;
    }
    if (!((spill407_2 >= 0))) {
        break forward_join_52;
    }
    spill407_3 = this;
    if (!((life3_14 != null))) {
        forwardValue407_57_0 = spill407_3;
        break forward_join_57;
    }
    forwardValue407_51_0 = ((((com.moon.nY)(((com.moon.hz)(spill407_3)).f)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue407_51_0 == 0))) {
        break forward_join_62;
    }
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.i)).a__gW())).c();
    forwardValue407_57_0 = this;
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(((com.moon.hz)(forwardValue407_57_0)).i)).a())).a(((boolean)(true)));
    }
    return;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private float e() {
java.lang.Object local1 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    java.lang.Object local2 = ((net.minecraft.entity.player.EntityPlayer)(this.k)).a__String();
    return java.lang.Math.max(((float)((((((com.moon.jm)(local1)).a(((java.lang.String)(local2)), ((float)(0x1.4p3f))) + 0x1.0p5f) + 0x1.0p3f) + 0x1.6p2f))), ((float)(0x1.b8p6f)));
}


private void d__sourceReturn_da8c82d5d4() {
com.moon.hz forwardValue408_24_0;
    com.moon.hz spill408_0;
    com.moon.hz spill408_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (com.moon.hz.q ^ 47886869773036L);
    life3_5 = net.minecraft.command.CommandBase.b();
    spill408_0 = this;
    if (!((life3_5 != null))) {
        forwardValue408_24_0 = spill408_0;
        break forward_join_24;
    }
    if (!((((com.moon.hz)(spill408_0)).h != null))) {
        break forward_join_16;
    }
    spill408_1 = this;
    if (!((life3_5 != null))) {
        forwardValue408_24_0 = spill408_1;
        break forward_join_24;
    }
    if (!((((com.moon.hz)(spill408_1)).i == null))) {
        break forward_join_30;
    }
    }
    this.h = ((com.moon.module.impl.HUD)(((com.moon.module.impl.HUD)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))))));
    forwardValue408_24_0 = this;
    }
    ((com.moon.hz)(forwardValue408_24_0)).i = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hz.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21926;
      if (t[var3] == null) {
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
         long var5 = s[var3];
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
         Object[] var9 = (Object[])u.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               u.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/hz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         t[var3] = var15;
      }

      return t[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1553_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(boolean p0) {
float forwardValue405_82_0;
    com.moon.hz forwardValue405_114_0;
    com.moon.hz forwardValue405_120_0;
    java.lang.String spill405_0;
    com.moon.hz spill405_1;
    long life2_3;
    moom.ir life5_6;
    java.lang.String life4_7;
    double life6_10;
    double life8_13;
    float life10_17;
    float life11_33;
    float life12_49;
    com.moon.hW life13_79;
    float life14_87;
    forward_join_123: {
    forward_join_120: {
    forward_join_114: {
    forward_join_113: {
    forward_join_82: {
    forward_join_81: {
    life2_3 = (com.moon.hz.q ^ 55054799933732L);
    spill405_0 = net.minecraft.command.CommandBase.b();
    life5_6 = com.moon.nS.a();
    life4_7 = spill405_0;
    life6_10 = ((moom.ir)(life5_6)).a();
    life8_13 = ((moom.ir)(life5_6)).b();
    life10_17 = ((com.moon.nY)(this.f)).c();
    life11_33 = (((float) (((double) (((com.moon.hz)(this)).a() + (this.d / 0x1.0p1f))) / life6_10)) * (0x1.0p0f - life10_17));
    life12_49 = (((float) (((double) (((com.moon.hz)(this)).b() + (this.e / 0x1.0p1f))) / life8_13)) * (0x1.0p0f - life10_17));
    com.moon.hU.a(((float)(life10_17)), ((float)(life10_17)), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(life11_33)), ((float)(life12_49)), ((float)(0x0.0p0f)));
    com.moon.hU.a(((float)(life10_17)));
    spill405_1 = this;
    if (!((life4_7 != null))) {
        forwardValue405_114_0 = spill405_1;
        break forward_join_114;
    }
    if (!((((com.moon.hz)(spill405_1)).k != null))) {
        break forward_join_113;
    }
    this.d = ((float)(((com.moon.hz)(this)).e()));
    this.e = ((float)(0x1.4p5f));
    life13_79 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    if (!(p0)) {
        break forward_join_81;
    }
    forwardValue405_82_0 = 0x1.ccccccp-2f;
    break forward_join_82;
    }
    forwardValue405_82_0 = 0x0.0p0f;
    }
    life14_87 = forwardValue405_82_0;
    ((com.moon.hW)(life13_79)).a(((com.moon.iX)(com.moon.i3.a(((float)((((com.moon.hz)(this)).a() - life14_87))), ((float)((((com.moon.hz)(this)).b() - life14_87))), ((float)((this.d + (life14_87 * 0x1.0p1f)))), ((float)((this.e + (life14_87 * 0x1.0p1f)))), ((float)((0x1.0p3f + life14_87))), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    ((com.moon.hW)(life13_79)).b();
    }
    forwardValue405_114_0 = this;
    }
    if (!((life4_7 != null))) {
        forwardValue405_120_0 = forwardValue405_114_0;
        break forward_join_120;
    }
    if (!((!((com.moon.nY)(((com.moon.hz)(forwardValue405_114_0)).f)).a__Boolean()))) {
        break forward_join_123;
    }
    forwardValue405_120_0 = this;
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(((com.moon.hz)(forwardValue405_120_0)).i)).a__gW())).c();
    }
    com.moon.hU.b__Void();
    com.moon.hU.d__Void();
    com.moon.hU.a__Void();
    return;
}


private int a__sourceReturn_8abf5c6871() {
java.lang.Object forwardValue403_40_0;
    int forwardValue403_42_0;
    java.lang.String spill403_0;
    java.lang.Boolean spill403_1;
    long life1_3;
    java.lang.String life3_7;
    forward_join_42: {
    forward_join_40: {
    forward_join_36: {
    life1_3 = (com.moon.hz.q ^ 49091353946045L);
    spill403_0 = net.minecraft.command.CommandBase.b();
    ((com.moon.hz)(this)).d__sourceReturn_da8c82d5d4();
    life3_7 = spill403_0;
    spill403_1 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.TargetHud)(((com.moon.hz)(this)).a__l4())).a__kV())).getValue()));
    if (!((life3_7 != null))) {
        forwardValue403_40_0 = spill403_1;
        break forward_join_40;
    }
    if (!(((java.lang.Boolean)(spill403_1)).booleanValue())) {
        break forward_join_36;
    }
    forwardValue403_42_0 = ((com.moon.hz)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.h)), ((com.moon.b0)(com.moon.b0.SYNC)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.h)).e__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.h)).f__kX())).getValue())))).intValue())));
    break forward_join_42;
    }
    forwardValue403_40_0 = ((com.moon.setting.ColorSetting)(((com.moon.module.impl.TargetHud)(((com.moon.hz)(this)).a__l4())).a__kX())).getValue();
    }
    forwardValue403_42_0 = ((java.lang.Integer)(((java.lang.Integer)(forwardValue403_40_0)))).intValue();
    }
    return forwardValue403_42_0;
}


private int a(float p0, com.moon.module.impl.HUD p1, com.moon.b0 p2, int p3, int p4) {
return ((com.moon.hz)(this)).a(((float)(p0)), ((double)(0x1.194p12d)), ((com.moon.module.impl.HUD)(p1)), ((com.moon.b0)(p2)), ((int)(p3)), ((int)(p4)));
}


private int a(float p0, double p1, com.moon.module.impl.HUD p2, com.moon.b0 p3, int p4, int p5) {
java.lang.Object forwardValue37_29_0;
    int forwardValue37_189_0;
    java.lang.String spill37_0;
    com.moon.b0 spill37_1;
    int spill37_2;
    int spill37_3;
    int[] spill37_4;
    int[] spill37_5;
    int[] spill37_6;
    int[] spill37_7;
    int[] spill37_8;
    int[] spill37_9;
    int[] spill37_10;
    int[] spill37_11;
    int[] spill37_12;
    int[] spill37_13;
    int[] spill37_14;
    int[] spill37_15;
    int[] spill37_16;
    int[] spill37_17;
    long life8_3;
    int life11_7;
    java.lang.String life10_8;
    int life12_38;
    long life13_40;
    long life15_51;
    int life17_60;
    int[] life18_98;
    int life12_121;
    long life15_128;
    int[] life17_167;
    forward_join_190: {
    forward_join_189: {
    forward_join_188: {
    forward_join_119: {
    forward_join_42: {
    forward_join_34: {
    forward_join_29: {
    life8_3 = (com.moon.hz.q ^ 24080478728851L);
    spill37_0 = net.minecraft.command.CommandBase.b();
    life11_7 = ((com.moon.b0)(p3)).ordinal();
    life10_8 = spill37_0;
    spill37_1 = p3;
    if (!((life10_8 != null))) {
        forwardValue37_29_0 = spill37_1;
        break forward_join_29;
    }
    if (!((spill37_1 == com.moon.b0.SYNC))) {
        break forward_join_34;
    }
    p4 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(p2)).e__kX())).getValue())))).intValue();
    p5 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(p2)).f__kX())).getValue())))).intValue();
    forwardValue37_29_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(p2)).f__kY())).getValue();
    }
    life11_7 = (((com.moon.bY)(((com.moon.bY)(forwardValue37_29_0)))).ordinal() + 1);
    }
    life12_38 = -1;
    life13_40 = java.lang.System.currentTimeMillis();
    spill37_2 = life11_7;
    if (!((life10_8 != null))) {
        forwardValue37_189_0 = spill37_2;
        break forward_join_189;
    }
    switch (spill37_2) {
case 3:
{
        break forward_join_42;
    }
case 2:
{
        break forward_join_119;
    }
default:
{
        break forward_join_188;
    }
}
    }
    life15_51 = ((long) (0x1.8p0d * p1));
    spill37_3 = 11471;
    life17_60 = ((java.awt.Color)(((java.awt.Color)(((java.awt.Color)(new java.awt.Color(p4))).darker())).darker())).getRGB();
    int[] __stackOp37_21_0 = new int[__sourceIntrinsic_96a894c32cfa_invokedynamic37_20(spill37_3, (5091563372329599660L ^ life8_3))];
    spill37_4 = __stackOp37_21_0;
    (__stackOp37_21_0)[0] = p4;
    int[] __stackOp37_22_0 = spill37_4;
    spill37_5 = __stackOp37_22_0;
    (__stackOp37_22_0)[1] = life17_60;
    int[] __stackOp37_23_0 = spill37_5;
    spill37_6 = __stackOp37_23_0;
    (__stackOp37_23_0)[2] = p4;
    int[] __stackOp37_24_0 = spill37_6;
    spill37_7 = __stackOp37_24_0;
    (__stackOp37_24_0)[3] = life17_60;
    int[] __stackOp37_25_0 = spill37_7;
    spill37_8 = __stackOp37_25_0;
    (__stackOp37_25_0)[4] = p4;
    int[] __stackOp37_26_0 = spill37_8;
    spill37_9 = __stackOp37_26_0;
    (__stackOp37_26_0)[5] = life17_60;
    int[] __stackOp37_27_0 = spill37_9;
    spill37_10 = __stackOp37_27_0;
    (__stackOp37_27_0)[__sourceIntrinsic_96a894c32cfa_invokedynamic37_28(23396, (3265431039103497476L ^ life8_3))] = p4;
    life18_98 = spill37_10;
    life12_121 = com.moon.nD.a(((int[])(life18_98)), ((double)(((double) (((float) ((life13_40 + (((long) ((int) p0)) * __sourceIntrinsic_96a894c32cfa_invokedynamic37_29(4645, (8288237556058583061L ^ life8_3)))) % life15_51)) / (((float) life15_51) / 0x1.0p1f))))));
    if (!((life10_8 == null))) {
        break forward_join_190;
    }
    }
    life15_128 = ((long) (0x1.8p0d * p1));
    int[] __stackOp37_32_0 = new int[__sourceIntrinsic_96a894c32cfa_invokedynamic37_31(12621, (3983586049394712361L ^ life8_3))];
    spill37_11 = __stackOp37_32_0;
    (__stackOp37_32_0)[0] = p4;
    int[] __stackOp37_33_0 = spill37_11;
    spill37_12 = __stackOp37_33_0;
    (__stackOp37_33_0)[1] = p5;
    int[] __stackOp37_34_0 = spill37_12;
    spill37_13 = __stackOp37_34_0;
    (__stackOp37_34_0)[2] = p4;
    int[] __stackOp37_35_0 = spill37_13;
    spill37_14 = __stackOp37_35_0;
    (__stackOp37_35_0)[3] = p5;
    int[] __stackOp37_36_0 = spill37_14;
    spill37_15 = __stackOp37_36_0;
    (__stackOp37_36_0)[4] = p4;
    int[] __stackOp37_37_0 = spill37_15;
    spill37_16 = __stackOp37_37_0;
    (__stackOp37_37_0)[5] = p5;
    int[] __stackOp37_38_0 = spill37_16;
    spill37_17 = __stackOp37_38_0;
    (__stackOp37_38_0)[__sourceIntrinsic_96a894c32cfa_invokedynamic37_39(10973, (6827918219770234047L ^ life8_3))] = p4;
    life17_167 = spill37_17;
    life12_121 = com.moon.nD.a(((int[])(life17_167)), ((double)(((double) (((float) ((life13_40 + (((long) ((int) p0)) * __sourceIntrinsic_96a894c32cfa_invokedynamic37_40(2769, (7872271074378803427L ^ life8_3)))) % life15_128)) / (((float) life15_128) / 0x1.0p1f))))));
    if (!((life10_8 == null))) {
        break forward_join_190;
    }
    }
    forwardValue37_189_0 = p4;
    }
    return forwardValue37_189_0;
    }
    return life12_121;
}


public void a__Void() {
com.moon.hW forwardValue406_118_0;
    float forwardValue406_118_1;
    float forwardValue406_118_2;
    float forwardValue406_118_3;
    float forwardValue406_118_4;
    float forwardValue406_118_5;
    com.moon.aO forwardValue406_118_6;
    int forwardValue406_118_7;
    com.moon.hW forwardValue406_121_0;
    float forwardValue406_121_1;
    float forwardValue406_121_2;
    float forwardValue406_121_3;
    float forwardValue406_121_4;
    float forwardValue406_121_5;
    com.moon.aO forwardValue406_121_6;
    com.moon.hW forwardValue406_122_0;
    float forwardValue406_122_1;
    float forwardValue406_122_2;
    float forwardValue406_122_3;
    float forwardValue406_122_4;
    float forwardValue406_122_5;
    com.moon.aO forwardValue406_122_6;
    float forwardValue406_122_7;
    int forwardValue406_308_0;
    net.minecraft.entity.player.EntityPlayer forwardValue406_369_0;
    int forwardValue406_411_0;
    int forwardValue406_429_0;
    com.moon.hz forwardValue406_431_0;
    java.lang.String spill406_0;
    net.minecraft.entity.player.EntityPlayer spill406_1;
    com.moon.hW spill406_2;
    float spill406_3;
    float spill406_4;
    float spill406_5;
    float spill406_6;
    float spill406_7;
    com.moon.aO spill406_8;
    boolean spill406_9;
    int spill406_10;
    boolean spill406_11;
    com.moon.hz spill406_12;
    boolean spill406_13;
    com.moon.hz spill406_14;
    long life1_3;
    moom.ir life4_7;
    double life5_11;
    double life7_14;
    net.minecraft.entity.player.EntityPlayer life9_17;
    int life10_20;
    float life11_24;
    java.lang.String life3_25;
    float life12_41;
    float life13_57;
    com.moon.jm life14_81;
    com.moon.hW life15_93;
    float life16_138;
    float life17_147;
    float life18_159;
    com.moon.hW life19_227;
    float life20_232;
    float life21_237;
    float life22_239;
    float life23_241;
    float life24_243;
    float life25_245;
    float life26_247;
    float life27_249;
    net.minecraft.entity.player.EntityPlayer life29_302;
    moom.to life28_313;
    com.moon.hW life28_329;
    forward_join_441: {
    forward_join_437: {
    forward_join_431: {
    forward_join_430: {
    forward_join_429: {
    forward_join_411: {
    forward_join_406: {
    forward_join_387: {
    forward_join_384: {
    forward_join_381: {
    forward_join_369: {
    forward_join_363: {
    forward_join_308: {
    forward_join_305: {
    forward_join_122: {
    forward_join_121: {
    forward_join_118: {
    life1_3 = (com.moon.hz.q ^ 131589833251389L);
    ((com.moon.hz)(this)).d__sourceReturn_da8c82d5d4();
    life4_7 = com.moon.nS.a();
    spill406_0 = net.minecraft.command.CommandBase.b();
    life5_11 = ((moom.ir)(life4_7)).a();
    life7_14 = ((moom.ir)(life4_7)).b();
    life9_17 = ((com.moon.hz)(this)).a__tn();
    life10_20 = ((com.moon.hz)(this)).a__sourceReturn_8abf5c6871();
    life11_24 = ((com.moon.nY)(this.f)).c();
    life3_25 = spill406_0;
    life12_41 = (((float) (((double) (((com.moon.hz)(this)).a() + (this.d / 0x1.0p1f))) / life5_11)) * (0x1.0p0f - life11_24));
    life13_57 = (((float) (((double) (((com.moon.hz)(this)).b() + (this.e / 0x1.0p1f))) / life7_14)) * (0x1.0p0f - life11_24));
    com.moon.hU.a(((float)(life11_24)), ((float)(life11_24)), ((float)(0x1.0p0f)));
    com.moon.hU.b(((float)(life12_41)), ((float)(life13_57)), ((float)(0x0.0p0f)));
    com.moon.hU.a(((float)(life11_24)));
    spill406_1 = this.k;
    if (!((life3_25 != null))) {
        forwardValue406_369_0 = spill406_1;
        break forward_join_369;
    }
    if (!((spill406_1 != null))) {
        break forward_join_363;
    }
    moom.kZ.l();
    life14_81 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    this.d = ((float)(((com.moon.hz)(this)).e()));
    this.e = ((float)(0x1.4p5f));
    life15_93 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    spill406_2 = life15_93;
    spill406_3 = ((com.moon.hz)(this)).a();
    spill406_4 = ((com.moon.hz)(this)).b();
    spill406_5 = this.d;
    spill406_6 = this.e;
    spill406_7 = 0x1.0p3f;
    spill406_8 = new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB());
    spill406_9 = ((com.moon.module.impl.Effects)(this.i)).isEnabled();
    if (!((life3_25 != null))) {
        forwardValue406_118_0 = spill406_2;
        forwardValue406_118_1 = spill406_3;
        forwardValue406_118_2 = spill406_4;
        forwardValue406_118_3 = spill406_5;
        forwardValue406_118_4 = spill406_6;
        forwardValue406_118_5 = spill406_7;
        forwardValue406_118_6 = spill406_8;
        forwardValue406_118_7 = ((spill406_9) ? 1 : 0);
        break forward_join_118;
    }
    if (!(spill406_9)) {
        forwardValue406_121_0 = spill406_2;
        forwardValue406_121_1 = spill406_3;
        forwardValue406_121_2 = spill406_4;
        forwardValue406_121_3 = spill406_5;
        forwardValue406_121_4 = spill406_6;
        forwardValue406_121_5 = spill406_7;
        forwardValue406_121_6 = spill406_8;
        break forward_join_121;
    }
    forwardValue406_118_0 = spill406_2;
    forwardValue406_118_1 = spill406_3;
    forwardValue406_118_2 = spill406_4;
    forwardValue406_118_3 = spill406_5;
    forwardValue406_118_4 = spill406_6;
    forwardValue406_118_5 = spill406_7;
    forwardValue406_118_6 = spill406_8;
    forwardValue406_118_7 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Effects)(this.i)).b__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue406_118_7 != 0))) {
        forwardValue406_121_0 = forwardValue406_118_0;
        forwardValue406_121_1 = forwardValue406_118_1;
        forwardValue406_121_2 = forwardValue406_118_2;
        forwardValue406_121_3 = forwardValue406_118_3;
        forwardValue406_121_4 = forwardValue406_118_4;
        forwardValue406_121_5 = forwardValue406_118_5;
        forwardValue406_121_6 = forwardValue406_118_6;
        break forward_join_121;
    }
    forwardValue406_122_0 = forwardValue406_118_0;
    forwardValue406_122_1 = forwardValue406_118_1;
    forwardValue406_122_2 = forwardValue406_118_2;
    forwardValue406_122_3 = forwardValue406_118_3;
    forwardValue406_122_4 = forwardValue406_118_4;
    forwardValue406_122_5 = forwardValue406_118_5;
    forwardValue406_122_6 = forwardValue406_118_6;
    forwardValue406_122_7 = 0x1.19999ap-2f;
    break forward_join_122;
    }
    forwardValue406_122_0 = forwardValue406_121_0;
    forwardValue406_122_1 = forwardValue406_121_1;
    forwardValue406_122_2 = forwardValue406_121_2;
    forwardValue406_122_3 = forwardValue406_121_3;
    forwardValue406_122_4 = forwardValue406_121_4;
    forwardValue406_122_5 = forwardValue406_121_5;
    forwardValue406_122_6 = forwardValue406_121_6;
    forwardValue406_122_7 = 0x1.99999ap-2f;
    }
    ((com.moon.hW)(forwardValue406_122_0)).a(((com.moon.iX)(com.moon.i3.a(((float)(forwardValue406_122_1)), ((float)(forwardValue406_122_2)), ((float)(forwardValue406_122_3)), ((float)(forwardValue406_122_4)), ((float)(forwardValue406_122_5)), ((int)(((com.moon.aO)(((com.moon.aO)(forwardValue406_122_6)).a(((float)(forwardValue406_122_7))))).getRGB()))))));
    life16_138 = 0x1.0p3f;
    life17_147 = (((this.d - 0x1.0p5f) - 0x1.0p3f) - 0x1.0p2f);
    life18_159 = (java.lang.Math.min(((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.player.EntityPlayer)(this.k)).a()))) / ((net.minecraft.entity.player.EntityPlayer)(this.k)).a());
    ((com.moon.nX)(this.g)).a(((float)(life18_159)), ((double)(0x1.333334p-2d)));
    ((com.moon.hW)(life15_93)).a(((com.moon.iX)(com.moon.i3.a(((float)(((((com.moon.hz)(this)).a() + 0x1.0p5f) + 0x1.cp2f))), ((float)(((((((com.moon.hz)(this)).b() + this.e) - 0x1.cp2f) - life16_138) + 0x1.0p0f))), ((float)(life17_147)), ((float)(life16_138)), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic406_62(30783, (3116538738289999600L ^ life1_3))))))));
    ((com.moon.hW)(life15_93)).a(((com.moon.iX)(com.moon.i3.a(((float)(((((com.moon.hz)(this)).a() + 0x1.0p5f) + 0x1.cp2f))), ((float)(((((((com.moon.hz)(this)).b() + this.e) - 0x1.cp2f) - life16_138) + 0x1.0p0f))), ((float)((life17_147 * ((com.moon.nX)(this.g)).b()))), ((float)(life16_138)), ((float)(0x1.8p1f)), ((int)(life10_20))))));
    ((com.moon.hW)(life15_93)).b();
    life19_227 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TEXTURE_ROUND))))).a();
    life20_232 = (((com.moon.hz)(this)).a() + 0x1.4p2f);
    life21_237 = (((com.moon.hz)(this)).b() + 0x1.4p2f);
    life22_239 = 0x1.dp4f;
    life23_241 = 0x1.dp4f;
    life24_243 = 0x1.0p-3f;
    life25_245 = 0x1.0p-2f;
    life26_247 = 0x1.4p-1f;
    life27_249 = 0x1.8p-1f;
    ((com.moon.hW)(life19_227)).a(((com.moon.iX)(com.moon.i6.a(((float)((life20_232 - 0x1.0p0f))), ((float)((life21_237 - 0x1.0p0f))), ((float)(((life20_232 + life22_239) + 0x1.0p1f))), ((float)(((life21_237 + life23_241) + 0x1.0p1f))), ((float)(life24_243)), ((float)(life24_243)), ((float)(life25_245)), ((float)(life25_245)), ((float)(0x1.8p2f)), ((int)(-1))))));
    ((com.moon.hW)(life19_227)).a(((com.moon.iX)(com.moon.i6.a(((float)((life20_232 - 0x1.0p0f))), ((float)((life21_237 - 0x1.0p0f))), ((float)(((life20_232 + life22_239) + 0x1.0p1f))), ((float)(((life21_237 + life23_241) + 0x1.0p1f))), ((float)(life26_247)), ((float)(life24_243)), ((float)(life27_249)), ((float)(life25_245)), ((float)(0x1.8p2f)), ((int)(-1))))));
    life29_302 = this.k;
    spill406_10 = ((life29_302 instanceof moom.to) ? 1 : 0);
    if (!((life3_25 != null))) {
        forwardValue406_308_0 = spill406_10;
        break forward_join_308;
    }
    if (!((spill406_10 != 0))) {
        break forward_join_305;
    }
    life28_313 = ((moom.to)(life29_302));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(com.moon.hz.a)).a__ok())).a__Void(((moom.DD)(((moom.to)(life28_313)).a__DD())));
    }
    ((com.moon.hW)(life19_227)).b();
    forwardValue406_308_0 = 0;
    }
    moom.kZ.i(((int)(forwardValue406_308_0)));
    life28_329 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life14_81))))).a();
    ((com.moon.jm)(life14_81)).b(((com.moon.hW)(life28_329)), ((java.lang.String)(((net.minecraft.entity.player.EntityPlayer)(this.k)).a__String())), ((float)(0x1.4p3f)), ((float)(((((com.moon.hz)(this)).a() + 0x1.0p5f) + 0x1.0p3f))), ((float)((((com.moon.hz)(this)).b() + 0x1.cp2f))), ((int)(-1)));
    ((com.moon.jm)(life14_81)).b(((com.moon.hW)(life28_329)), ((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic406_106(com.moon.nI.a(((double)(((double) ((net.minecraft.entity.player.EntityPlayer)(this.k)).b__sourceReturn_bc607678b6()))), ((int)(1))), com.moon.hz.r))), ((float)(0x1.ap2f)), ((float)(((((com.moon.hz)(this)).a() + 0x1.0p5f) + 0x1.0p3f))), ((float)(((((com.moon.hz)(this)).b() + 0x1.6p2f) + ((com.moon.jm)(life14_81)).a(((float)(0x1.4p3f)))))), ((int)(-1)));
    ((com.moon.hW)(life28_329)).b();
    }
    com.moon.hU.b__Void();
    com.moon.hU.a__Void();
    com.moon.hU.d__Void();
    if (!((life3_25 != null))) {
        break forward_join_384;
    }
    forwardValue406_369_0 = life9_17;
    }
    if (!((forwardValue406_369_0 != null))) {
        break forward_join_381;
    }
    this.j = ((net.minecraft.entity.player.EntityPlayer)(life9_17));
    this.k = ((net.minecraft.entity.player.EntityPlayer)(life9_17));
    this.o = ((boolean)(true));
    if (!((life3_25 == null))) {
        break forward_join_387;
    }
    }
    this.j = ((net.minecraft.entity.player.EntityPlayer)(null));
    }
    this.o = ((boolean)(false));
    }
    spill406_11 = this.o;
    if (!((life3_25 != null))) {
        forwardValue406_411_0 = ((spill406_11) ? 1 : 0);
        break forward_join_411;
    }
    if (!((spill406_11 != this.n))) {
        break forward_join_406;
    }
    ((com.moon.nY)(this.f)).a(((float)(life11_24)));
    this.n = ((boolean)(this.o));
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.i)).a__gW())).c();
    }
    spill406_12 = this;
    if (!((life3_25 != null))) {
        forwardValue406_431_0 = spill406_12;
        break forward_join_431;
    }
    forwardValue406_411_0 = ((((com.moon.module.impl.Effects)(((com.moon.hz)(spill406_12)).i)).isEnabled()) ? 1 : 0);
    }
    if (!((forwardValue406_411_0 != 0))) {
        break forward_join_430;
    }
    spill406_13 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Effects)(this.i)).c__kV())).getValue())))).booleanValue();
    if (!((life3_25 != null))) {
        forwardValue406_429_0 = ((spill406_13) ? 1 : 0);
        break forward_join_429;
    }
    if (!((!spill406_13))) {
        break forward_join_437;
    }
    spill406_14 = this;
    if (!((life3_25 != null))) {
        forwardValue406_431_0 = spill406_14;
        break forward_join_431;
    }
    forwardValue406_429_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Effects)(((com.moon.hz)(spill406_14)).i)).b__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue406_429_0 == 0))) {
        break forward_join_437;
    }
    }
    forwardValue406_431_0 = this;
    }
    ((com.moon.nY)(((com.moon.hz)(forwardValue406_431_0)).f)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.o)));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_441;
    }
    net.minecraft.command.CommandBase.b(((java.lang.String)("OQZ4Bc")));
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
        byte[] spill582_0 = p0;
        life4_9 += 1;
        life5_44 = (spill582_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill582_1 = p0;
        life4_9 += 1;
        life5_76 = (spill582_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill582_2 = p0;
        life4_9 += 1;
        life5_91 = (spill582_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> long __sourceIntrinsic_750352107c0a325a_originalDynamicSite987_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic37_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic37_28(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_96a894c32cfa_invokedynamic37_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic37_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_96a894c32cfa_invokedynamic37_39(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_96a894c32cfa_invokedynamic37_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1553_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic406_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic406_106(double a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1550_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_9bf881b104f5_invokedynamic407_8(int a0, long a1) throws E;
}
