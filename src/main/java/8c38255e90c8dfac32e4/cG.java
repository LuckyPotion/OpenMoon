package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cG extends moom.cu implements net.minecraft.block.IGrowable {

public static final moom.fw<net.minecraft.block.BlockPlanks$EnumType> R;

public static final moom.fy S;

private static final long T;

private static final long[] V;

private static final java.lang.Integer[] W;

private static final java.util.Map X;

protected cG() {
super();
    ((moom.cG)(this)).a__Void(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.fA)(((moom.cG)(this)).M)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cG.R)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.OAK))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.cG.S)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(0)))))))));
    float local1 = 0x1.99999ap-2f;
    ((moom.cG)(this)).a(((float)((0x1.0p-1f - local1))), ((float)(0x0.0p0f)), ((float)((0x1.0p-1f - local1))), ((float)((0x1.0p-1f + local1))), ((float)((local1 * 0x1.0p1f))), ((float)((0x1.0p-1f + local1))));
    ((moom.cG)(this)).a(((net.minecraft.creativetab.CreativeTabs)(net.minecraft.creativetab.CreativeTabs.c)));
    return;
}


static {
T = ((long)(((moom._a)(moom._c.a(((long)(8022375355696233335L)), ((long)(2094367430619487817L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(207985061934940L)))));
    X = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.cG.T ^ 125299348381549L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1124_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1124_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1124_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1124_14 = new byte[8];
    (__sourceSpill1124_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1124_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1124_16 = __sourceSpill1124_14;
    ((javax.crypto.Cipher)(__sourceSpill1124_11)).init(((int)(__sourceSpill1124_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1124_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1124_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[7];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "F\006öUa»°Û$FëEXÄ]j\bð8>¸$¥@³b\035A^'°}¡ÜÙ"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1124_25 = local6_life21;
        int __sourceSpill1124_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1124_25)).substring(((int)(__sourceSpill1124_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1124_30 = local8_life19;
        int __sourceSpill1124_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1124_33 = new byte[8];
        (__sourceSpill1124_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1124_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1124_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1124_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1124_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1124_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1124_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1124_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1124_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1124_34)).doFinal(((byte[])(__sourceSpill1124_33)));
        (__sourceSpill1124_30)[__sourceSpill1124_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "CÙ)&\002p1VÁ£p8\000ø"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1124_38 = local6_life21;
        int __sourceSpill1124_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1124_38)).substring(((int)(__sourceSpill1124_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1124_43 = local8_life19;
        int __sourceSpill1124_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1124_46 = new byte[8];
        (__sourceSpill1124_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1124_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1124_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1124_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1124_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1124_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1124_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1124_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1124_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1124_47)).doFinal(((byte[])(__sourceSpill1124_46)));
        (__sourceSpill1124_43)[__sourceSpill1124_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    V = ((long[])(local8_life19));
    W = ((java.lang.Integer[])(new java.lang.Integer[7]));
    R = ((moom.fw)(moom.fw.a(((java.lang.String)("type")), ((java.lang.Class)(net.minecraft.block.BlockPlanks$EnumType.class)))));
    S = ((moom.fy)(moom.fy.a(((java.lang.String)("stage")), ((int)(0)), ((int)(1)))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7056_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/cG"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.block.state.IBlockState b__fE(int p0) {
long local2 = (moom.cG.T ^ 122423017287736L);
    return ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.cG)(this)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.cG.R)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.a(((int)((p0 & __sourceIntrinsic_819466f05fee_originalDynamicSite1399_3(2065, (5259628521302323197L ^ local2))))))))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.cG.S)), ((java.lang.Comparable)(java.lang.Integer.valueOf(((int)(((p0 & __sourceIntrinsic_819466f05fee_originalDynamicSite1399_7(13300, (775923153292874781L ^ local2))) >> 3)))))));
}


public int b(net.minecraft.block.state.IBlockState p0) {
int local2 = 0;
    local2 = (local2 | ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cG.R))))))).a());
    local2 = (local2 | (((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cG.S))))))).intValue() << 3));
    return local2;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.cG.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3108;
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
            throw new RuntimeException("moom/cG", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         W[var3] = var15;
      }

      return W[var3];
}


