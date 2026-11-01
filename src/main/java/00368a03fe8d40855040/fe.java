package moom;


class fe {

static int[] a;

static { __sourceHandlerCall_724410581cc350682359(); }

private static native <E extends Throwable> void __sourceHandlerCall_724410581cc350682359() throws E;
private static final class __SourceHandler_724410581cc350682359 {

public static void f460() throws Throwable {
    javax.crypto.Cipher forestValue460_29_0;
    int forestValue460_29_1;
    javax.crypto.SecretKeyFactory forestValue460_29_2;
    byte[] forestValue460_29_3;
    javax.crypto.Cipher forestValue460_46_0;
    int forestValue460_46_1;
    javax.crypto.SecretKeyFactory forestValue460_46_2;
    byte[] forestValue460_46_3;
    javax.crypto.Cipher spill460_0;
    int spill460_1;
    javax.crypto.SecretKeyFactory spill460_2;
    byte[] spill460_3;
    byte[] spill460_4;
    int spill460_5;
    long spill460_6;
    byte[] spill460_7;
    byte[] spill460_8;
    byte[] spill460_9;
    byte[] spill460_10;
    byte[] spill460_11;
    byte[] spill460_12;
    byte[] spill460_13;
    byte[] spill460_14;
    long spill460_15;
    int spill460_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call460_3(__call460_2(7449412684464452185L, 2012966987202134780L, __call460_1(__call460_0())), 220546387686192L) ^ 106777664437261L);
    spill460_0 = (life1_13 = __call460_4("DES/CBC/NoPadding"));
    spill460_1 = 2;
    spill460_2 = __call460_5("DES");
    byte[] __stackOp460_6_0 = new byte[8];
    spill460_3 = __stackOp460_6_0;
    (__stackOp460_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue460_29_0 = spill460_0;
    forestValue460_29_1 = spill460_1;
    forestValue460_29_2 = spill460_2;
    forestValue460_29_3 = spill460_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue460_46_0 = forestValue460_29_0;
        forestValue460_46_1 = forestValue460_29_1;
        forestValue460_46_2 = forestValue460_29_2;
        forestValue460_46_3 = forestValue460_29_3;
        break forest_join_46;
    }
    byte[] __stackOp460_7_0 = forestValue460_29_3;
    spill460_4 = __stackOp460_7_0;
    (__stackOp460_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue460_29_3 = spill460_4;
    continue forest_cycle_29;
    }
    }
    __call460_9(forestValue460_46_0, forestValue460_46_1, __call460_8(forestValue460_46_2, new javax.crypto.spec.DESKeySpec(forestValue460_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp460_10_0 = -3721017867856834803L;
    int __stackOp460_10_1 = -1;
    spill460_5 = __stackOp460_10_1;
    spill460_6 = __stackOp460_10_0;
    __discardScalar460_11(__stackOp460_10_1);
    life3_62 = spill460_6;
    byte[] __stackOp460_12_0 = new byte[8];
    spill460_7 = __stackOp460_12_0;
    (__stackOp460_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp460_13_0 = spill460_7;
    spill460_8 = __stackOp460_13_0;
    (__stackOp460_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp460_14_0 = spill460_8;
    spill460_9 = __stackOp460_14_0;
    (__stackOp460_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp460_15_0 = spill460_9;
    spill460_10 = __stackOp460_15_0;
    (__stackOp460_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp460_16_0 = spill460_10;
    spill460_11 = __stackOp460_16_0;
    (__stackOp460_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp460_17_0 = spill460_11;
    spill460_12 = __stackOp460_17_0;
    (__stackOp460_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp460_18_0 = spill460_12;
    spill460_13 = __stackOp460_18_0;
    (__stackOp460_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp460_19_0 = spill460_13;
    spill460_14 = __stackOp460_19_0;
    (__stackOp460_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp460_20_0 = spill460_14;
    javax.crypto.Cipher __stackOp460_20_1 = life1_13;
    life5_130 = __call460_21(__stackOp460_20_1, __stackOp460_20_0);
    int __stackOp460_22_0 = spill460_5;
    long __stackOp460_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill460_15 = __stackOp460_22_1;
    spill460_16 = __stackOp460_22_0;
    __discardWide460_23(__stackOp460_22_1);
    __discardScalar460_24(spill460_16);
    life0_204 = spill460_15;
    __fieldWrite460_26(new int[(__call460_25()).length]);
    (__fieldRead460_27())[__call460_29(__fieldRead460_28())] = 1;
    (__fieldRead460_30())[__call460_32(__fieldRead460_31())] = 2;
    (__fieldRead460_33())[__call460_35(__fieldRead460_34())] = 3;
    (__fieldRead460_36())[__call460_38(__fieldRead460_37())] = 4;
    (__fieldRead460_39())[__call460_41(__fieldRead460_40())] = 5;
    (__fieldRead460_42())[__call460_44(__fieldRead460_43())] = ((int) life0_204);
    return;
}
public static void h460_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3046000_0())[__call3046000_2(__fieldRead3046000_1())] = 2;
    (__fieldRead3046000_3())[__call3046000_5(__fieldRead3046000_4())] = 3;
    (__fieldRead3046000_6())[__call3046000_8(__fieldRead3046000_7())] = 4;
    (__fieldRead3046000_9())[__call3046000_11(__fieldRead3046000_10())] = 5;
    (__fieldRead3046000_12())[__call3046000_14(__fieldRead3046000_13())] = ((int) p1);
    return;
}
public static void h460_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3046001_0())[__call3046001_2(__fieldRead3046001_1())] = 3;
    (__fieldRead3046001_3())[__call3046001_5(__fieldRead3046001_4())] = 4;
    (__fieldRead3046001_6())[__call3046001_8(__fieldRead3046001_7())] = 5;
    (__fieldRead3046001_9())[__call3046001_11(__fieldRead3046001_10())] = ((int) p1);
    return;
}
public static void h460_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3046002_0())[__call3046002_2(__fieldRead3046002_1())] = 4;
    (__fieldRead3046002_3())[__call3046002_5(__fieldRead3046002_4())] = 5;
    (__fieldRead3046002_6())[__call3046002_8(__fieldRead3046002_7())] = ((int) p1);
    return;
}
public static void h460_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3046003_0())[__call3046003_2(__fieldRead3046003_1())] = 5;
    (__fieldRead3046003_3())[__call3046003_5(__fieldRead3046003_4())] = ((int) p1);
    return;
}
public static void h460_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3046004_0())[__call3046004_2(__fieldRead3046004_1())] = ((int) p1);
    return;
}
public static void h460_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call460_0() throws Throwable;
private static native java.lang.Class __call460_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call460_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call460_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call460_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call460_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call460_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call460_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar460_11(int a0) throws Throwable;
private static native byte[] __call460_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide460_23(long a0) throws Throwable;
private static native void __discardScalar460_24(int a0) throws Throwable;
private static native moom.bs[] __call460_25() throws Throwable;
private static native void __fieldWrite460_26(int[] a0) throws Throwable;
private static native int[] __fieldRead460_27() throws Throwable;
private static native moom.bs __fieldRead460_28() throws Throwable;
private static native int __call460_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead460_30() throws Throwable;
private static native moom.bs __fieldRead460_31() throws Throwable;
private static native int __call460_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead460_33() throws Throwable;
private static native moom.bs __fieldRead460_34() throws Throwable;
private static native int __call460_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead460_36() throws Throwable;
private static native moom.bs __fieldRead460_37() throws Throwable;
private static native int __call460_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead460_39() throws Throwable;
private static native moom.bs __fieldRead460_40() throws Throwable;
private static native int __call460_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead460_42() throws Throwable;
private static native moom.bs __fieldRead460_43() throws Throwable;
private static native int __call460_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046000_0() throws Throwable;
private static native moom.bs __fieldRead3046000_1() throws Throwable;
private static native int __call3046000_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046000_3() throws Throwable;
private static native moom.bs __fieldRead3046000_4() throws Throwable;
private static native int __call3046000_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046000_6() throws Throwable;
private static native moom.bs __fieldRead3046000_7() throws Throwable;
private static native int __call3046000_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046000_9() throws Throwable;
private static native moom.bs __fieldRead3046000_10() throws Throwable;
private static native int __call3046000_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046000_12() throws Throwable;
private static native moom.bs __fieldRead3046000_13() throws Throwable;
private static native int __call3046000_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046001_0() throws Throwable;
private static native moom.bs __fieldRead3046001_1() throws Throwable;
private static native int __call3046001_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046001_3() throws Throwable;
private static native moom.bs __fieldRead3046001_4() throws Throwable;
private static native int __call3046001_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046001_6() throws Throwable;
private static native moom.bs __fieldRead3046001_7() throws Throwable;
private static native int __call3046001_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046001_9() throws Throwable;
private static native moom.bs __fieldRead3046001_10() throws Throwable;
private static native int __call3046001_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046002_0() throws Throwable;
private static native moom.bs __fieldRead3046002_1() throws Throwable;
private static native int __call3046002_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046002_3() throws Throwable;
private static native moom.bs __fieldRead3046002_4() throws Throwable;
private static native int __call3046002_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046002_6() throws Throwable;
private static native moom.bs __fieldRead3046002_7() throws Throwable;
private static native int __call3046002_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046003_0() throws Throwable;
private static native moom.bs __fieldRead3046003_1() throws Throwable;
private static native int __call3046003_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046003_3() throws Throwable;
private static native moom.bs __fieldRead3046003_4() throws Throwable;
private static native int __call3046003_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3046004_0() throws Throwable;
private static native moom.bs __fieldRead3046004_1() throws Throwable;
private static native int __call3046004_2(moom.bs a0) throws Throwable;

}

}
