package moom;


class eQ {

static int[] a;

static { __sourceHandlerCall_6a142dc6375626ceb07b(); }

private static native <E extends Throwable> void __sourceHandlerCall_6a142dc6375626ceb07b() throws E;
private static final class __SourceHandler_6a142dc6375626ceb07b {

public static void f453() throws Throwable {
    javax.crypto.Cipher forestValue453_29_0;
    int forestValue453_29_1;
    javax.crypto.SecretKeyFactory forestValue453_29_2;
    byte[] forestValue453_29_3;
    javax.crypto.Cipher forestValue453_46_0;
    int forestValue453_46_1;
    javax.crypto.SecretKeyFactory forestValue453_46_2;
    byte[] forestValue453_46_3;
    javax.crypto.Cipher spill453_0;
    int spill453_1;
    javax.crypto.SecretKeyFactory spill453_2;
    byte[] spill453_3;
    byte[] spill453_4;
    int spill453_5;
    long spill453_6;
    byte[] spill453_7;
    byte[] spill453_8;
    byte[] spill453_9;
    byte[] spill453_10;
    byte[] spill453_11;
    byte[] spill453_12;
    byte[] spill453_13;
    byte[] spill453_14;
    long spill453_15;
    int spill453_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call453_3(__call453_2(7776966192250097724L, -3767996684503738735L, __call453_1(__call453_0())), 267329466895884L) ^ 125548026661962L);
    spill453_0 = (life1_13 = __call453_4("DES/CBC/NoPadding"));
    spill453_1 = 2;
    spill453_2 = __call453_5("DES");
    byte[] __stackOp453_6_0 = new byte[8];
    spill453_3 = __stackOp453_6_0;
    (__stackOp453_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue453_29_0 = spill453_0;
    forestValue453_29_1 = spill453_1;
    forestValue453_29_2 = spill453_2;
    forestValue453_29_3 = spill453_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue453_46_0 = forestValue453_29_0;
        forestValue453_46_1 = forestValue453_29_1;
        forestValue453_46_2 = forestValue453_29_2;
        forestValue453_46_3 = forestValue453_29_3;
        break forest_join_46;
    }
    byte[] __stackOp453_7_0 = forestValue453_29_3;
    spill453_4 = __stackOp453_7_0;
    (__stackOp453_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue453_29_3 = spill453_4;
    continue forest_cycle_29;
    }
    }
    __call453_9(forestValue453_46_0, forestValue453_46_1, __call453_8(forestValue453_46_2, new javax.crypto.spec.DESKeySpec(forestValue453_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp453_10_0 = 8588036467120076234L;
    int __stackOp453_10_1 = -1;
    spill453_5 = __stackOp453_10_1;
    spill453_6 = __stackOp453_10_0;
    __discardScalar453_11(__stackOp453_10_1);
    life3_62 = spill453_6;
    byte[] __stackOp453_12_0 = new byte[8];
    spill453_7 = __stackOp453_12_0;
    (__stackOp453_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp453_13_0 = spill453_7;
    spill453_8 = __stackOp453_13_0;
    (__stackOp453_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp453_14_0 = spill453_8;
    spill453_9 = __stackOp453_14_0;
    (__stackOp453_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp453_15_0 = spill453_9;
    spill453_10 = __stackOp453_15_0;
    (__stackOp453_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp453_16_0 = spill453_10;
    spill453_11 = __stackOp453_16_0;
    (__stackOp453_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp453_17_0 = spill453_11;
    spill453_12 = __stackOp453_17_0;
    (__stackOp453_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp453_18_0 = spill453_12;
    spill453_13 = __stackOp453_18_0;
    (__stackOp453_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp453_19_0 = spill453_13;
    spill453_14 = __stackOp453_19_0;
    (__stackOp453_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp453_20_0 = spill453_14;
    javax.crypto.Cipher __stackOp453_20_1 = life1_13;
    life5_130 = __call453_21(__stackOp453_20_1, __stackOp453_20_0);
    int __stackOp453_22_0 = spill453_5;
    long __stackOp453_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill453_15 = __stackOp453_22_1;
    spill453_16 = __stackOp453_22_0;
    __discardWide453_23(__stackOp453_22_1);
    __discardScalar453_24(spill453_16);
    life0_204 = spill453_15;
    __fieldWrite453_26(new int[(__call453_25()).length]);
    (__fieldRead453_27())[__call453_29(__fieldRead453_28())] = 1;
    (__fieldRead453_30())[__call453_32(__fieldRead453_31())] = 2;
    (__fieldRead453_33())[__call453_35(__fieldRead453_34())] = 3;
    (__fieldRead453_36())[__call453_38(__fieldRead453_37())] = 4;
    (__fieldRead453_39())[__call453_41(__fieldRead453_40())] = 5;
    (__fieldRead453_42())[__call453_44(__fieldRead453_43())] = ((int) life0_204);
    return;
}
public static void h453_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045300_0())[__call3045300_2(__fieldRead3045300_1())] = 2;
    (__fieldRead3045300_3())[__call3045300_5(__fieldRead3045300_4())] = 3;
    (__fieldRead3045300_6())[__call3045300_8(__fieldRead3045300_7())] = 4;
    (__fieldRead3045300_9())[__call3045300_11(__fieldRead3045300_10())] = 5;
    (__fieldRead3045300_12())[__call3045300_14(__fieldRead3045300_13())] = ((int) p1);
    return;
}
public static void h453_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045301_0())[__call3045301_2(__fieldRead3045301_1())] = 3;
    (__fieldRead3045301_3())[__call3045301_5(__fieldRead3045301_4())] = 4;
    (__fieldRead3045301_6())[__call3045301_8(__fieldRead3045301_7())] = 5;
    (__fieldRead3045301_9())[__call3045301_11(__fieldRead3045301_10())] = ((int) p1);
    return;
}
public static void h453_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045302_0())[__call3045302_2(__fieldRead3045302_1())] = 4;
    (__fieldRead3045302_3())[__call3045302_5(__fieldRead3045302_4())] = 5;
    (__fieldRead3045302_6())[__call3045302_8(__fieldRead3045302_7())] = ((int) p1);
    return;
}
public static void h453_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045303_0())[__call3045303_2(__fieldRead3045303_1())] = 5;
    (__fieldRead3045303_3())[__call3045303_5(__fieldRead3045303_4())] = ((int) p1);
    return;
}
public static void h453_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045304_0())[__call3045304_2(__fieldRead3045304_1())] = ((int) p1);
    return;
}
public static void h453_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call453_0() throws Throwable;
private static native java.lang.Class __call453_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call453_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call453_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call453_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call453_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call453_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call453_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar453_11(int a0) throws Throwable;
private static native byte[] __call453_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide453_23(long a0) throws Throwable;
private static native void __discardScalar453_24(int a0) throws Throwable;
private static native moom.bs[] __call453_25() throws Throwable;
private static native void __fieldWrite453_26(int[] a0) throws Throwable;
private static native int[] __fieldRead453_27() throws Throwable;
private static native moom.bs __fieldRead453_28() throws Throwable;
private static native int __call453_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead453_30() throws Throwable;
private static native moom.bs __fieldRead453_31() throws Throwable;
private static native int __call453_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead453_33() throws Throwable;
private static native moom.bs __fieldRead453_34() throws Throwable;
private static native int __call453_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead453_36() throws Throwable;
private static native moom.bs __fieldRead453_37() throws Throwable;
private static native int __call453_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead453_39() throws Throwable;
private static native moom.bs __fieldRead453_40() throws Throwable;
private static native int __call453_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead453_42() throws Throwable;
private static native moom.bs __fieldRead453_43() throws Throwable;
private static native int __call453_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045300_0() throws Throwable;
private static native moom.bs __fieldRead3045300_1() throws Throwable;
private static native int __call3045300_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045300_3() throws Throwable;
private static native moom.bs __fieldRead3045300_4() throws Throwable;
private static native int __call3045300_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045300_6() throws Throwable;
private static native moom.bs __fieldRead3045300_7() throws Throwable;
private static native int __call3045300_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045300_9() throws Throwable;
private static native moom.bs __fieldRead3045300_10() throws Throwable;
private static native int __call3045300_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045300_12() throws Throwable;
private static native moom.bs __fieldRead3045300_13() throws Throwable;
private static native int __call3045300_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045301_0() throws Throwable;
private static native moom.bs __fieldRead3045301_1() throws Throwable;
private static native int __call3045301_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045301_3() throws Throwable;
private static native moom.bs __fieldRead3045301_4() throws Throwable;
private static native int __call3045301_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045301_6() throws Throwable;
private static native moom.bs __fieldRead3045301_7() throws Throwable;
private static native int __call3045301_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045301_9() throws Throwable;
private static native moom.bs __fieldRead3045301_10() throws Throwable;
private static native int __call3045301_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045302_0() throws Throwable;
private static native moom.bs __fieldRead3045302_1() throws Throwable;
private static native int __call3045302_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045302_3() throws Throwable;
private static native moom.bs __fieldRead3045302_4() throws Throwable;
private static native int __call3045302_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045302_6() throws Throwable;
private static native moom.bs __fieldRead3045302_7() throws Throwable;
private static native int __call3045302_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045303_0() throws Throwable;
private static native moom.bs __fieldRead3045303_1() throws Throwable;
private static native int __call3045303_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045303_3() throws Throwable;
private static native moom.bs __fieldRead3045303_4() throws Throwable;
private static native int __call3045303_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3045304_0() throws Throwable;
private static native moom.bs __fieldRead3045304_1() throws Throwable;
private static native int __call3045304_2(moom.bs a0) throws Throwable;

}

}