public void b(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3047_21_0;
    int forwardValue3047_36_0;
    boolean spill3047_0;
    long life5_3;
    int[] life7_5;
    forward_join_43: {
    forward_join_36: {
    forward_join_21: {
    life5_3 = (moom.cG.T ^ 72181682426607L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3047_0 = ((net.minecraft.world.World)(p0)).G;
    if (!((life7_5 != null))) {
        forwardValue3047_21_0 = ((spill3047_0) ? 1 : 0);
        break forward_join_21;
    }
    if (!((!spill3047_0))) {
        break forward_join_43;
    }
    super.b(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    forwardValue3047_21_0 = ((net.minecraft.world.World)(p0)).b(((moom.DT)(((moom.DT)(p1)).a__DT())));
    }
    if (!((life7_5 != null))) {
        forwardValue3047_36_0 = forwardValue3047_21_0;
        break forward_join_36;
    }
    if (!((forwardValue3047_21_0 >= __sourceIntrinsic_b4b54c999db9_invokedynamic3047_7(26599, (7907416019877618395L ^ life5_3))))) {
        break forward_join_43;
    }
    forwardValue3047_36_0 = ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_b4b54c999db9_invokedynamic3047_8(21015, (6507201174384629544L ^ life5_3)))));
    }
    if (!((forwardValue3047_36_0 == 0))) {
        break forward_join_43;
    }
    ((moom.cG)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    }
    return;
}


