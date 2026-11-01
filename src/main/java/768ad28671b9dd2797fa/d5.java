package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class d5 extends moom.d2 {

public static final moom.fw<net.minecraft.block.BlockRailBase$EnumRailDirection> R;

public static final moom.fv S;

private static final long U;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

protected d5() {
super(true);
    (this).a__Void((((this.M).a__fE()).a__fE(moom.d5.R, net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH)).a__fE(moom.d5.S, java.lang.Boolean.FALSE));
}


static {
U = ((long)(((moom._a)(moom._c.a(((long)(2230905432402641400L)), ((long)(2063005273631130841L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(102458561720676L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.d5.U ^ 80728215424323L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill800_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill800_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill800_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill800_14 = new byte[8];
    (__sourceSpill800_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill800_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation800_16 = __sourceSpill800_14;
    ((javax.crypto.Cipher)(__sourceSpill800_11)).init(((int)(__sourceSpill800_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill800_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation800_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = ".\b\002Ç´Ýõ-UvkÐÉRÛâX¾í¢²"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill800_25 = local6_life21;
        int __sourceSpill800_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill800_25)).substring(((int)(__sourceSpill800_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill800_30 = local8_life19;
        int __sourceSpill800_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill800_33 = new byte[8];
        (__sourceSpill800_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill800_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill800_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill800_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill800_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill800_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill800_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill800_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill800_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill800_34)).doFinal(((byte[])(__sourceSpill800_33)));
        (__sourceSpill800_30)[__sourceSpill800_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[3]));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("shape")), ((java.lang.Class)(net.minecraft.block.BlockRailBase$EnumRailDirection.class)), ((com.google.common.base.Predicate)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite800_40())))));
    S = ((moom.fv)(moom.fv.a(((java.lang.String)("powered")))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int forwardValue3198_33_0;
    int[] spill3198_0;
    boolean spill3198_1;
    long life2_3;
    int life5_6;
    int[] life4_7;
    int life5_15;
    forward_join_33: {
    forward_join_32: {
    life2_3 = (moom.d5.U ^ 65366541898347L);
    spill3198_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life5_6 = 0;
    life4_7 = spill3198_0;
    life5_15 = (life5_6 | ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d5.R))))))).a());
    spill3198_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.d5.S))))))).booleanValue();
    if (!((life4_7 != null))) {
        forwardValue3198_33_0 = ((spill3198_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill3198_1)) {
        break forward_join_32;
    }
    life5_15 = (life5_15 | __sourceIntrinsic_8db5871551d4_invokedynamic3198_11(21844, (4591339515422312509L ^ life2_3)));
    }
    forwardValue3198_33_0 = life5_15;
    }
    return forwardValue3198_33_0;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7231_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/d5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19886;
      if (W[var3] == null) {
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
         long var5 = V[var3];
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
            throw new RuntimeException("moom/d5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.d5.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, net.minecraft.block.Block p3) {
int forwardValue3199_39_0;
    int forwardValue3199_41_0;
    int forwardValue3199_69_0;
    net.minecraft.world.World forwardValue3199_74_0;
    moom.DT forwardValue3199_74_1;
    moom.d5 forwardValue3199_74_2;
    int[] spill3199_0;
    boolean spill3199_1;
    boolean spill3199_2;
    boolean spill3199_3;
    int spill3199_4;
    net.minecraft.world.World spill3199_5;
    moom.DT spill3199_6;
    moom.d5 spill3199_7;
    long life5_3;
    int life8_10;
    int[] life7_11;
    int life9_56;
    forward_join_75: {
    forward_join_74: {
    forward_join_69: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    life5_3 = (moom.d5.U ^ 19941846770655L);
    spill3199_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life8_10 = ((((java.lang.Boolean)(((java.lang.Boolean)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d5.S))))))).booleanValue()) ? 1 : 0);
    life7_11 = spill3199_0;
    spill3199_1 = ((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)));
    if (!((life7_11 != null))) {
        forwardValue3199_39_0 = ((spill3199_1) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill3199_1))) {
        break forward_join_38;
    }
    spill3199_2 = ((moom.d5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((boolean)(true)), ((int)(0)));
    if (!((life7_11 != null))) {
        forwardValue3199_39_0 = ((spill3199_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!((!spill3199_2))) {
        break forward_join_38;
    }
    spill3199_3 = ((moom.d5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((boolean)(false)), ((int)(0)));
    if (!((life7_11 != null))) {
        forwardValue3199_39_0 = ((spill3199_3) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill3199_3)) {
        break forward_join_40;
    }
    }
    forwardValue3199_39_0 = 1;
    }
    forwardValue3199_41_0 = forwardValue3199_39_0;
    break forward_join_41;
    }
    forwardValue3199_41_0 = 0;
    }
    life9_56 = forwardValue3199_41_0;
    spill3199_4 = life9_56;
    if (!((life7_11 != null))) {
        forwardValue3199_69_0 = spill3199_4;
        break forward_join_69;
    }
    if (!((spill3199_4 != life8_10))) {
        break forward_join_75;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.d5.S)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((life9_56))))))))), ((int)(3)));
    spill3199_5 = p0;
    spill3199_6 = ((moom.DT)(p1)).b__DT();
    spill3199_7 = this;
    if (!((life7_11 != null))) {
        forwardValue3199_74_0 = spill3199_5;
        forwardValue3199_74_1 = spill3199_6;
        forwardValue3199_74_2 = spill3199_7;
        break forward_join_74;
    }
    ((net.minecraft.world.World)(spill3199_5)).b(((moom.DT)(spill3199_6)), ((net.minecraft.block.Block)(spill3199_7)));
    forwardValue3199_69_0 = ((((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d5.R))))))).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue3199_69_0 != 0))) {
        break forward_join_75;
    }
    forwardValue3199_74_0 = p0;
    forwardValue3199_74_1 = ((moom.DT)(p1)).a__DT();
    forwardValue3199_74_2 = this;
    }
    ((net.minecraft.world.World)(forwardValue3199_74_0)).b(((moom.DT)(forwardValue3199_74_1)), ((net.minecraft.block.Block)(forwardValue3199_74_2)));
    }
    return;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
