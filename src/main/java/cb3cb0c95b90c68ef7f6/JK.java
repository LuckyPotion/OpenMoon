package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JK {

private static net.minecraft.client.Minecraft a;

private static net.minecraft.client.settings.GameSettings b;

private static moom.A9 c;

public static boolean d;

public static moom.JL e;

public static moom.JL f;

public static moom.JL g;

public static moom.JL h;

public static moom.JL i;

public static moom.JL j;

public static moom.JL k;

private static final long[] l;

private static final long[] m;

private static final long[] n;

private static final long[] o;

private static final long[] p;

private static final long[] q;

private static final long[] r;

private static final long[] s;

private static final boolean[] t;

private static int u;

private static long v;

private static long w;

private static final long x;

private static final java.lang.String[] y;

private static final java.lang.String[] z;

private static final java.util.Map A;

private static final long[] B;

private static final java.lang.Integer[] C;

private static final java.util.Map D;

private static final long[] E;

private static final java.lang.Long[] F;

private static final java.util.Map G;

public JK() {
super();
}


static {
x = ((long)(((moom._a)(moom._c.a(((long)(-1414125957607782392L)), ((long)(-7193754424926929544L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(189287447715356L)))));
    long local31_life6 = (moom.JK.x ^ 89365421036908L);
    A = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local22_life9;
    javax.crypto.Cipher __sourceSpill596_11 = (local22_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill596_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill596_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill596_14 = new byte[8];
    (__sourceSpill596_14)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local23_life15 = 1;
    while ((local23_life15 < 8)) {
        (__sourceSpill596_14)[local23_life15] = ((byte) ((int) ((local31_life6 << (local23_life15 * 8)) >>> 56)));
        local23_life15 += 1;
    }
    byte[] __sourcePreallocation596_16 = __sourceSpill596_14;
    ((javax.crypto.Cipher)(__sourceSpill596_11)).init(((int)(__sourceSpill596_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill596_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation596_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local29_life19 = new java.lang.String[5];
    int local27_life20 = 0;
    java.lang.String local26_life21;
    int local28_life23 = ((java.lang.String)((local26_life21 = "Çê±#Zº/k£CÙÍ@Ý±5\020PW\035l`ú\003Ãæ¢zùÛ\020ã$Ûú%Äåð6¥:1M="))).length();
    int local25_life24 = 16;
    int local24_life25 = -1;
    while (true) {
        local24_life25 += 1;
        byte[] __sourceSpill596_28 = ((java.lang.String)(((java.lang.String)(local26_life21)).substring(((int)(local24_life25)), ((int)((local24_life25 + local25_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill596_29 = local22_life9;
        byte[] local30_life31 = ((javax.crypto.Cipher)(__sourceSpill596_29)).doFinal(((byte[])(__sourceSpill596_28)));
        java.lang.String __sourceSpill596_34 = ((java.lang.String)(moom.JK.a(((byte[])(local30_life31))))).intern();
        java.lang.String[] __sourceSpill596_35 = local29_life19;
        int __sourceSpill596_36 = local27_life20;
        local27_life20 += 1;
        (__sourceSpill596_35)[__sourceSpill596_36] = __sourceSpill596_34;
        if (!(((local24_life25 = (local24_life25 + local25_life24)) < local28_life23))) { break; }
        local25_life24 = ((java.lang.String)(local26_life21)).charAt(((int)(local24_life25)));
    }
    local28_life23 = ((java.lang.String)((local26_life21 = "j·#\f\005¾«QÎZ5âÊ\020[\0303RséàbÕÍ~@;\025°õ"))).length();
    local25_life24 = 16;
    local24_life25 = -1;
    while (true) {
        local24_life25 += 1;
        byte[] __sourceSpill596_41 = ((java.lang.String)(((java.lang.String)(local26_life21)).substring(((int)(local24_life25)), ((int)((local24_life25 + local25_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill596_42 = local22_life9;
        byte[] local30_life44 = ((javax.crypto.Cipher)(__sourceSpill596_42)).doFinal(((byte[])(__sourceSpill596_41)));
        java.lang.String __sourceSpill596_47 = ((java.lang.String)(moom.JK.a(((byte[])(local30_life44))))).intern();
        java.lang.String[] __sourceSpill596_48 = local29_life19;
        int __sourceSpill596_49 = local27_life20;
        local27_life20 += 1;
        (__sourceSpill596_48)[__sourceSpill596_49] = __sourceSpill596_47;
        if (!(((local24_life25 = (local24_life25 + local25_life24)) < local28_life23))) { break; }
        local25_life24 = ((java.lang.String)(local26_life21)).charAt(((int)(local24_life25)));
    }
    y = ((java.lang.String[])(local29_life19));
    z = ((java.lang.String[])(new java.lang.String[5]));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill596_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill596_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill596_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill596_60 = new byte[8];
    (__sourceSpill596_60)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill596_60)[local12_life61] = ((byte) ((int) ((local31_life6 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation596_62 = __sourceSpill596_60;
    ((javax.crypto.Cipher)(__sourceSpill596_57)).init(((int)(__sourceSpill596_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill596_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation596_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[25];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "¦\024Îê\034gå\000p×¯r¦ùtÜ\035ö½ì¯ewigB^ª´ùûD\003ÓZ\033.Rö<¹\017¬ç5óáìÔÊö¤\bÝ)à^ÉTfRê¥\\#ì\037¨´WÂ\bF\016¹¢Ø\nÉFÆé¾oÚá´/­Ëó©ò¢±\177+u`2Ö~Ü\177ë\005íè\ny´ðÚS\r\001ÙÏq'ê\030^\022ÊL·ZÊö\024'Þ\007ûÆÜD\003öCÌjÃ\031É{aít¢¤\000#ÇD·¥Ù.\002Í\026"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill596_71 = local15_life67;
        int __sourceSpill596_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill596_71)).substring(((int)(__sourceSpill596_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill596_76 = local17_life65;
        int __sourceSpill596_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill596_79 = new byte[8];
        (__sourceSpill596_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill596_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill596_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill596_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill596_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill596_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill596_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill596_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill596_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill596_80)).doFinal(((byte[])(__sourceSpill596_79)));
        (__sourceSpill596_76)[__sourceSpill596_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "\\Ò7\nCÊ*`\n¥þVJ¥"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill596_84 = local15_life67;
        int __sourceSpill596_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill596_84)).substring(((int)(__sourceSpill596_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill596_89 = local17_life65;
        int __sourceSpill596_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill596_92 = new byte[8];
        (__sourceSpill596_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill596_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill596_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill596_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill596_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill596_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill596_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill596_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill596_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill596_93)).doFinal(((byte[])(__sourceSpill596_92)));
        (__sourceSpill596_89)[__sourceSpill596_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    B = ((long[])(local17_life65));
    C = ((java.lang.Integer[])(new java.lang.Integer[25]));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill596_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill596_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill596_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill596_105 = new byte[8];
    (__sourceSpill596_105)[0] = ((byte) ((int) (local31_life6 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill596_105)[local1_life106] = ((byte) ((int) ((local31_life6 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation596_107 = __sourceSpill596_105;
    ((javax.crypto.Cipher)(__sourceSpill596_102)).init(((int)(__sourceSpill596_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill596_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation596_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[8];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "hVh9Ùå>^gÂ´35v6ÃZ²\027ç\033\002ô\020Z\037ë>pHÙ]ç t´O\féðp%¥"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill596_116 = local4_life112;
        int __sourceSpill596_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill596_116)).substring(((int)(__sourceSpill596_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill596_121 = local6_life110;
        int __sourceSpill596_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill596_124 = new byte[8];
        (__sourceSpill596_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill596_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill596_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill596_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill596_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill596_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill596_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill596_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill596_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill596_125)).doFinal(((byte[])(__sourceSpill596_124)));
        (__sourceSpill596_121)[__sourceSpill596_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    local5_life114 = ((java.lang.String)((local4_life112 = "ÞÌ*\024á>\\F¥d\032\t¹>a«"))).length();
    local2_life115 = 0;
    do {
        java.lang.String __sourceSpill596_129 = local4_life112;
        int __sourceSpill596_130 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life133 = ((java.lang.String)(((java.lang.String)(__sourceSpill596_129)).substring(((int)(__sourceSpill596_130)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill596_134 = local6_life110;
        int __sourceSpill596_135 = local3_life111;
        local3_life111 += 1;
        long local8_life136 = (((((((((((long) (local7_life133)[0]) & 255L) << 56) | ((((long) (local7_life133)[1]) & 255L) << 48)) | ((((long) (local7_life133)[2]) & 255L) << 40)) | ((((long) (local7_life133)[3]) & 255L) << 32)) | ((((long) (local7_life133)[4]) & 255L) << 24)) | ((((long) (local7_life133)[5]) & 255L) << 16)) | ((((long) (local7_life133)[6]) & 255L) << 8)) | (((long) (local7_life133)[7]) & 255L));
        byte[] __sourceSpill596_137 = new byte[8];
        (__sourceSpill596_137)[0] = ((byte) ((int) (local8_life136 >>> 56)));
        (__sourceSpill596_137)[1] = ((byte) ((int) (local8_life136 >>> 48)));
        (__sourceSpill596_137)[2] = ((byte) ((int) (local8_life136 >>> 40)));
        (__sourceSpill596_137)[3] = ((byte) ((int) (local8_life136 >>> 32)));
        (__sourceSpill596_137)[4] = ((byte) ((int) (local8_life136 >>> 24)));
        (__sourceSpill596_137)[5] = ((byte) ((int) (local8_life136 >>> 16)));
        (__sourceSpill596_137)[6] = ((byte) ((int) (local8_life136 >>> 8)));
        (__sourceSpill596_137)[7] = ((byte) ((int) local8_life136));
        javax.crypto.Cipher __sourceSpill596_138 = local0_life100;
        byte[] local10_life140 = ((javax.crypto.Cipher)(__sourceSpill596_138)).doFinal(((byte[])(__sourceSpill596_137)));
        (__sourceSpill596_134)[__sourceSpill596_135] = (((((((((((long) (local10_life140)[0]) & 255L) << 56) | ((((long) (local10_life140)[1]) & 255L) << 48)) | ((((long) (local10_life140)[2]) & 255L) << 40)) | ((((long) (local10_life140)[3]) & 255L) << 32)) | ((((long) (local10_life140)[4]) & 255L) << 24)) | ((((long) (local10_life140)[5]) & 255L) << 16)) | ((((long) (local10_life140)[6]) & 255L) << 8)) | (((long) (local10_life140)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    E = ((long[])(local6_life110));
    F = ((java.lang.Long[])(new java.lang.Long[8]));
    d = ((boolean)(false));
    int __sourceSpill596_145 = 14209;
    int __sourceSpill596_146 = 9991;
    e = ((moom.JL)(new moom.JL()));
    long __sourceSpill596_148 = (917022079179302161L ^ local31_life6);
    f = ((moom.JL)(new moom.JL()));
    g = ((moom.JL)(new moom.JL()));
    h = ((moom.JL)(new moom.JL()));
    i = ((moom.JL)(new moom.JL()));
    j = ((moom.JL)(new moom.JL()));
    k = ((moom.JL)(new moom.JL()));
    l = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_154(__sourceSpill596_146, __sourceSpill596_148)]));
    long __sourceSpill596_158 = (5222374020080285871L ^ local31_life6);
    m = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_156(28028, (5458056073682874222L ^ local31_life6))]));
    n = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_159(28028, (5458056073682874222L ^ local31_life6))]));
    o = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_161(28028, (5458056073682874222L ^ local31_life6))]));
    p = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_163(28028, (5458056073682874222L ^ local31_life6))]));
    q = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_165(28028, (5458056073682874222L ^ local31_life6))]));
    r = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_167(28028, (5458056073682874222L ^ local31_life6))]));
    s = ((long[])(new long[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_169(28028, (5458056073682874222L ^ local31_life6))]));
    t = ((boolean[])(new boolean[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_171(28028, (5458056073682874222L ^ local31_life6))]));
    u = ((int)(0));
    v = ((long)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_174(__sourceSpill596_145, __sourceSpill596_158)));
    w = ((long)(0L));
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JK.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1006;
        if (C[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = B[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])D.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    D.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/JK", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            JK.C[n4] = n7;
        }
        return C[n4];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5120_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral5121_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.JK.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7471);
    if (((moom.JK.F)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.JK.E)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.JK.G)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JK.G)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/JK", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.JK.F)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.JK.F)[life3_8])).longValue();
}


private static long a(int p0, int p1, long p2, int p3, int p4, int p5, float p6, moom.lw p7) {
long forwardValue2292_77_0;
    net.minecraft.entity.Entity[] spill2292_0;
    long spill2292_1;
    long life9_3;
    long life12_12;
    net.minecraft.entity.Entity[] life11_13;
    forward_join_77: {
    forward_join_26: {
    life9_3 = (moom.JK.x ^ 98773351739910L);
    spill2292_0 = moom.JM.b__Arrayr3();
    life12_12 = (p2 / __sourceIntrinsic_2bf608ac55b7_invokedynamic2292_2(31728, (3448408434606232502L ^ life9_3)));
    life11_13 = spill2292_0;
    spill2292_1 = life12_12;
    if (!((life11_13 != null))) {
        forwardValue2292_77_0 = spill2292_1;
        break forward_join_77;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(spill2292_1)), ((long)(__sourceIntrinsic_2bf608ac55b7_invokedynamic2292_3(14370, (4550449202720215141L ^ life9_3))))) < 0))) {
        break forward_join_26;
    }
    return 0L;
    }
    ((moom.lw)(((moom.lw)(((moom.lw)(p7)).a(((double)(((double) (((float) p0) + 0x1.0p-1f)))), ((double)(((double) ((p6 - ((float) life12_12)) + 0x1.0p-1f)))), ((double)(0x0.0p0d))))).a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(__sourceIntrinsic_2bf608ac55b7_invokedynamic2292_6(20950, (3777842956097549495L ^ life9_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p7)).a(((double)(((double) (((float) p1) + 0x1.0p-1f)))), ((double)(((double) ((p6 - ((float) life12_12)) + 0x1.0p-1f)))), ((double)(0x0.0p0d))))).a(((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(__sourceIntrinsic_2bf608ac55b7_invokedynamic2292_10(20950, (3777842956097549495L ^ life9_3))))))).c__Void();
    forwardValue2292_77_0 = life12_12;
    }
    return forwardValue2292_77_0;
}


private static long a(int p0, long p1, int p2, int p3, int p4, float p5, moom.lw p6) {
long forwardValue2293_74_0;
    net.minecraft.entity.Entity[] spill2293_0;
    long spill2293_1;
    long life8_3;
    long life11_12;
    net.minecraft.entity.Entity[] life10_13;
    forward_join_74: {
    forward_join_26: {
    life8_3 = (moom.JK.x ^ 118668972955970L);
    spill2293_0 = moom.JM.b__Arrayr3();
    life11_12 = (p1 / __sourceIntrinsic_39ca3fd389e6_invokedynamic2293_2(18938, (5997651311286930173L ^ life8_3)));
    life10_13 = spill2293_0;
    spill2293_1 = life11_12;
    if (!((life10_13 != null))) {
        forwardValue2293_74_0 = spill2293_1;
        break forward_join_74;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)(spill2293_1)), ((long)(__sourceIntrinsic_39ca3fd389e6_invokedynamic2293_3(13276, (5732898294188585181L ^ life8_3))))) < 0))) {
        break forward_join_26;
    }
    return 0L;
    }
    ((moom.lw)(((moom.lw)(((moom.lw)(p6)).a(((double)(((double) (((float) p0) + 0x1.0p-1f)))), ((double)(((double) ((p5 - ((float) life11_12)) + 0x1.0p-1f)))), ((double)(0x0.0p0d))))).a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_39ca3fd389e6_invokedynamic2293_6(12035, (5195936381986578750L ^ life8_3))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(p6)).a(((double)(((double) (((float) p0) + 0x1.0p-1f)))), ((double)(((double) (p5 + 0x1.0p-1f)))), ((double)(0x0.0p0d))))).a(((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(__sourceIntrinsic_39ca3fd389e6_invokedynamic2293_10(20950, (3777862715307352051L ^ life8_3))))))).c__Void();
    forwardValue2293_74_0 = life11_12;
    }
    return forwardValue2293_74_0;
}


public static void a(moom.ir p0) {
net.minecraft.client.settings.GameSettings forestValue296_11_0;

    int forestValue296_17_0;

    int forestValue296_132_0;

    int forestValue296_436_0;

    net.minecraft.client.settings.GameSettings spill296_0;

    boolean spill296_1;

    int spill296_2;

    long spill296_3;

    boolean spill296_4;

    int spill296_5;

    net.minecraft.client.gui.FontRenderer spill296_6;

    java.lang.String spill296_7;

    long spill296_8;

    long life1_3;

    net.minecraft.entity.Entity[] life3_5;

    long life4_22;

    net.minecraft.client.renderer.Tessellator life6_65;

    moom.lw life7_68;

    int life8_74;

    int life9_96;

    int life9_104;

    float life10_108;

    long life11_110;

    float life10_168;

    float life10_182;

    float life10_196;

    float life10_210;

    float life10_224;

    float life10_238;

    float life13_252;

    int life8_325;

    int life9_334;

    float life10_431;

    int life11_443;

    int life12_450;

    int life13_457;

    int life14_475;

    int life15_486;

    int life16_498;

    net.minecraft.client.gui.GuiIngame life17_501;

    forest_join_544: {

    forest_join_436: {

    forest_join_249: {

    forest_join_18: {

    forest_join_17: {

    forest_join_11: {

    life1_3 = (moom.JK.x ^ 115634443078240L);

    life3_5 = moom.JM.b__Arrayr3();

    spill296_0 = moom.JK.b;

    if (!((life3_5 != null))) {

        forestValue296_11_0 = spill296_0;

        break forest_join_11;

    }

    if (!((spill296_0 != null))) {

        break forest_join_544;

    }

    forestValue296_11_0 = moom.JK.b;

    }

    spill296_1 = ((net.minecraft.client.settings.GameSettings)(forestValue296_11_0)).bl;

    if (!((life3_5 != null))) {

        forestValue296_17_0 = ((spill296_1) ? 1 : 0);

        break forest_join_17;

    }

    if (!((!spill296_1))) {

        break forest_join_18;

    }

    forestValue296_17_0 = ((((net.minecraft.client.settings.GameSettings)(moom.JK.b)).aS) ? 1 : 0);

    }

    if (!((forestValue296_17_0 != 0))) {

        break forest_join_544;

    }

    }

    life4_22 = java.lang.System.nanoTime();

    moom.kZ.k(((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_10(19386, (6822817218252805810L ^ life1_3)))));

    moom.kZ.l(((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_12(19058, (2567226383548880759L ^ life1_3)))));

    spill296_2 = 4201;

    moom.kZ.B();

    spill296_3 = (1960515354000280934L ^ life1_3);

    moom.kZ.g();

    moom.kZ.A();

    moom.kZ.a(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.Minecraft)(moom.JK.a)).G))), ((double)(((double) ((net.minecraft.client.Minecraft)(moom.JK.a)).H))), ((double)(0x0.0p0d)), ((double)(0x1.f4p9d)), ((double)(0x1.77p11d)));

    moom.kZ.l(((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_22(spill296_2, spill296_3))));

    moom.kZ.B();

    moom.kZ.A();

    moom.kZ.b(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(-0x1.f4p10f)));

    org.lwjgl.opengl.GL11.glLineWidth(((float)(0x1.0p0f)));

    moom.kZ.v();

    life6_65 = net.minecraft.client.renderer.Tessellator.a();

    life7_68 = ((net.minecraft.client.renderer.Tessellator)(life6_65)).a__lw();

    ((moom.lw)(life7_68)).a(((int)(1)), ((moom.oD)(moom.oB.h)));

    life8_74 = 0;

    forest_cycle_72: while (true) {

    forest_join_246: {

    forest_join_132: {

    forest_join_131: {

    if (!((life8_74 < (moom.JK.l).length))) {

        break forest_join_249;

    }

    life9_96 = ((((life8_74 - moom.JK.u) & ((moom.JK.l).length - 1)) * __sourceIntrinsic_b9db2db4e947_invokedynamic296_36(3387, (670243798434500661L ^ life1_3))) / (moom.JK.l).length);

    life9_104 = (life9_96 + __sourceIntrinsic_b9db2db4e947_invokedynamic296_38(28672, (7472466883850120458L ^ life1_3)));

    life10_108 = ((float) ((net.minecraft.client.Minecraft)(moom.JK.a)).H);

    life11_110 = 0L;

    spill296_4 = (moom.JK.t)[life8_74];

    if (!((life3_5 != null))) {

        forestValue296_436_0 = ((spill296_4) ? 1 : 0);

        break forest_join_436;

    }

    if (!((life3_5 != null))) {

        forestValue296_132_0 = ((spill296_4) ? 1 : 0);

        break forest_join_132;

    }

    if (!(spill296_4)) {

        break forest_join_131;

    }

    moom.JK.a(((int)(life8_74)), ((long)((moom.JK.l)[life8_74])), ((int)(life9_104)), ((int)((life9_104 / 2))), ((int)(0)), ((float)(life10_108)), ((moom.lw)(life7_68)));

    if (!((life3_5 == null))) {

        break forest_join_246;

    }

    }

    forestValue296_132_0 = life8_74;

    }

    moom.JK.a(((int)(forestValue296_132_0)), ((long)((moom.JK.l)[life8_74])), ((int)(life9_104)), ((int)(life9_104)), ((int)(life9_104)), ((float)(life10_108)), ((moom.lw)(life7_68)));

    life10_168 = (life10_108 - ((float) moom.JK.a(((int)(life8_74)), ((long)((moom.JK.s)[life8_74])), ((int)((life9_104 / 2))), ((int)((life9_104 / 2))), ((int)((life9_104 / 2))), ((float)(life10_108)), ((moom.lw)(life7_68)))));

    life10_182 = (life10_168 - ((float) moom.JK.a(((int)(life8_74)), ((long)((moom.JK.r)[life8_74])), ((int)(0)), ((int)(life9_104)), ((int)(0)), ((float)(life10_168)), ((moom.lw)(life7_68)))));

    life10_196 = (life10_182 - ((float) moom.JK.a(((int)(life8_74)), ((long)((moom.JK.q)[life8_74])), ((int)(life9_104)), ((int)(life9_104)), ((int)(0)), ((float)(life10_182)), ((moom.lw)(life7_68)))));

    life10_210 = (life10_196 - ((float) moom.JK.a(((int)(life8_74)), ((long)((moom.JK.p)[life8_74])), ((int)(life9_104)), ((int)(0)), ((int)(0)), ((float)(life10_196)), ((moom.lw)(life7_68)))));

    life10_224 = (life10_210 - ((float) moom.JK.a(((int)(life8_74)), ((long)((moom.JK.o)[life8_74])), ((int)(life9_104)), ((int)(0)), ((int)(life9_104)), ((float)(life10_210)), ((moom.lw)(life7_68)))));

    life10_238 = (life10_224 - ((float) moom.JK.a(((int)(life8_74)), ((long)((moom.JK.n)[life8_74])), ((int)(0)), ((int)(0)), ((int)(life9_104)), ((float)(life10_224)), ((moom.lw)(life7_68)))));

    life13_252 = (life10_238 - ((float) moom.JK.a(((int)(life8_74)), ((long)((moom.JK.m)[life8_74])), ((int)(0)), ((int)(life9_104)), ((int)(life9_104)), ((float)(life10_238)), ((moom.lw)(life7_68)))));

    life13_252 = life13_252;

    }

    life8_74 += 1;

    if (!((life3_5 == null))) {

        continue forest_cycle_72;

    }

    break forest_cycle_72;

    }

    }

    moom.JK.a(((int)(0)), ((int)((moom.JK.l).length)), ((long)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_63(19017, (9021711603629660783L ^ life1_3)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_64(32708, (7180370196350640832L ^ life1_3)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_65(14281, (3020689063997270735L ^ life1_3)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_66(14281, (3020689063997270735L ^ life1_3)))), ((float)(((float) ((net.minecraft.client.Minecraft)(moom.JK.a)).H))), ((moom.lw)(life7_68)));

    moom.JK.a(((int)(0)), ((int)((moom.JK.l).length)), ((long)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_71(30655, (3758573193514690456L ^ life1_3)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_72(14281, (3020689063997270735L ^ life1_3)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_73(14281, (3020689063997270735L ^ life1_3)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_74(14281, (3020689063997270735L ^ life1_3)))), ((float)(((float) ((net.minecraft.client.Minecraft)(moom.JK.a)).H))), ((moom.lw)(life7_68)));

    ((net.minecraft.client.renderer.Tessellator)(life6_65)).a__Void();

    moom.kZ.u();

    life8_325 = (((net.minecraft.client.Minecraft)(moom.JK.a)).H - __sourceIntrinsic_b9db2db4e947_invokedynamic296_82(17294, (5499517622498827923L ^ life1_3)));

    life9_334 = (((net.minecraft.client.Minecraft)(moom.JK.a)).H - __sourceIntrinsic_b9db2db4e947_invokedynamic296_85(19727, (5826913214576660494L ^ life1_3)));

    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(moom.JK.a)).N)).b(((java.lang.String)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_88(3426, (2545406364790581330L ^ life1_3)))), ((float)(0x1.0p1f)), ((float)(((float) (life9_334 + 1)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_89(25083, (1833916926433705202L ^ life1_3)))));

    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(moom.JK.a)).N)).b(((java.lang.String)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_93(15923, (8847026775400733442L ^ life1_3)))), ((float)(0x1.0p0f)), ((float)(((float) life9_334))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_94(11817, (3212592035306500913L ^ life1_3)))));

    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(moom.JK.a)).N)).b(((java.lang.String)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_98(8014, (4937783954241387130L ^ life1_3)))), ((float)(0x1.0p1f)), ((float)(((float) (life8_325 + 1)))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_99(13365, (7953845427042543913L ^ life1_3)))));

    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(moom.JK.a)).N)).b(((java.lang.String)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_103(32141, (8647749789764982974L ^ life1_3)))), ((float)(0x1.0p0f)), ((float)(((float) life8_325))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_104(29109, (102473216997993654L ^ life1_3)))));

    moom.kZ.l(((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_106(30938, (6282335922108311000L ^ life1_3)))));

    spill296_5 = 27030;

    moom.kZ.C();

    moom.kZ.l(((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_109(spill296_5, (1092964560042144909L ^ life1_3)))));

    moom.kZ.C();

    moom.kZ.u();

    life10_431 = (0x1.0p0f - ((float) (((double) (java.lang.System.currentTimeMillis() - moom.N5.b())) / 0x1.f4p9d)));

    life10_108 = moom.BU.a(((float)(life10_431)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)));

    forestValue296_436_0 = ((int) (0x1.54p7f + (life10_108 * 0x1.54p6f)));

    }

    life11_443 = forestValue296_436_0;

    life12_450 = ((int) (0x1.9p6f + (life10_108 * 0x1.b8p5f)));

    life13_457 = ((int) (0x1.4p3f + (life10_108 * 0x1.4p3f)));

    life14_475 = (((life11_443 << __sourceIntrinsic_b9db2db4e947_invokedynamic296_116(18985, (1738263606975239970L ^ life1_3))) | (life12_450 << __sourceIntrinsic_b9db2db4e947_invokedynamic296_117(16918, (8348257295388483329L ^ life1_3)))) | life13_457);

    life15_486 = ((__sourceIntrinsic_b9db2db4e947_invokedynamic296_118(28028, (5458030113957195874L ^ life1_3)) / ((moom.ir)(p0)).c()) + 2);

    life16_498 = ((((net.minecraft.client.Minecraft)(moom.JK.a)).H / ((moom.ir)(p0)).c()) - __sourceIntrinsic_b9db2db4e947_invokedynamic296_123(25684, (3447243333475416404L ^ life1_3)));

    life17_501 = ((net.minecraft.client.Minecraft)(moom.JK.a)).T;

    __sourceExactCall_d162903a98f49d(((int)((life15_486 - 1))), ((int)((life16_498 - 1))), ((int)((life15_486 + __sourceIntrinsic_b9db2db4e947_invokedynamic296_126(8368, (1571544489119874473L ^ life1_3))))), ((int)((life16_498 + __sourceIntrinsic_b9db2db4e947_invokedynamic296_127(30113, (4805009691716757676L ^ life1_3))))), ((int)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_128(20234, (7254506098204905990L ^ life1_3)))));

    spill296_6 = ((net.minecraft.client.Minecraft)(moom.JK.a)).N;

    long __stackOp296_133_0 = moom.N5.d();

    java.lang.String __stackOp296_133_1 = " ";

    spill296_7 = __stackOp296_133_1;

    spill296_8 = __stackOp296_133_0;

    recovery.source.CarrierOps.discard(__stackOp296_133_1);

    ((net.minecraft.client.gui.FontRenderer)(spill296_6)).b(((java.lang.String)(__sourceIntrinsic_b9db2db4e947_invokedynamic296_136(spill296_7, spill296_8, __sourceIntrinsic_b9db2db4e947_invokedynamic296_135(1596, (3149593631399502606L ^ life1_3))))), ((float)(((float) life15_486))), ((float)(((float) life16_498))), ((int)(life14_475)));

    moom.JK.w = ((long)((java.lang.System.nanoTime() - life4_22)));

    }

    return;
}


