package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class BedBreaker extends com.moon.module.Module {

private com.moon.setting.IntegerSetting s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.BooleanSetting y;

private com.moon.setting.BooleanSetting z;

private com.moon.setting.ColorSetting A;

private moom.DT B;

private moom.DT C;

private boolean D;

private boolean E;

private double F;

private moom.DT G;

private boolean H;

private moom.DT I;

private int J;

private boolean K;

private boolean L;

private int M;

private com.moon.nX N;

private com.moon.nX O;

private static long P;

private static java.lang.String[] Q;

private static java.lang.String[] R;

private static java.util.Map S;

private static long[] T;

private static java.lang.Integer[] U;

private static java.util.Map V;

public BedBreaker(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }

private static void __sourceConstructorBody_10aff2b4fbfed609(com.moon.module.impl.BedBreaker receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {
long local5_life2 = (com.moon.module.impl.BedBreaker.P ^ 51992095971219L);
    com.moon.module.impl.BedBreaker.__sourceConstructorInit_10aff2b4fbfed609_0(((com.moon.module.impl.BedBreaker)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));
    ((com.moon.module.impl.BedBreaker)(receiver)).s = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_5(20334, (8130153231485291083L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_8(12430, (3887007186893551010L ^ local5_life2)))), ((int)(4)), ((int)(1)), ((int)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_10(25919, (2982239974829346911L ^ local5_life2)))), ((int)(1))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_15(22308, (3331102634646032916L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_18(22340, (7148485895767216746L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_23(28853, (8564609519052256647L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_26(818, (3232841905027974681L ^ local5_life2)))), ((boolean)(false))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_31(24593, (4773859550097990966L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_34(17576, (3965088726880043394L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_39(467, (647398853930550496L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_42(10931, (2231851641890647954L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_47(5510, (4563724142754697382L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_50(19240, (2906194899705417223L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_55(21565, (7001646552767615252L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_58(15729, (2586692774351976533L ^ local5_life2)))), ((boolean)(true))))).a()));
    com.moon.module.impl.BedBreaker __sourceSpill1_69 = receiver;
    com.moon.l_ __sourceSpill1_70 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_63(23867, (5492720132574795798L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_66(10979, (855379379956920267L ^ local5_life2)))), ((boolean)(true)));
    com.moon.setting.BooleanSetting __sourceEffectfulDup1_71 = ((com.moon.module.impl.BedBreaker)(receiver)).y;
    com.moon.setting.BooleanSetting __sourceSpill1_73 = __sourceEffectfulDup1_71;
    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup1_71)));
    ((com.moon.module.impl.BedBreaker)(__sourceSpill1_69)).z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill1_70)).a(((java.util.function.Supplier)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_74(__sourceSpill1_73)))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).A = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_79(22918, (4590916164948810916L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_82(7597, (4906615574937737355L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_84(receiver)))))).a()));
    ((com.moon.module.impl.BedBreaker)(receiver)).J = ((int)(0));
    ((com.moon.module.impl.BedBreaker)(receiver)).N = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.module.impl.BedBreaker)(receiver)).O = ((com.moon.nX)(new com.moon.nX()));
    return;
}


