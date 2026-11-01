package com.moon.module.impl;


public class AntiBot extends com.moon.module.Module {

public com.moon.setting.MultiSelectSetting<com.moon.a7> s;

public com.moon.setting.ModeSetting<com.moon.a6> t;

private static long u;

private java.util.Map<java.lang.Integer, com.moon.fY> v;

private java.util.Map<java.util.UUID, java.lang.Integer> w;

private com.moon.nW x;

private static long y;

private static java.lang.String[] z;

private static java.lang.String[] A;

private static java.util.Map B;

private static long[] C;

private static java.lang.Long[] D;

private static java.util.Map E;

public AntiBot(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_7171b8268768ad11(com.moon.module.impl.AntiBot receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.AntiBot.y ^ 64393910174414L);

    com.moon.module.impl.AntiBot.__sourceConstructorInit_7171b8268768ad11_0(((com.moon.module.impl.AntiBot)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.AntiBot)(receiver)).s = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_2(24629, (2106977050908906035L ^ local5)))), ((java.lang.Class)(com.moon.a7.class))))).a(((java.lang.String)(__sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_5(17414, (6559340810482611715L ^ local5)))), ((java.lang.Enum[])(new com.moon.a7[] {com.moon.a7.SOUND, com.moon.a7.TICKS_EXISTED}))))).a()));

    ((com.moon.module.impl.AntiBot)(receiver)).t = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_11(4100, (5107016740718387715L ^ local5)))), ((java.lang.Class)(com.moon.a6.class))))).a(((java.lang.String)(__sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_14(27050, (950190152499813290L ^ local5)))), ((java.lang.Enum)(com.moon.a6.NORMAL))))).a(((java.util.function.Supplier)(__sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_17(receiver)))))).a()));

    ((com.moon.module.impl.AntiBot)(receiver)).v = ((java.util.Map)(new java.util.HashMap()));

    ((com.moon.module.impl.AntiBot)(receiver)).w = ((java.util.Map)(new java.util.HashMap()));

    ((com.moon.module.impl.AntiBot)(receiver)).x = ((com.moon.nW)(new com.moon.nW()));

    return;

}



