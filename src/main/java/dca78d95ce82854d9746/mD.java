package com.moon;


public class mD extends com.moon.mA {

private com.moon.nY h;

private com.moon.nY s;

private com.moon.nY t;

private com.moon.setting.BooleanSetting u;

private boolean v;

private static long w;

private static long x;

private static long[] y;

private static java.lang.Long[] z;

private static java.util.Map A;

public mD(com.moon.setting.BooleanSetting p0, float p1, float p2, float p3, float p4) { super(); }

private static void __sourceConstructorBody_934cd20ecc522b0d(com.moon.mD receiver, com.moon.setting.BooleanSetting p0, float p1, float p2, float p3, float p4) throws Throwable {
long local6 = (com.moon.mD.w ^ 1008492461334L);
    com.moon.mD.__sourceConstructorInit_934cd20ecc522b0d_0(((com.moon.mD)(receiver)));
    ((com.moon.mD)(receiver)).h = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_934cd20ecc522b0d_originalDynamicSite1171_2(3954, (5704800138390317116L ^ local6)), com.moon.cj.LINEAR)));
    ((com.moon.mD)(receiver)).s = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_934cd20ecc522b0d_originalDynamicSite1171_5(17490, (5410020425904874269L ^ local6)), com.moon.cj.LINEAR)));
    ((com.moon.mD)(receiver)).t = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_934cd20ecc522b0d_originalDynamicSite1171_8(17490, (5410020425904874269L ^ local6)), com.moon.cj.LINEAR)));
    ((com.moon.mD)(receiver)).u = ((com.moon.setting.BooleanSetting)(p0));
    ((com.moon.mD)(receiver)).e = ((float)(p1));
    ((com.moon.mD)(receiver)).f = ((float)(p2));
    ((com.moon.mD)(receiver)).g = ((float)(p3));
    ((com.moon.mD)(receiver)).i = ((float)(p4));
    return;
}


