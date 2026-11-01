package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Tickbase extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.bq> s;

private com.moon.setting.IntegerSetting t;

private com.moon.setting.IntegerSetting u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

public Tickbase(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_fbe6de233bff71dd(com.moon.module.impl.Tickbase receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Tickbase.v ^ 127192731289290L);

    com.moon.module.impl.Tickbase.__sourceConstructorInit_fbe6de233bff71dd_0(((com.moon.module.impl.Tickbase)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Tickbase)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_2(17873, (8438222799541704848L ^ local5)))), ((java.lang.Class)(com.moon.bq.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_5(5337, (7382311812951034270L ^ local5)))), ((java.lang.Enum)(com.moon.bq.NORMAL))))).a()));

    ((com.moon.module.impl.Tickbase)(receiver)).t = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_10(1227, (4371349853513472395L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_12(5126, (3790018534292572483L ^ local5)))), ((int)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_13(7857, (1425949424099735558L ^ local5)))), ((int)(1)), ((int)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_14(1890, (2074357744410468818L ^ local5)))), ((int)(1))))).a()));

    ((com.moon.module.impl.Tickbase)(receiver)).u = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_18(19002, (7791138969947969406L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_20(22, (192002906374233424L ^ local5)))), ((int)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_21(4252, (7081788731949889064L ^ local5)))), ((int)(0)), ((int)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_22(15034, (8410263406288182287L ^ local5)))), ((int)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_23(9182, (3878987901458449768L ^ local5))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_25(receiver)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_fbe6de233bff71dd_0(com.moon.module.impl.Tickbase a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
v = ((long)(((moom._a)(moom._c.a(((long)(5367994898187280395L)), ((long)(-1126327845849712984L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(209409279302940L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Tickbase.v ^ 8802681088431L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill293_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill293_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill293_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill293_14 = new byte[8];
    (__sourceSpill293_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill293_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation293_16 = __sourceSpill293_14;
    ((javax.crypto.Cipher)(__sourceSpill293_11)).init(((int)(__sourceSpill293_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill293_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation293_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[6];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\000xòÒ|õ\017X¾\016³|[\"ó:P\020^Ñ5kÙÕ©\020\032\030kÅ\024¥Y/ôö«\033=Ó\021õ8N\013uNÑw;\0209\005\002åà\035``àÃ¸¬5\"È\020\036\024\003\016aV\022ã²24¦{[ò"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill293_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill293_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill293_29)).doFinal(((byte[])(__sourceSpill293_28)));
        java.lang.String __sourceSpill293_34 = ((java.lang.String)(com.moon.module.impl.Tickbase.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill293_35 = local20_life19;
        int __sourceSpill293_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill293_35)[__sourceSpill293_36] = __sourceSpill293_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "%Õ[:0U\177Û\n\021ó\005Ñ1u Â\025ZÕ¦Þ\017\006ü\t\031fù_¥Ñ·Ö=µlðk'\033\035Z¥±u"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill293_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill293_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill293_42)).doFinal(((byte[])(__sourceSpill293_41)));
        java.lang.String __sourceSpill293_47 = ((java.lang.String)(com.moon.module.impl.Tickbase.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill293_48 = local20_life19;
        int __sourceSpill293_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill293_48)[__sourceSpill293_49] = __sourceSpill293_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    w = ((java.lang.String[])(local20_life19));
    x = ((java.lang.String[])(new java.lang.String[6]));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill293_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill293_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill293_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill293_60 = new byte[8];
    (__sourceSpill293_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill293_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation293_62 = __sourceSpill293_60;
    ((javax.crypto.Cipher)(__sourceSpill293_57)).init(((int)(__sourceSpill293_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill293_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation293_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[5];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "Q\017{cK(È\\AÈ÷\031Æv´FQà\036òÌ\t"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill293_71 = local4_life67;
        int __sourceSpill293_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill293_71)).substring(((int)(__sourceSpill293_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill293_76 = local6_life65;
        int __sourceSpill293_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill293_79 = new byte[8];
        (__sourceSpill293_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill293_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill293_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill293_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill293_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill293_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill293_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill293_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill293_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill293_80)).doFinal(((byte[])(__sourceSpill293_79)));
        (__sourceSpill293_76)[__sourceSpill293_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "T\013u¢§ü®à\n@µ»9¤;Û"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill293_84 = local4_life67;
        int __sourceSpill293_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill293_84)).substring(((int)(__sourceSpill293_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill293_89 = local6_life65;
        int __sourceSpill293_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill293_92 = new byte[8];
        (__sourceSpill293_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill293_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill293_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill293_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill293_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill293_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill293_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill293_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill293_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill293_93)).doFinal(((byte[])(__sourceSpill293_92)));
        (__sourceSpill293_89)[__sourceSpill293_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    z = ((long[])(local6_life65));
    A = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public com.moon.setting.IntegerSetting b() {
return this.u;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30859);
    if (((com.moon.module.impl.Tickbase.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Tickbase.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Tickbase.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ll", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Tickbase.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Tickbase.x)[life5_8] = com.moon.module.impl.Tickbase.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Tickbase.x)[life5_8];
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
        byte[] spill1246_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1246_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1246_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1246_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1246_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1246_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Tickbase.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2729_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ll"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 890;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ll", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Tickbase.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2730_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ll"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.EnumSetting<com.moon.bq> a__k2() {
return this.s;
}


public void a(com.moon.event.TickEvent p0) {
((com.moon.module.impl.Tickbase)(this)).setSuffix(((java.lang.String)(((com.moon.bq)(((com.moon.bq)(((com.moon.setting.EnumSetting)(this.s)).getValue())))).a__String())));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.IntegerSetting a() {
return this.t;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.Tickbase.v ^ 39007538632871L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bq.NORMAL) ? 1 : 0)))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_fbe6de233bff71dd_originalDynamicSite1310_25(com.moon.module.impl.Tickbase a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2729_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2730_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
