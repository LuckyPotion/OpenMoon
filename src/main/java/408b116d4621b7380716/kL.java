package moom;


class kL {

static int[] a;

static { __sourceHandlerCall_e9e7e311b32f6afe0603(); }

private static native <E extends Throwable> void __sourceHandlerCall_e9e7e311b32f6afe0603() throws E;
private static final class __SourceHandler_e9e7e311b32f6afe0603 {

public static void f476() throws Throwable {
    javax.crypto.Cipher forestValue476_29_0;
    int forestValue476_29_1;
    javax.crypto.SecretKeyFactory forestValue476_29_2;
    byte[] forestValue476_29_3;
    javax.crypto.Cipher forestValue476_46_0;
    int forestValue476_46_1;
    javax.crypto.SecretKeyFactory forestValue476_46_2;
    byte[] forestValue476_46_3;
    javax.crypto.Cipher spill476_0;
    int spill476_1;
    javax.crypto.SecretKeyFactory spill476_2;
    byte[] spill476_3;
    byte[] spill476_4;
    int spill476_5;
    long spill476_6;
    byte[] spill476_7;
    byte[] spill476_8;
    byte[] spill476_9;
    byte[] spill476_10;
    byte[] spill476_11;
    byte[] spill476_12;
    byte[] spill476_13;
    byte[] spill476_14;
    long spill476_15;
    int spill476_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call476_3(__call476_2(-4132668151237678320L, -1677206339546846012L, __call476_1(__call476_0())), 9288684022173L) ^ 34498674724395L);
    spill476_0 = (life1_13 = __call476_4("DES/CBC/NoPadding"));
    spill476_1 = 2;
    spill476_2 = __call476_5("DES");
    byte[] __stackOp476_6_0 = new byte[8];
    spill476_3 = __stackOp476_6_0;
    (__stackOp476_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue476_29_0 = spill476_0;
    forestValue476_29_1 = spill476_1;
    forestValue476_29_2 = spill476_2;
    forestValue476_29_3 = spill476_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue476_46_0 = forestValue476_29_0;
        forestValue476_46_1 = forestValue476_29_1;
        forestValue476_46_2 = forestValue476_29_2;
        forestValue476_46_3 = forestValue476_29_3;
        break forest_join_46;
    }
    byte[] __stackOp476_7_0 = forestValue476_29_3;
    spill476_4 = __stackOp476_7_0;
    (__stackOp476_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue476_29_3 = spill476_4;
    continue forest_cycle_29;
    }
    }
    __call476_9(forestValue476_46_0, forestValue476_46_1, __call476_8(forestValue476_46_2, new javax.crypto.spec.DESKeySpec(forestValue476_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp476_10_0 = -1868316429277199111L;
    int __stackOp476_10_1 = -1;
    spill476_5 = __stackOp476_10_1;
    spill476_6 = __stackOp476_10_0;
    __discardScalar476_11(__stackOp476_10_1);
    life3_62 = spill476_6;
    byte[] __stackOp476_12_0 = new byte[8];
    spill476_7 = __stackOp476_12_0;
    (__stackOp476_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp476_13_0 = spill476_7;
    spill476_8 = __stackOp476_13_0;
    (__stackOp476_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp476_14_0 = spill476_8;
    spill476_9 = __stackOp476_14_0;
    (__stackOp476_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp476_15_0 = spill476_9;
    spill476_10 = __stackOp476_15_0;
    (__stackOp476_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp476_16_0 = spill476_10;
    spill476_11 = __stackOp476_16_0;
    (__stackOp476_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp476_17_0 = spill476_11;
    spill476_12 = __stackOp476_17_0;
    (__stackOp476_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp476_18_0 = spill476_12;
    spill476_13 = __stackOp476_18_0;
    (__stackOp476_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp476_19_0 = spill476_13;
    spill476_14 = __stackOp476_19_0;
    (__stackOp476_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp476_20_0 = spill476_14;
    javax.crypto.Cipher __stackOp476_20_1 = life1_13;
    life5_130 = __call476_21(__stackOp476_20_1, __stackOp476_20_0);
    int __stackOp476_22_0 = spill476_5;
    long __stackOp476_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill476_15 = __stackOp476_22_1;
    spill476_16 = __stackOp476_22_0;
    __discardWide476_23(__stackOp476_22_1);
    __discardScalar476_24(spill476_16);
    life0_204 = spill476_15;
    __fieldWrite476_26(new int[(__call476_25()).length]);
    (__fieldRead476_27())[__call476_29(__fieldRead476_28())] = 1;
    (__fieldRead476_30())[__call476_32(__fieldRead476_31())] = 2;
    (__fieldRead476_33())[__call476_35(__fieldRead476_34())] = 3;
    (__fieldRead476_36())[__call476_38(__fieldRead476_37())] = 4;
    (__fieldRead476_39())[__call476_41(__fieldRead476_40())] = 5;
    (__fieldRead476_42())[__call476_44(__fieldRead476_43())] = ((int) life0_204);
    return;
}
public static void h476_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047600_0())[__call3047600_2(__fieldRead3047600_1())] = 2;
    (__fieldRead3047600_3())[__call3047600_5(__fieldRead3047600_4())] = 3;
    (__fieldRead3047600_6())[__call3047600_8(__fieldRead3047600_7())] = 4;
    (__fieldRead3047600_9())[__call3047600_11(__fieldRead3047600_10())] = 5;
    (__fieldRead3047600_12())[__call3047600_14(__fieldRead3047600_13())] = ((int) p1);
    return;
}
public static void h476_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047601_0())[__call3047601_2(__fieldRead3047601_1())] = 3;
    (__fieldRead3047601_3())[__call3047601_5(__fieldRead3047601_4())] = 4;
    (__fieldRead3047601_6())[__call3047601_8(__fieldRead3047601_7())] = 5;
    (__fieldRead3047601_9())[__call3047601_11(__fieldRead3047601_10())] = ((int) p1);
    return;
}
public static void h476_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047602_0())[__call3047602_2(__fieldRead3047602_1())] = 4;
    (__fieldRead3047602_3())[__call3047602_5(__fieldRead3047602_4())] = 5;
    (__fieldRead3047602_6())[__call3047602_8(__fieldRead3047602_7())] = ((int) p1);
    return;
}
public static void h476_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047603_0())[__call3047603_2(__fieldRead3047603_1())] = 5;
    (__fieldRead3047603_3())[__call3047603_5(__fieldRead3047603_4())] = ((int) p1);
    return;
}
public static void h476_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3047604_0())[__call3047604_2(__fieldRead3047604_1())] = ((int) p1);
    return;
}
public static void h476_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call476_0() throws Throwable;
private static native java.lang.Class __call476_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call476_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call476_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call476_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call476_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call476_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call476_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar476_11(int a0) throws Throwable;
private static native byte[] __call476_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide476_23(long a0) throws Throwable;
private static native void __discardScalar476_24(int a0) throws Throwable;
private static native moom.bs[] __call476_25() throws Throwable;
private static native void __fieldWrite476_26(int[] a0) throws Throwable;
private static native int[] __fieldRead476_27() throws Throwable;
private static native moom.bs __fieldRead476_28() throws Throwable;
private static native int __call476_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead476_30() throws Throwable;
private static native moom.bs __fieldRead476_31() throws Throwable;
private static native int __call476_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead476_33() throws Throwable;
private static native moom.bs __fieldRead476_34() throws Throwable;
private static native int __call476_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead476_36() throws Throwable;
private static native moom.bs __fieldRead476_37() throws Throwable;
private static native int __call476_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead476_39() throws Throwable;
private static native moom.bs __fieldRead476_40() throws Throwable;
private static native int __call476_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead476_42() throws Throwable;
private static native moom.bs __fieldRead476_43() throws Throwable;
private static native int __call476_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047600_0() throws Throwable;
private static native moom.bs __fieldRead3047600_1() throws Throwable;
private static native int __call3047600_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047600_3() throws Throwable;
private static native moom.bs __fieldRead3047600_4() throws Throwable;
private static native int __call3047600_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047600_6() throws Throwable;
private static native moom.bs __fieldRead3047600_7() throws Throwable;
private static native int __call3047600_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047600_9() throws Throwable;
private static native moom.bs __fieldRead3047600_10() throws Throwable;
private static native int __call3047600_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047600_12() throws Throwable;
private static native moom.bs __fieldRead3047600_13() throws Throwable;
private static native int __call3047600_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047601_0() throws Throwable;
private static native moom.bs __fieldRead3047601_1() throws Throwable;
private static native int __call3047601_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047601_3() throws Throwable;
private static native moom.bs __fieldRead3047601_4() throws Throwable;
private static native int __call3047601_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047601_6() throws Throwable;
private static native moom.bs __fieldRead3047601_7() throws Throwable;
private static native int __call3047601_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047601_9() throws Throwable;
private static native moom.bs __fieldRead3047601_10() throws Throwable;
private static native int __call3047601_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047602_0() throws Throwable;
private static native moom.bs __fieldRead3047602_1() throws Throwable;
private static native int __call3047602_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047602_3() throws Throwable;
private static native moom.bs __fieldRead3047602_4() throws Throwable;
private static native int __call3047602_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047602_6() throws Throwable;
private static native moom.bs __fieldRead3047602_7() throws Throwable;
private static native int __call3047602_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047603_0() throws Throwable;
private static native moom.bs __fieldRead3047603_1() throws Throwable;
private static native int __call3047603_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047603_3() throws Throwable;
private static native moom.bs __fieldRead3047603_4() throws Throwable;
private static native int __call3047603_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3047604_0() throws Throwable;
private static native moom.bs __fieldRead3047604_1() throws Throwable;
private static native int __call3047604_2(moom.bs a0) throws Throwable;

}

}
