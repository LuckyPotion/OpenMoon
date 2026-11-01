package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hF extends moom.hD {

private net.minecraft.client.gui.GuiScreen w;

private java.lang.String x;

private java.lang.String y;

private long z;

private java.lang.String A;

private moom.gu B;

private net.minecraft.client.gui.FontRenderer C;

private static long D;

private static java.lang.String[] E;

private static java.lang.String[] F;

private static java.util.Map H;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

private static long[] L;

private static java.lang.Long[] M;

private static java.util.Map N;

public hF(net.minecraft.client.gui.GuiScreen p0) {
super();
    this.C = moom.BU.a__fM().N;
    this.w = p0;
}


static {
D = ((long)(((moom._a)(moom._c.a(((long)(-7257494884224645187L)), ((long)(3821314899146525260L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(94642299957023L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (moom.hF.D ^ 119700786042570L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill861_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill861_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill861_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill861_14 = new byte[8];
    (__sourceSpill861_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill861_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation861_16 = __sourceSpill861_14;
    ((javax.crypto.Cipher)(__sourceSpill861_11)).init(((int)(__sourceSpill861_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill861_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation861_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[17];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "õ\017\020Ü+[¤®N>$ãq7½¬ýZ´%d'\026Ï7+ì8ôÈ.ûÜ;´Àe¢ëÈ,]\023_°q D\017\177£U[²±]\"E`¡Ýlek¥|\177\016 0²\016|ñ­ãe\026<0ßÎ\031áüäøâçiÝ\007¦ø³õ\017VcÛXü¡2%éL\017B¢ÎW\023BmX§0*¹ q1\030\021(Ã!\016ïShÞ\005\025¤±²LVé²I\006ûð\024K)×äÖt\021®ÅøB\030¾]\020ÂübNc2#ùóy\030@è_TÖ7õR}\030\034Ï÷\033³z§ä$ªzUWBÅS\177µTÖ²Ï¾¥¢:\023\030{n¶\r\027Eû\nÒQ=!$¶|pÚÓ\020åd¦ú^O÷&ÙèðÑ(\037l\tfÍN93½Ä+vÜO7j\177;0Òæ­\024Y\026/E`ßI(U¦\005¯\022ó0\020\022Ú\020;í|A¹¼¾\004²jö3@±«12£\034$.É5ç\026Q§úO\003IV\004º¸fýb#û\022¸µà\021¦üÛJÖF¶èUéAX£í\"Ã«zÃÜH7B0\bÈ=ò&\035ùð\006¸ÿGû\003óq\003ÈWlõvÀ3Ý P]F)ª\0207\033­@f{ÖÇ@o5U­SQ\020 ÑC¦Í·EÜPíJjTä@¯d(\033*Ä.ýz #Ê\022ªß\022}8ÛÕn´^\033ñ\034\024\020#ÃÿÑ\fý_\001¾\0210\000dïä}\006æÏjàb2½IÛ2ØCÜô8öT¦'>Ó\f»ä&\005r\007\025cW\003\037#à\0018æµi50¡fûN\\eï|¯­ëjIç\005Aç²é\006{@Âs\t$Ø\f$£â£_?îypÖ16îÇùê*ûqÑ!#¼=\0002\032àShs^,^CÐÕ­áÞEÔF%ÞÀÔÁ"))).length();
    int local27_life24 = 32;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill861_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill861_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill861_29)).doFinal(((byte[])(__sourceSpill861_28)));
        java.lang.String __sourceSpill861_34 = ((java.lang.String)(moom.hF.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill861_35 = local31_life19;
        int __sourceSpill861_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill861_35)[__sourceSpill861_36] = __sourceSpill861_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "\017ºlê\bq©-ý²Ü!¶jï¿ù\016J@\006ECyO¢B ×ÍVCæ¾ÄV«xl¶R0·B9ø§Ja¶úOjçÐ®mjý^w-3¸0\në\rixì\000eS¤×*ú\"®I#%¨"))).length();
    local27_life24 = 48;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill861_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill861_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill861_42)).doFinal(((byte[])(__sourceSpill861_41)));
        java.lang.String __sourceSpill861_47 = ((java.lang.String)(moom.hF.a(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill861_48 = local31_life19;
        int __sourceSpill861_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill861_48)[__sourceSpill861_49] = __sourceSpill861_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    E = ((java.lang.String[])(local31_life19));
    F = ((java.lang.String[])(new java.lang.String[17]));
    K = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill861_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill861_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill861_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill861_60 = new byte[8];
    (__sourceSpill861_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill861_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation861_62 = __sourceSpill861_60;
    ((javax.crypto.Cipher)(__sourceSpill861_57)).init(((int)(__sourceSpill861_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill861_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation861_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[27];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "eð?ÛXZõEU°\0052í*§\0175\005{\036\021ò>³!´úJ´÷\016\036)&cÀ÷\000Ò\020×N <\021\037éççÎ§]wÉG\004Ä4û­Ê[=)ðâê\177\b\"Çå|\020N:Ò¨vß¹¬\013ÇÆ\017Æ»,Óó\004l®a¯\004¡2¾Õà¸\030»¿P|úç\023ï¶\f¢\r3½ØKy\fþOùÌ=*#ÅÄ±½\016aÛûF\013¤Én\013\n\027Ü§¢ÈÜ+\rx\033Ú&£Æpsþ\fw\näs<Wò¢×"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill861_71 = local15_life67;
        int __sourceSpill861_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill861_71)).substring(((int)(__sourceSpill861_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill861_76 = local17_life65;
        int __sourceSpill861_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill861_79 = new byte[8];
        (__sourceSpill861_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill861_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill861_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill861_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill861_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill861_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill861_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill861_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill861_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill861_80)).doFinal(((byte[])(__sourceSpill861_79)));
        (__sourceSpill861_76)[__sourceSpill861_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "wWE\001á*x>\036Ût}Yl "))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill861_84 = local15_life67;
        int __sourceSpill861_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill861_84)).substring(((int)(__sourceSpill861_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill861_89 = local17_life65;
        int __sourceSpill861_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill861_92 = new byte[8];
        (__sourceSpill861_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill861_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill861_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill861_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill861_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill861_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill861_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill861_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill861_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill861_93)).doFinal(((byte[])(__sourceSpill861_92)));
        (__sourceSpill861_89)[__sourceSpill861_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    I = ((long[])(local17_life65));
    J = ((java.lang.Integer[])(new java.lang.Integer[27]));
    N = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill861_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill861_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill861_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill861_105 = new byte[8];
    (__sourceSpill861_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill861_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation861_107 = __sourceSpill861_105;
    ((javax.crypto.Cipher)(__sourceSpill861_102)).init(((int)(__sourceSpill861_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill861_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation861_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[4];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "ÚGºmÐÞØ#Æ\037oðn"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill861_116 = local4_life112;
        int __sourceSpill861_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill861_116)).substring(((int)(__sourceSpill861_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill861_121 = local6_life110;
        int __sourceSpill861_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill861_124 = new byte[8];
        (__sourceSpill861_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill861_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill861_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill861_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill861_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill861_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill861_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill861_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill861_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill861_125)).doFinal(((byte[])(__sourceSpill861_124)));
        (__sourceSpill861_121)[__sourceSpill861_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    local5_life114 = ((java.lang.String)((local4_life112 = "<ukxh\007\023/s½¶ø\025ìôI"))).length();
    local2_life115 = 0;
    do {
        java.lang.String __sourceSpill861_129 = local4_life112;
        int __sourceSpill861_130 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life133 = ((java.lang.String)(((java.lang.String)(__sourceSpill861_129)).substring(((int)(__sourceSpill861_130)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill861_134 = local6_life110;
        int __sourceSpill861_135 = local3_life111;
        local3_life111 += 1;
        long local8_life136 = (((((((((((long) (local7_life133)[0]) & 255L) << 56) | ((((long) (local7_life133)[1]) & 255L) << 48)) | ((((long) (local7_life133)[2]) & 255L) << 40)) | ((((long) (local7_life133)[3]) & 255L) << 32)) | ((((long) (local7_life133)[4]) & 255L) << 24)) | ((((long) (local7_life133)[5]) & 255L) << 16)) | ((((long) (local7_life133)[6]) & 255L) << 8)) | (((long) (local7_life133)[7]) & 255L));
        byte[] __sourceSpill861_137 = new byte[8];
        (__sourceSpill861_137)[0] = ((byte) ((int) (local8_life136 >>> 56)));
        (__sourceSpill861_137)[1] = ((byte) ((int) (local8_life136 >>> 48)));
        (__sourceSpill861_137)[2] = ((byte) ((int) (local8_life136 >>> 40)));
        (__sourceSpill861_137)[3] = ((byte) ((int) (local8_life136 >>> 32)));
        (__sourceSpill861_137)[4] = ((byte) ((int) (local8_life136 >>> 24)));
        (__sourceSpill861_137)[5] = ((byte) ((int) (local8_life136 >>> 16)));
        (__sourceSpill861_137)[6] = ((byte) ((int) (local8_life136 >>> 8)));
        (__sourceSpill861_137)[7] = ((byte) ((int) local8_life136));
        javax.crypto.Cipher __sourceSpill861_138 = local0_life100;
        byte[] local10_life140 = ((javax.crypto.Cipher)(__sourceSpill861_138)).doFinal(((byte[])(__sourceSpill861_137)));
        (__sourceSpill861_134)[__sourceSpill861_135] = (((((((((((long) (local10_life140)[0]) & 255L) << 56) | ((((long) (local10_life140)[1]) & 255L) << 48)) | ((((long) (local10_life140)[2]) & 255L) << 40)) | ((((long) (local10_life140)[3]) & 255L) << 32)) | ((((long) (local10_life140)[4]) & 255L) << 24)) | ((((long) (local10_life140)[5]) & 255L) << 16)) | ((((long) (local10_life140)[6]) & 255L) << 8)) | (((long) (local10_life140)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    L = ((long[])(local6_life110));
    M = ((java.lang.Long[])(new java.lang.Long[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_6a021abccca8d1cfe6e0(moom.hF a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_6a021abccca8d1cfe6e0 {

public static void f1044(moom.hF receiver, int p0, int p1, float p2) throws Throwable {
    moom.hF forwardValue1044_76_0;
    int[] spill1044_0;
    moom.hF spill1044_1;
    long life4_3;
    int[] life6_7;
    forward_join_80: {
    forward_join_76: {
    forward_join_75: {
    life4_3 = (__fieldRead1044_0() ^ 139673104084210L);
    spill1044_0 = __call1044_1();
    __call1044_2(receiver);
    life6_7 = spill1044_0;
    __call1044_8(receiver, __fieldRead1044_3(receiver), __fieldRead1044_4(receiver), (__fieldRead1044_5(receiver) / 2), __invokedynamic1044_6(6014, (2423957556001130878L ^ life4_3)), __invokedynamic1044_7(21208, (9203560629479115989L ^ life4_3)));
    spill1044_1 = receiver;
    if (!((life6_7 == null))) {
        forwardValue1044_76_0 = spill1044_1;
        break forward_join_76;
    }
    if (!((__fieldRead1044_9(spill1044_1) != null))) {
        break forward_join_75;
    }
    __call1044_17(receiver, __fieldRead1044_10(receiver), __fieldRead1044_11(receiver), (__fieldRead1044_12(receiver) / 2), ((__fieldRead1044_13(receiver) / __invokedynamic1044_14(3544, (8182029626551260109L ^ life4_3))) + __invokedynamic1044_15(10461, (2875900927210419914L ^ life4_3))), __invokedynamic1044_16(11662, (1084814689168257920L ^ life4_3)));
    if (!((life6_7 == null))) {
        break forward_join_80;
    }
    if (!((__numericCompare1044_20(__call1044_18(), __fieldRead1044_19(receiver)) > 0))) {
        break forward_join_75;
    }
    __fieldWrite1044_21(receiver, null);
    __call1044_22(receiver, null);
    }
    forwardValue1044_76_0 = receiver;
    }
    __call1044_23(forwardValue1044_76_0, p0, p1, p2);
    }
    return;
}
public static void h1044_0(moom.Oo p0) throws Throwable {
    throw __call1104400_0(p0);
}
public static void h1044_1(moom.Oo p0) throws Throwable {
    throw __call1104401_0(p0);
}
public static void h1044_2(moom.Oo p0) throws Throwable {
    throw __call1104402_0(p0);
}
public static void h1044_3(moom.Oo p0) throws Throwable {
    throw __call1104403_0(p0);
}
private static native long __fieldRead1044_0() throws Throwable;
private static native int[] __call1044_1() throws Throwable;
private static native void __call1044_2(moom.hF a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1044_3(moom.hF a0) throws Throwable;
private static native java.lang.String __fieldRead1044_4(moom.hF a0) throws Throwable;
private static native int __fieldRead1044_5(moom.hF a0) throws Throwable;
private static native int __invokedynamic1044_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1044_7(int a0, long a1) throws Throwable;
private static native void __call1044_8(moom.hF a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native java.lang.String __fieldRead1044_9(moom.hF a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead1044_10(moom.hF a0) throws Throwable;
private static native java.lang.String __fieldRead1044_11(moom.hF a0) throws Throwable;
private static native int __fieldRead1044_12(moom.hF a0) throws Throwable;
private static native int __fieldRead1044_13(moom.hF a0) throws Throwable;
private static native int __invokedynamic1044_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic1044_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic1044_16(int a0, long a1) throws Throwable;
private static native void __call1044_17(moom.hF a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native long __call1044_18() throws Throwable;
private static native long __fieldRead1044_19(moom.hF a0) throws Throwable;
private static native int __numericCompare1044_20(long a0, long a1) throws Throwable;
private static native void __fieldWrite1044_21(moom.hF a0, java.lang.Object a1) throws Throwable;
private static native void __call1044_22(moom.hF a0, java.lang.Object a1) throws Throwable;
private static native void __call1044_23(moom.hF a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1104400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5169ee7e7a8d6e9dec78(moom.hF a0, java.lang.String a1) throws E;
private static final class __SourceHandler_5169ee7e7a8d6e9dec78 {

public static void f1764(moom.hF receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead1764_0() ^ 18923543913568L);
    __fieldWrite1764_1(receiver, p0);
    moom.gu spill1764_0 = __fieldRead1764_2(receiver);
    __fieldWrite1764_3(spill1764_0, ((p0 != null) ? 1 : 0));
    return;
}
public static void h1764_0(moom.Oo p0) throws Throwable {
    throw __call1176400_0(p0);
}
private static native long __fieldRead1764_0() throws Throwable;
private static native void __fieldWrite1764_1(moom.hF a0, java.lang.String a1) throws Throwable;
private static native moom.gu __fieldRead1764_2(moom.hF a0) throws Throwable;
private static native void __fieldWrite1764_3(moom.gu a0, int a1) throws Throwable;
private static native java.lang.Exception __call1176400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e9f908672e8749a4682c(moom.hF a0, moom.gc a1) throws E;
private static final class __SourceHandler_e9f908672e8749a4682c {

public static void f436(moom.hF receiver, moom.gc p0) throws Throwable {
    int forwardValue436_13_0;
    int forwardValue436_33_0;
    int forwardValue436_33_1;
    int forwardValue436_186_0;
    int forwardValue436_186_1;
    int forwardValue436_228_0;
    int forwardValue436_228_1;
    java.lang.String forwardValue436_236_0;
    boolean spill436_0;
    int spill436_1;
    int spill436_2;
    long spill436_3;
    java.lang.String spill436_4;
    java.lang.String spill436_5;
    java.lang.String spill436_6;
    long life2_3;
    int[] life4_5;
    java.lang.String life5_56;
    java.lang.String life6_67;
    java.lang.String life7_75;
    java.util.Random life8_79;
    java.util.Random life9_88;
    java.math.BigInteger life10_98;
    java.math.BigInteger life11_108;
    java.math.BigInteger life12_112;
    java.lang.String life13_120;
    java.lang.String life16_134;
    java.lang.String life17_135;
    java.lang.String life18_136;
    java.lang.String life14_152;
    int life15_158;
    long life5_305;
    long life7_309;
    forward_join_237: {
    forward_join_236: {
    forward_join_228: {
    forward_join_221: {
    forward_join_186: {
    forward_join_179: {
    forward_join_176: {
    forward_join_163: {
    forward_join_33: {
    forward_join_26: {
    forward_join_13: {
    life2_3 = (__fieldRead436_0() ^ 2029382727829L);
    life4_5 = __call436_1();
    spill436_0 = __fieldRead436_2(p0);
    if (!((life4_5 == null))) {
        forwardValue436_13_0 = __integerCategory436_3(spill436_0);
        break forward_join_13;
    }
    if (!(spill436_0)) {
        break forward_join_237;
    }
    forwardValue436_13_0 = __fieldRead436_4(p0);
    }
    spill436_1 = __invokedynamic436_5(29850, (3048517388961169137L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue436_33_0 = forwardValue436_13_0;
        forwardValue436_33_1 = spill436_1;
        break forward_join_33;
    }
    if (!((forwardValue436_13_0 == spill436_1))) {
        break forward_join_26;
    }
    __call436_8(__fieldRead436_6(receiver), __fieldRead436_7(receiver));
    }
    forwardValue436_33_0 = __fieldRead436_9(p0);
    forwardValue436_33_1 = __invokedynamic436_10(15270, (8725511813395542464L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue436_186_0 = forwardValue436_33_0;
        forwardValue436_186_1 = forwardValue436_33_1;
        break forward_join_186;
    }
    if (!((forwardValue436_33_0 == forwardValue436_33_1))) {
        break forward_join_179;
    }
    life5_56 = __call436_14(__call436_13(__call436_12(__fieldRead436_11(receiver))));
    spill436_2 = 25699;
    life6_67 = __call436_20(__call436_19(__call436_18(__call436_17(__call436_16(__fieldRead436_15(receiver))))), "-", "");
    spill436_3 = (286648862466949075L ^ life2_3);
    life7_75 = __call436_23(__call436_22(__fieldRead436_21(receiver)));
    life8_79 = new java.util.Random();
    life9_88 = new java.util.Random(((long) __call436_24(new java.lang.Object())));
    life10_98 = new java.math.BigInteger(__invokedynamic436_25(11064, (1655292778829144409L ^ life2_3)), life8_79);
    life11_108 = new java.math.BigInteger(__invokedynamic436_26(21556, (7183795042198298196L ^ life2_3)), life9_88);
    life12_112 = __call436_27(life10_98, life11_108);
    life13_120 = __call436_29(life12_112, __invokedynamic436_28(2860, (7114054614277701973L ^ life2_3)));
    __call436_35(__call436_31(__fieldRead436_30(receiver)), __call436_34(__call436_33(__fieldRead436_32(receiver))), life7_75, life13_120);
    spill436_4 = life6_67;
    spill436_5 = life5_56;
    life16_134 = life13_120;
    life17_135 = spill436_5;
    life18_136 = spill436_4;
    life14_152 = __invokedynamic436_39(__invokedynamic436_36(spill436_2, spill436_3), life18_136, __invokedynamic436_37(16782, (4909701367397161521L ^ life2_3)), life17_135, __invokedynamic436_38(897, (7192480106617788464L ^ life2_3)), life16_134);
    life15_158 = __integerCategory436_41(__call436_40(new java.net.URI(life14_152)));
    if (!((life4_5 == null))) {
        break forward_join_176;
    }
    if (!((life15_158 != 0))) {
        break forward_join_163;
    }
    __call436_45(receiver, __call436_43(__invokedynamic436_42(23065, (2604247561776857506L ^ life2_3))), __invokedynamic436_44(17461, (7857168291141010303L ^ life2_3)));
    if (!((life4_5 != null))) {
        break forward_join_179;
    }
    }
    __call436_49(receiver, __call436_47(__invokedynamic436_46(16827, (799071802195778060L ^ life2_3))), __invokedynamic436_48(9761, (463030876564431209L ^ life2_3)));
    }
    __call436_50(receiver, life14_152);
    }
    forwardValue436_186_0 = __fieldRead436_51(p0);
    forwardValue436_186_1 = __invokedynamic436_52(25256, (5394045136450496714L ^ life2_3));
    }
    if (!((life4_5 == null))) {
        forwardValue436_228_0 = forwardValue436_186_0;
        forwardValue436_228_1 = forwardValue436_186_1;
        break forward_join_228;
    }
    if (!((forwardValue436_186_0 == forwardValue436_186_1))) {
        break forward_join_221;
    }
    __call436_56(receiver, __call436_54(__invokedynamic436_53(17179, (4826943759163005091L ^ life2_3))), __invokedynamic436_55(19827, (4195422629923277370L ^ life2_3)));
    if (!((__fieldRead436_58(__fieldRead436_57(receiver)) != null))) {
        break forward_join_221;
    }
    life5_305 = __invokedynamic436_59(8416, (7743383336169285547L ^ life2_3));
    life7_309 = (__call436_60() + life5_305);
    __call436_63(__fieldRead436_62(__fieldRead436_61(receiver)), life7_309);
    }
    forwardValue436_228_0 = __fieldRead436_64(p0);
    forwardValue436_228_1 = __invokedynamic436_65(2482, (7844096609502938056L ^ life2_3));
    }
    if (!((forwardValue436_228_0 == forwardValue436_228_1))) {
        break forward_join_237;
    }
    spill436_6 = __fieldRead436_66(receiver);
    if (!((life4_5 == null))) {
        forwardValue436_236_0 = spill436_6;
        break forward_join_236;
    }
    if (!((spill436_6 != null))) {
        break forward_join_237;
    }
    forwardValue436_236_0 = __fieldRead436_67(receiver);
    }
    __call436_68(forwardValue436_236_0);
    }
    return;
}
public static void h436_0(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043600_0(p0);
}
public static void h436_1(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043601_0(p0);
}
public static void h436_2(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043602_0(p0);
}
public static void h436_3(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043603_0(p0);
}
public static void h436_4(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043604_0(p0);
}
public static void h436_5(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043605_0(p0);
}
public static void h436_6(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043606_0(p0);
}
public static void h436_7(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043607_0(p0);
}
public static void h436_8(com.mojang.authlib.exceptions.InvalidCredentialsException p0, moom.hF p1, moom.gc p2, long p3, int[] p4) throws Throwable {
    int forwardValue3043608_92_0;
    int forwardValue3043608_92_1;
    java.lang.String forwardValue3043608_100_0;
    java.lang.String spill3043608_0;
    java.lang.String spill3043608_1;
    java.lang.Object[] spill3043608_2;
    java.lang.String spill3043608_3;
    int spill3043608_4;
    int spill3043608_5;
    java.lang.String spill3043608_6;
    com.mojang.authlib.exceptions.InvalidCredentialsException life6_2;
    long life6_79;
    long life8_83;
    forward_join_101: {
    forward_join_100: {
    forward_join_92: {
    forward_join_85: {
    life6_2 = p0;
    spill3043608_0 = __call3043608_1(__invokedynamic3043608_0(11857, (139984184255411682L ^ p3)), new java.lang.Object[0]);
    spill3043608_1 = __invokedynamic3043608_2(9152, (6897794674104662121L ^ p3));
    java.lang.Object[] __stackOp3043608_3_0 = new java.lang.Object[1];
    spill3043608_2 = __stackOp3043608_3_0;
    (__stackOp3043608_3_0)[0] = __call3043608_4(life6_2);
    __call3043608_6(spill3043608_0, __call3043608_5(spill3043608_1, spill3043608_2));
    __call3043608_8(__invokedynamic3043608_7(15623, (7364789457947584179L ^ p3)));
    spill3043608_3 = __call3043608_10(__call3043608_9(life6_2));
    java.lang.String __stackOp3043608_13_0 = __call3043608_11(life6_2);
    java.lang.String __stackOp3043608_13_1 = __invokedynamic3043608_12(11087, (5806476007215591677L ^ p3));
    __call3043608_15(__invokedynamic3043608_14(spill3043608_3, __stackOp3043608_13_1, __stackOp3043608_13_0));
    spill3043608_4 = __fieldRead3043608_16(p2);
    spill3043608_5 = __invokedynamic3043608_17(25256, (5394045136450496714L ^ p3));
    if (!((p4 == null))) {
        forwardValue3043608_92_0 = spill3043608_4;
        forwardValue3043608_92_1 = spill3043608_5;
        break forward_join_92;
    }
    if (!((spill3043608_4 == spill3043608_5))) {
        break forward_join_85;
    }
    __call3043608_21(p1, __call3043608_19(__invokedynamic3043608_18(17179, (4826943759163005091L ^ p3))), __invokedynamic3043608_20(19827, (4195422629923277370L ^ p3)));
    if (!((__fieldRead3043608_23(__fieldRead3043608_22(p1)) != null))) {
        break forward_join_85;
    }
    life6_79 = __invokedynamic3043608_24(8416, (7743383336169285547L ^ p3));
    life8_83 = (__call3043608_25() + life6_79);
    __call3043608_28(__fieldRead3043608_27(__fieldRead3043608_26(p1)), life8_83);
    }
    forwardValue3043608_92_0 = __fieldRead3043608_29(p2);
    forwardValue3043608_92_1 = __invokedynamic3043608_30(2482, (7844096609502938056L ^ p3));
    }
    if (!((forwardValue3043608_92_0 == forwardValue3043608_92_1))) {
        break forward_join_101;
    }
    spill3043608_6 = __fieldRead3043608_31(p1);
    if (!((p4 == null))) {
        forwardValue3043608_100_0 = spill3043608_6;
        break forward_join_100;
    }
    if (!((spill3043608_6 != null))) {
        break forward_join_101;
    }
    forwardValue3043608_100_0 = __fieldRead3043608_32(p1);
    }
    __call3043608_33(forwardValue3043608_100_0);
    }
    return;
}
public static void h436_9(java.lang.Exception p0, moom.hF p1, moom.gc p2, long p3, int[] p4) throws Throwable {
    int forwardValue3043609_70_0;
    int forwardValue3043609_70_1;
    java.lang.String forwardValue3043609_78_0;
    java.lang.String spill3043609_0;
    int spill3043609_1;
    int spill3043609_2;
    java.lang.String spill3043609_3;
    java.lang.Exception life6_2;
    long life6_56;
    long life8_60;
    forward_join_79: {
    forward_join_78: {
    forward_join_70: {
    forward_join_63: {
    life6_2 = p0;
    __call3043609_1(__invokedynamic3043609_0(25297, (2611364869611960676L ^ p3)));
    spill3043609_0 = __call3043609_3(__call3043609_2(life6_2));
    java.lang.String __stackOp3043609_6_0 = __call3043609_4(life6_2);
    java.lang.String __stackOp3043609_6_1 = __invokedynamic3043609_5(689, (6133740021109020940L ^ p3));
    __call3043609_8(__invokedynamic3043609_7(spill3043609_0, __stackOp3043609_6_1, __stackOp3043609_6_0));
    spill3043609_1 = __fieldRead3043609_9(p2);
    spill3043609_2 = __invokedynamic3043609_10(25256, (5394045136450496714L ^ p3));
    if (!((p4 == null))) {
        forwardValue3043609_70_0 = spill3043609_1;
        forwardValue3043609_70_1 = spill3043609_2;
        break forward_join_70;
    }
    if (!((spill3043609_1 == spill3043609_2))) {
        break forward_join_63;
    }
    __call3043609_14(p1, __call3043609_12(__invokedynamic3043609_11(17179, (4826943759163005091L ^ p3))), __invokedynamic3043609_13(19827, (4195422629923277370L ^ p3)));
    if (!((__fieldRead3043609_16(__fieldRead3043609_15(p1)) != null))) {
        break forward_join_63;
    }
    life6_56 = __invokedynamic3043609_17(8416, (7743383336169285547L ^ p3));
    life8_60 = (__call3043609_18() + life6_56);
    __call3043609_21(__fieldRead3043609_20(__fieldRead3043609_19(p1)), life8_60);
    }
    forwardValue3043609_70_0 = __fieldRead3043609_22(p2);
    forwardValue3043609_70_1 = __invokedynamic3043609_23(2482, (7844096609502938056L ^ p3));
    }
    if (!((forwardValue3043609_70_0 == forwardValue3043609_70_1))) {
        break forward_join_79;
    }
    spill3043609_3 = __fieldRead3043609_24(p1);
    if (!((p4 == null))) {
        forwardValue3043609_78_0 = spill3043609_3;
        break forward_join_78;
    }
    if (!((spill3043609_3 != null))) {
        break forward_join_79;
    }
    forwardValue3043609_78_0 = __fieldRead3043609_25(p1);
    }
    __call3043609_26(forwardValue3043609_78_0);
    }
    return;
}
public static void h436_10(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043610_0(p0);
}
public static void h436_11(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043611_0(p0);
}
public static void h436_12(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043612_0(p0);
}
public static void h436_13(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043613_0(p0);
}
public static void h436_14(com.mojang.authlib.exceptions.InvalidCredentialsException p0) throws Throwable {
    throw __call3043614_0(p0);
}
private static native long __fieldRead436_0() throws Throwable;
private static native int[] __call436_1() throws Throwable;
private static native boolean __fieldRead436_2(moom.gc a0) throws Throwable;
private static native int __integerCategory436_3(boolean value) throws Throwable;
private static native int __fieldRead436_4(moom.gc a0) throws Throwable;
private static native int __invokedynamic436_5(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_6(moom.hF a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead436_7(moom.hF a0) throws Throwable;
private static native void __call436_8(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead436_9(moom.gc a0) throws Throwable;
private static native int __invokedynamic436_10(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_11(moom.hF a0) throws Throwable;
private static native net.minecraft.util.Session __call436_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call436_13(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __call436_14(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_15(moom.hF a0) throws Throwable;
private static native net.minecraft.util.Session __call436_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call436_17(net.minecraft.util.Session a0) throws Throwable;
private static native java.util.UUID __call436_18(com.mojang.authlib.GameProfile a0) throws Throwable;
private static native java.lang.String __call436_19(java.util.UUID a0) throws Throwable;
private static native java.lang.String __call436_20(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_21(moom.hF a0) throws Throwable;
private static native net.minecraft.util.Session __call436_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call436_23(net.minecraft.util.Session a0) throws Throwable;
private static native int __call436_24(java.lang.Object a0) throws Throwable;
private static native int __invokedynamic436_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic436_26(int a0, long a1) throws Throwable;
private static native java.math.BigInteger __call436_27(java.math.BigInteger a0, java.math.BigInteger a1) throws Throwable;
private static native int __invokedynamic436_28(int a0, long a1) throws Throwable;
private static native java.lang.String __call436_29(java.math.BigInteger a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_30(moom.hF a0) throws Throwable;
private static native com.mojang.authlib.minecraft.MinecraftSessionService __call436_31(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_32(moom.hF a0) throws Throwable;
private static native net.minecraft.util.Session __call436_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.mojang.authlib.GameProfile __call436_34(net.minecraft.util.Session a0) throws Throwable;
private static native void __call436_35(com.mojang.authlib.minecraft.MinecraftSessionService a0, com.mojang.authlib.GameProfile a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.String __invokedynamic436_36(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic436_37(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic436_38(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic436_39(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native boolean __call436_40(java.net.URI a0) throws Throwable;
private static native int __integerCategory436_41(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic436_42(int a0, long a1) throws Throwable;
private static native java.lang.String __call436_43(java.lang.String a0) throws Throwable;
private static native long __invokedynamic436_44(int a0, long a1) throws Throwable;
private static native void __call436_45(moom.hF a0, java.lang.String a1, long a2) throws Throwable;
private static native java.lang.String __invokedynamic436_46(int a0, long a1) throws Throwable;
private static native java.lang.String __call436_47(java.lang.String a0) throws Throwable;
private static native long __invokedynamic436_48(int a0, long a1) throws Throwable;
private static native void __call436_49(moom.hF a0, java.lang.String a1, long a2) throws Throwable;
private static native void __call436_50(moom.hF a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead436_51(moom.gc a0) throws Throwable;
private static native int __invokedynamic436_52(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic436_53(int a0, long a1) throws Throwable;
private static native java.lang.String __call436_54(java.lang.String a0) throws Throwable;
private static native long __invokedynamic436_55(int a0, long a1) throws Throwable;
private static native void __call436_56(moom.hF a0, java.lang.String a1, long a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_57(moom.hF a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead436_58(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic436_59(int a0, long a1) throws Throwable;
private static native long __call436_60() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead436_61(moom.hF a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead436_62(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call436_63(net.minecraft.client.entity.EntityPlayerSP a0, long a1) throws Throwable;
private static native int __fieldRead436_64(moom.gc a0) throws Throwable;
private static native int __invokedynamic436_65(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead436_66(moom.hF a0) throws Throwable;
private static native java.lang.String __fieldRead436_67(moom.hF a0) throws Throwable;
private static native void __call436_68(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3043600_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043601_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043602_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043603_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043604_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043605_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043606_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043607_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.String __invokedynamic3043608_0(int a0, long a1) throws Throwable;
private static native java.lang.String __call3043608_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic3043608_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call3043608_4(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.String __call3043608_5(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call3043608_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3043608_7(int a0, long a1) throws Throwable;
private static native void __call3043608_8(java.lang.String a0) throws Throwable;
private static native java.lang.Class __call3043608_9(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.String __call3043608_10(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call3043608_11(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.String __invokedynamic3043608_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3043608_14(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3043608_15(java.lang.String a0) throws Throwable;
private static native int __fieldRead3043608_16(moom.gc a0) throws Throwable;
private static native int __invokedynamic3043608_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3043608_18(int a0, long a1) throws Throwable;
private static native java.lang.String __call3043608_19(java.lang.String a0) throws Throwable;
private static native long __invokedynamic3043608_20(int a0, long a1) throws Throwable;
private static native void __call3043608_21(moom.hF a0, java.lang.String a1, long a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043608_22(moom.hF a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3043608_23(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic3043608_24(int a0, long a1) throws Throwable;
private static native long __call3043608_25() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043608_26(moom.hF a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3043608_27(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3043608_28(net.minecraft.client.entity.EntityPlayerSP a0, long a1) throws Throwable;
private static native int __fieldRead3043608_29(moom.gc a0) throws Throwable;
private static native int __invokedynamic3043608_30(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead3043608_31(moom.hF a0) throws Throwable;
private static native java.lang.String __fieldRead3043608_32(moom.hF a0) throws Throwable;
private static native void __call3043608_33(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3043609_0(int a0, long a1) throws Throwable;
private static native void __call3043609_1(java.lang.String a0) throws Throwable;
private static native java.lang.Class __call3043609_2(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call3043609_3(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call3043609_4(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3043609_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3043609_7(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3043609_8(java.lang.String a0) throws Throwable;
private static native int __fieldRead3043609_9(moom.gc a0) throws Throwable;
private static native int __invokedynamic3043609_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3043609_11(int a0, long a1) throws Throwable;
private static native java.lang.String __call3043609_12(java.lang.String a0) throws Throwable;
private static native long __invokedynamic3043609_13(int a0, long a1) throws Throwable;
private static native void __call3043609_14(moom.hF a0, java.lang.String a1, long a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043609_15(moom.hF a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3043609_16(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __invokedynamic3043609_17(int a0, long a1) throws Throwable;
private static native long __call3043609_18() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043609_19(moom.hF a0) throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead3043609_20(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call3043609_21(net.minecraft.client.entity.EntityPlayerSP a0, long a1) throws Throwable;
private static native int __fieldRead3043609_22(moom.gc a0) throws Throwable;
private static native int __invokedynamic3043609_23(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead3043609_24(moom.hF a0) throws Throwable;
private static native java.lang.String __fieldRead3043609_25(moom.hF a0) throws Throwable;
private static native void __call3043609_26(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call3043610_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043611_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043612_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043613_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;
private static native java.lang.Exception __call3043614_0(com.mojang.authlib.exceptions.InvalidCredentialsException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ca3bf198f709163d3a48(moom.hF a0) throws E;
private static final class __SourceHandler_ca3bf198f709163d3a48 {

public static void f1766(moom.hF receiver) throws Throwable {
    long life1_3;
    int life4_6;
    int life4_20;
    int[] life3_143;
    int life4_151;
    int life4_228;
    life1_3 = (__fieldRead1766_0() ^ 72931447236980L);
    int[] spill1766_0 = __call1766_1();
    life4_6 = 0;
    __fieldWrite1766_4(receiver, __call1766_3(__invokedynamic1766_2(23757, (5597842953617774226L ^ life1_3)), new java.lang.Object[0]));
    life4_20 = (life4_6 + 2);
    __call1766_16(__fieldRead1766_5(receiver), new moom.gu(__invokedynamic1766_6(32509, (2688796219692885351L ^ life1_3)), ((__fieldRead1766_7(receiver) / 2) - __invokedynamic1766_8(10809, (1989552418279813565L ^ life1_3))), ((__fieldRead1766_9(receiver) / __invokedynamic1766_10(7929, (5908601262914717030L ^ life1_3))) + (__invokedynamic1766_11(29630, (1715761327590254652L ^ life1_3)) * (life4_20 >> 1))), __invokedynamic1766_12(2427, (2979324867247559404L ^ life1_3)), __invokedynamic1766_13(22928, (3658983870032675332L ^ life1_3)), __call1766_15(__invokedynamic1766_14(29542, (3730640129258142001L ^ life1_3)), new java.lang.Object[0])));
    __call1766_29(__fieldRead1766_17(receiver), new moom.gu(__invokedynamic1766_18(23006, (8676356875776328268L ^ life1_3)), (((__fieldRead1766_19(receiver) / 2) - __invokedynamic1766_20(26529, (8605361996615826468L ^ life1_3))) + __invokedynamic1766_21(22697, (3728289215209734965L ^ life1_3))), ((__fieldRead1766_22(receiver) / __invokedynamic1766_23(7929, (5908601262914717030L ^ life1_3))) + (__invokedynamic1766_24(4514, (3594418426977765951L ^ life1_3)) * (life4_20 >> 1))), __invokedynamic1766_25(10522, (6419647584616247946L ^ life1_3)), __invokedynamic1766_26(22928, (3658983870032675332L ^ life1_3)), __call1766_28(__invokedynamic1766_27(31144, (8412774812485268467L ^ life1_3)), new java.lang.Object[0])));
    life3_143 = spill1766_0;
    life4_151 = (life4_20 + __invokedynamic1766_30(7929, (5908601262914717030L ^ life1_3)));
    __fieldWrite1766_41(receiver, new moom.gu(__invokedynamic1766_31(7956, (7656463166554489994L ^ life1_3)), ((__fieldRead1766_32(receiver) / 2) - __invokedynamic1766_33(29267, (799519437644933573L ^ life1_3))), ((__fieldRead1766_34(receiver) / __invokedynamic1766_35(7929, (5908601262914717030L ^ life1_3))) + (__invokedynamic1766_36(4514, (3594418426977765951L ^ life1_3)) * (life4_151 >> 1))), __invokedynamic1766_37(24193, (5955049966260552980L ^ life1_3)), __invokedynamic1766_38(22928, (3658983870032675332L ^ life1_3)), __call1766_40(__invokedynamic1766_39(25886, (4714578049577299779L ^ life1_3)), new java.lang.Object[0])));
    moom.gu spill1766_1 = __fieldRead1766_42(receiver);
    __fieldWrite1766_44(spill1766_1, ((__fieldRead1766_43(receiver) != null) ? 1 : 0));
    __call1766_47(__fieldRead1766_45(receiver), __fieldRead1766_46(receiver));
    life4_228 = (life4_151 + 4);
    __call1766_57(__fieldRead1766_48(receiver), new moom.gu(__invokedynamic1766_49(24193, (5955049966260552980L ^ life1_3)), ((__fieldRead1766_50(receiver) / 2) - __invokedynamic1766_51(23645, (7333533005297092548L ^ life1_3))), ((__fieldRead1766_52(receiver) / __invokedynamic1766_53(7929, (5908601262914717030L ^ life1_3))) + (__invokedynamic1766_54(4514, (3594418426977765951L ^ life1_3)) * (life4_228 >> 1))), __call1766_56(__invokedynamic1766_55(31904, (8949406833327683320L ^ life1_3)), new java.lang.Object[0])));
    if ((life3_143 != null)) {
        __call1766_58(new java.lang.String[3]);
    }
    return;
}
public static void h1766_0(moom.Oo p0) throws Throwable {
    throw __call1176600_0(p0);
}
public static void h1766_1(moom.Oo p0) throws Throwable {
    throw __call1176601_0(p0);
}
private static native long __fieldRead1766_0() throws Throwable;
private static native int[] __call1766_1() throws Throwable;
private static native java.lang.String __invokedynamic1766_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call1766_3(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1766_4(moom.hF a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead1766_5(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_7(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_8(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_9(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1766_14(int a0, long a1) throws Throwable;
private static native java.lang.String __call1766_15(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1766_16(java.util.List a0, moom.gu a1) throws Throwable;
private static native java.util.List __fieldRead1766_17(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_18(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_19(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_21(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_22(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1766_27(int a0, long a1) throws Throwable;
private static native java.lang.String __call1766_28(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1766_29(java.util.List a0, moom.gu a1) throws Throwable;
private static native int __invokedynamic1766_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_31(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_32(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_33(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_34(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_38(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1766_39(int a0, long a1) throws Throwable;
private static native java.lang.String __call1766_40(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1766_41(moom.hF a0, moom.gu a1) throws Throwable;
private static native moom.gu __fieldRead1766_42(moom.hF a0) throws Throwable;
private static native java.lang.String __fieldRead1766_43(moom.hF a0) throws Throwable;
private static native void __fieldWrite1766_44(moom.gu a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1766_45(moom.hF a0) throws Throwable;
private static native moom.gu __fieldRead1766_46(moom.hF a0) throws Throwable;
private static native boolean __call1766_47(java.util.List a0, moom.gu a1) throws Throwable;
private static native java.util.List __fieldRead1766_48(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_49(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_50(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_51(int a0, long a1) throws Throwable;
private static native int __fieldRead1766_52(moom.hF a0) throws Throwable;
private static native int __invokedynamic1766_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic1766_54(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1766_55(int a0, long a1) throws Throwable;
private static native java.lang.String __call1766_56(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call1766_57(java.util.List a0, moom.gu a1) throws Throwable;
private static native void __call1766_58(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call1176600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1176601_0(moom.Oo a0) throws Throwable;

}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.hF.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral7837_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17884);
    if (((moom.hF.M)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.hF.L)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.hF.N)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hF.N)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/hF", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.hF.M)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.hF.M)[life3_8])).longValue();
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public void c__Void() { __sourceHandlerCall_ca3bf198f709163d3a48(this); }


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hF.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7840_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2277;
      if (J[var3] == null) {
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
         long var5 = I[var3];
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
         Object[] var9 = (Object[])K.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               K.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hF", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         J[var3] = var15;
      }

      return J[var3];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6447);
    if (((moom.hF.F)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.hF.H)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hF.H)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/hF", life9_51);
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
        life9_116 = ((java.lang.String)((moom.hF.E)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.hF.F)[life5_8] = moom.hF.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.hF.F)[life5_8];
}


protected void a__Void(moom.gc p0) { __sourceHandlerCall_e9f908672e8749a4682c(this, p0); }


public void a(java.lang.String p0) { __sourceHandlerCall_5169ee7e7a8d6e9dec78(this, p0); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_6a021abccca8d1cfe6e0(this, p0, p1, p2); }


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
        byte[] spill4164_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4164_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4164_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4164_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4164_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4164_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void a(java.lang.String p0, long p1) {
this.y = ((java.lang.String)(p0));
    this.z = ((long)((java.lang.System.currentTimeMillis() + p1)));
    ((moom.hF)(this)).a(((java.lang.String)(null)));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.hF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7846_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7846_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7840_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral7837_0() throws E;
}
