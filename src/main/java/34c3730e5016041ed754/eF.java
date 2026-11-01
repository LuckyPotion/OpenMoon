package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class eF extends net.minecraft.block.Block {

public static final moom.fv Q;

public static final moom.fv R;

public static final moom.fv S;

public static final moom.fv T;

public static final moom.fv U;

public static final moom.fv[] V;

private static final long W;

private static final long[] X;

private static final java.lang.Integer[] Y;

private static final java.util.Map Z;

public eF() {
super(moom.fn.l);
    (this).a__Void(((((((this.M).a__fE()).a__fE(moom.eF.Q, java.lang.Boolean.FALSE)).a__fE(moom.eF.R, java.lang.Boolean.FALSE)).a__fE(moom.eF.S, java.lang.Boolean.FALSE)).a__fE(moom.eF.T, java.lang.Boolean.FALSE)).a__fE(moom.eF.U, java.lang.Boolean.FALSE));
    (this).a(true);
    (this).a(net.minecraft.creativetab.CreativeTabs.c);
}


static {
javax.crypto.Cipher forestValue452_36_0;
    int forestValue452_36_1;
    javax.crypto.SecretKeyFactory forestValue452_36_2;
    byte[] forestValue452_36_3;
    javax.crypto.Cipher forestValue452_53_0;
    int forestValue452_53_1;
    javax.crypto.SecretKeyFactory forestValue452_53_2;
    byte[] forestValue452_53_3;
    javax.crypto.Cipher spill452_0;
    int spill452_1;
    javax.crypto.SecretKeyFactory spill452_2;
    byte[] spill452_3;
    byte[] spill452_4;
    java.lang.String spill452_5;
    int spill452_6;
    long[] spill452_7;
    int spill452_8;
    int spill452_9;
    long spill452_10;
    byte[] spill452_11;
    byte[] spill452_12;
    byte[] spill452_13;
    byte[] spill452_14;
    byte[] spill452_15;
    byte[] spill452_16;
    byte[] spill452_17;
    byte[] spill452_18;
    long spill452_19;
    int spill452_20;
    moom.fv[] spill452_21;
    moom.fv[] spill452_22;
    moom.fv[] spill452_23;
    moom.fv[] spill452_24;
    moom.fv[] spill452_25;
    long life0_16;
    javax.crypto.Cipher life2_20;
    int life3_35;
    long[] life8_66;
    int life5_68;
    java.lang.String life6_71;
    int life7_73;
    int life4_75;
    byte[] life9_83;
    long life10_160;
    byte[] life12_228;
    forest_join_53: {
    W = ((long)(((moom._a)(moom._c.a(((long)(-349522072511204076L)), ((long)(7282118579661869649L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99903437753267L)))));
    Z = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.eF.W ^ 87057514772666L);
    spill452_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill452_1 = 2;
    spill452_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp452_9_0 = new byte[8];
    spill452_3 = __stackOp452_9_0;
    (__stackOp452_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue452_36_0 = spill452_0;
    forestValue452_36_1 = spill452_1;
    forestValue452_36_2 = spill452_2;
    forestValue452_36_3 = spill452_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue452_53_0 = forestValue452_36_0;
        forestValue452_53_1 = forestValue452_36_1;
        forestValue452_53_2 = forestValue452_36_2;
        forestValue452_53_3 = forestValue452_36_3;
        break forest_join_53;
    }
    byte[] __stackOp452_10_0 = forestValue452_36_3;
    spill452_4 = __stackOp452_10_0;
    (__stackOp452_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue452_36_3 = spill452_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue452_53_0)).init(((int)(forestValue452_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue452_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue452_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[3];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "\027¬å/·20Î¯ZDÑ§UvÄ&\005Ê"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill452_5 = life6_71;
    spill452_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill452_5)).substring(((int)(spill452_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill452_7 = life8_66;
    spill452_8 = (life5_68++);
    long __stackOp452_16_0 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    int __stackOp452_16_1 = -1;
    spill452_9 = __stackOp452_16_1;
    spill452_10 = __stackOp452_16_0;
    recovery.source.CarrierOps.discard(__stackOp452_16_1);
    life10_160 = spill452_10;
    byte[] __stackOp452_18_0 = new byte[8];
    spill452_11 = __stackOp452_18_0;
    (__stackOp452_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp452_19_0 = spill452_11;
    spill452_12 = __stackOp452_19_0;
    (__stackOp452_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp452_20_0 = spill452_12;
    spill452_13 = __stackOp452_20_0;
    (__stackOp452_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp452_21_0 = spill452_13;
    spill452_14 = __stackOp452_21_0;
    (__stackOp452_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp452_22_0 = spill452_14;
    spill452_15 = __stackOp452_22_0;
    (__stackOp452_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp452_23_0 = spill452_15;
    spill452_16 = __stackOp452_23_0;
    (__stackOp452_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp452_24_0 = spill452_16;
    spill452_17 = __stackOp452_24_0;
    (__stackOp452_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp452_25_0 = spill452_17;
    spill452_18 = __stackOp452_25_0;
    (__stackOp452_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp452_26_0 = spill452_18;
    javax.crypto.Cipher __stackOp452_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp452_26_1)).doFinal(((byte[])(__stackOp452_26_0)));
    int __stackOp452_28_0 = spill452_9;
    long __stackOp452_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill452_19 = __stackOp452_28_1;
    spill452_20 = __stackOp452_28_0;
    recovery.source.CarrierOps.discard(__stackOp452_28_1);
    recovery.source.CarrierOps.discard(spill452_20);
    (spill452_7)[spill452_8] = spill452_19;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    break forest_cycle_76;
    }
    X = ((long[])(life8_66));
    Y = ((java.lang.Integer[])(new java.lang.Integer[3]));
    Q = ((moom.fv)(moom.fv.a(((java.lang.String)("up")))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("north")))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("east")))));
    T = ((moom.fv)(moom.fv.a(((java.lang.String)("south")))));
    U = ((moom.fv)(moom.fv.a(((java.lang.String)("west")))));
    moom.fv[] __stackOp452_43_0 = new moom.fv[5];
    spill452_21 = __stackOp452_43_0;
    (__stackOp452_43_0)[0] = moom.eF.Q;
    moom.fv[] __stackOp452_45_0 = spill452_21;
    spill452_22 = __stackOp452_45_0;
    (__stackOp452_45_0)[1] = moom.eF.R;
    moom.fv[] __stackOp452_47_0 = spill452_22;
    spill452_23 = __stackOp452_47_0;
    (__stackOp452_47_0)[2] = moom.eF.T;
    moom.fv[] __stackOp452_49_0 = spill452_23;
    spill452_24 = __stackOp452_49_0;
    (__stackOp452_49_0)[3] = moom.eF.U;
    moom.fv[] __stackOp452_51_0 = spill452_24;
    spill452_25 = __stackOp452_51_0;
    (__stackOp452_51_0)[4] = moom.eF.S;
    V = ((moom.fv[])(spill452_25));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue378_25_0;
    int forwardValue378_37_0;
    int forwardValue378_49_0;
    int forwardValue378_61_0;
    int[] spill378_0;
    boolean spill378_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    forward_join_61: {
    forward_join_60: {
    forward_join_49: {
    forward_join_44: {
    forward_join_37: {
    forward_join_32: {
    forward_join_25: {
    forward_join_20: {
    life2_3 = (moom.eF.W ^ 110098515792410L);
    spill378_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill378_0;
    spill378_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eF.T))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue378_25_0 = ((spill378_1) ? 1 : 0);
        break forward_join_25;
    }
    if (!(spill378_1)) {
        break forward_join_20;
    }
    life5_6 = (life5_6 | 1);
    }
    forwardValue378_25_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eF.U))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue378_37_0 = forwardValue378_25_0;
        break forward_join_37;
    }
    if (!((forwardValue378_25_0 != 0))) {
        break forward_join_32;
    }
    life5_6 = (life5_6 | 2);
    }
    forwardValue378_37_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eF.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue378_49_0 = forwardValue378_37_0;
        break forward_join_49;
    }
    if (!((forwardValue378_37_0 != 0))) {
        break forward_join_44;
    }
    life5_6 = (life5_6 | 4);
    }
    forwardValue378_49_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eF.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_7 != null))) {
        forwardValue378_61_0 = forwardValue378_49_0;
        break forward_join_61;
    }
    if (!((forwardValue378_49_0 != 0))) {
        break forward_join_60;
    }
    life5_6 = (life5_6 | __sourceIntrinsic_8db5871551d4_invokedynamic378_22(21401, (992495264698411333L ^ life2_3)));
    }
    forwardValue378_61_0 = life5_6;
    }
    return forwardValue378_61_0;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue380_16_0;
    moom.fv forwardValue380_16_1;
    int forwardValue380_16_2;
    net.minecraft.block.state.IBlockState forwardValue380_17_0;
    moom.fv forwardValue380_17_1;
    net.minecraft.block.state.IBlockState forwardValue380_18_0;
    moom.fv forwardValue380_18_1;
    int forwardValue380_18_2;
    net.minecraft.block.state.IBlockState forwardValue380_28_0;
    moom.fv forwardValue380_28_1;
    int forwardValue380_28_2;
    net.minecraft.block.state.IBlockState forwardValue380_29_0;
    moom.fv forwardValue380_29_1;
    net.minecraft.block.state.IBlockState forwardValue380_30_0;
    moom.fv forwardValue380_30_1;
    int forwardValue380_30_2;
    net.minecraft.block.state.IBlockState forwardValue380_40_0;
    moom.fv forwardValue380_40_1;
    int forwardValue380_40_2;
    net.minecraft.block.state.IBlockState forwardValue380_41_0;
    moom.fv forwardValue380_41_1;
    net.minecraft.block.state.IBlockState forwardValue380_42_0;
    moom.fv forwardValue380_42_1;
    int forwardValue380_42_2;
    net.minecraft.block.state.IBlockState forwardValue380_56_0;
    moom.fv forwardValue380_56_1;
    int forwardValue380_56_2;
    net.minecraft.block.state.IBlockState forwardValue380_57_0;
    moom.fv forwardValue380_57_1;
    net.minecraft.block.state.IBlockState forwardValue380_58_0;
    moom.fv forwardValue380_58_1;
    int forwardValue380_58_2;
    net.minecraft.block.state.IBlockState spill380_0;
    moom.fv spill380_1;
    int spill380_2;
    net.minecraft.block.state.IBlockState spill380_3;
    moom.fv spill380_4;
    int spill380_5;
    net.minecraft.block.state.IBlockState spill380_6;
    moom.fv spill380_7;
    int spill380_8;
    net.minecraft.block.state.IBlockState spill380_9;
    moom.fv spill380_10;
    int spill380_11;
    long life2_3;
    int[] life4_5;
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.eF.W ^ 114995327461648L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill380_0 = ((moom.eF)(this)).a__fE();
    spill380_1 = moom.eF.T;
    spill380_2 = (p0 & 1);
    if (!((life4_5 != null))) {
        forwardValue380_16_0 = spill380_0;
        forwardValue380_16_1 = spill380_1;
        forwardValue380_16_2 = spill380_2;
        break forward_join_16;
    }
    if (!((spill380_2 > 0))) {
        forwardValue380_17_0 = spill380_0;
        forwardValue380_17_1 = spill380_1;
        break forward_join_17;
    }
    forwardValue380_16_0 = spill380_0;
    forwardValue380_16_1 = spill380_1;
    forwardValue380_16_2 = 1;
    }
    forwardValue380_18_0 = forwardValue380_16_0;
    forwardValue380_18_1 = forwardValue380_16_1;
    forwardValue380_18_2 = forwardValue380_16_2;
    break forward_join_18;
    }
    forwardValue380_18_0 = forwardValue380_17_0;
    forwardValue380_18_1 = forwardValue380_17_1;
    forwardValue380_18_2 = 0;
    }
    spill380_3 = ((net.minecraft.block.state.IBlockState)(forwardValue380_18_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue380_18_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue380_18_2)))))));
    spill380_4 = moom.eF.U;
    spill380_5 = (p0 & 2);
    if (!((life4_5 != null))) {
        forwardValue380_28_0 = spill380_3;
        forwardValue380_28_1 = spill380_4;
        forwardValue380_28_2 = spill380_5;
        break forward_join_28;
    }
    if (!((spill380_5 > 0))) {
        forwardValue380_29_0 = spill380_3;
        forwardValue380_29_1 = spill380_4;
        break forward_join_29;
    }
    forwardValue380_28_0 = spill380_3;
    forwardValue380_28_1 = spill380_4;
    forwardValue380_28_2 = 1;
    }
    forwardValue380_30_0 = forwardValue380_28_0;
    forwardValue380_30_1 = forwardValue380_28_1;
    forwardValue380_30_2 = forwardValue380_28_2;
    break forward_join_30;
    }
    forwardValue380_30_0 = forwardValue380_29_0;
    forwardValue380_30_1 = forwardValue380_29_1;
    forwardValue380_30_2 = 0;
    }
    spill380_6 = ((net.minecraft.block.state.IBlockState)(forwardValue380_30_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue380_30_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue380_30_2)))))));
    spill380_7 = moom.eF.R;
    spill380_8 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue380_40_0 = spill380_6;
        forwardValue380_40_1 = spill380_7;
        forwardValue380_40_2 = spill380_8;
        break forward_join_40;
    }
    if (!((spill380_8 > 0))) {
        forwardValue380_41_0 = spill380_6;
        forwardValue380_41_1 = spill380_7;
        break forward_join_41;
    }
    forwardValue380_40_0 = spill380_6;
    forwardValue380_40_1 = spill380_7;
    forwardValue380_40_2 = 1;
    }
    forwardValue380_42_0 = forwardValue380_40_0;
    forwardValue380_42_1 = forwardValue380_40_1;
    forwardValue380_42_2 = forwardValue380_40_2;
    break forward_join_42;
    }
    forwardValue380_42_0 = forwardValue380_41_0;
    forwardValue380_42_1 = forwardValue380_41_1;
    forwardValue380_42_2 = 0;
    }
    spill380_9 = ((net.minecraft.block.state.IBlockState)(forwardValue380_42_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue380_42_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue380_42_2)))))));
    spill380_10 = moom.eF.S;
    spill380_11 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic380_13(19659, (4714068690234756382L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue380_56_0 = spill380_9;
        forwardValue380_56_1 = spill380_10;
        forwardValue380_56_2 = spill380_11;
        break forward_join_56;
    }
    if (!((spill380_11 > 0))) {
        forwardValue380_57_0 = spill380_9;
        forwardValue380_57_1 = spill380_10;
        break forward_join_57;
    }
    forwardValue380_56_0 = spill380_9;
    forwardValue380_56_1 = spill380_10;
    forwardValue380_56_2 = 1;
    }
    forwardValue380_58_0 = forwardValue380_56_0;
    forwardValue380_58_1 = forwardValue380_56_1;
    forwardValue380_58_2 = forwardValue380_56_2;
    break forward_join_58;
    }
    forwardValue380_58_0 = forwardValue380_57_0;
    forwardValue380_58_1 = forwardValue380_57_1;
    forwardValue380_58_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue380_58_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue380_58_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue380_58_2)))))));
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forestValue425_15_0;
    int forestValue425_19_0;
    int forestValue425_28_0;
    int forestValue425_131_0;
    int forestValue425_145_0;
    int forestValue425_177_0;
    moom.bs forestValue425_181_0;
    int forestValue425_183_0;
    int forestValue425_267_0;
    int forestValue425_293_0;
    int forestValue425_328_0;
    int forestValue425_369_0;
    int forestValue425_378_0;
    moom.fn forestValue425_383_0;
    int forestValue425_389_0;
    int forestValue425_401_0;
    int forestValue425_408_0;
    moom.DT forestValue425_412_0;
    int forestValue425_456_0;
    int forestValue425_488_0;
    net.minecraft.block.Block forestValue425_492_0;
    int forestValue425_523_0;
    net.minecraft.block.state.IBlockState forestValue425_526_0;
    moom.fv forestValue425_526_1;
    int forestValue425_536_0;
    int forestValue425_568_0;
    boolean spill425_0;
    int spill425_1;
    moom.bs spill425_2;
    int spill425_3;
    boolean spill425_4;
    boolean spill425_5;
    boolean spill425_6;
    boolean spill425_7;
    boolean spill425_8;
    boolean spill425_9;
    moom.fn spill425_10;
    int spill425_11;
    boolean spill425_12;
    boolean spill425_13;
    boolean spill425_14;
    boolean spill425_15;
    boolean spill425_16;
    boolean spill425_17;
    boolean spill425_18;
    moom.DT spill425_19;
    net.minecraft.block.Block spill425_20;
    boolean spill425_21;
    boolean spill425_22;
    boolean spill425_23;
    boolean spill425_24;
    boolean spill425_25;
    net.minecraft.block.state.IBlockState spill425_26;
    moom.fv spill425_27;
    boolean spill425_28;
    boolean spill425_29;
    boolean spill425_30;
    long life5_3;
    int[] life7_5;
    int life8_22;
    int life9_24;
    int life10_26;
    int life11_29;
    int life12_37;
    int life13_44;
    moom.bs life11_84;
    moom.DT life12_87;
    net.minecraft.block.state.IBlockState life13_118;
    java.util.Iterator life14_121;
    moom.bs life15_128;
    moom.DT life13_229;
    net.minecraft.block.Block life14_234;
    moom.bs life15_244;
    moom.bs life16_247;
    int life17_254;
    int life18_261;
    moom.DT life19_265;
    moom.DT life20_269;
    moom.DT life13_476;
    net.minecraft.block.state.IBlockState life14_480;
    net.minecraft.block.Block life15_483;
    net.minecraft.block.state.IBlockState life16_492;
    java.util.Iterator life17_495;
    moom.bs life18_502;
    net.minecraft.block.state.IBlockState life16_570;
    java.util.Iterator life17_573;
    moom.bs life18_580;
    moom.fv life19_583;
    forest_join_569: {
    forest_join_568: {
    forest_join_563: {
    forest_join_536: {
    forest_join_531: {
    forest_join_492: {
    forest_join_491: {
    forest_join_489: {
    forest_join_488: {
    forest_join_483: {
    forest_join_456: {
    forest_join_451: {
    forest_join_412: {
    forest_join_408: {
    forest_join_404: {
    forest_join_402: {
    forest_join_401: {
    forest_join_389: {
    forest_join_383: {
    forest_join_381: {
    forest_join_379: {
    forest_join_378: {
    forest_join_369: {
    forest_join_362: {
    forest_join_328: {
    forest_join_327: {
    forest_join_293: {
    forest_join_292: {
    forest_join_267: {
    forest_join_266: {
    forest_join_183: {
    forest_join_181: {
    forest_join_180: {
    forest_join_178: {
    forest_join_177: {
    forest_join_172: {
    forest_join_145: {
    forest_join_140: {
    forest_join_75: {
    forest_join_19: {
    forest_join_15: {
    life5_3 = (moom.eF.W ^ 77410885929927L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill425_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forestValue425_15_0 = ((spill425_0) ? 1 : 0);
        break forest_join_15;
    }
    if (!((!spill425_0))) {
        break forest_join_569;
    }
    forestValue425_15_0 = ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextInt(((int)(4)));
    }
    if (!((life7_5 != null))) {
        forestValue425_19_0 = forestValue425_15_0;
        break forest_join_19;
    }
    if (!((forestValue425_15_0 == 0))) {
        break forest_join_569;
    }
    forestValue425_19_0 = 4;
    }
    life8_22 = forestValue425_19_0;
    life9_24 = 5;
    life10_26 = 0;
    life11_29 = (-life8_22);
    forest_cycle_27: while (true) {
    forest_join_72: {
    forestValue425_28_0 = life11_29;
    forest_cycle_28: while (true) {
    if (!((forestValue425_28_0 <= life8_22))) {
        break forest_join_75;
    }
    if (!((life7_5 != null))) {
        break forest_join_569;
    }
    life12_37 = (-life8_22);
    forest_cycle_35: while (true) {
    forest_join_70: {
    forest_join_69: {
    if (!((life12_37 <= life8_22))) {
        break forest_join_72;
    }
    spill425_1 = -1;
    if (!((life7_5 != null))) {
        forestValue425_28_0 = spill425_1;
        continue forest_cycle_28;
    }
    life13_44 = spill425_1;
    forest_cycle_42: while (true) {
    forest_join_67: {
    forest_join_66: {
    if (!((life13_44 <= 1))) {
        break forest_join_69;
    }
    if (!((life7_5 != null))) {
        break forest_join_70;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((int)(life11_29)), ((int)(life13_44)), ((int)(life12_37)))))))).a__ch() == this))) {
        break forest_join_66;
    }
    life9_24 += -1;
    if (!((life7_5 != null))) {
        break forest_join_67;
    }
    if (!((life9_24 <= 0))) {
        break forest_join_66;
    }
    life10_26 = 1;
    if (!((life7_5 == null))) {
        break forest_join_75;
    }
    }
    life13_44 += 1;
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    }
    life12_37 += 1;
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_35;
    }
    break forest_cycle_35;
    }
    break forest_cycle_28;
    }
    }
    life11_29 += 1;
    if (!((life7_5 == null))) {
        continue forest_cycle_27;
    }
    break forest_cycle_27;
    }
    }
    life11_84 = __sourceExactCall_e4f9611b1d30e2(((java.util.Random)(p3)));
    life12_87 = ((moom.DT)(p1)).a__DT();
    spill425_2 = life11_84;
    if (!((life7_5 != null))) {
        forestValue425_181_0 = spill425_2;
        break forest_join_181;
    }
    if (!((spill425_2 == moom.bs.UP))) {
        break forest_join_180;
    }
    spill425_3 = ((moom.DT)(p1)).b();
    if (!((life7_5 != null))) {
        forestValue425_183_0 = spill425_3;
        break forest_join_183;
    }
    if (!((spill425_3 < __sourceIntrinsic_b4b54c999db9_invokedynamic425_13(12781, (3688428331750216430L ^ life5_3))))) {
        break forest_join_180;
    }
    spill425_4 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life12_87)));
    if (!((life7_5 != null))) {
        forestValue425_183_0 = ((spill425_4) ? 1 : 0);
        break forest_join_183;
    }
    if (!(spill425_4)) {
        break forest_join_180;
    }
    if (!((life10_26 == 0))) {
        break forest_join_569;
    }
    life13_118 = p2;
    life14_121 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_109: while (true) {
    forest_join_138: {
    forest_join_132: {
    forest_join_131: {
    if (!(((java.util.Iterator)(life14_121)).hasNext())) {
        break forest_join_140;
    }
    life15_128 = ((moom.bs)(((java.util.Iterator)(life14_121)).next()));
    spill425_5 = ((java.util.Random)(p3)).nextBoolean();
    if (!((life7_5 != null))) {
        forestValue425_145_0 = ((spill425_5) ? 1 : 0);
        break forest_join_145;
    }
    if (!((life7_5 != null))) {
        forestValue425_131_0 = ((spill425_5) ? 1 : 0);
        break forest_join_131;
    }
    if (!((!spill425_5))) {
        break forest_join_132;
    }
    forestValue425_131_0 = ((((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life12_87)).a(((moom.bs)(life15_128)))))))).a__ch())))) ? 1 : 0);
    }
    if (!((forestValue425_131_0 == 0))) {
        break forest_join_138;
    }
    }
    life13_118 = ((net.minecraft.block.state.IBlockState)(life13_118)).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life15_128))))), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_109;
    }
    break forest_cycle_109;
    }
    }
    forestValue425_145_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life13_118)).a(((net.minecraft.block.properties.IProperty)(moom.eF.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue425_177_0 = forestValue425_145_0;
        break forest_join_177;
    }
    if (!((forestValue425_145_0 == 0))) {
        break forest_join_172;
    }
    spill425_6 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life13_118)).a(((net.minecraft.block.properties.IProperty)(moom.eF.S))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_177_0 = ((spill425_6) ? 1 : 0);
        break forest_join_177;
    }
    if (!((!spill425_6))) {
        break forest_join_172;
    }
    spill425_7 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life13_118)).a(((net.minecraft.block.properties.IProperty)(moom.eF.T))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_177_0 = ((spill425_7) ? 1 : 0);
        break forest_join_177;
    }
    if (!((!spill425_7))) {
        break forest_join_172;
    }
    spill425_8 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life13_118)).a(((net.minecraft.block.properties.IProperty)(moom.eF.U))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_177_0 = ((spill425_8) ? 1 : 0);
        break forest_join_177;
    }
    if (!(spill425_8)) {
        break forest_join_178;
    }
    }
    forestValue425_177_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life12_87)), ((net.minecraft.block.state.IBlockState)(life13_118)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue425_177_0);
    }
    if (!((life7_5 == null))) {
        break forest_join_569;
    }
    }
    forestValue425_181_0 = life11_84;
    }
    forestValue425_183_0 = ((((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(forestValue425_181_0)).a__bt())).b__Boolean()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue425_408_0 = forestValue425_183_0;
        break forest_join_408;
    }
    if (!((forestValue425_183_0 != 0))) {
        break forest_join_404;
    }
    spill425_9 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life11_84)))))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_408_0 = ((spill425_9) ? 1 : 0);
        break forest_join_408;
    }
    if (!((!spill425_9))) {
        break forest_join_404;
    }
    if (!((life10_26 == 0))) {
        break forest_join_569;
    }
    life13_229 = ((moom.DT)(p1)).a(((moom.bs)(life11_84)));
    life14_234 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life13_229))))).a__ch();
    spill425_10 = ((net.minecraft.block.Block)(life14_234)).J;
    if (!((life7_5 != null))) {
        forestValue425_383_0 = spill425_10;
        break forest_join_383;
    }
    if (!((spill425_10 == moom.fn.a))) {
        break forest_join_381;
    }
    life15_244 = ((moom.bs)(life11_84)).b__bs();
    life16_247 = ((moom.bs)(life11_84)).e__bs();
    life17_254 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life15_244)))))))))).booleanValue()) ? 1 : 0);
    life18_261 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life16_247)))))))))).booleanValue()) ? 1 : 0);
    life19_265 = ((moom.DT)(life13_229)).a(((moom.bs)(life15_244)));
    life20_269 = ((moom.DT)(life13_229)).a(((moom.bs)(life16_247)));
    spill425_11 = life17_254;
    if (!((life7_5 != null))) {
        forestValue425_267_0 = spill425_11;
        break forest_join_267;
    }
    if (!((spill425_11 != 0))) {
        break forest_join_266;
    }
    spill425_12 = ((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life19_265))))).a__ch())));
    if (!((life7_5 != null))) {
        forestValue425_267_0 = ((spill425_12) ? 1 : 0);
        break forest_join_267;
    }
    if (!(spill425_12)) {
        break forest_join_266;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_229)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eF)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life15_244))))), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    if (!((life7_5 == null))) {
        break forest_join_379;
    }
    }
    forestValue425_267_0 = life18_261;
    }
    if (!((life7_5 != null))) {
        forestValue425_293_0 = forestValue425_267_0;
        break forest_join_293;
    }
    if (!((forestValue425_267_0 != 0))) {
        break forest_join_292;
    }
    spill425_13 = ((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life20_269))))).a__ch())));
    if (!((life7_5 != null))) {
        forestValue425_293_0 = ((spill425_13) ? 1 : 0);
        break forest_join_293;
    }
    if (!(spill425_13)) {
        break forest_join_292;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_229)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eF)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life16_247))))), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    if (!((life7_5 == null))) {
        break forest_join_379;
    }
    }
    forestValue425_293_0 = life17_254;
    }
    if (!((life7_5 != null))) {
        forestValue425_328_0 = forestValue425_293_0;
        break forest_join_328;
    }
    if (!((forestValue425_293_0 != 0))) {
        break forest_join_327;
    }
    spill425_14 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life19_265)));
    if (!((life7_5 != null))) {
        forestValue425_328_0 = ((spill425_14) ? 1 : 0);
        break forest_join_328;
    }
    if (!(spill425_14)) {
        break forest_join_327;
    }
    spill425_15 = ((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life15_244)))))))).a__ch())));
    if (!((life7_5 != null))) {
        forestValue425_328_0 = ((spill425_15) ? 1 : 0);
        break forest_join_328;
    }
    if (!(spill425_15)) {
        break forest_join_327;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life19_265)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eF)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(((moom.bs)(life11_84)).a__bs()))))), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    if (!((life7_5 == null))) {
        break forest_join_379;
    }
    }
    forestValue425_328_0 = life18_261;
    }
    if (!((life7_5 != null))) {
        forestValue425_369_0 = forestValue425_328_0;
        break forest_join_369;
    }
    if (!((forestValue425_328_0 != 0))) {
        break forest_join_362;
    }
    spill425_16 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life20_269)));
    if (!((life7_5 != null))) {
        forestValue425_369_0 = ((spill425_16) ? 1 : 0);
        break forest_join_369;
    }
    if (!(spill425_16)) {
        break forest_join_362;
    }
    spill425_17 = ((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life16_247)))))))).a__ch())));
    if (!((life7_5 != null))) {
        forestValue425_369_0 = ((spill425_17) ? 1 : 0);
        break forest_join_369;
    }
    if (!(spill425_17)) {
        break forest_join_362;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life20_269)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eF)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(((moom.bs)(life11_84)).a__bs()))))), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)));
    if (!((life7_5 == null))) {
        break forest_join_379;
    }
    }
    forestValue425_369_0 = ((((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life13_229)).a__DT()))))).a__ch())))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue425_378_0 = forestValue425_369_0;
        break forest_join_378;
    }
    if (!((forestValue425_369_0 != 0))) {
        break forest_join_379;
    }
    forestValue425_378_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_229)), ((net.minecraft.block.state.IBlockState)(((moom.eF)(this)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue425_378_0);
    }
    if (!((life7_5 == null))) {
        break forest_join_402;
    }
    }
    forestValue425_383_0 = ((net.minecraft.block.Block)(life14_234)).J;
    }
    spill425_18 = ((moom.fn)(forestValue425_383_0)).g__Boolean();
    if (!((life7_5 != null))) {
        forestValue425_389_0 = ((spill425_18) ? 1 : 0);
        break forest_join_389;
    }
    if (!(spill425_18)) {
        break forest_join_402;
    }
    forestValue425_389_0 = ((((net.minecraft.block.Block)(life14_234)).g()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue425_401_0 = forestValue425_389_0;
        break forest_join_401;
    }
    if (!((forestValue425_389_0 != 0))) {
        break forest_join_402;
    }
    forestValue425_401_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life11_84))))), ((java.lang.Comparable)(java.lang.Boolean.TRUE))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue425_401_0);
    }
    if (!((life7_5 == null))) {
        break forest_join_569;
    }
    }
    spill425_19 = p1;
    if (!((life7_5 != null))) {
        forestValue425_412_0 = spill425_19;
        break forest_join_412;
    }
    forestValue425_408_0 = ((moom.DT)(spill425_19)).b();
    }
    if (!((forestValue425_408_0 > 1))) {
        break forest_join_569;
    }
    forestValue425_412_0 = ((moom.DT)(p1)).b__DT();
    }
    life13_476 = forestValue425_412_0;
    life14_480 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life13_476)));
    life15_483 = ((net.minecraft.block.state.IBlockState)(life14_480)).a__ch();
    spill425_20 = life15_483;
    if (!((life7_5 != null))) {
        forestValue425_492_0 = spill425_20;
        break forest_join_492;
    }
    if (!((((net.minecraft.block.Block)(spill425_20)).J == moom.fn.a))) {
        break forest_join_491;
    }
    life16_492 = p2;
    life17_495 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_431: while (true) {
    forest_join_449: {
    if (!(((java.util.Iterator)(life17_495)).hasNext())) {
        break forest_join_451;
    }
    life18_502 = ((moom.bs)(((java.util.Iterator)(life17_495)).next()));
    spill425_21 = ((java.util.Random)(p3)).nextBoolean();
    if (!((life7_5 != null))) {
        forestValue425_456_0 = ((spill425_21) ? 1 : 0);
        break forest_join_456;
    }
    if (!(spill425_21)) {
        break forest_join_449;
    }
    life16_492 = ((net.minecraft.block.state.IBlockState)(life16_492)).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(life18_502))))), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_431;
    }
    break forest_cycle_431;
    }
    }
    forestValue425_456_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_492)).a(((net.minecraft.block.properties.IProperty)(moom.eF.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue425_488_0 = forestValue425_456_0;
        break forest_join_488;
    }
    if (!((forestValue425_456_0 == 0))) {
        break forest_join_483;
    }
    spill425_22 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_492)).a(((net.minecraft.block.properties.IProperty)(moom.eF.S))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_488_0 = ((spill425_22) ? 1 : 0);
        break forest_join_488;
    }
    if (!((!spill425_22))) {
        break forest_join_483;
    }
    spill425_23 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_492)).a(((net.minecraft.block.properties.IProperty)(moom.eF.T))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_488_0 = ((spill425_23) ? 1 : 0);
        break forest_join_488;
    }
    if (!((!spill425_23))) {
        break forest_join_483;
    }
    spill425_24 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_492)).a(((net.minecraft.block.properties.IProperty)(moom.eF.U))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_488_0 = ((spill425_24) ? 1 : 0);
        break forest_join_488;
    }
    if (!(spill425_24)) {
        break forest_join_489;
    }
    }
    forestValue425_488_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_476)), ((net.minecraft.block.state.IBlockState)(life16_492)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue425_488_0);
    }
    if (!((life7_5 == null))) {
        break forest_join_569;
    }
    }
    forestValue425_492_0 = life15_483;
    }
    if (!((forestValue425_492_0 == this))) {
        break forest_join_569;
    }
    life16_570 = life14_480;
    life17_573 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_499: while (true) {
    forest_join_529: {
    forest_join_526: {
    forest_join_523: {
    if (!(((java.util.Iterator)(life17_573)).hasNext())) {
        break forest_join_531;
    }
    life18_580 = ((moom.bs)(((java.util.Iterator)(life17_573)).next()));
    life19_583 = __sourceExactCall_08c05467526468(((moom.bs)(life18_580)));
    spill425_25 = ((java.util.Random)(p3)).nextBoolean();
    if (!((life7_5 != null))) {
        forestValue425_536_0 = ((spill425_25) ? 1 : 0);
        break forest_join_536;
    }
    if (!((life7_5 != null))) {
        forestValue425_523_0 = ((spill425_25) ? 1 : 0);
        break forest_join_523;
    }
    if (!(spill425_25)) {
        break forest_join_529;
    }
    spill425_26 = p2;
    spill425_27 = life19_583;
    if (!((life7_5 != null))) {
        forestValue425_526_0 = spill425_26;
        forestValue425_526_1 = spill425_27;
        break forest_join_526;
    }
    forestValue425_523_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(spill425_26)).a(((net.minecraft.block.properties.IProperty)(spill425_27))))))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue425_523_0 != 0))) {
        break forest_join_529;
    }
    forestValue425_526_0 = life16_570;
    forestValue425_526_1 = life19_583;
    }
    life16_570 = ((net.minecraft.block.state.IBlockState)(forestValue425_526_0)).a__fE(((net.minecraft.block.properties.IProperty)(forestValue425_526_1)), ((java.lang.Comparable)(java.lang.Boolean.TRUE)));
    }
    if (!((life7_5 == null))) {
        continue forest_cycle_499;
    }
    break forest_cycle_499;
    }
    }
    forestValue425_536_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_570)).a(((net.minecraft.block.properties.IProperty)(moom.eF.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forestValue425_568_0 = forestValue425_536_0;
        break forest_join_568;
    }
    if (!((forestValue425_536_0 == 0))) {
        break forest_join_563;
    }
    spill425_28 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_570)).a(((net.minecraft.block.properties.IProperty)(moom.eF.S))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_568_0 = ((spill425_28) ? 1 : 0);
        break forest_join_568;
    }
    if (!((!spill425_28))) {
        break forest_join_563;
    }
    spill425_29 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_570)).a(((net.minecraft.block.properties.IProperty)(moom.eF.T))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_568_0 = ((spill425_29) ? 1 : 0);
        break forest_join_568;
    }
    if (!((!spill425_29))) {
        break forest_join_563;
    }
    spill425_30 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(life16_570)).a(((net.minecraft.block.properties.IProperty)(moom.eF.U))))))).booleanValue();
    if (!((life7_5 != null))) {
        forestValue425_568_0 = ((spill425_30) ? 1 : 0);
        break forest_join_568;
    }
    if (!(spill425_30)) {
        break forest_join_569;
    }
    }
    forestValue425_568_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life13_476)), ((net.minecraft.block.state.IBlockState)(life16_570)), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue425_568_0);
    }
    return;
}