net.minecraft.block.state.IBlockState forwardValue3200_30_0;
    moom.fv forwardValue3200_30_1;
    int forwardValue3200_30_2;
    net.minecraft.block.state.IBlockState forwardValue3200_31_0;
    moom.fv forwardValue3200_31_1;
    net.minecraft.block.state.IBlockState forwardValue3200_32_0;
    moom.fv forwardValue3200_32_1;
    int forwardValue3200_32_2;
    net.minecraft.block.state.IBlockState spill3200_0;
    moom.fv spill3200_1;
    int spill3200_2;
    long life2_3;
    int[] life4_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    life2_3 = (moom.d5.U ^ 61329797474657L);
    life4_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3200_0 = ((net.minecraft.block.state.IBlockState)(((moom.d5)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.d5.R)), ((java.lang.Comparable)(net.minecraft.block.BlockRailBase$EnumRailDirection.a(((int)((p0 & __sourceIntrinsic_819466f05fee_invokedynamic3200_4(13754, (3571224996361180122L ^ life2_3)))))))));
    spill3200_1 = moom.d5.S;
    spill3200_2 = (p0 & __sourceIntrinsic_819466f05fee_invokedynamic3200_8(21844, (4591343140891161399L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue3200_30_0 = spill3200_0;
        forwardValue3200_30_1 = spill3200_1;
        forwardValue3200_30_2 = spill3200_2;
        break forward_join_30;
    }
    if (!((spill3200_2 > 0))) {
        forwardValue3200_31_0 = spill3200_0;
        forwardValue3200_31_1 = spill3200_1;
        break forward_join_31;
    }
    forwardValue3200_30_0 = spill3200_0;
    forwardValue3200_30_1 = spill3200_1;
    forwardValue3200_30_2 = 1;
    }
    forwardValue3200_32_0 = forwardValue3200_30_0;
    forwardValue3200_32_1 = forwardValue3200_30_1;
    forwardValue3200_32_2 = forwardValue3200_30_2;
    break forward_join_32;
    }
    forwardValue3200_32_0 = forwardValue3200_31_0;
    forwardValue3200_32_1 = forwardValue3200_31_1;
    forwardValue3200_32_2 = 0;
    }
    return ((net.minecraft.block.state.IBlockState)(forwardValue3200_32_0)).a__fE(((net.minecraft.block.properties.IProperty)(forwardValue3200_32_1)), ((java.lang.Comparable)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue3200_32_2)))))));
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.d5.R, moom.d5.S});
}


