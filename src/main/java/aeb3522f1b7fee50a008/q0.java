package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class q0 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jJ a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue100043_60_0;
    int forestValue100043_76_0;
    int forestValue100043_92_0;
    int forestValue100043_108_0;
    int forestValue100043_124_0;
    int forestValue100043_142_0;
    org.luaj.vm2.LuaValue forestValue100043_172_0;
    org.luaj.vm2.LuaValue forestValue100043_177_0;
    java.lang.String[] spill100043_0;
    boolean spill100043_1;
    org.luaj.vm2.LuaValue spill100043_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_7;
    org.luaj.vm2.LuaValue life6_11;
    org.luaj.vm2.LuaValue life7_16;
    java.lang.String[] life4_17;
    org.luaj.vm2.LuaValue life8_21;
    org.luaj.vm2.LuaValue life9_25;
    org.luaj.vm2.LuaValue life10_33;
    org.luaj.vm2.LuaValue life11_41;
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
    life2_3 = (com.moon.q0.b ^ 77765317571994L);
    life5_7 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_11 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    spill100043_0 = com.moon.jJ.b__ArrayString();
    life7_16 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life4_17 = spill100043_0;
    life8_21 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life9_25 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    life10_33 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_7(27621, (159913705184962023L ^ life2_3)))));
    life11_41 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_9(12743, (6237095049787047876L ^ life2_3)))));
    spill100043_1 = ((org.luaj.vm2.LuaValue)(life5_7)).isnumber();
    if (!((life4_17 != null))) {
        forestValue100043_60_0 = ((spill100043_1) ? 1 : 0);
        break forest_join_60;
    }
    if (!((!spill100043_1))) {
        break forest_join_58;
    }
    java.lang.String __stackOp100043_15_0 = ((org.luaj.vm2.LuaValue)(life5_7)).typename();
    java.lang.String __stackOp100043_15_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_14(4430, (8574186144283494950L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_16(__stackOp100043_15_1, __stackOp100043_15_0))));
    }
    forestValue100043_60_0 = ((((org.luaj.vm2.LuaValue)(life6_11)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != null))) {
        forestValue100043_76_0 = forestValue100043_60_0;
        break forest_join_76;
    }
    if (!((forestValue100043_60_0 == 0))) {
        break forest_join_74;
    }
    java.lang.String __stackOp100043_22_0 = ((org.luaj.vm2.LuaValue)(life6_11)).typename();
    java.lang.String __stackOp100043_22_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_21(351, (8669717476899985968L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_23(__stackOp100043_22_1, __stackOp100043_22_0))));
    }
    forestValue100043_76_0 = ((((org.luaj.vm2.LuaValue)(life7_16)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != null))) {
        forestValue100043_92_0 = forestValue100043_76_0;
        break forest_join_92;
    }
    if (!((forestValue100043_76_0 == 0))) {
        break forest_join_90;
    }
    java.lang.String __stackOp100043_29_0 = ((org.luaj.vm2.LuaValue)(life7_16)).typename();
    java.lang.String __stackOp100043_29_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_28(20623, (3858310016305515490L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_30(__stackOp100043_29_1, __stackOp100043_29_0))));
    }
    forestValue100043_92_0 = ((((org.luaj.vm2.LuaValue)(life8_21)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != null))) {
        forestValue100043_108_0 = forestValue100043_92_0;
        break forest_join_108;
    }
    if (!((forestValue100043_92_0 == 0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp100043_36_0 = ((org.luaj.vm2.LuaValue)(life8_21)).typename();
    java.lang.String __stackOp100043_36_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_35(21268, (10966935598909562L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_37(__stackOp100043_36_1, __stackOp100043_36_0))));
    }
    forestValue100043_108_0 = ((((org.luaj.vm2.LuaValue)(life9_25)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != null))) {
        forestValue100043_124_0 = forestValue100043_108_0;
        break forest_join_124;
    }
    if (!((forestValue100043_108_0 == 0))) {
        break forest_join_122;
    }
    java.lang.String __stackOp100043_43_0 = ((org.luaj.vm2.LuaValue)(life9_25)).typename();
    java.lang.String __stackOp100043_43_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_42(8830, (7005863044725487890L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_44(__stackOp100043_43_1, __stackOp100043_43_0))));
    }
    forestValue100043_124_0 = ((((org.luaj.vm2.LuaValue)(life10_33)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != null))) {
        forestValue100043_142_0 = forestValue100043_124_0;
        break forest_join_142;
    }
    if (!((forestValue100043_124_0 == 0))) {
        break forest_join_138;
    }
    java.lang.String __stackOp100043_50_0 = ((org.luaj.vm2.LuaValue)(life10_33)).typename();
    java.lang.String __stackOp100043_50_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_49(31742, (953927450956292247L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_51(__stackOp100043_50_1, __stackOp100043_50_0))));
    }
    spill100043_2 = life11_41;
    if (!((life4_17 != null))) {
        forestValue100043_172_0 = spill100043_2;
        break forest_join_172;
    }
    forestValue100043_142_0 = ((((org.luaj.vm2.LuaValue)(spill100043_2)).isboolean()) ? 1 : 0);
    }
    if (!((forestValue100043_142_0 == 0))) {
        break forest_join_154;
    }
    java.lang.String __stackOp100043_57_0 = ((org.luaj.vm2.LuaValue)(life11_41)).typename();
    java.lang.String __stackOp100043_57_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_56(21388, (8108102359212247270L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic100043_58(__stackOp100043_57_1, __stackOp100043_57_0))));
    }
    forestValue100043_172_0 = org.luaj.vm2.lib.jse.CoerceJavaToLua.coerce(((java.lang.Object)(new com.moon.scripting.api.types.templates.GradientTemplate(((org.luaj.vm2.LuaValue)(life5_7)).tofloat(), ((org.luaj.vm2.LuaValue)(life6_11)).tofloat(), ((org.luaj.vm2.LuaValue)(life7_16)).tofloat(), ((org.luaj.vm2.LuaValue)(life8_21)).tofloat(), ((org.luaj.vm2.LuaValue)(life9_25)).toint(), ((org.luaj.vm2.LuaValue)(life10_33)).toint(), ((org.luaj.vm2.LuaValue)(life11_41)).toboolean()))));
    }
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forestValue100043_177_0 = forestValue100043_172_0;
        break forest_join_177;
    }
    com.moon.jJ.b(((java.lang.String[])(new java.lang.String[5])));
    forestValue100043_177_0 = forestValue100043_172_0;
    }
    return forestValue100043_177_0;
}


