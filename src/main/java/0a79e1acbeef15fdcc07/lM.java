package moom;


class lM {

static int[] a;

static { __sourceHandlerCall_e94a143f1057ecb41542(); }

private static native <E extends Throwable> void __sourceHandlerCall_e94a143f1057ecb41542() throws E;
private static final class __SourceHandler_e94a143f1057ecb41542 {

public static void f477() throws Throwable {
    javax.crypto.Cipher forestValue477_29_0;
    int forestValue477_29_1;
    javax.crypto.SecretKeyFactory forestValue477_29_2;
    byte[] forestValue477_29_3;
    javax.crypto.Cipher forestValue477_46_0;
    int forestValue477_46_1;
    javax.crypto.SecretKeyFactory forestValue477_46_2;
    byte[] forestValue477_46_3;
    javax.crypto.Cipher spill477_0;
    int spill477_1;
    javax.crypto.SecretKeyFactory spill477_2;
    byte[] spill477_3;
    byte[] spill477_4;
    int spill477_5;
    long spill477_6;
    byte[] spill477_7;
    byte[] spill477_8;
    byte[] spill477_9;
    byte[] spill477_10;
    byte[] spill477_11;
    byte[] spill477_12;
    byte[] spill477_13;
    byte[] spill477_14;
    long spill477_15;
    int spill477_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call477_3(__call477_2(1306938548520124085L, -7599732144837154103L, __call477_1(__call477_0())), 187701887035356L) ^ 11699586723777L);
    spill477_0 = (life1_13 = __call477_4("DES/CBC/NoPadding"));
    spill477_1 = 2;
    spill477_2 = __call477_5("DES");
    byte[] __stackOp477_6_0 = new byte[8];
    spill477_3 = __stackOp477_6_0;
    (__stackOp477_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue477_29_0 = spill477_0;
    forestValue477_29_1 = spill477_1;
    forestValue477_29_2 = spill477_2;
    forestValue477_29_3 = spill477_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue477_46_0 = forestValue477_29_0;
        forestValue477_46_1 = forestValue477_29_1;
        forestValue477_46_2 = forestValue477_29_2;
        forestValue477_46_3 = forestValue477_29_3;
        break forest_join_46;
    }
    byte[] __stackOp477_7_0 = forestValue477_29_3;
    spill477_4 = __stackOp477_7_0;
    (__stackOp477_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue477_29_3 = spill477_4;
    continue forest_cycle_29;
    }
    }
    __call477_9(forestValue477_46_0, forestValue477_46_1, __call477_8(forestValue477_46_2, new javax.crypto.spec.DESKeySpec(forestValue477_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp477_10_0 = -3826449218844264180L;
    int __stackOp477_10_1 = -1;
    spill477_5 = __stackOp477_10_1;
    spill477_6 = __stackOp477_10_0;
    __discardScalar477_11(__stackOp477_10_1);
    life3_62 = spill477_6;
    byte[] __stackOp477_12_0 = new byte[8];
    spill477_7 = __stackOp477_12_0;
    (__stackOp477_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp477_13_0 = spill477_7;
    spill477_8 = __stackOp477_13_0;
    (__stackOp477_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp477_14_0 = spill477_8;
    spill477_9 = __stackOp477_14_0;
    (__stackOp477_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp477_15_0 = spill477_9;
    spill477_10 = __stackOp477_15_0;
    (__stackOp477_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp477_16_0 = spill477_10;
    spill477_11 = __stackOp477_16_0;
    (__stackOp477_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp477_17_0 = spill477_11;
    spill477_12 = __stackOp477_17_0;
    (__stackOp477_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp477_18_0 = spill477_12;
    spill477_13 = __stackOp477_18_0;
    (__stackOp477_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp477_19_0 = spill477_13;
    spill477_14 = __stackOp477_19_0;
    (__stackOp477_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp477_20_0 = spill477_14;
    javax.crypto.Cipher __stackOp477_20_1 = life1_13;
    life5_130 = __call477_21(__stackOp477_20_1, __stackOp477_20_0);
    int __stackOp477_22_0 = spill477_5;
    long __stackOp477_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill477_15 = __stackOp477_22_1;
    spill477_16 = __stackOp477_22_0;
    __discardWide477_23(__stackOp477_22_1);
    __discardScalar477_24(spill477_16);
    life0_204 = spill477_15;
    __fieldWrite477_26(new int[(__call477_25()).length]);
    (__fieldRead477_27())[__call477_29(__fieldRead477_28())] = 1;
    (__fieldRead477_30())[__call477_32(__fieldRead477_31())] = 2;
    (__fieldRead477_33())[__call477_35(__fieldRead477_34())] = 3;
    (__fieldRead477_36())[__call477_38(__fieldRead477_37())] = 4;
    (__fieldRead477_39())[__call477_41(__fieldRead477_40())] = 5;
    (__fieldRead477_42())[__call477_44(__fieldRead477_43())] = ((int) life0_204);
    return;
}
public static void h477_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047700_0())[__call3047700_2(__fieldRead3047700_1())] = 2;
    (__fieldRead3047700_3())[__call3047700_5(__fieldRead3047700_4())] = 3;
    (__fieldRead3047700_6())[__call3047700_8(__fieldRead3047700_7())] = 4;
    (__fieldRead3047700_9())[__call3047700_11(__fieldRead3047700_10())] = 5;
    (__fieldRead3047700_12())[__call3047700_14(__fieldRead3047700_13())] = ((int) p1);
    return;
}
public static void h477_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047701_0())[__call3047701_2(__fieldRead3047701_1())] = 3;
    (__fieldRead3047701_3())[__call3047701_5(__fieldRead3047701_4())] = 4;
    (__fieldRead3047701_6())[__call3047701_8(__fieldRead3047701_7())] = 5;
    (__fieldRead3047701_9())[__call3047701_11(__fieldRead3047701_10())] = ((int) p1);
    return;
}
public static void h477_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047702_0())[__call3047702_2(__fieldRead3047702_1())] = 4;
    (__fieldRead3047702_3())[__call3047702_5(__fieldRead3047702_4())] = 5;
    (__fieldRead3047702_6())[__call3047702_8(__fieldRead3047702_7())] = ((int) p1);
    return;
}
public static void h477_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047703_0())[__call3047703_2(__fieldRead3047703_1())] = 5;
    (__fieldRead3047703_3())[__call3047703_5(__fieldRead3047703_4())] = ((int) p1);
    return;
}
public static void h477_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047704_0())[__call3047704_2(__fieldRead3047704_1())] = ((int) p1);
    return;
}
public static void h477_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call477_0() throws Throwable;
private static native java.lang.Class __call477_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call477_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call477_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call477_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call477_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call477_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call477_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar477_11(int a0) throws Throwable;
private static native byte[] __call477_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide477_23(long a0) throws Throwable;
private static native void __discardScalar477_24(int a0) throws Throwable;
private static native moom.bs[] __call477_25() throws Throwable;
private static native void __fieldWrite477_26(int[] a0) throws Throwable;
private static native int[] __fieldRead477_27() throws Throwable;
private static native moom.bs __fieldRead477_28() throws Throwable;
private static native int __call477_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead477_30() throws Throwable;
private static native moom.bs __fieldRead477_31() throws Throwable;
private static native int __call477_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead477_33() throws Throwable;
private static native moom.bs __fieldRead477_34() throws Throwable;
private static native int __call477_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead477_36() throws Throwable;
private static native moom.bs __fieldRead477_37() throws Throwable;
private static native int __call477_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead477_39() throws Throwable;
private static native moom.bs __fieldRead477_40() throws Throwable;
private static native int __call477_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead477_42() throws Throwable;
private static native moom.bs __fieldRead477_43() throws Throwable;
private static native int __call477_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047700_0() throws Throwable;
private static native moom.bs __fieldRead3047700_1() throws Throwable;
private static native int __call3047700_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047700_3() throws Throwable;
private static native moom.bs __fieldRead3047700_4() throws Throwable;
private static native int __call3047700_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047700_6() throws Throwable;
private static native moom.bs __fieldRead3047700_7() throws Throwable;
private static native int __call3047700_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047700_9() throws Throwable;
private static native moom.bs __fieldRead3047700_10() throws Throwable;
private static native int __call3047700_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047700_12() throws Throwable;
private static native moom.bs __fieldRead3047700_13() throws Throwable;
private static native int __call3047700_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047701_0() throws Throwable;
private static native moom.bs __fieldRead3047701_1() throws Throwable;
private static native int __call3047701_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047701_3() throws Throwable;
private static native moom.bs __fieldRead3047701_4() throws Throwable;
private static native int __call3047701_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047701_6() throws Throwable;
private static native moom.bs __fieldRead3047701_7() throws Throwable;
private static native int __call3047701_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047701_9() throws Throwable;
private static native moom.bs __fieldRead3047701_10() throws Throwable;
private static native int __call3047701_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047702_0() throws Throwable;
private static native moom.bs __fieldRead3047702_1() throws Throwable;
private static native int __call3047702_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047702_3() throws Throwable;
private static native moom.bs __fieldRead3047702_4() throws Throwable;
private static native int __call3047702_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047702_6() throws Throwable;
private static native moom.bs __fieldRead3047702_7() throws Throwable;
private static native int __call3047702_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047703_0() throws Throwable;
private static native moom.bs __fieldRead3047703_1() throws Throwable;
private static native int __call3047703_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047703_3() throws Throwable;
private static native moom.bs __fieldRead3047703_4() throws Throwable;
private static native int __call3047703_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047704_0() throws Throwable;
private static native moom.bs __fieldRead3047704_1() throws Throwable;
private static native int __call3047704_2(moom.bs a0) throws Throwable;

}

}