static {
y = ((long)(((moom._a)(moom._c.a(((long)(2082352644383476928L)), ((long)(5579507909477645960L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134349324255294L)))));
    long local20_life6 = (com.moon.module.impl.AntiBot.y ^ 93993007731879L);
    B = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill256_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill256_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill256_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill256_14 = new byte[8];
    (__sourceSpill256_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill256_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation256_16 = __sourceSpill256_14;
    ((javax.crypto.Cipher)(__sourceSpill256_11)).init(((int)(__sourceSpill256_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill256_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation256_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[5];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "\002\024-ýA\027«î.,EVø³\030\013ÌQM\fÌÔâ,mq#ó¤ÍXíS\005­ \023HvµôÀ¬UÆÉ\034õ\f\037Äéá\037w\034-Â©§Mô"))).length();
    int local14_life24 = 16;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill256_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill256_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill256_29)).doFinal(((byte[])(__sourceSpill256_28)));
        java.lang.String __sourceSpill256_34 = ((java.lang.String)(com.moon.module.impl.AntiBot.c(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill256_35 = local18_life19;
        int __sourceSpill256_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill256_35)[__sourceSpill256_36] = __sourceSpill256_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "ê¤~\017ÞôúyuB!µ\033÷\033:ÏU¢\0176¾`Ý\026K\036´\027\0308ZYoÂ[\016Í\002O»¸©Ã¤2-dc²\034¿!"))).length();
    local14_life24 = 32;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill256_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill256_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill256_42)).doFinal(((byte[])(__sourceSpill256_41)));
        java.lang.String __sourceSpill256_47 = ((java.lang.String)(com.moon.module.impl.AntiBot.c(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill256_48 = local18_life19;
        int __sourceSpill256_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill256_48)[__sourceSpill256_49] = __sourceSpill256_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    z = ((java.lang.String[])(local18_life19));
    A = ((java.lang.String[])(new java.lang.String[5]));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill256_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill256_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill256_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill256_60 = new byte[8];
    (__sourceSpill256_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill256_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation256_62 = __sourceSpill256_60;
    ((javax.crypto.Cipher)(__sourceSpill256_57)).init(((int)(__sourceSpill256_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill256_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation256_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "õÄ\tÒI2Ê3 æ|\034´<\032"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill256_71 = local4_life67;
        int __sourceSpill256_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill256_71)).substring(((int)(__sourceSpill256_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill256_76 = local6_life65;
        int __sourceSpill256_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill256_79 = new byte[8];
        (__sourceSpill256_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill256_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill256_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill256_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill256_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill256_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill256_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill256_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill256_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill256_80)).doFinal(((byte[])(__sourceSpill256_79)));
        (__sourceSpill256_76)[__sourceSpill256_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    C = ((long[])(local6_life65));
    D = ((java.lang.Long[])(new java.lang.Long[2]));
    u = ((long)(((java.util.concurrent.TimeUnit)(java.util.concurrent.TimeUnit.SECONDS)).toMillis(((long)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite256_86(30580, (1017389696264797901L ^ local20_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_7171b8268768ad11_0(com.moon.module.impl.AntiBot a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22204);
    if (((com.moon.module.impl.AntiBot.A)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.AntiBot.B)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.AntiBot.B)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k8", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.AntiBot.z)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.AntiBot.A)[life5_8] = com.moon.module.impl.AntiBot.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.AntiBot.A)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.AntiBot.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill1018_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1018_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1018_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1018_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1018_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1018_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2325_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2326_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.module.impl.AntiBot.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long d(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31592);
    if (((com.moon.module.impl.AntiBot.D)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.module.impl.AntiBot.C)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.AntiBot.E)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.AntiBot.E)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/k8", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.module.impl.AntiBot.D)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.module.impl.AntiBot.D)[life3_8])).longValue();
}


public void onDisable() {
((java.util.Map)(this.v)).clear();
    ((java.util.Map)(this.w)).clear();
    return;
}


private com.moon.fY a(java.util.UUID p0) {
int forwardValue777_21_0;
    boolean spill777_0;
    long life2_3;
    int life4_5;
    int life5_26;
    forward_join_21: {
    forward_join_15: {
    life2_3 = (com.moon.module.impl.AntiBot.y ^ 35283904450302L);
    life4_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill777_0 = ((java.util.Map)(this.w)).containsKey(((java.lang.Object)(p0)));
    if (!((life4_5 == 0))) {
        forwardValue777_21_0 = ((spill777_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill777_0))) {
        break forward_join_15;
    }
    return null;
    }
    forwardValue777_21_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(this.w)).get(((java.lang.Object)(p0))))))).intValue();
    }
    life5_26 = forwardValue777_21_0;
    return ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(null)), ((int)(life5_26)));
}


private com.moon.fY a(java.util.UUID p0, int p1) {
return ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(p0)), ((int)(p1)), ((boolean)(true)));
}


private com.moon.fY a(java.util.UUID p0, int p1, boolean p2) {
int forwardValue779_17_0;
    java.util.Map forwardValue779_27_0;
    java.lang.Integer forwardValue779_27_1;
    boolean spill779_0;
    java.util.Map spill779_1;
    java.lang.Integer spill779_2;
    long life4_3;
    int life6_5;
    forward_join_27: {
    forward_join_23: {
    forward_join_17: {
    life4_3 = (com.moon.module.impl.AntiBot.y ^ 21432671833717L);
    life6_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill779_0 = p2;
    if (!((life6_5 == 0))) {
        forwardValue779_17_0 = ((spill779_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill779_0)) {
        break forward_join_23;
    }
    spill779_1 = this.v;
    spill779_2 = java.lang.Integer.valueOf(((int)(p1)));
    if (!((life6_5 == 0))) {
        forwardValue779_27_0 = spill779_1;
        forwardValue779_27_1 = spill779_2;
        break forward_join_27;
    }
    forwardValue779_17_0 = ((((java.util.Map)(spill779_1)).containsKey(((java.lang.Object)(spill779_2)))) ? 1 : 0);
    }
    if (!((forwardValue779_17_0 == 0))) {
        break forward_join_23;
    }
    ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(p0)), ((int)(p1)), ((double)(0x1.9p6d)));
    }
    forwardValue779_27_0 = this.v;
    forwardValue779_27_1 = java.lang.Integer.valueOf(((int)(p1)));
    }
    return ((com.moon.fY)(((java.util.Map)(forwardValue779_27_0)).get(((java.lang.Object)(forwardValue779_27_1)))));
}


private void a(java.util.UUID p0, int p1, double p2) {
java.lang.Object forwardValue778_32_0;
    boolean spill778_0;
    java.util.UUID spill778_1;
    long life5_3;
    long life8_6;
    int life7_7;
    com.moon.fY life10_14;
    forward_join_33: {
    forward_join_32: {
    life5_3 = (com.moon.module.impl.AntiBot.y ^ 133217611147071L);
    spill778_0 = com.moon.bg.c();
    life8_6 = java.lang.System.currentTimeMillis();
    life7_7 = ((spill778_0) ? 1 : 0);
    life10_14 = new com.moon.fY(life8_6, p1, p2);
    ((java.util.Map)(this.v)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))), ((java.lang.Object)(life10_14)));
    spill778_1 = p0;
    if (!((life7_7 != 0))) {
        forwardValue778_32_0 = spill778_1;
        break forward_join_32;
    }
    if (!((spill778_1 != null))) {
        break forward_join_33;
    }
    forwardValue778_32_0 = ((java.util.Map)(this.w)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p1))))));
    }
    recovery.source.CarrierOps.discard(forwardValue778_32_0);
    }
    return;
}


