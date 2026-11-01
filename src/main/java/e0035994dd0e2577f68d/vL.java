package moom;


class vL {

static int[] a;

static int[] b;

static { __sourceHandlerCall_25fd0017f9780e3267e2(); }

private static native <E extends Throwable> void __sourceHandlerCall_25fd0017f9780e3267e2() throws E;
private static final class __SourceHandler_25fd0017f9780e3267e2 {

public static void f509() throws Throwable {
    javax.crypto.Cipher forestValue509_29_0;
    int forestValue509_29_1;
    javax.crypto.SecretKeyFactory forestValue509_29_2;
    byte[] forestValue509_29_3;
    javax.crypto.Cipher forestValue509_46_0;
    int forestValue509_46_1;
    javax.crypto.SecretKeyFactory forestValue509_46_2;
    byte[] forestValue509_46_3;
    javax.crypto.Cipher spill509_0;
    int spill509_1;
    javax.crypto.SecretKeyFactory spill509_2;
    byte[] spill509_3;
    byte[] spill509_4;
    int spill509_5;
    long spill509_6;
    byte[] spill509_7;
    byte[] spill509_8;
    byte[] spill509_9;
    byte[] spill509_10;
    byte[] spill509_11;
    byte[] spill509_12;
    byte[] spill509_13;
    byte[] spill509_14;
    long spill509_15;
    int spill509_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call509_3(__call509_2(3300917442704204413L, -8443376536965300856L, __call509_1(__call509_0())), 223376878061807L) ^ 64349186250532L);
    spill509_0 = (life1_13 = __call509_4("DES/CBC/NoPadding"));
    spill509_1 = 2;
    spill509_2 = __call509_5("DES");
    byte[] __stackOp509_6_0 = new byte[8];
    spill509_3 = __stackOp509_6_0;
    (__stackOp509_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue509_29_0 = spill509_0;
    forestValue509_29_1 = spill509_1;
    forestValue509_29_2 = spill509_2;
    forestValue509_29_3 = spill509_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue509_46_0 = forestValue509_29_0;
        forestValue509_46_1 = forestValue509_29_1;
        forestValue509_46_2 = forestValue509_29_2;
        forestValue509_46_3 = forestValue509_29_3;
        break forest_join_46;
    }
    byte[] __stackOp509_7_0 = forestValue509_29_3;
    spill509_4 = __stackOp509_7_0;
    (__stackOp509_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue509_29_3 = spill509_4;
    continue forest_cycle_29;
    }
    }
    __call509_9(forestValue509_46_0, forestValue509_46_1, __call509_8(forestValue509_46_2, new javax.crypto.spec.DESKeySpec(forestValue509_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp509_10_0 = -2505847084709584651L;
    int __stackOp509_10_1 = -1;
    spill509_5 = __stackOp509_10_1;
    spill509_6 = __stackOp509_10_0;
    __discardScalar509_11(__stackOp509_10_1);
    life3_62 = spill509_6;
    byte[] __stackOp509_12_0 = new byte[8];
    spill509_7 = __stackOp509_12_0;
    (__stackOp509_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp509_13_0 = spill509_7;
    spill509_8 = __stackOp509_13_0;
    (__stackOp509_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp509_14_0 = spill509_8;
    spill509_9 = __stackOp509_14_0;
    (__stackOp509_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp509_15_0 = spill509_9;
    spill509_10 = __stackOp509_15_0;
    (__stackOp509_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp509_16_0 = spill509_10;
    spill509_11 = __stackOp509_16_0;
    (__stackOp509_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp509_17_0 = spill509_11;
    spill509_12 = __stackOp509_17_0;
    (__stackOp509_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp509_18_0 = spill509_12;
    spill509_13 = __stackOp509_18_0;
    (__stackOp509_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp509_19_0 = spill509_13;
    spill509_14 = __stackOp509_19_0;
    (__stackOp509_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp509_20_0 = spill509_14;
    javax.crypto.Cipher __stackOp509_20_1 = life1_13;
    life5_130 = __call509_21(__stackOp509_20_1, __stackOp509_20_0);
    int __stackOp509_22_0 = spill509_5;
    long __stackOp509_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill509_15 = __stackOp509_22_1;
    spill509_16 = __stackOp509_22_0;
    __discardWide509_23(__stackOp509_22_1);
    __discardScalar509_24(spill509_16);
    life0_204 = spill509_15;
    __fieldWrite509_26(new int[(__call509_25()).length]);
    (__fieldRead509_27())[__call509_29(__fieldRead509_28())] = 1;
    (__fieldRead509_30())[__call509_32(__fieldRead509_31())] = 2;
    (__fieldRead509_33())[__call509_35(__fieldRead509_34())] = 3;
    (__fieldRead509_36())[__call509_38(__fieldRead509_37())] = 4;
    __fieldWrite509_40(new int[(__call509_39()).length]);
    (__fieldRead509_41())[__call509_43(__fieldRead509_42())] = 1;
    (__fieldRead509_44())[__call509_46(__fieldRead509_45())] = 2;
    (__fieldRead509_47())[__call509_49(__fieldRead509_48())] = 3;
    (__fieldRead509_50())[__call509_52(__fieldRead509_51())] = 4;
    (__fieldRead509_53())[__call509_55(__fieldRead509_54())] = 5;
    (__fieldRead509_56())[__call509_58(__fieldRead509_57())] = ((int) life0_204);
    return;
}
public static void h509_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050900_0())[__call3050900_2(__fieldRead3050900_1())] = 2;
    (__fieldRead3050900_3())[__call3050900_5(__fieldRead3050900_4())] = 3;
    (__fieldRead3050900_6())[__call3050900_8(__fieldRead3050900_7())] = 4;
    __fieldWrite3050900_10(new int[(__call3050900_9()).length]);
    (__fieldRead3050900_11())[__call3050900_13(__fieldRead3050900_12())] = 1;
    (__fieldRead3050900_14())[__call3050900_16(__fieldRead3050900_15())] = 2;
    (__fieldRead3050900_17())[__call3050900_19(__fieldRead3050900_18())] = 3;
    (__fieldRead3050900_20())[__call3050900_22(__fieldRead3050900_21())] = 4;
    (__fieldRead3050900_23())[__call3050900_25(__fieldRead3050900_24())] = 5;
    (__fieldRead3050900_26())[__call3050900_28(__fieldRead3050900_27())] = ((int) p1);
    return;
}
public static void h509_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050901_0())[__call3050901_2(__fieldRead3050901_1())] = 3;
    (__fieldRead3050901_3())[__call3050901_5(__fieldRead3050901_4())] = 4;
    __fieldWrite3050901_7(new int[(__call3050901_6()).length]);
    (__fieldRead3050901_8())[__call3050901_10(__fieldRead3050901_9())] = 1;
    (__fieldRead3050901_11())[__call3050901_13(__fieldRead3050901_12())] = 2;
    (__fieldRead3050901_14())[__call3050901_16(__fieldRead3050901_15())] = 3;
    (__fieldRead3050901_17())[__call3050901_19(__fieldRead3050901_18())] = 4;
    (__fieldRead3050901_20())[__call3050901_22(__fieldRead3050901_21())] = 5;
    (__fieldRead3050901_23())[__call3050901_25(__fieldRead3050901_24())] = ((int) p1);
    return;
}
public static void h509_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050902_0())[__call3050902_2(__fieldRead3050902_1())] = 4;
    __fieldWrite3050902_4(new int[(__call3050902_3()).length]);
    (__fieldRead3050902_5())[__call3050902_7(__fieldRead3050902_6())] = 1;
    (__fieldRead3050902_8())[__call3050902_10(__fieldRead3050902_9())] = 2;
    (__fieldRead3050902_11())[__call3050902_13(__fieldRead3050902_12())] = 3;
    (__fieldRead3050902_14())[__call3050902_16(__fieldRead3050902_15())] = 4;
    (__fieldRead3050902_17())[__call3050902_19(__fieldRead3050902_18())] = 5;
    (__fieldRead3050902_20())[__call3050902_22(__fieldRead3050902_21())] = ((int) p1);
    return;
}
public static void h509_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    __fieldWrite3050903_1(new int[(__call3050903_0()).length]);
    (__fieldRead3050903_2())[__call3050903_4(__fieldRead3050903_3())] = 1;
    (__fieldRead3050903_5())[__call3050903_7(__fieldRead3050903_6())] = 2;
    (__fieldRead3050903_8())[__call3050903_10(__fieldRead3050903_9())] = 3;
    (__fieldRead3050903_11())[__call3050903_13(__fieldRead3050903_12())] = 4;
    (__fieldRead3050903_14())[__call3050903_16(__fieldRead3050903_15())] = 5;
    (__fieldRead3050903_17())[__call3050903_19(__fieldRead3050903_18())] = ((int) p1);
    return;
}
public static void h509_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050904_0())[__call3050904_2(__fieldRead3050904_1())] = 2;
    (__fieldRead3050904_3())[__call3050904_5(__fieldRead3050904_4())] = 3;
    (__fieldRead3050904_6())[__call3050904_8(__fieldRead3050904_7())] = 4;
    (__fieldRead3050904_9())[__call3050904_11(__fieldRead3050904_10())] = 5;
    (__fieldRead3050904_12())[__call3050904_14(__fieldRead3050904_13())] = ((int) p1);
    return;
}
public static void h509_5(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050905_0())[__call3050905_2(__fieldRead3050905_1())] = 3;
    (__fieldRead3050905_3())[__call3050905_5(__fieldRead3050905_4())] = 4;
    (__fieldRead3050905_6())[__call3050905_8(__fieldRead3050905_7())] = 5;
    (__fieldRead3050905_9())[__call3050905_11(__fieldRead3050905_10())] = ((int) p1);
    return;
}
public static void h509_6(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050906_0())[__call3050906_2(__fieldRead3050906_1())] = 4;
    (__fieldRead3050906_3())[__call3050906_5(__fieldRead3050906_4())] = 5;
    (__fieldRead3050906_6())[__call3050906_8(__fieldRead3050906_7())] = ((int) p1);
    return;
}
public static void h509_7(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050907_0())[__call3050907_2(__fieldRead3050907_1())] = 5;
    (__fieldRead3050907_3())[__call3050907_5(__fieldRead3050907_4())] = ((int) p1);
    return;
}
public static void h509_8(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3050908_0())[__call3050908_2(__fieldRead3050908_1())] = ((int) p1);
    return;
}
public static void h509_9(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call509_0() throws Throwable;
private static native java.lang.Class __call509_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call509_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call509_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call509_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call509_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call509_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call509_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar509_11(int a0) throws Throwable;
private static native byte[] __call509_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide509_23(long a0) throws Throwable;
private static native void __discardScalar509_24(int a0) throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection[] __call509_25() throws Throwable;
private static native void __fieldWrite509_26(int[] a0) throws Throwable;
private static native int[] __fieldRead509_27() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead509_28() throws Throwable;
private static native int __call509_29(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead509_30() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead509_31() throws Throwable;
private static native int __call509_32(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead509_33() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead509_34() throws Throwable;
private static native int __call509_35(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead509_36() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead509_37() throws Throwable;
private static native int __call509_38(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] __call509_39() throws Throwable;
private static native void __fieldWrite509_40(int[] a0) throws Throwable;
private static native int[] __fieldRead509_41() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead509_42() throws Throwable;
private static native int __call509_43(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead509_44() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead509_45() throws Throwable;
private static native int __call509_46(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead509_47() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead509_48() throws Throwable;
private static native int __call509_49(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead509_50() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead509_51() throws Throwable;
private static native int __call509_52(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead509_53() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead509_54() throws Throwable;
private static native int __call509_55(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead509_56() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead509_57() throws Throwable;
private static native int __call509_58(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050900_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3050900_1() throws Throwable;
private static native int __call3050900_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3050900_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3050900_4() throws Throwable;
private static native int __call3050900_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3050900_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3050900_7() throws Throwable;
private static native int __call3050900_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] __call3050900_9() throws Throwable;
private static native void __fieldWrite3050900_10(int[] a0) throws Throwable;
private static native int[] __fieldRead3050900_11() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050900_12() throws Throwable;
private static native int __call3050900_13(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050900_14() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050900_15() throws Throwable;
private static native int __call3050900_16(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050900_17() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050900_18() throws Throwable;
private static native int __call3050900_19(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050900_20() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050900_21() throws Throwable;
private static native int __call3050900_22(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050900_23() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050900_24() throws Throwable;
private static native int __call3050900_25(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050900_26() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050900_27() throws Throwable;
private static native int __call3050900_28(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050901_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3050901_1() throws Throwable;
private static native int __call3050901_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3050901_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3050901_4() throws Throwable;
private static native int __call3050901_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] __call3050901_6() throws Throwable;
private static native void __fieldWrite3050901_7(int[] a0) throws Throwable;
private static native int[] __fieldRead3050901_8() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050901_9() throws Throwable;
private static native int __call3050901_10(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050901_11() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050901_12() throws Throwable;
private static native int __call3050901_13(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050901_14() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050901_15() throws Throwable;
private static native int __call3050901_16(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050901_17() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050901_18() throws Throwable;
private static native int __call3050901_19(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050901_20() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050901_21() throws Throwable;
private static native int __call3050901_22(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050901_23() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050901_24() throws Throwable;
private static native int __call3050901_25(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050902_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3050902_1() throws Throwable;
private static native int __call3050902_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] __call3050902_3() throws Throwable;
private static native void __fieldWrite3050902_4(int[] a0) throws Throwable;
private static native int[] __fieldRead3050902_5() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050902_6() throws Throwable;
private static native int __call3050902_7(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050902_8() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050902_9() throws Throwable;
private static native int __call3050902_10(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050902_11() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050902_12() throws Throwable;
private static native int __call3050902_13(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050902_14() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050902_15() throws Throwable;
private static native int __call3050902_16(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050902_17() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050902_18() throws Throwable;
private static native int __call3050902_19(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050902_20() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050902_21() throws Throwable;
private static native int __call3050902_22(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType[] __call3050903_0() throws Throwable;
private static native void __fieldWrite3050903_1(int[] a0) throws Throwable;
private static native int[] __fieldRead3050903_2() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050903_3() throws Throwable;
private static native int __call3050903_4(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050903_5() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050903_6() throws Throwable;
private static native int __call3050903_7(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050903_8() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050903_9() throws Throwable;
private static native int __call3050903_10(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050903_11() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050903_12() throws Throwable;
private static native int __call3050903_13(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050903_14() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050903_15() throws Throwable;
private static native int __call3050903_16(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050903_17() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050903_18() throws Throwable;
private static native int __call3050903_19(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050904_0() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050904_1() throws Throwable;
private static native int __call3050904_2(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050904_3() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050904_4() throws Throwable;
private static native int __call3050904_5(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050904_6() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050904_7() throws Throwable;
private static native int __call3050904_8(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050904_9() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050904_10() throws Throwable;
private static native int __call3050904_11(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050904_12() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050904_13() throws Throwable;
private static native int __call3050904_14(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050905_0() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050905_1() throws Throwable;
private static native int __call3050905_2(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050905_3() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050905_4() throws Throwable;
private static native int __call3050905_5(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050905_6() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050905_7() throws Throwable;
private static native int __call3050905_8(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050905_9() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050905_10() throws Throwable;
private static native int __call3050905_11(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050906_0() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050906_1() throws Throwable;
private static native int __call3050906_2(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050906_3() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050906_4() throws Throwable;
private static native int __call3050906_5(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050906_6() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050906_7() throws Throwable;
private static native int __call3050906_8(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050907_0() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050907_1() throws Throwable;
private static native int __call3050907_2(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050907_3() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050907_4() throws Throwable;
private static native int __call3050907_5(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;
private static native int[] __fieldRead3050908_0() throws Throwable;
private static native net.minecraft.entity.item.EntityMinecart$EnumMinecartType __fieldRead3050908_1() throws Throwable;
private static native int __call3050908_2(net.minecraft.entity.item.EntityMinecart$EnumMinecartType a0) throws Throwable;

}

}
