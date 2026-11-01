package moom;


class mu {

static int[] a;

static { __sourceHandlerCall_0898f77aecb3268c3d79(); }

private static native <E extends Throwable> void __sourceHandlerCall_0898f77aecb3268c3d79() throws E;
private static final class __SourceHandler_0898f77aecb3268c3d79 {

public static void f485() throws Throwable {
    javax.crypto.Cipher forestValue485_29_0;
    int forestValue485_29_1;
    javax.crypto.SecretKeyFactory forestValue485_29_2;
    byte[] forestValue485_29_3;
    javax.crypto.Cipher forestValue485_46_0;
    int forestValue485_46_1;
    javax.crypto.SecretKeyFactory forestValue485_46_2;
    byte[] forestValue485_46_3;
    javax.crypto.Cipher spill485_0;
    int spill485_1;
    javax.crypto.SecretKeyFactory spill485_2;
    byte[] spill485_3;
    byte[] spill485_4;
    int spill485_5;
    long spill485_6;
    byte[] spill485_7;
    byte[] spill485_8;
    byte[] spill485_9;
    byte[] spill485_10;
    byte[] spill485_11;
    byte[] spill485_12;
    byte[] spill485_13;
    byte[] spill485_14;
    long spill485_15;
    int spill485_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call485_3(__call485_2(5848999069199788976L, 641875449330536757L, __call485_1(__call485_0())), 104882593202938L) ^ 45661292508534L);
    spill485_0 = (life1_13 = __call485_4("DES/CBC/NoPadding"));
    spill485_1 = 2;
    spill485_2 = __call485_5("DES");
    byte[] __stackOp485_6_0 = new byte[8];
    spill485_3 = __stackOp485_6_0;
    (__stackOp485_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue485_29_0 = spill485_0;
    forestValue485_29_1 = spill485_1;
    forestValue485_29_2 = spill485_2;
    forestValue485_29_3 = spill485_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue485_46_0 = forestValue485_29_0;
        forestValue485_46_1 = forestValue485_29_1;
        forestValue485_46_2 = forestValue485_29_2;
        forestValue485_46_3 = forestValue485_29_3;
        break forest_join_46;
    }
    byte[] __stackOp485_7_0 = forestValue485_29_3;
    spill485_4 = __stackOp485_7_0;
    (__stackOp485_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue485_29_3 = spill485_4;
    continue forest_cycle_29;
    }
    }
    __call485_9(forestValue485_46_0, forestValue485_46_1, __call485_8(forestValue485_46_2, new javax.crypto.spec.DESKeySpec(forestValue485_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp485_10_0 = 8965460910887106046L;
    int __stackOp485_10_1 = -1;
    spill485_5 = __stackOp485_10_1;
    spill485_6 = __stackOp485_10_0;
    __discardScalar485_11(__stackOp485_10_1);
    life3_62 = spill485_6;
    byte[] __stackOp485_12_0 = new byte[8];
    spill485_7 = __stackOp485_12_0;
    (__stackOp485_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp485_13_0 = spill485_7;
    spill485_8 = __stackOp485_13_0;
    (__stackOp485_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp485_14_0 = spill485_8;
    spill485_9 = __stackOp485_14_0;
    (__stackOp485_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp485_15_0 = spill485_9;
    spill485_10 = __stackOp485_15_0;
    (__stackOp485_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp485_16_0 = spill485_10;
    spill485_11 = __stackOp485_16_0;
    (__stackOp485_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp485_17_0 = spill485_11;
    spill485_12 = __stackOp485_17_0;
    (__stackOp485_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp485_18_0 = spill485_12;
    spill485_13 = __stackOp485_18_0;
    (__stackOp485_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp485_19_0 = spill485_13;
    spill485_14 = __stackOp485_19_0;
    (__stackOp485_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp485_20_0 = spill485_14;
    javax.crypto.Cipher __stackOp485_20_1 = life1_13;
    life5_130 = __call485_21(__stackOp485_20_1, __stackOp485_20_0);
    int __stackOp485_22_0 = spill485_5;
    long __stackOp485_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill485_15 = __stackOp485_22_1;
    spill485_16 = __stackOp485_22_0;
    __discardWide485_23(__stackOp485_22_1);
    __discardScalar485_24(spill485_16);
    life0_204 = spill485_15;
    __fieldWrite485_26(new int[(__call485_25()).length]);
    (__fieldRead485_27())[__call485_29(__fieldRead485_28())] = 1;
    (__fieldRead485_30())[__call485_32(__fieldRead485_31())] = 2;
    (__fieldRead485_33())[__call485_35(__fieldRead485_34())] = 3;
    (__fieldRead485_36())[__call485_38(__fieldRead485_37())] = 4;
    (__fieldRead485_39())[__call485_41(__fieldRead485_40())] = 5;
    (__fieldRead485_42())[__call485_44(__fieldRead485_43())] = ((int) life0_204);
    return;
}
public static void h485_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3048500_0())[__call3048500_2(__fieldRead3048500_1())] = 2;
    (__fieldRead3048500_3())[__call3048500_5(__fieldRead3048500_4())] = 3;
    (__fieldRead3048500_6())[__call3048500_8(__fieldRead3048500_7())] = 4;
    (__fieldRead3048500_9())[__call3048500_11(__fieldRead3048500_10())] = 5;
    (__fieldRead3048500_12())[__call3048500_14(__fieldRead3048500_13())] = ((int) p1);
    return;
}
public static void h485_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3048501_0())[__call3048501_2(__fieldRead3048501_1())] = 3;
    (__fieldRead3048501_3())[__call3048501_5(__fieldRead3048501_4())] = 4;
    (__fieldRead3048501_6())[__call3048501_8(__fieldRead3048501_7())] = 5;
    (__fieldRead3048501_9())[__call3048501_11(__fieldRead3048501_10())] = ((int) p1);
    return;
}
public static void h485_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3048502_0())[__call3048502_2(__fieldRead3048502_1())] = 4;
    (__fieldRead3048502_3())[__call3048502_5(__fieldRead3048502_4())] = 5;
    (__fieldRead3048502_6())[__call3048502_8(__fieldRead3048502_7())] = ((int) p1);
    return;
}
public static void h485_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3048503_0())[__call3048503_2(__fieldRead3048503_1())] = 5;
    (__fieldRead3048503_3())[__call3048503_5(__fieldRead3048503_4())] = ((int) p1);
    return;
}
public static void h485_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3048504_0())[__call3048504_2(__fieldRead3048504_1())] = ((int) p1);
    return;
}
public static void h485_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call485_0() throws Throwable;
private static native java.lang.Class __call485_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call485_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call485_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call485_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call485_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call485_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call485_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar485_11(int a0) throws Throwable;
private static native byte[] __call485_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide485_23(long a0) throws Throwable;
private static native void __discardScalar485_24(int a0) throws Throwable;
private static native moom.bs[] __call485_25() throws Throwable;
private static native void __fieldWrite485_26(int[] a0) throws Throwable;
private static native int[] __fieldRead485_27() throws Throwable;
private static native moom.bs __fieldRead485_28() throws Throwable;
private static native int __call485_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead485_30() throws Throwable;
private static native moom.bs __fieldRead485_31() throws Throwable;
private static native int __call485_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead485_33() throws Throwable;
private static native moom.bs __fieldRead485_34() throws Throwable;
private static native int __call485_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead485_36() throws Throwable;
private static native moom.bs __fieldRead485_37() throws Throwable;
private static native int __call485_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead485_39() throws Throwable;
private static native moom.bs __fieldRead485_40() throws Throwable;
private static native int __call485_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead485_42() throws Throwable;
private static native moom.bs __fieldRead485_43() throws Throwable;
private static native int __call485_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048500_0() throws Throwable;
private static native moom.bs __fieldRead3048500_1() throws Throwable;
private static native int __call3048500_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048500_3() throws Throwable;
private static native moom.bs __fieldRead3048500_4() throws Throwable;
private static native int __call3048500_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048500_6() throws Throwable;
private static native moom.bs __fieldRead3048500_7() throws Throwable;
private static native int __call3048500_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048500_9() throws Throwable;
private static native moom.bs __fieldRead3048500_10() throws Throwable;
private static native int __call3048500_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048500_12() throws Throwable;
private static native moom.bs __fieldRead3048500_13() throws Throwable;
private static native int __call3048500_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048501_0() throws Throwable;
private static native moom.bs __fieldRead3048501_1() throws Throwable;
private static native int __call3048501_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048501_3() throws Throwable;
private static native moom.bs __fieldRead3048501_4() throws Throwable;
private static native int __call3048501_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048501_6() throws Throwable;
private static native moom.bs __fieldRead3048501_7() throws Throwable;
private static native int __call3048501_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048501_9() throws Throwable;
private static native moom.bs __fieldRead3048501_10() throws Throwable;
private static native int __call3048501_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048502_0() throws Throwable;
private static native moom.bs __fieldRead3048502_1() throws Throwable;
private static native int __call3048502_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048502_3() throws Throwable;
private static native moom.bs __fieldRead3048502_4() throws Throwable;
private static native int __call3048502_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048502_6() throws Throwable;
private static native moom.bs __fieldRead3048502_7() throws Throwable;
private static native int __call3048502_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048503_0() throws Throwable;
private static native moom.bs __fieldRead3048503_1() throws Throwable;
private static native int __call3048503_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048503_3() throws Throwable;
private static native moom.bs __fieldRead3048503_4() throws Throwable;
private static native int __call3048503_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3048504_0() throws Throwable;
private static native moom.bs __fieldRead3048504_1() throws Throwable;
private static native int __call3048504_2(moom.bs a0) throws Throwable;

}

}