protected boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3, int p4) {
int forestValue404_19_0;
    int forestValue404_66_0;
    int forestValue404_78_0;
    int forestValue404_96_0;
    int forestValue404_108_0;
    int forestValue404_126_0;
    int forestValue404_147_0;
    int forestValue404_151_0;
    int forestValue404_153_0;
    int spill404_0;
    int spill404_1;
    boolean spill404_2;
    boolean spill404_3;
    boolean spill404_4;
    boolean spill404_5;
    int spill404_6;
    long life6_3;
    int[] life8_5;
    int life9_20;
    int life10_23;
    int life11_26;
    int life12_28;
    net.minecraft.block.BlockRailBase$EnumRailDirection life13_33;
    forest_join_153: {
    forest_join_152: {
    forest_join_151: {
    forest_join_150: {
    forest_join_147: {
    forest_join_126: {
    forest_join_114: {
    forest_join_112: {
    forest_join_111: {
    forest_join_108: {
    forest_join_101: {
    forest_join_97: {
    forest_join_96: {
    forest_join_93: {
    forest_join_86: {
    forest_join_82: {
    forest_join_81: {
    forest_join_78: {
    forest_join_71: {
    forest_join_67: {
    forest_join_66: {
    forest_join_63: {
    forest_join_56: {
    forest_join_53: {
    forest_join_48: {
    forest_join_45: {
    forest_join_40: {
    forest_join_19: {
    forest_join_17: {
    life6_3 = (moom.d5.U ^ 138556829213310L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill404_0 = p4;
    if (!((life8_5 != null))) {
        forestValue404_19_0 = spill404_0;
        break forest_join_19;
    }
    if (!((spill404_0 >= __sourceIntrinsic_5fe8ef575248_invokedynamic404_2(28490, (2432412287547212343L ^ life6_3))))) {
        break forest_join_17;
    }
    return ((0) != 0);
    }
    forestValue404_19_0 = ((moom.DT)(p1)).a();
    }
    life9_20 = forestValue404_19_0;
    life10_23 = ((moom.DT)(p1)).b();
    life11_26 = ((moom.DT)(p1)).c();
    life12_28 = 1;
    life13_33 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.d5.R)))));
    spill404_1 = (moom.e9.a)[((net.minecraft.block.BlockRailBase$EnumRailDirection)(life13_33)).ordinal()];
    if (!((life8_5 != null))) {
        forestValue404_126_0 = spill404_1;
        break forest_join_126;
    }
    switch (spill404_1) {
case 1:
{
        break forest_join_40;
    }
case 2:
{
        break forest_join_48;
    }
case 3:
{
        break forest_join_56;
    }
case 4:
{
        break forest_join_71;
    }
case 5:
{
        break forest_join_86;
    }
case 6:
{
        break forest_join_101;
    }
default:
{
        break forest_join_114;
    }
}
    }
    if (!(p3)) {
        break forest_join_45;
    }
    life11_26 += 1;
    if (!((life8_5 == null))) {
        break forest_join_114;
    }
    }
    life11_26 += -1;
    if (!((life8_5 == null))) {
        break forest_join_114;
    }
    }
    if (!(p3)) {
        break forest_join_53;
    }
    life9_20 += -1;
    if (!((life8_5 == null))) {
        break forest_join_114;
    }
    }
    life9_20 += 1;
    if (!((life8_5 == null))) {
        break forest_join_114;
    }
    }
    spill404_2 = p3;
    if (!((life8_5 != null))) {
        forestValue404_66_0 = ((spill404_2) ? 1 : 0);
        break forest_join_66;
    }
    if (!(spill404_2)) {
        break forest_join_63;
    }
    life9_20 += -1;
    if (!((life8_5 == null))) {
        break forest_join_67;
    }
    }
    life9_20 += 1;
    life10_23 += 1;
    forestValue404_66_0 = 0;
    }
    life12_28 = forestValue404_66_0;
    }
    life13_33 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    if (!((life8_5 == null))) {
        break forest_join_114;
    }
    }
    spill404_3 = p3;
    if (!((life8_5 != null))) {
        forestValue404_78_0 = ((spill404_3) ? 1 : 0);
        break forest_join_78;
    }
    if (!(spill404_3)) {
        break forest_join_81;
    }
    life9_20 += -1;
    life10_23 += 1;
    forestValue404_78_0 = 0;
    }
    life12_28 = forestValue404_78_0;
    if (!((life8_5 == null))) {
        break forest_join_82;
    }
    }
    life9_20 += 1;
    }
    life13_33 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    if (!((life8_5 == null))) {
        break forest_join_114;
    }
    }
    spill404_4 = p3;
    if (!((life8_5 != null))) {
        forestValue404_96_0 = ((spill404_4) ? 1 : 0);
        break forest_join_96;
    }
    if (!(spill404_4)) {
        break forest_join_93;
    }
    life11_26 += 1;
    if (!((life8_5 == null))) {
        break forest_join_97;
    }
    }
    life11_26 += -1;
    life10_23 += 1;
    forestValue404_96_0 = 0;
    }
    life12_28 = forestValue404_96_0;
    }
    life13_33 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    if (!((life8_5 == null))) {
        break forest_join_114;
    }
    }
    spill404_5 = p3;
    if (!((life8_5 != null))) {
        forestValue404_108_0 = ((spill404_5) ? 1 : 0);
        break forest_join_108;
    }
    if (!(spill404_5)) {
        break forest_join_111;
    }
    life11_26 += 1;
    life10_23 += 1;
    forestValue404_108_0 = 0;
    }
    life12_28 = forestValue404_108_0;
    if (!((life8_5 == null))) {
        break forest_join_112;
    }
    }
    life11_26 += -1;
    }
    life13_33 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    forestValue404_126_0 = ((((moom.d5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(new moom.DT(life9_20, life10_23, life11_26))), ((boolean)(p3)), ((int)(p4)), ((net.minecraft.block.BlockRailBase$EnumRailDirection)(life13_33)))) ? 1 : 0);
    }
    if (!((life8_5 != null))) {
        forestValue404_151_0 = forestValue404_126_0;
        break forest_join_151;
    }
    if (!((forestValue404_126_0 == 0))) {
        break forest_join_150;
    }
    spill404_6 = life12_28;
    if (!((life8_5 != null))) {
        forestValue404_147_0 = spill404_6;
        break forest_join_147;
    }
    if (!((spill404_6 != 0))) {
        break forest_join_152;
    }
    forestValue404_147_0 = ((((moom.d5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(new moom.DT(life9_20, (life10_23 - 1), life11_26))), ((boolean)(p3)), ((int)(p4)), ((net.minecraft.block.BlockRailBase$EnumRailDirection)(life13_33)))) ? 1 : 0);
    }
    if (!((life8_5 != null))) {
        forestValue404_151_0 = forestValue404_147_0;
        break forest_join_151;
    }
    if (!((forestValue404_147_0 != 0))) {
        break forest_join_152;
    }
    }
    forestValue404_151_0 = 1;
    }
    forestValue404_153_0 = forestValue404_151_0;
    break forest_join_153;
    }
    forestValue404_153_0 = 0;
    }
    return ((forestValue404_153_0) != 0);
}