public void e(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
moom.F0 forestValue13_23_0;
    int forestValue13_41_0;
    int forestValue13_43_0;
    int forestValue13_80_0;
    int forestValue13_86_0;
    int forestValue13_120_0;
    int forestValue13_167_0;
    int forestValue13_203_0;
    int forestValue13_238_0;
    int forestValue13_244_0;
    int forestValue13_302_0;
    int forestValue13_316_0;
    int forestValue13_374_0;
    int spill13_0;
    int spill13_1;
    boolean spill13_2;
    int spill13_3;
    boolean spill13_4;
    int spill13_5;
    boolean spill13_6;
    boolean spill13_7;
    long life5_3;
    int[] life7_5;
    moom.F0 life8_25;
    int life9_27;
    int life10_29;
    int life11_31;
    net.minecraft.block.state.IBlockState life12_130;
    net.minecraft.block.state.IBlockState life13_139;
    forest_join_375: {
    forest_join_374: {
    forest_join_369: {
    forest_join_316: {
    forest_join_303: {
    forest_join_302: {
    forest_join_297: {
    forest_join_244: {
    forest_join_240: {
    forest_join_238: {
    forest_join_237: {
    forest_join_200: {
    forest_join_193: {
    forest_join_167: {
    forest_join_166: {
    forest_join_102: {
    forest_join_94: {
    forest_join_86: {
    forest_join_80: {
    forest_join_79: {
    forest_join_41: {
    forest_join_40: {
    forest_join_23: {
    forest_join_19: {
    life5_3 = (moom.cG.T ^ 74043817146536L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    if (!((((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_0e2bbd1749dd_invokedynamic13_2(2378, (4957516948765500983L ^ life5_3))))) == 0))) {
        break forest_join_19;
    }
    forestValue13_23_0 = new moom.F1(true);
    break forest_join_23;
    }
    forestValue13_23_0 = new moom.Ga(true);
    }
    life8_25 = forestValue13_23_0;
    life9_27 = 0;
    life10_29 = 0;
    life11_31 = 0;
    spill13_0 = (moom.fa.a)[((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cG.R))))))).ordinal()];
    if (!((life7_5 != null))) {
        forestValue13_41_0 = spill13_0;
        break forest_join_41;
    }
    switch (spill13_0) {
case 1:
{
        break forest_join_40;
    }
case 2:
{
        break forest_join_94;
    }
case 3:
{
        break forest_join_102;
    }
case 4:
{
        break forest_join_193;
    }
case 5:
{
        break forest_join_200;
    }
case 6:
default:
{
        break forest_join_240;
    }
}
    }
    forestValue13_41_0 = 0;
    }
    life9_27 = forestValue13_41_0;
    forest_cycle_42: while (true) {
    forest_join_76: {
    forestValue13_43_0 = life9_27;
    forest_cycle_43: while (true) {
    if (!((forestValue13_43_0 >= -1))) {
        break forest_join_79;
    }
    spill13_1 = 0;
    if (!((life7_5 != null))) {
        forestValue13_80_0 = spill13_1;
        break forest_join_80;
    }
    life10_29 = spill13_1;
    forest_cycle_49: while (true) {
    forest_join_73: {
    if (!((life10_29 >= -1))) {
        break forest_join_76;
    }
    spill13_2 = ((moom.cG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((int)(life9_27)), ((int)(life10_29)), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.SPRUCE)));
    if (!((life7_5 != null))) {
        forestValue13_43_0 = ((spill13_2) ? 1 : 0);
        continue forest_cycle_43;
    }
    if (!(spill13_2)) {
        break forest_join_73;
    }
    life8_25 = new moom.F6(false, ((java.util.Random)(p3)).nextBoolean());
    life11_31 = 1;
    if (!((life7_5 == null))) {
        break forest_join_79;
    }
    }
    life10_29 += -1;
    if (!((life7_5 == null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    break forest_cycle_43;
    }
    }
    life9_27 += -1;
    if (!((life7_5 == null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    }
    forestValue13_80_0 = life11_31;
    }
    if (!((life7_5 != null))) {
        forestValue13_86_0 = forestValue13_80_0;
        break forest_join_86;
    }
    if (!((forestValue13_80_0 == 0))) {
        break forest_join_240;
    }
    life10_29 = 0;
    forestValue13_86_0 = 0;
    }
    life9_27 = forestValue13_86_0;
    life8_25 = new moom.F_(true);
    if (!((life7_5 == null))) {
        break forest_join_240;
    }
    }
    life8_25 = new moom.F3(true, false);
    if (!((life7_5 == null))) {
        break forest_join_240;
    }
    }
    life12_130 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.r)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ee.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)));
    life13_139 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.t)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dJ.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)));
    life9_27 = 0;
    forest_cycle_119: while (true) {
    forest_join_163: {
    forestValue13_120_0 = life9_27;
    forest_cycle_120: while (true) {
    if (!((forestValue13_120_0 >= -1))) {
        break forest_join_166;
    }
    spill13_3 = 0;
    if (!((life7_5 != null))) {
        forestValue13_167_0 = spill13_3;
        break forest_join_167;
    }
    life10_29 = spill13_3;
    forest_cycle_126: while (true) {
    forest_join_160: {
    if (!((life10_29 >= -1))) {
        break forest_join_163;
    }
    spill13_4 = ((moom.cG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((int)(life9_27)), ((int)(life10_29)), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.JUNGLE)));
    if (!((life7_5 != null))) {
        forestValue13_120_0 = ((spill13_4) ? 1 : 0);
        continue forest_cycle_120;
    }
    if (!(spill13_4)) {
        break forest_join_160;
    }
    life8_25 = new moom.F5(true, __sourceIntrinsic_0e2bbd1749dd_invokedynamic13_29(30805, (8548536367976978219L ^ life5_3)), __sourceIntrinsic_0e2bbd1749dd_invokedynamic13_30(8954, (9148165449953103232L ^ life5_3)), life12_130, life13_139);
    life11_31 = 1;
    if (!((life7_5 == null))) {
        break forest_join_166;
    }
    }
    life10_29 += -1;
    if (!((life7_5 == null))) {
        continue forest_cycle_126;
    }
    break forest_cycle_126;
    }
    break forest_cycle_120;
    }
    }
    life9_27 += -1;
    if (!((life7_5 == null))) {
        continue forest_cycle_119;
    }
    break forest_cycle_119;
    }
    }
    forestValue13_167_0 = life11_31;
    }
    if (!((life7_5 != null))) {
        forestValue13_244_0 = forestValue13_167_0;
        break forest_join_244;
    }
    if (!((forestValue13_167_0 == 0))) {
        break forest_join_240;
    }
    life10_29 = 0;
    life9_27 = 0;
    life8_25 = new moom.Ga(true, (4 + ((java.util.Random)(p3)).nextInt(((int)(__sourceIntrinsic_0e2bbd1749dd_invokedynamic13_31(21015, (6507202336452132207L ^ life5_3)))))), life12_130, life13_139, false);
    if (!((life7_5 == null))) {
        break forest_join_240;
    }
    }
    life8_25 = new moom.F7(true);
    if (!((life7_5 == null))) {
        break forest_join_240;
    }
    }
    life9_27 = 0;
    forest_cycle_202: while (true) {
    forest_join_234: {
    forestValue13_203_0 = life9_27;
    forest_cycle_203: while (true) {
    if (!((forestValue13_203_0 >= -1))) {
        break forest_join_237;
    }
    spill13_5 = 0;
    if (!((life7_5 != null))) {
        forestValue13_238_0 = spill13_5;
        break forest_join_238;
    }
    life10_29 = spill13_5;
    forest_cycle_209: while (true) {
    forest_join_231: {
    if (!((life10_29 >= -1))) {
        break forest_join_234;
    }
    spill13_6 = ((moom.cG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((int)(life9_27)), ((int)(life10_29)), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)));
    if (!((life7_5 != null))) {
        forestValue13_203_0 = ((spill13_6) ? 1 : 0);
        continue forest_cycle_203;
    }
    if (!(spill13_6)) {
        break forest_join_231;
    }
    life8_25 = new moom.F2(true);
    life11_31 = 1;
    if (!((life7_5 == null))) {
        break forest_join_237;
    }
    }
    life10_29 += -1;
    if (!((life7_5 == null))) {
        continue forest_cycle_209;
    }
    break forest_cycle_209;
    }
    break forest_cycle_203;
    }
    }
    life9_27 += -1;
    if (!((life7_5 == null))) {
        continue forest_cycle_202;
    }
    break forest_cycle_202;
    }
    }
    forestValue13_238_0 = life11_31;
    }
    if (!((forestValue13_238_0 == 0))) {
        break forest_join_240;
    }
    return;
    }
    life12_130 = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE();
    forestValue13_244_0 = life11_31;
    }
    if (!((life7_5 != null))) {
        forestValue13_302_0 = forestValue13_244_0;
        break forest_join_302;
    }
    if (!((forestValue13_244_0 != 0))) {
        break forest_join_297;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)(life9_27)), ((int)(0)), ((int)(life10_29))))), ((net.minecraft.block.state.IBlockState)(life12_130)), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)((life9_27 + 1))), ((int)(0)), ((int)(life10_29))))), ((net.minecraft.block.state.IBlockState)(life12_130)), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)(life9_27)), ((int)(0)), ((int)((life10_29 + 1)))))), ((net.minecraft.block.state.IBlockState)(life12_130)), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)((life9_27 + 1))), ((int)(0)), ((int)((life10_29 + 1)))))), ((net.minecraft.block.state.IBlockState)(life12_130)), ((int)(4)));
    if (!((life7_5 == null))) {
        break forest_join_303;
    }
    }
    forestValue13_302_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(life12_130)), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue13_302_0);
    }
    spill13_7 = ((moom.FY)(life8_25)).a__Boolean(((net.minecraft.world.World)(p0)), ((java.util.Random)(p3)), ((moom.DT)(((moom.DT)(p1)).a(((int)(life9_27)), ((int)(0)), ((int)(life10_29))))));
    if (!((life7_5 != null))) {
        forestValue13_316_0 = ((spill13_7) ? 1 : 0);
        break forest_join_316;
    }
    if (!((!spill13_7))) {
        break forest_join_375;
    }
    forestValue13_316_0 = life11_31;
    }
    if (!((life7_5 != null))) {
        forestValue13_374_0 = forestValue13_316_0;
        break forest_join_374;
    }
    if (!((forestValue13_316_0 != 0))) {
        break forest_join_369;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)(life9_27)), ((int)(0)), ((int)(life10_29))))), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)((life9_27 + 1))), ((int)(0)), ((int)(life10_29))))), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)(life9_27)), ((int)(0)), ((int)((life10_29 + 1)))))), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)));
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(((moom.DT)(p1)).a(((int)((life9_27 + 1))), ((int)(0)), ((int)((life10_29 + 1)))))), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)));
    if (!((life7_5 == null))) {
        break forest_join_375;
    }
    }
    forestValue13_374_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue13_374_0);
    }
    return;
}