private boolean b(net.minecraft.block.Block p0) {
int forwardValue377_14_0;
    int forwardValue377_18_0;
    int forwardValue377_20_0;
    boolean spill377_0;
    long life2_3;
    int[] life4_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    forward_join_14: {
    life2_3 = (moom.eF.W ^ 30913504605906L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill377_0 = ((net.minecraft.block.Block)(p0)).g();
    if (!((life4_5 != null))) {
        forwardValue377_14_0 = ((spill377_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!(spill377_0)) {
        break forward_join_19;
    }
    forwardValue377_14_0 = ((((moom.fn)(((net.minecraft.block.Block)(p0)).J)).d__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue377_18_0 = forwardValue377_14_0;
        break forward_join_18;
    }
    if (!((forwardValue377_14_0 != 0))) {
        break forward_join_19;
    }
    forwardValue377_18_0 = 1;
    }
    forwardValue377_20_0 = forwardValue377_18_0;
    break forward_join_20;
    }
    forwardValue377_20_0 = 0;
    }
    return ((forwardValue377_20_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7509_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/eF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6A18;
        if (Y[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = X[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])Z.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    Z.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/eF", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eF.Y[n2] = n3;
        }
        return Y[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_93bdb2aa2d5732(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static int e(net.minecraft.block.state.IBlockState p0) {
int lexicalValue1146_37_0;
    int[] spill1146_0;
    boolean spill1146_1;
    long life1_3;
    int life4_6;
    moom.fv[] life5_8;
    int[] life3_9;
    int life6_12;
    int life7_14;
    moom.fv life8_21;
    lexical_join_37: {
    lexical_join_36: {
    life1_3 = (moom.eF.W ^ 24222403695659L);
    spill1146_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life4_6 = 0;
    life5_8 = moom.eF.V;
    life3_9 = spill1146_0;
    life6_12 = (life5_8).length;
    life7_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_34: {
    lexical_join_33: {
    if (!((life7_14 < life6_12))) {
        break lexical_join_36;
    }
    life8_21 = (life5_8)[life7_14];
    if (!((life3_9 != null))) {
        break lexical_join_34;
    }
    spill1146_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(life8_21))))))).booleanValue();
    if (!((life3_9 != null))) {
        lexicalValue1146_37_0 = ((spill1146_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!(spill1146_1)) {
        break lexical_join_33;
    }
    life4_6 += 1;
    }
    life7_14 += 1;
    }
    if (!((life3_9 == null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue1146_37_0 = life4_6;
    }
    return lexicalValue1146_37_0;
}


public int d(net.minecraft.block.state.IBlockState p0) {
return moom.Ef.c();
}


public int d__Int() {
return moom.Ef.c();
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.eF.Q, moom.eF.R, moom.eF.S, moom.eF.T, moom.eF.U});
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1) {
return ((1) != 0);
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue376_55_0;
    int forwardValue376_81_0;
    int forwardValue376_107_0;
    int forwardValue376_127_0;
    int forwardValue376_139_0;
    moom.eF forwardValue376_155_0;
    int[] spill376_0;
    boolean spill376_1;
    moom.eF spill376_2;
    long life3_3;
    float life6_6;
    float life7_8;
    float life8_10;
    int[] life5_11;
    float life9_13;
    float life10_15;
    float life11_17;
    float life12_19;
    int life13_21;
    forward_join_155: {
    forward_join_154: {
    forward_join_139: {
    forward_join_127: {
    forward_join_126: {
    forward_join_107: {
    forward_join_100: {
    forward_join_81: {
    forward_join_74: {
    forward_join_55: {
    forward_join_48: {
    life3_3 = (moom.eF.W ^ 105563401544095L);
    spill376_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_6 = 0x1.0p-4f;
    life7_8 = 0x1.0p0f;
    life8_10 = 0x1.0p0f;
    life5_11 = spill376_0;
    life9_13 = 0x1.0p0f;
    life10_15 = 0x0.0p0f;
    life11_17 = 0x0.0p0f;
    life12_19 = 0x0.0p0f;
    life13_21 = 0;
    spill376_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eF.U))))))).booleanValue();
    if (!((life5_11 != null))) {
        forwardValue376_55_0 = ((spill376_1) ? 1 : 0);
        break forward_join_55;
    }
    if (!(spill376_1)) {
        break forward_join_48;
    }
    life10_15 = java.lang.Math.max(((float)(life10_15)), ((float)(0x1.0p-4f)));
    life7_8 = 0x0.0p0f;
    life8_10 = 0x0.0p0f;
    life11_17 = 0x1.0p0f;
    life9_13 = 0x0.0p0f;
    life12_19 = 0x1.0p0f;
    life13_21 = 1;
    }
    forwardValue376_55_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eF.S))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life5_11 != null))) {
        forwardValue376_81_0 = forwardValue376_55_0;
        break forward_join_81;
    }
    if (!((forwardValue376_55_0 != 0))) {
        break forward_join_74;
    }
    life7_8 = java.lang.Math.min(((float)(life7_8)), ((float)(0x1.ep-1f)));
    life10_15 = 0x1.0p0f;
    life8_10 = 0x0.0p0f;
    life11_17 = 0x1.0p0f;
    life9_13 = 0x0.0p0f;
    life12_19 = 0x1.0p0f;
    life13_21 = 1;
    }
    forwardValue376_81_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eF.R))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life5_11 != null))) {
        forwardValue376_107_0 = forwardValue376_81_0;
        break forward_join_107;
    }
    if (!((forwardValue376_81_0 != 0))) {
        break forward_join_100;
    }
    life12_19 = java.lang.Math.max(((float)(life12_19)), ((float)(0x1.0p-4f)));
    life9_13 = 0x0.0p0f;
    life7_8 = 0x0.0p0f;
    life10_15 = 0x1.0p0f;
    life8_10 = 0x0.0p0f;
    life11_17 = 0x1.0p0f;
    life13_21 = 1;
    }
    forwardValue376_107_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eF.T))))))).booleanValue()) ? 1 : 0);
    }
    if (!((life5_11 != null))) {
        forwardValue376_127_0 = forwardValue376_107_0;
        break forward_join_127;
    }
    if (!((forwardValue376_107_0 != 0))) {
        break forward_join_126;
    }
    life9_13 = java.lang.Math.min(((float)(life9_13)), ((float)(0x1.ep-1f)));
    life12_19 = 0x1.0p0f;
    life7_8 = 0x0.0p0f;
    life10_15 = 0x1.0p0f;
    life8_10 = 0x0.0p0f;
    life11_17 = 0x1.0p0f;
    life13_21 = 1;
    }
    forwardValue376_127_0 = life13_21;
    }
    if (!((life5_11 != null))) {
        forwardValue376_139_0 = forwardValue376_127_0;
        break forward_join_139;
    }
    if (!((forwardValue376_127_0 == 0))) {
        break forward_join_154;
    }
    spill376_2 = this;
    if (!((life5_11 != null))) {
        forwardValue376_155_0 = spill376_2;
        break forward_join_155;
    }
    forwardValue376_139_0 = ((((moom.eF)(spill376_2)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())))) ? 1 : 0);
    }
    if (!((forwardValue376_139_0 != 0))) {
        break forward_join_154;
    }
    life8_10 = java.lang.Math.min(((float)(life8_10)), ((float)(0x1.ep-1f)));
    life11_17 = 0x1.0p0f;
    life7_8 = 0x0.0p0f;
    life10_15 = 0x1.0p0f;
    life9_13 = 0x0.0p0f;
    life12_19 = 0x1.0p0f;
    }
    forwardValue376_155_0 = this;
    }
    ((moom.eF)(forwardValue376_155_0)).a(((float)(life7_8)), ((float)(life8_10)), ((float)(life9_13)), ((float)(life10_15)), ((float)(life11_17)), ((float)(life12_19)));
    return;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public void a__Void() {
((moom.eF)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    return;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
return ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eF.Q)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p1)).a__fE(((moom.DT)(((moom.DT)(p2)).a__DT()))))).a__ch())).d__Boolean()))))));
}