static {
P = ((long)(((moom._a)(moom._c.a(((long)(5800912262038514466L)), ((long)(6333253103932495108L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(212077380472413L)))));
    S = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.BedBreaker.P ^ 101430342708789L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill261_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill261_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill261_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill261_14 = new byte[8];
    (__sourceSpill261_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill261_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation261_16 = __sourceSpill261_14;
    ((javax.crypto.Cipher)(__sourceSpill261_11)).init(((int)(__sourceSpill261_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill261_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation261_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[20];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "_¦*#ò4U}Ú!½ +5àe® O¨ÉÛ@\013^Ýþ*±5#pËÁj]\024Qº\036P\006ý¦K(5Õ£sùÒ{\004«ó\031·Ä<Á¢P­\026\031oø×\002Déµ\004/J±3æD.}5ÎÁU7 &×Ó¯}¯\001Üç~*«þªúÿÇH~ÿÆ²8ÿ\"JF\032\036$iø³Vµ¨½K¨&'xÑ²³ü(;Ðm=ß$¢\037o\nÞ1z)ï\020$ù=çôéÍzPß&&Åìøh ë\rD\r(\031÷ã\037.b\034uB¼r³\013Å¤\\\035\022Jz.Õ©õv8åAÔ\026/äiK$\017T>éf{\005ï_«Æí]·¬¿ÓÖ®&£\022¹\tÞ²$\033²X§ú\023\021øú\036\022ý \006\033lRÅðÐé\006\020UkLÜë\017æÃ\005³~u¤LÅUHã Õ$=\035\016ÃPk\002öäìY­2Ä¢\rA@C7ñ2fv>±Û(7MgdAt®Æ®@ah\nÏË£l\023W\030÷\027z'wÀ\\ö\013ØPT\013¼\020¹Ó\031æs2§Ò3°\001*Ët\030fzÂ^Ó\177e¸>×¥è;Ññ~l×#ò´ü\030\036\0009háCà\025*¶\tCË¢\026âþ!ôù\003(Õ×¦ð0§õ\037úSÃ6»&Ñ×©M¯WIÇ\022»=\001¼\000&²tþfÕ²µZ(o\000+zèÏ`2~2çë\003ô `K\\¦â¢N)Zr\003]!B{gá½ÂÊQIy(\017Ó2Æb¾QäÜ\032à¦Ñ\006\024='S\177ÃÍj\020\027¸=\030MQ¬!½Êc\177ý(óÚ\013Þº!Å¦\033qyZu[a7ú\\Ðîc{lÌxÃËqS<òì\032^û »Ñªç\031ë\016º`@/Ç#u\002ô¸Rï\002pêx:(ö\031ÀµÚÀ1Å\\\036\004Q¿s_«É,\0320'Þö4B\006\tÚ\030îh/%^þ\030Ë\020¨kt\025-ÜLÿ\000h\rãõçÊ(\031\"ç(©x\005CÁ\003uj \034>sÂUÙ9¹è¤ðúÜç6'1\035Ïna\020ÊV²¦r\013"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill261_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill261_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill261_29)).doFinal(((byte[])(__sourceSpill261_28)));
        java.lang.String __sourceSpill261_34 = ((java.lang.String)(com.moon.module.impl.BedBreaker.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill261_35 = local20_life19;
        int __sourceSpill261_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill261_35)[__sourceSpill261_36] = __sourceSpill261_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "f\007jß%±´îSÌO\002õçoDFª·¢Ü±Èºv°ØNtø9¼\007¼\003wÖ\020\002l¯Ék|I¸\020º\037)ÚÜÐ"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill261_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill261_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill261_42)).doFinal(((byte[])(__sourceSpill261_41)));
        java.lang.String __sourceSpill261_47 = ((java.lang.String)(com.moon.module.impl.BedBreaker.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill261_48 = local20_life19;
        int __sourceSpill261_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill261_48)[__sourceSpill261_49] = __sourceSpill261_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    Q = ((java.lang.String[])(local20_life19));
    R = ((java.lang.String[])(new java.lang.String[20]));
    V = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill261_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill261_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill261_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill261_60 = new byte[8];
    (__sourceSpill261_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill261_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation261_62 = __sourceSpill261_60;
    ((javax.crypto.Cipher)(__sourceSpill261_57)).init(((int)(__sourceSpill261_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill261_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation261_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[13];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "p¿\002r»Û(pãMÿ°Q\021¨tç!ùù2\031ùõÐ\020ãIN¶Kj¢\"[\177v\b`åØ(~d8Á[®þL5MÒT©8m3\b:ÿ¾\030×°Xo&q\020º[ââÍÍÖ\033¶"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill261_71 = local4_life67;
        int __sourceSpill261_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill261_71)).substring(((int)(__sourceSpill261_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill261_76 = local6_life65;
        int __sourceSpill261_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill261_79 = new byte[8];
        (__sourceSpill261_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill261_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill261_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill261_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill261_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill261_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill261_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill261_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill261_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill261_80)).doFinal(((byte[])(__sourceSpill261_79)));
        (__sourceSpill261_76)[__sourceSpill261_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "*-ÝL*üJ×vÃ}²m?\026"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill261_84 = local4_life67;
        int __sourceSpill261_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill261_84)).substring(((int)(__sourceSpill261_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill261_89 = local6_life65;
        int __sourceSpill261_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill261_92 = new byte[8];
        (__sourceSpill261_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill261_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill261_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill261_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill261_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill261_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill261_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill261_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill261_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill261_93)).doFinal(((byte[])(__sourceSpill261_92)));
        (__sourceSpill261_89)[__sourceSpill261_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    T = ((long[])(local6_life65));
    U = ((java.lang.Integer[])(new java.lang.Integer[13]));
}

private static native <E extends Throwable> void __sourceConstructorInit_10aff2b4fbfed609_0(com.moon.module.impl.BedBreaker a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_d3498a5a8e02bc466369(com.moon.module.impl.BedBreaker a0, com.moon.event.Render2DEvent a1) throws E;
private static final class __SourceHandler_d3498a5a8e02bc466369 {

public static void f300030(com.moon.module.impl.BedBreaker receiver, com.moon.event.Render2DEvent p0) throws Throwable {
    java.lang.Object forwardValue300030_17_0;
    com.moon.aO forwardValue300030_117_0;
    com.moon.aO forwardValue300030_117_1;
    com.moon.aO forwardValue300030_122_0;
    com.moon.aO forwardValue300030_122_1;
    int forwardValue300030_122_2;
    com.moon.module.impl.BedBreaker forwardValue300030_142_0;
    com.moon.module.impl.BedBreaker forwardValue300030_222_0;
    com.moon.nX forwardValue300030_327_0;
    com.moon.nX forwardValue300030_328_0;
    float forwardValue300030_328_1;
    com.moon.event.RenderPhase spill300030_0;
    com.moon.module.impl.BedBreaker spill300030_1;
    com.moon.module.impl.BedBreaker spill300030_2;
    moom.CA spill300030_3;
    com.moon.aO spill300030_4;
    com.moon.aO spill300030_5;
    int spill300030_6;
    long spill300030_7;
    java.lang.String spill300030_8;
    java.lang.Object[] spill300030_9;
    com.moon.module.impl.BedBreaker spill300030_10;
    com.moon.hW spill300030_11;
    float spill300030_12;
    float spill300030_13;
    float spill300030_14;
    float spill300030_15;
    float spill300030_16;
    com.moon.aO spill300030_17;
    com.moon.hW spill300030_18;
    float spill300030_19;
    float spill300030_20;
    float spill300030_21;
    float spill300030_22;
    float spill300030_23;
    com.moon.aO spill300030_24;
    com.moon.jm spill300030_25;
    com.moon.hW spill300030_26;
    java.lang.String spill300030_27;
    float spill300030_28;
    float spill300030_29;
    float spill300030_30;
    com.moon.aO spill300030_31;
    com.moon.nX spill300030_32;
    long life2_3;
    java.lang.String life4_5;
    int life5_58;
    double life6_62;
    double life8_66;
    double life10_70;
    double life12_77;
    double life14_84;
    double life16_91;
    moom.CA life18_107;
    com.moon.hW life19_113;
    com.moon.hW life20_121;
    int life21_143;
    float life5_161;
    com.moon.jm life6_180;
    moom.ir life7_183;
    float life8_188;
    float life9_198;
    float life10_212;
    float life11_214;
    float life12_221;
    java.lang.String life13_233;
    float life14_238;
    com.moon.hW life15_259;
    com.moon.hW life16_266;
    forward_join_331: {
    forward_join_328: {
    forward_join_327: {
    forward_join_320: {
    forward_join_226: {
    forward_join_222: {
    forward_join_153: {
    forward_join_142: {
    forward_join_141: {
    forward_join_122: {
    forward_join_117: {
    forward_join_17: {
    life2_3 = (__fieldRead300030_0() ^ 63150840260631L);
    life4_5 = __call300030_1();
    spill300030_0 = __call300030_2(p0);
    if (!((life4_5 != null))) {
        forwardValue300030_17_0 = spill300030_0;
        break forward_join_17;
    }
    if (!((spill300030_0 == __fieldRead300030_3()))) {
        break forward_join_331;
    }
    spill300030_1 = receiver;
    if (!((life4_5 != null))) {
        forwardValue300030_142_0 = spill300030_1;
        break forward_join_142;
    }
    forwardValue300030_17_0 = __call300030_5(__fieldRead300030_4(spill300030_1));
    }
    if (!(__call300030_7(__cast300030_6(forwardValue300030_17_0)))) {
        break forward_join_141;
    }
    spill300030_2 = receiver;
    if (!((life4_5 != null))) {
        forwardValue300030_142_0 = spill300030_2;
        break forward_join_142;
    }
    if (!((__fieldRead300030_8(spill300030_2) != null))) {
        break forward_join_141;
    }
    __call300030_9();
    __call300030_10();
    life5_58 = (__call300030_13(((float) (__call300030_12(0x0.0p0d, __fieldRead300030_11(receiver)) / 0x1.8p1d)), 0x1.0p0f, 0x1.0p0f) | __invokedynamic300030_14(1689, (8025007752085458034L ^ life2_3)));
    life6_62 = __call300030_17(__call300030_16(__fieldRead300030_15()));
    life8_66 = __call300030_20(__call300030_19(__fieldRead300030_18()));
    life10_70 = __call300030_23(__call300030_22(__fieldRead300030_21()));
    life12_77 = (((double) __call300030_25(__fieldRead300030_24(receiver))) - life6_62);
    life14_84 = (((double) __call300030_27(__fieldRead300030_26(receiver))) - life8_66);
    life16_91 = (((double) __call300030_29(__fieldRead300030_28(receiver))) - life10_70);
    moom.CA __stackOp300030_31_0 = __sourceUninitializedNEW300030_30();
    spill300030_3 = __stackOp300030_31_0;
    __explicitNewInit300030_32(__stackOp300030_31_0, life12_77, life14_84, life16_91, (life12_77 + 0x1.0p0d), (life14_84 + 0x1.0p0d), (life16_91 + 0x1.0p0d));
    life18_107 = spill300030_3;
    life19_113 = __call300030_37(__call300030_36(__call300030_35(__call300030_33(), __fieldRead300030_34())));
    life20_121 = __call300030_43(__call300030_42(__call300030_41(__call300030_40(__call300030_38(), __fieldRead300030_39()), 1)));
    com.moon.aO __stackOp300030_45_0 = __sourceUninitializedNEW300030_44();
    spill300030_4 = __stackOp300030_45_0;
    spill300030_5 = __stackOp300030_45_0;
    if (!(__call300030_49(__cast300030_48(__call300030_47(__fieldRead300030_46(receiver)))))) {
        forwardValue300030_117_0 = spill300030_4;
        forwardValue300030_117_1 = spill300030_5;
        break forward_join_117;
    }
    forwardValue300030_122_0 = spill300030_4;
    forwardValue300030_122_1 = spill300030_5;
    forwardValue300030_122_2 = life5_58;
    break forward_join_122;
    }
    forwardValue300030_122_0 = forwardValue300030_117_0;
    forwardValue300030_122_1 = forwardValue300030_117_1;
    forwardValue300030_122_2 = __call300030_53(__cast300030_52(__call300030_51(__fieldRead300030_50(receiver))));
    }
    __explicitNewInit300030_54(forwardValue300030_122_1, forwardValue300030_122_2);
    life21_143 = __call300030_56(__call300030_55(forwardValue300030_122_0, 0x1.0p-2f));
    __call300030_58(life19_113, __call300030_57(life18_107, life21_143));
    __call300030_60(life20_121, __call300030_59(life18_107, life21_143));
    __call300030_61(life19_113);
    __call300030_62(life20_121);
    }
    forwardValue300030_142_0 = receiver;
    }
    life5_161 = __call300030_64(__fieldRead300030_63(forwardValue300030_142_0));
    if (!((life4_5 != null))) {
        break forward_join_153;
    }
    if (!((__numericCompare300030_65(((double) life5_161), 0x1.47ae147ae147bp-7d) > 0))) {
        break forward_join_320;
    }
    __call300030_66();
    }
    life6_180 = __call300030_70(__call300030_68(__call300030_67()), __fieldRead300030_69());
    spill300030_6 = 26926;
    life7_183 = __call300030_71();
    spill300030_7 = (3087606146995295131L ^ life2_3);
    life8_188 = 0x1.2cp7f;
    life9_198 = ((((float) __call300030_72(life7_183)) / 0x1.0p1f) - (life8_188 / 0x1.0p1f));
    life10_212 = (((float) (__call300030_73(life7_183) - __invokedynamic300030_74(27952, (1490576772208535511L ^ life2_3)))) - (0x1.4p3f * life5_161));
    life11_214 = 0x1.4p3f;
    life12_221 = __call300030_76(((float) __fieldRead300030_75(receiver)), 0x0.0p0f, 0x1.0p0f);
    spill300030_8 = __invokedynamic300030_77(spill300030_6, spill300030_7);
    java.lang.Object[] __stackOp300030_78_0 = new java.lang.Object[1];
    spill300030_9 = __stackOp300030_78_0;
    (__stackOp300030_78_0)[0] = __call300030_79((life12_221 * 0x1.9p6f));
    life13_233 = __call300030_80(spill300030_8, spill300030_9);
    life14_238 = __call300030_81(life6_180, life13_233, 0x1.dp2f);
    spill300030_10 = receiver;
    if (!((life4_5 != null))) {
        forwardValue300030_222_0 = spill300030_10;
        break forward_join_222;
    }
    if (!((__fieldRead300030_82(spill300030_10) != null))) {
        break forward_join_226;
    }
    forwardValue300030_222_0 = receiver;
    }
    __call300030_84(__fieldRead300030_83(forwardValue300030_222_0), life12_221, 0x1.99999ap-2d);
    }
    life15_259 = __call300030_88(__call300030_87(__call300030_85(), __fieldRead300030_86()));
    life16_266 = __call300030_93(__call300030_92(__call300030_91(__call300030_89(), __fieldRead300030_90()), life6_180));
    spill300030_11 = life15_259;
    spill300030_12 = life9_198;
    spill300030_13 = life10_212;
    spill300030_14 = life8_188;
    spill300030_15 = life11_214;
    spill300030_16 = 0x1.0p2f;
    com.moon.aO __stackOp300030_95_0 = __sourceUninitializedNEW300030_94();
    spill300030_17 = __stackOp300030_95_0;
    __explicitNewInit300030_98(__stackOp300030_95_0, __call300030_97(__fieldRead300030_96()));
    __call300030_102(spill300030_11, __call300030_101(spill300030_12, spill300030_13, spill300030_14, spill300030_15, spill300030_16, __call300030_100(__call300030_99(spill300030_17, (0x1.99999ap-2f * life5_161)))));
    spill300030_18 = life15_259;
    spill300030_19 = life9_198;
    spill300030_20 = life10_212;
    spill300030_21 = __call300030_105((life8_188 * __call300030_104(__fieldRead300030_103(receiver))), 0x1.8p3f);
    spill300030_22 = life11_214;
    spill300030_23 = 0x1.0p2f;
    com.moon.aO __stackOp300030_107_0 = __sourceUninitializedNEW300030_106();
    spill300030_24 = __stackOp300030_107_0;
    __explicitNewInit300030_109(__stackOp300030_107_0, __invokedynamic300030_108(9289, (6271320911536254639L ^ life2_3)));
    __call300030_113(spill300030_18, __call300030_112(spill300030_19, spill300030_20, spill300030_21, spill300030_22, spill300030_23, __call300030_111(__call300030_110(spill300030_24, life5_161))));
    spill300030_25 = life6_180;
    spill300030_26 = life16_266;
    spill300030_27 = life13_233;
    spill300030_28 = 0x1.dp2f;
    spill300030_29 = ((life9_198 + (life8_188 / 0x1.0p1f)) - (life14_238 / 0x1.0p1f));
    spill300030_30 = (((life10_212 + (life11_214 / 0x1.0p1f)) - (__call300030_114(life6_180, 0x1.dp2f) / 0x1.0p1f)) + 0x1.0p-1f);
    com.moon.aO __stackOp300030_116_0 = __sourceUninitializedNEW300030_115();
    spill300030_31 = __stackOp300030_116_0;
    __explicitNewInit300030_119(__stackOp300030_116_0, __call300030_118(__fieldRead300030_117()));
    __call300030_122(spill300030_25, spill300030_26, spill300030_27, spill300030_28, spill300030_29, spill300030_30, __call300030_121(__call300030_120(spill300030_31, life5_161)));
    __call300030_123(life15_259);
    __call300030_124(life16_266);
    }
    spill300030_32 = __fieldRead300030_125(receiver);
    if (!((__fieldRead300030_126(receiver) != null))) {
        forwardValue300030_327_0 = spill300030_32;
        break forward_join_327;
    }
    forwardValue300030_328_0 = spill300030_32;
    forwardValue300030_328_1 = 0x1.0p0f;
    break forward_join_328;
    }
    forwardValue300030_328_0 = forwardValue300030_327_0;
    forwardValue300030_328_1 = 0x0.0p0f;
    }
    __call300030_127(forwardValue300030_328_0, forwardValue300030_328_1, 0x1.333334p-2d);
    __call300030_128();
    }
    return;
}
private static native long __fieldRead300030_0() throws Throwable;
private static native java.lang.String __call300030_1() throws Throwable;
private static native com.moon.event.RenderPhase __call300030_2(com.moon.event.Render2DEvent a0) throws Throwable;
private static native com.moon.event.RenderPhase __fieldRead300030_3() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead300030_4(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native java.lang.Object __call300030_5(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast300030_6(java.lang.Object a0) throws Throwable;
private static native boolean __call300030_7(java.lang.Boolean a0) throws Throwable;
private static native moom.DT __fieldRead300030_8(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native void __call300030_9() throws Throwable;
private static native void __call300030_10() throws Throwable;
private static native double __fieldRead300030_11(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native double __call300030_12(double a0, double a1) throws Throwable;
private static native int __call300030_13(float a0, float a1, float a2) throws Throwable;
private static native int __invokedynamic300030_14(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300030_15() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call300030_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call300030_17(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300030_18() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call300030_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call300030_20(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead300030_21() throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __call300030_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __call300030_23(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native moom.DT __fieldRead300030_24(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native int __call300030_25(moom.DT a0) throws Throwable;
private static native moom.DT __fieldRead300030_26(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native int __call300030_27(moom.DT a0) throws Throwable;
private static native moom.DT __fieldRead300030_28(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native int __call300030_29(moom.DT a0) throws Throwable;
private static native moom.CA __sourceUninitializedNEW300030_30() throws Throwable;
private static native void __explicitNewInit300030_32(moom.CA a0, double a1, double a2, double a3, double a4, double a5, double a6) throws Throwable;
private static native com.moon.hX __call300030_33() throws Throwable;
private static native com.moon.cb __fieldRead300030_34() throws Throwable;
private static native com.moon.hX __call300030_35(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call300030_36(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call300030_37(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call300030_38() throws Throwable;
private static native com.moon.cb __fieldRead300030_39() throws Throwable;
private static native com.moon.hX __call300030_40(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call300030_41(com.moon.hX a0, int a1) throws Throwable;
private static native com.moon.hX __call300030_42(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call300030_43(com.moon.hX a0) throws Throwable;
private static native com.moon.aO __sourceUninitializedNEW300030_44() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead300030_46(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native java.lang.Object __call300030_47(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast300030_48(java.lang.Object a0) throws Throwable;
private static native boolean __call300030_49(java.lang.Boolean a0) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead300030_50(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native java.lang.Object __call300030_51(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast300030_52(java.lang.Object a0) throws Throwable;
private static native int __call300030_53(java.lang.Integer a0) throws Throwable;
private static native void __explicitNewInit300030_54(com.moon.aO a0, int a1) throws Throwable;
private static native com.moon.aO __call300030_55(com.moon.aO a0, float a1) throws Throwable;
private static native int __call300030_56(com.moon.aO a0) throws Throwable;
private static native com.moon.i9 __call300030_57(moom.CA a0, int a1) throws Throwable;
private static native void __call300030_58(com.moon.hW a0, com.moon.i9 a1) throws Throwable;
private static native com.moon.i9 __call300030_59(moom.CA a0, int a1) throws Throwable;
private static native void __call300030_60(com.moon.hW a0, com.moon.i9 a1) throws Throwable;
private static native void __call300030_61(com.moon.hW a0) throws Throwable;
private static native void __call300030_62(com.moon.hW a0) throws Throwable;
private static native com.moon.nX __fieldRead300030_63(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native float __call300030_64(com.moon.nX a0) throws Throwable;
private static native int __numericCompare300030_65(double a0, double a1) throws Throwable;
private static native void __call300030_66() throws Throwable;
private static native com.moon.runtime.ClientContext __call300030_67() throws Throwable;
private static native com.moon.jo __call300030_68(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead300030_69() throws Throwable;
private static native com.moon.jm __call300030_70(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native moom.ir __call300030_71() throws Throwable;
private static native int __call300030_72(moom.ir a0) throws Throwable;
private static native int __call300030_73(moom.ir a0) throws Throwable;
private static native int __invokedynamic300030_74(int a0, long a1) throws Throwable;
private static native double __fieldRead300030_75(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native float __call300030_76(float a0, float a1, float a2) throws Throwable;
private static native java.lang.String __invokedynamic300030_77(int a0, long a1) throws Throwable;
private static native java.lang.Float __call300030_79(float a0) throws Throwable;
private static native java.lang.String __call300030_80(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native float __call300030_81(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native moom.DT __fieldRead300030_82(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native com.moon.nX __fieldRead300030_83(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native void __call300030_84(com.moon.nX a0, float a1, double a2) throws Throwable;
private static native com.moon.hX __call300030_85() throws Throwable;
private static native com.moon.cb __fieldRead300030_86() throws Throwable;
private static native com.moon.hX __call300030_87(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call300030_88(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call300030_89() throws Throwable;
private static native com.moon.cb __fieldRead300030_90() throws Throwable;
private static native com.moon.hX __call300030_91(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call300030_92(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call300030_93(com.moon.hX a0) throws Throwable;
private static native com.moon.aO __sourceUninitializedNEW300030_94() throws Throwable;
private static native java.awt.Color __fieldRead300030_96() throws Throwable;
private static native int __call300030_97(java.awt.Color a0) throws Throwable;
private static native void __explicitNewInit300030_98(com.moon.aO a0, int a1) throws Throwable;
private static native com.moon.aO __call300030_99(com.moon.aO a0, float a1) throws Throwable;
private static native int __call300030_100(com.moon.aO a0) throws Throwable;
private static native com.moon.i3 __call300030_101(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call300030_102(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native com.moon.nX __fieldRead300030_103(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native float __call300030_104(com.moon.nX a0) throws Throwable;
private static native float __call300030_105(float a0, float a1) throws Throwable;
private static native com.moon.aO __sourceUninitializedNEW300030_106() throws Throwable;
private static native int __invokedynamic300030_108(int a0, long a1) throws Throwable;
private static native void __explicitNewInit300030_109(com.moon.aO a0, int a1) throws Throwable;
private static native com.moon.aO __call300030_110(com.moon.aO a0, float a1) throws Throwable;
private static native int __call300030_111(com.moon.aO a0) throws Throwable;
private static native com.moon.i3 __call300030_112(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call300030_113(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native float __call300030_114(com.moon.jm a0, float a1) throws Throwable;
private static native com.moon.aO __sourceUninitializedNEW300030_115() throws Throwable;
private static native java.awt.Color __fieldRead300030_117() throws Throwable;
private static native int __call300030_118(java.awt.Color a0) throws Throwable;
private static native void __explicitNewInit300030_119(com.moon.aO a0, int a1) throws Throwable;
private static native com.moon.aO __call300030_120(com.moon.aO a0, float a1) throws Throwable;
private static native int __call300030_121(com.moon.aO a0) throws Throwable;
private static native void __call300030_122(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call300030_123(com.moon.hW a0) throws Throwable;
private static native void __call300030_124(com.moon.hW a0) throws Throwable;
private static native com.moon.nX __fieldRead300030_125(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native moom.DT __fieldRead300030_126(com.moon.module.impl.BedBreaker a0) throws Throwable;
private static native void __call300030_127(com.moon.nX a0, float a1, double a2) throws Throwable;
private static native void __call300030_128() throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_961053ab66762f9b20be(com.moon.module.impl.BedBreaker a0, moom.DT a1, boolean a2) throws E;
private static final class __SourceHandler_961053ab66762f9b20be {

public static void f121(com.moon.module.impl.BedBreaker receiver, moom.DT p0, boolean p1) throws Throwable {
    moom.za forestValue121_12_0;
    moom.za forestValue121_12_1;
    moom.za forestValue121_13_0;
    moom.za forestValue121_13_1;
    net.minecraft.network.play.client.C07PacketPlayerDigging$Action forestValue121_13_2;
    moom.za spill121_0;
    moom.za spill121_1;
    long life3_3;
    java.lang.String life5_5;
    moom.za life6_16;
    forest_join_36: {
    forest_join_33: {
    forest_join_28: {
    forest_join_13: {
    forest_join_12: {
    life3_3 = (__fieldRead121_0() ^ 61433662254977L);
    life5_5 = __call121_1();
    moom.za __stackOp121_3_0 = __sourceUninitializedNEW121_2();
    spill121_0 = __stackOp121_3_0;
    spill121_1 = __stackOp121_3_0;
    if (!(p1)) {
        forestValue121_12_0 = spill121_0;
        forestValue121_12_1 = spill121_1;
        break forest_join_12;
    }
    forestValue121_13_0 = spill121_0;
    forestValue121_13_1 = spill121_1;
    forestValue121_13_2 = __fieldRead121_4();
    break forest_join_13;
    }
    forestValue121_13_0 = forestValue121_12_0;
    forestValue121_13_1 = forestValue121_12_1;
    forestValue121_13_2 = __fieldRead121_5();
    }
    __explicitNewInit121_7(forestValue121_13_1, forestValue121_13_2, p0, __fieldRead121_6());
    life6_16 = forestValue121_13_0;
    if (!((life5_5 != null))) {
        break forest_join_33;
    }
    if (!(p1)) {
        break forest_join_28;
    }
    __call121_11(__fieldRead121_10(__fieldRead121_9(__fieldRead121_8())), life6_16);
    if (!((life5_5 == null))) {
        break forest_join_36;
    }
    }
    __call121_15(__fieldRead121_14(__fieldRead121_13(__fieldRead121_12())), life6_16);
    }
    __fieldWrite121_16(receiver, 1);
    }
    return;
}
private static native long __fieldRead121_0() throws Throwable;
private static native java.lang.String __call121_1() throws Throwable;
private static native moom.za __sourceUninitializedNEW121_2() throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __fieldRead121_4() throws Throwable;
private static native net.minecraft.network.play.client.C07PacketPlayerDigging$Action __fieldRead121_5() throws Throwable;
private static native moom.bs __fieldRead121_6() throws Throwable;
private static native void __explicitNewInit121_7(moom.za a0, net.minecraft.network.play.client.C07PacketPlayerDigging$Action a1, moom.DT a2, moom.bs a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead121_8() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead121_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead121_10(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call121_11(net.minecraft.client.network.NetHandlerPlayClient a0, moom.za a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead121_12() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead121_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.network.NetHandlerPlayClient __fieldRead121_14(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native void __call121_15(net.minecraft.client.network.NetHandlerPlayClient a0, moom.za a1) throws Throwable;
private static native void __fieldWrite121_16(com.moon.module.impl.BedBreaker a0, int a1) throws Throwable;

}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24717);
    if (((com.moon.module.impl.BedBreaker.R)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.BedBreaker.S)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.BedBreaker.S)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lC", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.BedBreaker.Q)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.BedBreaker.R)[life5_8] = com.moon.module.impl.BedBreaker.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.BedBreaker.R)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.BedBreaker.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill800_0 = p0;
        life4_9 += 1;
        life5_44 = (spill800_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill800_1 = p0;
        life4_9 += 1;
        life5_76 = (spill800_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill800_2 = p0;
        life4_9 += 1;
        life5_91 = (spill800_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void onEnable() {
long local1 = (com.moon.module.impl.BedBreaker.P ^ 137435163775205L);
    java.lang.String local3 = com.moon.bF.b();
    if ((local3 != null)) {
        if ((!((com.moon.module.Module)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.AutoTool.class))))).isEnabled())) {
        com.moon.nC.a(((java.lang.String)(__sourceIntrinsic_20563a9c9945_invokedynamic2389_7(32076, (5630219787240242969L ^ local1)))));
    }
        this.B = ((moom.DT)(null));
        this.C = ((moom.DT)(null));
        this.D = ((boolean)(false));
        this.G = ((moom.DT)(null));
        this.E = ((boolean)(false));
        this.L = ((boolean)(false));
        super.onEnable();
    }
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2390_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void f() {
int forestValue122_42_0;
    com.moon.module.impl.BedBreaker forestValue122_72_0;
    java.lang.Object forestValue122_78_0;
    int forestValue122_97_0;
    int forestValue122_103_0;
    int forestValue122_188_0;
    com.moon.module.impl.BedBreaker forestValue122_208_0;
    com.moon.module.impl.BedBreaker forestValue122_209_0;
    moom.DT forestValue122_209_1;
    moom.DT spill122_0;
    int spill122_1;
    com.moon.module.impl.BedBreaker spill122_2;
    com.moon.module.impl.BedBreaker spill122_3;
    int spill122_4;
    int spill122_5;
    int spill122_6;
    com.moon.module.impl.BedBreaker spill122_7;
    com.moon.module.impl.BedBreaker spill122_8;
    moom.DT spill122_9;
    long life1_3;
    java.lang.String life3_5;
    double life4_27;
    int life4_87;
    double life5_91;
    double life7_95;
    double life9_99;
    int life11_102;
    int life12_108;
    int life13_116;
    int life14_124;
    int life15_129;
    int life16_134;
    moom.DT life17_141;
    net.minecraft.block.state.IBlockState life18_146;
    net.minecraft.block.Block life19_149;
    double life20_162;
    forest_join_211: {
    forest_join_209: {
    forest_join_208: {
    forest_join_207: {
    forest_join_188: {
    forest_join_181: {
    forest_join_78: {
    forest_join_75: {
    forest_join_74: {
    forest_join_72: {
    forest_join_53: {
    forest_join_42: {
    life1_3 = (com.moon.module.impl.BedBreaker.P ^ 138361146916559L);
    life3_5 = com.moon.bF.b();
    spill122_0 = this.B;
    if (!((life3_5 != null))) {
        forestValue122_78_0 = spill122_0;
        break forest_join_78;
    }
    if (!((spill122_0 != null))) {
        break forest_join_75;
    }
    life4_27 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).b(((double)(((double) ((moom.DT)(this.B)).a()))), ((double)(((double) ((moom.DT)(this.B)).b()))), ((double)(((double) ((moom.DT)(this.B)).c()))));
    spill122_1 = recovery.source.CarrierOps.dcmpl(((double)(life4_27)), ((double)(((double) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.s)).getValue())))).intValue()))));
    if (!((life3_5 != null))) {
        forestValue122_42_0 = spill122_1;
        break forest_join_42;
    }
    if (!((spill122_1 > 0))) {
        break forest_join_74;
    }
    spill122_2 = this;
    if (!((life3_5 != null))) {
        forestValue122_72_0 = spill122_2;
        break forest_join_72;
    }
    forestValue122_42_0 = ((((com.moon.module.impl.BedBreaker)(spill122_2)).E) ? 1 : 0);
    }
    if (!((forestValue122_42_0 != 0))) {
        break forest_join_53;
    }
    spill122_3 = this;
    if (!((life3_5 != null))) {
        forestValue122_72_0 = spill122_3;
        break forest_join_72;
    }
    if (!((((com.moon.module.impl.BedBreaker)(spill122_3)).G != null))) {
        break forest_join_53;
    }
    ((com.moon.module.impl.BedBreaker)(this)).a(((moom.DT)(this.G)), ((boolean)(true)));
    }
    this.F = ((double)(0x0.0p0d));
    this.B = ((moom.DT)(null));
    this.C = ((moom.DT)(null));
    this.D = ((boolean)(false));
    this.G = ((moom.DT)(null));
    this.E = ((boolean)(false));
    forestValue122_72_0 = this;
    }
    ((com.moon.module.impl.BedBreaker)(forestValue122_72_0)).L = ((boolean)(false));
    }
    return;
    }
    forestValue122_78_0 = ((com.moon.setting.IntegerSetting)(this.s)).getValue();
    }
    life4_87 = ((java.lang.Integer)(((java.lang.Integer)(forestValue122_78_0)))).intValue();
    life5_91 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).n;
    life7_95 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).o;
    life9_99 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).p;
    life11_102 = (-life4_87);
    forest_cycle_96: while (true) {
    forest_join_177: {
    forestValue122_97_0 = life11_102;
    forest_cycle_97: while (true) {
    if (!((forestValue122_97_0 < life4_87))) {
        break forest_join_211;
    }
    life12_108 = (-life4_87);
    forest_cycle_102: while (true) {
    forest_join_174: {
    forestValue122_103_0 = life12_108;
    forest_cycle_103: while (true) {
    if (!((forestValue122_103_0 < life4_87))) {
        break forest_join_177;
    }
    spill122_4 = (-life4_87);
    if (!((life3_5 != null))) {
        forestValue122_97_0 = spill122_4;
        continue forest_cycle_97;
    }
    life13_116 = spill122_4;
    forest_cycle_110: while (true) {
    forest_join_172: {
    forest_join_171: {
    if (!((life13_116 < life4_87))) {
        break forest_join_174;
    }
    life14_124 = (((int) life5_91) + life11_102);
    life15_129 = (((int) life7_95) + life12_108);
    life16_134 = (((int) life9_99) + life13_116);
    life17_141 = new moom.DT(life14_124, life15_129, life16_134);
    life18_146 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(life17_141)));
    life19_149 = ((net.minecraft.block.state.IBlockState)(life18_146)).a__ch();
    life20_162 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).b(((double)(((double) ((moom.DT)(life17_141)).a()))), ((double)(((double) ((moom.DT)(life17_141)).b()))), ((double)(((double) ((moom.DT)(life17_141)).c()))));
    if (!((life3_5 != null))) {
        break forest_join_172;
    }
    spill122_5 = recovery.source.CarrierOps.dcmpg(((double)(life20_162)), ((double)(((double) life4_87))));
    if (!((life3_5 != null))) {
        forestValue122_103_0 = spill122_5;
        continue forest_cycle_103;
    }
    if (!((spill122_5 < 0))) {
        break forest_join_171;
    }
    spill122_6 = ((life19_149 instanceof net.minecraft.block.BlockBed) ? 1 : 0);
    if (!((life3_5 != null))) {
        forestValue122_188_0 = spill122_6;
        break forest_join_188;
    }
    if (!((spill122_6 != 0))) {
        break forest_join_171;
    }
    break forest_join_181;
    }
    life13_116 += 1;
    }
    if (!((life3_5 == null))) {
        continue forest_cycle_110;
    }
    break forest_cycle_110;
    }
    break forest_cycle_103;
    }
    }
    life12_108 += 1;
    if (!((life3_5 == null))) {
        continue forest_cycle_102;
    }
    break forest_cycle_102;
    }
    break forest_cycle_97;
    }
    }
    life11_102 += 1;
    if (!((life3_5 == null))) {
        continue forest_cycle_96;
    }
    break forest_cycle_96;
    }
    break forest_join_211;
    }
    spill122_7 = this;
    if (!((life3_5 != null))) {
        forestValue122_208_0 = spill122_7;
        break forest_join_208;
    }
    forestValue122_188_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.BedBreaker)(spill122_7)).w)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue122_188_0 != 0))) {
        break forest_join_207;
    }
    spill122_8 = this;
    spill122_9 = life17_141;
    if (!((life3_5 != null))) {
        forestValue122_209_0 = spill122_8;
        forestValue122_209_1 = spill122_9;
        break forest_join_209;
    }
    if (!((!((com.moon.module.impl.BedBreaker)(spill122_8)).a__Boolean(((moom.DT)(spill122_9)), ((moom.DT)(life17_141)))))) {
        break forest_join_207;
    }
    this.D = ((boolean)(true));
    this.C = ((moom.DT)(((moom.DT)(((moom.DN)(((com.moon.module.impl.BedBreaker)(this)).a(((moom.DT)(life17_141)), ((moom.DT)(life17_141))))).a()))));
    }
    forestValue122_208_0 = this;
    }
    forestValue122_209_0 = forestValue122_208_0;
    forestValue122_209_1 = life17_141;
    }
    ((com.moon.module.impl.BedBreaker)(forestValue122_209_0)).B = ((moom.DT)(forestValue122_209_1));
    return;
    }
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.BedBreaker.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2392_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20683;
      if (U[var3] == null) {
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
         long var5 = T[var3];
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
         Object[] var9 = (Object[])V.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               V.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         U[var3] = var15;
      }

      return U[var3];
}


public void onDisable() {
net.minecraft.client.Minecraft forwardValue803_12_0;
    com.moon.module.impl.BedBreaker forwardValue803_30_0;
    int forwardValue803_33_0;
    com.moon.module.impl.BedBreaker forwardValue803_67_0;
    net.minecraft.client.Minecraft spill803_0;
    boolean spill803_1;
    com.moon.module.impl.BedBreaker spill803_2;
    com.moon.module.impl.BedBreaker spill803_3;
    long life1_3;
    java.lang.String life3_5;
    com.moon.module.impl.AutoTool life4_75;
    forward_join_69: {
    forward_join_67: {
    forward_join_48: {
    forward_join_33: {
    forward_join_30: {
    forward_join_29: {
    forward_join_12: {
    life1_3 = (com.moon.module.impl.BedBreaker.P ^ 101596266873898L);
    life3_5 = com.moon.bF.b();
    spill803_0 = com.moon.module.impl.BedBreaker.d;
    if (!((life3_5 != null))) {
        forwardValue803_12_0 = spill803_0;
        break forward_join_12;
    }
    if (!((((net.minecraft.client.Minecraft)(spill803_0)).K != null))) {
        break forward_join_69;
    }
    forwardValue803_12_0 = com.moon.module.impl.BedBreaker.d;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue803_12_0)).I != null))) {
        break forward_join_69;
    }
    spill803_1 = this.E;
    if (!((life3_5 != null))) {
        forwardValue803_33_0 = ((spill803_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill803_1)) {
        break forward_join_29;
    }
    spill803_2 = this;
    if (!((life3_5 != null))) {
        forwardValue803_30_0 = spill803_2;
        break forward_join_30;
    }
    if (!((((com.moon.module.impl.BedBreaker)(spill803_2)).G != null))) {
        break forward_join_29;
    }
    ((com.moon.module.impl.BedBreaker)(this)).a(((moom.DT)(this.G)), ((boolean)(true)));
    }
    forwardValue803_30_0 = this;
    }
    if (!((life3_5 != null))) {
        forwardValue803_67_0 = forwardValue803_30_0;
        break forward_join_67;
    }
    forwardValue803_33_0 = ((((com.moon.module.impl.BedBreaker)(forwardValue803_30_0)).L) ? 1 : 0);
    }
    if (!((forwardValue803_33_0 != 0))) {
        break forward_join_48;
    }
    spill803_3 = this;
    if (!((life3_5 != null))) {
        forwardValue803_67_0 = spill803_3;
        break forward_join_67;
    }
    if (!((((com.moon.module.impl.BedBreaker)(spill803_3)).M <= 2))) {
        break forward_join_48;
    }
    life4_75 = ((com.moon.module.impl.AutoTool)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.AutoTool.class)))));
    ((com.moon.module.impl.AutoTool)(life4_75)).f();
    }
    this.F = ((double)(0x0.0p0d));
    this.B = ((moom.DT)(null));
    this.C = ((moom.DT)(null));
    this.D = ((boolean)(false));
    this.G = ((moom.DT)(null));
    this.E = ((boolean)(false));
    forwardValue803_67_0 = this;
    }
    ((com.moon.module.impl.BedBreaker)(forwardValue803_67_0)).L = ((boolean)(false));
    }
    return;
}


public void a(com.moon.ej p0) {
long local2 = (com.moon.module.impl.BedBreaker.P ^ 71838453200890L);
    float local4 = ((com.moon.nX)(this.N)).b();
    moom.ir local5 = com.moon.nS.a();
    float local6 = 0x1.2cp7f;
    float local7 = ((((float) ((moom.ir)(local5)).a__Int()) / 0x1.0p1f) - (local6 / 0x1.0p1f));
    float local8 = (((float) (((moom.ir)(local5)).b__Int() - __sourceIntrinsic_936ea035296a_originalDynamicSite515_6(444, (7062610238387197106L ^ local2)))) - (0x1.4p3f * local4));
    float local9 = 0x1.4p3f;
    com.moon.hW local10 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local10)).a(((com.moon.iX)(com.moon.i3.a(((float)(local7)), ((float)(local8)), ((float)(local6)), ((float)(local9)), ((float)(0x1.0p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))).a(((float)((0x1.0p0f * local4)))))).getRGB()))))));
    ((com.moon.hW)(local10)).a(((com.moon.iX)(com.moon.i3.a(((float)(local7)), ((float)(local8)), ((float)(java.lang.Math.max(((float)((local6 * ((com.moon.nX)(this.O)).b()))), ((float)(0x1.8p3f))))), ((float)(local9)), ((float)(0x1.0p2f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_936ea035296a_originalDynamicSite515_20(28300, (5539706689360395149L ^ local2))))).a(((float)(local4))))).getRGB()))))));
    ((com.moon.hW)(local10)).b();
    return;
}


public void a(com.moon.event.Render2DEvent p0) { __sourceHandlerCall_d3498a5a8e02bc466369(this, p0); }


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private void a__Void(moom.DT p0) {
net.minecraft.client.network.NetHandlerPlayClient forwardValue799_32_0;
    int forwardValue799_49_0;
    net.minecraft.client.network.NetHandlerPlayClient spill799_0;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.block.Block life5_47;
    int life6_57;
    forward_join_86: {
    forward_join_83: {
    forward_join_77: {
    forward_join_49: {
    forward_join_48: {
    forward_join_36: {
    forward_join_32: {
    forward_join_29: {
    life2_3 = (com.moon.module.impl.BedBreaker.P ^ 45413985273419L);
    life4_5 = com.moon.bF.b();
    spill799_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm;
    if (!((life4_5 != null))) {
        forwardValue799_32_0 = spill799_0;
        break forward_join_32;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(spill799_0)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, p0, moom.bs.UP))));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue())) {
        break forward_join_29;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).B__sourceReturn_da8c82d5d4();
    if (!((life4_5 == null))) {
        break forward_join_36;
    }
    }
    forwardValue799_32_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(forwardValue799_32_0)).a(((moom.yK)(new moom.zd())));
    }
    life5_47 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(p0))))).a__ch();
    if (!((((net.minecraft.block.Block)(life5_47)).a__fn() != moom.fn.a))) {
        break forward_join_48;
    }
    forwardValue799_49_0 = 1;
    break forward_join_49;
    }
    forwardValue799_49_0 = 0;
    }
    life6_57 = forwardValue799_49_0;
    if (!((life4_5 != null))) {
        break forward_join_83;
    }
    if (!((life6_57 != 0))) {
        break forward_join_77;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((net.minecraft.block.Block)(life5_47)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).i)), ((moom.DT)(p0))))), ((float)(0x1.0p0f))) >= 0))) {
        break forward_join_77;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, p0, moom.bs.UP))));
    if (!((life4_5 == null))) {
        break forward_join_86;
    }
    }
    this.G = ((moom.DT)(p0));
    this.I = ((moom.DT)(p0));
    }
    this.E = ((boolean)(true));
    }
    this.F = ((double)(0x0.0p0d));
    this.H = ((boolean)(true));
    return;
}


