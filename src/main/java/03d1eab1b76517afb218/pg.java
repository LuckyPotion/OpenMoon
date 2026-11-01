package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pg extends net.minecraft.client.gui.GuiScreen {

private com.moon.pc w;

private com.moon.mz x;

private com.moon.mz y;

private com.moon.mz z;

private com.moon.mz A;

private boolean B;

private static long C;

private static java.lang.String[] D;

private static java.lang.String[] E;

private static java.util.Map F;

private static long[] G;

private static java.lang.Integer[] H;

private static java.util.Map I;

private static long[] J;

private static java.lang.Long[] K;

private static java.util.Map L;

public pg() {
super();
    this.B = false;
}


static {
C = ((long)(((moom._a)(moom._c.a(((long)(7844881792342039736L)), ((long)(-7545523036268796639L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(173532522504515L)))));
    F = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.pg.C ^ 135048034687003L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill373_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill373_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill373_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill373_14 = new byte[8];
    (__sourceSpill373_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill373_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation373_16 = __sourceSpill373_14;
    ((javax.crypto.Cipher)(__sourceSpill373_11)).init(((int)(__sourceSpill373_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill373_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation373_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[20];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "'~Õ\004\n?/ ­g´õøîQ\003#æØÏf µðýu÷¼Xãµì\025Å4q^I¤Ç:S°80!äÐôt §j^\020\030=.UnìÌT>\026åB\"±­12pºú©¡Û:Yâ<úa\022Õ«þ½\030¼K\024L²¹\026]DzæEúX\002\022jÌ>x&\003\025/Brªêi(øB\bWó)6ÛëP\"\003\nG\016û\027:v\021\177ly\000Ì'ÿpJ\016ÀÖñZþBw°7¯ÖóD\004.Sý\rhå­Æu)ó\0369\027C¨Ëõ%£ÎËÑ(Ä\r$ýe,?±õ'PàlºDkÎ<uüÁå£ÃöhKò~³\030éVÁE_¤(Ð­-¨Ä~×j\020\022\005à÷Þ¯\036ÀCÓ\022W¶\033L\036-d7,\035k\\@C 2Rït^©±ß]_$ÔEq¿\bæì>µ+ÐëÊ)^þæ±LÃçð\013¡5í¯YÍ§fq?Ä§\027^>\017X$bÇ\022\t@ìO\035wçM\003\036òæZ¾`ÄPg¡\177óò\021 Ó¿\027¿ ûk\033®Î?#ÝX·p¨\fßý2ðÑ@\001ÛöéöéZ\035¾.*\006£P\016£°jE\0160Këª4¾6Uþhå¾\177;Jëè?èæÖ«£`Szòø\000{¸(K%íuBQ>\032/#É¥\025`üLsÎ\b\027÷mpý»\030ß®æùäj8\001sX§k<\022¾  \016\033*n\013AXöÕ}Ê»\\\037ùûûìÈ¡x\031ôÈó%\177î\027 Þ°ï\004\002æ¶üÔæ4\027ëfJg´òG\037º\"t\013¹\033\034VXþ=ÅÜ¾¿yGôÖ«DHÑ(\032>émñäÓoz\020ésR%~sÕøe8?&q*åP°ÉùFØÐWÀ\031\0175:ÉÇN-`\030G\020\024Ïâ\030§Þ¹û\005/é÷¾ÕóÀÛÃW¤½`\001Ó\025ewû\024Nòÿ}GüøSAl«ª÷ô¸!+v\r(÷nÌ¼o~M\016\013ë*^Hµ\034;ÈÞ\tÏ&;HÕbA½HäTÎUXÙcã¹æ¥Ó2X\021[ß:Mµ\"hÚ\025è1¾ÞÈ2G¢Ho\026$\000¦ÐÍ^af¦{Q¸S(Äy\f³àÁ\fUIfRdÒT\004£§á¡\000jÒ\020¹\rÈÍp6B7»\013Å\005\030«þ¬ÇÍOéÈÉL.ÌÝ\037ãª§3è\000^a pÞOÔPVMH¯fÒ©ù½X(ñöÎk\t º÷×ù`Æ\tG\016\030\024 ¹Næ@ß>ßá?°@kéKgVaÑàôT dÃü½)Nu¼ó©úÄÉÛâ\177Vk©NÔ\027ü\030r$Ýãn¹¯"))).length();
    int local27_life24 = 32;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill373_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill373_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill373_29)).doFinal(((byte[])(__sourceSpill373_28)));
        java.lang.String __sourceSpill373_34 = ((java.lang.String)(com.moon.pg.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill373_35 = local31_life19;
        int __sourceSpill373_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill373_35)[__sourceSpill373_36] = __sourceSpill373_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "p%ç0³îÎ©>\017\000ßðS(Êå£QÈ\023×\007L6\036]<¢þ´Ø$-Á\020B³[ï2\033çKæ»O\001·è¯×c "))).length();
    local27_life24 = 16;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill373_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill373_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill373_42)).doFinal(((byte[])(__sourceSpill373_41)));
        java.lang.String __sourceSpill373_47 = ((java.lang.String)(com.moon.pg.a(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill373_48 = local31_life19;
        int __sourceSpill373_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill373_48)[__sourceSpill373_49] = __sourceSpill373_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    D = ((java.lang.String[])(local31_life19));
    E = ((java.lang.String[])(new java.lang.String[20]));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill373_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill373_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill373_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill373_60 = new byte[8];
    (__sourceSpill373_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill373_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation373_62 = __sourceSpill373_60;
    ((javax.crypto.Cipher)(__sourceSpill373_57)).init(((int)(__sourceSpill373_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill373_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation373_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[6];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "ù×ËµQTÂ³&f-?Ë\r!J¢Ã\003î:°|Èc"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill373_71 = local15_life67;
        int __sourceSpill373_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill373_71)).substring(((int)(__sourceSpill373_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill373_76 = local17_life65;
        int __sourceSpill373_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill373_79 = new byte[8];
        (__sourceSpill373_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill373_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill373_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill373_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill373_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill373_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill373_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill373_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill373_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill373_80)).doFinal(((byte[])(__sourceSpill373_79)));
        (__sourceSpill373_76)[__sourceSpill373_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "h\032VkÅ\021, «äÄè\t\002g"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill373_84 = local15_life67;
        int __sourceSpill373_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill373_84)).substring(((int)(__sourceSpill373_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill373_89 = local17_life65;
        int __sourceSpill373_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill373_92 = new byte[8];
        (__sourceSpill373_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill373_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill373_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill373_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill373_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill373_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill373_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill373_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill373_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill373_93)).doFinal(((byte[])(__sourceSpill373_92)));
        (__sourceSpill373_89)[__sourceSpill373_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    G = ((long[])(local17_life65));
    H = ((java.lang.Integer[])(new java.lang.Integer[6]));
    L = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill373_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill373_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill373_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill373_105 = new byte[8];
    (__sourceSpill373_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill373_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation373_107 = __sourceSpill373_105;
    ((javax.crypto.Cipher)(__sourceSpill373_102)).init(((int)(__sourceSpill373_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill373_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation373_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[3];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "\022=\005Üúí×â\001?¶Ïÿi¹ð\025ñê²½lM"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill373_116 = local4_life112;
        int __sourceSpill373_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill373_116)).substring(((int)(__sourceSpill373_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill373_121 = local6_life110;
        int __sourceSpill373_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill373_124 = new byte[8];
        (__sourceSpill373_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill373_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill373_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill373_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill373_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill373_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill373_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill373_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill373_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill373_125)).doFinal(((byte[])(__sourceSpill373_124)));
        (__sourceSpill373_121)[__sourceSpill373_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    J = ((long[])(local6_life110));
    K = ((java.lang.Long[])(new java.lang.Long[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_11216af73cf3f9bb8995(com.moon.pg a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_11216af73cf3f9bb8995 {

public static void f548(com.moon.pg receiver, int p0, int p1, float p2) throws Throwable {
    int forwardValue548_164_0;
    int forwardValue548_230_0;
    int forwardValue548_302_0;
    boolean spill548_0;
    boolean spill548_1;
    boolean spill548_2;
    int spill548_3;
    int spill548_4;
    int spill548_5;
    long life4_3;
    float life7_11;
    float life8_19;
    int life6_33;
    com.v life9_38;
    com.moon.hW life10_43;
    java.lang.String life11_88;
    com.moon.jm life12_93;
    com.moon.hW life13_100;
    java.lang.String life14_187;
    com.moon.pe life14_346;
    forward_join_302: {
    forward_join_295: {
    forward_join_230: {
    forward_join_202: {
    forward_join_164: {
    forward_join_162: {
    life4_3 = (__fieldRead548_0() ^ 6421912736061L);
    life7_11 = ((((float) __fieldRead548_1(receiver)) / 0x1.0p1f) - 0x1.54p6f);
    life8_19 = ((((float) __fieldRead548_2(receiver)) / 0x1.0p1f) - 0x1.a4p6f);
    spill548_0 = __call548_3();
    __call548_4();
    __call548_7(__invokedynamic548_5(12951, (817833476639736042L ^ life4_3)), __invokedynamic548_6(3571, (4039393487497166735L ^ life4_3)));
    life6_33 = __integerCategory548_8(spill548_0);
    __call548_9();
    life9_38 = __call548_12(__call548_11(__call548_10()));
    life10_43 = __call548_16(__call548_15(__call548_13(), __fieldRead548_14()));
    __call548_23(life10_43, __call548_22(-0x1.0p0f, -0x1.0p0f, ((float) (__fieldRead548_18(__fieldRead548_17(receiver)) + 1)), ((float) (__fieldRead548_20(__fieldRead548_19(receiver)) + 1)), 0x0.0p0f, __call548_21(life9_38)));
    __call548_26(life10_43, __call548_25((life7_11 - 0x1.0p0f), (life8_19 - 0x1.0p0f), 0x1.58p7f, 0x1.4ap7f, 0x1.8p2f, __call548_24(life9_38)));
    __call548_27(life10_43);
    __call548_29(__fieldRead548_28(receiver));
    life11_88 = __invokedynamic548_30(5743, (5696388750727292986L ^ life4_3));
    life12_93 = __call548_34(__call548_32(__call548_31()), __fieldRead548_33());
    life13_100 = __call548_39(__call548_38(__call548_37(__call548_35(), __fieldRead548_36()), life12_93));
    __call548_41(life12_93, life13_100, life11_88, 0x1.8p3f, (life7_11 + 0x1.8p2f), (life8_19 + 0x1.0p2f), __call548_40(life9_38), 1);
    spill548_1 = __call548_44(__call548_43(__fieldRead548_42(receiver)));
    if (!((life6_33 == 0))) {
        forwardValue548_164_0 = __integerCategory548_45(spill548_1);
        break forward_join_164;
    }
    if (!(spill548_1)) {
        break forward_join_162;
    }
    spill548_2 = __call548_47(__fieldRead548_46(receiver));
    if (!((life6_33 == 0))) {
        forwardValue548_164_0 = __integerCategory548_48(spill548_2);
        break forward_join_164;
    }
    if (!((!spill548_2))) {
        break forward_join_162;
    }
    __call548_58(life12_93, life13_100, __invokedynamic548_49(30700, (7112769438006135224L ^ life4_3)), 0x1.2p3f, (__fieldRead548_51(__fieldRead548_50(receiver)) + 0x1.0p2f), (((__fieldRead548_53(__fieldRead548_52(receiver)) + (((float) __fieldRead548_55(__fieldRead548_54(receiver))) / 0x1.0p1f)) - (__call548_56(life12_93, 0x1.2p3f) / 0x1.0p1f)) + 0x1.0p-1f), __call548_57(life9_38));
    }
    forwardValue548_164_0 = __integerCategory548_60(__fieldRead548_59(receiver));
    }
    if (!((life6_33 == 0))) {
        forwardValue548_230_0 = forwardValue548_164_0;
        break forward_join_230;
    }
    if (!((forwardValue548_164_0 != 0))) {
        break forward_join_202;
    }
    life14_187 = __invokedynamic548_61(786, (6567087466480581969L ^ life4_3));
    __call548_69(life12_93, life13_100, life14_187, 0x1.0p3f, ((((float) __fieldRead548_62(receiver)) / 0x1.0p1f) - (__call548_63(life12_93, life14_187, 0x1.0p3f) / 0x1.0p1f)), ((__fieldRead548_65(__fieldRead548_64(receiver)) + ((float) __fieldRead548_67(__fieldRead548_66(receiver)))) + 0x1.0p2f), __call548_68(life9_38));
    }
    __call548_70(life13_100);
    __call548_72(__fieldRead548_71(receiver), p0, p1);
    __call548_74(__fieldRead548_73(receiver), p0, p1);
    __call548_76(__fieldRead548_75(receiver), p0, p1);
    __call548_78(__fieldRead548_77(receiver), p0, p1);
    forwardValue548_230_0 = __numericCompare548_81(((float) p0), __call548_80(__fieldRead548_79(receiver)));
    }
    if (!((life6_33 == 0))) {
        forwardValue548_302_0 = forwardValue548_230_0;
        break forward_join_302;
    }
    if (!((forwardValue548_230_0 > 0))) {
        break forward_join_295;
    }
    spill548_3 = __numericCompare548_84(((float) p1), __call548_83(__fieldRead548_82(receiver)));
    if (!((life6_33 == 0))) {
        forwardValue548_302_0 = spill548_3;
        break forward_join_302;
    }
    if (!((spill548_3 > 0))) {
        break forward_join_295;
    }
    spill548_4 = __numericCompare548_89(((float) p0), (__call548_86(__fieldRead548_85(receiver)) + __call548_88(__fieldRead548_87(receiver))));
    if (!((life6_33 == 0))) {
        forwardValue548_302_0 = spill548_4;
        break forward_join_302;
    }
    if (!((spill548_4 < 0))) {
        break forward_join_295;
    }
    spill548_5 = __numericCompare548_94(((float) p1), (__call548_91(__fieldRead548_90(receiver)) + __call548_93(__fieldRead548_92(receiver))));
    if (!((life6_33 == 0))) {
        forwardValue548_302_0 = spill548_5;
        break forward_join_302;
    }
    if (!((spill548_5 < 0))) {
        break forward_join_295;
    }
    __call548_100(receiver, __call548_99(__invokedynamic548_95(7368, (7424396940775170696L ^ life4_3)), "", __invokedynamic548_96(13603, (3858976492714986340L ^ life4_3)), __invokedynamic548_97(26074, (3065064175942327198L ^ life4_3)), "", __invokedynamic548_98(18624, (1991213048246826638L ^ life4_3))), p0, p1);
    }
    __call548_101(receiver, p0, p1, p2);
    __call548_102();
    forwardValue548_302_0 = 1;
    }
    __call548_103(forwardValue548_302_0, 0);
    __call548_104();
    life14_346 = __call548_106(__call548_105());
    __call548_108(__call548_107(life14_346));
    __call548_110(__call548_109(life14_346));
    __call548_111();
    return;
}
public static void h548_0(moom.Oo p0) throws Throwable {
    throw __call1054800_0(p0);
}
public static void h548_1(moom.Oo p0) throws Throwable {
    throw __call1054801_0(p0);
}
public static void h548_2(moom.Oo p0) throws Throwable {
    throw __call1054802_0(p0);
}
public static void h548_3(moom.Oo p0) throws Throwable {
    throw __call1054803_0(p0);
}
public static void h548_4(moom.Oo p0) throws Throwable {
    throw __call1054804_0(p0);
}
public static void h548_5(moom.Oo p0) throws Throwable {
    throw __call1054805_0(p0);
}
public static void h548_6(moom.Oo p0) throws Throwable {
    throw __call1054806_0(p0);
}
public static void h548_7(moom.Oo p0) throws Throwable {
    throw __call1054807_0(p0);
}
public static void h548_8(moom.Oo p0) throws Throwable {
    throw __call1054808_0(p0);
}
public static void h548_9(moom.Oo p0) throws Throwable {
    throw __call1054809_0(p0);
}
public static void h548_10(moom.Oo p0) throws Throwable {
    throw __call1054810_0(p0);
}
public static void h548_11(moom.Oo p0) throws Throwable {
    throw __call1054811_0(p0);
}
public static void h548_12(moom.Oo p0) throws Throwable {
    throw __call1054812_0(p0);
}
private static native long __fieldRead548_0() throws Throwable;
private static native int __fieldRead548_1(com.moon.pg a0) throws Throwable;
private static native int __fieldRead548_2(com.moon.pg a0) throws Throwable;
private static native boolean __call548_3() throws Throwable;
private static native void __call548_4() throws Throwable;
private static native int __invokedynamic548_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic548_6(int a0, long a1) throws Throwable;
private static native void __call548_7(int a0, int a1) throws Throwable;
private static native int __integerCategory548_8(boolean value) throws Throwable;
private static native void __call548_9() throws Throwable;
private static native com.moon.runtime.ClientContext __call548_10() throws Throwable;
private static native com.moon.cs __call548_11(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.v __call548_12(com.moon.cs a0) throws Throwable;
private static native com.moon.hX __call548_13() throws Throwable;
private static native com.moon.cb __fieldRead548_14() throws Throwable;
private static native com.moon.hX __call548_15(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call548_16(com.moon.hX a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead548_17(com.moon.pg a0) throws Throwable;
private static native int __fieldRead548_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead548_19(com.moon.pg a0) throws Throwable;
private static native int __fieldRead548_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call548_21(com.v a0) throws Throwable;
private static native com.moon.i3 __call548_22(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call548_23(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native int __call548_24(com.v a0) throws Throwable;
private static native com.moon.i3 __call548_25(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call548_26(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call548_27(com.moon.hW a0) throws Throwable;
private static native com.moon.pc __fieldRead548_28(com.moon.pg a0) throws Throwable;
private static native void __call548_29(com.moon.pc a0) throws Throwable;
private static native java.lang.String __invokedynamic548_30(int a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call548_31() throws Throwable;
private static native com.moon.jo __call548_32(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead548_33() throws Throwable;
private static native com.moon.jm __call548_34(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native com.moon.hX __call548_35() throws Throwable;
private static native com.moon.cb __fieldRead548_36() throws Throwable;
private static native com.moon.hX __call548_37(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call548_38(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call548_39(com.moon.hX a0) throws Throwable;
private static native int __call548_40(com.v a0) throws Throwable;
private static native void __call548_41(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6, int a7) throws Throwable;
private static native com.moon.pc __fieldRead548_42(com.moon.pg a0) throws Throwable;
private static native java.lang.String __call548_43(com.moon.pc a0) throws Throwable;
private static native boolean __call548_44(java.lang.String a0) throws Throwable;
private static native int __integerCategory548_45(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead548_46(com.moon.pg a0) throws Throwable;
private static native boolean __call548_47(com.moon.pc a0) throws Throwable;
private static native int __integerCategory548_48(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic548_49(int a0, long a1) throws Throwable;
private static native com.moon.pc __fieldRead548_50(com.moon.pg a0) throws Throwable;
private static native float __fieldRead548_51(com.moon.pc a0) throws Throwable;
private static native com.moon.pc __fieldRead548_52(com.moon.pg a0) throws Throwable;
private static native float __fieldRead548_53(com.moon.pc a0) throws Throwable;
private static native com.moon.pc __fieldRead548_54(com.moon.pg a0) throws Throwable;
private static native int __fieldRead548_55(com.moon.pc a0) throws Throwable;
private static native float __call548_56(com.moon.jm a0, float a1) throws Throwable;
private static native int __call548_57(com.v a0) throws Throwable;
private static native void __call548_58(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native boolean __fieldRead548_59(com.moon.pg a0) throws Throwable;
private static native int __integerCategory548_60(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic548_61(int a0, long a1) throws Throwable;
private static native int __fieldRead548_62(com.moon.pg a0) throws Throwable;
private static native float __call548_63(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native com.moon.pc __fieldRead548_64(com.moon.pg a0) throws Throwable;
private static native float __fieldRead548_65(com.moon.pc a0) throws Throwable;
private static native com.moon.pc __fieldRead548_66(com.moon.pg a0) throws Throwable;
private static native int __fieldRead548_67(com.moon.pc a0) throws Throwable;
private static native int __call548_68(com.v a0) throws Throwable;
private static native void __call548_69(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call548_70(com.moon.hW a0) throws Throwable;
private static native com.moon.mz __fieldRead548_71(com.moon.pg a0) throws Throwable;
private static native void __call548_72(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead548_73(com.moon.pg a0) throws Throwable;
private static native void __call548_74(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead548_75(com.moon.pg a0) throws Throwable;
private static native void __call548_76(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead548_77(com.moon.pg a0) throws Throwable;
private static native void __call548_78(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead548_79(com.moon.pg a0) throws Throwable;
private static native float __call548_80(com.moon.mz a0) throws Throwable;
private static native int __numericCompare548_81(float a0, float a1) throws Throwable;
private static native com.moon.mz __fieldRead548_82(com.moon.pg a0) throws Throwable;
private static native float __call548_83(com.moon.mz a0) throws Throwable;
private static native int __numericCompare548_84(float a0, float a1) throws Throwable;
private static native com.moon.mz __fieldRead548_85(com.moon.pg a0) throws Throwable;
private static native float __call548_86(com.moon.mz a0) throws Throwable;
private static native com.moon.mz __fieldRead548_87(com.moon.pg a0) throws Throwable;
private static native float __call548_88(com.moon.mz a0) throws Throwable;
private static native int __numericCompare548_89(float a0, float a1) throws Throwable;
private static native com.moon.mz __fieldRead548_90(com.moon.pg a0) throws Throwable;
private static native float __call548_91(com.moon.mz a0) throws Throwable;
private static native com.moon.mz __fieldRead548_92(com.moon.pg a0) throws Throwable;
private static native float __call548_93(com.moon.mz a0) throws Throwable;
private static native int __numericCompare548_94(float a0, float a1) throws Throwable;
private static native java.lang.String __invokedynamic548_95(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic548_96(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic548_97(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic548_98(int a0, long a1) throws Throwable;
private static native java.util.List __call548_99(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native void __call548_100(com.moon.pg a0, java.util.List a1, int a2, int a3) throws Throwable;
private static native void __call548_101(com.moon.pg a0, int a1, int a2, float a3) throws Throwable;
private static native void __call548_102() throws Throwable;
private static native void __call548_103(int a0, int a1) throws Throwable;
private static native void __call548_104() throws Throwable;
private static native com.moon.runtime.ClientContext __call548_105() throws Throwable;
private static native com.moon.pe __call548_106(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.gW __call548_107(com.moon.pe a0) throws Throwable;
private static native void __call548_108(com.moon.gW a0) throws Throwable;
private static native com.moon.gW __call548_109(com.moon.pe a0) throws Throwable;
private static native void __call548_110(com.moon.gW a0) throws Throwable;
private static native void __call548_111() throws Throwable;
private static native java.lang.Exception __call1054800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054807_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054808_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054809_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054810_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054811_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054812_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ca59ae40c1521777a81d(com.moon.pg a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_ca59ae40c1521777a81d {

public static void f549(com.moon.pg receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue549_48_0;
    java.lang.String forwardValue549_62_0;
    int forwardValue549_81_0;
    int forwardValue549_98_0;
    com.moon.pg forwardValue549_105_0;
    boolean spill549_0;
    boolean spill549_1;
    java.lang.String spill549_2;
    com.moon.pg spill549_3;
    long life4_3;
    int life6_11;
    java.awt.FileDialog life7_40;
    com.moon.cq life7_83;
    forward_join_105: {
    forward_join_104: {
    forward_join_98: {
    forward_join_90: {
    forward_join_81: {
    forward_join_75: {
    forward_join_62: {
    forward_join_59: {
    forward_join_48: {
    forward_join_42: {
    forward_join_26: {
    life4_3 = (__fieldRead549_0() ^ 115222894529057L);
    spill549_0 = __call549_1();
    __call549_3(__fieldRead549_2(receiver), p0, p1, p2);
    life6_11 = __integerCategory549_4(spill549_0);
    spill549_1 = __call549_6(__fieldRead549_5(receiver), p0, p1, p2);
    if (!((life6_11 != 0))) {
        forwardValue549_48_0 = __integerCategory549_7(spill549_1);
        break forward_join_48;
    }
    if (!(spill549_1)) {
        break forward_join_42;
    }
    if (!(__call549_8())) {
        break forward_join_26;
    }
    __call549_10(__fieldRead549_9(receiver));
    }
    life7_40 = new java.awt.FileDialog(__cast549_11(null));
    __call549_12(life7_40, new com.moon.cB(receiver, life7_40));
    __call549_13(life7_40, 1);
    }
    forwardValue549_48_0 = __integerCategory549_16(__call549_15(__fieldRead549_14(receiver), p0, p1, p2));
    }
    if (!((life6_11 != 0))) {
        forwardValue549_81_0 = forwardValue549_48_0;
        break forward_join_81;
    }
    if (!((forwardValue549_48_0 != 0))) {
        break forward_join_75;
    }
    spill549_2 = __call549_18(__fieldRead549_17(receiver));
    if (!((life6_11 != 0))) {
        forwardValue549_62_0 = spill549_2;
        break forward_join_62;
    }
    if (!(__call549_19(spill549_2))) {
        break forward_join_59;
    }
    return;
    }
    forwardValue549_62_0 = __call549_21(__fieldRead549_20(receiver));
    }
    life7_83 = __call549_22(forwardValue549_62_0);
    __call549_23(life7_83);
    __call549_25(__call549_24(), null);
    __call549_29(__fieldRead549_26(receiver), __call549_28(__call549_27()));
    }
    forwardValue549_81_0 = __integerCategory549_32(__call549_31(__fieldRead549_30(receiver), p0, p1, p2));
    }
    if (!((life6_11 != 0))) {
        forwardValue549_98_0 = forwardValue549_81_0;
        break forward_join_98;
    }
    if (!((forwardValue549_81_0 != 0))) {
        break forward_join_90;
    }
    __call549_36(__call549_34(__call549_33()), __invokedynamic549_35(receiver));
    }
    spill549_3 = receiver;
    if (!((life6_11 != 0))) {
        forwardValue549_105_0 = spill549_3;
        break forward_join_105;
    }
    forwardValue549_98_0 = __integerCategory549_39(__call549_38(__fieldRead549_37(spill549_3), p0, p1, p2));
    }
    if (!((forwardValue549_98_0 != 0))) {
        break forward_join_104;
    }
    __call549_43(__fieldRead549_40(receiver), __call549_42(__call549_41()));
    }
    forwardValue549_105_0 = receiver;
    }
    __call549_44(forwardValue549_105_0, p0, p1, p2);
    return;
}
public static void h549_0(java.io.IOException p0) throws Throwable {
    throw __call1054900_0(p0);
}
public static void h549_1(java.io.IOException p0) throws Throwable {
    throw __call1054901_0(p0);
}
public static void h549_2(java.io.IOException p0) throws Throwable {
    throw __call1054902_0(p0);
}
public static void h549_3(java.io.IOException p0) throws Throwable {
    throw __call1054903_0(p0);
}
public static void h549_4(java.io.IOException p0) throws Throwable {
    throw __call1054904_0(p0);
}
public static void h549_5(java.io.IOException p0) throws Throwable {
    throw __call1054905_0(p0);
}
public static void h549_6(java.io.IOException p0) throws Throwable {
    throw __call1054906_0(p0);
}
public static void h549_7(java.io.IOException p0) throws Throwable {
    throw __call1054907_0(p0);
}
public static void h549_8(java.io.IOException p0) throws Throwable {
    throw __call1054908_0(p0);
}
public static void h549_9(java.io.IOException p0) throws Throwable {
    throw __call1054909_0(p0);
}
public static void h549_10(java.io.IOException p0) throws Throwable {
    throw __call1054910_0(p0);
}
private static native long __fieldRead549_0() throws Throwable;
private static native boolean __call549_1() throws Throwable;
private static native com.moon.pc __fieldRead549_2(com.moon.pg a0) throws Throwable;
private static native void __call549_3(com.moon.pc a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory549_4(boolean value) throws Throwable;
private static native com.moon.mz __fieldRead549_5(com.moon.pg a0) throws Throwable;
private static native boolean __call549_6(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory549_7(boolean value) throws Throwable;
private static native boolean __call549_8() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead549_9(com.moon.pg a0) throws Throwable;
private static native void __call549_10(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.awt.Frame __cast549_11(java.lang.Object a0) throws Throwable;
private static native void __call549_12(java.awt.FileDialog a0, com.moon.cB a1) throws Throwable;
private static native void __call549_13(java.awt.FileDialog a0, int a1) throws Throwable;
private static native com.moon.mz __fieldRead549_14(com.moon.pg a0) throws Throwable;
private static native boolean __call549_15(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory549_16(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead549_17(com.moon.pg a0) throws Throwable;
private static native java.lang.String __call549_18(com.moon.pc a0) throws Throwable;
private static native boolean __call549_19(java.lang.String a0) throws Throwable;
private static native com.moon.pc __fieldRead549_20(com.moon.pg a0) throws Throwable;
private static native java.lang.String __call549_21(com.moon.pc a0) throws Throwable;
private static native com.moon.cq __call549_22(java.lang.String a0) throws Throwable;
private static native void __call549_23(com.moon.cq a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call549_24() throws Throwable;
private static native com.moon.runtime.ClientContext __call549_25(com.moon.runtime.ClientContext a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead549_26(com.moon.pg a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call549_27() throws Throwable;
private static native com.moon.pe __call549_28(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call549_29(net.minecraft.client.Minecraft a0, com.moon.pe a1) throws Throwable;
private static native com.moon.mz __fieldRead549_30(com.moon.pg a0) throws Throwable;
private static native boolean __call549_31(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory549_32(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call549_33() throws Throwable;
private static native java.util.concurrent.ExecutorService __call549_34(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic549_35(com.moon.pg a0) throws Throwable;
private static native java.util.concurrent.Future __call549_36(java.util.concurrent.ExecutorService a0, java.lang.Runnable a1) throws Throwable;
private static native com.moon.mz __fieldRead549_37(com.moon.pg a0) throws Throwable;
private static native boolean __call549_38(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory549_39(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead549_40(com.moon.pg a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call549_41() throws Throwable;
private static native com.moon.pe __call549_42(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call549_43(net.minecraft.client.Minecraft a0, com.moon.pe a1) throws Throwable;
private static native void __call549_44(com.moon.pg a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1054900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054901_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054902_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054903_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054904_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054905_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054906_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054907_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054908_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054909_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1054910_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_73f33a8d36958485e551(com.moon.pg a0, com.moon.cW a1) throws E;
private static final class __SourceHandler_73f33a8d36958485e551 {

public static void f54(com.moon.pg receiver, com.moon.cW p0) throws Throwable {
    long life2_3;
    int life4_5;
    net.minecraft.util.Session life5_11;
    forward_join_87: {
    forward_join_62: {
    life2_3 = (__fieldRead54_0() ^ 60116203205357L);
    life4_5 = __integerCategory54_2(__call54_1());
    if (!((p0 != null))) { break forward_join_62; }
    life5_11 = __call54_4(__fieldRead54_3(receiver));
    __call54_12(__call54_8(__call54_7(__call54_6(__call54_5()))), __call54_9(life5_11), __call54_11(__call54_10(life5_11)));
    com.moon.hD spill54_0 = __call54_14(__call54_13());
    com.moon.hB spill54_1 = __call54_17(__call54_15(), __invokedynamic54_16(16633, (2426331022516378979L ^ life2_3)));
    java.lang.String __stackOp54_20_0 = __call54_18(life5_11);
    java.lang.String __stackOp54_20_1 = __invokedynamic54_19(26426, (8546693108262664872L ^ life2_3));
    __call54_28(spill54_0, __call54_27(__call54_26(__call54_24(__call54_22(spill54_1, __invokedynamic54_21(__stackOp54_20_1, __stackOp54_20_0)), __fieldRead54_23()), __invokedynamic54_25(17035, (9114765030651077667L ^ life2_3)))));
    __call54_30(__call54_29(), null);
    __call54_34(__fieldRead54_31(receiver), __call54_33(__call54_32()));
    if (!((life4_5 == 0))) { break forward_join_87; }
    }
    __call54_47(__call54_36(__call54_35()), __call54_46(__call54_45(__call54_43(__call54_41(__call54_39(__call54_37(), __invokedynamic54_38(23550, (6546612503841261155L ^ life2_3))), __invokedynamic54_40(30601, (8858384400761514513L ^ life2_3))), __fieldRead54_42()), __invokedynamic54_44(4760, (390698877431215155L ^ life2_3)))));
    }
    return;
}
public static void h54_0(moom.Oo p0) throws Throwable {
    throw __call1005400_0(p0);
}
private static native long __fieldRead54_0() throws Throwable;
private static native boolean __call54_1() throws Throwable;
private static native int __integerCategory54_2(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead54_3(com.moon.pg a0) throws Throwable;
private static native net.minecraft.util.Session __call54_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call54_5() throws Throwable;
private static native com.moon.od __call54_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.og __call54_7(com.moon.od a0) throws Throwable;
private static native com.moon.ok __call54_8(com.moon.og a0) throws Throwable;
private static native java.lang.String __call54_9(net.minecraft.util.Session a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call54_10(net.minecraft.util.Session a0) throws Throwable;
private static native java.util.UUID __call54_11(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native void __call54_12(com.moon.ok a0, java.lang.String a1, java.util.UUID a2) throws Throwable;
private static native com.moon.runtime.ClientContext __call54_13() throws Throwable;
private static native com.moon.hD __call54_14(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call54_15() throws Throwable;
private static native java.lang.String __invokedynamic54_16(int a0, long a1) throws Throwable;
private static native com.moon.hB __call54_17(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call54_18(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic54_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic54_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.hB __call54_22(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead54_23() throws Throwable;
private static native com.moon.hB __call54_24(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic54_25(int a0, long a1) throws Throwable;
private static native com.moon.hB __call54_26(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call54_27(com.moon.hB a0) throws Throwable;
private static native void __call54_28(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call54_29() throws Throwable;
private static native com.moon.runtime.ClientContext __call54_30(com.moon.runtime.ClientContext a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead54_31(com.moon.pg a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call54_32() throws Throwable;
private static native com.moon.pe __call54_33(com.moon.runtime.ClientContext a0) throws Throwable;
private static native void __call54_34(net.minecraft.client.Minecraft a0, com.moon.pe a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call54_35() throws Throwable;
private static native com.moon.hD __call54_36(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call54_37() throws Throwable;
private static native java.lang.String __invokedynamic54_38(int a0, long a1) throws Throwable;
private static native com.moon.hB __call54_39(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic54_40(int a0, long a1) throws Throwable;
private static native com.moon.hB __call54_41(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead54_42() throws Throwable;
private static native com.moon.hB __call54_43(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic54_44(int a0, long a1) throws Throwable;
private static native com.moon.hB __call54_45(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call54_46(com.moon.hB a0) throws Throwable;
private static native void __call54_47(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native java.lang.Exception __call1005400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_afa4619704ed72b92b55(com.moon.pg a0) throws E;
private static final class __SourceHandler_afa4619704ed72b92b55 {

public static void f80(com.moon.pg receiver) throws Throwable {
    java.lang.String forwardValue80_32_0;
    com.moon.cD forwardValue80_118_0;
    int forwardValue80_118_1;
    com.moon.cD forwardValue80_119_0;
    com.moon.cD forwardValue80_120_0;
    int forwardValue80_120_1;
    boolean spill80_0;
    java.lang.String spill80_1;
    java.lang.String spill80_2;
    java.lang.Object[] spill80_3;
    java.net.http.HttpRequest.Builder spill80_4;
    java.lang.String[] spill80_5;
    java.lang.String[] spill80_6;
    java.lang.String[] spill80_7;
    java.lang.String[] spill80_8;
    com.moon.cD spill80_9;
    boolean spill80_10;
    long life1_3;
    int life3_8;
    java.lang.String life4_14;
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
    life1_3 = (__fieldRead80_0() ^ 74100207064485L);
    spill80_0 = __call80_1();
    __fieldWrite80_2(receiver, 0);
    life3_8 = __integerCategory80_3(spill80_0);
    life4_14 = __invokedynamic80_4(5032, (4274647618001168764L ^ life1_3));
    spill80_1 = __call80_6(__fieldRead80_5(receiver));
    if (!((life3_8 != 0))) {
        forwardValue80_32_0 = spill80_1;
        break forward_join_32;
    }
    if (!((!__call80_7(spill80_1)))) {
        break forward_join_109;
    }
    spill80_2 = life4_14;
    java.lang.Object[] __stackOp80_8_0 = new java.lang.Object[1];
    spill80_3 = __stackOp80_8_0;
    (__stackOp80_8_0)[0] = __call80_10(__fieldRead80_9(receiver));
    forwardValue80_32_0 = __call80_11(spill80_2, spill80_3);
    }
    life5_35 = forwardValue80_32_0;
    spill80_4 = __call80_14(__call80_12(), __call80_13(life5_35));
    java.lang.String[] __stackOp80_15_0 = new java.lang.String[4];
    spill80_5 = __stackOp80_15_0;
    (__stackOp80_15_0)[0] = __invokedynamic80_16(27693, (7147447091890427646L ^ life1_3));
    java.lang.String[] __stackOp80_17_0 = spill80_5;
    spill80_6 = __stackOp80_17_0;
    (__stackOp80_17_0)[1] = __invokedynamic80_18(18138, (8942421241844382740L ^ life1_3));
    java.lang.String[] __stackOp80_19_0 = spill80_6;
    spill80_7 = __stackOp80_19_0;
    (__stackOp80_19_0)[2] = __invokedynamic80_20(12105, (3339331673340040606L ^ life1_3));
    java.lang.String[] __stackOp80_21_0 = spill80_7;
    spill80_8 = __stackOp80_21_0;
    (__stackOp80_21_0)[3] = __invokedynamic80_22(31780, (1542504579965912826L ^ life1_3));
    life6_83 = __call80_27(__call80_26(__call80_23(spill80_4, spill80_8), __call80_25(__invokedynamic80_24(16531, (3667335933708714354L ^ life1_3)))));
    life7_88 = __call80_30(__fieldRead80_28(), life6_83, __call80_29());
    life8_91 = __call80_31(life7_88);
    if (!((life3_8 != 0))) {
        break forward_join_108;
    }
    if (!((life8_91 != __invokedynamic80_32(26151, (8417955337848672455L ^ life1_3))))) {
        break forward_join_105;
    }
    if (!((life8_91 == __invokedynamic80_33(25638, (4192355985374499527L ^ life1_3))))) {
        break forward_join_109;
    }
    }
    __fieldWrite80_34(receiver, 1);
    }
    return;
    }
    spill80_9 = __fieldRead80_35();
    spill80_10 = __call80_38(__call80_37(__fieldRead80_36(receiver)));
    if (!((life3_8 != 0))) {
        forwardValue80_118_0 = spill80_9;
        forwardValue80_118_1 = __integerCategory80_39(spill80_10);
        break forward_join_118;
    }
    if (!((!spill80_10))) {
        forwardValue80_119_0 = spill80_9;
        break forward_join_119;
    }
    forwardValue80_118_0 = spill80_9;
    forwardValue80_118_1 = 1;
    }
    forwardValue80_120_0 = forwardValue80_118_0;
    forwardValue80_120_1 = forwardValue80_118_1;
    break forward_join_120;
    }
    forwardValue80_120_0 = forwardValue80_119_0;
    forwardValue80_120_1 = 0;
    }
    __call80_43(forwardValue80_120_0, forwardValue80_120_1, __call80_41(__fieldRead80_40(receiver)), __invokedynamic80_42(receiver));
    return;
}
public static void h80_0(java.lang.Exception p0) throws Throwable {
    throw __call2008000_0(p0);
}
public static void h80_1(java.lang.Exception p0) throws Throwable {
    throw __call2008001_0(p0);
}
public static void h80_2(java.lang.Exception p0) throws Throwable {
    throw __call2008002_0(p0);
}
public static void h80_3(java.lang.Exception p0) throws Throwable {
    throw __call2008003_0(p0);
}
public static void h80_4(java.lang.Exception p0, com.moon.pg p1) throws Throwable {
    java.lang.Exception local2 = p0;
    __fieldWrite2008004_0(p1, 1);
    return;
}
public static void h80_5(java.lang.Exception p0) throws Throwable {
    throw __call2008005_0(p0);
}
private static native long __fieldRead80_0() throws Throwable;
private static native boolean __call80_1() throws Throwable;
private static native void __fieldWrite80_2(com.moon.pg a0, int a1) throws Throwable;
private static native int __integerCategory80_3(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic80_4(int a0, long a1) throws Throwable;
private static native com.moon.pc __fieldRead80_5(com.moon.pg a0) throws Throwable;
private static native java.lang.String __call80_6(com.moon.pc a0) throws Throwable;
private static native boolean __call80_7(java.lang.String a0) throws Throwable;
private static native com.moon.pc __fieldRead80_9(com.moon.pg a0) throws Throwable;
private static native java.lang.String __call80_10(com.moon.pc a0) throws Throwable;
private static native java.lang.String __call80_11(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call80_12() throws Throwable;
private static native java.net.URI __call80_13(java.lang.String a0) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call80_14(java.net.http.HttpRequest.Builder a0, java.net.URI a1) throws Throwable;
private static native java.lang.String __invokedynamic80_16(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic80_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic80_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic80_22(int a0, long a1) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call80_23(java.net.http.HttpRequest.Builder a0, java.lang.String[] a1) throws Throwable;
private static native long __invokedynamic80_24(int a0, long a1) throws Throwable;
private static native java.time.Duration __call80_25(long a0) throws Throwable;
private static native java.net.http.HttpRequest.Builder __call80_26(java.net.http.HttpRequest.Builder a0, java.time.Duration a1) throws Throwable;
private static native java.net.http.HttpRequest __call80_27(java.net.http.HttpRequest.Builder a0) throws Throwable;
private static native java.net.http.HttpClient __fieldRead80_28() throws Throwable;
private static native java.net.http.HttpResponse.BodyHandler __call80_29() throws Throwable;
private static native java.net.http.HttpResponse __call80_30(java.net.http.HttpClient a0, java.net.http.HttpRequest a1, java.net.http.HttpResponse.BodyHandler a2) throws Throwable;
private static native int __call80_31(java.net.http.HttpResponse a0) throws Throwable;
private static native int __invokedynamic80_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic80_33(int a0, long a1) throws Throwable;
private static native void __fieldWrite80_34(com.moon.pg a0, int a1) throws Throwable;
private static native com.moon.cD __fieldRead80_35() throws Throwable;
private static native com.moon.pc __fieldRead80_36(com.moon.pg a0) throws Throwable;
private static native java.lang.String __call80_37(com.moon.pc a0) throws Throwable;
private static native boolean __call80_38(java.lang.String a0) throws Throwable;
private static native int __integerCategory80_39(boolean value) throws Throwable;
private static native com.moon.pc __fieldRead80_40(com.moon.pg a0) throws Throwable;
private static native java.lang.String __call80_41(com.moon.pc a0) throws Throwable;
private static native java.util.function.Consumer __invokedynamic80_42(com.moon.pg a0) throws Throwable;
private static native void __call80_43(com.moon.cD a0, int a1, java.lang.String a2, java.util.function.Consumer a3) throws Throwable;
private static native java.lang.Exception __call2008000_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2008001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2008002_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2008003_0(java.lang.Exception a0) throws Throwable;
private static native void __fieldWrite2008004_0(com.moon.pg a0, int a1) throws Throwable;
private static native java.lang.Exception __call2008005_0(java.lang.Exception a0) throws Throwable;

}


static net.minecraft.client.Minecraft b(com.moon.pg p0) {
return ((com.moon.pg)(p0)).i;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5000);
    if (((com.moon.pg.K)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.pg.J)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.pg.L)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pg.L)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/pg", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.pg.K)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.pg.K)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral3225_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.pg.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c__Void() {
long local1_life2 = (com.moon.pg.C ^ 62172723041467L);
    float local3_life5 = ((((float) this.l) / 0x1.0p1f) - 0x1.a400000000000p+6F);
    float local4_life7 = 0x1.4a00000000000p+7F;
    com.v local5_life11 = ((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a();
    this.w = ((com.moon.pc)(new com.moon.pc(1, ((net.minecraft.client.Minecraft)(this.i)).N, ((((float) this.k) / 0x1.0p1f) - 0x1.4000000000000p+6F), ((((float) this.l) / 0x1.0p1f) - 0x1.4800000000000p+6F), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_19(28296, (3680099477193660788L ^ local1_life2)), __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_21(20895, (2444103339485832802L ^ local1_life2)), local5_life11)));
    this.z = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), (((local3_life5 + local4_life7) - 0x1.b000000000000p+4F) - 0x1.0800000000000p+6F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_30(197, (8421725971162970882L ^ local1_life2)), false, local5_life11)));
    this.x = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), (((local3_life5 + local4_life7) - 0x1.b000000000000p+4F) - 0x1.6000000000000p+5F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_39(16063, (2668392224592790908L ^ local1_life2)), false, local5_life11)));
    this.y = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), (((local3_life5 + local4_life7) - 0x1.b000000000000p+4F) - 0x1.6000000000000p+4F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_48(9492, (495338738046312155L ^ local1_life2)), false, local5_life11)));
    this.A = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.e000000000000p+5F), ((local3_life5 + local4_life7) - 0x1.b000000000000p+4F), 0x1.e000000000000p+6F, 0x1.4000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_56(30363, (771219281560358218L ^ local1_life2)), false, local5_life11)));
    this.B = ((boolean)(false));
    com.moon.pe local6_life61 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__pe();
    ((com.moon.gW)(((com.moon.pe)(local6_life61)).a())).a(((java.util.function.Consumer)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_63(this, local5_life11))));
    super.c__Void();
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 9353;
      if (H[var3] == null) {
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
         long var5 = G[var3];
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
         Object[] var9 = (Object[])I.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               I.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pg", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         H[var3] = var15;
      }

      return H[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3226_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pg.d(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 26804);
    if (((com.moon.pg.E)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.pg.F)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pg.F)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/pg", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.pg.D)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.pg.E)[life5_8] = com.moon.pg.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.pg.E)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.pg.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1, float p2) { __sourceHandlerCall_11216af73cf3f9bb8995(this, p0, p1, p2); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3229_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pg"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_ca59ae40c1521777a81d(this, p0, p1, p2); }


protected void a(char p0, int p1) throws java.io.IOException {
((com.moon.pc)(this.w)).a(((char)(p0)), ((int)(p1)));
    super.a(((char)(p0)), ((int)(p1)));
    return;
}


static net.minecraft.client.Minecraft a(com.moon.pg p0) {
return ((com.moon.pg)(p0)).i;
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
        byte[] spill1225_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1225_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1225_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1225_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1225_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1225_2)[life4_9];
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
((com.moon.pc)(this.w)).a__Void();
    super.g();
    return;
}


private void lambda$mouseClicked$1(com.moon.cW p0) { __sourceHandlerCall_73f33a8d36958485e551(this, p0); }


private void lambda$mouseClicked$2() { __sourceHandlerCall_afa4619704ed72b92b55(this); }


private void lambda$initGui$0(com.v p0, java.lang.Boolean p1) {
float local3 = ((((float) this.k) / 0x1.0p1f) - 0x1.54p6f);
    float local4 = ((((float) this.l) / 0x1.0p1f) - 0x1.a4p6f);
    java.lang.Object local5 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local5)).a(((com.moon.iX)(com.moon.i3.a(((float)((local3 - 0x1.0p0f))), ((float)((local4 - 0x1.0p0f))), ((float)(0x1.58p7f)), ((float)(0x1.4ap7f)), ((float)(0x1.8p2f)), ((int)(((com.v)(p0)).x()))))));
    ((com.moon.hW)(local5)).b();
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3229_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_7ac46ee229a8_originalDynamicSite261_63(com.moon.pg a0, com.v a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3226_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral3225_0() throws E;
}
