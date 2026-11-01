package com.moon;


public class dF implements java.util.function.Supplier {

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

private static final long e;

public dF() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-743509674872732451L)), ((long)(7382350165835669236L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(128547544094046L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.dF.a ^ 46818231424901L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill64_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill64_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill64_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill64_14 = new byte[8];
    (__sourceSpill64_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill64_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation64_16 = __sourceSpill64_14;
    ((javax.crypto.Cipher)(__sourceSpill64_11)).init(((int)(__sourceSpill64_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill64_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation64_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[2];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "~#{D11\013ÉdßÄ½½Üe<DW|\001m¨*ÆpÿÃÎ\022êZªrzVéå#¤Êégw\022Õ\032Â\022÷Á\036]¢x£v\032Ur\024Dv­`\fm\033\022wS(\005Î\"¡LlM¯0îäom¬m='0¿r±ãâP³îý g·b\005f\nP¾"))).length();
    int local10_life24 = 80;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill64_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill64_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill64_29)).doFinal(((byte[])(__sourceSpill64_28)));
        java.lang.String __sourceSpill64_34 = ((java.lang.String)(com.moon.dF.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill64_35 = local14_life19;
        int __sourceSpill64_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill64_35)[__sourceSpill64_36] = __sourceSpill64_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    b = ((java.lang.String[])(local14_life19));
    c = ((java.lang.String[])(new java.lang.String[2]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill64_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill64_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill64_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill64_46 = new byte[8];
    (__sourceSpill64_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill64_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation64_48 = __sourceSpill64_46;
    ((javax.crypto.Cipher)(__sourceSpill64_43)).init(((int)(__sourceSpill64_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill64_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation64_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = 6292166881185929889L;
    byte[] __sourceSpill64_52 = new byte[8];
    (__sourceSpill64_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill64_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill64_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill64_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill64_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill64_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill64_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill64_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill64_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill64_53)).doFinal(((byte[])(__sourceSpill64_52)));
    e = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}


public java.lang.Object get() {
return this.a();
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1152);
    if (((com.moon.dF.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.dF.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.dF.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/dF", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.dF.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.dF.c)[life5_8] = com.moon.dF.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.dF.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.dF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral903_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/dF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill152_0 = p0;
        life4_9 += 1;
        life5_44 = (spill152_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill152_1 = p0;
        life4_9 += 1;
        life5_76 = (spill152_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill152_2 = p0;
        life4_9 += 1;
        life5_91 = (spill152_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public java.lang.String a() {
long local1_life2 = (com.moon.dF.a ^ 120587281414929L);
    java.lang.String __stackOp17_9_0 = ((java.lang.String)(__sourceIntrinsic_63ef3276e4d3_originalDynamicSite17_4(29983, (6314711949711791460L ^ local1_life2)))).substring(((int)(0)), ((int)(((int) com.moon.dF.e))));
    java.lang.String __stackOp17_9_1 = __sourceIntrinsic_63ef3276e4d3_originalDynamicSite17_8(6263, (4663617929480321037L ^ local1_life2));
    return __sourceIntrinsic_63ef3276e4d3_originalDynamicSite17_10(__stackOp17_9_1, __stackOp17_9_0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral903_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_originalDynamicSite17_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_originalDynamicSite17_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_originalDynamicSite17_10(java.lang.String a0, java.lang.String a1) throws E;
}
