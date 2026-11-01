package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class F2 extends moom.F0 {

private static final net.minecraft.block.state.IBlockState c;

private static final net.minecraft.block.state.IBlockState d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public F2(boolean p0) {
super(p0);
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2150090802569824226L)), ((long)(-8743309198343205712L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(96869467142447L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.F2.e ^ 64125094946313L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill728_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill728_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill728_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill728_14 = new byte[8];
    (__sourceSpill728_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill728_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation728_16 = __sourceSpill728_14;
    ((javax.crypto.Cipher)(__sourceSpill728_11)).init(((int)(__sourceSpill728_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill728_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation728_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[6];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "äïoñó[$\000\"\"èâ\027W÷º\177ýÝàÚ\026ª×ëv\"["))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill728_25 = local6_life21;
        int __sourceSpill728_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill728_25)).substring(((int)(__sourceSpill728_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill728_30 = local8_life19;
        int __sourceSpill728_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill728_33 = new byte[8];
        (__sourceSpill728_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill728_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill728_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill728_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill728_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill728_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill728_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill728_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill728_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill728_34)).doFinal(((byte[])(__sourceSpill728_33)));
        (__sourceSpill728_30)[__sourceSpill728_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ÚyºÍ¬óy \fÊ\002<Ó"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill728_38 = local6_life21;
        int __sourceSpill728_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill728_38)).substring(((int)(__sourceSpill728_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill728_43 = local8_life19;
        int __sourceSpill728_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill728_46 = new byte[8];
        (__sourceSpill728_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill728_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill728_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill728_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill728_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill728_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill728_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill728_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill728_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill728_47)).doFinal(((byte[])(__sourceSpill728_46)));
        (__sourceSpill728_43)[__sourceSpill728_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[6]));
    c = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.s)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.ed.S)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK)))));
    d = ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((net.minecraft.block.state.IBlockState)(((moom.dH)(net.minecraft.init.Blocks.u)).a__fE())).a__fE(((net.minecraft.block.properties.IProperty)(moom.dI.W)), ((java.lang.Comparable)(net.minecraft.block.BlockPlanks$EnumType.DARK_OAK))))).a__fE(((net.minecraft.block.properties.IProperty)(moom.dH.S)), ((java.lang.Comparable)(java.lang.Boolean.FALSE)))));
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void b(net.minecraft.world.World p0, moom.DT p1) {
moom.F2 forwardValue1870_18_0;
    net.minecraft.world.World forwardValue1870_18_1;
    moom.DT forwardValue1870_18_2;
    moom.F2 spill1870_0;
    net.minecraft.world.World spill1870_1;
    moom.DT spill1870_2;
    long life3_3;
    int[] life5_5;
    forward_join_20: {
    forward_join_18: {
    life3_3 = (moom.F2.e ^ 33424386821765L);
    life5_5 = moom.FY.b();
    spill1870_0 = this;
    spill1870_1 = p0;
    spill1870_2 = p1;
    if (!((life5_5 != null))) {
        forwardValue1870_18_0 = spill1870_0;
        forwardValue1870_18_1 = spill1870_1;
        forwardValue1870_18_2 = spill1870_2;
        break forward_join_18;
    }
    if (!(((moom.F2)(spill1870_0)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill1870_1)).a__fE(((moom.DT)(spill1870_2))))).a__ch()))))) {
        break forward_join_20;
    }
    forwardValue1870_18_0 = this;
    forwardValue1870_18_1 = p0;
    forwardValue1870_18_2 = p1;
    }
    ((moom.F2)(forwardValue1870_18_0)).a(((net.minecraft.world.World)(forwardValue1870_18_1)), ((moom.DT)(forwardValue1870_18_2)), ((net.minecraft.block.state.IBlockState)(moom.F2.c)));
    }
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.F2.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2014;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/F2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4424_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/F2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private boolean a(net.minecraft.world.World p0, moom.DT p1, int p2) {
int forestValue610_22_0;
    int forestValue610_37_0;
    int forestValue610_47_0;
    int forestValue610_49_0;
    int forestValue610_92_0;
    int forestValue610_94_0;
    int[] spill610_0;
    int spill610_1;
    int spill610_2;
    boolean spill610_3;
    long life4_3;
    int life7_6;
    int life8_10;
    int[] life6_11;
    int life9_14;
    moom.DU life10_18;
    int life11_20;
    int life12_27;
    int life13_50;
    int life14_58;
    forest_join_94: {
    forest_join_93: {
    forest_join_92: {
    forest_join_91: {
    life4_3 = (moom.F2.e ^ 8245789228233L);
    life7_6 = ((moom.DT)(p1)).a();
    spill610_0 = moom.FY.b();
    life8_10 = ((moom.DT)(p1)).b();
    life6_11 = spill610_0;
    life9_14 = ((moom.DT)(p1)).c();
    life10_18 = new moom.DU();
    life11_20 = 0;
    forest_cycle_21: while (true) {
    forest_join_87: {
    forestValue610_22_0 = life11_20;
    forest_cycle_22: while (true) {
    forest_join_47: {
    forest_join_45: {
    forest_join_37: {
    forest_join_36: {
    if (!((forestValue610_22_0 <= (p2 + 1)))) {
        break forest_join_93;
    }
    life12_27 = 1;
    spill610_1 = life11_20;
    if (!((life6_11 != null))) {
        forestValue610_94_0 = spill610_1;
        break forest_join_94;
    }
    if (!((life6_11 != null))) {
        forestValue610_37_0 = spill610_1;
        break forest_join_37;
    }
    if (!((spill610_1 == 0))) {
        break forest_join_36;
    }
    life12_27 = 0;
    }
    forestValue610_37_0 = life11_20;
    }
    if (!((life6_11 != null))) {
        forestValue610_47_0 = forestValue610_37_0;
        break forest_join_47;
    }
    if (!((forestValue610_37_0 >= (p2 - 1)))) {
        break forest_join_45;
    }
    life12_27 = 2;
    }
    forestValue610_47_0 = (-life12_27);
    }
    life13_50 = forestValue610_47_0;
    forest_cycle_48: while (true) {
    forest_join_84: {
    forestValue610_49_0 = life13_50;
    forest_cycle_49: while (true) {
    if (!((forestValue610_49_0 <= life12_27))) {
        break forest_join_87;
    }
    spill610_2 = (-life12_27);
    if (!((life6_11 != null))) {
        forestValue610_22_0 = spill610_2;
        continue forest_cycle_22;
    }
    life14_58 = spill610_2;
    forest_cycle_56: while (true) {
    forest_join_81: {
    if (!((life14_58 <= life12_27))) {
        break forest_join_84;
    }
    spill610_3 = ((moom.F2)(this)).a(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DU)(life10_18)).a(((int)((life7_6 + life13_50))), ((int)((life8_10 + life11_20))), ((int)((life9_14 + life14_58))))))))).a__ch())));
    if (!((life6_11 != null))) {
        forestValue610_49_0 = ((spill610_3) ? 1 : 0);
        continue forest_cycle_49;
    }
    if (!((life6_11 != null))) {
        forestValue610_92_0 = ((spill610_3) ? 1 : 0);
        break forest_join_92;
    }
    if (!((!spill610_3))) {
        break forest_join_81;
    }
    break forest_join_91;
    }
    life14_58 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_cycle_49;
    }
    }
    life13_50 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_48;
    }
    break forest_cycle_48;
    }
    break forest_cycle_22;
    }
    }
    life11_20 += 1;
    if (!((life6_11 == null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_join_93;
    }
    forestValue610_92_0 = 0;
    }
    return ((forestValue610_92_0) != 0);
    }
    forestValue610_94_0 = 1;
    }
    return ((forestValue610_94_0) != 0);
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
net.minecraft.block.Block forestValue248_62_0;
    net.minecraft.block.Block forestValue248_62_1;
    moom.F2 forestValue248_94_0;
    net.minecraft.world.World forestValue248_94_1;
    moom.DT forestValue248_94_2;
    int forestValue248_150_0;
    int forestValue248_150_1;
    int forestValue248_151_0;
    int forestValue248_292_0;
    int forestValue248_292_1;
    int forestValue248_303_0;
    int forestValue248_368_0;
    int forestValue248_416_0;
    int forestValue248_419_0;
    int forestValue248_422_0;
    int forestValue248_422_1;
    int forestValue248_460_0;
    int forestValue248_460_1;
    int forestValue248_470_0;
    int forestValue248_470_1;
    int forestValue248_484_0;
    int forestValue248_484_1;
    int forestValue248_495_0;
    int forestValue248_495_1;
    int forestValue248_501_0;
    int forestValue248_501_1;
    int forestValue248_519_0;
    int forestValue248_519_1;
    int forestValue248_557_0;
    int forestValue248_557_1;
    int forestValue248_567_0;
    int forestValue248_567_1;
    int forestValue248_581_0;
    int forestValue248_581_1;
    int forestValue248_592_0;
    int forestValue248_592_1;
    int forestValue248_598_0;
    int forestValue248_598_1;
    int forestValue248_620_0;
    int forestValue248_622_0;
    int forestValue248_629_0;
    int forestValue248_654_0;
    int forestValue248_662_0;
    int forestValue248_729_0;
    int forestValue248_732_0;
    int forestValue248_732_1;
    int forestValue248_755_0;
    int forestValue248_755_1;
    int forestValue248_785_0;
    int[] spill248_0;
    int spill248_1;
    int spill248_2;
    net.minecraft.block.Block spill248_3;
    moom.dC spill248_4;
    moom.F2 spill248_5;
    net.minecraft.world.World spill248_6;
    moom.DT spill248_7;
    int spill248_8;
    int spill248_9;
    int spill248_10;
    int spill248_11;
    int spill248_12;
    int spill248_13;
    int spill248_14;
    int spill248_15;
    int spill248_16;
    int spill248_17;
    int spill248_18;
    int spill248_19;
    int spill248_20;
    int spill248_21;
    int spill248_22;
    int spill248_23;
    int spill248_24;
    int spill248_25;
    int spill248_26;
    int spill248_27;
    int spill248_28;
    int spill248_29;
    int spill248_30;
    int spill248_31;
    int spill248_32;
    int spill248_33;
    int spill248_34;
    int spill248_35;
    int spill248_36;
    int spill248_37;
    int spill248_38;
    int spill248_39;
    int spill248_40;
    int spill248_41;
    int spill248_42;
    int spill248_43;
    int spill248_44;
    int spill248_45;
    int spill248_46;
    int spill248_47;
    int spill248_48;
    int spill248_49;
    int spill248_50;
    long life4_3;
    int life7_17;
    int life8_21;
    int[] life6_22;
    int life9_25;
    int life10_28;
    moom.DT life11_56;
    net.minecraft.block.Block life12_61;
    moom.bs life13_114;
    int life14_120;
    int life15_126;
    int life16_128;
    int life17_130;
    int life18_136;
    int life19_138;
    int life20_181;
    moom.DT life21_188;
    moom.fn life22_194;
    int life20_252;
    int life21_258;
    int life21_364;
    int life19_486;
    int life20_504;
    int life20_645;
    int life19_782;
    int life20_793;
    int life21_852;
    int life22_854;
    int life23_897;
    int life22_936;
    int life23_951;
    forest_join_785: {
    forest_join_784: {
    forest_join_620: {
    forest_join_619: {
    forest_join_519: {
    forest_join_420: {
    forest_join_419: {
    forest_join_418: {
    forest_join_416: {
    forest_join_411: {
    forest_join_368: {
    forest_join_366: {
    forest_join_196: {
    forest_join_94: {
    forest_join_75: {
    forest_join_65: {
    forest_join_62: {
    life4_3 = (moom.F2.e ^ 69323663885687L);
    life7_17 = ((((java.util.Random)(p1)).nextInt(((int)(3))) + ((java.util.Random)(p1)).nextInt(((int)(2)))) + __sourceIntrinsic_e7ba66b54646_invokedynamic248_3(5742, (6797706606954616010L ^ life4_3)));
    spill248_0 = moom.FY.b();
    life8_21 = ((moom.DT)(p2)).a();
    life6_22 = spill248_0;
    life9_25 = ((moom.DT)(p2)).b();
    life10_28 = ((moom.DT)(p2)).c();
    spill248_1 = life9_25;
    if (!((life6_22 != null))) {
        forestValue248_419_0 = spill248_1;
        break forest_join_419;
    }
    if (!((spill248_1 >= 1))) {
        break forest_join_418;
    }
    spill248_2 = ((life9_25 + life7_17) + 1);
    if (!((life6_22 != null))) {
        forestValue248_419_0 = spill248_2;
        break forest_join_419;
    }
    if (!((spill248_2 < __sourceIntrinsic_e7ba66b54646_invokedynamic248_8(29220, (8013281444951191684L ^ life4_3))))) {
        break forest_join_418;
    }
    life11_56 = ((moom.DT)(p2)).b__DT();
    life12_61 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life11_56))))).a__ch();
    spill248_3 = life12_61;
    spill248_4 = net.minecraft.init.Blocks.c;
    if (!((life6_22 != null))) {
        forestValue248_62_0 = spill248_3;
        forestValue248_62_1 = spill248_4;
        break forest_join_62;
    }
    if (!((spill248_3 != spill248_4))) {
        break forest_join_65;
    }
    forestValue248_62_0 = life12_61;
    forestValue248_62_1 = net.minecraft.init.Blocks.d;
    }
    if (!((forestValue248_62_0 != forestValue248_62_1))) {
        break forest_join_65;
    }
    return ((0) != 0);
    }
    spill248_5 = this;
    spill248_6 = p0;
    spill248_7 = p2;
    if (!((life6_22 != null))) {
        forestValue248_94_0 = spill248_5;
        forestValue248_94_1 = spill248_6;
        forestValue248_94_2 = spill248_7;
        break forest_join_94;
    }
    if (!((!((moom.F2)(spill248_5)).a(((net.minecraft.world.World)(spill248_6)), ((moom.DT)(spill248_7)), ((int)(life7_17)))))) {
        break forest_join_75;
    }
    return ((0) != 0);
    }
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(life11_56)));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life11_56)).f())));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life11_56)).d__DT())));
    forestValue248_94_0 = this;
    forestValue248_94_1 = p0;
    forestValue248_94_2 = ((moom.DT)(((moom.DT)(life11_56)).d__DT())).f();
    }
    ((moom.F2)(forestValue248_94_0)).a(((net.minecraft.world.World)(forestValue248_94_1)), ((moom.DT)(forestValue248_94_2)));
    life13_114 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).a(((java.util.Random)(p1)));
    life14_120 = (life7_17 - ((java.util.Random)(p1)).nextInt(((int)(4))));
    life15_126 = (2 - ((java.util.Random)(p1)).nextInt(((int)(3))));
    life16_128 = life8_21;
    life17_130 = life10_28;
    life18_136 = ((life9_25 + life7_17) - 1);
    life19_138 = 0;
    forest_cycle_123: while (true) {
    forest_join_193: {
    forest_join_187: {
    forest_join_173: {
    forest_join_151: {
    forest_join_150: {
    forest_join_148: {
    if (!((life19_138 < life7_17))) {
        break forest_join_196;
    }
    spill248_8 = life19_138;
    spill248_9 = life14_120;
    if (!((life6_22 != null))) {
        forestValue248_519_0 = spill248_8;
        forestValue248_519_1 = spill248_9;
        break forest_join_519;
    }
    if (!((life6_22 != null))) {
        forestValue248_150_0 = spill248_8;
        forestValue248_150_1 = spill248_9;
        break forest_join_150;
    }
    if (!((spill248_8 >= spill248_9))) {
        break forest_join_148;
    }
    spill248_10 = life15_126;
    if (!((life6_22 != null))) {
        forestValue248_151_0 = spill248_10;
        break forest_join_151;
    }
    if (!((spill248_10 > 0))) {
        break forest_join_148;
    }
    life16_128 = (life16_128 + ((moom.bs)(life13_114)).c());
    life17_130 = (life17_130 + ((moom.bs)(life13_114)).e());
    life15_126 += -1;
    }
    forestValue248_150_0 = life9_25;
    forestValue248_150_1 = life19_138;
    }
    forestValue248_151_0 = (forestValue248_150_0 + forestValue248_150_1);
    }
    life20_181 = forestValue248_151_0;
    life21_188 = new moom.DT(life16_128, life20_181, life17_130);
    life22_194 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life21_188))))).a__ch())).a__fn();
    if (!((life6_22 != null))) {
        break forest_join_187;
    }
    if (!((life22_194 != moom.fn.a))) {
        break forest_join_173;
    }
    if (!((life22_194 == moom.fn.j))) {
        break forest_join_193;
    }
    }
    ((moom.F2)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life21_188)));
    ((moom.F2)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life21_188)).f())));
    ((moom.F2)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(life21_188)).d__DT())));
    }
    ((moom.F2)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(((moom.DT)(((moom.DT)(life21_188)).f())).d__DT())));
    }
    life19_138 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_123;
    }
    break forest_cycle_123;
    }
    }
    life19_138 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_44(26758, (91469213851249191L ^ life4_3));
    forest_cycle_202: while (true) {
    forest_join_363: {
    if (!((life19_138 <= 0))) {
        break forest_join_366;
    }
    spill248_11 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_45(8601, (7370008732853838652L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_368_0 = spill248_11;
        break forest_join_368;
    }
    life20_252 = spill248_11;
    forest_cycle_212: while (true) {
    forest_join_360: {
    forest_join_303: {
    forest_join_302: {
    forest_join_292: {
    forest_join_288: {
    if (!((life20_252 <= 0))) {
        break forest_join_363;
    }
    life21_258 = -1;
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + life19_138))), ((int)((life18_136 + life21_258))), ((int)((life17_130 + life20_252))));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((1 + life16_128) - life19_138))), ((int)((life18_136 + life21_258))), ((int)((life17_130 + life20_252))));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + life19_138))), ((int)((life18_136 + life21_258))), ((int)(((1 + life17_130) - life20_252))));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((1 + life16_128) - life19_138))), ((int)((life18_136 + life21_258))), ((int)(((1 + life17_130) - life20_252))));
    spill248_12 = life19_138;
    spill248_13 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_50(8601, (7370008732853838652L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_519_0 = spill248_12;
        forestValue248_519_1 = spill248_13;
        break forest_join_519;
    }
    if (!((life6_22 != null))) {
        forestValue248_292_0 = spill248_12;
        forestValue248_292_1 = spill248_13;
        break forest_join_292;
    }
    if (!((spill248_12 <= spill248_13))) {
        break forest_join_288;
    }
    spill248_14 = life20_252;
    spill248_15 = -1;
    if (!((life6_22 != null))) {
        forestValue248_292_0 = spill248_14;
        forestValue248_292_1 = spill248_15;
        break forest_join_292;
    }
    if (!((spill248_14 > spill248_15))) {
        break forest_join_360;
    }
    }
    spill248_16 = life19_138;
    if (!((life6_22 != null))) {
        forestValue248_303_0 = spill248_16;
        break forest_join_303;
    }
    forestValue248_292_0 = spill248_16;
    forestValue248_292_1 = -1;
    }
    if (!((forestValue248_292_0 == forestValue248_292_1))) {
        break forest_join_302;
    }
    spill248_17 = life20_252;
    if (!((life6_22 != null))) {
        forestValue248_303_0 = spill248_17;
        break forest_join_303;
    }
    if (!((spill248_17 != __sourceIntrinsic_e7ba66b54646_invokedynamic248_51(8601, (7370008732853838652L ^ life4_3))))) {
        break forest_join_360;
    }
    }
    forestValue248_303_0 = 1;
    }
    life21_364 = forestValue248_303_0;
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + life19_138))), ((int)((life18_136 + life21_364))), ((int)((life17_130 + life20_252))));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((1 + life16_128) - life19_138))), ((int)((life18_136 + life21_364))), ((int)((life17_130 + life20_252))));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + life19_138))), ((int)((life18_136 + life21_364))), ((int)(((1 + life17_130) - life20_252))));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((1 + life16_128) - life19_138))), ((int)((life18_136 + life21_364))), ((int)(((1 + life17_130) - life20_252))));
    }
    life20_252 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_212;
    }
    break forest_cycle_212;
    }
    }
    life19_138 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_202;
    }
    break forest_cycle_202;
    }
    }
    forestValue248_368_0 = ((((java.util.Random)(p1)).nextBoolean()) ? 1 : 0);
    }
    if (!((life6_22 != null))) {
        forestValue248_416_0 = forestValue248_368_0;
        break forest_join_416;
    }
    if (!((forestValue248_368_0 != 0))) {
        break forest_join_411;
    }
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(life16_128)), ((int)((life18_136 + 2))), ((int)(life17_130)));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + 1))), ((int)((life18_136 + 2))), ((int)(life17_130)));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + 1))), ((int)((life18_136 + 2))), ((int)((life17_130 + 1))));
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(life16_128)), ((int)((life18_136 + 2))), ((int)((life17_130 + 1))));
    }
    forestValue248_416_0 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_62(27813, (904299013014810118L ^ life4_3));
    }
    life19_486 = forestValue248_416_0;
    break forest_join_420;
    }
    forestValue248_419_0 = 0;
    }
    return ((forestValue248_419_0) != 0);
    }
    forest_cycle_420: while (true) {
    forest_join_515: {
    forestValue248_422_0 = life19_486;
    forestValue248_422_1 = 4;
    forest_cycle_422: while (true) {
    if (!((forestValue248_422_0 <= forestValue248_422_1))) {
        break forest_join_619;
    }
    spill248_18 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_64(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_620_0 = spill248_18;
        break forest_join_620;
    }
    life20_504 = spill248_18;
    forest_cycle_431: while (true) {
    forest_join_512: {
    forest_join_502: {
    forest_join_501: {
    forest_join_495: {
    forest_join_492: {
    forest_join_484: {
    forest_join_482: {
    forest_join_470: {
    forest_join_468: {
    forest_join_460: {
    forest_join_454: {
    if (!((life20_504 <= 4))) {
        break forest_join_515;
    }
    spill248_19 = life19_486;
    spill248_20 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_65(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_422_0 = spill248_19;
        forestValue248_422_1 = spill248_20;
        continue forest_cycle_422;
    }
    if (!((life6_22 != null))) {
        forestValue248_460_0 = spill248_19;
        forestValue248_460_1 = spill248_20;
        break forest_join_460;
    }
    if (!((spill248_19 == spill248_20))) {
        break forest_join_454;
    }
    spill248_21 = life20_504;
    spill248_22 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_66(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_460_0 = spill248_21;
        forestValue248_460_1 = spill248_22;
        break forest_join_460;
    }
    if (!((spill248_21 != spill248_22))) {
        break forest_join_512;
    }
    }
    forestValue248_460_0 = life19_486;
    forestValue248_460_1 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_67(24626, (3539467376648643216L ^ life4_3));
    }
    if (!((life6_22 != null))) {
        forestValue248_470_0 = forestValue248_460_0;
        forestValue248_470_1 = forestValue248_460_1;
        break forest_join_470;
    }
    if (!((forestValue248_460_0 == forestValue248_460_1))) {
        break forest_join_468;
    }
    spill248_23 = life20_504;
    spill248_24 = 4;
    if (!((life6_22 != null))) {
        forestValue248_470_0 = spill248_23;
        forestValue248_470_1 = spill248_24;
        break forest_join_470;
    }
    if (!((spill248_23 != spill248_24))) {
        break forest_join_512;
    }
    }
    forestValue248_470_0 = life19_486;
    forestValue248_470_1 = 4;
    }
    if (!((life6_22 != null))) {
        forestValue248_484_0 = forestValue248_470_0;
        forestValue248_484_1 = forestValue248_470_1;
        break forest_join_484;
    }
    if (!((forestValue248_470_0 == forestValue248_470_1))) {
        break forest_join_482;
    }
    spill248_25 = life20_504;
    spill248_26 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_68(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_484_0 = spill248_25;
        forestValue248_484_1 = spill248_26;
        break forest_join_484;
    }
    if (!((spill248_25 != spill248_26))) {
        break forest_join_512;
    }
    }
    forestValue248_484_0 = life19_486;
    forestValue248_484_1 = 4;
    }
    if (!((life6_22 != null))) {
        forestValue248_495_0 = forestValue248_484_0;
        forestValue248_495_1 = forestValue248_484_1;
        break forest_join_495;
    }
    if (!((forestValue248_484_0 == forestValue248_484_1))) {
        break forest_join_492;
    }
    spill248_27 = life20_504;
    spill248_28 = 4;
    if (!((life6_22 != null))) {
        forestValue248_495_0 = spill248_27;
        forestValue248_495_1 = spill248_28;
        break forest_join_495;
    }
    if (!((spill248_27 != spill248_28))) {
        break forest_join_512;
    }
    }
    forestValue248_495_0 = java.lang.Math.abs(((int)(life19_486)));
    forestValue248_495_1 = 3;
    }
    if (!((life6_22 != null))) {
        forestValue248_501_0 = forestValue248_495_0;
        forestValue248_501_1 = forestValue248_495_1;
        break forest_join_501;
    }
    if (!((forestValue248_495_0 >= forestValue248_495_1))) {
        break forest_join_502;
    }
    forestValue248_501_0 = java.lang.Math.abs(((int)(life20_504)));
    forestValue248_501_1 = 3;
    }
    if (!((forestValue248_501_0 < forestValue248_501_1))) {
        break forest_join_512;
    }
    }
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + life19_486))), ((int)(life18_136)), ((int)((life17_130 + life20_504))));
    }
    life20_504 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_431;
    }
    break forest_cycle_431;
    }
    break forest_cycle_422;
    }
    }
    life19_486 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_420;
    }
    break forest_cycle_420;
    }
    break forest_join_619;
    }
    forest_cycle_519: while (true) {
    forest_join_616: {
    forest_join_612: {
    if (!((forestValue248_519_0 <= forestValue248_519_1))) {
        break forest_join_619;
    }
    spill248_29 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_72(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_620_0 = spill248_29;
        break forest_join_620;
    }
    life20_645 = spill248_29;
    forest_cycle_528: while (true) {
    forest_join_609: {
    forest_join_599: {
    forest_join_598: {
    forest_join_592: {
    forest_join_589: {
    forest_join_581: {
    forest_join_579: {
    forest_join_567: {
    forest_join_565: {
    forest_join_557: {
    forest_join_551: {
    if (!((life20_645 <= 4))) {
        break forest_join_612;
    }
    spill248_30 = life19_138;
    spill248_31 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_73(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_519_0 = spill248_30;
        forestValue248_519_1 = spill248_31;
        continue forest_cycle_519;
    }
    if (!((life6_22 != null))) {
        forestValue248_557_0 = spill248_30;
        forestValue248_557_1 = spill248_31;
        break forest_join_557;
    }
    if (!((spill248_30 == spill248_31))) {
        break forest_join_551;
    }
    spill248_32 = life20_645;
    spill248_33 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_74(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_557_0 = spill248_32;
        forestValue248_557_1 = spill248_33;
        break forest_join_557;
    }
    if (!((spill248_32 != spill248_33))) {
        break forest_join_609;
    }
    }
    forestValue248_557_0 = life19_138;
    forestValue248_557_1 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_75(24626, (3539467376648643216L ^ life4_3));
    }
    if (!((life6_22 != null))) {
        forestValue248_567_0 = forestValue248_557_0;
        forestValue248_567_1 = forestValue248_557_1;
        break forest_join_567;
    }
    if (!((forestValue248_557_0 == forestValue248_557_1))) {
        break forest_join_565;
    }
    spill248_34 = life20_645;
    spill248_35 = 4;
    if (!((life6_22 != null))) {
        forestValue248_567_0 = spill248_34;
        forestValue248_567_1 = spill248_35;
        break forest_join_567;
    }
    if (!((spill248_34 != spill248_35))) {
        break forest_join_609;
    }
    }
    forestValue248_567_0 = life19_138;
    forestValue248_567_1 = 4;
    }
    if (!((life6_22 != null))) {
        forestValue248_581_0 = forestValue248_567_0;
        forestValue248_581_1 = forestValue248_567_1;
        break forest_join_581;
    }
    if (!((forestValue248_567_0 == forestValue248_567_1))) {
        break forest_join_579;
    }
    spill248_36 = life20_645;
    spill248_37 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_76(24626, (3539467376648643216L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_581_0 = spill248_36;
        forestValue248_581_1 = spill248_37;
        break forest_join_581;
    }
    if (!((spill248_36 != spill248_37))) {
        break forest_join_609;
    }
    }
    forestValue248_581_0 = life19_138;
    forestValue248_581_1 = 4;
    }
    if (!((life6_22 != null))) {
        forestValue248_592_0 = forestValue248_581_0;
        forestValue248_592_1 = forestValue248_581_1;
        break forest_join_592;
    }
    if (!((forestValue248_581_0 == forestValue248_581_1))) {
        break forest_join_589;
    }
    spill248_38 = life20_645;
    spill248_39 = 4;
    if (!((life6_22 != null))) {
        forestValue248_592_0 = spill248_38;
        forestValue248_592_1 = spill248_39;
        break forest_join_592;
    }
    if (!((spill248_38 != spill248_39))) {
        break forest_join_609;
    }
    }
    forestValue248_592_0 = java.lang.Math.abs(((int)(life19_138)));
    forestValue248_592_1 = 3;
    }
    if (!((life6_22 != null))) {
        forestValue248_598_0 = forestValue248_592_0;
        forestValue248_598_1 = forestValue248_592_1;
        break forest_join_598;
    }
    if (!((forestValue248_592_0 >= forestValue248_592_1))) {
        break forest_join_599;
    }
    forestValue248_598_0 = java.lang.Math.abs(((int)(life20_645)));
    forestValue248_598_1 = 3;
    }
    if (!((forestValue248_598_0 < forestValue248_598_1))) {
        break forest_join_609;
    }
    }
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)((life16_128 + life19_138))), ((int)(life18_136)), ((int)((life17_130 + life20_645))));
    }
    life20_645 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_528;
    }
    break forest_cycle_528;
    }
    }
    life19_138 += 1;
    if (!((life6_22 == null))) {
        break forest_join_616;
    }
    break forest_join_619;
    }
    spill248_40 = life19_138;
    spill248_41 = 4;
    forestValue248_519_0 = spill248_40;
    forestValue248_519_1 = spill248_41;
    continue forest_cycle_519;
    }
    }
    forestValue248_620_0 = -1;
    }
    life19_782 = forestValue248_620_0;
    forest_cycle_621: while (true) {
    forest_join_781: {
    forestValue248_622_0 = life19_782;
    forest_cycle_622: while (true) {
    if (!((forestValue248_622_0 <= 2))) {
        break forest_join_784;
    }
    spill248_42 = -1;
    if (!((life6_22 != null))) {
        forestValue248_785_0 = spill248_42;
        break forest_join_785;
    }
    life20_793 = spill248_42;
    forest_cycle_628: while (true) {
    forest_join_778: {
    forestValue248_629_0 = life20_793;
    forest_cycle_629: while (true) {
    forest_join_729: {
    forest_join_724: {
    forest_join_692: {
    forest_join_690: {
    forest_join_662: {
    forest_join_654: {
    forest_join_651: {
    if (!((forestValue248_629_0 <= 2))) {
        break forest_join_781;
    }
    spill248_43 = life19_782;
    if (!((life6_22 != null))) {
        forestValue248_622_0 = spill248_43;
        continue forest_cycle_622;
    }
    if (!((life6_22 != null))) {
        forestValue248_654_0 = spill248_43;
        break forest_join_654;
    }
    if (!((spill248_43 >= 0))) {
        break forest_join_651;
    }
    spill248_44 = life19_782;
    if (!((life6_22 != null))) {
        forestValue248_654_0 = spill248_44;
        break forest_join_654;
    }
    if (!((spill248_44 <= 1))) {
        break forest_join_651;
    }
    spill248_45 = life20_793;
    if (!((life6_22 != null))) {
        forestValue248_654_0 = spill248_45;
        break forest_join_654;
    }
    if (!((spill248_45 >= 0))) {
        break forest_join_651;
    }
    spill248_46 = life20_793;
    if (!((life6_22 != null))) {
        forestValue248_654_0 = spill248_46;
        break forest_join_654;
    }
    if (!((spill248_46 > 1))) {
        break forest_join_778;
    }
    }
    forestValue248_654_0 = ((java.util.Random)(p1)).nextInt(((int)(3)));
    }
    if (!((life6_22 != null))) {
        forestValue248_662_0 = forestValue248_654_0;
        break forest_join_662;
    }
    if (!((forestValue248_654_0 == 0))) {
        break forest_join_778;
    }
    forestValue248_662_0 = (((java.util.Random)(p1)).nextInt(((int)(3))) + 2);
    }
    life21_852 = forestValue248_662_0;
    life22_854 = 0;
    forest_cycle_665: while (true) {
    if (!((life22_854 < life21_852))) {
        break forest_join_690;
    }
    ((moom.F2)(this)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(new moom.DT((life8_21 + life19_782), ((life18_136 - life22_854) - 1), (life10_28 + life20_793)))));
    life22_854 += 1;
    if (!((life6_22 != null))) {
        break forest_join_692;
    }
    if (!((life6_22 == null))) {
        continue forest_cycle_665;
    }
    break forest_cycle_665;
    }
    }
    life22_854 = -1;
    }
    forest_cycle_692: while (true) {
    forest_join_722: {
    forest_join_721: {
    if (!((life22_854 <= 1))) {
        break forest_join_724;
    }
    spill248_47 = -1;
    if (!((life6_22 != null))) {
        forestValue248_729_0 = spill248_47;
        break forest_join_729;
    }
    life23_897 = spill248_47;
    forest_cycle_699: while (true) {
    if (!((life23_897 <= 1))) {
        break forest_join_721;
    }
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((life16_128 + life19_782) + life22_854))), ((int)(life18_136)), ((int)(((life17_130 + life20_793) + life23_897))));
    life23_897 += 1;
    if (!((life6_22 != null))) {
        break forest_join_722;
    }
    if (!((life6_22 == null))) {
        continue forest_cycle_699;
    }
    break forest_cycle_699;
    }
    }
    life22_854 += 1;
    }
    if (!((life6_22 == null))) {
        continue forest_cycle_692;
    }
    break forest_cycle_692;
    }
    }
    forestValue248_729_0 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_84(8601, (7370008732853838652L ^ life4_3));
    }
    life22_936 = forestValue248_729_0;
    forest_cycle_730: while (true) {
    forest_join_775: {
    forestValue248_732_0 = life22_936;
    forestValue248_732_1 = 2;
    forest_cycle_732: while (true) {
    if (!((forestValue248_732_0 <= forestValue248_732_1))) {
        break forest_join_778;
    }
    spill248_48 = __sourceIntrinsic_e7ba66b54646_invokedynamic248_85(8601, (7370008732853838652L ^ life4_3));
    if (!((life6_22 != null))) {
        forestValue248_629_0 = spill248_48;
        continue forest_cycle_629;
    }
    life23_951 = spill248_48;
    forest_cycle_741: while (true) {
    forest_join_772: {
    forest_join_756: {
    forest_join_755: {
    if (!((life23_951 <= 2))) {
        break forest_join_775;
    }
    spill248_49 = java.lang.Math.abs(((int)(life22_936)));
    spill248_50 = 2;
    if (!((life6_22 != null))) {
        forestValue248_732_0 = spill248_49;
        forestValue248_732_1 = spill248_50;
        continue forest_cycle_732;
    }
    if (!((life6_22 != null))) {
        forestValue248_755_0 = spill248_49;
        forestValue248_755_1 = spill248_50;
        break forest_join_755;
    }
    if (!((spill248_49 == spill248_50))) {
        break forest_join_756;
    }
    forestValue248_755_0 = java.lang.Math.abs(((int)(life23_951)));
    forestValue248_755_1 = 2;
    }
    if (!((forestValue248_755_0 != forestValue248_755_1))) {
        break forest_join_772;
    }
    }
    ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((int)(((life16_128 + life19_782) + life22_936))), ((int)((life18_136 - 1))), ((int)(((life17_130 + life20_793) + life23_951))));
    }
    life23_951 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_741;
    }
    break forest_cycle_741;
    }
    break forest_cycle_732;
    }
    }
    life22_936 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_730;
    }
    break forest_cycle_730;
    }
    break forest_cycle_629;
    }
    }
    life20_793 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_628;
    }
    break forest_cycle_628;
    }
    break forest_cycle_622;
    }
    }
    life19_782 += 1;
    if (!((life6_22 == null))) {
        continue forest_cycle_621;
    }
    break forest_cycle_621;
    }
    }
    forestValue248_785_0 = 1;
    }
    return ((forestValue248_785_0) != 0);
}


private void a(net.minecraft.world.World p0, int p1, int p2, int p3) {
long local5 = (moom.F2.e ^ 60723987985091L);
    moom.DT local7 = new moom.DT(p1, p2, p3);
    net.minecraft.block.Block local8 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(local7))))).a__ch();
    if ((((net.minecraft.block.Block)(local8)).a__fn() == moom.fn.a)) {
        ((moom.F2)(this)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(local7)), ((net.minecraft.block.state.IBlockState)(moom.F2.d)));
    }
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4424_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic248_85(int a0, long a1) throws E;
}
