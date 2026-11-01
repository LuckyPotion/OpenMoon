package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class eC extends net.minecraft.block.Block {

public static final moom.fx Q;

public static final moom.fv R;

public static final moom.fw<moom.as> S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map W;

protected eC(moom.fn p0) {
super(p0);
    ((moom.eC)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(this.M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.Q)), ((java.lang.Comparable)(moom.bs.NORTH))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.S)), ((java.lang.Comparable)(moom.as.BOTTOM))))));
    float local2 = 0x1.0p-1f;
    float local3 = 0x1.0p0f;
    ((moom.eC)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((moom.eC)(this)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.d)));
    return;
}


static {
javax.crypto.Cipher forestValue451_36_0;
    int forestValue451_36_1;
    javax.crypto.SecretKeyFactory forestValue451_36_2;
    byte[] forestValue451_36_3;
    javax.crypto.Cipher forestValue451_53_0;
    int forestValue451_53_1;
    javax.crypto.SecretKeyFactory forestValue451_53_2;
    byte[] forestValue451_53_3;
    long[] forestValue451_157_0;
    int forestValue451_157_1;
    long forestValue451_157_2;
    int forestValue451_157_3;
    long[] forestValue451_300_0;
    int forestValue451_300_1;
    long forestValue451_300_2;
    long[] forestValue451_312_0;
    int forestValue451_312_1;
    long forestValue451_312_2;
    javax.crypto.Cipher spill451_0;
    int spill451_1;
    javax.crypto.SecretKeyFactory spill451_2;
    byte[] spill451_3;
    byte[] spill451_4;
    java.lang.String spill451_5;
    int spill451_6;
    int spill451_7;
    long spill451_8;
    byte[] spill451_9;
    byte[] spill451_10;
    byte[] spill451_11;
    byte[] spill451_12;
    byte[] spill451_13;
    byte[] spill451_14;
    byte[] spill451_15;
    byte[] spill451_16;
    long spill451_17;
    int spill451_18;
    java.lang.String spill451_19;
    int spill451_20;
    long[] spill451_21;
    int spill451_22;
    long spill451_23;
    int spill451_24;
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
    byte[] life9_325;
    forest_join_399: {
    forest_join_53: {
    T = ((long)(((moom._a)(moom._c.a(((long)(-5574758857132944268L)), ((long)(422910465481995836L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(64907342331490L)))));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    life0_16 = (moom.eC.T ^ 51929402351145L);
    spill451_0 = (life2_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill451_1 = 2;
    spill451_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp451_9_0 = new byte[8];
    spill451_3 = __stackOp451_9_0;
    (__stackOp451_9_0)[0] = ((byte) ((int) (life0_16 >>> 56)));
    life3_35 = 1;
    forestValue451_36_0 = spill451_0;
    forestValue451_36_1 = spill451_1;
    forestValue451_36_2 = spill451_2;
    forestValue451_36_3 = spill451_3;
    forest_cycle_36: while (true) {
    if (!((life3_35 < 8))) {
        forestValue451_53_0 = forestValue451_36_0;
        forestValue451_53_1 = forestValue451_36_1;
        forestValue451_53_2 = forestValue451_36_2;
        forestValue451_53_3 = forestValue451_36_3;
        break forest_join_53;
    }
    byte[] __stackOp451_10_0 = forestValue451_36_3;
    spill451_4 = __stackOp451_10_0;
    (__stackOp451_10_0)[life3_35] = ((byte) ((int) ((life0_16 << (life3_35 * 8)) >>> 56)));
    life3_35 += 1;
    forestValue451_36_3 = spill451_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue451_53_0)).init(((int)(forestValue451_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue451_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue451_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life8_66 = new long[6];
    life5_68 = 0;
    life7_73 = ((java.lang.String)((life6_71 = "L22\"¹¥mgÕqK³ø¢.m¸a£Ü&²ZÍª¦â\026e"))).length();
    life4_75 = 0;
    forest_cycle_76: while (true) {
    spill451_5 = life6_71;
    spill451_6 = life4_75;
    life4_75 += 8;
    life9_83 = ((java.lang.String)(((java.lang.String)(spill451_5)).substring(((int)(spill451_6)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue451_157_0 = life8_66;
    forestValue451_157_1 = (life5_68++);
    forestValue451_157_2 = (((((((((((long) (life9_83)[0]) & 255L) << 56) | ((((long) (life9_83)[1]) & 255L) << 48)) | ((((long) (life9_83)[2]) & 255L) << 40)) | ((((long) (life9_83)[3]) & 255L) << 32)) | ((((long) (life9_83)[4]) & 255L) << 24)) | ((((long) (life9_83)[5]) & 255L) << 16)) | ((((long) (life9_83)[6]) & 255L) << 8)) | (((long) (life9_83)[7]) & 255L));
    forestValue451_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp451_16_0 = forestValue451_157_2;
    int __stackOp451_16_1 = forestValue451_157_3;
    spill451_7 = __stackOp451_16_1;
    spill451_8 = __stackOp451_16_0;
    recovery.source.CarrierOps.discard(__stackOp451_16_1);
    life10_160 = spill451_8;
    byte[] __stackOp451_18_0 = new byte[8];
    spill451_9 = __stackOp451_18_0;
    (__stackOp451_18_0)[0] = ((byte) ((int) (life10_160 >>> 56)));
    byte[] __stackOp451_19_0 = spill451_9;
    spill451_10 = __stackOp451_19_0;
    (__stackOp451_19_0)[1] = ((byte) ((int) (life10_160 >>> 48)));
    byte[] __stackOp451_20_0 = spill451_10;
    spill451_11 = __stackOp451_20_0;
    (__stackOp451_20_0)[2] = ((byte) ((int) (life10_160 >>> 40)));
    byte[] __stackOp451_21_0 = spill451_11;
    spill451_12 = __stackOp451_21_0;
    (__stackOp451_21_0)[3] = ((byte) ((int) (life10_160 >>> 32)));
    byte[] __stackOp451_22_0 = spill451_12;
    spill451_13 = __stackOp451_22_0;
    (__stackOp451_22_0)[4] = ((byte) ((int) (life10_160 >>> 24)));
    byte[] __stackOp451_23_0 = spill451_13;
    spill451_14 = __stackOp451_23_0;
    (__stackOp451_23_0)[5] = ((byte) ((int) (life10_160 >>> 16)));
    byte[] __stackOp451_24_0 = spill451_14;
    spill451_15 = __stackOp451_24_0;
    (__stackOp451_24_0)[6] = ((byte) ((int) (life10_160 >>> 8)));
    byte[] __stackOp451_25_0 = spill451_15;
    spill451_16 = __stackOp451_25_0;
    (__stackOp451_25_0)[7] = ((byte) ((int) life10_160));
    byte[] __stackOp451_26_0 = spill451_16;
    javax.crypto.Cipher __stackOp451_26_1 = life2_20;
    life12_228 = ((javax.crypto.Cipher)(__stackOp451_26_1)).doFinal(((byte[])(__stackOp451_26_0)));
    int __stackOp451_28_0 = spill451_7;
    long __stackOp451_28_1 = (((((((((((long) (life12_228)[0]) & 255L) << 56) | ((((long) (life12_228)[1]) & 255L) << 48)) | ((((long) (life12_228)[2]) & 255L) << 40)) | ((((long) (life12_228)[3]) & 255L) << 32)) | ((((long) (life12_228)[4]) & 255L) << 24)) | ((((long) (life12_228)[5]) & 255L) << 16)) | ((((long) (life12_228)[6]) & 255L) << 8)) | (((long) (life12_228)[7]) & 255L));
    spill451_17 = __stackOp451_28_1;
    spill451_18 = __stackOp451_28_0;
    recovery.source.CarrierOps.discard(__stackOp451_28_1);
    switch (spill451_18) {
default:
{
        forestValue451_300_0 = forestValue451_157_0;
        forestValue451_300_1 = forestValue451_157_1;
        forestValue451_300_2 = spill451_17;
        break forest_join_300;
    }
case 0:
{
        forestValue451_312_0 = forestValue451_157_0;
        forestValue451_312_1 = forestValue451_157_1;
        forestValue451_312_2 = spill451_17;
        break forest_join_312;
    }
}
    }
    (forestValue451_300_0)[forestValue451_300_1] = forestValue451_300_2;
    if (!((life4_75 >= life7_73))) {
        continue forest_cycle_76;
    }
    life7_73 = ((java.lang.String)((life6_71 = "À?Ïð4 2k?ãGýTY"))).length();
    life4_75 = 0;
    break forest_join_317;
    }
    (forestValue451_312_0)[forestValue451_312_1] = forestValue451_312_2;
    if (!((life4_75 >= life7_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill451_19 = life6_71;
    spill451_20 = life4_75;
    life4_75 += 8;
    life9_325 = ((java.lang.String)(((java.lang.String)(spill451_19)).substring(((int)(spill451_20)), ((int)(life4_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill451_21 = life8_66;
    spill451_22 = (life5_68++);
    spill451_23 = (((((((((((long) (life9_325)[0]) & 255L) << 56) | ((((long) (life9_325)[1]) & 255L) << 48)) | ((((long) (life9_325)[2]) & 255L) << 40)) | ((((long) (life9_325)[3]) & 255L) << 32)) | ((((long) (life9_325)[4]) & 255L) << 24)) | ((((long) (life9_325)[5]) & 255L) << 16)) | ((((long) (life9_325)[6]) & 255L) << 8)) | (((long) (life9_325)[7]) & 255L));
    spill451_24 = 0;
    forestValue451_157_0 = spill451_21;
    forestValue451_157_1 = spill451_22;
    forestValue451_157_2 = spill451_23;
    forestValue451_157_3 = spill451_24;
    continue forest_cycle_157;
    }
    }
    }
    U = ((long[])(life8_66));
    V = ((java.lang.Integer[])(new java.lang.Integer[6]));
    Q = ((moom.fx)(moom.fx.a(((java.lang.String)("facing")), ((com.google.common.base.Predicate)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)))));
    R = ((moom.fv)(moom.fv.a(((java.lang.String)("open")))));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("half")), ((java.lang.Class)(moom.as.class)))));
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue343_20_0;
    moom.fv forwardValue343_20_1;
    int forwardValue343_20_2;
    net.minecraft.block.state.IBlockState forwardValue343_21_0;
    moom.fv forwardValue343_21_1;
    net.minecraft.block.state.IBlockState forwardValue343_22_0;
    moom.fv forwardValue343_22_1;
    int forwardValue343_22_2;
    net.minecraft.block.state.IBlockState forwardValue343_35_0;
    moom.fw forwardValue343_35_1;
    net.minecraft.block.state.IBlockState forwardValue343_36_0;
    moom.fw forwardValue343_36_1;
    moom.as forwardValue343_36_2;
    net.minecraft.block.state.IBlockState spill343_0;
    moom.fv spill343_1;
    int spill343_2;
    net.minecraft.block.state.IBlockState spill343_3;
    moom.fw spill343_4;
    long life2_3;
    int[] life4_5;
    forward_join_36: {
    forward_join_35: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.eC.T ^ 5257989003861L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill343_0 = ((net.minecraft.block.state.IBlockState)(((moom.eC)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.Q)), ((java.lang.Comparable)(moom.eC.a(((int)(p0))))));
    spill343_1 = moom.eC.R;
    spill343_2 = (p0 & 4);
    if (!((life4_5 != null))) {
        forwardValue343_20_0 = spill343_0;
        forwardValue343_20_1 = spill343_1;
        forwardValue343_20_2 = spill343_2;
        break forward_join_20;
    }
    if (!((spill343_2 != 0))) {
        forwardValue343_21_0 = spill343_0;
        forwardValue343_21_1 = spill343_1;
        break forward_join_21;
    }
    forwardValue343_20_0 = spill343_0;
    forwardValue343_20_1 = spill343_1;
    forwardValue343_20_2 = 1;
    }
    forwardValue343_22_0 = forwardValue343_20_0;
    forwardValue343_22_1 = forwardValue343_20_1;
    forwardValue343_22_2 = forwardValue343_20_2;
    break forward_join_22;
    }
    forwardValue343_22_0 = forwardValue343_21_0;
    forwardValue343_22_1 = forwardValue343_21_1;
    forwardValue343_22_2 = 0;
    }
    spill343_3 = ((net.minecraft.block.state.IBlockState)(forwardValue343_22_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue343_22_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue343_22_2)))))));
    spill343_4 = moom.eC.S;
    if (!(((p0 & __sourceIntrinsic_819466f05fee_invokedynamic343_10(23695, (8292196654668963713L ^ life2_3))) == 0))) {
        forwardValue343_35_0 = spill343_3;
        forwardValue343_35_1 = spill343_4;
        break forward_join_35;
    }
    forwardValue343_36_0 = spill343_3;
    forwardValue343_36_1 = spill343_4;
    forwardValue343_36_2 = moom.as.BOTTOM;
    break forward_join_36;
    }
    forwardValue343_36_0 = forwardValue343_35_0;
    forwardValue343_36_1 = forwardValue343_35_1;
    forwardValue343_36_2 = moom.as.TOP;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue343_36_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue343_36_1)), ((java.lang.Comparable)(forwardValue343_36_2)));
}


