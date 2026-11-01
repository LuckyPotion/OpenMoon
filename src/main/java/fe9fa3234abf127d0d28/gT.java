package com.moon;


public class gT implements java.lang.Runnable {

private static net.minecraft.client.Minecraft a;

private com.moon.hF b;

private static long c;

private static long d;

private static long e;

public gT() { super(); }

private static void __sourceConstructorBody_451f8ff9cfa49369(com.moon.gT receiver) throws Throwable {
long local1_life2 = (com.moon.gT.c ^ 111259933483462L);
    boolean __sourceSpill27_4 = moom.to.aa();
    com.moon.gT.__sourceConstructorInit_451f8ff9cfa49369_0(((com.moon.gT)(receiver)));
    boolean local3_life6 = __sourceSpill27_4;
    try {
        ((com.moon.gT)(receiver)).b = ((com.moon.hF)(new com.moon.hF(((int) com.moon.gT.d))));
        if (local3_life6) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    } catch (java.lang.NullPointerException __catchStack27) {
        throw com.moon.gT.a(((java.lang.Exception)(__catchStack27)));
    }
    return;
}


static {
c = ((long)(((moom._a)(moom._c.a(((long)(-4692212656983776740L)), ((long)(1216436254670745280L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(172236385552533L)))));
    long local5_life6 = (com.moon.gT.c ^ 93262211142401L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill111_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill111_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill111_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill111_13 = new byte[8];
    (__sourceSpill111_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill111_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation111_15 = __sourceSpill111_13;
    ((javax.crypto.Cipher)(__sourceSpill111_10)).init(((int)(__sourceSpill111_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill111_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation111_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local9_life18 = -8225002282903948578L;
    byte[] __sourceSpill111_19 = new byte[8];
    (__sourceSpill111_19)[0] = ((byte) ((int) (local9_life18 >>> 56)));
    (__sourceSpill111_19)[1] = ((byte) ((int) (local9_life18 >>> 48)));
    (__sourceSpill111_19)[2] = ((byte) ((int) (local9_life18 >>> 40)));
    (__sourceSpill111_19)[3] = ((byte) ((int) (local9_life18 >>> 32)));
    (__sourceSpill111_19)[4] = ((byte) ((int) (local9_life18 >>> 24)));
    (__sourceSpill111_19)[5] = ((byte) ((int) (local9_life18 >>> 16)));
    (__sourceSpill111_19)[6] = ((byte) ((int) (local9_life18 >>> 8)));
    (__sourceSpill111_19)[7] = ((byte) ((int) local9_life18));
    javax.crypto.Cipher __sourceSpill111_20 = local7_life8;
    byte[] local11_life22 = ((javax.crypto.Cipher)(__sourceSpill111_20)).doFinal(((byte[])(__sourceSpill111_19)));
    d = ((long)((((((((((((long) (local11_life22)[0]) & 255L) << 56) | ((((long) (local11_life22)[1]) & 255L) << 48)) | ((((long) (local11_life22)[2]) & 255L) << 40)) | ((((long) (local11_life22)[3]) & 255L) << 32)) | ((((long) (local11_life22)[4]) & 255L) << 24)) | ((((long) (local11_life22)[5]) & 255L) << 16)) | ((((long) (local11_life22)[6]) & 255L) << 8)) | (((long) (local11_life22)[7]) & 255L))));
    javax.crypto.Cipher local0_life25;
    javax.crypto.Cipher __sourceSpill111_27 = (local0_life25 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill111_28 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill111_29 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill111_30 = new byte[8];
    (__sourceSpill111_30)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life31 = 1;
    while ((local1_life31 < 8)) {
        (__sourceSpill111_30)[local1_life31] = ((byte) ((int) ((local5_life6 << (local1_life31 * 8)) >>> 56)));
        local1_life31 += 1;
    }
    byte[] __sourcePreallocation111_32 = __sourceSpill111_30;
    ((javax.crypto.Cipher)(__sourceSpill111_27)).init(((int)(__sourceSpill111_28)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill111_29)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation111_32)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life35 = -8153237004806583420L;
    byte[] __sourceSpill111_36 = new byte[8];
    (__sourceSpill111_36)[0] = ((byte) ((int) (local2_life35 >>> 56)));
    (__sourceSpill111_36)[1] = ((byte) ((int) (local2_life35 >>> 48)));
    (__sourceSpill111_36)[2] = ((byte) ((int) (local2_life35 >>> 40)));
    (__sourceSpill111_36)[3] = ((byte) ((int) (local2_life35 >>> 32)));
    (__sourceSpill111_36)[4] = ((byte) ((int) (local2_life35 >>> 24)));
    (__sourceSpill111_36)[5] = ((byte) ((int) (local2_life35 >>> 16)));
    (__sourceSpill111_36)[6] = ((byte) ((int) (local2_life35 >>> 8)));
    (__sourceSpill111_36)[7] = ((byte) ((int) local2_life35));
    javax.crypto.Cipher __sourceSpill111_37 = local0_life25;
    byte[] local4_life39 = ((javax.crypto.Cipher)(__sourceSpill111_37)).doFinal(((byte[])(__sourceSpill111_36)));
    e = ((long)((((((((((((long) (local4_life39)[0]) & 255L) << 56) | ((((long) (local4_life39)[1]) & 255L) << 48)) | ((((long) (local4_life39)[2]) & 255L) << 40)) | ((((long) (local4_life39)[3]) & 255L) << 32)) | ((((long) (local4_life39)[4]) & 255L) << 24)) | ((((long) (local4_life39)[5]) & 255L) << 16)) | ((((long) (local4_life39)[6]) & 255L) << 8)) | (((long) (local4_life39)[7]) & 255L))));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceConstructorInit_451f8ff9cfa49369_0(com.moon.gT a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_fdb5ce3025f1df6294a4(com.moon.gT a0) throws E;
private static final class __SourceHandler_fdb5ce3025f1df6294a4 {

public static void f60(com.moon.gT receiver) throws Throwable {
    int forestValue60_34_0;
    int forestValue60_50_0;
    net.minecraft.entity.Entity forestValue60_57_0;
    int forestValue60_86_0;
    net.minecraft.entity.Entity forestValue60_141_0;
    int forestValue60_141_1;
    net.minecraft.entity.Entity forestValue60_142_0;
    net.minecraft.entity.Entity forestValue60_143_0;
    int forestValue60_143_1;
    boolean spill60_0;
    int spill60_1;
    net.minecraft.entity.Entity spill60_2;
    int spill60_3;
    net.minecraft.entity.Entity spill60_4;
    int spill60_5;
    long life1_3;
    int life4_8;
    int life3_9;
    java.lang.Object life5_11;
    java.util.Iterator life6_16;
    net.minecraft.entity.Entity life5_23;
    moom.CA life7_67;
    com.moon.n5 life8_115;
    com.moon.n5 life9_125;
    int life10_148;
    forest_join_146: {
    life1_3 = (__fieldRead60_0() ^ 39807257491796L);
    spill60_0 = __call60_1();
    life4_8 = __integerCategory60_5(__call60_4(__fieldRead60_3(__fieldRead60_2())));
    life3_9 = __integerCategory60_6(spill60_0);
    life5_11 = null;
    life6_16 = __call60_10(__fieldRead60_9(__fieldRead60_8(__fieldRead60_7())));
    forest_cycle_17: while (true) {
    forest_join_143: {
    forest_join_142: {
    forest_join_141: {
    forest_join_92: {
    forest_join_90: {
    forest_join_87: {
    forest_join_86: {
    forest_join_57: {
    forest_join_56: {
    forest_join_50: {
    forest_join_42: {
    forest_join_37: {
    forest_join_34: {
    forest_join_28: {
    if (!(__call60_11(life6_16))) {
        break forest_join_146;
    }
    life5_23 = __cast60_13(__call60_12(life6_16));
    if (!((life5_23 == null))) {
        break forest_join_28;
    }
    if (!((life3_9 != 0))) {
        continue forest_cycle_17;
    }
    }
    spill60_1 = life4_8;
    if (!((life3_9 == 0))) {
        forestValue60_34_0 = spill60_1;
        break forest_join_34;
    }
    if (!((spill60_1 == 0))) {
        break forest_join_37;
    }
    forestValue60_34_0 = __instanceOf60_14(life5_23);
    }
    if (!((life3_9 == 0))) {
        forestValue60_50_0 = forestValue60_34_0;
        break forest_join_50;
    }
    if (!((forestValue60_34_0 != 0))) {
        break forest_join_42;
    }
    }
    __fieldWrite60_15(life5_23, 0);
    if (!((life3_9 != 0))) {
        continue forest_cycle_17;
    }
    }
    spill60_2 = life5_23;
    if (!((life3_9 == 0))) {
        forestValue60_57_0 = spill60_2;
        break forest_join_57;
    }
    forestValue60_50_0 = __numericCompare60_19(__call60_18(spill60_2, __fieldRead60_17(__fieldRead60_16())), 0x1.0p7f);
    }
    if (!((forestValue60_50_0 > 0))) {
        break forest_join_56;
    }
    __fieldWrite60_20(life5_23, 0);
    if (!((life3_9 != 0))) {
        continue forest_cycle_17;
    }
    }
    forestValue60_57_0 = life5_23;
    }
    life7_67 = __call60_21(forestValue60_57_0);
    if (!((life3_9 == 0))) {
        break forest_join_90;
    }
    if (!((__numericCompare60_24((__fieldRead60_22(life7_67) - __fieldRead60_23(life7_67)), 0x1.9p5d) <= 0))) {
        break forest_join_87;
    }
    spill60_3 = __numericCompare60_27((__fieldRead60_25(life7_67) - __fieldRead60_26(life7_67)), 0x1.9p5d);
    if (!((life3_9 == 0))) {
        forestValue60_86_0 = spill60_3;
        break forest_join_86;
    }
    if (!((spill60_3 <= 0))) {
        break forest_join_87;
    }
    forestValue60_86_0 = __numericCompare60_30((__fieldRead60_28(life7_67) - __fieldRead60_29(life7_67)), 0x1.9p5d);
    }
    if (!((forestValue60_86_0 > 0))) {
        break forest_join_92;
    }
    }
    __fieldWrite60_31(life5_23, 0);
    }
    if (!((life3_9 != 0))) {
        continue forest_cycle_17;
    }
    }
    life8_115 = new com.moon.n5(__fieldRead60_32(life7_67), __fieldRead60_33(life7_67), __fieldRead60_34(life7_67));
    life9_125 = new com.moon.n5(__fieldRead60_35(life7_67), __fieldRead60_36(life7_67), __fieldRead60_37(life7_67));
    life10_148 = __integerCategory60_52(__call60_51(__fieldRead60_38(receiver), life8_115, life9_125, new com.moon.n5(__call60_41(__call60_40(__fieldRead60_39())), (__call60_44(__call60_43(__fieldRead60_42())) + ((double) __call60_47(__fieldRead60_46(__fieldRead60_45())))), __call60_50(__call60_49(__fieldRead60_48())))));
    spill60_4 = life5_23;
    spill60_5 = life10_148;
    if (!((life3_9 == 0))) {
        forestValue60_141_0 = spill60_4;
        forestValue60_141_1 = spill60_5;
        break forest_join_141;
    }
    if (!((spill60_5 == 0))) {
        forestValue60_142_0 = spill60_4;
        break forest_join_142;
    }
    forestValue60_141_0 = spill60_4;
    forestValue60_141_1 = 1;
    }
    forestValue60_143_0 = forestValue60_141_0;
    forestValue60_143_1 = forestValue60_141_1;
    break forest_join_143;
    }
    forestValue60_143_0 = forestValue60_142_0;
    forestValue60_143_1 = 0;
    }
    __fieldWrite60_53(forestValue60_143_0, forestValue60_143_1);
    if (!((life3_9 != 0))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    return;
}
public static void h60_0(java.lang.RuntimeException p0, com.moon.gT p1, int p2, int p3, net.minecraft.entity.Entity p4, java.util.Iterator p5) throws Throwable {
    int forestValue3006000_14_0;
    int forestValue3006000_30_0;
    net.minecraft.entity.Entity forestValue3006000_37_0;
    int forestValue3006000_66_0;
    net.minecraft.entity.Entity forestValue3006000_121_0;
    int forestValue3006000_121_1;
    net.minecraft.entity.Entity forestValue3006000_122_0;
    net.minecraft.entity.Entity forestValue3006000_123_0;
    int forestValue3006000_123_1;
    int spill3006000_0;
    net.minecraft.entity.Entity spill3006000_1;
    int spill3006000_2;
    net.minecraft.entity.Entity spill3006000_3;
    int spill3006000_4;
    java.lang.RuntimeException life6_2;
    moom.CA life6_47;
    com.moon.n5 life7_95;
    com.moon.n5 life8_105;
    int life9_128;
    forest_join_135: {
    life6_2 = p0;
    if (!((p2 != 0))) {
        break forest_join_135;
    }
    forest_cycle_4: while (true) {
    forest_join_127: {
    forest_join_123: {
    forest_join_122: {
    forest_join_121: {
    forest_join_72: {
    forest_join_70: {
    forest_join_67: {
    forest_join_66: {
    forest_join_37: {
    forest_join_36: {
    forest_join_30: {
    forest_join_22: {
    forest_join_17: {
    forest_join_14: {
    forest_join_8: {
    if (!((p4 == null))) {
        break forest_join_8;
    }
    if (!((p2 != 0))) {
        break forest_join_127;
    }
    }
    spill3006000_0 = p3;
    if (!((p2 == 0))) {
        forestValue3006000_14_0 = spill3006000_0;
        break forest_join_14;
    }
    if (!((spill3006000_0 == 0))) {
        break forest_join_17;
    }
    forestValue3006000_14_0 = __instanceOf3006000_0(p4);
    }
    if (!((p2 == 0))) {
        forestValue3006000_30_0 = forestValue3006000_14_0;
        break forest_join_30;
    }
    if (!((forestValue3006000_14_0 != 0))) {
        break forest_join_22;
    }
    }
    __fieldWrite3006000_1(p4, 0);
    if (!((p2 != 0))) {
        break forest_join_127;
    }
    }
    spill3006000_1 = p4;
    if (!((p2 == 0))) {
        forestValue3006000_37_0 = spill3006000_1;
        break forest_join_37;
    }
    forestValue3006000_30_0 = __numericCompare3006000_5(__call3006000_4(spill3006000_1, __fieldRead3006000_3(__fieldRead3006000_2())), 0x1.0p7f);
    }
    if (!((forestValue3006000_30_0 > 0))) {
        break forest_join_36;
    }
    __fieldWrite3006000_6(p4, 0);
    if (!((p2 != 0))) {
        break forest_join_127;
    }
    }
    forestValue3006000_37_0 = p4;
    }
    life6_47 = __call3006000_7(forestValue3006000_37_0);
    if (!((p2 == 0))) {
        break forest_join_70;
    }
    if (!((__numericCompare3006000_10((__fieldRead3006000_8(life6_47) - __fieldRead3006000_9(life6_47)), 0x1.9p5d) <= 0))) {
        break forest_join_67;
    }
    spill3006000_2 = __numericCompare3006000_13((__fieldRead3006000_11(life6_47) - __fieldRead3006000_12(life6_47)), 0x1.9p5d);
    if (!((p2 == 0))) {
        forestValue3006000_66_0 = spill3006000_2;
        break forest_join_66;
    }
    if (!((spill3006000_2 <= 0))) {
        break forest_join_67;
    }
    forestValue3006000_66_0 = __numericCompare3006000_16((__fieldRead3006000_14(life6_47) - __fieldRead3006000_15(life6_47)), 0x1.9p5d);
    }
    if (!((forestValue3006000_66_0 > 0))) {
        break forest_join_72;
    }
    }
    __fieldWrite3006000_17(p4, 0);
    }
    if (!((p2 != 0))) {
        break forest_join_127;
    }
    }
    life7_95 = new com.moon.n5(__fieldRead3006000_18(life6_47), __fieldRead3006000_19(life6_47), __fieldRead3006000_20(life6_47));
    life8_105 = new com.moon.n5(__fieldRead3006000_21(life6_47), __fieldRead3006000_22(life6_47), __fieldRead3006000_23(life6_47));
    life9_128 = __integerCategory3006000_38(__call3006000_37(__fieldRead3006000_24(p1), life7_95, life8_105, new com.moon.n5(__call3006000_27(__call3006000_26(__fieldRead3006000_25())), (__call3006000_30(__call3006000_29(__fieldRead3006000_28())) + ((double) __call3006000_33(__fieldRead3006000_32(__fieldRead3006000_31())))), __call3006000_36(__call3006000_35(__fieldRead3006000_34())))));
    spill3006000_3 = p4;
    spill3006000_4 = life9_128;
    if (!((p2 == 0))) {
        forestValue3006000_121_0 = spill3006000_3;
        forestValue3006000_121_1 = spill3006000_4;
        break forest_join_121;
    }
    if (!((spill3006000_4 == 0))) {
        forestValue3006000_122_0 = spill3006000_3;
        break forest_join_122;
    }
    forestValue3006000_121_0 = spill3006000_3;
    forestValue3006000_121_1 = 1;
    }
    forestValue3006000_123_0 = forestValue3006000_121_0;
    forestValue3006000_123_1 = forestValue3006000_121_1;
    break forest_join_123;
    }
    forestValue3006000_123_0 = forestValue3006000_122_0;
    forestValue3006000_123_1 = 0;
    }
    __fieldWrite3006000_39(forestValue3006000_123_0, forestValue3006000_123_1);
    if (!((p2 != 0))) {
        break forest_join_127;
    }
    break forest_join_135;
    }
    if (!(__call3006000_40(p5))) {
        break forest_join_135;
    }
    p4 = __cast3006000_42(__call3006000_41(p5));
    continue forest_cycle_4;
    }
    }
    return;
}
public static void h60_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006001_0(p0);
}
public static void h60_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006002_0(p0);
}
public static void h60_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006003_0(p0);
}
public static void h60_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006004_0(p0);
}
public static void h60_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006005_0(p0);
}
public static void h60_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006006_0(p0);
}
public static void h60_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006007_0(p0);
}
public static void h60_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006008_0(p0);
}
public static void h60_9(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006009_0(p0);
}
public static void h60_10(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006010_0(p0);
}
public static void h60_11(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006011_0(p0);
}
public static void h60_12(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006012_0(p0);
}
public static void h60_13(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006013_0(p0);
}
public static void h60_14(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006014_0(p0);
}
private static native long __fieldRead60_0() throws Throwable;
private static native boolean __call60_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead60_2() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead60_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call60_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory60_5(boolean value) throws Throwable;
private static native int __integerCategory60_6(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead60_7() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead60_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead60_9(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call60_10(java.util.List a0) throws Throwable;
private static native boolean __call60_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call60_12(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast60_13(java.lang.Object a0) throws Throwable;
private static native int __instanceOf60_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite60_15(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead60_16() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead60_17(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call60_18(net.minecraft.entity.Entity a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native int __numericCompare60_19(float a0, float a1) throws Throwable;
private static native void __fieldWrite60_20(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native moom.CA __call60_21(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead60_22(moom.CA a0) throws Throwable;
private static native double __fieldRead60_23(moom.CA a0) throws Throwable;
private static native int __numericCompare60_24(double a0, double a1) throws Throwable;
private static native double __fieldRead60_25(moom.CA a0) throws Throwable;
private static native double __fieldRead60_26(moom.CA a0) throws Throwable;
private static native int __numericCompare60_27(double a0, double a1) throws Throwable;
private static native double __fieldRead60_28(moom.CA a0) throws Throwable;
private static native double __fieldRead60_29(moom.CA a0) throws Throwable;
private static native int __numericCompare60_30(double a0, double a1) throws Throwable;
private static native void __fieldWrite60_31(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native double __fieldRead60_32(moom.CA a0) throws Throwable;
private static native double __fieldRead60_33(moom.CA a0) throws Throwable;
private static native double __fieldRead60_34(moom.CA a0) throws Throwable;
private static native double __fieldRead60_35(moom.CA a0) throws Throwable;
private static native double __fieldRead60_36(moom.CA a0) throws Throwable;
private static native double __fieldRead60_37(moom.CA a0) throws Throwable;
private static native com.moon.hF __fieldRead60_38(com.moon.gT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead60_39() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call60_40(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call60_41(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead60_42() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call60_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call60_44(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead60_45() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead60_46(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call60_47(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead60_48() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call60_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call60_50(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call60_51(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, com.moon.n5 a3) throws Throwable;
private static native int __integerCategory60_52(boolean value) throws Throwable;
private static native void __fieldWrite60_53(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __instanceOf3006000_0(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite3006000_1(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006000_2() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3006000_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call3006000_4(net.minecraft.entity.Entity a0, net.minecraft.client.entity.EntityPlayerSP a1) throws Throwable;
private static native int __numericCompare3006000_5(float a0, float a1) throws Throwable;
private static native void __fieldWrite3006000_6(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native moom.CA __call3006000_7(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead3006000_8(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_9(moom.CA a0) throws Throwable;
private static native int __numericCompare3006000_10(double a0, double a1) throws Throwable;
private static native double __fieldRead3006000_11(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_12(moom.CA a0) throws Throwable;
private static native int __numericCompare3006000_13(double a0, double a1) throws Throwable;
private static native double __fieldRead3006000_14(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_15(moom.CA a0) throws Throwable;
private static native int __numericCompare3006000_16(double a0, double a1) throws Throwable;
private static native void __fieldWrite3006000_17(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native double __fieldRead3006000_18(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_19(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_20(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_21(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_22(moom.CA a0) throws Throwable;
private static native double __fieldRead3006000_23(moom.CA a0) throws Throwable;
private static native com.moon.hF __fieldRead3006000_24(com.moon.gT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006000_25() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call3006000_26(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call3006000_27(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006000_28() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call3006000_29(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call3006000_30(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006000_31() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3006000_32(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call3006000_33(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006000_34() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call3006000_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call3006000_36(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call3006000_37(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, com.moon.n5 a3) throws Throwable;
private static native int __integerCategory3006000_38(boolean value) throws Throwable;
private static native void __fieldWrite3006000_39(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native boolean __call3006000_40(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3006000_41(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast3006000_42(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call3006001_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006002_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006003_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006004_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006005_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006006_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006007_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006008_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006009_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006010_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006011_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006012_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006013_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006014_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_902489e4b4fd34ab066a(com.moon.gT a0) throws E;
private static final class __SourceHandler_902489e4b4fd34ab066a {

public static void f61(com.moon.gT receiver) throws Throwable {
    net.minecraft.tileentity.TileEntity forestValue61_31_0;
    int forestValue61_58_0;
    net.minecraft.tileentity.TileEntity forestValue61_65_0;
    int forestValue61_107_0;
    net.minecraft.tileentity.TileEntity forestValue61_162_0;
    int forestValue61_162_1;
    net.minecraft.tileentity.TileEntity forestValue61_163_0;
    net.minecraft.tileentity.TileEntity forestValue61_164_0;
    int forestValue61_164_1;
    boolean spill61_0;
    net.minecraft.tileentity.TileEntity spill61_1;
    int spill61_2;
    net.minecraft.tileentity.TileEntity spill61_3;
    int spill61_4;
    net.minecraft.tileentity.TileEntity spill61_5;
    int spill61_6;
    long life1_3;
    int life4_8;
    java.lang.Object life5_10;
    java.util.Iterator life6_15;
    int life3_16;
    net.minecraft.tileentity.TileEntity life5_23;
    moom.DT life7_75;
    moom.CA life8_88;
    com.moon.n5 life9_136;
    com.moon.n5 life10_146;
    int life11_169;
    forest_join_167: {
    life1_3 = (__fieldRead61_0() ^ 66505347938915L);
    spill61_0 = __call61_1();
    life4_8 = __integerCategory61_5(__call61_4(__fieldRead61_3(__fieldRead61_2())));
    life5_10 = null;
    life6_15 = __call61_9(__fieldRead61_8(__fieldRead61_7(__fieldRead61_6())));
    life3_16 = __integerCategory61_10(spill61_0);
    forest_cycle_17: while (true) {
    forest_join_164: {
    forest_join_163: {
    forest_join_162: {
    forest_join_113: {
    forest_join_111: {
    forest_join_108: {
    forest_join_107: {
    forest_join_65: {
    forest_join_64: {
    forest_join_58: {
    forest_join_43: {
    forest_join_34: {
    forest_join_31: {
    forest_join_30: {
    if (!(__call61_11(life6_15))) {
        break forest_join_167;
    }
    life5_23 = __cast61_13(__call61_12(life6_15));
    spill61_1 = life5_23;
    if (!((life3_16 != 0))) {
        forestValue61_31_0 = spill61_1;
        break forest_join_31;
    }
    if (!((spill61_1 == null))) {
        break forest_join_30;
    }
    if (!((life3_16 == 0))) {
        continue forest_cycle_17;
    }
    }
    forestValue61_31_0 = life5_23;
    }
    if (!((forestValue61_31_0 == null))) {
        break forest_join_34;
    }
    if (!((life3_16 == 0))) {
        continue forest_cycle_17;
    }
    }
    spill61_2 = life4_8;
    if (!((life3_16 != 0))) {
        forestValue61_58_0 = spill61_2;
        break forest_join_58;
    }
    if (!((spill61_2 != 0))) {
        break forest_join_43;
    }
    __fieldWrite61_14(life5_23, 0);
    if (!((life3_16 == 0))) {
        continue forest_cycle_17;
    }
    }
    spill61_3 = life5_23;
    if (!((life3_16 != 0))) {
        forestValue61_65_0 = spill61_3;
        break forest_join_65;
    }
    forestValue61_58_0 = __numericCompare61_25(__call61_24(spill61_3, __fieldRead61_17(__fieldRead61_16(__fieldRead61_15())), __fieldRead61_20(__fieldRead61_19(__fieldRead61_18())), __fieldRead61_23(__fieldRead61_22(__fieldRead61_21()))), 0x1.0p7d);
    }
    if (!((forestValue61_58_0 > 0))) {
        break forest_join_64;
    }
    __fieldWrite61_26(life5_23, 0);
    if (!((life3_16 == 0))) {
        continue forest_cycle_17;
    }
    }
    forestValue61_65_0 = life5_23;
    }
    life7_75 = __call61_27(forestValue61_65_0);
    life8_88 = new moom.CA(((double) __call61_28(life7_75)), ((double) __call61_29(life7_75)), ((double) __call61_30(life7_75)));
    if (!((life3_16 != 0))) {
        break forest_join_111;
    }
    if (!((__numericCompare61_33((__fieldRead61_31(life8_88) - __fieldRead61_32(life8_88)), 0x1.9p5d) <= 0))) {
        break forest_join_108;
    }
    spill61_4 = __numericCompare61_36((__fieldRead61_34(life8_88) - __fieldRead61_35(life8_88)), 0x1.9p5d);
    if (!((life3_16 != 0))) {
        forestValue61_107_0 = spill61_4;
        break forest_join_107;
    }
    if (!((spill61_4 <= 0))) {
        break forest_join_108;
    }
    forestValue61_107_0 = __numericCompare61_39((__fieldRead61_37(life8_88) - __fieldRead61_38(life8_88)), 0x1.9p5d);
    }
    if (!((forestValue61_107_0 > 0))) {
        break forest_join_113;
    }
    }
    __fieldWrite61_40(life5_23, 0);
    }
    if (!((life3_16 == 0))) {
        continue forest_cycle_17;
    }
    }
    life9_136 = new com.moon.n5(__fieldRead61_41(life8_88), __fieldRead61_42(life8_88), __fieldRead61_43(life8_88));
    life10_146 = new com.moon.n5(__fieldRead61_44(life8_88), __fieldRead61_45(life8_88), __fieldRead61_46(life8_88));
    life11_169 = __integerCategory61_61(__call61_60(__fieldRead61_47(receiver), life9_136, life10_146, new com.moon.n5(__call61_50(__call61_49(__fieldRead61_48())), (__call61_53(__call61_52(__fieldRead61_51())) + ((double) __call61_56(__fieldRead61_55(__fieldRead61_54())))), __call61_59(__call61_58(__fieldRead61_57())))));
    spill61_5 = life5_23;
    spill61_6 = life11_169;
    if (!((life3_16 != 0))) {
        forestValue61_162_0 = spill61_5;
        forestValue61_162_1 = spill61_6;
        break forest_join_162;
    }
    if (!((spill61_6 == 0))) {
        forestValue61_163_0 = spill61_5;
        break forest_join_163;
    }
    forestValue61_162_0 = spill61_5;
    forestValue61_162_1 = 1;
    }
    forestValue61_164_0 = forestValue61_162_0;
    forestValue61_164_1 = forestValue61_162_1;
    break forest_join_164;
    }
    forestValue61_164_0 = forestValue61_163_0;
    forestValue61_164_1 = 0;
    }
    __fieldWrite61_62(forestValue61_164_0, forestValue61_164_1);
    if (!((life3_16 == 0))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    return;
}
public static void h61_0(java.lang.RuntimeException p0, com.moon.gT p1, int p2, int p3, net.minecraft.tileentity.TileEntity p4, java.util.Iterator p5) throws Throwable {
    net.minecraft.tileentity.TileEntity forestValue3006100_11_0;
    int forestValue3006100_38_0;
    net.minecraft.tileentity.TileEntity forestValue3006100_45_0;
    int forestValue3006100_87_0;
    net.minecraft.tileentity.TileEntity forestValue3006100_142_0;
    int forestValue3006100_142_1;
    net.minecraft.tileentity.TileEntity forestValue3006100_143_0;
    net.minecraft.tileentity.TileEntity forestValue3006100_144_0;
    int forestValue3006100_144_1;
    net.minecraft.tileentity.TileEntity spill3006100_0;
    int spill3006100_1;
    net.minecraft.tileentity.TileEntity spill3006100_2;
    int spill3006100_3;
    net.minecraft.tileentity.TileEntity spill3006100_4;
    int spill3006100_5;
    java.lang.RuntimeException life6_2;
    moom.DT life6_55;
    moom.CA life7_68;
    com.moon.n5 life8_116;
    com.moon.n5 life9_126;
    int life10_149;
    forest_join_156: {
    life6_2 = p0;
    if (!((p2 == 0))) {
        break forest_join_156;
    }
    forest_cycle_4: while (true) {
    forest_join_148: {
    forest_join_144: {
    forest_join_143: {
    forest_join_142: {
    forest_join_93: {
    forest_join_91: {
    forest_join_88: {
    forest_join_87: {
    forest_join_45: {
    forest_join_44: {
    forest_join_38: {
    forest_join_23: {
    forest_join_14: {
    forest_join_11: {
    forest_join_10: {
    spill3006100_0 = p4;
    if (!((p2 != 0))) {
        forestValue3006100_11_0 = spill3006100_0;
        break forest_join_11;
    }
    if (!((spill3006100_0 == null))) {
        break forest_join_10;
    }
    if (!((p2 == 0))) {
        break forest_join_148;
    }
    }
    forestValue3006100_11_0 = p4;
    }
    if (!((forestValue3006100_11_0 == null))) {
        break forest_join_14;
    }
    if (!((p2 == 0))) {
        break forest_join_148;
    }
    }
    spill3006100_1 = p3;
    if (!((p2 != 0))) {
        forestValue3006100_38_0 = spill3006100_1;
        break forest_join_38;
    }
    if (!((spill3006100_1 != 0))) {
        break forest_join_23;
    }
    __fieldWrite3006100_0(p4, 0);
    if (!((p2 == 0))) {
        break forest_join_148;
    }
    }
    spill3006100_2 = p4;
    if (!((p2 != 0))) {
        forestValue3006100_45_0 = spill3006100_2;
        break forest_join_45;
    }
    forestValue3006100_38_0 = __numericCompare3006100_11(__call3006100_10(spill3006100_2, __fieldRead3006100_3(__fieldRead3006100_2(__fieldRead3006100_1())), __fieldRead3006100_6(__fieldRead3006100_5(__fieldRead3006100_4())), __fieldRead3006100_9(__fieldRead3006100_8(__fieldRead3006100_7()))), 0x1.0p7d);
    }
    if (!((forestValue3006100_38_0 > 0))) {
        break forest_join_44;
    }
    __fieldWrite3006100_12(p4, 0);
    if (!((p2 == 0))) {
        break forest_join_148;
    }
    }
    forestValue3006100_45_0 = p4;
    }
    life6_55 = __call3006100_13(forestValue3006100_45_0);
    life7_68 = new moom.CA(((double) __call3006100_14(life6_55)), ((double) __call3006100_15(life6_55)), ((double) __call3006100_16(life6_55)));
    if (!((p2 != 0))) {
        break forest_join_91;
    }
    if (!((__numericCompare3006100_19((__fieldRead3006100_17(life7_68) - __fieldRead3006100_18(life7_68)), 0x1.9p5d) <= 0))) {
        break forest_join_88;
    }
    spill3006100_3 = __numericCompare3006100_22((__fieldRead3006100_20(life7_68) - __fieldRead3006100_21(life7_68)), 0x1.9p5d);
    if (!((p2 != 0))) {
        forestValue3006100_87_0 = spill3006100_3;
        break forest_join_87;
    }
    if (!((spill3006100_3 <= 0))) {
        break forest_join_88;
    }
    forestValue3006100_87_0 = __numericCompare3006100_25((__fieldRead3006100_23(life7_68) - __fieldRead3006100_24(life7_68)), 0x1.9p5d);
    }
    if (!((forestValue3006100_87_0 > 0))) {
        break forest_join_93;
    }
    }
    __fieldWrite3006100_26(p4, 0);
    }
    if (!((p2 == 0))) {
        break forest_join_148;
    }
    }
    life8_116 = new com.moon.n5(__fieldRead3006100_27(life7_68), __fieldRead3006100_28(life7_68), __fieldRead3006100_29(life7_68));
    life9_126 = new com.moon.n5(__fieldRead3006100_30(life7_68), __fieldRead3006100_31(life7_68), __fieldRead3006100_32(life7_68));
    life10_149 = __integerCategory3006100_47(__call3006100_46(__fieldRead3006100_33(p1), life8_116, life9_126, new com.moon.n5(__call3006100_36(__call3006100_35(__fieldRead3006100_34())), (__call3006100_39(__call3006100_38(__fieldRead3006100_37())) + ((double) __call3006100_42(__fieldRead3006100_41(__fieldRead3006100_40())))), __call3006100_45(__call3006100_44(__fieldRead3006100_43())))));
    spill3006100_4 = p4;
    spill3006100_5 = life10_149;
    if (!((p2 != 0))) {
        forestValue3006100_142_0 = spill3006100_4;
        forestValue3006100_142_1 = spill3006100_5;
        break forest_join_142;
    }
    if (!((spill3006100_5 == 0))) {
        forestValue3006100_143_0 = spill3006100_4;
        break forest_join_143;
    }
    forestValue3006100_142_0 = spill3006100_4;
    forestValue3006100_142_1 = 1;
    }
    forestValue3006100_144_0 = forestValue3006100_142_0;
    forestValue3006100_144_1 = forestValue3006100_142_1;
    break forest_join_144;
    }
    forestValue3006100_144_0 = forestValue3006100_143_0;
    forestValue3006100_144_1 = 0;
    }
    __fieldWrite3006100_48(forestValue3006100_144_0, forestValue3006100_144_1);
    if (!((p2 == 0))) {
        break forest_join_148;
    }
    break forest_join_156;
    }
    if (!(__call3006100_49(p5))) {
        break forest_join_156;
    }
    p4 = __cast3006100_51(__call3006100_50(p5));
    continue forest_cycle_4;
    }
    }
    return;
}
public static void h61_1(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006101_0(p0);
}
public static void h61_2(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006102_0(p0);
}
public static void h61_3(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006103_0(p0);
}
public static void h61_4(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006104_0(p0);
}
public static void h61_5(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006105_0(p0);
}
public static void h61_6(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006106_0(p0);
}
public static void h61_7(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006107_0(p0);
}
public static void h61_8(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006108_0(p0);
}
public static void h61_9(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006109_0(p0);
}
public static void h61_10(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006110_0(p0);
}
public static void h61_11(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006111_0(p0);
}
public static void h61_12(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006112_0(p0);
}
public static void h61_13(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006113_0(p0);
}
public static void h61_14(java.lang.NullPointerException p0) throws Throwable {
    throw __call3006114_0(p0);
}
private static native long __fieldRead61_0() throws Throwable;
private static native boolean __call61_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_2() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead61_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call61_4(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native int __integerCategory61_5(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_6() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead61_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead61_8(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call61_9(java.util.List a0) throws Throwable;
private static native int __integerCategory61_10(boolean value) throws Throwable;
private static native boolean __call61_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call61_12(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast61_13(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite61_14(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_15() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead61_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead61_17(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_18() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead61_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead61_20(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_21() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead61_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead61_23(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __call61_24(net.minecraft.tileentity.TileEntity a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare61_25(double a0, double a1) throws Throwable;
private static native void __fieldWrite61_26(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native moom.DT __call61_27(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call61_28(moom.DT a0) throws Throwable;
private static native int __call61_29(moom.DT a0) throws Throwable;
private static native int __call61_30(moom.DT a0) throws Throwable;
private static native double __fieldRead61_31(moom.CA a0) throws Throwable;
private static native double __fieldRead61_32(moom.CA a0) throws Throwable;
private static native int __numericCompare61_33(double a0, double a1) throws Throwable;
private static native double __fieldRead61_34(moom.CA a0) throws Throwable;
private static native double __fieldRead61_35(moom.CA a0) throws Throwable;
private static native int __numericCompare61_36(double a0, double a1) throws Throwable;
private static native double __fieldRead61_37(moom.CA a0) throws Throwable;
private static native double __fieldRead61_38(moom.CA a0) throws Throwable;
private static native int __numericCompare61_39(double a0, double a1) throws Throwable;
private static native void __fieldWrite61_40(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native double __fieldRead61_41(moom.CA a0) throws Throwable;
private static native double __fieldRead61_42(moom.CA a0) throws Throwable;
private static native double __fieldRead61_43(moom.CA a0) throws Throwable;
private static native double __fieldRead61_44(moom.CA a0) throws Throwable;
private static native double __fieldRead61_45(moom.CA a0) throws Throwable;
private static native double __fieldRead61_46(moom.CA a0) throws Throwable;
private static native com.moon.hF __fieldRead61_47(com.moon.gT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_48() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call61_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call61_50(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_51() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call61_52(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call61_53(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_54() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead61_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call61_56(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead61_57() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call61_58(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call61_59(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call61_60(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, com.moon.n5 a3) throws Throwable;
private static native int __integerCategory61_61(boolean value) throws Throwable;
private static native void __fieldWrite61_62(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native void __fieldWrite3006100_0(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006100_1() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3006100_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead3006100_3(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006100_4() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3006100_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead3006100_6(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006100_7() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3006100_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead3006100_9(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native double __call3006100_10(net.minecraft.tileentity.TileEntity a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare3006100_11(double a0, double a1) throws Throwable;
private static native void __fieldWrite3006100_12(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native moom.DT __call3006100_13(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native int __call3006100_14(moom.DT a0) throws Throwable;
private static native int __call3006100_15(moom.DT a0) throws Throwable;
private static native int __call3006100_16(moom.DT a0) throws Throwable;
private static native double __fieldRead3006100_17(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_18(moom.CA a0) throws Throwable;
private static native int __numericCompare3006100_19(double a0, double a1) throws Throwable;
private static native double __fieldRead3006100_20(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_21(moom.CA a0) throws Throwable;
private static native int __numericCompare3006100_22(double a0, double a1) throws Throwable;
private static native double __fieldRead3006100_23(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_24(moom.CA a0) throws Throwable;
private static native int __numericCompare3006100_25(double a0, double a1) throws Throwable;
private static native void __fieldWrite3006100_26(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native double __fieldRead3006100_27(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_28(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_29(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_30(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_31(moom.CA a0) throws Throwable;
private static native double __fieldRead3006100_32(moom.CA a0) throws Throwable;
private static native com.moon.hF __fieldRead3006100_33(com.moon.gT a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006100_34() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call3006100_35(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call3006100_36(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006100_37() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call3006100_38(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call3006100_39(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006100_40() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3006100_41(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call3006100_42(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3006100_43() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call3006100_44(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call3006100_45(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native boolean __call3006100_46(com.moon.hF a0, com.moon.n5 a1, com.moon.n5 a2, com.moon.n5 a3) throws Throwable;
private static native int __integerCategory3006100_47(boolean value) throws Throwable;
private static native void __fieldWrite3006100_48(net.minecraft.tileentity.TileEntity a0, int a1) throws Throwable;
private static native boolean __call3006100_49(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3006100_50(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast3006100_51(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call3006101_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006102_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006103_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006104_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006105_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006106_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006107_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006108_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006109_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006110_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006111_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006112_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006113_0(java.lang.NullPointerException a0) throws Throwable;
private static native java.lang.Exception __call3006114_0(java.lang.NullPointerException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d6818a6ff841f2f34611(com.moon.gT a0) throws E;
private static final class __SourceHandler_d6818a6ff841f2f34611 {

public static void f62(com.moon.gT receiver) throws Throwable {
    net.minecraft.client.Minecraft forwardValue62_14_0;
    net.minecraft.client.Minecraft spill62_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_14: {
    life1_3 = (__fieldRead62_0() ^ 86654882396862L);
    life3_5 = __integerCategory62_2(__call62_1());
    __call62_4(__fieldRead62_3());
    spill62_0 = __fieldRead62_5();
    if (!((life3_5 != 0))) {
        forwardValue62_14_0 = spill62_0;
        break forward_join_14;
    }
    if (!((__fieldRead62_6(spill62_0) != null))) {
        break forward_join_23;
    }
    forwardValue62_14_0 = __fieldRead62_7();
    }
    if (!((__fieldRead62_8(forwardValue62_14_0) != null))) {
        break forward_join_23;
    }
    __call62_10(__fieldRead62_9(receiver));
    __call62_11(receiver);
    __call62_12(receiver);
    }
    return;
}
public static void h62_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call2006200_0(p0);
}
public static void h62_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call2006201_0(p0);
}
public static void h62_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call2006202_0(p0);
}
public static void h62_3(java.lang.InterruptedException p0) throws Throwable {
    java.lang.InterruptedException local1 = p0;
    __call2006203_0(local1);
    return;
}
private static native long __fieldRead62_0() throws Throwable;
private static native boolean __call62_1() throws Throwable;
private static native int __integerCategory62_2(boolean value) throws Throwable;
private static native long __fieldRead62_3() throws Throwable;
private static native void __call62_4(long a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead62_5() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead62_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead62_7() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead62_8(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.hF __fieldRead62_9(com.moon.gT a0) throws Throwable;
private static native void __call62_10(com.moon.hF a0) throws Throwable;
private static native void __call62_11(com.moon.gT a0) throws Throwable;
private static native void __call62_12(com.moon.gT a0) throws Throwable;
private static native java.lang.Exception __call2006200_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2006201_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2006202_0(java.lang.InterruptedException a0) throws Throwable;
private static native void __call2006203_0(java.lang.InterruptedException a0) throws Throwable;

}


public void run() { __sourceHandlerCall_d6818a6ff841f2f34611(this); }


private void b() { __sourceHandlerCall_902489e4b4fd34ab066a(this); }


private void a() { __sourceHandlerCall_fdb5ce3025f1df6294a4(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}

}