static {
w = ((long)(((moom._a)(moom._c.a(((long)(1514326231755666518L)), ((long)(1353465879980288465L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204476831167605L)))));
    long local11_life6 = (com.moon.mD.w ^ 4988174076358L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill239_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill239_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill239_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill239_13 = new byte[8];
    (__sourceSpill239_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill239_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation239_15 = __sourceSpill239_13;
    ((javax.crypto.Cipher)(__sourceSpill239_10)).init(((int)(__sourceSpill239_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill239_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation239_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local15_life18 = -6573159757696660610L;
    byte[] __sourceSpill239_19 = new byte[8];
    (__sourceSpill239_19)[0] = ((byte) ((int) (local15_life18 >>> 56)));
    (__sourceSpill239_19)[1] = ((byte) ((int) (local15_life18 >>> 48)));
    (__sourceSpill239_19)[2] = ((byte) ((int) (local15_life18 >>> 40)));
    (__sourceSpill239_19)[3] = ((byte) ((int) (local15_life18 >>> 32)));
    (__sourceSpill239_19)[4] = ((byte) ((int) (local15_life18 >>> 24)));
    (__sourceSpill239_19)[5] = ((byte) ((int) (local15_life18 >>> 16)));
    (__sourceSpill239_19)[6] = ((byte) ((int) (local15_life18 >>> 8)));
    (__sourceSpill239_19)[7] = ((byte) ((int) local15_life18));
    javax.crypto.Cipher __sourceSpill239_20 = local13_life8;
    byte[] local17_life22 = ((javax.crypto.Cipher)(__sourceSpill239_20)).doFinal(((byte[])(__sourceSpill239_19)));
    x = ((long)((((((((((((long) (local17_life22)[0]) & 255L) << 56) | ((((long) (local17_life22)[1]) & 255L) << 48)) | ((((long) (local17_life22)[2]) & 255L) << 40)) | ((((long) (local17_life22)[3]) & 255L) << 32)) | ((((long) (local17_life22)[4]) & 255L) << 24)) | ((((long) (local17_life22)[5]) & 255L) << 16)) | ((((long) (local17_life22)[6]) & 255L) << 8)) | (((long) (local17_life22)[7]) & 255L))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life26;
    javax.crypto.Cipher __sourceSpill239_28 = (local0_life26 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill239_29 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill239_30 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill239_31 = new byte[8];
    (__sourceSpill239_31)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life32 = 1;
    while ((local1_life32 < 8)) {
        (__sourceSpill239_31)[local1_life32] = ((byte) ((int) ((local11_life6 << (local1_life32 * 8)) >>> 56)));
        local1_life32 += 1;
    }
    byte[] __sourcePreallocation239_33 = __sourceSpill239_31;
    ((javax.crypto.Cipher)(__sourceSpill239_28)).init(((int)(__sourceSpill239_29)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill239_30)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation239_33)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life36 = new long[2];
    int local3_life37 = 0;
    java.lang.String local4_life38;
    int local5_life40 = ((java.lang.String)((local4_life38 = "ºéç÷ç_\027-¤¯¢\tA\n"))).length();
    int local2_life41 = 0;
    do {
        java.lang.String __sourceSpill239_42 = local4_life38;
        int __sourceSpill239_43 = local2_life41;
        local2_life41 += 8;
        byte[] local7_life46 = ((java.lang.String)(((java.lang.String)(__sourceSpill239_42)).substring(((int)(__sourceSpill239_43)), ((int)(local2_life41))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill239_47 = local6_life36;
        int __sourceSpill239_48 = local3_life37;
        local3_life37 += 1;
        long local8_life49 = (((((((((((long) (local7_life46)[0]) & 255L) << 56) | ((((long) (local7_life46)[1]) & 255L) << 48)) | ((((long) (local7_life46)[2]) & 255L) << 40)) | ((((long) (local7_life46)[3]) & 255L) << 32)) | ((((long) (local7_life46)[4]) & 255L) << 24)) | ((((long) (local7_life46)[5]) & 255L) << 16)) | ((((long) (local7_life46)[6]) & 255L) << 8)) | (((long) (local7_life46)[7]) & 255L));
        byte[] __sourceSpill239_50 = new byte[8];
        (__sourceSpill239_50)[0] = ((byte) ((int) (local8_life49 >>> 56)));
        (__sourceSpill239_50)[1] = ((byte) ((int) (local8_life49 >>> 48)));
        (__sourceSpill239_50)[2] = ((byte) ((int) (local8_life49 >>> 40)));
        (__sourceSpill239_50)[3] = ((byte) ((int) (local8_life49 >>> 32)));
        (__sourceSpill239_50)[4] = ((byte) ((int) (local8_life49 >>> 24)));
        (__sourceSpill239_50)[5] = ((byte) ((int) (local8_life49 >>> 16)));
        (__sourceSpill239_50)[6] = ((byte) ((int) (local8_life49 >>> 8)));
        (__sourceSpill239_50)[7] = ((byte) ((int) local8_life49));
        javax.crypto.Cipher __sourceSpill239_51 = local0_life26;
        byte[] local10_life53 = ((javax.crypto.Cipher)(__sourceSpill239_51)).doFinal(((byte[])(__sourceSpill239_50)));
        (__sourceSpill239_47)[__sourceSpill239_48] = (((((((((((long) (local10_life53)[0]) & 255L) << 56) | ((((long) (local10_life53)[1]) & 255L) << 48)) | ((((long) (local10_life53)[2]) & 255L) << 40)) | ((((long) (local10_life53)[3]) & 255L) << 32)) | ((((long) (local10_life53)[4]) & 255L) << 24)) | ((((long) (local10_life53)[5]) & 255L) << 16)) | ((((long) (local10_life53)[6]) & 255L) << 8)) | (((long) (local10_life53)[7]) & 255L));
    } while ((!(local2_life41 >= local5_life40)));
    y = ((long[])(local6_life36));
    z = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_934cd20ecc522b0d_0(com.moon.mD a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void e__sourceReturn_da8c82d5d4() {
long local1_life2 = (com.moon.mD.w ^ 28192236329031L);
    ((com.moon.nY)(this.t)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.v)));
    com.moon.jC local3_life11 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    int local4_life13 = ((int) com.moon.mD.x);
    float local5_life15 = (((float) local4_life13) * 0x1.8f5c280000000p+0F);
    float local6_life20 = (0x1.1000000000000p+3F + (((com.moon.nY)(this.t)).c() * 0x1.0000000000000p+2F));
    ((com.moon.nY)(this.s)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.v)));
    ((com.moon.nY)(this.h)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.v)));
    float local7_life30 = ((((__sourceExactCall_0cf0451085abdc(((com.moon.mD)(this))) + ((com.moon.mD)(this)).d()) - local5_life15) - this.k) - 0x1.0p0f);
    float local8_life33 = ((((com.moon.mD)(this)).a() + 0x1.e000000000000p+2F) - (((float) local4_life13) / 0x1.0p1f));
    float local9_life39 = (((local7_life30 + 0x1.0000000000000p+2F) - 0x1.0000000000000p-1F) + (((com.moon.nY)(this.s)).c() * ((local5_life15 - 0x1.4000000000000p+2F) - local6_life20)));
    float local10_life40 = ((local8_life33 + (((float) local4_life13) / 0x1.0p1f)) - (local6_life20 / 0x1.0p1f));
    com.moon.hW local11_life45 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local11_life45)).a(((com.moon.iX)(com.moon.i3.a(((float)((local7_life30 - 0x1.0000000000000p-1F))), ((float)((local8_life33 - 0x1.0000000000000p-1F))), ((float)((local5_life15 + 0x1.0p0f))), ((float)((((float) local4_life13) + 0x1.0p0f))), ((float)(((((float) local4_life13) / 0x1.0p1f) - 0x1.0p0f))), ((int)(((com.v)(this.p)).u()))))));
    ((com.moon.hW)(local11_life45)).a(((com.moon.iX)(com.moon.i3.a(((float)((local7_life30 - 0x1.0000000000000p-1F))), ((float)((local8_life33 - 0x1.0000000000000p-1F))), ((float)((local5_life15 + 0x1.0p0f))), ((float)((((float) local4_life13) + 0x1.0p0f))), ((float)(((((float) local4_life13) / 0x1.0p1f) - 0x1.0000000000000p-1F))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(((com.moon.nY)(this.h)).c()))))).getRGB()))))));
    __sourceExactCall_644ec120141bcc(((com.moon.hW)(local11_life45)), ((com.moon.iX)(__sourceExactCall_715fe8e25dfedc(((float)(local9_life39)), ((float)(local10_life40)), ((float)(local6_life20)), ((float)(local6_life20)), ((float)(((local6_life20 / 0x1.0p1f) - 0x1.0p0f))), ((int)(((com.v)(this.p)).w()))))));
    ((com.moon.hW)(local11_life45)).a(((com.moon.iX)(com.moon.i3.a(((float)(local9_life39)), ((float)(local10_life40)), ((float)(local6_life20)), ((float)(local6_life20)), ((float)(((local6_life20 / 0x1.0p1f) - 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceExactCall_66349b953a09b2(((com.v)(this.p)))))).a(((float)(__sourceExactCall_852d6ca1a4a461(((com.moon.nY)(this.h)))))))).getRGB()))))));
    __sourceExactCall_7eb685242a436c(((com.moon.hW)(local11_life45)), ((com.moon.jA)(local3_life11)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(local11_life45)));
    com.moon.hW local12_life81 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local12_life81)).a(((com.moon.iX)(com.moon.i1.a(((float)((local7_life30 - 0x1.0p0f))), ((float)((local8_life33 - 0x1.0p0f))), ((float)((local5_life15 + 0x1.0p1f))), ((float)((((float) local4_life13) + 0x1.0p1f))), ((float)(((((float) local4_life13) / 0x1.0p1f) - 0x1.0000000000000p-1F))), ((float)(0x1.cccccc0000000p-2F)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).w()))).a(((float)((0x1.0p0f - ((com.moon.nY)(this.h)).c())))))).getRGB()))))));
    ((com.moon.hW)(local12_life81)).a(((com.moon.jA)(local3_life11)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(local12_life81)));
    com.moon.jm local13_life98 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    com.moon.hW local14_life104 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(local13_life98))))).a();
    __sourceExactCall_1949570a13ee94(((com.moon.jm)(local13_life98)), ((com.moon.hW)(local14_life104)), ((java.lang.String)("")), ((float)(0x1.a000000000000p+2F)), ((float)((local9_life39 + 0x1.8000000000000p+1F))), ((float)(((local10_life40 + (local6_life20 / 0x1.0p1f)) - 0x1.0p1f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((com.v)(this.p)).a()))).a(((float)(((com.moon.nY)(this.h)).c()))))).getRGB())));
    ((com.moon.hW)(local14_life104)).a(((com.moon.jA)(local3_life11)));
    __sourceExactCall_247fe3d2bc87d6(((com.moon.hW)(local14_life104)));
    return;
}