public static moom.fv a(moom.bs p0) {
long local1 = (moom.eF.W ^ 115690540520743L);
    switch ((moom.fh.a)[((moom.bs)(p0)).ordinal()]) {
case 1:
{
        return moom.eF.Q;
    }
case 2:
{
        return moom.eF.R;
    }
case 3:
{
        return moom.eF.T;
    }
case 4:
{
        return moom.eF.S;
    }
case 5:
{
        return moom.eF.U;
    }
default:
{
        throw new java.lang.IllegalArgumentException(__sourceIntrinsic_c078088f7816_invokedynamic6340_8(p0));
    }
}
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
return null;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3432_16_0;
    int forwardValue3432_28_0;
    boolean spill3432_0;
    long life5_3;
    int[] life7_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_16: {
    life5_3 = (moom.eF.W ^ 91343631775558L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3432_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3432_16_0 = ((spill3432_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!((!spill3432_0))) {
        break forward_join_29;
    }
    forwardValue3432_16_0 = ((((moom.eF)(this)).a__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)))) ? 1 : 0);
    }
    if (!((life7_5 != null))) {
        forwardValue3432_28_0 = forwardValue3432_16_0;
        break forward_join_28;
    }
    if (!((forwardValue3432_16_0 == 0))) {
        break forward_join_29;
    }
    ((moom.eF)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    forwardValue3432_28_0 = ((((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3432_28_0);
    }
    return;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
return ((net.minecraft.world.biome.BiomeGenBase)(((net.minecraft.world.IBlockAccess)(p0)).a__ES(((moom.DT)(p1))))).b(((moom.DT)(p1)));
}


private boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
int lexicalValue1144_39_0;
    net.minecraft.block.state.IBlockState lexicalValue1144_61_0;
    moom.fv lexicalValue1144_61_1;
    net.minecraft.block.state.IBlockState lexicalValue1144_63_0;
    int lexicalValue1144_70_0;
    net.minecraft.block.state.IBlockState lexicalValue1144_74_0;
    int[] spill1144_0;
    boolean spill1144_1;
    net.minecraft.block.state.IBlockState spill1144_2;
    net.minecraft.block.state.IBlockState spill1144_3;
    moom.fv spill1144_4;
    net.minecraft.block.state.IBlockState spill1144_5;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_6;
    int[] life6_7;
    java.util.Iterator life8_10;
    moom.bs life9_17;
    moom.fv life10_20;
    net.minecraft.block.state.IBlockState life11_53;
    lexical_join_82: {
    lexical_join_74: {
    lexical_join_73: {
    lexical_join_70: {
    lexical_join_66: {
    life4_3 = (moom.eF.W ^ 64285767275719L);
    spill1144_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = p2;
    life6_7 = spill1144_0;
    life8_10 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    lexical_cycle_11: while (true) {
    lexical_join_64: {
    lexical_join_63: {
    lexical_join_61: {
    lexical_join_59: {
    lexical_join_39: {
    if (!(((java.util.Iterator)(life8_10)).hasNext())) {
        break lexical_join_66;
    }
    life9_17 = ((moom.bs)(((java.util.Iterator)(life8_10)).next()));
    life10_20 = __sourceExactCall_08c05467526468(((moom.bs)(life9_17)));
    spill1144_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(life10_20))))))).booleanValue();
    if (!((life6_7 != null))) {
        lexicalValue1144_70_0 = ((spill1144_1) ? 1 : 0);
        break lexical_join_70;
    }
    if (!((life6_7 != null))) {
        lexicalValue1144_39_0 = ((spill1144_1) ? 1 : 0);
        break lexical_join_39;
    }
    if (!(spill1144_1)) {
        break lexical_join_64;
    }
    lexicalValue1144_39_0 = ((((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(life9_17)))))))).a__ch())))) ? 1 : 0);
    }
    if (!((lexicalValue1144_39_0 == 0))) {
        break lexical_join_64;
    }
    life11_53 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT())));
    spill1144_2 = life11_53;
    if (!((life6_7 != null))) {
        lexicalValue1144_63_0 = spill1144_2;
        break lexical_join_63;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill1144_2)).a__ch() == this))) {
        break lexical_join_59;
    }
    spill1144_3 = life11_53;
    spill1144_4 = life10_20;
    if (!((life6_7 != null))) {
        lexicalValue1144_61_0 = spill1144_3;
        lexicalValue1144_61_1 = spill1144_4;
        break lexical_join_61;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(spill1144_3)).a(((net.minecraft.block.properties.IProperty)(spill1144_4))))))).booleanValue()))) {
        break lexical_join_64;
    }
    }
    lexicalValue1144_61_0 = p2;
    lexicalValue1144_61_1 = life10_20;
    }
    lexicalValue1144_63_0 = ((net.minecraft.block.state.IBlockState)(lexicalValue1144_61_0)).a__fE(((net.minecraft.block.properties.IProperty)(lexicalValue1144_61_1)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    }
    p2 = lexicalValue1144_63_0;
    }
    if (!((life6_7 == null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    spill1144_5 = p2;
    if (!((life6_7 != null))) {
        lexicalValue1144_74_0 = spill1144_5;
        break lexical_join_74;
    }
    lexicalValue1144_70_0 = moom.eF.e(((net.minecraft.block.state.IBlockState)(spill1144_5)));
    }
    if (!((lexicalValue1144_70_0 == 0))) {
        break lexical_join_73;
    }
    return ((0) != 0);
    }
    lexicalValue1144_74_0 = life7_6;
    }
    if (!((lexicalValue1144_74_0 != p2))) {
        break lexical_join_82;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)));
    }
    return ((1) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
int forwardValue350_32_0;
    int spill350_0;
    long life4_3;
    int[] life6_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_21: {
    forward_join_13: {
    life4_3 = (moom.eF.W ^ 70339048076285L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill350_0 = (moom.fh.a)[((moom.bs)(p2)).ordinal()];
    if (!((life6_5 != null))) {
        forwardValue350_32_0 = spill350_0;
        break forward_join_32;
    }
    switch (spill350_0) {
case 1:
{
        break forward_join_13;
    }
case 2:
case 3:
case 4:
case 5:
{
        break forward_join_21;
    }
default:
{
        break forward_join_31;
    }
}
    }
    return ((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a__DT()))))).a__ch())));
    }
    return ((moom.eF)(this)).b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs())))))))).a__ch())));
    }
    forwardValue350_32_0 = 0;
    }
    return ((forwardValue350_32_0) != 0);
}


