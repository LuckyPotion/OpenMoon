package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ca extends sourcebuild.EnumConstructor<com.moon.ca> {

public static com.moon.ca PARENTHESES;

public static com.moon.ca CLOSING_PARENTHESES;

public static com.moon.ca QUOTATION;

public static com.moon.ca BRACKET;

public static com.moon.ca CLOSING_BRACKET;

public static com.moon.ca BRACES;

public static com.moon.ca CLOSING_BRACES;

public static com.moon.ca EQUALS;

public static com.moon.ca COMMA;

private char a;

private static com.moon.ca[] b;

private static long c;

private static long[] d;

private static java.lang.Integer[] e;

private static java.util.Map f;

private ca(java.lang.String p0, int p1, char p2) {
super(p0, p1);
    this.a = p2;
}


private static void initialize() {
javax.crypto.Cipher forestValue10_31_0;
    int forestValue10_31_1;
    javax.crypto.SecretKeyFactory forestValue10_31_2;
    byte[] forestValue10_31_3;
    javax.crypto.Cipher forestValue10_48_0;
    int forestValue10_48_1;
    javax.crypto.SecretKeyFactory forestValue10_48_2;
    byte[] forestValue10_48_3;
    java.lang.String forestValue10_81_0;
    int forestValue10_81_1;
    java.lang.String forestValue10_93_0;
    java.lang.String forestValue10_117_0;
    javax.crypto.Cipher forestValue10_172_0;
    int forestValue10_172_1;
    javax.crypto.SecretKeyFactory forestValue10_172_2;
    byte[] forestValue10_172_3;
    javax.crypto.Cipher forestValue10_189_0;
    int forestValue10_189_1;
    javax.crypto.SecretKeyFactory forestValue10_189_2;
    byte[] forestValue10_189_3;
    long[] forestValue10_293_0;
    int forestValue10_293_1;
    long forestValue10_293_2;
    int forestValue10_293_3;
    long[] forestValue10_436_0;
    int forestValue10_436_1;
    long forestValue10_436_2;
    long[] forestValue10_448_0;
    int forestValue10_448_1;
    long forestValue10_448_2;
    javax.crypto.Cipher spill10_0;
    int spill10_1;
    javax.crypto.SecretKeyFactory spill10_2;
    byte[] spill10_3;
    byte[] spill10_4;
    java.lang.String spill10_5;
    int spill10_6;
    java.lang.String spill10_7;
    java.lang.String[] spill10_8;
    java.lang.String[] spill10_9;
    java.lang.String spill10_10;
    java.lang.String spill10_11;
    int spill10_12;
    javax.crypto.Cipher spill10_13;
    int spill10_14;
    javax.crypto.SecretKeyFactory spill10_15;
    byte[] spill10_16;
    byte[] spill10_17;
    java.lang.String spill10_18;
    int spill10_19;
    int spill10_20;
    long spill10_21;
    byte[] spill10_22;
    byte[] spill10_23;
    byte[] spill10_24;
    byte[] spill10_25;
    byte[] spill10_26;
    byte[] spill10_27;
    byte[] spill10_28;
    byte[] spill10_29;
    long spill10_30;
    int spill10_31;
    java.lang.String spill10_32;
    int spill10_33;
    long[] spill10_34;
    int spill10_35;
    long spill10_36;
    int spill10_37;
    long life20_11;
    javax.crypto.Cipher life12_15;
    int life13_30;
    java.lang.String[] life11_61;
    int life17_63;
    java.lang.String life16_66;
    int life18_68;
    int life15_70;
    int life14_72;
    byte[] life19_88;
    javax.crypto.Cipher life0_159;
    int life1_174;
    long[] life6_205;
    int life3_207;
    java.lang.String life4_210;
    int life5_212;
    int life2_214;
    byte[] life7_222;
    long life8_299;
    byte[] life10_367;
    byte[] life7_464;
    forest_join_535: {
    forest_join_189: {
    forest_join_148: {
    forest_join_48: {
    c = ((long)(((moom._a)(moom._c.a(((long)(-5890597494232002520L)), ((long)(7250427490743123692L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122254309657237L)))));
    life20_11 = (com.moon.ca.c ^ 123326668785320L);
    spill10_0 = (life12_15 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill10_1 = 2;
    spill10_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp10_8_0 = new byte[8];
    spill10_3 = __stackOp10_8_0;
    (__stackOp10_8_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life13_30 = 1;
    forestValue10_31_0 = spill10_0;
    forestValue10_31_1 = spill10_1;
    forestValue10_31_2 = spill10_2;
    forestValue10_31_3 = spill10_3;
    forest_cycle_31: while (true) {
    if (!((life13_30 < 8))) {
        forestValue10_48_0 = forestValue10_31_0;
        forestValue10_48_1 = forestValue10_31_1;
        forestValue10_48_2 = forestValue10_31_2;
        forestValue10_48_3 = forestValue10_31_3;
        break forest_join_48;
    }
    byte[] __stackOp10_9_0 = forestValue10_31_3;
    spill10_4 = __stackOp10_9_0;
    (__stackOp10_9_0)[life13_30] = ((byte) ((int) ((life20_11 << (life13_30 * 8)) >>> 56)));
    life13_30 += 1;
    forestValue10_31_3 = spill10_4;
    continue forest_cycle_31;
    }
    }
    ((javax.crypto.Cipher)(forestValue10_48_0)).init(((int)(forestValue10_48_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue10_48_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue10_48_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life11_61 = new java.lang.String[9];
    life17_63 = 0;
    life18_68 = ((java.lang.String)((life16_66 = "a* ÐSG\004M\020[Ä\177\002g\020L6d[\036ÝÕ\034\020[PÛ¢ÑQGhPk=HÙð¥\020_~a/ëó\\üõ._ñpÂ\b¿Øô\020Ã1\020_~a/ëó\\níËñ@ª¯ú\bÎÅh«ÿn"))).length();
    life15_70 = 8;
    life14_72 = -1;
    forest_cycle_73: while (true) {
    forest_join_143: {
    life14_72 += 1;
    spill10_5 = life16_66;
    int __stackOp10_13_0 = life14_72;
    forestValue10_81_0 = ((java.lang.String)(spill10_5)).substring(((int)(__stackOp10_13_0)), ((int)((__stackOp10_13_0 + life15_70))));
    forestValue10_81_1 = -1;
    forest_cycle_81: while (true) {
    forest_join_134: {
    forest_join_117: {
    forest_join_107: {
    forest_join_93: {
    java.lang.String __stackOp10_15_0 = forestValue10_81_0;
    int __stackOp10_15_1 = forestValue10_81_1;
    spill10_6 = __stackOp10_15_1;
    byte[] __stackOp10_17_0 = ((java.lang.String)(__stackOp10_15_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp10_17_1 = life12_15;
    life19_88 = ((javax.crypto.Cipher)(__stackOp10_17_1)).doFinal(((byte[])(__stackOp10_17_0)));
    int __stackOp10_21_0 = spill10_6;
    java.lang.String __stackOp10_21_1 = ((java.lang.String)(com.moon.ca.a(((byte[])(life19_88))))).intern();
    spill10_7 = __stackOp10_21_1;
    switch (__stackOp10_21_0) {
default:
{
        forestValue10_93_0 = spill10_7;
        break forest_join_93;
    }
case 0:
{
        forestValue10_117_0 = spill10_7;
        break forest_join_117;
    }
}
    }
    java.lang.String __stackOp10_22_0 = forestValue10_93_0;
    java.lang.String[] __stackOp10_22_1 = life11_61;
    spill10_8 = __stackOp10_22_1;
    java.lang.String __stackOp10_23_0 = __stackOp10_22_0;
    int __stackOp10_23_1 = (life17_63++);
    (spill10_8)[__stackOp10_23_1] = __stackOp10_23_0;
    if (!(((life14_72 = (life14_72 + life15_70)) < life18_68))) {
        break forest_join_107;
    }
    break forest_join_143;
    }
    life18_68 = ((java.lang.String)((life16_66 = "_~a/ëó\\Th6ë8BlÈ'G\037K%{\bô8\037}nD"))).length();
    life15_70 = 24;
    life14_72 = -1;
    break forest_join_134;
    }
    java.lang.String __stackOp10_25_0 = forestValue10_117_0;
    java.lang.String[] __stackOp10_25_1 = life11_61;
    spill10_9 = __stackOp10_25_1;
    java.lang.String __stackOp10_26_0 = __stackOp10_25_0;
    int __stackOp10_26_1 = (life17_63++);
    (spill10_9)[__stackOp10_26_1] = __stackOp10_26_0;
    if (!(((life14_72 = (life14_72 + life15_70)) < life18_68))) {
        break forest_join_148;
    }
    life15_70 = ((int)(((java.lang.String)(life16_66)).charAt(((int)(life14_72)))));
    }
    life14_72 += 1;
    spill10_10 = life16_66;
    int __stackOp10_29_0 = life14_72;
    spill10_11 = ((java.lang.String)(spill10_10)).substring(((int)(__stackOp10_29_0)), ((int)((__stackOp10_29_0 + life15_70))));
    spill10_12 = 0;
    forestValue10_81_0 = spill10_11;
    forestValue10_81_1 = spill10_12;
    continue forest_cycle_81;
    }
    }
    life15_70 = ((int)(((java.lang.String)(life16_66)).charAt(((int)(life14_72)))));
    continue forest_cycle_73;
    }
    }
    f = ((java.util.Map)(new java.util.HashMap(13)));
    spill10_13 = (life0_159 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill10_14 = 2;
    spill10_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp10_36_0 = new byte[8];
    spill10_16 = __stackOp10_36_0;
    (__stackOp10_36_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life1_174 = 1;
    forestValue10_172_0 = spill10_13;
    forestValue10_172_1 = spill10_14;
    forestValue10_172_2 = spill10_15;
    forestValue10_172_3 = spill10_16;
    forest_cycle_172: while (true) {
    if (!((life1_174 < 8))) {
        forestValue10_189_0 = forestValue10_172_0;
        forestValue10_189_1 = forestValue10_172_1;
        forestValue10_189_2 = forestValue10_172_2;
        forestValue10_189_3 = forestValue10_172_3;
        break forest_join_189;
    }
    byte[] __stackOp10_37_0 = forestValue10_172_3;
    spill10_17 = __stackOp10_37_0;
    (__stackOp10_37_0)[life1_174] = ((byte) ((int) ((life20_11 << (life1_174 * 8)) >>> 56)));
    life1_174 += 1;
    forestValue10_172_3 = spill10_17;
    continue forest_cycle_172;
    }
    }
    ((javax.crypto.Cipher)(forestValue10_189_0)).init(((int)(forestValue10_189_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue10_189_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue10_189_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_205 = new long[16];
    life3_207 = 0;
    life5_212 = ((java.lang.String)((life4_210 = "é\t¯ð\t÷ôùêåê¢ùÇGÚ­ÊKX\020\036ò Åô`\034;á K±À\026ñÍ\005RO\b\rGßA[¹§wO\004ûQtyêG¬ÙX\023@\002é wºTÃ¨\020Ûgðº×È\032\rª¶\005\036Êl4Û\032ð²\r;\021py·î"))).length();
    life2_214 = 0;
    forest_cycle_212: while (true) {
    spill10_18 = life4_210;
    spill10_19 = life2_214;
    life2_214 += 8;
    life7_222 = ((java.lang.String)(((java.lang.String)(spill10_18)).substring(((int)(spill10_19)), ((int)(life2_214))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue10_293_0 = life6_205;
    forestValue10_293_1 = (life3_207++);
    forestValue10_293_2 = (((((((((((long) (life7_222)[0]) & 255L) << 56) | ((((long) (life7_222)[1]) & 255L) << 48)) | ((((long) (life7_222)[2]) & 255L) << 40)) | ((((long) (life7_222)[3]) & 255L) << 32)) | ((((long) (life7_222)[4]) & 255L) << 24)) | ((((long) (life7_222)[5]) & 255L) << 16)) | ((((long) (life7_222)[6]) & 255L) << 8)) | (((long) (life7_222)[7]) & 255L));
    forestValue10_293_3 = -1;
    forest_cycle_293: while (true) {
    forest_join_453: {
    forest_join_448: {
    forest_join_436: {
    long __stackOp10_43_0 = forestValue10_293_2;
    int __stackOp10_43_1 = forestValue10_293_3;
    spill10_20 = __stackOp10_43_1;
    spill10_21 = __stackOp10_43_0;
    recovery.source.CarrierOps.discard(__stackOp10_43_1);
    life8_299 = spill10_21;
    byte[] __stackOp10_45_0 = new byte[8];
    spill10_22 = __stackOp10_45_0;
    (__stackOp10_45_0)[0] = ((byte) ((int) (life8_299 >>> 56)));
    byte[] __stackOp10_46_0 = spill10_22;
    spill10_23 = __stackOp10_46_0;
    (__stackOp10_46_0)[1] = ((byte) ((int) (life8_299 >>> 48)));
    byte[] __stackOp10_47_0 = spill10_23;
    spill10_24 = __stackOp10_47_0;
    (__stackOp10_47_0)[2] = ((byte) ((int) (life8_299 >>> 40)));
    byte[] __stackOp10_48_0 = spill10_24;
    spill10_25 = __stackOp10_48_0;
    (__stackOp10_48_0)[3] = ((byte) ((int) (life8_299 >>> 32)));
    byte[] __stackOp10_49_0 = spill10_25;
    spill10_26 = __stackOp10_49_0;
    (__stackOp10_49_0)[4] = ((byte) ((int) (life8_299 >>> 24)));
    byte[] __stackOp10_50_0 = spill10_26;
    spill10_27 = __stackOp10_50_0;
    (__stackOp10_50_0)[5] = ((byte) ((int) (life8_299 >>> 16)));
    byte[] __stackOp10_51_0 = spill10_27;
    spill10_28 = __stackOp10_51_0;
    (__stackOp10_51_0)[6] = ((byte) ((int) (life8_299 >>> 8)));
    byte[] __stackOp10_52_0 = spill10_28;
    spill10_29 = __stackOp10_52_0;
    (__stackOp10_52_0)[7] = ((byte) ((int) life8_299));
    byte[] __stackOp10_53_0 = spill10_29;
    javax.crypto.Cipher __stackOp10_53_1 = life0_159;
    life10_367 = ((javax.crypto.Cipher)(__stackOp10_53_1)).doFinal(((byte[])(__stackOp10_53_0)));
    int __stackOp10_55_0 = spill10_20;
    long __stackOp10_55_1 = (((((((((((long) (life10_367)[0]) & 255L) << 56) | ((((long) (life10_367)[1]) & 255L) << 48)) | ((((long) (life10_367)[2]) & 255L) << 40)) | ((((long) (life10_367)[3]) & 255L) << 32)) | ((((long) (life10_367)[4]) & 255L) << 24)) | ((((long) (life10_367)[5]) & 255L) << 16)) | ((((long) (life10_367)[6]) & 255L) << 8)) | (((long) (life10_367)[7]) & 255L));
    spill10_30 = __stackOp10_55_1;
    spill10_31 = __stackOp10_55_0;
    recovery.source.CarrierOps.discard(__stackOp10_55_1);
    switch (spill10_31) {
default:
{
        forestValue10_436_0 = forestValue10_293_0;
        forestValue10_436_1 = forestValue10_293_1;
        forestValue10_436_2 = spill10_30;
        break forest_join_436;
    }
case 0:
{
        forestValue10_448_0 = forestValue10_293_0;
        forestValue10_448_1 = forestValue10_293_1;
        forestValue10_448_2 = spill10_30;
        break forest_join_448;
    }
}
    }
    (forestValue10_436_0)[forestValue10_436_1] = forestValue10_436_2;
    if (!((life2_214 >= life5_212))) {
        continue forest_cycle_212;
    }
    life5_212 = ((java.lang.String)((life4_210 = "Øp³XI­¦ºÜp¨;W\005?4"))).length();
    life2_214 = 0;
    break forest_join_453;
    }
    (forestValue10_448_0)[forestValue10_448_1] = forestValue10_448_2;
    if (!((life2_214 >= life5_212))) {
        break forest_join_453;
    }
    break forest_join_535;
    }
    spill10_32 = life4_210;
    spill10_33 = life2_214;
    life2_214 += 8;
    life7_464 = ((java.lang.String)(((java.lang.String)(spill10_32)).substring(((int)(spill10_33)), ((int)(life2_214))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill10_34 = life6_205;
    spill10_35 = (life3_207++);
    spill10_36 = (((((((((((long) (life7_464)[0]) & 255L) << 56) | ((((long) (life7_464)[1]) & 255L) << 48)) | ((((long) (life7_464)[2]) & 255L) << 40)) | ((((long) (life7_464)[3]) & 255L) << 32)) | ((((long) (life7_464)[4]) & 255L) << 24)) | ((((long) (life7_464)[5]) & 255L) << 16)) | ((((long) (life7_464)[6]) & 255L) << 8)) | (((long) (life7_464)[7]) & 255L));
    spill10_37 = 0;
    forestValue10_293_0 = spill10_34;
    forestValue10_293_1 = spill10_35;
    forestValue10_293_2 = spill10_36;
    forestValue10_293_3 = spill10_37;
    continue forest_cycle_293;
    }
    }
    }
    d = ((long[])(life6_205));
    e = ((java.lang.Integer[])(new java.lang.Integer[16]));
    PARENTHESES = ((com.moon.ca)(new com.moon.ca((life11_61)[2], 0, ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_62(23582, (1751461926280261415L ^ life20_11)))))));
    CLOSING_PARENTHESES = ((com.moon.ca)(new com.moon.ca((life11_61)[7], 1, ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_65(17672, (7695263867061859899L ^ life20_11)))))));
    QUOTATION = ((com.moon.ca)(new com.moon.ca((life11_61)[1], 2, ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_68(16575, (2524297244175299463L ^ life20_11)))))));
    BRACKET = ((com.moon.ca)(new com.moon.ca((life11_61)[4], 3, ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_71(4739, (7726294831499157950L ^ life20_11)))))));
    CLOSING_BRACKET = ((com.moon.ca)(new com.moon.ca((life11_61)[5], 4, ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_74(1091, (2650882000336467837L ^ life20_11)))))));
    BRACES = ((com.moon.ca)(new com.moon.ca((life11_61)[0], 5, ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_77(27759, (3636882518034308955L ^ life20_11)))))));
    CLOSING_BRACES = ((com.moon.ca)(new com.moon.ca((life11_61)[3], __sourceIntrinsic_eb8803ad1f63_invokedynamic10_80(32413, (7413124220742028705L ^ life20_11)), ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_81(4591, (1868921044775379672L ^ life20_11)))))));
    EQUALS = ((com.moon.ca)(new com.moon.ca((life11_61)[8], __sourceIntrinsic_eb8803ad1f63_invokedynamic10_84(19655, (854647552817758199L ^ life20_11)), ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_85(6516, (8749743071385889346L ^ life20_11)))))));
    COMMA = ((com.moon.ca)(new com.moon.ca((life11_61)[6], __sourceIntrinsic_eb8803ad1f63_invokedynamic10_88(8698, (8978272785549595333L ^ life20_11)), ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic10_89(30627, (8957295007846515862L ^ life20_11)))))));
    b = ((com.moon.ca[])(com.moon.ca.a__Arrayca()));
}


public static com.moon.ca[] values() {
return ((com.moon.ca[])(((com.moon.ca[])(com.moon.ca.b)).clone()));
}


public static com.moon.ca valueOf(java.lang.String p0) {
return ((com.moon.ca)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.ca.class)), ((java.lang.String)(p0)))));
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
        byte[] spill119_0 = p0;
        life4_9 += 1;
        life5_44 = (spill119_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill119_1 = p0;
        life4_9 += 1;
        life5_76 = (spill119_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill119_2 = p0;
        life4_9 += 1;
        life5_91 = (spill119_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14960;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ca", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral833_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ca"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ca.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static com.moon.ca a(char p0) {
return ((com.moon.ca)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(java.util.Arrays.stream(((java.lang.Object[])(com.moon.ca.values()))))).filter(((java.util.function.Predicate)(__sourceIntrinsic_099bc1a29c14_originalDynamicSite82_2(p0)))))).findFirst())).orElse(((java.lang.Object)(null)))));
}


