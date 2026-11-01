package moom;


class fa {

static int[] a;

static { __sourceHandlerCall_c6c619d664abe98d49f7(); }

private static native <E extends Throwable> void __sourceHandlerCall_c6c619d664abe98d49f7() throws E;
private static final class __SourceHandler_c6c619d664abe98d49f7 {

public static void f459() throws Throwable {
    javax.crypto.Cipher forestValue459_29_0;
    int forestValue459_29_1;
    javax.crypto.SecretKeyFactory forestValue459_29_2;
    byte[] forestValue459_29_3;
    javax.crypto.Cipher forestValue459_46_0;
    int forestValue459_46_1;
    javax.crypto.SecretKeyFactory forestValue459_46_2;
    byte[] forestValue459_46_3;
    javax.crypto.Cipher spill459_0;
    int spill459_1;
    javax.crypto.SecretKeyFactory spill459_2;
    byte[] spill459_3;
    byte[] spill459_4;
    int spill459_5;
    long spill459_6;
    byte[] spill459_7;
    byte[] spill459_8;
    byte[] spill459_9;
    byte[] spill459_10;
    byte[] spill459_11;
    byte[] spill459_12;
    byte[] spill459_13;
    byte[] spill459_14;
    long spill459_15;
    int spill459_16;
    long life6_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long life3_62;
    byte[] life5_130;
    long life0_204;
    forest_join_46: {
    life6_9 = (__call459_3(__call459_2(-6545962448611042208L, -3253084827969485800L, __call459_1(__call459_0())), 107379231193070L) ^ 18019540856284L);
    spill459_0 = (life1_13 = __call459_4("DES/CBC/NoPadding"));
    spill459_1 = 2;
    spill459_2 = __call459_5("DES");
    byte[] __stackOp459_6_0 = new byte[8];
    spill459_3 = __stackOp459_6_0;
    (__stackOp459_6_0)[0] = ((byte) ((int) (life6_9 >>> 56)));
    life2_28 = 1;
    forestValue459_29_0 = spill459_0;
    forestValue459_29_1 = spill459_1;
    forestValue459_29_2 = spill459_2;
    forestValue459_29_3 = spill459_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue459_46_0 = forestValue459_29_0;
        forestValue459_46_1 = forestValue459_29_1;
        forestValue459_46_2 = forestValue459_29_2;
        forestValue459_46_3 = forestValue459_29_3;
        break forest_join_46;
    }
    byte[] __stackOp459_7_0 = forestValue459_29_3;
    spill459_4 = __stackOp459_7_0;
    (__stackOp459_7_0)[life2_28] = ((byte) ((int) ((life6_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue459_29_3 = spill459_4;
    continue forest_cycle_29;
    }
    }
    __call459_9(forestValue459_46_0, forestValue459_46_1, __call459_8(forestValue459_46_2, new javax.crypto.spec.DESKeySpec(forestValue459_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    long __stackOp459_10_0 = 8335032417942727652L;
    int __stackOp459_10_1 = -1;
    spill459_5 = __stackOp459_10_1;
    spill459_6 = __stackOp459_10_0;
    __discardScalar459_11(__stackOp459_10_1);
    life3_62 = spill459_6;
    byte[] __stackOp459_12_0 = new byte[8];
    spill459_7 = __stackOp459_12_0;
    (__stackOp459_12_0)[0] = ((byte) ((int) (life3_62 >>> 56)));
    byte[] __stackOp459_13_0 = spill459_7;
    spill459_8 = __stackOp459_13_0;
    (__stackOp459_13_0)[1] = ((byte) ((int) (life3_62 >>> 48)));
    byte[] __stackOp459_14_0 = spill459_8;
    spill459_9 = __stackOp459_14_0;
    (__stackOp459_14_0)[2] = ((byte) ((int) (life3_62 >>> 40)));
    byte[] __stackOp459_15_0 = spill459_9;
    spill459_10 = __stackOp459_15_0;
    (__stackOp459_15_0)[3] = ((byte) ((int) (life3_62 >>> 32)));
    byte[] __stackOp459_16_0 = spill459_10;
    spill459_11 = __stackOp459_16_0;
    (__stackOp459_16_0)[4] = ((byte) ((int) (life3_62 >>> 24)));
    byte[] __stackOp459_17_0 = spill459_11;
    spill459_12 = __stackOp459_17_0;
    (__stackOp459_17_0)[5] = ((byte) ((int) (life3_62 >>> 16)));
    byte[] __stackOp459_18_0 = spill459_12;
    spill459_13 = __stackOp459_18_0;
    (__stackOp459_18_0)[6] = ((byte) ((int) (life3_62 >>> 8)));
    byte[] __stackOp459_19_0 = spill459_13;
    spill459_14 = __stackOp459_19_0;
    (__stackOp459_19_0)[7] = ((byte) ((int) life3_62));
    byte[] __stackOp459_20_0 = spill459_14;
    javax.crypto.Cipher __stackOp459_20_1 = life1_13;
    life5_130 = __call459_21(__stackOp459_20_1, __stackOp459_20_0);
    int __stackOp459_22_0 = spill459_5;
    long __stackOp459_22_1 = (((((((((((long) (life5_130)[0]) & 255L) << 56) | ((((long) (life5_130)[1]) & 255L) << 48)) | ((((long) (life5_130)[2]) & 255L) << 40)) | ((((long) (life5_130)[3]) & 255L) << 32)) | ((((long) (life5_130)[4]) & 255L) << 24)) | ((((long) (life5_130)[5]) & 255L) << 16)) | ((((long) (life5_130)[6]) & 255L) << 8)) | (((long) (life5_130)[7]) & 255L));
    spill459_15 = __stackOp459_22_1;
    spill459_16 = __stackOp459_22_0;
    __discardWide459_23(__stackOp459_22_1);
    __discardScalar459_24(spill459_16);
    life0_204 = spill459_15;
    __fieldWrite459_26(new int[(__call459_25()).length]);
    (__fieldRead459_27())[__call459_29(__fieldRead459_28())] = 1;
    (__fieldRead459_30())[__call459_32(__fieldRead459_31())] = 2;
    (__fieldRead459_33())[__call459_35(__fieldRead459_34())] = 3;
    (__fieldRead459_36())[__call459_38(__fieldRead459_37())] = 4;
    (__fieldRead459_39())[__call459_41(__fieldRead459_40())] = 5;
    (__fieldRead459_42())[__call459_44(__fieldRead459_43())] = ((int) life0_204);
    return;
}
public static void h459_0(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045900_0())[__call3045900_2(__fieldRead3045900_1())] = 2;
    (__fieldRead3045900_3())[__call3045900_5(__fieldRead3045900_4())] = 3;
    (__fieldRead3045900_6())[__call3045900_8(__fieldRead3045900_7())] = 4;
    (__fieldRead3045900_9())[__call3045900_11(__fieldRead3045900_10())] = 5;
    (__fieldRead3045900_12())[__call3045900_14(__fieldRead3045900_13())] = ((int) p1);
    return;
}
public static void h459_1(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045901_0())[__call3045901_2(__fieldRead3045901_1())] = 3;
    (__fieldRead3045901_3())[__call3045901_5(__fieldRead3045901_4())] = 4;
    (__fieldRead3045901_6())[__call3045901_8(__fieldRead3045901_7())] = 5;
    (__fieldRead3045901_9())[__call3045901_11(__fieldRead3045901_10())] = ((int) p1);
    return;
}
public static void h459_2(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045902_0())[__call3045902_2(__fieldRead3045902_1())] = 4;
    (__fieldRead3045902_3())[__call3045902_5(__fieldRead3045902_4())] = 5;
    (__fieldRead3045902_6())[__call3045902_8(__fieldRead3045902_7())] = ((int) p1);
    return;
}
public static void h459_3(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045903_0())[__call3045903_2(__fieldRead3045903_1())] = 5;
    (__fieldRead3045903_3())[__call3045903_5(__fieldRead3045903_4())] = ((int) p1);
    return;
}
public static void h459_4(java.lang.NoSuchFieldError p0, long p1) throws Throwable {
    java.lang.NoSuchFieldError life3_2;
    life3_2 = p0;
    (__fieldRead3045904_0())[__call3045904_2(__fieldRead3045904_1())] = ((int) p1);
    return;
}
public static void h459_5(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call459_0() throws Throwable;
private static native java.lang.Class __call459_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call459_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call459_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call459_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call459_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call459_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call459_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native void __discardScalar459_11(int a0) throws Throwable;
private static native byte[] __call459_21(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide459_23(long a0) throws Throwable;
private static native void __discardScalar459_24(int a0) throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType[] __call459_25() throws Throwable;
private static native void __fieldWrite459_26(int[] a0) throws Throwable;
private static native int[] __fieldRead459_27() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead459_28() throws Throwable;
private static native int __call459_29(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead459_30() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead459_31() throws Throwable;
private static native int __call459_32(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead459_33() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead459_34() throws Throwable;
private static native int __call459_35(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead459_36() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead459_37() throws Throwable;
private static native int __call459_38(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead459_39() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead459_40() throws Throwable;
private static native int __call459_41(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead459_42() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead459_43() throws Throwable;
private static native int __call459_44(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045900_0() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045900_1() throws Throwable;
private static native int __call3045900_2(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045900_3() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045900_4() throws Throwable;
private static native int __call3045900_5(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045900_6() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045900_7() throws Throwable;
private static native int __call3045900_8(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045900_9() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045900_10() throws Throwable;
private static native int __call3045900_11(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045900_12() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045900_13() throws Throwable;
private static native int __call3045900_14(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045901_0() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045901_1() throws Throwable;
private static native int __call3045901_2(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045901_3() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045901_4() throws Throwable;
private static native int __call3045901_5(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045901_6() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045901_7() throws Throwable;
private static native int __call3045901_8(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045901_9() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045901_10() throws Throwable;
private static native int __call3045901_11(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045902_0() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045902_1() throws Throwable;
private static native int __call3045902_2(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045902_3() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045902_4() throws Throwable;
private static native int __call3045902_5(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045902_6() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045902_7() throws Throwable;
private static native int __call3045902_8(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045903_0() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045903_1() throws Throwable;
private static native int __call3045903_2(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045903_3() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045903_4() throws Throwable;
private static native int __call3045903_5(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;
private static native int[] __fieldRead3045904_0() throws Throwable;
private static native net.minecraft.block.BlockPlanks$EnumType __fieldRead3045904_1() throws Throwable;
private static native int __call3045904_2(net.minecraft.block.BlockPlanks$EnumType a0) throws Throwable;

}

}
