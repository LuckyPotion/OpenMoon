package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Jk implements moom.Jr {

public java.lang.String a;

public java.lang.String b;

private int c;

private moom.J_[] d;

private java.lang.String e;

private int f;

private int g;

private int h;

private int i;

private int j;

private int[] k;

private float[][] l;

public static java.lang.String[] m;

private static long n;

private static java.lang.String[] o;

private static java.lang.String[] p;

private static java.util.Map q;

private static long[] r;

private static java.lang.Integer[] s;

private static java.util.Map t;

public Jk(java.util.Properties p0, java.lang.String p1, int p2, int p3, java.lang.String p4) { super(); }

private static void __sourceConstructorBody_16ba87b06bd9c8b2(moom.Jk receiver, java.util.Properties p0, java.lang.String p1, int p2, int p3, java.lang.String p4) throws Throwable {
long local6 = (moom.Jk.n ^ 101610747604580L);
    moom.Jk.__sourceConstructorInit_16ba87b06bd9c8b2_0(((moom.Jk)(receiver)));
    ((moom.Jk)(receiver)).a = ((java.lang.String)(null));
    ((moom.Jk)(receiver)).b = ((java.lang.String)(null));
    ((moom.Jk)(receiver)).c = ((int)(-1));
    ((moom.Jk)(receiver)).d = ((moom.J_[])(null));
    ((moom.Jk)(receiver)).e = ((java.lang.String)(null));
    ((moom.Jk)(receiver)).f = ((int)(-1));
    ((moom.Jk)(receiver)).g = ((int)(0));
    ((moom.Jk)(receiver)).h = ((int)(0));
    ((moom.Jk)(receiver)).i = ((int)(0));
    ((moom.Jk)(receiver)).j = ((int)(0));
    ((moom.Jk)(receiver)).k = ((int[])(null));
    ((moom.Jk)(receiver)).l = ((float[][])(null));
    moom.J3 local8 = new moom.J3(__sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_14(29206, (8941338757016816123L ^ local6)));
    ((moom.Jk)(receiver)).a = ((java.lang.String)(((moom.J3)(local8)).a__String(((java.lang.String)(p1)))));
    ((moom.Jk)(receiver)).b = ((java.lang.String)(((moom.J3)(local8)).b(((java.lang.String)(p1)))));
    ((moom.Jk)(receiver)).c = ((int)(((moom.Jk)(receiver)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_19(10712, (2336943946234679851L ^ local6)))), ((java.lang.String)(p4))))))));
    ((moom.Jk)(receiver)).d = ((moom.J_[])(((moom.J3)(local8)).a__ArrayJ_(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_23(20244, (9007984880277009641L ^ local6))))))))));
    ((moom.Jk)(receiver)).e = ((java.lang.String)(moom.Jk.a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_27(26440, (8088980703594683572L ^ local6))))))), ((java.lang.String)(p1)), ((java.lang.String)(((moom.Jk)(receiver)).b)))));
    ((moom.Jk)(receiver)).f = ((int)(moom.J3.b(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_32(1769, (4566314004695776522L ^ local6))))))), ((int)(-1)))));
    ((moom.Jk)(receiver)).g = ((int)(((moom.J3)(local8)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_36(17717, (4661502360207441626L ^ local6))))))), ((int)(0)))));
    ((moom.Jk)(receiver)).h = ((int)(((moom.J3)(local8)).a(((java.lang.String)(((java.util.Properties)(p0)).getProperty(((java.lang.String)(__sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_40(18437, (6045823303954019311L ^ local6))))))), ((int)(0)))));
    ((moom.Jk)(receiver)).i = ((int)(p2));
    ((moom.Jk)(receiver)).j = ((int)(p3));
    return;
}


