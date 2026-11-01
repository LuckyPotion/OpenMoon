package net.minecraft.block;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;



















import net.minecraft.block.BlockPlanks$EnumType;















import moom.DT;














import moom.Ch;














import net.minecraft.block.Block;











import net.minecraft.world.World;










import net.minecraft.world.World;


import net.minecraft.block.BlockPlanks$EnumType;
import java.util.Map;
import moom.DT;
import net.minecraft.block.state.IBlockState;
public class BlockFlowerPot extends moom.cT {

public static final moom.fy R;

public static final moom.fw<net.minecraft.block.BlockFlowerPot$EnumFlowerType> S;

private static final long T;

private static final long[] U;

private static final java.lang.Integer[] V;

private static final java.util.Map X;

public BlockFlowerPot() {
super(moom.fn.q);
    (this).a__Void((((this.M).a__fE()).a__fE(net.minecraft.block.BlockFlowerPot.S, net.minecraft.block.BlockFlowerPot$EnumFlowerType.EMPTY)).a__fE(net.minecraft.block.BlockFlowerPot.R, java.lang.Integer.valueOf(0)));
    (this).a__Void();
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(7734506043394576914L)), ((long)(3025663974352942460L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(209492489840599L)))));
    long local11_life6 = (net.minecraft.block.BlockFlowerPot.T ^ 54470386841897L);
    X = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1155_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1155_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1155_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1155_14 = new byte[8];
    (__sourceSpill1155_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1155_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1155_16 = __sourceSpill1155_14;
    ((javax.crypto.Cipher)(__sourceSpill1155_11)).init(((int)(__sourceSpill1155_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1155_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1155_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[2];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "ÑÈq.\016Saau\006zdö³"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1155_25 = local4_life21;
        int __sourceSpill1155_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1155_25)).substring(((int)(__sourceSpill1155_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1155_30 = local6_life19;
        int __sourceSpill1155_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1155_33 = new byte[8];
        (__sourceSpill1155_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1155_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1155_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1155_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1155_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1155_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1155_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1155_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1155_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1155_34)).doFinal(((byte[])(__sourceSpill1155_33)));
        (__sourceSpill1155_30)[__sourceSpill1155_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    U = ((long[])(local6_life19));
    V = ((java.lang.Integer[])(new java.lang.Integer[2]));
    R = ((moom.fy)(moom.fy.a(((java.lang.String)("legacy_data")), ((int)(0)), ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1155_39(13574, (3751236137628316516L ^ local11_life6)))))));
    S = ((moom.fw)(moom.fw.a(((java.lang.String)("contents")), ((java.lang.Class)(net.minecraft.block.BlockFlowerPot$EnumFlowerType.class)))));
}


public boolean b__Boolean(net.minecraft.world.World p0, moom.DT p1) {
int forwardValue4686_17_0;
    int forwardValue4686_21_0;
    int forwardValue4686_23_0;
    boolean spill4686_0;
    long life3_3;
    int[] life5_5;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life3_3 = (net.minecraft.block.BlockFlowerPot.T ^ 64158170615226L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4686_0 = super.b__Boolean(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    if (!((life5_5 != null))) {
        forwardValue4686_17_0 = ((spill4686_0) ? 1 : 0);
        break forward_join_17;
    }
    if (!(spill4686_0)) {
        break forward_join_22;
    }
    forwardValue4686_17_0 = ((__sourceExactCall_fafaf58231f9bd(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(((moom.DT)(p1)).b__DT())))) ? 1 : 0);
    }
    if (!((life5_5 != null))) {
        forwardValue4686_21_0 = forwardValue4686_17_0;
        break forward_join_21;
    }
    if (!((forwardValue4686_17_0 != 0))) {
        break forward_join_22;
    }
    forwardValue4686_21_0 = 1;
    }
    forwardValue4686_23_0 = forwardValue4686_21_0;
    break forward_join_23;
    }
    forwardValue4686_23_0 = 0;
    }
    return ((forwardValue4686_23_0) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9985_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/c7"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int b(net.minecraft.block.state.IBlockState p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFlowerPot.R))))))).intValue();
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_1adb64376501cb(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31;
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
         Object[] var9 = (Object[])X.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               X.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/c7", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public int c__Int() {
return 3;
}


public void c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2) {
long life4_3;
    moom.Ch life7_9;
    int[] life6_10;
    life4_3 = (net.minecraft.block.BlockFlowerPot.T ^ 124586294108204L);
    int[] spill8134_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_9 = ((net.minecraft.block.BlockFlowerPot)(this)).a__Ch(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    life6_10 = spill8134_0;
    if ((life6_10 != null)) {
        if ((life7_9 != null)) {
        if ((((moom.Ch)(life7_9)).a__wQ() != null)) {
        __sourceExactCall_1fd5b4fa1c202c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(((moom.Ch)(life7_9)).a__wQ(), 1, ((moom.Ch)(life7_9)).a__sourceReturn_8abf5c6871()))));
    }
    }
        super.c(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)));
    }
    return;
}


