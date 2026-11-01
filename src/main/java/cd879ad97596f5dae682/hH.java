package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hH extends moom.hD {

protected net.minecraft.client.gui.GuiScreen w;

protected java.lang.String x;

private moom.LI y;

private int z;

private moom.il A;

private boolean B;

private static float[] C;

private static java.lang.String[] D;

private static float[] E;

private static java.lang.String[] F;

private static long H;

private static java.lang.String[] I;

private static java.lang.String[] J;

private static java.util.Map K;

private static long[] L;

private static java.lang.Integer[] M;

private static java.util.Map N;

public hH(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) { super(); }

private static void __sourceConstructorBody_cc74e9a84546c201(moom.hH receiver, net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) throws Throwable {
long local3 = (moom.hH.H ^ 104841450231828L);
    moom.hH.__sourceConstructorInit_cc74e9a84546c201_0(((moom.hH)(receiver)));
    ((moom.hH)(receiver)).x = ((java.lang.String)(__sourceIntrinsic_cc74e9a84546c201_originalDynamicSite2820_2(21345, (706757470073490213L ^ local3))));
    ((moom.hH)(receiver)).y = ((moom.LI)(new moom.LI(receiver, new moom.LK())));
    ((moom.hH)(receiver)).z = ((int)(-1));
    ((moom.hH)(receiver)).B = ((boolean)(false));
    ((moom.hH)(receiver)).w = ((net.minecraft.client.gui.GuiScreen)(p0));
    return;
}


static {
H = ((long)(((moom._a)(moom._c.a(((long)(1468125784978516046L)), ((long)(-1874233651723454648L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134621050006732L)))));
    long local20_life6 = (moom.hH.H ^ 30792938660923L);
    K = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill863_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill863_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill863_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill863_14 = new byte[8];
    (__sourceSpill863_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill863_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation863_16 = __sourceSpill863_14;
    ((javax.crypto.Cipher)(__sourceSpill863_11)).init(((int)(__sourceSpill863_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill863_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation863_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[49];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "så\\·K;YL8FdH·dìN\030+ZÚýî_\032ÿvfûÓ&:ÈHâhx¿hµ@`j9Ô1\bsFç\bMkV6C\f\022·¿@\034_;5o ­(m\027¦­\035\017Ü©ûúÃønÞ¸òÔ\027g\001{L%b\022F£Ä¾\000Ñ m\0268Õäþ\0335â±8ñ'Â\006åòW¹¹âñàir\020Ks\f\023Å\020L£s]l>X7¹\033&çþzÓ\020\020\024È\"\003ågbdÆ\"°\004ú«í=\020ìqXø\býDTU@\007ß\032s ^Ó- jècÅ¯ï\001yÆ\030(ÐÀêí~W£\016s2£³\020\001ô\024Þºk«=8°úªxí\020ÈÅå\002gý>ld\003G.3y0ñ^j¬Á~¥q¦´\033,hån±Mâï\025Gö¿BÈ6±±cN­©i¸ßbLL<_:ó\020Ã\016þ¶°¸{í\nÌSÎ×`ÅÔ\020c\022øL\007³ÇäW³\0310yj/\020¦\000ÃKÂ\000H§7YR÷¾8Å![}8ÁÝ/\023Oû\023\rèbÒâ¯V¼`\177öQÎÎs¡{{n3©CÛ\033vöÆ\007ûÇi¿\"´b>\020[ªÔdOý*rÑ¿ñÚbå\020¤%¾yDG\týÿB\\~mw(ÔÁÒfí\177-J¢@|e¿Ù£kü~X\006s_ÑÄÁ\022(\001Å\005Ñ\fúÌK¾(Á©§AXjñè!ÇC|\021Ö\"Â\031lvmB{\fï.¥ö-fÂÎ' Î\020\023å¶'x>ÆáÊHu!ÔÍe\020\026\\W¤µ3ë\017\"%GX\020Õ\035£¤UÔ:r\032é\"NÐ¶\020Nâæùè\023Ì¡éY{ïlu\020'ÇÖ\r\re\036:(=lÞSÕÝ\030{sÛçT¤VÇ&Û¢Jo\031­4¾G+\r\001Ò(\034È/ú¨­jil»;\n§'Ï@\024w\035Òá\037²\022Ï×Â6Ø£ÄþP¸ ö\024&ä\007'ßgâ¨Ð%V\n\016¦Ú³oB+$«u=\034h¶\n ½~É\030X\025ïeÿ#î\032#+\000\006õ!ZÙ\030ÜNo.ØU!\023\020\024µn`öÇÉ1XÞð\004ô8çÑÒ®\035EÅ\025'\016\nC\036Ö,½«ä#\t\024&*ó_¯BW»Æ=\004\177ÑñÚ)[d\002Áß\017Ðkõ3¾ñ°Ö8\020WP½#é.\bãÜ°\026¯j¢\020¸öN¦kßÿNAt\b@Û|\020\026\006£/¶3æhoµðOøf\003$\020ÖÁ\002+5§]AÿÒÝ(0~\020kø\001<\017\021õb8\026­\003eôê\025\020P¯e\177ÈY\026XFÙ\021\nCí\020;K5ßî»\036=f6ºzN®û\020\017|Ç²Â{JyE»¨«Á­Y´ !»-¿±!Çô ¦\0208\003»z:·\bÔ\nÓ¯¨¯q\r­@{ôz\026óÞkxûÁ`íæBºc¹Úám¹³Á-©zÈóz\020\ba0\bc·-\bw\021+x8\033Idk·\017lÐI×Ï\0200î\002\\­:0þF[@¹¥Ï÷B\020ºº&§\016cDI\024y0ßO*7\020S÷h©\004)Ì\003¿.*\020%»Ñ¨ IgòbY ¨/z ÞÙÅ¹à¼ÆmÄð(Ëã=þQ\024\027ú\177;û\031ùr\0257(â`Z&8ªNî-$«ù¢\r\013°©ã$Uz¨k+µ·U\005\033!Üù2lô6¢\020çÁ÷qÖ2À¿6£kKR+["))).length();
    int local14_life24 = 16;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill863_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill863_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill863_29)).doFinal(((byte[])(__sourceSpill863_28)));
        java.lang.String __sourceSpill863_34 = ((java.lang.String)(moom.hH.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill863_35 = local18_life19;
        int __sourceSpill863_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill863_35)[__sourceSpill863_36] = __sourceSpill863_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "FTç\005lú¾lÀxÇ¨G!\021fµ~s\bÛB´\020ýe\t\013ª_«n/Þ,'y"))).length();
    local14_life24 = 24;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill863_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill863_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill863_42)).doFinal(((byte[])(__sourceSpill863_41)));
        java.lang.String __sourceSpill863_47 = ((java.lang.String)(moom.hH.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill863_48 = local18_life19;
        int __sourceSpill863_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill863_48)[__sourceSpill863_49] = __sourceSpill863_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    I = ((java.lang.String[])(local18_life19));
    J = ((java.lang.String[])(new java.lang.String[49]));
    N = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill863_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill863_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill863_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill863_60 = new byte[8];
    (__sourceSpill863_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill863_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation863_62 = __sourceSpill863_60;
    ((javax.crypto.Cipher)(__sourceSpill863_57)).init(((int)(__sourceSpill863_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill863_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation863_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[40];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "F\000&}Gb\fÂ&/ÅÉÖ5¹HýO\003Ä.Ìâ®¹OxpNd8\fUÏ´¬ã£¡ô\003wç}\\\030¾\026îRêæÏæ<ÝT\026PÚæ¾\002X\037ü&1t\râ[_¯ó´ÚÀÖõá~\005µ}ÝfÐY\0072\037ÐÍñ\r,²:²|Íè¶\017ñ]EFøz;ÑÔ×\016Ä^\037Ä\034áeKr]@{szwèå\003\021\0231µÇ¡ñâ\023WP¬Û\001\005ÅGËáW\003±=+\024úÙ\nÏ·µP¶Íi{×\025ÿÑ¼\032°sÖÐ8sE:-V'pwÂµêþØGho@jÈ´\\ÿ8\024bÇqéH©ð2\030\000ÑVBbhì¢¨ë\013\016aÊ­\\K6Òóý\001ë$°ë®íèÇªçÞ©¤ZÛ ~À³&\005w\177¨ïë|Xý8Ì"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill863_71 = local4_life67;
        int __sourceSpill863_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill863_71)).substring(((int)(__sourceSpill863_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill863_76 = local6_life65;
        int __sourceSpill863_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill863_79 = new byte[8];
        (__sourceSpill863_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill863_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill863_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill863_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill863_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill863_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill863_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill863_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill863_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill863_80)).doFinal(((byte[])(__sourceSpill863_79)));
        (__sourceSpill863_76)[__sourceSpill863_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ùÑú³>Ã\013âU\034WÆ\007yZ\003"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill863_84 = local4_life67;
        int __sourceSpill863_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill863_84)).substring(((int)(__sourceSpill863_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill863_89 = local6_life65;
        int __sourceSpill863_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill863_92 = new byte[8];
        (__sourceSpill863_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill863_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill863_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill863_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill863_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill863_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill863_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill863_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill863_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill863_93)).doFinal(((byte[])(__sourceSpill863_92)));
        (__sourceSpill863_89)[__sourceSpill863_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    L = ((long[])(local6_life65));
    M = ((java.lang.Integer[])(new java.lang.Integer[40]));
    float[] __sourceSpill863_99 = new float[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_98(14904, (2008294212529752500L ^ local20_life6))];
    (__sourceSpill863_99)[0] = 0x1.0p-1f;
    (__sourceSpill863_99)[1] = 0x1.333334p-1f;
    (__sourceSpill863_99)[2] = 0x1.555556p-1f;
    (__sourceSpill863_99)[3] = 0x1.8p-1f;
    (__sourceSpill863_99)[4] = 0x1.aaaaaap-1f;
    (__sourceSpill863_99)[5] = 0x1.ccccccp-1f;
    (__sourceSpill863_99)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_100(30950, (2525682346113485677L ^ local20_life6))] = 0x1.0p0f;
    (__sourceSpill863_99)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_101(1089, (3803569323877218274L ^ local20_life6))] = 0x1.2aaaaap0f;
    (__sourceSpill863_99)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_102(31168, (7842433958801230462L ^ local20_life6))] = 0x1.555556p0f;
    (__sourceSpill863_99)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_103(24122, (7173175927751994766L ^ local20_life6))] = 0x1.8p0f;
    (__sourceSpill863_99)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_104(9573, (267376796372113109L ^ local20_life6))] = 0x1.aaaaaap0f;
    (__sourceSpill863_99)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_105(14046, (5568309272921638261L ^ local20_life6))] = 0x1.ccccccp0f;
    (__sourceSpill863_99)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_106(17876, (60393752946079348L ^ local20_life6))] = 0x1.0p1f;
    C = ((float[])(__sourceSpill863_99));
    java.lang.String[] __sourceSpill863_110 = new java.lang.String[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_108(9695, (8486162885958407805L ^ local20_life6))];
    (__sourceSpill863_110)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_109(22047, (1371013616411325007L ^ local20_life6));
    (__sourceSpill863_110)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_111(4818, (4592736867785012899L ^ local20_life6));
    (__sourceSpill863_110)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_112(31977, (614500265909098687L ^ local20_life6));
    (__sourceSpill863_110)[3] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_113(27556, (2542694543760429020L ^ local20_life6));
    (__sourceSpill863_110)[4] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_114(23253, (5841297128615952061L ^ local20_life6));
    (__sourceSpill863_110)[5] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_115(18017, (412264684266168895L ^ local20_life6));
    (__sourceSpill863_110)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_116(30950, (2525682346113485677L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_117(3161, (3188988254072596514L ^ local20_life6));
    (__sourceSpill863_110)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_118(1089, (3803569323877218274L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_119(19267, (8799570476440203047L ^ local20_life6));
    (__sourceSpill863_110)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_120(31168, (7842433958801230462L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_121(874, (1213375504133154622L ^ local20_life6));
    (__sourceSpill863_110)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_122(14078, (2997848353554761040L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_123(7134, (8833129310939381666L ^ local20_life6));
    (__sourceSpill863_110)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_124(9573, (267376796372113109L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_125(13321, (201634309773709416L ^ local20_life6));
    (__sourceSpill863_110)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_126(3631, (6098275741804707218L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_127(22446, (8844570243746608106L ^ local20_life6));
    (__sourceSpill863_110)[__sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_128(2035, (8907940826246460484L ^ local20_life6))] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_129(139, (8575761542213592315L ^ local20_life6));
    D = ((java.lang.String[])(__sourceSpill863_110));
    float[] __sourceSpill863_131 = new float[3];
    (__sourceSpill863_131)[0] = 0x1.0p-4f;
    (__sourceSpill863_131)[1] = 0x1.0p-3f;
    (__sourceSpill863_131)[2] = 0x1.0p-2f;
    E = ((float[])(__sourceSpill863_131));
    java.lang.String[] __sourceSpill863_134 = new java.lang.String[3];
    (__sourceSpill863_134)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_133(6045, (2523196285056283591L ^ local20_life6));
    (__sourceSpill863_134)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_135(9037, (3480125230586087215L ^ local20_life6));
    (__sourceSpill863_134)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_136(10468, (4698381150280469654L ^ local20_life6));
    F = ((java.lang.String[])(__sourceSpill863_134));
}

private static native <E extends Throwable> void __sourceConstructorInit_cc74e9a84546c201_0(moom.hH a0) throws E;
private static native <E extends Throwable> int __sourceHandlerCall_b17f5e441a95130410e7() throws E;
private static final class __SourceHandler_b17f5e441a95130410e7 {

public static int f1045() throws Throwable {
    int forwardValue1045_33_0;
    int forwardValue1045_45_0;
    int forwardValue1045_57_0;
    int forwardValue1045_69_0;
    int forwardValue1045_81_0;
    int forwardValue1045_85_0;
    int forwardValue1045_87_0;
    net.minecraft.entity.Entity[] spill1045_0;
    boolean spill1045_1;
    long life0_3;
    java.lang.String life3_12;
    net.minecraft.entity.Entity[] life2_13;
    forward_join_87: {
    forward_join_86: {
    forward_join_85: {
    forward_join_81: {
    forward_join_74: {
    forward_join_69: {
    forward_join_62: {
    forward_join_57: {
    forward_join_50: {
    forward_join_45: {
    forward_join_38: {
    forward_join_33: {
    forward_join_26: {
    life0_3 = (__fieldRead1045_0() ^ 37617520984047L);
    spill1045_0 = __call1045_1();
    life3_12 = __call1045_4(__call1045_3(__invokedynamic1045_2(13798, (7294743020062689901L ^ life0_3))));
    life2_13 = spill1045_0;
    spill1045_1 = __call1045_6(life3_12, __invokedynamic1045_5(26275, (4175335228029376782L ^ life0_3)));
    if (!((life2_13 == null))) {
        forwardValue1045_33_0 = __integerCategory1045_7(spill1045_1);
        break forward_join_33;
    }
    if (!(spill1045_1)) {
        break forward_join_26;
    }
    forwardValue1045_87_0 = 1;
    break forward_join_87;
    }
    forwardValue1045_33_0 = __integerCategory1045_10(__call1045_9(life3_12, __invokedynamic1045_8(30441, (2966100153606146391L ^ life0_3))));
    }
    if (!((life2_13 == null))) {
        forwardValue1045_45_0 = forwardValue1045_33_0;
        break forward_join_45;
    }
    if (!((forwardValue1045_33_0 != 0))) {
        break forward_join_38;
    }
    forwardValue1045_87_0 = 2;
    break forward_join_87;
    }
    forwardValue1045_45_0 = __integerCategory1045_13(__call1045_12(life3_12, __invokedynamic1045_11(29991, (5040252077118392998L ^ life0_3))));
    }
    if (!((life2_13 == null))) {
        forwardValue1045_57_0 = forwardValue1045_45_0;
        break forward_join_57;
    }
    if (!((forwardValue1045_45_0 != 0))) {
        break forward_join_50;
    }
    forwardValue1045_87_0 = 3;
    break forward_join_87;
    }
    forwardValue1045_57_0 = __integerCategory1045_16(__call1045_15(life3_12, __invokedynamic1045_14(28772, (4445531004229980129L ^ life0_3))));
    }
    if (!((life2_13 == null))) {
        forwardValue1045_69_0 = forwardValue1045_57_0;
        break forward_join_69;
    }
    if (!((forwardValue1045_57_0 != 0))) {
        break forward_join_62;
    }
    forwardValue1045_87_0 = 3;
    break forward_join_87;
    }
    forwardValue1045_69_0 = __integerCategory1045_19(__call1045_18(life3_12, __invokedynamic1045_17(29769, (1920721798380096482L ^ life0_3))));
    }
    if (!((life2_13 == null))) {
        forwardValue1045_81_0 = forwardValue1045_69_0;
        break forward_join_81;
    }
    if (!((forwardValue1045_69_0 != 0))) {
        break forward_join_74;
    }
    forwardValue1045_87_0 = 4;
    break forward_join_87;
    }
    forwardValue1045_81_0 = __integerCategory1045_22(__call1045_21(life3_12, __invokedynamic1045_20(20340, (8896922088751640823L ^ life0_3))));
    }
    if (!((life2_13 == null))) {
        forwardValue1045_85_0 = forwardValue1045_81_0;
        break forward_join_85;
    }
    if (!((forwardValue1045_81_0 != 0))) {
        break forward_join_86;
    }
    forwardValue1045_85_0 = 4;
    }
    forwardValue1045_87_0 = forwardValue1045_85_0;
    break forward_join_87;
    }
    forwardValue1045_87_0 = 0;
    }
    return forwardValue1045_87_0;
}
public static void h1045_0(moom.Oo p0) throws Throwable {
    throw __call1104500_0(p0);
}
public static void h1045_1(moom.Oo p0) throws Throwable {
    throw __call1104501_0(p0);
}
public static void h1045_2(moom.Oo p0) throws Throwable {
    throw __call1104502_0(p0);
}
public static void h1045_3(moom.Oo p0) throws Throwable {
    throw __call1104503_0(p0);
}
public static void h1045_4(moom.Oo p0) throws Throwable {
    throw __call1104504_0(p0);
}
public static void h1045_5(moom.Oo p0) throws Throwable {
    throw __call1104505_0(p0);
}
public static void h1045_6(moom.Oo p0) throws Throwable {
    throw __call1104506_0(p0);
}
public static void h1045_7(moom.Oo p0) throws Throwable {
    throw __call1104507_0(p0);
}
public static void h1045_8(moom.Oo p0) throws Throwable {
    throw __call1104508_0(p0);
}
public static void h1045_9(moom.Oo p0) throws Throwable {
    throw __call1104509_0(p0);
}
public static void h1045_10(moom.Oo p0) throws Throwable {
    throw __call1104510_0(p0);
}
private static native long __fieldRead1045_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1045_1() throws Throwable;
private static native java.lang.String __invokedynamic1045_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call1045_3(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1045_4(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic1045_5(int a0, long a1) throws Throwable;
private static native boolean __call1045_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1045_7(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1045_8(int a0, long a1) throws Throwable;
private static native boolean __call1045_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1045_10(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1045_11(int a0, long a1) throws Throwable;
private static native boolean __call1045_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1045_13(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1045_14(int a0, long a1) throws Throwable;
private static native boolean __call1045_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1045_16(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1045_17(int a0, long a1) throws Throwable;
private static native boolean __call1045_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1045_19(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1045_20(int a0, long a1) throws Throwable;
private static native boolean __call1045_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1045_22(boolean value) throws Throwable;
private static native java.lang.Exception __call1104500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104510_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_66ffe025a5787ab6864e(float a0, float[] a1) throws E;
private static final class __SourceHandler_66ffe025a5787ab6864e {

public static int f1046(float p0, float[] p1) throws Throwable {
    int lexicalValue1046_33_0;
    net.minecraft.entity.Entity[] spill1046_0;
    int spill1046_1;
    long life2_3;
    int life5_6;
    net.minecraft.entity.Entity[] life4_7;
    float life6_15;
    lexical_join_33: {
    lexical_join_29: {
    life2_3 = (__fieldRead1046_0() ^ 60614534389925L);
    spill1046_0 = __call1046_1();
    life5_6 = 0;
    life4_7 = spill1046_0;
    lexical_cycle_8: while (true) {
    lexical_join_27: {
    lexical_join_26: {
    if (!((life5_6 < (p1).length))) {
        break lexical_join_29;
    }
    life6_15 = (p1)[life5_6];
    if (!((life4_7 == null))) {
        break lexical_join_27;
    }
    spill1046_1 = __numericCompare1046_2(life6_15, p0);
    if (!((life4_7 == null))) {
        lexicalValue1046_33_0 = spill1046_1;
        break lexical_join_33;
    }
    if (!((spill1046_1 >= 0))) {
        break lexical_join_26;
    }
    return life5_6;
    }
    life5_6 += 1;
    }
    if (!((life4_7 != null))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue1046_33_0 = ((p1).length - 1);
    }
    return lexicalValue1046_33_0;
}
public static void h1046_0(moom.Oo p0) throws Throwable {
    throw __call1104600_0(p0);
}
public static void h1046_1(moom.Oo p0) throws Throwable {
    throw __call1104601_0(p0);
}
public static void h1046_2(moom.Oo p0) throws Throwable {
    throw __call1104602_0(p0);
}
private static native long __fieldRead1046_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1046_1() throws Throwable;
private static native int __numericCompare1046_2(float a0, float a1) throws Throwable;
private static native java.lang.Exception __call1104600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_6f57fb6d3d10d23ad106(moom.hH a0, float a1, float[] a2, float a3, boolean a4, boolean a5) throws E;
private static final class __SourceHandler_6f57fb6d3d10d23ad106 {

public static float f1047(moom.hH receiver, float p0, float[] p1, float p2, boolean p3, boolean p4) throws Throwable {
    int forwardValue1047_15_0;
    int forwardValue1047_28_0;
    int forwardValue1047_33_0;
    int forwardValue1047_40_0;
    boolean spill1047_0;
    boolean spill1047_1;
    int spill1047_2;
    long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    int life9_20;
    forward_join_41: {
    forward_join_40: {
    forward_join_33: {
    forward_join_31: {
    forward_join_28: {
    forward_join_15: {
    forward_join_12: {
    life6_3 = (__fieldRead1047_0() ^ 42301568799052L);
    life8_5 = __call1047_1();
    spill1047_0 = p4;
    if (!((life8_5 == null))) {
        forwardValue1047_15_0 = __integerCategory1047_2(spill1047_0);
        break forward_join_15;
    }
    if (!(spill1047_0)) {
        break forward_join_12;
    }
    return p2;
    }
    forwardValue1047_15_0 = __call1047_3(p0, p1);
    }
    life9_20 = forwardValue1047_15_0;
    spill1047_1 = p3;
    if (!((life8_5 == null))) {
        forwardValue1047_33_0 = __integerCategory1047_4(spill1047_1);
        break forward_join_33;
    }
    if (!(spill1047_1)) {
        break forward_join_31;
    }
    life9_20 += 1;
    spill1047_2 = life9_20;
    if (!((life8_5 == null))) {
        forwardValue1047_28_0 = spill1047_2;
        break forward_join_28;
    }
    if (!((spill1047_2 >= (p1).length))) {
        break forward_join_41;
    }
    forwardValue1047_28_0 = 0;
    }
    life9_20 = forwardValue1047_28_0;
    if (!((life8_5 != null))) {
        break forward_join_41;
    }
    }
    life9_20 += -1;
    forwardValue1047_33_0 = life9_20;
    }
    if (!((life8_5 == null))) {
        forwardValue1047_40_0 = forwardValue1047_33_0;
        break forward_join_40;
    }
    if (!((forwardValue1047_33_0 < 0))) {
        break forward_join_41;
    }
    forwardValue1047_40_0 = ((p1).length - 1);
    }
    life9_20 = forwardValue1047_40_0;
    }
    return (p1)[life9_20];
}
public static void h1047_0(moom.Oo p0) throws Throwable {
    throw __call1104700_0(p0);
}
public static void h1047_1(moom.Oo p0) throws Throwable {
    throw __call1104701_0(p0);
}
public static void h1047_2(moom.Oo p0) throws Throwable {
    throw __call1104702_0(p0);
}
public static void h1047_3(moom.Oo p0) throws Throwable {
    throw __call1104703_0(p0);
}
public static void h1047_4(moom.Oo p0) throws Throwable {
    throw __call1104704_0(p0);
}
public static void h1047_5(moom.Oo p0) throws Throwable {
    throw __call1104705_0(p0);
}
public static void h1047_6(moom.Oo p0) throws Throwable {
    throw __call1104706_0(p0);
}
public static void h1047_7(moom.Oo p0) throws Throwable {
    throw __call1104707_0(p0);
}
public static void h1047_8(moom.Oo p0) throws Throwable {
    throw __call1104708_0(p0);
}
private static native long __fieldRead1047_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1047_1() throws Throwable;
private static native int __integerCategory1047_2(boolean value) throws Throwable;
private static native int __call1047_3(float a0, float[] a1) throws Throwable;
private static native int __integerCategory1047_4(boolean value) throws Throwable;
private static native java.lang.Exception __call1104700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104708_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_bd2a08fcdc90689540bb(int a0) throws E;
private static final class __SourceHandler_bd2a08fcdc90689540bb {

public static java.lang.String f1048(int p0) throws Throwable {
    int forwardValue1048_19_0;
    int forwardValue1048_19_1;
    java.lang.String forwardValue1048_27_0;
    int spill1048_0;
    int spill1048_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_19: {
    forward_join_17: {
    life1_3 = (__fieldRead1048_0() ^ 58802124509073L);
    life3_5 = __call1048_1();
    spill1048_0 = p0;
    spill1048_1 = 2;
    if (!((life3_5 == null))) {
        forwardValue1048_19_0 = spill1048_0;
        forwardValue1048_19_1 = spill1048_1;
        break forward_join_19;
    }
    if (!((spill1048_0 == spill1048_1))) {
        break forward_join_17;
    }
    forwardValue1048_27_0 = __invokedynamic1048_2(5575, (7336587117772544526L ^ life1_3));
    break forward_join_27;
    }
    forwardValue1048_19_0 = p0;
    forwardValue1048_19_1 = 4;
    }
    if (!((forwardValue1048_19_0 == forwardValue1048_19_1))) {
        break forward_join_26;
    }
    forwardValue1048_27_0 = __invokedynamic1048_3(5331, (307718850129009421L ^ life1_3));
    break forward_join_27;
    }
    forwardValue1048_27_0 = __call1048_4();
    }
    return forwardValue1048_27_0;
}
public static void h1048_0(moom.Oo p0) throws Throwable {
    throw __call1104800_0(p0);
}
public static void h1048_1(moom.Oo p0) throws Throwable {
    throw __call1104801_0(p0);
}
public static void h1048_2(moom.Oo p0) throws Throwable {
    throw __call1104802_0(p0);
}
private static native long __fieldRead1048_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1048_1() throws Throwable;
private static native java.lang.String __invokedynamic1048_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1048_3(int a0, long a1) throws Throwable;
private static native java.lang.String __call1048_4() throws Throwable;
private static native java.lang.Exception __call1104800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_75fc03b4ce6823551eea(moom.hH a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_75fc03b4ce6823551eea {

public static void f173(moom.hH receiver, int p0, int p1, float p2) throws Throwable {
    moom.hH forwardValue173_33_0;
    net.minecraft.entity.Entity[] spill173_0;
    moom.hH spill173_1;
    int spill173_2;
    java.lang.String spill173_3;
    java.lang.String spill173_4;
    long life4_3;
    net.minecraft.entity.Entity[] life6_7;
    java.lang.String life9_63;
    java.lang.String life10_64;
    java.lang.String life11_65;
    java.lang.String life7_84;
    int life8_89;
    forward_join_135: {
    forward_join_116: {
    forward_join_114: {
    forward_join_33: {
    forward_join_32: {
    life4_3 = (__fieldRead173_0() ^ 74986772007727L);
    spill173_0 = __call173_1();
    __call173_2(receiver);
    life6_7 = spill173_0;
    __call173_4(__fieldRead173_3(receiver), p0, p1, p2);
    spill173_1 = receiver;
    if (!((life6_7 == null))) {
        forwardValue173_33_0 = spill173_1;
        break forward_join_33;
    }
    if (!((__fieldRead173_5(spill173_1) <= 0))) {
        break forward_join_32;
    }
    __call173_7(__fieldRead173_6(receiver));
    moom.hH __stackOp173_8_0 = receiver;
    __fieldWrite173_11(__stackOp173_8_0, (__fieldRead173_9(__stackOp173_8_0) + __invokedynamic173_10(24455, (4807060532866695973L ^ life4_3))));
    }
    forwardValue173_33_0 = receiver;
    }
    __call173_18(forwardValue173_33_0, __fieldRead173_12(receiver), __invokedynamic173_14(__fieldRead173_13(receiver)), (__fieldRead173_15(receiver) / 2), __invokedynamic173_16(5161, (3453975041521518740L ^ life4_3)), __invokedynamic173_17(29286, (9118876581503987421L ^ life4_3)));
    spill173_2 = 4367;
    spill173_3 = __fieldRead173_19();
    spill173_4 = __fieldRead173_20();
    life9_63 = __fieldRead173_21();
    life10_64 = spill173_4;
    life11_65 = spill173_3;
    life7_84 = __invokedynamic173_25(__invokedynamic173_22(spill173_2, (6934881469361740361L ^ life4_3)), life11_65, __invokedynamic173_23(17793, (4710617100654251762L ^ life4_3)), life10_64, __invokedynamic173_24(9037, (3006945479512025093L ^ life4_3)), life9_63);
    life8_89 = __call173_27(__fieldRead173_26(receiver), life7_84);
    if (!((life6_7 == null))) {
        break forward_join_114;
    }
    if (!((life8_89 < (__fieldRead173_28(receiver) - 5)))) {
        break forward_join_116;
    }
    __call173_34(receiver, __fieldRead173_29(receiver), life7_84, (__fieldRead173_30(receiver) / 2), (__fieldRead173_31(receiver) - __invokedynamic173_32(10930, (8427495333742392842L ^ life4_3))), __invokedynamic173_33(3767, (917507447382610449L ^ life4_3)));
    }
    if (!((life6_7 != null))) {
        break forward_join_135;
    }
    }
    __call173_39(receiver, __fieldRead173_35(receiver), life7_84, 5, (__fieldRead173_36(receiver) - __invokedynamic173_37(8493, (3825296257678884232L ^ life4_3))), __invokedynamic173_38(2231, (4899951088902902825L ^ life4_3)));
    }
    __call173_40(receiver, p0, p1, p2);
    __call173_43(__fieldRead173_41(receiver), p0, p1, __fieldRead173_42(receiver));
    return;
}
public static void h173_0(moom.Oo p0) throws Throwable {
    throw __call1017300_0(p0);
}
public static void h173_1(moom.Oo p0) throws Throwable {
    throw __call1017301_0(p0);
}
public static void h173_2(moom.Oo p0) throws Throwable {
    throw __call1017302_0(p0);
}
public static void h173_3(moom.Oo p0) throws Throwable {
    throw __call1017303_0(p0);
}
public static void h173_4(moom.Oo p0) throws Throwable {
    throw __call1017304_0(p0);
}
private static native long __fieldRead173_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call173_1() throws Throwable;
private static native void __call173_2(moom.hH a0) throws Throwable;
private static native moom.il __fieldRead173_3(moom.hH a0) throws Throwable;
private static native void __call173_4(moom.il a0, int a1, int a2, float a3) throws Throwable;
private static native int __fieldRead173_5(moom.hH a0) throws Throwable;
private static native moom.il __fieldRead173_6(moom.hH a0) throws Throwable;
private static native void __call173_7(moom.il a0) throws Throwable;
private static native int __fieldRead173_9(moom.hH a0) throws Throwable;
private static native int __invokedynamic173_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite173_11(moom.hH a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead173_12(moom.hH a0) throws Throwable;
private static native java.lang.String __fieldRead173_13(moom.hH a0) throws Throwable;
private static native java.lang.String __invokedynamic173_14(java.lang.String a0) throws Throwable;
private static native int __fieldRead173_15(moom.hH a0) throws Throwable;
private static native int __invokedynamic173_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic173_17(int a0, long a1) throws Throwable;
private static native void __call173_18(moom.hH a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native java.lang.String __fieldRead173_19() throws Throwable;
private static native java.lang.String __fieldRead173_20() throws Throwable;
private static native java.lang.String __fieldRead173_21() throws Throwable;
private static native java.lang.String __invokedynamic173_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic173_23(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic173_24(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic173_25(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead173_26(moom.hH a0) throws Throwable;
private static native int __call173_27(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead173_28(moom.hH a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead173_29(moom.hH a0) throws Throwable;
private static native int __fieldRead173_30(moom.hH a0) throws Throwable;
private static native int __fieldRead173_31(moom.hH a0) throws Throwable;
private static native int __invokedynamic173_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic173_33(int a0, long a1) throws Throwable;
private static native void __call173_34(moom.hH a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead173_35(moom.hH a0) throws Throwable;
private static native int __fieldRead173_36(moom.hH a0) throws Throwable;
private static native int __invokedynamic173_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic173_38(int a0, long a1) throws Throwable;
private static native void __call173_39(moom.hH a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call173_40(moom.hH a0, int a1, int a2, float a3) throws Throwable;
private static native moom.LI __fieldRead173_41(moom.hH a0) throws Throwable;
private static native java.util.List __fieldRead173_42(moom.hH a0) throws Throwable;
private static native void __call173_43(moom.LI a0, int a1, int a2, java.util.List a3) throws Throwable;
private static native java.lang.Exception __call1017300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1017304_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_33385d36084a8e860830(moom.hH a0, moom.gc a1, boolean a2) throws E;
private static final class __SourceHandler_33385d36084a8e860830 {

public static void f437(moom.hH receiver, moom.gc p0, boolean p1) throws Throwable {
    int forestValue437_13_0;
    int forestValue437_22_0;
    int forestValue437_27_0;
    int forestValue437_31_0;
    int forestValue437_73_0;
    int forestValue437_148_0;
    int forestValue437_237_0;
    int forestValue437_241_0;
    int forestValue437_243_0;
    int forestValue437_259_0;
    int forestValue437_261_0;
    moom.hH forestValue437_271_0;
    int forestValue437_281_0;
    int forestValue437_283_0;
    moom.hH forestValue437_293_0;
    moom.hH forestValue437_307_0;
    float forestValue437_307_1;
    float[] forestValue437_307_2;
    float forestValue437_307_3;
    int forestValue437_307_4;
    moom.hH forestValue437_308_0;
    float forestValue437_308_1;
    float[] forestValue437_308_2;
    float forestValue437_308_3;
    moom.hH forestValue437_309_0;
    float forestValue437_309_1;
    float[] forestValue437_309_2;
    float forestValue437_309_3;
    int forestValue437_309_4;
    moom.hH forestValue437_326_0;
    float forestValue437_326_1;
    float[] forestValue437_326_2;
    float forestValue437_326_3;
    int forestValue437_326_4;
    moom.hH forestValue437_327_0;
    float forestValue437_327_1;
    float[] forestValue437_327_2;
    float forestValue437_327_3;
    moom.hH forestValue437_328_0;
    float forestValue437_328_1;
    float[] forestValue437_328_2;
    float forestValue437_328_3;
    int forestValue437_328_4;
    moom.hH forestValue437_345_0;
    float forestValue437_345_1;
    float[] forestValue437_345_2;
    float forestValue437_345_3;
    int forestValue437_345_4;
    moom.hH forestValue437_346_0;
    float forestValue437_346_1;
    float[] forestValue437_346_2;
    float forestValue437_346_3;
    moom.hH forestValue437_347_0;
    float forestValue437_347_1;
    float[] forestValue437_347_2;
    float forestValue437_347_3;
    int forestValue437_347_4;
    moom.M0 forestValue437_360_0;
    int forestValue437_360_1;
    moom.M0 forestValue437_361_0;
    moom.M0 forestValue437_362_0;
    int forestValue437_362_1;
    moom.M0 forestValue437_379_0;
    int forestValue437_379_1;
    moom.M0 forestValue437_380_0;
    moom.M0 forestValue437_381_0;
    int forestValue437_381_1;
    moom.hH forestValue437_392_0;
    int forestValue437_402_0;
    int forestValue437_404_0;
    int forestValue437_412_0;
    int forestValue437_414_0;
    int forestValue437_489_0;
    int forestValue437_491_0;
    boolean spill437_0;
    java.lang.String spill437_1;
    java.lang.Object[] spill437_2;
    java.lang.Runtime spill437_3;
    java.lang.String[] spill437_4;
    java.lang.String[] spill437_5;
    java.lang.Class spill437_6;
    java.lang.String spill437_7;
    java.lang.Class[] spill437_8;
    java.lang.reflect.Method spill437_9;
    java.lang.Object spill437_10;
    java.lang.Object[] spill437_11;
    int spill437_12;
    java.lang.Class spill437_13;
    java.lang.String spill437_14;
    java.lang.Class[] spill437_15;
    java.lang.reflect.Method spill437_16;
    java.lang.Object spill437_17;
    java.lang.Object[] spill437_18;
    int spill437_19;
    boolean spill437_20;
    moom.hH spill437_21;
    boolean spill437_22;
    moom.hH spill437_23;
    moom.hH spill437_24;
    float spill437_25;
    float[] spill437_26;
    float spill437_27;
    boolean spill437_28;
    moom.hH spill437_29;
    float spill437_30;
    float[] spill437_31;
    float spill437_32;
    boolean spill437_33;
    moom.hH spill437_34;
    float spill437_35;
    float[] spill437_36;
    float spill437_37;
    boolean spill437_38;
    moom.M0 spill437_39;
    boolean spill437_40;
    moom.M0 spill437_41;
    boolean spill437_42;
    moom.hH spill437_43;
    boolean spill437_44;
    boolean spill437_45;
    int spill437_46;
    moom.gc spill437_47;
    moom.gc spill437_48;
    moom.gc spill437_49;
    boolean spill437_50;
    moom.gc spill437_51;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    moom.gw life6_21;
    java.lang.String life7_53;
    int life7_79;
    java.lang.Class life8_86;
    java.lang.Object life9_100;
    moom.hG life8_177;
    java.lang.Class life9_189;
    java.lang.Object life10_203;
    forest_join_506: {
    forest_join_504: {
    forest_join_491: {
    forest_join_490: {
    forest_join_489: {
    forest_join_484: {
    forest_join_463: {
    forest_join_442: {
    forest_join_417: {
    forest_join_414: {
    forest_join_413: {
    forest_join_412: {
    forest_join_407: {
    forest_join_404: {
    forest_join_403: {
    forest_join_402: {
    forest_join_397: {
    forest_join_392: {
    forest_join_389: {
    forest_join_381: {
    forest_join_380: {
    forest_join_379: {
    forest_join_373: {
    forest_join_371: {
    forest_join_370: {
    forest_join_362: {
    forest_join_361: {
    forest_join_360: {
    forest_join_354: {
    forest_join_347: {
    forest_join_346: {
    forest_join_345: {
    forest_join_336: {
    forest_join_328: {
    forest_join_327: {
    forest_join_326: {
    forest_join_317: {
    forest_join_309: {
    forest_join_308: {
    forest_join_307: {
    forest_join_298: {
    forest_join_293: {
    forest_join_291: {
    forest_join_283: {
    forest_join_282: {
    forest_join_281: {
    forest_join_276: {
    forest_join_271: {
    forest_join_269: {
    forest_join_261: {
    forest_join_260: {
    forest_join_259: {
    forest_join_254: {
    forest_join_252: {
    forest_join_251: {
    forest_join_243: {
    forest_join_242: {
    forest_join_241: {
    forest_join_237: {
    forest_join_236: {
    forest_join_228: {
    forest_join_223: {
    forest_join_173: {
    forest_join_162: {
    forest_join_151: {
    forest_join_148: {
    forest_join_73: {
    forest_join_72: {
    forest_join_53: {
    forest_join_34: {
    forest_join_31: {
    forest_join_30: {
    forest_join_27: {
    forest_join_22: {
    forest_join_21: {
    forest_join_13: {
    life3_3 = (__fieldRead437_0() ^ 30493137365969L);
    life5_5 = __call437_1();
    spill437_0 = __fieldRead437_2(p0);
    if (!((life5_5 == null))) {
        forestValue437_13_0 = __integerCategory437_3(spill437_0);
        break forest_join_13;
    }
    if (!(spill437_0)) {
        break forest_join_506;
    }
    forestValue437_13_0 = __instanceOf437_4(p0);
    }
    if (!((life5_5 == null))) {
        forestValue437_22_0 = forestValue437_13_0;
        break forest_join_22;
    }
    if (!((forestValue437_13_0 != 0))) {
        break forest_join_21;
    }
    life6_21 = __cast437_5(p0);
    if (!((life5_5 != null))) {
        break forest_join_228;
    }
    }
    forestValue437_22_0 = __integerCategory437_6(p1);
    }
    if (!((life5_5 == null))) {
        forestValue437_27_0 = forestValue437_22_0;
        break forest_join_27;
    }
    if (!((forestValue437_22_0 == 0))) {
        break forest_join_506;
    }
    forestValue437_27_0 = __fieldRead437_7(p0);
    }
    if (!((life5_5 == null))) {
        forestValue437_31_0 = forestValue437_27_0;
        break forest_join_31;
    }
    switch (forestValue437_27_0) {
case 201:
{
        break forest_join_30;
    }
case 202:
{
        break forest_join_151;
    }
case 203:
{
        break forest_join_162;
    }
case 210:
{
        break forest_join_173;
    }
case 204:
case 205:
case 206:
case 207:
case 208:
case 209:
default:
{
        break forest_join_223;
    }
}
    }
    forestValue437_31_0 = __call437_8();
    }
    if (!((life5_5 == null))) {
        forestValue437_73_0 = forestValue437_31_0;
        break forest_join_73;
    }
    switch (forestValue437_31_0) {
case 1:
{
        break forest_join_34;
    }
case 2:
{
        break forest_join_53;
    }
default:
{
        break forest_join_72;
    }
}
    }
    spill437_1 = __invokedynamic437_9(12736, (8619180138260961913L ^ life3_3));
    java.lang.Object[] __stackOp437_10_0 = new java.lang.Object[1];
    spill437_2 = __stackOp437_10_0;
    (__stackOp437_10_0)[0] = __call437_12(__fieldRead437_11());
    life7_53 = __call437_13(spill437_1, spill437_2);
    __call437_15(__call437_14(), life7_53);
    return;
    }
    spill437_3 = __call437_16();
    java.lang.String[] __stackOp437_17_0 = new java.lang.String[2];
    spill437_4 = __stackOp437_17_0;
    (__stackOp437_17_0)[0] = __invokedynamic437_18(16386, (3716196684916222852L ^ life3_3));
    java.lang.String[] __stackOp437_19_0 = spill437_4;
    spill437_5 = __stackOp437_19_0;
    (__stackOp437_19_0)[1] = __call437_21(__fieldRead437_20());
    __call437_22(spill437_3, spill437_5);
    return;
    }
    forestValue437_73_0 = 0;
    }
    life7_79 = forestValue437_73_0;
    life8_86 = __call437_24(__invokedynamic437_23(28067, (1079895551204509228L ^ life3_3)));
    life9_100 = __call437_27(__call437_26(life8_86, __invokedynamic437_25(28424, (8078440571702264972L ^ life3_3)), new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill437_6 = life8_86;
    spill437_7 = __invokedynamic437_28(22525, (7627639824363519050L ^ life3_3));
    java.lang.Class[] __stackOp437_29_0 = new java.lang.Class[1];
    spill437_8 = __stackOp437_29_0;
    (__stackOp437_29_0)[0] = __classLiteral437_30();
    spill437_9 = __call437_31(spill437_6, spill437_7, spill437_8);
    spill437_10 = life9_100;
    java.lang.Object[] __stackOp437_32_0 = new java.lang.Object[1];
    spill437_11 = __stackOp437_32_0;
    (__stackOp437_32_0)[0] = __call437_36(new java.io.File(__fieldRead437_34(__fieldRead437_33(receiver)), __invokedynamic437_35(11996, (2852377383146980697L ^ life3_3))));
    __call437_37(spill437_9, spill437_10, spill437_11);
    spill437_12 = life7_79;
    if (!((life5_5 == null))) {
        forestValue437_148_0 = spill437_12;
        break forest_join_148;
    }
    if (!((spill437_12 != 0))) {
        break forest_join_506;
    }
    __call437_39(__invokedynamic437_38(1546, (6832187488676392350L ^ life3_3)));
    java.lang.String __stackOp437_43_0 = __call437_41(__fieldRead437_40());
    java.lang.String __stackOp437_43_1 = __invokedynamic437_42(17540, (243025120807743251L ^ life3_3));
    forestValue437_148_0 = __integerCategory437_46(__call437_45(__invokedynamic437_44(__stackOp437_43_1, __stackOp437_43_0)));
    }
    __discardScalar437_47(forestValue437_148_0);
    if (!((life5_5 != null))) {
        break forest_join_506;
    }
    }
    __call437_48();
    __fieldWrite437_49(receiver, 1);
    __call437_52(__fieldRead437_50(receiver), __fieldRead437_51(receiver));
    if (!((life5_5 != null))) {
        break forest_join_506;
    }
    }
    life8_177 = new moom.hG(receiver, __call437_53());
    __call437_55(__call437_54(), life8_177);
    if (!((life5_5 != null))) {
        break forest_join_506;
    }
    }
    life9_189 = __call437_57(__invokedynamic437_56(16481, (7194676127783513062L ^ life3_3)));
    life10_203 = __call437_60(__call437_59(life9_189, __invokedynamic437_58(32665, (1084389512581207046L ^ life3_3)), new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill437_13 = life9_189;
    spill437_14 = __invokedynamic437_61(20033, (5269888021161600459L ^ life3_3));
    java.lang.Class[] __stackOp437_62_0 = new java.lang.Class[1];
    spill437_15 = __stackOp437_62_0;
    (__stackOp437_62_0)[0] = __classLiteral437_63();
    spill437_16 = __call437_64(spill437_13, spill437_14, spill437_15);
    spill437_17 = life10_203;
    java.lang.Object[] __stackOp437_65_0 = new java.lang.Object[1];
    spill437_18 = __stackOp437_65_0;
    (__stackOp437_65_0)[0] = new java.net.URI(__invokedynamic437_66(8527, (3349768916057787103L ^ life3_3)));
    __call437_67(spill437_16, spill437_17, spill437_18);
    }
    __call437_69(__fieldRead437_68(receiver), p0);
    break forest_join_506;
    }
    spill437_19 = (__fieldRead437_70())[__call437_72(__call437_71(life6_21))];
    if (!((life5_5 == null))) {
        forestValue437_237_0 = spill437_19;
        break forest_join_237;
    }
    switch (spill437_19) {
case 1:
{
        break forest_join_236;
    }
case 2:
{
        break forest_join_254;
    }
case 3:
{
        break forest_join_276;
    }
case 4:
{
        break forest_join_298;
    }
case 5:
{
        break forest_join_317;
    }
case 6:
{
        break forest_join_336;
    }
case 7:
{
        break forest_join_354;
    }
case 8:
{
        break forest_join_373;
    }
case 9:
{
        break forest_join_397;
    }
case 10:
{
        break forest_join_407;
    }
case 11:
{
        break forest_join_417;
    }
case 12:
{
        break forest_join_442;
    }
case 13:
{
        break forest_join_463;
    }
case 14:
{
        break forest_join_484;
    }
default:
{
        break forest_join_504;
    }
}
    }
    forestValue437_237_0 = __integerCategory437_73(p1);
    }
    if (!((life5_5 == null))) {
        forestValue437_241_0 = forestValue437_237_0;
        break forest_join_241;
    }
    if (!((forestValue437_237_0 == 0))) {
        break forest_join_242;
    }
    forestValue437_241_0 = 1;
    }
    forestValue437_243_0 = forestValue437_241_0;
    break forest_join_243;
    }
    forestValue437_243_0 = 0;
    }
    __call437_74(forestValue437_243_0);
    if (!((life5_5 == null))) {
        break forest_join_252;
    }
    if (!(__call437_75(receiver))) {
        break forest_join_251;
    }
    __fieldWrite437_76(0);
    }
    __call437_77();
    }
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_20 = __fieldRead437_78();
    if (!((life5_5 == null))) {
        forestValue437_259_0 = __integerCategory437_79(spill437_20);
        break forest_join_259;
    }
    if (!((!spill437_20))) {
        break forest_join_260;
    }
    forestValue437_259_0 = 1;
    }
    forestValue437_261_0 = forestValue437_259_0;
    break forest_join_261;
    }
    forestValue437_261_0 = 0;
    }
    __fieldWrite437_80(forestValue437_261_0);
    spill437_21 = receiver;
    if (!((life5_5 == null))) {
        forestValue437_271_0 = spill437_21;
        break forest_join_271;
    }
    if (!(__call437_81(spill437_21))) {
        break forest_join_269;
    }
    __fieldWrite437_82(1);
    }
    __call437_83();
    forestValue437_271_0 = receiver;
    }
    __call437_85(__fieldRead437_84(forestValue437_271_0));
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_22 = __fieldRead437_86();
    if (!((life5_5 == null))) {
        forestValue437_281_0 = __integerCategory437_87(spill437_22);
        break forest_join_281;
    }
    if (!((!spill437_22))) {
        break forest_join_282;
    }
    forestValue437_281_0 = 1;
    }
    forestValue437_283_0 = forestValue437_281_0;
    break forest_join_283;
    }
    forestValue437_283_0 = 0;
    }
    __fieldWrite437_88(forestValue437_283_0);
    spill437_23 = receiver;
    if (!((life5_5 == null))) {
        forestValue437_293_0 = spill437_23;
        break forest_join_293;
    }
    if (!(__call437_89(spill437_23))) {
        break forest_join_291;
    }
    __fieldWrite437_90(1);
    }
    __call437_91();
    forestValue437_293_0 = receiver;
    }
    __call437_93(__fieldRead437_92(forestValue437_293_0));
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_24 = receiver;
    spill437_25 = __fieldRead437_94();
    spill437_26 = __fieldRead437_95();
    spill437_27 = 0x1.0p0f;
    spill437_28 = p1;
    if (!((life5_5 == null))) {
        forestValue437_307_0 = spill437_24;
        forestValue437_307_1 = spill437_25;
        forestValue437_307_2 = spill437_26;
        forestValue437_307_3 = spill437_27;
        forestValue437_307_4 = __integerCategory437_96(spill437_28);
        break forest_join_307;
    }
    if (!((!spill437_28))) {
        forestValue437_308_0 = spill437_24;
        forestValue437_308_1 = spill437_25;
        forestValue437_308_2 = spill437_26;
        forestValue437_308_3 = spill437_27;
        break forest_join_308;
    }
    forestValue437_307_0 = spill437_24;
    forestValue437_307_1 = spill437_25;
    forestValue437_307_2 = spill437_26;
    forestValue437_307_3 = spill437_27;
    forestValue437_307_4 = 1;
    }
    forestValue437_309_0 = forestValue437_307_0;
    forestValue437_309_1 = forestValue437_307_1;
    forestValue437_309_2 = forestValue437_307_2;
    forestValue437_309_3 = forestValue437_307_3;
    forestValue437_309_4 = forestValue437_307_4;
    break forest_join_309;
    }
    forestValue437_309_0 = forestValue437_308_0;
    forestValue437_309_1 = forestValue437_308_1;
    forestValue437_309_2 = forestValue437_308_2;
    forestValue437_309_3 = forestValue437_308_3;
    forestValue437_309_4 = 0;
    }
    __fieldWrite437_99(__call437_98(forestValue437_309_0, forestValue437_309_1, forestValue437_309_2, forestValue437_309_3, forestValue437_309_4, __call437_97(receiver)));
    __call437_100();
    __call437_101();
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_29 = receiver;
    spill437_30 = __fieldRead437_102();
    spill437_31 = __fieldRead437_103();
    spill437_32 = 0x1.0p0f;
    spill437_33 = p1;
    if (!((life5_5 == null))) {
        forestValue437_326_0 = spill437_29;
        forestValue437_326_1 = spill437_30;
        forestValue437_326_2 = spill437_31;
        forestValue437_326_3 = spill437_32;
        forestValue437_326_4 = __integerCategory437_104(spill437_33);
        break forest_join_326;
    }
    if (!((!spill437_33))) {
        forestValue437_327_0 = spill437_29;
        forestValue437_327_1 = spill437_30;
        forestValue437_327_2 = spill437_31;
        forestValue437_327_3 = spill437_32;
        break forest_join_327;
    }
    forestValue437_326_0 = spill437_29;
    forestValue437_326_1 = spill437_30;
    forestValue437_326_2 = spill437_31;
    forestValue437_326_3 = spill437_32;
    forestValue437_326_4 = 1;
    }
    forestValue437_328_0 = forestValue437_326_0;
    forestValue437_328_1 = forestValue437_326_1;
    forestValue437_328_2 = forestValue437_326_2;
    forestValue437_328_3 = forestValue437_326_3;
    forestValue437_328_4 = forestValue437_326_4;
    break forest_join_328;
    }
    forestValue437_328_0 = forestValue437_327_0;
    forestValue437_328_1 = forestValue437_327_1;
    forestValue437_328_2 = forestValue437_327_2;
    forestValue437_328_3 = forestValue437_327_3;
    forestValue437_328_4 = 0;
    }
    __fieldWrite437_107(__call437_106(forestValue437_328_0, forestValue437_328_1, forestValue437_328_2, forestValue437_328_3, forestValue437_328_4, __call437_105(receiver)));
    __call437_108();
    __call437_109();
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_34 = receiver;
    spill437_35 = __fieldRead437_110();
    spill437_36 = __fieldRead437_111();
    spill437_37 = 0x1.0p-3f;
    spill437_38 = p1;
    if (!((life5_5 == null))) {
        forestValue437_345_0 = spill437_34;
        forestValue437_345_1 = spill437_35;
        forestValue437_345_2 = spill437_36;
        forestValue437_345_3 = spill437_37;
        forestValue437_345_4 = __integerCategory437_112(spill437_38);
        break forest_join_345;
    }
    if (!((!spill437_38))) {
        forestValue437_346_0 = spill437_34;
        forestValue437_346_1 = spill437_35;
        forestValue437_346_2 = spill437_36;
        forestValue437_346_3 = spill437_37;
        break forest_join_346;
    }
    forestValue437_345_0 = spill437_34;
    forestValue437_345_1 = spill437_35;
    forestValue437_345_2 = spill437_36;
    forestValue437_345_3 = spill437_37;
    forestValue437_345_4 = 1;
    }
    forestValue437_347_0 = forestValue437_345_0;
    forestValue437_347_1 = forestValue437_345_1;
    forestValue437_347_2 = forestValue437_345_2;
    forestValue437_347_3 = forestValue437_345_3;
    forestValue437_347_4 = forestValue437_345_4;
    break forest_join_347;
    }
    forestValue437_347_0 = forestValue437_346_0;
    forestValue437_347_1 = forestValue437_346_1;
    forestValue437_347_2 = forestValue437_346_2;
    forestValue437_347_3 = forestValue437_346_3;
    forestValue437_347_4 = 0;
    }
    __fieldWrite437_115(__call437_114(forestValue437_347_0, forestValue437_347_1, forestValue437_347_2, forestValue437_347_3, forestValue437_347_4, __call437_113(receiver)));
    __call437_116();
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_39 = __fieldRead437_117();
    spill437_40 = p1;
    if (!((life5_5 == null))) {
        forestValue437_360_0 = spill437_39;
        forestValue437_360_1 = __integerCategory437_118(spill437_40);
        break forest_join_360;
    }
    if (!((!spill437_40))) {
        forestValue437_361_0 = spill437_39;
        break forest_join_361;
    }
    forestValue437_360_0 = spill437_39;
    forestValue437_360_1 = 1;
    }
    forestValue437_362_0 = forestValue437_360_0;
    forestValue437_362_1 = forestValue437_360_1;
    break forest_join_362;
    }
    forestValue437_362_0 = forestValue437_361_0;
    forestValue437_362_1 = 0;
    }
    __call437_119(forestValue437_362_0, forestValue437_362_1);
    if (!((life5_5 == null))) {
        break forest_join_371;
    }
    if (!(__call437_120(receiver))) {
        break forest_join_370;
    }
    __call437_122(__fieldRead437_121());
    }
    __call437_123();
    }
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_41 = __fieldRead437_124();
    spill437_42 = p1;
    if (!((life5_5 == null))) {
        forestValue437_379_0 = spill437_41;
        forestValue437_379_1 = __integerCategory437_125(spill437_42);
        break forest_join_379;
    }
    if (!((!spill437_42))) {
        forestValue437_380_0 = spill437_41;
        break forest_join_380;
    }
    forestValue437_379_0 = spill437_41;
    forestValue437_379_1 = 1;
    }
    forestValue437_381_0 = forestValue437_379_0;
    forestValue437_381_1 = forestValue437_379_1;
    break forest_join_381;
    }
    forestValue437_381_0 = forestValue437_380_0;
    forestValue437_381_1 = 0;
    }
    __call437_126(forestValue437_381_0, forestValue437_381_1);
    spill437_43 = receiver;
    if (!((life5_5 == null))) {
        forestValue437_392_0 = spill437_43;
        break forest_join_392;
    }
    if (!(__call437_127(spill437_43))) {
        break forest_join_389;
    }
    __call437_129(__fieldRead437_128());
    }
    __call437_130();
    __call437_131();
    forestValue437_392_0 = receiver;
    }
    __call437_133(__fieldRead437_132(forestValue437_392_0));
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_44 = __fieldRead437_134();
    if (!((life5_5 == null))) {
        forestValue437_402_0 = __integerCategory437_135(spill437_44);
        break forest_join_402;
    }
    if (!((!spill437_44))) {
        break forest_join_403;
    }
    forestValue437_402_0 = 1;
    }
    forestValue437_404_0 = forestValue437_402_0;
    break forest_join_404;
    }
    forestValue437_404_0 = 0;
    }
    __fieldWrite437_136(forestValue437_404_0);
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_45 = __fieldRead437_137();
    if (!((life5_5 == null))) {
        forestValue437_412_0 = __integerCategory437_138(spill437_45);
        break forest_join_412;
    }
    if (!((!spill437_45))) {
        break forest_join_413;
    }
    forestValue437_412_0 = 1;
    }
    forestValue437_414_0 = forestValue437_412_0;
    break forest_join_414;
    }
    forestValue437_414_0 = 0;
    }
    __fieldWrite437_139(forestValue437_414_0);
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    __fieldWrite437_141(((__fieldRead437_140() + 1) % 3));
    int __stackOp437_143_0 = __fieldRead437_142();
    spill437_46 = __stackOp437_143_0;
    __fieldWrite437_144(__stackOp437_143_0);
    __fieldWrite437_145(spill437_46);
    spill437_47 = p0;
    java.lang.String __stackOp437_149_0 = (__fieldRead437_146())[__fieldRead437_147()];
    java.lang.String __stackOp437_149_1 = __invokedynamic437_148(30853, (6186367730033644343L ^ life3_3));
    __fieldWrite437_151(spill437_47, __invokedynamic437_150(__stackOp437_149_1, __stackOp437_149_0));
    __call437_152();
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    __fieldWrite437_154(((__fieldRead437_153() + 1) % 2));
    spill437_48 = p0;
    java.lang.String __stackOp437_158_0 = (__fieldRead437_155())[__fieldRead437_156()];
    java.lang.String __stackOp437_158_1 = __invokedynamic437_157(2270, (6221550033294140227L ^ life3_3));
    __fieldWrite437_160(spill437_48, __invokedynamic437_159(__stackOp437_158_1, __stackOp437_158_0));
    __call437_161();
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    __fieldWrite437_163(((__fieldRead437_162() + 1) % 2));
    spill437_49 = p0;
    java.lang.String __stackOp437_167_0 = (__fieldRead437_164())[__fieldRead437_165()];
    java.lang.String __stackOp437_167_1 = __invokedynamic437_166(26876, (23051837639607141L ^ life3_3));
    __fieldWrite437_169(spill437_49, __invokedynamic437_168(__stackOp437_167_1, __stackOp437_167_0));
    __call437_170();
    if (!((life5_5 != null))) {
        break forest_join_504;
    }
    }
    spill437_50 = __fieldRead437_171();
    if (!((life5_5 == null))) {
        forestValue437_489_0 = __integerCategory437_172(spill437_50);
        break forest_join_489;
    }
    if (!((!spill437_50))) {
        break forest_join_490;
    }
    forestValue437_489_0 = 1;
    }
    forestValue437_491_0 = forestValue437_489_0;
    break forest_join_491;
    }
    forestValue437_491_0 = 0;
    }
    __fieldWrite437_173(forestValue437_491_0);
    spill437_51 = p0;
    java.lang.String __stackOp437_177_0 = __call437_175(__fieldRead437_174());
    java.lang.String __stackOp437_177_1 = __invokedynamic437_176(24299, (454447945631266151L ^ life3_3));
    __fieldWrite437_179(spill437_51, __invokedynamic437_178(__stackOp437_177_1, __stackOp437_177_0));
    __call437_180();
    }
    __call437_181(life6_21);
    }
    return;
}
public static void h437_0(java.io.IOException p0) throws Throwable {
    throw __call3043700_0(p0);
}
public static void h437_1(java.io.IOException p0) throws Throwable {
    throw __call3043701_0(p0);
}
public static void h437_2(java.io.IOException p0) throws Throwable {
    throw __call3043702_0(p0);
}
public static void h437_3(java.io.IOException p0) throws Throwable {
    throw __call3043703_0(p0);
}
public static void h437_4(java.io.IOException p0) throws Throwable {
    throw __call3043704_0(p0);
}
public static void h437_5(java.io.IOException p0) throws Throwable {
    throw __call3043705_0(p0);
}
public static void h437_6(java.io.IOException p0) throws Throwable {
    throw __call3043706_0(p0);
}
public static void h437_7(java.io.IOException p0) throws Throwable {
    throw __call3043707_0(p0);
}
public static void h437_8(java.io.IOException p0, moom.hH p1, moom.gc p2, long p3, net.minecraft.entity.Entity[] p4, java.lang.Object p5) throws Throwable {
    int forestValue3043708_101_0;
    java.lang.Runtime spill3043708_0;
    java.lang.String[] spill3043708_1;
    java.lang.String[] spill3043708_2;
    java.lang.Class spill3043708_3;
    java.lang.String spill3043708_4;
    java.lang.Class[] spill3043708_5;
    java.lang.reflect.Method spill3043708_6;
    java.lang.Object spill3043708_7;
    java.lang.Object[] spill3043708_8;
    int spill3043708_9;
    java.lang.Class spill3043708_10;
    java.lang.String spill3043708_11;
    java.lang.Class[] spill3043708_12;
    java.lang.reflect.Method spill3043708_13;
    java.lang.Object spill3043708_14;
    java.lang.Object[] spill3043708_15;
    java.io.IOException life8_2;
    int life7_27;
    java.lang.Class life8_34;
    java.lang.Object life9_48;
    moom.hG life8_125;
    java.lang.Class life9_137;
    java.lang.Object life6_151;
    forest_join_180: {
    forest_join_101: {
    forest_join_25: {
    life8_2 = p0;
    __call3043708_0(life8_2);
    if (!((p4 != null))) {
        break forest_join_25;
    }
    spill3043708_0 = __call3043708_1();
    java.lang.String[] __stackOp3043708_2_0 = new java.lang.String[2];
    spill3043708_1 = __stackOp3043708_2_0;
    (__stackOp3043708_2_0)[0] = __invokedynamic3043708_3(16386, (3716196684916222852L ^ p3));
    java.lang.String[] __stackOp3043708_4_0 = spill3043708_1;
    spill3043708_2 = __stackOp3043708_4_0;
    (__stackOp3043708_4_0)[1] = __call3043708_6(__fieldRead3043708_5());
    __call3043708_7(spill3043708_0, spill3043708_2);
    return;
    }
    life7_27 = 0;
    life8_34 = __call3043708_9(__invokedynamic3043708_8(28067, (1079895551204509228L ^ p3)));
    life9_48 = __call3043708_12(__call3043708_11(life8_34, __invokedynamic3043708_10(28424, (8078440571702264972L ^ p3)), new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill3043708_3 = life8_34;
    spill3043708_4 = __invokedynamic3043708_13(22525, (7627639824363519050L ^ p3));
    java.lang.Class[] __stackOp3043708_14_0 = new java.lang.Class[1];
    spill3043708_5 = __stackOp3043708_14_0;
    (__stackOp3043708_14_0)[0] = __classLiteral3043708_15();
    spill3043708_6 = __call3043708_16(spill3043708_3, spill3043708_4, spill3043708_5);
    spill3043708_7 = life9_48;
    java.lang.Object[] __stackOp3043708_17_0 = new java.lang.Object[1];
    spill3043708_8 = __stackOp3043708_17_0;
    (__stackOp3043708_17_0)[0] = __call3043708_21(new java.io.File(__fieldRead3043708_19(__fieldRead3043708_18(p1)), __invokedynamic3043708_20(11996, (2852377383146980697L ^ p3))));
    __call3043708_22(spill3043708_6, spill3043708_7, spill3043708_8);
    spill3043708_9 = life7_27;
    if (!((p4 == null))) {
        forestValue3043708_101_0 = spill3043708_9;
        break forest_join_101;
    }
    if (!((spill3043708_9 != 0))) {
        break forest_join_180;
    }
    __call3043708_24(__invokedynamic3043708_23(1546, (6832187488676392350L ^ p3)));
    java.lang.String __stackOp3043708_28_0 = __call3043708_26(__fieldRead3043708_25());
    java.lang.String __stackOp3043708_28_1 = __invokedynamic3043708_27(17540, (243025120807743251L ^ p3));
    forestValue3043708_101_0 = __integerCategory3043708_31(__call3043708_30(__invokedynamic3043708_29(__stackOp3043708_28_1, __stackOp3043708_28_0)));
    }
    __discardScalar3043708_32(forestValue3043708_101_0);
    if (!((p4 != null))) {
        break forest_join_180;
    }
    __call3043708_33();
    __fieldWrite3043708_34(p1, 1);
    __call3043708_37(__fieldRead3043708_35(p1), __fieldRead3043708_36(p1));
    if (!((p4 != null))) {
        break forest_join_180;
    }
    life8_125 = new moom.hG(p1, __call3043708_38());
    __call3043708_40(__call3043708_39(), life8_125);
    if (!((p4 != null))) {
        break forest_join_180;
    }
    life9_137 = __call3043708_42(__invokedynamic3043708_41(16481, (7194676127783513062L ^ p3)));
    life6_151 = __call3043708_45(__call3043708_44(life9_137, __invokedynamic3043708_43(32665, (1084389512581207046L ^ p3)), new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill3043708_10 = life9_137;
    spill3043708_11 = __invokedynamic3043708_46(20033, (5269888021161600459L ^ p3));
    java.lang.Class[] __stackOp3043708_47_0 = new java.lang.Class[1];
    spill3043708_12 = __stackOp3043708_47_0;
    (__stackOp3043708_47_0)[0] = __classLiteral3043708_48();
    spill3043708_13 = __call3043708_49(spill3043708_10, spill3043708_11, spill3043708_12);
    spill3043708_14 = life6_151;
    java.lang.Object[] __stackOp3043708_50_0 = new java.lang.Object[1];
    spill3043708_15 = __stackOp3043708_50_0;
    (__stackOp3043708_50_0)[0] = new java.net.URI(__invokedynamic3043708_51(8527, (3349768916057787103L ^ p3)));
    __call3043708_52(spill3043708_13, spill3043708_14, spill3043708_15);
    __call3043708_54(__fieldRead3043708_53(p1), p2);
    }
    return;
}
public static void h437_9(moom.Oo p0) throws Throwable {
    throw __call3043709_0(p0);
}
public static void h437_10(java.io.IOException p0, moom.hH p1, moom.gc p2, long p3, net.minecraft.entity.Entity[] p4, java.lang.Object p5) throws Throwable {
    int forestValue3043710_80_0;
    java.lang.Class spill3043710_0;
    java.lang.String spill3043710_1;
    java.lang.Class[] spill3043710_2;
    java.lang.reflect.Method spill3043710_3;
    java.lang.Object spill3043710_4;
    java.lang.Object[] spill3043710_5;
    int spill3043710_6;
    java.lang.Class spill3043710_7;
    java.lang.String spill3043710_8;
    java.lang.Class[] spill3043710_9;
    java.lang.reflect.Method spill3043710_10;
    java.lang.Object spill3043710_11;
    java.lang.Object[] spill3043710_12;
    java.io.IOException life8_2;
    int life7_6;
    java.lang.Class life8_13;
    java.lang.Object life9_27;
    moom.hG life8_104;
    java.lang.Class life9_116;
    java.lang.Object life6_130;
    forest_join_159: {
    forest_join_80: {
    life8_2 = p0;
    __call3043710_0(life8_2);
    life7_6 = 0;
    life8_13 = __call3043710_2(__invokedynamic3043710_1(28067, (1079895551204509228L ^ p3)));
    life9_27 = __call3043710_5(__call3043710_4(life8_13, __invokedynamic3043710_3(28424, (8078440571702264972L ^ p3)), new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill3043710_0 = life8_13;
    spill3043710_1 = __invokedynamic3043710_6(22525, (7627639824363519050L ^ p3));
    java.lang.Class[] __stackOp3043710_7_0 = new java.lang.Class[1];
    spill3043710_2 = __stackOp3043710_7_0;
    (__stackOp3043710_7_0)[0] = __classLiteral3043710_8();
    spill3043710_3 = __call3043710_9(spill3043710_0, spill3043710_1, spill3043710_2);
    spill3043710_4 = life9_27;
    java.lang.Object[] __stackOp3043710_10_0 = new java.lang.Object[1];
    spill3043710_5 = __stackOp3043710_10_0;
    (__stackOp3043710_10_0)[0] = __call3043710_14(new java.io.File(__fieldRead3043710_12(__fieldRead3043710_11(p1)), __invokedynamic3043710_13(11996, (2852377383146980697L ^ p3))));
    __call3043710_15(spill3043710_3, spill3043710_4, spill3043710_5);
    spill3043710_6 = life7_6;
    if (!((p4 == null))) {
        forestValue3043710_80_0 = spill3043710_6;
        break forest_join_80;
    }
    if (!((spill3043710_6 != 0))) {
        break forest_join_159;
    }
    __call3043710_17(__invokedynamic3043710_16(1546, (6832187488676392350L ^ p3)));
    java.lang.String __stackOp3043710_21_0 = __call3043710_19(__fieldRead3043710_18());
    java.lang.String __stackOp3043710_21_1 = __invokedynamic3043710_20(17540, (243025120807743251L ^ p3));
    forestValue3043710_80_0 = __integerCategory3043710_24(__call3043710_23(__invokedynamic3043710_22(__stackOp3043710_21_1, __stackOp3043710_21_0)));
    }
    __discardScalar3043710_25(forestValue3043710_80_0);
    if (!((p4 != null))) {
        break forest_join_159;
    }
    __call3043710_26();
    __fieldWrite3043710_27(p1, 1);
    __call3043710_30(__fieldRead3043710_28(p1), __fieldRead3043710_29(p1));
    if (!((p4 != null))) {
        break forest_join_159;
    }
    life8_104 = new moom.hG(p1, __call3043710_31());
    __call3043710_33(__call3043710_32(), life8_104);
    if (!((p4 != null))) {
        break forest_join_159;
    }
    life9_116 = __call3043710_35(__invokedynamic3043710_34(16481, (7194676127783513062L ^ p3)));
    life6_130 = __call3043710_38(__call3043710_37(life9_116, __invokedynamic3043710_36(32665, (1084389512581207046L ^ p3)), new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill3043710_7 = life9_116;
    spill3043710_8 = __invokedynamic3043710_39(20033, (5269888021161600459L ^ p3));
    java.lang.Class[] __stackOp3043710_40_0 = new java.lang.Class[1];
    spill3043710_9 = __stackOp3043710_40_0;
    (__stackOp3043710_40_0)[0] = __classLiteral3043710_41();
    spill3043710_10 = __call3043710_42(spill3043710_7, spill3043710_8, spill3043710_9);
    spill3043710_11 = life6_130;
    java.lang.Object[] __stackOp3043710_43_0 = new java.lang.Object[1];
    spill3043710_12 = __stackOp3043710_43_0;
    (__stackOp3043710_43_0)[0] = new java.net.URI(__invokedynamic3043710_44(8527, (3349768916057787103L ^ p3)));
    __call3043710_45(spill3043710_10, spill3043710_11, spill3043710_12);
    __call3043710_47(__fieldRead3043710_46(p1), p2);
    }
    return;
}
public static void h437_11(java.lang.Throwable p0, moom.hH p1, moom.gc p2, long p3, net.minecraft.entity.Entity[] p4, java.lang.Object p5) throws Throwable {
    int forestValue3043711_26_0;
    int spill3043711_0;
    java.lang.Class spill3043711_1;
    java.lang.String spill3043711_2;
    java.lang.Class[] spill3043711_3;
    java.lang.reflect.Method spill3043711_4;
    java.lang.Object spill3043711_5;
    java.lang.Object[] spill3043711_6;
    java.lang.Throwable life8_2;
    int life7_6;
    moom.hG life8_49;
    java.lang.Class life9_61;
    java.lang.Object life6_75;
    forest_join_105: {
    forest_join_26: {
    life8_2 = p0;
    __call3043711_0(life8_2);
    life7_6 = 1;
    spill3043711_0 = life7_6;
    if (!((p4 == null))) {
        forestValue3043711_26_0 = spill3043711_0;
        break forest_join_26;
    }
    if (!((spill3043711_0 != 0))) {
        break forest_join_105;
    }
    __call3043711_2(__invokedynamic3043711_1(1546, (6832187488676392350L ^ p3)));
    java.lang.String __stackOp3043711_6_0 = __call3043711_4(__fieldRead3043711_3());
    java.lang.String __stackOp3043711_6_1 = __invokedynamic3043711_5(17540, (243025120807743251L ^ p3));
    forestValue3043711_26_0 = __integerCategory3043711_9(__call3043711_8(__invokedynamic3043711_7(__stackOp3043711_6_1, __stackOp3043711_6_0)));
    }
    __discardScalar3043711_10(forestValue3043711_26_0);
    if (!((p4 != null))) {
        break forest_join_105;
    }
    __call3043711_11();
    __fieldWrite3043711_12(p1, 1);
    __call3043711_15(__fieldRead3043711_13(p1), __fieldRead3043711_14(p1));
    if (!((p4 != null))) {
        break forest_join_105;
    }
    life8_49 = new moom.hG(p1, __call3043711_16());
    __call3043711_18(__call3043711_17(), life8_49);
    if (!((p4 != null))) {
        break forest_join_105;
    }
    life9_61 = __call3043711_20(__invokedynamic3043711_19(16481, (7194676127783513062L ^ p3)));
    life6_75 = __call3043711_23(__call3043711_22(life9_61, __invokedynamic3043711_21(32665, (1084389512581207046L ^ p3)), new java.lang.Class[0]), null, new java.lang.Object[0]);
    spill3043711_1 = life9_61;
    spill3043711_2 = __invokedynamic3043711_24(20033, (5269888021161600459L ^ p3));
    java.lang.Class[] __stackOp3043711_25_0 = new java.lang.Class[1];
    spill3043711_3 = __stackOp3043711_25_0;
    (__stackOp3043711_25_0)[0] = __classLiteral3043711_26();
    spill3043711_4 = __call3043711_27(spill3043711_1, spill3043711_2, spill3043711_3);
    spill3043711_5 = life6_75;
    java.lang.Object[] __stackOp3043711_28_0 = new java.lang.Object[1];
    spill3043711_6 = __stackOp3043711_28_0;
    (__stackOp3043711_28_0)[0] = new java.net.URI(__invokedynamic3043711_29(8527, (3349768916057787103L ^ p3)));
    __call3043711_30(spill3043711_4, spill3043711_5, spill3043711_6);
    __call3043711_32(__fieldRead3043711_31(p1), p2);
    }
    return;
}
public static void h437_12(java.io.IOException p0) throws Throwable {
    throw __call3043712_0(p0);
}
public static void h437_13(java.io.IOException p0) throws Throwable {
    throw __call3043713_0(p0);
}
public static void h437_14(java.io.IOException p0) throws Throwable {
    throw __call3043714_0(p0);
}
public static void h437_15(java.lang.Throwable p0, moom.hH p1, moom.gc p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call3043715_0(life3_2);
    __call3043715_2(__fieldRead3043715_1(p1), p2);
    return;
}
public static void h437_16(java.io.IOException p0) throws Throwable {
    throw __call3043716_0(p0);
}
public static void h437_17(java.io.IOException p0) throws Throwable {
    throw __call3043717_0(p0);
}
public static void h437_18(java.io.IOException p0) throws Throwable {
    throw __call3043718_0(p0);
}
public static void h437_19(java.io.IOException p0) throws Throwable {
    throw __call3043719_0(p0);
}
public static void h437_20(java.io.IOException p0) throws Throwable {
    throw __call3043720_0(p0);
}
public static void h437_21(java.io.IOException p0) throws Throwable {
    throw __call3043721_0(p0);
}
public static void h437_22(java.io.IOException p0) throws Throwable {
    throw __call3043722_0(p0);
}
public static void h437_23(java.io.IOException p0) throws Throwable {
    throw __call3043723_0(p0);
}
public static void h437_24(java.io.IOException p0) throws Throwable {
    throw __call3043724_0(p0);
}
public static void h437_25(java.io.IOException p0) throws Throwable {
    throw __call3043725_0(p0);
}
public static void h437_26(java.io.IOException p0) throws Throwable {
    throw __call3043726_0(p0);
}
public static void h437_27(java.io.IOException p0) throws Throwable {
    throw __call3043727_0(p0);
}
public static void h437_28(java.io.IOException p0) throws Throwable {
    throw __call3043728_0(p0);
}
public static void h437_29(java.io.IOException p0) throws Throwable {
    throw __call3043729_0(p0);
}
public static void h437_30(java.io.IOException p0) throws Throwable {
    throw __call3043730_0(p0);
}
public static void h437_31(java.io.IOException p0) throws Throwable {
    throw __call3043731_0(p0);
}
public static void h437_32(java.io.IOException p0) throws Throwable {
    throw __call3043732_0(p0);
}
public static void h437_33(java.io.IOException p0) throws Throwable {
    throw __call3043733_0(p0);
}
public static void h437_34(java.io.IOException p0) throws Throwable {
    throw __call3043734_0(p0);
}
public static void h437_35(java.io.IOException p0) throws Throwable {
    throw __call3043735_0(p0);
}
public static void h437_36(java.io.IOException p0) throws Throwable {
    throw __call3043736_0(p0);
}
public static void h437_37(java.io.IOException p0) throws Throwable {
    throw __call3043737_0(p0);
}
public static void h437_38(java.io.IOException p0) throws Throwable {
    throw __call3043738_0(p0);
}
public static void h437_39(java.io.IOException p0) throws Throwable {
    throw __call3043739_0(p0);
}
public static void h437_40(java.io.IOException p0) throws Throwable {
    throw __call3043740_0(p0);
}
public static void h437_41(java.io.IOException p0) throws Throwable {
    throw __call3043741_0(p0);
}
public static void h437_42(java.io.IOException p0) throws Throwable {
    throw __call3043742_0(p0);
}
public static void h437_43(java.io.IOException p0) throws Throwable {
    throw __call3043743_0(p0);
}
public static void h437_44(java.io.IOException p0) throws Throwable {
    throw __call3043744_0(p0);
}
public static void h437_45(java.io.IOException p0) throws Throwable {
    throw __call3043745_0(p0);
}
public static void h437_46(java.io.IOException p0) throws Throwable {
    throw __call3043746_0(p0);
}
public static void h437_47(java.io.IOException p0) throws Throwable {
    throw __call3043747_0(p0);
}
public static void h437_48(java.io.IOException p0) throws Throwable {
    throw __call3043748_0(p0);
}
public static void h437_49(java.io.IOException p0) throws Throwable {
    throw __call3043749_0(p0);
}
public static void h437_50(java.io.IOException p0) throws Throwable {
    throw __call3043750_0(p0);
}
private static native long __fieldRead437_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call437_1() throws Throwable;
private static native boolean __fieldRead437_2(moom.gc a0) throws Throwable;
private static native int __integerCategory437_3(boolean value) throws Throwable;
private static native int __instanceOf437_4(moom.gc a0) throws Throwable;
private static native moom.gw __cast437_5(moom.gc a0) throws Throwable;
private static native int __integerCategory437_6(boolean value) throws Throwable;
private static native int __fieldRead437_7(moom.gc a0) throws Throwable;
private static native int __call437_8() throws Throwable;
private static native java.lang.String __invokedynamic437_9(int a0, long a1) throws Throwable;
private static native java.io.File __fieldRead437_11() throws Throwable;
private static native java.lang.String __call437_12(java.io.File a0) throws Throwable;
private static native java.lang.String __call437_13(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Runtime __call437_14() throws Throwable;
private static native java.lang.Process __call437_15(java.lang.Runtime a0, java.lang.String a1) throws Throwable;
private static native java.lang.Runtime __call437_16() throws Throwable;
private static native java.lang.String __invokedynamic437_18(int a0, long a1) throws Throwable;
private static native java.io.File __fieldRead437_20() throws Throwable;
private static native java.lang.String __call437_21(java.io.File a0) throws Throwable;
private static native java.lang.Process __call437_22(java.lang.Runtime a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __invokedynamic437_23(int a0, long a1) throws Throwable;
private static native java.lang.Class __call437_24(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic437_25(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __call437_26(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call437_27(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic437_28(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral437_30() throws Throwable;
private static native java.lang.reflect.Method __call437_31(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead437_33(moom.hH a0) throws Throwable;
private static native java.io.File __fieldRead437_34(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic437_35(int a0, long a1) throws Throwable;
private static native java.net.URI __call437_36(java.io.File a0) throws Throwable;
private static native java.lang.Object __call437_37(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic437_38(int a0, long a1) throws Throwable;
private static native void __call437_39(java.lang.String a0) throws Throwable;
private static native java.io.File __fieldRead437_40() throws Throwable;
private static native java.lang.String __call437_41(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic437_42(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic437_44(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call437_45(java.lang.String a0) throws Throwable;
private static native int __integerCategory437_46(boolean value) throws Throwable;
private static native void __discardScalar437_47(int a0) throws Throwable;
private static native void __call437_48() throws Throwable;
private static native void __fieldWrite437_49(moom.hH a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead437_50(moom.hH a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead437_51(moom.hH a0) throws Throwable;
private static native void __call437_52(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call437_53() throws Throwable;
private static native net.minecraft.client.Minecraft __call437_54() throws Throwable;
private static native void __call437_55(net.minecraft.client.Minecraft a0, moom.hG a1) throws Throwable;
private static native java.lang.String __invokedynamic437_56(int a0, long a1) throws Throwable;
private static native java.lang.Class __call437_57(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic437_58(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __call437_59(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call437_60(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic437_61(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral437_63() throws Throwable;
private static native java.lang.reflect.Method __call437_64(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.String __invokedynamic437_66(int a0, long a1) throws Throwable;
private static native java.lang.Object __call437_67(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native moom.il __fieldRead437_68(moom.hH a0) throws Throwable;
private static native void __call437_69(moom.il a0, moom.gc a1) throws Throwable;
private static native int[] __fieldRead437_70() throws Throwable;
private static native moom.bW __call437_71(moom.gw a0) throws Throwable;
private static native int __call437_72(moom.bW a0) throws Throwable;
private static native int __integerCategory437_73(boolean value) throws Throwable;
private static native void __call437_74(int a0) throws Throwable;
private static native boolean __call437_75(moom.hH a0) throws Throwable;
private static native void __fieldWrite437_76(int a0) throws Throwable;
private static native void __call437_77() throws Throwable;
private static native boolean __fieldRead437_78() throws Throwable;
private static native int __integerCategory437_79(boolean value) throws Throwable;
private static native void __fieldWrite437_80(int a0) throws Throwable;
private static native boolean __call437_81(moom.hH a0) throws Throwable;
private static native void __fieldWrite437_82(int a0) throws Throwable;
private static native void __call437_83() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead437_84(moom.hH a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call437_85(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead437_86() throws Throwable;
private static native int __integerCategory437_87(boolean value) throws Throwable;
private static native void __fieldWrite437_88(int a0) throws Throwable;
private static native boolean __call437_89(moom.hH a0) throws Throwable;
private static native void __fieldWrite437_90(int a0) throws Throwable;
private static native void __call437_91() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead437_92(moom.hH a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call437_93(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead437_94() throws Throwable;
private static native float[] __fieldRead437_95() throws Throwable;
private static native int __integerCategory437_96(boolean value) throws Throwable;
private static native boolean __call437_97(moom.hH a0) throws Throwable;
private static native float __call437_98(moom.hH a0, float a1, float[] a2, float a3, int a4, boolean a5) throws Throwable;
private static native void __fieldWrite437_99(float a0) throws Throwable;
private static native void __call437_100() throws Throwable;
private static native void __call437_101() throws Throwable;
private static native float __fieldRead437_102() throws Throwable;
private static native float[] __fieldRead437_103() throws Throwable;
private static native int __integerCategory437_104(boolean value) throws Throwable;
private static native boolean __call437_105(moom.hH a0) throws Throwable;
private static native float __call437_106(moom.hH a0, float a1, float[] a2, float a3, int a4, boolean a5) throws Throwable;
private static native void __fieldWrite437_107(float a0) throws Throwable;
private static native void __call437_108() throws Throwable;
private static native void __call437_109() throws Throwable;
private static native float __fieldRead437_110() throws Throwable;
private static native float[] __fieldRead437_111() throws Throwable;
private static native int __integerCategory437_112(boolean value) throws Throwable;
private static native boolean __call437_113(moom.hH a0) throws Throwable;
private static native float __call437_114(moom.hH a0, float a1, float[] a2, float a3, int a4, boolean a5) throws Throwable;
private static native void __fieldWrite437_115(float a0) throws Throwable;
private static native void __call437_116() throws Throwable;
private static native moom.M0 __fieldRead437_117() throws Throwable;
private static native int __integerCategory437_118(boolean value) throws Throwable;
private static native void __call437_119(moom.M0 a0, int a1) throws Throwable;
private static native boolean __call437_120(moom.hH a0) throws Throwable;
private static native moom.M0 __fieldRead437_121() throws Throwable;
private static native void __call437_122(moom.M0 a0) throws Throwable;
private static native void __call437_123() throws Throwable;
private static native moom.M0 __fieldRead437_124() throws Throwable;
private static native int __integerCategory437_125(boolean value) throws Throwable;
private static native void __call437_126(moom.M0 a0, int a1) throws Throwable;
private static native boolean __call437_127(moom.hH a0) throws Throwable;
private static native moom.M0 __fieldRead437_128() throws Throwable;
private static native void __call437_129(moom.M0 a0) throws Throwable;
private static native void __call437_130() throws Throwable;
private static native void __call437_131() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead437_132(moom.hH a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call437_133(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead437_134() throws Throwable;
private static native int __integerCategory437_135(boolean value) throws Throwable;
private static native void __fieldWrite437_136(int a0) throws Throwable;
private static native boolean __fieldRead437_137() throws Throwable;
private static native int __integerCategory437_138(boolean value) throws Throwable;
private static native void __fieldWrite437_139(int a0) throws Throwable;
private static native int __fieldRead437_140() throws Throwable;
private static native void __fieldWrite437_141(int a0) throws Throwable;
private static native int __fieldRead437_142() throws Throwable;
private static native void __fieldWrite437_144(int a0) throws Throwable;
private static native void __fieldWrite437_145(int a0) throws Throwable;
private static native java.lang.String[] __fieldRead437_146() throws Throwable;
private static native int __fieldRead437_147() throws Throwable;
private static native java.lang.String __invokedynamic437_148(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic437_150(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite437_151(moom.gc a0, java.lang.String a1) throws Throwable;
private static native void __call437_152() throws Throwable;
private static native int __fieldRead437_153() throws Throwable;
private static native void __fieldWrite437_154(int a0) throws Throwable;
private static native java.lang.String[] __fieldRead437_155() throws Throwable;
private static native int __fieldRead437_156() throws Throwable;
private static native java.lang.String __invokedynamic437_157(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic437_159(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite437_160(moom.gc a0, java.lang.String a1) throws Throwable;
private static native void __call437_161() throws Throwable;
private static native int __fieldRead437_162() throws Throwable;
private static native void __fieldWrite437_163(int a0) throws Throwable;
private static native java.lang.String[] __fieldRead437_164() throws Throwable;
private static native int __fieldRead437_165() throws Throwable;
private static native java.lang.String __invokedynamic437_166(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic437_168(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite437_169(moom.gc a0, java.lang.String a1) throws Throwable;
private static native void __call437_170() throws Throwable;
private static native boolean __fieldRead437_171() throws Throwable;
private static native int __integerCategory437_172(boolean value) throws Throwable;
private static native void __fieldWrite437_173(int a0) throws Throwable;
private static native boolean __fieldRead437_174() throws Throwable;
private static native java.lang.String __call437_175(boolean a0) throws Throwable;
private static native java.lang.String __invokedynamic437_176(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic437_178(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite437_179(moom.gc a0, java.lang.String a1) throws Throwable;
private static native void __call437_180() throws Throwable;
private static native void __call437_181(moom.gw a0) throws Throwable;
private static native java.lang.Exception __call3043700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043705_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043706_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043707_0(java.io.IOException a0) throws Throwable;
private static native void __call3043708_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Runtime __call3043708_1() throws Throwable;
private static native java.lang.String __invokedynamic3043708_3(int a0, long a1) throws Throwable;
private static native java.io.File __fieldRead3043708_5() throws Throwable;
private static native java.lang.String __call3043708_6(java.io.File a0) throws Throwable;
private static native java.lang.Process __call3043708_7(java.lang.Runtime a0, java.lang.String[] a1) throws Throwable;
private static native java.lang.String __invokedynamic3043708_8(int a0, long a1) throws Throwable;
private static native java.lang.Class __call3043708_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3043708_10(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __call3043708_11(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call3043708_12(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043708_13(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral3043708_15() throws Throwable;
private static native java.lang.reflect.Method __call3043708_16(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043708_18(moom.hH a0) throws Throwable;
private static native java.io.File __fieldRead3043708_19(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic3043708_20(int a0, long a1) throws Throwable;
private static native java.net.URI __call3043708_21(java.io.File a0) throws Throwable;
private static native java.lang.Object __call3043708_22(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043708_23(int a0, long a1) throws Throwable;
private static native void __call3043708_24(java.lang.String a0) throws Throwable;
private static native java.io.File __fieldRead3043708_25() throws Throwable;
private static native java.lang.String __call3043708_26(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3043708_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3043708_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call3043708_30(java.lang.String a0) throws Throwable;
private static native int __integerCategory3043708_31(boolean value) throws Throwable;
private static native void __discardScalar3043708_32(int a0) throws Throwable;
private static native void __call3043708_33() throws Throwable;
private static native void __fieldWrite3043708_34(moom.hH a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043708_35(moom.hH a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead3043708_36(moom.hH a0) throws Throwable;
private static native void __call3043708_37(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call3043708_38() throws Throwable;
private static native net.minecraft.client.Minecraft __call3043708_39() throws Throwable;
private static native void __call3043708_40(net.minecraft.client.Minecraft a0, moom.hG a1) throws Throwable;
private static native java.lang.String __invokedynamic3043708_41(int a0, long a1) throws Throwable;
private static native java.lang.Class __call3043708_42(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3043708_43(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __call3043708_44(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call3043708_45(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043708_46(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral3043708_48() throws Throwable;
private static native java.lang.reflect.Method __call3043708_49(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043708_51(int a0, long a1) throws Throwable;
private static native java.lang.Object __call3043708_52(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native moom.il __fieldRead3043708_53(moom.hH a0) throws Throwable;
private static native void __call3043708_54(moom.il a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call3043709_0(moom.Oo a0) throws Throwable;
private static native void __call3043710_0(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic3043710_1(int a0, long a1) throws Throwable;
private static native java.lang.Class __call3043710_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3043710_3(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __call3043710_4(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call3043710_5(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043710_6(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral3043710_8() throws Throwable;
private static native java.lang.reflect.Method __call3043710_9(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043710_11(moom.hH a0) throws Throwable;
private static native java.io.File __fieldRead3043710_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __invokedynamic3043710_13(int a0, long a1) throws Throwable;
private static native java.net.URI __call3043710_14(java.io.File a0) throws Throwable;
private static native java.lang.Object __call3043710_15(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043710_16(int a0, long a1) throws Throwable;
private static native void __call3043710_17(java.lang.String a0) throws Throwable;
private static native java.io.File __fieldRead3043710_18() throws Throwable;
private static native java.lang.String __call3043710_19(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3043710_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3043710_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call3043710_23(java.lang.String a0) throws Throwable;
private static native int __integerCategory3043710_24(boolean value) throws Throwable;
private static native void __discardScalar3043710_25(int a0) throws Throwable;
private static native void __call3043710_26() throws Throwable;
private static native void __fieldWrite3043710_27(moom.hH a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043710_28(moom.hH a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead3043710_29(moom.hH a0) throws Throwable;
private static native void __call3043710_30(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call3043710_31() throws Throwable;
private static native net.minecraft.client.Minecraft __call3043710_32() throws Throwable;
private static native void __call3043710_33(net.minecraft.client.Minecraft a0, moom.hG a1) throws Throwable;
private static native java.lang.String __invokedynamic3043710_34(int a0, long a1) throws Throwable;
private static native java.lang.Class __call3043710_35(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3043710_36(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __call3043710_37(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call3043710_38(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043710_39(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral3043710_41() throws Throwable;
private static native java.lang.reflect.Method __call3043710_42(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043710_44(int a0, long a1) throws Throwable;
private static native java.lang.Object __call3043710_45(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native moom.il __fieldRead3043710_46(moom.hH a0) throws Throwable;
private static native void __call3043710_47(moom.il a0, moom.gc a1) throws Throwable;
private static native void __call3043711_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.String __invokedynamic3043711_1(int a0, long a1) throws Throwable;
private static native void __call3043711_2(java.lang.String a0) throws Throwable;
private static native java.io.File __fieldRead3043711_3() throws Throwable;
private static native java.lang.String __call3043711_4(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3043711_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3043711_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call3043711_8(java.lang.String a0) throws Throwable;
private static native int __integerCategory3043711_9(boolean value) throws Throwable;
private static native void __discardScalar3043711_10(int a0) throws Throwable;
private static native void __call3043711_11() throws Throwable;
private static native void __fieldWrite3043711_12(moom.hH a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3043711_13(moom.hH a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead3043711_14(moom.hH a0) throws Throwable;
private static native void __call3043711_15(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __call3043711_16() throws Throwable;
private static native net.minecraft.client.Minecraft __call3043711_17() throws Throwable;
private static native void __call3043711_18(net.minecraft.client.Minecraft a0, moom.hG a1) throws Throwable;
private static native java.lang.String __invokedynamic3043711_19(int a0, long a1) throws Throwable;
private static native java.lang.Class __call3043711_20(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic3043711_21(int a0, long a1) throws Throwable;
private static native java.lang.reflect.Method __call3043711_22(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.Object __call3043711_23(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043711_24(int a0, long a1) throws Throwable;
private static native java.lang.Class __classLiteral3043711_26() throws Throwable;
private static native java.lang.reflect.Method __call3043711_27(java.lang.Class a0, java.lang.String a1, java.lang.Class[] a2) throws Throwable;
private static native java.lang.String __invokedynamic3043711_29(int a0, long a1) throws Throwable;
private static native java.lang.Object __call3043711_30(java.lang.reflect.Method a0, java.lang.Object a1, java.lang.Object[] a2) throws Throwable;
private static native moom.il __fieldRead3043711_31(moom.hH a0) throws Throwable;
private static native void __call3043711_32(moom.il a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call3043712_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043713_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043714_0(java.io.IOException a0) throws Throwable;
private static native void __call3043715_0(java.lang.Throwable a0) throws Throwable;
private static native moom.il __fieldRead3043715_1(moom.hH a0) throws Throwable;
private static native void __call3043715_2(moom.il a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call3043716_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043717_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043718_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043719_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043720_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043721_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043722_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043723_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043724_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043725_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043726_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043727_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043728_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043729_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043730_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043731_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043732_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043733_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043734_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043735_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043736_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043737_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043738_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043739_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043740_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043741_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043742_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043743_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043744_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043745_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043746_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043747_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043748_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043749_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043750_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_d4843795f8744862d71d(boolean a0) throws E;
private static final class __SourceHandler_d4843795f8744862d71d {

public static java.lang.String f1773(boolean p0) throws Throwable {
    long life1_3;
    java.lang.String life3_5;
    java.lang.String life4_7;
    life1_3 = (__fieldRead1773_0() ^ 118193901158414L);
    life3_5 = __call1773_1();
    life4_7 = __call1773_2();
    return (p0 ? life3_5 : life4_7);
}
public static void h1773_0(moom.Oo p0) throws Throwable {
    throw __call1177300_0(p0);
}
private static native long __fieldRead1773_0() throws Throwable;
private static native java.lang.String __call1773_1() throws Throwable;
private static native java.lang.String __call1773_2() throws Throwable;
private static native java.lang.Exception __call1177300_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f53b0935a6d69ed643da(moom.hH a0) throws E;
private static final class __SourceHandler_f53b0935a6d69ed643da {

public static void f1049(moom.hH receiver) throws Throwable {
    int lexicalValue1049_36_0;
    int lexicalValue1049_36_1;
    int lexicalValue1049_46_0;
    int lexicalValue1049_46_1;
    int lexicalValue1049_55_0;
    int lexicalValue1049_55_1;
    moom.gc lexicalValue1049_57_0;
    net.minecraft.entity.Entity[] spill1049_0;
    int spill1049_1;
    int spill1049_2;
    moom.gc spill1049_3;
    long life1_3;
    int life4_5;
    java.util.Iterator life5_10;
    net.minecraft.entity.Entity[] life3_11;
    moom.gc life6_18;
    lexical_join_61: {
    life1_3 = (__fieldRead1049_0() ^ 48361733953378L);
    life4_5 = __integerCategory1049_2(__call1049_1());
    spill1049_0 = __call1049_3();
    life5_10 = __call1049_5(__fieldRead1049_4(receiver));
    life3_11 = spill1049_0;
    lexical_cycle_12: while (true) {
    lexical_join_59: {
    lexical_join_57: {
    lexical_join_55: {
    lexical_join_46: {
    lexical_join_36: {
    if (!(__call1049_6(life5_10))) {
        break lexical_join_61;
    }
    life6_18 = __cast1049_8(__call1049_7(life5_10));
    spill1049_1 = __fieldRead1049_9(life6_18);
    spill1049_2 = __invokedynamic1049_10(16509, (3272082984192164009L ^ life1_3));
    if (!((life3_11 == null))) {
        lexicalValue1049_36_0 = spill1049_1;
        lexicalValue1049_36_1 = spill1049_2;
        break lexical_join_36;
    }
    if (!((spill1049_1 != spill1049_2))) {
        break lexical_join_59;
    }
    lexicalValue1049_36_0 = __fieldRead1049_11(life6_18);
    lexicalValue1049_36_1 = __invokedynamic1049_12(7657, (5972265233867644184L ^ life1_3));
    }
    if (!((life3_11 == null))) {
        lexicalValue1049_46_0 = lexicalValue1049_36_0;
        lexicalValue1049_46_1 = lexicalValue1049_36_1;
        break lexical_join_46;
    }
    if (!((lexicalValue1049_36_0 != lexicalValue1049_36_1))) {
        break lexical_join_59;
    }
    lexicalValue1049_46_0 = __fieldRead1049_13(life6_18);
    lexicalValue1049_46_1 = __invokedynamic1049_14(18051, (5563136688492004949L ^ life1_3));
    }
    if (!((life3_11 == null))) {
        lexicalValue1049_55_0 = lexicalValue1049_46_0;
        lexicalValue1049_55_1 = lexicalValue1049_46_1;
        break lexical_join_55;
    }
    if (!((lexicalValue1049_46_0 != lexicalValue1049_46_1))) {
        break lexical_join_59;
    }
    spill1049_3 = life6_18;
    if (!((life3_11 == null))) {
        lexicalValue1049_57_0 = spill1049_3;
        break lexical_join_57;
    }
    lexicalValue1049_55_0 = __fieldRead1049_15(spill1049_3);
    lexicalValue1049_55_1 = __call1049_17(__fieldRead1049_16());
    }
    if (!((lexicalValue1049_55_0 != lexicalValue1049_55_1))) {
        break lexical_join_59;
    }
    lexicalValue1049_57_0 = life6_18;
    }
    __fieldWrite1049_18(lexicalValue1049_57_0, life4_5);
    }
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return;
}
public static void h1049_0(moom.Oo p0) throws Throwable {
    throw __call1104900_0(p0);
}
public static void h1049_1(moom.Oo p0) throws Throwable {
    throw __call1104901_0(p0);
}
public static void h1049_2(moom.Oo p0) throws Throwable {
    throw __call1104902_0(p0);
}
public static void h1049_3(moom.Oo p0) throws Throwable {
    throw __call1104903_0(p0);
}
public static void h1049_4(moom.Oo p0) throws Throwable {
    throw __call1104904_0(p0);
}
public static void h1049_5(moom.Oo p0) throws Throwable {
    throw __call1104905_0(p0);
}
public static void h1049_6(moom.Oo p0) throws Throwable {
    throw __call1104906_0(p0);
}
private static native long __fieldRead1049_0() throws Throwable;
private static native boolean __call1049_1() throws Throwable;
private static native int __integerCategory1049_2(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1049_3() throws Throwable;
private static native java.util.List __fieldRead1049_4(moom.hH a0) throws Throwable;
private static native java.util.Iterator __call1049_5(java.util.List a0) throws Throwable;
private static native boolean __call1049_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1049_7(java.util.Iterator a0) throws Throwable;
private static native moom.gc __cast1049_8(java.lang.Object a0) throws Throwable;
private static native int __fieldRead1049_9(moom.gc a0) throws Throwable;
private static native int __invokedynamic1049_10(int a0, long a1) throws Throwable;
private static native int __fieldRead1049_11(moom.gc a0) throws Throwable;
private static native int __invokedynamic1049_12(int a0, long a1) throws Throwable;
private static native int __fieldRead1049_13(moom.gc a0) throws Throwable;
private static native int __invokedynamic1049_14(int a0, long a1) throws Throwable;
private static native int __fieldRead1049_15(moom.gc a0) throws Throwable;
private static native moom.bW __fieldRead1049_16() throws Throwable;
private static native int __call1049_17(moom.bW a0) throws Throwable;
private static native void __fieldWrite1049_18(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1104900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1104906_0(moom.Oo a0) throws Throwable;

}


public static java.lang.String b(float p0) {
return moom.hH.a(((float)(p0)), ((float[])(moom.hH.E)), ((java.lang.String[])(moom.hH.F)));
}


protected void b__Void(moom.gc p0) {
((moom.hH)(this)).a(((moom.gc)(p0)), ((boolean)(true)));
    return;
}


public void e() throws java.io.IOException {
super.e();
    ((moom.il)(this.A)).c__Void();
    return;
}


public boolean e__Boolean() {
return (__sourceIntrinsic_booleanComparison((moom.hH.c__Boolean())) != 0);
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


public void c__Void() {
long life1_3;
    net.minecraft.entity.Entity[] life3_15;
    int life4_27;
    int life5_33;
    int life6_44;
    int life7_50;
    int life8_56;
    int life9_67;
    int life10_249;
    int life11_257;
    int life12_266;
    life1_3 = (moom.hH.H ^ 133520721252009L);
    net.minecraft.entity.Entity[] spill1803_0 = net.minecraft.potion.Potion.b__Arrayr3();
    this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_2(23572, (5631717963407823583L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))));
    life3_15 = spill1803_0;
    try {
        if ((moom.MP.ds == null)) {
        moom.MP.a__Void();
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.hH.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    life4_27 = __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_8(27283, (862937792188183433L ^ life1_3));
    life5_33 = __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_9(14678, (9091159951324553313L ^ life1_3));
    life6_44 = ((this.k - life4_27) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_11(23391, (3472686796625396331L ^ life1_3)));
    life7_50 = __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_12(16990, (6512498222117641075L ^ life1_3));
    life8_56 = __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_13(24455, (4807066251619747491L ^ life1_3));
    life9_67 = ((this.k - life4_27) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_15(24455, (4807066251619747491L ^ life1_3)));
    this.A = ((moom.il)(new moom.il(this, life9_67, this.l, life7_50, (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_18(16600, (1233656130006079981L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_19(26850, (7065426171055075787L ^ life1_3)))));
    ((moom.il)(this.A)).c(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_22(4651, (2984367802323110668L ^ life1_3)))), ((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_23(8043, (997920802250851959L ^ life1_3)))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.ANTIALIASING, life6_44, life7_50, life4_27, life5_33))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.NORMAL_MAP, life6_44, (life8_56 + life7_50), life4_27, life5_33))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.SPECULAR_MAP, life6_44, ((2 * life8_56) + life7_50), life4_27, life5_33))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.RENDER_RES_MUL, life6_44, ((3 * life8_56) + life7_50), life4_27, life5_33))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.SHADOW_RES_MUL, life6_44, ((4 * life8_56) + life7_50), life4_27, life5_33))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.HAND_DEPTH_MUL, life6_44, ((5 * life8_56) + life7_50), life4_27, life5_33))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.OLD_HAND_LIGHT, life6_44, ((__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_45(24212, (6638008166944982927L ^ life1_3)) * life8_56) + life7_50), life4_27, life5_33))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gw(moom.bW.OLD_LIGHTING, life6_44, ((__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_49(1089, (3803460635518606704L ^ life1_3)) * life8_56) + life7_50), life4_27, life5_33))));
    life10_249 = java.lang.Math.min(((int)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_51(14064, (5746876142400516058L ^ life1_3)))), ((int)(((life9_67 / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_52(9573, (267274413159988295L ^ life1_3))))));
    life11_257 = ((life9_67 / 4) - (life10_249 / 2));
    life12_266 = (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_55(31385, (6603158258499052463L ^ life1_3)));
    try {
        ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_57(3502, (7066520227267744913L ^ life1_3)), life11_257, life12_266, ((life10_249 - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_58(22008, (1656797633597689040L ^ life1_3))) + 1), life5_33, moom.JM.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_59(32201, (6275430297066156850L ^ life1_3)))))))));
        ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gv(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_63(24348, (5641798995247973935L ^ life1_3)), (((life11_257 + life10_249) - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_64(24991, (6281858924778420391L ^ life1_3))) - 1), life12_266))));
        ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_67(25241, (2185461114983676855L ^ life1_3)), (((life9_67 / 4) * 3) - (life10_249 / 2)), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_69(9961, (4539061583296217026L ^ life1_3))), life10_249, life5_33, moom.oO.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_70(1922, (2238778927127808331L ^ life1_3)))), ((java.lang.Object[])(new java.lang.Object[0])))))));
        ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_74(31817, (3408331389505824104L ^ life1_3)), life6_44, (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_76(9961, (4539061583296217026L ^ life1_3))), life4_27, life5_33, moom.JM.a(((java.lang.String)(__sourceIntrinsic_7ac46ee229a8_invokedynamic1803_77(19426, (1757587914634331398L ^ life1_3)))))))));
        ((moom.hH)(this)).a__Void();
        if ((life3_15 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    } catch (moom.Oo caught_rethrow_1) {
        throw moom.hH.c(((java.lang.Exception)(caught_rethrow_1)));
    }
    return;
}


public void h() {
long life1_3;
    life1_3 = (moom.hH.H ^ 59573762009294L);
    try {
        super.h();
        if ((!this.B)) {
        moom.MP.b__Void();
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.hH.c(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7860_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.hH.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 19018;
      if (M[var3] == null) {
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
         long var5 = L[var3];
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
         Object[] var9 = (Object[])N.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               N.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hH", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         M[var3] = var15;
      }

      return M[var3];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.hH.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7569);
    if (((moom.hH.J)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.hH.K)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.hH.K)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/hH", life9_51);
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
        life9_116 = ((java.lang.String)((moom.hH.I)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.hH.J)[life5_8] = moom.hH.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.hH.J)[life5_8];
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
        byte[] spill4173_0 = p0;
        life4_9 += 1;
        life5_44 = (spill4173_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill4173_1 = p0;
        life4_9 += 1;
        life5_76 = (spill4173_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill4173_2 = p0;
        life4_9 += 1;
        life5_91 = (spill4173_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void a(moom.gc p0, boolean p1) { __sourceHandlerCall_33385d36084a8e860830(this, p0, p1); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_75fc03b4ce6823551eea(this, p0, p1, p2); }


private float a(float p0, float[] p1, float p2, boolean p3, boolean p4) { return __sourceHandlerCall_6f57fb6d3d10d23ad106(this, p0, p1, p2, p3, p4); }


public void a__Void() { __sourceHandlerCall_f53b0935a6d69ed643da(this); }


protected void a__Void(moom.gc p0) {
((moom.hH)(this)).a(((moom.gc)(p0)), ((boolean)(false)));
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7867_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hH"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static java.lang.String a(boolean p0) { return __sourceHandlerCall_d4843795f8744862d71d(p0); }


public void a(java.lang.String p0, int p1, int p2, int p3) {
((moom.hH)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)));
    return;
}


public static java.lang.String a(float p0, float[] p1, java.lang.String[] p2) {
int local3 = moom.hH.a(((float)(p0)), ((float[])(p1)));
    return (p2)[local3];
}


public static java.lang.String a__sourceReturn_b52d34d971(int p0) { return __sourceHandlerCall_bd2a08fcdc90689540bb(p0); }


public static int a(float p0, float[] p1) { return __sourceHandlerCall_66ffe025a5787ab6864e(p0, p1); }


public static int a() { return __sourceHandlerCall_b17f5e441a95130410e7(); }


public net.minecraft.client.Minecraft a__fM() {
return this.i;
}


public static java.lang.String a(float p0) {
return moom.hH.a(((float)(p0)), ((float[])(moom.hH.C)), ((java.lang.String[])(moom.hH.D)));
}


public void g() {
super.g();
    this.z -= 1;
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_109(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_111(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_112(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_114(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_118(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_120(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_122(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_124(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_125(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_126(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_127(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_128(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_129(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_133(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_135(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite863_136(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cc74e9a84546c201_originalDynamicSite2820_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7867_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_58(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic1803_77(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral7860_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