private void d__sourceReturn_da8c82d5d4() {
java.lang.Object local1 = com.moon.jC.a(((float)(this.l)), ((float)(this.m)), ((float)(this.n)), ((float)(this.o)));
    java.lang.Object local2 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(this.a))))).a();
    ((com.moon.jm)(this.a)).b(((com.moon.hW)(local2)), ((java.lang.String)(((com.moon.setting.BooleanSetting)(this.u)).getDisplayName())), ((float)(0x1.0147acp3f)), ((float)(((((com.moon.mD)(this)).b() + this.k) + 0x1.0p0f))), ((float)((((com.moon.mD)(this)).a() + 0x1.cp1f))), ((int)(((com.v)(this.p)).v())));
    ((com.moon.hW)(local2)).a(((com.moon.jA)(local1)));
    ((com.moon.hW)(local2)).b();
    return;
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = __sourceExactCall_2140565a560bfc(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2172_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29908);
    if (((com.moon.mD.z)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.mD.y)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.mD.A)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.mD.A)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/mD", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.mD.z)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.mD.z)[life3_8])).longValue();
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.BooleanSetting)(this.u)).isAvailable())) != 0);
}


public boolean a__Boolean(int p0, int p1, int p2) {
com.moon.setting.BooleanSetting forwardValue695_61_0;
    int forwardValue695_61_1;
    com.moon.setting.BooleanSetting forwardValue695_62_0;
    com.moon.setting.BooleanSetting forwardValue695_63_0;
    int forwardValue695_63_1;
    int forwardValue695_70_0;
    boolean spill695_0;
    boolean spill695_1;
    int spill695_2;
    com.moon.setting.BooleanSetting spill695_3;
    boolean spill695_4;
    long life4_3;
    float life7_5;
    float life8_8;
    int life6_9;
    float life9_20;
    float life10_34;
    forward_join_70: {
    forward_join_65: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    life4_3 = (com.moon.mD.w ^ 21970421792536L);
    life7_5 = 0x1.9p4f;
    spill695_0 = com.moon.mN.e__Boolean();
    life8_8 = 0x1.ap3f;
    life6_9 = ((spill695_0) ? 1 : 0);
    life9_20 = (((((com.moon.mD)(this)).b() + ((com.moon.mD)(this)).d()) - life7_5) - this.k);
    life10_34 = (((((com.moon.mD)(this)).a() + (((com.moon.mD)(this)).e() / 0x1.0p1f)) - (life8_8 / 0x1.0p1f)) + 0x1.0p-1f);
    spill695_1 = ((com.moon.mD)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life9_20)), ((float)(life10_34)), ((float)(life7_5)), ((float)(life8_8)));
    if (!((life6_9 != 0))) {
        forwardValue695_70_0 = ((spill695_1) ? 1 : 0);
        break forward_join_70;
    }
    if (!(spill695_1)) {
        break forward_join_65;
    }
    spill695_2 = p2;
    if (!((life6_9 != 0))) {
        forwardValue695_70_0 = spill695_2;
        break forward_join_70;
    }
    if (!((spill695_2 == 0))) {
        break forward_join_65;
    }
    spill695_3 = this.u;
    spill695_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue();
    if (!((life6_9 != 0))) {
        forwardValue695_61_0 = spill695_3;
        forwardValue695_61_1 = ((spill695_4) ? 1 : 0);
        break forward_join_61;
    }
    if (!((!spill695_4))) {
        forwardValue695_62_0 = spill695_3;
        break forward_join_62;
    }
    forwardValue695_61_0 = spill695_3;
    forwardValue695_61_1 = 1;
    }
    forwardValue695_63_0 = forwardValue695_61_0;
    forwardValue695_63_1 = forwardValue695_61_1;
    break forward_join_63;
    }
    forwardValue695_63_0 = forwardValue695_62_0;
    forwardValue695_63_1 = 0;
    }
    ((com.moon.setting.BooleanSetting)(forwardValue695_63_0)).setValue(((java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue695_63_1)))))));
    }
    forwardValue695_70_0 = ((super.a__Boolean(((int)(p0)), ((int)(p1)), ((int)(p2)))) ? 1 : 0);
    }
    return ((forwardValue695_70_0) != 0);
}


