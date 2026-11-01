package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cr extends moom.co {

public static moom.fw<net.minecraft.util.EnumFacing$Axis> R;

private static long T;

private static long[] U;

private static java.lang.Integer[] V;

private static java.util.Map W;

public cr() {
super(moom.fn.E, false);
    (this).a__Void(((this.M).a__fE()).a__fE(moom.cr.R, net.minecraft.util.EnumFacing$Axis.X));
    (this).a(true);
}


static {
T = ((long)(__sourceExactCall_93409fc8361486(((moom._a)(__sourceExactCall_41bab94bc4b1bd(((long)(6253997683403476597L)), ((long)(-3110345331345289764L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))), ((long)(259865713539077L)))));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cr.T ^ 130667352456173L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill798_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill798_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill798_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill798_14 = new byte[8];
    (__sourceSpill798_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill798_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation798_16 = __sourceSpill798_14;
    ((javax.crypto.Cipher)(__sourceSpill798_11)).init(((int)(__sourceSpill798_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill798_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation798_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "óôìsï[\022ïä×ª\021û9N!êé,"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill798_25 = local6_life21;
        int __sourceSpill798_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill798_25)).substring(((int)(__sourceSpill798_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill798_30 = local8_life19;
        int __sourceSpill798_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill798_33 = new byte[8];
        (__sourceSpill798_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill798_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill798_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill798_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill798_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill798_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill798_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill798_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill798_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill798_34)).doFinal(((byte[])(__sourceSpill798_33)));
        (__sourceSpill798_30)[__sourceSpill798_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    U = ((long[])(local8_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[3]));
    java.lang.String __sourceSpill798_41 = "axis";
    java.lang.Class __sourceSpill798_42 = net.minecraft.util.EnumFacing$Axis.class;
    net.minecraft.util.EnumFacing$Axis[] __sourceSpill798_43 = new net.minecraft.util.EnumFacing$Axis[2];
    (__sourceSpill798_43)[0] = net.minecraft.util.EnumFacing$Axis.X;
    (__sourceSpill798_43)[1] = net.minecraft.util.EnumFacing$Axis.Z;
    R = ((moom.fw)(__sourceExactCall_0bc9d0673d1b78(((java.lang.String)(__sourceSpill798_41)), ((java.lang.Class)(__sourceSpill798_42)), ((java.lang.Enum[])(__sourceSpill798_43)))));
}

private static native <E extends Throwable> moom.fH __sourceHandlerCall_2eba770193077ef2ac9f(moom.cr a0, net.minecraft.world.World a1, moom.DT a2) throws E;
private static final class __SourceHandler_2eba770193077ef2ac9f {

public static moom.fH f300099(moom.cr receiver, net.minecraft.world.World p0, moom.DT p1) throws Throwable {
    int forestValue300099_35_0;
    int forestValue300099_51_0;
    int forestValue300099_73_0;
    moom.fH forestValue300099_89_0;
    moom.fH forestValue300099_89_1;
    moom.fH forestValue300099_97_0;
    moom.fH forestValue300099_97_1;
    moom.DT forestValue300099_97_2;
    net.minecraft.util.EnumFacing$AxisDirection forestValue300099_160_0;
    moom.fH forestValue300099_199_0;
    moom.fH forestValue300099_199_1;
    moom.fH forestValue300099_207_0;
    moom.fH forestValue300099_207_1;
    moom.DT forestValue300099_207_2;
    int[] spill300099_0;
    moom.e4 spill300099_1;
    boolean spill300099_2;
    moom.e4 spill300099_3;
    moom.fH spill300099_4;
    net.minecraft.util.EnumFacing$AxisDirection spill300099_5;
    moom.fH spill300099_6;
    moom.fH spill300099_7;
    int spill300099_8;
    moom.fH spill300099_9;
    moom.fH spill300099_10;
    long life3_3;
    net.minecraft.util.EnumFacing$Axis life6_6;
    moom.e4 life7_13;
    int[] life5_14;
    com.google.common.cache.LoadingCache life8_18;
    int[] life9_60;
    moom.bs life10_64;
    moom.DT life11_72;
    net.minecraft.util.EnumFacing$AxisDirection[] life12_74;
    int life13_77;
    int life14_79;
    net.minecraft.util.EnumFacing$AxisDirection life15_88;
    moom.fH life16_118;
    int life17_120;
    int life18_128;
    moom.fD life19_138;
    net.minecraft.util.EnumFacing$AxisDirection life12_182;
    net.minecraft.util.EnumFacing$AxisDirection[] life13_184;
    int life14_187;
    int life15_189;
    net.minecraft.util.EnumFacing$AxisDirection life16_196;
    forest_join_207: {
    forest_join_199: {
    forest_join_191: {
    forest_join_160: {
    forest_join_159: {
    forest_join_51: {
    forest_join_49: {
    forest_join_35: {
    forest_join_33: {
    life3_3 = (__fieldRead300099_0() ^ 109538526257174L);
    spill300099_0 = __call300099_1();
    life6_6 = __fieldRead300099_2();
    moom.e4 __stackOp300099_4_0 = __sourceUninitializedNEW300099_3();
    spill300099_1 = __stackOp300099_4_0;
    __explicitNewInit300099_6(__stackOp300099_4_0, p0, p1, __fieldRead300099_5());
    life7_13 = spill300099_1;
    life5_14 = spill300099_0;
    life8_18 = __call300099_7(p0, 1);
    spill300099_2 = __call300099_8(life7_13);
    if (!((life5_14 != null))) {
        forestValue300099_35_0 = __integerCategory300099_9(spill300099_2);
        break forest_join_35;
    }
    if (!((!spill300099_2))) {
        break forest_join_33;
    }
    life6_6 = __fieldRead300099_10();
    moom.e4 __stackOp300099_12_0 = __sourceUninitializedNEW300099_11();
    spill300099_3 = __stackOp300099_12_0;
    __explicitNewInit300099_14(__stackOp300099_12_0, p0, p1, __fieldRead300099_13());
    life7_13 = spill300099_3;
    }
    forestValue300099_35_0 = __integerCategory300099_16(__call300099_15(life7_13));
    }
    if (!((life5_14 != null))) {
        forestValue300099_51_0 = forestValue300099_35_0;
        break forest_join_51;
    }
    if (!((forestValue300099_35_0 == 0))) {
        break forest_join_49;
    }
    moom.fH __stackOp300099_18_0 = __sourceUninitializedNEW300099_17();
    spill300099_4 = __stackOp300099_18_0;
    __explicitNewInit300099_21(__stackOp300099_18_0, p1, __fieldRead300099_19(), __fieldRead300099_20(), life8_18, 1, 1, 1);
    return spill300099_4;
    }
    forestValue300099_51_0 = (__call300099_22()).length;
    }
    life9_60 = new int[forestValue300099_51_0];
    life10_64 = __call300099_24(__fieldRead300099_23(life7_13));
    life11_72 = __call300099_27(__fieldRead300099_25(life7_13), (__call300099_26(life7_13) - 1));
    life12_74 = __call300099_28();
    life13_77 = (life12_74).length;
    life14_79 = 0;
    forest_cycle_72: while (true) {
    forest_join_156: {
    forestValue300099_73_0 = life14_79;
    forest_cycle_73: while (true) {
    forest_join_97: {
    forest_join_89: {
    if (!((forestValue300099_73_0 < life13_77))) {
        break forest_join_159;
    }
    spill300099_5 = (life12_74)[life14_79];
    if (!((life5_14 != null))) {
        forestValue300099_160_0 = spill300099_5;
        break forest_join_160;
    }
    life15_88 = spill300099_5;
    moom.fH __stackOp300099_30_0 = __sourceUninitializedNEW300099_29();
    spill300099_6 = __stackOp300099_30_0;
    spill300099_7 = __stackOp300099_30_0;
    if (!((__call300099_31(life10_64) == life15_88))) {
        forestValue300099_89_0 = spill300099_6;
        forestValue300099_89_1 = spill300099_7;
        break forest_join_89;
    }
    forestValue300099_97_0 = spill300099_6;
    forestValue300099_97_1 = spill300099_7;
    forestValue300099_97_2 = life11_72;
    break forest_join_97;
    }
    forestValue300099_97_0 = forestValue300099_89_0;
    forestValue300099_97_1 = forestValue300099_89_1;
    forestValue300099_97_2 = __call300099_34(life11_72, __fieldRead300099_32(life7_13), (__call300099_33(life7_13) - 1));
    }
    __explicitNewInit300099_39(forestValue300099_97_1, forestValue300099_97_2, __call300099_35(life15_88, life6_6), __fieldRead300099_36(), life8_18, __call300099_37(life7_13), __call300099_38(life7_13), 1);
    life16_118 = forestValue300099_97_0;
    life17_120 = 0;
    forest_cycle_111: while (true) {
    forest_join_154: {
    forest_join_153: {
    if (!((life17_120 < __call300099_40(life7_13)))) {
        break forest_join_156;
    }
    spill300099_8 = 0;
    if (!((life5_14 != null))) {
        forestValue300099_73_0 = spill300099_8;
        continue forest_cycle_73;
    }
    life18_128 = spill300099_8;
    forest_cycle_119: while (true) {
    forest_join_151: {
    forest_join_150: {
    if (!((life18_128 < __call300099_41(life7_13)))) {
        break forest_join_153;
    }
    life19_138 = __call300099_42(life16_118, life17_120, life18_128, 1);
    if (!((life5_14 != null))) {
        break forest_join_154;
    }
    if (!((life5_14 != null))) {
        break forest_join_151;
    }
    if (!((__call300099_43(life19_138) != null))) {
        break forest_join_150;
    }
    if (!((__call300099_46(__call300099_45(__call300099_44(life19_138))) != __fieldRead300099_47()))) {
        break forest_join_150;
    }
    int[] __stackOp300099_49_0 = life9_60;
    int __stackOp300099_49_1 = __call300099_48(life15_88);
    (__stackOp300099_49_0)[__stackOp300099_49_1] = ((__stackOp300099_49_0)[__stackOp300099_49_1] + 1);
    }
    life18_128 += 1;
    }
    if (!((life5_14 == null))) {
        continue forest_cycle_119;
    }
    break forest_cycle_119;
    }
    }
    life17_120 += 1;
    }
    if (!((life5_14 == null))) {
        continue forest_cycle_111;
    }
    break forest_cycle_111;
    }
    break forest_cycle_73;
    }
    }
    life14_79 += 1;
    if (!((life5_14 == null))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    }
    forestValue300099_160_0 = __fieldRead300099_50();
    }
    life12_182 = forestValue300099_160_0;
    life13_184 = __call300099_51();
    life14_187 = (life13_184).length;
    life15_189 = 0;
    forest_cycle_168: while (true) {
    forest_join_189: {
    forest_join_188: {
    if (!((life15_189 < life14_187))) {
        break forest_join_191;
    }
    life16_196 = (life13_184)[life15_189];
    if (!((life5_14 != null))) {
        break forest_join_189;
    }
    if (!(((life9_60)[__call300099_52(life16_196)] < (life9_60)[__call300099_53(life12_182)]))) {
        break forest_join_188;
    }
    life12_182 = life16_196;
    }
    life15_189 += 1;
    }
    if (!((life5_14 == null))) {
        continue forest_cycle_168;
    }
    break forest_cycle_168;
    }
    }
    moom.fH __stackOp300099_55_0 = __sourceUninitializedNEW300099_54();
    spill300099_9 = __stackOp300099_55_0;
    spill300099_10 = __stackOp300099_55_0;
    if (!((__call300099_56(life10_64) == life12_182))) {
        forestValue300099_199_0 = spill300099_9;
        forestValue300099_199_1 = spill300099_10;
        break forest_join_199;
    }
    forestValue300099_207_0 = spill300099_9;
    forestValue300099_207_1 = spill300099_10;
    forestValue300099_207_2 = life11_72;
    break forest_join_207;
    }
    forestValue300099_207_0 = forestValue300099_199_0;
    forestValue300099_207_1 = forestValue300099_199_1;
    forestValue300099_207_2 = __call300099_59(life11_72, __fieldRead300099_57(life7_13), (__call300099_58(life7_13) - 1));
    }
    __explicitNewInit300099_64(forestValue300099_207_1, forestValue300099_207_2, __call300099_60(life12_182, life6_6), __fieldRead300099_61(), life8_18, __call300099_62(life7_13), __call300099_63(life7_13), 1);
    return forestValue300099_207_0;
}
private static native long __fieldRead300099_0() throws Throwable;
private static native int[] __call300099_1() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead300099_2() throws Throwable;
private static native moom.e4 __sourceUninitializedNEW300099_3() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead300099_5() throws Throwable;
private static native void __explicitNewInit300099_6(moom.e4 a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.util.EnumFacing$Axis a3) throws Throwable;
private static native com.google.common.cache.LoadingCache __call300099_7(net.minecraft.world.World a0, int a1) throws Throwable;
private static native boolean __call300099_8(moom.e4 a0) throws Throwable;
private static native int __integerCategory300099_9(boolean value) throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead300099_10() throws Throwable;
private static native moom.e4 __sourceUninitializedNEW300099_11() throws Throwable;
private static native net.minecraft.util.EnumFacing$Axis __fieldRead300099_13() throws Throwable;
private static native void __explicitNewInit300099_14(moom.e4 a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.util.EnumFacing$Axis a3) throws Throwable;
private static native boolean __call300099_15(moom.e4 a0) throws Throwable;
private static native int __integerCategory300099_16(boolean value) throws Throwable;
private static native moom.fH __sourceUninitializedNEW300099_17() throws Throwable;
private static native moom.bs __fieldRead300099_19() throws Throwable;
private static native moom.bs __fieldRead300099_20() throws Throwable;
private static native void __explicitNewInit300099_21(moom.fH a0, moom.DT a1, moom.bs a2, moom.bs a3, com.google.common.cache.LoadingCache a4, int a5, int a6, int a7) throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection[] __call300099_22() throws Throwable;
private static native moom.bs __fieldRead300099_23(moom.e4 a0) throws Throwable;
private static native moom.bs __call300099_24(moom.bs a0) throws Throwable;
private static native moom.DT __fieldRead300099_25(moom.e4 a0) throws Throwable;
private static native int __call300099_26(moom.e4 a0) throws Throwable;
private static native moom.DT __call300099_27(moom.DT a0, int a1) throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection[] __call300099_28() throws Throwable;
private static native moom.fH __sourceUninitializedNEW300099_29() throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection __call300099_31(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead300099_32(moom.e4 a0) throws Throwable;
private static native int __call300099_33(moom.e4 a0) throws Throwable;
private static native moom.DT __call300099_34(moom.DT a0, moom.bs a1, int a2) throws Throwable;
private static native moom.bs __call300099_35(net.minecraft.util.EnumFacing$AxisDirection a0, net.minecraft.util.EnumFacing$Axis a1) throws Throwable;
private static native moom.bs __fieldRead300099_36() throws Throwable;
private static native int __call300099_37(moom.e4 a0) throws Throwable;
private static native int __call300099_38(moom.e4 a0) throws Throwable;
private static native void __explicitNewInit300099_39(moom.fH a0, moom.DT a1, moom.bs a2, moom.bs a3, com.google.common.cache.LoadingCache a4, int a5, int a6, int a7) throws Throwable;
private static native int __call300099_40(moom.e4 a0) throws Throwable;
private static native int __call300099_41(moom.e4 a0) throws Throwable;
private static native moom.fD __call300099_42(moom.fH a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call300099_43(moom.fD a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call300099_44(moom.fD a0) throws Throwable;
private static native net.minecraft.block.Block __call300099_45(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call300099_46(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead300099_47() throws Throwable;
private static native int __call300099_48(net.minecraft.util.EnumFacing$AxisDirection a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection __fieldRead300099_50() throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection[] __call300099_51() throws Throwable;
private static native int __call300099_52(net.minecraft.util.EnumFacing$AxisDirection a0) throws Throwable;
private static native int __call300099_53(net.minecraft.util.EnumFacing$AxisDirection a0) throws Throwable;
private static native moom.fH __sourceUninitializedNEW300099_54() throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection __call300099_56(moom.bs a0) throws Throwable;
private static native moom.bs __fieldRead300099_57(moom.e4 a0) throws Throwable;
private static native int __call300099_58(moom.e4 a0) throws Throwable;
private static native moom.DT __call300099_59(moom.DT a0, moom.bs a1, int a2) throws Throwable;
private static native moom.bs __call300099_60(net.minecraft.util.EnumFacing$AxisDirection a0, net.minecraft.util.EnumFacing$Axis a1) throws Throwable;
private static native moom.bs __fieldRead300099_61() throws Throwable;
private static native int __call300099_62(moom.e4 a0) throws Throwable;
private static native int __call300099_63(moom.e4 a0) throws Throwable;
private static native void __explicitNewInit300099_64(moom.fH a0, moom.DT a1, moom.bs a2, moom.bs a3, com.google.common.cache.LoadingCache a4, int a5, int a6, int a7) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7162_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.cr.T ^ 21841695901162L);
    return ((net.minecraft.block.state.IBlockState)(((moom.cr)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cr.R)), ((java.lang.Comparable)((((p0 & 3) == 2) ? net.minecraft.util.EnumFacing$Axis.Z : net.minecraft.util.EnumFacing$Axis.X))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
return __sourceExactCall_3bb34434eece33(((net.minecraft.util.EnumFacing$Axis)(((net.minecraft.util.EnumFacing$Axis)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cr.R))))))));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_f809863017e253(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 32016;
      if (V[var3] == null) {
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
         long var5 = U[var3];
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
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/cr", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1087_22_0;
    int lexicalValue1087_32_0;
    int lexicalValue1087_40_0;
    int lexicalValue1087_60_0;
    int lexicalValue1087_71_0;
    net.minecraft.world.World lexicalValue1087_73_0;
    net.minecraft.entity.Entity lexicalValue1087_100_0;
    int[] spill1087_0;
    boolean spill1087_1;
    int spill1087_2;
    net.minecraft.world.World spill1087_3;
    net.minecraft.entity.Entity spill1087_4;
    long life5_3;
    int[] life7_11;
    int life8_58;
    moom.DT life9_60;
    net.minecraft.entity.Entity life10_127;
    lexical_join_103: {
    lexical_join_100: {
    lexical_join_73: {
    lexical_join_71: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_40: {
    lexical_join_32: {
    lexical_join_22: {
    life5_3 = (moom.cr.T ^ 67261964085053L);
    spill1087_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    super.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    life7_11 = spill1087_0;
    spill1087_1 = ((moom.EA)(((net.minecraft.world.World)(p0)).v)).a__Boolean();
    if (!((life7_11 != null))) {
        lexicalValue1087_22_0 = ((spill1087_1) ? 1 : 0);
        break lexical_join_22;
    }
    if (!(spill1087_1)) {
        break lexical_join_103;
    }
    lexicalValue1087_22_0 = ((((net.minecraft.world.GameRules)(((net.minecraft.world.World)(p0)).a__Ej())).a__Boolean(((java.lang.String)("doMobSpawning")))) ? 1 : 0);
    }
    if (!((life7_11 != null))) {
        lexicalValue1087_32_0 = lexicalValue1087_22_0;
        break lexical_join_32;
    }
    if (!((lexicalValue1087_22_0 != 0))) {
        break lexical_join_103;
    }
    lexicalValue1087_32_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic1087_9(28064, (5112262800535656874L ^ life5_3)))));
    }
    if (!((life7_11 != null))) {
        lexicalValue1087_40_0 = lexicalValue1087_32_0;
        break lexical_join_40;
    }
    if (!((lexicalValue1087_32_0 < ((net.minecraft.world.EnumDifficulty)(((net.minecraft.world.World)(p0)).a__bB())).a()))) {
        break lexical_join_103;
    }
    lexicalValue1087_40_0 = __sourceExactCall_83272ff1cb0754(((moom.DT)(p1)));
    }
    life8_58 = lexicalValue1087_40_0;
    life9_60 = p1;
    lexical_cycle_43: while (true) {
    if (!((!__sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(life9_60)))))) {
        break lexical_join_59;
    }
    spill1087_2 = ((moom.DT)(life9_60)).b();
    if (!((life7_11 != null))) {
        lexicalValue1087_60_0 = spill1087_2;
        break lexical_join_60;
    }
    if (!((life7_11 != null))) {
        lexicalValue1087_60_0 = spill1087_2;
        break lexical_join_60;
    }
    if (!((spill1087_2 > 0))) {
        break lexical_join_59;
    }
    life9_60 = ((moom.DT)(life9_60)).b__DT();
    if (!((life7_11 == null))) { continue lexical_cycle_43; }
    break lexical_cycle_43;
    }
    }
    lexicalValue1087_60_0 = life8_58;
    }
    if (!((life7_11 != null))) {
        lexicalValue1087_71_0 = lexicalValue1087_60_0;
        break lexical_join_71;
    }
    if (!((lexicalValue1087_60_0 > 0))) {
        break lexical_join_103;
    }
    spill1087_3 = p0;
    if (!((life7_11 != null))) {
        lexicalValue1087_73_0 = spill1087_3;
        break lexical_join_73;
    }
    lexicalValue1087_71_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1087_3)).a__fE(((moom.DT)(((moom.DT)(life9_60)).a__DT()))))).a__ch())).e__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue1087_71_0 == 0))) {
        break lexical_join_103;
    }
    lexicalValue1087_73_0 = p0;
    }
    life10_127 = __sourceExactCall_de0a459018a45f(((net.minecraft.world.World)(lexicalValue1087_73_0)), ((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic1087_22(5784, (1497739550069678737L ^ life5_3)))), ((double)((((double) ((moom.DT)(life9_60)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(life9_60)).b()) + 0x1.199999999999ap0d))), ((double)((((double) ((moom.DT)(life9_60)).c()) + 0x1.0p-1d))));
    spill1087_4 = life10_127;
    if (!((life7_11 != null))) {
        lexicalValue1087_100_0 = spill1087_4;
        break lexical_join_100;
    }
    if (!((spill1087_4 != null))) {
        break lexical_join_103;
    }
    lexicalValue1087_100_0 = life10_127;
    }
    ((net.minecraft.entity.Entity)(lexicalValue1087_100_0)).ae = ((int)(((net.minecraft.entity.Entity)(life10_127)).g()));
    }
    return;
}


