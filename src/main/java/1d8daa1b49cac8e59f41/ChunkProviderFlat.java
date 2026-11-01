package net.minecraft.world.gen;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ChunkProviderFlat implements moom.Fn {

private net.minecraft.world.World a;

private java.util.Random b;

private net.minecraft.block.state.IBlockState[] c;

private moom.FG d;

private java.util.List<net.minecraft.world.gen.structure.MapGenStructure> e;

private boolean f;

private boolean g;

private moom.Gr h;

private moom.Gr i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

private static long[] n;

private static java.lang.Long[] o;

private static java.util.Map p;

public ChunkProviderFlat(net.minecraft.world.World p0, long p1, boolean p2, java.lang.String p3) { super(); }


private static void __sourceConstructorBody_3b264c16ad01d606(net.minecraft.world.gen.ChunkProviderFlat receiver, net.minecraft.world.World p0, long p1, boolean p2, java.lang.String p3) throws Throwable {

int forestValue581_69_0;

    int forestValue581_73_0;

    int forestValue581_90_0;

    int forestValue581_107_0;

    int forestValue581_124_0;

    int forestValue581_143_0;

    int forestValue581_157_0;

    int forestValue581_174_0;

    net.minecraft.block.Block forestValue581_228_0;

    net.minecraft.block.Block forestValue581_228_1;

    net.minecraft.world.gen.ChunkProviderFlat forestValue581_260_0;

    int forestValue581_260_1;

    net.minecraft.world.gen.ChunkProviderFlat forestValue581_264_0;

    int forestValue581_264_1;

    net.minecraft.world.gen.ChunkProviderFlat forestValue581_265_0;

    net.minecraft.world.gen.ChunkProviderFlat forestValue581_266_0;

    int forestValue581_266_1;

    java.lang.String[] spill581_0;

    boolean spill581_1;

    boolean spill581_2;

    boolean spill581_3;

    net.minecraft.block.Block spill581_4;

    net.minecraft.block.Block spill581_5;

    net.minecraft.world.gen.ChunkProviderFlat spill581_6;

    int spill581_7;

    long life6_3;

    java.lang.String[] life8_21;

    java.util.Map life9_40;

    java.util.Map life10_52;

    int life9_190;

    int life10_192;

    int life11_194;

    java.util.Iterator life12_199;

    net.minecraft.world.gen.FlatLayerInfo life13_206;

    int life14_211;

    net.minecraft.block.state.IBlockState life15_221;

    forest_join_266: {

    forest_join_265: {

    forest_join_264: {

    forest_join_260: {

    forest_join_250: {

    forest_join_247: {

    forest_join_174: {

    forest_join_166: {

    forest_join_157: {

    forest_join_152: {

    forest_join_143: {

    forest_join_138: {

    forest_join_124: {

    forest_join_121: {

    forest_join_107: {

    forest_join_104: {

    forest_join_90: {

    forest_join_87: {

    forest_join_73: {

    forest_join_70: {

    forest_join_69: {

    forest_join_62: {

    life6_3 = (net.minecraft.world.gen.ChunkProviderFlat.j ^ 9509268639487L);

    net.minecraft.world.gen.ChunkProviderFlat.__sourceConstructorInit_3b264c16ad01d606_0(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)));

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).c = ((net.minecraft.block.state.IBlockState[])(new net.minecraft.block.state.IBlockState[__sourceIntrinsic_3b264c16ad01d606_invokedynamic581_2(24223, (664249460256286027L ^ life6_3))]));

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).e = ((java.util.List)(com.google.common.collect.Lists.newArrayList()));

    spill581_0 = moom.FI.b();

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).a = ((net.minecraft.world.World)(p0));

    life8_21 = spill581_0;

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).b = ((java.util.Random)(new java.util.Random(p1)));

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).d = ((moom.FG)(moom.FG.a(((java.lang.String)(p3)))));

    spill581_1 = p2;

    if (!((life8_21 != null))) {

        forestValue581_143_0 = ((spill581_1) ? 1 : 0);

        break forest_join_143;

    }

    if (!(spill581_1)) {

        break forest_join_138;

    }

    life9_40 = ((moom.FG)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).d)).a__Map();

    spill581_2 = ((java.util.Map)(life9_40)).containsKey(((java.lang.Object)("village")));

    if (!((life8_21 != null))) {

        forestValue581_73_0 = ((spill581_2) ? 1 : 0);

        break forest_join_73;

    }

    if (!(spill581_2)) {

        break forest_join_70;

    }

    life10_52 = ((java.util.Map)(((java.util.Map)(life9_40)).get(((java.lang.Object)("village")))));

    spill581_3 = ((java.util.Map)(life10_52)).containsKey(((java.lang.Object)("size")));

    if (!((life8_21 != null))) {

        forestValue581_69_0 = ((spill581_3) ? 1 : 0);

        break forest_join_69;

    }

    if (!((!spill581_3))) {

        break forest_join_62;

    }

    ((java.util.Map)(life10_52)).put(((java.lang.Object)("size")), ((java.lang.Object)("1")));

    }

    forestValue581_69_0 = ((((java.util.List)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).e)).add(((java.lang.Object)(new moom.FR(life10_52))))) ? 1 : 0);

    }

    recovery.source.CarrierOps.discard(forestValue581_69_0);

    }

    forestValue581_73_0 = ((((java.util.Map)(life9_40)).containsKey(((java.lang.Object)("biome_1")))) ? 1 : 0);

    }

    if (!((life8_21 != null))) {

        forestValue581_90_0 = forestValue581_73_0;

        break forest_join_90;

    }

    if (!((forestValue581_73_0 != 0))) {

        break forest_join_87;

    }

    ((java.util.List)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).e)).add(((java.lang.Object)(new moom.FP(((java.util.Map)(((java.util.Map)(life9_40)).get(((java.lang.Object)("biome_1")))))))));

    }

    forestValue581_90_0 = ((((java.util.Map)(life9_40)).containsKey(((java.lang.Object)("mineshaft")))) ? 1 : 0);

    }

    if (!((life8_21 != null))) {

        forestValue581_107_0 = forestValue581_90_0;

        break forest_join_107;

    }

    if (!((forestValue581_90_0 != 0))) {

        break forest_join_104;

    }

    ((java.util.List)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).e)).add(((java.lang.Object)(new moom.FN(((java.util.Map)(((java.util.Map)(life9_40)).get(((java.lang.Object)("mineshaft")))))))));

    }

    forestValue581_107_0 = ((((java.util.Map)(life9_40)).containsKey(((java.lang.Object)("stronghold")))) ? 1 : 0);

    }

    if (!((life8_21 != null))) {

        forestValue581_124_0 = forestValue581_107_0;

        break forest_join_124;

    }

    if (!((forestValue581_107_0 != 0))) {

        break forest_join_121;

    }

    ((java.util.List)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).e)).add(((java.lang.Object)(new moom.FQ(((java.util.Map)(((java.util.Map)(life9_40)).get(((java.lang.Object)("stronghold")))))))));

    }

    forestValue581_124_0 = ((((java.util.Map)(life9_40)).containsKey(((java.lang.Object)("oceanmonument")))) ? 1 : 0);

    }

    if (!((life8_21 != null))) {

        forestValue581_143_0 = forestValue581_124_0;

        break forest_join_143;

    }

    if (!((forestValue581_124_0 != 0))) {

        break forest_join_138;

    }

    ((java.util.List)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).e)).add(((java.lang.Object)(new moom.FS(((java.util.Map)(((java.util.Map)(life9_40)).get(((java.lang.Object)("oceanmonument")))))))));

    }

    forestValue581_143_0 = ((((java.util.Map)(((moom.FG)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).d)).a__Map())).containsKey(((java.lang.Object)("lake")))) ? 1 : 0);

    }

    if (!((life8_21 != null))) {

        forestValue581_157_0 = forestValue581_143_0;

        break forest_join_157;

    }

    if (!((forestValue581_143_0 != 0))) {

        break forest_join_152;

    }

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).h = ((moom.Gr)(new moom.Gr(net.minecraft.init.Blocks.j)));

    }

    forestValue581_157_0 = ((((java.util.Map)(((moom.FG)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).d)).a__Map())).containsKey(((java.lang.Object)("lava_lake")))) ? 1 : 0);

    }

    if (!((life8_21 != null))) {

        forestValue581_174_0 = forestValue581_157_0;

        break forest_join_174;

    }

    if (!((forestValue581_157_0 != 0))) {

        break forest_join_166;

    }

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).i = ((moom.Gr)(new moom.Gr(net.minecraft.init.Blocks.l)));

    }

    ((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).g = ((boolean)(((java.util.Map)(((moom.FG)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).d)).a__Map())).containsKey(((java.lang.Object)("dungeon")))));

    forestValue581_174_0 = 0;

    }

    life9_190 = forestValue581_174_0;

    life10_192 = 0;

    life11_194 = 1;

    life12_199 = ((java.util.List)(((moom.FG)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).d)).a__List())).iterator();

    forest_cycle_184: while (true) {

    forest_join_245: {

    forest_join_236: {

    forest_join_228: {

    forest_join_224: {

    if (!(((java.util.Iterator)(life12_199)).hasNext())) {

        break forest_join_247;

    }

    life13_206 = ((net.minecraft.world.gen.FlatLayerInfo)(((java.util.Iterator)(life12_199)).next()));

    if (!((life8_21 != null))) {

        break forest_join_250;

    }

    life14_211 = ((net.minecraft.world.gen.FlatLayerInfo)(life13_206)).c();

    forest_cycle_196: while (true) {

    forest_join_222: {

    forest_join_221: {

    if (!((life14_211 < (((net.minecraft.world.gen.FlatLayerInfo)(life13_206)).c() + ((net.minecraft.world.gen.FlatLayerInfo)(life13_206)).a())))) {

        break forest_join_224;

    }

    life15_221 = ((net.minecraft.world.gen.FlatLayerInfo)(life13_206)).a__fE();

    if (!((life8_21 != null))) {

        break forest_join_222;

    }

    spill581_4 = ((net.minecraft.block.state.IBlockState)(life15_221)).a__ch();

    spill581_5 = net.minecraft.init.Blocks.a;

    if (!((life8_21 != null))) {

        forestValue581_228_0 = spill581_4;

        forestValue581_228_1 = spill581_5;

        break forest_join_228;

    }

    if (!((spill581_4 != spill581_5))) {

        break forest_join_221;

    }

    life11_194 = 0;

    (((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).c)[life14_211] = life15_221;

    }

    life14_211 += 1;

    }

    if (!((life8_21 == null))) {

        continue forest_cycle_196;

    }

    break forest_cycle_196;

    }

    }

    forestValue581_228_0 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.world.gen.FlatLayerInfo)(life13_206)).a__fE())).a__ch();

    forestValue581_228_1 = net.minecraft.init.Blocks.a;

    }

    if (!((forestValue581_228_0 == forestValue581_228_1))) {

        break forest_join_236;

    }

    life10_192 = (life10_192 + ((net.minecraft.world.gen.FlatLayerInfo)(life13_206)).a());

    if (!((life8_21 == null))) {

        break forest_join_245;

    }

    }

    life9_190 = (life9_190 + (((net.minecraft.world.gen.FlatLayerInfo)(life13_206)).a() + life10_192));

    life10_192 = 0;

    }

    if (!((life8_21 == null))) {

        continue forest_cycle_184;

    }

    break forest_cycle_184;

    }

    }

    ((net.minecraft.world.World)(p0)).a__Void(((int)(life9_190)));

    }

    spill581_6 = receiver;

    spill581_7 = life11_194;

    if (!((life8_21 != null))) {

        forestValue581_260_0 = spill581_6;

        forestValue581_260_1 = spill581_7;

        break forest_join_260;

    }

    if (!((spill581_7 == 0))) {

        forestValue581_265_0 = spill581_6;

        break forest_join_265;

    }

    forestValue581_260_0 = spill581_6;

    forestValue581_260_1 = ((((java.util.Map)(((moom.FG)(((net.minecraft.world.gen.ChunkProviderFlat)(receiver)).d)).a__Map())).containsKey(((java.lang.Object)("decoration")))) ? 1 : 0);

    }

    if (!((life8_21 != null))) {

        forestValue581_264_0 = forestValue581_260_0;

        forestValue581_264_1 = forestValue581_260_1;

        break forest_join_264;

    }

    if (!((forestValue581_260_1 != 0))) {

        forestValue581_265_0 = forestValue581_260_0;

        break forest_join_265;

    }

    forestValue581_264_0 = forestValue581_260_0;

    forestValue581_264_1 = 1;

    }

    forestValue581_266_0 = forestValue581_264_0;

    forestValue581_266_1 = forestValue581_264_1;

    break forest_join_266;

    }

    forestValue581_266_0 = forestValue581_265_0;

    forestValue581_266_1 = 0;

    }

    ((net.minecraft.world.gen.ChunkProviderFlat)(forestValue581_266_0)).f = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue581_266_1)));

    return;

}



