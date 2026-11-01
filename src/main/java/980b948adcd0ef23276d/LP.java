package moom;


class LP implements moom.LN {

java.util.Map a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

LP(java.util.Map p0) { super(); }

private static void __sourceConstructorBody_a72dd29dd0646ff4(moom.LP receiver, java.util.Map p0) throws Throwable {
((moom.LP)(receiver)).a = ((java.util.Map)(p0));
    moom.LP.__sourceConstructorInit_a72dd29dd0646ff4_0(((moom.LP)(receiver)));
    return;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-7072546153680401298L)), ((long)(-732302637174900511L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(196868785447700L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.LP.b ^ 68579417691770L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill672_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill672_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill672_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill672_14 = new byte[8];
    (__sourceSpill672_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill672_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation672_16 = __sourceSpill672_14;
    ((javax.crypto.Cipher)(__sourceSpill672_11)).init(((int)(__sourceSpill672_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill672_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation672_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "ñ\001!)çqWóv\016¶ü\032·Aþl,Å·As3YC\003×û *Fe\006ÿáhQèÑ¨æÂi_ª:i52jãG\030Tÿ æ"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill672_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill672_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill672_29)).doFinal(((byte[])(__sourceSpill672_28)));
        java.lang.String __sourceSpill672_34 = ((java.lang.String)(moom.LP.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill672_35 = local9_life19;
        int __sourceSpill672_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill672_35)[__sourceSpill672_36] = __sourceSpill672_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a72dd29dd0646ff4_0(moom.LP a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_eb5b3eca5dfb00bc9eb2(moom.LP a0, moom.LS a1, java.lang.Exception a2) throws E;
private static final class __SourceHandler_eb5b3eca5dfb00bc9eb2 {

public static void f331(moom.LP receiver, moom.LS p0, java.lang.Exception p1) throws Throwable {
    long life3_3;
    java.util.Map life5_7;
    life3_3 = (__fieldRead331_0() ^ 57092990423220L);
    __monitorEnter331_2((life5_7 = __fieldRead331_1(receiver)));
    __call331_5(__fieldRead331_3(receiver), __invokedynamic331_4(30249, (4083518097872710535L ^ life3_3)), p1);
    __call331_7(__fieldRead331_6(receiver));
    __monitorExit331_8(life5_7);
    return;
}
public static void h331_0(java.lang.Throwable p0, java.util.Map p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3033100_0(p1);
    throw life2_2;
}
private static native long __fieldRead331_0() throws Throwable;
private static native java.util.Map __fieldRead331_1(moom.LP a0) throws Throwable;
private static native void __monitorEnter331_2(java.util.Map a0) throws Throwable;
private static native java.util.Map __fieldRead331_3(moom.LP a0) throws Throwable;
private static native java.lang.String __invokedynamic331_4(int a0, long a1) throws Throwable;
private static native java.lang.Object __call331_5(java.util.Map a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native java.util.Map __fieldRead331_6(moom.LP a0) throws Throwable;
private static native void __call331_7(java.util.Map a0) throws Throwable;
private static native void __monitorExit331_8(java.util.Map a0) throws Throwable;
private static native void __monitorExit3033100_0(java.util.Map a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f8b60981ea8b7ad49130(moom.LP a0, moom.LS a1, moom.LT a2) throws E;
private static final class __SourceHandler_f8b60981ea8b7ad49130 {

public static void f332(moom.LP receiver, moom.LS p0, moom.LT p1) throws Throwable {
    long life3_3;
    java.util.Map life5_7;
    life3_3 = (__fieldRead332_0() ^ 65953094066151L);
    __monitorEnter332_2((life5_7 = __fieldRead332_1(receiver)));
    __call332_5(__fieldRead332_3(receiver), __invokedynamic332_4(21275, (7328837467883717095L ^ life3_3)), p1);
    __call332_7(__fieldRead332_6(receiver));
    __monitorExit332_8(life5_7);
    return;
}
public static void h332_0(java.lang.Throwable p0, java.util.Map p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3033200_0(p1);
    throw life2_2;
}
private static native long __fieldRead332_0() throws Throwable;
private static native java.util.Map __fieldRead332_1(moom.LP a0) throws Throwable;
private static native void __monitorEnter332_2(java.util.Map a0) throws Throwable;
private static native java.util.Map __fieldRead332_3(moom.LP a0) throws Throwable;
private static native java.lang.String __invokedynamic332_4(int a0, long a1) throws Throwable;
private static native java.lang.Object __call332_5(java.util.Map a0, java.lang.String a1, moom.LT a2) throws Throwable;
private static native java.util.Map __fieldRead332_6(moom.LP a0) throws Throwable;
private static native void __call332_7(java.util.Map a0) throws Throwable;
private static native void __monitorExit332_8(java.util.Map a0) throws Throwable;
private static native void __monitorExit3033200_0(java.util.Map a0) throws Throwable;

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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26702);
    if (((moom.LP.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.LP.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LP.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/LP", life9_51);
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
        life9_116 = ((java.lang.String)((moom.LP.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.LP.d)[life5_8] = moom.LP.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.LP.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.LP.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5906_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LP"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill3023_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3023_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3023_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3023_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3023_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3023_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(moom.LS p0, java.lang.Exception p1) { __sourceHandlerCall_eb5b3eca5dfb00bc9eb2(this, p0, p1); }


public void a(moom.LS p0, moom.LT p1) { __sourceHandlerCall_f8b60981ea8b7ad49130(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5906_0() throws E;
}
