package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pf extends net.minecraft.client.gui.GuiScreen {

public static com.moon.cD w;

private com.moon.pc x;

private com.moon.mz y;

private com.moon.mz z;

private com.moon.mz A;

private com.moon.mz B;

private boolean C;

private static long D;

private static java.lang.String[] E;

private static java.lang.String[] F;

private static java.util.Map G;

private static long[] H;

private static java.lang.Integer[] I;

private static java.util.Map J;

private static long[] K;

private static java.lang.Long[] L;

private static java.util.Map M;

public pf() {
super();
    this.C = false;
}


static {
D = ((long)(((moom._a)(moom._c.a(((long)(4292075014073327583L)), ((long)(4428744367763773620L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(44500843467080L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.pf.D ^ 9392365040565L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill372_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill372_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill372_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill372_14 = new byte[8];
    (__sourceSpill372_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill372_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation372_16 = __sourceSpill372_14;
    ((javax.crypto.Cipher)(__sourceSpill372_11)).init(((int)(__sourceSpill372_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill372_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation372_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[21];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "\017°¯ì\177ÜÉüÉI` oêÔ\n\005%£@­\013\f\004HÍÝûìF/-èÛ3ï g*xæ$óP47P÷dSôà{\005ë3t\000e<\005ÿ½ê¶C¢÷pòc°«h \rõ\024½Mö~ *«Ô$.Î'E\026}°v³\021-|6åó\003³^X#ïªø©\020)vøk$ÍVçý»¨C\005F\037 ¡m±ÐeìÊª^Ç\023X¸7\177__\020³Ñ\036ÜP\023ç CÇAët·¾±ªD\035ÿ\027$ð\raþ8*²ù¦î/=\fîÿ\030>ª\020}e\n\n\b:\026¢÷CÝ[v¬ÑoTäXÐ\026ÍdK\nõ[]f\0270ý\032Ç,¨N-8ÆÔ¿¦Á\033Â&Ú}v­ÂE Èøiår\030ù÷_ò\037\032n\004{jÒ.R³po6wÜÀÏZXf¡ÜêæÊtR9\027ÛQBÿ\bX®ñ\004\016¼c6r»i{\031²õ½}ö\002#mß]\r4`û¢É\024¯ú\004ü_MÜ¦\031FGV%#'|;^\031avº¾¬ë8®\bsX[\"\016\022þøP~H¸\024¯z\033\033U6T\003Ïì\030\013¥'y\f\034¡tÚ¾~ômí\031ã\020å(\t\f¿3µ¦qtÿ`^4'¸\005\020É\022ê=\033<X3»)t\000Ð µt6Ôz\025<â)¤w»ºD¸5\177\004Æ\005!\tÌ\013¶Ï4h}@\177\030zãèïYB|9\004B3Yíf\005ÄµÇ<ÿÞÜÞ\030]%Øn\tI©\022T Ûòñúl\023Zö]^Y\\éËú4 j¸Ö. >7å$þU£\023©çWñÑâ\002í¿}q\027Äh©ÏZGd\027\024­\0270Û÷è¦ãmy`Ro¬! g?R¢^Í6ú\000é¤c\007¹v]»_«Ü +¸\006&çí­m\020\r>zhYó`\013M¡Ý/È ór\013û°\030¦¹ßwÎ©ÿS¢«aÄÞH°d\023:×KæÞ@q3V§¥Åíç @¨\th´¹ìOW85:±6\023Nù\030òËõ\020mÀæÑÏlyÒDâ\026\023pé¬%jôÝ·\000\032Á©P<y2ª6\017d!AÜGbÛDØ¶Ú\"Xd¬¼¥n)vrË5\fWn§t'¯*\016&ü÷ó\036ípH|àý\007AS°±ú«|~\rÊòoº\025ª bPðüø?@Ú\021Xµ$ùÅkÝªÛë%û£\024·xæf|\b<fÉ\020\030G÷sw»Zr60íaOUbT}_îî$GußÝ¦"))).length();
    int local27_life24 = 24;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill372_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill372_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill372_29)).doFinal(((byte[])(__sourceSpill372_28)));
        java.lang.String __sourceSpill372_34 = ((java.lang.String)(com.moon.pf.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill372_35 = local31_life19;
        int __sourceSpill372_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill372_35)[__sourceSpill372_36] = __sourceSpill372_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "\023ñi0°\fn;A\022ÒÖÃ}bÃ\037ç{Ü\032B¨\037Qx\005Å\037ZÇ\026\fYüÞªõf¾BDQ÷\033ÕÏ½!ì\020¥²x\025\017üá¼¿ê¡9@vHÎ\025 ÿ\0334m¿0Ðüþ¯ÞÁ)\022%ló\bl¦±P\013Z\f-ljä`ÒÇ\"¡\003<VÃ¸'÷~9q© ¿W±z"))).length();
    local27_life24 = 72;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill372_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill372_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill372_42)).doFinal(((byte[])(__sourceSpill372_41)));
        java.lang.String __sourceSpill372_47 = ((java.lang.String)(com.moon.pf.a(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill372_48 = local31_life19;
        int __sourceSpill372_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill372_48)[__sourceSpill372_49] = __sourceSpill372_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    E = ((java.lang.String[])(local31_life19));
    F = ((java.lang.String[])(new java.lang.String[21]));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill372_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill372_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill372_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill372_60 = new byte[8];
    (__sourceSpill372_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill372_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation372_62 = __sourceSpill372_60;
    ((javax.crypto.Cipher)(__sourceSpill372_57)).init(((int)(__sourceSpill372_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill372_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation372_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[6];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "ÔJIð¶û\023¯Ikh\n7^æ_ÛªFFÚAÖL\nôý"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill372_71 = local15_life67;
        int __sourceSpill372_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill372_71)).substring(((int)(__sourceSpill372_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill372_76 = local17_life65;
        int __sourceSpill372_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill372_79 = new byte[8];
        (__sourceSpill372_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill372_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill372_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill372_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill372_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill372_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill372_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill372_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill372_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill372_80)).doFinal(((byte[])(__sourceSpill372_79)));
        (__sourceSpill372_76)[__sourceSpill372_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "Oïv\024Â*\025\177æ^HY«#"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill372_84 = local15_life67;
        int __sourceSpill372_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill372_84)).substring(((int)(__sourceSpill372_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill372_89 = local17_life65;
        int __sourceSpill372_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill372_92 = new byte[8];
        (__sourceSpill372_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill372_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill372_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill372_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill372_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill372_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill372_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill372_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill372_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill372_93)).doFinal(((byte[])(__sourceSpill372_92)));
        (__sourceSpill372_89)[__sourceSpill372_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    H = ((long[])(local17_life65));
    I = ((java.lang.Integer[])(new java.lang.Integer[6]));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill372_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill372_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill372_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill372_105 = new byte[8];
    (__sourceSpill372_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill372_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation372_107 = __sourceSpill372_105;
    ((javax.crypto.Cipher)(__sourceSpill372_102)).init(((int)(__sourceSpill372_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill372_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation372_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[3];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "?u÷P9lõö\007\"UáÀÃaÔµ\016ý"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill372_116 = local4_life112;
        int __sourceSpill372_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill372_116)).substring(((int)(__sourceSpill372_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill372_121 = local6_life110;
        int __sourceSpill372_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill372_124 = new byte[8];
        (__sourceSpill372_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill372_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill372_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill372_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill372_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill372_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill372_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill372_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill372_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill372_125)).doFinal(((byte[])(__sourceSpill372_124)));
        (__sourceSpill372_121)[__sourceSpill372_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    K = ((long[])(local6_life110));
    L = ((java.lang.Long[])(new java.lang.Long[3]));
    w = ((com.moon.cD)(new com.moon.cD()));
    ((com.moon.cD)(com.moon.pf.w)).a();
}

private static native <E extends Throwable> void __sourceHandlerCall_0719b0173eea0862c485(com.moon.pf a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_0719b0173eea0862c485 {

public static void f545(com.moon.pf receiver, int p0, int p1, float p2) throws Throwable {
    int forwardValue545_164_0;
    int forwardValue545_230_0;
    int forwardValue545_302_0;
    int forwardValue545_322_0;
    boolean spill545_0;
    boolean spill545_1;
    boolean spill545_2;
    int spill545_3;
    int spill545_4;
    int spill545_5;
    long life4_3;
    float life7_12;
    float life8_20;
    int life6_34;
    com.v life9_38;
    com.moon.hW life10_43;
    java.lang.String life11_88;
    com.moon.jm life12_93;
    com.moon.hW life13_100;
    java.lang.String life14_187;
    com.moon.pe life14_346;
    forward_join_323: {
    forward_join_322: {
    forward_join_321: {
    forward_join_302: {
    forward_join_295: {
    forward_join_230: {
    forward_join_202: {
    forward_join_164: {
    forward_join_162: {
    life4_3 = (__fieldRead545_0() ^ 68964540604781L);
    spill545_0 = __call545_1();
    life7_12 = ((((float) __fieldRead545_2(receiver)) / 0x1.0p1f) - 0x1.54p6f);
    life8_20 = ((((float) __fieldRead545_3(receiver)) / 0x1.0p1f) - 0x1.a4p6f);
    __call545_4();
    __call545_7(__invokedynamic545_5(6214, (5928698310231034879L ^ life4_3)), __invokedynamic545_6(22408, (3820849318655345712L ^ life4_3)));
    __call545_8();
    life6_34 = __integerCategory545_9(spill545_0);
    life9_38 = __call545_12(__call545_11(__call545_10()));
    life10_43 = __call545_16(__call545_15(__call545_13(), __fieldRead545_14()));
    __call545_23(life10_43, __call545_22(-0x1.0p0f, -0x1.0p0f, ((float) (__fieldRead545_18(__fieldRead545_17(receiver)) + 1)), ((float) (__fieldRead545_20(__fieldRead545_19(receiver)) + 1)), 0x0.0p0f, __call545_21(life9_38)));
    __call545_26(life10_43, __call545_25((life7_12 - 0x1.0p0f), (life8_20 - 0x1.0p0f), 0x1.58p7f, 0x1.4ap7f, 0x1.8p2f, __call545_24(life9_38)));
    __call545_27(life10_43);
    __call545_29(__fieldRead545_28(receiver));
    life11_88 = __invokedynamic545_30(26911, (3178666417074077841L ^ life4_3));
    life12_93 = __call545_34(__call545_32(__call545_31()), __fieldRead545_33());
    life13_100 = __call545_39(__call545_38(__call545_37(__call545_35(), __fieldRead545_36()), life12_93));
    __call545_41(life12_93, life13_100, life11_88, 0x1.8p3f, (life7_12 + 0x1.8p2f), (life8_20 + 0x1.0p2f), __call545_40(life9_38), 1);
    spill545_1 = __call545_44(__call545_43(__fieldRead545_42(receiver)));
    if (!((life6_34 == 0))) {
        forwardValue545_164_0 = __integerCategory545_45(spill545_1);
        break forward_join_164;
    }
    if (!(spill545_1)) {
        break forward_join_162;
    }
    spill545_2 = __call545_47(__fieldRead545_46(receiver));
    if (!((life6_34 == 0))) {
        forwardValue545_164_0 = __integerCategory545_48(spill545_2);
        break forward_join_164;
    }
    if (!((!spill545_2))) {
        break forward_join_162;
    }
    __call545_58(life12_93, life13_100, __invokedynamic545_49(21643, (5689647845942607112L ^ life4_3)), 0x1.2p3f, (__fieldRead545_51(__fieldRead545_50(receiver)) + 0x1.0p2f), (((__fieldRead545_53(__fieldRead545_52(receiver)) + (((float) __fieldRead545_55(__fieldRead545_54(receiver))) / 0x1.0p1f)) - (__call545_56(life12_93, 0x1.2p3f) / 0x1.0p1f)) + 0x1.0p-1f), __call545_57(life9_38));
    }
    forwardValue545_164_0 = __integerCategory545_60(__fieldRead545_59(receiver));
    }
    if (!((life6_34 == 0))) {
        forwardValue545_230_0 = forwardValue545_164_0;
        break forward_join_230;
    }
    if (!((forwardValue545_164_0 != 0))) {
        break forward_join_202;
    }
    life14_187 = __invokedynamic545_61(23440, (5928645240227672581L ^ life4_3));
    __call545_69(life12_93, life13_100, life14_187, 0x1.0p3f, ((((float) __fieldRead545_62(receiver)) / 0x1.0p1f) - (__call545_63(life12_93, life14_187, 0x1.0p3f) / 0x1.0p1f)), ((__fieldRead545_65(__fieldRead545_64(receiver)) + ((float) __fieldRead545_67(__fieldRead545_66(receiver)))) + 0x1.0p2f), __call545_68(life9_38));
    }
    __call545_70(life13_100);
    __call545_72(__fieldRead545_71(receiver), p0, p1);
    __call545_74(__fieldRead545_73(receiver), p0, p1);
    __call545_76(__fieldRead545_75(receiver), p0, p1);
    __call545_78(__fieldRead545_77(receiver), p0, p1);
    forwardValue545_230_0 = __numericCompare545_81(((float) p0), __call545_80(__fieldRead545_79(receiver)));
    }
    if (!((life6_34 == 0))) {
        forwardValue545_302_0 = forwardValue545_230_0;
        break forward_join_302;
    }
    if (!((forwardValue545_230_0 > 0))) {
        break forward_join_295;
    }
    spill545_3 = __numericCompare545_84(((float) p1), __call545_83(__fieldRead545_82(receiver)));
    if (!((life6_34 == 0))) {
        forwardValue545_302_0 = spill545_3;
        break forward_join_302;
    }
    if (!((spill545_3 > 0))) {
        break forward_join_295;
    }
    spill545_4 = __numericCompare545_89(((float) p0), (__call545_86(__fieldRead545_85(receiver)) + __call545_88(__fieldRead545_87(receiver))));
    if (!((life6_34 == 0))) {
        forwardValue545_302_0 = spill545_4;
        break forward_join_302;
    }
    if (!((spill545_4 < 0))) {
        break forward_join_295;
    }
    spill545_5 = __numericCompare545_94(((float) p1), (__call545_91(__fieldRead545_90(receiver)) + __call545_93(__fieldRead545_92(receiver))));
    if (!((life6_34 == 0))) {
        forwardValue545_302_0 = spill545_5;
        break forward_join_302;
    }
    if (!((spill545_5 < 0))) {
        break forward_join_295;
    }
    __call545_100(receiver, __call545_99(__invokedynamic545_95(7200, (4965395350593009075L ^ life4_3)), "", __invokedynamic545_96(7223, (4762490474151933368L ^ life4_3)), __invokedynamic545_97(9083, (8294679316106038000L ^ life4_3)), "", __invokedynamic545_98(25545, (48403158496709215L ^ life4_3))), p0, p1);
    }
    __call545_101(receiver, p0, p1, p2);
    __call545_102();
    forwardValue545_302_0 = 1;
    }
    __call545_103(forwardValue545_302_0, 0);
    __call545_104();
    life14_346 = __call545_106(__call545_105());
    __call545_108(__call545_107(life14_346));
    __call545_110(__call545_109(life14_346));
    __call545_111();
    if (!((__call545_112() != null))) {
        break forward_join_323;
    }
    if (!((life6_34 != 0))) {
        break forward_join_321;
    }
    forwardValue545_322_0 = 0;
    break forward_join_322;
    }
    forwardValue545_322_0 = 1;
    }
    __call545_113(forwardValue545_322_0);
    }
    return;
}
public static void h545_0(moom.Oo p0) throws Throwable {
    throw __call1054500_0(p0);
}
public static void h545_1(moom.Oo p0) throws Throwable {
    throw __call1054501_0(p0);
}
public static void h545_2(moom.Oo p0) throws Throwable {
    throw __call1054502_0(p0);
}
public static void h545_3(moom.Oo p0) throws Throwable {
    throw __call1054503_0(p0);
}
public static void h545_4(moom.Oo p0) throws Throwable {
    throw __call1054504_0(p0);
}
public static void h545_5(moom.Oo p0) throws Throwable {
    throw __call1054505_0(p0);
}
public static void h545_6(moom.Oo p0) throws Throwable {
    throw __call1054506_0(p0);
}
public static void h545_7(moom.Oo p0) throws Throwable {
    throw __call1054507_0(p0);
}
public static void h545_8(moom.Oo p0) throws Throwable {
    throw __call1054508_0(p0);
}
public static void h545_9(moom.Oo p0) throws Throwable {
    throw __call1054509_0(p0);
}
public static void h545_10(moom.Oo p0) throws Throwable {
    throw __call1054510_0(p0);
}
public static void h545_11(moom.Oo p0) throws Throwable {
    throw __call1054511_0(p0);
}
public static void h545_12(moom.Oo p0) throws Throwable {
    throw __call1054512_0(p0);
}
public static void h545_13(moom.Oo p0) throws Throwable {
    throw __call1054513_0(p0);
}
public static void h545_14(moom.Oo p0) throws Throwable {
    throw __call1054514_0(p0);
}
private static native long __fieldRead545_0() throws Throwable;
private static native boolean __call545_1() throws Throwable;
private static native int __fieldRead545_2(com.moon.pf a0) throws Throwable;
private static native int __fieldRead545_3(com.moon.pf a0) throws Throwable;
private static native void __call545_4() throws Throwable;
private static native int __invokedynamic545_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic545_6(int a0, long a1) throws Throwable;
private static native void __call545_7(int a0, int a1) throws Throwable;
private static native void __call545_8() throws Throwable;
private static native int __integerCategory545_9(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call545_10() throws Throwable;
private static native com.moon.cs __call545_11(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.v __call545_12(com.moon.cs a0) throws Throwable;
private static native com.moon.hX __call545_13() throws Throwable;
private static native com.moon.cb __fieldRead545_14() throws Throwable;
private static native com.moon.hX __call545_15(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call545_16(com.moon.hX a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead545_17(com.moon.pf a0) throws Throwable;
private static native int __fieldRead545_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead545_19(com.moon.pf a0) throws Throwable;
private static native int __fieldRead545_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call545_21(com.v a0) throws Throwable;
private static native com.moon.i3 __call545_22(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call545_23(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native int __call545_24(com.v a0) throws Throwable;
private static native com.moon.i3 __call545_25(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call545_26(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call545_27(com.moon.hW a0) throws Throwable;
private static native com.moon.pc __fieldRead545_28(com.moon.pf a0) throws Throwable;
private static native void __call545_29(com.moon.pc a0) throws Throwable;
private static native java.lang.String __invokedynamic545_30(int a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call545_31() throws Throwable;
private static native com.moon.jo __call545_32(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead545_33() throws Throwable;
private static native com.moon.jm __call545_34(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native com.moon.hX __call545_35() throws Throwable;
private static native com.moon.cb __fieldRead545_36() throws Throwable;
private static native com.moon.hX __call545_37(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call545_38(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call545_39(com.moon.hX a0) throws Throwable;
private static native int __call545_40(com.v a0) throws Throwable;
private static native void __call545_41(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native com.moon.pc __fieldRead545_42(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call545_43(com.moon.pc a0) throws Throwable;
private static native boolean __call545_44(java.lang.String a0) throws Throwable;
private static native int __integerCategory545_45(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead545_46(com.moon.pf a0) throws Throwable;
private static native boolean __call545_47(com.moon.pc a0) throws Throwable;
private static native int __integerCategory545_48(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic545_49(int a0, long a1) throws Throwable;
private static native com.moon.pc __fieldRead545_50(com.moon.pf a0) throws Throwable;
private static native float __fieldRead545_51(com.moon.pc a0) throws Throwable;
private static native com.moon.pc __fieldRead545_52(com.moon.pf a0) throws Throwable;
private static native float __fieldRead545_53(com.moon.pc a0) throws Throwable;
private static native com.moon.pc __fieldRead545_54(com.moon.pf a0) throws Throwable;
private static native int __fieldRead545_55(com.moon.pc a0) throws Throwable;
private static native float __call545_56(com.moon.jm a0, float a1) throws Throwable;
private static native int __call545_57(com.v a0) throws Throwable;
private static native void __call545_58(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native boolean __fieldRead545_59(com.moon.pf a0) throws Throwable;
private static native int __integerCategory545_60(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic545_61(int a0, long a1) throws Throwable;
private static native int __fieldRead545_62(com.moon.pf a0) throws Throwable;
private static native float __call545_63(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native com.moon.pc __fieldRead545_64(com.moon.pf a0) throws Throwable;
private static native float __fieldRead545_65(com.moon.pc a0) throws Throwable;
private static native com.moon.pc __fieldRead545_66(com.moon.pf a0) throws Throwable;
private static native int __fieldRead545_67(com.moon.pc a0) throws Throwable;
private static native int __call545_68(com.v a0) throws Throwable;
private static native void __call545_69(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call545_70(com.moon.hW a0) throws Throwable;
private static native com.moon.mz __fieldRead545_71(com.moon.pf a0) throws Throwable;
private static native void __call545_72(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead545_73(com.moon.pf a0) throws Throwable;
private static native void __call545_74(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead545_75(com.moon.pf a0) throws Throwable;
private static native void __call545_76(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead545_77(com.moon.pf a0) throws Throwable;
private static native void __call545_78(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead545_79(com.moon.pf a0) throws Throwable;
private static native float __call545_80(com.moon.mz a0) throws Throwable;
private static native int __numericCompare545_81(float a0, float a1) throws Throwable;
private static native com.moon.mz __fieldRead545_82(com.moon.pf a0) throws Throwable;
private static native float __call545_83(com.moon.mz a0) throws Throwable;
private static native int __numericCompare545_84(float a0, float a1) throws Throwable;
private static native com.moon.mz __fieldRead545_85(com.moon.pf a0) throws Throwable;
private static native float __call545_86(com.moon.mz a0) throws Throwable;
private static native com.moon.mz __fieldRead545_87(com.moon.pf a0) throws Throwable;
private static native float __call545_88(com.moon.mz a0) throws Throwable;
private static native int __numericCompare545_89(float a0, float a1) throws Throwable;
private static native com.moon.mz __fieldRead545_90(com.moon.pf a0) throws Throwable;
private static native float __call545_91(com.moon.mz a0) throws Throwable;
private static native com.moon.mz __fieldRead545_92(com.moon.pf a0) throws Throwable;
private static native float __call545_93(com.moon.mz a0) throws Throwable;
private static native int __numericCompare545_94(float a0, float a1) throws Throwable;
private static native java.lang.String __invokedynamic545_95(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic545_96(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic545_97(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic545_98(int a0, long a1) throws Throwable;
private static native java.util.List __call545_99(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native void __call545_100(com.moon.pf a0, java.util.List a1, int a2, int a3) throws Throwable;
private static native void __call545_101(com.moon.pf a0, int a1, int a2, float a3) throws Throwable;
private static native void __call545_102() throws Throwable;
private static native void __call545_103(int a0, int a1) throws Throwable;
private static native void __call545_104() throws Throwable;
private static native com.moon.runtime.ClientContext __call545_105() throws Throwable;
private static native com.moon.pe __call545_106(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.gW __call545_107(com.moon.pe a0) throws Throwable;
private static native void __call545_108(com.moon.gW a0) throws Throwable;
private static native com.moon.gW __call545_109(com.moon.pe a0) throws Throwable;
private static native void __call545_110(com.moon.gW a0) throws Throwable;
private static native void __call545_111() throws Throwable;
private static native java.lang.String[] __call545_112() throws Throwable;
private static native void __call545_113(int a0) throws Throwable;
private static native java.lang.Exception __call1054500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054514_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5da9f0ed5d2ed641e3bc(com.moon.pf a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_5da9f0ed5d2ed641e3bc {

public static void f52(com.moon.pf receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue52_51_0;
    java.lang.String forwardValue52_65_0;
    int forwardValue52_116_0;
    int forwardValue52_133_0;
    com.moon.pf forwardValue52_140_0;
    boolean spill52_0;
    boolean spill52_1;
    java.lang.String spill52_2;
    com.moon.hD spill52_3;
    com.moon.hB spill52_4;
    com.moon.pf spill52_5;
    long life4_3;
    int life6_11;
    java.awt.FileDialog life7_40;
    com.moon.cq life7_86;
    forward_join_140: {
    forward_join_139: {
    forward_join_133: {
    forward_join_125: {
    forward_join_116: {
    forward_join_110: {
    forward_join_65: {
    forward_join_62: {
    forward_join_51: {
    forward_join_45: {
    forward_join_26: {
    life4_3 = (__fieldRead52_0() ^ 91969519942257L);
    spill52_0 = __call52_1();
    __call52_3(__fieldRead52_2(receiver), p0, p1, p2);
    life6_11 = __integerCategory52_4(spill52_0);
    spill52_1 = __call52_6(__fieldRead52_5(receiver), p0, p1, p2);
    if (!((life6_11 != 0))) {
        forwardValue52_51_0 = __integerCategory52_7(spill52_1);
        break forward_join_51;
    }
    if (!(spill52_1)) {
        break forward_join_45;
    }
    if (!(__call52_8())) {
        break forward_join_26;
    }
    __call52_10(__fieldRead52_9(receiver));
    }
    life7_40 = new java.awt.FileDialog(__cast52_11(null));
    __call52_12(life7_40, 1);
    __call52_13(life7_40, new com.moon.cA(receiver, life7_40));
    __call52_14(life7_40, 1);
    }
    forwardValue52_51_0 = __integerCategory52_17(__call52_16(__fieldRead52_15(receiver), p0, p1, p2));
    }
    if (!((life6_11 != 0))) {
        forwardValue52_116_0 = forwardValue52_51_0;
        break forward_join_116;
    }
    if (!((forwardValue52_51_0 != 0))) {
        break forward_join_110;
    }
    spill52_2 = __call52_19(__fieldRead52_18(receiver));
    if (!((life6_11 != 0))) {
        forwardValue52_65_0 = spill52_2;
        break forward_join_65;
    }
    if (!(__call52_20(spill52_2))) {
        break forward_join_62;
    }
    return;
    }
    forwardValue52_65_0 = __call52_22(__fieldRead52_21(receiver));
    }
    life7_86 = __call52_23(forwardValue52_65_0);
    __call52_26(__call52_25(__call52_24()), life7_86);
    __call52_28(__call52_27(), life7_86);
    __call52_32(__fieldRead52_29(receiver), __call52_31(__call52_30()));
    spill52_3 = __call52_34(__call52_33());
    spill52_4 = __call52_37(__call52_35(), __invokedynamic52_36(24995, (4936425049539842867L ^ life4_3)));
    java.lang.String __stackOp52_41_0 = __call52_39(__fieldRead52_38(receiver));
    java.lang.String __stackOp52_41_1 = __invokedynamic52_40(27022, (5887822979504052997L ^ life4_3));
    __call52_49(spill52_3, __call52_48(__call52_47(__call52_45(__call52_43(spill52_4, __invokedynamic52_42(__stackOp52_41_1, __stackOp52_41_0)), __fieldRead52_44()), __invokedynamic52_46(28292, (4545513086587230811L ^ life4_3)))));
    }
    forwardValue52_116_0 = __integerCategory52_52(__call52_51(__fieldRead52_50(receiver), p0, p1, p2));
    }
    if (!((life6_11 != 0))) {
        forwardValue52_133_0 = forwardValue52_116_0;
        break forward_join_133;
    }
    if (!((forwardValue52_116_0 != 0))) {
        break forward_join_125;
    }
    __call52_56(__call52_54(__call52_53()), __invokedynamic52_55(receiver));
    }
    spill52_5 = receiver;
    if (!((life6_11 != 0))) {
        forwardValue52_140_0 = spill52_5;
        break forward_join_140;
    }
    forwardValue52_133_0 = __integerCategory52_59(__call52_58(__fieldRead52_57(spill52_5), p0, p1, p2));
    }
    if (!((forwardValue52_133_0 != 0))) {
        break forward_join_139;
    }
    __call52_63(__fieldRead52_60(receiver), __call52_62(__call52_61()));
    }
    forwardValue52_140_0 = receiver;
    }
    __call52_64(forwardValue52_140_0, p0, p1, p2);
    return;
}
public static void h52_0(java.io.IOException p0) throws Throwable {
    throw __call1005200_0(p0);
}
public static void h52_1(java.io.IOException p0) throws Throwable {
    throw __call1005201_0(p0);
}
public static void h52_2(java.io.IOException p0) throws Throwable {
    throw __call1005202_0(p0);
}
public static void h52_3(java.io.IOException p0) throws Throwable {
    throw __call1005203_0(p0);
}
public static void h52_4(java.io.IOException p0) throws Throwable {
    throw __call1005204_0(p0);
}
public static void h52_5(java.io.IOException p0) throws Throwable {
    throw __call1005205_0(p0);
}
public static void h52_6(java.io.IOException p0) throws Throwable {
    throw __call1005206_0(p0);
}
public static void h52_7(java.io.IOException p0) throws Throwable {
    throw __call1005207_0(p0);
}
public static void h52_8(java.io.IOException p0) throws Throwable {
    throw __call1005208_0(p0);
}
public static void h52_9(java.io.IOException p0) throws Throwable {
    throw __call1005209_0(p0);
}
public static void h52_10(java.io.IOException p0) throws Throwable {
    throw __call1005210_0(p0);
}
private static native long __fieldRead52_0() throws Throwable;
private static native boolean __call52_1() throws Throwable;
private static native com.moon.pc __fieldRead52_2(com.moon.pf a0) throws Throwable;
private static native void __call52_3(com.moon.pc a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory52_4(boolean value) throws Throwable;
private static native com.moon.mz __fieldRead52_5(com.moon.pf a0) throws Throwable;
private static native boolean __call52_6(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory52_7(boolean value) throws Throwable;
private static native boolean __call52_8() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead52_9(com.moon.pf a0) throws Throwable;
private static native void __call52_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.awt.Frame __cast52_11(java.lang.Object a0) throws Throwable;
private static native void __call52_12(java.awt.FileDialog a0, int a1) throws Throwable;
private static native void __call52_13(java.awt.FileDialog a0, com.moon.cA a1) throws Throwable;
private static native void __call52_14(java.awt.FileDialog a0, int a1) throws Throwable;
private static native com.moon.mz __fieldRead52_15(com.moon.pf a0) throws Throwable;
private static native boolean __call52_16(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory52_17(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead52_18(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call52_19(com.moon.pc a0) throws Throwable;
private static native boolean __call52_20(java.lang.String a0) throws Throwable;
private static native com.moon.pc __fieldRead52_21(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call52_22(com.moon.pc a0) throws Throwable;
private static native com.moon.cq __call52_23(java.lang.String a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call52_24() throws Throwable;
private static native com.moon.cs __call52_25(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call52_26(com.moon.cs a0, com.moon.cq a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call52_27() throws Throwable;
private static native com.moon.runtime.ClientContext __call52_28(com.moon.runtime.ClientContext a0, com.moon.cq a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead52_29(com.moon.pf a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call52_30() throws Throwable;
private static native com.moon.pe __call52_31(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call52_32(net.minecraft.client.Minecraft a0, com.moon.pe a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call52_33() throws Throwable;
private static native com.moon.hD __call52_34(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call52_35() throws Throwable;
private static native java.lang.String __invokedynamic52_36(int a0, long a1) throws Throwable;
private static native com.moon.hB __call52_37(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.pc __fieldRead52_38(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call52_39(com.moon.pc a0) throws Throwable;
private static native java.lang.String __invokedynamic52_40(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic52_42(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.hB __call52_43(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead52_44() throws Throwable;
private static native com.moon.hB __call52_45(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic52_46(int a0, long a1) throws Throwable;
private static native com.moon.hB __call52_47(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call52_48(com.moon.hB a0) throws Throwable;
private static native void __call52_49(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.mz __fieldRead52_50(com.moon.pf a0) throws Throwable;
private static native boolean __call52_51(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory52_52(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call52_53() throws Throwable;
private static native java.util.concurrent.ExecutorService __call52_54(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic52_55(com.moon.pf a0) throws Throwable;
private static native java.util.concurrent.Future __call52_56(java.util.concurrent.ExecutorService a0, java.lang.Runnable a1) throws Throwable;
private static native com.moon.mz __fieldRead52_57(com.moon.pf a0) throws Throwable;
private static native boolean __call52_58(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory52_59(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead52_60(com.moon.pf a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call52_61() throws Throwable;
private static native com.moon.pe __call52_62(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call52_63(net.minecraft.client.Minecraft a0, com.moon.pe a1) throws Throwable;
private static native void __call52_64(com.moon.pf a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1005200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005203_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005204_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005205_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005206_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005207_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005208_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005209_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005210_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_070e1072031b80a9ae08(com.moon.pf a0, com.moon.cW a1) throws E;
private static final class __SourceHandler_070e1072031b80a9ae08 {

public static void f53(com.moon.pf receiver, com.moon.cW p0) throws Throwable {
    com.moon.cW forwardValue53_11_0;
    com.moon.cW spill53_0;
    com.moon.hD spill53_1;
    com.moon.hB spill53_2;
    long life2_3;
    int life4_5;
    java.lang.String life5_15;
    java.lang.String life6_18;
    net.minecraft.util.Session life7_22;
    com.moon.cq life8_28;
    forward_join_105: {
    forward_join_80: {
    forward_join_11: {
    life2_3 = (__fieldRead53_0() ^ 132642876923118L);
    life4_5 = __integerCategory53_2(__call53_1());
    spill53_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue53_11_0 = spill53_0;
        break forward_join_11;
    }
    if (!((spill53_0 != null))) {
        break forward_join_80;
    }
    forwardValue53_11_0 = p0;
    }
    life5_15 = __call53_3(forwardValue53_11_0);
    life6_18 = __call53_4(p0);
    life7_22 = __call53_6(__fieldRead53_5(receiver));
    life8_28 = __call53_8(__call53_7(life7_22), life5_15, life6_18);
    __call53_10(__call53_9(), life8_28);
    __call53_13(__call53_12(__call53_11()), life8_28);
    __call53_21(__call53_17(__call53_16(__call53_15(__call53_14()))), __call53_18(life7_22), __call53_20(__call53_19(life7_22)));
    spill53_1 = __call53_23(__call53_22());
    spill53_2 = __call53_26(__call53_24(), __invokedynamic53_25(21342, (3474715675827390303L ^ life2_3)));
    java.lang.String __stackOp53_29_0 = __call53_27(life7_22);
    java.lang.String __stackOp53_29_1 = __invokedynamic53_28(7597, (8806618825546533288L ^ life2_3));
    __call53_37(spill53_1, __call53_36(__call53_35(__call53_33(__call53_31(spill53_2, __invokedynamic53_30(__stackOp53_29_1, __stackOp53_29_0)), __fieldRead53_32()), __invokedynamic53_34(30587, (3352149641102107962L ^ life2_3)))));
    __call53_41(__fieldRead53_38(receiver), __call53_40(__call53_39()));
    if (!((life4_5 != 0))) {
        break forward_join_105;
    }
    }
    __call53_54(__call53_43(__call53_42()), __call53_53(__call53_52(__call53_50(__call53_48(__call53_46(__call53_44(), __invokedynamic53_45(24995, (4936401951223379372L ^ life2_3))), __invokedynamic53_47(27013, (1744404703118196114L ^ life2_3))), __fieldRead53_49()), __invokedynamic53_51(28292, (4545472430410611908L ^ life2_3)))));
    }
    return;
}
public static void h53_0(moom.Oo p0) throws Throwable {
    throw __call1005300_0(p0);
}
public static void h53_1(moom.Oo p0) throws Throwable {
    throw __call1005301_0(p0);
}
private static native long __fieldRead53_0() throws Throwable;
private static native boolean __call53_1() throws Throwable;
private static native int __integerCategory53_2(boolean value) throws Throwable;
private static native java.lang.String __call53_3(com.moon.cW a0) throws Throwable;
private static native java.lang.String __call53_4(com.moon.cW a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead53_5(com.moon.pf a0) throws Throwable;
private static native net.minecraft.util.Session __call53_6(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call53_7(net.minecraft.util.Session a0) throws Throwable;
private static native com.moon.cq __call53_8(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.runtime.ClientContext __call53_9() throws Throwable;
private static native com.moon.runtime.ClientContext __call53_10(com.moon.runtime.ClientContext a0, com.moon.cq a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call53_11() throws Throwable;
private static native com.moon.cs __call53_12(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call53_13(com.moon.cs a0, com.moon.cq a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call53_14() throws Throwable;
private static native com.moon.od __call53_15(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.og __call53_16(com.moon.od a0) throws Throwable;
private static native com.moon.ok __call53_17(com.moon.og a0) throws Throwable;
private static native java.lang.String __call53_18(net.minecraft.util.Session a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call53_19(net.minecraft.util.Session a0) throws Throwable;
private static native java.util.UUID __call53_20(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call53_21(com.moon.ok a0, java.lang.String a1, java.util.UUID a2) throws Throwable;
private static native com.moon.runtime.ClientContext __call53_22() throws Throwable;
private static native com.moon.hD __call53_23(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call53_24() throws Throwable;
private static native java.lang.String __invokedynamic53_25(int a0, long a1) throws Throwable;
private static native com.moon.hB __call53_26(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call53_27(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic53_28(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic53_30(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.hB __call53_31(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead53_32() throws Throwable;
private static native com.moon.hB __call53_33(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic53_34(int a0, long a1) throws Throwable;
private static native com.moon.hB __call53_35(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call53_36(com.moon.hB a0) throws Throwable;
private static native void __call53_37(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead53_38(com.moon.pf a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call53_39() throws Throwable;
private static native com.moon.pe __call53_40(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call53_41(net.minecraft.client.Minecraft a0, com.moon.pe a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call53_42() throws Throwable;
private static native com.moon.hD __call53_43(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call53_44() throws Throwable;
private static native java.lang.String __invokedynamic53_45(int a0, long a1) throws Throwable;
private static native com.moon.hB __call53_46(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic53_47(int a0, long a1) throws Throwable;
private static native com.moon.hB __call53_48(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead53_49() throws Throwable;
private static native com.moon.hB __call53_50(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic53_51(int a0, long a1) throws Throwable;
private static native com.moon.hB __call53_52(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call53_53(com.moon.hB a0) throws Throwable;
private static native void __call53_54(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native java.lang.Exception __call1005300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1005301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_22f6761a96b90547cc9f(com.moon.pf a0) throws E;
private static final class __SourceHandler_22f6761a96b90547cc9f {

public static void f79(com.moon.pf receiver) throws Throwable {
    java.lang.String forwardValue79_32_0;
    com.moon.cD forwardValue79_118_0;
    int forwardValue79_118_1;
    com.moon.cD forwardValue79_119_0;
    com.moon.cD forwardValue79_120_0;
    int forwardValue79_120_1;
    boolean spill79_0;
    java.lang.String spill79_1;
    java.lang.String spill79_2;
    java.lang.Object[] spill79_3;
    java.net.http.HttpRequest.Builder spill79_4;
    java.lang.String[] spill79_5;
    java.lang.String[] spill79_6;
    java.lang.String[] spill79_7;
    java.lang.String[] spill79_8;
    com.moon.cD spill79_9;
    boolean spill79_10;
    long life1_3;
    java.lang.String life4_13;
    int life3_14;
    java.lang.String life5_35;
    java.net.http.HttpRequest life6_83;
    java.net.http.HttpResponse life7_88;
    int life8_91;
    forward_join_120: {
    forward_join_119: {
    forward_join_118: {
    forward_join_109: {
    forward_join_108: {
    forward_join_105: {
    forward_join_32: {
    life1_3 = (__fieldRead79_0() ^ 121953118258365L);
    spill79_0 = __call79_1();
    __fieldWrite79_2(receiver, 0);
    life4_13 = __invokedynamic79_3(15741, (6501682227137032493L ^ life1_3));
    life3_14 = __integerCategory79_4(spill79_0);
    spill79_1 = __call79_6(__fieldRead79_5(receiver));
    if (!((life3_14 != 0))) {
        forwardValue79_32_0 = spill79_1;
        break forward_join_32;
    }
    if (!((!__call79_7(spill79_1)))) {
        break forward_join_109;
    }
    spill79_2 = life4_13;
    java.lang.Object[] __stackOp79_8_0 = new java.lang.Object[1];
    spill79_3 = __stackOp79_8_0;
    (__stackOp79_8_0)[0] = __call79_10(__fieldRead79_9(receiver));
    forwardValue79_32_0 = __call79_11(spill79_2, spill79_3);
    }
    life5_35 = forwardValue79_32_0;
    spill79_4 = __call79_14(__call79_12(), __call79_13(life5_35));
    java.lang.String[] __stackOp79_15_0 = new java.lang.String[4];
    spill79_5 = __stackOp79_15_0;
    (__stackOp79_15_0)[0] = __invokedynamic79_16(20891, (7196282999801732547L ^ life1_3));
    java.lang.String[] __stackOp79_17_0 = spill79_5;
    spill79_6 = __stackOp79_17_0;
    (__stackOp79_17_0)[1] = __invokedynamic79_18(19425, (5084315044854220732L ^ life1_3));
    java.lang.String[] __stackOp79_19_0 = spill79_6;
    spill79_7 = __stackOp79_19_0;
    (__stackOp79_19_0)[2] = __invokedynamic79_20(3314, (3998908399195848870L ^ life1_3));
    java.lang.String[] __stackOp79_21_0 = spill79_7;
    spill79_8 = __stackOp79_21_0;
    (__stackOp79_21_0)[3] = __invokedynamic79_22(28337, (7010481151736799979L ^ life1_3));
    life6_83 = __call79_27(__call79_26(__call79_23(spill79_4, spill79_8), __call79_25(__invokedynamic79_24(8022, (4867241635611563334L ^ life1_3)))));
    life7_88 = __call79_30(__fieldRead79_28(), life6_83, __call79_29());
    life8_91 = __call79_31(life7_88);
    if (!((life3_14 != 0))) {
        break forward_join_108;
    }
    if (!((life8_91 != __invokedynamic79_32(15705, (3315765320960133938L ^ life1_3))))) {
        break forward_join_105;
    }
    if (!((life8_91 == __invokedynamic79_33(22726, (1736220492267105963L ^ life1_3))))) {
        break forward_join_109;
    }
    }
    __fieldWrite79_34(receiver, 1);
    }
    return;
    }
    spill79_9 = __fieldRead79_35();
    spill79_10 = __call79_38(__call79_37(__fieldRead79_36(receiver)));
    if (!((life3_14 != 0))) {
        forwardValue79_118_0 = spill79_9;
        forwardValue79_118_1 = __integerCategory79_39(spill79_10);
        break forward_join_118;
    }
    if (!((!spill79_10))) {
        forwardValue79_119_0 = spill79_9;
        break forward_join_119;
    }
    forwardValue79_118_0 = spill79_9;
    forwardValue79_118_1 = 1;
    }
    forwardValue79_120_0 = forwardValue79_118_0;
    forwardValue79_120_1 = forwardValue79_118_1;
    break forward_join_120;
    }
    forwardValue79_120_0 = forwardValue79_119_0;
    forwardValue79_120_1 = 0;
    }
    __call79_43(forwardValue79_120_0, forwardValue79_120_1, __call79_41(__fieldRead79_40(receiver)), __invokedynamic79_42(receiver));
    return;
}
public static void h79_0(java.lang.Exception p0) throws Throwable {
    throw __call2007900_0(p0);
}
public static void h79_1(java.lang.Exception p0) throws Throwable {
    throw __call2007901_0(p0);
}
public static void h79_2(java.lang.Exception p0) throws Throwable {
    throw __call2007902_0(p0);
}
public static void h79_3(java.lang.Exception p0) throws Throwable {
    throw __call2007903_0(p0);
}
public static void h79_4(java.lang.Exception p0, com.moon.pf p1) throws Throwable {
    java.lang.Exception local2 = p0;
    __fieldWrite2007904_0(p1, 1);
    return;
}
public static void h79_5(java.lang.Exception p0) throws Throwable {
    throw __call2007905_0(p0);
}
private static native long __fieldRead79_0() throws Throwable;
private static native boolean __call79_1() throws Throwable;
private static native void __fieldWrite79_2(com.moon.pf a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic79_3(int a0, long a1) throws Throwable;
private static native int __integerCategory79_4(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead79_5(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call79_6(com.moon.pc a0) throws Throwable;
private static native boolean __call79_7(java.lang.String a0) throws Throwable;
private static native com.moon.pc __fieldRead79_9(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call79_10(com.moon.pc a0) throws Throwable;
private static native java.lang.String __call79_11(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call79_12() throws Throwable;
private static native java.net.URI __call79_13(java.lang.String a0) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call79_14(java.net.http.HttpRequest.Builder a0, java.net.URI a1) throws Throwable;
private static native java.lang.String __invokedynamic79_16(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic79_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic79_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic79_22(int a0, long a1) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call79_23(java.net.http.HttpRequest.Builder a0, java.lang.String[] a1) throws Throwable;
private static native long __invokedynamic79_24(int a0, long a1) throws Throwable;
private static native java.time.Duration __call79_25(long a0) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call79_26(java.net.http.HttpRequest.Builder a0, java.time.Duration a1) throws Throwable;
private static native java.net.http.HttpRequest __call79_27(java.net.http.HttpRequest.Builder a0) throws Throwable;
private static native java.net.http.HttpClient __fieldRead79_28() throws Throwable;
private static native java.net.http.HttpResponse.BodyHandler __call79_29() throws Throwable;
private static native java.net.http.HttpResponse __call79_30(java.net.http.HttpClient a0, java.net.http.HttpRequest a1, java.net.http.HttpResponse.BodyHandler a2) throws Throwable;
private static native int __call79_31(java.net.http.HttpResponse a0) throws Throwable;
private static native int __invokedynamic79_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic79_33(int a0, long a1) throws Throwable;
private static native void __fieldWrite79_34(com.moon.pf a0, int a1) throws Throwable;
private static native com.moon.cD __fieldRead79_35() throws Throwable;
private static native com.moon.pc __fieldRead79_36(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call79_37(com.moon.pc a0) throws Throwable;
private static native boolean __call79_38(java.lang.String a0) throws Throwable;
private static native int __integerCategory79_39(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead79_40(com.moon.pf a0) throws Throwable;
private static native java.lang.String __call79_41(com.moon.pc a0) throws Throwable;
private static native java.util.function.Consumer __invokedynamic79_42(com.moon.pf a0) throws Throwable;
private static native void __call79_43(com.moon.cD a0, int a1, java.lang.String a2, java.util.function.Consumer a3) throws Throwable;
private static native java.lang.Exception __call2007900_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2007901_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2007902_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2007903_0(java.lang.Exception a0) throws Throwable;
private static native void __fieldWrite2007904_0(com.moon.pf a0, int a1) throws Throwable;
private static native java.lang.Exception __call2007905_0(java.lang.Exception a0) throws Throwable;

}


static net.minecraft.client.Minecraft b(com.moon.pf p0) {
return ((com.moon.pf)(p0)).i;
}


protected void b(int p0, int p1, int p2) {
super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private static long e(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31027);
    if (((com.moon.pf.L)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.pf.K)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.pf.M)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pf.M)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/pf", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.pf.L)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.pf.L)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral3215_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.pf.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c__Void() {
long local1_life2 = (com.moon.pf.D ^ 4284467930347L);
    float local3_life5 = ((((float) this.l) / 0x1.0p1f) - 0x1.a400000000000p+6F);
    float local4_life7 = 0x1.4a00000000000p+7F;
    com.v local5_life11 = ((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a();
    this.x = ((com.moon.pc)(new com.moon.pc(1, ((net.minecraft.client.Minecraft)(this.i)).N, ((((float) this.k) / 0x1.0p1f) - 0x1.4000000000000p+6F), ((((float) this.l) / 0x1.0p1f) - 0x1.4800000000000p+6F), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_19(4553, (3267008544973981685L ^ local1_life2)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_21(3713, (3483355857841526971L ^ local1_life2)), local5_life11)));
    this.A = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), (((local3_life5 + local4_life7) - 0x1.b000000000000p+4F) - 0x1.0800000000000p+6F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_30(11639, (477403759637709172L ^ local1_life2)), false, local5_life11)));
    this.y = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), (((local3_life5 + local4_life7) - 0x1.b000000000000p+4F) - 0x1.6000000000000p+5F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_39(28160, (4126699902776476161L ^ local1_life2)), false, local5_life11)));
    this.z = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), (((local3_life5 + local4_life7) - 0x1.b000000000000p+4F) - 0x1.6000000000000p+4F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_48(17730, (1182098265825519941L ^ local1_life2)), false, local5_life11)));
    this.B = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), ((local3_life5 + local4_life7) - 0x1.b000000000000p+4F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_56(7510, (1801091438672441689L ^ local1_life2)), false, local5_life11)));
    this.C = ((boolean)(false));
    com.moon.pe local6_life61 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__pe();
    ((com.moon.gW)(((com.moon.pe)(local6_life61)).a())).a(((java.util.function.Consumer)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_63(this, local5_life11))));
    super.c__Void();
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17737;
      if (I[var3] == null) {
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
         long var5 = H[var3];
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
         Object[] var9 = (Object[])J.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               J.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         I[var3] = var15;
      }

      return I[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3216_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pf.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16246);
    if (((com.moon.pf.F)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.pf.G)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pf.G)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/pf", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.pf.E)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.pf.F)[life5_8] = com.moon.pf.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.pf.F)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.pf.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, float p2) { __sourceHandlerCall_0719b0173eea0862c485(this, p0, p1, p2); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3219_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_5da9f0ed5d2ed641e3bc(this, p0, p1, p2); }


protected void a(char p0, int p1) throws java.io.IOException {
((com.moon.pc)(this.x)).a(((char)(p0)), ((int)(p1)));
    super.a(((char)(p0)), ((int)(p1)));
    return;
}


static net.minecraft.client.Minecraft a(com.moon.pf p0) {
return ((com.moon.pf)(p0)).i;
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
        byte[] spill1224_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1224_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1224_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1224_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1224_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1224_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void g() {
((com.moon.pc)(this.x)).a__Void();
    super.g();
    return;
}


private void lambda$mouseClicked$1(com.moon.cW p0) { __sourceHandlerCall_070e1072031b80a9ae08(this, p0); }


private void lambda$mouseClicked$2() { __sourceHandlerCall_22f6761a96b90547cc9f(this); }


private void lambda$initGui$0(com.v p0, java.lang.Boolean p1) {
float local3 = ((((float) this.k) / 0x1.0p1f) - 0x1.54p6f);
    float local4 = ((((float) this.l) / 0x1.0p1f) - 0x1.a4p6f);
    java.lang.Object local5 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local5)).a(((com.moon.iX)(com.moon.i3.a(((float)((local3 - 0x1.0p0f))), ((float)((local4 - 0x1.0p0f))), ((float)(0x1.58p7f)), ((float)(0x1.4ap7f)), ((float)(0x1.8p2f)), ((int)(((com.v)(p0)).x()))))));
    ((com.moon.hW)(local5)).b();
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3219_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_7ac46ee229a8_originalDynamicSite260_63(com.moon.pf a0, com.v a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3216_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral3215_0() throws E;
}
