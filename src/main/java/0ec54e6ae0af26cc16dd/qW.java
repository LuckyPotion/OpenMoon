package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class qW extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue100052_60_0;
    int forestValue100052_76_0;
    int forestValue100052_92_0;
    int forestValue100052_108_0;
    int forestValue100052_124_0;
    int forestValue100052_142_0;
    org.luaj.vm2.LuaValue forestValue100052_172_0;
    java.lang.String[] spill100052_0;
    boolean spill100052_1;
    org.luaj.vm2.LuaValue spill100052_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_7;
    org.luaj.vm2.LuaValue life6_11;
    org.luaj.vm2.LuaValue life7_15;
    org.luaj.vm2.LuaValue life8_19;
    org.luaj.vm2.LuaValue life9_23;
    org.luaj.vm2.LuaValue life10_31;
    org.luaj.vm2.LuaValue life11_40;
    java.lang.String[] life4_41;
    forest_join_172: {
    forest_join_154: {
    forest_join_142: {
    forest_join_138: {
    forest_join_124: {
    forest_join_122: {
    forest_join_108: {
    forest_join_106: {
    forest_join_92: {
    forest_join_90: {
    forest_join_76: {
    forest_join_74: {
    forest_join_60: {
    forest_join_58: {
    life2_3 = (com.moon.qW.b ^ 10625031262650L);
    life5_7 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_11 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_15 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life8_19 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life9_23 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    life10_31 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_6(9377, (7028657528982614936L ^ life2_3)))));
    spill100052_0 = com.moon.jJ.b__ArrayString();
    life11_40 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_9(1103, (6467272666768413559L ^ life2_3)))));
    life4_41 = spill100052_0;
    spill100052_1 = ((org.luaj.vm2.LuaValue)(life5_7)).isnumber();
    if (!((life4_41 != null))) {
        forestValue100052_60_0 = ((spill100052_1) ? 1 : 0);
        break forest_join_60;
    }
    if (!((!spill100052_1))) {
        break forest_join_58;
    }
    java.lang.String __stackOp100052_15_0 = ((org.luaj.vm2.LuaValue)(life5_7)).typename();
    java.lang.String __stackOp100052_15_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_14(26635, (97618920406989307L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_16(__stackOp100052_15_1, __stackOp100052_15_0))));
    }
    forestValue100052_60_0 = ((((org.luaj.vm2.LuaValue)(life6_11)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100052_76_0 = forestValue100052_60_0;
        break forest_join_76;
    }
    if (!((forestValue100052_60_0 == 0))) {
        break forest_join_74;
    }
    java.lang.String __stackOp100052_22_0 = ((org.luaj.vm2.LuaValue)(life6_11)).typename();
    java.lang.String __stackOp100052_22_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_21(30558, (2540117306184410795L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_23(__stackOp100052_22_1, __stackOp100052_22_0))));
    }
    forestValue100052_76_0 = ((((org.luaj.vm2.LuaValue)(life7_15)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100052_92_0 = forestValue100052_76_0;
        break forest_join_92;
    }
    if (!((forestValue100052_76_0 == 0))) {
        break forest_join_90;
    }
    java.lang.String __stackOp100052_29_0 = ((org.luaj.vm2.LuaValue)(life7_15)).typename();
    java.lang.String __stackOp100052_29_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_28(17023, (2214671047815304072L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_30(__stackOp100052_29_1, __stackOp100052_29_0))));
    }
    forestValue100052_92_0 = ((((org.luaj.vm2.LuaValue)(life8_19)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100052_108_0 = forestValue100052_92_0;
        break forest_join_108;
    }
    if (!((forestValue100052_92_0 == 0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp100052_36_0 = ((org.luaj.vm2.LuaValue)(life8_19)).typename();
    java.lang.String __stackOp100052_36_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_35(7547, (4120039923385584783L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_37(__stackOp100052_36_1, __stackOp100052_36_0))));
    }
    forestValue100052_108_0 = ((((org.luaj.vm2.LuaValue)(life9_23)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100052_124_0 = forestValue100052_108_0;
        break forest_join_124;
    }
    if (!((forestValue100052_108_0 == 0))) {
        break forest_join_122;
    }
    java.lang.String __stackOp100052_43_0 = ((org.luaj.vm2.LuaValue)(life9_23)).typename();
    java.lang.String __stackOp100052_43_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_42(6800, (3347981048915020646L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_44(__stackOp100052_43_1, __stackOp100052_43_0))));
    }
    forestValue100052_124_0 = ((((org.luaj.vm2.LuaValue)(life10_31)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100052_142_0 = forestValue100052_124_0;
        break forest_join_142;
    }
    if (!((forestValue100052_124_0 == 0))) {
        break forest_join_138;
    }
    java.lang.String __stackOp100052_50_0 = ((org.luaj.vm2.LuaValue)(life10_31)).typename();
    java.lang.String __stackOp100052_50_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_49(1486, (5377543613118862397L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_51(__stackOp100052_50_1, __stackOp100052_50_0))));
    }
    spill100052_2 = life11_40;
    if (!((life4_41 != null))) {
        forestValue100052_172_0 = spill100052_2;
        break forest_join_172;
    }
    forestValue100052_142_0 = ((((org.luaj.vm2.LuaValue)(spill100052_2)).isnumber()) ? 1 : 0);
    }
    if (!((forestValue100052_142_0 == 0))) {
        break forest_join_154;
    }
    java.lang.String __stackOp100052_57_0 = ((org.luaj.vm2.LuaValue)(life11_40)).typename();
    java.lang.String __stackOp100052_57_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_56(23715, (6432838887332646226L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100052_58(__stackOp100052_57_1, __stackOp100052_57_0))));
    }
    forestValue100052_172_0 = org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.templates.OutlinedRoundedRectTemplate(((org.luaj.vm2.LuaValue)(life5_7)).tofloat(), ((org.luaj.vm2.LuaValue)(life6_11)).tofloat(), ((org.luaj.vm2.LuaValue)(life7_15)).tofloat(), ((org.luaj.vm2.LuaValue)(life8_19)).tofloat(), ((org.luaj.vm2.LuaValue)(life9_23)).tofloat(), ((org.luaj.vm2.LuaValue)(life10_31)).tofloat(), ((org.luaj.vm2.LuaValue)(life11_40)).toint()))));
    }
    return forestValue100052_172_0;
}


qW(com.moon.jJ p0) { super(); }

private static void __sourceConstructorBody_09fe3ae97c80c97b(com.moon.qW receiver, com.moon.jJ p0) throws Throwable {
((com.moon.qW)(receiver)).a = ((com.moon.jJ)(p0));
    com.moon.qW.__sourceConstructorInit_09fe3ae97c80c97b_0(((com.moon.qW)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue195_36_0;
    int forestValue195_36_1;
    javax.crypto.SecretKeyFactory forestValue195_36_2;
    byte[] forestValue195_36_3;
    javax.crypto.Cipher forestValue195_53_0;
    int forestValue195_53_1;
    javax.crypto.SecretKeyFactory forestValue195_53_2;
    byte[] forestValue195_53_3;
    java.lang.String forestValue195_86_0;
    int forestValue195_86_1;
    java.lang.String forestValue195_98_0;
    java.lang.String forestValue195_122_0;
    javax.crypto.Cipher forestValue195_182_0;
    int forestValue195_182_1;
    javax.crypto.SecretKeyFactory forestValue195_182_2;
    byte[] forestValue195_182_3;
    javax.crypto.Cipher forestValue195_199_0;
    int forestValue195_199_1;
    javax.crypto.SecretKeyFactory forestValue195_199_2;
    byte[] forestValue195_199_3;
    javax.crypto.Cipher spill195_0;
    int spill195_1;
    javax.crypto.SecretKeyFactory spill195_2;
    byte[] spill195_3;
    byte[] spill195_4;
    java.lang.String spill195_5;
    int spill195_6;
    java.lang.String spill195_7;
    java.lang.String[] spill195_8;
    java.lang.String[] spill195_9;
    java.lang.String spill195_10;
    java.lang.String spill195_11;
    int spill195_12;
    javax.crypto.Cipher spill195_13;
    int spill195_14;
    javax.crypto.SecretKeyFactory spill195_15;
    byte[] spill195_16;
    byte[] spill195_17;
    java.lang.String spill195_18;
    int spill195_19;
    long[] spill195_20;
    int spill195_21;
    int spill195_22;
    long spill195_23;
    byte[] spill195_24;
    byte[] spill195_25;
    byte[] spill195_26;
    byte[] spill195_27;
    byte[] spill195_28;
    byte[] spill195_29;
    byte[] spill195_30;
    byte[] spill195_31;
    long spill195_32;
    int spill195_33;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(2291222213181222516L)), ((long)(-2140337426073329888L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(7847278630122L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.qW.b ^ 75091725727597L);
    spill195_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill195_1 = 2;
    spill195_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp195_9_0 = new byte[8];
    spill195_3 = __stackOp195_9_0;
    (__stackOp195_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue195_36_0 = spill195_0;
    forestValue195_36_1 = spill195_1;
    forestValue195_36_2 = spill195_2;
    forestValue195_36_3 = spill195_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue195_53_0 = forestValue195_36_0;
        forestValue195_53_1 = forestValue195_36_1;
        forestValue195_53_2 = forestValue195_36_2;
        forestValue195_53_3 = forestValue195_36_3;
        break forest_join_53;
    }
    byte[] __stackOp195_10_0 = forestValue195_36_3;
    spill195_4 = __stackOp195_10_0;
    (__stackOp195_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue195_36_3 = spill195_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue195_53_0)).init(((int)(forestValue195_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue195_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue195_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life20_66 = new java.lang.String[7];
    life18_68 = 0;
    life19_73 = ((java.lang.String)((life17_71 = "s´%¿«o\024ãÈÑjµGt§!êÇ%Ä¼F¨Þ+Ý\026¥z\023#¦+kÆTjÌÔ°V¹\000pµ0Ð£ÕËbsÈVfK}WYÓ\nÅ\036^Û\037VUwñu¾¼%tGCò9;f5\034ßÓ\00488Cnä³m\017ç\037µ4R»dúÈ{õ\021'OmLªº{ëg+:\024\036ÏÛ-DbÔ¥º<É08¢¶³üÓ8y\013¤¨Ô\037T%Vÿçð÷ jN8 \"}%VÎÆªÖl\007\002\001¹¬\025(9\nCdâ\036\033(wG\t¤EÔÉï·ó(À\003Ú\\ë\rM\tÎò¹X)1+³@N\002\fWæ\n«äÑ\030õ0%d¢~["))).length();
    life16_75 = 48;
    life15_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life15_77 += 1;
    spill195_5 = life17_71;
    int __stackOp195_14_0 = life15_77;
    forestValue195_86_0 = ((java.lang.String)(spill195_5)).substring(((int)(__stackOp195_14_0)), ((int)((__stackOp195_14_0 + life16_75))));
    forestValue195_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp195_16_0 = forestValue195_86_0;
    int __stackOp195_16_1 = forestValue195_86_1;
    spill195_6 = __stackOp195_16_1;
    byte[] __stackOp195_18_0 = ((java.lang.String)(__stackOp195_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp195_18_1 = life13_20;
    life21_93 = ((javax.crypto.Cipher)(__stackOp195_18_1)).doFinal(((byte[])(__stackOp195_18_0)));
    int __stackOp195_22_0 = spill195_6;
    java.lang.String __stackOp195_22_1 = ((java.lang.String)(com.moon.qW.a(((byte[])(life21_93))))).intern();
    spill195_7 = __stackOp195_22_1;
    switch (__stackOp195_22_0) {
default:
{
        forestValue195_98_0 = spill195_7;
        break forest_join_98;
    }
case 0:
{
        forestValue195_122_0 = spill195_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp195_23_0 = forestValue195_98_0;
    java.lang.String[] __stackOp195_23_1 = life20_66;
    spill195_8 = __stackOp195_23_1;
    java.lang.String __stackOp195_24_0 = __stackOp195_23_0;
    int __stackOp195_24_1 = (life18_68++);
    (spill195_8)[__stackOp195_24_1] = __stackOp195_24_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life19_73 = ((java.lang.String)((life17_71 = "ÉMíåÄ HNÜÅA¿\004#X@FÃg{M§\t\"<\177í\034Pÿ¬h\023ß]\007_}w[^[8Ë¨\b>kc\177z­Ípüv\023µ°ò^ÀU2r½êA7\023kì2ßÏ\177ÙàmJ\\ý¡Ø$­ÈÕÐDÒ'ÞÓ"))).length();
    life16_75 = 48;
    life15_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp195_26_0 = forestValue195_122_0;
    java.lang.String[] __stackOp195_26_1 = life20_66;
    spill195_9 = __stackOp195_26_1;
    java.lang.String __stackOp195_27_0 = __stackOp195_26_0;
    int __stackOp195_27_1 = (life18_68++);
    (spill195_9)[__stackOp195_27_1] = __stackOp195_27_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_153;
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    }
    life15_77 += 1;
    spill195_10 = life17_71;
    int __stackOp195_30_0 = life15_77;
    spill195_11 = ((java.lang.String)(spill195_10)).substring(((int)(__stackOp195_30_0)), ((int)((__stackOp195_30_0 + life16_75))));
    spill195_12 = 0;
    forestValue195_86_0 = spill195_11;
    forestValue195_86_1 = spill195_12;
    continue forest_cycle_86;
    }
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    continue forest_cycle_78;
    }
    }
    c = ((java.lang.String[])(life20_66));
    d = ((java.lang.String[])(new java.lang.String[7]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    spill195_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill195_14 = 2;
    spill195_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp195_39_0 = new byte[8];
    spill195_16 = __stackOp195_39_0;
    (__stackOp195_39_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_184 = 1;
    forestValue195_182_0 = spill195_13;
    forestValue195_182_1 = spill195_14;
    forestValue195_182_2 = spill195_15;
    forestValue195_182_3 = spill195_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue195_199_0 = forestValue195_182_0;
        forestValue195_199_1 = forestValue195_182_1;
        forestValue195_199_2 = forestValue195_182_2;
        forestValue195_199_3 = forestValue195_182_3;
        break forest_join_199;
    }
    byte[] __stackOp195_40_0 = forestValue195_182_3;
    spill195_17 = __stackOp195_40_0;
    (__stackOp195_40_0)[life1_184] = ((byte) ((int) ((life11_16 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue195_182_3 = spill195_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue195_199_0)).init(((int)(forestValue195_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue195_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue195_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[2];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "û×7Ò(ËÙ¯¤¿¶âÈ¹\004þ"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill195_18 = life4_220;
    spill195_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill195_18)).substring(((int)(spill195_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill195_20 = life6_215;
    spill195_21 = (life3_217++);
    long __stackOp195_46_0 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    int __stackOp195_46_1 = -1;
    spill195_22 = __stackOp195_46_1;
    spill195_23 = __stackOp195_46_0;
    recovery.source.CarrierOps.discard(__stackOp195_46_1);
    life8_309 = spill195_23;
    byte[] __stackOp195_48_0 = new byte[8];
    spill195_24 = __stackOp195_48_0;
    (__stackOp195_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp195_49_0 = spill195_24;
    spill195_25 = __stackOp195_49_0;
    (__stackOp195_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp195_50_0 = spill195_25;
    spill195_26 = __stackOp195_50_0;
    (__stackOp195_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp195_51_0 = spill195_26;
    spill195_27 = __stackOp195_51_0;
    (__stackOp195_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp195_52_0 = spill195_27;
    spill195_28 = __stackOp195_52_0;
    (__stackOp195_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp195_53_0 = spill195_28;
    spill195_29 = __stackOp195_53_0;
    (__stackOp195_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp195_54_0 = spill195_29;
    spill195_30 = __stackOp195_54_0;
    (__stackOp195_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp195_55_0 = spill195_30;
    spill195_31 = __stackOp195_55_0;
    (__stackOp195_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp195_56_0 = spill195_31;
    javax.crypto.Cipher __stackOp195_56_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp195_56_1)).doFinal(((byte[])(__stackOp195_56_0)));
    int __stackOp195_58_0 = spill195_22;
    long __stackOp195_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill195_32 = __stackOp195_58_1;
    spill195_33 = __stackOp195_58_0;
    recovery.source.CarrierOps.discard(__stackOp195_58_1);
    recovery.source.CarrierOps.discard(spill195_33);
    (spill195_20)[spill195_21] = spill195_32;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    f = ((long[])(life6_215));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_09fe3ae97c80c97b_0(com.moon.qW a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_ce5b4ad627c49d61a941(int a0, long a1) throws E;
private static final class __SourceHandler_ce5b4ad627c49d61a941 {

public static java.lang.String f173(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 32446);
    if (((__fieldRead173_0())[life5_8] == null)) {
        life3_16 = __call173_3(__call173_2(__call173_1()));
        life4_21 = __cast173_6(__call173_5(__fieldRead173_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call173_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call173_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call173_10(__fieldRead173_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call173_12(__cast173_11((life4_21)[1]), life7_92);
        __call173_15(__cast173_13((life4_21)[0]), 2, life8_99, __cast173_14((life4_21)[2]));
        life9_116 = __call173_17((__fieldRead173_16())[life5_8], "ISO-8859-1");
        (__fieldRead173_18())[life5_8] = __call173_21(__call173_20(__cast173_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead173_22())[life5_8];
}
public static java.lang.String h173_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/qW", local1);
}
private static native java.lang.String[] __fieldRead173_0() throws Throwable;
private static native java.lang.Thread __call173_1() throws Throwable;
private static native long __call173_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call173_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead173_4() throws Throwable;
private static native java.lang.Object __call173_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast173_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call173_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call173_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead173_9() throws Throwable;
private static native java.lang.Object __call173_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast173_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call173_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast173_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast173_14(java.lang.Object a0) throws Throwable;
private static native void __call173_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead173_16() throws Throwable;
private static native byte[] __call173_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead173_18() throws Throwable;
private static native javax.crypto.Cipher __cast173_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call173_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call173_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead173_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_bf1a451aabf2d79470a0(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_bf1a451aabf2d79470a0 {

public static java.lang.invoke.CallSite f174(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill174_0 = life3_4;
    java.lang.invoke.MethodHandle spill174_1 = __call174_3(__methodHandleLiteral174_0(), __classLiteral174_1(), __call174_2(p2));
    int spill174_2 = 0;
    java.lang.Object[] __stackOp174_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill174_3 = __stackOp174_4_0;
    (__stackOp174_4_0)[0] = p0;
    java.lang.Object[] __stackOp174_5_0 = spill174_3;
    java.lang.Object[] spill174_4 = __stackOp174_5_0;
    (__stackOp174_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp174_6_0 = spill174_4;
    java.lang.Object[] spill174_5 = __stackOp174_6_0;
    (__stackOp174_6_0)[2] = p1;
    __call174_9(spill174_0, __call174_8(__call174_7(spill174_1, spill174_2, spill174_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h174_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2017400_6(__call2017400_5(__call2017400_3(__call2017400_2(__call2017400_1(__call2017400_0(new java.lang.StringBuilder(), "com/moon/qW"), " : "), p1), " : "), __call2017400_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral174_0() throws Throwable;
private static native java.lang.Object __classLiteral174_1() throws Throwable;
private static native int __call174_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call174_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call174_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call174_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call174_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2017400_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017400_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017400_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017400_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017400_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2017400_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017400_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_446adb7b2c5fc9be5168(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_446adb7b2c5fc9be5168 {

public static java.lang.invoke.CallSite f175(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill175_0 = life3_4;
    java.lang.invoke.MethodHandle spill175_1 = __call175_3(__methodHandleLiteral175_0(), __classLiteral175_1(), __call175_2(p2));
    int spill175_2 = 0;
    java.lang.Object[] __stackOp175_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill175_3 = __stackOp175_4_0;
    (__stackOp175_4_0)[0] = p0;
    java.lang.Object[] __stackOp175_5_0 = spill175_3;
    java.lang.Object[] spill175_4 = __stackOp175_5_0;
    (__stackOp175_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp175_6_0 = spill175_4;
    java.lang.Object[] spill175_5 = __stackOp175_6_0;
    (__stackOp175_6_0)[2] = p1;
    __call175_9(spill175_0, __call175_8(__call175_7(spill175_1, spill175_2, spill175_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h175_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2017500_6(__call2017500_5(__call2017500_3(__call2017500_2(__call2017500_1(__call2017500_0(new java.lang.StringBuilder(), "com/moon/qW"), " : "), p1), " : "), __call2017500_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral175_0() throws Throwable;
private static native java.lang.Object __classLiteral175_1() throws Throwable;
private static native int __call175_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call175_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call175_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call175_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call175_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2017500_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017500_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017500_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2017500_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017500_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2017500_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2017500_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_446adb7b2c5fc9be5168(p0, p1, p2); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14451;
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
            throw new RuntimeException("com/moon/qW", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.qW.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_ce5b4ad627c49d61a941(p0, p1); }


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
        byte[] spill1300_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1300_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1300_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1300_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1300_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1300_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_bf1a451aabf2d79470a0(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.qW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_23(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_37(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_44(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_51(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100052_58(java.lang.String a0, java.lang.String a1) throws E;
}
