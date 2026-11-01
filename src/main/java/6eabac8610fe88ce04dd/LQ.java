package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class LQ {

private java.lang.String a;

private int b;

private java.net.Proxy c;

private java.util.List<moom.LR> d;

private java.util.List<moom.LR> e;

private java.net.Socket f;

private java.io.InputStream g;

private java.io.OutputStream h;

private moom.OA i;

private moom.Oz j;

private int k;

private boolean l;

private long m;

private int n;

private long o;

private boolean p;

private static java.util.regex.Pattern q;

private static long r;

private static java.lang.String[] s;

private static java.lang.String[] t;

private static java.util.Map u;

private static long[] v;

private static java.lang.Integer[] w;

private static java.util.Map x;

private static long[] y;

private static java.lang.Long[] z;

private static java.util.Map A;

public LQ(java.lang.String p0, int p1) {
this(((java.lang.String)(p0)), ((int)(p1)), ((java.net.Proxy)(java.net.Proxy.NO_PROXY)));
    return;
}


public LQ(java.lang.String p0, int p1, java.net.Proxy p2) { super(); }

private static void __sourceConstructorBody_a362351dcd469cf6(moom.LQ receiver, java.lang.String p0, int p1, java.net.Proxy p2) throws Throwable {
long local4_life2 = (moom.LQ.r ^ 72312628842260L);
    net.minecraft.entity.Entity[] __sourceSpill557_4 = moom.LT.b();
    moom.LQ.__sourceConstructorInit_a362351dcd469cf6_0(((moom.LQ)(receiver)));
    ((moom.LQ)(receiver)).a = ((java.lang.String)(null));
    ((moom.LQ)(receiver)).b = ((int)(0));
    ((moom.LQ)(receiver)).c = ((java.net.Proxy)(java.net.Proxy.NO_PROXY));
    ((moom.LQ)(receiver)).d = ((java.util.List)(new java.util.LinkedList()));
    net.minecraft.entity.Entity[] local6_life11 = __sourceSpill557_4;
    try {
        ((moom.LQ)(receiver)).e = ((java.util.List)(new java.util.LinkedList()));
        ((moom.LQ)(receiver)).f = ((java.net.Socket)(null));
        ((moom.LQ)(receiver)).g = ((java.io.InputStream)(null));
        ((moom.LQ)(receiver)).h = ((java.io.OutputStream)(null));
        ((moom.LQ)(receiver)).i = ((moom.OA)(null));
        ((moom.LQ)(receiver)).j = ((moom.Oz)(null));
        ((moom.LQ)(receiver)).k = ((int)(0));
        ((moom.LQ)(receiver)).l = ((boolean)(false));
        ((moom.LQ)(receiver)).m = ((long)(__sourceIntrinsic_a362351dcd469cf6_originalDynamicSite557_21(31576, (1166666829757082374L ^ local4_life2))));
        ((moom.LQ)(receiver)).n = ((int)(__sourceIntrinsic_a362351dcd469cf6_originalDynamicSite557_24(31175, (987850768235931457L ^ local4_life2))));
        ((moom.LQ)(receiver)).o = ((long)(java.lang.System.currentTimeMillis()));
        ((moom.LQ)(receiver)).p = ((boolean)(false));
        ((moom.LQ)(receiver)).a = ((java.lang.String)(p0));
        ((moom.LQ)(receiver)).b = ((int)(p1));
        ((moom.LQ)(receiver)).c = ((java.net.Proxy)(p2));
        ((moom.LQ)(receiver)).i = ((moom.OA)(new moom.OA(receiver)));
        ((moom.OA)(((moom.LQ)(receiver)).i)).start();
        ((moom.LQ)(receiver)).j = ((moom.Oz)(new moom.Oz(receiver)));
        ((moom.Oz)(((moom.LQ)(receiver)).j)).start();
        if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        moom.LT.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[4])));
    }
    } catch (java.lang.IllegalArgumentException __catchStack557) {
        throw moom.LQ.c(((java.lang.Exception)(__catchStack557)));
    }
    return;
}