public char a() {
return this.a;
}


private static com.moon.ca[] a__Arrayca() {
long local0_life1 = (com.moon.ca.c ^ 124409584401219L);
    com.moon.ca[] __sourceSharedArray35_4 = new com.moon.ca[__sourceIntrinsic_bab10654e298_originalDynamicSite35_2(2104, (7930533332831323880L ^ local0_life1))];
    __sourceSharedArray35_4[0] = com.moon.ca.PARENTHESES;
    __sourceSharedArray35_4[1] = com.moon.ca.CLOSING_PARENTHESES;
    __sourceSharedArray35_4[2] = com.moon.ca.QUOTATION;
    __sourceSharedArray35_4[3] = com.moon.ca.BRACKET;
    __sourceSharedArray35_4[4] = com.moon.ca.CLOSING_BRACKET;
    __sourceSharedArray35_4[5] = com.moon.ca.BRACES;
    __sourceSharedArray35_4[__sourceIntrinsic_bab10654e298_originalDynamicSite35_10(8008, (6190531326006219154L ^ local0_life1))] = com.moon.ca.CLOSING_BRACES;
    __sourceSharedArray35_4[__sourceIntrinsic_bab10654e298_originalDynamicSite35_12(31557, (4770328657959597468L ^ local0_life1))] = com.moon.ca.EQUALS;
    __sourceSharedArray35_4[__sourceIntrinsic_bab10654e298_originalDynamicSite35_14(27411, (7029316559269602754L ^ local0_life1))] = com.moon.ca.COMMA;
    return __sourceSharedArray35_4;
}


private static boolean lambda$typeOf$0(char p0, com.moon.ca p1) {
int forwardValue29_13_0;
    int forwardValue29_15_0;
    char spill29_0;
    long life2_3;
    int life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.ca.c ^ 72544878935227L);
    life4_5 = com.moon.ig.b();
    spill29_0 = ((com.moon.ca)(p1)).a();
    if (!((life4_5 == 0))) {
        forwardValue29_13_0 = ((int)(spill29_0));
        break forward_join_13;
    }
    if (!((spill29_0 == p0))) {
        break forward_join_14;
    }
    forwardValue29_13_0 = 1;
    }
    forwardValue29_15_0 = forwardValue29_13_0;
    break forward_join_15;
    }
    forwardValue29_15_0 = 0;
    }
    return ((forwardValue29_15_0) != 0);
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_77(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_81(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic10_89(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_099bc1a29c14_originalDynamicSite82_2(char a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral833_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bab10654e298_originalDynamicSite35_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bab10654e298_originalDynamicSite35_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bab10654e298_originalDynamicSite35_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_bab10654e298_originalDynamicSite35_14(int a0, long a1) throws E;
}
