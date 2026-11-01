package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jD {

private static java.util.regex.Pattern a;

private static org.tinylog.TaggedLogger b;

private int c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

public jD(java.lang.String p0, java.lang.String p1, boolean p2) { super(); __sourceHandlerCall_ff221f8e638336c370e3(this, p0, p1, p2); }


static {
d = ((long)(((moom._a)(moom._c.a(((long)(-841357550561351351L)), ((long)(-6681680031173487427L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112072142115916L)))));
    long local20_life6 = (com.moon.jD.d ^ 76848704787064L);
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill182_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill182_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill182_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill182_14 = new byte[8];
    (__sourceSpill182_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill182_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation182_16 = __sourceSpill182_14;
    ((javax.crypto.Cipher)(__sourceSpill182_11)).init(((int)(__sourceSpill182_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill182_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation182_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[13];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "kp\027?àpïÊ WÔ£gÎ\002\\\005ÛâÒcäD\036i\022GÒ`UDÀê]~GÞ9ó}wÀ{Â\fmoöÔßt\002ý(Gþ,ûäÂ\022Ô\036Ma¢U\002> v;6É_ø0ê\023A«fW\r²S\020;dºµ²´ÖQø»ð\036Ø(2µó\032lºÔP\"s\027_\003ÁC\006¾ß\032êeA]\006E0bÌÌQ­ä\032Ö.&\020ÈcKIgÑ¸\000£\035Ø©ðð\025\030(\031WN¸Swðì5w&ãÇ]\036CíJ[1í@ÝºÄä\022ú;\002c¥\034áÔ\026-9¼î÷*¤£v)ãæ<mm¶:L\035ðØóoïûÏñê;\037Aò³ÛädÚH\037Üp\021 _mÑ+èv\b\034Ø\024VÕÉ\032¶\024/#27¤Úxæü=OP<qÇ}fóÐ±á@\000#§}|Þñ_ßôhÜ\033°íe·\n(Ý\021J\031¢ìzÀ×2°ÂóÝEPx7ù­=¯N^Áð¶¸°Jo{¢ïu,Éü\000¼\024`×x1Æv«\022\004{ÿ97Þ3Z:y¿ m\025[Û1¯sZÕè\016¶oöqÀà~'\035R0Æï¹j6ãV}/ºzü¦Ë\t\r%#b[~¬PÚ^»â¹>NlÏ5C =B!tKpV­¨­y\fpv~OÅkñ5ù\025)T<°ÈãÆ4(ä\030Ke3%¹B\024\036Y3óàwª\036¸Ô±õ\024ÉUÄ"))).length();
    int local14_life24 = 56;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill182_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill182_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill182_29)).doFinal(((byte[])(__sourceSpill182_28)));
        java.lang.String __sourceSpill182_34 = ((java.lang.String)(com.moon.jD.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill182_35 = local18_life19;
        int __sourceSpill182_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill182_35)[__sourceSpill182_36] = __sourceSpill182_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "1á®¦¯1yÄç_BÒoZ\035aÉä$&Â;Ãkè0\013øù\fÞèhóëøa{©ëflÆH\n#­?ÕGDúçìY\bÝã¬_ÖÄÍÛ©òs"))).length();
    local14_life24 = 32;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill182_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill182_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill182_42)).doFinal(((byte[])(__sourceSpill182_41)));
        java.lang.String __sourceSpill182_47 = ((java.lang.String)(com.moon.jD.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill182_48 = local18_life19;
        int __sourceSpill182_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill182_48)[__sourceSpill182_49] = __sourceSpill182_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    e = ((java.lang.String[])(local18_life19));
    f = ((java.lang.String[])(new java.lang.String[13]));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill182_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill182_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill182_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill182_60 = new byte[8];
    (__sourceSpill182_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill182_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation182_62 = __sourceSpill182_60;
    ((javax.crypto.Cipher)(__sourceSpill182_57)).init(((int)(__sourceSpill182_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill182_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation182_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[4];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\032p\002IJ\\ÕRår-Z¡\034X"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill182_71 = local4_life67;
        int __sourceSpill182_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill182_71)).substring(((int)(__sourceSpill182_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill182_76 = local6_life65;
        int __sourceSpill182_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill182_79 = new byte[8];
        (__sourceSpill182_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill182_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill182_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill182_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill182_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill182_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill182_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill182_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill182_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill182_80)).doFinal(((byte[])(__sourceSpill182_79)));
        (__sourceSpill182_76)[__sourceSpill182_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "ÔÈõ\\N£oã3YRÄë\177Ì"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill182_84 = local4_life67;
        int __sourceSpill182_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill182_84)).substring(((int)(__sourceSpill182_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill182_89 = local6_life65;
        int __sourceSpill182_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill182_92 = new byte[8];
        (__sourceSpill182_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill182_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill182_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill182_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill182_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill182_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill182_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill182_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill182_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill182_93)).doFinal(((byte[])(__sourceSpill182_92)));
        (__sourceSpill182_89)[__sourceSpill182_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    h = ((long[])(local6_life65));
    i = ((java.lang.Integer[])(new java.lang.Integer[4]));
    a = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite182_98(9885, (1808105030525049689L ^ local20_life6)))))));
    b = ((org.tinylog.TaggedLogger)(org.tinylog.Logger.tag(((java.lang.String)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite182_101(26311, (5642015819946334985L ^ local20_life6)))))));
}