private org.lwjgl.util.vector.Vector2f a(com.moon.pw p0, com.moon.pw p1) {
com.moon.pw local3_life1 = ((com.moon.pw)(p1)).b(((com.moon.pw)(p0)));
    float local4_life7 = moom.Dr.c(((float)(((((com.moon.pw)(local3_life1)).p() * ((com.moon.pw)(local3_life1)).p()) + (((com.moon.pw)(local3_life1)).r() * ((com.moon.pw)(local3_life1)).r())))));
    float local5_life13 = ((moom.Dr.a(((float)(((com.moon.pw)(local3_life1)).r())), ((float)(((com.moon.pw)(local3_life1)).p()))) * com.moon.module.impl.AntiFireball.t) - 0x1.6800000000000p+6F);
    float local6_life17 = ((-moom.Dr.a(((float)(((com.moon.pw)(local3_life1)).q())), ((float)(local4_life7)))) * com.moon.module.impl.AntiFireball.t);
    return new org.lwjgl.util.vector.Vector2f(local5_life13, local6_life17);
}


public void a(com.moon.dL p0) {
com.moon.module.impl.BedBreaker forwardValue791_17_0;
    com.moon.module.impl.BedBreaker forwardValue791_26_0;
    com.moon.module.impl.BedBreaker spill791_0;
    com.moon.module.impl.BedBreaker spill791_1;
    long life2_3;
    java.lang.String life4_5;
    forward_join_32: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    forward_join_17: {
    life2_3 = (com.moon.module.impl.BedBreaker.P ^ 40303801490174L);
    life4_5 = com.moon.bF.b();
    spill791_0 = this;
    if (!((life4_5 != null))) {
        forwardValue791_26_0 = spill791_0;
        break forward_join_26;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill791_0)).L)) {
        break forward_join_25;
    }
    spill791_1 = this;
    if (!((life4_5 != null))) {
        forwardValue791_17_0 = spill791_1;
        break forward_join_17;
    }
    if (!((((com.moon.module.impl.BedBreaker)(spill791_1)).B != null))) {
        break forward_join_24;
    }
    forwardValue791_17_0 = this;
    }
    if (!((((com.moon.module.impl.BedBreaker)(forwardValue791_17_0)).M <= 1))) {
        break forward_join_24;
    }
    ((com.moon.dL)(p0)).setCancelled(((boolean)(true)));
    }
    return;
    }
    forwardValue791_26_0 = this;
    }
    if (!((((com.moon.module.impl.BedBreaker)(forwardValue791_26_0)).B != null))) {
        break forward_join_32;
    }
    ((com.moon.dL)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.er p0) {
com.moon.module.impl.BedBreaker forwardValue792_12_0;
    com.moon.module.impl.BedBreaker forwardValue792_17_0;
    com.moon.module.impl.BedBreaker spill792_0;
    long life2_3;
    java.lang.String life4_5;
    int life5_32;
    forward_join_25: {
    forward_join_17: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.BedBreaker.P ^ 32454806064046L);
    life4_5 = com.moon.bF.b();
    spill792_0 = this;
    if (!((life4_5 != null))) {
        forwardValue792_12_0 = spill792_0;
        break forward_join_12;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill792_0)).L)) {
        break forward_join_25;
    }
    forwardValue792_12_0 = this;
    }
    if (!((life4_5 != null))) {
        forwardValue792_17_0 = forwardValue792_12_0;
        break forward_join_17;
    }
    if (!((((com.moon.module.impl.BedBreaker)(forwardValue792_12_0)).G != null))) {
        break forward_join_25;
    }
    forwardValue792_17_0 = this;
    }
    life5_32 = ((com.moon.module.impl.BedBreaker)(forwardValue792_17_0)).a(((moom.DT)(this.G)));
    ((com.moon.er)(p0)).a(((int)(life5_32)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
java.lang.Object forwardValue793_22_0;
    com.moon.module.impl.BedBreaker forwardValue793_41_0;
    moom.DT forwardValue793_42_0;
    com.moon.module.impl.BedBreaker forwardValue793_70_0;
    int forwardValue793_90_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue793_99_0;
    com.moon.module.impl.BedBreaker forwardValue793_138_0;
    com.moon.module.impl.BedBreaker forwardValue793_204_0;
    int forwardValue793_223_0;
    net.minecraft.client.network.NetHandlerPlayClient forwardValue793_258_0;
    int forwardValue793_286_0;
    int forwardValue793_287_0;
    int forwardValue793_287_1;
    com.moon.module.impl.BedBreaker forwardValue793_297_0;
    int forwardValue793_308_0;
    com.moon.module.impl.BedBreaker forwardValue793_318_0;
    moom.DT forwardValue793_319_0;
    com.moon.module.impl.BedBreaker forwardValue793_347_0;
    com.moon.module.impl.BedBreaker forwardValue793_366_0;
    int forwardValue793_406_0;
    com.moon.module.impl.BedBreaker forwardValue793_432_0;
    int forwardValue793_461_0;
    int forwardValue793_499_0;
    com.moon.module.impl.BedBreaker forwardValue793_506_0;
    com.moon.event.MovePhase forwardValue793_513_0;
    com.moon.event.MovePhase forwardValue793_513_1;
    int forwardValue793_531_0;
    com.moon.module.impl.BedBreaker forwardValue793_533_0;
    com.moon.event.MovePhase spill793_0;
    com.moon.event.MovePhase spill793_1;
    moom.DT spill793_2;
    boolean spill793_3;
    com.moon.module.impl.BedBreaker spill793_4;
    com.moon.module.impl.BedBreaker spill793_5;
    int spill793_6;
    com.moon.module.impl.BedBreaker spill793_7;
    net.minecraft.client.network.NetHandlerPlayClient spill793_8;
    int spill793_9;
    int spill793_10;
    com.moon.module.impl.BedBreaker spill793_11;
    int spill793_12;
    int spill793_13;
    net.minecraft.client.network.NetHandlerPlayClient spill793_14;
    com.moon.module.impl.BedBreaker spill793_15;
    com.moon.module.impl.BedBreaker spill793_16;
    com.moon.module.impl.BedBreaker spill793_17;
    com.moon.module.impl.BedBreaker spill793_18;
    int spill793_19;
    com.moon.module.impl.BedBreaker spill793_20;
    int spill793_21;
    boolean spill793_22;
    com.moon.module.impl.BedBreaker spill793_23;
    boolean spill793_24;
    com.moon.module.impl.BedBreaker spill793_25;
    com.moon.module.impl.BedBreaker spill793_26;
    long life2_3;
    java.lang.String life4_5;
    moom.DT life5_71;
    net.minecraft.block.state.IBlockState life6_76;
    net.minecraft.block.Block life7_79;
    net.minecraft.block.state.IBlockState life5_201;
    net.minecraft.block.Block life6_204;
    com.moon.module.impl.AutoTool life7_288;
    com.moon.module.impl.AutoTool life7_388;
    moom.DT life5_428;
    net.minecraft.block.state.IBlockState life6_433;
    net.minecraft.block.Block life7_436;
    net.minecraft.block.state.IBlockState life5_500;
    net.minecraft.block.Block life6_503;
    com.moon.module.impl.AutoTool life7_587;
    com.moon.pw life5_743;
    com.moon.pw life6_765;
    org.lwjgl.util.vector.Vector2f life7_770;
    forward_join_598: {
    forward_join_533: {
    forward_join_532: {
    forward_join_531: {
    forward_join_527: {
    forward_join_513: {
    forward_join_510: {
    forward_join_508: {
    forward_join_506: {
    forward_join_499: {
    forward_join_495: {
    forward_join_461: {
    forward_join_454: {
    forward_join_434: {
    forward_join_432: {
    forward_join_431: {
    forward_join_406: {
    forward_join_366: {
    forward_join_365: {
    forward_join_363: {
    forward_join_350: {
    forward_join_349: {
    forward_join_347: {
    forward_join_346: {
    forward_join_319: {
    forward_join_318: {
    forward_join_317: {
    forward_join_308: {
    forward_join_304: {
    forward_join_297: {
    forward_join_296: {
    forward_join_287: {
    forward_join_286: {
    forward_join_282: {
    forward_join_262: {
    forward_join_258: {
    forward_join_255: {
    forward_join_223: {
    forward_join_216: {
    forward_join_206: {
    forward_join_204: {
    forward_join_203: {
    forward_join_138: {
    forward_join_137: {
    forward_join_103: {
    forward_join_99: {
    forward_join_96: {
    forward_join_90: {
    forward_join_73: {
    forward_join_72: {
    forward_join_70: {
    forward_join_69: {
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_22: {
    life2_3 = (com.moon.module.impl.BedBreaker.P ^ 96867135252009L);
    life4_5 = com.moon.bF.b();
    spill793_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    spill793_1 = com.moon.event.MovePhase.BEFORE;
    if (!((life4_5 != null))) {
        forwardValue793_513_0 = spill793_0;
        forwardValue793_513_1 = spill793_1;
        break forward_join_513;
    }
    if (!((spill793_0 == spill793_1))) {
        break forward_join_510;
    }
    ((com.moon.module.impl.BedBreaker)(this)).f();
    spill793_2 = this.B;
    if (!((life4_5 != null))) {
        forwardValue793_22_0 = spill793_2;
        break forward_join_22;
    }
    if (!((spill793_2 != null))) {
        break forward_join_598;
    }
    forwardValue793_22_0 = ((com.moon.setting.BooleanSetting)(this.v)).getValue();
    }
    spill793_3 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue793_22_0)))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue793_308_0 = ((spill793_3) ? 1 : 0);
        break forward_join_308;
    }
    if (!(spill793_3)) {
        break forward_join_304;
    }
    spill793_4 = this;
    if (!((life4_5 != null))) {
        forwardValue793_138_0 = spill793_4;
        break forward_join_138;
    }
    if (!((!((com.moon.module.impl.BedBreaker)(spill793_4)).L))) {
        break forward_join_137;
    }
    spill793_5 = this;
    if (!((life4_5 != null))) {
        forwardValue793_41_0 = spill793_5;
        break forward_join_41;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill793_5)).D)) {
        break forward_join_40;
    }
    forwardValue793_42_0 = this.C;
    break forward_join_42;
    }
    forwardValue793_41_0 = this;
    }
    forwardValue793_42_0 = ((com.moon.module.impl.BedBreaker)(forwardValue793_41_0)).B;
    }
    life5_71 = forwardValue793_42_0;
    life6_76 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(life5_71)));
    life7_79 = ((net.minecraft.block.state.IBlockState)(life6_76)).a__ch();
    spill793_6 = ((life7_79 instanceof moom.ci) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue793_90_0 = spill793_6;
        break forward_join_90;
    }
    if (!((spill793_6 != 0))) {
        break forward_join_73;
    }
    spill793_7 = this;
    if (!((life4_5 != null))) {
        forwardValue793_70_0 = spill793_7;
        break forward_join_70;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill793_7)).D)) {
        break forward_join_69;
    }
    this.C = ((moom.DT)(null));
    this.D = ((boolean)(false));
    if (!((life4_5 == null))) {
        break forward_join_72;
    }
    }
    forwardValue793_70_0 = this;
    }
    ((com.moon.module.impl.BedBreaker)(forwardValue793_70_0)).B = ((moom.DT)(null));
    }
    return;
    }
    spill793_8 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm;
    if (!((life4_5 != null))) {
        forwardValue793_99_0 = spill793_8;
        break forward_join_99;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(spill793_8)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, life5_71, moom.bs.UP))));
    forwardValue793_90_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue793_90_0 != 0))) {
        break forward_join_96;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).B__sourceReturn_da8c82d5d4();
    if (!((life4_5 == null))) {
        break forward_join_103;
    }
    }
    forwardValue793_99_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(forwardValue793_99_0)).a(((moom.yK)(new moom.zd())));
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm)).b(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, life5_71, moom.bs.UP))));
    this.H = ((boolean)(true));
    this.G = ((moom.DT)(life5_71));
    this.I = ((moom.DT)(life5_71));
    this.J = ((int)(__sourceIntrinsic_9f71572286bb_invokedynamic793_51(26693, (6180312401929301145L ^ life2_3))));
    this.L = ((boolean)(true));
    this.M = ((int)(0));
    if (!((life4_5 == null))) {
        break forward_join_598;
    }
    }
    forwardValue793_138_0 = this;
    }
    if (!((((com.moon.module.impl.BedBreaker)(forwardValue793_138_0)).G != null))) {
        break forward_join_598;
    }
    life5_201 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(this.G)));
    life6_204 = ((net.minecraft.block.state.IBlockState)(life5_201)).a__ch();
    com.moon.module.impl.BedBreaker __stackOp793_61_0 = this;
    ((com.moon.module.impl.BedBreaker)(__stackOp793_61_0)).F = ((double)((((com.moon.module.impl.BedBreaker)(__stackOp793_61_0)).F + ((double) ((net.minecraft.block.Block)(life6_204)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).i)), ((moom.DT)(this.G)), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())))))));
    spill793_9 = recovery.source.CarrierOps.dcmpl(((double)(this.F)), ((double)(0x1.0p0d)));
    if (!((life4_5 != null))) {
        forwardValue793_286_0 = spill793_9;
        break forward_join_286;
    }
    if (!((spill793_9 >= 0))) {
        break forward_join_282;
    }
    spill793_10 = ((life6_204 instanceof moom.ci) ? 1 : 0);
    if (!((life4_5 != null))) {
        forwardValue793_223_0 = spill793_10;
        break forward_join_223;
    }
    if (!((spill793_10 != 0))) {
        break forward_join_216;
    }
    this.F = ((double)(0x0.0p0d));
    this.G = ((moom.DT)(null));
    this.L = ((boolean)(false));
    spill793_11 = this;
    if (!((life4_5 != null))) {
        forwardValue793_204_0 = spill793_11;
        break forward_join_204;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill793_11)).D)) {
        break forward_join_203;
    }
    this.C = ((moom.DT)(null));
    this.D = ((boolean)(false));
    if (!((life4_5 == null))) {
        break forward_join_206;
    }
    }
    forwardValue793_204_0 = this;
    }
    ((com.moon.module.impl.BedBreaker)(forwardValue793_204_0)).B = ((moom.DT)(null));
    }
    life7_288 = ((com.moon.module.impl.AutoTool)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.AutoTool.class)))));
    ((com.moon.module.impl.AutoTool)(life7_288)).f();
    if (!((life4_5 == null))) {
        break forward_join_282;
    }
    }
    com.moon.module.impl.BedBreaker __stackOp793_91_0 = this;
    com.moon.module.impl.BedBreaker __stackOp793_93_0 = __stackOp793_91_0;
    int __stackOp793_93_1 = (((com.moon.module.impl.BedBreaker)(__stackOp793_91_0)).J + 1);
    spill793_12 = __stackOp793_93_1;
    ((com.moon.module.impl.BedBreaker)(__stackOp793_93_0)).J = ((int)(__stackOp793_93_1));
    forwardValue793_223_0 = spill793_12;
    }
    spill793_13 = __sourceIntrinsic_9f71572286bb_invokedynamic793_95(2966, (3453932299559178048L ^ life2_3));
    if (!((life4_5 != null))) {
        forwardValue793_287_0 = forwardValue793_223_0;
        forwardValue793_287_1 = spill793_13;
        break forward_join_287;
    }
    if (!((forwardValue793_223_0 >= spill793_13))) {
        break forward_join_282;
    }
    spill793_14 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm;
    if (!((life4_5 != null))) {
        forwardValue793_258_0 = spill793_14;
        break forward_join_258;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(spill793_14)).a(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, this.G, moom.bs.UP))));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue())) {
        break forward_join_255;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).B__sourceReturn_da8c82d5d4();
    if (!((life4_5 == null))) {
        break forward_join_262;
    }
    }
    forwardValue793_258_0 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(forwardValue793_258_0)).a(((moom.yK)(new moom.zd())));
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm)).b(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.STOP_DESTROY_BLOCK, this.G, moom.bs.UP))));
    this.H = ((boolean)(true));
    this.J = ((int)(0));
    this.M = ((int)(0));
    }
    spill793_15 = this;
    if (!((life4_5 != null))) {
        forwardValue793_297_0 = spill793_15;
        break forward_join_297;
    }
    forwardValue793_286_0 = ((com.moon.module.impl.BedBreaker)(spill793_15)).M;
    }
    forwardValue793_287_0 = forwardValue793_286_0;
    forwardValue793_287_1 = 1;
    }
    if (!((forwardValue793_287_0 == forwardValue793_287_1))) {
        break forward_join_296;
    }
    life7_388 = ((com.moon.module.impl.AutoTool)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.AutoTool.class)))));
    ((com.moon.module.impl.AutoTool)(life7_388)).f();
    }
    forwardValue793_297_0 = this;
    }
    com.moon.module.impl.BedBreaker __stackOp793_131_0 = forwardValue793_297_0;
    ((com.moon.module.impl.BedBreaker)(__stackOp793_131_0)).M = ((int)((((com.moon.module.impl.BedBreaker)(__stackOp793_131_0)).M + 1)));
    if (!((life4_5 == null))) {
        break forward_join_598;
    }
    }
    spill793_16 = this;
    if (!((life4_5 != null))) {
        forwardValue793_366_0 = spill793_16;
        break forward_join_366;
    }
    forwardValue793_308_0 = ((((com.moon.module.impl.BedBreaker)(spill793_16)).E) ? 1 : 0);
    }
    if (!((forwardValue793_308_0 == 0))) {
        break forward_join_365;
    }
    spill793_17 = this;
    if (!((life4_5 != null))) {
        forwardValue793_318_0 = spill793_17;
        break forward_join_318;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill793_17)).D)) {
        break forward_join_317;
    }
    forwardValue793_319_0 = this.C;
    break forward_join_319;
    }
    forwardValue793_318_0 = this;
    }
    forwardValue793_319_0 = ((com.moon.module.impl.BedBreaker)(forwardValue793_318_0)).B;
    }
    life5_428 = forwardValue793_319_0;
    life6_433 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(life5_428)));
    life7_436 = ((net.minecraft.block.state.IBlockState)(life6_433)).a__ch();
    if (!((life4_5 != null))) {
        break forward_join_363;
    }
    if (!((((life7_436 instanceof moom.ci) ? 1 : 0) != 0))) {
        break forward_join_350;
    }
    spill793_18 = this;
    if (!((life4_5 != null))) {
        forwardValue793_347_0 = spill793_18;
        break forward_join_347;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill793_18)).D)) {
        break forward_join_346;
    }
    this.C = ((moom.DT)(null));
    this.D = ((boolean)(false));
    if (!((life4_5 == null))) {
        break forward_join_349;
    }
    }
    forwardValue793_347_0 = this;
    }
    ((com.moon.module.impl.BedBreaker)(forwardValue793_347_0)).B = ((moom.DT)(null));
    }
    return;
    }
    ((com.moon.module.impl.BedBreaker)(this)).a__Void(((moom.DT)(life5_428)));
    this.J = ((int)(__sourceIntrinsic_9f71572286bb_invokedynamic793_149(13359, (1643463023106928881L ^ life2_3))));
    this.K = ((boolean)(false));
    }
    if (!((life4_5 == null))) {
        break forward_join_598;
    }
    }
    forwardValue793_366_0 = this;
    }
    if (!((((com.moon.module.impl.BedBreaker)(forwardValue793_366_0)).G != null))) {
        break forward_join_598;
    }
    life5_500 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(this.G)));
    life6_503 = ((net.minecraft.block.state.IBlockState)(life5_500)).a__ch();
    com.moon.module.impl.BedBreaker __stackOp793_158_0 = this;
    ((com.moon.module.impl.BedBreaker)(__stackOp793_158_0)).F = ((double)((((com.moon.module.impl.BedBreaker)(__stackOp793_158_0)).F + ((double) ((net.minecraft.block.Block)(life6_503)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).i)), ((moom.DT)(this.G)), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())))))));
    spill793_19 = recovery.source.CarrierOps.dcmpl(((double)(this.F)), ((double)(0x1.0p0d)));
    if (!((life4_5 != null))) {
        forwardValue793_406_0 = spill793_19;
        break forward_join_406;
    }
    if (!((spill793_19 >= 0))) {
        break forward_join_508;
    }
    forwardValue793_406_0 = ((life6_503 instanceof moom.ci) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forwardValue793_461_0 = forwardValue793_406_0;
        break forward_join_461;
    }
    if (!((forwardValue793_406_0 != 0))) {
        break forward_join_454;
    }
    this.F = ((double)(0x0.0p0d));
    this.G = ((moom.DT)(null));
    this.E = ((boolean)(false));
    spill793_20 = this;
    if (!((life4_5 != null))) {
        forwardValue793_432_0 = spill793_20;
        break forward_join_432;
    }
    if (!(((com.moon.module.impl.BedBreaker)(spill793_20)).D)) {
        break forward_join_431;
    }
    this.C = ((moom.DT)(null));
    this.D = ((boolean)(false));
    if (!((life4_5 == null))) {
        break forward_join_434;
    }
    }
    forwardValue793_432_0 = this;
    }
    ((com.moon.module.impl.BedBreaker)(forwardValue793_432_0)).B = ((moom.DT)(null));
    }
    life7_587 = ((com.moon.module.impl.AutoTool)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.AutoTool.class)))));
    ((com.moon.module.impl.AutoTool)(life7_587)).f();
    this.K = ((boolean)(false));
    this.J = ((int)(__sourceIntrinsic_9f71572286bb_invokedynamic793_189(10012, (2411052109485679555L ^ life2_3))));
    if (!((life4_5 == null))) {
        break forward_join_508;
    }
    }
    com.moon.module.impl.BedBreaker __stackOp793_191_0 = this;
    com.moon.module.impl.BedBreaker __stackOp793_193_0 = __stackOp793_191_0;
    int __stackOp793_193_1 = (((com.moon.module.impl.BedBreaker)(__stackOp793_191_0)).J + 1);
    spill793_21 = __stackOp793_193_1;
    ((com.moon.module.impl.BedBreaker)(__stackOp793_193_0)).J = ((int)(__stackOp793_193_1));
    forwardValue793_461_0 = spill793_21;
    }
    if (!((life4_5 != null))) {
        forwardValue793_499_0 = forwardValue793_461_0;
        break forward_join_499;
    }
    if (!((forwardValue793_461_0 >= __sourceIntrinsic_9f71572286bb_invokedynamic793_195(10012, (2411052109485679555L ^ life2_3))))) {
        break forward_join_495;
    }
    spill793_22 = this.K;
    if (!((life4_5 != null))) {
        forwardValue793_499_0 = ((spill793_22) ? 1 : 0);
        break forward_join_499;
    }
    if (!(spill793_22)) {
        break forward_join_495;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).cm)).b(((moom.yK)(new moom.za(net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK, this.G, moom.bs.UP))));
    this.F = ((double)(0x0.0p0d));
    this.J = ((int)(0));
    this.K = ((boolean)(false));
    return;
    }
    spill793_23 = this;
    if (!((life4_5 != null))) {
        forwardValue793_506_0 = spill793_23;
        break forward_join_506;
    }
    forwardValue793_499_0 = ((((com.moon.module.impl.BedBreaker)(spill793_23)).K) ? 1 : 0);
    }
    if (!((forwardValue793_499_0 == 0))) {
        break forward_join_508;
    }
    ((com.moon.module.impl.BedBreaker)(this)).a(((moom.DT)(this.G)), ((boolean)(false)));
    forwardValue793_506_0 = this;
    }
    ((com.moon.module.impl.BedBreaker)(forwardValue793_506_0)).K = ((boolean)(true));
    }
    if (!((life4_5 == null))) {
        break forward_join_598;
    }
    }
    forwardValue793_513_0 = ((com.moon.event.MoveEvent)(p0)).getPhase();
    forwardValue793_513_1 = com.moon.event.MovePhase.PRE;
    }
    if (!((forwardValue793_513_0 == forwardValue793_513_1))) {
        break forward_join_598;
    }
    spill793_24 = this.E;
    if (!((life4_5 != null))) {
        forwardValue793_531_0 = ((spill793_24) ? 1 : 0);
        break forward_join_531;
    }
    if (!(spill793_24)) {
        break forward_join_527;
    }
    spill793_25 = this;
    if (!((life4_5 != null))) {
        forwardValue793_533_0 = spill793_25;
        break forward_join_533;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.BedBreaker)(spill793_25)).t)).getValue())))).booleanValue())) {
        break forward_join_532;
    }
    }
    spill793_26 = this;
    if (!((life4_5 != null))) {
        forwardValue793_533_0 = spill793_26;
        break forward_join_533;
    }
    forwardValue793_531_0 = ((((com.moon.module.impl.BedBreaker)(spill793_26)).H) ? 1 : 0);
    }
    if (!((forwardValue793_531_0 != 0))) {
        break forward_join_598;
    }
    }
    forwardValue793_533_0 = this;
    }
    if (!((((com.moon.module.impl.BedBreaker)(forwardValue793_533_0)).I != null))) {
        break forward_join_598;
    }
    life5_743 = new com.moon.pw(((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).n), (((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).o) + ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).e__Float()), ((float) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).p));
    life6_765 = new com.moon.pw((((float) ((moom.DT)(this.I)).a()) + 0x1.0p-1f), (((float) ((moom.DT)(this.I)).b()) + 0x1.0p-1f), (((float) ((moom.DT)(this.I)).c()) + 0x1.0p-1f));
    life7_770 = ((com.moon.module.impl.BedBreaker)(this)).a(((com.moon.pw)(life5_743)), ((com.moon.pw)(life6_765)));
    ((com.moon.event.MoveEvent)(p0)).a(((float)(((org.lwjgl.util.vector.Vector2f)(life7_770)).x)));
    ((com.moon.event.MoveEvent)(p0)).b(((float)(moom.Dr.a(((float)(((org.lwjgl.util.vector.Vector2f)(life7_770)).y)), ((float)(-0x1.68p6f)), ((float)(0x1.68p6f))))));
    this.H = ((boolean)(false));
    }
    return;
}