private static boolean b(net.minecraft.block.Block p0) {
net.minecraft.block.Block forwardValue340_18_0;
    net.minecraft.block.Block forwardValue340_23_0;
    int forwardValue340_33_0;
    int forwardValue340_35_0;
    net.minecraft.block.Block spill340_0;
    boolean spill340_1;
    int spill340_2;
    int spill340_3;
    long life1_3;
    int[] life3_5;
    forward_join_35: {
    forward_join_34: {
    forward_join_33: {
    forward_join_32: {
    forward_join_23: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.eC.T ^ 37063566181378L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill340_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue340_18_0 = spill340_0;
        break forward_join_18;
    }
    if (!(((moom.fn)(((net.minecraft.block.Block)(spill340_0)).J)).g__Boolean())) {
        break forward_join_17;
    }
    spill340_1 = ((net.minecraft.block.Block)(p0)).g();
    if (!((life3_5 != null))) {
        forwardValue340_33_0 = ((spill340_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill340_1))) {
        break forward_join_32;
    }
    }
    forwardValue340_18_0 = p0;
    }
    if (!((life3_5 != null))) {
        forwardValue340_23_0 = forwardValue340_18_0;
        break forward_join_23;
    }
    if (!((forwardValue340_18_0 != net.minecraft.init.Blocks.aX))) {
        break forward_join_32;
    }
    forwardValue340_23_0 = p0;
    }
    spill340_2 = ((forwardValue340_23_0 instanceof moom.ei) ? 1 : 0);
    if (!((life3_5 != null))) {
        forwardValue340_33_0 = spill340_2;
        break forward_join_33;
    }
    if (!((spill340_2 == 0))) {
        break forward_join_32;
    }
    spill340_3 = ((p0 instanceof moom.ew) ? 1 : 0);
    if (!((life3_5 != null))) {
        forwardValue340_33_0 = spill340_3;
        break forward_join_33;
    }
    if (!((spill340_3 != 0))) {
        break forward_join_34;
    }
    }
    forwardValue340_33_0 = 1;
    }
    forwardValue340_35_0 = forwardValue340_33_0;
    break forward_join_35;
    }
    forwardValue340_35_0 = 0;
    }
    return ((forwardValue340_35_0) != 0);
}


