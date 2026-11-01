package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FA implements moom.Fn {

private java.util.Random a;

private moom.FV b;

private moom.FV c;

private moom.FV d;

private moom.FW e;

public moom.FV f;

public moom.FV g;

public moom.FV h;

private net.minecraft.world.World i;

private boolean j;

private net.minecraft.world.WorldType k;

private double[] l;

private float[] m;

private moom.FD n;

private net.minecraft.block.Block o;

private double[] p;

private moom.FI q;

private moom.FQ r;

private moom.FR s;

private moom.FN t;

private moom.FP u;

private moom.FI v;

private moom.FS w;

private net.minecraft.world.biome.BiomeGenBase[] x;

double[] y;

double[] z;

double[] A;

double[] B;

private static long C;

private static long[] D;

private static java.lang.Integer[] E;

private static java.util.Map F;

private static long[] G;

private static java.lang.Long[] H;

private static java.util.Map I;

public FA(net.minecraft.world.World p0, long p1, boolean p2, java.lang.String p3) { super(); }


private static void __sourceConstructorBody_a78fc628ffdf5a3d(moom.FA receiver, net.minecraft.world.World p0, long p1, boolean p2, java.lang.String p3) throws Throwable {

moom.FA __initValue483_236_0;

    moom.FA __initValue483_237_0;

    moom.dN __initValue483_237_1;

    init_join_243: {

    init_join_237: {

    init_join_236: {

    init_join_222: {

    long local6_life2 = (moom.FA.C ^ 86717185178831L);

    moom.FA.__sourceConstructorInit_a78fc628ffdf5a3d_0(((moom.FA)(receiver)));

    ((moom.FA)(receiver)).o = ((net.minecraft.block.Block)(net.minecraft.init.Blocks.j));

    ((moom.FA)(receiver)).p = ((double[])(new double[__sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_7(32763, (6566402365768860659L ^ local6_life2))]));

    ((moom.FA)(receiver)).q = ((moom.FI)(new moom.FJ()));

    ((moom.FA)(receiver)).r = ((moom.FQ)(new moom.FQ()));

    ((moom.FA)(receiver)).s = ((moom.FR)(new moom.FR()));

    ((moom.FA)(receiver)).t = ((moom.FN)(new moom.FN()));

    ((moom.FA)(receiver)).u = ((moom.FP)(new moom.FP()));

    ((moom.FA)(receiver)).v = ((moom.FI)(new moom.FL()));

    ((moom.FA)(receiver)).w = ((moom.FS)(new moom.FS()));

    ((moom.FA)(receiver)).i = ((net.minecraft.world.World)(p0));

    ((moom.FA)(receiver)).j = ((boolean)(p2));

    java.lang.String[] __sourceSpill483_22 = moom.FI.b();

    ((moom.FA)(receiver)).k = ((net.minecraft.world.WorldType)(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p0)).a__IX())).a__EL()));

    ((moom.FA)(receiver)).a = ((java.util.Random)(new java.util.Random(p1)));

    java.lang.String[] local8_life24 = __sourceSpill483_22;

    ((moom.FA)(receiver)).b = ((moom.FV)(new moom.FV(((moom.FA)(receiver)).a, __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_27(21646, (7370453770859784339L ^ local6_life2)))));

    ((moom.FA)(receiver)).c = ((moom.FV)(new moom.FV(((moom.FA)(receiver)).a, __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_31(1191, (336041226266966195L ^ local6_life2)))));

    ((moom.FA)(receiver)).d = ((moom.FV)(new moom.FV(((moom.FA)(receiver)).a, __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_35(3827, (2307795639550112495L ^ local6_life2)))));

    ((moom.FA)(receiver)).e = ((moom.FW)(new moom.FW(((moom.FA)(receiver)).a, 4)));

    ((moom.FA)(receiver)).f = ((moom.FV)(new moom.FV(((moom.FA)(receiver)).a, __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_41(20596, (4998581025946971246L ^ local6_life2)))));

    ((moom.FA)(receiver)).g = ((moom.FV)(new moom.FV(((moom.FA)(receiver)).a, __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_45(1191, (336041226266966195L ^ local6_life2)))));

    ((moom.FA)(receiver)).h = ((moom.FV)(new moom.FV(((moom.FA)(receiver)).a, __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_49(8752, (3995735514789568038L ^ local6_life2)))));

    ((moom.FA)(receiver)).l = ((double[])(new double[__sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_52(11727, (8111666334705045978L ^ local6_life2))]));

    ((moom.FA)(receiver)).m = ((float[])(new float[__sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_55(27221, (8163661988505818695L ^ local6_life2))]));

    int local9_life59 = __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_58(31416, (3372593449255536297L ^ local6_life2));

    init_cycle_173: while (true) {

    init_join_220: {

    init_join_219: {

    if (!((local9_life59 <= 2))) {

        break init_join_222;

    }

    if (!((local8_life24 != null))) {

        break init_join_243;

    }

    int local10_life62 = __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_61(27008, (7241325778486433161L ^ local6_life2));

    init_cycle_184: while (true) {

    if (!((local10_life62 <= 2))) {

        break init_join_219;

    }

    float local11_life66 = (1092616192 / moom.Dr.c(((float)((((float) ((local9_life59 * local9_life59) + (local10_life62 * local10_life62))) + 1045220557)))));

    (((moom.FA)(receiver)).m)[((local9_life59 + 2) + ((local10_life62 + 2) * 5))] = local11_life66;

    local10_life62 += 1;

    if (!((local8_life24 != null))) {

        break init_join_220;

    }

    if (!((local8_life24 == null))) { continue init_cycle_184; }

    break init_cycle_184;

    }

    }

    local9_life59 += 1;

    }

    if (!((local8_life24 == null))) { continue init_cycle_173; }

    break init_cycle_173;

    }

    }

    if (!((p3 != null))) {

        break init_join_243;

    }

    ((moom.FA)(receiver)).n = ((moom.FD)(((moom.FE)(moom.FE.a(((java.lang.String)(p3))))).a()));

    moom.FA __sourceSpill483_73 = receiver;

    if (!(((moom.FD)(((moom.FA)(receiver)).n)).E)) {

        __initValue483_236_0 = __sourceSpill483_73;

        break init_join_236;

    }

    __initValue483_237_0 = __sourceSpill483_73;

    __initValue483_237_1 = net.minecraft.init.Blocks.l;

    break init_join_237;

    }

    __initValue483_237_0 = __initValue483_236_0;

    __initValue483_237_1 = net.minecraft.init.Blocks.j;

    }

    ((moom.FA)(__initValue483_237_0)).o = ((net.minecraft.block.Block)(__initValue483_237_1));

    ((net.minecraft.world.World)(p0)).a__Void(((int)(((moom.FD)(((moom.FA)(receiver)).n)).q)));

    }

    return;

}