private boolean a__Boolean(moom.DT p0, moom.DT p1) {
int lexicalValue226_103_0;
    int lexicalValue226_108_0;
    int lexicalValue226_112_0;
    int lexicalValue226_117_0;
    java.lang.String spill226_0;
    boolean spill226_1;
    int spill226_2;
    int spill226_3;
    long life3_3;
    moom.DT[] life6_52;
    moom.DT[] life7_54;
    int life8_57;
    java.lang.String life5_58;
    int life9_60;
    moom.DT life10_67;
    moom.DT life11_71;
    net.minecraft.block.state.IBlockState life12_90;
    net.minecraft.block.Block life13_93;
    int life14_106;
    lexical_join_117: {
    lexical_join_116: {
    life3_3 = (com.moon.module.impl.BedBreaker.P ^ 18977458600548L);
    spill226_0 = com.moon.bF.b();
    life6_52 = new moom.DT[] {new moom.DT(0, 1, 0), new moom.DT(1, 0, 0), new moom.DT(-1, 0, 0), new moom.DT(0, 0, 1), new moom.DT(0, 0, -1)};
    life7_54 = life6_52;
    life8_57 = (life7_54).length;
    life5_58 = spill226_0;
    life9_60 = 0;
    lexical_cycle_61: while (true) {
    lexical_join_113: {
    lexical_join_112: {
    lexical_join_108: {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_103: {
    lexical_join_80: {
    if (!((life9_60 < life8_57))) {
        break lexical_join_116;
    }
    life10_67 = (life7_54)[life9_60];
    life11_71 = ((moom.DT)(p0)).a__DT(((moom.DS)(life10_67)));
    spill226_1 = ((moom.DT)(life11_71)).equals(((java.lang.Object)(p1)));
    if (!((life5_58 != null))) {
        lexicalValue226_117_0 = ((spill226_1) ? 1 : 0);
        break lexical_join_117;
    }
    if (!(spill226_1)) {
        break lexical_join_80;
    }
    if (!((life5_58 == null))) {
        break lexical_join_113;
    }
    }
    life12_90 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(life11_71)));
    life13_93 = ((net.minecraft.block.state.IBlockState)(life12_90)).a__ch();
    spill226_2 = ((life13_93 instanceof net.minecraft.block.BlockBed) ? 1 : 0);
    if (!((life5_58 != null))) {
        lexicalValue226_108_0 = spill226_2;
        break lexical_join_108;
    }
    if (!((spill226_2 != 0))) {
        break lexical_join_106;
    }
    life14_106 = ((((com.moon.module.impl.BedBreaker)(this)).a__Boolean(((moom.DT)(life11_71)), ((moom.DT)(p1)))) ? 1 : 0);
    spill226_3 = life14_106;
    if (!((life5_58 != null))) {
        lexicalValue226_103_0 = spill226_3;
        break lexical_join_103;
    }
    if (!((spill226_3 != 0))) {
        break lexical_join_104;
    }
    lexicalValue226_103_0 = 1;
    }
    return ((lexicalValue226_103_0) != 0);
    }
    if (!((life5_58 == null))) {
        break lexical_join_113;
    }
    }
    lexicalValue226_108_0 = ((life13_93 instanceof moom.ci) ? 1 : 0);
    }
    if (!((life5_58 != null))) {
        lexicalValue226_112_0 = lexicalValue226_108_0;
        break lexical_join_112;
    }
    if (!((lexicalValue226_108_0 != 0))) {
        break lexical_join_113;
    }
    lexicalValue226_112_0 = 1;
    }
    return ((lexicalValue226_112_0) != 0);
    }
    life9_60 += 1;
    if (!((life5_58 == null))) { continue lexical_cycle_61; }
    break lexical_cycle_61;
    }
    }
    lexicalValue226_117_0 = 0;
    }
    return ((lexicalValue226_117_0) != 0);
}


