package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class m9 extends com.moon.m5 {

private com.moon.setting.ColorSetting n;

private com.moon.nY o;

private boolean p;

private boolean q;

private float r;

private float s;

private int t;

private float u;

private static long v;

private static java.lang.String[] w;

private static java.lang.String[] x;

private static java.util.Map y;

private static long[] z;

private static java.lang.Integer[] A;

private static java.util.Map B;

private static long C;

public m9(com.moon.nh p0, com.moon.setting.ColorSetting p1, float p2, float p3, float p4, float p5) { super((com.moon.nh)null, 0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_46447243764c5a18(com.moon.m9 receiver, com.moon.nh p0, com.moon.setting.ColorSetting p1, float p2, float p3, float p4, float p5) throws Throwable {
long local7 = (com.moon.m9.v ^ 9220539547756L);
    com.moon.m9.__sourceConstructorInit_46447243764c5a18_0(((com.moon.m9)(receiver)), ((com.moon.nh)(p0)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)));
    ((com.moon.m9)(receiver)).o = ((com.moon.nY)(new com.moon.nY(com.moon.m9.C, com.moon.cj.EASE_IN_OUT_CUBIC)));
    ((com.moon.m9)(receiver)).n = ((com.moon.setting.ColorSetting)(p1));
    ((com.moon.nY)(((com.moon.m9)(receiver)).o)).b__Void();
    return;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(1682196298142395159L)), ((long)(2878762827302660165L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(65514697499719L)))));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (com.moon.m9.v ^ 111037368600199L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill238_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill238_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill238_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill238_14 = new byte[8];
    (__sourceSpill238_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill238_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation238_16 = __sourceSpill238_14;
    ((javax.crypto.Cipher)(__sourceSpill238_11)).init(((int)(__sourceSpill238_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill238_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation238_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[4];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "6G\003¶1ý.Ã\017æe5þ6\020Ëê\003\035%A1\006¾jf\033JàÊÿ"))).length();
    int local21_life24 = 16;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill238_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill238_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill238_29)).doFinal(((byte[])(__sourceSpill238_28)));
        java.lang.String __sourceSpill238_34 = ((java.lang.String)(com.moon.m9.a(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill238_35 = local25_life19;
        int __sourceSpill238_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill238_35)[__sourceSpill238_36] = __sourceSpill238_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    local24_life23 = ((java.lang.String)((local22_life21 = "\r\r\b\013ê·¬²Hý'Uaò¥ß\020Ê\007£~\035ôÎÍë³\006\"\034V"))).length();
    local21_life24 = 16;
    local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill238_41 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill238_42 = local18_life9;
        byte[] local26_life44 = ((javax.crypto.Cipher)(__sourceSpill238_42)).doFinal(((byte[])(__sourceSpill238_41)));
        java.lang.String __sourceSpill238_47 = ((java.lang.String)(com.moon.m9.a(((byte[])(local26_life44))))).intern();
        java.lang.String[] __sourceSpill238_48 = local25_life19;
        int __sourceSpill238_49 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill238_48)[__sourceSpill238_49] = __sourceSpill238_47;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    w = ((java.lang.String[])(local25_life19));
    x = ((java.lang.String[])(new java.lang.String[4]));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life55;
    javax.crypto.Cipher __sourceSpill238_57 = (local5_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill238_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill238_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill238_60 = new byte[8];
    (__sourceSpill238_60)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local6_life61 = 1;
    while ((local6_life61 < 8)) {
        (__sourceSpill238_60)[local6_life61] = ((byte) ((int) ((local16_life7 << (local6_life61 * 8)) >>> 56)));
        local6_life61 += 1;
    }
    byte[] __sourcePreallocation238_62 = __sourceSpill238_60;
    ((javax.crypto.Cipher)(__sourceSpill238_57)).init(((int)(__sourceSpill238_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill238_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation238_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life65 = new long[11];
    int local8_life66 = 0;
    java.lang.String local9_life67;
    int local10_life69 = ((java.lang.String)((local9_life67 = "H°¸`|<¯\r\035§þ\027ðÄ\0373VÜÑ{SP\023*Ò.·&d\007ò%ºÐQÂ{6ýö¯\177mæìYGn\036m}=j|Pð/·õ\003Zr/¿"))).length();
    int local7_life70 = 0;
    do {
        java.lang.String __sourceSpill238_71 = local9_life67;
        int __sourceSpill238_72 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill238_71)).substring(((int)(__sourceSpill238_72)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill238_76 = local11_life65;
        int __sourceSpill238_77 = local8_life66;
        local8_life66 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill238_79 = new byte[8];
        (__sourceSpill238_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill238_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill238_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill238_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill238_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill238_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill238_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill238_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill238_80 = local5_life55;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill238_80)).doFinal(((byte[])(__sourceSpill238_79)));
        (__sourceSpill238_76)[__sourceSpill238_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    local10_life69 = ((java.lang.String)((local9_life67 = "q#Ü\022\031fÐñknbX\re"))).length();
    local7_life70 = 0;
    do {
        java.lang.String __sourceSpill238_84 = local9_life67;
        int __sourceSpill238_85 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill238_84)).substring(((int)(__sourceSpill238_85)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill238_89 = local11_life65;
        int __sourceSpill238_90 = local8_life66;
        local8_life66 += 1;
        long local13_life91 = (((((((((((long) (local12_life88)[0]) & 255L) << 56) | ((((long) (local12_life88)[1]) & 255L) << 48)) | ((((long) (local12_life88)[2]) & 255L) << 40)) | ((((long) (local12_life88)[3]) & 255L) << 32)) | ((((long) (local12_life88)[4]) & 255L) << 24)) | ((((long) (local12_life88)[5]) & 255L) << 16)) | ((((long) (local12_life88)[6]) & 255L) << 8)) | (((long) (local12_life88)[7]) & 255L));
        byte[] __sourceSpill238_92 = new byte[8];
        (__sourceSpill238_92)[0] = ((byte) ((int) (local13_life91 >>> 56)));
        (__sourceSpill238_92)[1] = ((byte) ((int) (local13_life91 >>> 48)));
        (__sourceSpill238_92)[2] = ((byte) ((int) (local13_life91 >>> 40)));
        (__sourceSpill238_92)[3] = ((byte) ((int) (local13_life91 >>> 32)));
        (__sourceSpill238_92)[4] = ((byte) ((int) (local13_life91 >>> 24)));
        (__sourceSpill238_92)[5] = ((byte) ((int) (local13_life91 >>> 16)));
        (__sourceSpill238_92)[6] = ((byte) ((int) (local13_life91 >>> 8)));
        (__sourceSpill238_92)[7] = ((byte) ((int) local13_life91));
        javax.crypto.Cipher __sourceSpill238_93 = local5_life55;
        byte[] local15_life95 = ((javax.crypto.Cipher)(__sourceSpill238_93)).doFinal(((byte[])(__sourceSpill238_92)));
        (__sourceSpill238_89)[__sourceSpill238_90] = (((((((((((long) (local15_life95)[0]) & 255L) << 56) | ((((long) (local15_life95)[1]) & 255L) << 48)) | ((((long) (local15_life95)[2]) & 255L) << 40)) | ((((long) (local15_life95)[3]) & 255L) << 32)) | ((((long) (local15_life95)[4]) & 255L) << 24)) | ((((long) (local15_life95)[5]) & 255L) << 16)) | ((((long) (local15_life95)[6]) & 255L) << 8)) | (((long) (local15_life95)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    z = ((long[])(local11_life65));
    A = ((java.lang.Integer[])(new java.lang.Integer[11]));
    javax.crypto.Cipher local0_life99;
    javax.crypto.Cipher __sourceSpill238_101 = (local0_life99 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill238_102 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill238_103 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill238_104 = new byte[8];
    (__sourceSpill238_104)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life105 = 1;
    while ((local1_life105 < 8)) {
        (__sourceSpill238_104)[local1_life105] = ((byte) ((int) ((local16_life7 << (local1_life105 * 8)) >>> 56)));
        local1_life105 += 1;
    }
    byte[] __sourcePreallocation238_106 = __sourceSpill238_104;
    ((javax.crypto.Cipher)(__sourceSpill238_101)).init(((int)(__sourceSpill238_102)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill238_103)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation238_106)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life109 = 4584888489926494975L;
    byte[] __sourceSpill238_110 = new byte[8];
    (__sourceSpill238_110)[0] = ((byte) ((int) (local2_life109 >>> 56)));
    (__sourceSpill238_110)[1] = ((byte) ((int) (local2_life109 >>> 48)));
    (__sourceSpill238_110)[2] = ((byte) ((int) (local2_life109 >>> 40)));
    (__sourceSpill238_110)[3] = ((byte) ((int) (local2_life109 >>> 32)));
    (__sourceSpill238_110)[4] = ((byte) ((int) (local2_life109 >>> 24)));
    (__sourceSpill238_110)[5] = ((byte) ((int) (local2_life109 >>> 16)));
    (__sourceSpill238_110)[6] = ((byte) ((int) (local2_life109 >>> 8)));
    (__sourceSpill238_110)[7] = ((byte) ((int) local2_life109));
    javax.crypto.Cipher __sourceSpill238_111 = local0_life99;
    byte[] local4_life113 = ((javax.crypto.Cipher)(__sourceSpill238_111)).doFinal(((byte[])(__sourceSpill238_110)));
    C = ((long)((((((((((((long) (local4_life113)[0]) & 255L) << 56) | ((((long) (local4_life113)[1]) & 255L) << 48)) | ((((long) (local4_life113)[2]) & 255L) << 40)) | ((((long) (local4_life113)[3]) & 255L) << 32)) | ((((long) (local4_life113)[4]) & 255L) << 24)) | ((((long) (local4_life113)[5]) & 255L) << 16)) | ((((long) (local4_life113)[6]) & 255L) << 8)) | (((long) (local4_life113)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_46447243764c5a18_0(com.moon.m9 a0, com.moon.nh a1, float a2, float a3, float a4, float a5) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_42ed2cf7c97d69fc7b1d(com.moon.m9 a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_42ed2cf7c97d69fc7b1d {

public static void f100026(com.moon.m9 receiver, int p0, int p1, int p2) throws Throwable {
    com.moon.nY forestValue100026_48_0;
    com.moon.nY forestValue100026_49_0;
    float forestValue100026_49_1;
    com.moon.m9 forestValue100026_57_0;
    int forestValue100026_57_1;
    com.moon.m9 forestValue100026_58_0;
    com.moon.m9 forestValue100026_59_0;
    int forestValue100026_59_1;
    int forestValue100026_61_0;
    int forestValue100026_166_0;
    int forestValue100026_174_0;
    java.lang.String forestValue100026_203_0;
    int forestValue100026_243_0;
    com.moon.m9 forestValue100026_250_0;
    int forestValue100026_250_1;
    int forestValue100026_250_2;
    net.minecraft.entity.Entity[] spill100026_0;
    boolean spill100026_1;
    com.moon.nY spill100026_2;
    com.moon.m9 spill100026_3;
    boolean spill100026_4;
    java.lang.String[] spill100026_5;
    java.lang.String[] spill100026_6;
    boolean spill100026_7;
    int spill100026_8;
    boolean spill100026_9;
    boolean spill100026_10;
    java.awt.datatransfer.Clipboard spill100026_11;
    java.awt.datatransfer.StringSelection spill100026_12;
    java.lang.String spill100026_13;
    com.moon.m9 spill100026_14;
    int spill100026_15;
    int spill100026_16;
    long life4_3;
    float life7_8;
    float life8_14;
    net.minecraft.entity.Entity[] life6_15;
    float life9_20;
    com.moon.jm life10_25;
    java.lang.String[] life11_91;
    float life12_93;
    java.lang.String[] life13_95;
    int life14_98;
    int life15_100;
    java.lang.String life16_109;
    float life17_116;
    float life18_122;
    java.lang.String life19_153;
    int life20_155;
    java.lang.String life21_212;
    java.lang.String life21_229;
    java.lang.String life21_242;
    forest_join_250: {
    forest_join_247: {
    forest_join_243: {
    forest_join_227: {
    forest_join_226: {
    forest_join_61: {
    forest_join_60: {
    forest_join_59: {
    forest_join_58: {
    forest_join_57: {
    forest_join_49: {
    forest_join_48: {
    life4_3 = (__fieldRead100026_0() ^ 84537086240130L);
    life7_8 = (__call100026_1(receiver) + 0x1.0p3f);
    spill100026_0 = __call100026_2();
    life8_14 = (__call100026_3(receiver) + 0x1.2p2f);
    life6_15 = spill100026_0;
    life9_20 = (__call100026_4(receiver) - 0x1.0p4f);
    life10_25 = __call100026_8(__call100026_6(__call100026_5()), __fieldRead100026_7());
    spill100026_1 = __call100026_9(receiver, p0, p1, (life7_8 - 0x1.0p-1f), life8_14, (life9_20 + 0x1.0p0f), 0x1.1p4f);
    if (!((life6_15 == null))) {
        forestValue100026_61_0 = __integerCategory100026_10(spill100026_1);
        break forest_join_61;
    }
    if (!(spill100026_1)) {
        break forest_join_60;
    }
    spill100026_2 = __fieldRead100026_11(receiver);
    if (!(__fieldRead100026_12(receiver))) {
        forestValue100026_48_0 = spill100026_2;
        break forest_join_48;
    }
    forestValue100026_49_0 = spill100026_2;
    forestValue100026_49_1 = 0x1.0p0f;
    break forest_join_49;
    }
    forestValue100026_49_0 = forestValue100026_48_0;
    forestValue100026_49_1 = 0x0.0p0f;
    }
    __call100026_13(forestValue100026_49_0, forestValue100026_49_1);
    spill100026_3 = receiver;
    spill100026_4 = __fieldRead100026_14(receiver);
    if (!((life6_15 == null))) {
        forestValue100026_57_0 = spill100026_3;
        forestValue100026_57_1 = __integerCategory100026_15(spill100026_4);
        break forest_join_57;
    }
    if (!((!spill100026_4))) {
        forestValue100026_58_0 = spill100026_3;
        break forest_join_58;
    }
    forestValue100026_57_0 = spill100026_3;
    forestValue100026_57_1 = 1;
    }
    forestValue100026_59_0 = forestValue100026_57_0;
    forestValue100026_59_1 = forestValue100026_57_1;
    break forest_join_59;
    }
    forestValue100026_59_0 = forestValue100026_58_0;
    forestValue100026_59_1 = 0;
    }
    __fieldWrite100026_16(forestValue100026_59_0, forestValue100026_59_1);
    }
    forestValue100026_61_0 = 2;
    }
    java.lang.String[] __stackOp100026_17_0 = new java.lang.String[forestValue100026_61_0];
    spill100026_5 = __stackOp100026_17_0;
    (__stackOp100026_17_0)[0] = __invokedynamic100026_18(27772, (379924967221970446L ^ life4_3));
    java.lang.String[] __stackOp100026_19_0 = spill100026_5;
    spill100026_6 = __stackOp100026_19_0;
    (__stackOp100026_19_0)[1] = __invokedynamic100026_20(1829, (5536484725227334998L ^ life4_3));
    life11_91 = spill100026_6;
    life12_93 = 0x0.0p0f;
    life13_95 = life11_91;
    life14_98 = (life13_95).length;
    life15_100 = 0;
    forest_cycle_88: while (true) {
    forest_join_223: {
    forest_join_216: {
    forest_join_203: {
    forest_join_200: {
    forest_join_187: {
    forest_join_174: {
    forest_join_169: {
    forest_join_166: {
    forest_join_165: {
    forest_join_153: {
    forest_join_139: {
    if (!((life15_100 < life14_98))) {
        break forest_join_227;
    }
    life16_109 = (life13_95)[life15_100];
    life17_116 = (__call100026_21(life10_25, life16_109, 0x1.8p2f) + 0x1.4p2f);
    life18_122 = (__call100026_22(life10_25, 0x1.8p2f) + 0x1.0p2f);
    if (!((life6_15 == null))) {
        break forest_join_223;
    }
    spill100026_7 = __call100026_23(receiver, p0, p1, ((life7_8 + 0x1.0p1f) + life12_93), (life8_14 + 0x1.88p6f), life17_116, life18_122);
    if (!((life6_15 == null))) {
        forestValue100026_243_0 = __integerCategory100026_24(spill100026_7);
        break forest_join_243;
    }
    if (!(spill100026_7)) {
        break forest_join_216;
    }
    if (!(__fieldRead100026_25(receiver))) {
        break forest_join_216;
    }
    life19_153 = life16_109;
    life20_155 = -1;
    spill100026_8 = __call100026_26(life19_153);
    if (!((life6_15 == null))) {
        forestValue100026_166_0 = spill100026_8;
        break forest_join_166;
    }
    switch (spill100026_8) {
case 2106261:
{
        break forest_join_139;
    }
case 76885619:
{
        break forest_join_153;
    }
default:
{
        break forest_join_165;
    }
}
    }
    spill100026_9 = __call100026_28(life19_153, __invokedynamic100026_27(32274, (6039096850518430818L ^ life4_3)));
    if (!((life6_15 == null))) {
        forestValue100026_166_0 = __integerCategory100026_29(spill100026_9);
        break forest_join_166;
    }
    if (!(spill100026_9)) {
        break forest_join_165;
    }
    life20_155 = 0;
    if (!((life6_15 != null))) {
        break forest_join_165;
    }
    }
    spill100026_10 = __call100026_31(life19_153, __invokedynamic100026_30(7803, (8726438701650654218L ^ life4_3)));
    if (!((life6_15 == null))) {
        forestValue100026_166_0 = __integerCategory100026_32(spill100026_10);
        break forest_join_166;
    }
    if (!(spill100026_10)) {
        break forest_join_165;
    }
    life20_155 = 1;
    }
    forestValue100026_166_0 = life20_155;
    }
    if (!((life6_15 == null))) {
        forestValue100026_174_0 = forestValue100026_166_0;
        break forest_join_174;
    }
    switch (forestValue100026_166_0) {
case 0:
{
        break forest_join_169;
    }
case 1:
{
        break forest_join_187;
    }
default:
{
        break forest_join_216;
    }
}
    }
    forestValue100026_174_0 = __call100026_36(__cast100026_35(__call100026_34(__fieldRead100026_33(receiver))));
    }
    life21_212 = __invokedynamic100026_38(__call100026_37(forestValue100026_174_0));
    spill100026_11 = __call100026_40(__call100026_39());
    java.awt.datatransfer.StringSelection __stackOp100026_42_0 = __sourceUninitializedNEW100026_41();
    spill100026_12 = __stackOp100026_42_0;
    __explicitNewInit100026_43(__stackOp100026_42_0, life21_212);
    __call100026_44(spill100026_11, spill100026_12, null);
    if (!((life6_15 != null))) {
        break forest_join_216;
    }
    }
    life21_229 = __call100026_49(__call100026_48(__call100026_46(__call100026_45()), __fieldRead100026_47()));
    spill100026_13 = life21_229;
    if (!((life6_15 == null))) {
        forestValue100026_203_0 = spill100026_13;
        break forest_join_203;
    }
    if (!((!__call100026_50(spill100026_13, "#")))) {
        break forest_join_200;
    }
    break forest_join_226;
    }
    forestValue100026_203_0 = __call100026_51(life21_229, 1);
    }
    life21_242 = forestValue100026_203_0;
    __call100026_56(__fieldRead100026_52(receiver), __call100026_55(((int) __call100026_54(life21_242, __invokedynamic100026_53(32454, (5927469852000860680L ^ life4_3))))));
    }
    life12_93 = (life12_93 + (life17_116 + 0x1.0p0f));
    life15_100 += 1;
    }
    if (!((life6_15 != null))) {
        continue forest_cycle_88;
    }
    break forest_cycle_88;
    }
    break forest_join_227;
    }
    return;
    }
    spill100026_14 = receiver;
    spill100026_15 = p0;
    spill100026_16 = p1;
    if (!((life6_15 == null))) {
        forestValue100026_250_0 = spill100026_14;
        forestValue100026_250_1 = spill100026_15;
        forestValue100026_250_2 = spill100026_16;
        break forest_join_250;
    }
    forestValue100026_243_0 = __integerCategory100026_58(__call100026_57(spill100026_14, spill100026_15, spill100026_16, (life7_8 + 0x1.0p2f), (life8_14 + 0x1.8p4f), (life9_20 - 0x1.0p3f), 0x1.ep5f));
    }
    if (!((forestValue100026_243_0 != 0))) {
        break forest_join_247;
    }
    __fieldWrite100026_59(receiver, 1);
    }
    forestValue100026_250_0 = receiver;
    forestValue100026_250_1 = p0;
    forestValue100026_250_2 = p1;
    }
    __call100026_60(forestValue100026_250_0, forestValue100026_250_1, forestValue100026_250_2, p2);
    return;
}
public static void h100026_0(java.lang.Exception p0) throws Throwable {
    throw __call13002600_0(p0);
}
public static void h100026_1(java.lang.Exception p0) throws Throwable {
    throw __call13002601_0(p0);
}
public static void h100026_2(java.lang.Exception p0) throws Throwable {
    throw __call13002602_0(p0);
}
public static void h100026_3(java.lang.Exception p0) throws Throwable {
    throw __call13002603_0(p0);
}
public static void h100026_4(java.lang.Exception p0) throws Throwable {
    throw __call13002604_0(p0);
}
public static void h100026_5(java.lang.Exception p0) throws Throwable {
    throw __call13002605_0(p0);
}
public static void h100026_6(java.lang.Exception p0) throws Throwable {
    throw __call13002606_0(p0);
}
public static void h100026_7(java.lang.Exception p0) throws Throwable {
    throw __call13002607_0(p0);
}
public static void h100026_8(java.lang.Exception p0) throws Throwable {
    throw __call13002608_0(p0);
}
public static void h100026_9(java.lang.Exception p0) throws Throwable {
    throw __call13002609_0(p0);
}
public static void h100026_10(java.lang.Exception p0) throws Throwable {
    throw __call13002610_0(p0);
}
public static void h100026_11(java.lang.Exception p0) throws Throwable {
    throw __call13002611_0(p0);
}
public static void h100026_12(java.lang.Exception p0) throws Throwable {
    throw __call13002612_0(p0);
}
public static void h100026_13(java.lang.Exception p0) throws Throwable {
    throw __call13002613_0(p0);
}
public static void h100026_14(java.lang.Exception p0) throws Throwable {
    throw __call13002614_0(p0);
}
public static void h100026_15(java.lang.Exception p0, com.moon.m9 p1, int p2, int p3, int p4, long p5, net.minecraft.entity.Entity[] p6, float p7, float p8, float p9, com.moon.jm p10, float p11, java.lang.String[] p12, int p13, int p14, float p15) throws Throwable {
    int forestValue13002615_90_0;
    int forestValue13002615_98_0;
    java.lang.String forestValue13002615_127_0;
    int forestValue13002615_158_0;
    com.moon.m9 forestValue13002615_165_0;
    int forestValue13002615_165_1;
    int forestValue13002615_165_2;
    boolean spill13002615_0;
    int spill13002615_1;
    boolean spill13002615_2;
    boolean spill13002615_3;
    java.awt.datatransfer.Clipboard spill13002615_4;
    java.awt.datatransfer.StringSelection spill13002615_5;
    java.lang.String spill13002615_6;
    com.moon.m9 spill13002615_7;
    int spill13002615_8;
    int spill13002615_9;
    java.lang.Exception life21_2;
    java.lang.String life17_22;
    float life18_35;
    java.lang.String life19_66;
    int life20_68;
    java.lang.String life21_125;
    java.lang.String life21_142;
    java.lang.String life21_155;
    forest_join_165: {
    forest_join_162: {
    forest_join_158: {
    forest_join_142: {
    forest_join_141: {
    life21_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_127: {
    forest_join_124: {
    forest_join_111: {
    forest_join_98: {
    forest_join_93: {
    forest_join_90: {
    forest_join_89: {
    forest_join_77: {
    forest_join_63: {
    p11 = (p11 + (p15 + 0x1.0p0f));
    p14 += 1;
    forest_cycle_9: while (true) {
    forest_join_12: {
    if (!((p6 != null))) {
        break forest_join_12;
    }
    break forest_join_142;
    }
    if (!((p14 < p13))) {
        break forest_join_142;
    }
    life17_22 = (p12)[p14];
    p15 = (__call13002615_0(p10, life17_22, 0x1.8p2f) + 0x1.4p2f);
    life18_35 = (__call13002615_1(p10, 0x1.8p2f) + 0x1.0p2f);
    if (!((p6 == null))) {
        continue forest_cycle_9;
    }
    break forest_cycle_9;
    }
    spill13002615_0 = __call13002615_2(p1, p2, p3, ((p7 + 0x1.0p1f) + p11), (p8 + 0x1.88p6f), p15, life18_35);
    if (!((p6 == null))) {
        forestValue13002615_158_0 = __integerCategory13002615_3(spill13002615_0);
        break forest_join_158;
    }
    if (!(spill13002615_0)) {
        continue forest_cycle_2;
    }
    if (!(__fieldRead13002615_4(p1))) {
        continue forest_cycle_2;
    }
    life19_66 = life17_22;
    life20_68 = -1;
    spill13002615_1 = __call13002615_5(life19_66);
    if (!((p6 == null))) {
        forestValue13002615_90_0 = spill13002615_1;
        break forest_join_90;
    }
    switch (spill13002615_1) {
case 2106261:
{
        break forest_join_63;
    }
case 76885619:
{
        break forest_join_77;
    }
default:
{
        break forest_join_89;
    }
}
    }
    spill13002615_2 = __call13002615_7(life19_66, __invokedynamic13002615_6(32274, (6039096850518430818L ^ p5)));
    if (!((p6 == null))) {
        forestValue13002615_90_0 = __integerCategory13002615_8(spill13002615_2);
        break forest_join_90;
    }
    if (!(spill13002615_2)) {
        break forest_join_89;
    }
    life20_68 = 0;
    if (!((p6 != null))) {
        break forest_join_89;
    }
    }
    spill13002615_3 = __call13002615_10(life19_66, __invokedynamic13002615_9(7803, (8726438701650654218L ^ p5)));
    if (!((p6 == null))) {
        forestValue13002615_90_0 = __integerCategory13002615_11(spill13002615_3);
        break forest_join_90;
    }
    if (!(spill13002615_3)) {
        break forest_join_89;
    }
    life20_68 = 1;
    }
    forestValue13002615_90_0 = life20_68;
    }
    if (!((p6 == null))) {
        forestValue13002615_98_0 = forestValue13002615_90_0;
        break forest_join_98;
    }
    switch (forestValue13002615_90_0) {
default:
{
        continue forest_cycle_2;
    }
case 0:
{
        break forest_join_93;
    }
case 1:
{
        break forest_join_111;
    }
}
    }
    forestValue13002615_98_0 = __call13002615_15(__cast13002615_14(__call13002615_13(__fieldRead13002615_12(p1))));
    }
    life21_125 = __invokedynamic13002615_17(__call13002615_16(forestValue13002615_98_0));
    spill13002615_4 = __call13002615_19(__call13002615_18());
    java.awt.datatransfer.StringSelection __stackOp13002615_21_0 = __sourceUninitializedNEW13002615_20();
    spill13002615_5 = __stackOp13002615_21_0;
    __explicitNewInit13002615_22(__stackOp13002615_21_0, life21_125);
    __call13002615_23(spill13002615_4, spill13002615_5, null);
    if (!((p6 != null))) {
        continue forest_cycle_2;
    }
    }
    life21_142 = __call13002615_28(__call13002615_27(__call13002615_25(__call13002615_24()), __fieldRead13002615_26()));
    spill13002615_6 = life21_142;
    if (!((p6 == null))) {
        forestValue13002615_127_0 = spill13002615_6;
        break forest_join_127;
    }
    if (!((!__call13002615_29(spill13002615_6, "#")))) {
        break forest_join_124;
    }
    break forest_join_141;
    }
    forestValue13002615_127_0 = __call13002615_30(life21_142, 1);
    }
    life21_155 = forestValue13002615_127_0;
    __call13002615_35(__fieldRead13002615_31(p1), __call13002615_34(((int) __call13002615_33(life21_155, __invokedynamic13002615_32(32454, (5927469852000860680L ^ p5))))));
    continue forest_cycle_2;
    }
    }
    return;
    }
    spill13002615_7 = p1;
    spill13002615_8 = p2;
    spill13002615_9 = p3;
    if (!((p6 == null))) {
        forestValue13002615_165_0 = spill13002615_7;
        forestValue13002615_165_1 = spill13002615_8;
        forestValue13002615_165_2 = spill13002615_9;
        break forest_join_165;
    }
    forestValue13002615_158_0 = __integerCategory13002615_37(__call13002615_36(spill13002615_7, spill13002615_8, spill13002615_9, (p7 + 0x1.0p2f), (p8 + 0x1.8p4f), (p9 - 0x1.0p3f), 0x1.ep5f));
    }
    if (!((forestValue13002615_158_0 != 0))) {
        break forest_join_162;
    }
    __fieldWrite13002615_38(p1, 1);
    }
    forestValue13002615_165_0 = p1;
    forestValue13002615_165_1 = p2;
    forestValue13002615_165_2 = p3;
    }
    __call13002615_39(forestValue13002615_165_0, forestValue13002615_165_1, forestValue13002615_165_2, p4);
    return;
}
public static void h100026_16(java.lang.Exception p0) throws Throwable {
    throw __call13002616_0(p0);
}
public static void h100026_17(java.lang.Exception p0) throws Throwable {
    throw __call13002617_0(p0);
}
private static native long __fieldRead100026_0() throws Throwable;
private static native float __call100026_1(com.moon.m9 a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call100026_2() throws Throwable;
private static native float __call100026_3(com.moon.m9 a0) throws Throwable;
private static native float __call100026_4(com.moon.m9 a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call100026_5() throws Throwable;
private static native com.moon.jo __call100026_6(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead100026_7() throws Throwable;
private static native com.moon.jm __call100026_8(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native boolean __call100026_9(com.moon.m9 a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory100026_10(boolean value) throws Throwable;
private static native com.moon.nY __fieldRead100026_11(com.moon.m9 a0) throws Throwable;
private static native boolean __fieldRead100026_12(com.moon.m9 a0) throws Throwable;
private static native void __call100026_13(com.moon.nY a0, float a1) throws Throwable;
private static native boolean __fieldRead100026_14(com.moon.m9 a0) throws Throwable;
private static native int __integerCategory100026_15(boolean value) throws Throwable;
private static native void __fieldWrite100026_16(com.moon.m9 a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic100026_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100026_20(int a0, long a1) throws Throwable;
private static native float __call100026_21(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native float __call100026_22(com.moon.jm a0, float a1) throws Throwable;
private static native boolean __call100026_23(com.moon.m9 a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory100026_24(boolean value) throws Throwable;
private static native boolean __fieldRead100026_25(com.moon.m9 a0) throws Throwable;
private static native int __call100026_26(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100026_27(int a0, long a1) throws Throwable;
private static native boolean __call100026_28(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100026_29(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic100026_30(int a0, long a1) throws Throwable;
private static native boolean __call100026_31(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory100026_32(boolean value) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead100026_33(com.moon.m9 a0) throws Throwable;
private static native java.lang.Object __call100026_34(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast100026_35(java.lang.Object a0) throws Throwable;
private static native int __call100026_36(java.lang.Integer a0) throws Throwable;
private static native java.lang.String __call100026_37(int a0) throws Throwable;
private static native java.lang.String __invokedynamic100026_38(java.lang.String a0) throws Throwable;
private static native java.awt.Toolkit __call100026_39() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call100026_40(java.awt.Toolkit a0) throws Throwable;
private static native java.awt.datatransfer.StringSelection __sourceUninitializedNEW100026_41() throws Throwable;
private static native void __explicitNewInit100026_43(java.awt.datatransfer.StringSelection a0, java.lang.String a1) throws Throwable;
private static native void __call100026_44(java.awt.datatransfer.Clipboard a0, java.awt.datatransfer.StringSelection a1, java.lang.Object a2) throws Throwable;
private static native java.awt.Toolkit __call100026_45() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call100026_46(java.awt.Toolkit a0) throws Throwable;
private static native java.awt.datatransfer.DataFlavor __fieldRead100026_47() throws Throwable;
private static native java.lang.Object __call100026_48(java.awt.datatransfer.Clipboard a0, java.awt.datatransfer.DataFlavor a1) throws Throwable;
private static native java.lang.String __call100026_49(java.lang.Object a0) throws Throwable;
private static native boolean __call100026_50(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call100026_51(java.lang.String a0, int a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead100026_52(com.moon.m9 a0) throws Throwable;
private static native int __invokedynamic100026_53(int a0, long a1) throws Throwable;
private static native long __call100026_54(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Integer __call100026_55(int a0) throws Throwable;
private static native void __call100026_56(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native boolean __call100026_57(com.moon.m9 a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory100026_58(boolean value) throws Throwable;
private static native void __fieldWrite100026_59(com.moon.m9 a0, int a1) throws Throwable;
private static native void __call100026_60(com.moon.m9 a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call13002600_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002601_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002602_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002603_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002604_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002605_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002606_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002607_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002608_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002609_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002610_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002611_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002612_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002613_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002614_0(java.lang.Exception a0) throws Throwable;
private static native float __call13002615_0(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native float __call13002615_1(com.moon.jm a0, float a1) throws Throwable;
private static native boolean __call13002615_2(com.moon.m9 a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory13002615_3(boolean value) throws Throwable;
private static native boolean __fieldRead13002615_4(com.moon.m9 a0) throws Throwable;
private static native int __call13002615_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13002615_6(int a0, long a1) throws Throwable;
private static native boolean __call13002615_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory13002615_8(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic13002615_9(int a0, long a1) throws Throwable;
private static native boolean __call13002615_10(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory13002615_11(boolean value) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead13002615_12(com.moon.m9 a0) throws Throwable;
private static native java.lang.Object __call13002615_13(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast13002615_14(java.lang.Object a0) throws Throwable;
private static native int __call13002615_15(java.lang.Integer a0) throws Throwable;
private static native java.lang.String __call13002615_16(int a0) throws Throwable;
private static native java.lang.String __invokedynamic13002615_17(java.lang.String a0) throws Throwable;
private static native java.awt.Toolkit __call13002615_18() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call13002615_19(java.awt.Toolkit a0) throws Throwable;
private static native java.awt.datatransfer.StringSelection __sourceUninitializedNEW13002615_20() throws Throwable;
private static native void __explicitNewInit13002615_22(java.awt.datatransfer.StringSelection a0, java.lang.String a1) throws Throwable;
private static native void __call13002615_23(java.awt.datatransfer.Clipboard a0, java.awt.datatransfer.StringSelection a1, java.lang.Object a2) throws Throwable;
private static native java.awt.Toolkit __call13002615_24() throws Throwable;
private static native java.awt.datatransfer.Clipboard __call13002615_25(java.awt.Toolkit a0) throws Throwable;
private static native java.awt.datatransfer.DataFlavor __fieldRead13002615_26() throws Throwable;
private static native java.lang.Object __call13002615_27(java.awt.datatransfer.Clipboard a0, java.awt.datatransfer.DataFlavor a1) throws Throwable;
private static native java.lang.String __call13002615_28(java.lang.Object a0) throws Throwable;
private static native boolean __call13002615_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call13002615_30(java.lang.String a0, int a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead13002615_31(com.moon.m9 a0) throws Throwable;
private static native int __invokedynamic13002615_32(int a0, long a1) throws Throwable;
private static native long __call13002615_33(java.lang.String a0, int a1) throws Throwable;
private static native java.lang.Integer __call13002615_34(int a0) throws Throwable;
private static native void __call13002615_35(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native boolean __call13002615_36(com.moon.m9 a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory13002615_37(boolean value) throws Throwable;
private static native void __fieldWrite13002615_38(com.moon.m9 a0, int a1) throws Throwable;
private static native void __call13002615_39(com.moon.m9 a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call13002616_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call13002617_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_96fdeaee8267427874f7(com.moon.m9 a0, int a1, int a2) throws E;
private static final class __SourceHandler_96fdeaee8267427874f7 {

public static void f475(com.moon.m9 receiver, int p0, int p1) throws Throwable {
    com.moon.m9 forwardValue475_170_0;
    com.moon.m9 forwardValue475_174_0;
    net.minecraft.entity.Entity[] spill475_0;
    com.moon.m9 spill475_1;
    com.moon.m9 spill475_2;
    long life3_3;
    float life6_8;
    float life7_13;
    float life8_18;
    com.moon.jm life9_23;
    com.moon.hW life10_28;
    com.moon.hW life11_33;
    com.moon.hW life12_40;
    com.moon.i3 life13_89;
    net.minecraft.entity.Entity[] life5_134;
    forward_join_174: {
    forward_join_173: {
    forward_join_170: {
    forward_join_169: {
    life3_3 = (__fieldRead475_0() ^ 113997343698396L);
    life6_8 = (__call475_1(receiver) + 0x1.0p3f);
    life7_13 = (__call475_2(receiver) + 0x1.2p2f);
    life8_18 = (__call475_3(receiver) - 0x1.0p4f);
    life9_23 = __call475_7(__call475_5(__call475_4()), __fieldRead475_6());
    life10_28 = __call475_11(__call475_10(__call475_8(), __fieldRead475_9()));
    life11_33 = __call475_15(__call475_14(__call475_12(), __fieldRead475_13()));
    life12_40 = __call475_20(__call475_19(__call475_18(__call475_16(), __fieldRead475_17()), life9_23));
    __call475_23(life10_28, __call475_22((life6_8 - 0x1.0p-1f), life7_13, (life8_18 + 0x1.0p0f), 0x1.1p4f, 0x1.8p1f, __invokedynamic475_21(19891, (8730931618567831853L ^ life3_3))));
    __call475_24(receiver, (((life6_8 + life8_18) - 0x1.1p4f) - 0x1.6p3f), (life7_13 + 0x1.6p2f), p0, p1);
    spill475_0 = __call475_25();
    life13_89 = __call475_31(((life6_8 + life8_18) - 0x1.1p4f), life7_13, 0x1.1p4f, 0x1.1p4f, 0x1.8p1f, __call475_30(__cast475_29(__call475_28(__call475_27(__call475_26(receiver))))));
    __call475_32(life13_89, 0);
    __call475_33(life13_89, 0);
    __call475_34(life13_89, 0);
    __call475_35(life10_28, life13_89);
    __call475_41(life9_23, life12_40, __call475_37(__fieldRead475_36(receiver)), 0x1.cp2f, (life6_8 + 0x1.0p2f), (((life7_13 + 0x1.1p3f) - (__call475_40(life9_23, __call475_39(__fieldRead475_38(receiver)), 0x1.cp2f) / 0x1.0p1f)) + 0x1.0p-1f), -1);
    __call475_42(life10_28);
    __call475_43(life12_40);
    life5_134 = spill475_0;
    __call475_45(__invokedynamic475_44(8923, (4400594361658191430L ^ life3_3)));
    __call475_46(life11_33);
    __call475_48(__invokedynamic475_47(10622, (6244452675608258027L ^ life3_3)));
    __call475_51(__fieldRead475_49(receiver), 0x0.0p0f, 0x1.0p0f, __fieldRead475_50(receiver));
    spill475_1 = receiver;
    if (!((life5_134 == null))) {
        forwardValue475_170_0 = spill475_1;
        break forward_join_170;
    }
    if (!((!__fieldRead475_52(spill475_1)))) {
        break forward_join_169;
    }
    spill475_2 = receiver;
    if (!((life5_134 == null))) {
        forwardValue475_174_0 = spill475_2;
        break forward_join_174;
    }
    if (!((__numericCompare475_55(__call475_54(__fieldRead475_53(spill475_2)), 0x0.0p0f) > 0))) {
        break forward_join_173;
    }
    }
    forwardValue475_170_0 = receiver;
    }
    __call475_56(forwardValue475_170_0, p0, p1);
    }
    forwardValue475_174_0 = receiver;
    }
    __call475_57(forwardValue475_174_0, p0, p1);
    return;
}
public static void h475_0(moom.Oo p0) throws Throwable {
    throw __call1047500_0(p0);
}
public static void h475_1(moom.Oo p0) throws Throwable {
    throw __call1047501_0(p0);
}
public static void h475_2(moom.Oo p0) throws Throwable {
    throw __call1047502_0(p0);
}
public static void h475_3(moom.Oo p0) throws Throwable {
    throw __call1047503_0(p0);
}
private static native long __fieldRead475_0() throws Throwable;
private static native float __call475_1(com.moon.m9 a0) throws Throwable;
private static native float __call475_2(com.moon.m9 a0) throws Throwable;
private static native float __call475_3(com.moon.m9 a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call475_4() throws Throwable;
private static native com.moon.jo __call475_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead475_6() throws Throwable;
private static native com.moon.jm __call475_7(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native com.moon.hX __call475_8() throws Throwable;
private static native com.moon.cb __fieldRead475_9() throws Throwable;
private static native com.moon.hX __call475_10(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call475_11(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call475_12() throws Throwable;
private static native com.moon.cb __fieldRead475_13() throws Throwable;
private static native com.moon.hX __call475_14(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call475_15(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call475_16() throws Throwable;
private static native com.moon.cb __fieldRead475_17() throws Throwable;
private static native com.moon.hX __call475_18(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call475_19(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call475_20(com.moon.hX a0) throws Throwable;
private static native int __invokedynamic475_21(int a0, long a1) throws Throwable;
private static native com.moon.i3 __call475_22(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call475_23(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call475_24(com.moon.m9 a0, float a1, float a2, int a3, int a4) throws Throwable;
private static native net.minecraft.entity.Entity[] __call475_25() throws Throwable;
private static native com.moon.module.impl.ClickGUI __call475_26(com.moon.m9 a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call475_27(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call475_28(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast475_29(java.lang.Object a0) throws Throwable;
private static native int __call475_30(java.lang.Integer a0) throws Throwable;
private static native com.moon.i3 __call475_31(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native com.moon.i3 __call475_32(com.moon.i3 a0, int a1) throws Throwable;
private static native com.moon.i3 __call475_33(com.moon.i3 a0, int a1) throws Throwable;
private static native com.moon.i3 __call475_34(com.moon.i3 a0, int a1) throws Throwable;
private static native void __call475_35(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead475_36(com.moon.m9 a0) throws Throwable;
private static native java.lang.String __call475_37(com.moon.setting.ColorSetting a0) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead475_38(com.moon.m9 a0) throws Throwable;
private static native java.lang.String __call475_39(com.moon.setting.ColorSetting a0) throws Throwable;
private static native float __call475_40(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native void __call475_41(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call475_42(com.moon.hW a0) throws Throwable;
private static native void __call475_43(com.moon.hW a0) throws Throwable;
private static native int __invokedynamic475_44(int a0, long a1) throws Throwable;
private static native void __call475_45(int a0) throws Throwable;
private static native void __call475_46(com.moon.hW a0) throws Throwable;
private static native int __invokedynamic475_47(int a0, long a1) throws Throwable;
private static native void __call475_48(int a0) throws Throwable;
private static native com.moon.nY __fieldRead475_49(com.moon.m9 a0) throws Throwable;
private static native boolean __fieldRead475_50(com.moon.m9 a0) throws Throwable;
private static native void __call475_51(com.moon.nY a0, float a1, float a2, boolean a3) throws Throwable;
private static native boolean __fieldRead475_52(com.moon.m9 a0) throws Throwable;
private static native com.moon.nY __fieldRead475_53(com.moon.m9 a0) throws Throwable;
private static native float __call475_54(com.moon.nY a0) throws Throwable;
private static native int __numericCompare475_55(float a0, float a1) throws Throwable;
private static native void __call475_56(com.moon.m9 a0, int a1, int a2) throws Throwable;
private static native void __call475_57(com.moon.m9 a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1047500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0e8fb71f5465a3342e73(com.moon.m9 a0, int a1, int a2) throws E;
private static final class __SourceHandler_0e8fb71f5465a3342e73 {

public static void f476(com.moon.m9 receiver, int p0, int p1) throws Throwable {
    int lexicalValue476_144_0;
    com.moon.m9 lexicalValue476_280_0;
    int lexicalValue476_280_1;
    int lexicalValue476_367_0;
    int lexicalValue476_537_0;
    int lexicalValue476_541_0;
    net.minecraft.entity.Entity[] spill476_0;
    int spill476_1;
    boolean spill476_2;
    com.moon.m9 spill476_3;
    int spill476_4;
    boolean spill476_5;
    long life3_3;
    float life6_8;
    float life7_14;
    float life8_19;
    net.minecraft.entity.Entity[] life5_20;
    float life9_26;
    com.moon.jm life10_31;
    com.moon.jm life11_36;
    com.moon.jC life12_43;
    com.moon.hW life13_48;
    com.moon.hW life14_53;
    com.moon.hW life15_58;
    com.moon.hW life16_63;
    com.moon.hW life17_70;
    com.moon.hW life18_75;
    int life19_100;
    java.awt.Color life20_114;
    float[] life21_123;
    int life20_147;
    int life21_205;
    int life22_220;
    java.lang.String life21_387;
    java.lang.String[] life22_429;
    float life23_431;
    java.lang.String[] life24_433;
    int life25_436;
    int life26_438;
    java.lang.String life27_445;
    float life28_452;
    float life29_458;
    float life24_576;
    float life25_583;
    float life26_589;
    float life27_595;
    lexical_join_588: {
    lexical_join_541: {
    lexical_join_537: {
    lexical_join_518: {
    lexical_join_488: {
    lexical_join_367: {
    lexical_join_298: {
    lexical_join_144: {
    lexical_join_139: {
    life3_3 = (__fieldRead476_0() ^ 9301153791221L);
    life6_8 = (__call476_1(receiver) + 0x1.0p3f);
    spill476_0 = __call476_2();
    life7_14 = (__call476_3(receiver) + 0x1.2p2f);
    life8_19 = (__call476_4(receiver) - 0x1.0p4f);
    life5_20 = spill476_0;
    life9_26 = (0x1.74p6f * __call476_6(__fieldRead476_5(receiver)));
    life10_31 = __call476_10(__call476_8(__call476_7()), __fieldRead476_9());
    life11_36 = __call476_14(__call476_12(__call476_11()), __fieldRead476_13());
    life12_43 = __call476_16(life6_8, life7_14, life8_19, __fieldRead476_15(receiver));
    life13_48 = __call476_20(__call476_19(__call476_17(), __fieldRead476_18()));
    life14_53 = __call476_24(__call476_23(__call476_21(), __fieldRead476_22()));
    life15_58 = __call476_28(__call476_27(__call476_25(), __fieldRead476_26()));
    life16_63 = __call476_32(__call476_31(__call476_29(), __fieldRead476_30()));
    life17_70 = __call476_37(__call476_36(__call476_35(__call476_33(), __fieldRead476_34()), life10_31));
    life18_75 = __call476_41(__call476_40(__call476_38(), __fieldRead476_39()));
    __call476_44(life13_48, __call476_43((life6_8 - 0x1.0p-1f), (life7_14 + 0x1.38p4f), (life8_19 + 0x1.0p0f), life9_26, 0x1.8p1f, __invokedynamic476_42(15215, (5223770520197965527L ^ life3_3))));
    life19_100 = __call476_48(__cast476_47(__call476_46(__fieldRead476_45(receiver))));
    spill476_1 = __fieldRead476_49(receiver);
    if (!((life5_20 == null))) {
        lexicalValue476_144_0 = spill476_1;
        break lexical_join_144;
    }
    if (!((spill476_1 != life19_100))) {
        break lexical_join_139;
    }
    life20_114 = new java.awt.Color(life19_100);
    life21_123 = __call476_53(__call476_50(life20_114), __call476_51(life20_114), __call476_52(life20_114), null);
    __fieldWrite476_54(receiver, (life21_123)[0]);
    __fieldWrite476_55(receiver, (life21_123)[1]);
    __fieldWrite476_56(receiver, (life21_123)[2]);
    __fieldWrite476_57(receiver, life19_100);
    }
    lexicalValue476_144_0 = __call476_59(__fieldRead476_58(receiver), 0x1.0p0f, 0x1.0p0f);
    }
    life20_147 = lexicalValue476_144_0;
    __call476_61(life16_63, __call476_60((life6_8 + 0x1.0p2f), (life7_14 + 0x1.8p4f), (life8_19 - 0x1.0p3f), 0x1.ep5f, -1, life20_147, 0));
    __call476_64(life16_63, __call476_63((life6_8 + 0x1.0p2f), (life7_14 + 0x1.8p4f), (life8_19 - 0x1.0p3f), 0x1.ep5f, 0, __invokedynamic476_62(32603, (827351065352823526L ^ life3_3)), 1));
    __call476_67(life15_58, __call476_66((life6_8 + 0x1.0p1f), (life7_14 + 0x1.6p4f), (life8_19 - 0x1.0p2f), 0x1.0p6f, 0x1.0p1f, 0x1.0p-1f, __invokedynamic476_65(6359, (5922364127869732205L ^ life3_3))));
    life21_205 = 0;
    lexical_cycle_203: while (true) {
    lexical_join_296: {
    lexical_join_295: {
    lexical_join_280: {
    if (!((life21_205 <= __invokedynamic476_68(31410, (3487271734873220876L ^ life3_3))))) {
        break lexical_join_298;
    }
    life22_220 = __call476_69((((float) life21_205) / 0x1.9p6f), 0x1.0p0f, 0x1.0p0f);
    __call476_71(life14_53, __call476_70(((life6_8 + 0x1.0p2f) + ((((float) life21_205) * (life8_19 - 0x1.0p3f)) / 0x1.9p6f)), (life7_14 + 0x1.64p6f), ((life8_19 - 0x1.0p3f) / 0x1.9p6f), 0x1.0p2f, life22_220));
    if (!((life5_20 == null))) {
        break lexical_join_296;
    }
    spill476_2 = __call476_72(0);
    if (!((life5_20 == null))) {
        lexicalValue476_367_0 = __integerCategory476_73(spill476_2);
        break lexical_join_367;
    }
    if (!(spill476_2)) {
        break lexical_join_295;
    }
    spill476_3 = receiver;
    spill476_4 = p0;
    if (!((life5_20 == null))) {
        lexicalValue476_280_0 = spill476_3;
        lexicalValue476_280_1 = spill476_4;
        break lexical_join_280;
    }
    if (!(__call476_74(spill476_3, spill476_4, p1, ((life6_8 + 0x1.0p2f) + ((((float) life21_205) * (life8_19 - 0x1.0p3f)) / 0x1.9p6f)), (life7_14 + 0x1.5cp6f), ((life8_19 - 0x1.0p3f) / 0x1.9p6f), 0x1.0p3f))) {
        break lexical_join_295;
    }
    lexicalValue476_280_0 = receiver;
    lexicalValue476_280_1 = life21_205;
    }
    __fieldWrite476_75(lexicalValue476_280_0, (((float) lexicalValue476_280_1) / 0x1.9p6f));
    __call476_82(__fieldRead476_76(receiver), __call476_81(__call476_80(__fieldRead476_77(receiver), __fieldRead476_78(receiver), __fieldRead476_79(receiver))));
    }
    life21_205 += 1;
    }
    if (!((life5_20 != null))) { continue lexical_cycle_203; }
    break lexical_cycle_203;
    }
    }
    __call476_85(life15_58, __call476_84((life6_8 + 0x1.0p1f), (life7_14 + 0x1.5cp6f), (life8_19 - 0x1.0p2f), 0x1.0p3f, 0x1.0p1f, 0x1.0p-1f, __invokedynamic476_83(4468, (2009038963011095755L ^ life3_3))));
    __call476_88(life18_75, __call476_87((((life6_8 + 0x1.0p2f) + (__fieldRead476_86(receiver) * (life8_19 - 0x1.0p3f))) - 0x1.2p2f), (life7_14 + 0x1.5ap6f), 0x1.2p3f, 0x1.2p3f, 0x1.8p1f, -1));
    __call476_91(life18_75, __call476_90((((life6_8 + 0x1.0p2f) + (__fieldRead476_89(receiver) * (life8_19 - 0x1.0p3f))) - 0x1.cp1f), (life7_14 + 0x1.5ep6f), 0x1.cp2f, 0x1.cp2f, 0x1.0p1f, life20_147));
    lexicalValue476_367_0 = __call476_95(__cast476_94(__call476_93(__fieldRead476_92(receiver))));
    }
    life21_387 = __invokedynamic476_97(__call476_96(lexicalValue476_367_0));
    __call476_103(life10_31, life17_70, life21_387, 0x1.dp2f, (((life6_8 + life8_19) - __call476_98(life10_31, life21_387, 0x1.dp2f)) - 0x1.0p1f), (life7_14 + 0x1.8fp6f), __call476_102(__cast476_101(__call476_100(__fieldRead476_99(receiver)))));
    life22_429 = new java.lang.String[] {__invokedynamic476_104(32274, (6039162180243131669L ^ life3_3)), __invokedynamic476_105(7803, (8726512992722808189L ^ life3_3))};
    life23_431 = 0x0.0p0f;
    life24_433 = life22_429;
    life25_436 = (life24_433).length;
    life26_438 = 0;
    lexical_cycle_421: while (true) {
    if (!((life26_438 < life25_436))) {
        break lexical_join_488;
    }
    life27_445 = (life24_433)[life26_438];
    life28_452 = (__call476_106(life10_31, life27_445, 0x1.8p2f) + 0x1.4p2f);
    life29_458 = (__call476_107(life10_31, 0x1.8p2f) + 0x1.0p2f);
    __call476_114(life18_75, __call476_113(((life6_8 + 0x1.0p1f) + life23_431), (life7_14 + 0x1.88p6f), life28_452, life29_458, 0x1.cp1f, __call476_112(__cast476_111(__call476_110(__call476_109(__call476_108(receiver)))))));
    __call476_115(life10_31, life17_70, life27_445, 0x1.8p2f, (((life6_8 + 0x1.0p1f) + life23_431) + 0x1.4p1f), (life7_14 + 0x1.92p6f), -1);
    life23_431 = (life23_431 + (life28_452 + 0x1.0p0f));
    life26_438 += 1;
    if (!((life5_20 == null))) {
        break lexical_join_518;
    }
    if (!((life5_20 != null))) { continue lexical_cycle_421; }
    break lexical_cycle_421;
    }
    }
    __call476_116(life13_48, life12_43);
    __call476_117(life17_70, life12_43);
    __call476_118(life16_63, life12_43);
    __call476_119(life15_58, life12_43);
    __call476_120(life14_53, life12_43);
    __call476_121(life18_75, life12_43);
    __call476_122(life13_48);
    __call476_123(life16_63);
    __call476_124(life14_53);
    __call476_125(life15_58);
    __call476_126(life18_75);
    __call476_127(life17_70);
    }
    spill476_5 = __fieldRead476_128(receiver);
    if (!((life5_20 == null))) {
        lexicalValue476_537_0 = __integerCategory476_129(spill476_5);
        break lexical_join_537;
    }
    if (!(spill476_5)) {
        break lexical_join_588;
    }
    lexicalValue476_537_0 = __integerCategory476_131(__call476_130(receiver, p0, p1, (life6_8 + 0x1.0p2f), (life7_14 + 0x1.8p4f), (life8_19 - 0x1.0p3f), 0x1.ep5f));
    }
    if (!((life5_20 == null))) {
        lexicalValue476_541_0 = lexicalValue476_537_0;
        break lexical_join_541;
    }
    if (!((lexicalValue476_537_0 != 0))) {
        break lexical_join_588;
    }
    lexicalValue476_541_0 = p0;
    }
    life24_576 = (((float) lexicalValue476_541_0) - (life6_8 + 0x1.0p2f));
    life25_583 = (((float) p1) - (life7_14 + 0x1.8p4f));
    life26_589 = (life24_576 / (life8_19 - 0x1.0p3f));
    life27_595 = (0x1.0p0f - (life25_583 / 0x1.ep5f));
    __call476_136(__fieldRead476_132(receiver), __call476_135(__call476_134(__fieldRead476_133(receiver), life26_589, life27_595)));
    __fieldWrite476_141(receiver, __call476_140(__cast476_139(__call476_138(__fieldRead476_137(receiver)))));
    __fieldWrite476_142(receiver, life26_589);
    __fieldWrite476_143(receiver, life27_595);
    }
    return;
}
public static void h476_0(moom.Oo p0) throws Throwable {
    throw __call1047600_0(p0);
}
public static void h476_1(moom.Oo p0) throws Throwable {
    throw __call1047601_0(p0);
}
public static void h476_2(moom.Oo p0) throws Throwable {
    throw __call1047602_0(p0);
}
public static void h476_3(moom.Oo p0) throws Throwable {
    throw __call1047603_0(p0);
}
public static void h476_4(moom.Oo p0) throws Throwable {
    throw __call1047604_0(p0);
}
public static void h476_5(moom.Oo p0) throws Throwable {
    throw __call1047605_0(p0);
}
public static void h476_6(moom.Oo p0) throws Throwable {
    throw __call1047606_0(p0);
}
public static void h476_7(moom.Oo p0) throws Throwable {
    throw __call1047607_0(p0);
}
public static void h476_8(moom.Oo p0) throws Throwable {
    throw __call1047608_0(p0);
}
public static void h476_9(moom.Oo p0) throws Throwable {
    throw __call1047609_0(p0);
}
private static native long __fieldRead476_0() throws Throwable;
private static native float __call476_1(com.moon.m9 a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call476_2() throws Throwable;
private static native float __call476_3(com.moon.m9 a0) throws Throwable;
private static native float __call476_4(com.moon.m9 a0) throws Throwable;
private static native com.moon.nY __fieldRead476_5(com.moon.m9 a0) throws Throwable;
private static native float __call476_6(com.moon.nY a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call476_7() throws Throwable;
private static native com.moon.jo __call476_8(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead476_9() throws Throwable;
private static native com.moon.jm __call476_10(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call476_11() throws Throwable;
private static native com.moon.jo __call476_12(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead476_13() throws Throwable;
private static native com.moon.jm __call476_14(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native float __fieldRead476_15(com.moon.m9 a0) throws Throwable;
private static native com.moon.jC __call476_16(float a0, float a1, float a2, float a3) throws Throwable;
private static native com.moon.hX __call476_17() throws Throwable;
private static native com.moon.cb __fieldRead476_18() throws Throwable;
private static native com.moon.hX __call476_19(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call476_20(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call476_21() throws Throwable;
private static native com.moon.cb __fieldRead476_22() throws Throwable;
private static native com.moon.hX __call476_23(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call476_24(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call476_25() throws Throwable;
private static native com.moon.cb __fieldRead476_26() throws Throwable;
private static native com.moon.hX __call476_27(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call476_28(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call476_29() throws Throwable;
private static native com.moon.cb __fieldRead476_30() throws Throwable;
private static native com.moon.hX __call476_31(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call476_32(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call476_33() throws Throwable;
private static native com.moon.cb __fieldRead476_34() throws Throwable;
private static native com.moon.hX __call476_35(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call476_36(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call476_37(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call476_38() throws Throwable;
private static native com.moon.cb __fieldRead476_39() throws Throwable;
private static native com.moon.hX __call476_40(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call476_41(com.moon.hX a0) throws Throwable;
private static native int __invokedynamic476_42(int a0, long a1) throws Throwable;
private static native com.moon.i3 __call476_43(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call476_44(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead476_45(com.moon.m9 a0) throws Throwable;
private static native java.lang.Object __call476_46(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast476_47(java.lang.Object a0) throws Throwable;
private static native int __call476_48(java.lang.Integer a0) throws Throwable;
private static native int __fieldRead476_49(com.moon.m9 a0) throws Throwable;
private static native int __call476_50(java.awt.Color a0) throws Throwable;
private static native int __call476_51(java.awt.Color a0) throws Throwable;
private static native int __call476_52(java.awt.Color a0) throws Throwable;
private static native float[] __call476_53(int a0, int a1, int a2, java.lang.Object a3) throws Throwable;
private static native void __fieldWrite476_54(com.moon.m9 a0, float a1) throws Throwable;
private static native void __fieldWrite476_55(com.moon.m9 a0, float a1) throws Throwable;
private static native void __fieldWrite476_56(com.moon.m9 a0, float a1) throws Throwable;
private static native void __fieldWrite476_57(com.moon.m9 a0, int a1) throws Throwable;
private static native float __fieldRead476_58(com.moon.m9 a0) throws Throwable;
private static native int __call476_59(float a0, float a1, float a2) throws Throwable;
private static native com.moon.i0 __call476_60(float a0, float a1, float a2, float a3, int a4, int a5, int a6) throws Throwable;
private static native void __call476_61(com.moon.hW a0, com.moon.i0 a1) throws Throwable;
private static native int __invokedynamic476_62(int a0, long a1) throws Throwable;
private static native com.moon.i0 __call476_63(float a0, float a1, float a2, float a3, int a4, int a5, int a6) throws Throwable;
private static native void __call476_64(com.moon.hW a0, com.moon.i0 a1) throws Throwable;
private static native int __invokedynamic476_65(int a0, long a1) throws Throwable;
private static native com.moon.i1 __call476_66(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call476_67(com.moon.hW a0, com.moon.i1 a1) throws Throwable;
private static native int __invokedynamic476_68(int a0, long a1) throws Throwable;
private static native int __call476_69(float a0, float a1, float a2) throws Throwable;
private static native com.moon.i2 __call476_70(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call476_71(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native boolean __call476_72(int a0) throws Throwable;
private static native int __integerCategory476_73(boolean value) throws Throwable;
private static native boolean __call476_74(com.moon.m9 a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native void __fieldWrite476_75(com.moon.m9 a0, float a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead476_76(com.moon.m9 a0) throws Throwable;
private static native float __fieldRead476_77(com.moon.m9 a0) throws Throwable;
private static native float __fieldRead476_78(com.moon.m9 a0) throws Throwable;
private static native float __fieldRead476_79(com.moon.m9 a0) throws Throwable;
private static native int __call476_80(float a0, float a1, float a2) throws Throwable;
private static native java.lang.Integer __call476_81(int a0) throws Throwable;
private static native void __call476_82(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native int __invokedynamic476_83(int a0, long a1) throws Throwable;
private static native com.moon.i1 __call476_84(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call476_85(com.moon.hW a0, com.moon.i1 a1) throws Throwable;
private static native float __fieldRead476_86(com.moon.m9 a0) throws Throwable;
private static native com.moon.i3 __call476_87(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call476_88(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native float __fieldRead476_89(com.moon.m9 a0) throws Throwable;
private static native com.moon.i3 __call476_90(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call476_91(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead476_92(com.moon.m9 a0) throws Throwable;
private static native java.lang.Object __call476_93(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast476_94(java.lang.Object a0) throws Throwable;
private static native int __call476_95(java.lang.Integer a0) throws Throwable;
private static native java.lang.String __call476_96(int a0) throws Throwable;
private static native java.lang.String __invokedynamic476_97(java.lang.String a0) throws Throwable;
private static native float __call476_98(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead476_99(com.moon.m9 a0) throws Throwable;
private static native java.lang.Object __call476_100(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast476_101(java.lang.Object a0) throws Throwable;
private static native int __call476_102(java.lang.Integer a0) throws Throwable;
private static native void __call476_103(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native java.lang.String __invokedynamic476_104(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic476_105(int a0, long a1) throws Throwable;
private static native float __call476_106(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native float __call476_107(com.moon.jm a0, float a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __call476_108(com.moon.m9 a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call476_109(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call476_110(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast476_111(java.lang.Object a0) throws Throwable;
private static native int __call476_112(java.lang.Integer a0) throws Throwable;
private static native com.moon.i3 __call476_113(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call476_114(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call476_115(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call476_116(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call476_117(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call476_118(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call476_119(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call476_120(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call476_121(com.moon.hW a0, com.moon.jC a1) throws Throwable;
private static native void __call476_122(com.moon.hW a0) throws Throwable;
private static native void __call476_123(com.moon.hW a0) throws Throwable;
private static native void __call476_124(com.moon.hW a0) throws Throwable;
private static native void __call476_125(com.moon.hW a0) throws Throwable;
private static native void __call476_126(com.moon.hW a0) throws Throwable;
private static native void __call476_127(com.moon.hW a0) throws Throwable;
private static native boolean __fieldRead476_128(com.moon.m9 a0) throws Throwable;
private static native int __integerCategory476_129(boolean value) throws Throwable;
private static native boolean __call476_130(com.moon.m9 a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory476_131(boolean value) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead476_132(com.moon.m9 a0) throws Throwable;
private static native float __fieldRead476_133(com.moon.m9 a0) throws Throwable;
private static native int __call476_134(float a0, float a1, float a2) throws Throwable;
private static native java.lang.Integer __call476_135(int a0) throws Throwable;
private static native void __call476_136(com.moon.setting.ColorSetting a0, java.lang.Integer a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead476_137(com.moon.m9 a0) throws Throwable;
private static native java.lang.Object __call476_138(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast476_139(java.lang.Object a0) throws Throwable;
private static native int __call476_140(java.lang.Integer a0) throws Throwable;
private static native void __fieldWrite476_141(com.moon.m9 a0, int a1) throws Throwable;
private static native void __fieldWrite476_142(com.moon.m9 a0, float a1) throws Throwable;
private static native void __fieldWrite476_143(com.moon.m9 a0, float a1) throws Throwable;
private static native java.lang.Exception __call1047600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1047609_0(moom.Oo a0) throws Throwable;

}


public void b(int p0, int p1, int p2) {
this.q = ((boolean)(false));
    super.b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.m9.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void b(int p0, int p1) {
float local3 = (((com.moon.m9)(this)).a() + 0x1.0p3f);
    float local4 = (((com.moon.m9)(this)).b() + 0x1.2p2f);
    float local5 = (((com.moon.m9)(this)).c() - 0x1.0p4f);
    java.lang.Object local6 = com.moon.jC.a(((float)(local3)), ((float)(local4)), ((float)(local5)), ((float)((((com.moon.m9)(this)).d() - 0x1.2p2f))));
    java.lang.Object local7 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)((((local3 + local5) - 0x1.1p3f) - 0x1.4p2f))), ((float)(((local4 + 0x1.1p3f) - 0x1.4p2f))), ((float)(0x1.4p3f)), ((float)(0x1.4p3f)), ((float)(0x1.cp1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(this.n)).getValue())))).intValue()))))));
    float local8 = ((local3 + 0x1.0p2f) + (this.s * (local5 - 0x1.0p3f)));
    float local9 = ((local4 + 0x1.8p4f) + ((0x1.0p0f - this.r) * 0x1.ep5f));
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)((local8 - 0x1.2p2f))), ((float)((local9 - 0x1.2p2f))), ((float)(0x1.2p3f)), ((float)(0x1.2p3f)), ((float)(0x1.8p1f)), ((int)(-1))))));
    ((com.moon.hW)(local7)).a(((com.moon.iX)(com.moon.i3.a(((float)((local8 - 0x1.cp1f))), ((float)((local9 - 0x1.cp1f))), ((float)(0x1.cp2f)), ((float)(0x1.cp2f)), ((float)(0x1.0p1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(this.n)).getValue())))).intValue()))))));
    ((com.moon.hW)(local7)).a(((com.moon.jA)(local6)));
    ((com.moon.hW)(local7)).b();
    this.k = ((float)((0x1.6p4f + (0x1.8p6f * ((com.moon.nY)(this.o)).c()))));
    super.b(((int)(p0)), ((int)(p1)));
    return;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7553;
      if (A[var3] == null) {
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
         long var5 = z[var3];
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
         Object[] var9 = (Object[])B.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               B.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/m9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         A[var3] = var15;
      }

      return A[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2143_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.ColorSetting)(this.n)).isAvailable())) != 0);
}


public void c(int p0, int p1) { __sourceHandlerCall_96fdeaee8267427874f7(this, p0, p1); }


private void d(int p0, int p1) { __sourceHandlerCall_0e8fb71f5465a3342e73(this, p0, p1); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2146_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.m9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(int p0, int p1) {
long local3 = (com.moon.m9.v ^ 53775156554694L);
    float local5 = (((com.moon.m9)(this)).a() + 0x1.0p3f);
    float local6 = (((com.moon.m9)(this)).b() + 0x1.2p2f);
    float local7 = (((com.moon.m9)(this)).c() - 0x1.0p4f);
    com.moon.jC local8 = com.moon.jC.a(((float)(local5)), ((float)(local6)), ((float)(local7)), ((float)((((com.moon.m9)(this)).d() - 0x1.2p2f))));
    com.moon.hW local9 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(local9)).a(((com.moon.iX)(com.moon.i3.a(((float)((((local5 + local7) - 0x1.1p3f) - 0x1.4p2f))), ((float)(((local6 + 0x1.1p3f) - 0x1.4p2f))), ((float)(0x1.4p3f)), ((float)(0x1.4p3f)), ((float)(0x1.cp1f)), ((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite501_10(10731, (666832934102999907L ^ local3))))))));
    ((com.moon.hW)(local9)).a(((com.moon.iX)(com.moon.i3.a(((float)((((local5 + 0x1.0p2f) + (this.u * (local7 - 0x1.0p3f))) - 0x1.2p2f))), ((float)((local6 + 0x1.5ap6f))), ((float)(0x1.2p3f)), ((float)(0x1.2p3f)), ((float)(0x1.8p1f)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    float local10 = ((local5 + 0x1.0p2f) + (this.s * (local7 - 0x1.0p3f)));
    float local11 = ((local6 + 0x1.8p4f) + ((0x1.0p0f - this.r) * 0x1.ep5f));
    ((com.moon.hW)(local9)).a(((com.moon.iX)(com.moon.i3.a(((float)((local10 - 0x1.2p2f))), ((float)((local11 - 0x1.2p2f))), ((float)(0x1.2p3f)), ((float)(0x1.2p3f)), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite501_20(27, (3167221203147557533L ^ local3))))))));
    ((com.moon.hW)(local9)).a(((com.moon.jA)(local8)));
    ((com.moon.hW)(local9)).b();
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


public void a(int p0, int p1, int p2) { __sourceHandlerCall_42ed2cf7c97d69fc7b1d(this, p0, p1, p2); }


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.n;
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
        byte[] spill899_0 = p0;
        life4_9 += 1;
        life5_44 = (spill899_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill899_1 = p0;
        life4_9 += 1;
        life5_76 = (spill899_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill899_2 = p0;
        life4_9 += 1;
        life5_91 = (spill899_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 29499);
    if (((com.moon.m9.x)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.m9.y)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.m9.y)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/m9", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.m9.w)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.m9.x)[life5_8] = com.moon.m9.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.m9.x)[life5_8];
}


private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite501_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite501_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2146_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2143_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
