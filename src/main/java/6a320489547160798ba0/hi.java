package com.moon;


public abstract class hi {

protected static net.minecraft.client.Minecraft a;

private static com.google.gson.Gson b;

private java.lang.String c;

protected com.moon.module.impl.HUD d;

private float e;

private float f;

private float g;

private float i;

private float j;

private float k;

private static long q;

private static java.lang.String[] s;

private static java.lang.String[] t;

private static java.util.Map u;

public hi(java.lang.String p0, com.moon.module.impl.HUD p1) {
super();
    this.c = p0;
    this.d = p1;
}


static {
q = ((long)(((moom._a)(moom._c.a(((long)(710997844040130905L)), ((long)(8262428354053751373L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(91551591846051L)))));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.hi.q ^ 78352535066716L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill204_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill204_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill204_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill204_14 = new byte[8];
    (__sourceSpill204_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill204_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation204_16 = __sourceSpill204_14;
    ((javax.crypto.Cipher)(__sourceSpill204_11)).init(((int)(__sourceSpill204_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill204_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation204_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[6];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "%ÅNæ}\n%·#\bì\rQ!PÀgÿ¥Üöòã§¾ú\týÏk½q÷¥þ¡å\tÕ\021Øð\037Ù¥i?iÒÕ1¼Äj$SHJxÁß©\017\004{\020Eù@÷(UÙ49ù¹¹\022\020¶Ñì¯\037\033\004â\026ýB%Ptô@\000Ð\r­&\024óÀ\0375\0013ç©Xðök \få±ù\035ÉM\rÑ\026A/!Wà±\034êÜÆ7ë¥Þ¹)Ö0Â\002:º]ù 9²x\023P\003"))).length();
    int local5_life24 = 72;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill204_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill204_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill204_29)).doFinal(((byte[])(__sourceSpill204_28)));
        java.lang.String __sourceSpill204_34 = ((java.lang.String)(com.moon.hi.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill204_35 = local9_life19;
        int __sourceSpill204_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill204_35)[__sourceSpill204_36] = __sourceSpill204_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "i\t\027.ü[ÚäX%¾EÖ\027*\f+)¢¹Bt£ó\030*¬Oü\001íÊò ¬by©,8NhV±`Þ=\nÒ^ùó0\017ww=`\004¥äE¼\002µÕL{|@K!òE@úr&udü£^\fÙø¹×ö\003:KÕÓ\022fÒ2\020Êzh\0323Sp,gÃñ5Þáð%q»0X\035/v5Ï_"))).length();
    local5_life24 = 72;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill204_42 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill204_43 = local2_life9;
        byte[] local10_life45 = ((javax.crypto.Cipher)(__sourceSpill204_43)).doFinal(((byte[])(__sourceSpill204_42)));
        java.lang.String __sourceSpill204_48 = ((java.lang.String)(com.moon.hi.a(((byte[])(local10_life45))))).intern();
        java.lang.String[] __sourceSpill204_49 = local9_life19;
        int __sourceSpill204_50 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill204_49)[__sourceSpill204_50] = __sourceSpill204_48;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    s = ((java.lang.String[])(local9_life19));
    t = ((java.lang.String[])(new java.lang.String[6]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    b = ((com.google.gson.Gson)(((com.google.gson.GsonBuilder)(((com.google.gson.GsonBuilder)(new com.google.gson.GsonBuilder())).setPrettyPrinting())).create()));
}

private static native <E extends Throwable> void __sourceHandlerCall_5be43e11164e92b7a2e4(com.moon.hi a0, java.io.File a1) throws E;
private static final class __SourceHandler_5be43e11164e92b7a2e4 {

public static void f51(com.moon.hi receiver, java.io.File p0) throws Throwable {
    long life2_3;
    java.io.File life4_16;
    java.lang.String life5_26;
    life2_3 = (__fieldRead51_0() ^ 8616883263827L);
    life4_16 = new java.io.File(p0, __invokedynamic51_3(__fieldRead51_1(receiver), __invokedynamic51_2(22988, (8198079031320473738L ^ life2_3))));
    life5_26 = __call51_7(__fieldRead51_4(), new com.moon.hk(__fieldRead51_5(receiver), __fieldRead51_6(receiver)));
    java.nio.file.Path spill51_0 = __call51_8(life4_16);
    java.lang.String spill51_1 = life5_26;
    java.nio.file.OpenOption[] __stackOp51_9_0 = new java.nio.file.OpenOption[3];
    java.nio.file.OpenOption[] spill51_2 = __stackOp51_9_0;
    (__stackOp51_9_0)[0] = __fieldRead51_10();
    java.nio.file.OpenOption[] __stackOp51_11_0 = spill51_2;
    java.nio.file.OpenOption[] spill51_3 = __stackOp51_11_0;
    (__stackOp51_11_0)[1] = __fieldRead51_12();
    java.nio.file.OpenOption[] __stackOp51_13_0 = spill51_3;
    java.nio.file.OpenOption[] spill51_4 = __stackOp51_13_0;
    (__stackOp51_13_0)[2] = __fieldRead51_14();
    __call51_15(spill51_0, spill51_1, spill51_4);
    return;
}
public static void h51_0(java.io.IOException p0, com.moon.hi p1, long p2) throws Throwable {
    java.io.IOException local4 = p0;
    org.tinylog.TaggedLogger spill2005100_0 = __call2005100_1(__call2005100_0());
    java.lang.String __stackOp2005100_4_0 = __fieldRead2005100_2(p1);
    java.lang.String __stackOp2005100_4_1 = __invokedynamic2005100_3(13248, (5645698311680694915L ^ p2));
    java.lang.String spill2005100_1 = __invokedynamic2005100_5(__stackOp2005100_4_1, __stackOp2005100_4_0);
    java.lang.Object[] __stackOp2005100_6_0 = new java.lang.Object[1];
    java.lang.Object[] spill2005100_2 = __stackOp2005100_6_0;
    (__stackOp2005100_6_0)[0] = local4;
    __call2005100_7(spill2005100_0, spill2005100_1, spill2005100_2);
    return;
}
private static native long __fieldRead51_0() throws Throwable;
private static native java.lang.String __fieldRead51_1(com.moon.hi a0) throws Throwable;
private static native java.lang.String __invokedynamic51_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic51_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead51_4() throws Throwable;
private static native float __fieldRead51_5(com.moon.hi a0) throws Throwable;
private static native float __fieldRead51_6(com.moon.hi a0) throws Throwable;
private static native java.lang.String __call51_7(com.google.gson.Gson a0, com.moon.hk a1) throws Throwable;
private static native java.nio.file.Path __call51_8(java.io.File a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead51_10() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead51_12() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead51_14() throws Throwable;
private static native java.nio.file.Path __call51_15(java.nio.file.Path a0, java.lang.String a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native com.moon.runtime.ClientContext __call2005100_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call2005100_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __fieldRead2005100_2(com.moon.hi a0) throws Throwable;
private static native java.lang.String __invokedynamic2005100_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2005100_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2005100_7(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4a2a35844ed1a27f80b0(com.moon.hi a0, java.io.File a1) throws E;
private static final class __SourceHandler_4a2a35844ed1a27f80b0 {

public static void f74(com.moon.hi receiver, java.io.File p0) throws Throwable {
    java.lang.Object forwardValue74_49_0;
    net.minecraft.entity.Entity[] spill74_0;
    java.io.File spill74_1;
    org.tinylog.TaggedLogger spill74_2;
    long life2_3;
    java.io.File life5_17;
    net.minecraft.entity.Entity[] life4_18;
    com.moon.hk life6_55;
    forward_join_64: {
    forward_join_49: {
    forward_join_42: {
    life2_3 = (__fieldRead74_0() ^ 15169160064558L);
    spill74_0 = __call74_1();
    life5_17 = new java.io.File(p0, __invokedynamic74_4(__fieldRead74_2(receiver), __invokedynamic74_3(24088, (8641820787558957088L ^ life2_3))));
    life4_18 = spill74_0;
    spill74_1 = life5_17;
    if (!((life4_18 == null))) {
        forwardValue74_49_0 = spill74_1;
        break forward_join_49;
    }
    if (!((!__call74_5(spill74_1)))) {
        break forward_join_42;
    }
    spill74_2 = __call74_7(__call74_6());
    java.lang.String __stackOp74_10_0 = __fieldRead74_8(receiver);
    java.lang.String __stackOp74_10_1 = __invokedynamic74_9(11188, (4161238293071508875L ^ life2_3));
    __call74_13(spill74_2, __invokedynamic74_12(__stackOp74_10_1, __stackOp74_10_0, __invokedynamic74_11(14110, (8142683324750309668L ^ life2_3))));
    return;
    }
    forwardValue74_49_0 = __call74_16(__fieldRead74_14(), new java.io.FileReader(life5_17), __classLiteral74_15());
    }
    life6_55 = __cast74_17(forwardValue74_49_0);
    __fieldWrite74_19(receiver, __call74_18(life6_55));
    __fieldWrite74_21(receiver, __call74_20(life6_55));
    if (!((__call74_22() != null))) {
        break forward_join_64;
    }
    __call74_23(new net.minecraft.entity.Entity[2]);
    }
    return;
}
public static void h74_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3007400_0(p0);
}
public static void h74_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3007401_0(p0);
}
public static void h74_2(java.io.FileNotFoundException p0, com.moon.hi p1, long p2, com.moon.hk p3) throws Throwable {
    org.tinylog.TaggedLogger spill3007402_0;
    java.lang.String spill3007402_1;
    java.lang.Object[] spill3007402_2;
    java.io.FileNotFoundException life4_2;
    life4_2 = p0;
    spill3007402_0 = __call3007402_1(__call3007402_0());
    java.lang.String __stackOp3007402_4_0 = __fieldRead3007402_2(p1);
    java.lang.String __stackOp3007402_4_1 = __invokedynamic3007402_3(16423, (5119057187504348702L ^ p2));
    spill3007402_1 = __invokedynamic3007402_5(__stackOp3007402_4_1, __stackOp3007402_4_0);
    java.lang.Object[] __stackOp3007402_6_0 = new java.lang.Object[1];
    spill3007402_2 = __stackOp3007402_6_0;
    (__stackOp3007402_6_0)[0] = life4_2;
    __call3007402_7(spill3007402_0, spill3007402_1, spill3007402_2);
    if ((__call3007402_8() != null)) {
        __call3007402_9(new net.minecraft.entity.Entity[2]);
    } else {
        
    }
    return;
}
public static void h74_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3007403_0(p0);
}
private static native long __fieldRead74_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call74_1() throws Throwable;
private static native java.lang.String __fieldRead74_2(com.moon.hi a0) throws Throwable;
private static native java.lang.String __invokedynamic74_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic74_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call74_5(java.io.File a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call74_6() throws Throwable;
private static native org.tinylog.TaggedLogger __call74_7(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __fieldRead74_8(com.moon.hi a0) throws Throwable;
private static native java.lang.String __invokedynamic74_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic74_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic74_12(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call74_13(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.google.gson.Gson __fieldRead74_14() throws Throwable;
private static native java.lang.Object __classLiteral74_15() throws Throwable;
private static native java.lang.Object __call74_16(com.google.gson.Gson a0, java.io.FileReader a1, java.lang.Object a2) throws Throwable;
private static native com.moon.hk __cast74_17(java.lang.Object a0) throws Throwable;
private static native float __call74_18(com.moon.hk a0) throws Throwable;
private static native void __fieldWrite74_19(com.moon.hi a0, float a1) throws Throwable;
private static native float __call74_20(com.moon.hk a0) throws Throwable;
private static native void __fieldWrite74_21(com.moon.hi a0, float a1) throws Throwable;
private static native java.lang.String[] __call74_22() throws Throwable;
private static native void __call74_23(net.minecraft.entity.Entity[] a0) throws Throwable;
private static native java.io.FileNotFoundException __call3007400_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.io.FileNotFoundException __call3007401_0(java.io.FileNotFoundException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3007402_0() throws Throwable;
private static native org.tinylog.TaggedLogger __call3007402_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __fieldRead3007402_2(com.moon.hi a0) throws Throwable;
private static native java.lang.String __invokedynamic3007402_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3007402_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3007402_7(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String[] __call3007402_8() throws Throwable;
private static native void __call3007402_9(net.minecraft.entity.Entity[] a0) throws Throwable;
private static native java.io.FileNotFoundException __call3007403_0(java.io.FileNotFoundException a0) throws Throwable;

}


public float b() {
return this.f;
}


public abstract void b(com.moon.hW p0);

public void b(java.io.File p0) { __sourceHandlerCall_4a2a35844ed1a27f80b0(this, p0); }


public com.moon.hi b(float p0) {
this.f = ((float)(p0));
    return this;
}


public float e() {
return this.j;
}


public com.moon.hi e(float p0) {
this.j = ((float)(p0));
    return this;
}


public float c() {
return this.g;
}


public abstract void c(com.moon.hW p0);

public com.moon.hi c(float p0) {
this.g = ((float)(p0));
    return this;
}


public com.moon.hi f(float p0) {
this.k = ((float)(p0));
    return this;
}


public float f() {
return this.k;
}


public com.moon.hi d(float p0) {
this.i = ((float)(p0));
    return this;
}


public float d() {
return this.i;
}


public abstract void d(com.moon.hW p0);

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
        byte[] spill523_0 = p0;
        life4_9 += 1;
        life5_44 = (spill523_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill523_1 = p0;
        life4_9 += 1;
        life5_76 = (spill523_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill523_2 = p0;
        life4_9 += 1;
        life5_91 = (spill523_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1448_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.io.FileNotFoundException a(java.io.FileNotFoundException p0) {
return p0;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12437);
    if (((com.moon.hi.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hi.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hi.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hi", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hi.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hi.t)[life5_8] = com.moon.hi.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hi.t)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hi.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String a__String() {
return this.c;
}


public abstract boolean a__Boolean();

public abstract com.moon.hl a__hl();

public abstract void a__Void();

public abstract void a(com.moon.hW p0);

public com.moon.hi a(float p0) {
this.e = ((float)(p0));
    return this;
}


public void a(java.io.File p0) { __sourceHandlerCall_5be43e11164e92b7a2e4(this, p0); }


public float a() {
return this.e;
}


public com.moon.module.impl.HUD a__lY() {
return this.d;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1448_0() throws E;
}