public net.minecraft.block.state.IBlockState a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
net.minecraft.tileentity.TileEntity forwardValue435_18_0;
    int forwardValue435_30_0;
    net.minecraft.block.Block forwardValue435_74_0;
    net.minecraft.block.Block forwardValue435_93_0;
    net.minecraft.block.Block forwardValue435_103_0;
    moom.cA forwardValue435_103_1;
    net.minecraft.block.Block forwardValue435_155_0;
    moom.cu forwardValue435_155_1;
    net.minecraft.block.Block forwardValue435_166_0;
    moom.cu forwardValue435_166_1;
    net.minecraft.block.Block forwardValue435_172_0;
    net.minecraft.block.Block forwardValue435_181_0;
    int[] spill435_0;
    net.minecraft.tileentity.TileEntity spill435_1;
    int spill435_2;
    net.minecraft.block.Block spill435_3;
    moom.cA spill435_4;
    net.minecraft.block.Block spill435_5;
    long life4_3;
    net.minecraft.block.BlockFlowerPot$EnumFlowerType life7_6;
    int[] life6_7;
    net.minecraft.tileentity.TileEntity life8_11;
    moom.Ch life9_25;
    net.minecraft.item.Item life10_28;
    int life11_42;
    net.minecraft.block.Block life12_45;
    forward_join_185: {
    forward_join_181: {
    forward_join_180: {
    forward_join_172: {
    forward_join_171: {
    forward_join_166: {
    forward_join_162: {
    forward_join_155: {
    forward_join_153: {
    forward_join_149: {
    forward_join_145: {
    forward_join_141: {
    forward_join_137: {
    forward_join_133: {
    forward_join_129: {
    forward_join_125: {
    forward_join_121: {
    forward_join_117: {
    forward_join_113: {
    forward_join_103: {
    forward_join_101: {
    forward_join_93: {
    forward_join_92: {
    forward_join_88: {
    forward_join_84: {
    forward_join_80: {
    forward_join_74: {
    forward_join_73: {
    forward_join_69: {
    forward_join_65: {
    forward_join_61: {
    forward_join_57: {
    forward_join_53: {
    forward_join_49: {
    forward_join_45: {
    forward_join_30: {
    forward_join_18: {
    life4_3 = (net.minecraft.block.BlockFlowerPot.T ^ 122344706584068L);
    spill435_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.EMPTY;
    life6_7 = spill435_0;
    life8_11 = ((net.minecraft.world.IBlockAccess)(p1)).a__B9(((moom.DT)(p2)));
    spill435_1 = life8_11;
    if (!((life6_7 != null))) {
        forwardValue435_18_0 = spill435_1;
        break forward_join_18;
    }
    if (!((((spill435_1 instanceof moom.Ch) ? 1 : 0) != 0))) {
        break forward_join_185;
    }
    forwardValue435_18_0 = life8_11;
    }
    life9_25 = ((moom.Ch)(forwardValue435_18_0));
    life10_28 = ((moom.Ch)(life9_25)).a__wQ();
    spill435_2 = ((life10_28 instanceof moom.wU) ? 1 : 0);
    if (!((life6_7 != null))) {
        forwardValue435_30_0 = spill435_2;
        break forward_join_30;
    }
    if (!((spill435_2 != 0))) {
        break forward_join_185;
    }
    forwardValue435_30_0 = ((moom.Ch)(life9_25)).a__sourceReturn_8abf5c6871();
    }
    life11_42 = forwardValue435_30_0;
    life12_45 = __sourceExactCall_3c55b55d648265(((net.minecraft.item.Item)(life10_28)));
    spill435_3 = life12_45;
    if (!((life6_7 != null))) {
        forwardValue435_74_0 = spill435_3;
        break forward_join_74;
    }
    if (!((spill435_3 == net.minecraft.init.Blocks.g))) {
        break forward_join_73;
    }
    switch ((moom.eU.a)[((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.a(((int)(life11_42))))).ordinal()]) {
case 1:
{
        break forward_join_45;
    }
case 2:
{
        break forward_join_49;
    }
case 3:
{
        break forward_join_53;
    }
case 4:
{
        break forward_join_57;
    }
case 5:
{
        break forward_join_61;
    }
case 6:
{
        break forward_join_65;
    }
default:
{
        break forward_join_69;
    }
}
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.OAK_SAPLING;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.SPRUCE_SAPLING;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.BIRCH_SAPLING;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.JUNGLE_SAPLING;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.ACACIA_SAPLING;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.DARK_OAK_SAPLING;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.EMPTY;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    forwardValue435_74_0 = life12_45;
    }
    if (!((life6_7 != null))) {
        forwardValue435_93_0 = forwardValue435_74_0;
        break forward_join_93;
    }
    if (!((forwardValue435_74_0 == net.minecraft.init.Blocks.H))) {
        break forward_join_92;
    }
    switch (life11_42) {
case 0:
{
        break forward_join_80;
    }
case 2:
{
        break forward_join_84;
    }
default:
{
        break forward_join_88;
    }
}
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.DEAD_BUSH;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.FERN;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.EMPTY;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    forwardValue435_93_0 = life12_45;
    }
    spill435_4 = net.minecraft.init.Blocks.N;
    if (!((life6_7 != null))) {
        forwardValue435_103_0 = forwardValue435_93_0;
        forwardValue435_103_1 = spill435_4;
        break forward_join_103;
    }
    if (!((forwardValue435_93_0 == spill435_4))) {
        break forward_join_101;
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.DANDELION;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    forwardValue435_103_0 = life12_45;
    forwardValue435_103_1 = net.minecraft.init.Blocks.O;
    }
    if (!((life6_7 != null))) {
        forwardValue435_155_0 = forwardValue435_103_0;
        forwardValue435_155_1 = forwardValue435_103_1;
        break forward_join_155;
    }
    if (!((forwardValue435_103_0 == forwardValue435_103_1))) {
        break forward_join_153;
    }
    switch ((moom.eU.b)[((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.a(((moom.M)(moom.M.RED)), ((int)(life11_42))))).ordinal()]) {
case 1:
{
        break forward_join_113;
    }
case 2:
{
        break forward_join_117;
    }
case 3:
{
        break forward_join_121;
    }
case 4:
{
        break forward_join_125;
    }
case 5:
{
        break forward_join_129;
    }
case 6:
{
        break forward_join_133;
    }
case 7:
{
        break forward_join_137;
    }
case 8:
{
        break forward_join_141;
    }
case 9:
{
        break forward_join_145;
    }
default:
{
        break forward_join_149;
    }
}
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.POPPY;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.BLUE_ORCHID;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.ALLIUM;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.HOUSTONIA;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.RED_TULIP;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.ORANGE_TULIP;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.WHITE_TULIP;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.PINK_TULIP;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.OXEYE_DAISY;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.EMPTY;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    forwardValue435_155_0 = life12_45;
    forwardValue435_155_1 = net.minecraft.init.Blocks.Q;
    }
    if (!((life6_7 != null))) {
        forwardValue435_166_0 = forwardValue435_155_0;
        forwardValue435_166_1 = forwardValue435_155_1;
        break forward_join_166;
    }
    if (!((forwardValue435_155_0 == forwardValue435_155_1))) {
        break forward_join_162;
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.MUSHROOM_RED;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    spill435_5 = life12_45;
    if (!((life6_7 != null))) {
        forwardValue435_172_0 = spill435_5;
        break forward_join_172;
    }
    forwardValue435_166_0 = spill435_5;
    forwardValue435_166_1 = net.minecraft.init.Blocks.P;
    }
    if (!((forwardValue435_166_0 == forwardValue435_166_1))) {
        break forward_join_171;
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.MUSHROOM_BROWN;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    forwardValue435_172_0 = life12_45;
    }
    if (!((life6_7 != null))) {
        forwardValue435_181_0 = forwardValue435_172_0;
        break forward_join_181;
    }
    if (!((forwardValue435_172_0 == net.minecraft.init.Blocks.I))) {
        break forward_join_180;
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.DEAD_BUSH;
    if (!((life6_7 == null))) {
        break forward_join_185;
    }
    }
    forwardValue435_181_0 = life12_45;
    }
    if (!((forwardValue435_181_0 == net.minecraft.init.Blocks.aK))) {
        break forward_join_185;
    }
    life7_6 = net.minecraft.block.BlockFlowerPot$EnumFlowerType.CACTUS;
    }
    return ((net.minecraft.block.state.IBlockState)(p0)).a__fE(((net.minecraft.block.properties.IProperty)(net.minecraft.block.BlockFlowerPot.S)), ((java.lang.Comparable)(life7_6)));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {net.minecraft.block.BlockFlowerPot.S, net.minecraft.block.BlockFlowerPot.R});
}


public net.minecraft.tileentity.TileEntity a(net.minecraft.world.World p0, int p1) {
long life3_3;
    net.minecraft.block.Block life5_5;
    int life6_7;
    forest_join_72: {
    forest_join_67: {
    forest_join_61: {
    forest_join_55: {
    forest_join_52: {
    forest_join_49: {
    forest_join_46: {
    forest_join_43: {
    forest_join_37: {
    forest_join_31: {
    forest_join_25: {
    forest_join_19: {
    forest_join_16: {
    forest_join_10: {
    life3_3 = (net.minecraft.block.BlockFlowerPot.T ^ 11940728400226L);
    life5_5 = null;
    life6_7 = 0;
    switch (p1) {
case 1:
{
        break forest_join_10;
    }
case 2:
{
        break forest_join_16;
    }
case 3:
{
        break forest_join_19;
    }
case 4:
{
        break forest_join_25;
    }
case 5:
{
        break forest_join_31;
    }
case 6:
{
        break forest_join_37;
    }
case 7:
{
        break forest_join_43;
    }
case 8:
{
        break forest_join_46;
    }
case 9:
{
        break forest_join_49;
    }
case 10:
{
        break forest_join_52;
    }
case 11:
{
        break forest_join_55;
    }
case 12:
{
        break forest_join_61;
    }
case 13:
{
        break forest_join_67;
    }
default:
{
        break forest_join_72;
    }
}
    }
    life5_5 = net.minecraft.init.Blocks.O;
    life6_7 = ((net.minecraft.block.BlockFlower$EnumFlowerType)(net.minecraft.block.BlockFlower$EnumFlowerType.POPPY)).a();
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.N;
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.g;
    life6_7 = ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).a();
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.g;
    life6_7 = ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)).a();
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.g;
    life6_7 = ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.BIRCH)).a();
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.g;
    life6_7 = ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)).a();
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.Q;
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.P;
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.aK;
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.I;
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.H;
    life6_7 = ((moom.ar)(moom.ar.FERN)).a();
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.g;
    life6_7 = ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.ACACIA)).a();
    break forest_join_72;
    }
    life5_5 = net.minecraft.init.Blocks.g;
    life6_7 = ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)).a();
    }
    return new moom.Ch(__sourceExactCall_42e37b9acc15b0(((net.minecraft.block.Block)(life5_5))), life6_7);
}


private moom.Ch a__Ch(net.minecraft.world.World p0, moom.DT p1) {
net.minecraft.tileentity.TileEntity forwardValue4684_16_0;
    moom.Ch forwardValue4684_19_0;
    int[] spill4684_0;
    net.minecraft.tileentity.TileEntity spill4684_1;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_8;
    int[] life5_9;
    forward_join_19: {
    forward_join_18: {
    forward_join_16: {
    life3_3 = (net.minecraft.block.BlockFlowerPot.T ^ 89137515140697L);
    spill4684_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_8 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p1)));
    life5_9 = spill4684_0;
    spill4684_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue4684_16_0 = spill4684_1;
        break forward_join_16;
    }
    if (!((((spill4684_1 instanceof moom.Ch) ? 1 : 0) != 0))) {
        break forward_join_18;
    }
    forwardValue4684_16_0 = life6_8;
    }
    forwardValue4684_19_0 = ((moom.Ch)(forwardValue4684_16_0));
    break forward_join_19;
    }
    forwardValue4684_19_0 = null;
    }
    return forwardValue4684_19_0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3, moom.bs p4, float p5, float p6, float p7) {
net.minecraft.item.ItemStack forwardValue4683_15_0;
    moom.Ch forwardValue4683_32_0;
    net.minecraft.item.Item forwardValue4683_40_0;
    int forwardValue4683_69_0;
    int forwardValue4683_90_0;
    int forwardValue4683_92_0;
    int[] spill4683_0;
    net.minecraft.item.ItemStack spill4683_1;
    int spill4683_2;
    moom.Ch spill4683_3;
    net.minecraft.item.Item spill4683_4;
    boolean spill4683_5;
    int spill4683_6;
    long life9_3;
    net.minecraft.item.ItemStack life12_8;
    int[] life11_9;
    moom.Ch life13_30;
    net.minecraft.block.Block life14_57;
    forward_join_92: {
    forward_join_91: {
    forward_join_90: {
    forward_join_89: {
    forward_join_69: {
    forward_join_52: {
    forward_join_40: {
    forward_join_38: {
    forward_join_32: {
    forward_join_31: {
    forward_join_15: {
    life9_3 = (net.minecraft.block.BlockFlowerPot.T ^ 133642777415640L);
    spill4683_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life12_8 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).a__xW();
    life11_9 = spill4683_0;
    spill4683_1 = life12_8;
    if (!((life11_9 != null))) {
        forwardValue4683_15_0 = spill4683_1;
        break forward_join_15;
    }
    if (!((spill4683_1 != null))) {
        break forward_join_91;
    }
    forwardValue4683_15_0 = life12_8;
    }
    spill4683_2 = ((((net.minecraft.item.ItemStack)(forwardValue4683_15_0)).a__wQ() instanceof moom.wU) ? 1 : 0);
    if (!((life11_9 != null))) {
        forwardValue4683_92_0 = spill4683_2;
        break forward_join_92;
    }
    if (!((spill4683_2 != 0))) {
        break forward_join_91;
    }
    life13_30 = ((net.minecraft.block.BlockFlowerPot)(this)).a__Ch(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    spill4683_3 = life13_30;
    if (!((life11_9 != null))) {
        forwardValue4683_32_0 = spill4683_3;
        break forward_join_32;
    }
    if (!((spill4683_3 == null))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue4683_32_0 = life13_30;
    }
    spill4683_4 = ((moom.Ch)(forwardValue4683_32_0)).a__wQ();
    if (!((life11_9 != null))) {
        forwardValue4683_40_0 = spill4683_4;
        break forward_join_40;
    }
    if (!((spill4683_4 != null))) {
        break forward_join_38;
    }
    return ((0) != 0);
    }
    forwardValue4683_40_0 = ((net.minecraft.item.ItemStack)(life12_8)).a__wQ();
    }
    life14_57 = __sourceExactCall_3c55b55d648265(((net.minecraft.item.Item)(forwardValue4683_40_0)));
    spill4683_5 = ((net.minecraft.block.BlockFlowerPot)(this)).a(((net.minecraft.block.Block)(life14_57)), ((int)(((net.minecraft.item.ItemStack)(life12_8)).c())));
    if (!((life11_9 != null))) {
        forwardValue4683_69_0 = ((spill4683_5) ? 1 : 0);
        break forward_join_69;
    }
    if (!((!spill4683_5))) {
        break forward_join_52;
    }
    return ((0) != 0);
    }
    ((moom.Ch)(life13_30)).a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(life12_8)).a__wQ())), ((int)(((net.minecraft.item.ItemStack)(life12_8)).c())));
    ((moom.Ch)(life13_30)).a__Void();
    ((net.minecraft.world.World)(p0)).a__Void(((moom.DT)(p1)));
    ((net.minecraft.entity.player.EntityPlayer)(p3)).a(((moom.BY)(net.minecraft.stats.StatList.T)));
    forwardValue4683_69_0 = ((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d) ? 1 : 0);
    }
    if (!((life11_9 != null))) {
        forwardValue4683_90_0 = forwardValue4683_69_0;
        break forward_join_90;
    }
    if (!((forwardValue4683_69_0 == 0))) {
        break forward_join_89;
    }
    net.minecraft.item.ItemStack __stackOp4683_26_0 = life12_8;
    net.minecraft.item.ItemStack __stackOp4683_28_0 = __stackOp4683_26_0;
    int __stackOp4683_28_1 = (((net.minecraft.item.ItemStack)(__stackOp4683_26_0)).b - 1);
    spill4683_6 = __stackOp4683_28_1;
    ((net.minecraft.item.ItemStack)(__stackOp4683_28_0)).b = ((int)(__stackOp4683_28_1));
    if (!((life11_9 != null))) {
        forwardValue4683_90_0 = spill4683_6;
        break forward_join_90;
    }
    if (!((spill4683_6 <= 0))) {
        break forward_join_89;
    }
    ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).a__Void(((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.entity.player.EntityPlayer)(p3)).bD)).c)), ((net.minecraft.item.ItemStack)(null)));
    }
    forwardValue4683_90_0 = 1;
    }
    return ((forwardValue4683_90_0) != 0);
    }
    forwardValue4683_92_0 = 0;
    }
    return ((forwardValue4683_92_0) != 0);
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)("item.flowerPot.name")));
}


public void a__Void() {
float local1 = 0x1.8p-2f;
    float local2 = (local1 / 0x1.0p1f);
    ((net.minecraft.block.BlockFlowerPot)(this)).a(((float)((0x1.0p-1f - local2))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local2))), ((float)((0x1.0p-1f + local2))), ((float)(local1)), ((float)((0x1.0p-1f + local2))));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.util.EnumWorldBlockLayer a__bx() {
return net.minecraft.util.EnumWorldBlockLayer.CUTOUT;
}


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1, int p2) {
int forwardValue4680_36_0;
    int[] spill4680_0;
    int spill4680_1;
    int spill4680_2;
    long life4_3;
    net.minecraft.tileentity.TileEntity life7_8;
    int[] life6_9;
    net.minecraft.item.Item life8_21;
    forward_join_36: {
    forward_join_31: {
    life4_3 = (net.minecraft.block.BlockFlowerPot.T ^ 133021200050694L);
    spill4680_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.IBlockAccess)(p0)).a__B9(((moom.DT)(p1)));
    life6_9 = spill4680_0;
    spill4680_1 = ((life7_8 instanceof moom.Ch) ? 1 : 0);
    if (!((life6_9 != null))) {
        forwardValue4680_36_0 = spill4680_1;
        break forward_join_36;
    }
    if (!((spill4680_1 != 0))) {
        break forward_join_31;
    }
    life8_21 = ((moom.Ch)(((moom.Ch)(life7_8)))).a__wQ();
    spill4680_2 = ((life8_21 instanceof moom.wU) ? 1 : 0);
    if (!((life6_9 != null))) {
        forwardValue4680_36_0 = spill4680_2;
        break forward_join_36;
    }
    if (!((spill4680_2 != 0))) {
        break forward_join_31;
    }
    return ((net.minecraft.block.Block)(__sourceExactCall_3c55b55d648265(((net.minecraft.item.Item)(life8_21))))).a(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)), ((int)(p2)));
    }
    forwardValue4680_36_0 = __sourceIntrinsic_cdd8da66b4ba_invokedynamic4680_9(12566, (98092461779723354L ^ life4_3));
    }
    return forwardValue4680_36_0;
}


private boolean a(net.minecraft.block.Block p0, int p1) {
net.minecraft.block.Block forwardValue4678_15_0;
    moom.cA forwardValue4678_15_1;
    net.minecraft.block.Block forwardValue4678_17_0;
    net.minecraft.block.Block forwardValue4678_22_0;
    net.minecraft.block.Block forwardValue4678_28_0;
    moom.cu forwardValue4678_28_1;
    net.minecraft.block.Block forwardValue4678_35_0;
    net.minecraft.block.Block forwardValue4678_35_1;
    net.minecraft.block.Block forwardValue4678_37_0;
    net.minecraft.block.Block forwardValue4678_42_0;
    int forwardValue4678_51_0;
    int forwardValue4678_53_0;
    net.minecraft.block.Block spill4678_0;
    moom.cA spill4678_1;
    net.minecraft.block.Block spill4678_2;
    moom.cu spill4678_3;
    net.minecraft.block.Block spill4678_4;
    int spill4678_5;
    long life3_3;
    int[] life5_5;
    forward_join_53: {
    forward_join_52: {
    forward_join_51: {
    forward_join_50: {
    forward_join_42: {
    forward_join_37: {
    forward_join_35: {
    forward_join_28: {
    forward_join_22: {
    forward_join_17: {
    forward_join_15: {
    life3_3 = (net.minecraft.block.BlockFlowerPot.T ^ 122680790949080L);
    life5_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4678_0 = p0;
    spill4678_1 = net.minecraft.init.Blocks.N;
    if (!((life5_5 != null))) {
        forwardValue4678_15_0 = spill4678_0;
        forwardValue4678_15_1 = spill4678_1;
        break forward_join_15;
    }
    if (!((spill4678_0 != spill4678_1))) {
        break forward_join_50;
    }
    spill4678_2 = p0;
    if (!((life5_5 != null))) {
        forwardValue4678_17_0 = spill4678_2;
        break forward_join_17;
    }
    forwardValue4678_15_0 = spill4678_2;
    forwardValue4678_15_1 = net.minecraft.init.Blocks.O;
    }
    if (!((forwardValue4678_15_0 != forwardValue4678_15_1))) {
        break forward_join_50;
    }
    forwardValue4678_17_0 = p0;
    }
    if (!((life5_5 != null))) {
        forwardValue4678_22_0 = forwardValue4678_17_0;
        break forward_join_22;
    }
    if (!((forwardValue4678_17_0 != net.minecraft.init.Blocks.aK))) {
        break forward_join_50;
    }
    forwardValue4678_22_0 = p0;
    }
    spill4678_3 = net.minecraft.init.Blocks.P;
    if (!((life5_5 != null))) {
        forwardValue4678_28_0 = forwardValue4678_22_0;
        forwardValue4678_28_1 = spill4678_3;
        break forward_join_28;
    }
    if (!((forwardValue4678_22_0 != spill4678_3))) {
        break forward_join_50;
    }
    forwardValue4678_28_0 = p0;
    forwardValue4678_28_1 = net.minecraft.init.Blocks.Q;
    }
    if (!((life5_5 != null))) {
        forwardValue4678_35_0 = forwardValue4678_28_0;
        forwardValue4678_35_1 = forwardValue4678_28_1;
        break forward_join_35;
    }
    if (!((forwardValue4678_28_0 != forwardValue4678_28_1))) {
        break forward_join_50;
    }
    spill4678_4 = p0;
    if (!((life5_5 != null))) {
        forwardValue4678_37_0 = spill4678_4;
        break forward_join_37;
    }
    forwardValue4678_35_0 = spill4678_4;
    forwardValue4678_35_1 = net.minecraft.init.Blocks.g;
    }
    if (!((forwardValue4678_35_0 != forwardValue4678_35_1))) {
        break forward_join_50;
    }
    forwardValue4678_37_0 = p0;
    }
    if (!((life5_5 != null))) {
        forwardValue4678_42_0 = forwardValue4678_37_0;
        break forward_join_42;
    }
    if (!((forwardValue4678_37_0 != net.minecraft.init.Blocks.I))) {
        break forward_join_50;
    }
    forwardValue4678_42_0 = p0;
    }
    if (!((forwardValue4678_42_0 == net.minecraft.init.Blocks.H))) {
        break forward_join_52;
    }
    spill4678_5 = p1;
    if (!((life5_5 != null))) {
        forwardValue4678_51_0 = spill4678_5;
        break forward_join_51;
    }
    if (!((spill4678_5 == ((moom.ar)(moom.ar.FERN)).a()))) {
        break forward_join_52;
    }
    }
    forwardValue4678_51_0 = 1;
    }
    forwardValue4678_53_0 = forwardValue4678_51_0;
    break forward_join_53;
    }
    forwardValue4678_53_0 = 0;
    }
    return ((forwardValue4678_53_0) != 0);
}


public int a__Int(net.minecraft.world.World p0, moom.DT p1) {
long l = net.minecraft.block.BlockFlowerPot.T ^ 0x1A03115EABE4L;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        Ch ch = this.a__Ch(p0, p1);
        Ch ch2 = ch;
        if (nArray != null) {
            if (ch2 == null) return 0;
            ch2 = ch;
        }
        if (nArray != null) {
            if (ch2.a__wQ() == null) return 0;
            ch2 = ch;
        }
        int n = ch2.a__sourceReturn_8abf5c6871();
        return n;
}


public net.minecraft.item.Item a__wQ(net.minecraft.world.World p0, moom.DT p1) {
moom.Ch forwardValue4685_16_0;
    net.minecraft.item.Item forwardValue4685_22_0;
    net.minecraft.item.Item forwardValue4685_24_0;
    int[] spill4685_0;
    moom.Ch spill4685_1;
    net.minecraft.item.Item spill4685_2;
    long life3_3;
    moom.Ch life6_9;
    int[] life5_10;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life3_3 = (net.minecraft.block.BlockFlowerPot.T ^ 18647029759905L);
    spill4685_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life6_9 = ((net.minecraft.block.BlockFlowerPot)(this)).a__Ch(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)));
    life5_10 = spill4685_0;
    spill4685_1 = life6_9;
    if (!((life5_10 != null))) {
        forwardValue4685_16_0 = spill4685_1;
        break forward_join_16;
    }
    if (!((spill4685_1 != null))) {
        break forward_join_23;
    }
    forwardValue4685_16_0 = life6_9;
    }
    spill4685_2 = ((moom.Ch)(forwardValue4685_16_0)).a__wQ();
    if (!((life5_10 != null))) {
        forwardValue4685_22_0 = spill4685_2;
        break forward_join_22;
    }
    if (!((spill4685_2 != null))) {
        break forward_join_23;
    }
    forwardValue4685_22_0 = ((moom.Ch)(life6_9)).a__wQ();
    }
    forwardValue4685_24_0 = forwardValue4685_22_0;
    break forward_join_24;
    }
    forwardValue4685_24_0 = net.minecraft.init.Items.bF;
    }
    return forwardValue4685_24_0;
}


public net.minecraft.item.Item a(net.minecraft.block.state.IBlockState p0, java.util.Random p1, int p2) {
return net.minecraft.init.Items.bF;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.entity.player.EntityPlayer p3) {
net.minecraft.block.BlockFlowerPot forwardValue4682_21_0;
    net.minecraft.world.World forwardValue4682_21_1;
    moom.DT forwardValue4682_21_2;
    moom.Ch forwardValue4682_28_0;
    net.minecraft.block.BlockFlowerPot spill4682_0;
    net.minecraft.world.World spill4682_1;
    moom.DT spill4682_2;
    moom.Ch spill4682_3;
    long life5_3;
    int[] life7_5;
    moom.Ch life8_28;
    forward_join_31: {
    forward_join_28: {
    forward_join_21: {
    life5_3 = (net.minecraft.block.BlockFlowerPot.T ^ 121259785559530L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill4682_0 = this;
    spill4682_1 = p0;
    spill4682_2 = p1;
    if (!((life7_5 != null))) {
        forwardValue4682_21_0 = spill4682_0;
        forwardValue4682_21_1 = spill4682_1;
        forwardValue4682_21_2 = spill4682_2;
        break forward_join_21;
    }
    __sourceIntrinsic_495104704e77_call4682_2(spill4682_0, spill4682_1, spill4682_2, p2, p3);
    if (!(((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.entity.player.EntityPlayer)(p3)).b1)).d)) {
        break forward_join_31;
    }
    forwardValue4682_21_0 = this;
    forwardValue4682_21_1 = p0;
    forwardValue4682_21_2 = p1;
    }
    life8_28 = ((net.minecraft.block.BlockFlowerPot)(forwardValue4682_21_0)).a__Ch(((net.minecraft.world.World)(forwardValue4682_21_1)), ((moom.DT)(forwardValue4682_21_2)));
    spill4682_3 = life8_28;
    if (!((life7_5 != null))) {
        forwardValue4682_28_0 = spill4682_3;
        break forward_join_28;
    }
    if (!((spill4682_3 != null))) {
        break forward_join_31;
    }
    forwardValue4682_28_0 = life8_28;
    }
    ((moom.Ch)(forwardValue4682_28_0)).a(((net.minecraft.item.Item)(null)), ((int)(0)));
    }
    return;
}


public void a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
long l = net.minecraft.block.BlockFlowerPot.T ^ 0xC307A390ACEL;
        int[] nArray = BlockPlanks$EnumType.b__ArrayInt();
        boolean bl = World.a(p0, p1.b__DT());
        if (nArray != null && !bl) {
            this.a(p0, p1, p2, 0);
            bl = p0.d__Boolean(p1);
        }
}


public boolean p() {
return ((1) != 0);
}


public boolean g() {
return ((0) != 0);
}


public boolean j() {
return ((0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1155_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cdd8da66b4ba_invokedynamic4680_9(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_495104704e77_call4682_2(net.minecraft.block.BlockFlowerPot a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3, net.minecraft.entity.player.EntityPlayer a4) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral9985_0() throws E;

private static native boolean __sourceExactCall_fafaf58231f9bd(net.minecraft.world.IBlockAccess p0, moom.DT p1);
private static native int __sourceExactCall_1adb64376501cb(int p0, long p1);
private static native void __sourceExactCall_1fd5b4fa1c202c(net.minecraft.world.World p0, moom.DT p1, net.minecraft.item.ItemStack p2);
private static native net.minecraft.block.Block __sourceExactCall_3c55b55d648265(net.minecraft.item.Item p0);
private static native net.minecraft.item.Item __sourceExactCall_42e37b9acc15b0(net.minecraft.block.Block p0);
}
