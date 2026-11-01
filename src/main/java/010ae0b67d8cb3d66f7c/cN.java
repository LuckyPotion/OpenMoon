package com.moon;


public class cN extends com.moon.cM {

private java.lang.String a;

private java.lang.String c;

private java.lang.String d;

private java.lang.String e;

private java.lang.String f;

private static long g;

private static java.lang.String[] h;

private static java.lang.String[] i;

private static java.util.Map j;

public cN(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) { super(); }


private static void __sourceConstructorBody_6af601d66056bed2(com.moon.cN receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4) throws Throwable {

long local6_life1 = (com.moon.cN.g ^ 81569103818579L);

    net.minecraft.entity.Entity[] __sourceSpill16_3 = com.moon.cM.b();

    com.moon.cN.__sourceConstructorInit_6af601d66056bed2_0(((com.moon.cN)(receiver)));

    ((com.moon.cN)(receiver)).a = ((java.lang.String)(p0));

    ((com.moon.cN)(receiver)).c = ((java.lang.String)(p1));

    net.minecraft.entity.Entity[] local8_life7 = __sourceSpill16_3;

    ((com.moon.cN)(receiver)).d = ((java.lang.String)(p2));

    ((com.moon.cN)(receiver)).e = ((java.lang.String)(p3));

    ((com.moon.cN)(receiver)).f = ((java.lang.String)(p4));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        com.moon.cM.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[3])));

    }

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_6af601d66056bed2_0(com.moon.cN a0) throws E;

static {
g = ((long)(((moom._a)(moom._c.a(((long)(-5246460916769716012L)), ((long)(3403673824725728836L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(146622430626541L)))));

    j = ((java.util.Map)(new java.util.HashMap(13)));

    long local0_life7 = (com.moon.cN.g ^ 81889114584121L);

    javax.crypto.Cipher local2_life9;

    javax.crypto.Cipher __sourceSpill95_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill95_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill95_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill95_14 = new byte[8];

    (__sourceSpill95_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));

    int local3_life15 = 1;

    while ((local3_life15 < 8)) {

        (__sourceSpill95_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));

        local3_life15 += 1;

    }

    byte[] __sourcePreallocation95_16 = __sourceSpill95_14;

    ((javax.crypto.Cipher)(__sourceSpill95_11)).init(((int)(__sourceSpill95_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill95_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation95_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life19 = new java.lang.String[7];

    int local7_life20 = 0;

    java.lang.String local6_life21;

    int local8_life23 = ((java.lang.String)((local6_life21 = "Ó9ÓíÄ\025[[z\025¿lïÑøyh\\÷³Ý×é\033kE\017å±Z p\002)QÄö¹Ð5´ç\013ì.¾FÓ¥ø\000¤rÔ\004?LO\007 ¾ìæ/äRB\f»v0Ð+æ¨[1 Å=\177$5/´R9m\016þ\032\020ñ÷Ê¤zoÄ\016ÈE8¢ GÅm,#¨ÿ²ý6Çüª\013?\001²¡!Iÿ¨iÒLñ½u"))).length();

    int local5_life24 = 32;

    int local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill95_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill95_29 = local2_life9;

        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill95_29)).doFinal(((byte[])(__sourceSpill95_28)));

        java.lang.String __sourceSpill95_34 = ((java.lang.String)(com.moon.cN.a(((byte[])(local10_life31))))).intern();

        java.lang.String[] __sourceSpill95_35 = local9_life19;

        int __sourceSpill95_36 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill95_35)[__sourceSpill95_36] = __sourceSpill95_34;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    local8_life23 = ((java.lang.String)((local6_life21 = "­Îf£\031±\036ö¹ºö¼@\022FOÿdG´µ\006&\031ÄÔéðjÈÂ\020Þ¾ü\022JÅüÜì»é"))).length();

    local5_life24 = 32;

    local4_life25 = -1;

    while (true) {

        local4_life25 += 1;

        byte[] __sourceSpill95_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill95_43 = local2_life9;

        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill95_43)).doFinal(((byte[])(__sourceSpill95_42)));

        java.lang.String __sourceSpill95_48 = ((java.lang.String)(com.moon.cN.a(((byte[])(local10_life45))))).intern();

        java.lang.String[] __sourceSpill95_49 = local9_life19;

        int __sourceSpill95_50 = local7_life20;

        local7_life20 += 1;

        (__sourceSpill95_49)[__sourceSpill95_50] = __sourceSpill95_48;

        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }

        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));

    }

    h = ((java.lang.String[])(local9_life19));

    i = ((java.lang.String[])(new java.lang.String[7]));
}


public com.moon.cN b(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
    return this;
}


