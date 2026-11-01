package moom;


public class MC {

private java.util.Deque<moom.MB> a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long f;

public MC() {
super();
    this.a = new java.util.ArrayDeque();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-6788144128755427092L)), ((long)(6157922876865178524L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42524852608882L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.MC.b ^ 57815260370223L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill689_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill689_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill689_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill689_14 = new byte[8];
    (__sourceSpill689_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill689_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation689_16 = __sourceSpill689_14;
    ((javax.crypto.Cipher)(__sourceSpill689_11)).init(((int)(__sourceSpill689_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill689_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation689_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[2];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "!àDgÛÁùm?aÅLY\"\027Ú·ÿõ¤FÃ±CZoéâ¸Á½\020o³¨¿ÔT¸ÙM(ÒæÉñÉ9>è\005ÍÁôçk!|\023ó²>¨ÿi)8¿Øþ\031K8\002}"))).length();
    int local10_life24 = 48;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill689_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill689_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill689_29)).doFinal(((byte[])(__sourceSpill689_28)));
        java.lang.String __sourceSpill689_34 = ((java.lang.String)(moom.MC.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill689_35 = local14_life19;
        int __sourceSpill689_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill689_35)[__sourceSpill689_36] = __sourceSpill689_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    c = ((java.lang.String[])(local14_life19));
    d = ((java.lang.String[])(new java.lang.String[2]));
    javax.crypto.Cipher local0_life41;
    javax.crypto.Cipher __sourceSpill689_43 = (local0_life41 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill689_44 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill689_45 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill689_46 = new byte[8];
    (__sourceSpill689_46)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life47 = 1;
    while ((local1_life47 < 8)) {
        (__sourceSpill689_46)[local1_life47] = ((byte) ((int) ((local5_life7 << (local1_life47 * 8)) >>> 56)));
        local1_life47 += 1;
    }
    byte[] __sourcePreallocation689_48 = __sourceSpill689_46;
    ((javax.crypto.Cipher)(__sourceSpill689_43)).init(((int)(__sourceSpill689_44)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill689_45)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation689_48)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life51 = -1034937092359573386L;
    byte[] __sourceSpill689_52 = new byte[8];
    (__sourceSpill689_52)[0] = ((byte) ((int) (local2_life51 >>> 56)));
    (__sourceSpill689_52)[1] = ((byte) ((int) (local2_life51 >>> 48)));
    (__sourceSpill689_52)[2] = ((byte) ((int) (local2_life51 >>> 40)));
    (__sourceSpill689_52)[3] = ((byte) ((int) (local2_life51 >>> 32)));
    (__sourceSpill689_52)[4] = ((byte) ((int) (local2_life51 >>> 24)));
    (__sourceSpill689_52)[5] = ((byte) ((int) (local2_life51 >>> 16)));
    (__sourceSpill689_52)[6] = ((byte) ((int) (local2_life51 >>> 8)));
    (__sourceSpill689_52)[7] = ((byte) ((int) local2_life51));
    javax.crypto.Cipher __sourceSpill689_53 = local0_life41;
    byte[] local4_life55 = ((javax.crypto.Cipher)(__sourceSpill689_53)).doFinal(((byte[])(__sourceSpill689_52)));
    f = ((long)((((((((((((long) (local4_life55)[0]) & 255L) << 56) | ((((long) (local4_life55)[1]) & 255L) << 48)) | ((((long) (local4_life55)[2]) & 255L) << 40)) | ((((long) (local4_life55)[3]) & 255L) << 32)) | ((((long) (local4_life55)[4]) & 255L) << 24)) | ((((long) (local4_life55)[5]) & 255L) << 16)) | ((((long) (local4_life55)[6]) & 255L) << 8)) | (((long) (local4_life55)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceHandlerCall_d3567d30a8fcc3baf4ef(moom.MC a0, moom.MB a1) throws E;
private static final class __SourceHandler_d3567d30a8fcc3baf4ef {

public static void f35(moom.MC receiver, moom.MB p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead35_0() ^ 77690826168381L);
    __call35_2(__fieldRead35_1(receiver), p0);
    if ((__call35_4(__fieldRead35_3(receiver)) > ((int) __fieldRead35_5()))) {
        java.lang.Object __inlineStack35_9Token;
        throw new java.lang.RuntimeException(__invokedynamic35_10(__inlineStack35_9Output0((__inlineStack35_9Token = __inlineStack35_9Pack(__call35_7(__fieldRead35_6(receiver)), __invokedynamic35_8(18333, (287033433750866037L ^ life2_3))))), __inlineStack35_9Output1(__inlineStack35_9Token)));
    }
    return;
}
private static native long __fieldRead35_0() throws Throwable;
private static native java.util.Deque __fieldRead35_1(moom.MC a0) throws Throwable;
private static native void __call35_2(java.util.Deque a0, moom.MB a1) throws Throwable;
private static native java.util.Deque __fieldRead35_3(moom.MC a0) throws Throwable;
private static native int __call35_4(java.util.Deque a0) throws Throwable;
private static native long __fieldRead35_5() throws Throwable;
private static native java.util.Deque __fieldRead35_6(moom.MC a0) throws Throwable;
private static native int __call35_7(java.util.Deque a0) throws Throwable;
private static native java.lang.String __invokedynamic35_8(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack35_9Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack35_9Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack35_9Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic35_10(java.lang.String a0, int a1) throws Throwable;

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
        byte[] spill3132_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3132_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3132_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3132_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3132_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3132_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27835);
    if (((moom.MC.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.MC.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.MC.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/MC", life9_51);
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
        life9_116 = ((java.lang.String)((moom.MC.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.MC.d)[life5_8] = moom.MC.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.MC.d)[life5_8];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6078_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.MC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public moom.MB a() {
java.lang.Object forwardValue2657_24_0;
    java.util.Deque spill2657_0;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_21: {
    life1_3 = (moom.MC.b ^ 53992457013965L);
    life3_5 = moom.MS.c();
    spill2657_0 = this.a;
    if (!((life3_5 != 0))) {
        forwardValue2657_24_0 = spill2657_0;
        break forward_join_24;
    }
    if (!(((java.util.Deque)(spill2657_0)).isEmpty())) {
        break forward_join_21;
    }
    throw new java.lang.RuntimeException(__sourceIntrinsic_41ec846a4f12_invokedynamic2657_4(25390, (4968312743619771959L ^ life1_3)));
    }
    forwardValue2657_24_0 = ((java.util.Deque)(this.a)).pollLast();
    }
    return ((moom.MB)(forwardValue2657_24_0));
}


public void a(moom.MB p0) { __sourceHandlerCall_d3567d30a8fcc3baf4ef(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41ec846a4f12_invokedynamic2657_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6078_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f37b106077f9_invokedynamic35_8(int a0, long a1) throws E;
}