private void a(moom.DT p0, boolean p1) { __sourceHandlerCall_961053ab66762f9b20be(this, p0, p1); }


private int a(moom.DT p0) {
net.minecraft.item.ItemStack lexicalValue224_50_0;
    java.lang.String spill224_0;
    net.minecraft.item.ItemStack spill224_1;
    long life2_3;
    int life5_9;
    java.lang.String life4_10;
    net.minecraft.block.Block life6_16;
    float life7_24;
    int life8_30;
    net.minecraft.item.ItemStack life9_44;
    float life10_65;
    lexical_join_74: {
    lexical_join_21: {
    life2_3 = (com.moon.module.impl.BedBreaker.P ^ 937110885106L);
    spill224_0 = com.moon.bF.b();
    life5_9 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).bD)).c;
    life4_10 = spill224_0;
    life6_16 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(p0))))).a__ch();
    if (!((life6_16 == null))) {
        break lexical_join_21;
    }
    return life5_9;
    }
    life7_24 = 0x1.0p0f;
    life8_30 = __sourceIntrinsic_d85576047056_invokedynamic224_10(24315, (3749767868046896887L ^ life2_3));
    lexical_cycle_29: while (true) {
    lexical_join_72: {
    lexical_join_71: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((life8_30 < __sourceIntrinsic_d85576047056_invokedynamic224_11(25556, (1536357644644701140L ^ life2_3))))) {
        break lexical_join_74;
    }
    life9_44 = ((moom.wB)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)).bF)).a__wB(((int)(life8_30))))).a__xW();
    spill224_1 = life9_44;
    if (!((life4_10 != null))) {
        lexicalValue224_50_0 = spill224_1;
        break lexical_join_50;
    }
    if (!((spill224_1 == null))) {
        break lexical_join_49;
    }
    if (!((life4_10 == null))) {
        break lexical_join_71;
    }
    }
    lexicalValue224_50_0 = life9_44;
    }
    life10_65 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(lexicalValue224_50_0)).a__wQ())).a(((net.minecraft.item.ItemStack)(life9_44)), ((net.minecraft.block.Block)(life6_16)));
    if (!((life4_10 != null))) {
        break lexical_join_72;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life10_65)), ((float)(life7_24))) > 0))) {
        break lexical_join_71;
    }
    life5_9 = (life8_30 - __sourceIntrinsic_d85576047056_invokedynamic224_20(18859, (6825469235375077796L ^ life2_3)));
    life7_24 = life10_65;
    }
    life8_30 += 1;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return life5_9;
}