public void b__Void(net.minecraft.block.state.IBlockState p0) {
net.minecraft.block.state.IBlockState forwardValue342_13_0;
    int forwardValue342_20_0;
    moom.bs forwardValue342_73_0;
    moom.bs forwardValue342_73_1;
    moom.bs forwardValue342_86_0;
    moom.bs forwardValue342_86_1;
    moom.bs forwardValue342_99_0;
    moom.bs forwardValue342_99_1;
    net.minecraft.block.state.IBlockState spill342_0;
    moom.bs spill342_1;
    moom.bs spill342_2;
    long life2_3;
    int[] life4_5;
    int life5_28;
    java.lang.Boolean life6_33;
    moom.bs life7_38;
    float life8_40;
    forward_join_108: {
    forward_join_99: {
    forward_join_97: {
    forward_join_86: {
    forward_join_84: {
    forward_join_73: {
    forward_join_71: {
    forward_join_55: {
    forward_join_47: {
    forward_join_45: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life2_3 = (moom.eC.T ^ 136465821087781L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill342_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue342_13_0 = spill342_0;
        break forward_join_13;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill342_0)).a__ch() == this))) {
        break forward_join_108;
    }
    forwardValue342_13_0 = p0;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue342_13_0)).a(((net.minecraft.block.properties.IProperty)(moom.eC.S))) == moom.as.TOP))) {
        break forward_join_19;
    }
    forwardValue342_20_0 = 1;
    break forward_join_20;
    }
    forwardValue342_20_0 = 0;
    }
    life5_28 = forwardValue342_20_0;
    life6_33 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eC.R)))));
    life7_38 = ((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eC.Q)))));
    life8_40 = 0x1.8p-3f;
    if (!((life4_5 != null))) {
        break forward_join_45;
    }
    if (!((life5_28 != 0))) {
        break forward_join_47;
    }
    ((moom.eC)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.ap-1f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    if (!((life4_5 == null))) {
        break forward_join_55;
    }
    }
    ((moom.eC)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.8p-3f)), ((float)(0x1.0p0f)));
    }
    if (!(((java.lang.Boolean)(life6_33)).booleanValue())) {
        break forward_join_108;
    }
    spill342_1 = life7_38;
    spill342_2 = moom.bs.NORTH;
    if (!((life4_5 != null))) {
        forwardValue342_73_0 = spill342_1;
        forwardValue342_73_1 = spill342_2;
        break forward_join_73;
    }
    if (!((spill342_1 == spill342_2))) {
        break forward_join_71;
    }
    ((moom.eC)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.ap-1f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    forwardValue342_73_0 = life7_38;
    forwardValue342_73_1 = moom.bs.SOUTH;
    }
    if (!((life4_5 != null))) {
        forwardValue342_86_0 = forwardValue342_73_0;
        forwardValue342_86_1 = forwardValue342_73_1;
        break forward_join_86;
    }
    if (!((forwardValue342_73_0 == forwardValue342_73_1))) {
        break forward_join_84;
    }
    ((moom.eC)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.8p-3f)));
    }
    forwardValue342_86_0 = life7_38;
    forwardValue342_86_1 = moom.bs.WEST;
    }
    if (!((life4_5 != null))) {
        forwardValue342_99_0 = forwardValue342_86_0;
        forwardValue342_99_1 = forwardValue342_86_1;
        break forward_join_99;
    }
    if (!((forwardValue342_86_0 == forwardValue342_86_1))) {
        break forward_join_97;
    }
    ((moom.eC)(this)).a(((float)(0x1.ap-1f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    forwardValue342_99_0 = life7_38;
    forwardValue342_99_1 = moom.bs.EAST;
    }
    if (!((forwardValue342_99_0 == forwardValue342_99_1))) {
        break forward_join_108;
    }
    ((moom.eC)(this)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.8p-3f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    }
    return;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7470_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/eC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
java.lang.Comparable forwardValue341_31_0;
    int[] spill341_0;
    java.lang.Boolean spill341_1;
    long life2_3;
    int life5_5;
    int life5_14;
    int[] life4_15;
    forward_join_41: {
    forward_join_31: {
    forward_join_28: {
    life2_3 = (moom.eC.T ^ 9329102643551L);
    life5_5 = 0;
    spill341_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_14 = (life5_5 | moom.eC.a(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eC.Q)))))))));
    life4_15 = spill341_0;
    spill341_1 = ((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eC.R)))));
    if (!((life4_15 != null))) {
        forwardValue341_31_0 = spill341_1;
        break forward_join_31;
    }
    if (!(((java.lang.Boolean)(spill341_1)).booleanValue())) {
        break forward_join_28;
    }
    life5_14 = (life5_14 | 4);
    }
    forwardValue341_31_0 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.eC.S)));
    }
    if (!((forwardValue341_31_0 == moom.as.TOP))) {
        break forward_join_41;
    }
    life5_14 = (life5_14 | __sourceIntrinsic_8db5871551d4_invokedynamic341_13(5461, (5155592818205715794L ^ life2_3)));
    }
    return life5_14;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x68C1;
        if (V[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = U[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])W.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    W.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/eC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            eC.V[n2] = n3;
        }
        return V[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.eC.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.CA a__CA(net.minecraft.world.World p0, moom.DT p1) {
((moom.eC)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a__CA(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
}


public moom.CA a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
((moom.eC)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public void a__Void(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
((moom.eC)(this)).b__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, moom.DT p1, moom.bs p2) {
int forwardValue339_20_0;
    int forwardValue339_24_0;
    int forwardValue339_26_0;
    boolean spill339_0;
    long life4_3;
    int[] life6_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_20: {
    life4_3 = (moom.eC.T ^ 91977845342392L);
    life6_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill339_0 = ((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).a__Boolean();
    if (!((life6_5 != null))) {
        forwardValue339_20_0 = ((spill339_0) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill339_0))) {
        break forward_join_25;
    }
    forwardValue339_20_0 = ((moom.eC.b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(p2)).a__bs())))))))).a__ch())))) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue339_24_0 = forwardValue339_20_0;
        break forward_join_24;
    }
    if (!((forwardValue339_20_0 != 0))) {
        break forward_join_25;
    }
    forwardValue339_24_0 = 1;
    }
    forwardValue339_26_0 = forwardValue339_24_0;
    break forward_join_26;
    }
    forwardValue339_26_0 = 0;
    }
    return ((forwardValue339_26_0) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a__Boolean(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
int forwardValue338_17_0;
    int forwardValue338_19_0;
    boolean spill338_0;
    long life3_3;
    int[] life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_17: {
    life3_3 = (moom.eC.T ^ 108314106098125L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill338_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.IBlockAccess)(p0)).a__fE(((moom.DT)(p1))))).a(((net.minecraft.block.properties.IProperty)(moom.eC.R))))))).booleanValue();
    if (!((life5_5 != null))) {
        forwardValue338_17_0 = ((spill338_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!((!spill338_0))) {
        break forward_join_18;
    }
    forwardValue338_17_0 = 1;
    }
    forwardValue338_19_0 = forwardValue338_17_0;
    break forward_join_19;
    }
    forwardValue338_19_0 = 0;
    }
    return ((forwardValue338_19_0) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.eC.Q, moom.eC.R, moom.eC.S});
}