q0(com.moon.jJ p0) { super(); }

private static void __sourceConstructorBody_dca15821a10c5ec2(com.moon.q0 receiver, com.moon.jJ p0) throws Throwable {
((com.moon.q0)(receiver)).a = ((com.moon.jJ)(p0));
    com.moon.q0.__sourceConstructorInit_dca15821a10c5ec2_0(((com.moon.q0)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue132_36_0;
    int forestValue132_36_1;
    javax.crypto.SecretKeyFactory forestValue132_36_2;
    byte[] forestValue132_36_3;
    javax.crypto.Cipher forestValue132_53_0;
    int forestValue132_53_1;
    javax.crypto.SecretKeyFactory forestValue132_53_2;
    byte[] forestValue132_53_3;
    java.lang.String forestValue132_86_0;
    int forestValue132_86_1;
    java.lang.String forestValue132_98_0;
    java.lang.String forestValue132_122_0;
    javax.crypto.Cipher forestValue132_182_0;
    int forestValue132_182_1;
    javax.crypto.SecretKeyFactory forestValue132_182_2;
    byte[] forestValue132_182_3;
    javax.crypto.Cipher forestValue132_199_0;
    int forestValue132_199_1;
    javax.crypto.SecretKeyFactory forestValue132_199_2;
    byte[] forestValue132_199_3;
    javax.crypto.Cipher spill132_0;
    int spill132_1;
    javax.crypto.SecretKeyFactory spill132_2;
    byte[] spill132_3;
    byte[] spill132_4;
    java.lang.String spill132_5;
    int spill132_6;
    java.lang.String spill132_7;
    java.lang.String[] spill132_8;
    java.lang.String[] spill132_9;
    java.lang.String spill132_10;
    java.lang.String spill132_11;
    int spill132_12;
    javax.crypto.Cipher spill132_13;
    int spill132_14;
    javax.crypto.SecretKeyFactory spill132_15;
    byte[] spill132_16;
    byte[] spill132_17;
    java.lang.String spill132_18;
    int spill132_19;
    long[] spill132_20;
    int spill132_21;
    int spill132_22;
    long spill132_23;
    byte[] spill132_24;
    byte[] spill132_25;
    byte[] spill132_26;
    byte[] spill132_27;
    byte[] spill132_28;
    byte[] spill132_29;
    byte[] spill132_30;
    byte[] spill132_31;
    long spill132_32;
    int spill132_33;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(7539502288373346784L)), ((long)(-1997782507601891216L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(99712313144016L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.q0.b ^ 28632439531639L);
    spill132_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill132_1 = 2;
    spill132_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp132_9_0 = new byte[8];
    spill132_3 = __stackOp132_9_0;
    (__stackOp132_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue132_36_0 = spill132_0;
    forestValue132_36_1 = spill132_1;
    forestValue132_36_2 = spill132_2;
    forestValue132_36_3 = spill132_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue132_53_0 = forestValue132_36_0;
        forestValue132_53_1 = forestValue132_36_1;
        forestValue132_53_2 = forestValue132_36_2;
        forestValue132_53_3 = forestValue132_36_3;
        break forest_join_53;
    }
    byte[] __stackOp132_10_0 = forestValue132_36_3;
    spill132_4 = __stackOp132_10_0;
    (__stackOp132_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue132_36_3 = spill132_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue132_53_0)).init(((int)(forestValue132_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue132_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue132_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life20_66 = new java.lang.String[7];
    life18_68 = 0;
    life19_73 = ((java.lang.String)((life17_71 = "2ðçÈÉÆÔZðµ¥ãbvÙdÌ£ûøsÔ&d'OË5O\021?-\b1yt\023®Æ0Í\013cQ82Á|s/¥$\177ðû\006¥FRU2\0318mïp[Zõ3D%\000k\007q`Q,¥åA¯QµÍRéf&ð8íT`±*{g?¦\tä\fÑ\000Êô\\|}Eèì\fkMá¡¡r0ó·*4LHÿ?W>¥;Óz£ôPFîXõz0\"·\021µ æþ\004J¡¹2ZN§\016W8\021¦\034^Ê¶­¹2\r©þù7\034êC¤\030xN`^0iTõÓj|ì:ªÎÛ1%v\\Ø nn\021\032\013ûe!Æm@%\007®+éÃÑ\035\024\002ëWª|"))).length();
    life16_75 = 56;
    life15_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life15_77 += 1;
    spill132_5 = life17_71;
    int __stackOp132_14_0 = life15_77;
    forestValue132_86_0 = ((java.lang.String)(spill132_5)).substring(((int)(__stackOp132_14_0)), ((int)((__stackOp132_14_0 + life16_75))));
    forestValue132_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp132_16_0 = forestValue132_86_0;
    int __stackOp132_16_1 = forestValue132_86_1;
    spill132_6 = __stackOp132_16_1;
    byte[] __stackOp132_18_0 = ((java.lang.String)(__stackOp132_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp132_18_1 = life13_20;
    life21_93 = ((javax.crypto.Cipher)(__stackOp132_18_1)).doFinal(((byte[])(__stackOp132_18_0)));
    int __stackOp132_22_0 = spill132_6;
    java.lang.String __stackOp132_22_1 = ((java.lang.String)(com.moon.q0.a(((byte[])(life21_93))))).intern();
    spill132_7 = __stackOp132_22_1;
    switch (__stackOp132_22_0) {
default:
{
        forestValue132_98_0 = spill132_7;
        break forest_join_98;
    }
case 0:
{
        forestValue132_122_0 = spill132_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp132_23_0 = forestValue132_98_0;
    java.lang.String[] __stackOp132_23_1 = life20_66;
    spill132_8 = __stackOp132_23_1;
    java.lang.String __stackOp132_24_0 = __stackOp132_23_0;
    int __stackOp132_24_1 = (life18_68++);
    (spill132_8)[__stackOp132_24_1] = __stackOp132_24_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life19_73 = ((java.lang.String)((life17_71 = "\033¹{¦ÂK4hÍ£RÆù,)ÂsJbtXªú¢÷äJÍ7?;\032ìW\\÷\005Ðqõ\t\022èp½²È\000µ@Hpã8Ðz\003Ød^%\007µ¶IÐ\030\0019x]ðsP¡ñÖm]Oó÷CLl'CÿoLneT\007·hù|£ß\022`[¹Ï"))).length();
    life16_75 = 56;
    life15_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp132_26_0 = forestValue132_122_0;
    java.lang.String[] __stackOp132_26_1 = life20_66;
    spill132_9 = __stackOp132_26_1;
    java.lang.String __stackOp132_27_0 = __stackOp132_26_0;
    int __stackOp132_27_1 = (life18_68++);
    (spill132_9)[__stackOp132_27_1] = __stackOp132_27_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_153;
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    }
    life15_77 += 1;
    spill132_10 = life17_71;
    int __stackOp132_30_0 = life15_77;
    spill132_11 = ((java.lang.String)(spill132_10)).substring(((int)(__stackOp132_30_0)), ((int)((__stackOp132_30_0 + life16_75))));
    spill132_12 = 0;
    forestValue132_86_0 = spill132_11;
    forestValue132_86_1 = spill132_12;
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
    spill132_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill132_14 = 2;
    spill132_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp132_39_0 = new byte[8];
    spill132_16 = __stackOp132_39_0;
    (__stackOp132_39_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_184 = 1;
    forestValue132_182_0 = spill132_13;
    forestValue132_182_1 = spill132_14;
    forestValue132_182_2 = spill132_15;
    forestValue132_182_3 = spill132_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue132_199_0 = forestValue132_182_0;
        forestValue132_199_1 = forestValue132_182_1;
        forestValue132_199_2 = forestValue132_182_2;
        forestValue132_199_3 = forestValue132_182_3;
        break forest_join_199;
    }
    byte[] __stackOp132_40_0 = forestValue132_182_3;
    spill132_17 = __stackOp132_40_0;
    (__stackOp132_40_0)[life1_184] = ((byte) ((int) ((life11_16 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue132_182_3 = spill132_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue132_199_0)).init(((int)(forestValue132_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue132_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue132_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[2];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "M¡¾`w×µ1*\025¶¿1­L"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill132_18 = life4_220;
    spill132_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill132_18)).substring(((int)(spill132_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill132_20 = life6_215;
    spill132_21 = (life3_217++);
    long __stackOp132_46_0 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    int __stackOp132_46_1 = -1;
    spill132_22 = __stackOp132_46_1;
    spill132_23 = __stackOp132_46_0;
    recovery.source.CarrierOps.discard(__stackOp132_46_1);
    life8_309 = spill132_23;
    byte[] __stackOp132_48_0 = new byte[8];
    spill132_24 = __stackOp132_48_0;
    (__stackOp132_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp132_49_0 = spill132_24;
    spill132_25 = __stackOp132_49_0;
    (__stackOp132_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp132_50_0 = spill132_25;
    spill132_26 = __stackOp132_50_0;
    (__stackOp132_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp132_51_0 = spill132_26;
    spill132_27 = __stackOp132_51_0;
    (__stackOp132_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp132_52_0 = spill132_27;
    spill132_28 = __stackOp132_52_0;
    (__stackOp132_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp132_53_0 = spill132_28;
    spill132_29 = __stackOp132_53_0;
    (__stackOp132_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp132_54_0 = spill132_29;
    spill132_30 = __stackOp132_54_0;
    (__stackOp132_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp132_55_0 = spill132_30;
    spill132_31 = __stackOp132_55_0;
    (__stackOp132_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp132_56_0 = spill132_31;
    javax.crypto.Cipher __stackOp132_56_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp132_56_1)).doFinal(((byte[])(__stackOp132_56_0)));
    int __stackOp132_58_0 = spill132_22;
    long __stackOp132_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill132_32 = __stackOp132_58_1;
    spill132_33 = __stackOp132_58_0;
    recovery.source.CarrierOps.discard(__stackOp132_58_1);
    recovery.source.CarrierOps.discard(spill132_33);
    (spill132_20)[spill132_21] = spill132_32;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    f = ((long[])(life6_215));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_dca15821a10c5ec2_0(com.moon.q0 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_50fda8d99194dbf30d2a(int a0, long a1) throws E;
private static final class __SourceHandler_50fda8d99194dbf30d2a {

public static java.lang.String f123(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17054);
    if (((__fieldRead123_0())[life5_8] == null)) {
        life3_16 = __call123_3(__call123_2(__call123_1()));
        life4_21 = __cast123_6(__call123_5(__fieldRead123_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call123_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call123_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call123_10(__fieldRead123_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call123_12(__cast123_11((life4_21)[1]), life7_92);
        __call123_15(__cast123_13((life4_21)[0]), 2, life8_99, __cast123_14((life4_21)[2]));
        life9_116 = __call123_17((__fieldRead123_16())[life5_8], "ISO-8859-1");
        (__fieldRead123_18())[life5_8] = __call123_21(__call123_20(__cast123_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead123_22())[life5_8];
}
public static java.lang.String h123_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q0", local1);
}
private static native java.lang.String[] __fieldRead123_0() throws Throwable;
private static native java.lang.Thread __call123_1() throws Throwable;
private static native long __call123_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call123_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead123_4() throws Throwable;
private static native java.lang.Object __call123_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast123_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call123_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call123_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead123_9() throws Throwable;
private static native java.lang.Object __call123_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast123_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call123_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast123_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast123_14(java.lang.Object a0) throws Throwable;
private static native void __call123_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead123_16() throws Throwable;
private static native byte[] __call123_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead123_18() throws Throwable;
private static native javax.crypto.Cipher __cast123_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call123_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call123_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead123_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_349f4c1a6e0bae92b1aa(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_349f4c1a6e0bae92b1aa {

public static java.lang.invoke.CallSite f124(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill124_0 = life3_4;
    java.lang.invoke.MethodHandle spill124_1 = __call124_3(__methodHandleLiteral124_0(), __classLiteral124_1(), __call124_2(p2));
    int spill124_2 = 0;
    java.lang.Object[] __stackOp124_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill124_3 = __stackOp124_4_0;
    (__stackOp124_4_0)[0] = p0;
    java.lang.Object[] __stackOp124_5_0 = spill124_3;
    java.lang.Object[] spill124_4 = __stackOp124_5_0;
    (__stackOp124_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp124_6_0 = spill124_4;
    java.lang.Object[] spill124_5 = __stackOp124_6_0;
    (__stackOp124_6_0)[2] = p1;
    __call124_9(spill124_0, __call124_8(__call124_7(spill124_1, spill124_2, spill124_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h124_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2012400_6(__call2012400_5(__call2012400_3(__call2012400_2(__call2012400_1(__call2012400_0(new java.lang.StringBuilder(), "com/moon/q0"), " : "), p1), " : "), __call2012400_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral124_0() throws Throwable;
private static native java.lang.Object __classLiteral124_1() throws Throwable;
private static native int __call124_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call124_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call124_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call124_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call124_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2012400_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012400_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012400_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012400_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2012400_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2012400_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2012400_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_ec12b52a48429872c57d(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_ec12b52a48429872c57d {

public static java.lang.invoke.CallSite f125(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill125_0 = life3_4;
    java.lang.invoke.MethodHandle spill125_1 = __call125_3(__methodHandleLiteral125_0(), __classLiteral125_1(), __call125_2(p2));
    int spill125_2 = 0;
    java.lang.Object[] __stackOp125_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill125_3 = __stackOp125_4_0;
    (__stackOp125_4_0)[0] = p0;
    java.lang.Object[] __stackOp125_5_0 = spill125_3;
    java.lang.Object[] spill125_4 = __stackOp125_5_0;
    (__stackOp125_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp125_6_0 = spill125_4;
    java.lang.Object[] spill125_5 = __stackOp125_6_0;
    (__stackOp125_6_0)[2] = p1;
    __call125_9(spill125_0, __call125_8(__call125_7(spill125_1, spill125_2, spill125_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h125_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2012500_6(__call2012500_5(__call2012500_3(__call2012500_2(__call2012500_1(__call2012500_0(new java.lang.StringBuilder(), "com/moon/q0"), " : "), p1), " : "), __call2012500_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral125_0() throws Throwable;
private static native java.lang.Object __classLiteral125_1() throws Throwable;
private static native int __call125_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call125_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call125_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call125_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call125_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2012500_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012500_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012500_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2012500_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2012500_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2012500_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2012500_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_ec12b52a48429872c57d(p0, p1, p2); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6129;
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
            throw new RuntimeException("com/moon/q0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.q0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_50fda8d99194dbf30d2a(p0, p1); }


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
        byte[] spill1238_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1238_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1238_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1238_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1238_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1238_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_349f4c1a6e0bae92b1aa(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q0.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_23(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_37(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_44(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_51(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic100043_58(java.lang.String a0, java.lang.String a1) throws E;
}