public boolean a(int p0) {
int forwardValue773_36_0;
    int forwardValue773_38_0;
    int forwardValue773_51_0;
    com.moon.module.impl.AntiBot forwardValue773_64_0;
    int forwardValue773_67_0;
    int forwardValue773_89_0;
    int forwardValue773_91_0;
    int forwardValue773_96_0;
    int forwardValue773_110_0;
    int forwardValue773_124_0;
    int forwardValue773_139_0;
    int forwardValue773_150_0;
    boolean spill773_0;
    boolean spill773_1;
    int spill773_2;
    int spill773_3;
    com.moon.module.impl.AntiBot spill773_4;
    int spill773_5;
    int spill773_6;
    boolean spill773_7;
    int spill773_8;
    int spill773_9;
    boolean spill773_10;
    long life2_3;
    com.moon.fY life5_10;
    int life4_11;
    long life6_22;
    int life8_49;
    net.minecraft.entity.Entity life8_107;
    net.minecraft.entity.EntityLivingBase life9_118;
    forward_join_150: {
    forward_join_149: {
    forward_join_139: {
    forward_join_135: {
    forward_join_124: {
    forward_join_120: {
    forward_join_110: {
    forward_join_106: {
    forward_join_96: {
    forward_join_92: {
    forward_join_91: {
    forward_join_90: {
    forward_join_89: {
    forward_join_67: {
    forward_join_64: {
    forward_join_63: {
    forward_join_51: {
    forward_join_50: {
    forward_join_38: {
    forward_join_37: {
    forward_join_36: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.AntiBot.y ^ 134881401035213L);
    spill773_0 = com.moon.bg.b();
    life5_10 = ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(null)), ((int)(p0)), ((boolean)(false)));
    life4_11 = ((spill773_0) ? 1 : 0);
    if (!((life5_10 == null))) {
        break forward_join_16;
    }
    return ((0) != 0);
    }
    life6_22 = (java.lang.System.currentTimeMillis() - ((com.moon.fY)(life5_10)).a__Long());
    spill773_1 = ((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.a7.PING)));
    if (!((life4_11 == 0))) {
        forwardValue773_67_0 = ((spill773_1) ? 1 : 0);
        break forward_join_67;
    }
    if (!(spill773_1)) {
        break forward_join_63;
    }
    spill773_2 = recovery.source.CarrierOps.lcmp(((long)(((com.moon.fY)(life5_10)).b__Long())), ((long)(0L)));
    if (!((life4_11 == 0))) {
        forwardValue773_36_0 = spill773_2;
        break forward_join_36;
    }
    if (!((spill773_2 != 0))) {
        break forward_join_37;
    }
    forwardValue773_36_0 = 1;
    }
    forwardValue773_38_0 = forwardValue773_36_0;
    break forward_join_38;
    }
    forwardValue773_38_0 = 0;
    }
    life8_49 = forwardValue773_38_0;
    spill773_3 = life8_49;
    if (!((life4_11 == 0))) {
        forwardValue773_51_0 = spill773_3;
        break forward_join_51;
    }
    if (!((spill773_3 == 0))) {
        break forward_join_50;
    }
    if (!((((com.moon.setting.ModeSetting)(this.t)).getValue() == com.moon.a6.NORMAL))) {
        break forward_join_50;
    }
    return ((1) != 0);
    }
    forwardValue773_51_0 = life8_49;
    }
    if (!((life4_11 == 0))) {
        forwardValue773_67_0 = forwardValue773_51_0;
        break forward_join_67;
    }
    if (!((forwardValue773_51_0 != 0))) {
        break forward_join_63;
    }
    spill773_4 = this;
    if (!((life4_11 == 0))) {
        forwardValue773_64_0 = spill773_4;
        break forward_join_64;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.AntiBot)(spill773_4)).t)).getValue() == com.moon.a6.INVERTED))) {
        break forward_join_63;
    }
    return ((1) != 0);
    }
    forwardValue773_64_0 = this;
    }
    forwardValue773_67_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.AntiBot)(forwardValue773_64_0)).s)).isSelected(((java.lang.Enum)(com.moon.a7.ARMOR)))) ? 1 : 0);
    }
    if (!((life4_11 == 0))) {
        forwardValue773_96_0 = forwardValue773_67_0;
        break forward_join_96;
    }
    if (!((forwardValue773_67_0 != 0))) {
        break forward_join_92;
    }
    life8_107 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiBot.d)).I)).a(((int)(p0)));
    spill773_5 = ((life8_107 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    if (!((life4_11 == 0))) {
        forwardValue773_96_0 = spill773_5;
        break forward_join_96;
    }
    if (!((spill773_5 != 0))) {
        break forward_join_92;
    }
    life9_118 = ((net.minecraft.entity.EntityLivingBase)(life8_107));
    spill773_6 = ((net.minecraft.entity.EntityLivingBase)(life9_118)).d__Int();
    if (!((life4_11 == 0))) {
        forwardValue773_89_0 = spill773_6;
        break forward_join_89;
    }
    if (!((spill773_6 == 0))) {
        break forward_join_90;
    }
    forwardValue773_89_0 = 1;
    }
    forwardValue773_91_0 = forwardValue773_89_0;
    break forward_join_91;
    }
    forwardValue773_91_0 = 0;
    }
    return ((forwardValue773_91_0) != 0);
    }
    forwardValue773_96_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.a7.SOUND)))) ? 1 : 0);
    }
    if (!((life4_11 == 0))) {
        forwardValue773_110_0 = forwardValue773_96_0;
        break forward_join_110;
    }
    if (!((forwardValue773_96_0 != 0))) {
        break forward_join_106;
    }
    spill773_7 = ((com.moon.fY)(life5_10)).a__Boolean();
    if (!((life4_11 == 0))) {
        forwardValue773_110_0 = ((spill773_7) ? 1 : 0);
        break forward_join_110;
    }
    if (!((!spill773_7))) {
        break forward_join_106;
    }
    return ((1) != 0);
    }
    forwardValue773_110_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.a7.SWING)))) ? 1 : 0);
    }
    if (!((life4_11 == 0))) {
        forwardValue773_124_0 = forwardValue773_110_0;
        break forward_join_124;
    }
    if (!((forwardValue773_110_0 != 0))) {
        break forward_join_120;
    }
    spill773_8 = ((com.moon.fY)(life5_10)).b();
    if (!((life4_11 == 0))) {
        forwardValue773_124_0 = spill773_8;
        break forward_join_124;
    }
    if (!((spill773_8 == 0))) {
        break forward_join_120;
    }
    return ((1) != 0);
    }
    forwardValue773_124_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.a7.TICKS_EXISTED)))) ? 1 : 0);
    }
    if (!((life4_11 == 0))) {
        forwardValue773_139_0 = forwardValue773_124_0;
        break forward_join_139;
    }
    if (!((forwardValue773_124_0 != 0))) {
        break forward_join_135;
    }
    spill773_9 = recovery.source.CarrierOps.lcmp(((long)(life6_22)), ((long)(com.moon.module.impl.AntiBot.u)));
    if (!((life4_11 == 0))) {
        forwardValue773_139_0 = spill773_9;
        break forward_join_139;
    }
    if (!((spill773_9 < 0))) {
        break forward_join_135;
    }
    return ((1) != 0);
    }
    forwardValue773_139_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.a7.MOVEMENT)))) ? 1 : 0);
    }
    if (!((life4_11 == 0))) {
        forwardValue773_150_0 = forwardValue773_139_0;
        break forward_join_150;
    }
    if (!((forwardValue773_139_0 != 0))) {
        break forward_join_149;
    }
    spill773_10 = ((com.moon.fY)(life5_10)).b__Boolean();
    if (!((life4_11 == 0))) {
        forwardValue773_150_0 = ((spill773_10) ? 1 : 0);
        break forward_join_150;
    }
    if (!((!spill773_10))) {
        break forward_join_149;
    }
    return ((1) != 0);
    }
    forwardValue773_150_0 = 0;
    }
    return ((forwardValue773_150_0) != 0);
}


