package com.moon;


class dB {

static int[] a;

static { __sourceHandlerCall_681f8aa5a7dcfa4a2ad8(); }

private static native <E extends Throwable> void __sourceHandlerCall_681f8aa5a7dcfa4a2ad8() throws E;
private static final class __SourceHandler_681f8aa5a7dcfa4a2ad8 {

public static void f16() throws Throwable {
    javax.crypto.Cipher forestValue16_29_0;
    int forestValue16_29_1;
    javax.crypto.SecretKeyFactory forestValue16_29_2;
    byte[] forestValue16_29_3;
    javax.crypto.Cipher forestValue16_46_0;
    int forestValue16_46_1;
    javax.crypto.SecretKeyFactory forestValue16_46_2;
    byte[] forestValue16_46_3;
    javax.crypto.Cipher spill16_0;
    int spill16_1;
    javax.crypto.SecretKeyFactory spill16_2;
    byte[] spill16_3;
    byte[] spill16_4;
    int spill16_5;
    long spill16_6;
    byte[] spill16_7;
    byte[] spill16_8;
    byte[] spill16_9;
    byte[] spill16_10;
    byte[] spill16_11;
    byte[] spill16_12;
    byte[] spill16_13;
    byte[] spill16_14;
    long spill16_15;
    int spill16_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call16_3(__call16_2(2407075077247629688L, -916195667091174940L, __call16_1(__call16_0())), 247430561090663L) ^ 58990872935622L);
    spill16_0 = (life1_13 = __call16_4("DES/CBC/NoPadding"));
    spill16_1 = 2;
    spill16_2 = __call16_5("DES");
    byte[] __stackOp16_6_0 = new byte[8];
    spill16_3 = __stackOp16_6_0;
    (__stackOp16_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue16_29_0 = spill16_0;
    forestValue16_29_1 = spill16_1;
    forestValue16_29_2 = spill16_2;
    forestValue16_29_3 = spill16_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue16_46_0 = forestValue16_29_0;
        forestValue16_46_1 = forestValue16_29_1;
        forestValue16_46_2 = forestValue16_29_2;
        forestValue16_46_3 = forestValue16_29_3;
        break forest_join_46;
    }
    byte[] __stackOp16_7_0 = forestValue16_29_3;
    spill16_4 = __stackOp16_7_0;
    (__stackOp16_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue16_29_3 = spill16_4;
    continue forest_cycle_29;
    }
    }
    __call16_9(forestValue16_46_0, forestValue16_46_1, __call16_8(forestValue16_46_2, new javax.crypto.spec.DESKeySpec(forestValue16_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp16_10_0 = -738342339809787198L;
    int __stackOp16_10_1 = -1;
    spill16_5 = __stackOp16_10_1;
    spill16_6 = __stackOp16_10_0;
    __discardScalar16_11(__stackOp16_10_1);
    life3_62 = spill16_6;
    byte[] __stackOp16_12_0 = new byte[8];
    spill16_7 = __stackOp16_12_0;
    (__stackOp16_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp16_13_0 = spill16_7;
    spill16_8 = __stackOp16_13_0;
    (__stackOp16_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp16_14_0 = spill16_8;
    spill16_9 = __stackOp16_14_0;
    (__stackOp16_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp16_15_0 = spill16_9;
    spill16_10 = __stackOp16_15_0;
    (__stackOp16_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp16_16_0 = spill16_10;
    spill16_11 = __stackOp16_16_0;
    (__stackOp16_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp16_17_0 = spill16_11;
    spill16_12 = __stackOp16_17_0;
    (__stackOp16_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp16_18_0 = spill16_12;
    spill16_13 = __stackOp16_18_0;
    (__stackOp16_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp16_19_0 = spill16_13;
    spill16_14 = __stackOp16_19_0;
    (__stackOp16_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp16_20_0 = spill16_14;
    javax.crypto.Cipher __stackOp16_20_1 = life1_13;
    life5_130 = __call16_21(__stackOp16_20_1, __stackOp16_20_0);
    int __stackOp16_22_0 = spill16_5;
    long __stackOp16_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill16_15 = __stackOp16_22_1;
    spill16_16 = __stackOp16_22_0;
    __discardWide16_23(__stackOp16_22_1);
    __discardScalar16_24(spill16_16);
    life0_204 = spill16_15;
    __fieldWrite16_26(new int[(__call16_25()).length]);
    (__fieldRead16_27())[__call16_29(__fieldRead16_28())] = 1;
    (__fieldRead16_30())[__call16_32(__fieldRead16_31())] = 2;
    (__fieldRead16_33())[__call16_35(__fieldRead16_34())] = 3;
    (__fieldRead16_36())[__call16_38(__fieldRead16_37())] = 4;
    (__fieldRead16_39())[__call16_41(__fieldRead16_40())] = 5;
    (__fieldRead16_42())[__call16_44(__fieldRead16_43())] = ((int) life0_204);
    return;
}
public static void h16_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3001600_0())[__call3001600_2(__fieldRead3001600_1())] = 2;
    (__fieldRead3001600_3())[__call3001600_5(__fieldRead3001600_4())] = 3;
    (__fieldRead3001600_6())[__call3001600_8(__fieldRead3001600_7())] = 4;
    (__fieldRead3001600_9())[__call3001600_11(__fieldRead3001600_10())] = 5;
    (__fieldRead3001600_12())[__call3001600_14(__fieldRead3001600_13())] = ((int) p1);
    return;
}
public static void h16_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3001601_0())[__call3001601_2(__fieldRead3001601_1())] = 3;
    (__fieldRead3001601_3())[__call3001601_5(__fieldRead3001601_4())] = 4;
    (__fieldRead3001601_6())[__call3001601_8(__fieldRead3001601_7())] = 5;
    (__fieldRead3001601_9())[__call3001601_11(__fieldRead3001601_10())] = ((int) p1);
    return;
}
public static void h16_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3001602_0())[__call3001602_2(__fieldRead3001602_1())] = 4;
    (__fieldRead3001602_3())[__call3001602_5(__fieldRead3001602_4())] = 5;
    (__fieldRead3001602_6())[__call3001602_8(__fieldRead3001602_7())] = ((int) p1);
    return;
}
public static void h16_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3001603_0())[__call3001603_2(__fieldRead3001603_1())] = 5;
    (__fieldRead3001603_3())[__call3001603_5(__fieldRead3001603_4())] = ((int) p1);
    return;
}
public static void h16_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3001604_0())[__call3001604_2(__fieldRead3001604_1())] = ((int) p1);
    return;
}
public static void h16_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call16_0() throws Throwable;
private static native java.lang.Class __call16_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call16_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call16_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call16_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call16_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call16_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call16_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar16_11(int a0) throws Throwable;
private static native byte[] __call16_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide16_23(long a0) throws Throwable;
private static native void __discardScalar16_24(int a0) throws Throwable;
private static native com.moon.aV[] __call16_25() throws Throwable;
private static native void __fieldWrite16_26(int[] a0) throws Throwable;
private static native int[] __fieldRead16_27() throws Throwable;
private static native com.moon.aV __fieldRead16_28() throws Throwable;
private static native int __call16_29(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead16_30() throws Throwable;
private static native com.moon.aV __fieldRead16_31() throws Throwable;
private static native int __call16_32(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead16_33() throws Throwable;
private static native com.moon.aV __fieldRead16_34() throws Throwable;
private static native int __call16_35(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead16_36() throws Throwable;
private static native com.moon.aV __fieldRead16_37() throws Throwable;
private static native int __call16_38(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead16_39() throws Throwable;
private static native com.moon.aV __fieldRead16_40() throws Throwable;
private static native int __call16_41(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead16_42() throws Throwable;
private static native com.moon.aV __fieldRead16_43() throws Throwable;
private static native int __call16_44(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001600_0() throws Throwable;
private static native com.moon.aV __fieldRead3001600_1() throws Throwable;
private static native int __call3001600_2(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001600_3() throws Throwable;
private static native com.moon.aV __fieldRead3001600_4() throws Throwable;
private static native int __call3001600_5(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001600_6() throws Throwable;
private static native com.moon.aV __fieldRead3001600_7() throws Throwable;
private static native int __call3001600_8(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001600_9() throws Throwable;
private static native com.moon.aV __fieldRead3001600_10() throws Throwable;
private static native int __call3001600_11(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001600_12() throws Throwable;
private static native com.moon.aV __fieldRead3001600_13() throws Throwable;
private static native int __call3001600_14(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001601_0() throws Throwable;
private static native com.moon.aV __fieldRead3001601_1() throws Throwable;
private static native int __call3001601_2(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001601_3() throws Throwable;
private static native com.moon.aV __fieldRead3001601_4() throws Throwable;
private static native int __call3001601_5(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001601_6() throws Throwable;
private static native com.moon.aV __fieldRead3001601_7() throws Throwable;
private static native int __call3001601_8(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001601_9() throws Throwable;
private static native com.moon.aV __fieldRead3001601_10() throws Throwable;
private static native int __call3001601_11(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001602_0() throws Throwable;
private static native com.moon.aV __fieldRead3001602_1() throws Throwable;
private static native int __call3001602_2(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001602_3() throws Throwable;
private static native com.moon.aV __fieldRead3001602_4() throws Throwable;
private static native int __call3001602_5(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001602_6() throws Throwable;
private static native com.moon.aV __fieldRead3001602_7() throws Throwable;
private static native int __call3001602_8(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001603_0() throws Throwable;
private static native com.moon.aV __fieldRead3001603_1() throws Throwable;
private static native int __call3001603_2(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001603_3() throws Throwable;
private static native com.moon.aV __fieldRead3001603_4() throws Throwable;
private static native int __call3001603_5(com.moon.aV a0) throws Throwable;
private static native int[] __fieldRead3001604_0() throws Throwable;
private static native com.moon.aV __fieldRead3001604_1() throws Throwable;
private static native int __call3001604_2(com.moon.aV a0) throws Throwable;

}

}