static {
n = ((long)(((moom._a)(moom._c.a(((long)(-7290838491090251208L)), ((long)(1295608104156720008L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204014303078468L)))));
    long local20_life6 = (moom.Jk.n ^ 2948297635700L);
    q = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill611_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill611_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill611_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill611_14 = new byte[8];
    (__sourceSpill611_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill611_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation611_16 = __sourceSpill611_14;
    ((javax.crypto.Cipher)(__sourceSpill611_11)).init(((int)(__sourceSpill611_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill611_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation611_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[32];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "6Å¾1\024]*JÅâíæ&(\016\007.nÞxFäAó\030\001|\t\177&PKý.\026ÒÃæ6«\027A¿ÛE\037'\020eýaÿºÒ\037fK[ÈaZø[\0205BZ\004ÐÞc\004Û©xrÃ Bbh}\033\023Ãî\nù\fW\t°SrÀ\016æÎ¾ýI~ãäÑI \024#îpmm\007o_Ü2§Fû©ò5iAkIÔ\017Ýýv\n\r°0Sâ¹ÀÊo!±xT;9\035;n+TeÕ·\030\177h-©\005\030ÄÝ²Ð&Ä¿K&Z÷\007ü*Á\034M\030 \\5\000³\027-Pø\004Õó m«\007Ìa×ºv 4 o£ÇÍ\027ð-\034\017 Ìx8\013ÏÀÛ¯9ZÀ/N§Ù\0360\020¤YkddÒ2y¡å&Å\\§dÎ =6òÕU\f-\002Owv«ï´bÔõ\023è±Ä\030\nÓ¡®U\r(\020GÍF_³CMf«oüH \022%J\020ÏJ¼\006+ìÃ¿\033ÞA^ÜM\002a(Ö\nPêA\0348W¨\\bå6À&KpÔQ/ëã .Ü3¶\004É#1çÀ~¼I(±¾\037º2=Ù±Å\005Oî8\022\030\022\025\003©)½\034ÒqÓF(\023\020@pß}`ëw\r\001©\030åÊ[âÑ¬Ä¦\020ÝÕ\016\b}ññ½ß\0270TSN{DV¬È±è\013Ls¶\024ñ§v¶Ûÿ\001ÎmDõÈûí\024³åµÔ)pãâÎ\020)ò$ ¿úSçI^yà\033;g +»´ÅØjUÚ)7ÎòvÍÊÌkó\031G\001\002;çÓ-¡¬ìÅ\007(ï«D)Qxb6Õn\022®¤8«Ìå¯Ê\006ù6Ù\023Ö\032Em¡Ñ´¹/aR!ü¯\020âýj´Á\007À\006P\f\\\037s½0ãg\000nå»vÔEêvÆ«¬«\025(\001ìë_§`Ë\00261\007(ý¬G¶÷¼EâWo\004>\020÷\023\001#\177Fó¦NÁÔ\030­\031\020Ú©Àé&Å<`×}Ðâ÷IÙè\03013bIX¥æU6´\013À³ÄÛh\\¶òÜ¶\000~%\020ñá2ã}¬\023îý\025\034²\027'é\026(îð4ÖïÁ\001¿;%Tz\t\030\013.°þÿý¨'!Û|p÷W²CfX0?\0200=>`S\021\013\024\024Âõ4Lî\020v@N a=2\005dæNH¯\002  á¨qüN\032O®m§ÀaÎ^iÑè)íÖÝø6\000õ{¤åá"))).length();
    int local14_life24 = 16;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill611_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill611_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill611_29)).doFinal(((byte[])(__sourceSpill611_28)));
        java.lang.String __sourceSpill611_34 = ((java.lang.String)(moom.Jk.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill611_35 = local18_life19;
        int __sourceSpill611_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill611_35)[__sourceSpill611_36] = __sourceSpill611_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "Å~\005\022\025Ò\000ÊÍ-\001Üa$ð ºòÄ]Å(\003¯$Ùl¯ù¬Âáïbç[[x¡º¤¦ë@6"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill611_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill611_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill611_42)).doFinal(((byte[])(__sourceSpill611_41)));
        java.lang.String __sourceSpill611_47 = ((java.lang.String)(moom.Jk.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill611_48 = local18_life19;
        int __sourceSpill611_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill611_48)[__sourceSpill611_49] = __sourceSpill611_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    o = ((java.lang.String[])(local18_life19));
    p = ((java.lang.String[])(new java.lang.String[32]));
    t = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill611_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill611_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill611_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill611_60 = new byte[8];
    (__sourceSpill611_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill611_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation611_62 = __sourceSpill611_60;
    ((javax.crypto.Cipher)(__sourceSpill611_57)).init(((int)(__sourceSpill611_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill611_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation611_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[13];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\016lðÊ\033ÉV¢Ý\004¦ÉàÃê&\035\017Áó1ð.çµ;¬`xØ¦é\021[ûòÒSûÑ\013+\037©/÷®øS\016\020»Â\034W5P\001éÆó¨¼\rïFôNVÏÉ=ù®[ÓÞü"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill611_71 = local4_life67;
        int __sourceSpill611_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill611_71)).substring(((int)(__sourceSpill611_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill611_76 = local6_life65;
        int __sourceSpill611_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill611_79 = new byte[8];
        (__sourceSpill611_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill611_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill611_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill611_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill611_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill611_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill611_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill611_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill611_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill611_80)).doFinal(((byte[])(__sourceSpill611_79)));
        (__sourceSpill611_76)[__sourceSpill611_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ÖJÊT½%l\022Ò2È|r"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill611_84 = local4_life67;
        int __sourceSpill611_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill611_84)).substring(((int)(__sourceSpill611_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill611_89 = local6_life65;
        int __sourceSpill611_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill611_92 = new byte[8];
        (__sourceSpill611_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill611_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill611_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill611_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill611_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill611_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill611_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill611_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill611_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill611_93)).doFinal(((byte[])(__sourceSpill611_92)));
        (__sourceSpill611_89)[__sourceSpill611_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    r = ((long[])(local6_life65));
    s = ((java.lang.Integer[])(new java.lang.Integer[13]));
    java.lang.String[] __sourceSpill611_99 = new java.lang.String[3];
    (__sourceSpill611_99)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite611_98(771, (234097090997838331L ^ local20_life6));
    (__sourceSpill611_99)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite611_100(22438, (4872508722241385815L ^ local20_life6));
    (__sourceSpill611_99)[2] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite611_101(19204, (7160113040020089341L ^ local20_life6));
    m = ((java.lang.String[])(__sourceSpill611_99));
}

private static native <E extends Throwable> void __sourceConstructorInit_16ba87b06bd9c8b2_0(moom.Jk a0) throws E;
private static native <E extends Throwable> int __sourceHandlerCall_3c65b0e51dca6949db2f(moom.Jk a0) throws E;
private static final class __SourceHandler_3c65b0e51dca6949db2f {

public static int f703(moom.Jk receiver) throws Throwable {
    int forwardValue703_20_0;
    int spill703_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_25;
    forward_join_20: {
    forward_join_15: {
    life1_3 = (__fieldRead703_0() ^ 50278830456618L);
    life3_5 = __call703_1();
    spill703_0 = __fieldRead703_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue703_20_0 = spill703_0;
        break forward_join_20;
    }
    if (!((spill703_0 == 2))) {
        break forward_join_15;
    }
    return __fieldRead703_3(receiver);
    }
    forwardValue703_20_0 = __call703_6(__fieldRead703_4(), (__fieldRead703_5(receiver)).length);
    }
    life4_25 = forwardValue703_20_0;
    return (__fieldRead703_7(receiver))[life4_25];
}
public static void h703_0(moom.Oo p0) throws Throwable {
    throw __call1070300_0(p0);
}
public static void h703_1(moom.Oo p0) throws Throwable {
    throw __call1070301_0(p0);
}
private static native long __fieldRead703_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call703_1() throws Throwable;
private static native int __fieldRead703_2(moom.Jk a0) throws Throwable;
private static native int __fieldRead703_3(moom.Jk a0) throws Throwable;
private static native java.util.Random __fieldRead703_4() throws Throwable;
private static native int[] __fieldRead703_5(moom.Jk a0) throws Throwable;
private static native int __call703_6(java.util.Random a0, int a1) throws Throwable;
private static native int[] __fieldRead703_7(moom.Jk a0) throws Throwable;
private static native java.lang.Exception __call1070300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_4acd6ba690dfd599bee4(moom.Jk a0, java.lang.String a1) throws E;
private static final class __SourceHandler_4acd6ba690dfd599bee4 {

public static int f78(moom.Jk receiver, java.lang.String p0) throws Throwable {
    java.lang.String forwardValue78_16_0;
    int forwardValue78_34_0;
    int forwardValue78_46_0;
    int forwardValue78_61_0;
    java.lang.String spill78_0;
    boolean spill78_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_61: {
    forward_join_51: {
    forward_join_46: {
    forward_join_39: {
    forward_join_34: {
    forward_join_27: {
    forward_join_16: {
    forward_join_12: {
    life2_3 = (__fieldRead78_0() ^ 38264549055411L);
    life4_5 = __call78_1();
    spill78_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue78_16_0 = spill78_0;
        break forward_join_16;
    }
    if (!((spill78_0 == null))) {
        break forward_join_12;
    }
    return 0;
    }
    p0 = __call78_2(p0);
    forwardValue78_16_0 = p0;
    }
    spill78_1 = __call78_4(forwardValue78_16_0, __invokedynamic78_3(32308, (1982395621526777885L ^ life2_3)));
    if (!((life4_5 != null))) {
        forwardValue78_34_0 = __integerCategory78_5(spill78_1);
        break forward_join_34;
    }
    if (!(spill78_1)) {
        break forward_join_27;
    }
    return 0;
    }
    forwardValue78_34_0 = __integerCategory78_8(__call78_7(p0, __invokedynamic78_6(17381, (8407466281851063753L ^ life2_3))));
    }
    if (!((life4_5 != null))) {
        forwardValue78_46_0 = forwardValue78_34_0;
        break forward_join_46;
    }
    if (!((forwardValue78_34_0 != 0))) {
        break forward_join_39;
    }
    return 1;
    }
    forwardValue78_46_0 = __integerCategory78_11(__call78_10(p0, __invokedynamic78_9(11941, (6532635271422107782L ^ life2_3))));
    }
    if (!((life4_5 != null))) {
        forwardValue78_61_0 = forwardValue78_46_0;
        break forward_join_61;
    }
    if (!((forwardValue78_46_0 != 0))) {
        break forward_join_51;
    }
    return 2;
    }
    java.lang.String __stackOp78_13_0 = p0;
    java.lang.String __stackOp78_13_1 = __invokedynamic78_12(11586, (6817107486392509285L ^ life2_3));
    __call78_15(__invokedynamic78_14(__stackOp78_13_1, __stackOp78_13_0));
    forwardValue78_61_0 = -1;
    }
    return forwardValue78_61_0;
}
public static void h78_0(moom.Oo p0) throws Throwable {
    throw __call1007800_0(p0);
}
public static void h78_1(moom.Oo p0) throws Throwable {
    throw __call1007801_0(p0);
}
public static void h78_2(moom.Oo p0) throws Throwable {
    throw __call1007802_0(p0);
}
public static void h78_3(moom.Oo p0) throws Throwable {
    throw __call1007803_0(p0);
}
public static void h78_4(moom.Oo p0) throws Throwable {
    throw __call1007804_0(p0);
}
public static void h78_5(moom.Oo p0) throws Throwable {
    throw __call1007805_0(p0);
}
public static void h78_6(moom.Oo p0) throws Throwable {
    throw __call1007806_0(p0);
}
public static void h78_7(moom.Oo p0) throws Throwable {
    throw __call1007807_0(p0);
}
private static native long __fieldRead78_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call78_1() throws Throwable;
private static native java.lang.String __call78_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic78_3(int a0, long a1) throws Throwable;
private static native boolean __call78_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory78_5(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic78_6(int a0, long a1) throws Throwable;
private static native boolean __call78_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory78_8(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic78_9(int a0, long a1) throws Throwable;
private static native boolean __call78_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory78_11(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic78_12(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic78_14(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call78_15(java.lang.String a0) throws Throwable;
private static native java.lang.Exception __call1007800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007804_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007805_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007806_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007807_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_1fe4f7d5ab8b138d69c8(java.lang.String a0, java.lang.String a1) throws E;
private static final class __SourceHandler_1fe4f7d5ab8b138d69c8 {

public static java.lang.String f705(java.lang.String p0, java.lang.String p1) throws Throwable {
    int forwardValue705_49_0;
    java.lang.String forwardValue705_63_0;
    int forwardValue705_80_0;
    java.lang.String forwardValue705_86_0;
    net.minecraft.entity.Entity[] spill705_0;
    boolean spill705_1;
    boolean spill705_2;
    boolean spill705_3;
    java.lang.String spill705_4;
    boolean spill705_5;
    java.lang.String spill705_6;
    long life2_3;
    java.lang.String life0_8;
    net.minecraft.entity.Entity[] life4_9;
    java.lang.String life5_81;
    forward_join_86: {
    forward_join_85: {
    forward_join_80: {
    forward_join_75: {
    forward_join_63: {
    forward_join_58: {
    forward_join_49: {
    forward_join_40: {
    life2_3 = (__fieldRead705_0() ^ 36409263202939L);
    spill705_0 = __call705_1();
    life0_8 = __call705_2(p0, p1);
    life4_9 = spill705_0;
    spill705_1 = __call705_3(life0_8, p1);
    if (!((life4_9 != null))) {
        forwardValue705_49_0 = __integerCategory705_4(spill705_1);
        break forward_join_49;
    }
    if (!((!spill705_1))) {
        break forward_join_40;
    }
    spill705_2 = __call705_6(life0_8, __invokedynamic705_5(23849, (8106564547816663764L ^ life2_3)));
    if (!((life4_9 != null))) {
        forwardValue705_49_0 = __integerCategory705_7(spill705_2);
        break forward_join_49;
    }
    if (!((!spill705_2))) {
        break forward_join_40;
    }
    spill705_3 = __call705_9(life0_8, __invokedynamic705_8(20730, (4168235850792871685L ^ life2_3)));
    if (!((life4_9 != null))) {
        forwardValue705_49_0 = __integerCategory705_10(spill705_3);
        break forward_join_49;
    }
    if (!((!spill705_3))) {
        break forward_join_40;
    }
    life0_8 = __invokedynamic705_11(p1, life0_8);
    }
    spill705_4 = life0_8;
    if (!((life4_9 != null))) {
        forwardValue705_63_0 = spill705_4;
        break forward_join_63;
    }
    forwardValue705_49_0 = __integerCategory705_14(__call705_13(spill705_4, __invokedynamic705_12(26661, (4942511197885341644L ^ life2_3))));
    }
    if (!((forwardValue705_49_0 != 0))) {
        break forward_join_58;
    }
    life0_8 = __call705_16(life0_8, 0, (__call705_15(life0_8) - 4));
    }
    forwardValue705_63_0 = __invokedynamic705_17(31955, (6686409596104969013L ^ life2_3));
    }
    life5_81 = forwardValue705_63_0;
    spill705_5 = __call705_18(life0_8, life5_81);
    if (!((life4_9 != null))) {
        forwardValue705_80_0 = __integerCategory705_19(spill705_5);
        break forward_join_80;
    }
    if (!(spill705_5)) {
        break forward_join_75;
    }
    life0_8 = __call705_21(life0_8, __call705_20(life5_81));
    }
    spill705_6 = life0_8;
    if (!((life4_9 != null))) {
        forwardValue705_86_0 = spill705_6;
        break forward_join_86;
    }
    forwardValue705_80_0 = __integerCategory705_23(__call705_22(spill705_6, "/"));
    }
    if (!((forwardValue705_80_0 != 0))) {
        break forward_join_85;
    }
    life0_8 = __call705_24(life0_8, 1);
    }
    forwardValue705_86_0 = life0_8;
    }
    return forwardValue705_86_0;
}
public static void h705_0(moom.Oo p0) throws Throwable {
    throw __call1070500_0(p0);
}
public static void h705_1(moom.Oo p0) throws Throwable {
    throw __call1070501_0(p0);
}
public static void h705_2(moom.Oo p0) throws Throwable {
    throw __call1070502_0(p0);
}
public static void h705_3(moom.Oo p0) throws Throwable {
    throw __call1070503_0(p0);
}
public static void h705_4(moom.Oo p0) throws Throwable {
    throw __call1070504_0(p0);
}
public static void h705_5(moom.Oo p0) throws Throwable {
    throw __call1070505_0(p0);
}
public static void h705_6(moom.Oo p0) throws Throwable {
    throw __call1070506_0(p0);
}
public static void h705_7(moom.Oo p0) throws Throwable {
    throw __call1070507_0(p0);
}
private static native long __fieldRead705_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call705_1() throws Throwable;
private static native java.lang.String __call705_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call705_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory705_4(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic705_5(int a0, long a1) throws Throwable;
private static native boolean __call705_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory705_7(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic705_8(int a0, long a1) throws Throwable;
private static native boolean __call705_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory705_10(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic705_11(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic705_12(int a0, long a1) throws Throwable;
private static native boolean __call705_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory705_14(boolean value) throws Throwable;
private static native int __call705_15(java.lang.String a0) throws Throwable;
private static native java.lang.String __call705_16(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic705_17(int a0, long a1) throws Throwable;
private static native boolean __call705_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory705_19(boolean value) throws Throwable;
private static native int __call705_20(java.lang.String a0) throws Throwable;
private static native java.lang.String __call705_21(java.lang.String a0, int a1) throws Throwable;
private static native boolean __call705_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory705_23(boolean value) throws Throwable;
private static native java.lang.String __call705_24(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Exception __call1070500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070507_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e959925c8367e058b369(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;
private static final class __SourceHandler_e959925c8367e058b369 {

public static java.lang.String f706(java.lang.String p0, java.lang.String p1, java.lang.String p2) throws Throwable {
    java.lang.String forwardValue706_36_0;
    java.lang.String forwardValue706_36_1;
    java.lang.String forwardValue706_41_0;
    int forwardValue706_67_0;
    java.lang.String spill706_0;
    java.lang.String spill706_1;
    java.lang.String spill706_2;
    int spill706_3;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    java.lang.String life0_15;
    java.lang.String life6_21;
    java.lang.String life0_43;
    java.lang.String life6_47;
    int life7_55;
    int life8_76;
    forward_join_81: {
    forward_join_77: {
    forward_join_67: {
    forward_join_60: {
    forward_join_41: {
    forward_join_40: {
    forward_join_36: {
    forward_join_34: {
    life3_3 = (__fieldRead706_0() ^ 3298140003194L);
    life5_5 = __call706_1();
    spill706_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue706_41_0 = spill706_0;
        break forward_join_41;
    }
    if (!((spill706_0 != null))) {
        break forward_join_40;
    }
    life0_15 = __call706_2(p0);
    life6_21 = __invokedynamic706_3(19253, (7094419866444269018L ^ life3_3));
    spill706_1 = life0_15;
    spill706_2 = life6_21;
    if (!((life5_5 != null))) {
        forwardValue706_36_0 = spill706_1;
        forwardValue706_36_1 = spill706_2;
        break forward_join_36;
    }
    if (!(__call706_4(spill706_1, spill706_2))) {
        break forward_join_34;
    }
    life0_15 = __call706_7(life0_15, 0, (__call706_5(life0_15) - __call706_6(life6_21)));
    }
    forwardValue706_36_0 = life0_15;
    forwardValue706_36_1 = p2;
    }
    life0_43 = __call706_8(forwardValue706_36_0, forwardValue706_36_1);
    return life0_43;
    }
    forwardValue706_41_0 = p1;
    }
    life6_47 = forwardValue706_41_0;
    life7_55 = __call706_10(p1, __invokedynamic706_9(1305, (8501907872008120834L ^ life3_3)));
    spill706_3 = life7_55;
    if (!((life5_5 != null))) {
        forwardValue706_67_0 = spill706_3;
        break forward_join_67;
    }
    if (!((spill706_3 >= 0))) {
        break forward_join_60;
    }
    life6_47 = __call706_11(p1, (life7_55 + 1));
    }
    forwardValue706_67_0 = __call706_13(life6_47, __invokedynamic706_12(19832, (7202994137547629157L ^ life3_3)));
    }
    life8_76 = forwardValue706_67_0;
    if (!((life5_5 != null))) {
        break forward_join_81;
    }
    if (!((life8_76 >= 0))) {
        break forward_join_77;
    }
    life6_47 = __call706_14(life6_47, 0, life8_76);
    }
    life6_47 = __call706_15(life6_47, p2);
    }
    return life6_47;
}
public static void h706_0(moom.Oo p0) throws Throwable {
    throw __call1070600_0(p0);
}
public static void h706_1(moom.Oo p0) throws Throwable {
    throw __call1070601_0(p0);
}
public static void h706_2(moom.Oo p0) throws Throwable {
    throw __call1070602_0(p0);
}
public static void h706_3(moom.Oo p0) throws Throwable {
    throw __call1070603_0(p0);
}
private static native long __fieldRead706_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call706_1() throws Throwable;
private static native java.lang.String __call706_2(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic706_3(int a0, long a1) throws Throwable;
private static native boolean __call706_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call706_5(java.lang.String a0) throws Throwable;
private static native int __call706_6(java.lang.String a0) throws Throwable;
private static native java.lang.String __call706_7(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call706_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic706_9(int a0, long a1) throws Throwable;
private static native int __call706_10(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call706_11(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic706_12(int a0, long a1) throws Throwable;
private static native int __call706_13(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __call706_14(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __call706_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1070600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4eaf4094cbbd994ddfaf(moom.Jk a0, moom.J_ a1) throws E;
private static final class __SourceHandler_4eaf4094cbbd994ddfaf {

public static void f707(moom.Jk receiver, moom.J_ p0) throws Throwable {
    moom.Jk forwardValue707_16_0;
    moom.Jk spill707_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_16: {
    forward_join_15: {
    life2_3 = (__fieldRead707_0() ^ 92137748251103L);
    life4_5 = __call707_1();
    spill707_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue707_16_0 = spill707_0;
        break forward_join_16;
    }
    if (!((__fieldRead707_2(spill707_0) == null))) {
        break forward_join_15;
    }
    __fieldWrite707_3(receiver, new moom.J_[0]);
    }
    forwardValue707_16_0 = receiver;
    }
    __fieldWrite707_7(forwardValue707_16_0, __cast707_6(__call707_5(__fieldRead707_4(receiver), p0)));
    return;
}
public static void h707_0(moom.Oo p0) throws Throwable {
    throw __call1070700_0(p0);
}
public static void h707_1(moom.Oo p0) throws Throwable {
    throw __call1070701_0(p0);
}
private static native long __fieldRead707_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call707_1() throws Throwable;
private static native moom.J_[] __fieldRead707_2(moom.Jk a0) throws Throwable;
private static native void __fieldWrite707_3(moom.Jk a0, moom.J_[] a1) throws Throwable;
private static native moom.J_[] __fieldRead707_4(moom.Jk a0) throws Throwable;
private static native java.lang.Object[] __call707_5(moom.J_[] a0, moom.J_ a1) throws Throwable;
private static native moom.J_[] __cast707_6(java.lang.Object[] a0) throws Throwable;
private static native void __fieldWrite707_7(moom.Jk a0, moom.J_[] a1) throws Throwable;
private static native java.lang.Exception __call1070700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_2462337fb1bbe22bbb82(moom.Jk a0, net.minecraft.world.IBlockAccess a1, double a2, double a3, double a4, int a5) throws E;
private static final class __SourceHandler_2462337fb1bbe22bbb82 {

public static int f708(moom.Jk receiver, net.minecraft.world.IBlockAccess p0, double p1, double p2, double p3, int p4) throws Throwable {
    int lexicalValue708_17_0;
    int lexicalValue708_127_0;
    int spill708_0;
    int spill708_1;
    long life9_3;
    net.minecraft.entity.Entity[] life11_5;
    int life12_22;
    int life13_25;
    int life14_28;
    int life15_30;
    int life16_32;
    int life17_34;
    int life18_36;
    moom.DX life19_43;
    int life20_47;
    int life21_58;
    int life22_73;
    int life21_135;
    int life22_139;
    lexical_join_127: {
    lexical_join_120: {
    lexical_join_17: {
    lexical_join_15: {
    life9_3 = (__fieldRead708_0() ^ 77911737827553L);
    life11_5 = __call708_1();
    spill708_0 = __fieldRead708_2(receiver);
    if (!((life11_5 != null))) {
        lexicalValue708_17_0 = spill708_0;
        break lexical_join_17;
    }
    if (!((spill708_0 == 2))) {
        break lexical_join_15;
    }
    return __fieldRead708_3(receiver);
    }
    lexicalValue708_17_0 = __call708_4(p1);
    }
    life12_22 = lexicalValue708_17_0;
    life13_25 = __call708_5(p2);
    life14_28 = __call708_6(p3);
    life15_30 = 0;
    life16_32 = 0;
    life17_34 = 0;
    life18_36 = 0;
    life19_43 = new moom.DX(0, 0, 0);
    life20_47 = (life12_22 - p4);
    lexical_cycle_43: while (true) {
    lexical_join_118: {
    lexical_join_117: {
    if (!((life20_47 <= (life12_22 + p4)))) {
        break lexical_join_120;
    }
    spill708_1 = (life14_28 - p4);
    if (!((life11_5 != null))) {
        lexicalValue708_127_0 = spill708_1;
        break lexical_join_127;
    }
    life21_58 = spill708_1;
    lexical_cycle_54: while (true) {
    if (!((life21_58 <= (life14_28 + p4)))) {
        break lexical_join_117;
    }
    __call708_7(life19_43, life20_47, life13_25, life21_58);
    life22_73 = __call708_8(receiver, p0, life19_43);
    life15_30 = (life15_30 + ((life22_73 >> __invokedynamic708_9(9542, (934919935682089415L ^ life9_3))) & __invokedynamic708_10(11899, (7631542908558383868L ^ life9_3))));
    life16_32 = (life16_32 + ((life22_73 >> __invokedynamic708_11(26293, (447677127802540602L ^ life9_3))) & __invokedynamic708_12(19982, (5714287509761718915L ^ life9_3))));
    life17_34 = (life17_34 + (life22_73 & __invokedynamic708_13(19982, (5714287509761718915L ^ life9_3))));
    life18_36 += 1;
    life21_58 += 1;
    if (!((life11_5 != null))) {
        break lexical_join_118;
    }
    if (!((life11_5 == null))) { continue lexical_cycle_54; }
    break lexical_cycle_54;
    }
    }
    life20_47 += 1;
    }
    if (!((life11_5 == null))) { continue lexical_cycle_43; }
    break lexical_cycle_43;
    }
    }
    life20_47 = (life15_30 / life18_36);
    lexicalValue708_127_0 = (life16_32 / life18_36);
    }
    life21_135 = lexicalValue708_127_0;
    life22_139 = (life17_34 / life18_36);
    return (((life20_47 << __invokedynamic708_14(16808, (1919889636528452907L ^ life9_3))) | (life21_135 << __invokedynamic708_15(29697, (2015700841554854025L ^ life9_3)))) | life22_139);
}
public static void h708_0(moom.Oo p0) throws Throwable {
    throw __call1070800_0(p0);
}
public static void h708_1(moom.Oo p0) throws Throwable {
    throw __call1070801_0(p0);
}
public static void h708_2(moom.Oo p0) throws Throwable {
    throw __call1070802_0(p0);
}
private static native long __fieldRead708_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call708_1() throws Throwable;
private static native int __fieldRead708_2(moom.Jk a0) throws Throwable;
private static native int __fieldRead708_3(moom.Jk a0) throws Throwable;
private static native int __call708_4(double a0) throws Throwable;
private static native int __call708_5(double a0) throws Throwable;
private static native int __call708_6(double a0) throws Throwable;
private static native void __call708_7(moom.DX a0, int a1, int a2, int a3) throws Throwable;
private static native int __call708_8(moom.Jk a0, net.minecraft.world.IBlockAccess a1, moom.DX a2) throws Throwable;
private static native int __invokedynamic708_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic708_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic708_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic708_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic708_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic708_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic708_15(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1070800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_9bebbb91358a1755fe1b(moom.Jk a0, net.minecraft.world.biome.BiomeGenBase a1, moom.DT a2) throws E;
private static final class __SourceHandler_9bebbb91358a1755fe1b {

public static int f709(moom.Jk receiver, net.minecraft.world.biome.BiomeGenBase p0, moom.DT p1) throws Throwable {
    int forwardValue709_20_0;
    moom.Jk forwardValue709_28_0;
    int forwardValue709_29_0;
    int spill709_0;
    moom.Jk spill709_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forward_join_29: {
    forward_join_28: {
    forward_join_27: {
    forward_join_20: {
    forward_join_16: {
    life3_3 = (__fieldRead709_0() ^ 56815920262413L);
    life5_5 = __call709_1();
    spill709_0 = __fieldRead709_2(receiver);
    if (!((life5_5 != null))) {
        forwardValue709_20_0 = spill709_0;
        break forward_join_20;
    }
    if (!((spill709_0 == 0))) {
        break forward_join_16;
    }
    forwardValue709_29_0 = __call709_3(receiver, p0, p1);
    break forward_join_29;
    }
    spill709_1 = receiver;
    if (!((life5_5 != null))) {
        forwardValue709_28_0 = spill709_1;
        break forward_join_28;
    }
    forwardValue709_20_0 = __fieldRead709_4(spill709_1);
    }
    if (!((forwardValue709_20_0 == 1))) {
        break forward_join_27;
    }
    forwardValue709_29_0 = __call709_5(receiver, p0, p1);
    break forward_join_29;
    }
    forwardValue709_28_0 = receiver;
    }
    forwardValue709_29_0 = __fieldRead709_6(forwardValue709_28_0);
    }
    return forwardValue709_29_0;
}
public static void h709_0(moom.Oo p0) throws Throwable {
    throw __call1070900_0(p0);
}
public static void h709_1(moom.Oo p0) throws Throwable {
    throw __call1070901_0(p0);
}
public static void h709_2(moom.Oo p0) throws Throwable {
    throw __call1070902_0(p0);
}
public static void h709_3(moom.Oo p0) throws Throwable {
    throw __call1070903_0(p0);
}
private static native long __fieldRead709_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call709_1() throws Throwable;
private static native int __fieldRead709_2(moom.Jk a0) throws Throwable;
private static native int __call709_3(moom.Jk a0, net.minecraft.world.biome.BiomeGenBase a1, moom.DT a2) throws Throwable;
private static native int __fieldRead709_4(moom.Jk a0) throws Throwable;
private static native int __call709_5(moom.Jk a0, net.minecraft.world.biome.BiomeGenBase a1, moom.DT a2) throws Throwable;
private static native int __fieldRead709_6(moom.Jk a0) throws Throwable;
private static native java.lang.Exception __call1070900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1070903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float[][] __sourceHandlerCall_fd4168f6d1e8673c1748(moom.Jk a0) throws E;
private static final class __SourceHandler_fd4168f6d1e8673c1748 {

public static float[][] f710(moom.Jk receiver) throws Throwable {
    float[][] forwardValue710_18_0;
    float[][] spill710_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_16: {
    life1_3 = (__fieldRead710_0() ^ 90421861329922L);
    life3_5 = __call710_1();
    spill710_0 = __fieldRead710_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue710_18_0 = spill710_0;
        break forward_join_18;
    }
    if (!((spill710_0 == null))) {
        break forward_join_16;
    }
    __fieldWrite710_5(receiver, __call710_4(__fieldRead710_3(receiver)));
    }
    forwardValue710_18_0 = __fieldRead710_6(receiver);
    }
    return forwardValue710_18_0;
}
public static void h710_0(moom.Oo p0) throws Throwable {
    throw __call1071000_0(p0);
}
public static void h710_1(moom.Oo p0) throws Throwable {
    throw __call1071001_0(p0);
}
private static native long __fieldRead710_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call710_1() throws Throwable;
private static native float[][] __fieldRead710_2(moom.Jk a0) throws Throwable;
private static native int[] __fieldRead710_3(moom.Jk a0) throws Throwable;
private static native float[][] __call710_4(int[] a0) throws Throwable;
private static native void __fieldWrite710_5(moom.Jk a0, float[][] a1) throws Throwable;
private static native float[][] __fieldRead710_6(moom.Jk a0) throws Throwable;
private static native java.lang.Exception __call1071000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_cb8944878534e6f1846b(moom.Jk a0) throws E;
private static final class __SourceHandler_cb8944878534e6f1846b {

public static int[] f711(moom.Jk receiver) throws Throwable {
    java.lang.Object[] lexicalValue711_50_0;
    int[] lexicalValue711_75_0;
    moom.J_[] spill711_0;
    int[] spill711_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.util.HashSet life4_16;
    moom.J_[] life5_19;
    int life6_22;
    int life7_24;
    moom.J_ life8_33;
    java.lang.Integer[] life5_59;
    int[] life6_63;
    int life7_65;
    lexical_join_75: {
    lexical_join_74: {
    lexical_join_50: {
    lexical_join_46: {
    lexical_join_11: {
    life1_3 = (__fieldRead711_0() ^ 98652225150189L);
    life3_5 = __call711_1();
    if (!((__fieldRead711_2(receiver) == null))) {
        break lexical_join_11;
    }
    return null;
    }
    life4_16 = new java.util.HashSet();
    life5_19 = __fieldRead711_3(receiver);
    life6_22 = (life5_19).length;
    life7_24 = 0;
    lexical_cycle_23: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    if (!((life7_24 < life6_22))) {
        break lexical_join_46;
    }
    spill711_0 = life5_19;
    if (!((life3_5 != null))) {
        lexicalValue711_50_0 = spill711_0;
        break lexical_join_50;
    }
    life8_33 = (spill711_0)[life7_24];
    if (!((life3_5 != null))) {
        break lexical_join_44;
    }
    if (!((__call711_4(life8_33) >= 0))) {
        break lexical_join_43;
    }
    __call711_7(life4_16, __call711_6(__call711_5(life8_33)));
    }
    life7_24 += 1;
    }
    if (!((life3_5 == null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    lexicalValue711_50_0 = __call711_8(life4_16, new java.lang.Integer[0]);
    }
    life5_59 = __cast711_9(lexicalValue711_50_0);
    life6_63 = new int[(life5_59).length];
    life7_65 = 0;
    lexical_cycle_58: while (true) {
    if (!((life7_65 < (life5_59).length))) {
        break lexical_join_74;
    }
    spill711_1 = life6_63;
    if (!((life3_5 != null))) {
        lexicalValue711_75_0 = spill711_1;
        break lexical_join_75;
    }
    (spill711_1)[life7_65] = __call711_10((life5_59)[life7_65]);
    life7_65 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_58; }
    break lexical_cycle_58;
    }
    }
    lexicalValue711_75_0 = life6_63;
    }
    return lexicalValue711_75_0;
}
public static void h711_0(moom.Oo p0) throws Throwable {
    throw __call1071100_0(p0);
}
public static void h711_1(moom.Oo p0) throws Throwable {
    throw __call1071101_0(p0);
}
public static void h711_2(moom.Oo p0) throws Throwable {
    throw __call1071102_0(p0);
}
public static void h711_3(moom.Oo p0) throws Throwable {
    throw __call1071103_0(p0);
}
private static native long __fieldRead711_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call711_1() throws Throwable;
private static native moom.J_[] __fieldRead711_2(moom.Jk a0) throws Throwable;
private static native moom.J_[] __fieldRead711_3(moom.Jk a0) throws Throwable;
private static native int __call711_4(moom.J_ a0) throws Throwable;
private static native int __call711_5(moom.J_ a0) throws Throwable;
private static native java.lang.Integer __call711_6(int a0) throws Throwable;
private static native boolean __call711_7(java.util.HashSet a0, java.lang.Integer a1) throws Throwable;
private static native java.lang.Object[] __call711_8(java.util.HashSet a0, java.lang.Integer[] a1) throws Throwable;
private static native java.lang.Integer[] __cast711_9(java.lang.Object[] a0) throws Throwable;
private static native int __call711_10(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call1071100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.J_[] __sourceHandlerCall_767f13c1c72f7316b219(moom.Jk a0) throws E;
private static final class __SourceHandler_767f13c1c72f7316b219 {

public static moom.J_[] f79(moom.Jk receiver) throws Throwable {
    java.util.regex.Matcher forwardValue79_41_0;
    int forwardValue79_53_0;
    net.minecraft.entity.Entity[] spill79_0;
    moom.J_[] spill79_1;
    java.util.regex.Matcher spill79_2;
    int spill79_3;
    moom.J_[] spill79_4;
    long life1_3;
    net.minecraft.block.Block life4_8;
    net.minecraft.entity.Entity[] life3_9;
    java.util.regex.Pattern life5_31;
    java.util.regex.Matcher life6_36;
    java.lang.String life7_51;
    int life8_55;
    moom.J3 life7_81;
    forward_join_62: {
    forward_join_53: {
    forward_join_41: {
    forward_join_23: {
    life1_3 = (__fieldRead79_0() ^ 93204715963689L);
    spill79_0 = __call79_1();
    life4_8 = __call79_3(__fieldRead79_2(receiver));
    life3_9 = spill79_0;
    if (!((life4_8 != null))) {
        break forward_join_23;
    }
    moom.J_[] __stackOp79_4_0 = new moom.J_[1];
    spill79_1 = __stackOp79_4_0;
    (__stackOp79_4_0)[0] = new moom.J_(__call79_5(life4_8));
    return spill79_1;
    }
    life5_31 = __call79_7(__invokedynamic79_6(25235, (5638908687345332786L ^ life1_3)));
    life6_36 = __call79_9(life5_31, __fieldRead79_8(receiver));
    spill79_2 = life6_36;
    if (!((life3_9 != null))) {
        forwardValue79_41_0 = spill79_2;
        break forward_join_41;
    }
    if (!(__call79_10(spill79_2))) {
        break forward_join_62;
    }
    forwardValue79_41_0 = life6_36;
    }
    life7_51 = __call79_11(forwardValue79_41_0, 1);
    life8_55 = __call79_12(life7_51, -1);
    spill79_3 = life8_55;
    if (!((life3_9 != null))) {
        forwardValue79_53_0 = spill79_3;
        break forward_join_53;
    }
    if (!((spill79_3 >= 0))) {
        break forward_join_62;
    }
    forwardValue79_53_0 = 1;
    }
    moom.J_[] __stackOp79_13_0 = new moom.J_[forwardValue79_53_0];
    spill79_4 = __stackOp79_13_0;
    (__stackOp79_13_0)[0] = new moom.J_(life8_55);
    return spill79_4;
    }
    life7_81 = new moom.J3(__invokedynamic79_14(17735, (8152828459554286L ^ life1_3)));
    return __call79_16(life7_81, __fieldRead79_15(receiver));
}
public static void h79_0(moom.Oo p0) throws Throwable {
    throw __call1007900_0(p0);
}
public static void h79_1(moom.Oo p0) throws Throwable {
    throw __call1007901_0(p0);
}
public static void h79_2(moom.Oo p0) throws Throwable {
    throw __call1007902_0(p0);
}
public static void h79_3(moom.Oo p0) throws Throwable {
    throw __call1007903_0(p0);
}
private static native long __fieldRead79_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call79_1() throws Throwable;
private static native java.lang.String __fieldRead79_2(moom.Jk a0) throws Throwable;
private static native net.minecraft.block.Block __call79_3(java.lang.String a0) throws Throwable;
private static native int __call79_5(net.minecraft.block.Block a0) throws Throwable;
private static native java.lang.String __invokedynamic79_6(int a0, long a1) throws Throwable;
private static native java.util.regex.Pattern __call79_7(java.lang.String a0) throws Throwable;
private static native java.lang.String __fieldRead79_8(moom.Jk a0) throws Throwable;
private static native java.util.regex.Matcher __call79_9(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call79_10(java.util.regex.Matcher a0) throws Throwable;
private static native java.lang.String __call79_11(java.util.regex.Matcher a0, int a1) throws Throwable;
private static native int __call79_12(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic79_14(int a0, long a1) throws Throwable;
private static native java.lang.String __fieldRead79_15(moom.Jk a0) throws Throwable;
private static native moom.J_[] __call79_16(moom.J3 a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1007900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1007903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_124239950e15bbe982f4(moom.Jk a0) throws E;
private static final class __SourceHandler_124239950e15bbe982f4 {

public static boolean f713(moom.Jk receiver) throws Throwable {
    int forwardValue713_13_0;
    int forwardValue713_15_0;
    int spill713_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead713_0() ^ 63887637345282L);
    life3_5 = __call713_1();
    spill713_0 = __fieldRead713_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue713_13_0 = spill713_0;
        break forward_join_13;
    }
    if (!((spill713_0 == 2))) {
        break forward_join_14;
    }
    forwardValue713_13_0 = 1;
    }
    forwardValue713_15_0 = forwardValue713_13_0;
    break forward_join_15;
    }
    forwardValue713_15_0 = 0;
    }
    return __integerCategory713_3(forwardValue713_15_0);
}
public static void h713_0(moom.Oo p0) throws Throwable {
    throw __call1071300_0(p0);
}
public static void h713_1(moom.Oo p0) throws Throwable {
    throw __call1071301_0(p0);
}
private static native long __fieldRead713_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call713_1() throws Throwable;
private static native int __fieldRead713_2(moom.Jk a0) throws Throwable;
private static native boolean __integerCategory713_3(int value) throws Throwable;
private static native java.lang.Exception __call1071300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3a160eadd6430ba098ad(moom.Jk a0, java.lang.String a1) throws E;
private static final class __SourceHandler_3a160eadd6430ba098ad {

public static boolean f80(moom.Jk receiver, java.lang.String p0) throws Throwable {
    int forwardValue80_27_0;
    moom.Jk forwardValue80_40_0;
    moom.Jk forwardValue80_58_0;
    moom.Jk forwardValue80_65_0;
    int forwardValue80_90_0;
    int forwardValue80_110_0;
    moom.Jk spill80_0;
    moom.Jk spill80_1;
    int spill80_2;
    int spill80_3;
    int spill80_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_110: {
    forward_join_109: {
    forward_join_90: {
    forward_join_88: {
    forward_join_65: {
    forward_join_64: {
    forward_join_58: {
    forward_join_55: {
    forward_join_40: {
    forward_join_39: {
    forward_join_27: {
    forward_join_25: {
    life2_3 = (__fieldRead80_0() ^ 90041303464602L);
    life4_5 = __call80_1();
    spill80_0 = receiver;
    if (!((life4_5 != null))) {
        forwardValue80_40_0 = spill80_0;
        break forward_join_40;
    }
    if (!((__fieldRead80_2(spill80_0) != 0))) {
        break forward_join_39;
    }
    spill80_1 = receiver;
    if (!((life4_5 != null))) {
        forwardValue80_40_0 = spill80_1;
        break forward_join_40;
    }
    if (!((__fieldRead80_3(spill80_1) != 1))) {
        break forward_join_39;
    }
    spill80_2 = __fieldRead80_4(receiver);
    if (!((life4_5 != null))) {
        forwardValue80_27_0 = spill80_2;
        break forward_join_27;
    }
    if (!((spill80_2 != 2))) {
        break forward_join_25;
    }
    return __integerCategory80_5(0);
    }
    forwardValue80_27_0 = __fieldRead80_6(receiver);
    }
    if (!((life4_5 != null))) {
        forwardValue80_110_0 = forwardValue80_27_0;
        break forward_join_110;
    }
    if (!((forwardValue80_27_0 < 0))) {
        break forward_join_109;
    }
    __fieldWrite80_8(receiver, __invokedynamic80_7(29184, (5913177286652443895L ^ life2_3)));
    if (!((life4_5 == null))) {
        break forward_join_109;
    }
    }
    forwardValue80_40_0 = receiver;
    }
    if (!((life4_5 != null))) {
        forwardValue80_58_0 = forwardValue80_40_0;
        break forward_join_58;
    }
    if (!((__fieldRead80_9(forwardValue80_40_0) == null))) {
        break forward_join_55;
    }
    java.lang.String __stackOp80_11_0 = p0;
    java.lang.String __stackOp80_11_1 = __invokedynamic80_10(16369, (1113412422199218416L ^ life2_3));
    __call80_13(__invokedynamic80_12(__stackOp80_11_1, __stackOp80_11_0));
    return __integerCategory80_14(0);
    }
    __call80_15(receiver);
    forwardValue80_58_0 = receiver;
    }
    if (!((life4_5 != null))) {
        forwardValue80_65_0 = forwardValue80_58_0;
        break forward_join_65;
    }
    if (!((__fieldRead80_16(forwardValue80_58_0) == null))) {
        break forward_join_64;
    }
    return __integerCategory80_17(0);
    }
    forwardValue80_65_0 = receiver;
    }
    spill80_3 = __fieldRead80_18(forwardValue80_65_0);
    if (!((life4_5 != null))) {
        forwardValue80_110_0 = spill80_3;
        break forward_join_110;
    }
    if (!((spill80_3 < 0))) {
        break forward_join_109;
    }
    spill80_4 = __fieldRead80_19(receiver);
    if (!((life4_5 != null))) {
        forwardValue80_90_0 = spill80_4;
        break forward_join_90;
    }
    if (!((spill80_4 == 0))) {
        break forward_join_88;
    }
    __fieldWrite80_23(receiver, __call80_22(receiver, __invokedynamic80_20(10485, (8679548890624779787L ^ life2_3)), __invokedynamic80_21(6818, (8608446999534490717L ^ life2_3))));
    }
    forwardValue80_90_0 = __fieldRead80_24(receiver);
    }
    if (!((life4_5 != null))) {
        forwardValue80_110_0 = forwardValue80_90_0;
        break forward_join_110;
    }
    if (!((forwardValue80_90_0 == 1))) {
        break forward_join_109;
    }
    __fieldWrite80_28(receiver, __call80_27(receiver, __fieldRead80_25(), new moom.DT(0, __invokedynamic80_26(22702, (9068748236160407127L ^ life2_3)), 0)));
    }
    forwardValue80_110_0 = 1;
    }
    return __integerCategory80_29(forwardValue80_110_0);
}
public static void h80_0(moom.Oo p0) throws Throwable {
    throw __call1008000_0(p0);
}
public static void h80_1(moom.Oo p0) throws Throwable {
    throw __call1008001_0(p0);
}
public static void h80_2(moom.Oo p0) throws Throwable {
    throw __call1008002_0(p0);
}
public static void h80_3(moom.Oo p0) throws Throwable {
    throw __call1008003_0(p0);
}
public static void h80_4(moom.Oo p0) throws Throwable {
    throw __call1008004_0(p0);
}
public static void h80_5(moom.Oo p0) throws Throwable {
    throw __call1008005_0(p0);
}
public static void h80_6(moom.Oo p0) throws Throwable {
    throw __call1008006_0(p0);
}
public static void h80_7(moom.Oo p0) throws Throwable {
    throw __call1008007_0(p0);
}
public static void h80_8(moom.Oo p0) throws Throwable {
    throw __call1008008_0(p0);
}
public static void h80_9(moom.Oo p0) throws Throwable {
    throw __call1008009_0(p0);
}
public static void h80_10(moom.Oo p0) throws Throwable {
    throw __call1008010_0(p0);
}
public static void h80_11(moom.Oo p0) throws Throwable {
    throw __call1008011_0(p0);
}
public static void h80_12(moom.Oo p0) throws Throwable {
    throw __call1008012_0(p0);
}
public static void h80_13(moom.Oo p0) throws Throwable {
    throw __call1008013_0(p0);
}
public static void h80_14(moom.Oo p0) throws Throwable {
    throw __call1008014_0(p0);
}
public static void h80_15(moom.Oo p0) throws Throwable {
    throw __call1008015_0(p0);
}
public static void h80_16(moom.Oo p0) throws Throwable {
    throw __call1008016_0(p0);
}
public static void h80_17(moom.Oo p0) throws Throwable {
    throw __call1008017_0(p0);
}
public static void h80_18(moom.Oo p0) throws Throwable {
    throw __call1008018_0(p0);
}
private static native long __fieldRead80_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call80_1() throws Throwable;
private static native int __fieldRead80_2(moom.Jk a0) throws Throwable;
private static native int __fieldRead80_3(moom.Jk a0) throws Throwable;
private static native int __fieldRead80_4(moom.Jk a0) throws Throwable;
private static native boolean __integerCategory80_5(int value) throws Throwable;
private static native int __fieldRead80_6(moom.Jk a0) throws Throwable;
private static native int __invokedynamic80_7(int a0, long a1) throws Throwable;
private static native void __fieldWrite80_8(moom.Jk a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead80_9(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic80_10(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic80_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call80_13(java.lang.String a0) throws Throwable;
private static native boolean __integerCategory80_14(int value) throws Throwable;
private static native void __call80_15(moom.Jk a0) throws Throwable;
private static native int[] __fieldRead80_16(moom.Jk a0) throws Throwable;
private static native boolean __integerCategory80_17(int value) throws Throwable;
private static native int __fieldRead80_18(moom.Jk a0) throws Throwable;
private static native int __fieldRead80_19(moom.Jk a0) throws Throwable;
private static native int __invokedynamic80_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic80_21(int a0, long a1) throws Throwable;
private static native int __call80_22(moom.Jk a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite80_23(moom.Jk a0, int a1) throws Throwable;
private static native int __fieldRead80_24(moom.Jk a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead80_25() throws Throwable;
private static native int __invokedynamic80_26(int a0, long a1) throws Throwable;
private static native int __call80_27(moom.Jk a0, net.minecraft.world.biome.BiomeGenBase a1, moom.DT a2) throws Throwable;
private static native void __fieldWrite80_28(moom.Jk a0, int a1) throws Throwable;
private static native boolean __integerCategory80_29(int value) throws Throwable;
private static native java.lang.Exception __call1008000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008018_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.J_ __sourceHandlerCall_6654ad0091c85f9ae8bc(moom.Jk a0, int a1) throws E;
private static final class __SourceHandler_6654ad0091c85f9ae8bc {

public static moom.J_ f715(moom.Jk receiver, int p0) throws Throwable {
    moom.J_[] lexicalValue715_13_0;
    moom.J_[] spill715_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    moom.J_[] life5_19;
    int life6_22;
    int life7_24;
    moom.J_ life8_31;
    lexical_join_37: {
    lexical_join_13: {
    life2_3 = (__fieldRead715_0() ^ 68089399952655L);
    life4_5 = __call715_1();
    spill715_0 = __fieldRead715_2(receiver);
    if (!((life4_5 != null))) {
        lexicalValue715_13_0 = spill715_0;
        break lexical_join_13;
    }
    if (!((spill715_0 != null))) {
        break lexical_join_37;
    }
    lexicalValue715_13_0 = __fieldRead715_3(receiver);
    }
    life5_19 = lexicalValue715_13_0;
    life6_22 = (life5_19).length;
    life7_24 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_35: {
    lexical_join_34: {
    if (!((life7_24 < life6_22))) {
        break lexical_join_37;
    }
    life8_31 = (life5_19)[life7_24];
    if (!((life4_5 != null))) {
        break lexical_join_35;
    }
    if (!((__call715_4(life8_31) == p0))) {
        break lexical_join_34;
    }
    return life8_31;
    }
    life7_24 += 1;
    }
    if (!((life4_5 == null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return null;
}
public static void h715_0(moom.Oo p0) throws Throwable {
    throw __call1071500_0(p0);
}
public static void h715_1(moom.Oo p0) throws Throwable {
    throw __call1071501_0(p0);
}
public static void h715_2(moom.Oo p0) throws Throwable {
    throw __call1071502_0(p0);
}
public static void h715_3(moom.Oo p0) throws Throwable {
    throw __call1071503_0(p0);
}
private static native long __fieldRead715_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call715_1() throws Throwable;
private static native moom.J_[] __fieldRead715_2(moom.Jk a0) throws Throwable;
private static native moom.J_[] __fieldRead715_3(moom.Jk a0) throws Throwable;
private static native int __call715_4(moom.J_ a0) throws Throwable;
private static native java.lang.Exception __call1071500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c44c882a0224f9f3a1a5(moom.Jk a0) throws E;
private static final class __SourceHandler_c44c882a0224f9f3a1a5 {

public static void f132(moom.Jk receiver) throws Throwable {
    java.lang.String forwardValue132_23_0;
    java.io.InputStream forwardValue132_38_0;
    java.awt.image.BufferedImage forwardValue132_46_0;
    int forwardValue132_63_0;
    int forwardValue132_65_0;
    int forwardValue132_78_0;
    int forwardValue132_80_0;
    int forwardValue132_90_0;
    int forwardValue132_133_0;
    int forwardValue132_142_0;
    moom.Jk forwardValue132_165_0;
    java.lang.String spill132_0;
    java.io.InputStream spill132_1;
    java.awt.image.BufferedImage spill132_2;
    int spill132_3;
    int spill132_4;
    int spill132_5;
    int spill132_6;
    int spill132_7;
    int spill132_8;
    int spill132_9;
    int spill132_10;
    int spill132_11;
    moom.Jk spill132_12;
    int spill132_13;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    java.lang.String life4_26;
    moom.DD life5_31;
    java.io.InputStream life6_34;
    java.awt.image.BufferedImage life7_45;
    int life8_56;
    int life9_59;
    int life10_86;
    int life11_113;
    java.lang.String life12_138;
    int life13_139;
    int life14_140;
    int life15_141;
    int life16_142;
    java.lang.String life17_198;
    int life18_199;
    int life19_200;
    forward_join_165: {
    forward_join_164: {
    forward_join_142: {
    forward_join_141: {
    forward_join_133: {
    forward_join_125: {
    forward_join_90: {
    forward_join_89: {
    forward_join_80: {
    forward_join_79: {
    forward_join_78: {
    forward_join_77: {
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_46: {
    forward_join_45: {
    forward_join_38: {
    forward_join_37: {
    forward_join_23: {
    forward_join_15: {
    life1_3 = (__fieldRead132_0() ^ 10773212381267L);
    life3_5 = __call132_1();
    __fieldWrite132_2(receiver, null);
    spill132_0 = __fieldRead132_3(receiver);
    if (!((life3_5 != null))) {
        forwardValue132_23_0 = spill132_0;
        break forward_join_23;
    }
    if (!((spill132_0 == null))) {
        break forward_join_15;
    }
    return;
    }
    forwardValue132_23_0 = __invokedynamic132_6(__fieldRead132_4(receiver), __invokedynamic132_5(26661, (4942554828910165476L ^ life1_3)));
    }
    life4_26 = forwardValue132_23_0;
    life5_31 = new moom.DD(life4_26);
    life6_34 = __call132_7(life5_31);
    spill132_1 = life6_34;
    if (!((life3_5 != null))) {
        forwardValue132_38_0 = spill132_1;
        break forward_join_38;
    }
    if (!((spill132_1 == null))) {
        break forward_join_37;
    }
    return;
    }
    forwardValue132_38_0 = life6_34;
    }
    life7_45 = __call132_8(forwardValue132_38_0);
    spill132_2 = life7_45;
    if (!((life3_5 != null))) {
        forwardValue132_46_0 = spill132_2;
        break forward_join_46;
    }
    if (!((spill132_2 == null))) {
        break forward_join_45;
    }
    return;
    }
    forwardValue132_46_0 = life7_45;
    }
    life8_56 = __call132_9(forwardValue132_46_0);
    life9_59 = __call132_10(life7_45);
    spill132_3 = __fieldRead132_11(receiver);
    if (!((life3_5 != null))) {
        forwardValue132_63_0 = spill132_3;
        break forward_join_63;
    }
    if (!((spill132_3 >= 0))) {
        break forward_join_62;
    }
    spill132_4 = __fieldRead132_12(receiver);
    if (!((life3_5 != null))) {
        forwardValue132_63_0 = spill132_4;
        break forward_join_63;
    }
    if (!((spill132_4 == life8_56))) {
        break forward_join_64;
    }
    }
    forwardValue132_63_0 = 1;
    }
    forwardValue132_65_0 = forwardValue132_63_0;
    break forward_join_65;
    }
    forwardValue132_65_0 = 0;
    }
    life10_86 = forwardValue132_65_0;
    spill132_5 = __fieldRead132_13(receiver);
    if (!((life3_5 != null))) {
        forwardValue132_78_0 = spill132_5;
        break forward_join_78;
    }
    if (!((spill132_5 >= 0))) {
        break forward_join_77;
    }
    spill132_6 = __fieldRead132_14(receiver);
    if (!((life3_5 != null))) {
        forwardValue132_78_0 = spill132_6;
        break forward_join_78;
    }
    if (!((spill132_6 == life9_59))) {
        break forward_join_79;
    }
    }
    forwardValue132_78_0 = 1;
    }
    forwardValue132_80_0 = forwardValue132_78_0;
    break forward_join_80;
    }
    forwardValue132_80_0 = 0;
    }
    life11_113 = forwardValue132_80_0;
    spill132_7 = life10_86;
    if (!((life3_5 != null))) {
        forwardValue132_90_0 = spill132_7;
        break forward_join_90;
    }
    if (!((spill132_7 != 0))) {
        break forward_join_89;
    }
    spill132_8 = life11_113;
    if (!((life3_5 != null))) {
        forwardValue132_133_0 = spill132_8;
        break forward_join_133;
    }
    if (!((spill132_8 == 0))) {
        break forward_join_125;
    }
    }
    forwardValue132_90_0 = life8_56;
    }
    spill132_9 = life9_59;
    spill132_10 = __fieldRead132_15(receiver);
    spill132_11 = __fieldRead132_16(receiver);
    life12_138 = life4_26;
    life13_139 = spill132_11;
    life14_140 = spill132_10;
    life15_141 = spill132_9;
    life16_142 = forwardValue132_90_0;
    __call132_21(__invokedynamic132_20(__invokedynamic132_17(30045, (7772847462257483917L ^ life1_3)), life16_142, "x", life15_141, __invokedynamic132_18(29293, (4833038329519925160L ^ life1_3)), life14_140, "x", life13_139, __invokedynamic132_19(27722, (7755449814587111813L ^ life1_3)), life12_138));
    }
    __fieldWrite132_22(receiver, life8_56);
    __fieldWrite132_23(receiver, life9_59);
    forwardValue132_133_0 = __fieldRead132_24(receiver);
    }
    if (!((life3_5 != null))) {
        forwardValue132_142_0 = forwardValue132_133_0;
        break forward_join_142;
    }
    if (!((forwardValue132_133_0 > 0))) {
        break forward_join_141;
    }
    spill132_12 = receiver;
    if (!((life3_5 != null))) {
        forwardValue132_165_0 = spill132_12;
        break forward_join_165;
    }
    if (!((__fieldRead132_25(spill132_12) <= 0))) {
        break forward_join_164;
    }
    }
    forwardValue132_142_0 = life8_56;
    }
    spill132_13 = life9_59;
    life17_198 = life4_26;
    life18_199 = spill132_13;
    life19_200 = forwardValue132_142_0;
    __call132_29(__invokedynamic132_28(__invokedynamic132_26(23694, (4343166926613137746L ^ life1_3)), life19_200, "x", life18_199, __invokedynamic132_27(9215, (3990695864890209853L ^ life1_3)), life17_198));
    return;
    }
    forwardValue132_165_0 = receiver;
    }
    __fieldWrite132_30(forwardValue132_165_0, new int[(life8_56 * life9_59)]);
    __call132_32(life7_45, 0, 0, life8_56, life9_59, __fieldRead132_31(receiver), 0, life8_56);
    return;
}
public static void h132_0(moom.Oo p0) throws Throwable {
    throw __call2013200_0(p0);
}
public static void h132_1(java.io.IOException p0) throws Throwable {
    throw __call2013201_0(p0);
}
public static void h132_2(java.io.IOException p0) throws Throwable {
    throw __call2013202_0(p0);
}
public static void h132_3(java.io.IOException p0) throws Throwable {
    throw __call2013203_0(p0);
}
public static void h132_4(java.io.IOException p0) throws Throwable {
    throw __call2013204_0(p0);
}
public static void h132_5(java.io.IOException p0) throws Throwable {
    throw __call2013205_0(p0);
}
public static void h132_6(java.io.IOException p0) throws Throwable {
    throw __call2013206_0(p0);
}
public static void h132_7(java.io.IOException p0) throws Throwable {
    throw __call2013207_0(p0);
}
public static void h132_8(java.io.IOException p0) throws Throwable {
    throw __call2013208_0(p0);
}
public static void h132_9(java.io.IOException p0) throws Throwable {
    throw __call2013209_0(p0);
}
public static void h132_10(java.io.IOException p0) throws Throwable {
    throw __call2013210_0(p0);
}
public static void h132_11(java.io.IOException p0) throws Throwable {
    throw __call2013211_0(p0);
}
public static void h132_12(java.io.IOException p0) throws Throwable {
    throw __call2013212_0(p0);
}
public static void h132_13(java.io.IOException p0) throws Throwable {
    throw __call2013213_0(p0);
}
public static void h132_14(java.io.IOException p0) throws Throwable {
    throw __call2013214_0(p0);
}
public static void h132_15(java.io.IOException p0) throws Throwable {
    throw __call2013215_0(p0);
}
public static void h132_16(java.io.IOException p0) throws Throwable {
    throw __call2013216_0(p0);
}
public static void h132_17(java.io.IOException p0) throws Throwable {
    throw __call2013217_0(p0);
}
public static void h132_18(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    __call2013218_0(local1);
    return;
}
private static native long __fieldRead132_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call132_1() throws Throwable;
private static native void __fieldWrite132_2(moom.Jk a0, java.lang.Object a1) throws Throwable;
private static native java.lang.String __fieldRead132_3(moom.Jk a0) throws Throwable;
private static native java.lang.String __fieldRead132_4(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic132_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic132_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.io.InputStream __call132_7(moom.DD a0) throws Throwable;
private static native java.awt.image.BufferedImage __call132_8(java.io.InputStream a0) throws Throwable;
private static native int __call132_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call132_10(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __fieldRead132_11(moom.Jk a0) throws Throwable;
private static native int __fieldRead132_12(moom.Jk a0) throws Throwable;
private static native int __fieldRead132_13(moom.Jk a0) throws Throwable;
private static native int __fieldRead132_14(moom.Jk a0) throws Throwable;
private static native int __fieldRead132_15(moom.Jk a0) throws Throwable;
private static native int __fieldRead132_16(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic132_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic132_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic132_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic132_20(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4, int a5, java.lang.String a6, int a7, java.lang.String a8, java.lang.String a9) throws Throwable;
private static native void __call132_21(java.lang.String a0) throws Throwable;
private static native void __fieldWrite132_22(moom.Jk a0, int a1) throws Throwable;
private static native void __fieldWrite132_23(moom.Jk a0, int a1) throws Throwable;
private static native int __fieldRead132_24(moom.Jk a0) throws Throwable;
private static native int __fieldRead132_25(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic132_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic132_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic132_28(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4, java.lang.String a5) throws Throwable;
private static native void __call132_29(java.lang.String a0) throws Throwable;
private static native void __fieldWrite132_30(moom.Jk a0, int[] a1) throws Throwable;
private static native int[] __fieldRead132_31(moom.Jk a0) throws Throwable;
private static native int[] __call132_32(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native java.lang.Exception __call2013200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2013201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013202_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013203_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013204_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013205_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013206_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013207_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013208_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013209_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013210_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013211_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013212_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013213_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013214_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013215_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013216_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2013217_0(java.io.IOException a0) throws Throwable;
private static native void __call2013218_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c0701ebd1abc177cce43(moom.Jk a0, int a1, int a2) throws E;
private static final class __SourceHandler_c0701ebd1abc177cce43 {

public static void f716(moom.Jk receiver, int p0, int p1) throws Throwable {
    long life3_3;
    moom.J_ life6_8;
    net.minecraft.entity.Entity[] life5_9;
    forward_join_26: {
    forward_join_19: {
    life3_3 = (__fieldRead716_0() ^ 119250231854318L);
    net.minecraft.entity.Entity[] spill716_0 = __call716_1();
    life6_8 = __call716_2(receiver, p0);
    life5_9 = spill716_0;
    if (!((life6_8 != null))) { break forward_join_19; }
    if (!((p1 >= 0))) { break forward_join_26; }
    __call716_3(life6_8, p1);
    if (!((life5_9 == null))) { break forward_join_26; }
    }
    __call716_4(receiver, new moom.J_(p0, p1));
    }
    return;
}
public static void h716_0(moom.Oo p0) throws Throwable {
    throw __call1071600_0(p0);
}
public static void h716_1(moom.Oo p0) throws Throwable {
    throw __call1071601_0(p0);
}
public static void h716_2(moom.Oo p0) throws Throwable {
    throw __call1071602_0(p0);
}
private static native long __fieldRead716_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call716_1() throws Throwable;
private static native moom.J_ __call716_2(moom.Jk a0, int a1) throws Throwable;
private static native void __call716_3(moom.J_ a0, int a1) throws Throwable;
private static native void __call716_4(moom.Jk a0, moom.J_ a1) throws Throwable;
private static native java.lang.Exception __call1071600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_c247fbe58f6ad62314f2(moom.Jk a0) throws E;
private static final class __SourceHandler_c247fbe58f6ad62314f2 {

public static int f717(moom.Jk receiver) throws Throwable {
    moom.Jk forwardValue717_15_0;
    int forwardValue717_17_0;
    moom.Jk spill717_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_15: {
    forward_join_14: {
    life1_3 = (__fieldRead717_0() ^ 98628243027030L);
    life3_5 = __call717_1();
    spill717_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue717_15_0 = spill717_0;
        break forward_join_15;
    }
    if (!((__fieldRead717_2(spill717_0) == 2))) {
        break forward_join_14;
    }
    forwardValue717_17_0 = 1;
    break forward_join_17;
    }
    forwardValue717_15_0 = receiver;
    }
    forwardValue717_17_0 = (__fieldRead717_3(forwardValue717_15_0)).length;
    }
    return forwardValue717_17_0;
}
public static void h717_0(moom.Oo p0) throws Throwable {
    throw __call1071700_0(p0);
}
public static void h717_1(moom.Oo p0) throws Throwable {
    throw __call1071701_0(p0);
}
private static native long __fieldRead717_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call717_1() throws Throwable;
private static native int __fieldRead717_2(moom.Jk a0) throws Throwable;
private static native int[] __fieldRead717_3(moom.Jk a0) throws Throwable;
private static native java.lang.Exception __call1071700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1071701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_90e874fc6158e57d0233(moom.Jk a0, java.lang.String a1) throws E;
private static final class __SourceHandler_90e874fc6158e57d0233 {

public static boolean f81(moom.Jk receiver, java.lang.String p0) throws Throwable {
    moom.J_[] forwardValue81_19_0;
    moom.J_[] spill81_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_31: {
    forward_join_29: {
    forward_join_19: {
    life2_3 = (__fieldRead81_0() ^ 129557292588819L);
    life4_5 = __call81_1();
    spill81_0 = __fieldRead81_2(receiver);
    if (!((life4_5 != null))) {
        forwardValue81_19_0 = spill81_0;
        break forward_join_19;
    }
    if (!((spill81_0 == null))) {
        break forward_join_31;
    }
    __fieldWrite81_4(receiver, __call81_3(receiver));
    if (!((life4_5 != null))) {
        break forward_join_29;
    }
    forwardValue81_19_0 = __fieldRead81_5(receiver);
    }
    if (!((forwardValue81_19_0 == null))) {
        break forward_join_31;
    }
    java.lang.String __stackOp81_7_0 = p0;
    java.lang.String __stackOp81_7_1 = __invokedynamic81_6(22088, (2140939113294208197L ^ life2_3));
    __call81_9(__invokedynamic81_8(__stackOp81_7_1, __stackOp81_7_0));
    }
    return __integerCategory81_10(0);
    }
    return __integerCategory81_11(1);
}
public static void h81_0(moom.Oo p0) throws Throwable {
    throw __call1008100_0(p0);
}
public static void h81_1(moom.Oo p0) throws Throwable {
    throw __call1008101_0(p0);
}
public static void h81_2(moom.Oo p0) throws Throwable {
    throw __call1008102_0(p0);
}
public static void h81_3(moom.Oo p0) throws Throwable {
    throw __call1008103_0(p0);
}
private static native long __fieldRead81_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call81_1() throws Throwable;
private static native moom.J_[] __fieldRead81_2(moom.Jk a0) throws Throwable;
private static native moom.J_[] __call81_3(moom.Jk a0) throws Throwable;
private static native void __fieldWrite81_4(moom.Jk a0, moom.J_[] a1) throws Throwable;
private static native moom.J_[] __fieldRead81_5(moom.Jk a0) throws Throwable;
private static native java.lang.String __invokedynamic81_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic81_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call81_9(java.lang.String a0) throws Throwable;
private static native boolean __integerCategory81_10(int value) throws Throwable;
private static native boolean __integerCategory81_11(int value) throws Throwable;
private static native java.lang.Exception __call1008100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1008103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_bed2e22159d7fccd3528(moom.Jk a0, net.minecraft.world.biome.BiomeGenBase a1, moom.DT a2) throws E;
private static final class __SourceHandler_bed2e22159d7fccd3528 {

public static int f719(moom.Jk receiver, net.minecraft.world.biome.BiomeGenBase p0, moom.DT p1) throws Throwable {
    int forwardValue719_63_0;
    net.minecraft.entity.Entity[] spill719_0;
    int spill719_1;
    long life3_3;
    int life6_6;
    int life7_13;
    net.minecraft.entity.Entity[] life5_14;
    int life8_34;
    int life9_37;
    int life10_44;
    int life11_57;
    forward_join_63: {
    forward_join_59: {
    life3_3 = (__fieldRead719_0() ^ 107760384565508L);
    life6_6 = __fieldRead719_1(p0);
    spill719_0 = __call719_2();
    life7_13 = (__call719_3(p1) - __fieldRead719_4(receiver));
    life5_14 = spill719_0;
    spill719_1 = __fieldRead719_5(receiver);
    if (!((life5_14 != null))) {
        forwardValue719_63_0 = spill719_1;
        break forward_join_63;
    }
    if (!((spill719_1 > 0))) {
        break forward_join_59;
    }
    life8_34 = (__call719_6(p1) << (__invokedynamic719_7(16808, (1919929468961363150L ^ life3_3)) + __call719_8(p1)));
    life9_37 = __call719_9(life8_34);
    life10_44 = ((__fieldRead719_10(receiver) * 2) + 1);
    life11_57 = (((life9_37 & __invokedynamic719_11(19982, (5714257497905699686L ^ life3_3))) % life10_44) - __fieldRead719_12(receiver));
    life7_13 = (life7_13 + life11_57);
    }
    forwardValue719_63_0 = __call719_13(receiver, life6_6, life7_13);
    }
    return forwardValue719_63_0;
}
public static void h719_0(moom.Oo p0) throws Throwable {
    throw __call1071900_0(p0);
}
private static native long __fieldRead719_0() throws Throwable;
private static native int __fieldRead719_1(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call719_2() throws Throwable;
private static native int __call719_3(moom.DT a0) throws Throwable;
private static native int __fieldRead719_4(moom.Jk a0) throws Throwable;
private static native int __fieldRead719_5(moom.Jk a0) throws Throwable;
private static native int __call719_6(moom.DT a0) throws Throwable;
private static native int __invokedynamic719_7(int a0, long a1) throws Throwable;
private static native int __call719_8(moom.DT a0) throws Throwable;
private static native int __call719_9(int a0) throws Throwable;
private static native int __fieldRead719_10(moom.Jk a0) throws Throwable;
private static native int __invokedynamic719_11(int a0, long a1) throws Throwable;
private static native int __fieldRead719_12(moom.Jk a0) throws Throwable;
private static native int __call719_13(moom.Jk a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1071900_0(moom.Oo a0) throws Throwable;

}


public java.lang.String toString() {
long local1 = (moom.Jk.n ^ 14897486069086L);
    java.lang.String __sourceSpill1741_6 = this.b;
    java.lang.String __sourceSpill1741_7 = this.a;
    java.lang.String __sourceSpill1741_8 = moom.BU.a(((java.lang.Object[])(this.d)));
    java.lang.String local3 = this.e;
    java.lang.String local4 = __sourceSpill1741_8;
    java.lang.String local5 = __sourceSpill1741_7;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite1741_11(__sourceSpill1741_6, "/", local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1741_9(11719, (3634028916727514392L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite1741_10(4856, (7316014853274909237L ^ local1)), local3);
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.Jk.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int b() { return __sourceHandlerCall_c247fbe58f6ad62314f2(this); }


private int b(net.minecraft.world.biome.BiomeGenBase p0, moom.DT p1) {
double local3 = ((double) moom.Dr.a(((float)(((net.minecraft.world.biome.BiomeGenBase)(p0)).a(((moom.DT)(p1))))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))));
    double local5 = ((double) moom.Dr.a(((float)(((net.minecraft.world.biome.BiomeGenBase)(p0)).b())), ((float)(0x0.0p0f)), ((float)(0x1.0p0f))));
    local5 = (local5 * local3);
    int local7 = ((int) ((0x1.0p0d - local3) * ((double) (this.i - 1))));
    int local8 = ((int) ((0x1.0p0d - local5) * ((double) (this.j - 1))));
    return ((moom.Jk)(this)).a(((int)(local7)), ((int)(local8)));
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5350_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x6B81;
        if (s[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = r[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])t.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    t.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/Jk", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            Jk.s[n4] = n7;
        }
        return s[n4];
}


public boolean b__Boolean(java.lang.String p0) { return __sourceHandlerCall_90e874fc6158e57d0233(this, p0); }


private static void b(java.lang.String p0) {
long local1_life2 = (moom.Jk.n ^ 128512042563833L);
    java.lang.String __stackOp542_5_0 = p0;
    java.lang.String __stackOp542_5_1 = __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite542_4(16926, (5221164947457929061L ^ local1_life2));
    moom.BU.c(((java.lang.String)(__sourceIntrinsic_d1c1922d1ba0_originalDynamicSite542_6(__stackOp542_5_1, __stackOp542_5_0))));
    return;
}


private int c(net.minecraft.world.biome.BiomeGenBase p0, moom.DT p1) { return __sourceHandlerCall_bed2e22159d7fccd3528(this, p0, p1); }


public int c() {
return this.i;
}


public int d() {
return this.j;
}


private void a__Void() { __sourceHandlerCall_c44c882a0224f9f3a1a5(this); }


public int[] a__ArrayInt() { return __sourceHandlerCall_cb8944878534e6f1846b(this); }


private moom.J_ a__J_(int p0) { return __sourceHandlerCall_6654ad0091c85f9ae8bc(this, p0); }


public void a__Void(int p0, int p1) { __sourceHandlerCall_c0701ebd1abc177cce43(this, p0, p1); }


public void a(moom.J_ p0) { __sourceHandlerCall_4eaf4094cbbd994ddfaf(this, p0); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.Jk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5358_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Jk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(java.lang.String p0) { return __sourceHandlerCall_3a160eadd6430ba098ad(this, p0); }


private int a(java.lang.String p0) { return __sourceHandlerCall_4acd6ba690dfd599bee4(this, p0); }


private moom.J_[] a__ArrayJ_() { return __sourceHandlerCall_767f13c1c72f7316b219(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
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
        byte[] spill2764_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2764_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2764_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2764_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2764_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2764_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2666);
    if (((moom.Jk.p)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.Jk.q)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.Jk.q)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/Jk", life9_51);
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
        life9_116 = ((java.lang.String)((moom.Jk.o)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.Jk.p)[life5_8] = moom.Jk.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.Jk.p)[life5_8];
}


public int a(int p0) {
long local2 = (moom.Jk.n ^ 2041753113070L);
    p0 = moom.BU.a(((int)(p0)), ((int)(0)), ((int)(((this.k).length - 1))));
    return ((this.k)[p0] & __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1203_4(10119, (3347372168349647366L ^ local2)));
}


public int a(int p0, int p1) {
long local3 = (moom.Jk.n ^ 2536025510532L);
    p0 = moom.BU.a(((int)(p0)), ((int)(0)), ((int)((this.i - 1))));
    p1 = moom.BU.a(((int)(p1)), ((int)(0)), ((int)((this.j - 1))));
    return ((this.k)[((p1 * this.i) + p0)] & __sourceIntrinsic_90f211e43b08_originalDynamicSite1204_7(10119, (3347373908165443948L ^ local3)));
}


public float[][] a__ArrayArrayFloat() { return __sourceHandlerCall_fd4168f6d1e8673c1748(this); }


public int a(net.minecraft.block.state.IBlockState p0, net.minecraft.world.IBlockAccess p1, moom.DT p2) {
return ((moom.Jk)(this)).a(((net.minecraft.world.IBlockAccess)(p1)), ((moom.DT)(p2)));
}


public int a() { return __sourceHandlerCall_3c65b0e51dca6949db2f(this); }


public boolean a(moom.fB p0) {
return (__sourceIntrinsic_booleanComparison((moom.Ka.a(((moom.fB)(p0)), ((moom.J_[])(this.d))))) != 0);
}


private static java.lang.String a(java.lang.String p0, java.lang.String p1) { return __sourceHandlerCall_1fe4f7d5ab8b138d69c8(p0, p1); }


public int a(net.minecraft.world.IBlockAccess p0, double p1, double p2, double p3, int p4) { return __sourceHandlerCall_2462337fb1bbe22bbb82(this, p0, p1, p2, p3, p4); }


private static void a__Void(java.lang.String p0) {
long local1_life2 = (moom.Jk.n ^ 132539955248095L);
    java.lang.String __stackOp541_5_0 = p0;
    java.lang.String __stackOp541_5_1 = __sourceIntrinsic_e2d81269afae_originalDynamicSite541_4(13165, (598865730908626232L ^ local1_life2));
    moom.BU.b__Void(((java.lang.String)(__sourceIntrinsic_e2d81269afae_originalDynamicSite541_6(__stackOp541_5_1, __stackOp541_5_0))));
    return;
}


private static java.lang.String a(java.lang.String p0, java.lang.String p1, java.lang.String p2) { return __sourceHandlerCall_e959925c8367e058b369(p0, p1, p2); }


private static float[][] a(int[] p0) {
float[][] forestValue100087_88_0;
    net.minecraft.entity.Entity[] spill100087_0;
    float[][] spill100087_1;
    long life1_3;
    float[][] life4_9;
    net.minecraft.entity.Entity[] life3_10;
    int life5_12;
    int life6_20;
    float life7_37;
    float life8_54;
    float life9_65;
    float[] life10_71;
    forest_join_88: {
    forest_join_87: {
    life1_3 = (moom.Jk.n ^ 22260294555347L);
    spill100087_0 = moom.JM.b__Arrayr3();
    life4_9 = __sourceIntrinsic_629c70e90816_call100087_2((p0).length, 3);
    life3_10 = spill100087_0;
    life5_12 = 0;
    forest_cycle_13: while (true) {
    if (!((life5_12 < (p0).length))) {
        break forest_join_87;
    }
    life6_20 = (p0)[life5_12];
    life7_37 = (((float) ((life6_20 >> __sourceIntrinsic_629c70e90816_invokedynamic100087_3(16808, (1919804000173908761L ^ life1_3))) & __sourceIntrinsic_629c70e90816_invokedynamic100087_4(19982, (5714338762856230065L ^ life1_3)))) / 0x1.fep7f);
    life8_54 = (((float) ((life6_20 >> __sourceIntrinsic_629c70e90816_invokedynamic100087_5(29697, (2015756513684182715L ^ life1_3))) & __sourceIntrinsic_629c70e90816_invokedynamic100087_6(19982, (5714338762856230065L ^ life1_3)))) / 0x1.fep7f);
    life9_65 = (((float) (life6_20 & __sourceIntrinsic_629c70e90816_invokedynamic100087_7(19982, (5714338762856230065L ^ life1_3)))) / 0x1.fep7f);
    spill100087_1 = life4_9;
    if (!((life3_10 != null))) {
        forestValue100087_88_0 = spill100087_1;
        break forest_join_88;
    }
    life10_71 = (spill100087_1)[life5_12];
    (life10_71)[0] = life7_37;
    (life10_71)[1] = life8_54;
    (life10_71)[2] = life9_65;
    life5_12 += 1;
    if (!((life3_10 == null))) {
        continue forest_cycle_13;
    }
    break forest_cycle_13;
    }
    }
    forestValue100087_88_0 = life4_9;
    }
    return forestValue100087_88_0;
}


public int a(net.minecraft.world.biome.BiomeGenBase p0, moom.DT p1) { return __sourceHandlerCall_9bebbb91358a1755fe1b(this, p0, p1); }


public boolean a__Boolean() { return __sourceHandlerCall_124239950e15bbe982f4(this); }


public int a(net.minecraft.world.IBlockAccess p0, moom.DT p1) {
java.lang.Object local3 = moom.Jl.a__ES(((net.minecraft.world.IBlockAccess)(p0)), ((moom.DT)(p1)));
    return ((moom.Jk)(this)).a(((net.minecraft.world.biome.BiomeGenBase)(local3)), ((moom.DT)(p1)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite611_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite611_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite611_101(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_16ba87b06bd9c8b2_originalDynamicSite2239_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1203_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_90f211e43b08_originalDynamicSite1204_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5358_0() throws E;

private static native <E extends Throwable> float[][] __sourceIntrinsic_629c70e90816_call100087_2(int a0, int a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_629c70e90816_invokedynamic100087_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_629c70e90816_invokedynamic100087_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_629c70e90816_invokedynamic100087_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_629c70e90816_invokedynamic100087_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_629c70e90816_invokedynamic100087_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite541_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e2d81269afae_originalDynamicSite541_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite542_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d1c1922d1ba0_originalDynamicSite542_6(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5350_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1741_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1741_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite1741_11(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
