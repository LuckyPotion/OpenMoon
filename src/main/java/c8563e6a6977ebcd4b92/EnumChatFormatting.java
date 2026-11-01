package net.minecraft.util;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class EnumChatFormatting extends sourcebuild.EnumConstructor<net.minecraft.util.EnumChatFormatting> {

public static net.minecraft.util.EnumChatFormatting BLACK;

public static net.minecraft.util.EnumChatFormatting DARK_BLUE;

public static net.minecraft.util.EnumChatFormatting DARK_GREEN;

public static net.minecraft.util.EnumChatFormatting DARK_AQUA;

public static net.minecraft.util.EnumChatFormatting DARK_RED;

public static net.minecraft.util.EnumChatFormatting DARK_PURPLE;

public static net.minecraft.util.EnumChatFormatting GOLD;

public static net.minecraft.util.EnumChatFormatting GRAY;

public static net.minecraft.util.EnumChatFormatting DARK_GRAY;

public static net.minecraft.util.EnumChatFormatting BLUE;

public static net.minecraft.util.EnumChatFormatting GREEN;

public static net.minecraft.util.EnumChatFormatting AQUA;

public static net.minecraft.util.EnumChatFormatting RED;

public static net.minecraft.util.EnumChatFormatting LIGHT_PURPLE;

public static net.minecraft.util.EnumChatFormatting YELLOW;

public static net.minecraft.util.EnumChatFormatting WHITE;

public static net.minecraft.util.EnumChatFormatting OBFUSCATED;

public static net.minecraft.util.EnumChatFormatting BOLD;

public static net.minecraft.util.EnumChatFormatting STRIKETHROUGH;

public static net.minecraft.util.EnumChatFormatting UNDERLINE;

public static net.minecraft.util.EnumChatFormatting ITALIC;

public static net.minecraft.util.EnumChatFormatting RESET;

private static java.util.Map<java.lang.String, net.minecraft.util.EnumChatFormatting> a;

private static java.util.regex.Pattern b;

private java.lang.String c;

private char d;

private boolean e;

private java.lang.String f;

private int g;

private static net.minecraft.util.EnumChatFormatting[] h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private EnumChatFormatting(java.lang.String p0, int p1, java.lang.String p2, char p3, boolean p4) {
this(((java.lang.String)(p0)), ((int)(p1)), ((java.lang.String)(p2)), ((char)(p3)), ((boolean)(p4)), ((int)(-1)));
    return;
}


private EnumChatFormatting(java.lang.String p0, int p1, java.lang.String p2, char p3, boolean p4, int p5) {
super(p0, p1);

    this.c = ((java.lang.String)(p2));
    this.d = ((char)(p3));
    this.e = ((boolean)(p4));
    this.g = ((int)(p5));
    this.f = ((java.lang.String)(__sourceIntrinsic_04d60e06e215_originalDynamicSite5659_4(p3)));
    return;
}


private EnumChatFormatting(java.lang.String p0, int p1, java.lang.String p2, char p3, int p4) {
this(((java.lang.String)(p0)), ((int)(p1)), ((java.lang.String)(p2)), ((char)(p3)), ((boolean)(false)), ((int)(p4)));
    return;
}


private static void initialize() {
javax.crypto.Cipher forestValue577_36_0;
    int forestValue577_36_1;
    javax.crypto.SecretKeyFactory forestValue577_36_2;
    byte[] forestValue577_36_3;
    javax.crypto.Cipher forestValue577_53_0;
    int forestValue577_53_1;
    javax.crypto.SecretKeyFactory forestValue577_53_2;
    byte[] forestValue577_53_3;
    long[] forestValue577_157_0;
    int forestValue577_157_1;
    long forestValue577_157_2;
    int forestValue577_157_3;
    long[] forestValue577_300_0;
    int forestValue577_300_1;
    long forestValue577_300_2;
    long[] forestValue577_312_0;
    int forestValue577_312_1;
    long forestValue577_312_2;
    javax.crypto.Cipher spill577_0;
    int spill577_1;
    javax.crypto.SecretKeyFactory spill577_2;
    byte[] spill577_3;
    byte[] spill577_4;
    java.lang.String spill577_5;
    int spill577_6;
    int spill577_7;
    long spill577_8;
    byte[] spill577_9;
    byte[] spill577_10;
    byte[] spill577_11;
    byte[] spill577_12;
    byte[] spill577_13;
    byte[] spill577_14;
    byte[] spill577_15;
    byte[] spill577_16;
    long spill577_17;
    int spill577_18;
    java.lang.String spill577_19;
    int spill577_20;
    long[] spill577_21;
    int spill577_22;
    long spill577_23;
    int spill577_24;
    long life11_11;
    javax.crypto.Cipher life0_20;
    int life1_35;
    long[] life6_66;
    int life3_68;
    java.lang.String life4_71;
    int life5_73;
    int life2_75;
    byte[] life7_83;
    long life8_160;
    byte[] life10_228;
    byte[] life7_325;
    net.minecraft.util.EnumChatFormatting[] life13_804;
    int life14_807;
    int life15_809;
    net.minecraft.util.EnumChatFormatting life16_816;
    forest_join_824: {
    forest_join_399: {
    forest_join_53: {
    i = ((long)(((moom._a)(moom._c.a(((long)(8731230308987232948L)), ((long)(8192655812211599589L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(82699783062971L)))));
    life11_11 = (net.minecraft.util.EnumChatFormatting.i ^ 23716465958016L);
    l = ((java.util.Map)(new java.util.HashMap(13)));
    spill577_0 = (life0_20 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill577_1 = 2;
    spill577_2 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp577_9_0 = new byte[8];
    spill577_3 = __stackOp577_9_0;
    (__stackOp577_9_0)[0] = ((byte) ((int) (life11_11 >>> 56)));
    life1_35 = 1;
    forestValue577_36_0 = spill577_0;
    forestValue577_36_1 = spill577_1;
    forestValue577_36_2 = spill577_2;
    forestValue577_36_3 = spill577_3;
    forest_cycle_36: while (true) {
    if (!((life1_35 < 8))) {
        forestValue577_53_0 = forestValue577_36_0;
        forestValue577_53_1 = forestValue577_36_1;
        forestValue577_53_2 = forestValue577_36_2;
        forestValue577_53_3 = forestValue577_36_3;
        break forest_join_53;
    }
    byte[] __stackOp577_10_0 = forestValue577_36_3;
    spill577_4 = __stackOp577_10_0;
    (__stackOp577_10_0)[life1_35] = ((byte) ((int) ((life11_11 << (life1_35 * 8)) >>> 56)));
    life1_35 += 1;
    forestValue577_36_3 = spill577_4;
    continue forest_cycle_36;
    }
    }
    ((javax.crypto.Cipher)(forestValue577_53_0)).init(((int)(forestValue577_53_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue577_53_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue577_53_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_66 = new long[55];
    life3_68 = 0;
    life5_73 = ((java.lang.String)((life4_71 = "6\004Ö\r%ë{Õ8#ó¥®Ú-Ûbñ(\020øÜ17\007øM\0324aßR\000Ö2ÿeF\016Þ8\022¯\nÚ Ø¦®ªÑR{úifõ2Ã5\003]|\023«v¾!¡¢\"6\004Ã­ãùeE2¸a`WHRa|\rr³HÁµh¦×^­\032\1771oÿQ§L]\022~Ài[.ù\000O·CîöëE\024:z\037þ­1(|Ð\001\177DCb4`oÆÉb[6\004Ñ#O©ªoÅ¤©,sþ*eÉ:àÆ¿IÙ¼/:\b½Tg4tóoÔà+º\025×^¿âF\027ë\026\007þ\nàÏK<Ã_^\nþEß\031ñºÞ\023,ß]vBãXÂ&Y\013AbhïÂI^£\037]\030Lèþ\007Rã\033+É`jý¨ÜxÂë)èÿh\017<\t\003©øßà#ëf[Ü\036]-\fÀ¤\006¶\021\024òÄ«?.Ñ×\020\"çoNv\024\032\024£æb¶ãÞÖ}­:w\032\000\024]¼\006Ê\tÅ­¾¦\034ôâ\177\0266_\002»yÜ9¨ßAHñ\024\f¿µvõ\037Ýî+k\177ÃúRÚ>¨-á$\n\033ôÌ«eÙJy©âÚV®5"))).length();
    life2_75 = 0;
    forest_cycle_76: while (true) {
    spill577_5 = life4_71;
    spill577_6 = life2_75;
    life2_75 += 8;
    life7_83 = ((java.lang.String)(((java.lang.String)(spill577_5)).substring(((int)(spill577_6)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue577_157_0 = life6_66;
    forestValue577_157_1 = (life3_68++);
    forestValue577_157_2 = (((((((((((long) (life7_83)[0]) & 255L) << 56) | ((((long) (life7_83)[1]) & 255L) << 48)) | ((((long) (life7_83)[2]) & 255L) << 40)) | ((((long) (life7_83)[3]) & 255L) << 32)) | ((((long) (life7_83)[4]) & 255L) << 24)) | ((((long) (life7_83)[5]) & 255L) << 16)) | ((((long) (life7_83)[6]) & 255L) << 8)) | (((long) (life7_83)[7]) & 255L));
    forestValue577_157_3 = -1;
    forest_cycle_157: while (true) {
    forest_join_317: {
    forest_join_312: {
    forest_join_300: {
    long __stackOp577_16_0 = forestValue577_157_2;
    int __stackOp577_16_1 = forestValue577_157_3;
    spill577_7 = __stackOp577_16_1;
    spill577_8 = __stackOp577_16_0;
    recovery.source.CarrierOps.discard(__stackOp577_16_1);
    life8_160 = spill577_8;
    byte[] __stackOp577_18_0 = new byte[8];
    spill577_9 = __stackOp577_18_0;
    (__stackOp577_18_0)[0] = ((byte) ((int) (life8_160 >>> 56)));
    byte[] __stackOp577_19_0 = spill577_9;
    spill577_10 = __stackOp577_19_0;
    (__stackOp577_19_0)[1] = ((byte) ((int) (life8_160 >>> 48)));
    byte[] __stackOp577_20_0 = spill577_10;
    spill577_11 = __stackOp577_20_0;
    (__stackOp577_20_0)[2] = ((byte) ((int) (life8_160 >>> 40)));
    byte[] __stackOp577_21_0 = spill577_11;
    spill577_12 = __stackOp577_21_0;
    (__stackOp577_21_0)[3] = ((byte) ((int) (life8_160 >>> 32)));
    byte[] __stackOp577_22_0 = spill577_12;
    spill577_13 = __stackOp577_22_0;
    (__stackOp577_22_0)[4] = ((byte) ((int) (life8_160 >>> 24)));
    byte[] __stackOp577_23_0 = spill577_13;
    spill577_14 = __stackOp577_23_0;
    (__stackOp577_23_0)[5] = ((byte) ((int) (life8_160 >>> 16)));
    byte[] __stackOp577_24_0 = spill577_14;
    spill577_15 = __stackOp577_24_0;
    (__stackOp577_24_0)[6] = ((byte) ((int) (life8_160 >>> 8)));
    byte[] __stackOp577_25_0 = spill577_15;
    spill577_16 = __stackOp577_25_0;
    (__stackOp577_25_0)[7] = ((byte) ((int) life8_160));
    byte[] __stackOp577_26_0 = spill577_16;
    javax.crypto.Cipher __stackOp577_26_1 = life0_20;
    life10_228 = ((javax.crypto.Cipher)(__stackOp577_26_1)).doFinal(((byte[])(__stackOp577_26_0)));
    int __stackOp577_28_0 = spill577_7;
    long __stackOp577_28_1 = (((((((((((long) (life10_228)[0]) & 255L) << 56) | ((((long) (life10_228)[1]) & 255L) << 48)) | ((((long) (life10_228)[2]) & 255L) << 40)) | ((((long) (life10_228)[3]) & 255L) << 32)) | ((((long) (life10_228)[4]) & 255L) << 24)) | ((((long) (life10_228)[5]) & 255L) << 16)) | ((((long) (life10_228)[6]) & 255L) << 8)) | (((long) (life10_228)[7]) & 255L));
    spill577_17 = __stackOp577_28_1;
    spill577_18 = __stackOp577_28_0;
    recovery.source.CarrierOps.discard(__stackOp577_28_1);
    switch (spill577_18) {
default:
{
        forestValue577_300_0 = forestValue577_157_0;
        forestValue577_300_1 = forestValue577_157_1;
        forestValue577_300_2 = spill577_17;
        break forest_join_300;
    }
case 0:
{
        forestValue577_312_0 = forestValue577_157_0;
        forestValue577_312_1 = forestValue577_157_1;
        forestValue577_312_2 = spill577_17;
        break forest_join_312;
    }
}
    }
    (forestValue577_300_0)[forestValue577_300_1] = forestValue577_300_2;
    if (!((life2_75 >= life5_73))) {
        continue forest_cycle_76;
    }
    life5_73 = ((java.lang.String)((life4_71 = "5êµþszÝFX\"uî\tHC"))).length();
    life2_75 = 0;
    break forest_join_317;
    }
    (forestValue577_312_0)[forestValue577_312_1] = forestValue577_312_2;
    if (!((life2_75 >= life5_73))) {
        break forest_join_317;
    }
    break forest_join_399;
    }
    spill577_19 = life4_71;
    spill577_20 = life2_75;
    life2_75 += 8;
    life7_325 = ((java.lang.String)(((java.lang.String)(spill577_19)).substring(((int)(spill577_20)), ((int)(life2_75))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill577_21 = life6_66;
    spill577_22 = (life3_68++);
    spill577_23 = (((((((((((long) (life7_325)[0]) & 255L) << 56) | ((((long) (life7_325)[1]) & 255L) << 48)) | ((((long) (life7_325)[2]) & 255L) << 40)) | ((((long) (life7_325)[3]) & 255L) << 32)) | ((((long) (life7_325)[4]) & 255L) << 24)) | ((((long) (life7_325)[5]) & 255L) << 16)) | ((((long) (life7_325)[6]) & 255L) << 8)) | (((long) (life7_325)[7]) & 255L));
    spill577_24 = 0;
    forestValue577_157_0 = spill577_21;
    forestValue577_157_1 = spill577_22;
    forestValue577_157_2 = spill577_23;
    forestValue577_157_3 = spill577_24;
    continue forest_cycle_157;
    }
    }
    }
    j = ((long[])(life6_66));
    k = ((java.lang.Integer[])(new java.lang.Integer[55]));
    BLACK = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("BLACK", 0, "BLACK", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_35(31531, (1001136121074591825L ^ life11_11)))), 0)));
    DARK_BLUE = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("DARK_BLUE", 1, "DARK_BLUE", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_38(6202, (7376713755619216252L ^ life11_11)))), 1)));
    DARK_GREEN = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("DARK_GREEN", 2, "DARK_GREEN", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_41(12510, (8429907623544578975L ^ life11_11)))), 2)));
    DARK_AQUA = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("DARK_AQUA", 3, "DARK_AQUA", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_44(12357, (4001243536398050060L ^ life11_11)))), 3)));
    DARK_RED = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("DARK_RED", 4, "DARK_RED", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_47(15683, (7125283033579253288L ^ life11_11)))), 4)));
    DARK_PURPLE = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("DARK_PURPLE", 5, "DARK_PURPLE", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_50(17672, (4999388550882629207L ^ life11_11)))), 5)));
    GOLD = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("GOLD", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_53(6580, (3370026426197822148L ^ life11_11)), "GOLD", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_54(6176, (2286117174767078213L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_55(17447, (8927744070515103612L ^ life11_11)))));
    GRAY = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("GRAY", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_58(8488, (7736318347606192725L ^ life11_11)), "GRAY", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_59(23745, (2385162032063942580L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_60(17477, (3992798929926985522L ^ life11_11)))));
    DARK_GRAY = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("DARK_GRAY", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_63(15464, (3852926101308534571L ^ life11_11)), "DARK_GRAY", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_64(31811, (8458856893171019532L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_65(16985, (1626410434615906579L ^ life11_11)))));
    BLUE = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("BLUE", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_68(20599, (835758228812694296L ^ life11_11)), "BLUE", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_69(11315, (3406920046058733422L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_70(5151, (5988149691577059167L ^ life11_11)))));
    GREEN = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("GREEN", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_73(16325, (320245509943553183L ^ life11_11)), "GREEN", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_74(31031, (9193598884058180185L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_75(31222, (8586970837101619842L ^ life11_11)))));
    AQUA = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("AQUA", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_78(17251, (6697543768616603657L ^ life11_11)), "AQUA", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_79(25427, (8072103257494499380L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_80(3360, (8239943778782928472L ^ life11_11)))));
    RED = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("RED", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_83(5626, (8726917710861387454L ^ life11_11)), "RED", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_84(5720, (8758669964681168132L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_85(9730, (5720622696526509428L ^ life11_11)))));
    LIGHT_PURPLE = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("LIGHT_PURPLE", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_88(368, (4350730539210166808L ^ life11_11)), "LIGHT_PURPLE", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_89(4620, (1385509216921829741L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_90(22526, (3909633881221301406L ^ life11_11)))));
    YELLOW = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("YELLOW", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_93(19226, (3218123924537055325L ^ life11_11)), "YELLOW", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_94(15083, (1289655341796551048L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_95(17214, (3596714915364180071L ^ life11_11)))));
    WHITE = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("WHITE", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_98(4112, (825748800089670499L ^ life11_11)), "WHITE", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_99(18586, (6943823169457101784L ^ life11_11)))), __sourceIntrinsic_eb8803ad1f63_invokedynamic577_100(10563, (699020989547903496L ^ life11_11)))));
    OBFUSCATED = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("OBFUSCATED", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_103(4602, (677244986410255012L ^ life11_11)), "OBFUSCATED", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_104(26437, (7288198168827966519L ^ life11_11)))), true)));
    BOLD = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("BOLD", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_107(25644, (5236443904183646050L ^ life11_11)), "BOLD", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_108(19554, (3241924897378901785L ^ life11_11)))), true)));
    STRIKETHROUGH = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("STRIKETHROUGH", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_111(15596, (7228573409449537422L ^ life11_11)), "STRIKETHROUGH", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_112(25905, (5404964341329737301L ^ life11_11)))), true)));
    UNDERLINE = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("UNDERLINE", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_115(29265, (6464667369208193300L ^ life11_11)), "UNDERLINE", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_116(31804, (1417078886404403029L ^ life11_11)))), true)));
    ITALIC = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("ITALIC", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_119(16055, (3384046490370764238L ^ life11_11)), "ITALIC", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_120(8777, (5758217268706439471L ^ life11_11)))), true)));
    RESET = ((net.minecraft.util.EnumChatFormatting)(new net.minecraft.util.EnumChatFormatting("RESET", __sourceIntrinsic_eb8803ad1f63_invokedynamic577_123(32049, (5802012591367532110L ^ life11_11)), "RESET", ((char)(__sourceIntrinsic_eb8803ad1f63_invokedynamic577_124(19966, (4352202395804212883L ^ life11_11)))), -1)));
    h = ((net.minecraft.util.EnumChatFormatting[])(net.minecraft.util.EnumChatFormatting.a__Arraybr()));
    a = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    b = ((java.util.regex.Pattern)(java.util.regex.Pattern.compile(((java.lang.String)("(?i)§[0-9A-FK-OR]")))));
    life13_804 = net.minecraft.util.EnumChatFormatting.values();
    life14_807 = (life13_804).length;
    life15_809 = 0;
    forest_cycle_808: while (true) {
    if (!((life15_809 < life14_807))) {
        break forest_join_824;
    }
    life16_816 = (life13_804)[life15_809];
    ((java.util.Map)(net.minecraft.util.EnumChatFormatting.a)).put(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.a(((java.lang.String)(((net.minecraft.util.EnumChatFormatting)(life16_816)).c))))), ((java.lang.Object)(life16_816)));
    life15_809 += 1;
    continue forest_cycle_808;
    }
    }
}