public net.minecraft.block.state.IBlockState a(net.minecraft.world.World p0, moom.DT p1, moom.bs p2, float p3, float p4, float p5, int p6, net.minecraft.entity.EntityLivingBase p7) {
net.minecraft.block.state.IBlockState forwardValue336_31_0;
    moom.fw forwardValue336_31_1;
    net.minecraft.block.state.IBlockState forwardValue336_32_0;
    moom.fw forwardValue336_32_1;
    moom.as forwardValue336_32_2;
    int[] spill336_0;
    net.minecraft.block.state.IBlockState spill336_1;
    moom.fw spill336_2;
    long life9_3;
    net.minecraft.block.state.IBlockState life12_7;
    int[] life11_8;
    forward_join_34: {
    forward_join_32: {
    forward_join_31: {
    forward_join_23: {
    life9_3 = (moom.eC.T ^ 40147438789832L);
    spill336_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_7 = ((moom.eC)(this)).a__fE();
    life11_8 = spill336_0;
    if (!((life11_8 != null))) {
        break forward_join_23;
    }
    if (!(((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(p2)).a__bt())).b__Boolean())) {
        break forward_join_34;
    }
    life12_7 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(life12_7)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.Q)), ((java.lang.Comparable)(p2))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.R)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    }
    spill336_1 = life12_7;
    spill336_2 = moom.eC.S;
    if (!((recovery.source.CarrierOps.fcmpl(((float)(p4)), ((float)(0x1.0p-1f))) > 0))) {
        forwardValue336_31_0 = spill336_1;
        forwardValue336_31_1 = spill336_2;
        break forward_join_31;
    }
    forwardValue336_32_0 = spill336_1;
    forwardValue336_32_1 = spill336_2;
    forwardValue336_32_2 = moom.as.TOP;
    break forward_join_32;
    }
    forwardValue336_32_0 = forwardValue336_31_0;
    forwardValue336_32_1 = forwardValue336_31_1;
    forwardValue336_32_2 = moom.as.BOTTOM;
    }
    life12_7 = ((net.minecraft.block.state.IBlockState)(forwardValue336_32_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue336_32_1)), ((java.lang.Comparable)(forwardValue336_32_2)));
    }
    return life12_7;
}