public boolean c(net.minecraft.world.World p0, moom.DT p1) {
moom.e4 forwardValue3144_33_0;
    int forwardValue3144_49_0;
    int[] spill3144_0;
    moom.e4 spill3144_1;
    moom.e4 spill3144_2;
    boolean spill3144_3;
    int spill3144_4;
    long life3_3;
    moom.e4 life6_11;
    int[] life5_12;
    moom.e4 life7_44;
    forward_join_49: {
    forward_join_48: {
    forward_join_33: {
    forward_join_27: {
    life3_3 = (moom.cr.T ^ 57944468616498L);
    spill3144_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_11 = new moom.e4(p0, p1, net.minecraft.util.EnumFacing$Axis.X);
    life5_12 = spill3144_0;
    spill3144_1 = life6_11;
    if (!((life5_12 != null))) {
        forwardValue3144_33_0 = spill3144_1;
        break forward_join_33;
    }
    if (!(((moom.e4)(spill3144_1)).a__Boolean())) {
        break forward_join_27;
    }
    spill3144_2 = life6_11;
    if (!((life5_12 != null))) {
        forwardValue3144_33_0 = spill3144_2;
        break forward_join_33;
    }
    if (!((((moom.e4)(spill3144_2)).e == 0))) {
        break forward_join_27;
    }
    ((moom.e4)(life6_11)).a__Void();
    return ((1) != 0);
    }
    forwardValue3144_33_0 = new moom.e4(p0, p1, net.minecraft.util.EnumFacing$Axis.Z);
    }
    life7_44 = forwardValue3144_33_0;
    spill3144_3 = ((moom.e4)(life7_44)).a__Boolean();
    if (!((life5_12 != null))) {
        forwardValue3144_49_0 = ((spill3144_3) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill3144_3)) {
        break forward_join_48;
    }
    spill3144_4 = ((moom.e4)(life7_44)).e;
    if (!((life5_12 != null))) {
        forwardValue3144_49_0 = spill3144_4;
        break forward_join_49;
    }
    if (!((spill3144_4 == 0))) {
        break forward_join_48;
    }
    ((moom.e4)(life7_44)).a__Void();
    return ((1) != 0);
    }
    forwardValue3144_49_0 = 0;
    }
    return ((forwardValue3144_49_0) != 0);
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int lexicalValue1088_43_0;
    int spill1088_0;
    long life5_3;
    int[] life7_5;
    int life8_49;
    double life9_60;
    double life11_68;
    double life13_76;
    double life15_84;
    double life17_92;
    double life19_100;
    int life21_108;
    lexical_join_175: {
    lexical_join_43: {
    lexical_join_42: {
    life5_3 = (moom.cr.T ^ 127854886654301L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill1088_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_79fa39d0e3aa_invokedynamic1088_2(25311, (8215645512925831348L ^ life5_3)))));
    if (!((life7_5 != null))) {
        lexicalValue1088_43_0 = spill1088_0;
        break lexical_join_43;
    }
    if (!((spill1088_0 == 0))) {
        break lexical_join_42;
    }
    ((net.minecraft.world.World)(p0)).a(((double)((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).b()) + 0x1.0p-1d))), ((double)((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d))), ((java.lang.String)("portal.portal")), ((float)(0x1.0p-1f)), ((float)(((((java.util.Random)(p3)).nextFloat() * 0x1.99999ap-2f) + 0x1.99999ap-1f))), ((boolean)(false)));
    }
    lexicalValue1088_43_0 = 0;
    }
    life8_49 = lexicalValue1088_43_0;
    lexical_cycle_44: while (true) {
    lexical_join_161: {
    lexical_join_152: {
    lexical_join_141: {
    if (!((life8_49 < 4))) {
        break lexical_join_175;
    }
    life9_60 = ((double) (((float) ((moom.DT)(p1)).a()) + ((java.util.Random)(p3)).nextFloat()));
    life11_68 = ((double) (((float) ((moom.DT)(p1)).b()) + ((java.util.Random)(p3)).nextFloat()));
    life13_76 = ((double) (((float) ((moom.DT)(p1)).c()) + ((java.util.Random)(p3)).nextFloat()));
    life15_84 = ((((double) ((java.util.Random)(p3)).nextFloat()) - 0x1.0p-1d) * 0x1.0p-1d);
    life17_92 = ((((double) ((java.util.Random)(p3)).nextFloat()) - 0x1.0p-1d) * 0x1.0p-1d);
    life19_100 = ((((double) ((java.util.Random)(p3)).nextFloat()) - 0x1.0p-1d) * 0x1.0p-1d);
    life21_108 = ((((java.util.Random)(p3)).nextInt(((int)(2))) * 2) - 1);
    if (!((life7_5 != null))) {
        break lexical_join_152;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch() != this))) {
        break lexical_join_141;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch() != this))) {
        break lexical_join_141;
    }
    life9_60 = ((((double) ((moom.DT)(p1)).a()) + 0x1.0p-1d) + (0x1.0p-2d * ((double) life21_108)));
    life15_84 = ((double) ((((java.util.Random)(p3)).nextFloat() * 0x1.0p1f) * ((float) life21_108)));
    if (!((life7_5 == null))) {
        break lexical_join_161;
    }
    }
    life13_76 = ((((double) ((moom.DT)(p1)).c()) + 0x1.0p-1d) + (0x1.0p-2d * ((double) life21_108)));
    }
    life19_100 = ((double) ((((java.util.Random)(p3)).nextFloat() * 0x1.0p1f) * ((float) life21_108)));
    }
    ((net.minecraft.world.World)(p0)).a(((net.minecraft.util.EnumParticleTypes)(net.minecraft.util.EnumParticleTypes.PORTAL)), ((double)(life9_60)), ((double)(life11_68)), ((double)(life13_76)), ((double)(life15_84)), ((double)(life17_92)), ((double)(life19_100)), ((int[])(new int[0])));
    life8_49 += 1;
    if (!((life7_5 == null))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    return;
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cr.R});
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public moom.fH a__sourceReturn_2b3255b4c3(net.minecraft.world.World p0, moom.DT p1) { return __sourceHandlerCall_2eba770193077ef2ac9f(this, p0, p1); }


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
net.minecraft.util.EnumFacing$Axis forwardValue3142_26_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3142_26_1;
    int[] spill3142_0;
    net.minecraft.util.EnumFacing$Axis spill3142_1;
    net.minecraft.util.EnumFacing$Axis spill3142_2;
    long life3_3;
    net.minecraft.util.EnumFacing$Axis life6_10;
    float life7_13;
    int[] life5_14;
    float life8_16;
    forward_join_29: {
    forward_join_26: {
    forward_join_24: {
    life3_3 = (moom.cr.T ^ 30001960226149L);
    life6_10 = ((net.minecraft.util.EnumFacing$Axis)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.cr.R)))));
    spill3142_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_13 = 0x1.0p-3f;
    life5_14 = spill3142_0;
    life8_16 = 0x1.0p-3f;
    spill3142_1 = life6_10;
    spill3142_2 = net.minecraft.util.EnumFacing$Axis.X;
    if (!((life5_14 != null))) {
        forwardValue3142_26_0 = spill3142_1;
        forwardValue3142_26_1 = spill3142_2;
        break forward_join_26;
    }
    if (!((spill3142_1 == spill3142_2))) {
        break forward_join_24;
    }
    life7_13 = 0x1.0p-1f;
    }
    forwardValue3142_26_0 = life6_10;
    forwardValue3142_26_1 = net.minecraft.util.EnumFacing$Axis.Z;
    }
    if (!((forwardValue3142_26_0 == forwardValue3142_26_1))) {
        break forward_join_29;
    }
    life8_16 = 0x1.0p-1f;
    }
    ((moom.cr)(this)).a(((float)((0x1.0p-1f - life7_13))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - life8_16))), ((float)((0x1.0p-1f + life7_13))), ((float)(0x1.0p0f)), ((float)((0x1.0p-1f + life8_16))));
    return;
}


