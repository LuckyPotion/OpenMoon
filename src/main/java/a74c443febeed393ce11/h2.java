package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class h2 {

private java.lang.String _name;

private int size;

private com.moon.b_ dataType;

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public h2() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(-2812300847943195851L)), ((long)(-2678045151681125988L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(118794529912081L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.h2.a ^ 65900262291068L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill124_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill124_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill124_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill124_14 = new byte[8];
    (__sourceSpill124_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill124_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation124_16 = __sourceSpill124_14;
    ((javax.crypto.Cipher)(__sourceSpill124_11)).init(((int)(__sourceSpill124_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill124_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation124_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[3];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "9Ý\031ÛÈ (\025ºÂ\026\004>0ÅºÞö¨iõ~p0Y\réF«³ãµ\003$áHFÜnÕoù\001¢d\0363»ár¢Îÿ |b{oÄ\005/öÊZ\033®¥@\"2\022o\000É9®\037W®ê;#Þ"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill124_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill124_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill124_29)).doFinal(((byte[])(__sourceSpill124_28)));
        java.lang.String __sourceSpill124_34 = ((java.lang.String)(com.moon.h2.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill124_35 = local20_life19;
        int __sourceSpill124_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill124_35)[__sourceSpill124_36] = __sourceSpill124_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    b = ((java.lang.String[])(local20_life19));
    c = ((java.lang.String[])(new java.lang.String[3]));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill124_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill124_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill124_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill124_47 = new byte[8];
    (__sourceSpill124_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill124_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation124_49 = __sourceSpill124_47;
    ((javax.crypto.Cipher)(__sourceSpill124_44)).init(((int)(__sourceSpill124_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill124_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation124_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[4];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "·=ö°ÁHz\022¨9ÅQu"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill124_58 = local4_life54;
        int __sourceSpill124_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill124_58)).substring(((int)(__sourceSpill124_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill124_63 = local6_life52;
        int __sourceSpill124_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill124_66 = new byte[8];
        (__sourceSpill124_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill124_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill124_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill124_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill124_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill124_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill124_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill124_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill124_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill124_67)).doFinal(((byte[])(__sourceSpill124_66)));
        (__sourceSpill124_63)[__sourceSpill124_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "'Å¯\024¯(Vs##nÑ"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill124_71 = local4_life54;
        int __sourceSpill124_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill124_71)).substring(((int)(__sourceSpill124_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill124_76 = local6_life52;
        int __sourceSpill124_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill124_79 = new byte[8];
        (__sourceSpill124_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill124_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill124_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill124_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill124_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill124_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill124_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill124_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill124_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill124_80)).doFinal(((byte[])(__sourceSpill124_79)));
        (__sourceSpill124_76)[__sourceSpill124_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    e = ((long[])(local6_life52));
    f = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forestValue44_14_0;
    java.lang.Object forestValue44_21_0;
    int forestValue44_35_0;
    com.moon.h2 forestValue44_41_0;
    java.lang.String forestValue44_54_0;
    int forestValue44_60_0;
    com.moon.b_ forestValue44_75_0;
    int forestValue44_83_0;
    java.lang.Object spill44_0;
    boolean spill44_1;
    com.moon.h2 spill44_2;
    java.lang.String spill44_3;
    boolean spill44_4;
    com.moon.b_ spill44_5;
    boolean spill44_6;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.moon.h2 life5_24;
    java.lang.String life6_46;
    java.lang.String life7_49;
    com.moon.b_ life8_70;
    com.moon.b_ life9_73;
    forest_join_83: {
    forest_join_82: {
    forest_join_80: {
    forest_join_75: {
    forest_join_74: {
    forest_join_61: {
    forest_join_60: {
    forest_join_59: {
    forest_join_54: {
    forest_join_53: {
    forest_join_41: {
    forest_join_40: {
    forest_join_35: {
    forest_join_31: {
    forest_join_21: {
    forest_join_20: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (com.moon.h2.a ^ 23835518114078L);
    life4_5 = com.moon.h4.b();
    spill44_0 = p0;
    if (!((life4_5 != null))) {
        forestValue44_14_0 = spill44_0;
        break forest_join_14;
    }
    if (!((spill44_0 == this))) {
        break forest_join_13;
    }
    return ((1) != 0);
    }
    forestValue44_14_0 = p0;
    }
    if (!((life4_5 != null))) {
        forestValue44_21_0 = forestValue44_14_0;
        break forest_join_21;
    }
    if (!((((forestValue44_14_0 instanceof com.moon.h2) ? 1 : 0) == 0))) {
        break forest_join_20;
    }
    return ((0) != 0);
    }
    forestValue44_21_0 = p0;
    }
    life5_24 = ((com.moon.h2)(forestValue44_21_0));
    spill44_1 = ((com.moon.h2)(life5_24)).a(((java.lang.Object)(this)));
    if (!((life4_5 != null))) {
        forestValue44_35_0 = ((spill44_1) ? 1 : 0);
        break forest_join_35;
    }
    if (!((!spill44_1))) {
        break forest_join_31;
    }
    return ((0) != 0);
    }
    spill44_2 = this;
    if (!((life4_5 != null))) {
        forestValue44_41_0 = spill44_2;
        break forest_join_41;
    }
    forestValue44_35_0 = ((com.moon.h2)(spill44_2)).a();
    }
    if (!((forestValue44_35_0 != ((com.moon.h2)(life5_24)).a()))) {
        break forest_join_40;
    }
    return ((0) != 0);
    }
    forestValue44_41_0 = this;
    }
    life6_46 = ((com.moon.h2)(forestValue44_41_0)).b();
    life7_49 = ((com.moon.h2)(life5_24)).b();
    spill44_3 = life6_46;
    if (!((life4_5 != null))) {
        forestValue44_54_0 = spill44_3;
        break forest_join_54;
    }
    if (!((spill44_3 == null))) {
        break forest_join_53;
    }
    if (!((life7_49 != null))) {
        break forest_join_61;
    }
    break forest_join_59;
    }
    forestValue44_54_0 = life6_46;
    }
    spill44_4 = ((java.lang.Object)(forestValue44_54_0)).equals(((java.lang.Object)(life7_49)));
    if (!((life4_5 != null))) {
        forestValue44_60_0 = ((spill44_4) ? 1 : 0);
        break forest_join_60;
    }
    if (!((!spill44_4))) {
        break forest_join_61;
    }
    }
    forestValue44_60_0 = 0;
    }
    return ((forestValue44_60_0) != 0);
    }
    life8_70 = ((com.moon.h2)(this)).a__b_();
    life9_73 = ((com.moon.h2)(life5_24)).a__b_();
    spill44_5 = life8_70;
    if (!((life4_5 != null))) {
        forestValue44_75_0 = spill44_5;
        break forest_join_75;
    }
    if (!((spill44_5 == null))) {
        break forest_join_74;
    }
    if (!((life9_73 != null))) {
        break forest_join_82;
    }
    break forest_join_80;
    }
    forestValue44_75_0 = life8_70;
    }
    spill44_6 = ((java.lang.Object)(forestValue44_75_0)).equals(((java.lang.Object)(life9_73)));
    if (!((life4_5 != null))) {
        forestValue44_83_0 = ((spill44_6) ? 1 : 0);
        break forest_join_83;
    }
    if (!((!spill44_6))) {
        break forest_join_82;
    }
    }
    return ((0) != 0);
    }
    forestValue44_83_0 = 1;
    }
    return ((forestValue44_83_0) != 0);
}


public java.lang.String toString() {
long local1 = (com.moon.h2.a ^ 70007663946612L);
    java.lang.String __sourceSpill413_4 = this.b();
    int __sourceSpill413_5 = this.a();
    com.moon.b_ local3 = ((com.moon.h2)(this)).a__b_();
    int local4 = __sourceSpill413_5;
    java.lang.String local5 = __sourceSpill413_4;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite413_9(__sourceIntrinsic_a86c261fcdee_originalDynamicSite413_6(22145, (7604921574623609693L ^ local1)), local5, __sourceIntrinsic_a86c261fcdee_originalDynamicSite413_7(11778, (5496447012789418975L ^ local1)), local4, __sourceIntrinsic_a86c261fcdee_originalDynamicSite413_8(8898, (3040776392193013533L ^ local1)), local3, ")");
}


public int hashCode() {
int forwardValue304_45_0;
    int forwardValue304_46_0;
    java.lang.String forwardValue304_46_1;
    int forwardValue304_47_0;
    int forwardValue304_47_1;
    int forwardValue304_69_0;
    int forwardValue304_70_0;
    com.moon.b_ forwardValue304_70_1;
    int forwardValue304_71_0;
    int forwardValue304_71_1;
    int forwardValue304_79_0;
    net.minecraft.entity.Entity[] spill304_0;
    int spill304_1;
    java.lang.String spill304_2;
    int spill304_3;
    com.moon.b_ spill304_4;
    int spill304_5;
    long life1_3;
    int life4_9;
    int life5_12;
    net.minecraft.entity.Entity[] life3_13;
    int life5_24;
    java.lang.String life6_27;
    int life5_53;
    com.moon.b_ life7_56;
    int life5_82;
    forward_join_79: {
    forward_join_71: {
    forward_join_70: {
    forward_join_69: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    life1_3 = (com.moon.h2.a ^ 72034073356702L);
    life4_9 = __sourceIntrinsic_1861091996aa_invokedynamic304_1(13115, (3649959247114945637L ^ life1_3));
    spill304_0 = com.moon.h4.b();
    life5_12 = 1;
    life3_13 = spill304_0;
    life5_24 = ((life5_12 * __sourceIntrinsic_1861091996aa_invokedynamic304_3(31705, (7749916291319008388L ^ life1_3))) + this.a());
    life6_27 = this.b();
    spill304_1 = (life5_24 * __sourceIntrinsic_1861091996aa_invokedynamic304_6(31705, (7749916291319008388L ^ life1_3)));
    spill304_2 = life6_27;
    if (!((life3_13 != null))) {
        forwardValue304_46_0 = spill304_1;
        forwardValue304_46_1 = spill304_2;
        break forward_join_46;
    }
    if (!((spill304_2 == null))) {
        forwardValue304_45_0 = spill304_1;
        break forward_join_45;
    }
    forwardValue304_47_0 = spill304_1;
    forwardValue304_47_1 = __sourceIntrinsic_1861091996aa_invokedynamic304_7(26074, (4755822340754018950L ^ life1_3));
    break forward_join_47;
    }
    forwardValue304_46_0 = forwardValue304_45_0;
    forwardValue304_46_1 = life6_27;
    }
    forwardValue304_47_0 = forwardValue304_46_0;
    forwardValue304_47_1 = ((java.lang.Object)(forwardValue304_46_1)).hashCode();
    }
    life5_53 = (forwardValue304_47_0 + forwardValue304_47_1);
    life7_56 = ((com.moon.h2)(this)).a__b_();
    spill304_3 = (life5_53 * __sourceIntrinsic_1861091996aa_invokedynamic304_10(31705, (7749916291319008388L ^ life1_3)));
    spill304_4 = life7_56;
    if (!((life3_13 != null))) {
        forwardValue304_70_0 = spill304_3;
        forwardValue304_70_1 = spill304_4;
        break forward_join_70;
    }
    if (!((spill304_4 == null))) {
        forwardValue304_69_0 = spill304_3;
        break forward_join_69;
    }
    forwardValue304_71_0 = spill304_3;
    forwardValue304_71_1 = __sourceIntrinsic_1861091996aa_invokedynamic304_11(23074, (4246025156899024253L ^ life1_3));
    break forward_join_71;
    }
    forwardValue304_70_0 = forwardValue304_69_0;
    forwardValue304_70_1 = life7_56;
    }
    forwardValue304_71_0 = forwardValue304_70_0;
    forwardValue304_71_1 = ((java.lang.Object)(forwardValue304_70_1)).hashCode();
    }
    life5_82 = (forwardValue304_71_0 + forwardValue304_71_1);
    spill304_5 = life5_82;
    if (!((life3_13 == null))) {
        forwardValue304_79_0 = spill304_5;
        break forward_join_79;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    forwardValue304_79_0 = spill304_5;
    }
    return forwardValue304_79_0;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.h2.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1328_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17648;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/h2", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


public java.lang.String b() {
return this._name;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.h2.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9369);
    if (((com.moon.h2.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.h2.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.h2.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/h2", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.h2.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.h2.c)[life5_8] = com.moon.h2.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.h2.c)[life5_8];
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
        byte[] spill453_0 = p0;
        life4_9 += 1;
        life5_44 = (spill453_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill453_1 = p0;
        life4_9 += 1;
        life5_76 = (spill453_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill453_2 = p0;
        life4_9 += 1;
        life5_91 = (spill453_2)[life4_9];
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
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1331_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h2"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a() {
return this.size;
}


public java.lang.String a__String() {
return this._name;
}


public com.moon.h2 a(com.moon.b_ p0) {
this.dataType = ((com.moon.b_)(p0));
    return this;
}


protected boolean a(java.lang.Object p0) {
return ((((p0 instanceof com.moon.h2) ? 1 : 0)) != 0);
}


public com.moon.h2 a(int p0) {
this.size = ((int)(p0));
    return this;
}


public com.moon.h2 a(java.lang.String p0) {
this._name = ((java.lang.String)(p0));
    return this;
}


public com.moon.b_ a__b_() {
return this.dataType;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1331_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1328_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic304_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic304_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic304_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic304_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic304_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic304_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite413_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite413_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite413_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite413_9(java.lang.String a0, java.lang.String a1, java.lang.String a2, int a3, java.lang.String a4, com.moon.b_ a5, java.lang.String a6) throws E;
}