public int c(net.minecraft.block.state.IBlockState p0) {
return ((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.BlockPlanks$EnumType)(((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(moom.cG.R))))))).a();
}


public void d(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, java.util.Random p3) {
int forwardValue3048_21_0;
    int spill3048_0;
    long life5_3;
    int[] life7_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_21: {
    life5_3 = (moom.cG.T ^ 72526567599215L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3048_0 = ((java.lang.Integer)(((java.lang.Integer)(((net.minecraft.block.state.IBlockState)(p2)).a(((net.minecraft.block.properties.IProperty)(moom.cG.S))))))).intValue();
    if (!((life7_5 != null))) {
        forwardValue3048_21_0 = spill3048_0;
        break forward_join_21;
    }
    if (!((spill3048_0 == 0))) {
        break forward_join_24;
    }
    forwardValue3048_21_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(p2)).a__fE(((net.minecraft.block.properties.IProperty)(moom.cG.S))))), ((int)(4)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue3048_21_0);
    if (!((life7_5 == null))) {
        break forward_join_30;
    }
    }
    ((moom.cG)(this)).e(((net.minecraft.world.World)(p0)), ((moom.DT)(p1)), ((net.minecraft.block.state.IBlockState)(p2)), ((java.util.Random)(p3)));
    }
    return;
}


