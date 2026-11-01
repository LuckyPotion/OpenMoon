package com.moon.module.impl;


public class Step extends com.moon.module.Module {

public com.moon.setting.EnumSetting<com.moon.bz> s;

private static long t;

private static java.lang.String[] u;

private static java.lang.String[] v;

private static java.util.Map w;

public Step(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_d56932dc7e6432c0(com.moon.module.impl.Step receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Step.t ^ 52134360516076L);

    com.moon.module.impl.Step.__sourceConstructorInit_d56932dc7e6432c0_0(((com.moon.module.impl.Step)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Step)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_d56932dc7e6432c0_originalDynamicSite1298_2(2862, (3408381090361627776L ^ local5)))), ((java.lang.Class)(com.moon.bz.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_d56932dc7e6432c0_originalDynamicSite1298_5(6184, (7805644657996842887L ^ local5)))), ((java.lang.Enum)(com.moon.bz.WATCHDOG))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_d56932dc7e6432c0_0(com.moon.module.impl.Step a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
t = ((long)(((moom._a)(moom._c.a(((long)(-3085786484030689753L)), ((long)(7540693039086395664L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(152187976766630L)))));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.module.impl.Step.t ^ 15283849036868L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill289_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill289_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill289_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill289_14 = new byte[8];
    (__sourceSpill289_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill289_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation289_16 = __sourceSpill289_14;
    ((javax.crypto.Cipher)(__sourceSpill289_11)).init(((int)(__sourceSpill289_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill289_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation289_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "u¿ÂF©¼Noæ?óµ>\020\0210ñoóDR) ^\003å\b\027f"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill289_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill289_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill289_29)).doFinal(((byte[])(__sourceSpill289_28)));
        java.lang.String __sourceSpill289_34 = ((java.lang.String)(com.moon.module.impl.Step.c(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill289_35 = local9_life19;
        int __sourceSpill289_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill289_35)[__sourceSpill289_36] = __sourceSpill289_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    u = ((java.lang.String[])(local9_life19));
    v = ((java.lang.String[])(new java.lang.String[2]));
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Step.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2687_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11306);
    if (((com.moon.module.impl.Step.v)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Step.w)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Step.w)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lv", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Step.u)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Step.v)[life5_8] = com.moon.module.impl.Step.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Step.v)[life5_8];
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
        byte[] spill1221_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1221_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1221_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1221_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1221_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1221_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d56932dc7e6432c0_originalDynamicSite1298_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d56932dc7e6432c0_originalDynamicSite1298_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2687_0() throws E;
}
