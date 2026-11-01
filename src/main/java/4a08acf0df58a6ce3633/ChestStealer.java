package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ChestStealer extends com.moon.module.Module {

private static java.lang.String[] s;

private static java.lang.String[] t;

public com.moon.setting.BooleanSetting u;

public com.moon.setting.BooleanSetting v;

public com.moon.setting.BooleanSetting w;

public com.moon.setting.BooleanSetting x;

public com.moon.setting.BooleanSetting y;

public com.moon.setting.BooleanSetting z;

public com.moon.setting.BooleanSetting A;

public com.moon.setting.IntegerSetting B;

public com.moon.setting.IntegerSetting C;

public com.moon.setting.IntegerSetting D;

private com.moon.nW E;

private com.moon.nH F;

private long G;

private boolean H;

private static long I;

private static java.lang.String[] J;

private static java.lang.String[] K;

private static java.util.Map L;

private static long[] M;

private static java.lang.Integer[] N;

private static java.util.Map O;

private static long P;

public ChestStealer(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_e2bdae614375c9e6(com.moon.module.impl.ChestStealer receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.ChestStealer.I ^ 84829607423256L);

    com.moon.module.impl.ChestStealer.__sourceConstructorInit_e2bdae614375c9e6_0(((com.moon.module.impl.ChestStealer)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.ChestStealer)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_5(19364, (1167827067869040049L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_8(31233, (1750442562947628069L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_13(1497, (492573567274763258L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_16(31515, (2206567658359307529L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_21(32691, (4047806409874717115L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_24(11716, (5782272639416167362L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_29(21573, (8710715014305387118L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_32(11731, (8106920250507619279L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.ChestStealer __sourceSpill3_43 = receiver;

    com.moon.l_ __sourceSpill3_44 = ((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_37(15268, (3609276959403179510L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_40(27795, (8767542349658499745L ^ local5_life2)))), ((boolean)(true)));

    com.moon.setting.BooleanSetting __sourceEffectfulDup3_45 = ((com.moon.module.impl.ChestStealer)(receiver)).x;

    com.moon.setting.BooleanSetting __sourceSpill3_47 = __sourceEffectfulDup3_45;

    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup3_45)));

    ((com.moon.module.impl.ChestStealer)(__sourceSpill3_43)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(__sourceSpill3_44)).a(((java.util.function.Supplier)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_48(__sourceSpill3_47)))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).z = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_53(26554, (9146058161925366172L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_56(1553, (6629182570395582493L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).A = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_61(23510, (3755307818965081541L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_64(1462, (667939077759058819L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).B = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_69(8063, (2629371406301780340L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_72(7871, (5332474018016450737L ^ local5_life2)))), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_74(9140, (2993693740241127815L ^ local5_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_76(24198, (6521773537764242602L ^ local5_life2)))), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_78(30425, (7547453879736065251L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).C = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_83(11662, (6187971044245236638L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_86(11722, (8587065653503290327L ^ local5_life2)))), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_88(30425, (7547453879736065251L ^ local5_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_90(7944, (8361476700758193409L ^ local5_life2)))), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_92(30425, (7547453879736065251L ^ local5_life2))))))).a()));

    com.moon.module.impl.ChestStealer __sourceSpill3_107 = receiver;

    com.moon.mf __sourceSpill3_108 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_97(32648, (3602171053253671328L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_100(853, (3996336648475460973L ^ local5_life2)))), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_102(15944, (3136178600756024395L ^ local5_life2)))), ((int)(0)), ((int)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_104(16294, (6305216699476776340L ^ local5_life2)))), ((int)(1)));

    com.moon.setting.BooleanSetting __sourceEffectfulDup3_109 = ((com.moon.module.impl.ChestStealer)(receiver)).w;

    com.moon.setting.BooleanSetting __sourceSpill3_111 = __sourceEffectfulDup3_109;

    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup3_109)));

    ((com.moon.module.impl.ChestStealer)(__sourceSpill3_107)).D = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill3_108)).a(((java.util.function.Supplier)(__sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_112(__sourceSpill3_111)))))).a()));

    ((com.moon.module.impl.ChestStealer)(receiver)).E = ((com.moon.nW)(new com.moon.nW()));

    ((com.moon.module.impl.ChestStealer)(receiver)).F = ((com.moon.nH)(null));

    return;

}



static {
I = ((long)(((moom._a)(moom._c.a(((long)(1627682898399344944L)), ((long)(4607426264292589617L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(50543150209595L)))));
    long local25_life6 = (com.moon.module.impl.ChestStealer.I ^ 93798044949526L);
    L = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local16_life9;
    javax.crypto.Cipher __sourceSpill265_11 = (local16_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill265_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill265_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill265_14 = new byte[8];
    (__sourceSpill265_14)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local17_life15 = 1;
    while ((local17_life15 < 8)) {
        (__sourceSpill265_14)[local17_life15] = ((byte) ((int) ((local25_life6 << (local17_life15 * 8)) >>> 56)));
        local17_life15 += 1;
    }
    byte[] __sourcePreallocation265_16 = __sourceSpill265_14;
    ((javax.crypto.Cipher)(__sourceSpill265_11)).init(((int)(__sourceSpill265_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill265_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation265_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local23_life19 = new java.lang.String[67];
    int local21_life20 = 0;
    java.lang.String local20_life21;
    int local22_life23 = ((java.lang.String)((local20_life21 = "IÑ<«¤í\006&MæynÑ°(\026ü¦\022\001:$dÛ²\016©\025ê\004_Í`\004hoûaHÏï`l\032\tâ¡\036#(ÿ\"\006ÎÜTr0·Æ\003J*3 Ú´F3 KLØ·\013º°9H¢\0351\t\032@T{\020Î¡L%¢Èz\005Ý%ïxUAG\020²åÿU¡ï2\r-F´\033ÿ^\013\022\020PÀà\rL\003Í4Su\000x+\020ÇÌ`jêë×\"ö=Iê©¤p U\031©8Ó\023é@ÐÚ\005{¾Ök×\023tÈ¯*\035îÇ\020(\020Ë4OJçå\002ÆÛóP\020ë\\!+PÎÖ`»ñ8ÙF\t×\020íZá\022@Vh¥Ç9«GT×\030\0317Ä±ÂkGÝÐ\036`\036Þ:\013ÆéN&!%\020\016ÆÙýÇÏÜÔ \003\013§\001\020ÉÿI]cáÌË\007&J\030\036Lh4\030Ù$\027ÔY­fpÖL£\001\020ÅOýÁ\034(SL´@-,Í\004¾iÖ\017ïw\007-gdóÄ\005Vx\"2\001ø§×Õ?J«:Æmî\020\f'dFÍ\r©\033N ÉÕ\020º\026l+8d¼EsËý\022jìü)\020>ÓG,ä¹<4û\000õK! wVbZ­n|Y?àèÞ;ÏLÉÁ~ô|Ð\026 ´çÉí\034ì\020&¶<e@åÔ\"æ{¦Ó<Á\035\024\030·6m=@\b¯Ô±áCû\022ûÀûa|4\000\020¤H´VðTµOlô\030\024³\020Ù\002\016$0ïMþN´*¨\004®M\020ÁúÁúêu\001¾Åò\037çV[I\020¾YD÷8tÕì¼tëE{\020× ßvrø¬ê9\nâÞ>ÚÈº\020¯¨Ø½\026ëöQpFF{Î\"L\020°Úñ©\022Ûäôö)«%¾qá\027\020¥´ ®Ê@;å¨eBÕÞÀ xÙ\024\023ÇËçT´Rø\027ý\t\000Áîðú\003/[ÍjÝ¤7×u¯\020ùEïÜð\n=¸¬ò. \023{ ®XJæ­\005p7À*ï©H\033p4h»'æõÃ¶Ðµ'.>\020ýV\035eiheGÿºË\020c\007×$Rñz\035!×ýé]\002\by\020\030æ\0036¼!GÜ¢)ëªö% µ2^t²çÉs^1\024ùc\024NæÀh\020SìÝ\fof\r\b'\020\013Üz°\byÈnº£AÎH·\b(AþÅ\002.÷1¿_\032N_-6Ð×]VúBzl]\ráa)Áîx<iå=¬(ÉãèF¯¡[A¼÷G\035?\034é;\031x²e¼~¾iS\007Û\013ÕÌÂap\022¦\020\020þ\007Ss¢\"ß8?2ûuÔ\020®ÆæÀ·\016\006nv\020é\002e\036PU \032n[ó îì\000ç*c\tZNl*\007.xU+Ð¿üV?l\032E ¹³\017%°ù)\032wüç9\031GsÍ;{_ñwL9\034¨\032Ó±-\020P Q\rÑÑ(YÛ\021§TJ¥/\020W\033~\037ÃJ\"Cx\r¨@ë5\020\034bq¿X'\037¶»n45\034Ä\020Ï%Æè¾á\004ÒYbJ9õ«\020qoÏÓ1\177Mö\n@5\037Å\f\0202jÞ¼ð<Å3Â[C¦m²\020¡mNl2\t©Ê}«À\020\\ë1+¦È8eÔ®y,q T;¶2r{ùØòX\022nIÂùu\n:¤ü Éþgñ(9\020|\021þ#Å^¤z×.WË·è\030^ÏûC{^\013\032Ê[\001Lùç@­ÇØ~¤æ\0205þ\031«/*ëßgGp6µûÙ\020^ªå-Ú\000ÿ\034mtÔ,µ\0208È<QK½ÑW\bW\035¦\005¹·\030o\034/ï\032®ÉÿVÚ^v@d08Ö¯#\037)\b\020\030\037j\020f\024pÇ»¸Ûn7°`«\030cVJ\013»eQ{\"Kã[­¾\nô¶O\020´¨z/°\013\020à:\016ýê\0175\020Y^Byx¬\002×j!\022­\020ë/Ù\031jÁhô³\r±Ç\021BS\030n\n\037ëå\013¯x@´U\002â¿Õ\t\036ó\021\f"))).length();
    int local19_life24 = 16;
    int local18_life25 = -1;
    while (true) {
        local18_life25 += 1;
        byte[] __sourceSpill265_28 = ((java.lang.String)(((java.lang.String)(local20_life21)).substring(((int)(local18_life25)), ((int)((local18_life25 + local19_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill265_29 = local16_life9;
        byte[] local24_life31 = ((javax.crypto.Cipher)(__sourceSpill265_29)).doFinal(((byte[])(__sourceSpill265_28)));
        java.lang.String __sourceSpill265_34 = ((java.lang.String)(com.moon.module.impl.ChestStealer.c(((byte[])(local24_life31))))).intern();
        java.lang.String[] __sourceSpill265_35 = local23_life19;
        int __sourceSpill265_36 = local21_life20;
        local21_life20 += 1;
        (__sourceSpill265_35)[__sourceSpill265_36] = __sourceSpill265_34;
        if (!(((local18_life25 = (local18_life25 + local19_life24)) < local22_life23))) { break; }
        local19_life24 = ((java.lang.String)(local20_life21)).charAt(((int)(local18_life25)));
    }
    local22_life23 = ((java.lang.String)((local20_life21 = ".\006<ÊÌ\177Ö}FNíÊnÈ\020\001ÞúaFÒ;ORÙÕ4¬\022þ"))).length();
    local19_life24 = 16;
    local18_life25 = -1;
    while (true) {
        local18_life25 += 1;
        byte[] __sourceSpill265_41 = ((java.lang.String)(((java.lang.String)(local20_life21)).substring(((int)(local18_life25)), ((int)((local18_life25 + local19_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill265_42 = local16_life9;
        byte[] local24_life44 = ((javax.crypto.Cipher)(__sourceSpill265_42)).doFinal(((byte[])(__sourceSpill265_41)));
        java.lang.String __sourceSpill265_47 = ((java.lang.String)(com.moon.module.impl.ChestStealer.c(((byte[])(local24_life44))))).intern();
        java.lang.String[] __sourceSpill265_48 = local23_life19;
        int __sourceSpill265_49 = local21_life20;
        local21_life20 += 1;
        (__sourceSpill265_48)[__sourceSpill265_49] = __sourceSpill265_47;
        if (!(((local18_life25 = (local18_life25 + local19_life24)) < local22_life23))) { break; }
        local19_life24 = ((java.lang.String)(local20_life21)).charAt(((int)(local18_life25)));
    }
    J = ((java.lang.String[])(local23_life19));
    K = ((java.lang.String[])(new java.lang.String[67]));
    O = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life55;
    javax.crypto.Cipher __sourceSpill265_57 = (local5_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill265_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill265_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill265_60 = new byte[8];
    (__sourceSpill265_60)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local6_life61 = 1;
    while ((local6_life61 < 8)) {
        (__sourceSpill265_60)[local6_life61] = ((byte) ((int) ((local25_life6 << (local6_life61 * 8)) >>> 56)));
        local6_life61 += 1;
    }
    byte[] __sourcePreallocation265_62 = __sourceSpill265_60;
    ((javax.crypto.Cipher)(__sourceSpill265_57)).init(((int)(__sourceSpill265_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill265_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation265_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life65 = new long[50];
    int local8_life66 = 0;
    java.lang.String local9_life67;
    int local10_life69 = ((java.lang.String)((local9_life67 = "¸\032j9åêÛÀ×÷D'A«\030ºn)\t-;*/Ô5[ql ýa¡ÚüÂxàºÊámNNBÃLn s¤R\037³ÄØ¢¿èC1¡\b¨É¿4ÚÉdù\022\020÷æçmLæ¥÷\f\034¬K­oùz\022\034c{\\­Ìíûd³Q«È3*³Ëá&Ä\005{'\030\\\f¯bQC@}³5¾þdXP\017=úF\f¹­å\030äg\000O?Üú vñàáÕ\005ð1h\famâkìw\njÎÑÊ®d þ?.¤¿\000%a\021\000ºs\021MË\177àùeÆ\036*P.*\t·(ÄïJ0\bÁ\013LZ\037\007\016`1ªM7Ëæ¦J{\"òxöÑåõb\006¬è\024¶#à\026ÊÐ2\0171\006®9)Lîjì'Ñ\036Ì%ô÷3oßµö9©]'u^ÄK\"_c3k9\005\037\007¾,¨°\023] \021\006IyÍÔ¦ E:BiÆÀ¶SÃ\006lêQè&ôû\fß\013Ö\036íÆòÑ¦#\0034>Ë®çÁ\037ìÕ·li\027"))).length();
    int local7_life70 = 0;
    do {
        java.lang.String __sourceSpill265_71 = local9_life67;
        int __sourceSpill265_72 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill265_71)).substring(((int)(__sourceSpill265_72)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill265_76 = local11_life65;
        int __sourceSpill265_77 = local8_life66;
        local8_life66 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill265_79 = new byte[8];
        (__sourceSpill265_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill265_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill265_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill265_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill265_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill265_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill265_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill265_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill265_80 = local5_life55;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill265_80)).doFinal(((byte[])(__sourceSpill265_79)));
        (__sourceSpill265_76)[__sourceSpill265_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    local10_life69 = ((java.lang.String)((local9_life67 = "^\\Lµ¼r\030£\004Ú9<w@ã"))).length();
    local7_life70 = 0;
    do {
        java.lang.String __sourceSpill265_84 = local9_life67;
        int __sourceSpill265_85 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill265_84)).substring(((int)(__sourceSpill265_85)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill265_89 = local11_life65;
        int __sourceSpill265_90 = local8_life66;
        local8_life66 += 1;
        long local13_life91 = (((((((((((long) (local12_life88)[0]) & 255L) << 56) | ((((long) (local12_life88)[1]) & 255L) << 48)) | ((((long) (local12_life88)[2]) & 255L) << 40)) | ((((long) (local12_life88)[3]) & 255L) << 32)) | ((((long) (local12_life88)[4]) & 255L) << 24)) | ((((long) (local12_life88)[5]) & 255L) << 16)) | ((((long) (local12_life88)[6]) & 255L) << 8)) | (((long) (local12_life88)[7]) & 255L));
        byte[] __sourceSpill265_92 = new byte[8];
        (__sourceSpill265_92)[0] = ((byte) ((int) (local13_life91 >>> 56)));
        (__sourceSpill265_92)[1] = ((byte) ((int) (local13_life91 >>> 48)));
        (__sourceSpill265_92)[2] = ((byte) ((int) (local13_life91 >>> 40)));
        (__sourceSpill265_92)[3] = ((byte) ((int) (local13_life91 >>> 32)));
        (__sourceSpill265_92)[4] = ((byte) ((int) (local13_life91 >>> 24)));
        (__sourceSpill265_92)[5] = ((byte) ((int) (local13_life91 >>> 16)));
        (__sourceSpill265_92)[6] = ((byte) ((int) (local13_life91 >>> 8)));
        (__sourceSpill265_92)[7] = ((byte) ((int) local13_life91));
        javax.crypto.Cipher __sourceSpill265_93 = local5_life55;
        byte[] local15_life95 = ((javax.crypto.Cipher)(__sourceSpill265_93)).doFinal(((byte[])(__sourceSpill265_92)));
        (__sourceSpill265_89)[__sourceSpill265_90] = (((((((((((long) (local15_life95)[0]) & 255L) << 56) | ((((long) (local15_life95)[1]) & 255L) << 48)) | ((((long) (local15_life95)[2]) & 255L) << 40)) | ((((long) (local15_life95)[3]) & 255L) << 32)) | ((((long) (local15_life95)[4]) & 255L) << 24)) | ((((long) (local15_life95)[5]) & 255L) << 16)) | ((((long) (local15_life95)[6]) & 255L) << 8)) | (((long) (local15_life95)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    M = ((long[])(local11_life65));
    N = ((java.lang.Integer[])(new java.lang.Integer[50]));
    javax.crypto.Cipher local0_life99;
    javax.crypto.Cipher __sourceSpill265_101 = (local0_life99 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill265_102 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill265_103 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill265_104 = new byte[8];
    (__sourceSpill265_104)[0] = ((byte) ((int) (local25_life6 >>> 56)));
    int local1_life105 = 1;
    while ((local1_life105 < 8)) {
        (__sourceSpill265_104)[local1_life105] = ((byte) ((int) ((local25_life6 << (local1_life105 * 8)) >>> 56)));
        local1_life105 += 1;
    }
    byte[] __sourcePreallocation265_106 = __sourceSpill265_104;
    ((javax.crypto.Cipher)(__sourceSpill265_101)).init(((int)(__sourceSpill265_102)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill265_103)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation265_106)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life109 = -1703466665949693608L;
    byte[] __sourceSpill265_110 = new byte[8];
    (__sourceSpill265_110)[0] = ((byte) ((int) (local2_life109 >>> 56)));
    (__sourceSpill265_110)[1] = ((byte) ((int) (local2_life109 >>> 48)));
    (__sourceSpill265_110)[2] = ((byte) ((int) (local2_life109 >>> 40)));
    (__sourceSpill265_110)[3] = ((byte) ((int) (local2_life109 >>> 32)));
    (__sourceSpill265_110)[4] = ((byte) ((int) (local2_life109 >>> 24)));
    (__sourceSpill265_110)[5] = ((byte) ((int) (local2_life109 >>> 16)));
    (__sourceSpill265_110)[6] = ((byte) ((int) (local2_life109 >>> 8)));
    (__sourceSpill265_110)[7] = ((byte) ((int) local2_life109));
    javax.crypto.Cipher __sourceSpill265_111 = local0_life99;
    byte[] local4_life113 = ((javax.crypto.Cipher)(__sourceSpill265_111)).doFinal(((byte[])(__sourceSpill265_110)));
    P = ((long)((((((((((((long) (local4_life113)[0]) & 255L) << 56) | ((((long) (local4_life113)[1]) & 255L) << 48)) | ((((long) (local4_life113)[2]) & 255L) << 40)) | ((((long) (local4_life113)[3]) & 255L) << 32)) | ((((long) (local4_life113)[4]) & 255L) << 24)) | ((((long) (local4_life113)[5]) & 255L) << 16)) | ((((long) (local4_life113)[6]) & 255L) << 8)) | (((long) (local4_life113)[7]) & 255L))));
    java.lang.String[] __sourceSpill265_117 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_115(29048, (7930214708695427665L ^ local25_life6))];
    (__sourceSpill265_117)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_116(3473, (3405301599009405629L ^ local25_life6));
    (__sourceSpill265_117)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_118(32577, (3755963765692860494L ^ local25_life6));
    (__sourceSpill265_117)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_119(24420, (5594899066923919472L ^ local25_life6));
    (__sourceSpill265_117)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_120(8891, (4128084386445186475L ^ local25_life6));
    (__sourceSpill265_117)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_121(7273, (6972497110502239060L ^ local25_life6));
    (__sourceSpill265_117)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_122(19669, (6158130846051417058L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_123(15442, (7048702152679991162L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_124(32234, (6391956377389009588L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_125(15813, (3050330723861997296L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_126(19224, (7035416454300089361L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_127(24992, (5213444623776381581L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_128(8478, (8641573313926026814L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_129(14847, (1600823570273739517L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_130(24320, (7080539019598473233L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_131(900, (2343528141655251125L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_132(21207, (53658468678968797L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_133(22115, (2066677145450040659L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_134(20631, (6648244447522695062L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_135(32372, (2306535107834864991L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_136(5957, (1091048477054951496L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_137(32560, (7628282003164161026L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_138(17243, (4378390956042630258L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_139(29725, (5399275371575832370L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_140(24171, (5406394515922856317L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_141(19883, (5735548063603086996L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_142(3608, (1834380318240635151L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_143(21681, (1803581783478685595L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_144(31682, (5690436165127965893L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_145(27093, (4487848269600387801L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_146(17248, (3087408533530817663L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_147(8032, (3971564255499551813L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_148(3560, (4865581205321284316L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_149(31900, (4717757663427356581L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_150(22508, (8690457552535986386L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_151(18220, (8495062725915466767L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_152(11862, (3494903557102033253L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_153(32654, (7271313265265370255L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_154(13830, (5188166050526052610L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_155(9095, (4475186730935466175L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_156(22310, (4285210041687089160L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_157(20977, (7901725318638881535L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_158(24915, (5939544192302487146L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_159(18349, (8126012146528869556L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_160(15246, (9160007267335457983L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_161(20336, (1238052167378883668L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_162(26827, (4563655144296521694L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_163(2398, (1366987885938020965L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_164(10803, (6233042876585270552L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_165(29762, (5167362037450829639L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_166(16551, (8348456857394362258L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_167(9675, (5164585968666033857L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_168(9222, (3560698655728063240L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_169(20933, (5521323059459115755L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_170(30753, (5857403850632564499L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_171(5038, (9037560298625271961L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_172(31168, (280640702229516002L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_173(26492, (3682162826812390492L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_174(14602, (7111386888529366581L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_175(21652, (8691015349175472029L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_176(11323, (2318580659981703984L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_177(7215, (4156620266874439468L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_178(8374, (7961481183261349806L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_179(10325, (3645036012830831476L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_180(6832, (1573461122862247315L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_181(29689, (1938298037145364722L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_182(29691, (2766722993190274266L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_183(8824, (4901284042121525570L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_184(31860, (217641160574339881L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_185(28539, (5052844958308332621L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_186(19068, (3704170339960307020L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_187(25637, (1509736680030207781L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_188(11062, (4302236949356600364L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_189(20732, (6448319697153838031L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_190(2721, (2423469517699087758L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_191(2515, (4020160244439061207L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_192(28164, (7423100434727311645L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_193(26666, (3977967965742101254L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_194(3167, (7968195936048806759L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_195(9678, (7333917552090103489L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_196(8135, (2369517684534569163L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_197(18962, (1229508018450878730L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_198(3177, (5270853471097158506L ^ local25_life6));
    (__sourceSpill265_117)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_199(27554, (3825074093279834245L ^ local25_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_200(16030, (1698471820616354233L ^ local25_life6));
    s = ((java.lang.String[])(__sourceSpill265_117));
    java.lang.String[] __sourceSpill265_203 = new java.lang.String[1];
    (__sourceSpill265_203)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_202(906, (5165299467428623534L ^ local25_life6));
    t = ((java.lang.String[])(__sourceSpill265_203));
}

private static native <E extends Throwable> void __sourceConstructorInit_e2bdae614375c9e6_0(com.moon.module.impl.ChestStealer a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

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
        byte[] spill1061_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1061_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1061_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1061_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1061_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1061_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3451);
    if (((com.moon.module.impl.ChestStealer.K)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.ChestStealer.L)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.ChestStealer.L)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lD", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.ChestStealer.J)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.ChestStealer.K)[life5_8] = com.moon.module.impl.ChestStealer.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.ChestStealer.K)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.ChestStealer.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2425_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24910;
      if (N[var3] == null) {
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
         long var5 = M[var3];
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
         Object[] var9 = (Object[])O.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               O.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         N[var3] = var15;
      }

      return N[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.ChestStealer.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2426_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
com.moon.module.impl.ChestStealer forestValue123_16_0;
    int forestValue123_66_0;
    int forestValue123_83_0;
    int forestValue123_133_0;
    int forestValue123_138_0;
    int forestValue123_160_0;
    int forestValue123_170_0;
    int forestValue123_205_0;
    int forestValue123_213_0;
    int forestValue123_224_0;
    int forestValue123_226_0;
    int forestValue123_267_0;
    int forestValue123_287_0;
    int forestValue123_295_0;
    int forestValue123_318_0;
    int forestValue123_331_0;
    int forestValue123_339_0;
    int forestValue123_362_0;
    int forestValue123_376_0;
    com.moon.module.impl.ChestStealer spill123_0;
    boolean spill123_1;
    boolean spill123_2;
    int spill123_3;
    boolean spill123_4;
    boolean spill123_5;
    boolean spill123_6;
    int spill123_7;
    int spill123_8;
    int spill123_9;
    boolean spill123_10;
    boolean spill123_11;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.client.gui.GuiScreen life6_34;
    moom.hn life5_43;
    java.lang.String life6_83;
    java.lang.String[] life7_85;
    int life8_88;
    int life9_90;
    java.lang.String life10_97;
    java.lang.String[] life11_99;
    int life12_102;
    int life13_106;
    java.lang.String life14_113;
    int life6_187;
    java.util.LinkedList life7_191;
    int life8_193;
    int life8_250;
    int life9_256;
    moom.v8 life10_259;
    int life11_261;
    java.util.Iterator life12_264;
    int life13_272;
    moom.wB life14_276;
    forest_join_380: {
    forest_join_376: {
    forest_join_375: {
    forest_join_226: {
    forest_join_225: {
    forest_join_224: {
    forest_join_213: {
    forest_join_205: {
    forest_join_200: {
    forest_join_190: {
    forest_join_170: {
    forest_join_162: {
    forest_join_161: {
    forest_join_160: {
    forest_join_138: {
    forest_join_133: {
    forest_join_126: {
    forest_join_125: {
    forest_join_66: {
    forest_join_61: {
    forest_join_46: {
    forest_join_45: {
    forest_join_42: {
    forest_join_29: {
    forest_join_16: {
    life2_3 = (com.moon.module.impl.ChestStealer.I ^ 125070603397092L);
    life4_5 = com.moon.bF.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forest_join_380;
    }
    spill123_0 = this;
    if (!((life4_5 != null))) {
        forestValue123_16_0 = spill123_0;
        break forest_join_16;
    }
    if (!((((com.moon.module.impl.ChestStealer)(spill123_0)).F == null))) {
        break forest_join_29;
    }
    forestValue123_16_0 = this;
    }
    ((com.moon.module.impl.ChestStealer)(forestValue123_16_0)).F = ((com.moon.nH)(new com.moon.nH(((com.moon.module.impl.InventoryManager)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.String)(__sourceIntrinsic_9f71572286bb_invokedynamic123_7(588, (7176261379280146052L ^ life2_3))))))))));
    }
    life6_34 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.ChestStealer.d)).P;
    if (!((life4_5 != null))) {
        break forest_join_45;
    }
    if (!((((life6_34 instanceof moom.hn) ? 1 : 0) != 0))) {
        break forest_join_42;
    }
    life5_43 = ((moom.hn)(life6_34));
    if (!((life4_5 == null))) {
        break forest_join_46;
    }
    }
    ((com.moon.nW)(this.E)).a__Void();
    }
    return;
    }
    spill123_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.A)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue123_66_0 = ((spill123_1) ? 1 : 0);
        break forest_join_66;
    }
    if (!((!spill123_1))) {
        break forest_join_61;
    }
    spill123_2 = ((net.minecraft.inventory.IInventory)(((moom.hn)(life5_43)).aa)).e__Boolean();
    if (!((life4_5 != null))) {
        forestValue123_66_0 = ((spill123_2) ? 1 : 0);
        break forest_join_66;
    }
    if (!(spill123_2)) {
        break forest_join_61;
    }
    return;
    }
    forestValue123_66_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.z)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_133_0 = forestValue123_66_0;
        break forest_join_133;
    }
    if (!((forestValue123_66_0 == 0))) {
        break forest_join_126;
    }
    life6_83 = ((java.lang.String)(((net.minecraft.util.IChatComponent)(((net.minecraft.inventory.IInventory)(((moom.hn)(life5_43)).ab)).a__C5())).b())).toLowerCase();
    life7_85 = com.moon.module.impl.ChestStealer.s;
    life8_88 = (life7_85).length;
    life9_90 = 0;
    forest_cycle_82: while (true) {
    forest_join_121: {
    forestValue123_83_0 = life9_90;
    forest_cycle_83: while (true) {
    if (!((forestValue123_83_0 < life8_88))) {
        break forest_join_126;
    }
    life10_97 = (life7_85)[life9_90];
    life11_99 = com.moon.module.impl.ChestStealer.t;
    life12_102 = (life11_99).length;
    spill123_3 = 0;
    if (!((life4_5 != null))) {
        forestValue123_133_0 = spill123_3;
        break forest_join_133;
    }
    life13_106 = spill123_3;
    forest_cycle_98: while (true) {
    forest_join_119: {
    forest_join_118: {
    if (!((life13_106 < life12_102))) {
        break forest_join_121;
    }
    life14_113 = (life11_99)[life13_106];
    if (!((life4_5 != null))) {
        break forest_join_119;
    }
    spill123_4 = ((java.lang.String)(life6_83)).contains(((java.lang.CharSequence)(life10_97)));
    if (!((life4_5 != null))) {
        forestValue123_83_0 = ((spill123_4) ? 1 : 0);
        continue forest_cycle_83;
    }
    if (!(spill123_4)) {
        break forest_join_118;
    }
    if (!((!((java.lang.String)(life6_83)).contains(((java.lang.CharSequence)(life14_113)))))) {
        break forest_join_118;
    }
    break forest_join_125;
    }
    life13_106 += 1;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_98;
    }
    break forest_cycle_98;
    }
    break forest_cycle_83;
    }
    }
    life9_90 += 1;
    if (!((life4_5 == null))) {
        continue forest_cycle_82;
    }
    break forest_cycle_82;
    }
    break forest_join_126;
    }
    return;
    }
    forestValue123_133_0 = ((((com.moon.nW)(this.E)).a(((long)((this.G - com.moon.module.impl.ChestStealer.P))))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_138_0 = forestValue123_133_0;
        break forest_join_138;
    }
    if (!((forestValue123_133_0 != 0))) {
        break forest_join_380;
    }
    forestValue123_138_0 = ((this.H) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_170_0 = forestValue123_138_0;
        break forest_join_170;
    }
    if (!((forestValue123_138_0 != 0))) {
        break forest_join_162;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ChestStealer.d)).K)).Q();
    this.H = ((boolean)(false));
    spill123_5 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue123_160_0 = ((spill123_5) ? 1 : 0);
        break forest_join_160;
    }
    if (!(spill123_5)) {
        break forest_join_161;
    }
    forestValue123_160_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.y)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue123_160_0 == 0))) {
        break forest_join_161;
    }
    }
    return;
    }
    forestValue123_170_0 = (((moom.hn)(life5_43)).a() * __sourceIntrinsic_9f71572286bb_invokedynamic123_61(23368, (2871415796754561970L ^ life2_3)));
    }
    life6_187 = forestValue123_170_0;
    life7_191 = new java.util.LinkedList();
    life8_193 = 0;
    forest_cycle_177: while (true) {
    if (!((life8_193 < life6_187))) {
        break forest_join_190;
    }
    ((java.util.LinkedList)(life7_191)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life8_193))))));
    life8_193 += 1;
    if (!((life4_5 != null))) {
        break forest_join_200;
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_177;
    }
    break forest_cycle_177;
    }
    }
    spill123_6 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.v)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forestValue123_205_0 = ((spill123_6) ? 1 : 0);
        break forest_join_205;
    }
    if (!(spill123_6)) {
        break forest_join_200;
    }
    java.util.Collections.shuffle(((java.util.List)(life7_191)));
    }
    forestValue123_205_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_213_0 = forestValue123_205_0;
        break forest_join_213;
    }
    if (!((forestValue123_205_0 != 0))) {
        break forest_join_225;
    }
    forestValue123_213_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.D)).getValue())))).intValue();
    }
    if (!((life4_5 != null))) {
        forestValue123_224_0 = forestValue123_213_0;
        break forest_join_224;
    }
    if (!((forestValue123_213_0 >= com.moon.nI.a(((int)(0)), ((int)(__sourceIntrinsic_9f71572286bb_invokedynamic123_79(8216, (1134944156372091084L ^ life2_3)))))))) {
        break forest_join_225;
    }
    forestValue123_224_0 = 1;
    }
    forestValue123_226_0 = forestValue123_224_0;
    break forest_join_226;
    }
    forestValue123_226_0 = 0;
    }
    life8_250 = forestValue123_226_0;
    life9_256 = com.moon.nI.a(((int)(0)), ((int)((life6_187 - 1))));
    life10_259 = ((moom.hn)(life5_43)).z;
    life11_261 = 0;
    life12_264 = ((java.util.LinkedList)(life7_191)).iterator();
    forest_cycle_241: while (true) {
    forest_join_373: {
    forest_join_362: {
    forest_join_349: {
    forest_join_339: {
    forest_join_331: {
    forest_join_329: {
    forest_join_318: {
    forest_join_305: {
    forest_join_295: {
    forest_join_290: {
    forest_join_287: {
    forest_join_267: {
    if (!(((java.util.Iterator)(life12_264)).hasNext())) {
        break forest_join_375;
    }
    life13_272 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Iterator)(life12_264)).next())))).intValue();
    life14_276 = ((moom.v8)(life10_259)).a__wB(((int)(life13_272)));
    spill123_7 = life8_250;
    if (!((life4_5 != null))) {
        forestValue123_376_0 = spill123_7;
        break forest_join_376;
    }
    if (!((life4_5 != null))) {
        forestValue123_331_0 = spill123_7;
        break forest_join_331;
    }
    if (!((spill123_7 != 0))) {
        break forest_join_329;
    }
    spill123_8 = life9_256;
    if (!((life4_5 != null))) {
        forestValue123_267_0 = spill123_8;
        break forest_join_267;
    }
    if (!((spill123_8 == ((moom.wB)(life14_276)).c))) {
        break forest_join_373;
    }
    forestValue123_267_0 = ((((moom.wB)(life14_276)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_295_0 = forestValue123_267_0;
        break forest_join_295;
    }
    if (!((forestValue123_267_0 != 0))) {
        break forest_join_290;
    }
    life11_261 = 1;
    spill123_9 = (((java.util.LinkedList)(life7_191)).size() - 1);
    if (!((life4_5 != null))) {
        forestValue123_287_0 = spill123_9;
        break forest_join_287;
    }
    if (!((spill123_9 > life13_272))) {
        break forest_join_373;
    }
    forestValue123_287_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.LinkedList)(life7_191)).get(((int)((life13_272 + 1)))))))).intValue();
    }
    life9_256 = forestValue123_287_0;
    if (!((life4_5 == null))) {
        break forest_join_373;
    }
    }
    forestValue123_295_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_318_0 = forestValue123_295_0;
        break forest_join_318;
    }
    if (!((forestValue123_295_0 != 0))) {
        break forest_join_305;
    }
    spill123_10 = ((com.moon.nH)(this.F)).a(((moom.wB)(life14_276)));
    if (!((life4_5 != null))) {
        forestValue123_318_0 = ((spill123_10) ? 1 : 0);
        break forest_join_318;
    }
    if (!((!spill123_10))) {
        break forest_join_373;
    }
    }
    ((com.moon.module.impl.ChestStealer)(this)).a(((int)(((moom.v8)(life10_259)).c)), ((int)(((moom.wB)(life14_276)).c)));
    life11_261 = 1;
    forestValue123_318_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue();
    }
    if (!((life4_5 != null))) {
        forestValue123_376_0 = forestValue123_318_0;
        break forest_join_376;
    }
    if (!((forestValue123_318_0 == 0))) {
        break forest_join_375;
    }
    if (!((((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.C)).getValue())))).intValue() != 0))) {
        break forest_join_373;
    }
    if (!((life4_5 == null))) {
        break forest_join_375;
    }
    }
    forestValue123_331_0 = ((((moom.wB)(life14_276)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_339_0 = forestValue123_331_0;
        break forest_join_339;
    }
    if (!((forestValue123_331_0 != 0))) {
        break forest_join_373;
    }
    forestValue123_339_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue123_362_0 = forestValue123_339_0;
        break forest_join_362;
    }
    if (!((forestValue123_339_0 != 0))) {
        break forest_join_349;
    }
    spill123_11 = ((com.moon.nH)(this.F)).a(((moom.wB)(life14_276)));
    if (!((life4_5 != null))) {
        forestValue123_362_0 = ((spill123_11) ? 1 : 0);
        break forest_join_362;
    }
    if (!((!spill123_11))) {
        break forest_join_373;
    }
    }
    ((com.moon.module.impl.ChestStealer)(this)).a(((int)(((moom.v8)(life10_259)).c)), ((int)(((moom.wB)(life14_276)).c)));
    life11_261 = 1;
    forestValue123_362_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue();
    }
    if (!((life4_5 != null))) {
        forestValue123_376_0 = forestValue123_362_0;
        break forest_join_376;
    }
    if (!((forestValue123_362_0 == 0))) {
        break forest_join_375;
    }
    if (!((((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.C)).getValue())))).intValue() != 0))) {
        break forest_join_373;
    }
    if (!((life4_5 == null))) {
        break forest_join_375;
    }
    }
    if (!((life4_5 == null))) {
        continue forest_cycle_241;
    }
    break forest_cycle_241;
    }
    }
    forestValue123_376_0 = life11_261;
    }
    if (!((forestValue123_376_0 == 0))) {
        break forest_join_380;
    }
    this.H = ((boolean)(true));
    }
    return;
}


public void a(int p0, int p1) {
((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ChestStealer.d)).F)).a(((int)(p0)), ((int)(p1)), ((int)(0)), ((int)(1)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.ChestStealer.d)).K)));
    ((com.moon.nW)(this.E)).a__Void();
    this.G = ((long)(((com.moon.module.impl.ChestStealer)(this)).a()));
    return;
}


private long a() {
long local1 = (com.moon.module.impl.ChestStealer.I ^ 131051174365524L);
    int local3 = (com.moon.nI.a(((int)(0)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.C)).getValue())))).intValue()))) + __sourceIntrinsic_d3e4e16d7952_originalDynamicSite518_6(20688, (6000325626205806228L ^ local1)));
    local3 = (local3 - (local3 % __sourceIntrinsic_d3e4e16d7952_originalDynamicSite518_7(23080, (7620295134516221012L ^ local1))));
    return ((long) (((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue() + local3));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_115(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_118(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_119(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_120(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_121(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_122(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_123(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_124(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_125(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_126(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_127(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_128(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_129(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_130(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_131(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_132(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_133(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_134(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_135(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_136(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_137(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_138(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_139(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_140(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_141(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_143(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_144(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_145(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_146(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_147(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_148(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_149(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_150(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_151(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_152(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_153(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_154(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_155(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_156(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_157(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_158(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_159(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_160(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_161(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_162(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_163(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_164(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_165(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_166(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_167(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_168(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_169(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_171(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_172(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_173(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_174(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_175(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_176(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_177(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_178(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_179(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_180(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_181(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_182(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_183(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_184(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_185(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_186(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_187(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_188(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_189(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_190(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_191(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_192(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_193(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_194(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_195(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_196(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_197(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_198(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_199(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_200(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite265_202(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_48(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_78(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_83(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_92(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_97(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_104(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_e2bdae614375c9e6_originalDynamicSite3_112(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3e4e16d7952_originalDynamicSite518_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d3e4e16d7952_originalDynamicSite518_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9f71572286bb_invokedynamic123_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic123_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic123_79(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2425_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2426_0() throws E;
}