private moom.DN<moom.DT, java.lang.Double> a(moom.DT p0, moom.DT p1) {
double lexicalValue225_117_0;
    int lexicalValue225_123_0;
    java.lang.String spill225_0;
    int spill225_1;
    double spill225_2;
    long life3_3;
    moom.DT[] life6_52;
    moom.DT life7_54;
    double life8_56;
    java.lang.String life5_57;
    moom.DT[] life10_59;
    int life11_62;
    int life12_64;
    moom.DT life13_71;
    moom.DT life14_75;
    net.minecraft.block.state.IBlockState life15_89;
    net.minecraft.block.Block life16_92;
    moom.DN life17_105;
    java.lang.Double life18_109;
    int life17_135;
    float life18_149;
    lexical_join_153: {
    life3_3 = (com.moon.module.impl.BedBreaker.P ^ 34239668901541L);
    spill225_0 = com.moon.bF.b();
    life6_52 = new moom.DT[] {new moom.DT(0, 1, 0), new moom.DT(1, 0, 0), new moom.DT(-1, 0, 0), new moom.DT(0, 0, 1), new moom.DT(0, 0, -1)};
    life7_54 = null;
    life8_56 = 0x0.0p0d;
    life5_57 = spill225_0;
    life10_59 = life6_52;
    life11_62 = (life10_59).length;
    life12_64 = 0;
    lexical_cycle_65: while (true) {
    lexical_join_151: {
    lexical_join_150: {
    lexical_join_123: {
    lexical_join_120: {
    lexical_join_118: {
    lexical_join_117: {
    lexical_join_82: {
    if (!((life12_64 < life11_62))) {
        break lexical_join_153;
    }
    life13_71 = (life10_59)[life12_64];
    life14_75 = ((moom.DT)(p0)).a__DT(((moom.DS)(life13_71)));
    if (!(((moom.DT)(life14_75)).equals(((java.lang.Object)(p1))))) {
        break lexical_join_82;
    }
    if (!((life5_57 == null))) {
        break lexical_join_150;
    }
    }
    life15_89 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)).a__fE(((moom.DT)(life14_75)));
    life16_92 = ((net.minecraft.block.state.IBlockState)(life15_89)).a__ch();
    spill225_1 = ((life16_92 instanceof net.minecraft.block.BlockBed) ? 1 : 0);
    if (!((life5_57 != null))) {
        lexicalValue225_123_0 = spill225_1;
        break lexical_join_123;
    }
    if (!((spill225_1 != 0))) {
        break lexical_join_120;
    }
    life17_105 = ((com.moon.module.impl.BedBreaker)(this)).a(((moom.DT)(life14_75)), ((moom.DT)(p1)));
    life18_109 = ((java.lang.Double)(((moom.DN)(life17_105)).b()));
    spill225_2 = ((java.lang.Double)(life18_109)).doubleValue();
    if (!((life5_57 != null))) {
        lexicalValue225_117_0 = spill225_2;
        break lexical_join_117;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill225_2)), ((double)(life8_56))) > 0))) {
        break lexical_join_118;
    }
    life7_54 = ((moom.DT)(((moom.DN)(life17_105)).a()));
    lexicalValue225_117_0 = ((java.lang.Double)(life18_109)).doubleValue();
    }
    life8_56 = lexicalValue225_117_0;
    }
    if (!((life5_57 == null))) {
        break lexical_join_150;
    }
    }
    lexicalValue225_123_0 = ((com.moon.module.impl.BedBreaker)(this)).a(((moom.DT)(life14_75)));
    }
    life17_135 = lexicalValue225_123_0;
    life18_149 = ((net.minecraft.block.Block)(life16_92)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).K)), ((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.BedBreaker.d)).I)), ((moom.DT)(life14_75)), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())), ((int)(life17_135)));
    if (!((life5_57 != null))) {
        break lexical_join_151;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) life18_149))), ((double)(life8_56))) > 0))) {
        break lexical_join_150;
    }
    life7_54 = life14_75;
    life8_56 = ((double) life18_149);
    }
    life12_64 += 1;
    }
    if (!((life5_57 == null))) { continue lexical_cycle_65; }
    break lexical_cycle_65;
    }
    }
    return new moom.DN(life7_54, java.lang.Double.valueOf(((double)(life8_56))));
}


