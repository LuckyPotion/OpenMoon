package com.moon;


public class jh {

private static com.google.gson.Gson a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

public jh() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1051928684990030999L)), ((long)(3718667031671349289L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(174469123268060L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jh.b ^ 98856597136192L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill198_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill198_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill198_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill198_14 = new byte[8];
    (__sourceSpill198_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill198_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation198_16 = __sourceSpill198_14;
    ((javax.crypto.Cipher)(__sourceSpill198_11)).init(((int)(__sourceSpill198_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill198_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation198_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "pgéNá6E+ÁiÚ÷L\004z\0310\r0ÚPÍÜ¯\fË\021{q\026\001Fh\025óM­²¯Ò\177&s\030\177¼¸-\032(\023+÷\006\177\025Þ\030è$lr·½éôÅÀb\022\177\003ÅÕ:\004é`ÄíxtÌæl\026ê\020\023cÍC*r{=À±,ömÒ"))).length();
    int local5_life24 = 56;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill198_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill198_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill198_29)).doFinal(((byte[])(__sourceSpill198_28)));
        java.lang.String __sourceSpill198_34 = ((java.lang.String)(com.moon.jh.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill198_35 = local9_life19;
        int __sourceSpill198_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill198_35)[__sourceSpill198_36] = __sourceSpill198_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    c = ((java.lang.String[])(local9_life19));
    d = ((java.lang.String[])(new java.lang.String[3]));
    a = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));
}

private static native <E extends Throwable> com.moon.jg __sourceHandlerCall_1f0d547d72638a630bc7(java.lang.String a0) throws E;
private static final class __SourceHandler_1f0d547d72638a630bc7 {

public static com.moon.jg f100(java.lang.String p0) throws Throwable {
    java.lang.Object forestValue100_44_0;
    int spill100_0;
    java.lang.Class spill100_1;
    java.io.InputStream spill100_2;
    long life1_3;
    java.io.InputStream life4_20;
    int life3_21;
    forest_join_44: {
    forest_join_38: {
    life1_3 = (__fieldRead100_0() ^ 86027023331547L);
    spill100_0 = __call100_1();
    spill100_1 = __classLiteral100_2();
    java.lang.String __stackOp100_4_0 = p0;
    java.lang.String __stackOp100_4_1 = __invokedynamic100_3(17114, (6958289887348547322L ^ life1_3));
    life4_20 = __call100_7(spill100_1, __invokedynamic100_6(__stackOp100_4_1, __stackOp100_4_0, __invokedynamic100_5(14046, (4717357623269731069L ^ life1_3))));
    life3_21 = spill100_0;
    spill100_2 = life4_20;
    if (!((life3_21 != 0))) {
        forestValue100_44_0 = spill100_2;
        break forest_join_44;
    }
    if (!((spill100_2 == null))) {
        break forest_join_38;
    }
    java.lang.Object __inlineStack100_9Token;
    throw new java.lang.RuntimeException(__invokedynamic100_10(__inlineStack100_9Output0((__inlineStack100_9Token = __inlineStack100_9Pack(p0, __invokedynamic100_8(19007, (4668171980947248670L ^ life1_3))))), __inlineStack100_9Output1(__inlineStack100_9Token)));
    }
    forestValue100_44_0 = __call100_15(__fieldRead100_11(), __call100_13(life4_20, __fieldRead100_12()), __classLiteral100_14());
    }
    return __cast100_16(forestValue100_44_0);
}
public static com.moon.jg h100_0(java.io.IOException p0) throws Throwable {
    throw __call3010000_0(p0);
}
public static com.moon.jg h100_1(java.io.IOException p0) throws Throwable {
    throw __call3010001_0(p0);
}
public static com.moon.jg h100_2(java.io.IOException p0) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    throw new java.lang.RuntimeException(life1_2);
}
private static native long __fieldRead100_0() throws Throwable;
private static native int __call100_1() throws Throwable;
private static native java.lang.Class __classLiteral100_2() throws Throwable;
private static native java.lang.String __invokedynamic100_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100_6(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.io.InputStream __call100_7(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic100_8(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack100_9Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100_9Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack100_9Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead100_11() throws Throwable;
private static native java.nio.charset.Charset __fieldRead100_12() throws Throwable;
private static native java.lang.String __call100_13(java.io.InputStream a0, java.nio.charset.Charset a1) throws Throwable;
private static native java.lang.Class __classLiteral100_14() throws Throwable;
private static native java.lang.Object __call100_15(com.google.gson.Gson a0, java.lang.String a1, java.lang.Class a2) throws Throwable;
private static native com.moon.jg __cast100_16(java.lang.Object a0) throws Throwable;
private static native java.io.IOException __call3010000_0(java.io.IOException a0) throws Throwable;
private static native java.io.IOException __call3010001_0(java.io.IOException a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1961_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jh.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5786);
    if (((com.moon.jh.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jh.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jh.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jh", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jh.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jh.d)[life5_8] = com.moon.jh.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jh.d)[life5_8];
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
        byte[] spill817_0 = p0;
        life4_9 += 1;
        life5_44 = (spill817_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill817_1 = p0;
        life4_9 += 1;
        life5_76 = (spill817_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill817_2 = p0;
        life4_9 += 1;
        life5_91 = (spill817_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.io.IOException a(java.io.IOException p0) {
return p0;
}


public static com.moon.jg a(java.lang.String p0) { return __sourceHandlerCall_1f0d547d72638a630bc7(p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1961_0() throws E;
}
