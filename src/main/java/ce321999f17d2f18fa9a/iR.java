package com.moon;


public class iR extends com.moon.iw {

private com.moon.iU k;

private static int l;

private static long m;

private static java.lang.String[] n;

private static java.lang.String[] o;

private static java.util.Map p;

public iR() { super(); }


private static void __sourceConstructorBody_897994ad0adc6858(com.moon.iR receiver) throws Throwable {

long local1 = (com.moon.iR.m ^ 120810181698657L);

    com.moon.iR.__sourceConstructorInit_897994ad0adc6858_0(((com.moon.iR)(receiver)));

    ((com.moon.iR)(receiver)).k = ((com.moon.iU)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(com.moon.iU.a__iV())).a(((java.lang.Class)(com.moon.i7.class))))).a(((java.lang.String)(__sourceIntrinsic_897994ad0adc6858_originalDynamicSite1033_5(24997, (7858192002946404626L ^ local1))))))).c(((java.lang.String)(__sourceIntrinsic_897994ad0adc6858_originalDynamicSite1033_7(20120, (3962458802421808685L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_897994ad0adc6858_originalDynamicSite1033_9(20120, (3962458802421808685L ^ local1))))))).a()));

    return;

}



static {
m = ((long)(((moom._a)(moom._c.a(((long)(2262574779292135362L)), ((long)(-8612611833511738699L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(240257096638277L)))));
    int __sourceSpill166_6 = 0;
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life8 = (com.moon.iR.m ^ 71759257518744L);
    com.moon.iR.b(((int)(__sourceSpill166_6)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill166_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill166_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill166_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill166_16 = new byte[8];
    (__sourceSpill166_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill166_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation166_18 = __sourceSpill166_16;
    ((javax.crypto.Cipher)(__sourceSpill166_13)).init(((int)(__sourceSpill166_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill166_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation166_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life21 = new java.lang.String[3];
    int local7_life22 = 0;
    java.lang.String local6_life23;
    int local8_life25 = ((java.lang.String)((local6_life23 = "ì+øJ¹\023;­Mýy³p\020ybdÕºýèm§\\Õ1výö\020\030å¦\004 \020Zùv\013ööÕíê"))).length();
    int local5_life26 = 16;
    int local4_life27 = -1;
    while (true) {
        local4_life27 += 1;
        byte[] __sourceSpill166_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill166_31 = local2_life11;
        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill166_31)).doFinal(((byte[])(__sourceSpill166_30)));
        java.lang.String __sourceSpill166_36 = ((java.lang.String)(com.moon.iR.b(((byte[])(local10_life33))))).intern();
        java.lang.String[] __sourceSpill166_37 = local9_life21;
        int __sourceSpill166_38 = local7_life22;
        local7_life22 += 1;
        (__sourceSpill166_37)[__sourceSpill166_38] = __sourceSpill166_36;
        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }
        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));
    }
    n = ((java.lang.String[])(local9_life21));
    o = ((java.lang.String[])(new java.lang.String[3]));
}

private static native <E extends Throwable> void __sourceConstructorInit_897994ad0adc6858_0(com.moon.iR a0) throws E;

private static java.lang.String b(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18280);
    if (((com.moon.iR.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.iR.p)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.iR.p)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/iR", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.iR.n)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.iR.o)[life5_8] = com.moon.iR.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.iR.o)[life5_8];
}


private static moom.Oo b(moom.Oo p0) {
return p0;
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
        byte[] spill607_0 = p0;
        life4_9 += 1;
        life5_44 = (spill607_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill607_1 = p0;
        life4_9 += 1;
        life5_76 = (spill607_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill607_2 = p0;
        life4_9 += 1;
        life5_91 = (spill607_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1631_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.iR.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b__Void() {
long life1_3;
    int life4_13;
    int life3_18;
    life1_3 = (com.moon.iR.m ^ 52442592850758L);
    life4_13 = org.lwjgl.opengl.GL20.glGetUniformLocation(((int)(((com.moon.jD)(this.g)).a())), ((java.lang.CharSequence)(__sourceIntrinsic_9bf881b104f5_invokedynamic413_3(20937, (48123795001620058L ^ life1_3)))));
    int spill413_0 = __sourceExactCall_07c875d17e3cdd();
    org.lwjgl.opengl.GL20.glUniform1i(((int)(life4_13)), ((int)(0)));
    life3_18 = spill413_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        life3_18 += 1;
        com.moon.iR.b(((int)(life3_18)));
    }
    return;
}


public static void b(int p0) {
l = ((int)(p0));
    return;
}


public static int b__sourceReturn_8abf5c6871() {
int local0 = __sourceExactCall_e7f64e3c1dea4a();
    if ((local0 == 0)) {
        return 96;
    }
    return 0;
}


protected void c__Void() {
return;
}


public com.moon.iU a__iU() {
return this.k;
}


public static int a__sourceReturn_8abf5c6871() {
return com.moon.iR.l;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_897994ad0adc6858_originalDynamicSite1033_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_897994ad0adc6858_originalDynamicSite1033_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_897994ad0adc6858_originalDynamicSite1033_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1631_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9bf881b104f5_invokedynamic413_3(int a0, long a1) throws E;

private static native int __sourceExactCall_07c875d17e3cdd();
private static native int __sourceExactCall_e7f64e3c1dea4a();
}
