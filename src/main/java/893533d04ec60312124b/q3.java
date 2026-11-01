package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class q3 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) { return __sourceHandlerCall_aa1948b5069a2a8422fc(this, p0); }


q3(com.moon.jJ p0) { super(); }

private static void __sourceConstructorBody_762b4835656abd40(com.moon.q3 receiver, com.moon.jJ p0) throws Throwable {
((com.moon.q3)(receiver)).a = ((com.moon.jJ)(p0));
    com.moon.q3.__sourceConstructorInit_762b4835656abd40_0(((com.moon.q3)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue138_36_0;
    int forestValue138_36_1;
    javax.crypto.SecretKeyFactory forestValue138_36_2;
    byte[] forestValue138_36_3;
    javax.crypto.Cipher forestValue138_53_0;
    int forestValue138_53_1;
    javax.crypto.SecretKeyFactory forestValue138_53_2;
    byte[] forestValue138_53_3;
    java.lang.String forestValue138_86_0;
    int forestValue138_86_1;
    java.lang.String forestValue138_98_0;
    java.lang.String forestValue138_122_0;
    javax.crypto.Cipher forestValue138_182_0;
    int forestValue138_182_1;
    javax.crypto.SecretKeyFactory forestValue138_182_2;
    byte[] forestValue138_182_3;
    javax.crypto.Cipher forestValue138_199_0;
    int forestValue138_199_1;
    javax.crypto.SecretKeyFactory forestValue138_199_2;
    byte[] forestValue138_199_3;
    javax.crypto.Cipher spill138_0;
    int spill138_1;
    javax.crypto.SecretKeyFactory spill138_2;
    byte[] spill138_3;
    byte[] spill138_4;
    java.lang.String spill138_5;
    int spill138_6;
    java.lang.String spill138_7;
    java.lang.String[] spill138_8;
    java.lang.String[] spill138_9;
    java.lang.String spill138_10;
    java.lang.String spill138_11;
    int spill138_12;
    javax.crypto.Cipher spill138_13;
    int spill138_14;
    javax.crypto.SecretKeyFactory spill138_15;
    byte[] spill138_16;
    byte[] spill138_17;
    java.lang.String spill138_18;
    int spill138_19;
    long[] spill138_20;
    int spill138_21;
    int spill138_22;
    long spill138_23;
    byte[] spill138_24;
    byte[] spill138_25;
    byte[] spill138_26;
    byte[] spill138_27;
    byte[] spill138_28;
    byte[] spill138_29;
    byte[] spill138_30;
    byte[] spill138_31;
    long spill138_32;
    int spill138_33;
    long life11_16;
    javax.crypto.Cipher life13_20;
    int life14_35;
    java.lang.String[] life20_66;
    int life18_68;
    java.lang.String life17_71;
    int life19_73;
    int life16_75;
    int life15_77;
    byte[] life21_93;
    javax.crypto.Cipher life0_169;
    int life1_184;
    long[] life6_215;
    int life3_217;
    java.lang.String life4_220;
    int life5_222;
    int life2_224;
    byte[] life7_232;
    long life8_309;
    byte[] life10_377;
    forest_join_199: {
    forest_join_153: {
    forest_join_53: {
    b = ((long)(((moom._a)(moom._c.a(((long)(-2285741573502531774L)), ((long)(-129480282137567104L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(21169396635838L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.q3.b ^ 53696215505713L);
    spill138_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill138_1 = 2;
    spill138_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp138_9_0 = new byte[8];
    spill138_3 = __stackOp138_9_0;
    (__stackOp138_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue138_36_0 = spill138_0;
    forestValue138_36_1 = spill138_1;
    forestValue138_36_2 = spill138_2;
    forestValue138_36_3 = spill138_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue138_53_0 = forestValue138_36_0;
        forestValue138_53_1 = forestValue138_36_1;
        forestValue138_53_2 = forestValue138_36_2;
        forestValue138_53_3 = forestValue138_36_3;
        break forest_join_53;
    }
    byte[] __stackOp138_10_0 = forestValue138_36_3;
    spill138_4 = __stackOp138_10_0;
    (__stackOp138_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue138_36_3 = spill138_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue138_53_0)).init(((int)(forestValue138_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue138_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue138_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life20_66 = new java.lang.String[8];
    life18_68 = 0;
    life19_73 = ((java.lang.String)((life17_71 = "çî\032Æ66ï}x4£f©%^Ù\025]â\022?`¥Ù4K}\022\007þ{Aö\023ðj×áíkñ\020âÓ9eß\026.XÂp§øg|¿\027Ý°¥T0¤;Ib\021á·»8Fp´ªPöa*¼åÍõ\034(í?û½ÌÈ\nõ´J²9h3F×FÛ~\0138Õq\001/\037ö$Ñ\026¿wêþûY{®íª°ZÁóË\f;XÉªvßÍ¸ÒQÅàvÄËQàZdbrÜ·þù@ÇHU;M¹¥_>7û²v\021ÇÛ°YãÿÈ\027I±#C\006³P\\y\0246ÑVzYÄ)±±ð\016F\037»å®\022`\005}Ê}0>ÛJ4\005FÑDø|§âCæ¬rS4ÎÔªàÞÃ\021T²#f[ü×Tø&Ù9òeq¢Ì@ÕvÊ95Ð\016_\034Ú.Y\027ôÒ+\030i\177\034fM\020\022©Jìa½É\034á\025!ûÑÛ\036ìPçÑ]ñØÉT¾C»\"c¥P¯Cå"))).length();
    life16_75 = 72;
    life15_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life15_77 += 1;
    spill138_5 = life17_71;
    int __stackOp138_14_0 = life15_77;
    forestValue138_86_0 = ((java.lang.String)(spill138_5)).substring(((int)(__stackOp138_14_0)), ((int)((__stackOp138_14_0 + life16_75))));
    forestValue138_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp138_16_0 = forestValue138_86_0;
    int __stackOp138_16_1 = forestValue138_86_1;
    spill138_6 = __stackOp138_16_1;
    byte[] __stackOp138_18_0 = ((java.lang.String)(__stackOp138_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp138_18_1 = life13_20;
    life21_93 = ((javax.crypto.Cipher)(__stackOp138_18_1)).doFinal(((byte[])(__stackOp138_18_0)));
    int __stackOp138_22_0 = spill138_6;
    java.lang.String __stackOp138_22_1 = ((java.lang.String)(com.moon.q3.a(((byte[])(life21_93))))).intern();
    spill138_7 = __stackOp138_22_1;
    switch (__stackOp138_22_0) {
default:
{
        forestValue138_98_0 = spill138_7;
        break forest_join_98;
    }
case 0:
{
        forestValue138_122_0 = spill138_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp138_23_0 = forestValue138_98_0;
    java.lang.String[] __stackOp138_23_1 = life20_66;
    spill138_8 = __stackOp138_23_1;
    java.lang.String __stackOp138_24_0 = __stackOp138_23_0;
    int __stackOp138_24_1 = (life18_68++);
    (spill138_8)[__stackOp138_24_1] = __stackOp138_24_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life19_73 = ((java.lang.String)((life17_71 = "üË\rÜå]\037\016'ó¹çÊ{\"ìVD[áÀl\020¦.aÍâÍ÷Ð6Cç¼Ðò±Ja8òN\013,Ýo|½º¢Z\tò\021k2q\004\025Ó««¬±Ô9,­ÝUf`5^ã}Úy~ý\017 î&=ÖÁ\006/S\035"))).length();
    life16_75 = 48;
    life15_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp138_26_0 = forestValue138_122_0;
    java.lang.String[] __stackOp138_26_1 = life20_66;
    spill138_9 = __stackOp138_26_1;
    java.lang.String __stackOp138_27_0 = __stackOp138_26_0;
    int __stackOp138_27_1 = (life18_68++);
    (spill138_9)[__stackOp138_27_1] = __stackOp138_27_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_153;
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    }
    life15_77 += 1;
    spill138_10 = life17_71;
    int __stackOp138_30_0 = life15_77;
    spill138_11 = ((java.lang.String)(spill138_10)).substring(((int)(__stackOp138_30_0)), ((int)((__stackOp138_30_0 + life16_75))));
    spill138_12 = 0;
    forestValue138_86_0 = spill138_11;
    forestValue138_86_1 = spill138_12;
    continue forest_cycle_86;
    }
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life20_66));
    d = ((java.lang.String[])(new java.lang.String[8]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    spill138_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill138_14 = 2;
    spill138_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp138_39_0 = new byte[8];
    spill138_16 = __stackOp138_39_0;
    (__stackOp138_39_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_184 = 1;
    forestValue138_182_0 = spill138_13;
    forestValue138_182_1 = spill138_14;
    forestValue138_182_2 = spill138_15;
    forestValue138_182_3 = spill138_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue138_199_0 = forestValue138_182_0;
        forestValue138_199_1 = forestValue138_182_1;
        forestValue138_199_2 = forestValue138_182_2;
        forestValue138_199_3 = forestValue138_182_3;
        break forest_join_199;
    }
    byte[] __stackOp138_40_0 = forestValue138_182_3;
    spill138_17 = __stackOp138_40_0;
    (__stackOp138_40_0)[life1_184] = ((byte) ((int) ((life11_16 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue138_182_3 = spill138_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue138_199_0)).init(((int)(forestValue138_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue138_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue138_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[2];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "6ÁÈ­áhÿ?gJÈåÕ¸#"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill138_18 = life4_220;
    spill138_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill138_18)).substring(((int)(spill138_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill138_20 = life6_215;
    spill138_21 = (life3_217++);
    long __stackOp138_46_0 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    int __stackOp138_46_1 = -1;
    spill138_22 = __stackOp138_46_1;
    spill138_23 = __stackOp138_46_0;
    recovery.source.CarrierOps.discard(__stackOp138_46_1);
    life8_309 = spill138_23;
    byte[] __stackOp138_48_0 = new byte[8];
    spill138_24 = __stackOp138_48_0;
    (__stackOp138_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp138_49_0 = spill138_24;
    spill138_25 = __stackOp138_49_0;
    (__stackOp138_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp138_50_0 = spill138_25;
    spill138_26 = __stackOp138_50_0;
    (__stackOp138_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp138_51_0 = spill138_26;
    spill138_27 = __stackOp138_51_0;
    (__stackOp138_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp138_52_0 = spill138_27;
    spill138_28 = __stackOp138_52_0;
    (__stackOp138_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp138_53_0 = spill138_28;
    spill138_29 = __stackOp138_53_0;
    (__stackOp138_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp138_54_0 = spill138_29;
    spill138_30 = __stackOp138_54_0;
    (__stackOp138_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp138_55_0 = spill138_30;
    spill138_31 = __stackOp138_55_0;
    (__stackOp138_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp138_56_0 = spill138_31;
    javax.crypto.Cipher __stackOp138_56_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp138_56_1)).doFinal(((byte[])(__stackOp138_56_0)));
    int __stackOp138_58_0 = spill138_22;
    long __stackOp138_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill138_32 = __stackOp138_58_1;
    spill138_33 = __stackOp138_58_0;
    recovery.source.CarrierOps.discard(__stackOp138_58_1);
    recovery.source.CarrierOps.discard(spill138_33);
    (spill138_20)[spill138_21] = spill138_32;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    f = ((long[])(life6_215));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_762b4835656abd40_0(com.moon.q3 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_d31fab43b39c017bb509(int a0, long a1) throws E;
private static final class __SourceHandler_d31fab43b39c017bb509 {

public static java.lang.String f130(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7908);
    if (((__fieldRead130_0())[life5_8] == null)) {
        life3_16 = __call130_3(__call130_2(__call130_1()));
        life4_21 = __cast130_6(__call130_5(__fieldRead130_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call130_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call130_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call130_10(__fieldRead130_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call130_12(__cast130_11((life4_21)[1]), life7_92);
        __call130_15(__cast130_13((life4_21)[0]), 2, life8_99, __cast130_14((life4_21)[2]));
        life9_116 = __call130_17((__fieldRead130_16())[life5_8], "ISO-8859-1");
        (__fieldRead130_18())[life5_8] = __call130_21(__call130_20(__cast130_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead130_22())[life5_8];
}
public static java.lang.String h130_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q3", local1);
}
private static native java.lang.String[] __fieldRead130_0() throws Throwable;
private static native java.lang.Thread __call130_1() throws Throwable;
private static native long __call130_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call130_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead130_4() throws Throwable;
private static native java.lang.Object __call130_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast130_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call130_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call130_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead130_9() throws Throwable;
private static native java.lang.Object __call130_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast130_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call130_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast130_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast130_14(java.lang.Object a0) throws Throwable;
private static native void __call130_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead130_16() throws Throwable;
private static native byte[] __call130_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead130_18() throws Throwable;
private static native javax.crypto.Cipher __cast130_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call130_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call130_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead130_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_bbc8d6da1b499fda2a2c(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_bbc8d6da1b499fda2a2c {

public static java.lang.invoke.CallSite f131(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill131_0 = life3_4;
    java.lang.invoke.MethodHandle spill131_1 = __call131_3(__methodHandleLiteral131_0(), __classLiteral131_1(), __call131_2(p2));
    int spill131_2 = 0;
    java.lang.Object[] __stackOp131_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill131_3 = __stackOp131_4_0;
    (__stackOp131_4_0)[0] = p0;
    java.lang.Object[] __stackOp131_5_0 = spill131_3;
    java.lang.Object[] spill131_4 = __stackOp131_5_0;
    (__stackOp131_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp131_6_0 = spill131_4;
    java.lang.Object[] spill131_5 = __stackOp131_6_0;
    (__stackOp131_6_0)[2] = p1;
    __call131_9(spill131_0, __call131_8(__call131_7(spill131_1, spill131_2, spill131_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h131_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2013100_6(__call2013100_5(__call2013100_3(__call2013100_2(__call2013100_1(__call2013100_0(new java.lang.StringBuilder(), "com/moon/q3"), " : "), p1), " : "), __call2013100_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral131_0() throws Throwable;
private static native java.lang.Object __classLiteral131_1() throws Throwable;
private static native int __call131_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call131_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call131_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call131_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call131_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2013100_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013100_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013100_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013100_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013100_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2013100_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013100_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_c9d39ec7cd89113181dc(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_c9d39ec7cd89113181dc {

public static java.lang.invoke.CallSite f132(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill132_0 = life3_4;
    java.lang.invoke.MethodHandle spill132_1 = __call132_3(__methodHandleLiteral132_0(), __classLiteral132_1(), __call132_2(p2));
    int spill132_2 = 0;
    java.lang.Object[] __stackOp132_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill132_3 = __stackOp132_4_0;
    (__stackOp132_4_0)[0] = p0;
    java.lang.Object[] __stackOp132_5_0 = spill132_3;
    java.lang.Object[] spill132_4 = __stackOp132_5_0;
    (__stackOp132_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp132_6_0 = spill132_4;
    java.lang.Object[] spill132_5 = __stackOp132_6_0;
    (__stackOp132_6_0)[2] = p1;
    __call132_9(spill132_0, __call132_8(__call132_7(spill132_1, spill132_2, spill132_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h132_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2013200_6(__call2013200_5(__call2013200_3(__call2013200_2(__call2013200_1(__call2013200_0(new java.lang.StringBuilder(), "com/moon/q3"), " : "), p1), " : "), __call2013200_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral132_0() throws Throwable;
private static native java.lang.Object __classLiteral132_1() throws Throwable;
private static native int __call132_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call132_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call132_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call132_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call132_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2013200_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013200_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013200_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013200_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013200_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2013200_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013200_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> org.luaj.vm2.Varargs __sourceHandlerCall_aa1948b5069a2a8422fc(com.moon.q3 a0, org.luaj.vm2.Varargs a1) throws E;
private static final class __SourceHandler_aa1948b5069a2a8422fc {

public static org.luaj.vm2.Varargs f166(com.moon.q3 receiver, org.luaj.vm2.Varargs p0) throws Throwable {
    java.lang.Object forestValue166_61_0;
    java.lang.Object forestValue166_68_0;
    int forestValue166_101_0;
    int forestValue166_117_0;
    int forestValue166_133_0;
    int forestValue166_149_0;
    int forestValue166_167_0;
    org.luaj.vm2.LuaValue forestValue166_196_0;
    java.lang.String[] spill166_0;
    org.luaj.vm2.LuaValue spill166_1;
    java.lang.Object spill166_2;
    boolean spill166_3;
    org.luaj.vm2.LuaValue spill166_4;
    com.moon.scripting.api.types.templates.TextTemplate spill166_5;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaValue life6_12;
    java.lang.String[] life4_13;
    org.luaj.vm2.LuaValue life7_17;
    org.luaj.vm2.LuaValue life8_21;
    org.luaj.vm2.LuaValue life9_25;
    org.luaj.vm2.LuaValue life10_33;
    org.luaj.vm2.LuaValue life11_41;
    java.lang.Object life12_62;
    com.moon.scripting.api.enums.CustomFontType life13_72;
    forest_join_196: {
    forest_join_179: {
    forest_join_167: {
    forest_join_163: {
    forest_join_149: {
    forest_join_147: {
    forest_join_133: {
    forest_join_131: {
    forest_join_117: {
    forest_join_115: {
    forest_join_101: {
    forest_join_99: {
    forest_join_83: {
    forest_join_72: {
    forest_join_68: {
    forest_join_61: {
    forest_join_58: {
    life2_3 = (__fieldRead166_0() ^ 45290241047042L);
    spill166_0 = __call166_1();
    life5_8 = __call166_2(p0, 1);
    life6_12 = __call166_3(p0, 2);
    life4_13 = spill166_0;
    life7_17 = __call166_4(p0, 3);
    life8_21 = __call166_5(p0, 4);
    life9_25 = __call166_6(p0, 5);
    life10_33 = __call166_8(p0, __invokedynamic166_7(6876, (9007993322456495419L ^ life2_3)));
    life11_41 = __call166_10(p0, __invokedynamic166_9(21289, (7949370760946351311L ^ life2_3)));
    spill166_1 = life5_8;
    if (!((life4_13 != null))) {
        forestValue166_61_0 = spill166_1;
        break forest_join_61;
    }
    if (!(__call166_11(spill166_1))) {
        break forest_join_58;
    }
    java.lang.String __stackOp166_14_0 = __call166_12(life5_8);
    java.lang.String __stackOp166_14_1 = __invokedynamic166_13(10239, (5951555754902202744L ^ life2_3));
    return __call166_16(__invokedynamic166_15(__stackOp166_14_1, __stackOp166_14_0));
    }
    forestValue166_61_0 = __call166_18(life5_8, __classLiteral166_17());
    }
    life12_62 = forestValue166_61_0;
    spill166_2 = life12_62;
    if (!((life4_13 != null))) {
        forestValue166_68_0 = spill166_2;
        break forest_join_68;
    }
    if (!((__instanceOf166_19(spill166_2) != 0))) {
        break forest_join_72;
    }
    forestValue166_68_0 = life12_62;
    }
    life13_72 = __cast166_20(forestValue166_68_0);
    if (!((life4_13 == null))) {
        break forest_join_83;
    }
    }
    java.lang.String __stackOp166_23_0 = __call166_21(life5_8);
    java.lang.String __stackOp166_23_1 = __invokedynamic166_22(2580, (5619326159804695701L ^ life2_3));
    return __call166_25(__invokedynamic166_24(__stackOp166_23_1, __stackOp166_23_0));
    }
    spill166_3 = __call166_26(life6_12);
    if (!((life4_13 != null))) {
        forestValue166_101_0 = __integerCategory166_27(spill166_3);
        break forest_join_101;
    }
    if (!((!spill166_3))) {
        break forest_join_99;
    }
    java.lang.String __stackOp166_30_0 = __call166_28(life6_12);
    java.lang.String __stackOp166_30_1 = __invokedynamic166_29(14464, (1527956744400352773L ^ life2_3));
    return __call166_32(__invokedynamic166_31(__stackOp166_30_1, __stackOp166_30_0));
    }
    forestValue166_101_0 = __integerCategory166_34(__call166_33(life7_17));
    }
    if (!((life4_13 != null))) {
        forestValue166_117_0 = forestValue166_101_0;
        break forest_join_117;
    }
    if (!((forestValue166_101_0 == 0))) {
        break forest_join_115;
    }
    java.lang.String __stackOp166_37_0 = __call166_35(life7_17);
    java.lang.String __stackOp166_37_1 = __invokedynamic166_36(32553, (5582938365985976749L ^ life2_3));
    return __call166_39(__invokedynamic166_38(__stackOp166_37_1, __stackOp166_37_0));
    }
    forestValue166_117_0 = __integerCategory166_41(__call166_40(life8_21));
    }
    if (!((life4_13 != null))) {
        forestValue166_133_0 = forestValue166_117_0;
        break forest_join_133;
    }
    if (!((forestValue166_117_0 == 0))) {
        break forest_join_131;
    }
    java.lang.String __stackOp166_44_0 = __call166_42(life8_21);
    java.lang.String __stackOp166_44_1 = __invokedynamic166_43(23047, (8830136011055748231L ^ life2_3));
    return __call166_46(__invokedynamic166_45(__stackOp166_44_1, __stackOp166_44_0));
    }
    forestValue166_133_0 = __integerCategory166_48(__call166_47(life9_25));
    }
    if (!((life4_13 != null))) {
        forestValue166_149_0 = forestValue166_133_0;
        break forest_join_149;
    }
    if (!((forestValue166_133_0 == 0))) {
        break forest_join_147;
    }
    java.lang.String __stackOp166_51_0 = __call166_49(life9_25);
    java.lang.String __stackOp166_51_1 = __invokedynamic166_50(7342, (2753122808221930029L ^ life2_3));
    return __call166_53(__invokedynamic166_52(__stackOp166_51_1, __stackOp166_51_0));
    }
    forestValue166_149_0 = __integerCategory166_55(__call166_54(life10_33));
    }
    if (!((life4_13 != null))) {
        forestValue166_167_0 = forestValue166_149_0;
        break forest_join_167;
    }
    if (!((forestValue166_149_0 == 0))) {
        break forest_join_163;
    }
    java.lang.String __stackOp166_58_0 = __call166_56(life10_33);
    java.lang.String __stackOp166_58_1 = __invokedynamic166_57(24559, (264906234597953897L ^ life2_3));
    return __call166_60(__invokedynamic166_59(__stackOp166_58_1, __stackOp166_58_0));
    }
    spill166_4 = life11_41;
    if (!((life4_13 != null))) {
        forestValue166_196_0 = spill166_4;
        break forest_join_196;
    }
    forestValue166_167_0 = __integerCategory166_62(__call166_61(spill166_4));
    }
    if (!((forestValue166_167_0 == 0))) {
        break forest_join_179;
    }
    java.lang.String __stackOp166_65_0 = __call166_63(life11_41);
    java.lang.String __stackOp166_65_1 = __invokedynamic166_64(29844, (2100953526330587670L ^ life2_3));
    return __call166_67(__invokedynamic166_66(__stackOp166_65_1, __stackOp166_65_0));
    }
    com.moon.scripting.api.types.templates.TextTemplate __stackOp166_69_0 = __sourceUninitializedNEW166_68();
    spill166_5 = __stackOp166_69_0;
    __explicitNewInit166_76(__stackOp166_69_0, life13_72, __call166_70(life6_12), __call166_71(life7_17), __call166_72(life8_21), __call166_73(life9_25), __call166_74(life10_33), __call166_75(life11_41));
    forestValue166_196_0 = __call166_77(spill166_5);
    }
    return forestValue166_196_0;
}
private static native long __fieldRead166_0() throws Throwable;
private static native java.lang.String[] __call166_1() throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_2(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_3(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_4(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_5(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_6(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native int __invokedynamic166_7(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_8(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native int __invokedynamic166_9(int a0, long a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_10(org.luaj.vm2.Varargs a0, int a1) throws Throwable;
private static native boolean __call166_11(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __call166_12(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_16(java.lang.String a0) throws Throwable;
private static native java.lang.Class __classLiteral166_17() throws Throwable;
private static native java.lang.Object __call166_18(org.luaj.vm2.LuaValue a0, java.lang.Class a1) throws Throwable;
private static native int __instanceOf166_19(java.lang.Object a0) throws Throwable;
private static native com.moon.scripting.api.enums.CustomFontType __cast166_20(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call166_21(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_24(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_25(java.lang.String a0) throws Throwable;
private static native boolean __call166_26(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory166_27(boolean value) throws Throwable;
private static native java.lang.String __call166_28(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_29(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_31(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_32(java.lang.String a0) throws Throwable;
private static native boolean __call166_33(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory166_34(boolean value) throws Throwable;
private static native java.lang.String __call166_35(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_36(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_38(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_39(java.lang.String a0) throws Throwable;
private static native boolean __call166_40(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory166_41(boolean value) throws Throwable;
private static native java.lang.String __call166_42(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_43(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_45(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_46(java.lang.String a0) throws Throwable;
private static native boolean __call166_47(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory166_48(boolean value) throws Throwable;
private static native java.lang.String __call166_49(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_50(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_52(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_53(java.lang.String a0) throws Throwable;
private static native boolean __call166_54(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory166_55(boolean value) throws Throwable;
private static native java.lang.String __call166_56(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_57(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_59(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_60(java.lang.String a0) throws Throwable;
private static native boolean __call166_61(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __integerCategory166_62(boolean value) throws Throwable;
private static native java.lang.String __call166_63(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native java.lang.String __invokedynamic166_64(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic166_66(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_67(java.lang.String a0) throws Throwable;
private static native com.moon.scripting.api.types.templates.TextTemplate __sourceUninitializedNEW166_68() throws Throwable;
private static native java.lang.String __call166_70(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native float __call166_71(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native float __call166_72(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native float __call166_73(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native int __call166_74(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native boolean __call166_75(org.luaj.vm2.LuaValue a0) throws Throwable;
private static native void __explicitNewInit166_76(com.moon.scripting.api.types.templates.TextTemplate a0, com.moon.scripting.api.enums.CustomFontType a1, java.lang.String a2, float a3, float a4, float a5, int a6, boolean a7) throws Throwable;
private static native org.luaj.vm2.LuaValue __call166_77(com.moon.scripting.api.types.templates.TextTemplate a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_c9d39ec7cd89113181dc(p0, p1, p2); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16257;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/q3", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.q3.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_d31fab43b39c017bb509(p0, p1); }


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
        byte[] spill1244_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1244_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1244_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1244_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1244_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1244_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_bbc8d6da1b499fda2a2c(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q3.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic166_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic166_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_24(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_31(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_38(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_45(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_52(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_59(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic166_66(java.lang.String a0, java.lang.String a1) throws E;
}
