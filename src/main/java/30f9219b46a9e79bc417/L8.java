package moom;


public class L8 implements moom.LV {

private java.lang.String a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public L8(java.lang.String p0) {
super();
    this.a = null;
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-2380497884500641263L)), ((long)(8397047974299032320L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(59108658792081L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.L8.b ^ 76947365360983L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill664_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill664_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill664_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill664_14 = new byte[8];
    (__sourceSpill664_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill664_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation664_16 = __sourceSpill664_14;
    ((javax.crypto.Cipher)(__sourceSpill664_11)).init(((int)(__sourceSpill664_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill664_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation664_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "u¨\tà[â\032YnZ^7\001÷ý\020?}Fd(*\\w(\034\"þYV8\004rô%Ì÷-+r\034¦i¢jÐãÿÅ.Ú4zlÄúEF\027èM³Ô\031OÍÍÊÞ¹\024#ülÇ¤+b¸ïh\022"))).length();
    int local5_life24 = 16;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill664_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill664_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill664_29)).doFinal(((byte[])(__sourceSpill664_28)));
        java.lang.String __sourceSpill664_34 = ((java.lang.String)(moom.L8.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill664_35 = local9_life19;
        int __sourceSpill664_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill664_35)[__sourceSpill664_36] = __sourceSpill664_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_d4520ebe92ddbcdac0ab(moom.L8 a0, java.lang.String a1, byte[] a2, java.lang.Throwable a3) throws E;
private static final class __SourceHandler_d4520ebe92ddbcdac0ab {

public static void f137(moom.L8 receiver, java.lang.String p0, byte[] p1, java.lang.Throwable p2) throws Throwable {
    moom.L6 forwardValue137_32_0;
    moom.L6 spill137_0;
    long life4_3;
    java.lang.String life6_5;
    java.lang.String life7_13;
    com.google.gson.JsonElement life8_16;
    moom.L7 life9_22;
    moom.L6 life10_26;
    forward_join_38: {
    forward_join_32: {
    life4_3 = (__fieldRead137_0() ^ 20880392032440L);
    life6_5 = __call137_1();
    if (!((p1 != null))) {
        break forward_join_38;
    }
    life7_13 = new java.lang.String(p1, __fieldRead137_2());
    life8_16 = __call137_3(life7_13);
    life9_22 = new moom.L7(__fieldRead137_4(receiver));
    life10_26 = __call137_5(life9_22, life8_16);
    spill137_0 = life10_26;
    if (!((life6_5 == null))) {
        forwardValue137_32_0 = spill137_0;
        break forward_join_32;
    }
    if (!((spill137_0 != null))) {
        break forward_join_38;
    }
    forwardValue137_32_0 = life10_26;
    }
    __call137_6(forwardValue137_32_0, 1);
    __call137_8(__fieldRead137_7(receiver), life10_26);
    }
    return;
}
public static void h137_0(java.lang.Exception p0) throws Throwable {
    throw __call2013700_0(p0);
}
public static void h137_1(java.lang.Exception p0, java.lang.String p1, long p2) throws Throwable {
    java.lang.Exception local4 = p0;
    int spill2013701_0 = 30232;
    java.lang.String spill2013701_1 = p1;
    java.lang.String spill2013701_2 = __call2013701_1(__call2013701_0(local4));
    java.lang.String local5 = __call2013701_2(local4);
    java.lang.String local6 = spill2013701_2;
    java.lang.String local7 = spill2013701_1;
    __call2013701_7(__invokedynamic2013701_6(__invokedynamic2013701_3(spill2013701_0, (6551619193143266395L ^ p2)), local7, __invokedynamic2013701_4(12246, (8344536416834508182L ^ p2)), local6, __invokedynamic2013701_5(17736, (8849518804400226057L ^ p2)), local5));
    return;
}
private static native long __fieldRead137_0() throws Throwable;
private static native java.lang.String __call137_1() throws Throwable;
private static native java.nio.charset.Charset __fieldRead137_2() throws Throwable;
private static native com.google.gson.JsonElement __call137_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead137_4(moom.L8 a0) throws Throwable;
private static native moom.L6 __call137_5(moom.L7 a0, com.google.gson.JsonElement a1) throws Throwable;
private static native void __call137_6(moom.L6 a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead137_7(moom.L8 a0) throws Throwable;
private static native void __call137_8(java.lang.String a0, moom.L6 a1) throws Throwable;
private static native java.lang.Exception __call2013700_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Class __call2013701_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call2013701_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2013701_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2013701_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2013701_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2013701_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2013701_6(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native void __call2013701_7(java.lang.String a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5856_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/L8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.L8.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29635);
    if (((moom.L8.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.L8.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.L8.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/L8", life9_51);
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
        life9_116 = ((java.lang.String)((moom.L8.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.L8.d)[life5_8] = moom.L8.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.L8.d)[life5_8];
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
        byte[] spill2997_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2997_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2997_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2997_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2997_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2997_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(java.lang.String p0, byte[] p1, java.lang.Throwable p2) { __sourceHandlerCall_d4520ebe92ddbcdac0ab(this, p0, p1, p2); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5856_0() throws E;
}
