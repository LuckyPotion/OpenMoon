package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gR extends net.minecraft.client.gui.GuiScreen {

private static java.util.List<moom.hL> w;

private moom.gK x;

private java.lang.String y;

private java.lang.String z;

private java.lang.String A;

private moom.h3 B;

private moom.gc C;

private moom.hJ D;

private static long E;

private static long[] F;

private static java.lang.Integer[] G;

private static java.util.Map H;

public gR(moom.gK p0) {
super();
    this.x = p0;
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(-4556904039978168021L)), ((long)(-8048709358786126784L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(178282312904198L)))));
    long local11_life6 = (moom.gR.E ^ 30956507961761L);
    H = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1219_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1219_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1219_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1219_14 = new byte[8];
    (__sourceSpill1219_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1219_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1219_16 = __sourceSpill1219_14;
    ((javax.crypto.Cipher)(__sourceSpill1219_11)).init(((int)(__sourceSpill1219_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1219_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1219_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[28];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "\nµéªO56îTNsÖ/\0049­³×\024®/·1Ñ\013ÔÕBç\020E>X\036×\034Â<S©\035ºz\002Ìè\004¦Á2)\004Eó@r@ÚÚ2{KÌ®ï· ^±B`¦gÛÏìx?o>gÞ=D\003Xa\035¿¥¸¥t+\036^ÍªpÃpÐÃX\013\013®\022`¨27fIik-È^IçO\"\006¦cSaâg:Ïþú¸tdø\027»·Ë\0344ÙÓÒß`Þ\177J0jsÓ\037÷diu\tÕÃp ¼vö\003S\030Í±V\t¸³xË³ÿ\025Ð"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1219_25 = local4_life21;
        int __sourceSpill1219_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1219_25)).substring(((int)(__sourceSpill1219_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1219_30 = local6_life19;
        int __sourceSpill1219_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1219_33 = new byte[8];
        (__sourceSpill1219_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1219_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1219_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1219_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1219_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1219_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1219_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1219_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1219_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1219_34)).doFinal(((byte[])(__sourceSpill1219_33)));
        (__sourceSpill1219_30)[__sourceSpill1219_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "¢¼É\004WÇ\006eð2ÕHÚîÇ\""))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1219_38 = local4_life21;
        int __sourceSpill1219_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1219_38)).substring(((int)(__sourceSpill1219_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1219_43 = local6_life19;
        int __sourceSpill1219_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1219_46 = new byte[8];
        (__sourceSpill1219_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1219_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1219_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1219_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1219_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1219_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1219_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1219_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1219_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1219_47)).doFinal(((byte[])(__sourceSpill1219_46)));
        (__sourceSpill1219_43)[__sourceSpill1219_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    F = ((long[])(local6_life19));
    G = ((java.lang.Integer[])(new java.lang.Integer[28]));
    w = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));
    java.lang.String __sourceSpill1219_59 = "Classic Flat";
    net.minecraft.item.Item __sourceSpill1219_60 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.c)));
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_61 = net.minecraft.world.biome.BiomeGenBase.s;
    java.util.List __sourceSpill1219_62 = java.util.List.of(((java.lang.Object)("village")));
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_63 = new net.minecraft.world.gen.FlatLayerInfo[3];
    (__sourceSpill1219_63)[0] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.c);
    (__sourceSpill1219_63)[1] = new net.minecraft.world.gen.FlatLayerInfo(2, net.minecraft.init.Blocks.d);
    (__sourceSpill1219_63)[2] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_59)), ((net.minecraft.item.Item)(__sourceSpill1219_60)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_61)), ((java.util.List)(__sourceSpill1219_62)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_63)));
    java.lang.String __sourceSpill1219_70 = "Tunnelers' Dream";
    net.minecraft.item.Item __sourceSpill1219_71 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)));
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_72 = net.minecraft.world.biome.BiomeGenBase.u;
    java.lang.String[] __sourceSpill1219_73 = new java.lang.String[5];
    (__sourceSpill1219_73)[0] = "biome_1";
    (__sourceSpill1219_73)[1] = "dungeon";
    (__sourceSpill1219_73)[2] = "decoration";
    (__sourceSpill1219_73)[3] = "stronghold";
    (__sourceSpill1219_73)[4] = "mineshaft";
    java.util.List __sourceSpill1219_76 = java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1219_73)));
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_77 = new net.minecraft.world.gen.FlatLayerInfo[4];
    (__sourceSpill1219_77)[0] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.c);
    (__sourceSpill1219_77)[1] = new net.minecraft.world.gen.FlatLayerInfo(5, net.minecraft.init.Blocks.d);
    (__sourceSpill1219_77)[2] = new net.minecraft.world.gen.FlatLayerInfo(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_79(19372, (6363272449882603957L ^ local11_life6)), net.minecraft.init.Blocks.b);
    (__sourceSpill1219_77)[3] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_70)), ((net.minecraft.item.Item)(__sourceSpill1219_71)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_72)), ((java.util.List)(__sourceSpill1219_76)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_77)));
    java.lang.String __sourceSpill1219_85 = "Water World";
    net.minecraft.item.Item __sourceSpill1219_86 = net.minecraft.init.Items.ax;
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_87 = net.minecraft.world.biome.BiomeGenBase.P;
    java.lang.String[] __sourceSpill1219_88 = new java.lang.String[2];
    (__sourceSpill1219_88)[0] = "biome_1";
    (__sourceSpill1219_88)[1] = "oceanmonument";
    java.util.List __sourceSpill1219_92 = java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1219_88)));
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_93 = new net.minecraft.world.gen.FlatLayerInfo[5];
    (__sourceSpill1219_93)[0] = new net.minecraft.world.gen.FlatLayerInfo(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_90(555, (517461935944239156L ^ local11_life6)), net.minecraft.init.Blocks.j);
    (__sourceSpill1219_93)[1] = new net.minecraft.world.gen.FlatLayerInfo(5, net.minecraft.init.Blocks.m);
    (__sourceSpill1219_93)[2] = new net.minecraft.world.gen.FlatLayerInfo(5, net.minecraft.init.Blocks.d);
    (__sourceSpill1219_93)[3] = new net.minecraft.world.gen.FlatLayerInfo(5, net.minecraft.init.Blocks.b);
    (__sourceSpill1219_93)[4] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_85)), ((net.minecraft.item.Item)(__sourceSpill1219_86)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_87)), ((java.util.List)(__sourceSpill1219_92)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_93)));
    java.lang.String __sourceSpill1219_105 = "Overworld";
    net.minecraft.item.Item __sourceSpill1219_106 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.H)));
    int __sourceSpill1219_107 = ((moom.ar)(moom.ar.GRASS)).a();
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_108 = net.minecraft.world.biome.BiomeGenBase.s;
    java.lang.String[] __sourceSpill1219_109 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_104(15828, (1149524655514761183L ^ local11_life6))];
    (__sourceSpill1219_109)[0] = "village";
    (__sourceSpill1219_109)[1] = "biome_1";
    (__sourceSpill1219_109)[2] = "decoration";
    (__sourceSpill1219_109)[3] = "stronghold";
    (__sourceSpill1219_109)[4] = "mineshaft";
    (__sourceSpill1219_109)[5] = "dungeon";
    (__sourceSpill1219_109)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_110(19803, (5163619361897465667L ^ local11_life6))] = "lake";
    (__sourceSpill1219_109)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_111(24157, (8383471121643131977L ^ local11_life6))] = "lava_lake";
    java.util.List __sourceSpill1219_114 = java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1219_109)));
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_115 = new net.minecraft.world.gen.FlatLayerInfo[4];
    (__sourceSpill1219_115)[0] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.c);
    (__sourceSpill1219_115)[1] = new net.minecraft.world.gen.FlatLayerInfo(3, net.minecraft.init.Blocks.d);
    (__sourceSpill1219_115)[2] = new net.minecraft.world.gen.FlatLayerInfo(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_117(17765, (3545931865295245183L ^ local11_life6)), net.minecraft.init.Blocks.b);
    (__sourceSpill1219_115)[3] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_105)), ((net.minecraft.item.Item)(__sourceSpill1219_106)), ((int)(__sourceSpill1219_107)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_108)), ((java.util.List)(__sourceSpill1219_114)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_115)));
    java.lang.String __sourceSpill1219_124 = "Snowy Kingdom";
    net.minecraft.item.Item __sourceSpill1219_125 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aH)));
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_126 = net.minecraft.world.biome.BiomeGenBase.D;
    java.lang.String[] __sourceSpill1219_127 = new java.lang.String[2];
    (__sourceSpill1219_127)[0] = "village";
    (__sourceSpill1219_127)[1] = "biome_1";
    java.util.List __sourceSpill1219_130 = java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1219_127)));
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_131 = new net.minecraft.world.gen.FlatLayerInfo[5];
    (__sourceSpill1219_131)[0] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.aH);
    (__sourceSpill1219_131)[1] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.c);
    (__sourceSpill1219_131)[2] = new net.minecraft.world.gen.FlatLayerInfo(3, net.minecraft.init.Blocks.d);
    (__sourceSpill1219_131)[3] = new net.minecraft.world.gen.FlatLayerInfo(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_134(15361, (5370121143820465670L ^ local11_life6)), net.minecraft.init.Blocks.b);
    (__sourceSpill1219_131)[4] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_124)), ((net.minecraft.item.Item)(__sourceSpill1219_125)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_126)), ((java.util.List)(__sourceSpill1219_130)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_131)));
    java.lang.String __sourceSpill1219_140 = "Bottomless Pit";
    net.minecraft.item.Item __sourceSpill1219_141 = net.minecraft.init.Items.G;
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_142 = net.minecraft.world.biome.BiomeGenBase.s;
    java.lang.String[] __sourceSpill1219_143 = new java.lang.String[2];
    (__sourceSpill1219_143)[0] = "village";
    (__sourceSpill1219_143)[1] = "biome_1";
    java.util.List __sourceSpill1219_146 = java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1219_143)));
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_147 = new net.minecraft.world.gen.FlatLayerInfo[3];
    (__sourceSpill1219_147)[0] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.c);
    (__sourceSpill1219_147)[1] = new net.minecraft.world.gen.FlatLayerInfo(3, net.minecraft.init.Blocks.d);
    (__sourceSpill1219_147)[2] = new net.minecraft.world.gen.FlatLayerInfo(2, net.minecraft.init.Blocks.e);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_140)), ((net.minecraft.item.Item)(__sourceSpill1219_141)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_142)), ((java.util.List)(__sourceSpill1219_146)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_147)));
    java.lang.String __sourceSpill1219_155 = "Desert";
    net.minecraft.item.Item __sourceSpill1219_156 = net.minecraft.item.Item.a(((net.minecraft.block.Block)(net.minecraft.init.Blocks.m)));
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_157 = net.minecraft.world.biome.BiomeGenBase.t;
    java.lang.String[] __sourceSpill1219_158 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_154(28118, (111346682752034770L ^ local11_life6))];
    (__sourceSpill1219_158)[0] = "village";
    (__sourceSpill1219_158)[1] = "biome_1";
    (__sourceSpill1219_158)[2] = "decoration";
    (__sourceSpill1219_158)[3] = "stronghold";
    (__sourceSpill1219_158)[4] = "mineshaft";
    (__sourceSpill1219_158)[5] = "dungeon";
    java.util.List __sourceSpill1219_162 = java.util.Arrays.asList(((java.lang.Object[])(__sourceSpill1219_158)));
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_163 = new net.minecraft.world.gen.FlatLayerInfo[4];
    (__sourceSpill1219_163)[0] = new net.minecraft.world.gen.FlatLayerInfo(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_160(15518, (1126960612693915277L ^ local11_life6)), net.minecraft.init.Blocks.m);
    (__sourceSpill1219_163)[1] = new net.minecraft.world.gen.FlatLayerInfo(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_164(20903, (7112255095423359906L ^ local11_life6)), net.minecraft.init.Blocks.A);
    (__sourceSpill1219_163)[2] = new net.minecraft.world.gen.FlatLayerInfo(3, net.minecraft.init.Blocks.b);
    (__sourceSpill1219_163)[3] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_155)), ((net.minecraft.item.Item)(__sourceSpill1219_156)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_157)), ((java.util.List)(__sourceSpill1219_162)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_163)));
    java.lang.String __sourceSpill1219_173 = "Redstone Ready";
    net.minecraft.item.Item __sourceSpill1219_174 = net.minecraft.init.Items.aC;
    net.minecraft.world.biome.BiomeGenBase __sourceSpill1219_175 = net.minecraft.world.biome.BiomeGenBase.t;
    net.minecraft.world.gen.FlatLayerInfo[] __sourceSpill1219_176 = new net.minecraft.world.gen.FlatLayerInfo[3];
    (__sourceSpill1219_176)[0] = new net.minecraft.world.gen.FlatLayerInfo(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_171(14812, (6126633636032590784L ^ local11_life6)), net.minecraft.init.Blocks.A);
    (__sourceSpill1219_176)[1] = new net.minecraft.world.gen.FlatLayerInfo(3, net.minecraft.init.Blocks.b);
    (__sourceSpill1219_176)[2] = new net.minecraft.world.gen.FlatLayerInfo(1, net.minecraft.init.Blocks.h);
    moom.gR.a(((java.lang.String)(__sourceSpill1219_173)), ((net.minecraft.item.Item)(__sourceSpill1219_174)), ((net.minecraft.world.biome.BiomeGenBase)(__sourceSpill1219_175)), ((net.minecraft.world.gen.FlatLayerInfo[])(__sourceSpill1219_176)));
}

