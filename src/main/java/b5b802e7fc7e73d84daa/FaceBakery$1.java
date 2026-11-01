package net.minecraft.client.renderer.block.model;


class FaceBakery$1 {

static int[] a;

static int[] b;

static { __sourceHandlerCall_5558fda9b44f8268a2bd(); }

private static native <E extends Throwable> void __sourceHandlerCall_5558fda9b44f8268a2bd() throws E;
private static final class __SourceHandler_5558fda9b44f8268a2bd {

public static void f544() throws Throwable {
    javax.crypto.Cipher forestValue544_29_0;
    int forestValue544_29_1;
    javax.crypto.SecretKeyFactory forestValue544_29_2;
    byte[] forestValue544_29_3;
    javax.crypto.Cipher forestValue544_46_0;
    int forestValue544_46_1;
    javax.crypto.SecretKeyFactory forestValue544_46_2;
    byte[] forestValue544_46_3;
    javax.crypto.Cipher spill544_0;
    int spill544_1;
    javax.crypto.SecretKeyFactory spill544_2;
    byte[] spill544_3;
    byte[] spill544_4;
    int spill544_5;
    long spill544_6;
    byte[] spill544_7;
    byte[] spill544_8;
    byte[] spill544_9;
    byte[] spill544_10;
    byte[] spill544_11;
    byte[] spill544_12;
    byte[] spill544_13;
    byte[] spill544_14;
    long spill544_15;
    int spill544_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call544_3(__call544_2(1497025145328673453L, -1124977234363987420L, __call544_1(__call544_0())), 242725926138763L) ^ 96688158563823L);
    spill544_0 = (life1_13 = __call544_4("DES/CBC/NoPadding"));
    spill544_1 = 2;
    spill544_2 = __call544_5("DES");
    byte[] __stackOp544_6_0 = new byte[8];
    spill544_3 = __stackOp544_6_0;
    (__stackOp544_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue544_29_0 = spill544_0;
    forestValue544_29_1 = spill544_1;
    forestValue544_29_2 = spill544_2;
    forestValue544_29_3 = spill544_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue544_46_0 = forestValue544_29_0;
        forestValue544_46_1 = forestValue544_29_1;
        forestValue544_46_2 = forestValue544_29_2;
        forestValue544_46_3 = forestValue544_29_3;
        break forest_join_46;
    }
    byte[] __stackOp544_7_0 = forestValue544_29_3;
    spill544_4 = __stackOp544_7_0;
    (__stackOp544_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue544_29_3 = spill544_4;
    continue forest_cycle_29;
    }
    }
    __call544_9(forestValue544_46_0, forestValue544_46_1, __call544_8(forestValue544_46_2, new javax.crypto.spec.DESKeySpec(forestValue544_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp544_10_0 = 1682056307513902468L;
    int __stackOp544_10_1 = -1;
    spill544_5 = __stackOp544_10_1;
    spill544_6 = __stackOp544_10_0;
    __discardScalar544_11(__stackOp544_10_1);
    life3_62 = spill544_6;
    byte[] __stackOp544_12_0 = new byte[8];
    spill544_7 = __stackOp544_12_0;
    (__stackOp544_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp544_13_0 = spill544_7;
    spill544_8 = __stackOp544_13_0;
    (__stackOp544_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp544_14_0 = spill544_8;
    spill544_9 = __stackOp544_14_0;
    (__stackOp544_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp544_15_0 = spill544_9;
    spill544_10 = __stackOp544_15_0;
    (__stackOp544_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp544_16_0 = spill544_10;
    spill544_11 = __stackOp544_16_0;
    (__stackOp544_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp544_17_0 = spill544_11;
    spill544_12 = __stackOp544_17_0;
    (__stackOp544_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp544_18_0 = spill544_12;
    spill544_13 = __stackOp544_18_0;
    (__stackOp544_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp544_19_0 = spill544_13;
    spill544_14 = __stackOp544_19_0;
    (__stackOp544_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp544_20_0 = spill544_14;
    javax.crypto.Cipher __stackOp544_20_1 = life1_13;
    life5_130 = __call544_21(__stackOp544_20_1, __stackOp544_20_0);
    int __stackOp544_22_0 = spill544_5;
    long __stackOp544_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill544_15 = __stackOp544_22_1;
    spill544_16 = __stackOp544_22_0;
    __discardWide544_23(__stackOp544_22_1);
    __discardScalar544_24(spill544_16);
    life0_204 = spill544_15;
    __fieldWrite544_26(new int[(__call544_25()).length]);
    (__fieldRead544_27())[__call544_29(__fieldRead544_28())] = 1;
    (__fieldRead544_30())[__call544_32(__fieldRead544_31())] = 2;
    (__fieldRead544_33())[__call544_35(__fieldRead544_34())] = 3;
    __fieldWrite544_37(new int[(__call544_36()).length]);
    (__fieldRead544_38())[__call544_40(__fieldRead544_39())] = 1;
    (__fieldRead544_41())[__call544_43(__fieldRead544_42())] = 2;
    (__fieldRead544_44())[__call544_46(__fieldRead544_45())] = 3;
    (__fieldRead544_47())[__call544_49(__fieldRead544_48())] = 4;
    (__fieldRead544_50())[__call544_52(__fieldRead544_51())] = 5;
    (__fieldRead544_53())[__call544_55(__fieldRead544_54())] = ((int) life0_204);
    return;
}
public static void h544_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054400_0())[__call3054400_2(__fieldRead3054400_1())] = 2;
    (__fieldRead3054400_3())[__call3054400_5(__fieldRead3054400_4())] = 3;
    __fieldWrite3054400_7(new int[(__call3054400_6()).length]);
    (__fieldRead3054400_8())[__call3054400_10(__fieldRead3054400_9())] = 1;
    (__fieldRead3054400_11())[__call3054400_13(__fieldRead3054400_12())] = 2;
    (__fieldRead3054400_14())[__call3054400_16(__fieldRead3054400_15())] = 3;
    (__fieldRead3054400_17())[__call3054400_19(__fieldRead3054400_18())] = 4;
    (__fieldRead3054400_20())[__call3054400_22(__fieldRead3054400_21())] = 5;
    (__fieldRead3054400_23())[__call3054400_25(__fieldRead3054400_24())] = ((int) p1);
    return;
}
public static void h544_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054401_0())[__call3054401_2(__fieldRead3054401_1())] = 3;
    __fieldWrite3054401_4(new int[(__call3054401_3()).length]);
    (__fieldRead3054401_5())[__call3054401_7(__fieldRead3054401_6())] = 1;
    (__fieldRead3054401_8())[__call3054401_10(__fieldRead3054401_9())] = 2;
    (__fieldRead3054401_11())[__call3054401_13(__fieldRead3054401_12())] = 3;
    (__fieldRead3054401_14())[__call3054401_16(__fieldRead3054401_15())] = 4;
    (__fieldRead3054401_17())[__call3054401_19(__fieldRead3054401_18())] = 5;
    (__fieldRead3054401_20())[__call3054401_22(__fieldRead3054401_21())] = ((int) p1);
    return;
}
public static void h544_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    __fieldWrite3054402_1(new int[(__call3054402_0()).length]);
    (__fieldRead3054402_2())[__call3054402_4(__fieldRead3054402_3())] = 1;
    (__fieldRead3054402_5())[__call3054402_7(__fieldRead3054402_6())] = 2;
    (__fieldRead3054402_8())[__call3054402_10(__fieldRead3054402_9())] = 3;
    (__fieldRead3054402_11())[__call3054402_13(__fieldRead3054402_12())] = 4;
    (__fieldRead3054402_14())[__call3054402_16(__fieldRead3054402_15())] = 5;
    (__fieldRead3054402_17())[__call3054402_19(__fieldRead3054402_18())] = ((int) p1);
    return;
}
public static void h544_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054403_0())[__call3054403_2(__fieldRead3054403_1())] = 2;
    (__fieldRead3054403_3())[__call3054403_5(__fieldRead3054403_4())] = 3;
    (__fieldRead3054403_6())[__call3054403_8(__fieldRead3054403_7())] = 4;
    (__fieldRead3054403_9())[__call3054403_11(__fieldRead3054403_10())] = 5;
    (__fieldRead3054403_12())[__call3054403_14(__fieldRead3054403_13())] = ((int) p1);
    return;
}
public static void h544_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054404_0())[__call3054404_2(__fieldRead3054404_1())] = 3;
    (__fieldRead3054404_3())[__call3054404_5(__fieldRead3054404_4())] = 4;
    (__fieldRead3054404_6())[__call3054404_8(__fieldRead3054404_7())] = 5;
    (__fieldRead3054404_9())[__call3054404_11(__fieldRead3054404_10())] = ((int) p1);
    return;
}
public static void h544_5(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054405_0())[__call3054405_2(__fieldRead3054405_1())] = 4;
    (__fieldRead3054405_3())[__call3054405_5(__fieldRead3054405_4())] = 5;
    (__fieldRead3054405_6())[__call3054405_8(__fieldRead3054405_7())] = ((int) p1);
    return;
}
public static void h544_6(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054406_0())[__call3054406_2(__fieldRead3054406_1())] = 5;
    (__fieldRead3054406_3())[__call3054406_5(__fieldRead3054406_4())] = ((int) p1);
    return;
}
public static void h544_7(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3054407_0())[__call3054407_2(__fieldRead3054407_1())] = ((int) p1);
    return;
}
public static void h544_8(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call544_0() throws Throwable;
private static native java.lang.Class __call544_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call544_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call544_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call544_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call544_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call544_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call544_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar544_11(int a0) throws Throwable;
private static native byte[] __call544_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide544_23(long a0) throws Throwable;
private static native void __discardScalar544_24(int a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis[] __call544_25() throws Throwable;
private static native void __fieldWrite544_26(int[] a0) throws Throwable;
private static native int[] __fieldRead544_27() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead544_28() throws Throwable;
private static native int __call544_29(net.minecraft.util.EnumFacing$Axis a0) throws Throwable;
private static native int[] __fieldRead544_30() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead544_31() throws Throwable;
private static native int __call544_32(net.minecraft.util.EnumFacing$Axis a0) throws Throwable;
private static native int[] __fieldRead544_33() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead544_34() throws Throwable;
private static native int __call544_35(net.minecraft.util.EnumFacing$Axis a0) throws Throwable;
private static native moom.bs[] __call544_36() throws Throwable;
private static native void __fieldWrite544_37(int[] a0) throws Throwable;
private static native int[] __fieldRead544_38() throws Throwable;
private static native moom.bs __fieldRead544_39() throws Throwable;
private static native int __call544_40(moom.bs a0) throws Throwable;
private static native int[] __fieldRead544_41() throws Throwable;
private static native moom.bs __fieldRead544_42() throws Throwable;
private static native int __call544_43(moom.bs a0) throws Throwable;
private static native int[] __fieldRead544_44() throws Throwable;
private static native moom.bs __fieldRead544_45() throws Throwable;
private static native int __call544_46(moom.bs a0) throws Throwable;
private static native int[] __fieldRead544_47() throws Throwable;
private static native moom.bs __fieldRead544_48() throws Throwable;
private static native int __call544_49(moom.bs a0) throws Throwable;
private static native int[] __fieldRead544_50() throws Throwable;
private static native moom.bs __fieldRead544_51() throws Throwable;
private static native int __call544_52(moom.bs a0) throws Throwable;
private static native int[] __fieldRead544_53() throws Throwable;
private static native moom.bs __fieldRead544_54() throws Throwable;
private static native int __call544_55(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054400_0() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead3054400_1() throws Throwable;
private static native int __call3054400_2(net.minecraft.util.EnumFacing$Axis a0) throws Throwable;
private static native int[] __fieldRead3054400_3() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead3054400_4() throws Throwable;
private static native int __call3054400_5(net.minecraft.util.EnumFacing$Axis a0) throws Throwable;
private static native moom.bs[] __call3054400_6() throws Throwable;
private static native void __fieldWrite3054400_7(int[] a0) throws Throwable;
private static native int[] __fieldRead3054400_8() throws Throwable;
private static native moom.bs __fieldRead3054400_9() throws Throwable;
private static native int __call3054400_10(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054400_11() throws Throwable;
private static native moom.bs __fieldRead3054400_12() throws Throwable;
private static native int __call3054400_13(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054400_14() throws Throwable;
private static native moom.bs __fieldRead3054400_15() throws Throwable;
private static native int __call3054400_16(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054400_17() throws Throwable;
private static native moom.bs __fieldRead3054400_18() throws Throwable;
private static native int __call3054400_19(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054400_20() throws Throwable;
private static native moom.bs __fieldRead3054400_21() throws Throwable;
private static native int __call3054400_22(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054400_23() throws Throwable;
private static native moom.bs __fieldRead3054400_24() throws Throwable;
private static native int __call3054400_25(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054401_0() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead3054401_1() throws Throwable;
private static native int __call3054401_2(net.minecraft.util.EnumFacing$Axis a0) throws Throwable;
private static native moom.bs[] __call3054401_3() throws Throwable;
private static native void __fieldWrite3054401_4(int[] a0) throws Throwable;
private static native int[] __fieldRead3054401_5() throws Throwable;
private static native moom.bs __fieldRead3054401_6() throws Throwable;
private static native int __call3054401_7(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054401_8() throws Throwable;
private static native moom.bs __fieldRead3054401_9() throws Throwable;
private static native int __call3054401_10(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054401_11() throws Throwable;
private static native moom.bs __fieldRead3054401_12() throws Throwable;
private static native int __call3054401_13(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054401_14() throws Throwable;
private static native moom.bs __fieldRead3054401_15() throws Throwable;
private static native int __call3054401_16(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054401_17() throws Throwable;
private static native moom.bs __fieldRead3054401_18() throws Throwable;
private static native int __call3054401_19(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054401_20() throws Throwable;
private static native moom.bs __fieldRead3054401_21() throws Throwable;
private static native int __call3054401_22(moom.bs a0) throws Throwable;
private static native moom.bs[] __call3054402_0() throws Throwable;
private static native void __fieldWrite3054402_1(int[] a0) throws Throwable;
private static native int[] __fieldRead3054402_2() throws Throwable;
private static native moom.bs __fieldRead3054402_3() throws Throwable;
private static native int __call3054402_4(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054402_5() throws Throwable;
private static native moom.bs __fieldRead3054402_6() throws Throwable;
private static native int __call3054402_7(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054402_8() throws Throwable;
private static native moom.bs __fieldRead3054402_9() throws Throwable;
private static native int __call3054402_10(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054402_11() throws Throwable;
private static native moom.bs __fieldRead3054402_12() throws Throwable;
private static native int __call3054402_13(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054402_14() throws Throwable;
private static native moom.bs __fieldRead3054402_15() throws Throwable;
private static native int __call3054402_16(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054402_17() throws Throwable;
private static native moom.bs __fieldRead3054402_18() throws Throwable;
private static native int __call3054402_19(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054403_0() throws Throwable;
private static native moom.bs __fieldRead3054403_1() throws Throwable;
private static native int __call3054403_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054403_3() throws Throwable;
private static native moom.bs __fieldRead3054403_4() throws Throwable;
private static native int __call3054403_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054403_6() throws Throwable;
private static native moom.bs __fieldRead3054403_7() throws Throwable;
private static native int __call3054403_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054403_9() throws Throwable;
private static native moom.bs __fieldRead3054403_10() throws Throwable;
private static native int __call3054403_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054403_12() throws Throwable;
private static native moom.bs __fieldRead3054403_13() throws Throwable;
private static native int __call3054403_14(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054404_0() throws Throwable;
private static native moom.bs __fieldRead3054404_1() throws Throwable;
private static native int __call3054404_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054404_3() throws Throwable;
private static native moom.bs __fieldRead3054404_4() throws Throwable;
private static native int __call3054404_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054404_6() throws Throwable;
private static native moom.bs __fieldRead3054404_7() throws Throwable;
private static native int __call3054404_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054404_9() throws Throwable;
private static native moom.bs __fieldRead3054404_10() throws Throwable;
private static native int __call3054404_11(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054405_0() throws Throwable;
private static native moom.bs __fieldRead3054405_1() throws Throwable;
private static native int __call3054405_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054405_3() throws Throwable;
private static native moom.bs __fieldRead3054405_4() throws Throwable;
private static native int __call3054405_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054405_6() throws Throwable;
private static native moom.bs __fieldRead3054405_7() throws Throwable;
private static native int __call3054405_8(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054406_0() throws Throwable;
private static native moom.bs __fieldRead3054406_1() throws Throwable;
private static native int __call3054406_2(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054406_3() throws Throwable;
private static native moom.bs __fieldRead3054406_4() throws Throwable;
private static native int __call3054406_5(moom.bs a0) throws Throwable;
private static native int[] __fieldRead3054407_0() throws Throwable;
private static native moom.bs __fieldRead3054407_1() throws Throwable;
private static native int __call3054407_2(moom.bs a0) throws Throwable;

}

}
