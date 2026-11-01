package net.minecraft.world.gen.structure;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ComponentScatteredFeaturePieces$DesertPyramid extends net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$Feature {

private boolean[] i;

private static java.util.List<moom.D5> j;

private static long k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public ComponentScatteredFeaturePieces$DesertPyramid() {
super();
    this.i = new boolean[4];
}


public ComponentScatteredFeaturePieces$DesertPyramid(java.util.Random p0, int p1, int p2) { super((java.util.Random)null, 0, 0, 0, 0, 0, 0); }

private static void __sourceConstructorBody_d3006644c140de9b(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid receiver, java.util.Random p0, int p1, int p2) throws Throwable {
long local4 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid.k ^ 27436905709099L);
    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid.__sourceConstructorInit_d3006644c140de9b_0(((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(receiver)), ((java.util.Random)(p0)), ((int)(p1)), ((int)(__sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_1(8135, (7654078304264126564L ^ local4)))), ((int)(p2)), ((int)(__sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_2(25921, (2026689520592190185L ^ local4)))), ((int)(__sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_3(20434, (5004340051743559778L ^ local4)))), ((int)(__sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_4(9411, (8545605760410073959L ^ local4)))));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(receiver)).i = ((boolean[])(new boolean[4]));
    return;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(4048837589564633374L)), ((long)(-1109979493236469235L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(250628799082765L)))));
    long local11_life6 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid.k ^ 58059070433315L);
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1951_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1951_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1951_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1951_14 = new byte[8];
    (__sourceSpill1951_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1951_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1951_16 = __sourceSpill1951_14;
    ((javax.crypto.Cipher)(__sourceSpill1951_11)).init(((int)(__sourceSpill1951_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1951_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1951_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[39];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "hiªû]Ós¢ýO\nÈ±GTñEÂ¢ß\031Uñâ[ûQ\021uÍb-+<¡Þ1èd\031¨}(ãWªø¥P)¾6°èV×'Ì´¦\013fÉ.ß3ðÖÿ*ünN~,p\\Ìé\026¯fÑ¥\022\006\023\030gLÿTZVñæ]GJøÀ=o5£Z\b.Ës@½7¥ýá\005ã»±\tdO¢uD\027SØ1X_L\007\0365mtÌK\036·\036s*\005r+¨k\025gvöôÚé\bÈ8J;|¤ùYoõ\016é.\001ä}\"a\036\"ÅtçEu KNµ\022²¶Äê.Ë¬ö×,]-]~UT=°kXxÃ]«a\nkOÆ\007V#'he[ÔÛÀ$»¯×¼éËô\026äCÐÚ\rW.TÖ«è%7;±ZEp"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1951_25 = local4_life21;
        int __sourceSpill1951_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1951_25)).substring(((int)(__sourceSpill1951_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1951_30 = local6_life19;
        int __sourceSpill1951_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1951_33 = new byte[8];
        (__sourceSpill1951_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1951_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1951_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1951_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1951_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1951_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1951_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1951_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1951_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1951_34)).doFinal(((byte[])(__sourceSpill1951_33)));
        (__sourceSpill1951_30)[__sourceSpill1951_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¬¡®4\007ý±>\005£ÐXÐj¤"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1951_38 = local4_life21;
        int __sourceSpill1951_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1951_38)).substring(((int)(__sourceSpill1951_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1951_43 = local6_life19;
        int __sourceSpill1951_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1951_46 = new byte[8];
        (__sourceSpill1951_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1951_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1951_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1951_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1951_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1951_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1951_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1951_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1951_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1951_47)).doFinal(((byte[])(__sourceSpill1951_46)));
        (__sourceSpill1951_43)[__sourceSpill1951_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    l = ((long[])(local6_life19));
    m = ((java.lang.Integer[])(new java.lang.Integer[39]));
    moom.D5[] __sourceSpill1951_54 = new moom.D5[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_52(9892, (8292248845196488481L ^ local11_life6))];
    (__sourceSpill1951_54)[0] = new moom.D5(net.minecraft.init.Items.i, 0, 1, 3, 3);
    (__sourceSpill1951_54)[1] = new moom.D5(net.minecraft.init.Items.j, 0, 1, 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_56(30106, (9098058717633690663L ^ local11_life6)));
    (__sourceSpill1951_54)[2] = new moom.D5(net.minecraft.init.Items.k, 0, 2, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_58(17257, (7708659909608508126L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_59(1811, (4464056104954941072L ^ local11_life6)));
    (__sourceSpill1951_54)[3] = new moom.D5(net.minecraft.init.Items.bD, 0, 1, 3, 2);
    (__sourceSpill1951_54)[4] = new moom.D5(net.minecraft.init.Items.aX, 0, 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_62(18227, (6525183388299890355L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_63(21084, (2542881900287499257L ^ local11_life6)));
    (__sourceSpill1951_54)[5] = new moom.D5(net.minecraft.init.Items.bi, 0, 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_65(19251, (2247594321887625885L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_66(5532, (5185059514079730746L ^ local11_life6)));
    (__sourceSpill1951_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_67(13213, (7904187791575153214L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.aA, 0, 1, 1, 3);
    (__sourceSpill1951_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_69(19251, (2247594321887625885L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.bZ, 0, 1, 1, 1);
    (__sourceSpill1951_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_71(221, (1511274340709288282L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b0, 0, 1, 1, 1);
    (__sourceSpill1951_54)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_73(17016, (6748912302745586640L ^ local11_life6))] = new moom.D5(net.minecraft.init.Items.b1, 0, 1, 1, 1);
    j = ((java.util.List)(com.google.common.collect.Lists.newArrayList(((java.lang.Object[])(__sourceSpill1951_54)))));
}

private static native <E extends Throwable> void __sourceConstructorInit_d3006644c140de9b_0(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid a0, java.util.Random a1, int a2, int a3, int a4, int a5, int a6, int a7) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


protected void b(net.minecraft.nbt.NBTTagCompound p0) {
super.b(((net.minecraft.nbt.NBTTagCompound)(p0)));
    (this.i)[0] = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("hasPlacedChest0")));
    (this.i)[1] = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("hasPlacedChest1")));
    (this.i)[2] = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("hasPlacedChest2")));
    (this.i)[3] = ((net.minecraft.nbt.NBTTagCompound)(p0)).b__Boolean(((java.lang.String)("hasPlacedChest3")));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 13457;
      if (m[var3] == null) {
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
         long var5 = l[var3];
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
         Object[] var9 = (Object[])n.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               n.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/G6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         m[var3] = var15;
      }

      return m[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12706_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/G6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(net.minecraft.nbt.NBTTagCompound p0) {
super.a(((net.minecraft.nbt.NBTTagCompound)(p0)));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("hasPlacedChest0")), ((boolean)((this.i)[0])));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("hasPlacedChest1")), ((boolean)((this.i)[1])));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("hasPlacedChest2")), ((boolean)((this.i)[2])));
    ((net.minecraft.nbt.NBTTagCompound)(p0)).a(((java.lang.String)("hasPlacedChest3")), ((boolean)((this.i)[3])));
    return;
}


public boolean a__Boolean(net.minecraft.world.World p0, java.util.Random p1, moom.G2 p2) {
int forestValue1178_148_0;
    int forestValue1178_3069_0;
    int forestValue1178_3122_0;
    net.minecraft.entity.Entity[] spill1178_0;
    int spill1178_1;
    boolean spill1178_2;
    boolean[] spill1178_3;
    int spill1178_4;
    net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid spill1178_5;
    net.minecraft.world.World spill1178_6;
    moom.G2 spill1178_7;
    java.util.Random spill1178_8;
    int spill1178_9;
    int spill1178_10;
    int spill1178_11;
    java.util.List spill1178_12;
    moom.D5[] spill1178_13;
    long life4_3;
    int life7_31;
    net.minecraft.entity.Entity[] life6_32;
    int life8_113;
    int life9_123;
    int life8_151;
    int life9_156;
    int life10_161;
    int life11_172;
    int life12_183;
    int life13_1450;
    int life13_1749;
    java.util.Iterator life13_3053;
    moom.bs life14_3060;
    int life15_3078;
    int life16_3083;
    forest_join_3122: {
    forest_join_3121: {
    forest_join_3045: {
    forest_join_2326: {
    forest_join_2022: {
    forest_join_2020: {
    forest_join_1744: {
    forest_join_1510: {
    forest_join_148: {
    forest_join_139: {
    forest_join_104: {
    forest_join_102: {
    life4_3 = (net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid.k ^ 65644595508794L);
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_1(17786, (3011390353487925953L ^ life4_3)))), ((int)(0)), ((int)((this.e - 1))), ((int)(0)), ((int)((this.g - 1))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    spill1178_0 = moom.G4.b();
    life7_31 = 1;
    life6_32 = spill1178_0;
    forest_cycle_33: while (true) {
    if (!((life7_31 <= __sourceIntrinsic_5ac1d031d896_invokedynamic1178_10(4377, (8616368782162183860L ^ life4_3))))) {
        break forest_join_102;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(life7_31)), ((int)(life7_31)), ((int)(life7_31)), ((int)(((this.e - 1) - life7_31))), ((int)(life7_31)), ((int)(((this.g - 1) - life7_31))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((life7_31 + 1))), ((int)(life7_31)), ((int)((life7_31 + 1))), ((int)(((this.e - 2) - life7_31))), ((int)(life7_31)), ((int)(((this.g - 2) - life7_31))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    life7_31 += 1;
    if (!((life6_32 != null))) {
        break forest_join_104;
    }
    if (!((life6_32 == null))) {
        continue forest_cycle_33;
    }
    break forest_cycle_33;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    life7_31 = 0;
    }
    forest_cycle_104: while (true) {
    forest_join_137: {
    forest_join_136: {
    if (!((life7_31 < this.e))) {
        break forest_join_139;
    }
    spill1178_1 = 0;
    if (!((life6_32 != null))) {
        forestValue1178_148_0 = spill1178_1;
        break forest_join_148;
    }
    life8_113 = spill1178_1;
    forest_cycle_112: while (true) {
    if (!((life8_113 < this.g))) {
        break forest_join_136;
    }
    life9_123 = __sourceIntrinsic_5ac1d031d896_invokedynamic1178_28(4412, (3162670130157143701L ^ life4_3));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).b(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((int)(life7_31)), ((int)(life9_123)), ((int)(life8_113)), ((moom.G2)(p2)));
    life8_113 += 1;
    if (!((life6_32 != null))) {
        break forest_join_137;
    }
    if (!((life6_32 == null))) {
        continue forest_cycle_112;
    }
    break forest_cycle_112;
    }
    }
    life7_31 += 1;
    }
    if (!((life6_32 == null))) {
        continue forest_cycle_104;
    }
    break forest_cycle_104;
    }
    }
    life7_31 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)), ((int)(3)));
    forestValue1178_148_0 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)), ((int)(2)));
    }
    life8_151 = forestValue1178_148_0;
    life9_156 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)), ((int)(0)));
    life10_161 = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)), ((int)(1)));
    life11_172 = ((((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.ORANGE)).b() ^ -1) & __sourceIntrinsic_5ac1d031d896_invokedynamic1178_42(20434, (5004307891753064563L ^ life4_3)));
    life12_183 = ((((net.minecraft.item.EnumDyeColor)(net.minecraft.item.EnumDyeColor.BLUE)).b() ^ -1) & __sourceIntrinsic_5ac1d031d896_invokedynamic1178_45(20434, (5004307891753064563L ^ life4_3)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(0)), ((int)(0)), ((int)(0)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_46(4377, (8616368782162183860L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_52(30106, (9098048923171070526L ^ life4_3)))), ((int)(1)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_53(30106, (9098048923171070526L ^ life4_3)))), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life7_31))))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_61(30106, (9098048923171070526L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life8_151))))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_65(30106, (9098048923171070526L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life9_156))))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_69(30106, (9098048923171070526L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life10_161))))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_73(30106, (9098048923171070526L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - 5))), ((int)(0)), ((int)(0)), ((int)((this.e - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_77(4377, (8616368782162183860L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - 4))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_84(30106, (9098048923171070526L ^ life4_3)))), ((int)(1)), ((int)((this.e - 2))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_86(30106, (9098048923171070526L ^ life4_3)))), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life7_31))))), ((int)((this.e - 3))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_95(30106, (9098048923171070526L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life8_151))))), ((int)((this.e - 3))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_100(30106, (9098048923171070526L ^ life4_3)))), ((int)(4)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life9_156))))), ((int)((this.e - 5))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_105(30106, (9098048923171070526L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life10_161))))), ((int)((this.e - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_110(30106, (9098048923171070526L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_112(12478, (3857064328993859341L ^ life4_3)))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_113(4860, (5883013952614647135L ^ life4_3)))), ((int)(4)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_119(4377, (8616368782162183860L ^ life4_3)))), ((int)(1)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_120(2652, (374981977467411940L ^ life4_3)))), ((int)(3)), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_130(4377, (8616368782162183860L ^ life4_3)))), ((int)(1)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_136(4377, (8616368782162183860L ^ life4_3)))), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_142(4377, (8616368782162183860L ^ life4_3)))), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_148(30106, (9098048923171070526L ^ life4_3)))), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_154(14066, (8044450773646860637L ^ life4_3)))), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_160(14066, (8044450773646860637L ^ life4_3)))), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_166(14066, (8044450773646860637L ^ life4_3)))), ((int)(1)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_168(12478, (3857064328993859341L ^ life4_3)))), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_174(12478, (3857064328993859341L ^ life4_3)))), ((int)(2)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_180(30983, (637205402554904236L ^ life4_3)))), ((int)(1)), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_181(6526, (7224308499044323018L ^ life4_3)))), ((int)(3)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_187(30983, (637205402554904236L ^ life4_3)))), ((int)(1)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_188(6526, (7224308499044323018L ^ life4_3)))), ((int)(2)), ((int)(2)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(4)), ((int)(5)), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_195(13213, (7904203905681056807L ^ life4_3))))), ((int)(4)), ((int)((this.g - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_197(13213, (7904203905681056807L ^ life4_3))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_203(4377, (8616368782162183860L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_204(4377, (8616368782162183860L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_205(14066, (8044450773646860637L ^ life4_3)))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_206(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_212(12478, (3857064328993859341L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_213(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_214(12478, (3857064328993859341L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_215(12478, (3857064328993859341L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_225(30983, (637205402554904236L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_226(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_227(30983, (637205402554904236L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_228(12478, (3857064328993859341L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_238(12478, (3857064328993859341L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_239(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_240(12478, (3857064328993859341L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_241(30983, (637205402554904236L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_251(30983, (637205402554904236L ^ life4_3)))), ((int)(1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_252(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_253(30983, (637205402554904236L ^ life4_3)))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_254(30983, (637205402554904236L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(5)), ((int)(4)), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_264(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - 5))), ((int)(1)), ((int)(5)), ((int)((this.e - 2))), ((int)(4)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_272(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_278(13213, (7904203905681056807L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_279(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_280(4377, (8616368782162183860L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_281(13213, (7904203905681056807L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_282(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_283(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_290(19251, (2247578072893299844L ^ life4_3))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_291(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_292(4377, (8616368782162183860L ^ life4_3)))), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_294(19251, (2247578072893299844L ^ life4_3))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_295(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_296(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_302(4377, (8616368782162183860L ^ life4_3)))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_303(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_304(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_315(13213, (7904203905681056807L ^ life4_3))))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_316(4377, (8616368782162183860L ^ life4_3)))), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_318(13213, (7904203905681056807L ^ life4_3))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_319(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_320(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(5)), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_332(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_336(13213, (7904203905681056807L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_337(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_341(13213, (7904203905681056807L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_342(13213, (7904203905681056807L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_343(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_348(13213, (7904203905681056807L ^ life4_3))))), ((int)(5)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_349(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_354(13213, (7904203905681056807L ^ life4_3))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_355(13213, (7904203905681056807L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_356(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_361(19251, (2247578072893299844L ^ life4_3))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_362(13213, (7904203905681056807L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_363(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(2)), ((int)(4)), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_365(13213, (7904203905681056807L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - 3))), ((int)(4)), ((int)(4)), ((int)((this.e - 3))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_373(13213, (7904203905681056807L ^ life4_3)))), ((int)(4)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life7_31))))), ((int)(2)), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life7_31))))), ((int)(2)), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life7_31))))), ((int)((this.e - 3))), ((int)(4)), ((int)(5)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life7_31))))), ((int)((this.e - 3))), ((int)(3)), ((int)(4)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(1)), ((int)(1)), ((int)(3)), ((int)(2)), ((int)(2)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - 3))), ((int)(1)), ((int)(3)), ((int)((this.e - 2))), ((int)(2)), ((int)(3)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).a__fE())), ((int)(1)), ((int)(1)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).a__fE())), ((int)((this.e - 2))), ((int)(1)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SAND)).a()))))), ((int)(1)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((moom.ei)(net.minecraft.init.Blocks.U)).b__fE(((int)(((net.minecraft.block.BlockStoneSlab$EnumType)(net.minecraft.block.BlockStoneSlab$EnumType.SAND)).a()))))), ((int)((this.e - 2))), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life10_161))))), ((int)(2)), ((int)(1)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.bD)).b__fE(((int)(life9_156))))), ((int)((this.e - 3))), ((int)(1)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(4)), ((int)(3)), ((int)(5)), ((int)(4)), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_430(29939, (7500698138859184979L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - 5))), ((int)(3)), ((int)(5)), ((int)((this.e - 5))), ((int)(3)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_438(30142, (3664630148647789056L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(3)), ((int)(1)), ((int)(5)), ((int)(4)), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_444(6526, (7224308499044323018L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)((this.e - __sourceIntrinsic_5ac1d031d896_invokedynamic1178_451(13213, (7904203905681056807L ^ life4_3))))), ((int)(1)), ((int)(5)), ((int)((this.e - 5))), ((int)(2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_453(6526, (7224308499044323018L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    life13_1450 = 5;
    forest_cycle_1448: while (true) {
    if (!((life13_1450 <= __sourceIntrinsic_5ac1d031d896_invokedynamic1178_459(25954, (3639070970885616325L ^ life4_3))))) {
        break forest_join_1510;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(4)), ((int)(1)), ((int)(life13_1450)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(4)), ((int)(2)), ((int)(life13_1450)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((this.e - 5))), ((int)(1)), ((int)(life13_1450)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)((this.e - 5))), ((int)(2)), ((int)(life13_1450)), ((moom.G2)(p2)));
    life13_1450 += 2;
    if (!((life6_32 != null))) {
        break forest_join_1744;
    }
    if (!((life6_32 == null))) {
        continue forest_cycle_1448;
    }
    break forest_cycle_1448;
    }
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_484(30106, (9098048923171070526L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_485(19251, (2247578072893299844L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_489(30106, (9098048923171070526L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_490(12478, (3857064328993859341L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_494(4377, (8616368782162183860L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_495(4377, (8616368782162183860L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_499(14066, (8044450773646860637L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_500(4377, (8616368782162183860L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_504(12478, (3857064328993859341L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_505(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_509(30983, (637205402554904236L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_510(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_514(19251, (2247578072893299844L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_515(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_519(16720, (3778088459616360173L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_520(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_524(4377, (8616368782162183860L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_525(14066, (8044450773646860637L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_529(14066, (8044450773646860637L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_530(14066, (8044450773646860637L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_534(30106, (9098048923171070526L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_535(30983, (637205402554904236L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_539(30106, (9098048923171070526L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_540(15390, (3835697703604906930L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life12_183))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_544(30106, (9098048923171070526L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_545(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    }
    life13_1749 = 0;
    forest_cycle_1746: while (true) {
    if (!((life13_1749 <= (this.e - 1)))) {
        break forest_join_2020;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(2)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(2)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(2)), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(3)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(3)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(3)), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(4)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(life13_1749)), ((int)(4)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(4)), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(5)), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(5)), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(5)), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_600(13213, (7904203905681056807L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_606(13213, (7904203905681056807L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_610(13213, (7904203905681056807L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_614(19251, (2247578072893299844L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_618(19251, (2247578072893299844L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_622(19251, (2247578072893299844L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_628(12478, (3857064328993859341L ^ life4_3)))), ((int)(1)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_634(12478, (3857064328993859341L ^ life4_3)))), ((int)(2)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_640(12478, (3857064328993859341L ^ life4_3)))), ((int)(3)), ((moom.G2)(p2)));
    life13_1749 = (life13_1749 + (this.e - 1));
    if (!((life6_32 != null))) {
        break forest_join_2022;
    }
    if (!((life6_32 == null))) {
        continue forest_cycle_1746;
    }
    break forest_cycle_1746;
    }
    }
    life13_1749 = 2;
    }
    forest_cycle_2022: while (true) {
    if (!((life13_1749 <= (this.e - 3)))) {
        break forest_join_2326;
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 - 1))), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 + 1))), ((int)(2)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 - 1))), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 + 1))), ((int)(3)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)((life13_1749 - 1))), ((int)(4)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(life13_1749)), ((int)(4)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)((life13_1749 + 1))), ((int)(4)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 - 1))), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 + 1))), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)((life13_1749 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_696(13213, (7904203905681056807L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_702(13213, (7904203905681056807L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)((life13_1749 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_706(13213, (7904203905681056807L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)((life13_1749 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_710(19251, (2247578072893299844L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_714(19251, (2247578072893299844L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)((life13_1749 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_718(19251, (2247578072893299844L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 - 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_724(12478, (3857064328993859341L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(life13_1749)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_730(12478, (3857064328993859341L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)((life13_1749 + 1))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_736(12478, (3857064328993859341L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    life13_1749 = (life13_1749 + ((this.e - 3) - 2));
    if (!((life6_32 != null))) {
        break forest_join_3045;
    }
    if (!((life6_32 == null))) {
        continue forest_cycle_2022;
    }
    break forest_cycle_2022;
    }
    }
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_739(12478, (3857064328993859341L ^ life4_3)))), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_740(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_741(13213, (7904203905681056807L ^ life4_3)))), ((int)(0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_753(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_754(13213, (7904203905681056807L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_758(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_759(13213, (7904203905681056807L ^ life4_3)))), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_763(4377, (8616368782162183860L ^ life4_3)))), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_769(30106, (9098048923171070526L ^ life4_3)))), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b9)).b__fE(((int)(life11_172))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_773(14066, (8044450773646860637L ^ life4_3)))), ((int)(5)), ((int)(0)), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_775(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_776(14496, (746292574047072005L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_777(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_778(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_779(5950, (8725092692661649556L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_780(30983, (637205402554904236L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_790(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_791(29305, (990422611769501154L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_792(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_793(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_794(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_795(30983, (637205402554904236L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_805(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_806(25585, (8127743548184147049L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_807(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_808(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_809(19718, (6056222501530180272L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_810(30983, (637205402554904236L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_820(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_821(27275, (1034000311432461613L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_822(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_823(30983, (637205402554904236L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_824(30983, (637205402554904236L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_830(4377, (8616368782162183860L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_831(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_832(4377, (8616368782162183860L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_833(14066, (8044450773646860637L ^ life4_3)))), ((int)(-1)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_834(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.az)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_842(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_843(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_844(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((moom.G2)(p2)), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_846(4377, (8616368782162183860L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_847(9172, (3640963911947351164L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_848(4377, (8616368782162183860L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_849(14066, (8044450773646860637L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_850(30114, (6264342954505576978L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_851(14066, (8044450773646860637L ^ life4_3)))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.W)).a__fE())), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((boolean)(false)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_859(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_860(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_861(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_865(12478, (3857064328993859341L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_866(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_867(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_873(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_874(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_875(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_881(19251, (2247578072893299844L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_882(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_883(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_887(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_888(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_889(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_893(30983, (637205402554904236L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_894(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_895(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_901(15390, (3835697703604906930L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_902(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_903(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_909(15390, (3835697703604906930L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_910(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_911(30106, (9098048923171070526L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_915(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_916(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_917(12478, (3857064328993859341L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_921(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_922(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_923(12478, (3857064328993859341L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_929(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_930(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_931(19251, (2247578072893299844L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_937(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_938(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_939(19251, (2247578072893299844L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_943(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_944(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_945(30983, (637205402554904236L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.a)).a__fE())), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_949(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_950(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_951(30983, (637205402554904236L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.CHISELED)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_957(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_958(20041, (4183583196050889195L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_959(15390, (3835697703604906930L ^ life4_3)))), ((moom.G2)(p2)));
    ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(this)).a(((net.minecraft.world.World)(p0)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.A)).b__fE(((int)(((moom.ac)(moom.ac.SMOOTH)).a()))))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_965(30106, (9098048923171070526L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_966(213, (5520628425715144522L ^ life4_3)))), ((int)(__sourceIntrinsic_5ac1d031d896_invokedynamic1178_967(15390, (3835697703604906930L ^ life4_3)))), ((moom.G2)(p2)));
    }
    life13_3053 = ((net.minecraft.util.EnumFacing$Plane)(net.minecraft.util.EnumFacing$Plane.HORIZONTAL)).iterator();
    forest_cycle_3048: while (true) {
    forest_join_3119: {
    forest_join_3069: {
    if (!(((java.util.Iterator)(life13_3053)).hasNext())) {
        break forest_join_3121;
    }
    life14_3060 = ((moom.bs)(((java.util.Iterator)(life13_3053)).next()));
    spill1178_2 = (this.i)[((moom.bs)(life14_3060)).b()];
    if (!((life6_32 != null))) {
        forestValue1178_3122_0 = ((spill1178_2) ? 1 : 0);
        break forest_join_3122;
    }
    if (!((life6_32 != null))) {
        forestValue1178_3069_0 = ((spill1178_2) ? 1 : 0);
        break forest_join_3069;
    }
    if (!((!spill1178_2))) {
        break forest_join_3119;
    }
    forestValue1178_3069_0 = (((moom.bs)(life14_3060)).c() * 2);
    }
    life15_3078 = forestValue1178_3069_0;
    life16_3083 = (((moom.bs)(life14_3060)).e() * 2);
    spill1178_3 = this.i;
    spill1178_4 = ((moom.bs)(life14_3060)).b();
    spill1178_5 = this;
    spill1178_6 = p0;
    spill1178_7 = p2;
    spill1178_8 = p1;
    spill1178_9 = (__sourceIntrinsic_5ac1d031d896_invokedynamic1178_982(30106, (9098048923171070526L ^ life4_3)) + life15_3078);
    spill1178_10 = __sourceIntrinsic_5ac1d031d896_invokedynamic1178_983(213, (5520628425715144522L ^ life4_3));
    spill1178_11 = (__sourceIntrinsic_5ac1d031d896_invokedynamic1178_984(30106, (9098048923171070526L ^ life4_3)) + life16_3083);
    spill1178_12 = net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid.j;
    moom.D5[] __stackOp1178_986_0 = new moom.D5[1];
    spill1178_13 = __stackOp1178_986_0;
    (__stackOp1178_986_0)[0] = ((moom.xg)(net.minecraft.init.Items.bS)).a(((java.util.Random)(p1)));
    (spill1178_3)[spill1178_4] = ((net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces$DesertPyramid)(spill1178_5)).a(((net.minecraft.world.World)(spill1178_6)), ((moom.G2)(spill1178_7)), ((java.util.Random)(spill1178_8)), ((int)(spill1178_9)), ((int)(spill1178_10)), ((int)(spill1178_11)), ((java.util.List)(moom.D5.a(((java.util.List)(spill1178_12)), ((moom.D5[])(spill1178_13))))), ((int)((2 + ((java.util.Random)(p1)).nextInt(((int)(5)))))));
    }
    if (!((life6_32 == null))) {
        continue forest_cycle_3048;
    }
    break forest_cycle_3048;
    }
    }
    forestValue1178_3122_0 = 1;
    }
    return ((forestValue1178_3122_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1951_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3006644c140de9b_originalDynamicSite4026_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12706_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_181(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_197(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_203(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_204(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_205(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_206(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_212(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_213(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_214(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_215(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_225(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_226(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_227(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_228(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_238(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_239(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_240(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_241(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_251(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_252(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_253(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_254(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_264(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_272(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_278(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_279(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_280(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_281(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_282(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_283(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_290(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_291(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_292(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_294(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_295(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_296(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_302(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_303(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_304(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_315(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_316(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_318(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_319(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_320(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_332(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_336(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_337(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_341(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_342(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_343(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_348(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_349(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_354(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_355(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_356(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_361(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_362(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_363(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_365(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_373(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_430(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_438(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_444(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_451(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_453(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_459(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_484(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_485(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_489(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_490(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_494(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_495(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_499(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_500(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_504(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_505(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_509(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_510(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_514(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_515(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_519(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_520(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_524(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_525(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_529(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_530(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_534(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_535(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_539(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_540(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_544(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_545(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_600(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_606(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_610(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_614(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_618(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_622(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_628(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_634(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_640(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_696(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_702(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_706(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_710(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_714(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_718(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_724(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_730(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_736(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_739(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_740(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_741(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_753(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_754(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_758(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_759(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_763(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_769(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_773(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_775(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_776(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_777(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_778(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_779(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_780(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_790(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_791(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_792(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_793(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_794(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_795(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_805(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_806(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_807(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_808(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_809(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_810(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_820(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_821(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_822(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_823(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_824(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_830(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_831(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_832(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_833(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_834(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_842(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_843(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_844(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_846(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_847(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_848(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_849(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_850(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_851(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_859(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_860(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_861(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_865(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_866(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_867(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_873(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_874(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_875(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_881(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_882(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_883(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_887(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_888(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_889(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_893(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_894(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_895(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_901(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_902(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_903(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_909(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_910(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_911(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_915(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_916(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_917(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_921(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_922(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_923(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_929(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_930(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_931(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_937(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_938(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_939(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_943(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_944(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_945(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_949(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_950(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_951(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_957(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_958(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_959(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_965(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_966(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_967(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_982(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_983(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5ac1d031d896_invokedynamic1178_984(int a0, long a1) throws E;
}
