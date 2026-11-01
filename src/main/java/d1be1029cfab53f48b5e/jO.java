package com.moon;


public class jO extends com.moon.jN {

private com.moon.jX c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public jO() { super((java.lang.String)null); }

private static void __sourceConstructorBody_109a512b67125d52(com.moon.jO receiver) throws Throwable {
long local1 = (com.moon.jO.d ^ 5792018206234L);
    com.moon.jO.__sourceConstructorInit_109a512b67125d52_0(((com.moon.jO)(receiver)), ((java.lang.String)(__sourceIntrinsic_109a512b67125d52_originalDynamicSite1082_1(8868, (5348226364327500738L ^ local1)))));
    ((com.moon.jO)(receiver)).c = ((com.moon.jX)(new com.moon.jX()));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-1481858096689376476L)), ((long)(-8263476795240413947L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(73340633855541L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jO.d ^ 119818337765563L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill185_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill185_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill185_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill185_14 = new byte[8];
    (__sourceSpill185_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill185_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation185_16 = __sourceSpill185_14;
    ((javax.crypto.Cipher)(__sourceSpill185_11)).init(((int)(__sourceSpill185_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill185_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation185_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[3];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "qfû\017m`0Õ ²ì\b\037ÀGvñ\025äÞ\17760Z\030\032¨?\0239ËC\027D\022µ3öón\t¿&hcøª ¦Í\016­L\btù\000~_²\024[N3Þzâ1u\023æ\020¿Ø¼_/"))).length();
    int local5_life24 = 32;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill185_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill185_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill185_29)).doFinal(((byte[])(__sourceSpill185_28)));
        java.lang.String __sourceSpill185_34 = ((java.lang.String)(com.moon.jO.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill185_35 = local9_life19;
        int __sourceSpill185_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill185_35)[__sourceSpill185_36] = __sourceSpill185_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_109a512b67125d52_0(com.moon.jO a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_9d9d0f10df0940b4c29e(com.moon.jO a0, org.luaj.vm2.LuaTable a1) throws E;
private static final class __SourceHandler_9d9d0f10df0940b4c29e {

public static void f93(com.moon.jO receiver, org.luaj.vm2.LuaTable p0) throws Throwable {
    org.luaj.vm2.LuaTable spill93_0;
    java.lang.String spill93_1;
    com.moon.q6 spill93_2;
    org.luaj.vm2.LuaTable spill93_3;
    java.lang.String spill93_4;
    com.moon.q7 spill93_5;
    long life2_3;
    life2_3 = (__fieldRead93_0() ^ 46147585444247L);
    spill93_0 = p0;
    spill93_1 = __invokedynamic93_1(4726, (4411728957183044766L ^ life2_3));
    com.moon.q6 __stackOp93_3_0 = __sourceUninitializedNEW93_2();
    spill93_2 = __stackOp93_3_0;
    __explicitNewInit93_4(__stackOp93_3_0, receiver);
    __call93_5(spill93_0, spill93_1, spill93_2);
    spill93_3 = p0;
    spill93_4 = __invokedynamic93_6(9364, (4576757487917963902L ^ life2_3));
    com.moon.q7 __stackOp93_8_0 = __sourceUninitializedNEW93_7();
    spill93_5 = __stackOp93_8_0;
    __explicitNewInit93_9(__stackOp93_8_0, receiver);
    __call93_10(spill93_3, spill93_4, spill93_5);
    return;
}
private static native long __fieldRead93_0() throws Throwable;
private static native java.lang.String __invokedynamic93_1(int a0, long a1) throws Throwable;
private static native com.moon.q6 __sourceUninitializedNEW93_2() throws Throwable;
private static native void __explicitNewInit93_4(com.moon.q6 a0, com.moon.jO a1) throws Throwable;
private static native void __call93_5(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q6 a2) throws Throwable;
private static native java.lang.String __invokedynamic93_6(int a0, long a1) throws Throwable;
private static native com.moon.q7 __sourceUninitializedNEW93_7() throws Throwable;
private static native void __explicitNewInit93_9(com.moon.q7 a0, com.moon.jO a1) throws Throwable;
private static native void __call93_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.q7 a2) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1907_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jO"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jO.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 589);
    if (((com.moon.jO.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jO.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jO.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jO", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jO.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jO.f)[life5_8] = com.moon.jO.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jO.f)[life5_8];
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
        byte[] spill576_0 = p0;
        life4_9 += 1;
        life5_44 = (spill576_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill576_1 = p0;
        life4_9 += 1;
        life5_76 = (spill576_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill576_2 = p0;
        life4_9 += 1;
        life5_91 = (spill576_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) { __sourceHandlerCall_9d9d0f10df0940b4c29e(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_109a512b67125d52_originalDynamicSite1082_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1907_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic93_1(int a0, long a1) throws E;
}
