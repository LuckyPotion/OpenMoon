package net.minecraft.client.renderer.block.model;


class BlockPart$1 {

static int[] a;

static { __sourceHandlerCall_92e5b3b7f7452f81264d(); }

private static native <E extends Throwable> void __sourceHandlerCall_92e5b3b7f7452f81264d() throws E;
private static final class __SourceHandler_92e5b3b7f7452f81264d {

public static void f542() throws Throwable {
    javax.crypto.Cipher forestValue542_29_0;
    int forestValue542_29_1;
    javax.crypto.SecretKeyFactory forestValue542_29_2;
    byte[] forestValue542_29_3;
    javax.crypto.Cipher forestValue542_46_0;
    int forestValue542_46_1;
    javax.crypto.SecretKeyFactory forestValue542_46_2;
    byte[] forestValue542_46_3;
    javax.crypto.Cipher spill542_0;
    int spill542_1;
    javax.crypto.SecretKeyFactory spill542_2;
    byte[] spill542_3;
    byte[] spill542_4;
    int spill542_5;
    long spill542_6;
    byte[] spill542_7;
    byte[] spill542_8;
    byte[] spill542_9;
    byte[] spill542_10;
    byte[] spill542_11;
    byte[] spill542_12;
    byte[] spill542_13;
    byte[] spill542_14;
    long spill542_15;
    int spill542_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call542_3(__call542_2(-417792079973498507L, 564819912807744277L, __call542_1(__call542_0())), 240608770068348L) ^ 111010575048536L);
    spill542_0 = (life1_13 = __call542_4("DES/CBC/NoPadding"));
    spill542_1 = 2;
    spill542_2 = __call542_5("DES");
    byte[] __stackOp542_6_0 = new byte[8];
    spill542_3 = __stackOp542_6_0;
    (__stackOp542_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue542_29_0 = spill542_0;
    forestValue542_29_1 = spill542_1;
    forestValue542_29_2 = spill542_2;
    forestValue542_29_3 = spill542_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue542_46_0 = forestValue542_29_0;
        forestValue542_46_1 = forestValue542_29_1;
        forestValue542_46_2 = forestValue542_29_2;
        forestValue542_46_3 = forestValue542_29_3;
        break forest_join_46;
    }
    byte[] __stackOp542_7_0 = forestValue542_29_3;
    spill542_4 = __stackOp542_7_0;
    (__stackOp542_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue542_29_3 = spill542_4;
    continue forest_cycle_29;
    }
    }
    __call542_9(forestValue542_46_0, forestValue542_46_1, __call542_8(forestValue542_46_2, new javax.crypto.spec.DESKeySpec(forestValue542_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp542_10_0 = 8268159157608722611L;
    int __stackOp542_10_1 = -1;
    spill542_5 = __stackOp542_10_1;
    spill542_6 = __stackOp542_10_0;
    __discardScalar542_11(__stackOp542_10_1);
    life3_62 = spill542_6;
    byte[] __stackOp542_12_0 = new byte[8];
    spill542_7 = __stackOp542_12_0;
    (__stackOp542_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp542_13_0 = spill542_7;
    spill542_8 = __stackOp542_13_0;
    (__stackOp542_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp542_14_0 = spill542_8;
    spill542_9 = __stackOp542_14_0;
    (__stackOp542_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp542_15_0 = spill542_9;
    spill542_10 = __stackOp542_15_0;
    (__stackOp542_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp542_16_0 = spill542_10;
    spill542_11 = __stackOp542_16_0;
    (__stackOp542_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp542_17_0 = spill542_11;
    spill542_12 = __stackOp542_17_0;
    (__stackOp542_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp542_18_0 = spill542_12;
    spill542_13 = __stackOp542_18_0;
    (__stackOp542_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp542_19_0 = spill542_13;
    spill542_14 = __stackOp542_19_0;
    (__stackOp542_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp542_20_0 = spill542_14;
    javax.crypto.Cipher __stackOp542_20_1 = life1_13;
    life5_130 = __call542_21(__stackOp542_20_1, __stackOp542_20_0);
    int __stackOp542_22_0 = spill542_5;
    long __stackOp542_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill542_15 = __stackOp542_22_1;
    spill542_16 = __stackOp542_22_0;
    __discardWide542_23(__stackOp542_22_1);
    __discardScalar542_24(spill542_16);
    life0_204 = spill542_15;
    __fieldWrite542_26(new int[(__call542_25()).length]);
    (__fieldRead542_27())[__call542_29(__fieldRead542_28())] = 1;
    (__fieldRead542_30())[__call542_32(__fieldRead542_31())] = 2;
    (__fieldRead542_33())[__call542_35(__fieldRead542_34())] = 3;
    (__fieldRead542_36())[__call542_38(__fieldRead542_37())] = 4;
    (__fieldRead542_39())[__call542_41(__fieldRead542_40())] = 5;
    (__fieldRead542_42())[__call542_44(__fieldRead542_43())] = ((int) life0_204);
    return;
}
public static void h542_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054200_0())[__call3054200_2(__fieldRead3054200_1())] = 2;
    (__fieldRead3054200_3())[__call3054200_5(__fieldRead3054200_4())] = 3;
    (__fieldRead3054200_6())[__call3054200_8(__fieldRead3054200_7())] = 4;
    (__fieldRead3054200_9())[__call3054200_11(__fieldRead3054200_10())] = 5;
    (__fieldRead3054200_12())[__call3054200_14(__fieldRead3054200_13())] = ((int) p1);
    return;
}
public static void h542_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054201_0())[__call3054201_2(__fieldRead3054201_1())] = 3;
    (__fieldRead3054201_3())[__call3054201_5(__fieldRead3054201_4())] = 4;
    (__fieldRead3054201_6())[__call3054201_8(__fieldRead3054201_7())] = 5;
    (__fieldRead3054201_9())[__call3054201_11(__fieldRead3054201_10())] = ((int) p1);
    return;
}
public static void h542_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054202_0())[__call3054202_2(__fieldRead3054202_1())] = 4;
    (__fieldRead3054202_3())[__call3054202_5(__fieldRead3054202_4())] = 5;
    (__fieldRead3054202_6())[__call3054202_8(__fieldRead3054202_7())] = ((int) p1);
    return;
}
public static void h542_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054203_0())[__call3054203_2(__fieldRead3054203_1())] = 5;
    (__fieldRead3054203_3())[__call3054203_5(__fieldRead3054203_4())] = ((int) p1);
    return;
}
public static void h542_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054204_0())[__call3054204_2(__fieldRead3054204_1())] = ((int) p1);
    return;
}
public static void h542_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call542_0() throws Throwable;
private static native java.lang.Class __call542_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call542_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call542_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call542_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call542_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call542_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call542_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar542_11(int a0) throws Throwable;
private static native byte[] __call542_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide542_23(long a0) throws Throwable;
private static native void __discardScalar542_24(int a0) throws Throwable;
private static native moom.bs[] __call542_25() throws Throwable;
private static native void __fieldWrite542_26(int[] a0) throws Throwable;
private static native int[] __fieldRead542_27() throws Throwable;
private static native moom.bs __fieldRead542_28() throws Throwable;
private static native int __call542_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead542_30() throws Throwable;
private static native moom.bs __fieldRead542_31() throws Throwable;
private static native int __call542_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead542_33() throws Throwable;
private static native moom.bs __fieldRead542_34() throws Throwable;
private static native int __call542_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead542_36() throws Throwable;
private static native moom.bs __fieldRead542_37() throws Throwable;
private static native int __call542_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead542_39() throws Throwable;
private static native moom.bs __fieldRead542_40() throws Throwable;
private static native int __call542_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead542_42() throws Throwable;
private static native moom.bs __fieldRead542_43() throws Throwable;
private static native int __call542_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054200_0() throws Throwable;
private static native moom.bs __fieldRead3054200_1() throws Throwable;
private static native int __call3054200_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054200_3() throws Throwable;
private static native moom.bs __fieldRead3054200_4() throws Throwable;
private static native int __call3054200_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054200_6() throws Throwable;
private static native moom.bs __fieldRead3054200_7() throws Throwable;
private static native int __call3054200_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054200_9() throws Throwable;
private static native moom.bs __fieldRead3054200_10() throws Throwable;
private static native int __call3054200_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054200_12() throws Throwable;
private static native moom.bs __fieldRead3054200_13() throws Throwable;
private static native int __call3054200_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054201_0() throws Throwable;
private static native moom.bs __fieldRead3054201_1() throws Throwable;
private static native int __call3054201_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054201_3() throws Throwable;
private static native moom.bs __fieldRead3054201_4() throws Throwable;
private static native int __call3054201_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054201_6() throws Throwable;
private static native moom.bs __fieldRead3054201_7() throws Throwable;
private static native int __call3054201_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054201_9() throws Throwable;
private static native moom.bs __fieldRead3054201_10() throws Throwable;
private static native int __call3054201_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054202_0() throws Throwable;
private static native moom.bs __fieldRead3054202_1() throws Throwable;
private static native int __call3054202_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054202_3() throws Throwable;
private static native moom.bs __fieldRead3054202_4() throws Throwable;
private static native int __call3054202_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054202_6() throws Throwable;
private static native moom.bs __fieldRead3054202_7() throws Throwable;
private static native int __call3054202_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054203_0() throws Throwable;
private static native moom.bs __fieldRead3054203_1() throws Throwable;
private static native int __call3054203_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054203_3() throws Throwable;
private static native moom.bs __fieldRead3054203_4() throws Throwable;
private static native int __call3054203_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054204_0() throws Throwable;
private static native moom.bs __fieldRead3054204_1() throws Throwable;
private static native int __call3054204_2(moom.bs a0) throws Throwable;

}

}
