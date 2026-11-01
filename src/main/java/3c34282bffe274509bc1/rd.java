package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class rd extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jR a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
java.lang.Object forestValue100060_61_0;
    java.lang.Object forestValue100060_68_0;
    int forestValue100060_101_0;
    int forestValue100060_117_0;
    int forestValue100060_133_0;
    int forestValue100060_149_0;
    int forestValue100060_167_0;
    org.luaj.vm2.LuaValue forestValue100060_197_0;
    int spill100060_0;
    org.luaj.vm2.LuaValue spill100060_1;
    java.lang.Object spill100060_2;
    boolean spill100060_3;
    org.luaj.vm2.LuaValue spill100060_4;
    long life2_3;
    org.luaj.vm2.LuaValue life5_7;
    org.luaj.vm2.LuaValue life6_11;
    org.luaj.vm2.LuaValue life7_15;
    org.luaj.vm2.LuaValue life8_20;
    int life4_21;
    org.luaj.vm2.LuaValue life9_25;
    org.luaj.vm2.LuaValue life10_33;
    org.luaj.vm2.LuaValue life11_41;
    java.lang.Object life12_62;
    com.moon.scripting.api.enums.CustomFontType life13_72;
    forest_join_197: {
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
    life2_3 = (com.moon.rd.b ^ 62366937587926L);
    life5_7 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_11 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_15 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    spill100060_0 = com.moon.jN.b();
    life8_20 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life4_21 = spill100060_0;
    life9_25 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    life10_33 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_7(5523, (701435383946179933L ^ life2_3)))));
    life11_41 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_9(4993, (7629524819324302158L ^ life2_3)))));
    spill100060_1 = life5_7;
    if (!((life4_21 != 0))) {
        forestValue100060_61_0 = spill100060_1;
        break forest_join_61;
    }
    if (!(((org.luaj.vm2.LuaValue)(spill100060_1)).isnil())) {
        break forest_join_58;
    }
    java.lang.String __stackOp100060_14_0 = ((org.luaj.vm2.LuaValue)(life5_7)).typename();
    java.lang.String __stackOp100060_14_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_13(28375, (3193334895323639535L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_15(__stackOp100060_14_1, __stackOp100060_14_0))));
    }
    forestValue100060_61_0 = org.luaj.vm2.lib.jse.CoerceLuaToJava.coerce(((org.luaj.vm2.LuaValue)(life5_7)), ((java.lang.Class)(java.lang.Object.class)));
    }
    life12_62 = forestValue100060_61_0;
    spill100060_2 = life12_62;
    if (!((life4_21 != 0))) {
        forestValue100060_68_0 = spill100060_2;
        break forest_join_68;
    }
    if (!((((spill100060_2 instanceof com.moon.scripting.api.enums.CustomFontType) ? 1 : 0) != 0))) {
        break forest_join_72;
    }
    forestValue100060_68_0 = life12_62;
    }
    life13_72 = ((com.moon.scripting.api.enums.CustomFontType)(forestValue100060_68_0));
    if (!((life4_21 == 0))) {
        break forest_join_83;
    }
    }
    java.lang.String __stackOp100060_23_0 = ((org.luaj.vm2.LuaValue)(life5_7)).typename();
    java.lang.String __stackOp100060_23_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_22(31359, (6086260175013050950L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_24(__stackOp100060_23_1, __stackOp100060_23_0))));
    }
    spill100060_3 = ((org.luaj.vm2.LuaValue)(life6_11)).isstring();
    if (!((life4_21 != 0))) {
        forestValue100060_101_0 = ((spill100060_3) ? 1 : 0);
        break forest_join_101;
    }
    if (!((!spill100060_3))) {
        break forest_join_99;
    }
    java.lang.String __stackOp100060_30_0 = ((org.luaj.vm2.LuaValue)(life6_11)).typename();
    java.lang.String __stackOp100060_30_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_29(15080, (5771101769659955927L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_31(__stackOp100060_30_1, __stackOp100060_30_0))));
    }
    forestValue100060_101_0 = ((((org.luaj.vm2.LuaValue)(life7_15)).isstring()) ? 1 : 0);
    }
    if (!((life4_21 != 0))) {
        forestValue100060_117_0 = forestValue100060_101_0;
        break forest_join_117;
    }
    if (!((forestValue100060_101_0 == 0))) {
        break forest_join_115;
    }
    java.lang.String __stackOp100060_37_0 = ((org.luaj.vm2.LuaValue)(life7_15)).typename();
    java.lang.String __stackOp100060_37_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_36(7203, (3141168899742964760L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_38(__stackOp100060_37_1, __stackOp100060_37_0))));
    }
    forestValue100060_117_0 = ((((org.luaj.vm2.LuaValue)(life8_20)).isnumber()) ? 1 : 0);
    }
    if (!((life4_21 != 0))) {
        forestValue100060_133_0 = forestValue100060_117_0;
        break forest_join_133;
    }
    if (!((forestValue100060_117_0 == 0))) {
        break forest_join_131;
    }
    java.lang.String __stackOp100060_44_0 = ((org.luaj.vm2.LuaValue)(life8_20)).typename();
    java.lang.String __stackOp100060_44_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_43(27346, (192527811134417644L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_45(__stackOp100060_44_1, __stackOp100060_44_0))));
    }
    forestValue100060_133_0 = ((((org.luaj.vm2.LuaValue)(life9_25)).isnumber()) ? 1 : 0);
    }
    if (!((life4_21 != 0))) {
        forestValue100060_149_0 = forestValue100060_133_0;
        break forest_join_149;
    }
    if (!((forestValue100060_133_0 == 0))) {
        break forest_join_147;
    }
    java.lang.String __stackOp100060_51_0 = ((org.luaj.vm2.LuaValue)(life9_25)).typename();
    java.lang.String __stackOp100060_51_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_50(26295, (2056814031745607306L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_52(__stackOp100060_51_1, __stackOp100060_51_0))));
    }
    forestValue100060_149_0 = ((((org.luaj.vm2.LuaValue)(life10_33)).isnumber()) ? 1 : 0);
    }
    if (!((life4_21 != 0))) {
        forestValue100060_167_0 = forestValue100060_149_0;
        break forest_join_167;
    }
    if (!((forestValue100060_149_0 == 0))) {
        break forest_join_163;
    }
    java.lang.String __stackOp100060_58_0 = ((org.luaj.vm2.LuaValue)(life10_33)).typename();
    java.lang.String __stackOp100060_58_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_57(20413, (4839342512898559879L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_59(__stackOp100060_58_1, __stackOp100060_58_0))));
    }
    spill100060_4 = life11_41;
    if (!((life4_21 != 0))) {
        forestValue100060_197_0 = spill100060_4;
        break forest_join_197;
    }
    forestValue100060_167_0 = ((((org.luaj.vm2.LuaValue)(spill100060_4)).isboolean()) ? 1 : 0);
    }
    if (!((forestValue100060_167_0 == 0))) {
        break forest_join_179;
    }
    java.lang.String __stackOp100060_65_0 = ((org.luaj.vm2.LuaValue)(life11_41)).typename();
    java.lang.String __stackOp100060_65_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_64(17862, (635229653402600954L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100060_66(__stackOp100060_65_1, __stackOp100060_65_0))));
    }
    ((com.moon.j0)(((com.moon.jR)(this.a)).c)).text(((com.moon.scripting.api.enums.CustomFontType)(life13_72)), ((java.lang.String)(((org.luaj.vm2.LuaValue)(life6_11)).tojstring())), ((float)(((org.luaj.vm2.LuaValue)(life7_15)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life8_20)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life9_25)).tofloat())), ((int)(((org.luaj.vm2.LuaValue)(life10_33)).toint())), ((boolean)(((org.luaj.vm2.LuaValue)(life11_41)).toboolean())));
    forestValue100060_197_0 = com.moon.rd.NIL;
    }
    return forestValue100060_197_0;
}


