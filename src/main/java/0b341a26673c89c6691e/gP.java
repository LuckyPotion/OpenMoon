package com.moon;


public class gP {

private java.util.function.Supplier<java.lang.String> a;

private java.lang.String b;

private float c;

private static int[] d;

private static final long e;

private static final java.lang.String[] f;

private static final java.lang.String[] g;

private static final java.util.Map h;

gP() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-4431143423722279079L)), ((long)(-1784351668961720424L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(89519139825239L)))));
    java.lang.Object __sourceSpill110_6 = null;
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.gP.e ^ 113596926418871L);
    com.moon.gP.b(((int[])(__sourceSpill110_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill110_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill110_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill110_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill110_16 = new byte[8];
    (__sourceSpill110_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill110_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation110_18 = __sourceSpill110_16;
    ((javax.crypto.Cipher)(__sourceSpill110_13)).init(((int)(__sourceSpill110_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill110_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation110_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "\023Ð\033»¸¸~Ày\t!1þ©ä½42®\n¸`\nk§@tFa¸1^\004i\033¥|NÏ5BFÃÒE\000$çõYÿ^ê\002ÂÃBÑ ÛûÆlðIußÀ¡åN±ñ±Õê®.Ò|nàKåoaÏp\001#É@s\031Õ³ä¯%×³¢põ}HÉ\020\bl\035u¨ßöÃÎê\004Y¥÷"))).length();
    int local5_life26 = 24;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill110_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill110_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill110_31)).doFinal(((byte[])(__sourceSpill110_30)));
        java.lang.String __sourceSpill110_36 = ((java.lang.String)(com.moon.gP.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill110_37 = local9_life21;
        int __sourceSpill110_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill110_37)[__sourceSpill110_38] = __sourceSpill110_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    f = ((java.lang.String[])(local9_life21));
    g = ((java.lang.String[])(new java.lang.String[3]));
}


public java.lang.String toString() {
long local1 = (com.moon.gP.e ^ 72004413954808L);
    java.util.function.Supplier __sourceSpill375_4 = this.a;
    java.lang.String __sourceSpill375_5 = this.b;
    float local3 = this.c;
    java.lang.String local4 = __sourceSpill375_5;
    java.util.function.Supplier local5 = __sourceSpill375_4;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite375_9(__sourceIntrinsic_a86c261fcdee_originalDynamicSite375_6(12649, (2518320952493120997L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite375_7(26779, (3913686307644687380L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite375_8(6856, (1346309028217140805L ^ local1)), local3, ")");
}


public static void b(int[] p0) {
com.moon.gP.d = ((int[])(p0));
    return;
}


public static int[] b() {
return com.moon.gP.d;
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
        byte[] spill397_0 = p0;
        life4_9 += 1;
        life5_44 = (spill397_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill397_1 = p0;
        life4_9 += 1;
        life5_76 = (spill397_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill397_2 = p0;
        life4_9 += 1;
        life5_91 = (spill397_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8815);
    if (((com.moon.gP.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.gP.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.gP.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/gP", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.gP.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.gP.g)[life5_8] = com.moon.gP.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.gP.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.gP.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1243_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.gO a() {
return new com.moon.gO(this.a, this.b, this.c);
}


public com.moon.gP a(float p0) {
this.c = ((float)(p0));
    return this;
}


public com.moon.gP a(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public com.moon.gP a(java.util.function.Supplier<java.lang.String> p0) {
this.a = ((java.util.function.Supplier)(p0));
    return this;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1243_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite375_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite375_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite375_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite375_9(java.lang.String a0, java.util.function.Supplier a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, float a5, java.lang.String a6) throws E;
}
