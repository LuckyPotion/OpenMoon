package com.moon;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nL {

private static byte[] a;

private java.io.InputStream b;

private java.util.zip.CRC32 c;

private byte[] d;

private int e;

private int f;

private int g;

private int h;

private int i;

private int j;

private int k;

private int l;

private byte[] m;

private byte[] n;

private byte[] o;

static boolean p;

private static long q;

private static java.lang.String[] r;

private static java.lang.String[] s;

private static java.util.Map t;

private static long[] u;

private static java.lang.Integer[] v;

private static java.util.Map w;

public nL(java.io.InputStream p0) throws java.io.IOException { super(); __sourceHandlerCall_a2e39ed07709fa65a419(this, p0); }


static { __sourceHandlerCall_44c39b4cd01d4a015410(); }

private static native <E extends Throwable> void __sourceHandlerCall_44c39b4cd01d4a015410() throws E;
private static final class __SourceHandler_44c39b4cd01d4a015410 {

public static void f47() throws Throwable {
    javax.crypto.Cipher forestValue47_36_0;
    int forestValue47_36_1;
    javax.crypto.SecretKeyFactory forestValue47_36_2;
    byte[] forestValue47_36_3;
    javax.crypto.Cipher forestValue47_53_0;
    int forestValue47_53_1;
    javax.crypto.SecretKeyFactory forestValue47_53_2;
    byte[] forestValue47_53_3;
    java.lang.String forestValue47_86_0;
    int forestValue47_86_1;
    java.lang.String forestValue47_98_0;
    java.lang.String forestValue47_122_0;
    javax.crypto.Cipher forestValue47_182_0;
    int forestValue47_182_1;
    javax.crypto.SecretKeyFactory forestValue47_182_2;
    byte[] forestValue47_182_3;
    javax.crypto.Cipher forestValue47_199_0;
    int forestValue47_199_1;
    javax.crypto.SecretKeyFactory forestValue47_199_2;
    byte[] forestValue47_199_3;
    long[] forestValue47_303_0;
    int forestValue47_303_1;
    long forestValue47_303_2;
    int forestValue47_303_3;
    long[] forestValue47_446_0;
    int forestValue47_446_1;
    long forestValue47_446_2;
    long[] forestValue47_458_0;
    int forestValue47_458_1;
    long forestValue47_458_2;
    int forestValue47_556_0;
    javax.crypto.Cipher spill47_0;
    int spill47_1;
    javax.crypto.SecretKeyFactory spill47_2;
    byte[] spill47_3;
    byte[] spill47_4;
    java.lang.String spill47_5;
    int spill47_6;
    java.lang.String spill47_7;
    java.lang.String[] spill47_8;
    java.lang.String[] spill47_9;
    java.lang.String spill47_10;
    java.lang.String spill47_11;
    int spill47_12;
    javax.crypto.Cipher spill47_13;
    int spill47_14;
    javax.crypto.SecretKeyFactory spill47_15;
    byte[] spill47_16;
    byte[] spill47_17;
    java.lang.String spill47_18;
    int spill47_19;
    int spill47_20;
    long spill47_21;
    byte[] spill47_22;
    byte[] spill47_23;
    byte[] spill47_24;
    byte[] spill47_25;
    byte[] spill47_26;
    byte[] spill47_27;
    byte[] spill47_28;
    byte[] spill47_29;
    long spill47_30;
    int spill47_31;
    java.lang.String spill47_32;
    int spill47_33;
    long[] spill47_34;
    int spill47_35;
    long spill47_36;
    int spill47_37;
    byte[] spill47_38;
    byte[] spill47_39;
    byte[] spill47_40;
    byte[] spill47_41;
    byte[] spill47_42;
    byte[] spill47_43;
    byte[] spill47_44;
    byte[] spill47_45;
    long life20_11;
    javax.crypto.Cipher life11_20;
    int life12_35;
    java.lang.String[] life18_66;
    int life16_68;
    java.lang.String life15_71;
    int life17_73;
    int life14_75;
    int life13_77;
    byte[] life19_93;
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
    byte[] life7_474;
    forest_join_556: {
    forest_join_555: {
    forest_join_545: {
    forest_join_199: {
    forest_join_153: {
    forest_join_53: {
    __fieldWrite47_4(__call47_3(__call47_2(1749469378733429428L, 4765696977492688837L, __call47_1(__call47_0())), 196607316849734L));
    life20_11 = (__fieldRead47_5() ^ 109959134947676L);
    __fieldWrite47_6(new java.util.HashMap(13));
    spill47_0 = (life11_20 = __call47_7("DES/CBC/PKCS5Padding"));
    spill47_1 = 2;
    spill47_2 = __call47_8("DES");
    byte[] __stackOp47_9_0 = new byte[8];
    spill47_3 = __stackOp47_9_0;
    (__stackOp47_9_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life12_35 = 1;
    forestValue47_36_0 = spill47_0;
    forestValue47_36_1 = spill47_1;
    forestValue47_36_2 = spill47_2;
    forestValue47_36_3 = spill47_3;
    forest_cycle_36: while (true) {
    if (!((life12_35 < 8))) {
        forestValue47_53_0 = forestValue47_36_0;
        forestValue47_53_1 = forestValue47_36_1;
        forestValue47_53_2 = forestValue47_36_2;
        forestValue47_53_3 = forestValue47_36_3;
        break forest_join_53;
    }
    byte[] __stackOp47_10_0 = forestValue47_36_3;
    spill47_4 = __stackOp47_10_0;
    (__stackOp47_10_0)[life12_35] = ((byte) ((int) ((life20_11 << (life12_35 * 8)) >>> 56)));
    life12_35 += 1;
    forestValue47_36_3 = spill47_4;
    continue forest_cycle_36;
    }
    }
    __call47_12(forestValue47_53_0, forestValue47_53_1, __call47_11(forestValue47_53_2, new javax.crypto.spec.DESKeySpec(forestValue47_53_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life18_66 = new java.lang.String[24];
    life16_68 = 0;
    life17_73 = __call47_13((life15_71 = "3dC2-ý<Ö\003\0224S;$´.îü@%\017Òw:ÓIÄ÷òGHtùÆCº!æ\023¥3ZMìÕ\0131\033F\037­½¬\b·ÑÜñ(¦éL4\016gøúBHÿ½:4${¯5pÆj3ÔÿÊ¶q+Á&#Ð×Ó\t/8ÃÜ?.ÿ1§\024\013lj9&ÿL/÷Ò\024ª\177Ü=ÂùÁõ³J=á\021\025£\034ò\022\034Y;õÅ>~5Fÿ'H\004\030~_4â¢vs\024D§Æ3*FV#Û{Ö¯~Käßn£Ùaq^\021ô&\006ß\177Ò^EÄÙ+P4g'\017\tò¹\036Ærõ\034b@áÂ>\036\f(«ÙÁò«\016/+M*eÅ7ÿXËå\027\037¿\037×«x\021BÙ²Gw\013µB%°I\0218òí§(S¤f»Ö?Á²Dª\020\0074âWÃÍwDó)ñ\026É&~»t§Ëè\003Óê\032Î)\033«\027´A\032\033ýÕ\f(\núû&nM½\023L«\020&mV1ÇÅJ\000C©r½@w]³ó\nãA\007ñV8F,\032>ìÃLÁ\034\020À\027z\001\f6H\001*òô\027´Q±Æ2ó£Õfz~\005\032Ï\024Ybù7î2{~XÉ>Ý\030¢\006\"V»`\r\bkMo\037£ç_ oú\n¼üp\020(qø#ÓAð½\017\nÕ*ß[y0Øì\0374~s\022\017?À\016×<ùÔ°(.©\020\016ª\002¬®£\"C°\032\024Ã4â\013©8héÔÚî6rÕS(á\0050Ü\\ãM=\035¼èÚ¢DÖe·p\b-8\006-/ð)öÅ¶V£Î(ÛqÜÛÍ½``}'®QI\031L5zìä­\177[êc\rÜ}\016\f~S\017\020Eï\033\023(eNIt6\004\030\037µù#\026\nUÈK¹Ï±¾~Ü\030Öì³¶Fuö¦À±\031V\020ÛU¨ÆÌ\007õ3\n\002\002F@¨}¨Å\005ó)-@qÇ¡\"\036/J#8\022£4OúùXÇNbÈ2tß.ßáÆàLä:¦¶\004©µ¶\036åK\031kd,üòð0ì´¼¾Gr(´+¤§\025ÓåøÊã\022 73ö«ß`\032\003=S.\030\rñ$¯\035¡°<RSHñN k¤Wà>EvË'Q×0ón\016ñÛ\026yøi>8È ~«Ü\004þ(¼*Dë>»Ã7t`£Ï-Äõú>\032$\007åù\017¥\b\034KJLg¢\"òláÎ_\031sÃ³\030Î[ØÊIwùÑ\001¤¬/h\026#½{j\tbÌ(ÑÎ\027PòÔÔi¸2\002Ú\003H­\006au{îâtO¬è¹Eqå&6+\034±¤5þ8À\0300A WÆ\0069\004Õ¶±mpêÃrmû\013ç÷))?Ú¤Wx\007Ñ;\033Åô^\031\177ß\036¾$ùÞdAñdt±ð"));
    life14_75 = 64;
    life13_77 = -1;
    forest_cycle_78: while (true) {
    forest_join_148: {
    life13_77 += 1;
    spill47_5 = life15_71;
    int __stackOp47_14_0 = life13_77;
    forestValue47_86_0 = __call47_15(spill47_5, __stackOp47_14_0, (__stackOp47_14_0 + life14_75));
    forestValue47_86_1 = -1;
    forest_cycle_86: while (true) {
    forest_join_139: {
    forest_join_122: {
    forest_join_112: {
    forest_join_98: {
    java.lang.String __stackOp47_16_0 = forestValue47_86_0;
    int __stackOp47_16_1 = forestValue47_86_1;
    spill47_6 = __stackOp47_16_1;
    byte[] __stackOp47_18_0 = __call47_17(__stackOp47_16_0, "ISO-8859-1");
    javax.crypto.Cipher __stackOp47_18_1 = life11_20;
    life19_93 = __call47_19(__stackOp47_18_1, __stackOp47_18_0);
    int __stackOp47_22_0 = spill47_6;
    java.lang.String __stackOp47_22_1 = __call47_21(__call47_20(life19_93));
    spill47_7 = __stackOp47_22_1;
    switch (__stackOp47_22_0) {
default:
{
        forestValue47_98_0 = spill47_7;
        break forest_join_98;
    }
case 0:
{
        forestValue47_122_0 = spill47_7;
        break forest_join_122;
    }
}
    }
    java.lang.String __stackOp47_23_0 = forestValue47_98_0;
    java.lang.String[] __stackOp47_23_1 = life18_66;
    spill47_8 = __stackOp47_23_1;
    java.lang.String __stackOp47_24_0 = __stackOp47_23_0;
    int __stackOp47_24_1 = (life16_68++);
    (spill47_8)[__stackOp47_24_1] = __stackOp47_24_0;
    if (!(((life13_77 = (life13_77 + life14_75)) < life17_73))) {
        break forest_join_112;
    }
    break forest_join_148;
    }
    life17_73 = __call47_25((life15_71 = "\025\036H\005]Ì\017ô÷ö_÷oÌÞfqmëíAË\rÈú®Rä\bÚaJ¨sm½8²õ¬UË2ëóð¦^Ç7ìõ)~\032üQ\003ì0\013Ýdg&9w#®T¥ô\000$18¦À¢µÕ÷æg\003±ç,ÄÍ«´q;PÞæz#ÑY©n\030"));
    life14_75 = 64;
    life13_77 = -1;
    break forest_join_139;
    }
    java.lang.String __stackOp47_26_0 = forestValue47_122_0;
    java.lang.String[] __stackOp47_26_1 = life18_66;
    spill47_9 = __stackOp47_26_1;
    java.lang.String __stackOp47_27_0 = __stackOp47_26_0;
    int __stackOp47_27_1 = (life16_68++);
    (spill47_9)[__stackOp47_27_1] = __stackOp47_27_0;
    if (!(((life13_77 = (life13_77 + life14_75)) < life17_73))) {
        break forest_join_153;
    }
    life14_75 = __integerCategory47_29(__call47_28(life15_71, life13_77));
    }
    life13_77 += 1;
    spill47_10 = life15_71;
    int __stackOp47_30_0 = life13_77;
    spill47_11 = __call47_31(spill47_10, __stackOp47_30_0, (__stackOp47_30_0 + life14_75));
    spill47_12 = 0;
    forestValue47_86_0 = spill47_11;
    forestValue47_86_1 = spill47_12;
    continue forest_cycle_86;
    }
    }
    life14_75 = __integerCategory47_33(__call47_32(life15_71, life13_77));
    continue forest_cycle_78;
    }
    }
    __fieldWrite47_34(life18_66);
    __fieldWrite47_35(new java.lang.String[24]);
    __fieldWrite47_36(new java.util.HashMap(13));
    spill47_13 = (life0_169 = __call47_37("DES/CBC/NoPadding"));
    spill47_14 = 2;
    spill47_15 = __call47_38("DES");
    byte[] __stackOp47_39_0 = new byte[8];
    spill47_16 = __stackOp47_39_0;
    (__stackOp47_39_0)[0] = ((byte) ((int) (life20_11 >>> 56)));
    life1_184 = 1;
    forestValue47_182_0 = spill47_13;
    forestValue47_182_1 = spill47_14;
    forestValue47_182_2 = spill47_15;
    forestValue47_182_3 = spill47_16;
    forest_cycle_182: while (true) {
    if (!((life1_184 < 8))) {
        forestValue47_199_0 = forestValue47_182_0;
        forestValue47_199_1 = forestValue47_182_1;
        forestValue47_199_2 = forestValue47_182_2;
        forestValue47_199_3 = forestValue47_182_3;
        break forest_join_199;
    }
    byte[] __stackOp47_40_0 = forestValue47_182_3;
    spill47_17 = __stackOp47_40_0;
    (__stackOp47_40_0)[life1_184] = ((byte) ((int) ((life20_11 << (life1_184 * 8)) >>> 56)));
    life1_184 += 1;
    forestValue47_182_3 = spill47_17;
    continue forest_cycle_182;
    }
    }
    __call47_42(forestValue47_199_0, forestValue47_199_1, __call47_41(forestValue47_199_2, new javax.crypto.spec.DESKeySpec(forestValue47_199_3)), new javax.crypto.spec.IvParameterSpec(new byte[8]));
    life6_215 = new long[30];
    life3_217 = 0;
    life5_222 = __call47_43((life4_220 = "/§x¯Æ79ÞÁä|¥æÆÄ¾¥Âq³£j\016$3TÝÜ\021\001«·±e~pkÈRóÓ¨\023=ÑÊ\002$²ÍÝÜ#kÄg9@îo-íÛÖç;X­\nuõÍ:ûÓý\013\\xäNN¶ÙÜ*Ö2ï&B\r\020\177Yèrÿë\000\f\001Ø6òµ\0218ç2 q\004$Ù¶ïêþÍ\\t5C÷~¼eAÈ_\016m`mÅ×C`ÖÂ\r8¹zþó\fBâB°Ç¾R÷\177«¹\007B\026\023\\ës¼W&à\b¾ÿ[°8ÐË¸Ü\177]!ëÛ¨êds%ª\"øº0\\@ß1E#"));
    life2_224 = 0;
    forest_cycle_222: while (true) {
    spill47_18 = life4_220;
    spill47_19 = life2_224;
    life2_224 += 8;
    life7_232 = __call47_45(__call47_44(spill47_18, spill47_19, life2_224), "ISO-8859-1");
    forestValue47_303_0 = life6_215;
    forestValue47_303_1 = (life3_217++);
    forestValue47_303_2 = (((((((((((long) (life7_232)[0]) & 255L) << 56) | ((((long) (life7_232)[1]) & 255L) << 48)) | ((((long) (life7_232)[2]) & 255L) << 40)) | ((((long) (life7_232)[3]) & 255L) << 32)) | ((((long) (life7_232)[4]) & 255L) << 24)) | ((((long) (life7_232)[5]) & 255L) << 16)) | ((((long) (life7_232)[6]) & 255L) << 8)) | (((long) (life7_232)[7]) & 255L));
    forestValue47_303_3 = -1;
    forest_cycle_303: while (true) {
    forest_join_463: {
    forest_join_458: {
    forest_join_446: {
    long __stackOp47_46_0 = forestValue47_303_2;
    int __stackOp47_46_1 = forestValue47_303_3;
    spill47_20 = __stackOp47_46_1;
    spill47_21 = __stackOp47_46_0;
    __discardScalar47_47(__stackOp47_46_1);
    life8_309 = spill47_21;
    byte[] __stackOp47_48_0 = new byte[8];
    spill47_22 = __stackOp47_48_0;
    (__stackOp47_48_0)[0] = ((byte) ((int) (life8_309 >>> 56)));
    byte[] __stackOp47_49_0 = spill47_22;
    spill47_23 = __stackOp47_49_0;
    (__stackOp47_49_0)[1] = ((byte) ((int) (life8_309 >>> 48)));
    byte[] __stackOp47_50_0 = spill47_23;
    spill47_24 = __stackOp47_50_0;
    (__stackOp47_50_0)[2] = ((byte) ((int) (life8_309 >>> 40)));
    byte[] __stackOp47_51_0 = spill47_24;
    spill47_25 = __stackOp47_51_0;
    (__stackOp47_51_0)[3] = ((byte) ((int) (life8_309 >>> 32)));
    byte[] __stackOp47_52_0 = spill47_25;
    spill47_26 = __stackOp47_52_0;
    (__stackOp47_52_0)[4] = ((byte) ((int) (life8_309 >>> 24)));
    byte[] __stackOp47_53_0 = spill47_26;
    spill47_27 = __stackOp47_53_0;
    (__stackOp47_53_0)[5] = ((byte) ((int) (life8_309 >>> 16)));
    byte[] __stackOp47_54_0 = spill47_27;
    spill47_28 = __stackOp47_54_0;
    (__stackOp47_54_0)[6] = ((byte) ((int) (life8_309 >>> 8)));
    byte[] __stackOp47_55_0 = spill47_28;
    spill47_29 = __stackOp47_55_0;
    (__stackOp47_55_0)[7] = ((byte) ((int) life8_309));
    byte[] __stackOp47_56_0 = spill47_29;
    javax.crypto.Cipher __stackOp47_56_1 = life0_169;
    life10_377 = __call47_57(__stackOp47_56_1, __stackOp47_56_0);
    int __stackOp47_58_0 = spill47_20;
    long __stackOp47_58_1 = (((((((((((long) (life10_377)[0]) & 255L) << 56) | ((((long) (life10_377)[1]) & 255L) << 48)) | ((((long) (life10_377)[2]) & 255L) << 40)) | ((((long) (life10_377)[3]) & 255L) << 32)) | ((((long) (life10_377)[4]) & 255L) << 24)) | ((((long) (life10_377)[5]) & 255L) << 16)) | ((((long) (life10_377)[6]) & 255L) << 8)) | (((long) (life10_377)[7]) & 255L));
    spill47_30 = __stackOp47_58_1;
    spill47_31 = __stackOp47_58_0;
    __discardWide47_59(__stackOp47_58_1);
    switch (spill47_31) {
default:
{
        forestValue47_446_0 = forestValue47_303_0;
        forestValue47_446_1 = forestValue47_303_1;
        forestValue47_446_2 = spill47_30;
        break forest_join_446;
    }
case 0:
{
        forestValue47_458_0 = forestValue47_303_0;
        forestValue47_458_1 = forestValue47_303_1;
        forestValue47_458_2 = spill47_30;
        break forest_join_458;
    }
}
    }
    (forestValue47_446_0)[forestValue47_446_1] = forestValue47_446_2;
    if (!((life2_224 >= life5_222))) {
        continue forest_cycle_222;
    }
    life5_222 = __call47_60((life4_220 = "e\037ô\002©kB#\032Âb~2¹W"));
    life2_224 = 0;
    break forest_join_463;
    }
    (forestValue47_458_0)[forestValue47_458_1] = forestValue47_458_2;
    if (!((life2_224 >= life5_222))) {
        break forest_join_463;
    }
    break forest_join_545;
    }
    spill47_32 = life4_220;
    spill47_33 = life2_224;
    life2_224 += 8;
    life7_474 = __call47_62(__call47_61(spill47_32, spill47_33, life2_224), "ISO-8859-1");
    spill47_34 = life6_215;
    spill47_35 = (life3_217++);
    spill47_36 = (((((((((((long) (life7_474)[0]) & 255L) << 56) | ((((long) (life7_474)[1]) & 255L) << 48)) | ((((long) (life7_474)[2]) & 255L) << 40)) | ((((long) (life7_474)[3]) & 255L) << 32)) | ((((long) (life7_474)[4]) & 255L) << 24)) | ((((long) (life7_474)[5]) & 255L) << 16)) | ((((long) (life7_474)[6]) & 255L) << 8)) | (((long) (life7_474)[7]) & 255L));
    spill47_37 = 0;
    forestValue47_303_0 = spill47_34;
    forestValue47_303_1 = spill47_35;
    forestValue47_303_2 = spill47_36;
    forestValue47_303_3 = spill47_37;
    continue forest_cycle_303;
    }
    }
    }
    __fieldWrite47_63(life6_215);
    __fieldWrite47_64(new java.lang.Integer[30]);
    if (!((!__call47_66(__classLiteral47_65())))) {
        break forest_join_555;
    }
    forestValue47_556_0 = 1;
    break forest_join_556;
    }
    forestValue47_556_0 = 0;
    }
    __fieldWrite47_67(forestValue47_556_0);
    byte[] __stackOp47_69_0 = new byte[__invokedynamic47_68(17883, (2803015405497940437L ^ life20_11))];
    spill47_38 = __stackOp47_69_0;
    (__stackOp47_69_0)[0] = __integerCategory47_71(__invokedynamic47_70(8632, (5012715153930984879L ^ life20_11)));
    byte[] __stackOp47_72_0 = spill47_38;
    spill47_39 = __stackOp47_72_0;
    (__stackOp47_72_0)[1] = __integerCategory47_74(__invokedynamic47_73(9028, (6524360681373736797L ^ life20_11)));
    byte[] __stackOp47_75_0 = spill47_39;
    spill47_40 = __stackOp47_75_0;
    (__stackOp47_75_0)[2] = __integerCategory47_77(__invokedynamic47_76(3085, (3043130803445641238L ^ life20_11)));
    byte[] __stackOp47_78_0 = spill47_40;
    spill47_41 = __stackOp47_78_0;
    (__stackOp47_78_0)[3] = __integerCategory47_80(__invokedynamic47_79(7649, (140669947599135204L ^ life20_11)));
    byte[] __stackOp47_81_0 = spill47_41;
    spill47_42 = __stackOp47_81_0;
    (__stackOp47_81_0)[4] = __integerCategory47_83(__invokedynamic47_82(8736, (1030312280212676132L ^ life20_11)));
    byte[] __stackOp47_84_0 = spill47_42;
    spill47_43 = __stackOp47_84_0;
    (__stackOp47_84_0)[5] = __integerCategory47_86(__invokedynamic47_85(11517, (105835340265230582L ^ life20_11)));
    byte[] __stackOp47_87_0 = spill47_43;
    spill47_44 = __stackOp47_87_0;
    (__stackOp47_87_0)[__invokedynamic47_88(14165, (3075674863239990089L ^ life20_11))] = __integerCategory47_90(__invokedynamic47_89(27186, (6904536037377398328L ^ life20_11)));
    byte[] __stackOp47_91_0 = spill47_44;
    spill47_45 = __stackOp47_91_0;
    (__stackOp47_91_0)[__invokedynamic47_92(10797, (7090060346535253540L ^ life20_11))] = __integerCategory47_94(__invokedynamic47_93(11517, (105835340265230582L ^ life20_11)));
    __fieldWrite47_95(spill47_45);
    return;
}
public static void h47_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call3004700_0(p0);
}
private static native java.lang.invoke.MethodHandles.Lookup __call47_0() throws Throwable;
private static native java.lang.Class __call47_1(java.lang.invoke.MethodHandles.Lookup a0) throws Throwable;
private static native moom._a __call47_2(long a0, long a1, java.lang.Class a2) throws Throwable;
private static native long __call47_3(moom._a a0, long a1) throws Throwable;
private static native void __fieldWrite47_4(long a0) throws Throwable;
private static native long __fieldRead47_5() throws Throwable;
private static native void __fieldWrite47_6(java.util.HashMap a0) throws Throwable;
private static native javax.crypto.Cipher __call47_7(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call47_8(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call47_11(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call47_12(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call47_13(java.lang.String a0) throws Throwable;
private static native java.lang.String __call47_15(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call47_17(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native byte[] __call47_19(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native java.lang.String __call47_20(byte[] a0) throws Throwable;
private static native java.lang.String __call47_21(java.lang.String a0) throws Throwable;
private static native int __call47_25(java.lang.String a0) throws Throwable;
private static native char __call47_28(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory47_29(char value) throws Throwable;
private static native java.lang.String __call47_31(java.lang.String a0, int a1, int a2) throws Throwable;
private static native char __call47_32(java.lang.String a0, int a1) throws Throwable;
private static native int __integerCategory47_33(char value) throws Throwable;
private static native void __fieldWrite47_34(java.lang.String[] a0) throws Throwable;
private static native void __fieldWrite47_35(java.lang.String[] a0) throws Throwable;
private static native void __fieldWrite47_36(java.util.HashMap a0) throws Throwable;
private static native javax.crypto.Cipher __call47_37(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKeyFactory __call47_38(java.lang.String a0) throws Throwable;
private static native javax.crypto.SecretKey __call47_41(javax.crypto.SecretKeyFactory a0, javax.crypto.spec.DESKeySpec a1) throws Throwable;
private static native void __call47_42(javax.crypto.Cipher a0, int a1, javax.crypto.SecretKey a2, javax.crypto.spec.IvParameterSpec a3) throws Throwable;
private static native int __call47_43(java.lang.String a0) throws Throwable;
private static native java.lang.String __call47_44(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call47_45(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __discardScalar47_47(int a0) throws Throwable;
private static native byte[] __call47_57(javax.crypto.Cipher a0, byte[] a1) throws Throwable;
private static native void __discardWide47_59(long a0) throws Throwable;
private static native int __call47_60(java.lang.String a0) throws Throwable;
private static native java.lang.String __call47_61(java.lang.String a0, int a1, int a2) throws Throwable;
private static native byte[] __call47_62(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __fieldWrite47_63(long[] a0) throws Throwable;
private static native void __fieldWrite47_64(java.lang.Integer[] a0) throws Throwable;
private static native java.lang.Class __classLiteral47_65() throws Throwable;
private static native boolean __call47_66(java.lang.Class a0) throws Throwable;
private static native void __fieldWrite47_67(int a0) throws Throwable;
private static native int __invokedynamic47_68(int a0, long a1) throws Throwable;
private static native int __invokedynamic47_70(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_71(int value) throws Throwable;
private static native int __invokedynamic47_73(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_74(int value) throws Throwable;
private static native int __invokedynamic47_76(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_77(int value) throws Throwable;
private static native int __invokedynamic47_79(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_80(int value) throws Throwable;
private static native int __invokedynamic47_82(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_83(int value) throws Throwable;
private static native int __invokedynamic47_85(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_86(int value) throws Throwable;
private static native int __invokedynamic47_88(int a0, long a1) throws Throwable;
private static native int __invokedynamic47_89(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_90(int value) throws Throwable;
private static native int __invokedynamic47_92(int a0, long a1) throws Throwable;
private static native int __invokedynamic47_93(int a0, long a1) throws Throwable;
private static native byte __integerCategory47_94(int value) throws Throwable;
private static native void __fieldWrite47_95(byte[] a0) throws Throwable;
private static native java.lang.Exception __call3004700_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_a2e39ed07709fa65a419(com.moon.nL a0, java.io.InputStream a1) throws E;
private static final class __SourceHandler_a2e39ed07709fa65a419 {

public static void f48(com.moon.nL receiver, java.io.InputStream p0) throws Throwable {
    com.moon.nL forestValue48_56_0;
    com.moon.nL forestValue48_81_0;
    boolean spill48_0;
    com.moon.nL spill48_1;
    com.moon.nL spill48_2;
    long life2_3;
    int life4_23;
    forest_join_92: {
    forest_join_81: {
    forest_join_74: {
    forest_join_56: {
    forest_join_46: {
    life2_3 = (__fieldRead48_0() ^ 7460787208370L);
    spill48_0 = __call48_1();
    __directSuperInit48_2(receiver);
    __fieldWrite48_3(receiver, p0);
    __fieldWrite48_4(receiver, new java.util.zip.CRC32());
    __fieldWrite48_6(receiver, new byte[__invokedynamic48_5(19567, (4433633240221915523L ^ life2_3))]);
    life4_23 = __integerCategory48_7(spill48_0);
    __call48_10(receiver, __fieldRead48_8(receiver), 0, (__fieldRead48_9()).length);
    spill48_1 = receiver;
    if (!((life4_23 != 0))) {
        forestValue48_56_0 = spill48_1;
        break forest_join_56;
    }
    if (!((!__call48_12(__fieldRead48_11(spill48_1))))) {
        break forest_join_46;
    }
    throw new java.io.IOException(__invokedynamic48_13(24910, (4144642717514878548L ^ life2_3)));
    }
    __call48_15(receiver, __invokedynamic48_14(27770, (3133319654943046022L ^ life2_3)));
    __call48_16(receiver);
    forestValue48_56_0 = receiver;
    }
    __call48_17(forestValue48_56_0);
    forest_cycle_57: while (true) {
    forest_join_70: {
    forest_join_68: {
    forest_join_64: {
    forest_join_62: {
    __call48_18(receiver);
    switch (__fieldRead48_19(receiver)) {
case 1229209940:
{
        break forest_join_62;
    }
case 1347179589:
{
        break forest_join_64;
    }
case 1951551059:
{
        break forest_join_68;
    }
default:
{
        break forest_join_70;
    }
}
    }
    if (!((life4_23 == 0))) {
        break forest_join_74;
    }
    }
    __call48_20(receiver);
    if (!((life4_23 == 0))) {
        break forest_join_70;
    }
    }
    __call48_21(receiver);
    }
    __call48_22(receiver);
    if (!((life4_23 == 0))) {
        continue forest_cycle_57;
    }
    break forest_cycle_57;
    }
    }
    spill48_2 = receiver;
    if (!((life4_23 != 0))) {
        forestValue48_81_0 = spill48_2;
        break forest_join_81;
    }
    if (!((__fieldRead48_23(spill48_2) == 3))) {
        break forest_join_92;
    }
    forestValue48_81_0 = receiver;
    }
    if (!((__fieldRead48_24(forestValue48_81_0) == null))) {
        break forest_join_92;
    }
    throw new java.io.IOException(__invokedynamic48_25(10069, (3842202938920568905L ^ life2_3)));
    }
    return;
}
public static void h48_0(java.io.IOException p0) throws Throwable {
    throw __call3004800_0(p0);
}
public static void h48_1(java.io.IOException p0) throws Throwable {
    throw __call3004801_0(p0);
}
public static void h48_2(java.io.IOException p0) throws Throwable {
    throw __call3004802_0(p0);
}
public static void h48_3(java.io.IOException p0) throws Throwable {
    throw __call3004803_0(p0);
}
public static void h48_4(java.io.IOException p0) throws Throwable {
    throw __call3004804_0(p0);
}
public static void h48_5(java.io.IOException p0) throws Throwable {
    throw __call3004805_0(p0);
}
public static void h48_6(java.io.IOException p0) throws Throwable {
    throw __call3004806_0(p0);
}
private static native long __fieldRead48_0() throws Throwable;
private static native boolean __call48_1() throws Throwable;
private static native void __directSuperInit48_2(com.moon.nL a0) throws Throwable;
private static native void __fieldWrite48_3(com.moon.nL a0, java.io.InputStream a1) throws Throwable;
private static native void __fieldWrite48_4(com.moon.nL a0, java.util.zip.CRC32 a1) throws Throwable;
private static native int __invokedynamic48_5(int a0, long a1) throws Throwable;
private static native void __fieldWrite48_6(com.moon.nL a0, byte[] a1) throws Throwable;
private static native int __integerCategory48_7(boolean value) throws Throwable;
private static native byte[] __fieldRead48_8(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead48_9() throws Throwable;
private static native void __call48_10(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native byte[] __fieldRead48_11(com.moon.nL a0) throws Throwable;
private static native boolean __call48_12(byte[] a0) throws Throwable;
private static native java.lang.String __invokedynamic48_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic48_14(int a0, long a1) throws Throwable;
private static native void __call48_15(com.moon.nL a0, int a1) throws Throwable;
private static native void __call48_16(com.moon.nL a0) throws Throwable;
private static native void __call48_17(com.moon.nL a0) throws Throwable;
private static native void __call48_18(com.moon.nL a0) throws Throwable;
private static native int __fieldRead48_19(com.moon.nL a0) throws Throwable;
private static native void __call48_20(com.moon.nL a0) throws Throwable;
private static native void __call48_21(com.moon.nL a0) throws Throwable;
private static native void __call48_22(com.moon.nL a0) throws Throwable;
private static native int __fieldRead48_23(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead48_24(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic48_25(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3004800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3004801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3004802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3004803_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3004804_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3004805_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3004806_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9411c8cda3616f832e6d(com.moon.nL a0, byte a1, byte a2, byte a3) throws E;
private static final class __SourceHandler_9411c8cda3616f832e6d {

public static void f44(com.moon.nL receiver, byte p0, byte p1, byte p2) throws Throwable {
    com.moon.nL lexicalValue44_21_0;
    byte[] lexicalValue44_104_0;
    int lexicalValue44_104_1;
    com.moon.nL spill44_0;
    com.moon.nL spill44_1;
    byte[] spill44_2;
    byte[] spill44_3;
    byte[] spill44_4;
    byte[] spill44_5;
    byte[] spill44_6;
    byte[] spill44_7;
    byte[] spill44_8;
    int spill44_9;
    byte[] spill44_10;
    int spill44_11;
    byte[] spill44_12;
    int spill44_13;
    long life4_3;
    int life6_5;
    byte[] life7_27;
    int life8_83;
    int life9_85;
    lexical_join_110: {
    lexical_join_68: {
    lexical_join_61: {
    lexical_join_21: {
    lexical_join_20: {
    life4_3 = (__fieldRead44_0() ^ 65738257929222L);
    life6_5 = __integerCategory44_2(__call44_1());
    spill44_0 = receiver;
    if (!((life6_5 != 0))) {
        lexicalValue44_21_0 = spill44_0;
        break lexical_join_21;
    }
    if (!(__call44_3(spill44_0))) {
        break lexical_join_20;
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic44_4(25053, (2246833697067833978L ^ life4_3)));
    }
    lexicalValue44_21_0 = receiver;
    }
    life7_27 = __fieldRead44_5(lexicalValue44_21_0);
    if (!((life6_5 != 0))) {
        break lexical_join_68;
    }
    if (!((life7_27 == null))) {
        break lexical_join_61;
    }
    spill44_1 = receiver;
    byte[] __stackOp44_7_0 = new byte[__invokedynamic44_6(14165, (3075573949135468051L ^ life4_3))];
    spill44_2 = __stackOp44_7_0;
    (__stackOp44_7_0)[0] = __integerCategory44_8(0);
    byte[] __stackOp44_9_0 = spill44_2;
    spill44_3 = __stackOp44_9_0;
    (__stackOp44_9_0)[1] = p0;
    byte[] __stackOp44_10_0 = spill44_3;
    spill44_4 = __stackOp44_10_0;
    (__stackOp44_10_0)[2] = __integerCategory44_11(0);
    byte[] __stackOp44_12_0 = spill44_4;
    spill44_5 = __stackOp44_12_0;
    (__stackOp44_12_0)[3] = p1;
    byte[] __stackOp44_13_0 = spill44_5;
    spill44_6 = __stackOp44_13_0;
    (__stackOp44_13_0)[4] = __integerCategory44_14(0);
    byte[] __stackOp44_15_0 = spill44_6;
    spill44_7 = __stackOp44_15_0;
    (__stackOp44_15_0)[5] = p2;
    __fieldWrite44_16(spill44_1, spill44_7);
    if (!((life6_5 == 0))) {
        break lexical_join_110;
    }
    }
    __fieldWrite44_17(receiver, new byte[((life7_27).length / 3)]);
    }
    life8_83 = 0;
    life9_85 = 0;
    lexical_cycle_72: while (true) {
    lexical_join_106: {
    lexical_join_104: {
    lexical_join_101: {
    if (!((life8_83 < (life7_27).length))) {
        break lexical_join_110;
    }
    spill44_8 = life7_27;
    spill44_9 = life8_83;
    if (!((life6_5 != 0))) {
        lexicalValue44_104_0 = spill44_8;
        lexicalValue44_104_1 = spill44_9;
        break lexical_join_104;
    }
    if (!(((spill44_8)[spill44_9] == p0))) {
        break lexical_join_101;
    }
    spill44_10 = life7_27;
    spill44_11 = (life8_83 + 1);
    if (!((life6_5 != 0))) {
        lexicalValue44_104_0 = spill44_10;
        lexicalValue44_104_1 = spill44_11;
        break lexical_join_104;
    }
    if (!(((spill44_10)[spill44_11] == p1))) {
        break lexical_join_101;
    }
    spill44_12 = life7_27;
    spill44_13 = (life8_83 + 2);
    if (!((life6_5 != 0))) {
        lexicalValue44_104_0 = spill44_12;
        lexicalValue44_104_1 = spill44_13;
        break lexical_join_104;
    }
    if (!(((spill44_12)[spill44_13] != p2))) {
        break lexical_join_106;
    }
    }
    lexicalValue44_104_0 = __fieldRead44_18(receiver);
    lexicalValue44_104_1 = life9_85;
    }
    (lexicalValue44_104_0)[lexicalValue44_104_1] = __integerCategory44_19(-1);
    }
    life8_83 += 3;
    life9_85 += 1;
    if (!((life6_5 == 0))) { continue lexical_cycle_72; }
    break lexical_cycle_72;
    }
    }
    return;
}
public static void h44_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004400_0(p0);
}
public static void h44_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004401_0(p0);
}
public static void h44_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004402_0(p0);
}
public static void h44_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004403_0(p0);
}
public static void h44_4(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004404_0(p0);
}
public static void h44_5(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004405_0(p0);
}
public static void h44_6(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004406_0(p0);
}
public static void h44_7(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004407_0(p0);
}
public static void h44_8(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004408_0(p0);
}
public static void h44_9(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004409_0(p0);
}
public static void h44_10(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004410_0(p0);
}
private static native long __fieldRead44_0() throws Throwable;
private static native boolean __call44_1() throws Throwable;
private static native int __integerCategory44_2(boolean value) throws Throwable;
private static native boolean __call44_3(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic44_4(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead44_5(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic44_6(int a0, long a1) throws Throwable;
private static native byte __integerCategory44_8(int value) throws Throwable;
private static native byte __integerCategory44_11(int value) throws Throwable;
private static native byte __integerCategory44_14(int value) throws Throwable;
private static native void __fieldWrite44_16(com.moon.nL a0, byte[] a1) throws Throwable;
private static native void __fieldWrite44_17(com.moon.nL a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead44_18(com.moon.nL a0) throws Throwable;
private static native byte __integerCategory44_19(int value) throws Throwable;
private static native java.lang.Exception __call1004400_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004401_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004402_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004403_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004404_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004405_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004406_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004407_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004408_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004409_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004410_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_24836d46802a52e254bc(com.moon.nL a0, int a1) throws E;
private static final class __SourceHandler_24836d46802a52e254bc {

public static void f94(com.moon.nL receiver, int p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead94_0() ^ 100733231756471L);
    __call94_1(receiver);
    if ((__fieldRead94_2(receiver) != p0)) {
        java.lang.Object __inlineStack94_5Token;
        throw new java.io.IOException(__invokedynamic94_6(__inlineStack94_5Output0((__inlineStack94_5Token = __inlineStack94_5Pack(__call94_3(p0), __invokedynamic94_4(29283, (6239605057122396541L ^ life2_3))))), __inlineStack94_5Output1(__inlineStack94_5Token)));
    }
    return;
}
public static void h94_0(java.io.IOException p0) throws Throwable {
    throw __call3009400_0(p0);
}
private static native long __fieldRead94_0() throws Throwable;
private static native void __call94_1(com.moon.nL a0) throws Throwable;
private static native int __fieldRead94_2(com.moon.nL a0) throws Throwable;
private static native java.lang.String __call94_3(int a0) throws Throwable;
private static native java.lang.String __invokedynamic94_4(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack94_5Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack94_5Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack94_5Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic94_6(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call3009400_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4dcd909b027da036d1af(com.moon.nL a0, long a1) throws E;
private static final class __SourceHandler_4dcd909b027da036d1af {

public static void f521(com.moon.nL receiver, long p0) throws Throwable {
    long lexicalValue521_27_0;
    long lexicalValue521_27_1;
    long spill521_0;
    long spill521_1;
    long life3_3;
    int life5_5;
    long life6_14;
    lexical_join_31: {
    life3_3 = (__fieldRead521_0() ^ 46119912457823L);
    life5_5 = __integerCategory521_2(__call521_1());
    lexical_cycle_6: while (true) {
    lexical_join_27: {
    lexical_join_25: {
    if (!((__numericCompare521_3(p0, 0L) > 0))) {
        break lexical_join_31;
    }
    life6_14 = __call521_5(__fieldRead521_4(receiver), p0);
    spill521_0 = life6_14;
    spill521_1 = 0L;
    if (!((life5_5 == 0))) {
        lexicalValue521_27_0 = spill521_0;
        lexicalValue521_27_1 = spill521_1;
        break lexical_join_27;
    }
    if (!((__numericCompare521_6(spill521_0, spill521_1) < 0))) {
        break lexical_join_25;
    }
    throw new java.io.EOFException();
    }
    lexicalValue521_27_0 = p0;
    lexicalValue521_27_1 = life6_14;
    }
    p0 = (lexicalValue521_27_0 - lexicalValue521_27_1);
    if (!((life5_5 != 0))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    return;
}
public static void h521_0(java.io.IOException p0) throws Throwable {
    throw __call1052100_0(p0);
}
public static void h521_1(java.io.IOException p0) throws Throwable {
    throw __call1052101_0(p0);
}
private static native long __fieldRead521_0() throws Throwable;
private static native boolean __call521_1() throws Throwable;
private static native int __integerCategory521_2(boolean value) throws Throwable;
private static native int __numericCompare521_3(long a0, long a1) throws Throwable;
private static native java.io.InputStream __fieldRead521_4(com.moon.nL a0) throws Throwable;
private static native long __call521_5(java.io.InputStream a0, long a1) throws Throwable;
private static native int __numericCompare521_6(long a0, long a1) throws Throwable;
private static native java.lang.Exception __call1052100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1052101_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.ci __sourceHandlerCall_8ab64e27e385c2bf37a9(com.moon.nL a0, com.moon.ci a1) throws E;
private static final class __SourceHandler_8ab64e27e385c2bf37a9 {

public static com.moon.ci f95(com.moon.nL receiver, com.moon.ci p0) throws Throwable {
    int forwardValue95_15_0;
    int spill95_0;
    long life2_3;
    int life4_5;
    forward_join_49: {
    forward_join_47: {
    forward_join_45: {
    forward_join_40: {
    forward_join_38: {
    forward_join_36: {
    forward_join_34: {
    forward_join_29: {
    forward_join_27: {
    forward_join_25: {
    forward_join_20: {
    forward_join_18: {
    forward_join_16: {
    forward_join_15: {
    forward_join_11: {
    life2_3 = (__fieldRead95_0() ^ 68803575803430L);
    life4_5 = __integerCategory95_2(__call95_1());
    spill95_0 = __fieldRead95_3(receiver);
    if (!((life4_5 != 0))) {
        forwardValue95_15_0 = spill95_0;
        break forward_join_15;
    }
    switch (spill95_0) {
case 2:
{
        break forward_join_11;
    }
case 6:
{
        break forward_join_20;
    }
case 0:
{
        break forward_join_29;
    }
case 4:
{
        break forward_join_38;
    }
case 3:
{
        break forward_join_40;
    }
case 1:
case 5:
default:
{
        break forward_join_49;
    }
}
    }
    forwardValue95_15_0 = (__fieldRead95_4())[__call95_5(p0)];
    }
    switch (forwardValue95_15_0) {
case 1:
case 2:
case 3:
case 4:
{
        break forward_join_16;
    }
default:
{
        break forward_join_18;
    }
}
    }
    return p0;
    }
    return __fieldRead95_6();
    }
    switch ((__fieldRead95_7())[__call95_8(p0)]) {
case 1:
case 2:
case 3:
case 4:
{
        break forward_join_25;
    }
default:
{
        break forward_join_27;
    }
}
    }
    return p0;
    }
    return __fieldRead95_9();
    }
    switch ((__fieldRead95_10())[__call95_11(p0)]) {
case 5:
case 6:
{
        break forward_join_34;
    }
default:
{
        break forward_join_36;
    }
}
    }
    return p0;
    }
    return __fieldRead95_12();
    }
    return __fieldRead95_13();
    }
    switch ((__fieldRead95_14())[__call95_15(p0)]) {
case 1:
case 2:
case 3:
{
        break forward_join_45;
    }
default:
{
        break forward_join_47;
    }
}
    }
    return p0;
    }
    return __fieldRead95_16();
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic95_17(30674, (9155522796189283931L ^ life2_3)));
}
public static com.moon.ci h95_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call2009500_0(p0);
}
public static com.moon.ci h95_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call2009501_0(p0);
}
public static com.moon.ci h95_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call2009502_0(p0);
}
public static com.moon.ci h95_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call2009503_0(p0);
}
public static com.moon.ci h95_4(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call2009504_0(p0);
}
public static com.moon.ci h95_5(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call2009505_0(p0);
}
private static native long __fieldRead95_0() throws Throwable;
private static native boolean __call95_1() throws Throwable;
private static native int __integerCategory95_2(boolean value) throws Throwable;
private static native int __fieldRead95_3(com.moon.nL a0) throws Throwable;
private static native int[] __fieldRead95_4() throws Throwable;
private static native int __call95_5(com.moon.ci a0) throws Throwable;
private static native com.moon.ci __fieldRead95_6() throws Throwable;
private static native int[] __fieldRead95_7() throws Throwable;
private static native int __call95_8(com.moon.ci a0) throws Throwable;
private static native com.moon.ci __fieldRead95_9() throws Throwable;
private static native int[] __fieldRead95_10() throws Throwable;
private static native int __call95_11(com.moon.ci a0) throws Throwable;
private static native com.moon.ci __fieldRead95_12() throws Throwable;
private static native com.moon.ci __fieldRead95_13() throws Throwable;
private static native int[] __fieldRead95_14() throws Throwable;
private static native int __call95_15(com.moon.ci a0) throws Throwable;
private static native com.moon.ci __fieldRead95_16() throws Throwable;
private static native java.lang.String __invokedynamic95_17(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call2009500_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call2009501_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call2009502_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call2009503_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call2009504_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call2009505_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_147e32f470e7a32bf9a0(com.moon.nL a0, java.nio.ByteBuffer a1, int a2, com.moon.ci a3) throws E;
private static final class __SourceHandler_147e32f470e7a32bf9a0 {

public static void f144(com.moon.nL receiver, java.nio.ByteBuffer p0, int p1, com.moon.ci p2) throws Throwable {
    int lexicalValue144_53_0;
    int lexicalValue144_53_1;
    byte[] lexicalValue144_57_0;
    int lexicalValue144_98_0;
    boolean spill144_0;
    int spill144_1;
    int spill144_2;
    int spill144_3;
    long life4_3;
    int life7_7;
    int life6_8;
    int life8_29;
    byte[] life9_34;
    byte[] life10_39;
    byte[] life11_63;
    java.util.zip.Inflater life12_67;
    int life13_69;
    byte[] life14_360;
    lexical_join_296: {
    lexical_join_294: {
    lexical_join_57: {
    lexical_join_56: {
    lexical_join_53: {
    life4_3 = (__fieldRead144_0() ^ 54623209334753L);
    spill144_0 = __call144_1();
    life7_7 = __call144_2(p0);
    life6_8 = __integerCategory144_3(spill144_0);
    life8_29 = ((((__fieldRead144_4(receiver) * __fieldRead144_5(receiver)) + __invokedynamic144_6(22234, (5282580739271484535L ^ life4_3))) / __invokedynamic144_7(17883, (2802956427523946344L ^ life4_3))) * __fieldRead144_8(receiver));
    life9_34 = new byte[(life8_29 + 1)];
    life10_39 = new byte[(life8_29 + 1)];
    spill144_1 = __fieldRead144_9(receiver);
    spill144_2 = __invokedynamic144_10(17883, (2802956427523946344L ^ life4_3));
    if (!((life6_8 == 0))) {
        lexicalValue144_53_0 = spill144_1;
        lexicalValue144_53_1 = spill144_2;
        break lexical_join_53;
    }
    if (!((spill144_1 < spill144_2))) {
        break lexical_join_56;
    }
    lexicalValue144_53_0 = __fieldRead144_11(receiver);
    lexicalValue144_53_1 = 1;
    }
    lexicalValue144_57_0 = new byte[(lexicalValue144_53_0 + lexicalValue144_53_1)];
    break lexical_join_57;
    }
    lexicalValue144_57_0 = null;
    }
    life11_63 = lexicalValue144_57_0;
    life12_67 = new java.util.zip.Inflater();
    life13_69 = 0;
    lexical_cycle_64: while (true) {
    lexical_join_285: {
    lexical_join_276: {
    lexical_join_267: {
    lexical_join_261: {
    lexical_join_255: {
    lexical_join_249: {
    lexical_join_244: {
    lexical_join_235: {
    lexical_join_229: {
    lexical_join_223: {
    lexical_join_217: {
    lexical_join_213: {
    lexical_join_210: {
    lexical_join_201: {
    lexical_join_195: {
    lexical_join_190: {
    lexical_join_181: {
    lexical_join_175: {
    lexical_join_170: {
    lexical_join_161: {
    lexical_join_155: {
    lexical_join_149: {
    lexical_join_143: {
    lexical_join_137: {
    lexical_join_132: {
    lexical_join_123: {
    lexical_join_117: {
    lexical_join_111: {
    lexical_join_105: {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_94: {
    if (!((life13_69 < __fieldRead144_12(receiver)))) {
        break lexical_join_294;
    }
    __call144_13(receiver, life12_67, life9_34, 0, (life9_34).length);
    __call144_14(receiver, life9_34, life10_39);
    __call144_15(p0, (life7_7 + (life13_69 * p1)));
    if (!((life6_8 == 0))) {
        break lexical_join_296;
    }
    spill144_3 = __fieldRead144_16(receiver);
    if (!((life6_8 == 0))) {
        lexicalValue144_98_0 = spill144_3;
        break lexical_join_98;
    }
    switch (spill144_3) {
case 2:
{
        break lexical_join_94;
    }
case 6:
{
        break lexical_join_132;
    }
case 0:
{
        break lexical_join_170;
    }
case 4:
{
        break lexical_join_190;
    }
case 3:
{
        break lexical_join_210;
    }
case 1:
case 5:
default:
{
        break lexical_join_276;
    }
}
    }
    lexicalValue144_98_0 = (__fieldRead144_17())[__call144_18(p2)];
    }
    switch (lexicalValue144_98_0) {
case 1:
{
        break lexical_join_99;
    }
case 2:
{
        break lexical_join_105;
    }
case 3:
{
        break lexical_join_111;
    }
case 4:
{
        break lexical_join_117;
    }
default:
{
        break lexical_join_123;
    }
}
    }
    __call144_19(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_20(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_21(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_22(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic144_23(566, (4110732988860844663L ^ life4_3)));
    }
    switch ((__fieldRead144_24())[__call144_25(p2)]) {
case 1:
{
        break lexical_join_137;
    }
case 2:
{
        break lexical_join_143;
    }
case 3:
{
        break lexical_join_149;
    }
case 4:
{
        break lexical_join_155;
    }
default:
{
        break lexical_join_161;
    }
}
    }
    __call144_26(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_27(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_28(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_29(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic144_30(21458, (2879189018428578719L ^ life4_3)));
    }
    switch ((__fieldRead144_31())[__call144_32(p2)]) {
case 5:
case 6:
{
        break lexical_join_175;
    }
default:
{
        break lexical_join_181;
    }
}
    }
    __call144_33(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic144_34(21458, (2879189018428578719L ^ life4_3)));
    }
    switch ((__fieldRead144_35())[__call144_36(p2)]) {
case 7:
{
        break lexical_join_195;
    }
default:
{
        break lexical_join_201;
    }
}
    }
    __call144_37(receiver, p0, life9_34);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic144_38(21458, (2879189018428578719L ^ life4_3)));
    }
    switch (__fieldRead144_39(receiver)) {
case 8:
{
        break lexical_join_213;
    }
case 4:
{
        break lexical_join_217;
    }
case 2:
{
        break lexical_join_223;
    }
case 1:
{
        break lexical_join_229;
    }
case 3:
case 5:
case 6:
case 7:
default:
{
        break lexical_join_235;
    }
}
    }
    life11_63 = life9_34;
    if (!((life6_8 != 0))) {
        break lexical_join_244;
    }
    }
    __call144_40(receiver, life9_34, life11_63);
    if (!((life6_8 != 0))) {
        break lexical_join_244;
    }
    }
    __call144_41(receiver, life9_34, life11_63);
    if (!((life6_8 != 0))) {
        break lexical_join_244;
    }
    }
    __call144_42(receiver, life9_34, life11_63);
    if (!((life6_8 != 0))) {
        break lexical_join_244;
    }
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic144_43(30637, (3694125016090296313L ^ life4_3)));
    }
    switch ((__fieldRead144_44())[__call144_45(p2)]) {
case 1:
{
        break lexical_join_249;
    }
case 2:
{
        break lexical_join_255;
    }
case 3:
{
        break lexical_join_261;
    }
default:
{
        break lexical_join_267;
    }
}
    }
    __call144_46(receiver, p0, life11_63);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_47(receiver, p0, life11_63);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    __call144_48(receiver, p0, life11_63);
    if (!((life6_8 != 0))) {
        break lexical_join_285;
    }
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic144_49(21458, (2879189018428578719L ^ life4_3)));
    }
    throw new java.lang.UnsupportedOperationException(__invokedynamic144_50(27609, (5584369830887138205L ^ life4_3)));
    }
    life14_360 = life9_34;
    life9_34 = life10_39;
    life10_39 = life14_360;
    life13_69 += 1;
    if (!((life6_8 != 0))) { continue lexical_cycle_64; }
    break lexical_cycle_64;
    }
    }
    __call144_51(life12_67);
    }
    return;
}
public static void h144_0(java.io.IOException p0) throws Throwable {
    throw __call3014400_0(p0);
}
public static void h144_1(java.io.IOException p0) throws Throwable {
    throw __call3014401_0(p0);
}
public static void h144_2(java.io.IOException p0) throws Throwable {
    throw __call3014402_0(p0);
}
public static void h144_3(java.io.IOException p0) throws Throwable {
    throw __call3014403_0(p0);
}
public static void h144_4(java.io.IOException p0) throws Throwable {
    throw __call3014404_0(p0);
}
public static void h144_5(java.io.IOException p0) throws Throwable {
    throw __call3014405_0(p0);
}
public static void h144_6(java.io.IOException p0) throws Throwable {
    throw __call3014406_0(p0);
}
public static void h144_7(java.io.IOException p0) throws Throwable {
    throw __call3014407_0(p0);
}
public static void h144_8(java.io.IOException p0) throws Throwable {
    throw __call3014408_0(p0);
}
public static void h144_9(java.io.IOException p0) throws Throwable {
    throw __call3014409_0(p0);
}
public static void h144_10(java.io.IOException p0) throws Throwable {
    throw __call3014410_0(p0);
}
public static void h144_11(java.io.IOException p0) throws Throwable {
    throw __call3014411_0(p0);
}
public static void h144_12(java.io.IOException p0) throws Throwable {
    throw __call3014412_0(p0);
}
public static void h144_13(java.io.IOException p0) throws Throwable {
    throw __call3014413_0(p0);
}
public static void h144_14(java.io.IOException p0) throws Throwable {
    throw __call3014414_0(p0);
}
public static void h144_15(java.io.IOException p0) throws Throwable {
    throw __call3014415_0(p0);
}
public static void h144_16(java.io.IOException p0) throws Throwable {
    throw __call3014416_0(p0);
}
public static void h144_17(java.io.IOException p0) throws Throwable {
    throw __call3014417_0(p0);
}
public static void h144_18(java.io.IOException p0) throws Throwable {
    throw __call3014418_0(p0);
}
public static void h144_19(java.io.IOException p0) throws Throwable {
    throw __call3014419_0(p0);
}
public static void h144_20(java.io.IOException p0) throws Throwable {
    throw __call3014420_0(p0);
}
public static void h144_21(java.io.IOException p0) throws Throwable {
    throw __call3014421_0(p0);
}
public static void h144_22(java.io.IOException p0) throws Throwable {
    throw __call3014422_0(p0);
}
public static void h144_23(java.io.IOException p0) throws Throwable {
    throw __call3014423_0(p0);
}
public static void h144_24(java.io.IOException p0) throws Throwable {
    throw __call3014424_0(p0);
}
public static void h144_25(java.io.IOException p0) throws Throwable {
    throw __call3014425_0(p0);
}
public static void h144_26(java.io.IOException p0) throws Throwable {
    throw __call3014426_0(p0);
}
public static void h144_27(java.lang.Throwable p0, java.util.zip.Inflater p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3014427_0(p1);
    throw life2_2;
}
private static native long __fieldRead144_0() throws Throwable;
private static native boolean __call144_1() throws Throwable;
private static native int __call144_2(java.nio.ByteBuffer a0) throws Throwable;
private static native int __integerCategory144_3(boolean value) throws Throwable;
private static native int __fieldRead144_4(com.moon.nL a0) throws Throwable;
private static native int __fieldRead144_5(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic144_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic144_7(int a0, long a1) throws Throwable;
private static native int __fieldRead144_8(com.moon.nL a0) throws Throwable;
private static native int __fieldRead144_9(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic144_10(int a0, long a1) throws Throwable;
private static native int __fieldRead144_11(com.moon.nL a0) throws Throwable;
private static native int __fieldRead144_12(com.moon.nL a0) throws Throwable;
private static native void __call144_13(com.moon.nL a0, java.util.zip.Inflater a1, byte[] a2, int a3, int a4) throws Throwable;
private static native void __call144_14(com.moon.nL a0, byte[] a1, byte[] a2) throws Throwable;
private static native java.nio.ByteBuffer __call144_15(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native int __fieldRead144_16(com.moon.nL a0) throws Throwable;
private static native int[] __fieldRead144_17() throws Throwable;
private static native int __call144_18(com.moon.ci a0) throws Throwable;
private static native void __call144_19(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_20(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_21(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_22(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native java.lang.String __invokedynamic144_23(int a0, long a1) throws Throwable;
private static native int[] __fieldRead144_24() throws Throwable;
private static native int __call144_25(com.moon.ci a0) throws Throwable;
private static native void __call144_26(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_27(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_28(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_29(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native java.lang.String __invokedynamic144_30(int a0, long a1) throws Throwable;
private static native int[] __fieldRead144_31() throws Throwable;
private static native int __call144_32(com.moon.ci a0) throws Throwable;
private static native void __call144_33(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native java.lang.String __invokedynamic144_34(int a0, long a1) throws Throwable;
private static native int[] __fieldRead144_35() throws Throwable;
private static native int __call144_36(com.moon.ci a0) throws Throwable;
private static native void __call144_37(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native java.lang.String __invokedynamic144_38(int a0, long a1) throws Throwable;
private static native int __fieldRead144_39(com.moon.nL a0) throws Throwable;
private static native void __call144_40(com.moon.nL a0, byte[] a1, byte[] a2) throws Throwable;
private static native void __call144_41(com.moon.nL a0, byte[] a1, byte[] a2) throws Throwable;
private static native void __call144_42(com.moon.nL a0, byte[] a1, byte[] a2) throws Throwable;
private static native java.lang.String __invokedynamic144_43(int a0, long a1) throws Throwable;
private static native int[] __fieldRead144_44() throws Throwable;
private static native int __call144_45(com.moon.ci a0) throws Throwable;
private static native void __call144_46(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_47(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native void __call144_48(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws Throwable;
private static native java.lang.String __invokedynamic144_49(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic144_50(int a0, long a1) throws Throwable;
private static native void __call144_51(java.util.zip.Inflater a0) throws Throwable;
private static native java.lang.Exception __call3014400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014406_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014407_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014408_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014409_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014410_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014411_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014412_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014413_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014414_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014415_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014416_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014417_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014418_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014419_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014420_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014421_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014422_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014423_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014424_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014425_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014426_0(java.io.IOException a0) throws Throwable;
private static native void __call3014427_0(java.util.zip.Inflater a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2f6faeecb46b7fc1f1fa(com.moon.nL a0, java.util.zip.Inflater a1) throws E;
private static final class __SourceHandler_2f6faeecb46b7fc1f1fa {

public static void f522(com.moon.nL receiver, java.util.zip.Inflater p0) throws Throwable {
    com.moon.nL lexicalValue522_23_0;
    com.moon.nL spill522_0;
    long life2_3;
    int life4_5;
    int life5_33;
    lexical_join_23: {
    lexical_join_22: {
    life2_3 = (__fieldRead522_0() ^ 100196681532312L);
    life4_5 = __integerCategory522_2(__call522_1());
    lexical_cycle_6: while (true) {
    if (!((__fieldRead522_3(receiver) == 0))) {
        break lexical_join_22;
    }
    __call522_4(receiver);
    spill522_0 = receiver;
    if (!((life4_5 == 0))) {
        lexicalValue522_23_0 = spill522_0;
        break lexical_join_23;
    }
    __call522_6(spill522_0, __invokedynamic522_5(20134, (8194694565718792319L ^ life2_3)));
    if (!((life4_5 != 0))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexicalValue522_23_0 = receiver;
    }
    life5_33 = __call522_9(lexicalValue522_23_0, __fieldRead522_7(receiver), 0, (__fieldRead522_8(receiver)).length);
    __call522_11(p0, __fieldRead522_10(receiver), 0, life5_33);
    return;
}
public static void h522_0(java.io.IOException p0) throws Throwable {
    throw __call1052200_0(p0);
}
private static native long __fieldRead522_0() throws Throwable;
private static native boolean __call522_1() throws Throwable;
private static native int __integerCategory522_2(boolean value) throws Throwable;
private static native int __fieldRead522_3(com.moon.nL a0) throws Throwable;
private static native void __call522_4(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic522_5(int a0, long a1) throws Throwable;
private static native void __call522_6(com.moon.nL a0, int a1) throws Throwable;
private static native byte[] __fieldRead522_7(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead522_8(com.moon.nL a0) throws Throwable;
private static native int __call522_9(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native byte[] __fieldRead522_10(com.moon.nL a0) throws Throwable;
private static native void __call522_11(java.util.zip.Inflater a0, byte[] a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1052200_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aee7e6aac86b26783702(com.moon.nL a0, java.util.zip.Inflater a1, byte[] a2, int a3, int a4) throws E;
private static final class __SourceHandler_aee7e6aac86b26783702 {

public static void f720002(com.moon.nL receiver, java.util.zip.Inflater p0, byte[] p1, int p2, int p3) throws Throwable {
    int forestValue720002_55_0;
    int forestValue720002_85_0;
    int forestValue720002_117_0;
    boolean spill720002_0;
    java.lang.AssertionError spill720002_1;
    boolean spill720002_2;
    boolean spill720002_3;
    boolean spill720002_4;
    boolean spill720002_5;
    int spill720002_6;
    java.io.EOFException spill720002_7;
    java.io.IOException spill720002_8;
    java.io.IOException spill720002_9;
    long life5_3;
    int life7_5;
    int life8_29;
    int life8_102;
    forest_join_183: {
    forest_join_166: {
    forest_join_165: {
    forest_join_164: {
    forest_join_163: {
    forest_join_162: {
    forest_join_161: {
    forest_join_160: {
    forest_join_159: {
    forest_join_158: {
    forest_join_157: {
    forest_join_156: {
    forest_join_152: {
    forest_join_85: {
    forest_join_84: {
    forest_join_18: {
    life5_3 = (__fieldRead720002_0() ^ 115973774586964L);
    life7_5 = __integerCategory720002_2(__call720002_1());
    spill720002_0 = __fieldRead720002_3();
    if (!((life7_5 != 0))) {
        forestValue720002_85_0 = __integerCategory720002_4(spill720002_0);
        break forest_join_85;
    }
    if (!((!spill720002_0))) {
        break forest_join_18;
    }
    if (!((p1 == __fieldRead720002_5(receiver)))) {
        break forest_join_18;
    }
    java.lang.AssertionError __stackOp720002_7_0 = __sourceUninitializedNEW720002_6();
    spill720002_1 = __stackOp720002_7_0;
    __explicitNewInit720002_8(__stackOp720002_7_0);
    throw spill720002_1;
    }
    forest_cycle_18: while (true) {
    forest_join_70: {
    forest_join_55: {
    forest_join_41: {
    forest_join_32: {
    life8_29 = __call720002_9(p0, p1, p2, p3);
    if (!((life8_29 <= 0))) {
        break forest_join_32;
    }
    spill720002_2 = __call720002_10(p0);
    if (!((life7_5 != 0))) {
        forestValue720002_55_0 = __integerCategory720002_11(spill720002_2);
        break forest_join_55;
    }
    if (!(spill720002_2)) {
        break forest_join_41;
    }
    break forest_join_84;
    }
    p2 = (p2 + life8_29);
    p3 = (p3 - life8_29);
    break forest_join_70;
    }
    forest_cycle_41: while (true) {
    forest_join_50: {
    if (!(__call720002_12(p0))) {
        break forest_join_166;
    }
    __call720002_13(receiver, p0);
    if (!((life7_5 == 0))) {
        break forest_join_50;
    }
    break forest_join_156;
    }
    if (!((p3 <= 0))) {
        continue forest_cycle_18;
    }
    if (!((life7_5 != 0))) {
        continue forest_cycle_41;
    }
    break forest_cycle_41;
    }
    break forest_join_157;
    }
    forest_cycle_55: while (true) {
    forest_join_67: {
    forest_join_62: {
    if (!((forestValue720002_55_0 != 0))) {
        break forest_join_166;
    }
    __call720002_14(receiver, p0);
    if (!((life7_5 == 0))) {
        break forest_join_62;
    }
    break forest_join_158;
    }
    if (!((p3 <= 0))) {
        continue forest_cycle_18;
    }
    if (!((life7_5 != 0))) {
        break forest_join_67;
    }
    break forest_join_159;
    }
    spill720002_3 = __call720002_15(p0);
    forestValue720002_55_0 = __integerCategory720002_16(spill720002_3);
    continue forest_cycle_55;
    }
    }
    forest_cycle_70: while (true) {
    forest_join_75: {
    if (!((p3 <= 0))) {
        continue forest_cycle_18;
    }
    if (!((life7_5 != 0))) {
        break forest_join_75;
    }
    break forest_join_161;
    }
    if (!(__call720002_17(p0))) {
        break forest_join_166;
    }
    __call720002_18(receiver, p0);
    if (!((life7_5 == 0))) {
        continue forest_cycle_70;
    }
    break forest_cycle_70;
    }
    break forest_cycle_18;
    }
    break forest_join_160;
    }
    break forest_join_152;
    }
    forest_cycle_85: while (true) {
    forest_join_146: {
    forest_join_132: {
    forest_join_117: {
    forest_join_103: {
    forest_join_94: {
    life8_102 = forestValue720002_85_0;
    if (!((life8_102 <= 0))) {
        break forest_join_94;
    }
    spill720002_4 = __call720002_19(p0);
    if (!((life7_5 != 0))) {
        forestValue720002_117_0 = __integerCategory720002_20(spill720002_4);
        break forest_join_117;
    }
    if (!(spill720002_4)) {
        break forest_join_103;
    }
    break forest_join_152;
    }
    p2 = (p2 + life8_102);
    p3 = (p3 - life8_102);
    break forest_join_132;
    }
    forest_cycle_103: while (true) {
    forest_join_112: {
    if (!(__call720002_21(p0))) {
        break forest_join_166;
    }
    __call720002_22(receiver, p0);
    if (!((life7_5 == 0))) {
        break forest_join_112;
    }
    break forest_join_162;
    }
    if (!((p3 <= 0))) {
        break forest_join_146;
    }
    if (!((life7_5 != 0))) {
        continue forest_cycle_103;
    }
    break forest_cycle_103;
    }
    break forest_join_163;
    }
    forest_cycle_117: while (true) {
    forest_join_129: {
    forest_join_124: {
    if (!((forestValue720002_117_0 != 0))) {
        break forest_join_166;
    }
    __call720002_23(receiver, p0);
    if (!((life7_5 == 0))) {
        break forest_join_124;
    }
    break forest_join_164;
    }
    if (!((p3 <= 0))) {
        break forest_join_146;
    }
    if (!((life7_5 != 0))) {
        break forest_join_129;
    }
    break forest_join_165;
    }
    spill720002_5 = __call720002_24(p0);
    forestValue720002_117_0 = __integerCategory720002_25(spill720002_5);
    continue forest_cycle_117;
    }
    }
    forest_cycle_132: while (true) {
    forest_join_137: {
    if (!((p3 <= 0))) {
        break forest_join_146;
    }
    if (!((life7_5 != 0))) {
        break forest_join_137;
    }
    break forest_join_183;
    }
    if (!(__call720002_26(p0))) {
        break forest_join_166;
    }
    __call720002_27(receiver, p0);
    if (!((life7_5 == 0))) {
        continue forest_cycle_132;
    }
    break forest_cycle_132;
    }
    break forest_join_166;
    }
    spill720002_6 = __call720002_28(p0, p1, p2, p3);
    forestValue720002_85_0 = spill720002_6;
    continue forest_cycle_85;
    }
    }
    java.io.EOFException __stackOp720002_30_0 = __sourceUninitializedNEW720002_29();
    spill720002_7 = __stackOp720002_30_0;
    __explicitNewInit720002_31(__stackOp720002_30_0);
    throw spill720002_7;
    }
    break forest_join_166;
    }
    break forest_join_183;
    }
    break forest_join_166;
    }
    break forest_join_183;
    }
    break forest_join_166;
    }
    break forest_join_183;
    }
    break forest_join_166;
    }
    break forest_join_183;
    }
    break forest_join_166;
    }
    break forest_join_183;
    }
    java.io.IOException __stackOp720002_33_0 = __sourceUninitializedNEW720002_32();
    spill720002_8 = __stackOp720002_33_0;
    spill720002_9 = __stackOp720002_33_0;
    int __stackOp720002_35_0 = p3;
    java.lang.String __stackOp720002_35_1 = __invokedynamic720002_34(2981, (6770872529202008131L ^ life5_3));
    __explicitNewInit720002_38(spill720002_9, __invokedynamic720002_37(__stackOp720002_35_1, __stackOp720002_35_0, __invokedynamic720002_36(25027, (6035816375545936445L ^ life5_3))));
    throw spill720002_8;
    }
    return;
}
public static void h720002_0(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000200_0(p0);
}
public static void h720002_1(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000201_0(p0);
}
public static void h720002_2(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000202_0(p0);
}
public static void h720002_3(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000203_0(p0);
}
public static void h720002_4(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000204_0(p0);
}
public static void h720002_5(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000205_0(p0);
}
public static void h720002_6(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000206_0(p0);
}
public static void h720002_7(java.util.zip.DataFormatException p0) throws Throwable {
    throw __call75000207_0(p0);
}
public static void h720002_8(java.util.zip.DataFormatException p0, long p1) throws Throwable {
    java.io.IOException spill75000208_0;
    java.util.zip.DataFormatException life3_2;
    life3_2 = p0;
    java.io.IOException __stackOp75000208_1_0 = __sourceUninitializedNEW75000208_0();
    spill75000208_0 = __stackOp75000208_1_0;
    __explicitNewInit75000208_3(__stackOp75000208_1_0, __invokedynamic75000208_2(19048, (1943499351336063372L ^ p1)));
    throw __cast75000208_5(__call75000208_4(spill75000208_0, life3_2));
}
private static native long __fieldRead720002_0() throws Throwable;
private static native boolean __call720002_1() throws Throwable;
private static native int __integerCategory720002_2(boolean value) throws Throwable;
private static native boolean __fieldRead720002_3() throws Throwable;
private static native int __integerCategory720002_4(boolean value) throws Throwable;
private static native byte[] __fieldRead720002_5(com.moon.nL a0) throws Throwable;
private static native java.lang.AssertionError __sourceUninitializedNEW720002_6() throws Throwable;
private static native void __explicitNewInit720002_8(java.lang.AssertionError a0) throws Throwable;
private static native int __call720002_9(java.util.zip.Inflater a0, byte[] a1, int a2, int a3) throws Throwable;
private static native boolean __call720002_10(java.util.zip.Inflater a0) throws Throwable;
private static native int __integerCategory720002_11(boolean value) throws Throwable;
private static native boolean __call720002_12(java.util.zip.Inflater a0) throws Throwable;
private static native void __call720002_13(com.moon.nL a0, java.util.zip.Inflater a1) throws Throwable;
private static native void __call720002_14(com.moon.nL a0, java.util.zip.Inflater a1) throws Throwable;
private static native boolean __call720002_15(java.util.zip.Inflater a0) throws Throwable;
private static native int __integerCategory720002_16(boolean value) throws Throwable;
private static native boolean __call720002_17(java.util.zip.Inflater a0) throws Throwable;
private static native void __call720002_18(com.moon.nL a0, java.util.zip.Inflater a1) throws Throwable;
private static native boolean __call720002_19(java.util.zip.Inflater a0) throws Throwable;
private static native int __integerCategory720002_20(boolean value) throws Throwable;
private static native boolean __call720002_21(java.util.zip.Inflater a0) throws Throwable;
private static native void __call720002_22(com.moon.nL a0, java.util.zip.Inflater a1) throws Throwable;
private static native void __call720002_23(com.moon.nL a0, java.util.zip.Inflater a1) throws Throwable;
private static native boolean __call720002_24(java.util.zip.Inflater a0) throws Throwable;
private static native int __integerCategory720002_25(boolean value) throws Throwable;
private static native boolean __call720002_26(java.util.zip.Inflater a0) throws Throwable;
private static native void __call720002_27(com.moon.nL a0, java.util.zip.Inflater a1) throws Throwable;
private static native int __call720002_28(java.util.zip.Inflater a0, byte[] a1, int a2, int a3) throws Throwable;
private static native java.io.EOFException __sourceUninitializedNEW720002_29() throws Throwable;
private static native void __explicitNewInit720002_31(java.io.EOFException a0) throws Throwable;
private static native java.io.IOException __sourceUninitializedNEW720002_32() throws Throwable;
private static native java.lang.String __invokedynamic720002_34(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic720002_36(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic720002_37(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native void __explicitNewInit720002_38(java.io.IOException a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call75000200_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.lang.Exception __call75000201_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.lang.Exception __call75000202_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.lang.Exception __call75000203_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.lang.Exception __call75000204_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.lang.Exception __call75000205_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.lang.Exception __call75000206_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.lang.Exception __call75000207_0(java.util.zip.DataFormatException a0) throws Throwable;
private static native java.io.IOException __sourceUninitializedNEW75000208_0() throws Throwable;
private static native java.lang.String __invokedynamic75000208_2(int a0, long a1) throws Throwable;
private static native void __explicitNewInit75000208_3(java.io.IOException a0, java.lang.String a1) throws Throwable;
private static native java.lang.Throwable __call75000208_4(java.io.IOException a0, java.util.zip.DataFormatException a1) throws Throwable;
private static native java.io.IOException __cast75000208_5(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_12eff7293716250ce031(com.moon.nL a0, byte[] a1, int a2, int a3) throws E;
private static final class __SourceHandler_12eff7293716250ce031 {

public static int f46(com.moon.nL receiver, byte[] p0, int p1, int p2) throws Throwable {
    int forwardValue46_33_0;
    int spill46_0;
    long life4_3;
    int life6_5;
    forward_join_33: {
    forward_join_15: {
    life4_3 = (__fieldRead46_0() ^ 26659219428640L);
    life6_5 = __integerCategory46_2(__call46_1());
    spill46_0 = p2;
    if (!((life6_5 != 0))) {
        forwardValue46_33_0 = spill46_0;
        break forward_join_33;
    }
    if (!((spill46_0 > __fieldRead46_3(receiver)))) {
        break forward_join_15;
    }
    p2 = __fieldRead46_4(receiver);
    }
    __call46_5(receiver, p0, p1, p2);
    __call46_7(__fieldRead46_6(receiver), p0, p1, p2);
    com.moon.nL __stackOp46_8_0 = receiver;
    __fieldWrite46_10(__stackOp46_8_0, (__fieldRead46_9(__stackOp46_8_0) - p2));
    forwardValue46_33_0 = p2;
    }
    return forwardValue46_33_0;
}
public static void h46_0(java.io.IOException p0) throws Throwable {
    throw __call1004600_0(p0);
}
private static native long __fieldRead46_0() throws Throwable;
private static native boolean __call46_1() throws Throwable;
private static native int __integerCategory46_2(boolean value) throws Throwable;
private static native int __fieldRead46_3(com.moon.nL a0) throws Throwable;
private static native int __fieldRead46_4(com.moon.nL a0) throws Throwable;
private static native void __call46_5(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native java.util.zip.CRC32 __fieldRead46_6(com.moon.nL a0) throws Throwable;
private static native void __call46_7(java.util.zip.CRC32 a0, byte[] a1, int a2, int a3) throws Throwable;
private static native int __fieldRead46_9(com.moon.nL a0) throws Throwable;
private static native void __fieldWrite46_10(com.moon.nL a0, int a1) throws Throwable;
private static native java.lang.Exception __call1004600_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_47c2a85ee18d869e47ee(com.moon.nL a0, byte[] a1, byte[] a2) throws E;
private static final class __SourceHandler_47c2a85ee18d869e47ee {

public static void f238(com.moon.nL receiver, byte[] p0, byte[] p1) throws Throwable {
    boolean spill238_0;
    long life3_3;
    int life6_5;
    int life7_9;
    int life5_10;
    int life8_27;
    forest_join_57: {
    life3_3 = (__fieldRead238_0() ^ 125596797504723L);
    life6_5 = 1;
    spill238_0 = __call238_1();
    life7_9 = (p1).length;
    life5_10 = __integerCategory238_2(spill238_0);
    forest_cycle_11: while (true) {
    forest_join_55: {
    forest_join_47: {
    forest_join_34: {
    if (!((life6_5 < life7_9))) {
        break forest_join_57;
    }
    life8_27 = ((p0)[(1 + (life6_5 >> 1))] & __invokedynamic238_3(1797, (8376143928212004489L ^ life3_3)));
    if (!((life5_10 == 0))) {
        break forest_join_55;
    }
    switch ((life7_9 - life6_5)) {
default:
{
        break forest_join_34;
    }
case 1:
{
        break forest_join_47;
    }
}
    }
    (p1)[(life6_5 + 1)] = ((byte) (life8_27 & __invokedynamic238_4(22989, (7456811881167011909L ^ life3_3))));
    }
    (p1)[life6_5] = ((byte) (life8_27 >> 4));
    life6_5 += 2;
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    return;
}
public static void h238_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call3023800_0(p0);
}
public static void h238_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call3023801_0(p0);
}
private static native long __fieldRead238_0() throws Throwable;
private static native boolean __call238_1() throws Throwable;
private static native int __integerCategory238_2(boolean value) throws Throwable;
private static native int __invokedynamic238_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic238_4(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3023800_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call3023801_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5fe69f63681860a50299(com.moon.nL a0) throws E;
private static final class __SourceHandler_5fe69f63681860a50299 {

public static boolean f524(com.moon.nL receiver) throws Throwable {
    int forwardValue524_23_0;
    int forwardValue524_25_0;
    int spill524_0;
    int spill524_1;
    long life1_3;
    int life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    life1_3 = (__fieldRead524_0() ^ 83989917725191L);
    life3_5 = __integerCategory524_2(__call524_1());
    spill524_0 = __fieldRead524_3(receiver);
    if (!((life3_5 == 0))) {
        forwardValue524_23_0 = spill524_0;
        break forward_join_23;
    }
    if (!((spill524_0 != __invokedynamic524_4(14165, (3075630464252039186L ^ life1_3))))) {
        break forward_join_22;
    }
    spill524_1 = __fieldRead524_5(receiver);
    if (!((life3_5 == 0))) {
        forwardValue524_23_0 = spill524_1;
        break forward_join_23;
    }
    if (!((spill524_1 == 4))) {
        break forward_join_24;
    }
    }
    forwardValue524_23_0 = 1;
    }
    forwardValue524_25_0 = forwardValue524_23_0;
    break forward_join_25;
    }
    forwardValue524_25_0 = 0;
    }
    return __integerCategory524_6(forwardValue524_25_0);
}
public static void h524_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052400_0(p0);
}
public static void h524_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052401_0(p0);
}
public static void h524_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052402_0(p0);
}
public static void h524_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052403_0(p0);
}
private static native long __fieldRead524_0() throws Throwable;
private static native boolean __call524_1() throws Throwable;
private static native int __integerCategory524_2(boolean value) throws Throwable;
private static native int __fieldRead524_3(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic524_4(int a0, long a1) throws Throwable;
private static native int __fieldRead524_5(com.moon.nL a0) throws Throwable;
private static native boolean __integerCategory524_6(int value) throws Throwable;
private static native java.lang.Exception __call1052400_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052401_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052402_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052403_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_608cfe885ab06c7eb06a(byte[] a0) throws E;
private static final class __SourceHandler_608cfe885ab06c7eb06a {

public static boolean f525(byte[] p0) throws Throwable {
    int lexicalValue525_24_0;
    int lexicalValue525_29_0;
    boolean spill525_0;
    byte spill525_1;
    long life1_3;
    int life4_6;
    int life3_7;
    lexical_join_29: {
    lexical_join_28: {
    life1_3 = (__fieldRead525_0() ^ 8592262935840L);
    spill525_0 = __call525_1();
    life4_6 = 0;
    life3_7 = __integerCategory525_2(spill525_0);
    lexical_cycle_8: while (true) {
    lexical_join_25: {
    lexical_join_24: {
    if (!((life4_6 < (__fieldRead525_3()).length))) {
        break lexical_join_28;
    }
    spill525_1 = (p0)[life4_6];
    if (!((life3_7 == 0))) {
        lexicalValue525_29_0 = __integerCategory525_4(spill525_1);
        break lexical_join_29;
    }
    if (!((life3_7 == 0))) {
        lexicalValue525_24_0 = __integerCategory525_5(spill525_1);
        break lexical_join_24;
    }
    if (!((spill525_1 != (__fieldRead525_6())[life4_6]))) {
        break lexical_join_25;
    }
    lexicalValue525_24_0 = 0;
    }
    return __integerCategory525_7(lexicalValue525_24_0);
    }
    life4_6 += 1;
    if (!((life3_7 != 0))) { continue lexical_cycle_8; }
    break lexical_cycle_8;
    }
    }
    lexicalValue525_29_0 = 1;
    }
    return __integerCategory525_8(lexicalValue525_29_0);
}
public static void h525_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052500_0(p0);
}
public static void h525_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052501_0(p0);
}
public static void h525_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052502_0(p0);
}
private static native long __fieldRead525_0() throws Throwable;
private static native boolean __call525_1() throws Throwable;
private static native int __integerCategory525_2(boolean value) throws Throwable;
private static native byte[] __fieldRead525_3() throws Throwable;
private static native int __integerCategory525_4(byte value) throws Throwable;
private static native int __integerCategory525_5(byte value) throws Throwable;
private static native byte[] __fieldRead525_6() throws Throwable;
private static native boolean __integerCategory525_7(int value) throws Throwable;
private static native boolean __integerCategory525_8(int value) throws Throwable;
private static native java.lang.Exception __call1052500_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052501_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052502_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d09d1692d4586742ba8f(com.moon.nL a0) throws E;
private static final class __SourceHandler_d09d1692d4586742ba8f {

public static void f93(com.moon.nL receiver) throws Throwable {
    int forwardValue93_79_0;
    com.moon.nL forwardValue93_99_0;
    com.moon.nL forwardValue93_127_0;
    com.moon.nL forwardValue93_159_0;
    com.moon.nL forwardValue93_191_0;
    com.moon.nL forwardValue93_205_0;
    int forwardValue93_263_0;
    int forwardValue93_283_0;
    boolean spill93_0;
    int spill93_1;
    com.moon.nL spill93_2;
    com.moon.nL spill93_3;
    com.moon.nL spill93_4;
    com.moon.nL spill93_5;
    com.moon.nL spill93_6;
    byte spill93_7;
    long life1_3;
    int life3_30;
    forward_join_293: {
    forward_join_283: {
    forward_join_275: {
    forward_join_263: {
    forward_join_255: {
    forward_join_235: {
    forward_join_222: {
    forward_join_209: {
    forward_join_205: {
    forward_join_204: {
    forward_join_199: {
    forward_join_191: {
    forward_join_190: {
    forward_join_167: {
    forward_join_159: {
    forward_join_158: {
    forward_join_135: {
    forward_join_127: {
    forward_join_126: {
    forward_join_103: {
    forward_join_99: {
    forward_join_98: {
    forward_join_79: {
    forward_join_75: {
    life1_3 = (__fieldRead93_0() ^ 7561288020004L);
    __call93_2(receiver, __invokedynamic93_1(29052, (3577833354002535450L ^ life1_3)));
    __call93_5(receiver, __fieldRead93_3(receiver), 0, __invokedynamic93_4(8736, (1030204388943316828L ^ life1_3)));
    spill93_0 = __call93_6();
    __fieldWrite93_9(receiver, __call93_8(receiver, __fieldRead93_7(receiver), 0));
    life3_30 = __integerCategory93_10(spill93_0);
    __fieldWrite93_13(receiver, __call93_12(receiver, __fieldRead93_11(receiver), 4));
    __fieldWrite93_17(receiver, ((__fieldRead93_14(receiver))[__invokedynamic93_15(17883, (2802977608238211245L ^ life1_3))] & __invokedynamic93_16(8889, (5816863440206153691L ^ life1_3))));
    __fieldWrite93_21(receiver, ((__fieldRead93_18(receiver))[__invokedynamic93_19(1261, (876483123856761235L ^ life1_3))] & __invokedynamic93_20(1797, (8376271293040681598L ^ life1_3))));
    spill93_1 = __fieldRead93_22(receiver);
    if (!((life3_30 != 0))) {
        forwardValue93_79_0 = spill93_1;
        break forward_join_79;
    }
    switch (spill93_1) {
case 0:
{
        break forward_join_75;
    }
case 4:
{
        break forward_join_103;
    }
case 2:
{
        break forward_join_135;
    }
case 6:
{
        break forward_join_167;
    }
case 3:
{
        break forward_join_199;
    }
case 1:
case 5:
default:
{
        break forward_join_222;
    }
}
    }
    spill93_2 = receiver;
    if (!((life3_30 != 0))) {
        forwardValue93_99_0 = spill93_2;
        break forward_join_99;
    }
    forwardValue93_79_0 = __fieldRead93_23(spill93_2);
    }
    if (!((forwardValue93_79_0 != __invokedynamic93_24(17883, (2802977608238211245L ^ life1_3))))) {
        break forward_join_98;
    }
    java.lang.Object __inlineStack93_27Token;
    throw new java.io.IOException(__invokedynamic93_28(__inlineStack93_27Output0((__inlineStack93_27Token = __inlineStack93_27Pack(__fieldRead93_25(receiver), __invokedynamic93_26(25535, (153515850978360364L ^ life1_3))))), __inlineStack93_27Output1(__inlineStack93_27Token)));
    }
    forwardValue93_99_0 = receiver;
    }
    __fieldWrite93_29(forwardValue93_99_0, 1);
    if (!((life3_30 == 0))) {
        break forward_join_235;
    }
    }
    spill93_3 = receiver;
    if (!((life3_30 != 0))) {
        forwardValue93_127_0 = spill93_3;
        break forward_join_127;
    }
    if (!((__fieldRead93_30(spill93_3) != __invokedynamic93_31(17883, (2802977608238211245L ^ life1_3))))) {
        break forward_join_126;
    }
    java.lang.Object __inlineStack93_34Token;
    throw new java.io.IOException(__invokedynamic93_35(__inlineStack93_34Output0((__inlineStack93_34Token = __inlineStack93_34Pack(__fieldRead93_32(receiver), __invokedynamic93_33(32646, (4153240159657648133L ^ life1_3))))), __inlineStack93_34Output1(__inlineStack93_34Token)));
    }
    forwardValue93_127_0 = receiver;
    }
    __fieldWrite93_37(forwardValue93_127_0, __invokedynamic93_36(2180, (8282244349585452528L ^ life1_3)));
    if (!((life3_30 == 0))) {
        break forward_join_235;
    }
    }
    spill93_4 = receiver;
    if (!((life3_30 != 0))) {
        forwardValue93_159_0 = spill93_4;
        break forward_join_159;
    }
    if (!((__fieldRead93_38(spill93_4) != __invokedynamic93_39(17883, (2802977608238211245L ^ life1_3))))) {
        break forward_join_158;
    }
    java.lang.Object __inlineStack93_42Token;
    throw new java.io.IOException(__invokedynamic93_43(__inlineStack93_42Output0((__inlineStack93_42Token = __inlineStack93_42Pack(__fieldRead93_40(receiver), __invokedynamic93_41(32646, (4153240159657648133L ^ life1_3))))), __inlineStack93_42Output1(__inlineStack93_42Token)));
    }
    forwardValue93_159_0 = receiver;
    }
    __fieldWrite93_45(forwardValue93_159_0, __invokedynamic93_44(1664, (7810232203003356140L ^ life1_3)));
    if (!((life3_30 == 0))) {
        break forward_join_235;
    }
    }
    spill93_5 = receiver;
    if (!((life3_30 != 0))) {
        forwardValue93_191_0 = spill93_5;
        break forward_join_191;
    }
    if (!((__fieldRead93_46(spill93_5) != __invokedynamic93_47(17883, (2802977608238211245L ^ life1_3))))) {
        break forward_join_190;
    }
    java.lang.Object __inlineStack93_50Token;
    throw new java.io.IOException(__invokedynamic93_51(__inlineStack93_50Output0((__inlineStack93_50Token = __inlineStack93_50Pack(__fieldRead93_48(receiver), __invokedynamic93_49(32646, (4153240159657648133L ^ life1_3))))), __inlineStack93_50Output1(__inlineStack93_50Token)));
    }
    forwardValue93_191_0 = receiver;
    }
    __fieldWrite93_53(forwardValue93_191_0, __invokedynamic93_52(2849, (1153808698696134216L ^ life1_3)));
    if (!((life3_30 == 0))) {
        break forward_join_235;
    }
    }
    spill93_6 = receiver;
    if (!((life3_30 != 0))) {
        forwardValue93_205_0 = spill93_6;
        break forward_join_205;
    }
    switch (__fieldRead93_54(spill93_6)) {
case 1:
case 2:
case 4:
case 8:
{
        break forward_join_204;
    }
case 3:
case 5:
case 6:
case 7:
default:
{
        break forward_join_209;
    }
}
    }
    forwardValue93_205_0 = receiver;
    }
    __fieldWrite93_55(forwardValue93_205_0, 1);
    if (!((life3_30 == 0))) {
        break forward_join_235;
    }
    }
    java.lang.Object __inlineStack93_58Token;
    throw new java.io.IOException(__invokedynamic93_59(__inlineStack93_58Output0((__inlineStack93_58Token = __inlineStack93_58Pack(__fieldRead93_56(receiver), __invokedynamic93_57(32646, (4153240159657648133L ^ life1_3))))), __inlineStack93_58Output1(__inlineStack93_58Token)));
    }
    java.lang.Object __inlineStack93_62Token;
    throw new java.io.IOException(__invokedynamic93_63(__inlineStack93_62Output0((__inlineStack93_62Token = __inlineStack93_62Pack(__fieldRead93_60(receiver), __invokedynamic93_61(14177, (4606906230128912630L ^ life1_3))))), __inlineStack93_62Output1(__inlineStack93_62Token)));
    }
    spill93_7 = (__fieldRead93_64(receiver))[__invokedynamic93_65(27128, (1219153291626679445L ^ life1_3))];
    if (!((life3_30 != 0))) {
        forwardValue93_263_0 = __integerCategory93_66(spill93_7);
        break forward_join_263;
    }
    if (!((spill93_7 != 0))) {
        break forward_join_255;
    }
    throw new java.io.IOException(__invokedynamic93_67(23837, (7447034269796745885L ^ life1_3)));
    }
    forwardValue93_263_0 = __integerCategory93_70((__fieldRead93_68(receiver))[__invokedynamic93_69(23191, (1425618244839325689L ^ life1_3))]);
    }
    if (!((life3_30 != 0))) {
        forwardValue93_283_0 = forwardValue93_263_0;
        break forward_join_283;
    }
    if (!((forwardValue93_263_0 != 0))) {
        break forward_join_275;
    }
    throw new java.io.IOException(__invokedynamic93_71(20843, (5501149388616421115L ^ life1_3)));
    }
    forwardValue93_283_0 = __integerCategory93_74((__fieldRead93_72(receiver))[__invokedynamic93_73(11804, (9042404593251076971L ^ life1_3))]);
    }
    if (!((forwardValue93_283_0 != 0))) {
        break forward_join_293;
    }
    throw new java.io.IOException(__invokedynamic93_75(5926, (7698299223871588531L ^ life1_3)));
    }
    return;
}
public static void h93_0(java.io.IOException p0) throws Throwable {
    throw __call3009300_0(p0);
}
public static void h93_1(java.io.IOException p0) throws Throwable {
    throw __call3009301_0(p0);
}
public static void h93_2(java.io.IOException p0) throws Throwable {
    throw __call3009302_0(p0);
}
public static void h93_3(java.io.IOException p0) throws Throwable {
    throw __call3009303_0(p0);
}
public static void h93_4(java.io.IOException p0) throws Throwable {
    throw __call3009304_0(p0);
}
public static void h93_5(java.io.IOException p0) throws Throwable {
    throw __call3009305_0(p0);
}
public static void h93_6(java.io.IOException p0) throws Throwable {
    throw __call3009306_0(p0);
}
public static void h93_7(java.io.IOException p0) throws Throwable {
    throw __call3009307_0(p0);
}
public static void h93_8(java.io.IOException p0) throws Throwable {
    throw __call3009308_0(p0);
}
public static void h93_9(java.io.IOException p0) throws Throwable {
    throw __call3009309_0(p0);
}
public static void h93_10(java.io.IOException p0) throws Throwable {
    throw __call3009310_0(p0);
}
public static void h93_11(java.io.IOException p0) throws Throwable {
    throw __call3009311_0(p0);
}
public static void h93_12(java.io.IOException p0) throws Throwable {
    throw __call3009312_0(p0);
}
public static void h93_13(java.io.IOException p0) throws Throwable {
    throw __call3009313_0(p0);
}
public static void h93_14(java.io.IOException p0) throws Throwable {
    throw __call3009314_0(p0);
}
public static void h93_15(java.io.IOException p0) throws Throwable {
    throw __call3009315_0(p0);
}
public static void h93_16(java.io.IOException p0) throws Throwable {
    throw __call3009316_0(p0);
}
public static void h93_17(java.io.IOException p0) throws Throwable {
    throw __call3009317_0(p0);
}
public static void h93_18(java.io.IOException p0) throws Throwable {
    throw __call3009318_0(p0);
}
public static void h93_19(java.io.IOException p0) throws Throwable {
    throw __call3009319_0(p0);
}
public static void h93_20(java.io.IOException p0) throws Throwable {
    throw __call3009320_0(p0);
}
public static void h93_21(java.io.IOException p0) throws Throwable {
    throw __call3009321_0(p0);
}
private static native long __fieldRead93_0() throws Throwable;
private static native int __invokedynamic93_1(int a0, long a1) throws Throwable;
private static native void __call93_2(com.moon.nL a0, int a1) throws Throwable;
private static native byte[] __fieldRead93_3(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_4(int a0, long a1) throws Throwable;
private static native int __call93_5(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native boolean __call93_6() throws Throwable;
private static native byte[] __fieldRead93_7(com.moon.nL a0) throws Throwable;
private static native int __call93_8(com.moon.nL a0, byte[] a1, int a2) throws Throwable;
private static native void __fieldWrite93_9(com.moon.nL a0, int a1) throws Throwable;
private static native int __integerCategory93_10(boolean value) throws Throwable;
private static native byte[] __fieldRead93_11(com.moon.nL a0) throws Throwable;
private static native int __call93_12(com.moon.nL a0, byte[] a1, int a2) throws Throwable;
private static native void __fieldWrite93_13(com.moon.nL a0, int a1) throws Throwable;
private static native byte[] __fieldRead93_14(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_15(int a0, long a1) throws Throwable;
private static native int __invokedynamic93_16(int a0, long a1) throws Throwable;
private static native void __fieldWrite93_17(com.moon.nL a0, int a1) throws Throwable;
private static native byte[] __fieldRead93_18(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic93_20(int a0, long a1) throws Throwable;
private static native void __fieldWrite93_21(com.moon.nL a0, int a1) throws Throwable;
private static native int __fieldRead93_22(com.moon.nL a0) throws Throwable;
private static native int __fieldRead93_23(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_24(int a0, long a1) throws Throwable;
private static native int __fieldRead93_25(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic93_26(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack93_27Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack93_27Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack93_27Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic93_28(java.lang.String a0, int a1) throws Throwable;
private static native void __fieldWrite93_29(com.moon.nL a0, int a1) throws Throwable;
private static native int __fieldRead93_30(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_31(int a0, long a1) throws Throwable;
private static native int __fieldRead93_32(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic93_33(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack93_34Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack93_34Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack93_34Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic93_35(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic93_36(int a0, long a1) throws Throwable;
private static native void __fieldWrite93_37(com.moon.nL a0, int a1) throws Throwable;
private static native int __fieldRead93_38(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_39(int a0, long a1) throws Throwable;
private static native int __fieldRead93_40(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic93_41(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack93_42Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack93_42Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack93_42Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic93_43(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic93_44(int a0, long a1) throws Throwable;
private static native void __fieldWrite93_45(com.moon.nL a0, int a1) throws Throwable;
private static native int __fieldRead93_46(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_47(int a0, long a1) throws Throwable;
private static native int __fieldRead93_48(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic93_49(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack93_50Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack93_50Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack93_50Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic93_51(java.lang.String a0, int a1) throws Throwable;
private static native int __invokedynamic93_52(int a0, long a1) throws Throwable;
private static native void __fieldWrite93_53(com.moon.nL a0, int a1) throws Throwable;
private static native int __fieldRead93_54(com.moon.nL a0) throws Throwable;
private static native void __fieldWrite93_55(com.moon.nL a0, int a1) throws Throwable;
private static native int __fieldRead93_56(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic93_57(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack93_58Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack93_58Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack93_58Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic93_59(java.lang.String a0, int a1) throws Throwable;
private static native int __fieldRead93_60(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic93_61(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack93_62Pack(int a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack93_62Output0(java.lang.Object token) throws Throwable;
private static native int __inlineStack93_62Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic93_63(java.lang.String a0, int a1) throws Throwable;
private static native byte[] __fieldRead93_64(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_65(int a0, long a1) throws Throwable;
private static native int __integerCategory93_66(byte value) throws Throwable;
private static native java.lang.String __invokedynamic93_67(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead93_68(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_69(int a0, long a1) throws Throwable;
private static native int __integerCategory93_70(byte value) throws Throwable;
private static native java.lang.String __invokedynamic93_71(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead93_72(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic93_73(int a0, long a1) throws Throwable;
private static native int __integerCategory93_74(byte value) throws Throwable;
private static native java.lang.String __invokedynamic93_75(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3009300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009303_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009304_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009305_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009306_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009307_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009308_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009309_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009310_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009311_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009312_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009313_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009314_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009315_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009316_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009317_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009318_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009319_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009320_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3009321_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_24d0a8366d74bba67677(com.moon.nL a0, int a1) throws E;
private static final class __SourceHandler_24d0a8366d74bba67677 {

public static void f753(com.moon.nL receiver, int p0) throws Throwable {
    long life2_3;
    life2_3 = (__fieldRead753_0() ^ 48345345237831L);
    if ((__fieldRead753_1(receiver) != p0)) {
        throw new java.io.IOException(__invokedynamic753_2(4130, (8719033507931512007L ^ life2_3)));
    }
    return;
}
public static void h753_0(java.io.IOException p0) throws Throwable {
    throw __call1075300_0(p0);
}
private static native long __fieldRead753_0() throws Throwable;
private static native int __fieldRead753_1(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic753_2(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1075300_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_53f2f5a3f6cff1ac2d84(com.moon.nL a0, java.nio.ByteBuffer a1, int a2, com.moon.ci a3) throws E;
private static final class __SourceHandler_53f2f5a3f6cff1ac2d84 {

public static void f526(com.moon.nL receiver, java.nio.ByteBuffer p0, int p1, com.moon.ci p2) throws Throwable {
    int forwardValue526_21_0;
    int spill526_0;
    long life4_3;
    int life6_5;
    int life7_26;
    int life8_33;
    forward_join_21: {
    forward_join_19: {
    life4_3 = (__fieldRead526_0() ^ 32663438094985L);
    life6_5 = __integerCategory526_2(__call526_1());
    spill526_0 = p1;
    if (!((life6_5 != 0))) {
        forwardValue526_21_0 = spill526_0;
        break forward_join_21;
    }
    if (!((spill526_0 <= 0))) {
        break forward_join_19;
    }
    throw new java.lang.IllegalArgumentException(__invokedynamic526_3(30082, (8621922456211908774L ^ life4_3)));
    }
    forwardValue526_21_0 = __call526_4(p0);
    }
    life7_26 = forwardValue526_21_0;
    life8_33 = ((__fieldRead526_5(receiver) - 1) * p1);
    __call526_6(p0, (life7_26 + life8_33));
    __call526_7(receiver, p0, (-p1), p2);
    __call526_9(p0, (__call526_8(p0) + life8_33));
    return;
}
public static void h526_0(java.io.IOException p0) throws Throwable {
    throw __call1052600_0(p0);
}
public static void h526_1(java.io.IOException p0) throws Throwable {
    throw __call1052601_0(p0);
}
private static native long __fieldRead526_0() throws Throwable;
private static native boolean __call526_1() throws Throwable;
private static native int __integerCategory526_2(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic526_3(int a0, long a1) throws Throwable;
private static native int __call526_4(java.nio.ByteBuffer a0) throws Throwable;
private static native int __fieldRead526_5(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call526_6(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native void __call526_7(com.moon.nL a0, java.nio.ByteBuffer a1, int a2, com.moon.ci a3) throws Throwable;
private static native int __call526_8(java.nio.ByteBuffer a0) throws Throwable;
private static native java.nio.ByteBuffer __call526_9(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1052600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1052601_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b5f6968b780030b2d913(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws E;
private static final class __SourceHandler_b5f6968b780030b2d913 {

public static void f527(com.moon.nL receiver, java.nio.ByteBuffer p0, byte[] p1) throws Throwable {
    byte[] lexicalValue527_13_0;
    int lexicalValue527_68_0;
    int lexicalValue527_68_1;
    int lexicalValue527_70_0;
    byte[] spill527_0;
    int spill527_1;
    int spill527_2;
    int spill527_3;
    long life3_3;
    int life5_5;
    int life6_21;
    int life7_26;
    int life8_31;
    int life9_33;
    int life10_36;
    int life11_43;
    int life12_49;
    int life13_55;
    int life14_57;
    int life6_111;
    int life7_114;
    lexical_join_117: {
    lexical_join_86: {
    lexical_join_84: {
    lexical_join_13: {
    life3_3 = (__fieldRead527_0() ^ 34349084077826L);
    life5_5 = __integerCategory527_2(__call527_1());
    spill527_0 = __fieldRead527_3(receiver);
    if (!((life5_5 == 0))) {
        lexicalValue527_13_0 = spill527_0;
        break lexical_join_13;
    }
    if (!((spill527_0 != null))) {
        break lexical_join_86;
    }
    lexicalValue527_13_0 = __fieldRead527_4(receiver);
    }
    life6_21 = (lexicalValue527_13_0)[1];
    life7_26 = (__fieldRead527_5(receiver))[3];
    life8_31 = (__fieldRead527_6(receiver))[5];
    life9_33 = 1;
    life10_36 = (p1).length;
    lexical_cycle_31: while (true) {
    lexical_join_82: {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_68: {
    if (!((life9_33 < life10_36))) {
        break lexical_join_84;
    }
    life11_43 = (p1)[life9_33];
    life12_49 = (p1)[(life9_33 + 1)];
    life13_55 = (p1)[(life9_33 + 2)];
    life14_57 = -1;
    if (!((life5_5 == 0))) {
        break lexical_join_117;
    }
    if (!((life5_5 == 0))) {
        break lexical_join_82;
    }
    if (!((life11_43 == life6_21))) {
        break lexical_join_71;
    }
    spill527_1 = life12_49;
    spill527_2 = life7_26;
    if (!((life5_5 == 0))) {
        lexicalValue527_68_0 = spill527_1;
        lexicalValue527_68_1 = spill527_2;
        break lexical_join_68;
    }
    if (!((spill527_1 == spill527_2))) {
        break lexical_join_71;
    }
    spill527_3 = life13_55;
    if (!((life5_5 == 0))) {
        lexicalValue527_70_0 = spill527_3;
        break lexical_join_70;
    }
    lexicalValue527_68_0 = spill527_3;
    lexicalValue527_68_1 = life8_31;
    }
    if (!((lexicalValue527_68_0 == lexicalValue527_68_1))) {
        break lexical_join_71;
    }
    lexicalValue527_70_0 = 0;
    }
    life14_57 = lexicalValue527_70_0;
    }
    __call527_10(__call527_9(__call527_8(__call527_7(p0, life14_57), life13_55), life12_49), life11_43);
    life9_33 += 3;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    if (!((life5_5 != 0))) {
        break lexical_join_117;
    }
    }
    life6_111 = 1;
    life7_114 = (p1).length;
    lexical_cycle_91: while (true) {
    if (!((life6_111 < life7_114))) {
        break lexical_join_117;
    }
    __call527_14(__call527_13(__call527_12(__call527_11(p0, -1), (p1)[(life6_111 + 2)]), (p1)[(life6_111 + 1)]), (p1)[life6_111]);
    life6_111 += 3;
    if (!((life5_5 != 0))) { continue lexical_cycle_91; }
    break lexical_cycle_91;
    }
    }
    return;
}
public static void h527_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052700_0(p0);
}
public static void h527_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052701_0(p0);
}
public static void h527_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052702_0(p0);
}
public static void h527_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052703_0(p0);
}
public static void h527_4(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052704_0(p0);
}
public static void h527_5(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052705_0(p0);
}
public static void h527_6(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052706_0(p0);
}
public static void h527_7(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052707_0(p0);
}
private static native long __fieldRead527_0() throws Throwable;
private static native boolean __call527_1() throws Throwable;
private static native int __integerCategory527_2(boolean value) throws Throwable;
private static native byte[] __fieldRead527_3(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead527_4(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead527_5(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead527_6(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call527_7(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call527_8(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call527_9(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call527_10(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call527_11(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call527_12(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call527_13(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call527_14(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.lang.Exception __call1052700_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052701_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052702_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052703_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052704_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052705_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052706_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052707_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_eebf3cec1af7a9e34e29(com.moon.nL a0, byte[] a1, byte[] a2) throws E;
private static final class __SourceHandler_eebf3cec1af7a9e34e29 {

public static void f236(com.moon.nL receiver, byte[] p0, byte[] p1) throws Throwable {
    boolean spill236_0;
    long life3_3;
    int life6_5;
    int life7_9;
    int life5_10;
    int life8_27;
    forest_join_79: {
    life3_3 = (__fieldRead236_0() ^ 49737975104556L);
    life6_5 = 1;
    spill236_0 = __call236_1();
    life7_9 = (p1).length;
    life5_10 = __integerCategory236_2(spill236_0);
    forest_cycle_11: while (true) {
    forest_join_77: {
    forest_join_65: {
    forest_join_54: {
    forest_join_43: {
    forest_join_34: {
    if (!((life6_5 < life7_9))) {
        break forest_join_79;
    }
    life8_27 = ((p0)[(1 + (life6_5 >> 2))] & __invokedynamic236_3(1797, (8376226366983083638L ^ life3_3)));
    if (!((life5_10 == 0))) {
        break forest_join_77;
    }
    switch ((life7_9 - life6_5)) {
default:
{
        break forest_join_34;
    }
case 3:
{
        break forest_join_43;
    }
case 2:
{
        break forest_join_54;
    }
case 1:
{
        break forest_join_65;
    }
}
    }
    (p1)[(life6_5 + 3)] = ((byte) (life8_27 & 3));
    }
    (p1)[(life6_5 + 2)] = ((byte) ((life8_27 >> 2) & 3));
    }
    (p1)[(life6_5 + 1)] = ((byte) ((life8_27 >> 4) & 3));
    }
    (p1)[life6_5] = ((byte) (life8_27 >> __invokedynamic236_4(14165, (3075594346385352249L ^ life3_3))));
    life6_5 += 4;
    }
    if (!((life5_10 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    return;
}
public static void h236_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call3023600_0(p0);
}
public static void h236_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call3023601_0(p0);
}
private static native long __fieldRead236_0() throws Throwable;
private static native boolean __call236_1() throws Throwable;
private static native int __integerCategory236_2(boolean value) throws Throwable;
private static native int __invokedynamic236_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic236_4(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3023600_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call3023601_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_06a1e8f3bcbab63e326e(com.moon.nL a0) throws E;
private static final class __SourceHandler_06a1e8f3bcbab63e326e {

public static boolean f529(com.moon.nL receiver) throws Throwable {
    byte[] forwardValue529_18_0;
    int forwardValue529_20_0;
    int forwardValue529_22_0;
    boolean spill529_0;
    byte[] spill529_1;
    long life1_3;
    int life3_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (__fieldRead529_0() ^ 42506528788858L);
    life3_5 = __integerCategory529_2(__call529_1());
    spill529_0 = __call529_3(receiver);
    if (!((life3_5 != 0))) {
        forwardValue529_20_0 = __integerCategory529_4(spill529_0);
        break forward_join_20;
    }
    if (!((!spill529_0))) {
        break forward_join_19;
    }
    spill529_1 = __fieldRead529_5(receiver);
    if (!((life3_5 != 0))) {
        forwardValue529_18_0 = spill529_1;
        break forward_join_18;
    }
    if (!((spill529_1 == null))) {
        break forward_join_19;
    }
    forwardValue529_18_0 = __fieldRead529_6(receiver);
    }
    if (!((forwardValue529_18_0 != null))) {
        break forward_join_21;
    }
    }
    forwardValue529_20_0 = 1;
    }
    forwardValue529_22_0 = forwardValue529_20_0;
    break forward_join_22;
    }
    forwardValue529_22_0 = 0;
    }
    return __integerCategory529_7(forwardValue529_22_0);
}
public static void h529_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052900_0(p0);
}
public static void h529_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052901_0(p0);
}
public static void h529_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052902_0(p0);
}
public static void h529_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1052903_0(p0);
}
private static native long __fieldRead529_0() throws Throwable;
private static native boolean __call529_1() throws Throwable;
private static native int __integerCategory529_2(boolean value) throws Throwable;
private static native boolean __call529_3(com.moon.nL a0) throws Throwable;
private static native int __integerCategory529_4(boolean value) throws Throwable;
private static native byte[] __fieldRead529_5(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead529_6(com.moon.nL a0) throws Throwable;
private static native boolean __integerCategory529_7(int value) throws Throwable;
private static native java.lang.Exception __call1052900_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052901_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052902_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1052903_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e17b53c1e996ae998f29(com.moon.nL a0) throws E;
private static final class __SourceHandler_e17b53c1e996ae998f29 {

public static void f47(com.moon.nL receiver) throws Throwable {
    int forwardValue47_22_0;
    int forwardValue47_22_1;
    int forwardValue47_28_0;
    int forwardValue47_28_1;
    int forwardValue47_55_0;
    boolean spill47_0;
    int spill47_1;
    int spill47_2;
    int spill47_3;
    long life1_3;
    int life4_9;
    int life3_10;
    forward_join_55: {
    forward_join_41: {
    forward_join_32: {
    forward_join_28: {
    forward_join_22: {
    life1_3 = (__fieldRead47_0() ^ 9260556578628L);
    spill47_0 = __call47_1();
    life4_9 = (__fieldRead47_2(receiver) / 3);
    life3_10 = __integerCategory47_3(spill47_0);
    spill47_1 = life4_9;
    spill47_2 = 1;
    if (!((life3_10 != 0))) {
        forwardValue47_22_0 = spill47_1;
        forwardValue47_22_1 = spill47_2;
        break forward_join_22;
    }
    if (!((spill47_1 >= spill47_2))) {
        break forward_join_32;
    }
    forwardValue47_22_0 = life4_9;
    forwardValue47_22_1 = __invokedynamic47_4(25883, (402449206253854480L ^ life1_3));
    }
    if (!((life3_10 != 0))) {
        forwardValue47_28_0 = forwardValue47_22_0;
        forwardValue47_28_1 = forwardValue47_22_1;
        break forward_join_28;
    }
    if (!((forwardValue47_22_0 <= forwardValue47_22_1))) {
        break forward_join_32;
    }
    forwardValue47_28_0 = __fieldRead47_5(receiver);
    forwardValue47_28_1 = 3;
    }
    spill47_3 = (forwardValue47_28_0 % forwardValue47_28_1);
    if (!((life3_10 != 0))) {
        forwardValue47_55_0 = spill47_3;
        break forward_join_55;
    }
    if (!((spill47_3 != 0))) {
        break forward_join_41;
    }
    }
    throw new java.io.IOException(__invokedynamic47_6(23371, (6169872376967486393L ^ life1_3)));
    }
    __fieldWrite47_7(receiver, new byte[(life4_9 * 3)]);
    forwardValue47_55_0 = __call47_10(receiver, __fieldRead47_8(receiver), 0, (__fieldRead47_9(receiver)).length);
    }
    __discardScalar47_11(forwardValue47_55_0);
    return;
}
public static void h47_0(java.io.IOException p0) throws Throwable {
    throw __call1004700_0(p0);
}
public static void h47_1(java.io.IOException p0) throws Throwable {
    throw __call1004701_0(p0);
}
public static void h47_2(java.io.IOException p0) throws Throwable {
    throw __call1004702_0(p0);
}
public static void h47_3(java.io.IOException p0) throws Throwable {
    throw __call1004703_0(p0);
}
public static void h47_4(java.io.IOException p0) throws Throwable {
    throw __call1004704_0(p0);
}
public static void h47_5(java.io.IOException p0) throws Throwable {
    throw __call1004705_0(p0);
}
private static native long __fieldRead47_0() throws Throwable;
private static native boolean __call47_1() throws Throwable;
private static native int __fieldRead47_2(com.moon.nL a0) throws Throwable;
private static native int __integerCategory47_3(boolean value) throws Throwable;
private static native int __invokedynamic47_4(int a0, long a1) throws Throwable;
private static native int __fieldRead47_5(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic47_6(int a0, long a1) throws Throwable;
private static native void __fieldWrite47_7(com.moon.nL a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead47_8(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead47_9(com.moon.nL a0) throws Throwable;
private static native int __call47_10(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native void __discardScalar47_11(int a0) throws Throwable;
private static native java.lang.Exception __call1004700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1004701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1004702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1004703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1004704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1004705_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_57f28e0809beaf94f91b(com.moon.nL a0) throws E;
private static final class __SourceHandler_57f28e0809beaf94f91b {

public static void f98(com.moon.nL receiver) throws Throwable {
    int forwardValue98_24_0;
    byte[] forwardValue98_79_0;
    int spill98_0;
    byte[] spill98_1;
    long life1_3;
    int life3_5;
    forward_join_90: {
    forward_join_79: {
    forward_join_69: {
    forward_join_55: {
    forward_join_27: {
    forward_join_24: {
    forward_join_11: {
    life1_3 = (__fieldRead98_0() ^ 52084374944035L);
    life3_5 = __integerCategory98_2(__call98_1());
    spill98_0 = __fieldRead98_3(receiver);
    if (!((life3_5 == 0))) {
        forwardValue98_24_0 = spill98_0;
        break forward_join_24;
    }
    switch (spill98_0) {
case 0:
{
        break forward_join_11;
    }
case 2:
{
        break forward_join_27;
    }
case 3:
{
        break forward_join_55;
    }
case 1:
default:
{
        break forward_join_90;
    }
}
    }
    __call98_4(receiver, 2);
    __fieldWrite98_5(receiver, new byte[2]);
    forwardValue98_24_0 = __call98_7(receiver, __fieldRead98_6(receiver), 0, 2);
    }
    __discardScalar98_8(forwardValue98_24_0);
    if (!((life3_5 != 0))) {
        break forward_join_90;
    }
    }
    __call98_10(receiver, __invokedynamic98_9(14165, (3075596398574672694L ^ life1_3)));
    __fieldWrite98_12(receiver, new byte[__invokedynamic98_11(14165, (3075596398574672694L ^ life1_3))]);
    __call98_15(receiver, __fieldRead98_13(receiver), 0, __invokedynamic98_14(14165, (3075596398574672694L ^ life1_3)));
    if (!((life3_5 != 0))) {
        break forward_join_90;
    }
    }
    spill98_1 = __fieldRead98_16(receiver);
    if (!((life3_5 == 0))) {
        forwardValue98_79_0 = spill98_1;
        break forward_join_79;
    }
    if (!((spill98_1 == null))) {
        break forward_join_69;
    }
    throw new java.io.IOException(__invokedynamic98_17(25186, (1924220302433072359L ^ life1_3)));
    }
    __fieldWrite98_19(receiver, new byte[((__fieldRead98_18(receiver)).length / 3)]);
    forwardValue98_79_0 = __fieldRead98_20(receiver);
    }
    __call98_21(forwardValue98_79_0, -1);
    __call98_24(receiver, __fieldRead98_22(receiver), 0, (__fieldRead98_23(receiver)).length);
    }
    return;
}
public static void h98_0(java.io.IOException p0) throws Throwable {
    throw __call2009800_0(p0);
}
public static void h98_1(java.io.IOException p0) throws Throwable {
    throw __call2009801_0(p0);
}
public static void h98_2(java.io.IOException p0) throws Throwable {
    throw __call2009802_0(p0);
}
public static void h98_3(java.io.IOException p0) throws Throwable {
    throw __call2009803_0(p0);
}
public static void h98_4(java.io.IOException p0) throws Throwable {
    throw __call2009804_0(p0);
}
public static void h98_5(java.io.IOException p0) throws Throwable {
    throw __call2009805_0(p0);
}
private static native long __fieldRead98_0() throws Throwable;
private static native boolean __call98_1() throws Throwable;
private static native int __integerCategory98_2(boolean value) throws Throwable;
private static native int __fieldRead98_3(com.moon.nL a0) throws Throwable;
private static native void __call98_4(com.moon.nL a0, int a1) throws Throwable;
private static native void __fieldWrite98_5(com.moon.nL a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead98_6(com.moon.nL a0) throws Throwable;
private static native int __call98_7(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native void __discardScalar98_8(int a0) throws Throwable;
private static native int __invokedynamic98_9(int a0, long a1) throws Throwable;
private static native void __call98_10(com.moon.nL a0, int a1) throws Throwable;
private static native int __invokedynamic98_11(int a0, long a1) throws Throwable;
private static native void __fieldWrite98_12(com.moon.nL a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead98_13(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic98_14(int a0, long a1) throws Throwable;
private static native int __call98_15(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native byte[] __fieldRead98_16(com.moon.nL a0) throws Throwable;
private static native java.lang.String __invokedynamic98_17(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead98_18(com.moon.nL a0) throws Throwable;
private static native void __fieldWrite98_19(com.moon.nL a0, byte[] a1) throws Throwable;
private static native byte[] __fieldRead98_20(com.moon.nL a0) throws Throwable;
private static native void __call98_21(byte[] a0, int a1) throws Throwable;
private static native byte[] __fieldRead98_22(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead98_23(com.moon.nL a0) throws Throwable;
private static native int __call98_24(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call2009800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2009801_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2009802_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2009803_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2009804_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2009805_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5c65ad86d1d2fcfaf8fc(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws E;
private static final class __SourceHandler_5c65ad86d1d2fcfaf8fc {

public static void f531(com.moon.nL receiver, java.nio.ByteBuffer p0, byte[] p1) throws Throwable {
    byte[] lexicalValue531_13_0;
    int lexicalValue531_68_0;
    int lexicalValue531_68_1;
    int lexicalValue531_70_0;
    byte[] spill531_0;
    int spill531_1;
    int spill531_2;
    int spill531_3;
    long life3_3;
    int life5_5;
    int life6_21;
    int life7_26;
    int life8_31;
    int life9_33;
    int life10_36;
    int life11_43;
    int life12_49;
    int life13_55;
    int life14_57;
    int life6_111;
    int life7_114;
    lexical_join_117: {
    lexical_join_86: {
    lexical_join_84: {
    lexical_join_13: {
    life3_3 = (__fieldRead531_0() ^ 80253641988580L);
    life5_5 = __integerCategory531_2(__call531_1());
    spill531_0 = __fieldRead531_3(receiver);
    if (!((life5_5 == 0))) {
        lexicalValue531_13_0 = spill531_0;
        break lexical_join_13;
    }
    if (!((spill531_0 != null))) {
        break lexical_join_86;
    }
    lexicalValue531_13_0 = __fieldRead531_4(receiver);
    }
    life6_21 = (lexicalValue531_13_0)[1];
    life7_26 = (__fieldRead531_5(receiver))[3];
    life8_31 = (__fieldRead531_6(receiver))[5];
    life9_33 = 1;
    life10_36 = (p1).length;
    lexical_cycle_31: while (true) {
    lexical_join_82: {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_68: {
    if (!((life9_33 < life10_36))) {
        break lexical_join_84;
    }
    life11_43 = (p1)[life9_33];
    life12_49 = (p1)[(life9_33 + 1)];
    life13_55 = (p1)[(life9_33 + 2)];
    life14_57 = -1;
    if (!((life5_5 == 0))) {
        break lexical_join_117;
    }
    if (!((life5_5 == 0))) {
        break lexical_join_82;
    }
    if (!((life11_43 == life6_21))) {
        break lexical_join_71;
    }
    spill531_1 = life12_49;
    spill531_2 = life7_26;
    if (!((life5_5 == 0))) {
        lexicalValue531_68_0 = spill531_1;
        lexicalValue531_68_1 = spill531_2;
        break lexical_join_68;
    }
    if (!((spill531_1 == spill531_2))) {
        break lexical_join_71;
    }
    spill531_3 = life13_55;
    if (!((life5_5 == 0))) {
        lexicalValue531_70_0 = spill531_3;
        break lexical_join_70;
    }
    lexicalValue531_68_0 = spill531_3;
    lexicalValue531_68_1 = life8_31;
    }
    if (!((lexicalValue531_68_0 == lexicalValue531_68_1))) {
        break lexical_join_71;
    }
    lexicalValue531_70_0 = 0;
    }
    life14_57 = lexicalValue531_70_0;
    }
    __call531_10(__call531_9(__call531_8(__call531_7(p0, life11_43), life12_49), life13_55), life14_57);
    life9_33 += 3;
    }
    if (!((life5_5 != 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    if (!((life5_5 != 0))) {
        break lexical_join_117;
    }
    }
    life6_111 = 1;
    life7_114 = (p1).length;
    lexical_cycle_91: while (true) {
    if (!((life6_111 < life7_114))) {
        break lexical_join_117;
    }
    __call531_14(__call531_13(__call531_12(__call531_11(p0, (p1)[life6_111]), (p1)[(life6_111 + 1)]), (p1)[(life6_111 + 2)]), -1);
    life6_111 += 3;
    if (!((life5_5 != 0))) { continue lexical_cycle_91; }
    break lexical_cycle_91;
    }
    }
    return;
}
public static void h531_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053100_0(p0);
}
public static void h531_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053101_0(p0);
}
public static void h531_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053102_0(p0);
}
public static void h531_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053103_0(p0);
}
public static void h531_4(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053104_0(p0);
}
public static void h531_5(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053105_0(p0);
}
public static void h531_6(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053106_0(p0);
}
public static void h531_7(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053107_0(p0);
}
private static native long __fieldRead531_0() throws Throwable;
private static native boolean __call531_1() throws Throwable;
private static native int __integerCategory531_2(boolean value) throws Throwable;
private static native byte[] __fieldRead531_3(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead531_4(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead531_5(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead531_6(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call531_7(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call531_8(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call531_9(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call531_10(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call531_11(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call531_12(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call531_13(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call531_14(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1053100_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053101_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053102_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053103_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053104_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053105_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053106_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053107_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_89f282a6c7f4ba8f989f(com.moon.nL a0, byte[] a1, byte[] a2) throws E;
private static final class __SourceHandler_89f282a6c7f4ba8f989f {

public static void f237(com.moon.nL receiver, byte[] p0, byte[] p1) throws Throwable {
    boolean spill237_0;
    long life3_3;
    int life6_5;
    int life7_9;
    int life5_10;
    int life8_27;
    forest_join_135: {
    life3_3 = (__fieldRead237_0() ^ 121073614076052L);
    life6_5 = 1;
    spill237_0 = __call237_1();
    life7_9 = (p1).length;
    life5_10 = __integerCategory237_2(spill237_0);
    forest_cycle_11: while (true) {
    forest_join_133: {
    forest_join_121: {
    forest_join_106: {
    forest_join_95: {
    forest_join_84: {
    forest_join_73: {
    forest_join_62: {
    forest_join_47: {
    forest_join_34: {
    if (!((life6_5 < life7_9))) {
        break forest_join_135;
    }
    life8_27 = ((p0)[(1 + (life6_5 >> 3))] & __invokedynamic237_3(1797, (8376157238940478158L ^ life3_3)));
    if (!((life5_10 != 0))) {
        break forest_join_133;
    }
    switch ((life7_9 - life6_5)) {
default:
{
        break forest_join_34;
    }
case 7:
{
        break forest_join_47;
    }
case 6:
{
        break forest_join_62;
    }
case 5:
{
        break forest_join_73;
    }
case 4:
{
        break forest_join_84;
    }
case 3:
{
        break forest_join_95;
    }
case 2:
{
        break forest_join_106;
    }
case 1:
{
        break forest_join_121;
    }
}
    }
    (p1)[(life6_5 + __invokedynamic237_4(10797, (7090071326391437292L ^ life3_3)))] = ((byte) (life8_27 & 1));
    }
    (p1)[(life6_5 + __invokedynamic237_5(14165, (3075668147369089665L ^ life3_3)))] = ((byte) ((life8_27 >> 1) & 1));
    }
    (p1)[(life6_5 + 5)] = ((byte) ((life8_27 >> 2) & 1));
    }
    (p1)[(life6_5 + 4)] = ((byte) ((life8_27 >> 3) & 1));
    }
    (p1)[(life6_5 + 3)] = ((byte) ((life8_27 >> 4) & 1));
    }
    (p1)[(life6_5 + 2)] = ((byte) ((life8_27 >> 5) & 1));
    }
    (p1)[(life6_5 + 1)] = ((byte) ((life8_27 >> __invokedynamic237_6(14165, (3075668147369089665L ^ life3_3))) & 1));
    }
    (p1)[life6_5] = ((byte) (life8_27 >> __invokedynamic237_7(10797, (7090071326391437292L ^ life3_3))));
    life6_5 += 8;
    }
    if (!((life5_10 == 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    return;
}
public static void h237_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call3023700_0(p0);
}
public static void h237_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call3023701_0(p0);
}
private static native long __fieldRead237_0() throws Throwable;
private static native boolean __call237_1() throws Throwable;
private static native int __integerCategory237_2(boolean value) throws Throwable;
private static native int __invokedynamic237_3(int a0, long a1) throws Throwable;
private static native int __invokedynamic237_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic237_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic237_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic237_7(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call3023700_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call3023701_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_5ceceeba269d8f86c1e8(com.moon.nL a0) throws E;
private static final class __SourceHandler_5ceceeba269d8f86c1e8 {

public static boolean f533(com.moon.nL receiver) throws Throwable {
    int forwardValue533_29_0;
    int forwardValue533_31_0;
    int spill533_0;
    int spill533_1;
    int spill533_2;
    long life1_3;
    int life3_5;
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    life1_3 = (__fieldRead533_0() ^ 66564521379811L);
    life3_5 = __integerCategory533_2(__call533_1());
    spill533_0 = __fieldRead533_3(receiver);
    if (!((life3_5 != 0))) {
        forwardValue533_29_0 = spill533_0;
        break forward_join_29;
    }
    if (!((spill533_0 != __invokedynamic533_4(5257, (3239451056952034878L ^ life1_3))))) {
        break forward_join_28;
    }
    spill533_1 = __fieldRead533_5(receiver);
    if (!((life3_5 != 0))) {
        forwardValue533_29_0 = spill533_1;
        break forward_join_29;
    }
    if (!((spill533_1 != 2))) {
        break forward_join_28;
    }
    spill533_2 = __fieldRead533_6(receiver);
    if (!((life3_5 != 0))) {
        forwardValue533_29_0 = spill533_2;
        break forward_join_29;
    }
    if (!((spill533_2 == 3))) {
        break forward_join_30;
    }
    }
    forwardValue533_29_0 = 1;
    }
    forwardValue533_31_0 = forwardValue533_29_0;
    break forward_join_31;
    }
    forwardValue533_31_0 = 0;
    }
    return __integerCategory533_7(forwardValue533_31_0);
}
public static void h533_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053300_0(p0);
}
public static void h533_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053301_0(p0);
}
public static void h533_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053302_0(p0);
}
public static void h533_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053303_0(p0);
}
public static void h533_4(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053304_0(p0);
}
public static void h533_5(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053305_0(p0);
}
private static native long __fieldRead533_0() throws Throwable;
private static native boolean __call533_1() throws Throwable;
private static native int __integerCategory533_2(boolean value) throws Throwable;
private static native int __fieldRead533_3(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic533_4(int a0, long a1) throws Throwable;
private static native int __fieldRead533_5(com.moon.nL a0) throws Throwable;
private static native int __fieldRead533_6(com.moon.nL a0) throws Throwable;
private static native boolean __integerCategory533_7(int value) throws Throwable;
private static native java.lang.Exception __call1053300_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053301_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053302_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053303_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053304_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053305_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7a6837484f2ce754aff4(com.moon.nL a0) throws E;
private static final class __SourceHandler_7a6837484f2ce754aff4 {

public static void f534(com.moon.nL receiver) throws Throwable {
    int forwardValue534_31_0;
    int spill534_0;
    long life1_3;
    int life3_5;
    int life4_40;
    int life5_45;
    forward_join_60: {
    forward_join_51: {
    forward_join_31: {
    forward_join_20: {
    life1_3 = (__fieldRead534_0() ^ 3590700661874L);
    life3_5 = __integerCategory534_2(__call534_1());
    spill534_0 = __fieldRead534_3(receiver);
    if (!((life3_5 == 0))) {
        forwardValue534_31_0 = spill534_0;
        break forward_join_31;
    }
    if (!((spill534_0 > 0))) {
        break forward_join_20;
    }
    __call534_5(receiver, ((long) (__fieldRead534_4(receiver) + 4)));
    if (!((life3_5 != 0))) {
        break forward_join_51;
    }
    }
    __call534_7(receiver, __fieldRead534_6(receiver), 0, 4);
    forwardValue534_31_0 = __call534_9(receiver, __fieldRead534_8(receiver), 0);
    }
    life4_40 = forwardValue534_31_0;
    life5_45 = ((int) __call534_11(__fieldRead534_10(receiver)));
    if (!((life3_5 == 0))) {
        break forward_join_60;
    }
    if (!((life5_45 != life4_40))) {
        break forward_join_51;
    }
    throw new java.io.IOException(__invokedynamic534_12(17793, (4062992127378970200L ^ life1_3)));
    }
    __fieldWrite534_13(receiver, 0);
    __fieldWrite534_14(receiver, 0);
    __fieldWrite534_15(receiver, 0);
    }
    return;
}
public static void h534_0(java.io.IOException p0) throws Throwable {
    throw __call1053400_0(p0);
}
public static void h534_1(java.io.IOException p0) throws Throwable {
    throw __call1053401_0(p0);
}
public static void h534_2(java.io.IOException p0) throws Throwable {
    throw __call1053402_0(p0);
}
public static void h534_3(java.io.IOException p0) throws Throwable {
    throw __call1053403_0(p0);
}
public static void h534_4(java.io.IOException p0) throws Throwable {
    throw __call1053404_0(p0);
}
private static native long __fieldRead534_0() throws Throwable;
private static native boolean __call534_1() throws Throwable;
private static native int __integerCategory534_2(boolean value) throws Throwable;
private static native int __fieldRead534_3(com.moon.nL a0) throws Throwable;
private static native int __fieldRead534_4(com.moon.nL a0) throws Throwable;
private static native void __call534_5(com.moon.nL a0, long a1) throws Throwable;
private static native byte[] __fieldRead534_6(com.moon.nL a0) throws Throwable;
private static native void __call534_7(com.moon.nL a0, byte[] a1, int a2, int a3) throws Throwable;
private static native byte[] __fieldRead534_8(com.moon.nL a0) throws Throwable;
private static native int __call534_9(com.moon.nL a0, byte[] a1, int a2) throws Throwable;
private static native java.util.zip.CRC32 __fieldRead534_10(com.moon.nL a0) throws Throwable;
private static native long __call534_11(java.util.zip.CRC32 a0) throws Throwable;
private static native java.lang.String __invokedynamic534_12(int a0, long a1) throws Throwable;
private static native void __fieldWrite534_13(com.moon.nL a0, int a1) throws Throwable;
private static native void __fieldWrite534_14(com.moon.nL a0, int a1) throws Throwable;
private static native void __fieldWrite534_15(com.moon.nL a0, int a1) throws Throwable;
private static native java.lang.Exception __call1053400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1053401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1053402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1053403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1053404_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c6dca3efdb4289b54159(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws E;
private static final class __SourceHandler_c6dca3efdb4289b54159 {

public static void f535(com.moon.nL receiver, java.nio.ByteBuffer p0, byte[] p1) throws Throwable {
    byte[] lexicalValue535_13_0;
    int lexicalValue535_68_0;
    int lexicalValue535_68_1;
    int lexicalValue535_70_0;
    byte[] spill535_0;
    int spill535_1;
    int spill535_2;
    int spill535_3;
    long life3_3;
    int life5_5;
    int life6_21;
    int life7_26;
    int life8_31;
    int life9_33;
    int life10_36;
    int life11_43;
    int life12_49;
    int life13_55;
    int life14_57;
    int life6_111;
    int life7_114;
    lexical_join_117: {
    lexical_join_86: {
    lexical_join_84: {
    lexical_join_13: {
    life3_3 = (__fieldRead535_0() ^ 39477493107068L);
    life5_5 = __integerCategory535_2(__call535_1());
    spill535_0 = __fieldRead535_3(receiver);
    if (!((life5_5 != 0))) {
        lexicalValue535_13_0 = spill535_0;
        break lexical_join_13;
    }
    if (!((spill535_0 != null))) {
        break lexical_join_86;
    }
    lexicalValue535_13_0 = __fieldRead535_4(receiver);
    }
    life6_21 = (lexicalValue535_13_0)[1];
    life7_26 = (__fieldRead535_5(receiver))[3];
    life8_31 = (__fieldRead535_6(receiver))[5];
    life9_33 = 1;
    life10_36 = (p1).length;
    lexical_cycle_31: while (true) {
    lexical_join_82: {
    lexical_join_71: {
    lexical_join_70: {
    lexical_join_68: {
    if (!((life9_33 < life10_36))) {
        break lexical_join_84;
    }
    life11_43 = (p1)[life9_33];
    life12_49 = (p1)[(life9_33 + 1)];
    life13_55 = (p1)[(life9_33 + 2)];
    life14_57 = -1;
    if (!((life5_5 != 0))) {
        break lexical_join_117;
    }
    if (!((life5_5 != 0))) {
        break lexical_join_82;
    }
    if (!((life11_43 == life6_21))) {
        break lexical_join_71;
    }
    spill535_1 = life12_49;
    spill535_2 = life7_26;
    if (!((life5_5 != 0))) {
        lexicalValue535_68_0 = spill535_1;
        lexicalValue535_68_1 = spill535_2;
        break lexical_join_68;
    }
    if (!((spill535_1 == spill535_2))) {
        break lexical_join_71;
    }
    spill535_3 = life13_55;
    if (!((life5_5 != 0))) {
        lexicalValue535_70_0 = spill535_3;
        break lexical_join_70;
    }
    lexicalValue535_68_0 = spill535_3;
    lexicalValue535_68_1 = life8_31;
    }
    if (!((lexicalValue535_68_0 == lexicalValue535_68_1))) {
        break lexical_join_71;
    }
    lexicalValue535_70_0 = 0;
    }
    life14_57 = lexicalValue535_70_0;
    }
    __call535_10(__call535_9(__call535_8(__call535_7(p0, life13_55), life12_49), life11_43), life14_57);
    life9_33 += 3;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_31; }
    break lexical_cycle_31;
    }
    }
    if (!((life5_5 == 0))) {
        break lexical_join_117;
    }
    }
    life6_111 = 1;
    life7_114 = (p1).length;
    lexical_cycle_91: while (true) {
    if (!((life6_111 < life7_114))) {
        break lexical_join_117;
    }
    __call535_14(__call535_13(__call535_12(__call535_11(p0, (p1)[(life6_111 + 2)]), (p1)[(life6_111 + 1)]), (p1)[life6_111]), -1);
    life6_111 += 3;
    if (!((life5_5 == 0))) { continue lexical_cycle_91; }
    break lexical_cycle_91;
    }
    }
    return;
}
public static void h535_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053500_0(p0);
}
public static void h535_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053501_0(p0);
}
public static void h535_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053502_0(p0);
}
public static void h535_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053503_0(p0);
}
public static void h535_4(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053504_0(p0);
}
public static void h535_5(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053505_0(p0);
}
public static void h535_6(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053506_0(p0);
}
public static void h535_7(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053507_0(p0);
}
private static native long __fieldRead535_0() throws Throwable;
private static native boolean __call535_1() throws Throwable;
private static native int __integerCategory535_2(boolean value) throws Throwable;
private static native byte[] __fieldRead535_3(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead535_4(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead535_5(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead535_6(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call535_7(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call535_8(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call535_9(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call535_10(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call535_11(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call535_12(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call535_13(java.nio.ByteBuffer a0, byte a1) throws Throwable;
private static native java.nio.ByteBuffer __call535_14(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1053500_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053501_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053502_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053503_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053504_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053505_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053506_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1053507_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_da8388c67ccf9e8a6014(com.moon.nL a0, byte[] a1, byte[] a2) throws E;
private static final class __SourceHandler_da8388c67ccf9e8a6014 {

public static void f147(com.moon.nL receiver, byte[] p0, byte[] p1) throws Throwable {
    long life3_3;
    int life5_5;
    forest_join_49: {
    forest_join_35: {
    forest_join_29: {
    forest_join_23: {
    forest_join_17: {
    forest_join_12: {
    forest_join_10: {
    life3_3 = (__fieldRead147_0() ^ 132407302714139L);
    life5_5 = __integerCategory147_2(__call147_1());
    switch (__integerCategory147_3((p0)[0])) {
case 0:
{
        break forest_join_10;
    }
case 1:
{
        break forest_join_12;
    }
case 2:
{
        break forest_join_17;
    }
case 3:
{
        break forest_join_23;
    }
case 4:
{
        break forest_join_29;
    }
default:
{
        break forest_join_35;
    }
}
    }
    if (!((life5_5 == 0))) {
        break forest_join_49;
    }
    }
    __call147_4(receiver, p0);
    if (!((life5_5 == 0))) {
        break forest_join_49;
    }
    }
    __call147_5(receiver, p0, p1);
    if (!((life5_5 == 0))) {
        break forest_join_49;
    }
    }
    __call147_6(receiver, p0, p1);
    if (!((life5_5 == 0))) {
        break forest_join_49;
    }
    }
    __call147_7(receiver, p0, p1);
    if (!((life5_5 == 0))) {
        break forest_join_49;
    }
    }
    java.lang.Object __inlineStack147_9Token;
    throw new java.io.IOException(__invokedynamic147_10(__inlineStack147_9Output0((__inlineStack147_9Token = __inlineStack147_9Pack((p0)[0], __invokedynamic147_8(3704, (4723766866638934720L ^ life3_3))))), __inlineStack147_9Output1(__inlineStack147_9Token)));
    }
    return;
}
public static void h147_0(java.io.IOException p0) throws Throwable {
    throw __call3014700_0(p0);
}
public static void h147_1(java.io.IOException p0) throws Throwable {
    throw __call3014701_0(p0);
}
public static void h147_2(java.io.IOException p0) throws Throwable {
    throw __call3014702_0(p0);
}
public static void h147_3(java.io.IOException p0) throws Throwable {
    throw __call3014703_0(p0);
}
public static void h147_4(java.io.IOException p0) throws Throwable {
    throw __call3014704_0(p0);
}
public static void h147_5(java.io.IOException p0) throws Throwable {
    throw __call3014705_0(p0);
}
private static native long __fieldRead147_0() throws Throwable;
private static native boolean __call147_1() throws Throwable;
private static native int __integerCategory147_2(boolean value) throws Throwable;
private static native int __integerCategory147_3(byte value) throws Throwable;
private static native void __call147_4(com.moon.nL a0, byte[] a1) throws Throwable;
private static native void __call147_5(com.moon.nL a0, byte[] a1, byte[] a2) throws Throwable;
private static native void __call147_6(com.moon.nL a0, byte[] a1, byte[] a2) throws Throwable;
private static native void __call147_7(com.moon.nL a0, byte[] a1, byte[] a2) throws Throwable;
private static native java.lang.String __invokedynamic147_8(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack147_9Pack(byte a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack147_9Output0(java.lang.Object token) throws Throwable;
private static native byte __inlineStack147_9Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic147_10(java.lang.String a0, byte a1) throws Throwable;
private static native java.lang.Exception __call3014700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3014705_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7b630701d18fbbdc8ec2(com.moon.nL a0, byte[] a1, byte[] a2) throws E;
private static final class __SourceHandler_7b630701d18fbbdc8ec2 {

public static void f48(com.moon.nL receiver, byte[] p0, byte[] p1) throws Throwable {
    byte[] lexicalValue48_39_0;
    boolean spill48_0;
    byte[] spill48_1;
    long life3_3;
    int life6_7;
    int life7_9;
    int life5_10;
    int life8_43;
    lexical_join_78: {
    lexical_join_39: {
    lexical_join_38: {
    life3_3 = (__fieldRead48_0() ^ 58041285761960L);
    spill48_0 = __call48_1();
    life6_7 = __fieldRead48_2(receiver);
    life7_9 = 1;
    life5_10 = __integerCategory48_3(spill48_0);
    lexical_cycle_11: while (true) {
    if (!((life7_9 <= life6_7))) {
        break lexical_join_38;
    }
    spill48_1 = p0;
    if (!((life5_10 != 0))) {
        lexicalValue48_39_0 = spill48_1;
        break lexical_join_39;
    }
    byte[] __stackOp48_4_0 = spill48_1;
    int __stackOp48_4_1 = life7_9;
    (__stackOp48_4_0)[__stackOp48_4_1] = ((byte) ((__stackOp48_4_0)[__stackOp48_4_1] + ((byte) (((p1)[life7_9] & __invokedynamic48_5(1797, (8376216422990694898L ^ life3_3))) >>> 1))));
    life7_9 += 1;
    if (!((life5_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue48_39_0 = p0;
    }
    life8_43 = (lexicalValue48_39_0).length;
    lexical_cycle_41: while (true) {
    if (!((life7_9 < life8_43))) {
        break lexical_join_78;
    }
    byte[] __stackOp48_6_0 = p0;
    int __stackOp48_6_1 = life7_9;
    (__stackOp48_6_0)[__stackOp48_6_1] = ((byte) ((__stackOp48_6_0)[__stackOp48_6_1] + ((byte) ((((p1)[life7_9] & __invokedynamic48_7(1797, (8376216422990694898L ^ life3_3))) + ((p0)[(life7_9 - life6_7)] & __invokedynamic48_8(1797, (8376216422990694898L ^ life3_3)))) >>> 1))));
    life7_9 += 1;
    if (!((life5_10 == 0))) { continue lexical_cycle_41; }
    break lexical_cycle_41;
    }
    }
    return;
}
public static void h48_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004800_0(p0);
}
private static native long __fieldRead48_0() throws Throwable;
private static native boolean __call48_1() throws Throwable;
private static native int __fieldRead48_2(com.moon.nL a0) throws Throwable;
private static native int __integerCategory48_3(boolean value) throws Throwable;
private static native int __invokedynamic48_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic48_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic48_8(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1004800_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b8ddf9aa8d6957c79980(com.moon.nL a0, byte[] a1, byte[] a2) throws E;
private static final class __SourceHandler_b8ddf9aa8d6957c79980 {

public static void f49(com.moon.nL receiver, byte[] p0, byte[] p1) throws Throwable {
    byte[] lexicalValue49_30_0;
    int lexicalValue49_89_0;
    int lexicalValue49_100_0;
    int lexicalValue49_109_0;
    int lexicalValue49_126_0;
    int lexicalValue49_126_1;
    int lexicalValue49_128_0;
    boolean spill49_0;
    byte[] spill49_1;
    int spill49_2;
    int spill49_3;
    int spill49_4;
    int spill49_5;
    int spill49_6;
    int spill49_7;
    int spill49_8;
    long life3_3;
    int life6_7;
    int life5_8;
    int life7_10;
    int life8_34;
    int life9_49;
    int life10_59;
    int life11_71;
    int life12_77;
    int life13_81;
    int life14_95;
    int life15_109;
    lexical_join_141: {
    lexical_join_30: {
    lexical_join_29: {
    life3_3 = (__fieldRead49_0() ^ 83130528102526L);
    spill49_0 = __call49_1();
    life6_7 = __fieldRead49_2(receiver);
    life5_8 = __integerCategory49_3(spill49_0);
    life7_10 = 1;
    lexical_cycle_11: while (true) {
    if (!((life7_10 <= life6_7))) {
        break lexical_join_29;
    }
    spill49_1 = p0;
    if (!((life5_8 != 0))) {
        lexicalValue49_30_0 = spill49_1;
        break lexical_join_30;
    }
    byte[] __stackOp49_4_0 = spill49_1;
    int __stackOp49_4_1 = life7_10;
    (__stackOp49_4_0)[__stackOp49_4_1] = ((byte) ((__stackOp49_4_0)[__stackOp49_4_1] + (p1)[life7_10]));
    life7_10 += 1;
    if (!((life5_8 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue49_30_0 = p0;
    }
    life8_34 = (lexicalValue49_30_0).length;
    lexical_cycle_32: while (true) {
    lexical_join_129: {
    lexical_join_128: {
    lexical_join_126: {
    lexical_join_122: {
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_100: {
    lexical_join_97: {
    lexical_join_89: {
    lexical_join_86: {
    if (!((life7_10 < life8_34))) {
        break lexical_join_141;
    }
    life9_49 = ((p0)[(life7_10 - life6_7)] & __invokedynamic49_5(1797, (8376188602665134628L ^ life3_3)));
    life10_59 = ((p1)[life7_10] & __invokedynamic49_6(1797, (8376188602665134628L ^ life3_3)));
    life11_71 = ((p1)[(life7_10 - life6_7)] & __invokedynamic49_7(1797, (8376188602665134628L ^ life3_3)));
    life12_77 = ((life9_49 + life10_59) - life11_71);
    life13_81 = (life12_77 - life9_49);
    spill49_2 = life13_81;
    if (!((life5_8 != 0))) {
        lexicalValue49_89_0 = spill49_2;
        break lexical_join_89;
    }
    if (!((spill49_2 < 0))) {
        break lexical_join_86;
    }
    life13_81 = (-life13_81);
    }
    lexicalValue49_89_0 = (life12_77 - life10_59);
    }
    life14_95 = lexicalValue49_89_0;
    spill49_3 = life14_95;
    if (!((life5_8 != 0))) {
        lexicalValue49_100_0 = spill49_3;
        break lexical_join_100;
    }
    if (!((spill49_3 < 0))) {
        break lexical_join_97;
    }
    life14_95 = (-life14_95);
    }
    lexicalValue49_100_0 = (life12_77 - life11_71);
    }
    life15_109 = lexicalValue49_100_0;
    spill49_4 = life15_109;
    if (!((life5_8 != 0))) {
        lexicalValue49_109_0 = spill49_4;
        break lexical_join_109;
    }
    if (!((spill49_4 < 0))) {
        break lexical_join_108;
    }
    life15_109 = (-life15_109);
    }
    lexicalValue49_109_0 = life13_81;
    }
    spill49_5 = life14_95;
    if (!((life5_8 != 0))) {
        lexicalValue49_126_0 = lexicalValue49_109_0;
        lexicalValue49_126_1 = spill49_5;
        break lexical_join_126;
    }
    if (!((lexicalValue49_109_0 <= spill49_5))) {
        break lexical_join_122;
    }
    spill49_6 = life13_81;
    spill49_7 = life15_109;
    if (!((life5_8 != 0))) {
        lexicalValue49_126_0 = spill49_6;
        lexicalValue49_126_1 = spill49_7;
        break lexical_join_126;
    }
    if (!((spill49_6 <= spill49_7))) {
        break lexical_join_122;
    }
    life11_71 = life9_49;
    if (!((life5_8 == 0))) {
        break lexical_join_129;
    }
    }
    spill49_8 = life14_95;
    if (!((life5_8 != 0))) {
        lexicalValue49_128_0 = spill49_8;
        break lexical_join_128;
    }
    lexicalValue49_126_0 = spill49_8;
    lexicalValue49_126_1 = life15_109;
    }
    if (!((lexicalValue49_126_0 <= lexicalValue49_126_1))) {
        break lexical_join_129;
    }
    lexicalValue49_128_0 = life10_59;
    }
    life11_71 = lexicalValue49_128_0;
    }
    byte[] __stackOp49_8_0 = p0;
    int __stackOp49_8_1 = life7_10;
    (__stackOp49_8_0)[__stackOp49_8_1] = ((byte) ((__stackOp49_8_0)[__stackOp49_8_1] + ((byte) life11_71)));
    life7_10 += 1;
    if (!((life5_8 == 0))) { continue lexical_cycle_32; }
    break lexical_cycle_32;
    }
    }
    return;
}
public static void h49_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004900_0(p0);
}
public static void h49_1(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004901_0(p0);
}
public static void h49_2(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004902_0(p0);
}
public static void h49_3(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004903_0(p0);
}
public static void h49_4(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004904_0(p0);
}
public static void h49_5(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004905_0(p0);
}
public static void h49_6(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004906_0(p0);
}
public static void h49_7(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004907_0(p0);
}
public static void h49_8(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1004908_0(p0);
}
private static native long __fieldRead49_0() throws Throwable;
private static native boolean __call49_1() throws Throwable;
private static native int __fieldRead49_2(com.moon.nL a0) throws Throwable;
private static native int __integerCategory49_3(boolean value) throws Throwable;
private static native int __invokedynamic49_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic49_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic49_7(int a0, long a1) throws Throwable;
private static native java.lang.Exception __call1004900_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004901_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004902_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004903_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004904_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004905_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004906_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004907_0(java.lang.UnsupportedOperationException a0) throws Throwable;
private static native java.lang.Exception __call1004908_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_35d0a905e742a8d57d4e(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws E;
private static final class __SourceHandler_35d0a905e742a8d57d4e {

public static void f538(com.moon.nL receiver, java.nio.ByteBuffer p0, byte[] p1) throws Throwable {
    long life3_3;
    int life5_5;
    int life6_10;
    int life7_13;
    int life8_26;
    int life9_35;
    int life10_44;
    int life11_53;
    int life12_58;
    int life6_80;
    int life7_83;
    int life8_96;
    int life9_105;
    int life10_114;
    int life11_123;
    int life12_125;
    lexical_join_136: {
    lexical_join_76: {
    lexical_join_74: {
    life3_3 = (__fieldRead538_0() ^ 102001727026914L);
    life5_5 = __integerCategory538_2(__call538_1());
    if (!((__fieldRead538_3(receiver) != null))) {
        break lexical_join_76;
    }
    life6_10 = 1;
    life7_13 = (p1).length;
    lexical_cycle_14: while (true) {
    if (!((life6_10 < life7_13))) {
        break lexical_join_74;
    }
    life8_26 = ((p1)[life6_10] & __invokedynamic538_4(1797, (8376172462499144888L ^ life3_3)));
    life9_35 = (__fieldRead538_5(receiver))[((life8_26 * 3) + 0)];
    life10_44 = (__fieldRead538_6(receiver))[((life8_26 * 3) + 1)];
    life11_53 = (__fieldRead538_7(receiver))[((life8_26 * 3) + 2)];
    life12_58 = (__fieldRead538_8(receiver))[life8_26];
    __call538_12(__call538_11(__call538_10(__call538_9(p0, life12_58), life11_53), life10_44), life9_35);
    life6_10 += 1;
    if (!((life5_5 != 0))) {
        break lexical_join_136;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    if (!((life5_5 == 0))) {
        break lexical_join_136;
    }
    }
    life6_80 = 1;
    life7_83 = (p1).length;
    lexical_cycle_81: while (true) {
    if (!((life6_80 < life7_83))) {
        break lexical_join_136;
    }
    life8_96 = ((p1)[life6_80] & __invokedynamic538_13(1797, (8376172462499144888L ^ life3_3)));
    life9_105 = (__fieldRead538_14(receiver))[((life8_96 * 3) + 0)];
    life10_114 = (__fieldRead538_15(receiver))[((life8_96 * 3) + 1)];
    life11_123 = (__fieldRead538_16(receiver))[((life8_96 * 3) + 2)];
    life12_125 = -1;
    __call538_20(__call538_19(__call538_18(__call538_17(p0, life12_125), life11_123), life10_114), life9_105);
    life6_80 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_81; }
    break lexical_cycle_81;
    }
    }
    return;
}
public static void h538_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053800_0(p0);
}
private static native long __fieldRead538_0() throws Throwable;
private static native boolean __call538_1() throws Throwable;
private static native int __integerCategory538_2(boolean value) throws Throwable;
private static native byte[] __fieldRead538_3(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic538_4(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead538_5(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead538_6(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead538_7(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead538_8(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call538_9(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call538_10(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call538_11(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call538_12(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native int __invokedynamic538_13(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead538_14(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead538_15(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead538_16(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call538_17(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call538_18(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call538_19(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call538_20(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1053800_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6fd2835f9791f916906e(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws E;
private static final class __SourceHandler_6fd2835f9791f916906e {

public static void f539(com.moon.nL receiver, java.nio.ByteBuffer p0, byte[] p1) throws Throwable {
    long life3_3;
    int life5_5;
    int life6_10;
    int life7_13;
    int life8_26;
    int life9_35;
    int life10_44;
    int life11_53;
    int life12_58;
    int life6_80;
    int life7_83;
    int life8_96;
    int life9_105;
    int life10_114;
    int life11_123;
    int life12_125;
    lexical_join_136: {
    lexical_join_76: {
    lexical_join_74: {
    life3_3 = (__fieldRead539_0() ^ 124709830654309L);
    life5_5 = __integerCategory539_2(__call539_1());
    if (!((__fieldRead539_3(receiver) != null))) {
        break lexical_join_76;
    }
    life6_10 = 1;
    life7_13 = (p1).length;
    lexical_cycle_14: while (true) {
    if (!((life6_10 < life7_13))) {
        break lexical_join_74;
    }
    life8_26 = ((p1)[life6_10] & __invokedynamic539_4(1797, (8376143148752628543L ^ life3_3)));
    life9_35 = (__fieldRead539_5(receiver))[((life8_26 * 3) + 0)];
    life10_44 = (__fieldRead539_6(receiver))[((life8_26 * 3) + 1)];
    life11_53 = (__fieldRead539_7(receiver))[((life8_26 * 3) + 2)];
    life12_58 = (__fieldRead539_8(receiver))[life8_26];
    __call539_12(__call539_11(__call539_10(__call539_9(p0, life9_35), life10_44), life11_53), life12_58);
    life6_10 += 1;
    if (!((life5_5 != 0))) {
        break lexical_join_136;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    if (!((life5_5 == 0))) {
        break lexical_join_136;
    }
    }
    life6_80 = 1;
    life7_83 = (p1).length;
    lexical_cycle_81: while (true) {
    if (!((life6_80 < life7_83))) {
        break lexical_join_136;
    }
    life8_96 = ((p1)[life6_80] & __invokedynamic539_13(1797, (8376143148752628543L ^ life3_3)));
    life9_105 = (__fieldRead539_14(receiver))[((life8_96 * 3) + 0)];
    life10_114 = (__fieldRead539_15(receiver))[((life8_96 * 3) + 1)];
    life11_123 = (__fieldRead539_16(receiver))[((life8_96 * 3) + 2)];
    life12_125 = -1;
    __call539_20(__call539_19(__call539_18(__call539_17(p0, life9_105), life10_114), life11_123), life12_125);
    life6_80 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_81; }
    break lexical_cycle_81;
    }
    }
    return;
}
public static void h539_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1053900_0(p0);
}
private static native long __fieldRead539_0() throws Throwable;
private static native boolean __call539_1() throws Throwable;
private static native int __integerCategory539_2(boolean value) throws Throwable;
private static native byte[] __fieldRead539_3(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic539_4(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead539_5(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead539_6(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead539_7(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead539_8(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call539_9(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call539_10(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call539_11(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call539_12(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native int __invokedynamic539_13(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead539_14(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead539_15(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead539_16(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call539_17(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call539_18(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call539_19(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call539_20(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1053900_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_783d247b9c548ec3fe7b(com.moon.nL a0, java.nio.ByteBuffer a1, byte[] a2) throws E;
private static final class __SourceHandler_783d247b9c548ec3fe7b {

public static void f540(com.moon.nL receiver, java.nio.ByteBuffer p0, byte[] p1) throws Throwable {
    long life3_3;
    int life5_5;
    int life6_10;
    int life7_13;
    int life8_26;
    int life9_35;
    int life10_44;
    int life11_53;
    int life12_58;
    int life6_80;
    int life7_83;
    int life8_96;
    int life9_105;
    int life10_114;
    int life11_123;
    int life12_125;
    lexical_join_136: {
    lexical_join_76: {
    lexical_join_74: {
    life3_3 = (__fieldRead540_0() ^ 135958296191551L);
    life5_5 = __integerCategory540_2(__call540_1());
    if (!((__fieldRead540_3(receiver) != null))) {
        break lexical_join_76;
    }
    life6_10 = 1;
    life7_13 = (p1).length;
    lexical_cycle_14: while (true) {
    if (!((life6_10 < life7_13))) {
        break lexical_join_74;
    }
    life8_26 = ((p1)[life6_10] & __invokedynamic540_4(1797, (8376135774372753509L ^ life3_3)));
    life9_35 = (__fieldRead540_5(receiver))[((life8_26 * 3) + 0)];
    life10_44 = (__fieldRead540_6(receiver))[((life8_26 * 3) + 1)];
    life11_53 = (__fieldRead540_7(receiver))[((life8_26 * 3) + 2)];
    life12_58 = (__fieldRead540_8(receiver))[life8_26];
    __call540_12(__call540_11(__call540_10(__call540_9(p0, life11_53), life10_44), life9_35), life12_58);
    life6_10 += 1;
    if (!((life5_5 != 0))) {
        break lexical_join_136;
    }
    if (!((life5_5 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    if (!((life5_5 == 0))) {
        break lexical_join_136;
    }
    }
    life6_80 = 1;
    life7_83 = (p1).length;
    lexical_cycle_81: while (true) {
    if (!((life6_80 < life7_83))) {
        break lexical_join_136;
    }
    life8_96 = ((p1)[life6_80] & __invokedynamic540_13(1797, (8376135774372753509L ^ life3_3)));
    life9_105 = (__fieldRead540_14(receiver))[((life8_96 * 3) + 0)];
    life10_114 = (__fieldRead540_15(receiver))[((life8_96 * 3) + 1)];
    life11_123 = (__fieldRead540_16(receiver))[((life8_96 * 3) + 2)];
    life12_125 = -1;
    __call540_20(__call540_19(__call540_18(__call540_17(p0, life11_123), life10_114), life9_105), life12_125);
    life6_80 += 1;
    if (!((life5_5 == 0))) { continue lexical_cycle_81; }
    break lexical_cycle_81;
    }
    }
    return;
}
public static void h540_0(java.lang.UnsupportedOperationException p0) throws Throwable {
    throw __call1054000_0(p0);
}
private static native long __fieldRead540_0() throws Throwable;
private static native boolean __call540_1() throws Throwable;
private static native int __integerCategory540_2(boolean value) throws Throwable;
private static native byte[] __fieldRead540_3(com.moon.nL a0) throws Throwable;
private static native int __invokedynamic540_4(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead540_5(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead540_6(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead540_7(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead540_8(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call540_9(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call540_10(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call540_11(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call540_12(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native int __invokedynamic540_13(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead540_14(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead540_15(com.moon.nL a0) throws Throwable;
private static native byte[] __fieldRead540_16(com.moon.nL a0) throws Throwable;
private static native java.nio.ByteBuffer __call540_17(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call540_18(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call540_19(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.nio.ByteBuffer __call540_20(java.nio.ByteBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1054000_0(java.lang.UnsupportedOperationException a0) throws Throwable;

}


private void i(java.nio.ByteBuffer p0, byte[] p1) { __sourceHandlerCall_6fd2835f9791f916906e(this, p0, p1); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2895_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void b__Void() throws java.io.IOException { __sourceHandlerCall_e17b53c1e996ae998f29(this); }


private void b(byte[] p0, byte[] p1) { __sourceHandlerCall_eebf3cec1af7a9e34e29(this, p0, p1); }


private void b(java.nio.ByteBuffer p0, byte[] p1) { __sourceHandlerCall_b5f6968b780030b2d913(this, p0, p1); }


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nL.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x76F9;
        if (v[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = u[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])w.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    w.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("com/moon/nL", exception);
            }
            int n10 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            nL.v[n2] = n10;
        }
        return v[n2];
}


private static java.lang.String b(byte[] p0) {
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
        byte[] spill1357_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1357_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1357_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1357_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1357_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1357_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void b(int p0) throws java.io.IOException { __sourceHandlerCall_24d0a8366d74bba67677(this, p0); }


public boolean b__Boolean() { return __sourceHandlerCall_06a1e8f3bcbab63e326e(this); }


public int b() {
return this.h;
}


public void b(java.nio.ByteBuffer p0, int p1, com.moon.ci p2) throws java.io.IOException { __sourceHandlerCall_53f2f5a3f6cff1ac2d84(this, p0, p1, p2); }


private void e(byte[] p0, byte[] p1) {
boolean spill292_0;
    long life3_3;
    int life6_7;
    int life7_9;
    int life8_12;
    int life5_13;
    lexical_join_30: {
    life3_3 = (com.moon.nL.q ^ 24215023307755L);
    spill292_0 = com.moon.aO.c();
    life6_7 = this.l;
    life7_9 = 1;
    life8_12 = (p0).length;
    life5_13 = ((spill292_0) ? 1 : 0);
    lexical_cycle_14: while (true) {
    if (!((life7_9 < life8_12))) {
        break lexical_join_30;
    }
    byte[] __stackOp292_4_0 = p0;
    int __stackOp292_4_1 = life7_9;
    (__stackOp292_4_0)[__stackOp292_4_1] = ((byte) ((__stackOp292_4_0)[__stackOp292_4_1] + (p1)[life7_9]));
    life7_9 += 1;
    if (!((life5_13 == 0))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    return;
}


private void e() throws java.io.IOException {
long local1 = (com.moon.nL.q ^ 79966787749615L);
    ((com.moon.nL)(this)).a__Void(((byte[])(this.d)), ((int)(0)), ((int)(__sourceIntrinsic_85f1dd884e89_originalDynamicSite572_2(7265, (7734064319686627274L ^ local1)))));
    this.e = ((int)(((com.moon.nL)(this)).a(((byte[])(this.d)), ((int)(0)))));
    this.f = ((int)(((com.moon.nL)(this)).a(((byte[])(this.d)), ((int)(4)))));
    this.g = ((int)(this.e));
    ((java.util.zip.CRC32)(this.c)).reset();
    ((java.util.zip.CRC32)(this.c)).update(((byte[])(this.d)), ((int)(4)), ((int)(4)));
    return;
}


private void e(java.nio.ByteBuffer p0, byte[] p1) {
boolean spill291_0;
    long life3_3;
    int life6_6;
    int life7_9;
    int life5_10;
    lexical_join_41: {
    life3_3 = (com.moon.nL.q ^ 116494871236456L);
    spill291_0 = com.moon.aO.b__Boolean();
    life6_6 = 1;
    life7_9 = (p1).length;
    life5_10 = ((spill291_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    if (!((life6_6 < life7_9))) {
        break lexical_join_41;
    }
    ((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(p0)).put(((byte)((p1)[(life6_6 + 3)]))))).put(((byte)((p1)[(life6_6 + 2)]))))).put(((byte)((p1)[(life6_6 + 1)]))))).put(((byte)((p1)[life6_6])));
    life6_6 += 4;
    if (!((life5_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


public boolean c__Boolean() { return __sourceHandlerCall_5ceceeba269d8f86c1e8(this); }


private void c(byte[] p0, byte[] p1) { __sourceHandlerCall_89f282a6c7f4ba8f989f(this, p0, p1); }


private void c() throws java.io.IOException { __sourceHandlerCall_57f28e0809beaf94f91b(this); }


private void c(java.nio.ByteBuffer p0, byte[] p1) { __sourceHandlerCall_5c65ad86d1d2fcfaf8fc(this, p0, p1); }


private void h(java.nio.ByteBuffer p0, byte[] p1) { __sourceHandlerCall_35d0a905e742a8d57d4e(this, p0, p1); }


private void f(byte[] p0, byte[] p1) { __sourceHandlerCall_7b630701d18fbbdc8ec2(this, p0, p1); }


private void f(java.nio.ByteBuffer p0, byte[] p1) {
boolean spill293_0;
    long life3_3;
    int life6_6;
    int life7_9;
    int life5_10;
    lexical_join_41: {
    life3_3 = (com.moon.nL.q ^ 102453672998401L);
    spill293_0 = com.moon.aO.b__Boolean();
    life6_6 = 1;
    life7_9 = (p1).length;
    life5_10 = ((spill293_0) ? 1 : 0);
    lexical_cycle_11: while (true) {
    if (!((life6_6 < life7_9))) {
        break lexical_join_41;
    }
    ((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(p0)).put(((byte)((p1)[(life6_6 + 2)]))))).put(((byte)((p1)[(life6_6 + 1)]))))).put(((byte)((p1)[life6_6]))))).put(((byte)((p1)[(life6_6 + 3)])));
    life6_6 += 4;
    if (!((life5_10 != 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private void d() throws java.io.IOException { __sourceHandlerCall_7a6837484f2ce754aff4(this); }


private void d(java.nio.ByteBuffer p0, byte[] p1) { __sourceHandlerCall_c6dca3efdb4289b54159(this, p0, p1); }


private void d(byte[] p0, byte[] p1) throws java.io.IOException { __sourceHandlerCall_da8388c67ccf9e8a6014(this, p0, p1); }


private static boolean a__Boolean(byte[] p0) { return __sourceHandlerCall_608cfe885ab06c7eb06a(p0); }


public boolean a__Boolean() { return __sourceHandlerCall_5fe69f63681860a50299(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private void a(long p0) throws java.io.IOException { __sourceHandlerCall_4dcd909b027da036d1af(this, p0); }


private int a(byte[] p0, int p1) {
long local3 = (com.moon.nL.q ^ 96072185094161L);
    return (((((p0)[p1] << __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_1(27951, (4455114801743190141L ^ local3))) | (((p0)[(p1 + 1)] & __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_2(1797, (8376184980512453195L ^ local3))) << __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_3(15736, (5965591303424739384L ^ local3)))) | (((p0)[(p1 + 2)] & __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_4(1797, (8376184980512453195L ^ local3))) << __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_5(17883, (2803065018130395288L ^ local3)))) | ((p0)[(p1 + 3)] & __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_6(1797, (8376184980512453195L ^ local3))));
}


private void a__Void(byte[] p0, int p1, int p2) throws java.io.IOException {
long life4_3;
    int life6_10;
    life4_3 = (com.moon.nL.q ^ 97305930614895L);
    do {
        life6_10 = ((java.io.InputStream)(this.b)).read(((byte[])(p0)), ((int)(p1)), ((int)(p2)));
        if ((life6_10 < 0)) {
        throw new java.io.EOFException();
    }
        p1 = (p1 + life6_10);
        p2 = (p2 - life6_10);
    } while (!((p2 <= 0)));
    return;
}


private void a(java.nio.ByteBuffer p0, byte[] p1) {
((java.nio.ByteBuffer)(p0)).put(((byte[])(p1)), ((int)(1)), ((int)(((p1).length - 1))));
    return;
}


public int a() {
return this.i;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2919_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.nL.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3097);
    if (((com.moon.nL.s)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.nL.t)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.nL.t)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/nL", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.nL.r)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.nL.s)[life5_8] = com.moon.nL.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.nL.s)[life5_8];
}


private void a(byte[] p0, byte[] p1) { __sourceHandlerCall_47c2a85ee18d869e47ee(this, p0, p1); }


public void a(java.nio.ByteBuffer p0, int p1, com.moon.ci p2) throws java.io.IOException { __sourceHandlerCall_147e32f470e7a32bf9a0(this, p0, p1, p2); }


public void a(byte p0, byte p1, byte p2) { __sourceHandlerCall_9411c8cda3616f832e6d(this, p0, p1, p2); }


private void a__Void() throws java.io.IOException { __sourceHandlerCall_d09d1692d4586742ba8f(this); }


private void a(byte[] p0) {
boolean spill290_0;
    long life2_3;
    int life5_6;
    int life6_10;
    int life7_14;
    int life4_15;
    lexical_join_34: {
    life2_3 = (com.moon.nL.q ^ 28648476026361L);
    life5_6 = this.l;
    life6_10 = (life5_6 + 1);
    spill290_0 = com.moon.aO.b__Boolean();
    life7_14 = (p0).length;
    life4_15 = ((spill290_0) ? 1 : 0);
    lexical_cycle_16: while (true) {
    if (!((life6_10 < life7_14))) {
        break lexical_join_34;
    }
    byte[] __stackOp290_4_0 = p0;
    int __stackOp290_4_1 = life6_10;
    (__stackOp290_4_0)[__stackOp290_4_1] = ((byte) ((__stackOp290_4_0)[__stackOp290_4_1] + (p0)[(life6_10 - life5_6)]));
    life6_10 += 1;
    if (!((life4_15 != 0))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    return;
}


public com.moon.ci a(com.moon.ci p0) { return __sourceHandlerCall_8ab64e27e385c2bf37a9(this, p0); }


private void a(java.util.zip.Inflater p0, byte[] p1, int p2, int p3) throws java.io.IOException { __sourceHandlerCall_aee7e6aac86b26783702(this, p0, p1, p2, p3); }


private void a(java.util.zip.Inflater p0) throws java.io.IOException { __sourceHandlerCall_2f6faeecb46b7fc1f1fa(this, p0); }


private int a(byte[] p0, int p1, int p2) throws java.io.IOException { return __sourceHandlerCall_12eff7293716250ce031(this, p0, p1, p2); }


private void a(int p0) throws java.io.IOException { __sourceHandlerCall_24836d46802a52e254bc(this, p0); }


private void g(java.nio.ByteBuffer p0, byte[] p1) {
boolean spill294_0;
    long life3_3;
    int life6_6;
    int life5_7;
    int life7_10;
    lexical_join_35: {
    life3_3 = (com.moon.nL.q ^ 29534052211895L);
    spill294_0 = com.moon.aO.c();
    life6_6 = 1;
    life5_7 = ((spill294_0) ? 1 : 0);
    life7_10 = (p1).length;
    lexical_cycle_11: while (true) {
    if (!((life6_6 < life7_10))) {
        break lexical_join_35;
    }
    ((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(((java.nio.ByteBuffer)(p0)).put(((byte)((p1)[life6_6]))))).put(((byte)((p1)[(life6_6 + 1)]))))).put(((byte)((p1)[(life6_6 + 2)])));
    life6_6 += 4;
    if (!((life5_7 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private void g(byte[] p0, byte[] p1) { __sourceHandlerCall_b8ddf9aa8d6957c79980(this, p0, p1); }


private void j(java.nio.ByteBuffer p0, byte[] p1) { __sourceHandlerCall_783d247b9c548ec3fe7b(this, p0, p1); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2919_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e2512dd93dd9_originalDynamicSite573_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2895_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_85f1dd884e89_originalDynamicSite572_2(int a0, long a1) throws E;
}
