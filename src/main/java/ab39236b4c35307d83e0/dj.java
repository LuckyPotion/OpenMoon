package com.moon;


public class dj extends com.moon.df<java.lang.Integer> {

private int f;

private int g;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static java.util.Map k;

public dj() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(8407603686905404528L)), ((long)(-22696898466666259L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(210889098939255L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.dj.h ^ 3725853174295L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill72_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill72_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill72_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill72_14 = new byte[8];
    (__sourceSpill72_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill72_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation72_16 = __sourceSpill72_14;
    ((javax.crypto.Cipher)(__sourceSpill72_11)).init(((int)(__sourceSpill72_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill72_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation72_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "pC4\030Þ:\000~¹sºÖÌ©\020`P4{#È¬Â?:\036"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill72_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill72_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill72_29)).doFinal(((byte[])(__sourceSpill72_28)));
        java.lang.String __sourceSpill72_34 = ((java.lang.String)(com.moon.dj.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill72_35 = local9_life19;
        int __sourceSpill72_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill72_35)[__sourceSpill72_36] = __sourceSpill72_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    i = ((java.lang.String[])(local9_life19));
    j = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_eee86250fd1d1b996cf9(com.moon.dj a0, java.lang.String a1) throws E;
private static final class __SourceHandler_eee86250fd1d1b996cf9 {

public static boolean f55(com.moon.dj receiver, java.lang.String p0) throws Throwable {
    int forwardValue55_22_0;
    int spill55_0;
    int spill55_1;
    long life2_3;
    java.lang.String[] life4_5;
    int life5_8;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (__fieldRead55_0() ^ 103678779478567L);
    life4_5 = __call55_1();
    life5_8 = __call55_2(p0);
    spill55_0 = life5_8;
    if (!((life4_5 == null))) {
        forwardValue55_22_0 = spill55_0;
        break forward_join_22;
    }
    if (!((spill55_0 >= __fieldRead55_3(receiver)))) {
        break forward_join_21;
    }
    spill55_1 = life5_8;
    if (!((life4_5 == null))) {
        forwardValue55_22_0 = spill55_1;
        break forward_join_22;
    }
    if (!((spill55_1 > __fieldRead55_4(receiver)))) {
        break forward_join_23;
    }
    }
    forwardValue55_22_0 = 0;
    }
    return __integerCategory55_5(forwardValue55_22_0);
    }
    __fieldWrite55_7(receiver, __call55_6(life5_8));
    return __integerCategory55_8(1);
}
public static boolean h55_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2005500_0(p0);
}
public static boolean h55_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2005501_0(p0);
}
public static boolean h55_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2005502_0(p0);
}
public static boolean h55_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2005503_0(p0);
}
public static boolean h55_4(java.lang.NumberFormatException p0) throws Throwable {
    java.lang.NumberFormatException local1 = p0;
    return false;
}
private static native long __fieldRead55_0() throws Throwable;
private static native java.lang.String[] __call55_1() throws Throwable;
private static native int __call55_2(java.lang.String a0) throws Throwable;
private static native int __fieldRead55_3(com.moon.dj a0) throws Throwable;
private static native int __fieldRead55_4(com.moon.dj a0) throws Throwable;
private static native boolean __integerCategory55_5(int value) throws Throwable;
private static native java.lang.Integer __call55_6(int a0) throws Throwable;
private static native void __fieldWrite55_7(com.moon.dj a0, java.lang.Integer a1) throws Throwable;
private static native boolean __integerCategory55_8(int value) throws Throwable;
private static native java.lang.NumberFormatException __call2005500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call2005501_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call2005502_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call2005503_0(java.lang.NumberFormatException a0) throws Throwable;

}


public com.moon.dj b(int p0) {
this.g = ((int)(p0));
    return this;
}


public static com.moon.ds a__ds() {
return new com.moon.ds();
}


private static java.lang.NumberFormatException a(java.lang.NumberFormatException p0) {
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
        byte[] spill168_0 = p0;
        life4_9 += 1;
        life5_44 = (spill168_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill168_1 = p0;
        life4_9 += 1;
        life5_76 = (spill168_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill168_2 = p0;
        life4_9 += 1;
        life5_91 = (spill168_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5604);
    if (((com.moon.dj.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.dj.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.dj.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/dj", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.dj.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.dj.j)[life5_8] = com.moon.dj.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.dj.j)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.dj.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral933_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/dj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String(java.lang.String p0) {
long local2_life2 = (com.moon.dj.h ^ 111248575046843L);
    int __stackOp19_7_0 = this.f;
    int __stackOp19_7_1 = this.g;
    java.lang.String __stackOp19_7_2 = __sourceIntrinsic_7d31a37a36f2_originalDynamicSite19_6(3047, (1907217964125976223L ^ local2_life2));
    java.lang.String __sourceSpill19_9 = __stackOp19_7_2;
    int __sourceSpill19_10 = __stackOp19_7_0;
    int __sourceSpill19_11 = __stackOp19_7_1;
    recovery.source.CarrierOps.discard(__stackOp19_7_2);
    int __stackOp19_12_0 = __sourceSpill19_11;
    java.lang.String __stackOp19_12_1 = "-";
    return __sourceIntrinsic_7d31a37a36f2_originalDynamicSite19_15(__sourceSpill19_9, __sourceSpill19_10, __stackOp19_12_1, __stackOp19_12_0, __sourceIntrinsic_7d31a37a36f2_originalDynamicSite19_14(21699, (401271579338287546L ^ local2_life2)));
}


public com.moon.aS a() {
return com.moon.aS.SPACE;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public com.moon.dj a(int p0) {
this.f = ((int)(p0));
    return this;
}


public boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_eee86250fd1d1b996cf9(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral933_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7d31a37a36f2_originalDynamicSite19_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7d31a37a36f2_originalDynamicSite19_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7d31a37a36f2_originalDynamicSite19_15(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4) throws E;
}
