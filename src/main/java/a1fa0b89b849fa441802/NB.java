package moom;


class NB {

static int[] a;

static { __sourceHandlerCall_1c00530f16a7d740c7c2(); }

private static native <E extends Throwable> void __sourceHandlerCall_1c00530f16a7d740c7c2() throws E;
private static final class __SourceHandler_1c00530f16a7d740c7c2 {

public static void f421() throws Throwable {
    javax.crypto.Cipher forestValue421_29_0;
    int forestValue421_29_1;
    javax.crypto.SecretKeyFactory forestValue421_29_2;
    byte[] forestValue421_29_3;
    javax.crypto.Cipher forestValue421_46_0;
    int forestValue421_46_1;
    javax.crypto.SecretKeyFactory forestValue421_46_2;
    byte[] forestValue421_46_3;
    javax.crypto.Cipher spill421_0;
    int spill421_1;
    javax.crypto.SecretKeyFactory spill421_2;
    byte[] spill421_3;
    byte[] spill421_4;
    int spill421_5;
    long spill421_6;
    byte[] spill421_7;
    byte[] spill421_8;
    byte[] spill421_9;
    byte[] spill421_10;
    byte[] spill421_11;
    byte[] spill421_12;
    byte[] spill421_13;
    byte[] spill421_14;
    long spill421_15;
    int spill421_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call421_3(__call421_2(1488831403176507521L, 3068943230047238981L, __call421_1(__call421_0())), 273687147190020L) ^ 13600319650138L);
    spill421_0 = (life1_13 = __call421_4("DES/CBC/NoPadding"));
    spill421_1 = 2;
    spill421_2 = __call421_5("DES");
    byte[] __stackOp421_6_0 = new byte[8];
    spill421_3 = __stackOp421_6_0;
    (__stackOp421_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue421_29_0 = spill421_0;
    forestValue421_29_1 = spill421_1;
    forestValue421_29_2 = spill421_2;
    forestValue421_29_3 = spill421_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue421_46_0 = forestValue421_29_0;
        forestValue421_46_1 = forestValue421_29_1;
        forestValue421_46_2 = forestValue421_29_2;
        forestValue421_46_3 = forestValue421_29_3;
        break forest_join_46;
    }
    byte[] __stackOp421_7_0 = forestValue421_29_3;
    spill421_4 = __stackOp421_7_0;
    (__stackOp421_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue421_29_3 = spill421_4;
    continue forest_cycle_29;
    }
    }
    __call421_9(forestValue421_46_0, forestValue421_46_1, __call421_8(forestValue421_46_2, new javax.crypto.spec.DESKeySpec(forestValue421_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp421_10_0 = 8268700333475075594L;
    int __stackOp421_10_1 = -1;
    spill421_5 = __stackOp421_10_1;
    spill421_6 = __stackOp421_10_0;
    __discardScalar421_11(__stackOp421_10_1);
    life3_62 = spill421_6;
    byte[] __stackOp421_12_0 = new byte[8];
    spill421_7 = __stackOp421_12_0;
    (__stackOp421_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp421_13_0 = spill421_7;
    spill421_8 = __stackOp421_13_0;
    (__stackOp421_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp421_14_0 = spill421_8;
    spill421_9 = __stackOp421_14_0;
    (__stackOp421_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp421_15_0 = spill421_9;
    spill421_10 = __stackOp421_15_0;
    (__stackOp421_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp421_16_0 = spill421_10;
    spill421_11 = __stackOp421_16_0;
    (__stackOp421_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp421_17_0 = spill421_11;
    spill421_12 = __stackOp421_17_0;
    (__stackOp421_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp421_18_0 = spill421_12;
    spill421_13 = __stackOp421_18_0;
    (__stackOp421_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp421_19_0 = spill421_13;
    spill421_14 = __stackOp421_19_0;
    (__stackOp421_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp421_20_0 = spill421_14;
    javax.crypto.Cipher __stackOp421_20_1 = life1_13;
    life5_130 = __call421_21(__stackOp421_20_1, __stackOp421_20_0);
    int __stackOp421_22_0 = spill421_5;
    long __stackOp421_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill421_15 = __stackOp421_22_1;
    spill421_16 = __stackOp421_22_0;
    __discardWide421_23(__stackOp421_22_1);
    __discardScalar421_24(spill421_16);
    life0_204 = spill421_15;
    __fieldWrite421_26(new int[(__call421_25()).length]);
    (__fieldRead421_27())[__call421_29(__fieldRead421_28())] = 1;
    (__fieldRead421_30())[__call421_32(__fieldRead421_31())] = 2;
    (__fieldRead421_33())[__call421_35(__fieldRead421_34())] = 3;
    (__fieldRead421_36())[__call421_38(__fieldRead421_37())] = 4;
    (__fieldRead421_39())[__call421_41(__fieldRead421_40())] = 5;
    (__fieldRead421_42())[__call421_44(__fieldRead421_43())] = ((int) life0_204);
    return;
}
public static void h421_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3042100_0())[__call3042100_2(__fieldRead3042100_1())] = 2;
    (__fieldRead3042100_3())[__call3042100_5(__fieldRead3042100_4())] = 3;
    (__fieldRead3042100_6())[__call3042100_8(__fieldRead3042100_7())] = 4;
    (__fieldRead3042100_9())[__call3042100_11(__fieldRead3042100_10())] = 5;
    (__fieldRead3042100_12())[__call3042100_14(__fieldRead3042100_13())] = ((int) p1);
    return;
}
public static void h421_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3042101_0())[__call3042101_2(__fieldRead3042101_1())] = 3;
    (__fieldRead3042101_3())[__call3042101_5(__fieldRead3042101_4())] = 4;
    (__fieldRead3042101_6())[__call3042101_8(__fieldRead3042101_7())] = 5;
    (__fieldRead3042101_9())[__call3042101_11(__fieldRead3042101_10())] = ((int) p1);
    return;
}
public static void h421_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3042102_0())[__call3042102_2(__fieldRead3042102_1())] = 4;
    (__fieldRead3042102_3())[__call3042102_5(__fieldRead3042102_4())] = 5;
    (__fieldRead3042102_6())[__call3042102_8(__fieldRead3042102_7())] = ((int) p1);
    return;
}
public static void h421_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3042103_0())[__call3042103_2(__fieldRead3042103_1())] = 5;
    (__fieldRead3042103_3())[__call3042103_5(__fieldRead3042103_4())] = ((int) p1);
    return;
}
public static void h421_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3042104_0())[__call3042104_2(__fieldRead3042104_1())] = ((int) p1);
    return;
}
public static void h421_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call421_0() throws Throwable;
private static native java.lang.Class __call421_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call421_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call421_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call421_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call421_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call421_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call421_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar421_11(int a0) throws Throwable;
private static native byte[] __call421_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide421_23(long a0) throws Throwable;
private static native void __discardScalar421_24(int a0) throws Throwable;
private static native moom.bZ[] __call421_25() throws Throwable;
private static native void __fieldWrite421_26(int[] a0) throws Throwable;
private static native int[] __fieldRead421_27() throws Throwable;
private static native moom.bZ __fieldRead421_28() throws Throwable;
private static native int __call421_29(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead421_30() throws Throwable;
private static native moom.bZ __fieldRead421_31() throws Throwable;
private static native int __call421_32(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead421_33() throws Throwable;
private static native moom.bZ __fieldRead421_34() throws Throwable;
private static native int __call421_35(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead421_36() throws Throwable;
private static native moom.bZ __fieldRead421_37() throws Throwable;
private static native int __call421_38(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead421_39() throws Throwable;
private static native moom.bZ __fieldRead421_40() throws Throwable;
private static native int __call421_41(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead421_42() throws Throwable;
private static native moom.bZ __fieldRead421_43() throws Throwable;
private static native int __call421_44(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042100_0() throws Throwable;
private static native moom.bZ __fieldRead3042100_1() throws Throwable;
private static native int __call3042100_2(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042100_3() throws Throwable;
private static native moom.bZ __fieldRead3042100_4() throws Throwable;
private static native int __call3042100_5(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042100_6() throws Throwable;
private static native moom.bZ __fieldRead3042100_7() throws Throwable;
private static native int __call3042100_8(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042100_9() throws Throwable;
private static native moom.bZ __fieldRead3042100_10() throws Throwable;
private static native int __call3042100_11(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042100_12() throws Throwable;
private static native moom.bZ __fieldRead3042100_13() throws Throwable;
private static native int __call3042100_14(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042101_0() throws Throwable;
private static native moom.bZ __fieldRead3042101_1() throws Throwable;
private static native int __call3042101_2(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042101_3() throws Throwable;
private static native moom.bZ __fieldRead3042101_4() throws Throwable;
private static native int __call3042101_5(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042101_6() throws Throwable;
private static native moom.bZ __fieldRead3042101_7() throws Throwable;
private static native int __call3042101_8(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042101_9() throws Throwable;
private static native moom.bZ __fieldRead3042101_10() throws Throwable;
private static native int __call3042101_11(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042102_0() throws Throwable;
private static native moom.bZ __fieldRead3042102_1() throws Throwable;
private static native int __call3042102_2(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042102_3() throws Throwable;
private static native moom.bZ __fieldRead3042102_4() throws Throwable;
private static native int __call3042102_5(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042102_6() throws Throwable;
private static native moom.bZ __fieldRead3042102_7() throws Throwable;
private static native int __call3042102_8(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042103_0() throws Throwable;
private static native moom.bZ __fieldRead3042103_1() throws Throwable;
private static native int __call3042103_2(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042103_3() throws Throwable;
private static native moom.bZ __fieldRead3042103_4() throws Throwable;
private static native int __call3042103_5(moom.bZ a0) throws Throwable;
private static native int[] __fieldRead3042104_0() throws Throwable;
private static native moom.bZ __fieldRead3042104_1() throws Throwable;
private static native int __call3042104_2(moom.bZ a0) throws Throwable;

}

}
