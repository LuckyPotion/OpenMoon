package moom;


public class JS {

private static moom.JR[] a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long f;

public JS() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(7370286657613676916L)), ((long)(-1195446283388749955L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(129030779762162L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (moom.JS.b ^ 128961747944415L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill601_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill601_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill601_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill601_14 = new byte[8];
    (__sourceSpill601_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill601_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation601_16 = __sourceSpill601_14;
    ((javax.crypto.Cipher)(__sourceSpill601_11)).init(((int)(__sourceSpill601_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill601_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation601_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local14_life19 = new java.lang.String[19];
    int local12_life20 = 0;
    java.lang.String local11_life21;
    int local13_life23 = ((java.lang.String)((local11_life21 = "Éç½\017L²\\uª7z§\0221µMbi\\\022Úó\fWØñ\031\034tÈ`æ\bÿBPÁ~*­úôXÜ\r\f©=na½\030g¸º;\016X¦Ïìç³£H\022>µ1¢Q:¹¹(¹I+\0321¨r5\005+\b¶¯>Ô\001o\002«hA~A»ÚQ®Ýê¶¿=Ì¡\"7(àçhûz\t2&*\177s\013dß\025vöHI@|\003y\035*¿1XÃ}=\034VPèØ\020ý¡Á³y\026@2óð\177l] i6\020ª\r\031\032/ðÅè\001\032­¢l\003!Ø\034ØDª©ÈÞ\033\032Ë@Êb²ïÅ{´yv=am/%ñ[%K!AL1£Ý[,à¼ÎýÞ\b·ò\f\t¤VÝ²)lX\\ëÜÒÜÞ\0250jðs¯@£1¼üµ\nøg'jLØ?1ºù5ø\000«\030ÐQ)3µ´íPÝI\rgÄ&¯xÃøÑüxù;Æ\"-\023{óòÅï92ãH\000)¨[g^Ë$mêò(7¥FÛkùc\b.a¾ô­rçºÜXÎÌK\031L;ïÞJ^\005\\,ê_øcnßG6pzÖíÂß\177uhâ,zzDL(\004(-L£>BÝ¥¤¥TQÑA«ÐBÚ|%è±ÃTe\005¾#XÀ{j( ÍÚe2Aq/ÚVûsWñfq/\016¤hh6Çl1\020Î%Ã¨~%xÛß\031&8\025\f@Ì\tÝ0«ídi\036\024-\020±aÜygÿ<\020QË¤qå-¾,ü!Ç\\ØÁbG\"ê%µ\036[l\rZ`§kâ¡:Ð8¢näd8ç4\005\001\027\177ï¡\021Å=\nç`l\rRýÆ\"ÇSÀ77Å Øã=\017Òí\027\\NZÆÁÊ¨ôÐ»\005ýÊ\1772Ý`\034\"ßP{\023PÖ{B\016\006g^ÚnJ/YZ¾RÁ&\001­\016\001nãÀ\t³\031åKué\001\035ñ\025²Â~\007\013é|³î×I5pùÈR]\táÙ!Mädvw=\036x|hÚ^úñ§n\005)È+póõü\\\002È& é¡\003\027l\024v»\b\030¯bÛ11er²i\024êáÁÍùC§\n¿Ô\013v§e\016#°¨5_\n£ÒßÅöS>{@a0á\004ÈateÝ\005ëù¼¹\026n\036Å©Ø\001?øá\ntv³jwp5Q8\023` yÍþ¦ÓrðØx]ß¶ÛÇ\b\006\035RrßvX·\016&Ü0ØÄ)ù"))).length();
    int local10_life24 = 56;
    int local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill601_28 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill601_29 = local7_life9;
        byte[] local15_life31 = ((javax.crypto.Cipher)(__sourceSpill601_29)).doFinal(((byte[])(__sourceSpill601_28)));
        java.lang.String __sourceSpill601_34 = ((java.lang.String)(moom.JS.a(((byte[])(local15_life31))))).intern();
        java.lang.String[] __sourceSpill601_35 = local14_life19;
        int __sourceSpill601_36 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill601_35)[__sourceSpill601_36] = __sourceSpill601_34;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    local13_life23 = ((java.lang.String)((local11_life21 = "+=­\177/\031á=\025ý¡2pµ8~\033\000ðUÏu\024ÙËq²¹Q»³ÝX·5÷¯öÊûe¹Ú\b\f®0Ë-ÿzyÙ)\\µéÕÇ¡^À\024"))).length();
    local10_life24 = 16;
    local9_life25 = -1;
    while (true) {
        local9_life25 += 1;
        byte[] __sourceSpill601_41 = ((java.lang.String)(((java.lang.String)(local11_life21)).substring(((int)(local9_life25)), ((int)((local9_life25 + local10_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill601_42 = local7_life9;
        byte[] local15_life44 = ((javax.crypto.Cipher)(__sourceSpill601_42)).doFinal(((byte[])(__sourceSpill601_41)));
        java.lang.String __sourceSpill601_47 = ((java.lang.String)(moom.JS.a(((byte[])(local15_life44))))).intern();
        java.lang.String[] __sourceSpill601_48 = local14_life19;
        int __sourceSpill601_49 = local12_life20;
        local12_life20 += 1;
        (__sourceSpill601_48)[__sourceSpill601_49] = __sourceSpill601_47;
        if (!(((local9_life25 = (local9_life25 + local10_life24)) < local13_life23))) { break; }
        local10_life24 = ((java.lang.String)(local11_life21)).charAt(((int)(local9_life25)));
    }
    c = ((java.lang.String[])(local14_life19));
    d = ((java.lang.String[])(new java.lang.String[19]));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill601_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill601_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill601_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill601_59 = new byte[8];
    (__sourceSpill601_59)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill601_59)[local1_life60] = ((byte) ((int) ((local5_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation601_61 = __sourceSpill601_59;
    ((javax.crypto.Cipher)(__sourceSpill601_56)).init(((int)(__sourceSpill601_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill601_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation601_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life64 = -4331536170626314628L;
    byte[] __sourceSpill601_65 = new byte[8];
    (__sourceSpill601_65)[0] = ((byte) ((int) (local2_life64 >>> 56)));
    (__sourceSpill601_65)[1] = ((byte) ((int) (local2_life64 >>> 48)));
    (__sourceSpill601_65)[2] = ((byte) ((int) (local2_life64 >>> 40)));
    (__sourceSpill601_65)[3] = ((byte) ((int) (local2_life64 >>> 32)));
    (__sourceSpill601_65)[4] = ((byte) ((int) (local2_life64 >>> 24)));
    (__sourceSpill601_65)[5] = ((byte) ((int) (local2_life64 >>> 16)));
    (__sourceSpill601_65)[6] = ((byte) ((int) (local2_life64 >>> 8)));
    (__sourceSpill601_65)[7] = ((byte) ((int) local2_life64));
    javax.crypto.Cipher __sourceSpill601_66 = local0_life54;
    byte[] local4_life68 = ((javax.crypto.Cipher)(__sourceSpill601_66)).doFinal(((byte[])(__sourceSpill601_65)));
    f = ((long)((((((((((((long) (local4_life68)[0]) & 255L) << 56) | ((((long) (local4_life68)[1]) & 255L) << 48)) | ((((long) (local4_life68)[2]) & 255L) << 40)) | ((((long) (local4_life68)[3]) & 255L) << 32)) | ((((long) (local4_life68)[4]) & 255L) << 24)) | ((((long) (local4_life68)[5]) & 255L) << 16)) | ((((long) (local4_life68)[6]) & 255L) << 8)) | (((long) (local4_life68)[7]) & 255L))));
    a = ((moom.JR[])(new moom.JR[0]));
}

private static native <E extends Throwable> void __sourceHandlerCall_a59ebc2d53eb87b42a84() throws E;
private static final class __SourceHandler_a59ebc2d53eb87b42a84 {

public static void f98() throws Throwable {
    int lexicalValue98_44_0;
    java.lang.String[] lexicalValue98_156_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite lexicalValue98_200_0;
    int lexicalValue98_226_0;
    int lexicalValue98_246_0;
    net.minecraft.entity.Entity[] spill98_0;
    boolean spill98_1;
    java.lang.String[] spill98_2;
    java.lang.String spill98_3;
    java.lang.String spill98_4;
    java.lang.String spill98_5;
    net.minecraft.client.renderer.texture.TextureMap spill98_6;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill98_7;
    java.lang.String spill98_8;
    java.lang.String spill98_9;
    java.lang.String spill98_10;
    int spill98_11;
    java.lang.String spill98_12;
    java.lang.String spill98_13;
    java.lang.String spill98_14;
    java.lang.String spill98_15;
    java.lang.String spill98_16;
    java.lang.String spill98_17;
    long life0_3;
    net.minecraft.entity.Entity[] life2_8;
    java.lang.String life3_16;
    moom.DD life4_21;
    int life5_47;
    java.io.InputStream life6_50;
    java.util.ArrayList life7_56;
    java.lang.String life8_59;
    java.lang.String[] life9_69;
    net.minecraft.client.renderer.texture.TextureMap life10_112;
    java.lang.String[] life11_114;
    int life12_117;
    int life13_119;
    java.lang.String life14_126;
    java.lang.String life15_129;
    java.lang.String[] life16_147;
    java.lang.String life17_186;
    java.lang.String life18_191;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life19_202;
    int life20_237;
    moom.JR life21_303;
    lexical_join_301: {
    lexical_join_295: {
    lexical_join_99: {
    lexical_join_89: {
    lexical_join_87: {
    lexical_join_44: {
    lexical_join_42: {
    life0_3 = (__fieldRead98_0() ^ 131421350698858L);
    spill98_0 = __call98_1();
    __fieldWrite98_2(new moom.JR[0]);
    life2_8 = spill98_0;
    if (!(__call98_3())) {
        break lexical_join_301;
    }
    life3_16 = __invokedynamic98_4(29655, (8654868102053407743L ^ life0_3));
    life4_21 = new moom.DD(life3_16);
    spill98_1 = __call98_5(life4_21);
    if (!((life2_8 != null))) {
        lexicalValue98_44_0 = __integerCategory98_6(spill98_1);
        break lexical_join_44;
    }
    if (!((!spill98_1))) {
        break lexical_join_42;
    }
    java.lang.String __stackOp98_8_0 = life3_16;
    java.lang.String __stackOp98_8_1 = __invokedynamic98_7(1720, (1538077676048866971L ^ life0_3));
    __call98_11(__invokedynamic98_10(__stackOp98_8_1, __stackOp98_8_0, __invokedynamic98_9(30160, (579036174087237093L ^ life0_3))));
    return;
    }
    lexicalValue98_44_0 = __integerCategory98_13(__call98_12(life4_21));
    }
    life5_47 = lexicalValue98_44_0;
    life6_50 = __call98_14(life4_21);
    life7_56 = new java.util.ArrayList(((int) __fieldRead98_15()));
    life8_59 = __call98_16(life6_50);
    __call98_17(life6_50);
    life9_69 = __call98_19(life8_59, __invokedynamic98_18(9205, (6104273822956944321L ^ life0_3)));
    if (!((life2_8 != null))) {
        break lexical_join_87;
    }
    if (!((life5_47 != 0))) {
        break lexical_join_89;
    }
    java.lang.String __stackOp98_21_0 = life3_16;
    java.lang.String __stackOp98_21_1 = __invokedynamic98_20(474, (985485865316768241L ^ life0_3));
    __call98_23(__invokedynamic98_22(__stackOp98_21_1, __stackOp98_21_0, "\""));
    __call98_25(__invokedynamic98_24(23471, (4520875293129835397L ^ life0_3)));
    }
    if (!((life2_8 == null))) {
        break lexical_join_99;
    }
    }
    java.lang.String __stackOp98_27_0 = life3_16;
    java.lang.String __stackOp98_27_1 = __invokedynamic98_26(6666, (7347525044668351015L ^ life0_3));
    __call98_29(__invokedynamic98_28(__stackOp98_27_1, __stackOp98_27_0, "\""));
    }
    life10_112 = __call98_30();
    life11_114 = life9_69;
    life12_117 = (life11_114).length;
    life13_119 = 0;
    lexical_cycle_108: while (true) {
    lexical_join_293: {
    lexical_join_292: {
    lexical_join_275: {
    lexical_join_270: {
    lexical_join_248: {
    lexical_join_246: {
    lexical_join_226: {
    lexical_join_225: {
    lexical_join_200: {
    lexical_join_199: {
    lexical_join_156: {
    lexical_join_155: {
    if (!((life13_119 < life12_117))) {
        break lexical_join_295;
    }
    life14_126 = (life11_114)[life13_119];
    life15_129 = __call98_31(life14_126);
    if (!((life2_8 != null))) {
        break lexical_join_301;
    }
    if (!((life2_8 != null))) {
        break lexical_join_293;
    }
    if (!((!__call98_32(life15_129, "#")))) {
        break lexical_join_292;
    }
    life16_147 = __call98_33(life15_129, "=");
    spill98_2 = life16_147;
    if (!((life2_8 != null))) {
        lexicalValue98_156_0 = spill98_2;
        break lexical_join_156;
    }
    if (!(((spill98_2).length != 2))) {
        break lexical_join_155;
    }
    java.lang.String __stackOp98_35_0 = life3_16;
    java.lang.String __stackOp98_35_1 = life15_129;
    java.lang.String __stackOp98_35_2 = __invokedynamic98_34(31503, (2765944457815139114L ^ life0_3));
    spill98_3 = __stackOp98_35_2;
    spill98_4 = __stackOp98_35_0;
    spill98_5 = __stackOp98_35_1;
    __discardScalar98_36(__stackOp98_35_2);
    java.lang.String __stackOp98_38_0 = spill98_5;
    java.lang.String __stackOp98_38_1 = __invokedynamic98_37(8176, (7877320793436571615L ^ life0_3));
    __call98_40(__invokedynamic98_39(spill98_3, spill98_4, __stackOp98_38_1, __stackOp98_38_0));
    if (!((life2_8 == null))) {
        break lexical_join_292;
    }
    }
    lexicalValue98_156_0 = life16_147;
    }
    life17_186 = __call98_41((lexicalValue98_156_0)[0]);
    life18_191 = __call98_42((life16_147)[1]);
    spill98_6 = life10_112;
    java.lang.String __stackOp98_44_0 = life17_186;
    java.lang.String __stackOp98_44_1 = __invokedynamic98_43(25940, (4732237625200950648L ^ life0_3));
    life19_202 = __call98_46(spill98_6, __invokedynamic98_45(__stackOp98_44_1, __stackOp98_44_0));
    spill98_7 = life19_202;
    if (!((life2_8 != null))) {
        lexicalValue98_200_0 = spill98_7;
        break lexical_join_200;
    }
    if (!((spill98_7 == null))) {
        break lexical_join_199;
    }
    java.lang.String __stackOp98_48_0 = life3_16;
    java.lang.String __stackOp98_48_1 = life15_129;
    java.lang.String __stackOp98_48_2 = __invokedynamic98_47(2687, (3816962334920200790L ^ life0_3));
    spill98_8 = __stackOp98_48_2;
    spill98_9 = __stackOp98_48_0;
    spill98_10 = __stackOp98_48_1;
    __discardScalar98_49(__stackOp98_48_2);
    java.lang.String __stackOp98_51_0 = spill98_10;
    java.lang.String __stackOp98_51_1 = __invokedynamic98_50(6832, (2158222082865152656L ^ life0_3));
    __call98_53(__invokedynamic98_52(spill98_8, spill98_9, __stackOp98_51_1, __stackOp98_51_0));
    if (!((life2_8 == null))) {
        break lexical_join_292;
    }
    }
    lexicalValue98_200_0 = life19_202;
    }
    life20_237 = __call98_54(lexicalValue98_200_0);
    spill98_11 = life20_237;
    if (!((life2_8 != null))) {
        lexicalValue98_226_0 = spill98_11;
        break lexical_join_226;
    }
    if (!((spill98_11 < 0))) {
        break lexical_join_225;
    }
    java.lang.String __stackOp98_56_0 = life3_16;
    java.lang.String __stackOp98_56_1 = life15_129;
    java.lang.String __stackOp98_56_2 = __invokedynamic98_55(26060, (8090939161803636219L ^ life0_3));
    spill98_12 = __stackOp98_56_2;
    spill98_13 = __stackOp98_56_0;
    spill98_14 = __stackOp98_56_1;
    __discardScalar98_57(__stackOp98_56_2);
    java.lang.String __stackOp98_59_0 = spill98_14;
    java.lang.String __stackOp98_59_1 = __invokedynamic98_58(6832, (2158222082865152656L ^ life0_3));
    __call98_61(__invokedynamic98_60(spill98_12, spill98_13, __stackOp98_59_1, __stackOp98_59_0));
    if (!((life2_8 == null))) {
        break lexical_join_292;
    }
    }
    lexicalValue98_226_0 = life5_47;
    }
    if (!((life2_8 != null))) {
        lexicalValue98_246_0 = lexicalValue98_226_0;
        break lexical_join_246;
    }
    if (!((lexicalValue98_226_0 != 0))) {
        break lexical_join_248;
    }
    java.lang.Object __inlineStack98_63Token;
    lexicalValue98_246_0 = __integerCategory98_67(__call98_66(new moom.DD(__invokedynamic98_65(__inlineStack98_63Output0((__inlineStack98_63Token = __inlineStack98_63Pack(life17_186, __invokedynamic98_62(957, (2238335235619576730L ^ life0_3))))), __inlineStack98_63Output1(__inlineStack98_63Token), __invokedynamic98_64(27256, (602874553091666521L ^ life0_3))))));
    }
    if (!((lexicalValue98_246_0 == 0))) {
        break lexical_join_248;
    }
    return;
    }
    life21_303 = new moom.JR(life18_191);
    if (!((life2_8 != null))) {
        break lexical_join_293;
    }
    if (!(__call98_68(life21_303))) {
        break lexical_join_292;
    }
    lexical_cycle_258: while (true) {
    if (!((__call98_69(life7_56) <= life20_237))) {
        break lexical_join_270;
    }
    __call98_70(life7_56, null);
    if (!((life2_8 != null))) {
        break lexical_join_275;
    }
    if (!((life2_8 == null))) { continue lexical_cycle_258; }
    break lexical_cycle_258;
    }
    }
    __call98_71(life7_56, life20_237, life21_303);
    }
    java.lang.String __stackOp98_73_0 = life17_186;
    java.lang.String __stackOp98_73_1 = life18_191;
    java.lang.String __stackOp98_73_2 = __invokedynamic98_72(7566, (2279459145767536040L ^ life0_3));
    spill98_15 = __stackOp98_73_2;
    spill98_16 = __stackOp98_73_0;
    spill98_17 = __stackOp98_73_1;
    __discardScalar98_74(__stackOp98_73_2);
    java.lang.String __stackOp98_76_0 = spill98_17;
    java.lang.String __stackOp98_76_1 = __invokedynamic98_75(19960, (6027064051265672662L ^ life0_3));
    __call98_78(__invokedynamic98_77(spill98_15, spill98_16, __stackOp98_76_1, __stackOp98_76_0));
    }
    life13_119 += 1;
    }
    if (!((life2_8 == null))) { continue lexical_cycle_108; }
    break lexical_cycle_108;
    }
    }
    __fieldWrite98_81(__cast98_80(__call98_79(life7_56, new moom.JR[0])));
    }
    return;
}
public static void h98_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009800_0(p0);
}
public static void h98_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009801_0(p0);
}
public static void h98_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009802_0(p0);
}
public static void h98_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009803_0(p0);
}
public static void h98_4(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009804_0(p0);
}
public static void h98_5(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009805_0(p0);
}
public static void h98_6(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009806_0(p0);
}
public static void h98_7(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009807_0(p0);
}
public static void h98_8(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009808_0(p0);
}
public static void h98_9(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009809_0(p0);
}
public static void h98_10(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009810_0(p0);
}
public static void h98_11(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009811_0(p0);
}
public static void h98_12(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009812_0(p0);
}
public static void h98_13(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009813_0(p0);
}
public static void h98_14(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009814_0(p0);
}
public static void h98_15(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009815_0(p0);
}
public static void h98_16(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009816_0(p0);
}
public static void h98_17(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009817_0(p0);
}
public static void h98_18(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009818_0(p0);
}
public static void h98_19(java.io.FileNotFoundException p0) throws Throwable {
    throw __call3009819_0(p0);
}
public static void h98_20(java.io.FileNotFoundException p0, long p1, java.lang.String p2, moom.DD p3) throws Throwable {
    java.io.FileNotFoundException life4_2;
    life4_2 = p0;
    java.lang.String __stackOp3009820_1_0 = p2;
    java.lang.String __stackOp3009820_1_1 = __invokedynamic3009820_0(18679, (2600148343769731285L ^ p1));
    __call3009820_4(__invokedynamic3009820_3(__stackOp3009820_1_1, __stackOp3009820_1_0, __invokedynamic3009820_2(31174, (6843629799213605346L ^ p1))));
    return;
}
public static void h98_21(java.lang.Exception p0, moom.DD p1) throws Throwable {
    java.lang.Exception life1_2;
    life1_2 = p0;
    __call3009821_0(life1_2);
    return;
}
private static native long __fieldRead98_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call98_1() throws Throwable;
private static native void __fieldWrite98_2(moom.JR[] a0) throws Throwable;
private static native boolean __call98_3() throws Throwable;
private static native java.lang.String __invokedynamic98_4(int a0, long a1) throws Throwable;
private static native boolean __call98_5(moom.DD a0) throws Throwable;
private static native int __integerCategory98_6(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic98_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_9(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_10(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call98_11(java.lang.String a0) throws Throwable;
private static native boolean __call98_12(moom.DD a0) throws Throwable;
private static native int __integerCategory98_13(boolean value) throws Throwable;
private static native java.io.InputStream __call98_14(moom.DD a0) throws Throwable;
private static native long __fieldRead98_15() throws Throwable;
private static native java.lang.String __call98_16(java.io.InputStream a0) throws Throwable;
private static native void __call98_17(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic98_18(int a0, long a1) throws Throwable;
private static native java.lang.String[] __call98_19(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic98_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_22(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call98_23(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_24(int a0, long a1) throws Throwable;
private static native void __call98_25(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_28(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call98_29(java.lang.String a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureMap __call98_30() throws Throwable;
private static native java.lang.String __call98_31(java.lang.String a0) throws Throwable;
private static native boolean __call98_32(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String[] __call98_33(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic98_34(int a0, long a1) throws Throwable;
private static native void __discardScalar98_36(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_37(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_39(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call98_40(java.lang.String a0) throws Throwable;
private static native java.lang.String __call98_41(java.lang.String a0) throws Throwable;
private static native java.lang.String __call98_42(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_43(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_45(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call98_46(net.minecraft.client.renderer.texture.TextureMap a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic98_47(int a0, long a1) throws Throwable;
private static native void __discardScalar98_49(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_50(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_52(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call98_53(java.lang.String a0) throws Throwable;
private static native int __call98_54(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native java.lang.String __invokedynamic98_55(int a0, long a1) throws Throwable;
private static native void __discardScalar98_57(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_58(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_60(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call98_61(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_62(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack98_63Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack98_63Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack98_63Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic98_64(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_65(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call98_66(moom.DD a0) throws Throwable;
private static native int __integerCategory98_67(boolean value) throws Throwable;
private static native boolean __call98_68(moom.JR a0) throws Throwable;
private static native int __call98_69(java.util.ArrayList a0) throws Throwable;
private static native boolean __call98_70(java.util.ArrayList a0, java.lang.Object a1) throws Throwable;
private static native java.lang.Object __call98_71(java.util.ArrayList a0, int a1, moom.JR a2) throws Throwable;
private static native java.lang.String __invokedynamic98_72(int a0, long a1) throws Throwable;
private static native void __discardScalar98_74(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic98_75(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic98_77(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3) throws Throwable;
private static native void __call98_78(java.lang.String a0) throws Throwable;
private static native java.lang.Object[] __call98_79(java.util.ArrayList a0, moom.JR[] a1) throws Throwable;
private static native moom.JR[] __cast98_80(java.lang.Object[] a0) throws Throwable;
private static native void __fieldWrite98_81(moom.JR[] a0) throws Throwable;
private static native java.lang.Exception __call3009800_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009801_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009802_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009803_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009804_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009805_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009806_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009807_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009808_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009809_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009810_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009811_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009812_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009813_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009814_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009815_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009816_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009817_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009818_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call3009819_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.String __invokedynamic3009820_0(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3009820_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3009820_3(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __call3009820_4(java.lang.String a0) throws Throwable;
private static native void __call3009821_0(java.lang.Exception a0) throws Throwable;

}

private static native <E extends Throwable> moom.lC __sourceHandlerCall_d1fa87db49dec4b6699b(moom.DT a0, moom.lC a1) throws E;
private static final class __SourceHandler_d1fa87db49dec4b6699b {

public static moom.lC f666(moom.DT p0, moom.lC p1) throws Throwable {
    net.minecraft.client.renderer.texture.TextureAtlasSprite forwardValue666_16_0;
    int forwardValue666_49_0;
    int forwardValue666_49_1;
    int forwardValue666_60_0;
    int forwardValue666_68_0;
    int forwardValue666_70_0;
    moom.JR forwardValue666_72_0;
    net.minecraft.entity.Entity[] spill666_0;
    net.minecraft.client.renderer.texture.TextureAtlasSprite spill666_1;
    int spill666_2;
    int spill666_3;
    int spill666_4;
    moom.JR spill666_5;
    int spill666_6;
    long life2_3;
    net.minecraft.client.renderer.texture.TextureAtlasSprite life5_7;
    net.minecraft.entity.Entity[] life4_8;
    moom.JR life6_22;
    int life7_32;
    int life8_36;
    int life9_38;
    int life10_40;
    forward_join_72: {
    forward_join_71: {
    forward_join_70: {
    forward_join_69: {
    forward_join_68: {
    forward_join_60: {
    forward_join_56: {
    forward_join_49: {
    forward_join_44: {
    forward_join_22: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (__fieldRead666_0() ^ 16389754635836L);
    spill666_0 = __call666_1();
    life5_7 = __call666_2(p1);
    life4_8 = spill666_0;
    spill666_1 = life5_7;
    if (!((life4_8 != null))) {
        forwardValue666_16_0 = spill666_1;
        break forward_join_16;
    }
    if (!((spill666_1 == null))) {
        break forward_join_15;
    }
    return p1;
    }
    forwardValue666_16_0 = life5_7;
    }
    life6_22 = __call666_3(forwardValue666_16_0);
    if (!((life6_22 == null))) {
        break forward_join_22;
    }
    return p1;
    }
    life7_32 = __call666_5(__call666_4(p1));
    life8_36 = __call666_6(p0, life7_32);
    life9_38 = 0;
    life10_40 = 0;
    spill666_2 = __fieldRead666_7(life6_22);
    spill666_3 = 1;
    if (!((life4_8 != null))) {
        forwardValue666_49_0 = spill666_2;
        forwardValue666_49_1 = spill666_3;
        break forward_join_49;
    }
    if (!((spill666_2 > spill666_3))) {
        break forward_join_44;
    }
    life9_38 = (life8_36 & 3);
    }
    spill666_4 = __fieldRead666_8(life6_22);
    if (!((life4_8 != null))) {
        forwardValue666_60_0 = spill666_4;
        break forward_join_60;
    }
    forwardValue666_49_0 = spill666_4;
    forwardValue666_49_1 = 2;
    }
    if (!((forwardValue666_49_0 == forwardValue666_49_1))) {
        break forward_join_56;
    }
    life9_38 = ((life9_38 / 2) * 2);
    }
    spill666_5 = life6_22;
    if (!((life4_8 != null))) {
        forwardValue666_72_0 = spill666_5;
        break forward_join_72;
    }
    forwardValue666_60_0 = __integerCategory666_10(__fieldRead666_9(spill666_5));
    }
    if (!((forwardValue666_60_0 != 0))) {
        break forward_join_71;
    }
    spill666_6 = (life8_36 & 4);
    if (!((life4_8 != null))) {
        forwardValue666_68_0 = spill666_6;
        break forward_join_68;
    }
    if (!((spill666_6 != 0))) {
        break forward_join_69;
    }
    forwardValue666_68_0 = 1;
    }
    forwardValue666_70_0 = forwardValue666_68_0;
    break forward_join_70;
    }
    forwardValue666_70_0 = 0;
    }
    life10_40 = forwardValue666_70_0;
    }
    forwardValue666_72_0 = life6_22;
    }
    return __call666_11(forwardValue666_72_0, p1, life9_38, life10_40);
}
public static void h666_0(moom.Oo p0) throws Throwable {
    throw __call1066600_0(p0);
}
public static void h666_1(moom.Oo p0) throws Throwable {
    throw __call1066601_0(p0);
}
public static void h666_2(moom.Oo p0) throws Throwable {
    throw __call1066602_0(p0);
}
public static void h666_3(moom.Oo p0) throws Throwable {
    throw __call1066603_0(p0);
}
public static void h666_4(moom.Oo p0) throws Throwable {
    throw __call1066604_0(p0);
}
public static void h666_5(moom.Oo p0) throws Throwable {
    throw __call1066605_0(p0);
}
public static void h666_6(moom.Oo p0) throws Throwable {
    throw __call1066606_0(p0);
}
public static void h666_7(moom.Oo p0) throws Throwable {
    throw __call1066607_0(p0);
}
private static native long __fieldRead666_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call666_1() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureAtlasSprite __call666_2(moom.lC a0) throws Throwable;
private static native moom.JR __call666_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.bs __call666_4(moom.lC a0) throws Throwable;
private static native int __call666_5(moom.bs a0) throws Throwable;
private static native int __call666_6(moom.DT a0, int a1) throws Throwable;
private static native int __fieldRead666_7(moom.JR a0) throws Throwable;
private static native int __fieldRead666_8(moom.JR a0) throws Throwable;
private static native boolean __fieldRead666_9(moom.JR a0) throws Throwable;
private static native int __integerCategory666_10(boolean value) throws Throwable;
private static native moom.lC __call666_11(moom.JR a0, moom.lC a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1066600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066607_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.JR __sourceHandlerCall_7decf9cf5271dda57c2a(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws E;
private static final class __SourceHandler_7decf9cf5271dda57c2a {

public static moom.JR f667(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) throws Throwable {
    int forwardValue667_15_0;
    int forwardValue667_21_0;
    int spill667_0;
    int spill667_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_20;
    forward_join_28: {
    forward_join_21: {
    forward_join_15: {
    forward_join_13: {
    life1_3 = (__fieldRead667_0() ^ 51874574459592L);
    life3_5 = __call667_1();
    spill667_0 = __instanceOf667_2(p0);
    if (!((life3_5 != null))) {
        forwardValue667_15_0 = spill667_0;
        break forward_join_15;
    }
    if (!((spill667_0 == 0))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue667_15_0 = __call667_3(p0);
    }
    life4_20 = forwardValue667_15_0;
    spill667_1 = life4_20;
    if (!((life3_5 != null))) {
        forwardValue667_21_0 = spill667_1;
        break forward_join_21;
    }
    if (!((spill667_1 >= 0))) {
        break forward_join_28;
    }
    forwardValue667_21_0 = life4_20;
    }
    if (!((forwardValue667_21_0 < (__fieldRead667_4()).length))) {
        break forward_join_28;
    }
    return (__fieldRead667_5())[life4_20];
    }
    return null;
}
public static void h667_0(moom.Oo p0) throws Throwable {
    throw __call1066700_0(p0);
}
public static void h667_1(moom.Oo p0) throws Throwable {
    throw __call1066701_0(p0);
}
public static void h667_2(moom.Oo p0) throws Throwable {
    throw __call1066702_0(p0);
}
public static void h667_3(moom.Oo p0) throws Throwable {
    throw __call1066703_0(p0);
}
private static native long __fieldRead667_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call667_1() throws Throwable;
private static native int __instanceOf667_2(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native int __call667_3(net.minecraft.client.renderer.texture.TextureAtlasSprite a0) throws Throwable;
private static native moom.JR[] __fieldRead667_4() throws Throwable;
private static native moom.JR[] __fieldRead667_5() throws Throwable;
private static native java.lang.Exception __call1066700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066703_0(moom.Oo a0) throws Throwable;

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
        byte[] spill2682_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2682_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2682_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2682_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2682_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2682_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 18601);
    if (((moom.JS.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JS.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JS.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JS", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JS.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JS.d)[life5_8] = moom.JS.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JS.d)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JS.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5175_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JS"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void a() { __sourceHandlerCall_a59ebc2d53eb87b42a84(); }


public static moom.lC a(moom.DT p0, moom.lC p1) { return __sourceHandlerCall_d1fa87db49dec4b6699b(p0, p1); }


public static moom.JR a(net.minecraft.client.renderer.texture.TextureAtlasSprite p0) { return __sourceHandlerCall_7decf9cf5271dda57c2a(p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5175_0() throws E;
}
