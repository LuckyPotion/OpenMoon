package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Gj extends moom.FY {

private static final org.apache.logging.log4j.Logger c;

private static final java.lang.String[] d;

private static final java.util.List<moom.D5> e;

private static final long f;

private static final long[] g;

private static final java.lang.Integer[] h;

private static final java.util.Map i;

public Gj() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(2390143512648701881L)), ((long)(-8905405420268294132L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(142935794746666L)))));
    long local11_life6 = (moom.Gj.f ^ 16177419821985L);
    i = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill790_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill790_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill790_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill790_14 = new byte[8];
    (__sourceSpill790_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill790_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation790_16 = __sourceSpill790_14;
    ((javax.crypto.Cipher)(__sourceSpill790_11)).init(((int)(__sourceSpill790_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill790_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation790_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[12];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "HÏðV3\003¡gW}òÀ=ë\016\004Äúj\002ùæÎÄÔÑñ\002iB¢\017²Ü\013Õ`g\022lË6º~Uÿ|·<\\\024¬\016»¯à¿E3ÄÒÑ¼(Ä#ý\034U"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill790_25 = local4_life21;
        int __sourceSpill790_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill790_25)).substring(((int)(__sourceSpill790_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill790_30 = local6_life19;
        int __sourceSpill790_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill790_33 = new byte[8];
        (__sourceSpill790_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill790_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill790_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill790_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill790_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill790_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill790_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill790_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill790_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill790_34)).doFinal(((byte[])(__sourceSpill790_33)));
        (__sourceSpill790_30)[__sourceSpill790_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "\\·<6ÖÊ!«\035ö|Ux"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill790_38 = local4_life21;
        int __sourceSpill790_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill790_38)).substring(((int)(__sourceSpill790_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill790_43 = local6_life19;
        int __sourceSpill790_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill790_46 = new byte[8];
        (__sourceSpill790_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill790_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill790_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill790_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill790_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill790_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill790_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill790_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill790_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill790_47)).doFinal(((byte[])(__sourceSpill790_46)));
        (__sourceSpill790_43)[__sourceSpill790_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    g = ((long[])(local6_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[12]));
    c = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    java.lang.String[] __sourceSpill790_54 = new java.lang.String[4];
    (__sourceSpill790_54)[0] = "Skeleton";
    (__sourceSpill790_54)[1] = "Zombie";
    (__sourceSpill790_54)[2] = "Zombie";
    (__sourceSpill790_54)[3] = "Spider";
    d = ((java.lang.String[])(__sourceSpill790_54));
    moom.D5[] __sourceSpill790_59 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_56(4916, (5990062186814022350L ^ local11_life6))];
    (__sourceSpill790_59)[0] = new moom.D5(net.minecraft.init.Items.aA, 0, 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_58(19244, (8550578234901265107L ^ local11_life6)));
    (__sourceSpill790_59)[1] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_61(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[2] = new moom.D5(net.minecraft.init.Items.P, 0, 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_63(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[3] = new moom.D5(net.minecraft.init.Items.O, 0, 1, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_65(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[4] = new moom.D5(net.minecraft.init.Items.H, 0, 1, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_67(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[5] = new moom.D5(net.minecraft.init.Items.F, 0, 1, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_69(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_70(14296, (7720749856493602344L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aw, 0, 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_72(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_73(13751, (1056357142099297353L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.ao, 0, 1, 1, 1);
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_75(8103, (4369093010422672982L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aC, 0, 1, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_77(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_78(31493, (6011013561380457206L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b5, 0, 1, 1, 4);
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_80(8376, (140001887414391108L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b6, 0, 1, 1, 4);
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_82(16791, (8183801768869818474L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b3, 0, 1, 1, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_84(8376, (140001887414391108L ^ local11_life6)));
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_85(18955, (253351738850671603L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b0, 0, 1, 1, 2);
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_87(19448, (2410337756102851082L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bZ, 0, 1, 1, 5);
    (__sourceSpill790_59)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_89(6284, (6276942833208076661L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b1, 0, 1, 1, 1);
    e = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill790_59)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 11895;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Gj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Gj.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4682_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Gj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private java.lang.String a(java.util.Random p0) {
return (moom.Gj.d)[((java.util.Random)(p0)).nextInt(((int)((moom.Gj.d).length)))];
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.DT p2) {
int forestValue659_47_0;
    int forestValue659_55_0;
    int forestValue659_55_1;
    int forestValue659_91_0;
    int forestValue659_92_0;
    int forestValue659_92_1;
    int forestValue659_101_0;
    int forestValue659_104_0;
    int forestValue659_104_1;
    int forestValue659_121_0;
    int forestValue659_127_0;
    int forestValue659_134_0;
    int forestValue659_151_0;
    int forestValue659_163_0;
    int forestValue659_171_0;
    int forestValue659_171_1;
    net.minecraft.world.World forestValue659_227_0;
    moom.DT forestValue659_227_1;
    int forestValue659_233_0;
    int forestValue659_260_0;
    net.minecraft.block.Block forestValue659_265_0;
    int forestValue659_293_0;
    int forestValue659_304_0;
    int forestValue659_306_0;
    int forestValue659_386_0;
    int forestValue659_400_0;
    int forestValue659_445_0;
    net.minecraft.tileentity.TileEntity forestValue659_456_0;
    int forestValue659_476_0;
    int[] spill659_0;
    int spill659_1;
    int spill659_2;
    int spill659_3;
    int spill659_4;
    int spill659_5;
    int spill659_6;
    int spill659_7;
    int spill659_8;
    int spill659_9;
    int spill659_10;
    int spill659_11;
    int spill659_12;
    int spill659_13;
    int spill659_14;
    int spill659_15;
    int spill659_16;
    int spill659_17;
    int spill659_18;
    int spill659_19;
    net.minecraft.world.World spill659_20;
    moom.DT spill659_21;
    boolean spill659_22;
    net.minecraft.block.Block spill659_23;
    int spill659_24;
    int spill659_25;
    int spill659_26;
    boolean spill659_27;
    boolean spill659_28;
    java.util.List spill659_29;
    moom.D5[] spill659_30;
    net.minecraft.tileentity.TileEntity spill659_31;
    long life4_3;
    int life7_5;
    int life8_11;
    int life9_17;
    int life10_21;
    int life11_23;
    int life12_25;
    int life13_31;
    int life14_36;
    int life15_40;
    int[] life6_41;
    int life16_43;
    int life17_45;
    int life18_52;
    int life19_59;
    moom.DT life20_68;
    moom.fn life21_74;
    int life22_77;
    int life17_182;
    int life18_189;
    int life19_196;
    moom.DT life20_205;
    int life17_353;
    int life18_360;
    int life19_376;
    int life20_379;
    int life21_392;
    moom.DT life22_399;
    int life23_410;
    java.util.Iterator life24_413;
    moom.bs life25_420;
    java.util.List life24_464;
    net.minecraft.tileentity.TileEntity life25_468;
    net.minecraft.tileentity.TileEntity life17_505;
    forest_join_476: {
    forest_join_475: {
    forest_join_473: {
    forest_join_464: {
    forest_join_456: {
    forest_join_445: {
    forest_join_439: {
    forest_join_304: {
    forest_join_303: {
    forest_join_151: {
    forest_join_150: {
    forest_join_148: {
    forest_join_146: {
    life4_3 = (moom.Gj.f ^ 97501172906322L);
    life7_5 = 3;
    life8_11 = (((java.util.Random)(p1)).nextInt(((int)(2))) + 2);
    spill659_0 = moom.FY.b();
    life9_17 = ((-life8_11) - 1);
    life10_21 = (life8_11 + 1);
    life11_23 = -1;
    life12_25 = 4;
    life13_31 = (((java.util.Random)(p1)).nextInt(((int)(2))) + 2);
    life14_36 = ((-life13_31) - 1);
    life15_40 = (life13_31 + 1);
    life6_41 = spill659_0;
    life16_43 = 0;
    life17_45 = life9_17;
    forest_cycle_46: while (true) {
    forest_join_142: {
    forestValue659_47_0 = life17_45;
    forest_cycle_47: while (true) {
    if (!((forestValue659_47_0 <= life10_21))) {
        break forest_join_150;
    }
    spill659_1 = -1;
    if (!((life6_41 != null))) {
        forestValue659_151_0 = spill659_1;
        break forest_join_151;
    }
    life18_52 = spill659_1;
    forest_cycle_53: while (true) {
    forest_join_139: {
    forestValue659_55_0 = life18_52;
    forestValue659_55_1 = 4;
    forest_cycle_55: while (true) {
    if (!((forestValue659_55_0 <= forestValue659_55_1))) {
        break forest_join_142;
    }
    spill659_2 = life14_36;
    if (!((life6_41 != null))) {
        forestValue659_47_0 = spill659_2;
        continue forest_cycle_47;
    }
    life19_59 = spill659_2;
    forest_cycle_60: while (true) {
    forest_join_136: {
    forest_join_134: {
    forest_join_127: {
    forest_join_121: {
    forest_join_120: {
    forest_join_104: {
    forest_join_101: {
    forest_join_100: {
    forest_join_92: {
    forest_join_91: {
    forest_join_90: {
    if (!((life19_59 <= life15_40))) {
        break forest_join_139;
    }
    life20_68 = ((moom.DT)(p2)).a(((int)(life17_45)), ((int)(life18_52)), ((int)(life19_59)));
    life21_74 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life20_68))))).a__ch())).a__fn();
    life22_77 = ((((moom.fn)(life21_74)).b__Boolean()) ? 1 : 0);
    spill659_3 = life18_52;
    spill659_4 = -1;
    if (!((life6_41 != null))) {
        forestValue659_55_0 = spill659_3;
        forestValue659_55_1 = spill659_4;
        continue forest_cycle_55;
    }
    if (!((life6_41 != null))) {
        forestValue659_92_0 = spill659_3;
        forestValue659_92_1 = spill659_4;
        break forest_join_92;
    }
    if (!((spill659_3 == spill659_4))) {
        break forest_join_90;
    }
    spill659_5 = life22_77;
    if (!((life6_41 != null))) {
        forestValue659_91_0 = spill659_5;
        break forest_join_91;
    }
    if (!((spill659_5 == 0))) {
        break forest_join_90;
    }
    break forest_join_146;
    }
    forestValue659_91_0 = life18_52;
    }
    forestValue659_92_0 = forestValue659_91_0;
    forestValue659_92_1 = 4;
    }
    if (!((life6_41 != null))) {
        forestValue659_104_0 = forestValue659_92_0;
        forestValue659_104_1 = forestValue659_92_1;
        break forest_join_104;
    }
    if (!((forestValue659_92_0 == forestValue659_92_1))) {
        break forest_join_100;
    }
    spill659_6 = life22_77;
    if (!((life6_41 != null))) {
        forestValue659_101_0 = spill659_6;
        break forest_join_101;
    }
    if (!((spill659_6 == 0))) {
        break forest_join_100;
    }
    break forest_join_148;
    }
    forestValue659_101_0 = life17_45;
    }
    if (!((life6_41 != null))) {
        forestValue659_121_0 = forestValue659_101_0;
        break forest_join_121;
    }
    forestValue659_104_0 = forestValue659_101_0;
    forestValue659_104_1 = life9_17;
    }
    if (!((forestValue659_104_0 != forestValue659_104_1))) {
        break forest_join_120;
    }
    spill659_7 = life17_45;
    if (!((life6_41 != null))) {
        forestValue659_121_0 = spill659_7;
        break forest_join_121;
    }
    if (!((spill659_7 != life10_21))) {
        break forest_join_120;
    }
    spill659_8 = life19_59;
    if (!((life6_41 != null))) {
        forestValue659_121_0 = spill659_8;
        break forest_join_121;
    }
    if (!((spill659_8 != life14_36))) {
        break forest_join_120;
    }
    spill659_9 = life19_59;
    if (!((life6_41 != null))) {
        forestValue659_121_0 = spill659_9;
        break forest_join_121;
    }
    if (!((spill659_9 == life15_40))) {
        break forest_join_136;
    }
    }
    forestValue659_121_0 = life18_52;
    }
    if (!((life6_41 != null))) {
        forestValue659_127_0 = forestValue659_121_0;
        break forest_join_127;
    }
    if (!((forestValue659_121_0 == 0))) {
        break forest_join_136;
    }
    forestValue659_127_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life20_68)))) ? 1 : 0);
    }
    if (!((life6_41 != null))) {
        forestValue659_134_0 = forestValue659_127_0;
        break forest_join_134;
    }
    if (!((forestValue659_127_0 != 0))) {
        break forest_join_136;
    }
    forestValue659_134_0 = ((((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(((moom.DT)(life20_68)).a__DT())))) ? 1 : 0);
    }
    if (!((forestValue659_134_0 != 0))) {
        break forest_join_136;
    }
    life16_43 += 1;
    }
    life19_59 += 1;
    if (!((life6_41 == null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    break forest_cycle_55;
    }
    }
    life18_52 += 1;
    if (!((life6_41 == null))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    break forest_cycle_47;
    }
    }
    life17_45 += 1;
    if (!((life6_41 == null))) {
        continue forest_cycle_46;
    }
    break forest_cycle_46;
    }
    break forest_join_150;
    }
    return ((0) != 0);
    }
    return ((0) != 0);
    }
    forestValue659_151_0 = life16_43;
    }
    if (!((life6_41 != null))) {
        forestValue659_476_0 = forestValue659_151_0;
        break forest_join_476;
    }
    if (!((forestValue659_151_0 >= 1))) {
        break forest_join_475;
    }
    spill659_10 = life16_43;
    if (!((life6_41 != null))) {
        forestValue659_476_0 = spill659_10;
        break forest_join_476;
    }
    if (!((spill659_10 <= 5))) {
        break forest_join_475;
    }
    life17_182 = life9_17;
    forest_cycle_162: while (true) {
    forest_join_300: {
    forestValue659_163_0 = life17_182;
    forest_cycle_163: while (true) {
    if (!((forestValue659_163_0 <= life10_21))) {
        break forest_join_303;
    }
    spill659_11 = 3;
    if (!((life6_41 != null))) {
        forestValue659_304_0 = spill659_11;
        break forest_join_304;
    }
    life18_189 = spill659_11;
    forest_cycle_169: while (true) {
    forest_join_297: {
    forestValue659_171_0 = life18_189;
    forestValue659_171_1 = -1;
    forest_cycle_171: while (true) {
    if (!((forestValue659_171_0 >= forestValue659_171_1))) {
        break forest_join_300;
    }
    spill659_12 = life14_36;
    if (!((life6_41 != null))) {
        forestValue659_163_0 = spill659_12;
        continue forest_cycle_163;
    }
    life19_196 = spill659_12;
    forest_cycle_176: while (true) {
    forest_join_294: {
    forest_join_293: {
    forest_join_287: {
    forest_join_265: {
    forest_join_260: {
    forest_join_252: {
    forest_join_233: {
    forest_join_231: {
    forest_join_227: {
    if (!((life19_196 <= life15_40))) {
        break forest_join_297;
    }
    life20_205 = ((moom.DT)(p2)).a(((int)(life17_182)), ((int)(life18_189)), ((int)(life19_196)));
    spill659_13 = life17_182;
    if (!((life6_41 != null))) {
        forestValue659_233_0 = spill659_13;
        break forest_join_233;
    }
    spill659_14 = life9_17;
    if (!((life6_41 != null))) {
        forestValue659_171_0 = spill659_13;
        forestValue659_171_1 = spill659_14;
        continue forest_cycle_171;
    }
    if (!((spill659_13 != spill659_14))) {
        break forest_join_231;
    }
    spill659_15 = life18_189;
    if (!((life6_41 != null))) {
        forestValue659_233_0 = spill659_15;
        break forest_join_233;
    }
    if (!((spill659_15 != -1))) {
        break forest_join_231;
    }
    spill659_16 = life19_196;
    if (!((life6_41 != null))) {
        forestValue659_233_0 = spill659_16;
        break forest_join_233;
    }
    if (!((spill659_16 != life14_36))) {
        break forest_join_231;
    }
    spill659_17 = life17_182;
    if (!((life6_41 != null))) {
        forestValue659_233_0 = spill659_17;
        break forest_join_233;
    }
    if (!((spill659_17 != life10_21))) {
        break forest_join_231;
    }
    spill659_18 = life18_189;
    if (!((life6_41 != null))) {
        forestValue659_233_0 = spill659_18;
        break forest_join_233;
    }
    if (!((spill659_18 != 4))) {
        break forest_join_231;
    }
    spill659_19 = life19_196;
    if (!((life6_41 != null))) {
        forestValue659_233_0 = spill659_19;
        break forest_join_233;
    }
    if (!((spill659_19 != life15_40))) {
        break forest_join_231;
    }
    spill659_20 = p0;
    spill659_21 = life20_205;
    if (!((life6_41 != null))) {
        forestValue659_227_0 = spill659_20;
        forestValue659_227_1 = spill659_21;
        break forest_join_227;
    }
    if (!((((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(spill659_20)).a__fE(((moom.DT)(spill659_21))))).a__ch() != net.minecraft.init.Blocks.ae))) {
        break forest_join_294;
    }
    forestValue659_227_0 = p0;
    forestValue659_227_1 = life20_205;
    }
    ((net.minecraft.world.World)(forestValue659_227_0)).d__Boolean(((moom.DT)(forestValue659_227_1)));
    if (!((life6_41 == null))) {
        break forest_join_294;
    }
    }
    forestValue659_233_0 = ((moom.DT)(life20_205)).b();
    }
    if (!((life6_41 != null))) {
        forestValue659_260_0 = forestValue659_233_0;
        break forest_join_260;
    }
    if (!((forestValue659_233_0 >= 0))) {
        break forest_join_252;
    }
    spill659_22 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life20_205)).b__DT()))))).a__ch())).a__fn())).b__Boolean();
    if (!((life6_41 != null))) {
        forestValue659_260_0 = ((spill659_22) ? 1 : 0);
        break forest_join_260;
    }
    if (!((!spill659_22))) {
        break forest_join_252;
    }
    ((net.minecraft.world.World)(p0)).d__Boolean(((moom.DT)(life20_205)));
    if (!((life6_41 == null))) {
        break forest_join_294;
    }
    }
    spill659_23 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life20_205))))).a__ch();
    if (!((life6_41 != null))) {
        forestValue659_265_0 = spill659_23;
        break forest_join_265;
    }
    forestValue659_260_0 = ((((moom.fn)(((net.minecraft.block.Block)(spill659_23)).a__fn())).b__Boolean()) ? 1 : 0);
    }
    if (!((forestValue659_260_0 != 0))) {
        break forest_join_294;
    }
    forestValue659_265_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(life20_205))))).a__ch();
    }
    if (!((forestValue659_265_0 != net.minecraft.init.Blocks.ae))) {
        break forest_join_294;
    }
    spill659_24 = life18_189;
    if (!((life6_41 != null))) {
        forestValue659_293_0 = spill659_24;
        break forest_join_293;
    }
    if (!((spill659_24 == -1))) {
        break forest_join_287;
    }
    spill659_25 = ((java.util.Random)(p1)).nextInt(((int)(4)));
    if (!((life6_41 != null))) {
        forestValue659_293_0 = spill659_25;
        break forest_join_293;
    }
    if (!((spill659_25 != 0))) {
        break forest_join_287;
    }
    ((net.minecraft.world.World)(p0)).a(((moom.DT)(life20_205)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.Y)).a__fE())), ((int)(2)));
    if (!((life6_41 == null))) {
        break forest_join_294;
    }
    }
    forestValue659_293_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life20_205)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.e)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue659_293_0);
    }
    life19_196 += 1;
    if (!((life6_41 == null))) {
        continue forest_cycle_176;
    }
    break forest_cycle_176;
    }
    break forest_cycle_171;
    }
    }
    life18_189 += -1;
    if (!((life6_41 == null))) {
        continue forest_cycle_169;
    }
    break forest_cycle_169;
    }
    break forest_cycle_163;
    }
    }
    life17_182 += 1;
    if (!((life6_41 == null))) {
        continue forest_cycle_162;
    }
    break forest_cycle_162;
    }
    }
    forestValue659_304_0 = 0;
    }
    life17_353 = forestValue659_304_0;
    forest_cycle_305: while (true) {
    forest_join_437: {
    forest_join_436: {
    forestValue659_306_0 = life17_353;
    forest_cycle_306: while (true) {
    if (!((forestValue659_306_0 < 2))) {
        break forest_join_439;
    }
    spill659_26 = 0;
    if (!((life6_41 != null))) {
        forestValue659_445_0 = spill659_26;
        break forest_join_445;
    }
    life18_360 = spill659_26;
    forest_cycle_312: while (true) {
    forest_join_434: {
    forest_join_433: {
    forest_join_400: {
    forest_join_386: {
    forest_join_385: {
    if (!((life18_360 < 3))) {
        break forest_join_436;
    }
    life19_376 = ((((moom.DT)(p2)).a() + ((java.util.Random)(p1)).nextInt(((int)(((life8_11 * 2) + 1))))) - life8_11);
    life20_379 = ((moom.DT)(p2)).b();
    life21_392 = ((((moom.DT)(p2)).c() + ((java.util.Random)(p1)).nextInt(((int)(((life13_31 * 2) + 1))))) - life13_31);
    life22_399 = new moom.DT(life19_376, life20_379, life21_392);
    if (!((life6_41 != null))) {
        break forest_join_434;
    }
    spill659_27 = ((net.minecraft.world.World)(p0)).a__Boolean(((moom.DT)(life22_399)));
    if (!((life6_41 != null))) {
        forestValue659_306_0 = ((spill659_27) ? 1 : 0);
        continue forest_cycle_306;
    }
    if (!(spill659_27)) {
        break forest_join_433;
    }
    life23_410 = 0;
    life24_413 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_364: while (true) {
    forest_join_383: {
    if (!(((java.util.Iterator)(life24_413)).hasNext())) {
        break forest_join_385;
    }
    life25_420 = ((moom.bs)(((java.util.Iterator)(life24_413)).next()));
    spill659_28 = ((moom.fn)(((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(((net.minecraft.world.World)(p0)).a__fE(((moom.DT)(((moom.DT)(life22_399)).a(((moom.bs)(life25_420)))))))).a__ch())).a__fn())).b__Boolean();
    if (!((life6_41 != null))) {
        forestValue659_386_0 = ((spill659_28) ? 1 : 0);
        break forest_join_386;
    }
    if (!(spill659_28)) {
        break forest_join_383;
    }
    life23_410 += 1;
    }
    if (!((life6_41 == null))) {
        continue forest_cycle_364;
    }
    break forest_cycle_364;
    }
    }
    forestValue659_386_0 = life23_410;
    }
    if (!((life6_41 != null))) {
        forestValue659_400_0 = forestValue659_386_0;
        break forest_join_400;
    }
    if (!((forestValue659_386_0 == 1))) {
        break forest_join_433;
    }
    forestValue659_400_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(life22_399)), ((net.minecraft.block.state.IBlockState)(((moom.cZ)(net.minecraft.init.Blocks.ae)).b(((net.minecraft.world.World)(p0)), ((moom.DT)(life22_399)), ((net.minecraft.block.state.IBlockState)(((moom.cZ)(net.minecraft.init.Blocks.ae)).a__fE()))))), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue659_400_0);
    spill659_29 = moom.Gj.e;
    moom.D5[] __stackOp659_73_0 = new moom.D5[1];
    spill659_30 = __stackOp659_73_0;
    (__stackOp659_73_0)[0] = ((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)));
    life24_464 = moom.D5.a(((java.util.List)(spill659_29)), ((moom.D5[])(spill659_30)));
    life25_468 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(life22_399)));
    if (!((life6_41 != null))) {
        break forest_join_437;
    }
    if (!((((life25_468 instanceof net.minecraft.tileentity.TileEntityChest) ? 1 : 0) != 0))) {
        break forest_join_436;
    }
    moom.D5.a(((java.util.Random)(p1)), ((java.util.List)(life24_464)), ((net.minecraft.inventory.IInventory)(((net.minecraft.tileentity.TileEntityChest)(life25_468)))), ((int)(__sourceIntrinsic_e7ba66b54646_invokedynamic659_80(16538, (6904740235756891026L ^ life4_3)))));
    if (!((life6_41 == null))) {
        break forest_join_436;
    }
    }
    life18_360 += 1;
    }
    if (!((life6_41 == null))) {
        continue forest_cycle_312;
    }
    break forest_cycle_312;
    }
    break forest_cycle_306;
    }
    }
    life17_353 += 1;
    }
    if (!((life6_41 == null))) {
        continue forest_cycle_305;
    }
    break forest_cycle_305;
    }
    }
    forestValue659_445_0 = ((((net.minecraft.world.World)(p0)).a(((moom.DT)(p2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.ac)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue659_445_0);
    life17_505 = ((net.minecraft.world.World)(p0)).a__B9(((moom.DT)(p2)));
    spill659_31 = life17_505;
    if (!((life6_41 != null))) {
        forestValue659_456_0 = spill659_31;
        break forest_join_456;
    }
    if (!((((spill659_31 instanceof moom.Cq) ? 1 : 0) != 0))) {
        break forest_join_464;
    }
    forestValue659_456_0 = life17_505;
    }
    ((net.minecraft.tileentity.MobSpawnerBaseLogic)(((moom.Cq)(((moom.Cq)(forestValue659_456_0)))).a__sourceReturn_30e49adebc())).a(((java.lang.String)(((moom.Gj)(this)).a(((java.util.Random)(p1))))));
    if (!((life6_41 == null))) {
        break forest_join_473;
    }
    }
    ((org.apache.logging.log4j.Logger)(moom.Gj.c)).error(((java.lang.String)(__sourceIntrinsic_e7ba66b54646_invokedynamic659_97(((moom.DT)(p2)).a(), ((moom.DT)(p2)).b(), ((moom.DT)(p2)).c()))));
    }
    return ((1) != 0);
    }
    forestValue659_476_0 = 0;
    }
    return ((forestValue659_476_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_87(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite790_89(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4682_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e7ba66b54646_invokedynamic659_80(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e7ba66b54646_invokedynamic659_97(int a0, int a1, int a2) throws E;
}
