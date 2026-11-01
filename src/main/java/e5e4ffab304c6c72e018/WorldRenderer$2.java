package net.minecraft.client.renderer;


class WorldRenderer$2 {

static int[] a;

static { __sourceHandlerCall_269841c6c54588e79efd(); }

private static native <E extends Throwable> void __sourceHandlerCall_269841c6c54588e79efd() throws E;
private static final class __SourceHandler_269841c6c54588e79efd {

public static void f540() throws Throwable {
    javax.crypto.Cipher forestValue540_29_0;
    int forestValue540_29_1;
    javax.crypto.SecretKeyFactory forestValue540_29_2;
    byte[] forestValue540_29_3;
    javax.crypto.Cipher forestValue540_46_0;
    int forestValue540_46_1;
    javax.crypto.SecretKeyFactory forestValue540_46_2;
    byte[] forestValue540_46_3;
    javax.crypto.Cipher spill540_0;
    int spill540_1;
    javax.crypto.SecretKeyFactory spill540_2;
    byte[] spill540_3;
    byte[] spill540_4;
    java.lang.String spill540_5;
    int spill540_6;
    long[] spill540_7;
    int spill540_8;
    int spill540_9;
    long spill540_10;
    byte[] spill540_11;
    byte[] spill540_12;
    byte[] spill540_13;
    byte[] spill540_14;
    byte[] spill540_15;
    byte[] spill540_16;
    byte[] spill540_17;
    byte[] spill540_18;
    long spill540_19;
    int spill540_20;
    long life11_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long[] life0_59;
    int life4_61;
    java.lang.String life5_64;
    int life6_66;
    int life3_68;
    byte[] life7_76;
    long life8_153;
    byte[] life10_221;
    forest_join_46: {
    life11_9 = (__call540_3(__call540_2(8063297707773264276L, -5713983505142167576L, __call540_1(__call540_0())), 246241551139506L) ^ 71488320182159L);
    spill540_0 = (life1_13 = __call540_4("DES/CBC/NoPadding"));
    spill540_1 = 2;
    spill540_2 = __call540_5("DES");
    byte[] __stackOp540_6_0 = new byte[8];
    spill540_3 = __stackOp540_6_0;
    (__stackOp540_6_0)[0] = ((byte) ((int) (life11_9 >>> 56)));
    life2_28 = 1;
    forestValue540_29_0 = spill540_0;
    forestValue540_29_1 = spill540_1;
    forestValue540_29_2 = spill540_2;
    forestValue540_29_3 = spill540_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue540_46_0 = forestValue540_29_0;
        forestValue540_46_1 = forestValue540_29_1;
        forestValue540_46_2 = forestValue540_29_2;
        forestValue540_46_3 = forestValue540_29_3;
        break forest_join_46;
    }
    byte[] __stackOp540_7_0 = forestValue540_29_3;
    spill540_4 = __stackOp540_7_0;
    (__stackOp540_7_0)[life2_28] = ((byte) ((int) ((life11_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue540_29_3 = spill540_4;
    continue forest_cycle_29;
    }
    }
    __call540_9(forestValue540_46_0, forestValue540_46_1, __call540_8(forestValue540_46_2, new javax.crypto.spec.DESKeySpec(forestValue540_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life0_59 = new long[2];
    life4_61 = 0;
    life6_66 = __call540_10((life5_64 = "1ëÎë\0220÷<@\006¡%Ö\001"));
    life3_68 = 0;
    forest_cycle_69: while (true) {
    spill540_5 = life5_64;
    spill540_6 = life3_68;
    life3_68 += 8;
    life7_76 = __call540_12(__call540_11(spill540_5, spill540_6, life3_68), "ISO-8859-1");
    spill540_7 = life0_59;
    spill540_8 = (life4_61++);
    long __stackOp540_13_0 = (((((((((((long) (life7_76)[0]) & 255L) << 56) | ((((long) (life7_76)[1]) & 255L) << 48)) | ((((long) (life7_76)[2]) & 255L) << 40)) | ((((long) (life7_76)[3]) & 255L) << 32)) | ((((long) (life7_76)[4]) & 255L) << 24)) | ((((long) (life7_76)[5]) & 255L) << 16)) | ((((long) (life7_76)[6]) & 255L) << 8)) | (((long) (life7_76)[7]) & 255L));
    int __stackOp540_13_1 = -1;
    spill540_9 = __stackOp540_13_1;
    spill540_10 = __stackOp540_13_0;
    __discardScalar540_14(__stackOp540_13_1);
    life8_153 = spill540_10;
    byte[] __stackOp540_15_0 = new byte[8];
    spill540_11 = __stackOp540_15_0;
    (__stackOp540_15_0)[0] = ((byte) ((int) (life8_153 >>> 56)));
    byte[] __stackOp540_16_0 = spill540_11;
    spill540_12 = __stackOp540_16_0;
    (__stackOp540_16_0)[1] = ((byte) ((int) (life8_153 >>> 48)));
    byte[] __stackOp540_17_0 = spill540_12;
    spill540_13 = __stackOp540_17_0;
    (__stackOp540_17_0)[2] = ((byte) ((int) (life8_153 >>> 40)));
    byte[] __stackOp540_18_0 = spill540_13;
    spill540_14 = __stackOp540_18_0;
    (__stackOp540_18_0)[3] = ((byte) ((int) (life8_153 >>> 32)));
    byte[] __stackOp540_19_0 = spill540_14;
    spill540_15 = __stackOp540_19_0;
    (__stackOp540_19_0)[4] = ((byte) ((int) (life8_153 >>> 24)));
    byte[] __stackOp540_20_0 = spill540_15;
    spill540_16 = __stackOp540_20_0;
    (__stackOp540_20_0)[5] = ((byte) ((int) (life8_153 >>> 16)));
    byte[] __stackOp540_21_0 = spill540_16;
    spill540_17 = __stackOp540_21_0;
    (__stackOp540_21_0)[6] = ((byte) ((int) (life8_153 >>> 8)));
    byte[] __stackOp540_22_0 = spill540_17;
    spill540_18 = __stackOp540_22_0;
    (__stackOp540_22_0)[7] = ((byte) ((int) life8_153));
    byte[] __stackOp540_23_0 = spill540_18;
    javax.crypto.Cipher __stackOp540_23_1 = life1_13;
    life10_221 = __call540_24(__stackOp540_23_1, __stackOp540_23_0);
    int __stackOp540_25_0 = spill540_9;
    long __stackOp540_25_1 = (((((((((((long) (life10_221)[0]) & 255L) << 56) | ((((long) (life10_221)[1]) & 255L) << 48)) | ((((long) (life10_221)[2]) & 255L) << 40)) | ((((long) (life10_221)[3]) & 255L) << 32)) | ((((long) (life10_221)[4]) & 255L) << 24)) | ((((long) (life10_221)[5]) & 255L) << 16)) | ((((long) (life10_221)[6]) & 255L) << 8)) | (((long) (life10_221)[7]) & 255L));
    spill540_19 = __stackOp540_25_1;
    spill540_20 = __stackOp540_25_0;
    __discardWide540_26(__stackOp540_25_1);
    __discardScalar540_27(spill540_20);
    (spill540_7)[spill540_8] = spill540_19;
    if (!((life3_68 >= life6_66))) {
        continue forest_cycle_69;
    }
    break forest_cycle_69;
    }
    __fieldWrite540_29(new int[(__call540_28()).length]);
    (__fieldRead540_30())[__call540_32(__fieldRead540_31())] = 1;
    (__fieldRead540_33())[__call540_35(__fieldRead540_34())] = 2;
    (__fieldRead540_36())[__call540_38(__fieldRead540_37())] = 3;
    (__fieldRead540_39())[__call540_41(__fieldRead540_40())] = 4;
    (__fieldRead540_42())[__call540_44(__fieldRead540_43())] = 5;
    (__fieldRead540_45())[__call540_47(__fieldRead540_46())] = ((int) (life0_59)[1]);
    (__fieldRead540_48())[__call540_50(__fieldRead540_49())] = ((int) (life0_59)[0]);
    return;
}
public static void h540_0(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3054000_0())[__call3054000_2(__fieldRead3054000_1())] = 2;
    (__fieldRead3054000_3())[__call3054000_5(__fieldRead3054000_4())] = 3;
    (__fieldRead3054000_6())[__call3054000_8(__fieldRead3054000_7())] = 4;
    (__fieldRead3054000_9())[__call3054000_11(__fieldRead3054000_10())] = 5;
    (__fieldRead3054000_12())[__call3054000_14(__fieldRead3054000_13())] = ((int) (p1)[1]);
    (__fieldRead3054000_15())[__call3054000_17(__fieldRead3054000_16())] = ((int) (p1)[0]);
    return;
}
public static void h540_1(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3054001_0())[__call3054001_2(__fieldRead3054001_1())] = 3;
    (__fieldRead3054001_3())[__call3054001_5(__fieldRead3054001_4())] = 4;
    (__fieldRead3054001_6())[__call3054001_8(__fieldRead3054001_7())] = 5;
    (__fieldRead3054001_9())[__call3054001_11(__fieldRead3054001_10())] = ((int) (p1)[1]);
    (__fieldRead3054001_12())[__call3054001_14(__fieldRead3054001_13())] = ((int) (p1)[0]);
    return;
}
public static void h540_2(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3054002_0())[__call3054002_2(__fieldRead3054002_1())] = 4;
    (__fieldRead3054002_3())[__call3054002_5(__fieldRead3054002_4())] = 5;
    (__fieldRead3054002_6())[__call3054002_8(__fieldRead3054002_7())] = ((int) (p1)[1]);
    (__fieldRead3054002_9())[__call3054002_11(__fieldRead3054002_10())] = ((int) (p1)[0]);
    return;
}
public static void h540_3(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3054003_0())[__call3054003_2(__fieldRead3054003_1())] = 5;
    (__fieldRead3054003_3())[__call3054003_5(__fieldRead3054003_4())] = ((int) (p1)[1]);
    (__fieldRead3054003_6())[__call3054003_8(__fieldRead3054003_7())] = ((int) (p1)[0]);
    return;
}
public static void h540_4(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3054004_0())[__call3054004_2(__fieldRead3054004_1())] = ((int) (p1)[1]);
    (__fieldRead3054004_3())[__call3054004_5(__fieldRead3054004_4())] = ((int) (p1)[0]);
    return;
}
public static void h540_5(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3054005_0())[__call3054005_2(__fieldRead3054005_1())] = ((int) (p1)[0]);
    return;
}
public static void h540_6(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call540_0() throws Throwable;
private static native java.lang.Class __call540_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call540_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call540_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call540_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call540_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call540_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call540_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call540_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call540_11(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call540_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar540_14(int a0) throws Throwable;
private static native byte[] __call540_24(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide540_26(long a0) throws Throwable;
private static native void __discardScalar540_27(int a0) throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType[] __call540_28() throws Throwable;
private static native void __fieldWrite540_29(int[] a0) throws Throwable;
private static native int[] __fieldRead540_30() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead540_31() throws Throwable;
private static native int __call540_32(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead540_33() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead540_34() throws Throwable;
private static native int __call540_35(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead540_36() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead540_37() throws Throwable;
private static native int __call540_38(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead540_39() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead540_40() throws Throwable;
private static native int __call540_41(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead540_42() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead540_43() throws Throwable;
private static native int __call540_44(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead540_45() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead540_46() throws Throwable;
private static native int __call540_47(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead540_48() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead540_49() throws Throwable;
private static native int __call540_50(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054000_0() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054000_1() throws Throwable;
private static native int __call3054000_2(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054000_3() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054000_4() throws Throwable;
private static native int __call3054000_5(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054000_6() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054000_7() throws Throwable;
private static native int __call3054000_8(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054000_9() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054000_10() throws Throwable;
private static native int __call3054000_11(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054000_12() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054000_13() throws Throwable;
private static native int __call3054000_14(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054000_15() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054000_16() throws Throwable;
private static native int __call3054000_17(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054001_0() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054001_1() throws Throwable;
private static native int __call3054001_2(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054001_3() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054001_4() throws Throwable;
private static native int __call3054001_5(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054001_6() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054001_7() throws Throwable;
private static native int __call3054001_8(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054001_9() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054001_10() throws Throwable;
private static native int __call3054001_11(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054001_12() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054001_13() throws Throwable;
private static native int __call3054001_14(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054002_0() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054002_1() throws Throwable;
private static native int __call3054002_2(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054002_3() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054002_4() throws Throwable;
private static native int __call3054002_5(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054002_6() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054002_7() throws Throwable;
private static native int __call3054002_8(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054002_9() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054002_10() throws Throwable;
private static native int __call3054002_11(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054003_0() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054003_1() throws Throwable;
private static native int __call3054003_2(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054003_3() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054003_4() throws Throwable;
private static native int __call3054003_5(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054003_6() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054003_7() throws Throwable;
private static native int __call3054003_8(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054004_0() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054004_1() throws Throwable;
private static native int __call3054004_2(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054004_3() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054004_4() throws Throwable;
private static native int __call3054004_5(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;
private static native int[] __fieldRead3054005_0() throws Throwable;
private static native net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType __fieldRead3054005_1() throws Throwable;
private static native int __call3054005_2(net.minecraft.client.renderer.vertex.VertexFormatElement$EnumType a0) throws Throwable;

}

}
