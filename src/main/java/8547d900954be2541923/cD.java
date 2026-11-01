package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cD {

private com.sun.net.httpserver.HttpServer a;

private boolean b;

private java.lang.String c;

private java.util.function.Consumer<com.moon.cW> d;

private static long e;

private static java.lang.String[] f;

private static java.lang.String[] g;

private static java.util.Map h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

public cD() {
super();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-4680140179197546916L)), ((long)(-5732726082928201756L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(204203399282411L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.cD.e ^ 125516801158893L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill45_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill45_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill45_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill45_14 = new byte[8];
    (__sourceSpill45_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill45_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation45_16 = __sourceSpill45_14;
    ((javax.crypto.Cipher)(__sourceSpill45_11)).init(((int)(__sourceSpill45_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill45_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation45_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[12];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ÍïÓvwô|(í\034èCýÒÌ@\003k<w7\"RaÎ¹­·ÜXæÜ£ÞO­Á±W\026ãkÝ|]¾\002PS0·\033ÚæDÍ%Ó®c\r¸xd\nDä\033HFØ \035we!Ôèz5J\f®B\bäþìoKuü\022{r¼¶ßáŘ\tæ]ª¼Ê\001\\-|%(\021Ý²\"r\tûÄ¹J\031¤\\ùtÉQ#(M\026sìÄg=\002\fD\026\023D>4\n\"ÇløÙï\036Á_\"3%XâÐ X0\032\027=âõ\035(ÜXPÀ¤)ËÇsËf\013^/&¬|âÀ¦änÈvÅàBþo ±dI6K9\036£Ì\034]×M\017áá\000 wÄ\036ÅcþÙ\027ÊÔÏT®j;º\026w\\!)7Å ¬C\001\033Ì,òr¿­\005º#8tü\n D2ûêû\022¿­ví7\"EJ\002ÞÔ'ÊÂÔ+8*Ç÷üH7°À~8Ä/hi@\020¾\\P\030Y ²w6Ã+ôÁ7ÛÈ|&d\027\\19÷êvtvVzÀZg\007\020s?]¨ØQB2\\\031ðb\nbÆG\006ÝõKÃs&ëÔ;«;ö;aÕ\027¨·Öüô\002ªäÇýO27H¯\000²b\t~¼×îwÆY\016(´O¬y±|h R\016ûkhÌFphæÁ\016ZþÒ\007Q>¾yì´âw$\b Ët\036ë?·@òSp½÷\025ï\006³\032ì\016}2\001­\006¾æ?-ÄWõÌº×cêçìëæd\nÂà\017Ù$ÓÐ8zU\023-\036ïbÇp*ìdÝe±¾úFá\f­\004\\\036«\027\0374\0164 øÏ+\024ÝK3¨ÍT~cBc\037\035d6j\032cM{ÊWD}¦×A\000+Ì>´À\001½\022Û¼\0350õb&¸ÎÑÝÙ8Ð3£¸Û ¾jî!mÁm}KÝòk~Î\\¤n\003Ã\nEÚD\177Üjz\006*-&]DÂ\0066äØ\020áíuûÆým0nQð)¢ÕåhÍ£þZ²¿\027¹FÎ÷½\032:;èå·K\001êþ³%º¾c¬G\025s0¹:O|_9\000ã`ac\031Ô\"\030Ýc\006£BÍfjëØÑeæ¼éö-÷Ö3õ¿e3®uN×]ä7\nÕ]Y\000õö\004ãò\020&£@ ¨\0214|üç$X\034V"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill45_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill45_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill45_29)).doFinal(((byte[])(__sourceSpill45_28)));
        java.lang.String __sourceSpill45_34 = ((java.lang.String)(com.moon.cD.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill45_35 = local20_life19;
        int __sourceSpill45_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill45_35)[__sourceSpill45_36] = __sourceSpill45_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "$æ\020ìùÓ£·¶§¾ÿw7àÕË¢²ðÉ\023__5§\177^äÉZ\020þ`]¦òmð\005½\"IÅõÁ\\°©FRÏÉÜm/¢\002­,ôyâî¡_=áQ½f±,ý\0208}0E±+w¿dôfõ`"))).length();
    local16_life24 = 88;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill45_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill45_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill45_42)).doFinal(((byte[])(__sourceSpill45_41)));
        java.lang.String __sourceSpill45_47 = ((java.lang.String)(com.moon.cD.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill45_48 = local20_life19;
        int __sourceSpill45_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill45_48)[__sourceSpill45_49] = __sourceSpill45_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    f = ((java.lang.String[])(local20_life19));
    g = ((java.lang.String[])(new java.lang.String[12]));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill45_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill45_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill45_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill45_60 = new byte[8];
    (__sourceSpill45_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill45_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation45_62 = __sourceSpill45_60;
    ((javax.crypto.Cipher)(__sourceSpill45_57)).init(((int)(__sourceSpill45_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill45_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation45_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "dä\001ku}ô«ÚxVL_4"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill45_71 = local4_life67;
        int __sourceSpill45_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill45_71)).substring(((int)(__sourceSpill45_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill45_76 = local6_life65;
        int __sourceSpill45_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill45_79 = new byte[8];
        (__sourceSpill45_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill45_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill45_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill45_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill45_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill45_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill45_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill45_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill45_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill45_80)).doFinal(((byte[])(__sourceSpill45_79)));
        (__sourceSpill45_76)[__sourceSpill45_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    i = ((long[])(local6_life65));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> com.moon.cV __sourceHandlerCall_9b5b24ee2e5b8e543a74(com.moon.cD a0, com.moon.cW a1) throws E;
private static final class __SourceHandler_9b5b24ee2e5b8e543a74 {

public static com.moon.cV f33(com.moon.cD receiver, com.moon.cW p0) throws Throwable {
    return __call33_0(p0);
}
public static com.moon.cV h33_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2003300_0(local1);
    return null;
}
private static native com.moon.cV __call33_0(com.moon.cW a0) throws Throwable;
private static native void __call2003300_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b260fa2a579e67d41f71(com.moon.cD a0, com.moon.cW a1, java.lang.String a2) throws E;
private static final class __SourceHandler_b260fa2a579e67d41f71 {

public static void f34(com.moon.cD receiver, com.moon.cW p0, java.lang.String p1) throws Throwable {
    __call34_0(p0, p1);
    return;
}
public static void h34_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2003400_0(local1);
    return;
}
private static native void __call34_0(com.moon.cW a0, java.lang.String a1) throws Throwable;
private static native void __call2003400_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.cW __sourceHandlerCall_48f19deff9cba59dcc05(com.moon.cD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_48f19deff9cba59dcc05 {

public static com.moon.cW f85(com.moon.cD receiver, java.lang.String p0) throws Throwable {
    java.lang.String forwardValue85_11_0;
    java.lang.String forwardValue85_38_0;
    java.lang.String forwardValue85_38_1;
    java.lang.String spill85_0;
    java.lang.String spill85_1;
    long life2_3;
    int life4_5;
    com.moon.cQ life5_49;
    com.moon.cR life6_53;
    com.moon.cS life7_56;
    com.moon.cO life8_66;
    forward_join_38: {
    forward_join_32: {
    forward_join_20: {
    forward_join_11: {
    life2_3 = (__fieldRead85_0() ^ 83022554878471L);
    life4_5 = __integerCategory85_2(__call85_1());
    spill85_0 = p0;
    if (!((life4_5 == 0))) {
        forwardValue85_11_0 = spill85_0;
        break forward_join_11;
    }
    if (!((spill85_0 != null))) {
        break forward_join_20;
    }
    forwardValue85_11_0 = p0;
    }
    spill85_1 = __invokedynamic85_3(8976, (7096998289569360174L ^ life2_3));
    if (!((life4_5 == 0))) {
        forwardValue85_38_0 = forwardValue85_11_0;
        forwardValue85_38_1 = spill85_1;
        break forward_join_38;
    }
    if (!((!__call85_4(forwardValue85_11_0, spill85_1)))) {
        break forward_join_32;
    }
    }
    java.lang.Object __inlineStack85_6Token;
    throw new java.lang.IllegalStateException(__invokedynamic85_7(__inlineStack85_6Output0((__inlineStack85_6Token = __inlineStack85_6Pack(p0, __invokedynamic85_5(24064, (7589674739533337653L ^ life2_3))))), __inlineStack85_6Output1(__inlineStack85_6Token)));
    }
    forwardValue85_38_0 = p0;
    forwardValue85_38_1 = __invokedynamic85_8(8326, (8825057767347366591L ^ life2_3));
    }
    life5_49 = __call85_10(__call85_9(forwardValue85_38_0, forwardValue85_38_1, ""));
    life6_53 = __call85_11(life5_49, 0);
    life7_56 = __call85_12(life6_53);
    life8_66 = __call85_17(__call85_15((__call85_14(__call85_13(life7_56)))[0]), __call85_16(life7_56));
    return new com.moon.cW(__call85_18(life5_49), __call85_19(life8_66), __call85_20(life5_49));
}
public static com.moon.cW h85_0(java.lang.Exception p0) throws Throwable {
    throw __call3008500_0(p0);
}
public static com.moon.cW h85_1(java.lang.Exception p0) throws Throwable {
    throw __call3008501_0(p0);
}
public static com.moon.cW h85_2(java.lang.Exception p0) throws Throwable {
    throw __call3008502_0(p0);
}
public static com.moon.cW h85_3(java.lang.Exception p0, com.moon.cQ p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3008503_0(life1_2);
    throw new java.lang.RuntimeException(life1_2);
}
private static native long __fieldRead85_0() throws Throwable;
private static native boolean __call85_1() throws Throwable;
private static native int __integerCategory85_2(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic85_3(int a0, long a1) throws Throwable;
private static native boolean __call85_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic85_5(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack85_6Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack85_6Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack85_6Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic85_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic85_8(int a0, long a1) throws Throwable;
private static native java.lang.String __call85_9(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.cQ __call85_10(java.lang.String a0) throws Throwable;
private static native com.moon.cR __call85_11(com.moon.cQ a0, int a1) throws Throwable;
private static native com.moon.cS __call85_12(com.moon.cR a0) throws Throwable;
private static native com.moon.cT __call85_13(com.moon.cS a0) throws Throwable;
private static native com.moon.cU[] __call85_14(com.moon.cT a0) throws Throwable;
private static native java.lang.String __call85_15(com.moon.cU a0) throws Throwable;
private static native java.lang.String __call85_16(com.moon.cS a0) throws Throwable;
private static native com.moon.cO __call85_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call85_18(com.moon.cQ a0) throws Throwable;
private static native java.lang.String __call85_19(com.moon.cO a0) throws Throwable;
private static native java.lang.String __call85_20(com.moon.cQ a0) throws Throwable;
private static native java.lang.Exception __call3008500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3008501_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3008502_0(java.lang.Exception a0) throws Throwable;
private static native void __call3008503_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0c0e09b12e366673f2af(com.moon.cD a0, com.sun.net.httpserver.HttpExchange a1) throws E;
private static final class __SourceHandler_0c0e09b12e366673f2af {

public static void f44(com.moon.cD receiver, com.sun.net.httpserver.HttpExchange p0) throws Throwable {
    boolean spill44_0;
    com.moon.cD spill44_1;
    java.io.PrintStream spill44_2;
    com.moon.cD joinValue44_1_0;
    org.tinylog.TaggedLogger spill44_3;
    long life2_3;
    int life4_13;
    byte[] life5_20;
    com.moon.cW life6_26;
    com.moon.cV life7_63;
    net.minecraft.util.Session life8_80;
    life2_3 = (__fieldRead44_0() ^ 3612924272883L);
    spill44_0 = __call44_1();
    __call44_5(__call44_3(__call44_2()), __invokedynamic44_4(28551, (1870361775870760775L ^ life2_3)));
    life4_13 = __integerCategory44_6(spill44_0);
    life5_20 = __call44_8(__invokedynamic44_7(20790, (3292575375274371572L ^ life2_3)));
    life6_26 = __call44_11(receiver, __call44_10(__call44_9(p0)));
    spill44_1 = receiver;
    if ((life4_13 == 0)) {
        if (__fieldRead44_12(spill44_1)) {
        spill44_2 = __fieldRead44_13();
        java.lang.String __stackOp44_16_0 = __fieldRead44_14(receiver);
        java.lang.String __stackOp44_16_1 = __invokedynamic44_15(5580, (7519884586605391106L ^ life2_3));
        __call44_18(spill44_2, __invokedynamic44_17(__stackOp44_16_1, __stackOp44_16_0));
        __call44_20(receiver, life6_26, __fieldRead44_19(receiver));
        __fieldWrite44_21(receiver, 0);
        __fieldWrite44_22(receiver, "");
    } else {
        
    }
        joinValue44_1_0 = receiver;
    } else {
        joinValue44_1_0 = spill44_1;
    }
    life7_63 = __call44_23(joinValue44_1_0, life6_26);
    life8_80 = new net.minecraft.util.Session(__call44_24(life7_63), __call44_26(__call44_25(life7_63)), __call44_28(__call44_27(life7_63)), __invokedynamic44_29(18492, (7258857586149978367L ^ life2_3)));
    __call44_31(__call44_30(), life8_80);
    spill44_3 = __call44_33(__call44_32());
    java.lang.String __stackOp44_36_0 = __call44_34(life8_80);
    java.lang.String __stackOp44_36_1 = __invokedynamic44_35(31462, (8965344744612512298L ^ life2_3));
    __call44_38(spill44_3, __invokedynamic44_37(__stackOp44_36_1, __stackOp44_36_0));
    __call44_40(__fieldRead44_39(receiver), life6_26);
    __call44_42(p0, __invokedynamic44_41(6437, (4916224513581847368L ^ life2_3)), ((long) (life5_20).length));
    __call44_44(__call44_43(p0), life5_20);
    return;
}
public static void h44_0(java.lang.Exception p0) throws Throwable {
    throw __call2004400_0(p0);
}
public static void h44_1(java.lang.Exception p0) throws Throwable {
    throw __call2004401_0(p0);
}
public static void h44_2(java.lang.Exception p0, com.moon.cD p1, com.sun.net.httpserver.HttpExchange p2, long p3) throws Throwable {
    java.lang.Exception local5 = p0;
    int spill2004402_0 = 7232;
    __call2004402_0(local5);
    byte[] local6 = __call2004402_2(__invokedynamic2004402_1(spill2004402_0, (4534344734273840271L ^ p3)));
    org.tinylog.TaggedLogger spill2004402_1 = __call2004402_4(__call2004402_3());
    java.lang.String __stackOp2004402_8_0 = __call2004402_6(__call2004402_5(p2));
    java.lang.String __stackOp2004402_8_1 = __invokedynamic2004402_7(618, (1128211983423224481L ^ p3));
    java.lang.String spill2004402_2 = __invokedynamic2004402_9(__stackOp2004402_8_1, __stackOp2004402_8_0);
    java.lang.Object[] __stackOp2004402_10_0 = new java.lang.Object[1];
    java.lang.Object[] spill2004402_3 = __stackOp2004402_10_0;
    (__stackOp2004402_10_0)[0] = local5;
    __call2004402_11(spill2004402_1, spill2004402_2, spill2004402_3);
    __call2004402_13(__fieldRead2004402_12(p1), null);
    __call2004402_15(p2, __invokedynamic2004402_14(6437, (4916224513581847368L ^ p3)), ((long) (local6).length));
    __call2004402_17(__call2004402_16(p2), local6);
    return;
}
private static native long __fieldRead44_0() throws Throwable;
private static native boolean __call44_1() throws Throwable;
private static native com.moon.runtime.ClientContext __call44_2() throws Throwable;
private static native org.tinylog.TaggedLogger __call44_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic44_4(int a0, long a1) throws Throwable;
private static native void __call44_5(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory44_6(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic44_7(int a0, long a1) throws Throwable;
private static native byte[] __call44_8(java.lang.String a0) throws Throwable;
private static native java.net.URI __call44_9(com.sun.net.httpserver.HttpExchange a0) throws Throwable;
private static native java.lang.String __call44_10(java.net.URI a0) throws Throwable;
private static native com.moon.cW __call44_11(com.moon.cD a0, java.lang.String a1) throws Throwable;
private static native boolean __fieldRead44_12(com.moon.cD a0) throws Throwable;
private static native java.io.PrintStream __fieldRead44_13() throws Throwable;
private static native java.lang.String __fieldRead44_14(com.moon.cD a0) throws Throwable;
private static native java.lang.String __invokedynamic44_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic44_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call44_18(java.io.PrintStream a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead44_19(com.moon.cD a0) throws Throwable;
private static native void __call44_20(com.moon.cD a0, com.moon.cW a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite44_21(com.moon.cD a0, int a1) throws Throwable;
private static native void __fieldWrite44_22(com.moon.cD a0, java.lang.String a1) throws Throwable;
private static native com.moon.cV __call44_23(com.moon.cD a0, com.moon.cW a1) throws Throwable;
private static native java.lang.String __call44_24(com.moon.cV a0) throws Throwable;
private static native java.util.UUID __call44_25(com.moon.cV a0) throws Throwable;
private static native java.lang.String __call44_26(java.util.UUID a0) throws Throwable;
private static native com.moon.cW __call44_27(com.moon.cV a0) throws Throwable;
private static native java.lang.String __call44_28(com.moon.cW a0) throws Throwable;
private static native java.lang.String __invokedynamic44_29(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call44_30() throws Throwable;
private static native net.minecraft.client.Minecraft __call44_31(net.minecraft.client.Minecraft a0, net.minecraft.util.Session a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call44_32() throws Throwable;
private static native org.tinylog.TaggedLogger __call44_33(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __call44_34(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic44_35(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic44_37(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call44_38(org.tinylog.TaggedLogger a0, java.lang.String a1) throws Throwable;
private static native java.util.function.Consumer __fieldRead44_39(com.moon.cD a0) throws Throwable;
private static native void __call44_40(java.util.function.Consumer a0, com.moon.cW a1) throws Throwable;
private static native int __invokedynamic44_41(int a0, long a1) throws Throwable;
private static native void __call44_42(com.sun.net.httpserver.HttpExchange a0, int a1, long a2) throws Throwable;
private static native java.io.OutputStream __call44_43(com.sun.net.httpserver.HttpExchange a0) throws Throwable;
private static native void __call44_44(java.io.OutputStream a0, byte[] a1) throws Throwable;
private static native java.lang.Exception __call2004400_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call2004401_0(java.lang.Exception a0) throws Throwable;
private static native void __call2004402_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic2004402_1(int a0, long a1) throws Throwable;
private static native byte[] __call2004402_2(java.lang.String a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call2004402_3() throws Throwable;
private static native org.tinylog.TaggedLogger __call2004402_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.net.URI __call2004402_5(com.sun.net.httpserver.HttpExchange a0) throws Throwable;
private static native java.lang.String __call2004402_6(java.net.URI a0) throws Throwable;
private static native java.lang.String __invokedynamic2004402_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic2004402_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call2004402_11(org.tinylog.TaggedLogger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.util.function.Consumer __fieldRead2004402_12(com.moon.cD a0) throws Throwable;
private static native void __call2004402_13(java.util.function.Consumer a0, java.lang.Object a1) throws Throwable;
private static native int __invokedynamic2004402_14(int a0, long a1) throws Throwable;
private static native void __call2004402_15(com.sun.net.httpserver.HttpExchange a0, int a1, long a2) throws Throwable;
private static native java.io.OutputStream __call2004402_16(com.sun.net.httpserver.HttpExchange a0) throws Throwable;
private static native void __call2004402_17(java.io.OutputStream a0, byte[] a1) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.cD.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15955;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/cD", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral806_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void b() {
((com.sun.net.httpserver.HttpServer)(this.a)).createContext(((java.lang.String)("/")), ((com.sun.net.httpserver.HttpHandler)(__sourceIntrinsic_938da207dded_originalDynamicSite80_1(this))));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.cD.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3317);
    if (((com.moon.cD.g)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.cD.h)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.cD.h)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/cD", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.cD.f)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.cD.g)[life5_8] = com.moon.cD.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.cD.g)[life5_8];
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
        byte[] spill111_0 = p0;
        life4_9 += 1;
        life5_44 = (spill111_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill111_1 = p0;
        life4_9 += 1;
        life5_76 = (spill111_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill111_2 = p0;
        life4_9 += 1;
        life5_91 = (spill111_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral809_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private com.moon.cW a(java.lang.String p0) { return __sourceHandlerCall_48f19deff9cba59dcc05(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private void a(com.moon.cW p0, java.lang.String p1) { __sourceHandlerCall_b260fa2a579e67d41f71(this, p0, p1); }


public void a(boolean p0, java.lang.String p1, java.util.function.Consumer<com.moon.cW> p2) {
long local4 = (com.moon.cD.e ^ 43908137955363L);
    try {
        ((java.awt.Desktop)(java.awt.Desktop.getDesktop())).browse(((java.net.URI)(new java.net.URI(__sourceIntrinsic_7277049c0a2b_invokedynamic812_2(4491, (7469423715447896466L ^ local4))))));
        this.b = ((boolean)(p0));
        this.c = ((java.lang.String)(p1));
        this.d = ((java.util.function.Consumer)(p2));
    } catch (java.lang.Throwable caught6) {
        throw caught6;
    }
    return;
}


public void a(java.util.function.Consumer<com.moon.cW> p0) {
this.b = ((boolean)(false));
    this.c = ((java.lang.String)(""));
    this.d = ((java.util.function.Consumer)(p0));
    return;
}


public void a() {
long local1 = (com.moon.cD.e ^ 114834308346360L);
    try {
        this.a = ((com.sun.net.httpserver.HttpServer)(com.sun.net.httpserver.HttpServer.create(((java.net.InetSocketAddress)(new java.net.InetSocketAddress(__sourceIntrinsic_2c8ae721fed4_invokedynamic813_1(19060, (7192236517777253303L ^ local1)), __sourceIntrinsic_2c8ae721fed4_invokedynamic813_2(15589, (2449415472086837122L ^ local1))))), ((int)(0)))));
        ((com.moon.cD)(this)).b();
        ((com.sun.net.httpserver.HttpServer)(this.a)).start();
    } catch (java.lang.Throwable caught3) {
        throw caught3;
    }
    return;
}


private com.moon.cV a(com.moon.cW p0) { return __sourceHandlerCall_9b5b24ee2e5b8e543a74(this, p0); }


private void lambda$createGatewayEndpoint$0(com.sun.net.httpserver.HttpExchange p0) throws java.io.IOException { __sourceHandlerCall_0c0e09b12e366673f2af(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2c8ae721fed4_invokedynamic813_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_invokedynamic813_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral809_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7277049c0a2b_invokedynamic812_2(int a0, long a1) throws E;

private static native <E extends Throwable> com.sun.net.httpserver.HttpHandler __sourceIntrinsic_938da207dded_originalDynamicSite80_1(com.moon.cD a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral806_0() throws E;
}
