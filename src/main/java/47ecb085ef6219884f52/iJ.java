package com.moon;


public class iJ extends com.moon.iw {

private com.moon.iU k;

protected com.moon.jE l;

private static long m;

private static java.lang.String[] n;

private static java.lang.String[] o;

private static java.util.Map p;

public iJ() { super(); }


private static void __sourceConstructorBody_ccff447660fae821(com.moon.iJ receiver) throws Throwable {

long local1 = (com.moon.iJ.m ^ 136935494827168L);

    com.moon.iJ.__sourceConstructorInit_ccff447660fae821_0(((com.moon.iJ)(receiver)));

    ((com.moon.iJ)(receiver)).k = ((com.moon.iU)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(com.moon.iU.a__iV())).a(((java.lang.Class)(com.moon.i5.class))))).a(((java.lang.String)(__sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_5(7237, (2031839343907678023L ^ local1))))))).c(((java.lang.String)(__sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_7(18049, (3341038532027317633L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_9(18049, (3341038532027317633L ^ local1))))))).a()));

    ((com.moon.iJ)(receiver)).l = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_14(17842, (7563893099737710259L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_16(receiver)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_ccff447660fae821_0(com.moon.iJ a0) throws E;

static {
m = ((long)(((moom._a)(moom._c.a(((long)(4113795833815686141L)), ((long)(-3994264282061412844L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99738189814547L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.iJ.m ^ 73245389072741L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill161_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill161_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill161_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill161_14 = new byte[8];
    (__sourceSpill161_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill161_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation161_16 = __sourceSpill161_14;
    ((javax.crypto.Cipher)(__sourceSpill161_11)).init(((int)(__sourceSpill161_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill161_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation161_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "GÖ`1IáxÅ\036\\sBqè¨_ªf \006x¤ÅI»|QÙ·?\020Â¸ak\røüÛ\000~\034z²÷ {\týêìíV/\013ÌHÁ\022²¦½É4à×\016ßJR\026\b"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill161_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill161_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill161_29)).doFinal(((byte[])(__sourceSpill161_28)));
        java.lang.String __sourceSpill161_34 = ((java.lang.String)(com.moon.iJ.b(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill161_35 = local9_life19;
        int __sourceSpill161_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill161_35)[__sourceSpill161_36] = __sourceSpill161_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    n = ((java.lang.String[])(local9_life19));
    o = ((java.lang.String[])(new java.lang.String[3]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1601_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill598_0 = p0;
        life4_9 += 1;
        life5_44 = (spill598_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill598_1 = p0;
        life4_9 += 1;
        life5_76 = (spill598_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill598_2 = p0;
        life4_9 += 1;
        life5_91 = (spill598_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String b(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3883);
    if (((com.moon.iJ.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iJ.p)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iJ.p)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iJ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iJ.n)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iJ.o)[life5_8] = com.moon.iJ.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iJ.o)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iJ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b__Void() {
((com.moon.jE)(this.l)).a__Void();
    return;
}


protected void c__Void() {
return;
}


public com.moon.jE c() {
return this.l;
}


public void a(com.moon.hY p0) {
java.lang.Object local2 = ((com.moon.hY)(p0)).a__iv();
    ((com.moon.iv)(((com.moon.iv)(local2)).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(local2)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(local2)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(local2)).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.hY)(p0)).b(((int)(4)));
    super.a(((com.moon.hY)(p0)));
    return;
}


public com.moon.iU a__iU() {
return this.k;
}


private com.moon.jD lambda$new$0() {
return this.g;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_ccff447660fae821_originalDynamicSite1017_16(com.moon.iJ a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1601_0() throws E;
}
