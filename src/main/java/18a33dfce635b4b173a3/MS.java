package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class MS {

public static java.nio.ByteBuffer a;

public static java.nio.IntBuffer b;

public static int[] c;

public static java.util.Map<java.lang.Integer, moom.MA> d;

private static int e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public MS() {
super();
}


static {
javax.crypto.Cipher forestValue416_38_0;
    int forestValue416_38_1;
    javax.crypto.SecretKeyFactory forestValue416_38_2;
    byte[] forestValue416_38_3;
    javax.crypto.Cipher forestValue416_55_0;
    int forestValue416_55_1;
    javax.crypto.SecretKeyFactory forestValue416_55_2;
    byte[] forestValue416_55_3;
    java.lang.String forestValue416_88_0;
    int forestValue416_88_1;
    java.lang.String forestValue416_100_0;
    java.lang.String forestValue416_124_0;
    javax.crypto.Cipher forestValue416_184_0;
    int forestValue416_184_1;
    javax.crypto.SecretKeyFactory forestValue416_184_2;
    byte[] forestValue416_184_3;
    javax.crypto.Cipher forestValue416_201_0;
    int forestValue416_201_1;
    javax.crypto.SecretKeyFactory forestValue416_201_2;
    byte[] forestValue416_201_3;
    long[] forestValue416_305_0;
    int forestValue416_305_1;
    long forestValue416_305_2;
    int forestValue416_305_3;
    long[] forestValue416_448_0;
    int forestValue416_448_1;
    long forestValue416_448_2;
    long[] forestValue416_460_0;
    int forestValue416_460_1;
    long forestValue416_460_2;
    int spill416_0;
    javax.crypto.Cipher spill416_1;
    int spill416_2;
    javax.crypto.SecretKeyFactory spill416_3;
    byte[] spill416_4;
    byte[] spill416_5;
    java.lang.String spill416_6;
    int spill416_7;
    java.lang.String spill416_8;
    java.lang.String[] spill416_9;
    java.lang.String[] spill416_10;
    java.lang.String spill416_11;
    java.lang.String spill416_12;
    int spill416_13;
    javax.crypto.Cipher spill416_14;
    int spill416_15;
    javax.crypto.SecretKeyFactory spill416_16;
    byte[] spill416_17;
    byte[] spill416_18;
    java.lang.String spill416_19;
    int spill416_20;
    int spill416_21;
    long spill416_22;
    byte[] spill416_23;
    byte[] spill416_24;
    byte[] spill416_25;
    byte[] spill416_26;
    byte[] spill416_27;
    byte[] spill416_28;
    byte[] spill416_29;
    byte[] spill416_30;
    long spill416_31;
    int spill416_32;
    java.lang.String spill416_33;
    int spill416_34;
    long[] spill416_35;
    int spill416_36;
    long spill416_37;
    int spill416_38;
    int spill416_39;
    long life20_11;
    javax.crypto.Cipher life11_22;
    int life12_37;
    java.lang.String[] life18_68;
    int life16_70;
    java.lang.String life15_73;
    int life17_75;
    int life14_77;
    int life13_79;
    byte[] life19_95;
    javax.crypto.Cipher life0_171;
    int life1_186;
    long[] life6_217;
    int life3_219;
    java.lang.String life4_222;
    int life5_224;
    int life2_226;
    byte[] life7_234;
    long life8_311;
    byte[] life10_379;
    byte[] life7_476;
    forest_join_547: {
    forest_join_201: {
    forest_join_155: {
    forest_join_55: {
    f = ((long)(((moom._a)(moom._c.a(((long)(7064554716273516284L)), ((long)(2819228776667216008L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(30018428188440L)))));
    life20_11 = (moom.MS.f ^ 94330400285051L);
    spill416_0 = 0;
    i = ((java.util.Map)(new java.util.HashMap(13)));
    moom.MS.b__Void(((int)(spill416_0)));
    spill416_1 = (life11_22 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    spill416_2 = 2;
    spill416_3 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp416_10_0 = new byte[8];
    spill416_4 = __stackOp416_10_0;
    (__stackOp416_10_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life12_37 = 1;
    forestValue416_38_0 = spill416_1;
    forestValue416_38_1 = spill416_2;
    forestValue416_38_2 = spill416_3;
    forestValue416_38_3 = spill416_4;
    forest_cycle_38: while (true) {
    if (!((life12_37 < 8))) {
        forestValue416_55_0 = forestValue416_38_0;
        forestValue416_55_1 = forestValue416_38_1;
        forestValue416_55_2 = forestValue416_38_2;
        forestValue416_55_3 = forestValue416_38_3;
        break forest_join_55;
    }
    byte[] __stackOp416_11_0 = forestValue416_38_3;
    spill416_5 = __stackOp416_11_0;
    (__stackOp416_11_0)[life12_37] = ((byte) ((int) ((life20_11 << (life12_37 * 8)) >>> 56)));
    life12_37 += 1;
    forestValue416_38_3 = spill416_5;
    continue forest_cycle_38;
    }
    }
    ((javax.crypto.Cipher)(forestValue416_55_0)).init(((int)(forestValue416_55_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue416_55_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue416_55_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life18_68 = new java.lang.String[7];
    life16_70 = 0;
    life17_75 = ((java.lang.String)((life15_73 = "mÄ°#~Eì¶O*>Èü8º0ÓË\fR/~©Ì«ªlÓ\020ß\020að\023À\f||Ð&¶ù³e5\036|¿|87\027¯\f+µ7FG(H@ÈÌBï(\005º0ó@Ü\025A0KaÑï9fëÀâ¶_évÛ2ÈÛS$\020\017Â\013=·~5ê©¿t¡?pÊ\037\020µo0¹3\034í\006\013¢ßzvU¤>"))).length();
    life14_77 = 16;
    life13_79 = -1;
    forest_cycle_80: while (true) {
    forest_join_150: {
    life13_79 += 1;
    spill416_6 = life15_73;
    int __stackOp416_15_0 = life13_79;
    forestValue416_88_0 = ((java.lang.String)(spill416_6)).substring(((int)(__stackOp416_15_0)), ((int)((__stackOp416_15_0 + life14_77))));
    forestValue416_88_1 = -1;
    forest_cycle_88: while (true) {
    forest_join_141: {
    forest_join_124: {
    forest_join_114: {
    forest_join_100: {
    java.lang.String __stackOp416_17_0 = forestValue416_88_0;
    int __stackOp416_17_1 = forestValue416_88_1;
    spill416_7 = __stackOp416_17_1;
    byte[] __stackOp416_19_0 = ((java.lang.String)(__stackOp416_17_0)).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __stackOp416_19_1 = life11_22;
    life19_95 = ((javax.crypto.Cipher)(__stackOp416_19_1)).doFinal(((byte[])(__stackOp416_19_0)));
    int __stackOp416_23_0 = spill416_7;
    java.lang.String __stackOp416_23_1 = ((java.lang.String)(moom.MS.a(((byte[])(life19_95))))).intern();
    spill416_8 = __stackOp416_23_1;
    switch (__stackOp416_23_0) {
default:
{
        forestValue416_100_0 = spill416_8;
        break forest_join_100;
    }
case 0:
{
        forestValue416_124_0 = spill416_8;
        break forest_join_124;
    }
}
    }
    java.lang.String __stackOp416_24_0 = forestValue416_100_0;
    java.lang.String[] __stackOp416_24_1 = life18_68;
    spill416_9 = __stackOp416_24_1;
    java.lang.String __stackOp416_25_0 = __stackOp416_24_0;
    int __stackOp416_25_1 = (life16_70++);
    (spill416_9)[__stackOp416_25_1] = __stackOp416_25_0;
    if (!(((life13_79 = (life13_79 + life14_77)) < life17_75))) {
        break forest_join_114;
    }
    break forest_join_150;
    }
    life17_75 = ((java.lang.String)((life15_73 = "\"\024Ël\005(Ýóº\013jTÙ]Ë qËaÎ-ãÕ,æ9â\031zy\033ÿþ÷©V¤ªìÉÃT²\031\036"))).length();
    life14_77 = 16;
    life13_79 = -1;
    break forest_join_141;
    }
    java.lang.String __stackOp416_27_0 = forestValue416_124_0;
    java.lang.String[] __stackOp416_27_1 = life18_68;
    spill416_10 = __stackOp416_27_1;
    java.lang.String __stackOp416_28_0 = __stackOp416_27_0;
    int __stackOp416_28_1 = (life16_70++);
    (spill416_10)[__stackOp416_28_1] = __stackOp416_28_0;
    if (!(((life13_79 = (life13_79 + life14_77)) < life17_75))) {
        break forest_join_155;
    }
    life14_77 = ((int)(((java.lang.String)(life15_73)).charAt(((int)(life13_79)))));
    }
    life13_79 += 1;
    spill416_11 = life15_73;
    int __stackOp416_31_0 = life13_79;
    spill416_12 = ((java.lang.String)(spill416_11)).substring(((int)(__stackOp416_31_0)), ((int)((__stackOp416_31_0 + life14_77))));
    spill416_13 = 0;
    forestValue416_88_0 = spill416_12;
    forestValue416_88_1 = spill416_13;
    continue forest_cycle_88;
    }
    }
    life14_77 = ((int)(((java.lang.String)(life15_73)).charAt(((int)(life13_79)))));
    continue forest_cycle_80;
    }
    }
    g = ((java.lang.String[])(life18_68));
    h = ((java.lang.String[])(new java.lang.String[7]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    spill416_14 = (life0_171 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    spill416_15 = 2;
    spill416_16 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __stackOp416_40_0 = new byte[8];
    spill416_17 = __stackOp416_40_0;
    (__stackOp416_40_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life1_186 = 1;
    forestValue416_184_0 = spill416_14;
    forestValue416_184_1 = spill416_15;
    forestValue416_184_2 = spill416_16;
    forestValue416_184_3 = spill416_17;
    forest_cycle_184: while (true) {
    if (!((life1_186 < 8))) {
        forestValue416_201_0 = forestValue416_184_0;
        forestValue416_201_1 = forestValue416_184_1;
        forestValue416_201_2 = forestValue416_184_2;
        forestValue416_201_3 = forestValue416_184_3;
        break forest_join_201;
    }
    byte[] __stackOp416_41_0 = forestValue416_184_3;
    spill416_18 = __stackOp416_41_0;
    (__stackOp416_41_0)[life1_186] = ((byte) ((int) ((life20_11 << (life1_186 * 8)) >>> 56)));
    life1_186 += 1;
    forestValue416_184_3 = spill416_18;
    continue forest_cycle_184;
    }
    }
    ((javax.crypto.Cipher)(forestValue416_201_0)).init(((int)(forestValue416_201_1)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(forestValue416_201_2)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(forestValue416_201_3)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    life6_217 = new long[47];
    life3_219 = 0;
    life5_224 = ((java.lang.String)((life4_222 = "¥I#\006®6Sà&\"z\fQÅþwÂ»ú{SG¥I÷m\022Äíä\033Í¢éóÐwmi\037úYÍðÁ\0044B\"²\016çõ§vU~e*×9\024Và\001PVzû´\t\004!ïð6\036À\024Òàc?Aø\004,XëW'½ *¾¹ø\006ú\007lq³ß)C®­&FÞïM«~¦ÇÇ\tþU\021\fÐ6©oa]i/Iý¹Rq÷¤\005tÀ\023\n®©N\017èUg\033\022\001{H0ÞEû Á\\PO\032\033\031­Ç\001nsw¥¾\037m÷'Ê}\030³7>'A\016Waåñ±Ñu×¼årÇâÀ·\035ÕÛ\000ú@=¥ºR3|\032\t}m\001½Ä¤®Ocß`vÌ¼æìïA\177¸'\033ÖI`Î\nâ'æàW\t:©\035=bt\0231/q<ïdß\033£\030Zß\002\böP\b'¾Â\016ry5,\035Gþ'{ÐzÄz\024BNQáî\027p&X\032\007å£:\026§\036õcWY[-W"))).length();
    life2_226 = 0;
    forest_cycle_224: while (true) {
    spill416_19 = life4_222;
    spill416_20 = life2_226;
    life2_226 += 8;
    life7_234 = ((java.lang.String)(((java.lang.String)(spill416_19)).substring(((int)(spill416_20)), ((int)(life2_226))))).getBytes(((java.lang.String)("ISO-8859-1")));
    forestValue416_305_0 = life6_217;
    forestValue416_305_1 = (life3_219++);
    forestValue416_305_2 = (((((((((((long) (life7_234)[0]) & 255L) << 56) | ((((long) (life7_234)[1]) & 255L) << 48)) | ((((long) (life7_234)[2]) & 255L) << 40)) | ((((long) (life7_234)[3]) & 255L) << 32)) | ((((long) (life7_234)[4]) & 255L) << 24)) | ((((long) (life7_234)[5]) & 255L) << 16)) | ((((long) (life7_234)[6]) & 255L) << 8)) | (((long) (life7_234)[7]) & 255L));
    forestValue416_305_3 = -1;
    forest_cycle_305: while (true) {
    forest_join_465: {
    forest_join_460: {
    forest_join_448: {
    long __stackOp416_47_0 = forestValue416_305_2;
    int __stackOp416_47_1 = forestValue416_305_3;
    spill416_21 = __stackOp416_47_1;
    spill416_22 = __stackOp416_47_0;
    recovery.source.CarrierOps.discard(__stackOp416_47_1);
    life8_311 = spill416_22;
    byte[] __stackOp416_49_0 = new byte[8];
    spill416_23 = __stackOp416_49_0;
    (__stackOp416_49_0)[0] = ((byte) ((int) (life8_311 >>> 56)));
    byte[] __stackOp416_50_0 = spill416_23;
    spill416_24 = __stackOp416_50_0;
    (__stackOp416_50_0)[1] = ((byte) ((int) (life8_311 >>> 48)));
    byte[] __stackOp416_51_0 = spill416_24;
    spill416_25 = __stackOp416_51_0;
    (__stackOp416_51_0)[2] = ((byte) ((int) (life8_311 >>> 40)));
    byte[] __stackOp416_52_0 = spill416_25;
    spill416_26 = __stackOp416_52_0;
    (__stackOp416_52_0)[3] = ((byte) ((int) (life8_311 >>> 32)));
    byte[] __stackOp416_53_0 = spill416_26;
    spill416_27 = __stackOp416_53_0;
    (__stackOp416_53_0)[4] = ((byte) ((int) (life8_311 >>> 24)));
    byte[] __stackOp416_54_0 = spill416_27;
    spill416_28 = __stackOp416_54_0;
    (__stackOp416_54_0)[5] = ((byte) ((int) (life8_311 >>> 16)));
    byte[] __stackOp416_55_0 = spill416_28;
    spill416_29 = __stackOp416_55_0;
    (__stackOp416_55_0)[6] = ((byte) ((int) (life8_311 >>> 8)));
    byte[] __stackOp416_56_0 = spill416_29;
    spill416_30 = __stackOp416_56_0;
    (__stackOp416_56_0)[7] = ((byte) ((int) life8_311));
    byte[] __stackOp416_57_0 = spill416_30;
    javax.crypto.Cipher __stackOp416_57_1 = life0_171;
    life10_379 = ((javax.crypto.Cipher)(__stackOp416_57_1)).doFinal(((byte[])(__stackOp416_57_0)));
    int __stackOp416_59_0 = spill416_21;
    long __stackOp416_59_1 = (((((((((((long) (life10_379)[0]) & 255L) << 56) | ((((long) (life10_379)[1]) & 255L) << 48)) | ((((long) (life10_379)[2]) & 255L) << 40)) | ((((long) (life10_379)[3]) & 255L) << 32)) | ((((long) (life10_379)[4]) & 255L) << 24)) | ((((long) (life10_379)[5]) & 255L) << 16)) | ((((long) (life10_379)[6]) & 255L) << 8)) | (((long) (life10_379)[7]) & 255L));
    spill416_31 = __stackOp416_59_1;
    spill416_32 = __stackOp416_59_0;
    recovery.source.CarrierOps.discard(__stackOp416_59_1);
    switch (spill416_32) {
default:
{
        forestValue416_448_0 = forestValue416_305_0;
        forestValue416_448_1 = forestValue416_305_1;
        forestValue416_448_2 = spill416_31;
        break forest_join_448;
    }
case 0:
{
        forestValue416_460_0 = forestValue416_305_0;
        forestValue416_460_1 = forestValue416_305_1;
        forestValue416_460_2 = spill416_31;
        break forest_join_460;
    }
}
    }
    (forestValue416_448_0)[forestValue416_448_1] = forestValue416_448_2;
    if (!((life2_226 >= life5_224))) {
        continue forest_cycle_224;
    }
    life5_224 = ((java.lang.String)((life4_222 = "úg\030\005êËÜÚ3gu]´2"))).length();
    life2_226 = 0;
    break forest_join_465;
    }
    (forestValue416_460_0)[forestValue416_460_1] = forestValue416_460_2;
    if (!((life2_226 >= life5_224))) {
        break forest_join_465;
    }
    break forest_join_547;
    }
    spill416_33 = life4_222;
    spill416_34 = life2_226;
    life2_226 += 8;
    life7_476 = ((java.lang.String)(((java.lang.String)(spill416_33)).substring(((int)(spill416_34)), ((int)(life2_226))))).getBytes(((java.lang.String)("ISO-8859-1")));
    spill416_35 = life6_217;
    spill416_36 = (life3_219++);
    spill416_37 = (((((((((((long) (life7_476)[0]) & 255L) << 56) | ((((long) (life7_476)[1]) & 255L) << 48)) | ((((long) (life7_476)[2]) & 255L) << 40)) | ((((long) (life7_476)[3]) & 255L) << 32)) | ((((long) (life7_476)[4]) & 255L) << 24)) | ((((long) (life7_476)[5]) & 255L) << 16)) | ((((long) (life7_476)[6]) & 255L) << 8)) | (((long) (life7_476)[7]) & 255L));
    spill416_38 = 0;
    forestValue416_305_0 = spill416_35;
    forestValue416_305_1 = spill416_36;
    forestValue416_305_2 = spill416_37;
    forestValue416_305_3 = spill416_38;
    continue forest_cycle_305;
    }
    }
    }
    j = ((long[])(life6_217));
    k = ((java.lang.Integer[])(new java.lang.Integer[47]));
    a = ((java.nio.ByteBuffer)(org.lwjgl.BufferUtils.createByteBuffer(((int)(__sourceIntrinsic_eb8803ad1f63_invokedynamic416_66(27428, (636244182190522559L ^ life20_11)))))));
    spill416_39 = 28642;
    b = ((java.nio.IntBuffer)(((java.nio.ByteBuffer)(moom.MS.a)).asIntBuffer()));
    c = ((int[])(new int[__sourceIntrinsic_eb8803ad1f63_invokedynamic416_72(spill416_39, (8033089902212220002L ^ life20_11))]));
    d = ((java.util.Map)(new java.util.HashMap()));
}

private static native <E extends Throwable> int __sourceHandlerCall_d836f3d8647c45b791b4(int a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_d836f3d8647c45b791b4 {

public static int f925(int p0, int p1, int p2, int p3) throws Throwable {
    int forwardValue925_85_0;
    int spill925_0;
    int spill925_1;
    long life4_3;
    int life7_18;
    int life8_32;
    int life9_46;
    int life10_60;
    int life11_68;
    int life6_69;
    int life12_75;
    int life13_84;
    int life14_105;
    forward_join_94: {
    forward_join_85: {
    forward_join_84: {
    life4_3 = (__fieldRead925_0() ^ 58536433740867L);
    spill925_0 = __call925_1();
    life7_18 = ((p0 >>> __invokedynamic925_2(21702, (4852875885068120647L ^ life4_3))) & __invokedynamic925_3(28828, (5513458118285710885L ^ life4_3)));
    life8_32 = ((p1 >>> __invokedynamic925_4(21702, (4852875885068120647L ^ life4_3))) & __invokedynamic925_5(28828, (5513458118285710885L ^ life4_3)));
    life9_46 = ((p2 >>> __invokedynamic925_6(21702, (4852875885068120647L ^ life4_3))) & __invokedynamic925_7(28828, (5513458118285710885L ^ life4_3)));
    life10_60 = ((p3 >>> __invokedynamic925_8(21702, (4852875885068120647L ^ life4_3))) & __invokedynamic925_9(28828, (5513458118285710885L ^ life4_3)));
    life11_68 = (((life7_18 + life8_32) + life9_46) + life10_60);
    life6_69 = spill925_0;
    life12_75 = ((life11_68 + 2) / 4);
    spill925_1 = life11_68;
    if (!((life6_69 == 0))) {
        forwardValue925_85_0 = spill925_1;
        break forward_join_85;
    }
    if (!((spill925_1 != 0))) {
        break forward_join_84;
    }
    life13_84 = life11_68;
    if (!((life6_69 != 0))) {
        break forward_join_94;
    }
    }
    forwardValue925_85_0 = 4;
    }
    life13_84 = forwardValue925_85_0;
    life7_18 = 1;
    life8_32 = 1;
    life9_46 = 1;
    life10_60 = 1;
    }
    life14_105 = ((life13_84 + 1) / 2);
    return ((((life12_75 << __invokedynamic925_10(21702, (4852875885068120647L ^ life4_3))) | (((((((((p0 >>> __invokedynamic925_11(24787, (6048252939326244453L ^ life4_3))) & __invokedynamic925_12(28828, (5513458118285710885L ^ life4_3))) * life7_18) + (((p1 >>> __invokedynamic925_13(24787, (6048252939326244453L ^ life4_3))) & __invokedynamic925_14(28828, (5513458118285710885L ^ life4_3))) * life8_32)) + (((p2 >>> __invokedynamic925_15(24787, (6048252939326244453L ^ life4_3))) & __invokedynamic925_16(28828, (5513458118285710885L ^ life4_3))) * life9_46)) + (((p3 >>> __invokedynamic925_17(24787, (6048252939326244453L ^ life4_3))) & __invokedynamic925_18(28828, (5513458118285710885L ^ life4_3))) * life10_60)) + life14_105) / life13_84) << __invokedynamic925_19(24787, (6048252939326244453L ^ life4_3)))) | (((((((((p0 >>> __invokedynamic925_20(25699, (5190281195918967527L ^ life4_3))) & __invokedynamic925_21(28828, (5513458118285710885L ^ life4_3))) * life7_18) + (((p1 >>> __invokedynamic925_22(25699, (5190281195918967527L ^ life4_3))) & __invokedynamic925_23(28828, (5513458118285710885L ^ life4_3))) * life8_32)) + (((p2 >>> __invokedynamic925_24(25699, (5190281195918967527L ^ life4_3))) & __invokedynamic925_25(28828, (5513458118285710885L ^ life4_3))) * life9_46)) + (((p3 >>> __invokedynamic925_26(25699, (5190281195918967527L ^ life4_3))) & __invokedynamic925_27(28828, (5513458118285710885L ^ life4_3))) * life10_60)) + life14_105) / life13_84) << __invokedynamic925_28(25699, (5190281195918967527L ^ life4_3)))) | (((((((p0 & __invokedynamic925_29(28828, (5513458118285710885L ^ life4_3))) * life7_18) + ((p1 & __invokedynamic925_30(28828, (5513458118285710885L ^ life4_3))) * life8_32)) + ((p2 & __invokedynamic925_31(28828, (5513458118285710885L ^ life4_3))) * life9_46)) + ((p3 & __invokedynamic925_32(28828, (5513458118285710885L ^ life4_3))) * life10_60)) + life14_105) / life13_84));
}
public static void h925_0(moom.Oo p0) throws Throwable {
    throw __call1092500_0(p0);
}
public static void h925_1(moom.Oo p0) throws Throwable {
    throw __call1092501_0(p0);
}
private static native long __fieldRead925_0() throws Throwable;
private static native int __call925_1() throws Throwable;
private static native int __invokedynamic925_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_24(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic925_32(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1092500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1092501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_236b4c96e2b87983ee50(int a0, int a1, int a2, int a3, moom.oe a4, net.minecraft.client.renderer.texture.TextureMap a5) throws E;
private static final class __SourceHandler_236b4c96e2b87983ee50 {

public static void f926(int p0, int p1, int p2, int p3, moom.oe p4, net.minecraft.client.renderer.texture.TextureMap p5) throws Throwable {
    int forwardValue926_51_0;
    int forwardValue926_61_0;
    int spill926_0;
    int spill926_1;
    int spill926_2;
    boolean spill926_3;
    long life6_3;
    int life10_8;
    int life11_9;
    int life12_10;
    int life8_27;
    moom.MA life9_33;
    forward_join_61: {
    forward_join_60: {
    forward_join_51: {
    forward_join_50: {
    life6_3 = (__fieldRead926_0() ^ 33590834702099L);
    spill926_0 = __call926_1();
    spill926_1 = p1;
    spill926_2 = p2;
    life10_8 = p3;
    life11_9 = spill926_2;
    life12_10 = spill926_1;
    __call926_4(__invokedynamic926_3(__invokedynamic926_2(221, (2790081902453520408L ^ life6_3)), life12_10, " ", life11_9, " ", life10_8, " "));
    __fieldWrite926_5(p5, p2);
    life8_27 = spill926_0;
    __fieldWrite926_6(p5, p3);
    life9_33 = __call926_7(p5);
    __call926_9(__fieldRead926_8(life9_33), p1, p2, p3);
    spill926_3 = __fieldRead926_10();
    if (!((life8_27 != 0))) {
        forwardValue926_51_0 = __integerCategory926_11(spill926_3);
        break forward_join_51;
    }
    if (!(spill926_3)) {
        break forward_join_50;
    }
    __call926_13(__fieldRead926_12(life9_33), p1, p2, p3);
    }
    forwardValue926_51_0 = __integerCategory926_15(__fieldRead926_14());
    }
    if (!((life8_27 != 0))) {
        forwardValue926_61_0 = forwardValue926_51_0;
        break forward_join_61;
    }
    if (!((forwardValue926_51_0 != 0))) {
        break forward_join_60;
    }
    __call926_17(__fieldRead926_16(life9_33), p1, p2, p3);
    }
    forwardValue926_61_0 = p0;
    }
    __call926_18(forwardValue926_61_0);
    return;
}
public static void h926_0(moom.Oo p0) throws Throwable {
    throw __call1092600_0(p0);
}
public static void h926_1(moom.Oo p0) throws Throwable {
    throw __call1092601_0(p0);
}
public static void h926_2(moom.Oo p0) throws Throwable {
    throw __call1092602_0(p0);
}
public static void h926_3(moom.Oo p0) throws Throwable {
    throw __call1092603_0(p0);
}
private static native long __fieldRead926_0() throws Throwable;
private static native int __call926_1() throws Throwable;
private static native java.lang.String __invokedynamic926_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic926_3(java.lang.String a0, int a1, java.lang.String a2, int a3, java.lang.String a4, int a5, java.lang.String a6) throws Throwable;
private static native void __call926_4(java.lang.String a0) throws Throwable;
private static native void __fieldWrite926_5(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native void __fieldWrite926_6(net.minecraft.client.renderer.texture.TextureMap a0, int a1) throws Throwable;
private static native moom.MA __call926_7(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native int __fieldRead926_8(moom.MA a0) throws Throwable;
private static native void __call926_9(int a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __fieldRead926_10() throws Throwable;
private static native int __integerCategory926_11(boolean value) throws Throwable;
private static native int __fieldRead926_12(moom.MA a0) throws Throwable;
private static native void __call926_13(int a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __fieldRead926_14() throws Throwable;
private static native int __integerCategory926_15(boolean value) throws Throwable;
private static native int __fieldRead926_16(moom.MA a0) throws Throwable;
private static native void __call926_17(int a0, int a1, int a2, int a3) throws Throwable;
private static native void __call926_18(int a0) throws Throwable;
private static native java.lang.Exception __call1092600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1092601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1092602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1092603_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[][] __sourceHandlerCall_11fbaa47e2e809577425(int a0, int a1, int[][] a2) throws E;
private static final class __SourceHandler_11fbaa47e2e809577425 {

public static int[][] f790(int p0, int p1, int[][] p2) throws Throwable {
    int forestValue790_9_0;
    int[][] forestValue790_102_0;
    int spill790_0;
    int[][] spill790_1;
    int[] spill790_2;
    int spill790_3;
    long life3_3;
    int life6_6;
    int life5_7;
    int life7_21;
    int life8_25;
    int[] life9_31;
    int[] life10_40;
    int life11_42;
    int life12_49;
    int life13_62;
    forest_join_102: {
    forest_join_101: {
    life3_3 = (__fieldRead790_0() ^ 1595692514339L);
    spill790_0 = __call790_1();
    life6_6 = 1;
    life5_7 = spill790_0;
    forest_cycle_8: while (true) {
    forest_join_98: {
    forestValue790_9_0 = life6_6;
    forest_cycle_9: while (true) {
    if (!((forestValue790_9_0 <= p0))) {
        break forest_join_101;
    }
    spill790_1 = p2;
    if (!((life5_7 != 0))) {
        forestValue790_102_0 = spill790_1;
        break forest_join_102;
    }
    if (!(((spill790_1)[life6_6] == null))) {
        break forest_join_98;
    }
    life7_21 = (p1 >> life6_6);
    life8_25 = (life7_21 * 2);
    life9_31 = (p2)[(life6_6 - 1)];
    int[][] __stackOp790_2_0 = p2;
    int __stackOp790_2_1 = life6_6;
    int[] __stackOp790_2_2 = new int[(life7_21 * life7_21)];
    spill790_2 = __stackOp790_2_2;
    (__stackOp790_2_0)[__stackOp790_2_1] = __stackOp790_2_2;
    life10_40 = spill790_2;
    life11_42 = 0;
    forest_cycle_42: while (true) {
    forest_join_96: {
    forest_join_95: {
    if (!((life11_42 < life7_21))) {
        break forest_join_98;
    }
    spill790_3 = 0;
    if (!((life5_7 != 0))) {
        forestValue790_9_0 = spill790_3;
        continue forest_cycle_9;
    }
    life12_49 = spill790_3;
    forest_cycle_49: while (true) {
    if (!((life12_49 < life7_21))) {
        break forest_join_95;
    }
    life13_62 = (((life11_42 * 2) * life8_25) + (life12_49 * 2));
    (life10_40)[((life11_42 * life7_21) + life12_49)] = __call790_3((life9_31)[life13_62], (life9_31)[(life13_62 + 1)], (life9_31)[(life13_62 + life8_25)], (life9_31)[((life13_62 + life8_25) + 1)]);
    life12_49 += 1;
    if (!((life5_7 != 0))) {
        break forest_join_96;
    }
    if (!((life5_7 == 0))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    }
    life11_42 += 1;
    }
    if (!((life5_7 == 0))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_cycle_9;
    }
    }
    life6_6 += 1;
    if (!((life5_7 == 0))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    forestValue790_102_0 = p2;
    }
    return forestValue790_102_0;
}
public static int[][] h790_0(moom.Oo p0) throws Throwable {
    throw __call3079000_0(p0);
}
public static int[][] h790_1(moom.Oo p0) throws Throwable {
    throw __call3079001_0(p0);
}
private static native long __fieldRead790_0() throws Throwable;
private static native int __call790_1() throws Throwable;
private static native int __call790_3(int a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call3079000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3079001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.awt.image.BufferedImage __sourceHandlerCall_7466575e929d3bef5588(moom.DD a0) throws E;
private static final class __SourceHandler_7466575e929d3bef5588 {

public static java.awt.image.BufferedImage f349(moom.DD p0) throws Throwable {
    moom.DD forwardValue349_14_0;
    java.io.InputStream forwardValue349_23_0;
    moom.DD spill349_0;
    java.io.InputStream spill349_1;
    long life1_3;
    int life3_5;
    java.io.InputStream life4_18;
    java.awt.image.BufferedImage life5_30;
    forward_join_23: {
    forward_join_22: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead349_0() ^ 133924269384982L);
    life3_5 = __call349_1();
    spill349_0 = p0;
    if (!((life3_5 == 0))) {
        forwardValue349_14_0 = spill349_0;
        break forward_join_14;
    }
    if (!((!__call349_2(spill349_0)))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue349_14_0 = p0;
    }
    life4_18 = __call349_3(forwardValue349_14_0);
    spill349_1 = life4_18;
    if (!((life3_5 == 0))) {
        forwardValue349_23_0 = spill349_1;
        break forward_join_23;
    }
    if (!((spill349_1 == null))) {
        break forward_join_22;
    }
    return null;
    }
    forwardValue349_23_0 = life4_18;
    }
    life5_30 = __call349_4(forwardValue349_23_0);
    __call349_5(life4_18);
    return life5_30;
}
public static java.awt.image.BufferedImage h349_0(java.io.IOException p0) throws Throwable {
    throw __call2034900_0(p0);
}
public static java.awt.image.BufferedImage h349_1(java.io.IOException p0) throws Throwable {
    throw __call2034901_0(p0);
}
public static java.awt.image.BufferedImage h349_2(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    return null;
}
private static native long __fieldRead349_0() throws Throwable;
private static native int __call349_1() throws Throwable;
private static native boolean __call349_2(moom.DD a0) throws Throwable;
private static native java.io.InputStream __call349_3(moom.DD a0) throws Throwable;
private static native java.awt.image.BufferedImage __call349_4(java.io.InputStream a0) throws Throwable;
private static native void __call349_5(java.io.InputStream a0) throws Throwable;
private static native java.lang.Exception __call2034900_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2034901_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> moom.DD __sourceHandlerCall_34e7f0860c11804b6636(moom.DD a0, java.lang.String a1) throws E;
private static final class __SourceHandler_34e7f0860c11804b6636 {

public static moom.DD f37(moom.DD p0, java.lang.String p1) throws Throwable {
    moom.DD spill37_0;
    moom.DD joinValue37_0_0;
    long life2_3;
    int life4_5;
    java.lang.String life5_19;
    java.lang.String[] life6_27;
    java.lang.String life7_31;
    life2_3 = (__fieldRead37_0() ^ 88818035179361L);
    life4_5 = __call37_1();
    spill37_0 = p0;
    if ((life4_5 == 0)) {
        if ((spill37_0 == null)) {
        return null;
    }
        joinValue37_0_0 = p0;
    } else {
        joinValue37_0_0 = spill37_0;
    }
    life5_19 = __call37_2(joinValue37_0_0);
    life6_27 = __call37_4(life5_19, __invokedynamic37_3(12629, (414938944303321571L ^ life2_3)));
    life7_31 = (life6_27)[0];
    java.lang.Object __inlineStack37_6Token;
    return new moom.DD(__call37_5(p0), __invokedynamic37_8(life7_31, __inlineStack37_6Output0((__inlineStack37_6Token = __inlineStack37_6Pack(p1, "_"))), __inlineStack37_6Output1(__inlineStack37_6Token), __invokedynamic37_7(21198, (5175091693667758719L ^ life2_3))));
}
public static moom.DD h37_0(moom.Oo p0) throws Throwable {
    throw __call3003700_0(p0);
}
public static moom.DD h37_1(moom.Oo p0) throws Throwable {
    throw __call3003701_0(p0);
}
private static native long __fieldRead37_0() throws Throwable;
private static native int __call37_1() throws Throwable;
private static native java.lang.String __call37_2(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic37_3(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call37_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call37_5(moom.DD a0) throws Throwable;
private static native java.lang.Object __inlineStack37_6Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack37_6Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack37_6Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic37_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic37_8(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native java.lang.Exception __call3003700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3003701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9ec104ece776c60e598c(moom.MA a0, int[] a1, int a2, int a3, int a4, int a5, boolean a6, boolean a7) throws E;
private static final class __SourceHandler_9ec104ece776c60e598c {

public static void f929(moom.MA p0, int[] p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7) throws Throwable {
    int forwardValue929_236_0;
    int forwardValue929_236_1;
    int forwardValue929_329_0;
    int forwardValue929_329_1;
    int spill929_0;
    int spill929_1;
    int spill929_2;
    long life8_3;
    int life11_7;
    java.nio.IntBuffer life12_10;
    int life10_62;
    forward_join_329: {
    forward_join_256: {
    forward_join_236: {
    forward_join_142: {
    life8_3 = (__fieldRead929_0() ^ 60468889910348L);
    life11_7 = (p2 * p3);
    life12_10 = __call929_1(life11_7);
    __call929_2(life12_10);
    __call929_3(life12_10, p1, 0, life11_7);
    __call929_5(__call929_4(life12_10, 0), life11_7);
    __call929_7(__fieldRead929_6(p0));
    spill929_0 = __call929_8();
    __call929_12(__invokedynamic929_9(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_10(18526, (6349209047326097143L ^ life8_3)), __invokedynamic929_11(29033, (8489126636041816007L ^ life8_3)));
    __call929_16(__invokedynamic929_13(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_14(9453, (7111359376092303952L ^ life8_3)), __invokedynamic929_15(29033, (8489126636041816007L ^ life8_3)));
    life10_62 = spill929_0;
    __call929_20(__invokedynamic929_17(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_18(497, (8335846795827427196L ^ life8_3)), __invokedynamic929_19(2499, (6596115041361280888L ^ life8_3)));
    __call929_24(__invokedynamic929_21(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_22(21625, (4392112253496943320L ^ life8_3)), __invokedynamic929_23(2499, (6596115041361280888L ^ life8_3)));
    __call929_28(__invokedynamic929_25(17655, (6163628871308833400L ^ life8_3)), 0, p4, p5, p2, p3, __invokedynamic929_26(5867, (3463826092653617228L ^ life8_3)), __invokedynamic929_27(7465, (2885171919054449549L ^ life8_3)), life12_10);
    spill929_1 = (p1).length;
    spill929_2 = (life11_7 * 3);
    if (!((life10_62 != 0))) {
        forwardValue929_236_0 = spill929_1;
        forwardValue929_236_1 = spill929_2;
        break forward_join_236;
    }
    if (!((spill929_1 == spill929_2))) {
        break forward_join_142;
    }
    __call929_29(life12_10);
    __call929_31(__call929_30(life12_10, p1, life11_7, life11_7), 0);
    __call929_33(__call929_32(life12_10, 0), life11_7);
    }
    __call929_35(__fieldRead929_34(p0));
    __call929_39(__invokedynamic929_36(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_37(18526, (6349209047326097143L ^ life8_3)), __invokedynamic929_38(29033, (8489126636041816007L ^ life8_3)));
    __call929_43(__invokedynamic929_40(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_41(9453, (7111359376092303952L ^ life8_3)), __invokedynamic929_42(29033, (8489126636041816007L ^ life8_3)));
    __call929_47(__invokedynamic929_44(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_45(497, (8335846795827427196L ^ life8_3)), __invokedynamic929_46(2499, (6596115041361280888L ^ life8_3)));
    __call929_51(__invokedynamic929_48(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_49(21625, (4392112253496943320L ^ life8_3)), __invokedynamic929_50(2499, (6596115041361280888L ^ life8_3)));
    __call929_55(__invokedynamic929_52(17655, (6163628871308833400L ^ life8_3)), 0, p4, p5, p2, p3, __invokedynamic929_53(5867, (3463826092653617228L ^ life8_3)), __invokedynamic929_54(7465, (2885171919054449549L ^ life8_3)), life12_10);
    forwardValue929_236_0 = (p1).length;
    forwardValue929_236_1 = (life11_7 * 3);
    }
    if (!((life10_62 != 0))) {
        forwardValue929_329_0 = forwardValue929_236_0;
        forwardValue929_329_1 = forwardValue929_236_1;
        break forward_join_329;
    }
    if (!((forwardValue929_236_0 == forwardValue929_236_1))) {
        break forward_join_256;
    }
    __call929_56(life12_10);
    __call929_57(life12_10, p1, (life11_7 * 2), life11_7);
    __call929_59(__call929_58(life12_10, 0), life11_7);
    }
    __call929_61(__fieldRead929_60(p0));
    __call929_65(__invokedynamic929_62(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_63(18526, (6349209047326097143L ^ life8_3)), __invokedynamic929_64(29033, (8489126636041816007L ^ life8_3)));
    __call929_69(__invokedynamic929_66(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_67(9453, (7111359376092303952L ^ life8_3)), __invokedynamic929_68(29033, (8489126636041816007L ^ life8_3)));
    __call929_73(__invokedynamic929_70(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_71(497, (8335846795827427196L ^ life8_3)), __invokedynamic929_72(2499, (6596115041361280888L ^ life8_3)));
    __call929_77(__invokedynamic929_74(17655, (6163628871308833400L ^ life8_3)), __invokedynamic929_75(21625, (4392112253496943320L ^ life8_3)), __invokedynamic929_76(2499, (6596115041361280888L ^ life8_3)));
    forwardValue929_329_0 = __invokedynamic929_78(17655, (6163628871308833400L ^ life8_3));
    forwardValue929_329_1 = 0;
    }
    __call929_81(forwardValue929_329_0, forwardValue929_329_1, p4, p5, p2, p3, __invokedynamic929_79(5867, (3463826092653617228L ^ life8_3)), __invokedynamic929_80(7465, (2885171919054449549L ^ life8_3)), life12_10);
    __call929_83(__invokedynamic929_82(19986, (1861259796125743287L ^ life8_3)));
    return;
}
public static void h929_0(moom.Oo p0) throws Throwable {
    throw __call1092900_0(p0);
}
public static void h929_1(moom.Oo p0) throws Throwable {
    throw __call1092901_0(p0);
}
public static void h929_2(moom.Oo p0) throws Throwable {
    throw __call1092902_0(p0);
}
public static void h929_3(moom.Oo p0) throws Throwable {
    throw __call1092903_0(p0);
}
private static native long __fieldRead929_0() throws Throwable;
private static native java.nio.IntBuffer __call929_1(int a0) throws Throwable;
private static native java.nio.IntBuffer __call929_2(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __call929_3(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call929_4(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call929_5(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __fieldRead929_6(moom.MA a0) throws Throwable;
private static native void __call929_7(int a0) throws Throwable;
private static native int __call929_8() throws Throwable;
private static native int __invokedynamic929_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_11(int a0, long a1) throws Throwable;
private static native void __call929_12(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_15(int a0, long a1) throws Throwable;
private static native void __call929_16(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_19(int a0, long a1) throws Throwable;
private static native void __call929_20(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_23(int a0, long a1) throws Throwable;
private static native void __call929_24(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_27(int a0, long a1) throws Throwable;
private static native void __call929_28(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native java.nio.IntBuffer __call929_29(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __call929_30(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call929_31(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call929_32(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call929_33(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __fieldRead929_34(moom.MA a0) throws Throwable;
private static native void __call929_35(int a0) throws Throwable;
private static native int __invokedynamic929_36(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_38(int a0, long a1) throws Throwable;
private static native void __call929_39(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_42(int a0, long a1) throws Throwable;
private static native void __call929_43(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_44(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_46(int a0, long a1) throws Throwable;
private static native void __call929_47(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_49(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_50(int a0, long a1) throws Throwable;
private static native void __call929_51(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_52(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_53(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_54(int a0, long a1) throws Throwable;
private static native void __call929_55(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native java.nio.IntBuffer __call929_56(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __call929_57(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call929_58(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call929_59(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __fieldRead929_60(moom.MA a0) throws Throwable;
private static native void __call929_61(int a0) throws Throwable;
private static native int __invokedynamic929_62(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_63(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_64(int a0, long a1) throws Throwable;
private static native void __call929_65(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_66(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_67(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_68(int a0, long a1) throws Throwable;
private static native void __call929_69(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_70(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_71(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_72(int a0, long a1) throws Throwable;
private static native void __call929_73(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_74(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_75(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_76(int a0, long a1) throws Throwable;
private static native void __call929_77(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic929_78(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_79(int a0, long a1) throws Throwable;
private static native int __invokedynamic929_80(int a0, long a1) throws Throwable;
private static native void __call929_81(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native int __invokedynamic929_82(int a0, long a1) throws Throwable;
private static native void __call929_83(int a0) throws Throwable;
private static native java.lang.Exception __call1092900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1092901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1092902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1092903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7f1c7487a2eeab738e73(moom.MA a0, int[] a1, int a2, int a3, boolean a4, boolean a5) throws E;
private static final class __SourceHandler_7f1c7487a2eeab738e73 {

public static void f930(moom.MA p0, int[] p1, int p2, int p3, boolean p4, boolean p5) throws Throwable {
    int forwardValue930_15_0;
    int forwardValue930_21_0;
    int forwardValue930_31_0;
    int forwardValue930_37_0;
    boolean spill930_0;
    boolean spill930_1;
    int spill930_2;
    long spill930_3;
    int spill930_4;
    long spill930_5;
    int spill930_6;
    long spill930_7;
    long life6_3;
    int life8_5;
    int life9_24;
    int life10_43;
    int life11_48;
    java.nio.IntBuffer life12_54;
    forward_join_37: {
    forward_join_32: {
    forward_join_31: {
    forward_join_21: {
    forward_join_16: {
    forward_join_15: {
    life6_3 = (__fieldRead930_0() ^ 35552308559319L);
    life8_5 = __call930_1();
    spill930_0 = p4;
    if (!((life8_5 != 0))) {
        forwardValue930_15_0 = __integerCategory930_2(spill930_0);
        break forward_join_15;
    }
    if (!(spill930_0)) {
        break forward_join_16;
    }
    forwardValue930_15_0 = __invokedynamic930_3(32241, (8461281338397903570L ^ life6_3));
    }
    forwardValue930_21_0 = forwardValue930_15_0;
    break forward_join_21;
    }
    forwardValue930_21_0 = __invokedynamic930_4(4550, (2441518612199024382L ^ life6_3));
    }
    life9_24 = forwardValue930_21_0;
    spill930_1 = p5;
    if (!((life8_5 != 0))) {
        forwardValue930_31_0 = __integerCategory930_5(spill930_1);
        break forward_join_31;
    }
    if (!(spill930_1)) {
        break forward_join_32;
    }
    forwardValue930_31_0 = __invokedynamic930_6(17917, (4441224102198833869L ^ life6_3));
    }
    forwardValue930_37_0 = forwardValue930_31_0;
    break forward_join_37;
    }
    forwardValue930_37_0 = __invokedynamic930_7(8703, (2420500860075480780L ^ life6_3));
    }
    life10_43 = forwardValue930_37_0;
    spill930_2 = 17655;
    life11_48 = (p2 * p3);
    spill930_3 = (6163613042610238435L ^ life6_3);
    life12_54 = __call930_8(life11_48);
    __call930_9(life12_54);
    __call930_12(__call930_11(__call930_10(life12_54, p1, 0, life11_48), 0), life11_48);
    __call930_14(__fieldRead930_13(p0));
    __call930_19(__invokedynamic930_15(spill930_2, spill930_3), 0, __invokedynamic930_16(14927, (3172318275822292342L ^ life6_3)), p2, p3, 0, __invokedynamic930_17(26614, (3682841764006088937L ^ life6_3)), __invokedynamic930_18(7542, (624984726844746344L ^ life6_3)), life12_54);
    __call930_22(__invokedynamic930_20(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_21(24746, (4037863240880543627L ^ life6_3)), life9_24);
    __call930_25(__invokedynamic930_23(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_24(24264, (1623734492136303067L ^ life6_3)), life9_24);
    __call930_28(__invokedynamic930_26(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_27(28387, (6604898392832137687L ^ life6_3)), life10_43);
    __call930_31(__invokedynamic930_29(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_30(26182, (6189547225325949276L ^ life6_3)), life10_43);
    spill930_4 = 17655;
    __call930_34(__call930_33(__call930_32(life12_54, p1, life11_48, life11_48), 0), life11_48);
    spill930_5 = (6163613042610238435L ^ life6_3);
    __call930_36(__fieldRead930_35(p0));
    __call930_41(__invokedynamic930_37(spill930_4, spill930_5), 0, __invokedynamic930_38(4625, (4552456472082949435L ^ life6_3)), p2, p3, 0, __invokedynamic930_39(5867, (3463811066038985175L ^ life6_3)), __invokedynamic930_40(7465, (2885160534840650262L ^ life6_3)), life12_54);
    __call930_44(__invokedynamic930_42(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_43(18526, (6349228127047810924L ^ life6_3)), life9_24);
    __call930_47(__invokedynamic930_45(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_46(9453, (7111334472127812555L ^ life6_3)), life9_24);
    __call930_50(__invokedynamic930_48(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_49(497, (8335871352704874215L ^ life6_3)), life10_43);
    __call930_53(__invokedynamic930_51(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_52(21625, (4392131655340942147L ^ life6_3)), life10_43);
    spill930_6 = 17655;
    __call930_56(__call930_55(__call930_54(life12_54, p1, (life11_48 * 2), life11_48), 0), life11_48);
    spill930_7 = (6163613042610238435L ^ life6_3);
    __call930_58(__fieldRead930_57(p0));
    __call930_63(__invokedynamic930_59(spill930_6, spill930_7), 0, __invokedynamic930_60(4625, (4552456472082949435L ^ life6_3)), p2, p3, 0, __invokedynamic930_61(5867, (3463811066038985175L ^ life6_3)), __invokedynamic930_62(7465, (2885160534840650262L ^ life6_3)), life12_54);
    __call930_66(__invokedynamic930_64(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_65(18526, (6349228127047810924L ^ life6_3)), life9_24);
    __call930_69(__invokedynamic930_67(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_68(9453, (7111334472127812555L ^ life6_3)), life9_24);
    __call930_72(__invokedynamic930_70(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_71(497, (8335871352704874215L ^ life6_3)), life10_43);
    __call930_75(__invokedynamic930_73(17655, (6163613042610238435L ^ life6_3)), __invokedynamic930_74(21625, (4392131655340942147L ^ life6_3)), life10_43);
    __call930_77(__fieldRead930_76(p0));
    return;
}
public static void h930_0(moom.Oo p0) throws Throwable {
    throw __call1093000_0(p0);
}
public static void h930_1(moom.Oo p0) throws Throwable {
    throw __call1093001_0(p0);
}
private static native long __fieldRead930_0() throws Throwable;
private static native int __call930_1() throws Throwable;
private static native int __integerCategory930_2(boolean value) throws Throwable;
private static native int __invokedynamic930_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_4(int a0, long a1) throws Throwable;
private static native int __integerCategory930_5(boolean value) throws Throwable;
private static native int __invokedynamic930_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_7(int a0, long a1) throws Throwable;
private static native java.nio.IntBuffer __call930_8(int a0) throws Throwable;
private static native java.nio.IntBuffer __call930_9(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __call930_10(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call930_11(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call930_12(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __fieldRead930_13(moom.MA a0) throws Throwable;
private static native void __call930_14(int a0) throws Throwable;
private static native int __invokedynamic930_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_18(int a0, long a1) throws Throwable;
private static native void __call930_19(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native int __invokedynamic930_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_21(int a0, long a1) throws Throwable;
private static native void __call930_22(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_24(int a0, long a1) throws Throwable;
private static native void __call930_25(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_27(int a0, long a1) throws Throwable;
private static native void __call930_28(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_30(int a0, long a1) throws Throwable;
private static native void __call930_31(int a0, int a1, int a2) throws Throwable;
private static native java.nio.IntBuffer __call930_32(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call930_33(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call930_34(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __fieldRead930_35(moom.MA a0) throws Throwable;
private static native void __call930_36(int a0) throws Throwable;
private static native int __invokedynamic930_37(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_40(int a0, long a1) throws Throwable;
private static native void __call930_41(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native int __invokedynamic930_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_43(int a0, long a1) throws Throwable;
private static native void __call930_44(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_45(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_46(int a0, long a1) throws Throwable;
private static native void __call930_47(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_48(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_49(int a0, long a1) throws Throwable;
private static native void __call930_50(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_51(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_52(int a0, long a1) throws Throwable;
private static native void __call930_53(int a0, int a1, int a2) throws Throwable;
private static native java.nio.IntBuffer __call930_54(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call930_55(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call930_56(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __fieldRead930_57(moom.MA a0) throws Throwable;
private static native void __call930_58(int a0) throws Throwable;
private static native int __invokedynamic930_59(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_60(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_61(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_62(int a0, long a1) throws Throwable;
private static native void __call930_63(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native int __invokedynamic930_64(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_65(int a0, long a1) throws Throwable;
private static native void __call930_66(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_67(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_68(int a0, long a1) throws Throwable;
private static native void __call930_69(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_70(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_71(int a0, long a1) throws Throwable;
private static native void __call930_72(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic930_73(int a0, long a1) throws Throwable;
private static native int __invokedynamic930_74(int a0, long a1) throws Throwable;
private static native void __call930_75(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead930_76(moom.MA a0) throws Throwable;
private static native void __call930_77(int a0) throws Throwable;
private static native java.lang.Exception __call1093000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.MA __sourceHandlerCall_fa78293fc18b8448cdaf(moom.n2 a0) throws E;
private static final class __SourceHandler_fa78293fc18b8448cdaf {

public static moom.MA f137(moom.n2 p0) throws Throwable {
    java.lang.Object forwardValue137_38_0;
    moom.MA forwardValue137_43_0;
    int spill137_0;
    moom.MA spill137_1;
    moom.MA spill137_2;
    long life1_3;
    moom.MA life4_7;
    int life3_8;
    int life5_18;
    forward_join_43: {
    forward_join_42: {
    forward_join_39: {
    forward_join_38: {
    life1_3 = (__fieldRead137_0() ^ 101603036363961L);
    spill137_0 = __call137_1();
    life4_7 = __fieldRead137_2(p0);
    life3_8 = spill137_0;
    spill137_1 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue137_43_0 = spill137_1;
        break forward_join_43;
    }
    if (!((spill137_1 == null))) {
        break forward_join_42;
    }
    life5_18 = __call137_3(p0);
    life4_7 = __cast137_7(__call137_6(__fieldRead137_4(), __call137_5(life5_18)));
    spill137_2 = life4_7;
    if (!((life3_8 != 0))) {
        forwardValue137_38_0 = spill137_2;
        break forward_join_38;
    }
    if (!((spill137_2 == null))) {
        break forward_join_39;
    }
    life4_7 = new moom.MA(life5_18, __call137_8(), __call137_9());
    forwardValue137_38_0 = __call137_12(__fieldRead137_10(), __call137_11(life5_18), life4_7);
    }
    __discardScalar137_13(forwardValue137_38_0);
    }
    __fieldWrite137_14(p0, life4_7);
    }
    forwardValue137_43_0 = life4_7;
    }
    return forwardValue137_43_0;
}
public static void h137_0(moom.Oo p0) throws Throwable {
    throw __call1013700_0(p0);
}
public static void h137_1(moom.Oo p0) throws Throwable {
    throw __call1013701_0(p0);
}
private static native long __fieldRead137_0() throws Throwable;
private static native int __call137_1() throws Throwable;
private static native moom.MA __fieldRead137_2(moom.n2 a0) throws Throwable;
private static native int __call137_3(moom.n2 a0) throws Throwable;
private static native java.util.Map __fieldRead137_4() throws Throwable;
private static native java.lang.Integer __call137_5(int a0) throws Throwable;
private static native java.lang.Object __call137_6(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native moom.MA __cast137_7(java.lang.Object a0) throws Throwable;
private static native int __call137_8() throws Throwable;
private static native int __call137_9() throws Throwable;
private static native java.util.Map __fieldRead137_10() throws Throwable;
private static native java.lang.Integer __call137_11(int a0) throws Throwable;
private static native java.lang.Object __call137_12(java.util.Map a0, java.lang.Integer a1, moom.MA a2) throws Throwable;
private static native void __discardScalar137_13(java.lang.Object a0) throws Throwable;
private static native void __fieldWrite137_14(moom.n2 a0, moom.MA a1) throws Throwable;
private static native java.lang.Exception __call1013700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1013701_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b281fdfa2468b1cba928(moom.n2 a0, int a1) throws E;
private static final class __SourceHandler_b281fdfa2468b1cba928 {

public static void f788(moom.n2 p0, int p1) throws Throwable {
    moom.MA forestValue788_29_0;
    int forestValue788_37_0;
    int forestValue788_37_1;
    int spill788_0;
    moom.MA spill788_1;
    int spill788_2;
    int spill788_3;
    java.lang.String spill788_4;
    int spill788_5;
    int spill788_6;
    long life2_3;
    moom.MA life5_7;
    int life4_8;
    forest_join_55: {
    forest_join_37: {
    forest_join_29: {
    life2_3 = (__fieldRead788_0() ^ 136659030339816L);
    spill788_0 = __call788_1();
    life5_7 = __fieldRead788_2(p0);
    life4_8 = spill788_0;
    spill788_1 = life5_7;
    if (!((life4_8 != 0))) {
        forestValue788_29_0 = spill788_1;
        break forest_join_29;
    }
    if (!((spill788_1 != null))) {
        break forest_join_55;
    }
    __fieldWrite788_3(p0, null);
    __call788_7(__fieldRead788_4(), __call788_6(__fieldRead788_5(life5_7)));
    __call788_9(__fieldRead788_8(life5_7));
    __call788_11(__fieldRead788_10(life5_7));
    forestValue788_29_0 = life5_7;
    }
    spill788_2 = __fieldRead788_12(forestValue788_29_0);
    spill788_3 = p1;
    if (!((life4_8 != 0))) {
        forestValue788_37_0 = spill788_2;
        forestValue788_37_1 = spill788_3;
        break forest_join_37;
    }
    if (!((spill788_2 != spill788_3))) {
        break forest_join_55;
    }
    forestValue788_37_0 = __fieldRead788_13(life5_7);
    forestValue788_37_1 = p1;
    }
    int __stackOp788_15_0 = forestValue788_37_0;
    int __stackOp788_15_1 = forestValue788_37_1;
    java.lang.String __stackOp788_15_2 = __invokedynamic788_14(3663, (9036384541681492338L ^ life2_3));
    spill788_4 = __stackOp788_15_2;
    spill788_5 = __stackOp788_15_0;
    spill788_6 = __stackOp788_15_1;
    __discardScalar788_16(__stackOp788_15_2);
    int __stackOp788_18_0 = spill788_6;
    java.lang.String __stackOp788_18_1 = __invokedynamic788_17(3358, (4068104735962898980L ^ life2_3));
    __call788_20(__invokedynamic788_19(spill788_4, spill788_5, __stackOp788_18_1, __stackOp788_18_0));
    __call788_22(__fieldRead788_21(life5_7));
    }
    return;
}
public static void h788_0(moom.Oo p0) throws Throwable {
    throw __call3078800_0(p0);
}
public static void h788_1(moom.Oo p0) throws Throwable {
    throw __call3078801_0(p0);
}
public static void h788_2(moom.Oo p0) throws Throwable {
    throw __call3078802_0(p0);
}
public static void h788_3(moom.Oo p0) throws Throwable {
    throw __call3078803_0(p0);
}
private static native long __fieldRead788_0() throws Throwable;
private static native int __call788_1() throws Throwable;
private static native moom.MA __fieldRead788_2(moom.n2 a0) throws Throwable;
private static native void __fieldWrite788_3(moom.n2 a0, java.lang.Object a1) throws Throwable;
private static native java.util.Map __fieldRead788_4() throws Throwable;
private static native int __fieldRead788_5(moom.MA a0) throws Throwable;
private static native java.lang.Integer __call788_6(int a0) throws Throwable;
private static native java.lang.Object __call788_7(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native int __fieldRead788_8(moom.MA a0) throws Throwable;
private static native void __call788_9(int a0) throws Throwable;
private static native int __fieldRead788_10(moom.MA a0) throws Throwable;
private static native void __call788_11(int a0) throws Throwable;
private static native int __fieldRead788_12(moom.MA a0) throws Throwable;
private static native int __fieldRead788_13(moom.MA a0) throws Throwable;
private static native java.lang.String __invokedynamic788_14(int a0, long a1) throws Throwable;
private static native void __discardScalar788_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic788_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic788_19(java.lang.String a0, int a1, java.lang.String a2, int a3) throws Throwable;
private static native void __call788_20(java.lang.String a0) throws Throwable;
private static native int __fieldRead788_21(moom.MA a0) throws Throwable;
private static native void __call788_22(int a0) throws Throwable;
private static native java.lang.Exception __call3078800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078803_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9633235a3fdad289c39f(moom.n5 a0, moom.oR a1, java.util.List a2) throws E;
private static final class __SourceHandler_9633235a3fdad289c39f {

public static void f786(moom.n5 p0, moom.oR p1, java.util.List p2) throws Throwable {
    int forestValue786_62_0;
    int spill786_0;
    int spill786_1;
    long life3_3;
    int life6_6;
    int life5_7;
    int life7_9;
    int life8_11;
    int[] life9_13;
    java.util.Iterator life10_16;
    java.lang.String life11_23;
    moom.DD life12_33;
    java.io.InputStream life13_38;
    java.awt.image.BufferedImage life14_41;
    int[] life15_65;
    int life16_83;
    int life17_102;
    forest_join_167: {
    forest_join_159: {
    life3_3 = (__fieldRead786_0() ^ 137183284962941L);
    spill786_0 = __call786_1();
    life6_6 = 0;
    life5_7 = spill786_0;
    life7_9 = 0;
    life8_11 = 0;
    life9_13 = null;
    life10_16 = __call786_2(p2);
    forest_cycle_17: while (true) {
    forest_join_157: {
    forest_join_62: {
    forest_join_59: {
    if (!(__call786_3(life10_16))) {
        break forest_join_159;
    }
    life11_23 = __cast786_5(__call786_4(life10_16));
    if (!((life5_7 != 0))) {
        break forest_join_167;
    }
    if (!((life11_23 != null))) {
        break forest_join_157;
    }
    life12_33 = new moom.DD(life11_23);
    life13_38 = __call786_7(__call786_6(p1, life12_33));
    life14_41 = __call786_8(life13_38);
    spill786_1 = life8_11;
    if (!((life5_7 != 0))) {
        forestValue786_62_0 = spill786_1;
        break forest_join_62;
    }
    if (!((spill786_1 == 0))) {
        break forest_join_59;
    }
    life6_6 = __call786_9(life14_41);
    life7_9 = __call786_10(life14_41);
    life8_11 = (life6_6 * life7_9);
    life9_13 = __call786_11(life8_11, 0);
    }
    forestValue786_62_0 = (life8_11 * 3);
    }
    life15_65 = __call786_12(forestValue786_62_0);
    __call786_13(life14_41, 0, 0, life6_6, life7_9, life15_65, 0, life6_6);
    __call786_14(p1, life12_33, life6_6, life7_9, life15_65);
    life16_83 = 0;
    forest_cycle_82: while (true) {
    if (!((life16_83 < life8_11))) {
        break forest_join_157;
    }
    life17_102 = (((life15_65)[life16_83] >>> __invokedynamic786_15(21702, (4852814547207436409L ^ life3_3))) & __invokedynamic786_16(28828, (5513519796891098139L ^ life3_3)));
    (life9_13)[life16_83] = __call786_17((life15_65)[life16_83], (life9_13)[life16_83], life17_102);
    (life9_13)[(life8_11 + life16_83)] = __call786_18((life15_65)[(life8_11 + life16_83)], (life9_13)[(life8_11 + life16_83)], life17_102);
    (life9_13)[((life8_11 * 2) + life16_83)] = __call786_19((life15_65)[((life8_11 * 2) + life16_83)], (life9_13)[((life8_11 * 2) + life16_83)], life17_102);
    life16_83 += 1;
    if (!((life5_7 != 0))) {
        break forest_join_157;
    }
    if (!((life5_7 == 0))) {
        continue forest_cycle_82;
    }
    break forest_cycle_82;
    }
    }
    if (!((life5_7 == 0))) {
        continue forest_cycle_17;
    }
    break forest_cycle_17;
    }
    }
    __call786_21(__call786_20(p0), life9_13, life6_6, life7_9, 0, 0);
    }
    return;
}
public static void h786_0(java.io.IOException p0) throws Throwable {
    throw __call3078600_0(p0);
}
public static void h786_1(java.io.IOException p0) throws Throwable {
    throw __call3078601_0(p0);
}
public static void h786_2(java.io.IOException p0) throws Throwable {
    throw __call3078602_0(p0);
}
public static void h786_3(java.io.IOException p0, moom.n5 p1, moom.oR p2, long p3, int p4, int p5, int p6, int p7, int[] p8, java.util.Iterator p9, java.lang.String p10, moom.DD p11, java.io.InputStream p12, java.awt.image.BufferedImage p13, int[] p14, int p15, int p16) throws Throwable {
    int forestValue3078603_52_0;
    int spill3078603_0;
    java.io.IOException life12_2;
    java.lang.String life11_14;
    moom.DD life12_24;
    java.io.InputStream life13_29;
    java.awt.image.BufferedImage life14_32;
    int[] life15_56;
    int life16_74;
    int life17_93;
    forest_join_156: {
    forest_join_148: {
    life12_2 = p0;
    __call3078603_0(life12_2);
    forest_cycle_4: while (true) {
    forest_join_147: {
    forest_join_52: {
    forest_join_49: {
    forest_join_7: {
    if (!((p4 == 0))) {
        break forest_join_7;
    }
    break forest_join_148;
    }
    if (!(__call3078603_1(p9))) {
        break forest_join_148;
    }
    life11_14 = __cast3078603_3(__call3078603_2(p9));
    if (!((p4 != 0))) {
        break forest_join_156;
    }
    if (!((life11_14 != null))) {
        continue forest_cycle_4;
    }
    life12_24 = new moom.DD(life11_14);
    life13_29 = __call3078603_5(__call3078603_4(p2, life12_24));
    life14_32 = __call3078603_6(life13_29);
    spill3078603_0 = p7;
    if (!((p4 != 0))) {
        forestValue3078603_52_0 = spill3078603_0;
        break forest_join_52;
    }
    if (!((spill3078603_0 == 0))) {
        break forest_join_49;
    }
    p5 = __call3078603_7(life14_32);
    p6 = __call3078603_8(life14_32);
    p7 = (p5 * p6);
    p8 = __call3078603_9(p7, 0);
    }
    forestValue3078603_52_0 = (p7 * 3);
    }
    life15_56 = __call3078603_10(forestValue3078603_52_0);
    __call3078603_11(life14_32, 0, 0, p5, p6, life15_56, 0, p5);
    __call3078603_12(p2, life12_24, p5, p6, life15_56);
    life16_74 = 0;
    forest_cycle_72: while (true) {
    if (!((life16_74 < p7))) {
        break forest_join_147;
    }
    life17_93 = (((life15_56)[life16_74] >>> __invokedynamic3078603_13(21702, (4852814547207436409L ^ p3))) & __invokedynamic3078603_14(28828, (5513519796891098139L ^ p3)));
    (p8)[life16_74] = __call3078603_15((life15_56)[life16_74], (p8)[life16_74], life17_93);
    (p8)[(p7 + life16_74)] = __call3078603_16((life15_56)[(p7 + life16_74)], (p8)[(p7 + life16_74)], life17_93);
    (p8)[((p7 * 2) + life16_74)] = __call3078603_17((life15_56)[((p7 * 2) + life16_74)], (p8)[((p7 * 2) + life16_74)], life17_93);
    life16_74 += 1;
    if (!((p4 != 0))) {
        continue forest_cycle_4;
    }
    if (!((p4 == 0))) {
        continue forest_cycle_72;
    }
    break forest_cycle_72;
    }
    }
    continue forest_cycle_4;
    }
    }
    __call3078603_19(__call3078603_18(p1), p8, p5, p6, 0, 0);
    }
    return;
}
private static native long __fieldRead786_0() throws Throwable;
private static native int __call786_1() throws Throwable;
private static native java.util.Iterator __call786_2(java.util.List a0) throws Throwable;
private static native boolean __call786_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call786_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast786_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call786_6(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call786_7(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call786_8(java.io.InputStream a0) throws Throwable;
private static native int __call786_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call786_10(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call786_11(int a0, int a1) throws Throwable;
private static native int[] __call786_12(int a0) throws Throwable;
private static native int[] __call786_13(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native void __call786_14(moom.oR a0, moom.DD a1, int a2, int a3, int[] a4) throws Throwable;
private static native int __invokedynamic786_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic786_16(int a0, long a1) throws Throwable;
private static native int __call786_17(int a0, int a1, int a2) throws Throwable;
private static native int __call786_18(int a0, int a1, int a2) throws Throwable;
private static native int __call786_19(int a0, int a1, int a2) throws Throwable;
private static native moom.MA __call786_20(moom.n5 a0) throws Throwable;
private static native void __call786_21(moom.MA a0, int[] a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native java.lang.Exception __call3078600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3078601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3078602_0(java.io.IOException a0) throws Throwable;
private static native void __call3078603_0(java.io.IOException a0) throws Throwable;
private static native boolean __call3078603_1(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3078603_2(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3078603_3(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call3078603_4(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call3078603_5(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call3078603_6(java.io.InputStream a0) throws Throwable;
private static native int __call3078603_7(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call3078603_8(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call3078603_9(int a0, int a1) throws Throwable;
private static native int[] __call3078603_10(int a0) throws Throwable;
private static native int[] __call3078603_11(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native void __call3078603_12(moom.oR a0, moom.DD a1, int a2, int a3, int[] a4) throws Throwable;
private static native int __invokedynamic3078603_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic3078603_14(int a0, long a1) throws Throwable;
private static native int __call3078603_15(int a0, int a1, int a2) throws Throwable;
private static native int __call3078603_16(int a0, int a1, int a2) throws Throwable;
private static native int __call3078603_17(int a0, int a1, int a2) throws Throwable;
private static native moom.MA __call3078603_18(moom.n5 a0) throws Throwable;
private static native void __call3078603_19(moom.MA a0, int[] a1, int a2, int a3, int a4, int a5) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_60949e2df1097974ca6c(moom.oR a0, moom.DD a1, int a2, int a3, int[] a4) throws E;
private static final class __SourceHandler_60949e2df1097974ca6c {

public static void f933(moom.oR p0, moom.DD p1, int p2, int p3, int[] p4) throws Throwable {
    int forwardValue933_27_0;
    boolean spill933_0;
    long life5_3;
    int life7_5;
    forward_join_42: {
    forward_join_27: {
    forward_join_26: {
    life5_3 = (__fieldRead933_0() ^ 120862990978605L);
    life7_5 = __call933_1();
    spill933_0 = __fieldRead933_2();
    if (!((life7_5 == 0))) {
        forwardValue933_27_0 = __integerCategory933_3(spill933_0);
        break forward_join_27;
    }
    if (!(spill933_0)) {
        break forward_join_26;
    }
    __call933_6(p0, __call933_4(p1, "n"), p2, p3, p4, (p2 * p3), __invokedynamic933_5(7464, (4910804350462695875L ^ life5_3)));
    }
    forwardValue933_27_0 = __integerCategory933_8(__fieldRead933_7());
    }
    if (!((forwardValue933_27_0 != 0))) {
        break forward_join_42;
    }
    __call933_10(p0, __call933_9(p1, "s"), p2, p3, p4, ((p2 * p3) * 2), 0);
    }
    return;
}
public static void h933_0(moom.Oo p0) throws Throwable {
    throw __call1093300_0(p0);
}
public static void h933_1(moom.Oo p0) throws Throwable {
    throw __call1093301_0(p0);
}
public static void h933_2(moom.Oo p0) throws Throwable {
    throw __call1093302_0(p0);
}
private static native long __fieldRead933_0() throws Throwable;
private static native int __call933_1() throws Throwable;
private static native boolean __fieldRead933_2() throws Throwable;
private static native int __integerCategory933_3(boolean value) throws Throwable;
private static native moom.DD __call933_4(moom.DD a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic933_5(int a0, long a1) throws Throwable;
private static native void __call933_6(moom.oR a0, moom.DD a1, int a2, int a3, int[] a4, int a5, int a6) throws Throwable;
private static native boolean __fieldRead933_7() throws Throwable;
private static native int __integerCategory933_8(boolean value) throws Throwable;
private static native moom.DD __call933_9(moom.DD a0, java.lang.String a1) throws Throwable;
private static native void __call933_10(moom.oR a0, moom.DD a1, int a2, int a3, int[] a4, int a5, int a6) throws Throwable;
private static native java.lang.Exception __call1093300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f29a57b596f67dc79c6a(moom.oR a0, moom.DD a1, int a2, int a3, int[] a4, int a5) throws E;
private static final class __SourceHandler_f29a57b596f67dc79c6a {

public static boolean f351(moom.oR p0, moom.DD p1, int p2, int p3, int[] p4, int p5) throws Throwable {
    java.awt.image.BufferedImage forwardValue351_25_0;
    int forwardValue351_49_0;
    java.awt.image.BufferedImage spill351_0;
    int spill351_1;
    int spill351_2;
    long life6_3;
    int life8_5;
    net.minecraft.client.resources.IResource life9_15;
    java.awt.image.BufferedImage life10_19;
    forward_join_49: {
    forward_join_48: {
    forward_join_25: {
    forward_join_24: {
    forward_join_10: {
    life6_3 = (__fieldRead351_0() ^ 86671181137885L);
    life8_5 = __call351_1();
    if (!((p1 == null))) {
        break forward_join_10;
    }
    return __integerCategory351_2(0);
    }
    life9_15 = __call351_3(p0, p1);
    life10_19 = __call351_5(__call351_4(life9_15));
    spill351_0 = life10_19;
    if (!((life8_5 == 0))) {
        forwardValue351_25_0 = spill351_0;
        break forward_join_25;
    }
    if (!((spill351_0 == null))) {
        break forward_join_24;
    }
    return __integerCategory351_6(0);
    }
    forwardValue351_25_0 = life10_19;
    }
    spill351_1 = __call351_7(forwardValue351_25_0);
    if (!((life8_5 == 0))) {
        forwardValue351_49_0 = spill351_1;
        break forward_join_49;
    }
    if (!((spill351_1 == p2))) {
        break forward_join_48;
    }
    spill351_2 = __call351_8(life10_19);
    if (!((life8_5 == 0))) {
        forwardValue351_49_0 = spill351_2;
        break forward_join_49;
    }
    if (!((spill351_2 == p3))) {
        break forward_join_48;
    }
    __call351_9(life10_19, 0, 0, p2, p3, p4, p5, p2);
    return __integerCategory351_10(1);
    }
    forwardValue351_49_0 = 0;
    }
    return __integerCategory351_11(forwardValue351_49_0);
}
public static boolean h351_0(java.io.IOException p0) throws Throwable {
    throw __call2035100_0(p0);
}
public static boolean h351_1(java.io.IOException p0) throws Throwable {
    throw __call2035101_0(p0);
}
public static boolean h351_2(java.io.IOException p0) throws Throwable {
    throw __call2035102_0(p0);
}
public static boolean h351_3(java.io.IOException p0) throws Throwable {
    throw __call2035103_0(p0);
}
public static boolean h351_4(java.io.IOException p0) throws Throwable {
    throw __call2035104_0(p0);
}
public static boolean h351_5(java.io.IOException p0) throws Throwable {
    java.io.IOException local1 = p0;
    return false;
}
private static native long __fieldRead351_0() throws Throwable;
private static native int __call351_1() throws Throwable;
private static native boolean __integerCategory351_2(int value) throws Throwable;
private static native net.minecraft.client.resources.IResource __call351_3(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call351_4(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.awt.image.BufferedImage __call351_5(java.io.InputStream a0) throws Throwable;
private static native boolean __integerCategory351_6(int value) throws Throwable;
private static native int __call351_7(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call351_8(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call351_9(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native boolean __integerCategory351_10(int value) throws Throwable;
private static native boolean __integerCategory351_11(int value) throws Throwable;
private static native java.lang.Exception __call2035100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2035101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2035102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2035103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2035104_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_69862bedc753b96d0e3f(net.minecraft.client.renderer.texture.ITextureObject a0) throws E;
private static final class __SourceHandler_69862bedc753b96d0e3f {

public static void f934(net.minecraft.client.renderer.texture.ITextureObject p0) throws Throwable {
    int forwardValue934_22_0;
    int forwardValue934_43_0;
    int forwardValue934_51_0;
    int forwardValue934_51_1;
    int spill934_0;
    int spill934_1;
    int spill934_2;
    int spill934_3;
    int spill934_4;
    long life1_3;
    int life4_7;
    int life3_8;
    int life5_28;
    int life6_30;
    forward_join_56: {
    forward_join_52: {
    forward_join_51: {
    forward_join_44: {
    forward_join_43: {
    forward_join_40: {
    forward_join_22: {
    life1_3 = (__fieldRead934_0() ^ 66907997305804L);
    spill934_0 = __call934_1();
    life4_7 = __call934_2(p0);
    life3_8 = spill934_0;
    __call934_4(__call934_3(p0));
    spill934_1 = __call934_5();
    if (!((life3_8 != 0))) {
        forwardValue934_22_0 = spill934_1;
        break forward_join_22;
    }
    if (!((spill934_1 == __invokedynamic934_6(19986, (1861270641325440823L ^ life1_3))))) {
        break forward_join_56;
    }
    forwardValue934_22_0 = __fieldRead934_7();
    }
    life5_28 = forwardValue934_22_0;
    life6_30 = __fieldRead934_8();
    spill934_2 = __instanceOf934_9(p0);
    if (!((life3_8 != 0))) {
        forwardValue934_43_0 = spill934_2;
        break forward_join_43;
    }
    if (!((spill934_2 != 0))) {
        break forward_join_40;
    }
    __fieldWrite934_12(__fieldRead934_11(__cast934_10(p0)));
    __fieldWrite934_15(__fieldRead934_14(__cast934_13(p0)));
    if (!((life3_8 == 0))) {
        break forward_join_44;
    }
    }
    __fieldWrite934_16(0);
    forwardValue934_43_0 = 0;
    }
    __fieldWrite934_17(forwardValue934_43_0);
    }
    spill934_3 = __fieldRead934_18();
    spill934_4 = life5_28;
    if (!((life3_8 != 0))) {
        forwardValue934_51_0 = spill934_3;
        forwardValue934_51_1 = spill934_4;
        break forward_join_51;
    }
    if (!((spill934_3 == spill934_4))) {
        break forward_join_52;
    }
    forwardValue934_51_0 = __fieldRead934_19();
    forwardValue934_51_1 = life6_30;
    }
    if (!((forwardValue934_51_0 != forwardValue934_51_1))) {
        break forward_join_56;
    }
    }
    __call934_23(__fieldRead934_20(), __fieldRead934_21(), __fieldRead934_22());
    }
    return;
}
public static void h934_0(moom.Oo p0) throws Throwable {
    throw __call1093400_0(p0);
}
public static void h934_1(moom.Oo p0) throws Throwable {
    throw __call1093401_0(p0);
}
public static void h934_2(moom.Oo p0) throws Throwable {
    throw __call1093402_0(p0);
}
public static void h934_3(moom.Oo p0) throws Throwable {
    throw __call1093403_0(p0);
}
public static void h934_4(moom.Oo p0) throws Throwable {
    throw __call1093404_0(p0);
}
public static void h934_5(moom.Oo p0) throws Throwable {
    throw __call1093405_0(p0);
}
public static void h934_6(moom.Oo p0) throws Throwable {
    throw __call1093406_0(p0);
}
public static void h934_7(moom.Oo p0) throws Throwable {
    throw __call1093407_0(p0);
}
private static native long __fieldRead934_0() throws Throwable;
private static native int __call934_1() throws Throwable;
private static native int __call934_2(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native moom.MA __call934_3(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __call934_4(moom.MA a0) throws Throwable;
private static native int __call934_5() throws Throwable;
private static native int __invokedynamic934_6(int a0, long a1) throws Throwable;
private static native int __fieldRead934_7() throws Throwable;
private static native int __fieldRead934_8() throws Throwable;
private static native int __instanceOf934_9(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __cast934_10(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native int __fieldRead934_11(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite934_12(int a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __cast934_13(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native int __fieldRead934_14(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __fieldWrite934_15(int a0) throws Throwable;
private static native void __fieldWrite934_16(int a0) throws Throwable;
private static native void __fieldWrite934_17(int a0) throws Throwable;
private static native int __fieldRead934_18() throws Throwable;
private static native int __fieldRead934_19() throws Throwable;
private static native moom.Nu __fieldRead934_20() throws Throwable;
private static native int __fieldRead934_21() throws Throwable;
private static native int __fieldRead934_22() throws Throwable;
private static native void __call934_23(moom.Nu a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1093400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093407_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[][] __sourceHandlerCall_a9463e3aaf679baf5091(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int a2, int a3, int a4, boolean a5, int a6) throws E;
private static final class __SourceHandler_a9463e3aaf679baf5091 {

public static int[][] f900157(net.minecraft.client.renderer.texture.TextureMap p0, java.lang.String p1, int p2, int p3, int p4, boolean p5, int p6) throws Throwable {
    java.awt.image.BufferedImage forestValue900157_36_0;
    int forestValue900157_51_0;
    int forestValue900157_51_1;
    int forestValue900157_52_0;
    int forestValue900157_53_0;
    int forestValue900157_53_1;
    int forestValue900157_71_0;
    int forestValue900157_84_0;
    int spill900157_0;
    net.minecraft.client.renderer.texture.TextureMap spill900157_1;
    moom.DD spill900157_2;
    java.awt.image.BufferedImage spill900157_3;
    int spill900157_4;
    boolean spill900157_5;
    int spill900157_6;
    long life7_3;
    moom.MA life10_7;
    int life9_8;
    int[][] life11_11;
    int[] life12_19;
    int life13_22;
    java.awt.image.BufferedImage life14_30;
    int life15_38;
    int life16_41;
    int[][] life11_92;
    forest_join_84: {
    forest_join_77: {
    forest_join_71: {
    forest_join_70: {
    forest_join_53: {
    forest_join_52: {
    forest_join_51: {
    forest_join_36: {
    life7_3 = (__fieldRead900157_0() ^ 80235216589345L);
    spill900157_0 = __call900157_1();
    life10_7 = __fieldRead900157_2(p0);
    life9_8 = spill900157_0;
    life11_11 = new int[p4][];
    (life11_11)[0] = (life12_19 = new int[(p2 * p3)]);
    life13_22 = 0;
    spill900157_1 = p0;
    moom.DD __stackOp900157_4_0 = __sourceUninitializedNEW900157_3();
    spill900157_2 = __stackOp900157_4_0;
    __explicitNewInit900157_5(__stackOp900157_4_0, p1);
    life14_30 = __call900157_7(__call900157_6(spill900157_1, spill900157_2));
    spill900157_3 = life14_30;
    if (!((life9_8 == 0))) {
        forestValue900157_36_0 = spill900157_3;
        break forest_join_36;
    }
    if (!((spill900157_3 != null))) {
        break forest_join_70;
    }
    forestValue900157_36_0 = life14_30;
    }
    life15_38 = __call900157_8(forestValue900157_36_0);
    life16_41 = __call900157_9(life14_30);
    spill900157_4 = life15_38;
    spill900157_5 = p5;
    if (!((life9_8 == 0))) {
        forestValue900157_51_0 = spill900157_4;
        forestValue900157_51_1 = __integerCategory900157_10(spill900157_5);
        break forest_join_51;
    }
    if (!(spill900157_5)) {
        forestValue900157_52_0 = spill900157_4;
        break forest_join_52;
    }
    forestValue900157_51_0 = spill900157_4;
    forestValue900157_51_1 = __invokedynamic900157_11(24787, (6048276871492368391L ^ life7_3));
    }
    forestValue900157_53_0 = forestValue900157_51_0;
    forestValue900157_53_1 = forestValue900157_51_1;
    break forest_join_53;
    }
    forestValue900157_53_0 = forestValue900157_52_0;
    forestValue900157_53_1 = 0;
    }
    spill900157_6 = (forestValue900157_53_0 + forestValue900157_53_1);
    if (!((life9_8 == 0))) {
        forestValue900157_71_0 = spill900157_6;
        break forest_join_71;
    }
    if (!((spill900157_6 == p2))) {
        break forest_join_70;
    }
    life13_22 = 1;
    __call900157_12(life14_30, 0, 0, life15_38, life15_38, life12_19, 0, life15_38);
    }
    forestValue900157_71_0 = life13_22;
    }
    if (!((life9_8 == 0))) {
        forestValue900157_84_0 = forestValue900157_71_0;
        break forest_join_84;
    }
    if (!((forestValue900157_71_0 == 0))) {
        break forest_join_77;
    }
    __call900157_13(life12_19, p6);
    }
    __call900157_15(__fieldRead900157_14(life10_7));
    forestValue900157_84_0 = ((life11_11).length - 1);
    }
    life11_92 = __call900157_16(forestValue900157_84_0, p2, life11_11);
    return life11_92;
}
public static int[][] h900157_0(moom.Oo p0) throws Throwable {
    throw __call93015700_0(p0);
}
public static int[][] h900157_1(moom.Oo p0) throws Throwable {
    throw __call93015701_0(p0);
}
public static int[][] h900157_2(moom.Oo p0) throws Throwable {
    throw __call93015702_0(p0);
}
public static int[][] h900157_3(moom.Oo p0) throws Throwable {
    throw __call93015703_0(p0);
}
public static int[][] h900157_4(moom.Oo p0) throws Throwable {
    throw __call93015704_0(p0);
}
private static native long __fieldRead900157_0() throws Throwable;
private static native int __call900157_1() throws Throwable;
private static native moom.MA __fieldRead900157_2(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native moom.DD __sourceUninitializedNEW900157_3() throws Throwable;
private static native void __explicitNewInit900157_5(moom.DD a0, java.lang.String a1) throws Throwable;
private static native moom.DD __call900157_6(net.minecraft.client.renderer.texture.TextureMap a0, moom.DD a1) throws Throwable;
private static native java.awt.image.BufferedImage __call900157_7(moom.DD a0) throws Throwable;
private static native int __call900157_8(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call900157_9(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __integerCategory900157_10(boolean value) throws Throwable;
private static native int __invokedynamic900157_11(int a0, long a1) throws Throwable;
private static native int[] __call900157_12(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native void __call900157_13(int[] a0, int a1) throws Throwable;
private static native int __fieldRead900157_14(moom.MA a0) throws Throwable;
private static native void __call900157_15(int a0) throws Throwable;
private static native int[][] __call900157_16(int a0, int a1, int[][] a2) throws Throwable;
private static native java.lang.Exception __call93015700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call93015701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call93015702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call93015703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call93015704_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_62e62af15fc0d487f94e(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int[][] a2, int a3, int a4, int a5, int a6, boolean a7, boolean a8) throws E;
private static final class __SourceHandler_62e62af15fc0d487f94e {

public static void f936(net.minecraft.client.renderer.texture.TextureMap p0, java.lang.String p1, int[][] p2, int p3, int p4, int p5, int p6, boolean p7, boolean p8) throws Throwable {
    int forwardValue936_55_0;
    int forwardValue936_87_0;
    int spill936_0;
    boolean spill936_1;
    long life9_3;
    moom.MA life12_7;
    int life11_16;
    int life13_18;
    int[][] life14_45;
    int[][] life14_79;
    forward_join_87: {
    forward_join_85: {
    forward_join_55: {
    forward_join_54: {
    life9_3 = (__fieldRead936_0() ^ 94765713591273L);
    spill936_0 = __call936_1();
    life12_7 = __fieldRead936_2(p0);
    __call936_3(p2, p3, p4, p5, p6, p7, p8);
    life11_16 = spill936_0;
    life13_18 = 0;
    spill936_1 = __fieldRead936_4();
    if (!((life11_16 == 0))) {
        forwardValue936_55_0 = __integerCategory936_5(spill936_1);
        break forward_join_55;
    }
    if (!(spill936_1)) {
        break forward_join_54;
    }
    life14_45 = __call936_9(p0, __invokedynamic936_7(p1, __invokedynamic936_6(25563, (4134295903116933094L ^ life9_3))), p3, p4, (p2).length, life13_18, __invokedynamic936_8(589, (6752360867305898830L ^ life9_3)));
    __call936_11(__fieldRead936_10(life12_7));
    __call936_12(life14_45, p3, p4, p5, p6, p7, p8);
    }
    forwardValue936_55_0 = __integerCategory936_14(__fieldRead936_13());
    }
    if (!((life11_16 == 0))) {
        forwardValue936_87_0 = forwardValue936_55_0;
        break forward_join_87;
    }
    if (!((forwardValue936_55_0 != 0))) {
        break forward_join_85;
    }
    life14_79 = __call936_17(p0, __invokedynamic936_16(p1, __invokedynamic936_15(19720, (7362747931988236592L ^ life9_3))), p3, p4, (p2).length, life13_18, 0);
    __call936_19(__fieldRead936_18(life12_7));
    __call936_20(life14_79, p3, p4, p5, p6, p7, p8);
    }
    forwardValue936_87_0 = __fieldRead936_21(life12_7);
    }
    __call936_22(forwardValue936_87_0);
    return;
}
public static void h936_0(moom.Oo p0) throws Throwable {
    throw __call1093600_0(p0);
}
public static void h936_1(moom.Oo p0) throws Throwable {
    throw __call1093601_0(p0);
}
private static native long __fieldRead936_0() throws Throwable;
private static native int __call936_1() throws Throwable;
private static native moom.MA __fieldRead936_2(net.minecraft.client.renderer.texture.TextureMap a0) throws Throwable;
private static native void __call936_3(int[][] a0, int a1, int a2, int a3, int a4, boolean a5, boolean a6) throws Throwable;
private static native boolean __fieldRead936_4() throws Throwable;
private static native int __integerCategory936_5(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic936_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic936_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic936_8(int a0, long a1) throws Throwable;
private static native int[][] __call936_9(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __fieldRead936_10(moom.MA a0) throws Throwable;
private static native void __call936_11(int a0) throws Throwable;
private static native void __call936_12(int[][] a0, int a1, int a2, int a3, int a4, boolean a5, boolean a6) throws Throwable;
private static native boolean __fieldRead936_13() throws Throwable;
private static native int __integerCategory936_14(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic936_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic936_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int[][] __call936_17(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __fieldRead936_18(moom.MA a0) throws Throwable;
private static native void __call936_19(int a0) throws Throwable;
private static native void __call936_20(int[][] a0, int a1, int a2, int a3, int a4, boolean a5, boolean a6) throws Throwable;
private static native int __fieldRead936_21(moom.MA a0) throws Throwable;
private static native void __call936_22(int a0) throws Throwable;
private static native java.lang.Exception __call1093600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_fc7cd85abbd67e573283(int[] a0, int a1, int a2) throws E;
private static final class __SourceHandler_fc7cd85abbd67e573283 {

public static boolean f937(int[] p0, int p1, int p2) throws Throwable {
    int lexicalValue937_38_0;
    int lexicalValue937_68_0;
    int lexicalValue937_73_0;
    int spill937_0;
    int spill937_1;
    int spill937_2;
    int spill937_3;
    int spill937_4;
    long life3_3;
    int life6_8;
    int life5_9;
    int life7_49;
    int life8_62;
    lexical_join_73: {
    lexical_join_72: {
    lexical_join_38: {
    lexical_join_37: {
    life3_3 = (__fieldRead937_0() ^ 114676804525959L);
    spill937_0 = __call937_1();
    life6_8 = (p1 * p2);
    life5_9 = spill937_0;
    spill937_1 = ((p0)[0] >>> __invokedynamic937_2(21702, (4852837053419684227L ^ life3_3)));
    if (!((life5_9 != 0))) {
        lexicalValue937_38_0 = spill937_1;
        break lexical_join_38;
    }
    if (!((spill937_1 == __invokedynamic937_3(28828, (5513498322210235873L ^ life3_3))))) {
        break lexical_join_37;
    }
    spill937_2 = (p0)[(life6_8 - 1)];
    if (!((life5_9 != 0))) {
        lexicalValue937_38_0 = spill937_2;
        break lexical_join_38;
    }
    if (!((spill937_2 == 0))) {
        break lexical_join_37;
    }
    return __integerCategory937_4(1);
    }
    lexicalValue937_38_0 = 0;
    }
    life7_49 = lexicalValue937_38_0;
    lexical_cycle_39: while (true) {
    lexical_join_70: {
    lexical_join_69: {
    lexical_join_68: {
    if (!((life7_49 < life6_8))) {
        break lexical_join_72;
    }
    life8_62 = ((p0)[life7_49] >>> __invokedynamic937_5(21702, (4852837053419684227L ^ life3_3)));
    if (!((life5_9 != 0))) {
        break lexical_join_70;
    }
    spill937_3 = life8_62;
    if (!((life5_9 != 0))) {
        lexicalValue937_73_0 = spill937_3;
        break lexical_join_73;
    }
    if (!((spill937_3 != 0))) {
        break lexical_join_69;
    }
    spill937_4 = life8_62;
    if (!((life5_9 != 0))) {
        lexicalValue937_68_0 = spill937_4;
        break lexical_join_68;
    }
    if (!((spill937_4 != __invokedynamic937_6(28828, (5513498322210235873L ^ life3_3))))) {
        break lexical_join_69;
    }
    lexicalValue937_68_0 = 1;
    }
    return __integerCategory937_7(lexicalValue937_68_0);
    }
    life7_49 += 1;
    }
    if (!((life5_9 == 0))) { continue lexical_cycle_39; }
    break lexical_cycle_39;
    }
    }
    lexicalValue937_73_0 = 0;
    }
    return __integerCategory937_8(lexicalValue937_73_0);
}
public static void h937_0(moom.Oo p0) throws Throwable {
    throw __call1093700_0(p0);
}
public static void h937_1(moom.Oo p0) throws Throwable {
    throw __call1093701_0(p0);
}
public static void h937_2(moom.Oo p0) throws Throwable {
    throw __call1093702_0(p0);
}
public static void h937_3(moom.Oo p0) throws Throwable {
    throw __call1093703_0(p0);
}
public static void h937_4(moom.Oo p0) throws Throwable {
    throw __call1093704_0(p0);
}
public static void h937_5(moom.Oo p0) throws Throwable {
    throw __call1093705_0(p0);
}
public static void h937_6(moom.Oo p0) throws Throwable {
    throw __call1093706_0(p0);
}
public static void h937_7(moom.Oo p0) throws Throwable {
    throw __call1093707_0(p0);
}
public static void h937_8(moom.Oo p0) throws Throwable {
    throw __call1093708_0(p0);
}
private static native long __fieldRead937_0() throws Throwable;
private static native int __call937_1() throws Throwable;
private static native int __invokedynamic937_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic937_3(int a0, long a1) throws Throwable;
private static native boolean __integerCategory937_4(int value) throws Throwable;
private static native int __invokedynamic937_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic937_6(int a0, long a1) throws Throwable;
private static native boolean __integerCategory937_7(int value) throws Throwable;
private static native boolean __integerCategory937_8(int value) throws Throwable;
private static native java.lang.Exception __call1093700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093707_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1093708_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2e97a6867a3138963d49(int[] a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_2e97a6867a3138963d49 {

public static void f789(int[] p0, int p1, int p2, int p3) throws Throwable {
    int forestValue789_130_0;
    int forestValue789_155_0;
    int[] forestValue789_174_0;
    int forestValue789_174_1;
    int forestValue789_204_0;
    int forestValue789_208_0;
    int forestValue789_229_0;
    int[] forestValue789_248_0;
    int forestValue789_248_1;
    int forestValue789_278_0;
    int forestValue789_285_0;
    int forestValue789_285_1;
    int forestValue789_292_0;
    int[] forestValue789_311_0;
    int forestValue789_311_1;
    int forestValue789_341_0;
    int spill789_0;
    int spill789_1;
    int spill789_2;
    int spill789_3;
    int spill789_4;
    int[] spill789_5;
    int spill789_6;
    int spill789_7;
    int spill789_8;
    int[] spill789_9;
    int spill789_10;
    int spill789_11;
    int spill789_12;
    int spill789_13;
    int[] spill789_14;
    int spill789_15;
    int spill789_16;
    int spill789_17;
    int spill789_18;
    long life4_3;
    int life7_10;
    int life8_12;
    int life9_14;
    int life10_16;
    int life11_18;
    int life12_20;
    int life6_21;
    int life13_23;
    int life12_54;
    int life14_56;
    int life15_67;
    int life16_75;
    int life17_80;
    int life8_160;
    int life9_164;
    int life7_171;
    int life14_173;
    int life15_175;
    int life16_186;
    int life8_251;
    int life9_255;
    int life7_262;
    int life14_264;
    int life15_266;
    int life16_277;
    int life7_340;
    int life14_342;
    int life15_344;
    int life16_355;
    forest_join_361: {
    forest_join_285: {
    forest_join_284: {
    forest_join_208: {
    forest_join_133: {
    life4_3 = (__fieldRead789_0() ^ 94476224083232L);
    spill789_0 = __call789_1();
    __call789_2(p2, p3);
    life7_10 = p1;
    life8_12 = p2;
    life9_14 = p3;
    life10_16 = 0;
    life11_18 = 0;
    life12_20 = 0;
    life6_21 = spill789_0;
    life13_23 = 0;
    forest_cycle_24: while (true) {
    forest_join_130: {
    forest_join_124: {
    if (!((life8_12 > 1))) {
        break forest_join_133;
    }
    spill789_1 = life9_14;
    if (!((life6_21 == 0))) {
        forestValue789_208_0 = spill789_1;
        break forest_join_208;
    }
    spill789_2 = 1;
    if (!((life6_21 == 0))) {
        forestValue789_285_0 = spill789_1;
        forestValue789_285_1 = spill789_2;
        break forest_join_285;
    }
    if (!((spill789_1 > spill789_2))) {
        break forest_join_133;
    }
    life10_16 = (life7_10 + (life8_12 * life9_14));
    life11_18 = (life8_12 / 2);
    life12_54 = (life9_14 / 2);
    life14_56 = 0;
    forest_cycle_50: while (true) {
    forest_join_122: {
    forest_join_121: {
    if (!((life14_56 < life12_54))) {
        break forest_join_124;
    }
    life15_67 = (life10_16 + (life14_56 * life11_18));
    life16_75 = (life7_10 + ((life14_56 * 2) * life8_12));
    spill789_3 = 0;
    if (!((life6_21 == 0))) {
        forestValue789_130_0 = spill789_3;
        break forest_join_130;
    }
    life17_80 = spill789_3;
    forest_cycle_71: while (true) {
    if (!((life17_80 < life11_18))) {
        break forest_join_121;
    }
    (p0)[(life15_67 + life17_80)] = __call789_3((p0)[(life16_75 + (life17_80 * 2))], (p0)[((life16_75 + (life17_80 * 2)) + 1)], (p0)[((life16_75 + life8_12) + (life17_80 * 2))], (p0)[(((life16_75 + life8_12) + (life17_80 * 2)) + 1)]);
    life17_80 += 1;
    if (!((life6_21 == 0))) {
        break forest_join_122;
    }
    if (!((life6_21 != 0))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    }
    life14_56 += 1;
    }
    if (!((life6_21 != 0))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    life13_23 += 1;
    life8_12 = life11_18;
    life9_14 = life12_54;
    forestValue789_130_0 = life10_16;
    }
    life7_10 = forestValue789_130_0;
    if (!((life6_21 != 0))) {
        continue forest_cycle_24;
    }
    break forest_cycle_24;
    }
    }
    forest_cycle_133: while (true) {
    forest_join_204: {
    forest_join_201: {
    if (!((life13_23 > 0))) {
        break forest_join_361;
    }
    life13_23 += -1;
    life8_160 = (p2 >> life13_23);
    life9_164 = (p3 >> life13_23);
    life7_171 = (life10_16 - (life8_160 * life9_164));
    life14_173 = life7_171;
    life15_175 = 0;
    forest_cycle_154: while (true) {
    forest_join_198: {
    forestValue789_155_0 = life15_175;
    forest_cycle_155: while (true) {
    if (!((forestValue789_155_0 < life9_164))) {
        break forest_join_201;
    }
    spill789_4 = 0;
    if (!((life6_21 == 0))) {
        forestValue789_204_0 = spill789_4;
        break forest_join_204;
    }
    life16_186 = spill789_4;
    forest_cycle_161: while (true) {
    forest_join_194: {
    forest_join_174: {
    if (!((life16_186 < life8_160))) {
        break forest_join_198;
    }
    spill789_5 = p0;
    spill789_6 = life14_173;
    if (!((life6_21 == 0))) {
        forestValue789_174_0 = spill789_5;
        forestValue789_174_1 = spill789_6;
        break forest_join_174;
    }
    spill789_7 = (spill789_5)[spill789_6];
    if (!((life6_21 == 0))) {
        forestValue789_155_0 = spill789_7;
        continue forest_cycle_155;
    }
    if (!((spill789_7 == 0))) {
        break forest_join_194;
    }
    forestValue789_174_0 = p0;
    forestValue789_174_1 = life14_173;
    }
    (forestValue789_174_0)[forestValue789_174_1] = ((p0)[((life10_16 + ((life15_175 / 2) * life11_18)) + (life16_186 / 2))] & __invokedynamic789_4(19015, (2504109580224411019L ^ life4_3)));
    }
    life14_173 += 1;
    life16_186 += 1;
    if (!((life6_21 != 0))) {
        continue forest_cycle_161;
    }
    break forest_cycle_161;
    }
    break forest_cycle_155;
    }
    }
    life15_175 += 1;
    if (!((life6_21 != 0))) {
        continue forest_cycle_154;
    }
    break forest_cycle_154;
    }
    }
    life10_16 = life7_171;
    forestValue789_204_0 = life8_160;
    }
    life11_18 = forestValue789_204_0;
    if (!((life6_21 != 0))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    break forest_join_361;
    }
    forest_cycle_208: while (true) {
    forest_join_282: {
    forest_join_278: {
    forest_join_275: {
    if (!((forestValue789_208_0 > 0))) {
        break forest_join_361;
    }
    life13_23 += -1;
    life8_251 = (p2 >> life13_23);
    life9_255 = (p3 >> life13_23);
    life7_262 = (life10_16 - (life8_251 * life9_255));
    life14_264 = life7_262;
    life15_266 = 0;
    forest_cycle_228: while (true) {
    forest_join_272: {
    forestValue789_229_0 = life15_266;
    forest_cycle_229: while (true) {
    if (!((forestValue789_229_0 < life9_255))) {
        break forest_join_275;
    }
    spill789_8 = 0;
    if (!((life6_21 == 0))) {
        forestValue789_278_0 = spill789_8;
        break forest_join_278;
    }
    life16_277 = spill789_8;
    forest_cycle_235: while (true) {
    forest_join_268: {
    forest_join_248: {
    if (!((life16_277 < life8_251))) {
        break forest_join_272;
    }
    spill789_9 = p0;
    spill789_10 = life14_264;
    if (!((life6_21 == 0))) {
        forestValue789_248_0 = spill789_9;
        forestValue789_248_1 = spill789_10;
        break forest_join_248;
    }
    spill789_11 = (spill789_9)[spill789_10];
    if (!((life6_21 == 0))) {
        forestValue789_229_0 = spill789_11;
        continue forest_cycle_229;
    }
    if (!((spill789_11 == 0))) {
        break forest_join_268;
    }
    forestValue789_248_0 = p0;
    forestValue789_248_1 = life14_264;
    }
    (forestValue789_248_0)[forestValue789_248_1] = ((p0)[((life10_16 + ((life15_266 / 2) * life11_18)) + (life16_277 / 2))] & __invokedynamic789_5(19015, (2504109580224411019L ^ life4_3)));
    }
    life14_264 += 1;
    life16_277 += 1;
    if (!((life6_21 != 0))) {
        continue forest_cycle_235;
    }
    break forest_cycle_235;
    }
    break forest_cycle_229;
    }
    }
    life15_266 += 1;
    if (!((life6_21 != 0))) {
        continue forest_cycle_228;
    }
    break forest_cycle_228;
    }
    }
    life10_16 = life7_262;
    forestValue789_278_0 = life8_251;
    }
    life11_18 = forestValue789_278_0;
    if (!((life6_21 != 0))) {
        break forest_join_282;
    }
    break forest_join_284;
    }
    spill789_12 = life13_23;
    forestValue789_208_0 = spill789_12;
    continue forest_cycle_208;
    }
    }
    break forest_join_361;
    }
    forest_cycle_285: while (true) {
    forest_join_345: {
    forest_join_341: {
    forest_join_338: {
    life7_340 = (forestValue789_285_0 - forestValue789_285_1);
    life14_342 = life7_340;
    life15_344 = 0;
    forest_cycle_291: while (true) {
    forest_join_335: {
    forestValue789_292_0 = life15_344;
    forest_cycle_292: while (true) {
    if (!((forestValue789_292_0 < life9_14))) {
        break forest_join_338;
    }
    spill789_13 = 0;
    if (!((life6_21 == 0))) {
        forestValue789_341_0 = spill789_13;
        break forest_join_341;
    }
    life16_355 = spill789_13;
    forest_cycle_298: while (true) {
    forest_join_331: {
    forest_join_311: {
    if (!((life16_355 < life8_12))) {
        break forest_join_335;
    }
    spill789_14 = p0;
    spill789_15 = life14_342;
    if (!((life6_21 == 0))) {
        forestValue789_311_0 = spill789_14;
        forestValue789_311_1 = spill789_15;
        break forest_join_311;
    }
    spill789_16 = (spill789_14)[spill789_15];
    if (!((life6_21 == 0))) {
        forestValue789_292_0 = spill789_16;
        continue forest_cycle_292;
    }
    if (!((spill789_16 == 0))) {
        break forest_join_331;
    }
    forestValue789_311_0 = p0;
    forestValue789_311_1 = life14_342;
    }
    (forestValue789_311_0)[forestValue789_311_1] = ((p0)[((life10_16 + ((life15_344 / 2) * life11_18)) + (life16_355 / 2))] & __invokedynamic789_6(19015, (2504109580224411019L ^ life4_3)));
    }
    life14_342 += 1;
    life16_355 += 1;
    if (!((life6_21 != 0))) {
        continue forest_cycle_298;
    }
    break forest_cycle_298;
    }
    break forest_cycle_292;
    }
    }
    life15_344 += 1;
    if (!((life6_21 != 0))) {
        continue forest_cycle_291;
    }
    break forest_cycle_291;
    }
    }
    life10_16 = life7_340;
    forestValue789_341_0 = life8_12;
    }
    life11_18 = forestValue789_341_0;
    if (!((life6_21 != 0))) {
        break forest_join_345;
    }
    break forest_join_361;
    }
    if (!((life13_23 > 0))) {
        break forest_join_361;
    }
    life13_23 += -1;
    life8_12 = (p2 >> life13_23);
    life9_14 = (p3 >> life13_23);
    spill789_17 = life10_16;
    spill789_18 = (life8_12 * life9_14);
    forestValue789_285_0 = spill789_17;
    forestValue789_285_1 = spill789_18;
    continue forest_cycle_285;
    }
    }
    return;
}
public static void h789_0(moom.Oo p0) throws Throwable {
    throw __call3078900_0(p0);
}
public static void h789_1(moom.Oo p0) throws Throwable {
    throw __call3078901_0(p0);
}
public static void h789_2(moom.Oo p0) throws Throwable {
    throw __call3078902_0(p0);
}
public static void h789_3(moom.Oo p0) throws Throwable {
    throw __call3078903_0(p0);
}
public static void h789_4(moom.Oo p0) throws Throwable {
    throw __call3078904_0(p0);
}
private static native long __fieldRead789_0() throws Throwable;
private static native int __call789_1() throws Throwable;
private static native int __call789_2(int a0, int a1) throws Throwable;
private static native int __call789_3(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic789_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic789_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic789_6(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3078900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078904_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1d8c87471a9d1bbe7448(int[] a0, int a1, int a2, int a3, int a4) throws E;
private static final class __SourceHandler_1d8c87471a9d1bbe7448 {

public static void f939(int[] p0, int p1, int p2, int p3, int p4) throws Throwable {
    int lexicalValue939_51_0;
    int spill939_0;
    int spill939_1;
    long life5_3;
    int life8_5;
    int life9_8;
    int life7_9;
    int life10_11;
    int life11_13;
    int life12_15;
    lexical_join_54: {
    life5_3 = (__fieldRead939_0() ^ 106781451851358L);
    life8_5 = 0;
    spill939_0 = __call939_1();
    life9_8 = p1;
    life7_9 = spill939_0;
    life10_11 = p2;
    life11_13 = p3;
    life12_15 = p4;
    lexical_cycle_16: while (true) {
    lexical_join_51: {
    if (!((life9_8 > 0))) {
        break lexical_join_54;
    }
    spill939_1 = life10_11;
    if (!((life7_9 == 0))) {
        lexicalValue939_51_0 = spill939_1;
        break lexical_join_51;
    }
    if (!((spill939_1 > 0))) {
        break lexical_join_54;
    }
    __call939_3(__invokedynamic939_2(23901, (3287163246532657634L ^ life5_3)), life8_5, life11_13, life12_15, 0, 0, life9_8, life10_11);
    life8_5 += 1;
    life9_8 = (life9_8 / 2);
    life10_11 = (life10_11 / 2);
    life11_13 = (life11_13 / 2);
    lexicalValue939_51_0 = (life12_15 / 2);
    }
    life12_15 = lexicalValue939_51_0;
    if (!((life7_9 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}
public static void h939_0(moom.Oo p0) throws Throwable {
    throw __call1093900_0(p0);
}
private static native long __fieldRead939_0() throws Throwable;
private static native int __call939_1() throws Throwable;
private static native int __invokedynamic939_2(int a0, long a1) throws Throwable;
private static native void __call939_3(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7) throws Throwable;
private static native java.lang.Exception __call1093900_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_86fabd031e87e6cf47a3(int[] a0, int a1, int a2, int a3, int a4, int a5) throws E;
private static final class __SourceHandler_86fabd031e87e6cf47a3 {

public static void f940(int[] p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {
    int forwardValue940_44_0;
    int forwardValue940_44_1;
    int spill940_0;
    int spill940_1;
    int spill940_2;
    long life6_3;
    int life9_8;
    java.nio.IntBuffer life10_11;
    int life11_18;
    int life8_19;
    forward_join_63: {
    forward_join_44: {
    life6_3 = (__fieldRead940_0() ^ 119985659779029L);
    spill940_0 = __call940_1();
    life9_8 = (p1 * p2);
    life10_11 = __call940_2(life9_8);
    __call940_3(life10_11);
    life11_18 = (p5 * life9_8);
    life8_19 = spill940_0;
    spill940_1 = (p0).length;
    spill940_2 = (life11_18 + life9_8);
    if (!((life8_19 == 0))) {
        forwardValue940_44_0 = spill940_1;
        forwardValue940_44_1 = spill940_2;
        break forward_join_44;
    }
    if (!((spill940_1 >= spill940_2))) {
        break forward_join_63;
    }
    __call940_6(__call940_5(__call940_4(life10_11, p0, life11_18, life9_8), 0), life9_8);
    forwardValue940_44_0 = __invokedynamic940_7(17655, (6163668748804200929L ^ life6_3));
    forwardValue940_44_1 = 0;
    }
    __call940_10(forwardValue940_44_0, forwardValue940_44_1, p3, p4, p1, p2, __invokedynamic940_8(5867, (3463726223187495893L ^ life6_3)), __invokedynamic940_9(7465, (2885236492479676436L ^ life6_3)), life10_11);
    __call940_11(life10_11);
    }
    return;
}
public static void h940_0(moom.Oo p0) throws Throwable {
    throw __call1094000_0(p0);
}
public static void h940_1(moom.Oo p0) throws Throwable {
    throw __call1094001_0(p0);
}
private static native long __fieldRead940_0() throws Throwable;
private static native int __call940_1() throws Throwable;
private static native java.nio.IntBuffer __call940_2(int a0) throws Throwable;
private static native java.nio.IntBuffer __call940_3(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __call940_4(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call940_5(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call940_6(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __invokedynamic940_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic940_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic940_9(int a0, long a1) throws Throwable;
private static native void __call940_10(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native java.nio.IntBuffer __call940_11(java.nio.IntBuffer a0) throws Throwable;
private static native java.lang.Exception __call1094000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[][] __sourceHandlerCall_5a94c0d6b15e94ffe6fe(int[][] a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_5a94c0d6b15e94ffe6fe {

public static int[][] f941(int[][] p0, int p1, int p2, int p3) throws Throwable {
    int[][] lexicalValue941_93_0;
    int spill941_0;
    int[][] spill941_1;
    long life4_3;
    int life7_6;
    int[][] life8_9;
    int life9_12;
    int life6_13;
    int[] life10_22;
    int life11_37;
    int[] life12_42;
    int life13_51;
    int life14_55;
    int life15_57;
    int life14_67;
    int life15_71;
    int life14_81;
    int life15_85;
    lexical_join_93: {
    lexical_join_92: {
    life4_3 = (__fieldRead941_0() ^ 43042430510194L);
    life7_6 = (p0).length;
    life8_9 = new int[life7_6][];
    spill941_0 = __call941_1();
    life9_12 = 0;
    life6_13 = spill941_0;
    lexical_cycle_14: while (true) {
    lexical_join_90: {
    lexical_join_89: {
    if (!((life9_12 < life7_6))) {
        break lexical_join_92;
    }
    spill941_1 = p0;
    if (!((life6_13 == 0))) {
        lexicalValue941_93_0 = spill941_1;
        break lexical_join_93;
    }
    life10_22 = (spill941_1)[life9_12];
    if (!((life6_13 == 0))) {
        break lexical_join_90;
    }
    if (!((life10_22 != null))) {
        break lexical_join_89;
    }
    life11_37 = ((p1 >> life9_12) * (p2 >> life9_12));
    life12_42 = new int[(life11_37 * 3)];
    (life8_9)[life9_12] = life12_42;
    life13_51 = ((life10_22).length / 3);
    life14_55 = (life11_37 * p3);
    life15_57 = 0;
    __call941_2(life10_22, life14_55, life12_42, life15_57, life11_37);
    life14_67 = (life14_55 + life13_51);
    life15_71 = (life15_57 + life11_37);
    __call941_3(life10_22, life14_67, life12_42, life15_71, life11_37);
    life14_81 = (life14_67 + life13_51);
    life15_85 = (life15_71 + life11_37);
    __call941_4(life10_22, life14_81, life12_42, life15_85, life11_37);
    }
    life9_12 += 1;
    }
    if (!((life6_13 != 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue941_93_0 = life8_9;
    }
    return lexicalValue941_93_0;
}
public static void h941_0(moom.Oo p0) throws Throwable {
    throw __call1094100_0(p0);
}
private static native long __fieldRead941_0() throws Throwable;
private static native int __call941_1() throws Throwable;
private static native void __call941_2(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native void __call941_3(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native void __call941_4(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call1094100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_96a00208868a5a029e28(int[][] a0, int a1, int a2, int a3, int a4, int a5) throws E;
private static final class __SourceHandler_96a00208868a5a029e28 {

public static void f942(int[][] p0, int p1, int p2, int p3, int p4, int p5) throws Throwable {
    int lexicalValue942_33_0;
    int lexicalValue942_39_0;
    int lexicalValue942_39_1;
    int lexicalValue942_106_0;
    int lexicalValue942_106_1;
    int spill942_0;
    int spill942_1;
    int spill942_2;
    int spill942_3;
    int spill942_4;
    long life6_3;
    int life9_7;
    java.nio.IntBuffer life10_10;
    int life11_13;
    int life12_16;
    int life13_18;
    int life8_19;
    int life14_21;
    int life15_23;
    int life16_25;
    int life17_49;
    int[] life18_53;
    lexical_join_111: {
    life6_3 = (__fieldRead942_0() ^ 95310259627723L);
    life9_7 = (p1 * p2);
    life10_10 = __call942_1(life9_7);
    life11_13 = (p0).length;
    spill942_0 = __call942_2();
    life12_16 = 0;
    life13_18 = p1;
    life8_19 = spill942_0;
    life14_21 = p2;
    life15_23 = p3;
    life16_25 = p4;
    lexical_cycle_26: while (true) {
    lexical_join_106: {
    lexical_join_92: {
    lexical_join_39: {
    lexical_join_33: {
    if (!((life13_18 > 0))) {
        break lexical_join_111;
    }
    spill942_1 = life14_21;
    if (!((life8_19 == 0))) {
        lexicalValue942_33_0 = spill942_1;
        break lexical_join_33;
    }
    if (!((spill942_1 > 0))) {
        break lexical_join_111;
    }
    lexicalValue942_33_0 = life12_16;
    }
    spill942_2 = life11_13;
    if (!((life8_19 == 0))) {
        lexicalValue942_39_0 = lexicalValue942_33_0;
        lexicalValue942_39_1 = spill942_2;
        break lexical_join_39;
    }
    if (!((lexicalValue942_33_0 < spill942_2))) {
        break lexical_join_111;
    }
    lexicalValue942_39_0 = life13_18;
    lexicalValue942_39_1 = life14_21;
    }
    life17_49 = (lexicalValue942_39_0 * lexicalValue942_39_1);
    life18_53 = (p0)[life12_16];
    __call942_3(life10_10);
    spill942_3 = (life18_53).length;
    spill942_4 = (life17_49 * (p5 + 1));
    if (!((life8_19 == 0))) {
        lexicalValue942_106_0 = spill942_3;
        lexicalValue942_106_1 = spill942_4;
        break lexical_join_106;
    }
    if (!((spill942_3 >= spill942_4))) {
        break lexical_join_92;
    }
    __call942_6(__call942_5(__call942_4(life10_10, life18_53, (life17_49 * p5), life17_49), 0), life17_49);
    __call942_10(__invokedynamic942_7(17655, (6163734218861750527L ^ life6_3)), life12_16, life15_23, life16_25, life13_18, life14_21, __invokedynamic942_8(5867, (3463720195477076683L ^ life6_3)), __invokedynamic942_9(7465, (2885207308989952266L ^ life6_3)), life10_10);
    }
    life13_18 = (life13_18 >> 1);
    life14_21 = (life14_21 >> 1);
    life15_23 = (life15_23 >> 1);
    lexicalValue942_106_0 = life16_25;
    lexicalValue942_106_1 = 1;
    }
    life16_25 = (lexicalValue942_106_0 >> lexicalValue942_106_1);
    life12_16 += 1;
    if (!((life8_19 != 0))) { continue lexical_cycle_26; }
    break lexical_cycle_26;
    }
    }
    __call942_11(life10_10);
    return;
}
public static void h942_0(moom.Oo p0) throws Throwable {
    throw __call1094200_0(p0);
}
public static void h942_1(moom.Oo p0) throws Throwable {
    throw __call1094201_0(p0);
}
public static void h942_2(moom.Oo p0) throws Throwable {
    throw __call1094202_0(p0);
}
public static void h942_3(moom.Oo p0) throws Throwable {
    throw __call1094203_0(p0);
}
public static void h942_4(moom.Oo p0) throws Throwable {
    throw __call1094204_0(p0);
}
private static native long __fieldRead942_0() throws Throwable;
private static native java.nio.IntBuffer __call942_1(int a0) throws Throwable;
private static native int __call942_2() throws Throwable;
private static native java.nio.IntBuffer __call942_3(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __call942_4(java.nio.IntBuffer a0, int[] a1, int a2, int a3) throws Throwable;
private static native java.nio.IntBuffer __call942_5(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native java.nio.IntBuffer __call942_6(java.nio.IntBuffer a0, int a1) throws Throwable;
private static native int __invokedynamic942_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic942_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic942_9(int a0, long a1) throws Throwable;
private static native void __call942_10(int a0, int a1, int a2, int a3, int a4, int a5, int a6, int a7, java.nio.IntBuffer a8) throws Throwable;
private static native java.nio.IntBuffer __call942_11(java.nio.IntBuffer a0) throws Throwable;
private static native java.lang.Exception __call1094200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094204_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_3a31fbfafbf5334cb4c3(int a0) throws E;
private static final class __SourceHandler_3a31fbfafbf5334cb4c3 {

public static int[] f943(int p0) throws Throwable {
    int[] forwardValue943_18_0;
    int[] forwardValue943_28_0;
    int[] spill943_0;
    long life1_3;
    int life3_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_18: {
    forward_join_17: {
    life1_3 = (__fieldRead943_0() ^ 65073988494459L);
    life3_5 = __call943_1();
    spill943_0 = __fieldRead943_2();
    if (!((life3_5 == 0))) {
        forwardValue943_18_0 = spill943_0;
        break forward_join_18;
    }
    if (!((spill943_0 == null))) {
        break forward_join_17;
    }
    __fieldWrite943_4(new int[__invokedynamic943_3(11631, (8317611650057831400L ^ life1_3))]);
    }
    forwardValue943_18_0 = __fieldRead943_5();
    }
    if (!((life3_5 == 0))) {
        forwardValue943_28_0 = forwardValue943_18_0;
        break forward_join_28;
    }
    if (!(((forwardValue943_18_0).length < p0))) {
        break forward_join_27;
    }
    __fieldWrite943_7(new int[__call943_6(p0)]);
    }
    forwardValue943_28_0 = __fieldRead943_8();
    }
    return forwardValue943_28_0;
}
public static void h943_0(moom.Oo p0) throws Throwable {
    throw __call1094300_0(p0);
}
public static void h943_1(moom.Oo p0) throws Throwable {
    throw __call1094301_0(p0);
}
public static void h943_2(moom.Oo p0) throws Throwable {
    throw __call1094302_0(p0);
}
public static void h943_3(moom.Oo p0) throws Throwable {
    throw __call1094303_0(p0);
}
private static native long __fieldRead943_0() throws Throwable;
private static native int __call943_1() throws Throwable;
private static native int[] __fieldRead943_2() throws Throwable;
private static native int __invokedynamic943_3(int a0, long a1) throws Throwable;
private static native void __fieldWrite943_4(int[] a0) throws Throwable;
private static native int[] __fieldRead943_5() throws Throwable;
private static native int __call943_6(int a0) throws Throwable;
private static native void __fieldWrite943_7(int[] a0) throws Throwable;
private static native int[] __fieldRead943_8() throws Throwable;
private static native java.lang.Exception __call1094300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.nio.IntBuffer __sourceHandlerCall_cf7531ab53e91fe382a1(int a0) throws E;
private static final class __SourceHandler_cf7531ab53e91fe382a1 {

public static java.nio.IntBuffer f944(int p0) throws Throwable {
    java.nio.IntBuffer forwardValue944_24_0;
    java.nio.IntBuffer spill944_0;
    long life1_3;
    int life3_5;
    int life4_17;
    forward_join_24: {
    forward_join_23: {
    life1_3 = (__fieldRead944_0() ^ 115534583195964L);
    life3_5 = __call944_1();
    spill944_0 = __fieldRead944_2();
    if (!((life3_5 != 0))) {
        forwardValue944_24_0 = spill944_0;
        break forward_join_24;
    }
    if (!((__call944_3(spill944_0) < p0))) {
        break forward_join_23;
    }
    life4_17 = __call944_4(p0);
    __fieldWrite944_6(__call944_5((life4_17 * 4)));
    __fieldWrite944_9(__call944_8(__fieldRead944_7()));
    }
    forwardValue944_24_0 = __fieldRead944_10();
    }
    return forwardValue944_24_0;
}
public static void h944_0(moom.Oo p0) throws Throwable {
    throw __call1094400_0(p0);
}
private static native long __fieldRead944_0() throws Throwable;
private static native int __call944_1() throws Throwable;
private static native java.nio.IntBuffer __fieldRead944_2() throws Throwable;
private static native int __call944_3(java.nio.IntBuffer a0) throws Throwable;
private static native int __call944_4(int a0) throws Throwable;
private static native java.nio.ByteBuffer __call944_5(int a0) throws Throwable;
private static native void __fieldWrite944_6(java.nio.ByteBuffer a0) throws Throwable;
private static native java.nio.ByteBuffer __fieldRead944_7() throws Throwable;
private static native java.nio.IntBuffer __call944_8(java.nio.ByteBuffer a0) throws Throwable;
private static native void __fieldWrite944_9(java.nio.IntBuffer a0) throws Throwable;
private static native java.nio.IntBuffer __fieldRead944_10() throws Throwable;
private static native java.lang.Exception __call1094400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5961d20bf5bf6a821a04() throws E;
private static final class __SourceHandler_5961d20bf5bf6a821a04 {

public static void f945() throws Throwable {
    net.minecraft.client.renderer.texture.ITextureObject forwardValue945_18_0;
    int spill945_0;
    net.minecraft.client.renderer.texture.ITextureObject spill945_1;
    int spill945_2;
    int spill945_3;
    int spill945_4;
    long life0_3;
    net.minecraft.client.renderer.texture.TextureManager life3_6;
    net.minecraft.client.renderer.texture.ITextureObject life4_11;
    int life2_12;
    moom.MA life5_22;
    forward_join_115: {
    forward_join_18: {
    life0_3 = (__fieldRead945_0() ^ 124104206822410L);
    life3_6 = __call945_2(__call945_1());
    spill945_0 = __call945_3();
    life4_11 = __call945_5(life3_6, __fieldRead945_4());
    life2_12 = spill945_0;
    spill945_1 = life4_11;
    if (!((life2_12 != 0))) {
        forwardValue945_18_0 = spill945_1;
        break forward_join_18;
    }
    if (!((spill945_1 != null))) {
        break forward_join_115;
    }
    forwardValue945_18_0 = life4_11;
    }
    life5_22 = __call945_6(forwardValue945_18_0);
    spill945_2 = 17655;
    __call945_8(__fieldRead945_7(life5_22));
    __call945_13(__invokedynamic945_9(spill945_2, (6163701575415898686L ^ life0_3)), __invokedynamic945_10(18526, (6349140741247938225L ^ life0_3)), (__fieldRead945_11())[__fieldRead945_12()]);
    __call945_18(__invokedynamic945_14(17655, (6163701575415898686L ^ life0_3)), __invokedynamic945_15(9453, (7111423009280901654L ^ life0_3)), (__fieldRead945_16())[__fieldRead945_17()]);
    spill945_3 = 17655;
    __call945_20(__fieldRead945_19(life5_22));
    __call945_25(__invokedynamic945_21(spill945_3, (6163701575415898686L ^ life0_3)), __invokedynamic945_22(18526, (6349140741247938225L ^ life0_3)), (__fieldRead945_23())[__fieldRead945_24()]);
    __call945_30(__invokedynamic945_26(17655, (6163701575415898686L ^ life0_3)), __invokedynamic945_27(9453, (7111423009280901654L ^ life0_3)), (__fieldRead945_28())[__fieldRead945_29()]);
    spill945_4 = 17655;
    __call945_32(__fieldRead945_31(life5_22));
    __call945_37(__invokedynamic945_33(spill945_4, (6163701575415898686L ^ life0_3)), __invokedynamic945_34(18526, (6349140741247938225L ^ life0_3)), (__fieldRead945_35())[__fieldRead945_36()]);
    __call945_42(__invokedynamic945_38(17655, (6163701575415898686L ^ life0_3)), __invokedynamic945_39(9453, (7111423009280901654L ^ life0_3)), (__fieldRead945_40())[__fieldRead945_41()]);
    __call945_43(0);
    }
    return;
}
public static void h945_0(moom.Oo p0) throws Throwable {
    throw __call1094500_0(p0);
}
private static native long __fieldRead945_0() throws Throwable;
private static native net.minecraft.client.Minecraft __call945_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call945_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call945_3() throws Throwable;
private static native moom.DD __fieldRead945_4() throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call945_5(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native moom.MA __call945_6(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native int __fieldRead945_7(moom.MA a0) throws Throwable;
private static native void __call945_8(int a0) throws Throwable;
private static native int __invokedynamic945_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic945_10(int a0, long a1) throws Throwable;
private static native int[] __fieldRead945_11() throws Throwable;
private static native int __fieldRead945_12() throws Throwable;
private static native void __call945_13(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic945_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic945_15(int a0, long a1) throws Throwable;
private static native int[] __fieldRead945_16() throws Throwable;
private static native int __fieldRead945_17() throws Throwable;
private static native void __call945_18(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead945_19(moom.MA a0) throws Throwable;
private static native void __call945_20(int a0) throws Throwable;
private static native int __invokedynamic945_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic945_22(int a0, long a1) throws Throwable;
private static native int[] __fieldRead945_23() throws Throwable;
private static native int __fieldRead945_24() throws Throwable;
private static native void __call945_25(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic945_26(int a0, long a1) throws Throwable;
private static native int __invokedynamic945_27(int a0, long a1) throws Throwable;
private static native int[] __fieldRead945_28() throws Throwable;
private static native int __fieldRead945_29() throws Throwable;
private static native void __call945_30(int a0, int a1, int a2) throws Throwable;
private static native int __fieldRead945_31(moom.MA a0) throws Throwable;
private static native void __call945_32(int a0) throws Throwable;
private static native int __invokedynamic945_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic945_34(int a0, long a1) throws Throwable;
private static native int[] __fieldRead945_35() throws Throwable;
private static native int __fieldRead945_36() throws Throwable;
private static native void __call945_37(int a0, int a1, int a2) throws Throwable;
private static native int __invokedynamic945_38(int a0, long a1) throws Throwable;
private static native int __invokedynamic945_39(int a0, long a1) throws Throwable;
private static native int[] __fieldRead945_40() throws Throwable;
private static native int __fieldRead945_41() throws Throwable;
private static native void __call945_42(int a0, int a1, int a2) throws Throwable;
private static native void __call945_43(int a0) throws Throwable;
private static native java.lang.Exception __call1094500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8d21306b04cdb623c26b(int a0, int a1) throws E;
private static final class __SourceHandler_8d21306b04cdb623c26b {

public static void f946(int p0, int p1) throws Throwable {
    int forwardValue946_11_0;
    int forwardValue946_40_0;
    boolean spill946_0;
    int spill946_1;
    int spill946_2;
    long life2_3;
    int life4_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_11: {
    life2_3 = (__fieldRead946_0() ^ 11825850125168L);
    life4_5 = __call946_1();
    spill946_0 = __fieldRead946_2();
    if (!((life4_5 == 0))) {
        forwardValue946_11_0 = __integerCategory946_3(spill946_0);
        break forward_join_11;
    }
    if (!(spill946_0)) {
        break forward_join_41;
    }
    forwardValue946_11_0 = __call946_4();
    }
    if (!((life4_5 == 0))) {
        forwardValue946_40_0 = forwardValue946_11_0;
        break forward_join_40;
    }
    if (!((forwardValue946_11_0 == __invokedynamic946_5(19986, (1861316858676842379L ^ life2_3))))) {
        break forward_join_41;
    }
    __call946_7(__invokedynamic946_6(27336, (6637848281602763594L ^ life2_3)));
    spill946_1 = 2803;
    __call946_8(p0);
    __call946_10(__invokedynamic946_9(spill946_1, (4632680218281462605L ^ life2_3)));
    spill946_2 = 19986;
    __call946_11(p1);
    forwardValue946_40_0 = __invokedynamic946_12(spill946_2, (1861316858676842379L ^ life2_3));
    }
    __call946_13(forwardValue946_40_0);
    }
    return;
}
public static void h946_0(moom.Oo p0) throws Throwable {
    throw __call1094600_0(p0);
}
public static void h946_1(moom.Oo p0) throws Throwable {
    throw __call1094601_0(p0);
}
public static void h946_2(moom.Oo p0) throws Throwable {
    throw __call1094602_0(p0);
}
private static native long __fieldRead946_0() throws Throwable;
private static native int __call946_1() throws Throwable;
private static native boolean __fieldRead946_2() throws Throwable;
private static native int __integerCategory946_3(boolean value) throws Throwable;
private static native int __call946_4() throws Throwable;
private static native int __invokedynamic946_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic946_6(int a0, long a1) throws Throwable;
private static native void __call946_7(int a0) throws Throwable;
private static native void __call946_8(int a0) throws Throwable;
private static native int __invokedynamic946_9(int a0, long a1) throws Throwable;
private static native void __call946_10(int a0) throws Throwable;
private static native void __call946_11(int a0) throws Throwable;
private static native int __invokedynamic946_12(int a0, long a1) throws Throwable;
private static native void __call946_13(int a0) throws Throwable;
private static native java.lang.Exception __call1094600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_65df9d8f94dad6c4b368(int a0, int a1, int a2) throws E;
private static final class __SourceHandler_65df9d8f94dad6c4b368 {

public static void f947(int p0, int p1, int p2) throws Throwable {
    int forwardValue947_42_0;
    boolean spill947_0;
    int spill947_1;
    int spill947_2;
    int spill947_3;
    long life3_3;
    int life5_5;
    forward_join_42: {
    forward_join_41: {
    life3_3 = (__fieldRead947_0() ^ 202322816005L);
    life5_5 = __call947_1();
    spill947_0 = __fieldRead947_2();
    if (!((life5_5 != 0))) {
        forwardValue947_42_0 = __integerCategory947_3(spill947_0);
        break forward_join_42;
    }
    if (!(spill947_0)) {
        break forward_join_41;
    }
    spill947_1 = __call947_4();
    if (!((life5_5 != 0))) {
        forwardValue947_42_0 = spill947_1;
        break forward_join_42;
    }
    if (!((spill947_1 == __invokedynamic947_5(19986, (1861309617617283326L ^ life3_3))))) {
        break forward_join_41;
    }
    __call947_7(__invokedynamic947_6(27336, (6637836606527441983L ^ life3_3)));
    spill947_2 = 2803;
    __call947_8(p1);
    __call947_10(__invokedynamic947_9(spill947_2, (4632687735811664952L ^ life3_3)));
    spill947_3 = 19986;
    __call947_11(p2);
    __call947_13(__invokedynamic947_12(spill947_3, (1861309617617283326L ^ life3_3)));
    }
    forwardValue947_42_0 = p0;
    }
    __call947_14(forwardValue947_42_0);
    return;
}
public static void h947_0(moom.Oo p0) throws Throwable {
    throw __call1094700_0(p0);
}
public static void h947_1(moom.Oo p0) throws Throwable {
    throw __call1094701_0(p0);
}
public static void h947_2(moom.Oo p0) throws Throwable {
    throw __call1094702_0(p0);
}
public static void h947_3(moom.Oo p0) throws Throwable {
    throw __call1094703_0(p0);
}
private static native long __fieldRead947_0() throws Throwable;
private static native int __call947_1() throws Throwable;
private static native boolean __fieldRead947_2() throws Throwable;
private static native int __integerCategory947_3(boolean value) throws Throwable;
private static native int __call947_4() throws Throwable;
private static native int __invokedynamic947_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic947_6(int a0, long a1) throws Throwable;
private static native void __call947_7(int a0) throws Throwable;
private static native void __call947_8(int a0) throws Throwable;
private static native int __invokedynamic947_9(int a0, long a1) throws Throwable;
private static native void __call947_10(int a0) throws Throwable;
private static native void __call947_11(int a0) throws Throwable;
private static native int __invokedynamic947_12(int a0, long a1) throws Throwable;
private static native void __call947_13(int a0) throws Throwable;
private static native void __call947_14(int a0) throws Throwable;
private static native java.lang.Exception __call1094700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_47140a9700f18b7255b8(int a0) throws E;
private static final class __SourceHandler_47140a9700f18b7255b8 {

public static int f948(int p0) throws Throwable {
    int forwardValue948_34_0;
    int forwardValue948_53_0;
    int forwardValue948_68_0;
    int forwardValue948_79_0;
    int forwardValue948_84_0;
    int spill948_0;
    int spill948_1;
    long life1_3;
    int life4_6;
    int life3_7;
    forward_join_84: {
    forward_join_83: {
    forward_join_79: {
    forward_join_76: {
    forward_join_68: {
    forward_join_61: {
    forward_join_53: {
    forward_join_46: {
    forward_join_34: {
    forward_join_27: {
    life1_3 = (__fieldRead948_0() ^ 51801566333455L);
    spill948_0 = __call948_1();
    life4_6 = 0;
    life3_7 = spill948_0;
    spill948_1 = (p0 & __invokedynamic948_2(25379, (1928470792256250847L ^ life1_3)));
    if (!((life3_7 != 0))) {
        forwardValue948_34_0 = spill948_1;
        break forward_join_34;
    }
    if (!((spill948_1 != 0))) {
        break forward_join_27;
    }
    life4_6 += 16;
    p0 = (p0 >> __invokedynamic948_3(10228, (348585902408247043L ^ life1_3)));
    }
    forwardValue948_34_0 = (p0 & __invokedynamic948_4(20945, (5533247905115918625L ^ life1_3)));
    }
    if (!((life3_7 != 0))) {
        forwardValue948_53_0 = forwardValue948_34_0;
        break forward_join_53;
    }
    if (!((forwardValue948_34_0 != 0))) {
        break forward_join_46;
    }
    life4_6 += 8;
    p0 = (p0 >> __invokedynamic948_5(17132, (4423599763719963155L ^ life1_3)));
    }
    forwardValue948_53_0 = (p0 & __invokedynamic948_6(8765, (7886626295889011442L ^ life1_3)));
    }
    if (!((life3_7 != 0))) {
        forwardValue948_68_0 = forwardValue948_53_0;
        break forward_join_68;
    }
    if (!((forwardValue948_53_0 != 0))) {
        break forward_join_61;
    }
    life4_6 += 4;
    p0 = (p0 >> 4);
    }
    forwardValue948_68_0 = (p0 & __invokedynamic948_7(32262, (1328940356020469487L ^ life1_3)));
    }
    if (!((life3_7 != 0))) {
        forwardValue948_79_0 = forwardValue948_68_0;
        break forward_join_79;
    }
    if (!((forwardValue948_68_0 != 0))) {
        break forward_join_76;
    }
    life4_6 += 2;
    p0 = (p0 >> 2);
    }
    forwardValue948_79_0 = (p0 & 2);
    }
    if (!((life3_7 != 0))) {
        forwardValue948_84_0 = forwardValue948_79_0;
        break forward_join_84;
    }
    if (!((forwardValue948_79_0 != 0))) {
        break forward_join_83;
    }
    life4_6 += 1;
    }
    forwardValue948_84_0 = life4_6;
    }
    return forwardValue948_84_0;
}
public static void h948_0(moom.Oo p0) throws Throwable {
    throw __call1094800_0(p0);
}
public static void h948_1(moom.Oo p0) throws Throwable {
    throw __call1094801_0(p0);
}
public static void h948_2(moom.Oo p0) throws Throwable {
    throw __call1094802_0(p0);
}
public static void h948_3(moom.Oo p0) throws Throwable {
    throw __call1094803_0(p0);
}
public static void h948_4(moom.Oo p0) throws Throwable {
    throw __call1094804_0(p0);
}
private static native long __fieldRead948_0() throws Throwable;
private static native int __call948_1() throws Throwable;
private static native int __invokedynamic948_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic948_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic948_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic948_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic948_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic948_7(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1094800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_76e6a6e8bbfbdb1f8f24(moom.MA a0) throws E;
private static final class __SourceHandler_76e6a6e8bbfbdb1f8f24 {

public static void f949(moom.MA p0) throws Throwable {
    int forwardValue949_33_0;
    int forwardValue949_50_0;
    int forwardValue949_53_0;
    boolean spill949_0;
    int spill949_1;
    boolean spill949_2;
    long life1_3;
    int life3_5;
    forward_join_53: {
    forward_join_51: {
    forward_join_50: {
    forward_join_45: {
    forward_join_33: {
    forward_join_32: {
    life1_3 = (__fieldRead949_0() ^ 73415183875650L);
    life3_5 = __call949_1();
    spill949_0 = __fieldRead949_2();
    if (!((life3_5 != 0))) {
        forwardValue949_53_0 = __integerCategory949_3(spill949_0);
        break forward_join_53;
    }
    if (!(spill949_0)) {
        break forward_join_51;
    }
    spill949_1 = __call949_4();
    if (!((life3_5 != 0))) {
        forwardValue949_53_0 = spill949_1;
        break forward_join_53;
    }
    if (!((spill949_1 == __invokedynamic949_5(16397, (7371749322849203332L ^ life1_3))))) {
        break forward_join_51;
    }
    spill949_2 = __fieldRead949_6();
    if (!((life3_5 != 0))) {
        forwardValue949_33_0 = __integerCategory949_7(spill949_2);
        break forward_join_33;
    }
    if (!(spill949_2)) {
        break forward_join_32;
    }
    __call949_9(__invokedynamic949_8(19126, (8793818361068797450L ^ life1_3)));
    __call949_11(__fieldRead949_10(p0));
    }
    forwardValue949_33_0 = __integerCategory949_13(__fieldRead949_12());
    }
    if (!((life3_5 != 0))) {
        forwardValue949_50_0 = forwardValue949_33_0;
        break forward_join_50;
    }
    if (!((forwardValue949_33_0 != 0))) {
        break forward_join_45;
    }
    __call949_15(__invokedynamic949_14(18024, (157788061740053216L ^ life1_3)));
    __call949_17(__fieldRead949_16(p0));
    }
    forwardValue949_50_0 = __invokedynamic949_18(19986, (1861378447864838841L ^ life1_3));
    }
    __call949_19(forwardValue949_50_0);
    }
    forwardValue949_53_0 = __fieldRead949_20(p0);
    }
    __call949_21(forwardValue949_53_0);
    return;
}
public static void h949_0(moom.Oo p0) throws Throwable {
    throw __call1094900_0(p0);
}
public static void h949_1(moom.Oo p0) throws Throwable {
    throw __call1094901_0(p0);
}
public static void h949_2(moom.Oo p0) throws Throwable {
    throw __call1094902_0(p0);
}
public static void h949_3(moom.Oo p0) throws Throwable {
    throw __call1094903_0(p0);
}
public static void h949_4(moom.Oo p0) throws Throwable {
    throw __call1094904_0(p0);
}
public static void h949_5(moom.Oo p0) throws Throwable {
    throw __call1094905_0(p0);
}
public static void h949_6(moom.Oo p0) throws Throwable {
    throw __call1094906_0(p0);
}
public static void h949_7(moom.Oo p0) throws Throwable {
    throw __call1094907_0(p0);
}
private static native long __fieldRead949_0() throws Throwable;
private static native int __call949_1() throws Throwable;
private static native boolean __fieldRead949_2() throws Throwable;
private static native int __integerCategory949_3(boolean value) throws Throwable;
private static native int __call949_4() throws Throwable;
private static native int __invokedynamic949_5(int a0, long a1) throws Throwable;
private static native boolean __fieldRead949_6() throws Throwable;
private static native int __integerCategory949_7(boolean value) throws Throwable;
private static native int __invokedynamic949_8(int a0, long a1) throws Throwable;
private static native void __call949_9(int a0) throws Throwable;
private static native int __fieldRead949_10(moom.MA a0) throws Throwable;
private static native void __call949_11(int a0) throws Throwable;
private static native boolean __fieldRead949_12() throws Throwable;
private static native int __integerCategory949_13(boolean value) throws Throwable;
private static native int __invokedynamic949_14(int a0, long a1) throws Throwable;
private static native void __call949_15(int a0) throws Throwable;
private static native int __fieldRead949_16(moom.MA a0) throws Throwable;
private static native void __call949_17(int a0) throws Throwable;
private static native int __invokedynamic949_18(int a0, long a1) throws Throwable;
private static native void __call949_19(int a0) throws Throwable;
private static native int __fieldRead949_20(moom.MA a0) throws Throwable;
private static native void __call949_21(int a0) throws Throwable;
private static native java.lang.Exception __call1094900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1094907_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ffda9e173b0d2fd55c77(int[] a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_ffda9e173b0d2fd55c77 {

public static void f785(int[] p0, int p1, int p2, int p3) throws Throwable {
    int forestValue785_130_0;
    int forestValue785_155_0;
    int[] forestValue785_174_0;
    int forestValue785_174_1;
    int forestValue785_204_0;
    int forestValue785_208_0;
    int forestValue785_229_0;
    int[] forestValue785_248_0;
    int forestValue785_248_1;
    int forestValue785_278_0;
    int forestValue785_285_0;
    int forestValue785_285_1;
    int forestValue785_292_0;
    int[] forestValue785_311_0;
    int forestValue785_311_1;
    int forestValue785_341_0;
    int spill785_0;
    int spill785_1;
    int spill785_2;
    int spill785_3;
    int spill785_4;
    int[] spill785_5;
    int spill785_6;
    int spill785_7;
    int spill785_8;
    int[] spill785_9;
    int spill785_10;
    int spill785_11;
    int spill785_12;
    int spill785_13;
    int[] spill785_14;
    int spill785_15;
    int spill785_16;
    int spill785_17;
    int spill785_18;
    long life4_3;
    int life7_9;
    int life8_12;
    int life9_14;
    int life6_15;
    int life10_17;
    int life11_19;
    int life12_21;
    int life13_23;
    int life12_54;
    int life14_56;
    int life15_67;
    int life16_75;
    int life17_80;
    int life8_160;
    int life9_164;
    int life7_171;
    int life14_173;
    int life15_175;
    int life16_186;
    int life8_251;
    int life9_255;
    int life7_262;
    int life14_264;
    int life15_266;
    int life16_277;
    int life7_340;
    int life14_342;
    int life15_344;
    int life16_355;
    forest_join_361: {
    forest_join_285: {
    forest_join_284: {
    forest_join_208: {
    forest_join_133: {
    life4_3 = (__fieldRead785_0() ^ 67229240388861L);
    __call785_1(p2, p3);
    life7_9 = p1;
    spill785_0 = __call785_2();
    life8_12 = p2;
    life9_14 = p3;
    life6_15 = spill785_0;
    life10_17 = 0;
    life11_19 = 0;
    life12_21 = 0;
    life13_23 = 0;
    forest_cycle_24: while (true) {
    forest_join_130: {
    forest_join_124: {
    if (!((life8_12 > 1))) {
        break forest_join_133;
    }
    spill785_1 = life9_14;
    if (!((life6_15 == 0))) {
        forestValue785_208_0 = spill785_1;
        break forest_join_208;
    }
    spill785_2 = 1;
    if (!((life6_15 == 0))) {
        forestValue785_285_0 = spill785_1;
        forestValue785_285_1 = spill785_2;
        break forest_join_285;
    }
    if (!((spill785_1 > spill785_2))) {
        break forest_join_133;
    }
    life10_17 = (life7_9 + (life8_12 * life9_14));
    life11_19 = (life8_12 / 2);
    life12_54 = (life9_14 / 2);
    life14_56 = 0;
    forest_cycle_50: while (true) {
    forest_join_122: {
    forest_join_121: {
    if (!((life14_56 < life12_54))) {
        break forest_join_124;
    }
    life15_67 = (life10_17 + (life14_56 * life11_19));
    life16_75 = (life7_9 + ((life14_56 * 2) * life8_12));
    spill785_3 = 0;
    if (!((life6_15 == 0))) {
        forestValue785_130_0 = spill785_3;
        break forest_join_130;
    }
    life17_80 = spill785_3;
    forest_cycle_71: while (true) {
    if (!((life17_80 < life11_19))) {
        break forest_join_121;
    }
    (p0)[(life15_67 + life17_80)] = __call785_3((p0)[(life16_75 + (life17_80 * 2))], (p0)[((life16_75 + (life17_80 * 2)) + 1)], (p0)[((life16_75 + life8_12) + (life17_80 * 2))], (p0)[(((life16_75 + life8_12) + (life17_80 * 2)) + 1)]);
    life17_80 += 1;
    if (!((life6_15 == 0))) {
        break forest_join_122;
    }
    if (!((life6_15 != 0))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    }
    life14_56 += 1;
    }
    if (!((life6_15 != 0))) {
        continue forest_cycle_50;
    }
    break forest_cycle_50;
    }
    }
    life13_23 += 1;
    life8_12 = life11_19;
    life9_14 = life12_54;
    forestValue785_130_0 = life10_17;
    }
    life7_9 = forestValue785_130_0;
    if (!((life6_15 != 0))) {
        continue forest_cycle_24;
    }
    break forest_cycle_24;
    }
    }
    forest_cycle_133: while (true) {
    forest_join_204: {
    forest_join_201: {
    if (!((life13_23 > 0))) {
        break forest_join_361;
    }
    life13_23 += -1;
    life8_160 = (p2 >> life13_23);
    life9_164 = (p3 >> life13_23);
    life7_171 = (life10_17 - (life8_160 * life9_164));
    life14_173 = life7_171;
    life15_175 = 0;
    forest_cycle_154: while (true) {
    forest_join_198: {
    forestValue785_155_0 = life15_175;
    forest_cycle_155: while (true) {
    if (!((forestValue785_155_0 < life9_164))) {
        break forest_join_201;
    }
    spill785_4 = 0;
    if (!((life6_15 == 0))) {
        forestValue785_204_0 = spill785_4;
        break forest_join_204;
    }
    life16_186 = spill785_4;
    forest_cycle_161: while (true) {
    forest_join_194: {
    forest_join_174: {
    if (!((life16_186 < life8_160))) {
        break forest_join_198;
    }
    spill785_5 = p0;
    spill785_6 = life14_173;
    if (!((life6_15 == 0))) {
        forestValue785_174_0 = spill785_5;
        forestValue785_174_1 = spill785_6;
        break forest_join_174;
    }
    spill785_7 = (spill785_5)[spill785_6];
    if (!((life6_15 == 0))) {
        forestValue785_155_0 = spill785_7;
        continue forest_cycle_155;
    }
    if (!((spill785_7 == 0))) {
        break forest_join_194;
    }
    forestValue785_174_0 = p0;
    forestValue785_174_1 = life14_173;
    }
    (forestValue785_174_0)[forestValue785_174_1] = ((p0)[((life10_17 + ((life15_175 / 2) * life11_19)) + (life16_186 / 2))] & __invokedynamic785_4(24089, (2526433674581997597L ^ life4_3)));
    }
    life14_173 += 1;
    life16_186 += 1;
    if (!((life6_15 != 0))) {
        continue forest_cycle_161;
    }
    break forest_cycle_161;
    }
    break forest_cycle_155;
    }
    }
    life15_175 += 1;
    if (!((life6_15 != 0))) {
        continue forest_cycle_154;
    }
    break forest_cycle_154;
    }
    }
    life10_17 = life7_171;
    forestValue785_204_0 = life8_160;
    }
    life11_19 = forestValue785_204_0;
    if (!((life6_15 != 0))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    break forest_join_361;
    }
    forest_cycle_208: while (true) {
    forest_join_282: {
    forest_join_278: {
    forest_join_275: {
    if (!((forestValue785_208_0 > 0))) {
        break forest_join_361;
    }
    life13_23 += -1;
    life8_251 = (p2 >> life13_23);
    life9_255 = (p3 >> life13_23);
    life7_262 = (life10_17 - (life8_251 * life9_255));
    life14_264 = life7_262;
    life15_266 = 0;
    forest_cycle_228: while (true) {
    forest_join_272: {
    forestValue785_229_0 = life15_266;
    forest_cycle_229: while (true) {
    if (!((forestValue785_229_0 < life9_255))) {
        break forest_join_275;
    }
    spill785_8 = 0;
    if (!((life6_15 == 0))) {
        forestValue785_278_0 = spill785_8;
        break forest_join_278;
    }
    life16_277 = spill785_8;
    forest_cycle_235: while (true) {
    forest_join_268: {
    forest_join_248: {
    if (!((life16_277 < life8_251))) {
        break forest_join_272;
    }
    spill785_9 = p0;
    spill785_10 = life14_264;
    if (!((life6_15 == 0))) {
        forestValue785_248_0 = spill785_9;
        forestValue785_248_1 = spill785_10;
        break forest_join_248;
    }
    spill785_11 = (spill785_9)[spill785_10];
    if (!((life6_15 == 0))) {
        forestValue785_229_0 = spill785_11;
        continue forest_cycle_229;
    }
    if (!((spill785_11 == 0))) {
        break forest_join_268;
    }
    forestValue785_248_0 = p0;
    forestValue785_248_1 = life14_264;
    }
    (forestValue785_248_0)[forestValue785_248_1] = ((p0)[((life10_17 + ((life15_266 / 2) * life11_19)) + (life16_277 / 2))] & __invokedynamic785_5(24089, (2526433674581997597L ^ life4_3)));
    }
    life14_264 += 1;
    life16_277 += 1;
    if (!((life6_15 != 0))) {
        continue forest_cycle_235;
    }
    break forest_cycle_235;
    }
    break forest_cycle_229;
    }
    }
    life15_266 += 1;
    if (!((life6_15 != 0))) {
        continue forest_cycle_228;
    }
    break forest_cycle_228;
    }
    }
    life10_17 = life7_262;
    forestValue785_278_0 = life8_251;
    }
    life11_19 = forestValue785_278_0;
    if (!((life6_15 != 0))) {
        break forest_join_282;
    }
    break forest_join_284;
    }
    spill785_12 = life13_23;
    forestValue785_208_0 = spill785_12;
    continue forest_cycle_208;
    }
    }
    break forest_join_361;
    }
    forest_cycle_285: while (true) {
    forest_join_345: {
    forest_join_341: {
    forest_join_338: {
    life7_340 = (forestValue785_285_0 - forestValue785_285_1);
    life14_342 = life7_340;
    life15_344 = 0;
    forest_cycle_291: while (true) {
    forest_join_335: {
    forestValue785_292_0 = life15_344;
    forest_cycle_292: while (true) {
    if (!((forestValue785_292_0 < life9_14))) {
        break forest_join_338;
    }
    spill785_13 = 0;
    if (!((life6_15 == 0))) {
        forestValue785_341_0 = spill785_13;
        break forest_join_341;
    }
    life16_355 = spill785_13;
    forest_cycle_298: while (true) {
    forest_join_331: {
    forest_join_311: {
    if (!((life16_355 < life8_12))) {
        break forest_join_335;
    }
    spill785_14 = p0;
    spill785_15 = life14_342;
    if (!((life6_15 == 0))) {
        forestValue785_311_0 = spill785_14;
        forestValue785_311_1 = spill785_15;
        break forest_join_311;
    }
    spill785_16 = (spill785_14)[spill785_15];
    if (!((life6_15 == 0))) {
        forestValue785_292_0 = spill785_16;
        continue forest_cycle_292;
    }
    if (!((spill785_16 == 0))) {
        break forest_join_331;
    }
    forestValue785_311_0 = p0;
    forestValue785_311_1 = life14_342;
    }
    (forestValue785_311_0)[forestValue785_311_1] = ((p0)[((life10_17 + ((life15_344 / 2) * life11_19)) + (life16_355 / 2))] & __invokedynamic785_6(24089, (2526433674581997597L ^ life4_3)));
    }
    life14_342 += 1;
    life16_355 += 1;
    if (!((life6_15 != 0))) {
        continue forest_cycle_298;
    }
    break forest_cycle_298;
    }
    break forest_cycle_292;
    }
    }
    life15_344 += 1;
    if (!((life6_15 != 0))) {
        continue forest_cycle_291;
    }
    break forest_cycle_291;
    }
    }
    life10_17 = life7_340;
    forestValue785_341_0 = life8_12;
    }
    life11_19 = forestValue785_341_0;
    if (!((life6_15 != 0))) {
        break forest_join_345;
    }
    break forest_join_361;
    }
    if (!((life13_23 > 0))) {
        break forest_join_361;
    }
    life13_23 += -1;
    life8_12 = (p2 >> life13_23);
    life9_14 = (p3 >> life13_23);
    spill785_17 = life10_17;
    spill785_18 = (life8_12 * life9_14);
    forestValue785_285_0 = spill785_17;
    forestValue785_285_1 = spill785_18;
    continue forest_cycle_285;
    }
    }
    return;
}
public static void h785_0(moom.Oo p0) throws Throwable {
    throw __call3078500_0(p0);
}
public static void h785_1(moom.Oo p0) throws Throwable {
    throw __call3078501_0(p0);
}
public static void h785_2(moom.Oo p0) throws Throwable {
    throw __call3078502_0(p0);
}
public static void h785_3(moom.Oo p0) throws Throwable {
    throw __call3078503_0(p0);
}
public static void h785_4(moom.Oo p0) throws Throwable {
    throw __call3078504_0(p0);
}
private static native long __fieldRead785_0() throws Throwable;
private static native int __call785_1(int a0, int a1) throws Throwable;
private static native int __call785_2() throws Throwable;
private static native int __call785_3(int a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic785_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic785_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic785_6(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3078500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3078504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_793e000b971345a3d7ac() throws E;
private static final class __SourceHandler_793e000b971345a3d7ac {

public static int f1590() throws Throwable {
    int life0_1;
    life0_1 = __call1590_0();
    if ((life0_1 == 0)) {
        return 12;
    }
    return 0;
}
public static void h1590_0(moom.Oo p0) throws Throwable {
    throw __call1159000_0(p0);
}
private static native int __call1590_0() throws Throwable;
private static native java.lang.Exception __call1159000_0(moom.Oo a0) throws Throwable;

}


public static void b__Void(int p0) {
e = ((int)(p0));
    return;
}


public static void b(int[] p0, int p1, int p2, int p3) { __sourceHandlerCall_ffda9e173b0d2fd55c77(p0, p1, p2, p3); }


public static int b(int p0, int p1, int p2, int p3) {
long local4 = (moom.MS.f ^ 106210559152309L);
    return (((((((((((p0 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_1(21606, (3184573495428763167L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_2(10584, (2630983690816795432L ^ local4))) + ((p1 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_3(21702, (4852827901709242033L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_4(28828, (5513506926313958099L ^ local4)))) + ((p2 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_5(21702, (4852827901709242033L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_6(28828, (5513506926313958099L ^ local4)))) + ((p3 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_7(21702, (4852827901709242033L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_8(28828, (5513506926313958099L ^ local4)))) + 2) / 4) << __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_9(21702, (4852827901709242033L ^ local4))) | ((((((((p0 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_10(24787, (6048303121748228755L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_11(28828, (5513506926313958099L ^ local4))) + ((p1 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_12(24787, (6048303121748228755L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_13(28828, (5513506926313958099L ^ local4)))) + ((p2 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_14(24787, (6048303121748228755L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_15(28828, (5513506926313958099L ^ local4)))) + ((p3 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_16(24787, (6048303121748228755L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_17(28828, (5513506926313958099L ^ local4)))) + 2) / 4) << __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_18(24787, (6048303121748228755L ^ local4)))) | ((((((((p0 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_19(25699, (5190328870050692625L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_20(28828, (5513506926313958099L ^ local4))) + ((p1 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_21(25699, (5190328870050692625L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_22(28828, (5513506926313958099L ^ local4)))) + ((p2 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_23(25699, (5190328870050692625L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_24(28828, (5513506926313958099L ^ local4)))) + ((p3 >>> __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_25(25699, (5190328870050692625L ^ local4))) & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_26(28828, (5513506926313958099L ^ local4)))) + 2) / 4) << __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_27(25699, (5190328870050692625L ^ local4)))) | ((((((p0 & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_28(28828, (5513506926313958099L ^ local4))) + (p1 & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_29(28828, (5513506926313958099L ^ local4)))) + (p2 & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_30(28828, (5513506926313958099L ^ local4)))) + (p3 & __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_31(28828, (5513506926313958099L ^ local4)))) + 2) / 4));
}


public static void b(moom.MA p0) { __sourceHandlerCall_76e6a6e8bbfbdb1f8f24(p0); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6299_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.MS.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n4 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x7CEA;
        if (k[n4] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = j[n4];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])MS.l.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    MS.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/MS", exception);
            }
            int n6 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            MS.k[n4] = n6;
        }
        return k[n4];
}


public static int b() {
return moom.MS.e;
}


public static int[] b__ArrayInt(int p0) {
long local1 = (moom.MS.f ^ 93335231288243L);
    int[] local3 = new int[(p0 * 3)];
    java.util.Arrays.fill(((int[])(local3)), ((int)(0)), ((int)(p0)), ((int)(0)));
    java.util.Arrays.fill(((int[])(local3)), ((int)(p0)), ((int)((p0 * 2))), ((int)(__sourceIntrinsic_5a1044f09169_originalDynamicSite1309_2(589, (6752363405899209492L ^ local1)))));
    java.util.Arrays.fill(((int[])(local3)), ((int)((p0 * 2))), ((int)((p0 * 3))), ((int)(0)));
    return local3;
}


public static int b(int p0) { return __sourceHandlerCall_47140a9700f18b7255b8(p0); }


public static void c(int[] p0, int p1, int p2, int p3) {
return;
}


public static int c() { return __sourceHandlerCall_793e000b971345a3d7ac(); }


public static void a(moom.n5 p0, moom.oR p1, java.util.List<java.lang.String> p2) { __sourceHandlerCall_9633235a3fdad289c39f(p0, p1, p2); }


public static int[][] a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int[][] p1, int p2, int p3) {
int local4 = 1;
    return p1;
}


public static void a__Void() { __sourceHandlerCall_5961d20bf5bf6a821a04(); }


public static int[][] a(int[][] p0, int p1, int p2, int p3) { return __sourceHandlerCall_5a94c0d6b15e94ffe6fe(p0, p1, p2, p3); }


public static moom.DD a(moom.DD p0, java.lang.String p1) { return __sourceHandlerCall_34e7f0860c11804b6636(p0, p1); }


public static void a(moom.oR p0, moom.DD p1, int p2, int p3, int[] p4) { __sourceHandlerCall_60949e2df1097974ca6c(p0, p1, p2, p3, p4); }


private static void a(moom.oR p0, moom.DD p1, int p2, int p3, int[] p4, int p5, int p6) {
long life7_3;
    life7_3 = (moom.MS.f ^ 47091084688900L);
    try {
        if ((!moom.MS.a(((moom.oR)(p0)), ((moom.DD)(p1)), ((int)(p2)), ((int)(p3)), ((int[])(p4)), ((int)(p5))))) {
        java.util.Arrays.fill(((int[])(p4)), ((int)(p5)), ((int)((p5 + (p2 * p3)))), ((int)(p6)));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.MS.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static boolean a(moom.oR p0, moom.DD p1, int p2, int p3, int[] p4, int p5) { return __sourceHandlerCall_f29a57b596f67dc79c6a(p0, p1, p2, p3, p4, p5); }


public static int a(int p0, java.awt.image.BufferedImage p1, boolean p2, boolean p3, moom.oR p4, moom.DD p5, moom.MA p6) {
int local7 = ((java.awt.image.BufferedImage)(p1)).getWidth();
    int local8 = ((java.awt.image.BufferedImage)(p1)).getHeight();
    int local9 = (local7 * local8);
    int[] local10 = moom.MS.a__ArrayInt(((int)((local9 * 3))));
    ((java.awt.image.BufferedImage)(p1)).getRGB(((int)(0)), ((int)(0)), ((int)(local7)), ((int)(local8)), ((int[])(local10)), ((int)(0)), ((int)(local7)));
    moom.MS.a(((moom.oR)(p4)), ((moom.DD)(p5)), ((int)(local7)), ((int)(local8)), ((int[])(local10)));
    moom.MS.a(((moom.MA)(p6)), ((int[])(local10)), ((int)(local7)), ((int)(local8)), ((boolean)(p2)), ((boolean)(p3)));
    return p0;
}


public static int a(int p0, int p1, int p2) {
long local3 = (moom.MS.f ^ 111165002443662L);
    int local5 = (__sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_1(28828, (5513510772652921320L ^ local3)) - p2);
    return (((((((((p0 >>> __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_2(21702, (4852822938944468362L ^ local3))) & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_3(28828, (5513510772652921320L ^ local3))) * p2) + (((p1 >>> __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_4(21702, (4852822938944468362L ^ local3))) & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_5(28828, (5513510772652921320L ^ local3))) * local5)) / __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_6(28828, (5513510772652921320L ^ local3))) << __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_7(21702, (4852822938944468362L ^ local3))) | ((((((p0 >>> __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_8(24787, (6048305881193202088L ^ local3))) & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_9(28828, (5513510772652921320L ^ local3))) * p2) + (((p1 >>> __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_10(24787, (6048305881193202088L ^ local3))) & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_11(28828, (5513510772652921320L ^ local3))) * local5)) / __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_12(28828, (5513510772652921320L ^ local3))) << __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_13(24787, (6048305881193202088L ^ local3)))) | ((((((p0 >>> __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_14(25699, (5190333802874815786L ^ local3))) & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_15(28828, (5513510772652921320L ^ local3))) * p2) + (((p1 >>> __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_16(25699, (5190333802874815786L ^ local3))) & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_17(28828, (5513510772652921320L ^ local3))) * local5)) / __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_18(28828, (5513510772652921320L ^ local3))) << __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_19(25699, (5190333802874815786L ^ local3)))) | ((((p0 & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_20(28828, (5513510772652921320L ^ local3))) * p2) + ((p1 & __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_21(28828, (5513510772652921320L ^ local3))) * local5)) / __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_22(28828, (5513510772652921320L ^ local3))));
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.MS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6309_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/MS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static int a(int p0) {
long local1 = (moom.MS.f ^ 11838410235450L);
    int local3 = (p0 - 1);
    local3 = (local3 | (local3 >> 1));
    local3 = (local3 | (local3 >> 2));
    local3 = (local3 | (local3 >> 4));
    local3 = (local3 | (local3 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1311_1(25699, (5190304866643849374L ^ local1))));
    local3 = (local3 | (local3 >> __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1311_2(24787, (6048204529590776860L ^ local1))));
    return (local3 + 1);
}


public static int[] a__ArrayInt(int p0) { return __sourceHandlerCall_3a31fbfafbf5334cb4c3(p0); }


public static java.nio.IntBuffer a__IntBuffer(int p0) { return __sourceHandlerCall_cf7531ab53e91fe382a1(p0); }


public static void a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0, int[] p1) {
return;
}


public static java.nio.IntBuffer a(int p0, int p1) {
int[] local2 = moom.MS.a__ArrayInt(((int)(p0)));
    java.lang.Object local3 = moom.MS.a__IntBuffer(((int)(p0)));
    java.util.Arrays.fill(((int[])(moom.MS.c)), ((int)(0)), ((int)(p0)), ((int)(p1)));
    ((java.nio.IntBuffer)(moom.MS.b)).put(((int[])(moom.MS.c)), ((int)(0)), ((int)(p0)));
    return moom.MS.b;
}


private static java.lang.Exception a(java.lang.Exception p0) {
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
        byte[] spill3175_0 = p0;
        life4_9 += 1;
        life5_44 = (spill3175_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill3175_1 = p0;
        life4_9 += 1;
        life5_76 = (spill3175_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill3175_2 = p0;
        life4_9 += 1;
        life5_91 = (spill3175_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27102);
    if (((moom.MS.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.MS.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.MS.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/MS", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((moom.MS.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.MS.h)[life5_8] = moom.MS.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.MS.h)[life5_8];
}


public static void a(int p0, int p1, int p2, moom.n3 p3) {
long local4 = (moom.MS.f ^ 98627891454715L);
    moom.MA local6 = ((moom.n3)(p3)).a__MA();
    int[] local7 = ((moom.n3)(p3)).a__sourceReturn_d4d28024c9();
    int local8 = (p1 * p2);
    java.util.Arrays.fill(((int[])(local7)), ((int)(local8)), ((int)((local8 * 2))), ((int)(__sourceIntrinsic_00fcdcbe7dc7_originalDynamicSite1312_3(589, (6752369106207976028L ^ local4)))));
    java.util.Arrays.fill(((int[])(local7)), ((int)((local8 * 2))), ((int)((local8 * 3))), ((int)(0)));
    moom.ol.a(((int)(((moom.MA)(local6)).a)), ((int)(p1)), ((int)(p2)));
    moom.ol.a(((boolean)(false)), ((boolean)(false)));
    moom.ol.a(((boolean)(false)));
    moom.ol.a(((int)(((moom.MA)(local6)).b)), ((int)(p1)), ((int)(p2)));
    moom.ol.a(((boolean)(false)), ((boolean)(false)));
    moom.ol.a(((boolean)(false)));
    moom.ol.a(((int)(((moom.MA)(local6)).c)), ((int)(p1)), ((int)(p2)));
    moom.ol.a(((boolean)(false)), ((boolean)(false)));
    moom.ol.a(((boolean)(false)));
    moom.kZ.i(((int)(((moom.MA)(local6)).a)));
    return;
}


public static void a(int p0, int[] p1, int p2, int p3, moom.n3 p4) {
java.lang.Object local5 = ((moom.n3)(p4)).a__MA();
    moom.kZ.i(((int)(((moom.MA)(local5)).a)));
    moom.MS.a(((int[])(p1)), ((int)(p2)), ((int)(p3)), ((int)(0)), ((int)(0)), ((int)(0)));
    moom.kZ.i(((int)(((moom.MA)(local5)).b)));
    moom.MS.a(((int[])(p1)), ((int)(p2)), ((int)(p3)), ((int)(0)), ((int)(0)), ((int)(1)));
    moom.kZ.i(((int)(((moom.MA)(local5)).c)));
    moom.MS.a(((int[])(p1)), ((int)(p2)), ((int)(p3)), ((int)(0)), ((int)(0)), ((int)(2)));
    moom.kZ.i(((int)(((moom.MA)(local5)).a)));
    return;
}


public static void a(int[] p0, int p1, int p2, int p3, int p4, int p5) { __sourceHandlerCall_86fabd031e87e6cf47a3(p0, p1, p2, p3, p4, p5); }


public static net.minecraft.client.renderer.texture.ITextureObject a() {
moom.n3 local0 = new moom.n3(1, 1);
    (((moom.n3)(local0)).a__sourceReturn_d4d28024c9())[0] = -1;
    ((moom.n3)(local0)).b__sourceReturn_da8c82d5d4();
    return local0;
}


public static void a(int p0, int p1, int p2, int p3, moom.oe p4, net.minecraft.client.renderer.texture.TextureMap p5) { __sourceHandlerCall_236b4c96e2b87983ee50(p0, p1, p2, p3, p4, p5); }


public static void a(net.minecraft.client.renderer.texture.TextureMap p0, java.lang.String p1, int[][] p2, int p3, int p4, int p5, int p6, boolean p7, boolean p8) { __sourceHandlerCall_62e62af15fc0d487f94e(p0, p1, p2, p3, p4, p5, p6, p7, p8); }


public static void a__Void(int p0, int p1) { __sourceHandlerCall_8d21306b04cdb623c26b(p0, p1); }


public static void a(moom.MA p0) {
moom.MS.a__Void(((int)(((moom.MA)(p0)).b)), ((int)(((moom.MA)(p0)).c)));
    return;
}


public static void a__Void(int p0, int p1, int p2) { __sourceHandlerCall_65df9d8f94dad6c4b368(p0, p1, p2); }


public static void a(moom.n2 p0, int p1) { __sourceHandlerCall_b281fdfa2468b1cba928(p0, p1); }


public static void a(net.minecraft.client.renderer.texture.ITextureObject p0) { __sourceHandlerCall_69862bedc753b96d0e3f(p0); }


public static void a__Void(int p0) {
java.lang.Object local1 = ((moom.MA)(((java.util.Map)(moom.MS.d)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    moom.MS.b(((moom.MA)(local1)));
    return;
}


public static void a(int[] p0, int p1, int p2, int p3) { __sourceHandlerCall_2e97a6867a3138963d49(p0, p1, p2, p3); }


public static int[] a__ArrayInt(int p0, int p1) {
long local2 = (moom.MS.f ^ 122688271135902L);
    int[] local4 = new int[(p0 * 3)];
    java.util.Arrays.fill(((int[])(local4)), ((int)(0)), ((int)(p0)), ((int)(p1)));
    java.util.Arrays.fill(((int[])(local4)), ((int)(p0)), ((int)((p0 * 2))), ((int)(__sourceIntrinsic_238709433977_originalDynamicSite1313_2(589, (6752318382401911865L ^ local2)))));
    java.util.Arrays.fill(((int[])(local4)), ((int)((p0 * 2))), ((int)((p0 * 3))), ((int)(0)));
    return local4;
}


public static boolean a(int[] p0, int p1, int p2) { return __sourceHandlerCall_fc7cd85abbd67e573283(p0, p1, p2); }


public static void a(int[] p0, int p1, int p2, int p3, int p4) { __sourceHandlerCall_1d8c87471a9d1bbe7448(p0, p1, p2, p3, p4); }


public static void a(moom.MA p0, int[] p1, int p2, int p3, boolean p4, boolean p5) { __sourceHandlerCall_7f1c7487a2eeab738e73(p0, p1, p2, p3, p4, p5); }


public static void a(moom.MA p0, int[] p1, int p2, int p3, int p4, int p5, boolean p6, boolean p7) { __sourceHandlerCall_9ec104ece776c60e598c(p0, p1, p2, p3, p4, p5, p6, p7); }


public static int[][] a(net.minecraft.client.renderer.texture.TextureMap p0, java.lang.String p1, int p2, int p3, int p4, boolean p5, int p6) { return __sourceHandlerCall_a9463e3aaf679baf5091(p0, p1, p2, p3, p4, p5, p6); }


public static java.awt.image.BufferedImage a(moom.DD p0) { return __sourceHandlerCall_7466575e929d3bef5588(p0); }


public static int[][] a(int p0, int p1, int[][] p2) { return __sourceHandlerCall_11fbaa47e2e809577425(p0, p1, p2); }


public static void a(int[][] p0, int p1, int p2, int p3, int p4, int p5) { __sourceHandlerCall_96a00208868a5a029e28(p0, p1, p2, p3, p4, p5); }


public static int a(int p0, int p1, int p2, int p3) { return __sourceHandlerCall_d836f3d8647c45b791b4(p0, p1, p2, p3); }


public static moom.MA a(moom.n2 p0) { return __sourceHandlerCall_fa78293fc18b8448cdaf(p0); }


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic416_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_invokedynamic416_72(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1311_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5c51e7cdc795_originalDynamicSite1311_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_248c5cdd4d82_originalDynamicSite1310_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_00fcdcbe7dc7_originalDynamicSite1312_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6309_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_238709433977_originalDynamicSite1313_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_3cbd6940119b_originalDynamicSite1308_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral6299_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5a1044f09169_originalDynamicSite1309_2(int a0, long a1) throws E;
}
