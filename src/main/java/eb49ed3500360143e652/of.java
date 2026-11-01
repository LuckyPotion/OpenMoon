package com.moon;


public class of {

private java.lang.String a;

private java.lang.String b;

private java.util.function.Consumer<java.lang.String> c;

private java.util.function.Consumer<java.lang.Void> d;

private java.util.function.Consumer<java.lang.Runnable> e;

private static final long f;

private static final java.lang.String[] g;

private static final java.lang.String[] h;

private static final java.util.Map i;

of() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(6576585119515796964L)), ((long)(2540734171234698980L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(11341701484897L)))));

    i = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.of.f ^ 121704808286495L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill437_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill437_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill437_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill437_14 = new byte[8];

    (__sourceSpill437_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill437_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation437_16 = __sourceSpill437_14;

    ((javax.crypto.Cipher)(__sourceSpill437_11)).init(((int)(__sourceSpill437_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill437_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation437_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[5];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "\nQK\017n\021\rÒmU\013Ïb¿ðæ\034Lý`ú\034C Õè#+gÆLÍ ,J\020nj$\001VÛ\"³\034´2ëðO3Nh[ëÐÕöôzÕ]ÓòÔ\nbØï3ôqîãåE\177Ì\"fµ÷2ßãW\027\0302\nËÍ©¡Rè^ðþ/r8­ðYÌ¬¼®OÄ\032\026zHgÔy£¨*¤Ã_Ñ)\f°Ü[ê7\034©~qmï"))).length();

    int local5_life24 = 32;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill437_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill437_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill437_29)).doFinal(((byte[])(__sourceSpill437_28)));

        java.lang.String __sourceSpill437_34 = ((java.lang.String)(com.moon.of.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill437_35 = local9_life19;

        int __sourceSpill437_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill437_35)[__sourceSpill437_36] = __sourceSpill437_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = " ÷m²s×ôÔú÷\000\017ÞÜ[\034kÑ~ÅÚ÷Ñ2\031ù(Èê_b©XdÃÿöÁ_§\027äTàì\024.4îá©QM»¿£ýÙ13"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill437_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill437_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill437_43)).doFinal(((byte[])(__sourceSpill437_42)));

        java.lang.String __sourceSpill437_48 = ((java.lang.String)(com.moon.of.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill437_49 = local9_life19;

        int __sourceSpill437_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill437_49)[__sourceSpill437_50] = __sourceSpill437_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    g = ((java.lang.String[])(local9_life19));

    h = ((java.lang.String[])(new java.lang.String[5]));
}


public java.lang.String toString() {
long local1 = (com.moon.of.f ^ 74831910855060L);
    java.lang.String __sourceSpill930_6 = this.a;
    java.lang.String __sourceSpill930_7 = this.b;
    java.util.function.Consumer __sourceSpill930_8 = this.c;
    java.util.function.Consumer __sourceSpill930_9 = this.d;
    java.util.function.Consumer local3 = this.e;
    java.util.function.Consumer local4 = __sourceSpill930_9;
    java.util.function.Consumer local5 = __sourceSpill930_8;
    java.lang.String local6 = __sourceSpill930_7;
    java.lang.String local7 = __sourceSpill930_6;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_15(__sourceIntrinsic_a86c261fcdee_originalDynamicSite930_10(15457, (2665520165289195725L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_11(4475, (945931956448646613L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_12(4953, (8455191498847279094L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_13(12725, (1614529959372682527L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_14(32291, (694062344797797006L ^ local1)), local3, ")");
}


public com.moon.of b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


public com.moon.of b(java.util.function.Consumer<java.lang.Void> p0) {
this.d = ((java.util.function.Consumer)(p0));
    return this;
}


public com.moon.of c(java.util.function.Consumer<java.lang.Runnable> p0) {
this.e = ((java.util.function.Consumer)(p0));
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
        byte[] spill1455_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1455_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1455_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1455_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1455_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1455_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3082_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/of"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.of.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26078);
    if (((com.moon.of.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.of.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.of.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/of", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.of.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.of.h)[life5_8] = com.moon.of.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.of.h)[life5_8];
}


public com.moon.oe a() {
return new com.moon.oe(this.a, this.b, this.c, this.d, this.e);
}


public com.moon.of a(java.util.function.Consumer<java.lang.String> p0) {
this.c = ((java.util.function.Consumer)(p0));
    return this;
}


public com.moon.of a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3082_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite930_15(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.util.function.Consumer a5, java.lang.String a6, java.util.function.Consumer a7, java.lang.String a8, java.util.function.Consumer a9, java.lang.String a10) throws E;
}