public static void a() {
net.minecraft.client.Minecraft forwardValue2291_16_0;
    int forwardValue2291_34_0;
    int forwardValue2291_57_0;
    int forwardValue2291_130_0;
    net.minecraft.client.Minecraft spill2291_0;
    boolean spill2291_1;
    boolean spill2291_2;
    boolean spill2291_3;
    int spill2291_4;
    long life0_3;
    net.minecraft.entity.Entity[] life2_5;
    long life3_57;
    int life5_87;
    int life6_93;
    forward_join_137: {
    forward_join_130: {
    forward_join_129: {
    forward_join_127: {
    forward_join_57: {
    forward_join_51: {
    forward_join_34: {
    forward_join_33: {
    forward_join_18: {
    forward_join_16: {
    life0_3 = (moom.JK.x ^ 106389826206485L);
    life2_5 = moom.JM.b__Arrayr3();
    spill2291_0 = moom.JK.a;
    if (!((life2_5 != null))) {
        forwardValue2291_16_0 = spill2291_0;
        break forward_join_16;
    }
    if (!((spill2291_0 == null))) {
        break forward_join_18;
    }
    moom.JK.a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    moom.JK.b = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(moom.JK.a)).W));
    forwardValue2291_16_0 = moom.JK.a;
    }
    moom.JK.c = ((moom.A9)(((net.minecraft.client.Minecraft)(forwardValue2291_16_0)).j));
    }
    spill2291_1 = ((net.minecraft.client.settings.GameSettings)(moom.JK.b)).aQ;
    if (!((life2_5 != null))) {
        forwardValue2291_130_0 = ((spill2291_1) ? 1 : 0);
        break forward_join_130;
    }
    if (!(spill2291_1)) {
        break forward_join_129;
    }
    spill2291_2 = ((net.minecraft.client.settings.GameSettings)(moom.JK.b)).bl;
    if (!((life2_5 != null))) {
        forwardValue2291_34_0 = ((spill2291_2) ? 1 : 0);
        break forward_join_34;
    }
    if (!((!spill2291_2))) {
        break forward_join_33;
    }
    spill2291_3 = ((net.minecraft.client.settings.GameSettings)(moom.JK.b)).aS;
    if (!((life2_5 != null))) {
        forwardValue2291_130_0 = ((spill2291_3) ? 1 : 0);
        break forward_join_130;
    }
    if (!(spill2291_3)) {
        break forward_join_129;
    }
    }
    forwardValue2291_34_0 = 1;
    }
    moom.JK.d = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2291_34_0)));
    life3_57 = java.lang.System.nanoTime();
    spill2291_4 = recovery.source.CarrierOps.lcmp(((long)(moom.JK.v)), ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2291_23(23278, (8227829113940786111L ^ life0_3)))));
    if (!((life2_5 != null))) {
        forwardValue2291_57_0 = spill2291_4;
        break forward_join_57;
    }
    if (!((spill2291_4 == 0))) {
        break forward_join_51;
    }
    moom.JK.v = ((long)(life3_57));
    if (!((life2_5 == null))) {
        break forward_join_127;
    }
    }
    forwardValue2291_57_0 = (moom.JK.u & ((moom.JK.l).length - 1));
    }
    life5_87 = forwardValue2291_57_0;
    moom.JK.u = ((int)((moom.JK.u + 1)));
    life6_93 = ((moom.N5.a__Boolean()) ? 1 : 0);
    (moom.JK.l)[life5_87] = ((life3_57 - moom.JK.v) - moom.JK.w);
    (moom.JK.m)[life5_87] = ((moom.JL)(moom.JK.e)).b;
    (moom.JK.n)[life5_87] = ((moom.JL)(moom.JK.f)).b;
    (moom.JK.o)[life5_87] = ((moom.JL)(moom.JK.g)).b;
    (moom.JK.p)[life5_87] = ((moom.JL)(moom.JK.h)).b;
    (moom.JK.q)[life5_87] = ((moom.JL)(moom.JK.i)).b;
    (moom.JK.r)[life5_87] = ((moom.JL)(moom.JK.j)).b;
    (moom.JK.s)[life5_87] = ((moom.JL)(moom.JK.k)).b;
    (moom.JK.t)[life5_87] = ((life6_93) != 0);
    __sourceExactCall_4f16233a96ab8d(((moom.JL)(moom.JK.e)));
    __sourceExactCall_4f16233a96ab8d(((moom.JL)(moom.JK.f)));
    __sourceExactCall_4f16233a96ab8d(((moom.JL)(moom.JK.i)));
    __sourceExactCall_4f16233a96ab8d(((moom.JL)(moom.JK.h)));
    __sourceExactCall_4f16233a96ab8d(((moom.JL)(moom.JK.g)));
    __sourceExactCall_4f16233a96ab8d(((moom.JL)(moom.JK.j)));
    __sourceExactCall_4f16233a96ab8d(((moom.JL)(moom.JK.k)));
    moom.JK.v = ((long)(java.lang.System.nanoTime()));
    }
    if (!((life2_5 == null))) {
        break forward_join_137;
    }
    }
    forwardValue2291_130_0 = 0;
    }
    moom.JK.d = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue2291_130_0)));
    moom.JK.v = ((long)(__sourceIntrinsic_2c8ae721fed4_invokedynamic2291_75(23278, (8227829113940786111L ^ life0_3))));
    }
    return;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10297);
    if (((moom.JK.z)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JK.A)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JK.A)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JK", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JK.y)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JK.z)[life5_8] = moom.JK.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JK.z)[life5_8];
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
        byte[] spill2657_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2657_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2657_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2657_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2657_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2657_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5129_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static boolean a__Boolean() {
return ((((moom.JK.d) ? 1 : 0)) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_159(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_161(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_163(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_165(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_167(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_171(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_eb8803ad1f63_originalDynamicSite596_174(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic2291_23(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2c8ae721fed4_invokedynamic2291_75(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2bf608ac55b7_invokedynamic2292_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_2bf608ac55b7_invokedynamic2292_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2bf608ac55b7_invokedynamic2292_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2bf608ac55b7_invokedynamic2292_10(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_39ca3fd389e6_invokedynamic2293_2(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_39ca3fd389e6_invokedynamic2293_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_39ca3fd389e6_invokedynamic2293_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_39ca3fd389e6_invokedynamic2293_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5129_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_38(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b9db2db4e947_invokedynamic296_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_66(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_b9db2db4e947_invokedynamic296_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9db2db4e947_invokedynamic296_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_89(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9db2db4e947_invokedynamic296_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_94(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9db2db4e947_invokedynamic296_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_99(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9db2db4e947_invokedynamic296_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b9db2db4e947_invokedynamic296_128(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9db2db4e947_invokedynamic296_135(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b9db2db4e947_invokedynamic296_136(java.lang.String a0, long a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5120_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral5121_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native void __sourceExactCall_d162903a98f49d(int p0, int p1, int p2, int p3, int p4);

private static native void __sourceExactCall_4f16233a96ab8d(moom.JL p0);
}
