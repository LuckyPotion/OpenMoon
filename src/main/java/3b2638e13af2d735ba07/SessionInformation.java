package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class SessionInformation extends com.moon.module.Module {

private java.util.Map<java.lang.String, com.moon.gM> s;

private com.moon.setting.StringListSetting t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.FloatSetting v;

protected com.moon.setting.BooleanSetting w;

protected com.moon.setting.BooleanSetting x;

private com.moon.setting.BooleanSetting y;

private com.moon.setting.ColorSetting z;

private com.moon.setting.ButtonSetting A;

private com.moon.setting.ButtonSetting B;

private com.moon.setting.FloatSetting C;

private com.moon.setting.FloatSetting D;

private java.util.concurrent.ExecutorService E;

private java.util.Map<moom.jL, com.moon.gN> F;

private com.moon.hW G;

private com.moon.hW H;

private com.moon.hW I;

private com.moon.hW J;

private com.moon.hW K;

private com.moon.gX L;

private com.moon.module.impl.ClickGUI M;

private com.moon.module.impl.Effects N;

private com.moon.module.impl.HUD O;

private float P;

private float Q;

private boolean R;

private int S;

private int T;

private int U;

private int V;

private long W;

private long X;

private long Y;

private java.lang.String Z;

private boolean aa;

private int ab;

private float ac;

private float ad;

private com.v ae;

private java.util.List<com.moon.gO> af;

private static long cb;

private static java.lang.String[] kb;

private static java.lang.String[] lb;

private static java.util.Map mb;

private static long[] ob;

private static java.lang.Integer[] pb;

private static java.util.Map qb;

private static long[] sb;

private static java.lang.Long[] tb;

private static java.util.Map ub;

public SessionInformation(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }

private static void __sourceConstructorBody_78de31e6aaa952ff(com.moon.module.impl.SessionInformation receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {
long local5_life2 = (com.moon.module.impl.SessionInformation.cb ^ 59992283031951L);
    com.moon.module.impl.SessionInformation.__sourceConstructorInit_78de31e6aaa952ff_0(((com.moon.module.impl.SessionInformation)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));
    ((com.moon.module.impl.SessionInformation)(receiver)).s = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.module.impl.SessionInformation)(receiver)).t = ((com.moon.setting.StringListSetting)(((com.moon.mh)(((com.moon.mh)(((com.moon.mh)(((com.moon.mh)(com.moon.setting.StringListSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_6(30556, (4454941096687055864L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_9(17839, (371481540043800857L ^ local5_life2)))), ((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_11(1481, (2447009323196957043L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_14(22465, (6489407312208466809L ^ local5_life2))))))).a(((java.util.function.Consumer)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_16(receiver)))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_21(6911, (1397991112744590945L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_24(6759, (3703628408231026375L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).v = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_29(2489, (8886598187656137998L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_32(5070, (1794272896016406364L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(0x1.0000000000000p-2F)), ((float)(0x1.0000000000000p+2F)), ((float)(0x1.99999a0000000p-4F))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_40(10403, (457716953313078291L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_43(4755, (8846283568798258741L ^ local5_life2)))), ((boolean)(false))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_48(12638, (8035528890809120196L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_51(19233, (5277526490830802858L ^ local5_life2)))), ((boolean)(false))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_56(16296, (185642438951009052L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_59(9345, (4236651614637514775L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).z = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_64(1310, (4918540982281191822L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_67(5609, (8623965973891404146L ^ local5_life2)))), ((int)(((java.awt.Color)(java.awt.Color.RED)).getRGB()))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).A = ((com.moon.setting.ButtonSetting)(((com.moon.ma)(((com.moon.ma)(((com.moon.ma)(com.moon.setting.ButtonSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_74(22739, (5800042729764953162L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_77(25097, (4964212650304710301L ^ local5_life2))))))).a(((com.moon.kR)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_79(receiver)))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).B = ((com.moon.setting.ButtonSetting)(((com.moon.ma)(((com.moon.ma)(((com.moon.ma)(com.moon.setting.ButtonSetting.builder(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_84(25449, (7974817013458511820L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_87(1083, (8942340399774417047L ^ local5_life2))))))).a(((com.moon.kR)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_89(receiver)))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).C = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)("x"))))).a(((java.lang.String)("X")), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.86a0000000000p+16F)), ((float)(0x1.0p0f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_96()))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).D = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)("y"))))).a(((java.lang.String)("Y")), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.86a0000000000p+16F)), ((float)(0x1.0p0f))))).a(((java.util.function.Supplier)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_103()))))).a()));
    ((com.moon.module.impl.SessionInformation)(receiver)).E = ((java.util.concurrent.ExecutorService)(java.util.concurrent.Executors.newSingleThreadExecutor()));
    ((com.moon.module.impl.SessionInformation)(receiver)).F = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.module.impl.SessionInformation)(receiver)).L = ((com.moon.gX)(new com.moon.gX()));
    ((com.moon.module.impl.SessionInformation)(receiver)).Z = ((java.lang.String)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_112(17171, (581658082787887016L ^ local5_life2))));
    ((com.moon.module.impl.SessionInformation)(receiver)).aa = ((boolean)(true));
    ((com.moon.module.impl.SessionInformation)(receiver)).ab = ((int)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_116(18859, (7477646830755065525L ^ local5_life2))));
    ((com.moon.module.impl.SessionInformation)(receiver)).ae = ((com.v)(__sourceExactCall_f61d11b8decb1d(((int)(-1)))));
    ((com.moon.module.impl.SessionInformation)(receiver)).af = ((java.util.List)(java.util.List.of(((java.lang.Object)(((com.moon.gP)(((com.moon.gP)(((com.moon.gP)(((com.moon.gP)(com.moon.gO.a__gP())).a(((java.lang.String)(""))))).a(((java.util.function.Supplier)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_122(receiver)))))).a(((float)(0x1.0p1f))))).a())), ((java.lang.Object)(((com.moon.gP)(((com.moon.gP)(((com.moon.gP)(((com.moon.gP)(com.moon.gO.a__gP())).a(((java.lang.String)(""))))).a(((java.util.function.Supplier)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_128(receiver)))))).a(((float)(0x1.0p1f))))).a())), ((java.lang.Object)(((com.moon.gP)(((com.moon.gP)(((com.moon.gP)(((com.moon.gP)(com.moon.gO.a__gP())).a(((java.lang.String)(""))))).a(((java.util.function.Supplier)(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_134(receiver)))))).a(((float)(0x1.0p1f))))).a())))));
    ((com.moon.module.impl.SessionInformation)(receiver)).a();
    java.lang.Thread local7_life144 = new java.lang.Thread(__sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_141(receiver), __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_143(25267, (8867861363232679440L ^ local5_life2)));
    ((java.lang.Thread)(local7_life144)).start();
    return;
}


