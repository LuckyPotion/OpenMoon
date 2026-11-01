package net.minecraft.client.renderer.block.model;


class ItemCameraTransforms$1 {

static int[] a;

static { __sourceHandlerCall_f0310a61e144a5467c8e(); }

private static native <E extends Throwable> void __sourceHandlerCall_f0310a61e144a5467c8e() throws E;
private static final class __SourceHandler_f0310a61e144a5467c8e {

public static void f545() throws Throwable {
    javax.crypto.Cipher forestValue545_29_0;
    int forestValue545_29_1;
    javax.crypto.SecretKeyFactory forestValue545_29_2;
    byte[] forestValue545_29_3;
    javax.crypto.Cipher forestValue545_46_0;
    int forestValue545_46_1;
    javax.crypto.SecretKeyFactory forestValue545_46_2;
    byte[] forestValue545_46_3;
    javax.crypto.Cipher spill545_0;
    int spill545_1;
    javax.crypto.SecretKeyFactory spill545_2;
    byte[] spill545_3;
    byte[] spill545_4;
    int spill545_5;
    long spill545_6;
    byte[] spill545_7;
    byte[] spill545_8;
    byte[] spill545_9;
    byte[] spill545_10;
    byte[] spill545_11;
    byte[] spill545_12;
    byte[] spill545_13;
    byte[] spill545_14;
    long spill545_15;
    int spill545_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call545_3(__call545_2(4952497584418187932L, -1648987246392742252L, __call545_1(__call545_0())), 264446815327668L) ^ 40998680315311L);
    spill545_0 = (life1_13 = __call545_4("DES/CBC/NoPadding"));
    spill545_1 = 2;
    spill545_2 = __call545_5("DES");
    byte[] __stackOp545_6_0 = new byte[8];
    spill545_3 = __stackOp545_6_0;
    (__stackOp545_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue545_29_0 = spill545_0;
    forestValue545_29_1 = spill545_1;
    forestValue545_29_2 = spill545_2;
    forestValue545_29_3 = spill545_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue545_46_0 = forestValue545_29_0;
        forestValue545_46_1 = forestValue545_29_1;
        forestValue545_46_2 = forestValue545_29_2;
        forestValue545_46_3 = forestValue545_29_3;
        break forest_join_46;
    }
    byte[] __stackOp545_7_0 = forestValue545_29_3;
    spill545_4 = __stackOp545_7_0;
    (__stackOp545_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue545_29_3 = spill545_4;
    continue forest_cycle_29;
    }
    }
    __call545_9(forestValue545_46_0, forestValue545_46_1, __call545_8(forestValue545_46_2, new javax.crypto.spec.DESKeySpec(forestValue545_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp545_10_0 = -4922773936352859508L;
    int __stackOp545_10_1 = -1;
    spill545_5 = __stackOp545_10_1;
    spill545_6 = __stackOp545_10_0;
    __discardScalar545_11(__stackOp545_10_1);
    life3_62 = spill545_6;
    byte[] __stackOp545_12_0 = new byte[8];
    spill545_7 = __stackOp545_12_0;
    (__stackOp545_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp545_13_0 = spill545_7;
    spill545_8 = __stackOp545_13_0;
    (__stackOp545_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp545_14_0 = spill545_8;
    spill545_9 = __stackOp545_14_0;
    (__stackOp545_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp545_15_0 = spill545_9;
    spill545_10 = __stackOp545_15_0;
    (__stackOp545_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp545_16_0 = spill545_10;
    spill545_11 = __stackOp545_16_0;
    (__stackOp545_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp545_17_0 = spill545_11;
    spill545_12 = __stackOp545_17_0;
    (__stackOp545_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp545_18_0 = spill545_12;
    spill545_13 = __stackOp545_18_0;
    (__stackOp545_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp545_19_0 = spill545_13;
    spill545_14 = __stackOp545_19_0;
    (__stackOp545_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp545_20_0 = spill545_14;
    javax.crypto.Cipher __stackOp545_20_1 = life1_13;
    life5_130 = __call545_21(__stackOp545_20_1, __stackOp545_20_0);
    int __stackOp545_22_0 = spill545_5;
    long __stackOp545_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill545_15 = __stackOp545_22_1;
    spill545_16 = __stackOp545_22_0;
    __discardWide545_23(__stackOp545_22_1);
    __discardScalar545_24(spill545_16);
    life0_204 = spill545_15;
    __fieldWrite545_26(new int[(__call545_25()).length]);
    (__fieldRead545_27())[__call545_29(__fieldRead545_28())] = 1;
    (__fieldRead545_30())[__call545_32(__fieldRead545_31())] = 2;
    (__fieldRead545_33())[__call545_35(__fieldRead545_34())] = 3;
    (__fieldRead545_36())[__call545_38(__fieldRead545_37())] = 4;
    (__fieldRead545_39())[__call545_41(__fieldRead545_40())] = 5;
    (__fieldRead545_42())[__call545_44(__fieldRead545_43())] = ((int) life0_204);
    return;
}
public static void h545_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054500_0())[__call3054500_2(__fieldRead3054500_1())] = 2;
    (__fieldRead3054500_3())[__call3054500_5(__fieldRead3054500_4())] = 3;
    (__fieldRead3054500_6())[__call3054500_8(__fieldRead3054500_7())] = 4;
    (__fieldRead3054500_9())[__call3054500_11(__fieldRead3054500_10())] = 5;
    (__fieldRead3054500_12())[__call3054500_14(__fieldRead3054500_13())] = ((int) p1);
    return;
}
public static void h545_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054501_0())[__call3054501_2(__fieldRead3054501_1())] = 3;
    (__fieldRead3054501_3())[__call3054501_5(__fieldRead3054501_4())] = 4;
    (__fieldRead3054501_6())[__call3054501_8(__fieldRead3054501_7())] = 5;
    (__fieldRead3054501_9())[__call3054501_11(__fieldRead3054501_10())] = ((int) p1);
    return;
}
public static void h545_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054502_0())[__call3054502_2(__fieldRead3054502_1())] = 4;
    (__fieldRead3054502_3())[__call3054502_5(__fieldRead3054502_4())] = 5;
    (__fieldRead3054502_6())[__call3054502_8(__fieldRead3054502_7())] = ((int) p1);
    return;
}
public static void h545_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054503_0())[__call3054503_2(__fieldRead3054503_1())] = 5;
    (__fieldRead3054503_3())[__call3054503_5(__fieldRead3054503_4())] = ((int) p1);
    return;
}
public static void h545_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054504_0())[__call3054504_2(__fieldRead3054504_1())] = ((int) p1);
    return;
}
public static void h545_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call545_0() throws Throwable;
private static native java.lang.Class __call545_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call545_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call545_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call545_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call545_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call545_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call545_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar545_11(int a0) throws Throwable;
private static native byte[] __call545_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide545_23(long a0) throws Throwable;
private static native void __discardScalar545_24(int a0) throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType[] __call545_25() throws Throwable;
private static native void __fieldWrite545_26(int[] a0) throws Throwable;
private static native int[] __fieldRead545_27() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead545_28() throws Throwable;
private static native int __call545_29(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead545_30() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead545_31() throws Throwable;
private static native int __call545_32(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead545_33() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead545_34() throws Throwable;
private static native int __call545_35(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead545_36() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead545_37() throws Throwable;
private static native int __call545_38(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead545_39() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead545_40() throws Throwable;
private static native int __call545_41(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead545_42() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead545_43() throws Throwable;
private static native int __call545_44(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054500_0() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054500_1() throws Throwable;
private static native int __call3054500_2(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054500_3() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054500_4() throws Throwable;
private static native int __call3054500_5(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054500_6() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054500_7() throws Throwable;
private static native int __call3054500_8(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054500_9() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054500_10() throws Throwable;
private static native int __call3054500_11(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054500_12() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054500_13() throws Throwable;
private static native int __call3054500_14(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054501_0() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054501_1() throws Throwable;
private static native int __call3054501_2(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054501_3() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054501_4() throws Throwable;
private static native int __call3054501_5(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054501_6() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054501_7() throws Throwable;
private static native int __call3054501_8(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054501_9() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054501_10() throws Throwable;
private static native int __call3054501_11(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054502_0() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054502_1() throws Throwable;
private static native int __call3054502_2(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054502_3() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054502_4() throws Throwable;
private static native int __call3054502_5(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054502_6() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054502_7() throws Throwable;
private static native int __call3054502_8(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054503_0() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054503_1() throws Throwable;
private static native int __call3054503_2(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054503_3() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054503_4() throws Throwable;
private static native int __call3054503_5(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;
private static native int[] __fieldRead3054504_0() throws Throwable;
private static native net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType __fieldRead3054504_1() throws Throwable;
private static native int __call3054504_2(net.minecraft.client.renderer.block.model.ItemCameraTransforms$TransformType a0) throws Throwable;

}

}
