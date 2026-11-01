package com.moon;


public class h4 {

private java.lang.String a;

private com.moon.jD b;

private java.lang.String c;

private static net.minecraft.entity.Entity[] d;

private static final long e;

private static final java.lang.String[] f;

private static final java.lang.String[] g;

private static final java.util.Map h;

h4() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(6808710514606809505L)), ((long)(-8706075350356634579L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(121075953080658L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.Entity[] __sourceSpill125_7 = new net.minecraft.entity.Entity[5];
    long local0_life8 = (com.moon.h4.e ^ 124592501920020L);
    com.moon.h4.b(((net.minecraft.entity.Entity[])(__sourceSpill125_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill125_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill125_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill125_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill125_16 = new byte[8];
    (__sourceSpill125_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill125_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation125_18 = __sourceSpill125_16;
    ((javax.crypto.Cipher)(__sourceSpill125_13)).init(((int)(__sourceSpill125_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill125_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation125_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "tøÁ@«å\"¶ùæ46ìÇ1àþ§\007æv7@ÌyðC`4\"v(¡UúZ:ý9e\007|¶ \"øiø%í×¦wñm\004k¹\005>}»vûÛ\\}ð\003ï»\035EÃâÊcT\020²qjåBtI°.Ü¼\037f.A"))).length();
    int local5_life26 = 24;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill125_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill125_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill125_31)).doFinal(((byte[])(__sourceSpill125_30)));
        java.lang.String __sourceSpill125_36 = ((java.lang.String)(com.moon.h4.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill125_37 = local9_life21;
        int __sourceSpill125_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill125_37)[__sourceSpill125_38] = __sourceSpill125_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    f = ((java.lang.String[])(local9_life21));
    g = ((java.lang.String[])(new java.lang.String[3]));
}


public java.lang.String toString() {
long local1 = (com.moon.h4.e ^ 22394007994170L);
    java.lang.String __sourceSpill416_4 = this.a;
    com.moon.jD __sourceSpill416_5 = this.b;
    java.lang.String local3 = this.c;
    com.moon.jD local4 = __sourceSpill416_5;
    java.lang.String local5 = __sourceSpill416_4;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite416_9(__sourceIntrinsic_a86c261fcdee_originalDynamicSite416_6(17340, (9114230156518401332L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite416_7(418, (1434293924151322411L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite416_8(30328, (927966967796895987L ^ local1)), local3, ")");
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.h4.d = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.h4.d;
}


public com.moon.h4 b(java.lang.String p0) {
this.c = ((java.lang.String)(p0));
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
        byte[] spill458_0 = p0;
        life4_9 += 1;
        life5_44 = (spill458_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill458_1 = p0;
        life4_9 += 1;
        life5_76 = (spill458_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill458_2 = p0;
        life4_9 += 1;
        life5_91 = (spill458_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21035);
    if (((com.moon.h4.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.h4.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.h4.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/h4", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.h4.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.h4.g)[life5_8] = com.moon.h4.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.h4.g)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.h4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1340_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.h4 a(java.lang.String p0) {
this.a = ((java.lang.String)(p0));
    return this;
}


public com.moon.h4 a(com.moon.jD p0) {
this.b = ((com.moon.jD)(p0));
    return this;
}


public com.moon.h3 a() {
return new com.moon.h3(this.a, this.b, this.c);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1340_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite416_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite416_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite416_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite416_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, com.moon.jD a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws E;
}
