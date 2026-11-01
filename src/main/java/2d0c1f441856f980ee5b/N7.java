package moom;


class N7 implements moom.N1 {

private boolean a;

java.lang.reflect.Method b;

java.lang.Object c;

private static long d;

private static java.lang.String e;

private static long[] f;

private static java.lang.Long[] g;

private static java.util.Map h;

N7(java.lang.reflect.Method p0, java.lang.Object p1) { super(); }

private static void __sourceConstructorBody_3d29312fe332453d(moom.N7 receiver, java.lang.reflect.Method p0, java.lang.Object p1) throws Throwable {
((moom.N7)(receiver)).b = ((java.lang.reflect.Method)(p0));
    ((moom.N7)(receiver)).c = ((java.lang.Object)(p1));
    moom.N7.__sourceConstructorInit_3d29312fe332453d_0(((moom.N7)(receiver)));
    ((moom.N7)(receiver)).a = ((boolean)(false));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(5609143235732499757L)), ((long)(4661710682876816992L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(137493527404556L)))));
    long local11_life6 = (moom.N7.d ^ 63241704434430L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill718_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill718_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill718_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill718_13 = new byte[8];
    (__sourceSpill718_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill718_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation718_15 = __sourceSpill718_13;
    ((javax.crypto.Cipher)(__sourceSpill718_10)).init(((int)(__sourceSpill718_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill718_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation718_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill718_19 = ((java.lang.String)("òàÝ­\177Ç")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill718_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill718_20)).doFinal(((byte[])(__sourceSpill718_19)));
    e = ((java.lang.String)(((java.lang.String)(moom.N7.a(((byte[])(local15_life22))))).intern()));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill718_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill718_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill718_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill718_33 = new byte[8];
    (__sourceSpill718_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill718_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation718_35 = __sourceSpill718_33;
    ((javax.crypto.Cipher)(__sourceSpill718_30)).init(((int)(__sourceSpill718_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill718_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation718_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[2];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "V³øÐÀ¶Ás\006ù\016Î¥"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill718_44 = local4_life40;
        int __sourceSpill718_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill718_44)).substring(((int)(__sourceSpill718_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill718_49 = local6_life38;
        int __sourceSpill718_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill718_52 = new byte[8];
        (__sourceSpill718_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill718_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill718_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill718_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill718_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill718_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill718_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill718_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill718_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill718_53)).doFinal(((byte[])(__sourceSpill718_52)));
        (__sourceSpill718_49)[__sourceSpill718_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    f = ((long[])(local6_life38));
    g = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3d29312fe332453d_0(moom.N7 a0) throws E;
private static native <E extends Throwable> long __sourceHandlerCall_16ba2f94d4e452eee1bb(moom.N7 a0) throws E;
private static final class __SourceHandler_16ba2f94d4e452eee1bb {

public static long f358(moom.N7 receiver) throws Throwable {
    java.lang.Object forwardValue358_24_0;
    moom.N7 spill358_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_17: {
    life1_3 = (__fieldRead358_0() ^ 87451586179232L);
    life3_5 = __call358_1();
    spill358_0 = receiver;
    if (!((life3_5 != 0))) {
        forwardValue358_24_0 = spill358_0;
        break forward_join_24;
    }
    if (!(__fieldRead358_2(spill358_0))) {
        break forward_join_17;
    }
    return __invokedynamic358_3(24033, (1817413563283191171L ^ life1_3));
    }
    forwardValue358_24_0 = __call358_6(__fieldRead358_4(receiver), __fieldRead358_5(receiver), new java.lang.Object[0]);
    }
    return __call358_8(__cast358_7(forwardValue358_24_0));
}
public static long h358_0(java.lang.Throwable p0) throws Throwable {
    throw __call2035800_0(p0);
}
public static long h358_1(java.lang.Throwable p0) throws Throwable {
    throw __call2035801_0(p0);
}
public static long h358_2(java.lang.Throwable p0, moom.N7 p1, long p2) throws Throwable {
    java.lang.Throwable local4 = p0;
    int spill2035802_0 = 7685;
    java.lang.String spill2035802_1 = __call2035802_1(__call2035802_0(local4));
    java.lang.String __stackOp2035802_4_0 = __call2035802_2(local4);
    java.lang.String __stackOp2035802_4_1 = __fieldRead2035802_3();
    __call2035802_6(__invokedynamic2035802_5(spill2035802_1, __stackOp2035802_4_1, __stackOp2035802_4_0));
    long spill2035802_2 = (5528014588779361894L ^ p2);
    __fieldWrite2035802_7(p1, 1);
    return __invokedynamic2035802_8(spill2035802_0, spill2035802_2);
}
private static native long __fieldRead358_0() throws Throwable;
private static native int __call358_1() throws Throwable;
private static native boolean __fieldRead358_2(moom.N7 a0) throws Throwable;
private static native long __invokedynamic358_3(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __fieldRead358_4(moom.N7 a0) throws Throwable;
private static native java.lang.Object __fieldRead358_5(moom.N7 a0) throws Throwable;
private static native java.lang.Object __call358_6(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Long __cast358_7(java.lang.Object a0) throws Throwable;
private static native long __call358_8(java.lang.Long a0) throws Throwable;
private static native java.lang.Throwable __call2035800_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2035801_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Class __call2035802_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __call2035802_1(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call2035802_2(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __fieldRead2035802_3() throws Throwable;
private static native java.lang.String __invokedynamic2035802_5(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call2035802_6(java.lang.String a0) throws Throwable;
private static native void __fieldWrite2035802_7(moom.N7 a0, int a1) throws Throwable;
private static native long __invokedynamic2035802_8(int a0, long a1) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6524_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/N7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.N7.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long a(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14556);
    if (((moom.N7.g)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.N7.f)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.N7.h)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.N7.h)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/N7", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.N7.g)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.N7.g)[life3_8])).longValue();
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
        byte[] spill3279_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3279_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3279_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3279_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3279_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3279_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public long a() { return __sourceHandlerCall_16ba2f94d4e452eee1bb(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6524_0() throws E;
}
