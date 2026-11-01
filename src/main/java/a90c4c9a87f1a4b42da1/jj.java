package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class jj {

private boolean a;

private boolean b;

private boolean c;

private boolean d;

private boolean e;

private static final long f;

private static final java.lang.String[] g;

private static final java.lang.String[] h;

private static final java.util.Map i;

private static final long[] j;

private static final java.lang.Integer[] k;

private static final java.util.Map l;

public jj() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-5399859329854613951L)), ((long)(-7628861818245681943L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(159388606228118L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.jj.f ^ 54247465788514L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill199_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill199_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill199_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill199_14 = new byte[8];
    (__sourceSpill199_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill199_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation199_16 = __sourceSpill199_14;
    ((javax.crypto.Cipher)(__sourceSpill199_11)).init(((int)(__sourceSpill199_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill199_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation199_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[5];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ÚQ\n±Q÷|ïô\003á}\023âJòX4XÜ7'>\r;µ(½o\r¥£I\035u/{yFbã\035tðx\016;f=\001R­E£/í[Ú}E(äÁ\033\006í\033ZïëÏ£ð`í½uIºä½s9\"ÂqÅRî\022ù¯\030Ð¤e"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill199_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill199_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill199_29)).doFinal(((byte[])(__sourceSpill199_28)));
        java.lang.String __sourceSpill199_34 = ((java.lang.String)(com.moon.jj.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill199_35 = local20_life19;
        int __sourceSpill199_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill199_35)[__sourceSpill199_36] = __sourceSpill199_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "Xi\bÛ\n\"+QéßÊ+\005ìæàî7æö¼\0013és\030 dË*\004`¯\n: qJãTû\nZf$ï¬3Q"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill199_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill199_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill199_42)).doFinal(((byte[])(__sourceSpill199_41)));
        java.lang.String __sourceSpill199_47 = ((java.lang.String)(com.moon.jj.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill199_48 = local20_life19;
        int __sourceSpill199_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill199_48)[__sourceSpill199_49] = __sourceSpill199_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    g = ((java.lang.String[])(local20_life19));
    h = ((java.lang.String[])(new java.lang.String[5]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill199_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill199_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill199_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill199_60 = new byte[8];
    (__sourceSpill199_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill199_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation199_62 = __sourceSpill199_60;
    ((javax.crypto.Cipher)(__sourceSpill199_57)).init(((int)(__sourceSpill199_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill199_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation199_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[6];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "8\034±\013BN%\002\031¹Çâ!ÔÉ\030ûÖÀ·dN\002¥\031,\003"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill199_71 = local4_life67;
        int __sourceSpill199_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill199_71)).substring(((int)(__sourceSpill199_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill199_76 = local6_life65;
        int __sourceSpill199_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill199_79 = new byte[8];
        (__sourceSpill199_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill199_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill199_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill199_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill199_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill199_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill199_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill199_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill199_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill199_80)).doFinal(((byte[])(__sourceSpill199_79)));
        (__sourceSpill199_76)[__sourceSpill199_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "àÞxYV¼\000¡wf Ý§Â="))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill199_84 = local4_life67;
        int __sourceSpill199_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill199_84)).substring(((int)(__sourceSpill199_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill199_89 = local6_life65;
        int __sourceSpill199_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill199_92 = new byte[8];
        (__sourceSpill199_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill199_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill199_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill199_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill199_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill199_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill199_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill199_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill199_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill199_93)).doFinal(((byte[])(__sourceSpill199_92)));
        (__sourceSpill199_89)[__sourceSpill199_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    j = ((long[])(local6_life65));
    k = ((java.lang.Integer[])(new java.lang.Integer[6]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue601_14_0;
    java.lang.Object forwardValue601_21_0;
    int forwardValue601_33_0;
    int forwardValue601_44_0;
    int forwardValue601_44_1;
    int forwardValue601_53_0;
    int forwardValue601_53_1;
    int forwardValue601_62_0;
    int forwardValue601_62_1;
    int forwardValue601_73_0;
    int forwardValue601_73_1;
    int forwardValue601_77_0;
    java.lang.Object spill601_0;
    boolean spill601_1;
    boolean spill601_2;
    boolean spill601_3;
    long life2_3;
    int life4_5;
    com.moon.jj life5_32;
    forward_join_77: {
    forward_join_76: {
    forward_join_73: {
    forward_join_67: {
    forward_join_62: {
    forward_join_58: {
    forward_join_53: {
    forward_join_49: {
    forward_join_44: {
    forward_join_40: {
    forward_join_33: {
    forward_join_31: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.jj.f ^ 104185923714156L);
    life4_5 = com.moon.jm.b();
    spill601_0 = p0;
    if (!((life4_5 != 0))) {
        forwardValue601_14_0 = spill601_0;
        break forward_join_14;
    }
    if (!((spill601_0 == this))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue601_14_0 = p0;
    }
    if (!((life4_5 != 0))) {
        forwardValue601_21_0 = forwardValue601_14_0;
        break forward_join_21;
    }
    if (!((((forwardValue601_14_0 instanceof com.moon.jj) ? 1 : 0) == 0))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue601_21_0 = p0;
    }
    life5_32 = ((com.moon.jj)(forwardValue601_21_0));
    spill601_1 = ((com.moon.jj)(life5_32)).a(((java.lang.Object)(this)));
    if (!((life4_5 != 0))) {
        forwardValue601_33_0 = ((spill601_1) ? 1 : 0);
        break forward_join_33;
    }
    if (!((!spill601_1))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue601_33_0 = ((((com.moon.jj)(this)).a__Boolean()) ? 1 : 0);
    }
    spill601_2 = ((com.moon.jj)(life5_32)).a__Boolean();
    if (!((life4_5 != 0))) {
        forwardValue601_44_0 = forwardValue601_33_0;
        forwardValue601_44_1 = ((spill601_2) ? 1 : 0);
        break forward_join_44;
    }
    if (!((forwardValue601_33_0 != ((spill601_2) ? 1 : 0)))) {
        break forward_join_40;
    }
    return ((0) != 0);
    }
    forwardValue601_44_0 = ((this.b()) ? 1 : 0);
    forwardValue601_44_1 = ((((com.moon.jj)(life5_32)).b()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue601_53_0 = forwardValue601_44_0;
        forwardValue601_53_1 = forwardValue601_44_1;
        break forward_join_53;
    }
    if (!((forwardValue601_44_0 != forwardValue601_44_1))) {
        break forward_join_49;
    }
    return ((0) != 0);
    }
    forwardValue601_53_0 = ((this.c()) ? 1 : 0);
    forwardValue601_53_1 = ((((com.moon.jj)(life5_32)).c()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue601_62_0 = forwardValue601_53_0;
        forwardValue601_62_1 = forwardValue601_53_1;
        break forward_join_62;
    }
    if (!((forwardValue601_53_0 != forwardValue601_53_1))) {
        break forward_join_58;
    }
    return ((0) != 0);
    }
    forwardValue601_62_0 = ((this.d()) ? 1 : 0);
    forwardValue601_62_1 = ((((com.moon.jj)(life5_32)).d()) ? 1 : 0);
    }
    if (!((life4_5 != 0))) {
        forwardValue601_73_0 = forwardValue601_62_0;
        forwardValue601_73_1 = forwardValue601_62_1;
        break forward_join_73;
    }
    if (!((forwardValue601_62_0 != forwardValue601_62_1))) {
        break forward_join_67;
    }
    return ((0) != 0);
    }
    spill601_3 = this.e();
    if (!((life4_5 != 0))) {
        forwardValue601_77_0 = ((spill601_3) ? 1 : 0);
        break forward_join_77;
    }
    forwardValue601_73_0 = ((spill601_3) ? 1 : 0);
    forwardValue601_73_1 = ((((com.moon.jj)(life5_32)).e()) ? 1 : 0);
    }
    if (!((forwardValue601_73_0 != forwardValue601_73_1))) {
        break forward_join_76;
    }
    return ((0) != 0);
    }
    forwardValue601_77_0 = 1;
    }
    return ((forwardValue601_77_0) != 0);
}


public java.lang.String toString() {
long local1 = (com.moon.jj.f ^ 8244664474209L);
    boolean __sourceSpill578_6 = ((com.moon.jj)(this)).a__Boolean();
    boolean __sourceSpill578_7 = this.b();
    boolean __sourceSpill578_8 = this.c();
    boolean __sourceSpill578_9 = this.d();
    boolean local3 = this.e();
    boolean local4 = __sourceSpill578_9;
    boolean local5 = __sourceSpill578_8;
    boolean local6 = __sourceSpill578_7;
    boolean local7 = __sourceSpill578_6;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_15(__sourceIntrinsic_a86c261fcdee_originalDynamicSite578_10(22061, (6623313770744739874L ^ local1)), local7, __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_11(12962, (6800254727491787944L ^ local1)), local6, __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_12(28299, (6099394472110899333L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_13(26926, (4477903878289049378L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_14(5832, (7627344912446732485L ^ local1)), local3, ")");
}


public int hashCode() {
int forwardValue602_31_0;
    int forwardValue602_31_1;
    int forwardValue602_32_0;
    int forwardValue602_37_0;
    int forwardValue602_37_1;
    int forwardValue602_56_0;
    int forwardValue602_56_1;
    int forwardValue602_57_0;
    int forwardValue602_62_0;
    int forwardValue602_62_1;
    int forwardValue602_81_0;
    int forwardValue602_81_1;
    int forwardValue602_82_0;
    int forwardValue602_87_0;
    int forwardValue602_87_1;
    int forwardValue602_106_0;
    int forwardValue602_106_1;
    int forwardValue602_107_0;
    int forwardValue602_112_0;
    int forwardValue602_112_1;
    int forwardValue602_131_0;
    int forwardValue602_131_1;
    int forwardValue602_132_0;
    int forwardValue602_137_0;
    int forwardValue602_137_1;
    int forwardValue602_145_0;
    int spill602_0;
    int spill602_1;
    boolean spill602_2;
    int spill602_3;
    boolean spill602_4;
    int spill602_5;
    boolean spill602_6;
    int spill602_7;
    boolean spill602_8;
    int spill602_9;
    boolean spill602_10;
    int spill602_11;
    long life1_3;
    int life4_10;
    int life3_11;
    int life5_13;
    int life5_41;
    int life5_69;
    int life5_97;
    int life5_125;
    int life5_153;
    forward_join_145: {
    forward_join_137: {
    forward_join_132: {
    forward_join_131: {
    forward_join_112: {
    forward_join_107: {
    forward_join_106: {
    forward_join_87: {
    forward_join_82: {
    forward_join_81: {
    forward_join_62: {
    forward_join_57: {
    forward_join_56: {
    forward_join_37: {
    forward_join_32: {
    forward_join_31: {
    life1_3 = (com.moon.jj.f ^ 61322128806569L);
    spill602_0 = com.moon.jm.c();
    life4_10 = __sourceIntrinsic_1861091996aa_invokedynamic602_2(5197, (6014351190087001410L ^ life1_3));
    life3_11 = spill602_0;
    life5_13 = 1;
    spill602_1 = (life5_13 * __sourceIntrinsic_1861091996aa_invokedynamic602_3(25459, (238560004062089854L ^ life1_3)));
    spill602_2 = ((com.moon.jj)(this)).a__Boolean();
    if (!((life3_11 == 0))) {
        forwardValue602_31_0 = spill602_1;
        forwardValue602_31_1 = ((spill602_2) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill602_2)) {
        forwardValue602_32_0 = spill602_1;
        break forward_join_32;
    }
    forwardValue602_31_0 = spill602_1;
    forwardValue602_31_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_6(19356, (876876699990506130L ^ life1_3));
    }
    forwardValue602_37_0 = forwardValue602_31_0;
    forwardValue602_37_1 = forwardValue602_31_1;
    break forward_join_37;
    }
    forwardValue602_37_0 = forwardValue602_32_0;
    forwardValue602_37_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_7(23092, (5855770809874262847L ^ life1_3));
    }
    life5_41 = (forwardValue602_37_0 + forwardValue602_37_1);
    spill602_3 = (life5_41 * __sourceIntrinsic_1861091996aa_invokedynamic602_8(25459, (238560004062089854L ^ life1_3)));
    spill602_4 = this.b();
    if (!((life3_11 == 0))) {
        forwardValue602_56_0 = spill602_3;
        forwardValue602_56_1 = ((spill602_4) ? 1 : 0);
        break forward_join_56;
    }
    if (!(spill602_4)) {
        forwardValue602_57_0 = spill602_3;
        break forward_join_57;
    }
    forwardValue602_56_0 = spill602_3;
    forwardValue602_56_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_11(30075, (4079563195386528887L ^ life1_3));
    }
    forwardValue602_62_0 = forwardValue602_56_0;
    forwardValue602_62_1 = forwardValue602_56_1;
    break forward_join_62;
    }
    forwardValue602_62_0 = forwardValue602_57_0;
    forwardValue602_62_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_12(30425, (6487871496138164179L ^ life1_3));
    }
    life5_69 = (forwardValue602_62_0 + forwardValue602_62_1);
    spill602_5 = (life5_69 * __sourceIntrinsic_1861091996aa_invokedynamic602_13(25459, (238560004062089854L ^ life1_3)));
    spill602_6 = this.c();
    if (!((life3_11 == 0))) {
        forwardValue602_81_0 = spill602_5;
        forwardValue602_81_1 = ((spill602_6) ? 1 : 0);
        break forward_join_81;
    }
    if (!(spill602_6)) {
        forwardValue602_82_0 = spill602_5;
        break forward_join_82;
    }
    forwardValue602_81_0 = spill602_5;
    forwardValue602_81_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_16(30075, (4079563195386528887L ^ life1_3));
    }
    forwardValue602_87_0 = forwardValue602_81_0;
    forwardValue602_87_1 = forwardValue602_81_1;
    break forward_join_87;
    }
    forwardValue602_87_0 = forwardValue602_82_0;
    forwardValue602_87_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_17(30425, (6487871496138164179L ^ life1_3));
    }
    life5_97 = (forwardValue602_87_0 + forwardValue602_87_1);
    spill602_7 = (life5_97 * __sourceIntrinsic_1861091996aa_invokedynamic602_18(25459, (238560004062089854L ^ life1_3)));
    spill602_8 = this.d();
    if (!((life3_11 == 0))) {
        forwardValue602_106_0 = spill602_7;
        forwardValue602_106_1 = ((spill602_8) ? 1 : 0);
        break forward_join_106;
    }
    if (!(spill602_8)) {
        forwardValue602_107_0 = spill602_7;
        break forward_join_107;
    }
    forwardValue602_106_0 = spill602_7;
    forwardValue602_106_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_21(30075, (4079563195386528887L ^ life1_3));
    }
    forwardValue602_112_0 = forwardValue602_106_0;
    forwardValue602_112_1 = forwardValue602_106_1;
    break forward_join_112;
    }
    forwardValue602_112_0 = forwardValue602_107_0;
    forwardValue602_112_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_22(30425, (6487871496138164179L ^ life1_3));
    }
    life5_125 = (forwardValue602_112_0 + forwardValue602_112_1);
    spill602_9 = (life5_125 * __sourceIntrinsic_1861091996aa_invokedynamic602_23(25459, (238560004062089854L ^ life1_3)));
    spill602_10 = this.e();
    if (!((life3_11 == 0))) {
        forwardValue602_131_0 = spill602_9;
        forwardValue602_131_1 = ((spill602_10) ? 1 : 0);
        break forward_join_131;
    }
    if (!(spill602_10)) {
        forwardValue602_132_0 = spill602_9;
        break forward_join_132;
    }
    forwardValue602_131_0 = spill602_9;
    forwardValue602_131_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_26(30075, (4079563195386528887L ^ life1_3));
    }
    forwardValue602_137_0 = forwardValue602_131_0;
    forwardValue602_137_1 = forwardValue602_131_1;
    break forward_join_137;
    }
    forwardValue602_137_0 = forwardValue602_132_0;
    forwardValue602_137_1 = __sourceIntrinsic_1861091996aa_invokedynamic602_27(30425, (6487871496138164179L ^ life1_3));
    }
    life5_153 = (forwardValue602_137_0 + forwardValue602_137_1);
    spill602_11 = life5_153;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue602_145_0 = spill602_11;
        break forward_join_145;
    }
    life3_11 += 1;
    com.moon.jm.b(((int)(life3_11)));
    forwardValue602_145_0 = spill602_11;
    }
    return forwardValue602_145_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.jj.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1967_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 2713;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/jj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


public boolean b() {
return ((((this.b) ? 1 : 0)) != 0);
}


public com.moon.jj b(boolean p0) {
this.b = ((boolean)(p0));
    return this;
}


public boolean e() {
return ((((this.e) ? 1 : 0)) != 0);
}


public com.moon.jj e(boolean p0) {
this.e = ((boolean)(p0));
    return this;
}


public boolean c() {
return ((((this.c) ? 1 : 0)) != 0);
}


public com.moon.jj c(boolean p0) {
this.c = ((boolean)(p0));
    return this;
}


public com.moon.jj d(boolean p0) {
this.d = ((boolean)(p0));
    return this;
}


public boolean d() {
return ((((this.d) ? 1 : 0)) != 0);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1968_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jj.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a() {
this.a = ((boolean)(false));
    this.b = ((boolean)(false));
    this.c = ((boolean)(false));
    this.d = ((boolean)(false));
    this.e = ((boolean)(false));
    return;
}


public boolean a__Boolean() {
return ((((this.a) ? 1 : 0)) != 0);
}


protected boolean a(java.lang.Object p0) {
return ((((p0 instanceof com.moon.jj) ? 1 : 0)) != 0);
}


public com.moon.jj a(boolean p0) {
this.a = ((boolean)(p0));
    return this;
}


private static moom.Oo a(moom.Oo p0) {
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
        byte[] spill818_0 = p0;
        life4_9 += 1;
        life5_44 = (spill818_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill818_1 = p0;
        life4_9 += 1;
        life5_76 = (spill818_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill818_2 = p0;
        life4_9 += 1;
        life5_91 = (spill818_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7504);
    if (((com.moon.jj.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jj.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jj.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jj", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jj.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jj.h)[life5_8] = com.moon.jj.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jj.h)[life5_8];
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1968_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1967_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic602_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite578_15(java.lang.String a0, boolean a1, java.lang.String a2, boolean a3, java.lang.String a4, boolean a5, java.lang.String a6, boolean a7, java.lang.String a8, boolean a9, java.lang.String a10) throws E;
}
