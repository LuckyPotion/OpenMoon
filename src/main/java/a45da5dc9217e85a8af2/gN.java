package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gN extends net.minecraft.client.gui.GuiScreen implements moom.h0, moom.hX {

private net.minecraft.client.gui.GuiCreateWorld w;

protected java.lang.String x;

protected java.lang.String y;

protected java.lang.String z;

protected java.lang.String[] A;

private moom.h8 B;

private moom.gc C;

private moom.gc D;

private moom.gc E;

private moom.gc F;

private moom.gc G;

private moom.gc H;

private moom.gc I;

private moom.gc J;

private boolean K;

private int L;

private boolean M;

private com.google.common.base.Predicate<java.lang.String> N;

private moom.FE O;

private moom.FE P;

private java.util.Random Q;

private static long R;

private static long[] S;

private static java.lang.Integer[] T;

private static java.util.Map U;

public gN(net.minecraft.client.gui.GuiScreen p0, java.lang.String p1) {
super();
    this.x = ((java.lang.String)("Customize World Settings"));
    this.y = ((java.lang.String)("Page 1 of 3"));
    this.z = ((java.lang.String)("Basic Settings"));
    this.A = ((java.lang.String[])(new java.lang.String[4]));
    this.K = ((boolean)(false));
    this.L = ((int)(0));
    this.M = ((boolean)(false));
    this.N = ((com.google.common.base.Predicate)(__sourceIntrinsic_8ba435a7bad9_originalDynamicSite4359_7()));
    this.O = ((moom.FE)(new moom.FE()));
    this.Q = ((java.util.Random)(new java.util.Random()));
    this.w = ((net.minecraft.client.gui.GuiCreateWorld)(((net.minecraft.client.gui.GuiCreateWorld)(p0))));
    ((moom.gN)(this)).a(((java.lang.String)(p1)));
    return;
}


static {
R = ((long)(((moom._a)(moom._c.a(((long)(6550257950189644974L)), ((long)(7568321615327175701L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(65864784804820L)))));
    U = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gN.R ^ 73411446578L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1215_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1215_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1215_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1215_14 = new byte[8];
    (__sourceSpill1215_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1215_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1215_16 = __sourceSpill1215_14;
    ((javax.crypto.Cipher)(__sourceSpill1215_11)).init(((int)(__sourceSpill1215_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1215_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1215_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[248];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "I¹$Mº,%4\007&\0028¹\006õÆå¸Br®Ø2RE®EÇ³ä}§\"od\007P÷Özþn|ì\f\\Û«¥ùKý%\016·ÄO\013,~WÀ_¨Ñí^\037z/lI.óàråÔä'%pô./<e?S2ÙZ3§\004c®'í\177¶\007î>\\Ð'r±õP\f°vCßÀ·¥k¾±\0272náS¤\030z½e±\017¬É{©Ó`Ò´»JóÇÉ¸*×Mï<7ÀDqÍ¹´\005/\023ð=À\020[^¦¸/OÕ\016ó]\027\024 5àÑÿD@\r7{RsýA7\004\"G\003{\037|O§íPì°cPû\021§ºªZF°¸\031M\016ûhõüa©\016¢\027y«\b¶§Riüå<\000~ãN¯mÕ2ÂGú{-¸KÿÑ§)ÌzÐ#±\\Û\037|±\"Gî®\006\020E<&\031N¥|4\b\rÑnslçL`SW©%\tù9Sm#O\177^µKDÈmp4ÎCçR\tÍÀ8Og½äÿóéo\037\002üöì~(Þh¸<Û\004?\023Ñøh¹ø¼e¦\016ÊkH?8äò\027ä¾Z\030©Ù\016\016«ñr\025¼§!I\001nàûÀ2yt4Ê¹¦¬4â××e]Ô&¶\030ðï;\004U -pé0\016x\025e¥\032HP\007\016+CØ;ÜÜS+\030)*ÆO/\017ËöÍÍ3ùê\001\037¦\003+Æí1Ã\013\005ÖPÇ\016kDÞJ\006yÂÊù\033\031Uö¶qáz·\001XÜ¢[À:Þ\024\025PÙ{êä}ÿÇ\017\bì»\006\t®e¯\007äsób\023wÝ\006ö\017­Ùe³ê85õ4\035\n5Î\037¤Æ{\nÓ{3ª²´\004\"Zzû\004T_\\`\n+\033:¹àÓúux~ì\030P\\Ü_3îì=ÎÿVU;\025¥ Ö?M\003}¿>vm\036Èv3\003Ì4~(möjÝÖâ@ç!\021ï?,Å\021­ô6R\035èä\f,-×]Fm:\023¶\025Áïà8ª¶Q]]æþ9ag\006üV\035­?É~\bT.\036\"'6Ý«AZ\f©{js\036''Â>«c{\020\013f=\nñíÊ\013aÎy¥Yõàö°ÁÊBv\032·k0¹\\.·\\{ÿ\032h¤RÓ{ iÈNßK-9þO¬\023ÐxéÓáµ¤$\034Ã(¤¬\004å¼IØÎ|dA\033R1\036³\tÄ\021¿Et^8¾F7=%\022¶PT@òÁ\021\003üù\0264Ií\177Í\021±ß%î>Ïå\005\177úKLÎ×Ì§í\022ûC[áÀ\016\017i^NÖ¤{5'\004¯¿/sÿiMæq\036\001­UcÇ*!ïb¦\026×%Aý÷¡q~ýv{.\000a\0364Ýz\177[0Ú*}I(éô8=\bg¬=®\023rO\n¹¡ñ\004Ê3\036eû÷\013Ì{É¸Ä=''_ê\030Û4r­<ÓÜì´Ó®õ´Ú°yÕÁùµ-z1ê$S´·\013\0172}JÓÖé\035×Òfð¼»\r¼\bÆ\003\fKfaf­\034Ó<îËDj¥Iª}»¦ÉÏëGíÜE.&¡)ô\020Ø^1,\016d\007\bBF\005\\ké×9ì/}ï\t^\022S=\"*bâ\030E\000½´Ûs$nËY*Q.È¯Æìûàg,AðYzì÷ØnhÍc´ràçU\004 *þq-D¶n\016IîA¸\017`+7îåü¦ÈHBE´µ±}7{º%Kt42f\032\fÞ\004ò®\037×{o\001Bózõ\013ï±]\020\021{çç»å\001\036ñî\r}¤£ñv÷ìZ½XNÉ\n÷\033È\023Q<¥&}N57é÷Z¿ËINnÀ!\0173;þIä1Dµ¥{5Ú6Y\n«Ñ¾Ë&\177è¥\002ëM\036rá½FI@C/\035d\006º;bgá­³i~´)\027ßyì3ºþ\036ÞÞ7Q¬¢\003Ëo\177ïÊB¯Eº\004!º\004c94t¤Ñã¾¥¨°d\bÏA-\025\001®C[«ú¥YÈ\021n7#LIkî\007¹ÈD\023´?é1óc\002J\000lQ\027\022\000-ü\037Á\n:\032_0\002%\004Ò_hCÑs¼(eÁ²SÎ¿{KT¬\016!?º¯A¶ß\003)-Ä\005³¯#\026Å¸\"ú£\023Td\n¦\f\004@¤&Ò9?mã#ÃV¾'%\006c¾å·­®4]lEÎ\rÏ\023½Q÷:\002\005[ý\005\035tôd^hboü'u-¸ìúãöaýZs\btZëö\027bÛri\002x×ùMe\t(;`j\035\016Û\007³îò¹¡üâfëí8\0134¦ìªî*Ï¬B¸ë\017¤n¿î}o}¥rÅIïCð¨\032;èÛ{Ñ!hÎ\031\f®~@Ê\"×»ßé\000·\rØó\001n;DÙ\035U`±\026?S[ý÷AÚv\003[©4=_ø×ÉÞ×à£\024\021ª¦\001`O\030ÏÁ\177\nÂ\n{Kôÿ*´à.@^Üú´wvl\032O([C\017\026hzØËqNÅ¿²\022JAaô\016É0\177îcã¥òÎ\005.ôz ¦µAù\tÎçÈ&ÏB¯Ø&½7Ù0øu³=xW\005sH\"\036[NWm\007º¤Vð$n3<2å$oLÅ\023Ùp+«é\036Dè£ÿ)&@Æb{SYÅ7»þÓÉÕØ\fÿ8\021­Ã\007.±Ä$ÇMJ|À·KÚ\037\002¾5ô\021ý\002\036\025\032¼ÒÕb\177)@#.{\032Ý\024ÜPo«· jG\026:%Hlï¼}\003\016O¸ýÃ¾¥ëçÁ\017Y±û!`X÷\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1215_25 = local6_life21;
        int __sourceSpill1215_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1215_25)).substring(((int)(__sourceSpill1215_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1215_30 = local8_life19;
        int __sourceSpill1215_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1215_33 = new byte[8];
        (__sourceSpill1215_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1215_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1215_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1215_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1215_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1215_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1215_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1215_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1215_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1215_34)).doFinal(((byte[])(__sourceSpill1215_33)));
        (__sourceSpill1215_30)[__sourceSpill1215_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "hxÝï\036ç6Kb\\¡1"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1215_38 = local6_life21;
        int __sourceSpill1215_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1215_38)).substring(((int)(__sourceSpill1215_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1215_43 = local8_life19;
        int __sourceSpill1215_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1215_46 = new byte[8];
        (__sourceSpill1215_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1215_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1215_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1215_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1215_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1215_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1215_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1215_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1215_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1215_47)).doFinal(((byte[])(__sourceSpill1215_46)));
        (__sourceSpill1215_43)[__sourceSpill1215_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    S = ((long[])(local8_life19));
    T = ((java.lang.Integer[])(new java.lang.Integer[248]));
}

private static native <E extends Throwable> void __sourceHandlerCall_6fde886c6ebe4a838f88(moom.gN a0) throws E;
private static final class __SourceHandler_6fde886c6ebe4a838f88 {

public static void f432(moom.gN receiver) throws Throwable {
    moom.hS[] spill432_0;
    moom.hS[] spill432_1;
    int spill432_2;
    moom.hW spill432_3;
    moom.hS[] spill432_4;
    moom.hS[] spill432_5;
    int spill432_6;
    moom.hU spill432_7;
    moom.hS[] spill432_8;
    moom.hS[] spill432_9;
    int spill432_10;
    moom.hU spill432_11;
    moom.hS[] spill432_12;
    moom.hS[] spill432_13;
    int spill432_14;
    moom.hU spill432_15;
    moom.hS[] spill432_16;
    moom.hS[] spill432_17;
    int spill432_18;
    moom.hU spill432_19;
    moom.hS[] spill432_20;
    moom.hS[] spill432_21;
    int spill432_22;
    moom.hU spill432_23;
    moom.hS[] spill432_24;
    moom.hS[] spill432_25;
    int spill432_26;
    moom.hU spill432_27;
    moom.hS[] spill432_28;
    moom.hS[] spill432_29;
    int spill432_30;
    moom.hU spill432_31;
    moom.hS[] spill432_32;
    moom.hS[] spill432_33;
    int spill432_34;
    moom.hU spill432_35;
    moom.hS[] spill432_36;
    moom.hS[] spill432_37;
    int spill432_38;
    moom.hW spill432_39;
    moom.hS[] spill432_40;
    moom.hS[] spill432_41;
    int spill432_42;
    moom.hU spill432_43;
    moom.hS[] spill432_44;
    moom.hS[] spill432_45;
    int spill432_46;
    moom.hW spill432_47;
    moom.hS[] spill432_48;
    moom.hS[] spill432_49;
    int spill432_50;
    moom.hU spill432_51;
    moom.hS[] spill432_52;
    moom.hS[] spill432_53;
    int spill432_54;
    moom.hW spill432_55;
    moom.hS[] spill432_56;
    moom.hS[] spill432_57;
    int spill432_58;
    moom.hU spill432_59;
    moom.hS[] spill432_60;
    moom.hS[] spill432_61;
    int spill432_62;
    moom.hW spill432_63;
    moom.hS[] spill432_64;
    moom.hS[] spill432_65;
    int spill432_66;
    moom.hW spill432_67;
    moom.hS[] spill432_68;
    moom.hS[] spill432_69;
    int spill432_70;
    moom.hW spill432_71;
    moom.hS[] spill432_72;
    moom.hS[] spill432_73;
    int spill432_74;
    moom.hV spill432_75;
    moom.hS[] spill432_76;
    moom.hS[] spill432_77;
    moom.hS[] spill432_78;
    int spill432_79;
    moom.hW spill432_80;
    moom.hS[] spill432_81;
    moom.hS[] spill432_82;
    int spill432_83;
    moom.hW spill432_84;
    moom.hS[] spill432_85;
    moom.hS[] spill432_86;
    int spill432_87;
    moom.hW spill432_88;
    moom.hS[] spill432_89;
    moom.hS[] spill432_90;
    int spill432_91;
    moom.hW spill432_92;
    moom.hS[] spill432_93;
    moom.hS[] spill432_94;
    int spill432_95;
    moom.hV spill432_96;
    moom.hS[] spill432_97;
    moom.hS[] spill432_98;
    moom.hS[] spill432_99;
    int spill432_100;
    moom.hW spill432_101;
    moom.hS[] spill432_102;
    moom.hS[] spill432_103;
    int spill432_104;
    moom.hW spill432_105;
    moom.hS[] spill432_106;
    moom.hS[] spill432_107;
    int spill432_108;
    moom.hW spill432_109;
    moom.hS[] spill432_110;
    moom.hS[] spill432_111;
    int spill432_112;
    moom.hW spill432_113;
    moom.hS[] spill432_114;
    moom.hS[] spill432_115;
    int spill432_116;
    moom.hV spill432_117;
    moom.hS[] spill432_118;
    moom.hS[] spill432_119;
    moom.hS[] spill432_120;
    int spill432_121;
    moom.hW spill432_122;
    moom.hS[] spill432_123;
    moom.hS[] spill432_124;
    int spill432_125;
    moom.hW spill432_126;
    moom.hS[] spill432_127;
    moom.hS[] spill432_128;
    int spill432_129;
    moom.hW spill432_130;
    moom.hS[] spill432_131;
    moom.hS[] spill432_132;
    int spill432_133;
    moom.hW spill432_134;
    moom.hS[] spill432_135;
    moom.hS[] spill432_136;
    int spill432_137;
    moom.hV spill432_138;
    moom.hS[] spill432_139;
    moom.hS[] spill432_140;
    moom.hS[] spill432_141;
    int spill432_142;
    moom.hW spill432_143;
    moom.hS[] spill432_144;
    moom.hS[] spill432_145;
    int spill432_146;
    moom.hW spill432_147;
    moom.hS[] spill432_148;
    moom.hS[] spill432_149;
    int spill432_150;
    moom.hW spill432_151;
    moom.hS[] spill432_152;
    moom.hS[] spill432_153;
    int spill432_154;
    moom.hW spill432_155;
    moom.hS[] spill432_156;
    moom.hS[] spill432_157;
    int spill432_158;
    moom.hV spill432_159;
    moom.hS[] spill432_160;
    moom.hS[] spill432_161;
    moom.hS[] spill432_162;
    int spill432_163;
    moom.hW spill432_164;
    moom.hS[] spill432_165;
    moom.hS[] spill432_166;
    int spill432_167;
    moom.hW spill432_168;
    moom.hS[] spill432_169;
    moom.hS[] spill432_170;
    int spill432_171;
    moom.hW spill432_172;
    moom.hS[] spill432_173;
    moom.hS[] spill432_174;
    int spill432_175;
    moom.hW spill432_176;
    moom.hS[] spill432_177;
    moom.hS[] spill432_178;
    int spill432_179;
    moom.hV spill432_180;
    moom.hS[] spill432_181;
    moom.hS[] spill432_182;
    moom.hS[] spill432_183;
    int spill432_184;
    moom.hW spill432_185;
    moom.hS[] spill432_186;
    moom.hS[] spill432_187;
    int spill432_188;
    moom.hW spill432_189;
    moom.hS[] spill432_190;
    moom.hS[] spill432_191;
    int spill432_192;
    moom.hW spill432_193;
    moom.hS[] spill432_194;
    moom.hS[] spill432_195;
    int spill432_196;
    moom.hW spill432_197;
    moom.hS[] spill432_198;
    moom.hS[] spill432_199;
    int spill432_200;
    moom.hV spill432_201;
    moom.hS[] spill432_202;
    moom.hS[] spill432_203;
    moom.hS[] spill432_204;
    int spill432_205;
    moom.hW spill432_206;
    moom.hS[] spill432_207;
    moom.hS[] spill432_208;
    int spill432_209;
    moom.hW spill432_210;
    moom.hS[] spill432_211;
    moom.hS[] spill432_212;
    int spill432_213;
    moom.hW spill432_214;
    moom.hS[] spill432_215;
    moom.hS[] spill432_216;
    int spill432_217;
    moom.hW spill432_218;
    moom.hS[] spill432_219;
    moom.hS[] spill432_220;
    int spill432_221;
    moom.hV spill432_222;
    moom.hS[] spill432_223;
    moom.hS[] spill432_224;
    moom.hS[] spill432_225;
    int spill432_226;
    moom.hW spill432_227;
    moom.hS[] spill432_228;
    moom.hS[] spill432_229;
    int spill432_230;
    moom.hW spill432_231;
    moom.hS[] spill432_232;
    moom.hS[] spill432_233;
    int spill432_234;
    moom.hW spill432_235;
    moom.hS[] spill432_236;
    moom.hS[] spill432_237;
    int spill432_238;
    moom.hW spill432_239;
    moom.hS[] spill432_240;
    moom.hS[] spill432_241;
    int spill432_242;
    moom.hV spill432_243;
    moom.hS[] spill432_244;
    moom.hS[] spill432_245;
    moom.hS[] spill432_246;
    int spill432_247;
    moom.hW spill432_248;
    moom.hS[] spill432_249;
    moom.hS[] spill432_250;
    int spill432_251;
    moom.hW spill432_252;
    moom.hS[] spill432_253;
    moom.hS[] spill432_254;
    int spill432_255;
    moom.hW spill432_256;
    moom.hS[] spill432_257;
    moom.hS[] spill432_258;
    int spill432_259;
    moom.hW spill432_260;
    moom.hS[] spill432_261;
    moom.hS[] spill432_262;
    int spill432_263;
    moom.hV spill432_264;
    moom.hS[] spill432_265;
    moom.hS[] spill432_266;
    moom.hS[] spill432_267;
    int spill432_268;
    moom.hW spill432_269;
    moom.hS[] spill432_270;
    moom.hS[] spill432_271;
    int spill432_272;
    moom.hW spill432_273;
    moom.hS[] spill432_274;
    moom.hS[] spill432_275;
    int spill432_276;
    moom.hW spill432_277;
    moom.hS[] spill432_278;
    moom.hS[] spill432_279;
    int spill432_280;
    moom.hW spill432_281;
    moom.hS[] spill432_282;
    moom.hS[] spill432_283;
    int spill432_284;
    moom.hV spill432_285;
    moom.hS[] spill432_286;
    moom.hS[] spill432_287;
    moom.hS[] spill432_288;
    int spill432_289;
    moom.hW spill432_290;
    moom.hS[] spill432_291;
    moom.hS[] spill432_292;
    int spill432_293;
    moom.hW spill432_294;
    moom.hS[] spill432_295;
    moom.hS[] spill432_296;
    int spill432_297;
    moom.hW spill432_298;
    moom.hS[] spill432_299;
    moom.hS[] spill432_300;
    int spill432_301;
    moom.hW spill432_302;
    moom.hS[] spill432_303;
    moom.hS[] spill432_304;
    int spill432_305;
    moom.hW spill432_306;
    moom.hS[] spill432_307;
    moom.hS[] spill432_308;
    int spill432_309;
    moom.hW spill432_310;
    moom.hS[] spill432_311;
    moom.hS[] spill432_312;
    int spill432_313;
    moom.hW spill432_314;
    moom.hS[] spill432_315;
    moom.hS[] spill432_316;
    int spill432_317;
    moom.hW spill432_318;
    moom.hS[] spill432_319;
    moom.hS[] spill432_320;
    int spill432_321;
    moom.hW spill432_322;
    moom.hS[] spill432_323;
    moom.hS[] spill432_324;
    int spill432_325;
    moom.hW spill432_326;
    moom.hS[] spill432_327;
    moom.hS[] spill432_328;
    int spill432_329;
    moom.hW spill432_330;
    moom.hS[] spill432_331;
    moom.hS[] spill432_332;
    int spill432_333;
    moom.hW spill432_334;
    moom.hS[] spill432_335;
    moom.hS[] spill432_336;
    int spill432_337;
    moom.hW spill432_338;
    moom.hS[] spill432_339;
    moom.hS[] spill432_340;
    int spill432_341;
    moom.hW spill432_342;
    moom.hS[] spill432_343;
    moom.hS[] spill432_344;
    int spill432_345;
    moom.hW spill432_346;
    moom.hS[] spill432_347;
    moom.hS[] spill432_348;
    int spill432_349;
    moom.hW spill432_350;
    moom.hS[] spill432_351;
    moom.hS[] spill432_352;
    int spill432_353;
    moom.hW spill432_354;
    moom.hS[] spill432_355;
    moom.hS[] spill432_356;
    int spill432_357;
    moom.hW spill432_358;
    moom.hS[] spill432_359;
    moom.hS[] spill432_360;
    int spill432_361;
    moom.hW spill432_362;
    moom.hS[] spill432_363;
    moom.hS[] spill432_364;
    int spill432_365;
    moom.hW spill432_366;
    moom.hS[] spill432_367;
    moom.hS[] spill432_368;
    int spill432_369;
    moom.hV spill432_370;
    moom.hS[] spill432_371;
    moom.hS[] spill432_372;
    int spill432_373;
    moom.hT spill432_374;
    moom.hT spill432_375;
    int spill432_376;
    java.lang.String spill432_377;
    java.lang.Object[] spill432_378;
    moom.hS[] spill432_379;
    moom.hS[] spill432_380;
    int spill432_381;
    moom.hV spill432_382;
    moom.hS[] spill432_383;
    moom.hS[] spill432_384;
    int spill432_385;
    moom.hT spill432_386;
    moom.hT spill432_387;
    int spill432_388;
    java.lang.String spill432_389;
    java.lang.Object[] spill432_390;
    moom.hS[] spill432_391;
    moom.hS[] spill432_392;
    int spill432_393;
    moom.hV spill432_394;
    moom.hS[] spill432_395;
    moom.hS[] spill432_396;
    int spill432_397;
    moom.hT spill432_398;
    moom.hT spill432_399;
    int spill432_400;
    java.lang.String spill432_401;
    java.lang.Object[] spill432_402;
    moom.hS[] spill432_403;
    moom.hS[] spill432_404;
    int spill432_405;
    moom.hV spill432_406;
    moom.hS[] spill432_407;
    moom.hS[] spill432_408;
    int spill432_409;
    moom.hT spill432_410;
    moom.hT spill432_411;
    int spill432_412;
    java.lang.String spill432_413;
    java.lang.Object[] spill432_414;
    moom.hS[] spill432_415;
    moom.hS[] spill432_416;
    int spill432_417;
    moom.hV spill432_418;
    moom.hS[] spill432_419;
    moom.hS[] spill432_420;
    int spill432_421;
    moom.hT spill432_422;
    moom.hT spill432_423;
    int spill432_424;
    java.lang.String spill432_425;
    java.lang.Object[] spill432_426;
    moom.hS[] spill432_427;
    moom.hS[] spill432_428;
    int spill432_429;
    moom.hV spill432_430;
    moom.hS[] spill432_431;
    moom.hS[] spill432_432;
    int spill432_433;
    moom.hT spill432_434;
    moom.hT spill432_435;
    int spill432_436;
    java.lang.String spill432_437;
    java.lang.Object[] spill432_438;
    moom.hS[] spill432_439;
    moom.hS[] spill432_440;
    int spill432_441;
    moom.hV spill432_442;
    moom.hS[] spill432_443;
    moom.hS[] spill432_444;
    int spill432_445;
    moom.hT spill432_446;
    moom.hT spill432_447;
    int spill432_448;
    java.lang.String spill432_449;
    java.lang.Object[] spill432_450;
    moom.hS[] spill432_451;
    moom.hS[] spill432_452;
    int spill432_453;
    moom.hV spill432_454;
    moom.hS[] spill432_455;
    moom.hS[] spill432_456;
    int spill432_457;
    moom.hT spill432_458;
    moom.hT spill432_459;
    int spill432_460;
    java.lang.String spill432_461;
    java.lang.Object[] spill432_462;
    moom.hS[] spill432_463;
    moom.hS[] spill432_464;
    int spill432_465;
    moom.hV spill432_466;
    moom.hS[] spill432_467;
    moom.hS[] spill432_468;
    int spill432_469;
    moom.hT spill432_470;
    moom.hT spill432_471;
    int spill432_472;
    java.lang.String spill432_473;
    java.lang.Object[] spill432_474;
    moom.hS[] spill432_475;
    moom.hS[] spill432_476;
    int spill432_477;
    moom.hV spill432_478;
    moom.hS[] spill432_479;
    moom.hS[] spill432_480;
    int spill432_481;
    moom.hT spill432_482;
    moom.hT spill432_483;
    int spill432_484;
    java.lang.String spill432_485;
    java.lang.Object[] spill432_486;
    moom.hS[] spill432_487;
    moom.hS[] spill432_488;
    int spill432_489;
    moom.hV spill432_490;
    moom.hS[] spill432_491;
    moom.hS[] spill432_492;
    int spill432_493;
    moom.hT spill432_494;
    moom.hT spill432_495;
    int spill432_496;
    java.lang.String spill432_497;
    java.lang.Object[] spill432_498;
    moom.hS[] spill432_499;
    moom.hS[] spill432_500;
    int spill432_501;
    moom.hV spill432_502;
    moom.hS[] spill432_503;
    moom.hS[] spill432_504;
    int spill432_505;
    moom.hT spill432_506;
    moom.hT spill432_507;
    int spill432_508;
    java.lang.String spill432_509;
    java.lang.Object[] spill432_510;
    moom.hS[] spill432_511;
    moom.hS[] spill432_512;
    int spill432_513;
    moom.hV spill432_514;
    moom.hS[] spill432_515;
    moom.hS[] spill432_516;
    int spill432_517;
    moom.hT spill432_518;
    moom.hT spill432_519;
    int spill432_520;
    java.lang.String spill432_521;
    java.lang.Object[] spill432_522;
    moom.hS[] spill432_523;
    moom.hS[] spill432_524;
    int spill432_525;
    moom.hV spill432_526;
    moom.hS[] spill432_527;
    moom.hS[] spill432_528;
    int spill432_529;
    moom.hT spill432_530;
    moom.hT spill432_531;
    int spill432_532;
    java.lang.String spill432_533;
    java.lang.Object[] spill432_534;
    moom.hS[] spill432_535;
    moom.hS[] spill432_536;
    int spill432_537;
    moom.hV spill432_538;
    moom.hS[] spill432_539;
    moom.hS[] spill432_540;
    int spill432_541;
    moom.hT spill432_542;
    moom.hT spill432_543;
    int spill432_544;
    java.lang.String spill432_545;
    java.lang.Object[] spill432_546;
    moom.hS[] spill432_547;
    moom.hS[] spill432_548;
    int spill432_549;
    moom.hV spill432_550;
    moom.hS[] spill432_551;
    moom.hS[] spill432_552;
    int spill432_553;
    moom.hT spill432_554;
    moom.hT spill432_555;
    int spill432_556;
    java.lang.String spill432_557;
    java.lang.Object[] spill432_558;
    moom.gN spill432_559;
    moom.h8 spill432_560;
    moom.h8 spill432_561;
    net.minecraft.client.Minecraft spill432_562;
    int spill432_563;
    int spill432_564;
    int spill432_565;
    int spill432_566;
    int spill432_567;
    moom.gN spill432_568;
    moom.hS[][] spill432_569;
    moom.hS[][] spill432_570;
    moom.hS[][] spill432_571;
    moom.hS[][] spill432_572;
    long life1_3;
    moom.hS[] life3_428;
    moom.hS[] life4_1907;
    moom.hS[] life5_2306;
    moom.hS[] life6_3089;
    int life7_3139;
    forest_join_3154: {
    life1_3 = (__fieldRead432_0() ^ 31422247572106L);
    moom.hS[] __stackOp432_2_0 = new moom.hS[__invokedynamic432_1(25819, (1337440078472426349L ^ life1_3))];
    spill432_0 = __stackOp432_2_0;
    spill432_1 = __stackOp432_2_0;
    spill432_2 = 0;
    moom.hW __stackOp432_4_0 = __sourceUninitializedNEW432_3();
    spill432_3 = __stackOp432_4_0;
    __explicitNewInit432_9(__stackOp432_4_0, __invokedynamic432_5(23743, (8640861899295198019L ^ life1_3)), __call432_6("createWorld.customize.custom.seaLevel", new java.lang.Object[0]), true, receiver, 0x1.0p0f, 0x1.fep7f, ((float) __fieldRead432_8(__fieldRead432_7(receiver))));
    (spill432_1)[spill432_2] = spill432_3;
    moom.hS[] __stackOp432_10_0 = spill432_0;
    spill432_4 = __stackOp432_10_0;
    spill432_5 = __stackOp432_10_0;
    spill432_6 = 1;
    moom.hU __stackOp432_12_0 = __sourceUninitializedNEW432_11();
    spill432_7 = __stackOp432_12_0;
    __explicitNewInit432_17(__stackOp432_12_0, __invokedynamic432_13(7847, (4554998006487173419L ^ life1_3)), __call432_14("createWorld.customize.custom.useCaves", new java.lang.Object[0]), true, __fieldRead432_16(__fieldRead432_15(receiver)));
    (spill432_5)[spill432_6] = spill432_7;
    moom.hS[] __stackOp432_18_0 = spill432_4;
    spill432_8 = __stackOp432_18_0;
    spill432_9 = __stackOp432_18_0;
    spill432_10 = 2;
    moom.hU __stackOp432_20_0 = __sourceUninitializedNEW432_19();
    spill432_11 = __stackOp432_20_0;
    __explicitNewInit432_25(__stackOp432_20_0, __invokedynamic432_21(11079, (2327676963859856588L ^ life1_3)), __call432_22("createWorld.customize.custom.useStrongholds", new java.lang.Object[0]), true, __fieldRead432_24(__fieldRead432_23(receiver)));
    (spill432_9)[spill432_10] = spill432_11;
    moom.hS[] __stackOp432_26_0 = spill432_8;
    spill432_12 = __stackOp432_26_0;
    spill432_13 = __stackOp432_26_0;
    spill432_14 = 3;
    moom.hU __stackOp432_28_0 = __sourceUninitializedNEW432_27();
    spill432_15 = __stackOp432_28_0;
    __explicitNewInit432_33(__stackOp432_28_0, __invokedynamic432_29(4377, (8549849025297336013L ^ life1_3)), __call432_30("createWorld.customize.custom.useVillages", new java.lang.Object[0]), true, __fieldRead432_32(__fieldRead432_31(receiver)));
    (spill432_13)[spill432_14] = spill432_15;
    moom.hS[] __stackOp432_34_0 = spill432_12;
    spill432_16 = __stackOp432_34_0;
    spill432_17 = __stackOp432_34_0;
    spill432_18 = 4;
    moom.hU __stackOp432_36_0 = __sourceUninitializedNEW432_35();
    spill432_19 = __stackOp432_36_0;
    __explicitNewInit432_41(__stackOp432_36_0, __invokedynamic432_37(19139, (8285540926844476822L ^ life1_3)), __call432_38("createWorld.customize.custom.useMineShafts", new java.lang.Object[0]), true, __fieldRead432_40(__fieldRead432_39(receiver)));
    (spill432_17)[spill432_18] = spill432_19;
    moom.hS[] __stackOp432_42_0 = spill432_16;
    spill432_20 = __stackOp432_42_0;
    spill432_21 = __stackOp432_42_0;
    spill432_22 = 5;
    moom.hU __stackOp432_44_0 = __sourceUninitializedNEW432_43();
    spill432_23 = __stackOp432_44_0;
    __explicitNewInit432_49(__stackOp432_44_0, __invokedynamic432_45(28248, (3360966851489085940L ^ life1_3)), __call432_46("createWorld.customize.custom.useTemples", new java.lang.Object[0]), true, __fieldRead432_48(__fieldRead432_47(receiver)));
    (spill432_21)[spill432_22] = spill432_23;
    moom.hS[] __stackOp432_50_0 = spill432_20;
    spill432_24 = __stackOp432_50_0;
    spill432_25 = __stackOp432_50_0;
    spill432_26 = __invokedynamic432_51(25508, (3263552911645979723L ^ life1_3));
    moom.hU __stackOp432_53_0 = __sourceUninitializedNEW432_52();
    spill432_27 = __stackOp432_53_0;
    __explicitNewInit432_58(__stackOp432_53_0, __invokedynamic432_54(8452, (7243341923186046517L ^ life1_3)), __call432_55("createWorld.customize.custom.useMonuments", new java.lang.Object[0]), true, __fieldRead432_57(__fieldRead432_56(receiver)));
    (spill432_25)[spill432_26] = spill432_27;
    moom.hS[] __stackOp432_59_0 = spill432_24;
    spill432_28 = __stackOp432_59_0;
    spill432_29 = __stackOp432_59_0;
    spill432_30 = __invokedynamic432_60(3232, (4157250188239395789L ^ life1_3));
    moom.hU __stackOp432_62_0 = __sourceUninitializedNEW432_61();
    spill432_31 = __stackOp432_62_0;
    __explicitNewInit432_67(__stackOp432_62_0, __invokedynamic432_63(6193, (7942984521833205683L ^ life1_3)), __call432_64("createWorld.customize.custom.useRavines", new java.lang.Object[0]), true, __fieldRead432_66(__fieldRead432_65(receiver)));
    (spill432_29)[spill432_30] = spill432_31;
    moom.hS[] __stackOp432_68_0 = spill432_28;
    spill432_32 = __stackOp432_68_0;
    spill432_33 = __stackOp432_68_0;
    spill432_34 = __invokedynamic432_69(12415, (942678244703234032L ^ life1_3));
    moom.hU __stackOp432_71_0 = __sourceUninitializedNEW432_70();
    spill432_35 = __stackOp432_71_0;
    __explicitNewInit432_76(__stackOp432_71_0, __invokedynamic432_72(18064, (181464857553834388L ^ life1_3)), __call432_73("createWorld.customize.custom.useDungeons", new java.lang.Object[0]), true, __fieldRead432_75(__fieldRead432_74(receiver)));
    (spill432_33)[spill432_34] = spill432_35;
    moom.hS[] __stackOp432_77_0 = spill432_32;
    spill432_36 = __stackOp432_77_0;
    spill432_37 = __stackOp432_77_0;
    spill432_38 = __invokedynamic432_78(30434, (2002635803111203260L ^ life1_3));
    moom.hW __stackOp432_80_0 = __sourceUninitializedNEW432_79();
    spill432_39 = __stackOp432_80_0;
    __explicitNewInit432_85(__stackOp432_80_0, __invokedynamic432_81(12612, (4682811014576432864L ^ life1_3)), __call432_82("createWorld.customize.custom.dungeonChance", new java.lang.Object[0]), true, receiver, 0x1.0p0f, 0x1.9p6f, ((float) __fieldRead432_84(__fieldRead432_83(receiver))));
    (spill432_37)[spill432_38] = spill432_39;
    moom.hS[] __stackOp432_86_0 = spill432_36;
    spill432_40 = __stackOp432_86_0;
    spill432_41 = __stackOp432_86_0;
    spill432_42 = __invokedynamic432_87(21195, (4455100893918561649L ^ life1_3));
    moom.hU __stackOp432_89_0 = __sourceUninitializedNEW432_88();
    spill432_43 = __stackOp432_89_0;
    __explicitNewInit432_94(__stackOp432_89_0, __invokedynamic432_90(26250, (2128113024632369642L ^ life1_3)), __call432_91("createWorld.customize.custom.useWaterLakes", new java.lang.Object[0]), true, __fieldRead432_93(__fieldRead432_92(receiver)));
    (spill432_41)[spill432_42] = spill432_43;
    moom.hS[] __stackOp432_95_0 = spill432_40;
    spill432_44 = __stackOp432_95_0;
    spill432_45 = __stackOp432_95_0;
    spill432_46 = __invokedynamic432_96(14320, (3326712406065012788L ^ life1_3));
    moom.hW __stackOp432_98_0 = __sourceUninitializedNEW432_97();
    spill432_47 = __stackOp432_98_0;
    __explicitNewInit432_103(__stackOp432_98_0, __invokedynamic432_99(7242, (4935960188111342398L ^ life1_3)), __call432_100("createWorld.customize.custom.waterLakeChance", new java.lang.Object[0]), true, receiver, 0x1.0p0f, 0x1.9p6f, ((float) __fieldRead432_102(__fieldRead432_101(receiver))));
    (spill432_45)[spill432_46] = spill432_47;
    moom.hS[] __stackOp432_104_0 = spill432_44;
    spill432_48 = __stackOp432_104_0;
    spill432_49 = __stackOp432_104_0;
    spill432_50 = __invokedynamic432_105(22108, (1533927503161196844L ^ life1_3));
    moom.hU __stackOp432_107_0 = __sourceUninitializedNEW432_106();
    spill432_51 = __stackOp432_107_0;
    __explicitNewInit432_112(__stackOp432_107_0, __invokedynamic432_108(5538, (2911778610665734834L ^ life1_3)), __call432_109("createWorld.customize.custom.useLavaLakes", new java.lang.Object[0]), true, __fieldRead432_111(__fieldRead432_110(receiver)));
    (spill432_49)[spill432_50] = spill432_51;
    moom.hS[] __stackOp432_113_0 = spill432_48;
    spill432_52 = __stackOp432_113_0;
    spill432_53 = __stackOp432_113_0;
    spill432_54 = __invokedynamic432_114(18271, (3910391027129159770L ^ life1_3));
    moom.hW __stackOp432_116_0 = __sourceUninitializedNEW432_115();
    spill432_55 = __stackOp432_116_0;
    __explicitNewInit432_121(__stackOp432_116_0, __invokedynamic432_117(3420, (3607947233064966879L ^ life1_3)), __call432_118("createWorld.customize.custom.lavaLakeChance", new java.lang.Object[0]), true, receiver, 0x1.4p3f, 0x1.9p6f, ((float) __fieldRead432_120(__fieldRead432_119(receiver))));
    (spill432_53)[spill432_54] = spill432_55;
    moom.hS[] __stackOp432_122_0 = spill432_52;
    spill432_56 = __stackOp432_122_0;
    spill432_57 = __stackOp432_122_0;
    spill432_58 = __invokedynamic432_123(26363, (4841953405124751868L ^ life1_3));
    moom.hU __stackOp432_125_0 = __sourceUninitializedNEW432_124();
    spill432_59 = __stackOp432_125_0;
    __explicitNewInit432_130(__stackOp432_125_0, __invokedynamic432_126(30269, (5568588578110480702L ^ life1_3)), __call432_127("createWorld.customize.custom.useLavaOceans", new java.lang.Object[0]), true, __fieldRead432_129(__fieldRead432_128(receiver)));
    (spill432_57)[spill432_58] = spill432_59;
    moom.hS[] __stackOp432_131_0 = spill432_56;
    spill432_60 = __stackOp432_131_0;
    spill432_61 = __stackOp432_131_0;
    spill432_62 = __invokedynamic432_132(24567, (7733443032838506615L ^ life1_3));
    moom.hW __stackOp432_134_0 = __sourceUninitializedNEW432_133();
    spill432_63 = __stackOp432_134_0;
    __explicitNewInit432_139(__stackOp432_134_0, __invokedynamic432_135(17404, (2027029661186397226L ^ life1_3)), __call432_136("createWorld.customize.custom.fixedBiome", new java.lang.Object[0]), true, receiver, -0x1.0p0f, 0x1.28p5f, ((float) __fieldRead432_138(__fieldRead432_137(receiver))));
    (spill432_61)[spill432_62] = spill432_63;
    moom.hS[] __stackOp432_140_0 = spill432_60;
    spill432_64 = __stackOp432_140_0;
    spill432_65 = __stackOp432_140_0;
    spill432_66 = __invokedynamic432_141(30287, (7901512834609586591L ^ life1_3));
    moom.hW __stackOp432_143_0 = __sourceUninitializedNEW432_142();
    spill432_67 = __stackOp432_143_0;
    __explicitNewInit432_148(__stackOp432_143_0, __invokedynamic432_144(22136, (7156641664226754953L ^ life1_3)), __call432_145("createWorld.customize.custom.biomeSize", new java.lang.Object[0]), true, receiver, 0x1.0p0f, 0x1.0p3f, ((float) __fieldRead432_147(__fieldRead432_146(receiver))));
    (spill432_65)[spill432_66] = spill432_67;
    moom.hS[] __stackOp432_149_0 = spill432_64;
    spill432_68 = __stackOp432_149_0;
    spill432_69 = __stackOp432_149_0;
    spill432_70 = __invokedynamic432_150(10416, (6155330635420172182L ^ life1_3));
    moom.hW __stackOp432_152_0 = __sourceUninitializedNEW432_151();
    spill432_71 = __stackOp432_152_0;
    __explicitNewInit432_157(__stackOp432_152_0, __invokedynamic432_153(23097, (1685164383296425346L ^ life1_3)), __call432_154("createWorld.customize.custom.riverSize", new java.lang.Object[0]), true, receiver, 0x1.0p0f, 0x1.4p2f, ((float) __fieldRead432_156(__fieldRead432_155(receiver))));
    (spill432_69)[spill432_70] = spill432_71;
    life3_428 = spill432_68;
    moom.hS[] __stackOp432_159_0 = new moom.hS[__invokedynamic432_158(17268, (7578085039453639759L ^ life1_3))];
    spill432_72 = __stackOp432_159_0;
    spill432_73 = __stackOp432_159_0;
    spill432_74 = 0;
    moom.hV __stackOp432_161_0 = __sourceUninitializedNEW432_160();
    spill432_75 = __stackOp432_161_0;
    __explicitNewInit432_164(__stackOp432_161_0, __invokedynamic432_162(23939, (4282707131046988464L ^ life1_3)), __call432_163("tile.dirt.name", new java.lang.Object[0]), false);
    (spill432_73)[spill432_74] = spill432_75;
    moom.hS[] __stackOp432_165_0 = spill432_72;
    spill432_76 = __stackOp432_165_0;
    (__stackOp432_165_0)[1] = null;
    moom.hS[] __stackOp432_166_0 = spill432_76;
    spill432_77 = __stackOp432_166_0;
    spill432_78 = __stackOp432_166_0;
    spill432_79 = 2;
    moom.hW __stackOp432_168_0 = __sourceUninitializedNEW432_167();
    spill432_80 = __stackOp432_168_0;
    __explicitNewInit432_173(__stackOp432_168_0, __invokedynamic432_169(9404, (3858805562804827014L ^ life1_3)), __call432_170("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_172(__fieldRead432_171(receiver))));
    (spill432_78)[spill432_79] = spill432_80;
    moom.hS[] __stackOp432_174_0 = spill432_77;
    spill432_81 = __stackOp432_174_0;
    spill432_82 = __stackOp432_174_0;
    spill432_83 = 3;
    moom.hW __stackOp432_176_0 = __sourceUninitializedNEW432_175();
    spill432_84 = __stackOp432_176_0;
    __explicitNewInit432_181(__stackOp432_176_0, __invokedynamic432_177(17920, (8649879134959538590L ^ life1_3)), __call432_178("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_180(__fieldRead432_179(receiver))));
    (spill432_82)[spill432_83] = spill432_84;
    moom.hS[] __stackOp432_182_0 = spill432_81;
    spill432_85 = __stackOp432_182_0;
    spill432_86 = __stackOp432_182_0;
    spill432_87 = 4;
    moom.hW __stackOp432_184_0 = __sourceUninitializedNEW432_183();
    spill432_88 = __stackOp432_184_0;
    __explicitNewInit432_189(__stackOp432_184_0, __invokedynamic432_185(18221, (2760324745618231356L ^ life1_3)), __call432_186("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_188(__fieldRead432_187(receiver))));
    (spill432_86)[spill432_87] = spill432_88;
    moom.hS[] __stackOp432_190_0 = spill432_85;
    spill432_89 = __stackOp432_190_0;
    spill432_90 = __stackOp432_190_0;
    spill432_91 = 5;
    moom.hW __stackOp432_192_0 = __sourceUninitializedNEW432_191();
    spill432_92 = __stackOp432_192_0;
    __explicitNewInit432_197(__stackOp432_192_0, __invokedynamic432_193(21079, (473858500788028842L ^ life1_3)), __call432_194("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_196(__fieldRead432_195(receiver))));
    (spill432_90)[spill432_91] = spill432_92;
    moom.hS[] __stackOp432_198_0 = spill432_89;
    spill432_93 = __stackOp432_198_0;
    spill432_94 = __stackOp432_198_0;
    spill432_95 = __invokedynamic432_199(28219, (2193052429329906035L ^ life1_3));
    moom.hV __stackOp432_201_0 = __sourceUninitializedNEW432_200();
    spill432_96 = __stackOp432_201_0;
    __explicitNewInit432_204(__stackOp432_201_0, __invokedynamic432_202(27179, (1850044977306975609L ^ life1_3)), __call432_203("tile.gravel.name", new java.lang.Object[0]), false);
    (spill432_94)[spill432_95] = spill432_96;
    moom.hS[] __stackOp432_205_0 = spill432_93;
    spill432_97 = __stackOp432_205_0;
    (__stackOp432_205_0)[__invokedynamic432_206(3232, (4157250188239395789L ^ life1_3))] = null;
    moom.hS[] __stackOp432_207_0 = spill432_97;
    spill432_98 = __stackOp432_207_0;
    spill432_99 = __stackOp432_207_0;
    spill432_100 = __invokedynamic432_208(25084, (5185980224604681974L ^ life1_3));
    moom.hW __stackOp432_210_0 = __sourceUninitializedNEW432_209();
    spill432_101 = __stackOp432_210_0;
    __explicitNewInit432_215(__stackOp432_210_0, __invokedynamic432_211(544, (1454574343779472773L ^ life1_3)), __call432_212("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_214(__fieldRead432_213(receiver))));
    (spill432_99)[spill432_100] = spill432_101;
    moom.hS[] __stackOp432_216_0 = spill432_98;
    spill432_102 = __stackOp432_216_0;
    spill432_103 = __stackOp432_216_0;
    spill432_104 = __invokedynamic432_217(17971, (5056386523343917359L ^ life1_3));
    moom.hW __stackOp432_219_0 = __sourceUninitializedNEW432_218();
    spill432_105 = __stackOp432_219_0;
    __explicitNewInit432_224(__stackOp432_219_0, __invokedynamic432_220(2252, (3484105422370201555L ^ life1_3)), __call432_221("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_223(__fieldRead432_222(receiver))));
    (spill432_103)[spill432_104] = spill432_105;
    moom.hS[] __stackOp432_225_0 = spill432_102;
    spill432_106 = __stackOp432_225_0;
    spill432_107 = __stackOp432_225_0;
    spill432_108 = __invokedynamic432_226(9679, (3832040168035611190L ^ life1_3));
    moom.hW __stackOp432_228_0 = __sourceUninitializedNEW432_227();
    spill432_109 = __stackOp432_228_0;
    __explicitNewInit432_233(__stackOp432_228_0, __invokedynamic432_229(7704, (2663220434080844065L ^ life1_3)), __call432_230("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_232(__fieldRead432_231(receiver))));
    (spill432_107)[spill432_108] = spill432_109;
    moom.hS[] __stackOp432_234_0 = spill432_106;
    spill432_110 = __stackOp432_234_0;
    spill432_111 = __stackOp432_234_0;
    spill432_112 = __invokedynamic432_235(4753, (8090378945286718914L ^ life1_3));
    moom.hW __stackOp432_237_0 = __sourceUninitializedNEW432_236();
    spill432_113 = __stackOp432_237_0;
    __explicitNewInit432_242(__stackOp432_237_0, __invokedynamic432_238(24672, (5351919559880455964L ^ life1_3)), __call432_239("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_241(__fieldRead432_240(receiver))));
    (spill432_111)[spill432_112] = spill432_113;
    moom.hS[] __stackOp432_243_0 = spill432_110;
    spill432_114 = __stackOp432_243_0;
    spill432_115 = __stackOp432_243_0;
    spill432_116 = __invokedynamic432_244(22108, (1533927503161196844L ^ life1_3));
    moom.hV __stackOp432_246_0 = __sourceUninitializedNEW432_245();
    spill432_117 = __stackOp432_246_0;
    __explicitNewInit432_249(__stackOp432_246_0, __invokedynamic432_247(18588, (6136297731668025333L ^ life1_3)), __call432_248("tile.stone.granite.name", new java.lang.Object[0]), false);
    (spill432_115)[spill432_116] = spill432_117;
    moom.hS[] __stackOp432_250_0 = spill432_114;
    spill432_118 = __stackOp432_250_0;
    (__stackOp432_250_0)[__invokedynamic432_251(13000, (6514366979856065808L ^ life1_3))] = null;
    moom.hS[] __stackOp432_252_0 = spill432_118;
    spill432_119 = __stackOp432_252_0;
    spill432_120 = __stackOp432_252_0;
    spill432_121 = __invokedynamic432_253(10664, (6940984010893197031L ^ life1_3));
    moom.hW __stackOp432_255_0 = __sourceUninitializedNEW432_254();
    spill432_122 = __stackOp432_255_0;
    __explicitNewInit432_260(__stackOp432_255_0, __invokedynamic432_256(24888, (1848112139808028277L ^ life1_3)), __call432_257("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_259(__fieldRead432_258(receiver))));
    (spill432_120)[spill432_121] = spill432_122;
    moom.hS[] __stackOp432_261_0 = spill432_119;
    spill432_123 = __stackOp432_261_0;
    spill432_124 = __stackOp432_261_0;
    spill432_125 = __invokedynamic432_262(26600, (7358228314699739349L ^ life1_3));
    moom.hW __stackOp432_264_0 = __sourceUninitializedNEW432_263();
    spill432_126 = __stackOp432_264_0;
    __explicitNewInit432_269(__stackOp432_264_0, __invokedynamic432_265(17807, (2395670541743067824L ^ life1_3)), __call432_266("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_268(__fieldRead432_267(receiver))));
    (spill432_124)[spill432_125] = spill432_126;
    moom.hS[] __stackOp432_270_0 = spill432_123;
    spill432_127 = __stackOp432_270_0;
    spill432_128 = __stackOp432_270_0;
    spill432_129 = __invokedynamic432_271(20808, (8737053167903573647L ^ life1_3));
    moom.hW __stackOp432_273_0 = __sourceUninitializedNEW432_272();
    spill432_130 = __stackOp432_273_0;
    __explicitNewInit432_278(__stackOp432_273_0, __invokedynamic432_274(10934, (8359605847977262338L ^ life1_3)), __call432_275("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_277(__fieldRead432_276(receiver))));
    (spill432_128)[spill432_129] = spill432_130;
    moom.hS[] __stackOp432_279_0 = spill432_127;
    spill432_131 = __stackOp432_279_0;
    spill432_132 = __stackOp432_279_0;
    spill432_133 = __invokedynamic432_280(7241, (5101971358965812027L ^ life1_3));
    moom.hW __stackOp432_282_0 = __sourceUninitializedNEW432_281();
    spill432_134 = __stackOp432_282_0;
    __explicitNewInit432_287(__stackOp432_282_0, __invokedynamic432_283(14219, (1101287241820004531L ^ life1_3)), __call432_284("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_286(__fieldRead432_285(receiver))));
    (spill432_132)[spill432_133] = spill432_134;
    moom.hS[] __stackOp432_288_0 = spill432_131;
    spill432_135 = __stackOp432_288_0;
    spill432_136 = __stackOp432_288_0;
    spill432_137 = __invokedynamic432_289(7140, (5829646685629336825L ^ life1_3));
    moom.hV __stackOp432_291_0 = __sourceUninitializedNEW432_290();
    spill432_138 = __stackOp432_291_0;
    __explicitNewInit432_294(__stackOp432_291_0, __invokedynamic432_292(27937, (7208659692274727544L ^ life1_3)), __call432_293("tile.stone.diorite.name", new java.lang.Object[0]), false);
    (spill432_136)[spill432_137] = spill432_138;
    moom.hS[] __stackOp432_295_0 = spill432_135;
    spill432_139 = __stackOp432_295_0;
    (__stackOp432_295_0)[__invokedynamic432_296(18090, (5910291039426285882L ^ life1_3))] = null;
    moom.hS[] __stackOp432_297_0 = spill432_139;
    spill432_140 = __stackOp432_297_0;
    spill432_141 = __stackOp432_297_0;
    spill432_142 = __invokedynamic432_298(20799, (3297512927749179050L ^ life1_3));
    moom.hW __stackOp432_300_0 = __sourceUninitializedNEW432_299();
    spill432_143 = __stackOp432_300_0;
    __explicitNewInit432_305(__stackOp432_300_0, __invokedynamic432_301(3380, (863672769478384162L ^ life1_3)), __call432_302("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_304(__fieldRead432_303(receiver))));
    (spill432_141)[spill432_142] = spill432_143;
    moom.hS[] __stackOp432_306_0 = spill432_140;
    spill432_144 = __stackOp432_306_0;
    spill432_145 = __stackOp432_306_0;
    spill432_146 = __invokedynamic432_307(31477, (1725312211327790358L ^ life1_3));
    moom.hW __stackOp432_309_0 = __sourceUninitializedNEW432_308();
    spill432_147 = __stackOp432_309_0;
    __explicitNewInit432_314(__stackOp432_309_0, __invokedynamic432_310(12872, (6240911539987793L ^ life1_3)), __call432_311("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_313(__fieldRead432_312(receiver))));
    (spill432_145)[spill432_146] = spill432_147;
    moom.hS[] __stackOp432_315_0 = spill432_144;
    spill432_148 = __stackOp432_315_0;
    spill432_149 = __stackOp432_315_0;
    spill432_150 = __invokedynamic432_316(1211, (1761316948241175310L ^ life1_3));
    moom.hW __stackOp432_318_0 = __sourceUninitializedNEW432_317();
    spill432_151 = __stackOp432_318_0;
    __explicitNewInit432_323(__stackOp432_318_0, __invokedynamic432_319(3854, (1295789709067802841L ^ life1_3)), __call432_320("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_322(__fieldRead432_321(receiver))));
    (spill432_149)[spill432_150] = spill432_151;
    moom.hS[] __stackOp432_324_0 = spill432_148;
    spill432_152 = __stackOp432_324_0;
    spill432_153 = __stackOp432_324_0;
    spill432_154 = __invokedynamic432_325(12311, (220900357985036123L ^ life1_3));
    moom.hW __stackOp432_327_0 = __sourceUninitializedNEW432_326();
    spill432_155 = __stackOp432_327_0;
    __explicitNewInit432_332(__stackOp432_327_0, __invokedynamic432_328(5845, (4349680192090423783L ^ life1_3)), __call432_329("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_331(__fieldRead432_330(receiver))));
    (spill432_153)[spill432_154] = spill432_155;
    moom.hS[] __stackOp432_333_0 = spill432_152;
    spill432_156 = __stackOp432_333_0;
    spill432_157 = __stackOp432_333_0;
    spill432_158 = __invokedynamic432_334(5735, (315652958333682107L ^ life1_3));
    moom.hV __stackOp432_336_0 = __sourceUninitializedNEW432_335();
    spill432_159 = __stackOp432_336_0;
    __explicitNewInit432_339(__stackOp432_336_0, __invokedynamic432_337(9311, (7185649027254776597L ^ life1_3)), __call432_338("tile.stone.andesite.name", new java.lang.Object[0]), false);
    (spill432_157)[spill432_158] = spill432_159;
    moom.hS[] __stackOp432_340_0 = spill432_156;
    spill432_160 = __stackOp432_340_0;
    (__stackOp432_340_0)[__invokedynamic432_341(11860, (7253988606994872654L ^ life1_3))] = null;
    moom.hS[] __stackOp432_342_0 = spill432_160;
    spill432_161 = __stackOp432_342_0;
    spill432_162 = __stackOp432_342_0;
    spill432_163 = __invokedynamic432_343(7796, (5453899491458992421L ^ life1_3));
    moom.hW __stackOp432_345_0 = __sourceUninitializedNEW432_344();
    spill432_164 = __stackOp432_345_0;
    __explicitNewInit432_350(__stackOp432_345_0, __invokedynamic432_346(32246, (5714792861513624145L ^ life1_3)), __call432_347("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_349(__fieldRead432_348(receiver))));
    (spill432_162)[spill432_163] = spill432_164;
    moom.hS[] __stackOp432_351_0 = spill432_161;
    spill432_165 = __stackOp432_351_0;
    spill432_166 = __stackOp432_351_0;
    spill432_167 = __invokedynamic432_352(12940, (6864872812034319681L ^ life1_3));
    moom.hW __stackOp432_354_0 = __sourceUninitializedNEW432_353();
    spill432_168 = __stackOp432_354_0;
    __explicitNewInit432_359(__stackOp432_354_0, __invokedynamic432_355(9985, (6220560592577458230L ^ life1_3)), __call432_356("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_358(__fieldRead432_357(receiver))));
    (spill432_166)[spill432_167] = spill432_168;
    moom.hS[] __stackOp432_360_0 = spill432_165;
    spill432_169 = __stackOp432_360_0;
    spill432_170 = __stackOp432_360_0;
    spill432_171 = __invokedynamic432_361(12935, (3284875803406460238L ^ life1_3));
    moom.hW __stackOp432_363_0 = __sourceUninitializedNEW432_362();
    spill432_172 = __stackOp432_363_0;
    __explicitNewInit432_368(__stackOp432_363_0, __invokedynamic432_364(26887, (6949177103918120562L ^ life1_3)), __call432_365("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_367(__fieldRead432_366(receiver))));
    (spill432_170)[spill432_171] = spill432_172;
    moom.hS[] __stackOp432_369_0 = spill432_169;
    spill432_173 = __stackOp432_369_0;
    spill432_174 = __stackOp432_369_0;
    spill432_175 = __invokedynamic432_370(30965, (3230318736541036431L ^ life1_3));
    moom.hW __stackOp432_372_0 = __sourceUninitializedNEW432_371();
    spill432_176 = __stackOp432_372_0;
    __explicitNewInit432_377(__stackOp432_372_0, __invokedynamic432_373(29036, (7878627734665111194L ^ life1_3)), __call432_374("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_376(__fieldRead432_375(receiver))));
    (spill432_174)[spill432_175] = spill432_176;
    moom.hS[] __stackOp432_378_0 = spill432_173;
    spill432_177 = __stackOp432_378_0;
    spill432_178 = __stackOp432_378_0;
    spill432_179 = __invokedynamic432_379(16737, (3884811409219557018L ^ life1_3));
    moom.hV __stackOp432_381_0 = __sourceUninitializedNEW432_380();
    spill432_180 = __stackOp432_381_0;
    __explicitNewInit432_384(__stackOp432_381_0, __invokedynamic432_382(23917, (4808318205562456786L ^ life1_3)), __call432_383("tile.oreCoal.name", new java.lang.Object[0]), false);
    (spill432_178)[spill432_179] = spill432_180;
    moom.hS[] __stackOp432_385_0 = spill432_177;
    spill432_181 = __stackOp432_385_0;
    (__stackOp432_385_0)[__invokedynamic432_386(20203, (5740559944790088054L ^ life1_3))] = null;
    moom.hS[] __stackOp432_387_0 = spill432_181;
    spill432_182 = __stackOp432_387_0;
    spill432_183 = __stackOp432_387_0;
    spill432_184 = __invokedynamic432_388(14654, (5199921529656798768L ^ life1_3));
    moom.hW __stackOp432_390_0 = __sourceUninitializedNEW432_389();
    spill432_185 = __stackOp432_390_0;
    __explicitNewInit432_395(__stackOp432_390_0, __invokedynamic432_391(15493, (8013744730258074485L ^ life1_3)), __call432_392("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_394(__fieldRead432_393(receiver))));
    (spill432_183)[spill432_184] = spill432_185;
    moom.hS[] __stackOp432_396_0 = spill432_182;
    spill432_186 = __stackOp432_396_0;
    spill432_187 = __stackOp432_396_0;
    spill432_188 = __invokedynamic432_397(24060, (4642837210330172065L ^ life1_3));
    moom.hW __stackOp432_399_0 = __sourceUninitializedNEW432_398();
    spill432_189 = __stackOp432_399_0;
    __explicitNewInit432_404(__stackOp432_399_0, __invokedynamic432_400(14506, (6478961658382512040L ^ life1_3)), __call432_401("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_403(__fieldRead432_402(receiver))));
    (spill432_187)[spill432_188] = spill432_189;
    moom.hS[] __stackOp432_405_0 = spill432_186;
    spill432_190 = __stackOp432_405_0;
    spill432_191 = __stackOp432_405_0;
    spill432_192 = __invokedynamic432_406(6799, (8975691718968921421L ^ life1_3));
    moom.hW __stackOp432_408_0 = __sourceUninitializedNEW432_407();
    spill432_193 = __stackOp432_408_0;
    __explicitNewInit432_413(__stackOp432_408_0, __invokedynamic432_409(19037, (5703712299108605333L ^ life1_3)), __call432_410("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_412(__fieldRead432_411(receiver))));
    (spill432_191)[spill432_192] = spill432_193;
    moom.hS[] __stackOp432_414_0 = spill432_190;
    spill432_194 = __stackOp432_414_0;
    spill432_195 = __stackOp432_414_0;
    spill432_196 = __invokedynamic432_415(6882, (8007730805882244513L ^ life1_3));
    moom.hW __stackOp432_417_0 = __sourceUninitializedNEW432_416();
    spill432_197 = __stackOp432_417_0;
    __explicitNewInit432_422(__stackOp432_417_0, __invokedynamic432_418(19047, (2476559508279565752L ^ life1_3)), __call432_419("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_421(__fieldRead432_420(receiver))));
    (spill432_195)[spill432_196] = spill432_197;
    moom.hS[] __stackOp432_423_0 = spill432_194;
    spill432_198 = __stackOp432_423_0;
    spill432_199 = __stackOp432_423_0;
    spill432_200 = __invokedynamic432_424(5699, (3072536412419997971L ^ life1_3));
    moom.hV __stackOp432_426_0 = __sourceUninitializedNEW432_425();
    spill432_201 = __stackOp432_426_0;
    __explicitNewInit432_429(__stackOp432_426_0, __invokedynamic432_427(27830, (6336175821740194592L ^ life1_3)), __call432_428("tile.oreIron.name", new java.lang.Object[0]), false);
    (spill432_199)[spill432_200] = spill432_201;
    moom.hS[] __stackOp432_430_0 = spill432_198;
    spill432_202 = __stackOp432_430_0;
    (__stackOp432_430_0)[__invokedynamic432_431(1147, (6394480844415947568L ^ life1_3))] = null;
    moom.hS[] __stackOp432_432_0 = spill432_202;
    spill432_203 = __stackOp432_432_0;
    spill432_204 = __stackOp432_432_0;
    spill432_205 = __invokedynamic432_433(1, (962794109804992383L ^ life1_3));
    moom.hW __stackOp432_435_0 = __sourceUninitializedNEW432_434();
    spill432_206 = __stackOp432_435_0;
    __explicitNewInit432_440(__stackOp432_435_0, __invokedynamic432_436(18199, (2518084556559913114L ^ life1_3)), __call432_437("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_439(__fieldRead432_438(receiver))));
    (spill432_204)[spill432_205] = spill432_206;
    moom.hS[] __stackOp432_441_0 = spill432_203;
    spill432_207 = __stackOp432_441_0;
    spill432_208 = __stackOp432_441_0;
    spill432_209 = __invokedynamic432_442(26352, (3761307848777773541L ^ life1_3));
    moom.hW __stackOp432_444_0 = __sourceUninitializedNEW432_443();
    spill432_210 = __stackOp432_444_0;
    __explicitNewInit432_449(__stackOp432_444_0, __invokedynamic432_445(26069, (6469700040335602201L ^ life1_3)), __call432_446("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_448(__fieldRead432_447(receiver))));
    (spill432_208)[spill432_209] = spill432_210;
    moom.hS[] __stackOp432_450_0 = spill432_207;
    spill432_211 = __stackOp432_450_0;
    spill432_212 = __stackOp432_450_0;
    spill432_213 = __invokedynamic432_451(7317, (651717869374917613L ^ life1_3));
    moom.hW __stackOp432_453_0 = __sourceUninitializedNEW432_452();
    spill432_214 = __stackOp432_453_0;
    __explicitNewInit432_458(__stackOp432_453_0, __invokedynamic432_454(29290, (5684171258114417995L ^ life1_3)), __call432_455("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_457(__fieldRead432_456(receiver))));
    (spill432_212)[spill432_213] = spill432_214;
    moom.hS[] __stackOp432_459_0 = spill432_211;
    spill432_215 = __stackOp432_459_0;
    spill432_216 = __stackOp432_459_0;
    spill432_217 = __invokedynamic432_460(5117, (5904157159576224879L ^ life1_3));
    moom.hW __stackOp432_462_0 = __sourceUninitializedNEW432_461();
    spill432_218 = __stackOp432_462_0;
    __explicitNewInit432_467(__stackOp432_462_0, __invokedynamic432_463(22762, (1594025013502250922L ^ life1_3)), __call432_464("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_466(__fieldRead432_465(receiver))));
    (spill432_216)[spill432_217] = spill432_218;
    moom.hS[] __stackOp432_468_0 = spill432_215;
    spill432_219 = __stackOp432_468_0;
    spill432_220 = __stackOp432_468_0;
    spill432_221 = __invokedynamic432_469(25401, (8515799040049886356L ^ life1_3));
    moom.hV __stackOp432_471_0 = __sourceUninitializedNEW432_470();
    spill432_222 = __stackOp432_471_0;
    __explicitNewInit432_474(__stackOp432_471_0, __invokedynamic432_472(28461, (4282078308868929749L ^ life1_3)), __call432_473("tile.oreGold.name", new java.lang.Object[0]), false);
    (spill432_220)[spill432_221] = spill432_222;
    moom.hS[] __stackOp432_475_0 = spill432_219;
    spill432_223 = __stackOp432_475_0;
    (__stackOp432_475_0)[__invokedynamic432_476(2319, (1680229780823006921L ^ life1_3))] = null;
    moom.hS[] __stackOp432_477_0 = spill432_223;
    spill432_224 = __stackOp432_477_0;
    spill432_225 = __stackOp432_477_0;
    spill432_226 = __invokedynamic432_478(24680, (9812556638304233L ^ life1_3));
    moom.hW __stackOp432_480_0 = __sourceUninitializedNEW432_479();
    spill432_227 = __stackOp432_480_0;
    __explicitNewInit432_485(__stackOp432_480_0, __invokedynamic432_481(1876, (4225749872218263668L ^ life1_3)), __call432_482("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_484(__fieldRead432_483(receiver))));
    (spill432_225)[spill432_226] = spill432_227;
    moom.hS[] __stackOp432_486_0 = spill432_224;
    spill432_228 = __stackOp432_486_0;
    spill432_229 = __stackOp432_486_0;
    spill432_230 = __invokedynamic432_487(7119, (4588660691841404023L ^ life1_3));
    moom.hW __stackOp432_489_0 = __sourceUninitializedNEW432_488();
    spill432_231 = __stackOp432_489_0;
    __explicitNewInit432_494(__stackOp432_489_0, __invokedynamic432_490(8977, (3247858470772733067L ^ life1_3)), __call432_491("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_493(__fieldRead432_492(receiver))));
    (spill432_229)[spill432_230] = spill432_231;
    moom.hS[] __stackOp432_495_0 = spill432_228;
    spill432_232 = __stackOp432_495_0;
    spill432_233 = __stackOp432_495_0;
    spill432_234 = __invokedynamic432_496(8183, (1635370068051544110L ^ life1_3));
    moom.hW __stackOp432_498_0 = __sourceUninitializedNEW432_497();
    spill432_235 = __stackOp432_498_0;
    __explicitNewInit432_503(__stackOp432_498_0, __invokedynamic432_499(21434, (5601236292717020413L ^ life1_3)), __call432_500("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_502(__fieldRead432_501(receiver))));
    (spill432_233)[spill432_234] = spill432_235;
    moom.hS[] __stackOp432_504_0 = spill432_232;
    spill432_236 = __stackOp432_504_0;
    spill432_237 = __stackOp432_504_0;
    spill432_238 = __invokedynamic432_505(14020, (1016013073209909537L ^ life1_3));
    moom.hW __stackOp432_507_0 = __sourceUninitializedNEW432_506();
    spill432_239 = __stackOp432_507_0;
    __explicitNewInit432_512(__stackOp432_507_0, __invokedynamic432_508(5252, (3913385569661076451L ^ life1_3)), __call432_509("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_511(__fieldRead432_510(receiver))));
    (spill432_237)[spill432_238] = spill432_239;
    moom.hS[] __stackOp432_513_0 = spill432_236;
    spill432_240 = __stackOp432_513_0;
    spill432_241 = __stackOp432_513_0;
    spill432_242 = __invokedynamic432_514(3662, (5084381168794687965L ^ life1_3));
    moom.hV __stackOp432_516_0 = __sourceUninitializedNEW432_515();
    spill432_243 = __stackOp432_516_0;
    __explicitNewInit432_519(__stackOp432_516_0, __invokedynamic432_517(30822, (6414317118030884823L ^ life1_3)), __call432_518("tile.oreRedstone.name", new java.lang.Object[0]), false);
    (spill432_241)[spill432_242] = spill432_243;
    moom.hS[] __stackOp432_520_0 = spill432_240;
    spill432_244 = __stackOp432_520_0;
    (__stackOp432_520_0)[__invokedynamic432_521(27204, (3980048742843333957L ^ life1_3))] = null;
    moom.hS[] __stackOp432_522_0 = spill432_244;
    spill432_245 = __stackOp432_522_0;
    spill432_246 = __stackOp432_522_0;
    spill432_247 = __invokedynamic432_523(18040, (7634726653772960196L ^ life1_3));
    moom.hW __stackOp432_525_0 = __sourceUninitializedNEW432_524();
    spill432_248 = __stackOp432_525_0;
    __explicitNewInit432_530(__stackOp432_525_0, __invokedynamic432_526(13116, (4242024972317910237L ^ life1_3)), __call432_527("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_529(__fieldRead432_528(receiver))));
    (spill432_246)[spill432_247] = spill432_248;
    moom.hS[] __stackOp432_531_0 = spill432_245;
    spill432_249 = __stackOp432_531_0;
    spill432_250 = __stackOp432_531_0;
    spill432_251 = __invokedynamic432_532(10734, (3588136666630225414L ^ life1_3));
    moom.hW __stackOp432_534_0 = __sourceUninitializedNEW432_533();
    spill432_252 = __stackOp432_534_0;
    __explicitNewInit432_539(__stackOp432_534_0, __invokedynamic432_535(11040, (3091014580735671521L ^ life1_3)), __call432_536("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_538(__fieldRead432_537(receiver))));
    (spill432_250)[spill432_251] = spill432_252;
    moom.hS[] __stackOp432_540_0 = spill432_249;
    spill432_253 = __stackOp432_540_0;
    spill432_254 = __stackOp432_540_0;
    spill432_255 = __invokedynamic432_541(16774, (3929273223771625007L ^ life1_3));
    moom.hW __stackOp432_543_0 = __sourceUninitializedNEW432_542();
    spill432_256 = __stackOp432_543_0;
    __explicitNewInit432_548(__stackOp432_543_0, __invokedynamic432_544(13879, (3135728759917994344L ^ life1_3)), __call432_545("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_547(__fieldRead432_546(receiver))));
    (spill432_254)[spill432_255] = spill432_256;
    moom.hS[] __stackOp432_549_0 = spill432_253;
    spill432_257 = __stackOp432_549_0;
    spill432_258 = __stackOp432_549_0;
    spill432_259 = __invokedynamic432_550(12928, (6283549836625634569L ^ life1_3));
    moom.hW __stackOp432_552_0 = __sourceUninitializedNEW432_551();
    spill432_260 = __stackOp432_552_0;
    __explicitNewInit432_557(__stackOp432_552_0, __invokedynamic432_553(20057, (3127241737276430645L ^ life1_3)), __call432_554("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_556(__fieldRead432_555(receiver))));
    (spill432_258)[spill432_259] = spill432_260;
    moom.hS[] __stackOp432_558_0 = spill432_257;
    spill432_261 = __stackOp432_558_0;
    spill432_262 = __stackOp432_558_0;
    spill432_263 = __invokedynamic432_559(9387, (3445184242170688348L ^ life1_3));
    moom.hV __stackOp432_561_0 = __sourceUninitializedNEW432_560();
    spill432_264 = __stackOp432_561_0;
    __explicitNewInit432_564(__stackOp432_561_0, __invokedynamic432_562(12671, (6418873164946171465L ^ life1_3)), __call432_563("tile.oreDiamond.name", new java.lang.Object[0]), false);
    (spill432_262)[spill432_263] = spill432_264;
    moom.hS[] __stackOp432_565_0 = spill432_261;
    spill432_265 = __stackOp432_565_0;
    (__stackOp432_565_0)[__invokedynamic432_566(22037, (7934570142002086311L ^ life1_3))] = null;
    moom.hS[] __stackOp432_567_0 = spill432_265;
    spill432_266 = __stackOp432_567_0;
    spill432_267 = __stackOp432_567_0;
    spill432_268 = __invokedynamic432_568(26928, (7209320145274617404L ^ life1_3));
    moom.hW __stackOp432_570_0 = __sourceUninitializedNEW432_569();
    spill432_269 = __stackOp432_570_0;
    __explicitNewInit432_575(__stackOp432_570_0, __invokedynamic432_571(10779, (1164306900762000865L ^ life1_3)), __call432_572("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_574(__fieldRead432_573(receiver))));
    (spill432_267)[spill432_268] = spill432_269;
    moom.hS[] __stackOp432_576_0 = spill432_266;
    spill432_270 = __stackOp432_576_0;
    spill432_271 = __stackOp432_576_0;
    spill432_272 = __invokedynamic432_577(16475, (3013496263004985265L ^ life1_3));
    moom.hW __stackOp432_579_0 = __sourceUninitializedNEW432_578();
    spill432_273 = __stackOp432_579_0;
    __explicitNewInit432_584(__stackOp432_579_0, __invokedynamic432_580(3969, (8433097978643994872L ^ life1_3)), __call432_581("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_583(__fieldRead432_582(receiver))));
    (spill432_271)[spill432_272] = spill432_273;
    moom.hS[] __stackOp432_585_0 = spill432_270;
    spill432_274 = __stackOp432_585_0;
    spill432_275 = __stackOp432_585_0;
    spill432_276 = __invokedynamic432_586(11506, (7019222891457280967L ^ life1_3));
    moom.hW __stackOp432_588_0 = __sourceUninitializedNEW432_587();
    spill432_277 = __stackOp432_588_0;
    __explicitNewInit432_593(__stackOp432_588_0, __invokedynamic432_589(32045, (2701151761574177349L ^ life1_3)), __call432_590("createWorld.customize.custom.minHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_592(__fieldRead432_591(receiver))));
    (spill432_275)[spill432_276] = spill432_277;
    moom.hS[] __stackOp432_594_0 = spill432_274;
    spill432_278 = __stackOp432_594_0;
    spill432_279 = __stackOp432_594_0;
    spill432_280 = __invokedynamic432_595(13598, (5417118602167771828L ^ life1_3));
    moom.hW __stackOp432_597_0 = __sourceUninitializedNEW432_596();
    spill432_281 = __stackOp432_597_0;
    __explicitNewInit432_602(__stackOp432_597_0, __invokedynamic432_598(25997, (6903140959071678983L ^ life1_3)), __call432_599("createWorld.customize.custom.maxHeight", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_601(__fieldRead432_600(receiver))));
    (spill432_279)[spill432_280] = spill432_281;
    moom.hS[] __stackOp432_603_0 = spill432_278;
    spill432_282 = __stackOp432_603_0;
    spill432_283 = __stackOp432_603_0;
    spill432_284 = __invokedynamic432_604(24461, (6774709225074886906L ^ life1_3));
    moom.hV __stackOp432_606_0 = __sourceUninitializedNEW432_605();
    spill432_285 = __stackOp432_606_0;
    __explicitNewInit432_609(__stackOp432_606_0, __invokedynamic432_607(17303, (4854754906172921074L ^ life1_3)), __call432_608("tile.oreLapis.name", new java.lang.Object[0]), false);
    (spill432_283)[spill432_284] = spill432_285;
    moom.hS[] __stackOp432_610_0 = spill432_282;
    spill432_286 = __stackOp432_610_0;
    (__stackOp432_610_0)[__invokedynamic432_611(2748, (5054945598126087545L ^ life1_3))] = null;
    moom.hS[] __stackOp432_612_0 = spill432_286;
    spill432_287 = __stackOp432_612_0;
    spill432_288 = __stackOp432_612_0;
    spill432_289 = __invokedynamic432_613(18810, (8720536720839220900L ^ life1_3));
    moom.hW __stackOp432_615_0 = __sourceUninitializedNEW432_614();
    spill432_290 = __stackOp432_615_0;
    __explicitNewInit432_620(__stackOp432_615_0, __invokedynamic432_616(7715, (806868270787381546L ^ life1_3)), __call432_617("createWorld.customize.custom.size", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p5f, ((float) __fieldRead432_619(__fieldRead432_618(receiver))));
    (spill432_288)[spill432_289] = spill432_290;
    moom.hS[] __stackOp432_621_0 = spill432_287;
    spill432_291 = __stackOp432_621_0;
    spill432_292 = __stackOp432_621_0;
    spill432_293 = __invokedynamic432_622(14688, (8417183222270881427L ^ life1_3));
    moom.hW __stackOp432_624_0 = __sourceUninitializedNEW432_623();
    spill432_294 = __stackOp432_624_0;
    __explicitNewInit432_629(__stackOp432_624_0, __invokedynamic432_625(915, (8696054771489461336L ^ life1_3)), __call432_626("createWorld.customize.custom.count", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p5f, ((float) __fieldRead432_628(__fieldRead432_627(receiver))));
    (spill432_292)[spill432_293] = spill432_294;
    moom.hS[] __stackOp432_630_0 = spill432_291;
    spill432_295 = __stackOp432_630_0;
    spill432_296 = __stackOp432_630_0;
    spill432_297 = __invokedynamic432_631(4846, (7026845018795623827L ^ life1_3));
    moom.hW __stackOp432_633_0 = __sourceUninitializedNEW432_632();
    spill432_298 = __stackOp432_633_0;
    __explicitNewInit432_638(__stackOp432_633_0, __invokedynamic432_634(21191, (614243669679474017L ^ life1_3)), __call432_635("createWorld.customize.custom.center", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_637(__fieldRead432_636(receiver))));
    (spill432_296)[spill432_297] = spill432_298;
    moom.hS[] __stackOp432_639_0 = spill432_295;
    spill432_299 = __stackOp432_639_0;
    spill432_300 = __stackOp432_639_0;
    spill432_301 = __invokedynamic432_640(18156, (3345060441001169321L ^ life1_3));
    moom.hW __stackOp432_642_0 = __sourceUninitializedNEW432_641();
    spill432_302 = __stackOp432_642_0;
    __explicitNewInit432_647(__stackOp432_642_0, __invokedynamic432_643(31906, (8364491332206373860L ^ life1_3)), __call432_644("createWorld.customize.custom.spread", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.fep7f, ((float) __fieldRead432_646(__fieldRead432_645(receiver))));
    (spill432_300)[spill432_301] = spill432_302;
    life4_1907 = spill432_299;
    moom.hS[] __stackOp432_649_0 = new moom.hS[__invokedynamic432_648(20808, (8737053167903573647L ^ life1_3))];
    spill432_303 = __stackOp432_649_0;
    spill432_304 = __stackOp432_649_0;
    spill432_305 = 0;
    moom.hW __stackOp432_651_0 = __sourceUninitializedNEW432_650();
    spill432_306 = __stackOp432_651_0;
    __explicitNewInit432_656(__stackOp432_651_0, __invokedynamic432_652(10037, (1701281657105215636L ^ life1_3)), __call432_653("createWorld.customize.custom.mainNoiseScaleX", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.388p12f, __fieldRead432_655(__fieldRead432_654(receiver)));
    (spill432_304)[spill432_305] = spill432_306;
    moom.hS[] __stackOp432_657_0 = spill432_303;
    spill432_307 = __stackOp432_657_0;
    spill432_308 = __stackOp432_657_0;
    spill432_309 = 1;
    moom.hW __stackOp432_659_0 = __sourceUninitializedNEW432_658();
    spill432_310 = __stackOp432_659_0;
    __explicitNewInit432_664(__stackOp432_659_0, __invokedynamic432_660(969, (42080318944465944L ^ life1_3)), __call432_661("createWorld.customize.custom.mainNoiseScaleY", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.388p12f, __fieldRead432_663(__fieldRead432_662(receiver)));
    (spill432_308)[spill432_309] = spill432_310;
    moom.hS[] __stackOp432_665_0 = spill432_307;
    spill432_311 = __stackOp432_665_0;
    spill432_312 = __stackOp432_665_0;
    spill432_313 = 2;
    moom.hW __stackOp432_667_0 = __sourceUninitializedNEW432_666();
    spill432_314 = __stackOp432_667_0;
    __explicitNewInit432_672(__stackOp432_667_0, __invokedynamic432_668(24937, (6002468323084875361L ^ life1_3)), __call432_669("createWorld.customize.custom.mainNoiseScaleZ", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.388p12f, __fieldRead432_671(__fieldRead432_670(receiver)));
    (spill432_312)[spill432_313] = spill432_314;
    moom.hS[] __stackOp432_673_0 = spill432_311;
    spill432_315 = __stackOp432_673_0;
    spill432_316 = __stackOp432_673_0;
    spill432_317 = 3;
    moom.hW __stackOp432_675_0 = __sourceUninitializedNEW432_674();
    spill432_318 = __stackOp432_675_0;
    __explicitNewInit432_680(__stackOp432_675_0, __invokedynamic432_676(2883, (1512284978859039987L ^ life1_3)), __call432_677("createWorld.customize.custom.depthNoiseScaleX", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.f4p10f, __fieldRead432_679(__fieldRead432_678(receiver)));
    (spill432_316)[spill432_317] = spill432_318;
    moom.hS[] __stackOp432_681_0 = spill432_315;
    spill432_319 = __stackOp432_681_0;
    spill432_320 = __stackOp432_681_0;
    spill432_321 = 4;
    moom.hW __stackOp432_683_0 = __sourceUninitializedNEW432_682();
    spill432_322 = __stackOp432_683_0;
    __explicitNewInit432_688(__stackOp432_683_0, __invokedynamic432_684(32161, (7843081456263572218L ^ life1_3)), __call432_685("createWorld.customize.custom.depthNoiseScaleZ", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.f4p10f, __fieldRead432_687(__fieldRead432_686(receiver)));
    (spill432_320)[spill432_321] = spill432_322;
    moom.hS[] __stackOp432_689_0 = spill432_319;
    spill432_323 = __stackOp432_689_0;
    spill432_324 = __stackOp432_689_0;
    spill432_325 = 5;
    moom.hW __stackOp432_691_0 = __sourceUninitializedNEW432_690();
    spill432_326 = __stackOp432_691_0;
    __explicitNewInit432_696(__stackOp432_691_0, __invokedynamic432_692(12841, (1154186305005643183L ^ life1_3)), __call432_693("createWorld.customize.custom.depthNoiseScaleExponent", new java.lang.Object[0]), false, receiver, 0x1.47ae14p-7f, 0x1.4p4f, __fieldRead432_695(__fieldRead432_694(receiver)));
    (spill432_324)[spill432_325] = spill432_326;
    moom.hS[] __stackOp432_697_0 = spill432_323;
    spill432_327 = __stackOp432_697_0;
    spill432_328 = __stackOp432_697_0;
    spill432_329 = __invokedynamic432_698(28219, (2193052429329906035L ^ life1_3));
    moom.hW __stackOp432_700_0 = __sourceUninitializedNEW432_699();
    spill432_330 = __stackOp432_700_0;
    __explicitNewInit432_705(__stackOp432_700_0, __invokedynamic432_701(18928, (1413429625063644707L ^ life1_3)), __call432_702("createWorld.customize.custom.baseSize", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.9p4f, __fieldRead432_704(__fieldRead432_703(receiver)));
    (spill432_328)[spill432_329] = spill432_330;
    moom.hS[] __stackOp432_706_0 = spill432_327;
    spill432_331 = __stackOp432_706_0;
    spill432_332 = __stackOp432_706_0;
    spill432_333 = __invokedynamic432_707(3232, (4157250188239395789L ^ life1_3));
    moom.hW __stackOp432_709_0 = __sourceUninitializedNEW432_708();
    spill432_334 = __stackOp432_709_0;
    __explicitNewInit432_714(__stackOp432_709_0, __invokedynamic432_710(6834, (7177171589595844020L ^ life1_3)), __call432_711("createWorld.customize.custom.coordinateScale", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.77p12f, __fieldRead432_713(__fieldRead432_712(receiver)));
    (spill432_332)[spill432_333] = spill432_334;
    moom.hS[] __stackOp432_715_0 = spill432_331;
    spill432_335 = __stackOp432_715_0;
    spill432_336 = __stackOp432_715_0;
    spill432_337 = __invokedynamic432_716(25084, (5185980224604681974L ^ life1_3));
    moom.hW __stackOp432_718_0 = __sourceUninitializedNEW432_717();
    spill432_338 = __stackOp432_718_0;
    __explicitNewInit432_723(__stackOp432_718_0, __invokedynamic432_719(9386, (1087640154554397449L ^ life1_3)), __call432_720("createWorld.customize.custom.heightScale", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.77p12f, __fieldRead432_722(__fieldRead432_721(receiver)));
    (spill432_336)[spill432_337] = spill432_338;
    moom.hS[] __stackOp432_724_0 = spill432_335;
    spill432_339 = __stackOp432_724_0;
    spill432_340 = __stackOp432_724_0;
    spill432_341 = __invokedynamic432_725(17971, (5056386523343917359L ^ life1_3));
    moom.hW __stackOp432_727_0 = __sourceUninitializedNEW432_726();
    spill432_342 = __stackOp432_727_0;
    __explicitNewInit432_732(__stackOp432_727_0, __invokedynamic432_728(30651, (3404314896069730554L ^ life1_3)), __call432_729("createWorld.customize.custom.stretchY", new java.lang.Object[0]), false, receiver, 0x1.47ae14p-7f, 0x1.9p5f, __fieldRead432_731(__fieldRead432_730(receiver)));
    (spill432_340)[spill432_341] = spill432_342;
    moom.hS[] __stackOp432_733_0 = spill432_339;
    spill432_343 = __stackOp432_733_0;
    spill432_344 = __stackOp432_733_0;
    spill432_345 = __invokedynamic432_734(9679, (3832040168035611190L ^ life1_3));
    moom.hW __stackOp432_736_0 = __sourceUninitializedNEW432_735();
    spill432_346 = __stackOp432_736_0;
    __explicitNewInit432_741(__stackOp432_736_0, __invokedynamic432_737(32093, (6369007529007032918L ^ life1_3)), __call432_738("createWorld.customize.custom.upperLimitScale", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.388p12f, __fieldRead432_740(__fieldRead432_739(receiver)));
    (spill432_344)[spill432_345] = spill432_346;
    moom.hS[] __stackOp432_742_0 = spill432_343;
    spill432_347 = __stackOp432_742_0;
    spill432_348 = __stackOp432_742_0;
    spill432_349 = __invokedynamic432_743(4753, (8090378945286718914L ^ life1_3));
    moom.hW __stackOp432_745_0 = __sourceUninitializedNEW432_744();
    spill432_350 = __stackOp432_745_0;
    __explicitNewInit432_750(__stackOp432_745_0, __invokedynamic432_746(4236, (6566411968813090599L ^ life1_3)), __call432_747("createWorld.customize.custom.lowerLimitScale", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.388p12f, __fieldRead432_749(__fieldRead432_748(receiver)));
    (spill432_348)[spill432_349] = spill432_350;
    moom.hS[] __stackOp432_751_0 = spill432_347;
    spill432_351 = __stackOp432_751_0;
    spill432_352 = __stackOp432_751_0;
    spill432_353 = __invokedynamic432_752(22108, (1533927503161196844L ^ life1_3));
    moom.hW __stackOp432_754_0 = __sourceUninitializedNEW432_753();
    spill432_354 = __stackOp432_754_0;
    __explicitNewInit432_759(__stackOp432_754_0, __invokedynamic432_755(6338, (7019300455443320806L ^ life1_3)), __call432_756("createWorld.customize.custom.biomeDepthWeight", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.4p4f, __fieldRead432_758(__fieldRead432_757(receiver)));
    (spill432_352)[spill432_353] = spill432_354;
    moom.hS[] __stackOp432_760_0 = spill432_351;
    spill432_355 = __stackOp432_760_0;
    spill432_356 = __stackOp432_760_0;
    spill432_357 = __invokedynamic432_761(13000, (6514366979856065808L ^ life1_3));
    moom.hW __stackOp432_763_0 = __sourceUninitializedNEW432_762();
    spill432_358 = __stackOp432_763_0;
    __explicitNewInit432_768(__stackOp432_763_0, __invokedynamic432_764(2378, (7051352881757740791L ^ life1_3)), __call432_765("createWorld.customize.custom.biomeDepthOffset", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p4f, __fieldRead432_767(__fieldRead432_766(receiver)));
    (spill432_356)[spill432_357] = spill432_358;
    moom.hS[] __stackOp432_769_0 = spill432_355;
    spill432_359 = __stackOp432_769_0;
    spill432_360 = __stackOp432_769_0;
    spill432_361 = __invokedynamic432_770(10664, (6940984010893197031L ^ life1_3));
    moom.hW __stackOp432_772_0 = __sourceUninitializedNEW432_771();
    spill432_362 = __stackOp432_772_0;
    __explicitNewInit432_777(__stackOp432_772_0, __invokedynamic432_773(20552, (3275154206506223380L ^ life1_3)), __call432_774("createWorld.customize.custom.biomeScaleWeight", new java.lang.Object[0]), false, receiver, 0x1.0p0f, 0x1.4p4f, __fieldRead432_776(__fieldRead432_775(receiver)));
    (spill432_360)[spill432_361] = spill432_362;
    moom.hS[] __stackOp432_778_0 = spill432_359;
    spill432_363 = __stackOp432_778_0;
    spill432_364 = __stackOp432_778_0;
    spill432_365 = __invokedynamic432_779(26600, (7358228314699739349L ^ life1_3));
    moom.hW __stackOp432_781_0 = __sourceUninitializedNEW432_780();
    spill432_366 = __stackOp432_781_0;
    __explicitNewInit432_786(__stackOp432_781_0, __invokedynamic432_782(27271, (82479355199700435L ^ life1_3)), __call432_783("createWorld.customize.custom.biomeScaleOffset", new java.lang.Object[0]), false, receiver, 0x0.0p0f, 0x1.4p4f, __fieldRead432_785(__fieldRead432_784(receiver)));
    (spill432_364)[spill432_365] = spill432_366;
    life5_2306 = spill432_363;
    moom.hS[] __stackOp432_788_0 = new moom.hS[__invokedynamic432_787(14605, (2918818311686844143L ^ life1_3))];
    spill432_367 = __stackOp432_788_0;
    spill432_368 = __stackOp432_788_0;
    spill432_369 = 0;
    moom.hV __stackOp432_790_0 = __sourceUninitializedNEW432_789();
    spill432_370 = __stackOp432_790_0;
    __explicitNewInit432_794(__stackOp432_790_0, __invokedynamic432_791(30065, (5054125972602036869L ^ life1_3)), __invokedynamic432_793(__call432_792("createWorld.customize.custom.mainNoiseScaleX", new java.lang.Object[0])), false);
    (spill432_368)[spill432_369] = spill432_370;
    moom.hS[] __stackOp432_795_0 = spill432_367;
    spill432_371 = __stackOp432_795_0;
    spill432_372 = __stackOp432_795_0;
    spill432_373 = 1;
    moom.hT __stackOp432_797_0 = __sourceUninitializedNEW432_796();
    spill432_374 = __stackOp432_797_0;
    spill432_375 = __stackOp432_797_0;
    spill432_376 = __invokedynamic432_798(31902, (6081964891499866890L ^ life1_3));
    spill432_377 = "%5.3f";
    java.lang.Object[] __stackOp432_799_0 = new java.lang.Object[1];
    spill432_378 = __stackOp432_799_0;
    (__stackOp432_799_0)[0] = __call432_802(__fieldRead432_801(__fieldRead432_800(receiver)));
    __explicitNewInit432_805(spill432_375, spill432_376, __call432_803(spill432_377, spill432_378), false, __fieldRead432_804(receiver));
    (spill432_372)[spill432_373] = spill432_374;
    moom.hS[] __stackOp432_806_0 = spill432_371;
    spill432_379 = __stackOp432_806_0;
    spill432_380 = __stackOp432_806_0;
    spill432_381 = 2;
    moom.hV __stackOp432_808_0 = __sourceUninitializedNEW432_807();
    spill432_382 = __stackOp432_808_0;
    __explicitNewInit432_812(__stackOp432_808_0, __invokedynamic432_809(16392, (8277493756344276859L ^ life1_3)), __invokedynamic432_811(__call432_810("createWorld.customize.custom.mainNoiseScaleY", new java.lang.Object[0])), false);
    (spill432_380)[spill432_381] = spill432_382;
    moom.hS[] __stackOp432_813_0 = spill432_379;
    spill432_383 = __stackOp432_813_0;
    spill432_384 = __stackOp432_813_0;
    spill432_385 = 3;
    moom.hT __stackOp432_815_0 = __sourceUninitializedNEW432_814();
    spill432_386 = __stackOp432_815_0;
    spill432_387 = __stackOp432_815_0;
    spill432_388 = __invokedynamic432_816(25454, (5305238337535194236L ^ life1_3));
    spill432_389 = "%5.3f";
    java.lang.Object[] __stackOp432_817_0 = new java.lang.Object[1];
    spill432_390 = __stackOp432_817_0;
    (__stackOp432_817_0)[0] = __call432_820(__fieldRead432_819(__fieldRead432_818(receiver)));
    __explicitNewInit432_823(spill432_387, spill432_388, __call432_821(spill432_389, spill432_390), false, __fieldRead432_822(receiver));
    (spill432_384)[spill432_385] = spill432_386;
    moom.hS[] __stackOp432_824_0 = spill432_383;
    spill432_391 = __stackOp432_824_0;
    spill432_392 = __stackOp432_824_0;
    spill432_393 = 4;
    moom.hV __stackOp432_826_0 = __sourceUninitializedNEW432_825();
    spill432_394 = __stackOp432_826_0;
    __explicitNewInit432_830(__stackOp432_826_0, __invokedynamic432_827(9850, (5572266059893436781L ^ life1_3)), __invokedynamic432_829(__call432_828("createWorld.customize.custom.mainNoiseScaleZ", new java.lang.Object[0])), false);
    (spill432_392)[spill432_393] = spill432_394;
    moom.hS[] __stackOp432_831_0 = spill432_391;
    spill432_395 = __stackOp432_831_0;
    spill432_396 = __stackOp432_831_0;
    spill432_397 = 5;
    moom.hT __stackOp432_833_0 = __sourceUninitializedNEW432_832();
    spill432_398 = __stackOp432_833_0;
    spill432_399 = __stackOp432_833_0;
    spill432_400 = __invokedynamic432_834(15254, (746336620868398272L ^ life1_3));
    spill432_401 = "%5.3f";
    java.lang.Object[] __stackOp432_835_0 = new java.lang.Object[1];
    spill432_402 = __stackOp432_835_0;
    (__stackOp432_835_0)[0] = __call432_838(__fieldRead432_837(__fieldRead432_836(receiver)));
    __explicitNewInit432_841(spill432_399, spill432_400, __call432_839(spill432_401, spill432_402), false, __fieldRead432_840(receiver));
    (spill432_396)[spill432_397] = spill432_398;
    moom.hS[] __stackOp432_842_0 = spill432_395;
    spill432_403 = __stackOp432_842_0;
    spill432_404 = __stackOp432_842_0;
    spill432_405 = __invokedynamic432_843(28219, (2193052429329906035L ^ life1_3));
    moom.hV __stackOp432_845_0 = __sourceUninitializedNEW432_844();
    spill432_406 = __stackOp432_845_0;
    __explicitNewInit432_849(__stackOp432_845_0, __invokedynamic432_846(26639, (837856766397071357L ^ life1_3)), __invokedynamic432_848(__call432_847("createWorld.customize.custom.depthNoiseScaleX", new java.lang.Object[0])), false);
    (spill432_404)[spill432_405] = spill432_406;
    moom.hS[] __stackOp432_850_0 = spill432_403;
    spill432_407 = __stackOp432_850_0;
    spill432_408 = __stackOp432_850_0;
    spill432_409 = __invokedynamic432_851(3232, (4157250188239395789L ^ life1_3));
    moom.hT __stackOp432_853_0 = __sourceUninitializedNEW432_852();
    spill432_410 = __stackOp432_853_0;
    spill432_411 = __stackOp432_853_0;
    spill432_412 = __invokedynamic432_854(8335, (1565737446408189839L ^ life1_3));
    spill432_413 = "%5.3f";
    java.lang.Object[] __stackOp432_855_0 = new java.lang.Object[1];
    spill432_414 = __stackOp432_855_0;
    (__stackOp432_855_0)[0] = __call432_858(__fieldRead432_857(__fieldRead432_856(receiver)));
    __explicitNewInit432_861(spill432_411, spill432_412, __call432_859(spill432_413, spill432_414), false, __fieldRead432_860(receiver));
    (spill432_408)[spill432_409] = spill432_410;
    moom.hS[] __stackOp432_862_0 = spill432_407;
    spill432_415 = __stackOp432_862_0;
    spill432_416 = __stackOp432_862_0;
    spill432_417 = __invokedynamic432_863(25084, (5185980224604681974L ^ life1_3));
    moom.hV __stackOp432_865_0 = __sourceUninitializedNEW432_864();
    spill432_418 = __stackOp432_865_0;
    __explicitNewInit432_869(__stackOp432_865_0, __invokedynamic432_866(22753, (843317896913424337L ^ life1_3)), __invokedynamic432_868(__call432_867("createWorld.customize.custom.depthNoiseScaleZ", new java.lang.Object[0])), false);
    (spill432_416)[spill432_417] = spill432_418;
    moom.hS[] __stackOp432_870_0 = spill432_415;
    spill432_419 = __stackOp432_870_0;
    spill432_420 = __stackOp432_870_0;
    spill432_421 = __invokedynamic432_871(17971, (5056386523343917359L ^ life1_3));
    moom.hT __stackOp432_873_0 = __sourceUninitializedNEW432_872();
    spill432_422 = __stackOp432_873_0;
    spill432_423 = __stackOp432_873_0;
    spill432_424 = __invokedynamic432_874(32485, (7136746552383711686L ^ life1_3));
    spill432_425 = "%5.3f";
    java.lang.Object[] __stackOp432_875_0 = new java.lang.Object[1];
    spill432_426 = __stackOp432_875_0;
    (__stackOp432_875_0)[0] = __call432_878(__fieldRead432_877(__fieldRead432_876(receiver)));
    __explicitNewInit432_881(spill432_423, spill432_424, __call432_879(spill432_425, spill432_426), false, __fieldRead432_880(receiver));
    (spill432_420)[spill432_421] = spill432_422;
    moom.hS[] __stackOp432_882_0 = spill432_419;
    spill432_427 = __stackOp432_882_0;
    spill432_428 = __stackOp432_882_0;
    spill432_429 = __invokedynamic432_883(9679, (3832040168035611190L ^ life1_3));
    moom.hV __stackOp432_885_0 = __sourceUninitializedNEW432_884();
    spill432_430 = __stackOp432_885_0;
    __explicitNewInit432_889(__stackOp432_885_0, __invokedynamic432_886(32119, (1040859975837166104L ^ life1_3)), __invokedynamic432_888(__call432_887("createWorld.customize.custom.depthNoiseScaleExponent", new java.lang.Object[0])), false);
    (spill432_428)[spill432_429] = spill432_430;
    moom.hS[] __stackOp432_890_0 = spill432_427;
    spill432_431 = __stackOp432_890_0;
    spill432_432 = __stackOp432_890_0;
    spill432_433 = __invokedynamic432_891(4753, (8090378945286718914L ^ life1_3));
    moom.hT __stackOp432_893_0 = __sourceUninitializedNEW432_892();
    spill432_434 = __stackOp432_893_0;
    spill432_435 = __stackOp432_893_0;
    spill432_436 = __invokedynamic432_894(29416, (2873541941565498646L ^ life1_3));
    spill432_437 = "%2.3f";
    java.lang.Object[] __stackOp432_895_0 = new java.lang.Object[1];
    spill432_438 = __stackOp432_895_0;
    (__stackOp432_895_0)[0] = __call432_898(__fieldRead432_897(__fieldRead432_896(receiver)));
    __explicitNewInit432_901(spill432_435, spill432_436, __call432_899(spill432_437, spill432_438), false, __fieldRead432_900(receiver));
    (spill432_432)[spill432_433] = spill432_434;
    moom.hS[] __stackOp432_902_0 = spill432_431;
    spill432_439 = __stackOp432_902_0;
    spill432_440 = __stackOp432_902_0;
    spill432_441 = __invokedynamic432_903(22108, (1533927503161196844L ^ life1_3));
    moom.hV __stackOp432_905_0 = __sourceUninitializedNEW432_904();
    spill432_442 = __stackOp432_905_0;
    __explicitNewInit432_909(__stackOp432_905_0, __invokedynamic432_906(4507, (3708957035041965678L ^ life1_3)), __invokedynamic432_908(__call432_907("createWorld.customize.custom.baseSize", new java.lang.Object[0])), false);
    (spill432_440)[spill432_441] = spill432_442;
    moom.hS[] __stackOp432_910_0 = spill432_439;
    spill432_443 = __stackOp432_910_0;
    spill432_444 = __stackOp432_910_0;
    spill432_445 = __invokedynamic432_911(13000, (6514366979856065808L ^ life1_3));
    moom.hT __stackOp432_913_0 = __sourceUninitializedNEW432_912();
    spill432_446 = __stackOp432_913_0;
    spill432_447 = __stackOp432_913_0;
    spill432_448 = __invokedynamic432_914(24801, (5778047045546227469L ^ life1_3));
    spill432_449 = "%2.3f";
    java.lang.Object[] __stackOp432_915_0 = new java.lang.Object[1];
    spill432_450 = __stackOp432_915_0;
    (__stackOp432_915_0)[0] = __call432_918(__fieldRead432_917(__fieldRead432_916(receiver)));
    __explicitNewInit432_921(spill432_447, spill432_448, __call432_919(spill432_449, spill432_450), false, __fieldRead432_920(receiver));
    (spill432_444)[spill432_445] = spill432_446;
    moom.hS[] __stackOp432_922_0 = spill432_443;
    spill432_451 = __stackOp432_922_0;
    spill432_452 = __stackOp432_922_0;
    spill432_453 = __invokedynamic432_923(10664, (6940984010893197031L ^ life1_3));
    moom.hV __stackOp432_925_0 = __sourceUninitializedNEW432_924();
    spill432_454 = __stackOp432_925_0;
    __explicitNewInit432_929(__stackOp432_925_0, __invokedynamic432_926(8329, (5484021692854695687L ^ life1_3)), __invokedynamic432_928(__call432_927("createWorld.customize.custom.coordinateScale", new java.lang.Object[0])), false);
    (spill432_452)[spill432_453] = spill432_454;
    moom.hS[] __stackOp432_930_0 = spill432_451;
    spill432_455 = __stackOp432_930_0;
    spill432_456 = __stackOp432_930_0;
    spill432_457 = __invokedynamic432_931(26600, (7358228314699739349L ^ life1_3));
    moom.hT __stackOp432_933_0 = __sourceUninitializedNEW432_932();
    spill432_458 = __stackOp432_933_0;
    spill432_459 = __stackOp432_933_0;
    spill432_460 = __invokedynamic432_934(4487, (7338333970700158554L ^ life1_3));
    spill432_461 = "%5.3f";
    java.lang.Object[] __stackOp432_935_0 = new java.lang.Object[1];
    spill432_462 = __stackOp432_935_0;
    (__stackOp432_935_0)[0] = __call432_938(__fieldRead432_937(__fieldRead432_936(receiver)));
    __explicitNewInit432_941(spill432_459, spill432_460, __call432_939(spill432_461, spill432_462), false, __fieldRead432_940(receiver));
    (spill432_456)[spill432_457] = spill432_458;
    moom.hS[] __stackOp432_942_0 = spill432_455;
    spill432_463 = __stackOp432_942_0;
    spill432_464 = __stackOp432_942_0;
    spill432_465 = __invokedynamic432_943(20808, (8737053167903573647L ^ life1_3));
    moom.hV __stackOp432_945_0 = __sourceUninitializedNEW432_944();
    spill432_466 = __stackOp432_945_0;
    __explicitNewInit432_949(__stackOp432_945_0, __invokedynamic432_946(23245, (6340192045533039917L ^ life1_3)), __invokedynamic432_948(__call432_947("createWorld.customize.custom.heightScale", new java.lang.Object[0])), false);
    (spill432_464)[spill432_465] = spill432_466;
    moom.hS[] __stackOp432_950_0 = spill432_463;
    spill432_467 = __stackOp432_950_0;
    spill432_468 = __stackOp432_950_0;
    spill432_469 = __invokedynamic432_951(7241, (5101971358965812027L ^ life1_3));
    moom.hT __stackOp432_953_0 = __sourceUninitializedNEW432_952();
    spill432_470 = __stackOp432_953_0;
    spill432_471 = __stackOp432_953_0;
    spill432_472 = __invokedynamic432_954(21292, (3681324565077296202L ^ life1_3));
    spill432_473 = "%5.3f";
    java.lang.Object[] __stackOp432_955_0 = new java.lang.Object[1];
    spill432_474 = __stackOp432_955_0;
    (__stackOp432_955_0)[0] = __call432_958(__fieldRead432_957(__fieldRead432_956(receiver)));
    __explicitNewInit432_961(spill432_471, spill432_472, __call432_959(spill432_473, spill432_474), false, __fieldRead432_960(receiver));
    (spill432_468)[spill432_469] = spill432_470;
    moom.hS[] __stackOp432_962_0 = spill432_467;
    spill432_475 = __stackOp432_962_0;
    spill432_476 = __stackOp432_962_0;
    spill432_477 = __invokedynamic432_963(7140, (5829646685629336825L ^ life1_3));
    moom.hV __stackOp432_965_0 = __sourceUninitializedNEW432_964();
    spill432_478 = __stackOp432_965_0;
    __explicitNewInit432_969(__stackOp432_965_0, __invokedynamic432_966(30287, (5918427256710898007L ^ life1_3)), __invokedynamic432_968(__call432_967("createWorld.customize.custom.stretchY", new java.lang.Object[0])), false);
    (spill432_476)[spill432_477] = spill432_478;
    moom.hS[] __stackOp432_970_0 = spill432_475;
    spill432_479 = __stackOp432_970_0;
    spill432_480 = __stackOp432_970_0;
    spill432_481 = __invokedynamic432_971(29404, (6706572208841106840L ^ life1_3));
    moom.hT __stackOp432_973_0 = __sourceUninitializedNEW432_972();
    spill432_482 = __stackOp432_973_0;
    spill432_483 = __stackOp432_973_0;
    spill432_484 = __invokedynamic432_974(8391, (2903414119014037390L ^ life1_3));
    spill432_485 = "%2.3f";
    java.lang.Object[] __stackOp432_975_0 = new java.lang.Object[1];
    spill432_486 = __stackOp432_975_0;
    (__stackOp432_975_0)[0] = __call432_978(__fieldRead432_977(__fieldRead432_976(receiver)));
    __explicitNewInit432_981(spill432_483, spill432_484, __call432_979(spill432_485, spill432_486), false, __fieldRead432_980(receiver));
    (spill432_480)[spill432_481] = spill432_482;
    moom.hS[] __stackOp432_982_0 = spill432_479;
    spill432_487 = __stackOp432_982_0;
    spill432_488 = __stackOp432_982_0;
    spill432_489 = __invokedynamic432_983(20799, (3297512927749179050L ^ life1_3));
    moom.hV __stackOp432_985_0 = __sourceUninitializedNEW432_984();
    spill432_490 = __stackOp432_985_0;
    __explicitNewInit432_989(__stackOp432_985_0, __invokedynamic432_986(23086, (2707435238237539648L ^ life1_3)), __invokedynamic432_988(__call432_987("createWorld.customize.custom.upperLimitScale", new java.lang.Object[0])), false);
    (spill432_488)[spill432_489] = spill432_490;
    moom.hS[] __stackOp432_990_0 = spill432_487;
    spill432_491 = __stackOp432_990_0;
    spill432_492 = __stackOp432_990_0;
    spill432_493 = __invokedynamic432_991(28510, (7923137976962889805L ^ life1_3));
    moom.hT __stackOp432_993_0 = __sourceUninitializedNEW432_992();
    spill432_494 = __stackOp432_993_0;
    spill432_495 = __stackOp432_993_0;
    spill432_496 = __invokedynamic432_994(19662, (1825728011031288616L ^ life1_3));
    spill432_497 = "%5.3f";
    java.lang.Object[] __stackOp432_995_0 = new java.lang.Object[1];
    spill432_498 = __stackOp432_995_0;
    (__stackOp432_995_0)[0] = __call432_998(__fieldRead432_997(__fieldRead432_996(receiver)));
    __explicitNewInit432_1001(spill432_495, spill432_496, __call432_999(spill432_497, spill432_498), false, __fieldRead432_1000(receiver));
    (spill432_492)[spill432_493] = spill432_494;
    moom.hS[] __stackOp432_1002_0 = spill432_491;
    spill432_499 = __stackOp432_1002_0;
    spill432_500 = __stackOp432_1002_0;
    spill432_501 = __invokedynamic432_1003(1211, (1761316948241175310L ^ life1_3));
    moom.hV __stackOp432_1005_0 = __sourceUninitializedNEW432_1004();
    spill432_502 = __stackOp432_1005_0;
    __explicitNewInit432_1009(__stackOp432_1005_0, __invokedynamic432_1006(21177, (784183595909514743L ^ life1_3)), __invokedynamic432_1008(__call432_1007("createWorld.customize.custom.lowerLimitScale", new java.lang.Object[0])), false);
    (spill432_500)[spill432_501] = spill432_502;
    moom.hS[] __stackOp432_1010_0 = spill432_499;
    spill432_503 = __stackOp432_1010_0;
    spill432_504 = __stackOp432_1010_0;
    spill432_505 = __invokedynamic432_1011(1934, (3145356869615243476L ^ life1_3));
    moom.hT __stackOp432_1013_0 = __sourceUninitializedNEW432_1012();
    spill432_506 = __stackOp432_1013_0;
    spill432_507 = __stackOp432_1013_0;
    spill432_508 = __invokedynamic432_1014(8444, (7895447759796041554L ^ life1_3));
    spill432_509 = "%5.3f";
    java.lang.Object[] __stackOp432_1015_0 = new java.lang.Object[1];
    spill432_510 = __stackOp432_1015_0;
    (__stackOp432_1015_0)[0] = __call432_1018(__fieldRead432_1017(__fieldRead432_1016(receiver)));
    __explicitNewInit432_1021(spill432_507, spill432_508, __call432_1019(spill432_509, spill432_510), false, __fieldRead432_1020(receiver));
    (spill432_504)[spill432_505] = spill432_506;
    moom.hS[] __stackOp432_1022_0 = spill432_503;
    spill432_511 = __stackOp432_1022_0;
    spill432_512 = __stackOp432_1022_0;
    spill432_513 = __invokedynamic432_1023(8613, (2025974442582177410L ^ life1_3));
    moom.hV __stackOp432_1025_0 = __sourceUninitializedNEW432_1024();
    spill432_514 = __stackOp432_1025_0;
    __explicitNewInit432_1029(__stackOp432_1025_0, __invokedynamic432_1026(16344, (7064396192105752603L ^ life1_3)), __invokedynamic432_1028(__call432_1027("createWorld.customize.custom.biomeDepthWeight", new java.lang.Object[0])), false);
    (spill432_512)[spill432_513] = spill432_514;
    moom.hS[] __stackOp432_1030_0 = spill432_511;
    spill432_515 = __stackOp432_1030_0;
    spill432_516 = __stackOp432_1030_0;
    spill432_517 = __invokedynamic432_1031(12434, (8824116648825972682L ^ life1_3));
    moom.hT __stackOp432_1033_0 = __sourceUninitializedNEW432_1032();
    spill432_518 = __stackOp432_1033_0;
    spill432_519 = __stackOp432_1033_0;
    spill432_520 = __invokedynamic432_1034(5913, (6108941665356202161L ^ life1_3));
    spill432_521 = "%2.3f";
    java.lang.Object[] __stackOp432_1035_0 = new java.lang.Object[1];
    spill432_522 = __stackOp432_1035_0;
    (__stackOp432_1035_0)[0] = __call432_1038(__fieldRead432_1037(__fieldRead432_1036(receiver)));
    __explicitNewInit432_1041(spill432_519, spill432_520, __call432_1039(spill432_521, spill432_522), false, __fieldRead432_1040(receiver));
    (spill432_516)[spill432_517] = spill432_518;
    moom.hS[] __stackOp432_1042_0 = spill432_515;
    spill432_523 = __stackOp432_1042_0;
    spill432_524 = __stackOp432_1042_0;
    spill432_525 = __invokedynamic432_1043(8522, (5714504432449943251L ^ life1_3));
    moom.hV __stackOp432_1045_0 = __sourceUninitializedNEW432_1044();
    spill432_526 = __stackOp432_1045_0;
    __explicitNewInit432_1049(__stackOp432_1045_0, __invokedynamic432_1046(30918, (4547044625310822394L ^ life1_3)), __invokedynamic432_1048(__call432_1047("createWorld.customize.custom.biomeDepthOffset", new java.lang.Object[0])), false);
    (spill432_524)[spill432_525] = spill432_526;
    moom.hS[] __stackOp432_1050_0 = spill432_523;
    spill432_527 = __stackOp432_1050_0;
    spill432_528 = __stackOp432_1050_0;
    spill432_529 = __invokedynamic432_1051(12940, (6864872812034319681L ^ life1_3));
    moom.hT __stackOp432_1053_0 = __sourceUninitializedNEW432_1052();
    spill432_530 = __stackOp432_1053_0;
    spill432_531 = __stackOp432_1053_0;
    spill432_532 = __invokedynamic432_1054(18009, (6496944860315619804L ^ life1_3));
    spill432_533 = "%2.3f";
    java.lang.Object[] __stackOp432_1055_0 = new java.lang.Object[1];
    spill432_534 = __stackOp432_1055_0;
    (__stackOp432_1055_0)[0] = __call432_1058(__fieldRead432_1057(__fieldRead432_1056(receiver)));
    __explicitNewInit432_1061(spill432_531, spill432_532, __call432_1059(spill432_533, spill432_534), false, __fieldRead432_1060(receiver));
    (spill432_528)[spill432_529] = spill432_530;
    moom.hS[] __stackOp432_1062_0 = spill432_527;
    spill432_535 = __stackOp432_1062_0;
    spill432_536 = __stackOp432_1062_0;
    spill432_537 = __invokedynamic432_1063(21762, (5028168792149295644L ^ life1_3));
    moom.hV __stackOp432_1065_0 = __sourceUninitializedNEW432_1064();
    spill432_538 = __stackOp432_1065_0;
    __explicitNewInit432_1069(__stackOp432_1065_0, __invokedynamic432_1066(6673, (203413658075942312L ^ life1_3)), __invokedynamic432_1068(__call432_1067("createWorld.customize.custom.biomeScaleWeight", new java.lang.Object[0])), false);
    (spill432_536)[spill432_537] = spill432_538;
    moom.hS[] __stackOp432_1070_0 = spill432_535;
    spill432_539 = __stackOp432_1070_0;
    spill432_540 = __stackOp432_1070_0;
    spill432_541 = __invokedynamic432_1071(21713, (2296324720751051576L ^ life1_3));
    moom.hT __stackOp432_1073_0 = __sourceUninitializedNEW432_1072();
    spill432_542 = __stackOp432_1073_0;
    spill432_543 = __stackOp432_1073_0;
    spill432_544 = __invokedynamic432_1074(28885, (3076071302802974566L ^ life1_3));
    spill432_545 = "%2.3f";
    java.lang.Object[] __stackOp432_1075_0 = new java.lang.Object[1];
    spill432_546 = __stackOp432_1075_0;
    (__stackOp432_1075_0)[0] = __call432_1078(__fieldRead432_1077(__fieldRead432_1076(receiver)));
    __explicitNewInit432_1081(spill432_543, spill432_544, __call432_1079(spill432_545, spill432_546), false, __fieldRead432_1080(receiver));
    (spill432_540)[spill432_541] = spill432_542;
    moom.hS[] __stackOp432_1082_0 = spill432_539;
    spill432_547 = __stackOp432_1082_0;
    spill432_548 = __stackOp432_1082_0;
    spill432_549 = __invokedynamic432_1083(10813, (3834201263721053672L ^ life1_3));
    moom.hV __stackOp432_1085_0 = __sourceUninitializedNEW432_1084();
    spill432_550 = __stackOp432_1085_0;
    __explicitNewInit432_1089(__stackOp432_1085_0, __invokedynamic432_1086(3739, (4919066874389682496L ^ life1_3)), __invokedynamic432_1088(__call432_1087("createWorld.customize.custom.biomeScaleOffset", new java.lang.Object[0])), false);
    (spill432_548)[spill432_549] = spill432_550;
    moom.hS[] __stackOp432_1090_0 = spill432_547;
    spill432_551 = __stackOp432_1090_0;
    spill432_552 = __stackOp432_1090_0;
    spill432_553 = __invokedynamic432_1091(10282, (5003452014243053320L ^ life1_3));
    moom.hT __stackOp432_1093_0 = __sourceUninitializedNEW432_1092();
    spill432_554 = __stackOp432_1093_0;
    spill432_555 = __stackOp432_1093_0;
    spill432_556 = __invokedynamic432_1094(10734, (4784599223371136684L ^ life1_3));
    spill432_557 = "%2.3f";
    java.lang.Object[] __stackOp432_1095_0 = new java.lang.Object[1];
    spill432_558 = __stackOp432_1095_0;
    (__stackOp432_1095_0)[0] = __call432_1098(__fieldRead432_1097(__fieldRead432_1096(receiver)));
    __explicitNewInit432_1101(spill432_555, spill432_556, __call432_1099(spill432_557, spill432_558), false, __fieldRead432_1100(receiver));
    (spill432_552)[spill432_553] = spill432_554;
    life6_3089 = spill432_551;
    spill432_559 = receiver;
    moom.h8 __stackOp432_1103_0 = __sourceUninitializedNEW432_1102();
    spill432_560 = __stackOp432_1103_0;
    spill432_561 = __stackOp432_1103_0;
    spill432_562 = __fieldRead432_1104(receiver);
    spill432_563 = __fieldRead432_1105(receiver);
    spill432_564 = __fieldRead432_1106(receiver);
    spill432_565 = __invokedynamic432_1107(14605, (2918818311686844143L ^ life1_3));
    spill432_566 = (__fieldRead432_1108(receiver) - __invokedynamic432_1109(14605, (2918818311686844143L ^ life1_3)));
    spill432_567 = __invokedynamic432_1110(12434, (8824116648825972682L ^ life1_3));
    spill432_568 = receiver;
    moom.hS[][] __stackOp432_1111_0 = new moom.hS[4][];
    spill432_569 = __stackOp432_1111_0;
    (__stackOp432_1111_0)[0] = life3_428;
    moom.hS[][] __stackOp432_1112_0 = spill432_569;
    spill432_570 = __stackOp432_1112_0;
    (__stackOp432_1112_0)[1] = life4_1907;
    moom.hS[][] __stackOp432_1113_0 = spill432_570;
    spill432_571 = __stackOp432_1113_0;
    (__stackOp432_1113_0)[2] = life5_2306;
    moom.hS[][] __stackOp432_1114_0 = spill432_571;
    spill432_572 = __stackOp432_1114_0;
    (__stackOp432_1114_0)[3] = life6_3089;
    __explicitNewInit432_1115(spill432_561, spill432_562, spill432_563, spill432_564, spill432_565, spill432_566, spill432_567, spill432_568, spill432_572);
    __fieldWrite432_1116(spill432_559, spill432_560);
    life7_3139 = 0;
    forest_cycle_3140: while (true) {
    if (!((life7_3139 < 4))) {
        break forest_join_3154;
    }
    (__fieldRead432_1117(receiver))[life7_3139] = __call432_1119(__invokedynamic432_1118(life7_3139), new java.lang.Object[0]);
    life7_3139 += 1;
    continue forest_cycle_3140;
    }
    }
    __call432_1120(receiver);
    return;
}
public static void h432_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3043200_0(p0);
}
private static native long __fieldRead432_0() throws Throwable;
private static native int __invokedynamic432_1(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_3() throws Throwable;
private static native int __invokedynamic432_5(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_6(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_7(moom.gN a0) throws Throwable;
private static native int __fieldRead432_8(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_9(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_11() throws Throwable;
private static native int __invokedynamic432_13(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_14(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_15(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_16(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_17(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_19() throws Throwable;
private static native int __invokedynamic432_21(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_22(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_23(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_24(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_25(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_27() throws Throwable;
private static native int __invokedynamic432_29(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_30(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_31(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_32(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_33(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_35() throws Throwable;
private static native int __invokedynamic432_37(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_38(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_39(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_40(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_41(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_43() throws Throwable;
private static native int __invokedynamic432_45(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_46(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_47(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_48(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_49(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native int __invokedynamic432_51(int a0, long a1) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_52() throws Throwable;
private static native int __invokedynamic432_54(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_55(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_56(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_57(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_58(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native int __invokedynamic432_60(int a0, long a1) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_61() throws Throwable;
private static native int __invokedynamic432_63(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_64(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_65(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_66(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_67(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native int __invokedynamic432_69(int a0, long a1) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_70() throws Throwable;
private static native int __invokedynamic432_72(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_73(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_74(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_75(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_76(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native int __invokedynamic432_78(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_79() throws Throwable;
private static native int __invokedynamic432_81(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_82(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_83(moom.gN a0) throws Throwable;
private static native int __fieldRead432_84(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_85(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_87(int a0, long a1) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_88() throws Throwable;
private static native int __invokedynamic432_90(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_91(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_92(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_93(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_94(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native int __invokedynamic432_96(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_97() throws Throwable;
private static native int __invokedynamic432_99(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_100(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_101(moom.gN a0) throws Throwable;
private static native int __fieldRead432_102(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_103(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_105(int a0, long a1) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_106() throws Throwable;
private static native int __invokedynamic432_108(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_109(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_110(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_111(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_112(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native int __invokedynamic432_114(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_115() throws Throwable;
private static native int __invokedynamic432_117(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_118(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_119(moom.gN a0) throws Throwable;
private static native int __fieldRead432_120(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_121(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_123(int a0, long a1) throws Throwable;
private static native moom.hU __sourceUninitializedNEW432_124() throws Throwable;
private static native int __invokedynamic432_126(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_127(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_128(moom.gN a0) throws Throwable;
private static native boolean __fieldRead432_129(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_130(moom.hU a0, int a1, java.lang.String a2, boolean a3, boolean a4) throws Throwable;
private static native int __invokedynamic432_132(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_133() throws Throwable;
private static native int __invokedynamic432_135(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_136(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_137(moom.gN a0) throws Throwable;
private static native int __fieldRead432_138(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_139(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_141(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_142() throws Throwable;
private static native int __invokedynamic432_144(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_145(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_146(moom.gN a0) throws Throwable;
private static native int __fieldRead432_147(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_148(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_150(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_151() throws Throwable;
private static native int __invokedynamic432_153(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_154(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_155(moom.gN a0) throws Throwable;
private static native int __fieldRead432_156(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_157(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_158(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_160() throws Throwable;
private static native int __invokedynamic432_162(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_163(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_164(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_167() throws Throwable;
private static native int __invokedynamic432_169(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_170(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_171(moom.gN a0) throws Throwable;
private static native int __fieldRead432_172(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_173(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_175() throws Throwable;
private static native int __invokedynamic432_177(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_178(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_179(moom.gN a0) throws Throwable;
private static native int __fieldRead432_180(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_181(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_183() throws Throwable;
private static native int __invokedynamic432_185(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_186(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_187(moom.gN a0) throws Throwable;
private static native int __fieldRead432_188(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_189(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_191() throws Throwable;
private static native int __invokedynamic432_193(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_194(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_195(moom.gN a0) throws Throwable;
private static native int __fieldRead432_196(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_197(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_199(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_200() throws Throwable;
private static native int __invokedynamic432_202(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_203(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_204(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_206(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_208(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_209() throws Throwable;
private static native int __invokedynamic432_211(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_212(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_213(moom.gN a0) throws Throwable;
private static native int __fieldRead432_214(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_215(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_217(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_218() throws Throwable;
private static native int __invokedynamic432_220(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_221(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_222(moom.gN a0) throws Throwable;
private static native int __fieldRead432_223(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_224(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_226(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_227() throws Throwable;
private static native int __invokedynamic432_229(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_230(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_231(moom.gN a0) throws Throwable;
private static native int __fieldRead432_232(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_233(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_235(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_236() throws Throwable;
private static native int __invokedynamic432_238(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_239(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_240(moom.gN a0) throws Throwable;
private static native int __fieldRead432_241(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_242(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_244(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_245() throws Throwable;
private static native int __invokedynamic432_247(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_248(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_249(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_251(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_253(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_254() throws Throwable;
private static native int __invokedynamic432_256(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_257(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_258(moom.gN a0) throws Throwable;
private static native int __fieldRead432_259(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_260(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_262(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_263() throws Throwable;
private static native int __invokedynamic432_265(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_266(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_267(moom.gN a0) throws Throwable;
private static native int __fieldRead432_268(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_269(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_271(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_272() throws Throwable;
private static native int __invokedynamic432_274(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_275(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_276(moom.gN a0) throws Throwable;
private static native int __fieldRead432_277(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_278(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_280(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_281() throws Throwable;
private static native int __invokedynamic432_283(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_284(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_285(moom.gN a0) throws Throwable;
private static native int __fieldRead432_286(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_287(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_289(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_290() throws Throwable;
private static native int __invokedynamic432_292(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_293(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_294(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_296(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_298(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_299() throws Throwable;
private static native int __invokedynamic432_301(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_302(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_303(moom.gN a0) throws Throwable;
private static native int __fieldRead432_304(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_305(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_307(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_308() throws Throwable;
private static native int __invokedynamic432_310(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_311(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_312(moom.gN a0) throws Throwable;
private static native int __fieldRead432_313(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_314(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_316(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_317() throws Throwable;
private static native int __invokedynamic432_319(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_320(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_321(moom.gN a0) throws Throwable;
private static native int __fieldRead432_322(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_323(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_325(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_326() throws Throwable;
private static native int __invokedynamic432_328(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_329(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_330(moom.gN a0) throws Throwable;
private static native int __fieldRead432_331(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_332(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_334(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_335() throws Throwable;
private static native int __invokedynamic432_337(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_338(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_339(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_341(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_343(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_344() throws Throwable;
private static native int __invokedynamic432_346(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_347(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_348(moom.gN a0) throws Throwable;
private static native int __fieldRead432_349(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_350(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_352(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_353() throws Throwable;
private static native int __invokedynamic432_355(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_356(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_357(moom.gN a0) throws Throwable;
private static native int __fieldRead432_358(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_359(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_361(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_362() throws Throwable;
private static native int __invokedynamic432_364(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_365(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_366(moom.gN a0) throws Throwable;
private static native int __fieldRead432_367(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_368(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_370(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_371() throws Throwable;
private static native int __invokedynamic432_373(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_374(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_375(moom.gN a0) throws Throwable;
private static native int __fieldRead432_376(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_377(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_379(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_380() throws Throwable;
private static native int __invokedynamic432_382(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_383(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_384(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_386(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_388(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_389() throws Throwable;
private static native int __invokedynamic432_391(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_392(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_393(moom.gN a0) throws Throwable;
private static native int __fieldRead432_394(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_395(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_397(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_398() throws Throwable;
private static native int __invokedynamic432_400(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_401(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_402(moom.gN a0) throws Throwable;
private static native int __fieldRead432_403(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_404(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_406(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_407() throws Throwable;
private static native int __invokedynamic432_409(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_410(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_411(moom.gN a0) throws Throwable;
private static native int __fieldRead432_412(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_413(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_415(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_416() throws Throwable;
private static native int __invokedynamic432_418(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_419(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_420(moom.gN a0) throws Throwable;
private static native int __fieldRead432_421(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_422(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_424(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_425() throws Throwable;
private static native int __invokedynamic432_427(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_428(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_429(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_431(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_433(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_434() throws Throwable;
private static native int __invokedynamic432_436(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_437(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_438(moom.gN a0) throws Throwable;
private static native int __fieldRead432_439(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_440(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_442(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_443() throws Throwable;
private static native int __invokedynamic432_445(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_446(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_447(moom.gN a0) throws Throwable;
private static native int __fieldRead432_448(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_449(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_451(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_452() throws Throwable;
private static native int __invokedynamic432_454(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_455(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_456(moom.gN a0) throws Throwable;
private static native int __fieldRead432_457(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_458(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_460(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_461() throws Throwable;
private static native int __invokedynamic432_463(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_464(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_465(moom.gN a0) throws Throwable;
private static native int __fieldRead432_466(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_467(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_469(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_470() throws Throwable;
private static native int __invokedynamic432_472(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_473(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_474(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_476(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_478(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_479() throws Throwable;
private static native int __invokedynamic432_481(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_482(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_483(moom.gN a0) throws Throwable;
private static native int __fieldRead432_484(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_485(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_487(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_488() throws Throwable;
private static native int __invokedynamic432_490(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_491(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_492(moom.gN a0) throws Throwable;
private static native int __fieldRead432_493(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_494(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_496(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_497() throws Throwable;
private static native int __invokedynamic432_499(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_500(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_501(moom.gN a0) throws Throwable;
private static native int __fieldRead432_502(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_503(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_505(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_506() throws Throwable;
private static native int __invokedynamic432_508(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_509(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_510(moom.gN a0) throws Throwable;
private static native int __fieldRead432_511(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_512(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_514(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_515() throws Throwable;
private static native int __invokedynamic432_517(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_518(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_519(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_521(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_523(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_524() throws Throwable;
private static native int __invokedynamic432_526(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_527(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_528(moom.gN a0) throws Throwable;
private static native int __fieldRead432_529(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_530(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_532(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_533() throws Throwable;
private static native int __invokedynamic432_535(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_536(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_537(moom.gN a0) throws Throwable;
private static native int __fieldRead432_538(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_539(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_541(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_542() throws Throwable;
private static native int __invokedynamic432_544(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_545(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_546(moom.gN a0) throws Throwable;
private static native int __fieldRead432_547(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_548(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_550(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_551() throws Throwable;
private static native int __invokedynamic432_553(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_554(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_555(moom.gN a0) throws Throwable;
private static native int __fieldRead432_556(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_557(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_559(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_560() throws Throwable;
private static native int __invokedynamic432_562(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_563(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_564(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_566(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_568(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_569() throws Throwable;
private static native int __invokedynamic432_571(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_572(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_573(moom.gN a0) throws Throwable;
private static native int __fieldRead432_574(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_575(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_577(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_578() throws Throwable;
private static native int __invokedynamic432_580(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_581(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_582(moom.gN a0) throws Throwable;
private static native int __fieldRead432_583(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_584(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_586(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_587() throws Throwable;
private static native int __invokedynamic432_589(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_590(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_591(moom.gN a0) throws Throwable;
private static native int __fieldRead432_592(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_593(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_595(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_596() throws Throwable;
private static native int __invokedynamic432_598(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_599(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_600(moom.gN a0) throws Throwable;
private static native int __fieldRead432_601(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_602(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_604(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_605() throws Throwable;
private static native int __invokedynamic432_607(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_608(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __explicitNewInit432_609(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_611(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_613(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_614() throws Throwable;
private static native int __invokedynamic432_616(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_617(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_618(moom.gN a0) throws Throwable;
private static native int __fieldRead432_619(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_620(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_622(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_623() throws Throwable;
private static native int __invokedynamic432_625(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_626(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_627(moom.gN a0) throws Throwable;
private static native int __fieldRead432_628(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_629(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_631(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_632() throws Throwable;
private static native int __invokedynamic432_634(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_635(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_636(moom.gN a0) throws Throwable;
private static native int __fieldRead432_637(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_638(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_640(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_641() throws Throwable;
private static native int __invokedynamic432_643(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_644(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_645(moom.gN a0) throws Throwable;
private static native int __fieldRead432_646(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_647(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_648(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_650() throws Throwable;
private static native int __invokedynamic432_652(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_653(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_654(moom.gN a0) throws Throwable;
private static native float __fieldRead432_655(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_656(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_658() throws Throwable;
private static native int __invokedynamic432_660(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_661(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_662(moom.gN a0) throws Throwable;
private static native float __fieldRead432_663(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_664(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_666() throws Throwable;
private static native int __invokedynamic432_668(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_669(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_670(moom.gN a0) throws Throwable;
private static native float __fieldRead432_671(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_672(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_674() throws Throwable;
private static native int __invokedynamic432_676(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_677(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_678(moom.gN a0) throws Throwable;
private static native float __fieldRead432_679(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_680(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_682() throws Throwable;
private static native int __invokedynamic432_684(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_685(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_686(moom.gN a0) throws Throwable;
private static native float __fieldRead432_687(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_688(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_690() throws Throwable;
private static native int __invokedynamic432_692(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_693(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_694(moom.gN a0) throws Throwable;
private static native float __fieldRead432_695(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_696(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_698(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_699() throws Throwable;
private static native int __invokedynamic432_701(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_702(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_703(moom.gN a0) throws Throwable;
private static native float __fieldRead432_704(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_705(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_707(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_708() throws Throwable;
private static native int __invokedynamic432_710(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_711(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_712(moom.gN a0) throws Throwable;
private static native float __fieldRead432_713(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_714(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_716(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_717() throws Throwable;
private static native int __invokedynamic432_719(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_720(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_721(moom.gN a0) throws Throwable;
private static native float __fieldRead432_722(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_723(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_725(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_726() throws Throwable;
private static native int __invokedynamic432_728(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_729(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_730(moom.gN a0) throws Throwable;
private static native float __fieldRead432_731(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_732(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_734(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_735() throws Throwable;
private static native int __invokedynamic432_737(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_738(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_739(moom.gN a0) throws Throwable;
private static native float __fieldRead432_740(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_741(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_743(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_744() throws Throwable;
private static native int __invokedynamic432_746(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_747(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_748(moom.gN a0) throws Throwable;
private static native float __fieldRead432_749(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_750(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_752(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_753() throws Throwable;
private static native int __invokedynamic432_755(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_756(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_757(moom.gN a0) throws Throwable;
private static native float __fieldRead432_758(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_759(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_761(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_762() throws Throwable;
private static native int __invokedynamic432_764(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_765(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_766(moom.gN a0) throws Throwable;
private static native float __fieldRead432_767(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_768(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_770(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_771() throws Throwable;
private static native int __invokedynamic432_773(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_774(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_775(moom.gN a0) throws Throwable;
private static native float __fieldRead432_776(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_777(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_779(int a0, long a1) throws Throwable;
private static native moom.hW __sourceUninitializedNEW432_780() throws Throwable;
private static native int __invokedynamic432_782(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_783(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native moom.FE __fieldRead432_784(moom.gN a0) throws Throwable;
private static native float __fieldRead432_785(moom.FE a0) throws Throwable;
private static native void __explicitNewInit432_786(moom.hW a0, int a1, java.lang.String a2, boolean a3, moom.h0 a4, float a5, float a6, float a7) throws Throwable;
private static native int __invokedynamic432_787(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_789() throws Throwable;
private static native int __invokedynamic432_791(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_792(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_793(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_794(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_796() throws Throwable;
private static native int __invokedynamic432_798(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_800(moom.gN a0) throws Throwable;
private static native float __fieldRead432_801(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_802(float a0) throws Throwable;
private static native java.lang.String __call432_803(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_804(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_805(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_807() throws Throwable;
private static native int __invokedynamic432_809(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_810(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_811(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_812(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_814() throws Throwable;
private static native int __invokedynamic432_816(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_818(moom.gN a0) throws Throwable;
private static native float __fieldRead432_819(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_820(float a0) throws Throwable;
private static native java.lang.String __call432_821(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_822(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_823(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_825() throws Throwable;
private static native int __invokedynamic432_827(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_828(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_829(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_830(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_832() throws Throwable;
private static native int __invokedynamic432_834(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_836(moom.gN a0) throws Throwable;
private static native float __fieldRead432_837(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_838(float a0) throws Throwable;
private static native java.lang.String __call432_839(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_840(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_841(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_843(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_844() throws Throwable;
private static native int __invokedynamic432_846(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_847(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_848(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_849(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_851(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_852() throws Throwable;
private static native int __invokedynamic432_854(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_856(moom.gN a0) throws Throwable;
private static native float __fieldRead432_857(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_858(float a0) throws Throwable;
private static native java.lang.String __call432_859(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_860(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_861(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_863(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_864() throws Throwable;
private static native int __invokedynamic432_866(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_867(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_868(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_869(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_871(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_872() throws Throwable;
private static native int __invokedynamic432_874(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_876(moom.gN a0) throws Throwable;
private static native float __fieldRead432_877(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_878(float a0) throws Throwable;
private static native java.lang.String __call432_879(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_880(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_881(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_883(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_884() throws Throwable;
private static native int __invokedynamic432_886(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_887(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_888(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_889(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_891(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_892() throws Throwable;
private static native int __invokedynamic432_894(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_896(moom.gN a0) throws Throwable;
private static native float __fieldRead432_897(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_898(float a0) throws Throwable;
private static native java.lang.String __call432_899(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_900(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_901(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_903(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_904() throws Throwable;
private static native int __invokedynamic432_906(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_907(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_908(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_909(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_911(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_912() throws Throwable;
private static native int __invokedynamic432_914(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_916(moom.gN a0) throws Throwable;
private static native float __fieldRead432_917(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_918(float a0) throws Throwable;
private static native java.lang.String __call432_919(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_920(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_921(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_923(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_924() throws Throwable;
private static native int __invokedynamic432_926(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_927(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_928(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_929(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_931(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_932() throws Throwable;
private static native int __invokedynamic432_934(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_936(moom.gN a0) throws Throwable;
private static native float __fieldRead432_937(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_938(float a0) throws Throwable;
private static native java.lang.String __call432_939(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_940(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_941(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_943(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_944() throws Throwable;
private static native int __invokedynamic432_946(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_947(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_948(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_949(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_951(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_952() throws Throwable;
private static native int __invokedynamic432_954(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_956(moom.gN a0) throws Throwable;
private static native float __fieldRead432_957(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_958(float a0) throws Throwable;
private static native java.lang.String __call432_959(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_960(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_961(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_963(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_964() throws Throwable;
private static native int __invokedynamic432_966(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_967(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_968(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_969(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_971(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_972() throws Throwable;
private static native int __invokedynamic432_974(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_976(moom.gN a0) throws Throwable;
private static native float __fieldRead432_977(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_978(float a0) throws Throwable;
private static native java.lang.String __call432_979(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_980(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_981(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_983(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_984() throws Throwable;
private static native int __invokedynamic432_986(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_987(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_988(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_989(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_991(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_992() throws Throwable;
private static native int __invokedynamic432_994(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_996(moom.gN a0) throws Throwable;
private static native float __fieldRead432_997(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_998(float a0) throws Throwable;
private static native java.lang.String __call432_999(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_1000(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_1001(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_1003(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_1004() throws Throwable;
private static native int __invokedynamic432_1006(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_1007(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_1008(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_1009(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_1011(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_1012() throws Throwable;
private static native int __invokedynamic432_1014(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_1016(moom.gN a0) throws Throwable;
private static native float __fieldRead432_1017(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_1018(float a0) throws Throwable;
private static native java.lang.String __call432_1019(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_1020(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_1021(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_1023(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_1024() throws Throwable;
private static native int __invokedynamic432_1026(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_1027(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_1028(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_1029(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_1031(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_1032() throws Throwable;
private static native int __invokedynamic432_1034(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_1036(moom.gN a0) throws Throwable;
private static native float __fieldRead432_1037(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_1038(float a0) throws Throwable;
private static native java.lang.String __call432_1039(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_1040(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_1041(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_1043(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_1044() throws Throwable;
private static native int __invokedynamic432_1046(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_1047(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_1048(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_1049(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_1051(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_1052() throws Throwable;
private static native int __invokedynamic432_1054(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_1056(moom.gN a0) throws Throwable;
private static native float __fieldRead432_1057(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_1058(float a0) throws Throwable;
private static native java.lang.String __call432_1059(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_1060(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_1061(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_1063(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_1064() throws Throwable;
private static native int __invokedynamic432_1066(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_1067(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_1068(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_1069(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_1071(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_1072() throws Throwable;
private static native int __invokedynamic432_1074(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_1076(moom.gN a0) throws Throwable;
private static native float __fieldRead432_1077(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_1078(float a0) throws Throwable;
private static native java.lang.String __call432_1079(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_1080(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_1081(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native int __invokedynamic432_1083(int a0, long a1) throws Throwable;
private static native moom.hV __sourceUninitializedNEW432_1084() throws Throwable;
private static native int __invokedynamic432_1086(int a0, long a1) throws Throwable;
private static native java.lang.String __call432_1087(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __invokedynamic432_1088(java.lang.String a0) throws Throwable;
private static native void __explicitNewInit432_1089(moom.hV a0, int a1, java.lang.String a2, boolean a3) throws Throwable;
private static native int __invokedynamic432_1091(int a0, long a1) throws Throwable;
private static native moom.hT __sourceUninitializedNEW432_1092() throws Throwable;
private static native int __invokedynamic432_1094(int a0, long a1) throws Throwable;
private static native moom.FE __fieldRead432_1096(moom.gN a0) throws Throwable;
private static native float __fieldRead432_1097(moom.FE a0) throws Throwable;
private static native java.lang.Float __call432_1098(float a0) throws Throwable;
private static native java.lang.String __call432_1099(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native com.google.common.base.Predicate __fieldRead432_1100(moom.gN a0) throws Throwable;
private static native void __explicitNewInit432_1101(moom.hT a0, int a1, java.lang.String a2, boolean a3, com.google.common.base.Predicate a4) throws Throwable;
private static native moom.h8 __sourceUninitializedNEW432_1102() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead432_1104(moom.gN a0) throws Throwable;
private static native int __fieldRead432_1105(moom.gN a0) throws Throwable;
private static native int __fieldRead432_1106(moom.gN a0) throws Throwable;
private static native int __invokedynamic432_1107(int a0, long a1) throws Throwable;
private static native int __fieldRead432_1108(moom.gN a0) throws Throwable;
private static native int __invokedynamic432_1109(int a0, long a1) throws Throwable;
private static native int __invokedynamic432_1110(int a0, long a1) throws Throwable;
private static native void __explicitNewInit432_1115(moom.h8 a0, net.minecraft.client.Minecraft a1, int a2, int a3, int a4, int a5, int a6, moom.hX a7, moom.hS[][] a8) throws Throwable;
private static native void __fieldWrite432_1116(moom.gN a0, moom.h8 a1) throws Throwable;
private static native java.lang.String[] __fieldRead432_1117(moom.gN a0) throws Throwable;
private static native java.lang.String __invokedynamic432_1118(int a0) throws Throwable;
private static native java.lang.String __call432_1119(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call432_1120(moom.gN a0) throws Throwable;
private static native java.lang.Exception __call3043200_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bea3baf9a8825556536c(moom.gN a0, char a1, int a2) throws E;
private static final class __SourceHandler_bea3baf9a8825556536c {

public static void f1744(moom.gN receiver, char p0, int p1) throws Throwable {
    __call1744_0(receiver, p0, p1);
    if ((__fieldRead1744_1(receiver) == 0)) {
        switch (p1) {
case 200:
{
        __call1744_2(receiver, 0x1.0p0f);
        break;
    }
case 208:
{
        __call1744_3(receiver, -0x1.0p0f);
        break;
    }
default:
{
        __call1744_5(__fieldRead1744_4(receiver), p0, p1);
        break;
    }
}
    }
    return;
}
public static void h1744_0(java.io.IOException p0) throws Throwable {
    throw __call1174400_0(p0);
}
public static void h1744_1(java.io.IOException p0) throws Throwable {
    throw __call1174401_0(p0);
}
private static native void __call1744_0(moom.gN a0, char a1, int a2) throws Throwable;
private static native int __fieldRead1744_1(moom.gN a0) throws Throwable;
private static native void __call1744_2(moom.gN a0, float a1) throws Throwable;
private static native void __call1744_3(moom.gN a0, float a1) throws Throwable;
private static native moom.h8 __fieldRead1744_4(moom.gN a0) throws Throwable;
private static native void __call1744_5(moom.h8 a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1174400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174401_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_6b778ef5877d68b7ac7b(moom.gN a0, int a1, float a2) throws E;
private static final class __SourceHandler_6b778ef5877d68b7ac7b {

public static java.lang.String f1745(moom.gN receiver, int p0, float p1) throws Throwable {
    net.minecraft.world.biome.BiomeGenBase life3_57;
    net.minecraft.world.biome.BiomeGenBase life3_71;
    switch (p0) {
case 100:
case 101:
case 102:
case 103:
case 104:
case 107:
case 108:
case 110:
case 111:
case 132:
case 133:
case 134:
case 135:
case 136:
case 139:
case 140:
case 142:
case 143:
{
        return __call1745_1("%5.3f", new java.lang.Object[] {__call1745_0(p1)});
    }
case 105:
case 106:
case 109:
case 112:
case 113:
case 114:
case 115:
case 137:
case 138:
case 141:
case 144:
case 145:
case 146:
case 147:
{
        return __call1745_3("%2.3f", new java.lang.Object[] {__call1745_2(p1)});
    }
case 116:
case 117:
case 118:
case 119:
case 120:
case 121:
case 122:
case 123:
case 124:
case 125:
case 126:
case 127:
case 128:
case 129:
case 130:
case 131:
case 148:
case 149:
case 150:
case 151:
case 152:
case 153:
case 154:
case 155:
case 156:
case 157:
case 158:
case 159:
case 160:
case 161:
default:
{
        return __call1745_5("%d", new java.lang.Object[] {__call1745_4(((int) p1))});
    }
case 162:
{
        if ((p1 < 0x0.0p0f)) {
        return __call1745_6("gui.all", new java.lang.Object[0]);
    }
        if ((((int) p1) >= __fieldRead1745_8(__fieldRead1745_7()))) {
        life3_57 = (__call1745_9())[(((int) p1) + 2)];
        return ((life3_57 != null) ? __fieldRead1745_10(life3_57) : "?");
    }
        life3_71 = (__call1745_11())[((int) p1)];
        return ((life3_71 != null) ? __fieldRead1745_12(life3_71) : "?");
    }
}
}
public static void h1745_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1174500_0(p0);
}
public static void h1745_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1174501_0(p0);
}
public static void h1745_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1174502_0(p0);
}
public static void h1745_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1174503_0(p0);
}
private static native java.lang.Float __call1745_0(float a0) throws Throwable;
private static native java.lang.String __call1745_1(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Float __call1745_2(float a0) throws Throwable;
private static native java.lang.String __call1745_3(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.Integer __call1745_4(int a0) throws Throwable;
private static native java.lang.String __call1745_5(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.lang.String __call1745_6(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead1745_7() throws Throwable;
private static native int __fieldRead1745_8(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase[] __call1745_9() throws Throwable;
private static native java.lang.String __fieldRead1745_10(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase[] __call1745_11() throws Throwable;
private static native java.lang.String __fieldRead1745_12(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native java.lang.Exception __call1174500_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1174501_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1174502_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1174503_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0f2b0eea7f9d09c9e3da(moom.gN a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_0f2b0eea7f9d09c9e3da {

public static void f1746(moom.gN receiver, int p0, int p1, int p2) throws Throwable {
    __call1746_0(receiver, p0, p1, p2);
    if ((__fieldRead1746_1(receiver) == 0)) {
        if ((!__fieldRead1746_2(receiver))) {
        __call1746_4(__fieldRead1746_3(receiver), p0, p1, p2);
    }
    }
    return;
}
public static void h1746_0(java.io.IOException p0) throws Throwable {
    throw __call1174600_0(p0);
}
public static void h1746_1(java.io.IOException p0) throws Throwable {
    throw __call1174601_0(p0);
}
private static native void __call1746_0(moom.gN a0, int a1, int a2, int a3) throws Throwable;
private static native int __fieldRead1746_1(moom.gN a0) throws Throwable;
private static native boolean __fieldRead1746_2(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead1746_3(moom.gN a0) throws Throwable;
private static native boolean __call1746_4(moom.h8 a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1174600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174601_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b7e5d7300fd7fac975e6(moom.gN a0, int a1, java.lang.String a2) throws E;
private static final class __SourceHandler_b7e5d7300fd7fac975e6 {

public static void f433(moom.gN receiver, int p0, java.lang.String p1) throws Throwable {
    float spill433_0;
    float spill433_1;
    float spill433_2;
    float spill433_3;
    float spill433_4;
    float spill433_5;
    float spill433_6;
    float spill433_7;
    float spill433_8;
    float spill433_9;
    float spill433_10;
    float spill433_11;
    float spill433_12;
    float spill433_13;
    float spill433_14;
    float spill433_15;
    long life3_3;
    float life5_5;
    float life5_8;
    float life6_12;
    forward_join_219: {
    forward_join_190: {
    forward_join_172: {
    forward_join_163: {
    forward_join_153: {
    forward_join_143: {
    forward_join_133: {
    forward_join_123: {
    forward_join_113: {
    forward_join_103: {
    forward_join_93: {
    forward_join_83: {
    forward_join_73: {
    forward_join_63: {
    forward_join_53: {
    forward_join_43: {
    forward_join_33: {
    forward_join_23: {
    forward_join_13: {
    life3_3 = (__fieldRead433_0() ^ 5370836747280L);
    life5_5 = 0x0.0p0f;
    life5_8 = __call433_1(p1);
    life6_12 = 0x0.0p0f;
    switch (p0) {
case 132:
{
        break forward_join_13;
    }
case 133:
{
        break forward_join_23;
    }
case 134:
{
        break forward_join_33;
    }
case 135:
{
        break forward_join_43;
    }
case 136:
{
        break forward_join_53;
    }
case 137:
{
        break forward_join_63;
    }
case 138:
{
        break forward_join_73;
    }
case 139:
{
        break forward_join_83;
    }
case 140:
{
        break forward_join_93;
    }
case 141:
{
        break forward_join_103;
    }
case 142:
{
        break forward_join_113;
    }
case 143:
{
        break forward_join_123;
    }
case 144:
{
        break forward_join_133;
    }
case 145:
{
        break forward_join_143;
    }
case 146:
{
        break forward_join_153;
    }
case 147:
{
        break forward_join_163;
    }
default:
{
        break forward_join_172;
    }
}
    }
    moom.FE __stackOp433_4_0 = __fieldRead433_2(receiver);
    float __stackOp433_4_1 = __call433_3(life5_8, 0x1.0p0f, 0x1.388p12f);
    spill433_0 = __stackOp433_4_1;
    __fieldWrite433_5(__stackOp433_4_0, __stackOp433_4_1);
    life6_12 = spill433_0;
    break forward_join_172;
    }
    moom.FE __stackOp433_8_0 = __fieldRead433_6(receiver);
    float __stackOp433_8_1 = __call433_7(life5_8, 0x1.0p0f, 0x1.388p12f);
    spill433_1 = __stackOp433_8_1;
    __fieldWrite433_9(__stackOp433_8_0, __stackOp433_8_1);
    life6_12 = spill433_1;
    break forward_join_172;
    }
    moom.FE __stackOp433_12_0 = __fieldRead433_10(receiver);
    float __stackOp433_12_1 = __call433_11(life5_8, 0x1.0p0f, 0x1.388p12f);
    spill433_2 = __stackOp433_12_1;
    __fieldWrite433_13(__stackOp433_12_0, __stackOp433_12_1);
    life6_12 = spill433_2;
    break forward_join_172;
    }
    moom.FE __stackOp433_16_0 = __fieldRead433_14(receiver);
    float __stackOp433_16_1 = __call433_15(life5_8, 0x1.0p0f, 0x1.f4p10f);
    spill433_3 = __stackOp433_16_1;
    __fieldWrite433_17(__stackOp433_16_0, __stackOp433_16_1);
    life6_12 = spill433_3;
    break forward_join_172;
    }
    moom.FE __stackOp433_20_0 = __fieldRead433_18(receiver);
    float __stackOp433_20_1 = __call433_19(life5_8, 0x1.0p0f, 0x1.f4p10f);
    spill433_4 = __stackOp433_20_1;
    __fieldWrite433_21(__stackOp433_20_0, __stackOp433_20_1);
    life6_12 = spill433_4;
    break forward_join_172;
    }
    moom.FE __stackOp433_24_0 = __fieldRead433_22(receiver);
    float __stackOp433_24_1 = __call433_23(life5_8, 0x1.47ae14p-7f, 0x1.4p4f);
    spill433_5 = __stackOp433_24_1;
    __fieldWrite433_25(__stackOp433_24_0, __stackOp433_24_1);
    life6_12 = spill433_5;
    break forward_join_172;
    }
    moom.FE __stackOp433_28_0 = __fieldRead433_26(receiver);
    float __stackOp433_28_1 = __call433_27(life5_8, 0x1.0p0f, 0x1.9p4f);
    spill433_6 = __stackOp433_28_1;
    __fieldWrite433_29(__stackOp433_28_0, __stackOp433_28_1);
    life6_12 = spill433_6;
    break forward_join_172;
    }
    moom.FE __stackOp433_32_0 = __fieldRead433_30(receiver);
    float __stackOp433_32_1 = __call433_31(life5_8, 0x1.0p0f, 0x1.77p12f);
    spill433_7 = __stackOp433_32_1;
    __fieldWrite433_33(__stackOp433_32_0, __stackOp433_32_1);
    life6_12 = spill433_7;
    break forward_join_172;
    }
    moom.FE __stackOp433_36_0 = __fieldRead433_34(receiver);
    float __stackOp433_36_1 = __call433_35(life5_8, 0x1.0p0f, 0x1.77p12f);
    spill433_8 = __stackOp433_36_1;
    __fieldWrite433_37(__stackOp433_36_0, __stackOp433_36_1);
    life6_12 = spill433_8;
    break forward_join_172;
    }
    moom.FE __stackOp433_40_0 = __fieldRead433_38(receiver);
    float __stackOp433_40_1 = __call433_39(life5_8, 0x1.47ae14p-7f, 0x1.9p5f);
    spill433_9 = __stackOp433_40_1;
    __fieldWrite433_41(__stackOp433_40_0, __stackOp433_40_1);
    life6_12 = spill433_9;
    break forward_join_172;
    }
    moom.FE __stackOp433_44_0 = __fieldRead433_42(receiver);
    float __stackOp433_44_1 = __call433_43(life5_8, 0x1.0p0f, 0x1.388p12f);
    spill433_10 = __stackOp433_44_1;
    __fieldWrite433_45(__stackOp433_44_0, __stackOp433_44_1);
    life6_12 = spill433_10;
    break forward_join_172;
    }
    moom.FE __stackOp433_48_0 = __fieldRead433_46(receiver);
    float __stackOp433_48_1 = __call433_47(life5_8, 0x1.0p0f, 0x1.388p12f);
    spill433_11 = __stackOp433_48_1;
    __fieldWrite433_49(__stackOp433_48_0, __stackOp433_48_1);
    life6_12 = spill433_11;
    break forward_join_172;
    }
    moom.FE __stackOp433_52_0 = __fieldRead433_50(receiver);
    float __stackOp433_52_1 = __call433_51(life5_8, 0x1.0p0f, 0x1.4p4f);
    spill433_12 = __stackOp433_52_1;
    __fieldWrite433_53(__stackOp433_52_0, __stackOp433_52_1);
    life6_12 = spill433_12;
    break forward_join_172;
    }
    moom.FE __stackOp433_56_0 = __fieldRead433_54(receiver);
    float __stackOp433_56_1 = __call433_55(life5_8, 0x0.0p0f, 0x1.4p4f);
    spill433_13 = __stackOp433_56_1;
    __fieldWrite433_57(__stackOp433_56_0, __stackOp433_56_1);
    life6_12 = spill433_13;
    break forward_join_172;
    }
    moom.FE __stackOp433_60_0 = __fieldRead433_58(receiver);
    float __stackOp433_60_1 = __call433_59(life5_8, 0x1.0p0f, 0x1.4p4f);
    spill433_14 = __stackOp433_60_1;
    __fieldWrite433_61(__stackOp433_60_0, __stackOp433_60_1);
    life6_12 = spill433_14;
    break forward_join_172;
    }
    moom.FE __stackOp433_64_0 = __fieldRead433_62(receiver);
    float __stackOp433_64_1 = __call433_63(life5_8, 0x0.0p0f, 0x1.4p4f);
    spill433_15 = __stackOp433_64_1;
    __fieldWrite433_65(__stackOp433_64_0, __stackOp433_64_1);
    life6_12 = spill433_15;
    }
    if (!((__numericCompare433_66(life6_12, life5_8) != 0))) {
        break forward_join_190;
    }
    if (!((__numericCompare433_67(life5_8, 0x0.0p0f) != 0))) {
        break forward_join_190;
    }
    __call433_72(__cast433_70(__call433_69(__fieldRead433_68(receiver), p0)), __call433_71(receiver, p0, life6_12));
    }
    __call433_78(__cast433_77(__call433_76(__fieldRead433_73(receiver), ((p0 - __invokedynamic433_74(7356, (1114562263354236292L ^ life3_3))) + __invokedynamic433_75(20454, (5251716462579977741L ^ life3_3))))), life6_12, 0);
    if (!((!__call433_81(__fieldRead433_79(receiver), __fieldRead433_80(receiver))))) {
        break forward_join_219;
    }
    __call433_82(receiver, 1);
    }
    return;
}
public static void h433_0(java.lang.NumberFormatException p0, moom.gN p1, int p2, long p3, float p4, float p5) throws Throwable {
    float spill3043300_0;
    float spill3043300_1;
    float spill3043300_2;
    float spill3043300_3;
    float spill3043300_4;
    float spill3043300_5;
    float spill3043300_6;
    float spill3043300_7;
    float spill3043300_8;
    float spill3043300_9;
    float spill3043300_10;
    float spill3043300_11;
    float spill3043300_12;
    float spill3043300_13;
    float spill3043300_14;
    float spill3043300_15;
    java.lang.NumberFormatException life6_2;
    float life6_4;
    forward_join_212: {
    forward_join_183: {
    forward_join_165: {
    forward_join_156: {
    forward_join_146: {
    forward_join_136: {
    forward_join_126: {
    forward_join_116: {
    forward_join_106: {
    forward_join_96: {
    forward_join_86: {
    forward_join_76: {
    forward_join_66: {
    forward_join_56: {
    forward_join_46: {
    forward_join_36: {
    forward_join_26: {
    forward_join_16: {
    forward_join_6: {
    life6_2 = p0;
    life6_4 = 0x0.0p0f;
    switch (p2) {
case 132:
{
        break forward_join_6;
    }
case 133:
{
        break forward_join_16;
    }
case 134:
{
        break forward_join_26;
    }
case 135:
{
        break forward_join_36;
    }
case 136:
{
        break forward_join_46;
    }
case 137:
{
        break forward_join_56;
    }
case 138:
{
        break forward_join_66;
    }
case 139:
{
        break forward_join_76;
    }
case 140:
{
        break forward_join_86;
    }
case 141:
{
        break forward_join_96;
    }
case 142:
{
        break forward_join_106;
    }
case 143:
{
        break forward_join_116;
    }
case 144:
{
        break forward_join_126;
    }
case 145:
{
        break forward_join_136;
    }
case 146:
{
        break forward_join_146;
    }
case 147:
{
        break forward_join_156;
    }
default:
{
        break forward_join_165;
    }
}
    }
    moom.FE __stackOp3043300_2_0 = __fieldRead3043300_0(p1);
    float __stackOp3043300_2_1 = __call3043300_1(p4, 0x1.0p0f, 0x1.388p12f);
    spill3043300_0 = __stackOp3043300_2_1;
    __fieldWrite3043300_3(__stackOp3043300_2_0, __stackOp3043300_2_1);
    life6_4 = spill3043300_0;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_6_0 = __fieldRead3043300_4(p1);
    float __stackOp3043300_6_1 = __call3043300_5(p4, 0x1.0p0f, 0x1.388p12f);
    spill3043300_1 = __stackOp3043300_6_1;
    __fieldWrite3043300_7(__stackOp3043300_6_0, __stackOp3043300_6_1);
    life6_4 = spill3043300_1;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_10_0 = __fieldRead3043300_8(p1);
    float __stackOp3043300_10_1 = __call3043300_9(p4, 0x1.0p0f, 0x1.388p12f);
    spill3043300_2 = __stackOp3043300_10_1;
    __fieldWrite3043300_11(__stackOp3043300_10_0, __stackOp3043300_10_1);
    life6_4 = spill3043300_2;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_14_0 = __fieldRead3043300_12(p1);
    float __stackOp3043300_14_1 = __call3043300_13(p4, 0x1.0p0f, 0x1.f4p10f);
    spill3043300_3 = __stackOp3043300_14_1;
    __fieldWrite3043300_15(__stackOp3043300_14_0, __stackOp3043300_14_1);
    life6_4 = spill3043300_3;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_18_0 = __fieldRead3043300_16(p1);
    float __stackOp3043300_18_1 = __call3043300_17(p4, 0x1.0p0f, 0x1.f4p10f);
    spill3043300_4 = __stackOp3043300_18_1;
    __fieldWrite3043300_19(__stackOp3043300_18_0, __stackOp3043300_18_1);
    life6_4 = spill3043300_4;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_22_0 = __fieldRead3043300_20(p1);
    float __stackOp3043300_22_1 = __call3043300_21(p4, 0x1.47ae14p-7f, 0x1.4p4f);
    spill3043300_5 = __stackOp3043300_22_1;
    __fieldWrite3043300_23(__stackOp3043300_22_0, __stackOp3043300_22_1);
    life6_4 = spill3043300_5;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_26_0 = __fieldRead3043300_24(p1);
    float __stackOp3043300_26_1 = __call3043300_25(p4, 0x1.0p0f, 0x1.9p4f);
    spill3043300_6 = __stackOp3043300_26_1;
    __fieldWrite3043300_27(__stackOp3043300_26_0, __stackOp3043300_26_1);
    life6_4 = spill3043300_6;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_30_0 = __fieldRead3043300_28(p1);
    float __stackOp3043300_30_1 = __call3043300_29(p4, 0x1.0p0f, 0x1.77p12f);
    spill3043300_7 = __stackOp3043300_30_1;
    __fieldWrite3043300_31(__stackOp3043300_30_0, __stackOp3043300_30_1);
    life6_4 = spill3043300_7;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_34_0 = __fieldRead3043300_32(p1);
    float __stackOp3043300_34_1 = __call3043300_33(p4, 0x1.0p0f, 0x1.77p12f);
    spill3043300_8 = __stackOp3043300_34_1;
    __fieldWrite3043300_35(__stackOp3043300_34_0, __stackOp3043300_34_1);
    life6_4 = spill3043300_8;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_38_0 = __fieldRead3043300_36(p1);
    float __stackOp3043300_38_1 = __call3043300_37(p4, 0x1.47ae14p-7f, 0x1.9p5f);
    spill3043300_9 = __stackOp3043300_38_1;
    __fieldWrite3043300_39(__stackOp3043300_38_0, __stackOp3043300_38_1);
    life6_4 = spill3043300_9;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_42_0 = __fieldRead3043300_40(p1);
    float __stackOp3043300_42_1 = __call3043300_41(p4, 0x1.0p0f, 0x1.388p12f);
    spill3043300_10 = __stackOp3043300_42_1;
    __fieldWrite3043300_43(__stackOp3043300_42_0, __stackOp3043300_42_1);
    life6_4 = spill3043300_10;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_46_0 = __fieldRead3043300_44(p1);
    float __stackOp3043300_46_1 = __call3043300_45(p4, 0x1.0p0f, 0x1.388p12f);
    spill3043300_11 = __stackOp3043300_46_1;
    __fieldWrite3043300_47(__stackOp3043300_46_0, __stackOp3043300_46_1);
    life6_4 = spill3043300_11;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_50_0 = __fieldRead3043300_48(p1);
    float __stackOp3043300_50_1 = __call3043300_49(p4, 0x1.0p0f, 0x1.4p4f);
    spill3043300_12 = __stackOp3043300_50_1;
    __fieldWrite3043300_51(__stackOp3043300_50_0, __stackOp3043300_50_1);
    life6_4 = spill3043300_12;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_54_0 = __fieldRead3043300_52(p1);
    float __stackOp3043300_54_1 = __call3043300_53(p4, 0x0.0p0f, 0x1.4p4f);
    spill3043300_13 = __stackOp3043300_54_1;
    __fieldWrite3043300_55(__stackOp3043300_54_0, __stackOp3043300_54_1);
    life6_4 = spill3043300_13;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_58_0 = __fieldRead3043300_56(p1);
    float __stackOp3043300_58_1 = __call3043300_57(p4, 0x1.0p0f, 0x1.4p4f);
    spill3043300_14 = __stackOp3043300_58_1;
    __fieldWrite3043300_59(__stackOp3043300_58_0, __stackOp3043300_58_1);
    life6_4 = spill3043300_14;
    break forward_join_165;
    }
    moom.FE __stackOp3043300_62_0 = __fieldRead3043300_60(p1);
    float __stackOp3043300_62_1 = __call3043300_61(p4, 0x0.0p0f, 0x1.4p4f);
    spill3043300_15 = __stackOp3043300_62_1;
    __fieldWrite3043300_63(__stackOp3043300_62_0, __stackOp3043300_62_1);
    life6_4 = spill3043300_15;
    }
    if (!((__numericCompare3043300_64(life6_4, p4) != 0))) {
        break forward_join_183;
    }
    if (!((__numericCompare3043300_65(p4, 0x0.0p0f) != 0))) {
        break forward_join_183;
    }
    __call3043300_70(__cast3043300_68(__call3043300_67(__fieldRead3043300_66(p1), p2)), __call3043300_69(p1, p2, life6_4));
    }
    __call3043300_76(__cast3043300_75(__call3043300_74(__fieldRead3043300_71(p1), ((p2 - __invokedynamic3043300_72(7356, (1114562263354236292L ^ p3))) + __invokedynamic3043300_73(20454, (5251716462579977741L ^ p3))))), life6_4, 0);
    if (!((!__call3043300_79(__fieldRead3043300_77(p1), __fieldRead3043300_78(p1))))) {
        break forward_join_212;
    }
    __call3043300_80(p1, 1);
    }
    return;
}
public static void h433_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3043301_0(p0);
}
public static void h433_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3043302_0(p0);
}
public static void h433_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3043303_0(p0);
}
private static native long __fieldRead433_0() throws Throwable;
private static native float __call433_1(java.lang.String a0) throws Throwable;
private static native moom.FE __fieldRead433_2(moom.gN a0) throws Throwable;
private static native float __call433_3(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_5(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_6(moom.gN a0) throws Throwable;
private static native float __call433_7(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_9(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_10(moom.gN a0) throws Throwable;
private static native float __call433_11(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_13(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_14(moom.gN a0) throws Throwable;
private static native float __call433_15(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_17(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_18(moom.gN a0) throws Throwable;
private static native float __call433_19(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_21(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_22(moom.gN a0) throws Throwable;
private static native float __call433_23(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_25(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_26(moom.gN a0) throws Throwable;
private static native float __call433_27(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_29(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_30(moom.gN a0) throws Throwable;
private static native float __call433_31(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_33(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_34(moom.gN a0) throws Throwable;
private static native float __call433_35(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_37(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_38(moom.gN a0) throws Throwable;
private static native float __call433_39(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_41(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_42(moom.gN a0) throws Throwable;
private static native float __call433_43(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_45(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_46(moom.gN a0) throws Throwable;
private static native float __call433_47(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_49(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_50(moom.gN a0) throws Throwable;
private static native float __call433_51(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_53(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_54(moom.gN a0) throws Throwable;
private static native float __call433_55(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_57(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_58(moom.gN a0) throws Throwable;
private static native float __call433_59(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_61(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead433_62(moom.gN a0) throws Throwable;
private static native float __call433_63(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite433_65(moom.FE a0, float a1) throws Throwable;
private static native int __numericCompare433_66(float a0, float a1) throws Throwable;
private static native int __numericCompare433_67(float a0, float a1) throws Throwable;
private static native moom.h8 __fieldRead433_68(moom.gN a0) throws Throwable;
private static native net.minecraft.client.gui.Gui __call433_69(moom.h8 a0, int a1) throws Throwable;
private static native moom.hJ __cast433_70(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native java.lang.String __call433_71(moom.gN a0, int a1, float a2) throws Throwable;
private static native void __call433_72(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.h8 __fieldRead433_73(moom.gN a0) throws Throwable;
private static native int __invokedynamic433_74(int a0, long a1) throws Throwable;
private static native int __invokedynamic433_75(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.Gui __call433_76(moom.h8 a0, int a1) throws Throwable;
private static native moom.gp __cast433_77(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native void __call433_78(moom.gp a0, float a1, int a2) throws Throwable;
private static native moom.FE __fieldRead433_79(moom.gN a0) throws Throwable;
private static native moom.FE __fieldRead433_80(moom.gN a0) throws Throwable;
private static native boolean __call433_81(moom.FE a0, moom.FE a1) throws Throwable;
private static native void __call433_82(moom.gN a0, int a1) throws Throwable;
private static native moom.FE __fieldRead3043300_0(moom.gN a0) throws Throwable;
private static native float __call3043300_1(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_3(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_4(moom.gN a0) throws Throwable;
private static native float __call3043300_5(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_7(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_8(moom.gN a0) throws Throwable;
private static native float __call3043300_9(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_11(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_12(moom.gN a0) throws Throwable;
private static native float __call3043300_13(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_15(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_16(moom.gN a0) throws Throwable;
private static native float __call3043300_17(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_19(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_20(moom.gN a0) throws Throwable;
private static native float __call3043300_21(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_23(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_24(moom.gN a0) throws Throwable;
private static native float __call3043300_25(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_27(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_28(moom.gN a0) throws Throwable;
private static native float __call3043300_29(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_31(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_32(moom.gN a0) throws Throwable;
private static native float __call3043300_33(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_35(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_36(moom.gN a0) throws Throwable;
private static native float __call3043300_37(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_39(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_40(moom.gN a0) throws Throwable;
private static native float __call3043300_41(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_43(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_44(moom.gN a0) throws Throwable;
private static native float __call3043300_45(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_47(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_48(moom.gN a0) throws Throwable;
private static native float __call3043300_49(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_51(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_52(moom.gN a0) throws Throwable;
private static native float __call3043300_53(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_55(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_56(moom.gN a0) throws Throwable;
private static native float __call3043300_57(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_59(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead3043300_60(moom.gN a0) throws Throwable;
private static native float __call3043300_61(float a0, float a1, float a2) throws Throwable;
private static native void __fieldWrite3043300_63(moom.FE a0, float a1) throws Throwable;
private static native int __numericCompare3043300_64(float a0, float a1) throws Throwable;
private static native int __numericCompare3043300_65(float a0, float a1) throws Throwable;
private static native moom.h8 __fieldRead3043300_66(moom.gN a0) throws Throwable;
private static native net.minecraft.client.gui.Gui __call3043300_67(moom.h8 a0, int a1) throws Throwable;
private static native moom.hJ __cast3043300_68(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native java.lang.String __call3043300_69(moom.gN a0, int a1, float a2) throws Throwable;
private static native void __call3043300_70(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.h8 __fieldRead3043300_71(moom.gN a0) throws Throwable;
private static native int __invokedynamic3043300_72(int a0, long a1) throws Throwable;
private static native int __invokedynamic3043300_73(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.Gui __call3043300_74(moom.h8 a0, int a1) throws Throwable;
private static native moom.gp __cast3043300_75(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native void __call3043300_76(moom.gp a0, float a1, int a2) throws Throwable;
private static native moom.FE __fieldRead3043300_77(moom.gN a0) throws Throwable;
private static native moom.FE __fieldRead3043300_78(moom.gN a0) throws Throwable;
private static native boolean __call3043300_79(moom.FE a0, moom.FE a1) throws Throwable;
private static native void __call3043300_80(moom.gN a0, int a1) throws Throwable;
private static native java.lang.Exception __call3043301_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3043302_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3043303_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dd0f9f49e093b1db0567(moom.gN a0, int a1, boolean a2) throws E;
private static final class __SourceHandler_dd0f9f49e093b1db0567 {

public static void f851(moom.gN receiver, int p0, boolean p1) throws Throwable {
    forest_join_65: {
    forest_join_56: {
    forest_join_52: {
    forest_join_47: {
    forest_join_42: {
    forest_join_37: {
    forest_join_32: {
    forest_join_27: {
    forest_join_22: {
    forest_join_17: {
    forest_join_12: {
    forest_join_7: {
    forest_join_2: {
    switch (p0) {
case 148:
{
        break forest_join_2;
    }
case 149:
{
        break forest_join_7;
    }
case 150:
{
        break forest_join_12;
    }
case 151:
{
        break forest_join_17;
    }
case 152:
{
        break forest_join_22;
    }
case 153:
{
        break forest_join_27;
    }
case 154:
{
        break forest_join_32;
    }
case 155:
{
        break forest_join_37;
    }
case 156:
{
        break forest_join_42;
    }
case 161:
{
        break forest_join_47;
    }
case 210:
{
        break forest_join_52;
    }
default:
{
        break forest_join_56;
    }
}
    }
    __fieldWrite851_1(__fieldRead851_0(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_3(__fieldRead851_2(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_5(__fieldRead851_4(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_7(__fieldRead851_6(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_9(__fieldRead851_8(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_11(__fieldRead851_10(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_13(__fieldRead851_12(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_15(__fieldRead851_14(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_17(__fieldRead851_16(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_19(__fieldRead851_18(receiver), p1);
    break forest_join_56;
    }
    __fieldWrite851_21(__fieldRead851_20(receiver), p1);
    }
    if (!((!__call851_24(__fieldRead851_22(receiver), __fieldRead851_23(receiver))))) {
        break forest_join_65;
    }
    __call851_25(receiver, 1);
    }
    return;
}
public static void h851_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3085100_0(p0);
}
public static void h851_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call3085101_0(p0);
}
private static native moom.FE __fieldRead851_0(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_1(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_2(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_3(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_4(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_5(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_6(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_7(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_8(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_9(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_10(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_11(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_12(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_13(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_14(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_15(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_16(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_17(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_18(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_19(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_20(moom.gN a0) throws Throwable;
private static native void __fieldWrite851_21(moom.FE a0, boolean a1) throws Throwable;
private static native moom.FE __fieldRead851_22(moom.gN a0) throws Throwable;
private static native moom.FE __fieldRead851_23(moom.gN a0) throws Throwable;
private static native boolean __call851_24(moom.FE a0, moom.FE a1) throws Throwable;
private static native void __call851_25(moom.gN a0, int a1) throws Throwable;
private static native java.lang.Exception __call3085100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call3085101_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fbe16be1b2b60800db78(moom.gN a0, java.lang.String a1) throws E;
private static final class __SourceHandler_fbe16be1b2b60800db78 {

public static void f1037(moom.gN receiver, java.lang.String p0) throws Throwable {
    forward_join_15: {
    forward_join_10: {
    if (!((p0 != null))) { break forward_join_10; }
    if (!((__call1037_0(p0) != 0))) { break forward_join_10; }
    __fieldWrite1037_2(receiver, __call1037_1(p0));
    break forward_join_15;
    }
    __fieldWrite1037_3(receiver, new moom.FE());
    }
    return;
}
public static void h1037_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103700_0(p0);
}
public static void h1037_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103701_0(p0);
}
private static native int __call1037_0(java.lang.String a0) throws Throwable;
private static native moom.FE __call1037_1(java.lang.String a0) throws Throwable;
private static native void __fieldWrite1037_2(moom.gN a0, moom.FE a1) throws Throwable;
private static native void __fieldWrite1037_3(moom.gN a0, moom.FE a1) throws Throwable;
private static native java.lang.Exception __call1103700_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103701_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f421b759ad22f775270f(moom.gN a0, int a1, float a2) throws E;
private static final class __SourceHandler_f421b759ad22f775270f {

public static void f371(moom.gN receiver, int p0, float p1) throws Throwable {
    long life3_3;
    net.minecraft.client.gui.Gui life5_426;
    life3_3 = (__fieldRead371_0() ^ 49575418227785L);
    switch (p0) {
case 100:
{
        __fieldWrite371_2(__fieldRead371_1(receiver), p1);
        break;
    }
case 101:
{
        __fieldWrite371_4(__fieldRead371_3(receiver), p1);
        break;
    }
case 102:
{
        __fieldWrite371_6(__fieldRead371_5(receiver), p1);
        break;
    }
case 103:
{
        __fieldWrite371_8(__fieldRead371_7(receiver), p1);
        break;
    }
case 104:
{
        __fieldWrite371_10(__fieldRead371_9(receiver), p1);
        break;
    }
case 105:
{
        __fieldWrite371_12(__fieldRead371_11(receiver), p1);
        break;
    }
case 106:
{
        __fieldWrite371_14(__fieldRead371_13(receiver), p1);
        break;
    }
case 107:
{
        __fieldWrite371_16(__fieldRead371_15(receiver), p1);
        break;
    }
case 108:
{
        __fieldWrite371_18(__fieldRead371_17(receiver), p1);
        break;
    }
case 109:
{
        __fieldWrite371_20(__fieldRead371_19(receiver), p1);
        break;
    }
case 110:
{
        __fieldWrite371_22(__fieldRead371_21(receiver), p1);
        break;
    }
case 111:
{
        __fieldWrite371_24(__fieldRead371_23(receiver), p1);
        break;
    }
case 112:
{
        __fieldWrite371_26(__fieldRead371_25(receiver), p1);
        break;
    }
case 113:
{
        __fieldWrite371_28(__fieldRead371_27(receiver), p1);
        break;
    }
case 114:
{
        __fieldWrite371_30(__fieldRead371_29(receiver), p1);
        break;
    }
case 115:
{
        __fieldWrite371_32(__fieldRead371_31(receiver), p1);
    }
case 116:
case 117:
case 118:
case 119:
case 120:
case 121:
case 122:
case 123:
case 124:
case 125:
case 126:
case 127:
case 128:
case 129:
case 130:
case 131:
case 132:
case 133:
case 134:
case 135:
case 136:
case 137:
case 138:
case 139:
case 140:
case 141:
case 142:
case 143:
case 144:
case 145:
case 146:
case 147:
case 148:
case 149:
case 150:
case 151:
case 152:
case 153:
case 154:
case 155:
case 156:
case 161:
case 188:
default:
{
        break;
    }
case 157:
{
        __fieldWrite371_34(__fieldRead371_33(receiver), ((int) p1));
        break;
    }
case 158:
{
        __fieldWrite371_36(__fieldRead371_35(receiver), ((int) p1));
        break;
    }
case 159:
{
        __fieldWrite371_38(__fieldRead371_37(receiver), ((int) p1));
        break;
    }
case 160:
{
        __fieldWrite371_40(__fieldRead371_39(receiver), ((int) p1));
        break;
    }
case 162:
{
        __fieldWrite371_42(__fieldRead371_41(receiver), ((int) p1));
        break;
    }
case 163:
{
        __fieldWrite371_44(__fieldRead371_43(receiver), ((int) p1));
        break;
    }
case 164:
{
        __fieldWrite371_46(__fieldRead371_45(receiver), ((int) p1));
        break;
    }
case 165:
{
        __fieldWrite371_48(__fieldRead371_47(receiver), ((int) p1));
        break;
    }
case 166:
{
        __fieldWrite371_50(__fieldRead371_49(receiver), ((int) p1));
        break;
    }
case 167:
{
        __fieldWrite371_52(__fieldRead371_51(receiver), ((int) p1));
        break;
    }
case 168:
{
        __fieldWrite371_54(__fieldRead371_53(receiver), ((int) p1));
        break;
    }
case 169:
{
        __fieldWrite371_56(__fieldRead371_55(receiver), ((int) p1));
        break;
    }
case 170:
{
        __fieldWrite371_58(__fieldRead371_57(receiver), ((int) p1));
        break;
    }
case 171:
{
        __fieldWrite371_60(__fieldRead371_59(receiver), ((int) p1));
        break;
    }
case 172:
{
        __fieldWrite371_62(__fieldRead371_61(receiver), ((int) p1));
        break;
    }
case 173:
{
        __fieldWrite371_64(__fieldRead371_63(receiver), ((int) p1));
        break;
    }
case 174:
{
        __fieldWrite371_66(__fieldRead371_65(receiver), ((int) p1));
        break;
    }
case 175:
{
        __fieldWrite371_68(__fieldRead371_67(receiver), ((int) p1));
        break;
    }
case 176:
{
        __fieldWrite371_70(__fieldRead371_69(receiver), ((int) p1));
        break;
    }
case 177:
{
        __fieldWrite371_72(__fieldRead371_71(receiver), ((int) p1));
        break;
    }
case 178:
{
        __fieldWrite371_74(__fieldRead371_73(receiver), ((int) p1));
        break;
    }
case 179:
{
        __fieldWrite371_76(__fieldRead371_75(receiver), ((int) p1));
        break;
    }
case 180:
{
        __fieldWrite371_78(__fieldRead371_77(receiver), ((int) p1));
        break;
    }
case 181:
{
        __fieldWrite371_80(__fieldRead371_79(receiver), ((int) p1));
        break;
    }
case 182:
{
        __fieldWrite371_82(__fieldRead371_81(receiver), ((int) p1));
        break;
    }
case 183:
{
        __fieldWrite371_84(__fieldRead371_83(receiver), ((int) p1));
        break;
    }
case 184:
{
        __fieldWrite371_86(__fieldRead371_85(receiver), ((int) p1));
        break;
    }
case 185:
{
        __fieldWrite371_88(__fieldRead371_87(receiver), ((int) p1));
        break;
    }
case 186:
{
        __fieldWrite371_90(__fieldRead371_89(receiver), ((int) p1));
        break;
    }
case 187:
{
        __fieldWrite371_92(__fieldRead371_91(receiver), ((int) p1));
        break;
    }
case 189:
{
        __fieldWrite371_94(__fieldRead371_93(receiver), ((int) p1));
        break;
    }
case 190:
{
        __fieldWrite371_96(__fieldRead371_95(receiver), ((int) p1));
        break;
    }
case 191:
{
        __fieldWrite371_98(__fieldRead371_97(receiver), ((int) p1));
        break;
    }
case 192:
{
        __fieldWrite371_100(__fieldRead371_99(receiver), ((int) p1));
        break;
    }
case 193:
{
        __fieldWrite371_102(__fieldRead371_101(receiver), ((int) p1));
        break;
    }
case 194:
{
        __fieldWrite371_104(__fieldRead371_103(receiver), ((int) p1));
        break;
    }
case 195:
{
        __fieldWrite371_106(__fieldRead371_105(receiver), ((int) p1));
        break;
    }
case 196:
{
        __fieldWrite371_108(__fieldRead371_107(receiver), ((int) p1));
        break;
    }
case 197:
{
        __fieldWrite371_110(__fieldRead371_109(receiver), ((int) p1));
        break;
    }
case 198:
{
        __fieldWrite371_112(__fieldRead371_111(receiver), ((int) p1));
        break;
    }
case 199:
{
        __fieldWrite371_114(__fieldRead371_113(receiver), ((int) p1));
        break;
    }
case 200:
{
        __fieldWrite371_116(__fieldRead371_115(receiver), ((int) p1));
        break;
    }
case 201:
{
        __fieldWrite371_118(__fieldRead371_117(receiver), ((int) p1));
        break;
    }
case 202:
{
        __fieldWrite371_120(__fieldRead371_119(receiver), ((int) p1));
        break;
    }
case 203:
{
        __fieldWrite371_122(__fieldRead371_121(receiver), ((int) p1));
        break;
    }
case 204:
{
        __fieldWrite371_124(__fieldRead371_123(receiver), ((int) p1));
        break;
    }
case 205:
{
        __fieldWrite371_126(__fieldRead371_125(receiver), ((int) p1));
        break;
    }
case 206:
{
        __fieldWrite371_128(__fieldRead371_127(receiver), ((int) p1));
        break;
    }
case 207:
{
        __fieldWrite371_130(__fieldRead371_129(receiver), ((int) p1));
        break;
    }
case 208:
{
        __fieldWrite371_132(__fieldRead371_131(receiver), ((int) p1));
        break;
    }
case 209:
{
        __fieldWrite371_134(__fieldRead371_133(receiver), ((int) p1));
        break;
    }
}
    if ((p0 >= __invokedynamic371_135(10037, (1701264608732515927L ^ life3_3)))) {
        if ((p0 < __invokedynamic371_136(8291, (6538059289695357240L ^ life3_3)))) {
        life5_426 = __call371_140(__fieldRead371_137(receiver), ((p0 - __invokedynamic371_138(10037, (1701264608732515927L ^ life3_3))) + __invokedynamic371_139(31902, (6081912675949467081L ^ life3_3))));
        if ((life5_426 != null)) {
        __call371_143(__cast371_141(life5_426), __call371_142(receiver, p0, p1));
    }
    }
    }
    if ((!__call371_146(__fieldRead371_144(receiver), __fieldRead371_145(receiver)))) {
        __call371_147(receiver, 1);
    }
    return;
}
public static void h371_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2037100_0(p0);
}
public static void h371_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2037101_0(p0);
}
public static void h371_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2037102_0(p0);
}
public static void h371_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call2037103_0(p0);
}
private static native long __fieldRead371_0() throws Throwable;
private static native moom.FE __fieldRead371_1(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_2(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_3(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_4(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_5(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_6(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_7(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_8(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_9(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_10(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_11(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_12(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_13(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_14(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_15(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_16(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_17(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_18(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_19(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_20(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_21(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_22(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_23(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_24(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_25(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_26(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_27(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_28(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_29(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_30(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_31(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_32(moom.FE a0, float a1) throws Throwable;
private static native moom.FE __fieldRead371_33(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_34(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_35(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_36(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_37(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_38(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_39(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_40(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_41(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_42(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_43(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_44(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_45(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_46(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_47(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_48(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_49(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_50(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_51(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_52(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_53(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_54(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_55(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_56(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_57(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_58(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_59(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_60(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_61(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_62(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_63(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_64(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_65(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_66(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_67(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_68(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_69(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_70(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_71(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_72(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_73(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_74(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_75(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_76(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_77(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_78(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_79(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_80(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_81(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_82(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_83(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_84(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_85(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_86(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_87(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_88(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_89(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_90(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_91(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_92(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_93(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_94(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_95(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_96(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_97(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_98(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_99(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_100(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_101(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_102(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_103(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_104(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_105(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_106(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_107(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_108(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_109(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_110(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_111(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_112(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_113(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_114(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_115(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_116(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_117(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_118(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_119(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_120(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_121(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_122(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_123(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_124(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_125(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_126(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_127(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_128(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_129(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_130(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_131(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_132(moom.FE a0, int a1) throws Throwable;
private static native moom.FE __fieldRead371_133(moom.gN a0) throws Throwable;
private static native void __fieldWrite371_134(moom.FE a0, int a1) throws Throwable;
private static native int __invokedynamic371_135(int a0, long a1) throws Throwable;
private static native int __invokedynamic371_136(int a0, long a1) throws Throwable;
private static native moom.h8 __fieldRead371_137(moom.gN a0) throws Throwable;
private static native int __invokedynamic371_138(int a0, long a1) throws Throwable;
private static native int __invokedynamic371_139(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.Gui __call371_140(moom.h8 a0, int a1) throws Throwable;
private static native moom.hJ __cast371_141(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native java.lang.String __call371_142(moom.gN a0, int a1, float a2) throws Throwable;
private static native void __call371_143(moom.hJ a0, java.lang.String a1) throws Throwable;
private static native moom.FE __fieldRead371_144(moom.gN a0) throws Throwable;
private static native moom.FE __fieldRead371_145(moom.gN a0) throws Throwable;
private static native boolean __call371_146(moom.FE a0, moom.FE a1) throws Throwable;
private static native void __call371_147(moom.gN a0, int a1) throws Throwable;
private static native java.lang.Exception __call2037100_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call2037101_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call2037102_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call2037103_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_06536865478dc713964d(moom.gN a0, moom.gc a1) throws E;
private static final class __SourceHandler_06536865478dc713964d {

public static void f434(moom.gN receiver, moom.gc p0) throws Throwable {
    long life2_3;
    int life4_23;
    moom.hR life5_33;
    net.minecraft.client.gui.Gui life6_36;
    moom.gc life7_42;
    float life8_65;
    net.minecraft.client.gui.Gui life7_86;
    moom.gc life8_92;
    float life9_115;
    forest_join_174: {
    forest_join_169: {
    forest_join_166: {
    forest_join_158: {
    forest_join_147: {
    forest_join_141: {
    forest_join_135: {
    forest_join_134: {
    forest_join_22: {
    forest_join_10: {
    life2_3 = (__fieldRead434_0() ^ 116659751949308L);
    if (!(__fieldRead434_1(p0))) {
        break forest_join_174;
    }
    switch (__fieldRead434_2(p0)) {
case 300:
{
        break forest_join_10;
    }
case 301:
{
        break forest_join_22;
    }
case 302:
{
        break forest_join_135;
    }
case 303:
{
        break forest_join_141;
    }
case 304:
{
        break forest_join_147;
    }
case 305:
{
        break forest_join_158;
    }
case 306:
{
        break forest_join_166;
    }
case 307:
{
        break forest_join_169;
    }
default:
{
        break forest_join_174;
    }
}
    }
    __fieldWrite434_6(__fieldRead434_3(receiver), __call434_5(__fieldRead434_4(receiver)));
    __call434_9(__fieldRead434_7(receiver), __fieldRead434_8(receiver));
    break forest_join_174;
    }
    life4_23 = 0;
    forest_cycle_24: while (true) {
    forest_join_132: {
    forest_join_123: {
    forest_join_83: {
    forest_join_74: {
    if (!((life4_23 < __call434_11(__fieldRead434_10(receiver))))) {
        break forest_join_134;
    }
    life5_33 = __call434_13(__fieldRead434_12(receiver), life4_23);
    life6_36 = __call434_14(life5_33);
    if (!((__instanceOf434_15(life6_36) != 0))) {
        break forest_join_83;
    }
    life7_42 = __cast434_16(life6_36);
    if (!((__instanceOf434_17(life7_42) != 0))) {
        break forest_join_74;
    }
    life8_65 = ((__call434_19(__cast434_18(life7_42)) * (0x1.8p-1f + (__call434_21(__fieldRead434_20(receiver)) * 0x1.0p-1f))) + ((__call434_23(__fieldRead434_22(receiver)) * 0x1.99999ap-4f) - 0x1.99999ap-5f));
    __call434_26(__cast434_24(life7_42), __call434_25(life8_65, 0x0.0p0f, 0x1.0p0f));
    break forest_join_83;
    }
    if (!((__instanceOf434_27(life7_42) != 0))) {
        break forest_join_83;
    }
    __call434_31(__cast434_28(life7_42), __call434_30(__fieldRead434_29(receiver)));
    }
    life7_86 = __call434_32(life5_33);
    if (!((__instanceOf434_33(life7_86) != 0))) {
        break forest_join_132;
    }
    life8_92 = __cast434_34(life7_86);
    if (!((__instanceOf434_35(life8_92) != 0))) {
        break forest_join_123;
    }
    life9_115 = ((__call434_37(__cast434_36(life8_92)) * (0x1.8p-1f + (__call434_39(__fieldRead434_38(receiver)) * 0x1.0p-1f))) + ((__call434_41(__fieldRead434_40(receiver)) * 0x1.99999ap-4f) - 0x1.99999ap-5f));
    __call434_44(__cast434_42(life8_92), __call434_43(life9_115, 0x0.0p0f, 0x1.0p0f));
    break forest_join_132;
    }
    if (!((__instanceOf434_45(life8_92) != 0))) {
        break forest_join_132;
    }
    __call434_49(__cast434_46(life8_92), __call434_48(__fieldRead434_47(receiver)));
    }
    life4_23 += 1;
    continue forest_cycle_24;
    }
    }
    return;
    }
    __call434_51(__fieldRead434_50(receiver));
    __call434_52(receiver);
    break forest_join_174;
    }
    __call434_54(__fieldRead434_53(receiver));
    __call434_55(receiver);
    break forest_join_174;
    }
    if (!(__fieldRead434_56(receiver))) {
        break forest_join_174;
    }
    __call434_58(receiver, __invokedynamic434_57(3654, (9014707763374053397L ^ life2_3)));
    break forest_join_174;
    }
    __call434_60(__fieldRead434_59(receiver), new moom.g2(receiver));
    break forest_join_174;
    }
    __call434_61(receiver);
    break forest_join_174;
    }
    __fieldWrite434_62(receiver, 0);
    __call434_63(receiver);
    }
    return;
}
public static void h434_0(java.io.IOException p0) throws Throwable {
    throw __call3043400_0(p0);
}
public static void h434_1(java.io.IOException p0) throws Throwable {
    throw __call3043401_0(p0);
}
public static void h434_2(java.io.IOException p0) throws Throwable {
    throw __call3043402_0(p0);
}
public static void h434_3(java.io.IOException p0) throws Throwable {
    throw __call3043403_0(p0);
}
public static void h434_4(java.io.IOException p0) throws Throwable {
    throw __call3043404_0(p0);
}
private static native long __fieldRead434_0() throws Throwable;
private static native boolean __fieldRead434_1(moom.gc a0) throws Throwable;
private static native int __fieldRead434_2(moom.gc a0) throws Throwable;
private static native net.minecraft.client.gui.GuiCreateWorld __fieldRead434_3(moom.gN a0) throws Throwable;
private static native moom.FE __fieldRead434_4(moom.gN a0) throws Throwable;
private static native java.lang.String __call434_5(moom.FE a0) throws Throwable;
private static native void __fieldWrite434_6(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead434_7(moom.gN a0) throws Throwable;
private static native net.minecraft.client.gui.GuiCreateWorld __fieldRead434_8(moom.gN a0) throws Throwable;
private static native void __call434_9(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiCreateWorld a1) throws Throwable;
private static native moom.h8 __fieldRead434_10(moom.gN a0) throws Throwable;
private static native int __call434_11(moom.h8 a0) throws Throwable;
private static native moom.h8 __fieldRead434_12(moom.gN a0) throws Throwable;
private static native moom.hR __call434_13(moom.h8 a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.Gui __call434_14(moom.hR a0) throws Throwable;
private static native int __instanceOf434_15(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native moom.gc __cast434_16(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native int __instanceOf434_17(moom.gc a0) throws Throwable;
private static native moom.gp __cast434_18(moom.gc a0) throws Throwable;
private static native float __call434_19(moom.gp a0) throws Throwable;
private static native java.util.Random __fieldRead434_20(moom.gN a0) throws Throwable;
private static native float __call434_21(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead434_22(moom.gN a0) throws Throwable;
private static native float __call434_23(java.util.Random a0) throws Throwable;
private static native moom.gp __cast434_24(moom.gc a0) throws Throwable;
private static native float __call434_25(float a0, float a1, float a2) throws Throwable;
private static native void __call434_26(moom.gp a0, float a1) throws Throwable;
private static native int __instanceOf434_27(moom.gc a0) throws Throwable;
private static native moom.gf __cast434_28(moom.gc a0) throws Throwable;
private static native java.util.Random __fieldRead434_29(moom.gN a0) throws Throwable;
private static native boolean __call434_30(java.util.Random a0) throws Throwable;
private static native void __call434_31(moom.gf a0, boolean a1) throws Throwable;
private static native net.minecraft.client.gui.Gui __call434_32(moom.hR a0) throws Throwable;
private static native int __instanceOf434_33(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native moom.gc __cast434_34(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native int __instanceOf434_35(moom.gc a0) throws Throwable;
private static native moom.gp __cast434_36(moom.gc a0) throws Throwable;
private static native float __call434_37(moom.gp a0) throws Throwable;
private static native java.util.Random __fieldRead434_38(moom.gN a0) throws Throwable;
private static native float __call434_39(java.util.Random a0) throws Throwable;
private static native java.util.Random __fieldRead434_40(moom.gN a0) throws Throwable;
private static native float __call434_41(java.util.Random a0) throws Throwable;
private static native moom.gp __cast434_42(moom.gc a0) throws Throwable;
private static native float __call434_43(float a0, float a1, float a2) throws Throwable;
private static native void __call434_44(moom.gp a0, float a1) throws Throwable;
private static native int __instanceOf434_45(moom.gc a0) throws Throwable;
private static native moom.gf __cast434_46(moom.gc a0) throws Throwable;
private static native java.util.Random __fieldRead434_47(moom.gN a0) throws Throwable;
private static native boolean __call434_48(java.util.Random a0) throws Throwable;
private static native void __call434_49(moom.gf a0, boolean a1) throws Throwable;
private static native moom.h8 __fieldRead434_50(moom.gN a0) throws Throwable;
private static native void __call434_51(moom.h8 a0) throws Throwable;
private static native void __call434_52(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead434_53(moom.gN a0) throws Throwable;
private static native void __call434_54(moom.h8 a0) throws Throwable;
private static native void __call434_55(moom.gN a0) throws Throwable;
private static native boolean __fieldRead434_56(moom.gN a0) throws Throwable;
private static native int __invokedynamic434_57(int a0, long a1) throws Throwable;
private static native void __call434_58(moom.gN a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead434_59(moom.gN a0) throws Throwable;
private static native void __call434_60(net.minecraft.client.Minecraft a0, moom.g2 a1) throws Throwable;
private static native void __call434_61(moom.gN a0) throws Throwable;
private static native void __fieldWrite434_62(moom.gN a0, int a1) throws Throwable;
private static native void __call434_63(moom.gN a0) throws Throwable;
private static native java.lang.Exception __call3043400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3043404_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1bc4678bc4d2dff46827(moom.gN a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_1bc4678bc4d2dff46827 {

public static void f1752(moom.gN receiver, int p0, int p1, int p2) throws Throwable {
    __call1752_0(receiver, p0, p1, p2);
    if (__fieldRead1752_1(receiver)) {
        __fieldWrite1752_2(receiver, 0);
    } else {
        if ((__fieldRead1752_3(receiver) == 0)) {
        __call1752_5(__fieldRead1752_4(receiver), p0, p1, p2);
    }
    }
    return;
}
public static void h1752_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1175200_0(p0);
}
public static void h1752_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1175201_0(p0);
}
private static native void __call1752_0(moom.gN a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __fieldRead1752_1(moom.gN a0) throws Throwable;
private static native void __fieldWrite1752_2(moom.gN a0, int a1) throws Throwable;
private static native int __fieldRead1752_3(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead1752_4(moom.gN a0) throws Throwable;
private static native boolean __call1752_5(moom.h8 a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1175200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1175201_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1896e7eb981b5daa7cf0(moom.gN a0, boolean a1) throws E;
private static final class __SourceHandler_1896e7eb981b5daa7cf0 {

public static void f1038(moom.gN receiver, boolean p0) throws Throwable {
    moom.gc forwardValue1038_14_0;
    moom.gc forwardValue1038_15_0;
    int forwardValue1038_15_1;
    moom.gc forwardValue1038_22_0;
    moom.gc forwardValue1038_23_0;
    int forwardValue1038_23_1;
    moom.gc forwardValue1038_30_0;
    moom.gc forwardValue1038_31_0;
    int forwardValue1038_31_1;
    moom.gc forwardValue1038_38_0;
    moom.gc forwardValue1038_39_0;
    int forwardValue1038_39_1;
    moom.gc forwardValue1038_49_0;
    moom.gc forwardValue1038_50_0;
    int forwardValue1038_50_1;
    moom.gc forwardValue1038_57_0;
    moom.gc forwardValue1038_58_0;
    int forwardValue1038_58_1;
    moom.h8 forwardValue1038_65_0;
    moom.h8 forwardValue1038_66_0;
    int forwardValue1038_66_1;
    moom.gc spill1038_0;
    moom.gc spill1038_1;
    moom.gc spill1038_2;
    moom.gc spill1038_3;
    moom.gc spill1038_4;
    moom.gc spill1038_5;
    moom.h8 spill1038_6;
    forward_join_66: {
    forward_join_65: {
    forward_join_58: {
    forward_join_57: {
    forward_join_50: {
    forward_join_49: {
    forward_join_39: {
    forward_join_38: {
    forward_join_31: {
    forward_join_30: {
    forward_join_23: {
    forward_join_22: {
    forward_join_15: {
    forward_join_14: {
    __fieldWrite1038_1(__fieldRead1038_0(receiver), p0);
    __fieldWrite1038_3(__fieldRead1038_2(receiver), p0);
    spill1038_0 = __fieldRead1038_4(receiver);
    if (!((!p0))) {
        forwardValue1038_14_0 = spill1038_0;
        break forward_join_14;
    }
    forwardValue1038_15_0 = spill1038_0;
    forwardValue1038_15_1 = 1;
    break forward_join_15;
    }
    forwardValue1038_15_0 = forwardValue1038_14_0;
    forwardValue1038_15_1 = 0;
    }
    __fieldWrite1038_5(forwardValue1038_15_0, forwardValue1038_15_1);
    spill1038_1 = __fieldRead1038_6(receiver);
    if (!((!p0))) {
        forwardValue1038_22_0 = spill1038_1;
        break forward_join_22;
    }
    forwardValue1038_23_0 = spill1038_1;
    forwardValue1038_23_1 = 1;
    break forward_join_23;
    }
    forwardValue1038_23_0 = forwardValue1038_22_0;
    forwardValue1038_23_1 = 0;
    }
    __fieldWrite1038_7(forwardValue1038_23_0, forwardValue1038_23_1);
    spill1038_2 = __fieldRead1038_8(receiver);
    if (!((!p0))) {
        forwardValue1038_30_0 = spill1038_2;
        break forward_join_30;
    }
    forwardValue1038_31_0 = spill1038_2;
    forwardValue1038_31_1 = 1;
    break forward_join_31;
    }
    forwardValue1038_31_0 = forwardValue1038_30_0;
    forwardValue1038_31_1 = 0;
    }
    __fieldWrite1038_9(forwardValue1038_31_0, forwardValue1038_31_1);
    spill1038_3 = __fieldRead1038_10(receiver);
    if (!((!p0))) {
        forwardValue1038_38_0 = spill1038_3;
        break forward_join_38;
    }
    forwardValue1038_39_0 = spill1038_3;
    forwardValue1038_39_1 = 1;
    break forward_join_39;
    }
    forwardValue1038_39_0 = forwardValue1038_38_0;
    forwardValue1038_39_1 = 0;
    }
    __fieldWrite1038_11(forwardValue1038_39_0, forwardValue1038_39_1);
    spill1038_4 = __fieldRead1038_12(receiver);
    if (!(__fieldRead1038_13(receiver))) {
        forwardValue1038_49_0 = spill1038_4;
        break forward_join_49;
    }
    if (!((!p0))) {
        forwardValue1038_49_0 = spill1038_4;
        break forward_join_49;
    }
    forwardValue1038_50_0 = spill1038_4;
    forwardValue1038_50_1 = 1;
    break forward_join_50;
    }
    forwardValue1038_50_0 = forwardValue1038_49_0;
    forwardValue1038_50_1 = 0;
    }
    __fieldWrite1038_14(forwardValue1038_50_0, forwardValue1038_50_1);
    spill1038_5 = __fieldRead1038_15(receiver);
    if (!((!p0))) {
        forwardValue1038_57_0 = spill1038_5;
        break forward_join_57;
    }
    forwardValue1038_58_0 = spill1038_5;
    forwardValue1038_58_1 = 1;
    break forward_join_58;
    }
    forwardValue1038_58_0 = forwardValue1038_57_0;
    forwardValue1038_58_1 = 0;
    }
    __fieldWrite1038_16(forwardValue1038_58_0, forwardValue1038_58_1);
    spill1038_6 = __fieldRead1038_17(receiver);
    if (!((!p0))) {
        forwardValue1038_65_0 = spill1038_6;
        break forward_join_65;
    }
    forwardValue1038_66_0 = spill1038_6;
    forwardValue1038_66_1 = 1;
    break forward_join_66;
    }
    forwardValue1038_66_0 = forwardValue1038_65_0;
    forwardValue1038_66_1 = 0;
    }
    __call1038_18(forwardValue1038_66_0, forwardValue1038_66_1);
    return;
}
public static void h1038_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103800_0(p0);
}
public static void h1038_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103801_0(p0);
}
public static void h1038_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103802_0(p0);
}
public static void h1038_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103803_0(p0);
}
public static void h1038_4(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103804_0(p0);
}
public static void h1038_5(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103805_0(p0);
}
public static void h1038_6(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103806_0(p0);
}
public static void h1038_7(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103807_0(p0);
}
private static native moom.gc __fieldRead1038_0(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_1(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1038_2(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_3(moom.gc a0, boolean a1) throws Throwable;
private static native moom.gc __fieldRead1038_4(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_5(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1038_6(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_7(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1038_8(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_9(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1038_10(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_11(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1038_12(moom.gN a0) throws Throwable;
private static native boolean __fieldRead1038_13(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_14(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1038_15(moom.gN a0) throws Throwable;
private static native void __fieldWrite1038_16(moom.gc a0, int a1) throws Throwable;
private static native moom.h8 __fieldRead1038_17(moom.gN a0) throws Throwable;
private static native void __call1038_18(moom.h8 a0, int a1) throws Throwable;
private static native java.lang.Exception __call1103800_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103801_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103802_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103803_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103804_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103805_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103806_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103807_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7e21739a9c4a379fa22d(moom.gN a0) throws E;
private static final class __SourceHandler_7e21739a9c4a379fa22d {

public static void f172(moom.gN receiver) throws Throwable {
    long life1_3;
    int life3_5;
    int life4_7;
    life1_3 = (__fieldRead172_0() ^ 45723595866653L);
    life3_5 = 0;
    life4_7 = 0;
    if ((__fieldRead172_1(receiver) != null)) {
        life3_5 = __call172_3(__fieldRead172_2(receiver));
        life4_7 = __call172_5(__fieldRead172_4(receiver));
    }
    __fieldWrite172_7(receiver, __call172_6("options.customizeTitle", new java.lang.Object[0]));
    __call172_9(__fieldRead172_8(receiver));
    java.util.List spill172_0 = __fieldRead172_10(receiver);
    moom.gN __stackOp172_16_0 = receiver;
    moom.gc __stackOp172_16_1 = new moom.gc(__invokedynamic172_11(28618, (2277011099094558855L ^ life1_3)), __invokedynamic172_12(18186, (9202440386662760490L ^ life1_3)), 5, __invokedynamic172_13(26819, (6655304533209657242L ^ life1_3)), __invokedynamic172_14(20799, (3297527218399909437L ^ life1_3)), __call172_15("createWorld.customize.custom.prev", new java.lang.Object[0]));
    moom.gc spill172_1 = __stackOp172_16_1;
    __fieldWrite172_17(__stackOp172_16_0, __stackOp172_16_1);
    __call172_18(spill172_0, spill172_1);
    java.util.List spill172_2 = __fieldRead172_19(receiver);
    moom.gN __stackOp172_26_0 = receiver;
    moom.gc __stackOp172_26_1 = new moom.gc(__invokedynamic172_20(12518, (6507727349682403302L ^ life1_3)), (__fieldRead172_21(receiver) - __invokedynamic172_22(10037, (1701269559613579267L ^ life1_3))), 5, __invokedynamic172_23(14763, (6394138169149587031L ^ life1_3)), __invokedynamic172_24(20799, (3297527218399909437L ^ life1_3)), __call172_25("createWorld.customize.custom.next", new java.lang.Object[0]));
    moom.gc spill172_3 = __stackOp172_26_1;
    __fieldWrite172_27(__stackOp172_26_0, __stackOp172_26_1);
    __call172_28(spill172_2, spill172_3);
    java.util.List spill172_4 = __fieldRead172_29(receiver);
    moom.gN __stackOp172_38_0 = receiver;
    moom.gc __stackOp172_38_1 = new moom.gc(__invokedynamic172_30(19526, (939959344576924446L ^ life1_3)), ((__fieldRead172_31(receiver) / 2) - __invokedynamic172_32(19272, (33079450046860478L ^ life1_3))), (__fieldRead172_33(receiver) - __invokedynamic172_34(10621, (4357859670854561436L ^ life1_3))), __invokedynamic172_35(4404, (247593396619368041L ^ life1_3)), __invokedynamic172_36(20799, (3297527218399909437L ^ life1_3)), __call172_37("createWorld.customize.custom.defaults", new java.lang.Object[0]));
    moom.gc spill172_5 = __stackOp172_38_1;
    __fieldWrite172_39(__stackOp172_38_0, __stackOp172_38_1);
    __call172_40(spill172_4, spill172_5);
    java.util.List spill172_6 = __fieldRead172_41(receiver);
    moom.gN __stackOp172_50_0 = receiver;
    moom.gc __stackOp172_50_1 = new moom.gc(__invokedynamic172_42(32202, (3799576525126056652L ^ life1_3)), ((__fieldRead172_43(receiver) / 2) - __invokedynamic172_44(19725, (2139098067855379093L ^ life1_3))), (__fieldRead172_45(receiver) - __invokedynamic172_46(12940, (6864849719258904022L ^ life1_3))), __invokedynamic172_47(7577, (4326438030516804204L ^ life1_3)), __invokedynamic172_48(20799, (3297527218399909437L ^ life1_3)), __call172_49("createWorld.customize.custom.randomize", new java.lang.Object[0]));
    moom.gc spill172_7 = __stackOp172_50_1;
    __fieldWrite172_51(__stackOp172_50_0, __stackOp172_50_1);
    __call172_52(spill172_6, spill172_7);
    java.util.List spill172_8 = __fieldRead172_53(receiver);
    moom.gN __stackOp172_61_0 = receiver;
    moom.gc __stackOp172_61_1 = new moom.gc(__invokedynamic172_54(5911, (4829687401773125660L ^ life1_3)), ((__fieldRead172_55(receiver) / 2) + 3), (__fieldRead172_56(receiver) - __invokedynamic172_57(12940, (6864849719258904022L ^ life1_3))), __invokedynamic172_58(7577, (4326438030516804204L ^ life1_3)), __invokedynamic172_59(20799, (3297527218399909437L ^ life1_3)), __call172_60("createWorld.customize.custom.presets", new java.lang.Object[0]));
    moom.gc spill172_9 = __stackOp172_61_1;
    __fieldWrite172_62(__stackOp172_61_0, __stackOp172_61_1);
    __call172_63(spill172_8, spill172_9);
    java.util.List spill172_10 = __fieldRead172_64(receiver);
    moom.gN __stackOp172_73_0 = receiver;
    moom.gc __stackOp172_73_1 = new moom.gc(__invokedynamic172_65(16861, (5935576302282704589L ^ life1_3)), ((__fieldRead172_66(receiver) / 2) + __invokedynamic172_67(1058, (8291108297958900583L ^ life1_3))), (__fieldRead172_68(receiver) - __invokedynamic172_69(12940, (6864849719258904022L ^ life1_3))), __invokedynamic172_70(7577, (4326438030516804204L ^ life1_3)), __invokedynamic172_71(20799, (3297527218399909437L ^ life1_3)), __call172_72("gui.done", new java.lang.Object[0]));
    moom.gc spill172_11 = __stackOp172_73_1;
    __fieldWrite172_74(__stackOp172_73_0, __stackOp172_73_1);
    __call172_75(spill172_10, spill172_11);
    __fieldWrite172_78(__fieldRead172_76(receiver), __fieldRead172_77(receiver));
    __fieldWrite172_86(receiver, new moom.gc(__invokedynamic172_79(9294, (344174355728163636L ^ life1_3)), ((__fieldRead172_80(receiver) / 2) - __invokedynamic172_81(7891, (7808847030365182254L ^ life1_3))), __invokedynamic172_82(8210, (4106509942350374766L ^ life1_3)), __invokedynamic172_83(9341, (2055884062051165065L ^ life1_3)), __invokedynamic172_84(20799, (3297527218399909437L ^ life1_3)), __call172_85("gui.yes", new java.lang.Object[0])));
    __fieldWrite172_88(__fieldRead172_87(receiver), 0);
    __call172_91(__fieldRead172_89(receiver), __fieldRead172_90(receiver));
    __fieldWrite172_98(receiver, new moom.gc(__invokedynamic172_92(31623, (5470860536006425808L ^ life1_3)), ((__fieldRead172_93(receiver) / 2) + 5), __invokedynamic172_94(23743, (8640920167727340500L ^ life1_3)), __invokedynamic172_95(18040, (7634668381044408659L ^ life1_3)), __invokedynamic172_96(20799, (3297527218399909437L ^ life1_3)), __call172_97("gui.no", new java.lang.Object[0])));
    __fieldWrite172_100(__fieldRead172_99(receiver), 0);
    __call172_103(__fieldRead172_101(receiver), __fieldRead172_102(receiver));
    if ((__fieldRead172_104(receiver) != 0)) {
        __fieldWrite172_106(__fieldRead172_105(receiver), 1);
        __fieldWrite172_108(__fieldRead172_107(receiver), 1);
    }
    __call172_109(receiver);
    if ((life3_5 != 0)) {
        __call172_111(__fieldRead172_110(receiver), life3_5);
        __call172_113(__fieldRead172_112(receiver), life4_7);
        __call172_114(receiver);
    }
    return;
}
public static void h172_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1017200_0(p0);
}
public static void h172_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1017201_0(p0);
}
private static native long __fieldRead172_0() throws Throwable;
private static native moom.h8 __fieldRead172_1(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead172_2(moom.gN a0) throws Throwable;
private static native int __call172_3(moom.h8 a0) throws Throwable;
private static native moom.h8 __fieldRead172_4(moom.gN a0) throws Throwable;
private static native int __call172_5(moom.h8 a0) throws Throwable;
private static native java.lang.String __call172_6(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_7(moom.gN a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead172_8(moom.gN a0) throws Throwable;
private static native void __call172_9(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead172_10(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_14(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_15(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_17(moom.gN a0, moom.gc a1) throws Throwable;
private static native boolean __call172_18(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead172_19(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_20(int a0, long a1) throws Throwable;
private static native int __fieldRead172_21(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_24(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_25(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_27(moom.gN a0, moom.gc a1) throws Throwable;
private static native boolean __call172_28(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead172_29(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_30(int a0, long a1) throws Throwable;
private static native int __fieldRead172_31(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_32(int a0, long a1) throws Throwable;
private static native int __fieldRead172_33(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_36(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_37(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_39(moom.gN a0, moom.gc a1) throws Throwable;
private static native boolean __call172_40(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead172_41(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_42(int a0, long a1) throws Throwable;
private static native int __fieldRead172_43(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_44(int a0, long a1) throws Throwable;
private static native int __fieldRead172_45(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_47(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_48(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_49(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_51(moom.gN a0, moom.gc a1) throws Throwable;
private static native boolean __call172_52(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead172_53(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_54(int a0, long a1) throws Throwable;
private static native int __fieldRead172_55(moom.gN a0) throws Throwable;
private static native int __fieldRead172_56(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_57(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_58(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_59(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_60(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_62(moom.gN a0, moom.gc a1) throws Throwable;
private static native boolean __call172_63(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead172_64(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_65(int a0, long a1) throws Throwable;
private static native int __fieldRead172_66(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_67(int a0, long a1) throws Throwable;
private static native int __fieldRead172_68(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_69(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_70(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_71(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_72(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_74(moom.gN a0, moom.gc a1) throws Throwable;
private static native boolean __call172_75(java.util.List a0, moom.gc a1) throws Throwable;
private static native moom.gc __fieldRead172_76(moom.gN a0) throws Throwable;
private static native boolean __fieldRead172_77(moom.gN a0) throws Throwable;
private static native void __fieldWrite172_78(moom.gc a0, boolean a1) throws Throwable;
private static native int __invokedynamic172_79(int a0, long a1) throws Throwable;
private static native int __fieldRead172_80(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_81(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_82(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_83(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_84(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_85(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_86(moom.gN a0, moom.gc a1) throws Throwable;
private static native moom.gc __fieldRead172_87(moom.gN a0) throws Throwable;
private static native void __fieldWrite172_88(moom.gc a0, int a1) throws Throwable;
private static native java.util.List __fieldRead172_89(moom.gN a0) throws Throwable;
private static native moom.gc __fieldRead172_90(moom.gN a0) throws Throwable;
private static native boolean __call172_91(java.util.List a0, moom.gc a1) throws Throwable;
private static native int __invokedynamic172_92(int a0, long a1) throws Throwable;
private static native int __fieldRead172_93(moom.gN a0) throws Throwable;
private static native int __invokedynamic172_94(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_95(int a0, long a1) throws Throwable;
private static native int __invokedynamic172_96(int a0, long a1) throws Throwable;
private static native java.lang.String __call172_97(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite172_98(moom.gN a0, moom.gc a1) throws Throwable;
private static native moom.gc __fieldRead172_99(moom.gN a0) throws Throwable;
private static native void __fieldWrite172_100(moom.gc a0, int a1) throws Throwable;
private static native java.util.List __fieldRead172_101(moom.gN a0) throws Throwable;
private static native moom.gc __fieldRead172_102(moom.gN a0) throws Throwable;
private static native boolean __call172_103(java.util.List a0, moom.gc a1) throws Throwable;
private static native int __fieldRead172_104(moom.gN a0) throws Throwable;
private static native moom.gc __fieldRead172_105(moom.gN a0) throws Throwable;
private static native void __fieldWrite172_106(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead172_107(moom.gN a0) throws Throwable;
private static native void __fieldWrite172_108(moom.gc a0, int a1) throws Throwable;
private static native void __call172_109(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead172_110(moom.gN a0) throws Throwable;
private static native void __call172_111(moom.h8 a0, int a1) throws Throwable;
private static native moom.h8 __fieldRead172_112(moom.gN a0) throws Throwable;
private static native void __call172_113(moom.h8 a0, int a1) throws Throwable;
private static native void __call172_114(moom.gN a0) throws Throwable;
private static native java.lang.Exception __call1017200_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1017201_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_08ea78ec296f5814bba8(moom.gN a0) throws E;
private static final class __SourceHandler_08ea78ec296f5814bba8 {

public static void f852(moom.gN receiver) throws Throwable {
    long life1_3;
    forest_join_21: {
    forest_join_19: {
    forest_join_7: {
    life1_3 = (__fieldRead852_0() ^ 85842351163008L);
    switch (__fieldRead852_1(receiver)) {
case 300:
{
        break forest_join_7;
    }
case 304:
{
        break forest_join_19;
    }
default:
{
        break forest_join_21;
    }
}
    }
    __call852_6(receiver, __cast852_5(__call852_4(__fieldRead852_2(receiver), __invokedynamic852_3(29119, (6414929879859442237L ^ life1_3)))));
    break forest_join_21;
    }
    __call852_7(receiver);
    }
    __fieldWrite852_8(receiver, 0);
    __fieldWrite852_9(receiver, 1);
    __call852_10(receiver, 0);
    return;
}
public static void h852_0(java.io.IOException p0) throws Throwable {
    throw __call3085200_0(p0);
}
private static native long __fieldRead852_0() throws Throwable;
private static native int __fieldRead852_1(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead852_2(moom.gN a0) throws Throwable;
private static native int __invokedynamic852_3(int a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.Gui __call852_4(moom.h8 a0, int a1) throws Throwable;
private static native moom.gf __cast852_5(net.minecraft.client.gui.Gui a0) throws Throwable;
private static native void __call852_6(moom.gN a0, moom.gf a1) throws Throwable;
private static native void __call852_7(moom.gN a0) throws Throwable;
private static native void __fieldWrite852_8(moom.gN a0, int a1) throws Throwable;
private static native void __fieldWrite852_9(moom.gN a0, int a1) throws Throwable;
private static native void __call852_10(moom.gN a0, int a1) throws Throwable;
private static native java.lang.Exception __call3085200_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1cfe26ece8063e50ba8d(moom.gN a0) throws E;
private static final class __SourceHandler_1cfe26ece8063e50ba8d {

public static void f1756(moom.gN receiver) throws Throwable {
    moom.gc spill1756_0 = __fieldRead1756_0(receiver);
    __fieldWrite1756_3(spill1756_0, ((__call1756_2(__fieldRead1756_1(receiver)) != 0) ? 1 : 0));
    moom.gc spill1756_1 = __fieldRead1756_4(receiver);
    __fieldWrite1756_9(spill1756_1, ((__call1756_6(__fieldRead1756_5(receiver)) != (__call1756_8(__fieldRead1756_7(receiver)) - 1)) ? 1 : 0));
    __fieldWrite1756_17(receiver, __call1756_16("book.pageIndicator", new java.lang.Object[] {__call1756_12((__call1756_11(__fieldRead1756_10(receiver)) + 1)), __call1756_15(__call1756_14(__fieldRead1756_13(receiver)))}));
    __fieldWrite1756_21(receiver, (__fieldRead1756_18(receiver))[__call1756_20(__fieldRead1756_19(receiver))]);
    moom.gc spill1756_2 = __fieldRead1756_22(receiver);
    __fieldWrite1756_27(spill1756_2, ((__call1756_24(__fieldRead1756_23(receiver)) != (__call1756_26(__fieldRead1756_25(receiver)) - 1)) ? 1 : 0));
    return;
}
public static void h1756_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1175600_0(p0);
}
public static void h1756_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1175601_0(p0);
}
public static void h1756_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1175602_0(p0);
}
private static native moom.gc __fieldRead1756_0(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead1756_1(moom.gN a0) throws Throwable;
private static native int __call1756_2(moom.h8 a0) throws Throwable;
private static native void __fieldWrite1756_3(moom.gc a0, int a1) throws Throwable;
private static native moom.gc __fieldRead1756_4(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead1756_5(moom.gN a0) throws Throwable;
private static native int __call1756_6(moom.h8 a0) throws Throwable;
private static native moom.h8 __fieldRead1756_7(moom.gN a0) throws Throwable;
private static native int __call1756_8(moom.h8 a0) throws Throwable;
private static native void __fieldWrite1756_9(moom.gc a0, int a1) throws Throwable;
private static native moom.h8 __fieldRead1756_10(moom.gN a0) throws Throwable;
private static native int __call1756_11(moom.h8 a0) throws Throwable;
private static native java.lang.Integer __call1756_12(int a0) throws Throwable;
private static native moom.h8 __fieldRead1756_13(moom.gN a0) throws Throwable;
private static native int __call1756_14(moom.h8 a0) throws Throwable;
private static native java.lang.Integer __call1756_15(int a0) throws Throwable;
private static native java.lang.String __call1756_16(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite1756_17(moom.gN a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead1756_18(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead1756_19(moom.gN a0) throws Throwable;
private static native int __call1756_20(moom.h8 a0) throws Throwable;
private static native void __fieldWrite1756_21(moom.gN a0, java.lang.String a1) throws Throwable;
private static native moom.gc __fieldRead1756_22(moom.gN a0) throws Throwable;
private static native moom.h8 __fieldRead1756_23(moom.gN a0) throws Throwable;
private static native int __call1756_24(moom.h8 a0) throws Throwable;
private static native moom.h8 __fieldRead1756_25(moom.gN a0) throws Throwable;
private static native int __call1756_26(moom.h8 a0) throws Throwable;
private static native void __fieldWrite1756_27(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1175600_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1175601_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1175602_0(java.lang.NumberFormatException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ce99ae199878a21c98ec(java.lang.String a0) throws E;
private static final class __SourceHandler_ce99ae199878a21c98ec {

public static boolean f1039(java.lang.String p0) throws Throwable {
    int forwardValue1039_20_0;
    java.lang.Float life1_2;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life1_2 = __call1039_0(p0);
    if (!((__call1039_1(p0) != 0))) {
        break forward_join_17;
    }
    if (!((life1_2 != null))) {
        break forward_join_19;
    }
    if (!(__call1039_3(__call1039_2(life1_2)))) {
        break forward_join_19;
    }
    if (!((__numericCompare1039_5(__call1039_4(life1_2), 0x0.0p0f) >= 0))) {
        break forward_join_19;
    }
    }
    forwardValue1039_20_0 = 1;
    break forward_join_20;
    }
    forwardValue1039_20_0 = 0;
    }
    return __integerCategory1039_6(forwardValue1039_20_0);
}
public static void h1039_0(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103900_0(p0);
}
public static void h1039_1(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103901_0(p0);
}
public static void h1039_2(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103902_0(p0);
}
public static void h1039_3(java.lang.NumberFormatException p0) throws Throwable {
    throw __call1103903_0(p0);
}
private static native java.lang.Float __call1039_0(java.lang.String a0) throws Throwable;
private static native int __call1039_1(java.lang.String a0) throws Throwable;
private static native float __call1039_2(java.lang.Float a0) throws Throwable;
private static native boolean __call1039_3(float a0) throws Throwable;
private static native float __call1039_4(java.lang.Float a0) throws Throwable;
private static native int __numericCompare1039_5(float a0, float a1) throws Throwable;
private static native boolean __integerCategory1039_6(int value) throws Throwable;
private static native java.lang.Exception __call1103900_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103901_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103902_0(java.lang.NumberFormatException a0) throws Throwable;
private static native java.lang.Exception __call1103903_0(java.lang.NumberFormatException a0) throws Throwable;

}


protected void b(int p0, int p1, int p2) { __sourceHandlerCall_1bc4678bc4d2dff46827(this, p0, p1, p2); }


private void b() {
((moom.FE)(this.P)).a__Void();
    ((moom.gN)(this)).a();
    ((moom.gN)(this)).a(((boolean)(false)));
    return;
}


private void b(boolean p0) { __sourceHandlerCall_1896e7eb981b5daa7cf0(this, p0); }


public void e() throws java.io.IOException {
super.e();
    ((moom.h8)(this.B)).c__Void();
    return;
}


public void c__Void() { __sourceHandlerCall_7e21739a9c4a379fa22d(this); }


public java.lang.String c() {
return ((java.lang.String)(((moom.FE)(this.P)).toString())).replace(((java.lang.CharSequence)("\n")), ((java.lang.CharSequence)("")));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7719_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void a(float p0) {
net.minecraft.client.gui.Gui life2_3;
    moom.hJ life3_9;
    float life4_11;
    java.lang.Float life5_40;
    java.lang.Float life5_48;
    int life6_51;
    java.lang.String life7_58;
    forward_join_66: {
    forward_join_37: {
    forward_join_25: {
    life2_3 = ((moom.h8)(this.B)).a__gb();
    if (!((((life2_3 instanceof moom.hJ) ? 1 : 0) != 0))) { break forward_join_66; }
    life3_9 = ((moom.hJ)(life2_3));
    life4_11 = p0;
    if (!(net.minecraft.client.gui.GuiScreen.c__Boolean())) { break forward_join_25; }
    life4_11 = (p0 * 0x1.99999ap-4f);
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) { break forward_join_37; }
    life4_11 = (life4_11 * 0x1.99999ap-4f);
    break forward_join_37;
    }
    if (!(net.minecraft.client.gui.GuiScreen.b__BooleanStatic())) { break forward_join_37; }
    life4_11 = (p0 * 0x1.4p3f);
    if (!(net.minecraft.client.gui.GuiScreen.d__Boolean())) { break forward_join_37; }
    life4_11 = (life4_11 * 0x1.4p3f);
    }
    life5_40 = com.google.common.primitives.Floats.tryParse(((java.lang.String)(((moom.hJ)(life3_9)).a__String())));
    if (!((life5_40 != null))) { break forward_join_66; }
    life5_48 = java.lang.Float.valueOf(((float)((((java.lang.Float)(life5_40)).floatValue() + life4_11))));
    life6_51 = ((moom.hJ)(life3_9)).a();
    life7_58 = ((moom.gN)(this)).a(((int)(((moom.hJ)(life3_9)).a())), ((float)(((java.lang.Float)(life5_48)).floatValue())));
    ((moom.hJ)(life3_9)).a(((java.lang.String)(life7_58)));
    ((moom.gN)(this)).a(((int)(life6_51)), ((java.lang.String)(life7_58)));
    }
    return;
}


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_bea3baf9a8825556536c(this, p0, p1); }


public void a(int p0, int p1, float p2) {
long life4_3;
    float life6_207;
    float life7_209;
    net.minecraft.client.renderer.Tessellator life8_213;
    moom.lw life9_216;
    float life10_228;
    life4_3 = (moom.gN.R ^ 22855038338971L);
    ((moom.gN)(this)).i();
    ((moom.h8)(this.B)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.gN)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.x)), ((int)((this.k / 2))), ((int)(2)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_7(3382, (2550223371810656067L ^ life4_3)))));
    ((moom.gN)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.y)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_12(6541, (2453460154000333799L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_13(23954, (7816086759921262343L ^ life4_3)))));
    ((moom.gN)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.z)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_18(7288, (9009887187930767090L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_19(23954, (7816086759921262343L ^ life4_3)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    if ((this.L != 0)) {
        moom.gN.a(((int)(0)), ((int)(0)), ((int)(this.k)), ((int)(this.l)), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_25(19755, (2129537476894625690L ^ life4_3)))));
        ((moom.gN)(this)).a(((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_28(27590, (249484679863314728L ^ life4_3))))), ((int)(((this.k / 2) + __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_30(7577, (4326451999893643242L ^ life4_3))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_31(14382, (8828282250670275281L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_32(3675, (3354245528488463486L ^ life4_3)))));
        ((moom.gN)(this)).a(((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_35(20886, (8387400763698844473L ^ life4_3))))), ((int)(((this.k / 2) + __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_37(7577, (4326451999893643242L ^ life4_3))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_38(17619, (6379946647351264957L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_39(19584, (3734205203998477886L ^ life4_3)))));
        ((moom.gN)(this)).b(((int)(((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_42(20886, (8387400763698844473L ^ life4_3))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_43(564, (4154731130375618674L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_44(15493, (8013735535445442148L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_45(27057, (132227131157195678L ^ life4_3)))));
        ((moom.gN)(this)).b(((int)(((this.k / 2) + __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_48(7577, (4326451999893643242L ^ life4_3))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_49(564, (4154731130375618674L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_50(15493, (8013735535445442148L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_51(12355, (1658006743704695366L ^ life4_3)))));
        life6_207 = 0x1.54p6f;
        life7_209 = 0x1.68p7f;
        moom.kZ.f();
        moom.kZ.n();
        life8_213 = net.minecraft.client.renderer.Tessellator.a();
        life9_216 = ((net.minecraft.client.renderer.Tessellator)(life8_213)).a__lw();
        ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(moom.gN.a)));
        moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
        life10_228 = 0x1.0p5f;
        ((moom.lw)(life9_216)).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_62(3557, (1826595557588324203L ^ life4_3)))), ((moom.oD)(moom.oB.k)));
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_216)).a(((double)(((double) ((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_66(7577, (4326451999893643242L ^ life4_3)))))), ((double)(0x1.72p7d)), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x1.54p1d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_69(17251, (6994428805804523925L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_70(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_71(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_72(4846, (7026835935671079042L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_216)).a(((double)(((double) ((this.k / 2) + __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_76(7577, (4326451999893643242L ^ life4_3)))))), ((double)(0x1.72p7d)), ((double)(0x0.0p0d))))).a(((double)(0x1.68p2d)), ((double)(0x1.54p1d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_79(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_80(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_81(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_82(4846, (7026835935671079042L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_216)).a(((double)(((double) ((this.k / 2) + __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_86(7577, (4326451999893643242L ^ life4_3)))))), ((double)(0x1.9p6d)), ((double)(0x0.0p0d))))).a(((double)(0x1.68p2d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_89(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_90(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_91(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_92(4846, (7026835935671079042L ^ life4_3))))))).c__Void();
        ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(life9_216)).a(((double)(((double) ((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_96(7577, (4326451999893643242L ^ life4_3)))))), ((double)(0x1.9p6d)), ((double)(0x0.0p0d))))).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d))))).a(((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_99(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_100(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_101(4846, (7026835935671079042L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_102(4846, (7026835935671079042L ^ life4_3))))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life8_213)).a__Void();
        ((moom.gN)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.custom.confirmTitle")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_109(19192, (5990572945182033933L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_110(23954, (7816086759921262343L ^ life4_3)))));
        ((moom.gN)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.custom.confirm1")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_115(11320, (4955634562157080100L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_116(23954, (7816086759921262343L ^ life4_3)))));
        ((moom.gN)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.custom.confirm2")), ((java.lang.Object[])(new java.lang.Object[0]))))), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_121(32214, (5086643679686574044L ^ life4_3)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_122(23954, (7816086759921262343L ^ life4_3)))));
        ((moom.gc)(this.H)).a(((net.minecraft.client.Minecraft)(this.i)), ((int)(p0)), ((int)(p1)));
        ((moom.gc)(this.I)).a(((net.minecraft.client.Minecraft)(this.i)), ((int)(p0)), ((int)(p1)));
    }
    return;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x1437;
        if (T[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = S[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])U.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    U.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/gN", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gN.T[n2] = n4;
        }
        return T[n2];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_0f2b0eea7f9d09c9e3da(this, p0, p1, p2); }


public void a(int p0, boolean p1) { __sourceHandlerCall_dd0f9f49e093b1db0567(this, p0, p1); }


private void a() { __sourceHandlerCall_6fde886c6ebe4a838f88(this); }


public java.lang.String a(int p0, java.lang.String p1, float p2) {
return __sourceIntrinsic_edb50508b250_originalDynamicSite1451_1(p1, ((moom.gN)(this)).a(((int)(p0)), ((float)(p2))));
}


private void a(boolean p0) {
this.K = ((boolean)(p0));
    ((moom.gc)(this.E)).m = ((boolean)(p0));
    return;
}


public void a(int p0, java.lang.String p1) { __sourceHandlerCall_b7e5d7300fd7fac975e6(this, p0, p1); }


public void a(java.lang.String p0) { __sourceHandlerCall_fbe16be1b2b60800db78(this, p0); }


private java.lang.String a(int p0, float p1) { return __sourceHandlerCall_6b778ef5877d68b7ac7b(this, p0, p1); }


private void a__sourceReturn_d00df7729d(int p0) {
this.L = ((int)(p0));
    ((moom.gN)(this)).b(((boolean)(true)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_06536865478dc713964d(this, p0); }


public void a__Void(int p0, float p1) { __sourceHandlerCall_f421b759ad22f775270f(this, p0, p1); }


private void k() { __sourceHandlerCall_1cfe26ece8063e50ba8d(this); }


private void j() throws java.io.IOException { __sourceHandlerCall_08ea78ec296f5814bba8(this); }


private static boolean lambda$new$0(java.lang.String p0) { return __sourceHandlerCall_ce99ae199878a21c98ec(p0); }


private static native <E extends Throwable> com.google.common.base.Predicate __sourceIntrinsic_8ba435a7bad9_originalDynamicSite4359_7() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_45(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_86(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_91(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_92(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_102(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_109(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_110(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_121(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_invokedynamic6451_122(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_edb50508b250_originalDynamicSite1451_1(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7719_0() throws E;
}
