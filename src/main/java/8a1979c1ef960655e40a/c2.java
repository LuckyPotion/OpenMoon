package com.moon;


public class c2 extends com.moon.c0 {

private com.moon.dk g;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] k;

private static java.util.Map o;

public c2(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String[])null); }


private static void __sourceConstructorBody_065b0e8004a52cbc(com.moon.c2 receiver, java.lang.String p0, java.lang.String p1, java.lang.String[] p2) throws Throwable {

long local4 = (com.moon.c2.h ^ 88064329376804L);

    com.moon.c2.__sourceConstructorInit_065b0e8004a52cbc_0(((com.moon.c2)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String[])(p2)));

    ((com.moon.c2)(receiver)).g = ((com.moon.dk)(((com.moon.dk)(((com.moon.dn)(((com.moon.dn)(((com.moon.dn)(((com.moon.dt)(com.moon.dk.a__dt())).a(((java.lang.String)(__sourceIntrinsic_065b0e8004a52cbc_originalDynamicSite708_3(2842, (3661029907142576631L ^ local4))))))).b(((java.lang.String)(__sourceIntrinsic_065b0e8004a52cbc_originalDynamicSite708_5(19453, (6625621260537350417L ^ local4))))))).a__dn())).a()))));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_065b0e8004a52cbc_0(com.moon.c2 a0, java.lang.String a1, java.lang.String a2, java.lang.String[] a3) throws E;

static {
h = ((long)(((moom._a)(moom._c.a(((long)(-8990490102206435089L)), ((long)(6288340350845120316L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(237344013381301L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.c2.h ^ 33598276346127L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill34_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill34_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill34_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill34_14 = new byte[8];
    (__sourceSpill34_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill34_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation34_16 = __sourceSpill34_14;
    ((javax.crypto.Cipher)(__sourceSpill34_11)).init(((int)(__sourceSpill34_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill34_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation34_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[2];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "$bå¶È\013b\001(ÌnQ\021{§TÈ\031ù\fa&iË·ù@\017³\000\020Ä?hæ\026Â\035ÓY5Ptf¦O«;µÒ\027ÚÂîHÉw5¹c7nÎcÜÒ¸\002nÍN'nÛÙöá\020euð\032Tq³\005\r\033ôy\\"))).length();
    int local5_life24 = 88;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill34_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill34_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill34_29)).doFinal(((byte[])(__sourceSpill34_28)));
        java.lang.String __sourceSpill34_34 = ((java.lang.String)(com.moon.c2.b(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill34_35 = local9_life19;
        int __sourceSpill34_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill34_35)[__sourceSpill34_36] = __sourceSpill34_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    i = ((java.lang.String[])(local9_life19));
    k = ((java.lang.String[])(new java.lang.String[2]));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral733_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.c2.b(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25445);
    if (((com.moon.c2.k)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.c2.o)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c2.o)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/c2", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.c2.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.c2.k)[life5_8] = com.moon.c2.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.c2.k)[life5_8];
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
        byte[] spill97_0 = p0;
        life4_9 += 1;
        life5_44 = (spill97_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill97_1 = p0;
        life4_9 += 1;
        life5_76 = (spill97_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill97_2 = p0;
        life4_9 += 1;
        life5_91 = (spill97_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.dc a() {
((com.moon.oi)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__oi())).a(((java.lang.String)(((java.lang.String)(((com.moon.dk)(this.g)).a__Object())))));
    return ((com.moon.dd)(((com.moon.dd)(com.moon.dc.a())).a(((boolean)(true))))).a();
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_065b0e8004a52cbc_originalDynamicSite708_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_065b0e8004a52cbc_originalDynamicSite708_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral733_0() throws E;
}
