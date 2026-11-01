package com.moon;


public class c5 extends com.moon.c0 {

private com.moon.dl g;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] k;

private static java.util.Map o;

private static long p;

public c5(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String[])null); }


private static void __sourceConstructorBody_332747a9187f74af(com.moon.c5 receiver, java.lang.String p0, java.lang.String p1, java.lang.String[] p2) throws Throwable {

long local4 = (com.moon.c5.h ^ 123157859761714L);

    com.moon.c5.__sourceConstructorInit_332747a9187f74af_0(((com.moon.c5)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String[])(p2)));

    ((com.moon.c5)(receiver)).g = ((com.moon.dl)(((com.moon.dl)(((com.moon.dn)(((com.moon.dn)(((com.moon.dn)(((com.moon.du)(com.moon.dl.a__du())).a(((java.lang.String)(__sourceIntrinsic_332747a9187f74af_originalDynamicSite714_3(4731, (4635418700869439081L ^ local4))))))).b(((java.lang.String)(__sourceIntrinsic_332747a9187f74af_originalDynamicSite714_5(19055, (4223983808372004478L ^ local4))))))).a__dn())).a()))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_332747a9187f74af_0(com.moon.c5 a0, java.lang.String a1, java.lang.String a2, java.lang.String[] a3) throws E;

static {
h = ((long)(((moom._a)(moom._c.a(((long)(-2741203908831749807L)), ((long)(-7309006541382576948L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(42732520010761L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (com.moon.c5.h ^ 72812499643323L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill37_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill37_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill37_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill37_14 = new byte[8];
    (__sourceSpill37_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill37_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation37_16 = __sourceSpill37_14;
    ((javax.crypto.Cipher)(__sourceSpill37_11)).init(((int)(__sourceSpill37_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill37_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation37_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[4];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "ÀC)\007ï\021L\034\f`ã\037\037q\0202\\H\027.¸D\020Ñ·\033µÒ!"))).length();
    int local10_life24 = 16;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill37_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill37_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill37_29)).doFinal(((byte[])(__sourceSpill37_28)));
        java.lang.String __sourceSpill37_34 = ((java.lang.String)(com.moon.c5.b(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill37_35 = local14_life19;
        int __sourceSpill37_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill37_35)[__sourceSpill37_36] = __sourceSpill37_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "ÝªÌU\006vÿ\035^(Æ*Ï\032Kû£U(¹\006\003ÍfÝtûL\023»\021\007¥Ì\033ÉómÂíNc^%¤PS¥?É\0205ª¶\\ÍHÄ1Å;S±üLôf@¾Y\033@äòô\002`\006]Q\t¬k%:B\037Ä\025®â3\\JÙ½e8Ð\007ü7\025íÇÉ&ôUÛ\t¨ð\007\177Æ£áÒ\026¹Gù¯8ñ"))).length();
    local10_life24 = 72;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill37_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill37_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill37_42)).doFinal(((byte[])(__sourceSpill37_41)));
        java.lang.String __sourceSpill37_47 = ((java.lang.String)(com.moon.c5.b(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill37_48 = local14_life19;
        int __sourceSpill37_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill37_48)[__sourceSpill37_49] = __sourceSpill37_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    i = ((java.lang.String[])(local14_life19));
    k = ((java.lang.String[])(new java.lang.String[4]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill37_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill37_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill37_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill37_59 = new byte[8];
    (__sourceSpill37_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill37_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation37_61 = __sourceSpill37_59;
    ((javax.crypto.Cipher)(__sourceSpill37_56)).init(((int)(__sourceSpill37_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill37_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation37_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -5087614180974925567L;
    byte[] __sourceSpill37_65 = new byte[8];
    (__sourceSpill37_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill37_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill37_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill37_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill37_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill37_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill37_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill37_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill37_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill37_66)).doFinal(((byte[])(__sourceSpill37_65)));
    p = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral748_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.c5.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String b(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29607);
    if (((com.moon.c5.k)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.c5.o)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c5.o)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/c5", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.c5.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.c5.k)[life5_8] = com.moon.c5.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.c5.k)[life5_8];
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill102_0 = p0;
        life4_9 += 1;
        life5_44 = (spill102_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill102_1 = p0;
        life4_9 += 1;
        life5_76 = (spill102_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill102_2 = p0;
        life4_9 += 1;
        life5_91 = (spill102_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.dc a() {
com.moon.module.Module forwardValue24_18_0;
    int forwardValue24_18_1;
    com.moon.module.Module forwardValue24_19_0;
    com.moon.module.Module forwardValue24_20_0;
    int forwardValue24_20_1;
    int spill24_0;
    com.moon.module.Module spill24_1;
    boolean spill24_2;
    com.moon.hD spill24_3;
    com.moon.hB spill24_4;
    long life1_3;
    com.moon.module.Module life4_9;
    int life3_10;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (com.moon.c5.h ^ 1490138844722L);
    spill24_0 = com.moon.aW.c();
    life4_9 = ((com.moon.module.Module)(((com.moon.dl)(this.g)).a__Object()));
    life3_10 = spill24_0;
    spill24_1 = life4_9;
    spill24_2 = ((com.moon.module.Module)(life4_9)).isHidden();
    if (!((life3_10 != 0))) {
        forwardValue24_18_0 = spill24_1;
        forwardValue24_18_1 = ((spill24_2) ? 1 : 0);
        break forward_join_18;
    }
    if (!((!spill24_2))) {
        forwardValue24_19_0 = spill24_1;
        break forward_join_19;
    }
    forwardValue24_18_0 = spill24_1;
    forwardValue24_18_1 = 1;
    }
    forwardValue24_20_0 = forwardValue24_18_0;
    forwardValue24_20_1 = forwardValue24_18_1;
    break forward_join_20;
    }
    forwardValue24_20_0 = forwardValue24_19_0;
    forwardValue24_20_1 = 0;
    }
    ((com.moon.module.Module)(forwardValue24_20_0)).setHidden(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue24_20_1))));
    spill24_3 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD();
    spill24_4 = ((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic24_11(10834, (1504248431328953921L ^ life1_3)))));
    java.lang.String __stackOp24_15_0 = ((com.moon.module.Module)(life4_9)).getName();
    java.lang.String __stackOp24_15_1 = __sourceIntrinsic_02ebfbfb2bd5_invokedynamic24_14(21530, (4927764667314698250L ^ life1_3));
    ((com.moon.hD)(spill24_3)).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(spill24_4)).b(((java.lang.String)(__sourceIntrinsic_02ebfbfb2bd5_invokedynamic24_16(__stackOp24_15_1, __stackOp24_15_0, "!")))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(com.moon.c5.p))))).a())));
    return ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_332747a9187f74af_originalDynamicSite714_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_332747a9187f74af_originalDynamicSite714_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral748_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic24_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic24_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_02ebfbfb2bd5_invokedynamic24_16(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