public int a(java.util.Random p0) {
return 0;
}


public void a(net.minecraft.world.World p0, net.minecraft.entity.player.EntityPlayer p1, moom.DT p2, net.minecraft.block.state.IBlockState p3, net.minecraft.tileentity.TileEntity p4) {
net.minecraft.item.ItemStack forwardValue374_18_0;
    net.minecraft.entity.player.EntityPlayer forwardValue374_22_0;
    net.minecraft.item.ItemStack spill374_0;
    net.minecraft.entity.player.EntityPlayer spill374_1;
    long life6_3;
    int[] life8_5;
    forward_join_45: {
    forward_join_38: {
    forward_join_22: {
    forward_join_18: {
    life6_3 = (moom.eF.W ^ 64883597757323L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_38;
    }
    spill374_0 = ((net.minecraft.entity.player.EntityPlayer)(p1)).c__xW();
    if (!((life8_5 != null))) {
        forwardValue374_18_0 = spill374_0;
        break forward_join_18;
    }
    if (!((spill374_0 != null))) {
        break forward_join_38;
    }
    spill374_1 = p1;
    if (!((life8_5 != null))) {
        forwardValue374_22_0 = spill374_1;
        break forward_join_22;
    }
    forwardValue374_18_0 = ((net.minecraft.entity.player.EntityPlayer)(spill374_1)).c__xW();
    }
    if (!((((net.minecraft.item.ItemStack)(forwardValue374_18_0)).a__wQ() == net.minecraft.init.Items.a4))) {
        break forward_join_38;
    }
    forwardValue374_22_0 = p1;
    }
    ((net.minecraft.entity.player.EntityPlayer)(forwardValue374_22_0)).a(((moom.BY)((net.minecraft.stats.StatList.ab)[__sourceExactCall_4be9acdbe11525(((net.minecraft.block.Block)(this)))])));
    __sourceExactCall_557bf9ca14a917(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(net.minecraft.init.Blocks.bc, 1, 0))));
    if (!((life8_5 == null))) {
        break forward_join_45;
    }
    }
    super.a(((net.minecraft.world.World)(p0)), ((net.minecraft.entity.player.EntityPlayer)(p1)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((net.minecraft.tileentity.TileEntity)(p4)));
    }
    return;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return null;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
long local9 = (moom.eF.W ^ 80117697484685L);
    java.lang.Object local11 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.eF)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eF.Q)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eF.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eF.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eF.T)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eF.U)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    return ((__sourceIntrinsic_booleanComparison(((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).b__Boolean()) != 0) ? ((net.minecraft.block.state.IBlockState)(local11)).a__fE(((net.minecraft.block.properties.IProperty)(__sourceExactCall_08c05467526468(((moom.bs)(((moom.bs)(p2)).a__bs()))))), ((java.lang.Comparable)(java.lang.Boolean.TRUE))) : ((net.minecraft.block.state.IBlockState)(local11)));
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c078088f7816_invokedynamic6340_8(moom.bs a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7509_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic378_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic425_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic380_13(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native moom.bs __sourceExactCall_e4f9611b1d30e2(java.util.Random p0);
private static native moom.fv __sourceExactCall_08c05467526468(moom.bs p0);
private static native int __sourceExactCall_93bdb2aa2d5732(int p0, long p1);
private static native int __sourceExactCall_4be9acdbe11525(net.minecraft.block.Block p0);
private static native void __sourceExactCall_557bf9ca14a917(net.minecraft.world.World p0, moom.DT p1, net.minecraft.item.ItemStack p2);
}
