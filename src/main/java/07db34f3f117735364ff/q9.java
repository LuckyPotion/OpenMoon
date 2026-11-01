package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class q9 extends org.luaj.vm2.lib.VarArgFunction {

com.moon.jR a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public org.luaj.vm2.Varargs invoke(org.luaj.vm2.Varargs p0) {
int forestValue168_60_0;
    int forestValue168_76_0;
    int forestValue168_92_0;
    int forestValue168_108_0;
    int forestValue168_124_0;
    int forestValue168_142_0;
    org.luaj.vm2.LuaValue forestValue168_173_0;
    int spill168_0;
    boolean spill168_1;
    org.luaj.vm2.LuaValue spill168_2;
    long life2_3;
    org.luaj.vm2.LuaValue life5_7;
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
    life2_3 = (com.moon.q9.b ^ 16227630436191L);
    life5_7 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(1)));
    spill168_0 = com.moon.jN.b();
    life6_12 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(2)));
    life7_16 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(3)));
    life4_17 = spill168_0;
    life8_21 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(4)));
    life9_25 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(5)));
    life10_33 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_7(12802, (5533283747776360691L ^ life2_3)))));
    life11_41 = ((org.luaj.vm2.Varargs)(p0)).arg(((int)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_9(19791, (3140784153817681855L ^ life2_3)))));
    spill168_1 = ((org.luaj.vm2.LuaValue)(life5_7)).isnumber();
    if (!((life4_17 != 0))) {
        forestValue168_60_0 = ((spill168_1) ? 1 : 0);
        break forest_join_60;
    }
    if (!((!spill168_1))) {
        break forest_join_58;
    }
    java.lang.String __stackOp168_15_0 = ((org.luaj.vm2.LuaValue)(life5_7)).typename();
    java.lang.String __stackOp168_15_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic168_14(13858, (935270362654396340L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_16(__stackOp168_15_1, __stackOp168_15_0))));
    }
    forestValue168_60_0 = ((((org.luaj.vm2.LuaValue)(life6_12)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue168_76_0 = forestValue168_60_0;
        break forest_join_76;
    }
    if (!((forestValue168_60_0 == 0))) {
        break forest_join_74;
    }
    java.lang.String __stackOp168_22_0 = ((org.luaj.vm2.LuaValue)(life6_12)).typename();
    java.lang.String __stackOp168_22_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic168_21(1916, (6957347957701902060L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_23(__stackOp168_22_1, __stackOp168_22_0))));
    }
    forestValue168_76_0 = ((((org.luaj.vm2.LuaValue)(life7_16)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue168_92_0 = forestValue168_76_0;
        break forest_join_92;
    }
    if (!((forestValue168_76_0 == 0))) {
        break forest_join_90;
    }
    java.lang.String __stackOp168_29_0 = ((org.luaj.vm2.LuaValue)(life7_16)).typename();
    java.lang.String __stackOp168_29_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic168_28(24507, (1051596813630711337L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_30(__stackOp168_29_1, __stackOp168_29_0))));
    }
    forestValue168_92_0 = ((((org.luaj.vm2.LuaValue)(life8_21)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue168_108_0 = forestValue168_92_0;
        break forest_join_108;
    }
    if (!((forestValue168_92_0 == 0))) {
        break forest_join_106;
    }
    java.lang.String __stackOp168_36_0 = ((org.luaj.vm2.LuaValue)(life8_21)).typename();
    java.lang.String __stackOp168_36_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic168_35(25053, (2826163375203129416L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_37(__stackOp168_36_1, __stackOp168_36_0))));
    }
    forestValue168_108_0 = ((((org.luaj.vm2.LuaValue)(life9_25)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue168_124_0 = forestValue168_108_0;
        break forest_join_124;
    }
    if (!((forestValue168_108_0 == 0))) {
        break forest_join_122;
    }
    java.lang.String __stackOp168_43_0 = ((org.luaj.vm2.LuaValue)(life9_25)).typename();
    java.lang.String __stackOp168_43_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic168_42(29762, (599459831187541462L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_44(__stackOp168_43_1, __stackOp168_43_0))));
    }
    forestValue168_124_0 = ((((org.luaj.vm2.LuaValue)(life10_33)).isnumber()) ? 1 : 0);
    }
    if (!((life4_17 != 0))) {
        forestValue168_142_0 = forestValue168_124_0;
        break forest_join_142;
    }
    if (!((forestValue168_124_0 == 0))) {
        break forest_join_138;
    }
    java.lang.String __stackOp168_50_0 = ((org.luaj.vm2.LuaValue)(life10_33)).typename();
    java.lang.String __stackOp168_50_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic168_49(19946, (3664781077658678393L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_51(__stackOp168_50_1, __stackOp168_50_0))));
    }
    spill168_2 = life11_41;
    if (!((life4_17 != 0))) {
        forestValue168_173_0 = spill168_2;
        break forest_join_173;
    }
    forestValue168_142_0 = ((((org.luaj.vm2.LuaValue)(spill168_2)).isboolean()) ? 1 : 0);
    }
    if (!((forestValue168_142_0 == 0))) {
        break forest_join_154;
    }
    java.lang.String __stackOp168_57_0 = ((org.luaj.vm2.LuaValue)(life11_41)).typename();
    java.lang.String __stackOp168_57_1 = __sourceIntrinsic_c0e7e14c9556_invokedynamic168_56(20544, (47495896643185111L ^ life2_3));
    return org.luaj.vm2.LuaValue.error(((java.lang.String)(__sourceIntrinsic_c0e7e14c9556_invokedynamic168_58(__stackOp168_57_1, __stackOp168_57_0))));
    }
    ((com.moon.j0)(((com.moon.jR)(this.a)).c)).gradient_rect(((float)(((org.luaj.vm2.LuaValue)(life5_7)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life6_12)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life7_16)).tofloat())), ((float)(((org.luaj.vm2.LuaValue)(life8_21)).tofloat())), ((int)(((org.luaj.vm2.LuaValue)(life9_25)).toint())), ((int)(((org.luaj.vm2.LuaValue)(life10_33)).toint())), ((boolean)(((org.luaj.vm2.LuaValue)(life11_41)).toboolean())));
    forestValue168_173_0 = com.moon.q9.NIL;
    }
    return forestValue168_173_0;
}


