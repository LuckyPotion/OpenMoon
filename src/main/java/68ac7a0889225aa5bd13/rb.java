package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class rb extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jR a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue196_60_0;
    int forestValue196_76_0;
    int forestValue196_92_0;
    int forestValue196_108_0;
    int forestValue196_124_0;
    int forestValue196_142_0;
    org.luaj.vm2.LuaValue forestValue196_173_0;
    int spill196_0;
    boolean spill196_1;
    org.luaj.vm2.LuaValue spill196_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_8;
    org.luaj.vm2.LuaValue life6_12;
    org.luaj.vm2.LuaValue life7_16;
    int life4_17;
    org.luaj.vm2.LuaValue life8_21;
    org.luaj.vm2.LuaValue life9_25;
    org.luaj.vm2.LuaValue life10_33;
    org.luaj.vm2.LuaValue life11_41;
    forest_join_173: {
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
    life2_3 = (com.moon.rb.b ^ 128248399055090L);
    spill196_0 = com.moon.jN.b();
    life5_8 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    life6_12 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_16 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life4_17 = spill196_0;
    life8_21 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life9_25 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    life10_33 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_7(2299, (3304694865807441982L ^ life2_3)))));
    life11_41 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_9(14457, (8796891245933179069L ^ life2_3)))));
    spill196_1 = ((org.luaj.vm2.LuaValue)(life5_8)).isnumber();
    if (!((life4_17 != 0))) {
        forestValue196_60_0 = ((spill196_1) ? 1 : 0);
        break forest_join_60;
    }
    if (!((!spill196_1))) {
        break forest_join_58;
    }
    java.lang.String __stackOp196_15_0 = ((org.luaj.vm2.LuaValue)(life5_8)).typename();
    java.lang.String __stackOp196_15_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic196_14(641, (547451840627821553L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_16(__stackOp196_15_1, __stackOp196_15_0))));
    }
    forestValue196_60_0 = ((((org.luaj.vm2.LuaValue)(life6_12)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue196_76_0 = forestValue196_60_0;
        break forest_join_76;
    }
    if (!((forestValue196_60_0 == 0))) {
        break forest_join_74;
    }
    java.lang.String __stackOp196_22_0 = ((org.luaj.vm2.LuaValue)(life6_12)).typename();
    java.lang.String __stackOp196_22_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic196_21(3920, (5271326152600503842L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_23(__stackOp196_22_1, __stackOp196_22_0))));
    }
    forestValue196_76_0 = ((((org.luaj.vm2.LuaValue)(life7_16)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue196_92_0 = forestValue196_76_0;
        break forest_join_92;
    }
    if (!((forestValue196_76_0 == 0))) {
        break forest_join_90;
    }
    java.lang.String __stackOp196_29_0 = ((org.luaj.vm2.LuaValue)(life7_16)).typename();
    java.lang.String __stackOp196_29_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic196_28(10781, (5963734593743053673L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_30(__stackOp196_29_1, __stackOp196_29_0))));
    }
    forestValue196_92_0 = ((((org.luaj.vm2.LuaValue)(life8_21)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue196_108_0 = forestValue196_92_0;
        break forest_join_108;
    }
    if (!((forestValue196_92_0 == 0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp196_36_0 = ((org.luaj.vm2.LuaValue)(life8_21)).typename();
    java.lang.String __stackOp196_36_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic196_35(5711, (54753242605969214L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_37(__stackOp196_36_1, __stackOp196_36_0))));
    }
    forestValue196_108_0 = ((((org.luaj.vm2.LuaValue)(life9_25)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue196_124_0 = forestValue196_108_0;
        break forest_join_124;
    }
    if (!((forestValue196_108_0 == 0))) {
        break forest_join_122;
    }
    java.lang.String __stackOp196_43_0 = ((org.luaj.vm2.LuaValue)(life9_25)).typename();
    java.lang.String __stackOp196_43_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic196_42(12813, (8027363374958279546L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_44(__stackOp196_43_1, __stackOp196_43_0))));
    }
    forestValue196_124_0 = ((((org.luaj.vm2.LuaValue)(life10_33)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue196_142_0 = forestValue196_124_0;
        break forest_join_142;
    }
    if (!((forestValue196_124_0 == 0))) {
        break forest_join_138;
    }
    java.lang.String __stackOp196_50_0 = ((org.luaj.vm2.LuaValue)(life10_33)).typename();
    java.lang.String __stackOp196_50_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic196_49(30979, (8341997624386826357L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_51(__stackOp196_50_1, __stackOp196_50_0))));
    }
    spill196_2 = life11_41;
    if (!((life4_17 != 0))) {
        forestValue196_173_0 = spill196_2;
        break forest_join_173;
    }
    forestValue196_142_0 = ((((org.luaj.vm2.LuaValue)(spill196_2)).isnumber()) ? 1 : 0);
    }
    if (!((forestValue196_142_0 == 0))) {
        break forest_join_154;
    }
    java.lang.String __stackOp196_57_0 = ((org.luaj.vm2.LuaValue)(life11_41)).typename();
    java.lang.String __stackOp196_57_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic196_56(19634, (4543233642291037639L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic196_58(__stackOp196_57_1, __stackOp196_57_0))));
    }
    ((com.moon.j0)(((com.moon.jR)(this.a)).c)).triangle(((float)(((org.luaj.vm2.LuaValue)(life5_8)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life6_12)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life7_16)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life8_21)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life9_25)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life10_33)).tofloat())), ((int)(((org.luaj.vm2.LuaValue)(life11_41)).toint())));
    forestValue196_173_0 = com.moon.rb.NIL;
    }
    return forestValue196_173_0;
}