public void a(net.minecraft.item.Item p0, net.minecraft.creativetab.CreativeTabs p1, java.util.List<net.minecraft.item.ItemStack> p2) {
int[] spill1068_0;
    long life4_3;
    net.minecraft.block.BlockPlanks$EnumType[] life7_6;
    int[] life6_7;
    int life8_10;
    int life9_12;
    net.minecraft.block.BlockPlanks$EnumType life10_19;
    lexical_join_33: {
    life4_3 = (moom.cG.T ^ 122459716982373L);
    spill1068_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_6 = net.minecraft.block.BlockPlanks$EnumType.values();
    life6_7 = spill1068_0;
    life8_10 = (life7_6).length;
    life9_12 = 0;
    lexical_cycle_13: while (true) {
    if (!((life9_12 < life8_10))) {
        break lexical_join_33;
    }
    life10_19 = (life7_6)[life9_12];
    ((java.util.List)(p2)).add(((java.lang.Object)(new net.minecraft.item.ItemStack(p0, 1, ((net.minecraft.block.BlockPlanks$EnumType)(life10_19)).a()))));
    life9_12 += 1;
    if (!((life6_7 == null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.BlockPlanks$EnumType p2) {
net.minecraft.block.state.IBlockState forwardValue3045_17_0;
    int forwardValue3045_24_0;
    int[] spill3045_0;
    net.minecraft.block.state.IBlockState spill3045_1;
    long life4_3;
    net.minecraft.block.state.IBlockState life7_8;
    int[] life6_9;
    forward_join_24: {
    forward_join_23: {
    forward_join_17: {
    life4_3 = (moom.cG.T ^ 120574146641020L);
    spill3045_0 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    life7_8 = ((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(p1)));
    life6_9 = spill3045_0;
    spill3045_1 = life7_8;
    if (!((life6_9 != null))) {
        forwardValue3045_17_0 = spill3045_1;
        break forward_join_17;
    }
    if (!((((net.minecraft.block.state.IBlockState)(spill3045_1)).a__ch() == this))) {
        break forward_join_23;
    }
    forwardValue3045_17_0 = life7_8;
    }
    if (!((((net.minecraft.block.state.IBlockState)(forwardValue3045_17_0)).a(((net.minecraft.block.properties.IProperty)(moom.cG.R))) == p2))) {
        break forward_join_23;
    }
    forwardValue3045_24_0 = 1;
    break forward_join_24;
    }
    forwardValue3045_24_0 = 0;
    }
    return ((forwardValue3045_24_0) != 0);
}


public java.lang.String a__String() {
return net.minecraft.util.StatCollector.a(((java.lang.String)(__sourceIntrinsic_64ccfb84e285_originalDynamicSite1400_3(((moom.cG)(this)).b__String(), ((net.minecraft.block.BlockPlanks$EnumType)(net.minecraft.block.BlockPlanks$EnumType.OAK)).b()))));
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
int forwardValue3046_16_0;
    int forwardValue3046_18_0;
    int spill3046_0;
    long life5_3;
    int[] life7_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life5_3 = (moom.cG.T ^ 61795252247156L);
    life7_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3046_0 = recovery.source.CarrierOps.dcmpg(((double)(((double) ((java.util.Random)(((net.minecraft.world.World)(p0)).u)).nextFloat()))), ((double)(0x1.ccccccccccccdp-2d)));
    if (!((life7_5 != null))) {
        forwardValue3046_16_0 = spill3046_0;
        break forward_join_16;
    }
    if (!((spill3046_0 < 0))) {
        break forward_join_17;
    }
    forwardValue3046_16_0 = 1;
    }
    forwardValue3046_18_0 = forwardValue3046_16_0;
    break forward_join_18;
    }
    forwardValue3046_18_0 = 0;
    }
    return ((forwardValue3046_18_0) != 0);
}


public void a(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2, net.minecraft.block.state.IBlockState p3) {
((moom.cG)(this)).d(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(p3)), ((java.util.Random)(p1)));
    return;
}


private boolean a(net.minecraft.world.World p0, moom.DT p1, int p2, int p3, net.minecraft.block.BlockPlanks$EnumType p4) {
int forwardValue3044_29_0;
    int forwardValue3044_43_0;
    int forwardValue3044_59_0;
    int forwardValue3044_63_0;
    int forwardValue3044_65_0;
    boolean spill3044_0;
    long life6_3;
    int[] life8_5;
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_59: {
    forward_join_43: {
    forward_join_29: {
    life6_3 = (moom.cG.T ^ 21813253936633L);
    life8_5 = net.minecraft.block.BlockPlanks$EnumType.b__ArrayInt();
    spill3044_0 = ((moom.cG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((int)(p2)), ((int)(0)), ((int)(p3))))), ((net.minecraft.block.BlockPlanks$EnumType)(p4)));
    if (!((life8_5 != null))) {
        forwardValue3044_29_0 = ((spill3044_0) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill3044_0)) {
        break forward_join_64;
    }
    forwardValue3044_29_0 = ((((moom.cG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((int)((p2 + 1))), ((int)(0)), ((int)(p3))))), ((net.minecraft.block.BlockPlanks$EnumType)(p4)))) ? 1 : 0);
    }
    if (!((life8_5 != null))) {
        forwardValue3044_43_0 = forwardValue3044_29_0;
        break forward_join_43;
    }
    if (!((forwardValue3044_29_0 != 0))) {
        break forward_join_64;
    }
    forwardValue3044_43_0 = ((((moom.cG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((int)(p2)), ((int)(0)), ((int)((p3 + 1)))))), ((net.minecraft.block.BlockPlanks$EnumType)(p4)))) ? 1 : 0);
    }
    if (!((life8_5 != null))) {
        forwardValue3044_59_0 = forwardValue3044_43_0;
        break forward_join_59;
    }
    if (!((forwardValue3044_43_0 != 0))) {
        break forward_join_64;
    }
    forwardValue3044_59_0 = ((((moom.cG)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(p1)).a(((int)((p2 + 1))), ((int)(0)), ((int)((p3 + 1)))))), ((net.minecraft.block.BlockPlanks$EnumType)(p4)))) ? 1 : 0);
    }
    if (!((life8_5 != null))) {
        forwardValue3044_63_0 = forwardValue3044_59_0;
        break forward_join_63;
    }
    if (!((forwardValue3044_59_0 != 0))) {
        break forward_join_64;
    }
    forwardValue3044_63_0 = 1;
    }
    forwardValue3044_65_0 = forwardValue3044_63_0;
    break forward_join_65;
    }
    forwardValue3044_65_0 = 0;
    }
    return ((forwardValue3044_65_0) != 0);
}


public boolean a(net.minecraft.world.World p0, moom.DT p1, net.minecraft.block.state.IBlockState p2, boolean p3) {
return ((1) != 0);
}


protected moom.fA a__fA() {
return new moom.fA(this, new net.minecraft.block.properties.IProperty[] {moom.cG.R, moom.cG.S});
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite1400_3(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral7056_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic3047_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4b54c999db9_invokedynamic3047_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_originalDynamicSite1399_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_819466f05fee_originalDynamicSite1399_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e2bbd1749dd_invokedynamic13_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e2bbd1749dd_invokedynamic13_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e2bbd1749dd_invokedynamic13_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e2bbd1749dd_invokedynamic13_31(int a0, long a1) throws E;
}
