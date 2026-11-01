package com.moon;


public class c8 extends com.moon.c0 {

private com.moon.dh<com.moon.aV> g;

private com.moon.dm h;

private static long i;

private static java.lang.String[] k;

private static java.lang.String[] o;

private static java.util.Map p;

private static long[] q;

private static java.lang.Long[] r;

private static java.util.Map s;

public c8(java.lang.String p0, java.lang.String p1, java.lang.String[] p2) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String[])null); }

private static void __sourceConstructorBody_abf8a5ce1aa3c155(com.moon.c8 receiver, java.lang.String p0, java.lang.String p1, java.lang.String[] p2) throws Throwable {
long local4 = (com.moon.c8.i ^ 26437418293564L);
    com.moon.c8.__sourceConstructorInit_abf8a5ce1aa3c155_0(((com.moon.c8)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String[])(p2)));
    ((com.moon.c8)(receiver)).g = ((com.moon.dh)(((com.moon.dh)(((com.moon.dn)(((com.moon.dn)(((com.moon.dn)(((com.moon.dq)(com.moon.dh.a__sourceStatic_4981646cb3(((java.lang.Class)(com.moon.aV.class))))).a(((java.lang.String)(__sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_4(27332, (4322569747844869585L ^ local4))))))).b(((java.lang.String)(__sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_6(22869, (7018565673797557836L ^ local4))))))).a__dn())).a()))));
    ((com.moon.c8)(receiver)).h = ((com.moon.dm)(((com.moon.dm)(((com.moon.dn)(((com.moon.dn)(((com.moon.dv)(com.moon.dm.a__dv())).a(((java.lang.String)(__sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_13(23491, (5267118008075295961L ^ local4))))))).b(((java.lang.String)(__sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_15(20470, (3455294279739214077L ^ local4))))))).a()))));
    return;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-9064037114057033119L)), ((long)(-7418930544137742584L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(55702915680915L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.c8.i ^ 88405830693877L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill40_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill40_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill40_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill40_14 = new byte[8];
    (__sourceSpill40_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill40_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation40_16 = __sourceSpill40_14;
    ((javax.crypto.Cipher)(__sourceSpill40_11)).init(((int)(__sourceSpill40_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill40_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation40_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[24];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\032üþ¯zê\021²«ñü|Xìt½j\034\\d<ÃenÛGÚ¢æÂêR¼³X57.Ã\036À6\033\033ÿ$¿Å\021!¼\024\177{À\bÈ\023#y\017\0231\003a¹À¼Ø?Îb2.i$#Xò\024L^\0210Þ\032:\032Íô{#²l'ñ¹!z5fG0ÞÐå\bp_p¾Ê)wkR§¬²ö>múìk¢`ÅÑ(ZÝ TV\025\025S1\024ä\002ò*4\005P\035æ%\027B%ùw'\177&å;X¼èóê\022k×Qº0\bj·-\030·ïÃfÉÐsS«\026¢ã¤Ô\027f_ ÇËÐÇ¤Ì[§yñ\\;·­\020C[ê]Z\nÿÀ$¶\004½ü- KmÈ´\0030\r\032\000\036á[ñAK|ìñ\t²#êñ>\007\n\0226Eß8ª!q\007©<\004ýl.ïq°ËòlMZFÿÀ\022Çº<=³_k\033·w\016÷ }Ý\"ÔÂ3kO7C_\002\rù¶û\"\023\n àÄ¥X£P/ïYÿT®p³¯ÃÁ±ÃFDUË=\030s\030üÁU¤+í\r­°-\004ï@~~Gêf¤Z2`Â$i*!øå@ýúp£º\026.Rõe$fxb¦©ñù;¡{°\006I¡¡fU\034Lå{ßw\033S¥cgS¡ü×H\013\033HÐ*§G¨c%ücp©\bxf\000¨ÙøOS½\020¼ÙH:iqåóCø\020ËÅeA9Ù\006b\tDã\037B,|(/Þåw-øÆ¾¡D\177S8ØI\024>\004`+\fCé\020\031QR\000²{¦À\026ÿùú(}\027\025w4§òÒç\035û¯\002ðôn9XNk6U:Áã£ÓµNaE\013\\°¡\0203Ì\016)^ÜÉÝO\032Ò5X\002 X\0259Kå\0064mOÑBµ¥Bû\034\0257p\032\177\033t[ãMÀ\"8¢!\034VÜ°\027ñRØÎ!:$-ÍÆ\000°Ã÷6#\0041bl÷þöñD\027ªyj-/~=\003\021\\ÙA&Cg)£&;6`\020åÄââ°LvÂ¦\177]=Zf¾çL\003\bWÇ\tý®«Üºd/\fÐá¥dbn@d¦ã5z\rµQò`\001Ü?Rû²ì,ÞÞÝ Qõ\b¸x\r-{ð-kBKö\te^r«^â8\020mYA\034\030¸÷hN9\004öLª¯Í¦Ý*\r\rå\017`Î(ðóïnlí»\021>/²2úÑ{=·,\016Ý(xhýúÆÏ¹\021Ò/ï\031ô\004áû^9ZÓ\001\034ek¯-X¼dbò\037! ªØ\030tÐÖ½¥{\013,áYP&Éé¥û\\\031²z¯VGê9vRçýêÏ<ú$BÒÀ\n\034^á\025Üñ\0248\031&ëì´#\r¬ê³À?\róþµqüÏë÷tDxøà´?goZUæÍîü'FbM\b&\004C%xC÷>ÆAÀN¾D©ó\004wXµ÷iÐ\007ØMI£bÁ¸\024\006Ð<[Îv[]ö¹qFóY\foî¼³æ·²ùu³àâæ7º\017µ\002Vd/ Vö·Ü \004rÇ{5¾k,õ\nÌ\"+ÃÖiSNe1( O}_uaa\003e\0273,;¸(#è`ÄLI\n©à\0306Â\026\\GÓh¾\001v±Í\n'nÄpV\016\004h £Q-h\\<Ïælb='å:\006\016iLj´µ.\021ï \033\024[ú3\006o®ìõéa\033³xØ\024äâÆ×q]ì¸è'ekåîÐù\022?>Ï\016söµi\000ó+ýòÙ%\027Ëì\036Ç%ëù¯¡ÕY\013°®`\007§¯¼ä\030Vô \020RkÌ¡áìÊÄ¢Eï¼\022º±"))).length();
    int local16_life24 = 104;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill40_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill40_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill40_29)).doFinal(((byte[])(__sourceSpill40_28)));
        java.lang.String __sourceSpill40_34 = ((java.lang.String)(com.moon.c8.b(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill40_35 = local20_life19;
        int __sourceSpill40_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill40_35)[__sourceSpill40_36] = __sourceSpill40_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "\025p§È:£\021.ü\031\r\036\025Ùß{v\033v:OÙ`O®³«Ec½!°u\034kÒÝm\003\030E³\020Ø7\036\022ñ?Qj·ï"))).length();
    local16_life24 = 48;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill40_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill40_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill40_42)).doFinal(((byte[])(__sourceSpill40_41)));
        java.lang.String __sourceSpill40_47 = ((java.lang.String)(com.moon.c8.b(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill40_48 = local20_life19;
        int __sourceSpill40_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill40_48)[__sourceSpill40_49] = __sourceSpill40_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    k = ((java.lang.String[])(local20_life19));
    o = ((java.lang.String[])(new java.lang.String[24]));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill40_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill40_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill40_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill40_60 = new byte[8];
    (__sourceSpill40_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill40_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation40_62 = __sourceSpill40_60;
    ((javax.crypto.Cipher)(__sourceSpill40_57)).init(((int)(__sourceSpill40_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill40_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation40_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "d\007)ÃC\0019ÏÇ[#\035O¼@"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill40_71 = local4_life67;
        int __sourceSpill40_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill40_71)).substring(((int)(__sourceSpill40_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill40_76 = local6_life65;
        int __sourceSpill40_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill40_79 = new byte[8];
        (__sourceSpill40_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill40_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill40_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill40_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill40_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill40_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill40_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill40_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill40_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill40_80)).doFinal(((byte[])(__sourceSpill40_79)));
        (__sourceSpill40_76)[__sourceSpill40_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    q = ((long[])(local6_life65));
    r = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_abf8a5ce1aa3c155_0(com.moon.c8 a0, java.lang.String a1, java.lang.String a2, java.lang.String[] a3) throws E;
private static native <E extends Throwable> com.moon.dc __sourceHandlerCall_20c6f87b0a385ca22e29(com.moon.c8 a0) throws E;
private static final class __SourceHandler_20c6f87b0a385ca22e29 {

public static com.moon.dc f900114(com.moon.c8 receiver) throws Throwable {
    int forestValue900114_89_0;
    com.moon.jI forestValue900114_171_0;
    int forestValue900114_254_0;
    com.moon.jI forestValue900114_336_0;
    int forestValue900114_419_0;
    com.moon.jI forestValue900114_501_0;
    int forestValue900114_587_0;
    int spill900114_0;
    com.moon.jI spill900114_1;
    com.moon.hD spill900114_2;
    com.moon.hB spill900114_3;
    com.moon.hD spill900114_4;
    com.moon.hB spill900114_5;
    com.moon.hD spill900114_6;
    com.moon.hB spill900114_7;
    com.moon.jI spill900114_8;
    com.moon.hD spill900114_9;
    com.moon.hB spill900114_10;
    com.moon.hD spill900114_11;
    com.moon.hB spill900114_12;
    com.moon.hD spill900114_13;
    com.moon.hB spill900114_14;
    com.moon.jI spill900114_15;
    com.moon.hD spill900114_16;
    com.moon.hB spill900114_17;
    com.moon.hD spill900114_18;
    com.moon.hB spill900114_19;
    com.moon.hD spill900114_20;
    com.moon.hB spill900114_21;
    com.moon.hD spill900114_22;
    com.moon.hB spill900114_23;
    long life1_3;
    com.moon.jK life4_7;
    int life3_8;
    java.lang.String life5_13;
    java.lang.StringBuilder life6_34;
    java.util.Map life7_37;
    java.util.Iterator life8_58;
    com.moon.jI life9_67;
    int life6_101;
    com.moon.jI life7_143;
    int life6_279;
    com.moon.jI life7_321;
    int life6_457;
    com.moon.jI life7_499;
    int life6_638;
    forest_join_658: {
    forest_join_625: {
    forest_join_622: {
    forest_join_587: {
    forest_join_586: {
    forest_join_582: {
    forest_join_541: {
    forest_join_501: {
    forest_join_500: {
    forest_join_454: {
    forest_join_449: {
    forest_join_419: {
    forest_join_418: {
    forest_join_414: {
    forest_join_376: {
    forest_join_336: {
    forest_join_335: {
    forest_join_289: {
    forest_join_284: {
    forest_join_254: {
    forest_join_253: {
    forest_join_249: {
    forest_join_211: {
    forest_join_171: {
    forest_join_170: {
    forest_join_124: {
    forest_join_119: {
    forest_join_89: {
    forest_join_88: {
    forest_join_84: {
    forest_join_82: {
    forest_join_79: {
    forest_join_29: {
    forest_join_28: {
    forest_join_24: {
    life1_3 = (__fieldRead900114_0() ^ 17703235760468L);
    spill900114_0 = __call900114_1();
    life4_7 = __call900114_3(__call900114_2());
    life3_8 = spill900114_0;
    life5_13 = __cast900114_6(__call900114_5(__fieldRead900114_4(receiver)));
    if (!((life3_8 == 0))) {
        break forest_join_28;
    }
    switch ((__fieldRead900114_7())[__call900114_11(__cast900114_10(__call900114_9(__fieldRead900114_8(receiver))))]) {
case 1:
{
        break forest_join_24;
    }
case 2:
{
        break forest_join_29;
    }
case 3:
{
        break forest_join_84;
    }
case 4:
{
        break forest_join_249;
    }
case 5:
{
        break forest_join_414;
    }
case 6:
{
        break forest_join_582;
    }
default:
{
        break forest_join_658;
    }
}
    }
    __call900114_14(__call900114_12(), __call900114_13(life4_7));
    }
    break forest_join_658;
    }
    life6_34 = new java.lang.StringBuilder();
    life7_37 = __call900114_15(life4_7);
    __call900114_21(__call900114_19(__call900114_17(life6_34, __invokedynamic900114_16(24195, (6404646138282127859L ^ life1_3))), __call900114_18(life7_37)), __invokedynamic900114_20(10760, (1605055589977212272L ^ life1_3)));
    life8_58 = __call900114_23(__call900114_22(life7_37));
    forest_cycle_57: while (true) {
    if (!(__call900114_24(life8_58))) {
        break forest_join_79;
    }
    life9_67 = __cast900114_26(__call900114_25(life8_58));
    __call900114_30(__call900114_28(life6_34, __invokedynamic900114_27(2028, (1633728605187991703L ^ life1_3))), __call900114_29(life9_67));
    if (!((life3_8 == 0))) {
        break forest_join_82;
    }
    if (!((life3_8 != 0))) {
        continue forest_cycle_57;
    }
    break forest_cycle_57;
    }
    }
    __call900114_32(__call900114_31(life6_34));
    }
    if (!((life3_8 != 0))) {
        break forest_join_658;
    }
    }
    if (!((life5_13 != null))) {
        break forest_join_88;
    }
    forestValue900114_89_0 = 1;
    break forest_join_89;
    }
    forestValue900114_89_0 = 0;
    }
    life6_101 = forestValue900114_89_0;
    if (!((life3_8 == 0))) {
        break forest_join_119;
    }
    if (!((life6_101 == 0))) {
        break forest_join_124;
    }
    __call900114_45(__call900114_34(__call900114_33()), __call900114_44(__call900114_43(__call900114_41(__call900114_39(__call900114_37(__call900114_35(), __invokedynamic900114_36(9620, (8499957830904957680L ^ life1_3))), __invokedynamic900114_38(21877, (719725529493912080L ^ life1_3))), __fieldRead900114_40()), __invokedynamic900114_42(11333, (12628649059239245L ^ life1_3)))));
    }
    return __call900114_48(__call900114_47(__call900114_46(), 1));
    }
    life7_143 = __call900114_49(life4_7, life5_13);
    spill900114_1 = life7_143;
    if (!((life3_8 == 0))) {
        forestValue900114_171_0 = spill900114_1;
        break forest_join_171;
    }
    if (!((spill900114_1 == null))) {
        break forest_join_170;
    }
    spill900114_2 = __call900114_51(__call900114_50());
    spill900114_3 = __call900114_54(__call900114_52(), __invokedynamic900114_53(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_56_0 = life5_13;
    java.lang.String __stackOp900114_56_1 = __invokedynamic900114_55(28568, (8081342599147061486L ^ life1_3));
    __call900114_65(spill900114_2, __call900114_64(__call900114_63(__call900114_61(__call900114_59(spill900114_3, __invokedynamic900114_58(__stackOp900114_56_1, __stackOp900114_56_0, __invokedynamic900114_57(24809, (2845037948988002187L ^ life1_3)))), __fieldRead900114_60()), __invokedynamic900114_62(7371, (6724656160330380738L ^ life1_3)))));
    return __call900114_68(__call900114_67(__call900114_66(), 1));
    }
    forestValue900114_171_0 = life7_143;
    }
    if (!(__call900114_69(forestValue900114_171_0))) {
        break forest_join_211;
    }
    spill900114_4 = __call900114_71(__call900114_70());
    spill900114_5 = __call900114_74(__call900114_72(), __invokedynamic900114_73(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_76_0 = life5_13;
    java.lang.String __stackOp900114_76_1 = __invokedynamic900114_75(3117, (4522054512387580753L ^ life1_3));
    __call900114_85(spill900114_4, __call900114_84(__call900114_83(__call900114_81(__call900114_79(spill900114_5, __invokedynamic900114_78(__stackOp900114_76_1, __stackOp900114_76_0, __invokedynamic900114_77(29526, (8271055495775984684L ^ life1_3)))), __fieldRead900114_80()), __invokedynamic900114_82(7371, (6724656160330380738L ^ life1_3)))));
    return __call900114_88(__call900114_87(__call900114_86(), 1));
    }
    __call900114_89(receiver, life7_143);
    spill900114_6 = __call900114_91(__call900114_90());
    spill900114_7 = __call900114_94(__call900114_92(), __invokedynamic900114_93(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_96_0 = life5_13;
    java.lang.String __stackOp900114_96_1 = __invokedynamic900114_95(3117, (4522054512387580753L ^ life1_3));
    __call900114_105(spill900114_6, __call900114_104(__call900114_103(__call900114_101(__call900114_99(spill900114_7, __invokedynamic900114_98(__stackOp900114_96_1, __stackOp900114_96_0, __invokedynamic900114_97(2582, (2795275982482367857L ^ life1_3)))), __fieldRead900114_100()), __invokedynamic900114_102(7371, (6724656160330380738L ^ life1_3)))));
    if (!((life3_8 != 0))) {
        break forest_join_658;
    }
    }
    if (!((life5_13 != null))) {
        break forest_join_253;
    }
    forestValue900114_254_0 = 1;
    break forest_join_254;
    }
    forestValue900114_254_0 = 0;
    }
    life6_279 = forestValue900114_254_0;
    if (!((life3_8 == 0))) {
        break forest_join_284;
    }
    if (!((life6_279 == 0))) {
        break forest_join_289;
    }
    __call900114_118(__call900114_107(__call900114_106()), __call900114_117(__call900114_116(__call900114_114(__call900114_112(__call900114_110(__call900114_108(), __invokedynamic900114_109(20536, (424159611132002142L ^ life1_3))), __invokedynamic900114_111(17642, (5859103937998367635L ^ life1_3))), __fieldRead900114_113()), __invokedynamic900114_115(7371, (6724656160330380738L ^ life1_3)))));
    }
    return __call900114_121(__call900114_120(__call900114_119(), 1));
    }
    life7_321 = __call900114_122(life4_7, life5_13);
    spill900114_8 = life7_321;
    if (!((life3_8 == 0))) {
        forestValue900114_336_0 = spill900114_8;
        break forest_join_336;
    }
    if (!((spill900114_8 == null))) {
        break forest_join_335;
    }
    spill900114_9 = __call900114_124(__call900114_123());
    spill900114_10 = __call900114_127(__call900114_125(), __invokedynamic900114_126(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_129_0 = life5_13;
    java.lang.String __stackOp900114_129_1 = __invokedynamic900114_128(3117, (4522054512387580753L ^ life1_3));
    __call900114_138(spill900114_9, __call900114_137(__call900114_136(__call900114_134(__call900114_132(spill900114_10, __invokedynamic900114_131(__stackOp900114_129_1, __stackOp900114_129_0, __invokedynamic900114_130(21333, (504384986927086645L ^ life1_3)))), __fieldRead900114_133()), __invokedynamic900114_135(7371, (6724656160330380738L ^ life1_3)))));
    return __call900114_141(__call900114_140(__call900114_139(), 1));
    }
    forestValue900114_336_0 = life7_321;
    }
    if (!((!__call900114_142(forestValue900114_336_0)))) {
        break forest_join_376;
    }
    spill900114_11 = __call900114_144(__call900114_143());
    spill900114_12 = __call900114_147(__call900114_145(), __invokedynamic900114_146(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_149_0 = life5_13;
    java.lang.String __stackOp900114_149_1 = __invokedynamic900114_148(3117, (4522054512387580753L ^ life1_3));
    __call900114_158(spill900114_11, __call900114_157(__call900114_156(__call900114_154(__call900114_152(spill900114_12, __invokedynamic900114_151(__stackOp900114_149_1, __stackOp900114_149_0, __invokedynamic900114_150(30408, (3618588518570203583L ^ life1_3)))), __fieldRead900114_153()), __invokedynamic900114_155(7371, (6724656160330380738L ^ life1_3)))));
    return __call900114_161(__call900114_160(__call900114_159(), 1));
    }
    __call900114_162(receiver, life7_321);
    spill900114_13 = __call900114_164(__call900114_163());
    spill900114_14 = __call900114_167(__call900114_165(), __invokedynamic900114_166(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_169_0 = life5_13;
    java.lang.String __stackOp900114_169_1 = __invokedynamic900114_168(3117, (4522054512387580753L ^ life1_3));
    __call900114_178(spill900114_13, __call900114_177(__call900114_176(__call900114_174(__call900114_172(spill900114_14, __invokedynamic900114_171(__stackOp900114_169_1, __stackOp900114_169_0, __invokedynamic900114_170(3149, (2228266976428253996L ^ life1_3)))), __fieldRead900114_173()), __invokedynamic900114_175(7371, (6724656160330380738L ^ life1_3)))));
    if (!((life3_8 != 0))) {
        break forest_join_658;
    }
    }
    if (!((life5_13 != null))) {
        break forest_join_418;
    }
    forestValue900114_419_0 = 1;
    break forest_join_419;
    }
    forestValue900114_419_0 = 0;
    }
    life6_457 = forestValue900114_419_0;
    if (!((life3_8 == 0))) {
        break forest_join_449;
    }
    if (!((life6_457 == 0))) {
        break forest_join_454;
    }
    __call900114_191(__call900114_180(__call900114_179()), __call900114_190(__call900114_189(__call900114_187(__call900114_185(__call900114_183(__call900114_181(), __invokedynamic900114_182(20536, (424159611132002142L ^ life1_3))), __invokedynamic900114_184(19359, (5809001058891736300L ^ life1_3))), __fieldRead900114_186()), __invokedynamic900114_188(7371, (6724656160330380738L ^ life1_3)))));
    }
    return __call900114_194(__call900114_193(__call900114_192(), 1));
    }
    life7_499 = __call900114_195(life4_7, life5_13);
    spill900114_15 = life7_499;
    if (!((life3_8 == 0))) {
        forestValue900114_501_0 = spill900114_15;
        break forest_join_501;
    }
    if (!((spill900114_15 == null))) {
        break forest_join_500;
    }
    spill900114_16 = __call900114_197(__call900114_196());
    spill900114_17 = __call900114_200(__call900114_198(), __invokedynamic900114_199(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_202_0 = life5_13;
    java.lang.String __stackOp900114_202_1 = __invokedynamic900114_201(3117, (4522054512387580753L ^ life1_3));
    __call900114_211(spill900114_16, __call900114_210(__call900114_209(__call900114_207(__call900114_205(spill900114_17, __invokedynamic900114_204(__stackOp900114_202_1, __stackOp900114_202_0, __invokedynamic900114_203(21333, (504384986927086645L ^ life1_3)))), __fieldRead900114_206()), __invokedynamic900114_208(7371, (6724656160330380738L ^ life1_3)))));
    return __call900114_214(__call900114_213(__call900114_212(), 1));
    }
    forestValue900114_501_0 = life7_499;
    }
    if (!((!__call900114_215(forestValue900114_501_0)))) {
        break forest_join_541;
    }
    spill900114_18 = __call900114_217(__call900114_216());
    spill900114_19 = __call900114_220(__call900114_218(), __invokedynamic900114_219(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_222_0 = life5_13;
    java.lang.String __stackOp900114_222_1 = __invokedynamic900114_221(3117, (4522054512387580753L ^ life1_3));
    __call900114_231(spill900114_18, __call900114_230(__call900114_229(__call900114_227(__call900114_225(spill900114_19, __invokedynamic900114_224(__stackOp900114_222_1, __stackOp900114_222_0, __invokedynamic900114_223(28237, (2113408691531972920L ^ life1_3)))), __fieldRead900114_226()), __invokedynamic900114_228(7371, (6724656160330380738L ^ life1_3)))));
    return __call900114_234(__call900114_233(__call900114_232(), 1));
    }
    __call900114_235(receiver, life7_499);
    __call900114_236(receiver, life7_499);
    spill900114_20 = __call900114_238(__call900114_237());
    spill900114_21 = __call900114_241(__call900114_239(), __invokedynamic900114_240(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_243_0 = life5_13;
    java.lang.String __stackOp900114_243_1 = __invokedynamic900114_242(3117, (4522054512387580753L ^ life1_3));
    __call900114_252(spill900114_20, __call900114_251(__call900114_250(__call900114_248(__call900114_246(spill900114_21, __invokedynamic900114_245(__stackOp900114_243_1, __stackOp900114_243_0, __invokedynamic900114_244(14726, (9131655303516739321L ^ life1_3)))), __fieldRead900114_247()), __invokedynamic900114_249(7371, (6724656160330380738L ^ life1_3)))));
    if (!((life3_8 != 0))) {
        break forest_join_658;
    }
    }
    if (!((life5_13 != null))) {
        break forest_join_586;
    }
    forestValue900114_587_0 = 1;
    break forest_join_587;
    }
    forestValue900114_587_0 = 0;
    }
    life6_638 = forestValue900114_587_0;
    if (!((life3_8 == 0))) {
        break forest_join_625;
    }
    if (!((life6_638 == 0))) {
        break forest_join_622;
    }
    __call900114_265(__call900114_254(__call900114_253()), __call900114_264(__call900114_263(__call900114_261(__call900114_259(__call900114_257(__call900114_255(), __invokedynamic900114_256(20536, (424159611132002142L ^ life1_3))), __invokedynamic900114_258(2557, (6665958636180530819L ^ life1_3))), __fieldRead900114_260()), __invokedynamic900114_262(7371, (6724656160330380738L ^ life1_3)))));
    return __call900114_268(__call900114_267(__call900114_266(), 1));
    }
    __call900114_269(life4_7, life5_13);
    }
    spill900114_22 = __call900114_271(__call900114_270());
    spill900114_23 = __call900114_274(__call900114_272(), __invokedynamic900114_273(20536, (424159611132002142L ^ life1_3)));
    java.lang.String __stackOp900114_276_0 = life5_13;
    java.lang.String __stackOp900114_276_1 = __invokedynamic900114_275(3117, (4522054512387580753L ^ life1_3));
    __call900114_285(spill900114_22, __call900114_284(__call900114_283(__call900114_281(__call900114_279(spill900114_23, __invokedynamic900114_278(__stackOp900114_276_1, __stackOp900114_276_0, __invokedynamic900114_277(19997, (5688108028426953065L ^ life1_3)))), __fieldRead900114_280()), __invokedynamic900114_282(7371, (6724656160330380738L ^ life1_3)))));
    }
    return __call900114_288(__call900114_287(__call900114_286(), 1));
}
public static com.moon.dc h900114_0(java.io.IOException p0) throws Throwable {
    throw __call93011400_0(p0);
}
public static com.moon.dc h900114_1(java.io.IOException p0, com.moon.c8 p1, long p2, int p3, com.moon.jK p4, java.lang.String p5) throws Throwable {
    int forestValue93011401_64_0;
    com.moon.jI forestValue93011401_146_0;
    int forestValue93011401_229_0;
    com.moon.jI forestValue93011401_311_0;
    int forestValue93011401_394_0;
    com.moon.jI forestValue93011401_476_0;
    int forestValue93011401_562_0;
    com.moon.jI spill93011401_0;
    com.moon.hD spill93011401_1;
    com.moon.hB spill93011401_2;
    com.moon.hD spill93011401_3;
    com.moon.hB spill93011401_4;
    com.moon.hD spill93011401_5;
    com.moon.hB spill93011401_6;
    com.moon.jI spill93011401_7;
    com.moon.hD spill93011401_8;
    com.moon.hB spill93011401_9;
    com.moon.hD spill93011401_10;
    com.moon.hB spill93011401_11;
    com.moon.hD spill93011401_12;
    com.moon.hB spill93011401_13;
    com.moon.jI spill93011401_14;
    com.moon.hD spill93011401_15;
    com.moon.hB spill93011401_16;
    com.moon.hD spill93011401_17;
    com.moon.hB spill93011401_18;
    com.moon.hD spill93011401_19;
    com.moon.hB spill93011401_20;
    com.moon.hD spill93011401_21;
    com.moon.hB spill93011401_22;
    java.io.IOException life7_2;
    java.lang.StringBuilder life7_9;
    java.util.Map life8_12;
    java.util.Iterator life9_33;
    com.moon.jI life10_42;
    int life7_76;
    com.moon.jI life8_118;
    int life7_254;
    com.moon.jI life8_296;
    int life7_432;
    com.moon.jI life8_474;
    int life7_613;
    forest_join_633: {
    forest_join_600: {
    forest_join_597: {
    forest_join_562: {
    forest_join_561: {
    forest_join_516: {
    forest_join_476: {
    forest_join_475: {
    forest_join_429: {
    forest_join_424: {
    forest_join_394: {
    forest_join_393: {
    forest_join_351: {
    forest_join_311: {
    forest_join_310: {
    forest_join_264: {
    forest_join_259: {
    forest_join_229: {
    forest_join_228: {
    forest_join_186: {
    forest_join_146: {
    forest_join_145: {
    forest_join_99: {
    forest_join_94: {
    forest_join_64: {
    forest_join_63: {
    forest_join_57: {
    forest_join_54: {
    life7_2 = p0;
    if (!((p3 != 0))) {
        break forest_join_633;
    }
    life7_9 = new java.lang.StringBuilder();
    life8_12 = __call93011401_0(p4);
    __call93011401_6(__call93011401_4(__call93011401_2(life7_9, __invokedynamic93011401_1(24195, (6404646138282127859L ^ p2))), __call93011401_3(life8_12)), __invokedynamic93011401_5(10760, (1605055589977212272L ^ p2)));
    life9_33 = __call93011401_8(__call93011401_7(life8_12));
    forest_cycle_32: while (true) {
    if (!(__call93011401_9(life9_33))) {
        break forest_join_54;
    }
    life10_42 = __cast93011401_11(__call93011401_10(life9_33));
    __call93011401_15(__call93011401_13(life7_9, __invokedynamic93011401_12(2028, (1633728605187991703L ^ p2))), __call93011401_14(life10_42));
    if (!((p3 == 0))) {
        break forest_join_57;
    }
    if (!((p3 != 0))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    }
    __call93011401_17(__call93011401_16(life7_9));
    }
    if (!((p3 != 0))) {
        break forest_join_633;
    }
    if (!((p5 != null))) {
        break forest_join_63;
    }
    forestValue93011401_64_0 = 1;
    break forest_join_64;
    }
    forestValue93011401_64_0 = 0;
    }
    life7_76 = forestValue93011401_64_0;
    if (!((p3 == 0))) {
        break forest_join_94;
    }
    if (!((life7_76 == 0))) {
        break forest_join_99;
    }
    __call93011401_30(__call93011401_19(__call93011401_18()), __call93011401_29(__call93011401_28(__call93011401_26(__call93011401_24(__call93011401_22(__call93011401_20(), __invokedynamic93011401_21(9620, (8499957830904957680L ^ p2))), __invokedynamic93011401_23(21877, (719725529493912080L ^ p2))), __fieldRead93011401_25()), __invokedynamic93011401_27(11333, (12628649059239245L ^ p2)))));
    }
    return __call93011401_33(__call93011401_32(__call93011401_31(), 1));
    }
    life8_118 = __call93011401_34(p4, p5);
    spill93011401_0 = life8_118;
    if (!((p3 == 0))) {
        forestValue93011401_146_0 = spill93011401_0;
        break forest_join_146;
    }
    if (!((spill93011401_0 == null))) {
        break forest_join_145;
    }
    spill93011401_1 = __call93011401_36(__call93011401_35());
    spill93011401_2 = __call93011401_39(__call93011401_37(), __invokedynamic93011401_38(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_41_0 = p5;
    java.lang.String __stackOp93011401_41_1 = __invokedynamic93011401_40(28568, (8081342599147061486L ^ p2));
    __call93011401_50(spill93011401_1, __call93011401_49(__call93011401_48(__call93011401_46(__call93011401_44(spill93011401_2, __invokedynamic93011401_43(__stackOp93011401_41_1, __stackOp93011401_41_0, __invokedynamic93011401_42(24809, (2845037948988002187L ^ p2)))), __fieldRead93011401_45()), __invokedynamic93011401_47(7371, (6724656160330380738L ^ p2)))));
    return __call93011401_53(__call93011401_52(__call93011401_51(), 1));
    }
    forestValue93011401_146_0 = life8_118;
    }
    if (!(__call93011401_54(forestValue93011401_146_0))) {
        break forest_join_186;
    }
    spill93011401_3 = __call93011401_56(__call93011401_55());
    spill93011401_4 = __call93011401_59(__call93011401_57(), __invokedynamic93011401_58(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_61_0 = p5;
    java.lang.String __stackOp93011401_61_1 = __invokedynamic93011401_60(3117, (4522054512387580753L ^ p2));
    __call93011401_70(spill93011401_3, __call93011401_69(__call93011401_68(__call93011401_66(__call93011401_64(spill93011401_4, __invokedynamic93011401_63(__stackOp93011401_61_1, __stackOp93011401_61_0, __invokedynamic93011401_62(29526, (8271055495775984684L ^ p2)))), __fieldRead93011401_65()), __invokedynamic93011401_67(7371, (6724656160330380738L ^ p2)))));
    return __call93011401_73(__call93011401_72(__call93011401_71(), 1));
    }
    __call93011401_74(p1, life8_118);
    spill93011401_5 = __call93011401_76(__call93011401_75());
    spill93011401_6 = __call93011401_79(__call93011401_77(), __invokedynamic93011401_78(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_81_0 = p5;
    java.lang.String __stackOp93011401_81_1 = __invokedynamic93011401_80(3117, (4522054512387580753L ^ p2));
    __call93011401_90(spill93011401_5, __call93011401_89(__call93011401_88(__call93011401_86(__call93011401_84(spill93011401_6, __invokedynamic93011401_83(__stackOp93011401_81_1, __stackOp93011401_81_0, __invokedynamic93011401_82(2582, (2795275982482367857L ^ p2)))), __fieldRead93011401_85()), __invokedynamic93011401_87(7371, (6724656160330380738L ^ p2)))));
    if (!((p3 != 0))) {
        break forest_join_633;
    }
    if (!((p5 != null))) {
        break forest_join_228;
    }
    forestValue93011401_229_0 = 1;
    break forest_join_229;
    }
    forestValue93011401_229_0 = 0;
    }
    life7_254 = forestValue93011401_229_0;
    if (!((p3 == 0))) {
        break forest_join_259;
    }
    if (!((life7_254 == 0))) {
        break forest_join_264;
    }
    __call93011401_103(__call93011401_92(__call93011401_91()), __call93011401_102(__call93011401_101(__call93011401_99(__call93011401_97(__call93011401_95(__call93011401_93(), __invokedynamic93011401_94(20536, (424159611132002142L ^ p2))), __invokedynamic93011401_96(17642, (5859103937998367635L ^ p2))), __fieldRead93011401_98()), __invokedynamic93011401_100(7371, (6724656160330380738L ^ p2)))));
    }
    return __call93011401_106(__call93011401_105(__call93011401_104(), 1));
    }
    life8_296 = __call93011401_107(p4, p5);
    spill93011401_7 = life8_296;
    if (!((p3 == 0))) {
        forestValue93011401_311_0 = spill93011401_7;
        break forest_join_311;
    }
    if (!((spill93011401_7 == null))) {
        break forest_join_310;
    }
    spill93011401_8 = __call93011401_109(__call93011401_108());
    spill93011401_9 = __call93011401_112(__call93011401_110(), __invokedynamic93011401_111(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_114_0 = p5;
    java.lang.String __stackOp93011401_114_1 = __invokedynamic93011401_113(3117, (4522054512387580753L ^ p2));
    __call93011401_123(spill93011401_8, __call93011401_122(__call93011401_121(__call93011401_119(__call93011401_117(spill93011401_9, __invokedynamic93011401_116(__stackOp93011401_114_1, __stackOp93011401_114_0, __invokedynamic93011401_115(21333, (504384986927086645L ^ p2)))), __fieldRead93011401_118()), __invokedynamic93011401_120(7371, (6724656160330380738L ^ p2)))));
    return __call93011401_126(__call93011401_125(__call93011401_124(), 1));
    }
    forestValue93011401_311_0 = life8_296;
    }
    if (!((!__call93011401_127(forestValue93011401_311_0)))) {
        break forest_join_351;
    }
    spill93011401_10 = __call93011401_129(__call93011401_128());
    spill93011401_11 = __call93011401_132(__call93011401_130(), __invokedynamic93011401_131(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_134_0 = p5;
    java.lang.String __stackOp93011401_134_1 = __invokedynamic93011401_133(3117, (4522054512387580753L ^ p2));
    __call93011401_143(spill93011401_10, __call93011401_142(__call93011401_141(__call93011401_139(__call93011401_137(spill93011401_11, __invokedynamic93011401_136(__stackOp93011401_134_1, __stackOp93011401_134_0, __invokedynamic93011401_135(30408, (3618588518570203583L ^ p2)))), __fieldRead93011401_138()), __invokedynamic93011401_140(7371, (6724656160330380738L ^ p2)))));
    return __call93011401_146(__call93011401_145(__call93011401_144(), 1));
    }
    __call93011401_147(p1, life8_296);
    spill93011401_12 = __call93011401_149(__call93011401_148());
    spill93011401_13 = __call93011401_152(__call93011401_150(), __invokedynamic93011401_151(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_154_0 = p5;
    java.lang.String __stackOp93011401_154_1 = __invokedynamic93011401_153(3117, (4522054512387580753L ^ p2));
    __call93011401_163(spill93011401_12, __call93011401_162(__call93011401_161(__call93011401_159(__call93011401_157(spill93011401_13, __invokedynamic93011401_156(__stackOp93011401_154_1, __stackOp93011401_154_0, __invokedynamic93011401_155(3149, (2228266976428253996L ^ p2)))), __fieldRead93011401_158()), __invokedynamic93011401_160(7371, (6724656160330380738L ^ p2)))));
    if (!((p3 != 0))) {
        break forest_join_633;
    }
    if (!((p5 != null))) {
        break forest_join_393;
    }
    forestValue93011401_394_0 = 1;
    break forest_join_394;
    }
    forestValue93011401_394_0 = 0;
    }
    life7_432 = forestValue93011401_394_0;
    if (!((p3 == 0))) {
        break forest_join_424;
    }
    if (!((life7_432 == 0))) {
        break forest_join_429;
    }
    __call93011401_176(__call93011401_165(__call93011401_164()), __call93011401_175(__call93011401_174(__call93011401_172(__call93011401_170(__call93011401_168(__call93011401_166(), __invokedynamic93011401_167(20536, (424159611132002142L ^ p2))), __invokedynamic93011401_169(19359, (5809001058891736300L ^ p2))), __fieldRead93011401_171()), __invokedynamic93011401_173(7371, (6724656160330380738L ^ p2)))));
    }
    return __call93011401_179(__call93011401_178(__call93011401_177(), 1));
    }
    life8_474 = __call93011401_180(p4, p5);
    spill93011401_14 = life8_474;
    if (!((p3 == 0))) {
        forestValue93011401_476_0 = spill93011401_14;
        break forest_join_476;
    }
    if (!((spill93011401_14 == null))) {
        break forest_join_475;
    }
    spill93011401_15 = __call93011401_182(__call93011401_181());
    spill93011401_16 = __call93011401_185(__call93011401_183(), __invokedynamic93011401_184(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_187_0 = p5;
    java.lang.String __stackOp93011401_187_1 = __invokedynamic93011401_186(3117, (4522054512387580753L ^ p2));
    __call93011401_196(spill93011401_15, __call93011401_195(__call93011401_194(__call93011401_192(__call93011401_190(spill93011401_16, __invokedynamic93011401_189(__stackOp93011401_187_1, __stackOp93011401_187_0, __invokedynamic93011401_188(21333, (504384986927086645L ^ p2)))), __fieldRead93011401_191()), __invokedynamic93011401_193(7371, (6724656160330380738L ^ p2)))));
    return __call93011401_199(__call93011401_198(__call93011401_197(), 1));
    }
    forestValue93011401_476_0 = life8_474;
    }
    if (!((!__call93011401_200(forestValue93011401_476_0)))) {
        break forest_join_516;
    }
    spill93011401_17 = __call93011401_202(__call93011401_201());
    spill93011401_18 = __call93011401_205(__call93011401_203(), __invokedynamic93011401_204(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_207_0 = p5;
    java.lang.String __stackOp93011401_207_1 = __invokedynamic93011401_206(3117, (4522054512387580753L ^ p2));
    __call93011401_216(spill93011401_17, __call93011401_215(__call93011401_214(__call93011401_212(__call93011401_210(spill93011401_18, __invokedynamic93011401_209(__stackOp93011401_207_1, __stackOp93011401_207_0, __invokedynamic93011401_208(28237, (2113408691531972920L ^ p2)))), __fieldRead93011401_211()), __invokedynamic93011401_213(7371, (6724656160330380738L ^ p2)))));
    return __call93011401_219(__call93011401_218(__call93011401_217(), 1));
    }
    __call93011401_220(p1, life8_474);
    __call93011401_221(p1, life8_474);
    spill93011401_19 = __call93011401_223(__call93011401_222());
    spill93011401_20 = __call93011401_226(__call93011401_224(), __invokedynamic93011401_225(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_228_0 = p5;
    java.lang.String __stackOp93011401_228_1 = __invokedynamic93011401_227(3117, (4522054512387580753L ^ p2));
    __call93011401_237(spill93011401_19, __call93011401_236(__call93011401_235(__call93011401_233(__call93011401_231(spill93011401_20, __invokedynamic93011401_230(__stackOp93011401_228_1, __stackOp93011401_228_0, __invokedynamic93011401_229(14726, (9131655303516739321L ^ p2)))), __fieldRead93011401_232()), __invokedynamic93011401_234(7371, (6724656160330380738L ^ p2)))));
    if (!((p3 != 0))) {
        break forest_join_633;
    }
    if (!((p5 != null))) {
        break forest_join_561;
    }
    forestValue93011401_562_0 = 1;
    break forest_join_562;
    }
    forestValue93011401_562_0 = 0;
    }
    life7_613 = forestValue93011401_562_0;
    if (!((p3 == 0))) {
        break forest_join_600;
    }
    if (!((life7_613 == 0))) {
        break forest_join_597;
    }
    __call93011401_250(__call93011401_239(__call93011401_238()), __call93011401_249(__call93011401_248(__call93011401_246(__call93011401_244(__call93011401_242(__call93011401_240(), __invokedynamic93011401_241(20536, (424159611132002142L ^ p2))), __invokedynamic93011401_243(2557, (6665958636180530819L ^ p2))), __fieldRead93011401_245()), __invokedynamic93011401_247(7371, (6724656160330380738L ^ p2)))));
    return __call93011401_253(__call93011401_252(__call93011401_251(), 1));
    }
    __call93011401_254(p4, p5);
    }
    spill93011401_21 = __call93011401_256(__call93011401_255());
    spill93011401_22 = __call93011401_259(__call93011401_257(), __invokedynamic93011401_258(20536, (424159611132002142L ^ p2)));
    java.lang.String __stackOp93011401_261_0 = p5;
    java.lang.String __stackOp93011401_261_1 = __invokedynamic93011401_260(3117, (4522054512387580753L ^ p2));
    __call93011401_270(spill93011401_21, __call93011401_269(__call93011401_268(__call93011401_266(__call93011401_264(spill93011401_22, __invokedynamic93011401_263(__stackOp93011401_261_1, __stackOp93011401_261_0, __invokedynamic93011401_262(19997, (5688108028426953065L ^ p2)))), __fieldRead93011401_265()), __invokedynamic93011401_267(7371, (6724656160330380738L ^ p2)))));
    }
    return __call93011401_273(__call93011401_272(__call93011401_271(), 1));
}
public static com.moon.dc h900114_2(java.io.IOException p0) throws Throwable {
    throw __call93011402_0(p0);
}
public static com.moon.dc h900114_3(java.io.IOException p0) throws Throwable {
    throw __call93011403_0(p0);
}
public static com.moon.dc h900114_4(java.io.IOException p0) throws Throwable {
    throw __call93011404_0(p0);
}
public static com.moon.dc h900114_5(java.io.IOException p0) throws Throwable {
    throw __call93011405_0(p0);
}
public static com.moon.dc h900114_6(java.io.IOException p0) throws Throwable {
    throw __call93011406_0(p0);
}
public static com.moon.dc h900114_7(java.io.IOException p0) throws Throwable {
    throw __call93011407_0(p0);
}
public static com.moon.dc h900114_8(java.io.IOException p0) throws Throwable {
    throw __call93011408_0(p0);
}
public static com.moon.dc h900114_9(java.io.IOException p0) throws Throwable {
    throw __call93011409_0(p0);
}
public static com.moon.dc h900114_10(java.io.IOException p0) throws Throwable {
    throw __call93011410_0(p0);
}
public static com.moon.dc h900114_11(java.io.IOException p0) throws Throwable {
    throw __call93011411_0(p0);
}
public static com.moon.dc h900114_12(java.io.IOException p0) throws Throwable {
    throw __call93011412_0(p0);
}
public static com.moon.dc h900114_13(java.io.IOException p0) throws Throwable {
    throw __call93011413_0(p0);
}
public static com.moon.dc h900114_14(java.io.IOException p0) throws Throwable {
    throw __call93011414_0(p0);
}
public static com.moon.dc h900114_15(java.io.IOException p0) throws Throwable {
    throw __call93011415_0(p0);
}
public static com.moon.dc h900114_16(java.io.IOException p0) throws Throwable {
    throw __call93011416_0(p0);
}
public static com.moon.dc h900114_17(java.io.IOException p0) throws Throwable {
    throw __call93011417_0(p0);
}
public static com.moon.dc h900114_18(java.io.IOException p0) throws Throwable {
    throw __call93011418_0(p0);
}
public static com.moon.dc h900114_19(java.io.IOException p0) throws Throwable {
    throw __call93011419_0(p0);
}
public static com.moon.dc h900114_20(java.io.IOException p0) throws Throwable {
    throw __call93011420_0(p0);
}
public static com.moon.dc h900114_21(java.io.IOException p0) throws Throwable {
    throw __call93011421_0(p0);
}
public static com.moon.dc h900114_22(java.io.IOException p0) throws Throwable {
    throw __call93011422_0(p0);
}
public static com.moon.dc h900114_23(java.io.IOException p0) throws Throwable {
    throw __call93011423_0(p0);
}
public static com.moon.dc h900114_24(java.io.IOException p0) throws Throwable {
    throw __call93011424_0(p0);
}
public static com.moon.dc h900114_25(java.io.IOException p0) throws Throwable {
    throw __call93011425_0(p0);
}
public static com.moon.dc h900114_26(java.io.IOException p0) throws Throwable {
    throw __call93011426_0(p0);
}
public static com.moon.dc h900114_27(java.io.IOException p0) throws Throwable {
    throw __call93011427_0(p0);
}
private static native long __fieldRead900114_0() throws Throwable;
private static native int __call900114_1() throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_2() throws Throwable;
private static native com.moon.jK __call900114_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.dm __fieldRead900114_4(com.moon.c8 a0) throws Throwable;
private static native java.lang.Object __call900114_5(com.moon.dm a0) throws Throwable;
private static native java.lang.String __cast900114_6(java.lang.Object a0) throws Throwable;
private static native int[] __fieldRead900114_7() throws Throwable;
private static native com.moon.dh __fieldRead900114_8(com.moon.c8 a0) throws Throwable;
private static native java.lang.Object __call900114_9(com.moon.dh a0) throws Throwable;
private static native com.moon.aV __cast900114_10(java.lang.Object a0) throws Throwable;
private static native int __call900114_11(com.moon.aV a0) throws Throwable;
private static native java.awt.Desktop __call900114_12() throws Throwable;
private static native java.io.File __call900114_13(com.moon.jK a0) throws Throwable;
private static native void __call900114_14(java.awt.Desktop a0, java.io.File a1) throws Throwable;
private static native java.util.Map __call900114_15(com.moon.jK a0) throws Throwable;
private static native java.lang.String __invokedynamic900114_16(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call900114_17(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __call900114_18(java.util.Map a0) throws Throwable;
private static native java.lang.StringBuilder __call900114_19(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_20(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call900114_21(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.Collection __call900114_22(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call900114_23(java.util.Collection a0) throws Throwable;
private static native boolean __call900114_24(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900114_25(java.util.Iterator a0) throws Throwable;
private static native com.moon.jI __cast900114_26(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic900114_27(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call900114_28(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900114_29(com.moon.jI a0) throws Throwable;
private static native java.lang.StringBuilder __call900114_30(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call900114_31(java.lang.StringBuilder a0) throws Throwable;
private static native void __call900114_32(java.lang.String a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_33() throws Throwable;
private static native com.moon.hD __call900114_34(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_35() throws Throwable;
private static native java.lang.String __invokedynamic900114_36(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_37(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_38(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_39(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_40() throws Throwable;
private static native com.moon.hB __call900114_41(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_42(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_43(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_44(com.moon.hB a0) throws Throwable;
private static native void __call900114_45(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_46() throws Throwable;
private static native com.moon.dd __call900114_47(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_48(com.moon.dd a0) throws Throwable;
private static native com.moon.jI __call900114_49(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_50() throws Throwable;
private static native com.moon.hD __call900114_51(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_52() throws Throwable;
private static native java.lang.String __invokedynamic900114_53(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_54(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_55(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_57(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_58(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_59(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_60() throws Throwable;
private static native com.moon.hB __call900114_61(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_62(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_63(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_64(com.moon.hB a0) throws Throwable;
private static native void __call900114_65(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_66() throws Throwable;
private static native com.moon.dd __call900114_67(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_68(com.moon.dd a0) throws Throwable;
private static native boolean __call900114_69(com.moon.jI a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_70() throws Throwable;
private static native com.moon.hD __call900114_71(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_72() throws Throwable;
private static native java.lang.String __invokedynamic900114_73(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_74(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_75(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_77(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_78(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_79(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_80() throws Throwable;
private static native com.moon.hB __call900114_81(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_82(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_83(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_84(com.moon.hB a0) throws Throwable;
private static native void __call900114_85(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_86() throws Throwable;
private static native com.moon.dd __call900114_87(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_88(com.moon.dd a0) throws Throwable;
private static native void __call900114_89(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_90() throws Throwable;
private static native com.moon.hD __call900114_91(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_92() throws Throwable;
private static native java.lang.String __invokedynamic900114_93(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_94(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_95(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_97(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_98(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_99(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_100() throws Throwable;
private static native com.moon.hB __call900114_101(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_102(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_103(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_104(com.moon.hB a0) throws Throwable;
private static native void __call900114_105(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_106() throws Throwable;
private static native com.moon.hD __call900114_107(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_108() throws Throwable;
private static native java.lang.String __invokedynamic900114_109(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_110(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_111(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_112(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_113() throws Throwable;
private static native com.moon.hB __call900114_114(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_115(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_116(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_117(com.moon.hB a0) throws Throwable;
private static native void __call900114_118(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_119() throws Throwable;
private static native com.moon.dd __call900114_120(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_121(com.moon.dd a0) throws Throwable;
private static native com.moon.jI __call900114_122(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_123() throws Throwable;
private static native com.moon.hD __call900114_124(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_125() throws Throwable;
private static native java.lang.String __invokedynamic900114_126(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_127(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_128(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_130(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_131(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_132(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_133() throws Throwable;
private static native com.moon.hB __call900114_134(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_135(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_136(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_137(com.moon.hB a0) throws Throwable;
private static native void __call900114_138(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_139() throws Throwable;
private static native com.moon.dd __call900114_140(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_141(com.moon.dd a0) throws Throwable;
private static native boolean __call900114_142(com.moon.jI a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_143() throws Throwable;
private static native com.moon.hD __call900114_144(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_145() throws Throwable;
private static native java.lang.String __invokedynamic900114_146(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_147(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_148(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_150(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_151(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_152(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_153() throws Throwable;
private static native com.moon.hB __call900114_154(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_155(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_156(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_157(com.moon.hB a0) throws Throwable;
private static native void __call900114_158(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_159() throws Throwable;
private static native com.moon.dd __call900114_160(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_161(com.moon.dd a0) throws Throwable;
private static native void __call900114_162(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_163() throws Throwable;
private static native com.moon.hD __call900114_164(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_165() throws Throwable;
private static native java.lang.String __invokedynamic900114_166(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_167(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_168(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_170(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_171(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_172(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_173() throws Throwable;
private static native com.moon.hB __call900114_174(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_175(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_176(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_177(com.moon.hB a0) throws Throwable;
private static native void __call900114_178(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_179() throws Throwable;
private static native com.moon.hD __call900114_180(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_181() throws Throwable;
private static native java.lang.String __invokedynamic900114_182(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_183(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_184(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_185(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_186() throws Throwable;
private static native com.moon.hB __call900114_187(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_188(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_189(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_190(com.moon.hB a0) throws Throwable;
private static native void __call900114_191(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_192() throws Throwable;
private static native com.moon.dd __call900114_193(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_194(com.moon.dd a0) throws Throwable;
private static native com.moon.jI __call900114_195(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_196() throws Throwable;
private static native com.moon.hD __call900114_197(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_198() throws Throwable;
private static native java.lang.String __invokedynamic900114_199(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_200(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_201(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_203(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_204(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_205(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_206() throws Throwable;
private static native com.moon.hB __call900114_207(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_208(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_209(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_210(com.moon.hB a0) throws Throwable;
private static native void __call900114_211(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_212() throws Throwable;
private static native com.moon.dd __call900114_213(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_214(com.moon.dd a0) throws Throwable;
private static native boolean __call900114_215(com.moon.jI a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_216() throws Throwable;
private static native com.moon.hD __call900114_217(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_218() throws Throwable;
private static native java.lang.String __invokedynamic900114_219(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_220(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_221(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_223(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_224(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_225(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_226() throws Throwable;
private static native com.moon.hB __call900114_227(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_228(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_229(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_230(com.moon.hB a0) throws Throwable;
private static native void __call900114_231(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_232() throws Throwable;
private static native com.moon.dd __call900114_233(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_234(com.moon.dd a0) throws Throwable;
private static native void __call900114_235(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native void __call900114_236(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_237() throws Throwable;
private static native com.moon.hD __call900114_238(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_239() throws Throwable;
private static native java.lang.String __invokedynamic900114_240(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_241(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_242(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_244(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_245(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_246(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_247() throws Throwable;
private static native com.moon.hB __call900114_248(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_249(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_250(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_251(com.moon.hB a0) throws Throwable;
private static native void __call900114_252(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_253() throws Throwable;
private static native com.moon.hD __call900114_254(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_255() throws Throwable;
private static native java.lang.String __invokedynamic900114_256(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_257(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_258(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_259(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_260() throws Throwable;
private static native com.moon.hB __call900114_261(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_262(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_263(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_264(com.moon.hB a0) throws Throwable;
private static native void __call900114_265(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_266() throws Throwable;
private static native com.moon.dd __call900114_267(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_268(com.moon.dd a0) throws Throwable;
private static native void __call900114_269(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call900114_270() throws Throwable;
private static native com.moon.hD __call900114_271(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call900114_272() throws Throwable;
private static native java.lang.String __invokedynamic900114_273(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_274(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_275(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_277(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic900114_278(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call900114_279(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead900114_280() throws Throwable;
private static native com.moon.hB __call900114_281(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic900114_282(int a0, long a1) throws Throwable;
private static native com.moon.hB __call900114_283(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call900114_284(com.moon.hB a0) throws Throwable;
private static native void __call900114_285(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call900114_286() throws Throwable;
private static native com.moon.dd __call900114_287(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call900114_288(com.moon.dd a0) throws Throwable;
private static native java.lang.Exception __call93011400_0(java.io.IOException a0) throws Throwable;
private static native java.util.Map __call93011401_0(com.moon.jK a0) throws Throwable;
private static native java.lang.String __invokedynamic93011401_1(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call93011401_2(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __call93011401_3(java.util.Map a0) throws Throwable;
private static native java.lang.StringBuilder __call93011401_4(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_5(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call93011401_6(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.util.Collection __call93011401_7(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call93011401_8(java.util.Collection a0) throws Throwable;
private static native boolean __call93011401_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call93011401_10(java.util.Iterator a0) throws Throwable;
private static native com.moon.jI __cast93011401_11(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic93011401_12(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call93011401_13(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call93011401_14(com.moon.jI a0) throws Throwable;
private static native java.lang.StringBuilder __call93011401_15(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call93011401_16(java.lang.StringBuilder a0) throws Throwable;
private static native void __call93011401_17(java.lang.String a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_18() throws Throwable;
private static native com.moon.hD __call93011401_19(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_20() throws Throwable;
private static native java.lang.String __invokedynamic93011401_21(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_22(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_23(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_24(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_25() throws Throwable;
private static native com.moon.hB __call93011401_26(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_27(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_28(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_29(com.moon.hB a0) throws Throwable;
private static native void __call93011401_30(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_31() throws Throwable;
private static native com.moon.dd __call93011401_32(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_33(com.moon.dd a0) throws Throwable;
private static native com.moon.jI __call93011401_34(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_35() throws Throwable;
private static native com.moon.hD __call93011401_36(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_37() throws Throwable;
private static native java.lang.String __invokedynamic93011401_38(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_39(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_40(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_42(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_43(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_44(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_45() throws Throwable;
private static native com.moon.hB __call93011401_46(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_47(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_48(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_49(com.moon.hB a0) throws Throwable;
private static native void __call93011401_50(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_51() throws Throwable;
private static native com.moon.dd __call93011401_52(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_53(com.moon.dd a0) throws Throwable;
private static native boolean __call93011401_54(com.moon.jI a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_55() throws Throwable;
private static native com.moon.hD __call93011401_56(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_57() throws Throwable;
private static native java.lang.String __invokedynamic93011401_58(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_59(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_60(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_62(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_63(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_64(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_65() throws Throwable;
private static native com.moon.hB __call93011401_66(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_67(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_68(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_69(com.moon.hB a0) throws Throwable;
private static native void __call93011401_70(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_71() throws Throwable;
private static native com.moon.dd __call93011401_72(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_73(com.moon.dd a0) throws Throwable;
private static native void __call93011401_74(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_75() throws Throwable;
private static native com.moon.hD __call93011401_76(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_77() throws Throwable;
private static native java.lang.String __invokedynamic93011401_78(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_79(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_80(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_82(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_83(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_84(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_85() throws Throwable;
private static native com.moon.hB __call93011401_86(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_87(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_88(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_89(com.moon.hB a0) throws Throwable;
private static native void __call93011401_90(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_91() throws Throwable;
private static native com.moon.hD __call93011401_92(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_93() throws Throwable;
private static native java.lang.String __invokedynamic93011401_94(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_95(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_96(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_97(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_98() throws Throwable;
private static native com.moon.hB __call93011401_99(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_100(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_101(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_102(com.moon.hB a0) throws Throwable;
private static native void __call93011401_103(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_104() throws Throwable;
private static native com.moon.dd __call93011401_105(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_106(com.moon.dd a0) throws Throwable;
private static native com.moon.jI __call93011401_107(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_108() throws Throwable;
private static native com.moon.hD __call93011401_109(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_110() throws Throwable;
private static native java.lang.String __invokedynamic93011401_111(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_112(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_113(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_115(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_116(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_117(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_118() throws Throwable;
private static native com.moon.hB __call93011401_119(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_120(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_121(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_122(com.moon.hB a0) throws Throwable;
private static native void __call93011401_123(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_124() throws Throwable;
private static native com.moon.dd __call93011401_125(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_126(com.moon.dd a0) throws Throwable;
private static native boolean __call93011401_127(com.moon.jI a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_128() throws Throwable;
private static native com.moon.hD __call93011401_129(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_130() throws Throwable;
private static native java.lang.String __invokedynamic93011401_131(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_132(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_133(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_135(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_136(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_137(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_138() throws Throwable;
private static native com.moon.hB __call93011401_139(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_140(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_141(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_142(com.moon.hB a0) throws Throwable;
private static native void __call93011401_143(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_144() throws Throwable;
private static native com.moon.dd __call93011401_145(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_146(com.moon.dd a0) throws Throwable;
private static native void __call93011401_147(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_148() throws Throwable;
private static native com.moon.hD __call93011401_149(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_150() throws Throwable;
private static native java.lang.String __invokedynamic93011401_151(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_152(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_153(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_155(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_156(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_157(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_158() throws Throwable;
private static native com.moon.hB __call93011401_159(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_160(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_161(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_162(com.moon.hB a0) throws Throwable;
private static native void __call93011401_163(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_164() throws Throwable;
private static native com.moon.hD __call93011401_165(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_166() throws Throwable;
private static native java.lang.String __invokedynamic93011401_167(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_168(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_169(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_170(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_171() throws Throwable;
private static native com.moon.hB __call93011401_172(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_173(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_174(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_175(com.moon.hB a0) throws Throwable;
private static native void __call93011401_176(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_177() throws Throwable;
private static native com.moon.dd __call93011401_178(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_179(com.moon.dd a0) throws Throwable;
private static native com.moon.jI __call93011401_180(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_181() throws Throwable;
private static native com.moon.hD __call93011401_182(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_183() throws Throwable;
private static native java.lang.String __invokedynamic93011401_184(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_185(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_186(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_188(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_189(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_190(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_191() throws Throwable;
private static native com.moon.hB __call93011401_192(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_193(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_194(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_195(com.moon.hB a0) throws Throwable;
private static native void __call93011401_196(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_197() throws Throwable;
private static native com.moon.dd __call93011401_198(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_199(com.moon.dd a0) throws Throwable;
private static native boolean __call93011401_200(com.moon.jI a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_201() throws Throwable;
private static native com.moon.hD __call93011401_202(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_203() throws Throwable;
private static native java.lang.String __invokedynamic93011401_204(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_205(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_206(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_208(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_209(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_210(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_211() throws Throwable;
private static native com.moon.hB __call93011401_212(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_213(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_214(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_215(com.moon.hB a0) throws Throwable;
private static native void __call93011401_216(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_217() throws Throwable;
private static native com.moon.dd __call93011401_218(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_219(com.moon.dd a0) throws Throwable;
private static native void __call93011401_220(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native void __call93011401_221(com.moon.c8 a0, com.moon.jI a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_222() throws Throwable;
private static native com.moon.hD __call93011401_223(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_224() throws Throwable;
private static native java.lang.String __invokedynamic93011401_225(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_226(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_227(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_229(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_230(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_231(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_232() throws Throwable;
private static native com.moon.hB __call93011401_233(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_234(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_235(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_236(com.moon.hB a0) throws Throwable;
private static native void __call93011401_237(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_238() throws Throwable;
private static native com.moon.hD __call93011401_239(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_240() throws Throwable;
private static native java.lang.String __invokedynamic93011401_241(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_242(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_243(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_244(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_245() throws Throwable;
private static native com.moon.hB __call93011401_246(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_247(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_248(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_249(com.moon.hB a0) throws Throwable;
private static native void __call93011401_250(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_251() throws Throwable;
private static native com.moon.dd __call93011401_252(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_253(com.moon.dd a0) throws Throwable;
private static native void __call93011401_254(com.moon.jK a0, java.lang.String a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call93011401_255() throws Throwable;
private static native com.moon.hD __call93011401_256(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call93011401_257() throws Throwable;
private static native java.lang.String __invokedynamic93011401_258(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_259(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_260(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_262(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic93011401_263(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native com.moon.hB __call93011401_264(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead93011401_265() throws Throwable;
private static native com.moon.hB __call93011401_266(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic93011401_267(int a0, long a1) throws Throwable;
private static native com.moon.hB __call93011401_268(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call93011401_269(com.moon.hB a0) throws Throwable;
private static native void __call93011401_270(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native com.moon.dd __call93011401_271() throws Throwable;
private static native com.moon.dd __call93011401_272(com.moon.dd a0, int a1) throws Throwable;
private static native com.moon.dc __call93011401_273(com.moon.dd a0) throws Throwable;
private static native java.lang.Exception __call93011402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011406_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011407_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011408_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011409_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011410_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011411_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011412_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011413_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011414_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011415_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011416_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011417_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011418_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011419_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011420_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011421_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011422_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011423_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011424_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011425_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011426_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call93011427_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1a6ef68acd0297441923(com.moon.c8 a0, com.moon.jI a1) throws E;
private static final class __SourceHandler_1a6ef68acd0297441923 {

public static void f444(com.moon.c8 receiver, com.moon.jI p0) throws Throwable {
    com.moon.module.Module lexicalValue444_25_0;
    int spill444_0;
    com.moon.module.Module spill444_1;
    long life2_3;
    java.util.Iterator life5_8;
    int life4_9;
    com.moon.module.Module life6_16;
    com.moon.fU life7_38;
    lexical_join_49: {
    lexical_join_38: {
    life2_3 = (__fieldRead444_0() ^ 67631119724360L);
    spill444_0 = __call444_1();
    life5_8 = __call444_3(__call444_2(p0));
    life4_9 = spill444_0;
    lexical_cycle_10: while (true) {
    lexical_join_27: {
    lexical_join_25: {
    if (!(__call444_4(life5_8))) {
        break lexical_join_38;
    }
    life6_16 = __cast444_6(__call444_5(life5_8));
    if (!((life4_9 == 0))) {
        break lexical_join_49;
    }
    spill444_1 = life6_16;
    if (!((life4_9 == 0))) {
        lexicalValue444_25_0 = spill444_1;
        break lexical_join_25;
    }
    if (!(__call444_7(spill444_1))) {
        break lexical_join_27;
    }
    lexicalValue444_25_0 = life6_16;
    }
    __call444_8(lexicalValue444_25_0, 0);
    }
    life7_38 = __call444_10(__call444_9());
    __call444_13(__call444_11(), __invokedynamic444_12(life7_38, life6_16));
    if (!((life4_9 != 0))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    __call444_16(__call444_14(), __invokedynamic444_15());
    __call444_18(__call444_17(p0));
    __call444_19(p0, 0);
    }
    return;
}
public static void h444_0(moom.Oo p0) throws Throwable {
    throw __call1044400_0(p0);
}
public static void h444_1(moom.Oo p0) throws Throwable {
    throw __call1044401_0(p0);
}
public static void h444_2(moom.Oo p0) throws Throwable {
    throw __call1044402_0(p0);
}
private static native long __fieldRead444_0() throws Throwable;
private static native int __call444_1() throws Throwable;
private static native java.util.List __call444_2(com.moon.jI a0) throws Throwable;
private static native java.util.Iterator __call444_3(java.util.List a0) throws Throwable;
private static native boolean __call444_4(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call444_5(java.util.Iterator a0) throws Throwable;
private static native com.moon.module.Module __cast444_6(java.lang.Object a0) throws Throwable;
private static native boolean __call444_7(com.moon.module.Module a0) throws Throwable;
private static native void __call444_8(com.moon.module.Module a0, int a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call444_9() throws Throwable;
private static native com.moon.fU __call444_10(com.moon.runtime.ClientContext a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call444_11() throws Throwable;
private static native java.lang.Runnable __invokedynamic444_12(com.moon.fU a0, com.moon.module.Module a1) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call444_13(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native net.minecraft.client.Minecraft __call444_14() throws Throwable;
private static native java.lang.Runnable __invokedynamic444_15() throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call444_16(net.minecraft.client.Minecraft a0, java.lang.Runnable a1) throws Throwable;
private static native java.util.List __call444_17(com.moon.jI a0) throws Throwable;
private static native void __call444_18(java.util.List a0) throws Throwable;
private static native com.moon.jI __call444_19(com.moon.jI a0, int a1) throws Throwable;
private static native java.lang.Exception __call1044400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1044401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1044402_0(moom.Oo a0) throws Throwable;

}


private static java.lang.String b(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12484);
    if (((com.moon.c8.o)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.c8.p)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c8.p)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/c8", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.c8.k)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.c8.o)[life5_8] = com.moon.c8.b(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.c8.o)[life5_8];
}


private static java.lang.Exception b(java.lang.Exception p0) {
return p0;
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
        byte[] spill105_0 = p0;
        life4_9 += 1;
        life5_44 = (spill105_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill105_1 = p0;
        life4_9 += 1;
        life5_76 = (spill105_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill105_2 = p0;
        life4_9 += 1;
        life5_91 = (spill105_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral760_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.c8.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private void b(com.moon.jI p0) { __sourceHandlerCall_1a6ef68acd0297441923(this, p0); }


private static long c(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14013);
    if (((com.moon.c8.r)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.c8.q)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.c8.s)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.c8.s)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/c8", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.c8.r)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.c8.r)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral763_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/c8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.c8.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.dc a() { return __sourceHandlerCall_20c6f87b0a385ca22e29(this); }


private void a(com.moon.jI p0) {
java.lang.Object local2 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jK();
    ((com.moon.jK)(local2)).a(((com.moon.jI)(p0)));
    ((com.moon.jJ)(((com.moon.jK)(local2)).a())).a(((com.moon.jI)(p0)));
    ((com.moon.ok)(((com.moon.og)(((com.moon.od)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__od())).a__og())).a__ok())).c(((java.lang.String)(((com.moon.jI)(p0)).a())));
    return;
}


private static void lambda$unload$1() {
long life0_3;
    com.moon.fU life2_6;
    com.moon.module.impl.ClickGUI life3_12;
    java.util.List life4_19;
    com.moon.mZ life5_23;
    life0_3 = (com.moon.c8.i ^ 27698146201285L);
    life2_6 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU();
    life3_12 = ((com.moon.module.impl.ClickGUI)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.ClickGUI.class)))));
    if ((((com.moon.module.impl.ClickGUI)(life3_12)).a__pj() != null)) {
        life4_19 = ((com.moon.fU)(life2_6)).a(((com.moon.module.ModuleCategory)(com.moon.module.ModuleCategory.SCRIPTS)));
        life5_23 = ((com.moon.pj)(((com.moon.module.impl.ClickGUI)(life3_12)).a__pj())).a__mZ();
        ((java.util.List)(((com.moon.mZ)(life5_23)).a__List())).clear();
        ((java.util.List)(((com.moon.mZ)(life5_23)).a__List())).addAll(((java.util.Collection)(life4_19)));
        ((com.moon.mZ)(life5_23)).a__Void();
    }
    return;
}


private static void lambda$unload$0(com.moon.fU p0, com.moon.module.Module p1) {
((com.moon.fU)(p0)).b(((com.moon.module.Module)(p1)));
    ((com.moon.cX)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cX())).b(((com.moon.cZ)(p1)));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_abf8a5ce1aa3c155_originalDynamicSite719_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral760_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral763_0() throws E;
}
