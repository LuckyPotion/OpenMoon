package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Dr {

public static final float a;

public static final float b;

public static final float c;

public static final float d;

private static final float e;

public static final float f;

private static final float[] g;

public static boolean h;

private static final float[] i;

private static final int[] j;

private static final double k;

private static final double[] l;

private static final double[] m;

private static final int n;

private static final int o;

private static final int p;

private static final float q;

private static final float r;

private static final float s;

private static final float t;

private static final float[] u;

private static final float[] v;

private static java.lang.String[] w;

private static final long x;

private static final long[] y;

private static final java.lang.Integer[] z;

private static final java.util.Map A;

private static final long[] B;

private static final java.lang.Long[] C;

private static final java.util.Map D;

public Dr() {
super();
}


static {
x = ((long)(((moom._a)(moom._c.a(((long)(-4458434176397765379L)), ((long)(-2182947936806264807L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(216579945900901L)))));

    long local22_life6 = (moom.Dr.x ^ 1851132352585L);

    java.lang.String[] __sourceSpill632_8 = new java.lang.String[5];

    A = ((java.util.Map)(new java.util.HashMap(13)));

    moom.Dr.b(((java.lang.String[])(__sourceSpill632_8)));

    javax.crypto.Cipher local11_life11;

    javax.crypto.Cipher __sourceSpill632_13 = (local11_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill632_14 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill632_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill632_16 = new byte[8];

    (__sourceSpill632_16)[0] = ((byte) ((int) (local22_life6 >>> 56)));

    int local12_life17 = 1;

    while ((local12_life17 < 8)) {

        (__sourceSpill632_16)[local12_life17] = ((byte) ((int) ((local22_life6 << (local12_life17 * 8)) >>> 56)));

        local12_life17 += 1;

    }

    byte[] __sourcePreallocation632_18 = __sourceSpill632_16;

    ((javax.crypto.Cipher)(__sourceSpill632_13)).init(((int)(__sourceSpill632_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill632_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation632_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local17_life21 = new long[71];

    int local14_life22 = 0;

    java.lang.String local15_life23;

    int local16_life25 = ((java.lang.String)((local15_life23 = "Hxu§xí&Ù\002cóçÓF6 \r%ZÀeãf*ÐI ß)RãâþÎI00F\"\t\030:\037\001\036Î\031?÷Ê0[{ðÜè9dBår=ÞDÔêao\003\007~¾\030\f;oPËFáb/ï\023\006@À$yá×¦ÚìP<_å­\"\016´ý{Ê\034:V\030[¬6ä1å\002=\177XlãÎÉêvÎ{,Tcó·½\006Ùjäÿ,º\021¡\020|i=ê-\035CÝ?{jÂÃ(æÀYÒõ·h8ERO1,-òñä»\022[7øÑÿé¨(±¼p\004\004è1+Zó/\007íÐùÙ~ßdhÈ+W<@¦\005æqâz\025\003ø{Ï¢yÊêÜÙ\034\025öUKr\026¥(è¦¡%ëÝmò\031ch%PßJð[\\ü\t\rïõæSXÏ4^ó.Ïo¹åyg`!Ï­J6áïCå\"ä¡^æIf1Í¿¡¸ÿG§{ÁÄ¼Eýug²)¯´­QÕZç2§\007%ÚRâ¦ÎÄ7«×(/ñ*¸\025~p«n\005¤àa$EF»kû¾õ`=sP5:[¿éKþ\013Ûh\nNÊÔûð¾;ïäb\030´ir\nÓ¤öÏó\t2Åö¯jeB¬S\021r#U(\020ýeFÆ¾Yë!µîThàK­æÀÈ!e§\004¡½åæD¦\020¨H¥\034}sÈ\027<ÿ}Py?ÖPÉY\034¤yò¬­Ü\031%¥×n»¬V{ÍçØ}¦,Fä&sccAéú\037³"))).length();

    int local13_life26 = 0;

    do {

        java.lang.String __sourceSpill632_27 = local15_life23;

        int __sourceSpill632_28 = local13_life26;

        local13_life26 += 8;

        byte[] local18_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_27)).substring(((int)(__sourceSpill632_28)), ((int)(local13_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill632_32 = local17_life21;

        int __sourceSpill632_33 = local14_life22;

        local14_life22 += 1;

        long local19_life34 = (((((((((((long) (local18_life31)[0]) & 255L) << 56) | ((((long) (local18_life31)[1]) & 255L) << 48)) | ((((long) (local18_life31)[2]) & 255L) << 40)) | ((((long) (local18_life31)[3]) & 255L) << 32)) | ((((long) (local18_life31)[4]) & 255L) << 24)) | ((((long) (local18_life31)[5]) & 255L) << 16)) | ((((long) (local18_life31)[6]) & 255L) << 8)) | (((long) (local18_life31)[7]) & 255L));

        byte[] __sourceSpill632_35 = new byte[8];

        (__sourceSpill632_35)[0] = ((byte) ((int) (local19_life34 >>> 56)));

        (__sourceSpill632_35)[1] = ((byte) ((int) (local19_life34 >>> 48)));

        (__sourceSpill632_35)[2] = ((byte) ((int) (local19_life34 >>> 40)));

        (__sourceSpill632_35)[3] = ((byte) ((int) (local19_life34 >>> 32)));

        (__sourceSpill632_35)[4] = ((byte) ((int) (local19_life34 >>> 24)));

        (__sourceSpill632_35)[5] = ((byte) ((int) (local19_life34 >>> 16)));

        (__sourceSpill632_35)[6] = ((byte) ((int) (local19_life34 >>> 8)));

        (__sourceSpill632_35)[7] = ((byte) ((int) local19_life34));

        javax.crypto.Cipher __sourceSpill632_36 = local11_life11;

        byte[] local21_life38 = ((javax.crypto.Cipher)(__sourceSpill632_36)).doFinal(((byte[])(__sourceSpill632_35)));

        (__sourceSpill632_32)[__sourceSpill632_33] = (((((((((((long) (local21_life38)[0]) & 255L) << 56) | ((((long) (local21_life38)[1]) & 255L) << 48)) | ((((long) (local21_life38)[2]) & 255L) << 40)) | ((((long) (local21_life38)[3]) & 255L) << 32)) | ((((long) (local21_life38)[4]) & 255L) << 24)) | ((((long) (local21_life38)[5]) & 255L) << 16)) | ((((long) (local21_life38)[6]) & 255L) << 8)) | (((long) (local21_life38)[7]) & 255L));

    } while ((!(local13_life26 >= local16_life25)));

    local16_life25 = ((java.lang.String)((local15_life23 = "Î·Üp±ªg\020êtr÷Oy±Ð"))).length();

    local13_life26 = 0;

    do {

        java.lang.String __sourceSpill632_40 = local15_life23;

        int __sourceSpill632_41 = local13_life26;

        local13_life26 += 8;

        byte[] local18_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_40)).substring(((int)(__sourceSpill632_41)), ((int)(local13_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill632_45 = local17_life21;

        int __sourceSpill632_46 = local14_life22;

        local14_life22 += 1;

        long local19_life47 = (((((((((((long) (local18_life44)[0]) & 255L) << 56) | ((((long) (local18_life44)[1]) & 255L) << 48)) | ((((long) (local18_life44)[2]) & 255L) << 40)) | ((((long) (local18_life44)[3]) & 255L) << 32)) | ((((long) (local18_life44)[4]) & 255L) << 24)) | ((((long) (local18_life44)[5]) & 255L) << 16)) | ((((long) (local18_life44)[6]) & 255L) << 8)) | (((long) (local18_life44)[7]) & 255L));

        byte[] __sourceSpill632_48 = new byte[8];

        (__sourceSpill632_48)[0] = ((byte) ((int) (local19_life47 >>> 56)));

        (__sourceSpill632_48)[1] = ((byte) ((int) (local19_life47 >>> 48)));

        (__sourceSpill632_48)[2] = ((byte) ((int) (local19_life47 >>> 40)));

        (__sourceSpill632_48)[3] = ((byte) ((int) (local19_life47 >>> 32)));

        (__sourceSpill632_48)[4] = ((byte) ((int) (local19_life47 >>> 24)));

        (__sourceSpill632_48)[5] = ((byte) ((int) (local19_life47 >>> 16)));

        (__sourceSpill632_48)[6] = ((byte) ((int) (local19_life47 >>> 8)));

        (__sourceSpill632_48)[7] = ((byte) ((int) local19_life47));

        javax.crypto.Cipher __sourceSpill632_49 = local11_life11;

        byte[] local21_life51 = ((javax.crypto.Cipher)(__sourceSpill632_49)).doFinal(((byte[])(__sourceSpill632_48)));

        (__sourceSpill632_45)[__sourceSpill632_46] = (((((((((((long) (local21_life51)[0]) & 255L) << 56) | ((((long) (local21_life51)[1]) & 255L) << 48)) | ((((long) (local21_life51)[2]) & 255L) << 40)) | ((((long) (local21_life51)[3]) & 255L) << 32)) | ((((long) (local21_life51)[4]) & 255L) << 24)) | ((((long) (local21_life51)[5]) & 255L) << 16)) | ((((long) (local21_life51)[6]) & 255L) << 8)) | (((long) (local21_life51)[7]) & 255L));

    } while ((!(local13_life26 >= local16_life25)));

    y = ((long[])(local17_life21));

    z = ((java.lang.Integer[])(new java.lang.Integer[71]));

    D = ((java.util.Map)(new java.util.HashMap(13)));

    javax.crypto.Cipher local0_life56;

    javax.crypto.Cipher __sourceSpill632_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));

    int __sourceSpill632_59 = 2;

    javax.crypto.SecretKeyFactory __sourceSpill632_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));

    byte[] __sourceSpill632_61 = new byte[8];

    (__sourceSpill632_61)[0] = ((byte) ((int) (local22_life6 >>> 56)));

    int local1_life62 = 1;

    while ((local1_life62 < 8)) {

        (__sourceSpill632_61)[local1_life62] = ((byte) ((int) ((local22_life6 << (local1_life62 * 8)) >>> 56)));

        local1_life62 += 1;

    }

    byte[] __sourcePreallocation632_63 = __sourceSpill632_61;

    ((javax.crypto.Cipher)(__sourceSpill632_58)).init(((int)(__sourceSpill632_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill632_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation632_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));

    long[] local6_life66 = new long[11];

    int local3_life67 = 0;

    java.lang.String local4_life68;

    int local5_life70 = ((java.lang.String)((local4_life68 = "áÝã¾\001råôL\035\000H[î£\022aß\007ÕîO\007:æ\b\177zó\032\026\022¶b1¯ÎnÊ\016ÐäÅ¼R-Ø»\034ó¯\036p²\tkf³)\035R\f2"))).length();

    int local2_life71 = 0;

    do {

        java.lang.String __sourceSpill632_72 = local4_life68;

        int __sourceSpill632_73 = local2_life71;

        local2_life71 += 8;

        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_72)).substring(((int)(__sourceSpill632_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill632_77 = local6_life66;

        int __sourceSpill632_78 = local3_life67;

        local3_life67 += 1;

        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));

        byte[] __sourceSpill632_80 = new byte[8];

        (__sourceSpill632_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));

        (__sourceSpill632_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));

        (__sourceSpill632_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));

        (__sourceSpill632_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));

        (__sourceSpill632_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));

        (__sourceSpill632_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));

        (__sourceSpill632_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));

        (__sourceSpill632_80)[7] = ((byte) ((int) local8_life79));

        javax.crypto.Cipher __sourceSpill632_81 = local0_life56;

        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill632_81)).doFinal(((byte[])(__sourceSpill632_80)));

        (__sourceSpill632_77)[__sourceSpill632_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));

    } while ((!(local2_life71 >= local5_life70)));

    local5_life70 = ((java.lang.String)((local4_life68 = "è£°£à\027} ÒLâ1ûú"))).length();

    local2_life71 = 0;

    do {

        java.lang.String __sourceSpill632_85 = local4_life68;

        int __sourceSpill632_86 = local2_life71;

        local2_life71 += 8;

        byte[] local7_life89 = ((java.lang.String)(((java.lang.String)(__sourceSpill632_85)).substring(((int)(__sourceSpill632_86)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));

        long[] __sourceSpill632_90 = local6_life66;

        int __sourceSpill632_91 = local3_life67;

        local3_life67 += 1;

        long local8_life92 = (((((((((((long) (local7_life89)[0]) & 255L) << 56) | ((((long) (local7_life89)[1]) & 255L) << 48)) | ((((long) (local7_life89)[2]) & 255L) << 40)) | ((((long) (local7_life89)[3]) & 255L) << 32)) | ((((long) (local7_life89)[4]) & 255L) << 24)) | ((((long) (local7_life89)[5]) & 255L) << 16)) | ((((long) (local7_life89)[6]) & 255L) << 8)) | (((long) (local7_life89)[7]) & 255L));

        byte[] __sourceSpill632_93 = new byte[8];

        (__sourceSpill632_93)[0] = ((byte) ((int) (local8_life92 >>> 56)));

        (__sourceSpill632_93)[1] = ((byte) ((int) (local8_life92 >>> 48)));

        (__sourceSpill632_93)[2] = ((byte) ((int) (local8_life92 >>> 40)));

        (__sourceSpill632_93)[3] = ((byte) ((int) (local8_life92 >>> 32)));

        (__sourceSpill632_93)[4] = ((byte) ((int) (local8_life92 >>> 24)));

        (__sourceSpill632_93)[5] = ((byte) ((int) (local8_life92 >>> 16)));

        (__sourceSpill632_93)[6] = ((byte) ((int) (local8_life92 >>> 8)));

        (__sourceSpill632_93)[7] = ((byte) ((int) local8_life92));

        javax.crypto.Cipher __sourceSpill632_94 = local0_life56;

        byte[] local10_life96 = ((javax.crypto.Cipher)(__sourceSpill632_94)).doFinal(((byte[])(__sourceSpill632_93)));

        (__sourceSpill632_90)[__sourceSpill632_91] = (((((((((((long) (local10_life96)[0]) & 255L) << 56) | ((((long) (local10_life96)[1]) & 255L) << 48)) | ((((long) (local10_life96)[2]) & 255L) << 40)) | ((((long) (local10_life96)[3]) & 255L) << 32)) | ((((long) (local10_life96)[4]) & 255L) << 24)) | ((((long) (local10_life96)[5]) & 255L) << 16)) | ((((long) (local10_life96)[6]) & 255L) << 8)) | (((long) (local10_life96)[7]) & 255L));

    } while ((!(local2_life71 >= local5_life70)));

    B = ((long[])(local6_life66));

    C = ((java.lang.Long[])(new java.lang.Long[11]));

    a = ((float)(moom.Dr.c(((float)(0x1.0p1f)))));

    b = ((float)(moom.N2.a(((double)(0x1.921fb54442d18p1d)))));

    c = ((float)(moom.N2.a(((double)(0x1.921fb54442d18p2d)))));

    d = ((float)(moom.N2.a(((double)(0x1.921fb54442d18p0d)))));

    e = ((float)(moom.N2.a(((double)(0x1.45f306dc9c883p9d)))));

    f = ((float)(moom.N2.a(((double)(0x1.1df46a2529d39p-6d)))));

    g = ((float[])(new float[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_111(29687, (414363748892574118L ^ local22_life6))]));

    h = ((boolean)(false));

    i = ((float[])(new float[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_114(9042, (2673357300123226422L ^ local22_life6))]));

    int local24_life116 = 0;

    while ((local24_life116 < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_117(11746, (5940652810566426508L ^ local22_life6)))) {

        (moom.Dr.i)[local24_life116] = ((float) java.lang.Math.sin(((double)((((((double) local24_life116) * 0x1.921fb54442d18p1d) * 0x1.0p1d) / 0x1.0p16d)))));

        local24_life116 += 1;

    }

    local24_life116 = 0;

    while ((local24_life116 < (moom.Dr.g).length)) {

        (moom.Dr.g)[local24_life116] = moom.N2.a(((double)(java.lang.Math.sin(((double)((((((double) local24_life116) * 0x1.921fb54442d18p1d) * 0x1.0p1d) / 0x1.0p12d)))))));

        local24_life116 += 1;

    }

    int[] __sourceSpill632_125 = new int[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_124(991, (5178169760005452173L ^ local22_life6))];

    (__sourceSpill632_125)[0] = 0;

    (__sourceSpill632_125)[1] = 1;

    (__sourceSpill632_125)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_126(4242, (7633926841463399109L ^ local22_life6));

    (__sourceSpill632_125)[3] = 2;

    (__sourceSpill632_125)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_127(19004, (9189517462108616816L ^ local22_life6));

    (__sourceSpill632_125)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_128(30002, (8121406742635677517L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_129(1428, (4640011030595925902L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_130(27302, (3711568988245334209L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_131(1054, (6125066760182298113L ^ local22_life6))] = 3;

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_132(25691, (8502636982475462193L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_133(25543, (4769553047426732420L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_134(8447, (3583839770148491948L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_135(6818, (5364333258503841983L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_136(22796, (6347817724638636823L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_137(1868, (7235432201579361582L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_138(12862, (4493970843889844297L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_139(20043, (3147645208696634372L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_140(7753, (6117314217505549335L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_141(21591, (2667373451535328815L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_142(28012, (6998078158963973948L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_143(16996, (463314393679114278L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_144(8655, (1246545856848024506L ^ local22_life6))] = 4;

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_145(27314, (7911357816765028585L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_146(22426, (5969638060045968849L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_147(17042, (6479549356008878278L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_148(14120, (557081863413220698L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_149(31209, (8219967137892469640L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_150(16927, (4927735023235706979L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_151(21827, (7568715519621080864L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_152(14952, (8924968770996815894L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_153(1640, (2063634740693103620L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_154(10709, (4009273222454959049L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_155(20181, (2172410614078422195L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_156(3621, (7161503563642731621L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_157(24651, (3594949796928000526L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_158(16161, (649858236138933612L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_159(19283, (7918400077647133003L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_160(565, (1544002429514444894L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_161(8230, (2114419852843897454L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_162(13263, (7395163167520604625L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_163(25388, (5962917763954282856L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_164(31019, (2811239205438196598L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_165(17978, (141842947496424533L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_166(29757, (6074574028673975886L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_167(29114, (3407806357248771069L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_168(20667, (9190024569123906246L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_169(30444, (5501580659857687732L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_170(30619, (4112488357783373265L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_171(6481, (6928991871185972020L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_172(18136, (4075243207449162921L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_173(10161, (1823234532983625208L ^ local22_life6))] = 5;

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_174(11944, (6701082767217057010L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_175(22209, (2123655257778988167L ^ local22_life6));

    (__sourceSpill632_125)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_176(30240, (6537314785355433084L ^ local22_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_177(26406, (170821253358753151L ^ local22_life6));

    j = ((int[])(__sourceSpill632_125));

    int __sourceSpill632_182 = 19617;

    k = ((double)(java.lang.Double.longBitsToDouble(((long)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_179(19049, (5416521101966988173L ^ local22_life6)))))));

    l = ((double[])(new double[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_183(__sourceSpill632_182, (1997863786559651543L ^ local22_life6))]));

    m = ((double[])(new double[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_185(8271, (7765248378012619317L ^ local22_life6))]));

    local24_life116 = 0;

    while ((local24_life116 < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_187(8271, (7765248378012619317L ^ local22_life6)))) {

        double local25_life188 = (((double) local24_life116) / 0x1.0p8d);

        double local27_life190 = java.lang.Math.asin(((double)(local25_life188)));

        (moom.Dr.m)[local24_life116] = java.lang.Math.cos(((double)(local27_life190)));

        (moom.Dr.l)[local24_life116] = local27_life190;

        local24_life116 += 1;

    }

    n = ((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_194(29757, (6074574028673975886L ^ local22_life6))));

    o = ((int)(((-1 << moom.Dr.n) ^ -1)));

    p = ((int)((moom.Dr.o + 1)));

    q = ((float)(0x1.921fb6p2f));

    s = ((float)(0x1.68p8f));

    r = ((float)((((float) moom.Dr.p) / moom.Dr.q)));

    t = ((float)((((float) moom.Dr.p) / moom.Dr.s)));

    u = ((float[])(new float[moom.Dr.p]));

    v = ((float[])(new float[moom.Dr.p]));

    local24_life116 = 0;

    while ((local24_life116 < moom.Dr.p)) {

        (moom.Dr.u)[local24_life116] = ((float) java.lang.Math.sin(((double)(((double) (((((float) local24_life116) + 0x1.0p-1f) / ((float) moom.Dr.p)) * moom.Dr.q))))));

        (moom.Dr.v)[local24_life116] = ((float) java.lang.Math.cos(((double)(((double) (((((float) local24_life116) + 0x1.0p-1f) / ((float) moom.Dr.p)) * moom.Dr.q))))));

        local24_life116 += 1;

    }

    local24_life116 = 0;

    while ((local24_life116 < __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_221(24894, (7213356913435087685L ^ local22_life6)))) {

        (moom.Dr.u)[(((int) (((float) local24_life116) * moom.Dr.t)) & moom.Dr.o)] = ((float) java.lang.Math.sin(((double)(((((double) local24_life116) * 0x1.921fb54442d18p1d) / 0x1.68p7d)))));

        (moom.Dr.v)[(((int) (((float) local24_life116) * moom.Dr.t)) & moom.Dr.o)] = ((float) java.lang.Math.cos(((double)(((((double) local24_life116) * 0x1.921fb54442d18p1d) / 0x1.68p7d)))));

        local24_life116 += 90;

    }
}


public static int b(int p0) {
long local1 = (moom.Dr.x ^ 25901817920505L);
    int local3 = (p0 - 1);
    local3 = (local3 | (local3 >> 1));
    local3 = (local3 | (local3 >> 2));
    local3 = (local3 | (local3 >> 4));
    local3 = (local3 | (local3 >> __sourceIntrinsic_ead3c349e325_originalDynamicSite1113_1(22426, (5969657707160979041L ^ local1))));
    local3 = (local3 | (local3 >> __sourceIntrinsic_ead3c349e325_originalDynamicSite1113_2(565, (1544013559178826734L ^ local1))));
    return (local3 + 1);
}


public static int b(int p0, int p1, int p2) {
long local3 = (moom.Dr.x ^ 44794412028622L);
    int local5 = ((p0 << __sourceIntrinsic_2b3991846d2f_originalDynamicSite1114_1(22426, (5969595237056868182L ^ local3))) + p1);
    local5 = ((local5 << __sourceIntrinsic_2b3991846d2f_originalDynamicSite1114_2(22426, (5969595237056868182L ^ local3))) + p2);
    return local5;
}


public static double b(double p0) {
return (p0 - java.lang.Math.floor(((double)(p0))));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4241_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Dr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int b(int p0, int p1) {
return (((p0 % p1) + p1) % p1);
}


public static double b(double p0, double p1, double p2) {
int forwardValue1764_19_0;
    double forwardValue1764_28_0;
    double forwardValue1764_28_1;
    double forwardValue1764_29_0;
    int spill1764_0;
    double spill1764_1;
    double spill1764_2;
    long life6_3;
    int life8_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_22: {
    forward_join_19: {
    forward_join_14: {
    life6_3 = (moom.Dr.x ^ 6205483703371L);
    life8_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1764_0 = recovery.source.CarrierOps.dcmpg(((double)(p2)), ((double)(0x0.0p0d)));
    if (!((life8_5 != 0))) {
        forwardValue1764_19_0 = spill1764_0;
        break forward_join_19;
    }
    if (!((spill1764_0 < 0))) {
        break forward_join_14;
    }
    forwardValue1764_29_0 = p0;
    break forward_join_29;
    }
    spill1764_1 = p2;
    spill1764_2 = 0x1.0p0d;
    if (!((life8_5 != 0))) {
        forwardValue1764_28_0 = spill1764_1;
        forwardValue1764_28_1 = spill1764_2;
        break forward_join_28;
    }
    forwardValue1764_19_0 = recovery.source.CarrierOps.dcmpl(((double)(spill1764_1)), ((double)(spill1764_2)));
    }
    if (!((forwardValue1764_19_0 > 0))) {
        break forward_join_22;
    }
    forwardValue1764_29_0 = p1;
    break forward_join_29;
    }
    forwardValue1764_28_0 = p0;
    forwardValue1764_28_1 = ((p1 - p0) * p2);
    }
    forwardValue1764_29_0 = (forwardValue1764_28_0 + forwardValue1764_28_1);
    }
    return forwardValue1764_29_0;
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.Dr.b(((int)(local4)), ((long)(local5)));
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 1067);
    if (((moom.Dr.C)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.Dr.B)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.Dr.D)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Dr.D)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Dr", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.Dr.C)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.Dr.C)[life3_8])).longValue();
}


public static java.lang.String[] b() {
return moom.Dr.w;
}


public static void b(java.lang.String[] p0) {
moom.Dr.w = ((java.lang.String[])(p0));
    return;
}


public static int b(float p0, float p1, float p2) {
boolean spill600_0;
    long life3_3;
    int life6_14;
    float life7_22;
    float life8_28;
    float life9_36;
    float life10_46;
    int life5_47;
    float life11_51;
    float life12_53;
    float life13_55;
    int life14_117;
    int life15_129;
    int life16_141;
    forest_join_106: {
    forest_join_98: {
    forest_join_90: {
    forest_join_82: {
    forest_join_74: {
    forest_join_66: {
    forest_join_58: {
    forest_join_50: {
    life3_3 = (moom.Dr.x ^ 18851264968678L);
    life6_14 = (((int) (p0 * 0x1.8p2f)) % __sourceIntrinsic_2da6f9ba0467_invokedynamic600_1(30619, (4112471272904862334L ^ life3_3)));
    spill600_0 = moom.DS.b__Boolean();
    life7_22 = ((p0 * 0x1.8p2f) - ((float) life6_14));
    life8_28 = (p2 * (0x1.0p0f - p1));
    life9_36 = (p2 * (0x1.0p0f - (life7_22 * p1)));
    life10_46 = (p2 * (0x1.0p0f - ((0x1.0p0f - life7_22) * p1)));
    life5_47 = ((spill600_0) ? 1 : 0);
    switch (life6_14) {
case 0:
{
        break forest_join_50;
    }
case 1:
{
        break forest_join_58;
    }
case 2:
{
        break forest_join_66;
    }
case 3:
{
        break forest_join_74;
    }
case 4:
{
        break forest_join_82;
    }
case 5:
{
        break forest_join_90;
    }
default:
{
        break forest_join_98;
    }
}
    }
    life11_51 = p2;
    life12_53 = life10_46;
    life13_55 = life8_28;
    if (!((life5_47 != 0))) {
        break forest_join_106;
    }
    }
    life11_51 = life9_36;
    life12_53 = p2;
    life13_55 = life8_28;
    if (!((life5_47 != 0))) {
        break forest_join_106;
    }
    }
    life11_51 = life8_28;
    life12_53 = p2;
    life13_55 = life10_46;
    if (!((life5_47 != 0))) {
        break forest_join_106;
    }
    }
    life11_51 = life8_28;
    life12_53 = life9_36;
    life13_55 = p2;
    if (!((life5_47 != 0))) {
        break forest_join_106;
    }
    }
    life11_51 = life10_46;
    life12_53 = life8_28;
    life13_55 = p2;
    if (!((life5_47 != 0))) {
        break forest_join_106;
    }
    }
    life11_51 = p2;
    life12_53 = life8_28;
    life13_55 = life9_36;
    if (!((life5_47 != 0))) {
        break forest_join_106;
    }
    }
    throw new java.lang.RuntimeException(__sourceIntrinsic_2da6f9ba0467_invokedynamic600_4(p0, p1, p2));
    }
    life14_117 = moom.Dr.a(((int)(((int) (life11_51 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_2da6f9ba0467_invokedynamic600_5(16545, (5269732182480952675L ^ life3_3)))));
    life15_129 = moom.Dr.a(((int)(((int) (life12_53 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_2da6f9ba0467_invokedynamic600_7(24568, (6836830311683162670L ^ life3_3)))));
    life16_141 = moom.Dr.a(((int)(((int) (life13_55 * 0x1.fep7f)))), ((int)(0)), ((int)(__sourceIntrinsic_2da6f9ba0467_invokedynamic600_9(24568, (6836830311683162670L ^ life3_3)))));
    return (((life14_117 << __sourceIntrinsic_2da6f9ba0467_invokedynamic600_11(565, (1544020596586307569L ^ life3_3))) | (life15_129 << __sourceIntrinsic_2da6f9ba0467_invokedynamic600_12(22426, (5969656158394550910L ^ life3_3)))) | life16_141);
}


public static double b(double p0, double p1) {
int forwardValue670000_24_0;
    int forwardValue670000_28_0;
    int forwardValue670000_30_0;
    int forwardValue670000_41_0;
    int forwardValue670000_45_0;
    int forwardValue670000_47_0;
    int forwardValue670000_58_0;
    int forwardValue670000_62_0;
    int forwardValue670000_64_0;
    int forwardValue670000_135_0;
    int forwardValue670000_143_0;
    boolean spill670000_0;
    boolean spill670000_1;
    int spill670000_2;
    int spill670000_3;
    int spill670000_4;
    long life4_3;
    double life7_12;
    int life6_13;
    int life9_38;
    int life10_61;
    int life11_84;
    double life12_88;
    double life12_95;
    double life2_99;
    double life0_103;
    double life14_107;
    int life16_111;
    double life17_115;
    double life19_119;
    double life21_123;
    double life23_131;
    double life25_141;
    double life27_145;
    forward_join_147: {
    forward_join_143: {
    forward_join_142: {
    forward_join_135: {
    forward_join_134: {
    forward_join_73: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_58: {
    forward_join_55: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    forward_join_41: {
    forward_join_38: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_21: {
    life4_3 = (moom.Dr.x ^ 73131609732425L);
    spill670000_0 = moom.DS.b__Boolean();
    life7_12 = ((p1 * p1) + (p0 * p0));
    life6_13 = ((spill670000_0) ? 1 : 0);
    spill670000_1 = java.lang.Double.isNaN(((double)(life7_12)));
    if (!((life6_13 == 0))) {
        forwardValue670000_24_0 = ((spill670000_1) ? 1 : 0);
        break forward_join_24;
    }
    if (!(spill670000_1)) {
        break forward_join_21;
    }
    return __sourceIntrinsic_8f3a06b7a0e8_exactNonfiniteDoubleLiteral670000_5();
    }
    forwardValue670000_24_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(0x0.0p0d)));
    }
    if (!((life6_13 == 0))) {
        forwardValue670000_28_0 = forwardValue670000_24_0;
        break forward_join_28;
    }
    if (!((forwardValue670000_24_0 < 0))) {
        break forward_join_29;
    }
    forwardValue670000_28_0 = 1;
    }
    forwardValue670000_30_0 = forwardValue670000_28_0;
    break forward_join_30;
    }
    forwardValue670000_30_0 = 0;
    }
    life9_38 = forwardValue670000_30_0;
    spill670000_2 = life9_38;
    if (!((life6_13 == 0))) {
        forwardValue670000_41_0 = spill670000_2;
        break forward_join_41;
    }
    if (!((spill670000_2 != 0))) {
        break forward_join_38;
    }
    p0 = (-p0);
    }
    forwardValue670000_41_0 = recovery.source.CarrierOps.dcmpg(((double)(p1)), ((double)(0x0.0p0d)));
    }
    if (!((life6_13 == 0))) {
        forwardValue670000_45_0 = forwardValue670000_41_0;
        break forward_join_45;
    }
    if (!((forwardValue670000_41_0 < 0))) {
        break forward_join_46;
    }
    forwardValue670000_45_0 = 1;
    }
    forwardValue670000_47_0 = forwardValue670000_45_0;
    break forward_join_47;
    }
    forwardValue670000_47_0 = 0;
    }
    life10_61 = forwardValue670000_47_0;
    spill670000_3 = life10_61;
    if (!((life6_13 == 0))) {
        forwardValue670000_58_0 = spill670000_3;
        break forward_join_58;
    }
    if (!((spill670000_3 != 0))) {
        break forward_join_55;
    }
    p1 = (-p1);
    }
    forwardValue670000_58_0 = recovery.source.CarrierOps.dcmpl(((double)(p0)), ((double)(p1)));
    }
    if (!((life6_13 == 0))) {
        forwardValue670000_62_0 = forwardValue670000_58_0;
        break forward_join_62;
    }
    if (!((forwardValue670000_58_0 > 0))) {
        break forward_join_63;
    }
    forwardValue670000_62_0 = 1;
    }
    forwardValue670000_64_0 = forwardValue670000_62_0;
    break forward_join_64;
    }
    forwardValue670000_64_0 = 0;
    }
    life11_84 = forwardValue670000_64_0;
    if (!((life11_84 != 0))) {
        break forward_join_73;
    }
    life12_88 = p1;
    p1 = p0;
    p0 = life12_88;
    }
    life12_95 = moom.Dr.c(((double)(life7_12)));
    life2_99 = (p1 * life12_95);
    life0_103 = (p0 * life12_95);
    life14_107 = (moom.Dr.k + life0_103);
    life16_111 = ((int) java.lang.Double.doubleToRawLongBits(((double)(life14_107))));
    life17_115 = (moom.Dr.l)[life16_111];
    life19_119 = (moom.Dr.m)[life16_111];
    life21_123 = (life14_107 - moom.Dr.k);
    life23_131 = ((life0_103 * life19_119) - (life2_99 * life21_123));
    life25_141 = (((0x1.8p2d + (life23_131 * life23_131)) * life23_131) * 0x1.5555555555555p-3d);
    life27_145 = (life17_115 + life25_141);
    spill670000_4 = life11_84;
    if (!((life6_13 == 0))) {
        forwardValue670000_135_0 = spill670000_4;
        break forward_join_135;
    }
    if (!((spill670000_4 != 0))) {
        break forward_join_134;
    }
    life27_145 = (0x1.921fb54442d18p0d - life27_145);
    }
    forwardValue670000_135_0 = life10_61;
    }
    if (!((life6_13 == 0))) {
        forwardValue670000_143_0 = forwardValue670000_135_0;
        break forward_join_143;
    }
    if (!((forwardValue670000_135_0 != 0))) {
        break forward_join_142;
    }
    life27_145 = (0x1.921fb54442d18p1d - life27_145);
    }
    forwardValue670000_143_0 = life9_38;
    }
    if (!((forwardValue670000_143_0 != 0))) {
        break forward_join_147;
    }
    life27_145 = (-life27_145);
    }
    return life27_145;
}


public static int b__Int(float p0) {
long local1 = (moom.Dr.x ^ 26814337105444L);
    int local3 = ((int) p0);
    return ((p0 > ((float) local3)) ? (local3 + 1) : local3);
}


public static float b(float p0) {
long local1 = (moom.Dr.x ^ 110595427511864L);
    return (moom.Dr.h ? (moom.Dr.g)[(((int) ((p0 * moom.Dr.e) + 0x1.0p10f)) & __sourceIntrinsic_0fb642a4098e_invokedynamic4247_4(3490, (8325652466245290373L ^ local1)))] : (moom.Dr.i)[(((int) ((p0 * 0x1.45f306p13f) + 0x1.0p14f)) & __sourceIntrinsic_0fb642a4098e_invokedynamic4247_6(18830, (6551373868217961887L ^ local1)))]);
}


public static int b__Int(double p0) {
int forwardValue1766_19_0;
    int forwardValue1766_21_0;
    boolean spill1766_0;
    int spill1766_1;
    long life2_3;
    int life5_7;
    int life4_8;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (moom.Dr.x ^ 94673643605047L);
    spill1766_0 = moom.DS.c__Boolean();
    life5_7 = ((int) p0);
    life4_8 = ((spill1766_0) ? 1 : 0);
    spill1766_1 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(((double) life5_7))));
    if (!((life4_8 != 0))) {
        forwardValue1766_19_0 = spill1766_1;
        break forward_join_19;
    }
    if (!((spill1766_1 < 0))) {
        break forward_join_20;
    }
    forwardValue1766_19_0 = (life5_7 - 1);
    }
    forwardValue1766_21_0 = forwardValue1766_19_0;
    break forward_join_21;
    }
    forwardValue1766_21_0 = life5_7;
    }
    return forwardValue1766_21_0;
}


public static float e(float p0) {
int forwardValue1770_25_0;
    float forwardValue1770_31_0;
    boolean spill1770_0;
    int spill1770_1;
    float spill1770_2;
    long life1_3;
    float life0_8;
    int life3_9;
    forward_join_31: {
    forward_join_30: {
    forward_join_25: {
    forward_join_20: {
    life1_3 = (moom.Dr.x ^ 40987988113737L);
    spill1770_0 = moom.DS.b__Boolean();
    life0_8 = (p0 % 0x1.68p8f);
    life3_9 = ((spill1770_0) ? 1 : 0);
    spill1770_1 = recovery.source.CarrierOps.fcmpl(((float)(life0_8)), ((float)(0x1.68p7f)));
    if (!((life3_9 == 0))) {
        forwardValue1770_25_0 = spill1770_1;
        break forward_join_25;
    }
    if (!((spill1770_1 >= 0))) {
        break forward_join_20;
    }
    life0_8 = (life0_8 - 0x1.68p8f);
    }
    spill1770_2 = life0_8;
    if (!((life3_9 == 0))) {
        forwardValue1770_31_0 = spill1770_2;
        break forward_join_31;
    }
    forwardValue1770_25_0 = recovery.source.CarrierOps.fcmpg(((float)(spill1770_2)), ((float)(-0x1.68p7f)));
    }
    if (!((forwardValue1770_25_0 < 0))) {
        break forward_join_30;
    }
    life0_8 = (life0_8 + 0x1.68p8f);
    }
    forwardValue1770_31_0 = life0_8;
    }
    return forwardValue1770_31_0;
}


private static int c(int p0) {
long local1 = (moom.Dr.x ^ 36270536321312L);
    p0 = (moom.Dr.a__Boolean(((int)(p0))) ? p0 : moom.Dr.b(((int)(p0))));
    return (moom.Dr.j)[(((int) ((((long) p0) * __sourceIntrinsic_eeb6dc45553b_invokedynamic4250_4(9519, (5107407287069822379L ^ local1))) >> __sourceIntrinsic_eeb6dc45553b_invokedynamic4250_5(30444, (5501616598458496477L ^ local1)))) & __sourceIntrinsic_eeb6dc45553b_invokedynamic4250_6(30240, (6537278851989239061L ^ local1)))];
}


public static float c(float p0) {
return ((float) java.lang.Math.sqrt(((double)(((double) p0)))));
}


public static double c(double p0, double p1, double p2) {
return ((p0 - p1) / (p2 - p1));
}


public static double c(double p0) {
long local2 = (moom.Dr.x ^ 54282725050314L);
    double local4 = (0x1.0p-1d * p0);
    long local6 = java.lang.Double.doubleToRawLongBits(((double)(p0)));
    local6 = (__sourceIntrinsic_c7afef5f4ee4_originalDynamicSite1115_2(12528, (2941312362593973907L ^ local2)) - (local6 >> 1));
    p0 = java.lang.Double.longBitsToDouble(((long)(local6)));
    p0 = (p0 * (0x1.8p0d - ((local4 * p0) * p0)));
    return p0;
}


public static int c(int p0, int p1) {
int forwardValue1767_13_0;
    int forwardValue1767_19_0;
    int forwardValue1767_29_0;
    int forwardValue1767_39_0;
    int forwardValue1767_41_0;
    int spill1767_0;
    int spill1767_1;
    long life2_3;
    int life4_5;
    int life5_42;
    forward_join_41: {
    forward_join_39: {
    forward_join_36: {
    forward_join_29: {
    forward_join_26: {
    forward_join_19: {
    forward_join_18: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.Dr.x ^ 97432143904365L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1767_0 = p1;
    if (!((life4_5 != 0))) {
        forwardValue1767_13_0 = spill1767_0;
        break forward_join_13;
    }
    if (!((spill1767_0 == 0))) {
        break forward_join_12;
    }
    return 0;
    }
    forwardValue1767_13_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue1767_19_0 = forwardValue1767_13_0;
        break forward_join_19;
    }
    if (!((forwardValue1767_13_0 == 0))) {
        break forward_join_18;
    }
    return p1;
    }
    forwardValue1767_19_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue1767_29_0 = forwardValue1767_19_0;
        break forward_join_29;
    }
    if (!((forwardValue1767_19_0 < 0))) {
        break forward_join_26;
    }
    p1 = (p1 * -1);
    }
    forwardValue1767_29_0 = (p0 % p1);
    }
    life5_42 = forwardValue1767_29_0;
    spill1767_1 = life5_42;
    if (!((life4_5 != 0))) {
        forwardValue1767_39_0 = spill1767_1;
        break forward_join_39;
    }
    if (!((spill1767_1 == 0))) {
        break forward_join_36;
    }
    forwardValue1767_41_0 = p0;
    break forward_join_41;
    }
    forwardValue1767_39_0 = (p0 + p1);
    }
    forwardValue1767_41_0 = (forwardValue1767_39_0 - life5_42);
    }
    return forwardValue1767_41_0;
}


public static int c__Int(double p0) {
double forwardValue1768_17_0;
    double forwardValue1768_17_1;
    double forwardValue1768_18_0;
    double spill1768_0;
    double spill1768_1;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_14: {
    life2_3 = (moom.Dr.x ^ 86018900968217L);
    life4_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1768_0 = p0;
    spill1768_1 = 0x0.0p0d;
    if (!((life4_5 == 0))) {
        forwardValue1768_17_0 = spill1768_0;
        forwardValue1768_17_1 = spill1768_1;
        break forward_join_17;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1768_0)), ((double)(spill1768_1))) >= 0))) {
        break forward_join_14;
    }
    forwardValue1768_18_0 = p0;
    break forward_join_18;
    }
    forwardValue1768_17_0 = (-p0);
    forwardValue1768_17_1 = 0x1.0p0d;
    }
    forwardValue1768_18_0 = (forwardValue1768_17_0 + forwardValue1768_17_1);
    }
    return ((int) forwardValue1768_18_0);
}


public static int d(double p0) {
long local2 = (moom.Dr.x ^ 139688482709164L);
    int local4 = ((int) p0);
    return ((p0 > ((double) local4)) ? (local4 + 1) : local4);
}


public static int d(int p0, int p1) {
long local2 = (moom.Dr.x ^ 37211095018901L);
    int local4 = ((p0 & __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_1(23016, (4632302695564222059L ^ local2))) >> __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_2(565, (1543967761041180034L ^ local2)));
    int local5 = ((p1 & __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_3(28716, (7299058944233781169L ^ local2))) >> __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_4(565, (1543967761041180034L ^ local2)));
    int local6 = ((p0 & __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_5(25871, (2198061027284591291L ^ local2))) >> __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_6(22426, (5969603043681800205L ^ local2)));
    int local7 = ((p1 & __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_7(25535, (3722811408069141558L ^ local2))) >> __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_8(22426, (5969603043681800205L ^ local2)));
    int local8 = (p0 & __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_9(24568, (6836882052014774365L ^ local2)));
    int local9 = (p1 & __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_10(24568, (6836882052014774365L ^ local2)));
    int local10 = ((int) ((((float) local4) * ((float) local5)) / 0x1.fep7f));
    int local11 = ((int) ((((float) local6) * ((float) local7)) / 0x1.fep7f));
    int local12 = ((int) ((((float) local8) * ((float) local9)) / 0x1.fep7f));
    return ((((p0 & __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_11(15151, (7385101372409379971L ^ local2))) | (local10 << __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_12(565, (1543967761041180034L ^ local2)))) | (local11 << __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_13(22426, (5969603043681800205L ^ local2)))) | local12);
}


public static float d(float p0) {
float forwardValue1769_15_0;
    float forwardValue1769_16_0;
    float spill1769_0;
    long life1_3;
    int life3_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.Dr.x ^ 90097074003205L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1769_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue1769_15_0 = spill1769_0;
        break forward_join_15;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1769_0)), ((float)(0x0.0p0f))) >= 0))) {
        break forward_join_14;
    }
    forwardValue1769_16_0 = p0;
    break forward_join_16;
    }
    forwardValue1769_15_0 = p0;
    }
    forwardValue1769_16_0 = (-forwardValue1769_15_0);
    }
    return forwardValue1769_16_0;
}


public static int d(int p0) {
long local1 = (moom.Dr.x ^ 110433057086839L);
    return (moom.Dr.c(((int)(p0))) - (moom.Dr.a__Boolean(((int)(p0))) ? 0 : 1));
}


public static float a(float p0, float p1) {
return ((float) moom.Dr.b(((double)(((double) p0))), ((double)(((double) p1)))));
}


public static long a(moom.DS p0) {
return moom.Dr.a__Long(((int)(((moom.DS)(p0)).a())), ((int)(((moom.DS)(p0)).b())), ((int)(((moom.DS)(p0)).c())));
}


public static java.util.UUID a(java.util.Random p0) {
long local1 = (moom.Dr.x ^ 91158473399648L);
    long local3 = ((((java.util.Random)(p0)).nextLong() & __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_2(5084, (1314615137552092953L ^ local1))) | __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_3(25015, (3236736966230556028L ^ local1)));
    long local5 = ((((java.util.Random)(p0)).nextLong() & __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_5(22168, (319965785616517714L ^ local1))) | __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_6(2450, (6710931892329076061L ^ local1)));
    return new java.util.UUID(local3, local5);
}


public static long a__Long(int p0, int p1, int p2) {
long local3 = (moom.Dr.x ^ 63083158105603L);
    long local5 = (((((long) p0) * __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_1(15869, (3030932064843027024L ^ local3))) ^ (((long) p2) * __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_2(2886, (1436742374441968866L ^ local3)))) ^ ((long) p1));
    local5 = (((local5 * local5) * __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_3(2307, (7806553687647446700L ^ local3))) + (local5 * __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_4(868, (2134588076506639567L ^ local3))));
    return local5;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6F91;
        if (z[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = y[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])A.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    A.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Dr", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Dr.z[n2] = n4;
        }
        return z[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Dr.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4256_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Dr"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static float a(float p0) {
long local1 = (moom.Dr.x ^ 140426043861895L);
    return (moom.Dr.h ? (moom.Dr.g)[(((int) (p0 * moom.Dr.e)) & __sourceIntrinsic_ab368a0e25ae_invokedynamic4257_4(23184, (7742313485975886608L ^ local1)))] : (moom.Dr.i)[(((int) (p0 * 0x1.45f306p13f)) & __sourceIntrinsic_ab368a0e25ae_invokedynamic4257_6(454, (2698012930443985020L ^ local1)))]);
}


public static int a(java.lang.String p0, int p1, int p2) {
return java.lang.Math.max(((int)(p2)), ((int)(moom.Dr.a(((java.lang.String)(p0)), ((int)(p1))))));
}


public static int a__Int(double p0) {
long local2 = (moom.Dr.x ^ 65586104124092L);
    return (((int) (p0 + 0x1.0p10d)) - __sourceIntrinsic_0546e0f474f8_originalDynamicSite1119_1(2288, (685925667297730668L ^ local2)));
}


public static int a__Int(float p0) {
int forwardValue1762_19_0;
    int forwardValue1762_21_0;
    boolean spill1762_0;
    int spill1762_1;
    long life1_3;
    int life4_7;
    int life3_8;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life1_3 = (moom.Dr.x ^ 27474085679624L);
    spill1762_0 = moom.DS.b__Boolean();
    life4_7 = ((int) p0);
    life3_8 = ((spill1762_0) ? 1 : 0);
    spill1762_1 = recovery.source.CarrierOps.fcmpg(((float)(p0)), ((float)(((float) life4_7))));
    if (!((life3_8 == 0))) {
        forwardValue1762_19_0 = spill1762_1;
        break forward_join_19;
    }
    if (!((spill1762_1 < 0))) {
        break forward_join_20;
    }
    forwardValue1762_19_0 = (life4_7 - 1);
    }
    forwardValue1762_21_0 = forwardValue1762_19_0;
    break forward_join_21;
    }
    forwardValue1762_21_0 = life4_7;
    }
    return forwardValue1762_21_0;
}


public static float a__Float(double p0) {
return ((float) java.lang.Math.sqrt(((double)(p0))));
}


private static java.lang.RuntimeException a(java.lang.RuntimeException p0) {
return p0;
}


public static int a(java.util.Random p0, int p1, int p2) {
int forwardValue1758_21_0;
    int forwardValue1758_21_1;
    int forwardValue1758_22_0;
    int spill1758_0;
    int spill1758_1;
    long life3_3;
    int life5_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_13: {
    life3_3 = (moom.Dr.x ^ 103651345211900L);
    life5_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1758_0 = p1;
    spill1758_1 = p2;
    if (!((life5_5 != 0))) {
        forwardValue1758_21_0 = spill1758_0;
        forwardValue1758_21_1 = spill1758_1;
        break forward_join_21;
    }
    if (!((spill1758_0 >= spill1758_1))) {
        break forward_join_13;
    }
    forwardValue1758_22_0 = p1;
    break forward_join_22;
    }
    forwardValue1758_21_0 = ((java.util.Random)(p0)).nextInt(((int)(((p2 - p1) + 1))));
    forwardValue1758_21_1 = p1;
    }
    forwardValue1758_22_0 = (forwardValue1758_21_0 + forwardValue1758_21_1);
    }
    return forwardValue1758_22_0;
}


public static float a(java.util.Random p0, float p1, float p2) {
float forwardValue1757_21_0;
    float forwardValue1757_21_1;
    float forwardValue1757_22_0;
    float spill1757_0;
    float spill1757_1;
    long life3_3;
    int life5_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_14: {
    life3_3 = (moom.Dr.x ^ 30676040217070L);
    life5_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1757_0 = p1;
    spill1757_1 = p2;
    if (!((life5_5 != 0))) {
        forwardValue1757_21_0 = spill1757_0;
        forwardValue1757_21_1 = spill1757_1;
        break forward_join_21;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill1757_0)), ((float)(spill1757_1))) >= 0))) {
        break forward_join_14;
    }
    forwardValue1757_22_0 = p1;
    break forward_join_22;
    }
    forwardValue1757_21_0 = (((java.util.Random)(p0)).nextFloat() * (p2 - p1));
    forwardValue1757_21_1 = p1;
    }
    forwardValue1757_22_0 = (forwardValue1757_21_0 + forwardValue1757_21_1);
    }
    return forwardValue1757_22_0;
}


public static double a(java.util.Random p0, double p1, double p2) {
double forwardValue1756_21_0;
    double forwardValue1756_21_1;
    double forwardValue1756_22_0;
    double spill1756_0;
    double spill1756_1;
    long life5_3;
    int life7_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_14: {
    life5_3 = (moom.Dr.x ^ 2521567421069L);
    life7_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1756_0 = p1;
    spill1756_1 = p2;
    if (!((life7_5 != 0))) {
        forwardValue1756_21_0 = spill1756_0;
        forwardValue1756_21_1 = spill1756_1;
        break forward_join_21;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill1756_0)), ((double)(spill1756_1))) >= 0))) {
        break forward_join_14;
    }
    forwardValue1756_22_0 = p1;
    break forward_join_22;
    }
    forwardValue1756_21_0 = (((java.util.Random)(p0)).nextDouble() * (p2 - p1));
    forwardValue1756_21_1 = p1;
    }
    forwardValue1756_22_0 = (forwardValue1756_21_0 + forwardValue1756_21_1);
    }
    return forwardValue1756_22_0;
}


public static double a(long[] p0) {
long lexicalValue568_32_0;
    boolean spill568_0;
    long spill568_1;
    long life1_3;
    long life4_6;
    long[] life6_8;
    int life7_11;
    int life8_13;
    int life3_14;
    long life9_21;
    lexical_join_32: {
    lexical_join_31: {
    life1_3 = (moom.Dr.x ^ 27706460674067L);
    spill568_0 = moom.DS.b__Boolean();
    life4_6 = 0L;
    life6_8 = p0;
    life7_11 = (life6_8).length;
    life8_13 = 0;
    life3_14 = ((spill568_0) ? 1 : 0);
    lexical_cycle_15: while (true) {
    if (!((life8_13 < life7_11))) {
        break lexical_join_31;
    }
    life9_21 = (life6_8)[life8_13];
    spill568_1 = (life4_6 + life9_21);
    if (!((life3_14 == 0))) {
        lexicalValue568_32_0 = spill568_1;
        break lexical_join_32;
    }
    life4_6 = spill568_1;
    life8_13 += 1;
    if (!((life3_14 != 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    lexicalValue568_32_0 = life4_6;
    }
    return (((double) lexicalValue568_32_0) / ((double) (p0).length));
}


public static boolean a__Boolean(float p0, float p1) {
int forwardValue1760_16_0;
    int forwardValue1760_18_0;
    int spill1760_0;
    long life2_3;
    int life4_5;
    forward_join_18: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.Dr.x ^ 121224749638552L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1760_0 = recovery.source.CarrierOps.fcmpg(((float)(moom.Dr.d(((float)((p1 - p0)))))), ((float)(0x1.4f8b58p-17f)));
    if (!((life4_5 != 0))) {
        forwardValue1760_16_0 = spill1760_0;
        break forward_join_16;
    }
    if (!((spill1760_0 < 0))) {
        break forward_join_17;
    }
    forwardValue1760_16_0 = 1;
    }
    forwardValue1760_18_0 = forwardValue1760_16_0;
    break forward_join_18;
    }
    forwardValue1760_18_0 = 0;
    }
    return ((forwardValue1760_18_0) != 0);
}


public static float a(float p0, float p1, float p2) {
float forwardValue1753_16_0;
    float forwardValue1753_16_1;
    float forwardValue1753_17_0;
    float spill1753_0;
    float spill1753_1;
    long life3_3;
    int life5_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life3_3 = (moom.Dr.x ^ 128540547735499L);
    life5_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1753_0 = p0;
    spill1753_1 = p1;
    if (!((life5_5 == 0))) {
        forwardValue1753_16_0 = spill1753_0;
        forwardValue1753_16_1 = spill1753_1;
        break forward_join_16;
    }
    if (!((recovery.source.CarrierOps.fcmpg(((float)(spill1753_0)), ((float)(spill1753_1))) < 0))) {
        break forward_join_14;
    }
    forwardValue1753_17_0 = p1;
    break forward_join_17;
    }
    forwardValue1753_16_0 = p0;
    forwardValue1753_16_1 = p2;
    }
    forwardValue1753_17_0 = java.lang.Math.min(((float)(forwardValue1753_16_0)), ((float)(forwardValue1753_16_1)));
    }
    return forwardValue1753_17_0;
}


public static double a(double p0, double p1, double p2) {
double forwardValue1752_16_0;
    double forwardValue1752_16_1;
    double forwardValue1752_17_0;
    double spill1752_0;
    double spill1752_1;
    long life6_3;
    int life8_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_14: {
    life6_3 = (moom.Dr.x ^ 48969781249492L);
    life8_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1752_0 = p0;
    spill1752_1 = p1;
    if (!((life8_5 == 0))) {
        forwardValue1752_16_0 = spill1752_0;
        forwardValue1752_16_1 = spill1752_1;
        break forward_join_16;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill1752_0)), ((double)(spill1752_1))) < 0))) {
        break forward_join_14;
    }
    forwardValue1752_17_0 = p1;
    break forward_join_17;
    }
    forwardValue1752_16_0 = p0;
    forwardValue1752_16_1 = p2;
    }
    forwardValue1752_17_0 = java.lang.Math.min(((double)(forwardValue1752_16_0)), ((double)(forwardValue1752_16_1)));
    }
    return forwardValue1752_17_0;
}


public static double a(double p0, double p1) {
int forwardValue1751_20_0;
    double forwardValue1751_26_0;
    double forwardValue1751_26_1;
    int spill1751_0;
    double spill1751_1;
    double spill1751_2;
    long life4_3;
    int life6_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_20: {
    forward_join_15: {
    life4_3 = (moom.Dr.x ^ 76235797572186L);
    life6_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    spill1751_0 = recovery.source.CarrierOps.dcmpg(((double)(p0)), ((double)(0x0.0p0d)));
    if (!((life6_5 == 0))) {
        forwardValue1751_20_0 = spill1751_0;
        break forward_join_20;
    }
    if (!((spill1751_0 < 0))) {
        break forward_join_15;
    }
    p0 = (-p0);
    }
    spill1751_1 = p1;
    spill1751_2 = 0x0.0p0d;
    if (!((life6_5 == 0))) {
        forwardValue1751_26_0 = spill1751_1;
        forwardValue1751_26_1 = spill1751_2;
        break forward_join_26;
    }
    forwardValue1751_20_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1751_1)), ((double)(spill1751_2)));
    }
    if (!((forwardValue1751_20_0 < 0))) {
        break forward_join_24;
    }
    p1 = (-p1);
    }
    forwardValue1751_26_0 = p0;
    forwardValue1751_26_1 = p1;
    }
    return java.lang.Math.max(((double)(forwardValue1751_26_0)), ((double)(forwardValue1751_26_1)));
}


public static int a(int p0, int p1) {
int forwardValue1754_21_0;
    int forwardValue1754_23_0;
    int spill1754_0;
    long life2_3;
    int life4_5;
    forward_join_23: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (moom.Dr.x ^ 53226681127457L);
    life4_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1754_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue1754_21_0 = spill1754_0;
        break forward_join_21;
    }
    if (!((spill1754_0 < 0))) {
        break forward_join_20;
    }
    forwardValue1754_23_0 = ((-(((-p0) - 1) / p1)) - 1);
    break forward_join_23;
    }
    forwardValue1754_21_0 = p0;
    }
    forwardValue1754_23_0 = (forwardValue1754_21_0 / p1);
    }
    return forwardValue1754_23_0;
}


public static double a(java.lang.String p0, double p1, double p2) {
return java.lang.Math.max(((double)(p2)), ((double)(moom.Dr.a(((java.lang.String)(p0)), ((double)(p1))))));
}


private static boolean a__Boolean(int p0) {
int forwardValue1761_15_0;
    long life1_3;
    forward_join_15: {
    forward_join_14: {
    life1_3 = (moom.Dr.x ^ 106211012532736L);
    if (!((p0 != 0))) {
        break forward_join_14;
    }
    if (!(((p0 & (p0 - 1)) == 0))) {
        break forward_join_14;
    }
    forwardValue1761_15_0 = 1;
    break forward_join_15;
    }
    forwardValue1761_15_0 = 0;
    }
    return ((forwardValue1761_15_0) != 0);
}


public static int a(int p0, int p1, int p2) {
int forwardValue1755_15_0;
    int forwardValue1755_15_1;
    int forwardValue1755_16_0;
    int spill1755_0;
    int spill1755_1;
    long life3_3;
    int life5_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_13: {
    life3_3 = (moom.Dr.x ^ 1198019487063L);
    life5_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill1755_0 = p0;
    spill1755_1 = p1;
    if (!((life5_5 != 0))) {
        forwardValue1755_15_0 = spill1755_0;
        forwardValue1755_15_1 = spill1755_1;
        break forward_join_15;
    }
    if (!((spill1755_0 < spill1755_1))) {
        break forward_join_13;
    }
    forwardValue1755_16_0 = p1;
    break forward_join_16;
    }
    forwardValue1755_15_0 = p0;
    forwardValue1755_15_1 = p2;
    }
    forwardValue1755_16_0 = java.lang.Math.min(((int)(forwardValue1755_15_0)), ((int)(forwardValue1755_15_1)));
    }
    return forwardValue1755_16_0;
}


public static int a__Int(float p0, float p1, float p2) {
return moom.Dr.b(((int)(moom.Dr.a__Int(((float)((p0 * 0x1.fep7f)))))), ((int)(moom.Dr.a__Int(((float)((p1 * 0x1.fep7f)))))), ((int)(moom.Dr.a__Int(((float)((p2 * 0x1.fep7f)))))));
}


public static long a__Long(double p0) {
long local2 = (moom.Dr.x ^ 95728923488277L);
    long local4 = ((long) p0);
    return ((p0 < ((double) local4)) ? (local4 - 1L) : local4);
}


public static double a(double p0) {
int forwardValue1750_25_0;
    double forwardValue1750_31_0;
    boolean spill1750_0;
    int spill1750_1;
    double spill1750_2;
    long life2_3;
    double life0_8;
    int life4_9;
    forward_join_31: {
    forward_join_30: {
    forward_join_25: {
    forward_join_20: {
    life2_3 = (moom.Dr.x ^ 56333046818051L);
    spill1750_0 = moom.DS.c__Boolean();
    life0_8 = (p0 % 0x1.68p8d);
    life4_9 = ((spill1750_0) ? 1 : 0);
    spill1750_1 = recovery.source.CarrierOps.dcmpl(((double)(life0_8)), ((double)(0x1.68p7d)));
    if (!((life4_9 != 0))) {
        forwardValue1750_25_0 = spill1750_1;
        break forward_join_25;
    }
    if (!((spill1750_1 >= 0))) {
        break forward_join_20;
    }
    life0_8 = (life0_8 - 0x1.68p8d);
    }
    spill1750_2 = life0_8;
    if (!((life4_9 != 0))) {
        forwardValue1750_31_0 = spill1750_2;
        break forward_join_31;
    }
    forwardValue1750_25_0 = recovery.source.CarrierOps.dcmpg(((double)(spill1750_2)), ((double)(-0x1.68p7d)));
    }
    if (!((forwardValue1750_25_0 < 0))) {
        break forward_join_30;
    }
    life0_8 = (life0_8 + 0x1.68p8d);
    }
    forwardValue1750_31_0 = life0_8;
    }
    return forwardValue1750_31_0;
}


public static int a(java.lang.String p0, int p1) {
try {
        return java.lang.Integer.parseInt(((java.lang.String)(p0)));
    } catch (java.lang.Throwable caught2) {
        return p1;
    }
}


public static int a(int p0) {
long local1 = (moom.Dr.x ^ 105245510499626L);
    return ((p0 >= 0) ? p0 : (-p0));
}


public static double a(java.lang.String p0, double p1) {
try {
        return java.lang.Double.parseDouble(((java.lang.String)(p0)));
    } catch (java.lang.Throwable caught3) {
        return p1;
    }
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_129(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_131(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_133(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_135(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_137(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_139(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_141(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_143(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_145(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_147(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_151(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_153(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_155(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_157(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_171(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_173(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_175(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_177(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_179(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_183(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_185(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_187(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite632_221(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab368a0e25ae_invokedynamic4257_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ab368a0e25ae_invokedynamic4257_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4256_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_3(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_1ca307113f66_originalDynamicSite1117_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0546e0f474f8_originalDynamicSite1119_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_1(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_3(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_66b17fa22205_originalDynamicSite1118_4(int a0, long a1) throws E;

private static native <E extends Throwable> double __sourceIntrinsic_8f3a06b7a0e8_exactNonfiniteDoubleLiteral670000_5() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0fb642a4098e_invokedynamic4247_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0fb642a4098e_invokedynamic4247_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2da6f9ba0467_invokedynamic600_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2da6f9ba0467_invokedynamic600_4(float a0, float a1, float a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2da6f9ba0467_invokedynamic600_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2da6f9ba0467_invokedynamic600_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2da6f9ba0467_invokedynamic600_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2da6f9ba0467_invokedynamic600_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2da6f9ba0467_invokedynamic600_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ead3c349e325_originalDynamicSite1113_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ead3c349e325_originalDynamicSite1113_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b3991846d2f_originalDynamicSite1114_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2b3991846d2f_originalDynamicSite1114_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4241_0() throws E;

private static native <E extends Throwable> long __sourceIntrinsic_c7afef5f4ee4_originalDynamicSite1115_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_eeb6dc45553b_invokedynamic4250_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eeb6dc45553b_invokedynamic4250_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eeb6dc45553b_invokedynamic4250_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a254bd12459d_originalDynamicSite1116_13(int a0, long a1) throws E;
}