private static native <E extends Throwable> void __sourceHandlerCall_73ee05a1a44ab1f1be95(java.lang.String a0, net.minecraft.item.Item a1, int a2, net.minecraft.world.biome.BiomeGenBase a3, java.util.List a4, net.minecraft.world.gen.FlatLayerInfo[] a5) throws E;
private static final class __SourceHandler_73ee05a1a44ab1f1be95 {

public static void f1758(java.lang.String p0, net.minecraft.item.Item p1, int p2, net.minecraft.world.biome.BiomeGenBase p3, java.util.List p4, net.minecraft.world.gen.FlatLayerInfo[] p5) throws Throwable {
    moom.FG life6_3;
    int life7_8;
    java.util.Iterator life7_32;
    java.lang.String life8_39;
    life6_3 = new moom.FG();
    life7_8 = ((p5).length - 1);
    loop_region_9: while ((life7_8 >= 0)) {
        __call1758_1(__call1758_0(life6_3), (p5)[life7_8]);
        life7_8 += -1;
    }
    __call1758_3(life6_3, __fieldRead1758_2(p3));
    __call1758_4(life6_3);
    if ((p4 != null)) {
        life7_32 = __call1758_5(p4);
        loop_region_31: while (__call1758_6(life7_32)) {
        life8_39 = __cast1758_8(__call1758_7(life7_32));
        __call1758_11(__call1758_9(life6_3), life8_39, __call1758_10());
    }
    }
    __call1758_14(__fieldRead1758_12(), new moom.hL(p1, p2, p0, __call1758_13(life6_3)));
    return;
}
public static void h1758_0(moom.Oo p0) throws Throwable {
    throw __call1175800_0(p0);
}
private static native java.util.List __call1758_0(moom.FG a0) throws Throwable;
private static native boolean __call1758_1(java.util.List a0, net.minecraft.world.gen.FlatLayerInfo a1) throws Throwable;
private static native int __fieldRead1758_2(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native void __call1758_3(moom.FG a0, int a1) throws Throwable;
private static native void __call1758_4(moom.FG a0) throws Throwable;
private static native java.util.Iterator __call1758_5(java.util.List a0) throws Throwable;
private static native boolean __call1758_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1758_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1758_8(java.lang.Object a0) throws Throwable;
private static native java.util.Map __call1758_9(moom.FG a0) throws Throwable;
private static native java.util.HashMap __call1758_10() throws Throwable;
private static native java.lang.Object __call1758_11(java.util.Map a0, java.lang.String a1, java.util.HashMap a2) throws Throwable;
private static native java.util.List __fieldRead1758_12() throws Throwable;
private static native java.lang.String __call1758_13(moom.FG a0) throws Throwable;
private static native boolean __call1758_14(java.util.List a0, moom.hL a1) throws Throwable;
private static native java.lang.Exception __call1175800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a7c89a418d5ffb372406(moom.gR a0, moom.gc a1) throws E;
private static final class __SourceHandler_a7c89a418d5ffb372406 {

public static void f1040(moom.gR receiver, moom.gc p0) throws Throwable {
    forward_join_27: {
    forward_join_18: {
    if (!((__fieldRead1040_0(p0) == 0))) { break forward_join_18; }
    if (!(__call1040_1(receiver))) { break forward_join_18; }
    __call1040_5(__fieldRead1040_2(receiver), __call1040_4(__fieldRead1040_3(receiver)));
    __call1040_8(__fieldRead1040_6(receiver), __fieldRead1040_7(receiver));
    break forward_join_27;
    }
    if (!((__fieldRead1040_9(p0) == 1))) { break forward_join_27; }
    __call1040_12(__fieldRead1040_10(receiver), __fieldRead1040_11(receiver));
    }
    return;
}
public static void h1040_0(java.io.IOException p0) throws Throwable {
    throw __call1104000_0(p0);
}
public static void h1040_1(java.io.IOException p0) throws Throwable {
    throw __call1104001_0(p0);
}
public static void h1040_2(java.io.IOException p0) throws Throwable {
    throw __call1104002_0(p0);
}
private static native int __fieldRead1040_0(moom.gc a0) throws Throwable;
private static native boolean __call1040_1(moom.gR a0) throws Throwable;
private static native moom.gK __fieldRead1040_2(moom.gR a0) throws Throwable;
private static native moom.hJ __fieldRead1040_3(moom.gR a0) throws Throwable;
private static native java.lang.String __call1040_4(moom.hJ a0) throws Throwable;
private static native void __call1040_5(moom.gK a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1040_6(moom.gR a0) throws Throwable;
private static native moom.gK __fieldRead1040_7(moom.gR a0) throws Throwable;
private static native void __call1040_8(net.minecraft.client.Minecraft a0, moom.gK a1) throws Throwable;
private static native int __fieldRead1040_9(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1040_10(moom.gR a0) throws Throwable;
private static native moom.gK __fieldRead1040_11(moom.gR a0) throws Throwable;
private static native void __call1040_12(net.minecraft.client.Minecraft a0, moom.gK a1) throws Throwable;
private static native java.lang.Exception __call1104000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1104001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1104002_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_af031c2041e5024bfebf(moom.gR a0) throws E;
private static final class __SourceHandler_af031c2041e5024bfebf {

public static boolean f1041(moom.gR receiver) throws Throwable {
    int forwardValue1041_20_0;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    forward_join_11: {
    if (!((__fieldRead1041_1(__fieldRead1041_0(receiver)) > -1))) {
        break forward_join_11;
    }
    if (!((__fieldRead1041_3(__fieldRead1041_2(receiver)) >= __call1041_5(__fieldRead1041_4())))) {
        break forward_join_17;
    }
    }
    if (!((__call1041_8(__call1041_7(__fieldRead1041_6(receiver))) > 1))) {
        break forward_join_19;
    }
    }
    forwardValue1041_20_0 = 1;
    break forward_join_20;
    }
    forwardValue1041_20_0 = 0;
    }
    return __integerCategory1041_9(forwardValue1041_20_0);
}
public static void h1041_0(moom.Oo p0) throws Throwable {
    throw __call1104100_0(p0);
}
public static void h1041_1(moom.Oo p0) throws Throwable {
    throw __call1104101_0(p0);
}
public static void h1041_2(moom.Oo p0) throws Throwable {
    throw __call1104102_0(p0);
}
private static native moom.h3 __fieldRead1041_0(moom.gR a0) throws Throwable;
private static native int __fieldRead1041_1(moom.h3 a0) throws Throwable;
private static native moom.h3 __fieldRead1041_2(moom.gR a0) throws Throwable;
private static native int __fieldRead1041_3(moom.h3 a0) throws Throwable;
private static native java.util.List __fieldRead1041_4() throws Throwable;
private static native int __call1041_5(java.util.List a0) throws Throwable;
private static native moom.hJ __fieldRead1041_6(moom.gR a0) throws Throwable;
private static native java.lang.String __call1041_7(moom.hJ a0) throws Throwable;
private static native int __call1041_8(java.lang.String a0) throws Throwable;
private static native boolean __integerCategory1041_9(int value) throws Throwable;
private static native java.lang.Exception __call1104100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104102_0(moom.Oo a0) throws Throwable;

}


private boolean e__Boolean() { return __sourceHandlerCall_af031c2041e5024bfebf(this); }


public void e() throws java.io.IOException {
super.e();
    ((moom.h3)(this.B)).c__Void();
    return;
}


public void c__Void() {
java.util.List spill100113_0;
    moom.gc spill100113_1;
    long life1_3;
    life1_3 = (moom.gR.E ^ 32342984525812L);
    ((java.util.List)(this.m)).clear();
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(true)));
    this.y = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.presets.title")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.z = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.presets.share")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.A = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.presets.list")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.D = ((moom.hJ)(new moom.hJ(2, this.p, __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_11(13435, (2822443318757761069L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_12(16924, (7770847985178236503L ^ life1_3)), (this.k - __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_14(24898, (2849134085624198417L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_15(16189, (785613427770403699L ^ life1_3)))));
    this.B = ((moom.h3)(new moom.h3(this)));
    ((moom.hJ)(this.D)).e(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic100113_19(22501, (4585904392221508517L ^ life1_3)))));
    ((moom.hJ)(this.D)).a(((java.lang.String)(((moom.gK)(this.x)).c())));
    spill100113_0 = this.m;
    moom.gR __stackOp100113_33_0 = this;
    moom.gc __stackOp100113_33_1 = new moom.gc(0, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_27(9082, (4961174517461235518L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_29(10063, (4577174998681301779L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_30(25836, (1207985975922258107L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_31(17171, (5430028295512348497L ^ life1_3)), moom.oO.a(((java.lang.String)("createWorld.customize.presets.select")), ((java.lang.Object[])(new java.lang.Object[0]))));
    spill100113_1 = __stackOp100113_33_1;
    ((moom.gR)(__stackOp100113_33_0)).C = ((moom.gc)(__stackOp100113_33_1));
    ((java.util.List)(spill100113_0)).add(((java.lang.Object)(spill100113_1)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(1, ((this.k / 2) + 5), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_39(23447, (6540083931160072138L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_40(4216, (7779994744416470064L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_41(17171, (5430028295512348497L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((moom.gR)(this)).a();
    return;
}


public void h() {
org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    return;
}


private static void a(java.lang.String p0, net.minecraft.item.Item p1, int p2, net.minecraft.world.biome.BiomeGenBase p3, java.util.List<java.lang.String> p4, net.minecraft.world.gen.FlatLayerInfo[] p5) { __sourceHandlerCall_73ee05a1a44ab1f1be95(p0, p1, p2, p3, p4, p5); }


private static void a(java.lang.String p0, net.minecraft.item.Item p1, net.minecraft.world.biome.BiomeGenBase p2, java.util.List<java.lang.String> p3, net.minecraft.world.gen.FlatLayerInfo[] p4) {
moom.gR.a(((java.lang.String)(p0)), ((net.minecraft.item.Item)(p1)), ((int)(0)), ((net.minecraft.world.biome.BiomeGenBase)(p2)), ((java.util.List)(p3)), ((net.minecraft.world.gen.FlatLayerInfo[])(p4)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7742_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gR"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gR.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4732;
        if (G[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = F[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])H.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    H.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/gR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gR.G[n2] = n3;
        }
        return G[n2];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.gR.E ^ 35420341207666L);
    ((moom.gR)(this)).i();
    ((moom.h3)(this.B)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.gR)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.y)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_7(15518, (1127017722480700766L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_8(16136, (7810867080627236557L ^ local4)))));
    ((moom.gR)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.z)), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_12(11841, (6042379146730160024L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_13(24583, (1329644421749469652L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_14(15895, (2392669212434935749L ^ local4)))));
    ((moom.gR)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.A)), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_18(11841, (6042379146730160024L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_19(13239, (887728992412869238L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_20(18428, (5513958408192022079L ^ local4)))));
    ((moom.hJ)(this.D)).d__Void();
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_a7c89a418d5ffb372406(this, p0); }


protected void a(char p0, int p1) throws java.io.IOException {
try {
        if ((!((moom.hJ)(this.D)).a(((char)(p0)), ((int)(p1))))) {
        super.a(((char)(p0)), ((int)(p1)));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw moom.gR.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException {
((moom.hJ)(this.D)).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


public void a() {
((moom.gc)(this.C)).m = ((boolean)(((moom.gR)(this)).e__Boolean()));
    return;
}


private static void a(java.lang.String p0, net.minecraft.item.Item p1, net.minecraft.world.biome.BiomeGenBase p2, net.minecraft.world.gen.FlatLayerInfo[] p3) {
moom.gR.a(((java.lang.String)(p0)), ((net.minecraft.item.Item)(p1)), ((int)(0)), ((net.minecraft.world.biome.BiomeGenBase)(p2)), ((java.util.List)(null)), ((net.minecraft.world.gen.FlatLayerInfo[])(p3)));
    return;
}


public void g() {
((moom.hJ)(this.D)).a__Void();
    super.g();
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1219_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1456_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7742_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic100113_41(int a0, long a1) throws E;
}
