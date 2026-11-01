package com.moon;


public class e1 {

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

private static final long e;

public e1() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(9184037552376217313L)), ((long)(-1094814217259200311L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55345919379001L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.e1.a ^ 131881894303916L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill75_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill75_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill75_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill75_14 = new byte[8];
    (__sourceSpill75_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill75_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation75_16 = __sourceSpill75_14;
    ((javax.crypto.Cipher)(__sourceSpill75_11)).init(((int)(__sourceSpill75_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill75_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation75_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[3];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "(ë)*Ù\026ù\020j÷×rÄrù\020UFÏòløp\005gÒxwÊÇ\020­+\re²f@Ø[\034oßå«Ä"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill75_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill75_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill75_29)).doFinal(((byte[])(__sourceSpill75_28)));
        java.lang.String __sourceSpill75_34 = ((java.lang.String)(com.moon.e1.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill75_35 = local14_life19;
        int __sourceSpill75_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill75_35)[__sourceSpill75_36] = __sourceSpill75_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    b = ((java.lang.String[])(local14_life19));
    c = ((java.lang.String[])(new java.lang.String[3]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill75_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill75_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill75_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill75_46 = new byte[8];
    (__sourceSpill75_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill75_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation75_48 = __sourceSpill75_46;
    ((javax.crypto.Cipher)(__sourceSpill75_43)).init(((int)(__sourceSpill75_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill75_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation75_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = 8045400745860024436L;
    byte[] __sourceSpill75_52 = new byte[8];
    (__sourceSpill75_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill75_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill75_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill75_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill75_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill75_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill75_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill75_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill75_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill75_53)).doFinal(((byte[])(__sourceSpill75_52)));
    e = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral950_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/e1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.e1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6742);
    if (((com.moon.e1.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.e1.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.e1.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/e1", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.e1.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.e1.c)[life5_8] = com.moon.e1.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.e1.c)[life5_8];
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
        byte[] spill178_0 = p0;
        life4_9 += 1;
        life5_44 = (spill178_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill178_1 = p0;
        life4_9 += 1;
        life5_76 = (spill178_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill178_2 = p0;
        life4_9 += 1;
        life5_91 = (spill178_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public static com.moon.a4 a() {
java.lang.String forwardValue57_18_0;
    int forwardValue57_38_0;
    int forwardValue57_50_0;
    com.moon.a4 forwardValue57_59_0;
    java.lang.String[] spill57_0;
    java.lang.String spill57_1;
    boolean spill57_2;
    com.moon.a4 spill57_3;
    long life0_3;
    java.lang.String life3_8;
    java.lang.String[] life2_9;
    java.lang.String life4_23;
    forward_join_59: {
    forward_join_53: {
    forward_join_50: {
    forward_join_43: {
    forward_join_38: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    life0_3 = (com.moon.e1.a ^ 40873075647859L);
    spill57_0 = com.moon.a4.b();
    life3_8 = org.lwjgl.opengl.GL45.glGetString(((int)(((int) com.moon.e1.e))));
    life2_9 = spill57_0;
    spill57_1 = life3_8;
    if (!((life2_9 != null))) {
        forwardValue57_18_0 = spill57_1;
        break forward_join_18;
    }
    if (!((spill57_1 == null))) {
        break forward_join_16;
    }
    return com.moon.a4.FALLBACK;
    }
    forwardValue57_18_0 = ((java.lang.String)(life3_8)).toLowerCase();
    }
    life4_23 = forwardValue57_18_0;
    spill57_2 = ((java.lang.String)(life4_23)).contains(((java.lang.CharSequence)(__sourceIntrinsic_847b3d5d53f0_invokedynamic57_6(20618, (6230353226163954638L ^ life0_3)))));
    if (!((life2_9 != null))) {
        forwardValue57_38_0 = ((spill57_2) ? 1 : 0);
        break forward_join_38;
    }
    if (!(spill57_2)) {
        break forward_join_31;
    }
    return com.moon.a4.NVIDIA;
    }
    forwardValue57_38_0 = ((((java.lang.String)(life4_23)).contains(((java.lang.CharSequence)(__sourceIntrinsic_847b3d5d53f0_invokedynamic57_10(13249, (8863467013765939332L ^ life0_3)))))) ? 1 : 0);
    }
    if (!((life2_9 != null))) {
        forwardValue57_50_0 = forwardValue57_38_0;
        break forward_join_50;
    }
    if (!((forwardValue57_38_0 != 0))) {
        break forward_join_43;
    }
    return com.moon.a4.AMD;
    }
    forwardValue57_50_0 = ((((java.lang.String)(life4_23)).contains(((java.lang.CharSequence)(__sourceIntrinsic_847b3d5d53f0_invokedynamic57_14(22103, (5989218654382499088L ^ life0_3)))))) ? 1 : 0);
    }
    if (!((forwardValue57_50_0 != 0))) {
        break forward_join_53;
    }
    return com.moon.a4.APPLE;
    }
    spill57_3 = com.moon.a4.FALLBACK;
    if (!((life2_9 == null))) {
        forwardValue57_59_0 = spill57_3;
        break forward_join_59;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    forwardValue57_59_0 = spill57_3;
    }
    return forwardValue57_59_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_847b3d5d53f0_invokedynamic57_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_847b3d5d53f0_invokedynamic57_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_847b3d5d53f0_invokedynamic57_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral950_0() throws E;
}
