package moom;


class L3 {

static int[] a;

static { __sourceHandlerCall_8c6061ccfde900f55f3f(); }

private static native <E extends Throwable> void __sourceHandlerCall_8c6061ccfde900f55f3f() throws E;
private static final class __SourceHandler_8c6061ccfde900f55f3f {

public static void f407() throws Throwable {
    javax.crypto.Cipher forestValue407_29_0;
    int forestValue407_29_1;
    javax.crypto.SecretKeyFactory forestValue407_29_2;
    byte[] forestValue407_29_3;
    javax.crypto.Cipher forestValue407_46_0;
    int forestValue407_46_1;
    javax.crypto.SecretKeyFactory forestValue407_46_2;
    byte[] forestValue407_46_3;
    javax.crypto.Cipher spill407_0;
    int spill407_1;
    javax.crypto.SecretKeyFactory spill407_2;
    byte[] spill407_3;
    byte[] spill407_4;
    int spill407_5;
    long spill407_6;
    byte[] spill407_7;
    byte[] spill407_8;
    byte[] spill407_9;
    byte[] spill407_10;
    byte[] spill407_11;
    byte[] spill407_12;
    byte[] spill407_13;
    byte[] spill407_14;
    long spill407_15;
    int spill407_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call407_3(__call407_2(3412976624074080076L, 4806886046531137065L, __call407_1(__call407_0())), 263019730256194L) ^ 41930739963143L);
    spill407_0 = (life1_13 = __call407_4("DES/CBC/NoPadding"));
    spill407_1 = 2;
    spill407_2 = __call407_5("DES");
    byte[] __stackOp407_6_0 = new byte[8];
    spill407_3 = __stackOp407_6_0;
    (__stackOp407_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue407_29_0 = spill407_0;
    forestValue407_29_1 = spill407_1;
    forestValue407_29_2 = spill407_2;
    forestValue407_29_3 = spill407_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue407_46_0 = forestValue407_29_0;
        forestValue407_46_1 = forestValue407_29_1;
        forestValue407_46_2 = forestValue407_29_2;
        forestValue407_46_3 = forestValue407_29_3;
        break forest_join_46;
    }
    byte[] __stackOp407_7_0 = forestValue407_29_3;
    spill407_4 = __stackOp407_7_0;
    (__stackOp407_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue407_29_3 = spill407_4;
    continue forest_cycle_29;
    }
    }
    __call407_9(forestValue407_46_0, forestValue407_46_1, __call407_8(forestValue407_46_2, new javax.crypto.spec.DESKeySpec(forestValue407_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp407_10_0 = -5454115064108485368L;
    int __stackOp407_10_1 = -1;
    spill407_5 = __stackOp407_10_1;
    spill407_6 = __stackOp407_10_0;
    __discardScalar407_11(__stackOp407_10_1);
    life3_62 = spill407_6;
    byte[] __stackOp407_12_0 = new byte[8];
    spill407_7 = __stackOp407_12_0;
    (__stackOp407_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp407_13_0 = spill407_7;
    spill407_8 = __stackOp407_13_0;
    (__stackOp407_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp407_14_0 = spill407_8;
    spill407_9 = __stackOp407_14_0;
    (__stackOp407_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp407_15_0 = spill407_9;
    spill407_10 = __stackOp407_15_0;
    (__stackOp407_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp407_16_0 = spill407_10;
    spill407_11 = __stackOp407_16_0;
    (__stackOp407_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp407_17_0 = spill407_11;
    spill407_12 = __stackOp407_17_0;
    (__stackOp407_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp407_18_0 = spill407_12;
    spill407_13 = __stackOp407_18_0;
    (__stackOp407_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp407_19_0 = spill407_13;
    spill407_14 = __stackOp407_19_0;
    (__stackOp407_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp407_20_0 = spill407_14;
    javax.crypto.Cipher __stackOp407_20_1 = life1_13;
    life5_130 = __call407_21(__stackOp407_20_1, __stackOp407_20_0);
    int __stackOp407_22_0 = spill407_5;
    long __stackOp407_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill407_15 = __stackOp407_22_1;
    spill407_16 = __stackOp407_22_0;
    __discardWide407_23(__stackOp407_22_1);
    __discardScalar407_24(spill407_16);
    life0_204 = spill407_15;
    __fieldWrite407_26(new int[(__call407_25()).length]);
    (__fieldRead407_27())[__call407_29(__fieldRead407_28())] = 1;
    (__fieldRead407_30())[__call407_32(__fieldRead407_31())] = 2;
    (__fieldRead407_33())[__call407_35(__fieldRead407_34())] = 3;
    (__fieldRead407_36())[__call407_38(__fieldRead407_37())] = 4;
    (__fieldRead407_39())[__call407_41(__fieldRead407_40())] = 5;
    (__fieldRead407_42())[__call407_44(__fieldRead407_43())] = ((int) life0_204);
    return;
}
public static void h407_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040700_0())[__call3040700_2(__fieldRead3040700_1())] = 2;
    (__fieldRead3040700_3())[__call3040700_5(__fieldRead3040700_4())] = 3;
    (__fieldRead3040700_6())[__call3040700_8(__fieldRead3040700_7())] = 4;
    (__fieldRead3040700_9())[__call3040700_11(__fieldRead3040700_10())] = 5;
    (__fieldRead3040700_12())[__call3040700_14(__fieldRead3040700_13())] = ((int) p1);
    return;
}
public static void h407_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040701_0())[__call3040701_2(__fieldRead3040701_1())] = 3;
    (__fieldRead3040701_3())[__call3040701_5(__fieldRead3040701_4())] = 4;
    (__fieldRead3040701_6())[__call3040701_8(__fieldRead3040701_7())] = 5;
    (__fieldRead3040701_9())[__call3040701_11(__fieldRead3040701_10())] = ((int) p1);
    return;
}
public static void h407_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040702_0())[__call3040702_2(__fieldRead3040702_1())] = 4;
    (__fieldRead3040702_3())[__call3040702_5(__fieldRead3040702_4())] = 5;
    (__fieldRead3040702_6())[__call3040702_8(__fieldRead3040702_7())] = ((int) p1);
    return;
}
public static void h407_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040703_0())[__call3040703_2(__fieldRead3040703_1())] = 5;
    (__fieldRead3040703_3())[__call3040703_5(__fieldRead3040703_4())] = ((int) p1);
    return;
}
public static void h407_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040704_0())[__call3040704_2(__fieldRead3040704_1())] = ((int) p1);
    return;
}
public static void h407_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call407_0() throws Throwable;
private static native java.lang.Class __call407_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call407_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call407_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call407_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call407_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call407_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call407_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar407_11(int a0) throws Throwable;
private static native byte[] __call407_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide407_23(long a0) throws Throwable;
private static native void __discardScalar407_24(int a0) throws Throwable;
private static native moom.bs[] __call407_25() throws Throwable;
private static native void __fieldWrite407_26(int[] a0) throws Throwable;
private static native int[] __fieldRead407_27() throws Throwable;
private static native moom.bs __fieldRead407_28() throws Throwable;
private static native int __call407_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead407_30() throws Throwable;
private static native moom.bs __fieldRead407_31() throws Throwable;
private static native int __call407_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead407_33() throws Throwable;
private static native moom.bs __fieldRead407_34() throws Throwable;
private static native int __call407_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead407_36() throws Throwable;
private static native moom.bs __fieldRead407_37() throws Throwable;
private static native int __call407_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead407_39() throws Throwable;
private static native moom.bs __fieldRead407_40() throws Throwable;
private static native int __call407_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead407_42() throws Throwable;
private static native moom.bs __fieldRead407_43() throws Throwable;
private static native int __call407_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040700_0() throws Throwable;
private static native moom.bs __fieldRead3040700_1() throws Throwable;
private static native int __call3040700_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040700_3() throws Throwable;
private static native moom.bs __fieldRead3040700_4() throws Throwable;
private static native int __call3040700_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040700_6() throws Throwable;
private static native moom.bs __fieldRead3040700_7() throws Throwable;
private static native int __call3040700_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040700_9() throws Throwable;
private static native moom.bs __fieldRead3040700_10() throws Throwable;
private static native int __call3040700_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040700_12() throws Throwable;
private static native moom.bs __fieldRead3040700_13() throws Throwable;
private static native int __call3040700_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040701_0() throws Throwable;
private static native moom.bs __fieldRead3040701_1() throws Throwable;
private static native int __call3040701_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040701_3() throws Throwable;
private static native moom.bs __fieldRead3040701_4() throws Throwable;
private static native int __call3040701_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040701_6() throws Throwable;
private static native moom.bs __fieldRead3040701_7() throws Throwable;
private static native int __call3040701_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040701_9() throws Throwable;
private static native moom.bs __fieldRead3040701_10() throws Throwable;
private static native int __call3040701_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040702_0() throws Throwable;
private static native moom.bs __fieldRead3040702_1() throws Throwable;
private static native int __call3040702_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040702_3() throws Throwable;
private static native moom.bs __fieldRead3040702_4() throws Throwable;
private static native int __call3040702_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040702_6() throws Throwable;
private static native moom.bs __fieldRead3040702_7() throws Throwable;
private static native int __call3040702_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040703_0() throws Throwable;
private static native moom.bs __fieldRead3040703_1() throws Throwable;
private static native int __call3040703_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040703_3() throws Throwable;
private static native moom.bs __fieldRead3040703_4() throws Throwable;
private static native int __call3040703_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040704_0() throws Throwable;
private static native moom.bs __fieldRead3040704_1() throws Throwable;
private static native int __call3040704_2(moom.bs a0) throws Throwable;

}

}