public double a() {
return this.F;
}


public com.moon.module.impl.BedBreaker a__lC(moom.DT p0) {
this.G = ((moom.DT)(p0));
    return this;
}


public moom.DT a__DT() {
return this.G;
}


public com.moon.module.impl.BedBreaker a(double p0) {
this.F = ((double)(p0));
    return this;
}


private java.lang.Boolean lambda$new$0() {
int forwardValue802_19_0;
    int forwardValue802_23_0;
    int forwardValue802_25_0;
    boolean spill802_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.BedBreaker.P ^ 106767626004042L);
    life3_5 = com.moon.bF.b();
    spill802_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.z)).getValue())))).booleanValue();
    if (!((life3_5 != null))) {
        forwardValue802_19_0 = ((spill802_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill802_0))) {
        break forward_join_24;
    }
    forwardValue802_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.y)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 != null))) {
        forwardValue802_23_0 = forwardValue802_19_0;
        break forward_join_23;
    }
    if (!((forwardValue802_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue802_23_0 = 1;
    }
    forwardValue802_25_0 = forwardValue802_23_0;
    break forward_join_25;
    }
    forwardValue802_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue802_25_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_47(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_55(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_74(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_79(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_10aff2b4fbfed609_originalDynamicSite1_84(com.moon.module.impl.BedBreaker a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_936ea035296a_originalDynamicSite515_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_936ea035296a_originalDynamicSite515_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic793_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic793_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic793_149(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic793_189(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic793_195(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd0609abcd78_invokedynamic300030_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_invokedynamic224_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_invokedynamic224_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_invokedynamic224_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2390_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2392_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_20563a9c9945_invokedynamic2389_7(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
