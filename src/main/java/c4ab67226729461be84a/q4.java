package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class q4 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue100045_60_0;
    int forestValue100045_76_0;
    int forestValue100045_92_0;
    int forestValue100045_108_0;
    int forestValue100045_124_0;
    int forestValue100045_142_0;
    org.luaj.vm2.LuaValue forestValue100045_172_0;
    org.luaj.vm2.LuaValue forestValue100045_177_0;
    java.lang.String[] spill100045_0;
    boolean spill100045_1;
    org.luaj.vm2.LuaValue spill100045_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_7;
    org.luaj.vm2.LuaValue life6_11;
    org.luaj.vm2.LuaValue life7_15;
    org.luaj.vm2.LuaValue life8_20;
    org.luaj.vm2.LuaValue life9_24;
    org.luaj.vm2.LuaValue life10_32;
    org.luaj.vm2.LuaValue life11_40;
    java.lang.String[] life4_41;
    forest_join_177: {
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
    life2_3 = (com.moon.q4.b ^ 56728886539492L);
    life5_7 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_11 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_15 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    spill100045_0 = com.moon.jJ.b__ArrayString();
    life8_20 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life9_24 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    life10_32 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_7(3917, (3641699441328995663L ^ life2_3)))));
    life11_40 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_9(11664, (527679411565404051L ^ life2_3)))));
    life4_41 = spill100045_0;
    spill100045_1 = ((org.luaj.vm2.LuaValue)(life5_7)).isnumber();
    if (!((life4_41 != null))) {
        forestValue100045_60_0 = ((spill100045_1) ? 1 : 0);
        break forest_join_60;
    }
    if (!((!spill100045_1))) {
        break forest_join_58;
    }
    java.lang.String __stackOp100045_15_0 = ((org.luaj.vm2.LuaValue)(life5_7)).typename();
    java.lang.String __stackOp100045_15_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_14(28124, (5655150928751589946L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_16(__stackOp100045_15_1, __stackOp100045_15_0))));
    }
    forestValue100045_60_0 = ((((org.luaj.vm2.LuaValue)(life6_11)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100045_76_0 = forestValue100045_60_0;
        break forest_join_76;
    }
    if (!((forestValue100045_60_0 == 0))) {
        break forest_join_74;
    }
    java.lang.String __stackOp100045_22_0 = ((org.luaj.vm2.LuaValue)(life6_11)).typename();
    java.lang.String __stackOp100045_22_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_21(12807, (7851459574746162663L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_23(__stackOp100045_22_1, __stackOp100045_22_0))));
    }
    forestValue100045_76_0 = ((((org.luaj.vm2.LuaValue)(life7_15)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100045_92_0 = forestValue100045_76_0;
        break forest_join_92;
    }
    if (!((forestValue100045_76_0 == 0))) {
        break forest_join_90;
    }
    java.lang.String __stackOp100045_29_0 = ((org.luaj.vm2.LuaValue)(life7_15)).typename();
    java.lang.String __stackOp100045_29_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_28(3090, (3000868310959201269L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_30(__stackOp100045_29_1, __stackOp100045_29_0))));
    }
    forestValue100045_92_0 = ((((org.luaj.vm2.LuaValue)(life8_20)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100045_108_0 = forestValue100045_92_0;
        break forest_join_108;
    }
    if (!((forestValue100045_92_0 == 0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp100045_36_0 = ((org.luaj.vm2.LuaValue)(life8_20)).typename();
    java.lang.String __stackOp100045_36_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_35(10109, (603316867830231193L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_37(__stackOp100045_36_1, __stackOp100045_36_0))));
    }
    forestValue100045_108_0 = ((((org.luaj.vm2.LuaValue)(life9_24)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100045_124_0 = forestValue100045_108_0;
        break forest_join_124;
    }
    if (!((forestValue100045_108_0 == 0))) {
        break forest_join_122;
    }
    java.lang.String __stackOp100045_43_0 = ((org.luaj.vm2.LuaValue)(life9_24)).typename();
    java.lang.String __stackOp100045_43_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_42(4152, (5678750611331123161L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_44(__stackOp100045_43_1, __stackOp100045_43_0))));
    }
    forestValue100045_124_0 = ((((org.luaj.vm2.LuaValue)(life10_32)).isnumber()) ? 1 : 0);
    }
    if (!((life4_41 != null))) {
        forestValue100045_142_0 = forestValue100045_124_0;
        break forest_join_142;
    }
    if (!((forestValue100045_124_0 == 0))) {
        break forest_join_138;
    }
    java.lang.String __stackOp100045_50_0 = ((org.luaj.vm2.LuaValue)(life10_32)).typename();
    java.lang.String __stackOp100045_50_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_49(24359, (1875494248465811653L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_51(__stackOp100045_50_1, __stackOp100045_50_0))));
    }
    spill100045_2 = life11_40;
    if (!((life4_41 != null))) {
        forestValue100045_172_0 = spill100045_2;
        break forest_join_172;
    }
    forestValue100045_142_0 = ((((org.luaj.vm2.LuaValue)(spill100045_2)).isnumber()) ? 1 : 0);
    }
    if (!((forestValue100045_142_0 == 0))) {
        break forest_join_154;
    }
    java.lang.String __stackOp100045_57_0 = ((org.luaj.vm2.LuaValue)(life11_40)).typename();
    java.lang.String __stackOp100045_57_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_56(104, (6166451540243224461L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100045_58(__stackOp100045_57_1, __stackOp100045_57_0))));
    }
    forestValue100045_172_0 = org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.templates.TriangleTemplate(((org.luaj.vm2.LuaValue)(life5_7)).tofloat(), ((org.luaj.vm2.LuaValue)(life6_11)).tofloat(), ((org.luaj.vm2.LuaValue)(life7_15)).tofloat(), ((org.luaj.vm2.LuaValue)(life8_20)).tofloat(), ((org.luaj.vm2.LuaValue)(life9_24)).tofloat(), ((org.luaj.vm2.LuaValue)(life10_32)).tofloat(), ((org.luaj.vm2.LuaValue)(life11_40)).toint()))));
    }
    if (!((life4_41 == null))) {
        forestValue100045_177_0 = forestValue100045_172_0;
        break forest_join_177;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    forestValue100045_177_0 = forestValue100045_172_0;
    }
    return forestValue100045_177_0;
}