public java.lang.String toString() {
return this.f;
}


public static net.minecraft.util.EnumChatFormatting[] values() {
return ((net.minecraft.util.EnumChatFormatting[])(((net.minecraft.util.EnumChatFormatting[])(net.minecraft.util.EnumChatFormatting.h)).clone()));
}


public static net.minecraft.util.EnumChatFormatting valueOf(java.lang.String p0) {
return ((net.minecraft.util.EnumChatFormatting)(java.lang.Enum.valueOf(((java.lang.Class)(net.minecraft.util.EnumChatFormatting.class)), ((java.lang.String)(p0)))));
}


public static java.lang.String b(java.lang.String p0) {
long local1 = (net.minecraft.util.EnumChatFormatting.i ^ 50993341842695L);
    return ((p0 == null) ? null : ((java.util.regex.Matcher)(((java.util.regex.Pattern)(net.minecraft.util.EnumChatFormatting.b)).matcher(((java.lang.CharSequence)(p0))))).replaceAll(((java.lang.String)(""))));
}


public boolean b() {
net.minecraft.util.EnumChatFormatting forwardValue5739_12_0;
    int forwardValue5739_17_0;
    net.minecraft.util.EnumChatFormatting spill5739_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (net.minecraft.util.EnumChatFormatting.i ^ 83783288680102L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5739_0 = this;
    if (!((life3_5 != 0))) {
        forwardValue5739_12_0 = spill5739_0;
        break forward_join_12;
    }
    if (!((!((net.minecraft.util.EnumChatFormatting)(spill5739_0)).e))) {
        break forward_join_16;
    }
    forwardValue5739_12_0 = this;
    }
    if (!((forwardValue5739_12_0 != net.minecraft.util.EnumChatFormatting.RESET))) {
        break forward_join_16;
    }
    forwardValue5739_17_0 = 1;
    break forward_join_17;
    }
    forwardValue5739_17_0 = 0;
    }
    return ((forwardValue5739_17_0) != 0);
}


