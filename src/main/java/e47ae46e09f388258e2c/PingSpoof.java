package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class PingSpoof extends com.moon.module.Module {

private com.moon.setting.IntegerSetting s;

public com.moon.setting.MultiSelectSetting<com.moon.bp> t;

private java.util.function.Predicate<moom.yK<?>> u;

private java.util.LinkedList<moom.DN<moom.yK<?>, java.lang.Long>> v;

private static long w;

private static java.lang.String[] x;

private static java.lang.String[] y;

private static java.util.Map z;

private static long[] A;

private static java.lang.Integer[] B;

private static java.util.Map C;

public PingSpoof(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_7a699e8e7346d889(com.moon.module.impl.PingSpoof receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.PingSpoof.w ^ 113726735705725L);

    com.moon.module.impl.PingSpoof.__sourceConstructorInit_7a699e8e7346d889_0(((com.moon.module.impl.PingSpoof)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.PingSpoof)(receiver)).s = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_2(30083, (731962644401500096L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_4(6719, (3717285046672801918L ^ local5)))), ((int)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_5(17194, (7080833152442842684L ^ local5)))), ((int)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_6(13794, (6913151153084582135L ^ local5)))), ((int)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_7(5537, (937301088705767605L ^ local5)))), ((int)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_8(8532, (2595516894353742915L ^ local5))))))).a()));

    ((com.moon.module.impl.PingSpoof)(receiver)).t = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_12(26960, (1908448749592458002L ^ local5)))), ((java.lang.Class)(com.moon.bp.class))))).a(((java.lang.String)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_15(13095, (2562934789935556967L ^ local5)))), ((java.lang.Enum[])(new com.moon.bp[] {com.moon.bp.KEEPALIVE, com.moon.bp.TRANSACTION, com.moon.bp.VELOCITY, com.moon.bp.TELEPORT}))))).a()));

    ((com.moon.module.impl.PingSpoof)(receiver)).u = ((java.util.function.Predicate)(__sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_23(receiver)));

    ((com.moon.module.impl.PingSpoof)(receiver)).v = ((java.util.LinkedList)(new java.util.LinkedList()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_7a699e8e7346d889_0(com.moon.module.impl.PingSpoof a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
w = ((long)(((moom._a)(moom._c.a(((long)(7558642435681658463L)), ((long)(-3869859673614133699L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(224650581212305L)))));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.PingSpoof.w ^ 20835527249201L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill282_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill282_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill282_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill282_14 = new byte[8];
    (__sourceSpill282_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill282_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation282_16 = __sourceSpill282_14;
    ((javax.crypto.Cipher)(__sourceSpill282_11)).init(((int)(__sourceSpill282_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill282_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation282_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[4];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "·2Û©b\022¥×o½Ú?!Í \016éyl²¤¨3í1euLsþ=Ê\024`u·®1ð´m"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill282_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill282_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill282_29)).doFinal(((byte[])(__sourceSpill282_28)));
        java.lang.String __sourceSpill282_34 = ((java.lang.String)(com.moon.module.impl.PingSpoof.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill282_35 = local20_life19;
        int __sourceSpill282_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill282_35)[__sourceSpill282_36] = __sourceSpill282_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "MRØÁeh\r0\006´5~\nÅ ZÌ\034ÆµÍ²Rbl\021Y¨¡õÝ|\024ÔeM\003ò±£zb"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill282_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill282_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill282_42)).doFinal(((byte[])(__sourceSpill282_41)));
        java.lang.String __sourceSpill282_47 = ((java.lang.String)(com.moon.module.impl.PingSpoof.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill282_48 = local20_life19;
        int __sourceSpill282_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill282_48)[__sourceSpill282_49] = __sourceSpill282_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    x = ((java.lang.String[])(local20_life19));
    y = ((java.lang.String[])(new java.lang.String[4]));
    C = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill282_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill282_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill282_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill282_60 = new byte[8];
    (__sourceSpill282_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill282_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation282_62 = __sourceSpill282_60;
    ((javax.crypto.Cipher)(__sourceSpill282_57)).init(((int)(__sourceSpill282_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill282_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation282_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[4];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "&ÄT²b<Y|5ÅC×µ\013q"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill282_71 = local4_life67;
        int __sourceSpill282_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill282_71)).substring(((int)(__sourceSpill282_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill282_76 = local6_life65;
        int __sourceSpill282_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill282_79 = new byte[8];
        (__sourceSpill282_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill282_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill282_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill282_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill282_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill282_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill282_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill282_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill282_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill282_80)).doFinal(((byte[])(__sourceSpill282_79)));
        (__sourceSpill282_76)[__sourceSpill282_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ôÿ\022þt\036\006¿¨¤l\032ØgxÜ"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill282_84 = local4_life67;
        int __sourceSpill282_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill282_84)).substring(((int)(__sourceSpill282_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill282_89 = local6_life65;
        int __sourceSpill282_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill282_92 = new byte[8];
        (__sourceSpill282_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill282_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill282_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill282_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill282_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill282_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill282_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill282_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill282_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill282_93)).doFinal(((byte[])(__sourceSpill282_92)));
        (__sourceSpill282_89)[__sourceSpill282_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    A = ((long[])(local6_life65));
    B = ((java.lang.Integer[])(new java.lang.Integer[4]));
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
        byte[] spill1167_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1167_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1167_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1167_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1167_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1167_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24996);
    if (((com.moon.module.impl.PingSpoof.y)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.PingSpoof.z)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.PingSpoof.z)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lk", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.PingSpoof.x)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.PingSpoof.y)[life5_8] = com.moon.module.impl.PingSpoof.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.PingSpoof.y)[life5_8];
}


public void onEnable() {
((com.moon.module.impl.PingSpoof)(this)).a(((long)(0L)));
    return;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.PingSpoof.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2587_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.PingSpoof.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 18163;
      if (B[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


public void onDisable() {
((com.moon.module.impl.PingSpoof)(this)).a(((long)(0L)));
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2588_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.eQ p0) {
com.moon.module.impl.PingSpoof forwardValue895_19_0;
    com.moon.module.impl.PingSpoof spill895_0;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_11: {
    life2_3 = (com.moon.module.impl.PingSpoof.w ^ 3012865369569L);
    life4_5 = com.moon.bk.c();
    if (!((((com.moon.eQ)(p0)).a() != com.moon.a1.PRE))) {
        break forward_join_11;
    }
    return;
    }
    spill895_0 = this;
    if (!((life4_5 != 0))) {
        forwardValue895_19_0 = spill895_0;
        break forward_join_19;
    }
    if (!(((java.util.LinkedList)(((com.moon.module.impl.PingSpoof)(spill895_0)).v)).isEmpty())) {
        break forward_join_18;
    }
    return;
    }
    forwardValue895_19_0 = this;
    }
    ((com.moon.module.impl.PingSpoof)(forwardValue895_19_0)).a(((long)(((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.s)).getValue())))).intValue()))));
    return;
}


public void a(com.moon.event.PacketEvent p0) {
com.moon.event.PacketEvent forwardValue896_13_0;
    com.moon.event.PacketEvent spill896_0;
    long life2_3;
    int life4_5;
    moom.yK life5_19;
    long life6_29;
    moom.DN life8_36;
    forward_join_21: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.PingSpoof.w ^ 133264487381751L);
    life4_5 = com.moon.bk.b();
    spill896_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue896_13_0 = spill896_0;
        break forward_join_13;
    }
    if (!(((com.moon.event.PacketEvent)(spill896_0)).b__sourceReturn_aae029aa0a())) {
        break forward_join_12;
    }
    return;
    }
    forwardValue896_13_0 = p0;
    }
    life5_19 = ((com.moon.event.PacketEvent)(forwardValue896_13_0)).getPacket();
    if (!((!((java.util.function.Predicate)(this.u)).test(((java.lang.Object)(life5_19)))))) {
        break forward_join_21;
    }
    return;
    }
    life6_29 = java.lang.System.currentTimeMillis();
    life8_36 = new moom.DN(life5_19, java.lang.Long.valueOf(((long)(life6_29))));
    ((java.util.LinkedList)(this.v)).add(((java.lang.Object)(life8_36)));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a(long p0) {
java.lang.Object lexicalValue239_43_0;
    int spill239_0;
    net.minecraft.client.network.NetHandlerPlayClient spill239_1;
    long life3_3;
    long life6_6;
    int life5_7;
    moom.DN life8_13;
    moom.yK life9_18;
    long life10_23;
    lexical_join_46: {
    life3_3 = (com.moon.module.impl.PingSpoof.w ^ 7519296301782L);
    spill239_0 = com.moon.bk.c();
    life6_6 = java.lang.System.currentTimeMillis();
    life5_7 = spill239_0;
    lexical_cycle_8: while (true) {
    lexical_join_43: {
    lexical_join_40: {
    lexical_join_32: {
    if (!(((life8_13 = ((moom.DN)(((java.util.LinkedList)(this.v)).peek()))) != null))) {
        break lexical_join_46;
    }
    life9_18 = ((moom.yK)(((moom.DN)(life8_13)).a()));
    life10_23 = ((java.lang.Long)(((java.lang.Long)(((moom.DN)(life8_13)).b())))).longValue();
    if (!((recovery.source.CarrierOps.lcmp(((long)((life6_6 - life10_23))), ((long)(p0))) < 0))) {
        break lexical_join_32;
    }
    if (!((life5_7 == 0))) {
        break lexical_join_46;
    }
    }
    spill239_1 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.PingSpoof.d)).a__jS();
    if (!((life5_7 != 0))) {
        lexicalValue239_43_0 = spill239_1;
        break lexical_join_43;
    }
    if (!((spill239_1 != null))) {
        break lexical_join_40;
    }
    ((net.minecraft.client.Minecraft)(com.moon.module.impl.PingSpoof.d)).a(((moom.yK)(life9_18)));
    }
    lexicalValue239_43_0 = ((java.util.LinkedList)(this.v)).poll();
    }
    recovery.source.CarrierOps.discard(lexicalValue239_43_0);
    if (!((life5_7 == 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    return;
}


private boolean lambda$new$0(moom.yK p0) {
int forwardValue897_20_0;
    int forwardValue897_32_0;
    int forwardValue897_44_0;
    int forwardValue897_49_0;
    int forwardValue897_61_0;
    int forwardValue897_153_0;
    int forwardValue897_158_0;
    int forwardValue897_170_0;
    int forwardValue897_217_0;
    int forwardValue897_222_0;
    int forwardValue897_259_0;
    int forwardValue897_263_0;
    int forwardValue897_265_0;
    int spill897_0;
    boolean spill897_1;
    boolean spill897_2;
    int spill897_3;
    boolean spill897_4;
    int spill897_5;
    int spill897_6;
    int spill897_7;
    int spill897_8;
    int spill897_9;
    int spill897_10;
    int spill897_11;
    int spill897_12;
    int spill897_13;
    int spill897_14;
    int spill897_15;
    int spill897_16;
    int spill897_17;
    int spill897_18;
    int spill897_19;
    int spill897_20;
    int spill897_21;
    boolean spill897_22;
    int spill897_23;
    int spill897_24;
    int spill897_25;
    int spill897_26;
    int spill897_27;
    int spill897_28;
    int spill897_29;
    int spill897_30;
    int spill897_31;
    int spill897_32;
    int spill897_33;
    int spill897_34;
    int spill897_35;
    int spill897_36;
    long life2_3;
    int life4_5;
    forward_join_265: {
    forward_join_264: {
    forward_join_263: {
    forward_join_262: {
    forward_join_259: {
    forward_join_255: {
    forward_join_222: {
    forward_join_220: {
    forward_join_217: {
    forward_join_213: {
    forward_join_170: {
    forward_join_168: {
    forward_join_158: {
    forward_join_156: {
    forward_join_153: {
    forward_join_149: {
    forward_join_61: {
    forward_join_59: {
    forward_join_49: {
    forward_join_47: {
    forward_join_44: {
    forward_join_40: {
    forward_join_32: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life2_3 = (com.moon.module.impl.PingSpoof.w ^ 63147468894759L);
    life4_5 = com.moon.bk.c();
    spill897_0 = ((p0 instanceof moom.zt) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_20_0 = spill897_0;
        break forward_join_20;
    }
    if (!((spill897_0 != 0))) {
        break forward_join_18;
    }
    spill897_1 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.KEEPALIVE)));
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = ((spill897_1) ? 1 : 0);
        break forward_join_263;
    }
    if (!((!spill897_1))) {
        break forward_join_262;
    }
    }
    forwardValue897_20_0 = ((p0 instanceof moom.Aj) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_32_0 = forwardValue897_20_0;
        break forward_join_32;
    }
    if (!((forwardValue897_20_0 != 0))) {
        break forward_join_30;
    }
    spill897_2 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.TRANSACTION)));
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = ((spill897_2) ? 1 : 0);
        break forward_join_263;
    }
    if (!((!spill897_2))) {
        break forward_join_262;
    }
    }
    forwardValue897_32_0 = ((p0 instanceof moom.zL) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_44_0 = forwardValue897_32_0;
        break forward_join_44;
    }
    if (!((forwardValue897_32_0 == 0))) {
        break forward_join_40;
    }
    spill897_3 = ((p0 instanceof moom.z9) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_49_0 = spill897_3;
        break forward_join_49;
    }
    if (!((spill897_3 != 0))) {
        break forward_join_47;
    }
    }
    forwardValue897_44_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.VELOCITY)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = forwardValue897_44_0;
        break forward_join_263;
    }
    if (!((forwardValue897_44_0 == 0))) {
        break forward_join_262;
    }
    }
    forwardValue897_49_0 = ((p0 instanceof moom.zB) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_61_0 = forwardValue897_49_0;
        break forward_join_61;
    }
    if (!((forwardValue897_49_0 != 0))) {
        break forward_join_59;
    }
    spill897_4 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.TELEPORT)));
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = ((spill897_4) ? 1 : 0);
        break forward_join_263;
    }
    if (!((!spill897_4))) {
        break forward_join_262;
    }
    }
    forwardValue897_61_0 = ((p0 instanceof moom.zR) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = forwardValue897_61_0;
        break forward_join_153;
    }
    if (!((forwardValue897_61_0 == 0))) {
        break forward_join_149;
    }
    spill897_5 = ((p0 instanceof moom.zN) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_5;
        break forward_join_153;
    }
    if (!((spill897_5 == 0))) {
        break forward_join_149;
    }
    spill897_6 = ((p0 instanceof moom.zS) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_6;
        break forward_join_153;
    }
    if (!((spill897_6 == 0))) {
        break forward_join_149;
    }
    spill897_7 = ((p0 instanceof moom.zF) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_7;
        break forward_join_153;
    }
    if (!((spill897_7 == 0))) {
        break forward_join_149;
    }
    spill897_8 = ((p0 instanceof moom.zH) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_8;
        break forward_join_153;
    }
    if (!((spill897_8 == 0))) {
        break forward_join_149;
    }
    spill897_9 = ((p0 instanceof moom.zI) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_9;
        break forward_join_153;
    }
    if (!((spill897_9 == 0))) {
        break forward_join_149;
    }
    spill897_10 = ((p0 instanceof moom.zJ) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_10;
        break forward_join_153;
    }
    if (!((spill897_10 == 0))) {
        break forward_join_149;
    }
    spill897_11 = ((p0 instanceof moom.zK) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_11;
        break forward_join_153;
    }
    if (!((spill897_11 == 0))) {
        break forward_join_149;
    }
    spill897_12 = ((p0 instanceof moom.zM) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_12;
        break forward_join_153;
    }
    if (!((spill897_12 == 0))) {
        break forward_join_149;
    }
    spill897_13 = ((p0 instanceof moom.zU) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_13;
        break forward_join_153;
    }
    if (!((spill897_13 == 0))) {
        break forward_join_149;
    }
    spill897_14 = ((p0 instanceof moom.zV) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_14;
        break forward_join_153;
    }
    if (!((spill897_14 == 0))) {
        break forward_join_149;
    }
    spill897_15 = ((p0 instanceof moom.zW) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_15;
        break forward_join_153;
    }
    if (!((spill897_15 == 0))) {
        break forward_join_149;
    }
    spill897_16 = ((p0 instanceof moom.zX) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_16;
        break forward_join_153;
    }
    if (!((spill897_16 == 0))) {
        break forward_join_149;
    }
    spill897_17 = ((p0 instanceof moom.zY) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_17;
        break forward_join_153;
    }
    if (!((spill897_17 == 0))) {
        break forward_join_149;
    }
    spill897_18 = ((p0 instanceof moom.zZ) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_18;
        break forward_join_153;
    }
    if (!((spill897_18 == 0))) {
        break forward_join_149;
    }
    spill897_19 = ((p0 instanceof moom.Ad) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_19;
        break forward_join_153;
    }
    if (!((spill897_19 == 0))) {
        break forward_join_149;
    }
    spill897_20 = ((p0 instanceof moom.Am) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_153_0 = spill897_20;
        break forward_join_153;
    }
    if (!((spill897_20 == 0))) {
        break forward_join_149;
    }
    spill897_21 = ((p0 instanceof moom.AK) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_158_0 = spill897_21;
        break forward_join_158;
    }
    if (!((spill897_21 != 0))) {
        break forward_join_156;
    }
    }
    forwardValue897_153_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.ENTITIES)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = forwardValue897_153_0;
        break forward_join_263;
    }
    if (!((forwardValue897_153_0 == 0))) {
        break forward_join_262;
    }
    }
    forwardValue897_158_0 = ((p0 instanceof moom.zT) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_170_0 = forwardValue897_158_0;
        break forward_join_170;
    }
    if (!((forwardValue897_158_0 != 0))) {
        break forward_join_168;
    }
    spill897_22 = ((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.ENTITIES_STATUS)));
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = ((spill897_22) ? 1 : 0);
        break forward_join_263;
    }
    if (!((!spill897_22))) {
        break forward_join_262;
    }
    }
    forwardValue897_170_0 = ((p0 instanceof moom.z1) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = forwardValue897_170_0;
        break forward_join_217;
    }
    if (!((forwardValue897_170_0 == 0))) {
        break forward_join_213;
    }
    spill897_23 = ((p0 instanceof moom.z3) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = spill897_23;
        break forward_join_217;
    }
    if (!((spill897_23 == 0))) {
        break forward_join_213;
    }
    spill897_24 = ((p0 instanceof moom.z5) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = spill897_24;
        break forward_join_217;
    }
    if (!((spill897_24 == 0))) {
        break forward_join_213;
    }
    spill897_25 = ((p0 instanceof moom.z6) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = spill897_25;
        break forward_join_217;
    }
    if (!((spill897_25 == 0))) {
        break forward_join_213;
    }
    spill897_26 = ((p0 instanceof moom.z7) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = spill897_26;
        break forward_join_217;
    }
    if (!((spill897_26 == 0))) {
        break forward_join_213;
    }
    spill897_27 = ((p0 instanceof moom.z8) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = spill897_27;
        break forward_join_217;
    }
    if (!((spill897_27 == 0))) {
        break forward_join_213;
    }
    spill897_28 = ((p0 instanceof moom.Ak) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = spill897_28;
        break forward_join_217;
    }
    if (!((spill897_28 == 0))) {
        break forward_join_213;
    }
    spill897_29 = ((p0 instanceof moom.An) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_217_0 = spill897_29;
        break forward_join_217;
    }
    if (!((spill897_29 == 0))) {
        break forward_join_213;
    }
    spill897_30 = ((p0 instanceof moom.AE) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_222_0 = spill897_30;
        break forward_join_222;
    }
    if (!((spill897_30 != 0))) {
        break forward_join_220;
    }
    }
    forwardValue897_217_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.CHUNK)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = forwardValue897_217_0;
        break forward_join_263;
    }
    if (!((forwardValue897_217_0 == 0))) {
        break forward_join_262;
    }
    }
    forwardValue897_222_0 = ((p0 instanceof moom.Ac) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_259_0 = forwardValue897_222_0;
        break forward_join_259;
    }
    if (!((forwardValue897_222_0 == 0))) {
        break forward_join_255;
    }
    spill897_31 = ((p0 instanceof moom.Ae) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_259_0 = spill897_31;
        break forward_join_259;
    }
    if (!((spill897_31 == 0))) {
        break forward_join_255;
    }
    spill897_32 = ((p0 instanceof moom.Af) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_259_0 = spill897_32;
        break forward_join_259;
    }
    if (!((spill897_32 == 0))) {
        break forward_join_255;
    }
    spill897_33 = ((p0 instanceof moom.Ag) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_259_0 = spill897_33;
        break forward_join_259;
    }
    if (!((spill897_33 == 0))) {
        break forward_join_255;
    }
    spill897_34 = ((p0 instanceof moom.Ah) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_259_0 = spill897_34;
        break forward_join_259;
    }
    if (!((spill897_34 == 0))) {
        break forward_join_255;
    }
    spill897_35 = ((p0 instanceof moom.Ai) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_259_0 = spill897_35;
        break forward_join_259;
    }
    if (!((spill897_35 == 0))) {
        break forward_join_255;
    }
    spill897_36 = ((p0 instanceof moom.As) ? 1 : 0);
    if (!((life4_5 != 0))) {
        forwardValue897_259_0 = spill897_36;
        break forward_join_259;
    }
    if (!((spill897_36 != 0))) {
        break forward_join_264;
    }
    }
    forwardValue897_259_0 = ((((com.moon.setting.MultiSelectSetting)(this.t)).isSelected(((java.lang.Enum)(com.moon.bp.GAME_STATE)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue897_263_0 = forwardValue897_259_0;
        break forward_join_263;
    }
    if (!((forwardValue897_259_0 != 0))) {
        break forward_join_264;
    }
    }
    forwardValue897_263_0 = 1;
    }
    forwardValue897_265_0 = forwardValue897_263_0;
    break forward_join_265;
    }
    forwardValue897_265_0 = 0;
    }
    return ((forwardValue897_265_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_7a699e8e7346d889_originalDynamicSite1276_23(com.moon.module.impl.PingSpoof a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2587_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2588_0() throws E;
}