public void a(com.moon.event.PacketEvent p0) {
com.moon.event.PacketEvent forestValue186_13_0;
    int forestValue186_49_0;
    int forestValue186_69_0;
    int forestValue186_118_0;
    int forestValue186_146_0;
    moom.yK forestValue186_148_0;
    com.moon.event.PacketEvent spill186_0;
    int spill186_1;
    int spill186_2;
    moom.yK spill186_3;
    long life2_3;
    int life4_5;
    moom.yK life9_15;
    moom.zF life5_24;
    double life9_37;
    moom.zE life6_57;
    com.moon.fY life9_63;
    moom.Aa life7_78;
    java.lang.String life9_81;
    java.util.Iterator life10_95;
    net.minecraft.entity.player.EntityPlayer life11_102;
    com.moon.fY life12_109;
    double life13_136;
    moom.zO life8_158;
    com.moon.fY life9_164;
    forest_join_158: {
    forest_join_148: {
    forest_join_146: {
    forest_join_139: {
    forest_join_138: {
    forest_join_87: {
    forest_join_69: {
    forest_join_64: {
    forest_join_49: {
    forest_join_44: {
    forest_join_13: {
    forest_join_12: {
    life2_3 = (com.moon.module.impl.AntiBot.y ^ 128134210652984L);
    life4_5 = ((com.moon.bg.b()) ? 1 : 0);
    spill186_0 = p0;
    if (!((life4_5 == 0))) {
        forestValue186_13_0 = spill186_0;
        break forest_join_13;
    }
    if (!(((com.moon.event.PacketEvent)(spill186_0)).b__sourceReturn_aae029aa0a())) {
        break forest_join_12;
    }
    return;
    }
    forestValue186_13_0 = p0;
    }
    life9_15 = ((com.moon.event.PacketEvent)(forestValue186_13_0)).getPacket();
    spill186_1 = ((life9_15 instanceof moom.zF) ? 1 : 0);
    if (!((life4_5 == 0))) {
        forestValue186_49_0 = spill186_1;
        break forest_join_49;
    }
    if (!((spill186_1 != 0))) {
        break forest_join_44;
    }
    life5_24 = ((moom.zF)(life9_15));
    life9_37 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiBot.d)).K)).b(((double)(((double) ((moom.zF)(life5_24)).b__Int()))), ((double)(((double) ((moom.zF)(life5_24)).c()))), ((double)(((double) ((moom.zF)(life5_24)).d()))));
    ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(((moom.zF)(life5_24)).a__UUID())), ((int)(((moom.zF)(life5_24)).a__Int())), ((double)(life9_37)));
    break forest_join_158;
    }
    life9_15 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    forestValue186_49_0 = ((life9_15 instanceof moom.zE) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue186_69_0 = forestValue186_49_0;
        break forest_join_69;
    }
    if (!((forestValue186_49_0 != 0))) {
        break forest_join_64;
    }
    life6_57 = ((moom.zE)(life9_15));
    life9_63 = ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(null)), ((int)(((moom.zE)(life6_57)).a())));
    ((com.moon.fY)(life9_63)).a__Void();
    break forest_join_158;
    }
    life9_15 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    forestValue186_69_0 = ((life9_15 instanceof moom.Aa) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue186_146_0 = forestValue186_69_0;
        break forest_join_146;
    }
    if (!((forestValue186_69_0 != 0))) {
        break forest_join_139;
    }
    life7_78 = ((moom.Aa)(life9_15));
    life9_81 = ((moom.Aa)(life7_78)).a__String();
    if (!((!((java.lang.String)(life9_81)).startsWith(((java.lang.String)(__sourceIntrinsic_0d28a2dd2629_invokedynamic186_26(17490, (7710843824384098208L ^ life2_3)))))))) {
        break forest_join_87;
    }
    return;
    }
    life10_95 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiBot.d)).I)).i)).iterator();
    forest_cycle_92: while (true) {
    forest_join_136: {
    forest_join_121: {
    forest_join_118: {
    if (!(((java.util.Iterator)(life10_95)).hasNext())) {
        break forest_join_138;
    }
    life11_102 = ((net.minecraft.entity.player.EntityPlayer)(((java.util.Iterator)(life10_95)).next()));
    life12_109 = ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(((net.minecraft.entity.player.EntityPlayer)(life11_102)).a__UUID())), ((int)(((net.minecraft.entity.player.EntityPlayer)(life11_102)).e__Int())));
    if (!((life4_5 == 0))) {
        break forest_join_158;
    }
    spill186_2 = ((net.minecraft.entity.player.EntityPlayer)(life11_102)).e__Int();
    if (!((life4_5 == 0))) {
        forestValue186_118_0 = spill186_2;
        break forest_join_118;
    }
    if (!((spill186_2 != ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiBot.d)).K)).e__Int()))) {
        continue forest_cycle_92;
    }
    forestValue186_118_0 = ((((com.moon.fY)(life12_109)).a__Boolean()) ? 1 : 0);
    }
    if (!((forestValue186_118_0 != 0))) {
        break forest_join_121;
    }
    if (!((life4_5 != 0))) {
        continue forest_cycle_92;
    }
    }
    life13_136 = ((net.minecraft.entity.player.EntityPlayer)(life11_102)).b(((double)(((moom.Aa)(life7_78)).a())), ((double)(((moom.Aa)(life7_78)).b())), ((double)(((moom.Aa)(life7_78)).c())));
    if (!((recovery.source.CarrierOps.dcmpg(((double)(life13_136)), ((double)(0x1.0p0d))) <= 0))) {
        break forest_join_136;
    }
    ((com.moon.fY)(life12_109)).b__Void();
    }
    if (!((life4_5 != 0))) {
        continue forest_cycle_92;
    }
    break forest_cycle_92;
    }
    }
    break forest_join_158;
    }
    life9_15 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    spill186_3 = life9_15;
    if (!((life4_5 == 0))) {
        forestValue186_148_0 = spill186_3;
        break forest_join_148;
    }
    forestValue186_146_0 = ((spill186_3 instanceof moom.zO) ? 1 : 0);
    }
    if (!((forestValue186_146_0 != 0))) {
        break forest_join_158;
    }
    forestValue186_148_0 = life9_15;
    }
    life8_158 = ((moom.zO)(forestValue186_148_0));
    life9_164 = ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(null)), ((int)(((moom.zO)(life8_158)).a__Int())));
    ((com.moon.fY)(life9_164)).c();
    }
    return;
}


