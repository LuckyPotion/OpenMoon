package moom;


public class LF {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

public LF() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-2522136222013831732L)), ((long)(2382834195199408216L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(54803865750398L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.LF.a ^ 59084446149036L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill667_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill667_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill667_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill667_14 = new byte[8];
    (__sourceSpill667_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill667_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation667_16 = __sourceSpill667_14;
    ((javax.crypto.Cipher)(__sourceSpill667_11)).init(((int)(__sourceSpill667_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill667_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation667_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "{5÷¢pQQí¥}%ór·ßÛHÎÙXc\032VlIézMsî\005{ÝM\020±QV£v0K¿E º1Å×Ú"))).length();
    int local5_life24 = 40;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill667_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill667_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill667_29)).doFinal(((byte[])(__sourceSpill667_28)));
        java.lang.String __sourceSpill667_34 = ((java.lang.String)(moom.LF.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill667_35 = local9_life19;
        int __sourceSpill667_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill667_35)[__sourceSpill667_36] = __sourceSpill667_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    b = ((java.lang.String[])(local9_life19));
    c = ((java.lang.String[])(new java.lang.String[2]));
}

private static native <E extends Throwable> moom.LE[] __sourceHandlerCall_1873682027aaa8fed00c(java.lang.String a0) throws E;
private static final class __SourceHandler_1873682027aaa8fed00c {

public static moom.LE[] f328(java.lang.String p0) throws Throwable {
    int forestValue328_35_0;
    moom.LE[] forestValue328_60_0;
    java.lang.String[] spill328_0;
    boolean spill328_1;
    moom.LE[] spill328_2;
    long life1_3;
    java.io.StringReader life4_9;
    java.io.PushbackReader life5_14;
    java.util.ArrayList life6_18;
    java.lang.String[] life3_19;
    int life7_22;
    int life8_28;
    moom.bU life9_37;
    moom.LE life10_45;
    forest_join_61: {
    forest_join_60: {
    forest_join_50: {
    life1_3 = (__fieldRead328_0() ^ 93742968190578L);
    spill328_0 = __call328_1();
    life4_9 = new java.io.StringReader(p0);
    life5_14 = new java.io.PushbackReader(life4_9);
    life6_18 = new java.util.ArrayList();
    life3_19 = spill328_0;
    forest_cycle_20: while (true) {
    forest_join_49: {
    forest_join_40: {
    forest_join_35: {
    forest_join_26: {
    life7_22 = __call328_2(life5_14);
    if (!((life7_22 < 0))) {
        break forest_join_26;
    }
    break forest_join_50;
    }
    life8_28 = __integerCategory328_3(((char) life7_22));
    spill328_1 = __call328_4(life8_28);
    if (!((life3_19 != null))) {
        forestValue328_35_0 = __integerCategory328_5(spill328_1);
        break forest_join_35;
    }
    if (!((!spill328_1))) {
        break forest_join_49;
    }
    forestValue328_35_0 = life8_28;
    }
    life9_37 = __call328_6(forestValue328_35_0);
    if (!((life9_37 == null))) {
        break forest_join_40;
    }
    break forest_join_61;
    }
    life10_45 = __call328_7(life8_28, life9_37, life5_14);
    __call328_8(life6_18, life10_45);
    }
    continue forest_cycle_20;
    }
    }
    spill328_2 = __cast328_10(__call328_9(life6_18, new moom.LE[0]));
    if (!((__call328_11() != null))) {
        forestValue328_60_0 = spill328_2;
        break forest_join_60;
    }
    __call328_12(new java.lang.String[2]);
    forestValue328_60_0 = spill328_2;
    }
    return forestValue328_60_0;
    }
    java.lang.Object __inlineStack328_14Token;
    java.lang.Object __inlineStack328_16Token;
    throw new moom.cf(__invokedynamic328_17(__inlineStack328_14Output0((__inlineStack328_14Token = __inlineStack328_14Pack(life8_28, p0, __invokedynamic328_13(26710, (2891930017647724157L ^ life1_3))))), __inlineStack328_14Output1(__inlineStack328_14Token), __inlineStack328_16Output0((__inlineStack328_16Token = __inlineStack328_16Pack(__inlineStack328_14Output2(__inlineStack328_14Token), __invokedynamic328_15(13323, (2951688784248035873L ^ life1_3))))), __inlineStack328_16Output1(__inlineStack328_16Token)));
}
private static native long __fieldRead328_0() throws Throwable;
private static native java.lang.String[] __call328_1() throws Throwable;
private static native int __call328_2(java.io.PushbackReader a0) throws Throwable;
private static native int __integerCategory328_3(char value) throws Throwable;
private static native boolean __call328_4(int a0) throws Throwable;
private static native int __integerCategory328_5(boolean value) throws Throwable;
private static native moom.bU __call328_6(int a0) throws Throwable;
private static native moom.LE __call328_7(int a0, moom.bU a1, java.io.PushbackReader a2) throws Throwable;
private static native boolean __call328_8(java.util.ArrayList a0, moom.LE a1) throws Throwable;
private static native java.lang.Object[] __call328_9(java.util.ArrayList a0, moom.LE[] a1) throws Throwable;
private static native moom.LE[] __cast328_10(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String[] __call328_11() throws Throwable;
private static native void __call328_12(java.lang.String[] a0) throws Throwable;
private static native java.lang.String __invokedynamic328_13(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack328_14Pack(int a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __inlineStack328_14Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack328_14Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack328_14Output2(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic328_15(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack328_16Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack328_16Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack328_16Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic328_17(java.lang.String a0, int a1, java.lang.String a2, java.lang.String a3) throws Throwable;

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
        byte[] spill3006_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3006_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3006_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3006_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3006_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3006_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25975);
    if (((moom.LF.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.LF.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LF.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/LF", life9_51);
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
        life9_116 = ((java.lang.String)((moom.LF.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.LF.c)[life5_8] = moom.LF.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.LF.c)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5872_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.LF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


private static moom.LE a(char p0, moom.bU p1, java.io.PushbackReader p2) throws java.io.IOException {
java.lang.String[] spill915_0;
    long life3_3;
    java.lang.StringBuilder life6_8;
    java.lang.String[] life5_13;
    int life7_16;
    int life8_28;
    lexical_join_43: {
    life3_3 = (moom.LF.a ^ 45625172572752L);
    spill915_0 = moom.bS.b();
    life6_8 = new java.lang.StringBuilder();
    ((java.lang.StringBuilder)(life6_8)).append(((char)(p0)));
    life5_13 = spill915_0;
    lexical_cycle_14: while (true) {
    lexical_join_41: {
    lexical_join_37: {
    lexical_join_23: {
    life7_16 = ((java.io.PushbackReader)(p2)).read();
    if (!((life7_16 < 0))) {
        break lexical_join_23;
    }
    if (!((life5_13 != null))) {
        break lexical_join_43;
    }
    if (!((life5_13 == null))) {
        break lexical_join_43;
    }
    }
    life8_28 = ((int)(((char) life7_16)));
    if (!((life5_13 != null))) {
        break lexical_join_41;
    }
    if (!((!((moom.bU)(p1)).a__Boolean(((char)(life8_28)))))) {
        break lexical_join_37;
    }
    ((java.io.PushbackReader)(p2)).unread(((int)(life8_28)));
    if (!((life5_13 == null))) {
        break lexical_join_43;
    }
    }
    ((java.lang.StringBuilder)(life6_8)).append(((char)(life8_28)));
    }
    if (!((life5_13 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return new moom.LE(p1, ((java.lang.StringBuilder)(life6_8)).toString());
}


public static moom.LE[] a(java.lang.String p0) throws java.io.IOException, moom.cf { return __sourceHandlerCall_1873682027aaa8fed00c(p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b08d179e0242_invokedynamic328_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5872_0() throws E;
}
