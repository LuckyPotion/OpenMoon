package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class n0 {

private static net.minecraft.client.Minecraft a;

private static net.minecraft.client.renderer.entity.RenderManager b;

private static java.util.concurrent.ConcurrentHashMap<java.util.UUID, com.moon.n1> c;

private static boolean d;

public static boolean e;

private int f;

private static com.moon.module.impl.Camera g;

private static long h;

private static long[] i;

private static java.lang.Integer[] j;

private static java.util.Map k;

private static long[] l;

private static java.lang.Long[] m;

private static java.util.Map n;

public n0() {
super();
    com.moon.n0.g = ((com.moon.module.impl.Camera) (((com.moon.runtime.ClientContext.getInstance()).a__fU()).a(com.moon.module.impl.Camera.class)));
}


static {
javax.crypto.Cipher forestValue400003_36_0;
    int forestValue400003_36_1;
    javax.crypto.SecretKeyFactory forestValue400003_36_2;
    byte[] forestValue400003_36_3;
    javax.crypto.Cipher forestValue400003_53_0;
    int forestValue400003_53_1;
    javax.crypto.SecretKeyFactory forestValue400003_53_2;
    byte[] forestValue400003_53_3;
    long[] forestValue400003_157_0;
    int forestValue400003_157_1;
    long forestValue400003_157_2;
    int forestValue400003_157_3;
    long[] forestValue400003_300_0;
    int forestValue400003_300_1;
    long forestValue400003_300_2;
    long[] forestValue400003_312_0;
    int forestValue400003_312_1;
    long forestValue400003_312_2;
    javax.crypto.Cipher forestValue400003_428_0;
    int forestValue400003_428_1;
    javax.crypto.SecretKeyFactory forestValue400003_428_2;
    byte[] forestValue400003_428_3;
    javax.crypto.Cipher forestValue400003_445_0;
    int forestValue400003_445_1;
    javax.crypto.SecretKeyFactory forestValue400003_445_2;
    byte[] forestValue400003_445_3;
    javax.crypto.Cipher spill400003_0;
    int spill400003_1;
    javax.crypto.SecretKeyFactory spill400003_2;
    byte[] spill400003_3;
    byte[] spill400003_4;
    java.lang.String spill400003_5;
    int spill400003_6;
    int spill400003_7;
    long spill400003_8;
    long spill400003_9;
    int spill400003_10;
    java.lang.String spill400003_11;
    int spill400003_12;
    long[] spill400003_13;
    int spill400003_14;
    long spill400003_15;
    int spill400003_16;
    javax.crypto.Cipher spill400003_17;
    int spill400003_18;
    javax.crypto.SecretKeyFactory spill400003_19;
    byte[] spill400003_20;
    byte[] spill400003_21;
    java.lang.String spill400003_22;
    int spill400003_23;
    long[] spill400003_24;
    int spill400003_25;
    int spill400003_26;
    long spill400003_27;
    long spill400003_28;
    int spill400003_29;
    long life11_16;
    javax.crypto.Cipher life13_20;
    int life14_35;
    long[] life19_66;
    int life16_68;
    java.lang.String life17_71;
    int life18_73;
    int life15_75;
    byte[] life20_83;
    long life21_160;
    byte[] life23_228;
    byte[] life20_325;
    javax.crypto.Cipher life0_414;
    int life1_429;
    long[] life6_460;
    int life3_462;
    java.lang.String life4_465;
    int life5_467;
    int life2_469;
    byte[] life7_477;
    long life8_554;
    byte[] life10_622;
    forest_join_445: {
    forest_join_399: {
    forest_join_53: {
    h = ((long)(((moom._a)(moom._c.a(((long)(-4783680276084009075L)), ((long)(-2434787135578332827L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(183328638156504L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    life11_16 = (com.moon.n0.h ^ 127718471336436L);
    spill400003_0 = (life13_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill400003_1 = 2;
    spill400003_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400003_9_0 = new byte[8];
    spill400003_3 = __stackOp400003_9_0;
    (__stackOp400003_9_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life14_35 = 1;
    forestValue400003_36_0 = spill400003_0;
    forestValue400003_36_1 = spill400003_1;
    forestValue400003_36_2 = spill400003_2;
    forestValue400003_36_3 = spill400003_3;
    forest_cycle_36: while (true) {
    if (!((life14_35 < 8))) {
        forestValue400003_53_0 = forestValue400003_36_0;
        forestValue400003_53_1 = forestValue400003_36_1;
        forestValue400003_53_2 = forestValue400003_36_2;
        forestValue400003_53_3 = forestValue400003_36_3;
        break forest_join_53;
    }
    byte[] __stackOp400003_10_0 = forestValue400003_36_3;
    spill400003_4 = __stackOp400003_10_0;
    (__stackOp400003_10_0)[life14_35] = ((byte) ((int) ((life11_16 << (life14_35 * 8)) >>> 56)));
    life14_35 += 1;
    forestValue400003_36_3 = spill400003_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue400003_53_0)).init(((int)(forestValue400003_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400003_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400003_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life19_66 = new long[6];
    life16_68 = 0;
    life18_73 = ((java.lang.String)((life17_71 = "ýgNº¡ \002-¼±úþÔeÝBîAiO·P½x^ö?lý"))).length();
    life15_75 = 0;
    forest_cycle_76: while (true) {
    spill400003_5 = life17_71;
    spill400003_6 = life15_75;
    life15_75 += 8;
    life20_83 = ((java.lang.String)(((java.lang.String)(spill400003_5)).substring(((int)(spill400003_6)), ((int)(life15_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue400003_157_0 = life19_66;
    forestValue400003_157_1 = (life16_68++);
    forestValue400003_157_2 = (((((((((((long) (life20_83)[0]) & 255L) << 56) | ((((long) (life20_83)[1]) & 255L) << 48)) | ((((long) (life20_83)[2]) & 255L) << 40)) | ((((long) (life20_83)[3]) & 255L) << 32)) | ((((long) (life20_83)[4]) & 255L) << 24)) | ((((long) (life20_83)[5]) & 255L) << 16)) | ((((long) (life20_83)[6]) & 255L) << 8)) | (((long) (life20_83)[7]) & 255L));
    forestValue400003_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp400003_16_0 = forestValue400003_157_2;
    int __stackOp400003_16_1 = forestValue400003_157_3;
    spill400003_7 = __stackOp400003_16_1;
    spill400003_8 = __stackOp400003_16_0;
    recovery.source.CarrierOps.discard(__stackOp400003_16_1);
    life21_160 = spill400003_8;
    byte[] __stackOp400003_18_0 = new byte[] {((byte) ((int) (life21_160 >>> 56))), ((byte) ((int) (life21_160 >>> 48))), ((byte) ((int) (life21_160 >>> 40))), ((byte) ((int) (life21_160 >>> 32))), ((byte) ((int) (life21_160 >>> 24))), ((byte) ((int) (life21_160 >>> 16))), ((byte) ((int) (life21_160 >>> 8))), ((byte) ((int) life21_160))};
    javax.crypto.Cipher __stackOp400003_18_1 = life13_20;
    life23_228 = ((javax.crypto.Cipher)(__stackOp400003_18_1)).doFinal(((byte[])(__stackOp400003_18_0)));
    int __stackOp400003_20_0 = spill400003_7;
    long __stackOp400003_20_1 = (((((((((((long) (life23_228)[0]) & 255L) << 56) | ((((long) (life23_228)[1]) & 255L) << 48)) | ((((long) (life23_228)[2]) & 255L) << 40)) | ((((long) (life23_228)[3]) & 255L) << 32)) | ((((long) (life23_228)[4]) & 255L) << 24)) | ((((long) (life23_228)[5]) & 255L) << 16)) | ((((long) (life23_228)[6]) & 255L) << 8)) | (((long) (life23_228)[7]) & 255L));
    spill400003_9 = __stackOp400003_20_1;
    spill400003_10 = __stackOp400003_20_0;
    recovery.source.CarrierOps.discard(__stackOp400003_20_1);
    switch (spill400003_10) {
default:
{
        forestValue400003_300_0 = forestValue400003_157_0;
        forestValue400003_300_1 = forestValue400003_157_1;
        forestValue400003_300_2 = spill400003_9;
        break forest_join_300;
    }
case 0:
{
        forestValue400003_312_0 = forestValue400003_157_0;
        forestValue400003_312_1 = forestValue400003_157_1;
        forestValue400003_312_2 = spill400003_9;
        break forest_join_312;
    }
}
    }
    (forestValue400003_300_0)[forestValue400003_300_1] = forestValue400003_300_2;
    if (!((life15_75 >= life18_73))) {
        continue forest_cycle_76;
    }
    life18_73 = ((java.lang.String)((life17_71 = "Ò|¤bÀZ¦ºöC*¯\027"))).length();
    life15_75 = 0;
    break forest_join_317;
    }
    (forestValue400003_312_0)[forestValue400003_312_1] = forestValue400003_312_2;
    if (!((life15_75 >= life18_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill400003_11 = life17_71;
    spill400003_12 = life15_75;
    life15_75 += 8;
    life20_325 = ((java.lang.String)(((java.lang.String)(spill400003_11)).substring(((int)(spill400003_12)), ((int)(life15_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill400003_13 = life19_66;
    spill400003_14 = (life16_68++);
    spill400003_15 = (((((((((((long) (life20_325)[0]) & 255L) << 56) | ((((long) (life20_325)[1]) & 255L) << 48)) | ((((long) (life20_325)[2]) & 255L) << 40)) | ((((long) (life20_325)[3]) & 255L) << 32)) | ((((long) (life20_325)[4]) & 255L) << 24)) | ((((long) (life20_325)[5]) & 255L) << 16)) | ((((long) (life20_325)[6]) & 255L) << 8)) | (((long) (life20_325)[7]) & 255L));
    spill400003_16 = 0;
    forestValue400003_157_0 = spill400003_13;
    forestValue400003_157_1 = spill400003_14;
    forestValue400003_157_2 = spill400003_15;
    forestValue400003_157_3 = spill400003_16;
    continue forest_cycle_157;
    }
    }
    }
    i = ((long[])(life19_66));
    j = ((java.lang.Integer[])(new java.lang.Integer[6]));
    n = ((java.util.Map)(new java.util.HashMap(13)));
    spill400003_17 = (life0_414 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill400003_18 = 2;
    spill400003_19 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp400003_30_0 = new byte[8];
    spill400003_20 = __stackOp400003_30_0;
    (__stackOp400003_30_0)[0] = ((byte) ((int) (life11_16 >>> 56)));
    life1_429 = 1;
    forestValue400003_428_0 = spill400003_17;
    forestValue400003_428_1 = spill400003_18;
    forestValue400003_428_2 = spill400003_19;
    forestValue400003_428_3 = spill400003_20;
    forest_cycle_428: while (true) {
    if (!((life1_429 < 8))) {
        forestValue400003_445_0 = forestValue400003_428_0;
        forestValue400003_445_1 = forestValue400003_428_1;
        forestValue400003_445_2 = forestValue400003_428_2;
        forestValue400003_445_3 = forestValue400003_428_3;
        break forest_join_445;
    }
    byte[] __stackOp400003_31_0 = forestValue400003_428_3;
    spill400003_21 = __stackOp400003_31_0;
    (__stackOp400003_31_0)[life1_429] = ((byte) ((int) ((life11_16 << (life1_429 * 8)) >>> 56)));
    life1_429 += 1;
    forestValue400003_428_3 = spill400003_21;
    continue forest_cycle_428;
    }
    }
    ((javax.crypto.Cipher)(forestValue400003_445_0)).init(((int)(forestValue400003_445_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue400003_445_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue400003_445_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_460 = new long[3];
    life3_462 = 0;
    life5_467 = ((java.lang.String)((life4_465 = "9vÌýiX¬àuÛþ¥\030Gð%\b°\036ÿåm;"))).length();
    life2_469 = 0;
    forest_cycle_468: while (true) {
    spill400003_22 = life4_465;
    spill400003_23 = life2_469;
    life2_469 += 8;
    life7_477 = ((java.lang.String)(((java.lang.String)(spill400003_22)).substring(((int)(spill400003_23)), ((int)(life2_469))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill400003_24 = life6_460;
    spill400003_25 = (life3_462++);
    long __stackOp400003_37_0 = (((((((((((long) (life7_477)[0]) & 255L) << 56) | ((((long) (life7_477)[1]) & 255L) << 48)) | ((((long) (life7_477)[2]) & 255L) << 40)) | ((((long) (life7_477)[3]) & 255L) << 32)) | ((((long) (life7_477)[4]) & 255L) << 24)) | ((((long) (life7_477)[5]) & 255L) << 16)) | ((((long) (life7_477)[6]) & 255L) << 8)) | (((long) (life7_477)[7]) & 255L));
    int __stackOp400003_37_1 = -1;
    spill400003_26 = __stackOp400003_37_1;
    spill400003_27 = __stackOp400003_37_0;
    recovery.source.CarrierOps.discard(__stackOp400003_37_1);
    life8_554 = spill400003_27;
    byte[] __stackOp400003_39_0 = new byte[] {((byte) ((int) (life8_554 >>> 56))), ((byte) ((int) (life8_554 >>> 48))), ((byte) ((int) (life8_554 >>> 40))), ((byte) ((int) (life8_554 >>> 32))), ((byte) ((int) (life8_554 >>> 24))), ((byte) ((int) (life8_554 >>> 16))), ((byte) ((int) (life8_554 >>> 8))), ((byte) ((int) life8_554))};
    javax.crypto.Cipher __stackOp400003_39_1 = life0_414;
    life10_622 = ((javax.crypto.Cipher)(__stackOp400003_39_1)).doFinal(((byte[])(__stackOp400003_39_0)));
    int __stackOp400003_41_0 = spill400003_26;
    long __stackOp400003_41_1 = (((((((((((long) (life10_622)[0]) & 255L) << 56) | ((((long) (life10_622)[1]) & 255L) << 48)) | ((((long) (life10_622)[2]) & 255L) << 40)) | ((((long) (life10_622)[3]) & 255L) << 32)) | ((((long) (life10_622)[4]) & 255L) << 24)) | ((((long) (life10_622)[5]) & 255L) << 16)) | ((((long) (life10_622)[6]) & 255L) << 8)) | (((long) (life10_622)[7]) & 255L));
    spill400003_28 = __stackOp400003_41_1;
    spill400003_29 = __stackOp400003_41_0;
    recovery.source.CarrierOps.discard(__stackOp400003_41_1);
    recovery.source.CarrierOps.discard(spill400003_29);
    (spill400003_24)[spill400003_25] = spill400003_28;
    if (!((life2_469 >= life5_467))) {
        continue forest_cycle_468;
    }
    break forest_cycle_468;
    }
    l = ((long[])(life6_460));
    m = ((java.lang.Long[])(new java.lang.Long[3]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
    b = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.n0.a)).a__nw()));
    c = ((java.util.concurrent.ConcurrentHashMap)(new java.util.concurrent.ConcurrentHashMap()));
    d = ((boolean)(((org.lwjgl.opengl.ContextCapabilities)(org.lwjgl.opengl.GLContext.getCapabilities())).OpenGL33));
    e = ((boolean)(false));
}

private static native <E extends Throwable> void __sourceHandlerCall_bdbe513632157fe17607(com.moon.n0 a0) throws E;
private static final class __SourceHandler_bdbe513632157fe17607 {

public static void f92(com.moon.n0 receiver) throws Throwable {
    int lexicalValue92_38_0;
    int lexicalValue92_42_0;
    int lexicalValue92_44_0;
    int lexicalValue92_52_0;
    com.moon.n1 lexicalValue92_105_0;
    int lexicalValue92_105_1;
    com.moon.n1 lexicalValue92_106_0;
    com.moon.n1 lexicalValue92_107_0;
    int lexicalValue92_107_1;
    int lexicalValue92_118_0;
    int lexicalValue92_127_0;
    boolean spill92_0;
    boolean spill92_1;
    boolean spill92_2;
    int spill92_3;
    int spill92_4;
    int spill92_5;
    com.moon.n1 spill92_6;
    int spill92_7;
    long life1_3;
    long life4_10;
    int life3_11;
    long life6_15;
    int life8_62;
    java.util.Iterator life9_94;
    com.moon.n1 life10_101;
    long life11_119;
    lexical_join_138: {
    lexical_join_60: {
    lexical_join_54: {
    lexical_join_52: {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_42: {
    lexical_join_38: {
    lexical_join_29: {
    life1_3 = (__fieldRead92_0() ^ 54068343937896L);
    spill92_0 = __call92_1();
    life4_10 = __invokedynamic92_2(22516, (8873266893929333044L ^ life1_3));
    life3_11 = __integerCategory92_3(spill92_0);
    life6_15 = __call92_6(__fieldRead92_4(), __call92_5());
    spill92_1 = __call92_8(__call92_7(), "\n");
    if (!((life3_11 == 0))) {
        lexicalValue92_38_0 = __integerCategory92_9(spill92_1);
        break lexical_join_38;
    }
    if (!(spill92_1)) {
        break lexical_join_29;
    }
    if (!((__call92_11(__call92_10()) != null))) {
        break lexical_join_29;
    }
    spill92_2 = __fieldRead92_12();
    if (!((life3_11 == 0))) {
        lexicalValue92_38_0 = __integerCategory92_13(spill92_2);
        break lexical_join_38;
    }
    if (!((!spill92_2))) {
        break lexical_join_43;
    }
    }
    lexicalValue92_38_0 = __numericCompare92_17((__call92_14() - __call92_15()), __invokedynamic92_16(17144, (5241560777551434810L ^ life1_3)));
    }
    if (!((life3_11 == 0))) {
        lexicalValue92_42_0 = lexicalValue92_38_0;
        break lexical_join_42;
    }
    if (!((lexicalValue92_38_0 > 0))) {
        break lexical_join_43;
    }
    lexicalValue92_42_0 = 1;
    }
    lexicalValue92_44_0 = lexicalValue92_42_0;
    break lexical_join_44;
    }
    lexicalValue92_44_0 = 0;
    }
    life8_62 = lexicalValue92_44_0;
    spill92_3 = life8_62;
    if (!((life3_11 == 0))) {
        lexicalValue92_52_0 = spill92_3;
        break lexical_join_52;
    }
    if (!((spill92_3 != 0))) {
        break lexical_join_60;
    }
    lexicalValue92_52_0 = __integerCategory92_21(__call92_20(__call92_19(__call92_18())));
    }
    if (!((lexicalValue92_52_0 == 0))) {
        break lexical_join_54;
    }
    return;
    }
    __call92_23(__invokedynamic92_22(4838, (2181750586839106597L ^ life1_3)));
    }
    life9_94 = __call92_26(__call92_25(__fieldRead92_24()));
    lexical_cycle_64: while (true) {
    lexical_join_136: {
    lexical_join_127: {
    lexical_join_118: {
    lexical_join_116: {
    lexical_join_107: {
    lexical_join_106: {
    lexical_join_105: {
    if (!(__call92_27(life9_94))) {
        break lexical_join_138;
    }
    life10_101 = __cast92_29(__call92_28(life9_94));
    spill92_4 = __call92_30(life10_101);
    if (!((life3_11 == 0))) {
        lexicalValue92_118_0 = spill92_4;
        break lexical_join_118;
    }
    if (!((spill92_4 != 0))) {
        break lexical_join_116;
    }
    life11_119 = ((long) __call92_33(__call92_31(life10_101), __invokedynamic92_32(12539, (2436242013816214479L ^ life1_3))));
    spill92_5 = __numericCompare92_34(life11_119, 0L);
    if (!((life3_11 == 0))) {
        lexicalValue92_118_0 = spill92_5;
        break lexical_join_118;
    }
    if (!((spill92_5 != 0))) {
        break lexical_join_116;
    }
    spill92_6 = life10_101;
    spill92_7 = __call92_37(__call92_35(life10_101), __invokedynamic92_36(12773, (7759084538348360406L ^ life1_3)));
    if (!((life3_11 == 0))) {
        lexicalValue92_105_0 = spill92_6;
        lexicalValue92_105_1 = spill92_7;
        break lexical_join_105;
    }
    if (!((spill92_7 == 0))) {
        lexicalValue92_106_0 = spill92_6;
        break lexical_join_106;
    }
    lexicalValue92_105_0 = spill92_6;
    lexicalValue92_105_1 = 1;
    }
    lexicalValue92_107_0 = lexicalValue92_105_0;
    lexicalValue92_107_1 = lexicalValue92_105_1;
    break lexical_join_107;
    }
    lexicalValue92_107_0 = lexicalValue92_106_0;
    lexicalValue92_107_1 = 0;
    }
    __call92_38(lexicalValue92_107_0, lexicalValue92_107_1);
    __call92_40(__call92_39(life10_101));
    __call92_41(life10_101, 0);
    }
    lexicalValue92_118_0 = __call92_42(life10_101);
    }
    if (!((life3_11 == 0))) {
        lexicalValue92_127_0 = lexicalValue92_118_0;
        break lexical_join_127;
    }
    if (!((lexicalValue92_118_0 == 0))) {
        break lexical_join_136;
    }
    lexicalValue92_127_0 = __numericCompare92_44((life6_15 - __call92_43(life10_101)), life4_10);
    }
    if (!((lexicalValue92_127_0 > 0))) {
        break lexical_join_136;
    }
    __call92_45(life10_101, life6_15);
    __call92_46(life10_101, 1);
    }
    if (!((life3_11 != 0))) { continue lexical_cycle_64; }
    break lexical_cycle_64;
    }
    }
    return;
}
public static void h92_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009200_0(p0);
}
public static void h92_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009201_0(p0);
}
public static void h92_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009202_0(p0);
}
public static void h92_3(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009203_0(p0);
}
public static void h92_4(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009204_0(p0);
}
public static void h92_5(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009205_0(p0);
}
public static void h92_6(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009206_0(p0);
}
public static void h92_7(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009207_0(p0);
}
public static void h92_8(java.lang.InterruptedException p0) throws Throwable {
    java.lang.InterruptedException local1 = p0;
    throw new java.lang.RuntimeException(local1);
}
public static void h92_9(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009209_0(p0);
}
public static void h92_10(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009210_0(p0);
}
public static void h92_11(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009211_0(p0);
}
public static void h92_12(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009212_0(p0);
}
public static void h92_13(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009213_0(p0);
}
public static void h92_14(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009214_0(p0);
}
public static void h92_15(java.lang.InterruptedException p0) throws Throwable {
    throw __call2009215_0(p0);
}
private static native long __fieldRead92_0() throws Throwable;
private static native boolean __call92_1() throws Throwable;
private static native long __invokedynamic92_2(int a0, long a1) throws Throwable;
private static native int __integerCategory92_3(boolean value) throws Throwable;
private static native java.util.concurrent.TimeUnit __fieldRead92_4() throws Throwable;
private static native long __call92_5() throws Throwable;
private static native long __call92_6(java.util.concurrent.TimeUnit a0, long a1) throws Throwable;
private static native java.lang.String __call92_7() throws Throwable;
private static native boolean __call92_8(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory92_9(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call92_10() throws Throwable;
private static native com.moon.security.c __call92_11(com.moon.runtime.ClientContext a0) throws Throwable;
private static native boolean __fieldRead92_12() throws Throwable;
private static native int __integerCategory92_13(boolean value) throws Throwable;
private static native long __call92_14() throws Throwable;
private static native long __call92_15() throws Throwable;
private static native long __invokedynamic92_16(int a0, long a1) throws Throwable;
private static native int __numericCompare92_17(long a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call92_18() throws Throwable;
private static native com.moon.security.c __call92_19(com.moon.runtime.ClientContext a0) throws Throwable;
private static native boolean __call92_20(com.moon.security.c a0) throws Throwable;
private static native int __integerCategory92_21(boolean value) throws Throwable;
private static native long __invokedynamic92_22(int a0, long a1) throws Throwable;
private static native void __call92_23(long a0) throws Throwable;
private static native java.util.concurrent.ConcurrentHashMap __fieldRead92_24() throws Throwable;
private static native java.util.Collection __call92_25(java.util.concurrent.ConcurrentHashMap a0) throws Throwable;
private static native java.util.Iterator __call92_26(java.util.Collection a0) throws Throwable;
private static native boolean __call92_27(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call92_28(java.util.Iterator a0) throws Throwable;
private static native com.moon.n1 __cast92_29(java.lang.Object a0) throws Throwable;
private static native int __call92_30(com.moon.n1 a0) throws Throwable;
private static native int __call92_31(com.moon.n1 a0) throws Throwable;
private static native int __invokedynamic92_32(int a0, long a1) throws Throwable;
private static native int __call92_33(int a0, int a1) throws Throwable;
private static native int __numericCompare92_34(long a0, long a1) throws Throwable;
private static native int __call92_35(com.moon.n1 a0) throws Throwable;
private static native int __invokedynamic92_36(int a0, long a1) throws Throwable;
private static native int __call92_37(int a0, int a1) throws Throwable;
private static native com.moon.n1 __call92_38(com.moon.n1 a0, int a1) throws Throwable;
private static native int __call92_39(com.moon.n1 a0) throws Throwable;
private static native void __call92_40(int a0) throws Throwable;
private static native com.moon.n1 __call92_41(com.moon.n1 a0, int a1) throws Throwable;
private static native int __call92_42(com.moon.n1 a0) throws Throwable;
private static native long __call92_43(com.moon.n1 a0) throws Throwable;
private static native int __numericCompare92_44(long a0, long a1) throws Throwable;
private static native com.moon.n1 __call92_45(com.moon.n1 a0, long a1) throws Throwable;
private static native com.moon.n1 __call92_46(com.moon.n1 a0, int a1) throws Throwable;
private static native java.lang.Exception __call2009200_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009201_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009202_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009203_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009204_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009205_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009206_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009207_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009209_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009210_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009211_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009212_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009213_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009214_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call2009215_0(java.lang.InterruptedException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_edb7c15401fd29a44331(com.moon.n0 a0, com.moon.eQ a1) throws E;
private static final class __SourceHandler_edb7c15401fd29a44331 {

public static void f512(com.moon.n0 receiver, com.moon.eQ p0) throws Throwable {
    java.lang.Object forwardValue512_15_0;
    com.moon.a1 spill512_0;
    long life2_3;
    int life4_5;
    forward_join_19: {
    forward_join_18: {
    forward_join_15: {
    life2_3 = (__fieldRead512_0() ^ 48498432367310L);
    life4_5 = __integerCategory512_2(__call512_1());
    spill512_0 = __call512_3(p0);
    if (!((life4_5 != 0))) {
        forwardValue512_15_0 = spill512_0;
        break forward_join_15;
    }
    if (!((spill512_0 == __fieldRead512_4()))) {
        break forward_join_18;
    }
    forwardValue512_15_0 = __call512_7(__fieldRead512_6(__fieldRead512_5()));
    }
    if (!((!__call512_9(__cast512_8(forwardValue512_15_0))))) {
        break forward_join_19;
    }
    }
    return;
    }
    __call512_12(__call512_10(), __invokedynamic512_11(receiver));
    return;
}
public static void h512_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051200_0(p0);
}
public static void h512_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051201_0(p0);
}
public static void h512_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051202_0(p0);
}
private static native long __fieldRead512_0() throws Throwable;
private static native boolean __call512_1() throws Throwable;
private static native int __integerCategory512_2(boolean value) throws Throwable;
private static native com.moon.a1 __call512_3(com.moon.eQ a0) throws Throwable;
private static native com.moon.a1 __fieldRead512_4() throws Throwable;
private static native com.moon.module.impl.Camera __fieldRead512_5() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead512_6(com.moon.module.impl.Camera a0) throws Throwable;
private static native java.lang.Object __call512_7(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast512_8(java.lang.Object a0) throws Throwable;
private static native boolean __call512_9(java.lang.Boolean a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call512_10() throws Throwable;
private static native java.lang.Runnable __invokedynamic512_11(com.moon.n0 a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call512_12(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native java.lang.Exception __call1051200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051201_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051202_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ccc1b61310b3c69367af(com.moon.n0 a0, com.moon.ec a1) throws E;
private static final class __SourceHandler_ccc1b61310b3c69367af {

public static void f513(com.moon.n0 receiver, com.moon.ec p0) throws Throwable {
    int forwardValue513_15_0;
    boolean spill513_0;
    long life2_3;
    int life4_5;
    net.minecraft.entity.EntityLivingBase life5_23;
    forward_join_28: {
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (__fieldRead513_0() ^ 134217964809916L);
    life4_5 = __integerCategory513_2(__call513_1());
    spill513_0 = __call513_7(__cast513_6(__call513_5(__fieldRead513_4(__fieldRead513_3()))));
    if (!((life4_5 != 0))) {
        forwardValue513_15_0 = __integerCategory513_8(spill513_0);
        break forward_join_15;
    }
    if (!(spill513_0)) {
        break forward_join_16;
    }
    forwardValue513_15_0 = __integerCategory513_10(__fieldRead513_9());
    }
    if (!((forwardValue513_15_0 == 0))) {
        break forward_join_17;
    }
    }
    return;
    }
    life5_23 = __cast513_12(__call513_11(p0));
    if (!(__call513_13(life5_23))) {
        break forward_join_28;
    }
    __call513_14(p0, 1);
    }
    return;
}
public static void h513_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051300_0(p0);
}
public static void h513_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051301_0(p0);
}
private static native long __fieldRead513_0() throws Throwable;
private static native boolean __call513_1() throws Throwable;
private static native int __integerCategory513_2(boolean value) throws Throwable;
private static native com.moon.module.impl.Camera __fieldRead513_3() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead513_4(com.moon.module.impl.Camera a0) throws Throwable;
private static native java.lang.Object __call513_5(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast513_6(java.lang.Object a0) throws Throwable;
private static native boolean __call513_7(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory513_8(boolean value) throws Throwable;
private static native boolean __fieldRead513_9() throws Throwable;
private static native int __integerCategory513_10(boolean value) throws Throwable;
private static native net.minecraft.entity.Entity __call513_11(com.moon.ec a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast513_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call513_13(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native com.moon.event.CancellableEvent __call513_14(com.moon.ec a0, int a1) throws Throwable;
private static native java.lang.Exception __call1051300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051301_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_56197c0d6fd4db11f65e(com.moon.n0 a0, com.moon.event.TickEvent a1) throws E;
private static final class __SourceHandler_56197c0d6fd4db11f65e {

public static void f100036(com.moon.n0 receiver, com.moon.event.TickEvent p0) throws Throwable {
    java.lang.Object forestValue100036_15_0;
    int forestValue100036_29_0;
    com.moon.n0 forestValue100036_38_0;
    int forestValue100036_38_1;
    int forestValue100036_102_0;
    int forestValue100036_107_0;
    int forestValue100036_127_0;
    com.moon.event.TickPhase spill100036_0;
    boolean spill100036_1;
    com.moon.n0 spill100036_2;
    int spill100036_3;
    int spill100036_4;
    boolean spill100036_5;
    boolean spill100036_6;
    long life2_3;
    int life4_5;
    net.minecraft.client.multiplayer.WorldClient life5_53;
    java.util.ArrayList life6_61;
    java.util.HashSet life7_65;
    java.util.Iterator life8_69;
    net.minecraft.entity.Entity life9_78;
    com.moon.n1 life9_103;
    java.util.Iterator life8_146;
    java.util.UUID life9_156;
    java.util.UUID life9_169;
    forest_join_142: {
    forest_join_127: {
    forest_join_110: {
    forest_join_77: {
    forest_join_73: {
    forest_join_45: {
    forest_join_38: {
    forest_join_36: {
    forest_join_35: {
    forest_join_29: {
    forest_join_15: {
    life2_3 = (__fieldRead100036_0() ^ 48303569990771L);
    life4_5 = __integerCategory100036_2(__call100036_1());
    spill100036_0 = __call100036_3(p0);
    if (!((life4_5 == 0))) {
        forestValue100036_15_0 = spill100036_0;
        break forest_join_15;
    }
    if (!((spill100036_0 == __fieldRead100036_4()))) {
        break forest_join_35;
    }
    forestValue100036_15_0 = __call100036_7(__fieldRead100036_6(__fieldRead100036_5()));
    }
    spill100036_1 = __call100036_9(__cast100036_8(forestValue100036_15_0));
    if (!((life4_5 == 0))) {
        forestValue100036_29_0 = __integerCategory100036_10(spill100036_1);
        break forest_join_29;
    }
    if (!(spill100036_1)) {
        break forest_join_35;
    }
    com.moon.n0 __stackOp100036_11_0 = receiver;
    spill100036_2 = __stackOp100036_11_0;
    spill100036_3 = __fieldRead100036_12(__stackOp100036_11_0);
    if (!((life4_5 == 0))) {
        forestValue100036_38_0 = spill100036_2;
        forestValue100036_38_1 = spill100036_3;
        break forest_join_38;
    }
    com.moon.n0 __stackOp100036_13_0 = spill100036_2;
    int __stackOp100036_13_1 = spill100036_3;
    spill100036_4 = __stackOp100036_13_1;
    __fieldWrite100036_14(__stackOp100036_13_0, (__stackOp100036_13_1 + 1));
    forestValue100036_29_0 = spill100036_4;
    }
    if (!((forestValue100036_29_0 < __invokedynamic100036_15(6618, (3148251709272102384L ^ life2_3))))) {
        break forest_join_36;
    }
    }
    return;
    }
    forestValue100036_38_0 = receiver;
    forestValue100036_38_1 = 0;
    }
    __fieldWrite100036_16(forestValue100036_38_0, forestValue100036_38_1);
    life5_53 = __fieldRead100036_18(__fieldRead100036_17());
    if (!((life5_53 == null))) {
        break forest_join_45;
    }
    return;
    }
    life6_61 = new java.util.ArrayList();
    life7_65 = new java.util.HashSet();
    life8_69 = __call100036_20(__fieldRead100036_19(life5_53));
    forest_cycle_57: while (true) {
    if (!(__call100036_21(life8_69))) {
        break forest_join_73;
    }
    life9_78 = __cast100036_23(__call100036_22(life8_69));
    __call100036_25(life7_65, __call100036_24(life9_78));
    if (!((life4_5 == 0))) {
        break forest_join_77;
    }
    if (!((life4_5 != 0))) {
        continue forest_cycle_57;
    }
    break forest_cycle_57;
    }
    }
    life8_69 = __call100036_28(__call100036_27(__fieldRead100036_26()));
    }
    forest_cycle_77: while (true) {
    forest_join_108: {
    forest_join_107: {
    forest_join_102: {
    forest_join_95: {
    if (!(__call100036_29(life8_69))) {
        break forest_join_110;
    }
    life9_103 = __cast100036_31(__call100036_30(life8_69));
    spill100036_5 = __call100036_33(life7_65, __call100036_32(life9_103));
    if (!((life4_5 == 0))) {
        forestValue100036_127_0 = __integerCategory100036_34(spill100036_5);
        break forest_join_127;
    }
    if (!((life4_5 == 0))) {
        forestValue100036_102_0 = __integerCategory100036_35(spill100036_5);
        break forest_join_102;
    }
    if (!(spill100036_5)) {
        break forest_join_95;
    }
    if (!((life4_5 != 0))) {
        continue forest_cycle_77;
    }
    }
    __call100036_37(life6_61, __call100036_36(life9_103));
    forestValue100036_102_0 = __call100036_38(life9_103);
    }
    if (!((life4_5 == 0))) {
        forestValue100036_107_0 = forestValue100036_102_0;
        break forest_join_107;
    }
    if (!((forestValue100036_102_0 != 0))) {
        break forest_join_108;
    }
    forestValue100036_107_0 = __call100036_39(life9_103);
    }
    __call100036_40(forestValue100036_107_0);
    }
    if (!((life4_5 != 0))) {
        continue forest_cycle_77;
    }
    break forest_cycle_77;
    }
    }
    life8_146 = __call100036_41(life6_61);
    forest_cycle_113: while (true) {
    if (!(__call100036_42(life8_146))) {
        break forest_join_142;
    }
    life9_156 = __cast100036_44(__call100036_43(life8_146));
    __call100036_46(__fieldRead100036_45(), life9_156);
    if (!((life4_5 != 0))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    break forest_join_142;
    }
    forest_cycle_127: while (true) {
    forest_join_139: {
    if (!((forestValue100036_127_0 != 0))) {
        break forest_join_142;
    }
    life9_169 = __cast100036_48(__call100036_47(life8_69));
    __call100036_50(__fieldRead100036_49(), life9_169);
    if (!((life4_5 != 0))) {
        break forest_join_139;
    }
    break forest_join_142;
    }
    spill100036_6 = __call100036_51(life8_69);
    forestValue100036_127_0 = __integerCategory100036_52(spill100036_6);
    continue forest_cycle_127;
    }
    }
    return;
}
public static void h100036_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003600_0(p0);
}
public static void h100036_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003601_0(p0);
}
public static void h100036_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003602_0(p0);
}
public static void h100036_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003603_0(p0);
}
public static void h100036_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003604_0(p0);
}
public static void h100036_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003605_0(p0);
}
public static void h100036_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003606_0(p0);
}
public static void h100036_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003607_0(p0);
}
public static void h100036_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003608_0(p0);
}
public static void h100036_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003609_0(p0);
}
public static void h100036_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003610_0(p0);
}
public static void h100036_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003611_0(p0);
}
public static void h100036_12(java.lang.RuntimeException p0) throws Throwable {
    throw __call13003612_0(p0);
}
private static native long __fieldRead100036_0() throws Throwable;
private static native boolean __call100036_1() throws Throwable;
private static native int __integerCategory100036_2(boolean value) throws Throwable;
private static native com.moon.event.TickPhase __call100036_3(com.moon.event.TickEvent a0) throws Throwable;
private static native com.moon.event.TickPhase __fieldRead100036_4() throws Throwable;
private static native com.moon.module.impl.Camera __fieldRead100036_5() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead100036_6(com.moon.module.impl.Camera a0) throws Throwable;
private static native java.lang.Object __call100036_7(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast100036_8(java.lang.Object a0) throws Throwable;
private static native boolean __call100036_9(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory100036_10(boolean value) throws Throwable;
private static native int __fieldRead100036_12(com.moon.n0 a0) throws Throwable;
private static native void __fieldWrite100036_14(com.moon.n0 a0, int a1) throws Throwable;
private static native int __invokedynamic100036_15(int a0, long a1) throws Throwable;
private static native void __fieldWrite100036_16(com.moon.n0 a0, int a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead100036_17() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead100036_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead100036_19(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call100036_20(java.util.List a0) throws Throwable;
private static native boolean __call100036_21(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100036_22(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast100036_23(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100036_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call100036_25(java.util.HashSet a0, java.util.UUID a1) throws Throwable;
private static native java.util.concurrent.ConcurrentHashMap __fieldRead100036_26() throws Throwable;
private static native java.util.Collection __call100036_27(java.util.concurrent.ConcurrentHashMap a0) throws Throwable;
private static native java.util.Iterator __call100036_28(java.util.Collection a0) throws Throwable;
private static native boolean __call100036_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100036_30(java.util.Iterator a0) throws Throwable;
private static native com.moon.n1 __cast100036_31(java.lang.Object a0) throws Throwable;
private static native java.util.UUID __call100036_32(com.moon.n1 a0) throws Throwable;
private static native boolean __call100036_33(java.util.HashSet a0, java.util.UUID a1) throws Throwable;
private static native int __integerCategory100036_34(boolean value) throws Throwable;
private static native int __integerCategory100036_35(boolean value) throws Throwable;
private static native java.util.UUID __call100036_36(com.moon.n1 a0) throws Throwable;
private static native boolean __call100036_37(java.util.ArrayList a0, java.util.UUID a1) throws Throwable;
private static native int __call100036_38(com.moon.n1 a0) throws Throwable;
private static native int __call100036_39(com.moon.n1 a0) throws Throwable;
private static native void __call100036_40(int a0) throws Throwable;
private static native java.util.Iterator __call100036_41(java.util.ArrayList a0) throws Throwable;
private static native boolean __call100036_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call100036_43(java.util.Iterator a0) throws Throwable;
private static native java.util.UUID __cast100036_44(java.lang.Object a0) throws Throwable;
private static native java.util.concurrent.ConcurrentHashMap __fieldRead100036_45() throws Throwable;
private static native java.lang.Object __call100036_46(java.util.concurrent.ConcurrentHashMap a0, java.util.UUID a1) throws Throwable;
private static native java.lang.Object __call100036_47(java.util.Iterator a0) throws Throwable;
private static native java.util.UUID __cast100036_48(java.lang.Object a0) throws Throwable;
private static native java.util.concurrent.ConcurrentHashMap __fieldRead100036_49() throws Throwable;
private static native java.lang.Object __call100036_50(java.util.concurrent.ConcurrentHashMap a0, java.util.UUID a1) throws Throwable;
private static native boolean __call100036_51(java.util.Iterator a0) throws Throwable;
private static native int __integerCategory100036_52(boolean value) throws Throwable;
private static native java.lang.Exception __call13003600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003602_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003603_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003604_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003605_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003606_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003607_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003608_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003609_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003610_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003611_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call13003612_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_13dc988c125fe582ac28(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_13dc988c125fe582ac28 {

public static boolean f515(net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue515_15_0;
    net.minecraft.entity.Entity forwardValue515_25_0;
    int forwardValue515_30_0;
    int forwardValue515_32_0;
    boolean spill515_0;
    net.minecraft.entity.Entity spill515_1;
    boolean spill515_2;
    long life1_3;
    int life3_5;
    forward_join_32: {
    forward_join_31: {
    forward_join_30: {
    forward_join_25: {
    forward_join_15: {
    life1_3 = (__fieldRead515_0() ^ 7224536756029L);
    life3_5 = __integerCategory515_2(__call515_1());
    spill515_0 = __fieldRead515_3();
    if (!((life3_5 == 0))) {
        forwardValue515_15_0 = __integerCategory515_4(spill515_0);
        break forward_join_15;
    }
    if (!(spill515_0)) {
        break forward_join_31;
    }
    forwardValue515_15_0 = __integerCategory515_10(__call515_9(__cast515_8(__call515_7(__fieldRead515_6(__fieldRead515_5())))));
    }
    if (!((forwardValue515_15_0 != 0))) {
        break forward_join_31;
    }
    spill515_1 = p0;
    if (!((life3_5 == 0))) {
        forwardValue515_25_0 = spill515_1;
        break forward_join_25;
    }
    if (!((__fieldRead515_11(spill515_1) == __fieldRead515_14(__fieldRead515_13(__fieldRead515_12()))))) {
        break forward_join_31;
    }
    forwardValue515_25_0 = p0;
    }
    spill515_2 = __call515_15(forwardValue515_25_0);
    if (!((life3_5 == 0))) {
        forwardValue515_30_0 = __integerCategory515_16(spill515_2);
        break forward_join_30;
    }
    if (!(spill515_2)) {
        break forward_join_31;
    }
    forwardValue515_30_0 = 1;
    }
    forwardValue515_32_0 = forwardValue515_30_0;
    break forward_join_32;
    }
    forwardValue515_32_0 = 0;
    }
    return __integerCategory515_17(forwardValue515_32_0);
}
public static void h515_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051500_0(p0);
}
public static void h515_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051501_0(p0);
}
public static void h515_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051502_0(p0);
}
public static void h515_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051503_0(p0);
}
public static void h515_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051504_0(p0);
}
public static void h515_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051505_0(p0);
}
private static native long __fieldRead515_0() throws Throwable;
private static native boolean __call515_1() throws Throwable;
private static native int __integerCategory515_2(boolean value) throws Throwable;
private static native boolean __fieldRead515_3() throws Throwable;
private static native int __integerCategory515_4(boolean value) throws Throwable;
private static native com.moon.module.impl.Camera __fieldRead515_5() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead515_6(com.moon.module.impl.Camera a0) throws Throwable;
private static native java.lang.Object __call515_7(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast515_8(java.lang.Object a0) throws Throwable;
private static native boolean __call515_9(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory515_10(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead515_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead515_12() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead515_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead515_14(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native boolean __call515_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory515_16(boolean value) throws Throwable;
private static native boolean __integerCategory515_17(int value) throws Throwable;
private static native java.lang.Exception __call1051500_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051501_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051502_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051503_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051504_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051505_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2f130d82a71fe63a3e73(net.minecraft.entity.Entity a0) throws E;
private static final class __SourceHandler_2f130d82a71fe63a3e73 {

public static boolean f516(net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue516_35_0;
    int forwardValue516_41_0;
    int forwardValue516_67_0;
    boolean spill516_0;
    boolean spill516_1;
    boolean spill516_2;
    long life1_3;
    com.moon.n1 life4_11;
    int life3_12;
    int life5_50;
    forward_join_67: {
    forward_join_65: {
    forward_join_41: {
    forward_join_36: {
    forward_join_35: {
    life1_3 = (__fieldRead516_0() ^ 2044394185475L);
    spill516_0 = __call516_1();
    life4_11 = __cast516_6(__call516_5(__fieldRead516_2(), __call516_3(p0), __invokedynamic516_4()));
    life3_12 = __integerCategory516_7(spill516_0);
    spill516_1 = __call516_8(life4_11);
    if (!((life3_12 != 0))) {
        forwardValue516_67_0 = __integerCategory516_9(spill516_1);
        break forward_join_67;
    }
    if (!(spill516_1)) {
        break forward_join_65;
    }
    __call516_11(life4_11, __call516_10());
    __call516_12(life4_11, 0);
    spill516_2 = __fieldRead516_13();
    if (!((life3_12 != 0))) {
        forwardValue516_35_0 = __integerCategory516_14(spill516_2);
        break forward_join_35;
    }
    if (!(spill516_2)) {
        break forward_join_36;
    }
    forwardValue516_35_0 = __invokedynamic516_15(24885, (4342095867278244459L ^ life1_3));
    }
    forwardValue516_41_0 = forwardValue516_35_0;
    break forward_join_41;
    }
    forwardValue516_41_0 = __invokedynamic516_16(4273, (1211940794894732264L ^ life1_3));
    }
    life5_50 = forwardValue516_41_0;
    __call516_18(life5_50, __call516_17(life4_11));
    __call516_28(__call516_27(__call516_20(__call516_19(p0), 0x1.999999999999ap-3d, 0x1.999999999999ap-3d, 0x1.999999999999ap-3d), (-__call516_22(__fieldRead516_21())), (-__call516_24(__fieldRead516_23())), (-__call516_26(__fieldRead516_25()))));
    __call516_29(life5_50);
    }
    forwardValue516_67_0 = __integerCategory516_31(__call516_30(life4_11));
    }
    return __integerCategory516_32(forwardValue516_67_0);
}
public static void h516_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051600_0(p0);
}
public static void h516_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051601_0(p0);
}
public static void h516_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1051602_0(p0);
}
private static native long __fieldRead516_0() throws Throwable;
private static native boolean __call516_1() throws Throwable;
private static native java.util.concurrent.ConcurrentHashMap __fieldRead516_2() throws Throwable;
private static native java.util.UUID __call516_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.util.function.Function __invokedynamic516_4() throws Throwable;
private static native java.lang.Object __call516_5(java.util.concurrent.ConcurrentHashMap a0, java.util.UUID a1, java.util.function.Function a2) throws Throwable;
private static native com.moon.n1 __cast516_6(java.lang.Object a0) throws Throwable;
private static native int __integerCategory516_7(boolean value) throws Throwable;
private static native boolean __call516_8(com.moon.n1 a0) throws Throwable;
private static native int __integerCategory516_9(boolean value) throws Throwable;
private static native int __call516_10() throws Throwable;
private static native com.moon.n1 __call516_11(com.moon.n1 a0, int a1) throws Throwable;
private static native com.moon.n1 __call516_12(com.moon.n1 a0, int a1) throws Throwable;
private static native boolean __fieldRead516_13() throws Throwable;
private static native int __integerCategory516_14(boolean value) throws Throwable;
private static native int __invokedynamic516_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic516_16(int a0, long a1) throws Throwable;
private static native int __call516_17(com.moon.n1 a0) throws Throwable;
private static native void __call516_18(int a0, int a1) throws Throwable;
private static native moom.CA __call516_19(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call516_20(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead516_21() throws Throwable;
private static native double __call516_22(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead516_23() throws Throwable;
private static native double __call516_24(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native net.minecraft.client.renderer.entity.RenderManager __fieldRead516_25() throws Throwable;
private static native double __call516_26(net.minecraft.client.renderer.entity.RenderManager a0) throws Throwable;
private static native moom.CA __call516_27(moom.CA a0, double a1, double a2, double a3) throws Throwable;
private static native void __call516_28(moom.CA a0) throws Throwable;
private static native void __call516_29(int a0) throws Throwable;
private static native boolean __call516_30(com.moon.n1 a0) throws Throwable;
private static native int __integerCategory516_31(boolean value) throws Throwable;
private static native boolean __integerCategory516_32(int value) throws Throwable;
private static native java.lang.Exception __call1051600_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051601_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1051602_0(java.lang.RuntimeException a0) throws Throwable;

}


private static long b(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 31153);
    if (((com.moon.n0.m)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.n0.l)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.n0.n)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.n0.n)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/n0", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.n0.m)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.n0.m)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.n0.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2779_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static boolean b(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_2f130d82a71fe63a3e73(p0); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.n0.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 3138;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/n0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2781_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/n0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static boolean a(net.minecraft.entity.Entity p0) { return __sourceHandlerCall_13dc988c125fe582ac28(p0); }


public void a(com.moon.ec p0) { __sourceHandlerCall_ccc1b61310b3c69367af(this, p0); }


private void a() { __sourceHandlerCall_bdbe513632157fe17607(this); }


public void a(com.moon.eQ p0) { __sourceHandlerCall_edb7c15401fd29a44331(this, p0); }


public void a(com.moon.event.TickEvent p0) { __sourceHandlerCall_56197c0d6fd4db11f65e(this, p0); }


public static void a(moom.CA p0) {
long life1_3;
    int life3_9;
    net.minecraft.client.renderer.Tessellator life4_16;
    moom.lw life5_19;
    life1_3 = (com.moon.n0.h ^ 130184445338202L);
    boolean spill739_0 = com.moon.n1.c();
    moom.kZ.c__Void();
    moom.kZ.p();
    moom.kZ.a(((boolean)(false)));
    life3_9 = ((spill739_0) ? 1 : 0);
    moom.kZ.a(((boolean)(false)), ((boolean)(false)), ((boolean)(false)), ((boolean)(false)));
    life4_16 = net.minecraft.client.renderer.Tessellator.a();
    life5_19 = ((net.minecraft.client.renderer.Tessellator)(life4_16)).a__lw();
    try {
        ((moom.lw)(life5_19)).a(((int)(__sourceIntrinsic_d69cfe15f2e7_invokedynamic739_9(25975, (8553853727813189493L ^ life1_3)))), ((moom.oD)(moom.oB.g)));
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).f)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).g))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).b)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((moom.lw)(((moom.lw)(life5_19)).a(((double)(((moom.CA)(p0)).e)), ((double)(((moom.CA)(p0)).c)), ((double)(((moom.CA)(p0)).d))))).c__Void();
        ((net.minecraft.client.renderer.Tessellator)(life4_16)).a__Void();
        moom.kZ.a(((boolean)(true)));
        moom.kZ.a(((boolean)(true)), ((boolean)(true)), ((boolean)(true)), ((boolean)(true)));
        moom.kZ.d__Void();
        if ((life3_9 == 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    } catch (java.lang.RuntimeException caught_rethrow_0) {
        throw com.moon.n0.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2781_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d69cfe15f2e7_invokedynamic739_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2779_0() throws E;
}