q9(com.moon.jR p0) { super(); }

private static void __sourceConstructorBody_9890e295a8390a2b(com.moon.q9 receiver, com.moon.jR p0) throws Throwable {
((com.moon.q9)(receiver)).a = ((com.moon.jR)(p0));
    com.moon.q9.__sourceConstructorInit_9890e295a8390a2b_0(((com.moon.q9)(receiver)));
    return;
}


static {
javax.crypto.Cipher forestValue149_36_0;
    int forestValue149_36_1;
    javax.crypto.SecretKeyFactory forestValue149_36_2;
    byte[] forestValue149_36_3;
    javax.crypto.Cipher forestValue149_53_0;
    int forestValue149_53_1;
    javax.crypto.SecretKeyFactory forestValue149_53_2;
    byte[] forestValue149_53_3;
    java.lang.String forestValue149_86_0;
    int forestValue149_86_1;
    java.lang.String forestValue149_98_0;
    java.lang.String forestValue149_122_0;
    javax.crypto.Cipher forestValue149_182_0;
    int forestValue149_182_1;
    javax.crypto.SecretKeyFactory forestValue149_182_2;
    byte[] forestValue149_182_3;
    javax.crypto.Cipher forestValue149_199_0;
    int forestValue149_199_1;
    javax.crypto.SecretKeyFactory forestValue149_199_2;
    byte[] forestValue149_199_3;
    javax.crypto.Cipher spill149_0;
    int spill149_1;
    javax.crypto.SecretKeyFactory spill149_2;
    byte[] spill149_3;
    byte[] spill149_4;
    java.lang.String spill149_5;
    int spill149_6;
    java.lang.String spill149_7;
    java.lang.String[] spill149_8;
    java.lang.String[] spill149_9;
    java.lang.String spill149_10;
    java.lang.String spill149_11;
    int spill149_12;
    javax.crypto.Cipher spill149_13;
    int spill149_14;
    javax.crypto.SecretKeyFactory spill149_15;
    byte[] spill149_16;
    byte[] spill149_17;
    java.lang.String spill149_18;
    int spill149_19;
    long[] spill149_20;
    int spill149_21;
    int spill149_22;
    long spill149_23;
    byte[] spill149_24;
    byte[] spill149_25;
    byte[] spill149_26;
    byte[] spill149_27;
    byte[] spill149_28;
    byte[] spill149_29;
    byte[] spill149_30;
    byte[] spill149_31;
    long spill149_32;
    int spill149_33;
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
    b = ((long)(((moom._a)(moom._c.a(((long)(7080007592157712930L)), ((long)(-5984199795337368056L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(28815291674169L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.q9.b ^ 39749811578720L);
    spill149_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill149_1 = 2;
    spill149_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp149_9_0 = new byte[8];
    spill149_3 = __stackOp149_9_0;
    (__stackOp149_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue149_36_0 = spill149_0;
    forestValue149_36_1 = spill149_1;
    forestValue149_36_2 = spill149_2;
    forestValue149_36_3 = spill149_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue149_53_0 = forestValue149_36_0;
        forestValue149_53_1 = forestValue149_36_1;
        forestValue149_53_2 = forestValue149_36_2;
        forestValue149_53_3 = forestValue149_36_3;
        break forest_join_53;
    }
    byte[] __stackOp149_10_0 = forestValue149_36_3;
    spill149_4 = __stackOp149_10_0;
    (__stackOp149_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue149_36_3 = spill149_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue149_53_0)).init(((int)(forestValue149_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue149_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue149_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life20_66 = new java.lang.String[7];
    life18_68 = 0;
    life19_73 = ((java.lang.String)((life17_71 = "\007\035}÷\0331Ð|éxè(ÈÏe,DíZÑ¤Ï~5í³X7@\003x\002\017pÆ/õ\032Ï'DëÜu\032²ÙH±«Æ·\006,zÆ¯qh9ÛYcÈÓ#ë?³vmrãÖÇxk°ö@?I·¯|\024[Ë\013\000 \025è\bJ\0259~¿\034ÀÉÈ\037h8\026\0013«^ftÒ*UY$R\024\033®r!\t C×w[\037Ú²*Î y\0133æp+ä+;d4É¿·\031Á®·¨¼¶480+åî\024\017Å!¹rDIý²»O§«CÖí\\ðµ³ëTJd­\013:[AèJ¤i|°ÒÉ\030ª%0ªÜ=hÔ{ s}1ÃÑAç$=N\007ÉÖÜ²{Py8¤IGØeU@³Wmâ<´?\021"))).length();
    life16_75 = 56;
    life15_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life15_77 += 1;
    spill149_5 = life17_71;
    int __stackOp149_14_0 = life15_77;
    forestValue149_86_0 = ((java.lang.String)(spill149_5)).substring(((int)(__stackOp149_14_0)), ((int)((__stackOp149_14_0 + life16_75))));
    forestValue149_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp149_16_0 = forestValue149_86_0;
    int __stackOp149_16_1 = forestValue149_86_1;
    spill149_6 = __stackOp149_16_1;
    byte[] __stackOp149_18_0 = ((java.lang.String)(__stackOp149_16_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp149_18_1 = life13_20;
    life21_93 = ((javax.crypto.Cipher)(__stackOp149_18_1)).doFinal(((byte[])(__stackOp149_18_0)));
    int __stackOp149_22_0 = spill149_6;
    java.lang.String __stackOp149_22_1 = ((java.lang.String)(com.moon.q9.a(((byte[])(life21_93))))).intern();
    spill149_7 = __stackOp149_22_1;
    switch (__stackOp149_22_0) {
default:
{
        forestValue149_98_0 = spill149_7;
        break forest_join_98;
    }
case 0:
{
        forestValue149_122_0 = spill149_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp149_23_0 = forestValue149_98_0;
    java.lang.String[] __stackOp149_23_1 = life20_66;
    spill149_8 = __stackOp149_23_1;
    java.lang.String __stackOp149_24_0 = __stackOp149_23_0;
    int __stackOp149_24_1 = (life18_68++);
    (spill149_8)[__stackOp149_24_1] = __stackOp149_24_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life19_73 = ((java.lang.String)((life17_71 = "-ZòªÜf\022lë\035!.ýE?kWÓ\004b²\0011¹\tI\024<­\037rnÕhÛyµ@48\023E\006\026¨Ctcö³ FnÜePnþ¸$èí±ëy£Ì`\r+>f~ÅúçE¢z\037è¤]E\000³ñu\032JÁM"))).length();
    life16_75 = 48;
    life15_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp149_26_0 = forestValue149_122_0;
    java.lang.String[] __stackOp149_26_1 = life20_66;
    spill149_9 = __stackOp149_26_1;
    java.lang.String __stackOp149_27_0 = __stackOp149_26_0;
    int __stackOp149_27_1 = (life18_68++);
    (spill149_9)[__stackOp149_27_1] = __stackOp149_27_0;
    if (!(((life15_77 = (life15_77 + life16_75)) < life19_73))) {
        break forest_join_153;
    }
    life16_75 = ((int)(((java.lang.String)(life17_71)).charAt(((int)(life15_77)))));
    }
    life15_77 += 1;
    spill149_10 = life17_71;
    int __stackOp149_30_0 = life15_77;
    spill149_11 = ((java.lang.String)(spill149_10)).substring(((int)(__stackOp149_30_0)), ((int)((__stackOp149_30_0 + life16_75))));
    spill149_12 = 0;
    forestValue149_86_0 = spill149_11;
    forestValue149_86_1 = spill149_12;
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
    spill149_13 = (life0_169 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill149_14 = 2;
    spill149_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp149_39_0 = new byte[8];
    spill149_16 = __stackOp149_39_0;
    (__stackOp149_39_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_184 = 1;
    forestValue149_182_0 = spill149_13;
    forestValue149_182_1 = spill149_14;
    forestValue149_182_2 = spill149_15;
    forestValue149_182_3 = spill149_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue149_199_0 = forestValue149_182_0;
        forestValue149_199_1 = forestValue149_182_1;
        forestValue149_199_2 = forestValue149_182_2;
        forestValue149_199_3 = forestValue149_182_3;
        break forest_join_199;
    }
    byte[] __stackOp149_40_0 = forestValue149_182_3;
    spill149_17 = __stackOp149_40_0;
    (__stackOp149_40_0)[life1_184] = ((byte) ((int) ((life11_16 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue149_182_3 = spill149_17;
    continue forest_cycle_182;
    }
    }
    ((javax.crypto.Cipher)(forestValue149_199_0)).init(((int)(forestValue149_199_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue149_199_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue149_199_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_215 = new long[2];
    life3_217 = 0;
    life5_222 = ((java.lang.String)((life4_220 = "[´ÈÛÇÇde)\020ü¥tÂÈ\033"))).length();
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill149_18 = life4_220;
    spill149_19 = life2_224;
    life2_224 += 8;
    life7_232 = ((java.lang.String)(((java.lang.String)(spill149_18)).substring(((int)(spill149_19)), ((int)(life2_224))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill149_20 = life6_215;
    spill149_21 = (life3_217++);
    long __stackOp149_46_0 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    int __stackOp149_46_1 = -1;
    spill149_22 = __stackOp149_46_1;
    spill149_23 = __stackOp149_46_0;
    recovery.source.CarrierOps.discard(__stackOp149_46_1);
    life8_309 = spill149_23;
    byte[] __stackOp149_48_0 = new byte[8];
    spill149_24 = __stackOp149_48_0;
    (__stackOp149_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp149_49_0 = spill149_24;
    spill149_25 = __stackOp149_49_0;
    (__stackOp149_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp149_50_0 = spill149_25;
    spill149_26 = __stackOp149_50_0;
    (__stackOp149_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp149_51_0 = spill149_26;
    spill149_27 = __stackOp149_51_0;
    (__stackOp149_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp149_52_0 = spill149_27;
    spill149_28 = __stackOp149_52_0;
    (__stackOp149_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp149_53_0 = spill149_28;
    spill149_29 = __stackOp149_53_0;
    (__stackOp149_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp149_54_0 = spill149_29;
    spill149_30 = __stackOp149_54_0;
    (__stackOp149_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp149_55_0 = spill149_30;
    spill149_31 = __stackOp149_55_0;
    (__stackOp149_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp149_56_0 = spill149_31;
    javax.crypto.Cipher __stackOp149_56_1 = life0_169;
    life10_377 = ((javax.crypto.Cipher)(__stackOp149_56_1)).doFinal(((byte[])(__stackOp149_56_0)));
    int __stackOp149_58_0 = spill149_22;
    long __stackOp149_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill149_32 = __stackOp149_58_1;
    spill149_33 = __stackOp149_58_0;
    recovery.source.CarrierOps.discard(__stackOp149_58_1);
    recovery.source.CarrierOps.discard(spill149_33);
    (spill149_20)[spill149_21] = spill149_32;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    break forest_cycle_222;
    }
    f = ((long[])(life6_215));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_9890e295a8390a2b_0(com.moon.q9 a0) throws E;
private static native <E extends Throwable> java.lang.String __sourceHandlerCall_77ab87fef67ebb2c28a0(int a0, long a1) throws E;
private static final class __SourceHandler_77ab87fef67ebb2c28a0 {

public static java.lang.String f142(int p0, long p1) throws Throwable {
    int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12085);
    if (((__fieldRead142_0())[life5_8] == null)) {
        life3_16 = __call142_3(__call142_2(__call142_1()));
        life4_21 = __cast142_6(__call142_5(__fieldRead142_4(), life3_16));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = __call142_7("DES/CBC/PKCS5Padding");
        (life4_21)[1] = __call142_8("DES");
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        __call142_10(__fieldRead142_9(), life3_16, life4_21);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_63: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = __call142_12(__cast142_11((life4_21)[1]), life7_92);
        __call142_15(__cast142_13((life4_21)[0]), 2, life8_99, __cast142_14((life4_21)[2]));
        life9_116 = __call142_17((__fieldRead142_16())[life5_8], "ISO-8859-1");
        (__fieldRead142_18())[life5_8] = __call142_21(__call142_20(__cast142_19((life4_21)[0]), life9_116));
    }
    return (__fieldRead142_22())[life5_8];
}
public static java.lang.String h142_0(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    throw new java.lang.RuntimeException("com/moon/q9", local1);
}
private static native java.lang.String[] __fieldRead142_0() throws Throwable;
private static native java.lang.Thread __call142_1() throws Throwable;
private static native long __call142_2(java.lang.Thread a0) throws Throwable;
private static native java.lang.Long __call142_3(long a0) throws Throwable;
private static native java.util.Map __fieldRead142_4() throws Throwable;
private static native java.lang.Object __call142_5(java.util.Map a0, java.lang.Long a1) throws Throwable;
private static native java.lang.Object[] __cast142_6(java.lang.Object a0) throws Throwable;
private static native javax.crypto.Cipher __call142_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call142_8(java.lang.String a0) throws Throwable;
private static native java.util.Map __fieldRead142_9() throws Throwable;
private static native java.lang.Object __call142_10(java.util.Map a0, java.lang.Long a1, java.lang.Object[] a2) throws Throwable;
private static native javax.crypto.SecretKeyFactory __cast142_11(java.lang.Object a0) throws Throwable;
private static native javax.crypto.SecretKey __call142_12(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native javax.crypto.Cipher __cast142_13(java.lang.Object a0) throws Throwable;
private static native javax.crypto.spec.IvParameterSpec __cast142_14(java.lang.Object a0) throws Throwable;
private static native void __call142_15(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native java.lang.String[] __fieldRead142_16() throws Throwable;
private static native byte[] __call142_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __fieldRead142_18() throws Throwable;
private static native javax.crypto.Cipher __cast142_19(java.lang.Object a0) throws Throwable;
private static native byte[] __call142_20(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call142_21(byte[] a0) throws Throwable;
private static native java.lang.String[] __fieldRead142_22() throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_2889681c505439f1d7c5(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_2889681c505439f1d7c5 {

public static java.lang.invoke.CallSite f143(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill143_0 = life3_4;
    java.lang.invoke.MethodHandle spill143_1 = __call143_3(__methodHandleLiteral143_0(), __classLiteral143_1(), __call143_2(p2));
    int spill143_2 = 0;
    java.lang.Object[] __stackOp143_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill143_3 = __stackOp143_4_0;
    (__stackOp143_4_0)[0] = p0;
    java.lang.Object[] __stackOp143_5_0 = spill143_3;
    java.lang.Object[] spill143_4 = __stackOp143_5_0;
    (__stackOp143_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp143_6_0 = spill143_4;
    java.lang.Object[] spill143_5 = __stackOp143_6_0;
    (__stackOp143_6_0)[2] = p1;
    __call143_9(spill143_0, __call143_8(__call143_7(spill143_1, spill143_2, spill143_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h143_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2014300_6(__call2014300_5(__call2014300_3(__call2014300_2(__call2014300_1(__call2014300_0(new java.lang.StringBuilder(), "com/moon/q9"), " : "), p1), " : "), __call2014300_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral143_0() throws Throwable;
private static native java.lang.Object __classLiteral143_1() throws Throwable;
private static native int __call143_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call143_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call143_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call143_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call143_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2014300_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014300_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014300_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014300_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014300_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2014300_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014300_6(java.lang.StringBuilder a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.invoke.CallSite __sourceHandlerCall_d867fd0f4299f4c681d8(java.lang.invoke.MethodHandles.Lookup a0, java.lang.String a1, java.lang.invoke.MethodType a2) throws E;
private static final class __SourceHandler_d867fd0f4299f4c681d8 {

public static java.lang.invoke.CallSite f144(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.invoke.MutableCallSite life3_4;
    life3_4 = new java.lang.invoke.MutableCallSite(p2);
    java.lang.invoke.MutableCallSite spill144_0 = life3_4;
    java.lang.invoke.MethodHandle spill144_1 = __call144_3(__methodHandleLiteral144_0(), __classLiteral144_1(), __call144_2(p2));
    int spill144_2 = 0;
    java.lang.Object[] __stackOp144_4_0 = new java.lang.Object[3];
    java.lang.Object[] spill144_3 = __stackOp144_4_0;
    (__stackOp144_4_0)[0] = p0;
    java.lang.Object[] __stackOp144_5_0 = spill144_3;
    java.lang.Object[] spill144_4 = __stackOp144_5_0;
    (__stackOp144_5_0)[1] = life3_4;
    java.lang.Object[] __stackOp144_6_0 = spill144_4;
    java.lang.Object[] spill144_5 = __stackOp144_6_0;
    (__stackOp144_6_0)[2] = p1;
    __call144_9(spill144_0, __call144_8(__call144_7(spill144_1, spill144_2, spill144_5), p2));
    return life3_4;
}
public static java.lang.invoke.CallSite h144_0(java.lang.Exception p0, java.lang.String p1, java.lang.invoke.MethodType p2) throws Throwable {
    java.lang.Exception local3 = p0;
    throw new java.lang.RuntimeException(__call2014400_6(__call2014400_5(__call2014400_3(__call2014400_2(__call2014400_1(__call2014400_0(new java.lang.StringBuilder(), "com/moon/q9"), " : "), p1), " : "), __call2014400_4(p2))), local3);
}
private static native java.lang.invoke.MethodHandle __methodHandleLiteral144_0() throws Throwable;
private static native java.lang.Object __classLiteral144_1() throws Throwable;
private static native int __call144_2(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.invoke.MethodHandle __call144_3(java.lang.invoke.MethodHandle a0, java.lang.Object a1, int a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call144_7(java.lang.invoke.MethodHandle a0, int a1, java.lang.Object[] a2) throws Throwable;
private static native java.lang.invoke.MethodHandle __call144_8(java.lang.invoke.MethodHandle a0, java.lang.invoke.MethodType a1) throws Throwable;
private static native void __call144_9(java.lang.invoke.MutableCallSite a0, java.lang.invoke.MethodHandle a1) throws Throwable;
private static native java.lang.StringBuilder __call2014400_0(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014400_1(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014400_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.StringBuilder __call2014400_3(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014400_4(java.lang.invoke.MethodType a0) throws Throwable;
private static native java.lang.StringBuilder __call2014400_5(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call2014400_6(java.lang.StringBuilder a0) throws Throwable;

}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_d867fd0f4299f4c681d8(p0, p1, p2); }


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5202;
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
            throw new RuntimeException("com/moon/q9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.q9.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) { return __sourceHandlerCall_77ab87fef67ebb2c28a0(p0, p1); }


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
        byte[] spill1254_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1254_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1254_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1254_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1254_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1254_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) { return __sourceHandlerCall_2889681c505439f1d7c5(p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.q9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic168_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c0e7e14c9556_invokedynamic168_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_16(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_23(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_30(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_37(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_44(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_49(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_51(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c0e7e14c9556_invokedynamic168_58(java.lang.String a0, java.lang.String a1) throws E;
}
