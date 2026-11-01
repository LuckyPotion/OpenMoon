package moom;


class e7 {

static int[] a;

static { __sourceHandlerCall_129f16412f33f72b7b23(); }

private static native <E extends Throwable> void __sourceHandlerCall_129f16412f33f72b7b23() throws E;
private static final class __SourceHandler_129f16412f33f72b7b23 {

public static void f449() throws Throwable {
    javax.crypto.Cipher forestValue449_29_0;
    int forestValue449_29_1;
    javax.crypto.SecretKeyFactory forestValue449_29_2;
    byte[] forestValue449_29_3;
    javax.crypto.Cipher forestValue449_46_0;
    int forestValue449_46_1;
    javax.crypto.SecretKeyFactory forestValue449_46_2;
    byte[] forestValue449_46_3;
    long[] forestValue449_150_0;
    int forestValue449_150_1;
    long forestValue449_150_2;
    int forestValue449_150_3;
    long[] forestValue449_293_0;
    int forestValue449_293_1;
    long forestValue449_293_2;
    long[] forestValue449_305_0;
    int forestValue449_305_1;
    long forestValue449_305_2;
    javax.crypto.Cipher spill449_0;
    int spill449_1;
    javax.crypto.SecretKeyFactory spill449_2;
    byte[] spill449_3;
    byte[] spill449_4;
    java.lang.String spill449_5;
    int spill449_6;
    int spill449_7;
    long spill449_8;
    byte[] spill449_9;
    byte[] spill449_10;
    byte[] spill449_11;
    byte[] spill449_12;
    byte[] spill449_13;
    byte[] spill449_14;
    byte[] spill449_15;
    byte[] spill449_16;
    long spill449_17;
    int spill449_18;
    java.lang.String spill449_19;
    int spill449_20;
    long[] spill449_21;
    int spill449_22;
    long spill449_23;
    int spill449_24;
    long life11_9;
    javax.crypto.Cipher life1_13;
    int life2_28;
    long[] life0_59;
    int life4_61;
    java.lang.String life5_64;
    int life6_66;
    int life3_68;
    byte[] life7_76;
    long life8_153;
    byte[] life10_221;
    byte[] life7_318;
    forest_join_392: {
    forest_join_46: {
    life11_9 = (__call449_3(__call449_2(-5128056519890162472L, -2871186417919025891L, __call449_1(__call449_0())), 188253695576396L) ^ 11968490384583L);
    spill449_0 = (life1_13 = __call449_4("DES/CBC/NoPadding"));
    spill449_1 = 2;
    spill449_2 = __call449_5("DES");
    byte[] __stackOp449_6_0 = new byte[8];
    spill449_3 = __stackOp449_6_0;
    (__stackOp449_6_0)[0] = ((byte) ((int) (life11_9 >>> 56)));
    life2_28 = 1;
    forestValue449_29_0 = spill449_0;
    forestValue449_29_1 = spill449_1;
    forestValue449_29_2 = spill449_2;
    forestValue449_29_3 = spill449_3;
    forest_cycle_29: while (true) {
    if (!((life2_28 < 8))) {
        forestValue449_46_0 = forestValue449_29_0;
        forestValue449_46_1 = forestValue449_29_1;
        forestValue449_46_2 = forestValue449_29_2;
        forestValue449_46_3 = forestValue449_29_3;
        break forest_join_46;
    }
    byte[] __stackOp449_7_0 = forestValue449_29_3;
    spill449_4 = __stackOp449_7_0;
    (__stackOp449_7_0)[life2_28] = ((byte) ((int) ((life11_9 << (life2_28 * 8)) >>> 56)));
    life2_28 += 1;
    forestValue449_29_3 = spill449_4;
    continue forest_cycle_29;
    }
    }
    __call449_9(forestValue449_46_0, forestValue449_46_1, __call449_8(forestValue449_46_2, new javax.crypto.spec.DESKeySpec(forestValue449_46_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life0_59 = new long[5];
    life4_61 = 0;
    life6_66 = __call449_10((life5_64 = "\031êî¨Ø$F/_\f®:Îè+\177æ¨üL_\030"));
    life3_68 = 0;
    forest_cycle_69: while (true) {
    spill449_5 = life5_64;
    spill449_6 = life3_68;
    life3_68 += 8;
    life7_76 = __call449_12(__call449_11(spill449_5, spill449_6, life3_68), "ISO-8859-1");
    forestValue449_150_0 = life0_59;
    forestValue449_150_1 = (life4_61++);
    forestValue449_150_2 = (((((((((((long) (life7_76)[0]) & 255L) << 56) | ((((long) (life7_76)[1]) & 255L) << 48)) | ((((long) (life7_76)[2]) & 255L) << 40)) | ((((long) (life7_76)[3]) & 255L) << 32)) | ((((long) (life7_76)[4]) & 255L) << 24)) | ((((long) (life7_76)[5]) & 255L) << 16)) | ((((long) (life7_76)[6]) & 255L) << 8)) | (((long) (life7_76)[7]) & 255L));
    forestValue449_150_3 = -1;
    forest_cycle_150: while (true) {
    forest_join_310: {
    forest_join_305: {
    forest_join_293: {
    long __stackOp449_13_0 = forestValue449_150_2;
    int __stackOp449_13_1 = forestValue449_150_3;
    spill449_7 = __stackOp449_13_1;
    spill449_8 = __stackOp449_13_0;
    __discardScalar449_14(__stackOp449_13_1);
    life8_153 = spill449_8;
    byte[] __stackOp449_15_0 = new byte[8];
    spill449_9 = __stackOp449_15_0;
    (__stackOp449_15_0)[0] = ((byte) ((int) (life8_153 >>> 56)));
    byte[] __stackOp449_16_0 = spill449_9;
    spill449_10 = __stackOp449_16_0;
    (__stackOp449_16_0)[1] = ((byte) ((int) (life8_153 >>> 48)));
    byte[] __stackOp449_17_0 = spill449_10;
    spill449_11 = __stackOp449_17_0;
    (__stackOp449_17_0)[2] = ((byte) ((int) (life8_153 >>> 40)));
    byte[] __stackOp449_18_0 = spill449_11;
    spill449_12 = __stackOp449_18_0;
    (__stackOp449_18_0)[3] = ((byte) ((int) (life8_153 >>> 32)));
    byte[] __stackOp449_19_0 = spill449_12;
    spill449_13 = __stackOp449_19_0;
    (__stackOp449_19_0)[4] = ((byte) ((int) (life8_153 >>> 24)));
    byte[] __stackOp449_20_0 = spill449_13;
    spill449_14 = __stackOp449_20_0;
    (__stackOp449_20_0)[5] = ((byte) ((int) (life8_153 >>> 16)));
    byte[] __stackOp449_21_0 = spill449_14;
    spill449_15 = __stackOp449_21_0;
    (__stackOp449_21_0)[6] = ((byte) ((int) (life8_153 >>> 8)));
    byte[] __stackOp449_22_0 = spill449_15;
    spill449_16 = __stackOp449_22_0;
    (__stackOp449_22_0)[7] = ((byte) ((int) life8_153));
    byte[] __stackOp449_23_0 = spill449_16;
    javax.crypto.Cipher __stackOp449_23_1 = life1_13;
    life10_221 = __call449_24(__stackOp449_23_1, __stackOp449_23_0);
    int __stackOp449_25_0 = spill449_7;
    long __stackOp449_25_1 = (((((((((((long) (life10_221)[0]) & 255L) << 56) | ((((long) (life10_221)[1]) & 255L) << 48)) | ((((long) (life10_221)[2]) & 255L) << 40)) | ((((long) (life10_221)[3]) & 255L) << 32)) | ((((long) (life10_221)[4]) & 255L) << 24)) | ((((long) (life10_221)[5]) & 255L) << 16)) | ((((long) (life10_221)[6]) & 255L) << 8)) | (((long) (life10_221)[7]) & 255L));
    spill449_17 = __stackOp449_25_1;
    spill449_18 = __stackOp449_25_0;
    __discardWide449_26(__stackOp449_25_1);
    switch (spill449_18) {
default:
{
        forestValue449_293_0 = forestValue449_150_0;
        forestValue449_293_1 = forestValue449_150_1;
        forestValue449_293_2 = spill449_17;
        break forest_join_293;
    }
case 0:
{
        forestValue449_305_0 = forestValue449_150_0;
        forestValue449_305_1 = forestValue449_150_1;
        forestValue449_305_2 = spill449_17;
        break forest_join_305;
    }
}
    }
    (forestValue449_293_0)[forestValue449_293_1] = forestValue449_293_2;
    if (!((life3_68 >= life6_66))) {
        continue forest_cycle_69;
    }
    life6_66 = __call449_27((life5_64 = "Ì©l|¢©Á²Ê\023&ÄDþ"));
    life3_68 = 0;
    break forest_join_310;
    }
    (forestValue449_305_0)[forestValue449_305_1] = forestValue449_305_2;
    if (!((life3_68 >= life6_66))) {
        break forest_join_310;
    }
    break forest_join_392;
    }
    spill449_19 = life5_64;
    spill449_20 = life3_68;
    life3_68 += 8;
    life7_318 = __call449_29(__call449_28(spill449_19, spill449_20, life3_68), "ISO-8859-1");
    spill449_21 = life0_59;
    spill449_22 = (life4_61++);
    spill449_23 = (((((((((((long) (life7_318)[0]) & 255L) << 56) | ((((long) (life7_318)[1]) & 255L) << 48)) | ((((long) (life7_318)[2]) & 255L) << 40)) | ((((long) (life7_318)[3]) & 255L) << 32)) | ((((long) (life7_318)[4]) & 255L) << 24)) | ((((long) (life7_318)[5]) & 255L) << 16)) | ((((long) (life7_318)[6]) & 255L) << 8)) | (((long) (life7_318)[7]) & 255L));
    spill449_24 = 0;
    forestValue449_150_0 = spill449_21;
    forestValue449_150_1 = spill449_22;
    forestValue449_150_2 = spill449_23;
    forestValue449_150_3 = spill449_24;
    continue forest_cycle_150;
    }
    }
    }
    __fieldWrite449_31(new int[(__call449_30()).length]);
    (__fieldRead449_32())[__call449_34(__fieldRead449_33())] = 1;
    (__fieldRead449_35())[__call449_37(__fieldRead449_36())] = 2;
    (__fieldRead449_38())[__call449_40(__fieldRead449_39())] = 3;
    (__fieldRead449_41())[__call449_43(__fieldRead449_42())] = 4;
    (__fieldRead449_44())[__call449_46(__fieldRead449_45())] = 5;
    (__fieldRead449_47())[__call449_49(__fieldRead449_48())] = ((int) (life0_59)[1]);
    (__fieldRead449_50())[__call449_52(__fieldRead449_51())] = ((int) (life0_59)[3]);
    (__fieldRead449_53())[__call449_55(__fieldRead449_54())] = ((int) (life0_59)[0]);
    (__fieldRead449_56())[__call449_58(__fieldRead449_57())] = ((int) (life0_59)[2]);
    (__fieldRead449_59())[__call449_61(__fieldRead449_60())] = ((int) (life0_59)[4]);
    return;
}
public static void h449_0(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044900_0())[__call3044900_2(__fieldRead3044900_1())] = 2;
    (__fieldRead3044900_3())[__call3044900_5(__fieldRead3044900_4())] = 3;
    (__fieldRead3044900_6())[__call3044900_8(__fieldRead3044900_7())] = 4;
    (__fieldRead3044900_9())[__call3044900_11(__fieldRead3044900_10())] = 5;
    (__fieldRead3044900_12())[__call3044900_14(__fieldRead3044900_13())] = ((int) (p1)[1]);
    (__fieldRead3044900_15())[__call3044900_17(__fieldRead3044900_16())] = ((int) (p1)[3]);
    (__fieldRead3044900_18())[__call3044900_20(__fieldRead3044900_19())] = ((int) (p1)[0]);
    (__fieldRead3044900_21())[__call3044900_23(__fieldRead3044900_22())] = ((int) (p1)[2]);
    (__fieldRead3044900_24())[__call3044900_26(__fieldRead3044900_25())] = ((int) (p1)[4]);
    return;
}
public static void h449_1(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044901_0())[__call3044901_2(__fieldRead3044901_1())] = 3;
    (__fieldRead3044901_3())[__call3044901_5(__fieldRead3044901_4())] = 4;
    (__fieldRead3044901_6())[__call3044901_8(__fieldRead3044901_7())] = 5;
    (__fieldRead3044901_9())[__call3044901_11(__fieldRead3044901_10())] = ((int) (p1)[1]);
    (__fieldRead3044901_12())[__call3044901_14(__fieldRead3044901_13())] = ((int) (p1)[3]);
    (__fieldRead3044901_15())[__call3044901_17(__fieldRead3044901_16())] = ((int) (p1)[0]);
    (__fieldRead3044901_18())[__call3044901_20(__fieldRead3044901_19())] = ((int) (p1)[2]);
    (__fieldRead3044901_21())[__call3044901_23(__fieldRead3044901_22())] = ((int) (p1)[4]);
    return;
}
public static void h449_2(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044902_0())[__call3044902_2(__fieldRead3044902_1())] = 4;
    (__fieldRead3044902_3())[__call3044902_5(__fieldRead3044902_4())] = 5;
    (__fieldRead3044902_6())[__call3044902_8(__fieldRead3044902_7())] = ((int) (p1)[1]);
    (__fieldRead3044902_9())[__call3044902_11(__fieldRead3044902_10())] = ((int) (p1)[3]);
    (__fieldRead3044902_12())[__call3044902_14(__fieldRead3044902_13())] = ((int) (p1)[0]);
    (__fieldRead3044902_15())[__call3044902_17(__fieldRead3044902_16())] = ((int) (p1)[2]);
    (__fieldRead3044902_18())[__call3044902_20(__fieldRead3044902_19())] = ((int) (p1)[4]);
    return;
}
public static void h449_3(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044903_0())[__call3044903_2(__fieldRead3044903_1())] = 5;
    (__fieldRead3044903_3())[__call3044903_5(__fieldRead3044903_4())] = ((int) (p1)[1]);
    (__fieldRead3044903_6())[__call3044903_8(__fieldRead3044903_7())] = ((int) (p1)[3]);
    (__fieldRead3044903_9())[__call3044903_11(__fieldRead3044903_10())] = ((int) (p1)[0]);
    (__fieldRead3044903_12())[__call3044903_14(__fieldRead3044903_13())] = ((int) (p1)[2]);
    (__fieldRead3044903_15())[__call3044903_17(__fieldRead3044903_16())] = ((int) (p1)[4]);
    return;
}
public static void h449_4(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044904_0())[__call3044904_2(__fieldRead3044904_1())] = ((int) (p1)[1]);
    (__fieldRead3044904_3())[__call3044904_5(__fieldRead3044904_4())] = ((int) (p1)[3]);
    (__fieldRead3044904_6())[__call3044904_8(__fieldRead3044904_7())] = ((int) (p1)[0]);
    (__fieldRead3044904_9())[__call3044904_11(__fieldRead3044904_10())] = ((int) (p1)[2]);
    (__fieldRead3044904_12())[__call3044904_14(__fieldRead3044904_13())] = ((int) (p1)[4]);
    return;
}
public static void h449_5(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044905_0())[__call3044905_2(__fieldRead3044905_1())] = ((int) (p1)[3]);
    (__fieldRead3044905_3())[__call3044905_5(__fieldRead3044905_4())] = ((int) (p1)[0]);
    (__fieldRead3044905_6())[__call3044905_8(__fieldRead3044905_7())] = ((int) (p1)[2]);
    (__fieldRead3044905_9())[__call3044905_11(__fieldRead3044905_10())] = ((int) (p1)[4]);
    return;
}
public static void h449_6(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044906_0())[__call3044906_2(__fieldRead3044906_1())] = ((int) (p1)[0]);
    (__fieldRead3044906_3())[__call3044906_5(__fieldRead3044906_4())] = ((int) (p1)[2]);
    (__fieldRead3044906_6())[__call3044906_8(__fieldRead3044906_7())] = ((int) (p1)[4]);
    return;
}
public static void h449_7(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044907_0())[__call3044907_2(__fieldRead3044907_1())] = ((int) (p1)[2]);
    (__fieldRead3044907_3())[__call3044907_5(__fieldRead3044907_4())] = ((int) (p1)[4]);
    return;
}
public static void h449_8(java.lang.NoSuchFieldError p0, long[] p1) throws Throwable {
    java.lang.NoSuchFieldError life2_2;
    life2_2 = p0;
    (__fieldRead3044908_0())[__call3044908_2(__fieldRead3044908_1())] = ((int) (p1)[4]);
    return;
}
public static void h449_9(java.lang.NoSuchFieldError p0) throws Throwable {
    java.lang.NoSuchFieldError life1_2;
    life1_2 = p0;
    return;
}
private static native java.lang.invoke.MethodHandles.Lookup __call449_0() throws Throwable;
private static native java.lang.Class __call449_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call449_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call449_3(moom._a a0, long a1) throws Throwable;
private static native javax.crypto.Cipher __call449_4(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call449_5(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call449_8(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call449_9(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call449_10(java.lang.String a0) throws Throwable;
private static native java.lang.String __call449_11(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call449_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar449_14(int a0) throws Throwable;
private static native byte[] __call449_24(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide449_26(long a0) throws Throwable;
private static native int __call449_27(java.lang.String a0) throws Throwable;
private static native java.lang.String __call449_28(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call449_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection[] __call449_30() throws Throwable;
private static native void __fieldWrite449_31(int[] a0) throws Throwable;
private static native int[] __fieldRead449_32() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_33() throws Throwable;
private static native int __call449_34(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_35() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_36() throws Throwable;
private static native int __call449_37(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_38() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_39() throws Throwable;
private static native int __call449_40(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_41() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_42() throws Throwable;
private static native int __call449_43(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_44() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_45() throws Throwable;
private static native int __call449_46(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_47() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_48() throws Throwable;
private static native int __call449_49(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_50() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_51() throws Throwable;
private static native int __call449_52(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_53() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_54() throws Throwable;
private static native int __call449_55(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_56() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_57() throws Throwable;
private static native int __call449_58(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead449_59() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead449_60() throws Throwable;
private static native int __call449_61(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_1() throws Throwable;
private static native int __call3044900_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_4() throws Throwable;
private static native int __call3044900_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_7() throws Throwable;
private static native int __call3044900_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_10() throws Throwable;
private static native int __call3044900_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_12() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_13() throws Throwable;
private static native int __call3044900_14(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_15() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_16() throws Throwable;
private static native int __call3044900_17(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_18() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_19() throws Throwable;
private static native int __call3044900_20(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_21() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_22() throws Throwable;
private static native int __call3044900_23(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044900_24() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044900_25() throws Throwable;
private static native int __call3044900_26(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_1() throws Throwable;
private static native int __call3044901_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_4() throws Throwable;
private static native int __call3044901_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_7() throws Throwable;
private static native int __call3044901_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_10() throws Throwable;
private static native int __call3044901_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_12() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_13() throws Throwable;
private static native int __call3044901_14(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_15() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_16() throws Throwable;
private static native int __call3044901_17(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_18() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_19() throws Throwable;
private static native int __call3044901_20(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044901_21() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044901_22() throws Throwable;
private static native int __call3044901_23(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044902_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044902_1() throws Throwable;
private static native int __call3044902_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044902_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044902_4() throws Throwable;
private static native int __call3044902_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044902_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044902_7() throws Throwable;
private static native int __call3044902_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044902_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044902_10() throws Throwable;
private static native int __call3044902_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044902_12() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044902_13() throws Throwable;
private static native int __call3044902_14(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044902_15() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044902_16() throws Throwable;
private static native int __call3044902_17(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044902_18() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044902_19() throws Throwable;
private static native int __call3044902_20(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044903_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044903_1() throws Throwable;
private static native int __call3044903_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044903_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044903_4() throws Throwable;
private static native int __call3044903_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044903_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044903_7() throws Throwable;
private static native int __call3044903_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044903_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044903_10() throws Throwable;
private static native int __call3044903_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044903_12() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044903_13() throws Throwable;
private static native int __call3044903_14(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044903_15() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044903_16() throws Throwable;
private static native int __call3044903_17(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044904_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044904_1() throws Throwable;
private static native int __call3044904_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044904_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044904_4() throws Throwable;
private static native int __call3044904_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044904_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044904_7() throws Throwable;
private static native int __call3044904_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044904_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044904_10() throws Throwable;
private static native int __call3044904_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044904_12() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044904_13() throws Throwable;
private static native int __call3044904_14(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044905_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044905_1() throws Throwable;
private static native int __call3044905_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044905_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044905_4() throws Throwable;
private static native int __call3044905_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044905_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044905_7() throws Throwable;
private static native int __call3044905_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044905_9() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044905_10() throws Throwable;
private static native int __call3044905_11(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044906_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044906_1() throws Throwable;
private static native int __call3044906_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044906_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044906_4() throws Throwable;
private static native int __call3044906_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044906_6() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044906_7() throws Throwable;
private static native int __call3044906_8(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044907_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044907_1() throws Throwable;
private static native int __call3044907_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044907_3() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044907_4() throws Throwable;
private static native int __call3044907_5(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;
private static native int[] __fieldRead3044908_0() throws Throwable;
private static native net.minecraft.block.BlockRailBase$EnumRailDirection __fieldRead3044908_1() throws Throwable;
private static native int __call3044908_2(net.minecraft.block.BlockRailBase$EnumRailDirection a0) throws Throwable;

}

}
