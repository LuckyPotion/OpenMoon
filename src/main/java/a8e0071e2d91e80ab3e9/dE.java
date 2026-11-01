package com.moon;


public class dE {

private final java.util.Map<java.lang.String, com.moon.dD> a;

private java.io.File b;

private static java.lang.String c;

private static final long d;

private static final java.lang.String[] e;

private static final java.lang.String[] f;

private static final java.util.Map g;

public dE() {
super();
    this.a = new java.util.HashMap();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(1828442270708226397L)), ((long)(-6430042615597981220L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37865978576449L)))));
    java.lang.Object __sourceSpill63_6 = null;
    g = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.dE.c(((java.lang.String)(__sourceSpill63_6)));
    long local0_life9 = (com.moon.dE.d ^ 137499338837453L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill63_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill63_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill63_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill63_16 = new byte[8];
    (__sourceSpill63_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill63_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation63_18 = __sourceSpill63_16;
    ((javax.crypto.Cipher)(__sourceSpill63_13)).init(((int)(__sourceSpill63_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill63_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation63_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "\034\027òÒ±Eô°Wß\003þü\0050\020í\")ËØò{3¸\0169NÑ8s\020Ù%³«éÅÊÈtuQx×ºí "))).length();
    int local5_life26 = 16;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill63_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill63_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill63_31)).doFinal(((byte[])(__sourceSpill63_30)));
        java.lang.String __sourceSpill63_36 = ((java.lang.String)(com.moon.dE.a(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill63_37 = local9_life21;
        int __sourceSpill63_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill63_37)[__sourceSpill63_38] = __sourceSpill63_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    e = ((java.lang.String[])(local9_life21));
    f = ((java.lang.String[])(new java.lang.String[3]));
}


public void b(java.lang.String p0) {
java.lang.Object forwardValue44_22_0;
    java.lang.String spill44_0;
    com.moon.dD spill44_1;
    long life2_3;
    com.moon.dD life5_8;
    java.lang.String life4_9;
    forward_join_23: {
    forward_join_22: {
    life2_3 = (com.moon.dE.d ^ 34659344197093L);
    spill44_0 = com.moon.dE.b();
    life5_8 = this.a(((java.lang.String)(p0)));
    life4_9 = spill44_0;
    spill44_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue44_22_0 = spill44_1;
        break forward_join_22;
    }
    if (!((spill44_1 != null))) {
        break forward_join_23;
    }
    ((com.moon.dD)(life5_8)).c(((java.io.File)(this.b)));
    forwardValue44_22_0 = ((java.util.Map)(this.a)).remove(((java.lang.Object)(p0)));
    }
    recovery.source.CarrierOps.discard(forwardValue44_22_0);
    }
    return;
}


public static java.lang.String b() {
return com.moon.dE.c;
}


public static void c(java.lang.String p0) {
com.moon.dE.c = ((java.lang.String)(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
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
        byte[] spill149_0 = p0;
        life4_9 += 1;
        life5_44 = (spill149_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill149_1 = p0;
        life4_9 += 1;
        life5_76 = (spill149_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill149_2 = p0;
        life4_9 += 1;
        life5_91 = (spill149_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30310);
    if (((com.moon.dE.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.dE.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.dE.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/dE", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.dE.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.dE.f)[life5_8] = com.moon.dE.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.dE.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.dE.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral899_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/dE"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.util.Map<java.lang.String, com.moon.dD> a__Map() {
return this.a;
}


public java.io.File a() {
return this.b;
}


public com.moon.dD a(java.lang.String p0) {
this.a(((java.io.File)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__File())));
    return ((com.moon.dD)(((java.util.Map)(this.a)).get(((java.lang.Object)(p0)))));
}


public void a__Void(java.lang.String p0) {
com.moon.dD forwardValue43_27_0;
    java.lang.String spill43_0;
    com.moon.dD spill43_1;
    long life2_3;
    com.moon.dD life5_8;
    java.lang.String life4_9;
    forward_join_34: {
    forward_join_27: {
    forward_join_26: {
    life2_3 = (com.moon.dE.d ^ 84315323507169L);
    spill43_0 = com.moon.dE.b();
    life5_8 = this.a(((java.lang.String)(p0)));
    life4_9 = spill43_0;
    spill43_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue43_27_0 = spill43_1;
        break forward_join_27;
    }
    if (!((spill43_1 == null))) {
        break forward_join_26;
    }
    life5_8 = new com.moon.dD(p0, null);
    ((java.util.Map)(this.a)).put(((java.lang.Object)(p0)), ((java.lang.Object)(life5_8)));
    }
    forwardValue43_27_0 = life5_8;
    }
    ((com.moon.dD)(forwardValue43_27_0)).a(((java.io.File)(this.b)));
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        break forward_join_34;
    }
    com.moon.dE.c(((java.lang.String)("lLBm0b")));
    }
    return;
}


public void a(java.io.File p0) {
java.lang.Object lexicalValue10_31_0;
    java.lang.String spill10_0;
    java.io.File spill10_1;
    long life2_3;
    java.lang.String life4_16;
    java.io.File[] life5_38;
    int life6_41;
    int life7_43;
    java.io.File life8_50;
    java.lang.String life9_53;
    java.lang.String life10_76;
    lexical_join_84: {
    lexical_join_31: {
    lexical_join_27: {
    life2_3 = (com.moon.dE.d ^ 102454815776714L);
    spill10_0 = com.moon.dE.b();
    this.b = ((java.io.File)(new java.io.File(p0, __sourceIntrinsic_a2a27ba450de_invokedynamic10_2(3561, (5253331573694635393L ^ life2_3)))));
    life4_16 = spill10_0;
    spill10_1 = this.b;
    if (!((life4_16 == null))) {
        lexicalValue10_31_0 = spill10_1;
        break lexical_join_31;
    }
    if (!((!((java.io.File)(spill10_1)).exists()))) {
        break lexical_join_27;
    }
    ((java.io.File)(this.b)).mkdirs();
    }
    lexicalValue10_31_0 = java.util.Objects.requireNonNull(((java.lang.Object)(((java.io.File)(this.b)).listFiles())));
    }
    life5_38 = ((java.io.File[])(lexicalValue10_31_0));
    life6_41 = (life5_38).length;
    life7_43 = 0;
    lexical_cycle_38: while (true) {
    lexical_join_79: {
    lexical_join_78: {
    if (!((life7_43 < life6_41))) {
        break lexical_join_84;
    }
    life8_50 = (life5_38)[life7_43];
    life9_53 = ((java.io.File)(life8_50)).getName();
    if (!((life4_16 == null))) {
        break lexical_join_79;
    }
    if (!(((java.lang.String)(life9_53)).endsWith(((java.lang.String)(__sourceIntrinsic_a2a27ba450de_invokedynamic10_13(22877, (169414792512522550L ^ life2_3))))))) {
        break lexical_join_78;
    }
    life10_76 = (((java.lang.String)(life9_53)).split(((java.lang.String)(__sourceIntrinsic_a2a27ba450de_invokedynamic10_15(4462, (4187658436826595588L ^ life2_3))))))[0];
    ((java.util.Map)(this.a)).put(((java.lang.Object)(life10_76)), ((java.lang.Object)(new com.moon.dD(life10_76, null))));
    }
    life7_43 += 1;
    }
    if (!((life4_16 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a2a27ba450de_invokedynamic10_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a2a27ba450de_invokedynamic10_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a2a27ba450de_invokedynamic10_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral899_0() throws E;
}
