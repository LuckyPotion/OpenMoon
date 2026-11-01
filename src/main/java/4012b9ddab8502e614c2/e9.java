package moom;


class e9 {

static int[] a;

static { __sourceHandlerCall_574d717de064a3e278eb(); }

private static native <E extends Throwable> void __sourceHandlerCall_574d717de064a3e278eb() throws E;
private static final class __SourceHandler_574d717de064a3e278eb {

public static void f450() throws Throwable {
    javax.crypto.Cipher forestValue450_29_0;
    int forestValue450_29_1;
    javax.crypto.SecretKeyFactory forestValue450_29_2;
    byte[] forestValue450_29_3;
    javax.crypto.Cipher forestValue450_46_0;
    int forestValue450_46_1;
    javax.crypto.SecretKeyFactory forestValue450_46_2;
    byte[] forestValue450_46_3;
    javax.crypto.Cipher spill450_0;
    int spill450_1;
    javax.crypto.SecretKeyFactory spill450_2;
    byte[] spill450_3;
    byte[] spill450_4;
    int spill450_5;
    long spill450_6;
    byte[] spill450_7;
    byte[] spill450_8;
    byte[] spill450_9;
    byte[] spill450_10;
    byte[] spill450_11;
    byte[] spill450_12;
    byte[] spill450_13;
    byte[] spill450_14;
    long spill450_15;
    int spill450_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call450_3(__call450_2(259555386162344376L, 667862451716370072L, __call450_1(__call450_0())), 169633654924393L) ^ 102207510184653L);
    spill450_0 = (life1_13 = __call450_4("DES/CBC/NoPadding"));
    spill450_1 = 2;
    spill450_2 = __call450_5("DES");
    byte[] __stackOp450_6_0 = new byte[8];
    spill450_3 = __stackOp450_6_0;
    (__stackOp450_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue450_29_0 = spill450_0;
    forestValue450_29_1 = spill450_1;
    forestValue450_29_2 = spill450_2;
    forestValue450_29_3 = spill450_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue450_46_0 = forestValue450_29_0;
        forestValue450_46_1 = forestValue450_29_1;
        forestValue450_46_2 = forestValue450_29_2;
        forestValue450_46_3 = forestValue450_29_3;
        break forest_join_46;
    }
    byte[] __stackOp450_7_0 = forestValue450_29_3;
    spill450_4 = __stackOp450_7_0;
    (__stackOp450_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue450_29_3 = spill450_4;
    continue forest_cycle_29;
    }
    }
    __call450_9(forestValue450_46_0, forestValue450_46_1, __call450_8(forestValue450_46_2, new javax.crypto.spec.DESKeySpec(forestValue450_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp450_10_0 = 5569252003336102981L;
    int __stackOp450_10_1 = -1;
    spill450_5 = __stackOp450_10_1;
    spill450_6 = __stackOp450_10_0;
    __discardScalar450_11(__stackOp450_10_1);
    life3_62 = spill450_6;
    byte[] __stackOp450_12_0 = new byte[8];
    spill450_7 = __stackOp450_12_0;
    (__stackOp450_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp450_13_0 = spill450_7;
    spill450_8 = __stackOp450_13_0;
    (__stackOp450_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp450_14_0 = spill450_8;
    spill450_9 = __stackOp450_14_0;
    (__stackOp450_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp450_15_0 = spill450_9;
    spill450_10 = __stackOp450_15_0;
    (__stackOp450_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp450_16_0 = spill450_10;
    spill450_11 = __stackOp450_16_0;
    (__stackOp450_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp450_17_0 = spill450_11;
    spill450_12 = __stackOp450_17_0;
    (__stackOp450_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp450_18_0 = spill450_12;
    spill450_13 = __stackOp450_18_0;
    (__stackOp450_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp450_19_0 = spill450_13;
    spill450_14 = __stackOp450_19_0;
    (__stackOp450_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp450_20_0 = spill450_14;
    javax.crypto.Cipher __stackOp450_20_1 = life1_13;
    life5_130 = __call450_21(__stackOp450_20_1, __stackOp450_20_0);
    int __stackOp450_22_0 = spill450_5;
    long __stackOp450_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill450_15 = __stackOp450_22_1;
    spill450_16 = __stackOp450_22_0;
    __discardWide450_23(__stackOp450_22_1);
    __discardScalar450_24(spill450_16);
    life0_204 = spill450_15;
    __fieldWrite450_26(new int[(__call450_25()).length]);
    (__fieldRead450_27())[__call450_29(__fieldRead450_28())] = 1;
    (__fieldRead450_30())[__call450_32(__fieldRead450_31())] = 2;
    (__fieldRead450_33())[__call450_35(__fieldRead450_34())] = 3;
    (__fieldRead450_36())[__call450_38(__fieldRead450_37())] = 4;
    (__fieldRead450_39())[__call450_41(__fieldRead450_40())] = 5;
    (__fieldRead450_42())[__call450_44(__fieldRead450_43())] = ((int) life0_204);
    return;
}
public static void h450_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045000_0())[__call3045000_2(__fieldRead3045000_1())] = 2;
    (__fieldRead3045000_3())[__call3045000_5(__fieldRead3045000_4())] = 3;
    (__fieldRead3045000_6())[__call3045000_8(__fieldRead3045000_7())] = 4;
    (__fieldRead3045000_9())[__call3045000_11(__fieldRead3045000_10())] = 5;
    (__fieldRead3045000_12())[__call3045000_14(__fieldRead3045000_13())] = ((int) p1);
    return;
}
public static void h450_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045001_0())[__call3045001_2(__fieldRead3045001_1())] = 3;
    (__fieldRead3045001_3())[__call3045001_5(__fieldRead3045001_4())] = 4;
    (__fieldRead3045001_6())[__call3045001_8(__fieldRead3045001_7())] = 5;
    (__fieldRead3045001_9())[__call3045001_11(__fieldRead3045001_10())] = ((int) p1);
    return;
}
public static void h450_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045002_0())[__call3045002_2(__fieldRead3045002_1())] = 4;
    (__fieldRead3045002_3())[__call3045002_5(__fieldRead3045002_4())] = 5;
    (__fieldRead3045002_6())[__call3045002_8(__fieldRead3045002_7())] = ((int) p1);
    return;
}
public static void h450_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045003_0())[__call3045003_2(__fieldRead3045003_1())] = 5;
    (__fieldRead3045003_3())[__call3045003_5(__fieldRead3045003_4())] = ((int) p1);
    return;
}
public static void h450_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045004_0())[__call3045004_2(__fieldRead3045004_1())] = ((int) p1);
    return;
}
public static void h450_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call450_0() throws Throwable;
private static native java.lang.Class __call450_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call450_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call450_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call450_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call450_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call450_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call450_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar450_11(int a0) throws Throwable;
private static native byte[] __call450_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide450_23(long a0) throws Throwable;
private static native void __discardScalar450_24(int a0) throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection[] __call450_25() throws Throwable;
private static native void __fieldWrite450_26(int[] a0) throws Throwable;
private static native int[] __fieldRead450_27() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead450_28() throws Throwable;
private static native int __call450_29(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead450_30() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead450_31() throws Throwable;
private static native int __call450_32(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead450_33() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead450_34() throws Throwable;
private static native int __call450_35(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead450_36() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead450_37() throws Throwable;
private static native int __call450_38(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead450_39() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead450_40() throws Throwable;
private static native int __call450_41(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead450_42() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead450_43() throws Throwable;
private static native int __call450_44(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045000_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045000_1() throws Throwable;
private static native int __call3045000_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045000_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045000_4() throws Throwable;
private static native int __call3045000_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045000_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045000_7() throws Throwable;
private static native int __call3045000_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045000_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045000_10() throws Throwable;
private static native int __call3045000_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045000_12() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045000_13() throws Throwable;
private static native int __call3045000_14(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045001_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045001_1() throws Throwable;
private static native int __call3045001_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045001_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045001_4() throws Throwable;
private static native int __call3045001_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045001_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045001_7() throws Throwable;
private static native int __call3045001_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045001_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045001_10() throws Throwable;
private static native int __call3045001_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045002_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045002_1() throws Throwable;
private static native int __call3045002_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045002_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045002_4() throws Throwable;
private static native int __call3045002_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045002_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045002_7() throws Throwable;
private static native int __call3045002_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045003_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045003_1() throws Throwable;
private static native int __call3045003_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045003_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045003_4() throws Throwable;
private static native int __call3045003_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3045004_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3045004_1() throws Throwable;
private static native int __call3045004_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;

}

}
