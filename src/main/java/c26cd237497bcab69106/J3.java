package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class J3 {

private java.lang.String a;

public static moom.Kf[] b;

public static net.minecraft.item.EnumDyeColor[] c;

private static moom.J6<java.lang.Enum> d;

private static moom.J6<net.minecraft.item.EnumDyeColor> e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public J3(java.lang.String p0) {
super();
    this.a = null;
    this.a = p0;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(3114715007827029477L)), ((long)(-4345229399371090507L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(280860540154748L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.J3.f ^ 41407114902356L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill588_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill588_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill588_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill588_14 = new byte[8];
    (__sourceSpill588_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill588_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation588_16 = __sourceSpill588_14;
    ((javax.crypto.Cipher)(__sourceSpill588_11)).init(((int)(__sourceSpill588_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill588_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation588_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[67];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\177*ù*¿i\f¾8G\017ÍíÇ¨<R}òäÆ§Y/ê»¼}\\âñµSêì\020\177C±·«Ð0\027#0[ô¼È(ì\bZï\"im´C2ýQÁb\"d÷ÁË}ÚÅáè[<BÇF¤R8å2\005\006å\0344\020áÈ\030«r¢ô\007$F\004wíÓ\020Ë=«ãï\r\017I·z@Î\027Ì\020[¶6\020ÇßöpöE_¿µ®(ÖM»¸\006\031á'áç>§¦\017ñÚ<¿¼3\007Ø|« X_]àçp2ò¤ê'\020Ü 7 Gd¿~S,\017,\032úi(+Z.\003»\036\034¾Í>Q'n\001ë\téEÞ@Õåm;.¥*\030±\037÷Cn(ß»ï\177åV\037äñJ\b¼)ÒêÝäþGÝ{õö<yHÇ×\021tÙ~[\022K¦\036(»%\tvë8yÆT\025Î37*T®âá2`,{\020¶uH~\016h¢Ãý\030Þó\tÓ\bMýÕþa`#òI\032\003òQM\025k(.[ìgìrn§fsK-L\007¬}r±Áó`\003Á½Gvdêôr\005J\0206\013 ù7\024\177\034N¬¢_¼ú<\0204þ74lÄÇU-o½W\020\005ËÒC% úT\032f¼Ññó [«XçF\037=\000\031m}\025t«\023¥Ä2\023RS¼¤!a\020g+e\036me1\003Hþ\002IT\005.  lD²îÎHU\0004E\nþ%Ó\003AûK³øïr«Þ\013ÅN\020î«µ`Ç\035|kq6£~ÊWýI\020\177å\007á»ô\"\023)Ûñ¿°E(+cs\036¦\"\033ZáÐ\b4\023e¿x¢GoM\007\0072l×v}¨Ìòk(¬Ð(\035ÚË\013DÎ`ªLÐ\020C¢¯\f©\021iÛîÄ\013D¸\035E=@a\tþù¾cé\020¯\027f\177úmØ¹t¬°ê_QVê eË4y\t þU|¦\026÷ÆS$]mí²»\f(/\007xÞE(\0308x·ÕûÃdòï\035¢ðýó ÌÜ4j`÷\020\024uo½ö\n:9ë`\024ï\023×®Á\020²:c¢qn\t;SUßD\016ñÂ\020«?Ý %W×øájèTZ0»mB\035\032\027£w8ðQ\037\031ûÙ\033ãÐ õ-x\007$_B\030%À¡XÅo§RñÇ¯Úeæ¥Çû þÁCð¬×|º:*\"7\035u\t£³íÐÉ\006y\020Ú\nÎR\003Ã\030¼õRúð ÕMéâRÜ\023<«WÁB\003;(µ\013éí.e\006D%¦wf!i5W\027ä\004uðs9e\0162®À\023\007¦\036\033\020ÅÉ\001\022\f\013ÐÂ%½¦÷Ñ Ò£\007¬_\017\034¡-Pì#\016­A\030hæÎ-]ä\007bûÙ½çF²\020gvÚ§VT®A(\177eFÓ0¯B=úäË\0173î¸\016Õ¦K\027Ý;ª\016\025uý5dJq'ê|0\177ÈbÈ\000dÞ+Éã\022\025æ\006¦\030\rÔº¡¡*\026§ýD4ö\001m×fØS\0374: >p§É*n2<D\000\035'â¤ûl$Ôu¤\n\025¹ÖõþÄ\020'.ðg'\024a*Àf©$(k3ðÐ1yQPSt1@\023<Êç\025¿ù¤Ë§Óú_;áxµ$ö\026ãz d<Ý=ø\001àû/\005üÔß[2\n@|åún¡I@)ÆØÊöÙB HÎ¢M÷¬â\027ûd\017idÊ`\\{\001Ñ²üGß\004W\006f8¨D-\020¬O\002ÙßÑ (GûxÉ\026Æ×\020¤Å 3\b\bLÛ\016Y4bS®8\"²¬¿\035 bõÿkÆüêX!©H¸­Àr\020\0257ºì§­¯½]Ô;þPíå\177Wð\020ê\005-ÐH\020±Ì\003 k\000ã\025Ñª¯\025ü\020ÃBqw/f¦Ë\024HÊá\024\026*\030\030¬ÜUÂ)\r\022à:ï0ZÔæK¹5IÇ\030°Émò\001iY1_ÍðÈÒ°»U$¼\021J¤\020Ç­y2ìÕ=(2±\031°\036Õ\020]]K\032º~µG±mõ`Ó0\036?dv3³7mÛÁô\"¬Å^?^·üÙ\017ë)úG\020JWbÑ!\003\025'Ïâ\bx¨»réû Ùu_õ5\026åz§\020e°\"·5Z×ez\026]®ý^ª·î éF¢KÅÅ;'\fafê:¸U£á\017RõÂ\037¹ýÚÍ\020\fbîS|Q4þüè[H»³(;üTì*´Y`pù¨ÂÑl¼×²xDìíK\005C|\030äU]þye\177ÙªÄ& LD:\017¢\034Å;í¦\034\026­í\004»î±b¢ÄEbh\n\020ÀVf²ðÞ4Þë÷â¼~±0\b>öe[<($ª>:Êká\020\007óÈRä@¥\025éoæ½äÔ¤Në/NÈÌj28÷{#JÿÙ;kñhr[\035\034Ñýe°T´ß#àx ¨\025È+ÙHSÿü@Hèêý\032G\"!è\036R*D «_:ü\007\000îYTë\031N\027\177\021~hU\016­ü°1Ç#ÎÆ3\020îÔvx¹£ê*?ä+}Ý=ô¯\020\001>¼0Q><\027zã¥HO¢ä\020MËêã á¸;¯±üm¥¹\032\025"))).length();
    int local16_life24 = 40;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill588_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill588_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill588_29)).doFinal(((byte[])(__sourceSpill588_28)));
        java.lang.String __sourceSpill588_34 = ((java.lang.String)(moom.J3.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill588_35 = local20_life19;
        int __sourceSpill588_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill588_35)[__sourceSpill588_36] = __sourceSpill588_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "ÇÌú~T4è¤stNèJp\"\020hÞ\016A×lØ.K{¥©\003­"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill588_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill588_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill588_42)).doFinal(((byte[])(__sourceSpill588_41)));
        java.lang.String __sourceSpill588_47 = ((java.lang.String)(moom.J3.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill588_48 = local20_life19;
        int __sourceSpill588_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill588_48)[__sourceSpill588_49] = __sourceSpill588_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    g = ((java.lang.String[])(local20_life19));
    h = ((java.lang.String[])(new java.lang.String[67]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill588_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill588_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill588_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill588_60 = new byte[8];
    (__sourceSpill588_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill588_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation588_62 = __sourceSpill588_60;
    ((javax.crypto.Cipher)(__sourceSpill588_57)).init(((int)(__sourceSpill588_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill588_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation588_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[9];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = ",V¨\fì\\#)­\031¢¹¦æ\bA\026Í»+ä:Uç°4ì´\036/zÃÇà!ÝÌñ+¶AÑêZÒÇM"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill588_71 = local4_life67;
        int __sourceSpill588_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill588_71)).substring(((int)(__sourceSpill588_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill588_76 = local6_life65;
        int __sourceSpill588_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill588_79 = new byte[8];
        (__sourceSpill588_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill588_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill588_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill588_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill588_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill588_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill588_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill588_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill588_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill588_80)).doFinal(((byte[])(__sourceSpill588_79)));
        (__sourceSpill588_76)[__sourceSpill588_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "._ÝÈ´6KþG{Ò¡\022!p"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill588_84 = local4_life67;
        int __sourceSpill588_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill588_84)).substring(((int)(__sourceSpill588_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill588_89 = local6_life65;
        int __sourceSpill588_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill588_92 = new byte[8];
        (__sourceSpill588_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill588_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill588_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill588_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill588_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill588_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill588_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill588_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill588_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill588_93)).doFinal(((byte[])(__sourceSpill588_92)));
        (__sourceSpill588_89)[__sourceSpill588_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    j = ((long[])(local6_life65));
    k = ((java.lang.Integer[])(new java.lang.Integer[9]));
    b = ((moom.Kf[])(new moom.Kf[0]));
    c = ((net.minecraft.item.EnumDyeColor[])(new net.minecraft.item.EnumDyeColor[0]));
    d = ((moom.J6)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite588_100()));
    e = ((moom.J6)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite588_102()));
}

private static native <E extends Throwable> net.minecraft.block.state.IBlockState __sourceHandlerCall_f64e1378c75bb63d92dc(moom.J3 a0, net.minecraft.block.Block a1, int a2) throws E;
private static final class __SourceHandler_f64e1378c75bb63d92dc {

public static net.minecraft.block.state.IBlockState f275(moom.J3 receiver, net.minecraft.block.Block p0, int p1) throws Throwable {
    long life3_3;
    net.minecraft.block.state.IBlockState life5_7;
    net.minecraft.block.state.IBlockState life6_30;
    life3_3 = (__fieldRead275_0() ^ 19873782130804L);
    life5_7 = __call275_1(p0, p1);
    if ((p0 == __fieldRead275_2())) {
        if ((p1 > __invokedynamic275_3(892, (356524861429716630L ^ life3_3)))) {
        life6_30 = __call275_5(p0, (p1 & __invokedynamic275_4(6873, (7216415138293354294L ^ life3_3))));
        life5_7 = __call275_10(life5_7, __fieldRead275_6(), __cast275_9(__call275_8(life6_30, __fieldRead275_7())));
    }
    }
    return life5_7;
}
public static net.minecraft.block.state.IBlockState h275_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call2027500_0(p0);
}
public static net.minecraft.block.state.IBlockState h275_1(java.lang.IllegalArgumentException p0, net.minecraft.block.Block p1) throws Throwable {
    java.lang.IllegalArgumentException local2 = p0;
    return __call2027501_0(p1);
}
private static native long __fieldRead275_0() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call275_1(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native moom.cz __fieldRead275_2() throws Throwable;
private static native int __invokedynamic275_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic275_4(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call275_5(net.minecraft.block.Block a0, int a1) throws Throwable;
private static native moom.fw __fieldRead275_6() throws Throwable;
private static native moom.fw __fieldRead275_7() throws Throwable;
private static native java.lang.Comparable __call275_8(net.minecraft.block.state.IBlockState a0, moom.fw a1) throws Throwable;
private static native net.minecraft.block.BlockDoublePlant$EnumPlantType __cast275_9(java.lang.Comparable a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call275_10(net.minecraft.block.state.IBlockState a0, moom.fw a1, net.minecraft.block.BlockDoublePlant$EnumPlantType a2) throws Throwable;
private static native java.lang.IllegalArgumentException __call2027500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call2027501_0(net.minecraft.block.Block a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_916ff409680442ddd7d4(moom.J3 a0, net.minecraft.block.Block a1, java.lang.String[] a2) throws E;
private static final class __SourceHandler_916ff409680442ddd7d4 {

public static int[] f100085(moom.J3 receiver, net.minecraft.block.Block p0, java.lang.String[] p1) throws Throwable {
    java.lang.String[] forestValue100085_14_0;
    moom.J3 forestValue100085_25_0;
    java.lang.String forestValue100085_25_1;
    java.lang.String[] forestValue100085_70_0;
    java.lang.Object forestValue100085_89_0;
    int forestValue100085_205_0;
    int forestValue100085_239_0;
    int forestValue100085_245_0;
    int forestValue100085_257_0;
    int[] forestValue100085_279_0;
    java.lang.String[] spill100085_0;
    moom.J3 spill100085_1;
    java.lang.String spill100085_2;
    int spill100085_3;
    java.lang.String[] spill100085_4;
    net.minecraft.block.properties.IProperty spill100085_5;
    java.lang.Comparable spill100085_6;
    moom.J3 spill100085_7;
    moom.J3 spill100085_8;
    java.lang.String spill100085_9;
    java.lang.String spill100085_10;
    net.minecraft.block.Block spill100085_11;
    moom.J3 spill100085_12;
    java.lang.String spill100085_13;
    java.lang.String spill100085_14;
    boolean spill100085_15;
    int[] spill100085_16;
    long life3_3;
    int life5_5;
    java.lang.String life6_17;
    net.minecraft.block.state.IBlockState life7_32;
    java.util.Collection life8_35;
    java.util.HashMap life9_39;
    java.lang.String[] life10_41;
    int life11_44;
    int life12_46;
    java.lang.String life13_53;
    java.lang.String[] life14_66;
    java.lang.String life15_77;
    java.lang.String life16_81;
    net.minecraft.block.properties.IProperty life17_85;
    java.util.List life18_95;
    java.lang.String[] life19_110;
    java.lang.String[] life20_112;
    int life21_115;
    int life22_117;
    java.lang.String life23_124;
    java.lang.Comparable life24_128;
    net.minecraft.block.Block life25_186;
    java.lang.String life26_187;
    java.lang.String life27_188;
    java.util.ArrayList life10_219;
    int life11_221;
    net.minecraft.block.state.IBlockState life12_233;
    int[] life11_271;
    int life12_273;
    forest_join_279: {
    forest_join_278: {
    forest_join_257: {
    forest_join_255: {
    forest_join_245: {
    forest_join_243: {
    forest_join_208: {
    forest_join_205: {
    forest_join_203: {
    forest_join_174: {
    forest_join_154: {
    forest_join_142: {
    forest_join_27: {
    forest_join_25: {
    forest_join_14: {
    forest_join_13: {
    life3_3 = (__fieldRead100085_0() ^ 61624693492718L);
    life5_5 = __call100085_1();
    spill100085_0 = p1;
    if (!((life5_5 == 0))) {
        forestValue100085_14_0 = spill100085_0;
        break forest_join_14;
    }
    if (!(((spill100085_0).length == 0))) {
        break forest_join_13;
    }
    return null;
    }
    forestValue100085_14_0 = p1;
    }
    life6_17 = (forestValue100085_14_0)[0];
    spill100085_1 = receiver;
    spill100085_2 = life6_17;
    if (!((life5_5 == 0))) {
        forestValue100085_25_0 = spill100085_1;
        forestValue100085_25_1 = spill100085_2;
        break forest_join_25;
    }
    if (!(__call100085_2(spill100085_1, spill100085_2))) {
        break forest_join_27;
    }
    forestValue100085_25_0 = receiver;
    forestValue100085_25_1 = life6_17;
    }
    return __call100085_3(forestValue100085_25_0, forestValue100085_25_1);
    }
    life7_32 = __call100085_4(p0);
    life8_35 = __call100085_5(life7_32);
    life9_39 = new java.util.HashMap();
    life10_41 = p1;
    life11_44 = (life10_41).length;
    life12_46 = 0;
    forest_cycle_44: while (true) {
    forest_join_139: {
    forest_join_138: {
    forest_join_89: {
    forest_join_86: {
    forest_join_70: {
    forest_join_69: {
    if (!((life12_46 < life11_44))) {
        break forest_join_203;
    }
    life13_53 = (life10_41)[life12_46];
    if (!((life5_5 == 0))) {
        break forest_join_139;
    }
    spill100085_3 = __call100085_6(life13_53);
    if (!((life5_5 == 0))) {
        forestValue100085_205_0 = spill100085_3;
        break forest_join_205;
    }
    if (!((spill100085_3 > 0))) {
        break forest_join_138;
    }
    life14_66 = __call100085_7(life13_53, "=");
    spill100085_4 = life14_66;
    if (!((life5_5 == 0))) {
        forestValue100085_70_0 = spill100085_4;
        break forest_join_70;
    }
    if (!(((spill100085_4).length != 2))) {
        break forest_join_69;
    }
    break forest_join_142;
    }
    forestValue100085_70_0 = life14_66;
    }
    life15_77 = (forestValue100085_70_0)[0];
    life16_81 = (life14_66)[1];
    life17_85 = __call100085_8(life15_77, life8_35);
    spill100085_5 = life17_85;
    if (!((life5_5 == 0))) {
        forestValue100085_89_0 = spill100085_5;
        break forest_join_89;
    }
    if (!((spill100085_5 == null))) {
        break forest_join_86;
    }
    break forest_join_154;
    }
    forestValue100085_89_0 = __call100085_9(life9_39, life15_77);
    }
    forest_cycle_89: while (true) {
    forest_join_102: {
    life18_95 = __cast100085_10(forestValue100085_89_0);
    if (!((life18_95 == null))) {
        break forest_join_102;
    }
    life18_95 = new java.util.ArrayList();
    __call100085_11(life9_39, life17_85, life18_95);
    }
    life19_110 = __call100085_12(life16_81, ",");
    life20_112 = life19_110;
    life21_115 = (life20_112).length;
    life22_117 = 0;
    forest_cycle_113: while (true) {
    forest_join_136: {
    forest_join_131: {
    if (!((life22_117 < life21_115))) {
        break forest_join_138;
    }
    life23_124 = (life20_112)[life22_117];
    life24_128 = __call100085_13(life17_85, life23_124);
    if (!((life5_5 == 0))) {
        break forest_join_136;
    }
    spill100085_6 = life24_128;
    if (!((life5_5 == 0))) {
        forestValue100085_89_0 = spill100085_6;
        continue forest_cycle_89;
    }
    if (!((spill100085_6 == null))) {
        break forest_join_131;
    }
    break forest_join_174;
    }
    __call100085_14(life18_95, life24_128);
    life22_117 += 1;
    }
    if (!((life5_5 != 0))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    break forest_cycle_89;
    }
    }
    life12_46 += 1;
    }
    if (!((life5_5 != 0))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_join_203;
    }
    spill100085_7 = receiver;
    java.lang.String __stackOp100085_16_0 = life13_53;
    java.lang.String __stackOp100085_16_1 = __invokedynamic100085_15(1134, (1737825036274033946L ^ life3_3));
    __call100085_18(spill100085_7, __invokedynamic100085_17(__stackOp100085_16_1, __stackOp100085_16_0));
    return null;
    }
    spill100085_8 = receiver;
    java.lang.String __stackOp100085_20_0 = life15_77;
    net.minecraft.block.Block __stackOp100085_20_1 = p0;
    java.lang.String __stackOp100085_20_2 = __invokedynamic100085_19(24505, (1337896219760836320L ^ life3_3));
    spill100085_9 = __stackOp100085_20_2;
    spill100085_10 = __stackOp100085_20_0;
    spill100085_11 = __stackOp100085_20_1;
    __discardScalar100085_21(__stackOp100085_20_2);
    net.minecraft.block.Block __stackOp100085_23_0 = spill100085_11;
    java.lang.String __stackOp100085_23_1 = __invokedynamic100085_22(15735, (7258815140268923935L ^ life3_3));
    __call100085_25(spill100085_8, __invokedynamic100085_24(spill100085_9, spill100085_10, __stackOp100085_23_1, __stackOp100085_23_0));
    return null;
    }
    spill100085_12 = receiver;
    spill100085_13 = life23_124;
    spill100085_14 = life15_77;
    life25_186 = p0;
    life26_187 = spill100085_14;
    life27_188 = spill100085_13;
    __call100085_30(spill100085_12, __invokedynamic100085_29(__invokedynamic100085_26(3506, (7982231857666845903L ^ life3_3)), life27_188, __invokedynamic100085_27(14065, (34868034835437453L ^ life3_3)), life26_187, __invokedynamic100085_28(23724, (4678935277117193709L ^ life3_3)), life25_186));
    return null;
    }
    forestValue100085_205_0 = __integerCategory100085_32(__call100085_31(life9_39));
    }
    if (!((forestValue100085_205_0 != 0))) {
        break forest_join_208;
    }
    return null;
    }
    life10_219 = new java.util.ArrayList();
    life11_221 = 0;
    forest_cycle_214: while (true) {
    forest_join_240: {
    forest_join_239: {
    if (!((life11_221 < __invokedynamic100085_33(3725, (3414391521008711932L ^ life3_3))))) {
        break forest_join_243;
    }
    life12_233 = __call100085_34(receiver, p0, life11_221);
    spill100085_15 = __call100085_35(receiver, life12_233, life9_39);
    if (!((life5_5 == 0))) {
        forestValue100085_245_0 = __integerCategory100085_36(spill100085_15);
        break forest_join_245;
    }
    if (!((life5_5 == 0))) {
        forestValue100085_239_0 = __integerCategory100085_37(spill100085_15);
        break forest_join_239;
    }
    if (!(spill100085_15)) {
        break forest_join_240;
    }
    forestValue100085_239_0 = __integerCategory100085_40(__call100085_39(life10_219, __call100085_38(life11_221)));
    }
    __discardScalar100085_41(forestValue100085_239_0);
    }
    life11_221 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_214;
    }
    break forest_cycle_214;
    }
    }
    forestValue100085_245_0 = __call100085_42(life10_219);
    }
    if (!((life5_5 == 0))) {
        forestValue100085_257_0 = forestValue100085_245_0;
        break forest_join_257;
    }
    if (!((forestValue100085_245_0 == __invokedynamic100085_43(9120, (2215497066567456214L ^ life3_3))))) {
        break forest_join_255;
    }
    return null;
    }
    forestValue100085_257_0 = __call100085_44(life10_219);
    }
    life11_271 = new int[forestValue100085_257_0];
    life12_273 = 0;
    forest_cycle_261: while (true) {
    if (!((life12_273 < (life11_271).length))) {
        break forest_join_278;
    }
    spill100085_16 = life11_271;
    if (!((life5_5 == 0))) {
        forestValue100085_279_0 = spill100085_16;
        break forest_join_279;
    }
    (spill100085_16)[life12_273] = __call100085_47(__cast100085_46(__call100085_45(life10_219, life12_273)));
    life12_273 += 1;
    if (!((life5_5 != 0))) {
        continue forest_cycle_261;
    }
    break forest_cycle_261;
    }
    }
    forestValue100085_279_0 = life11_271;
    }
    return forestValue100085_279_0;
}
public static int[] h100085_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008500_0(p0);
}
public static int[] h100085_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008501_0(p0);
}
public static int[] h100085_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008502_0(p0);
}
public static int[] h100085_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008503_0(p0);
}
public static int[] h100085_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008504_0(p0);
}
public static int[] h100085_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008505_0(p0);
}
public static int[] h100085_6(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008506_0(p0);
}
public static int[] h100085_7(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008507_0(p0);
}
public static int[] h100085_8(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008508_0(p0);
}
public static int[] h100085_9(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008509_0(p0);
}
public static int[] h100085_10(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008510_0(p0);
}
public static int[] h100085_11(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008511_0(p0);
}
public static int[] h100085_12(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008512_0(p0);
}
public static int[] h100085_13(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008513_0(p0);
}
public static int[] h100085_14(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008514_0(p0);
}
public static int[] h100085_15(java.lang.IllegalArgumentException p0, moom.J3 p1, net.minecraft.block.Block p2, long p3, int p4, java.util.HashMap p5, java.util.ArrayList p6, int p7) throws Throwable {
    int forestValue13008515_31_0;
    int forestValue13008515_35_0;
    int forestValue13008515_47_0;
    int[] forestValue13008515_69_0;
    boolean spill13008515_0;
    int[] spill13008515_1;
    java.lang.IllegalArgumentException life9_2;
    net.minecraft.block.state.IBlockState life9_18;
    int[] life8_53;
    int life9_55;
    forest_join_69: {
    forest_join_68: {
    forest_join_47: {
    forest_join_45: {
    forest_join_35: {
    forest_join_33: {
    life9_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_32: {
    forest_join_31: {
    forest_join_6: {
    p7 += 1;
    if (!((p4 != 0))) {
        break forest_join_6;
    }
    break forest_join_33;
    }
    if (!((p7 < __invokedynamic13008515_0(3725, (3414391521008711932L ^ p3))))) {
        break forest_join_33;
    }
    life9_18 = __call13008515_1(p1, p2, p7);
    spill13008515_0 = __call13008515_2(p1, life9_18, p5);
    if (!((p4 == 0))) {
        forestValue13008515_35_0 = __integerCategory13008515_3(spill13008515_0);
        break forest_join_35;
    }
    if (!((p4 == 0))) {
        forestValue13008515_31_0 = __integerCategory13008515_4(spill13008515_0);
        break forest_join_31;
    }
    if (!(spill13008515_0)) {
        break forest_join_32;
    }
    forestValue13008515_31_0 = __integerCategory13008515_7(__call13008515_6(p6, __call13008515_5(p7)));
    }
    __discardScalar13008515_8(forestValue13008515_31_0);
    }
    continue forest_cycle_2;
    }
    }
    forestValue13008515_35_0 = __call13008515_9(p6);
    }
    if (!((p4 == 0))) {
        forestValue13008515_47_0 = forestValue13008515_35_0;
        break forest_join_47;
    }
    if (!((forestValue13008515_35_0 == __invokedynamic13008515_10(9120, (2215497066567456214L ^ p3))))) {
        break forest_join_45;
    }
    return null;
    }
    forestValue13008515_47_0 = __call13008515_11(p6);
    }
    life8_53 = new int[forestValue13008515_47_0];
    life9_55 = 0;
    forest_cycle_51: while (true) {
    if (!((life9_55 < (life8_53).length))) {
        break forest_join_68;
    }
    spill13008515_1 = life8_53;
    if (!((p4 == 0))) {
        forestValue13008515_69_0 = spill13008515_1;
        break forest_join_69;
    }
    (spill13008515_1)[life9_55] = __call13008515_14(__cast13008515_13(__call13008515_12(p6, life9_55)));
    life9_55 += 1;
    if (!((p4 != 0))) {
        continue forest_cycle_51;
    }
    break forest_cycle_51;
    }
    }
    forestValue13008515_69_0 = life8_53;
    }
    return forestValue13008515_69_0;
}
public static int[] h100085_16(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008516_0(p0);
}
public static int[] h100085_17(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008517_0(p0);
}
public static int[] h100085_18(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call13008518_0(p0);
}
private static native long __fieldRead100085_0() throws Throwable;
private static native int __call100085_1() throws Throwable;
private static native boolean __call100085_2(moom.J3 a0, java.lang.String a1) throws Throwable;
private static native int[] __call100085_3(moom.J3 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100085_4(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.Collection __call100085_5(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call100085_6(java.lang.String a0) throws Throwable;
private static native java.lang.String[] __call100085_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.properties.IProperty __call100085_8(java.lang.String a0, java.util.Collection a1) throws Throwable;
private static native java.lang.Object __call100085_9(java.util.HashMap a0, java.lang.String a1) throws Throwable;
private static native java.util.List __cast100085_10(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call100085_11(java.util.HashMap a0, net.minecraft.block.properties.IProperty a1, java.util.List a2) throws Throwable;
private static native java.lang.String[] __call100085_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Comparable __call100085_13(net.minecraft.block.properties.IProperty a0, java.lang.String a1) throws Throwable;
private static native boolean __call100085_14(java.util.List a0, java.lang.Comparable a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100085_18(moom.J3 a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_19(int a0, long a1) throws Throwable;
private static native void __discardScalar100085_21(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100085_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_24(java.lang.String a0, java.lang.String a1, java.lang.String a2, net.minecraft.block.Block a3) throws Throwable;
private static native void __call100085_25(moom.J3 a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_28(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100085_29(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, net.minecraft.block.Block a5) throws Throwable;
private static native void __call100085_30(moom.J3 a0, java.lang.String a1) throws Throwable;
private static native boolean __call100085_31(java.util.HashMap a0) throws Throwable;
private static native int __integerCategory100085_32(boolean value) throws Throwable;
private static native int __invokedynamic100085_33(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call100085_34(moom.J3 a0, net.minecraft.block.Block a1, int a2) throws Throwable;
private static native boolean __call100085_35(moom.J3 a0, net.minecraft.block.state.IBlockState a1, java.util.HashMap a2) throws Throwable;
private static native int __integerCategory100085_36(boolean value) throws Throwable;
private static native int __integerCategory100085_37(boolean value) throws Throwable;
private static native java.lang.Integer __call100085_38(int a0) throws Throwable;
private static native boolean __call100085_39(java.util.ArrayList a0, java.lang.Integer a1) throws Throwable;
private static native int __integerCategory100085_40(boolean value) throws Throwable;
private static native void __discardScalar100085_41(int a0) throws Throwable;
private static native int __call100085_42(java.util.ArrayList a0) throws Throwable;
private static native int __invokedynamic100085_43(int a0, long a1) throws Throwable;
private static native int __call100085_44(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object __call100085_45(java.util.ArrayList a0, int a1) throws Throwable;
private static native java.lang.Integer __cast100085_46(java.lang.Object a0) throws Throwable;
private static native int __call100085_47(java.lang.Integer a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008500_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008501_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008502_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008503_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008504_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008505_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008506_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008507_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008508_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008509_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008510_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008511_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008512_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008513_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008514_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native int __invokedynamic13008515_0(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call13008515_1(moom.J3 a0, net.minecraft.block.Block a1, int a2) throws Throwable;
private static native boolean __call13008515_2(moom.J3 a0, net.minecraft.block.state.IBlockState a1, java.util.HashMap a2) throws Throwable;
private static native int __integerCategory13008515_3(boolean value) throws Throwable;
private static native int __integerCategory13008515_4(boolean value) throws Throwable;
private static native java.lang.Integer __call13008515_5(int a0) throws Throwable;
private static native boolean __call13008515_6(java.util.ArrayList a0, java.lang.Integer a1) throws Throwable;
private static native int __integerCategory13008515_7(boolean value) throws Throwable;
private static native void __discardScalar13008515_8(int a0) throws Throwable;
private static native int __call13008515_9(java.util.ArrayList a0) throws Throwable;
private static native int __invokedynamic13008515_10(int a0, long a1) throws Throwable;
private static native int __call13008515_11(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object __call13008515_12(java.util.ArrayList a0, int a1) throws Throwable;
private static native java.lang.Integer __cast13008515_13(java.lang.Object a0) throws Throwable;
private static native int __call13008515_14(java.lang.Integer a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008516_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008517_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call13008518_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_a40de0849627f43d8e19(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_a40de0849627f43d8e19 {

public static int f277(java.lang.String p0, int p1) throws Throwable {
    java.lang.String forwardValue277_16_0;
    java.lang.String spill277_0;
    long life2_3;
    int life4_5;
    java.lang.String life0_19;
    forward_join_16: {
    forward_join_12: {
    life2_3 = (__fieldRead277_0() ^ 126308902091859L);
    life4_5 = __call277_1();
    spill277_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue277_16_0 = spill277_0;
        break forward_join_16;
    }
    if (!((spill277_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    life0_19 = __call277_2(p0);
    forwardValue277_16_0 = life0_19;
    }
    return (__call277_4(forwardValue277_16_0, __invokedynamic277_3(9120, (2215573330283913835L ^ life2_3))) & __invokedynamic277_5(17194, (6965285213711532782L ^ life2_3)));
}
public static int h277_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2027700_0(p0);
}
public static int h277_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2027701_0(p0);
}
public static int h277_2(java.lang.NumberFormatException p0, int p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native long __fieldRead277_0() throws Throwable;
private static native int __call277_1() throws Throwable;
private static native java.lang.String __call277_2(java.lang.String a0) throws Throwable;
private static native int __invokedynamic277_3(int a0, long a1) throws Throwable;
private static native int __call277_4(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic277_5(int a0, long a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call2027700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2027701_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_2caf29e67edcfa905b55(java.lang.String a0, int a1) throws E;
private static final class __SourceHandler_2caf29e67edcfa905b55 {

public static int f278(java.lang.String p0, int p1) throws Throwable {
    java.lang.String forwardValue278_16_0;
    java.lang.String spill278_0;
    long life2_3;
    int life4_5;
    java.lang.String life0_19;
    forward_join_16: {
    forward_join_12: {
    life2_3 = (__fieldRead278_0() ^ 16402235341181L);
    life4_5 = __call278_1();
    spill278_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue278_16_0 = spill278_0;
        break forward_join_16;
    }
    if (!((spill278_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    life0_19 = __call278_2(p0);
    forwardValue278_16_0 = life0_19;
    }
    return ((int) __call278_4(forwardValue278_16_0, __invokedynamic278_3(9120, (2215542588448073541L ^ life2_3))));
}
public static int h278_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2027800_0(p0);
}
public static int h278_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2027801_0(p0);
}
public static int h278_2(java.lang.NumberFormatException p0, int p1) throws Throwable {
    java.lang.NumberFormatException local2 = p0;
    return p1;
}
private static native long __fieldRead278_0() throws Throwable;
private static native int __call278_1() throws Throwable;
private static native java.lang.String __call278_2(java.lang.String a0) throws Throwable;
private static native int __invokedynamic278_3(int a0, long a1) throws Throwable;
private static native long __call278_4(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.IllegalArgumentException __call2027800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.IllegalArgumentException __call2027801_0(java.lang.NumberFormatException a0) throws Throwable;

}


public static int b(java.lang.String p0, int p1) { return __sourceHandlerCall_a40de0849627f43d8e19(p0, p1); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4995_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b__Void(java.lang.String p0) {
long local2_life2 = (moom.J3.f ^ 125270502658873L);
    java.lang.String __sourceSpill518_6 = this.a;
    java.lang.String __stackOp518_7_0 = p0;
    java.lang.String __stackOp518_7_1 = __sourceIntrinsic_d09e7390a875_originalDynamicSite518_5(29566, (3704229933575031521L ^ local2_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_d09e7390a875_originalDynamicSite518_8(__sourceSpill518_6, __stackOp518_7_1, __stackOp518_7_0))));
    return;
}


public int[] b__ArrayInt(java.lang.String p0) {
net.minecraft.item.Item lexicalValue819_60_0;
    int lexicalValue819_90_0;
    java.lang.Object[] lexicalValue819_98_0;
    int spill819_0;
    java.lang.String[] spill819_1;
    net.minecraft.item.Item spill819_2;
    moom.J3 spill819_3;
    int spill819_4;
    moom.J3 spill819_5;
    java.lang.String spill819_6;
    net.minecraft.item.Item spill819_7;
    java.lang.String spill819_8;
    long life2_3;
    java.lang.String life1_6;
    java.util.TreeSet life5_10;
    java.lang.String[] life6_15;
    int life4_16;
    java.lang.String[] life7_18;
    int life8_21;
    int life9_23;
    java.lang.String life10_32;
    moom.DD life11_37;
    net.minecraft.item.Item life12_42;
    int life13_70;
    java.lang.Integer[] life7_117;
    lexical_join_98: {
    lexical_join_94: {
    life2_3 = (moom.J3.f ^ 91913191331882L);
    life1_6 = ((java.lang.String)(p0)).trim();
    life5_10 = new java.util.TreeSet();
    spill819_0 = moom.J_.c();
    life6_15 = moom.BU.a__ArrayString(((java.lang.String)(life1_6)), ((java.lang.String)(" ")));
    life4_16 = spill819_0;
    life7_18 = life6_15;
    life8_21 = (life7_18).length;
    life9_23 = 0;
    lexical_cycle_24: while (true) {
    lexical_join_91: {
    lexical_join_90: {
    lexical_join_86: {
    lexical_join_60: {
    lexical_join_59: {
    if (!((life9_23 < life8_21))) {
        break lexical_join_94;
    }
    spill819_1 = life7_18;
    if (!((life4_16 != 0))) {
        lexicalValue819_98_0 = spill819_1;
        break lexical_join_98;
    }
    life10_32 = (spill819_1)[life9_23];
    life11_37 = new moom.DD(life10_32);
    life12_42 = ((net.minecraft.item.Item)(((moom.DB)(net.minecraft.item.Item.a)).a__Object(((java.lang.Object)(life11_37)))));
    spill819_2 = life12_42;
    if (!((life4_16 != 0))) {
        lexicalValue819_60_0 = spill819_2;
        break lexical_join_60;
    }
    if (!((spill819_2 == null))) {
        break lexical_join_59;
    }
    spill819_3 = this;
    java.lang.String __stackOp819_8_0 = life10_32;
    java.lang.String __stackOp819_8_1 = __sourceIntrinsic_f245134e4e44_invokedynamic819_7(15990, (152906719240670403L ^ life2_3));
    ((moom.J3)(spill819_3)).b__Void(((java.lang.String)(__sourceIntrinsic_f245134e4e44_invokedynamic819_9(__stackOp819_8_1, __stackOp819_8_0))));
    if (!((life4_16 == 0))) {
        break lexical_join_91;
    }
    }
    lexicalValue819_60_0 = life12_42;
    }
    life13_70 = net.minecraft.item.Item.a(((net.minecraft.item.Item)(lexicalValue819_60_0)));
    spill819_4 = life13_70;
    if (!((life4_16 != 0))) {
        lexicalValue819_90_0 = spill819_4;
        break lexical_join_90;
    }
    if (!((spill819_4 < 0))) {
        break lexical_join_86;
    }
    spill819_5 = this;
    net.minecraft.item.Item __stackOp819_13_0 = life12_42;
    java.lang.String __stackOp819_13_1 = life10_32;
    java.lang.String __stackOp819_13_2 = __sourceIntrinsic_f245134e4e44_invokedynamic819_12(2418, (1536499088389962715L ^ life2_3));
    spill819_6 = __stackOp819_13_2;
    spill819_7 = __stackOp819_13_0;
    spill819_8 = __stackOp819_13_1;
    recovery.source.CarrierOps.discard(__stackOp819_13_2);
    java.lang.String __stackOp819_16_0 = spill819_8;
    java.lang.String __stackOp819_16_1 = __sourceIntrinsic_f245134e4e44_invokedynamic819_15(8845, (1375509249572851714L ^ life2_3));
    ((moom.J3)(spill819_5)).b__Void(((java.lang.String)(__sourceIntrinsic_f245134e4e44_invokedynamic819_17(spill819_6, spill819_7, __stackOp819_16_1, __stackOp819_16_0))));
    if (!((life4_16 == 0))) {
        break lexical_join_91;
    }
    }
    lexicalValue819_90_0 = ((((java.util.Set)(life5_10)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life13_70))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue819_90_0);
    }
    life9_23 += 1;
    if (!((life4_16 == 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue819_98_0 = ((java.util.Set)(life5_10)).toArray(((java.lang.Object[])(new java.lang.Integer[0])));
    }
    life7_117 = ((java.lang.Integer[])(lexicalValue819_98_0));
    return moom.BU.a(((java.lang.Integer[])(life7_117)));
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x54CF;
        if (k[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])J3.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    J3.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/J3", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            J3.k[n2] = n4;
        }
        return k[n2];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.J3.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public java.lang.String b(java.lang.String p0) {
long local2 = (moom.J3.f ^ 30927744997302L);
    int local4 = ((java.lang.String)(p0)).lastIndexOf(((int)(__sourceIntrinsic_73d8ac8b7602_invokedynamic4173_1(7716, (5164132380442817547L ^ local2)))));
    return ((local4 < 0) ? "" : ((java.lang.String)(p0)).substring(((int)(0)), ((int)(local4))));
}


public moom.J_[] b__ArrayJ_(java.lang.String p0) {
java.lang.String lexicalValue820_16_0;
    java.lang.String lexicalValue820_23_0;
    int lexicalValue820_61_0;
    net.minecraft.block.Block[] lexicalValue820_87_0;
    java.lang.String spill820_0;
    int spill820_1;
    boolean spill820_2;
    net.minecraft.block.Block[] spill820_3;
    long life2_3;
    int life4_5;
    java.lang.String[] life5_35;
    java.lang.String life6_41;
    int life7_43;
    int life7_70;
    java.lang.String life8_84;
    java.lang.String[] life9_93;
    net.minecraft.block.Block[] life10_98;
    moom.J_[] life11_113;
    int life12_115;
    net.minecraft.block.Block life13_123;
    int life14_126;
    int[] life15_128;
    moom.J_ life16_148;
    lexical_join_130: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_62: {
    lexical_join_61: {
    lexical_join_54: {
    lexical_join_23: {
    lexical_join_22: {
    lexical_join_16: {
    lexical_join_12: {
    life2_3 = (moom.J3.f ^ 49649170777773L);
    life4_5 = moom.J_.c();
    spill820_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue820_16_0 = spill820_0;
        break lexical_join_16;
    }
    if (!((spill820_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    p0 = ((java.lang.String)(p0)).trim();
    lexicalValue820_16_0 = p0;
    }
    if (!((life4_5 != 0))) {
        lexicalValue820_23_0 = lexicalValue820_16_0;
        break lexical_join_23;
    }
    if (!((((java.lang.String)(lexicalValue820_16_0)).length() == 0))) {
        break lexical_join_22;
    }
    return null;
    }
    lexicalValue820_23_0 = p0;
    }
    life5_35 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue820_23_0)), ((java.lang.String)(":")));
    life6_41 = __sourceIntrinsic_b329d3c8bee5_invokedynamic820_5(30545, (2159681920402004850L ^ life2_3));
    life7_43 = 0;
    spill820_1 = (life5_35).length;
    if (!((life4_5 != 0))) {
        lexicalValue820_61_0 = spill820_1;
        break lexical_join_61;
    }
    if (!((spill820_1 > 1))) {
        break lexical_join_54;
    }
    spill820_2 = ((moom.J3)(this)).a(((java.lang.String[])(life5_35)));
    if (!((life4_5 != 0))) {
        lexicalValue820_61_0 = ((spill820_2) ? 1 : 0);
        break lexical_join_61;
    }
    if (!(spill820_2)) {
        break lexical_join_54;
    }
    life6_41 = (life5_35)[0];
    life7_70 = 1;
    if (!((life4_5 == 0))) {
        break lexical_join_62;
    }
    }
    life6_41 = __sourceIntrinsic_b329d3c8bee5_invokedynamic820_8(29158, (5672342747805621722L ^ life2_3));
    lexicalValue820_61_0 = 0;
    }
    life7_70 = lexicalValue820_61_0;
    }
    life8_84 = (life5_35)[life7_70];
    life9_93 = ((java.lang.String[])(java.util.Arrays.copyOfRange(((java.lang.Object[])(life5_35)), ((int)((life7_70 + 1))), ((int)((life5_35).length)))));
    life10_98 = ((moom.J3)(this)).a__Arraych(((java.lang.String)(life6_41)), ((java.lang.String)(life8_84)));
    spill820_3 = life10_98;
    if (!((life4_5 != 0))) {
        lexicalValue820_87_0 = spill820_3;
        break lexical_join_87;
    }
    if (!((spill820_3 == null))) {
        break lexical_join_86;
    }
    return null;
    }
    lexicalValue820_87_0 = life10_98;
    }
    life11_113 = new moom.J_[(lexicalValue820_87_0).length];
    life12_115 = 0;
    lexical_cycle_92: while (true) {
    lexical_join_117: {
    if (!((life12_115 < (life10_98).length))) {
        break lexical_join_130;
    }
    life13_123 = (life10_98)[life12_115];
    life14_126 = net.minecraft.block.Block.a(((net.minecraft.block.Block)(life13_123)));
    life15_128 = null;
    if (!(((life9_93).length > 0))) {
        break lexical_join_117;
    }
    life15_128 = ((moom.J3)(this)).a(((net.minecraft.block.Block)(life13_123)), ((java.lang.String[])(life9_93)));
    if (!((life15_128 == null))) {
        break lexical_join_117;
    }
    return null;
    }
    life16_148 = new moom.J_(life14_126, life15_128);
    (life11_113)[life12_115] = life16_148;
    life12_115 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_92; }
    break lexical_cycle_92;
    }
    }
    return life11_113;
}


public int[] c(java.lang.String p0) {
int lexicalValue821_56_0;
    java.lang.Object[] lexicalValue821_64_0;
    int spill821_0;
    java.lang.String[] spill821_1;
    int spill821_2;
    moom.J3 spill821_3;
    long life2_3;
    java.lang.String life1_6;
    java.util.TreeSet life5_11;
    java.lang.String[] life6_15;
    java.lang.String[] life7_17;
    int life4_18;
    int life8_21;
    int life9_23;
    java.lang.String life10_32;
    int life11_35;
    java.lang.Integer[] life7_74;
    lexical_join_64: {
    lexical_join_60: {
    life2_3 = (moom.J3.f ^ 57381705638436L);
    life1_6 = ((java.lang.String)(p0)).trim();
    spill821_0 = moom.J_.b();
    life5_11 = new java.util.TreeSet();
    life6_15 = moom.BU.a__ArrayString(((java.lang.String)(life1_6)), ((java.lang.String)(" ")));
    life7_17 = life6_15;
    life4_18 = spill821_0;
    life8_21 = (life7_17).length;
    life9_23 = 0;
    lexical_cycle_24: while (true) {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_52: {
    if (!((life9_23 < life8_21))) {
        break lexical_join_60;
    }
    spill821_1 = life7_17;
    if (!((life4_18 == 0))) {
        lexicalValue821_64_0 = spill821_1;
        break lexical_join_64;
    }
    life10_32 = (spill821_1)[life9_23];
    life11_35 = moom.NM.a(((java.lang.String)(life10_32)));
    spill821_2 = life11_35;
    if (!((life4_18 == 0))) {
        lexicalValue821_56_0 = spill821_2;
        break lexical_join_56;
    }
    if (!((spill821_2 < 0))) {
        break lexical_join_52;
    }
    spill821_3 = this;
    java.lang.String __stackOp821_6_0 = life10_32;
    java.lang.String __stackOp821_6_1 = __sourceIntrinsic_e12022a7f1e0_invokedynamic821_5(10586, (6397003089645904348L ^ life2_3));
    ((moom.J3)(spill821_3)).b__Void(((java.lang.String)(__sourceIntrinsic_e12022a7f1e0_invokedynamic821_7(__stackOp821_6_1, __stackOp821_6_0))));
    if (!((life4_18 != 0))) {
        break lexical_join_57;
    }
    }
    lexicalValue821_56_0 = ((((java.util.Set)(life5_11)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life11_35))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue821_56_0);
    }
    life9_23 += 1;
    if (!((life4_18 != 0))) { continue lexical_cycle_24; }
    break lexical_cycle_24;
    }
    }
    lexicalValue821_64_0 = ((java.util.Set)(life5_11)).toArray(((java.lang.Object[])(new java.lang.Integer[0])));
    }
    life7_74 = ((java.lang.Integer[])(lexicalValue821_64_0));
    return moom.BU.a(((java.lang.Integer[])(life7_74)));
}


public static int c(java.lang.String p0, int p1) { return __sourceHandlerCall_2caf29e67edcfa905b55(p0, p1); }


public moom.Kb a(java.lang.String p0, java.lang.String p1) {
java.lang.String forwardValue2233_11_0;
    moom.Kb forwardValue2233_19_0;
    java.lang.String spill2233_0;
    long life3_3;
    int life5_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_11: {
    life3_3 = (moom.J3.f ^ 127124100736628L);
    life5_5 = moom.J_.b();
    spill2233_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2233_11_0 = spill2233_0;
        break forward_join_11;
    }
    if (!((spill2233_0 != null))) {
        break forward_join_18;
    }
    forwardValue2233_11_0 = p1;
    }
    if (!((forwardValue2233_11_0 != null))) {
        break forward_join_18;
    }
    forwardValue2233_19_0 = new moom.Kb(p0, p1);
    break forward_join_19;
    }
    forwardValue2233_19_0 = null;
    }
    return forwardValue2233_19_0;
}


public moom.Kf[] a__ArrayKf(java.lang.String p0) {
java.util.ArrayList lexicalValue815_69_0;
    moom.J3 spill815_0;
    java.util.ArrayList spill815_1;
    long life2_3;
    int life4_5;
    java.util.ArrayList life5_15;
    java.lang.String[] life6_19;
    java.lang.String[] life7_21;
    int life8_24;
    int life9_26;
    java.lang.String life10_33;
    moom.Kf life11_37;
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_61: {
    lexical_join_10: {
    life2_3 = (moom.J3.f ^ 50551052608256L);
    life4_5 = moom.J_.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return null;
    }
    life5_15 = new java.util.ArrayList();
    life6_19 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(" ")));
    life7_21 = life6_19;
    life8_24 = (life7_21).length;
    life9_26 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_59: {
    lexical_join_54: {
    if (!((life9_26 < life8_24))) {
        break lexical_join_61;
    }
    life10_33 = (life7_21)[life9_26];
    life11_37 = ((moom.J3)(this)).a__Kf(((java.lang.String)(life10_33)));
    if (!((life4_5 == 0))) {
        break lexical_join_68;
    }
    if (!((life4_5 == 0))) {
        break lexical_join_59;
    }
    if (!((life11_37 == null))) {
        break lexical_join_54;
    }
    spill815_0 = this;
    java.lang.String __stackOp815_5_0 = life10_33;
    java.lang.String __stackOp815_5_1 = __sourceIntrinsic_a19152a9326d_invokedynamic815_4(28945, (3891663108405934244L ^ life2_3));
    ((moom.J3)(spill815_0)).b__Void(((java.lang.String)(__sourceIntrinsic_a19152a9326d_invokedynamic815_6(__stackOp815_5_1, __stackOp815_5_0))));
    return moom.J3.b;
    }
    ((java.util.List)(life5_15)).add(((java.lang.Object)(life11_37)));
    life9_26 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    spill815_1 = life5_15;
    if (!((life4_5 == 0))) {
        lexicalValue815_69_0 = spill815_1;
        break lexical_join_69;
    }
    if (!(((java.util.List)(spill815_1)).isEmpty())) {
        break lexical_join_68;
    }
    return null;
    }
    lexicalValue815_69_0 = life5_15;
    }
    return ((moom.Kf[])(((java.util.List)(lexicalValue815_69_0)).toArray(((java.lang.Object[])(new moom.Kf[0])))));
}


private static int a(java.lang.String p0) {
int forwardValue2230_23_0;
    int forwardValue2230_35_0;
    int forwardValue2230_47_0;
    int forwardValue2230_59_0;
    int forwardValue2230_71_0;
    int forwardValue2230_83_0;
    int forwardValue2230_87_0;
    int forwardValue2230_89_0;
    int spill2230_0;
    int spill2230_1;
    long life1_3;
    int life4_8;
    int life3_9;
    forward_join_89: {
    forward_join_88: {
    forward_join_87: {
    forward_join_83: {
    forward_join_76: {
    forward_join_71: {
    forward_join_64: {
    forward_join_59: {
    forward_join_52: {
    forward_join_47: {
    forward_join_40: {
    forward_join_35: {
    forward_join_28: {
    forward_join_23: {
    forward_join_16: {
    life1_3 = (moom.J3.f ^ 79721833230346L);
    spill2230_0 = moom.J_.b();
    life4_8 = moom.BU.a(((java.lang.String)(p0)), ((int)(-1)));
    life3_9 = spill2230_0;
    spill2230_1 = life4_8;
    if (!((life3_9 == 0))) {
        forwardValue2230_23_0 = spill2230_1;
        break forward_join_23;
    }
    if (!((spill2230_1 >= 0))) {
        break forward_join_16;
    }
    forwardValue2230_89_0 = life4_8;
    break forward_join_89;
    }
    forwardValue2230_23_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2230_3(2897, (3605696709048766915L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue2230_35_0 = forwardValue2230_23_0;
        break forward_join_35;
    }
    if (!((forwardValue2230_23_0 != 0))) {
        break forward_join_28;
    }
    forwardValue2230_89_0 = 0;
    break forward_join_89;
    }
    forwardValue2230_35_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2230_6(3206, (765365418877523462L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue2230_47_0 = forwardValue2230_35_0;
        break forward_join_47;
    }
    if (!((forwardValue2230_35_0 != 0))) {
        break forward_join_40;
    }
    forwardValue2230_89_0 = 1;
    break forward_join_89;
    }
    forwardValue2230_47_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2230_9(991, (1586099494020159813L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue2230_59_0 = forwardValue2230_47_0;
        break forward_join_59;
    }
    if (!((forwardValue2230_47_0 != 0))) {
        break forward_join_52;
    }
    forwardValue2230_89_0 = 2;
    break forward_join_89;
    }
    forwardValue2230_59_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2230_12(20958, (7058869616377940809L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue2230_71_0 = forwardValue2230_59_0;
        break forward_join_71;
    }
    if (!((forwardValue2230_59_0 != 0))) {
        break forward_join_64;
    }
    forwardValue2230_89_0 = 3;
    break forward_join_89;
    }
    forwardValue2230_71_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2230_15(32132, (8242492122868279102L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue2230_83_0 = forwardValue2230_71_0;
        break forward_join_83;
    }
    if (!((forwardValue2230_71_0 != 0))) {
        break forward_join_76;
    }
    forwardValue2230_89_0 = 4;
    break forward_join_89;
    }
    forwardValue2230_83_0 = ((((java.lang.String)(p0)).equals(((java.lang.Object)(__sourceIntrinsic_599c5f800586_invokedynamic2230_18(9648, (431152346866204467L ^ life1_3)))))) ? 1 : 0);
    }
    if (!((life3_9 == 0))) {
        forwardValue2230_87_0 = forwardValue2230_83_0;
        break forward_join_87;
    }
    if (!((forwardValue2230_83_0 != 0))) {
        break forward_join_88;
    }
    forwardValue2230_87_0 = 5;
    }
    forwardValue2230_89_0 = forwardValue2230_87_0;
    break forward_join_89;
    }
    forwardValue2230_89_0 = -1;
    }
    return forwardValue2230_89_0;
}


private moom.Kf a__Kf(java.lang.String p0) {
java.lang.String[] forwardValue2255_22_0;
    java.lang.String[] forwardValue2255_34_0;
    int spill2255_0;
    java.lang.String[] spill2255_1;
    java.lang.String[] spill2255_2;
    long life2_3;
    java.lang.String life1_7;
    int life4_8;
    java.lang.String[] life5_12;
    java.lang.String life6_29;
    java.lang.String life7_31;
    int life8_50;
    int[] life9_58;
    forward_join_56: {
    forward_join_44: {
    forward_join_37: {
    forward_join_34: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (moom.J3.f ^ 120255975567994L);
    spill2255_0 = moom.J_.b();
    life1_7 = ((java.lang.String)(p0)).toLowerCase();
    life4_8 = spill2255_0;
    life5_12 = moom.BU.a__ArrayString(((java.lang.String)(life1_7)), ((java.lang.String)(":")));
    spill2255_1 = life5_12;
    if (!((life4_8 == 0))) {
        forwardValue2255_22_0 = spill2255_1;
        break forward_join_22;
    }
    if (!(((spill2255_1).length > 2))) {
        break forward_join_21;
    }
    return null;
    }
    forwardValue2255_22_0 = life5_12;
    }
    life6_29 = (forwardValue2255_22_0)[0];
    life7_31 = null;
    spill2255_2 = life5_12;
    if (!((life4_8 == 0))) {
        forwardValue2255_34_0 = spill2255_2;
        break forward_join_34;
    }
    if (!(((spill2255_2).length > 1))) {
        break forward_join_37;
    }
    forwardValue2255_34_0 = life5_12;
    }
    life7_31 = (forwardValue2255_34_0)[1];
    }
    life8_50 = moom.J3.a(((java.lang.String)(life6_29)));
    if (!((life8_50 < 0))) {
        break forward_join_44;
    }
    return null;
    }
    life9_58 = null;
    if (!((life7_31 != null))) {
        break forward_join_56;
    }
    life9_58 = moom.J3.a__ArrayInt(((int)(life8_50)), ((java.lang.String)(life7_31)));
    if (!((life9_58 == null))) {
        break forward_join_56;
    }
    return null;
    }
    return new moom.Kf(life8_50, life9_58);
}


public <T> T[] a(java.lang.String p0, T[] p1, moom.J6 p2, java.lang.String p3, T[] p4) {
java.lang.String lexicalValue808_17_0;
    java.lang.Object[] lexicalValue808_61_0;
    java.lang.String spill808_0;
    java.lang.String[] spill808_1;
    long life6_3;
    int life8_5;
    java.lang.String life1_20;
    java.lang.String[] life9_24;
    java.lang.Object[] life10_32;
    int life11_34;
    java.lang.String life12_44;
    java.lang.Object life13_51;
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_17: {
    lexical_join_12: {
    life6_3 = (moom.J3.f ^ 112206660884397L);
    life8_5 = moom.J_.c();
    spill808_0 = p0;
    if (!((life8_5 != 0))) {
        lexicalValue808_17_0 = spill808_0;
        break lexical_join_17;
    }
    if (!((spill808_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    life1_20 = ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).trim();
    lexicalValue808_17_0 = life1_20;
    }
    life9_24 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue808_17_0)), ((java.lang.String)(" ")));
    life10_32 = ((java.lang.Object[])(java.lang.reflect.Array.newInstance(((java.lang.Class)(((java.lang.Class)(((java.lang.Object)(p1)).getClass())).getComponentType())), ((int)((life9_24).length)))));
    life11_34 = 0;
    lexical_cycle_30: while (true) {
    lexical_join_58: {
    lexical_join_53: {
    if (!((life11_34 < (life9_24).length))) {
        break lexical_join_60;
    }
    spill808_1 = life9_24;
    if (!((life8_5 != 0))) {
        lexicalValue808_61_0 = spill808_1;
        break lexical_join_61;
    }
    life12_44 = (spill808_1)[life11_34];
    life13_51 = ((moom.J3)(this)).a(((java.lang.String)(life12_44)), ((java.lang.Object[])(p1)), ((moom.J6)(p2)), ((java.lang.String)(p3)));
    if (!((life8_5 != 0))) {
        break lexical_join_58;
    }
    if (!((life13_51 == null))) {
        break lexical_join_53;
    }
    return p4;
    }
    (life10_32)[life11_34] = life13_51;
    life11_34 += 1;
    }
    if (!((life8_5 == 0))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    lexicalValue808_61_0 = life10_32;
    }
    return ((T[])(lexicalValue808_61_0));
}


public java.lang.Enum a(java.lang.String p0, java.lang.Enum[] p1, java.lang.String p2) {
return ((java.lang.Enum)(((moom.J3)(this)).a(((java.lang.String)(p0)), ((java.lang.Object[])(p1)), ((moom.J6)(moom.J3.d)), ((java.lang.String)(p2)))));
}


public java.lang.Enum[] a(java.lang.String p0, java.lang.Enum[] p1, java.lang.String p2, java.lang.Enum[] p3) {
return ((java.lang.Enum[])(((moom.J3)(this)).a(((java.lang.String)(p0)), ((java.lang.Object[])(p1)), ((moom.J6)(moom.J3.d)), ((java.lang.String)(p2)), ((java.lang.Object[])(p3)))));
}


public net.minecraft.item.EnumDyeColor[] a(java.lang.String p0, java.lang.String p1, net.minecraft.item.EnumDyeColor[] p2) {
return ((net.minecraft.item.EnumDyeColor[])(((moom.J3)(this)).a(((java.lang.String)(p0)), ((java.lang.Object[])(net.minecraft.item.EnumDyeColor.values())), ((moom.J6)(moom.J3.e)), ((java.lang.String)(p1)), ((java.lang.Object[])(p2)))));
}


public moom.bO[] a(java.lang.String p0, java.lang.String p1, moom.bO[] p2) {
return ((moom.bO[])(((moom.J3)(this)).a(((java.lang.String)(p0)), ((java.lang.Object[])(moom.bO.values())), ((moom.J6)(moom.J3.d)), ((java.lang.String)(p1)), ((java.lang.Object[])(p2)))));
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
        byte[] spill2596_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2596_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2596_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2596_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2596_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2596_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17383);
    if (((moom.J3.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.J3.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.J3.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/J3", life9_51);
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
        life9_116 = ((java.lang.String)((moom.J3.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.J3.h)[life5_8] = moom.J3.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.J3.h)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.J3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5008_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/J3"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public java.lang.String a__String(java.lang.String p0) {
int forwardValue2256_33_0;
    int spill2256_0;
    int spill2256_1;
    long life2_3;
    java.lang.String life5_5;
    int life6_14;
    int life4_15;
    int life7_36;
    forward_join_41: {
    forward_join_33: {
    forward_join_26: {
    life2_3 = (moom.J3.f ^ 131830444987511L);
    life5_5 = p0;
    spill2256_0 = moom.J_.c();
    life6_14 = ((java.lang.String)(p0)).lastIndexOf(((int)(__sourceIntrinsic_7d31a37a36f2_invokedynamic2256_2(28047, (7856481226993206370L ^ life2_3)))));
    life4_15 = spill2256_0;
    spill2256_1 = life6_14;
    if (!((life4_15 != 0))) {
        forwardValue2256_33_0 = spill2256_1;
        break forward_join_33;
    }
    if (!((spill2256_1 >= 0))) {
        break forward_join_26;
    }
    life5_5 = ((java.lang.String)(p0)).substring(((int)((life6_14 + 1))));
    }
    forwardValue2256_33_0 = ((java.lang.String)(life5_5)).lastIndexOf(((int)(__sourceIntrinsic_7d31a37a36f2_invokedynamic2256_5(18362, (7898775895114231377L ^ life2_3)))));
    }
    life7_36 = forwardValue2256_33_0;
    if (!((life7_36 >= 0))) {
        break forward_join_41;
    }
    life5_5 = ((java.lang.String)(life5_5)).substring(((int)(0)), ((int)(life7_36)));
    }
    return life5_5;
}


public java.lang.Boolean a__Boolean(java.lang.String p0) {
java.lang.String forwardValue2250_15_0;
    int forwardValue2250_35_0;
    java.lang.String spill2250_0;
    boolean spill2250_1;
    moom.J3 spill2250_2;
    long life2_3;
    int life4_5;
    java.lang.String life5_20;
    forward_join_38: {
    forward_join_35: {
    forward_join_28: {
    forward_join_15: {
    forward_join_12: {
    life2_3 = (moom.J3.f ^ 12347433159066L);
    life4_5 = moom.J_.c();
    spill2250_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2250_15_0 = spill2250_0;
        break forward_join_15;
    }
    if (!((spill2250_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue2250_15_0 = ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).trim();
    }
    life5_20 = forwardValue2250_15_0;
    spill2250_1 = ((java.lang.String)(life5_20)).equals(((java.lang.Object)(__sourceIntrinsic_fe1cd37ba361_invokedynamic2250_4(8850, (2720797446875627941L ^ life2_3)))));
    if (!((life4_5 != 0))) {
        forwardValue2250_35_0 = ((spill2250_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill2250_1)) {
        break forward_join_28;
    }
    return java.lang.Boolean.TRUE;
    }
    forwardValue2250_35_0 = ((((java.lang.String)(life5_20)).equals(((java.lang.Object)(__sourceIntrinsic_fe1cd37ba361_invokedynamic2250_8(10903, (1395792070850529672L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2250_35_0 != 0))) {
        break forward_join_38;
    }
    return java.lang.Boolean.FALSE;
    }
    spill2250_2 = this;
    java.lang.String __stackOp2250_13_0 = p0;
    java.lang.String __stackOp2250_13_1 = __sourceIntrinsic_fe1cd37ba361_invokedynamic2250_12(21659, (209854744821872560L ^ life2_3));
    ((moom.J3)(spill2250_2)).b__Void(((java.lang.String)(__sourceIntrinsic_fe1cd37ba361_invokedynamic2250_14(__stackOp2250_13_1, __stackOp2250_13_0))));
    return null;
}


private static int[] a__ArrayInt(int p0, java.lang.String p1) {
int lexicalValue812_44_0;
    java.lang.Object[] lexicalValue812_52_0;
    int[] lexicalValue812_77_0;
    int spill812_0;
    java.lang.String[] spill812_1;
    int spill812_2;
    int[] spill812_3;
    long life2_3;
    java.util.HashSet life5_7;
    java.lang.String[] life6_11;
    java.lang.String[] life7_14;
    int life4_15;
    int life8_18;
    int life9_20;
    java.lang.String life10_29;
    int life11_33;
    java.lang.Integer[] life7_58;
    int[] life8_62;
    int life9_64;
    lexical_join_77: {
    lexical_join_76: {
    lexical_join_52: {
    lexical_join_48: {
    life2_3 = (moom.J3.f ^ 89404830529745L);
    life5_7 = new java.util.HashSet();
    life6_11 = moom.BU.a__ArrayString(((java.lang.String)(p1)), ((java.lang.String)(",")));
    spill812_0 = moom.J_.c();
    life7_14 = life6_11;
    life4_15 = spill812_0;
    life8_18 = (life7_14).length;
    life9_20 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_44: {
    lexical_join_40: {
    if (!((life9_20 < life8_18))) {
        break lexical_join_48;
    }
    spill812_1 = life7_14;
    if (!((life4_15 != 0))) {
        lexicalValue812_52_0 = spill812_1;
        break lexical_join_52;
    }
    life10_29 = (spill812_1)[life9_20];
    life11_33 = moom.J3.a(((int)(p0)), ((java.lang.String)(life10_29)));
    spill812_2 = life11_33;
    if (!((life4_15 != 0))) {
        lexicalValue812_44_0 = spill812_2;
        break lexical_join_44;
    }
    if (!((spill812_2 < 0))) {
        break lexical_join_40;
    }
    return null;
    }
    lexicalValue812_44_0 = ((((java.util.Set)(life5_7)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life11_33))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue812_44_0);
    life9_20 += 1;
    if (!((life4_15 == 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    lexicalValue812_52_0 = ((java.util.Set)(life5_7)).toArray(((java.lang.Object[])(new java.lang.Integer[0])));
    }
    life7_58 = ((java.lang.Integer[])(lexicalValue812_52_0));
    life8_62 = new int[(life7_58).length];
    life9_64 = 0;
    lexical_cycle_60: while (true) {
    if (!((life9_64 < (life8_62).length))) {
        break lexical_join_76;
    }
    spill812_3 = life8_62;
    if (!((life4_15 != 0))) {
        lexicalValue812_77_0 = spill812_3;
        break lexical_join_77;
    }
    (spill812_3)[life9_64] = ((java.lang.Integer)((life7_58)[life9_64])).intValue();
    life9_64 += 1;
    if (!((life4_15 == 0))) { continue lexical_cycle_60; }
    break lexical_cycle_60;
    }
    }
    lexicalValue812_77_0 = life8_62;
    }
    return lexicalValue812_77_0;
}


private static int a(int p0, java.lang.String p1) {
int forwardValue2228_17_0;
    int forwardValue2228_39_0;
    int forwardValue2228_51_0;
    int forwardValue2228_63_0;
    int forwardValue2228_69_0;
    int forwardValue2228_92_0;
    int forwardValue2228_98_0;
    int forwardValue2228_99_0;
    int forwardValue2228_99_1;
    int forwardValue2228_115_0;
    int forwardValue2228_116_0;
    int forwardValue2228_116_1;
    int forwardValue2228_138_0;
    int forwardValue2228_150_0;
    int forwardValue2228_156_0;
    int forwardValue2228_157_0;
    int forwardValue2228_157_1;
    int forwardValue2228_179_0;
    int forwardValue2228_185_0;
    int forwardValue2228_188_0;
    int forwardValue2228_188_1;
    int forwardValue2228_196_0;
    int forwardValue2228_200_0;
    int forwardValue2228_202_0;
    int spill2228_0;
    int spill2228_1;
    boolean spill2228_2;
    int spill2228_3;
    boolean spill2228_4;
    boolean spill2228_5;
    boolean spill2228_6;
    boolean spill2228_7;
    long life2_3;
    int life5_8;
    int life4_9;
    forward_join_202: {
    forward_join_201: {
    forward_join_200: {
    forward_join_196: {
    forward_join_188: {
    forward_join_185: {
    forward_join_184: {
    forward_join_179: {
    forward_join_172: {
    forward_join_157: {
    forward_join_156: {
    forward_join_155: {
    forward_join_150: {
    forward_join_143: {
    forward_join_138: {
    forward_join_131: {
    forward_join_116: {
    forward_join_115: {
    forward_join_114: {
    forward_join_99: {
    forward_join_98: {
    forward_join_97: {
    forward_join_92: {
    forward_join_85: {
    forward_join_69: {
    forward_join_68: {
    forward_join_63: {
    forward_join_56: {
    forward_join_51: {
    forward_join_44: {
    forward_join_39: {
    forward_join_32: {
    forward_join_17: {
    forward_join_16: {
    life2_3 = (moom.J3.f ^ 59366071032929L);
    spill2228_0 = moom.J_.b();
    life5_8 = moom.BU.a(((java.lang.String)(p1)), ((int)(-1)));
    life4_9 = spill2228_0;
    spill2228_1 = life5_8;
    if (!((life4_9 == 0))) {
        forwardValue2228_17_0 = spill2228_1;
        break forward_join_17;
    }
    if (!((spill2228_1 >= 0))) {
        break forward_join_16;
    }
    return life5_8;
    }
    forwardValue2228_17_0 = p0;
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_69_0 = forwardValue2228_17_0;
        break forward_join_69;
    }
    if (!((forwardValue2228_17_0 == 0))) {
        break forward_join_68;
    }
    spill2228_2 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_3(12850, (6069352154458555589L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        forwardValue2228_39_0 = ((spill2228_2) ? 1 : 0);
        break forward_join_39;
    }
    if (!(spill2228_2)) {
        break forward_join_32;
    }
    return 1;
    }
    forwardValue2228_39_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_6(12118, (4552274103330937264L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_51_0 = forwardValue2228_39_0;
        break forward_join_51;
    }
    if (!((forwardValue2228_39_0 != 0))) {
        break forward_join_44;
    }
    return 2;
    }
    forwardValue2228_51_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_9(7666, (3146043074583571261L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_63_0 = forwardValue2228_51_0;
        break forward_join_63;
    }
    if (!((forwardValue2228_51_0 != 0))) {
        break forward_join_56;
    }
    return 3;
    }
    forwardValue2228_63_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_12(18647, (1735903976691629578L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_69_0 = forwardValue2228_63_0;
        break forward_join_69;
    }
    if (!((forwardValue2228_63_0 != 0))) {
        break forward_join_68;
    }
    return 4;
    }
    forwardValue2228_69_0 = p0;
    }
    spill2228_3 = 1;
    if (!((life4_9 == 0))) {
        forwardValue2228_99_0 = forwardValue2228_69_0;
        forwardValue2228_99_1 = spill2228_3;
        break forward_join_99;
    }
    if (!((forwardValue2228_69_0 == spill2228_3))) {
        break forward_join_97;
    }
    spill2228_4 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_15(15236, (3105751576207101260L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        forwardValue2228_92_0 = ((spill2228_4) ? 1 : 0);
        break forward_join_92;
    }
    if (!(spill2228_4)) {
        break forward_join_85;
    }
    return 1;
    }
    forwardValue2228_92_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_18(20534, (3413793569534830274L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_98_0 = forwardValue2228_92_0;
        break forward_join_98;
    }
    if (!((forwardValue2228_92_0 != 0))) {
        break forward_join_97;
    }
    return 2;
    }
    forwardValue2228_98_0 = p0;
    }
    forwardValue2228_99_0 = forwardValue2228_98_0;
    forwardValue2228_99_1 = 2;
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_116_0 = forwardValue2228_99_0;
        forwardValue2228_116_1 = forwardValue2228_99_1;
        break forward_join_116;
    }
    if (!((forwardValue2228_99_0 == forwardValue2228_99_1))) {
        break forward_join_114;
    }
    spill2228_5 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_21(19412, (7849131261917265185L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        forwardValue2228_115_0 = ((spill2228_5) ? 1 : 0);
        break forward_join_115;
    }
    if (!(spill2228_5)) {
        break forward_join_114;
    }
    return 1;
    }
    forwardValue2228_115_0 = p0;
    }
    forwardValue2228_116_0 = forwardValue2228_115_0;
    forwardValue2228_116_1 = 3;
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_157_0 = forwardValue2228_116_0;
        forwardValue2228_157_1 = forwardValue2228_116_1;
        break forward_join_157;
    }
    if (!((forwardValue2228_116_0 == forwardValue2228_116_1))) {
        break forward_join_155;
    }
    spill2228_6 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_24(7855, (8357485581307390050L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        forwardValue2228_138_0 = ((spill2228_6) ? 1 : 0);
        break forward_join_138;
    }
    if (!(spill2228_6)) {
        break forward_join_131;
    }
    return 1;
    }
    forwardValue2228_138_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_27(31717, (2279014004426558774L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_150_0 = forwardValue2228_138_0;
        break forward_join_150;
    }
    if (!((forwardValue2228_138_0 != 0))) {
        break forward_join_143;
    }
    return 2;
    }
    forwardValue2228_150_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_30(8196, (8104492450910148242L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_156_0 = forwardValue2228_150_0;
        break forward_join_156;
    }
    if (!((forwardValue2228_150_0 != 0))) {
        break forward_join_155;
    }
    return 3;
    }
    forwardValue2228_156_0 = p0;
    }
    forwardValue2228_157_0 = forwardValue2228_156_0;
    forwardValue2228_157_1 = 4;
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_188_0 = forwardValue2228_157_0;
        forwardValue2228_188_1 = forwardValue2228_157_1;
        break forward_join_188;
    }
    if (!((forwardValue2228_157_0 == forwardValue2228_157_1))) {
        break forward_join_184;
    }
    spill2228_7 = ((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_33(27089, (9175874454049283860L ^ life2_3)))));
    if (!((life4_9 == 0))) {
        forwardValue2228_179_0 = ((spill2228_7) ? 1 : 0);
        break forward_join_179;
    }
    if (!(spill2228_7)) {
        break forward_join_172;
    }
    return 1;
    }
    forwardValue2228_179_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_36(12249, (2987672163996539189L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_185_0 = forwardValue2228_179_0;
        break forward_join_185;
    }
    if (!((forwardValue2228_179_0 != 0))) {
        break forward_join_184;
    }
    return 2;
    }
    forwardValue2228_185_0 = p0;
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_196_0 = forwardValue2228_185_0;
        break forward_join_196;
    }
    forwardValue2228_188_0 = forwardValue2228_185_0;
    forwardValue2228_188_1 = 5;
    }
    if (!((forwardValue2228_188_0 == forwardValue2228_188_1))) {
        break forward_join_201;
    }
    forwardValue2228_196_0 = ((((java.lang.String)(p1)).equals(((java.lang.Object)(__sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_39(32074, (7449034027809393629L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_9 == 0))) {
        forwardValue2228_200_0 = forwardValue2228_196_0;
        break forward_join_200;
    }
    if (!((forwardValue2228_196_0 != 0))) {
        break forward_join_201;
    }
    forwardValue2228_200_0 = 1;
    }
    forwardValue2228_202_0 = forwardValue2228_200_0;
    break forward_join_202;
    }
    forwardValue2228_202_0 = -1;
    }
    return forwardValue2228_202_0;
}


public net.minecraft.block.state.IBlockState a(java.lang.String p0, net.minecraft.block.state.IBlockState p1) {
moom.J_[] forwardValue2235_17_0;
    moom.J_[] forwardValue2235_25_0;
    int spill2235_0;
    moom.J_[] spill2235_1;
    long life3_3;
    moom.J_[] life6_8;
    int life5_9;
    moom.J_ life7_37;
    int life8_40;
    net.minecraft.block.Block life9_43;
    forward_join_25: {
    forward_join_24: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (moom.J3.f ^ 5859437734677L);
    spill2235_0 = moom.J_.b();
    life6_8 = ((moom.J3)(this)).b__ArrayJ_(((java.lang.String)(p0)));
    life5_9 = spill2235_0;
    spill2235_1 = life6_8;
    if (!((life5_9 == 0))) {
        forwardValue2235_17_0 = spill2235_1;
        break forward_join_17;
    }
    if (!((spill2235_1 == null))) {
        break forward_join_16;
    }
    return p1;
    }
    forwardValue2235_17_0 = life6_8;
    }
    if (!((life5_9 == 0))) {
        forwardValue2235_25_0 = forwardValue2235_17_0;
        break forward_join_25;
    }
    if (!(((forwardValue2235_17_0).length != 1))) {
        break forward_join_24;
    }
    return p1;
    }
    forwardValue2235_25_0 = life6_8;
    }
    life7_37 = (forwardValue2235_25_0)[0];
    life8_40 = ((moom.J_)(life7_37)).a();
    life9_43 = net.minecraft.block.Block.a(((int)(life8_40)));
    return ((net.minecraft.block.Block)(life9_43)).a__fE();
}


public moom.J_[] a__ArrayJ_(java.lang.String p0) {
moom.J_[] lexicalValue814_55_0;
    moom.J_[] spill814_0;
    long life2_3;
    int life4_5;
    java.util.ArrayList life5_15;
    java.lang.String[] life6_19;
    java.lang.String[] life7_21;
    int life8_24;
    int life9_26;
    java.lang.String life10_33;
    moom.J_[] life11_37;
    lexical_join_55: {
    lexical_join_50: {
    lexical_join_10: {
    life2_3 = (moom.J3.f ^ 137350338921029L);
    life4_5 = moom.J_.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return null;
    }
    life5_15 = new java.util.ArrayList();
    life6_19 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(" ")));
    life7_21 = life6_19;
    life8_24 = (life7_21).length;
    life9_26 = 0;
    lexical_cycle_25: while (true) {
    lexical_join_48: {
    lexical_join_47: {
    if (!((life9_26 < life8_24))) {
        break lexical_join_50;
    }
    life10_33 = (life7_21)[life9_26];
    life11_37 = ((moom.J3)(this)).b__ArrayJ_(((java.lang.String)(life10_33)));
    if (!((life4_5 == 0))) {
        break lexical_join_48;
    }
    spill814_0 = life11_37;
    if (!((life4_5 == 0))) {
        lexicalValue814_55_0 = spill814_0;
        break lexical_join_55;
    }
    if (!((spill814_0 != null))) {
        break lexical_join_47;
    }
    ((java.util.List)(life5_15)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(life11_37))))));
    }
    life9_26 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue814_55_0 = ((moom.J_[])(((java.util.List)(life5_15)).toArray(((java.lang.Object[])(new moom.J_[0])))));
    }
    return lexicalValue814_55_0;
}


private static java.lang.IllegalArgumentException a(java.lang.IllegalArgumentException p0) {
return p0;
}


private static java.lang.Object a(java.lang.Comparable p0) {
java.lang.Comparable forwardValue2229_18_0;
    java.lang.Comparable spill2229_0;
    long life1_3;
    int life3_5;
    net.minecraft.util.IStringSerializable life4_16;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (moom.J3.f ^ 77336113366623L);
    life3_5 = moom.J_.c();
    spill2229_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue2229_18_0 = spill2229_0;
        break forward_join_18;
    }
    if (!((((spill2229_0 instanceof net.minecraft.util.IStringSerializable) ? 1 : 0) != 0))) {
        break forward_join_17;
    }
    life4_16 = ((net.minecraft.util.IStringSerializable)(p0));
    return ((net.minecraft.util.IStringSerializable)(life4_16)).a__String();
    }
    forwardValue2229_18_0 = p0;
    }
    return ((java.lang.Object)(forwardValue2229_18_0)).toString();
}


public static java.lang.Comparable a(java.lang.String p0, java.lang.Class p1) {
java.lang.Class forwardValue2232_15_0;
    java.lang.Class forwardValue2232_15_1;
    java.lang.Class forwardValue2232_23_0;
    java.lang.Class forwardValue2232_23_1;
    java.lang.Class forwardValue2232_32_0;
    java.lang.Class forwardValue2232_32_1;
    java.lang.Class forwardValue2232_40_0;
    java.lang.Class forwardValue2232_40_1;
    java.lang.Class forwardValue2232_49_0;
    java.lang.Class forwardValue2232_49_1;
    java.lang.Long forwardValue2232_54_0;
    long forwardValue2232_55_0;
    double forwardValue2232_56_0;
    java.lang.Object forwardValue2232_57_0;
    java.lang.Comparable forwardValue2232_58_0;
    java.lang.Class spill2232_0;
    java.lang.Class spill2232_1;
    long life2_3;
    int life4_5;
    forward_join_58: {
    forward_join_57: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_53: {
    forward_join_49: {
    forward_join_47: {
    forward_join_40: {
    forward_join_38: {
    forward_join_32: {
    forward_join_30: {
    forward_join_23: {
    forward_join_21: {
    forward_join_15: {
    forward_join_13: {
    life2_3 = (moom.J3.f ^ 65060796327028L);
    life4_5 = moom.J_.b();
    spill2232_0 = p1;
    spill2232_1 = java.lang.String.class;
    if (!((life4_5 == 0))) {
        forwardValue2232_15_0 = spill2232_0;
        forwardValue2232_15_1 = spill2232_1;
        break forward_join_15;
    }
    if (!((spill2232_0 == spill2232_1))) {
        break forward_join_13;
    }
    forwardValue2232_58_0 = p0;
    break forward_join_58;
    }
    forwardValue2232_15_0 = p1;
    forwardValue2232_15_1 = java.lang.Boolean.class;
    }
    if (!((life4_5 == 0))) {
        forwardValue2232_23_0 = forwardValue2232_15_0;
        forwardValue2232_23_1 = forwardValue2232_15_1;
        break forward_join_23;
    }
    if (!((forwardValue2232_15_0 == forwardValue2232_15_1))) {
        break forward_join_21;
    }
    forwardValue2232_57_0 = java.lang.Boolean.valueOf(((java.lang.String)(p0)));
    break forward_join_57;
    }
    forwardValue2232_23_0 = p1;
    forwardValue2232_23_1 = java.lang.Float.class;
    }
    if (!((life4_5 == 0))) {
        forwardValue2232_32_0 = forwardValue2232_23_0;
        forwardValue2232_32_1 = forwardValue2232_23_1;
        break forward_join_32;
    }
    if (!((forwardValue2232_23_0 == forwardValue2232_23_1))) {
        break forward_join_30;
    }
    forwardValue2232_56_0 = ((double) java.lang.Float.parseFloat(((java.lang.String)(p0))));
    break forward_join_56;
    }
    forwardValue2232_32_0 = p1;
    forwardValue2232_32_1 = java.lang.Double.class;
    }
    if (!((life4_5 == 0))) {
        forwardValue2232_40_0 = forwardValue2232_32_0;
        forwardValue2232_40_1 = forwardValue2232_32_1;
        break forward_join_40;
    }
    if (!((forwardValue2232_32_0 == forwardValue2232_32_1))) {
        break forward_join_38;
    }
    forwardValue2232_56_0 = java.lang.Double.parseDouble(((java.lang.String)(p0)));
    break forward_join_56;
    }
    forwardValue2232_40_0 = p1;
    forwardValue2232_40_1 = java.lang.Integer.class;
    }
    if (!((life4_5 == 0))) {
        forwardValue2232_49_0 = forwardValue2232_40_0;
        forwardValue2232_49_1 = forwardValue2232_40_1;
        break forward_join_49;
    }
    if (!((forwardValue2232_40_0 == forwardValue2232_40_1))) {
        break forward_join_47;
    }
    forwardValue2232_55_0 = ((long) java.lang.Integer.parseInt(((java.lang.String)(p0))));
    break forward_join_55;
    }
    forwardValue2232_49_0 = p1;
    forwardValue2232_49_1 = java.lang.Long.class;
    }
    if (!((forwardValue2232_49_0 == forwardValue2232_49_1))) {
        break forward_join_53;
    }
    forwardValue2232_54_0 = java.lang.Long.valueOf(((java.lang.String)(p0)));
    break forward_join_54;
    }
    forwardValue2232_54_0 = null;
    }
    forwardValue2232_55_0 = ((java.lang.Long)(forwardValue2232_54_0)).longValue();
    }
    forwardValue2232_56_0 = ((double) forwardValue2232_55_0);
    }
    forwardValue2232_57_0 = java.lang.Double.valueOf(((double)(forwardValue2232_56_0)));
    }
    forwardValue2232_58_0 = ((java.lang.Comparable)(forwardValue2232_57_0));
    }
    return forwardValue2232_58_0;
}


public boolean a(net.minecraft.block.state.IBlockState p0, java.util.Map<net.minecraft.block.properties.IProperty, java.util.List<java.lang.Comparable>> p1) {
int lexicalValue810_37_0;
    int spill810_0;
    boolean spill810_1;
    long life3_3;
    java.util.Iterator life6_8;
    int life5_9;
    net.minecraft.block.properties.IProperty life7_16;
    java.util.List life8_21;
    java.lang.Comparable life9_25;
    lexical_join_40: {
    life3_3 = (moom.J3.f ^ 135918127853763L);
    spill810_0 = moom.J_.c();
    life6_8 = ((java.util.Set)(((java.util.Map)(p1)).keySet())).iterator();
    life5_9 = spill810_0;
    lexical_cycle_10: while (true) {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_30: {
    if (!(((java.util.Iterator)(life6_8)).hasNext())) {
        break lexical_join_40;
    }
    life7_16 = ((net.minecraft.block.properties.IProperty)(((java.util.Iterator)(life6_8)).next()));
    life8_21 = ((java.util.List)(((java.util.Map)(p1)).get(((java.lang.Object)(life7_16)))));
    life9_25 = ((net.minecraft.block.state.IBlockState)(p0)).a(((net.minecraft.block.properties.IProperty)(life7_16)));
    if (!((life9_25 == null))) {
        break lexical_join_30;
    }
    return ((0) != 0);
    }
    spill810_1 = ((java.util.List)(life8_21)).contains(((java.lang.Object)(life9_25)));
    if (!((life5_9 != 0))) {
        lexicalValue810_37_0 = ((spill810_1) ? 1 : 0);
        break lexical_join_37;
    }
    if (!((!spill810_1))) {
        break lexical_join_38;
    }
    lexicalValue810_37_0 = 0;
    }
    return ((lexicalValue810_37_0) != 0);
    }
    if (!((life5_9 == 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return ((1) != 0);
}


public net.minecraft.world.biome.BiomeGenBase[] a__ArrayES(java.lang.String p0) {
java.lang.String lexicalValue811_14_0;
    java.lang.String lexicalValue811_31_0;
    java.lang.String lexicalValue811_31_1;
    java.lang.String spill811_0;
    java.lang.String spill811_1;
    java.lang.String spill811_2;
    moom.J3 spill811_3;
    long life2_3;
    int life4_5;
    java.lang.String life1_19;
    int life5_21;
    java.lang.String[] life6_40;
    java.util.ArrayList life7_44;
    java.lang.String[] life8_46;
    int life9_49;
    int life10_51;
    java.lang.String life11_58;
    net.minecraft.world.biome.BiomeGenBase life12_62;
    java.util.ArrayList life8_107;
    lexical_join_94: {
    lexical_join_80: {
    lexical_join_31: {
    lexical_join_29: {
    lexical_join_14: {
    lexical_join_12: {
    life2_3 = (moom.J3.f ^ 71660155106964L);
    life4_5 = moom.J_.c();
    spill811_0 = p0;
    if (!((life4_5 != 0))) {
        lexicalValue811_14_0 = spill811_0;
        break lexical_join_14;
    }
    if (!((spill811_0 == null))) {
        break lexical_join_12;
    }
    return null;
    }
    lexicalValue811_14_0 = ((java.lang.String)(p0)).trim();
    }
    life1_19 = lexicalValue811_14_0;
    life5_21 = 0;
    spill811_1 = life1_19;
    spill811_2 = "!";
    if (!((life4_5 != 0))) {
        lexicalValue811_31_0 = spill811_1;
        lexicalValue811_31_1 = spill811_2;
        break lexical_join_31;
    }
    if (!(((java.lang.String)(spill811_1)).startsWith(((java.lang.String)(spill811_2))))) {
        break lexical_join_29;
    }
    life5_21 = 1;
    life1_19 = ((java.lang.String)(life1_19)).substring(((int)(1)));
    }
    lexicalValue811_31_0 = life1_19;
    lexicalValue811_31_1 = " ";
    }
    life6_40 = moom.BU.a__ArrayString(((java.lang.String)(lexicalValue811_31_0)), ((java.lang.String)(lexicalValue811_31_1)));
    life7_44 = new java.util.ArrayList();
    life8_46 = life6_40;
    life9_49 = (life8_46).length;
    life10_51 = 0;
    lexical_cycle_44: while (true) {
    lexical_join_77: {
    lexical_join_73: {
    lexical_join_71: {
    if (!((life10_51 < life9_49))) {
        break lexical_join_80;
    }
    life11_58 = (life8_46)[life10_51];
    life12_62 = ((moom.J3)(this)).a__ES(((java.lang.String)(life11_58)));
    if (!((life4_5 != 0))) {
        break lexical_join_94;
    }
    if (!((life4_5 != 0))) {
        break lexical_join_71;
    }
    if (!((life12_62 == null))) {
        break lexical_join_73;
    }
    spill811_3 = this;
    java.lang.String __stackOp811_8_0 = life11_58;
    java.lang.String __stackOp811_8_1 = __sourceIntrinsic_0d308a3b6555_invokedynamic811_7(18805, (4890632312719562048L ^ life2_3));
    ((moom.J3)(spill811_3)).b__Void(((java.lang.String)(__sourceIntrinsic_0d308a3b6555_invokedynamic811_9(__stackOp811_8_1, __stackOp811_8_0))));
    }
    if (!((life4_5 == 0))) {
        break lexical_join_77;
    }
    }
    ((java.util.List)(life7_44)).add(((java.lang.Object)(life12_62)));
    }
    life10_51 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_44; }
    break lexical_cycle_44;
    }
    }
    if (!((life5_21 != 0))) {
        break lexical_join_94;
    }
    life8_107 = new java.util.ArrayList(java.util.Arrays.asList(((java.lang.Object[])(net.minecraft.world.biome.BiomeGenBase.a__ArrayES()))));
    ((java.util.List)(life8_107)).removeAll(((java.util.Collection)(life7_44)));
    life7_44 = life8_107;
    }
    return ((net.minecraft.world.biome.BiomeGenBase[])(((java.util.List)(life7_44)).toArray(((java.lang.Object[])(new net.minecraft.world.biome.BiomeGenBase[0])))));
}


public net.minecraft.world.biome.BiomeGenBase a__ES(java.lang.String p0) {
int spill817_0;
    long life2_3;
    java.lang.String life1_7;
    int life4_8;
    net.minecraft.world.biome.BiomeGenBase[] life5_22;
    net.minecraft.world.biome.BiomeGenBase[] life6_24;
    int life7_27;
    int life8_29;
    net.minecraft.world.biome.BiomeGenBase life9_36;
    java.lang.String life10_50;
    lexical_join_57: {
    lexical_join_19: {
    life2_3 = (moom.J3.f ^ 134566654037483L);
    spill817_0 = moom.J_.c();
    life1_7 = ((java.lang.String)(p0)).toLowerCase();
    life4_8 = spill817_0;
    if (!(((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_87baee49246f_invokedynamic817_3(22924, (4925440014975500015L ^ life2_3))))))) {
        break lexical_join_19;
    }
    return net.minecraft.world.biome.BiomeGenBase.z;
    }
    life5_22 = net.minecraft.world.biome.BiomeGenBase.a__ArrayES();
    life6_24 = life5_22;
    life7_27 = (life6_24).length;
    life8_29 = 0;
    lexical_cycle_28: while (true) {
    lexical_join_55: {
    lexical_join_54: {
    if (!((life8_29 < life7_27))) {
        break lexical_join_57;
    }
    life9_36 = (life6_24)[life8_29];
    if (!((life4_8 != 0))) {
        break lexical_join_55;
    }
    if (!((life9_36 != null))) {
        break lexical_join_54;
    }
    life10_50 = ((java.lang.String)(((java.lang.String)(((net.minecraft.world.biome.BiomeGenBase)(life9_36)).aj)).replace(((java.lang.CharSequence)(" ")), ((java.lang.CharSequence)(""))))).toLowerCase();
    if (!((life4_8 != 0))) {
        break lexical_join_55;
    }
    if (!(((java.lang.String)(life10_50)).equals(((java.lang.Object)(life1_7))))) {
        break lexical_join_54;
    }
    return life9_36;
    }
    life8_29 += 1;
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return null;
}


public int a(java.lang.String p0, int p1) {
java.lang.String forwardValue2231_16_0;
    int forwardValue2231_36_0;
    java.lang.String spill2231_0;
    int spill2231_1;
    moom.J3 spill2231_2;
    long life3_3;
    int life5_5;
    int life6_23;
    forward_join_36: {
    forward_join_35: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (moom.J3.f ^ 31948802404818L);
    life5_5 = moom.J_.b();
    spill2231_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2231_16_0 = spill2231_0;
        break forward_join_16;
    }
    if (!((spill2231_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    p0 = ((java.lang.String)(p0)).trim();
    forwardValue2231_16_0 = p0;
    }
    life6_23 = moom.BU.a(((java.lang.String)(forwardValue2231_16_0)), ((int)(-1)));
    spill2231_1 = life6_23;
    if (!((life5_5 == 0))) {
        forwardValue2231_36_0 = spill2231_1;
        break forward_join_36;
    }
    if (!((spill2231_1 < 0))) {
        break forward_join_35;
    }
    spill2231_2 = this;
    java.lang.String __stackOp2231_5_0 = p0;
    java.lang.String __stackOp2231_5_1 = __sourceIntrinsic_5e130d9b8037_invokedynamic2231_4(29804, (3610005384052223764L ^ life3_3));
    ((moom.J3)(spill2231_2)).b__Void(((java.lang.String)(__sourceIntrinsic_5e130d9b8037_invokedynamic2231_6(__stackOp2231_5_1, __stackOp2231_5_0))));
    return p1;
    }
    forwardValue2231_36_0 = life6_23;
    }
    return forwardValue2231_36_0;
}


public net.minecraft.block.Block[] a__Arraych(java.lang.String p0, java.lang.String p1) {
moom.J3 lexicalValue816_14_0;
    java.lang.String lexicalValue816_14_1;
    int[] lexicalValue816_23_0;
    moom.J3 spill816_0;
    java.lang.String spill816_1;
    int[] spill816_2;
    moom.J3 spill816_3;
    moom.J3 spill816_4;
    net.minecraft.block.Block[] spill816_5;
    long life3_3;
    int life5_5;
    int[] life6_21;
    net.minecraft.block.Block[] life7_36;
    int life8_38;
    int life9_46;
    net.minecraft.block.Block life10_49;
    java.lang.String life6_83;
    net.minecraft.block.Block life7_86;
    lexical_join_87: {
    lexical_join_85: {
    lexical_join_64: {
    lexical_join_62: {
    lexical_join_23: {
    lexical_join_22: {
    lexical_join_14: {
    life3_3 = (moom.J3.f ^ 44437148050787L);
    life5_5 = moom.J_.c();
    spill816_0 = this;
    spill816_1 = p1;
    if (!((life5_5 != 0))) {
        lexicalValue816_14_0 = spill816_0;
        lexicalValue816_14_1 = spill816_1;
        break lexical_join_14;
    }
    if (!(((moom.J3)(spill816_0)).a__Boolean_2(((java.lang.String)(spill816_1))))) {
        break lexical_join_64;
    }
    lexicalValue816_14_0 = this;
    lexicalValue816_14_1 = p1;
    }
    life6_21 = ((moom.J3)(lexicalValue816_14_0)).a__ArrayInt(((java.lang.String)(lexicalValue816_14_1)));
    spill816_2 = life6_21;
    if (!((life5_5 != 0))) {
        lexicalValue816_23_0 = spill816_2;
        break lexical_join_23;
    }
    if (!((spill816_2 == null))) {
        break lexical_join_22;
    }
    return null;
    }
    lexicalValue816_23_0 = life6_21;
    }
    life7_36 = new net.minecraft.block.Block[(lexicalValue816_23_0).length];
    life8_38 = 0;
    lexical_cycle_28: while (true) {
    lexical_join_60: {
    lexical_join_55: {
    if (!((life8_38 < (life6_21).length))) {
        break lexical_join_62;
    }
    life9_46 = (life6_21)[life8_38];
    life10_49 = net.minecraft.block.Block.a(((int)(life9_46)));
    if (!((life5_5 != 0))) {
        break lexical_join_60;
    }
    if (!((life10_49 == null))) {
        break lexical_join_55;
    }
    spill816_3 = this;
    int __stackOp816_6_0 = life9_46;
    java.lang.String __stackOp816_6_1 = __sourceIntrinsic_e35f4e277436_invokedynamic816_5(9847, (180026833790888351L ^ life3_3));
    ((moom.J3)(spill816_3)).b__Void(((java.lang.String)(__sourceIntrinsic_e35f4e277436_invokedynamic816_7(__stackOp816_6_1, __stackOp816_6_0))));
    return null;
    }
    (life7_36)[life8_38] = life10_49;
    life8_38 += 1;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    return life7_36;
    }
    life6_83 = __sourceIntrinsic_e35f4e277436_invokedynamic816_9(p0, p1);
    life7_86 = net.minecraft.block.Block.a(((java.lang.String)(life6_83)));
    if (!((life5_5 != 0))) {
        break lexical_join_85;
    }
    if (!((life7_86 == null))) {
        break lexical_join_87;
    }
    spill816_4 = this;
    java.lang.String __stackOp816_12_0 = life6_83;
    java.lang.String __stackOp816_12_1 = __sourceIntrinsic_e35f4e277436_invokedynamic816_11(29343, (4396081647421242736L ^ life3_3));
    ((moom.J3)(spill816_4)).b__Void(((java.lang.String)(__sourceIntrinsic_e35f4e277436_invokedynamic816_13(__stackOp816_12_1, __stackOp816_12_0))));
    }
    return null;
    }
    net.minecraft.block.Block[] __stackOp816_15_0 = new net.minecraft.block.Block[1];
    spill816_5 = __stackOp816_15_0;
    (__stackOp816_15_0)[0] = life7_86;
    return spill816_5;
}


public int[] a(net.minecraft.block.Block p0, java.lang.String[] p1) { return __sourceHandlerCall_916ff409680442ddd7d4(this, p0, p1); }


private net.minecraft.block.state.IBlockState a(net.minecraft.block.Block p0, int p1) { return __sourceHandlerCall_f64e1378c75bb63d92dc(this, p0, p1); }


public static java.lang.Comparable a(net.minecraft.block.properties.IProperty p0, java.lang.String p1) {
java.lang.Comparable forwardValue2241_25_0;
    int spill2241_0;
    java.lang.Comparable spill2241_1;
    long life2_3;
    java.lang.Class life5_7;
    int life4_8;
    java.lang.Comparable life6_12;
    java.util.Collection life7_22;
    forward_join_25: {
    forward_join_24: {
    life2_3 = (moom.J3.f ^ 95579359478032L);
    spill2241_0 = moom.J_.b();
    life5_7 = ((net.minecraft.block.properties.IProperty)(p0)).a();
    life4_8 = spill2241_0;
    life6_12 = moom.J3.a(((java.lang.String)(p1)), ((java.lang.Class)(life5_7)));
    spill2241_1 = life6_12;
    if (!((life4_8 == 0))) {
        forwardValue2241_25_0 = spill2241_1;
        break forward_join_25;
    }
    if (!((spill2241_1 == null))) {
        break forward_join_24;
    }
    life7_22 = ((net.minecraft.block.properties.IProperty)(p0)).a__Collection();
    life6_12 = moom.J3.a(((java.lang.String)(p1)), ((java.util.Collection)(life7_22)));
    }
    forwardValue2241_25_0 = life6_12;
    }
    return forwardValue2241_25_0;
}


public static java.lang.Comparable a(java.lang.String p0, java.util.Collection<java.lang.Comparable> p1) {
java.lang.Comparable lexicalValue805_24_0;
    int spill805_0;
    java.lang.Comparable spill805_1;
    long life2_3;
    java.util.Iterator life5_7;
    int life4_8;
    java.lang.Comparable life6_15;
    lexical_join_27: {
    life2_3 = (moom.J3.f ^ 26676124068869L);
    spill805_0 = moom.J_.c();
    life5_7 = ((java.util.Collection)(p1)).iterator();
    life4_8 = spill805_0;
    lexical_cycle_9: while (true) {
    lexical_join_25: {
    lexical_join_24: {
    if (!(((java.util.Iterator)(life5_7)).hasNext())) {
        break lexical_join_27;
    }
    life6_15 = ((java.lang.Comparable)(((java.util.Iterator)(life5_7)).next()));
    spill805_1 = life6_15;
    if (!((life4_8 != 0))) {
        lexicalValue805_24_0 = spill805_1;
        break lexical_join_24;
    }
    if (!(((java.lang.Object)(moom.J3.a(((java.lang.Comparable)(spill805_1))))).equals(((java.lang.Object)(p0))))) {
        break lexical_join_25;
    }
    lexicalValue805_24_0 = life6_15;
    }
    return lexicalValue805_24_0;
    }
    if (!((life4_8 == 0))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return null;
}


public moom.Ke a__Ke(java.lang.String p0) {
long life2_3;
    int life4_5;
    moom.Ke life5_15;
    java.lang.String[] life6_23;
    java.lang.String[] life7_25;
    int life8_28;
    int life9_30;
    java.lang.String life10_37;
    moom.Kd life11_41;
    lexical_join_52: {
    lexical_join_10: {
    life2_3 = (moom.J3.f ^ 134989156271574L);
    life4_5 = moom.J_.b();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return null;
    }
    life5_15 = new moom.Ke();
    life6_23 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(__sourceIntrinsic_1be7da3e4ca8_invokedynamic818_2(9798, (2703867851311155504L ^ life2_3)))));
    life7_25 = life6_23;
    life8_28 = (life7_25).length;
    life9_30 = 0;
    lexical_cycle_29: while (true) {
    lexical_join_50: {
    lexical_join_46: {
    if (!((life9_30 < life8_28))) {
        break lexical_join_52;
    }
    life10_37 = (life7_25)[life9_30];
    life11_41 = ((moom.J3)(this)).a__Kd(((java.lang.String)(life10_37)));
    if (!((life4_5 == 0))) {
        break lexical_join_50;
    }
    if (!((life11_41 == null))) {
        break lexical_join_46;
    }
    return null;
    }
    ((moom.Ke)(life5_15)).a(((moom.Kd)(life11_41)));
    life9_30 += 1;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return life5_15;
}


private moom.Kd a__Kd(java.lang.String p0) {
java.lang.String forwardValue2253_13_0;
    int forwardValue2253_49_0;
    int forwardValue2253_83_0;
    java.lang.String spill2253_0;
    int spill2253_1;
    int spill2253_2;
    moom.J3 spill2253_3;
    moom.J3 spill2253_4;
    moom.J3 spill2253_5;
    long life2_3;
    int life4_5;
    java.lang.String[] life5_33;
    int life6_62;
    int life7_68;
    int life5_104;
    forward_join_100: {
    forward_join_98: {
    forward_join_83: {
    forward_join_80: {
    forward_join_78: {
    forward_join_68: {
    forward_join_49: {
    forward_join_44: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.J3.f ^ 89402772730531L);
    life4_5 = moom.J_.c();
    spill2253_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2253_13_0 = spill2253_0;
        break forward_join_13;
    }
    if (!((spill2253_0 == null))) {
        break forward_join_12;
    }
    return null;
    }
    forwardValue2253_13_0 = p0;
    }
    spill2253_1 = ((java.lang.String)(forwardValue2253_13_0)).indexOf(((int)(__sourceIntrinsic_52c0107edb4f_invokedynamic2253_2(12876, (711268543380585842L ^ life2_3)))));
    if (!((life4_5 != 0))) {
        forwardValue2253_83_0 = spill2253_1;
        break forward_join_83;
    }
    if (!((spill2253_1 >= 0))) {
        break forward_join_80;
    }
    life5_33 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)("-")));
    spill2253_2 = (life5_33).length;
    if (!((life4_5 != 0))) {
        forwardValue2253_49_0 = spill2253_2;
        break forward_join_49;
    }
    if (!((spill2253_2 != 2))) {
        break forward_join_44;
    }
    spill2253_3 = this;
    java.lang.String __stackOp2253_6_0 = p0;
    java.lang.String __stackOp2253_6_1 = __sourceIntrinsic_52c0107edb4f_invokedynamic2253_5(6156, (3336626125360414727L ^ life2_3));
    ((moom.J3)(spill2253_3)).b__Void(((java.lang.String)(__sourceIntrinsic_52c0107edb4f_invokedynamic2253_7(__stackOp2253_6_1, __stackOp2253_6_0))));
    return null;
    }
    forwardValue2253_49_0 = moom.BU.a(((java.lang.String)((life5_33)[0])), ((int)(-1)));
    }
    life6_62 = forwardValue2253_49_0;
    life7_68 = moom.BU.a(((java.lang.String)((life5_33)[1])), ((int)(-1)));
    if (!((life4_5 != 0))) {
        break forward_join_78;
    }
    if (!((life6_62 >= 0))) {
        break forward_join_68;
    }
    if (!((life7_68 >= 0))) {
        break forward_join_68;
    }
    return new moom.Kd(life6_62, life7_68);
    }
    spill2253_4 = this;
    java.lang.String __stackOp2253_12_0 = p0;
    java.lang.String __stackOp2253_12_1 = __sourceIntrinsic_52c0107edb4f_invokedynamic2253_11(21822, (2753162503193955587L ^ life2_3));
    ((moom.J3)(spill2253_4)).b__Void(((java.lang.String)(__sourceIntrinsic_52c0107edb4f_invokedynamic2253_13(__stackOp2253_12_1, __stackOp2253_12_0))));
    }
    return null;
    }
    forwardValue2253_83_0 = moom.BU.a(((java.lang.String)(p0)), ((int)(-1)));
    }
    life5_104 = forwardValue2253_83_0;
    if (!((life4_5 != 0))) {
        break forward_join_98;
    }
    if (!((life5_104 < 0))) {
        break forward_join_100;
    }
    spill2253_5 = this;
    java.lang.String __stackOp2253_17_0 = p0;
    java.lang.String __stackOp2253_17_1 = __sourceIntrinsic_52c0107edb4f_invokedynamic2253_16(12552, (8242189576732666133L ^ life2_3));
    ((moom.J3)(spill2253_5)).b__Void(((java.lang.String)(__sourceIntrinsic_52c0107edb4f_invokedynamic2253_18(__stackOp2253_17_1, __stackOp2253_17_0))));
    }
    return null;
    }
    return new moom.Kd(life5_104, life5_104);
}


public boolean a(java.lang.String p0, boolean p1) {
java.lang.String forwardValue2237_15_0;
    int forwardValue2237_35_0;
    int forwardValue2237_51_0;
    java.lang.String spill2237_0;
    boolean spill2237_1;
    moom.J3 spill2237_2;
    long life3_3;
    int life5_5;
    java.lang.String life6_20;
    forward_join_51: {
    forward_join_40: {
    forward_join_35: {
    forward_join_28: {
    forward_join_15: {
    forward_join_12: {
    life3_3 = (moom.J3.f ^ 136499000728281L);
    life5_5 = moom.J_.b();
    spill2237_0 = p0;
    if (!((life5_5 == 0))) {
        forwardValue2237_15_0 = spill2237_0;
        break forward_join_15;
    }
    if (!((spill2237_0 == null))) {
        break forward_join_12;
    }
    return p1;
    }
    forwardValue2237_15_0 = ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).trim();
    }
    life6_20 = forwardValue2237_15_0;
    spill2237_1 = ((java.lang.String)(life6_20)).equals(((java.lang.Object)(__sourceIntrinsic_4b80208140b2_invokedynamic2237_4(3939, (4597757551970500369L ^ life3_3)))));
    if (!((life5_5 == 0))) {
        forwardValue2237_35_0 = ((spill2237_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!(spill2237_1)) {
        break forward_join_28;
    }
    return ((1) != 0);
    }
    forwardValue2237_35_0 = ((((java.lang.String)(life6_20)).equals(((java.lang.Object)(__sourceIntrinsic_4b80208140b2_invokedynamic2237_8(13772, (976902647599564207L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 == 0))) {
        forwardValue2237_51_0 = forwardValue2237_35_0;
        break forward_join_51;
    }
    if (!((forwardValue2237_35_0 != 0))) {
        break forward_join_40;
    }
    return ((0) != 0);
    }
    spill2237_2 = this;
    java.lang.String __stackOp2237_13_0 = p0;
    java.lang.String __stackOp2237_13_1 = __sourceIntrinsic_4b80208140b2_invokedynamic2237_12(4466, (2317158008359231785L ^ life3_3));
    ((moom.J3)(spill2237_2)).b__Void(((java.lang.String)(__sourceIntrinsic_4b80208140b2_invokedynamic2237_14(__stackOp2237_13_1, __stackOp2237_13_0))));
    forwardValue2237_51_0 = ((p1) ? 1 : 0);
    }
    return ((forwardValue2237_51_0) != 0);
}


public boolean a(java.lang.String[] p0) {
java.lang.String[] forwardValue2243_15_0;
    int forwardValue2243_27_0;
    int forwardValue2243_33_0;
    int forwardValue2243_37_0;
    int forwardValue2243_39_0;
    java.lang.String[] spill2243_0;
    int spill2243_1;
    long life2_3;
    int life4_5;
    java.lang.String life5_22;
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    forward_join_33: {
    forward_join_27: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (moom.J3.f ^ 114765685609662L);
    life4_5 = moom.J_.c();
    spill2243_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2243_15_0 = spill2243_0;
        break forward_join_15;
    }
    if (!(((spill2243_0).length < 2))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue2243_15_0 = p0;
    }
    life5_22 = (forwardValue2243_15_0)[1];
    spill2243_1 = ((java.lang.String)(life5_22)).length();
    if (!((life4_5 != 0))) {
        forwardValue2243_27_0 = spill2243_1;
        break forward_join_27;
    }
    if (!((spill2243_1 >= 1))) {
        break forward_join_38;
    }
    forwardValue2243_27_0 = ((((moom.J3)(this)).a__Boolean_2(((java.lang.String)(life5_22)))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue2243_33_0 = forwardValue2243_27_0;
        break forward_join_33;
    }
    if (!((forwardValue2243_27_0 == 0))) {
        break forward_join_38;
    }
    forwardValue2243_33_0 = ((((java.lang.String)(life5_22)).contains(((java.lang.CharSequence)("=")))) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue2243_37_0 = forwardValue2243_33_0;
        break forward_join_37;
    }
    if (!((forwardValue2243_33_0 == 0))) {
        break forward_join_38;
    }
    forwardValue2243_37_0 = 1;
    }
    forwardValue2243_39_0 = forwardValue2243_37_0;
    break forward_join_39;
    }
    forwardValue2243_39_0 = 0;
    }
    return ((forwardValue2243_39_0) != 0);
}


public net.minecraft.util.EnumWorldBlockLayer a(java.lang.String p0, net.minecraft.util.EnumWorldBlockLayer p1) {
java.lang.String lexicalValue806_13_0;
    net.minecraft.util.EnumWorldBlockLayer lexicalValue806_46_0;
    java.lang.String spill806_0;
    net.minecraft.util.EnumWorldBlockLayer spill806_1;
    long life3_3;
    int life5_5;
    java.lang.String life1_19;
    net.minecraft.util.EnumWorldBlockLayer[] life6_21;
    net.minecraft.util.EnumWorldBlockLayer[] life7_23;
    int life8_26;
    int life9_28;
    net.minecraft.util.EnumWorldBlockLayer life10_37;
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_13: {
    life3_3 = (moom.J3.f ^ 33411419575765L);
    life5_5 = moom.J_.b();
    spill806_0 = p0;
    if (!((life5_5 == 0))) {
        lexicalValue806_13_0 = spill806_0;
        break lexical_join_13;
    }
    if (!((spill806_0 != null))) {
        break lexical_join_45;
    }
    lexicalValue806_13_0 = ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).trim();
    }
    life1_19 = lexicalValue806_13_0;
    life6_21 = net.minecraft.util.EnumWorldBlockLayer.values();
    life7_23 = life6_21;
    life8_26 = (life7_23).length;
    life9_28 = 0;
    lexical_cycle_23: while (true) {
    lexical_join_43: {
    lexical_join_42: {
    if (!((life9_28 < life8_26))) {
        break lexical_join_45;
    }
    spill806_1 = (life7_23)[life9_28];
    if (!((life5_5 == 0))) {
        lexicalValue806_46_0 = spill806_1;
        break lexical_join_46;
    }
    life10_37 = spill806_1;
    if (!((life5_5 == 0))) {
        break lexical_join_43;
    }
    if (!(((java.lang.String)(life1_19)).equals(((java.lang.Object)(((java.lang.String)(((net.minecraft.util.EnumWorldBlockLayer)(life10_37)).name())).toLowerCase()))))) {
        break lexical_join_42;
    }
    return life10_37;
    }
    life9_28 += 1;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue806_46_0 = p1;
    }
    return lexicalValue806_46_0;
}


public <T> T a(java.lang.String p0, T[] p1, moom.J6 p2, java.lang.String p3) {
java.lang.String lexicalValue807_13_0;
    java.lang.Object lexicalValue807_46_0;
    java.lang.String spill807_0;
    java.lang.String spill807_1;
    moom.J3 spill807_2;
    java.lang.String spill807_3;
    java.lang.String spill807_4;
    java.lang.String spill807_5;
    long life5_3;
    int life7_5;
    java.lang.String life8_19;
    java.lang.Object[] life9_21;
    int life10_24;
    int life11_26;
    java.lang.Object life12_33;
    java.lang.String life13_37;
    lexical_join_68: {
    lexical_join_50: {
    lexical_join_13: {
    life5_3 = (moom.J3.f ^ 84325215922805L);
    life7_5 = moom.J_.b();
    spill807_0 = p0;
    if (!((life7_5 == 0))) {
        lexicalValue807_13_0 = spill807_0;
        break lexical_join_13;
    }
    if (!((spill807_0 != null))) {
        break lexical_join_68;
    }
    lexicalValue807_13_0 = ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).trim();
    }
    life8_19 = lexicalValue807_13_0;
    life9_21 = p1;
    life10_24 = (life9_21).length;
    life11_26 = 0;
    lexical_cycle_21: while (true) {
    lexical_join_48: {
    lexical_join_47: {
    lexical_join_46: {
    if (!((life11_26 < life10_24))) {
        break lexical_join_50;
    }
    life12_33 = (life9_21)[life11_26];
    life13_37 = ((moom.J6)(p2)).a(((java.lang.Object)(life12_33)));
    if (!((life7_5 == 0))) {
        break lexical_join_68;
    }
    if (!((life7_5 == 0))) {
        break lexical_join_48;
    }
    if (!((life13_37 != null))) {
        break lexical_join_47;
    }
    spill807_1 = ((java.lang.String)(life13_37)).toLowerCase();
    if (!((life7_5 == 0))) {
        lexicalValue807_46_0 = spill807_1;
        break lexical_join_46;
    }
    if (!(((java.lang.String)(spill807_1)).equals(((java.lang.Object)(life8_19))))) {
        break lexical_join_47;
    }
    lexicalValue807_46_0 = life12_33;
    }
    return ((T)(lexicalValue807_46_0));
    }
    life11_26 += 1;
    }
    if (!((life7_5 != 0))) { continue lexical_cycle_21; }
    break lexical_cycle_21;
    }
    }
    spill807_2 = this;
    java.lang.String __stackOp807_8_0 = p3;
    java.lang.String __stackOp807_8_1 = p0;
    java.lang.String __stackOp807_8_2 = __sourceIntrinsic_579d86ec496e_invokedynamic807_7(27482, (6025711099137780616L ^ life5_3));
    spill807_3 = __stackOp807_8_2;
    spill807_4 = __stackOp807_8_0;
    spill807_5 = __stackOp807_8_1;
    recovery.source.CarrierOps.discard(__stackOp807_8_2);
    java.lang.String __stackOp807_11_0 = spill807_5;
    java.lang.String __stackOp807_11_1 = __sourceIntrinsic_579d86ec496e_invokedynamic807_10(29566, (3704259209938760621L ^ life5_3));
    ((moom.J3)(spill807_2)).b__Void(((java.lang.String)(__sourceIntrinsic_579d86ec496e_invokedynamic807_12(spill807_3, spill807_4, __stackOp807_11_1, __stackOp807_11_0))));
    }
    return null;
}


public int[] a__ArrayInt(java.lang.String p0) {
int lexicalValue813_79_0;
    int lexicalValue813_91_0;
    int lexicalValue813_95_0;
    int lexicalValue813_100_0;
    int lexicalValue813_139_0;
    int lexicalValue813_168_0;
    int lexicalValue813_174_0;
    int[] lexicalValue813_196_0;
    boolean spill813_0;
    int spill813_1;
    moom.J3 spill813_2;
    java.lang.String spill813_3;
    java.lang.String spill813_4;
    java.lang.String spill813_5;
    int spill813_6;
    moom.J3 spill813_7;
    java.lang.String spill813_8;
    java.lang.String spill813_9;
    java.lang.String spill813_10;
    int spill813_11;
    moom.J3 spill813_12;
    java.lang.String spill813_13;
    java.lang.String spill813_14;
    java.lang.String spill813_15;
    int[] spill813_16;
    long life2_3;
    int life4_5;
    java.util.ArrayList life5_15;
    java.lang.String[] life6_23;
    java.lang.String[] life7_25;
    int life8_28;
    int life9_30;
    java.lang.String life10_37;
    java.lang.String[] life11_55;
    int life12_96;
    int life13_102;
    int life14_129;
    int life11_177;
    int[] life7_222;
    int life8_224;
    lexical_join_196: {
    lexical_join_195: {
    lexical_join_174: {
    lexical_join_172: {
    lexical_join_10: {
    life2_3 = (moom.J3.f ^ 90875954807389L);
    life4_5 = moom.J_.c();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return null;
    }
    life5_15 = new java.util.ArrayList();
    life6_23 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(__sourceIntrinsic_0c88096d2255_invokedynamic813_2(4669, (2189940142250048211L ^ life2_3)))));
    life7_25 = life6_23;
    life8_28 = (life7_25).length;
    life9_30 = 0;
    lexical_cycle_29: while (true) {
    lexical_join_169: {
    lexical_join_168: {
    lexical_join_164: {
    lexical_join_139: {
    lexical_join_136: {
    lexical_join_134: {
    lexical_join_116: {
    lexical_join_114: {
    lexical_join_100: {
    lexical_join_95: {
    lexical_join_91: {
    lexical_join_79: {
    lexical_join_74: {
    if (!((life9_30 < life8_28))) {
        break lexical_join_172;
    }
    life10_37 = (life7_25)[life9_30];
    spill813_0 = ((java.lang.String)(life10_37)).contains(((java.lang.CharSequence)("-")));
    if (!((life4_5 != 0))) {
        lexicalValue813_174_0 = ((spill813_0) ? 1 : 0);
        break lexical_join_174;
    }
    if (!((life4_5 != 0))) {
        lexicalValue813_139_0 = ((spill813_0) ? 1 : 0);
        break lexical_join_139;
    }
    if (!(spill813_0)) {
        break lexical_join_136;
    }
    life11_55 = moom.BU.a__ArrayString(((java.lang.String)(life10_37)), ((java.lang.String)("-")));
    spill813_1 = (life11_55).length;
    if (!((life4_5 != 0))) {
        lexicalValue813_79_0 = spill813_1;
        break lexical_join_79;
    }
    if (!((spill813_1 != 2))) {
        break lexical_join_74;
    }
    spill813_2 = this;
    java.lang.String __stackOp813_9_0 = life10_37;
    java.lang.String __stackOp813_9_1 = p0;
    java.lang.String __stackOp813_9_2 = __sourceIntrinsic_0c88096d2255_invokedynamic813_8(5894, (2388445397750628320L ^ life2_3));
    spill813_3 = __stackOp813_9_2;
    spill813_4 = __stackOp813_9_0;
    spill813_5 = __stackOp813_9_1;
    recovery.source.CarrierOps.discard(__stackOp813_9_2);
    java.lang.String __stackOp813_12_0 = spill813_5;
    java.lang.String __stackOp813_12_1 = __sourceIntrinsic_0c88096d2255_invokedynamic813_11(28874, (1994808890899650584L ^ life2_3));
    ((moom.J3)(spill813_2)).b__Void(((java.lang.String)(__sourceIntrinsic_0c88096d2255_invokedynamic813_13(spill813_3, spill813_4, __stackOp813_12_1, __stackOp813_12_0))));
    if (!((life4_5 == 0))) {
        break lexical_join_134;
    }
    }
    lexicalValue813_79_0 = moom.BU.a(((java.lang.String)((life11_55)[0])), ((int)(-1)));
    }
    life12_96 = lexicalValue813_79_0;
    life13_102 = moom.BU.a(((java.lang.String)((life11_55)[1])), ((int)(-1)));
    spill813_6 = life12_96;
    if (!((life4_5 != 0))) {
        lexicalValue813_91_0 = spill813_6;
        break lexical_join_91;
    }
    if (!((spill813_6 >= 0))) {
        break lexical_join_116;
    }
    lexicalValue813_91_0 = life13_102;
    }
    if (!((life4_5 != 0))) {
        lexicalValue813_95_0 = lexicalValue813_91_0;
        break lexical_join_95;
    }
    if (!((lexicalValue813_91_0 >= 0))) {
        break lexical_join_116;
    }
    lexicalValue813_95_0 = life12_96;
    }
    if (!((life4_5 != 0))) {
        lexicalValue813_100_0 = lexicalValue813_95_0;
        break lexical_join_100;
    }
    if (!((lexicalValue813_95_0 <= life13_102))) {
        break lexical_join_116;
    }
    lexicalValue813_100_0 = life12_96;
    }
    life14_129 = lexicalValue813_100_0;
    lexical_cycle_101: while (true) {
    if (!((life14_129 <= life13_102))) {
        break lexical_join_114;
    }
    ((java.util.List)(life5_15)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life14_129))))));
    life14_129 += 1;
    if (!((life4_5 != 0))) {
        break lexical_join_134;
    }
    if (!((life4_5 == 0))) { continue lexical_cycle_101; }
    break lexical_cycle_101;
    }
    }
    if (!((life4_5 == 0))) {
        break lexical_join_134;
    }
    }
    spill813_7 = this;
    java.lang.String __stackOp813_20_0 = life10_37;
    java.lang.String __stackOp813_20_1 = p0;
    java.lang.String __stackOp813_20_2 = __sourceIntrinsic_0c88096d2255_invokedynamic813_19(21409, (4220929520805477185L ^ life2_3));
    spill813_8 = __stackOp813_20_2;
    spill813_9 = __stackOp813_20_0;
    spill813_10 = __stackOp813_20_1;
    recovery.source.CarrierOps.discard(__stackOp813_20_2);
    java.lang.String __stackOp813_23_0 = spill813_10;
    java.lang.String __stackOp813_23_1 = __sourceIntrinsic_0c88096d2255_invokedynamic813_22(11915, (3011342539699750465L ^ life2_3));
    ((moom.J3)(spill813_7)).b__Void(((java.lang.String)(__sourceIntrinsic_0c88096d2255_invokedynamic813_24(spill813_8, spill813_9, __stackOp813_23_1, __stackOp813_23_0))));
    }
    if (!((life4_5 == 0))) {
        break lexical_join_169;
    }
    }
    lexicalValue813_139_0 = moom.BU.a(((java.lang.String)(life10_37)), ((int)(-1)));
    }
    life11_177 = lexicalValue813_139_0;
    spill813_11 = life11_177;
    if (!((life4_5 != 0))) {
        lexicalValue813_168_0 = spill813_11;
        break lexical_join_168;
    }
    if (!((spill813_11 < 0))) {
        break lexical_join_164;
    }
    spill813_12 = this;
    java.lang.String __stackOp813_28_0 = life10_37;
    java.lang.String __stackOp813_28_1 = p0;
    java.lang.String __stackOp813_28_2 = __sourceIntrinsic_0c88096d2255_invokedynamic813_27(12303, (7572023503750633709L ^ life2_3));
    spill813_13 = __stackOp813_28_2;
    spill813_14 = __stackOp813_28_0;
    spill813_15 = __stackOp813_28_1;
    recovery.source.CarrierOps.discard(__stackOp813_28_2);
    java.lang.String __stackOp813_31_0 = spill813_15;
    java.lang.String __stackOp813_31_1 = __sourceIntrinsic_0c88096d2255_invokedynamic813_30(11915, (3011342539699750465L ^ life2_3));
    ((moom.J3)(spill813_12)).b__Void(((java.lang.String)(__sourceIntrinsic_0c88096d2255_invokedynamic813_32(spill813_13, spill813_14, __stackOp813_31_1, __stackOp813_31_0))));
    if (!((life4_5 == 0))) {
        break lexical_join_169;
    }
    }
    lexicalValue813_168_0 = ((((java.util.List)(life5_15)).add(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life11_177))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue813_168_0);
    }
    life9_30 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    lexicalValue813_174_0 = ((java.util.List)(life5_15)).size();
    }
    life7_222 = new int[lexicalValue813_174_0];
    life8_224 = 0;
    lexical_cycle_178: while (true) {
    if (!((life8_224 < (life7_222).length))) {
        break lexical_join_195;
    }
    spill813_16 = life7_222;
    if (!((life4_5 != 0))) {
        lexicalValue813_196_0 = spill813_16;
        break lexical_join_196;
    }
    (spill813_16)[life8_224] = ((java.lang.Integer)(((java.lang.Integer)(((java.util.List)(life5_15)).get(((int)(life8_224))))))).intValue();
    life8_224 += 1;
    if (!((life4_5 == 0))) { continue lexical_cycle_178; }
    break lexical_cycle_178;
    }
    }
    lexicalValue813_196_0 = life7_222;
    }
    return lexicalValue813_196_0;
}


public boolean[] a(java.lang.String p0, boolean[] p1) {
int lexicalValue809_72_0;
    int lexicalValue809_79_0;
    int lexicalValue809_99_0;
    boolean[] lexicalValue809_121_0;
    boolean spill809_0;
    boolean[] spill809_1;
    long life3_3;
    int life5_5;
    java.util.EnumSet life6_14;
    java.lang.String[] life7_22;
    java.lang.String[] life8_24;
    int life9_27;
    int life10_29;
    java.lang.String life11_36;
    moom.bs life12_105;
    boolean[] life8_126;
    int life9_128;
    lexical_join_121: {
    lexical_join_120: {
    lexical_join_99: {
    lexical_join_97: {
    lexical_join_10: {
    life3_3 = (moom.J3.f ^ 116119778510896L);
    life5_5 = moom.J_.c();
    if (!((p0 == null))) {
        break lexical_join_10;
    }
    return p1;
    }
    life6_14 = java.util.EnumSet.allOf(((java.lang.Class)(moom.bs.class)));
    life7_22 = moom.BU.a__ArrayString(((java.lang.String)(p0)), ((java.lang.String)(__sourceIntrinsic_41ee881f98bc_invokedynamic809_4(4669, (2189877304846037182L ^ life3_3)))));
    life8_24 = life7_22;
    life9_27 = (life8_24).length;
    life10_29 = 0;
    lexical_cycle_28: while (true) {
    lexical_join_95: {
    lexical_join_94: {
    lexical_join_82: {
    lexical_join_79: {
    lexical_join_72: {
    lexical_join_65: {
    if (!((life10_29 < life9_27))) {
        break lexical_join_97;
    }
    life11_36 = (life8_24)[life10_29];
    spill809_0 = ((java.lang.String)(life11_36)).equals(((java.lang.Object)(__sourceIntrinsic_41ee881f98bc_invokedynamic809_6(3620, (2454629998582443144L ^ life3_3)))));
    if (!((life5_5 != 0))) {
        lexicalValue809_99_0 = ((spill809_0) ? 1 : 0);
        break lexical_join_99;
    }
    if (!((life5_5 != 0))) {
        lexicalValue809_72_0 = ((spill809_0) ? 1 : 0);
        break lexical_join_72;
    }
    if (!(spill809_0)) {
        break lexical_join_65;
    }
    ((java.util.EnumSet)(life6_14)).add(((java.lang.Object)(moom.bs.NORTH)));
    ((java.util.EnumSet)(life6_14)).add(((java.lang.Object)(moom.bs.SOUTH)));
    ((java.util.EnumSet)(life6_14)).add(((java.lang.Object)(moom.bs.WEST)));
    ((java.util.EnumSet)(life6_14)).add(((java.lang.Object)(moom.bs.EAST)));
    if (!((life5_5 == 0))) {
        break lexical_join_94;
    }
    }
    lexicalValue809_72_0 = ((((java.lang.String)(life11_36)).equals(((java.lang.Object)(__sourceIntrinsic_41ee881f98bc_invokedynamic809_18(30249, (1476010194323395741L ^ life3_3)))))) ? 1 : 0);
    }
    if (!((life5_5 != 0))) {
        lexicalValue809_79_0 = lexicalValue809_72_0;
        break lexical_join_79;
    }
    if (!((lexicalValue809_72_0 != 0))) {
        break lexical_join_82;
    }
    lexicalValue809_79_0 = ((((java.util.EnumSet)(life6_14)).addAll(((java.util.Collection)(java.util.Arrays.asList(((java.lang.Object[])(moom.bs.VALUES))))))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue809_79_0);
    if (!((life5_5 == 0))) {
        break lexical_join_94;
    }
    }
    life12_105 = ((moom.J3)(this)).a__bs(((java.lang.String)(life11_36)));
    if (!((life5_5 != 0))) {
        break lexical_join_95;
    }
    if (!((life12_105 != null))) {
        break lexical_join_94;
    }
    ((java.util.EnumSet)(life6_14)).add(((java.lang.Object)(life12_105)));
    }
    life10_29 += 1;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_28; }
    break lexical_cycle_28;
    }
    }
    lexicalValue809_99_0 = (moom.bs.VALUES).length;
    }
    life8_126 = new boolean[lexicalValue809_99_0];
    life9_128 = 0;
    lexical_cycle_103: while (true) {
    if (!((life9_128 < (life8_126).length))) {
        break lexical_join_120;
    }
    spill809_1 = life8_126;
    if (!((life5_5 != 0))) {
        lexicalValue809_121_0 = spill809_1;
        break lexical_join_121;
    }
    (spill809_1)[life9_128] = ((java.util.EnumSet)(life6_14)).contains(((java.lang.Object)((moom.bs.VALUES)[life9_128])));
    life9_128 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_103; }
    break lexical_cycle_103;
    }
    }
    lexicalValue809_121_0 = life8_126;
    }
    return lexicalValue809_121_0;
}


public moom.bs a__bs(java.lang.String p0) {
int forwardValue2257_26_0;
    int forwardValue2257_36_0;
    int forwardValue2257_46_0;
    int forwardValue2257_56_0;
    int forwardValue2257_68_0;
    int forwardValue2257_80_0;
    int forwardValue2257_94_0;
    java.lang.String forwardValue2257_105_0;
    int spill2257_0;
    boolean spill2257_1;
    java.lang.String spill2257_2;
    long life2_3;
    java.lang.String life1_7;
    int life4_8;
    forward_join_110: {
    forward_join_108: {
    forward_join_105: {
    forward_join_97: {
    forward_join_94: {
    forward_join_85: {
    forward_join_80: {
    forward_join_73: {
    forward_join_68: {
    forward_join_61: {
    forward_join_56: {
    forward_join_46: {
    forward_join_36: {
    forward_join_26: {
    life2_3 = (moom.J3.f ^ 133168203686743L);
    spill2257_0 = moom.J_.b();
    life1_7 = ((java.lang.String)(p0)).toLowerCase();
    life4_8 = spill2257_0;
    spill2257_1 = ((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_3(1514, (6733312469815495718L ^ life2_3)))));
    if (!((life4_8 == 0))) {
        forwardValue2257_26_0 = ((spill2257_1) ? 1 : 0);
        break forward_join_26;
    }
    if (!((!spill2257_1))) {
        break forward_join_110;
    }
    forwardValue2257_26_0 = ((((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_6(31507, (3620267893951623920L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue2257_36_0 = forwardValue2257_26_0;
        break forward_join_36;
    }
    if (!((forwardValue2257_26_0 == 0))) {
        break forward_join_110;
    }
    forwardValue2257_36_0 = ((((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_9(7678, (8490637273390584842L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue2257_46_0 = forwardValue2257_36_0;
        break forward_join_46;
    }
    if (!((forwardValue2257_36_0 == 0))) {
        break forward_join_108;
    }
    forwardValue2257_46_0 = ((((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_12(22042, (9159491588932132859L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue2257_56_0 = forwardValue2257_46_0;
        break forward_join_56;
    }
    if (!((forwardValue2257_46_0 == 0))) {
        break forward_join_108;
    }
    forwardValue2257_56_0 = ((((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_15(28383, (6858017365018077053L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue2257_68_0 = forwardValue2257_56_0;
        break forward_join_68;
    }
    if (!((forwardValue2257_56_0 != 0))) {
        break forward_join_61;
    }
    return moom.bs.NORTH;
    }
    forwardValue2257_68_0 = ((((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_19(30209, (7266272081150345174L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue2257_80_0 = forwardValue2257_68_0;
        break forward_join_80;
    }
    if (!((forwardValue2257_68_0 != 0))) {
        break forward_join_73;
    }
    return moom.bs.SOUTH;
    }
    forwardValue2257_80_0 = ((((java.lang.String)(life1_7)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_23(26110, (2824067089898040336L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue2257_94_0 = forwardValue2257_80_0;
        break forward_join_94;
    }
    if (!((forwardValue2257_80_0 != 0))) {
        break forward_join_85;
    }
    return moom.bs.EAST;
    }
    spill2257_2 = life1_7;
    if (!((life4_8 == 0))) {
        forwardValue2257_105_0 = spill2257_2;
        break forward_join_105;
    }
    forwardValue2257_94_0 = ((((java.lang.String)(spill2257_2)).equals(((java.lang.Object)(__sourceIntrinsic_b6cb17409f1f_invokedynamic2257_27(18855, (1839752403726942280L ^ life2_3)))))) ? 1 : 0);
    }
    if (!((forwardValue2257_94_0 != 0))) {
        break forward_join_97;
    }
    return moom.bs.WEST;
    }
    java.lang.String __stackOp2257_32_0 = life1_7;
    java.lang.String __stackOp2257_32_1 = __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_31(14560, (1062711400377528630L ^ life2_3));
    forwardValue2257_105_0 = __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_33(__stackOp2257_32_1, __stackOp2257_32_0);
    }
    moom.BU.c(((java.lang.String)(forwardValue2257_105_0)));
    return null;
    }
    return moom.bs.UP;
    }
    return moom.bs.DOWN;
}


public void a__Void(java.lang.String p0) {
long local2_life2 = (moom.J3.f ^ 113293083952938L);
    java.lang.String __sourceSpill517_6 = this.a;
    java.lang.String __stackOp517_7_0 = p0;
    java.lang.String __stackOp517_7_1 = __sourceIntrinsic_e2d81269afae_originalDynamicSite517_5(24203, (6820612503121064760L ^ local2_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_e2d81269afae_originalDynamicSite517_8(__sourceSpill517_6, __stackOp517_7_1, __stackOp517_7_0))));
    return;
}


public boolean a__Boolean_2(java.lang.String p0) {
java.lang.String forwardValue2251_13_0;
    int forwardValue2251_23_0;
    java.lang.String spill2251_0;
    int spill2251_1;
    long life2_3;
    int life4_5;
    int life5_33;
    forward_join_23: {
    forward_join_20: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (moom.J3.f ^ 69280833273796L);
    life4_5 = moom.J_.c();
    spill2251_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue2251_13_0 = spill2251_0;
        break forward_join_13;
    }
    if (!((spill2251_0 == null))) {
        break forward_join_12;
    }
    return ((0) != 0);
    }
    forwardValue2251_13_0 = p0;
    }
    spill2251_1 = ((java.lang.String)(forwardValue2251_13_0)).length();
    if (!((life4_5 != 0))) {
        forwardValue2251_23_0 = spill2251_1;
        break forward_join_23;
    }
    if (!((spill2251_1 < 1))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue2251_23_0 = ((int)(((java.lang.String)(p0)).charAt(((int)(0)))));
    }
    life5_33 = forwardValue2251_23_0;
    return java.lang.Character.isDigit(((char)(life5_33)));
}


private static native <E extends Throwable> moom.J6 __sourceIntrinsic_eb8803ad1f63_originalDynamicSite588_100() throws E;

private static native <E extends Throwable> moom.J6 __sourceIntrinsic_eb8803ad1f63_originalDynamicSite588_102() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_33(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_60f4bcb8bd52_invokedynamic2228_39(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2230_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2230_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2230_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2230_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2230_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_599c5f800586_invokedynamic2230_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5e130d9b8037_invokedynamic2231_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5e130d9b8037_invokedynamic2231_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2237_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2237_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2237_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4b80208140b2_invokedynamic2237_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_579d86ec496e_invokedynamic807_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_579d86ec496e_invokedynamic807_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_579d86ec496e_invokedynamic807_12(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41ee881f98bc_invokedynamic809_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41ee881f98bc_invokedynamic809_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_41ee881f98bc_invokedynamic809_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5008_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d308a3b6555_invokedynamic811_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0d308a3b6555_invokedynamic811_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_13(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_24(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0c88096d2255_invokedynamic813_32(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a19152a9326d_invokedynamic815_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a19152a9326d_invokedynamic815_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e35f4e277436_invokedynamic816_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e35f4e277436_invokedynamic816_7(java.lang.String a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e35f4e277436_invokedynamic816_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e35f4e277436_invokedynamic816_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e35f4e277436_invokedynamic816_13(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe1cd37ba361_invokedynamic2250_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe1cd37ba361_invokedynamic2250_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe1cd37ba361_invokedynamic2250_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fe1cd37ba361_invokedynamic2250_14(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_87baee49246f_invokedynamic817_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_52c0107edb4f_invokedynamic2253_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_52c0107edb4f_invokedynamic2253_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_52c0107edb4f_invokedynamic2253_7(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_52c0107edb4f_invokedynamic2253_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_52c0107edb4f_invokedynamic2253_13(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_52c0107edb4f_invokedynamic2253_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_52c0107edb4f_invokedynamic2253_18(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_1be7da3e4ca8_invokedynamic818_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7d31a37a36f2_invokedynamic2256_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7d31a37a36f2_invokedynamic2256_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite517_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite517_8(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b6cb17409f1f_invokedynamic2257_33(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_73d8ac8b7602_invokedynamic4173_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral4995_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f245134e4e44_invokedynamic819_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f245134e4e44_invokedynamic819_9(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f245134e4e44_invokedynamic819_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f245134e4e44_invokedynamic819_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f245134e4e44_invokedynamic819_17(java.lang.String a0, net.minecraft.item.Item a1, java.lang.String a2, java.lang.String a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b329d3c8bee5_invokedynamic820_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b329d3c8bee5_invokedynamic820_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d09e7390a875_originalDynamicSite518_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d09e7390a875_originalDynamicSite518_8(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e12022a7f1e0_invokedynamic821_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e12022a7f1e0_invokedynamic821_7(java.lang.String a0, java.lang.String a1) throws E;
}