public net.minecraft.util.MovingObjectPosition a(net.minecraft.world.World p0, moom.DT p1, moom.DR p2, moom.DR p3) {
((moom.eC)(this)).a__Void(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return super.a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((moom.DR)(p2)), ((moom.DR)(p3)));
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3400_40_0;
    int forwardValue3400_55_0;
    int forwardValue3400_70_0;
    net.minecraft.world.World forwardValue3400_82_0;
    java.lang.Object forwardValue3400_82_1;
    int forwardValue3400_82_2;
    net.minecraft.world.World forwardValue3400_83_0;
    java.lang.Object forwardValue3400_83_1;
    net.minecraft.world.World forwardValue3400_88_0;
    java.lang.Object forwardValue3400_88_1;
    int forwardValue3400_88_2;
    boolean spill3400_0;
    int spill3400_1;
    boolean spill3400_2;
    int spill3400_3;
    net.minecraft.world.World spill3400_4;
    java.lang.Object spill3400_5;
    int spill3400_6;
    long life5_3;
    int[] life7_5;
    moom.DT life8_16;
    int life9_49;
    int life10_76;
    forward_join_91: {
    forward_join_88: {
    forward_join_83: {
    forward_join_82: {
    forward_join_70: {
    forward_join_55: {
    forward_join_50: {
    forward_join_40: {
    forward_join_37: {
    life5_3 = (moom.eC.T ^ 69603427124227L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((!((net.minecraft.world.World)(p0)).G))) {
        break forward_join_91;
    }
    life8_16 = ((moom.DT)(p1)).a(((moom.bs)(((moom.bs)(((moom.bs)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eC.Q))))))).a__bs())));
    spill3400_0 = moom.eC.b(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life8_16))))).a__ch())));
    if (!((life7_5 != null))) {
        forwardValue3400_40_0 = ((spill3400_0) ? 1 : 0);
        break forward_join_40;
    }
    if (!((!spill3400_0))) {
        break forward_join_37;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(p1)));
    ((moom.eC)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(0)));
    if (!((life7_5 == null))) {
        break forward_join_91;
    }
    }
    forwardValue3400_40_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    life9_49 = forwardValue3400_40_0;
    spill3400_1 = life9_49;
    if (!((life7_5 != null))) {
        forwardValue3400_55_0 = spill3400_1;
        break forward_join_55;
    }
    if (!((spill3400_1 == 0))) {
        break forward_join_50;
    }
    spill3400_2 = ((net.minecraft.block.Block)(p3)).l();
    if (!((life7_5 != null))) {
        forwardValue3400_55_0 = ((spill3400_2) ? 1 : 0);
        break forward_join_55;
    }
    if (!(spill3400_2)) {
        break forward_join_91;
    }
    }
    forwardValue3400_55_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eC.R))))))).booleanValue()) ? 1 : 0);
    }
    life10_76 = forwardValue3400_55_0;
    spill3400_3 = life10_76;
    if (!((life7_5 != null))) {
        forwardValue3400_70_0 = spill3400_3;
        break forward_join_70;
    }
    if (!((spill3400_3 != life9_49))) {
        break forward_join_91;
    }
    forwardValue3400_70_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.R)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life9_49))))))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3400_70_0);
    spill3400_4 = p0;
    spill3400_5 = null;
    spill3400_6 = life9_49;
    if (!((life7_5 != null))) {
        forwardValue3400_82_0 = spill3400_4;
        forwardValue3400_82_1 = spill3400_5;
        forwardValue3400_82_2 = spill3400_6;
        break forward_join_82;
    }
    if (!((spill3400_6 != 0))) {
        forwardValue3400_83_0 = spill3400_4;
        forwardValue3400_83_1 = spill3400_5;
        break forward_join_83;
    }
    forwardValue3400_82_0 = spill3400_4;
    forwardValue3400_82_1 = spill3400_5;
    forwardValue3400_82_2 = __sourceIntrinsic_ae5eabbf4271_invokedynamic3400_29(5157, (7167185768437123455L ^ life5_3));
    }
    forwardValue3400_88_0 = forwardValue3400_82_0;
    forwardValue3400_88_1 = forwardValue3400_82_1;
    forwardValue3400_88_2 = forwardValue3400_82_2;
    break forward_join_88;
    }
    forwardValue3400_88_0 = forwardValue3400_83_0;
    forwardValue3400_88_1 = forwardValue3400_83_1;
    forwardValue3400_88_2 = __sourceIntrinsic_ae5eabbf4271_invokedynamic3400_30(18514, (4879854152077104395L ^ life5_3));
    }
    ((net.minecraft.world.World)(forwardValue3400_88_0)).a(((net.minecraft.entity.player.EntityPlayer)(forwardValue3400_88_1)), ((int)(forwardValue3400_88_2)), ((moom.DT)(p1)), ((int)(0)));
    }
    return;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.world.World forwardValue337_37_0;
    net.minecraft.entity.player.EntityPlayer forwardValue337_37_1;
    int forwardValue337_37_2;
    net.minecraft.world.World forwardValue337_38_0;
    net.minecraft.entity.player.EntityPlayer forwardValue337_38_1;
    net.minecraft.world.World forwardValue337_43_0;
    net.minecraft.entity.player.EntityPlayer forwardValue337_43_1;
    int forwardValue337_43_2;
    net.minecraft.world.World spill337_0;
    net.minecraft.entity.player.EntityPlayer spill337_1;
    boolean spill337_2;
    long life9_3;
    int[] life11_5;
    forward_join_46: {
    forward_join_43: {
    forward_join_38: {
    forward_join_37: {
    forward_join_22: {
    life9_3 = (moom.eC.T ^ 82401496908053L);
    life11_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((life11_5 != null))) {
        break forward_join_22;
    }
    if (!((this.J != moom.fn.f))) {
        break forward_join_46;
    }
    p2 = ((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.eC.R)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(2)));
    }
    spill337_0 = p0;
    spill337_1 = p3;
    spill337_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.eC.R))))))).booleanValue();
    if (!((life11_5 != null))) {
        forwardValue337_37_0 = spill337_0;
        forwardValue337_37_1 = spill337_1;
        forwardValue337_37_2 = ((spill337_2) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill337_2)) {
        forwardValue337_38_0 = spill337_0;
        forwardValue337_38_1 = spill337_1;
        break forward_join_38;
    }
    forwardValue337_37_0 = spill337_0;
    forwardValue337_37_1 = spill337_1;
    forwardValue337_37_2 = __sourceIntrinsic_1ca9d0413800_invokedynamic337_12(23079, (6120167956814922351L ^ life9_3));
    }
    forwardValue337_43_0 = forwardValue337_37_0;
    forwardValue337_43_1 = forwardValue337_37_1;
    forwardValue337_43_2 = forwardValue337_37_2;
    break forward_join_43;
    }
    forwardValue337_43_0 = forwardValue337_38_0;
    forwardValue337_43_1 = forwardValue337_38_1;
    forwardValue337_43_2 = __sourceIntrinsic_1ca9d0413800_invokedynamic337_13(26156, (1986910360075026021L ^ life9_3));
    }
    ((net.minecraft.world.World)(forwardValue337_43_0)).a(((net.minecraft.entity.player.EntityPlayer)(forwardValue337_43_1)), ((int)(forwardValue337_43_2)), ((moom.DT)(p1)), ((int)(0)));
    }
    return ((1) != 0);
}