public static int a(net.minecraft.util.EnumFacing$Axis p0) {
net.minecraft.util.EnumFacing$Axis forwardValue3137_15_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3137_15_1;
    int forwardValue3137_19_0;
    net.minecraft.util.EnumFacing$Axis spill3137_0;
    net.minecraft.util.EnumFacing$Axis spill3137_1;
    long life1_3;
    int[] life3_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.cr.T ^ 121163782671354L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3137_0 = p0;
    spill3137_1 = net.minecraft.util.EnumFacing$Axis.X;
    if (!((life3_5 != null))) {
        forwardValue3137_15_0 = spill3137_0;
        forwardValue3137_15_1 = spill3137_1;
        break forward_join_15;
    }
    if (!((spill3137_0 == spill3137_1))) {
        break forward_join_13;
    }
    forwardValue3137_19_0 = 1;
    break forward_join_19;
    }
    forwardValue3137_15_0 = p0;
    forwardValue3137_15_1 = net.minecraft.util.EnumFacing$Axis.Z;
    }
    if (!((forwardValue3137_15_0 == forwardValue3137_15_1))) {
        break forward_join_18;
    }
    forwardValue3137_19_0 = 2;
    break forward_join_19;
    }
    forwardValue3137_19_0 = 0;
    }
    return forwardValue3137_19_0;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1, moom.bs p2) {
net.minecraft.block.state.IBlockState forwardValue3141_21_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3141_32_0;
    moom.bs forwardValue3141_43_0;
    moom.bs forwardValue3141_43_1;
    net.minecraft.util.EnumFacing$Axis forwardValue3141_48_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3141_48_1;
    moom.bs forwardValue3141_56_0;
    moom.bs forwardValue3141_56_1;
    net.minecraft.block.Block forwardValue3141_75_0;
    moom.cr forwardValue3141_75_1;
    int forwardValue3141_79_0;
    net.minecraft.block.Block forwardValue3141_96_0;
    moom.cr forwardValue3141_96_1;
    int forwardValue3141_100_0;
    net.minecraft.block.Block forwardValue3141_117_0;
    moom.cr forwardValue3141_117_1;
    int forwardValue3141_121_0;
    net.minecraft.block.Block forwardValue3141_138_0;
    moom.cr forwardValue3141_138_1;
    int forwardValue3141_142_0;
    int forwardValue3141_155_0;
    int forwardValue3141_157_0;
    int forwardValue3141_170_0;
    int forwardValue3141_172_0;
    int forwardValue3141_181_0;
    int forwardValue3141_188_0;
    int forwardValue3141_195_0;
    int forwardValue3141_202_0;
    int[] spill3141_0;
    net.minecraft.block.state.IBlockState spill3141_1;
    net.minecraft.util.EnumFacing$Axis spill3141_2;
    net.minecraft.util.EnumFacing$Axis spill3141_3;
    moom.bs spill3141_4;
    moom.bs spill3141_5;
    moom.bs spill3141_6;
    moom.bs spill3141_7;
    net.minecraft.block.Block spill3141_8;
    moom.cr spill3141_9;
    net.minecraft.block.Block spill3141_10;
    moom.cr spill3141_11;
    net.minecraft.block.Block spill3141_12;
    moom.cr spill3141_13;
    net.minecraft.block.Block spill3141_14;
    moom.cr spill3141_15;
    int spill3141_16;
    int spill3141_17;
    int spill3141_18;
    int spill3141_19;
    int spill3141_20;
    long life4_3;
    net.minecraft.util.EnumFacing$Axis life7_5;
    net.minecraft.block.state.IBlockState life8_10;
    int[] life6_11;
    int life9_123;
    int life10_152;
    int life11_181;
    int life12_210;
    int life13_240;
    int life14_270;
    forward_join_202: {
    forward_join_201: {
    forward_join_199: {
    forward_join_195: {
    forward_join_194: {
    forward_join_188: {
    forward_join_187: {
    forward_join_181: {
    forward_join_180: {
    forward_join_172: {
    forward_join_171: {
    forward_join_170: {
    forward_join_169: {
    forward_join_157: {
    forward_join_156: {
    forward_join_155: {
    forward_join_154: {
    forward_join_142: {
    forward_join_141: {
    forward_join_138: {
    forward_join_121: {
    forward_join_120: {
    forward_join_117: {
    forward_join_100: {
    forward_join_99: {
    forward_join_96: {
    forward_join_79: {
    forward_join_78: {
    forward_join_75: {
    forward_join_59: {
    forward_join_56: {
    forward_join_48: {
    forward_join_46: {
    forward_join_43: {
    forward_join_32: {
    forward_join_31: {
    forward_join_21: {
    life4_3 = (moom.cr.T ^ 42987184647753L);
    life7_5 = null;
    spill3141_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    life6_11 = spill3141_0;
    spill3141_1 = ((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1)));
    if (!((life6_11 != null))) {
        forwardValue3141_21_0 = spill3141_1;
        break forward_join_21;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3141_1)).a__ch() == this))) {
        break forward_join_59;
    }
    forwardValue3141_21_0 = life8_10;
    }
    life7_5 = ((net.minecraft.util.EnumFacing$Axis)(((net.minecraft.block.state.IBlockState)(forwardValue3141_21_0)).a(((net.minecraft.block.properties.IProperty)(moom.cr.R)))));
    spill3141_2 = life7_5;
    if (!((life6_11 != null))) {
        forwardValue3141_32_0 = spill3141_2;
        break forward_join_32;
    }
    if (!((spill3141_2 == null))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue3141_32_0 = life7_5;
    }
    spill3141_3 = net.minecraft.util.EnumFacing$Axis.Z;
    if (!((life6_11 != null))) {
        forwardValue3141_48_0 = forwardValue3141_32_0;
        forwardValue3141_48_1 = spill3141_3;
        break forward_join_48;
    }
    if (!((forwardValue3141_32_0 == spill3141_3))) {
        break forward_join_46;
    }
    spill3141_4 = p2;
    spill3141_5 = moom.bs.EAST;
    if (!((life6_11 != null))) {
        forwardValue3141_43_0 = spill3141_4;
        forwardValue3141_43_1 = spill3141_5;
        break forward_join_43;
    }
    if (!((spill3141_4 != spill3141_5))) {
        break forward_join_46;
    }
    forwardValue3141_43_0 = p2;
    forwardValue3141_43_1 = moom.bs.WEST;
    }
    if (!((forwardValue3141_43_0 != forwardValue3141_43_1))) {
        break forward_join_46;
    }
    return ((0) != 0);
    }
    forwardValue3141_48_0 = life7_5;
    forwardValue3141_48_1 = net.minecraft.util.EnumFacing$Axis.X;
    }
    if (!((forwardValue3141_48_0 == forwardValue3141_48_1))) {
        break forward_join_59;
    }
    spill3141_6 = p2;
    spill3141_7 = moom.bs.SOUTH;
    if (!((life6_11 != null))) {
        forwardValue3141_56_0 = spill3141_6;
        forwardValue3141_56_1 = spill3141_7;
        break forward_join_56;
    }
    if (!((spill3141_6 != spill3141_7))) {
        break forward_join_59;
    }
    forwardValue3141_56_0 = p2;
    forwardValue3141_56_1 = moom.bs.NORTH;
    }
    if (!((forwardValue3141_56_0 != forwardValue3141_56_1))) {
        break forward_join_59;
    }
    return ((0) != 0);
    }
    spill3141_8 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e()))))).a__ch();
    spill3141_9 = this;
    if (!((life6_11 != null))) {
        forwardValue3141_75_0 = spill3141_8;
        forwardValue3141_75_1 = spill3141_9;
        break forward_join_75;
    }
    if (!((spill3141_8 == spill3141_9))) {
        break forward_join_78;
    }
    forwardValue3141_75_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).e(((int)(2)))))))).a__ch();
    forwardValue3141_75_1 = this;
    }
    if (!((forwardValue3141_75_0 != forwardValue3141_75_1))) {
        break forward_join_78;
    }
    forwardValue3141_79_0 = 1;
    break forward_join_79;
    }
    forwardValue3141_79_0 = 0;
    }
    life9_123 = forwardValue3141_79_0;
    spill3141_10 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f()))))).a__ch();
    spill3141_11 = this;
    if (!((life6_11 != null))) {
        forwardValue3141_96_0 = spill3141_10;
        forwardValue3141_96_1 = spill3141_11;
        break forward_join_96;
    }
    if (!((spill3141_10 == spill3141_11))) {
        break forward_join_99;
    }
    forwardValue3141_96_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).f(((int)(2)))))))).a__ch();
    forwardValue3141_96_1 = this;
    }
    if (!((forwardValue3141_96_0 != forwardValue3141_96_1))) {
        break forward_join_99;
    }
    forwardValue3141_100_0 = 1;
    break forward_join_100;
    }
    forwardValue3141_100_0 = 0;
    }
    life10_152 = forwardValue3141_100_0;
    spill3141_12 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c__DT()))))).a__ch();
    spill3141_13 = this;
    if (!((life6_11 != null))) {
        forwardValue3141_117_0 = spill3141_12;
        forwardValue3141_117_1 = spill3141_13;
        break forward_join_117;
    }
    if (!((spill3141_12 == spill3141_13))) {
        break forward_join_120;
    }
    forwardValue3141_117_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).c(((int)(2)))))))).a__ch();
    forwardValue3141_117_1 = this;
    }
    if (!((forwardValue3141_117_0 != forwardValue3141_117_1))) {
        break forward_join_120;
    }
    forwardValue3141_121_0 = 1;
    break forward_join_121;
    }
    forwardValue3141_121_0 = 0;
    }
    life11_181 = forwardValue3141_121_0;
    spill3141_14 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d__DT()))))).a__ch();
    spill3141_15 = this;
    if (!((life6_11 != null))) {
        forwardValue3141_138_0 = spill3141_14;
        forwardValue3141_138_1 = spill3141_15;
        break forward_join_138;
    }
    if (!((spill3141_14 == spill3141_15))) {
        break forward_join_141;
    }
    forwardValue3141_138_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).d(((int)(2)))))))).a__ch();
    forwardValue3141_138_1 = this;
    }
    if (!((forwardValue3141_138_0 != forwardValue3141_138_1))) {
        break forward_join_141;
    }
    forwardValue3141_142_0 = 1;
    break forward_join_142;
    }
    forwardValue3141_142_0 = 0;
    }
    life12_210 = forwardValue3141_142_0;
    spill3141_16 = life9_123;
    if (!((life6_11 != null))) {
        forwardValue3141_155_0 = spill3141_16;
        break forward_join_155;
    }
    if (!((spill3141_16 == 0))) {
        break forward_join_154;
    }
    spill3141_17 = life10_152;
    if (!((life6_11 != null))) {
        forwardValue3141_155_0 = spill3141_17;
        break forward_join_155;
    }
    if (!((spill3141_17 == 0))) {
        break forward_join_154;
    }
    if (!((life7_5 == net.minecraft.util.EnumFacing$Axis.X))) {
        break forward_join_156;
    }
    }
    forwardValue3141_155_0 = 1;
    }
    forwardValue3141_157_0 = forwardValue3141_155_0;
    break forward_join_157;
    }
    forwardValue3141_157_0 = 0;
    }
    life13_240 = forwardValue3141_157_0;
    spill3141_18 = life11_181;
    if (!((life6_11 != null))) {
        forwardValue3141_170_0 = spill3141_18;
        break forward_join_170;
    }
    if (!((spill3141_18 == 0))) {
        break forward_join_169;
    }
    spill3141_19 = life12_210;
    if (!((life6_11 != null))) {
        forwardValue3141_170_0 = spill3141_19;
        break forward_join_170;
    }
    if (!((spill3141_19 == 0))) {
        break forward_join_169;
    }
    if (!((life7_5 == net.minecraft.util.EnumFacing$Axis.Z))) {
        break forward_join_171;
    }
    }
    forwardValue3141_170_0 = 1;
    }
    forwardValue3141_172_0 = forwardValue3141_170_0;
    break forward_join_172;
    }
    forwardValue3141_172_0 = 0;
    }
    life14_270 = forwardValue3141_172_0;
    spill3141_20 = life13_240;
    if (!((life6_11 != null))) {
        forwardValue3141_181_0 = spill3141_20;
        break forward_join_181;
    }
    if (!((spill3141_20 != 0))) {
        break forward_join_180;
    }
    if (!((p2 != moom.bs.WEST))) {
        break forward_join_199;
    }
    }
    forwardValue3141_181_0 = life13_240;
    }
    if (!((life6_11 != null))) {
        forwardValue3141_188_0 = forwardValue3141_181_0;
        break forward_join_188;
    }
    if (!((forwardValue3141_181_0 != 0))) {
        break forward_join_187;
    }
    if (!((p2 != moom.bs.EAST))) {
        break forward_join_199;
    }
    }
    forwardValue3141_188_0 = life14_270;
    }
    if (!((life6_11 != null))) {
        forwardValue3141_195_0 = forwardValue3141_188_0;
        break forward_join_195;
    }
    if (!((forwardValue3141_188_0 != 0))) {
        break forward_join_194;
    }
    if (!((p2 != moom.bs.NORTH))) {
        break forward_join_199;
    }
    }
    forwardValue3141_195_0 = life14_270;
    }
    if (!((forwardValue3141_195_0 != 0))) {
        break forward_join_201;
    }
    if (!((p2 == moom.bs.SOUTH))) {
        break forward_join_201;
    }
    }
    forwardValue3141_202_0 = 1;
    break forward_join_202;
    }
    forwardValue3141_202_0 = 0;
    }
    return ((forwardValue3141_202_0) != 0);
}


