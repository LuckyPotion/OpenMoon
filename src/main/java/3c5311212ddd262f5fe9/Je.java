package moom;


class Je {

static int[] a;

static { __sourceHandlerCall_fca626a3c1ce01eb9e1c(); }

private static native <E extends Throwable> void __sourceHandlerCall_fca626a3c1ce01eb9e1c() throws E;
private static final class __SourceHandler_fca626a3c1ce01eb9e1c {

public static void f404() throws Throwable {
    javax.crypto.Cipher forestValue404_29_0;
    int forestValue404_29_1;
    javax.crypto.SecretKeyFactory forestValue404_29_2;
    byte[] forestValue404_29_3;
    javax.crypto.Cipher forestValue404_46_0;
    int forestValue404_46_1;
    javax.crypto.SecretKeyFactory forestValue404_46_2;
    byte[] forestValue404_46_3;
    javax.crypto.Cipher spill404_0;
    int spill404_1;
    javax.crypto.SecretKeyFactory spill404_2;
    byte[] spill404_3;
    byte[] spill404_4;
    int spill404_5;
    long spill404_6;
    byte[] spill404_7;
    byte[] spill404_8;
    byte[] spill404_9;
    byte[] spill404_10;
    byte[] spill404_11;
    byte[] spill404_12;
    byte[] spill404_13;
    byte[] spill404_14;
    long spill404_15;
    int spill404_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call404_3(__call404_2(5625026394487791741L, -1576373481690539335L, __call404_1(__call404_0())), 235291692439762L) ^ 91953554693025L);
    spill404_0 = (life1_13 = __call404_4("DES/CBC/NoPadding"));
    spill404_1 = 2;
    spill404_2 = __call404_5("DES");
    byte[] __stackOp404_6_0 = new byte[8];
    spill404_3 = __stackOp404_6_0;
    (__stackOp404_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue404_29_0 = spill404_0;
    forestValue404_29_1 = spill404_1;
    forestValue404_29_2 = spill404_2;
    forestValue404_29_3 = spill404_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue404_46_0 = forestValue404_29_0;
        forestValue404_46_1 = forestValue404_29_1;
        forestValue404_46_2 = forestValue404_29_2;
        forestValue404_46_3 = forestValue404_29_3;
        break forest_join_46;
    }
    byte[] __stackOp404_7_0 = forestValue404_29_3;
    spill404_4 = __stackOp404_7_0;
    (__stackOp404_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue404_29_3 = spill404_4;
    continue forest_cycle_29;
    }
    }
    __call404_9(forestValue404_46_0, forestValue404_46_1, __call404_8(forestValue404_46_2, new javax.crypto.spec.DESKeySpec(forestValue404_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp404_10_0 = 398440506014253327L;
    int __stackOp404_10_1 = -1;
    spill404_5 = __stackOp404_10_1;
    spill404_6 = __stackOp404_10_0;
    __discardScalar404_11(__stackOp404_10_1);
    life3_62 = spill404_6;
    byte[] __stackOp404_12_0 = new byte[8];
    spill404_7 = __stackOp404_12_0;
    (__stackOp404_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp404_13_0 = spill404_7;
    spill404_8 = __stackOp404_13_0;
    (__stackOp404_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp404_14_0 = spill404_8;
    spill404_9 = __stackOp404_14_0;
    (__stackOp404_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp404_15_0 = spill404_9;
    spill404_10 = __stackOp404_15_0;
    (__stackOp404_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp404_16_0 = spill404_10;
    spill404_11 = __stackOp404_16_0;
    (__stackOp404_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp404_17_0 = spill404_11;
    spill404_12 = __stackOp404_17_0;
    (__stackOp404_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp404_18_0 = spill404_12;
    spill404_13 = __stackOp404_18_0;
    (__stackOp404_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp404_19_0 = spill404_13;
    spill404_14 = __stackOp404_19_0;
    (__stackOp404_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp404_20_0 = spill404_14;
    javax.crypto.Cipher __stackOp404_20_1 = life1_13;
    life5_130 = __call404_21(__stackOp404_20_1, __stackOp404_20_0);
    int __stackOp404_22_0 = spill404_5;
    long __stackOp404_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill404_15 = __stackOp404_22_1;
    spill404_16 = __stackOp404_22_0;
    __discardWide404_23(__stackOp404_22_1);
    __discardScalar404_24(spill404_16);
    life0_204 = spill404_15;
    __fieldWrite404_26(new int[(__call404_25()).length]);
    (__fieldRead404_27())[__call404_29(__fieldRead404_28())] = 1;
    (__fieldRead404_30())[__call404_32(__fieldRead404_31())] = 2;
    (__fieldRead404_33())[__call404_35(__fieldRead404_34())] = 3;
    (__fieldRead404_36())[__call404_38(__fieldRead404_37())] = 4;
    (__fieldRead404_39())[__call404_41(__fieldRead404_40())] = 5;
    (__fieldRead404_42())[__call404_44(__fieldRead404_43())] = ((int) life0_204);
    return;
}
public static void h404_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040400_0())[__call3040400_2(__fieldRead3040400_1())] = 2;
    (__fieldRead3040400_3())[__call3040400_5(__fieldRead3040400_4())] = 3;
    (__fieldRead3040400_6())[__call3040400_8(__fieldRead3040400_7())] = 4;
    (__fieldRead3040400_9())[__call3040400_11(__fieldRead3040400_10())] = 5;
    (__fieldRead3040400_12())[__call3040400_14(__fieldRead3040400_13())] = ((int) p1);
    return;
}
public static void h404_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040401_0())[__call3040401_2(__fieldRead3040401_1())] = 3;
    (__fieldRead3040401_3())[__call3040401_5(__fieldRead3040401_4())] = 4;
    (__fieldRead3040401_6())[__call3040401_8(__fieldRead3040401_7())] = 5;
    (__fieldRead3040401_9())[__call3040401_11(__fieldRead3040401_10())] = ((int) p1);
    return;
}
public static void h404_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040402_0())[__call3040402_2(__fieldRead3040402_1())] = 4;
    (__fieldRead3040402_3())[__call3040402_5(__fieldRead3040402_4())] = 5;
    (__fieldRead3040402_6())[__call3040402_8(__fieldRead3040402_7())] = ((int) p1);
    return;
}
public static void h404_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040403_0())[__call3040403_2(__fieldRead3040403_1())] = 5;
    (__fieldRead3040403_3())[__call3040403_5(__fieldRead3040403_4())] = ((int) p1);
    return;
}
public static void h404_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3040404_0())[__call3040404_2(__fieldRead3040404_1())] = ((int) p1);
    return;
}
public static void h404_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call404_0() throws Throwable;
private static native java.lang.Class __call404_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call404_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call404_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call404_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call404_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call404_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call404_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar404_11(int a0) throws Throwable;
private static native byte[] __call404_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide404_23(long a0) throws Throwable;
private static native void __discardScalar404_24(int a0) throws Throwable;
private static native moom.bs[] __call404_25() throws Throwable;
private static native void __fieldWrite404_26(int[] a0) throws Throwable;
private static native int[] __fieldRead404_27() throws Throwable;
private static native moom.bs __fieldRead404_28() throws Throwable;
private static native int __call404_29(moom.bs a0) throws Throwable;
private static native int[] __fieldRead404_30() throws Throwable;
private static native moom.bs __fieldRead404_31() throws Throwable;
private static native int __call404_32(moom.bs a0) throws Throwable;
private static native int[] __fieldRead404_33() throws Throwable;
private static native moom.bs __fieldRead404_34() throws Throwable;
private static native int __call404_35(moom.bs a0) throws Throwable;
private static native int[] __fieldRead404_36() throws Throwable;
private static native moom.bs __fieldRead404_37() throws Throwable;
private static native int __call404_38(moom.bs a0) throws Throwable;
private static native int[] __fieldRead404_39() throws Throwable;
private static native moom.bs __fieldRead404_40() throws Throwable;
private static native int __call404_41(moom.bs a0) throws Throwable;
private static native int[] __fieldRead404_42() throws Throwable;
private static native moom.bs __fieldRead404_43() throws Throwable;
private static native int __call404_44(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040400_0() throws Throwable;
private static native moom.bs __fieldRead3040400_1() throws Throwable;
private static native int __call3040400_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040400_3() throws Throwable;
private static native moom.bs __fieldRead3040400_4() throws Throwable;
private static native int __call3040400_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040400_6() throws Throwable;
private static native moom.bs __fieldRead3040400_7() throws Throwable;
private static native int __call3040400_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040400_9() throws Throwable;
private static native moom.bs __fieldRead3040400_10() throws Throwable;
private static native int __call3040400_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040400_12() throws Throwable;
private static native moom.bs __fieldRead3040400_13() throws Throwable;
private static native int __call3040400_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040401_0() throws Throwable;
private static native moom.bs __fieldRead3040401_1() throws Throwable;
private static native int __call3040401_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040401_3() throws Throwable;
private static native moom.bs __fieldRead3040401_4() throws Throwable;
private static native int __call3040401_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040401_6() throws Throwable;
private static native moom.bs __fieldRead3040401_7() throws Throwable;
private static native int __call3040401_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040401_9() throws Throwable;
private static native moom.bs __fieldRead3040401_10() throws Throwable;
private static native int __call3040401_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040402_0() throws Throwable;
private static native moom.bs __fieldRead3040402_1() throws Throwable;
private static native int __call3040402_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040402_3() throws Throwable;
private static native moom.bs __fieldRead3040402_4() throws Throwable;
private static native int __call3040402_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040402_6() throws Throwable;
private static native moom.bs __fieldRead3040402_7() throws Throwable;
private static native int __call3040402_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040403_0() throws Throwable;
private static native moom.bs __fieldRead3040403_1() throws Throwable;
private static native int __call3040403_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040403_3() throws Throwable;
private static native moom.bs __fieldRead3040403_4() throws Throwable;
private static native int __call3040403_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3040404_0() throws Throwable;
private static native moom.bs __fieldRead3040404_1() throws Throwable;
private static native int __call3040404_2(moom.bs a0) throws Throwable;

}

}
