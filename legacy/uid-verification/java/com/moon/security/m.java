package com.moon.security;


public class m {

private static int[] b;

private static long a;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long f;

public m() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(5025113343335212409L)), ((long)(5455862217720202876L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(248604180494L)))));
    int[] __sourceSpill456_6 = new int[2];
    e = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.security.m.b(((int[])(__sourceSpill456_6)));
    long local5_life9 = (com.moon.security.m.a ^ 114191596673921L);
    javax.crypto.Cipher local7_life11;
    javax.crypto.Cipher __sourceSpill456_13 = (local7_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill456_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill456_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill456_16 = new byte[8];
    (__sourceSpill456_16)[0] = ((byte) ((int) (local5_life9 >>> 56)));
    int local8_life17 = 1;
    while ((local8_life17 < 8)) {
        (__sourceSpill456_16)[local8_life17] = ((byte) ((int) ((local5_life9 << (local8_life17 * 8)) >>> 56)));
        local8_life17 += 1;
    }
    byte[] __sourcePreallocation456_18 = __sourceSpill456_16;
    ((javax.crypto.Cipher)(__sourceSpill456_13)).init(((int)(__sourceSpill456_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill456_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation456_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life21 = new java.lang.String[3];
    int local12_life22 = 0;
    java.lang.String local11_life23;
    int local13_life25 = ((java.lang.String)((local11_life23 = "©Ëu Ì¢y\003`}¹±]\020wäz.¤~\001þV9ï;b/\021\020-Ï\023âiHTôªi"))).length();
    int local10_life26 = 16;
    int local9_life27 = -1;
    while (true) {
        local9_life27 += 1;
        byte[] __sourceSpill456_30 = ((java.lang.String)(((java.lang.String)(local11_life23)).substring(((int)(local9_life27)), ((int)((local9_life27 + local10_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill456_31 = local7_life11;
        byte[] local15_life33 = ((javax.crypto.Cipher)(__sourceSpill456_31)).doFinal(((byte[])(__sourceSpill456_30)));
        java.lang.String __sourceSpill456_36 = ((java.lang.String)(com.moon.security.m.a(((byte[])(local15_life33))))).intern();
        java.lang.String[] __sourceSpill456_37 = local14_life21;
        int __sourceSpill456_38 = local12_life22;
        local12_life22 += 1;
        (__sourceSpill456_37)[__sourceSpill456_38] = __sourceSpill456_36;
        if (!(((local9_life27 = (local9_life27 + local10_life26)) < local13_life25))) { break; }
        local10_life26 = ((java.lang.String)(local11_life23)).charAt(((int)(local9_life27)));
    }
    c = ((java.lang.String[])(local14_life21));
    d = ((java.lang.String[])(new java.lang.String[3]));
    javax.crypto.Cipher local0_life43;
    javax.crypto.Cipher __sourceSpill456_45 = (local0_life43 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill456_46 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill456_47 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill456_48 = new byte[8];
    (__sourceSpill456_48)[0] = ((byte) ((int) (local5_life9 >>> 56)));
    int local1_life49 = 1;
    while ((local1_life49 < 8)) {
        (__sourceSpill456_48)[local1_life49] = ((byte) ((int) ((local5_life9 << (local1_life49 * 8)) >>> 56)));
        local1_life49 += 1;
    }
    byte[] __sourcePreallocation456_50 = __sourceSpill456_48;
    ((javax.crypto.Cipher)(__sourceSpill456_45)).init(((int)(__sourceSpill456_46)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill456_47)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation456_50)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life53 = -5605066909782023718L;
    byte[] __sourceSpill456_54 = new byte[8];
    (__sourceSpill456_54)[0] = ((byte) ((int) (local2_life53 >>> 56)));
    (__sourceSpill456_54)[1] = ((byte) ((int) (local2_life53 >>> 48)));
    (__sourceSpill456_54)[2] = ((byte) ((int) (local2_life53 >>> 40)));
    (__sourceSpill456_54)[3] = ((byte) ((int) (local2_life53 >>> 32)));
    (__sourceSpill456_54)[4] = ((byte) ((int) (local2_life53 >>> 24)));
    (__sourceSpill456_54)[5] = ((byte) ((int) (local2_life53 >>> 16)));
    (__sourceSpill456_54)[6] = ((byte) ((int) (local2_life53 >>> 8)));
    (__sourceSpill456_54)[7] = ((byte) ((int) local2_life53));
    javax.crypto.Cipher __sourceSpill456_55 = local0_life43;
    byte[] local4_life57 = ((javax.crypto.Cipher)(__sourceSpill456_55)).doFinal(((byte[])(__sourceSpill456_54)));
    f = ((long)((((((((((((long) (local4_life57)[0]) & 255L) << 56) | ((((long) (local4_life57)[1]) & 255L) << 48)) | ((((long) (local4_life57)[2]) & 255L) << 40)) | ((((long) (local4_life57)[3]) & 255L) << 32)) | ((((long) (local4_life57)[4]) & 255L) << 24)) | ((((long) (local4_life57)[5]) & 255L) << 16)) | ((((long) (local4_life57)[6]) & 255L) << 8)) | (((long) (local4_life57)[7]) & 255L))));
}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_53cd18fb261d6363b71e(java.nio.file.Path a0) throws E;
private static final class __SourceHandler_53cd18fb261d6363b71e {

public static java.lang.String f83(java.nio.file.Path p0) throws Throwable {
    long life1_3;
    java.security.MessageDigest life3_10;
    life1_3 = (__fieldRead83_0() ^ 118355643363008L);
    life3_10 = __call83_2(__invokedynamic83_1(29495, (7745128892531909663L ^ life1_3)));
    java.lang.String spill83_0 = __invokedynamic83_3(14139, (4220195507287187474L ^ life1_3));
    java.lang.Object[] __stackOp83_4_0 = new java.lang.Object[1];
    java.lang.Object[] spill83_1 = __stackOp83_4_0;
    (__stackOp83_4_0)[0] = new java.math.BigInteger(1, __call83_6(life3_10, __call83_5(p0)));
    return __call83_7(spill83_0, spill83_1);
}
public static java.lang.String h83_0(java.lang.Exception p0, long p1) throws Throwable {
    java.lang.Exception local3 = p0;
    int spill2008300_0 = 22970;
    __call2008300_0(local3);
    return __invokedynamic2008300_1(spill2008300_0, (5121896649845214864L ^ p1));
}
private static native long __fieldRead83_0() throws Throwable;
private static native java.lang.String __invokedynamic83_1(int a0, long a1) throws Throwable;
private static native java.security.MessageDigest __call83_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic83_3(int a0, long a1) throws Throwable;
private static native byte[] __call83_5(java.nio.file.Path a0) throws Throwable;
private static native byte[] __call83_6(java.security.MessageDigest a0, byte[] a1) throws Throwable;
private static native java.lang.String __call83_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call2008300_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2008300_1(int a0, long a1) throws Throwable;

}


public static int[] b() {
return com.moon.security.m.b;
}


public static void b(int[] p0) {
b = ((int[])(p0));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.security.m.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 11613);
    if (((com.moon.security.m.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.security.m.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.security.m.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/security/m", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.security.m.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.security.m.d)[life5_8] = com.moon.security.m.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.security.m.d)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3563_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/security/m"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill1720_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1720_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1720_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1720_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1720_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1720_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public static long a(java.nio.file.Path p0) {
long local1 = (com.moon.security.m.a ^ 56474799705272L);
    try {
        java.nio.channels.FileChannel local3 = java.nio.channels.FileChannel.open(((java.nio.file.Path)(p0)), ((java.nio.file.OpenOption[])(new java.nio.file.OpenOption[0])));
        return ((java.nio.channels.FileChannel)(local3)).size();
    } catch (java.io.IOException caught3) {
        ((java.io.IOException)(caught3)).printStackTrace();
        return com.moon.security.m.f;
    }
}


public static java.lang.String a__String(java.nio.file.Path p0) { return __sourceHandlerCall_53cd18fb261d6363b71e(p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3563_0() throws E;
}