static {
cb = ((long)(((moom._a)(moom._c.a(((long)(-3097467119211524076L)), ((long)(8963558759691937344L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(76078908522538L)))));
    mb = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.module.impl.SessionInformation.cb ^ 71497968349348L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill287_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill287_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill287_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill287_14 = new byte[8];
    (__sourceSpill287_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill287_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation287_16 = __sourceSpill287_14;
    ((javax.crypto.Cipher)(__sourceSpill287_11)).init(((int)(__sourceSpill287_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill287_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation287_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[55];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "ÔÃ±\\'ó63ñ¶X£\búÙÆ0üL­óý\f æº±\020\006»x¶ÅÙoövèÍ\r²\tPÆ>Â\037ø³'¼¸sIé\032©\001\03560\0033\f0¸yr«Â÷Eae±ÄosV¢G~îû&\023Ù6'}-z×}#ðúßGûößg3}:\\n\027(3dÞEV÷a\1776sgÿþ)n]\000û²ÞÍ!\022 ¿P¯¼IÀüß@}Fd.Ð\020feY\021\027ÐÔÎW£\"à\020½¶nÀ;\023®\033;¡9ÙxÀè(ê'Iò\032ºJnÝvÏ!\017ñ &;4_kÆ\fÊºuå{$ÊyÛï­Xö&ön7!¯ÄÇ6oJ\017\\$ñÚ¬æÎ1:-_Ï\007C²l\033\036½ååg\036¨²Y¤?\026@\021BR ó­ñ'\002\030ªª\026¼B¡îpÛÀÛLd\023ÿËÌÅË\013ýûbPãSÅ[PDS\034ê8ô+\027w¼«]z´±U´Ø%O9¥Q~ØöK\fXrI\004¤Uá +\033\026äÆøä\026¡v}í\006¯4gÍ\\K\034E¸6úºâ\020üÁÕZíÐ¨Ú\ba\017;Ô\0304Ä¨[Pì\":¨Ú[N}\033*\0313ÃûX)gíæ[\001\006o¾Ð\006Ñ\031Ó4R(äºGgªÓ|H«¿¿x­\027_»ú½ãH6¥Í\f1ÈLFHqÍ×\002\\W¸\005ª÷-t»°\021JÏôwºÞ}ä[ÃäG\037\f\004õg òNÇ\026\"\003ó< pKU¦Ô:DêVhÏ7\fKonáÆ\030X¥Cq¹°`[Fóà{\026q¸\033âT*;K£âû(º¿÷ÂÙ\020^\000Ý9.ë\036­ã\016\027HY»ôÿ¢:÷!á7fÈäÔ\\\006S Ù«º\004D]zx=G\021/T3nü¾²Úèê\005ºÜñlÙ(é(ð^lFLL\030ÅS\021Ý\031k0öö×X'\024:¦M3¿è/V\t½9p\tLÃ\030iK¿\034¥ÿ!\rSë\037>×\005>¥i)­°»Ä\0204·´xZîv[ÈK¤\f=\020\003î\024'b\rnùýù\020@A?gÎÿ\\z\003Ü\001S\030>L\022 ³\022§²\026w8Ç®ÒñXA¼¬\023É\001bú/_luà#(¼g¦µÛ)i.\004È\027ëð%wÃ×ÿ¯\002ó×\017n¸s\003\017Iæ¦· \\\003f?I<dÐaíâ\rê5|\024\\\007Ù92E»¼\037û`h(æÓDYy·$yRá;cW\007¾._þï&VÑMC+Ø¾ò­Ä®*zæ[ÝR\b\0240ÐÅu¿Y]Ìñ#È­\024 ©Éu·P}¯\033á»\b\025\034U²ÕµUj9àa4ÓªÄ(ÞéYx¾2ôõh\035¾|Øë(Ì'Èöî\bè%\t¢\006 E×Ýg\"êÉS\030\nò\013HÅëË\006@\t²ì\036\022±³£é=-e¸('\034×½\fÇDÖ\fz\000Ý\n£¤Jôþv<k3Ò2ï]F\f\017ß#CéÒ´ÿ\020\001H\0259¶\003\006VZæ|ðJ~º­\0207qH#Ç¸aÖïl\006\032\177Á%(b\022\002¼R\037+gü©\017\026Ë`\024\026^\006O=¤\177³\037sÌ\024~?ÇFjÚ{p³Tçn\030{ÉM\000à®\r\003Aÿs| ÙcÃâËúØ\020µ`ÆÆ\000Û\035|,Sµ\034\036r½(éb¼K\031[cv)Z!{Ú2ïÜ\001)M©6±\002-Ê@\\Ï¸X¤tMwX f$\032ø·(ÆI JØÂ¥ujy\016Éà²¥®®àº RØ¬<(Õèá®÷Jÿ¥\023\013¢lmx=ÒÇÖón\036\017F\030ExþK&[±ïåâ\177\002\020+\032\002\007\034x\rEE®ÞÐ\005± ý¶ªåÚ·²&ÀJÎ,Ûýæ\003êp~ÒK½\r­ULCÇ\177ñ\020\007°\037rNWÍ}!<\006ô¡ÿÈÔ \034Nq­Or\013¸ª%Q\004ªQIR¸z\0174\032ÀY7Øv41/\030²ÞEÂÈï\f\n·³s«Ñ{7¢Æ\020U2KÚ#\016Ü|ÿÃnû¢7\020a}2Ûhñ_ÆµKí­Ðëí(\037­\022Á¦Ø)$\036<C\f[ùx®¯]Qâ\006Ì\"¸gþ[ÕÒL\b?ÍS ±Ó0¢K:VTü1NªZBÍMÛ4îÅp\"óÈ<^\007Z\033(Ø`ºD¢¦Þ@@ô\002âÓÆ1+~û\017¨bª\035!\fúE­K7mD\022.Õ\n \0349m\034\025´Óò£<ÁìºÚÝ:\032@ObïÏ¢kXäFéZFØ\030\fïÚÂãÌ//êµÌóÝ½ß\b¸Ïaû\030yE{­¸\rÒ(nÍvÒ.\000¢/}ûÊ-òû\020ú0ðúi³\034áÈRÊ§N¥©0P\023Àkp[gÞn©[»4\036Ìú8oIrä\035æë£_+¥7´ç.£\030\021\024ÞÀ\001\\L-\t\035í¿X\020îñáäqá´Ö*\034_`Hì*"))).length();
    int local27_life24 = 32;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill287_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill287_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill287_29)).doFinal(((byte[])(__sourceSpill287_28)));
        java.lang.String __sourceSpill287_34 = ((java.lang.String)(com.moon.module.impl.SessionInformation.c(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill287_35 = local31_life19;
        int __sourceSpill287_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill287_35)[__sourceSpill287_36] = __sourceSpill287_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "\035\017óXîÔ\003DæúöøÆ½K\rÑØ° \017`ñVK\bÝþª,+µÑ\0043£oÕ÷ÔÞ®+_R\021¿ò"))).length();
    local27_life24 = 24;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill287_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill287_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill287_42)).doFinal(((byte[])(__sourceSpill287_41)));
        java.lang.String __sourceSpill287_47 = ((java.lang.String)(com.moon.module.impl.SessionInformation.c(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill287_48 = local31_life19;
        int __sourceSpill287_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill287_48)[__sourceSpill287_49] = __sourceSpill287_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    kb = ((java.lang.String[])(local31_life19));
    lb = ((java.lang.String[])(new java.lang.String[55]));
    qb = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill287_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill287_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill287_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill287_60 = new byte[8];
    (__sourceSpill287_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill287_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation287_62 = __sourceSpill287_60;
    ((javax.crypto.Cipher)(__sourceSpill287_57)).init(((int)(__sourceSpill287_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill287_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation287_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[7];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "ÀÝ:yåßj`ß>\016è^kÑ\025¤Ú®ZÇ;1Â2\0161¼u/«O\000#¿"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill287_71 = local15_life67;
        int __sourceSpill287_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill287_71)).substring(((int)(__sourceSpill287_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill287_76 = local17_life65;
        int __sourceSpill287_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill287_79 = new byte[8];
        (__sourceSpill287_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill287_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill287_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill287_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill287_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill287_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill287_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill287_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill287_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill287_80)).doFinal(((byte[])(__sourceSpill287_79)));
        (__sourceSpill287_76)[__sourceSpill287_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = "­êº¸©^¼¡ó\032å\027Ð~@"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill287_84 = local15_life67;
        int __sourceSpill287_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill287_84)).substring(((int)(__sourceSpill287_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill287_89 = local17_life65;
        int __sourceSpill287_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill287_92 = new byte[8];
        (__sourceSpill287_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill287_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill287_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill287_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill287_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill287_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill287_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill287_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill287_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill287_93)).doFinal(((byte[])(__sourceSpill287_92)));
        (__sourceSpill287_89)[__sourceSpill287_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    ob = ((long[])(local17_life65));
    pb = ((java.lang.Integer[])(new java.lang.Integer[7]));
    ub = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill287_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill287_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill287_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill287_105 = new byte[8];
    (__sourceSpill287_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill287_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation287_107 = __sourceSpill287_105;
    ((javax.crypto.Cipher)(__sourceSpill287_102)).init(((int)(__sourceSpill287_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill287_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation287_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[21];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "ó´ÈÚ\"þHÄNW®nLa\025\026Ë¸\027Ð+Á¼¢GD(»o[Ç\035\013*ÃÄºâc\032ð¿¤î]Â¡\016·>Ø\002,CÊ\"÷FCMóò¯KV\003\001\001Éð!Í\031i¼\017Æ¹¹ØR@\032Àã\030·ÿe\003Å2çÇ«KØÜ+BÅ\037«~Ô\026Gl3þÅé\\tîspõ;ãÁª´j@\030sÿërI^Xü"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill287_116 = local4_life112;
        int __sourceSpill287_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill287_116)).substring(((int)(__sourceSpill287_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill287_121 = local6_life110;
        int __sourceSpill287_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill287_124 = new byte[8];
        (__sourceSpill287_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill287_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill287_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill287_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill287_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill287_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill287_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill287_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill287_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill287_125)).doFinal(((byte[])(__sourceSpill287_124)));
        (__sourceSpill287_121)[__sourceSpill287_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    local5_life114 = ((java.lang.String)((local4_life112 = "\n\023jn<Á{\035\034·R1c\037"))).length();
    local2_life115 = 0;
    do {
        java.lang.String __sourceSpill287_129 = local4_life112;
        int __sourceSpill287_130 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life133 = ((java.lang.String)(((java.lang.String)(__sourceSpill287_129)).substring(((int)(__sourceSpill287_130)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill287_134 = local6_life110;
        int __sourceSpill287_135 = local3_life111;
        local3_life111 += 1;
        long local8_life136 = (((((((((((long) (local7_life133)[0]) & 255L) << 56) | ((((long) (local7_life133)[1]) & 255L) << 48)) | ((((long) (local7_life133)[2]) & 255L) << 40)) | ((((long) (local7_life133)[3]) & 255L) << 32)) | ((((long) (local7_life133)[4]) & 255L) << 24)) | ((((long) (local7_life133)[5]) & 255L) << 16)) | ((((long) (local7_life133)[6]) & 255L) << 8)) | (((long) (local7_life133)[7]) & 255L));
        byte[] __sourceSpill287_137 = new byte[8];
        (__sourceSpill287_137)[0] = ((byte) ((int) (local8_life136 >>> 56)));
        (__sourceSpill287_137)[1] = ((byte) ((int) (local8_life136 >>> 48)));
        (__sourceSpill287_137)[2] = ((byte) ((int) (local8_life136 >>> 40)));
        (__sourceSpill287_137)[3] = ((byte) ((int) (local8_life136 >>> 32)));
        (__sourceSpill287_137)[4] = ((byte) ((int) (local8_life136 >>> 24)));
        (__sourceSpill287_137)[5] = ((byte) ((int) (local8_life136 >>> 16)));
        (__sourceSpill287_137)[6] = ((byte) ((int) (local8_life136 >>> 8)));
        (__sourceSpill287_137)[7] = ((byte) ((int) local8_life136));
        javax.crypto.Cipher __sourceSpill287_138 = local0_life100;
        byte[] local10_life140 = ((javax.crypto.Cipher)(__sourceSpill287_138)).doFinal(((byte[])(__sourceSpill287_137)));
        (__sourceSpill287_134)[__sourceSpill287_135] = (((((((((((long) (local10_life140)[0]) & 255L) << 56) | ((((long) (local10_life140)[1]) & 255L) << 48)) | ((((long) (local10_life140)[2]) & 255L) << 40)) | ((((long) (local10_life140)[3]) & 255L) << 32)) | ((((long) (local10_life140)[4]) & 255L) << 24)) | ((((long) (local10_life140)[5]) & 255L) << 16)) | ((((long) (local10_life140)[6]) & 255L) << 8)) | (((long) (local10_life140)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    sb = ((long[])(local6_life110));
    tb = ((java.lang.Long[])(new java.lang.Long[21]));
}

private static native <E extends Throwable> void __sourceConstructorInit_78de31e6aaa952ff_0(com.moon.module.impl.SessionInformation a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;
private static native <E extends Throwable> java.io.File __sourceHandlerCall_0882d7e250a3774ca38d(com.moon.module.impl.SessionInformation a0) throws E;
private static final class __SourceHandler_0882d7e250a3774ca38d {

public static java.io.File f214(com.moon.module.impl.SessionInformation receiver) throws Throwable {
    int forestValue214_26_0;
    java.io.File forestValue214_64_0;
    int forestValue214_177_0;
    java.io.File forestValue214_179_0;
    int forestValue214_203_0;
    int forestValue214_211_0;
    int forestValue214_216_0;
    java.io.File forestValue214_233_0;
    java.lang.String spill214_0;
    boolean spill214_1;
    java.io.File spill214_2;
    int spill214_3;
    boolean spill214_4;
    java.nio.file.Path spill214_5;
    byte[] spill214_6;
    java.nio.file.OpenOption[] spill214_7;
    java.nio.file.OpenOption[] spill214_8;
    java.nio.file.OpenOption[] spill214_9;
    java.io.File spill214_10;
    java.nio.file.Path spill214_11;
    byte[] spill214_12;
    java.nio.file.OpenOption[] spill214_13;
    java.nio.file.OpenOption[] spill214_14;
    java.nio.file.OpenOption[] spill214_15;
    long life1_3;
    java.io.File life4_7;
    java.io.File life5_17;
    java.lang.String life3_18;
    java.util.Iterator life6_36;
    java.lang.String life7_45;
    java.io.File life8_51;
    java.io.File life9_78;
    java.io.File life10_88;
    int life11_96;
    java.util.List life12_150;
    java.util.List life13_162;
    com.moon.gM life12_261;
    forest_join_233: {
    forest_join_232: {
    forest_join_27: {
    forest_join_26: {
    life1_3 = (__fieldRead214_0() ^ 26747323379579L);
    spill214_0 = __call214_1();
    life4_7 = __call214_3(__call214_2());
    life5_17 = new java.io.File(life4_7, __invokedynamic214_4(5642, (1227378700815832175L ^ life1_3)));
    life3_18 = spill214_0;
    spill214_1 = __call214_5(life5_17);
    if (!((life3_18 != null))) {
        forestValue214_26_0 = __integerCategory214_6(spill214_1);
        break forest_join_26;
    }
    if (!((!spill214_1))) {
        break forest_join_27;
    }
    forestValue214_26_0 = __integerCategory214_8(__call214_7(life5_17));
    }
    __discardScalar214_9(forestValue214_26_0);
    }
    life6_36 = __call214_12(__call214_11(__fieldRead214_10(receiver)));
    forest_cycle_32: while (true) {
    forest_join_217: {
    forest_join_216: {
    forest_join_211: {
    forest_join_209: {
    forest_join_203: {
    forest_join_201: {
    forest_join_200: {
    forest_join_179: {
    forest_join_177: {
    forest_join_173: {
    forest_join_64: {
    forest_join_55: {
    if (!(__call214_13(life6_36))) {
        break forest_join_232;
    }
    life7_45 = __cast214_15(__call214_14(life6_36));
    life8_51 = new java.io.File(life5_17, life7_45);
    spill214_2 = life8_51;
    if (!((life3_18 != null))) {
        forestValue214_233_0 = spill214_2;
        break forest_join_233;
    }
    if (!((life3_18 != null))) {
        forestValue214_64_0 = spill214_2;
        break forest_join_64;
    }
    if (!((!__call214_16(spill214_2)))) {
        break forest_join_55;
    }
    __call214_17(life8_51);
    }
    forestValue214_64_0 = new java.io.File(life8_51, __invokedynamic214_18(14187, (7025232611423237428L ^ life1_3)));
    }
    life9_78 = forestValue214_64_0;
    life10_88 = new java.io.File(life8_51, __invokedynamic214_19(10182, (8966604507637753249L ^ life1_3)));
    life11_96 = __integerCategory214_22(__call214_21(life7_45, __invokedynamic214_20(4153, (7247004380254442080L ^ life1_3))));
    spill214_3 = life11_96;
    if (!((life3_18 != null))) {
        forestValue214_203_0 = spill214_3;
        break forest_join_203;
    }
    if (!((spill214_3 != 0))) {
        break forest_join_201;
    }
    life12_150 = __call214_32(__invokedynamic214_23(27733, (7159954858468503102L ^ life1_3)), __invokedynamic214_24(4942, (3224278522505826613L ^ life1_3)), __invokedynamic214_25(8042, (8800696654587469067L ^ life1_3)), __invokedynamic214_26(11789, (8129527581794741363L ^ life1_3)), __invokedynamic214_27(28126, (822095713923166141L ^ life1_3)), __invokedynamic214_28(9080, (4082310217389187374L ^ life1_3)), __invokedynamic214_29(7257, (4066080766314159649L ^ life1_3)), __invokedynamic214_30(18740, (7721715906838088540L ^ life1_3)), __invokedynamic214_31(28131, (98431471073030050L ^ life1_3)));
    life13_162 = __call214_35(__invokedynamic214_33(26395, (3482312658482390343L ^ life1_3)), __invokedynamic214_34(32349, (1836225448048753667L ^ life1_3)));
    spill214_4 = __call214_36(life9_78);
    if (!((life3_18 != null))) {
        forestValue214_177_0 = __integerCategory214_37(spill214_4);
        break forest_join_177;
    }
    if (!((!spill214_4))) {
        break forest_join_173;
    }
    spill214_5 = __call214_38(life9_78);
    spill214_6 = __call214_41(__call214_40(__call214_39(), life13_162));
    java.nio.file.OpenOption[] __stackOp214_42_0 = new java.nio.file.OpenOption[3];
    spill214_7 = __stackOp214_42_0;
    (__stackOp214_42_0)[0] = __fieldRead214_43();
    java.nio.file.OpenOption[] __stackOp214_44_0 = spill214_7;
    spill214_8 = __stackOp214_44_0;
    (__stackOp214_44_0)[1] = __fieldRead214_45();
    java.nio.file.OpenOption[] __stackOp214_46_0 = spill214_8;
    spill214_9 = __stackOp214_46_0;
    (__stackOp214_46_0)[2] = __fieldRead214_47();
    __call214_48(spill214_5, spill214_6, spill214_9);
    }
    spill214_10 = life10_88;
    if (!((life3_18 != null))) {
        forestValue214_179_0 = spill214_10;
        break forest_join_179;
    }
    forestValue214_177_0 = __integerCategory214_50(__call214_49(spill214_10));
    }
    if (!((forestValue214_177_0 == 0))) {
        break forest_join_200;
    }
    forestValue214_179_0 = life10_88;
    }
    spill214_11 = __call214_51(forestValue214_179_0);
    spill214_12 = __call214_54(__call214_53(__call214_52(), life12_150));
    java.nio.file.OpenOption[] __stackOp214_55_0 = new java.nio.file.OpenOption[3];
    spill214_13 = __stackOp214_55_0;
    (__stackOp214_55_0)[0] = __fieldRead214_56();
    java.nio.file.OpenOption[] __stackOp214_57_0 = spill214_13;
    spill214_14 = __stackOp214_57_0;
    (__stackOp214_57_0)[1] = __fieldRead214_58();
    java.nio.file.OpenOption[] __stackOp214_59_0 = spill214_14;
    spill214_15 = __stackOp214_59_0;
    (__stackOp214_59_0)[2] = __fieldRead214_60();
    __call214_61(spill214_11, spill214_12, spill214_15);
    }
    break forest_join_217;
    }
    forestValue214_203_0 = __integerCategory214_63(__call214_62(life9_78));
    }
    if (!((life3_18 != null))) {
        forestValue214_211_0 = forestValue214_203_0;
        break forest_join_211;
    }
    if (!((forestValue214_203_0 == 0))) {
        break forest_join_209;
    }
    __call214_64(life9_78);
    }
    forestValue214_211_0 = __integerCategory214_66(__call214_65(life10_88));
    }
    if (!((life3_18 != null))) {
        forestValue214_216_0 = forestValue214_211_0;
        break forest_join_216;
    }
    if (!((forestValue214_211_0 == 0))) {
        break forest_join_217;
    }
    forestValue214_216_0 = __integerCategory214_68(__call214_67(life10_88));
    }
    __discardScalar214_69(forestValue214_216_0);
    }
    life12_261 = __cast214_73(__call214_72(__fieldRead214_70(receiver), life7_45, __invokedynamic214_71()));
    __call214_74(life12_261, life9_78);
    __call214_75(life12_261, life10_88);
    if (!((life3_18 == null))) {
        continue forest_cycle_32;
    }
    break forest_cycle_32;
    }
    }
    forestValue214_233_0 = life5_17;
    }
    return forestValue214_233_0;
}
public static java.io.File h214_0(java.io.IOException p0) throws Throwable {
    throw __call3021400_0(p0);
}
public static java.io.File h214_1(java.io.IOException p0) throws Throwable {
    throw __call3021401_0(p0);
}
public static java.io.File h214_2(java.io.IOException p0) throws Throwable {
    throw __call3021402_0(p0);
}
public static java.io.File h214_3(java.io.IOException p0) throws Throwable {
    throw __call3021403_0(p0);
}
public static java.io.File h214_4(java.io.IOException p0) throws Throwable {
    throw __call3021404_0(p0);
}
public static java.io.File h214_5(java.io.IOException p0) throws Throwable {
    throw __call3021405_0(p0);
}
public static java.io.File h214_6(java.io.IOException p0) throws Throwable {
    throw __call3021406_0(p0);
}
public static java.io.File h214_7(java.io.IOException p0) throws Throwable {
    throw __call3021407_0(p0);
}
public static java.io.File h214_8(java.io.IOException p0) throws Throwable {
    throw __call3021408_0(p0);
}
public static java.io.File h214_9(java.io.IOException p0, com.moon.module.impl.SessionInformation p1, long p2, java.lang.String p3, java.io.File p4, java.util.Iterator p5, java.lang.String p6, java.io.File p7, java.io.File p8, java.io.File p9, int p10, java.util.List p11) throws Throwable {
    int forestValue3021409_34_0;
    int forestValue3021409_42_0;
    int forestValue3021409_47_0;
    java.io.File forestValue3021409_96_0;
    int forestValue3021409_209_0;
    java.io.File forestValue3021409_211_0;
    java.io.File forestValue3021409_282_0;
    int forestValue3021409_395_0;
    java.io.File forestValue3021409_397_0;
    int forestValue3021409_421_0;
    int forestValue3021409_429_0;
    int forestValue3021409_434_0;
    java.io.File forestValue3021409_437_0;
    com.moon.hD spill3021409_0;
    com.moon.hB spill3021409_1;
    java.io.File spill3021409_2;
    int spill3021409_3;
    boolean spill3021409_4;
    java.nio.file.Path spill3021409_5;
    byte[] spill3021409_6;
    java.nio.file.OpenOption[] spill3021409_7;
    java.nio.file.OpenOption[] spill3021409_8;
    java.nio.file.OpenOption[] spill3021409_9;
    java.io.File spill3021409_10;
    java.nio.file.Path spill3021409_11;
    byte[] spill3021409_12;
    java.nio.file.OpenOption[] spill3021409_13;
    java.nio.file.OpenOption[] spill3021409_14;
    java.nio.file.OpenOption[] spill3021409_15;
    java.io.File spill3021409_16;
    int spill3021409_17;
    boolean spill3021409_18;
    java.nio.file.Path spill3021409_19;
    byte[] spill3021409_20;
    java.nio.file.OpenOption[] spill3021409_21;
    java.nio.file.OpenOption[] spill3021409_22;
    java.nio.file.OpenOption[] spill3021409_23;
    java.io.File spill3021409_24;
    java.nio.file.Path spill3021409_25;
    byte[] spill3021409_26;
    java.nio.file.OpenOption[] spill3021409_27;
    java.nio.file.OpenOption[] spill3021409_28;
    java.nio.file.OpenOption[] spill3021409_29;
    java.io.IOException life13_2;
    com.moon.gM life13_68;
    java.io.File life8_91;
    int life11_136;
    java.util.List life13_190;
    java.util.List life12_202;
    com.moon.gM life13_274;
    java.io.File life8_297;
    int life11_342;
    java.util.List life13_396;
    java.util.List life12_408;
    forest_join_437: {
    forest_join_436: {
    forest_join_234: {
    forest_join_233: {
    life13_2 = p0;
    spill3021409_0 = __call3021409_1(__call3021409_0());
    spill3021409_1 = __call3021409_4(__call3021409_2(), __invokedynamic3021409_3(19739, (6566644903360450390L ^ p2)));
    java.lang.String __stackOp3021409_6_0 = p6;
    java.lang.String __stackOp3021409_6_1 = __invokedynamic3021409_5(9380, (1238336548109362925L ^ p2));
    __call3021409_14(spill3021409_0, __call3021409_13(__call3021409_12(__call3021409_10(__call3021409_8(spill3021409_1, __invokedynamic3021409_7(__stackOp3021409_6_1, __stackOp3021409_6_0)), __fieldRead3021409_9()), __invokedynamic3021409_11(28426, (6017781138509611979L ^ p2)))));
    if (!((p3 == null))) {
        break forest_join_234;
    }
    forest_cycle_32: while (true) {
    forestValue3021409_34_0 = __integerCategory3021409_16(__call3021409_15(p8));
    forest_cycle_34: while (true) {
    forest_join_48: {
    forest_join_47: {
    forest_join_42: {
    forest_join_40: {
    if (!((p3 != null))) {
        forestValue3021409_42_0 = forestValue3021409_34_0;
        break forest_join_42;
    }
    if (!((forestValue3021409_34_0 == 0))) {
        break forest_join_40;
    }
    __call3021409_17(p8);
    }
    forestValue3021409_42_0 = __integerCategory3021409_19(__call3021409_18(p9));
    }
    if (!((p3 != null))) {
        forestValue3021409_47_0 = forestValue3021409_42_0;
        break forest_join_47;
    }
    if (!((forestValue3021409_42_0 == 0))) {
        break forest_join_48;
    }
    forestValue3021409_47_0 = __integerCategory3021409_21(__call3021409_20(p9));
    }
    __discardScalar3021409_22(forestValue3021409_47_0);
    }
    forest_cycle_48: while (true) {
    forest_join_232: {
    forest_join_211: {
    forest_join_209: {
    forest_join_205: {
    forest_join_96: {
    forest_join_87: {
    forest_join_64: {
    life13_68 = __cast3021409_26(__call3021409_25(__fieldRead3021409_23(p1), p6, __invokedynamic3021409_24()));
    __call3021409_27(life13_68, p8);
    __call3021409_28(life13_68, p9);
    if (!((p3 == null))) {
        break forest_join_64;
    }
    break forest_join_233;
    }
    if (!(__call3021409_29(p5))) {
        break forest_join_436;
    }
    p6 = __cast3021409_31(__call3021409_30(p5));
    life8_91 = new java.io.File(p4, p6);
    spill3021409_2 = life8_91;
    if (!((p3 != null))) {
        forestValue3021409_437_0 = spill3021409_2;
        break forest_join_437;
    }
    if (!((p3 != null))) {
        forestValue3021409_96_0 = spill3021409_2;
        break forest_join_96;
    }
    if (!((!__call3021409_32(spill3021409_2)))) {
        break forest_join_87;
    }
    __call3021409_33(life8_91);
    }
    forestValue3021409_96_0 = new java.io.File(life8_91, __invokedynamic3021409_34(14187, (7025232611423237428L ^ p2)));
    }
    p8 = forestValue3021409_96_0;
    p9 = new java.io.File(life8_91, __invokedynamic3021409_35(10182, (8966604507637753249L ^ p2)));
    life11_136 = __integerCategory3021409_38(__call3021409_37(p6, __invokedynamic3021409_36(4153, (7247004380254442080L ^ p2))));
    spill3021409_3 = life11_136;
    if (!((p3 != null))) {
        forestValue3021409_34_0 = spill3021409_3;
        continue forest_cycle_34;
    }
    if (!((spill3021409_3 != 0))) {
        continue forest_cycle_32;
    }
    life13_190 = __call3021409_48(__invokedynamic3021409_39(27733, (7159954858468503102L ^ p2)), __invokedynamic3021409_40(4942, (3224278522505826613L ^ p2)), __invokedynamic3021409_41(8042, (8800696654587469067L ^ p2)), __invokedynamic3021409_42(11789, (8129527581794741363L ^ p2)), __invokedynamic3021409_43(28126, (822095713923166141L ^ p2)), __invokedynamic3021409_44(9080, (4082310217389187374L ^ p2)), __invokedynamic3021409_45(7257, (4066080766314159649L ^ p2)), __invokedynamic3021409_46(18740, (7721715906838088540L ^ p2)), __invokedynamic3021409_47(28131, (98431471073030050L ^ p2)));
    life12_202 = __call3021409_51(__invokedynamic3021409_49(26395, (3482312658482390343L ^ p2)), __invokedynamic3021409_50(32349, (1836225448048753667L ^ p2)));
    spill3021409_4 = __call3021409_52(p8);
    if (!((p3 != null))) {
        forestValue3021409_209_0 = __integerCategory3021409_53(spill3021409_4);
        break forest_join_209;
    }
    if (!((!spill3021409_4))) {
        break forest_join_205;
    }
    spill3021409_5 = __call3021409_54(p8);
    spill3021409_6 = __call3021409_57(__call3021409_56(__call3021409_55(), life12_202));
    java.nio.file.OpenOption[] __stackOp3021409_58_0 = new java.nio.file.OpenOption[3];
    spill3021409_7 = __stackOp3021409_58_0;
    (__stackOp3021409_58_0)[0] = __fieldRead3021409_59();
    java.nio.file.OpenOption[] __stackOp3021409_60_0 = spill3021409_7;
    spill3021409_8 = __stackOp3021409_60_0;
    (__stackOp3021409_60_0)[1] = __fieldRead3021409_61();
    java.nio.file.OpenOption[] __stackOp3021409_62_0 = spill3021409_8;
    spill3021409_9 = __stackOp3021409_62_0;
    (__stackOp3021409_62_0)[2] = __fieldRead3021409_63();
    __call3021409_64(spill3021409_5, spill3021409_6, spill3021409_9);
    }
    spill3021409_10 = p9;
    if (!((p3 != null))) {
        forestValue3021409_211_0 = spill3021409_10;
        break forest_join_211;
    }
    forestValue3021409_209_0 = __integerCategory3021409_66(__call3021409_65(spill3021409_10));
    }
    if (!((forestValue3021409_209_0 == 0))) {
        break forest_join_232;
    }
    forestValue3021409_211_0 = p9;
    }
    spill3021409_11 = __call3021409_67(forestValue3021409_211_0);
    spill3021409_12 = __call3021409_70(__call3021409_69(__call3021409_68(), life13_190));
    java.nio.file.OpenOption[] __stackOp3021409_71_0 = new java.nio.file.OpenOption[3];
    spill3021409_13 = __stackOp3021409_71_0;
    (__stackOp3021409_71_0)[0] = __fieldRead3021409_72();
    java.nio.file.OpenOption[] __stackOp3021409_73_0 = spill3021409_13;
    spill3021409_14 = __stackOp3021409_73_0;
    (__stackOp3021409_73_0)[1] = __fieldRead3021409_74();
    java.nio.file.OpenOption[] __stackOp3021409_75_0 = spill3021409_14;
    spill3021409_15 = __stackOp3021409_75_0;
    (__stackOp3021409_75_0)[2] = __fieldRead3021409_76();
    __call3021409_77(spill3021409_11, spill3021409_12, spill3021409_15);
    }
    continue forest_cycle_48;
    }
    }
    }
    }
    break forest_join_436;
    }
    forest_cycle_234: while (true) {
    forest_join_435: {
    forest_join_434: {
    forest_join_429: {
    forest_join_427: {
    forest_join_421: {
    forest_join_419: {
    forest_join_418: {
    forest_join_397: {
    forest_join_395: {
    forest_join_391: {
    forest_join_282: {
    forest_join_273: {
    forest_join_250: {
    life13_274 = __cast3021409_81(__call3021409_80(__fieldRead3021409_78(p1), p6, __invokedynamic3021409_79()));
    __call3021409_82(life13_274, p8);
    __call3021409_83(life13_274, p9);
    if (!((p3 == null))) {
        break forest_join_250;
    }
    break forest_join_436;
    }
    if (!(__call3021409_84(p5))) {
        break forest_join_436;
    }
    p6 = __cast3021409_86(__call3021409_85(p5));
    life8_297 = new java.io.File(p4, p6);
    spill3021409_16 = life8_297;
    if (!((p3 != null))) {
        forestValue3021409_437_0 = spill3021409_16;
        break forest_join_437;
    }
    if (!((p3 != null))) {
        forestValue3021409_282_0 = spill3021409_16;
        break forest_join_282;
    }
    if (!((!__call3021409_87(spill3021409_16)))) {
        break forest_join_273;
    }
    __call3021409_88(life8_297);
    }
    forestValue3021409_282_0 = new java.io.File(life8_297, __invokedynamic3021409_89(14187, (7025232611423237428L ^ p2)));
    }
    p8 = forestValue3021409_282_0;
    p9 = new java.io.File(life8_297, __invokedynamic3021409_90(10182, (8966604507637753249L ^ p2)));
    life11_342 = __integerCategory3021409_93(__call3021409_92(p6, __invokedynamic3021409_91(4153, (7247004380254442080L ^ p2))));
    spill3021409_17 = life11_342;
    if (!((p3 != null))) {
        forestValue3021409_421_0 = spill3021409_17;
        break forest_join_421;
    }
    if (!((spill3021409_17 != 0))) {
        break forest_join_419;
    }
    life13_396 = __call3021409_103(__invokedynamic3021409_94(27733, (7159954858468503102L ^ p2)), __invokedynamic3021409_95(4942, (3224278522505826613L ^ p2)), __invokedynamic3021409_96(8042, (8800696654587469067L ^ p2)), __invokedynamic3021409_97(11789, (8129527581794741363L ^ p2)), __invokedynamic3021409_98(28126, (822095713923166141L ^ p2)), __invokedynamic3021409_99(9080, (4082310217389187374L ^ p2)), __invokedynamic3021409_100(7257, (4066080766314159649L ^ p2)), __invokedynamic3021409_101(18740, (7721715906838088540L ^ p2)), __invokedynamic3021409_102(28131, (98431471073030050L ^ p2)));
    life12_408 = __call3021409_106(__invokedynamic3021409_104(26395, (3482312658482390343L ^ p2)), __invokedynamic3021409_105(32349, (1836225448048753667L ^ p2)));
    spill3021409_18 = __call3021409_107(p8);
    if (!((p3 != null))) {
        forestValue3021409_395_0 = __integerCategory3021409_108(spill3021409_18);
        break forest_join_395;
    }
    if (!((!spill3021409_18))) {
        break forest_join_391;
    }
    spill3021409_19 = __call3021409_109(p8);
    spill3021409_20 = __call3021409_112(__call3021409_111(__call3021409_110(), life12_408));
    java.nio.file.OpenOption[] __stackOp3021409_113_0 = new java.nio.file.OpenOption[3];
    spill3021409_21 = __stackOp3021409_113_0;
    (__stackOp3021409_113_0)[0] = __fieldRead3021409_114();
    java.nio.file.OpenOption[] __stackOp3021409_115_0 = spill3021409_21;
    spill3021409_22 = __stackOp3021409_115_0;
    (__stackOp3021409_115_0)[1] = __fieldRead3021409_116();
    java.nio.file.OpenOption[] __stackOp3021409_117_0 = spill3021409_22;
    spill3021409_23 = __stackOp3021409_117_0;
    (__stackOp3021409_117_0)[2] = __fieldRead3021409_118();
    __call3021409_119(spill3021409_19, spill3021409_20, spill3021409_23);
    }
    spill3021409_24 = p9;
    if (!((p3 != null))) {
        forestValue3021409_397_0 = spill3021409_24;
        break forest_join_397;
    }
    forestValue3021409_395_0 = __integerCategory3021409_121(__call3021409_120(spill3021409_24));
    }
    if (!((forestValue3021409_395_0 == 0))) {
        break forest_join_418;
    }
    forestValue3021409_397_0 = p9;
    }
    spill3021409_25 = __call3021409_122(forestValue3021409_397_0);
    spill3021409_26 = __call3021409_125(__call3021409_124(__call3021409_123(), life13_396));
    java.nio.file.OpenOption[] __stackOp3021409_126_0 = new java.nio.file.OpenOption[3];
    spill3021409_27 = __stackOp3021409_126_0;
    (__stackOp3021409_126_0)[0] = __fieldRead3021409_127();
    java.nio.file.OpenOption[] __stackOp3021409_128_0 = spill3021409_27;
    spill3021409_28 = __stackOp3021409_128_0;
    (__stackOp3021409_128_0)[1] = __fieldRead3021409_129();
    java.nio.file.OpenOption[] __stackOp3021409_130_0 = spill3021409_28;
    spill3021409_29 = __stackOp3021409_130_0;
    (__stackOp3021409_130_0)[2] = __fieldRead3021409_131();
    __call3021409_132(spill3021409_25, spill3021409_26, spill3021409_29);
    }
    continue forest_cycle_234;
    }
    forestValue3021409_421_0 = __integerCategory3021409_134(__call3021409_133(p8));
    }
    if (!((p3 != null))) {
        forestValue3021409_429_0 = forestValue3021409_421_0;
        break forest_join_429;
    }
    if (!((forestValue3021409_421_0 == 0))) {
        break forest_join_427;
    }
    __call3021409_135(p8);
    }
    forestValue3021409_429_0 = __integerCategory3021409_137(__call3021409_136(p9));
    }
    if (!((p3 != null))) {
        forestValue3021409_434_0 = forestValue3021409_429_0;
        break forest_join_434;
    }
    if (!((forestValue3021409_429_0 == 0))) {
        break forest_join_435;
    }
    forestValue3021409_434_0 = __integerCategory3021409_139(__call3021409_138(p9));
    }
    __discardScalar3021409_140(forestValue3021409_434_0);
    }
    continue forest_cycle_234;
    }
    }
    forestValue3021409_437_0 = p4;
    }
    return forestValue3021409_437_0;
}
public static java.io.File h214_10(java.io.IOException p0) throws Throwable {
    throw __call3021410_0(p0);
}
public static java.io.File h214_11(java.io.IOException p0) throws Throwable {
    throw __call3021411_0(p0);
}
public static java.io.File h214_12(java.io.IOException p0) throws Throwable {
    throw __call3021412_0(p0);
}
public static java.io.File h214_13(java.io.IOException p0) throws Throwable {
    throw __call3021413_0(p0);
}
public static java.io.File h214_14(java.io.IOException p0, com.moon.module.impl.SessionInformation p1, long p2, java.lang.String p3, java.io.File p4, java.util.Iterator p5, java.lang.String p6, java.io.File p7, java.io.File p8, java.io.File p9, int p10, java.util.List p11) throws Throwable {
    java.io.File forestValue3021414_78_0;
    int forestValue3021414_191_0;
    java.io.File forestValue3021414_193_0;
    int forestValue3021414_217_0;
    int forestValue3021414_225_0;
    int forestValue3021414_230_0;
    java.io.File forestValue3021414_233_0;
    com.moon.hD spill3021414_0;
    com.moon.hB spill3021414_1;
    java.io.File spill3021414_2;
    int spill3021414_3;
    boolean spill3021414_4;
    java.nio.file.Path spill3021414_5;
    byte[] spill3021414_6;
    java.nio.file.OpenOption[] spill3021414_7;
    java.nio.file.OpenOption[] spill3021414_8;
    java.nio.file.OpenOption[] spill3021414_9;
    java.io.File spill3021414_10;
    java.nio.file.Path spill3021414_11;
    byte[] spill3021414_12;
    java.nio.file.OpenOption[] spill3021414_13;
    java.nio.file.OpenOption[] spill3021414_14;
    java.nio.file.OpenOption[] spill3021414_15;
    java.io.IOException life13_2;
    com.moon.gM life13_38;
    java.io.File life8_61;
    int life11_106;
    java.util.List life13_160;
    java.util.List life12_172;
    forest_join_233: {
    forest_join_232: {
    life13_2 = p0;
    spill3021414_0 = __call3021414_1(__call3021414_0());
    spill3021414_1 = __call3021414_4(__call3021414_2(), __invokedynamic3021414_3(28604, (4787547354457402868L ^ p2)));
    java.lang.String __stackOp3021414_6_0 = p6;
    java.lang.String __stackOp3021414_6_1 = __invokedynamic3021414_5(5657, (2833585527217656924L ^ p2));
    __call3021414_14(spill3021414_0, __call3021414_13(__call3021414_12(__call3021414_10(__call3021414_8(spill3021414_1, __invokedynamic3021414_7(__stackOp3021414_6_1, __stackOp3021414_6_0)), __fieldRead3021414_9()), __invokedynamic3021414_11(28399, (2177669072019407400L ^ p2)))));
    forest_cycle_30: while (true) {
    forest_join_231: {
    forest_join_230: {
    forest_join_225: {
    forest_join_223: {
    forest_join_217: {
    forest_join_215: {
    forest_join_214: {
    forest_join_193: {
    forest_join_191: {
    forest_join_187: {
    forest_join_78: {
    forest_join_69: {
    forest_join_46: {
    life13_38 = __cast3021414_18(__call3021414_17(__fieldRead3021414_15(p1), p6, __invokedynamic3021414_16()));
    __call3021414_19(life13_38, p8);
    __call3021414_20(life13_38, p9);
    if (!((p3 == null))) {
        break forest_join_46;
    }
    break forest_join_232;
    }
    if (!(__call3021414_21(p5))) {
        break forest_join_232;
    }
    p6 = __cast3021414_23(__call3021414_22(p5));
    life8_61 = new java.io.File(p4, p6);
    spill3021414_2 = life8_61;
    if (!((p3 != null))) {
        forestValue3021414_233_0 = spill3021414_2;
        break forest_join_233;
    }
    if (!((p3 != null))) {
        forestValue3021414_78_0 = spill3021414_2;
        break forest_join_78;
    }
    if (!((!__call3021414_24(spill3021414_2)))) {
        break forest_join_69;
    }
    __call3021414_25(life8_61);
    }
    forestValue3021414_78_0 = new java.io.File(life8_61, __invokedynamic3021414_26(14187, (7025232611423237428L ^ p2)));
    }
    p8 = forestValue3021414_78_0;
    p9 = new java.io.File(life8_61, __invokedynamic3021414_27(10182, (8966604507637753249L ^ p2)));
    life11_106 = __integerCategory3021414_30(__call3021414_29(p6, __invokedynamic3021414_28(4153, (7247004380254442080L ^ p2))));
    spill3021414_3 = life11_106;
    if (!((p3 != null))) {
        forestValue3021414_217_0 = spill3021414_3;
        break forest_join_217;
    }
    if (!((spill3021414_3 != 0))) {
        break forest_join_215;
    }
    life13_160 = __call3021414_40(__invokedynamic3021414_31(27733, (7159954858468503102L ^ p2)), __invokedynamic3021414_32(4942, (3224278522505826613L ^ p2)), __invokedynamic3021414_33(8042, (8800696654587469067L ^ p2)), __invokedynamic3021414_34(11789, (8129527581794741363L ^ p2)), __invokedynamic3021414_35(28126, (822095713923166141L ^ p2)), __invokedynamic3021414_36(9080, (4082310217389187374L ^ p2)), __invokedynamic3021414_37(7257, (4066080766314159649L ^ p2)), __invokedynamic3021414_38(18740, (7721715906838088540L ^ p2)), __invokedynamic3021414_39(28131, (98431471073030050L ^ p2)));
    life12_172 = __call3021414_43(__invokedynamic3021414_41(26395, (3482312658482390343L ^ p2)), __invokedynamic3021414_42(32349, (1836225448048753667L ^ p2)));
    spill3021414_4 = __call3021414_44(p8);
    if (!((p3 != null))) {
        forestValue3021414_191_0 = __integerCategory3021414_45(spill3021414_4);
        break forest_join_191;
    }
    if (!((!spill3021414_4))) {
        break forest_join_187;
    }
    spill3021414_5 = __call3021414_46(p8);
    spill3021414_6 = __call3021414_49(__call3021414_48(__call3021414_47(), life12_172));
    java.nio.file.OpenOption[] __stackOp3021414_50_0 = new java.nio.file.OpenOption[3];
    spill3021414_7 = __stackOp3021414_50_0;
    (__stackOp3021414_50_0)[0] = __fieldRead3021414_51();
    java.nio.file.OpenOption[] __stackOp3021414_52_0 = spill3021414_7;
    spill3021414_8 = __stackOp3021414_52_0;
    (__stackOp3021414_52_0)[1] = __fieldRead3021414_53();
    java.nio.file.OpenOption[] __stackOp3021414_54_0 = spill3021414_8;
    spill3021414_9 = __stackOp3021414_54_0;
    (__stackOp3021414_54_0)[2] = __fieldRead3021414_55();
    __call3021414_56(spill3021414_5, spill3021414_6, spill3021414_9);
    }
    spill3021414_10 = p9;
    if (!((p3 != null))) {
        forestValue3021414_193_0 = spill3021414_10;
        break forest_join_193;
    }
    forestValue3021414_191_0 = __integerCategory3021414_58(__call3021414_57(spill3021414_10));
    }
    if (!((forestValue3021414_191_0 == 0))) {
        break forest_join_214;
    }
    forestValue3021414_193_0 = p9;
    }
    spill3021414_11 = __call3021414_59(forestValue3021414_193_0);
    spill3021414_12 = __call3021414_62(__call3021414_61(__call3021414_60(), life13_160));
    java.nio.file.OpenOption[] __stackOp3021414_63_0 = new java.nio.file.OpenOption[3];
    spill3021414_13 = __stackOp3021414_63_0;
    (__stackOp3021414_63_0)[0] = __fieldRead3021414_64();
    java.nio.file.OpenOption[] __stackOp3021414_65_0 = spill3021414_13;
    spill3021414_14 = __stackOp3021414_65_0;
    (__stackOp3021414_65_0)[1] = __fieldRead3021414_66();
    java.nio.file.OpenOption[] __stackOp3021414_67_0 = spill3021414_14;
    spill3021414_15 = __stackOp3021414_67_0;
    (__stackOp3021414_67_0)[2] = __fieldRead3021414_68();
    __call3021414_69(spill3021414_11, spill3021414_12, spill3021414_15);
    }
    continue forest_cycle_30;
    }
    forestValue3021414_217_0 = __integerCategory3021414_71(__call3021414_70(p8));
    }
    if (!((p3 != null))) {
        forestValue3021414_225_0 = forestValue3021414_217_0;
        break forest_join_225;
    }
    if (!((forestValue3021414_217_0 == 0))) {
        break forest_join_223;
    }
    __call3021414_72(p8);
    }
    forestValue3021414_225_0 = __integerCategory3021414_74(__call3021414_73(p9));
    }
    if (!((p3 != null))) {
        forestValue3021414_230_0 = forestValue3021414_225_0;
        break forest_join_230;
    }
    if (!((forestValue3021414_225_0 == 0))) {
        break forest_join_231;
    }
    forestValue3021414_230_0 = __integerCategory3021414_76(__call3021414_75(p9));
    }
    __discardScalar3021414_77(forestValue3021414_230_0);
    }
    continue forest_cycle_30;
    }
    }
    forestValue3021414_233_0 = p4;
    }
    return forestValue3021414_233_0;
}
private static native long __fieldRead214_0() throws Throwable;
private static native java.lang.String __call214_1() throws Throwable;
private static native com.moon.runtime.ClientContext __call214_2() throws Throwable;
private static native java.io.File __call214_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.String __invokedynamic214_4(int a0, long a1) throws Throwable;
private static native boolean __call214_5(java.io.File a0) throws Throwable;
private static native int __integerCategory214_6(boolean value) throws Throwable;
private static native boolean __call214_7(java.io.File a0) throws Throwable;
private static native int __integerCategory214_8(boolean value) throws Throwable;
private static native void __discardScalar214_9(int a0) throws Throwable;
private static native com.moon.setting.StringListSetting __fieldRead214_10(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.util.List __call214_11(com.moon.setting.StringListSetting a0) throws Throwable;
private static native java.util.Iterator __call214_12(java.util.List a0) throws Throwable;
private static native boolean __call214_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call214_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast214_15(java.lang.Object a0) throws Throwable;
private static native boolean __call214_16(java.io.File a0) throws Throwable;
private static native boolean __call214_17(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic214_18(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_20(int a0, long a1) throws Throwable;
private static native boolean __call214_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory214_22(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic214_23(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_24(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_25(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_28(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_29(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_30(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_31(int a0, long a1) throws Throwable;
private static native java.util.List __call214_32(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7, java.lang.String a8) throws Throwable;
private static native java.lang.String __invokedynamic214_33(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic214_34(int a0, long a1) throws Throwable;
private static native java.util.List __call214_35(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call214_36(java.io.File a0) throws Throwable;
private static native int __integerCategory214_37(boolean value) throws Throwable;
private static native java.nio.file.Path __call214_38(java.io.File a0) throws Throwable;
private static native java.lang.String __call214_39() throws Throwable;
private static native java.lang.String __call214_40(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call214_41(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead214_43() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead214_45() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead214_47() throws Throwable;
private static native java.nio.file.Path __call214_48(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native boolean __call214_49(java.io.File a0) throws Throwable;
private static native int __integerCategory214_50(boolean value) throws Throwable;
private static native java.nio.file.Path __call214_51(java.io.File a0) throws Throwable;
private static native java.lang.String __call214_52() throws Throwable;
private static native java.lang.String __call214_53(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call214_54(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead214_56() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead214_58() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead214_60() throws Throwable;
private static native java.nio.file.Path __call214_61(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native boolean __call214_62(java.io.File a0) throws Throwable;
private static native int __integerCategory214_63(boolean value) throws Throwable;
private static native boolean __call214_64(java.io.File a0) throws Throwable;
private static native boolean __call214_65(java.io.File a0) throws Throwable;
private static native int __integerCategory214_66(boolean value) throws Throwable;
private static native boolean __call214_67(java.io.File a0) throws Throwable;
private static native int __integerCategory214_68(boolean value) throws Throwable;
private static native void __discardScalar214_69(int a0) throws Throwable;
private static native java.util.Map __fieldRead214_70(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.util.function.Function __invokedynamic214_71() throws Throwable;
private static native java.lang.Object __call214_72(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native com.moon.gM __cast214_73(java.lang.Object a0) throws Throwable;
private static native void __call214_74(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native void __call214_75(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native java.lang.Exception __call3021400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021406_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021407_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021408_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3021409_0() throws Throwable;
private static native com.moon.hD __call3021409_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call3021409_2() throws Throwable;
private static native java.lang.String __invokedynamic3021409_3(int a0, long a1) throws Throwable;
private static native com.moon.hB __call3021409_4(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.hB __call3021409_8(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead3021409_9() throws Throwable;
private static native com.moon.hB __call3021409_10(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic3021409_11(int a0, long a1) throws Throwable;
private static native com.moon.hB __call3021409_12(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call3021409_13(com.moon.hB a0) throws Throwable;
private static native void __call3021409_14(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native boolean __call3021409_15(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_16(boolean value) throws Throwable;
private static native boolean __call3021409_17(java.io.File a0) throws Throwable;
private static native boolean __call3021409_18(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_19(boolean value) throws Throwable;
private static native boolean __call3021409_20(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_21(boolean value) throws Throwable;
private static native void __discardScalar3021409_22(int a0) throws Throwable;
private static native java.util.Map __fieldRead3021409_23(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.util.function.Function __invokedynamic3021409_24() throws Throwable;
private static native java.lang.Object __call3021409_25(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native com.moon.gM __cast3021409_26(java.lang.Object a0) throws Throwable;
private static native void __call3021409_27(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native void __call3021409_28(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native boolean __call3021409_29(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3021409_30(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3021409_31(java.lang.Object a0) throws Throwable;
private static native boolean __call3021409_32(java.io.File a0) throws Throwable;
private static native boolean __call3021409_33(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3021409_34(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_35(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_36(int a0, long a1) throws Throwable;
private static native boolean __call3021409_37(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3021409_38(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic3021409_39(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_40(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_41(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_42(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_43(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_44(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_45(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_46(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_47(int a0, long a1) throws Throwable;
private static native java.util.List __call3021409_48(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7, java.lang.String a8) throws Throwable;
private static native java.lang.String __invokedynamic3021409_49(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_50(int a0, long a1) throws Throwable;
private static native java.util.List __call3021409_51(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call3021409_52(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_53(boolean value) throws Throwable;
private static native java.nio.file.Path __call3021409_54(java.io.File a0) throws Throwable;
private static native java.lang.String __call3021409_55() throws Throwable;
private static native java.lang.String __call3021409_56(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call3021409_57(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_59() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_61() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_63() throws Throwable;
private static native java.nio.file.Path __call3021409_64(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native boolean __call3021409_65(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_66(boolean value) throws Throwable;
private static native java.nio.file.Path __call3021409_67(java.io.File a0) throws Throwable;
private static native java.lang.String __call3021409_68() throws Throwable;
private static native java.lang.String __call3021409_69(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call3021409_70(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_72() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_74() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_76() throws Throwable;
private static native java.nio.file.Path __call3021409_77(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native java.util.Map __fieldRead3021409_78(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.util.function.Function __invokedynamic3021409_79() throws Throwable;
private static native java.lang.Object __call3021409_80(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native com.moon.gM __cast3021409_81(java.lang.Object a0) throws Throwable;
private static native void __call3021409_82(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native void __call3021409_83(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native boolean __call3021409_84(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3021409_85(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3021409_86(java.lang.Object a0) throws Throwable;
private static native boolean __call3021409_87(java.io.File a0) throws Throwable;
private static native boolean __call3021409_88(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3021409_89(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_90(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_91(int a0, long a1) throws Throwable;
private static native boolean __call3021409_92(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3021409_93(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic3021409_94(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_95(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_96(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_97(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_98(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_99(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_100(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_101(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_102(int a0, long a1) throws Throwable;
private static native java.util.List __call3021409_103(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7, java.lang.String a8) throws Throwable;
private static native java.lang.String __invokedynamic3021409_104(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021409_105(int a0, long a1) throws Throwable;
private static native java.util.List __call3021409_106(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call3021409_107(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_108(boolean value) throws Throwable;
private static native java.nio.file.Path __call3021409_109(java.io.File a0) throws Throwable;
private static native java.lang.String __call3021409_110() throws Throwable;
private static native java.lang.String __call3021409_111(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call3021409_112(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_114() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_116() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_118() throws Throwable;
private static native java.nio.file.Path __call3021409_119(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native boolean __call3021409_120(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_121(boolean value) throws Throwable;
private static native java.nio.file.Path __call3021409_122(java.io.File a0) throws Throwable;
private static native java.lang.String __call3021409_123() throws Throwable;
private static native java.lang.String __call3021409_124(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call3021409_125(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_127() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_129() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021409_131() throws Throwable;
private static native java.nio.file.Path __call3021409_132(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native boolean __call3021409_133(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_134(boolean value) throws Throwable;
private static native boolean __call3021409_135(java.io.File a0) throws Throwable;
private static native boolean __call3021409_136(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_137(boolean value) throws Throwable;
private static native boolean __call3021409_138(java.io.File a0) throws Throwable;
private static native int __integerCategory3021409_139(boolean value) throws Throwable;
private static native void __discardScalar3021409_140(int a0) throws Throwable;
private static native java.lang.Exception __call3021410_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021411_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021412_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3021413_0(java.io.IOException a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call3021414_0() throws Throwable;
private static native com.moon.hD __call3021414_1(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.hB __call3021414_2() throws Throwable;
private static native java.lang.String __invokedynamic3021414_3(int a0, long a1) throws Throwable;
private static native com.moon.hB __call3021414_4(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_7(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.hB __call3021414_8(com.moon.hB a0, java.lang.String a1) throws Throwable;
private static native com.moon.b8 __fieldRead3021414_9() throws Throwable;
private static native com.moon.hB __call3021414_10(com.moon.hB a0, com.moon.b8 a1) throws Throwable;
private static native long __invokedynamic3021414_11(int a0, long a1) throws Throwable;
private static native com.moon.hB __call3021414_12(com.moon.hB a0, long a1) throws Throwable;
private static native com.moon.hA __call3021414_13(com.moon.hB a0) throws Throwable;
private static native void __call3021414_14(com.moon.hD a0, com.moon.hA a1) throws Throwable;
private static native java.util.Map __fieldRead3021414_15(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.util.function.Function __invokedynamic3021414_16() throws Throwable;
private static native java.lang.Object __call3021414_17(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native com.moon.gM __cast3021414_18(java.lang.Object a0) throws Throwable;
private static native void __call3021414_19(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native void __call3021414_20(com.moon.gM a0, java.io.File a1) throws Throwable;
private static native boolean __call3021414_21(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call3021414_22(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast3021414_23(java.lang.Object a0) throws Throwable;
private static native boolean __call3021414_24(java.io.File a0) throws Throwable;
private static native boolean __call3021414_25(java.io.File a0) throws Throwable;
private static native java.lang.String __invokedynamic3021414_26(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_27(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_28(int a0, long a1) throws Throwable;
private static native boolean __call3021414_29(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory3021414_30(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic3021414_31(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_32(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_33(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_34(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_35(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_36(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_37(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_38(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_39(int a0, long a1) throws Throwable;
private static native java.util.List __call3021414_40(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4, java.lang.String a5, java.lang.String a6, java.lang.String a7, java.lang.String a8) throws Throwable;
private static native java.lang.String __invokedynamic3021414_41(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic3021414_42(int a0, long a1) throws Throwable;
private static native java.util.List __call3021414_43(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __call3021414_44(java.io.File a0) throws Throwable;
private static native int __integerCategory3021414_45(boolean value) throws Throwable;
private static native java.nio.file.Path __call3021414_46(java.io.File a0) throws Throwable;
private static native java.lang.String __call3021414_47() throws Throwable;
private static native java.lang.String __call3021414_48(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call3021414_49(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021414_51() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021414_53() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021414_55() throws Throwable;
private static native java.nio.file.Path __call3021414_56(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native boolean __call3021414_57(java.io.File a0) throws Throwable;
private static native int __integerCategory3021414_58(boolean value) throws Throwable;
private static native java.nio.file.Path __call3021414_59(java.io.File a0) throws Throwable;
private static native java.lang.String __call3021414_60() throws Throwable;
private static native java.lang.String __call3021414_61(java.lang.String a0, java.util.List a1) throws Throwable;
private static native byte[] __call3021414_62(java.lang.String a0) throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021414_64() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021414_66() throws Throwable;
private static native java.nio.file.StandardOpenOption __fieldRead3021414_68() throws Throwable;
private static native java.nio.file.Path __call3021414_69(java.nio.file.Path a0, byte[] a1, java.nio.file.OpenOption[] a2) throws Throwable;
private static native boolean __call3021414_70(java.io.File a0) throws Throwable;
private static native int __integerCategory3021414_71(boolean value) throws Throwable;
private static native boolean __call3021414_72(java.io.File a0) throws Throwable;
private static native boolean __call3021414_73(java.io.File a0) throws Throwable;
private static native int __integerCategory3021414_74(boolean value) throws Throwable;
private static native boolean __call3021414_75(java.io.File a0) throws Throwable;
private static native int __integerCategory3021414_76(boolean value) throws Throwable;
private static native void __discardScalar3021414_77(int a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_ba28d9d1f1727392bbd4(com.moon.module.impl.SessionInformation a0, float a1, double a2, com.moon.module.impl.HUD a3, com.moon.b0 a4, int a5, int a6) throws E;
private static final class __SourceHandler_ba28d9d1f1727392bbd4 {

public static int f216(com.moon.module.impl.SessionInformation receiver, float p0, double p1, com.moon.module.impl.HUD p2, com.moon.b0 p3, int p4, int p5) throws Throwable {
    java.lang.Object forestValue216_29_0;
    int forestValue216_189_0;
    java.lang.String spill216_0;
    com.moon.b0 spill216_1;
    int spill216_2;
    int spill216_3;
    int[] spill216_4;
    int[] spill216_5;
    int[] spill216_6;
    int[] spill216_7;
    int[] spill216_8;
    int[] spill216_9;
    int[] spill216_10;
    int[] spill216_11;
    int[] spill216_12;
    int[] spill216_13;
    int[] spill216_14;
    int[] spill216_15;
    int[] spill216_16;
    int[] spill216_17;
    long life8_3;
    int life11_7;
    java.lang.String life10_8;
    int life12_36;
    long life13_38;
    long life15_47;
    int life17_56;
    int[] life18_94;
    int life12_117;
    long life15_124;
    int[] life17_163;
    forest_join_190: {
    forest_join_189: {
    forest_join_188: {
    forest_join_119: {
    forest_join_42: {
    forest_join_34: {
    forest_join_29: {
    life8_3 = (__fieldRead216_0() ^ 92571544868090L);
    spill216_0 = __call216_1();
    life11_7 = __call216_2(p3);
    life10_8 = spill216_0;
    spill216_1 = p3;
    if (!((life10_8 != null))) {
        forestValue216_29_0 = spill216_1;
        break forest_join_29;
    }
    if (!((spill216_1 == __fieldRead216_3()))) {
        break forest_join_34;
    }
    p4 = __call216_7(__cast216_6(__call216_5(__call216_4(p2))));
    p5 = __call216_11(__cast216_10(__call216_9(__call216_8(p2))));
    forestValue216_29_0 = __call216_13(__call216_12(p2));
    }
    life11_7 = (__call216_15(__cast216_14(forestValue216_29_0)) + 1);
    }
    life12_36 = -1;
    life13_38 = __call216_16();
    spill216_2 = life11_7;
    if (!((life10_8 != null))) {
        forestValue216_189_0 = spill216_2;
        break forest_join_189;
    }
    switch (spill216_2) {
case 3:
{
        break forest_join_42;
    }
case 2:
{
        break forest_join_119;
    }
default:
{
        break forest_join_188;
    }
}
    }
    life15_47 = ((long) (0x1.8p0d * p1));
    spill216_3 = 25250;
    life17_56 = __call216_19(__call216_18(__call216_17(new java.awt.Color(p4))));
    int[] __stackOp216_21_0 = new int[__invokedynamic216_20(spill216_3, (3300873886152063180L ^ life8_3))];
    spill216_4 = __stackOp216_21_0;
    (__stackOp216_21_0)[0] = p4;
    int[] __stackOp216_22_0 = spill216_4;
    spill216_5 = __stackOp216_22_0;
    (__stackOp216_22_0)[1] = life17_56;
    int[] __stackOp216_23_0 = spill216_5;
    spill216_6 = __stackOp216_23_0;
    (__stackOp216_23_0)[2] = p4;
    int[] __stackOp216_24_0 = spill216_6;
    spill216_7 = __stackOp216_24_0;
    (__stackOp216_24_0)[3] = life17_56;
    int[] __stackOp216_25_0 = spill216_7;
    spill216_8 = __stackOp216_25_0;
    (__stackOp216_25_0)[4] = p4;
    int[] __stackOp216_26_0 = spill216_8;
    spill216_9 = __stackOp216_26_0;
    (__stackOp216_26_0)[5] = life17_56;
    int[] __stackOp216_27_0 = spill216_9;
    spill216_10 = __stackOp216_27_0;
    (__stackOp216_27_0)[__invokedynamic216_28(25673, (2333640204941557280L ^ life8_3))] = p4;
    life18_94 = spill216_10;
    life12_117 = __call216_30(life18_94, ((double) (((float) ((life13_38 + (((long) ((int) p0)) * __invokedynamic216_29(6794, (1980912296375848384L ^ life8_3)))) % life15_47)) / (((float) life15_47) / 0x1.0p1f))));
    if (!((life10_8 == null))) {
        break forest_join_190;
    }
    }
    life15_124 = ((long) (0x1.8p0d * p1));
    int[] __stackOp216_32_0 = new int[__invokedynamic216_31(18973, (5323080113356394609L ^ life8_3))];
    spill216_11 = __stackOp216_32_0;
    (__stackOp216_32_0)[0] = p4;
    int[] __stackOp216_33_0 = spill216_11;
    spill216_12 = __stackOp216_33_0;
    (__stackOp216_33_0)[1] = p5;
    int[] __stackOp216_34_0 = spill216_12;
    spill216_13 = __stackOp216_34_0;
    (__stackOp216_34_0)[2] = p4;
    int[] __stackOp216_35_0 = spill216_13;
    spill216_14 = __stackOp216_35_0;
    (__stackOp216_35_0)[3] = p5;
    int[] __stackOp216_36_0 = spill216_14;
    spill216_15 = __stackOp216_36_0;
    (__stackOp216_36_0)[4] = p4;
    int[] __stackOp216_37_0 = spill216_15;
    spill216_16 = __stackOp216_37_0;
    (__stackOp216_37_0)[5] = p5;
    int[] __stackOp216_38_0 = spill216_16;
    spill216_17 = __stackOp216_38_0;
    (__stackOp216_38_0)[__invokedynamic216_39(3923, (6104698135234188606L ^ life8_3))] = p4;
    life17_163 = spill216_17;
    life12_117 = __call216_41(life17_163, ((double) (((float) ((life13_38 + (((long) ((int) p0)) * __invokedynamic216_40(13775, (1490932849980121729L ^ life8_3)))) % life15_124)) / (((float) life15_124) / 0x1.0p1f))));
    if (!((life10_8 == null))) {
        break forest_join_190;
    }
    }
    forestValue216_189_0 = p4;
    }
    return forestValue216_189_0;
    }
    return life12_117;
}
public static int h216_0(moom.Oo p0) throws Throwable {
    throw __call3021600_0(p0);
}
public static int h216_1(moom.Oo p0) throws Throwable {
    throw __call3021601_0(p0);
}
public static int h216_2(moom.Oo p0) throws Throwable {
    throw __call3021602_0(p0);
}
private static native long __fieldRead216_0() throws Throwable;
private static native java.lang.String __call216_1() throws Throwable;
private static native int __call216_2(com.moon.b0 a0) throws Throwable;
private static native com.moon.b0 __fieldRead216_3() throws Throwable;
private static native com.moon.setting.ColorSetting __call216_4(com.moon.module.impl.HUD a0) throws Throwable;
private static native java.lang.Object __call216_5(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast216_6(java.lang.Object a0) throws Throwable;
private static native int __call216_7(java.lang.Integer a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call216_8(com.moon.module.impl.HUD a0) throws Throwable;
private static native java.lang.Object __call216_9(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast216_10(java.lang.Object a0) throws Throwable;
private static native int __call216_11(java.lang.Integer a0) throws Throwable;
private static native com.moon.setting.ModeSetting __call216_12(com.moon.module.impl.HUD a0) throws Throwable;
private static native java.lang.Object __call216_13(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bY __cast216_14(java.lang.Object a0) throws Throwable;
private static native int __call216_15(com.moon.bY a0) throws Throwable;
private static native long __call216_16() throws Throwable;
private static native java.awt.Color __call216_17(java.awt.Color a0) throws Throwable;
private static native java.awt.Color __call216_18(java.awt.Color a0) throws Throwable;
private static native int __call216_19(java.awt.Color a0) throws Throwable;
private static native int __invokedynamic216_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic216_28(int a0, long a1) throws Throwable;
private static native long __invokedynamic216_29(int a0, long a1) throws Throwable;
private static native int __call216_30(int[] a0, double a1) throws Throwable;
private static native int __invokedynamic216_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic216_39(int a0, long a1) throws Throwable;
private static native long __invokedynamic216_40(int a0, long a1) throws Throwable;
private static native int __call216_41(int[] a0, double a1) throws Throwable;
private static native java.lang.Exception __call3021600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3021601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3021602_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3511c4362dc3f0feb193(com.moon.module.impl.SessionInformation a0, int a1, int a2, float a3, float a4, float a5, float a6) throws E;
private static final class __SourceHandler_3511c4362dc3f0feb193 {

public static boolean f95(com.moon.module.impl.SessionInformation receiver, int p0, int p1, float p2, float p3, float p4, float p5) throws Throwable {
    int forwardValue95_19_0;
    int forwardValue95_26_0;
    int forwardValue95_35_0;
    int forwardValue95_39_0;
    int forwardValue95_41_0;
    int spill95_0;
    long life7_3;
    java.lang.String life9_5;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_35: {
    forward_join_26: {
    forward_join_19: {
    life7_3 = (__fieldRead95_0() ^ 122269231225383L);
    life9_5 = __call95_1();
    spill95_0 = __numericCompare95_2(((float) p0), p2);
    if (!((life9_5 != null))) {
        forwardValue95_19_0 = spill95_0;
        break forward_join_19;
    }
    if (!((spill95_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue95_19_0 = __numericCompare95_3(((float) p0), (p2 + p4));
    }
    if (!((life9_5 != null))) {
        forwardValue95_26_0 = forwardValue95_19_0;
        break forward_join_26;
    }
    if (!((forwardValue95_19_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue95_26_0 = __numericCompare95_4(((float) p1), p3);
    }
    if (!((life9_5 != null))) {
        forwardValue95_35_0 = forwardValue95_26_0;
        break forward_join_35;
    }
    if (!((forwardValue95_26_0 >= 0))) {
        break forward_join_40;
    }
    forwardValue95_35_0 = __numericCompare95_5(((float) p1), (p3 + p5));
    }
    if (!((life9_5 != null))) {
        forwardValue95_39_0 = forwardValue95_35_0;
        break forward_join_39;
    }
    if (!((forwardValue95_35_0 <= 0))) {
        break forward_join_40;
    }
    forwardValue95_39_0 = 1;
    }
    forwardValue95_41_0 = forwardValue95_39_0;
    break forward_join_41;
    }
    forwardValue95_41_0 = 0;
    }
    return __integerCategory95_6(forwardValue95_41_0);
}
public static boolean h95_0(moom.Oo p0) throws Throwable {
    throw __call2009500_0(p0);
}
public static boolean h95_1(moom.Oo p0) throws Throwable {
    throw __call2009501_0(p0);
}
public static boolean h95_2(moom.Oo p0) throws Throwable {
    throw __call2009502_0(p0);
}
public static boolean h95_3(moom.Oo p0) throws Throwable {
    throw __call2009503_0(p0);
}
public static boolean h95_4(moom.Oo p0) throws Throwable {
    throw __call2009504_0(p0);
}
public static boolean h95_5(moom.Oo p0) throws Throwable {
    throw __call2009505_0(p0);
}
public static boolean h95_6(moom.Oo p0) throws Throwable {
    throw __call2009506_0(p0);
}
private static native long __fieldRead95_0() throws Throwable;
private static native java.lang.String __call95_1() throws Throwable;
private static native int __numericCompare95_2(float a0, float a1) throws Throwable;
private static native int __numericCompare95_3(float a0, float a1) throws Throwable;
private static native int __numericCompare95_4(float a0, float a1) throws Throwable;
private static native int __numericCompare95_5(float a0, float a1) throws Throwable;
private static native boolean __integerCategory95_6(int value) throws Throwable;
private static native java.lang.Exception __call2009500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2009501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2009502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2009503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2009504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2009505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call2009506_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3eff4b7622fb7725c204(com.moon.module.impl.SessionInformation a0, com.moon.ej a1) throws E;
private static final class __SourceHandler_3eff4b7622fb7725c204 {

public static void f503(com.moon.module.impl.SessionInformation receiver, com.moon.ej p0) throws Throwable {
    com.moon.hW forwardValue503_25_0;
    com.moon.hW spill503_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_27: {
    forward_join_25: {
    life2_3 = (__fieldRead503_0() ^ 50379759809509L);
    life4_5 = __call503_1();
    spill503_0 = __fieldRead503_2(receiver);
    if (!((life4_5 != null))) {
        forwardValue503_25_0 = spill503_0;
        break forward_join_25;
    }
    if (!((spill503_0 != null))) {
        break forward_join_27;
    }
    __call503_11(__call503_6(__cast503_5(__call503_4(__fieldRead503_3(receiver)))), __call503_10(__cast503_9(__call503_8(__fieldRead503_7(receiver)))), 0x1.0p0f);
    forwardValue503_25_0 = __fieldRead503_12(receiver);
    }
    __call503_13(forwardValue503_25_0);
    __call503_14();
    }
    return;
}
public static void h503_0(moom.Oo p0) throws Throwable {
    throw __call1050300_0(p0);
}
public static void h503_1(moom.Oo p0) throws Throwable {
    throw __call1050301_0(p0);
}
private static native long __fieldRead503_0() throws Throwable;
private static native java.lang.String __call503_1() throws Throwable;
private static native com.moon.hW __fieldRead503_2(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead503_3(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call503_4(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast503_5(java.lang.Object a0) throws Throwable;
private static native float __call503_6(java.lang.Float a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead503_7(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call503_8(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast503_9(java.lang.Object a0) throws Throwable;
private static native float __call503_10(java.lang.Float a0) throws Throwable;
private static native void __call503_11(float a0, float a1, float a2) throws Throwable;
private static native com.moon.hW __fieldRead503_12(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __call503_13(com.moon.hW a0) throws Throwable;
private static native void __call503_14() throws Throwable;
private static native java.lang.Exception __call1050300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_98a4c5d8d0fc4651760d(com.moon.module.impl.SessionInformation a0, com.moon.event.PacketEvent a1) throws E;
private static final class __SourceHandler_98a4c5d8d0fc4651760d {

public static void f504(com.moon.module.impl.SessionInformation receiver, com.moon.event.PacketEvent p0) throws Throwable {
    moom.yK forwardValue504_15_0;
    int forwardValue504_24_0;
    java.lang.String spill504_0;
    moom.yK spill504_1;
    byte spill504_2;
    long life2_3;
    moom.yK life6_7;
    java.lang.String life4_8;
    moom.zv life5_22;
    forward_join_31: {
    forward_join_26: {
    forward_join_24: {
    forward_join_15: {
    life2_3 = (__fieldRead504_0() ^ 4235224588444L);
    spill504_0 = __call504_1();
    life6_7 = __call504_2(p0);
    life4_8 = spill504_0;
    spill504_1 = life6_7;
    if (!((life4_8 != null))) {
        forwardValue504_15_0 = spill504_1;
        break forward_join_15;
    }
    if (!((__instanceOf504_3(spill504_1) != 0))) {
        break forward_join_31;
    }
    forwardValue504_15_0 = life6_7;
    }
    life5_22 = __cast504_4(forwardValue504_15_0);
    spill504_2 = __call504_5(life5_22);
    if (!((life4_8 != null))) {
        forwardValue504_24_0 = __integerCategory504_6(spill504_2);
        break forward_join_24;
    }
    if (!((spill504_2 != 0))) {
        break forward_join_26;
    }
    forwardValue504_24_0 = __integerCategory504_8(__call504_7(life5_22));
    }
    if (!((forwardValue504_24_0 == 1))) {
        break forward_join_31;
    }
    }
    __call504_11(receiver, __call504_10(__call504_9(life5_22)));
    }
    return;
}
public static void h504_0(moom.Oo p0) throws Throwable {
    throw __call1050400_0(p0);
}
public static void h504_1(moom.Oo p0) throws Throwable {
    throw __call1050401_0(p0);
}
public static void h504_2(moom.Oo p0) throws Throwable {
    throw __call1050402_0(p0);
}
public static void h504_3(moom.Oo p0) throws Throwable {
    throw __call1050403_0(p0);
}
public static void h504_4(moom.Oo p0) throws Throwable {
    throw __call1050404_0(p0);
}
private static native long __fieldRead504_0() throws Throwable;
private static native java.lang.String __call504_1() throws Throwable;
private static native moom.yK __call504_2(com.moon.event.PacketEvent a0) throws Throwable;
private static native int __instanceOf504_3(moom.yK a0) throws Throwable;
private static native moom.zv __cast504_4(moom.yK a0) throws Throwable;
private static native byte __call504_5(moom.zv a0) throws Throwable;
private static native int __integerCategory504_6(byte value) throws Throwable;
private static native byte __call504_7(moom.zv a0) throws Throwable;
private static native int __integerCategory504_8(byte value) throws Throwable;
private static native net.minecraft.util.IChatComponent __call504_9(moom.zv a0) throws Throwable;
private static native java.lang.String __call504_10(net.minecraft.util.IChatComponent a0) throws Throwable;
private static native void __call504_11(com.moon.module.impl.SessionInformation a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1050400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050404_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_392b8bda3ef3c9af9dfc(com.moon.module.impl.SessionInformation a0, com.moon.event.Render2DEvent a1) throws E;
private static final class __SourceHandler_392b8bda3ef3c9af9dfc {

public static void f200005(com.moon.module.impl.SessionInformation receiver, com.moon.event.Render2DEvent p0) throws Throwable {
    java.lang.Object forestValue200005_27_0;
    com.moon.gN forestValue200005_35_0;
    int forestValue200005_104_0;
    int forestValue200005_114_0;
    int forestValue200005_120_0;
    int forestValue200005_127_0;
    com.moon.module.impl.SessionInformation forestValue200005_180_0;
    com.moon.module.impl.SessionInformation forestValue200005_183_0;
    com.moon.module.impl.SessionInformation forestValue200005_235_0;
    com.moon.module.impl.SessionInformation forestValue200005_256_0;
    java.lang.Object forestValue200005_270_0;
    com.moon.hW forestValue200005_341_0;
    com.moon.hW forestValue200005_350_0;
    com.moon.hW forestValue200005_359_0;
    com.moon.hW forestValue200005_370_0;
    com.moon.module.impl.SessionInformation forestValue200005_412_0;
    com.moon.hW forestValue200005_447_0;
    float forestValue200005_447_1;
    float forestValue200005_447_2;
    float forestValue200005_447_3;
    float forestValue200005_447_4;
    float forestValue200005_447_5;
    com.moon.aO forestValue200005_447_6;
    int forestValue200005_447_7;
    com.moon.hW forestValue200005_450_0;
    float forestValue200005_450_1;
    float forestValue200005_450_2;
    float forestValue200005_450_3;
    float forestValue200005_450_4;
    float forestValue200005_450_5;
    com.moon.aO forestValue200005_450_6;
    com.moon.hW forestValue200005_451_0;
    float forestValue200005_451_1;
    float forestValue200005_451_2;
    float forestValue200005_451_3;
    float forestValue200005_451_4;
    float forestValue200005_451_5;
    com.moon.aO forestValue200005_451_6;
    float forestValue200005_451_7;
    java.lang.String spill200005_0;
    moom.jL spill200005_1;
    com.moon.gN spill200005_2;
    boolean spill200005_3;
    com.moon.module.impl.SessionInformation spill200005_4;
    com.moon.module.impl.SessionInformation spill200005_5;
    com.moon.module.impl.SessionInformation spill200005_6;
    com.moon.module.impl.SessionInformation spill200005_7;
    com.moon.module.impl.SessionInformation spill200005_8;
    com.moon.module.impl.SessionInformation spill200005_9;
    com.moon.module.impl.Effects spill200005_10;
    com.moon.hW spill200005_11;
    com.moon.module.impl.SessionInformation spill200005_12;
    com.moon.hW spill200005_13;
    float spill200005_14;
    float spill200005_15;
    float spill200005_16;
    float spill200005_17;
    float spill200005_18;
    com.moon.aO spill200005_19;
    boolean spill200005_20;
    long life2_3;
    java.lang.String life5_10;
    int life6_12;
    java.lang.String life4_13;
    moom.DD life7_15;
    com.moon.gN life8_30;
    java.lang.String life5_46;
    moom.DN life8_57;
    int life9_62;
    int life10_67;
    int life11_98;
    com.moon.jn life12_266;
    float life13_300;
    float life14_310;
    float life15_320;
    float life16_324;
    float life17_328;
    float life18_330;
    float life19_339;
    int life20_458;
    float life21_575;
    java.util.Iterator life22_579;
    com.moon.gO life23_586;
    java.lang.String life24_591;
    java.lang.String life25_594;
    float life26_597;
    com.moon.jr life27_605;
    float life28_610;
    float life29_615;
    forest_join_655: {
    forest_join_652: {
    forest_join_451: {
    forest_join_450: {
    forest_join_447: {
    forest_join_412: {
    forest_join_375: {
    forest_join_370: {
    forest_join_366: {
    forest_join_359: {
    forest_join_357: {
    forest_join_350: {
    forest_join_348: {
    forest_join_341: {
    forest_join_339: {
    forest_join_270: {
    forest_join_267: {
    forest_join_256: {
    forest_join_255: {
    forest_join_235: {
    forest_join_234: {
    forest_join_183: {
    forest_join_182: {
    forest_join_180: {
    forest_join_151: {
    forest_join_127: {
    forest_join_120: {
    forest_join_114: {
    forest_join_112: {
    forest_join_104: {
    forest_join_103: {
    forest_join_47: {
    forest_join_43: {
    forest_join_39: {
    forest_join_35: {
    forest_join_27: {
    life2_3 = (__fieldRead200005_0() ^ 35324492527034L);
    spill200005_0 = __call200005_1();
    life5_10 = __invokedynamic200005_2(32523, (6468436043282458513L ^ life2_3));
    life6_12 = 1;
    life4_13 = spill200005_0;
    life7_15 = null;
    spill200005_1 = __call200005_4(__fieldRead200005_3());
    if (!((life4_13 != null))) {
        forestValue200005_27_0 = spill200005_1;
        break forest_join_27;
    }
    if (!((spill200005_1 != null))) {
        break forest_join_43;
    }
    forestValue200005_27_0 = __call200005_9(__fieldRead200005_5(receiver), __call200005_7(__fieldRead200005_6()), __invokedynamic200005_8());
    }
    life8_30 = __cast200005_10(forestValue200005_27_0);
    spill200005_2 = life8_30;
    if (!((life4_13 != null))) {
        forestValue200005_35_0 = spill200005_2;
        break forest_join_35;
    }
    if (!(__call200005_11(spill200005_2))) {
        break forest_join_39;
    }
    forestValue200005_35_0 = life8_30;
    }
    life7_15 = __call200005_12(forestValue200005_35_0);
    life6_12 = 0;
    }
    life5_46 = __localWitness200005(__fieldRead200005_15(__call200005_14(__fieldRead200005_13())));
    life5_46 = life5_46;
    }
    if (!((life6_12 != 0))) {
        break forest_join_47;
    }
    life7_15 = __fieldRead200005_16();
    }
    if (!((__call200005_17(p0) == __fieldRead200005_18()))) {
        break forest_join_655;
    }
    life8_57 = __call200005_19(receiver);
    life9_62 = __call200005_22(__cast200005_21(__call200005_20(life8_57)));
    life10_67 = __call200005_25(__cast200005_24(__call200005_23(life8_57)));
    life11_98 = __integerCategory200005_45(__call200005_44(receiver, life9_62, life10_67, __call200005_29(__cast200005_28(__call200005_27(__fieldRead200005_26(receiver)))), __call200005_33(__cast200005_32(__call200005_31(__fieldRead200005_30(receiver)))), (__fieldRead200005_34(receiver) * __call200005_38(__cast200005_37(__call200005_36(__fieldRead200005_35(receiver))))), (__fieldRead200005_39(receiver) * __call200005_43(__cast200005_42(__call200005_41(__fieldRead200005_40(receiver)))))));
    spill200005_3 = __call200005_46(0);
    if (!((life4_13 != null))) {
        forestValue200005_104_0 = __integerCategory200005_47(spill200005_3);
        break forest_join_104;
    }
    if (!((!spill200005_3))) {
        break forest_join_103;
    }
    __fieldWrite200005_48(receiver, 0);
    }
    forestValue200005_104_0 = life11_98;
    }
    if (!((life4_13 != null))) {
        forestValue200005_114_0 = forestValue200005_104_0;
        break forest_join_114;
    }
    if (!((forestValue200005_104_0 == 0))) {
        break forest_join_112;
    }
    spill200005_4 = receiver;
    if (!((life4_13 != null))) {
        forestValue200005_183_0 = spill200005_4;
        break forest_join_183;
    }
    if (!(__fieldRead200005_49(spill200005_4))) {
        break forest_join_182;
    }
    }
    forestValue200005_114_0 = __integerCategory200005_51(__call200005_50(0));
    }
    if (!((life4_13 != null))) {
        forestValue200005_120_0 = forestValue200005_114_0;
        break forest_join_120;
    }
    if (!((forestValue200005_114_0 != 0))) {
        break forest_join_182;
    }
    forestValue200005_120_0 = __instanceOf200005_54(__fieldRead200005_53(__fieldRead200005_52()));
    }
    if (!((life4_13 != null))) {
        forestValue200005_127_0 = forestValue200005_120_0;
        break forest_join_127;
    }
    if (!((forestValue200005_120_0 != 0))) {
        break forest_join_182;
    }
    spill200005_5 = receiver;
    if (!((life4_13 != null))) {
        forestValue200005_180_0 = spill200005_5;
        break forest_join_180;
    }
    forestValue200005_127_0 = __integerCategory200005_56(__fieldRead200005_55(spill200005_5));
    }
    if (!((forestValue200005_127_0 == 0))) {
        break forest_join_151;
    }
    __fieldWrite200005_61(receiver, (__call200005_60(__cast200005_59(__call200005_58(__fieldRead200005_57(receiver)))) - ((float) life9_62)));
    __fieldWrite200005_66(receiver, (__call200005_65(__cast200005_64(__call200005_63(__fieldRead200005_62(receiver)))) - ((float) life10_67)));
    __fieldWrite200005_67(receiver, 1);
    }
    __call200005_71(__fieldRead200005_68(receiver), __call200005_70((((float) life9_62) + __fieldRead200005_69(receiver))));
    __call200005_75(__fieldRead200005_72(receiver), __call200005_74((((float) life10_67) + __fieldRead200005_73(receiver))));
    __call200005_78(__call200005_77(__fieldRead200005_76(receiver)), 1);
    __call200005_81(__call200005_80(__fieldRead200005_79(receiver)));
    forestValue200005_180_0 = receiver;
    }
    __fieldWrite200005_82(forestValue200005_180_0, 1);
    }
    forestValue200005_183_0 = receiver;
    }
    if (!((life4_13 != null))) {
        forestValue200005_235_0 = forestValue200005_183_0;
        break forest_join_235;
    }
    if (!((__fieldRead200005_83(forestValue200005_183_0) != null))) {
        break forest_join_234;
    }
    spill200005_6 = receiver;
    if (!((life4_13 != null))) {
        forestValue200005_235_0 = spill200005_6;
        break forest_join_235;
    }
    if (!((__fieldRead200005_84(spill200005_6) != null))) {
        break forest_join_234;
    }
    spill200005_7 = receiver;
    if (!((life4_13 != null))) {
        forestValue200005_235_0 = spill200005_7;
        break forest_join_235;
    }
    if (!((__fieldRead200005_85(spill200005_7) != null))) {
        break forest_join_234;
    }
    spill200005_8 = receiver;
    if (!((life4_13 != null))) {
        forestValue200005_235_0 = spill200005_8;
        break forest_join_235;
    }
    if (!((__fieldRead200005_86(spill200005_8) != null))) {
        break forest_join_234;
    }
    __call200005_95(__call200005_90(__cast200005_89(__call200005_88(__fieldRead200005_87(receiver)))), __call200005_94(__cast200005_93(__call200005_92(__fieldRead200005_91(receiver)))), 0x1.0p0f);
    __call200005_96();
    __call200005_98(__fieldRead200005_97(receiver));
    __call200005_100(__fieldRead200005_99(receiver));
    __call200005_102(__fieldRead200005_101(receiver));
    __call200005_105(__call200005_104(__fieldRead200005_103()), life7_15);
    __call200005_107(__fieldRead200005_106(receiver));
    __call200005_108(0);
    __call200005_109();
    }
    forestValue200005_235_0 = receiver;
    }
    if (!(__fieldRead200005_110(forestValue200005_235_0))) {
        break forest_join_655;
    }
    life12_266 = __cast200005_115(__call200005_114(__call200005_112(__call200005_111()), __fieldRead200005_113()));
    spill200005_9 = receiver;
    if (!((life4_13 != null))) {
        forestValue200005_256_0 = spill200005_9;
        break forest_join_256;
    }
    if (!((__fieldRead200005_116(spill200005_9) == null))) {
        break forest_join_255;
    }
    __fieldWrite200005_122(receiver, __cast200005_121(__call200005_120(__call200005_118(__call200005_117()), __classLiteral200005_119())));
    }
    forestValue200005_256_0 = receiver;
    }
    spill200005_10 = __fieldRead200005_123(forestValue200005_256_0);
    if (!((life4_13 != null))) {
        forestValue200005_270_0 = spill200005_10;
        break forest_join_270;
    }
    if (!((spill200005_10 == null))) {
        break forest_join_267;
    }
    __fieldWrite200005_129(receiver, __cast200005_128(__call200005_127(__call200005_125(__call200005_124()), __classLiteral200005_126())));
    }
    forestValue200005_270_0 = __call200005_131(__fieldRead200005_130(receiver));
    }
    life13_300 = __call200005_133(__cast200005_132(forestValue200005_270_0));
    life14_310 = ((__call200005_137(__cast200005_136(__call200005_135(__fieldRead200005_134(receiver)))) * 0x1.0p0f) / life13_300);
    life15_320 = ((__call200005_141(__cast200005_140(__call200005_139(__fieldRead200005_138(receiver)))) * 0x1.0p0f) / life13_300);
    life16_324 = (life14_310 + 0x1.8p2f);
    life17_328 = (life15_320 + 0x1.8p2f);
    life18_330 = 0x1.091112p4f;
    life19_339 = __call200005_144(__fieldRead200005_142(), __invokedynamic200005_143(15956, (1995882629527791353L ^ life2_3)), 0x1.fp2f);
    __fieldWrite200005_145(receiver, (((life19_339 + 0x1.8p3f) + 0x1.0p2f) + life18_330));
    __fieldWrite200005_146(receiver, (((life18_330 * 0x1.0p2f) + 0x1.8p3f) + 0x1.8p2f));
    spill200005_11 = __fieldRead200005_147(receiver);
    if (!((life4_13 != null))) {
        forestValue200005_341_0 = spill200005_11;
        break forest_join_341;
    }
    if (!((spill200005_11 != null))) {
        break forest_join_339;
    }
    __call200005_150(__call200005_149(__fieldRead200005_148(receiver)));
    }
    forestValue200005_341_0 = __fieldRead200005_151(receiver);
    }
    if (!((life4_13 != null))) {
        forestValue200005_350_0 = forestValue200005_341_0;
        break forest_join_350;
    }
    if (!((forestValue200005_341_0 != null))) {
        break forest_join_348;
    }
    __call200005_154(__call200005_153(__fieldRead200005_152(receiver)));
    }
    forestValue200005_350_0 = __fieldRead200005_155(receiver);
    }
    if (!((life4_13 != null))) {
        forestValue200005_359_0 = forestValue200005_350_0;
        break forest_join_359;
    }
    if (!((forestValue200005_350_0 != null))) {
        break forest_join_357;
    }
    __call200005_158(__call200005_157(__fieldRead200005_156(receiver)));
    }
    forestValue200005_359_0 = __fieldRead200005_159(receiver);
    }
    if (!((life4_13 != null))) {
        forestValue200005_370_0 = forestValue200005_359_0;
        break forest_join_370;
    }
    if (!((forestValue200005_359_0 != null))) {
        break forest_join_366;
    }
    __call200005_162(__call200005_161(__fieldRead200005_160(receiver)));
    }
    spill200005_12 = receiver;
    if (!((life4_13 != null))) {
        forestValue200005_412_0 = spill200005_12;
        break forest_join_412;
    }
    forestValue200005_370_0 = __fieldRead200005_163(spill200005_12);
    }
    if (!((forestValue200005_370_0 != null))) {
        break forest_join_375;
    }
    __call200005_166(__call200005_165(__fieldRead200005_164(receiver)));
    }
    __fieldWrite200005_173(receiver, __call200005_172(__call200005_171(__call200005_170(__call200005_169(__call200005_167(), __fieldRead200005_168())))));
    __fieldWrite200005_180(receiver, __call200005_179(__call200005_178(__call200005_177(__call200005_176(__call200005_174(), __fieldRead200005_175())))));
    __fieldWrite200005_188(receiver, __call200005_187(__call200005_186(__call200005_185(__call200005_184(__call200005_183(__call200005_181(), __fieldRead200005_182()), life12_266)))));
    __fieldWrite200005_197(receiver, __call200005_196(__call200005_195(__call200005_193(__call200005_192(__call200005_191(__call200005_189(), __fieldRead200005_190()))), __fieldRead200005_194())));
    forestValue200005_412_0 = receiver;
    }
    __fieldWrite200005_204(forestValue200005_412_0, __call200005_203(__call200005_202(__call200005_201(__call200005_200(__call200005_198(), __fieldRead200005_199())))));
    life20_458 = -1;
    spill200005_13 = __fieldRead200005_205(receiver);
    spill200005_14 = life14_310;
    spill200005_15 = life15_320;
    spill200005_16 = __fieldRead200005_206(receiver);
    spill200005_17 = __fieldRead200005_207(receiver);
    spill200005_18 = 0x1.0p3f;
    spill200005_19 = new com.moon.aO(__call200005_209(__fieldRead200005_208()));
    spill200005_20 = __call200005_211(__fieldRead200005_210(receiver));
    if (!((life4_13 != null))) {
        forestValue200005_447_0 = spill200005_13;
        forestValue200005_447_1 = spill200005_14;
        forestValue200005_447_2 = spill200005_15;
        forestValue200005_447_3 = spill200005_16;
        forestValue200005_447_4 = spill200005_17;
        forestValue200005_447_5 = spill200005_18;
        forestValue200005_447_6 = spill200005_19;
        forestValue200005_447_7 = __integerCategory200005_212(spill200005_20);
        break forest_join_447;
    }
    if (!(spill200005_20)) {
        forestValue200005_450_0 = spill200005_13;
        forestValue200005_450_1 = spill200005_14;
        forestValue200005_450_2 = spill200005_15;
        forestValue200005_450_3 = spill200005_16;
        forestValue200005_450_4 = spill200005_17;
        forestValue200005_450_5 = spill200005_18;
        forestValue200005_450_6 = spill200005_19;
        break forest_join_450;
    }
    forestValue200005_447_0 = spill200005_13;
    forestValue200005_447_1 = spill200005_14;
    forestValue200005_447_2 = spill200005_15;
    forestValue200005_447_3 = spill200005_16;
    forestValue200005_447_4 = spill200005_17;
    forestValue200005_447_5 = spill200005_18;
    forestValue200005_447_6 = spill200005_19;
    forestValue200005_447_7 = __integerCategory200005_218(__call200005_217(__cast200005_216(__call200005_215(__call200005_214(__fieldRead200005_213(receiver))))));
    }
    if (!((forestValue200005_447_7 != 0))) {
        forestValue200005_450_0 = forestValue200005_447_0;
        forestValue200005_450_1 = forestValue200005_447_1;
        forestValue200005_450_2 = forestValue200005_447_2;
        forestValue200005_450_3 = forestValue200005_447_3;
        forestValue200005_450_4 = forestValue200005_447_4;
        forestValue200005_450_5 = forestValue200005_447_5;
        forestValue200005_450_6 = forestValue200005_447_6;
        break forest_join_450;
    }
    forestValue200005_451_0 = forestValue200005_447_0;
    forestValue200005_451_1 = forestValue200005_447_1;
    forestValue200005_451_2 = forestValue200005_447_2;
    forestValue200005_451_3 = forestValue200005_447_3;
    forestValue200005_451_4 = forestValue200005_447_4;
    forestValue200005_451_5 = forestValue200005_447_5;
    forestValue200005_451_6 = forestValue200005_447_6;
    forestValue200005_451_7 = 0x1.19999ap-2f;
    break forest_join_451;
    }
    forestValue200005_451_0 = forestValue200005_450_0;
    forestValue200005_451_1 = forestValue200005_450_1;
    forestValue200005_451_2 = forestValue200005_450_2;
    forestValue200005_451_3 = forestValue200005_450_3;
    forestValue200005_451_4 = forestValue200005_450_4;
    forestValue200005_451_5 = forestValue200005_450_5;
    forestValue200005_451_6 = forestValue200005_450_6;
    forestValue200005_451_7 = 0x1.99999ap-2f;
    }
    __call200005_222(forestValue200005_451_0, __call200005_221(forestValue200005_451_1, forestValue200005_451_2, forestValue200005_451_3, forestValue200005_451_4, forestValue200005_451_5, __call200005_220(__call200005_219(forestValue200005_451_6, forestValue200005_451_7))));
    __call200005_229(__fieldRead200005_223(receiver), __call200005_228((life14_310 - 0x1.ccccccp-2f), (life15_320 - 0x1.ccccccp-2f), (__fieldRead200005_224(receiver) + 0x1.ccccccp-1f), (__fieldRead200005_225(receiver) + 0x1.ccccccp-1f), 0x1.1p3f, __call200005_227(__fieldRead200005_226())));
    __call200005_235(__fieldRead200005_230(), __fieldRead200005_231(receiver), __invokedynamic200005_232(28604, (4787590866651461429L ^ life2_3)), 0x1.fp2f, (((life14_310 + 0x1.8p2f) + life18_330) + 0x1.0p2f), ((((life15_320 + 0x1.8p2f) + (life18_330 / 0x1.0p1f)) - (__call200005_234(__fieldRead200005_233(), 0x1.fp2f) / 0x1.0p1f)) + 0x1.0p-1f), life20_458, 1, 0, 0x0.0p0f);
    __call200005_238(__fieldRead200005_236(receiver), __call200005_237(life16_324, life17_328, (life16_324 + life18_330), (life17_328 + life18_330), 0x0.0p0f, 0x0.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.2p2f, -1));
    life21_575 = ((life17_328 + life18_330) + 0x1.0p1f);
    life22_579 = __call200005_240(__fieldRead200005_239(receiver));
    forest_cycle_540: while (true) {
    if (!(__call200005_241(life22_579))) {
        break forest_join_652;
    }
    life23_586 = __cast200005_243(__call200005_242(life22_579));
    life24_591 = __cast200005_246(__call200005_245(__call200005_244(life23_586)));
    life25_594 = __call200005_247(life23_586);
    life26_597 = __call200005_248(life23_586);
    life27_605 = __call200005_252(__call200005_250(__call200005_249(life12_266)), __call200005_251(life25_594, 0));
    life28_610 = (__call200005_253(life27_605) * 0x1.2p3f);
    life29_615 = (__call200005_254(life27_605) * 0x1.2p3f);
    __call200005_257(__fieldRead200005_255(), __fieldRead200005_256(receiver), life24_591, 0x1.9p2f, (((life14_310 + 0x1.8p2f) + life18_330) + 0x1.0p2f), (life21_575 + 0x1.6p2f), life20_458);
    __call200005_260(life12_266, __fieldRead200005_258(receiver), life25_594, 0x1.2p3f, (((life14_310 + 0x1.8p2f) + (life18_330 / 0x1.0p1f)) - (life28_610 / 0x1.0p1f)), (((life21_575 + (life18_330 / 0x1.0p1f)) - (life29_615 / 0x1.0p2f)) - life26_597), __invokedynamic200005_259(29751, (8352689519201521432L ^ life2_3)));
    __call200005_264(__fieldRead200005_261(receiver), __call200005_263((life14_310 + 0x1.8p2f), life21_575, life18_330, life18_330, 0x1.2p2f, __invokedynamic200005_262(14752, (6479757624814715528L ^ life2_3))));
    life21_575 = (life21_575 + (life18_330 + 0x1.0p1f));
    if (!((life4_13 != null))) {
        break forest_join_655;
    }
    if (!((life4_13 == null))) {
        continue forest_cycle_540;
    }
    break forest_cycle_540;
    }
    }
    __fieldWrite200005_265(receiver, 0);
    }
    return;
}

public static void h200005_0(moom.Oo p0) throws Throwable {
    throw __call23000500_0(p0);
}
public static void h200005_1(moom.Oo p0) throws Throwable {
    throw __call23000501_0(p0);
}
public static void h200005_2(moom.Oo p0) throws Throwable {
    throw __call23000502_0(p0);
}
public static void h200005_3(moom.Oo p0) throws Throwable {
    throw __call23000503_0(p0);
}
public static void h200005_4(moom.Oo p0) throws Throwable {
    throw __call23000504_0(p0);
}
public static void h200005_5(moom.Oo p0) throws Throwable {
    throw __call23000505_0(p0);
}
public static void h200005_6(moom.Oo p0) throws Throwable {
    throw __call23000506_0(p0);
}
public static void h200005_7(moom.Oo p0) throws Throwable {
    throw __call23000507_0(p0);
}
public static void h200005_8(moom.Oo p0) throws Throwable {
    throw __call23000508_0(p0);
}
public static void h200005_9(moom.Oo p0) throws Throwable {
    throw __call23000509_0(p0);
}
public static void h200005_10(moom.Oo p0) throws Throwable {
    throw __call23000510_0(p0);
}
public static void h200005_11(moom.Oo p0) throws Throwable {
    throw __call23000511_0(p0);
}
public static void h200005_12(moom.Oo p0) throws Throwable {
    throw __call23000512_0(p0);
}
public static void h200005_13(moom.Oo p0) throws Throwable {
    throw __call23000513_0(p0);
}
public static void h200005_14(moom.Oo p0) throws Throwable {
    throw __call23000514_0(p0);
}
public static void h200005_15(moom.Oo p0) throws Throwable {
    throw __call23000515_0(p0);
}
public static void h200005_16(moom.Oo p0) throws Throwable {
    throw __call23000516_0(p0);
}
public static void h200005_17(moom.Oo p0) throws Throwable {
    throw __call23000517_0(p0);
}
public static void h200005_18(moom.Oo p0) throws Throwable {
    throw __call23000518_0(p0);
}
public static void h200005_19(moom.Oo p0) throws Throwable {
    throw __call23000519_0(p0);
}
public static void h200005_20(moom.Oo p0) throws Throwable {
    throw __call23000520_0(p0);
}
public static void h200005_21(moom.Oo p0) throws Throwable {
    throw __call23000521_0(p0);
}
public static void h200005_22(moom.Oo p0) throws Throwable {
    throw __call23000522_0(p0);
}
public static void h200005_23(moom.Oo p0) throws Throwable {
    throw __call23000523_0(p0);
}
public static void h200005_24(moom.Oo p0) throws Throwable {
    throw __call23000524_0(p0);
}
public static void h200005_25(moom.Oo p0) throws Throwable {
    throw __call23000525_0(p0);
}
public static void h200005_26(moom.Oo p0) throws Throwable {
    throw __call23000526_0(p0);
}
public static void h200005_27(moom.Oo p0) throws Throwable {
    throw __call23000527_0(p0);
}
public static void h200005_28(moom.Oo p0) throws Throwable {
    throw __call23000528_0(p0);
}
public static void h200005_29(moom.Oo p0) throws Throwable {
    throw __call23000529_0(p0);
}
public static void h200005_30(moom.Oo p0) throws Throwable {
    throw __call23000530_0(p0);
}
public static void h200005_31(moom.Oo p0) throws Throwable {
    throw __call23000531_0(p0);
}
public static void h200005_32(moom.Oo p0) throws Throwable {
    throw __call23000532_0(p0);
}
public static void h200005_33(moom.Oo p0) throws Throwable {
    throw __call23000533_0(p0);
}
public static void h200005_34(moom.Oo p0) throws Throwable {
    throw __call23000534_0(p0);
}
public static void h200005_35(moom.Oo p0) throws Throwable {
    throw __call23000535_0(p0);
}
public static void h200005_36(moom.Oo p0) throws Throwable {
    throw __call23000536_0(p0);
}
public static void h200005_37(moom.Oo p0) throws Throwable {
    throw __call23000537_0(p0);
}
public static void h200005_38(moom.Oo p0) throws Throwable {
    throw __call23000538_0(p0);
}
public static void h200005_39(moom.Oo p0) throws Throwable {
    throw __call23000539_0(p0);
}
public static void h200005_40(moom.Oo p0) throws Throwable {
    throw __call23000540_0(p0);
}
public static void h200005_41(moom.Oo p0) throws Throwable {
    throw __call23000541_0(p0);
}
private static native long __fieldRead200005_0() throws Throwable;
private static native java.lang.String __call200005_1() throws Throwable;
private static native java.lang.String __invokedynamic200005_2(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200005_3() throws Throwable;
private static native moom.jL __call200005_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.Map __fieldRead200005_5(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200005_6() throws Throwable;
private static native moom.jL __call200005_7(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.function.Function __invokedynamic200005_8() throws Throwable;
private static native java.lang.Object __call200005_9(java.util.Map a0, moom.jL a1, java.util.function.Function a2) throws Throwable;
private static native com.moon.gN __cast200005_10(java.lang.Object a0) throws Throwable;
private static native boolean __call200005_11(com.moon.gN a0) throws Throwable;
private static native moom.DD __call200005_12(com.moon.gN a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200005_13() throws Throwable;
private static native moom.jL __call200005_14(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __fieldRead200005_15(moom.jL a0) throws Throwable;
private static native moom.DD __fieldRead200005_16() throws Throwable;
private static native com.moon.event.RenderPhase __call200005_17(com.moon.event.Render2DEvent a0) throws Throwable;
private static native com.moon.event.RenderPhase __fieldRead200005_18() throws Throwable;
private static native moom.DN __call200005_19(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_20(moom.DN a0) throws Throwable;
private static native java.lang.Integer __cast200005_21(java.lang.Object a0) throws Throwable;
private static native int __call200005_22(java.lang.Integer a0) throws Throwable;
private static native java.lang.Object __call200005_23(moom.DN a0) throws Throwable;
private static native java.lang.Integer __cast200005_24(java.lang.Object a0) throws Throwable;
private static native int __call200005_25(java.lang.Integer a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_26(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_27(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_28(java.lang.Object a0) throws Throwable;
private static native float __call200005_29(java.lang.Float a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_30(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_31(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_32(java.lang.Object a0) throws Throwable;
private static native float __call200005_33(java.lang.Float a0) throws Throwable;
private static native float __fieldRead200005_34(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_35(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_36(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_37(java.lang.Object a0) throws Throwable;
private static native float __call200005_38(java.lang.Float a0) throws Throwable;
private static native float __fieldRead200005_39(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_40(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_41(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_42(java.lang.Object a0) throws Throwable;
private static native float __call200005_43(java.lang.Float a0) throws Throwable;
private static native boolean __call200005_44(com.moon.module.impl.SessionInformation a0, int a1, int a2, float a3, float a4, float a5, float a6) throws Throwable;
private static native int __integerCategory200005_45(boolean value) throws Throwable;
private static native boolean __call200005_46(int a0) throws Throwable;
private static native int __integerCategory200005_47(boolean value) throws Throwable;
private static native void __fieldWrite200005_48(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native boolean __fieldRead200005_49(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native boolean __call200005_50(int a0) throws Throwable;
private static native int __integerCategory200005_51(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200005_52() throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead200005_53(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __instanceOf200005_54(net.minecraft.client.gui.GuiScreen a0) throws Throwable;
private static native boolean __fieldRead200005_55(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native int __integerCategory200005_56(boolean value) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_57(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_58(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_59(java.lang.Object a0) throws Throwable;
private static native float __call200005_60(java.lang.Float a0) throws Throwable;
private static native void __fieldWrite200005_61(com.moon.module.impl.SessionInformation a0, float a1) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_62(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_63(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_64(java.lang.Object a0) throws Throwable;
private static native float __call200005_65(java.lang.Float a0) throws Throwable;
private static native void __fieldWrite200005_66(com.moon.module.impl.SessionInformation a0, float a1) throws Throwable;
private static native void __fieldWrite200005_67(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_68(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native float __fieldRead200005_69(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Float __call200005_70(float a0) throws Throwable;
private static native void __call200005_71(com.moon.setting.FloatSetting a0, java.lang.Float a1) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_72(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native float __fieldRead200005_73(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Float __call200005_74(float a0) throws Throwable;
private static native void __call200005_75(com.moon.setting.FloatSetting a0, java.lang.Float a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead200005_76(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.gV __call200005_77(com.moon.module.impl.Effects a0) throws Throwable;
private static native com.moon.gV __call200005_78(com.moon.gV a0, int a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead200005_79(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.gW __call200005_80(com.moon.module.impl.Effects a0) throws Throwable;
private static native void __call200005_81(com.moon.gW a0) throws Throwable;
private static native void __fieldWrite200005_82(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native com.moon.hW __fieldRead200005_83(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_84(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_85(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_86(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_87(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_88(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_89(java.lang.Object a0) throws Throwable;
private static native float __call200005_90(java.lang.Float a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_91(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_92(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_93(java.lang.Object a0) throws Throwable;
private static native float __call200005_94(java.lang.Float a0) throws Throwable;
private static native void __call200005_95(float a0, float a1, float a2) throws Throwable;
private static native void __call200005_96() throws Throwable;
private static native com.moon.hW __fieldRead200005_97(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __call200005_98(com.moon.hW a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_99(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __call200005_100(com.moon.hW a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_101(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __call200005_102(com.moon.hW a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200005_103() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call200005_104(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call200005_105(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native com.moon.hW __fieldRead200005_106(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __call200005_107(com.moon.hW a0) throws Throwable;
private static native void __call200005_108(int a0) throws Throwable;
private static native void __call200005_109() throws Throwable;
private static native boolean __fieldRead200005_110(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call200005_111() throws Throwable;
private static native com.moon.jo __call200005_112(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead200005_113() throws Throwable;
private static native com.moon.jm __call200005_114(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native com.moon.jn __cast200005_115(com.moon.jm a0) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead200005_116(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call200005_117() throws Throwable;
private static native com.moon.fU __call200005_118(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Class __classLiteral200005_119() throws Throwable;
private static native com.moon.module.Module __call200005_120(com.moon.fU a0, java.lang.Class a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __cast200005_121(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite200005_122(com.moon.module.impl.SessionInformation a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead200005_123(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call200005_124() throws Throwable;
private static native com.moon.fU __call200005_125(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Class __classLiteral200005_126() throws Throwable;
private static native com.moon.module.Module __call200005_127(com.moon.fU a0, java.lang.Class a1) throws Throwable;
private static native com.moon.module.impl.Effects __cast200005_128(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite200005_129(com.moon.module.impl.SessionInformation a0, com.moon.module.impl.Effects a1) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_130(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_131(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_132(java.lang.Object a0) throws Throwable;
private static native float __call200005_133(java.lang.Float a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_134(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_135(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_136(java.lang.Object a0) throws Throwable;
private static native float __call200005_137(java.lang.Float a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead200005_138(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call200005_139(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast200005_140(java.lang.Object a0) throws Throwable;
private static native float __call200005_141(java.lang.Float a0) throws Throwable;
private static native com.moon.jn __fieldRead200005_142() throws Throwable;
private static native java.lang.String __invokedynamic200005_143(int a0, long a1) throws Throwable;
private static native float __call200005_144(com.moon.jn a0, java.lang.String a1, float a2) throws Throwable;
private static native void __fieldWrite200005_145(com.moon.module.impl.SessionInformation a0, float a1) throws Throwable;
private static native void __fieldWrite200005_146(com.moon.module.impl.SessionInformation a0, float a1) throws Throwable;
private static native com.moon.hW __fieldRead200005_147(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_148(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hY __call200005_149(com.moon.hW a0) throws Throwable;
private static native void __call200005_150(com.moon.hY a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_151(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_152(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hY __call200005_153(com.moon.hW a0) throws Throwable;
private static native void __call200005_154(com.moon.hY a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_155(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_156(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hY __call200005_157(com.moon.hW a0) throws Throwable;
private static native void __call200005_158(com.moon.hY a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_159(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_160(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hY __call200005_161(com.moon.hW a0) throws Throwable;
private static native void __call200005_162(com.moon.hY a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_163(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hW __fieldRead200005_164(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.hY __call200005_165(com.moon.hW a0) throws Throwable;
private static native void __call200005_166(com.moon.hY a0) throws Throwable;
private static native com.moon.hX __call200005_167() throws Throwable;
private static native com.moon.cb __fieldRead200005_168() throws Throwable;
private static native com.moon.hX __call200005_169(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call200005_170(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call200005_171(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call200005_172(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite200005_173(com.moon.module.impl.SessionInformation a0, com.moon.hW a1) throws Throwable;
private static native com.moon.hX __call200005_174() throws Throwable;
private static native com.moon.cb __fieldRead200005_175() throws Throwable;
private static native com.moon.hX __call200005_176(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call200005_177(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call200005_178(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call200005_179(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite200005_180(com.moon.module.impl.SessionInformation a0, com.moon.hW a1) throws Throwable;
private static native com.moon.hX __call200005_181() throws Throwable;
private static native com.moon.cb __fieldRead200005_182() throws Throwable;
private static native com.moon.hX __call200005_183(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call200005_184(com.moon.hX a0, com.moon.jn a1) throws Throwable;
private static native com.moon.hX __call200005_185(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call200005_186(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call200005_187(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite200005_188(com.moon.module.impl.SessionInformation a0, com.moon.hW a1) throws Throwable;
private static native com.moon.hX __call200005_189() throws Throwable;
private static native com.moon.cb __fieldRead200005_190() throws Throwable;
private static native com.moon.hX __call200005_191(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call200005_192(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call200005_193(com.moon.hX a0) throws Throwable;
private static native com.moon.jn __fieldRead200005_194() throws Throwable;
private static native com.moon.hX __call200005_195(com.moon.hX a0, com.moon.jn a1) throws Throwable;
private static native com.moon.hW __call200005_196(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite200005_197(com.moon.module.impl.SessionInformation a0, com.moon.hW a1) throws Throwable;
private static native com.moon.hX __call200005_198() throws Throwable;
private static native com.moon.cb __fieldRead200005_199() throws Throwable;
private static native com.moon.hX __call200005_200(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call200005_201(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call200005_202(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call200005_203(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite200005_204(com.moon.module.impl.SessionInformation a0, com.moon.hW a1) throws Throwable;
private static native com.moon.hW __fieldRead200005_205(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native float __fieldRead200005_206(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native float __fieldRead200005_207(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.awt.Color __fieldRead200005_208() throws Throwable;
private static native int __call200005_209(java.awt.Color a0) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead200005_210(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native boolean __call200005_211(com.moon.module.impl.Effects a0) throws Throwable;
private static native int __integerCategory200005_212(boolean value) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead200005_213(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call200005_214(com.moon.module.impl.Effects a0) throws Throwable;
private static native java.lang.Object __call200005_215(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast200005_216(java.lang.Object a0) throws Throwable;
private static native boolean __call200005_217(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory200005_218(boolean value) throws Throwable;
private static native com.moon.aO __call200005_219(com.moon.aO a0, float a1) throws Throwable;
private static native int __call200005_220(com.moon.aO a0) throws Throwable;
private static native com.moon.i3 __call200005_221(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call200005_222(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native com.moon.hW __fieldRead200005_223(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native float __fieldRead200005_224(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native float __fieldRead200005_225(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.awt.Color __fieldRead200005_226() throws Throwable;
private static native int __call200005_227(java.awt.Color a0) throws Throwable;
private static native com.moon.i3 __call200005_228(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call200005_229(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native com.moon.jn __fieldRead200005_230() throws Throwable;
private static native com.moon.hW __fieldRead200005_231(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.String __invokedynamic200005_232(int a0, long a1) throws Throwable;
private static native com.moon.jn __fieldRead200005_233() throws Throwable;
private static native float __call200005_234(com.moon.jn a0, float a1) throws Throwable;
private static native void __call200005_235(com.moon.jn a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6, int a7, int a8, float a9) throws Throwable;
private static native com.moon.hW __fieldRead200005_236(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.i6 __call200005_237(float a0, float a1, float a2, float a3, float a4, float a5, float a6, float a7, float a8, int a9) throws Throwable;
private static native void __call200005_238(com.moon.hW a0, com.moon.i6 a1) throws Throwable;
private static native java.util.List __fieldRead200005_239(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.util.Iterator __call200005_240(java.util.List a0) throws Throwable;
private static native boolean __call200005_241(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call200005_242(java.util.Iterator a0) throws Throwable;
private static native com.moon.gO __cast200005_243(java.lang.Object a0) throws Throwable;
private static native java.util.function.Supplier __call200005_244(com.moon.gO a0) throws Throwable;
private static native java.lang.Object __call200005_245(java.util.function.Supplier a0) throws Throwable;
private static native java.lang.String __cast200005_246(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call200005_247(com.moon.gO a0) throws Throwable;
private static native float __call200005_248(com.moon.gO a0) throws Throwable;
private static native com.moon.jy __call200005_249(com.moon.jn a0) throws Throwable;
private static native com.moon.jz __call200005_250(com.moon.jy a0) throws Throwable;
private static native char __call200005_251(java.lang.String a0, int a1) throws Throwable;
private static native com.moon.jr __call200005_252(com.moon.jz a0, char a1) throws Throwable;
private static native float __call200005_253(com.moon.jr a0) throws Throwable;
private static native float __call200005_254(com.moon.jr a0) throws Throwable;
private static native com.moon.jn __fieldRead200005_255() throws Throwable;
private static native com.moon.hW __fieldRead200005_256(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __call200005_257(com.moon.jn a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native com.moon.hW __fieldRead200005_258(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native int __invokedynamic200005_259(int a0, long a1) throws Throwable;
private static native void __call200005_260(com.moon.jn a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native com.moon.hW __fieldRead200005_261(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native int __invokedynamic200005_262(int a0, long a1) throws Throwable;
private static native com.moon.i3 __call200005_263(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call200005_264(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __fieldWrite200005_265(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native java.lang.Exception __call23000500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000514_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000515_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000516_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000517_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000518_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000519_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000520_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000521_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000522_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000523_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000524_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000525_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000526_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000527_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000528_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000529_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000530_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000531_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000532_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000533_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000534_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000535_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000536_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000537_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000538_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000539_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000540_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call23000541_0(moom.Oo a0) throws Throwable;
private static native java.lang.String __localWitness200005(java.lang.String p0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5b1251ab74533a0c156d(com.moon.module.impl.SessionInformation a0, com.moon.event.TickEvent a1) throws E;
private static final class __SourceHandler_5b1251ab74533a0c156d {

public static void f42(com.moon.module.impl.SessionInformation receiver, com.moon.event.TickEvent p0) throws Throwable {
    moom.jL lexicalValue42_36_0;
    int lexicalValue42_58_0;
    moom.jL lexicalValue42_171_0;
    int lexicalValue42_383_0;
    int lexicalValue42_398_0;
    int lexicalValue42_413_0;
    int lexicalValue42_428_0;
    int lexicalValue42_443_0;
    int lexicalValue42_454_0;
    java.lang.String lexicalValue42_460_0;
    java.lang.String spill42_0;
    boolean spill42_1;
    moom.jL spill42_2;
    moom.jL spill42_3;
    int spill42_4;
    java.lang.String spill42_5;
    long life2_3;
    moom.jL life5_7;
    java.lang.String life4_8;
    java.util.Iterator life6_24;
    java.lang.String life7_31;
    com.moon.cq life6_92;
    com.moon.cx life7_107;
    java.util.Map life8_110;
    com.moon.cz life9_117;
    java.lang.String life10_134;
    java.time.LocalDateTime life7_243;
    java.time.LocalDateTime life8_248;
    java.lang.String life9_250;
    long life10_255;
    long life12_268;
    long life14_289;
    long life16_318;
    long life18_355;
    long life20_400;
    lexical_join_467: {
    lexical_join_461: {
    lexical_join_460: {
    lexical_join_454: {
    lexical_join_450: {
    lexical_join_443: {
    lexical_join_440: {
    lexical_join_428: {
    lexical_join_425: {
    lexical_join_413: {
    lexical_join_410: {
    lexical_join_398: {
    lexical_join_395: {
    lexical_join_383: {
    lexical_join_380: {
    lexical_join_202: {
    lexical_join_171: {
    lexical_join_170: {
    lexical_join_168: {
    lexical_join_139: {
    lexical_join_58: {
    lexical_join_48: {
    life2_3 = (__fieldRead42_0() ^ 64808730079277L);
    spill42_0 = __call42_1();
    life5_7 = __call42_3(__fieldRead42_2());
    life4_8 = spill42_0;
    spill42_1 = __call42_7(__cast42_6(__call42_5(__fieldRead42_4(receiver))));
    if (!((life4_8 != null))) {
        lexicalValue42_58_0 = __integerCategory42_8(spill42_1);
        break lexical_join_58;
    }
    if (!(spill42_1)) {
        break lexical_join_48;
    }
    life6_24 = __call42_11(__call42_10(__fieldRead42_9(receiver)));
    lexical_cycle_22: while (true) {
    lexical_join_46: {
    lexical_join_36: {
    if (!(__call42_12(life6_24))) {
        break lexical_join_48;
    }
    life7_31 = __cast42_14(__call42_13(life6_24));
    if (!((life4_8 != null))) {
        break lexical_join_467;
    }
    spill42_2 = life5_7;
    if (!((life4_8 != null))) {
        lexicalValue42_36_0 = spill42_2;
        break lexical_join_36;
    }
    if (!((spill42_2 != null))) {
        break lexical_join_46;
    }
    lexicalValue42_36_0 = life5_7;
    }
    if (!(__call42_16(__fieldRead42_15(lexicalValue42_36_0), life7_31))) {
        break lexical_join_46;
    }
    __call42_18(__fieldRead42_17(receiver), life7_31);
    if (!((life4_8 == null))) {
        break lexical_join_48;
    }
    }
    if (!((life4_8 == null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    lexicalValue42_58_0 = __numericCompare42_22((__call42_19() - __fieldRead42_20(receiver)), __invokedynamic42_21(6718, (7451992805563984304L ^ life2_3)));
    }
    if (!((lexicalValue42_58_0 >= 0))) {
        break lexical_join_467;
    }
    if (!((__fieldRead42_24(__fieldRead42_23()) != null))) {
        break lexical_join_467;
    }
    com.moon.module.impl.SessionInformation __stackOp42_25_0 = receiver;
    __fieldWrite42_28(__stackOp42_25_0, (__fieldRead42_26(__stackOp42_25_0) + __invokedynamic42_27(9086, (5095515412516720868L ^ life2_3))));
    life6_92 = __call42_30(__call42_29());
    if (!((life6_92 != null))) {
        break lexical_join_170;
    }
    spill42_3 = life5_7;
    if (!((life4_8 != null))) {
        lexicalValue42_171_0 = spill42_3;
        break lexical_join_171;
    }
    if (!((spill42_3 != null))) {
        break lexical_join_170;
    }
    life7_107 = __call42_31(life6_92);
    life8_110 = __call42_32(life7_107);
    life9_117 = __cast42_36(__call42_35(life8_110, __fieldRead42_33(life5_7), __invokedynamic42_34()));
    __fieldWrite42_38(receiver, __call42_37(life9_117));
    __fieldWrite42_40(receiver, __call42_39(life9_117));
    __fieldWrite42_42(receiver, __call42_41(life9_117));
    life10_134 = __cast42_45(__call42_44(__fieldRead42_43(receiver)));
    if (!((life4_8 != null))) {
        break lexical_join_168;
    }
    if (!(__call42_47(__fieldRead42_46(life5_7), life10_134))) {
        break lexical_join_139;
    }
    com.moon.module.impl.SessionInformation __stackOp42_48_0 = receiver;
    __fieldWrite42_51(__stackOp42_48_0, (__fieldRead42_49(__stackOp42_48_0) + __fieldRead42_50(receiver)));
    com.moon.module.impl.SessionInformation __stackOp42_52_0 = receiver;
    __fieldWrite42_55(__stackOp42_52_0, (__fieldRead42_53(__stackOp42_52_0) + __fieldRead42_54(receiver)));
    com.moon.module.impl.SessionInformation __stackOp42_56_0 = receiver;
    __fieldWrite42_59(__stackOp42_56_0, (__fieldRead42_57(__stackOp42_56_0) + __fieldRead42_58(receiver)));
    }
    __call42_61(life9_117, __fieldRead42_60(receiver));
    __call42_63(life9_117, __fieldRead42_62(receiver));
    __call42_65(life9_117, __fieldRead42_64(receiver));
    __fieldWrite42_66(receiver, 0);
    __fieldWrite42_67(receiver, 0);
    __fieldWrite42_68(receiver, 0L);
    __call42_71(__fieldRead42_69(receiver), __invokedynamic42_70());
    }
    if (!((life4_8 == null))) {
        break lexical_join_202;
    }
    }
    lexicalValue42_171_0 = life5_7;
    }
    if (!((lexicalValue42_171_0 != null))) {
        break lexical_join_202;
    }
    com.moon.module.impl.SessionInformation __stackOp42_72_0 = receiver;
    __fieldWrite42_75(__stackOp42_72_0, (__fieldRead42_73(__stackOp42_72_0) + __fieldRead42_74(receiver)));
    com.moon.module.impl.SessionInformation __stackOp42_76_0 = receiver;
    __fieldWrite42_79(__stackOp42_76_0, (__fieldRead42_77(__stackOp42_76_0) + __fieldRead42_78(receiver)));
    com.moon.module.impl.SessionInformation __stackOp42_80_0 = receiver;
    __fieldWrite42_83(__stackOp42_80_0, (__fieldRead42_81(__stackOp42_80_0) + __fieldRead42_82(receiver)));
    __fieldWrite42_84(receiver, 0);
    __fieldWrite42_85(receiver, 0);
    __fieldWrite42_86(receiver, 0L);
    }
    life7_243 = __call42_90(__call42_88(__fieldRead42_87(receiver)), __call42_89());
    life8_248 = __call42_93(__call42_91(0L), __call42_92());
    life9_250 = "";
    life10_255 = __call42_95(__fieldRead42_94(), life8_248, life7_243);
    life12_268 = (__call42_97(__fieldRead42_96(), life8_248, life7_243) - (life10_255 * __invokedynamic42_98(7708, (3599040041357929876L ^ life2_3))));
    life14_289 = ((__call42_100(__fieldRead42_99(), life8_248, life7_243) - (life10_255 * __invokedynamic42_101(26649, (3528942826737310599L ^ life2_3)))) - (life12_268 * __invokedynamic42_102(22875, (5883298789989558984L ^ life2_3))));
    life16_318 = (((__call42_104(__fieldRead42_103(), life8_248, life7_243) - (life14_289 * __invokedynamic42_105(26943, (6659036532570069668L ^ life2_3)))) - (life12_268 * __invokedynamic42_106(23027, (2729348495887182447L ^ life2_3)))) - (life10_255 * __invokedynamic42_107(14415, (5991902284411849687L ^ life2_3))));
    life18_355 = ((((__call42_109(__fieldRead42_108(), life8_248, life7_243) - (life16_318 * __invokedynamic42_110(28259, (2392258381234052597L ^ life2_3)))) - (life14_289 * __invokedynamic42_111(30429, (6275576294085166423L ^ life2_3)))) - (life12_268 * __invokedynamic42_112(6442, (7205580760730528442L ^ life2_3)))) - (life10_255 * __invokedynamic42_113(11529, (5970999603770121883L ^ life2_3))));
    life20_400 = (((((__call42_115(__fieldRead42_114(), life8_248, life7_243) - (life18_355 * __invokedynamic42_116(20688, (2820012957168968537L ^ life2_3)))) - (life16_318 * __invokedynamic42_117(22037, (2390351495566730654L ^ life2_3)))) - (life14_289 * __invokedynamic42_118(7064, (1943507214104520711L ^ life2_3)))) - (life12_268 * __invokedynamic42_119(15315, (2537169314038401095L ^ life2_3)))) - (life10_255 * __invokedynamic42_120(28962, (1351926054564233911L ^ life2_3))));
    spill42_4 = __numericCompare42_121(life10_255, 0L);
    if (!((life4_8 != null))) {
        lexicalValue42_383_0 = spill42_4;
        break lexical_join_383;
    }
    if (!((spill42_4 > 0))) {
        break lexical_join_380;
    }
    life9_250 = __invokedynamic42_123(life9_250, life10_255, __invokedynamic42_122(10353, (1940287822315124059L ^ life2_3)));
    }
    lexicalValue42_383_0 = __numericCompare42_124(life12_268, 0L);
    }
    if (!((life4_8 != null))) {
        lexicalValue42_398_0 = lexicalValue42_383_0;
        break lexical_join_398;
    }
    if (!((lexicalValue42_383_0 > 0))) {
        break lexical_join_395;
    }
    life9_250 = __invokedynamic42_126(life9_250, life12_268, __invokedynamic42_125(8434, (7314842680490556921L ^ life2_3)));
    }
    lexicalValue42_398_0 = __numericCompare42_127(life14_289, 0L);
    }
    if (!((life4_8 != null))) {
        lexicalValue42_413_0 = lexicalValue42_398_0;
        break lexical_join_413;
    }
    if (!((lexicalValue42_398_0 > 0))) {
        break lexical_join_410;
    }
    life9_250 = __invokedynamic42_129(life9_250, life14_289, __invokedynamic42_128(7644, (3660198585680249059L ^ life2_3)));
    }
    lexicalValue42_413_0 = __numericCompare42_130(life16_318, 0L);
    }
    if (!((life4_8 != null))) {
        lexicalValue42_428_0 = lexicalValue42_413_0;
        break lexical_join_428;
    }
    if (!((lexicalValue42_413_0 > 0))) {
        break lexical_join_425;
    }
    life9_250 = __invokedynamic42_132(life9_250, life16_318, __invokedynamic42_131(31227, (2599435586224006392L ^ life2_3)));
    }
    lexicalValue42_428_0 = __numericCompare42_133(life18_355, 0L);
    }
    if (!((life4_8 != null))) {
        lexicalValue42_443_0 = lexicalValue42_428_0;
        break lexical_join_443;
    }
    if (!((lexicalValue42_428_0 > 0))) {
        break lexical_join_440;
    }
    life9_250 = __invokedynamic42_135(life9_250, life18_355, __invokedynamic42_134(12548, (4302887654525791257L ^ life2_3)));
    }
    lexicalValue42_443_0 = __numericCompare42_136(life20_400, 0L);
    }
    if (!((life4_8 != null))) {
        lexicalValue42_454_0 = lexicalValue42_443_0;
        break lexical_join_454;
    }
    if (!((lexicalValue42_443_0 > 0))) {
        break lexical_join_450;
    }
    life9_250 = __invokedynamic42_137(life9_250, life20_400);
    }
    spill42_5 = life9_250;
    if (!((life4_8 != null))) {
        lexicalValue42_460_0 = spill42_5;
        break lexical_join_460;
    }
    lexicalValue42_454_0 = __integerCategory42_139(__call42_138(spill42_5));
    }
    if (!((lexicalValue42_454_0 != 0))) {
        break lexical_join_461;
    }
    lexicalValue42_460_0 = __invokedynamic42_140(31335, (5935155834017949558L ^ life2_3));
    }
    life9_250 = lexicalValue42_460_0;
    }
    __fieldWrite42_141(receiver, life9_250);
    __fieldWrite42_143(receiver, __call42_142());
    }
    return;
}
public static void h42_0(moom.Oo p0) throws Throwable {
    throw __call1004200_0(p0);
}
public static void h42_1(moom.Oo p0) throws Throwable {
    throw __call1004201_0(p0);
}
public static void h42_2(moom.Oo p0) throws Throwable {
    throw __call1004202_0(p0);
}
public static void h42_3(moom.Oo p0) throws Throwable {
    throw __call1004203_0(p0);
}
public static void h42_4(moom.Oo p0) throws Throwable {
    throw __call1004204_0(p0);
}
public static void h42_5(moom.Oo p0) throws Throwable {
    throw __call1004205_0(p0);
}
public static void h42_6(moom.Oo p0) throws Throwable {
    throw __call1004206_0(p0);
}
public static void h42_7(moom.Oo p0) throws Throwable {
    throw __call1004207_0(p0);
}
public static void h42_8(moom.Oo p0) throws Throwable {
    throw __call1004208_0(p0);
}
public static void h42_9(moom.Oo p0) throws Throwable {
    throw __call1004209_0(p0);
}
public static void h42_10(moom.Oo p0) throws Throwable {
    throw __call1004210_0(p0);
}
public static void h42_11(moom.Oo p0) throws Throwable {
    throw __call1004211_0(p0);
}
public static void h42_12(moom.Oo p0) throws Throwable {
    throw __call1004212_0(p0);
}
public static void h42_13(moom.Oo p0) throws Throwable {
    throw __call1004213_0(p0);
}
public static void h42_14(moom.Oo p0) throws Throwable {
    throw __call1004214_0(p0);
}
public static void h42_15(moom.Oo p0) throws Throwable {
    throw __call1004215_0(p0);
}
public static void h42_16(moom.Oo p0) throws Throwable {
    throw __call1004216_0(p0);
}
public static void h42_17(moom.Oo p0) throws Throwable {
    throw __call1004217_0(p0);
}
public static void h42_18(moom.Oo p0) throws Throwable {
    throw __call1004218_0(p0);
}
private static native long __fieldRead42_0() throws Throwable;
private static native java.lang.String __call42_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead42_2() throws Throwable;
private static native moom.jL __call42_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead42_4(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call42_5(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast42_6(java.lang.Object a0) throws Throwable;
private static native boolean __call42_7(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory42_8(boolean value) throws Throwable;
private static native com.moon.setting.StringListSetting __fieldRead42_9(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.util.List __call42_10(com.moon.setting.StringListSetting a0) throws Throwable;
private static native java.util.Iterator __call42_11(java.util.List a0) throws Throwable;
private static native boolean __call42_12(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call42_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast42_14(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead42_15(moom.jL a0) throws Throwable;
private static native boolean __call42_16(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native com.moon.setting.StringListSetting __fieldRead42_17(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __call42_18(com.moon.setting.StringListSetting a0, java.lang.String a1) throws Throwable;
private static native long __call42_19() throws Throwable;
private static native long __fieldRead42_20(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native long __invokedynamic42_21(int a0, long a1) throws Throwable;
private static native int __numericCompare42_22(long a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead42_23() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead42_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __fieldRead42_26(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native long __invokedynamic42_27(int a0, long a1) throws Throwable;
private static native void __fieldWrite42_28(com.moon.module.impl.SessionInformation a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call42_29() throws Throwable;
private static native com.moon.cq __call42_30(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.cx __call42_31(com.moon.cq a0) throws Throwable;
private static native java.util.Map __call42_32(com.moon.cx a0) throws Throwable;
private static native java.lang.String __fieldRead42_33(moom.jL a0) throws Throwable;
private static native java.util.function.Function __invokedynamic42_34() throws Throwable;
private static native java.lang.Object __call42_35(java.util.Map a0, java.lang.String a1, java.util.function.Function a2) throws Throwable;
private static native com.moon.cz __cast42_36(java.lang.Object a0) throws Throwable;
private static native int __call42_37(com.moon.cz a0) throws Throwable;
private static native void __fieldWrite42_38(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native int __call42_39(com.moon.cz a0) throws Throwable;
private static native void __fieldWrite42_40(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native long __call42_41(com.moon.cz a0) throws Throwable;
private static native void __fieldWrite42_42(com.moon.module.impl.SessionInformation a0, long a1) throws Throwable;
private static native com.moon.setting.StringListSetting __fieldRead42_43(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call42_44(com.moon.setting.StringListSetting a0) throws Throwable;
private static native java.lang.String __cast42_45(java.lang.Object a0) throws Throwable;
private static native java.lang.String __fieldRead42_46(moom.jL a0) throws Throwable;
private static native boolean __call42_47(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead42_49(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native int __fieldRead42_50(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite42_51(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native int __fieldRead42_53(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native int __fieldRead42_54(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite42_55(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native long __fieldRead42_57(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native long __fieldRead42_58(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite42_59(com.moon.module.impl.SessionInformation a0, long a1) throws Throwable;
private static native int __fieldRead42_60(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.cz __call42_61(com.moon.cz a0, int a1) throws Throwable;
private static native int __fieldRead42_62(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.cz __call42_63(com.moon.cz a0, int a1) throws Throwable;
private static native long __fieldRead42_64(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.cz __call42_65(com.moon.cz a0, long a1) throws Throwable;
private static native void __fieldWrite42_66(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native void __fieldWrite42_67(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native void __fieldWrite42_68(com.moon.module.impl.SessionInformation a0, long a1) throws Throwable;
private static native java.util.concurrent.ExecutorService __fieldRead42_69(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic42_70() throws Throwable;
private static native java.util.concurrent.Future __call42_71(java.util.concurrent.ExecutorService a0, java.lang.Runnable a1) throws Throwable;
private static native int __fieldRead42_73(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native int __fieldRead42_74(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite42_75(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native int __fieldRead42_77(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native int __fieldRead42_78(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite42_79(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native long __fieldRead42_81(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native long __fieldRead42_82(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite42_83(com.moon.module.impl.SessionInformation a0, long a1) throws Throwable;
private static native void __fieldWrite42_84(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native void __fieldWrite42_85(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native void __fieldWrite42_86(com.moon.module.impl.SessionInformation a0, long a1) throws Throwable;
private static native long __fieldRead42_87(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.time.Instant __call42_88(long a0) throws Throwable;
private static native java.time.ZoneId __call42_89() throws Throwable;
private static native java.time.LocalDateTime __call42_90(java.time.Instant a0, java.time.ZoneId a1) throws Throwable;
private static native java.time.Instant __call42_91(long a0) throws Throwable;
private static native java.time.ZoneId __call42_92() throws Throwable;
private static native java.time.LocalDateTime __call42_93(java.time.Instant a0, java.time.ZoneId a1) throws Throwable;
private static native java.time.temporal.ChronoUnit __fieldRead42_94() throws Throwable;
private static native long __call42_95(java.time.temporal.ChronoUnit a0, java.time.LocalDateTime a1, java.time.LocalDateTime a2) throws Throwable;
private static native java.time.temporal.ChronoUnit __fieldRead42_96() throws Throwable;
private static native long __call42_97(java.time.temporal.ChronoUnit a0, java.time.LocalDateTime a1, java.time.LocalDateTime a2) throws Throwable;
private static native long __invokedynamic42_98(int a0, long a1) throws Throwable;
private static native java.time.temporal.ChronoUnit __fieldRead42_99() throws Throwable;
private static native long __call42_100(java.time.temporal.ChronoUnit a0, java.time.LocalDateTime a1, java.time.LocalDateTime a2) throws Throwable;
private static native long __invokedynamic42_101(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_102(int a0, long a1) throws Throwable;
private static native java.time.temporal.ChronoUnit __fieldRead42_103() throws Throwable;
private static native long __call42_104(java.time.temporal.ChronoUnit a0, java.time.LocalDateTime a1, java.time.LocalDateTime a2) throws Throwable;
private static native long __invokedynamic42_105(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_106(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_107(int a0, long a1) throws Throwable;
private static native java.time.temporal.ChronoUnit __fieldRead42_108() throws Throwable;
private static native long __call42_109(java.time.temporal.ChronoUnit a0, java.time.LocalDateTime a1, java.time.LocalDateTime a2) throws Throwable;
private static native long __invokedynamic42_110(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_111(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_112(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_113(int a0, long a1) throws Throwable;
private static native java.time.temporal.ChronoUnit __fieldRead42_114() throws Throwable;
private static native long __call42_115(java.time.temporal.ChronoUnit a0, java.time.LocalDateTime a1, java.time.LocalDateTime a2) throws Throwable;
private static native long __invokedynamic42_116(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_117(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_118(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_119(int a0, long a1) throws Throwable;
private static native long __invokedynamic42_120(int a0, long a1) throws Throwable;
private static native int __numericCompare42_121(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_122(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_123(java.lang.String a0, long a1, java.lang.String a2) throws Throwable;
private static native int __numericCompare42_124(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_125(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_126(java.lang.String a0, long a1, java.lang.String a2) throws Throwable;
private static native int __numericCompare42_127(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_128(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_129(java.lang.String a0, long a1, java.lang.String a2) throws Throwable;
private static native int __numericCompare42_130(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_131(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_132(java.lang.String a0, long a1, java.lang.String a2) throws Throwable;
private static native int __numericCompare42_133(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_134(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_135(java.lang.String a0, long a1, java.lang.String a2) throws Throwable;
private static native int __numericCompare42_136(long a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic42_137(java.lang.String a0, long a1) throws Throwable;
private static native boolean __call42_138(java.lang.String a0) throws Throwable;
private static native int __integerCategory42_139(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic42_140(int a0, long a1) throws Throwable;
private static native void __fieldWrite42_141(com.moon.module.impl.SessionInformation a0, java.lang.String a1) throws Throwable;
private static native long __call42_142() throws Throwable;
private static native void __fieldWrite42_143(com.moon.module.impl.SessionInformation a0, long a1) throws Throwable;
private static native java.lang.Exception __call1004200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004216_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004217_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004218_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_a1ed04f2b5fbd571bb54(com.moon.module.impl.SessionInformation a0) throws E;
private static final class __SourceHandler_a1ed04f2b5fbd571bb54 {

public static int f507(com.moon.module.impl.SessionInformation receiver) throws Throwable {
    java.lang.Object forwardValue507_25_0;
    java.lang.Integer forwardValue507_26_0;
    int forwardValue507_48_0;
    java.lang.Object forwardValue507_71_0;
    int forwardValue507_73_0;
    java.lang.String spill507_0;
    java.lang.Boolean spill507_1;
    int spill507_2;
    java.lang.Boolean spill507_3;
    long life1_3;
    java.lang.String life3_7;
    int life4_32;
    forward_join_73: {
    forward_join_71: {
    forward_join_68: {
    forward_join_48: {
    forward_join_41: {
    forward_join_26: {
    forward_join_25: {
    forward_join_22: {
    life1_3 = (__fieldRead507_0() ^ 69818530641948L);
    spill507_0 = __call507_1();
    __call507_2(receiver);
    life3_7 = spill507_0;
    spill507_1 = __cast507_5(__call507_4(__fieldRead507_3(receiver)));
    if (!((life3_7 != null))) {
        forwardValue507_25_0 = spill507_1;
        break forward_join_25;
    }
    if (!(__call507_6(spill507_1))) {
        break forward_join_22;
    }
    forwardValue507_26_0 = __cast507_10(__call507_9(__call507_8(__fieldRead507_7(receiver))));
    break forward_join_26;
    }
    forwardValue507_25_0 = __call507_12(__fieldRead507_11(receiver));
    }
    forwardValue507_26_0 = __cast507_13(forwardValue507_25_0);
    }
    life4_32 = __call507_14(forwardValue507_26_0);
    spill507_2 = life4_32;
    if (!((life3_7 != null))) {
        forwardValue507_48_0 = spill507_2;
        break forward_join_48;
    }
    if (!((spill507_2 != __fieldRead507_15(receiver)))) {
        break forward_join_41;
    }
    __fieldWrite507_17(receiver, __call507_16(life4_32));
    __fieldWrite507_18(receiver, life4_32);
    }
    spill507_3 = __cast507_21(__call507_20(__fieldRead507_19(receiver)));
    if (!((life3_7 != null))) {
        forwardValue507_71_0 = spill507_3;
        break forward_join_71;
    }
    forwardValue507_48_0 = __integerCategory507_23(__call507_22(spill507_3));
    }
    if (!((forwardValue507_48_0 != 0))) {
        break forward_join_68;
    }
    forwardValue507_73_0 = __call507_36(receiver, 0x0.0p0f, __fieldRead507_24(receiver), __fieldRead507_25(), __call507_30(__cast507_29(__call507_28(__call507_27(__fieldRead507_26(receiver))))), __call507_35(__cast507_34(__call507_33(__call507_32(__fieldRead507_31(receiver))))));
    break forward_join_73;
    }
    forwardValue507_71_0 = __call507_38(__fieldRead507_37(receiver));
    }
    forwardValue507_73_0 = __call507_40(__cast507_39(forwardValue507_71_0));
    }
    return forwardValue507_73_0;
}
public static void h507_0(moom.Oo p0) throws Throwable {
    throw __call1050700_0(p0);
}
public static void h507_1(moom.Oo p0) throws Throwable {
    throw __call1050701_0(p0);
}
public static void h507_2(moom.Oo p0) throws Throwable {
    throw __call1050702_0(p0);
}
public static void h507_3(moom.Oo p0) throws Throwable {
    throw __call1050703_0(p0);
}
public static void h507_4(moom.Oo p0) throws Throwable {
    throw __call1050704_0(p0);
}
public static void h507_5(moom.Oo p0) throws Throwable {
    throw __call1050705_0(p0);
}
private static native long __fieldRead507_0() throws Throwable;
private static native java.lang.String __call507_1() throws Throwable;
private static native void __call507_2(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead507_3(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call507_4(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast507_5(java.lang.Object a0) throws Throwable;
private static native boolean __call507_6(java.lang.Boolean a0) throws Throwable;
private static native com.moon.module.impl.HUD __fieldRead507_7(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call507_8(com.moon.module.impl.HUD a0) throws Throwable;
private static native java.lang.Object __call507_9(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast507_10(java.lang.Object a0) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead507_11(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call507_12(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast507_13(java.lang.Object a0) throws Throwable;
private static native int __call507_14(java.lang.Integer a0) throws Throwable;
private static native int __fieldRead507_15(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.v __call507_16(int a0) throws Throwable;
private static native void __fieldWrite507_17(com.moon.module.impl.SessionInformation a0, com.v a1) throws Throwable;
private static native void __fieldWrite507_18(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead507_19(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call507_20(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast507_21(java.lang.Object a0) throws Throwable;
private static native boolean __call507_22(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory507_23(boolean value) throws Throwable;
private static native com.moon.module.impl.HUD __fieldRead507_24(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.b0 __fieldRead507_25() throws Throwable;
private static native com.moon.module.impl.HUD __fieldRead507_26(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call507_27(com.moon.module.impl.HUD a0) throws Throwable;
private static native java.lang.Object __call507_28(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast507_29(java.lang.Object a0) throws Throwable;
private static native int __call507_30(java.lang.Integer a0) throws Throwable;
private static native com.moon.module.impl.HUD __fieldRead507_31(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call507_32(com.moon.module.impl.HUD a0) throws Throwable;
private static native java.lang.Object __call507_33(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast507_34(java.lang.Object a0) throws Throwable;
private static native int __call507_35(java.lang.Integer a0) throws Throwable;
private static native int __call507_36(com.moon.module.impl.SessionInformation a0, float a1, com.moon.module.impl.HUD a2, com.moon.b0 a3, int a4, int a5) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead507_37(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call507_38(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast507_39(java.lang.Object a0) throws Throwable;
private static native int __call507_40(java.lang.Integer a0) throws Throwable;
private static native java.lang.Exception __call1050700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050705_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c021e7e1068c7837699f(com.moon.module.impl.SessionInformation a0, java.lang.String a1) throws E;
private static final class __SourceHandler_c021e7e1068c7837699f {

public static void f43(com.moon.module.impl.SessionInformation receiver, java.lang.String p0) throws Throwable {
    net.minecraft.client.entity.EntityPlayerSP forwardValue43_27_0;
    int forwardValue43_70_0;
    java.lang.String spill43_0;
    net.minecraft.client.entity.EntityPlayerSP spill43_1;
    java.util.stream.Stream spill43_2;
    java.lang.String spill43_3;
    java.util.stream.Stream spill43_4;
    java.lang.String spill43_5;
    int spill43_6;
    long life2_3;
    java.lang.String life5_9;
    java.lang.String life4_10;
    com.moon.gM life6_16;
    java.lang.String life7_34;
    int life8_49;
    int life9_64;
    forward_join_77: {
    forward_join_70: {
    forward_join_69: {
    forward_join_27: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (__fieldRead43_0() ^ 11805071634474L);
    spill43_0 = __call43_1();
    life5_9 = __cast43_4(__call43_3(__fieldRead43_2(receiver)));
    life4_10 = spill43_0;
    life6_16 = __cast43_7(__call43_6(__fieldRead43_5(receiver), life5_9));
    if (!((life6_16 != null))) {
        break forward_join_24;
    }
    spill43_1 = __fieldRead43_9(__fieldRead43_8());
    if (!((life4_10 != null))) {
        forwardValue43_27_0 = spill43_1;
        break forward_join_27;
    }
    if (!((spill43_1 == null))) {
        break forward_join_25;
    }
    }
    return;
    }
    forwardValue43_27_0 = __fieldRead43_11(__fieldRead43_10());
    }
    life7_34 = __call43_12(forwardValue43_27_0);
    spill43_2 = __call43_18(__call43_16(__call43_14(__call43_13(life6_16)), __invokedynamic43_15()), __invokedynamic43_17(life7_34));
    java.lang.String __stackOp43_19_0 = p0;
    spill43_3 = __stackOp43_19_0;
    __call43_20(__stackOp43_19_0);
    life8_49 = __integerCategory43_23(__call43_22(spill43_2, __invokedynamic43_21(spill43_3)));
    spill43_4 = __call43_29(__call43_27(__call43_25(__call43_24(life6_16)), __invokedynamic43_26()), __invokedynamic43_28(life7_34));
    java.lang.String __stackOp43_30_0 = p0;
    spill43_5 = __stackOp43_30_0;
    __call43_31(__stackOp43_30_0);
    life9_64 = __integerCategory43_34(__call43_33(spill43_4, __invokedynamic43_32(spill43_5)));
    spill43_6 = life8_49;
    if (!((life4_10 != null))) {
        forwardValue43_70_0 = spill43_6;
        break forward_join_70;
    }
    if (!((spill43_6 != 0))) {
        break forward_join_69;
    }
    com.moon.module.impl.SessionInformation __stackOp43_35_0 = receiver;
    __fieldWrite43_37(__stackOp43_35_0, (__fieldRead43_36(__stackOp43_35_0) + 1));
    }
    forwardValue43_70_0 = life9_64;
    }
    if (!((forwardValue43_70_0 != 0))) {
        break forward_join_77;
    }
    com.moon.module.impl.SessionInformation __stackOp43_38_0 = receiver;
    __fieldWrite43_40(__stackOp43_38_0, (__fieldRead43_39(__stackOp43_38_0) + 1));
    }
    return;
}
public static void h43_0(moom.Oo p0) throws Throwable {
    throw __call1004300_0(p0);
}
public static void h43_1(moom.Oo p0) throws Throwable {
    throw __call1004301_0(p0);
}
public static void h43_2(moom.Oo p0) throws Throwable {
    throw __call1004302_0(p0);
}
public static void h43_3(moom.Oo p0) throws Throwable {
    throw __call1004303_0(p0);
}
public static void h43_4(moom.Oo p0) throws Throwable {
    throw __call1004304_0(p0);
}
private static native long __fieldRead43_0() throws Throwable;
private static native java.lang.String __call43_1() throws Throwable;
private static native com.moon.setting.StringListSetting __fieldRead43_2(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call43_3(com.moon.setting.StringListSetting a0) throws Throwable;
private static native java.lang.String __cast43_4(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead43_5(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native java.lang.Object __call43_6(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native com.moon.gM __cast43_7(java.lang.Object a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead43_8() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead43_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead43_10() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead43_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call43_12(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native java.util.List __call43_13(com.moon.gM a0) throws Throwable;
private static native java.util.stream.Stream __call43_14(java.util.List a0) throws Throwable;
private static native java.util.function.Predicate __invokedynamic43_15() throws Throwable;
private static native java.util.stream.Stream __call43_16(java.util.stream.Stream a0, java.util.function.Predicate a1) throws Throwable;
private static native java.util.function.Function __invokedynamic43_17(java.lang.String a0) throws Throwable;
private static native java.util.stream.Stream __call43_18(java.util.stream.Stream a0, java.util.function.Function a1) throws Throwable;
private static native java.lang.Object __call43_20(java.lang.String a0) throws Throwable;
private static native java.util.function.Predicate __invokedynamic43_21(java.lang.String a0) throws Throwable;
private static native boolean __call43_22(java.util.stream.Stream a0, java.util.function.Predicate a1) throws Throwable;
private static native int __integerCategory43_23(boolean value) throws Throwable;
private static native java.util.List __call43_24(com.moon.gM a0) throws Throwable;
private static native java.util.stream.Stream __call43_25(java.util.List a0) throws Throwable;
private static native java.util.function.Predicate __invokedynamic43_26() throws Throwable;
private static native java.util.stream.Stream __call43_27(java.util.stream.Stream a0, java.util.function.Predicate a1) throws Throwable;
private static native java.util.function.Function __invokedynamic43_28(java.lang.String a0) throws Throwable;
private static native java.util.stream.Stream __call43_29(java.util.stream.Stream a0, java.util.function.Function a1) throws Throwable;
private static native java.lang.Object __call43_31(java.lang.String a0) throws Throwable;
private static native java.util.function.Predicate __invokedynamic43_32(java.lang.String a0) throws Throwable;
private static native boolean __call43_33(java.util.stream.Stream a0, java.util.function.Predicate a1) throws Throwable;
private static native int __integerCategory43_34(boolean value) throws Throwable;
private static native int __fieldRead43_36(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite43_37(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native int __fieldRead43_39(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native void __fieldWrite43_40(com.moon.module.impl.SessionInformation a0, int a1) throws Throwable;
private static native java.lang.Exception __call1004300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1004304_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_08735ff15cbf7e52de55(com.moon.module.impl.SessionInformation a0) throws E;
private static final class __SourceHandler_08735ff15cbf7e52de55 {

public static void f509(com.moon.module.impl.SessionInformation receiver) throws Throwable {
    com.moon.module.impl.SessionInformation forwardValue509_24_0;
    com.moon.module.impl.SessionInformation spill509_0;
    com.moon.module.impl.SessionInformation spill509_1;
    long life1_3;
    java.lang.String life3_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_16: {
    life1_3 = (__fieldRead509_0() ^ 103098993995830L);
    life3_5 = __call509_1();
    spill509_0 = receiver;
    if (!((life3_5 != null))) {
        forwardValue509_24_0 = spill509_0;
        break forward_join_24;
    }
    if (!((__fieldRead509_2(spill509_0) != null))) {
        break forward_join_16;
    }
    spill509_1 = receiver;
    if (!((life3_5 != null))) {
        forwardValue509_24_0 = spill509_1;
        break forward_join_24;
    }
    if (!((__fieldRead509_3(spill509_1) == null))) {
        break forward_join_30;
    }
    }
    __fieldWrite509_9(receiver, __cast509_8(__call509_7(__call509_5(__call509_4()), __classLiteral509_6())));
    forwardValue509_24_0 = receiver;
    }
    __fieldWrite509_15(forwardValue509_24_0, __cast509_14(__call509_13(__call509_11(__call509_10()), __classLiteral509_12())));
    }
    return;
}
public static void h509_0(moom.Oo p0) throws Throwable {
    throw __call1050900_0(p0);
}
public static void h509_1(moom.Oo p0) throws Throwable {
    throw __call1050901_0(p0);
}
public static void h509_2(moom.Oo p0) throws Throwable {
    throw __call1050902_0(p0);
}
public static void h509_3(moom.Oo p0) throws Throwable {
    throw __call1050903_0(p0);
}
private static native long __fieldRead509_0() throws Throwable;
private static native java.lang.String __call509_1() throws Throwable;
private static native com.moon.module.impl.HUD __fieldRead509_2(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead509_3(com.moon.module.impl.SessionInformation a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call509_4() throws Throwable;
private static native com.moon.fU __call509_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral509_6() throws Throwable;
private static native com.moon.module.Module __call509_7(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.HUD __cast509_8(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite509_9(com.moon.module.impl.SessionInformation a0, com.moon.module.impl.HUD a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call509_10() throws Throwable;
private static native com.moon.fU __call509_11(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral509_12() throws Throwable;
private static native com.moon.module.Module __call509_13(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.Effects __cast509_14(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite509_15(com.moon.module.impl.SessionInformation a0, com.moon.module.impl.Effects a1) throws Throwable;
private static native java.lang.Exception __call1050900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1050903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_636585c9e4ec00615cc4(java.lang.String a0) throws E;
private static final class __SourceHandler_636585c9e4ec00615cc4 {

public static boolean f510(java.lang.String p0) throws Throwable {
    int forwardValue510_12_0;
    int forwardValue510_14_0;
    boolean spill510_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (__fieldRead510_0() ^ 130015104987528L);
    life3_5 = __call510_1();
    spill510_0 = __call510_2(p0);
    if (!((life3_5 != null))) {
        forwardValue510_12_0 = __integerCategory510_3(spill510_0);
        break forward_join_12;
    }
    if (!((!spill510_0))) {
        break forward_join_13;
    }
    forwardValue510_12_0 = 1;
    }
    forwardValue510_14_0 = forwardValue510_12_0;
    break forward_join_14;
    }
    forwardValue510_14_0 = 0;
    }
    return __integerCategory510_4(forwardValue510_14_0);
}
public static void h510_0(moom.Oo p0) throws Throwable {
    throw __call1051000_0(p0);
}
private static native long __fieldRead510_0() throws Throwable;
private static native java.lang.String __call510_1() throws Throwable;
private static native boolean __call510_2(java.lang.String a0) throws Throwable;
private static native int __integerCategory510_3(boolean value) throws Throwable;
private static native boolean __integerCategory510_4(int value) throws Throwable;
private static native java.lang.Exception __call1051000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_0e520a640a6b1c09c8e7(java.lang.String a0) throws E;
private static final class __SourceHandler_0e520a640a6b1c09c8e7 {

public static boolean f511(java.lang.String p0) throws Throwable {
    int forwardValue511_12_0;
    int forwardValue511_14_0;
    boolean spill511_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (__fieldRead511_0() ^ 102022770819385L);
    life3_5 = __call511_1();
    spill511_0 = __call511_2(p0);
    if (!((life3_5 != null))) {
        forwardValue511_12_0 = __integerCategory511_3(spill511_0);
        break forward_join_12;
    }
    if (!((!spill511_0))) {
        break forward_join_13;
    }
    forwardValue511_12_0 = 1;
    }
    forwardValue511_14_0 = forwardValue511_12_0;
    break forward_join_14;
    }
    forwardValue511_14_0 = 0;
    }
    return __integerCategory511_4(forwardValue511_14_0);
}
public static void h511_0(moom.Oo p0) throws Throwable {
    throw __call1051100_0(p0);
}
private static native long __fieldRead511_0() throws Throwable;
private static native java.lang.String __call511_1() throws Throwable;
private static native boolean __call511_2(java.lang.String a0) throws Throwable;
private static native int __integerCategory511_3(boolean value) throws Throwable;
private static native boolean __integerCategory511_4(int value) throws Throwable;
private static native java.lang.Exception __call1051100_0(moom.Oo a0) throws Throwable;

}


private void b(java.lang.String p0) { __sourceHandlerCall_c021e7e1068c7837699f(this, p0); }


private int b() { return __sourceHandlerCall_a1ed04f2b5fbd571bb54(this); }


private static long e(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7864);
    if (((com.moon.module.impl.SessionInformation.tb)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.module.impl.SessionInformation.sb)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.SessionInformation.ub)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.SessionInformation.ub)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/lL", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.module.impl.SessionInformation.tb)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.module.impl.SessionInformation.tb)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral2650_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.module.impl.SessionInformation.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.SessionInformation.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2651_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1207_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1207_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1207_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1207_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1207_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1207_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12346);
    if (((com.moon.module.impl.SessionInformation.lb)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.SessionInformation.mb)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.SessionInformation.mb)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lL", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.SessionInformation.kb)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.SessionInformation.lb)[life5_8] = com.moon.module.impl.SessionInformation.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.SessionInformation.lb)[life5_8];
}


private static java.lang.Exception c(java.lang.Exception p0) {
return p0;
}


private void f() { __sourceHandlerCall_08735ff15cbf7e52de55(this); }


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5016;
      if (pb[var3] == null) {
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
         long var5 = ob[var3];
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
         Object[] var9 = (Object[])qb.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               qb.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lL", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         pb[var3] = var15;
      }

      return pb[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2655_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lL"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.SessionInformation.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a(com.moon.event.TickEvent p0) { __sourceHandlerCall_5b1251ab74533a0c156d(this, p0); }


public void a(com.moon.ev p0) {
this.S = ((int)(0));
    this.T = ((int)(0));
    this.Y = ((long)(0L));
    this.X = ((long)(0L));
    return;
}


private int a(float p0, com.moon.module.impl.HUD p1, com.moon.b0 p2, int p3, int p4) {
return ((com.moon.module.impl.SessionInformation)(this)).a(((float)(p0)), ((double)(0x1.194p12d)), ((com.moon.module.impl.HUD)(p1)), ((com.moon.b0)(p2)), ((int)(p3)), ((int)(p4)));
}


private moom.DN<java.lang.Integer, java.lang.Integer> a__DN() {
int local1 = org.lwjgl.input.Mouse.getX();
    int local2 = (org.lwjgl.opengl.Display.getHeight() - org.lwjgl.input.Mouse.getY());
    float local3 = ((float) ((moom.ir)(com.moon.nS.a())).c());
    local1 = ((int) (((float) local1) / local3));
    local2 = ((int) (((float) local2) / local3));
    return new moom.DN(java.lang.Integer.valueOf(((int)(local1))), java.lang.Integer.valueOf(((int)(local2))));
}


public void a(com.moon.event.PacketEvent p0) { __sourceHandlerCall_98a4c5d8d0fc4651760d(this, p0); }


private boolean a(int p0, int p1, float p2, float p3, float p4, float p5) { return __sourceHandlerCall_3511c4362dc3f0feb193(this, p0, p1, p2, p3, p4, p5); }


private java.io.File a() { return __sourceHandlerCall_0882d7e250a3774ca38d(this); }


public void a(com.moon.ej p0) { __sourceHandlerCall_3eff4b7622fb7725c204(this, p0); }


public void a(com.moon.event.Render2DEvent p0) { __sourceHandlerCall_392b8bda3ef3c9af9dfc(this, p0); }


private int a(float p0, double p1, com.moon.module.impl.HUD p2, com.moon.b0 p3, int p4, int p5) { return __sourceHandlerCall_ba28d9d1f1727392bbd4(this, p0, p1, p2, p3, p4, p5); }


private void lambda$new$0(java.lang.String p0) {
((com.moon.module.impl.SessionInformation)(this)).a();
    return;
}


private void lambda$new$1(java.lang.Void p0, java.lang.Void p1) {
long local3 = (com.moon.module.impl.SessionInformation.cb ^ 82596425136276L);
    java.io.File local5 = ((com.moon.module.impl.SessionInformation)(this)).a();
    try {
        ((java.awt.Desktop)(java.awt.Desktop.getDesktop())).open(((java.io.File)(local5)));
    } catch (java.io.IOException caught6) {
        ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_50479a8f0bb1_invokedynamic2663_7(28604, (4787497624610175515L ^ local3))))))).b(((java.lang.String)(__sourceIntrinsic_50479a8f0bb1_invokedynamic2663_9(30891, (1570999271267593474L ^ local3))))))).a(((com.moon.b8)(com.moon.b8.ERROR))))).a(((long)(__sourceIntrinsic_50479a8f0bb1_invokedynamic2663_13(28399, (2177755637657851335L ^ local3))))))).a())));
    }
    return;
}


private void lambda$new$9() {
terminal_cycle_0: while (true) {
        ((com.moon.gX)(this.L)).a(((int)(((org.lwjgl.opengl.DisplayMode)(org.lwjgl.opengl.Display.getDesktopDisplayMode())).getFrequency())));
        this.aa = ((boolean)(true));
        continue terminal_cycle_0;
    }
}


private static com.moon.gM lambda$ensureSessionInformationFolder$16(java.lang.String p0) {
return new com.moon.gM();
}


private static java.lang.String lambda$processChatMessage$15(java.lang.String p0, java.lang.String p1) {
long local2 = (com.moon.module.impl.SessionInformation.cb ^ 107843899139365L);
    return ((java.lang.String)(p1)).replaceAll(((java.lang.String)(__sourceIntrinsic_81c9b9f14536_originalDynamicSite533_1(16031, (1333407728367629963L ^ local2)))), ((java.lang.String)(p0)));
}


private static java.lang.String lambda$processChatMessage$13(java.lang.String p0, java.lang.String p1) {
long local2 = (com.moon.module.impl.SessionInformation.cb ^ 12336131673490L);
    return ((java.lang.String)(p1)).replaceAll(((java.lang.String)(__sourceIntrinsic_d61a75faa5e7_originalDynamicSite534_1(5297, (4306662091060835362L ^ local2)))), ((java.lang.String)(p0)));
}


private static com.moon.cz lambda$receiveTick$10(java.lang.String p0) {
return new com.moon.cz();
}


private static boolean lambda$processChatMessage$12(java.lang.String p0) { return __sourceHandlerCall_636585c9e4ec00615cc4(p0); }


private static boolean lambda$processChatMessage$14(java.lang.String p0) { return __sourceHandlerCall_0e520a640a6b1c09c8e7(p0); }


private static void lambda$receiveTick$11() {
((com.moon.ct)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__ct())).a(((java.util.Collection)(((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a__List())));
    return;
}


private void lambda$new$3(java.lang.Void p0, java.lang.Void p1) {
long local3 = (com.moon.module.impl.SessionInformation.cb ^ 71446070664224L);
    ((java.util.Map)(this.s)).forEach(((java.util.function.BiConsumer)(__sourceIntrinsic_052c70e72633_originalDynamicSite535_2())));
    ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_052c70e72633_originalDynamicSite535_7(28604, (4787485134122622639L ^ local3))))))).b(((java.lang.String)(__sourceIntrinsic_052c70e72633_originalDynamicSite535_9(31004, (515485728988923962L ^ local3))))))).a(((com.moon.b8)(com.moon.b8.SUCCESS))))).a(((long)(__sourceIntrinsic_052c70e72633_originalDynamicSite535_13(28399, (2177766203862200691L ^ local3))))))).a())));
    return;
}


private static void lambda$new$2(java.lang.String p0, com.moon.gM p1) {
((com.moon.gM)(p1)).a__Void();
    return;
}


private static java.lang.Boolean lambda$new$4() {
return java.lang.Boolean.valueOf(((boolean)(false)));
}


private java.lang.String lambda$new$8() {
return this.Z;
}


private java.lang.String lambda$new$6() {
long local1 = (com.moon.module.impl.SessionInformation.cb ^ 97623448074148L);
    return __sourceIntrinsic_a62e4b23808a_originalDynamicSite536_3(this.S, __sourceIntrinsic_a62e4b23808a_originalDynamicSite536_2(18883, (6568092935527764806L ^ local1)));
}


private static java.lang.Boolean lambda$new$5() {
return java.lang.Boolean.valueOf(((boolean)(false)));
}


private java.lang.String lambda$new$7() {
long local1 = (com.moon.module.impl.SessionInformation.cb ^ 64158924886963L);
    return __sourceIntrinsic_4043a0b77943_originalDynamicSite537_3(this.T, __sourceIntrinsic_4043a0b77943_originalDynamicSite537_2(5213, (7820848294659533510L ^ local1)));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_6(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_16(com.moon.module.impl.SessionInformation a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_56(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_77(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_79(com.moon.module.impl.SessionInformation a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_84(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_87(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_89(com.moon.module.impl.SessionInformation a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_96() throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_103() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_122(com.moon.module.impl.SessionInformation a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_128(com.moon.module.impl.SessionInformation a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_134(com.moon.module.impl.SessionInformation a0) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_141(com.moon.module.impl.SessionInformation a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_78de31e6aaa952ff_originalDynamicSite31_143(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2651_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2655_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral2650_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_50479a8f0bb1_invokedynamic2663_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_50479a8f0bb1_invokedynamic2663_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_50479a8f0bb1_invokedynamic2663_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.BiConsumer __sourceIntrinsic_052c70e72633_originalDynamicSite535_2() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_052c70e72633_originalDynamicSite535_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_052c70e72633_originalDynamicSite535_9(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_052c70e72633_originalDynamicSite535_13(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a62e4b23808a_originalDynamicSite536_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a62e4b23808a_originalDynamicSite536_3(int a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4043a0b77943_originalDynamicSite537_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_4043a0b77943_originalDynamicSite537_3(int a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_d61a75faa5e7_originalDynamicSite534_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_81c9b9f14536_originalDynamicSite533_1(int a0, long a1) throws E;

private static native com.v __sourceExactCall_f61d11b8decb1d(int p0);
}
