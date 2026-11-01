package moom;


public class NS implements moom.NT<java.lang.Object> {

private java.util.List<java.lang.Object> a;

private int b;

private boolean c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public NS() {
super();
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-7482330409009993428L)), ((long)(4189367757822875376L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(137234668313331L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.NS.d ^ 86556849913453L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill727_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill727_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill727_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill727_14 = new byte[8];
    (__sourceSpill727_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill727_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation727_16 = __sourceSpill727_14;
    ((javax.crypto.Cipher)(__sourceSpill727_11)).init(((int)(__sourceSpill727_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill727_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation727_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "\007Oì±\"P71îMí*°QèÆPªæX`Ýî\0203\tEcêE*0pÂ®Ô0ç\ntçäC\næ±a\r\022\001pÆ7<^3?\né\033»-»æÐ.*S¦ÒÞØ¶÷½=ÏW\001û"))).length();
    int local5_life24 = 24;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill727_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill727_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill727_29)).doFinal(((byte[])(__sourceSpill727_28)));
        java.lang.String __sourceSpill727_34 = ((java.lang.String)(moom.NS.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill727_35 = local9_life19;
        int __sourceSpill727_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill727_35)[__sourceSpill727_36] = __sourceSpill727_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_83b6c5a14851a97bade9(moom.NS a0, java.util.List a1) throws E;
private static final class __SourceHandler_83b6c5a14851a97bade9 {

public static void f372(moom.NS receiver, java.util.List p0) throws Throwable {
    moom.NS forestValue372_41_0;
    moom.NS forestValue372_45_0;
    int forestValue372_45_1;
    moom.NS forestValue372_51_0;
    int forestValue372_51_1;
    moom.NS forestValue372_52_0;
    moom.NS forestValue372_53_0;
    int forestValue372_53_1;
    moom.NS spill372_0;
    moom.NS spill372_1;
    int spill372_2;
    long life2_3;
    int life4_5;
    forest_join_53: {
    forest_join_52: {
    forest_join_51: {
    forest_join_45: {
    forest_join_41: {
    forest_join_32: {
    life2_3 = (__fieldRead372_0() ^ 23070044177541L);
    life4_5 = __call372_1();
    spill372_0 = receiver;
    if (!((life4_5 != 0))) {
        forestValue372_41_0 = spill372_0;
        break forest_join_41;
    }
    if (!(__fieldRead372_2(spill372_0))) {
        break forest_join_32;
    }
    java.lang.Object __inlineStack372_5Token;
    java.lang.Object __inlineStack372_7Token;
    throw new java.lang.RuntimeException(__invokedynamic372_8(__inlineStack372_5Output0((__inlineStack372_5Token = __inlineStack372_5Pack(__fieldRead372_3(receiver), p0, __invokedynamic372_4(6451, (8588016427274951737L ^ life2_3))))), __inlineStack372_5Output1(__inlineStack372_5Token), __inlineStack372_7Output0((__inlineStack372_7Token = __inlineStack372_7Pack(__inlineStack372_5Output2(__inlineStack372_5Token), __invokedynamic372_6(25285, (5311182963827156941L ^ life2_3))))), __inlineStack372_7Output1(__inlineStack372_7Token)));
    }
    __fieldWrite372_9(receiver, p0);
    spill372_1 = receiver;
    spill372_2 = 0;
    if (!((life4_5 != 0))) {
        forestValue372_45_0 = spill372_1;
        forestValue372_45_1 = spill372_2;
        break forest_join_45;
    }
    __fieldWrite372_10(spill372_1, spill372_2);
    forestValue372_41_0 = receiver;
    }
    if (!((p0 != null))) {
        forestValue372_52_0 = forestValue372_41_0;
        break forest_join_52;
    }
    forestValue372_45_0 = forestValue372_41_0;
    forestValue372_45_1 = __fieldRead372_11(receiver);
    }
    if (!((life4_5 != 0))) {
        forestValue372_51_0 = forestValue372_45_0;
        forestValue372_51_1 = forestValue372_45_1;
        break forest_join_51;
    }
    if (!((forestValue372_45_1 < __call372_12(p0)))) {
        forestValue372_52_0 = forestValue372_45_0;
        break forest_join_52;
    }
    forestValue372_51_0 = forestValue372_45_0;
    forestValue372_51_1 = 1;
    }
    forestValue372_53_0 = forestValue372_51_0;
    forestValue372_53_1 = forestValue372_51_1;
    break forest_join_53;
    }
    forestValue372_53_0 = forestValue372_52_0;
    forestValue372_53_1 = 0;
    }
    __fieldWrite372_13(forestValue372_53_0, forestValue372_53_1);
    return;
}
private static native long __fieldRead372_0() throws Throwable;
private static native int __call372_1() throws Throwable;
private static native boolean __fieldRead372_2(moom.NS a0) throws Throwable;
private static native java.util.List __fieldRead372_3(moom.NS a0) throws Throwable;
private static native java.lang.String __invokedynamic372_4(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack372_5Pack(java.util.List a0, java.util.List a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack372_5Output0(java.lang.Object token) throws Throwable;
private static native java.util.List __inlineStack372_5Output1(java.lang.Object token) throws Throwable;
private static native java.util.List __inlineStack372_5Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic372_6(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack372_7Pack(java.util.List a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack372_7Output0(java.lang.Object token) throws Throwable;
private static native java.util.List __inlineStack372_7Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic372_8(java.lang.String a0, java.util.List a1, java.lang.String a2, java.util.List a3) throws Throwable;
private static native void __fieldWrite372_9(moom.NS a0, java.util.List a1) throws Throwable;
private static native void __fieldWrite372_10(moom.NS a0, int a1) throws Throwable;
private static native int __fieldRead372_11(moom.NS a0) throws Throwable;
private static native int __call372_12(java.util.List a0) throws Throwable;
private static native void __fieldWrite372_13(moom.NS a0, int a1) throws Throwable;

}


public void remove() {
long local1 = (moom.NS.d ^ 112730358387381L);
    throw new java.lang.UnsupportedOperationException(__sourceIntrinsic_893fcfacec5a_originalDynamicSite381_1(10004, (1873355923862402093L ^ local1)));
}


public boolean hasNext() {
int forwardValue2817_17_0;
    boolean spill2817_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_15: {
    life1_3 = (moom.NS.d ^ 48829088357217L);
    life3_5 = moom.Ob.c();
    spill2817_0 = this.c;
    if (!((life3_5 != 0))) {
        forwardValue2817_17_0 = ((spill2817_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill2817_0))) {
        break forward_join_15;
    }
    __sourceExactCall_31cc79eb98fab9(((moom.NT)(this)));
    return ((0) != 0);
    }
    forwardValue2817_17_0 = ((this.c) ? 1 : 0);
    }
    return ((forwardValue2817_17_0) != 0);
}


public java.lang.Object next() {
java.lang.Object forwardValue2818_18_0;
    moom.NS forwardValue2818_35_0;
    int forwardValue2818_35_1;
    moom.NS forwardValue2818_36_0;
    moom.NS forwardValue2818_37_0;
    int forwardValue2818_37_1;
    moom.NS spill2818_0;
    moom.NS spill2818_1;
    int spill2818_2;
    long life1_3;
    int life3_5;
    java.lang.Object life4_23;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.NS.d ^ 59295916329287L);
    life3_5 = moom.Ob.b();
    spill2818_0 = this;
    if (!((life3_5 == 0))) {
        forwardValue2818_18_0 = spill2818_0;
        break forward_join_18;
    }
    if (!((!((moom.NS)(spill2818_0)).c))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue2818_18_0 = ((java.util.List)(this.a)).get(((int)(this.b)));
    }
    life4_23 = forwardValue2818_18_0;
    moom.NS __stackOp2818_6_0 = this;
    ((moom.NS)(__stackOp2818_6_0)).b = ((int)((((moom.NS)(__stackOp2818_6_0)).b + 1)));
    spill2818_1 = this;
    spill2818_2 = this.b;
    if (!((life3_5 == 0))) {
        forwardValue2818_35_0 = spill2818_1;
        forwardValue2818_35_1 = spill2818_2;
        break forward_join_35;
    }
    if (!((spill2818_2 < ((java.util.List)(this.a)).size()))) {
        forwardValue2818_36_0 = spill2818_1;
        break forward_join_36;
    }
    forwardValue2818_35_0 = spill2818_1;
    forwardValue2818_35_1 = 1;
    }
    forwardValue2818_37_0 = forwardValue2818_35_0;
    forwardValue2818_37_1 = forwardValue2818_35_1;
    break forward_join_37;
    }
    forwardValue2818_37_0 = forwardValue2818_36_0;
    forwardValue2818_37_1 = 0;
    }
    ((moom.NS)(forwardValue2818_37_0)).c = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2818_37_1)));
    return life4_23;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32215);
    if (((moom.NS.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.NS.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.NS.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/NS", life9_51);
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
        life9_116 = ((java.lang.String)((moom.NS.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.NS.f)[life5_8] = __sourceExactCall_26660395913682(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.NS.f)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.NS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6610_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/NS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill3331_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3331_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3331_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3331_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3331_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3331_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public void a(java.util.List<java.lang.Object> p0) { __sourceHandlerCall_83b6c5a14851a97bade9(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6610_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_80f4afb34920_invokedynamic372_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_893fcfacec5a_originalDynamicSite381_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.lang.String __sourceExactCall_26660395913682(byte[] p0);

private static native void __sourceExactCall_31cc79eb98fab9(moom.NT p0);
}