public void a(int p0, int p1) {
com.moon.nY forwardValue694_24_0;
    com.moon.mD forwardValue694_24_1;
    com.moon.nY forwardValue694_27_0;
    com.moon.nY forwardValue694_28_0;
    float forwardValue694_28_1;
    com.moon.nY forwardValue694_37_0;
    com.moon.mD forwardValue694_37_1;
    com.moon.nY forwardValue694_40_0;
    com.moon.nY forwardValue694_41_0;
    float forwardValue694_41_1;
    com.moon.nY forwardValue694_50_0;
    com.moon.mD forwardValue694_50_1;
    com.moon.nY forwardValue694_53_0;
    com.moon.nY forwardValue694_54_0;
    float forwardValue694_54_1;
    com.moon.mD forwardValue694_72_0;
    com.moon.mD spill694_0;
    com.moon.nY spill694_1;
    com.moon.mD spill694_2;
    com.moon.nY spill694_3;
    com.moon.mD spill694_4;
    com.moon.nY spill694_5;
    com.moon.mD spill694_6;
    long life3_3;
    int life5_5;
    forward_join_72: {
    forward_join_62: {
    forward_join_54: {
    forward_join_53: {
    forward_join_50: {
    forward_join_41: {
    forward_join_40: {
    forward_join_37: {
    forward_join_28: {
    forward_join_27: {
    forward_join_24: {
    life3_3 = (com.moon.mD.w ^ 57639979993637L);
    life5_5 = ((com.moon.mN.d__Boolean()) ? 1 : 0);
    spill694_0 = this;
    if (!((life5_5 == 0))) {
        forwardValue694_72_0 = spill694_0;
        break forward_join_72;
    }
    if (!((((com.moon.mD)(spill694_0)).v != ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()))) {
        break forward_join_62;
    }
    spill694_1 = this.t;
    spill694_2 = this;
    if (!((life5_5 == 0))) {
        forwardValue694_24_0 = spill694_1;
        forwardValue694_24_1 = spill694_2;
        break forward_join_24;
    }
    if (!(((com.moon.mD)(spill694_2)).v)) {
        forwardValue694_27_0 = spill694_1;
        break forward_join_27;
    }
    forwardValue694_24_0 = spill694_1;
    forwardValue694_24_1 = this;
    }
    forwardValue694_28_0 = forwardValue694_24_0;
    forwardValue694_28_1 = ((com.moon.nY)(((com.moon.mD)(forwardValue694_24_1)).t)).c();
    break forward_join_28;
    }
    forwardValue694_28_0 = forwardValue694_27_0;
    forwardValue694_28_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(forwardValue694_28_0)).a(((float)(forwardValue694_28_1)));
    spill694_3 = this.s;
    spill694_4 = this;
    if (!((life5_5 == 0))) {
        forwardValue694_37_0 = spill694_3;
        forwardValue694_37_1 = spill694_4;
        break forward_join_37;
    }
    if (!(((com.moon.mD)(spill694_4)).v)) {
        forwardValue694_40_0 = spill694_3;
        break forward_join_40;
    }
    forwardValue694_37_0 = spill694_3;
    forwardValue694_37_1 = this;
    }
    forwardValue694_41_0 = forwardValue694_37_0;
    forwardValue694_41_1 = ((com.moon.nY)(((com.moon.mD)(forwardValue694_37_1)).t)).c();
    break forward_join_41;
    }
    forwardValue694_41_0 = forwardValue694_40_0;
    forwardValue694_41_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(forwardValue694_41_0)).a(((float)(forwardValue694_41_1)));
    spill694_5 = this.h;
    spill694_6 = this;
    if (!((life5_5 == 0))) {
        forwardValue694_50_0 = spill694_5;
        forwardValue694_50_1 = spill694_6;
        break forward_join_50;
    }
    if (!(((com.moon.mD)(spill694_6)).v)) {
        forwardValue694_53_0 = spill694_5;
        break forward_join_53;
    }
    forwardValue694_50_0 = spill694_5;
    forwardValue694_50_1 = this;
    }
    forwardValue694_54_0 = forwardValue694_50_0;
    forwardValue694_54_1 = ((com.moon.nY)(((com.moon.mD)(forwardValue694_50_1)).t)).c();
    break forward_join_54;
    }
    forwardValue694_54_0 = forwardValue694_53_0;
    forwardValue694_54_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(forwardValue694_54_0)).a(((float)(forwardValue694_54_1)));
    this.v = ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()));
    }
    ((com.moon.mD)(this)).c__Void();
    ((com.moon.mD)(this)).e__sourceReturn_da8c82d5d4();
    ((com.moon.mD)(this)).d__sourceReturn_da8c82d5d4();
    this.j = ((float)(0x1.ep3f));
    forwardValue694_72_0 = this;
    }
    __sourceIntrinsic_fd0ba049c90e_call694_32(forwardValue694_72_0, p0, p1);
    return;
}


