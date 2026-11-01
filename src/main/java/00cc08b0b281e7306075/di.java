package com.moon;


public class di extends com.moon.df<java.lang.Float> {

private float f;

private float g;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static java.util.Map k;

public di() {
super();
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-6410258813128033948L)), ((long)(-3123514715748229068L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(266416708707877L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.di.h ^ 58661124937550L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill71_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill71_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill71_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill71_14 = new byte[8];
    (__sourceSpill71_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill71_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation71_16 = __sourceSpill71_14;
    ((javax.crypto.Cipher)(__sourceSpill71_11)).init(((int)(__sourceSpill71_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill71_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation71_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "+SËû\021´Yï\023 LûS\020ÅÁ{eO\177a¤Ulù¸ÄW"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill71_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill71_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill71_29)).doFinal(((byte[])(__sourceSpill71_28)));
        java.lang.String __sourceSpill71_34 = ((java.lang.String)(com.moon.di.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill71_35 = local9_life19;
        int __sourceSpill71_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill71_35)[__sourceSpill71_36] = __sourceSpill71_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    i = ((java.lang.String[])(local9_life19));
    j = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_4636e8fba471e91a02a9(com.moon.di a0, java.lang.String a1) throws E;
private static final class __SourceHandler_4636e8fba471e91a02a9 {

public static boolean f54(com.moon.di receiver, java.lang.String p0) throws Throwable {
    int forwardValue54_24_0;
    int spill54_0;
    int spill54_1;
    long life2_3;
    java.lang.String[] life4_5;
    float life5_8;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead54_0() ^ 56599149280918L);
    life4_5 = __call54_1();
    life5_8 = __call54_2(p0);
    spill54_0 = __numericCompare54_4(life5_8, __fieldRead54_3(receiver));
    if (!((life4_5 == null))) {
        forwardValue54_24_0 = spill54_0;
        break forward_join_24;
    }
    if (!((spill54_0 >= 0))) {
        break forward_join_23;
    }
    spill54_1 = __numericCompare54_6(life5_8, __fieldRead54_5(receiver));
    if (!((life4_5 == null))) {
        forwardValue54_24_0 = spill54_1;
        break forward_join_24;
    }
    if (!((spill54_1 > 0))) {
        break forward_join_25;
    }
    }
    forwardValue54_24_0 = 0;
    }
    return __integerCategory54_7(forwardValue54_24_0);
    }
    __fieldWrite54_9(receiver, __call54_8(life5_8));
    return __integerCategory54_10(1);
}
public static boolean h54_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2005400_0(p0);
}
public static boolean h54_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2005401_0(p0);
}
public static boolean h54_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2005402_0(p0);
}
public static boolean h54_3(java.lang.NumberFormatException p0) throws Throwable {
    java.lang.NumberFormatException local1 = p0;
    return false;
}
private static native long __fieldRead54_0() throws Throwable;
private static native java.lang.String[] __call54_1() throws Throwable;
private static native float __call54_2(java.lang.String a0) throws Throwable;
private static native float __fieldRead54_3(com.moon.di a0) throws Throwable;
private static native int __numericCompare54_4(float a0, float a1) throws Throwable;
private static native float __fieldRead54_5(com.moon.di a0) throws Throwable;
private static native int __numericCompare54_6(float a0, float a1) throws Throwable;
private static native boolean __integerCategory54_7(int value) throws Throwable;
private static native java.lang.Float __call54_8(float a0) throws Throwable;
private static native void __fieldWrite54_9(com.moon.di a0, java.lang.Float a1) throws Throwable;
private static native boolean __integerCategory54_10(int value) throws Throwable;
private static native java.lang.NumberFormatException __call2005400_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call2005401_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.NumberFormatException __call2005402_0(java.lang.NumberFormatException a0) throws Throwable;

}


public com.moon.di b(float p0) {
this.g = ((float)(p0));
    return this;
}


public boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_4636e8fba471e91a02a9(this, p0); }


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
        byte[] spill167_0 = p0;
        life4_9 += 1;
        life5_44 = (spill167_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill167_1 = p0;
        life4_9 += 1;
        life5_76 = (spill167_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill167_2 = p0;
        life4_9 += 1;
        life5_91 = (spill167_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27303);
    if (((com.moon.di.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.di.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.di.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/di", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.di.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.di.j)[life5_8] = com.moon.di.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.di.j)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.di.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral930_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/di"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.aS a() {
return com.moon.aS.SPACE;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public static com.moon.dr a__dr() {
return new com.moon.dr();
}


public com.moon.di a(float p0) {
this.f = ((float)(p0));
    return this;
}


public java.lang.String a__String(java.lang.String p0) {
long local2_life2 = (com.moon.di.h ^ 8931639396362L);
    float __stackOp18_7_0 = this.f;
    float __stackOp18_7_1 = this.g;
    java.lang.String __stackOp18_7_2 = __sourceIntrinsic_7d31a37a36f2_originalDynamicSite18_6(1122, (2721327693571360345L ^ local2_life2));
    java.lang.String __sourceSpill18_9 = __stackOp18_7_2;
    float __sourceSpill18_10 = __stackOp18_7_0;
    float __sourceSpill18_11 = __stackOp18_7_1;
    recovery.source.CarrierOps.discard(__stackOp18_7_2);
    float __stackOp18_12_0 = __sourceSpill18_11;
    java.lang.String __stackOp18_12_1 = "-";
    return __sourceIntrinsic_7d31a37a36f2_originalDynamicSite18_15(__sourceSpill18_9, __sourceSpill18_10, __stackOp18_12_1, __stackOp18_12_0, __sourceIntrinsic_7d31a37a36f2_originalDynamicSite18_14(4550, (1843841713979102204L ^ local2_life2)));
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral930_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7d31a37a36f2_originalDynamicSite18_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7d31a37a36f2_originalDynamicSite18_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7d31a37a36f2_originalDynamicSite18_15(java.lang.String a0, float a1, java.lang.String a2, float a3, java.lang.String a4) throws E;
}
