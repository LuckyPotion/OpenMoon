package com.moon;


public class mS {

private java.lang.String a;

private java.lang.String b;

private java.util.function.Supplier<java.lang.Float> c;

private java.util.function.Supplier<java.lang.Float> d;

private com.moon.mT e;

private com.moon.pj f;

private java.util.List<com.moon.mV> g;

private static final long h;

private static final java.lang.String[] i;

private static final java.lang.String[] j;

private static final java.util.Map k;

mS() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(5497716237967117893L)), ((long)(-6893254915178574335L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(154090811437450L)))));

    k = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.mS.h ^ 51897705986912L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill335_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill335_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill335_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill335_14 = new byte[8];

    (__sourceSpill335_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill335_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation335_16 = __sourceSpill335_14;

    ((javax.crypto.Cipher)(__sourceSpill335_11)).init(((int)(__sourceSpill335_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill335_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation335_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[7];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "î»dÊ\032z\0237.ßJÌ½àc\003çò\020Jã{s\f\033¡\fôûÛÔ(6£?åN\021nÕg[òIv\032ñ0é£G\004Ü\037Q»\017¼¾ÉYcÖ\0023¯­?\020\023ÂsHilÑà$#¹n\t­\006 ®wS§\\r»~¼=ËHÿZZÜ74ÉQzE\016æ\013Y¦\033"))).length();

    int local5_life24 = 24;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill335_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill335_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill335_29)).doFinal(((byte[])(__sourceSpill335_28)));

        java.lang.String __sourceSpill335_34 = ((java.lang.String)(com.moon.mS.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill335_35 = local9_life19;

        int __sourceSpill335_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill335_35)[__sourceSpill335_36] = __sourceSpill335_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "Æ\030\020%(ÿ%^¯ÉGëB°Y4Ç\025ZûM¶ë/[D\n\035<µ/¿\027'|¢Ñ¶®ï\013(*Ðb§\020ae\036[àMeZíl\002\024bëÏ_ÎçKëßÈæÄ\030è@ú\tìÎn&\r?ÑôC \035uñÚ[§ÔâB¿ÁázXEi¥-ZÛ\001§\033|#ÿ"))).length();

    local5_life24 = 96;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill335_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill335_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill335_43)).doFinal(((byte[])(__sourceSpill335_42)));

        java.lang.String __sourceSpill335_48 = ((java.lang.String)(com.moon.mS.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill335_49 = local9_life19;

        int __sourceSpill335_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill335_49)[__sourceSpill335_50] = __sourceSpill335_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    i = ((java.lang.String[])(local9_life19));

    j = ((java.lang.String[])(new java.lang.String[7]));
}


public java.lang.String toString() {
long local1 = (com.moon.mS.h ^ 38085584751004L);
    java.lang.String __sourceSpill697_8 = this.a;
    java.lang.String __sourceSpill697_9 = this.b;
    java.util.function.Supplier __sourceSpill697_10 = this.c;
    java.util.function.Supplier __sourceSpill697_11 = this.d;
    com.moon.mT __sourceSpill697_12 = this.e;
    com.moon.pj __sourceSpill697_13 = this.f;
    java.util.List local3 = this.g;
    com.moon.pj local4 = __sourceSpill697_13;
    com.moon.mT local5 = __sourceSpill697_12;
    java.util.function.Supplier local6 = __sourceSpill697_11;
    java.util.function.Supplier local7 = __sourceSpill697_10;
    java.lang.String local8 = __sourceSpill697_9;
    java.lang.String local9 = __sourceSpill697_8;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_21(__sourceIntrinsic_a86c261fcdee_originalDynamicSite697_14(11973, (9103893846620132712L ^ local1)), local9, __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_15(19486, (4416105886492243890L ^ local1)), local8, __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_16(8675, (4969939620918024776L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_17(24697, (1668321626036804560L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_18(3279, (1256564231198603105L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_19(21021, (2504797190532868535L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_20(24849, (1625485208207071929L ^ local1)), local3, ")");
}


public com.moon.mS b(java.util.function.Supplier<java.lang.Float> p0) {
this.d = ((java.util.function.Supplier)(p0));
    return this;
}


public com.moon.mS b(java.lang.String p0) {
this.b = ((java.lang.String)(p0));
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2243_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.mS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill968_0 = p0;
        life4_9 += 1;
        life5_44 = (spill968_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill968_1 = p0;
        life4_9 += 1;
        life5_76 = (spill968_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill968_2 = p0;
        life4_9 += 1;
        life5_91 = (spill968_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 4358);
    if (((com.moon.mS.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.mS.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.mS.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/mS", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.mS.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.mS.j)[life5_8] = com.moon.mS.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.mS.j)[life5_8];
}


public com.moon.mS a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


public com.moon.mS a(java.util.function.Supplier<java.lang.Float> p0) {
this.c = ((java.util.function.Supplier)(p0));
    return this;
}


public com.moon.mS a(com.moon.mT p0) {
this.e = ((com.moon.mT)(p0));
    return this;
}


public com.moon.mS a(com.moon.pj p0) {
this.f = ((com.moon.pj)(p0));
    return this;
}


public com.moon.mS a(java.util.List<com.moon.mV> p0) {
this.g = ((java.util.List)(p0));
    return this;
}


public com.moon.mR a() {
return new com.moon.mR(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2243_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_17(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite697_21(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.util.function.Supplier a5, java.lang.String a6, java.util.function.Supplier a7, java.lang.String a8, com.moon.mT a9, java.lang.String a10, com.moon.pj a11, java.lang.String a12, java.util.List a13, java.lang.String a14) throws E;
}
