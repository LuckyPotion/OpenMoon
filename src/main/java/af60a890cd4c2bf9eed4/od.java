package com.moon;


public class od {

private org.tinylog.TaggedLogger a;

private java.util.concurrent.ExecutorService b;

private com.moon.og c;

private com.moon.oe d;

private com.moon.pE e;

private com.moon.ot f;

private com.moon.ov g;

private static int[] h;

private static long i;

private static java.lang.String[] j;

private static java.lang.String[] k;

private static java.util.Map l;

private static long m;

private od(com.moon.oe p0) { super(); }

private static void __sourceConstructorBody_894d63a7b1c15fa7(com.moon.od receiver, com.moon.oe p0) throws Throwable {
long local2 = (com.moon.od.i ^ 87502452260880L);
    com.moon.od.__sourceConstructorInit_894d63a7b1c15fa7_0(((com.moon.od)(receiver)));
    ((com.moon.od)(receiver)).a = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_894d63a7b1c15fa7_originalDynamicSite1405_2(29765, (7437326262586043332L ^ local2)))))));
    ((com.moon.od)(receiver)).b = ((java.util.concurrent.ExecutorService)(java.util.concurrent.Executors.newSingleThreadExecutor()));
    ((com.moon.od)(receiver)).c = ((com.moon.og)(new com.moon.og(receiver)));
    ((com.moon.od)(receiver)).d = ((com.moon.oe)(p0));
    return;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(4961786567144575904L)), ((long)(7498004033718252060L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(92192072755200L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill327_7 = null;
    long local5_life8 = (com.moon.od.i ^ 106906800352486L);
    com.moon.od.b(((int[])(__sourceSpill327_7)));
    javax.crypto.Cipher local7_life11;
    javax.crypto.Cipher __sourceSpill327_13 = (local7_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill327_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill327_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill327_16 = new byte[8];
    (__sourceSpill327_16)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local8_life17 = 1;
    while ((local8_life17 < 8)) {
        (__sourceSpill327_16)[local8_life17] = ((byte) ((int) ((local5_life8 << (local8_life17 * 8)) >>> 56)));
        local8_life17 += 1;
    }
    byte[] __sourcePreallocation327_18 = __sourceSpill327_16;
    ((javax.crypto.Cipher)(__sourceSpill327_13)).init(((int)(__sourceSpill327_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill327_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation327_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life21 = new java.lang.String[2];
    int local12_life22 = 0;
    java.lang.String local11_life23;
    int local13_life25 = ((java.lang.String)((local11_life23 = "÷îÒJ%qüWWáÿx\016}-²×÷¼\005\024Ò_Õ\035êÛ=U\005jÌÓjjÑ³J¼1\n\023ì§\003¥.õYYÇÖLC¡Ò{\000/búu\177Ã¨\003[äF`\023Q»?\025 4äû.\034\020\020úvñÙ\013ÈÈwãN!"))).length();
    int local10_life26 = 96;
    int local9_life27 = -1;
    while (true) {
        local9_life27 += 1;
        byte[] __sourceSpill327_30 = ((java.lang.String)(((java.lang.String)(local11_life23)).substring(((int)(local9_life27)), ((int)((local9_life27 + local10_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill327_31 = local7_life11;
        byte[] local15_life33 = ((javax.crypto.Cipher)(__sourceSpill327_31)).doFinal(((byte[])(__sourceSpill327_30)));
        java.lang.String __sourceSpill327_36 = ((java.lang.String)(com.moon.od.a(((byte[])(local15_life33))))).intern();
        java.lang.String[] __sourceSpill327_37 = local14_life21;
        int __sourceSpill327_38 = local12_life22;
        local12_life22 += 1;
        (__sourceSpill327_37)[__sourceSpill327_38] = __sourceSpill327_36;
        if (!(((local9_life27 = (local9_life27 + local10_life26)) < local13_life25))) { break; }
        local10_life26 = ((java.lang.String)(local11_life23)).charAt(((int)(local9_life27)));
    }
    j = ((java.lang.String[])(local14_life21));
    k = ((java.lang.String[])(new java.lang.String[2]));
    javax.crypto.Cipher local0_life43;
    javax.crypto.Cipher __sourceSpill327_45 = (local0_life43 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill327_46 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill327_47 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill327_48 = new byte[8];
    (__sourceSpill327_48)[0] = ((byte) ((int) (local5_life8 >>> 56)));
    int local1_life49 = 1;
    while ((local1_life49 < 8)) {
        (__sourceSpill327_48)[local1_life49] = ((byte) ((int) ((local5_life8 << (local1_life49 * 8)) >>> 56)));
        local1_life49 += 1;
    }
    byte[] __sourcePreallocation327_50 = __sourceSpill327_48;
    ((javax.crypto.Cipher)(__sourceSpill327_45)).init(((int)(__sourceSpill327_46)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill327_47)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation327_50)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life53 = 2301524642684437207L;
    byte[] __sourceSpill327_54 = new byte[8];
    (__sourceSpill327_54)[0] = ((byte) ((int) (local2_life53 >>> 56)));
    (__sourceSpill327_54)[1] = ((byte) ((int) (local2_life53 >>> 48)));
    (__sourceSpill327_54)[2] = ((byte) ((int) (local2_life53 >>> 40)));
    (__sourceSpill327_54)[3] = ((byte) ((int) (local2_life53 >>> 32)));
    (__sourceSpill327_54)[4] = ((byte) ((int) (local2_life53 >>> 24)));
    (__sourceSpill327_54)[5] = ((byte) ((int) (local2_life53 >>> 16)));
    (__sourceSpill327_54)[6] = ((byte) ((int) (local2_life53 >>> 8)));
    (__sourceSpill327_54)[7] = ((byte) ((int) local2_life53));
    javax.crypto.Cipher __sourceSpill327_55 = local0_life43;
    byte[] local4_life57 = ((javax.crypto.Cipher)(__sourceSpill327_55)).doFinal(((byte[])(__sourceSpill327_54)));
    m = ((long)((((((((((((long) (local4_life57)[0]) & 255L) << 56) | ((((long) (local4_life57)[1]) & 255L) << 48)) | ((((long) (local4_life57)[2]) & 255L) << 40)) | ((((long) (local4_life57)[3]) & 255L) << 32)) | ((((long) (local4_life57)[4]) & 255L) << 24)) | ((((long) (local4_life57)[5]) & 255L) << 16)) | ((((long) (local4_life57)[6]) & 255L) << 8)) | (((long) (local4_life57)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_894d63a7b1c15fa7_0(com.moon.od a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_e5bb4814717f5efe5e1b(com.moon.od a0) throws E;
private static final class __SourceHandler_e5bb4814717f5efe5e1b {

public static void f73(com.moon.od receiver) throws Throwable {
    com.moon.od forwardValue73_25_0;
    int[] spill73_0;
    com.moon.od spill73_1;
    long life1_3;
    int[] life3_13;
    forward_join_25: {
    forward_join_22: {
    life1_3 = (__fieldRead73_0() ^ 43248207981396L);
    spill73_0 = __call73_1();
    __call73_4(__fieldRead73_2(receiver), __invokedynamic73_3(1611, (379974726496154255L ^ life1_3)));
    life3_13 = spill73_0;
    spill73_1 = receiver;
    if (!((life3_13 == null))) {
        forwardValue73_25_0 = spill73_1;
        break forward_join_25;
    }
    if (!((__fieldRead73_5(spill73_1) != null))) {
        break forward_join_22;
    }
    __call73_7(__fieldRead73_6(receiver));
    }
    __call73_9(__fieldRead73_8());
    forwardValue73_25_0 = receiver;
    }
    __call73_10(forwardValue73_25_0);
    return;
}
public static void h73_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call2007300_0(p0);
}
public static void h73_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call2007301_0(p0);
}
public static void h73_2(java.lang.InterruptedException p0) throws Throwable {
    java.lang.InterruptedException local1 = p0;
    __call2007302_0(local1);
    return;
}
private static native long __fieldRead73_0() throws Throwable;
private static native int[] __call73_1() throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead73_2(com.moon.od a0) throws Throwable;
private static native java.lang.String __invokedynamic73_3(int a0, long a1) throws Throwable;
private static native void __call73_4(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native com.moon.pE __fieldRead73_5(com.moon.od a0) throws Throwable;
private static native com.moon.pE __fieldRead73_6(com.moon.od a0) throws Throwable;
private static native void __call73_7(com.moon.pE a0) throws Throwable;
private static native long __fieldRead73_8() throws Throwable;
private static native void __call73_9(long a0) throws Throwable;
private static native void __call73_10(com.moon.od a0) throws Throwable;
private static native java.lang.Exception __call2007300_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2007301_0(java.lang.InterruptedException a0) throws Throwable;
private static native void __call2007302_0(java.lang.InterruptedException a0) throws Throwable;

}


public static void b(int[] p0) {
h = ((int[])(p0));
    return;
}


public void b() {
this.e = ((com.moon.pE)(new com.moon.pE(this, ((com.moon.oe)(this.d)).a__String())));
    ((com.moon.pE)(this.e)).connect();
    return;
}


public static int[] b__ArrayInt() {
return com.moon.od.h;
}


public void c() {
((java.util.concurrent.ExecutorService)(this.b)).submit(((java.lang.Runnable)(__sourceIntrinsic_5b7380e7aa7c_originalDynamicSite603_1(this))));
    return;
}


public com.moon.od a(com.moon.ov p0) {
this.g = ((com.moon.ov)(p0));
    return this;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3076_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/od"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.od.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2517);
    if (((com.moon.od.k)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.od.l)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.od.l)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/od", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.od.j)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.od.k)[life5_8] = com.moon.od.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.od.k)[life5_8];
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
        byte[] spill1454_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1454_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1454_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1454_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1454_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1454_2)[life4_9];
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


public com.moon.oe a() {
return this.d;
}


public com.moon.og a__og() {
return this.c;
}


public java.util.concurrent.ExecutorService a__ExecutorService() {
return this.b;
}


public org.tinylog.TaggedLogger a__TaggedLogger() {
return this.a;
}


public void a__Void() {
long life1_3;
    int[] life3_18;
    life1_3 = (com.moon.od.i ^ 138405052521606L);
    com.aayushatharva.brotli4j.Brotli4jLoader.ensureAvailability();
    int[] spill792_0 = com.moon.od.b__ArrayInt();
    this.f = ((com.moon.ot)(new com.moon.ot()));
    ((com.moon.ot)(this.f)).a(((com.moon.ol)(new com.moon.om(this))));
    life3_18 = spill792_0;
    try {
        ((com.moon.ot)(this.f)).a(((com.moon.ol)(new com.moon.oo(this))));
        ((com.moon.ot)(this.f)).a(((com.moon.ol)(new com.moon.on(this))));
        ((com.moon.ot)(this.f)).a(((com.moon.ol)(new com.moon.os(this))));
        ((com.moon.od)(this)).b();
        if ((life3_18 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw com.moon.od.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


public static com.moon.od a(com.moon.oe p0) {
return new com.moon.od(p0);
}


public com.moon.ov a__ov() {
return this.g;
}


public com.moon.ot a__ot() {
return this.f;
}


public com.moon.pE a__pE() {
return this.e;
}


private void lambda$queueReconnect$0() { __sourceHandlerCall_e5bb4814717f5efe5e1b(this); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_894d63a7b1c15fa7_originalDynamicSite1405_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3076_0() throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_5b7380e7aa7c_originalDynamicSite603_1(com.moon.od a0) throws E;
}