private static native <E extends Throwable> long __sourceIntrinsic_934cd20ecc522b0d_originalDynamicSite1171_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_934cd20ecc522b0d_originalDynamicSite1171_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_934cd20ecc522b0d_originalDynamicSite1171_8(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_fd0ba049c90e_call694_32(com.moon.mD a0, int a1, int a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2172_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native long __sourceExactCall_2140565a560bfc(int p0, long p1);

private static native float __sourceExactCall_0cf0451085abdc(com.moon.mD p0);
private static native void __sourceExactCall_247fe3d2bc87d6(com.moon.hW p0);
private static native void __sourceExactCall_1949570a13ee94(com.moon.jm p0, com.moon.hW p1, java.lang.String p2, float p3, float p4, float p5, int p6);

private static native int __sourceExactCall_66349b953a09b2(com.v p0);

private static native void __sourceExactCall_644ec120141bcc(com.moon.hW p0, com.moon.iX p1);
private static native com.moon.i3 __sourceExactCall_715fe8e25dfedc(float p0, float p1, float p2, float p3, float p4, int p5);
private static native float __sourceExactCall_852d6ca1a4a461(com.moon.nY p0);
private static native void __sourceExactCall_7eb685242a436c(com.moon.hW p0, com.moon.jA p1);
}