public int a(java.util.Random p0) {
return 0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.TRANSLUCENT;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.Entity p3) {
net.minecraft.entity.Entity forwardValue3140_13_0;
    net.minecraft.entity.Entity forwardValue3140_17_0;
    net.minecraft.entity.Entity spill3140_0;
    long life5_3;
    int[] life7_5;
    forward_join_19: {
    forward_join_17: {
    forward_join_13: {
    life5_3 = (moom.cr.T ^ 82269222428107L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3140_0 = ((net.minecraft.entity.Entity)(p3)).g;
    if (!((life7_5 != null))) {
        forwardValue3140_13_0 = spill3140_0;
        break forward_join_13;
    }
    if (!((spill3140_0 == null))) {
        break forward_join_19;
    }
    forwardValue3140_13_0 = ((net.minecraft.entity.Entity)(p3)).f;
    }
    if (!((life7_5 != null))) {
        forwardValue3140_17_0 = forwardValue3140_13_0;
        break forward_join_17;
    }
    if (!((forwardValue3140_13_0 == null))) {
        break forward_join_19;
    }
    forwardValue3140_17_0 = p3;
    }
    ((net.minecraft.entity.Entity)(forwardValue3140_17_0)).a__Void(((moom.DT)(p1)));
    }
    return;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
return null;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3139_43_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3139_48_0;
    net.minecraft.util.EnumFacing$Axis forwardValue3139_48_1;
    int forwardValue3139_76_0;
    int[] spill3139_0;
    net.minecraft.util.EnumFacing$Axis spill3139_1;
    net.minecraft.util.EnumFacing$Axis spill3139_2;
    boolean spill3139_3;
    int spill3139_4;
    boolean spill3139_5;
    int spill3139_6;
    long life5_3;
    net.minecraft.util.EnumFacing$Axis life8_9;
    int[] life7_10;
    moom.e4 life9_25;
    moom.e4 life9_73;
    forward_join_77: {
    forward_join_76: {
    forward_join_71: {
    forward_join_48: {
    forward_join_46: {
    forward_join_44: {
    forward_join_43: {
    forward_join_38: {
    life5_3 = (moom.cr.T ^ 44361066421180L);
    spill3139_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_9 = ((net.minecraft.util.EnumFacing$Axis)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cr.R)))));
    life7_10 = spill3139_0;
    spill3139_1 = life8_9;
    spill3139_2 = net.minecraft.util.EnumFacing$Axis.X;
    if (!((life7_10 != null))) {
        forwardValue3139_48_0 = spill3139_1;
        forwardValue3139_48_1 = spill3139_2;
        break forward_join_48;
    }
    if (!((spill3139_1 == spill3139_2))) {
        break forward_join_46;
    }
    life9_25 = new moom.e4(p0, p1, net.minecraft.util.EnumFacing$Axis.X);
    spill3139_3 = ((moom.e4)(life9_25)).a__Boolean();
    if (!((life7_10 != null))) {
        forwardValue3139_43_0 = ((spill3139_3) ? 1 : 0);
        break forward_join_43;
    }
    if (!(spill3139_3)) {
        break forward_join_38;
    }
    spill3139_4 = ((moom.e4)(life9_25)).e;
    if (!((life7_10 != null))) {
        forwardValue3139_43_0 = spill3139_4;
        break forward_join_43;
    }
    if (!((spill3139_4 < (((moom.e4)(life9_25)).h * ((moom.e4)(life9_25)).g)))) {
        break forward_join_44;
    }
    }
    forwardValue3139_43_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3139_43_0);
    }
    if (!((life7_10 == null))) {
        break forward_join_77;
    }
    }
    forwardValue3139_48_0 = life8_9;
    forwardValue3139_48_1 = net.minecraft.util.EnumFacing$Axis.Z;
    }
    if (!((forwardValue3139_48_0 == forwardValue3139_48_1))) {
        break forward_join_77;
    }
    life9_73 = new moom.e4(p0, p1, net.minecraft.util.EnumFacing$Axis.Z);
    spill3139_5 = ((moom.e4)(life9_73)).a__Boolean();
    if (!((life7_10 != null))) {
        forwardValue3139_76_0 = ((spill3139_5) ? 1 : 0);
        break forward_join_76;
    }
    if (!(spill3139_5)) {
        break forward_join_71;
    }
    spill3139_6 = ((moom.e4)(life9_73)).e;
    if (!((life7_10 != null))) {
        forwardValue3139_76_0 = spill3139_6;
        break forward_join_76;
    }
    if (!((spill3139_6 < (((moom.e4)(life9_73)).h * ((moom.e4)(life9_73)).g)))) {
        break forward_join_77;
    }
    }
    forwardValue3139_76_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3139_76_0);
    }
    return;
}


public boolean g() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7162_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1087_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic1087_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_79fa39d0e3aa_invokedynamic1088_2(int a0, long a1) throws E;

private static native int __sourceExactCall_3bb34434eece33(net.minecraft.util.EnumFacing$Axis p0);
private static native int __sourceExactCall_f809863017e253(int p0, long p1);
private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native net.minecraft.entity.Entity __sourceExactCall_de0a459018a45f(net.minecraft.world.World p0, int p1, double p2, double p3, double p4);

private static native int __sourceExactCall_83272ff1cb0754(moom.DT p0);

private static native long __sourceExactCall_93409fc8361486(moom._a p0, long p1);
private static native moom._a __sourceExactCall_41bab94bc4b1bd(long p0, long p1, java.lang.Object p2);
private static native moom.fw __sourceExactCall_0bc9d0673d1b78(java.lang.String p0, java.lang.Class p1, java.lang.Enum[] p2);
}
