package com.moon;


public class jl {

private char[] a;

private int b;

private int c;

private boolean d;

private static final long e;

private static final java.lang.String[] f;

private static final java.lang.String[] g;

private static final java.util.Map h;

jl() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-1070180372439850671L)), ((long)(8115414074821209025L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122905151486074L)))));

    h = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.jl.e ^ 39688407251104L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill286_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill286_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill286_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill286_14 = new byte[8];

    (__sourceSpill286_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill286_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation286_16 = __sourceSpill286_14;

    ((javax.crypto.Cipher)(__sourceSpill286_11)).init(((int)(__sourceSpill286_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill286_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation286_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[4];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "Y9u~Oç{ô;\037V\001n\b¸w]É\032Ùb~'KP\020<Ðsª¨TÈR0£Ù¯ ³ÙQ\006µ^ðºÜj\001ìH<þñ5tð\034æY\0331\000ô\006n¢V\177ÑÇB\r\024ÞÑµ"))).length();

    int local5_life24 = 40;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill286_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill286_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill286_29)).doFinal(((byte[])(__sourceSpill286_28)));

        java.lang.String __sourceSpill286_34 = ((java.lang.String)(com.moon.jl.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill286_35 = local9_life19;

        int __sourceSpill286_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill286_35)[__sourceSpill286_36] = __sourceSpill286_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "$ôÒ'¶\177DS¡5È;; Ë%E¤j¡õý²­¤Â&S;xç¬¸c\0368\004&A\177\020½¶Ev0\024ø\037\021á0çÐrÖq]x¯E*c»l^ÄÉ{íI\\¬C\004ùT\030\fn\023Z×}cÒè¼¶5[Oª:Ã:B"))).length();

    local5_life24 = 88;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill286_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill286_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill286_43)).doFinal(((byte[])(__sourceSpill286_42)));

        java.lang.String __sourceSpill286_48 = ((java.lang.String)(com.moon.jl.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill286_49 = local9_life19;

        int __sourceSpill286_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill286_49)[__sourceSpill286_50] = __sourceSpill286_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    f = ((java.lang.String[])(local9_life19));

    g = ((java.lang.String[])(new java.lang.String[4]));
}


public java.lang.String toString() {
long local1 = (com.moon.jl.e ^ 36785554131233L);
    java.lang.String __sourceSpill581_6 = java.util.Arrays.toString(((char[])(this.a)));
    int __sourceSpill581_7 = this.b;
    int __sourceSpill581_8 = this.c;
    boolean local3 = this.d;
    int local4 = __sourceSpill581_8;
    int local5 = __sourceSpill581_7;
    java.lang.String local6 = __sourceSpill581_6;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_13(__sourceIntrinsic_a86c261fcdee_originalDynamicSite581_9(15416, (2070324995968078930L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_10(26384, (5965000048235302779L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_11(26290, (6247982634936848090L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_12(32497, (4124799828004361880L ^ local1)), local3, ")");
}


public com.moon.jl b(int p0) {
this.c = ((int)(p0));
    return this;
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
        byte[] spill823_0 = p0;
        life4_9 += 1;
        life5_44 = (spill823_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill823_1 = p0;
        life4_9 += 1;
        life5_76 = (spill823_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill823_2 = p0;
        life4_9 += 1;
        life5_91 = (spill823_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24313);
    if (((com.moon.jl.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jl.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jl.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jl", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jl.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jl.g)[life5_8] = com.moon.jl.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jl.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jl.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1976_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jl"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.jl a(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}


public com.moon.jk a() {
return new com.moon.jk(this.a, this.b, this.c, this.d);
}


public com.moon.jl a(int p0) {
this.b = ((int)(p0));
    return this;
}


public com.moon.jl a(char[] p0) {
this.a = ((char[])(p0));
    return this;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1976_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite581_13(java.lang.String a0, java.lang.String a1, java.lang.String a2, int a3, java.lang.String a4, int a5, java.lang.String a6, boolean a7, java.lang.String a8) throws E;
}