rd(com.moon.jR p0) { super(); }

private static void __sourceConstructorBody_028af0b57a92dbce(com.moon.rd receiver, com.moon.jR p0) throws Throwable {
((com.moon.rd)(receiver)).a = ((com.moon.jR)(p0));
    com.moon.rd.__sourceConstructorInit_028af0b57a92dbce_0(((com.moon.rd)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue297_36_0;
    int forestValue297_36_1;
    javax.crypto.SecretKeyFactory forestValue297_36_2;
    byte[] forestValue297_36_3;
    javax.crypto.Cipher forestValue297_53_0;
    int forestValue297_53_1;
    javax.crypto.SecretKeyFactory forestValue297_53_2;
    byte[] forestValue297_53_3;
    java.lang.String forestValue297_86_0;
    int forestValue297_86_1;
    java.lang.String forestValue297_98_0;
    java.lang.String forestValue297_122_0;
    javax.crypto.Cipher forestValue297_182_0;
    int forestValue297_182_1;
    javax.crypto.SecretKeyFactory forestValue297_182_2;
    byte[] forestValue297_182_3;
    javax.crypto.Cipher forestValue297_199_0;
    int forestValue297_199_1;
    javax.crypto.SecretKeyFactory forestValue297_199_2;
    byte[] forestValue297_199_3;
    javax.crypto.Cipher spill297_0;
    int spill297_1;
    javax.crypto.SecretKeyFactory spill297_2;
    byte[] spill297_3;
    byte[] spill297_4;
    java.lang.String spill297_5;
    int spill297_6;
    java.lang.String spill297_7;
    java.lang.String[] spill297_8;
    java.lang.String[] spill297_9;
    java.lang.String spill297_10;
    java.lang.String spill297_11;
    int spill297_12;
    javax.crypto.Cipher spill297_13;
    int spill297_14;
    javax.crypto.SecretKeyFactory spill297_15;
    byte[] spill297_16;
    byte[] spill297_17;
    java.lang.String spill297_18;
    int spill297_19;
    long[] spill297_20;
    int spill297_21;
    int spill297_22;
    long spill297_23;
    byte[] spill297_24;
    byte[] spill297_25;
    byte[] spill297_26;
    byte[] spill297_27;
    byte[] spill297_28;
    byte[] spill297_29;
    byte[] spill297_30;
    byte[] spill297_31;
    long spill297_32;
    int spill297_33;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(3160216095539156690L)), ((long)(518312056464313529L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(88888275828268L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.rd.b ^ 18154963936178L);
    spill297_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill297_1 = 2;
    spill297_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp297_9_0 = new byte[8];
    spill297_3 = __stackOp297_9_0;
    (__stackOp297_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue297_36_0 = spill297_0;
    forestValue297_36_1 = spill297_1;
    forestValue297_36_2 = spill297_2;
    forestValue297_36_3 = spill297_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue297_53_0 = forestValue297_36_0;
        forestValue297_53_1 = forestValue297_36_1;
        forestValue297_53_2 = forestValue297_36_2;
        forestValue297_53_3 = forestValue297_36_3;
        break forest_join_53;
    }
    byte[] __stackOp297_10_0 = forestValue297_36_3;
    spill297_4 = __stackOp297_10_0;
    (__stackOp297_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue297_36_3 = spill297_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue297_53_0)).init(((int)(forestValue297_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue297_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue297_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life20_66 = new java.lang.String[8];
    life18_68 = 0;
    life19_73 = ((java.lang.String)((life17_71 = "\003À1R\031ãvÀ¸Zåü\n\013½Éí\03213d¬\034\006:ÖÂÎ*õjù\023,(ä+9L2@£ÈµFÐ&ð\007¨»TÚ÷Àø©\005U\022_:]\r/#\030:C¶àO²Û®\034Q¼i=ö¤\006C©WnÉ\nV²).\034ºb8§L­w\"³0A]\tsJ<M\177Ð~¿Ñ\033Ê®Æ³õ´´r\f1\034u\025æ*ü,öæaÐK\031§¢ãÇMÀQ³R8\026Ro\001|¼ÒÀ¼:³ë¾¯É\007ÛÌh\034>¯æ¿^Ñ!iL7ÏßPúy¦\034üc\0138\037ÓÛh´q\003}\035@:¾\021ðæ¢ü\000Ât°ó\031Fe}Åe3L9Pu#õ\005a¼\004\006÷m½5¶°Ö±]¢ª±gS¾Cz\007ÑðÖîYHº4ïí8õÃ\017\030p¦''f­K©Ä\001à\017ö!\b.bØÆ!\000K¢Mj¡u\025}\016êNFn3aÚK¤Õ"))).length();
    life16_75 = 48;
    life15_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life15_77 += 1;
    spill297_5 = life17_71;
    int __stackOp297_14_0 = life15_77;
    forestValue297_86_0 = ((java.lang.String)(spill297_5)).substring(((int)(__stackOp297_14_0)), ((int)((__stackOp297_14_0 + life16_75))));
    forestValue297_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp297_16_0 = forestValue297_86_0;
    int __stackOp297_16_1 = forestValue297_86_1;
    spill297_6 = __stackOp297_16_1;
    byte[] __stackOp297_18_0 = ((java.lang.String)(__stackOp297_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp297_18_1 = life13_20;
    life21_93 = ((javax.crypto.Cipher)(__stackOp297_18_1)).doFinal(((byte[])(__stackOp297_18_0)));
    int __stackOp297_22_0 = spill297_6;
    java.lang.String __stackOp297_22_1 = ((java.lang.String)(com.moon.rd.a(((byte[])(life21_93))))).intern();
    spill297_7 = __stackOp297_22_1;
    switch (__stackOp297_22_0) {
default:
{
        forestValue297_98_0 = spill297_7;
        break forest_join_98;
    }
case 0:
{
        forestValue297_122_0 = spill297_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp297_23_0 = forestValue297_98_0;
    java.lang.String[] __stackOp297_23_1 = life20_66;
    spill297_8 = __stackOp297_23_1;
    java.lang.String __stackOp297_24_0 = __stackOp297_23_0;
    int __stackOp297_24_1 = (life18_68++);
    (spill297_8)[__stackOp297_24_1] = __stackOp297_24_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life19_73 = ((java.lang.String)((life17_71 = "jÐ\tÑ~íªz¿|£³U\024TÒoUÇ\034\002äÌ5\021Éöâm\016;æÛI\fcª¸j\0237¬q\004@°[å\007\032TøóYÄÁ[ècîÓ/­ÒXÊÃN_,\036(Y¶\007Ùi\bGè\\7`q»­ÄhÃÔX>^\013ÂTxðrèë¹ËX"))).length();
    life16_75 = 48;
    life15_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp297_26_0 = forestValue297_122_0;
    java.lang.String[] __stackOp297_26_1 = life20_66;
    spill297_9 = __stackOp297_26_1;
    java.lang.String __stackOp297_27_0 = __stackOp297_26_0;
    int __stackOp297_27_1 = (life18_68++);
    (spill297_9)[__stackOp297_27_1] = __stackOp297_27_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_153;
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    }
    life15_77 += 1;
    spill297_10 = life17_71;
    int __stackOp297_30_0 = life15_77;
    spill297_11 = ((java.lang.String)(spill297_10)).substring(((int)(__stackOp297_30_0)), ((int)((__stackOp297_30_0 + life16_75))));
    spill297_12 = 0;
    forestValue297_86_0 = spill297_11;
    forestValue297_86_1 = spill297_12;
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
    spill297_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill297_14 = 2;
    spill297_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp297_39_0 = new byte[8];
    spill297_16 = __stackOp297_39_0;
    (__stackOp297_39_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_184 = 1;
    forestValue297_182_0 = spill297_13;
    forestValue297_182_1 = spill297_14;
    forestValue297_182_2 = spill297_15;
    forestValue297_182_3 = spill297_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue297_199_0 = forestValue297_182_0;
        forestValue297_199_1 = forestValue297_182_1;
        forestValue297_199_2 = forestValue297_182_2;
        forestValue297_199_3 = forestValue297_182_3;
        break forest_join_199;
    }
    byte[] __stackOp297_40_0 = forestValue297_182_3;
    spill297_17 = __stackOp297_40_0;
    (__stackOp297_40_0)[life1_184] = ((byte) ((int) ((life11_16 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue297_182_3 = spill297_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue297_199_0)).init(((int)(forestValue297_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue297_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue297_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[2];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "å¥\013¾Oâ\\çÁ%Á©ÀÄ"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill297_18 = life4_220;
    spill297_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill297_18)).substring(((int)(spill297_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill297_20 = life6_215;
    spill297_21 = (life3_217++);
    long __stackOp297_46_0 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    int __stackOp297_46_1 = -1;
    spill297_22 = __stackOp297_46_1;
    spill297_23 = __stackOp297_46_0;
    recovery.source.CarrierOps.discard(__stackOp297_46_1);
    life8_309 = spill297_23;
    byte[] __stackOp297_48_0 = new byte[8];
    spill297_24 = __stackOp297_48_0;
    (__stackOp297_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp297_49_0 = spill297_24;
    spill297_25 = __stackOp297_49_0;
    (__stackOp297_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp297_50_0 = spill297_25;
    spill297_26 = __stackOp297_50_0;
    (__stackOp297_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp297_51_0 = spill297_26;
    spill297_27 = __stackOp297_51_0;
    (__stackOp297_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp297_52_0 = spill297_27;
    spill297_28 = __stackOp297_52_0;
    (__stackOp297_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp297_53_0 = spill297_28;
    spill297_29 = __stackOp297_53_0;
    (__stackOp297_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp297_54_0 = spill297_29;
    spill297_30 = __stackOp297_54_0;
    (__stackOp297_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp297_55_0 = spill297_30;
    spill297_31 = __stackOp297_55_0;
    (__stackOp297_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp297_56_0 = spill297_31;
    javax.crypto.Cipher __stackOp297_56_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp297_56_1)).doFinal(((byte[])(__stackOp297_56_0)));
    int __stackOp297_58_0 = spill297_22;
    long __stackOp297_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill297_32 = __stackOp297_58_1;
    spill297_33 = __stackOp297_58_0;
    recovery.source.CarrierOps.discard(__stackOp297_58_1);
    recovery.source.CarrierOps.discard(spill297_33);
    (spill297_20)[spill297_21] = spill297_32;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    f = ((long[])(life6_215));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_028af0b57a92dbce_0(com.moon.rd a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_94e5aeefaffa908ce262(int a0, long a1) throws E;
private static final class __SourceHandler_94e5aeefaffa908ce262 {

public static java.lang.String f186(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8211);
    if (((__fieldRead186_0())[life5_8] == null)) {
        life3_16 = __call186_3(__call186_2(__call186_1()));
        life4_21 = __cast186_6(__call186_5(__fieldRead186_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call186_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call186_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call186_10(__fieldRead186_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call186_12(__cast186_11((life4_21)[1]), life7_92);
        __call186_15(__cast186_13((life4_21)[0]), 2, life8_99, __cast186_14((life4_21)[2]));
        life9_116 = __call186_17((__fieldRead186_16())[life5_8], "ISO-8859-1");
        (__fieldRead186_18())[life5_8] = __call186_21(__call186_20(__cast186_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead186_22())[life5_8];
}
public static java.lang.String h186_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/rd", local1);
}
private static native java.lang.String[] __fieldRead186_0() throws Throwable;
private static native java.lang.Thread __call186_1() throws Throwable;
private static native long __call186_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call186_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead186_4() throws Throwable;
private static native java.lang.Object __call186_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast186_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call186_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call186_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead186_9() throws Throwable;
private static native java.lang.Object __call186_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast186_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call186_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast186_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast186_14(java.lang.Object a0) throws Throwable;
private static native void __call186_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead186_16() throws Throwable;
private static native byte[] __call186_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead186_18() throws Throwable;
private static native javax.crypto.Cipher __cast186_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call186_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call186_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead186_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_8724915efd0272d5eea6(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_8724915efd0272d5eea6 {

public static java.lang.invoke.CallSite f187(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill187_0 = life3_4;
    java.lang.invoke.MethodHandle spill187_1 = __call187_3(__methodHandleLiteral187_0(), __classLiteral187_1(), __call187_2(p2));
    int spill187_2 = 0;
    java.lang.Object[] __stackOp187_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill187_3 = __stackOp187_4_0;
    (__stackOp187_4_0)[0] = p0;
    java.lang.Object[] __stackOp187_5_0 = spill187_3;
    java.lang.Object[] spill187_4 = __stackOp187_5_0;
    (__stackOp187_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp187_6_0 = spill187_4;
    java.lang.Object[] spill187_5 = __stackOp187_6_0;
    (__stackOp187_6_0)[2] = p1;
    __call187_9(spill187_0, __call187_8(__call187_7(spill187_1, spill187_2, spill187_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h187_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2018700_6(__call2018700_5(__call2018700_3(__call2018700_2(__call2018700_1(__call2018700_0(new java.lang.StringBuilder(), "com/moon/rd"), " : "), p1), " : "), __call2018700_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral187_0() throws Throwable;
private static native java.lang.Object __classLiteral187_1() throws Throwable;
private static native int __call187_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call187_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call187_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call187_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call187_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2018700_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018700_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018700_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018700_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018700_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2018700_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018700_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_a5420909df6b220f50d3(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_a5420909df6b220f50d3 {

public static java.lang.invoke.CallSite f188(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill188_0 = life3_4;
    java.lang.invoke.MethodHandle spill188_1 = __call188_3(__methodHandleLiteral188_0(), __classLiteral188_1(), __call188_2(p2));
    int spill188_2 = 0;
    java.lang.Object[] __stackOp188_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill188_3 = __stackOp188_4_0;
    (__stackOp188_4_0)[0] = p0;
    java.lang.Object[] __stackOp188_5_0 = spill188_3;
    java.lang.Object[] spill188_4 = __stackOp188_5_0;
    (__stackOp188_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp188_6_0 = spill188_4;
    java.lang.Object[] spill188_5 = __stackOp188_6_0;
    (__stackOp188_6_0)[2] = p1;
    __call188_9(spill188_0, __call188_8(__call188_7(spill188_1, spill188_2, spill188_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h188_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2018800_6(__call2018800_5(__call2018800_3(__call2018800_2(__call2018800_1(__call2018800_0(new java.lang.StringBuilder(), "com/moon/rd"), " : "), p1), " : "), __call2018800_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral188_0() throws Throwable;
private static native java.lang.Object __classLiteral188_1() throws Throwable;
private static native int __call188_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call188_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call188_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call188_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call188_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2018800_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018800_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018800_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018800_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018800_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2018800_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018800_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_a5420909df6b220f50d3(p0, p1, p2); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16608;
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
            throw new RuntimeException("com/moon/rd", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.rd.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_94e5aeefaffa908ce262(p0, p1); }


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
        byte[] spill1362_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1362_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1362_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1362_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1362_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1362_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_8724915efd0272d5eea6(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.rd.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_15(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_24(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_31(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_36(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_38(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_45(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_52(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_59(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100060_66(java.lang.String a0, java.lang.String a1) throws E;
}
