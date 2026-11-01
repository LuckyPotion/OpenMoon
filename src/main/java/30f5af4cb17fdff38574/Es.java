package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public final class Es {

private static int a;

private java.util.Set<moom.Ee> b;

private java.util.Map<java.lang.Class, net.minecraft.entity.EntityLiving> c;

private int d;

private int e;

private int f;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public Es() { super(); }

private static void __sourceConstructorBody_25f1ed2646cd9e67(moom.Es receiver) throws Throwable {
long local1 = (moom.Es.g ^ 43344847835250L);
    moom.Es.__sourceConstructorInit_25f1ed2646cd9e67_0(((moom.Es)(receiver)));
    ((moom.Es)(receiver)).b = ((java.util.Set)(com.google.common.collect.Sets.newHashSet()));
    ((moom.Es)(receiver)).c = ((java.util.Map)(new java.util.HashMap()));
    ((moom.Es)(receiver)).d = ((int)(__sourceIntrinsic_25f1ed2646cd9e67_originalDynamicSite1978_5(22888, (2564313544452271774L ^ local1))));
    ((moom.Es)(receiver)).e = ((int)(__sourceIntrinsic_25f1ed2646cd9e67_originalDynamicSite1978_7(1004, (7324867311994876952L ^ local1))));
    return;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(-7114835736394931275L)), ((long)(3694684405235266741L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(75960749248425L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.Es.g ^ 79363309024775L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill725_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill725_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill725_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill725_14 = new byte[8];
    (__sourceSpill725_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill725_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation725_16 = __sourceSpill725_14;
    ((javax.crypto.Cipher)(__sourceSpill725_11)).init(((int)(__sourceSpill725_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill725_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation725_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[8];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "ð\034ïÂ@ý\030³àw·\021w (VÆ\001ùáíC¶¸»á\027i\030å\004\\A\034cë ÊÆ¢½u"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill725_25 = local6_life21;
        int __sourceSpill725_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill725_25)).substring(((int)(__sourceSpill725_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill725_30 = local8_life19;
        int __sourceSpill725_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill725_33 = new byte[8];
        (__sourceSpill725_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill725_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill725_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill725_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill725_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill725_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill725_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill725_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill725_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill725_34)).doFinal(((byte[])(__sourceSpill725_33)));
        (__sourceSpill725_30)[__sourceSpill725_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ìHì¤x\030T{\\õ>f\bþ¿Z"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill725_38 = local6_life21;
        int __sourceSpill725_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill725_38)).substring(((int)(__sourceSpill725_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill725_43 = local8_life19;
        int __sourceSpill725_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill725_46 = new byte[8];
        (__sourceSpill725_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill725_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill725_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill725_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill725_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill725_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill725_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill725_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill725_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill725_47)).doFinal(((byte[])(__sourceSpill725_46)));
        (__sourceSpill725_43)[__sourceSpill725_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    h = ((long[])(local8_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[8]));
    a = ((int)(((int) java.lang.Math.pow(((double)(0x1.1p4d)), ((double)(0x1.0p1d))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_25f1ed2646cd9e67_0(moom.Es a0) throws E;
private static native <E extends Throwable> boolean __sourceHandlerCall_04547b6c98f8f4e52837(net.minecraft.entity.EntityLiving$SpawnPlacementType a0, net.minecraft.world.World a1, moom.DT a2) throws E;
private static final class __SourceHandler_04547b6c98f8f4e52837 {

public static boolean f630(net.minecraft.entity.EntityLiving$SpawnPlacementType p0, net.minecraft.world.World p1, moom.DT p2) throws Throwable {
    int forwardValue630_14_0;
    int forwardValue630_40_0;
    int forwardValue630_49_0;
    int forwardValue630_53_0;
    int forwardValue630_55_0;
    int forwardValue630_72_0;
    net.minecraft.block.Block forwardValue630_85_0;
    net.minecraft.block.Block forwardValue630_85_1;
    int forwardValue630_89_0;
    int forwardValue630_96_0;
    int forwardValue630_102_0;
    int forwardValue630_111_0;
    int forwardValue630_115_0;
    int forwardValue630_117_0;
    boolean spill630_0;
    boolean spill630_1;
    int spill630_2;
    net.minecraft.block.Block spill630_3;
    net.minecraft.block.Block spill630_4;
    int spill630_5;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.block.Block life6_28;
    moom.DT life7_81;
    net.minecraft.block.state.IBlockState life8_85;
    int life9_89;
    net.minecraft.block.Block life10_103;
    int life11_123;
    forward_join_117: {
    forward_join_116: {
    forward_join_115: {
    forward_join_111: {
    forward_join_102: {
    forward_join_96: {
    forward_join_89: {
    forward_join_88: {
    forward_join_85: {
    forward_join_73: {
    forward_join_72: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_49: {
    forward_join_40: {
    forward_join_19: {
    forward_join_15: {
    forward_join_14: {
    life3_3 = (__fieldRead630_0() ^ 1353349441853L);
    life5_5 = __call630_1();
    spill630_0 = __call630_3(__call630_2(p1), p2);
    if (!((life5_5 == null))) {
        forwardValue630_14_0 = __integerCategory630_4(spill630_0);
        break forward_join_14;
    }
    if (!((!spill630_0))) {
        break forward_join_15;
    }
    forwardValue630_14_0 = 0;
    }
    return __integerCategory630_5(forwardValue630_14_0);
    }
    if (!((p0 == null))) {
        break forward_join_19;
    }
    return __integerCategory630_6(0);
    }
    life6_28 = __call630_8(__call630_7(p1, p2));
    if (!((p0 == __fieldRead630_9()))) {
        break forward_join_56;
    }
    spill630_1 = __call630_11(__call630_10(life6_28));
    if (!((life5_5 == null))) {
        forwardValue630_40_0 = __integerCategory630_12(spill630_1);
        break forward_join_40;
    }
    if (!(spill630_1)) {
        break forward_join_54;
    }
    forwardValue630_40_0 = __integerCategory630_18(__call630_17(__call630_16(__call630_15(__call630_14(p1, __call630_13(p2))))));
    }
    if (!((life5_5 == null))) {
        forwardValue630_49_0 = forwardValue630_40_0;
        break forward_join_49;
    }
    if (!((forwardValue630_40_0 != 0))) {
        break forward_join_54;
    }
    forwardValue630_49_0 = __integerCategory630_23(__call630_22(__call630_21(__call630_20(p1, __call630_19(p2)))));
    }
    if (!((life5_5 == null))) {
        forwardValue630_53_0 = forwardValue630_49_0;
        break forward_join_53;
    }
    if (!((forwardValue630_49_0 == 0))) {
        break forward_join_54;
    }
    forwardValue630_53_0 = 1;
    }
    forwardValue630_55_0 = forwardValue630_53_0;
    break forward_join_55;
    }
    forwardValue630_55_0 = 0;
    }
    return __integerCategory630_24(forwardValue630_55_0);
    }
    life7_81 = __call630_25(p2);
    life8_85 = __call630_26(p1, life7_81);
    life9_89 = __integerCategory630_28(__call630_27(p1, life7_81));
    spill630_2 = life9_89;
    if (!((life5_5 == null))) {
        forwardValue630_72_0 = spill630_2;
        break forward_join_72;
    }
    if (!((spill630_2 == 0))) {
        break forward_join_73;
    }
    forwardValue630_72_0 = 0;
    }
    return __integerCategory630_29(forwardValue630_72_0);
    }
    life10_103 = __call630_31(__call630_30(p1, life7_81));
    spill630_3 = life10_103;
    spill630_4 = __fieldRead630_32();
    if (!((life5_5 == null))) {
        forwardValue630_85_0 = spill630_3;
        forwardValue630_85_1 = spill630_4;
        break forward_join_85;
    }
    if (!((spill630_3 != spill630_4))) {
        break forward_join_88;
    }
    forwardValue630_85_0 = life10_103;
    forwardValue630_85_1 = __fieldRead630_33();
    }
    if (!((forwardValue630_85_0 != forwardValue630_85_1))) {
        break forward_join_88;
    }
    forwardValue630_89_0 = 1;
    break forward_join_89;
    }
    forwardValue630_89_0 = 0;
    }
    life11_123 = forwardValue630_89_0;
    spill630_5 = life11_123;
    if (!((life5_5 == null))) {
        forwardValue630_96_0 = spill630_5;
        break forward_join_96;
    }
    if (!((spill630_5 != 0))) {
        break forward_join_116;
    }
    forwardValue630_96_0 = __integerCategory630_35(__call630_34(life6_28));
    }
    if (!((life5_5 == null))) {
        forwardValue630_102_0 = forwardValue630_96_0;
        break forward_join_102;
    }
    if (!((forwardValue630_96_0 == 0))) {
        break forward_join_116;
    }
    forwardValue630_102_0 = __integerCategory630_38(__call630_37(__call630_36(life6_28)));
    }
    if (!((life5_5 == null))) {
        forwardValue630_111_0 = forwardValue630_102_0;
        break forward_join_111;
    }
    if (!((forwardValue630_102_0 == 0))) {
        break forward_join_116;
    }
    forwardValue630_111_0 = __integerCategory630_43(__call630_42(__call630_41(__call630_40(p1, __call630_39(p2)))));
    }
    if (!((life5_5 == null))) {
        forwardValue630_115_0 = forwardValue630_111_0;
        break forward_join_115;
    }
    if (!((forwardValue630_111_0 == 0))) {
        break forward_join_116;
    }
    forwardValue630_115_0 = 1;
    }
    forwardValue630_117_0 = forwardValue630_115_0;
    break forward_join_117;
    }
    forwardValue630_117_0 = 0;
    }
    return __integerCategory630_44(forwardValue630_117_0);
}
public static void h630_0(moom.Oo p0) throws Throwable {
    throw __call1063000_0(p0);
}
public static void h630_1(moom.Oo p0) throws Throwable {
    throw __call1063001_0(p0);
}
public static void h630_2(moom.Oo p0) throws Throwable {
    throw __call1063002_0(p0);
}
public static void h630_3(moom.Oo p0) throws Throwable {
    throw __call1063003_0(p0);
}
public static void h630_4(moom.Oo p0) throws Throwable {
    throw __call1063004_0(p0);
}
public static void h630_5(moom.Oo p0) throws Throwable {
    throw __call1063005_0(p0);
}
public static void h630_6(moom.Oo p0) throws Throwable {
    throw __call1063006_0(p0);
}
public static void h630_7(moom.Oo p0) throws Throwable {
    throw __call1063007_0(p0);
}
public static void h630_8(moom.Oo p0) throws Throwable {
    throw __call1063008_0(p0);
}
public static void h630_9(moom.Oo p0) throws Throwable {
    throw __call1063009_0(p0);
}
public static void h630_10(moom.Oo p0) throws Throwable {
    throw __call1063010_0(p0);
}
public static void h630_11(moom.Oo p0) throws Throwable {
    throw __call1063011_0(p0);
}
public static void h630_12(moom.Oo p0) throws Throwable {
    throw __call1063012_0(p0);
}
public static void h630_13(moom.Oo p0) throws Throwable {
    throw __call1063013_0(p0);
}
public static void h630_14(moom.Oo p0) throws Throwable {
    throw __call1063014_0(p0);
}
public static void h630_15(moom.Oo p0) throws Throwable {
    throw __call1063015_0(p0);
}
public static void h630_16(moom.Oo p0) throws Throwable {
    throw __call1063016_0(p0);
}
public static void h630_17(moom.Oo p0) throws Throwable {
    throw __call1063017_0(p0);
}
public static void h630_18(moom.Oo p0) throws Throwable {
    throw __call1063018_0(p0);
}
private static native long __fieldRead630_0() throws Throwable;
private static native java.lang.String __call630_1() throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call630_2(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call630_3(net.minecraft.world.border.WorldBorder a0, moom.DT a1) throws Throwable;
private static native int __integerCategory630_4(boolean value) throws Throwable;
private static native boolean __integerCategory630_5(int value) throws Throwable;
private static native boolean __integerCategory630_6(int value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_7(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call630_8(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.entity.EntityLiving$SpawnPlacementType __fieldRead630_9() throws Throwable;
private static native moom.fn __call630_10(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call630_11(moom.fn a0) throws Throwable;
private static native int __integerCategory630_12(boolean value) throws Throwable;
private static native moom.DT __call630_13(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_14(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call630_15(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call630_16(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call630_17(moom.fn a0) throws Throwable;
private static native int __integerCategory630_18(boolean value) throws Throwable;
private static native moom.DT __call630_19(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_20(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call630_21(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call630_22(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory630_23(boolean value) throws Throwable;
private static native boolean __integerCategory630_24(int value) throws Throwable;
private static native moom.DT __call630_25(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_26(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native boolean __call630_27(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory630_28(boolean value) throws Throwable;
private static native boolean __integerCategory630_29(int value) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_30(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call630_31(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead630_32() throws Throwable;
private static native net.minecraft.block.Block __fieldRead630_33() throws Throwable;
private static native boolean __call630_34(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory630_35(boolean value) throws Throwable;
private static native moom.fn __call630_36(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call630_37(moom.fn a0) throws Throwable;
private static native int __integerCategory630_38(boolean value) throws Throwable;
private static native moom.DT __call630_39(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_40(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call630_41(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call630_42(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory630_43(boolean value) throws Throwable;
private static native boolean __integerCategory630_44(int value) throws Throwable;
private static native java.lang.Exception __call1063000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063018_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_1418859d8e2faef161e8(net.minecraft.world.World a0, int a1, int a2) throws E;
private static final class __SourceHandler_1418859d8e2faef161e8 {

public static moom.DT f631(net.minecraft.world.World p0, int p1, int p2) throws Throwable {
    java.util.Random forwardValue631_70_0;
    java.util.Random forwardValue631_78_0;
    int forwardValue631_78_1;
    java.util.Random forwardValue631_80_0;
    int forwardValue631_80_1;
    java.lang.String spill631_0;
    java.util.Random spill631_1;
    int spill631_2;
    long life3_3;
    net.minecraft.world.chunk.Chunk life6_9;
    java.lang.String life5_10;
    int life7_27;
    int life8_44;
    int life9_61;
    int life10_86;
    forward_join_80: {
    forward_join_78: {
    forward_join_70: {
    life3_3 = (__fieldRead631_0() ^ 102858316313945L);
    spill631_0 = __call631_1();
    life6_9 = __call631_2(p0, p1, p2);
    life5_10 = spill631_0;
    life7_27 = ((p1 * __invokedynamic631_3(6274, (5277598984314473054L ^ life3_3))) + __call631_6(__fieldRead631_4(p0), __invokedynamic631_5(8766, (8609209135484268773L ^ life3_3))));
    life8_44 = ((p2 * __invokedynamic631_7(8766, (8609209135484268773L ^ life3_3))) + __call631_10(__fieldRead631_8(p0), __invokedynamic631_9(8766, (8609209135484268773L ^ life3_3))));
    life9_61 = __call631_13((__call631_11(life6_9, new moom.DT(life7_27, 0, life8_44)) + 1), __invokedynamic631_12(8766, (8609209135484268773L ^ life3_3)));
    spill631_1 = __fieldRead631_14(p0);
    spill631_2 = life9_61;
    if (!((life5_10 == null))) {
        forwardValue631_78_0 = spill631_1;
        forwardValue631_78_1 = spill631_2;
        break forward_join_78;
    }
    if (!((spill631_2 > 0))) {
        forwardValue631_70_0 = spill631_1;
        break forward_join_70;
    }
    forwardValue631_80_0 = spill631_1;
    forwardValue631_80_1 = life9_61;
    break forward_join_80;
    }
    forwardValue631_78_0 = forwardValue631_70_0;
    forwardValue631_78_1 = (__call631_15(life6_9) + __invokedynamic631_16(8766, (8609209135484268773L ^ life3_3)));
    }
    forwardValue631_80_0 = forwardValue631_78_0;
    forwardValue631_80_1 = (forwardValue631_78_1 - 1);
    }
    life10_86 = __call631_17(forwardValue631_80_0, forwardValue631_80_1);
    return new moom.DT(life7_27, life10_86, life8_44);
}
public static void h631_0(moom.Oo p0) throws Throwable {
    throw __call1063100_0(p0);
}
public static void h631_1(moom.Oo p0) throws Throwable {
    throw __call1063101_0(p0);
}
private static native long __fieldRead631_0() throws Throwable;
private static native java.lang.String __call631_1() throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call631_2(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic631_3(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead631_4(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic631_5(int a0, long a1) throws Throwable;
private static native int __call631_6(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic631_7(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead631_8(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic631_9(int a0, long a1) throws Throwable;
private static native int __call631_10(java.util.Random a0, int a1) throws Throwable;
private static native int __call631_11(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic631_12(int a0, long a1) throws Throwable;
private static native int __call631_13(int a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead631_14(net.minecraft.world.World a0) throws Throwable;
private static native int __call631_15(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic631_16(int a0, long a1) throws Throwable;
private static native int __call631_17(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.Exception __call1063100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DX __sourceHandlerCall_2d4c7980d618f088bb6e(net.minecraft.world.World a0, int a1, int a2, moom.DX a3) throws E;
private static final class __SourceHandler_2d4c7980d618f088bb6e {

public static moom.DX f632(net.minecraft.world.World p0, int p1, int p2, moom.DX p3) throws Throwable {
    java.util.Random forwardValue632_78_0;
    java.util.Random forwardValue632_86_0;
    int forwardValue632_86_1;
    java.util.Random forwardValue632_88_0;
    int forwardValue632_88_1;
    java.lang.String spill632_0;
    java.util.Random spill632_1;
    int spill632_2;
    long life4_3;
    net.minecraft.world.chunk.Chunk life7_8;
    int life8_25;
    int life9_43;
    int life10_68;
    java.lang.String life6_69;
    int life11_94;
    forward_join_88: {
    forward_join_86: {
    forward_join_78: {
    life4_3 = (__fieldRead632_0() ^ 49778456397124L);
    life7_8 = __call632_1(p0, p1, p2);
    life8_25 = ((p1 * __invokedynamic632_2(8766, (8609333074855428344L ^ life4_3))) + __call632_5(__fieldRead632_3(p0), __invokedynamic632_4(8766, (8609333074855428344L ^ life4_3))));
    spill632_0 = __call632_6();
    life9_43 = ((p2 * __invokedynamic632_7(8766, (8609333074855428344L ^ life4_3))) + __call632_10(__fieldRead632_8(p0), __invokedynamic632_9(8766, (8609333074855428344L ^ life4_3))));
    life10_68 = __call632_15((__call632_13(life7_8, (life8_25 & __invokedynamic632_11(11435, (6826062159395458668L ^ life4_3))), (life9_43 & __invokedynamic632_12(19305, (6583773068475394474L ^ life4_3)))) + 1), __invokedynamic632_14(8766, (8609333074855428344L ^ life4_3)));
    life6_69 = spill632_0;
    spill632_1 = __fieldRead632_16(p0);
    spill632_2 = life10_68;
    if (!((life6_69 == null))) {
        forwardValue632_86_0 = spill632_1;
        forwardValue632_86_1 = spill632_2;
        break forward_join_86;
    }
    if (!((spill632_2 > 0))) {
        forwardValue632_78_0 = spill632_1;
        break forward_join_78;
    }
    forwardValue632_88_0 = spill632_1;
    forwardValue632_88_1 = life10_68;
    break forward_join_88;
    }
    forwardValue632_86_0 = forwardValue632_78_0;
    forwardValue632_86_1 = (__call632_17(life7_8) + __invokedynamic632_18(8766, (8609333074855428344L ^ life4_3)));
    }
    forwardValue632_88_0 = forwardValue632_86_0;
    forwardValue632_88_1 = (forwardValue632_86_1 - 1);
    }
    life11_94 = __call632_19(forwardValue632_88_0, forwardValue632_88_1);
    __call632_20(p3, life8_25, life11_94, life9_43);
    return p3;
}
public static void h632_0(moom.Oo p0) throws Throwable {
    throw __call1063200_0(p0);
}
public static void h632_1(moom.Oo p0) throws Throwable {
    throw __call1063201_0(p0);
}
private static native long __fieldRead632_0() throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call632_1(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic632_2(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead632_3(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic632_4(int a0, long a1) throws Throwable;
private static native int __call632_5(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.String __call632_6() throws Throwable;
private static native int __invokedynamic632_7(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead632_8(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic632_9(int a0, long a1) throws Throwable;
private static native int __call632_10(java.util.Random a0, int a1) throws Throwable;
private static native int __invokedynamic632_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic632_12(int a0, long a1) throws Throwable;
private static native int __call632_13(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic632_14(int a0, long a1) throws Throwable;
private static native int __call632_15(int a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead632_16(net.minecraft.world.World a0) throws Throwable;
private static native int __call632_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic632_18(int a0, long a1) throws Throwable;
private static native int __call632_19(java.util.Random a0, int a1) throws Throwable;
private static native void __call632_20(moom.DX a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1063200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1063201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_48e7c49f38be1648860c(net.minecraft.world.World a0, net.minecraft.world.biome.BiomeGenBase a1, int a2, int a3, int a4, int a5, java.util.Random a6) throws E;
private static final class __SourceHandler_48e7c49f38be1648860c {

public static void f605(net.minecraft.world.World p0, net.minecraft.world.biome.BiomeGenBase p1, int p2, int p3, int p4, int p5, java.util.Random p6) throws Throwable {
    int forestValue605_20_0;
    int forestValue605_62_0;
    int forestValue605_62_1;
    int forestValue605_165_0;
    int forestValue605_208_0;
    int forestValue605_208_1;
    int forestValue605_221_0;
    int forestValue605_263_0;
    int forestValue605_263_1;
    int forestValue605_366_0;
    int forestValue605_409_0;
    int forestValue605_409_1;
    java.lang.String spill605_0;
    boolean spill605_1;
    int spill605_2;
    int spill605_3;
    int spill605_4;
    boolean spill605_5;
    java.lang.Class spill605_6;
    java.lang.Class[] spill605_7;
    java.lang.reflect.Constructor spill605_8;
    java.lang.Object[] spill605_9;
    int spill605_10;
    int spill605_11;
    int spill605_12;
    int spill605_13;
    int spill605_14;
    int spill605_15;
    int spill605_16;
    int spill605_17;
    int spill605_18;
    boolean spill605_19;
    java.lang.Class spill605_20;
    java.lang.Class[] spill605_21;
    java.lang.reflect.Constructor spill605_22;
    java.lang.Object[] spill605_23;
    int spill605_24;
    int spill605_25;
    int spill605_26;
    int spill605_27;
    int spill605_28;
    int spill605_29;
    int spill605_30;
    long life7_3;
    java.util.List life10_8;
    java.lang.String life9_9;
    moom.D7 life11_31;
    int life12_44;
    net.minecraft.entity.IEntityLivingData life13_46;
    int life14_52;
    int life15_58;
    int life16_60;
    int life17_62;
    int life18_64;
    int life19_72;
    int life20_77;
    moom.DT life21_97;
    net.minecraft.entity.EntityLiving life22_125;
    moom.D7 life11_266;
    int life12_279;
    net.minecraft.entity.IEntityLivingData life13_281;
    int life14_287;
    int life15_293;
    int life16_295;
    int life17_297;
    int life18_299;
    int life19_307;
    int life20_312;
    moom.DT life21_332;
    net.minecraft.entity.EntityLiving life22_360;
    forest_join_428: {
    forest_join_221: {
    life7_3 = (__fieldRead605_0() ^ 50424294460729L);
    spill605_0 = __call605_1();
    life10_8 = __call605_3(p1, __fieldRead605_2());
    life9_9 = spill605_0;
    spill605_1 = __call605_4(life10_8);
    if (!((life9_9 == null))) {
        forestValue605_221_0 = __integerCategory605_5(spill605_1);
        break forest_join_221;
    }
    if (!((!spill605_1))) {
        break forest_join_428;
    }
    forest_cycle_15: while (true) {
    forest_join_218: {
    forestValue605_20_0 = __numericCompare605_8(__call605_6(p6), __call605_7(p1));
    forest_cycle_20: while (true) {
    if (!((forestValue605_20_0 < 0))) {
        break forest_join_428;
    }
    life11_31 = __cast605_11(__call605_10(__fieldRead605_9(p0), life10_8));
    life12_44 = (__fieldRead605_12(life11_31) + __call605_15(p6, ((1 + __fieldRead605_13(life11_31)) - __fieldRead605_14(life11_31))));
    life13_46 = null;
    life14_52 = (p2 + __call605_16(p6, p4));
    life15_58 = (p3 + __call605_17(p6, p5));
    life16_60 = life14_52;
    life17_62 = life15_58;
    life18_64 = 0;
    forest_cycle_60: while (true) {
    forest_join_215: {
    forestValue605_62_0 = life18_64;
    forestValue605_62_1 = life12_44;
    forest_cycle_62: while (true) {
    if (!((forestValue605_62_0 < forestValue605_62_1))) {
        break forest_join_218;
    }
    life19_72 = 0;
    spill605_2 = 0;
    if (!((life9_9 == null))) {
        forestValue605_20_0 = spill605_2;
        continue forest_cycle_20;
    }
    life20_77 = spill605_2;
    forest_cycle_69: while (true) {
    forest_join_212: {
    forest_join_165: {
    forest_join_146: {
    if (!((life19_72 == 0))) {
        break forest_join_215;
    }
    spill605_3 = life20_77;
    spill605_4 = 4;
    if (!((life9_9 == null))) {
        forestValue605_62_0 = spill605_3;
        forestValue605_62_1 = spill605_4;
        continue forest_cycle_62;
    }
    if (!((spill605_3 < spill605_4))) {
        break forest_join_215;
    }
    life21_97 = __call605_18(p0, new moom.DT(life14_52, 0, life15_58));
    spill605_5 = __call605_20(__fieldRead605_19(), p0, life21_97);
    if (!((life9_9 == null))) {
        forestValue605_165_0 = __integerCategory605_21(spill605_5);
        break forest_join_165;
    }
    if (!(spill605_5)) {
        break forest_join_146;
    }
    spill605_6 = __fieldRead605_22(life11_31);
    java.lang.Class[] __stackOp605_23_0 = new java.lang.Class[1];
    spill605_7 = __stackOp605_23_0;
    (__stackOp605_23_0)[0] = __classLiteral605_24();
    spill605_8 = __call605_25(spill605_6, spill605_7);
    java.lang.Object[] __stackOp605_26_0 = new java.lang.Object[1];
    spill605_9 = __stackOp605_26_0;
    (__stackOp605_26_0)[0] = p0;
    life22_125 = __cast605_28(__call605_27(spill605_8, spill605_9));
    __call605_31(life22_125, ((double) (((float) life14_52) + 0x1.0p-1f)), ((double) __call605_29(life21_97)), ((double) (((float) life15_58) + 0x1.0p-1f)), (__call605_30(p6) * 0x1.68p8f), 0x0.0p0f);
    __call605_32(p0, life22_125);
    life13_46 = __call605_34(life22_125, __call605_33(p0, new moom.DT(life22_125)), life13_46);
    life19_72 = 1;
    }
    life14_52 = (life14_52 + (__call605_35(p6, 5) - __call605_36(p6, 5)));
    forestValue605_165_0 = (life15_58 + (__call605_37(p6, 5) - __call605_38(p6, 5)));
    }
    life15_58 = forestValue605_165_0;
    forest_cycle_166: while (true) {
    forest_join_208: {
    forest_join_190: {
    if (!((life14_52 >= p2))) {
        break forest_join_190;
    }
    spill605_10 = life14_52;
    spill605_11 = (p2 + p4);
    if (!((life9_9 == null))) {
        forestValue605_208_0 = spill605_10;
        forestValue605_208_1 = spill605_11;
        break forest_join_208;
    }
    if (!((life9_9 == null))) {
        forestValue605_208_0 = spill605_10;
        forestValue605_208_1 = spill605_11;
        break forest_join_208;
    }
    if (!((spill605_10 < spill605_11))) {
        break forest_join_190;
    }
    spill605_12 = life15_58;
    spill605_13 = p3;
    if (!((life9_9 == null))) {
        forestValue605_208_0 = spill605_12;
        forestValue605_208_1 = spill605_13;
        break forest_join_208;
    }
    if (!((spill605_12 >= spill605_13))) {
        break forest_join_190;
    }
    spill605_14 = life15_58;
    spill605_15 = (p3 + p4);
    if (!((life9_9 == null))) {
        forestValue605_208_0 = spill605_14;
        forestValue605_208_1 = spill605_15;
        break forest_join_208;
    }
    if (!((spill605_14 >= spill605_15))) {
        break forest_join_212;
    }
    }
    life14_52 = ((life16_60 + __call605_39(p6, 5)) - __call605_40(p6, 5));
    forestValue605_208_0 = (life17_62 + __call605_41(p6, 5));
    forestValue605_208_1 = __call605_42(p6, 5);
    }
    life15_58 = (forestValue605_208_0 - forestValue605_208_1);
    if (!((life9_9 != null))) {
        continue forest_cycle_166;
    }
    break forest_cycle_166;
    }
    }
    life20_77 += 1;
    if (!((life9_9 != null))) {
        continue forest_cycle_69;
    }
    break forest_cycle_69;
    }
    break forest_cycle_62;
    }
    }
    life18_64 += 1;
    if (!((life9_9 != null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    break forest_cycle_20;
    }
    }
    if (!((life9_9 != null))) {
        continue forest_cycle_15;
    }
    break forest_cycle_15;
    }
    break forest_join_428;
    }
    forest_cycle_221: while (true) {
    forest_join_422: {
    forest_join_419: {
    if (!((forestValue605_221_0 < 0))) {
        break forest_join_428;
    }
    life11_266 = __cast605_45(__call605_44(__fieldRead605_43(p0), life10_8));
    life12_279 = (__fieldRead605_46(life11_266) + __call605_49(p6, ((1 + __fieldRead605_47(life11_266)) - __fieldRead605_48(life11_266))));
    life13_281 = null;
    life14_287 = (p2 + __call605_50(p6, p4));
    life15_293 = (p3 + __call605_51(p6, p5));
    life16_295 = life14_287;
    life17_297 = life15_293;
    life18_299 = 0;
    forest_cycle_261: while (true) {
    forest_join_416: {
    forestValue605_263_0 = life18_299;
    forestValue605_263_1 = life12_279;
    forest_cycle_263: while (true) {
    if (!((forestValue605_263_0 < forestValue605_263_1))) {
        break forest_join_419;
    }
    life19_307 = 0;
    spill605_16 = 0;
    if (!((life9_9 == null))) {
        forestValue605_221_0 = spill605_16;
        continue forest_cycle_221;
    }
    life20_312 = spill605_16;
    forest_cycle_270: while (true) {
    forest_join_413: {
    forest_join_366: {
    forest_join_347: {
    if (!((life19_307 == 0))) {
        break forest_join_416;
    }
    spill605_17 = life20_312;
    spill605_18 = 4;
    if (!((life9_9 == null))) {
        forestValue605_263_0 = spill605_17;
        forestValue605_263_1 = spill605_18;
        continue forest_cycle_263;
    }
    if (!((spill605_17 < spill605_18))) {
        break forest_join_416;
    }
    life21_332 = __call605_52(p0, new moom.DT(life14_287, 0, life15_293));
    spill605_19 = __call605_54(__fieldRead605_53(), p0, life21_332);
    if (!((life9_9 == null))) {
        forestValue605_366_0 = __integerCategory605_55(spill605_19);
        break forest_join_366;
    }
    if (!(spill605_19)) {
        break forest_join_347;
    }
    spill605_20 = __fieldRead605_56(life11_266);
    java.lang.Class[] __stackOp605_57_0 = new java.lang.Class[1];
    spill605_21 = __stackOp605_57_0;
    (__stackOp605_57_0)[0] = __classLiteral605_58();
    spill605_22 = __call605_59(spill605_20, spill605_21);
    java.lang.Object[] __stackOp605_60_0 = new java.lang.Object[1];
    spill605_23 = __stackOp605_60_0;
    (__stackOp605_60_0)[0] = p0;
    life22_360 = __cast605_62(__call605_61(spill605_22, spill605_23));
    __call605_65(life22_360, ((double) (((float) life14_287) + 0x1.0p-1f)), ((double) __call605_63(life21_332)), ((double) (((float) life15_293) + 0x1.0p-1f)), (__call605_64(p6) * 0x1.68p8f), 0x0.0p0f);
    __call605_66(p0, life22_360);
    life13_281 = __call605_68(life22_360, __call605_67(p0, new moom.DT(life22_360)), life13_281);
    life19_307 = 1;
    }
    life14_287 = (life14_287 + (__call605_69(p6, 5) - __call605_70(p6, 5)));
    forestValue605_366_0 = (life15_293 + (__call605_71(p6, 5) - __call605_72(p6, 5)));
    }
    life15_293 = forestValue605_366_0;
    forest_cycle_367: while (true) {
    forest_join_409: {
    forest_join_391: {
    if (!((life14_287 >= p2))) {
        break forest_join_391;
    }
    spill605_24 = life14_287;
    spill605_25 = (p2 + p4);
    if (!((life9_9 == null))) {
        forestValue605_409_0 = spill605_24;
        forestValue605_409_1 = spill605_25;
        break forest_join_409;
    }
    if (!((life9_9 == null))) {
        forestValue605_409_0 = spill605_24;
        forestValue605_409_1 = spill605_25;
        break forest_join_409;
    }
    if (!((spill605_24 < spill605_25))) {
        break forest_join_391;
    }
    spill605_26 = life15_293;
    spill605_27 = p3;
    if (!((life9_9 == null))) {
        forestValue605_409_0 = spill605_26;
        forestValue605_409_1 = spill605_27;
        break forest_join_409;
    }
    if (!((spill605_26 >= spill605_27))) {
        break forest_join_391;
    }
    spill605_28 = life15_293;
    spill605_29 = (p3 + p4);
    if (!((life9_9 == null))) {
        forestValue605_409_0 = spill605_28;
        forestValue605_409_1 = spill605_29;
        break forest_join_409;
    }
    if (!((spill605_28 >= spill605_29))) {
        break forest_join_413;
    }
    }
    life14_287 = ((life16_295 + __call605_73(p6, 5)) - __call605_74(p6, 5));
    forestValue605_409_0 = (life17_297 + __call605_75(p6, 5));
    forestValue605_409_1 = __call605_76(p6, 5);
    }
    life15_293 = (forestValue605_409_0 - forestValue605_409_1);
    if (!((life9_9 != null))) {
        continue forest_cycle_367;
    }
    break forest_cycle_367;
    }
    }
    life20_312 += 1;
    if (!((life9_9 != null))) {
        continue forest_cycle_270;
    }
    break forest_cycle_270;
    }
    break forest_cycle_263;
    }
    }
    life18_299 += 1;
    if (!((life9_9 != null))) {
        continue forest_cycle_261;
    }
    break forest_cycle_261;
    }
    }
    if (!((life9_9 != null))) {
        break forest_join_422;
    }
    break forest_join_428;
    }
    spill605_30 = __numericCompare605_79(__call605_77(p6), __call605_78(p1));
    forestValue605_221_0 = spill605_30;
    continue forest_cycle_221;
    }
    }
    return;
}
public static void h605_0(java.lang.Exception p0) throws Throwable {
    throw __call3060500_0(p0);
}
public static void h605_1(java.lang.Exception p0) throws Throwable {
    throw __call3060501_0(p0);
}
public static void h605_2(java.lang.Exception p0) throws Throwable {
    throw __call3060502_0(p0);
}
public static void h605_3(java.lang.Exception p0, net.minecraft.world.World p1, net.minecraft.world.biome.BiomeGenBase p2, int p3, int p4, int p5, int p6, java.util.Random p7, java.lang.String p8, java.util.List p9, moom.D7 p10, int p11, net.minecraft.entity.IEntityLivingData p12, int p13, int p14, int p15, int p16, int p17, int p18, int p19, moom.DT p20, net.minecraft.entity.EntityLiving p21) throws Throwable {
    int forestValue3060503_37_0;
    int forestValue3060503_78_0;
    int forestValue3060503_79_0;
    int forestValue3060503_79_1;
    int forestValue3060503_94_0;
    int forestValue3060503_137_0;
    int forestValue3060503_146_0;
    int forestValue3060503_194_0;
    int forestValue3060503_203_0;
    int forestValue3060503_203_1;
    int forestValue3060503_225_0;
    int forestValue3060503_266_0;
    int forestValue3060503_266_1;
    int forestValue3060503_275_0;
    int forestValue3060503_317_0;
    int forestValue3060503_317_1;
    int forestValue3060503_330_0;
    int forestValue3060503_330_1;
    int forestValue3060503_420_0;
    int forestValue3060503_463_0;
    int forestValue3060503_463_1;
    int spill3060503_0;
    int spill3060503_1;
    int spill3060503_2;
    int spill3060503_3;
    int spill3060503_4;
    int spill3060503_5;
    int spill3060503_6;
    int spill3060503_7;
    int spill3060503_8;
    int spill3060503_9;
    int spill3060503_10;
    int spill3060503_11;
    int spill3060503_12;
    boolean spill3060503_13;
    java.lang.Class spill3060503_14;
    java.lang.Class[] spill3060503_15;
    java.lang.reflect.Constructor spill3060503_16;
    java.lang.Object[] spill3060503_17;
    int spill3060503_18;
    int spill3060503_19;
    int spill3060503_20;
    int spill3060503_21;
    int spill3060503_22;
    int spill3060503_23;
    java.lang.Exception life22_2;
    moom.DT life20_374;
    net.minecraft.entity.EntityLiving life21_402;
    forest_join_468: {
    life22_2 = p0;
    __call3060503_0(life22_2);
    forest_cycle_4: while (true) {
    forest_join_420: {
    forest_join_401: {
    forest_join_331: {
    forest_join_197: {
    forest_join_196: {
    forest_join_8: {
    p19 += 1;
    if (!((p8 != null))) {
        break forest_join_8;
    }
    break forest_join_197;
    }
    forest_cycle_8: while (true) {
    forest_join_194: {
    forest_join_138: {
    forest_join_137: {
    forest_join_79: {
    forest_join_78: {
    forest_join_20: {
    forest_join_16: {
    if (!((p18 == 0))) {
        break forest_join_16;
    }
    spill3060503_0 = p19;
    spill3060503_1 = 4;
    if (!((p8 == null))) {
        forestValue3060503_79_0 = spill3060503_0;
        forestValue3060503_79_1 = spill3060503_1;
        break forest_join_79;
    }
    if (!((spill3060503_0 < spill3060503_1))) {
        break forest_join_16;
    }
    break forest_join_196;
    }
    p17 += 1;
    if (!((p8 != null))) {
        break forest_join_20;
    }
    break forest_join_138;
    }
    forest_cycle_20: while (true) {
    forest_join_37: {
    forest_join_32: {
    forest_join_29: {
    if (!((p17 < p11))) {
        break forest_join_29;
    }
    p18 = 0;
    spill3060503_2 = 0;
    if (!((p8 == null))) {
        forestValue3060503_37_0 = spill3060503_2;
        break forest_join_37;
    }
    forestValue3060503_78_0 = spill3060503_2;
    break forest_join_78;
    }
    if (!((p8 != null))) {
        break forest_join_32;
    }
    break forest_join_468;
    }
    forestValue3060503_37_0 = __numericCompare3060503_3(__call3060503_1(p7), __call3060503_2(p2));
    }
    if (!((forestValue3060503_37_0 < 0))) {
        break forest_join_468;
    }
    p10 = __cast3060503_6(__call3060503_5(__fieldRead3060503_4(p1), p9));
    p11 = (__fieldRead3060503_7(p10) + __call3060503_10(p7, ((1 + __fieldRead3060503_8(p10)) - __fieldRead3060503_9(p10))));
    p12 = null;
    p13 = (p3 + __call3060503_11(p7, p5));
    p14 = (p4 + __call3060503_12(p7, p6));
    p15 = p13;
    p16 = p14;
    p17 = 0;
    continue forest_cycle_20;
    }
    }
    forestValue3060503_194_0 = forestValue3060503_78_0;
    break forest_join_194;
    }
    forest_cycle_79: while (true) {
    forest_join_94: {
    forest_join_89: {
    forest_join_86: {
    if (!((forestValue3060503_79_0 < forestValue3060503_79_1))) {
        break forest_join_86;
    }
    p18 = 0;
    spill3060503_3 = 0;
    if (!((p8 == null))) {
        forestValue3060503_94_0 = spill3060503_3;
        break forest_join_94;
    }
    forestValue3060503_137_0 = spill3060503_3;
    break forest_join_137;
    }
    if (!((p8 != null))) {
        break forest_join_89;
    }
    break forest_join_468;
    }
    forestValue3060503_94_0 = __numericCompare3060503_15(__call3060503_13(p7), __call3060503_14(p2));
    }
    if (!((forestValue3060503_94_0 < 0))) {
        break forest_join_468;
    }
    p10 = __cast3060503_18(__call3060503_17(__fieldRead3060503_16(p1), p9));
    p11 = (__fieldRead3060503_19(p10) + __call3060503_22(p7, ((1 + __fieldRead3060503_20(p10)) - __fieldRead3060503_21(p10))));
    p12 = null;
    p13 = (p3 + __call3060503_23(p7, p5));
    p14 = (p4 + __call3060503_24(p7, p6));
    p15 = p13;
    p16 = p14;
    p17 = 0;
    spill3060503_4 = p17;
    spill3060503_5 = p11;
    forestValue3060503_79_0 = spill3060503_4;
    forestValue3060503_79_1 = spill3060503_5;
    continue forest_cycle_79;
    }
    }
    forestValue3060503_194_0 = forestValue3060503_137_0;
    break forest_join_194;
    }
    forest_cycle_138: while (true) {
    forest_join_141: {
    if (!((p8 != null))) {
        break forest_join_141;
    }
    break forest_join_468;
    }
    forestValue3060503_146_0 = __numericCompare3060503_27(__call3060503_25(p7), __call3060503_26(p2));
    forest_cycle_146: while (true) {
    if (!((forestValue3060503_146_0 < 0))) {
        break forest_join_468;
    }
    p10 = __cast3060503_30(__call3060503_29(__fieldRead3060503_28(p1), p9));
    p11 = (__fieldRead3060503_31(p10) + __call3060503_34(p7, ((1 + __fieldRead3060503_32(p10)) - __fieldRead3060503_33(p10))));
    p12 = null;
    p13 = (p3 + __call3060503_35(p7, p5));
    p14 = (p4 + __call3060503_36(p7, p6));
    p15 = p13;
    p16 = p14;
    p17 = 0;
    if (!((p17 < p11))) {
        continue forest_cycle_138;
    }
    p18 = 0;
    spill3060503_6 = 0;
    if (!((p8 == null))) {
        forestValue3060503_146_0 = spill3060503_6;
        continue forest_cycle_146;
    }
    break forest_cycle_146;
    }
    break forest_cycle_138;
    }
    forestValue3060503_194_0 = spill3060503_6;
    }
    p19 = forestValue3060503_194_0;
    continue forest_cycle_8;
    }
    }
    break forest_join_331;
    }
    forest_cycle_197: while (true) {
    forest_join_330: {
    forest_join_267: {
    forest_join_266: {
    forest_join_201: {
    p17 += 1;
    if (!((p8 != null))) {
        break forest_join_201;
    }
    break forest_join_267;
    }
    forest_cycle_201: while (true) {
    forest_join_225: {
    forest_join_220: {
    forest_join_217: {
    forestValue3060503_203_0 = p17;
    forestValue3060503_203_1 = p11;
    forest_cycle_203: while (true) {
    if (!((forestValue3060503_203_0 < forestValue3060503_203_1))) {
        break forest_join_217;
    }
    p18 = 0;
    spill3060503_7 = 0;
    if (!((p8 == null))) {
        forestValue3060503_225_0 = spill3060503_7;
        break forest_join_225;
    }
    p19 = spill3060503_7;
    if (!((p18 == 0))) {
        continue forest_cycle_197;
    }
    spill3060503_8 = p19;
    spill3060503_9 = 4;
    if (!((p8 == null))) {
        forestValue3060503_203_0 = spill3060503_8;
        forestValue3060503_203_1 = spill3060503_9;
        continue forest_cycle_203;
    }
    break forest_cycle_203;
    }
    forestValue3060503_266_0 = spill3060503_8;
    forestValue3060503_266_1 = spill3060503_9;
    break forest_join_266;
    }
    if (!((p8 != null))) {
        break forest_join_220;
    }
    break forest_join_468;
    }
    forestValue3060503_225_0 = __numericCompare3060503_39(__call3060503_37(p7), __call3060503_38(p2));
    }
    if (!((forestValue3060503_225_0 < 0))) {
        break forest_join_468;
    }
    p10 = __cast3060503_42(__call3060503_41(__fieldRead3060503_40(p1), p9));
    p11 = (__fieldRead3060503_43(p10) + __call3060503_46(p7, ((1 + __fieldRead3060503_44(p10)) - __fieldRead3060503_45(p10))));
    p12 = null;
    p13 = (p3 + __call3060503_47(p7, p5));
    p14 = (p4 + __call3060503_48(p7, p6));
    p15 = p13;
    p16 = p14;
    p17 = 0;
    continue forest_cycle_201;
    }
    }
    forestValue3060503_330_0 = forestValue3060503_266_0;
    forestValue3060503_330_1 = forestValue3060503_266_1;
    break forest_join_330;
    }
    forest_cycle_267: while (true) {
    forest_join_270: {
    if (!((p8 != null))) {
        break forest_join_270;
    }
    break forest_join_468;
    }
    forestValue3060503_275_0 = __numericCompare3060503_51(__call3060503_49(p7), __call3060503_50(p2));
    forest_cycle_275: while (true) {
    if (!((forestValue3060503_275_0 < 0))) {
        break forest_join_468;
    }
    p10 = __cast3060503_54(__call3060503_53(__fieldRead3060503_52(p1), p9));
    p11 = (__fieldRead3060503_55(p10) + __call3060503_58(p7, ((1 + __fieldRead3060503_56(p10)) - __fieldRead3060503_57(p10))));
    p12 = null;
    p13 = (p3 + __call3060503_59(p7, p5));
    p14 = (p4 + __call3060503_60(p7, p6));
    p15 = p13;
    p16 = p14;
    p17 = 0;
    forestValue3060503_317_0 = p17;
    forestValue3060503_317_1 = p11;
    forest_cycle_317: while (true) {
    if (!((forestValue3060503_317_0 < forestValue3060503_317_1))) {
        continue forest_cycle_267;
    }
    p18 = 0;
    spill3060503_10 = 0;
    if (!((p8 == null))) {
        forestValue3060503_275_0 = spill3060503_10;
        continue forest_cycle_275;
    }
    p19 = spill3060503_10;
    if (!((p18 == 0))) {
        continue forest_cycle_197;
    }
    spill3060503_11 = p19;
    spill3060503_12 = 4;
    if (!((p8 == null))) {
        forestValue3060503_317_0 = spill3060503_11;
        forestValue3060503_317_1 = spill3060503_12;
        continue forest_cycle_317;
    }
    break forest_cycle_317;
    }
    break forest_cycle_275;
    }
    break forest_cycle_267;
    }
    forestValue3060503_330_0 = spill3060503_11;
    forestValue3060503_330_1 = spill3060503_12;
    }
    if (!((forestValue3060503_330_0 < forestValue3060503_330_1))) {
        continue forest_cycle_197;
    }
    break forest_cycle_197;
    }
    }
    life20_374 = __call3060503_61(p1, new moom.DT(p13, 0, p14));
    spill3060503_13 = __call3060503_63(__fieldRead3060503_62(), p1, life20_374);
    if (!((p8 == null))) {
        forestValue3060503_420_0 = __integerCategory3060503_64(spill3060503_13);
        break forest_join_420;
    }
    if (!(spill3060503_13)) {
        break forest_join_401;
    }
    spill3060503_14 = __fieldRead3060503_65(p10);
    java.lang.Class[] __stackOp3060503_66_0 = new java.lang.Class[1];
    spill3060503_15 = __stackOp3060503_66_0;
    (__stackOp3060503_66_0)[0] = __classLiteral3060503_67();
    spill3060503_16 = __call3060503_68(spill3060503_14, spill3060503_15);
    java.lang.Object[] __stackOp3060503_69_0 = new java.lang.Object[1];
    spill3060503_17 = __stackOp3060503_69_0;
    (__stackOp3060503_69_0)[0] = p1;
    life21_402 = __cast3060503_71(__call3060503_70(spill3060503_16, spill3060503_17));
    __call3060503_74(life21_402, ((double) (((float) p13) + 0x1.0p-1f)), ((double) __call3060503_72(life20_374)), ((double) (((float) p14) + 0x1.0p-1f)), (__call3060503_73(p7) * 0x1.68p8f), 0x0.0p0f);
    __call3060503_75(p1, life21_402);
    p12 = __call3060503_77(life21_402, __call3060503_76(p1, new moom.DT(life21_402)), p12);
    p18 = 1;
    }
    p13 = (p13 + (__call3060503_78(p7, 5) - __call3060503_79(p7, 5)));
    forestValue3060503_420_0 = (p14 + (__call3060503_80(p7, 5) - __call3060503_81(p7, 5)));
    }
    p14 = forestValue3060503_420_0;
    forest_cycle_421: while (true) {
    forest_join_463: {
    forest_join_445: {
    if (!((p13 >= p3))) {
        break forest_join_445;
    }
    spill3060503_18 = p13;
    spill3060503_19 = (p3 + p5);
    if (!((p8 == null))) {
        forestValue3060503_463_0 = spill3060503_18;
        forestValue3060503_463_1 = spill3060503_19;
        break forest_join_463;
    }
    if (!((p8 == null))) {
        forestValue3060503_463_0 = spill3060503_18;
        forestValue3060503_463_1 = spill3060503_19;
        break forest_join_463;
    }
    if (!((spill3060503_18 < spill3060503_19))) {
        break forest_join_445;
    }
    spill3060503_20 = p14;
    spill3060503_21 = p4;
    if (!((p8 == null))) {
        forestValue3060503_463_0 = spill3060503_20;
        forestValue3060503_463_1 = spill3060503_21;
        break forest_join_463;
    }
    if (!((spill3060503_20 >= spill3060503_21))) {
        break forest_join_445;
    }
    spill3060503_22 = p14;
    spill3060503_23 = (p4 + p5);
    if (!((p8 == null))) {
        forestValue3060503_463_0 = spill3060503_22;
        forestValue3060503_463_1 = spill3060503_23;
        break forest_join_463;
    }
    if (!((spill3060503_22 >= spill3060503_23))) {
        continue forest_cycle_4;
    }
    }
    p13 = ((p15 + __call3060503_82(p7, 5)) - __call3060503_83(p7, 5));
    forestValue3060503_463_0 = (p16 + __call3060503_84(p7, 5));
    forestValue3060503_463_1 = __call3060503_85(p7, 5);
    }
    p14 = (forestValue3060503_463_0 - forestValue3060503_463_1);
    if (!((p8 != null))) {
        continue forest_cycle_421;
    }
    break forest_cycle_421;
    }
    continue forest_cycle_4;
    }
    }
    return;
}
public static void h605_4(java.lang.Exception p0) throws Throwable {
    throw __call3060504_0(p0);
}
public static void h605_5(java.lang.Exception p0) throws Throwable {
    throw __call3060505_0(p0);
}
public static void h605_6(java.lang.Exception p0) throws Throwable {
    throw __call3060506_0(p0);
}
public static void h605_7(java.lang.Exception p0) throws Throwable {
    throw __call3060507_0(p0);
}
public static void h605_8(java.lang.Exception p0) throws Throwable {
    throw __call3060508_0(p0);
}
public static void h605_9(java.lang.Exception p0) throws Throwable {
    throw __call3060509_0(p0);
}
private static native long __fieldRead605_0() throws Throwable;
private static native java.lang.String __call605_1() throws Throwable;
private static native net.minecraft.entity.EnumCreatureType __fieldRead605_2() throws Throwable;
private static native java.util.List __call605_3(net.minecraft.world.biome.BiomeGenBase a0, net.minecraft.entity.EnumCreatureType a1) throws Throwable;
private static native boolean __call605_4(java.util.List a0) throws Throwable;
private static native int __integerCategory605_5(boolean value) throws Throwable;
private static native float __call605_6(java.util.Random a0) throws Throwable;
private static native float __call605_7(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare605_8(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead605_9(net.minecraft.world.World a0) throws Throwable;
private static native moom.D1 __call605_10(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast605_11(moom.D1 a0) throws Throwable;
private static native int __fieldRead605_12(moom.D7 a0) throws Throwable;
private static native int __fieldRead605_13(moom.D7 a0) throws Throwable;
private static native int __fieldRead605_14(moom.D7 a0) throws Throwable;
private static native int __call605_15(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_16(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_17(java.util.Random a0, int a1) throws Throwable;
private static native moom.DT __call605_18(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving$SpawnPlacementType __fieldRead605_19() throws Throwable;
private static native boolean __call605_20(net.minecraft.entity.EntityLiving$SpawnPlacementType a0, net.minecraft.world.World a1, moom.DT a2) throws Throwable;
private static native int __integerCategory605_21(boolean value) throws Throwable;
private static native java.lang.Class __fieldRead605_22(moom.D7 a0) throws Throwable;
private static native java.lang.Class __classLiteral605_24() throws Throwable;
private static native java.lang.reflect.Constructor __call605_25(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call605_27(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast605_28(java.lang.Object a0) throws Throwable;
private static native int __call605_29(moom.DT a0) throws Throwable;
private static native float __call605_30(java.util.Random a0) throws Throwable;
private static native void __call605_31(net.minecraft.entity.EntityLiving a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native boolean __call605_32(net.minecraft.world.World a0, net.minecraft.entity.EntityLiving a1) throws Throwable;
private static native moom.Eh __call605_33(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call605_34(net.minecraft.entity.EntityLiving a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws Throwable;
private static native int __call605_35(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_36(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_37(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_38(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_39(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_40(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_41(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_42(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead605_43(net.minecraft.world.World a0) throws Throwable;
private static native moom.D1 __call605_44(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast605_45(moom.D1 a0) throws Throwable;
private static native int __fieldRead605_46(moom.D7 a0) throws Throwable;
private static native int __fieldRead605_47(moom.D7 a0) throws Throwable;
private static native int __fieldRead605_48(moom.D7 a0) throws Throwable;
private static native int __call605_49(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_50(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_51(java.util.Random a0, int a1) throws Throwable;
private static native moom.DT __call605_52(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving$SpawnPlacementType __fieldRead605_53() throws Throwable;
private static native boolean __call605_54(net.minecraft.entity.EntityLiving$SpawnPlacementType a0, net.minecraft.world.World a1, moom.DT a2) throws Throwable;
private static native int __integerCategory605_55(boolean value) throws Throwable;
private static native java.lang.Class __fieldRead605_56(moom.D7 a0) throws Throwable;
private static native java.lang.Class __classLiteral605_58() throws Throwable;
private static native java.lang.reflect.Constructor __call605_59(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call605_61(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast605_62(java.lang.Object a0) throws Throwable;
private static native int __call605_63(moom.DT a0) throws Throwable;
private static native float __call605_64(java.util.Random a0) throws Throwable;
private static native void __call605_65(net.minecraft.entity.EntityLiving a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native boolean __call605_66(net.minecraft.world.World a0, net.minecraft.entity.EntityLiving a1) throws Throwable;
private static native moom.Eh __call605_67(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call605_68(net.minecraft.entity.EntityLiving a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws Throwable;
private static native int __call605_69(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_70(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_71(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_72(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_73(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_74(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_75(java.util.Random a0, int a1) throws Throwable;
private static native int __call605_76(java.util.Random a0, int a1) throws Throwable;
private static native float __call605_77(java.util.Random a0) throws Throwable;
private static native float __call605_78(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare605_79(float a0, float a1) throws Throwable;
private static native java.lang.Exception __call3060500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3060501_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3060502_0(java.lang.Exception a0) throws Throwable;
private static native void __call3060503_0(java.lang.Exception a0) throws Throwable;
private static native float __call3060503_1(java.util.Random a0) throws Throwable;
private static native float __call3060503_2(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare3060503_3(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead3060503_4(net.minecraft.world.World a0) throws Throwable;
private static native moom.D1 __call3060503_5(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast3060503_6(moom.D1 a0) throws Throwable;
private static native int __fieldRead3060503_7(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_8(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_9(moom.D7 a0) throws Throwable;
private static native int __call3060503_10(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_11(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_12(java.util.Random a0, int a1) throws Throwable;
private static native float __call3060503_13(java.util.Random a0) throws Throwable;
private static native float __call3060503_14(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare3060503_15(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead3060503_16(net.minecraft.world.World a0) throws Throwable;
private static native moom.D1 __call3060503_17(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast3060503_18(moom.D1 a0) throws Throwable;
private static native int __fieldRead3060503_19(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_20(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_21(moom.D7 a0) throws Throwable;
private static native int __call3060503_22(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_23(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_24(java.util.Random a0, int a1) throws Throwable;
private static native float __call3060503_25(java.util.Random a0) throws Throwable;
private static native float __call3060503_26(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare3060503_27(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead3060503_28(net.minecraft.world.World a0) throws Throwable;
private static native moom.D1 __call3060503_29(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast3060503_30(moom.D1 a0) throws Throwable;
private static native int __fieldRead3060503_31(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_32(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_33(moom.D7 a0) throws Throwable;
private static native int __call3060503_34(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_35(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_36(java.util.Random a0, int a1) throws Throwable;
private static native float __call3060503_37(java.util.Random a0) throws Throwable;
private static native float __call3060503_38(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare3060503_39(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead3060503_40(net.minecraft.world.World a0) throws Throwable;
private static native moom.D1 __call3060503_41(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast3060503_42(moom.D1 a0) throws Throwable;
private static native int __fieldRead3060503_43(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_44(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_45(moom.D7 a0) throws Throwable;
private static native int __call3060503_46(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_47(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_48(java.util.Random a0, int a1) throws Throwable;
private static native float __call3060503_49(java.util.Random a0) throws Throwable;
private static native float __call3060503_50(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare3060503_51(float a0, float a1) throws Throwable;
private static native java.util.Random __fieldRead3060503_52(net.minecraft.world.World a0) throws Throwable;
private static native moom.D1 __call3060503_53(java.util.Random a0, java.util.List a1) throws Throwable;
private static native moom.D7 __cast3060503_54(moom.D1 a0) throws Throwable;
private static native int __fieldRead3060503_55(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_56(moom.D7 a0) throws Throwable;
private static native int __fieldRead3060503_57(moom.D7 a0) throws Throwable;
private static native int __call3060503_58(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_59(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_60(java.util.Random a0, int a1) throws Throwable;
private static native moom.DT __call3060503_61(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving$SpawnPlacementType __fieldRead3060503_62() throws Throwable;
private static native boolean __call3060503_63(net.minecraft.entity.EntityLiving$SpawnPlacementType a0, net.minecraft.world.World a1, moom.DT a2) throws Throwable;
private static native int __integerCategory3060503_64(boolean value) throws Throwable;
private static native java.lang.Class __fieldRead3060503_65(moom.D7 a0) throws Throwable;
private static native java.lang.Class __classLiteral3060503_67() throws Throwable;
private static native java.lang.reflect.Constructor __call3060503_68(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call3060503_70(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast3060503_71(java.lang.Object a0) throws Throwable;
private static native int __call3060503_72(moom.DT a0) throws Throwable;
private static native float __call3060503_73(java.util.Random a0) throws Throwable;
private static native void __call3060503_74(net.minecraft.entity.EntityLiving a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native boolean __call3060503_75(net.minecraft.world.World a0, net.minecraft.entity.EntityLiving a1) throws Throwable;
private static native moom.Eh __call3060503_76(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call3060503_77(net.minecraft.entity.EntityLiving a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws Throwable;
private static native int __call3060503_78(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_79(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_80(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_81(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_82(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_83(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_84(java.util.Random a0, int a1) throws Throwable;
private static native int __call3060503_85(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.Exception __call3060504_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3060505_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3060506_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3060507_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3060508_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3060509_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_029d4f0008aa3bdc89f0(moom.Es a0, net.minecraft.world.WorldServer a1, boolean a2, boolean a3, boolean a4) throws E;
private static final class __SourceHandler_029d4f0008aa3bdc89f0 {

public static int f246(moom.Es receiver, net.minecraft.world.WorldServer p0, boolean p1, boolean p2, boolean p3) throws Throwable {
    int forestValue246_17_0;
    java.lang.Object forestValue246_31_0;
    net.minecraft.entity.player.EntityPlayer forestValue246_44_0;
    int forestValue246_60_0;
    int forestValue246_74_0;
    int forestValue246_91_0;
    int forestValue246_109_0;
    int forestValue246_109_1;
    int forestValue246_143_0;
    int forestValue246_145_0;
    int forestValue246_179_0;
    int forestValue246_204_0;
    int forestValue246_227_0;
    int forestValue246_246_0;
    int forestValue246_255_0;
    int forestValue246_266_0;
    int forestValue246_286_0;
    int forestValue246_321_0;
    int forestValue246_325_0;
    moom.D7 forestValue246_440_0;
    net.minecraft.world.WorldServer forestValue246_445_0;
    net.minecraft.entity.EnumCreatureType forestValue246_445_1;
    int forestValue246_459_0;
    java.lang.Object forestValue246_465_0;
    java.lang.Object forestValue246_495_0;
    int forestValue246_517_0;
    int forestValue246_521_0;
    int forestValue246_523_0;
    int forestValue246_556_0;
    int forestValue246_566_0;
    int forestValue246_566_1;
    int forestValue246_567_0;
    int forestValue246_580_0;
    boolean spill246_0;
    boolean spill246_1;
    java.util.List spill246_2;
    int spill246_3;
    net.minecraft.entity.player.EntityPlayer spill246_4;
    int spill246_5;
    int spill246_6;
    boolean spill246_7;
    int spill246_8;
    int spill246_9;
    int spill246_10;
    int spill246_11;
    int spill246_12;
    int spill246_13;
    int spill246_14;
    boolean spill246_15;
    boolean spill246_16;
    boolean spill246_17;
    boolean spill246_18;
    boolean spill246_19;
    boolean spill246_20;
    int spill246_21;
    long spill246_22;
    int spill246_23;
    boolean spill246_24;
    moom.D7 spill246_25;
    net.minecraft.world.WorldServer spill246_26;
    net.minecraft.entity.EnumCreatureType spill246_27;
    boolean spill246_28;
    net.minecraft.entity.EntityLiving$SpawnPlacementType spill246_29;
    net.minecraft.entity.EntityLiving spill246_30;
    java.lang.Class spill246_31;
    java.lang.Class[] spill246_32;
    java.lang.reflect.Constructor spill246_33;
    java.lang.Object[] spill246_34;
    boolean spill246_35;
    int spill246_36;
    boolean spill246_37;
    int spill246_38;
    int spill246_39;
    long life5_3;
    java.lang.String life7_5;
    int life8_28;
    net.minecraft.entity.player.EntityPlayer life9_30;
    int life10_105;
    java.util.Iterator life11_109;
    net.minecraft.entity.player.EntityPlayer life12_116;
    int life13_138;
    int life14_145;
    int life15_150;
    int life16_153;
    int life17_161;
    int life18_216;
    moom.Ee life19_226;
    moom.DT life11_302;
    moom.DX life12_309;
    net.minecraft.entity.EnumCreatureType[] life13_315;
    int life14_318;
    int life15_320;
    net.minecraft.entity.EnumCreatureType life16_327;
    int life17_400;
    int life18_408;
    java.util.Iterator life19_420;
    moom.Ee life20_427;
    moom.DX life21_435;
    int life22_438;
    int life23_441;
    int life24_444;
    net.minecraft.block.Block life25_449;
    int life26_461;
    int life27_463;
    int life28_468;
    int life29_471;
    int life30_476;
    int life31_478;
    moom.D7 life32_480;
    net.minecraft.entity.IEntityLivingData life33_482;
    int life34_486;
    moom.DT life35_532;
    float life36_537;
    float life37_542;
    net.minecraft.entity.EntityLiving life38_636;
    int life39_711;
    int life40_753;
    forest_join_580: {
    forest_join_579: {
    forest_join_205: {
    forest_join_204: {
    forest_join_203: {
    forest_join_188: {
    forest_join_60: {
    forest_join_59: {
    forest_join_44: {
    forest_join_31: {
    forest_join_17: {
    forest_join_16: {
    life5_3 = (__fieldRead246_0() ^ 129783285699568L);
    life7_5 = __call246_1();
    spill246_0 = p1;
    if (!((life7_5 == null))) {
        forestValue246_17_0 = __integerCategory246_2(spill246_0);
        break forest_join_17;
    }
    if (!((!spill246_0))) {
        break forest_join_16;
    }
    spill246_1 = p2;
    if (!((life7_5 == null))) {
        forestValue246_17_0 = __integerCategory246_3(spill246_1);
        break forest_join_17;
    }
    if (!((!spill246_1))) {
        break forest_join_16;
    }
    return 0;
    }
    forestValue246_17_0 = 1;
    }
    life8_28 = forestValue246_17_0;
    life9_30 = null;
    spill246_2 = __fieldRead246_4(p0);
    if (!((life7_5 == null))) {
        forestValue246_31_0 = spill246_2;
        break forest_join_31;
    }
    if (!((__call246_5(spill246_2) == 1))) {
        break forest_join_59;
    }
    forestValue246_31_0 = __call246_7(__fieldRead246_6(p0), 0);
    }
    life9_30 = __cast246_8(forestValue246_31_0);
    spill246_3 = __call246_10(__fieldRead246_9(receiver));
    if (!((life7_5 == null))) {
        forestValue246_60_0 = spill246_3;
        break forest_join_60;
    }
    if (!((spill246_3 > 0))) {
        break forest_join_59;
    }
    spill246_4 = life9_30;
    if (!((life7_5 == null))) {
        forestValue246_44_0 = spill246_4;
        break forest_join_44;
    }
    if (!((spill246_4 != null))) {
        break forest_join_59;
    }
    forestValue246_44_0 = life9_30;
    }
    spill246_5 = __fieldRead246_11(forestValue246_44_0);
    if (!((life7_5 == null))) {
        forestValue246_60_0 = spill246_5;
        break forest_join_60;
    }
    if (!((spill246_5 == __fieldRead246_12(receiver)))) {
        break forest_join_59;
    }
    spill246_6 = __fieldRead246_13(life9_30);
    if (!((life7_5 == null))) {
        forestValue246_60_0 = spill246_6;
        break forest_join_60;
    }
    if (!((spill246_6 == __fieldRead246_14(receiver)))) {
        break forest_join_59;
    }
    life8_28 = 0;
    }
    forestValue246_60_0 = life8_28;
    }
    if (!((life7_5 == null))) {
        forestValue246_204_0 = forestValue246_60_0;
        break forest_join_204;
    }
    if (!((forestValue246_60_0 != 0))) {
        break forest_join_203;
    }
    __call246_16(__fieldRead246_15(receiver));
    life10_105 = 0;
    life11_109 = __call246_18(__fieldRead246_17(p0));
    forest_cycle_72: while (true) {
    forest_join_186: {
    forestValue246_74_0 = __integerCategory246_20(__call246_19(life11_109));
    forest_cycle_74: while (true) {
    forest_join_91: {
    if (!((forestValue246_74_0 != 0))) {
        break forest_join_188;
    }
    life12_116 = __cast246_22(__call246_21(life11_109));
    spill246_7 = __call246_23(life12_116);
    if (!((life7_5 == null))) {
        forestValue246_204_0 = __integerCategory246_24(spill246_7);
        break forest_join_204;
    }
    if (!((life7_5 == null))) {
        forestValue246_91_0 = __integerCategory246_25(spill246_7);
        break forest_join_91;
    }
    if (!((!spill246_7))) {
        break forest_join_186;
    }
    forestValue246_91_0 = __call246_27((__fieldRead246_26(life12_116) / 0x1.0p4d));
    }
    life13_138 = forestValue246_91_0;
    spill246_8 = 13469;
    life14_145 = __call246_29((__fieldRead246_28(life12_116) / 0x1.0p4d));
    life15_150 = __invokedynamic246_30(spill246_8, (3554908302140358892L ^ life5_3));
    life16_153 = (-life15_150);
    forest_cycle_107: while (true) {
    forest_join_183: {
    forestValue246_109_0 = life16_153;
    forestValue246_109_1 = life15_150;
    forest_cycle_109: while (true) {
    if (!((forestValue246_109_0 <= forestValue246_109_1))) {
        break forest_join_186;
    }
    spill246_9 = (-life15_150);
    if (!((life7_5 == null))) {
        forestValue246_74_0 = spill246_9;
        continue forest_cycle_74;
    }
    life17_161 = spill246_9;
    forest_cycle_115: while (true) {
    forest_join_181: {
    forest_join_180: {
    forest_join_179: {
    forest_join_145: {
    forest_join_144: {
    forest_join_143: {
    forest_join_142: {
    if (!((life17_161 <= life15_150))) {
        break forest_join_183;
    }
    spill246_10 = life16_153;
    if (!((life7_5 == null))) {
        forestValue246_143_0 = spill246_10;
        break forest_join_143;
    }
    spill246_11 = (-life15_150);
    if (!((life7_5 == null))) {
        forestValue246_109_0 = spill246_10;
        forestValue246_109_1 = spill246_11;
        continue forest_cycle_109;
    }
    if (!((spill246_10 != spill246_11))) {
        break forest_join_142;
    }
    spill246_12 = life16_153;
    if (!((life7_5 == null))) {
        forestValue246_143_0 = spill246_12;
        break forest_join_143;
    }
    if (!((spill246_12 != life15_150))) {
        break forest_join_142;
    }
    spill246_13 = life17_161;
    if (!((life7_5 == null))) {
        forestValue246_143_0 = spill246_13;
        break forest_join_143;
    }
    if (!((spill246_13 != (-life15_150)))) {
        break forest_join_142;
    }
    spill246_14 = life17_161;
    if (!((life7_5 == null))) {
        forestValue246_143_0 = spill246_14;
        break forest_join_143;
    }
    if (!((spill246_14 == life15_150))) {
        break forest_join_144;
    }
    }
    forestValue246_143_0 = 1;
    }
    forestValue246_145_0 = forestValue246_143_0;
    break forest_join_145;
    }
    forestValue246_145_0 = 0;
    }
    life18_216 = forestValue246_145_0;
    life19_226 = new moom.Ee((life16_153 + life13_138), (life17_161 + life14_145));
    if (!((life7_5 == null))) {
        break forest_join_181;
    }
    if (!((!__call246_32(__fieldRead246_31(receiver), life19_226)))) {
        break forest_join_180;
    }
    life10_105 += 1;
    if (!((life7_5 == null))) {
        break forest_join_181;
    }
    if (!((life18_216 == 0))) {
        break forest_join_180;
    }
    spill246_15 = __call246_34(__call246_33(p0), life19_226);
    if (!((life7_5 == null))) {
        forestValue246_179_0 = __integerCategory246_35(spill246_15);
        break forest_join_179;
    }
    if (!(spill246_15)) {
        break forest_join_180;
    }
    forestValue246_179_0 = __integerCategory246_38(__call246_37(__fieldRead246_36(receiver), life19_226));
    }
    __discardScalar246_39(forestValue246_179_0);
    }
    life17_161 += 1;
    }
    if (!((life7_5 != null))) {
        continue forest_cycle_115;
    }
    break forest_cycle_115;
    }
    break forest_cycle_109;
    }
    }
    life16_153 += 1;
    if (!((life7_5 != null))) {
        continue forest_cycle_107;
    }
    break forest_cycle_107;
    }
    break forest_cycle_74;
    }
    }
    if (!((life7_5 != null))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    }
    __fieldWrite246_40(receiver, life10_105);
    if (!((life7_5 == null))) {
        break forest_join_205;
    }
    if (!((life9_30 != null))) {
        break forest_join_203;
    }
    __fieldWrite246_42(receiver, __fieldRead246_41(life9_30));
    __fieldWrite246_44(receiver, __fieldRead246_43(life9_30));
    }
    forestValue246_204_0 = 0;
    }
    life10_105 = forestValue246_204_0;
    }
    life11_302 = __call246_45(p0);
    life12_309 = new moom.DX(0, 0, 0);
    new moom.DU();
    life13_315 = __call246_46();
    life14_318 = (life13_315).length;
    life15_320 = 0;
    forest_cycle_226: while (true) {
    forest_join_577: {
    forest_join_576: {
    forestValue246_227_0 = life15_320;
    forest_cycle_227: while (true) {
    forest_join_266: {
    forest_join_262: {
    forest_join_255: {
    forest_join_253: {
    forest_join_246: {
    forest_join_244: {
    if (!((forestValue246_227_0 < life14_318))) {
        break forest_join_579;
    }
    life16_327 = (life13_315)[life15_320];
    spill246_16 = __call246_47(life16_327);
    if (!((life7_5 == null))) {
        forestValue246_580_0 = __integerCategory246_48(spill246_16);
        break forest_join_580;
    }
    if (!((life7_5 == null))) {
        forestValue246_246_0 = __integerCategory246_49(spill246_16);
        break forest_join_246;
    }
    if (!(spill246_16)) {
        break forest_join_244;
    }
    spill246_17 = p2;
    if (!((life7_5 == null))) {
        forestValue246_246_0 = __integerCategory246_50(spill246_17);
        break forest_join_246;
    }
    if (!(spill246_17)) {
        break forest_join_576;
    }
    }
    forestValue246_246_0 = __integerCategory246_52(__call246_51(life16_327));
    }
    if (!((life7_5 == null))) {
        forestValue246_255_0 = forestValue246_246_0;
        break forest_join_255;
    }
    if (!((forestValue246_246_0 == 0))) {
        break forest_join_253;
    }
    spill246_18 = p1;
    if (!((life7_5 == null))) {
        forestValue246_255_0 = __integerCategory246_53(spill246_18);
        break forest_join_255;
    }
    if (!(spill246_18)) {
        break forest_join_576;
    }
    }
    forestValue246_255_0 = __integerCategory246_55(__call246_54(life16_327));
    }
    if (!((life7_5 == null))) {
        forestValue246_266_0 = forestValue246_255_0;
        break forest_join_266;
    }
    if (!((forestValue246_255_0 != 0))) {
        break forest_join_262;
    }
    spill246_19 = p3;
    if (!((life7_5 == null))) {
        forestValue246_266_0 = __integerCategory246_56(spill246_19);
        break forest_join_266;
    }
    if (!(spill246_19)) {
        break forest_join_576;
    }
    }
    forestValue246_266_0 = __call246_58(p0, __call246_57(life16_327));
    }
    life17_400 = forestValue246_266_0;
    life18_408 = ((__call246_59(life16_327) * __fieldRead246_60(receiver)) / __fieldRead246_61());
    if (!((life7_5 == null))) {
        break forest_join_577;
    }
    if (!((life17_400 <= life18_408))) {
        break forest_join_576;
    }
    life19_420 = __call246_63(__fieldRead246_62(receiver));
    forest_cycle_284: while (true) {
    forest_join_574: {
    forestValue246_286_0 = __integerCategory246_65(__call246_64(life19_420));
    forest_cycle_286: while (true) {
    forest_join_321: {
    if (!((forestValue246_286_0 != 0))) {
        break forest_join_576;
    }
    life20_427 = __cast246_67(__call246_66(life19_420));
    life21_435 = __call246_70(p0, __fieldRead246_68(life20_427), __fieldRead246_69(life20_427), life12_309);
    life22_438 = __call246_71(life21_435);
    life23_441 = __call246_72(life21_435);
    life24_444 = __call246_73(life21_435);
    life25_449 = __call246_75(__call246_74(p0, life21_435));
    spill246_20 = __call246_76(life25_449);
    if (!((life7_5 == null))) {
        forestValue246_227_0 = __integerCategory246_77(spill246_20);
        continue forest_cycle_227;
    }
    if (!((life7_5 == null))) {
        forestValue246_321_0 = __integerCategory246_78(spill246_20);
        break forest_join_321;
    }
    if (!((!spill246_20))) {
        break forest_join_574;
    }
    forestValue246_321_0 = 0;
    }
    life26_461 = forestValue246_321_0;
    life27_463 = 0;
    forest_cycle_324: while (true) {
    forest_join_571: {
    forestValue246_325_0 = life27_463;
    forest_cycle_325: while (true) {
    if (!((forestValue246_325_0 < 3))) {
        break forest_join_574;
    }
    life28_468 = life22_438;
    spill246_21 = 3149;
    life29_471 = life23_441;
    spill246_22 = (4646915545474857021L ^ life5_3);
    life30_476 = life24_444;
    life31_478 = __invokedynamic246_79(spill246_21, spill246_22);
    life32_480 = null;
    life33_482 = null;
    spill246_23 = 0;
    if (!((life7_5 == null))) {
        forestValue246_286_0 = spill246_23;
        continue forest_cycle_286;
    }
    life34_486 = spill246_23;
    forest_cycle_347: while (true) {
    forest_join_569: {
    forest_join_568: {
    forest_join_567: {
    forest_join_566: {
    forest_join_564: {
    forest_join_556: {
    forest_join_554: {
    forest_join_523: {
    forest_join_522: {
    forest_join_521: {
    forest_join_517: {
    forest_join_496: {
    forest_join_495: {
    forest_join_465: {
    forest_join_459: {
    forest_join_445: {
    forest_join_443: {
    forest_join_440: {
    if (!((life34_486 < 4))) {
        break forest_join_571;
    }
    life28_468 = (life28_468 + (__call246_81(__fieldRead246_80(p0), life31_478) - __call246_83(__fieldRead246_82(p0), life31_478)));
    life29_471 = (life29_471 + (__call246_85(__fieldRead246_84(p0), 1) - __call246_87(__fieldRead246_86(p0), 1)));
    life30_476 = (life30_476 + (__call246_89(__fieldRead246_88(p0), life31_478) - __call246_91(__fieldRead246_90(p0), life31_478)));
    life35_532 = new moom.DT(life28_468, life29_471, life30_476);
    life36_537 = (((float) life28_468) + 0x1.0p-1f);
    life37_542 = (((float) life30_476) + 0x1.0p-1f);
    if (!((life7_5 == null))) {
        break forest_join_569;
    }
    spill246_24 = __call246_92(p0, ((double) life36_537), ((double) life29_471), ((double) life37_542), 0x1.8p4d);
    if (!((life7_5 == null))) {
        forestValue246_325_0 = __integerCategory246_93(spill246_24);
        continue forest_cycle_325;
    }
    if (!((!spill246_24))) {
        break forest_join_568;
    }
    if (!((__numericCompare246_95(__call246_94(life11_302, ((double) life36_537), ((double) life29_471), ((double) life37_542)), 0x1.2p9d) >= 0))) {
        break forest_join_568;
    }
    spill246_25 = life32_480;
    if (!((life7_5 == null))) {
        forestValue246_440_0 = spill246_25;
        break forest_join_440;
    }
    if (!((spill246_25 == null))) {
        break forest_join_443;
    }
    spill246_26 = p0;
    spill246_27 = life16_327;
    if (!((life7_5 == null))) {
        forestValue246_445_0 = spill246_26;
        forestValue246_445_1 = spill246_27;
        break forest_join_445;
    }
    life32_480 = __call246_96(spill246_26, spill246_27, life35_532);
    forestValue246_440_0 = life32_480;
    }
    if (!((forestValue246_440_0 == null))) {
        break forest_join_443;
    }
    if (!((life7_5 != null))) {
        break forest_join_571;
    }
    }
    forestValue246_445_0 = p0;
    forestValue246_445_1 = life16_327;
    }
    spill246_28 = __call246_97(forestValue246_445_0, forestValue246_445_1, life32_480, life35_532);
    if (!((life7_5 == null))) {
        forestValue246_459_0 = __integerCategory246_98(spill246_28);
        break forest_join_459;
    }
    if (!(spill246_28)) {
        break forest_join_568;
    }
    spill246_29 = __call246_100(__fieldRead246_99(life32_480));
    if (!((life7_5 == null))) {
        forestValue246_465_0 = spill246_29;
        break forest_join_465;
    }
    forestValue246_459_0 = __integerCategory246_102(__call246_101(spill246_29, p0, life35_532));
    }
    if (!((forestValue246_459_0 != 0))) {
        break forest_join_568;
    }
    forestValue246_465_0 = __call246_105(__fieldRead246_103(receiver), __fieldRead246_104(life32_480));
    }
    life38_636 = __cast246_106(forestValue246_465_0);
    spill246_30 = life38_636;
    if (!((life7_5 == null))) {
        forestValue246_495_0 = spill246_30;
        break forest_join_495;
    }
    if (!((spill246_30 == null))) {
        break forest_join_496;
    }
    spill246_31 = __fieldRead246_107(life32_480);
    java.lang.Class[] __stackOp246_108_0 = new java.lang.Class[1];
    spill246_32 = __stackOp246_108_0;
    (__stackOp246_108_0)[0] = __classLiteral246_109();
    spill246_33 = __call246_110(spill246_31, spill246_32);
    java.lang.Object[] __stackOp246_111_0 = new java.lang.Object[1];
    spill246_34 = __stackOp246_111_0;
    (__stackOp246_111_0)[0] = p0;
    life38_636 = __cast246_113(__call246_112(spill246_33, spill246_34));
    forestValue246_495_0 = __call246_116(__fieldRead246_114(receiver), __fieldRead246_115(life32_480), life38_636);
    }
    __discardScalar246_117(forestValue246_495_0);
    }
    __call246_120(life38_636, ((double) life36_537), ((double) life29_471), ((double) life37_542), (__call246_119(__fieldRead246_118(p0)) * 0x1.68p8f), 0x0.0p0f);
    spill246_35 = __call246_121(life38_636);
    if (!((life7_5 == null))) {
        forestValue246_517_0 = __integerCategory246_122(spill246_35);
        break forest_join_517;
    }
    if (!(spill246_35)) {
        break forest_join_522;
    }
    forestValue246_517_0 = __integerCategory246_124(__call246_123(life38_636));
    }
    if (!((life7_5 == null))) {
        forestValue246_521_0 = forestValue246_517_0;
        break forest_join_521;
    }
    if (!((forestValue246_517_0 != 0))) {
        break forest_join_522;
    }
    forestValue246_521_0 = 1;
    }
    forestValue246_523_0 = forestValue246_521_0;
    break forest_join_523;
    }
    forestValue246_523_0 = 0;
    }
    life39_711 = forestValue246_523_0;
    spill246_36 = life39_711;
    if (!((life7_5 == null))) {
        forestValue246_567_0 = spill246_36;
        break forest_join_567;
    }
    if (!((spill246_36 != 0))) {
        break forest_join_564;
    }
    __call246_127(__fieldRead246_125(receiver), __fieldRead246_126(life32_480));
    life33_482 = __call246_129(life38_636, __call246_128(p0, new moom.DT(life38_636)), life33_482);
    spill246_37 = __call246_130(life38_636);
    if (!((life7_5 == null))) {
        forestValue246_556_0 = __integerCategory246_131(spill246_37);
        break forest_join_556;
    }
    if (!(spill246_37)) {
        break forest_join_554;
    }
    life26_461 += 1;
    __call246_132(p0, life38_636);
    }
    forestValue246_556_0 = __call246_133(life38_636);
    }
    life40_753 = forestValue246_556_0;
    spill246_38 = life26_461;
    spill246_39 = life40_753;
    if (!((life7_5 == null))) {
        forestValue246_566_0 = spill246_38;
        forestValue246_566_1 = spill246_39;
        break forest_join_566;
    }
    if (!((spill246_38 >= spill246_39))) {
        break forest_join_564;
    }
    if (!((life7_5 != null))) {
        continue forest_cycle_284;
    }
    }
    forestValue246_566_0 = life10_105;
    forestValue246_566_1 = life26_461;
    }
    forestValue246_567_0 = (forestValue246_566_0 + forestValue246_566_1);
    }
    life10_105 = forestValue246_567_0;
    }
    life34_486 += 1;
    }
    if (!((life7_5 != null))) {
        continue forest_cycle_347;
    }
    break forest_cycle_347;
    }
    break forest_cycle_325;
    }
    }
    life27_463 += 1;
    if (!((life7_5 != null))) {
        continue forest_cycle_324;
    }
    break forest_cycle_324;
    }
    break forest_cycle_286;
    }
    }
    if (!((life7_5 != null))) {
        continue forest_cycle_284;
    }
    break forest_cycle_284;
    }
    break forest_cycle_227;
    }
    }
    life15_320 += 1;
    }
    if (!((life7_5 != null))) {
        continue forest_cycle_226;
    }
    break forest_cycle_226;
    }
    }
    forestValue246_580_0 = life10_105;
    }
    return forestValue246_580_0;
}
public static int h246_0(java.lang.Exception p0) throws Throwable {
    throw __call3024600_0(p0);
}
public static int h246_1(java.lang.Exception p0) throws Throwable {
    throw __call3024601_0(p0);
}
public static int h246_2(java.lang.Exception p0) throws Throwable {
    throw __call3024602_0(p0);
}
public static int h246_3(java.lang.Exception p0) throws Throwable {
    throw __call3024603_0(p0);
}
public static int h246_4(java.lang.Exception p0) throws Throwable {
    throw __call3024604_0(p0);
}
public static int h246_5(java.lang.Exception p0) throws Throwable {
    throw __call3024605_0(p0);
}
public static int h246_6(java.lang.Exception p0) throws Throwable {
    throw __call3024606_0(p0);
}
public static int h246_7(java.lang.Exception p0) throws Throwable {
    throw __call3024607_0(p0);
}
public static int h246_8(java.lang.Exception p0) throws Throwable {
    throw __call3024608_0(p0);
}
public static int h246_9(java.lang.Exception p0) throws Throwable {
    throw __call3024609_0(p0);
}
public static int h246_10(java.lang.Exception p0) throws Throwable {
    throw __call3024610_0(p0);
}
public static int h246_11(java.lang.Exception p0) throws Throwable {
    throw __call3024611_0(p0);
}
public static int h246_12(java.lang.Exception p0) throws Throwable {
    throw __call3024612_0(p0);
}
public static int h246_13(java.lang.Exception p0) throws Throwable {
    throw __call3024613_0(p0);
}
public static int h246_14(java.lang.Exception p0) throws Throwable {
    throw __call3024614_0(p0);
}
public static int h246_15(java.lang.Exception p0) throws Throwable {
    throw __call3024615_0(p0);
}
public static int h246_16(java.lang.Exception p0) throws Throwable {
    throw __call3024616_0(p0);
}
public static int h246_17(java.lang.Exception p0) throws Throwable {
    throw __call3024617_0(p0);
}
public static int h246_18(java.lang.Exception p0) throws Throwable {
    throw __call3024618_0(p0);
}
public static int h246_19(java.lang.Exception p0) throws Throwable {
    throw __call3024619_0(p0);
}
public static int h246_20(java.lang.Exception p0) throws Throwable {
    throw __call3024620_0(p0);
}
public static int h246_21(java.lang.Exception p0) throws Throwable {
    throw __call3024621_0(p0);
}
public static int h246_22(java.lang.Exception p0) throws Throwable {
    throw __call3024622_0(p0);
}
public static int h246_23(java.lang.Exception p0) throws Throwable {
    throw __call3024623_0(p0);
}
public static int h246_24(java.lang.Exception p0) throws Throwable {
    throw __call3024624_0(p0);
}
public static int h246_25(java.lang.Exception p0) throws Throwable {
    throw __call3024625_0(p0);
}
public static int h246_26(java.lang.Exception p0) throws Throwable {
    throw __call3024626_0(p0);
}
public static int h246_27(java.lang.Exception p0) throws Throwable {
    throw __call3024627_0(p0);
}
public static int h246_28(java.lang.Exception p0) throws Throwable {
    throw __call3024628_0(p0);
}
public static int h246_29(java.lang.Exception p0) throws Throwable {
    throw __call3024629_0(p0);
}
public static int h246_30(java.lang.Exception p0) throws Throwable {
    throw __call3024630_0(p0);
}
public static int h246_31(java.lang.Exception p0) throws Throwable {
    throw __call3024631_0(p0);
}
public static int h246_32(java.lang.Exception p0) throws Throwable {
    throw __call3024632_0(p0);
}
public static int h246_33(java.lang.Exception p0) throws Throwable {
    throw __call3024633_0(p0);
}
public static int h246_34(java.lang.Exception p0) throws Throwable {
    throw __call3024634_0(p0);
}
public static int h246_35(java.lang.Exception p0) throws Throwable {
    throw __call3024635_0(p0);
}
public static int h246_36(java.lang.Exception p0) throws Throwable {
    throw __call3024636_0(p0);
}
public static int h246_37(java.lang.Exception p0) throws Throwable {
    throw __call3024637_0(p0);
}
public static int h246_38(java.lang.Exception p0) throws Throwable {
    throw __call3024638_0(p0);
}
public static int h246_39(java.lang.Exception p0) throws Throwable {
    throw __call3024639_0(p0);
}
public static int h246_40(java.lang.Exception p0) throws Throwable {
    throw __call3024640_0(p0);
}
public static int h246_41(java.lang.Exception p0) throws Throwable {
    throw __call3024641_0(p0);
}
public static int h246_42(java.lang.Exception p0) throws Throwable {
    throw __call3024642_0(p0);
}
public static int h246_43(java.lang.Exception p0) throws Throwable {
    throw __call3024643_0(p0);
}
public static int h246_44(java.lang.Exception p0) throws Throwable {
    throw __call3024644_0(p0);
}
public static int h246_45(java.lang.Exception p0) throws Throwable {
    throw __call3024645_0(p0);
}
public static int h246_46(java.lang.Exception p0) throws Throwable {
    throw __call3024646_0(p0);
}
public static int h246_47(java.lang.Exception p0) throws Throwable {
    throw __call3024647_0(p0);
}
public static int h246_48(java.lang.Exception p0) throws Throwable {
    throw __call3024648_0(p0);
}
public static int h246_49(java.lang.Exception p0) throws Throwable {
    throw __call3024649_0(p0);
}
public static int h246_50(java.lang.Exception p0) throws Throwable {
    throw __call3024650_0(p0);
}
public static int h246_51(java.lang.Exception p0) throws Throwable {
    throw __call3024651_0(p0);
}
public static int h246_52(java.lang.Exception p0) throws Throwable {
    throw __call3024652_0(p0);
}
public static int h246_53(java.lang.Exception p0) throws Throwable {
    throw __call3024653_0(p0);
}
public static int h246_54(java.lang.Exception p0) throws Throwable {
    throw __call3024654_0(p0);
}
public static int h246_55(java.lang.Exception p0) throws Throwable {
    throw __call3024655_0(p0);
}
public static int h246_56(java.lang.Exception p0) throws Throwable {
    throw __call3024656_0(p0);
}
public static int h246_57(java.lang.Exception p0) throws Throwable {
    throw __call3024657_0(p0);
}
public static int h246_58(java.lang.Exception p0, int p1, int p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3024658_0(life2_2);
    return p1;
}
public static int h246_59(java.lang.Exception p0) throws Throwable {
    throw __call3024659_0(p0);
}
public static int h246_60(java.lang.Exception p0) throws Throwable {
    throw __call3024660_0(p0);
}
public static int h246_61(java.lang.Exception p0) throws Throwable {
    throw __call3024661_0(p0);
}
public static int h246_62(java.lang.Exception p0) throws Throwable {
    throw __call3024662_0(p0);
}
public static int h246_63(java.lang.Exception p0) throws Throwable {
    throw __call3024663_0(p0);
}
public static int h246_64(java.lang.Exception p0) throws Throwable {
    throw __call3024664_0(p0);
}
public static int h246_65(java.lang.Exception p0) throws Throwable {
    throw __call3024665_0(p0);
}
public static int h246_66(java.lang.Exception p0) throws Throwable {
    throw __call3024666_0(p0);
}
private static native long __fieldRead246_0() throws Throwable;
private static native java.lang.String __call246_1() throws Throwable;
private static native int __integerCategory246_2(boolean value) throws Throwable;
private static native int __integerCategory246_3(boolean value) throws Throwable;
private static native java.util.List __fieldRead246_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call246_5(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead246_6(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.lang.Object __call246_7(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast246_8(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead246_9(moom.Es a0) throws Throwable;
private static native int __call246_10(java.util.Set a0) throws Throwable;
private static native int __fieldRead246_11(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __fieldRead246_12(moom.Es a0) throws Throwable;
private static native int __fieldRead246_13(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __fieldRead246_14(moom.Es a0) throws Throwable;
private static native java.util.Set __fieldRead246_15(moom.Es a0) throws Throwable;
private static native void __call246_16(java.util.Set a0) throws Throwable;
private static native java.util.List __fieldRead246_17(net.minecraft.world.WorldServer a0) throws Throwable;
private static native java.util.Iterator __call246_18(java.util.List a0) throws Throwable;
private static native boolean __call246_19(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory246_20(boolean value) throws Throwable;
private static native java.lang.Object __call246_21(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.player.EntityPlayer __cast246_22(java.lang.Object a0) throws Throwable;
private static native boolean __call246_23(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __integerCategory246_24(boolean value) throws Throwable;
private static native int __integerCategory246_25(boolean value) throws Throwable;
private static native double __fieldRead246_26(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call246_27(double a0) throws Throwable;
private static native double __fieldRead246_28(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native int __call246_29(double a0) throws Throwable;
private static native int __invokedynamic246_30(int a0, long a1) throws Throwable;
private static native java.util.Set __fieldRead246_31(moom.Es a0) throws Throwable;
private static native boolean __call246_32(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native net.minecraft.world.border.WorldBorder __call246_33(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call246_34(net.minecraft.world.border.WorldBorder a0, moom.Ee a1) throws Throwable;
private static native int __integerCategory246_35(boolean value) throws Throwable;
private static native java.util.Set __fieldRead246_36(moom.Es a0) throws Throwable;
private static native boolean __call246_37(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native int __integerCategory246_38(boolean value) throws Throwable;
private static native void __discardScalar246_39(int a0) throws Throwable;
private static native void __fieldWrite246_40(moom.Es a0, int a1) throws Throwable;
private static native int __fieldRead246_41(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite246_42(moom.Es a0, int a1) throws Throwable;
private static native int __fieldRead246_43(net.minecraft.entity.player.EntityPlayer a0) throws Throwable;
private static native void __fieldWrite246_44(moom.Es a0, int a1) throws Throwable;
private static native moom.DT __call246_45(net.minecraft.world.WorldServer a0) throws Throwable;
private static native net.minecraft.entity.EnumCreatureType[] __call246_46() throws Throwable;
private static native boolean __call246_47(net.minecraft.entity.EnumCreatureType a0) throws Throwable;
private static native int __integerCategory246_48(boolean value) throws Throwable;
private static native int __integerCategory246_49(boolean value) throws Throwable;
private static native int __integerCategory246_50(boolean value) throws Throwable;
private static native boolean __call246_51(net.minecraft.entity.EnumCreatureType a0) throws Throwable;
private static native int __integerCategory246_52(boolean value) throws Throwable;
private static native int __integerCategory246_53(boolean value) throws Throwable;
private static native boolean __call246_54(net.minecraft.entity.EnumCreatureType a0) throws Throwable;
private static native int __integerCategory246_55(boolean value) throws Throwable;
private static native int __integerCategory246_56(boolean value) throws Throwable;
private static native java.lang.Class __call246_57(net.minecraft.entity.EnumCreatureType a0) throws Throwable;
private static native int __call246_58(net.minecraft.world.WorldServer a0, java.lang.Class a1) throws Throwable;
private static native int __call246_59(net.minecraft.entity.EnumCreatureType a0) throws Throwable;
private static native int __fieldRead246_60(moom.Es a0) throws Throwable;
private static native int __fieldRead246_61() throws Throwable;
private static native java.util.Set __fieldRead246_62(moom.Es a0) throws Throwable;
private static native java.util.Iterator __call246_63(java.util.Set a0) throws Throwable;
private static native boolean __call246_64(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory246_65(boolean value) throws Throwable;
private static native java.lang.Object __call246_66(java.util.Iterator a0) throws Throwable;
private static native moom.Ee __cast246_67(java.lang.Object a0) throws Throwable;
private static native int __fieldRead246_68(moom.Ee a0) throws Throwable;
private static native int __fieldRead246_69(moom.Ee a0) throws Throwable;
private static native moom.DX __call246_70(net.minecraft.world.WorldServer a0, int a1, int a2, moom.DX a3) throws Throwable;
private static native int __call246_71(moom.DX a0) throws Throwable;
private static native int __call246_72(moom.DX a0) throws Throwable;
private static native int __call246_73(moom.DX a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call246_74(net.minecraft.world.WorldServer a0, moom.DX a1) throws Throwable;
private static native net.minecraft.block.Block __call246_75(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native boolean __call246_76(net.minecraft.block.Block a0) throws Throwable;
private static native int __integerCategory246_77(boolean value) throws Throwable;
private static native int __integerCategory246_78(boolean value) throws Throwable;
private static native int __invokedynamic246_79(int a0, long a1) throws Throwable;
private static native java.util.Random __fieldRead246_80(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call246_81(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead246_82(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call246_83(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead246_84(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call246_85(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead246_86(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call246_87(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead246_88(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call246_89(java.util.Random a0, int a1) throws Throwable;
private static native java.util.Random __fieldRead246_90(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __call246_91(java.util.Random a0, int a1) throws Throwable;
private static native boolean __call246_92(net.minecraft.world.WorldServer a0, double a1, double a2, double a3, double a4) throws Throwable;
private static native int __integerCategory246_93(boolean value) throws Throwable;
private static native double __call246_94(moom.DT a0, double a1, double a2, double a3) throws Throwable;
private static native int __numericCompare246_95(double a0, double a1) throws Throwable;
private static native moom.D7 __call246_96(net.minecraft.world.WorldServer a0, net.minecraft.entity.EnumCreatureType a1, moom.DT a2) throws Throwable;
private static native boolean __call246_97(net.minecraft.world.WorldServer a0, net.minecraft.entity.EnumCreatureType a1, moom.D7 a2, moom.DT a3) throws Throwable;
private static native int __integerCategory246_98(boolean value) throws Throwable;
private static native java.lang.Class __fieldRead246_99(moom.D7 a0) throws Throwable;
private static native net.minecraft.entity.EntityLiving$SpawnPlacementType __call246_100(java.lang.Class a0) throws Throwable;
private static native boolean __call246_101(net.minecraft.entity.EntityLiving$SpawnPlacementType a0, net.minecraft.world.WorldServer a1, moom.DT a2) throws Throwable;
private static native int __integerCategory246_102(boolean value) throws Throwable;
private static native java.util.Map __fieldRead246_103(moom.Es a0) throws Throwable;
private static native java.lang.Class __fieldRead246_104(moom.D7 a0) throws Throwable;
private static native java.lang.Object __call246_105(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast246_106(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __fieldRead246_107(moom.D7 a0) throws Throwable;
private static native java.lang.Class __classLiteral246_109() throws Throwable;
private static native java.lang.reflect.Constructor __call246_110(java.lang.Class a0, java.lang.Class[] a1) throws Throwable;
private static native java.lang.Object __call246_112(java.lang.reflect.Constructor a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.entity.EntityLiving __cast246_113(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead246_114(moom.Es a0) throws Throwable;
private static native java.lang.Class __fieldRead246_115(moom.D7 a0) throws Throwable;
private static native java.lang.Object __call246_116(java.util.Map a0, java.lang.Class a1, net.minecraft.entity.EntityLiving a2) throws Throwable;
private static native void __discardScalar246_117(java.lang.Object a0) throws Throwable;
private static native java.util.Random __fieldRead246_118(net.minecraft.world.WorldServer a0) throws Throwable;
private static native float __call246_119(java.util.Random a0) throws Throwable;
private static native void __call246_120(net.minecraft.entity.EntityLiving a0, double a1, double a2, double a3, float a4, float a5) throws Throwable;
private static native boolean __call246_121(net.minecraft.entity.EntityLiving a0) throws Throwable;
private static native int __integerCategory246_122(boolean value) throws Throwable;
private static native boolean __call246_123(net.minecraft.entity.EntityLiving a0) throws Throwable;
private static native int __integerCategory246_124(boolean value) throws Throwable;
private static native java.util.Map __fieldRead246_125(moom.Es a0) throws Throwable;
private static native java.lang.Class __fieldRead246_126(moom.D7 a0) throws Throwable;
private static native java.lang.Object __call246_127(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native moom.Eh __call246_128(net.minecraft.world.WorldServer a0, moom.DT a1) throws Throwable;
private static native net.minecraft.entity.IEntityLivingData __call246_129(net.minecraft.entity.EntityLiving a0, moom.Eh a1, net.minecraft.entity.IEntityLivingData a2) throws Throwable;
private static native boolean __call246_130(net.minecraft.entity.EntityLiving a0) throws Throwable;
private static native int __integerCategory246_131(boolean value) throws Throwable;
private static native boolean __call246_132(net.minecraft.world.WorldServer a0, net.minecraft.entity.EntityLiving a1) throws Throwable;
private static native int __call246_133(net.minecraft.entity.EntityLiving a0) throws Throwable;
private static native java.lang.Exception __call3024600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024601_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024602_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024603_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024604_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024605_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024606_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024607_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024608_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024609_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024610_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024611_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024612_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024613_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024614_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024615_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024616_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024617_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024618_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024619_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024620_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024621_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024622_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024623_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024624_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024625_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024626_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024627_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024628_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024629_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024630_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024631_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024632_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024633_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024634_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024635_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024636_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024637_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024638_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024639_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024640_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024641_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024642_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024643_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024644_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024645_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024646_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024647_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024648_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024649_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024650_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024651_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024652_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024653_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024654_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024655_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024656_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024657_0(java.lang.Exception a0) throws Throwable;
private static native void __call3024658_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024659_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024660_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024661_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024662_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024663_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024664_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024665_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3024666_0(java.lang.Exception a0) throws Throwable;

}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22217;
      if (i[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = h[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Es", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4390_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Es"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Es.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a(net.minecraft.world.WorldServer p0, boolean p1, boolean p2, boolean p3) { return __sourceHandlerCall_029d4f0008aa3bdc89f0(this, p0, p1, p2, p3); }


private static moom.DT a(net.minecraft.world.World p0, int p1, int p2) { return __sourceHandlerCall_1418859d8e2faef161e8(p0, p1, p2); }


private static moom.DX a(net.minecraft.world.World p0, int p1, int p2, moom.DX p3) { return __sourceHandlerCall_2d4c7980d618f088bb6e(p0, p1, p2, p3); }


public static boolean a(net.minecraft.entity.EntityLiving$SpawnPlacementType p0, net.minecraft.world.World p1, moom.DT p2) { return __sourceHandlerCall_04547b6c98f8f4e52837(p0, p1, p2); }


public static void a(net.minecraft.world.World p0, net.minecraft.world.biome.BiomeGenBase p1, int p2, int p3, int p4, int p5, java.util.Random p6) { __sourceHandlerCall_48e7c49f38be1648860c(p0, p1, p2, p3, p4, p5, p6); }


private static native <E extends Throwable> int __sourceIntrinsic_25f1ed2646cd9e67_originalDynamicSite1978_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_25f1ed2646cd9e67_originalDynamicSite1978_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4390_0() throws E;
}