rb(com.moon.jR p0) { super(); }

private static void __sourceConstructorBody_b919260ba0616d8f(com.moon.rb receiver, com.moon.jR p0) throws Throwable {
((com.moon.rb)(receiver)).a = ((com.moon.jR)(p0));
    com.moon.rb.__sourceConstructorInit_b919260ba0616d8f_0(((com.moon.rb)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue293_36_0;
    int forestValue293_36_1;
    javax.crypto.SecretKeyFactory forestValue293_36_2;
    byte[] forestValue293_36_3;
    javax.crypto.Cipher forestValue293_53_0;
    int forestValue293_53_1;
    javax.crypto.SecretKeyFactory forestValue293_53_2;
    byte[] forestValue293_53_3;
    java.lang.String forestValue293_86_0;
    int forestValue293_86_1;
    java.lang.String forestValue293_98_0;
    java.lang.String forestValue293_122_0;
    javax.crypto.Cipher forestValue293_182_0;
    int forestValue293_182_1;
    javax.crypto.SecretKeyFactory forestValue293_182_2;
    byte[] forestValue293_182_3;
    javax.crypto.Cipher forestValue293_199_0;
    int forestValue293_199_1;
    javax.crypto.SecretKeyFactory forestValue293_199_2;
    byte[] forestValue293_199_3;
    javax.crypto.Cipher spill293_0;
    int spill293_1;
    javax.crypto.SecretKeyFactory spill293_2;
    byte[] spill293_3;
    byte[] spill293_4;
    java.lang.String spill293_5;
    int spill293_6;
    java.lang.String spill293_7;
    java.lang.String[] spill293_8;
    java.lang.String[] spill293_9;
    java.lang.String spill293_10;
    java.lang.String spill293_11;
    int spill293_12;
    javax.crypto.Cipher spill293_13;
    int spill293_14;
    javax.crypto.SecretKeyFactory spill293_15;
    byte[] spill293_16;
    byte[] spill293_17;
    java.lang.String spill293_18;
    int spill293_19;
    long[] spill293_20;
    int spill293_21;
    int spill293_22;
    long spill293_23;
    byte[] spill293_24;
    byte[] spill293_25;
    byte[] spill293_26;
    byte[] spill293_27;
    byte[] spill293_28;
    byte[] spill293_29;
    byte[] spill293_30;
    byte[] spill293_31;
    long spill293_32;
    int spill293_33;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(5190041535718429267L)), ((long)(6764316471103655081L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(104581905871500L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.rb.b ^ 53969665496298L);
    spill293_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill293_1 = 2;
    spill293_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp293_9_0 = new byte[8];
    spill293_3 = __stackOp293_9_0;
    (__stackOp293_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue293_36_0 = spill293_0;
    forestValue293_36_1 = spill293_1;
    forestValue293_36_2 = spill293_2;
    forestValue293_36_3 = spill293_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue293_53_0 = forestValue293_36_0;
        forestValue293_53_1 = forestValue293_36_1;
        forestValue293_53_2 = forestValue293_36_2;
        forestValue293_53_3 = forestValue293_36_3;
        break forest_join_53;
    }
    byte[] __stackOp293_10_0 = forestValue293_36_3;
    spill293_4 = __stackOp293_10_0;
    (__stackOp293_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue293_36_3 = spill293_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue293_53_0)).init(((int)(forestValue293_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue293_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue293_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life20_66 = new java.lang.String[7];
    life18_68 = 0;
    life19_73 = ((java.lang.String)((life17_71 = "+H%Ä^ßø\037=j%Ê\030Öw÷\n>¨¥W§Ã`í\032ÕÔó£Ø\"Ç\001³Ç{Mc°6P#Z-©ì58ãÚ)þ-Á_Ä.´fªñtCË\006B´¯Y\001FÙ4JìJÞÑ\013Ô,ò'<Äßÿµk\030­Ã!ç\024tE8pJtòpô¥c\033Óe`ÙÐY÷|Ø\004[ýÈ±\031Ñ7ti\022ß L¤>ø?2\022ó\036°W÷ñ^\0024µ\007G8Dâ\031\016\nÌ¿#º±5 Bõq³Tk1-\177 ¤â\0217È/\007÷¬\005\005\0267?w\\¶\030vþ·Ö9gè\rä8v\006òCñ.fc\nÁ¾¿Ï¸\003\031zbr¶\031u°9Ú+¡ý¹\006âq-àô\031ÞïX«ª<\026\025êèå÷âk"))).length();
    life16_75 = 56;
    life15_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life15_77 += 1;
    spill293_5 = life17_71;
    int __stackOp293_14_0 = life15_77;
    forestValue293_86_0 = ((java.lang.String)(spill293_5)).substring(((int)(__stackOp293_14_0)), ((int)((__stackOp293_14_0 + life16_75))));
    forestValue293_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp293_16_0 = forestValue293_86_0;
    int __stackOp293_16_1 = forestValue293_86_1;
    spill293_6 = __stackOp293_16_1;
    byte[] __stackOp293_18_0 = ((java.lang.String)(__stackOp293_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp293_18_1 = life13_20;
    life21_93 = ((javax.crypto.Cipher)(__stackOp293_18_1)).doFinal(((byte[])(__stackOp293_18_0)));
    int __stackOp293_22_0 = spill293_6;
    java.lang.String __stackOp293_22_1 = ((java.lang.String)(com.moon.rb.a(((byte[])(life21_93))))).intern();
    spill293_7 = __stackOp293_22_1;
    switch (__stackOp293_22_0) {
default:
{
        forestValue293_98_0 = spill293_7;
        break forest_join_98;
    }
case 0:
{
        forestValue293_122_0 = spill293_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp293_23_0 = forestValue293_98_0;
    java.lang.String[] __stackOp293_23_1 = life20_66;
    spill293_8 = __stackOp293_23_1;
    java.lang.String __stackOp293_24_0 = __stackOp293_23_0;
    int __stackOp293_24_1 = (life18_68++);
    (spill293_8)[__stackOp293_24_1] = __stackOp293_24_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life19_73 = ((java.lang.String)((life17_71 = "¿ïÂd/)©RtëC¡\006\000qó»¤¬ìó\036»û5üÜ}ýb\024sýé\004b\016X\026\025f\021Éÿ0ºV\000ozWü¢GÊ÷ÕåV±Û\022S?{6/\r\016»ú²\037!Ü=çë\016Ýþã`þO5"))).length();
    life16_75 = 48;
    life15_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp293_26_0 = forestValue293_122_0;
    java.lang.String[] __stackOp293_26_1 = life20_66;
    spill293_9 = __stackOp293_26_1;
    java.lang.String __stackOp293_27_0 = __stackOp293_26_0;
    int __stackOp293_27_1 = (life18_68++);
    (spill293_9)[__stackOp293_27_1] = __stackOp293_27_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_153;
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    }
    life15_77 += 1;
    spill293_10 = life17_71;
    int __stackOp293_30_0 = life15_77;
    spill293_11 = ((java.lang.String)(spill293_10)).substring(((int)(__stackOp293_30_0)), ((int)((__stackOp293_30_0 + life16_75))));
    spill293_12 = 0;
    forestValue293_86_0 = spill293_11;
    forestValue293_86_1 = spill293_12;
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
    spill293_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill293_14 = 2;
    spill293_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp293_39_0 = new byte[8];
    spill293_16 = __stackOp293_39_0;
    (__stackOp293_39_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_184 = 1;
    forestValue293_182_0 = spill293_13;
    forestValue293_182_1 = spill293_14;
    forestValue293_182_2 = spill293_15;
    forestValue293_182_3 = spill293_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue293_199_0 = forestValue293_182_0;
        forestValue293_199_1 = forestValue293_182_1;
        forestValue293_199_2 = forestValue293_182_2;
        forestValue293_199_3 = forestValue293_182_3;
        break forest_join_199;
    }
    byte[] __stackOp293_40_0 = forestValue293_182_3;
    spill293_17 = __stackOp293_40_0;
    (__stackOp293_40_0)[life1_184] = ((byte) ((int) ((life11_16 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue293_182_3 = spill293_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue293_199_0)).init(((int)(forestValue293_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue293_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue293_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[2];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "¥Å»°}ó¦ü\005\004£g"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill293_18 = life4_220;
    spill293_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill293_18)).substring(((int)(spill293_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill293_20 = life6_215;
    spill293_21 = (life3_217++);
    long __stackOp293_46_0 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    int __stackOp293_46_1 = -1;
    spill293_22 = __stackOp293_46_1;
    spill293_23 = __stackOp293_46_0;
    recovery.source.CarrierOps.discard(__stackOp293_46_1);
    life8_309 = spill293_23;
    byte[] __stackOp293_48_0 = new byte[8];
    spill293_24 = __stackOp293_48_0;
    (__stackOp293_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp293_49_0 = spill293_24;
    spill293_25 = __stackOp293_49_0;
    (__stackOp293_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp293_50_0 = spill293_25;
    spill293_26 = __stackOp293_50_0;
    (__stackOp293_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp293_51_0 = spill293_26;
    spill293_27 = __stackOp293_51_0;
    (__stackOp293_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp293_52_0 = spill293_27;
    spill293_28 = __stackOp293_52_0;
    (__stackOp293_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp293_53_0 = spill293_28;
    spill293_29 = __stackOp293_53_0;
    (__stackOp293_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp293_54_0 = spill293_29;
    spill293_30 = __stackOp293_54_0;
    (__stackOp293_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp293_55_0 = spill293_30;
    spill293_31 = __stackOp293_55_0;
    (__stackOp293_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp293_56_0 = spill293_31;
    javax.crypto.Cipher __stackOp293_56_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp293_56_1)).doFinal(((byte[])(__stackOp293_56_0)));
    int __stackOp293_58_0 = spill293_22;
    long __stackOp293_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill293_32 = __stackOp293_58_1;
    spill293_33 = __stackOp293_58_0;
    recovery.source.CarrierOps.discard(__stackOp293_58_1);
    recovery.source.CarrierOps.discard(spill293_33);
    (spill293_20)[spill293_21] = spill293_32;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    f = ((long[])(life6_215));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_b919260ba0616d8f_0(com.moon.rb a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_21e6f23b0dd79b0a77ad(int a0, long a1) throws E;
private static final class __SourceHandler_21e6f23b0dd79b0a77ad {

public static java.lang.String f181(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13280);
    if (((__fieldRead181_0())[life5_8] == null)) {
        life3_16 = __call181_3(__call181_2(__call181_1()));
        life4_21 = __cast181_6(__call181_5(__fieldRead181_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call181_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call181_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call181_10(__fieldRead181_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call181_12(__cast181_11((life4_21)[1]), life7_92);
        __call181_15(__cast181_13((life4_21)[0]), 2, life8_99, __cast181_14((life4_21)[2]));
        life9_116 = __call181_17((__fieldRead181_16())[life5_8], "ISO-8859-1");
        (__fieldRead181_18())[life5_8] = __call181_21(__call181_20(__cast181_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead181_22())[life5_8];
}
public static java.lang.String h181_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/rb", local1);
}
private static native java.lang.String[] __fieldRead181_0() throws Throwable;
private static native java.lang.Thread __call181_1() throws Throwable;
private static native long __call181_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call181_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead181_4() throws Throwable;
private static native java.lang.Object __call181_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast181_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call181_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call181_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead181_9() throws Throwable;
private static native java.lang.Object __call181_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast181_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call181_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast181_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast181_14(java.lang.Object a0) throws Throwable;
private static native void __call181_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead181_16() throws Throwable;
private static native byte[] __call181_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead181_18() throws Throwable;
private static native javax.crypto.Cipher __cast181_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call181_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call181_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead181_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_acd9a3da27fca6b0c0bc(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_acd9a3da27fca6b0c0bc {

public static java.lang.invoke.CallSite f182(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill182_0 = life3_4;
    java.lang.invoke.MethodHandle spill182_1 = __call182_3(__methodHandleLiteral182_0(), __classLiteral182_1(), __call182_2(p2));
    int spill182_2 = 0;
    java.lang.Object[] __stackOp182_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill182_3 = __stackOp182_4_0;
    (__stackOp182_4_0)[0] = p0;
    java.lang.Object[] __stackOp182_5_0 = spill182_3;
    java.lang.Object[] spill182_4 = __stackOp182_5_0;
    (__stackOp182_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp182_6_0 = spill182_4;
    java.lang.Object[] spill182_5 = __stackOp182_6_0;
    (__stackOp182_6_0)[2] = p1;
    __call182_9(spill182_0, __call182_8(__call182_7(spill182_1, spill182_2, spill182_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h182_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2018200_6(__call2018200_5(__call2018200_3(__call2018200_2(__call2018200_1(__call2018200_0(new java.lang.StringBuilder(), "com/moon/rb"), " : "), p1), " : "), __call2018200_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral182_0() throws Throwable;
private static native java.lang.Object __classLiteral182_1() throws Throwable;
private static native int __call182_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call182_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call182_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call182_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call182_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2018200_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018200_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018200_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018200_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018200_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2018200_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018200_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_07eb3415ba264670fcb5(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_07eb3415ba264670fcb5 {

public static java.lang.invoke.CallSite f183(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill183_0 = life3_4;
    java.lang.invoke.MethodHandle spill183_1 = __call183_3(__methodHandleLiteral183_0(), __classLiteral183_1(), __call183_2(p2));
    int spill183_2 = 0;
    java.lang.Object[] __stackOp183_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill183_3 = __stackOp183_4_0;
    (__stackOp183_4_0)[0] = p0;
    java.lang.Object[] __stackOp183_5_0 = spill183_3;
    java.lang.Object[] spill183_4 = __stackOp183_5_0;
    (__stackOp183_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp183_6_0 = spill183_4;
    java.lang.Object[] spill183_5 = __stackOp183_6_0;
    (__stackOp183_6_0)[2] = p1;
    __call183_9(spill183_0, __call183_8(__call183_7(spill183_1, spill183_2, spill183_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h183_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2018300_6(__call2018300_5(__call2018300_3(__call2018300_2(__call2018300_1(__call2018300_0(new java.lang.StringBuilder(), "com/moon/rb"), " : "), p1), " : "), __call2018300_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral183_0() throws Throwable;
private static native java.lang.Object __classLiteral183_1() throws Throwable;
private static native int __call183_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call183_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call183_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call183_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call183_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2018300_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018300_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018300_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2018300_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018300_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2018300_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2018300_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_07eb3415ba264670fcb5(p0, p1, p2); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29265;
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
            throw new RuntimeException("com/moon/rb", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.rb.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_21e6f23b0dd79b0a77ad(p0, p1); }


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
        byte[] spill1358_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1358_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1358_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1358_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1358_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1358_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_acd9a3da27fca6b0c0bc(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.rb.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic196_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic196_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_23(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_37(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_44(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_51(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic196_58(java.lang.String a0, java.lang.String a1) throws E;
}