public java.lang.String b__sourceReturn_0e30dfc966() {
return this.a;
}


public com.moon.cN e(java.lang.String p0) {
this.f = ((java.lang.String)(p0));
    return this;
}


public java.lang.String e() {
return this.e;
}


public com.moon.cN c(java.lang.String p0) {
this.d = ((java.lang.String)(p0));
    return this;
}


public java.lang.String c() {
return this.c;
}


public java.lang.String f() {
return this.f;
}


public java.lang.String d() {
return this.d;
}


public com.moon.cN d(java.lang.String p0) {
this.e = ((java.lang.String)(p0));
    return this;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5446);
    if (((com.moon.cN.i)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.cN.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.cN.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/cN", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.cN.h)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.cN.i)[life5_8] = com.moon.cN.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.cN.i)[life5_8];
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
        byte[] spill115_0 = p0;
        life4_9 += 1;
        life5_44 = (spill115_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill115_1 = p0;
        life4_9 += 1;
        life5_76 = (spill115_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill115_2 = p0;
        life4_9 += 1;
        life5_91 = (spill115_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.cN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral825_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public java.lang.String a() {
java.lang.String forwardValue26_22_0;
    java.lang.String forwardValue26_28_0;
    java.lang.String forwardValue26_86_0;
    java.lang.String spill26_0;
    java.lang.String spill26_1;
    java.lang.String spill26_2;
    java.lang.String spill26_3;
    java.lang.String spill26_4;
    java.lang.String spill26_5;
    java.lang.String spill26_6;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.String life4_34;
    java.lang.String life5_52;
    java.lang.String life6_53;
    java.lang.String life7_54;
    java.lang.String life8_55;
    java.lang.String life9_56;
    java.lang.String life10_57;
    forward_join_86: {
    forward_join_28: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (com.moon.cN.g ^ 99645951279248L);
    life3_5 = com.moon.cM.b();
    spill26_0 = this.d;
    if (!((life3_5 != null))) {
        forwardValue26_22_0 = spill26_0;
        break forward_join_22;
    }
    if (!(((java.lang.String)(spill26_0)).equals(((java.lang.Object)(__sourceIntrinsic_63ef3276e4d3_invokedynamic26_3(17422, (8913132730951830496L ^ life1_3))))))) {
        break forward_join_23;
    }
    forwardValue26_22_0 = __sourceIntrinsic_63ef3276e4d3_invokedynamic26_5(31058, (4622466703263086264L ^ life1_3));
    }
    forwardValue26_28_0 = forwardValue26_22_0;
    break forward_join_28;
    }
    forwardValue26_28_0 = __sourceIntrinsic_63ef3276e4d3_invokedynamic26_6(10972, (4552469526005507380L ^ life1_3));
    }
    life4_34 = forwardValue26_28_0;
    spill26_1 = java.net.URLEncoder.encode(((java.lang.String)(this.a)), ((java.nio.charset.Charset)(java.nio.charset.StandardCharsets.UTF_8)));
    spill26_2 = life4_34;
    spill26_3 = java.net.URLEncoder.encode(((java.lang.String)(this.c)), ((java.nio.charset.Charset)(java.nio.charset.StandardCharsets.UTF_8)));
    spill26_4 = this.d;
    spill26_5 = java.net.URLEncoder.encode(((java.lang.String)(this.e)), ((java.nio.charset.Charset)(java.nio.charset.StandardCharsets.UTF_8)));
    life5_52 = this.f;
    life6_53 = spill26_5;
    life7_54 = spill26_4;
    life8_55 = spill26_3;
    life9_56 = spill26_2;
    life10_57 = spill26_1;
    spill26_6 = __sourceIntrinsic_63ef3276e4d3_invokedynamic26_22(__sourceIntrinsic_63ef3276e4d3_invokedynamic26_18(10526, (8144339920672089847L ^ life1_3)), life10_57, "&", life9_56, "=", life8_55, __sourceIntrinsic_63ef3276e4d3_invokedynamic26_19(20052, (4749439206034997691L ^ life1_3)), life7_54, __sourceIntrinsic_63ef3276e4d3_invokedynamic26_20(20554, (1015976530029617057L ^ life1_3)), life6_53, __sourceIntrinsic_63ef3276e4d3_invokedynamic26_21(1874, (301472529478994111L ^ life1_3)), life5_52);
    if (!((life3_5 == null))) {
        forwardValue26_86_0 = spill26_6;
        break forward_join_86;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    forwardValue26_86_0 = spill26_6;
    }
    return forwardValue26_86_0;
}


public com.moon.cN a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral825_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_63ef3276e4d3_invokedynamic26_22(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7, java.lang.String a8, java.lang.String a9, java.lang.String a10, java.lang.String a11) throws E;
}