static {
j = ((long)(((moom._a)(moom._c.a(((long)(5719370006154857745L)), ((long)(2809010225108717989L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(27368747743389L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (net.minecraft.world.gen.ChunkProviderFlat.j ^ 19320899043904L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1218_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1218_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1218_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1218_14 = new byte[8];
    (__sourceSpill1218_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1218_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1218_16 = __sourceSpill1218_14;
    ((javax.crypto.Cipher)(__sourceSpill1218_11)).init(((int)(__sourceSpill1218_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1218_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1218_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[8];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "\004¡of\001âLí¾mg\016¾\f¬÷îh®&#¢\"=7ð]ú!y\000Uã%+ýb'\f"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1218_25 = local17_life21;
        int __sourceSpill1218_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1218_25)).substring(((int)(__sourceSpill1218_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1218_30 = local19_life19;
        int __sourceSpill1218_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1218_33 = new byte[8];
        (__sourceSpill1218_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1218_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1218_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1218_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1218_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1218_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1218_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1218_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1218_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1218_34)).doFinal(((byte[])(__sourceSpill1218_33)));
        (__sourceSpill1218_30)[__sourceSpill1218_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "~BP\"éWRÒÔó½-"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1218_38 = local17_life21;
        int __sourceSpill1218_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1218_38)).substring(((int)(__sourceSpill1218_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1218_43 = local19_life19;
        int __sourceSpill1218_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1218_46 = new byte[8];
        (__sourceSpill1218_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1218_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1218_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1218_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1218_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1218_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1218_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1218_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1218_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1218_47)).doFinal(((byte[])(__sourceSpill1218_46)));
        (__sourceSpill1218_43)[__sourceSpill1218_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    k = ((long[])(local19_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[8]));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1218_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1218_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1218_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1218_59 = new byte[8];
    (__sourceSpill1218_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1218_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1218_61 = __sourceSpill1218_59;
    ((javax.crypto.Cipher)(__sourceSpill1218_56)).init(((int)(__sourceSpill1218_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1218_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1218_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "DÁc¨¡\nqÕrU0©I\024Å"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1218_70 = local4_life66;
        int __sourceSpill1218_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1218_70)).substring(((int)(__sourceSpill1218_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1218_75 = local6_life64;
        int __sourceSpill1218_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1218_78 = new byte[8];
        (__sourceSpill1218_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1218_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1218_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1218_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1218_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1218_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1218_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1218_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1218_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1218_79)).doFinal(((byte[])(__sourceSpill1218_78)));
        (__sourceSpill1218_75)[__sourceSpill1218_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    n = ((long[])(local6_life64));
    o = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3b264c16ad01d606_0(net.minecraft.world.gen.ChunkProviderFlat a0) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12684_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.world.gen.ChunkProviderFlat.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2375);
    if (((net.minecraft.world.gen.ChunkProviderFlat.o)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.world.gen.ChunkProviderFlat.n)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.world.gen.ChunkProviderFlat.p)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.world.gen.ChunkProviderFlat.p)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Fz", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.world.gen.ChunkProviderFlat.o)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.world.gen.ChunkProviderFlat.o)[life3_8])).longValue();
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.ChunkProviderFlat.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21837;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Fz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(moom.Fn p0, int p1, int p2) {
int lexicalValue1754_146_0;
    int lexicalValue1754_164_0;
    net.minecraft.world.gen.ChunkProviderFlat lexicalValue1754_212_0;
    moom.Gr lexicalValue1754_215_0;
    int lexicalValue1754_306_0;
    net.minecraft.world.gen.ChunkProviderFlat lexicalValue1754_308_0;
    int lexicalValue1754_309_0;
    int lexicalValue1754_375_0;
    java.lang.String[] spill1754_0;
    int spill1754_1;
    moom.Gr spill1754_2;
    int spill1754_3;
    net.minecraft.world.gen.ChunkProviderFlat spill1754_4;
    int spill1754_5;
    int spill1754_6;
    int spill1754_7;
    int spill1754_8;
    long life4_3;
    int life7_11;
    int life8_19;
    moom.DT life9_26;
    net.minecraft.world.biome.BiomeGenBase life10_49;
    int life11_51;
    long life12_75;
    java.lang.String[] life6_76;
    long life14_94;
    moom.Ee life16_116;
    java.util.Iterator life17_120;
    net.minecraft.world.gen.structure.MapGenStructure life18_127;
    int life19_135;
    moom.DT life17_320;
    int life17_370;
    lexical_join_383: {
    lexical_join_375: {
    lexical_join_373: {
    lexical_join_309: {
    lexical_join_308: {
    lexical_join_307: {
    lexical_join_306: {
    lexical_join_298: {
    lexical_join_215: {
    lexical_join_212: {
    lexical_join_211: {
    lexical_join_164: {
    lexical_join_149: {
    life4_3 = (net.minecraft.world.gen.ChunkProviderFlat.j ^ 68577344338895L);
    life7_11 = (p1 * __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_1(10238, (1609731938418534680L ^ life4_3)));
    life8_19 = (p2 * __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_2(21587, (6452070567303895729L ^ life4_3)));
    life9_26 = new moom.DT(life7_11, 0, life8_19);
    spill1754_0 = moom.FI.b();
    life10_49 = ((net.minecraft.world.World)(this.a)).a__ES(((moom.DT)(new moom.DT((life7_11 + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_5(21587, (6452070567303895729L ^ life4_3))), 0, (life8_19 + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_6(21587, (6452070567303895729L ^ life4_3)))))));
    life11_51 = 0;
    ((java.util.Random)(this.b)).setSeed(((long)(((net.minecraft.world.World)(this.a)).a__Long())));
    life12_75 = (((((java.util.Random)(this.b)).nextLong() / __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_14(20466, (9027064189304151325L ^ life4_3))) * __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_15(16156, (7532717125968948722L ^ life4_3))) + 1L);
    life6_76 = spill1754_0;
    life14_94 = (((((java.util.Random)(this.b)).nextLong() / __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_18(16156, (7532717125968948722L ^ life4_3))) * __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_19(16156, (7532717125968948722L ^ life4_3))) + 1L);
    ((java.util.Random)(this.b)).setSeed(((long)((((((long) p1) * life12_75) + (((long) p2) * life14_94)) ^ ((net.minecraft.world.World)(this.a)).a__Long()))));
    life16_116 = new moom.Ee(p1, p2);
    life17_120 = ((java.util.List)(this.e)).iterator();
    lexical_cycle_121: while (true) {
    lexical_join_147: {
    lexical_join_146: {
    if (!(((java.util.Iterator)(life17_120)).hasNext())) {
        break lexical_join_149;
    }
    life18_127 = ((net.minecraft.world.gen.structure.MapGenStructure)(((java.util.Iterator)(life17_120)).next()));
    life19_135 = ((((net.minecraft.world.gen.structure.MapGenStructure)(life18_127)).a(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.Ee)(life16_116)))) ? 1 : 0);
    spill1754_1 = ((life18_127 instanceof moom.FR) ? 1 : 0);
    if (!((life6_76 != null))) {
        lexicalValue1754_309_0 = spill1754_1;
        break lexical_join_309;
    }
    if (!((life6_76 != null))) {
        lexicalValue1754_146_0 = spill1754_1;
        break lexical_join_146;
    }
    if (!((spill1754_1 != 0))) {
        break lexical_join_147;
    }
    lexicalValue1754_146_0 = (life11_51 | life19_135);
    }
    life11_51 = lexicalValue1754_146_0;
    }
    if (!((life6_76 == null))) { continue lexical_cycle_121; }
    break lexical_cycle_121;
    }
    }
    spill1754_2 = this.h;
    if (!((life6_76 != null))) {
        lexicalValue1754_215_0 = spill1754_2;
        break lexical_join_215;
    }
    if (!((spill1754_2 != null))) {
        break lexical_join_211;
    }
    spill1754_3 = life11_51;
    if (!((life6_76 != null))) {
        lexicalValue1754_164_0 = spill1754_3;
        break lexical_join_164;
    }
    if (!((spill1754_3 == 0))) {
        break lexical_join_211;
    }
    spill1754_4 = this;
    if (!((life6_76 != null))) {
        lexicalValue1754_212_0 = spill1754_4;
        break lexical_join_212;
    }
    lexicalValue1754_164_0 = ((java.util.Random)(((net.minecraft.world.gen.ChunkProviderFlat)(spill1754_4)).b)).nextInt(((int)(4)));
    }
    if (!((lexicalValue1754_164_0 == 0))) {
        break lexical_join_211;
    }
    ((moom.Gr)(this.h)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(life9_26)).a(((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_41(21587, (6452070567303895729L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_43(8285, (6105989050335702717L ^ life4_3))))), ((int)(((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_45(9028, (2257333540441173411L ^ life4_3))))))), ((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_48(21587, (6452070567303895729L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_50(12966, (8668179641738673223L ^ life4_3)))))))));
    }
    lexicalValue1754_212_0 = this;
    }
    if (!((life6_76 != null))) {
        lexicalValue1754_308_0 = lexicalValue1754_212_0;
        break lexical_join_308;
    }
    lexicalValue1754_215_0 = ((net.minecraft.world.gen.ChunkProviderFlat)(lexicalValue1754_212_0)).i;
    }
    if (!((lexicalValue1754_215_0 != null))) {
        break lexical_join_307;
    }
    spill1754_5 = life11_51;
    if (!((life6_76 != null))) {
        lexicalValue1754_309_0 = spill1754_5;
        break lexical_join_309;
    }
    if (!((spill1754_5 == 0))) {
        break lexical_join_307;
    }
    spill1754_6 = ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_55(12966, (8668179641738673223L ^ life4_3)))));
    if (!((life6_76 != null))) {
        lexicalValue1754_309_0 = spill1754_6;
        break lexical_join_309;
    }
    if (!((spill1754_6 == 0))) {
        break lexical_join_307;
    }
    life17_320 = ((moom.DT)(life9_26)).a(((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_58(21587, (6452070567303895729L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_60(12966, (8668179641738673223L ^ life4_3))))), ((int)(((java.util.Random)(this.b)).nextInt(((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_63(23803, (2161182373942448670L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_65(12966, (8668179641738673223L ^ life4_3)))))))), ((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_68(21587, (6452070567303895729L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_70(12966, (8668179641738673223L ^ life4_3))))));
    spill1754_7 = ((moom.DT)(life17_320)).b();
    if (!((life6_76 != null))) {
        lexicalValue1754_306_0 = spill1754_7;
        break lexical_join_306;
    }
    if (!((spill1754_7 >= ((net.minecraft.world.World)(this.a)).c()))) {
        break lexical_join_298;
    }
    spill1754_8 = ((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_76(4683, (5606715582790212776L ^ life4_3)))));
    if (!((life6_76 != null))) {
        lexicalValue1754_309_0 = spill1754_8;
        break lexical_join_309;
    }
    if (!((spill1754_8 == 0))) {
        break lexical_join_307;
    }
    }
    lexicalValue1754_306_0 = ((((moom.Gr)(this.i)).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life17_320)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1754_306_0);
    }
    lexicalValue1754_308_0 = this;
    }
    lexicalValue1754_309_0 = ((((net.minecraft.world.gen.ChunkProviderFlat)(lexicalValue1754_308_0)).g) ? 1 : 0);
    }
    if (!((life6_76 != null))) {
        lexicalValue1754_375_0 = lexicalValue1754_309_0;
        break lexical_join_375;
    }
    if (!((lexicalValue1754_309_0 != 0))) {
        break lexical_join_373;
    }
    life17_370 = 0;
    lexical_cycle_314: while (true) {
    if (!((life17_370 < __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_86(12966, (8668179641738673223L ^ life4_3))))) {
        break lexical_join_373;
    }
    ((moom.Gj)(new moom.Gj())).a__Boolean(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(((moom.DT)(life9_26)).a(((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_90(21587, (6452070567303895729L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_92(12966, (8668179641738673223L ^ life4_3))))), ((int)(((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_94(24223, (664234376929333371L ^ life4_3))))))), ((int)((((java.util.Random)(this.b)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_97(21587, (6452070567303895729L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_99(12966, (8668179641738673223L ^ life4_3)))))))));
    life17_370 += 1;
    if (!((life6_76 != null))) {
        break lexical_join_383;
    }
    if (!((life6_76 == null))) { continue lexical_cycle_314; }
    break lexical_cycle_314;
    }
    }
    lexicalValue1754_375_0 = ((this.f) ? 1 : 0);
    }
    if (!((lexicalValue1754_375_0 != 0))) {
        break lexical_join_383;
    }
    ((net.minecraft.world.biome.BiomeGenBase)(life10_49)).a(((net.minecraft.world.World)(this.a)), ((java.util.Random)(this.b)), ((moom.DT)(life9_26)));
    }
    return;
}


public net.minecraft.world.chunk.Chunk a(moom.DT p0) {
return ((net.minecraft.world.gen.ChunkProviderFlat)(this)).a(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


public moom.DT a(net.minecraft.world.World p0, java.lang.String p1, moom.DT p2) {
net.minecraft.world.gen.structure.MapGenStructure lexicalValue1755_27_0;
    net.minecraft.world.gen.structure.MapGenStructure spill1755_0;
    long life4_3;
    java.lang.String[] life6_5;
    java.util.Iterator life7_13;
    net.minecraft.world.gen.structure.MapGenStructure life8_20;
    lexical_join_33: {
    life4_3 = (net.minecraft.world.gen.ChunkProviderFlat.j ^ 30130682074625L);
    life6_5 = moom.FI.b();
    if (!(((java.lang.String)("Stronghold")).equals(((java.lang.Object)(p1))))) {
        break lexical_join_33;
    }
    life7_13 = ((java.util.List)(this.e)).iterator();
    lexical_cycle_14: while (true) {
    lexical_join_31: {
    lexical_join_27: {
    if (!(((java.util.Iterator)(life7_13)).hasNext())) {
        break lexical_join_33;
    }
    life8_20 = ((net.minecraft.world.gen.structure.MapGenStructure)(((java.util.Iterator)(life7_13)).next()));
    spill1755_0 = life8_20;
    if (!((life6_5 != null))) {
        lexicalValue1755_27_0 = spill1755_0;
        break lexical_join_27;
    }
    if (!((((spill1755_0 instanceof moom.FQ) ? 1 : 0) != 0))) {
        break lexical_join_31;
    }
    lexicalValue1755_27_0 = life8_20;
    }
    return ((net.minecraft.world.gen.structure.MapGenStructure)(lexicalValue1755_27_0)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)));
    }
    if (!((life6_5 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return null;
}


public net.minecraft.world.chunk.Chunk a(int p0, int p1) {
int forestValue1176_13_0;
    net.minecraft.world.gen.ChunkProviderFlat forestValue1176_66_0;
    java.lang.String[] spill1176_0;
    net.minecraft.world.gen.ChunkProviderFlat spill1176_1;
    int spill1176_2;
    long life3_3;
    moom.Fm life6_8;
    int life7_10;
    java.lang.String[] life5_11;
    net.minecraft.block.state.IBlockState life8_23;
    int life9_30;
    int life10_41;
    java.util.Iterator life7_70;
    moom.FI life8_77;
    net.minecraft.world.chunk.Chunk life7_96;
    net.minecraft.world.biome.BiomeGenBase[] life8_126;
    byte[] life9_129;
    int life10_131;
    forest_join_149: {
    forest_join_147: {
    forest_join_86: {
    forest_join_66: {
    forest_join_65: {
    life3_3 = (net.minecraft.world.gen.ChunkProviderFlat.j ^ 69704926436646L);
    spill1176_0 = moom.FI.b();
    life6_8 = new moom.Fm();
    life7_10 = 0;
    life5_11 = spill1176_0;
    forest_cycle_12: while (true) {
    forest_join_63: {
    forest_join_62: {
    forestValue1176_13_0 = life7_10;
    forest_cycle_13: while (true) {
    if (!((forestValue1176_13_0 < (this.c).length))) {
        break forest_join_65;
    }
    spill1176_1 = this;
    if (!((life5_11 != null))) {
        forestValue1176_66_0 = spill1176_1;
        break forest_join_66;
    }
    life8_23 = (((net.minecraft.world.gen.ChunkProviderFlat)(spill1176_1)).c)[life7_10];
    if (!((life5_11 != null))) {
        break forest_join_63;
    }
    if (!((life8_23 != null))) {
        break forest_join_62;
    }
    life9_30 = 0;
    forest_cycle_30: while (true) {
    forest_join_60: {
    forest_join_59: {
    if (!((life9_30 < __sourceIntrinsic_a55be857de7c_invokedynamic1176_4(21587, (6452069216382647384L ^ life3_3))))) {
        break forest_join_62;
    }
    spill1176_2 = 0;
    if (!((life5_11 != null))) {
        forestValue1176_13_0 = spill1176_2;
        continue forest_cycle_13;
    }
    life10_41 = spill1176_2;
    forest_cycle_41: while (true) {
    if (!((life10_41 < __sourceIntrinsic_a55be857de7c_invokedynamic1176_5(21587, (6452069216382647384L ^ life3_3))))) {
        break forest_join_59;
    }
    ((moom.Fm)(life6_8)).a(((int)(life9_30)), ((int)(life7_10)), ((int)(life10_41)), ((net.minecraft.block.state.IBlockState)(life8_23)));
    life10_41 += 1;
    if (!((life5_11 != null))) {
        break forest_join_60;
    }
    if (!((life5_11 == null))) {
        continue forest_cycle_41;
    }
    break forest_cycle_41;
    }
    }
    life9_30 += 1;
    }
    if (!((life5_11 == null))) {
        continue forest_cycle_30;
    }
    break forest_cycle_30;
    }
    break forest_cycle_13;
    }
    }
    life7_10 += 1;
    }
    if (!((life5_11 == null))) {
        continue forest_cycle_12;
    }
    break forest_cycle_12;
    }
    }
    forestValue1176_66_0 = this;
    }
    life7_70 = ((java.util.List)(((net.minecraft.world.gen.ChunkProviderFlat)(forestValue1176_66_0)).e)).iterator();
    forest_cycle_69: while (true) {
    if (!(((java.util.Iterator)(life7_70)).hasNext())) {
        break forest_join_86;
    }
    life8_77 = ((moom.FI)(((java.util.Iterator)(life7_70)).next()));
    ((moom.FI)(life8_77)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.a)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_8)));
    if (!((life5_11 == null))) {
        continue forest_cycle_69;
    }
    break forest_cycle_69;
    }
    }
    life7_96 = new net.minecraft.world.chunk.Chunk(this.a, life6_8, p0, p1);
    life8_126 = ((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.a)).a__Ff())).b(((net.minecraft.world.biome.BiomeGenBase[])(null)), ((int)((p0 * __sourceIntrinsic_a55be857de7c_invokedynamic1176_17(21587, (6452069216382647384L ^ life3_3))))), ((int)((p1 * __sourceIntrinsic_a55be857de7c_invokedynamic1176_18(21587, (6452069216382647384L ^ life3_3))))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic1176_19(21587, (6452069216382647384L ^ life3_3)))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic1176_20(21587, (6452069216382647384L ^ life3_3)))));
    life9_129 = ((net.minecraft.world.chunk.Chunk)(life7_96)).a__ArrayByte();
    life10_131 = 0;
    forest_cycle_130: while (true) {
    if (!((life10_131 < (life9_129).length))) {
        break forest_join_147;
    }
    (life9_129)[life10_131] = ((byte) ((net.minecraft.world.biome.BiomeGenBase)((life8_126)[life10_131])).aB);
    life10_131 += 1;
    if (!((life5_11 != null))) {
        break forest_join_149;
    }
    if (!((life5_11 == null))) {
        continue forest_cycle_130;
    }
    break forest_cycle_130;
    }
    }
    ((net.minecraft.world.chunk.Chunk)(life7_96)).b__Void();
    }
    return life7_96;
}


public boolean a__Boolean(int p0, int p1) {
return ((1) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12689_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String() {
return "FlatLevelSource";
}


public boolean a(boolean p0, net.minecraft.util.IProgressUpdate p1) {
return ((1) != 0);
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a__Void() {
return;
}


public void a(net.minecraft.world.chunk.Chunk p0, int p1, int p2) {
java.lang.String[] spill1756_0;
    long life4_3;
    java.util.Iterator life7_8;
    java.lang.String[] life6_9;
    net.minecraft.world.gen.structure.MapGenStructure life8_16;
    lexical_join_27: {
    life4_3 = (net.minecraft.world.gen.ChunkProviderFlat.j ^ 84109097853081L);
    spill1756_0 = moom.FI.b();
    life7_8 = ((java.util.List)(this.e)).iterator();
    life6_9 = spill1756_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life7_8)).hasNext())) {
        break lexical_join_27;
    }
    life8_16 = ((net.minecraft.world.gen.structure.MapGenStructure)(((java.util.Iterator)(life7_8)).next()));
    ((net.minecraft.world.gen.structure.MapGenStructure)(life8_16)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.a)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(null)));
    if (!((life6_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


public int a() {
return 0;
}


public boolean a(moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) {
return ((0) != 0);
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) {
java.lang.Object local3 = ((net.minecraft.world.World)(this.a)).a__ES(((moom.DT)(p1)));
    return ((net.minecraft.world.biome.BiomeGenBase)(local3)).a(((net.minecraft.entity.EnumCreatureType)(p0)));
}


private static native <E extends Throwable> int __sourceIntrinsic_3b264c16ad01d606_invokedynamic581_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic1176_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic1176_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic1176_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic1176_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic1176_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic1176_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12689_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_14(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_15(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_18(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_97(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic1754_99(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12684_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