public void a(com.moon.ey p0) {
com.moon.fY forwardValue776_18_0;
    boolean spill776_0;
    com.moon.fY spill776_1;
    long life2_3;
    com.moon.fY life5_10;
    int life4_11;
    forward_join_18: {
    forward_join_17: {
    life2_3 = (com.moon.module.impl.AntiBot.y ^ 16080373903127L);
    spill776_0 = com.moon.bg.b();
    life5_10 = ((com.moon.module.impl.AntiBot)(this)).a(((java.util.UUID)(((com.mojang.authlib.GameProfile)(((com.moon.ey)(p0)).a__GameProfile())).getId())));
    life4_11 = ((spill776_0) ? 1 : 0);
    spill776_1 = life5_10;
    if (!((life4_11 == 0))) {
        forwardValue776_18_0 = spill776_1;
        break forward_join_18;
    }
    if (!((spill776_1 == null))) {
        break forward_join_17;
    }
    return;
    }
    forwardValue776_18_0 = life5_10;
    }
    ((com.moon.fY)(forwardValue776_18_0)).a(((long)(((com.moon.ey)(p0)).a())));
    return;
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.Minecraft forwardValue775_16_0;
    net.minecraft.client.Minecraft spill775_0;
    long life2_3;
    int life4_5;
    forward_join_29: {
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.AntiBot.y ^ 28806559160513L);
    life4_5 = ((com.moon.bg.c()) ? 1 : 0);
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forward_join_18;
    }
    spill775_0 = com.moon.module.impl.AntiBot.d;
    if (!((life4_5 != 0))) {
        forwardValue775_16_0 = spill775_0;
        break forward_join_16;
    }
    if (!((((net.minecraft.client.Minecraft)(spill775_0)).K != null))) {
        break forward_join_18;
    }
    forwardValue775_16_0 = com.moon.module.impl.AntiBot.d;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue775_16_0)).I == null))) {
        break forward_join_19;
    }
    }
    return;
    }
    if (!((!((com.moon.nW)(this.x)).b(((long)(__sourceIntrinsic_be06bc302d53_invokedynamic775_10(16468, (2713060458952574346L ^ life2_3)))))))) {
        break forward_join_29;
    }
    return;
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private java.lang.Boolean lambda$new$0() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.a7.PING))))));
}


private static native <E extends Throwable> long __sourceIntrinsic_eb8803ad1f63_originalDynamicSite256_86(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_7171b8268768ad11_originalDynamicSite1211_17(com.moon.module.impl.AntiBot a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d28a2dd2629_invokedynamic186_26(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_be06bc302d53_invokedynamic775_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2325_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2326_0() throws E;
}
