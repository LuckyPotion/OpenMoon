package net.minecraft.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CombatTracker {

private java.util.List<net.minecraft.util.CombatEntry> a;

private net.minecraft.entity.EntityLivingBase b;

private int c;

private int d;

private int e;

private boolean f;

private boolean g;

private java.lang.String h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public CombatTracker(net.minecraft.entity.EntityLivingBase p0) {
super();
    this.a = com.google.common.collect.Lists.newArrayList();
    this.b = p0;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(786981425938461745L)), ((long)(108804553543441332L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219809636975946L)))));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.util.CombatTracker.i ^ 76524886961763L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1210_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1210_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1210_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1210_14 = new byte[8];
    (__sourceSpill1210_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1210_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1210_16 = __sourceSpill1210_14;
    ((javax.crypto.Cipher)(__sourceSpill1210_11)).init(((int)(__sourceSpill1210_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1210_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1210_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "-ðêKÓéÖú<#ÿ·@"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1210_25 = local6_life21;
        int __sourceSpill1210_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1210_25)).substring(((int)(__sourceSpill1210_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1210_30 = local8_life19;
        int __sourceSpill1210_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1210_33 = new byte[8];
        (__sourceSpill1210_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1210_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1210_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1210_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1210_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1210_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1210_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1210_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1210_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1210_34)).doFinal(((byte[])(__sourceSpill1210_33)));
        (__sourceSpill1210_30)[__sourceSpill1210_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    j = ((long[])(local8_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> net.minecraft.util.IChatComponent __sourceHandlerCall_73a03f8d24484063f8be(net.minecraft.util.CombatTracker a0) throws E;
private static final class __SourceHandler_73a03f8d24484063f8be {

public static net.minecraft.util.IChatComponent f711(net.minecraft.util.CombatTracker receiver) throws Throwable {
    net.minecraft.util.CombatTracker forestValue711_26_0;
    net.minecraft.util.DamageSource forestValue711_67_0;
    net.minecraft.util.DamageSource forestValue711_67_1;
    net.minecraft.entity.Entity forestValue711_88_0;
    net.minecraft.item.ItemStack forestValue711_92_0;
    net.minecraft.item.ItemStack forestValue711_98_0;
    net.minecraft.util.IChatComponent forestValue711_144_0;
    net.minecraft.entity.Entity forestValue711_151_0;
    net.minecraft.item.ItemStack forestValue711_155_0;
    net.minecraft.item.ItemStack forestValue711_161_0;
    net.minecraft.util.CombatEntry forestValue711_240_0;
    net.minecraft.util.DamageSource forestValue711_241_0;
    net.minecraft.util.CombatTracker spill711_0;
    moom.CN spill711_1;
    moom.CN spill711_2;
    java.lang.String spill711_3;
    java.lang.Object[] spill711_4;
    net.minecraft.util.CombatEntry spill711_5;
    net.minecraft.util.DamageSource spill711_6;
    net.minecraft.util.DamageSource spill711_7;
    net.minecraft.util.DamageSource spill711_8;
    net.minecraft.util.IChatComponent spill711_9;
    net.minecraft.util.IChatComponent spill711_10;
    net.minecraft.entity.Entity spill711_11;
    net.minecraft.item.ItemStack spill711_12;
    moom.CN spill711_13;
    moom.CN spill711_14;
    java.lang.String spill711_15;
    java.lang.Object[] spill711_16;
    java.lang.Object[] spill711_17;
    java.lang.Object[] spill711_18;
    moom.CN spill711_19;
    moom.CN spill711_20;
    java.lang.String spill711_21;
    java.lang.Object[] spill711_22;
    java.lang.Object[] spill711_23;
    net.minecraft.entity.Entity spill711_24;
    net.minecraft.item.ItemStack spill711_25;
    moom.CN spill711_26;
    moom.CN spill711_27;
    java.lang.String spill711_28;
    java.lang.Object[] spill711_29;
    java.lang.Object[] spill711_30;
    java.lang.Object[] spill711_31;
    moom.CN spill711_32;
    moom.CN spill711_33;
    java.lang.String spill711_34;
    java.lang.Object[] spill711_35;
    java.lang.Object[] spill711_36;
    moom.CN spill711_37;
    moom.CN spill711_38;
    java.lang.String spill711_39;
    java.lang.Object[] spill711_40;
    moom.CN spill711_41;
    moom.CN spill711_42;
    java.lang.String spill711_43;
    java.lang.Object[] spill711_44;
    long life1_3;
    int life3_5;
    net.minecraft.util.CombatEntry life4_28;
    net.minecraft.util.CombatEntry life5_38;
    net.minecraft.util.IChatComponent life6_41;
    net.minecraft.entity.Entity life7_45;
    net.minecraft.util.IChatComponent life9_61;
    net.minecraft.entity.Entity life10_91;
    net.minecraft.item.ItemStack life11_104;
    net.minecraft.util.IChatComponent life8_134;
    net.minecraft.item.ItemStack life10_172;
    forest_join_245: {
    forest_join_241: {
    forest_join_240: {
    forest_join_239: {
    forest_join_237: {
    forest_join_221: {
    forest_join_206: {
    forest_join_204: {
    forest_join_187: {
    forest_join_161: {
    forest_join_155: {
    forest_join_154: {
    forest_join_151: {
    forest_join_144: {
    forest_join_143: {
    forest_join_141: {
    forest_join_124: {
    forest_join_98: {
    forest_join_92: {
    forest_join_91: {
    forest_join_88: {
    forest_join_67: {
    forest_join_26: {
    forest_join_25: {
    life1_3 = (__fieldRead711_0() ^ 87147070326022L);
    life3_5 = __integerCategory711_2(__call711_1());
    spill711_0 = receiver;
    if (!((life3_5 == 0))) {
        forestValue711_26_0 = spill711_0;
        break forest_join_26;
    }
    if (!((__call711_4(__fieldRead711_3(spill711_0)) == 0))) {
        break forest_join_25;
    }
    moom.CN __stackOp711_6_0 = __sourceUninitializedNEW711_5();
    spill711_1 = __stackOp711_6_0;
    spill711_2 = __stackOp711_6_0;
    spill711_3 = "death.attack.generic";
    java.lang.Object[] __stackOp711_7_0 = new java.lang.Object[1];
    spill711_4 = __stackOp711_7_0;
    (__stackOp711_7_0)[0] = __call711_9(__fieldRead711_8(receiver));
    __explicitNewInit711_10(spill711_2, spill711_3, spill711_4);
    return spill711_1;
    }
    forestValue711_26_0 = receiver;
    }
    life4_28 = __call711_11(forestValue711_26_0);
    life5_38 = __cast711_16(__call711_15(__fieldRead711_12(receiver), (__call711_14(__fieldRead711_13(receiver)) - 1)));
    life6_41 = __call711_17(life5_38);
    life7_45 = __call711_19(__call711_18(life5_38));
    spill711_5 = life4_28;
    if (!((life3_5 == 0))) {
        forestValue711_240_0 = spill711_5;
        break forest_join_240;
    }
    if (!((spill711_5 != null))) {
        break forest_join_239;
    }
    spill711_6 = __call711_20(life5_38);
    if (!((life3_5 == 0))) {
        forestValue711_241_0 = spill711_6;
        break forest_join_241;
    }
    if (!((spill711_6 == __fieldRead711_21()))) {
        break forest_join_239;
    }
    life9_61 = __call711_22(life4_28);
    spill711_7 = __call711_23(life4_28);
    spill711_8 = __fieldRead711_24();
    if (!((life3_5 == 0))) {
        forestValue711_67_0 = spill711_7;
        forestValue711_67_1 = spill711_8;
        break forest_join_67;
    }
    if (!((spill711_7 != spill711_8))) {
        break forest_join_221;
    }
    forestValue711_67_0 = __call711_25(life4_28);
    forestValue711_67_1 = __fieldRead711_26();
    }
    if (!((forestValue711_67_0 != forestValue711_67_1))) {
        break forest_join_221;
    }
    spill711_9 = life9_61;
    if (!((life3_5 == 0))) {
        forestValue711_144_0 = spill711_9;
        break forest_join_144;
    }
    if (!((spill711_9 != null))) {
        break forest_join_143;
    }
    spill711_10 = life9_61;
    if (!((life3_5 == 0))) {
        forestValue711_144_0 = spill711_10;
        break forest_join_144;
    }
    if (!((!__call711_27(spill711_10, life6_41)))) {
        break forest_join_143;
    }
    life10_91 = __call711_29(__call711_28(life4_28));
    spill711_11 = life10_91;
    if (!((life3_5 == 0))) {
        forestValue711_88_0 = spill711_11;
        break forest_join_88;
    }
    if (!((__instanceOf711_30(spill711_11) != 0))) {
        break forest_join_91;
    }
    forestValue711_88_0 = life10_91;
    }
    forestValue711_92_0 = __call711_32(__cast711_31(forestValue711_88_0));
    break forest_join_92;
    }
    forestValue711_92_0 = null;
    }
    life11_104 = forestValue711_92_0;
    spill711_12 = life11_104;
    if (!((life3_5 == 0))) {
        forestValue711_98_0 = spill711_12;
        break forest_join_98;
    }
    if (!((spill711_12 != null))) {
        break forest_join_124;
    }
    forestValue711_98_0 = life11_104;
    }
    if (!(__call711_33(forestValue711_98_0))) {
        break forest_join_124;
    }
    moom.CN __stackOp711_35_0 = __sourceUninitializedNEW711_34();
    spill711_13 = __stackOp711_35_0;
    spill711_14 = __stackOp711_35_0;
    spill711_15 = "death.fell.assist.item";
    java.lang.Object[] __stackOp711_36_0 = new java.lang.Object[3];
    spill711_16 = __stackOp711_36_0;
    (__stackOp711_36_0)[0] = __call711_38(__fieldRead711_37(receiver));
    java.lang.Object[] __stackOp711_39_0 = spill711_16;
    spill711_17 = __stackOp711_39_0;
    (__stackOp711_39_0)[1] = life9_61;
    java.lang.Object[] __stackOp711_40_0 = spill711_17;
    spill711_18 = __stackOp711_40_0;
    (__stackOp711_40_0)[2] = __call711_41(life11_104);
    __explicitNewInit711_42(spill711_14, spill711_15, spill711_18);
    life8_134 = spill711_13;
    if (!((life3_5 != 0))) {
        break forest_join_141;
    }
    }
    moom.CN __stackOp711_44_0 = __sourceUninitializedNEW711_43();
    spill711_19 = __stackOp711_44_0;
    spill711_20 = __stackOp711_44_0;
    spill711_21 = "death.fell.assist";
    java.lang.Object[] __stackOp711_45_0 = new java.lang.Object[2];
    spill711_22 = __stackOp711_45_0;
    (__stackOp711_45_0)[0] = __call711_47(__fieldRead711_46(receiver));
    java.lang.Object[] __stackOp711_48_0 = spill711_22;
    spill711_23 = __stackOp711_48_0;
    (__stackOp711_48_0)[1] = life9_61;
    __explicitNewInit711_49(spill711_20, spill711_21, spill711_23);
    life8_134 = spill711_19;
    }
    if (!((life3_5 != 0))) {
        break forest_join_237;
    }
    }
    forestValue711_144_0 = life6_41;
    }
    if (!((forestValue711_144_0 != null))) {
        break forest_join_206;
    }
    spill711_24 = life7_45;
    if (!((life3_5 == 0))) {
        forestValue711_151_0 = spill711_24;
        break forest_join_151;
    }
    if (!((__instanceOf711_50(spill711_24) != 0))) {
        break forest_join_154;
    }
    forestValue711_151_0 = life7_45;
    }
    forestValue711_155_0 = __call711_52(__cast711_51(forestValue711_151_0));
    break forest_join_155;
    }
    forestValue711_155_0 = null;
    }
    life10_172 = forestValue711_155_0;
    spill711_25 = life10_172;
    if (!((life3_5 == 0))) {
        forestValue711_161_0 = spill711_25;
        break forest_join_161;
    }
    if (!((spill711_25 != null))) {
        break forest_join_187;
    }
    forestValue711_161_0 = life10_172;
    }
    if (!(__call711_53(forestValue711_161_0))) {
        break forest_join_187;
    }
    moom.CN __stackOp711_55_0 = __sourceUninitializedNEW711_54();
    spill711_26 = __stackOp711_55_0;
    spill711_27 = __stackOp711_55_0;
    spill711_28 = "death.fell.finish.item";
    java.lang.Object[] __stackOp711_56_0 = new java.lang.Object[3];
    spill711_29 = __stackOp711_56_0;
    (__stackOp711_56_0)[0] = __call711_58(__fieldRead711_57(receiver));
    java.lang.Object[] __stackOp711_59_0 = spill711_29;
    spill711_30 = __stackOp711_59_0;
    (__stackOp711_59_0)[1] = life6_41;
    java.lang.Object[] __stackOp711_60_0 = spill711_30;
    spill711_31 = __stackOp711_60_0;
    (__stackOp711_60_0)[2] = __call711_61(life10_172);
    __explicitNewInit711_62(spill711_27, spill711_28, spill711_31);
    life8_134 = spill711_26;
    if (!((life3_5 != 0))) {
        break forest_join_204;
    }
    }
    moom.CN __stackOp711_64_0 = __sourceUninitializedNEW711_63();
    spill711_32 = __stackOp711_64_0;
    spill711_33 = __stackOp711_64_0;
    spill711_34 = "death.fell.finish";
    java.lang.Object[] __stackOp711_65_0 = new java.lang.Object[2];
    spill711_35 = __stackOp711_65_0;
    (__stackOp711_65_0)[0] = __call711_67(__fieldRead711_66(receiver));
    java.lang.Object[] __stackOp711_68_0 = spill711_35;
    spill711_36 = __stackOp711_68_0;
    (__stackOp711_68_0)[1] = life6_41;
    __explicitNewInit711_69(spill711_33, spill711_34, spill711_36);
    life8_134 = spill711_32;
    }
    if (!((life3_5 != 0))) {
        break forest_join_237;
    }
    }
    moom.CN __stackOp711_71_0 = __sourceUninitializedNEW711_70();
    spill711_37 = __stackOp711_71_0;
    spill711_38 = __stackOp711_71_0;
    spill711_39 = "death.fell.killer";
    java.lang.Object[] __stackOp711_72_0 = new java.lang.Object[1];
    spill711_40 = __stackOp711_72_0;
    (__stackOp711_72_0)[0] = __call711_74(__fieldRead711_73(receiver));
    __explicitNewInit711_75(spill711_38, spill711_39, spill711_40);
    life8_134 = spill711_37;
    if (!((life3_5 != 0))) {
        break forest_join_237;
    }
    }
    moom.CN __stackOp711_77_0 = __sourceUninitializedNEW711_76();
    spill711_41 = __stackOp711_77_0;
    spill711_42 = __stackOp711_77_0;
    spill711_43 = __invokedynamic711_79(__call711_78(receiver, life4_28));
    java.lang.Object[] __stackOp711_80_0 = new java.lang.Object[1];
    spill711_44 = __stackOp711_80_0;
    (__stackOp711_80_0)[0] = __call711_82(__fieldRead711_81(receiver));
    __explicitNewInit711_83(spill711_42, spill711_43, spill711_44);
    life8_134 = spill711_41;
    }
    if (!((life3_5 != 0))) {
        break forest_join_245;
    }
    }
    forestValue711_240_0 = life5_38;
    }
    forestValue711_241_0 = __call711_84(forestValue711_240_0);
    }
    life8_134 = __call711_86(forestValue711_241_0, __fieldRead711_85(receiver));
    }
    return life8_134;
}
private static native long __fieldRead711_0() throws Throwable;
private static native boolean __call711_1() throws Throwable;
private static native int __integerCategory711_2(boolean value) throws Throwable;
private static native java.util.List __fieldRead711_3(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native int __call711_4(java.util.List a0) throws Throwable;
private static native moom.CN __sourceUninitializedNEW711_5() throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_8(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_9(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __explicitNewInit711_10(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.util.CombatEntry __call711_11(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native java.util.List __fieldRead711_12(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native java.util.List __fieldRead711_13(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native int __call711_14(java.util.List a0) throws Throwable;
private static native java.lang.Object __call711_15(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.util.CombatEntry __cast711_16(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_17(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.util.DamageSource __call711_18(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.entity.Entity __call711_19(net.minecraft.util.DamageSource a0) throws Throwable;
private static native net.minecraft.util.DamageSource __call711_20(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead711_21() throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_22(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.util.DamageSource __call711_23(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead711_24() throws Throwable;
private static native net.minecraft.util.DamageSource __call711_25(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.util.DamageSource __fieldRead711_26() throws Throwable;
private static native boolean __call711_27(net.minecraft.util.IChatComponent a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native net.minecraft.util.DamageSource __call711_28(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.entity.Entity __call711_29(net.minecraft.util.DamageSource a0) throws Throwable;
private static native int __instanceOf711_30(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast711_31(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call711_32(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call711_33(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.CN __sourceUninitializedNEW711_34() throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_37(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_38(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_41(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __explicitNewInit711_42(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.CN __sourceUninitializedNEW711_43() throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_46(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_47(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __explicitNewInit711_49(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __instanceOf711_50(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast711_51(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.item.ItemStack __call711_52(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native boolean __call711_53(net.minecraft.item.ItemStack a0) throws Throwable;
private static native moom.CN __sourceUninitializedNEW711_54() throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_57(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_58(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_61(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __explicitNewInit711_62(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.CN __sourceUninitializedNEW711_63() throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_66(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_67(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __explicitNewInit711_69(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.CN __sourceUninitializedNEW711_70() throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_73(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_74(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __explicitNewInit711_75(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native moom.CN __sourceUninitializedNEW711_76() throws Throwable;
private static native java.lang.String __call711_78(net.minecraft.util.CombatTracker a0, net.minecraft.util.CombatEntry a1) throws Throwable;
private static native java.lang.String __invokedynamic711_79(java.lang.String a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_81(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_82(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native void __explicitNewInit711_83(moom.CN a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native net.minecraft.util.DamageSource __call711_84(net.minecraft.util.CombatEntry a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __fieldRead711_85(net.minecraft.util.CombatTracker a0) throws Throwable;
private static native net.minecraft.util.IChatComponent __call711_86(net.minecraft.util.DamageSource a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;

}


private void b__Void() {
this.h = ((java.lang.String)(null));
    return;
}


public net.minecraft.entity.EntityLivingBase b() {
return this.b;
}


public void c() {
int forwardValue5732_16_0;
    int forwardValue5732_22_0;
    int forwardValue5732_31_0;
    int forwardValue5732_46_0;
    net.minecraft.util.CombatTracker forwardValue5732_66_0;
    boolean spill5732_0;
    boolean spill5732_1;
    int spill5732_2;
    net.minecraft.util.CombatTracker spill5732_3;
    long life1_3;
    int life3_5;
    int life4_25;
    int life5_67;
    forward_join_68: {
    forward_join_66: {
    forward_join_65: {
    forward_join_46: {
    forward_join_44: {
    forward_join_31: {
    forward_join_22: {
    forward_join_17: {
    forward_join_16: {
    life1_3 = (net.minecraft.util.CombatTracker.i ^ 51416904458628L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5732_0 = this.f;
    if (!((life3_5 != 0))) {
        forwardValue5732_16_0 = ((spill5732_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill5732_0)) {
        break forward_join_17;
    }
    forwardValue5732_16_0 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic5732_5(9495, (2908875857099180621L ^ life1_3));
    }
    forwardValue5732_22_0 = forwardValue5732_16_0;
    break forward_join_22;
    }
    forwardValue5732_22_0 = __sourceIntrinsic_5b7380e7aa7c_invokedynamic5732_6(3136, (389450951463985947L ^ life1_3));
    }
    life4_25 = forwardValue5732_22_0;
    spill5732_1 = this.g;
    if (!((life3_5 != 0))) {
        forwardValue5732_31_0 = ((spill5732_1) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill5732_1)) {
        break forward_join_68;
    }
    forwardValue5732_31_0 = ((((net.minecraft.entity.EntityLivingBase)(this.b)).p__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 != 0))) {
        forwardValue5732_46_0 = forwardValue5732_31_0;
        break forward_join_46;
    }
    if (!((forwardValue5732_31_0 != 0))) {
        break forward_join_44;
    }
    spill5732_2 = (((net.minecraft.entity.EntityLivingBase)(this.b)).S - this.c);
    if (!((life3_5 != 0))) {
        forwardValue5732_46_0 = spill5732_2;
        break forward_join_46;
    }
    if (!((spill5732_2 > life4_25))) {
        break forward_join_68;
    }
    }
    forwardValue5732_46_0 = ((this.f) ? 1 : 0);
    }
    life5_67 = forwardValue5732_46_0;
    this.g = ((boolean)(false));
    this.f = ((boolean)(false));
    spill5732_3 = this;
    if (!((life3_5 != 0))) {
        forwardValue5732_66_0 = spill5732_3;
        break forward_join_66;
    }
    ((net.minecraft.util.CombatTracker)(spill5732_3)).e = ((int)(((net.minecraft.entity.EntityLivingBase)(this.b)).S));
    if (!((life5_67 != 0))) {
        break forward_join_65;
    }
    ((net.minecraft.entity.EntityLivingBase)(this.b)).K();
    }
    forwardValue5732_66_0 = this;
    }
    ((java.util.List)(((net.minecraft.util.CombatTracker)(forwardValue5732_66_0)).a)).clear();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a__Void() {
net.minecraft.block.Block forwardValue5730_45_0;
    net.minecraft.block.Block forwardValue5730_45_1;
    int forwardValue5730_56_0;
    net.minecraft.util.CombatTracker forwardValue5730_58_0;
    boolean spill5730_0;
    boolean spill5730_1;
    net.minecraft.block.Block spill5730_2;
    net.minecraft.block.Block spill5730_3;
    net.minecraft.util.CombatTracker spill5730_4;
    long life1_3;
    int life3_7;
    net.minecraft.block.Block life4_35;
    forward_join_60: {
    forward_join_58: {
    forward_join_56: {
    forward_join_51: {
    forward_join_49: {
    forward_join_45: {
    forward_join_43: {
    life1_3 = (net.minecraft.util.CombatTracker.i ^ 35391505836189L);
    spill5730_0 = moom.DS.b__Boolean();
    ((net.minecraft.util.CombatTracker)(this)).b__Void();
    life3_7 = ((spill5730_0) ? 1 : 0);
    spill5730_1 = ((net.minecraft.entity.EntityLivingBase)(this.b)).I__Boolean();
    if (!((life3_7 == 0))) {
        forwardValue5730_56_0 = ((spill5730_1) ? 1 : 0);
        break forward_join_56;
    }
    if (!(spill5730_1)) {
        break forward_join_51;
    }
    life4_35 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(((net.minecraft.entity.EntityLivingBase)(this.b)).i)).a__fE(((moom.DT)(new moom.DT(((net.minecraft.entity.EntityLivingBase)(this.b)).n, ((moom.CA)(((net.minecraft.entity.EntityLivingBase)(this.b)).b())).c, ((net.minecraft.entity.EntityLivingBase)(this.b)).p)))))).a__ch();
    spill5730_2 = life4_35;
    spill5730_3 = net.minecraft.init.Blocks.au;
    if (!((life3_7 == 0))) {
        forwardValue5730_45_0 = spill5730_2;
        forwardValue5730_45_1 = spill5730_3;
        break forward_join_45;
    }
    if (!((spill5730_2 == spill5730_3))) {
        break forward_join_43;
    }
    this.h = ((java.lang.String)("ladder"));
    if (!((life3_7 != 0))) {
        break forward_join_49;
    }
    }
    forwardValue5730_45_0 = life4_35;
    forwardValue5730_45_1 = net.minecraft.init.Blocks.bc;
    }
    if (!((forwardValue5730_45_0 == forwardValue5730_45_1))) {
        break forward_join_49;
    }
    this.h = ((java.lang.String)("vines"));
    }
    if (!((life3_7 != 0))) {
        break forward_join_60;
    }
    }
    spill5730_4 = this;
    if (!((life3_7 == 0))) {
        forwardValue5730_58_0 = spill5730_4;
        break forward_join_58;
    }
    forwardValue5730_56_0 = ((((net.minecraft.entity.EntityLivingBase)(((net.minecraft.util.CombatTracker)(spill5730_4)).b)).j__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5730_56_0 != 0))) {
        break forward_join_60;
    }
    forwardValue5730_58_0 = this;
    }
    ((net.minecraft.util.CombatTracker)(forwardValue5730_58_0)).h = ((java.lang.String)("water"));
    }
    return;
}


public void a(net.minecraft.util.DamageSource p0, float p1, float p2) {
int forwardValue5727_45_0;
    int forwardValue5727_53_0;
    net.minecraft.entity.EntityLivingBase forwardValue5727_68_0;
    boolean spill5727_0;
    boolean spill5727_1;
    net.minecraft.entity.EntityLivingBase spill5727_2;
    long life4_3;
    int life6_7;
    net.minecraft.util.CombatEntry life7_24;
    forward_join_69: {
    forward_join_68: {
    forward_join_53: {
    forward_join_45: {
    life4_3 = (net.minecraft.util.CombatTracker.i ^ 24989260761577L);
    spill5727_0 = moom.DS.b__Boolean();
    ((net.minecraft.util.CombatTracker)(this)).c();
    life6_7 = ((spill5727_0) ? 1 : 0);
    ((net.minecraft.util.CombatTracker)(this)).a__Void();
    life7_24 = new net.minecraft.util.CombatEntry(p0, ((net.minecraft.entity.EntityLivingBase)(this.b)).S, p1, p2, this.h, ((net.minecraft.entity.EntityLivingBase)(this.b)).L);
    ((java.util.List)(this.a)).add(((java.lang.Object)(life7_24)));
    this.c = ((int)(((net.minecraft.entity.EntityLivingBase)(this.b)).S));
    this.g = ((boolean)(true));
    spill5727_1 = ((net.minecraft.util.CombatEntry)(life7_24)).a__Boolean();
    if (!((life6_7 == 0))) {
        forwardValue5727_45_0 = ((spill5727_1) ? 1 : 0);
        break forward_join_45;
    }
    if (!(spill5727_1)) {
        break forward_join_69;
    }
    forwardValue5727_45_0 = ((this.f) ? 1 : 0);
    }
    if (!((life6_7 == 0))) {
        forwardValue5727_53_0 = forwardValue5727_45_0;
        break forward_join_53;
    }
    if (!((forwardValue5727_45_0 == 0))) {
        break forward_join_69;
    }
    spill5727_2 = this.b;
    if (!((life6_7 == 0))) {
        forwardValue5727_68_0 = spill5727_2;
        break forward_join_68;
    }
    forwardValue5727_53_0 = ((((net.minecraft.entity.EntityLivingBase)(spill5727_2)).p__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue5727_53_0 != 0))) {
        break forward_join_69;
    }
    this.f = ((boolean)(true));
    this.d = ((int)(((net.minecraft.entity.EntityLivingBase)(this.b)).S));
    this.e = ((int)(this.d));
    forwardValue5727_68_0 = this.b;
    }
    ((net.minecraft.entity.EntityLivingBase)(forwardValue5727_68_0)).J();
    }
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20266;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/CS", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.util.CombatTracker.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12341_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/CS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.entity.EntityLivingBase a__sG() {
net.minecraft.entity.player.EntityPlayer lexicalValue1706_52_0;
    int lexicalValue1706_57_0;
    float lexicalValue1706_71_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1706_76_0;
    int lexicalValue1706_88_0;
    net.minecraft.entity.EntityLivingBase lexicalValue1706_92_0;
    boolean spill1706_0;
    int spill1706_1;
    net.minecraft.entity.player.EntityPlayer spill1706_2;
    int spill1706_3;
    net.minecraft.entity.EntityLivingBase spill1706_4;
    float spill1706_5;
    net.minecraft.entity.player.EntityPlayer spill1706_6;
    long life1_3;
    net.minecraft.entity.EntityLivingBase life4_6;
    net.minecraft.entity.player.EntityPlayer life5_8;
    int life3_9;
    float life6_11;
    float life7_13;
    java.util.Iterator life8_17;
    net.minecraft.util.CombatEntry life9_24;
    lexical_join_92: {
    lexical_join_91: {
    lexical_join_88: {
    lexical_join_79: {
    life1_3 = (net.minecraft.util.CombatTracker.i ^ 38496763900182L);
    spill1706_0 = moom.DS.c__Boolean();
    life4_6 = null;
    life5_8 = null;
    life3_9 = ((spill1706_0) ? 1 : 0);
    life6_11 = 0x0.0p0f;
    life7_13 = 0x0.0p0f;
    life8_17 = ((java.util.List)(this.a)).iterator();
    lexical_cycle_18: while (true) {
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_71: {
    lexical_join_69: {
    lexical_join_57: {
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_45: {
    if (!(((java.util.Iterator)(life8_17)).hasNext())) {
        break lexical_join_79;
    }
    life9_24 = ((net.minecraft.util.CombatEntry)(((java.util.Iterator)(life8_17)).next()));
    spill1706_1 = ((((net.minecraft.util.DamageSource)(((net.minecraft.util.CombatEntry)(life9_24)).a__CU())).b__r3() instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_9 != 0))) {
        lexicalValue1706_88_0 = spill1706_1;
        break lexical_join_88;
    }
    if (!((life3_9 != 0))) {
        lexicalValue1706_57_0 = spill1706_1;
        break lexical_join_57;
    }
    if (!((spill1706_1 != 0))) {
        break lexical_join_53;
    }
    spill1706_2 = life5_8;
    if (!((life3_9 != 0))) {
        lexicalValue1706_52_0 = spill1706_2;
        break lexical_join_52;
    }
    if (!((spill1706_2 != null))) {
        break lexical_join_45;
    }
    spill1706_3 = recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.CombatEntry)(life9_24)).a())), ((float)(life7_13)));
    if (!((life3_9 != 0))) {
        lexicalValue1706_57_0 = spill1706_3;
        break lexical_join_57;
    }
    if (!((spill1706_3 > 0))) {
        break lexical_join_53;
    }
    }
    life7_13 = ((net.minecraft.util.CombatEntry)(life9_24)).a();
    lexicalValue1706_52_0 = ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.util.DamageSource)(((net.minecraft.util.CombatEntry)(life9_24)).a__CU())).b__r3()));
    }
    life5_8 = lexicalValue1706_52_0;
    }
    lexicalValue1706_57_0 = ((((net.minecraft.util.DamageSource)(((net.minecraft.util.CombatEntry)(life9_24)).a__CU())).b__r3() instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((lexicalValue1706_57_0 != 0))) {
        break lexical_join_77;
    }
    spill1706_4 = life4_6;
    if (!((life3_9 != 0))) {
        lexicalValue1706_76_0 = spill1706_4;
        break lexical_join_76;
    }
    if (!((spill1706_4 != null))) {
        break lexical_join_69;
    }
    spill1706_5 = ((net.minecraft.util.CombatEntry)(life9_24)).a();
    if (!((life3_9 != 0))) {
        lexicalValue1706_71_0 = spill1706_5;
        break lexical_join_71;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1706_5)), ((float)(life6_11))) > 0))) {
        break lexical_join_77;
    }
    }
    lexicalValue1706_71_0 = ((net.minecraft.util.CombatEntry)(life9_24)).a();
    }
    life6_11 = lexicalValue1706_71_0;
    lexicalValue1706_76_0 = ((net.minecraft.entity.EntityLivingBase)(((net.minecraft.util.DamageSource)(((net.minecraft.util.CombatEntry)(life9_24)).a__CU())).b__r3()));
    }
    life4_6 = lexicalValue1706_76_0;
    }
    if (!((life3_9 == 0))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    spill1706_6 = life5_8;
    if (!((life3_9 != 0))) {
        lexicalValue1706_92_0 = spill1706_6;
        break lexical_join_92;
    }
    if (!((spill1706_6 != null))) {
        break lexical_join_91;
    }
    lexicalValue1706_88_0 = recovery.source.CarrierOps.fcmpl(((float)(life7_13)), ((float)((life6_11 / 0x1.8p1f))));
    }
    if (!((lexicalValue1706_88_0 >= 0))) {
        break lexical_join_91;
    }
    return life5_8;
    }
    lexicalValue1706_92_0 = life4_6;
    }
    return lexicalValue1706_92_0;
}


private net.minecraft.util.CombatEntry a__CR() {
net.minecraft.util.CombatEntry lexicalValue1705_40_0;
    net.minecraft.util.CombatEntry lexicalValue1705_54_0;
    net.minecraft.util.CombatEntry lexicalValue1705_65_0;
    net.minecraft.util.CombatEntry lexicalValue1705_83_0;
    net.minecraft.util.CombatEntry lexicalValue1705_88_0;
    net.minecraft.util.CombatEntry lexicalValue1705_100_0;
    int lexicalValue1705_107_0;
    net.minecraft.util.CombatEntry lexicalValue1705_115_0;
    int lexicalValue1705_117_0;
    net.minecraft.util.CombatEntry lexicalValue1705_124_0;
    boolean spill1705_0;
    int spill1705_1;
    net.minecraft.util.CombatEntry spill1705_2;
    net.minecraft.util.CombatEntry spill1705_3;
    net.minecraft.util.CombatEntry spill1705_4;
    net.minecraft.util.CombatEntry spill1705_5;
    net.minecraft.util.CombatEntry spill1705_6;
    net.minecraft.util.CombatEntry spill1705_7;
    long life1_3;
    net.minecraft.util.CombatEntry life4_6;
    net.minecraft.util.CombatEntry life5_8;
    int life3_9;
    int life6_11;
    float life7_13;
    int life8_15;
    net.minecraft.util.CombatEntry life9_26;
    net.minecraft.util.CombatEntry life10_45;
    lexical_join_125: {
    lexical_join_124: {
    lexical_join_117: {
    lexical_join_116: {
    lexical_join_115: {
    lexical_join_107: {
    lexical_join_104: {
    life1_3 = (net.minecraft.util.CombatTracker.i ^ 9834282694843L);
    spill1705_0 = moom.DS.b__Boolean();
    life4_6 = null;
    life5_8 = null;
    life3_9 = ((spill1705_0) ? 1 : 0);
    life6_11 = 0;
    life7_13 = 0x0.0p0f;
    life8_15 = 0;
    lexical_cycle_16: while (true) {
    lexical_join_101: {
    lexical_join_100: {
    lexical_join_99: {
    lexical_join_88: {
    lexical_join_83: {
    lexical_join_82: {
    lexical_join_79: {
    lexical_join_77: {
    lexical_join_71: {
    lexical_join_65: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_40: {
    lexical_join_39: {
    if (!((life8_15 < ((java.util.List)(this.a)).size()))) {
        break lexical_join_104;
    }
    life9_26 = ((net.minecraft.util.CombatEntry)(((java.util.List)(this.a)).get(((int)(life8_15)))));
    spill1705_1 = life8_15;
    if (!((life3_9 == 0))) {
        lexicalValue1705_107_0 = spill1705_1;
        break lexical_join_107;
    }
    if (!((spill1705_1 > 0))) {
        break lexical_join_39;
    }
    lexicalValue1705_40_0 = ((net.minecraft.util.CombatEntry)(((java.util.List)(this.a)).get(((int)((life8_15 - 1))))));
    break lexical_join_40;
    }
    lexicalValue1705_40_0 = null;
    }
    life10_45 = lexicalValue1705_40_0;
    spill1705_2 = life9_26;
    if (!((life3_9 == 0))) {
        lexicalValue1705_54_0 = spill1705_2;
        break lexical_join_54;
    }
    if (!((((net.minecraft.util.CombatEntry)(spill1705_2)).a__CU() != net.minecraft.util.DamageSource.i))) {
        break lexical_join_53;
    }
    spill1705_3 = life9_26;
    if (!((life3_9 == 0))) {
        lexicalValue1705_83_0 = spill1705_3;
        break lexical_join_83;
    }
    if (!((((net.minecraft.util.CombatEntry)(spill1705_3)).a__CU() == net.minecraft.util.DamageSource.j))) {
        break lexical_join_82;
    }
    }
    lexicalValue1705_54_0 = life9_26;
    }
    if (!((life3_9 == 0))) {
        lexicalValue1705_83_0 = lexicalValue1705_54_0;
        break lexical_join_83;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.CombatEntry)(lexicalValue1705_54_0)).b())), ((float)(0x0.0p0f))) > 0))) {
        break lexical_join_82;
    }
    spill1705_4 = life4_6;
    if (!((life3_9 == 0))) {
        lexicalValue1705_65_0 = spill1705_4;
        break lexical_join_65;
    }
    if (!((spill1705_4 != null))) {
        break lexical_join_71;
    }
    lexicalValue1705_65_0 = life9_26;
    }
    if (!((life3_9 == 0))) {
        lexicalValue1705_83_0 = lexicalValue1705_65_0;
        break lexical_join_83;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.CombatEntry)(lexicalValue1705_65_0)).b())), ((float)(life7_13))) > 0))) {
        break lexical_join_82;
    }
    }
    if (!((life8_15 > 0))) {
        break lexical_join_77;
    }
    life4_6 = life10_45;
    if (!((life3_9 != 0))) {
        break lexical_join_79;
    }
    }
    life4_6 = life9_26;
    }
    life7_13 = ((net.minecraft.util.CombatEntry)(life9_26)).b();
    }
    lexicalValue1705_83_0 = life9_26;
    }
    if (!((life3_9 == 0))) {
        lexicalValue1705_88_0 = lexicalValue1705_83_0;
        break lexical_join_88;
    }
    if (!((((net.minecraft.util.CombatEntry)(lexicalValue1705_83_0)).a__String() != null))) {
        break lexical_join_101;
    }
    lexicalValue1705_88_0 = life5_8;
    }
    if (!((life3_9 == 0))) {
        lexicalValue1705_100_0 = lexicalValue1705_88_0;
        break lexical_join_100;
    }
    if (!((lexicalValue1705_88_0 != null))) {
        break lexical_join_99;
    }
    spill1705_5 = life9_26;
    if (!((life3_9 == 0))) {
        lexicalValue1705_100_0 = spill1705_5;
        break lexical_join_100;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.util.CombatEntry)(spill1705_5)).a())), ((float)(((float) life6_11)))) > 0))) {
        break lexical_join_101;
    }
    }
    lexicalValue1705_100_0 = life9_26;
    }
    life5_8 = lexicalValue1705_100_0;
    }
    life8_15 += 1;
    if (!((life3_9 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue1705_107_0 = recovery.source.CarrierOps.fcmpl(((float)(life7_13)), ((float)(0x1.4p2f)));
    }
    if (!((life3_9 == 0))) {
        lexicalValue1705_117_0 = lexicalValue1705_107_0;
        break lexical_join_117;
    }
    if (!((lexicalValue1705_107_0 > 0))) {
        break lexical_join_116;
    }
    spill1705_6 = life4_6;
    if (!((life3_9 == 0))) {
        lexicalValue1705_115_0 = spill1705_6;
        break lexical_join_115;
    }
    if (!((spill1705_6 != null))) {
        break lexical_join_116;
    }
    lexicalValue1705_115_0 = life4_6;
    }
    return lexicalValue1705_115_0;
    }
    lexicalValue1705_117_0 = life6_11;
    }
    if (!((lexicalValue1705_117_0 > 5))) {
        break lexical_join_125;
    }
    spill1705_7 = life5_8;
    if (!((life3_9 == 0))) {
        lexicalValue1705_124_0 = spill1705_7;
        break lexical_join_124;
    }
    if (!((spill1705_7 != null))) {
        break lexical_join_125;
    }
    lexicalValue1705_124_0 = life5_8;
    }
    return lexicalValue1705_124_0;
    }
    return null;
}


private java.lang.String a(net.minecraft.util.CombatEntry p0) {
net.minecraft.util.CombatEntry forwardValue5726_14_0;
    java.lang.String forwardValue5726_15_0;
    net.minecraft.util.CombatEntry spill5726_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (net.minecraft.util.CombatTracker.i ^ 134476224614652L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill5726_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue5726_14_0 = spill5726_0;
        break forward_join_14;
    }
    if (!((((net.minecraft.util.CombatEntry)(spill5726_0)).a__String() == null))) {
        break forward_join_13;
    }
    forwardValue5726_15_0 = "generic";
    break forward_join_15;
    }
    forwardValue5726_14_0 = p0;
    }
    forwardValue5726_15_0 = ((net.minecraft.util.CombatEntry)(forwardValue5726_14_0)).a__String();
    }
    return forwardValue5726_15_0;
}


public int a() {
int forwardValue5725_20_0;
    int forwardValue5725_23_0;
    boolean spill5725_0;
    long life1_3;
    int life3_5;
    forward_join_23: {
    forward_join_20: {
    forward_join_18: {
    life1_3 = (net.minecraft.util.CombatTracker.i ^ 1194716732942L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill5725_0 = this.f;
    if (!((life3_5 == 0))) {
        forwardValue5725_20_0 = ((spill5725_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!(spill5725_0)) {
        break forward_join_18;
    }
    forwardValue5725_23_0 = (((net.minecraft.entity.EntityLivingBase)(this.b)).S - this.d);
    break forward_join_23;
    }
    forwardValue5725_20_0 = this.e;
    }
    forwardValue5725_23_0 = (forwardValue5725_20_0 - this.d);
    }
    return forwardValue5725_23_0;
}


public net.minecraft.util.IChatComponent a__C5() { return __sourceHandlerCall_73a03f8d24484063f8be(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12341_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic5732_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5b7380e7aa7c_invokedynamic5732_6(int a0, long a1) throws E;
}