static {
r = ((long)(((moom._a)(moom._c.a(((long)(5261263885265627937L)), ((long)(-2354164775366563463L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(87985750381247L)))));
    long local31_life6 = (moom.LQ.r ^ 92302475794362L);
    u = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local22_life9;
    javax.crypto.Cipher __sourceSpill673_11 = (local22_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill673_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill673_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill673_14 = new byte[8];
    (__sourceSpill673_14)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local23_life15 = 1;
    while ((local23_life15 < 8)) {
        (__sourceSpill673_14)[local23_life15] = ((byte) ((int) ((local31_life6 << (local23_life15 * 8)) >>> 56)));
        local23_life15 += 1;
    }
    byte[] __sourcePreallocation673_16 = __sourceSpill673_14;
    ((javax.crypto.Cipher)(__sourceSpill673_11)).init(((int)(__sourceSpill673_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill673_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation673_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local29_life19 = new java.lang.String[16];
    int local27_life20 = 0;
    java.lang.String local26_life21;
    int local28_life23 = ((java.lang.String)((local26_life21 = "Å¡Di\033\023BG-®Åï`¸ÜÐâÕÞ÷v\177\037Þ©Î<01á%Ä×7qv\013|1<ó\004&d\002\007Âááß¿Y\023\024gôy\036Ò$\036ÓC<:ÌF Û\020¾í]\000iÌi(¦E\020*qh³ni½äC¸A\013Þ(&ûëS$r'/è,®ÑA­[UÎ`=<u\000uöÌßÍ\f©L(\033²0Ì\032( \005ôÄ\007ñÜ\017³>7FÂì°ÍOù\003\n¼A*m·1L£\006 «/À\017È%8Þ\007g1\036n\0162@ÛÆ\002\027{\036<\005ì=¿\030+7Âþ[ÊP'ÿí$0cÐ]#sh´J_ ý^\017\ru,8&dwe?¤Ú\fHï\";6£ÿÜ\"AÁ\006/\020«}xÏ\003à Vît@Ö\r\020hý³3óø6o\001d¸\f!«9\024\030IµX9FÉêW¿ò5¶Â+è8¨e.qÃË\020\027ö\034à~WÀ¦\r}µSv(\035\020¼ÀßÒ[^=K5*Ôç\025ÛôÿP²AÛly¹\026èÒK¡0Ñô¡\003#8"))).length();
    int local25_life24 = 32;
    int local24_life25 = -1;
    while (true) {
        local24_life25 += 1;
        byte[] __sourceSpill673_28 = ((java.lang.String)(((java.lang.String)(local26_life21)).substring(((int)(local24_life25)), ((int)((local24_life25 + local25_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill673_29 = local22_life9;
        byte[] local30_life31 = ((javax.crypto.Cipher)(__sourceSpill673_29)).doFinal(((byte[])(__sourceSpill673_28)));
        java.lang.String __sourceSpill673_34 = ((java.lang.String)(moom.LQ.a(((byte[])(local30_life31))))).intern();
        java.lang.String[] __sourceSpill673_35 = local29_life19;
        int __sourceSpill673_36 = local27_life20;
        local27_life20 += 1;
        (__sourceSpill673_35)[__sourceSpill673_36] = __sourceSpill673_34;
        if (!(((local24_life25 = (local24_life25 + local25_life24)) < local28_life23))) { break; }
        local25_life24 = ((java.lang.String)(local26_life21)).charAt(((int)(local24_life25)));
    }
    local28_life23 = ((java.lang.String)((local26_life21 = "]C.·Á\024dÿ¤£Ä$\020®\003ç\027\033Y\035cðYÿRé)Q"))).length();
    local25_life24 = 16;
    local24_life25 = -1;
    while (true) {
        local24_life25 += 1;
        byte[] __sourceSpill673_41 = ((java.lang.String)(((java.lang.String)(local26_life21)).substring(((int)(local24_life25)), ((int)((local24_life25 + local25_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill673_42 = local22_life9;
        byte[] local30_life44 = ((javax.crypto.Cipher)(__sourceSpill673_42)).doFinal(((byte[])(__sourceSpill673_41)));
        java.lang.String __sourceSpill673_47 = ((java.lang.String)(moom.LQ.a(((byte[])(local30_life44))))).intern();
        java.lang.String[] __sourceSpill673_48 = local29_life19;
        int __sourceSpill673_49 = local27_life20;
        local27_life20 += 1;
        (__sourceSpill673_48)[__sourceSpill673_49] = __sourceSpill673_47;
        if (!(((local24_life25 = (local24_life25 + local25_life24)) < local28_life23))) { break; }
        local25_life24 = ((java.lang.String)(local26_life21)).charAt(((int)(local24_life25)));
    }
    s = ((java.lang.String[])(local29_life19));
    t = ((java.lang.String[])(new java.lang.String[16]));
    x = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill673_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill673_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill673_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill673_60 = new byte[8];
    (__sourceSpill673_60)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill673_60)[local12_life61] = ((byte) ((int) ((local31_life6 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation673_62 = __sourceSpill673_60;
    ((javax.crypto.Cipher)(__sourceSpill673_57)).init(((int)(__sourceSpill673_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill673_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation673_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[4];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "Ý\031ÏÃ7ö\033Ñ%Ð\003¢¸ß"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill673_71 = local15_life67;
        int __sourceSpill673_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill673_71)).substring(((int)(__sourceSpill673_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill673_76 = local17_life65;
        int __sourceSpill673_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill673_79 = new byte[8];
        (__sourceSpill673_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill673_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill673_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill673_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill673_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill673_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill673_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill673_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill673_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill673_80)).doFinal(((byte[])(__sourceSpill673_79)));
        (__sourceSpill673_76)[__sourceSpill673_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "µ>¤àÔhÏ\tÓ\016\024\003\nÛ\003t"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill673_84 = local15_life67;
        int __sourceSpill673_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill673_84)).substring(((int)(__sourceSpill673_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill673_89 = local17_life65;
        int __sourceSpill673_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill673_92 = new byte[8];
        (__sourceSpill673_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill673_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill673_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill673_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill673_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill673_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill673_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill673_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill673_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill673_93)).doFinal(((byte[])(__sourceSpill673_92)));
        (__sourceSpill673_89)[__sourceSpill673_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    v = ((long[])(local17_life65));
    w = ((java.lang.Integer[])(new java.lang.Integer[4]));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill673_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill673_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill673_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill673_105 = new byte[8];
    (__sourceSpill673_105)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill673_105)[local1_life106] = ((byte) ((int) ((local31_life6 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation673_107 = __sourceSpill673_105;
    ((javax.crypto.Cipher)(__sourceSpill673_102)).init(((int)(__sourceSpill673_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill673_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation673_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[4];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "Ô½ÙFf£%¢Rc\002J»¦\b"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill673_116 = local4_life112;
        int __sourceSpill673_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill673_116)).substring(((int)(__sourceSpill673_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill673_121 = local6_life110;
        int __sourceSpill673_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill673_124 = new byte[8];
        (__sourceSpill673_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill673_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill673_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill673_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill673_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill673_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill673_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill673_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill673_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill673_125)).doFinal(((byte[])(__sourceSpill673_124)));
        (__sourceSpill673_121)[__sourceSpill673_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    local5_life114 = ((java.lang.String)((local4_life112 = "ôuöÐ_PõFáfz)=\f\0301"))).length();
    local2_life115 = 0;
    do {
        java.lang.String __sourceSpill673_129 = local4_life112;
        int __sourceSpill673_130 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life133 = ((java.lang.String)(((java.lang.String)(__sourceSpill673_129)).substring(((int)(__sourceSpill673_130)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill673_134 = local6_life110;
        int __sourceSpill673_135 = local3_life111;
        local3_life111 += 1;
        long local8_life136 = (((((((((((long) (local7_life133)[0]) & 255L) << 56) | ((((long) (local7_life133)[1]) & 255L) << 48)) | ((((long) (local7_life133)[2]) & 255L) << 40)) | ((((long) (local7_life133)[3]) & 255L) << 32)) | ((((long) (local7_life133)[4]) & 255L) << 24)) | ((((long) (local7_life133)[5]) & 255L) << 16)) | ((((long) (local7_life133)[6]) & 255L) << 8)) | (((long) (local7_life133)[7]) & 255L));
        byte[] __sourceSpill673_137 = new byte[8];
        (__sourceSpill673_137)[0] = ((byte) ((int) (local8_life136 >>> 56)));
        (__sourceSpill673_137)[1] = ((byte) ((int) (local8_life136 >>> 48)));
        (__sourceSpill673_137)[2] = ((byte) ((int) (local8_life136 >>> 40)));
        (__sourceSpill673_137)[3] = ((byte) ((int) (local8_life136 >>> 32)));
        (__sourceSpill673_137)[4] = ((byte) ((int) (local8_life136 >>> 24)));
        (__sourceSpill673_137)[5] = ((byte) ((int) (local8_life136 >>> 16)));
        (__sourceSpill673_137)[6] = ((byte) ((int) (local8_life136 >>> 8)));
        (__sourceSpill673_137)[7] = ((byte) ((int) local8_life136));
        javax.crypto.Cipher __sourceSpill673_138 = local0_life100;
        byte[] local10_life140 = ((javax.crypto.Cipher)(__sourceSpill673_138)).doFinal(((byte[])(__sourceSpill673_137)));
        (__sourceSpill673_134)[__sourceSpill673_135] = (((((((((((long) (local10_life140)[0]) & 255L) << 56) | ((((long) (local10_life140)[1]) & 255L) << 48)) | ((((long) (local10_life140)[2]) & 255L) << 40)) | ((((long) (local10_life140)[3]) & 255L) << 32)) | ((((long) (local10_life140)[4]) & 255L) << 24)) | ((((long) (local10_life140)[5]) & 255L) << 16)) | ((((long) (local10_life140)[6]) & 255L) << 8)) | (((long) (local10_life140)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    y = ((long[])(local6_life110));
    z = ((java.lang.Long[])(new java.lang.Long[4]));
    q = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite673_143(11622, (937816666069015132L ^ local31_life6)))))));
}

private static native <E extends Throwable> void __sourceConstructorInit_a362351dcd469cf6_0(moom.LQ a0) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_f72e6ddc7e119f46b4df(moom.LQ a0, java.lang.Exception a1) throws E;
private static final class __SourceHandler_f72e6ddc7e119f46b4df {

public static void f140(moom.LQ receiver, java.lang.Exception p0) throws Throwable {
    moom.LQ forwardValue140_18_0;
    moom.LQ forwardValue140_26_0;
    moom.LQ forwardValue140_34_0;
    java.net.Socket forwardValue140_40_0;
    moom.LQ spill140_0;
    java.net.Socket spill140_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_50: {
    forward_join_41: {
    forward_join_40: {
    forward_join_34: {
    forward_join_33: {
    forward_join_26: {
    forward_join_25: {
    forward_join_18: {
    life2_3 = (__fieldRead140_0() ^ 83216409915527L);
    life4_5 = __call140_1();
    spill140_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue140_18_0 = spill140_0;
        break forward_join_18;
    }
    if (!((!__fieldRead140_2(spill140_0)))) {
        break forward_join_50;
    }
    __fieldWrite140_3(receiver, 1);
    __call140_4(receiver, p0);
    forwardValue140_18_0 = receiver;
    }
    if (!((life4_5 != null))) {
        forwardValue140_26_0 = forwardValue140_18_0;
        break forward_join_26;
    }
    if (!((__fieldRead140_5(forwardValue140_18_0) != null))) {
        break forward_join_25;
    }
    __call140_7(__fieldRead140_6(receiver));
    }
    forwardValue140_26_0 = receiver;
    }
    if (!((life4_5 != null))) {
        forwardValue140_34_0 = forwardValue140_26_0;
        break forward_join_34;
    }
    if (!((__fieldRead140_8(forwardValue140_26_0) != null))) {
        break forward_join_33;
    }
    __call140_10(__fieldRead140_9(receiver));
    }
    forwardValue140_34_0 = receiver;
    }
    spill140_1 = __fieldRead140_11(forwardValue140_34_0);
    if (!((life4_5 != null))) {
        forwardValue140_40_0 = spill140_1;
        break forward_join_40;
    }
    if (!((spill140_1 != null))) {
        break forward_join_41;
    }
    forwardValue140_40_0 = __fieldRead140_12(receiver);
    }
    __call140_13(forwardValue140_40_0);
    }
    __fieldWrite140_14(receiver, null);
    __fieldWrite140_15(receiver, null);
    __fieldWrite140_16(receiver, null);
    }
    return;
}
public static void h140_0(java.io.IOException p0) throws Throwable {
    throw __call2014000_0(p0);
}
public static void h140_1(java.io.IOException p0) throws Throwable {
    throw __call2014001_0(p0);
}
public static void h140_2(java.io.IOException p0) throws Throwable {
    throw __call2014002_0(p0);
}
public static void h140_3(java.io.IOException p0) throws Throwable {
    throw __call2014003_0(p0);
}
public static void h140_4(java.io.IOException p0) throws Throwable {
    throw __call2014004_0(p0);
}
public static void h140_5(java.io.IOException p0) throws Throwable {
    throw __call2014005_0(p0);
}
public static void h140_6(java.io.IOException p0) throws Throwable {
    throw __call2014006_0(p0);
}
public static void h140_7(java.io.IOException p0) throws Throwable {
    throw __call2014007_0(p0);
}
public static void h140_8(java.io.IOException p0, moom.LQ p1) throws Throwable {
    java.io.IOException local2 = p0;
    __fieldWrite2014008_0(p1, null);
    __fieldWrite2014008_1(p1, null);
    __fieldWrite2014008_2(p1, null);
    return;
}
private static native long __fieldRead140_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call140_1() throws Throwable;
private static native boolean __fieldRead140_2(moom.LQ a0) throws Throwable;
private static native void __fieldWrite140_3(moom.LQ a0, int a1) throws Throwable;
private static native void __call140_4(moom.LQ a0, java.lang.Exception a1) throws Throwable;
private static native moom.OA __fieldRead140_5(moom.LQ a0) throws Throwable;
private static native moom.OA __fieldRead140_6(moom.LQ a0) throws Throwable;
private static native void __call140_7(moom.OA a0) throws Throwable;
private static native moom.Oz __fieldRead140_8(moom.LQ a0) throws Throwable;
private static native moom.Oz __fieldRead140_9(moom.LQ a0) throws Throwable;
private static native void __call140_10(moom.Oz a0) throws Throwable;
private static native java.net.Socket __fieldRead140_11(moom.LQ a0) throws Throwable;
private static native java.net.Socket __fieldRead140_12(moom.LQ a0) throws Throwable;
private static native void __call140_13(java.net.Socket a0) throws Throwable;
private static native void __fieldWrite140_14(moom.LQ a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite140_15(moom.LQ a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite140_16(moom.LQ a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Exception __call2014000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2014001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2014002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2014003_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2014004_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2014005_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2014006_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2014007_0(java.io.IOException a0) throws Throwable;
private static native void __fieldWrite2014008_0(moom.LQ a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite2014008_1(moom.LQ a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite2014008_2(moom.LQ a0, java.lang.Object a1) throws Throwable;

}

private static native <E extends Throwable> java.lang.String[] __sourceHandlerCall_865864b9777898002f8a(moom.LQ a0, java.lang.String a1, char a2) throws E;
private static final class __SourceHandler_865864b9777898002f8a {

public static java.lang.String[] f102(moom.LQ receiver, java.lang.String p0, char p1) throws Throwable {
    int forwardValue102_15_0;
    net.minecraft.entity.Entity[] spill102_0;
    int spill102_1;
    java.lang.String[] spill102_2;
    java.lang.String[] spill102_3;
    java.lang.String[] spill102_4;
    long life3_3;
    int life6_8;
    net.minecraft.entity.Entity[] life5_9;
    java.lang.String life7_28;
    java.lang.String life8_34;
    forward_join_21: {
    forward_join_15: {
    life3_3 = (__fieldRead102_0() ^ 88968732603981L);
    spill102_0 = __call102_1();
    life6_8 = __call102_2(p0, p1);
    life5_9 = spill102_0;
    spill102_1 = life6_8;
    if (!((life5_9 != null))) {
        forwardValue102_15_0 = spill102_1;
        break forward_join_15;
    }
    if (!((spill102_1 < 0))) {
        break forward_join_21;
    }
    forwardValue102_15_0 = 1;
    }
    java.lang.String[] __stackOp102_3_0 = new java.lang.String[forwardValue102_15_0];
    spill102_2 = __stackOp102_3_0;
    (__stackOp102_3_0)[0] = p0;
    return spill102_2;
    }
    life7_28 = __call102_4(p0, 0, life6_8);
    life8_34 = __call102_5(p0, (life6_8 + 1));
    java.lang.String[] __stackOp102_6_0 = new java.lang.String[2];
    spill102_3 = __stackOp102_6_0;
    (__stackOp102_6_0)[0] = life7_28;
    java.lang.String[] __stackOp102_7_0 = spill102_3;
    spill102_4 = __stackOp102_7_0;
    (__stackOp102_7_0)[1] = life8_34;
    return spill102_4;
}
public static void h102_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010200_0(p0);
}
private static native long __fieldRead102_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call102_1() throws Throwable;
private static native int __call102_2(java.lang.String a0, char a1) throws Throwable;
private static native java.lang.String __call102_4(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call102_5(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call1010200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_282476516dcca3462b02(moom.LQ a0, java.lang.String a1, moom.LS a2) throws E;
private static final class __SourceHandler_282476516dcca3462b02 {

public static java.lang.String f103(moom.LQ receiver, java.lang.String p0, moom.LS p1) throws Throwable {
    int forwardValue103_24_0;
    java.lang.String forwardValue103_36_0;
    int forwardValue103_57_0;
    java.lang.String forwardValue103_73_0;
    java.lang.String forwardValue103_113_0;
    boolean spill103_0;
    java.lang.String spill103_1;
    int spill103_2;
    java.lang.String spill103_3;
    java.lang.String spill103_4;
    java.lang.String spill103_5;
    java.lang.String spill103_6;
    java.lang.String spill103_7;
    java.lang.String spill103_8;
    java.lang.String spill103_9;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.lang.String life6_46;
    java.lang.String life9_76;
    java.lang.String life10_77;
    java.lang.String life7_89;
    int life8_93;
    java.lang.String life11_104;
    java.lang.String life12_105;
    java.lang.String life13_106;
    forward_join_113: {
    forward_join_101: {
    forward_join_73: {
    forward_join_71: {
    forward_join_57: {
    forward_join_52: {
    forward_join_36: {
    forward_join_34: {
    forward_join_24: {
    forward_join_15: {
    life3_3 = (__fieldRead103_0() ^ 127047409817254L);
    life5_5 = __call103_1();
    spill103_0 = __call103_4(__call103_3(__fieldRead103_2(), p0));
    if (!((life5_5 != null))) {
        forwardValue103_24_0 = __integerCategory103_5(spill103_0);
        break forward_join_24;
    }
    if (!(spill103_0)) {
        break forward_join_15;
    }
    return p0;
    }
    spill103_1 = p0;
    if (!((life5_5 != null))) {
        forwardValue103_36_0 = spill103_1;
        break forward_join_36;
    }
    forwardValue103_24_0 = __integerCategory103_8(__call103_7(spill103_1, __invokedynamic103_6(30110, (6324485033198650294L ^ life3_3))));
    }
    if (!((forwardValue103_24_0 != 0))) {
        break forward_join_34;
    }
    java.lang.String __stackOp103_10_0 = p0;
    java.lang.String __stackOp103_10_1 = __invokedynamic103_9(27513, (4418530928815086928L ^ life3_3));
    return __invokedynamic103_11(__stackOp103_10_1, __stackOp103_10_0);
    }
    forwardValue103_36_0 = __call103_12(p1);
    }
    life6_46 = forwardValue103_36_0;
    spill103_2 = __call103_13(p1);
    if (!((life5_5 != null))) {
        forwardValue103_57_0 = spill103_2;
        break forward_join_57;
    }
    if (!((spill103_2 != __invokedynamic103_14(6877, (3895979537562344939L ^ life3_3))))) {
        break forward_join_52;
    }
    life6_46 = __invokedynamic103_16(life6_46, __call103_15(p1));
    }
    spill103_3 = p0;
    if (!((life5_5 != null))) {
        forwardValue103_73_0 = spill103_3;
        break forward_join_73;
    }
    forwardValue103_57_0 = __integerCategory103_18(__call103_17(spill103_3, "/"));
    }
    if (!((forwardValue103_57_0 != 0))) {
        break forward_join_71;
    }
    spill103_4 = life6_46;
    life9_76 = p0;
    life10_77 = spill103_4;
    return __invokedynamic103_20(__invokedynamic103_19(16175, (6829185814414051595L ^ life3_3)), life10_77, life9_76);
    }
    forwardValue103_73_0 = __call103_21(p1);
    }
    life7_89 = forwardValue103_73_0;
    life8_93 = __call103_22(life7_89, "/");
    if (!((life8_93 >= 0))) {
        break forward_join_101;
    }
    spill103_5 = life6_46;
    spill103_6 = __call103_23(life7_89, 0, (life8_93 + 1));
    life11_104 = p0;
    life12_105 = spill103_6;
    life13_106 = spill103_5;
    forwardValue103_113_0 = __invokedynamic103_25(__invokedynamic103_24(2050, (9191532023235706414L ^ life3_3)), life13_106, life12_105, life11_104);
    break forward_join_113;
    }
    java.lang.String __stackOp103_27_0 = life6_46;
    java.lang.String __stackOp103_27_1 = p0;
    java.lang.String __stackOp103_27_2 = __invokedynamic103_26(2050, (9191532023235706414L ^ life3_3));
    spill103_7 = __stackOp103_27_2;
    spill103_8 = __stackOp103_27_0;
    spill103_9 = __stackOp103_27_1;
    __discardScalar103_28(__stackOp103_27_2);
    java.lang.String __stackOp103_29_0 = spill103_9;
    java.lang.String __stackOp103_29_1 = "/";
    forwardValue103_113_0 = __invokedynamic103_30(spill103_7, spill103_8, __stackOp103_29_1, __stackOp103_29_0);
    }
    return forwardValue103_113_0;
}
public static void h103_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010300_0(p0);
}
public static void h103_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010301_0(p0);
}
public static void h103_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010302_0(p0);
}
public static void h103_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010303_0(p0);
}
public static void h103_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010304_0(p0);
}
public static void h103_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010305_0(p0);
}
private static native long __fieldRead103_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call103_1() throws Throwable;
private static native java.util.regex.Pattern __fieldRead103_2() throws Throwable;
private static native java.util.regex.Matcher __call103_3(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call103_4(java.util.regex.Matcher a0) throws Throwable;
private static native int __integerCategory103_5(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic103_6(int a0, long a1) throws Throwable;
private static native boolean __call103_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory103_8(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic103_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic103_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call103_12(moom.LS a0) throws Throwable;
private static native int __call103_13(moom.LS a0) throws Throwable;
private static native int __invokedynamic103_14(int a0, long a1) throws Throwable;
private static native int __call103_15(moom.LS a0) throws Throwable;
private static native java.lang.String __invokedynamic103_16(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call103_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory103_18(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic103_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic103_20(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call103_21(moom.LS a0) throws Throwable;
private static native int __call103_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call103_23(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic103_24(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic103_25(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.String __invokedynamic103_26(int a0, long a1) throws Throwable;
private static native void __discardScalar103_28(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic103_30(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.Exception __call1010300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010303_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010304_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010305_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_34b0a934459205bd24bc(moom.LQ a0, java.net.Socket a1) throws E;
private static final class __SourceHandler_34b0a934459205bd24bc {

public static void f802(moom.LQ receiver, java.net.Socket p0) throws Throwable {
    moom.LQ forwardValue802_12_0;
    java.net.Socket forwardValue802_30_0;
    moom.LQ spill802_0;
    java.net.Socket spill802_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_49: {
    forward_join_30: {
    forward_join_25: {
    forward_join_12: {
    life2_3 = (__fieldRead802_0() ^ 122910235868707L);
    life4_5 = __call802_1();
    spill802_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue802_12_0 = spill802_0;
        break forward_join_12;
    }
    if (!((!__fieldRead802_2(spill802_0)))) {
        break forward_join_49;
    }
    forwardValue802_12_0 = receiver;
    }
    spill802_1 = __fieldRead802_3(forwardValue802_12_0);
    if (!((life4_5 != null))) {
        forwardValue802_30_0 = spill802_1;
        break forward_join_30;
    }
    if (!((spill802_1 != null))) {
        break forward_join_25;
    }
    throw new java.lang.IllegalArgumentException(__invokedynamic802_4(25710, (2763990847767444160L ^ life2_3)));
    }
    __fieldWrite802_5(receiver, p0);
    forwardValue802_30_0 = __fieldRead802_6(receiver);
    }
    __call802_7(forwardValue802_30_0, 1);
    __fieldWrite802_10(receiver, __call802_9(__fieldRead802_8(receiver)));
    __fieldWrite802_13(receiver, new java.io.BufferedOutputStream(__call802_12(__fieldRead802_11(receiver))));
    __call802_14(receiver);
    __call802_15(receiver);
    }
    return;
}
public static void h802_0(java.io.IOException p0) throws Throwable {
    throw __call1080200_0(p0);
}
public static void h802_1(java.io.IOException p0) throws Throwable {
    throw __call1080201_0(p0);
}
public static void h802_2(java.io.IOException p0) throws Throwable {
    throw __call1080202_0(p0);
}
public static void h802_3(java.io.IOException p0) throws Throwable {
    throw __call1080203_0(p0);
}
private static native long __fieldRead802_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call802_1() throws Throwable;
private static native boolean __fieldRead802_2(moom.LQ a0) throws Throwable;
private static native java.net.Socket __fieldRead802_3(moom.LQ a0) throws Throwable;
private static native java.lang.String __invokedynamic802_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite802_5(moom.LQ a0, java.net.Socket a1) throws Throwable;
private static native java.net.Socket __fieldRead802_6(moom.LQ a0) throws Throwable;
private static native void __call802_7(java.net.Socket a0, int a1) throws Throwable;
private static native java.net.Socket __fieldRead802_8(moom.LQ a0) throws Throwable;
private static native java.io.InputStream __call802_9(java.net.Socket a0) throws Throwable;
private static native void __fieldWrite802_10(moom.LQ a0, java.io.InputStream a1) throws Throwable;
private static native java.net.Socket __fieldRead802_11(moom.LQ a0) throws Throwable;
private static native java.io.OutputStream __call802_12(java.net.Socket a0) throws Throwable;
private static native void __fieldWrite802_13(moom.LQ a0, java.io.BufferedOutputStream a1) throws Throwable;
private static native void __call802_14(moom.LQ a0) throws Throwable;
private static native void __call802_15(moom.LQ a0) throws Throwable;
private static native java.lang.Exception __call1080200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1080201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1080202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1080203_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.LR __sourceHandlerCall_6f9aff48bac32a738370(moom.LQ a0, java.util.List a1, boolean a2) throws E;
private static final class __SourceHandler_6f9aff48bac32a738370 {

public static moom.LR f803(moom.LQ receiver, java.util.List p0, boolean p1) throws Throwable {
    java.lang.Object lexicalValue803_36_0;
    moom.LQ spill803_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    lexical_join_36: {
    lexical_join_33: {
    lexical_join_26: {
    lexical_join_22: {
    life3_3 = (__fieldRead803_0() ^ 111994546907931L);
    life5_5 = __call803_1();
    lexical_cycle_6: while (true) {
    if (!((__call803_2(p0) == 0))) {
        break lexical_join_22;
    }
    __call803_3(receiver);
    __call803_5(receiver, __invokedynamic803_4(21727, (74880054562922637L ^ life3_3)));
    if (!((life5_5 != null))) {
        break lexical_join_26;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    spill803_0 = receiver;
    if (!((life5_5 != null))) {
        lexicalValue803_36_0 = spill803_0;
        break lexical_join_36;
    }
    __call803_6(spill803_0);
    }
    if (!(p1)) {
        break lexical_join_33;
    }
    return __cast803_8(__call803_7(p0, 0));
    }
    lexicalValue803_36_0 = __call803_9(p0, 0);
    }
    return __cast803_10(lexicalValue803_36_0);
}
public static void h803_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call1080300_0(p0);
}
public static void h803_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call1080301_0(p0);
}
public static void h803_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call1080302_0(p0);
}
private static native long __fieldRead803_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call803_1() throws Throwable;
private static native int __call803_2(java.util.List a0) throws Throwable;
private static native void __call803_3(moom.LQ a0) throws Throwable;
private static native long __invokedynamic803_4(int a0, long a1) throws Throwable;
private static native void __call803_5(moom.LQ a0, long a1) throws Throwable;
private static native void __call803_6(moom.LQ a0) throws Throwable;
private static native java.lang.Object __call803_7(java.util.List a0, int a1) throws Throwable;
private static native moom.LR __cast803_8(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call803_9(java.util.List a0, int a1) throws Throwable;
private static native moom.LR __cast803_10(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1080300_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call1080301_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call1080302_0(java.lang.InterruptedException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9ca8b0a212845da4943d(moom.LQ a0, moom.LR a1) throws E;
private static final class __SourceHandler_9ca8b0a212845da4943d {

public static void f804(moom.LQ receiver, moom.LR p0) throws Throwable {
    moom.LQ forwardValue804_12_0;
    moom.LQ spill804_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_13: {
    forward_join_12: {
    life2_3 = (__fieldRead804_0() ^ 10227326392892L);
    life4_5 = __call804_1();
    spill804_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue804_12_0 = spill804_0;
        break forward_join_12;
    }
    if (!((!__fieldRead804_2(spill804_0)))) {
        break forward_join_13;
    }
    forwardValue804_12_0 = receiver;
    }
    __call804_3(forwardValue804_12_0);
    }
    return;
}
public static void h804_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080400_0(p0);
}
public static void h804_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080401_0(p0);
}
private static native long __fieldRead804_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call804_1() throws Throwable;
private static native boolean __fieldRead804_2(moom.LQ a0) throws Throwable;
private static native void __call804_3(moom.LQ a0) throws Throwable;
private static native java.lang.Exception __call1080400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_48d1cd66989461a19acd(moom.LQ a0, moom.LR a1, moom.LT a2) throws E;
private static final class __SourceHandler_48d1cd66989461a19acd {

public static void f108(moom.LQ receiver, moom.LR p0, moom.LT p1) throws Throwable {
    int forwardValue108_21_0;
    java.lang.Object forwardValue108_26_0;
    java.lang.Object forwardValue108_34_0;
    moom.LR forwardValue108_95_0;
    boolean spill108_0;
    java.util.List spill108_1;
    moom.LR spill108_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.lang.String life6_63;
    java.lang.String life6_97;
    moom.LS life7_103;
    moom.LR life8_117;
    moom.LN life7_135;
    forward_join_119: {
    forward_join_107: {
    forward_join_102: {
    forward_join_95: {
    forward_join_94: {
    forward_join_34: {
    forward_join_26: {
    forward_join_21: {
    life3_3 = (__fieldRead108_0() ^ 73669328619115L);
    life5_5 = __call108_1();
    spill108_0 = __fieldRead108_2(receiver);
    if (!((life5_5 != null))) {
        forwardValue108_21_0 = __integerCategory108_3(spill108_0);
        break forward_join_21;
    }
    if (!((!spill108_0))) {
        break forward_join_119;
    }
    __fieldWrite108_4(receiver, 1);
    __call108_5(receiver);
    spill108_1 = __fieldRead108_6(receiver);
    if (!((life5_5 != null))) {
        forwardValue108_26_0 = spill108_1;
        break forward_join_26;
    }
    forwardValue108_21_0 = __call108_7(spill108_1);
    }
    if (!((forwardValue108_21_0 > 0))) {
        break forward_join_107;
    }
    forwardValue108_26_0 = __call108_9(__fieldRead108_8(receiver), 0);
    }
    if (!((life5_5 != null))) {
        forwardValue108_34_0 = forwardValue108_26_0;
        break forward_join_34;
    }
    if (!((forwardValue108_26_0 == p0))) {
        break forward_join_107;
    }
    forwardValue108_34_0 = __call108_11(__fieldRead108_10(receiver), 0);
    }
    __discardScalar108_12(forwardValue108_34_0);
    __call108_13(p0, 1);
    life6_63 = __call108_15(p1, __invokedynamic108_14(13468, (5054930256009745009L ^ life3_3)));
    if (!(((__call108_16(p1) / __invokedynamic108_17(23071, (3341210371185004007L ^ life3_3))) == 3))) {
        break forward_join_94;
    }
    if (!((life6_63 != null))) {
        break forward_join_94;
    }
    spill108_2 = p0;
    if (!((life5_5 != null))) {
        forwardValue108_95_0 = spill108_2;
        break forward_join_95;
    }
    if (!((__call108_19(__call108_18(spill108_2)) < 5))) {
        break forward_join_94;
    }
    life6_97 = __call108_21(receiver, life6_63, __call108_20(p0));
    life7_103 = __call108_24(life6_97, __call108_23(__call108_22(p0)));
    __call108_27(life7_103, (__call108_26(__call108_25(p0)) + 1));
    life8_117 = new moom.LR(life7_103, __call108_28(p0));
    __call108_29(life8_117);
    break forward_join_102;
    }
    forwardValue108_95_0 = p0;
    }
    life7_135 = __call108_30(forwardValue108_95_0);
    __call108_32(life7_135, __call108_31(p0), p1);
    }
    __call108_33(receiver, p1);
    if (!((life5_5 == null))) {
        break forward_join_119;
    }
    }
    java.lang.Object __inlineStack108_35Token;
    throw new java.lang.IllegalArgumentException(__invokedynamic108_36(__inlineStack108_35Output0((__inlineStack108_35Token = __inlineStack108_35Pack(p0, __invokedynamic108_34(967, (4789877774173496616L ^ life3_3))))), __inlineStack108_35Output1(__inlineStack108_35Token)));
    }
    return;
}
public static void h108_0(java.io.IOException p0) throws Throwable {
    throw __call3010800_0(p0);
}
public static void h108_1(java.io.IOException p0) throws Throwable {
    throw __call3010801_0(p0);
}
public static void h108_2(java.io.IOException p0) throws Throwable {
    throw __call3010802_0(p0);
}
public static void h108_3(java.io.IOException p0) throws Throwable {
    throw __call3010803_0(p0);
}
public static void h108_4(java.io.IOException p0) throws Throwable {
    throw __call3010804_0(p0);
}
public static void h108_5(java.io.IOException p0) throws Throwable {
    throw __call3010805_0(p0);
}
public static void h108_6(java.io.IOException p0) throws Throwable {
    throw __call3010806_0(p0);
}
public static void h108_7(java.io.IOException p0) throws Throwable {
    throw __call3010807_0(p0);
}
public static void h108_8(java.io.IOException p0) throws Throwable {
    throw __call3010808_0(p0);
}
public static void h108_9(java.io.IOException p0, moom.LQ p1, moom.LR p2, moom.LT p3, long p4, net.minecraft.entity.Entity[] p5) throws Throwable {
    java.io.IOException life7_2;
    moom.LN life7_14;
    life7_2 = p0;
    __call3010809_2(__call3010809_0(p2), __call3010809_1(p2), life7_2);
    if ((p5 == null)) {
        life7_14 = __call3010809_3(p2);
        __call3010809_5(life7_14, __call3010809_4(p2), p3);
    } else {
        
    }
    __call3010809_6(p1, p3);
    if ((p5 == null)) {
        java.lang.Object __inlineStack3010809_8Token;
        throw new java.lang.IllegalArgumentException(__invokedynamic3010809_9(__inlineStack3010809_8Output0((__inlineStack3010809_8Token = __inlineStack3010809_8Pack(p2, __invokedynamic3010809_7(967, (4789877774173496616L ^ p4))))), __inlineStack3010809_8Output1(__inlineStack3010809_8Token)));
    }
    return;
}
public static void h108_10(java.io.IOException p0) throws Throwable {
    throw __call3010810_0(p0);
}
public static void h108_11(java.io.IOException p0) throws Throwable {
    throw __call3010811_0(p0);
}
private static native long __fieldRead108_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call108_1() throws Throwable;
private static native boolean __fieldRead108_2(moom.LQ a0) throws Throwable;
private static native int __integerCategory108_3(boolean value) throws Throwable;
private static native void __fieldWrite108_4(moom.LQ a0, int a1) throws Throwable;
private static native void __call108_5(moom.LQ a0) throws Throwable;
private static native java.util.List __fieldRead108_6(moom.LQ a0) throws Throwable;
private static native int __call108_7(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead108_8(moom.LQ a0) throws Throwable;
private static native java.lang.Object __call108_9(java.util.List a0, int a1) throws Throwable;
private static native java.util.List __fieldRead108_10(moom.LQ a0) throws Throwable;
private static native java.lang.Object __call108_11(java.util.List a0, int a1) throws Throwable;
private static native void __discardScalar108_12(java.lang.Object a0) throws Throwable;
private static native void __call108_13(moom.LR a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic108_14(int a0, long a1) throws Throwable;
private static native java.lang.String __call108_15(moom.LT a0, java.lang.String a1) throws Throwable;
private static native int __call108_16(moom.LT a0) throws Throwable;
private static native int __invokedynamic108_17(int a0, long a1) throws Throwable;
private static native moom.LS __call108_18(moom.LR a0) throws Throwable;
private static native int __call108_19(moom.LS a0) throws Throwable;
private static native moom.LS __call108_20(moom.LR a0) throws Throwable;
private static native java.lang.String __call108_21(moom.LQ a0, java.lang.String a1, moom.LS a2) throws Throwable;
private static native moom.LS __call108_22(moom.LR a0) throws Throwable;
private static native java.net.Proxy __call108_23(moom.LS a0) throws Throwable;
private static native moom.LS __call108_24(java.lang.String a0, java.net.Proxy a1) throws Throwable;
private static native moom.LS __call108_25(moom.LR a0) throws Throwable;
private static native int __call108_26(moom.LS a0) throws Throwable;
private static native void __call108_27(moom.LS a0, int a1) throws Throwable;
private static native moom.LN __call108_28(moom.LR a0) throws Throwable;
private static native void __call108_29(moom.LR a0) throws Throwable;
private static native moom.LN __call108_30(moom.LR a0) throws Throwable;
private static native moom.LS __call108_31(moom.LR a0) throws Throwable;
private static native void __call108_32(moom.LN a0, moom.LS a1, moom.LT a2) throws Throwable;
private static native void __call108_33(moom.LQ a0, moom.LT a1) throws Throwable;
private static native java.lang.String __invokedynamic108_34(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack108_35Pack(moom.LR a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack108_35Output0(java.lang.Object token) throws Throwable;
private static native moom.LR __inlineStack108_35Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic108_36(java.lang.String a0, moom.LR a1) throws Throwable;
private static native java.lang.Exception __call3010800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010803_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010804_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010805_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010806_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010807_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010808_0(java.io.IOException a0) throws Throwable;
private static native moom.LN __call3010809_0(moom.LR a0) throws Throwable;
private static native moom.LS __call3010809_1(moom.LR a0) throws Throwable;
private static native void __call3010809_2(moom.LN a0, moom.LS a1, java.io.IOException a2) throws Throwable;
private static native moom.LN __call3010809_3(moom.LR a0) throws Throwable;
private static native moom.LS __call3010809_4(moom.LR a0) throws Throwable;
private static native void __call3010809_5(moom.LN a0, moom.LS a1, moom.LT a2) throws Throwable;
private static native void __call3010809_6(moom.LQ a0, moom.LT a1) throws Throwable;
private static native java.lang.String __invokedynamic3010809_7(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack3010809_8Pack(moom.LR a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack3010809_8Output0(java.lang.Object token) throws Throwable;
private static native moom.LR __inlineStack3010809_8Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic3010809_9(java.lang.String a0, moom.LR a1) throws Throwable;
private static native java.lang.Exception __call3010810_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3010811_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f3d9652557b7294439ba(moom.LQ a0, moom.LT a1) throws E;
private static final class __SourceHandler_f3d9652557b7294439ba {

public static void f805(moom.LQ receiver, moom.LT p0) throws Throwable {
    java.lang.String lexicalValue805_45_0;
    java.lang.String lexicalValue805_51_0;
    int lexicalValue805_128_0;
    int lexicalValue805_136_0;
    net.minecraft.entity.Entity[] spill805_0;
    java.lang.String spill805_1;
    java.lang.String spill805_2;
    java.lang.String spill805_3;
    boolean spill805_4;
    int spill805_5;
    long life2_3;
    java.lang.String life5_12;
    net.minecraft.entity.Entity[] life4_13;
    java.lang.String life6_57;
    java.lang.String[] life7_72;
    java.lang.String[] life8_74;
    int life9_77;
    int life10_79;
    java.lang.String life11_86;
    java.lang.String[] life12_95;
    int life13_128;
    int life13_172;
    lexical_join_147: {
    lexical_join_51: {
    lexical_join_45: {
    lexical_join_38: {
    life2_3 = (__fieldRead805_0() ^ 100743782682361L);
    spill805_0 = __call805_1();
    life5_12 = __call805_3(p0, __invokedynamic805_2(24787, (6340267294330687149L ^ life2_3)));
    life4_13 = spill805_0;
    spill805_1 = life5_12;
    if (!((life4_13 != null))) {
        lexicalValue805_45_0 = spill805_1;
        break lexical_join_45;
    }
    if (!((spill805_1 != null))) {
        break lexical_join_38;
    }
    spill805_2 = life5_12;
    if (!((life4_13 != null))) {
        lexicalValue805_45_0 = spill805_2;
        break lexical_join_45;
    }
    if (!((!__call805_5(spill805_2, __invokedynamic805_4(7105, (5464044326950139325L ^ life2_3)))))) {
        break lexical_join_38;
    }
    __call805_7(receiver, new java.io.EOFException(__invokedynamic805_6(21555, (6145741644518570571L ^ life2_3))));
    }
    lexicalValue805_45_0 = __call805_9(p0, __invokedynamic805_8(151, (215527980639907557L ^ life2_3)));
    }
    life6_57 = lexicalValue805_45_0;
    spill805_3 = life6_57;
    if (!((life4_13 != null))) {
        lexicalValue805_51_0 = spill805_3;
        break lexical_join_51;
    }
    if (!((spill805_3 != null))) {
        break lexical_join_147;
    }
    lexicalValue805_51_0 = life6_57;
    }
    life7_72 = __call805_11(lexicalValue805_51_0, __invokedynamic805_10(24714, (3369065458186358527L ^ life2_3)));
    life8_74 = life7_72;
    life9_77 = (life8_74).length;
    life10_79 = 0;
    lexical_cycle_65: while (true) {
    lexical_join_145: {
    lexical_join_144: {
    lexical_join_136: {
    lexical_join_128: {
    lexical_join_119: {
    if (!((life10_79 < life9_77))) {
        break lexical_join_147;
    }
    life11_86 = (life8_74)[life10_79];
    life12_95 = __call805_13(receiver, life11_86, __invokedynamic805_12(6195, (4933481335261398875L ^ life2_3)));
    if (!((life4_13 != null))) {
        break lexical_join_145;
    }
    if (!(((life12_95).length >= 2))) {
        break lexical_join_144;
    }
    spill805_4 = __call805_15((life12_95)[0], __invokedynamic805_14(29388, (3405795778627738806L ^ life2_3)));
    if (!((life4_13 != null))) {
        lexicalValue805_128_0 = __integerCategory805_16(spill805_4);
        break lexical_join_128;
    }
    if (!(spill805_4)) {
        break lexical_join_119;
    }
    life13_128 = __call805_17((life12_95)[1], -1);
    spill805_5 = life13_128;
    if (!((life4_13 != null))) {
        lexicalValue805_128_0 = spill805_5;
        break lexical_join_128;
    }
    if (!((spill805_5 > 0))) {
        break lexical_join_119;
    }
    __fieldWrite805_19(receiver, (((long) life13_128) * __invokedynamic805_18(21727, (74935534361904495L ^ life2_3))));
    }
    lexicalValue805_128_0 = __integerCategory805_22(__call805_21((life12_95)[0], __invokedynamic805_20(6107, (8381861383879686571L ^ life2_3))));
    }
    if (!((life4_13 != null))) {
        lexicalValue805_136_0 = lexicalValue805_128_0;
        break lexical_join_136;
    }
    if (!((lexicalValue805_128_0 != 0))) {
        break lexical_join_144;
    }
    lexicalValue805_136_0 = __call805_23((life12_95)[1], -1);
    }
    life13_172 = lexicalValue805_136_0;
    if (!((life4_13 != null))) {
        break lexical_join_145;
    }
    if (!((life13_172 > 0))) {
        break lexical_join_144;
    }
    __fieldWrite805_24(receiver, life13_172);
    }
    life10_79 += 1;
    }
    if (!((life4_13 == null))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    return;
}
public static void h805_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080500_0(p0);
}
public static void h805_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080501_0(p0);
}
public static void h805_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080502_0(p0);
}
public static void h805_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080503_0(p0);
}
public static void h805_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080504_0(p0);
}
public static void h805_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080505_0(p0);
}
public static void h805_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080506_0(p0);
}
public static void h805_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080507_0(p0);
}
public static void h805_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080508_0(p0);
}
public static void h805_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080509_0(p0);
}
public static void h805_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080510_0(p0);
}
public static void h805_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080511_0(p0);
}
public static void h805_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080512_0(p0);
}
public static void h805_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080513_0(p0);
}
private static native long __fieldRead805_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call805_1() throws Throwable;
private static native java.lang.String __invokedynamic805_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call805_3(moom.LT a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic805_4(int a0, long a1) throws Throwable;
private static native boolean __call805_5(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic805_6(int a0, long a1) throws Throwable;
private static native void __call805_7(moom.LQ a0, java.io.EOFException a1) throws Throwable;
private static native java.lang.String __invokedynamic805_8(int a0, long a1) throws Throwable;
private static native java.lang.String __call805_9(moom.LT a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic805_10(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call805_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic805_12(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call805_13(moom.LQ a0, java.lang.String a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic805_14(int a0, long a1) throws Throwable;
private static native boolean __call805_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory805_16(boolean value) throws Throwable;
private static native int __call805_17(java.lang.String a0, int a1) throws Throwable;
private static native long __invokedynamic805_18(int a0, long a1) throws Throwable;
private static native void __fieldWrite805_19(moom.LQ a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic805_20(int a0, long a1) throws Throwable;
private static native boolean __call805_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory805_22(boolean value) throws Throwable;
private static native int __call805_23(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite805_24(moom.LQ a0, int a1) throws Throwable;
private static native java.lang.Exception __call1080500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080503_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080504_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080505_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080506_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080507_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080508_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080509_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080510_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080511_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080512_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080513_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c5a6392aacd7d4f7977a(moom.LQ a0) throws E;
private static final class __SourceHandler_c5a6392aacd7d4f7977a {

public static boolean f806(moom.LQ receiver) throws Throwable {
    int forwardValue806_19_0;
    int forwardValue806_21_0;
    boolean spill806_0;
    int spill806_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead806_0() ^ 102138614283325L);
    life3_5 = __call806_1();
    spill806_0 = __fieldRead806_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue806_19_0 = __integerCategory806_3(spill806_0);
        break forward_join_19;
    }
    if (!((!spill806_0))) {
        break forward_join_18;
    }
    spill806_1 = __fieldRead806_4(receiver);
    if (!((life3_5 != null))) {
        forwardValue806_19_0 = spill806_1;
        break forward_join_19;
    }
    if (!((spill806_1 >= __fieldRead806_5(receiver)))) {
        break forward_join_20;
    }
    }
    forwardValue806_19_0 = 1;
    }
    forwardValue806_21_0 = forwardValue806_19_0;
    break forward_join_21;
    }
    forwardValue806_21_0 = 0;
    }
    return __integerCategory806_6(forwardValue806_21_0);
}
public static void h806_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080600_0(p0);
}
public static void h806_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080601_0(p0);
}
public static void h806_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080602_0(p0);
}
public static void h806_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1080603_0(p0);
}
private static native long __fieldRead806_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call806_1() throws Throwable;
private static native boolean __fieldRead806_2(moom.LQ a0) throws Throwable;
private static native int __integerCategory806_3(boolean value) throws Throwable;
private static native int __fieldRead806_4(moom.LQ a0) throws Throwable;
private static native int __fieldRead806_5(moom.LQ a0) throws Throwable;
private static native boolean __integerCategory806_6(int value) throws Throwable;
private static native java.lang.Exception __call1080600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080602_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1080603_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_608f0268d3e4c787ec44(moom.LQ a0, moom.LR a1) throws E;
private static final class __SourceHandler_608f0268d3e4c787ec44 {

public static boolean f104(moom.LQ receiver, moom.LR p0) throws Throwable {
    int forwardValue104_30_0;
    boolean spill104_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_30: {
    forward_join_13: {
    life2_3 = (__fieldRead104_0() ^ 70830921299645L);
    life4_5 = __call104_1();
    spill104_0 = __call104_2(receiver);
    if (!((life4_5 != null))) {
        forwardValue104_30_0 = __integerCategory104_3(spill104_0);
        break forward_join_30;
    }
    if (!(spill104_0)) {
        break forward_join_13;
    }
    return __integerCategory104_4(0);
    }
    __call104_6(receiver, p0, __fieldRead104_5(receiver));
    __call104_8(receiver, p0, __fieldRead104_7(receiver));
    moom.LQ __stackOp104_9_0 = receiver;
    __fieldWrite104_11(__stackOp104_9_0, (__fieldRead104_10(__stackOp104_9_0) + 1));
    forwardValue104_30_0 = 1;
    }
    return __integerCategory104_12(forwardValue104_30_0);
}
public static void h104_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010400_0(p0);
}
public static void h104_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1010401_0(p0);
}
private static native long __fieldRead104_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call104_1() throws Throwable;
private static native boolean __call104_2(moom.LQ a0) throws Throwable;
private static native int __integerCategory104_3(boolean value) throws Throwable;
private static native boolean __integerCategory104_4(int value) throws Throwable;
private static native java.util.List __fieldRead104_5(moom.LQ a0) throws Throwable;
private static native void __call104_6(moom.LQ a0, moom.LR a1, java.util.List a2) throws Throwable;
private static native java.util.List __fieldRead104_7(moom.LQ a0) throws Throwable;
private static native void __call104_8(moom.LQ a0, moom.LR a1, java.util.List a2) throws Throwable;
private static native int __fieldRead104_10(moom.LQ a0) throws Throwable;
private static native void __fieldWrite104_11(moom.LQ a0, int a1) throws Throwable;
private static native boolean __integerCategory104_12(int value) throws Throwable;
private static native java.lang.Exception __call1010400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1010401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> java.io.InputStream __sourceHandlerCall_0440c7de302d1a44513f(moom.LQ a0) throws E;
private static final class __SourceHandler_0440c7de302d1a44513f {

public static java.io.InputStream f807(moom.LQ receiver) throws Throwable {
    moom.LQ lexicalValue807_23_0;
    moom.LQ spill807_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    lexical_join_23: {
    lexical_join_22: {
    life1_3 = (__fieldRead807_0() ^ 9655567102737L);
    life3_5 = __call807_1();
    lexical_cycle_6: while (true) {
    if (!((__fieldRead807_2(receiver) == null))) {
        break lexical_join_22;
    }
    __call807_3(receiver);
    spill807_0 = receiver;
    if (!((life3_5 != null))) {
        lexicalValue807_23_0 = spill807_0;
        break lexical_join_23;
    }
    __call807_5(spill807_0, __invokedynamic807_4(12248, (4693177265853858689L ^ life1_3)));
    if (!((life3_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexicalValue807_23_0 = receiver;
    }
    return __fieldRead807_6(lexicalValue807_23_0);
}
public static void h807_0(java.io.IOException p0) throws Throwable {
    throw __call1080700_0(p0);
}
private static native long __fieldRead807_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call807_1() throws Throwable;
private static native java.io.InputStream __fieldRead807_2(moom.LQ a0) throws Throwable;
private static native void __call807_3(moom.LQ a0) throws Throwable;
private static native long __invokedynamic807_4(int a0, long a1) throws Throwable;
private static native void __call807_5(moom.LQ a0, long a1) throws Throwable;
private static native java.io.InputStream __fieldRead807_6(moom.LQ a0) throws Throwable;
private static native java.lang.Exception __call1080700_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.LR __sourceHandlerCall_cc3d45543f78dbe0b2e5(moom.LQ a0) throws E;
private static final class __SourceHandler_cc3d45543f78dbe0b2e5 {

public static moom.LR f808(moom.LQ receiver) throws Throwable {
    moom.LQ forwardValue808_21_0;
    moom.LQ spill808_0;
    moom.LQ spill808_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    life1_3 = (__fieldRead808_0() ^ 81316838703467L);
    life3_5 = __call808_1();
    spill808_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue808_21_0 = spill808_0;
        break forward_join_21;
    }
    if (!((__call808_3(__fieldRead808_2(spill808_0)) == 0))) {
        break forward_join_20;
    }
    spill808_1 = receiver;
    if (!((life3_5 != null))) {
        forwardValue808_21_0 = spill808_1;
        break forward_join_21;
    }
    if (!((__fieldRead808_4(spill808_1) != null))) {
        break forward_join_20;
    }
    __call808_6(__fieldRead808_5(receiver));
    }
    forwardValue808_21_0 = receiver;
    }
    return __call808_8(forwardValue808_21_0, __fieldRead808_7(receiver), 1);
}
public static void h808_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call1080800_0(p0);
}
public static void h808_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call1080801_0(p0);
}
public static void h808_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call1080802_0(p0);
}
public static void h808_3(java.lang.InterruptedException p0) throws Throwable {
    throw __call1080803_0(p0);
}
private static native long __fieldRead808_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call808_1() throws Throwable;
private static native java.util.List __fieldRead808_2(moom.LQ a0) throws Throwable;
private static native int __call808_3(java.util.List a0) throws Throwable;
private static native java.io.OutputStream __fieldRead808_4(moom.LQ a0) throws Throwable;
private static native java.io.OutputStream __fieldRead808_5(moom.LQ a0) throws Throwable;
private static native void __call808_6(java.io.OutputStream a0) throws Throwable;
private static native java.util.List __fieldRead808_7(moom.LQ a0) throws Throwable;
private static native moom.LR __call808_8(moom.LQ a0, java.util.List a1, int a2) throws Throwable;
private static native java.lang.Exception __call1080800_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call1080801_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call1080802_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call1080803_0(java.lang.InterruptedException a0) throws Throwable;

}

private static native <E extends Throwable> java.io.OutputStream __sourceHandlerCall_1cbf8ddcffe740f42681(moom.LQ a0) throws E;
private static final class __SourceHandler_1cbf8ddcffe740f42681 {

public static java.io.OutputStream f809(moom.LQ receiver) throws Throwable {
    moom.LQ lexicalValue809_23_0;
    moom.LQ spill809_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    lexical_join_23: {
    lexical_join_22: {
    life1_3 = (__fieldRead809_0() ^ 79678432049813L);
    life3_5 = __call809_1();
    lexical_cycle_6: while (true) {
    if (!((__fieldRead809_2(receiver) == null))) {
        break lexical_join_22;
    }
    __call809_3(receiver);
    spill809_0 = receiver;
    if (!((life3_5 != null))) {
        lexicalValue809_23_0 = spill809_0;
        break lexical_join_23;
    }
    __call809_5(spill809_0, __invokedynamic809_4(21727, (74919275373015299L ^ life1_3)));
    if (!((life3_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexicalValue809_23_0 = receiver;
    }
    return __fieldRead809_6(lexicalValue809_23_0);
}
public static void h809_0(java.io.IOException p0) throws Throwable {
    throw __call1080900_0(p0);
}
private static native long __fieldRead809_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call809_1() throws Throwable;
private static native java.io.OutputStream __fieldRead809_2(moom.LQ a0) throws Throwable;
private static native void __call809_3(moom.LQ a0) throws Throwable;
private static native long __invokedynamic809_4(int a0, long a1) throws Throwable;
private static native void __call809_5(moom.LQ a0, long a1) throws Throwable;
private static native java.io.OutputStream __fieldRead809_6(moom.LQ a0) throws Throwable;
private static native java.lang.Exception __call1080900_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0335411ff20ebe4d92fc(moom.LQ a0) throws E;
private static final class __SourceHandler_0335411ff20ebe4d92fc {

public static void f100091(moom.LQ receiver) throws Throwable {
    moom.LQ forestValue100091_12_0;
    moom.LQ spill100091_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    long life4_15;
    long life6_27;
    forest_join_47: {
    forest_join_24: {
    forest_join_12: {
    life1_3 = (__fieldRead100091_0() ^ 103939849875022L);
    life3_5 = __call100091_1();
    spill100091_0 = receiver;
    if (!((life3_5 != null))) {
        forestValue100091_12_0 = spill100091_0;
        break forest_join_12;
    }
    if (!((__fieldRead100091_2(spill100091_0) != null))) {
        break forest_join_47;
    }
    forestValue100091_12_0 = receiver;
    }
    life4_15 = __fieldRead100091_3(forestValue100091_12_0);
    if (!((__call100091_5(__fieldRead100091_4(receiver)) > 0))) {
        break forest_join_24;
    }
    life4_15 = __invokedynamic100091_6(14466, (6819102216918387079L ^ life1_3));
    }
    life6_27 = __call100091_7();
    if (!((__numericCompare100091_9(life6_27, (__fieldRead100091_8(receiver) + life4_15)) > 0))) {
        break forest_join_47;
    }
    java.lang.Object __inlineStack100091_11Token;
    __call100091_13(receiver, new java.lang.InterruptedException(__invokedynamic100091_12(__inlineStack100091_11Output0((__inlineStack100091_11Token = __inlineStack100091_11Pack(life4_15, __invokedynamic100091_10(26234, (3705844340503521468L ^ life1_3))))), __inlineStack100091_11Output1(__inlineStack100091_11Token))));
    }
    return;
}
public static void h100091_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13009100_0(p0);
}
public static void h100091_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13009101_0(p0);
}
public static void h100091_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13009102_0(p0);
}
private static native long __fieldRead100091_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100091_1() throws Throwable;
private static native java.net.Socket __fieldRead100091_2(moom.LQ a0) throws Throwable;
private static native long __fieldRead100091_3(moom.LQ a0) throws Throwable;
private static native java.util.List __fieldRead100091_4(moom.LQ a0) throws Throwable;
private static native int __call100091_5(java.util.List a0) throws Throwable;
private static native long __invokedynamic100091_6(int a0, long a1) throws Throwable;
private static native long __call100091_7() throws Throwable;
private static native long __fieldRead100091_8(moom.LQ a0) throws Throwable;
private static native int __numericCompare100091_9(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100091_10(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack100091_11Pack(long a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack100091_11Output0(java.lang.Object token) throws Throwable;
private static native long __inlineStack100091_11Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic100091_12(java.lang.String a0, long a1) throws Throwable;
private static native void __call100091_13(moom.LQ a0, java.lang.InterruptedException a1) throws Throwable;
private static native java.lang.Exception __call13009100_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call13009101_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call13009102_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_174d8219d43686601489(moom.LQ a0, java.lang.Exception a1) throws E;
private static final class __SourceHandler_174d8219d43686601489 {

public static void f726(moom.LQ receiver, java.lang.Exception p0) throws Throwable {
    int forestValue726_14_0;
    int forestValue726_47_0;
    int spill726_0;
    int spill726_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.LR life5_29;
    moom.LR life5_51;
    moom.LR life5_64;
    forest_join_63: {
    forest_join_47: {
    forest_join_32: {
    forest_join_14: {
    life2_3 = (__fieldRead726_0() ^ 99302762584410L);
    life4_5 = __call726_1();
    spill726_0 = __call726_3(__fieldRead726_2(receiver));
    if (!((life4_5 != null))) {
        forestValue726_14_0 = spill726_0;
        break forest_join_14;
    }
    if (!((spill726_0 > 0))) {
        break forest_join_63;
    }
    forestValue726_14_0 = __integerCategory726_5(__fieldRead726_4(receiver));
    }
    if (!((life4_5 != null))) {
        forestValue726_47_0 = forestValue726_14_0;
        break forest_join_47;
    }
    if (!((forestValue726_14_0 == 0))) {
        break forest_join_32;
    }
    life5_29 = __cast726_8(__call726_7(__fieldRead726_6(receiver), 0));
    __call726_11(__call726_9(life5_29), __call726_10(life5_29), p0);
    __call726_12(life5_29, 1);
    }
    forest_cycle_32: while (true) {
    if (!((__call726_14(__fieldRead726_13(receiver)) > 0))) {
        break forest_join_63;
    }
    life5_51 = __cast726_17(__call726_16(__fieldRead726_15(receiver), 0));
    __call726_18(life5_51);
    if (!((life4_5 == null))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    break forest_join_63;
    }
    forest_cycle_47: while (true) {
    forest_join_59: {
    if (!((forestValue726_47_0 > 0))) {
        break forest_join_63;
    }
    life5_64 = __cast726_21(__call726_20(__fieldRead726_19(receiver), 0));
    __call726_22(life5_64);
    if (!((life4_5 == null))) {
        break forest_join_59;
    }
    break forest_join_63;
    }
    spill726_1 = __call726_24(__fieldRead726_23(receiver));
    forestValue726_47_0 = spill726_1;
    continue forest_cycle_47;
    }
    }
    return;
}
public static void h726_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3072600_0(p0);
}
public static void h726_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3072601_0(p0);
}
public static void h726_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call3072602_0(p0);
}
private static native long __fieldRead726_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call726_1() throws Throwable;
private static native java.util.List __fieldRead726_2(moom.LQ a0) throws Throwable;
private static native int __call726_3(java.util.List a0) throws Throwable;
private static native boolean __fieldRead726_4(moom.LQ a0) throws Throwable;
private static native int __integerCategory726_5(boolean value) throws Throwable;
private static native java.util.List __fieldRead726_6(moom.LQ a0) throws Throwable;
private static native java.lang.Object __call726_7(java.util.List a0, int a1) throws Throwable;
private static native moom.LR __cast726_8(java.lang.Object a0) throws Throwable;
private static native moom.LN __call726_9(moom.LR a0) throws Throwable;
private static native moom.LS __call726_10(moom.LR a0) throws Throwable;
private static native void __call726_11(moom.LN a0, moom.LS a1, java.lang.Exception a2) throws Throwable;
private static native void __call726_12(moom.LR a0, int a1) throws Throwable;
private static native java.util.List __fieldRead726_13(moom.LQ a0) throws Throwable;
private static native int __call726_14(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead726_15(moom.LQ a0) throws Throwable;
private static native java.lang.Object __call726_16(java.util.List a0, int a1) throws Throwable;
private static native moom.LR __cast726_17(java.lang.Object a0) throws Throwable;
private static native void __call726_18(moom.LR a0) throws Throwable;
private static native java.util.List __fieldRead726_19(moom.LQ a0) throws Throwable;
private static native java.lang.Object __call726_20(java.util.List a0, int a1) throws Throwable;
private static native moom.LR __cast726_21(java.lang.Object a0) throws Throwable;
private static native void __call726_22(moom.LR a0) throws Throwable;
private static native java.util.List __fieldRead726_23(moom.LQ a0) throws Throwable;
private static native int __call726_24(java.util.List a0) throws Throwable;
private static native java.lang.Exception __call3072600_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3072601_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call3072602_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fd848a06aafea6a22a73(moom.LQ a0) throws E;
private static final class __SourceHandler_fd848a06aafea6a22a73 {

public static boolean f812(moom.LQ receiver) throws Throwable {
    int forwardValue812_13_0;
    int forwardValue812_15_0;
    int spill812_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead812_0() ^ 53978425951052L);
    life3_5 = __call812_1();
    spill812_0 = __call812_3(__fieldRead812_2(receiver));
    if (!((life3_5 != null))) {
        forwardValue812_13_0 = spill812_0;
        break forward_join_13;
    }
    if (!((spill812_0 > 0))) {
        break forward_join_14;
    }
    forwardValue812_13_0 = 1;
    }
    forwardValue812_15_0 = forwardValue812_13_0;
    break forward_join_15;
    }
    forwardValue812_15_0 = 0;
    }
    return __integerCategory812_4(forwardValue812_15_0);
}
public static void h812_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1081200_0(p0);
}
private static native long __fieldRead812_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call812_1() throws Throwable;
private static native java.util.List __fieldRead812_2(moom.LQ a0) throws Throwable;
private static native int __call812_3(java.util.List a0) throws Throwable;
private static native boolean __integerCategory812_4(int value) throws Throwable;
private static native java.lang.Exception __call1081200_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


public synchronized moom.LR b__LR() throws java.lang.InterruptedException {
return ((moom.LQ)(this)).a(((java.util.List)(this.d)), ((boolean)(false)));
}


public int b() {
return this.b;
}


private void b__Void() {
this.o = ((long)(java.lang.System.currentTimeMillis()));
    return;
}


public synchronized boolean b__Boolean() { return __sourceHandlerCall_fd848a06aafea6a22a73(this); }


private void b(java.lang.Exception p0) { __sourceHandlerCall_174d8219d43686601489(this, p0); }


public synchronized void b(moom.LR p0, java.lang.Exception p1) {
((moom.LQ)(this)).a(((java.lang.Exception)(p1)));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.LQ.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4332;
      if (w[var3] == null) {
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
         long var5 = v[var3];
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
         Object[] var9 = (Object[])x.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               x.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/LQ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         w[var3] = var15;
      }

      return w[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5912_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.LQ.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral5913_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24118);
    if (((moom.LQ.z)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.LQ.y)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.LQ.A)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LQ.A)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/LQ", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.LQ.z)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.LQ.z)[life3_8])).longValue();
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5915_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/LQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.LQ.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 25086);
    if (((moom.LQ.t)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.LQ.u)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.LQ.u)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/LQ", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.LQ.s)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.LQ.t)[life5_8] = moom.LQ.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.LQ.t)[life5_8];
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill3024_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3024_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3024_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3024_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3024_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3024_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public synchronized moom.LR a__LR() throws java.lang.InterruptedException, java.io.IOException { return __sourceHandlerCall_cc3d45543f78dbe0b2e5(this); }


private moom.LR a(java.util.List<moom.LR> p0, boolean p1) throws java.lang.InterruptedException { return __sourceHandlerCall_6f9aff48bac32a738370(this, p0, p1); }


private synchronized void a(java.lang.Exception p0) { __sourceHandlerCall_f72e6ddc7e119f46b4df(this, p0); }


public synchronized boolean a__Boolean(moom.LR p0) { return __sourceHandlerCall_608f0268d3e4c787ec44(this, p0); }


private void a(moom.LR p0, java.util.List<moom.LR> p1) {
((java.util.List)(p1)).add(((java.lang.Object)(p0)));
    ((java.lang.Object)(this)).notifyAll();
    return;
}


public synchronized void a(java.net.Socket p0) throws java.io.IOException { __sourceHandlerCall_34b0a934459205bd24bc(this, p0); }


public synchronized java.io.OutputStream a__OutputStream() throws java.io.IOException, java.lang.InterruptedException { return __sourceHandlerCall_1cbf8ddcffe740f42681(this); }


public synchronized java.io.InputStream a__InputStream() throws java.io.IOException, java.lang.InterruptedException { return __sourceHandlerCall_0440c7de302d1a44513f(this); }


public synchronized boolean a__Boolean() { return __sourceHandlerCall_c5a6392aacd7d4f7977a(this); }


public synchronized void a(moom.LR p0, moom.LT p1) { __sourceHandlerCall_48d1cd66989461a19acd(this, p0, p1); }


private java.lang.String a(java.lang.String p0, moom.LS p1) { return __sourceHandlerCall_282476516dcca3462b02(this, p0, p1); }


private void a(moom.LT p0) { __sourceHandlerCall_f3d9652557b7294439ba(this, p0); }


public synchronized void a(moom.LR p0, java.lang.Exception p1) {
((moom.LQ)(this)).a(((java.lang.Exception)(p1)));
    return;
}


private java.lang.String[] a(java.lang.String p0, char p1) { return __sourceHandlerCall_865864b9777898002f8a(this, p0, p1); }


public java.net.Proxy a__Proxy() {
return this.c;
}


private void a__Void() { __sourceHandlerCall_0335411ff20ebe4d92fc(this); }


public java.lang.String a__String() {
return this.a;
}


public synchronized void a(moom.LR p0) { __sourceHandlerCall_9ca8b0a212845da4943d(this, p0); }


public int a() {
return this.k;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite673_143(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a362351dcd469cf6_originalDynamicSite557_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a362351dcd469cf6_originalDynamicSite557_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5915_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5912_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral5913_0() throws E;
}