static {
C = ((long)(((moom._a)(moom._c.a(((long)(2110392759314478064L)), ((long)(5339599081419806700L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(107796123084064L)))));

    F = ((java.util.Map)(new java.util.HashMap(13)));

    long local11_life7 = (moom.FA.C ^ 52640360764600L);

    javax.crypto.Cipher local13_life9;

    javax.crypto.Cipher __sourceSpill646_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill646_12 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill646_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill646_14 = new byte[8];

    (__sourceSpill646_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local14_life15 = 1;

    while ((local14_life15 < 8)) {

        (__sourceSpill646_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));

        local14_life15 += 1;

    }

    byte[] __sourcePreallocation646_16 = __sourceSpill646_14;

    ((javax.crypto.Cipher)(__sourceSpill646_11)).init(((int)(__sourceSpill646_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill646_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation646_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local19_life19 = new long[18];

    int local16_life20 = 0;

    java.lang.String local17_life21;

    int local18_life23 = ((java.lang.String)((local17_life21 = "\n\002P¹óôÿÞgeS/àêá\026\031îÄ¾mÆÃ\030ê$\001å(íô·Eâ1\000\023!J/áBûeí\033²õQ¼Êu°{ko¼x+fQÖLd~\033*OåqA´8zÜ«r;×\013ØÇÁ\024¿®Üliäÿ\033Ù\032ò{^É\013³·Yè\024Y~ÆaHY>#_Vñv"))).length();

    int local15_life24 = 0;

    do {

        java.lang.String __sourceSpill646_25 = local17_life21;

        int __sourceSpill646_26 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill646_25)).substring(((int)(__sourceSpill646_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill646_30 = local19_life19;

        int __sourceSpill646_31 = local16_life20;

        local16_life20 += 1;

        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));

        byte[] __sourceSpill646_33 = new byte[8];

        (__sourceSpill646_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));

        (__sourceSpill646_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));

        (__sourceSpill646_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));

        (__sourceSpill646_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));

        (__sourceSpill646_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));

        (__sourceSpill646_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));

        (__sourceSpill646_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));

        (__sourceSpill646_33)[7] = ((byte) ((int) local21_life32));

        javax.crypto.Cipher __sourceSpill646_34 = local13_life9;

        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill646_34)).doFinal(((byte[])(__sourceSpill646_33)));

        (__sourceSpill646_30)[__sourceSpill646_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    local18_life23 = ((java.lang.String)((local17_life21 = "Ù©OÛËªú}dXv\035H1´\003"))).length();

    local15_life24 = 0;

    do {

        java.lang.String __sourceSpill646_38 = local17_life21;

        int __sourceSpill646_39 = local15_life24;

        local15_life24 += 8;

        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill646_38)).substring(((int)(__sourceSpill646_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill646_43 = local19_life19;

        int __sourceSpill646_44 = local16_life20;

        local16_life20 += 1;

        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));

        byte[] __sourceSpill646_46 = new byte[8];

        (__sourceSpill646_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));

        (__sourceSpill646_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));

        (__sourceSpill646_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));

        (__sourceSpill646_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));

        (__sourceSpill646_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));

        (__sourceSpill646_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));

        (__sourceSpill646_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));

        (__sourceSpill646_46)[7] = ((byte) ((int) local21_life45));

        javax.crypto.Cipher __sourceSpill646_47 = local13_life9;

        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill646_47)).doFinal(((byte[])(__sourceSpill646_46)));

        (__sourceSpill646_43)[__sourceSpill646_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));

    } while ((!(local15_life24 >= local18_life23)));

    D = ((long[])(local19_life19));

    E = ((java.lang.Integer[])(new java.lang.Integer[18]));

    I = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life54;

    javax.crypto.Cipher __sourceSpill646_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill646_57 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill646_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill646_59 = new byte[8];

    (__sourceSpill646_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));

    int local1_life60 = 1;

    while ((local1_life60 < 8)) {

        (__sourceSpill646_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));

        local1_life60 += 1;

    }

    byte[] __sourcePreallocation646_61 = __sourceSpill646_59;

    ((javax.crypto.Cipher)(__sourceSpill646_56)).init(((int)(__sourceSpill646_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill646_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation646_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local6_life64 = new long[5];

    int local3_life65 = 0;

    java.lang.String local4_life66;

    int local5_life68 = ((java.lang.String)((local4_life66 = "Õ\bÍw\034Úk(ô\017÷ m\0011ü \016M`T®"))).length();

    int local2_life69 = 0;

    do {

        java.lang.String __sourceSpill646_70 = local4_life66;

        int __sourceSpill646_71 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill646_70)).substring(((int)(__sourceSpill646_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill646_75 = local6_life64;

        int __sourceSpill646_76 = local3_life65;

        local3_life65 += 1;

        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));

        byte[] __sourceSpill646_78 = new byte[8];

        (__sourceSpill646_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));

        (__sourceSpill646_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));

        (__sourceSpill646_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));

        (__sourceSpill646_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));

        (__sourceSpill646_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));

        (__sourceSpill646_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));

        (__sourceSpill646_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));

        (__sourceSpill646_78)[7] = ((byte) ((int) local8_life77));

        javax.crypto.Cipher __sourceSpill646_79 = local0_life54;

        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill646_79)).doFinal(((byte[])(__sourceSpill646_78)));

        (__sourceSpill646_75)[__sourceSpill646_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    local5_life68 = ((java.lang.String)((local4_life66 = "\030×ð9ðel!^4ï°6"))).length();

    local2_life69 = 0;

    do {

        java.lang.String __sourceSpill646_83 = local4_life66;

        int __sourceSpill646_84 = local2_life69;

        local2_life69 += 8;

        byte[] local7_life87 = ((java.lang.String)(((java.lang.String)(__sourceSpill646_83)).substring(((int)(__sourceSpill646_84)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill646_88 = local6_life64;

        int __sourceSpill646_89 = local3_life65;

        local3_life65 += 1;

        long local8_life90 = (((((((((((long) (local7_life87)[0]) & 255L) << 56) | ((((long) (local7_life87)[1]) & 255L) << 48)) | ((((long) (local7_life87)[2]) & 255L) << 40)) | ((((long) (local7_life87)[3]) & 255L) << 32)) | ((((long) (local7_life87)[4]) & 255L) << 24)) | ((((long) (local7_life87)[5]) & 255L) << 16)) | ((((long) (local7_life87)[6]) & 255L) << 8)) | (((long) (local7_life87)[7]) & 255L));

        byte[] __sourceSpill646_91 = new byte[8];

        (__sourceSpill646_91)[0] = ((byte) ((int) (local8_life90 >>> 56)));

        (__sourceSpill646_91)[1] = ((byte) ((int) (local8_life90 >>> 48)));

        (__sourceSpill646_91)[2] = ((byte) ((int) (local8_life90 >>> 40)));

        (__sourceSpill646_91)[3] = ((byte) ((int) (local8_life90 >>> 32)));

        (__sourceSpill646_91)[4] = ((byte) ((int) (local8_life90 >>> 24)));

        (__sourceSpill646_91)[5] = ((byte) ((int) (local8_life90 >>> 16)));

        (__sourceSpill646_91)[6] = ((byte) ((int) (local8_life90 >>> 8)));

        (__sourceSpill646_91)[7] = ((byte) ((int) local8_life90));

        javax.crypto.Cipher __sourceSpill646_92 = local0_life54;

        byte[] local10_life94 = ((javax.crypto.Cipher)(__sourceSpill646_92)).doFinal(((byte[])(__sourceSpill646_91)));

        (__sourceSpill646_88)[__sourceSpill646_89] = (((((((((((long) (local10_life94)[0]) & 255L) << 56) | ((((long) (local10_life94)[1]) & 255L) << 48)) | ((((long) (local10_life94)[2]) & 255L) << 40)) | ((((long) (local10_life94)[3]) & 255L) << 32)) | ((((long) (local10_life94)[4]) & 255L) << 24)) | ((((long) (local10_life94)[5]) & 255L) << 16)) | ((((long) (local10_life94)[6]) & 255L) << 8)) | (((long) (local10_life94)[7]) & 255L));

    } while ((!(local2_life69 >= local5_life68)));

    G = ((long[])(local6_life64));

    H = ((java.lang.Long[])(new java.lang.Long[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a78fc628ffdf5a3d_0(moom.FA a0) throws E;

public boolean b__Boolean() {
return ((1) != 0);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4454_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.FA.b(((int)(local4)), ((long)(local5)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7008);
    if (((moom.FA.H)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.FA.G)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.FA.I)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.FA.I)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/FA", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.FA.H)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.FA.H)[life3_8])).longValue();
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x438D;
        if (E[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = D[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])F.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    F.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/FA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            FA.E[n2] = n3;
        }
        return E[n2];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.world.chunk.Chunk a(int p0, int p1) {
int lexicalValue628_92_0;
    int lexicalValue628_107_0;
    int lexicalValue628_127_0;
    int lexicalValue628_147_0;
    int lexicalValue628_167_0;
    int lexicalValue628_187_0;
    int lexicalValue628_194_0;
    moom.FA lexicalValue628_196_0;
    java.lang.String[] spill628_0;
    boolean spill628_1;
    boolean spill628_2;
    boolean spill628_3;
    boolean spill628_4;
    boolean spill628_5;
    moom.FA spill628_6;
    long life3_3;
    moom.Fm life6_28;
    java.lang.String[] life5_66;
    net.minecraft.world.chunk.Chunk life7_281;
    byte[] life8_284;
    int life9_286;
    lexical_join_238: {
    lexical_join_236: {
    lexical_join_204: {
    lexical_join_196: {
    lexical_join_194: {
    lexical_join_187: {
    lexical_join_184: {
    lexical_join_167: {
    lexical_join_164: {
    lexical_join_147: {
    lexical_join_144: {
    lexical_join_127: {
    lexical_join_124: {
    lexical_join_107: {
    lexical_join_104: {
    lexical_join_92: {
    lexical_join_89: {
    life3_3 = (moom.FA.C ^ 72453909216795L);
    ((java.util.Random)(this.a)).setSeed(((long)(((((long) p0) * __sourceIntrinsic_a55be857de7c_invokedynamic628_2(17520, (2056285577618039381L ^ life3_3))) + (((long) p1) * __sourceIntrinsic_a55be857de7c_invokedynamic628_3(32099, (8403708817018657602L ^ life3_3)))))));
    spill628_0 = moom.FI.b();
    life6_28 = new moom.Fm();
    ((moom.FA)(this)).a(((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    this.x = ((net.minecraft.world.biome.BiomeGenBase[])(((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.i)).a__Ff())).b(((net.minecraft.world.biome.BiomeGenBase[])(this.x)), ((int)((p0 * __sourceIntrinsic_a55be857de7c_invokedynamic628_10(1191, (336033345362639463L ^ life3_3))))), ((int)((p1 * __sourceIntrinsic_a55be857de7c_invokedynamic628_11(1191, (336033345362639463L ^ life3_3))))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic628_12(1191, (336033345362639463L ^ life3_3)))), ((int)(__sourceIntrinsic_a55be857de7c_invokedynamic628_13(1191, (336033345362639463L ^ life3_3)))))));
    life5_66 = spill628_0;
    ((moom.FA)(this)).a(((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)), ((net.minecraft.world.biome.BiomeGenBase[])(this.x)));
    spill628_1 = ((moom.FD)(this.n)).r;
    if (!((life5_66 != null))) {
        lexicalValue628_92_0 = ((spill628_1) ? 1 : 0);
        break lexical_join_92;
    }
    if (!(spill628_1)) {
        break lexical_join_89;
    }
    ((moom.FI)(this.q)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    }
    lexicalValue628_92_0 = ((((moom.FD)(this.n)).z) ? 1 : 0);
    }
    if (!((life5_66 != null))) {
        lexicalValue628_107_0 = lexicalValue628_92_0;
        break lexical_join_107;
    }
    if (!((lexicalValue628_92_0 != 0))) {
        break lexical_join_104;
    }
    ((moom.FI)(this.v)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    }
    lexicalValue628_107_0 = ((((moom.FD)(this.n)).w) ? 1 : 0);
    }
    if (!((life5_66 != null))) {
        lexicalValue628_127_0 = lexicalValue628_107_0;
        break lexical_join_127;
    }
    if (!((lexicalValue628_107_0 != 0))) {
        break lexical_join_124;
    }
    spill628_2 = this.j;
    if (!((life5_66 != null))) {
        lexicalValue628_127_0 = ((spill628_2) ? 1 : 0);
        break lexical_join_127;
    }
    if (!(spill628_2)) {
        break lexical_join_124;
    }
    ((moom.FN)(this.t)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    }
    lexicalValue628_127_0 = ((((moom.FD)(this.n)).v) ? 1 : 0);
    }
    if (!((life5_66 != null))) {
        lexicalValue628_147_0 = lexicalValue628_127_0;
        break lexical_join_147;
    }
    if (!((lexicalValue628_127_0 != 0))) {
        break lexical_join_144;
    }
    spill628_3 = this.j;
    if (!((life5_66 != null))) {
        lexicalValue628_147_0 = ((spill628_3) ? 1 : 0);
        break lexical_join_147;
    }
    if (!(spill628_3)) {
        break lexical_join_144;
    }
    ((moom.FR)(this.s)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    }
    lexicalValue628_147_0 = ((((moom.FD)(this.n)).u) ? 1 : 0);
    }
    if (!((life5_66 != null))) {
        lexicalValue628_167_0 = lexicalValue628_147_0;
        break lexical_join_167;
    }
    if (!((lexicalValue628_147_0 != 0))) {
        break lexical_join_164;
    }
    spill628_4 = this.j;
    if (!((life5_66 != null))) {
        lexicalValue628_167_0 = ((spill628_4) ? 1 : 0);
        break lexical_join_167;
    }
    if (!(spill628_4)) {
        break lexical_join_164;
    }
    ((moom.FQ)(this.r)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    }
    lexicalValue628_167_0 = ((((moom.FD)(this.n)).x) ? 1 : 0);
    }
    if (!((life5_66 != null))) {
        lexicalValue628_187_0 = lexicalValue628_167_0;
        break lexical_join_187;
    }
    if (!((lexicalValue628_167_0 != 0))) {
        break lexical_join_184;
    }
    spill628_5 = this.j;
    if (!((life5_66 != null))) {
        lexicalValue628_187_0 = ((spill628_5) ? 1 : 0);
        break lexical_join_187;
    }
    if (!(spill628_5)) {
        break lexical_join_184;
    }
    ((moom.FP)(this.u)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    }
    lexicalValue628_187_0 = ((((moom.FD)(this.n)).y) ? 1 : 0);
    }
    if (!((life5_66 != null))) {
        lexicalValue628_194_0 = lexicalValue628_187_0;
        break lexical_join_194;
    }
    if (!((lexicalValue628_187_0 != 0))) {
        break lexical_join_204;
    }
    spill628_6 = this;
    if (!((life5_66 != null))) {
        lexicalValue628_196_0 = spill628_6;
        break lexical_join_196;
    }
    lexicalValue628_194_0 = ((((moom.FA)(spill628_6)).j) ? 1 : 0);
    }
    if (!((lexicalValue628_194_0 != 0))) {
        break lexical_join_204;
    }
    lexicalValue628_196_0 = this;
    }
    ((moom.FS)(((moom.FA)(lexicalValue628_196_0)).w)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p0)), ((int)(p1)), ((moom.Fm)(life6_28)));
    }
    life7_281 = new net.minecraft.world.chunk.Chunk(this.i, life6_28, p0, p1);
    life8_284 = ((net.minecraft.world.chunk.Chunk)(life7_281)).a__ArrayByte();
    life9_286 = 0;
    lexical_cycle_218: while (true) {
    if (!((life9_286 < (life8_284).length))) {
        break lexical_join_236;
    }
    (life8_284)[life9_286] = ((byte) ((net.minecraft.world.biome.BiomeGenBase)((this.x)[life9_286])).aB);
    life9_286 += 1;
    if (!((life5_66 != null))) {
        break lexical_join_238;
    }
    if (!((life5_66 == null))) { continue lexical_cycle_218; }
    break lexical_cycle_218;
    }
    }
    ((net.minecraft.world.chunk.Chunk)(life7_281)).b__Void();
    }
    return life7_281;
}


public net.minecraft.world.chunk.Chunk a(moom.DT p0) {
return ((moom.FA)(this)).a(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


public void a(net.minecraft.world.chunk.Chunk p0, int p1, int p2) {
int forwardValue1899_29_0;
    int forwardValue1899_49_0;
    int forwardValue1899_69_0;
    int forwardValue1899_89_0;
    int forwardValue1899_96_0;
    moom.FA forwardValue1899_98_0;
    boolean spill1899_0;
    boolean spill1899_1;
    boolean spill1899_2;
    boolean spill1899_3;
    boolean spill1899_4;
    moom.FA spill1899_5;
    long life4_3;
    java.lang.String[] life6_5;
    forward_join_106: {
    forward_join_98: {
    forward_join_96: {
    forward_join_89: {
    forward_join_86: {
    forward_join_69: {
    forward_join_66: {
    forward_join_49: {
    forward_join_46: {
    forward_join_29: {
    forward_join_26: {
    life4_3 = (moom.FA.C ^ 56071335052196L);
    life6_5 = moom.FI.b();
    spill1899_0 = ((moom.FD)(this.n)).w;
    if (!((life6_5 != null))) {
        forwardValue1899_29_0 = ((spill1899_0) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill1899_0)) {
        break forward_join_26;
    }
    spill1899_1 = this.j;
    if (!((life6_5 != null))) {
        forwardValue1899_29_0 = ((spill1899_1) ? 1 : 0);
        break forward_join_29;
    }
    if (!(spill1899_1)) {
        break forward_join_26;
    }
    ((moom.FN)(this.t)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(null)));
    }
    forwardValue1899_29_0 = ((((moom.FD)(this.n)).v) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue1899_49_0 = forwardValue1899_29_0;
        break forward_join_49;
    }
    if (!((forwardValue1899_29_0 != 0))) {
        break forward_join_46;
    }
    spill1899_2 = this.j;
    if (!((life6_5 != null))) {
        forwardValue1899_49_0 = ((spill1899_2) ? 1 : 0);
        break forward_join_49;
    }
    if (!(spill1899_2)) {
        break forward_join_46;
    }
    ((moom.FR)(this.s)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(null)));
    }
    forwardValue1899_49_0 = ((((moom.FD)(this.n)).u) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue1899_69_0 = forwardValue1899_49_0;
        break forward_join_69;
    }
    if (!((forwardValue1899_49_0 != 0))) {
        break forward_join_66;
    }
    spill1899_3 = this.j;
    if (!((life6_5 != null))) {
        forwardValue1899_69_0 = ((spill1899_3) ? 1 : 0);
        break forward_join_69;
    }
    if (!(spill1899_3)) {
        break forward_join_66;
    }
    ((moom.FQ)(this.r)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(null)));
    }
    forwardValue1899_69_0 = ((((moom.FD)(this.n)).x) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue1899_89_0 = forwardValue1899_69_0;
        break forward_join_89;
    }
    if (!((forwardValue1899_69_0 != 0))) {
        break forward_join_86;
    }
    spill1899_4 = this.j;
    if (!((life6_5 != null))) {
        forwardValue1899_89_0 = ((spill1899_4) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill1899_4)) {
        break forward_join_86;
    }
    ((moom.FP)(this.u)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(null)));
    }
    forwardValue1899_89_0 = ((((moom.FD)(this.n)).y) ? 1 : 0);
    }
    if (!((life6_5 != null))) {
        forwardValue1899_96_0 = forwardValue1899_89_0;
        break forward_join_96;
    }
    if (!((forwardValue1899_89_0 != 0))) {
        break forward_join_106;
    }
    spill1899_5 = this;
    if (!((life6_5 != null))) {
        forwardValue1899_98_0 = spill1899_5;
        break forward_join_98;
    }
    forwardValue1899_96_0 = ((((moom.FA)(spill1899_5)).j) ? 1 : 0);
    }
    if (!((forwardValue1899_96_0 != 0))) {
        break forward_join_106;
    }
    forwardValue1899_98_0 = this;
    }
    ((moom.FS)(((moom.FA)(forwardValue1899_98_0)).w)).a(((moom.Fn)(this)), ((net.minecraft.world.World)(this.i)), ((int)(p1)), ((int)(p2)), ((moom.Fm)(null)));
    }
    return;
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) {
moom.FP forwardValue1897_28_0;
    net.minecraft.entity.EnumCreatureType forwardValue1897_32_0;
    net.minecraft.entity.EnumCreatureType forwardValue1897_32_1;
    int forwardValue1897_47_0;
    moom.FS forwardValue1897_50_0;
    java.lang.String[] spill1897_0;
    net.minecraft.entity.EnumCreatureType spill1897_1;
    net.minecraft.entity.EnumCreatureType spill1897_2;
    moom.FP spill1897_3;
    boolean spill1897_4;
    moom.FS spill1897_5;
    long life3_3;
    net.minecraft.world.biome.BiomeGenBase life6_9;
    java.lang.String[] life5_10;
    forward_join_52: {
    forward_join_50: {
    forward_join_47: {
    forward_join_32: {
    forward_join_30: {
    forward_join_28: {
    life3_3 = (moom.FA.C ^ 51001128938138L);
    spill1897_0 = moom.FI.b();
    life6_9 = ((net.minecraft.world.World)(this.i)).a__ES(((moom.DT)(p1)));
    life5_10 = spill1897_0;
    if (!(this.j)) {
        break forward_join_52;
    }
    spill1897_1 = p0;
    spill1897_2 = net.minecraft.entity.EnumCreatureType.MONSTER;
    if (!((life5_10 != null))) {
        forwardValue1897_32_0 = spill1897_1;
        forwardValue1897_32_1 = spill1897_2;
        break forward_join_32;
    }
    if (!((spill1897_1 == spill1897_2))) {
        break forward_join_30;
    }
    spill1897_3 = this.u;
    if (!((life5_10 != null))) {
        forwardValue1897_28_0 = spill1897_3;
        break forward_join_28;
    }
    if (!(((moom.FP)(spill1897_3)).b(((moom.DT)(p1))))) {
        break forward_join_30;
    }
    forwardValue1897_28_0 = this.u;
    }
    return ((moom.FP)(forwardValue1897_28_0)).b__sourceReturn_3f0615080b();
    }
    forwardValue1897_32_0 = p0;
    forwardValue1897_32_1 = net.minecraft.entity.EnumCreatureType.MONSTER;
    }
    if (!((forwardValue1897_32_0 == forwardValue1897_32_1))) {
        break forward_join_52;
    }
    spill1897_4 = ((moom.FD)(this.n)).y;
    if (!((life5_10 != null))) {
        forwardValue1897_47_0 = ((spill1897_4) ? 1 : 0);
        break forward_join_47;
    }
    if (!(spill1897_4)) {
        break forward_join_52;
    }
    spill1897_5 = this.w;
    if (!((life5_10 != null))) {
        forwardValue1897_50_0 = spill1897_5;
        break forward_join_50;
    }
    forwardValue1897_47_0 = ((((moom.FS)(spill1897_5)).a__Boolean(((net.minecraft.world.World)(this.i)), ((moom.DT)(p1)))) ? 1 : 0);
    }
    if (!((forwardValue1897_47_0 != 0))) {
        break forward_join_52;
    }
    forwardValue1897_50_0 = this.w;
    }
    return ((moom.FS)(forwardValue1897_50_0)).b__sourceReturn_3f0615080b();
    }
    return ((net.minecraft.world.biome.BiomeGenBase)(life6_9)).a(((net.minecraft.entity.EnumCreatureType)(p0)));
}


public void a(int p0, int p1, moom.Fm p2) {
int forestValue100082_46_0;
    int forestValue100082_61_0;
    int forestValue100082_112_0;
    int forestValue100082_205_0;
    int forestValue100082_234_0;
    int forestValue100082_301_0;
    java.lang.String[] spill100082_0;
    int spill100082_1;
    int spill100082_2;
    int spill100082_3;
    int spill100082_4;
    double spill100082_5;
    int spill100082_6;
    long life4_3;
    java.lang.String[] life6_42;
    int life7_44;
    int life8_51;
    int life9_57;
    int life10_59;
    int life11_72;
    int life12_84;
    int life13_94;
    int life14_106;
    int life15_110;
    double life16_119;
    double life18_126;
    double life20_133;
    double life22_140;
    double life24_147;
    double life26_160;
    double life28_173;
    double life30_186;
    double life32_199;
    int life34_203;
    double life35_212;
    double life37_214;
    double life39_216;
    double life41_222;
    double life43_228;
    int life45_232;
    double life46_237;
    double life48_243;
    double life50_247;
    int life52_251;
    forest_join_371: {
    life4_3 = (moom.FA.C ^ 65674683660361L);
    this.x = ((net.minecraft.world.biome.BiomeGenBase[])(((net.minecraft.world.biome.WorldChunkManager)(((net.minecraft.world.World)(this.i)).a__Ff())).a(((net.minecraft.world.biome.BiomeGenBase[])(this.x)), ((int)(((p0 * 4) - 2))), ((int)(((p1 * 4) - 2))), ((int)(__sourceIntrinsic_273b4708c739_invokedynamic100082_4(16221, (7894068733842343877L ^ life4_3)))), ((int)(__sourceIntrinsic_273b4708c739_invokedynamic100082_5(16221, (7894068733842343877L ^ life4_3)))))));
    spill100082_0 = moom.FI.b();
    ((moom.FA)(this)).a(((int)((p0 * 4))), ((int)(0)), ((int)((p1 * 4))));
    life6_42 = spill100082_0;
    life7_44 = 0;
    forest_cycle_45: while (true) {
    forest_join_368: {
    forestValue100082_46_0 = life7_44;
    forest_cycle_46: while (true) {
    if (!((forestValue100082_46_0 < 4))) {
        break forest_join_371;
    }
    life8_51 = (life7_44 * 5);
    life9_57 = ((life7_44 + 1) * 5);
    life10_59 = 0;
    forest_cycle_60: while (true) {
    forest_join_365: {
    forestValue100082_61_0 = life10_59;
    forest_cycle_61: while (true) {
    if (!((forestValue100082_61_0 < 4))) {
        break forest_join_368;
    }
    life11_72 = ((life8_51 + life10_59) * __sourceIntrinsic_273b4708c739_invokedynamic100082_10(27758, (3756091216552039672L ^ life4_3)));
    life12_84 = (((life8_51 + life10_59) + 1) * __sourceIntrinsic_273b4708c739_invokedynamic100082_11(27758, (3756091216552039672L ^ life4_3)));
    life13_94 = ((life9_57 + life10_59) * __sourceIntrinsic_273b4708c739_invokedynamic100082_12(27758, (3756091216552039672L ^ life4_3)));
    life14_106 = (((life9_57 + life10_59) + 1) * __sourceIntrinsic_273b4708c739_invokedynamic100082_13(27758, (3756091216552039672L ^ life4_3)));
    spill100082_1 = 0;
    if (!((life6_42 != null))) {
        forestValue100082_46_0 = spill100082_1;
        continue forest_cycle_46;
    }
    life15_110 = spill100082_1;
    forest_cycle_111: while (true) {
    forest_join_362: {
    forestValue100082_112_0 = life15_110;
    forest_cycle_112: while (true) {
    if (!((forestValue100082_112_0 < __sourceIntrinsic_273b4708c739_invokedynamic100082_14(15137, (6424172154918716340L ^ life4_3))))) {
        break forest_join_365;
    }
    life16_119 = 0x1.0p-3d;
    life18_126 = (this.l)[(life11_72 + life15_110)];
    life20_133 = (this.l)[(life12_84 + life15_110)];
    life22_140 = (this.l)[(life13_94 + life15_110)];
    life24_147 = (this.l)[(life14_106 + life15_110)];
    life26_160 = (((this.l)[((life11_72 + life15_110) + 1)] - life18_126) * life16_119);
    life28_173 = (((this.l)[((life12_84 + life15_110) + 1)] - life20_133) * life16_119);
    life30_186 = (((this.l)[((life13_94 + life15_110) + 1)] - life22_140) * life16_119);
    life32_199 = (((this.l)[((life14_106 + life15_110) + 1)] - life24_147) * life16_119);
    spill100082_2 = 0;
    if (!((life6_42 != null))) {
        forestValue100082_61_0 = spill100082_2;
        continue forest_cycle_61;
    }
    life34_203 = spill100082_2;
    forest_cycle_204: while (true) {
    forest_join_343: {
    forestValue100082_205_0 = life34_203;
    forest_cycle_205: while (true) {
    if (!((forestValue100082_205_0 < __sourceIntrinsic_273b4708c739_invokedynamic100082_23(8752, (3995749649272396448L ^ life4_3))))) {
        break forest_join_362;
    }
    life35_212 = 0x1.0p-2d;
    life37_214 = life18_126;
    life39_216 = life20_133;
    life41_222 = ((life22_140 - life18_126) * life35_212);
    life43_228 = ((life24_147 - life20_133) * life35_212);
    spill100082_3 = 0;
    if (!((life6_42 != null))) {
        forestValue100082_112_0 = spill100082_3;
        continue forest_cycle_112;
    }
    life45_232 = spill100082_3;
    forest_cycle_233: while (true) {
    forest_join_332: {
    forestValue100082_234_0 = life45_232;
    forest_cycle_234: while (true) {
    if (!((forestValue100082_234_0 < 4))) {
        break forest_join_343;
    }
    life46_237 = 0x1.0p-2d;
    life48_243 = ((life39_216 - life37_214) * life46_237);
    life50_247 = (life37_214 - life48_243);
    spill100082_4 = 0;
    if (!((life6_42 != null))) {
        forestValue100082_205_0 = spill100082_4;
        continue forest_cycle_205;
    }
    life52_251 = spill100082_4;
    forest_cycle_252: while (true) {
    forest_join_329: {
    forest_join_301: {
    forest_join_292: {
    if (!((life52_251 < 4))) {
        break forest_join_332;
    }
    double __stackOp100082_24_0 = (life50_247 + life48_243);
    spill100082_5 = __stackOp100082_24_0;
    life50_247 = __stackOp100082_24_0;
    spill100082_6 = recovery.source.CarrierOps.dcmpl(((double)(spill100082_5)), ((double)(0x0.0p0d)));
    if (!((life6_42 != null))) {
        forestValue100082_234_0 = spill100082_6;
        continue forest_cycle_234;
    }
    if (!((life6_42 != null))) {
        forestValue100082_301_0 = spill100082_6;
        break forest_join_301;
    }
    if (!((spill100082_6 > 0))) {
        break forest_join_292;
    }
    ((moom.Fm)(p2)).a(((int)(((life7_44 * 4) + life45_232))), ((int)(((life15_110 * __sourceIntrinsic_273b4708c739_invokedynamic100082_26(8752, (3995749649272396448L ^ life4_3))) + life34_203))), ((int)(((life10_59 * 4) + life52_251))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.b)).a__fE())));
    if (!((life6_42 == null))) {
        break forest_join_329;
    }
    }
    forestValue100082_301_0 = ((life15_110 * __sourceIntrinsic_273b4708c739_invokedynamic100082_30(8752, (3995749649272396448L ^ life4_3))) + life34_203);
    }
    if (!((forestValue100082_301_0 < ((moom.FD)(this.n)).q))) {
        break forest_join_329;
    }
    ((moom.Fm)(p2)).a(((int)(((life7_44 * 4) + life45_232))), ((int)(((life15_110 * __sourceIntrinsic_273b4708c739_invokedynamic100082_33(8752, (3995749649272396448L ^ life4_3))) + life34_203))), ((int)(((life10_59 * 4) + life52_251))), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(this.o)).a__fE())));
    }
    life52_251 += 1;
    if (!((life6_42 == null))) {
        continue forest_cycle_252;
    }
    break forest_cycle_252;
    }
    break forest_cycle_234;
    }
    }
    life37_214 = (life37_214 + life41_222);
    life39_216 = (life39_216 + life43_228);
    life45_232 += 1;
    if (!((life6_42 == null))) {
        continue forest_cycle_233;
    }
    break forest_cycle_233;
    }
    break forest_cycle_205;
    }
    }
    life18_126 = (life18_126 + life26_160);
    life20_133 = (life20_133 + life28_173);
    life22_140 = (life22_140 + life30_186);
    life24_147 = (life24_147 + life32_199);
    life34_203 += 1;
    if (!((life6_42 == null))) {
        continue forest_cycle_204;
    }
    break forest_cycle_204;
    }
    break forest_cycle_112;
    }
    }
    life15_110 += 1;
    if (!((life6_42 == null))) {
        continue forest_cycle_111;
    }
    break forest_cycle_111;
    }
    break forest_cycle_61;
    }
    }
    life10_59 += 1;
    if (!((life6_42 == null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    break forest_cycle_46;
    }
    }
    life7_44 += 1;
    if (!((life6_42 == null))) {
        continue forest_cycle_45;
    }
    break forest_cycle_45;
    }
    }
    return;
}


public void a(int p0, int p1, moom.Fm p2, net.minecraft.world.biome.BiomeGenBase[] p3) {
java.lang.String[] spill631_0;
    long life5_3;
    double life8_5;
    int life10_48;
    java.lang.String[] life7_49;
    int life11_58;
    net.minecraft.world.biome.BiomeGenBase life12_77;
    lexical_join_123: {
    life5_3 = (moom.FA.C ^ 39648836184291L);
    life8_5 = 0x1.0p-5d;
    this.p = ((double[])(((moom.FW)(this.e)).a(((double[])(this.p)), ((double)(((double) (p0 * __sourceIntrinsic_085130701234_invokedynamic631_3(1191, (335994699335085215L ^ life5_3)))))), ((double)(((double) (p1 * __sourceIntrinsic_085130701234_invokedynamic631_4(1191, (335994699335085215L ^ life5_3)))))), ((int)(__sourceIntrinsic_085130701234_invokedynamic631_5(1191, (335994699335085215L ^ life5_3)))), ((int)(__sourceIntrinsic_085130701234_invokedynamic631_6(1191, (335994699335085215L ^ life5_3)))), ((double)((life8_5 * 0x1.0p1d))), ((double)((life8_5 * 0x1.0p1d))), ((double)(0x1.0p0d)))));
    spill631_0 = moom.FI.b();
    life10_48 = 0;
    life7_49 = spill631_0;
    lexical_cycle_50: while (true) {
    lexical_join_121: {
    lexical_join_120: {
    if (!((life10_48 < __sourceIntrinsic_085130701234_invokedynamic631_10(1191, (335994699335085215L ^ life5_3))))) {
        break lexical_join_123;
    }
    life11_58 = 0;
    lexical_cycle_59: while (true) {
    if (!((life11_58 < __sourceIntrinsic_085130701234_invokedynamic631_11(1191, (335994699335085215L ^ life5_3))))) {
        break lexical_join_120;
    }
    life12_77 = (p3)[(life11_58 + (life10_48 * __sourceIntrinsic_085130701234_invokedynamic631_12(1191, (335994699335085215L ^ life5_3))))];
    ((net.minecraft.world.biome.BiomeGenBase)(life12_77)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.Fm)(p2)), ((int)(((p0 * __sourceIntrinsic_085130701234_invokedynamic631_15(1191, (335994699335085215L ^ life5_3))) + life10_48))), ((int)(((p1 * __sourceIntrinsic_085130701234_invokedynamic631_16(1191, (335994699335085215L ^ life5_3))) + life11_58))), ((double)((this.p)[(life11_58 + (life10_48 * __sourceIntrinsic_085130701234_invokedynamic631_18(1191, (335994699335085215L ^ life5_3))))])));
    life11_58 += 1;
    if (!((life7_49 != null))) {
        break lexical_join_121;
    }
    if (!((life7_49 == null))) { continue lexical_cycle_59; }
    break lexical_cycle_59;
    }
    }
    life10_48 += 1;
    }
    if (!((life7_49 == null))) { continue lexical_cycle_50; }
    break lexical_cycle_50;
    }
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4461_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FA"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.FA.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a__Boolean() {
return ((0) != 0);
}


public void a__Void() {
return;
}


public boolean a(boolean p0, net.minecraft.util.IProgressUpdate p1) {
return ((1) != 0);
}


public boolean a(moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) {
int forwardValue1896_46_0;
    java.lang.String[] spill1896_0;
    boolean spill1896_1;
    boolean spill1896_2;
    int spill1896_3;
    long life5_3;
    int life8_6;
    java.lang.String[] life7_7;
    forward_join_46: {
    forward_join_45: {
    life5_3 = (moom.FA.C ^ 62575875898796L);
    spill1896_0 = moom.FI.b();
    life8_6 = 0;
    life7_7 = spill1896_0;
    spill1896_1 = ((moom.FD)(this.n)).y;
    if (!((life7_7 != null))) {
        forwardValue1896_46_0 = ((spill1896_1) ? 1 : 0);
        break forward_join_46;
    }
    if (!(spill1896_1)) {
        break forward_join_45;
    }
    spill1896_2 = this.j;
    if (!((life7_7 != null))) {
        forwardValue1896_46_0 = ((spill1896_2) ? 1 : 0);
        break forward_join_46;
    }
    if (!(spill1896_2)) {
        break forward_join_45;
    }
    spill1896_3 = recovery.source.CarrierOps.lcmp(((long)(((net.minecraft.world.chunk.Chunk)(p1)).a__Long())), ((long)(__sourceIntrinsic_d0a9f788d59e_invokedynamic1896_8(29298, (3458651929564305382L ^ life5_3)))));
    if (!((life7_7 != null))) {
        forwardValue1896_46_0 = spill1896_3;
        break forward_join_46;
    }
    if (!((spill1896_3 < 0))) {
        break forward_join_45;
    }
    life8_6 = (life8_6 | ((((moom.FS)(this.w)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.Ee)(new moom.Ee(p2, p3))))) ? 1 : 0));
    }
    forwardValue1896_46_0 = life8_6;
    }
    return ((forwardValue1896_46_0) != 0);
}


public void a(moom.Fn p0, int p1, int p2) {
int forestValue253_137_0;
    int forestValue253_157_0;
    int forestValue253_177_0;
    int forestValue253_197_0;
    int forestValue253_202_0;
    int forestValue253_213_0;
    net.minecraft.world.biome.BiomeGenBase forestValue253_221_0;
    net.minecraft.world.biome.BiomeGenBase forestValue253_221_1;
    int forestValue253_296_0;
    int forestValue253_404_0;
    int forestValue253_408_0;
    int forestValue253_533_0;
    int forestValue253_535_0;
    int forestValue253_586_0;
    int forestValue253_596_0;
    int forestValue253_604_0;
    java.lang.String[] spill253_0;
    boolean spill253_1;
    boolean spill253_2;
    boolean spill253_3;
    boolean spill253_4;
    boolean spill253_5;
    net.minecraft.world.biome.BiomeGenBase spill253_6;
    net.minecraft.world.biome.BiomeGenBase spill253_7;
    boolean spill253_8;
    int spill253_9;
    int spill253_10;
    int spill253_11;
    boolean spill253_12;
    int spill253_13;
    int spill253_14;
    int spill253_15;
    boolean spill253_16;
    long life4_3;
    int life7_14;
    int life8_22;
    java.lang.String[] life6_23;
    moom.DT life9_30;
    net.minecraft.world.biome.BiomeGenBase life10_47;
    long life11_71;
    long life13_89;
    int life15_107;
    moom.Ee life16_113;
    int life17_282;
    int life18_291;
    int life19_306;
    int life17_366;
    int life18_384;
    int life19_399;
    int life17_449;
    int life18_469;
    int life19_478;
    int life20_493;
    int life17_571;
    int life18_582;
    moom.DT life19_598;
    moom.DT life20_601;
    forest_join_604: {
    forest_join_603: {
    forest_join_533: {
    forest_join_532: {
    forest_join_476: {
    forest_join_408: {
    forest_join_405: {
    forest_join_404: {
    forest_join_390: {
    forest_join_296: {
    forest_join_295: {
    forest_join_221: {
    forest_join_214: {
    forest_join_213: {
    forest_join_202: {
    forest_join_197: {
    forest_join_194: {
    forest_join_177: {
    forest_join_174: {
    forest_join_157: {
    forest_join_154: {
    forest_join_137: {
    forest_join_134: {
    life4_3 = (moom.FA.C ^ 71326066530546L);
    spill253_0 = moom.FI.b();
    moom.du.Q = ((boolean)(true));
    life7_14 = (p1 * __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_3(1191, (336034631559683214L ^ life4_3)));
    life8_22 = (p2 * __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_4(1191, (336034631559683214L ^ life4_3)));
    life6_23 = spill253_0;
    life9_30 = new moom.DT(life7_14, 0, life8_22);
    life10_47 = ((net.minecraft.world.World)(this.i)).a__ES(((moom.DT)(((moom.DT)(life9_30)).a(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_6(1191, (336034631559683214L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_7(1191, (336034631559683214L ^ life4_3))))))));
    ((java.util.Random)(this.a)).setSeed(((long)(((net.minecraft.world.World)(this.i)).a__Long())));
    life11_71 = (((((java.util.Random)(this.a)).nextLong() / __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_16(7995, (8006963126637584370L ^ life4_3))) * __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_17(30815, (5575669451416975508L ^ life4_3))) + 1L);
    life13_89 = (((((java.util.Random)(this.a)).nextLong() / __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_20(30815, (5575669451416975508L ^ life4_3))) * __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_21(30815, (5575669451416975508L ^ life4_3))) + 1L);
    ((java.util.Random)(this.a)).setSeed(((long)((((((long) p1) * life11_71) + (((long) p2) * life13_89)) ^ ((net.minecraft.world.World)(this.i)).a__Long()))));
    life15_107 = 0;
    life16_113 = new moom.Ee(p1, p2);
    spill253_1 = ((moom.FD)(this.n)).w;
    if (!((life6_23 != null))) {
        forestValue253_137_0 = ((spill253_1) ? 1 : 0);
        break forest_join_137;
    }
    if (!(spill253_1)) {
        break forest_join_134;
    }
    spill253_2 = this.j;
    if (!((life6_23 != null))) {
        forestValue253_137_0 = ((spill253_2) ? 1 : 0);
        break forest_join_137;
    }
    if (!(spill253_2)) {
        break forest_join_134;
    }
    ((moom.FN)(this.t)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.Ee)(life16_113)));
    }
    forestValue253_137_0 = ((((moom.FD)(this.n)).v) ? 1 : 0);
    }
    if (!((life6_23 != null))) {
        forestValue253_157_0 = forestValue253_137_0;
        break forest_join_157;
    }
    if (!((forestValue253_137_0 != 0))) {
        break forest_join_154;
    }
    spill253_3 = this.j;
    if (!((life6_23 != null))) {
        forestValue253_157_0 = ((spill253_3) ? 1 : 0);
        break forest_join_157;
    }
    if (!(spill253_3)) {
        break forest_join_154;
    }
    life15_107 = ((((moom.FR)(this.s)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.Ee)(life16_113)))) ? 1 : 0);
    }
    forestValue253_157_0 = ((((moom.FD)(this.n)).u) ? 1 : 0);
    }
    if (!((life6_23 != null))) {
        forestValue253_177_0 = forestValue253_157_0;
        break forest_join_177;
    }
    if (!((forestValue253_157_0 != 0))) {
        break forest_join_174;
    }
    spill253_4 = this.j;
    if (!((life6_23 != null))) {
        forestValue253_177_0 = ((spill253_4) ? 1 : 0);
        break forest_join_177;
    }
    if (!(spill253_4)) {
        break forest_join_174;
    }
    ((moom.FQ)(this.r)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.Ee)(life16_113)));
    }
    forestValue253_177_0 = ((((moom.FD)(this.n)).x) ? 1 : 0);
    }
    if (!((life6_23 != null))) {
        forestValue253_197_0 = forestValue253_177_0;
        break forest_join_197;
    }
    if (!((forestValue253_177_0 != 0))) {
        break forest_join_194;
    }
    spill253_5 = this.j;
    if (!((life6_23 != null))) {
        forestValue253_197_0 = ((spill253_5) ? 1 : 0);
        break forest_join_197;
    }
    if (!(spill253_5)) {
        break forest_join_194;
    }
    ((moom.FP)(this.u)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.Ee)(life16_113)));
    }
    forestValue253_197_0 = ((((moom.FD)(this.n)).y) ? 1 : 0);
    }
    if (!((life6_23 != null))) {
        forestValue253_202_0 = forestValue253_197_0;
        break forest_join_202;
    }
    if (!((forestValue253_197_0 != 0))) {
        break forest_join_214;
    }
    forestValue253_202_0 = ((this.j) ? 1 : 0);
    }
    if (!((life6_23 != null))) {
        forestValue253_213_0 = forestValue253_202_0;
        break forest_join_213;
    }
    if (!((forestValue253_202_0 != 0))) {
        break forest_join_214;
    }
    forestValue253_213_0 = ((((moom.FS)(this.w)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.Ee)(life16_113)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue253_213_0);
    }
    spill253_6 = life10_47;
    spill253_7 = net.minecraft.world.biome.BiomeGenBase.t;
    if (!((life6_23 != null))) {
        forestValue253_221_0 = spill253_6;
        forestValue253_221_1 = spill253_7;
        break forest_join_221;
    }
    if (!((spill253_6 != spill253_7))) {
        break forest_join_295;
    }
    forestValue253_221_0 = life10_47;
    forestValue253_221_1 = net.minecraft.world.biome.BiomeGenBase.I;
    }
    if (!((forestValue253_221_0 != forestValue253_221_1))) {
        break forest_join_295;
    }
    spill253_8 = ((moom.FD)(this.n)).A;
    if (!((life6_23 != null))) {
        forestValue253_296_0 = ((spill253_8) ? 1 : 0);
        break forest_join_296;
    }
    if (!(spill253_8)) {
        break forest_join_295;
    }
    spill253_9 = life15_107;
    if (!((life6_23 != null))) {
        forestValue253_296_0 = spill253_9;
        break forest_join_296;
    }
    if (!((spill253_9 == 0))) {
        break forest_join_295;
    }
    spill253_10 = ((java.util.Random)(this.a)).nextInt(((int)(((moom.FD)(this.n)).B)));
    if (!((life6_23 != null))) {
        forestValue253_296_0 = spill253_10;
        break forest_join_296;
    }
    if (!((spill253_10 == 0))) {
        break forest_join_295;
    }
    life17_282 = (((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_84(1191, (336034631559683214L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_86(8752, (3995742109732616731L ^ life4_3)));
    life18_291 = ((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_88(30529, (6485929040006606695L ^ life4_3)))));
    life19_306 = (((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_91(1191, (336034631559683214L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_93(8752, (3995742109732616731L ^ life4_3)));
    ((moom.Gr)(new moom.Gr(net.minecraft.init.Blocks.j))).a__Boolean(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.DT)(((moom.DT)(life9_30)).a(((int)(life17_282)), ((int)(life18_291)), ((int)(life19_306))))));
    }
    forestValue253_296_0 = life15_107;
    }
    if (!((life6_23 != null))) {
        forestValue253_408_0 = forestValue253_296_0;
        break forest_join_408;
    }
    if (!((forestValue253_296_0 == 0))) {
        break forest_join_405;
    }
    spill253_11 = ((java.util.Random)(this.a)).nextInt(((int)((((moom.FD)(this.n)).D / __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_102(16221, (7894008420969981822L ^ life4_3))))));
    if (!((life6_23 != null))) {
        forestValue253_408_0 = spill253_11;
        break forest_join_408;
    }
    if (!((spill253_11 == 0))) {
        break forest_join_405;
    }
    spill253_12 = ((moom.FD)(this.n)).C;
    if (!((life6_23 != null))) {
        forestValue253_408_0 = ((spill253_12) ? 1 : 0);
        break forest_join_408;
    }
    if (!(spill253_12)) {
        break forest_join_405;
    }
    life17_366 = (((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_108(1191, (336034631559683214L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_110(8752, (3995742109732616731L ^ life4_3)));
    life18_384 = ((java.util.Random)(this.a)).nextInt(((int)((((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_113(31891, (6474467923340125361L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_115(8752, (3995742109732616731L ^ life4_3))))));
    life19_399 = (((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_118(1191, (336034631559683214L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_120(8752, (3995742109732616731L ^ life4_3)));
    spill253_13 = life18_384;
    if (!((life6_23 != null))) {
        forestValue253_404_0 = spill253_13;
        break forest_join_404;
    }
    if (!((spill253_13 >= ((net.minecraft.world.World)(this.i)).c()))) {
        break forest_join_390;
    }
    spill253_14 = ((java.util.Random)(this.a)).nextInt(((int)((((moom.FD)(this.n)).D / __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_126(8752, (3995742109732616731L ^ life4_3))))));
    if (!((life6_23 != null))) {
        forestValue253_408_0 = spill253_14;
        break forest_join_408;
    }
    if (!((spill253_14 == 0))) {
        break forest_join_405;
    }
    }
    forestValue253_404_0 = ((((moom.Gr)(new moom.Gr(net.minecraft.init.Blocks.l))).a__Boolean(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.DT)(((moom.DT)(life9_30)).a(((int)(life17_366)), ((int)(life18_384)), ((int)(life19_399))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue253_404_0);
    }
    forestValue253_408_0 = ((((moom.FD)(this.n)).s) ? 1 : 0);
    }
    if (!((life6_23 != null))) {
        forestValue253_533_0 = forestValue253_408_0;
        break forest_join_533;
    }
    if (!((forestValue253_408_0 != 0))) {
        break forest_join_476;
    }
    life17_449 = 0;
    forest_cycle_413: while (true) {
    if (!((life17_449 < ((moom.FD)(this.n)).t))) {
        break forest_join_476;
    }
    life18_469 = (((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_141(1191, (336034631559683214L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_143(8752, (3995742109732616731L ^ life4_3)));
    life19_478 = ((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_145(30529, (6485929040006606695L ^ life4_3)))));
    life20_493 = (((java.util.Random)(this.a)).nextInt(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_148(1191, (336034631559683214L ^ life4_3))))) + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_150(8752, (3995742109732616731L ^ life4_3)));
    ((moom.Gj)(new moom.Gj())).a__Boolean(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.DT)(((moom.DT)(life9_30)).a(((int)(life18_469)), ((int)(life19_478)), ((int)(life20_493))))));
    life17_449 += 1;
    if (!((life6_23 != null))) {
        break forest_join_532;
    }
    if (!((life6_23 == null))) {
        continue forest_cycle_413;
    }
    break forest_cycle_413;
    }
    }
    ((net.minecraft.world.biome.BiomeGenBase)(life10_47)).a(((net.minecraft.world.World)(this.i)), ((java.util.Random)(this.a)), ((moom.DT)(new moom.DT(life7_14, 0, life8_22))));
    moom.Es.a(((net.minecraft.world.World)(this.i)), ((net.minecraft.world.biome.BiomeGenBase)(life10_47)), ((int)((life7_14 + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_159(8752, (3995742109732616731L ^ life4_3))))), ((int)((life8_22 + __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_160(8752, (3995742109732616731L ^ life4_3))))), ((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_161(1191, (336034631559683214L ^ life4_3)))), ((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_162(1191, (336034631559683214L ^ life4_3)))), ((java.util.Random)(this.a)));
    life9_30 = ((moom.DT)(life9_30)).a(((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_165(8752, (3995742109732616731L ^ life4_3)))), ((int)(0)), ((int)(__sourceIntrinsic_74e94bd4fdf5_invokedynamic253_166(8752, (3995742109732616731L ^ life4_3)))));
    }
    forestValue253_533_0 = 0;
    }
    life17_571 = forestValue253_533_0;
    forest_cycle_534: while (true) {
    forest_join_600: {
    forestValue253_535_0 = life17_571;
    forest_cycle_535: while (true) {
    if (!((forestValue253_535_0 < __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_168(1191, (336034631559683214L ^ life4_3))))) {
        break forest_join_603;
    }
    spill253_15 = 0;
    if (!((life6_23 != null))) {
        forestValue253_604_0 = spill253_15;
        break forest_join_604;
    }
    life18_582 = spill253_15;
    forest_cycle_545: while (true) {
    forest_join_597: {
    forest_join_596: {
    forest_join_586: {
    forest_join_581: {
    if (!((life18_582 < __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_169(1191, (336034631559683214L ^ life4_3))))) {
        break forest_join_600;
    }
    life19_598 = ((net.minecraft.world.World)(this.i)).b__DT(((moom.DT)(((moom.DT)(life9_30)).a(((int)(life17_571)), ((int)(0)), ((int)(life18_582))))));
    life20_601 = ((moom.DT)(life19_598)).b__DT();
    spill253_16 = ((net.minecraft.world.World)(this.i)).h(((moom.DT)(life20_601)));
    if (!((life6_23 != null))) {
        forestValue253_535_0 = ((spill253_16) ? 1 : 0);
        continue forest_cycle_535;
    }
    if (!((life6_23 != null))) {
        forestValue253_586_0 = ((spill253_16) ? 1 : 0);
        break forest_join_586;
    }
    if (!(spill253_16)) {
        break forest_join_581;
    }
    ((net.minecraft.world.World)(this.i)).a(((moom.DT)(life20_601)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aI)).a__fE())), ((int)(2)));
    }
    forestValue253_586_0 = ((((net.minecraft.world.World)(this.i)).e(((moom.DT)(life19_598)), ((boolean)(true)))) ? 1 : 0);
    }
    if (!((life6_23 != null))) {
        forestValue253_596_0 = forestValue253_586_0;
        break forest_join_596;
    }
    if (!((forestValue253_586_0 != 0))) {
        break forest_join_597;
    }
    forestValue253_596_0 = ((((net.minecraft.world.World)(this.i)).a(((moom.DT)(life19_598)), ((net.minecraft.block.state.IBlockState)(((net.minecraft.block.Block)(net.minecraft.init.Blocks.aH)).a__fE())), ((int)(2)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue253_596_0);
    }
    life18_582 += 1;
    if (!((life6_23 == null))) {
        continue forest_cycle_545;
    }
    break forest_cycle_545;
    }
    break forest_cycle_535;
    }
    }
    life17_571 += 1;
    if (!((life6_23 == null))) {
        continue forest_cycle_534;
    }
    break forest_cycle_534;
    }
    }
    forestValue253_604_0 = 0;
    }
    moom.du.Q = ((boolean)__sourceIntrinsic_integerToBoolean((forestValue253_604_0)));
    return;
}


public int a() {
return 0;
}


public moom.DT a(net.minecraft.world.World p0, java.lang.String p1, moom.DT p2) {
moom.FQ forwardValue1898_17_0;
    moom.DT forwardValue1898_22_0;
    moom.FQ spill1898_0;
    long life4_3;
    java.lang.String[] life6_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_17: {
    life4_3 = (moom.FA.C ^ 112044229424444L);
    life6_5 = moom.FI.b();
    if (!(((java.lang.String)("Stronghold")).equals(((java.lang.Object)(p1))))) {
        break forward_join_21;
    }
    spill1898_0 = this.r;
    if (!((life6_5 != null))) {
        forwardValue1898_17_0 = spill1898_0;
        break forward_join_17;
    }
    if (!((spill1898_0 != null))) {
        break forward_join_21;
    }
    forwardValue1898_17_0 = this.r;
    }
    forwardValue1898_22_0 = ((moom.FQ)(forwardValue1898_17_0)).a(((net.minecraft.world.World)(p0)), ((moom.DT)(p2)));
    break forward_join_22;
    }
    forwardValue1898_22_0 = null;
    }
    return forwardValue1898_22_0;
}


private void a(int p0, int p1, int p2) {
int forestValue616_129_0;
    int forestValue616_134_0;
    moom.FA forestValue616_247_0;
    float forestValue616_261_0;
    float forestValue616_261_1;
    float forestValue616_289_0;
    float forestValue616_289_1;
    moom.FA forestValue616_320_0;
    int forestValue616_346_0;
    double forestValue616_367_0;
    double forestValue616_367_1;
    int forestValue616_376_0;
    double forestValue616_381_0;
    double forestValue616_381_1;
    double forestValue616_459_0;
    double forestValue616_459_1;
    java.lang.String[] spill616_0;
    int spill616_1;
    int spill616_2;
    moom.FA spill616_3;
    float spill616_4;
    float spill616_5;
    float spill616_6;
    float spill616_7;
    int spill616_8;
    double spill616_9;
    double spill616_10;
    double spill616_11;
    double spill616_12;
    double spill616_13;
    double spill616_14;
    int spill616_15;
    long life4_3;
    float life7_30;
    float life8_35;
    int life3_118;
    int life1_120;
    int life9_122;
    int life10_124;
    java.lang.String[] life6_125;
    int life11_127;
    int life12_132;
    float life13_137;
    float life14_139;
    float life15_141;
    int life16_143;
    net.minecraft.world.biome.BiomeGenBase life17_160;
    int life18_165;
    int life19_173;
    net.minecraft.world.biome.BiomeGenBase life20_197;
    float life21_208;
    float life22_219;
    float life23_266;
    float life13_305;
    float life14_309;
    double life18_330;
    double life18_359;
    double life18_372;
    double life20_396;
    double life22_399;
    double life20_405;
    double life20_414;
    double life24_423;
    int life26_425;
    double life27_448;
    double life29_471;
    double life31_481;
    double life33_492;
    double life35_499;
    double life37_521;
    forest_join_535: {
    life4_3 = (moom.FA.C ^ 22046353671217L);
    this.B = ((double[])(((moom.FV)(this.g)).a(((double[])(this.B)), ((int)(p0)), ((int)(p2)), ((int)(5)), ((int)(5)), ((double)(((double) ((moom.FD)(this.n)).e))), ((double)(((double) ((moom.FD)(this.n)).f))), ((double)(((double) ((moom.FD)(this.n)).g))))));
    life7_30 = ((moom.FD)(this.n)).a;
    spill616_0 = moom.FI.b();
    life8_35 = ((moom.FD)(this.n)).b;
    this.y = ((double[])(((moom.FV)(this.d)).a(((double[])(this.y)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_e4d4f5a69301_invokedynamic616_18(14939, (3546675782408519346L ^ life4_3)))), ((int)(5)), ((double)(((double) (life7_30 / ((moom.FD)(this.n)).h)))), ((double)(((double) (life8_35 / ((moom.FD)(this.n)).i)))), ((double)(((double) (life7_30 / ((moom.FD)(this.n)).j)))))));
    this.z = ((double[])(((moom.FV)(this.b)).a(((double[])(this.z)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_e4d4f5a69301_invokedynamic616_29(27758, (3756141424805439616L ^ life4_3)))), ((int)(5)), ((double)(((double) life7_30))), ((double)(((double) life8_35))), ((double)(((double) life7_30))))));
    this.A = ((double[])(((moom.FV)(this.c)).a(((double[])(this.A)), ((int)(p0)), ((int)(p1)), ((int)(p2)), ((int)(5)), ((int)(__sourceIntrinsic_e4d4f5a69301_invokedynamic616_34(27758, (3756141424805439616L ^ life4_3)))), ((int)(5)), ((double)(((double) life7_30))), ((double)(((double) life8_35))), ((double)(((double) life7_30))))));
    life3_118 = 0;
    life1_120 = 0;
    life9_122 = 0;
    life10_124 = 0;
    life6_125 = spill616_0;
    life11_127 = 0;
    forest_cycle_128: while (true) {
    forest_join_532: {
    forestValue616_129_0 = life11_127;
    forest_cycle_129: while (true) {
    if (!((forestValue616_129_0 < 5))) {
        break forest_join_535;
    }
    life12_132 = 0;
    forest_cycle_133: while (true) {
    forest_join_529: {
    forestValue616_134_0 = life12_132;
    forest_cycle_134: while (true) {
    forest_join_383: {
    forest_join_381: {
    forest_join_379: {
    forest_join_376: {
    forest_join_371: {
    forest_join_367: {
    forest_join_361: {
    forest_join_346: {
    forest_join_337: {
    forest_join_320: {
    forest_join_297: {
    if (!((forestValue616_134_0 < 5))) {
        break forest_join_532;
    }
    life13_137 = 0x0.0p0f;
    life14_139 = 0x0.0p0f;
    life15_141 = 0x0.0p0f;
    life16_143 = 2;
    life17_160 = (this.x)[((life11_127 + 2) + ((life12_132 + 2) * __sourceIntrinsic_e4d4f5a69301_invokedynamic616_38(16221, (7894091093490547645L ^ life4_3))))];
    spill616_1 = (-life16_143);
    if (!((life6_125 != null))) {
        forestValue616_129_0 = spill616_1;
        continue forest_cycle_129;
    }
    life18_165 = spill616_1;
    forest_cycle_166: while (true) {
    forest_join_294: {
    if (!((life18_165 <= life16_143))) {
        break forest_join_297;
    }
    spill616_2 = (-life16_143);
    if (!((life6_125 != null))) {
        forestValue616_134_0 = spill616_2;
        continue forest_cycle_134;
    }
    life19_173 = spill616_2;
    forest_cycle_174: while (true) {
    forest_join_289: {
    forest_join_275: {
    forest_join_261: {
    forest_join_247: {
    forest_join_246: {
    if (!((life19_173 <= life16_143))) {
        break forest_join_294;
    }
    life20_197 = (this.x)[(((life11_127 + life18_165) + 2) + (((life12_132 + life19_173) + 2) * __sourceIntrinsic_e4d4f5a69301_invokedynamic616_40(16221, (7894091093490547645L ^ life4_3))))];
    life21_208 = (((moom.FD)(this.n)).n + (((net.minecraft.world.biome.BiomeGenBase)(life20_197)).ap * ((moom.FD)(this.n)).m));
    life22_219 = (((moom.FD)(this.n)).p + (((net.minecraft.world.biome.BiomeGenBase)(life20_197)).aq * ((moom.FD)(this.n)).o));
    spill616_3 = this;
    if (!((life6_125 != null))) {
        forestValue616_320_0 = spill616_3;
        break forest_join_320;
    }
    if (!((life6_125 != null))) {
        forestValue616_247_0 = spill616_3;
        break forest_join_247;
    }
    if (!((((moom.FA)(spill616_3)).k == net.minecraft.world.WorldType.e))) {
        break forest_join_246;
    }
    spill616_4 = life21_208;
    spill616_5 = 0x0.0p0f;
    if (!((life6_125 != null))) {
        forestValue616_261_0 = spill616_4;
        forestValue616_261_1 = spill616_5;
        break forest_join_261;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill616_4)), ((float)(spill616_5))) > 0))) {
        break forest_join_246;
    }
    life21_208 = (0x1.0p0f + (life21_208 * 0x1.0p1f));
    life22_219 = (0x1.0p0f + (life22_219 * 0x1.0p2f));
    }
    forestValue616_247_0 = this;
    }
    forestValue616_261_0 = (((moom.FA)(forestValue616_247_0)).m)[((life18_165 + 2) + ((life19_173 + 2) * 5))];
    forestValue616_261_1 = (life21_208 + 0x1.0p1f);
    }
    life23_266 = (forestValue616_261_0 / forestValue616_261_1);
    spill616_6 = ((net.minecraft.world.biome.BiomeGenBase)(life20_197)).ap;
    spill616_7 = ((net.minecraft.world.biome.BiomeGenBase)(life17_160)).ap;
    if (!((life6_125 != null))) {
        forestValue616_289_0 = spill616_6;
        forestValue616_289_1 = spill616_7;
        break forest_join_289;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill616_6)), ((float)(spill616_7))) > 0))) {
        break forest_join_275;
    }
    life23_266 = (life23_266 / 0x1.0p1f);
    }
    life13_137 = (life13_137 + (life22_219 * life23_266));
    life14_139 = (life14_139 + (life21_208 * life23_266));
    forestValue616_289_0 = life15_141;
    forestValue616_289_1 = life23_266;
    }
    life15_141 = (forestValue616_289_0 + forestValue616_289_1);
    life19_173 += 1;
    if (!((life6_125 == null))) {
        continue forest_cycle_174;
    }
    break forest_cycle_174;
    }
    }
    life18_165 += 1;
    if (!((life6_125 == null))) {
        continue forest_cycle_166;
    }
    break forest_cycle_166;
    }
    }
    life13_305 = (life13_137 / life15_141);
    life14_309 = (life14_139 / life15_141);
    life13_137 = ((life13_305 * 0x1.ccccccp-1f) + 0x1.99999ap-4f);
    life14_139 = (((life14_309 * 0x1.0p2f) - 0x1.0p0f) / 0x1.0p3f);
    forestValue616_320_0 = this;
    }
    life18_330 = ((((moom.FA)(forestValue616_320_0)).B)[life10_124] / 0x1.f4p12d);
    spill616_8 = recovery.source.CarrierOps.dcmpg(((double)(life18_330)), ((double)(0x0.0p0d)));
    if (!((life6_125 != null))) {
        forestValue616_346_0 = spill616_8;
        break forest_join_346;
    }
    if (!((spill616_8 < 0))) {
        break forest_join_337;
    }
    life18_330 = ((-life18_330) * 0x1.3333333333333p-2d);
    }
    life18_330 = ((life18_330 * 0x1.8p1d) - 0x1.0p1d);
    forestValue616_346_0 = recovery.source.CarrierOps.dcmpg(((double)(life18_330)), ((double)(0x0.0p0d)));
    }
    if (!((life6_125 != null))) {
        forestValue616_376_0 = forestValue616_346_0;
        break forest_join_376;
    }
    if (!((forestValue616_346_0 < 0))) {
        break forest_join_371;
    }
    life18_359 = (life18_330 / 0x1.0p1d);
    spill616_9 = life18_359;
    spill616_10 = -0x1.0p0d;
    if (!((life6_125 != null))) {
        forestValue616_367_0 = spill616_9;
        forestValue616_367_1 = spill616_10;
        break forest_join_367;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill616_9)), ((double)(spill616_10))) < 0))) {
        break forest_join_361;
    }
    life18_359 = -0x1.0p0d;
    }
    life18_372 = (life18_359 / 0x1.6666666666666p0d);
    forestValue616_367_0 = life18_372;
    forestValue616_367_1 = 0x1.0p1d;
    }
    life18_330 = (forestValue616_367_0 / forestValue616_367_1);
    if (!((life6_125 == null))) {
        break forest_join_383;
    }
    }
    spill616_11 = life18_330;
    spill616_12 = 0x1.0p0d;
    if (!((life6_125 != null))) {
        forestValue616_381_0 = spill616_11;
        forestValue616_381_1 = spill616_12;
        break forest_join_381;
    }
    forestValue616_376_0 = recovery.source.CarrierOps.dcmpl(((double)(spill616_11)), ((double)(spill616_12)));
    }
    if (!((forestValue616_376_0 > 0))) {
        break forest_join_379;
    }
    life18_330 = 0x1.0p0d;
    }
    forestValue616_381_0 = life18_330;
    forestValue616_381_1 = 0x1.0p3d;
    }
    life18_330 = (forestValue616_381_0 / forestValue616_381_1);
    }
    life10_124 += 1;
    life20_396 = ((double) life14_139);
    life22_399 = ((double) life13_137);
    life20_405 = (life20_396 + (life18_330 * 0x1.999999999999ap-3d));
    life20_414 = ((life20_405 * ((double) ((moom.FD)(this.n)).k)) / 0x1.0p3d);
    life24_423 = (((double) ((moom.FD)(this.n)).k) + (life20_414 * 0x1.0p2d));
    life26_425 = 0;
    forest_cycle_416: while (true) {
    forest_join_527: {
    forest_join_520: {
    forest_join_459: {
    forest_join_451: {
    if (!((life26_425 < __sourceIntrinsic_e4d4f5a69301_invokedynamic616_67(27758, (3756141424805439616L ^ life4_3))))) {
        break forest_join_529;
    }
    life27_448 = (((((((double) life26_425) - life24_423) * ((double) ((moom.FD)(this.n)).l)) * 0x1.0p7d) / 0x1.0p8d) / life22_399);
    spill616_13 = life27_448;
    spill616_14 = 0x0.0p0d;
    if (!((life6_125 != null))) {
        forestValue616_459_0 = spill616_13;
        forestValue616_459_1 = spill616_14;
        break forest_join_459;
    }
    spill616_15 = recovery.source.CarrierOps.dcmpg(((double)(spill616_13)), ((double)(spill616_14)));
    if (!((life6_125 != null))) {
        forestValue616_134_0 = spill616_15;
        continue forest_cycle_134;
    }
    if (!((spill616_15 < 0))) {
        break forest_join_451;
    }
    life27_448 = (life27_448 * 0x1.0p2d);
    }
    forestValue616_459_0 = (this.z)[life9_122];
    forestValue616_459_1 = ((double) ((moom.FD)(this.n)).d);
    }
    life29_471 = (forestValue616_459_0 / forestValue616_459_1);
    life31_481 = ((this.A)[life9_122] / ((double) ((moom.FD)(this.n)).c));
    life33_492 = ((((this.y)[life9_122] / 0x1.4p3d) + 0x1.0p0d) / 0x1.0p1d);
    life35_499 = (moom.Dr.b(((double)(life29_471)), ((double)(life31_481)), ((double)(life33_492))) - life27_448);
    if (!((life6_125 != null))) {
        break forest_join_527;
    }
    if (!((life26_425 > __sourceIntrinsic_e4d4f5a69301_invokedynamic616_79(4907, (7625258714277910477L ^ life4_3))))) {
        break forest_join_520;
    }
    life37_521 = ((double) (((float) (life26_425 - __sourceIntrinsic_e4d4f5a69301_invokedynamic616_80(2539, (5130157207288352012L ^ life4_3)))) / 0x1.8p1f));
    life35_499 = ((life35_499 * (0x1.0p0d - life37_521)) + (-0x1.4p3d * life37_521));
    }
    (this.l)[life9_122] = life35_499;
    life9_122 += 1;
    life26_425 += 1;
    }
    if (!((life6_125 == null))) {
        continue forest_cycle_416;
    }
    break forest_cycle_416;
    }
    break forest_cycle_134;
    }
    }
    life12_132 += 1;
    if (!((life6_125 == null))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    break forest_cycle_129;
    }
    }
    life11_127 += 1;
    if (!((life6_125 == null))) {
        continue forest_cycle_128;
    }
    break forest_cycle_128;
    }
    }
    return;
}


public java.lang.String a__String() {
return "RandomLevelSource";
}


public boolean a__Boolean(int p0, int p1) {
return ((1) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a78fc628ffdf5a3d_originalDynamicSite483_61(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a55be857de7c_invokedynamic628_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a55be857de7c_invokedynamic628_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic628_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic628_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic628_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a55be857de7c_invokedynamic628_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e4d4f5a69301_invokedynamic616_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_273b4708c739_invokedynamic100082_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_085130701234_invokedynamic631_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4461_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_16(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_17(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_20(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_113(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_74e94bd4fdf5_invokedynamic253_169(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_d0a9f788d59e_invokedynamic1896_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4454_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
