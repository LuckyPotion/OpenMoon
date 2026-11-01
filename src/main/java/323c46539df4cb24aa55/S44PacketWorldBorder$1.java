package net.minecraft.network.play.server;


class S44PacketWorldBorder$1 {

static int[] a;

static { __sourceHandlerCall_8135fefdef9e91ba80b3(); }

private static native <E extends Throwable> void __sourceHandlerCall_8135fefdef9e91ba80b3() throws E;
private static final class __SourceHandler_8135fefdef9e91ba80b3 {

public static void f571() throws Throwable {
    javax.crypto.Cipher forestValue571_29_0;
    int forestValue571_29_1;
    javax.crypto.SecretKeyFactory forestValue571_29_2;
    byte[] forestValue571_29_3;
    javax.crypto.Cipher forestValue571_46_0;
    int forestValue571_46_1;
    javax.crypto.SecretKeyFactory forestValue571_46_2;
    byte[] forestValue571_46_3;
    javax.crypto.Cipher spill571_0;
    int spill571_1;
    javax.crypto.SecretKeyFactory spill571_2;
    byte[] spill571_3;
    byte[] spill571_4;
    int spill571_5;
    long spill571_6;
    byte[] spill571_7;
    byte[] spill571_8;
    byte[] spill571_9;
    byte[] spill571_10;
    byte[] spill571_11;
    byte[] spill571_12;
    byte[] spill571_13;
    byte[] spill571_14;
    long spill571_15;
    int spill571_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call571_3(__call571_2(8582704255369337116L, 998648760401650217L, __call571_1(__call571_0())), 265629540233386L) ^ 43360004112758L);
    spill571_0 = (life1_13 = __call571_4("DES/CBC/NoPadding"));
    spill571_1 = 2;
    spill571_2 = __call571_5("DES");
    byte[] __stackOp571_6_0 = new byte[8];
    spill571_3 = __stackOp571_6_0;
    (__stackOp571_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue571_29_0 = spill571_0;
    forestValue571_29_1 = spill571_1;
    forestValue571_29_2 = spill571_2;
    forestValue571_29_3 = spill571_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue571_46_0 = forestValue571_29_0;
        forestValue571_46_1 = forestValue571_29_1;
        forestValue571_46_2 = forestValue571_29_2;
        forestValue571_46_3 = forestValue571_29_3;
        break forest_join_46;
    }
    byte[] __stackOp571_7_0 = forestValue571_29_3;
    spill571_4 = __stackOp571_7_0;
    (__stackOp571_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue571_29_3 = spill571_4;
    continue forest_cycle_29;
    }
    }
    __call571_9(forestValue571_46_0, forestValue571_46_1, __call571_8(forestValue571_46_2, new javax.crypto.spec.DESKeySpec(forestValue571_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp571_10_0 = -1702086017670447078L;
    int __stackOp571_10_1 = -1;
    spill571_5 = __stackOp571_10_1;
    spill571_6 = __stackOp571_10_0;
    __discardScalar571_11(__stackOp571_10_1);
    life3_62 = spill571_6;
    byte[] __stackOp571_12_0 = new byte[8];
    spill571_7 = __stackOp571_12_0;
    (__stackOp571_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp571_13_0 = spill571_7;
    spill571_8 = __stackOp571_13_0;
    (__stackOp571_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp571_14_0 = spill571_8;
    spill571_9 = __stackOp571_14_0;
    (__stackOp571_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp571_15_0 = spill571_9;
    spill571_10 = __stackOp571_15_0;
    (__stackOp571_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp571_16_0 = spill571_10;
    spill571_11 = __stackOp571_16_0;
    (__stackOp571_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp571_17_0 = spill571_11;
    spill571_12 = __stackOp571_17_0;
    (__stackOp571_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp571_18_0 = spill571_12;
    spill571_13 = __stackOp571_18_0;
    (__stackOp571_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp571_19_0 = spill571_13;
    spill571_14 = __stackOp571_19_0;
    (__stackOp571_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp571_20_0 = spill571_14;
    javax.crypto.Cipher __stackOp571_20_1 = life1_13;
    life5_130 = __call571_21(__stackOp571_20_1, __stackOp571_20_0);
    int __stackOp571_22_0 = spill571_5;
    long __stackOp571_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill571_15 = __stackOp571_22_1;
    spill571_16 = __stackOp571_22_0;
    __discardWide571_23(__stackOp571_22_1);
    __discardScalar571_24(spill571_16);
    life0_204 = spill571_15;
    __fieldWrite571_26(new int[(__call571_25()).length]);
    (__fieldRead571_27())[__call571_29(__fieldRead571_28())] = 1;
    (__fieldRead571_30())[__call571_32(__fieldRead571_31())] = 2;
    (__fieldRead571_33())[__call571_35(__fieldRead571_34())] = 3;
    (__fieldRead571_36())[__call571_38(__fieldRead571_37())] = 4;
    (__fieldRead571_39())[__call571_41(__fieldRead571_40())] = 5;
    (__fieldRead571_42())[__call571_44(__fieldRead571_43())] = ((int) life0_204);
    return;
}
public static void h571_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3057100_0())[__call3057100_2(__fieldRead3057100_1())] = 2;
    (__fieldRead3057100_3())[__call3057100_5(__fieldRead3057100_4())] = 3;
    (__fieldRead3057100_6())[__call3057100_8(__fieldRead3057100_7())] = 4;
    (__fieldRead3057100_9())[__call3057100_11(__fieldRead3057100_10())] = 5;
    (__fieldRead3057100_12())[__call3057100_14(__fieldRead3057100_13())] = ((int) p1);
    return;
}
public static void h571_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3057101_0())[__call3057101_2(__fieldRead3057101_1())] = 3;
    (__fieldRead3057101_3())[__call3057101_5(__fieldRead3057101_4())] = 4;
    (__fieldRead3057101_6())[__call3057101_8(__fieldRead3057101_7())] = 5;
    (__fieldRead3057101_9())[__call3057101_11(__fieldRead3057101_10())] = ((int) p1);
    return;
}
public static void h571_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3057102_0())[__call3057102_2(__fieldRead3057102_1())] = 4;
    (__fieldRead3057102_3())[__call3057102_5(__fieldRead3057102_4())] = 5;
    (__fieldRead3057102_6())[__call3057102_8(__fieldRead3057102_7())] = ((int) p1);
    return;
}
public static void h571_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3057103_0())[__call3057103_2(__fieldRead3057103_1())] = 5;
    (__fieldRead3057103_3())[__call3057103_5(__fieldRead3057103_4())] = ((int) p1);
    return;
}
public static void h571_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3057104_0())[__call3057104_2(__fieldRead3057104_1())] = ((int) p1);
    return;
}
public static void h571_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call571_0() throws Throwable;
private static native java.lang.Class __call571_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call571_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call571_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call571_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call571_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call571_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call571_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar571_11(int a0) throws Throwable;
private static native byte[] __call571_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide571_23(long a0) throws Throwable;
private static native void __discardScalar571_24(int a0) throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action[] __call571_25() throws Throwable;
private static native void __fieldWrite571_26(int[] a0) throws Throwable;
private static native int[] __fieldRead571_27() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead571_28() throws Throwable;
private static native int __call571_29(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead571_30() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead571_31() throws Throwable;
private static native int __call571_32(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead571_33() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead571_34() throws Throwable;
private static native int __call571_35(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead571_36() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead571_37() throws Throwable;
private static native int __call571_38(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead571_39() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead571_40() throws Throwable;
private static native int __call571_41(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead571_42() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead571_43() throws Throwable;
private static native int __call571_44(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057100_0() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057100_1() throws Throwable;
private static native int __call3057100_2(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057100_3() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057100_4() throws Throwable;
private static native int __call3057100_5(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057100_6() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057100_7() throws Throwable;
private static native int __call3057100_8(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057100_9() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057100_10() throws Throwable;
private static native int __call3057100_11(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057100_12() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057100_13() throws Throwable;
private static native int __call3057100_14(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057101_0() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057101_1() throws Throwable;
private static native int __call3057101_2(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057101_3() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057101_4() throws Throwable;
private static native int __call3057101_5(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057101_6() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057101_7() throws Throwable;
private static native int __call3057101_8(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057101_9() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057101_10() throws Throwable;
private static native int __call3057101_11(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057102_0() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057102_1() throws Throwable;
private static native int __call3057102_2(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057102_3() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057102_4() throws Throwable;
private static native int __call3057102_5(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057102_6() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057102_7() throws Throwable;
private static native int __call3057102_8(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057103_0() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057103_1() throws Throwable;
private static native int __call3057103_2(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057103_3() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057103_4() throws Throwable;
private static native int __call3057103_5(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;
private static native int[] __fieldRead3057104_0() throws Throwable;
private static native net.minecraft.network.play.server.S44PacketWorldBorder$Action __fieldRead3057104_1() throws Throwable;
private static native int __call3057104_2(net.minecraft.network.play.server.S44PacketWorldBorder$Action a0) throws Throwable;

}

}
