package com.moon;


public class h7<T> {

private static org.tinylog.TaggedLogger a;

private static java.util.Map<java.lang.Class<? extends com.moon.ie>, com.moon.h8> b;

private java.util.Map c;

private java.util.List<com.moon.pq> d;

private java.lang.Class<T> e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

public h7(java.util.List<com.moon.pq> p0, java.lang.Class<T> p1) {
super();
    this.c = new com.moon.pz(this);
    this.d = p0;
    this.e = p1;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-8942430130704293064L)), ((long)(-3022118162756051915L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(225007873511006L)))));
    long local9_life6 = (com.moon.h7.f ^ 15802495748047L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill127_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill127_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill127_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill127_14 = new byte[8];
    (__sourceSpill127_14)[0] = ((byte) ((int) (local9_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill127_14)[local1_life15] = ((byte) ((int) ((local9_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation127_16 = __sourceSpill127_14;
    ((javax.crypto.Cipher)(__sourceSpill127_11)).init(((int)(__sourceSpill127_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill127_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation127_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local7_life19 = new java.lang.String[2];
    int local5_life20 = 0;
    java.lang.String local4_life21;
    int local6_life23 = ((java.lang.String)((local4_life21 = "°vNÿ9\036«*tJ>\ti\f¬/=¡\005\033\fD*%ñô0O\037åñÇê§¿\003\tèÒÊ@U\034s0n¤Iã¼¦|¡È°\"yê~ÑnK\021\024SÂ|µ\027ûL¾ÒC³©* uXE°Ô¥X_kÀÀ±ýEÉ\004cHwY§J"))).length();
    int local3_life24 = 40;
    int local2_life25 = -1;
    while (true) {
        local2_life25 += 1;
        byte[] __sourceSpill127_28 = ((java.lang.String)(((java.lang.String)(local4_life21)).substring(((int)(local2_life25)), ((int)((local2_life25 + local3_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill127_29 = local0_life9;
        byte[] local8_life31 = ((javax.crypto.Cipher)(__sourceSpill127_29)).doFinal(((byte[])(__sourceSpill127_28)));
        java.lang.String __sourceSpill127_34 = ((java.lang.String)(com.moon.h7.a(((byte[])(local8_life31))))).intern();
        java.lang.String[] __sourceSpill127_35 = local7_life19;
        int __sourceSpill127_36 = local5_life20;
        local5_life20 += 1;
        (__sourceSpill127_35)[__sourceSpill127_36] = __sourceSpill127_34;
        if (!(((local2_life25 = (local2_life25 + local3_life24)) < local6_life23))) { break; }
        local3_life24 = ((java.lang.String)(local4_life21)).charAt(((int)(local2_life25)));
    }
    g = ((java.lang.String[])(local7_life19));
    h = ((java.lang.String[])(new java.lang.String[2]));
    a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite127_40(16980, (7087203763635615153L ^ local9_life6)))))));
    b = ((java.util.Map)(new com.moon.py()));
}

private static native <E extends Throwable> java.lang.Object __sourceHandlerCall_d5a4e71a2de5fa4afd32(com.moon.h7 a0) throws E;
private static final class __SourceHandler_d5a4e71a2de5fa4afd32 {

public static java.lang.Object f68(com.moon.h7 receiver) throws Throwable {
    java.lang.Class forestValue68_44_0;
    java.lang.Class spill68_0;
    java.lang.String spill68_1;
    long life1_3;
    java.lang.Object life3_12;
    java.util.Iterator life4_16;
    com.moon.pq life5_23;
    java.lang.reflect.Field life6_33;
    java.lang.Class life7_36;
    java.lang.Class life8_44;
    java.util.Iterator life9_56;
    com.moon.ie life10_63;
    java.lang.Class life11_66;
    com.moon.h8 life12_71;
    forest_join_85: {
    life1_3 = (__fieldRead68_0() ^ 22359516197655L);
    life3_12 = __call68_3(__call68_2(__fieldRead68_1(receiver), new java.lang.Class[0]), new java.lang.Object[0]);
    life4_16 = __call68_5(__fieldRead68_4(receiver));
    forest_cycle_17: while (true) {
    forest_join_84: {
    forest_join_52: {
    forest_join_44: {
    forest_join_43: {
    if (!(__call68_6(life4_16))) {
        break forest_join_85;
    }
    life5_23 = __cast68_8(__call68_7(life4_16));
    java.lang.Class __stackOp68_11_0 = __fieldRead68_9(receiver);
    java.lang.String __stackOp68_11_1 = __call68_10(life5_23);
    spill68_0 = __stackOp68_11_0;
    java.lang.String __stackOp68_13_0 = __stackOp68_11_1;
    java.lang.String __stackOp68_13_1 = __call68_12(__stackOp68_11_0, __stackOp68_11_1);
    spill68_1 = __stackOp68_13_1;
    __discardScalar68_14(__stackOp68_13_0);
    life6_33 = __call68_15(spill68_0, spill68_1);
    life7_36 = __call68_16(life6_33);
    if (!(__call68_17(life7_36))) {
        break forest_join_43;
    }
    forestValue68_44_0 = __call68_18(life7_36);
    break forest_join_44;
    }
    forestValue68_44_0 = life7_36;
    }
    life8_44 = forestValue68_44_0;
    if (!((!__call68_19(life6_33, life3_12)))) {
        break forest_join_52;
    }
    __call68_20(life6_33, 1);
    }
    life9_56 = __call68_22(__call68_21(life5_23));
    forest_cycle_56: while (true) {
    forest_join_83: {
    if (!(__call68_23(life9_56))) {
        break forest_join_84;
    }
    life10_63 = __cast68_25(__call68_24(life9_56));
    life11_66 = __call68_26(life10_63);
    life12_71 = __cast68_29(__call68_28(__fieldRead68_27(), life11_66));
    if (!((life12_71 != null))) {
        break forest_join_83;
    }
    __call68_32(life12_71, life3_12, life10_63, life6_33, life7_36, life8_44, __fieldRead68_30(), __fieldRead68_31(receiver));
    }
    continue forest_cycle_56;
    }
    }
    continue forest_cycle_17;
    }
    }
    return life3_12;
}
public static java.lang.Object h68_0(java.lang.InstantiationException p0) throws Throwable {
    throw __call3006800_0(p0);
}
public static java.lang.Object h68_1(java.lang.InstantiationException p0) throws Throwable {
    throw __call3006801_0(p0);
}
public static java.lang.Object h68_2(java.lang.InstantiationException p0) throws Throwable {
    throw __call3006802_0(p0);
}
public static java.lang.Object h68_3(java.lang.ReflectiveOperationException p0, long p1, java.lang.Object p2) throws Throwable {
    org.tinylog.TaggedLogger spill3006803_0;
    java.lang.String spill3006803_1;
    java.lang.Object[] spill3006803_2;
    java.lang.ReflectiveOperationException life3_2;
    life3_2 = p0;
    spill3006803_0 = __fieldRead3006803_0();
    spill3006803_1 = __invokedynamic3006803_1(4742, (6820147105682117050L ^ p1));
    java.lang.Object[] __stackOp3006803_2_0 = new java.lang.Object[1];
    spill3006803_2 = __stackOp3006803_2_0;
    (__stackOp3006803_2_0)[0] = life3_2;
    __call3006803_3(spill3006803_0, spill3006803_1, spill3006803_2);
    return null;
}
private static native long __fieldRead68_0() throws Throwable;
private static native java.lang.Class __fieldRead68_1(com.moon.h7 a0) throws Throwable;
private static native java.lang.reflect.Constructor __call68_2(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call68_3(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native java.util.List __fieldRead68_4(com.moon.h7 a0) throws Throwable;
private static native java.util.Iterator __call68_5(java.util.List a0) throws Throwable;
private static native boolean __call68_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call68_7(java.util.Iterator a0) throws Throwable;
private static native com.moon.pq __cast68_8(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __fieldRead68_9(com.moon.h7 a0) throws Throwable;
private static native java.lang.String __call68_10(com.moon.pq a0) throws Throwable;
private static native java.lang.String __call68_12(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar68_14(java.lang.String a0) throws Throwable;
private static native java.lang.reflect.Field __call68_15(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native java.lang.Class __call68_16(java.lang.reflect.Field a0) throws Throwable;
private static native boolean __call68_17(java.lang.Class a0) throws Throwable;
private static native java.lang.Class __call68_18(java.lang.Class a0) throws Throwable;
private static native boolean __call68_19(java.lang.reflect.Field a0, java.lang.Object a1) throws Throwable;
private static native void __call68_20(java.lang.reflect.Field a0, int a1) throws Throwable;
private static native java.util.List __call68_21(com.moon.pq a0) throws Throwable;
private static native java.util.Iterator __call68_22(java.util.List a0) throws Throwable;
private static native boolean __call68_23(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call68_24(java.util.Iterator a0) throws Throwable;
private static native com.moon.ie __cast68_25(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __call68_26(com.moon.ie a0) throws Throwable;
private static native java.util.Map __fieldRead68_27() throws Throwable;
private static native java.lang.Object __call68_28(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native com.moon.h8 __cast68_29(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead68_30() throws Throwable;
private static native java.util.Map __fieldRead68_31(com.moon.h7 a0) throws Throwable;
private static native void __call68_32(com.moon.h8 a0, java.lang.Object a1, com.moon.ie a2, java.lang.reflect.Field a3, java.lang.Class a4, java.lang.Class a5, java.util.Map a6, java.util.Map a7) throws Throwable;
private static native java.lang.InstantiationException __call3006800_0(java.lang.InstantiationException a0) throws Throwable;
private static native java.lang.InstantiationException __call3006801_0(java.lang.InstantiationException a0) throws Throwable;
private static native java.lang.InstantiationException __call3006802_0(java.lang.InstantiationException a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead3006803_0() throws Throwable;
private static native java.lang.String __invokedynamic3006803_1(int a0, long a1) throws Throwable;
private static native void __call3006803_3(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;

}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.h7.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25960);
    if (((com.moon.h7.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.h7.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.h7.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/h7", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.h7.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.h7.h)[life5_8] = com.moon.h7.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.h7.h)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1347_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill460_0 = p0;
        life4_9 += 1;
        life5_44 = (spill460_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill460_1 = p0;
        life4_9 += 1;
        life5_76 = (spill460_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill460_2 = p0;
        life4_9 += 1;
        life5_91 = (spill460_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.InstantiationException a(java.lang.InstantiationException p0) {
return p0;
}


public T a() throws java.lang.Exception { return ((T)(__sourceHandlerCall_d5a4e71a2de5fa4afd32(this))); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite127_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1347_0() throws E;
}