protected static int a(moom.bs p0) {
int forwardValue347_20_0;
    int spill347_0;
    long life1_3;
    int[] life3_5;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (moom.eC.T ^ 33868296202953L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill347_0 = (moom.ff.a)[((moom.bs)(p0)).ordinal()];
    if (!((life3_5 != null))) {
        forwardValue347_20_0 = spill347_0;
        break forward_join_20;
    }
    switch (spill347_0) {
case 1:
{
        break forward_join_13;
    }
case 2:
{
        break forward_join_15;
    }
case 3:
{
        break forward_join_17;
    }
case 4:
default:
{
        break forward_join_19;
    }
}
    }
    return 0;
    }
    return 1;
    }
    return 2;
    }
    forwardValue347_20_0 = 3;
    }
    return forwardValue347_20_0;
}


protected static moom.bs a__sourceReturn_5c5084b5c8(int p0) {
long local1 = (moom.eC.T ^ 39418294002077L);
    switch ((p0 & 3)) {
case 0:
{
        return moom.bs.NORTH;
    }
case 1:
{
        return moom.bs.SOUTH;
    }
case 2:
{
        return moom.bs.WEST;
    }
case 3:
default:
{
        return moom.bs.EAST;
    }
}
}


public void a__Void() {
float local1 = 0x1.8p-3f;
    ((moom.eC)(this)).a(((float)(0x0.0p0f)), ((float)(0x1.ap-2f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.3p-1f)), ((float)(0x1.0p0f)));
    return;
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_ae5eabbf4271_invokedynamic3400_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ae5eabbf4271_invokedynamic3400_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ca9d0413800_invokedynamic337_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1ca9d0413800_invokedynamic337_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7470_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic341_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic343_10(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