private static native <E extends Throwable> void __sourceHandlerCall_ff221f8e638336c370e3(com.moon.jD a0, java.lang.String a1, java.lang.String a2, boolean a3) throws E;
private static final class __SourceHandler_ff221f8e638336c370e3 {

public static void f25(com.moon.jD receiver, java.lang.String p0, java.lang.String p1, boolean p2) throws Throwable {
    org.tinylog.TaggedLogger spill25_0;
    java.lang.String spill25_1;
    java.lang.String spill25_2;
    java.lang.String spill25_3;
    org.tinylog.TaggedLogger spill25_4;
    java.lang.String spill25_5;
    java.lang.Object[] spill25_6;
    java.lang.Object[] spill25_7;
    long life4_3;
    int life6_16;
    int life7_27;
    life4_3 = (__fieldRead25_0() ^ 22036260321322L);
    __directSuperInit25_1(receiver);
    life6_16 = __call25_4(receiver, __invokedynamic25_2(21730, (520880997946340856L ^ life4_3)), __call25_3(receiver, p0));
    life7_27 = __call25_7(receiver, __invokedynamic25_5(12651, (6567883515497304178L ^ life4_3)), __call25_6(receiver, p1));
    if ((life6_16 != -1)) {
        if ((life7_27 != -1)) {
        __fieldWrite25_9(receiver, __call25_8());
        __call25_11(__fieldRead25_10(receiver), life6_16);
        __call25_13(__fieldRead25_12(receiver), life7_27);
        __call25_16(__fieldRead25_14(receiver), 0, __invokedynamic25_15(16556, (1388697077606733628L ^ life4_3)));
        if (p2) {
        spill25_0 = __fieldRead25_17();
        java.lang.String __stackOp25_19_0 = p0;
        java.lang.String __stackOp25_19_1 = p1;
        java.lang.String __stackOp25_19_2 = __invokedynamic25_18(11549, (5930287661549992578L ^ life4_3));
        spill25_1 = __stackOp25_19_2;
        spill25_2 = __stackOp25_19_0;
        spill25_3 = __stackOp25_19_1;
        __discardScalar25_20(__stackOp25_19_2);
        java.lang.String __stackOp25_22_0 = spill25_3;
        java.lang.String __stackOp25_22_1 = __invokedynamic25_21(17826, (8177959803500352049L ^ life4_3));
        __call25_24(spill25_0, __invokedynamic25_23(spill25_1, spill25_2, __stackOp25_22_1, __stackOp25_22_0));
        __call25_27(__fieldRead25_25(receiver), 1, __invokedynamic25_26(12358, (2794412886973687771L ^ life4_3)));
    } else {
        
    }
        __call25_29(__fieldRead25_28(receiver));
        spill25_4 = __fieldRead25_30();
        spill25_5 = __invokedynamic25_31(4660, (319371535728051626L ^ life4_3));
        java.lang.Object[] __stackOp25_32_0 = new java.lang.Object[2];
        spill25_6 = __stackOp25_32_0;
        (__stackOp25_32_0)[0] = p0;
        java.lang.Object[] __stackOp25_33_0 = spill25_6;
        spill25_7 = __stackOp25_33_0;
        (__stackOp25_33_0)[1] = p1;
        __call25_34(spill25_4, spill25_5, spill25_7);
    } else {
        
    }
    } else {
        
    }
    return;
}
public static void h25_0(moom.Oo p0) throws Throwable {
    throw __call3002500_0(p0);
}
public static void h25_1(moom.Oo p0) throws Throwable {
    throw __call3002501_0(p0);
}
public static void h25_2(moom.Oo p0) throws Throwable {
    throw __call3002502_0(p0);
}
private static native long __fieldRead25_0() throws Throwable;
private static native void __directSuperInit25_1(com.moon.jD a0) throws Throwable;
private static native int __invokedynamic25_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call25_3(com.moon.jD a0, java.lang.String a1) throws Throwable;
private static native int __call25_4(com.moon.jD a0, int a1, java.lang.String a2) throws Throwable;
private static native int __invokedynamic25_5(int a0, long a1) throws Throwable;
private static native java.lang.String __call25_6(com.moon.jD a0, java.lang.String a1) throws Throwable;
private static native int __call25_7(com.moon.jD a0, int a1, java.lang.String a2) throws Throwable;
private static native int __call25_8() throws Throwable;
private static native void __fieldWrite25_9(com.moon.jD a0, int a1) throws Throwable;
private static native int __fieldRead25_10(com.moon.jD a0) throws Throwable;
private static native void __call25_11(int a0, int a1) throws Throwable;
private static native int __fieldRead25_12(com.moon.jD a0) throws Throwable;
private static native void __call25_13(int a0, int a1) throws Throwable;
private static native int __fieldRead25_14(com.moon.jD a0) throws Throwable;
private static native java.lang.String __invokedynamic25_15(int a0, long a1) throws Throwable;
private static native void __call25_16(int a0, int a1, java.lang.String a2) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead25_17() throws Throwable;
private static native java.lang.String __invokedynamic25_18(int a0, long a1) throws Throwable;
private static native void __discardScalar25_20(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic25_21(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic25_23(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call25_24(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead25_25(com.moon.jD a0) throws Throwable;
private static native java.lang.String __invokedynamic25_26(int a0, long a1) throws Throwable;
private static native void __call25_27(int a0, int a1, java.lang.String a2) throws Throwable;
private static native int __fieldRead25_28(com.moon.jD a0) throws Throwable;
private static native void __call25_29(int a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead25_30() throws Throwable;
private static native java.lang.String __invokedynamic25_31(int a0, long a1) throws Throwable;
private static native void __call25_34(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Throwable __call3002500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3002502_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_96ad74d7ed853dabe28a(com.moon.jD a0, int a1, java.lang.String a2) throws E;
private static final class __SourceHandler_96ad74d7ed853dabe28a {

public static int f100007(com.moon.jD receiver, int p0, java.lang.String p1) throws Throwable {
    int forestValue100007_24_0;
    org.tinylog.TaggedLogger spill100007_0;
    java.lang.String spill100007_1;
    java.lang.Object[] spill100007_2;
    long life3_3;
    int life5_6;
    int life6_24;
    java.lang.String life7_34;
    forest_join_50: {
    forest_join_24: {
    forest_join_23: {
    life3_3 = (__fieldRead100007_0() ^ 5020079673830L);
    life5_6 = __call100007_1(p0);
    __call100007_2(life5_6, p1);
    __call100007_3(life5_6);
    if (!((__call100007_5(life5_6, __invokedynamic100007_4(4560, (8151158139448416516L ^ life3_3))) == 1))) {
        break forest_join_23;
    }
    forestValue100007_24_0 = 1;
    break forest_join_24;
    }
    forestValue100007_24_0 = 0;
    }
    life6_24 = forestValue100007_24_0;
    if (!((life6_24 == 0))) {
        break forest_join_50;
    }
    life7_34 = __call100007_7(life5_6, __invokedynamic100007_6(5200, (2297602240723147911L ^ life3_3)));
    spill100007_0 = __fieldRead100007_8();
    spill100007_1 = __invokedynamic100007_9(16194, (4329094429255205141L ^ life3_3));
    java.lang.Object[] __stackOp100007_10_0 = new java.lang.Object[1];
    spill100007_2 = __stackOp100007_10_0;
    (__stackOp100007_10_0)[0] = life7_34;
    __call100007_11(spill100007_0, spill100007_1, spill100007_2);
    return -1;
    }
    return life5_6;
}
public static int h100007_0(moom.Oo p0) throws Throwable {
    throw __call13000700_0(p0);
}
private static native long __fieldRead100007_0() throws Throwable;
private static native int __call100007_1(int a0) throws Throwable;
private static native void __call100007_2(int a0, java.lang.String a1) throws Throwable;
private static native void __call100007_3(int a0) throws Throwable;
private static native int __invokedynamic100007_4(int a0, long a1) throws Throwable;
private static native int __call100007_5(int a0, int a1) throws Throwable;
private static native int __invokedynamic100007_6(int a0, long a1) throws Throwable;
private static native java.lang.String __call100007_7(int a0, int a1) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead100007_8() throws Throwable;
private static native java.lang.String __invokedynamic100007_9(int a0, long a1) throws Throwable;
private static native void __call100007_11(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.Throwable __call13000700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_057083417b3a4d597e81(com.moon.jD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_057083417b3a4d597e81 {

public static java.lang.String f84(com.moon.jD receiver, java.lang.String p0) throws Throwable {
    java.lang.Class spill84_0;
    java.lang.String spill84_1;
    java.lang.Object[] spill84_2;
    org.tinylog.TaggedLogger spill84_3;
    java.lang.String spill84_4;
    java.lang.Object[] spill84_5;
    long life2_3;
    java.io.InputStream life4_19;
    byte[] life5_39;
    forest_join_37: {
    life2_3 = (__fieldRead84_0() ^ 84566376688815L);
    spill84_0 = __call84_1(receiver);
    spill84_1 = __invokedynamic84_2(2521, (2001469352314718920L ^ life2_3));
    java.lang.Object[] __stackOp84_3_0 = new java.lang.Object[1];
    spill84_2 = __stackOp84_3_0;
    (__stackOp84_3_0)[0] = p0;
    life4_19 = __call84_5(spill84_0, __call84_4(spill84_1, spill84_2));
    if (!((life4_19 == null))) {
        break forest_join_37;
    }
    spill84_3 = __fieldRead84_6();
    spill84_4 = __invokedynamic84_7(27388, (27828772908607976L ^ life2_3));
    java.lang.Object[] __stackOp84_8_0 = new java.lang.Object[1];
    spill84_5 = __stackOp84_8_0;
    (__stackOp84_8_0)[0] = p0;
    __call84_9(spill84_3, spill84_4, spill84_5);
    return null;
    }
    life5_39 = __call84_10(life4_19);
    return __call84_11(receiver, new java.lang.String(life5_39));
}
public static java.lang.String h84_0(java.lang.Throwable p0, java.io.InputStream p1) throws Throwable {
    java.lang.Throwable life1_2;
    life1_2 = p0;
    throw life1_2;
}
private static native long __fieldRead84_0() throws Throwable;
private static native java.lang.Class __call84_1(com.moon.jD a0) throws Throwable;
private static native java.lang.String __invokedynamic84_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call84_4(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native java.io.InputStream __call84_5(java.lang.Class a0, java.lang.String a1) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead84_6() throws Throwable;
private static native java.lang.String __invokedynamic84_7(int a0, long a1) throws Throwable;
private static native void __call84_9(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native byte[] __call84_10(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __call84_11(com.moon.jD a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_fd5effda00b93b42cc8a(com.moon.jD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_fd5effda00b93b42cc8a {

public static java.lang.String f100006(com.moon.jD receiver, java.lang.String p0) throws Throwable {
    java.lang.StringBuilder forestValue100006_34_0;
    java.lang.StringBuilder forestValue100006_35_0;
    java.lang.String forestValue100006_35_1;
    java.lang.StringBuilder spill100006_0;
    long life2_3;
    java.lang.StringBuilder life4_7;
    java.io.BufferedReader life6_15;
    java.lang.String life5_19;
    forest_join_40: {
    life2_3 = (__fieldRead100006_0() ^ 81589230791793L);
    life4_7 = new java.lang.StringBuilder();
    life6_15 = new java.io.BufferedReader(new java.io.StringReader(p0));
    forest_cycle_16: while (true) {
    forest_join_35: {
    forest_join_34: {
    if (!(((life5_19 = __call100006_1(life6_15)) != null))) {
        break forest_join_40;
    }
    spill100006_0 = life4_7;
    if (!(__call100006_3(life5_19, __invokedynamic100006_2(23425, (9111004756540840008L ^ life2_3))))) {
        forestValue100006_34_0 = spill100006_0;
        break forest_join_34;
    }
    forestValue100006_35_0 = spill100006_0;
    forestValue100006_35_1 = __call100006_4(receiver, life5_19);
    break forest_join_35;
    }
    forestValue100006_35_0 = forestValue100006_34_0;
    forestValue100006_35_1 = life5_19;
    }
    __call100006_6(__call100006_5(forestValue100006_35_0, forestValue100006_35_1), "\n");
    continue forest_cycle_16;
    }
    }
    __call100006_7(life6_15);
    return __call100006_8(life4_7);
}
public static java.lang.String h100006_0(java.lang.Throwable p0) throws Throwable {
    throw __call13000600_0(p0);
}
public static java.lang.String h100006_1(java.lang.Throwable p0) throws Throwable {
    throw __call13000601_0(p0);
}
public static java.lang.String h100006_2(java.lang.Throwable p0, java.io.BufferedReader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13000602_0(p1);
    throw life2_2;
}
public static java.lang.String h100006_3(java.lang.Throwable p0, java.lang.Throwable p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call13000603_0(p1, life2_2);
    throw p1;
}
public static java.lang.String h100006_4(java.lang.Exception p0, java.lang.StringBuilder p1) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call13000604_0(life2_2);
    return __call13000604_1(p1);
}
private static native long __fieldRead100006_0() throws Throwable;
private static native java.lang.String __call100006_1(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __invokedynamic100006_2(int a0, long a1) throws Throwable;
private static native boolean __call100006_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call100006_4(com.moon.jD a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call100006_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call100006_6(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native void __call100006_7(java.io.BufferedReader a0) throws Throwable;
private static native java.lang.String __call100006_8(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Throwable __call13000600_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call13000601_0(java.lang.Throwable a0) throws Throwable;
private static native void __call13000602_0(java.io.BufferedReader a0) throws Throwable;
private static native void __call13000603_0(java.lang.Throwable a0, java.lang.Throwable a1) throws Throwable;
private static native void __call13000604_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call13000604_1(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_7c34cac6cfca9ee51c1d(com.moon.jD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_7c34cac6cfca9ee51c1d {

public static java.lang.String f669(com.moon.jD receiver, java.lang.String p0) throws Throwable {
    long life2_3;
    java.util.regex.Matcher life4_7;
    java.lang.String life5_35;
    life2_3 = (__fieldRead669_0() ^ 54794931746425L);
    life4_7 = __call669_2(__fieldRead669_1(), p0);
    if ((!__call669_3(life4_7))) {
        __call669_6(__fieldRead669_4(), __invokedynamic669_5(26849, (3657703244507984165L ^ life2_3)), new java.lang.Object[] {p0});
        return p0;
    }
    life5_35 = __call669_8(life4_7, __invokedynamic669_7(1995, (5384612474183835149L ^ life2_3)));
    return __call669_9(receiver, life5_35);
}
public static void h669_0(moom.Oo p0) throws Throwable {
    throw __call1066900_0(p0);
}
private static native long __fieldRead669_0() throws Throwable;
private static native java.util.regex.Pattern __fieldRead669_1() throws Throwable;
private static native java.util.regex.Matcher __call669_2(java.util.regex.Pattern a0, java.lang.String a1) throws Throwable;
private static native boolean __call669_3(java.util.regex.Matcher a0) throws Throwable;
private static native org.tinylog.TaggedLogger __fieldRead669_4() throws Throwable;
private static native java.lang.String __invokedynamic669_5(int a0, long a1) throws Throwable;
private static native void __call669_6(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.String __invokedynamic669_7(int a0, long a1) throws Throwable;
private static native java.lang.String __call669_8(java.util.regex.Matcher a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call669_9(com.moon.jD a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call1066900_0(moom.Oo a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jD.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1877_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31238;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/jD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private java.lang.String b(java.lang.String p0) { return __sourceHandlerCall_fd5effda00b93b42cc8a(this, p0); }


private java.lang.String c(java.lang.String p0) { return __sourceHandlerCall_7c34cac6cfca9ee51c1d(this, p0); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1880_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private int a(int p0, java.lang.String p1) { return __sourceHandlerCall_96ad74d7ed853dabe28a(this, p0, p1); }


public void a__Void() {
org.lwjgl.opengl.GL20.glUseProgram(((int)(this.c)));
    return;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public int a() {
return this.c;
}


private java.lang.String a(java.lang.String p0) { return __sourceHandlerCall_057083417b3a4d597e81(this, p0); }


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
        byte[] spill780_0 = p0;
        life4_9 += 1;
        life5_44 = (spill780_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill780_1 = p0;
        life4_9 += 1;
        life5_76 = (spill780_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill780_2 = p0;
        life4_9 += 1;
        life5_91 = (spill780_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3211);
    if (((com.moon.jD.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jD.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jD.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jD", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jD.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jD.f)[life5_8] = com.moon.jD.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jD.f)[life5_8];
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite182_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite182_101(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1880_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1877_0() throws E;
}