public net.minecraft.block.properties.IProperty<net.minecraft.block.BlockRailBase$EnumRailDirection> a__ft() {
return moom.d5.R;
}


protected boolean a(net.minecraft.world.World p0, moom.DT p1, boolean p2, int p3, net.minecraft.block.BlockRailBase$EnumRailDirection p4) {
net.minecraft.block.state.IBlockState forwardValue3197_19_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_35_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_35_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_40_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_40_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_47_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_47_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_55_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_55_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_62_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3197_62_1;
    java.lang.Comparable forwardValue3197_66_0;
    int forwardValue3197_74_0;
    int forwardValue3197_90_0;
    int forwardValue3197_92_0;
    int[] spill3197_0;
    net.minecraft.block.state.IBlockState spill3197_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_2;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_3;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_4;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_5;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_6;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_7;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_8;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3197_9;
    boolean spill3197_10;
    boolean spill3197_11;
    long life6_3;
    net.minecraft.block.state.IBlockState life9_8;
    int[] life8_9;
    net.minecraft.block.BlockRailBase$EnumRailDirection life10_27;
    forward_join_92: {
    forward_join_91: {
    forward_join_90: {
    forward_join_89: {
    forward_join_74: {
    forward_join_66: {
    forward_join_63: {
    forward_join_62: {
    forward_join_55: {
    forward_join_47: {
    forward_join_43: {
    forward_join_40: {
    forward_join_35: {
    forward_join_19: {
    forward_join_18: {
    life6_3 = (moom.d5.U ^ 24880523213704L);
    spill3197_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life9_8 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life8_9 = spill3197_0;
    spill3197_1 = life9_8;
    if (!((life8_9 != null))) {
        forwardValue3197_19_0 = spill3197_1;
        break forward_join_19;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3197_1)).a__ch() != this))) {
        break forward_join_18;
    }
    return ((0) != 0);
    }
    forwardValue3197_19_0 = life9_8;
    }
    life10_27 = ((net.minecraft.block.BlockRailBase$EnumRailDirection)(((net.minecraft.block.state.IBlockState)(forwardValue3197_19_0)).a(((net.minecraft.block.properties.IProperty)(moom.d5.R)))));
    spill3197_2 = p4;
    spill3197_3 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    if (!((life8_9 != null))) {
        forwardValue3197_47_0 = spill3197_2;
        forwardValue3197_47_1 = spill3197_3;
        break forward_join_47;
    }
    if (!((spill3197_2 == spill3197_3))) {
        break forward_join_43;
    }
    spill3197_4 = life10_27;
    spill3197_5 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    if (!((life8_9 != null))) {
        forwardValue3197_35_0 = spill3197_4;
        forwardValue3197_35_1 = spill3197_5;
        break forward_join_35;
    }
    if (!((spill3197_4 != spill3197_5))) {
        break forward_join_91;
    }
    forwardValue3197_35_0 = life10_27;
    forwardValue3197_35_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_NORTH;
    }
    if (!((life8_9 != null))) {
        forwardValue3197_40_0 = forwardValue3197_35_0;
        forwardValue3197_40_1 = forwardValue3197_35_1;
        break forward_join_40;
    }
    if (!((forwardValue3197_35_0 != forwardValue3197_35_1))) {
        break forward_join_91;
    }
    forwardValue3197_40_0 = life10_27;
    forwardValue3197_40_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_SOUTH;
    }
    if (!((life8_9 != null))) {
        forwardValue3197_47_0 = forwardValue3197_40_0;
        forwardValue3197_47_1 = forwardValue3197_40_1;
        break forward_join_47;
    }
    if (!((forwardValue3197_40_0 != forwardValue3197_40_1))) {
        break forward_join_91;
    }
    }
    spill3197_6 = p4;
    if (!((life8_9 != null))) {
        forwardValue3197_66_0 = spill3197_6;
        break forward_join_66;
    }
    forwardValue3197_47_0 = spill3197_6;
    forwardValue3197_47_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_SOUTH;
    }
    if (!((forwardValue3197_47_0 == forwardValue3197_47_1))) {
        break forward_join_63;
    }
    spill3197_7 = life10_27;
    spill3197_8 = net.minecraft.block.BlockRailBase$EnumRailDirection.EAST_WEST;
    if (!((life8_9 != null))) {
        forwardValue3197_55_0 = spill3197_7;
        forwardValue3197_55_1 = spill3197_8;
        break forward_join_55;
    }
    if (!((spill3197_7 != spill3197_8))) {
        break forward_join_91;
    }
    forwardValue3197_55_0 = life10_27;
    forwardValue3197_55_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_EAST;
    }
    if (!((life8_9 != null))) {
        forwardValue3197_62_0 = forwardValue3197_55_0;
        forwardValue3197_62_1 = forwardValue3197_55_1;
        break forward_join_62;
    }
    if (!((forwardValue3197_55_0 != forwardValue3197_55_1))) {
        break forward_join_91;
    }
    spill3197_9 = life10_27;
    if (!((life8_9 != null))) {
        forwardValue3197_66_0 = spill3197_9;
        break forward_join_66;
    }
    forwardValue3197_62_0 = spill3197_9;
    forwardValue3197_62_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.ASCENDING_WEST;
    }
    if (!((forwardValue3197_62_0 != forwardValue3197_62_1))) {
        break forward_join_91;
    }
    }
    forwardValue3197_66_0 = ((net.minecraft.block.state.IBlockState)(life9_8)).a(((net.minecraft.block.properties.IProperty)(moom.d5.S)));
    }
    spill3197_10 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue3197_66_0)))).booleanValue();
    if (!((life8_9 != null))) {
        forwardValue3197_74_0 = ((spill3197_10) ? 1 : 0);
        break forward_join_74;
    }
    if (!(spill3197_10)) {
        break forward_join_91;
    }
    forwardValue3197_74_0 = ((((net.minecraft.world.World)(p0)).l(((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((life8_9 != null))) {
        forwardValue3197_90_0 = forwardValue3197_74_0;
        break forward_join_90;
    }
    if (!((forwardValue3197_74_0 == 0))) {
        break forward_join_89;
    }
    spill3197_11 = ((moom.d5)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life9_8)), ((boolean)(p2)), ((int)((p3 + 1))));
    if (!((life8_9 != null))) {
        forwardValue3197_90_0 = ((spill3197_11) ? 1 : 0);
        break forward_join_90;
    }
    if (!(spill3197_11)) {
        break forward_join_91;
    }
    }
    forwardValue3197_90_0 = 1;
    }
    forwardValue3197_92_0 = forwardValue3197_90_0;
    break forward_join_92;
    }
    forwardValue3197_92_0 = 0;
    }
    return ((forwardValue3197_92_0) != 0);
}


