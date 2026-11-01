package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class KY extends moom.Km {

private static java.util.Map<java.lang.String, java.lang.Integer> f;

private static long h;

private static java.lang.String[] i;

private static java.lang.String[] j;

private static java.util.Map k;

private static long[] l;

private static java.lang.Integer[] m;

private static java.util.Map n;

public KY() { super((java.lang.Class)null, (java.lang.String)null, 0.0F); }

private static void __sourceConstructorBody_438ce7e342f3a8ad(moom.KY receiver) throws Throwable {
long local1 = (moom.KY.h ^ 27057670951472L);
    moom.KY.__sourceConstructorInit_438ce7e342f3a8ad_0(((moom.KY)(receiver)), ((java.lang.Object)(net.minecraft.entity.passive.EntityRabbit.class)), ((java.lang.String)(__sourceIntrinsic_438ce7e342f3a8ad_originalDynamicSite2319_2(23812, (2701414955553756322L ^ local1)))), ((float)(0x1.333334p-2f)));
    return;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-5417316728926190845L)), ((long)(-4442698466921474812L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(238440227084985L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.KY.h ^ 99306338837441L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill648_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill648_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill648_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill648_14 = new byte[8];
    (__sourceSpill648_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill648_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation648_16 = __sourceSpill648_14;
    ((javax.crypto.Cipher)(__sourceSpill648_11)).init(((int)(__sourceSpill648_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill648_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation648_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[25];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "#W§£¯>\004Y)\rûYå\rÞ­woßI\030!vPÉ\026\0041·\036?ô$æiÅÅ2Úß®\030\030ÁNtà³¿ÊÇpóÆèë«y{zZ=\001\020¨ö\016@#?\005)\177\0077?\023\033ë\020~\n\003}c:¤ÑÛèK¬i \022@CÓ'ÂçÐc1êe%\020.Ü×A®Òe/Öñú\"\020ô }E\027÷%Æ¨xyhë\005 Aá·C>æªÝÞ?µí\177)_¾&öÊ\005ÿôüz| ØÈÓÈ¥ÀÙF&\022Xë@\t¯øªR\033gÎ\032Î¯J\030Õ\n\004±\004b\032\033ZæGß¡5\\T³%ì\002­\003 î>P#«vD{VÓ-0ìG\177]à*² Ýà\"èÐ\033VJþV1 yé)ÞªZD,\0347\035\f \1771kyÐ[ÙÅKUÔÆÒfô\020á_¢º\006?\030½è!.ÛÝÜ ÿâ5\022Eã\037puØwM¿e÷\020»ICW\n[òÁ@õ\001áÕ\020¥\003\036\035\bÐ¾>\003 ¦3Àã¬\020¥o¾\013÷²eò¨r #ÓíË\020;N@pÀ®\020éîã/xÖ| ¾hÞwæ\030Å¡[,t§á\0139Ø\f&,\\ÿþ¼é°-ú Åf\t\003Õm©u>|öZà@£e\030r\tN\177]¥q@&¾\030\037ÿ§¨ßµØ\017dî²íSóa\bR\026ºõ\020¢t\b\023u¥\007ajb`yà |ÆäE\034Õ­ûÃÒ­Ã\007X#¼á\b¿(\035ÿ\0260,Jªø\024 -\007¾¢ âô> ä8ÐU\032+g`N+¨á\026Ò[Â¶E("))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill648_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill648_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill648_29)).doFinal(((byte[])(__sourceSpill648_28)));
        java.lang.String __sourceSpill648_34 = ((java.lang.String)(moom.KY.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill648_35 = local20_life19;
        int __sourceSpill648_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill648_35)[__sourceSpill648_36] = __sourceSpill648_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "­\004Vøÿ¤¤ên«tÊzgþ\\\026¼\001&M úóÒµþ«ÊÒP¿¥|âCÅ)\b\0136ß¯Õº|\002Ü/"))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill648_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill648_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill648_42)).doFinal(((byte[])(__sourceSpill648_41)));
        java.lang.String __sourceSpill648_47 = ((java.lang.String)(moom.KY.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill648_48 = local20_life19;
        int __sourceSpill648_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill648_48)[__sourceSpill648_49] = __sourceSpill648_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    i = ((java.lang.String[])(local20_life19));
    j = ((java.lang.String[])(new java.lang.String[25]));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill648_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill648_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill648_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill648_60 = new byte[8];
    (__sourceSpill648_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill648_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation648_62 = __sourceSpill648_60;
    ((javax.crypto.Cipher)(__sourceSpill648_57)).init(((int)(__sourceSpill648_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill648_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation648_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[13];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "SóØ'Ä]-\023Y\022ô<½\013\177`dÑë8\f$ò²þwxµsj|Tßóô×Y\f>\033Ù´{d³ë¤;%\fËî4\037©ñó6h8ÇO\004YO3±\003âèjís´grT"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill648_71 = local4_life67;
        int __sourceSpill648_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill648_71)).substring(((int)(__sourceSpill648_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill648_76 = local6_life65;
        int __sourceSpill648_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill648_79 = new byte[8];
        (__sourceSpill648_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill648_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill648_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill648_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill648_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill648_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill648_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill648_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill648_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill648_80)).doFinal(((byte[])(__sourceSpill648_79)));
        (__sourceSpill648_76)[__sourceSpill648_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "\nl¢pÝ°v.ù2«¬7¨r"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill648_84 = local4_life67;
        int __sourceSpill648_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill648_84)).substring(((int)(__sourceSpill648_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill648_89 = local6_life65;
        int __sourceSpill648_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill648_92 = new byte[8];
        (__sourceSpill648_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill648_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill648_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill648_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill648_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill648_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill648_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill648_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill648_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill648_93)).doFinal(((byte[])(__sourceSpill648_92)));
        (__sourceSpill648_89)[__sourceSpill648_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    l = ((long[])(local6_life65));
    m = ((java.lang.Integer[])(new java.lang.Integer[13]));
    f = ((java.util.Map)(null));
}

private static native <E extends Throwable> void __sourceConstructorInit_438ce7e342f3a8ad_0(moom.KY a0, java.lang.Object a1, java.lang.String a2, float a3) throws E;
private static native <E extends Throwable> java.util.Map __sourceHandlerCall_1d9e32cb0e0ec6d34135() throws E;
private static final class __SourceHandler_1d9e32cb0e0ec6d34135 {

public static java.util.Map f788() throws Throwable {
    java.util.Map forwardValue788_159_0;
    java.util.Map spill788_0;
    long life0_3;
    int[] life2_5;
    forward_join_159: {
    forward_join_158: {
    life0_3 = (__fieldRead788_0() ^ 37143926492985L);
    life2_5 = __call788_1();
    spill788_0 = __fieldRead788_2();
    if (!((life2_5 != null))) {
        forwardValue788_159_0 = spill788_0;
        break forward_join_159;
    }
    if (!((spill788_0 == null))) {
        break forward_join_158;
    }
    __fieldWrite788_3(new java.util.HashMap());
    __call788_7(__fieldRead788_4(), __invokedynamic788_5(32752, (4103055360827517771L ^ life0_3)), __call788_6(0));
    __call788_11(__fieldRead788_8(), __invokedynamic788_9(27193, (4163108983886413469L ^ life0_3)), __call788_10(1));
    __call788_15(__fieldRead788_12(), __invokedynamic788_13(15200, (6054018334205915094L ^ life0_3)), __call788_14(2));
    __call788_19(__fieldRead788_16(), __invokedynamic788_17(4347, (1297501299458769995L ^ life0_3)), __call788_18(3));
    __call788_23(__fieldRead788_20(), __invokedynamic788_21(8495, (2301904280908150154L ^ life0_3)), __call788_22(4));
    __call788_27(__fieldRead788_24(), __invokedynamic788_25(28076, (8877071345544657166L ^ life0_3)), __call788_26(5));
    __call788_32(__fieldRead788_28(), __invokedynamic788_29(30878, (522759080077585463L ^ life0_3)), __call788_31(__invokedynamic788_30(15407, (7907933840485917967L ^ life0_3))));
    __call788_37(__fieldRead788_33(), __invokedynamic788_34(8051, (8840121499489405907L ^ life0_3)), __call788_36(__invokedynamic788_35(21562, (4261727393465421072L ^ life0_3))));
    __call788_42(__fieldRead788_38(), __invokedynamic788_39(4140, (7588003417031279754L ^ life0_3)), __call788_41(__invokedynamic788_40(25965, (7952835399798553676L ^ life0_3))));
    __call788_47(__fieldRead788_43(), __invokedynamic788_44(8446, (4154750658559816779L ^ life0_3)), __call788_46(__invokedynamic788_45(15106, (3833016593165591087L ^ life0_3))));
    __call788_52(__fieldRead788_48(), __invokedynamic788_49(26890, (6229277054426086846L ^ life0_3)), __call788_51(__invokedynamic788_50(17561, (3897089261966613936L ^ life0_3))));
    __call788_57(__fieldRead788_53(), __invokedynamic788_54(17350, (5268526175887218549L ^ life0_3)), __call788_56(__invokedynamic788_55(31246, (2741473672152179496L ^ life0_3))));
    }
    forwardValue788_159_0 = __fieldRead788_58();
    }
    return forwardValue788_159_0;
}
public static void h788_0(moom.Oo p0) throws Throwable {
    throw __call1078800_0(p0);
}
public static void h788_1(moom.Oo p0) throws Throwable {
    throw __call1078801_0(p0);
}
private static native long __fieldRead788_0() throws Throwable;
private static native int[] __call788_1() throws Throwable;
private static native java.util.Map __fieldRead788_2() throws Throwable;
private static native void __fieldWrite788_3(java.util.HashMap a0) throws Throwable;
private static native java.util.Map __fieldRead788_4() throws Throwable;
private static native java.lang.String __invokedynamic788_5(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_6(int a0) throws Throwable;
private static native java.lang.Object __call788_7(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_8() throws Throwable;
private static native java.lang.String __invokedynamic788_9(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_10(int a0) throws Throwable;
private static native java.lang.Object __call788_11(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_12() throws Throwable;
private static native java.lang.String __invokedynamic788_13(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_14(int a0) throws Throwable;
private static native java.lang.Object __call788_15(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_16() throws Throwable;
private static native java.lang.String __invokedynamic788_17(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_18(int a0) throws Throwable;
private static native java.lang.Object __call788_19(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_20() throws Throwable;
private static native java.lang.String __invokedynamic788_21(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_22(int a0) throws Throwable;
private static native java.lang.Object __call788_23(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_24() throws Throwable;
private static native java.lang.String __invokedynamic788_25(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_26(int a0) throws Throwable;
private static native java.lang.Object __call788_27(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_28() throws Throwable;
private static native java.lang.String __invokedynamic788_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic788_30(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_31(int a0) throws Throwable;
private static native java.lang.Object __call788_32(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_33() throws Throwable;
private static native java.lang.String __invokedynamic788_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic788_35(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_36(int a0) throws Throwable;
private static native java.lang.Object __call788_37(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_38() throws Throwable;
private static native java.lang.String __invokedynamic788_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic788_40(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_41(int a0) throws Throwable;
private static native java.lang.Object __call788_42(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_43() throws Throwable;
private static native java.lang.String __invokedynamic788_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic788_45(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_46(int a0) throws Throwable;
private static native java.lang.Object __call788_47(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_48() throws Throwable;
private static native java.lang.String __invokedynamic788_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic788_50(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_51(int a0) throws Throwable;
private static native java.lang.Object __call788_52(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_53() throws Throwable;
private static native java.lang.String __invokedynamic788_54(int a0, long a1) throws Throwable;
private static native int __invokedynamic788_55(int a0, long a1) throws Throwable;
private static native java.lang.Integer __call788_56(int a0) throws Throwable;
private static native java.lang.Object __call788_57(java.util.Map a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.Map __fieldRead788_58() throws Throwable;
private static native java.lang.Exception __call1078800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1078801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.jD __sourceHandlerCall_540f009df33291dcf711(moom.KY a0, moom.iQ a1, java.lang.String a2) throws E;
private static final class __SourceHandler_540f009df33291dcf711 {

public static moom.jD f312(moom.KY receiver, moom.iQ p0, java.lang.String p1) throws Throwable {
    moom.iQ forwardValue312_12_0;
    int forwardValue312_31_0;
    moom.iQ spill312_0;
    boolean spill312_1;
    long life3_3;
    int[] life5_5;
    moom.jn life6_19;
    java.util.Map life7_27;
    int life8_45;
    java.lang.Object[] life9_52;
    forward_join_47: {
    forward_join_31: {
    forward_join_18: {
    forward_join_16: {
    forward_join_12: {
    life3_3 = (__fieldRead312_0() ^ 105777619781678L);
    life5_5 = __call312_1();
    spill312_0 = p0;
    if (!((life5_5 != null))) {
        forwardValue312_12_0 = spill312_0;
        break forward_join_12;
    }
    if (!((__instanceOf312_2(spill312_0) != 0))) {
        break forward_join_16;
    }
    forwardValue312_12_0 = p0;
    }
    life6_19 = __cast312_3(forwardValue312_12_0);
    if (!((life5_5 == null))) {
        break forward_join_18;
    }
    }
    return null;
    }
    life7_27 = __call312_4();
    spill312_1 = __call312_5(life7_27, p1);
    if (!((life5_5 != null))) {
        forwardValue312_31_0 = __integerCategory312_6(spill312_1);
        break forward_join_31;
    }
    if (!(spill312_1)) {
        break forward_join_47;
    }
    forwardValue312_31_0 = __call312_9(__cast312_8(__call312_7(life7_27, p1)));
    }
    life8_45 = forwardValue312_31_0;
    life9_52 = __call312_15(__call312_14(__call312_12(__call312_11(__classLiteral312_10())), __invokedynamic312_13()));
    return __cast312_18(__call312_17(__cast312_16((life9_52)[life8_45]), life6_19));
    }
    return null;
}
public static moom.jD h312_0(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031200_0(p0);
}
public static moom.jD h312_1(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031201_0(p0);
}
public static moom.jD h312_2(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031202_0(p0);
}
public static moom.jD h312_3(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031203_0(p0);
}
public static moom.jD h312_4(java.lang.IllegalAccessException p0) throws Throwable {
    throw __call2031204_0(p0);
}
public static moom.jD h312_5(java.lang.IllegalAccessException p0) throws Throwable {
    java.lang.IllegalAccessException local1 = p0;
    return null;
}
private static native long __fieldRead312_0() throws Throwable;
private static native int[] __call312_1() throws Throwable;
private static native int __instanceOf312_2(moom.iQ a0) throws Throwable;
private static native moom.jn __cast312_3(moom.iQ a0) throws Throwable;
private static native java.util.Map __call312_4() throws Throwable;
private static native boolean __call312_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory312_6(boolean value) throws Throwable;
private static native java.lang.Object __call312_7(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __cast312_8(java.lang.Object a0) throws Throwable;
private static native int __call312_9(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __classLiteral312_10() throws Throwable;
private static native java.lang.reflect.Field[] __call312_11(java.lang.Object a0) throws Throwable;
private static native java.util.stream.Stream __call312_12(java.lang.reflect.Field[] a0) throws Throwable;
private static native java.util.function.Predicate __invokedynamic312_13() throws Throwable;
private static native java.util.stream.Stream __call312_14(java.util.stream.Stream a0, java.util.function.Predicate a1) throws Throwable;
private static native java.lang.Object[] __call312_15(java.util.stream.Stream a0) throws Throwable;
private static native java.lang.reflect.Field __cast312_16(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call312_17(java.lang.reflect.Field a0, moom.jn a1) throws Throwable;
private static native moom.jD __cast312_18(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2031200_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031201_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031202_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031203_0(java.lang.IllegalAccessException a0) throws Throwable;
private static native java.lang.Exception __call2031204_0(java.lang.IllegalAccessException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_c6ffa09b4f275063437a(java.lang.reflect.Field a0) throws E;
private static final class __SourceHandler_c6ffa09b4f275063437a {

public static boolean f1369(java.lang.reflect.Field p0) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead1369_0() ^ 113345743077115L);
    return ((__call1369_1(p0) == __classLiteral1369_2()) ? true : false);
}
public static void h1369_0(moom.Oo p0) throws Throwable {
    throw __call1136900_0(p0);
}
private static native long __fieldRead1369_0() throws Throwable;
private static native java.lang.Class __call1369_1(java.lang.reflect.Field a0) throws Throwable;
private static native java.lang.Object __classLiteral1369_2() throws Throwable;
private static native java.lang.Exception __call1136900_0(moom.Oo a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.KY.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5698_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x5E6A;
        if (m[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = KY.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])KY.n.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    KY.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/KY", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            KY.m[n2] = n4;
        }
        return m[n2];
}


public java.lang.String[] b__ArrayString() {
long local1_life1 = (moom.KY.h ^ 110328880932982L);
    java.lang.String[] __sourceSharedArray666_4 = new java.lang.String[__sourceIntrinsic_b33388dd40f1_originalDynamicSite666_2(9916, (7674961607569201373L ^ local1_life1))];
    __sourceSharedArray666_4[0] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_3(23732, (7277288876895121237L ^ local1_life1));
    __sourceSharedArray666_4[1] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_5(21397, (7086797479633592434L ^ local1_life1));
    __sourceSharedArray666_4[2] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_6(26128, (7119185944276506100L ^ local1_life1));
    __sourceSharedArray666_4[3] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_7(22115, (5055155025032586653L ^ local1_life1));
    __sourceSharedArray666_4[4] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_8(18203, (1805318622999983347L ^ local1_life1));
    __sourceSharedArray666_4[5] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_9(19684, (5372004131926687489L ^ local1_life1));
    __sourceSharedArray666_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite666_10(28557, (4470036942968590826L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_11(14164, (3530096636957738168L ^ local1_life1));
    __sourceSharedArray666_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite666_12(6524, (2948563439263999760L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_13(21229, (6181016844205760783L ^ local1_life1));
    __sourceSharedArray666_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite666_14(7664, (5223253209878356893L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_15(11873, (6428997089181228431L ^ local1_life1));
    __sourceSharedArray666_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite666_16(12171, (6285109015209628143L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_17(23493, (6021932886747162680L ^ local1_life1));
    __sourceSharedArray666_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite666_18(7207, (540639378437464644L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_19(12262, (4695793687811087365L ^ local1_life1));
    __sourceSharedArray666_4[__sourceIntrinsic_b33388dd40f1_originalDynamicSite666_20(26507, (2685811623354505707L ^ local1_life1))] = __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_21(13802, (2909169096705295890L ^ local1_life1));
    return __sourceSharedArray666_4;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5699_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/KY"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.KY.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public moom.jD a(moom.iQ p0, java.lang.String p1) { return __sourceHandlerCall_540f009df33291dcf711(this, p0, p1); }


public moom.iQ a__iQ() {
return new moom.jn();
}


public moom.Kl a(moom.iQ p0, float p1) {
net.minecraft.client.renderer.entity.RenderManager local3 = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__nw();
    return new net.minecraft.client.renderer.entity.RenderRabbit(local3, p0, p1);
}


private static java.util.Map<java.lang.String, java.lang.Integer> a__sourceReturn_43b9f1ea53() { return __sourceHandlerCall_1d9e32cb0e0ec6d34135(); }


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
        byte[] spill2903_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2903_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2903_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2903_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2903_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2903_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21475);
    if (((moom.KY.j)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.KY.k)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.KY.k)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/KY", life9_51);
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
        life9_116 = ((java.lang.String)((moom.KY.i)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.KY.j)[life5_8] = moom.KY.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.KY.j)[life5_8];
}


private static boolean lambda$getModelRenderer$0(java.lang.reflect.Field p0) { return __sourceHandlerCall_c6ffa09b4f275063437a(p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_438ce7e342f3a8ad_originalDynamicSite2319_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5699_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5698_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b33388dd40f1_originalDynamicSite666_21(int a0, long a1) throws E;
}
