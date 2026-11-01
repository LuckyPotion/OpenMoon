package com.moon;


public class o8 implements com.viaversion.viaversion.api.platform.ViaInjector {

private static long a;

private static java.lang.String[] b;

private static java.lang.String[] c;

private static java.util.Map d;

private static long e;

public o8() {
super();
}


static {
javax.crypto.Cipher forestValue58_36_0;
    int forestValue58_36_1;
    javax.crypto.SecretKeyFactory forestValue58_36_2;
    byte[] forestValue58_36_3;
    javax.crypto.Cipher forestValue58_53_0;
    int forestValue58_53_1;
    javax.crypto.SecretKeyFactory forestValue58_53_2;
    byte[] forestValue58_53_3;
    javax.crypto.Cipher forestValue58_140_0;
    int forestValue58_140_1;
    javax.crypto.SecretKeyFactory forestValue58_140_2;
    byte[] forestValue58_140_3;
    javax.crypto.Cipher forestValue58_157_0;
    int forestValue58_157_1;
    javax.crypto.SecretKeyFactory forestValue58_157_2;
    byte[] forestValue58_157_3;
    javax.crypto.Cipher spill58_0;
    int spill58_1;
    javax.crypto.SecretKeyFactory spill58_2;
    byte[] spill58_3;
    byte[] spill58_4;
    java.lang.String spill58_5;
    int spill58_6;
    java.lang.String spill58_7;
    java.lang.String[] spill58_8;
    javax.crypto.Cipher spill58_9;
    int spill58_10;
    javax.crypto.SecretKeyFactory spill58_11;
    byte[] spill58_12;
    byte[] spill58_13;
    int spill58_14;
    long spill58_15;
    byte[] spill58_16;
    byte[] spill58_17;
    byte[] spill58_18;
    byte[] spill58_19;
    byte[] spill58_20;
    byte[] spill58_21;
    byte[] spill58_22;
    byte[] spill58_23;
    long spill58_24;
    int spill58_25;
    long life5_16;
    javax.crypto.Cipher life7_20;
    int life8_35;
    java.lang.String[] life14_66;
    int life12_68;
    java.lang.String life11_71;
    int life13_73;
    int life10_75;
    int life9_77;
    byte[] life15_93;
    javax.crypto.Cipher life0_127;
    int life1_142;
    long life2_176;
    byte[] life4_244;
    forest_join_157: {
    forest_join_116: {
    forest_join_53: {
    a = ((long)(((moom._a)(moom._c.a(((long)(-3146277513621384627L)), ((long)(6372652020587335425L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(255390213889603L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    life5_16 = (com.moon.o8.a ^ 46058990375520L);
    spill58_0 = (life7_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill58_1 = 2;
    spill58_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp58_9_0 = new byte[8];
    spill58_3 = __stackOp58_9_0;
    (__stackOp58_9_0)[0] = ((byte) ((int) (life5_16 >>> 56)));
    life8_35 = 1;
    forestValue58_36_0 = spill58_0;
    forestValue58_36_1 = spill58_1;
    forestValue58_36_2 = spill58_2;
    forestValue58_36_3 = spill58_3;
    forest_cycle_36: while (true) {
    if (!((life8_35 < 8))) {
        forestValue58_53_0 = forestValue58_36_0;
        forestValue58_53_1 = forestValue58_36_1;
        forestValue58_53_2 = forestValue58_36_2;
        forestValue58_53_3 = forestValue58_36_3;
        break forest_join_53;
    }
    byte[] __stackOp58_10_0 = forestValue58_36_3;
    spill58_4 = __stackOp58_10_0;
    (__stackOp58_10_0)[life8_35] = ((byte) ((int) ((life5_16 << (life8_35 * 8)) >>> 56)));
    life8_35 += 1;
    forestValue58_36_3 = spill58_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue58_53_0)).init(((int)(forestValue58_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue58_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue58_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life14_66 = new java.lang.String[2];
    life12_68 = 0;
    life13_73 = ((java.lang.String)((life11_71 = "VfCôñ \001¢\032¬,×9>u\007T\024\027r÷ÌcU\016Ë_© Àëÿ´üüf\007\017\032-¹w®\033Ü\020\002çt²yÚ*UåÇü"))).length();
    life10_75 = 32;
    life9_77 = -1;
    forest_cycle_78: while (true) {
    life9_77 += 1;
    spill58_5 = life11_71;
    int __stackOp58_14_0 = life9_77;
    java.lang.String __stackOp58_16_0 = ((java.lang.String)(spill58_5)).substring(((int)(__stackOp58_14_0)), ((int)((__stackOp58_14_0 + life10_75))));
    int __stackOp58_16_1 = -1;
    spill58_6 = __stackOp58_16_1;
    byte[] __stackOp58_18_0 = ((java.lang.String)(__stackOp58_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp58_18_1 = life7_20;
    life15_93 = ((javax.crypto.Cipher)(__stackOp58_18_1)).doFinal(((byte[])(__stackOp58_18_0)));
    int __stackOp58_22_0 = spill58_6;
    java.lang.String __stackOp58_22_1 = ((java.lang.String)(com.moon.o8.a(((byte[])(life15_93))))).intern();
    spill58_7 = __stackOp58_22_1;
    recovery.source.CarrierOps.discard(__stackOp58_22_0);
    java.lang.String __stackOp58_24_0 = spill58_7;
    java.lang.String[] __stackOp58_24_1 = life14_66;
    spill58_8 = __stackOp58_24_1;
    java.lang.String __stackOp58_25_0 = __stackOp58_24_0;
    int __stackOp58_25_1 = (life12_68++);
    (spill58_8)[__stackOp58_25_1] = __stackOp58_25_0;
    if (!(((life9_77 = (life9_77 + life10_75)) < life13_73))) {
        break forest_join_116;
    }
    life10_75 = ((int)(((java.lang.String)(life11_71)).charAt(((int)(life9_77)))));
    continue forest_cycle_78;
    }
    }
    b = ((java.lang.String[])(life14_66));
    c = ((java.lang.String[])(new java.lang.String[2]));
    spill58_9 = (life0_127 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill58_10 = 2;
    spill58_11 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp58_32_0 = new byte[8];
    spill58_12 = __stackOp58_32_0;
    (__stackOp58_32_0)[0] = ((byte) ((int) (life5_16 >>> 56)));
    life1_142 = 1;
    forestValue58_140_0 = spill58_9;
    forestValue58_140_1 = spill58_10;
    forestValue58_140_2 = spill58_11;
    forestValue58_140_3 = spill58_12;
    forest_cycle_140: while (true) {
    if (!((life1_142 < 8))) {
        forestValue58_157_0 = forestValue58_140_0;
        forestValue58_157_1 = forestValue58_140_1;
        forestValue58_157_2 = forestValue58_140_2;
        forestValue58_157_3 = forestValue58_140_3;
        break forest_join_157;
    }
    byte[] __stackOp58_33_0 = forestValue58_140_3;
    spill58_13 = __stackOp58_33_0;
    (__stackOp58_33_0)[life1_142] = ((byte) ((int) ((life5_16 << (life1_142 * 8)) >>> 56)));
    life1_142 += 1;
    forestValue58_140_3 = spill58_13;
    continue forest_cycle_140;
    }
    }
    ((javax.crypto.Cipher)(forestValue58_157_0)).init(((int)(forestValue58_157_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue58_157_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue58_157_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long __stackOp58_36_0 = -329996706939882835L;
    int __stackOp58_36_1 = -1;
    spill58_14 = __stackOp58_36_1;
    spill58_15 = __stackOp58_36_0;
    recovery.source.CarrierOps.discard(__stackOp58_36_1);
    life2_176 = spill58_15;
    byte[] __stackOp58_38_0 = new byte[8];
    spill58_16 = __stackOp58_38_0;
    (__stackOp58_38_0)[0] = ((byte) ((int) (life2_176 >>> 56)));
    byte[] __stackOp58_39_0 = spill58_16;
    spill58_17 = __stackOp58_39_0;
    (__stackOp58_39_0)[1] = ((byte) ((int) (life2_176 >>> 48)));
    byte[] __stackOp58_40_0 = spill58_17;
    spill58_18 = __stackOp58_40_0;
    (__stackOp58_40_0)[2] = ((byte) ((int) (life2_176 >>> 40)));
    byte[] __stackOp58_41_0 = spill58_18;
    spill58_19 = __stackOp58_41_0;
    (__stackOp58_41_0)[3] = ((byte) ((int) (life2_176 >>> 32)));
    byte[] __stackOp58_42_0 = spill58_19;
    spill58_20 = __stackOp58_42_0;
    (__stackOp58_42_0)[4] = ((byte) ((int) (life2_176 >>> 24)));
    byte[] __stackOp58_43_0 = spill58_20;
    spill58_21 = __stackOp58_43_0;
    (__stackOp58_43_0)[5] = ((byte) ((int) (life2_176 >>> 16)));
    byte[] __stackOp58_44_0 = spill58_21;
    spill58_22 = __stackOp58_44_0;
    (__stackOp58_44_0)[6] = ((byte) ((int) (life2_176 >>> 8)));
    byte[] __stackOp58_45_0 = spill58_22;
    spill58_23 = __stackOp58_45_0;
    (__stackOp58_45_0)[7] = ((byte) ((int) life2_176));
    byte[] __stackOp58_46_0 = spill58_23;
    javax.crypto.Cipher __stackOp58_46_1 = life0_127;
    life4_244 = ((javax.crypto.Cipher)(__stackOp58_46_1)).doFinal(((byte[])(__stackOp58_46_0)));
    int __stackOp58_48_0 = spill58_14;
    long __stackOp58_48_1 = (((((((((((long) (life4_244)[0]) & 255L) << 56) | ((((long) (life4_244)[1]) & 255L) << 48)) | ((((long) (life4_244)[2]) & 255L) << 40)) | ((((long) (life4_244)[3]) & 255L) << 32)) | ((((long) (life4_244)[4]) & 255L) << 24)) | ((((long) (life4_244)[5]) & 255L) << 16)) | ((((long) (life4_244)[6]) & 255L) << 8)) | (((long) (life4_244)[7]) & 255L));
    spill58_24 = __stackOp58_48_1;
    spill58_25 = __stackOp58_48_0;
    recovery.source.CarrierOps.discard(__stackOp58_48_1);
    recovery.source.CarrierOps.discard(spill58_25);
    e = ((long)(spill58_24));
}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_4e6912be01525569a35f(int a0, long a1) throws E;
private static final class __SourceHandler_4e6912be01525569a35f {

public static java.lang.String f103(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21081);
    if (((__fieldRead103_0())[life5_8] == null)) {
        life3_16 = __call103_3(__call103_2(__call103_1()));
        life4_21 = __cast103_6(__call103_5(__fieldRead103_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call103_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call103_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call103_10(__fieldRead103_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call103_12(__cast103_11((life4_21)[1]), life7_92);
        __call103_15(__cast103_13((life4_21)[0]), 2, life8_99, __cast103_14((life4_21)[2]));
        life9_116 = __call103_17((__fieldRead103_16())[life5_8], "ISO-8859-1");
        (__fieldRead103_18())[life5_8] = __call103_21(__call103_20(__cast103_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead103_22())[life5_8];
}
public static java.lang.String h103_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/o8", local1);
}
private static native java.lang.String[] __fieldRead103_0() throws Throwable;
private static native java.lang.Thread __call103_1() throws Throwable;
private static native long __call103_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call103_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead103_4() throws Throwable;
private static native java.lang.Object __call103_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast103_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call103_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call103_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead103_9() throws Throwable;
private static native java.lang.Object __call103_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast103_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call103_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast103_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast103_14(java.lang.Object a0) throws Throwable;
private static native void __call103_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead103_16() throws Throwable;
private static native byte[] __call103_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead103_18() throws Throwable;
private static native javax.crypto.Cipher __cast103_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call103_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call103_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead103_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_23bcdcba21398b9d2f7e(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_23bcdcba21398b9d2f7e {

public static java.lang.invoke.CallSite f104(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill104_0 = life3_4;
    java.lang.invoke.MethodHandle spill104_1 = __call104_3(__methodHandleLiteral104_0(), __classLiteral104_1(), __call104_2(p2));
    int spill104_2 = 0;
    java.lang.Object[] __stackOp104_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill104_3 = __stackOp104_4_0;
    (__stackOp104_4_0)[0] = p0;
    java.lang.Object[] __stackOp104_5_0 = spill104_3;
    java.lang.Object[] spill104_4 = __stackOp104_5_0;
    (__stackOp104_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp104_6_0 = spill104_4;
    java.lang.Object[] spill104_5 = __stackOp104_6_0;
    (__stackOp104_6_0)[2] = p1;
    __call104_9(spill104_0, __call104_8(__call104_7(spill104_1, spill104_2, spill104_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h104_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2010400_6(__call2010400_5(__call2010400_3(__call2010400_2(__call2010400_1(__call2010400_0(new java.lang.StringBuilder(), "com/moon/o8"), " : "), p1), " : "), __call2010400_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral104_0() throws Throwable;
private static native java.lang.Object __classLiteral104_1() throws Throwable;
private static native int __call104_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call104_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call104_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call104_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call104_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2010400_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2010400_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2010400_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2010400_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2010400_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2010400_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2010400_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_23bcdcba21398b9d2f7e(p0, p1, p2); }


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
        byte[] spill1140_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1140_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1140_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1140_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1140_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1140_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_4e6912be01525569a35f(p0, p1); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.o8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.viaversion.viaversion.libs.gson.JsonObject getDump() {
return new com.viaversion.viaversion.libs.gson.JsonObject();
}


public void uninject() {
return;
}


public void inject() {
return;
}


public java.lang.String getEncoderName() {
long local1_life2 = (com.moon.o8.a ^ 98116032881434L);
    return __sourceIntrinsic_ee10a12adbe5_originalDynamicSite212_4(27192, (6464926991086381033L ^ local1_life2));
}


public java.lang.String getDecoderName() {
long local1_life2 = (com.moon.o8.a ^ 92095696285125L);
    return __sourceIntrinsic_b470e2ade578_originalDynamicSite210_4(4315, (6663806935826912212L ^ local1_life2));
}


public int getServerProtocolVersion() {
long local1 = (com.moon.o8.a ^ 91886354003642L);
    return ((int) com.moon.o8.e);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b470e2ade578_originalDynamicSite210_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ee10a12adbe5_originalDynamicSite212_4(int a0, long a1) throws E;
}