private static net.minecraft.util.EnumChatFormatting[] a__Arraybr() {
long local0_life1 = (net.minecraft.util.EnumChatFormatting.i ^ 53078675970245L);
    net.minecraft.util.EnumChatFormatting[] __sourceSharedArray1160_4 = new net.minecraft.util.EnumChatFormatting[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_2(26987, (1772532027343846992L ^ local0_life1))];
    __sourceSharedArray1160_4[0] = net.minecraft.util.EnumChatFormatting.BLACK;
    __sourceSharedArray1160_4[1] = net.minecraft.util.EnumChatFormatting.DARK_BLUE;
    __sourceSharedArray1160_4[2] = net.minecraft.util.EnumChatFormatting.DARK_GREEN;
    __sourceSharedArray1160_4[3] = net.minecraft.util.EnumChatFormatting.DARK_AQUA;
    __sourceSharedArray1160_4[4] = net.minecraft.util.EnumChatFormatting.DARK_RED;
    __sourceSharedArray1160_4[5] = net.minecraft.util.EnumChatFormatting.DARK_PURPLE;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_10(17447, (8927702613810484025L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.GOLD;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_12(17477, (3992828851154359159L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.GRAY;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_14(16985, (1626378340810233174L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.DARK_GRAY;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_16(5151, (5988111562000810778L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.BLUE;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_18(31222, (8587002936279936711L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.GREEN;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_20(3360, (8239912633359981085L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.AQUA;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_22(9730, (5720585135625662769L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.RED;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_24(22526, (3909663901769269467L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.LIGHT_PURPLE;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_26(17214, (3596754320278066210L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.YELLOW;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_28(10563, (698988358066273869L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.WHITE;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_30(1698, (2828050969113121194L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.OBFUSCATED;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_32(27317, (2601688306954485121L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.BOLD;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_34(16849, (5889500163389462264L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.STRIKETHROUGH;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_36(30349, (6408858959471518132L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.UNDERLINE;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_38(3659, (2382916147751770438L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.ITALIC;
    __sourceSharedArray1160_4[__sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_40(13848, (8070248610817564945L ^ local0_life1))] = net.minecraft.util.EnumChatFormatting.RESET;
    return __sourceSharedArray1160_4;
}


public static java.util.Collection<java.lang.String> a(boolean p0, boolean p1) {
int lexicalValue1708_33_0;
    int lexicalValue1708_44_0;
    boolean spill1708_0;
    boolean spill1708_1;
    boolean spill1708_2;
    boolean spill1708_3;
    long life2_3;
    java.util.ArrayList life5_6;
    int life4_7;
    net.minecraft.util.EnumChatFormatting[] life6_9;
    int life7_12;
    int life8_14;
    net.minecraft.util.EnumChatFormatting life9_21;
    lexical_join_48: {
    life2_3 = (net.minecraft.util.EnumChatFormatting.i ^ 47079712623368L);
    spill1708_0 = moom.DS.c__Boolean();
    life5_6 = com.google.common.collect.Lists.newArrayList();
    life4_7 = ((spill1708_0) ? 1 : 0);
    life6_9 = net.minecraft.util.EnumChatFormatting.values();
    life7_12 = (life6_9).length;
    life8_14 = 0;
    lexical_cycle_15: while (true) {
    lexical_join_45: {
    lexical_join_44: {
    lexical_join_40: {
    lexical_join_33: {
    lexical_join_31: {
    if (!((life8_14 < life7_12))) {
        break lexical_join_48;
    }
    life9_21 = (life6_9)[life8_14];
    spill1708_1 = ((net.minecraft.util.EnumChatFormatting)(life9_21)).b();
    if (!((life4_7 != 0))) {
        lexicalValue1708_33_0 = ((spill1708_1) ? 1 : 0);
        break lexical_join_33;
    }
    if (!(spill1708_1)) {
        break lexical_join_31;
    }
    spill1708_2 = p0;
    if (!((life4_7 != 0))) {
        lexicalValue1708_33_0 = ((spill1708_2) ? 1 : 0);
        break lexical_join_33;
    }
    if (!(spill1708_2)) {
        break lexical_join_45;
    }
    }
    lexicalValue1708_33_0 = ((((net.minecraft.util.EnumChatFormatting)(life9_21)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_7 != 0))) {
        lexicalValue1708_44_0 = lexicalValue1708_33_0;
        break lexical_join_44;
    }
    if (!((lexicalValue1708_33_0 != 0))) {
        break lexical_join_40;
    }
    spill1708_3 = p1;
    if (!((life4_7 != 0))) {
        lexicalValue1708_44_0 = ((spill1708_3) ? 1 : 0);
        break lexical_join_44;
    }
    if (!(spill1708_3)) {
        break lexical_join_45;
    }
    }
    lexicalValue1708_44_0 = ((((java.util.List)(life5_6)).add(((java.lang.Object)(((net.minecraft.util.EnumChatFormatting)(life9_21)).a__String())))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue1708_44_0);
    }
    life8_14 += 1;
    if (!((life4_7 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return life5_6;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12362_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/br"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.util.EnumChatFormatting.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26200;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/br", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public int a() {
return this.g;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public java.lang.String a__String() {
return ((java.lang.String)(((net.minecraft.util.EnumChatFormatting)(this)).name())).toLowerCase();
}


private static java.lang.String a(java.lang.String p0) {
return ((java.lang.String)(((java.lang.String)(p0)).toLowerCase())).replaceAll(((java.lang.String)("[^a-z]")), ((java.lang.String)("")));
}


public static net.minecraft.util.EnumChatFormatting a__br(java.lang.String p0) {
java.lang.Object forwardValue5738_16_0;
    net.minecraft.util.EnumChatFormatting forwardValue5738_17_0;
    java.lang.String spill5738_0;
    long life1_3;
    int life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_12: {
    life1_3 = (net.minecraft.util.EnumChatFormatting.i ^ 74073842980576L);
    life3_5 = ((moom.DS.c__Boolean()) ? 1 : 0);
    spill5738_0 = p0;
    if (!((life3_5 != 0))) {
        forwardValue5738_16_0 = spill5738_0;
        break forward_join_16;
    }
    if (!((spill5738_0 == null))) {
        break forward_join_12;
    }
    forwardValue5738_17_0 = null;
    break forward_join_17;
    }
    forwardValue5738_16_0 = ((java.util.Map)(net.minecraft.util.EnumChatFormatting.a)).get(((java.lang.Object)(net.minecraft.util.EnumChatFormatting.a(((java.lang.String)(p0))))));
    }
    forwardValue5738_17_0 = ((net.minecraft.util.EnumChatFormatting)(forwardValue5738_16_0));
    }
    return forwardValue5738_17_0;
}


public static net.minecraft.util.EnumChatFormatting a(int p0) {
long life1_3;
    int life3_5;
    net.minecraft.util.EnumChatFormatting[] life4_13;
    int life5_16;
    int life6_18;
    net.minecraft.util.EnumChatFormatting life7_25;
    lexical_join_35: {
    lexical_join_10: {
    life1_3 = (net.minecraft.util.EnumChatFormatting.i ^ 51902278205820L);
    life3_5 = ((moom.DS.b__Boolean()) ? 1 : 0);
    if (!((p0 < 0))) {
        break lexical_join_10;
    }
    return net.minecraft.util.EnumChatFormatting.RESET;
    }
    life4_13 = net.minecraft.util.EnumChatFormatting.values();
    life5_16 = (life4_13).length;
    life6_18 = 0;
    lexical_cycle_17: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!((life6_18 < life5_16))) {
        break lexical_join_35;
    }
    life7_25 = (life4_13)[life6_18];
    if (!((life3_5 == 0))) {
        break lexical_join_33;
    }
    if (!((((net.minecraft.util.EnumChatFormatting)(life7_25)).a() == p0))) {
        break lexical_join_32;
    }
    return life7_25;
    }
    life6_18 += 1;
    }
    if (!((life3_5 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    return null;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_41(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_60(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_70(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_79(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_83(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_85(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_88(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_89(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_90(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_93(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_95(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_100(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_104(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_108(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_123(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic577_124(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_04d60e06e215_originalDynamicSite5659_4(char a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12362_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ef3c8ce510a_originalDynamicSite1160_40(int a0, long a1) throws E;
}
