package com.moon;


class pC extends java.util.HashMap<com.moon.cj, com.moon.nY> {

com.moon.pj a;

private static long b;

private static long[] c;

private static java.lang.Long[] d;

private static java.util.Map e;

pC(com.moon.pj p0) { super(); }


private static void __sourceConstructorBody_fe20be545d36724d(com.moon.pC receiver, com.moon.pj p0) throws Throwable {

long local2 = (com.moon.pC.b ^ 52758059762008L);

    ((com.moon.pC)(receiver)).a = ((com.moon.pj)(p0));

    com.moon.pC.__sourceConstructorInit_fe20be545d36724d_0(((com.moon.pC)(receiver)));

    ((com.moon.pC)(receiver)).put(((com.moon.cj.LINEAR)), ((new com.moon.nY(__sourceIntrinsic_fe20be545d36724d_originalDynamicSite965_4(8836, (3877774997030074461L ^ local2)), com.moon.cj.LINEAR))));

    ((com.moon.pC)(receiver)).put(((com.moon.cj.EASE_OUT_BACK)), ((new com.moon.nY(__sourceIntrinsic_fe20be545d36724d_originalDynamicSite965_8(10031, (3133437540523146741L ^ local2)), com.moon.cj.EASE_OUT_BACK))));

    ((com.moon.pC)(receiver)).put(((com.moon.cj.EASE_IN_BACK)), ((new com.moon.nY(__sourceIntrinsic_fe20be545d36724d_originalDynamicSite965_12(24711, (4974119619835869788L ^ local2)), com.moon.cj.EASE_IN_BACK))));

    return;

}



static {
b = ((long)(((moom._a)(moom._c.a(((long)(-1246571957282230183L)), ((long)(8793637957076843008L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(200378175883096L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.pC.b ^ 71750081849562L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill347_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill347_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill347_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill347_14 = new byte[8];
    (__sourceSpill347_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill347_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation347_16 = __sourceSpill347_14;
    ((javax.crypto.Cipher)(__sourceSpill347_11)).init(((int)(__sourceSpill347_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill347_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation347_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\007ã\"Àé6¸ÒíÌY?\000\037¦g¯Ú²ÊÌ\030_"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill347_25 = local6_life21;
        int __sourceSpill347_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill347_25)).substring(((int)(__sourceSpill347_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill347_30 = local8_life19;
        int __sourceSpill347_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill347_33 = new byte[8];
        (__sourceSpill347_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill347_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill347_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill347_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill347_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill347_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill347_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill347_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill347_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill347_34)).doFinal(((byte[])(__sourceSpill347_33)));
        (__sourceSpill347_30)[__sourceSpill347_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Long[])(new java.lang.Long[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_fe20be545d36724d_0(com.moon.pC a0) throws E;

private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.pC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3133_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7356);
    if (((com.moon.pC.d)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.pC.c)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.pC.e)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pC.e)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/pC", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.pC.d)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.pC.d)[life3_8])).longValue();
}


private static native <E extends Throwable> long __sourceIntrinsic_fe20be545d36724d_originalDynamicSite965_4(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fe20be545d36724d_originalDynamicSite965_8(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fe20be545d36724d_originalDynamicSite965_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3133_0() throws E;
}