private static boolean lambda$static$0(net.minecraft.block.BlockRailBase$EnumRailDirection p0) {
net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3201_13_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3201_13_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3201_18_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3201_18_1;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3201_23_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection forwardValue3201_23_1;
    int forwardValue3201_27_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3201_0;
    net.minecraft.block.BlockRailBase$EnumRailDirection spill3201_1;
    long life1_3;
    int[] life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_23: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (moom.d5.U ^ 112575582768635L);
    life3_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3201_0 = p0;
    spill3201_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_EAST;
    if (!((life3_5 != null))) {
        forwardValue3201_13_0 = spill3201_0;
        forwardValue3201_13_1 = spill3201_1;
        break forward_join_13;
    }
    if (!((spill3201_0 != spill3201_1))) {
        break forward_join_26;
    }
    forwardValue3201_13_0 = p0;
    forwardValue3201_13_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.NORTH_WEST;
    }
    if (!((life3_5 != null))) {
        forwardValue3201_18_0 = forwardValue3201_13_0;
        forwardValue3201_18_1 = forwardValue3201_13_1;
        break forward_join_18;
    }
    if (!((forwardValue3201_13_0 != forwardValue3201_13_1))) {
        break forward_join_26;
    }
    forwardValue3201_18_0 = p0;
    forwardValue3201_18_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_EAST;
    }
    if (!((life3_5 != null))) {
        forwardValue3201_23_0 = forwardValue3201_18_0;
        forwardValue3201_23_1 = forwardValue3201_18_1;
        break forward_join_23;
    }
    if (!((forwardValue3201_18_0 != forwardValue3201_18_1))) {
        break forward_join_26;
    }
    forwardValue3201_23_0 = p0;
    forwardValue3201_23_1 = net.minecraft.block.BlockRailBase$EnumRailDirection.SOUTH_WEST;
    }
    if (!((forwardValue3201_23_0 != forwardValue3201_23_1))) {
        break forward_join_26;
    }
    forwardValue3201_27_0 = 1;
    break forward_join_27;
    }
    forwardValue3201_27_0 = 0;
    }
    return ((forwardValue3201_27_0) != 0);
}


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_eb8803ad1f63_originalDynamicSite800_40() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5fe8ef575248_invokedynamic404_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7231_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8db5871551d4_invokedynamic3198_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3200_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_invokedynamic3200_8(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
