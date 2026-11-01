package com.moon;


public class jW extends com.moon.jN {

private com.moon.j5 c;

private static long d;

private static java.lang.String[] e;

private static java.lang.String[] f;

private static java.util.Map g;

public jW() { super((java.lang.String)null); }

private static void __sourceConstructorBody_e083d7384f134afe(com.moon.jW receiver) throws Throwable {
long local1 = (com.moon.jW.d ^ 43995966754143L);
    com.moon.jW.__sourceConstructorInit_e083d7384f134afe_0(((com.moon.jW)(receiver)), ((java.lang.String)(__sourceIntrinsic_e083d7384f134afe_originalDynamicSite1098_1(4957, (1711812357825841932L ^ local1)))));
    ((com.moon.jW)(receiver)).c = ((com.moon.j5)(new com.moon.j5()));
    return;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(872547085169415044L)), ((long)(-337646441258013247L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(157248901367544L)))));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.jW.d ^ 23192275459924L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill193_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill193_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill193_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill193_14 = new byte[8];
    (__sourceSpill193_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill193_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation193_16 = __sourceSpill193_14;
    ((javax.crypto.Cipher)(__sourceSpill193_11)).init(((int)(__sourceSpill193_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill193_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation193_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local9_life19 = new java.lang.String[40];
    int local7_life20 = 0;
    java.lang.String local6_life21;
    int local8_life23 = ((java.lang.String)((local6_life21 = "ê¡­\t\000EJöÆ[os9uÉCc¯\177¤\001 SRq;¨üg°\002§/á «÷²3\f­a?o´YVí¢\013Æ \022QH\nõOp ­Þf@ô6ßG¢\037v\007¼oÖ\177\037Åt \027\035RÖü±\034´\tÂ÷?\000]ßñs\034pómþåI5 s-­q Ù\026\025Àº#!ãï¥nf´¨Åøi_ããôV^B/]'\020»\020qà¨7ç.\021ùô\025¹\004(Ïnx6^ôßÑ£O\b}¨j\\Ý÷Þ\"|=QC\036Àâã>ËlÅÄ\013ê·Bîù¥\020Ø\0139\bAýÉèX#+³F= \024)[\030¹¥ð½Ü¨Ý:#}/\032\004ã\007fåû`N¿Ø¤ýo \rHÎøÿf÷xÜ\\©ó¼Ýg·~¬Ó.ìÛXcv%Êz\004 Ú\006ÞO\034\fìÄ¤Ä9¸úC\022É=øè\037#7\037;\\¿(ýgPsÓé#×o,\026\003\033\032©ÈEU²:Å4»Ý+ðÛê¢¸ÿ\020<Î»Æ\006îÉ\037iïyÍ3,ø 3Ãuèø*\021I0YÎ{×Q\005H&\007»ª<H\021~\036\rßñ¦H\030<\002Ê#\006\002ß>Þ\021ÞË¯Õ§#æB}¹ê8\017\020\027_p\025\017\004]\003%%h©d8µ¿ -{ÿzè@ÔaQ\\#û\032Èù\023Á×Ó¢ño\001x[Zr(\020Æ\r\005gÅ)7xñü¶ÆoWEOöb®Cÿv\032pÛ%[ïqe%¸)Î~\001\030û¸'4\001ÉG·Çb|ì-j¢ãt×ël\177ß Ñ6b½´c°¬\000\033(fp\003\005ñ`±2øÏ#¾R\177\025 .e\020ÃN*\026\022£CÎ?`à*bJÁs¶ø\037§ßRÅÎ(¨\013 ÜÝàÝ¯\021_2¿-±\fË¿\037ÖÒPZ\1775^äQ¥?q\005\016¯¹Üâï(:\026L~d\023Özª\031áÌÝ5E\024È/ªè¨rì7\003!ðµÊd¥qòFÐIÎ\024 9÷Ô\003Ô5eèç+~ÙÈ5÷pÖ>\016æÙ@vlÿ\022x(±/ÔvG Å\037B§\034[Xn\177`\037)Ì_\0261&VÎì.ËT¢ \"*« b\\Ú0+ôéÄaâÊ\032L`ªrGñï7¨Ã\013GM\002Å\013\005ð\030#DUg\016U»K­\034¥\002\034è³ä\002\000£_mg \002a£D%)\002;¥3ßì2dµULyÅ!`g2\tø 9T($·@Þ\013à\003d\023ý½fù`s\b¤{ ¡Ö~:b\fçÉI°u1á5\022¯\t\036ñ\030\002Ð\033\033,D×®:/ÙtãÃáÞ»P<(h`>T?e½üj44Ä\006t÷Á×¢d`û½Z\037\031úÃ«¬\034BÁXPv-*h ¾uüM\001ª\\Ïù¨#3\021mÖm¤QP\036lÇ\005\037\005Dr×J\030 Z4\000±¿´\nPô'w°èG\003t$¤\0166(ß\021\007\035\007×DgØØóØ\001\027òâ¦8õñ¡t~æQ+ñV\025wØª\006òXâ?ø\f ìB\bz&O$ßAh²Ó9ze\nüþ\033ë\0036#ª=~\030éQbï.ú¥º¶\021-\000\027@\001Ï?úãT\007/ 'Þ=©\034QÑ\r\032~nÐZèûI§Ø,A·Ò@Ætä ß\021+×³¹J¶D\000>ñDCVk3ª=1åîß@Ôt8"))).length();
    int local5_life24 = 24;
    int local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill193_28 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill193_29 = local2_life9;
        byte[] local10_life31 = ((javax.crypto.Cipher)(__sourceSpill193_29)).doFinal(((byte[])(__sourceSpill193_28)));
        java.lang.String __sourceSpill193_34 = ((java.lang.String)(com.moon.jW.a(((byte[])(local10_life31))))).intern();
        java.lang.String[] __sourceSpill193_35 = local9_life19;
        int __sourceSpill193_36 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill193_35)[__sourceSpill193_36] = __sourceSpill193_34;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    local8_life23 = ((java.lang.String)((local6_life21 = "eâAÞß\016í,¢ã|3g\rK0%\004÷\020\001õ\030ø¡%;ÁGïV\032¥¼ ¨\\7Æ:T«AS§"))).length();
    local5_life24 = 24;
    local4_life25 = -1;
    while (true) {
        local4_life25 += 1;
        byte[] __sourceSpill193_41 = ((java.lang.String)(((java.lang.String)(local6_life21)).substring(((int)(local4_life25)), ((int)((local4_life25 + local5_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill193_42 = local2_life9;
        byte[] local10_life44 = ((javax.crypto.Cipher)(__sourceSpill193_42)).doFinal(((byte[])(__sourceSpill193_41)));
        java.lang.String __sourceSpill193_47 = ((java.lang.String)(com.moon.jW.a(((byte[])(local10_life44))))).intern();
        java.lang.String[] __sourceSpill193_48 = local9_life19;
        int __sourceSpill193_49 = local7_life20;
        local7_life20 += 1;
        (__sourceSpill193_48)[__sourceSpill193_49] = __sourceSpill193_47;
        if (!(((local4_life25 = (local4_life25 + local5_life24)) < local8_life23))) { break; }
        local5_life24 = ((java.lang.String)(local6_life21)).charAt(((int)(local4_life25)));
    }
    e = ((java.lang.String[])(local9_life19));
    f = ((java.lang.String[])(new java.lang.String[40]));
}

private static native <E extends Throwable> void __sourceConstructorInit_e083d7384f134afe_0(com.moon.jW a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_5d78387a2bcf990be1c9(com.moon.jW a0, org.luaj.vm2.LuaTable a1) throws E;
private static final class __SourceHandler_5d78387a2bcf990be1c9 {

public static void f99(com.moon.jW receiver, org.luaj.vm2.LuaTable p0) throws Throwable {
    org.luaj.vm2.LuaTable spill99_0;
    java.lang.String spill99_1;
    com.moon.qa spill99_2;
    org.luaj.vm2.LuaTable spill99_3;
    java.lang.String spill99_4;
    com.moon.qN spill99_5;
    org.luaj.vm2.LuaTable spill99_6;
    java.lang.String spill99_7;
    com.moon.qv spill99_8;
    org.luaj.vm2.LuaTable spill99_9;
    java.lang.String spill99_10;
    com.moon.sz spill99_11;
    org.luaj.vm2.LuaTable spill99_12;
    java.lang.String spill99_13;
    com.moon.sA spill99_14;
    org.luaj.vm2.LuaTable spill99_15;
    java.lang.String spill99_16;
    com.moon.qD spill99_17;
    org.luaj.vm2.LuaTable spill99_18;
    java.lang.String spill99_19;
    com.moon.qE spill99_20;
    org.luaj.vm2.LuaTable spill99_21;
    java.lang.String spill99_22;
    com.moon.qF spill99_23;
    org.luaj.vm2.LuaTable spill99_24;
    java.lang.String spill99_25;
    com.moon.qG spill99_26;
    org.luaj.vm2.LuaTable spill99_27;
    java.lang.String spill99_28;
    com.moon.qb spill99_29;
    org.luaj.vm2.LuaTable spill99_30;
    java.lang.String spill99_31;
    com.moon.qc spill99_32;
    org.luaj.vm2.LuaTable spill99_33;
    java.lang.String spill99_34;
    com.moon.qd spill99_35;
    int spill99_36;
    org.luaj.vm2.LuaTable spill99_37;
    java.lang.String spill99_38;
    com.moon.qe spill99_39;
    org.luaj.vm2.LuaTable spill99_40;
    java.lang.String spill99_41;
    com.moon.qf spill99_42;
    org.luaj.vm2.LuaTable spill99_43;
    java.lang.String spill99_44;
    com.moon.qg spill99_45;
    org.luaj.vm2.LuaTable spill99_46;
    java.lang.String spill99_47;
    com.moon.qh spill99_48;
    org.luaj.vm2.LuaTable spill99_49;
    java.lang.String spill99_50;
    com.moon.qi spill99_51;
    org.luaj.vm2.LuaTable spill99_52;
    java.lang.String spill99_53;
    com.moon.qj spill99_54;
    org.luaj.vm2.LuaTable spill99_55;
    java.lang.String spill99_56;
    com.moon.qk spill99_57;
    org.luaj.vm2.LuaTable spill99_58;
    java.lang.String spill99_59;
    com.moon.ql spill99_60;
    org.luaj.vm2.LuaTable spill99_61;
    java.lang.String spill99_62;
    com.moon.qm spill99_63;
    org.luaj.vm2.LuaTable spill99_64;
    java.lang.String spill99_65;
    com.moon.qn spill99_66;
    org.luaj.vm2.LuaTable spill99_67;
    java.lang.String spill99_68;
    com.moon.qo spill99_69;
    org.luaj.vm2.LuaTable spill99_70;
    java.lang.String spill99_71;
    com.moon.qp spill99_72;
    org.luaj.vm2.LuaTable spill99_73;
    java.lang.String spill99_74;
    com.moon.qq spill99_75;
    org.luaj.vm2.LuaTable spill99_76;
    java.lang.String spill99_77;
    com.moon.qr spill99_78;
    org.luaj.vm2.LuaTable spill99_79;
    java.lang.String spill99_80;
    com.moon.qs spill99_81;
    org.luaj.vm2.LuaTable spill99_82;
    java.lang.String spill99_83;
    com.moon.qt spill99_84;
    org.luaj.vm2.LuaTable spill99_85;
    java.lang.String spill99_86;
    com.moon.qu spill99_87;
    org.luaj.vm2.LuaTable spill99_88;
    java.lang.String spill99_89;
    com.moon.qw spill99_90;
    org.luaj.vm2.LuaTable spill99_91;
    java.lang.String spill99_92;
    com.moon.qx spill99_93;
    org.luaj.vm2.LuaTable spill99_94;
    java.lang.String spill99_95;
    com.moon.qy spill99_96;
    org.luaj.vm2.LuaTable spill99_97;
    java.lang.String spill99_98;
    com.moon.qz spill99_99;
    org.luaj.vm2.LuaTable spill99_100;
    java.lang.String spill99_101;
    com.moon.qA spill99_102;
    org.luaj.vm2.LuaTable spill99_103;
    java.lang.String spill99_104;
    com.moon.qB spill99_105;
    org.luaj.vm2.LuaTable spill99_106;
    java.lang.String spill99_107;
    com.moon.qC spill99_108;
    org.luaj.vm2.LuaTable spill99_109;
    java.lang.String spill99_110;
    com.moon.qU spill99_111;
    org.luaj.vm2.LuaTable spill99_112;
    java.lang.String spill99_113;
    com.moon.qV spill99_114;
    org.luaj.vm2.LuaTable spill99_115;
    java.lang.String spill99_116;
    com.moon.sy spill99_117;
    long life2_3;
    int life4_236;
    forest_join_440: {
    life2_3 = (__fieldRead99_0() ^ 134527165168714L);
    spill99_0 = p0;
    spill99_1 = __invokedynamic99_1(19363, (397382593804575469L ^ life2_3));
    com.moon.qa __stackOp99_3_0 = __sourceUninitializedNEW99_2();
    spill99_2 = __stackOp99_3_0;
    __explicitNewInit99_4(__stackOp99_3_0, receiver);
    __call99_5(spill99_0, spill99_1, spill99_2);
    spill99_3 = p0;
    spill99_4 = __invokedynamic99_6(1163, (4876381461589814749L ^ life2_3));
    com.moon.qN __stackOp99_8_0 = __sourceUninitializedNEW99_7();
    spill99_5 = __stackOp99_8_0;
    __explicitNewInit99_9(__stackOp99_8_0, receiver);
    __call99_10(spill99_3, spill99_4, spill99_5);
    spill99_6 = p0;
    spill99_7 = __invokedynamic99_11(31988, (5077324672684922291L ^ life2_3));
    com.moon.qv __stackOp99_13_0 = __sourceUninitializedNEW99_12();
    spill99_8 = __stackOp99_13_0;
    __explicitNewInit99_14(__stackOp99_13_0, receiver);
    __call99_15(spill99_6, spill99_7, spill99_8);
    spill99_9 = p0;
    spill99_10 = __invokedynamic99_16(22673, (7426905252896551364L ^ life2_3));
    com.moon.sz __stackOp99_18_0 = __sourceUninitializedNEW99_17();
    spill99_11 = __stackOp99_18_0;
    __explicitNewInit99_19(__stackOp99_18_0, receiver);
    __call99_20(spill99_9, spill99_10, spill99_11);
    spill99_12 = p0;
    spill99_13 = __invokedynamic99_21(24393, (6626194610324223509L ^ life2_3));
    com.moon.sA __stackOp99_23_0 = __sourceUninitializedNEW99_22();
    spill99_14 = __stackOp99_23_0;
    __explicitNewInit99_24(__stackOp99_23_0, receiver);
    __call99_25(spill99_12, spill99_13, spill99_14);
    spill99_15 = p0;
    spill99_16 = __invokedynamic99_26(2832, (4194142858505052791L ^ life2_3));
    com.moon.qD __stackOp99_28_0 = __sourceUninitializedNEW99_27();
    spill99_17 = __stackOp99_28_0;
    __explicitNewInit99_29(__stackOp99_28_0, receiver);
    __call99_30(spill99_15, spill99_16, spill99_17);
    spill99_18 = p0;
    spill99_19 = __invokedynamic99_31(15748, (8542335855628408016L ^ life2_3));
    com.moon.qE __stackOp99_33_0 = __sourceUninitializedNEW99_32();
    spill99_20 = __stackOp99_33_0;
    __explicitNewInit99_34(__stackOp99_33_0, receiver);
    __call99_35(spill99_18, spill99_19, spill99_20);
    spill99_21 = p0;
    spill99_22 = __invokedynamic99_36(10422, (1216884788439204342L ^ life2_3));
    com.moon.qF __stackOp99_38_0 = __sourceUninitializedNEW99_37();
    spill99_23 = __stackOp99_38_0;
    __explicitNewInit99_39(__stackOp99_38_0, receiver);
    __call99_40(spill99_21, spill99_22, spill99_23);
    spill99_24 = p0;
    spill99_25 = __invokedynamic99_41(18840, (6149131127231127749L ^ life2_3));
    com.moon.qG __stackOp99_43_0 = __sourceUninitializedNEW99_42();
    spill99_26 = __stackOp99_43_0;
    __explicitNewInit99_44(__stackOp99_43_0, receiver);
    __call99_45(spill99_24, spill99_25, spill99_26);
    spill99_27 = p0;
    spill99_28 = __invokedynamic99_46(28751, (7076637385054427422L ^ life2_3));
    com.moon.qb __stackOp99_48_0 = __sourceUninitializedNEW99_47();
    spill99_29 = __stackOp99_48_0;
    __explicitNewInit99_49(__stackOp99_48_0, receiver);
    __call99_50(spill99_27, spill99_28, spill99_29);
    spill99_30 = p0;
    spill99_31 = __invokedynamic99_51(7770, (7446155133670913819L ^ life2_3));
    com.moon.qc __stackOp99_53_0 = __sourceUninitializedNEW99_52();
    spill99_32 = __stackOp99_53_0;
    __explicitNewInit99_54(__stackOp99_53_0, receiver);
    __call99_55(spill99_30, spill99_31, spill99_32);
    spill99_33 = p0;
    spill99_34 = __invokedynamic99_56(3931, (1702512410951247383L ^ life2_3));
    com.moon.qd __stackOp99_58_0 = __sourceUninitializedNEW99_57();
    spill99_35 = __stackOp99_58_0;
    __explicitNewInit99_59(__stackOp99_58_0, receiver);
    __call99_60(spill99_33, spill99_34, spill99_35);
    spill99_36 = __call99_61();
    spill99_37 = p0;
    spill99_38 = __invokedynamic99_62(26960, (4966039173001936945L ^ life2_3));
    com.moon.qe __stackOp99_64_0 = __sourceUninitializedNEW99_63();
    spill99_39 = __stackOp99_64_0;
    __explicitNewInit99_65(__stackOp99_64_0, receiver);
    __call99_66(spill99_37, spill99_38, spill99_39);
    spill99_40 = p0;
    spill99_41 = __invokedynamic99_67(12756, (4879464891959990415L ^ life2_3));
    com.moon.qf __stackOp99_69_0 = __sourceUninitializedNEW99_68();
    spill99_42 = __stackOp99_69_0;
    __explicitNewInit99_70(__stackOp99_69_0, receiver);
    __call99_71(spill99_40, spill99_41, spill99_42);
    spill99_43 = p0;
    spill99_44 = __invokedynamic99_72(10291, (242953397413953905L ^ life2_3));
    com.moon.qg __stackOp99_74_0 = __sourceUninitializedNEW99_73();
    spill99_45 = __stackOp99_74_0;
    __explicitNewInit99_75(__stackOp99_74_0, receiver);
    __call99_76(spill99_43, spill99_44, spill99_45);
    spill99_46 = p0;
    spill99_47 = __invokedynamic99_77(28926, (6168988939116812721L ^ life2_3));
    com.moon.qh __stackOp99_79_0 = __sourceUninitializedNEW99_78();
    spill99_48 = __stackOp99_79_0;
    __explicitNewInit99_80(__stackOp99_79_0, receiver);
    __call99_81(spill99_46, spill99_47, spill99_48);
    spill99_49 = p0;
    spill99_50 = __invokedynamic99_82(9093, (8267334804034013920L ^ life2_3));
    com.moon.qi __stackOp99_84_0 = __sourceUninitializedNEW99_83();
    spill99_51 = __stackOp99_84_0;
    __explicitNewInit99_85(__stackOp99_84_0, receiver);
    __call99_86(spill99_49, spill99_50, spill99_51);
    spill99_52 = p0;
    spill99_53 = __invokedynamic99_87(21876, (625535740910615602L ^ life2_3));
    com.moon.qj __stackOp99_89_0 = __sourceUninitializedNEW99_88();
    spill99_54 = __stackOp99_89_0;
    __explicitNewInit99_90(__stackOp99_89_0, receiver);
    __call99_91(spill99_52, spill99_53, spill99_54);
    spill99_55 = p0;
    spill99_56 = __invokedynamic99_92(4699, (7988746060754221848L ^ life2_3));
    com.moon.qk __stackOp99_94_0 = __sourceUninitializedNEW99_93();
    spill99_57 = __stackOp99_94_0;
    __explicitNewInit99_95(__stackOp99_94_0, receiver);
    __call99_96(spill99_55, spill99_56, spill99_57);
    spill99_58 = p0;
    spill99_59 = __invokedynamic99_97(7019, (7636751436383384116L ^ life2_3));
    com.moon.ql __stackOp99_99_0 = __sourceUninitializedNEW99_98();
    spill99_60 = __stackOp99_99_0;
    __explicitNewInit99_100(__stackOp99_99_0, receiver);
    __call99_101(spill99_58, spill99_59, spill99_60);
    spill99_61 = p0;
    spill99_62 = __invokedynamic99_102(4200, (4234859094964140320L ^ life2_3));
    com.moon.qm __stackOp99_104_0 = __sourceUninitializedNEW99_103();
    spill99_63 = __stackOp99_104_0;
    __explicitNewInit99_105(__stackOp99_104_0, receiver);
    __call99_106(spill99_61, spill99_62, spill99_63);
    life4_236 = spill99_36;
    spill99_64 = p0;
    spill99_65 = __invokedynamic99_107(28763, (7637646987370371350L ^ life2_3));
    com.moon.qn __stackOp99_109_0 = __sourceUninitializedNEW99_108();
    spill99_66 = __stackOp99_109_0;
    __explicitNewInit99_110(__stackOp99_109_0, receiver);
    __call99_111(spill99_64, spill99_65, spill99_66);
    spill99_67 = p0;
    spill99_68 = __invokedynamic99_112(9802, (8870487430533664515L ^ life2_3));
    com.moon.qo __stackOp99_114_0 = __sourceUninitializedNEW99_113();
    spill99_69 = __stackOp99_114_0;
    __explicitNewInit99_115(__stackOp99_114_0, receiver);
    __call99_116(spill99_67, spill99_68, spill99_69);
    spill99_70 = p0;
    spill99_71 = __invokedynamic99_117(30422, (4022377403911446452L ^ life2_3));
    com.moon.qp __stackOp99_119_0 = __sourceUninitializedNEW99_118();
    spill99_72 = __stackOp99_119_0;
    __explicitNewInit99_120(__stackOp99_119_0, receiver);
    __call99_121(spill99_70, spill99_71, spill99_72);
    spill99_73 = p0;
    spill99_74 = __invokedynamic99_122(27571, (835851702488302293L ^ life2_3));
    com.moon.qq __stackOp99_124_0 = __sourceUninitializedNEW99_123();
    spill99_75 = __stackOp99_124_0;
    __explicitNewInit99_125(__stackOp99_124_0, receiver);
    __call99_126(spill99_73, spill99_74, spill99_75);
    spill99_76 = p0;
    spill99_77 = __invokedynamic99_127(22484, (1841261082598719118L ^ life2_3));
    com.moon.qr __stackOp99_129_0 = __sourceUninitializedNEW99_128();
    spill99_78 = __stackOp99_129_0;
    __explicitNewInit99_130(__stackOp99_129_0, receiver);
    __call99_131(spill99_76, spill99_77, spill99_78);
    spill99_79 = p0;
    spill99_80 = __invokedynamic99_132(31202, (596425004158062780L ^ life2_3));
    com.moon.qs __stackOp99_134_0 = __sourceUninitializedNEW99_133();
    spill99_81 = __stackOp99_134_0;
    __explicitNewInit99_135(__stackOp99_134_0, receiver);
    __call99_136(spill99_79, spill99_80, spill99_81);
    spill99_82 = p0;
    spill99_83 = __invokedynamic99_137(9155, (3669777361681795744L ^ life2_3));
    com.moon.qt __stackOp99_139_0 = __sourceUninitializedNEW99_138();
    spill99_84 = __stackOp99_139_0;
    __explicitNewInit99_140(__stackOp99_139_0, receiver);
    __call99_141(spill99_82, spill99_83, spill99_84);
    spill99_85 = p0;
    spill99_86 = __invokedynamic99_142(13671, (1241714504819727412L ^ life2_3));
    com.moon.qu __stackOp99_144_0 = __sourceUninitializedNEW99_143();
    spill99_87 = __stackOp99_144_0;
    __explicitNewInit99_145(__stackOp99_144_0, receiver);
    __call99_146(spill99_85, spill99_86, spill99_87);
    spill99_88 = p0;
    spill99_89 = __invokedynamic99_147(20172, (1502565311057733511L ^ life2_3));
    com.moon.qw __stackOp99_149_0 = __sourceUninitializedNEW99_148();
    spill99_90 = __stackOp99_149_0;
    __explicitNewInit99_150(__stackOp99_149_0, receiver);
    __call99_151(spill99_88, spill99_89, spill99_90);
    spill99_91 = p0;
    spill99_92 = __invokedynamic99_152(28154, (8680007417737020578L ^ life2_3));
    com.moon.qx __stackOp99_154_0 = __sourceUninitializedNEW99_153();
    spill99_93 = __stackOp99_154_0;
    __explicitNewInit99_155(__stackOp99_154_0, receiver);
    __call99_156(spill99_91, spill99_92, spill99_93);
    spill99_94 = p0;
    spill99_95 = __invokedynamic99_157(10077, (8856789589839662602L ^ life2_3));
    com.moon.qy __stackOp99_159_0 = __sourceUninitializedNEW99_158();
    spill99_96 = __stackOp99_159_0;
    __explicitNewInit99_160(__stackOp99_159_0, receiver);
    __call99_161(spill99_94, spill99_95, spill99_96);
    spill99_97 = p0;
    spill99_98 = __invokedynamic99_162(30062, (7280398544432471054L ^ life2_3));
    com.moon.qz __stackOp99_164_0 = __sourceUninitializedNEW99_163();
    spill99_99 = __stackOp99_164_0;
    __explicitNewInit99_165(__stackOp99_164_0, receiver);
    __call99_166(spill99_97, spill99_98, spill99_99);
    spill99_100 = p0;
    spill99_101 = __invokedynamic99_167(28578, (944644933515380456L ^ life2_3));
    com.moon.qA __stackOp99_169_0 = __sourceUninitializedNEW99_168();
    spill99_102 = __stackOp99_169_0;
    __explicitNewInit99_170(__stackOp99_169_0, receiver);
    __call99_171(spill99_100, spill99_101, spill99_102);
    spill99_103 = p0;
    spill99_104 = __invokedynamic99_172(17319, (6100332542712359678L ^ life2_3));
    com.moon.qB __stackOp99_174_0 = __sourceUninitializedNEW99_173();
    spill99_105 = __stackOp99_174_0;
    __explicitNewInit99_175(__stackOp99_174_0, receiver);
    __call99_176(spill99_103, spill99_104, spill99_105);
    spill99_106 = p0;
    spill99_107 = __invokedynamic99_177(26357, (8728294184987037605L ^ life2_3));
    com.moon.qC __stackOp99_179_0 = __sourceUninitializedNEW99_178();
    spill99_108 = __stackOp99_179_0;
    __explicitNewInit99_180(__stackOp99_179_0, receiver);
    __call99_181(spill99_106, spill99_107, spill99_108);
    spill99_109 = p0;
    spill99_110 = __invokedynamic99_182(6979, (3590874907290563078L ^ life2_3));
    com.moon.qU __stackOp99_184_0 = __sourceUninitializedNEW99_183();
    spill99_111 = __stackOp99_184_0;
    __explicitNewInit99_185(__stackOp99_184_0, receiver);
    __call99_186(spill99_109, spill99_110, spill99_111);
    spill99_112 = p0;
    spill99_113 = __invokedynamic99_187(1764, (3769966166754586496L ^ life2_3));
    com.moon.qV __stackOp99_189_0 = __sourceUninitializedNEW99_188();
    spill99_114 = __stackOp99_189_0;
    __explicitNewInit99_190(__stackOp99_189_0, receiver);
    __call99_191(spill99_112, spill99_113, spill99_114);
    spill99_115 = p0;
    spill99_116 = __invokedynamic99_192(3154, (1061223378498938112L ^ life2_3));
    com.moon.sy __stackOp99_194_0 = __sourceUninitializedNEW99_193();
    spill99_117 = __stackOp99_194_0;
    __explicitNewInit99_195(__stackOp99_194_0, receiver);
    __call99_196(spill99_115, spill99_116, spill99_117);
    if (!((__call99_197() != null))) {
        break forest_join_440;
    }
    life4_236 += 1;
    __call99_198(life4_236);
    }
    return;
}
private static native long __fieldRead99_0() throws Throwable;
private static native java.lang.String __invokedynamic99_1(int a0, long a1) throws Throwable;
private static native com.moon.qa __sourceUninitializedNEW99_2() throws Throwable;
private static native void __explicitNewInit99_4(com.moon.qa a0, com.moon.jW a1) throws Throwable;
private static native void __call99_5(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qa a2) throws Throwable;
private static native java.lang.String __invokedynamic99_6(int a0, long a1) throws Throwable;
private static native com.moon.qN __sourceUninitializedNEW99_7() throws Throwable;
private static native void __explicitNewInit99_9(com.moon.qN a0, com.moon.jW a1) throws Throwable;
private static native void __call99_10(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qN a2) throws Throwable;
private static native java.lang.String __invokedynamic99_11(int a0, long a1) throws Throwable;
private static native com.moon.qv __sourceUninitializedNEW99_12() throws Throwable;
private static native void __explicitNewInit99_14(com.moon.qv a0, com.moon.jW a1) throws Throwable;
private static native void __call99_15(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qv a2) throws Throwable;
private static native java.lang.String __invokedynamic99_16(int a0, long a1) throws Throwable;
private static native com.moon.sz __sourceUninitializedNEW99_17() throws Throwable;
private static native void __explicitNewInit99_19(com.moon.sz a0, com.moon.jW a1) throws Throwable;
private static native void __call99_20(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.sz a2) throws Throwable;
private static native java.lang.String __invokedynamic99_21(int a0, long a1) throws Throwable;
private static native com.moon.sA __sourceUninitializedNEW99_22() throws Throwable;
private static native void __explicitNewInit99_24(com.moon.sA a0, com.moon.jW a1) throws Throwable;
private static native void __call99_25(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.sA a2) throws Throwable;
private static native java.lang.String __invokedynamic99_26(int a0, long a1) throws Throwable;
private static native com.moon.qD __sourceUninitializedNEW99_27() throws Throwable;
private static native void __explicitNewInit99_29(com.moon.qD a0, com.moon.jW a1) throws Throwable;
private static native void __call99_30(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qD a2) throws Throwable;
private static native java.lang.String __invokedynamic99_31(int a0, long a1) throws Throwable;
private static native com.moon.qE __sourceUninitializedNEW99_32() throws Throwable;
private static native void __explicitNewInit99_34(com.moon.qE a0, com.moon.jW a1) throws Throwable;
private static native void __call99_35(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qE a2) throws Throwable;
private static native java.lang.String __invokedynamic99_36(int a0, long a1) throws Throwable;
private static native com.moon.qF __sourceUninitializedNEW99_37() throws Throwable;
private static native void __explicitNewInit99_39(com.moon.qF a0, com.moon.jW a1) throws Throwable;
private static native void __call99_40(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qF a2) throws Throwable;
private static native java.lang.String __invokedynamic99_41(int a0, long a1) throws Throwable;
private static native com.moon.qG __sourceUninitializedNEW99_42() throws Throwable;
private static native void __explicitNewInit99_44(com.moon.qG a0, com.moon.jW a1) throws Throwable;
private static native void __call99_45(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qG a2) throws Throwable;
private static native java.lang.String __invokedynamic99_46(int a0, long a1) throws Throwable;
private static native com.moon.qb __sourceUninitializedNEW99_47() throws Throwable;
private static native void __explicitNewInit99_49(com.moon.qb a0, com.moon.jW a1) throws Throwable;
private static native void __call99_50(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qb a2) throws Throwable;
private static native java.lang.String __invokedynamic99_51(int a0, long a1) throws Throwable;
private static native com.moon.qc __sourceUninitializedNEW99_52() throws Throwable;
private static native void __explicitNewInit99_54(com.moon.qc a0, com.moon.jW a1) throws Throwable;
private static native void __call99_55(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qc a2) throws Throwable;
private static native java.lang.String __invokedynamic99_56(int a0, long a1) throws Throwable;
private static native com.moon.qd __sourceUninitializedNEW99_57() throws Throwable;
private static native void __explicitNewInit99_59(com.moon.qd a0, com.moon.jW a1) throws Throwable;
private static native void __call99_60(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qd a2) throws Throwable;
private static native int __call99_61() throws Throwable;
private static native java.lang.String __invokedynamic99_62(int a0, long a1) throws Throwable;
private static native com.moon.qe __sourceUninitializedNEW99_63() throws Throwable;
private static native void __explicitNewInit99_65(com.moon.qe a0, com.moon.jW a1) throws Throwable;
private static native void __call99_66(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qe a2) throws Throwable;
private static native java.lang.String __invokedynamic99_67(int a0, long a1) throws Throwable;
private static native com.moon.qf __sourceUninitializedNEW99_68() throws Throwable;
private static native void __explicitNewInit99_70(com.moon.qf a0, com.moon.jW a1) throws Throwable;
private static native void __call99_71(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qf a2) throws Throwable;
private static native java.lang.String __invokedynamic99_72(int a0, long a1) throws Throwable;
private static native com.moon.qg __sourceUninitializedNEW99_73() throws Throwable;
private static native void __explicitNewInit99_75(com.moon.qg a0, com.moon.jW a1) throws Throwable;
private static native void __call99_76(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qg a2) throws Throwable;
private static native java.lang.String __invokedynamic99_77(int a0, long a1) throws Throwable;
private static native com.moon.qh __sourceUninitializedNEW99_78() throws Throwable;
private static native void __explicitNewInit99_80(com.moon.qh a0, com.moon.jW a1) throws Throwable;
private static native void __call99_81(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qh a2) throws Throwable;
private static native java.lang.String __invokedynamic99_82(int a0, long a1) throws Throwable;
private static native com.moon.qi __sourceUninitializedNEW99_83() throws Throwable;
private static native void __explicitNewInit99_85(com.moon.qi a0, com.moon.jW a1) throws Throwable;
private static native void __call99_86(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qi a2) throws Throwable;
private static native java.lang.String __invokedynamic99_87(int a0, long a1) throws Throwable;
private static native com.moon.qj __sourceUninitializedNEW99_88() throws Throwable;
private static native void __explicitNewInit99_90(com.moon.qj a0, com.moon.jW a1) throws Throwable;
private static native void __call99_91(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qj a2) throws Throwable;
private static native java.lang.String __invokedynamic99_92(int a0, long a1) throws Throwable;
private static native com.moon.qk __sourceUninitializedNEW99_93() throws Throwable;
private static native void __explicitNewInit99_95(com.moon.qk a0, com.moon.jW a1) throws Throwable;
private static native void __call99_96(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qk a2) throws Throwable;
private static native java.lang.String __invokedynamic99_97(int a0, long a1) throws Throwable;
private static native com.moon.ql __sourceUninitializedNEW99_98() throws Throwable;
private static native void __explicitNewInit99_100(com.moon.ql a0, com.moon.jW a1) throws Throwable;
private static native void __call99_101(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.ql a2) throws Throwable;
private static native java.lang.String __invokedynamic99_102(int a0, long a1) throws Throwable;
private static native com.moon.qm __sourceUninitializedNEW99_103() throws Throwable;
private static native void __explicitNewInit99_105(com.moon.qm a0, com.moon.jW a1) throws Throwable;
private static native void __call99_106(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qm a2) throws Throwable;
private static native java.lang.String __invokedynamic99_107(int a0, long a1) throws Throwable;
private static native com.moon.qn __sourceUninitializedNEW99_108() throws Throwable;
private static native void __explicitNewInit99_110(com.moon.qn a0, com.moon.jW a1) throws Throwable;
private static native void __call99_111(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qn a2) throws Throwable;
private static native java.lang.String __invokedynamic99_112(int a0, long a1) throws Throwable;
private static native com.moon.qo __sourceUninitializedNEW99_113() throws Throwable;
private static native void __explicitNewInit99_115(com.moon.qo a0, com.moon.jW a1) throws Throwable;
private static native void __call99_116(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qo a2) throws Throwable;
private static native java.lang.String __invokedynamic99_117(int a0, long a1) throws Throwable;
private static native com.moon.qp __sourceUninitializedNEW99_118() throws Throwable;
private static native void __explicitNewInit99_120(com.moon.qp a0, com.moon.jW a1) throws Throwable;
private static native void __call99_121(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qp a2) throws Throwable;
private static native java.lang.String __invokedynamic99_122(int a0, long a1) throws Throwable;
private static native com.moon.qq __sourceUninitializedNEW99_123() throws Throwable;
private static native void __explicitNewInit99_125(com.moon.qq a0, com.moon.jW a1) throws Throwable;
private static native void __call99_126(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qq a2) throws Throwable;
private static native java.lang.String __invokedynamic99_127(int a0, long a1) throws Throwable;
private static native com.moon.qr __sourceUninitializedNEW99_128() throws Throwable;
private static native void __explicitNewInit99_130(com.moon.qr a0, com.moon.jW a1) throws Throwable;
private static native void __call99_131(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qr a2) throws Throwable;
private static native java.lang.String __invokedynamic99_132(int a0, long a1) throws Throwable;
private static native com.moon.qs __sourceUninitializedNEW99_133() throws Throwable;
private static native void __explicitNewInit99_135(com.moon.qs a0, com.moon.jW a1) throws Throwable;
private static native void __call99_136(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qs a2) throws Throwable;
private static native java.lang.String __invokedynamic99_137(int a0, long a1) throws Throwable;
private static native com.moon.qt __sourceUninitializedNEW99_138() throws Throwable;
private static native void __explicitNewInit99_140(com.moon.qt a0, com.moon.jW a1) throws Throwable;
private static native void __call99_141(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qt a2) throws Throwable;
private static native java.lang.String __invokedynamic99_142(int a0, long a1) throws Throwable;
private static native com.moon.qu __sourceUninitializedNEW99_143() throws Throwable;
private static native void __explicitNewInit99_145(com.moon.qu a0, com.moon.jW a1) throws Throwable;
private static native void __call99_146(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qu a2) throws Throwable;
private static native java.lang.String __invokedynamic99_147(int a0, long a1) throws Throwable;
private static native com.moon.qw __sourceUninitializedNEW99_148() throws Throwable;
private static native void __explicitNewInit99_150(com.moon.qw a0, com.moon.jW a1) throws Throwable;
private static native void __call99_151(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qw a2) throws Throwable;
private static native java.lang.String __invokedynamic99_152(int a0, long a1) throws Throwable;
private static native com.moon.qx __sourceUninitializedNEW99_153() throws Throwable;
private static native void __explicitNewInit99_155(com.moon.qx a0, com.moon.jW a1) throws Throwable;
private static native void __call99_156(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qx a2) throws Throwable;
private static native java.lang.String __invokedynamic99_157(int a0, long a1) throws Throwable;
private static native com.moon.qy __sourceUninitializedNEW99_158() throws Throwable;
private static native void __explicitNewInit99_160(com.moon.qy a0, com.moon.jW a1) throws Throwable;
private static native void __call99_161(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qy a2) throws Throwable;
private static native java.lang.String __invokedynamic99_162(int a0, long a1) throws Throwable;
private static native com.moon.qz __sourceUninitializedNEW99_163() throws Throwable;
private static native void __explicitNewInit99_165(com.moon.qz a0, com.moon.jW a1) throws Throwable;
private static native void __call99_166(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qz a2) throws Throwable;
private static native java.lang.String __invokedynamic99_167(int a0, long a1) throws Throwable;
private static native com.moon.qA __sourceUninitializedNEW99_168() throws Throwable;
private static native void __explicitNewInit99_170(com.moon.qA a0, com.moon.jW a1) throws Throwable;
private static native void __call99_171(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qA a2) throws Throwable;
private static native java.lang.String __invokedynamic99_172(int a0, long a1) throws Throwable;
private static native com.moon.qB __sourceUninitializedNEW99_173() throws Throwable;
private static native void __explicitNewInit99_175(com.moon.qB a0, com.moon.jW a1) throws Throwable;
private static native void __call99_176(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qB a2) throws Throwable;
private static native java.lang.String __invokedynamic99_177(int a0, long a1) throws Throwable;
private static native com.moon.qC __sourceUninitializedNEW99_178() throws Throwable;
private static native void __explicitNewInit99_180(com.moon.qC a0, com.moon.jW a1) throws Throwable;
private static native void __call99_181(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qC a2) throws Throwable;
private static native java.lang.String __invokedynamic99_182(int a0, long a1) throws Throwable;
private static native com.moon.qU __sourceUninitializedNEW99_183() throws Throwable;
private static native void __explicitNewInit99_185(com.moon.qU a0, com.moon.jW a1) throws Throwable;
private static native void __call99_186(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qU a2) throws Throwable;
private static native java.lang.String __invokedynamic99_187(int a0, long a1) throws Throwable;
private static native com.moon.qV __sourceUninitializedNEW99_188() throws Throwable;
private static native void __explicitNewInit99_190(com.moon.qV a0, com.moon.jW a1) throws Throwable;
private static native void __call99_191(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.qV a2) throws Throwable;
private static native java.lang.String __invokedynamic99_192(int a0, long a1) throws Throwable;
private static native com.moon.sy __sourceUninitializedNEW99_193() throws Throwable;
private static native void __explicitNewInit99_195(com.moon.sy a0, com.moon.jW a1) throws Throwable;
private static native void __call99_196(org.luaj.vm2.LuaTable a0, java.lang.String a1, com.moon.sy a2) throws Throwable;
private static native java.lang.String[] __call99_197() throws Throwable;
private static native void __call99_198(int a0) throws Throwable;

}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1933_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/jW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.jW.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21990);
    if (((com.moon.jW.f)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.jW.g)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.jW.g)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/jW", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.jW.e)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.jW.f)[life5_8] = com.moon.jW.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.jW.f)[life5_8];
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
        byte[] spill587_0 = p0;
        life4_9 += 1;
        life5_44 = (spill587_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill587_1 = p0;
        life4_9 += 1;
        life5_76 = (spill587_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill587_2 = p0;
        life4_9 += 1;
        life5_91 = (spill587_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(org.luaj.vm2.LuaTable p0) { __sourceHandlerCall_5d78387a2bcf990be1c9(this, p0); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e083d7384f134afe_originalDynamicSite1098_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1933_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e842da2e92fc_invokedynamic99_1(int a0, long a1) throws E;
}
