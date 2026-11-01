package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mF extends com.moon.mA {

private static java.lang.String[] h;

private com.moon.nX s;

private com.moon.nX t;

private com.moon.setting.ColorSetting u;

private boolean v;

private boolean w;

private boolean x;

private float y;

private float z;

private float A;

private com.v B;

private static long C;

private static java.lang.String[] E;

private static java.lang.String[] F;

private static java.util.Map G;

private static long[] H;

private static java.lang.Integer[] I;

private static java.util.Map J;

public mF(com.moon.setting.ColorSetting p0, float p1, float p2, float p3, float p4) { super(); __sourceHandlerCall_916f1a88ccd884e87f22(this, p0, p1, p2, p3, p4); }


static {
C = ((long)(((moom._a)(moom._c.a(((long)(-8723326224766025072L)), ((long)(-2464121482776107100L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(58607092272777L)))));
    long local20_life6 = (com.moon.mF.C ^ 98388934724729L);
    G = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill240_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill240_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill240_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill240_14 = new byte[8];
    (__sourceSpill240_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill240_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation240_16 = __sourceSpill240_14;
    ((javax.crypto.Cipher)(__sourceSpill240_11)).init(((int)(__sourceSpill240_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill240_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation240_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[4];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "Û,Êç\027\027lbç\024½\020\177ëømsµz\036¿áhÈ³"))).length();
    int local14_life24 = 16;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill240_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill240_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill240_29)).doFinal(((byte[])(__sourceSpill240_28)));
        java.lang.String __sourceSpill240_34 = ((java.lang.String)(com.moon.mF.a(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill240_35 = local18_life19;
        int __sourceSpill240_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill240_35)[__sourceSpill240_36] = __sourceSpill240_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "Ó\016h´]óÆf-z0\f\035ß\020f°\001\027àe6| ¶ñô\017z"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill240_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill240_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill240_42)).doFinal(((byte[])(__sourceSpill240_41)));
        java.lang.String __sourceSpill240_47 = ((java.lang.String)(com.moon.mF.a(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill240_48 = local18_life19;
        int __sourceSpill240_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill240_48)[__sourceSpill240_49] = __sourceSpill240_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    E = ((java.lang.String[])(local18_life19));
    F = ((java.lang.String[])(new java.lang.String[4]));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill240_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill240_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill240_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill240_60 = new byte[8];
    (__sourceSpill240_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill240_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation240_62 = __sourceSpill240_60;
    ((javax.crypto.Cipher)(__sourceSpill240_57)).init(((int)(__sourceSpill240_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill240_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation240_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[9];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "{ >Mºbê6ä^<ÝãF»pòÞ\031ãàÆç%\\eþ§Ó{×Å¹süõQ;¹¹ÞvÜý§\001U%\032"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill240_71 = local4_life67;
        int __sourceSpill240_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill240_71)).substring(((int)(__sourceSpill240_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill240_76 = local6_life65;
        int __sourceSpill240_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill240_79 = new byte[8];
        (__sourceSpill240_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill240_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill240_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill240_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill240_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill240_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill240_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill240_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill240_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill240_80)).doFinal(((byte[])(__sourceSpill240_79)));
        (__sourceSpill240_76)[__sourceSpill240_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "Ç&B³W¥*Ò)\r¤w]¥ð"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill240_84 = local4_life67;
        int __sourceSpill240_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill240_84)).substring(((int)(__sourceSpill240_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill240_89 = local6_life65;
        int __sourceSpill240_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill240_92 = new byte[8];
        (__sourceSpill240_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill240_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill240_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill240_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill240_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill240_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill240_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill240_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill240_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill240_93)).doFinal(((byte[])(__sourceSpill240_92)));
        (__sourceSpill240_89)[__sourceSpill240_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    H = ((long[])(local6_life65));
    I = ((java.lang.Integer[])(new java.lang.Integer[9]));
    java.lang.String[] __sourceSpill240_99 = new java.lang.String[2];
    (__sourceSpill240_99)[0] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite240_98(11985, (2545554788585613733L ^ local20_life6));
    (__sourceSpill240_99)[1] = __sourceIntrinsic_eb8803ad1f63_originalDynamicSite240_100(19195, (9009795376500100493L ^ local20_life6));
    h = ((java.lang.String[])(__sourceSpill240_99));
}

private static native <E extends Throwable> void __sourceHandlerCall_916f1a88ccd884e87f22(com.moon.mF a0, com.moon.setting.ColorSetting a1, float a2, float a3, float a4, float a5) throws E;
private static final class __SourceHandler_916f1a88ccd884e87f22 {

public static void f31(com.moon.mF receiver, com.moon.setting.ColorSetting p0, float p1, float p2, float p3, float p4) throws Throwable {
    boolean spill31_0;
    long life6_3;
    int life8_17;
    java.awt.Color life9_40;
    float[] life10_43;
    float life11_54;
    float life12_56;
    float life13_58;
    float life14_62;
    int life15_64;
    float life16_74;
    forest_join_116: {
    forest_join_96: {
    life6_3 = (__fieldRead31_0() ^ 54768882711775L);
    __directSuperInit31_1(receiver);
    spill31_0 = __call31_2();
    __fieldWrite31_3(receiver, new com.moon.nX());
    __fieldWrite31_4(receiver, new com.moon.nX());
    life8_17 = __integerCategory31_5(spill31_0);
    __fieldWrite31_6(receiver, p0);
    __fieldWrite31_7(receiver, p1);
    __fieldWrite31_8(receiver, p2);
    __fieldWrite31_9(receiver, p3);
    __fieldWrite31_10(receiver, p4);
    life9_40 = new java.awt.Color(__call31_13(__cast31_12(__call31_11(p0))));
    life10_43 = new float[3];
    __call31_17(__call31_14(life9_40), __call31_15(life9_40), __call31_16(life9_40), life10_43);
    life11_54 = 0x1.0cp6f;
    life12_56 = 0x1.0p31f;
    life13_58 = 0x0.0p0f;
    life14_62 = (life10_43)[0];
    life15_64 = 0;
    forest_cycle_65: while (true) {
    forest_join_94: {
    forest_join_93: {
    if (!((__numericCompare31_18(((float) life15_64), 0x1.0cp6f) < 0))) {
        break forest_join_96;
    }
    life16_74 = (((float) life15_64) / 0x1.0cp6f);
    if (!((life8_17 == 0))) {
        break forest_join_116;
    }
    if (!((life8_17 == 0))) {
        break forest_join_94;
    }
    if (!((__numericCompare31_20(__call31_19((life16_74 - life14_62)), life12_56) < 0))) {
        break forest_join_93;
    }
    life12_56 = __call31_21((life16_74 - life14_62));
    life13_58 = life16_74;
    }
    life15_64 += 1;
    }
    if (!((life8_17 != 0))) {
        continue forest_cycle_65;
    }
    break forest_cycle_65;
    }
    }
    __fieldWrite31_22(receiver, life13_58);
    __fieldWrite31_23(receiver, (life10_43)[1]);
    __fieldWrite31_24(receiver, (life10_43)[2]);
    __fieldWrite31_29(receiver, __call31_28(__call31_27(__cast31_26(__call31_25(p0)))));
    }
    return;
}
public static void h31_0(moom.Oo p0) throws Throwable {
    throw __call3003100_0(p0);
}
public static void h31_1(moom.Oo p0) throws Throwable {
    throw __call3003101_0(p0);
}
private static native long __fieldRead31_0() throws Throwable;
private static native void __directSuperInit31_1(com.moon.mF a0) throws Throwable;
private static native boolean __call31_2() throws Throwable;
private static native void __fieldWrite31_3(com.moon.mF a0, com.moon.nX a1) throws Throwable;
private static native void __fieldWrite31_4(com.moon.mF a0, com.moon.nX a1) throws Throwable;
private static native int __integerCategory31_5(boolean value) throws Throwable;
private static native void __fieldWrite31_6(com.moon.mF a0, com.moon.setting.ColorSetting a1) throws Throwable;
private static native void __fieldWrite31_7(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite31_8(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite31_9(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite31_10(com.moon.mF a0, float a1) throws Throwable;
private static native java.lang.Object __call31_11(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast31_12(java.lang.Object a0) throws Throwable;
private static native int __call31_13(java.lang.Integer a0) throws Throwable;
private static native int __call31_14(java.awt.Color a0) throws Throwable;
private static native int __call31_15(java.awt.Color a0) throws Throwable;
private static native int __call31_16(java.awt.Color a0) throws Throwable;
private static native float[] __call31_17(int a0, int a1, int a2, float[] a3) throws Throwable;
private static native int __numericCompare31_18(float a0, float a1) throws Throwable;
private static native float __call31_19(float a0) throws Throwable;
private static native int __numericCompare31_20(float a0, float a1) throws Throwable;
private static native float __call31_21(float a0) throws Throwable;
private static native void __fieldWrite31_22(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite31_23(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite31_24(com.moon.mF a0, float a1) throws Throwable;
private static native java.lang.Object __call31_25(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast31_26(java.lang.Object a0) throws Throwable;
private static native int __call31_27(java.lang.Integer a0) throws Throwable;
private static native com.v __call31_28(int a0) throws Throwable;
private static native void __fieldWrite31_29(com.moon.mF a0, com.v a1) throws Throwable;
private static native java.lang.Exception __call3003100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4986dd4efa425eae9e80(com.moon.mF a0, int a1) throws E;
private static final class __SourceHandler_4986dd4efa425eae9e80 {

public static void f477(com.moon.mF receiver, int p0) throws Throwable {
    float lexicalValue477_60_0;
    float lexicalValue477_60_1;
    float lexicalValue477_60_2;
    float lexicalValue477_60_3;
    com.moon.mF lexicalValue477_60_4;
    float lexicalValue477_65_0;
    float lexicalValue477_65_1;
    float lexicalValue477_65_2;
    float lexicalValue477_65_3;
    float lexicalValue477_66_0;
    float lexicalValue477_66_1;
    float lexicalValue477_66_2;
    float lexicalValue477_66_3;
    float lexicalValue477_66_4;
    int lexicalValue477_131_0;
    int lexicalValue477_135_0;
    boolean spill477_0;
    float spill477_1;
    float spill477_2;
    float spill477_3;
    float spill477_4;
    com.moon.mF spill477_5;
    int spill477_6;
    long life2_3;
    float life5_5;
    float life6_7;
    float life7_9;
    float life8_25;
    float life9_30;
    int life4_31;
    com.moon.jC life10_77;
    com.moon.hW life11_82;
    int life12_84;
    float life13_94;
    int life14_99;
    com.moon.hW life12_187;
    lexical_join_162: {
    lexical_join_157: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_60: {
    life2_3 = (__fieldRead477_0() ^ 138898871978098L);
    life5_5 = 0x1.4p2f;
    life6_7 = 0x1.0p2f;
    life7_9 = 0x1.0cp6f;
    spill477_0 = __call477_1();
    life8_25 = ((((__fieldRead477_2(receiver) + __call477_3(receiver)) - __fieldRead477_4(receiver)) - (life5_5 + 0x1.4p1f)) - 0x1.0p2f);
    life9_30 = (__call477_5(receiver) + 0x1.3p4f);
    life4_31 = __integerCategory477_6(spill477_0);
    spill477_1 = __fieldRead477_7(receiver);
    spill477_2 = __fieldRead477_8(receiver);
    spill477_3 = __fieldRead477_9(receiver);
    spill477_4 = (__fieldRead477_10(receiver) - (((__fieldRead477_11(receiver) + __fieldRead477_12(receiver)) - (__call477_13(receiver) + __fieldRead477_14(receiver))) + 0x1.8p1f));
    spill477_5 = receiver;
    if (!((life4_31 != 0))) {
        lexicalValue477_60_0 = spill477_1;
        lexicalValue477_60_1 = spill477_2;
        lexicalValue477_60_2 = spill477_3;
        lexicalValue477_60_3 = spill477_4;
        lexicalValue477_60_4 = spill477_5;
        break lexical_join_60;
    }
    if (!(__fieldRead477_15(spill477_5))) {
        lexicalValue477_65_0 = spill477_1;
        lexicalValue477_65_1 = spill477_2;
        lexicalValue477_65_2 = spill477_3;
        lexicalValue477_65_3 = spill477_4;
        break lexical_join_65;
    }
    lexicalValue477_60_0 = spill477_1;
    lexicalValue477_60_1 = spill477_2;
    lexicalValue477_60_2 = spill477_3;
    lexicalValue477_60_3 = spill477_4;
    lexicalValue477_60_4 = receiver;
    }
    lexicalValue477_66_0 = lexicalValue477_60_0;
    lexicalValue477_66_1 = lexicalValue477_60_1;
    lexicalValue477_66_2 = lexicalValue477_60_2;
    lexicalValue477_66_3 = lexicalValue477_60_3;
    lexicalValue477_66_4 = (__fieldRead477_16(lexicalValue477_60_4) - __fieldRead477_17(receiver));
    break lexical_join_66;
    }
    lexicalValue477_66_0 = lexicalValue477_65_0;
    lexicalValue477_66_1 = lexicalValue477_65_1;
    lexicalValue477_66_2 = lexicalValue477_65_2;
    lexicalValue477_66_3 = lexicalValue477_65_3;
    lexicalValue477_66_4 = 0x0.0p0f;
    }
    life10_77 = __call477_20(lexicalValue477_66_0, lexicalValue477_66_1, lexicalValue477_66_2, __call477_19((lexicalValue477_66_3 - lexicalValue477_66_4), __fieldRead477_18(receiver)));
    life11_82 = __call477_24(__call477_23(__call477_21(), __fieldRead477_22()));
    life12_84 = 0;
    lexical_cycle_79: while (true) {
    lexical_join_154: {
    lexical_join_135: {
    lexical_join_131: {
    lexical_join_129: {
    if (!((__numericCompare477_25(((float) life12_84), 0x1.0cp6f) < 0))) {
        break lexical_join_157;
    }
    life13_94 = (((float) life12_84) / 0x1.0cp6f);
    life14_99 = __call477_26(life13_94, 0x1.0p0f, 0x1.0p0f);
    __call477_28(life11_82, __call477_27(life8_25, (life9_30 + ((float) life12_84)), 0x1.0p2f, 0x1.0p0f, life14_99));
    if (!((life4_31 != 0))) {
        break lexical_join_162;
    }
    spill477_6 = __numericCompare477_30(life13_94, __fieldRead477_29(receiver));
    if (!((life4_31 != 0))) {
        lexicalValue477_131_0 = spill477_6;
        break lexical_join_131;
    }
    if (!((spill477_6 == 0))) {
        break lexical_join_129;
    }
    __call477_34(life11_82, __call477_33((life8_25 - 0x1.0p0f), (life9_30 + ((float) life12_84)), 0x1.8p2f, 0x1.0p0f, __call477_32(__fieldRead477_31(receiver))));
    }
    lexicalValue477_131_0 = __integerCategory477_36(__fieldRead477_35(receiver));
    }
    if (!((life4_31 != 0))) {
        lexicalValue477_135_0 = lexicalValue477_131_0;
        break lexical_join_135;
    }
    if (!((lexicalValue477_131_0 != 0))) {
        break lexical_join_154;
    }
    lexicalValue477_135_0 = p0;
    }
    if (!((lexicalValue477_135_0 == (__call477_37(life9_30) + life12_84)))) {
        break lexical_join_154;
    }
    __fieldWrite477_38(receiver, life13_94);
    __call477_45(__fieldRead477_39(receiver), __call477_44(__call477_43(__fieldRead477_40(receiver), __fieldRead477_41(receiver), __fieldRead477_42(receiver))));
    }
    life12_84 += 1;
    if (!((life4_31 == 0))) { continue lexical_cycle_79; }
    break lexical_cycle_79;
    }
    }
    __call477_46(life11_82, life10_77);
    __call477_47(life11_82);
    }
    life12_187 = __call477_51(__call477_50(__call477_48(), __fieldRead477_49()));
    __call477_55(life12_187, __call477_54((life8_25 - 0x1.0p1f), (life9_30 - 0x1.0p1f), 0x1.0p3f, 0x1.1cp6f, 0x1.0p1f, 0x1.0p-1f, __call477_53(__fieldRead477_52(receiver))));
    __call477_59(life12_187, __call477_58((life8_25 - 0x1.4p1f), (life9_30 - 0x1.4p1f), 0x1.2p3f, 0x1.2p6f, 0x1.0p1f, 0x1.0p-1f, __call477_57(__fieldRead477_56(receiver))));
    __call477_60(life12_187, life10_77);
    __call477_61(life12_187);
    return;
}
public static void h477_0(moom.Oo p0) throws Throwable {
    throw __call1047700_0(p0);
}
public static void h477_1(moom.Oo p0) throws Throwable {
    throw __call1047701_0(p0);
}
public static void h477_2(moom.Oo p0) throws Throwable {
    throw __call1047702_0(p0);
}
public static void h477_3(moom.Oo p0) throws Throwable {
    throw __call1047703_0(p0);
}
public static void h477_4(moom.Oo p0) throws Throwable {
    throw __call1047704_0(p0);
}
public static void h477_5(moom.Oo p0) throws Throwable {
    throw __call1047705_0(p0);
}
public static void h477_6(moom.Oo p0) throws Throwable {
    throw __call1047706_0(p0);
}
private static native long __fieldRead477_0() throws Throwable;
private static native boolean __call477_1() throws Throwable;
private static native float __fieldRead477_2(com.moon.mF a0) throws Throwable;
private static native float __call477_3(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_4(com.moon.mF a0) throws Throwable;
private static native float __call477_5(com.moon.mF a0) throws Throwable;
private static native int __integerCategory477_6(boolean value) throws Throwable;
private static native float __fieldRead477_7(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_8(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_9(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_10(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_11(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_12(com.moon.mF a0) throws Throwable;
private static native float __call477_13(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_14(com.moon.mF a0) throws Throwable;
private static native boolean __fieldRead477_15(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_16(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_17(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_18(com.moon.mF a0) throws Throwable;
private static native float __call477_19(float a0, float a1) throws Throwable;
private static native com.moon.jC __call477_20(float a0, float a1, float a2, float a3) throws Throwable;
private static native com.moon.hX __call477_21() throws Throwable;
private static native com.moon.cb __fieldRead477_22() throws Throwable;
private static native com.moon.hX __call477_23(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call477_24(com.moon.hX a0) throws Throwable;
private static native int __numericCompare477_25(float a0, float a1) throws Throwable;
private static native int __call477_26(float a0, float a1, float a2) throws Throwable;
private static native com.moon.i2 __call477_27(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call477_28(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native float __fieldRead477_29(com.moon.mF a0) throws Throwable;
private static native int __numericCompare477_30(float a0, float a1) throws Throwable;
private static native com.v __fieldRead477_31(com.moon.mF a0) throws Throwable;
private static native int __call477_32(com.v a0) throws Throwable;
private static native com.moon.i2 __call477_33(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call477_34(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native boolean __fieldRead477_35(com.moon.mF a0) throws Throwable;
private static native int __integerCategory477_36(boolean value) throws Throwable;
private static native int __call477_37(float a0) throws Throwable;
private static native void __fieldWrite477_38(com.moon.mF a0, float a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead477_39(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_40(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_41(com.moon.mF a0) throws Throwable;
private static native float __fieldRead477_42(com.moon.mF a0) throws Throwable;
private static native int __call477_43(float a0, float a1, float a2) throws Throwable;
private static native java.lang.Integer __call477_44(int a0) throws Throwable;
private static native void __call477_45(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native void __call477_46(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call477_47(com.moon.hW a0) throws Throwable;
private static native com.moon.hX __call477_48() throws Throwable;
private static native com.moon.cb __fieldRead477_49() throws Throwable;
private static native com.moon.hX __call477_50(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call477_51(com.moon.hX a0) throws Throwable;
private static native com.v __fieldRead477_52(com.moon.mF a0) throws Throwable;
private static native int __call477_53(com.v a0) throws Throwable;
private static native com.moon.i1 __call477_54(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call477_55(com.moon.hW a0, com.moon.i1 a1) throws Throwable;
private static native com.v __fieldRead477_56(com.moon.mF a0) throws Throwable;
private static native int __call477_57(com.v a0) throws Throwable;
private static native com.moon.i1 __call477_58(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call477_59(com.moon.hW a0, com.moon.i1 a1) throws Throwable;
private static native void __call477_60(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call477_61(com.moon.hW a0) throws Throwable;
private static native java.lang.Exception __call1047700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047706_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8f2e6459e836bb40b218(com.moon.mF a0, int a1, int a2) throws E;
private static final class __SourceHandler_8f2e6459e836bb40b218 {

public static void f478(com.moon.mF receiver, int p0, int p1) throws Throwable {
    com.moon.mF forwardValue478_34_0;
    com.moon.mF forwardValue478_38_0;
    boolean spill478_0;
    com.moon.mF spill478_1;
    com.moon.mF spill478_2;
    long life3_3;
    int life5_9;
    forward_join_38: {
    forward_join_37: {
    forward_join_34: {
    forward_join_30: {
    life3_3 = (__fieldRead478_0() ^ 52526837055620L);
    spill478_0 = __call478_1();
    __call478_2(receiver);
    __call478_3(receiver);
    life5_9 = __integerCategory478_4(spill478_0);
    __call478_5(receiver);
    __call478_6(receiver);
    __call478_7(receiver);
    spill478_1 = receiver;
    if (!((life5_9 != 0))) {
        forwardValue478_34_0 = spill478_1;
        break forward_join_34;
    }
    if (!((!__fieldRead478_8(spill478_1)))) {
        break forward_join_30;
    }
    spill478_2 = receiver;
    if (!((life5_9 != 0))) {
        forwardValue478_38_0 = spill478_2;
        break forward_join_38;
    }
    if (!((__numericCompare478_11(((double) __call478_10(__fieldRead478_9(spill478_2))), 0x1.319999999999ap4d) > 0))) {
        break forward_join_37;
    }
    }
    __call478_12(receiver, p1);
    forwardValue478_34_0 = receiver;
    }
    __call478_13(forwardValue478_34_0, p0, p1);
    }
    forwardValue478_38_0 = receiver;
    }
    __call478_14(forwardValue478_38_0, p0, p1);
    return;
}
public static void h478_0(moom.Oo p0) throws Throwable {
    throw __call1047800_0(p0);
}
public static void h478_1(moom.Oo p0) throws Throwable {
    throw __call1047801_0(p0);
}
public static void h478_2(moom.Oo p0) throws Throwable {
    throw __call1047802_0(p0);
}
public static void h478_3(moom.Oo p0) throws Throwable {
    throw __call1047803_0(p0);
}
private static native long __fieldRead478_0() throws Throwable;
private static native boolean __call478_1() throws Throwable;
private static native void __call478_2(com.moon.mF a0) throws Throwable;
private static native void __call478_3(com.moon.mF a0) throws Throwable;
private static native int __integerCategory478_4(boolean value) throws Throwable;
private static native void __call478_5(com.moon.mF a0) throws Throwable;
private static native void __call478_6(com.moon.mF a0) throws Throwable;
private static native void __call478_7(com.moon.mF a0) throws Throwable;
private static native boolean __fieldRead478_8(com.moon.mF a0) throws Throwable;
private static native com.moon.nX __fieldRead478_9(com.moon.mF a0) throws Throwable;
private static native float __call478_10(com.moon.nX a0) throws Throwable;
private static native int __numericCompare478_11(double a0, double a1) throws Throwable;
private static native void __call478_12(com.moon.mF a0, int a1) throws Throwable;
private static native void __call478_13(com.moon.mF a0, int a1, int a2) throws Throwable;
private static native void __call478_14(com.moon.mF a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1047800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047803_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e2202a5821839671c62e(com.moon.mF a0, int a1, int a2) throws E;
private static final class __SourceHandler_e2202a5821839671c62e {

public static void f479(com.moon.mF receiver, int p0, int p1) throws Throwable {
    float forwardValue479_36_0;
    float forwardValue479_36_1;
    float forwardValue479_36_2;
    float forwardValue479_36_3;
    com.moon.mF forwardValue479_36_4;
    float forwardValue479_41_0;
    float forwardValue479_41_1;
    float forwardValue479_41_2;
    float forwardValue479_41_3;
    float forwardValue479_42_0;
    float forwardValue479_42_1;
    float forwardValue479_42_2;
    float forwardValue479_42_3;
    float forwardValue479_42_4;
    int forwardValue479_203_0;
    int forwardValue479_207_0;
    boolean spill479_0;
    float spill479_1;
    float spill479_2;
    float spill479_3;
    float spill479_4;
    com.moon.mF spill479_5;
    boolean spill479_6;
    long life3_3;
    float life6_6;
    int life5_7;
    com.moon.jC life7_53;
    float life8_63;
    float life9_65;
    float life10_75;
    float life11_80;
    int life12_86;
    com.moon.hW life13_91;
    com.moon.hW life14_122;
    float life15_165;
    float life16_174;
    double life17_231;
    double life19_242;
    forward_join_259: {
    forward_join_207: {
    forward_join_203: {
    forward_join_42: {
    forward_join_41: {
    forward_join_36: {
    life3_3 = (__fieldRead479_0() ^ 1296274227649L);
    spill479_0 = __call479_1();
    life6_6 = 0x1.4p2f;
    life5_7 = __integerCategory479_2(spill479_0);
    spill479_1 = __fieldRead479_3(receiver);
    spill479_2 = __fieldRead479_4(receiver);
    spill479_3 = __fieldRead479_5(receiver);
    spill479_4 = (__fieldRead479_6(receiver) - (((__fieldRead479_7(receiver) + __fieldRead479_8(receiver)) - (__call479_9(receiver) + __fieldRead479_10(receiver))) + 0x1.8p1f));
    spill479_5 = receiver;
    if (!((life5_7 == 0))) {
        forwardValue479_36_0 = spill479_1;
        forwardValue479_36_1 = spill479_2;
        forwardValue479_36_2 = spill479_3;
        forwardValue479_36_3 = spill479_4;
        forwardValue479_36_4 = spill479_5;
        break forward_join_36;
    }
    if (!(__fieldRead479_11(spill479_5))) {
        forwardValue479_41_0 = spill479_1;
        forwardValue479_41_1 = spill479_2;
        forwardValue479_41_2 = spill479_3;
        forwardValue479_41_3 = spill479_4;
        break forward_join_41;
    }
    forwardValue479_36_0 = spill479_1;
    forwardValue479_36_1 = spill479_2;
    forwardValue479_36_2 = spill479_3;
    forwardValue479_36_3 = spill479_4;
    forwardValue479_36_4 = receiver;
    }
    forwardValue479_42_0 = forwardValue479_36_0;
    forwardValue479_42_1 = forwardValue479_36_1;
    forwardValue479_42_2 = forwardValue479_36_2;
    forwardValue479_42_3 = forwardValue479_36_3;
    forwardValue479_42_4 = (__fieldRead479_12(forwardValue479_36_4) - __fieldRead479_13(receiver));
    break forward_join_42;
    }
    forwardValue479_42_0 = forwardValue479_41_0;
    forwardValue479_42_1 = forwardValue479_41_1;
    forwardValue479_42_2 = forwardValue479_41_2;
    forwardValue479_42_3 = forwardValue479_41_3;
    forwardValue479_42_4 = 0x0.0p0f;
    }
    life7_53 = __call479_16(forwardValue479_42_0, forwardValue479_42_1, forwardValue479_42_2, __call479_15((forwardValue479_42_3 - forwardValue479_42_4), __fieldRead479_14(receiver)));
    life8_63 = ((__call479_17(receiver) - 0x1.9p4f) - (__fieldRead479_18(receiver) * 0x1.0p1f));
    life9_65 = 0x1.0cp6f;
    life10_75 = ((__call479_19(receiver) + __fieldRead479_20(receiver)) + (life6_6 + 0x1.0p0f));
    life11_80 = (__call479_21(receiver) + 0x1.3p4f);
    life12_86 = __call479_23(__fieldRead479_22(receiver), 0x1.0p0f, 0x1.0p0f);
    life13_91 = __call479_27(__call479_26(__call479_24(), __fieldRead479_25()));
    __call479_29(life13_91, __call479_28(life10_75, life11_80, life8_63, 0x1.0cp6f, -1, life12_86, 0));
    __call479_33(life13_91, __call479_32(life10_75, life11_80, life8_63, 0x1.0cp6f, 0, __call479_31(__fieldRead479_30()), 1));
    __call479_34(life13_91, life7_53);
    __call479_35(life13_91);
    life14_122 = __call479_39(__call479_38(__call479_36(), __fieldRead479_37()));
    __call479_43(life14_122, __call479_42((life10_75 - 0x1.8p1f), (life11_80 - 0x1.8p1f), (life8_63 + 0x1.8p2f), 0x1.24p6f, 0x1.4p2f, 0x1.4p0f, __call479_41(__fieldRead479_40(receiver))));
    __call479_47(life14_122, __call479_46((life10_75 - 0x1.0p1f), (life11_80 - 0x1.0p1f), (life8_63 + 0x1.0p2f), 0x1.1cp6f, 0x1.4p2f, 0x1.0p-1f, __call479_45(__fieldRead479_44(receiver))));
    life15_165 = (life10_75 + (life8_63 * __fieldRead479_48(receiver)));
    life16_174 = (life11_80 + (0x1.0cp6f * (0x1.0p0f - __fieldRead479_49(receiver))));
    __call479_53(life14_122, __call479_52((life15_165 - 0x1.0p2f), (life16_174 - 0x1.0p2f), 0x1.0p3f, 0x1.0p3f, 0x1.0p1f, 0x1.8p-1f, __call479_51(__fieldRead479_50(receiver))));
    __call479_54(life14_122, life7_53);
    __call479_55(life14_122);
    spill479_6 = __fieldRead479_56(receiver);
    if (!((life5_7 == 0))) {
        forwardValue479_203_0 = __integerCategory479_57(spill479_6);
        break forward_join_203;
    }
    if (!(spill479_6)) {
        break forward_join_259;
    }
    forwardValue479_203_0 = __integerCategory479_59(__call479_58(receiver, p0, p1, life10_75, life11_80, life8_63, 0x1.0cp6f));
    }
    if (!((life5_7 == 0))) {
        forwardValue479_207_0 = forwardValue479_203_0;
        break forward_join_207;
    }
    if (!((forwardValue479_203_0 != 0))) {
        break forward_join_259;
    }
    forwardValue479_207_0 = p0;
    }
    life17_231 = __call479_60(((double) ((((float) forwardValue479_207_0) - life10_75) / life8_63)), 0x0.0p0d, 0x1.0p0d);
    life19_242 = __call479_61(((double) ((((float) p1) - life11_80) / 0x1.0cp6f)), 0x0.0p0d, 0x1.0p0d);
    __call479_66(__fieldRead479_62(receiver), __call479_65(__call479_64(__fieldRead479_63(receiver), ((float) life17_231), ((float) (0x1.0p0d - life19_242)))));
    __fieldWrite479_72(receiver, __call479_71(__call479_70(__cast479_69(__call479_68(__fieldRead479_67(receiver))))));
    __fieldWrite479_73(receiver, ((float) life17_231));
    __fieldWrite479_74(receiver, ((float) (0x1.0p0d - life19_242)));
    }
    return;
}
public static void h479_0(moom.Oo p0) throws Throwable {
    throw __call1047900_0(p0);
}
public static void h479_1(moom.Oo p0) throws Throwable {
    throw __call1047901_0(p0);
}
public static void h479_2(moom.Oo p0) throws Throwable {
    throw __call1047902_0(p0);
}
public static void h479_3(moom.Oo p0) throws Throwable {
    throw __call1047903_0(p0);
}
public static void h479_4(moom.Oo p0) throws Throwable {
    throw __call1047904_0(p0);
}
private static native long __fieldRead479_0() throws Throwable;
private static native boolean __call479_1() throws Throwable;
private static native int __integerCategory479_2(boolean value) throws Throwable;
private static native float __fieldRead479_3(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_4(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_5(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_6(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_7(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_8(com.moon.mF a0) throws Throwable;
private static native float __call479_9(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_10(com.moon.mF a0) throws Throwable;
private static native boolean __fieldRead479_11(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_12(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_13(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_14(com.moon.mF a0) throws Throwable;
private static native float __call479_15(float a0, float a1) throws Throwable;
private static native com.moon.jC __call479_16(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __call479_17(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_18(com.moon.mF a0) throws Throwable;
private static native float __call479_19(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_20(com.moon.mF a0) throws Throwable;
private static native float __call479_21(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_22(com.moon.mF a0) throws Throwable;
private static native int __call479_23(float a0, float a1, float a2) throws Throwable;
private static native com.moon.hX __call479_24() throws Throwable;
private static native com.moon.cb __fieldRead479_25() throws Throwable;
private static native com.moon.hX __call479_26(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call479_27(com.moon.hX a0) throws Throwable;
private static native com.moon.i0 __call479_28(float a0, float a1, float a2, float a3, int a4, int a5, int a6) throws Throwable;
private static native void __call479_29(com.moon.hW a0, com.moon.i0 a1) throws Throwable;
private static native java.awt.Color __fieldRead479_30() throws Throwable;
private static native int __call479_31(java.awt.Color a0) throws Throwable;
private static native com.moon.i0 __call479_32(float a0, float a1, float a2, float a3, int a4, int a5, int a6) throws Throwable;
private static native void __call479_33(com.moon.hW a0, com.moon.i0 a1) throws Throwable;
private static native void __call479_34(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call479_35(com.moon.hW a0) throws Throwable;
private static native com.moon.hX __call479_36() throws Throwable;
private static native com.moon.cb __fieldRead479_37() throws Throwable;
private static native com.moon.hX __call479_38(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call479_39(com.moon.hX a0) throws Throwable;
private static native com.v __fieldRead479_40(com.moon.mF a0) throws Throwable;
private static native int __call479_41(com.v a0) throws Throwable;
private static native com.moon.i1 __call479_42(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call479_43(com.moon.hW a0, com.moon.i1 a1) throws Throwable;
private static native com.v __fieldRead479_44(com.moon.mF a0) throws Throwable;
private static native int __call479_45(com.v a0) throws Throwable;
private static native com.moon.i1 __call479_46(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call479_47(com.moon.hW a0, com.moon.i1 a1) throws Throwable;
private static native float __fieldRead479_48(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_49(com.moon.mF a0) throws Throwable;
private static native com.v __fieldRead479_50(com.moon.mF a0) throws Throwable;
private static native int __call479_51(com.v a0) throws Throwable;
private static native com.moon.i1 __call479_52(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call479_53(com.moon.hW a0, com.moon.i1 a1) throws Throwable;
private static native void __call479_54(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call479_55(com.moon.hW a0) throws Throwable;
private static native boolean __fieldRead479_56(com.moon.mF a0) throws Throwable;
private static native int __integerCategory479_57(boolean value) throws Throwable;
private static native boolean __call479_58(com.moon.mF a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory479_59(boolean value) throws Throwable;
private static native double __call479_60(double a0, double a1, double a2) throws Throwable;
private static native double __call479_61(double a0, double a1, double a2) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead479_62(com.moon.mF a0) throws Throwable;
private static native float __fieldRead479_63(com.moon.mF a0) throws Throwable;
private static native int __call479_64(float a0, float a1, float a2) throws Throwable;
private static native java.lang.Integer __call479_65(int a0) throws Throwable;
private static native void __call479_66(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead479_67(com.moon.mF a0) throws Throwable;
private static native java.lang.Object __call479_68(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast479_69(java.lang.Object a0) throws Throwable;
private static native int __call479_70(java.lang.Integer a0) throws Throwable;
private static native com.v __call479_71(int a0) throws Throwable;
private static native void __fieldWrite479_72(com.moon.mF a0, com.v a1) throws Throwable;
private static native void __fieldWrite479_73(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite479_74(com.moon.mF a0, float a1) throws Throwable;
private static native java.lang.Exception __call1047900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047904_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_96cc31c33afebe88988e(com.moon.mF a0) throws E;
private static final class __SourceHandler_96cc31c33afebe88988e {

public static void f480(com.moon.mF receiver) throws Throwable {
    com.moon.mF forwardValue480_73_0;
    int forwardValue480_73_1;
    int forwardValue480_73_2;
    com.moon.mF forwardValue480_74_0;
    int forwardValue480_74_1;
    com.moon.mF forwardValue480_75_0;
    int forwardValue480_75_1;
    int forwardValue480_75_2;
    boolean spill480_0;
    com.moon.mF spill480_1;
    int spill480_2;
    boolean spill480_3;
    long life1_3;
    com.moon.jC life4_13;
    float life5_20;
    float life6_23;
    float life7_31;
    float life8_34;
    int life3_35;
    com.moon.hW life9_40;
    forward_join_75: {
    forward_join_74: {
    forward_join_73: {
    life1_3 = (__fieldRead480_0() ^ 8137375408791L);
    life4_13 = __call480_5(__fieldRead480_1(receiver), __fieldRead480_2(receiver), __fieldRead480_3(receiver), __fieldRead480_4(receiver));
    spill480_0 = __call480_6();
    life5_20 = (__fieldRead480_7(receiver) + __fieldRead480_8(receiver));
    life6_23 = __call480_9(receiver);
    life7_31 = (__fieldRead480_10(receiver) - (__fieldRead480_11(receiver) * 0x1.0p1f));
    life8_34 = __fieldRead480_12(receiver);
    life3_35 = __integerCategory480_13(spill480_0);
    life9_40 = __call480_17(__call480_16(__call480_14(), __fieldRead480_15()));
    __call480_21(life9_40, __call480_20(life5_20, life6_23, life7_31, life8_34, 0x1.8p2f, __call480_19(__fieldRead480_18(receiver))));
    __call480_22(life9_40, life4_13);
    __call480_23(life9_40);
    spill480_1 = receiver;
    spill480_2 = __invokedynamic480_24(9703, (7370143031081949208L ^ life1_3));
    spill480_3 = __fieldRead480_25(receiver);
    if (!((life3_35 == 0))) {
        forwardValue480_73_0 = spill480_1;
        forwardValue480_73_1 = spill480_2;
        forwardValue480_73_2 = __integerCategory480_26(spill480_3);
        break forward_join_73;
    }
    if (!(spill480_3)) {
        forwardValue480_74_0 = spill480_1;
        forwardValue480_74_1 = spill480_2;
        break forward_join_74;
    }
    forwardValue480_73_0 = spill480_1;
    forwardValue480_73_1 = spill480_2;
    forwardValue480_73_2 = __invokedynamic480_27(18059, (8968314754359999349L ^ life1_3));
    }
    forwardValue480_75_0 = forwardValue480_73_0;
    forwardValue480_75_1 = forwardValue480_73_1;
    forwardValue480_75_2 = forwardValue480_73_2;
    break forward_join_75;
    }
    forwardValue480_75_0 = forwardValue480_74_0;
    forwardValue480_75_1 = forwardValue480_74_1;
    forwardValue480_75_2 = 0;
    }
    __fieldWrite480_28(forwardValue480_75_0, ((float) (forwardValue480_75_1 + forwardValue480_75_2)));
    return;
}
public static void h480_0(moom.Oo p0) throws Throwable {
    throw __call1048000_0(p0);
}
private static native long __fieldRead480_0() throws Throwable;
private static native float __fieldRead480_1(com.moon.mF a0) throws Throwable;
private static native float __fieldRead480_2(com.moon.mF a0) throws Throwable;
private static native float __fieldRead480_3(com.moon.mF a0) throws Throwable;
private static native float __fieldRead480_4(com.moon.mF a0) throws Throwable;
private static native com.moon.jC __call480_5(float a0, float a1, float a2, float a3) throws Throwable;
private static native boolean __call480_6() throws Throwable;
private static native float __fieldRead480_7(com.moon.mF a0) throws Throwable;
private static native float __fieldRead480_8(com.moon.mF a0) throws Throwable;
private static native float __call480_9(com.moon.mF a0) throws Throwable;
private static native float __fieldRead480_10(com.moon.mF a0) throws Throwable;
private static native float __fieldRead480_11(com.moon.mF a0) throws Throwable;
private static native float __fieldRead480_12(com.moon.mF a0) throws Throwable;
private static native int __integerCategory480_13(boolean value) throws Throwable;
private static native com.moon.hX __call480_14() throws Throwable;
private static native com.moon.cb __fieldRead480_15() throws Throwable;
private static native com.moon.hX __call480_16(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call480_17(com.moon.hX a0) throws Throwable;
private static native com.v __fieldRead480_18(com.moon.mF a0) throws Throwable;
private static native int __call480_19(com.v a0) throws Throwable;
private static native com.moon.i3 __call480_20(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call480_21(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call480_22(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call480_23(com.moon.hW a0) throws Throwable;
private static native int __invokedynamic480_24(int a0, long a1) throws Throwable;
private static native boolean __fieldRead480_25(com.moon.mF a0) throws Throwable;
private static native int __integerCategory480_26(boolean value) throws Throwable;
private static native int __invokedynamic480_27(int a0, long a1) throws Throwable;
private static native void __fieldWrite480_28(com.moon.mF a0, float a1) throws Throwable;
private static native java.lang.Exception __call1048000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_12415f55d608ff566853(com.moon.mF a0) throws E;
private static final class __SourceHandler_12415f55d608ff566853 {

public static void f39(com.moon.mF receiver) throws Throwable {
    float lexicalValue39_34_0;
    float lexicalValue39_34_1;
    float lexicalValue39_34_2;
    float lexicalValue39_34_3;
    com.moon.mF lexicalValue39_34_4;
    float lexicalValue39_39_0;
    float lexicalValue39_39_1;
    float lexicalValue39_39_2;
    float lexicalValue39_39_3;
    float lexicalValue39_40_0;
    float lexicalValue39_40_1;
    float lexicalValue39_40_2;
    float lexicalValue39_40_3;
    float lexicalValue39_40_4;
    int lexicalValue39_176_0;
    float spill39_0;
    float spill39_1;
    float spill39_2;
    float spill39_3;
    com.moon.mF spill39_4;
    int spill39_5;
    long spill39_6;
    int[] spill39_7;
    int[] spill39_8;
    int[] spill39_9;
    int[] spill39_10;
    int[] spill39_11;
    int[] spill39_12;
    int[] spill39_13;
    int[] spill39_14;
    long life1_3;
    int life3_5;
    com.moon.jC life4_51;
    float life5_60;
    float life6_68;
    int[] life7_127;
    com.moon.hW life8_132;
    int life9_134;
    int life10_142;
    float life11_149;
    float life12_151;
    float life13_153;
    lexical_join_177: {
    lexical_join_176: {
    lexical_join_175: {
    lexical_join_169: {
    lexical_join_164: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_34: {
    life1_3 = (__fieldRead39_0() ^ 21190984989459L);
    life3_5 = __integerCategory39_2(__call39_1());
    spill39_0 = __fieldRead39_3(receiver);
    spill39_1 = __fieldRead39_4(receiver);
    spill39_2 = __fieldRead39_5(receiver);
    spill39_3 = (__fieldRead39_6(receiver) - (((__fieldRead39_7(receiver) + __fieldRead39_8(receiver)) - (__call39_9(receiver) + __fieldRead39_10(receiver))) + 0x1.8p1f));
    spill39_4 = receiver;
    if (!((life3_5 == 0))) {
        lexicalValue39_34_0 = spill39_0;
        lexicalValue39_34_1 = spill39_1;
        lexicalValue39_34_2 = spill39_2;
        lexicalValue39_34_3 = spill39_3;
        lexicalValue39_34_4 = spill39_4;
        break lexical_join_34;
    }
    if (!(__fieldRead39_11(spill39_4))) {
        lexicalValue39_39_0 = spill39_0;
        lexicalValue39_39_1 = spill39_1;
        lexicalValue39_39_2 = spill39_2;
        lexicalValue39_39_3 = spill39_3;
        break lexical_join_39;
    }
    lexicalValue39_34_0 = spill39_0;
    lexicalValue39_34_1 = spill39_1;
    lexicalValue39_34_2 = spill39_2;
    lexicalValue39_34_3 = spill39_3;
    lexicalValue39_34_4 = receiver;
    }
    lexicalValue39_40_0 = lexicalValue39_34_0;
    lexicalValue39_40_1 = lexicalValue39_34_1;
    lexicalValue39_40_2 = lexicalValue39_34_2;
    lexicalValue39_40_3 = lexicalValue39_34_3;
    lexicalValue39_40_4 = (__fieldRead39_12(lexicalValue39_34_4) - __fieldRead39_13(receiver));
    break lexical_join_40;
    }
    lexicalValue39_40_0 = lexicalValue39_39_0;
    lexicalValue39_40_1 = lexicalValue39_39_1;
    lexicalValue39_40_2 = lexicalValue39_39_2;
    lexicalValue39_40_3 = lexicalValue39_39_3;
    lexicalValue39_40_4 = 0x0.0p0f;
    }
    life4_51 = __call39_16(lexicalValue39_40_0, lexicalValue39_40_1, lexicalValue39_40_2, __call39_15((lexicalValue39_40_3 - lexicalValue39_40_4), __fieldRead39_14(receiver)));
    spill39_5 = 30681;
    life5_60 = ((__fieldRead39_17(receiver) + __fieldRead39_18(receiver)) + 0x1.4p2f);
    spill39_6 = (6483590685049295780L ^ life1_3);
    life6_68 = (__fieldRead39_19(receiver) + 0x1.68p6f);
    int[] __stackOp39_21_0 = new int[__invokedynamic39_20(spill39_5, spill39_6)];
    spill39_7 = __stackOp39_21_0;
    (__stackOp39_21_0)[0] = __call39_23(__fieldRead39_22(receiver));
    int[] __stackOp39_24_0 = spill39_7;
    spill39_8 = __stackOp39_24_0;
    (__stackOp39_24_0)[1] = __call39_26(__fieldRead39_25(receiver));
    int[] __stackOp39_27_0 = spill39_8;
    spill39_9 = __stackOp39_27_0;
    (__stackOp39_27_0)[2] = __call39_29(__fieldRead39_28(receiver));
    int[] __stackOp39_30_0 = spill39_9;
    spill39_10 = __stackOp39_30_0;
    (__stackOp39_30_0)[3] = __call39_32(__fieldRead39_31(receiver));
    int[] __stackOp39_33_0 = spill39_10;
    spill39_11 = __stackOp39_33_0;
    (__stackOp39_33_0)[4] = __call39_35(__fieldRead39_34(receiver));
    int[] __stackOp39_36_0 = spill39_11;
    spill39_12 = __stackOp39_36_0;
    (__stackOp39_36_0)[5] = __call39_38(__fieldRead39_37(receiver));
    int[] __stackOp39_39_0 = spill39_12;
    spill39_13 = __stackOp39_39_0;
    (__stackOp39_39_0)[__invokedynamic39_40(2403, (4374593530297904400L ^ life1_3))] = __call39_42(__fieldRead39_41(receiver));
    int[] __stackOp39_43_0 = spill39_13;
    spill39_14 = __stackOp39_43_0;
    (__stackOp39_43_0)[__invokedynamic39_44(2074, (9181506553082702950L ^ life1_3))] = __call39_46(__fieldRead39_45(receiver));
    life7_127 = spill39_14;
    life8_132 = __call39_50(__call39_49(__call39_47(), __fieldRead39_48()));
    life9_134 = 0;
    lexical_cycle_129: while (true) {
    if (!((life9_134 < (life7_127).length))) {
        break lexical_join_164;
    }
    life10_142 = (life7_127)[life9_134];
    life11_149 = (life5_60 + (((float) life9_134) * 0x1.6p3f));
    life12_151 = 0x1.2p3f;
    life13_153 = 0x1.2p3f;
    __call39_52(life8_132, __call39_51(life11_149, (life6_68 + 0x1.0p-2f), life12_151, life13_153, 0x1.cp1f, life10_142));
    life9_134 += 1;
    if (!((life3_5 == 0))) {
        break lexical_join_169;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_129; }
    break lexical_cycle_129;
    }
    }
    __call39_53(life8_132, life4_51);
    __call39_54(life8_132);
    }
    if (!((__call39_55() != null))) {
        break lexical_join_177;
    }
    if (!((life3_5 != 0))) {
        break lexical_join_175;
    }
    lexicalValue39_176_0 = 0;
    break lexical_join_176;
    }
    lexicalValue39_176_0 = 1;
    }
    __call39_56(lexicalValue39_176_0);
    }
    return;
}
public static void h39_0(moom.Oo p0) throws Throwable {
    throw __call1003900_0(p0);
}
public static void h39_1(moom.Oo p0) throws Throwable {
    throw __call1003901_0(p0);
}
public static void h39_2(moom.Oo p0) throws Throwable {
    throw __call1003902_0(p0);
}
public static void h39_3(moom.Oo p0) throws Throwable {
    throw __call1003903_0(p0);
}
public static void h39_4(moom.Oo p0) throws Throwable {
    throw __call1003904_0(p0);
}
private static native long __fieldRead39_0() throws Throwable;
private static native boolean __call39_1() throws Throwable;
private static native int __integerCategory39_2(boolean value) throws Throwable;
private static native float __fieldRead39_3(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_4(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_5(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_6(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_7(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_8(com.moon.mF a0) throws Throwable;
private static native float __call39_9(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_10(com.moon.mF a0) throws Throwable;
private static native boolean __fieldRead39_11(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_12(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_13(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_14(com.moon.mF a0) throws Throwable;
private static native float __call39_15(float a0, float a1) throws Throwable;
private static native com.moon.jC __call39_16(float a0, float a1, float a2, float a3) throws Throwable;
private static native float __fieldRead39_17(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_18(com.moon.mF a0) throws Throwable;
private static native float __fieldRead39_19(com.moon.mF a0) throws Throwable;
private static native int __invokedynamic39_20(int a0, long a1) throws Throwable;
private static native com.v __fieldRead39_22(com.moon.mF a0) throws Throwable;
private static native int __call39_23(com.v a0) throws Throwable;
private static native com.v __fieldRead39_25(com.moon.mF a0) throws Throwable;
private static native int __call39_26(com.v a0) throws Throwable;
private static native com.v __fieldRead39_28(com.moon.mF a0) throws Throwable;
private static native int __call39_29(com.v a0) throws Throwable;
private static native com.v __fieldRead39_31(com.moon.mF a0) throws Throwable;
private static native int __call39_32(com.v a0) throws Throwable;
private static native com.v __fieldRead39_34(com.moon.mF a0) throws Throwable;
private static native int __call39_35(com.v a0) throws Throwable;
private static native com.v __fieldRead39_37(com.moon.mF a0) throws Throwable;
private static native int __call39_38(com.v a0) throws Throwable;
private static native int __invokedynamic39_40(int a0, long a1) throws Throwable;
private static native com.v __fieldRead39_41(com.moon.mF a0) throws Throwable;
private static native int __call39_42(com.v a0) throws Throwable;
private static native int __invokedynamic39_44(int a0, long a1) throws Throwable;
private static native com.v __fieldRead39_45(com.moon.mF a0) throws Throwable;
private static native int __call39_46(com.v a0) throws Throwable;
private static native com.moon.hX __call39_47() throws Throwable;
private static native com.moon.cb __fieldRead39_48() throws Throwable;
private static native com.moon.hX __call39_49(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call39_50(com.moon.hX a0) throws Throwable;
private static native com.moon.i3 __call39_51(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call39_52(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call39_53(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call39_54(com.moon.hW a0) throws Throwable;
private static native java.lang.String[] __call39_55() throws Throwable;
private static native void __call39_56(int a0) throws Throwable;
private static native java.lang.Exception __call1003900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1003904_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3471510615e399a6fa9f(com.moon.mF a0) throws E;
private static final class __SourceHandler_3471510615e399a6fa9f {

public static void f482(com.moon.mF receiver) throws Throwable {
    float lexicalValue482_34_0;
    float lexicalValue482_34_1;
    float lexicalValue482_34_2;
    float lexicalValue482_34_3;
    com.moon.mF lexicalValue482_34_4;
    float lexicalValue482_39_0;
    float lexicalValue482_39_1;
    float lexicalValue482_39_2;
    float lexicalValue482_39_3;
    float lexicalValue482_40_0;
    float lexicalValue482_40_1;
    float lexicalValue482_40_2;
    float lexicalValue482_40_3;
    float lexicalValue482_40_4;
    float spill482_0;
    float spill482_1;
    float spill482_2;
    float spill482_3;
    com.moon.mF spill482_4;
    long life1_3;
    int life3_5;
    com.moon.jC life4_51;
    com.moon.hW life5_56;
    float life6_64;
    float life7_69;
    java.lang.String[] life8_71;
    int life9_74;
    int life10_76;
    java.lang.String life11_83;
    float life12_91;
    com.moon.hW life8_138;
    float life6_146;
    java.lang.String[] life9_148;
    int life10_151;
    int life11_153;
    java.lang.String life12_160;
    float life13_168;
    lexical_join_194: {
    lexical_join_189: {
    lexical_join_122: {
    lexical_join_117: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_34: {
    life1_3 = (__fieldRead482_0() ^ 20555384881961L);
    life3_5 = __integerCategory482_2(__call482_1());
    spill482_0 = __fieldRead482_3(receiver);
    spill482_1 = __fieldRead482_4(receiver);
    spill482_2 = __fieldRead482_5(receiver);
    spill482_3 = (__fieldRead482_6(receiver) - (((__fieldRead482_7(receiver) + __fieldRead482_8(receiver)) - (__call482_9(receiver) + __fieldRead482_10(receiver))) + 0x1.8p1f));
    spill482_4 = receiver;
    if (!((life3_5 != 0))) {
        lexicalValue482_34_0 = spill482_0;
        lexicalValue482_34_1 = spill482_1;
        lexicalValue482_34_2 = spill482_2;
        lexicalValue482_34_3 = spill482_3;
        lexicalValue482_34_4 = spill482_4;
        break lexical_join_34;
    }
    if (!(__fieldRead482_11(spill482_4))) {
        lexicalValue482_39_0 = spill482_0;
        lexicalValue482_39_1 = spill482_1;
        lexicalValue482_39_2 = spill482_2;
        lexicalValue482_39_3 = spill482_3;
        break lexical_join_39;
    }
    lexicalValue482_34_0 = spill482_0;
    lexicalValue482_34_1 = spill482_1;
    lexicalValue482_34_2 = spill482_2;
    lexicalValue482_34_3 = spill482_3;
    lexicalValue482_34_4 = receiver;
    }
    lexicalValue482_40_0 = lexicalValue482_34_0;
    lexicalValue482_40_1 = lexicalValue482_34_1;
    lexicalValue482_40_2 = lexicalValue482_34_2;
    lexicalValue482_40_3 = lexicalValue482_34_3;
    lexicalValue482_40_4 = (__fieldRead482_12(lexicalValue482_34_4) - __fieldRead482_13(receiver));
    break lexical_join_40;
    }
    lexicalValue482_40_0 = lexicalValue482_39_0;
    lexicalValue482_40_1 = lexicalValue482_39_1;
    lexicalValue482_40_2 = lexicalValue482_39_2;
    lexicalValue482_40_3 = lexicalValue482_39_3;
    lexicalValue482_40_4 = 0x0.0p0f;
    }
    life4_51 = __call482_16(lexicalValue482_40_0, lexicalValue482_40_1, lexicalValue482_40_2, __call482_15((lexicalValue482_40_3 - lexicalValue482_40_4), __fieldRead482_14(receiver)));
    life5_56 = __call482_20(__call482_19(__call482_17(), __fieldRead482_18()));
    life6_64 = ((__call482_21(receiver) + __fieldRead482_22(receiver)) + 0x1.4p2f);
    life7_69 = (__call482_23(receiver) + 0x1.98p6f);
    life8_71 = __fieldRead482_24();
    life9_74 = (life8_71).length;
    life10_76 = 0;
    lexical_cycle_71: while (true) {
    if (!((life10_76 < life9_74))) {
        break lexical_join_117;
    }
    life11_83 = (life8_71)[life10_76];
    life12_91 = (__call482_26(__fieldRead482_25(receiver), life11_83, 0x1.a428f6p2f) + 0x1.0p2f);
    __call482_32(life5_56, __call482_31(life6_64, (life7_69 + 0x1.0p-2f), (life12_91 + 0x1.0p2f), (__call482_28(__fieldRead482_27(receiver), 0x1.c428f6p2f) + 0x1.0p2f), 0x1.4p2f, __call482_30(__fieldRead482_29(receiver))));
    life6_64 = (life6_64 + (life12_91 + 0x1.8p2f));
    life10_76 += 1;
    if (!((life3_5 != 0))) {
        break lexical_join_122;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_71; }
    break lexical_cycle_71;
    }
    }
    __call482_33(life5_56, life4_51);
    __call482_34(life5_56);
    }
    life8_138 = __call482_40(__call482_39(__call482_37(__call482_35(), __fieldRead482_36()), __fieldRead482_38(receiver)));
    life6_146 = ((__call482_41(receiver) + __fieldRead482_42(receiver)) + 0x1.4p2f);
    life9_148 = __fieldRead482_43();
    life10_151 = (life9_148).length;
    life11_153 = 0;
    lexical_cycle_145: while (true) {
    if (!((life11_153 < life10_151))) {
        break lexical_join_189;
    }
    life12_160 = (life9_148)[life11_153];
    life13_168 = (__call482_45(__fieldRead482_44(receiver), life12_160, 0x1.a428f6p2f) + 0x1.0p2f);
    __call482_49(__fieldRead482_46(receiver), life8_138, life12_160, 0x1.a428f6p2f, (life6_146 + 0x1.0p2f), (life7_69 + 0x1.8p1f), __call482_48(__fieldRead482_47(receiver)), 0, 0, 0x1.47ae14p-7f);
    life6_146 = (life6_146 + (life13_168 + 0x1.8p2f));
    life11_153 += 1;
    if (!((life3_5 != 0))) {
        break lexical_join_194;
    }
    if (!((life3_5 == 0))) { continue lexical_cycle_145; }
    break lexical_cycle_145;
    }
    }
    __call482_50(life8_138, life4_51);
    __call482_51(life8_138);
    }
    return;
}
public static void h482_0(moom.Oo p0) throws Throwable {
    throw __call1048200_0(p0);
}
public static void h482_1(moom.Oo p0) throws Throwable {
    throw __call1048201_0(p0);
}
public static void h482_2(moom.Oo p0) throws Throwable {
    throw __call1048202_0(p0);
}
public static void h482_3(moom.Oo p0) throws Throwable {
    throw __call1048203_0(p0);
}
private static native long __fieldRead482_0() throws Throwable;
private static native boolean __call482_1() throws Throwable;
private static native int __integerCategory482_2(boolean value) throws Throwable;
private static native float __fieldRead482_3(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_4(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_5(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_6(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_7(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_8(com.moon.mF a0) throws Throwable;
private static native float __call482_9(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_10(com.moon.mF a0) throws Throwable;
private static native boolean __fieldRead482_11(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_12(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_13(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_14(com.moon.mF a0) throws Throwable;
private static native float __call482_15(float a0, float a1) throws Throwable;
private static native com.moon.jC __call482_16(float a0, float a1, float a2, float a3) throws Throwable;
private static native com.moon.hX __call482_17() throws Throwable;
private static native com.moon.cb __fieldRead482_18() throws Throwable;
private static native com.moon.hX __call482_19(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call482_20(com.moon.hX a0) throws Throwable;
private static native float __call482_21(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_22(com.moon.mF a0) throws Throwable;
private static native float __call482_23(com.moon.mF a0) throws Throwable;
private static native java.lang.String[] __fieldRead482_24() throws Throwable;
private static native com.moon.jm __fieldRead482_25(com.moon.mF a0) throws Throwable;
private static native float __call482_26(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native com.moon.jm __fieldRead482_27(com.moon.mF a0) throws Throwable;
private static native float __call482_28(com.moon.jm a0, float a1) throws Throwable;
private static native com.v __fieldRead482_29(com.moon.mF a0) throws Throwable;
private static native int __call482_30(com.v a0) throws Throwable;
private static native com.moon.i3 __call482_31(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call482_32(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call482_33(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call482_34(com.moon.hW a0) throws Throwable;
private static native com.moon.hX __call482_35() throws Throwable;
private static native com.moon.cb __fieldRead482_36() throws Throwable;
private static native com.moon.hX __call482_37(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.jm __fieldRead482_38(com.moon.mF a0) throws Throwable;
private static native com.moon.hX __call482_39(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call482_40(com.moon.hX a0) throws Throwable;
private static native float __call482_41(com.moon.mF a0) throws Throwable;
private static native float __fieldRead482_42(com.moon.mF a0) throws Throwable;
private static native java.lang.String[] __fieldRead482_43() throws Throwable;
private static native com.moon.jm __fieldRead482_44(com.moon.mF a0) throws Throwable;
private static native float __call482_45(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native com.moon.jm __fieldRead482_46(com.moon.mF a0) throws Throwable;
private static native com.v __fieldRead482_47(com.moon.mF a0) throws Throwable;
private static native int __call482_48(com.v a0) throws Throwable;
private static native void __call482_49(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6, int a7, int a8, float a9) throws Throwable;
private static native void __call482_50(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call482_51(com.moon.hW a0) throws Throwable;
private static native java.lang.Exception __call1048200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1048203_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_932f582169320f786852(com.moon.mF a0) throws E;
private static final class __SourceHandler_932f582169320f786852 {

public static void f100027(com.moon.mF receiver) throws Throwable {
    com.moon.nX forestValue100027_21_0;
    com.moon.nX forestValue100027_22_0;
    float forestValue100027_22_1;
    com.moon.nX spill100027_0;
    long life1_3;
    com.moon.jC life3_13;
    com.moon.hW life4_28;
    com.moon.hW life5_68;
    forest_join_22: {
    forest_join_21: {
    life1_3 = (__fieldRead100027_0() ^ 80615919959868L);
    life3_13 = __call100027_5(__fieldRead100027_1(receiver), __fieldRead100027_2(receiver), __fieldRead100027_3(receiver), __fieldRead100027_4(receiver));
    spill100027_0 = __fieldRead100027_6(receiver);
    if (!(__fieldRead100027_7(receiver))) {
        forestValue100027_21_0 = spill100027_0;
        break forest_join_21;
    }
    forestValue100027_22_0 = spill100027_0;
    forestValue100027_22_1 = 0x0.0p0f;
    break forest_join_22;
    }
    forestValue100027_22_0 = forestValue100027_21_0;
    forestValue100027_22_1 = 0x1.0p0f;
    }
    __call100027_8(forestValue100027_22_0, forestValue100027_22_1, 0x1.333334p-2d);
    life4_28 = __call100027_12(__call100027_11(__call100027_9(), __fieldRead100027_10()));
    __call100027_22(life4_28, __call100027_21(((((__call100027_13(receiver) + __call100027_14(receiver)) - __fieldRead100027_15(receiver)) - 0x1.38p4f) + 0x1.0p0f), (__call100027_16(receiver) + 0x1.8p1f), 0x1.ap3f, 0x1.ap3f, 0x1.6p2f, __call100027_20(__cast100027_19(__call100027_18(__fieldRead100027_17(receiver))))));
    __call100027_23(life4_28, life3_13);
    __call100027_24(life4_28);
    life5_68 = __call100027_30(__call100027_29(__call100027_27(__call100027_25(), __fieldRead100027_26()), __fieldRead100027_28(receiver)));
    __call100027_39(__fieldRead100027_31(receiver), life5_68, __call100027_33(__fieldRead100027_32(receiver)), 0x1.0147acp3f, ((__call100027_34(receiver) + __fieldRead100027_35(receiver)) + 0x1.8p2f), (__call100027_36(receiver) + 0x1.4p2f), __call100027_38(__fieldRead100027_37(receiver)));
    __call100027_40(life5_68, life3_13);
    __call100027_41(life5_68);
    return;
}
public static void h100027_0(moom.Oo p0) throws Throwable {
    throw __call13002700_0(p0);
}
private static native long __fieldRead100027_0() throws Throwable;
private static native float __fieldRead100027_1(com.moon.mF a0) throws Throwable;
private static native float __fieldRead100027_2(com.moon.mF a0) throws Throwable;
private static native float __fieldRead100027_3(com.moon.mF a0) throws Throwable;
private static native float __fieldRead100027_4(com.moon.mF a0) throws Throwable;
private static native com.moon.jC __call100027_5(float a0, float a1, float a2, float a3) throws Throwable;
private static native com.moon.nX __fieldRead100027_6(com.moon.mF a0) throws Throwable;
private static native boolean __fieldRead100027_7(com.moon.mF a0) throws Throwable;
private static native void __call100027_8(com.moon.nX a0, float a1, double a2) throws Throwable;
private static native com.moon.hX __call100027_9() throws Throwable;
private static native com.moon.cb __fieldRead100027_10() throws Throwable;
private static native com.moon.hX __call100027_11(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call100027_12(com.moon.hX a0) throws Throwable;
private static native float __call100027_13(com.moon.mF a0) throws Throwable;
private static native float __call100027_14(com.moon.mF a0) throws Throwable;
private static native float __fieldRead100027_15(com.moon.mF a0) throws Throwable;
private static native float __call100027_16(com.moon.mF a0) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead100027_17(com.moon.mF a0) throws Throwable;
private static native java.lang.Object __call100027_18(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast100027_19(java.lang.Object a0) throws Throwable;
private static native int __call100027_20(java.lang.Integer a0) throws Throwable;
private static native com.moon.i3 __call100027_21(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call100027_22(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call100027_23(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call100027_24(com.moon.hW a0) throws Throwable;
private static native com.moon.hX __call100027_25() throws Throwable;
private static native com.moon.cb __fieldRead100027_26() throws Throwable;
private static native com.moon.hX __call100027_27(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.jm __fieldRead100027_28(com.moon.mF a0) throws Throwable;
private static native com.moon.hX __call100027_29(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call100027_30(com.moon.hX a0) throws Throwable;
private static native com.moon.jm __fieldRead100027_31(com.moon.mF a0) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead100027_32(com.moon.mF a0) throws Throwable;
private static native java.lang.String __call100027_33(com.moon.setting.ColorSetting a0) throws Throwable;
private static native float __call100027_34(com.moon.mF a0) throws Throwable;
private static native float __fieldRead100027_35(com.moon.mF a0) throws Throwable;
private static native float __call100027_36(com.moon.mF a0) throws Throwable;
private static native com.v __fieldRead100027_37(com.moon.mF a0) throws Throwable;
private static native int __call100027_38(com.v a0) throws Throwable;
private static native void __call100027_39(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call100027_40(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call100027_41(com.moon.hW a0) throws Throwable;
private static native java.lang.Exception __call13002700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fab38625c482fa13e3a9(com.moon.mF a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_fab38625c482fa13e3a9 {

public static boolean f110(com.moon.mF receiver, int p0, int p1, int p2) throws Throwable {
    int forestValue110_131_0;
    java.lang.String forestValue110_169_0;
    int forestValue110_227_0;
    int forestValue110_240_0;
    com.moon.mF forestValue110_248_0;
    int forestValue110_248_1;
    com.moon.mF forestValue110_249_0;
    com.moon.mF forestValue110_250_0;
    int forestValue110_250_1;
    com.moon.mF forestValue110_254_0;
    com.moon.mF forestValue110_455_0;
    int forestValue110_496_0;
    boolean spill110_0;
    boolean spill110_1;
    int spill110_2;
    boolean spill110_3;
    boolean spill110_4;
    java.lang.String spill110_5;
    com.moon.mF spill110_6;
    com.moon.mF spill110_7;
    boolean spill110_8;
    int spill110_9;
    int[] spill110_10;
    int[] spill110_11;
    int[] spill110_12;
    int[] spill110_13;
    int[] spill110_14;
    int[] spill110_15;
    int[] spill110_16;
    int[] spill110_17;
    boolean spill110_18;
    com.moon.mF spill110_19;
    boolean spill110_20;
    long life4_3;
    float life7_5;
    float life8_10;
    float life9_15;
    float life10_18;
    float life11_25;
    float life12_33;
    float life13_38;
    java.lang.String[] life14_40;
    int life15_43;
    int life16_45;
    int life6_46;
    java.lang.String life17_53;
    float life18_61;
    java.lang.String life19_98;
    int life20_100;
    java.lang.String life21_147;
    java.lang.String life21_163;
    java.lang.String life21_176;
    java.awt.Color life22_205;
    float[] life23_208;
    float life14_272;
    float life15_278;
    int[] life16_340;
    int life17_342;
    int life18_350;
    float life19_357;
    float life20_359;
    float life21_361;
    java.awt.Color life22_401;
    float[] life23_404;
    float life17_432;
    float life18_434;
    float life19_448;
    float life20_453;
    float life21_476;
    float life22_478;
    float life23_487;
    float life24_492;
    forest_join_496: {
    forest_join_491: {
    forest_join_455: {
    forest_join_454: {
    forest_join_417: {
    forest_join_370: {
    forest_join_254: {
    forest_join_253: {
    forest_join_250: {
    forest_join_249: {
    forest_join_248: {
    forest_join_240: {
    forest_join_228: {
    forest_join_227: {
    forest_join_226: {
    forest_join_169: {
    forest_join_166: {
    forest_join_152: {
    forest_join_134: {
    forest_join_131: {
    forest_join_130: {
    forest_join_118: {
    forest_join_104: {
    forest_join_95: {
    life4_3 = (__fieldRead110_0() ^ 9152085702073L);
    life7_5 = 0x1.4p2f;
    life8_10 = (__fieldRead110_1(receiver) + 0x1.8p1f);
    life9_15 = (__fieldRead110_2(receiver) - 0x1.8p2f);
    spill110_0 = __call110_3();
    life10_18 = 0x1.2p4f;
    life11_25 = ((__call110_4(receiver) + 0x1.8p1f) + 0x1.2p4f);
    life12_33 = ((__call110_5(receiver) + __fieldRead110_6(receiver)) + life7_5);
    life13_38 = (__call110_7(receiver) + 0x1.98p6f);
    life14_40 = __fieldRead110_8();
    life15_43 = (life14_40).length;
    life16_45 = 0;
    life6_46 = __integerCategory110_9(spill110_0);
    forest_cycle_47: while (true) {
    forest_join_92: {
    forest_join_85: {
    if (!((life16_45 < life15_43))) {
        break forest_join_228;
    }
    life17_53 = (life14_40)[life16_45];
    life18_61 = (__call110_11(__fieldRead110_10(receiver), life17_53, 0x1.a428f6p2f) + 0x1.0p2f);
    if (!((life6_46 == 0))) {
        break forest_join_92;
    }
    spill110_1 = __call110_14(receiver, p0, p1, life12_33, (life13_38 + 0x1.0p-2f), (life18_61 + 0x1.0p2f), (__call110_13(__fieldRead110_12(receiver), 0x1.a428f6p2f) + 0x1.0p2f));
    if (!((life6_46 == 0))) {
        forestValue110_240_0 = __integerCategory110_15(spill110_1);
        break forest_join_240;
    }
    if (!(spill110_1)) {
        break forest_join_85;
    }
    break forest_join_95;
    }
    life12_33 = (life12_33 + (life18_61 + 0x1.8p2f));
    life16_45 += 1;
    }
    if (!((life6_46 != 0))) {
        continue forest_cycle_47;
    }
    break forest_cycle_47;
    }
    break forest_join_228;
    }
    life19_98 = life17_53;
    life20_100 = -1;
    spill110_2 = __call110_16(life19_98);
    if (!((life6_46 == 0))) {
        forestValue110_131_0 = spill110_2;
        break forest_join_131;
    }
    switch (spill110_2) {
case 2106261:
{
        break forest_join_104;
    }
case 76885619:
{
        break forest_join_118;
    }
default:
{
        break forest_join_130;
    }
}
    }
    spill110_3 = __call110_18(life19_98, __invokedynamic110_17(14450, (2018764815960016583L ^ life4_3)));
    if (!((life6_46 == 0))) {
        forestValue110_131_0 = __integerCategory110_19(spill110_3);
        break forest_join_131;
    }
    if (!(spill110_3)) {
        break forest_join_130;
    }
    life20_100 = 0;
    if (!((life6_46 != 0))) {
        break forest_join_130;
    }
    }
    spill110_4 = __call110_21(life19_98, __invokedynamic110_20(7587, (4039795999914763028L ^ life4_3)));
    if (!((life6_46 == 0))) {
        forestValue110_131_0 = __integerCategory110_22(spill110_4);
        break forest_join_131;
    }
    if (!(spill110_4)) {
        break forest_join_130;
    }
    life20_100 = 1;
    }
    forestValue110_131_0 = life20_100;
    }
    if (!((life6_46 == 0))) {
        forestValue110_227_0 = forestValue110_131_0;
        break forest_join_227;
    }
    switch (forestValue110_131_0) {
case 0:
{
        break forest_join_134;
    }
case 1:
{
        break forest_join_152;
    }
default:
{
        break forest_join_226;
    }
}
    }
    life21_147 = __invokedynamic110_28(__call110_27(__call110_26(__cast110_25(__call110_24(__fieldRead110_23(receiver))))));
    __call110_31(__call110_30(__call110_29()), new java.awt.datatransfer.StringSelection(life21_147), null);
    if (!((life6_46 != 0))) {
        break forest_join_226;
    }
    }
    life21_163 = __call110_36(__call110_35(__call110_33(__call110_32()), __fieldRead110_34()));
    spill110_5 = life21_163;
    if (!((life6_46 == 0))) {
        forestValue110_169_0 = spill110_5;
        break forest_join_169;
    }
    if (!((!__call110_37(spill110_5, "#")))) {
        break forest_join_166;
    }
    return __integerCategory110_38(0);
    }
    forestValue110_169_0 = __call110_39(life21_163, 1);
    }
    life21_176 = forestValue110_169_0;
    __call110_44(__fieldRead110_40(receiver), __call110_43(((int) __call110_42(life21_176, __invokedynamic110_41(3554, (8599222913477912368L ^ life4_3))))));
    __fieldWrite110_50(receiver, __call110_49(__call110_48(__cast110_47(__call110_46(__fieldRead110_45(receiver))))));
    life22_205 = new java.awt.Color(__call110_54(__cast110_53(__call110_52(__fieldRead110_51(receiver)))));
    life23_208 = new float[3];
    __call110_58(__call110_55(life22_205), __call110_56(life22_205), __call110_57(life22_205), life23_208);
    __fieldWrite110_59(receiver, (life23_208)[0]);
    __fieldWrite110_60(receiver, (life23_208)[2]);
    __fieldWrite110_61(receiver, (life23_208)[1]);
    }
    forestValue110_227_0 = 0;
    }
    return __integerCategory110_62(forestValue110_227_0);
    }
    spill110_6 = receiver;
    if (!((life6_46 == 0))) {
        forestValue110_254_0 = spill110_6;
        break forest_join_254;
    }
    forestValue110_240_0 = __integerCategory110_64(__call110_63(spill110_6, p0, p1, life8_10, (life11_25 - 0x1.2p4f), life9_15, 0x1.2p4f));
    }
    if (!((forestValue110_240_0 != 0))) {
        break forest_join_253;
    }
    spill110_7 = receiver;
    spill110_8 = __fieldRead110_65(receiver);
    if (!((life6_46 == 0))) {
        forestValue110_248_0 = spill110_7;
        forestValue110_248_1 = __integerCategory110_66(spill110_8);
        break forest_join_248;
    }
    if (!((!spill110_8))) {
        forestValue110_249_0 = spill110_7;
        break forest_join_249;
    }
    forestValue110_248_0 = spill110_7;
    forestValue110_248_1 = 1;
    }
    forestValue110_250_0 = forestValue110_248_0;
    forestValue110_250_1 = forestValue110_248_1;
    break forest_join_250;
    }
    forestValue110_250_0 = forestValue110_249_0;
    forestValue110_250_1 = 0;
    }
    __fieldWrite110_67(forestValue110_250_0, forestValue110_250_1);
    if (!((life6_46 != 0))) {
        break forest_join_491;
    }
    }
    forestValue110_254_0 = receiver;
    }
    life14_272 = ((__fieldRead110_68(forestValue110_254_0) + __fieldRead110_69(receiver)) + life7_5);
    spill110_9 = 32718;
    life15_278 = (__fieldRead110_70(receiver) + 0x1.68p6f);
    int[] __stackOp110_72_0 = new int[__invokedynamic110_71(spill110_9, (4355087717798237466L ^ life4_3))];
    spill110_10 = __stackOp110_72_0;
    (__stackOp110_72_0)[0] = __call110_74(__fieldRead110_73(receiver));
    int[] __stackOp110_75_0 = spill110_10;
    spill110_11 = __stackOp110_75_0;
    (__stackOp110_75_0)[1] = __call110_77(__fieldRead110_76(receiver));
    int[] __stackOp110_78_0 = spill110_11;
    spill110_12 = __stackOp110_78_0;
    (__stackOp110_78_0)[2] = __call110_80(__fieldRead110_79(receiver));
    int[] __stackOp110_81_0 = spill110_12;
    spill110_13 = __stackOp110_81_0;
    (__stackOp110_81_0)[3] = __call110_83(__fieldRead110_82(receiver));
    int[] __stackOp110_84_0 = spill110_13;
    spill110_14 = __stackOp110_84_0;
    (__stackOp110_84_0)[4] = __call110_86(__fieldRead110_85(receiver));
    int[] __stackOp110_87_0 = spill110_14;
    spill110_15 = __stackOp110_87_0;
    (__stackOp110_87_0)[5] = __call110_89(__fieldRead110_88(receiver));
    int[] __stackOp110_90_0 = spill110_15;
    spill110_16 = __stackOp110_90_0;
    (__stackOp110_90_0)[__invokedynamic110_91(13680, (329334166569557923L ^ life4_3))] = __call110_93(__fieldRead110_92(receiver));
    int[] __stackOp110_94_0 = spill110_16;
    spill110_17 = __stackOp110_94_0;
    (__stackOp110_94_0)[__invokedynamic110_95(23906, (6869361449265985463L ^ life4_3))] = __call110_97(__fieldRead110_96(receiver));
    life16_340 = spill110_17;
    life17_342 = 0;
    forest_cycle_331: while (true) {
    forest_join_367: {
    forest_join_366: {
    if (!((life17_342 < (life16_340).length))) {
        break forest_join_417;
    }
    life18_350 = (life16_340)[life17_342];
    life19_357 = (life14_272 + (((float) life17_342) * 0x1.6p3f));
    life20_359 = 0x1.2p3f;
    life21_361 = 0x1.2p3f;
    if (!((life6_46 == 0))) {
        break forest_join_367;
    }
    spill110_18 = __call110_98(receiver, p0, p1, life19_357, (life15_278 + 0x1.0p-2f), life20_359, life21_361);
    if (!((life6_46 == 0))) {
        forestValue110_496_0 = __integerCategory110_99(spill110_18);
        break forest_join_496;
    }
    if (!(spill110_18)) {
        break forest_join_366;
    }
    break forest_join_370;
    }
    life17_342 += 1;
    }
    if (!((life6_46 != 0))) {
        continue forest_cycle_331;
    }
    break forest_cycle_331;
    }
    break forest_join_417;
    }
    __call110_102(__fieldRead110_100(receiver), __call110_101(life18_350));
    __fieldWrite110_108(receiver, __call110_107(__call110_106(__cast110_105(__call110_104(__fieldRead110_103(receiver))))));
    life22_401 = new java.awt.Color(life18_350);
    life23_404 = new float[3];
    __call110_112(__call110_109(life22_401), __call110_110(life22_401), __call110_111(life22_401), life23_404);
    __fieldWrite110_113(receiver, (life23_404)[0]);
    __fieldWrite110_114(receiver, (life23_404)[2]);
    __fieldWrite110_115(receiver, (life23_404)[1]);
    return __integerCategory110_116(0);
    }
    life17_432 = 0x1.0p2f;
    life18_434 = 0x1.0cp6f;
    life19_448 = (((__fieldRead110_117(receiver) + __call110_118(receiver)) - ((life7_5 * 0x1.0p1f) + 0x1.0p0f)) - 0x1.0p2f);
    life20_453 = (__call110_119(receiver) + 0x1.3p4f);
    spill110_19 = receiver;
    if (!((life6_46 == 0))) {
        forestValue110_455_0 = spill110_19;
        break forest_join_455;
    }
    if (!(__call110_120(spill110_19, p0, p1, life19_448, life20_453, 0x1.0p2f, 0x1.0cp6f))) {
        break forest_join_454;
    }
    __fieldWrite110_121(receiver, 1);
    }
    forestValue110_455_0 = receiver;
    }
    life21_476 = ((__call110_122(forestValue110_455_0) - 0x1.9p4f) - 0x1.0p3f);
    life22_478 = 0x1.0cp6f;
    life23_487 = (__fieldRead110_123(receiver) + ((life7_5 * 0x1.0p1f) + 0x1.0p0f));
    life24_492 = (__call110_124(receiver) + 0x1.3p4f);
    spill110_20 = __call110_125(receiver, p0, p1, life23_487, life24_492, life21_476, 0x1.0cp6f);
    if (!((life6_46 == 0))) {
        forestValue110_496_0 = __integerCategory110_126(spill110_20);
        break forest_join_496;
    }
    if (!(spill110_20)) {
        break forest_join_491;
    }
    __fieldWrite110_127(receiver, 1);
    }
    forestValue110_496_0 = __integerCategory110_129(__call110_128(receiver, p0, p1, p2));
    }
    return __integerCategory110_130(forestValue110_496_0);
}
public static boolean h110_0(java.lang.Exception p0) throws Throwable {
    throw __call3011000_0(p0);
}
public static boolean h110_1(java.lang.Exception p0) throws Throwable {
    throw __call3011001_0(p0);
}
public static boolean h110_2(java.lang.Exception p0) throws Throwable {
    throw __call3011002_0(p0);
}
public static boolean h110_3(java.lang.Exception p0) throws Throwable {
    throw __call3011003_0(p0);
}
public static boolean h110_4(java.lang.Exception p0) throws Throwable {
    throw __call3011004_0(p0);
}
public static boolean h110_5(java.lang.Exception p0) throws Throwable {
    throw __call3011005_0(p0);
}
public static boolean h110_6(java.lang.Exception p0) throws Throwable {
    throw __call3011006_0(p0);
}
public static boolean h110_7(java.lang.Exception p0) throws Throwable {
    throw __call3011007_0(p0);
}
public static boolean h110_8(java.lang.Exception p0) throws Throwable {
    throw __call3011008_0(p0);
}
public static boolean h110_9(java.lang.Exception p0) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    return __integerCategory3011009_0(0);
}
public static boolean h110_10(java.lang.Exception p0) throws Throwable {
    throw __call3011010_0(p0);
}
public static boolean h110_11(java.lang.Exception p0) throws Throwable {
    throw __call3011011_0(p0);
}
public static boolean h110_12(java.lang.Exception p0) throws Throwable {
    throw __call3011012_0(p0);
}
public static boolean h110_13(java.lang.Exception p0) throws Throwable {
    throw __call3011013_0(p0);
}
public static boolean h110_14(java.lang.Exception p0) throws Throwable {
    throw __call3011014_0(p0);
}
public static boolean h110_15(java.lang.Exception p0) throws Throwable {
    throw __call3011015_0(p0);
}
public static boolean h110_16(java.lang.Exception p0) throws Throwable {
    throw __call3011016_0(p0);
}
public static boolean h110_17(java.lang.Exception p0) throws Throwable {
    throw __call3011017_0(p0);
}
public static boolean h110_18(java.lang.Exception p0) throws Throwable {
    throw __call3011018_0(p0);
}
public static boolean h110_19(java.lang.Exception p0) throws Throwable {
    throw __call3011019_0(p0);
}
private static native long __fieldRead110_0() throws Throwable;
private static native float __fieldRead110_1(com.moon.mF a0) throws Throwable;
private static native float __fieldRead110_2(com.moon.mF a0) throws Throwable;
private static native boolean __call110_3() throws Throwable;
private static native float __call110_4(com.moon.mF a0) throws Throwable;
private static native float __call110_5(com.moon.mF a0) throws Throwable;
private static native float __fieldRead110_6(com.moon.mF a0) throws Throwable;
private static native float __call110_7(com.moon.mF a0) throws Throwable;
private static native java.lang.String[] __fieldRead110_8() throws Throwable;
private static native int __integerCategory110_9(boolean value) throws Throwable;
private static native com.moon.jm __fieldRead110_10(com.moon.mF a0) throws Throwable;
private static native float __call110_11(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native com.moon.jm __fieldRead110_12(com.moon.mF a0) throws Throwable;
private static native float __call110_13(com.moon.jm a0, float a1) throws Throwable;
private static native boolean __call110_14(com.moon.mF a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory110_15(boolean value) throws Throwable;
private static native int __call110_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic110_17(int a0, long a1) throws Throwable;
private static native boolean __call110_18(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory110_19(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic110_20(int a0, long a1) throws Throwable;
private static native boolean __call110_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory110_22(boolean value) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead110_23(com.moon.mF a0) throws Throwable;
private static native java.lang.Object __call110_24(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast110_25(java.lang.Object a0) throws Throwable;
private static native int __call110_26(java.lang.Integer a0) throws Throwable;
private static native java.lang.String __call110_27(int a0) throws Throwable;
private static native java.lang.String __invokedynamic110_28(java.lang.String a0) throws Throwable;
private static native java.awt.Toolkit __call110_29() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call110_30(java.awt.Toolkit a0) throws Throwable;
private static native void __call110_31(java.awt.datatransfer.Clipboard a0, java.awt.datatransfer.StringSelection a1, java.lang.Object a2) throws Throwable;
private static native java.awt.Toolkit __call110_32() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call110_33(java.awt.Toolkit a0) throws Throwable;
private static native java.awt.datatransfer.DataFlavor __fieldRead110_34() throws Throwable;
private static native java.lang.Object __call110_35(java.awt.datatransfer.Clipboard a0, java.awt.datatransfer.DataFlavor a1) throws Throwable;
private static native java.lang.String __call110_36(java.lang.Object a0) throws Throwable;
private static native boolean __call110_37(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory110_38(int value) throws Throwable;
private static native java.lang.String __call110_39(java.lang.String a0, int a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead110_40(com.moon.mF a0) throws Throwable;
private static native int __invokedynamic110_41(int a0, long a1) throws Throwable;
private static native long __call110_42(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Integer __call110_43(int a0) throws Throwable;
private static native void __call110_44(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead110_45(com.moon.mF a0) throws Throwable;
private static native java.lang.Object __call110_46(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast110_47(java.lang.Object a0) throws Throwable;
private static native int __call110_48(java.lang.Integer a0) throws Throwable;
private static native com.v __call110_49(int a0) throws Throwable;
private static native void __fieldWrite110_50(com.moon.mF a0, com.v a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead110_51(com.moon.mF a0) throws Throwable;
private static native java.lang.Object __call110_52(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast110_53(java.lang.Object a0) throws Throwable;
private static native int __call110_54(java.lang.Integer a0) throws Throwable;
private static native int __call110_55(java.awt.Color a0) throws Throwable;
private static native int __call110_56(java.awt.Color a0) throws Throwable;
private static native int __call110_57(java.awt.Color a0) throws Throwable;
private static native float[] __call110_58(int a0, int a1, int a2, float[] a3) throws Throwable;
private static native void __fieldWrite110_59(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite110_60(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite110_61(com.moon.mF a0, float a1) throws Throwable;
private static native boolean __integerCategory110_62(int value) throws Throwable;
private static native boolean __call110_63(com.moon.mF a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory110_64(boolean value) throws Throwable;
private static native boolean __fieldRead110_65(com.moon.mF a0) throws Throwable;
private static native int __integerCategory110_66(boolean value) throws Throwable;
private static native void __fieldWrite110_67(com.moon.mF a0, int a1) throws Throwable;
private static native float __fieldRead110_68(com.moon.mF a0) throws Throwable;
private static native float __fieldRead110_69(com.moon.mF a0) throws Throwable;
private static native float __fieldRead110_70(com.moon.mF a0) throws Throwable;
private static native int __invokedynamic110_71(int a0, long a1) throws Throwable;
private static native com.v __fieldRead110_73(com.moon.mF a0) throws Throwable;
private static native int __call110_74(com.v a0) throws Throwable;
private static native com.v __fieldRead110_76(com.moon.mF a0) throws Throwable;
private static native int __call110_77(com.v a0) throws Throwable;
private static native com.v __fieldRead110_79(com.moon.mF a0) throws Throwable;
private static native int __call110_80(com.v a0) throws Throwable;
private static native com.v __fieldRead110_82(com.moon.mF a0) throws Throwable;
private static native int __call110_83(com.v a0) throws Throwable;
private static native com.v __fieldRead110_85(com.moon.mF a0) throws Throwable;
private static native int __call110_86(com.v a0) throws Throwable;
private static native com.v __fieldRead110_88(com.moon.mF a0) throws Throwable;
private static native int __call110_89(com.v a0) throws Throwable;
private static native int __invokedynamic110_91(int a0, long a1) throws Throwable;
private static native com.v __fieldRead110_92(com.moon.mF a0) throws Throwable;
private static native int __call110_93(com.v a0) throws Throwable;
private static native int __invokedynamic110_95(int a0, long a1) throws Throwable;
private static native com.v __fieldRead110_96(com.moon.mF a0) throws Throwable;
private static native int __call110_97(com.v a0) throws Throwable;
private static native boolean __call110_98(com.moon.mF a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory110_99(boolean value) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead110_100(com.moon.mF a0) throws Throwable;
private static native java.lang.Integer __call110_101(int a0) throws Throwable;
private static native void __call110_102(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead110_103(com.moon.mF a0) throws Throwable;
private static native java.lang.Object __call110_104(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast110_105(java.lang.Object a0) throws Throwable;
private static native int __call110_106(java.lang.Integer a0) throws Throwable;
private static native com.v __call110_107(int a0) throws Throwable;
private static native void __fieldWrite110_108(com.moon.mF a0, com.v a1) throws Throwable;
private static native int __call110_109(java.awt.Color a0) throws Throwable;
private static native int __call110_110(java.awt.Color a0) throws Throwable;
private static native int __call110_111(java.awt.Color a0) throws Throwable;
private static native float[] __call110_112(int a0, int a1, int a2, float[] a3) throws Throwable;
private static native void __fieldWrite110_113(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite110_114(com.moon.mF a0, float a1) throws Throwable;
private static native void __fieldWrite110_115(com.moon.mF a0, float a1) throws Throwable;
private static native boolean __integerCategory110_116(int value) throws Throwable;
private static native float __fieldRead110_117(com.moon.mF a0) throws Throwable;
private static native float __call110_118(com.moon.mF a0) throws Throwable;
private static native float __call110_119(com.moon.mF a0) throws Throwable;
private static native boolean __call110_120(com.moon.mF a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native void __fieldWrite110_121(com.moon.mF a0, int a1) throws Throwable;
private static native float __call110_122(com.moon.mF a0) throws Throwable;
private static native float __fieldRead110_123(com.moon.mF a0) throws Throwable;
private static native float __call110_124(com.moon.mF a0) throws Throwable;
private static native boolean __call110_125(com.moon.mF a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory110_126(boolean value) throws Throwable;
private static native void __fieldWrite110_127(com.moon.mF a0, int a1) throws Throwable;
private static native boolean __call110_128(com.moon.mF a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory110_129(boolean value) throws Throwable;
private static native boolean __integerCategory110_130(int value) throws Throwable;
private static native java.lang.Exception __call3011000_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011001_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011002_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011003_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011004_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011005_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011006_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011007_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011008_0(java.lang.Exception a0) throws Throwable;
private static native boolean __integerCategory3011009_0(int value) throws Throwable;
private static native java.lang.Exception __call3011010_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011011_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011012_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011013_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011014_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011015_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011016_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011017_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011018_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3011019_0(java.lang.Exception a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2178_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int n6 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7B44;
        if (I[n6] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l3 = H[n6];
            byte[] byArray3 = new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3};
            Long l4 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])J.get(l4);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    J.put(l4, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/mF", exception);
            }
            int n7 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            mF.I[n6] = n7;
        }
        return I[n6];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.mF.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void e__sourceReturn_da8c82d5d4() { __sourceHandlerCall_12415f55d608ff566853(this); }


private void c(int p0, int p1) { __sourceHandlerCall_e2202a5821839671c62e(this, p0, p1); }


public void f__sourceReturn_da8c82d5d4() { __sourceHandlerCall_3471510615e399a6fa9f(this); }


private void d__sourceReturn_da8c82d5d4() { __sourceHandlerCall_96cc31c33afebe88988e(this); }


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28448);
    if (((com.moon.mF.F)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.mF.G)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.mF.G)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/mF", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.mF.E)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.mF.F)[life5_8] = com.moon.mF.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.mF.F)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.mF.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2184_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mF"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean a__Boolean(int p0, int p1, int p2) { return __sourceHandlerCall_fab38625c482fa13e3a9(this, p0, p1, p2); }


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.ColorSetting)(this.u)).isAvailable())) != 0);
}


public void a(int p0, int p1) { __sourceHandlerCall_8f2e6459e836bb40b218(this, p0, p1); }


private void a(int p0) { __sourceHandlerCall_4986dd4efa425eae9e80(this, p0); }


public void a(int p0, int p1, int p2) {
this.w = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    this.x = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    super.a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


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
        byte[] spill924_0 = p0;
        life4_9 += 1;
        life5_44 = (spill924_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill924_1 = p0;
        life4_9 += 1;
        life5_76 = (spill924_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill924_2 = p0;
        life4_9 += 1;
        life5_91 = (spill924_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void g__sourceReturn_da8c82d5d4() { __sourceHandlerCall_932f582169320f786852(this); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite240_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite240_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2184_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2178_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
