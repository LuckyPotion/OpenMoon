package com.moon;


public class ix extends com.moon.iw {

private com.moon.iU k;

private com.moon.jE l;

private com.moon.jE m;

private static java.lang.String n;

private static long o;

private static java.lang.String[] p;

private static java.lang.String[] q;

private static java.util.Map r;

public ix() { super(); }


private static void __sourceConstructorBody_4c38e60cc31647d8(com.moon.ix receiver) throws Throwable {

long local1 = (com.moon.ix.o ^ 120790411537177L);

    com.moon.ix.__sourceConstructorInit_4c38e60cc31647d8_0(((com.moon.ix)(receiver)));

    ((com.moon.ix)(receiver)).k = ((com.moon.iU)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(((com.moon.iV)(com.moon.iU.a__iV())).a(((java.lang.String)(__sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_3(19499, (959175806022469778L ^ local1))))))).c(((java.lang.String)(__sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_5(12141, (8370462546828798935L ^ local1))))))).b(((java.lang.String)(__sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_7(12141, (8370462546828798935L ^ local1))))))).a()));

    ((com.moon.ix)(receiver)).l = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_12(21319, (622893030217471999L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_14(receiver)))))).a()));

    ((com.moon.ix)(receiver)).m = ((com.moon.jE)(((com.moon.jF)(((com.moon.jF)(((com.moon.jF)(com.moon.jE.a__jF())).a(((java.lang.String)(__sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_19(13229, (1098070656612972310L ^ local1))))))).a(((java.util.function.Supplier)(__sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_21(receiver)))))).a()));

    return;

}



static {
o = ((long)(((moom._a)(moom._c.a(((long)(-5603563921787798504L)), ((long)(7978949252240746413L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(239462529099918L)))));

    r = ((java.util.Map)(new java.util.HashMap(13)));

    java.lang.String __sourceSpill254_7 = "sW4sDc";

    long local0_life8 = (com.moon.ix.o ^ 37064164647821L);

    com.moon.ix.b(((java.lang.String)(__sourceSpill254_7)));

    javax.crypto.Cipher local2_life11;

    javax.crypto.Cipher __sourceSpill254_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));

    int __sourceSpill254_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill254_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill254_16 = new byte[8];

    (__sourceSpill254_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));

    int local3_life17 = 1;

    while ((local3_life17 < 8)) {

        (__sourceSpill254_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));

        local3_life17 += 1;

    }

    byte[] __sourcePreallocation254_18 = __sourceSpill254_16;

    ((javax.crypto.Cipher)(__sourceSpill254_13)).init(((int)(__sourceSpill254_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill254_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation254_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    java.lang.String[] local9_life21 = new java.lang.String[4];

    int local7_life22 = 0;

    java.lang.String local6_life23;

    int local8_life25 = ((java.lang.String)((local6_life23 = "Í\017±¢µ\tfßQ\030§\023È\032rýo×¯ÿ¡lmÒÐ\030Qü¶O\nIÚ \017R¾óX'UÐ\013ù_Èé"))).length();

    int local5_life26 = 32;

    int local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill254_30 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill254_31 = local2_life11;

        byte[] local10_life33 = ((javax.crypto.Cipher)(__sourceSpill254_31)).doFinal(((byte[])(__sourceSpill254_30)));

        java.lang.String __sourceSpill254_36 = ((java.lang.String)(com.moon.ix.b(((byte[])(local10_life33))))).intern();

        java.lang.String[] __sourceSpill254_37 = local9_life21;

        int __sourceSpill254_38 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill254_37)[__sourceSpill254_38] = __sourceSpill254_36;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    local8_life25 = ((java.lang.String)((local6_life23 = "ONþ<\031âÌÍs'\fë¡\0051ö\b¿µñÂËg\033?y\020\003\003ß}ø\004Yp\ra\177q"))).length();

    local5_life26 = 32;

    local4_life27 = -1;

    while (true) {

        local4_life27 += 1;

        byte[] __sourceSpill254_44 = ((java.lang.String)(((java.lang.String)(local6_life23)).substring(((int)(local4_life27)), ((int)((local4_life27 + local5_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));

        javax.crypto.Cipher __sourceSpill254_45 = local2_life11;

        byte[] local10_life47 = ((javax.crypto.Cipher)(__sourceSpill254_45)).doFinal(((byte[])(__sourceSpill254_44)));

        java.lang.String __sourceSpill254_50 = ((java.lang.String)(com.moon.ix.b(((byte[])(local10_life47))))).intern();

        java.lang.String[] __sourceSpill254_51 = local9_life21;

        int __sourceSpill254_52 = local7_life22;

        local7_life22 += 1;

        (__sourceSpill254_51)[__sourceSpill254_52] = __sourceSpill254_50;

        if (!(((local4_life27 = (local4_life27 + local5_life26)) < local8_life25))) { break; }

        local5_life26 = ((java.lang.String)(local6_life23)).charAt(((int)(local4_life27)));

    }

    p = ((java.lang.String[])(local9_life21));

    q = ((java.lang.String[])(new java.lang.String[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_4c38e60cc31647d8_0(com.moon.ix a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


public static void b(java.lang.String p0) {
n = ((java.lang.String)(p0));
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1698_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ix"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill637_0 = p0;
        life4_9 += 1;
        life5_44 = (spill637_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill637_1 = p0;
        life4_9 += 1;
        life5_76 = (spill637_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill637_2 = p0;
        life4_9 += 1;
        life5_91 = (spill637_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 582);
    if (((com.moon.ix.q)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.ix.r)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.ix.r)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ix", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.ix.p)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.ix.q)[life5_8] = com.moon.ix.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.ix.q)[life5_8];
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.ix.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b__Void() {
long local1 = (com.moon.ix.o ^ 81665248742686L);
    java.lang.String spill1461_0 = com.moon.ix.a__String();
    ((com.moon.jE)(this.l)).a__Void();
    ((com.moon.jE)(this.m)).a__Void();
    java.lang.String local3 = spill1461_0;
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.ix.b(((java.lang.String)("jERmLc")));
    }
    return;
}


protected void c__Void() {
return;
}


public com.moon.jE c() {
return this.l;
}


public com.moon.jE d__sourceReturn_2220af9394() {
return this.m;
}


public void a(com.moon.hY p0) {
long life2_3;
    com.moon.iv life5_7;
    java.lang.String life4_8;
    life2_3 = (com.moon.ix.o ^ 23349615327070L);
    java.lang.String spill1443_0 = com.moon.ix.a__String();
    life5_7 = ((com.moon.hY)(p0)).a__iv();
    life4_8 = spill1443_0;
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f))))).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f))))).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f))))).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.iv)(((com.moon.iv)(life5_7)).a(((float)(0x1.0p0f)), ((float)(0x1.0p0f))))).a(((float)(0x1.0p0f)), ((float)(0x0.0p0f)));
    ((com.moon.hY)(p0)).b(((int)(4)));
    super.a(((com.moon.hY)(p0)));
    if ((life4_8 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return;
}


public com.moon.iU a__iU() {
return this.k;
}


public static java.lang.String a__String() {
return com.moon.ix.n;
}


private com.moon.jD lambda$new$0() {
return this.g;
}


private com.moon.jD lambda$new$1() {
return this.g;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_14(com.moon.ix a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_4c38e60cc31647d8_originalDynamicSite1055_21(com.moon.ix a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1698_0() throws E;
}