q4(com.moon.jJ p0) { super(); }

private static void __sourceConstructorBody_3ff4893cf0200266(com.moon.q4 receiver, com.moon.jJ p0) throws Throwable {
((com.moon.q4)(receiver)).a = ((com.moon.jJ)(p0));
    com.moon.q4.__sourceConstructorInit_3ff4893cf0200266_0(((com.moon.q4)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue140_36_0;
    int forestValue140_36_1;
    javax.crypto.SecretKeyFactory forestValue140_36_2;
    byte[] forestValue140_36_3;
    javax.crypto.Cipher forestValue140_53_0;
    int forestValue140_53_1;
    javax.crypto.SecretKeyFactory forestValue140_53_2;
    byte[] forestValue140_53_3;
    java.lang.String forestValue140_86_0;
    int forestValue140_86_1;
    java.lang.String forestValue140_98_0;
    java.lang.String forestValue140_122_0;
    javax.crypto.Cipher forestValue140_182_0;
    int forestValue140_182_1;
    javax.crypto.SecretKeyFactory forestValue140_182_2;
    byte[] forestValue140_182_3;
    javax.crypto.Cipher forestValue140_199_0;
    int forestValue140_199_1;
    javax.crypto.SecretKeyFactory forestValue140_199_2;
    byte[] forestValue140_199_3;
    javax.crypto.Cipher spill140_0;
    int spill140_1;
    javax.crypto.SecretKeyFactory spill140_2;
    byte[] spill140_3;
    byte[] spill140_4;
    java.lang.String spill140_5;
    int spill140_6;
    java.lang.String spill140_7;
    java.lang.String[] spill140_8;
    java.lang.String[] spill140_9;
    java.lang.String spill140_10;
    java.lang.String spill140_11;
    int spill140_12;
    javax.crypto.Cipher spill140_13;
    int spill140_14;
    javax.crypto.SecretKeyFactory spill140_15;
    byte[] spill140_16;
    byte[] spill140_17;
    java.lang.String spill140_18;
    int spill140_19;
    long[] spill140_20;
    int spill140_21;
    int spill140_22;
    long spill140_23;
    byte[] spill140_24;
    byte[] spill140_25;
    byte[] spill140_26;
    byte[] spill140_27;
    byte[] spill140_28;
    byte[] spill140_29;
    byte[] spill140_30;
    byte[] spill140_31;
    long spill140_32;
    int spill140_33;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(-8736964557102626522L)), ((long)(-810592048836648960L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(25172074592093L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.q4.b ^ 58605971280018L);
    spill140_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill140_1 = 2;
    spill140_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp140_9_0 = new byte[8];
    spill140_3 = __stackOp140_9_0;
    (__stackOp140_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue140_36_0 = spill140_0;
    forestValue140_36_1 = spill140_1;
    forestValue140_36_2 = spill140_2;
    forestValue140_36_3 = spill140_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue140_53_0 = forestValue140_36_0;
        forestValue140_53_1 = forestValue140_36_1;
        forestValue140_53_2 = forestValue140_36_2;
        forestValue140_53_3 = forestValue140_36_3;
        break forest_join_53;
    }
    byte[] __stackOp140_10_0 = forestValue140_36_3;
    spill140_4 = __stackOp140_10_0;
    (__stackOp140_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue140_36_3 = spill140_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue140_53_0)).init(((int)(forestValue140_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue140_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue140_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life20_66 = new java.lang.String[7];
    life18_68 = 0;
    life19_73 = ((java.lang.String)((life17_71 = "LÂ\031´\003\177ÞÂñaÅ¯ìà\rh¦\023ÍHÕÅÑ\nw¤ÃÇ\026½ôZ¦¯_Ñ3\032O÷L)È8ýt¤jkh|K\177HûíÂ×¹g$R|\007ªÕûFQ»\f8@göã0S.u\032·2²«ÿ¦Ô\rñ²h0·RVì¡ÀÉ·\005lõØaÝs)eõÿh­0ÏÖ\034c¸7¬Üî´¾s°:J QÕoÜ%0ÇAÐ'ß~³ü\001$ÄîIX\tYÏ­ÅG\021\rÀ;pÓäWy¢;óêôMYx¶\036MN0e*â\025}ólªý»¾ºv\020\037Î\016ØLz¯!\017ä¹À:á\006èò\016Á\027_¾"))).length();
    life16_75 = 48;
    life15_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life15_77 += 1;
    spill140_5 = life17_71;
    int __stackOp140_14_0 = life15_77;
    forestValue140_86_0 = ((java.lang.String)(spill140_5)).substring(((int)(__stackOp140_14_0)), ((int)((__stackOp140_14_0 + life16_75))));
    forestValue140_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp140_16_0 = forestValue140_86_0;
    int __stackOp140_16_1 = forestValue140_86_1;
    spill140_6 = __stackOp140_16_1;
    byte[] __stackOp140_18_0 = ((java.lang.String)(__stackOp140_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp140_18_1 = life13_20;
    life21_93 = ((javax.crypto.Cipher)(__stackOp140_18_1)).doFinal(((byte[])(__stackOp140_18_0)));
    int __stackOp140_22_0 = spill140_6;
    java.lang.String __stackOp140_22_1 = ((java.lang.String)(com.moon.q4.a(((byte[])(life21_93))))).intern();
    spill140_7 = __stackOp140_22_1;
    switch (__stackOp140_22_0) {
default:
{
        forestValue140_98_0 = spill140_7;
        break forest_join_98;
    }
case 0:
{
        forestValue140_122_0 = spill140_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp140_23_0 = forestValue140_98_0;
    java.lang.String[] __stackOp140_23_1 = life20_66;
    spill140_8 = __stackOp140_23_1;
    java.lang.String __stackOp140_24_0 = __stackOp140_23_0;
    int __stackOp140_24_1 = (life18_68++);
    (spill140_8)[__stackOp140_24_1] = __stackOp140_24_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life19_73 = ((java.lang.String)((life17_71 = "íÍj\177Eû9/Ç×ÄãÃzMð\005&õ\035Sä¿<|AÂI«dæ88\036xe`û\nÝ8ý3Å¦\002ÁWà\0179zHIçO«À\\z\n'}}ÎãH*C9Bç?a\026(\177rDMò8o»RÀ¥\030µ}"))).length();
    life16_75 = 48;
    life15_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp140_26_0 = forestValue140_122_0;
    java.lang.String[] __stackOp140_26_1 = life20_66;
    spill140_9 = __stackOp140_26_1;
    java.lang.String __stackOp140_27_0 = __stackOp140_26_0;
    int __stackOp140_27_1 = (life18_68++);
    (spill140_9)[__stackOp140_27_1] = __stackOp140_27_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_153;
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    }
    life15_77 += 1;
    spill140_10 = life17_71;
    int __stackOp140_30_0 = life15_77;
    spill140_11 = ((java.lang.String)(spill140_10)).substring(((int)(__stackOp140_30_0)), ((int)((__stackOp140_30_0 + life16_75))));
    spill140_12 = 0;
    forestValue140_86_0 = spill140_11;
    forestValue140_86_1 = spill140_12;
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
    spill140_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill140_14 = 2;
    spill140_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp140_39_0 = new byte[8];
    spill140_16 = __stackOp140_39_0;
    (__stackOp140_39_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_184 = 1;
    forestValue140_182_0 = spill140_13;
    forestValue140_182_1 = spill140_14;
    forestValue140_182_2 = spill140_15;
    forestValue140_182_3 = spill140_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue140_199_0 = forestValue140_182_0;
        forestValue140_199_1 = forestValue140_182_1;
        forestValue140_199_2 = forestValue140_182_2;
        forestValue140_199_3 = forestValue140_182_3;
        break forest_join_199;
    }
    byte[] __stackOp140_40_0 = forestValue140_182_3;
    spill140_17 = __stackOp140_40_0;
    (__stackOp140_40_0)[life1_184] = ((byte) ((int) ((life11_16 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue140_182_3 = spill140_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue140_199_0)).init(((int)(forestValue140_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue140_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue140_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[2];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "¬hW!GðhT\027ªtÏ2Ö¬"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill140_18 = life4_220;
    spill140_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill140_18)).substring(((int)(spill140_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill140_20 = life6_215;
    spill140_21 = (life3_217++);
    long __stackOp140_46_0 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    int __stackOp140_46_1 = -1;
    spill140_22 = __stackOp140_46_1;
    spill140_23 = __stackOp140_46_0;
    recovery.source.CarrierOps.discard(__stackOp140_46_1);
    life8_309 = spill140_23;
    byte[] __stackOp140_48_0 = new byte[8];
    spill140_24 = __stackOp140_48_0;
    (__stackOp140_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp140_49_0 = spill140_24;
    spill140_25 = __stackOp140_49_0;
    (__stackOp140_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp140_50_0 = spill140_25;
    spill140_26 = __stackOp140_50_0;
    (__stackOp140_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp140_51_0 = spill140_26;
    spill140_27 = __stackOp140_51_0;
    (__stackOp140_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp140_52_0 = spill140_27;
    spill140_28 = __stackOp140_52_0;
    (__stackOp140_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp140_53_0 = spill140_28;
    spill140_29 = __stackOp140_53_0;
    (__stackOp140_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp140_54_0 = spill140_29;
    spill140_30 = __stackOp140_54_0;
    (__stackOp140_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp140_55_0 = spill140_30;
    spill140_31 = __stackOp140_55_0;
    (__stackOp140_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp140_56_0 = spill140_31;
    javax.crypto.Cipher __stackOp140_56_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp140_56_1)).doFinal(((byte[])(__stackOp140_56_0)));
    int __stackOp140_58_0 = spill140_22;
    long __stackOp140_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill140_32 = __stackOp140_58_1;
    spill140_33 = __stackOp140_58_0;
    recovery.source.CarrierOps.discard(__stackOp140_58_1);
    recovery.source.CarrierOps.discard(spill140_33);
    (spill140_20)[spill140_21] = spill140_32;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    f = ((long[])(life6_215));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_3ff4893cf0200266_0(com.moon.q4 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_5aa747d82c306031e1c0(int a0, long a1) throws E;
private static final class __SourceHandler_5aa747d82c306031e1c0 {

public static java.lang.String f133(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14521);
    if (((__fieldRead133_0())[life5_8] == null)) {
        life3_16 = __call133_3(__call133_2(__call133_1()));
        life4_21 = __cast133_6(__call133_5(__fieldRead133_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call133_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call133_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call133_10(__fieldRead133_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call133_12(__cast133_11((life4_21)[1]), life7_92);
        __call133_15(__cast133_13((life4_21)[0]), 2, life8_99, __cast133_14((life4_21)[2]));
        life9_116 = __call133_17((__fieldRead133_16())[life5_8], "ISO-8859-1");
        (__fieldRead133_18())[life5_8] = __call133_21(__call133_20(__cast133_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead133_22())[life5_8];
}
public static java.lang.String h133_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q4", local1);
}
private static native java.lang.String[] __fieldRead133_0() throws Throwable;
private static native java.lang.Thread __call133_1() throws Throwable;
private static native long __call133_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call133_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead133_4() throws Throwable;
private static native java.lang.Object __call133_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast133_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call133_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call133_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead133_9() throws Throwable;
private static native java.lang.Object __call133_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast133_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call133_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast133_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast133_14(java.lang.Object a0) throws Throwable;
private static native void __call133_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead133_16() throws Throwable;
private static native byte[] __call133_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead133_18() throws Throwable;
private static native javax.crypto.Cipher __cast133_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call133_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call133_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead133_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_ed4c99e765a7eada542e(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_ed4c99e765a7eada542e {

public static java.lang.invoke.CallSite f134(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill134_0 = life3_4;
    java.lang.invoke.MethodHandle spill134_1 = __call134_3(__methodHandleLiteral134_0(), __classLiteral134_1(), __call134_2(p2));
    int spill134_2 = 0;
    java.lang.Object[] __stackOp134_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill134_3 = __stackOp134_4_0;
    (__stackOp134_4_0)[0] = p0;
    java.lang.Object[] __stackOp134_5_0 = spill134_3;
    java.lang.Object[] spill134_4 = __stackOp134_5_0;
    (__stackOp134_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp134_6_0 = spill134_4;
    java.lang.Object[] spill134_5 = __stackOp134_6_0;
    (__stackOp134_6_0)[2] = p1;
    __call134_9(spill134_0, __call134_8(__call134_7(spill134_1, spill134_2, spill134_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h134_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2013400_6(__call2013400_5(__call2013400_3(__call2013400_2(__call2013400_1(__call2013400_0(new java.lang.StringBuilder(), "com/moon/q4"), " : "), p1), " : "), __call2013400_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral134_0() throws Throwable;
private static native java.lang.Object __classLiteral134_1() throws Throwable;
private static native int __call134_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call134_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call134_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call134_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call134_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2013400_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013400_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013400_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013400_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013400_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2013400_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013400_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_ab7f04736589f00fda5b(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_ab7f04736589f00fda5b {

public static java.lang.invoke.CallSite f135(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill135_0 = life3_4;
    java.lang.invoke.MethodHandle spill135_1 = __call135_3(__methodHandleLiteral135_0(), __classLiteral135_1(), __call135_2(p2));
    int spill135_2 = 0;
    java.lang.Object[] __stackOp135_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill135_3 = __stackOp135_4_0;
    (__stackOp135_4_0)[0] = p0;
    java.lang.Object[] __stackOp135_5_0 = spill135_3;
    java.lang.Object[] spill135_4 = __stackOp135_5_0;
    (__stackOp135_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp135_6_0 = spill135_4;
    java.lang.Object[] spill135_5 = __stackOp135_6_0;
    (__stackOp135_6_0)[2] = p1;
    __call135_9(spill135_0, __call135_8(__call135_7(spill135_1, spill135_2, spill135_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h135_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2013500_6(__call2013500_5(__call2013500_3(__call2013500_2(__call2013500_1(__call2013500_0(new java.lang.StringBuilder(), "com/moon/q4"), " : "), p1), " : "), __call2013500_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral135_0() throws Throwable;
private static native java.lang.Object __classLiteral135_1() throws Throwable;
private static native int __call135_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call135_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call135_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call135_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call135_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2013500_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013500_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013500_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2013500_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013500_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2013500_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2013500_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_ab7f04736589f00fda5b(p0, p1, p2); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7519;
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
            throw new RuntimeException("com/moon/q4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.q4.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_5aa747d82c306031e1c0(p0, p1); }


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
        byte[] spill1246_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1246_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1246_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1246_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1246_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1246_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_ed4c99e765a7eada542e(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_23(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_37(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_44(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_51(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100045_58(java.lang.String a0, java.lang.String a1) throws E;
}
