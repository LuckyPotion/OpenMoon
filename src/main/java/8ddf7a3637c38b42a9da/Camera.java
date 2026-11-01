package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Camera extends com.moon.module.Module {

private static moom.DD s;

public com.moon.setting.BooleanSetting t;

public com.moon.setting.BooleanSetting u;

public com.moon.setting.BooleanSetting v;

public com.moon.setting.BooleanSetting w;

public com.moon.setting.BooleanSetting x;

public com.moon.setting.BooleanSetting y;

public com.moon.setting.SettingGroup z;

public com.moon.setting.IntegerSetting A;

public com.moon.setting.IntegerSetting B;

public com.moon.setting.SettingGroup C;

private com.moon.setting.BooleanSetting D;

private com.moon.setting.BooleanSetting E;

private com.moon.setting.BooleanSetting F;

private com.moon.setting.BooleanSetting G;

private com.moon.setting.BooleanSetting H;

public com.moon.setting.BooleanSetting I;

public com.moon.setting.SettingGroup J;

private net.minecraft.client.shader.Framebuffer K;

private boolean L;

private boolean M;

private com.moon.hW N;

private com.moon.hW O;

private int P;

private static long Q;

private static java.lang.String[] R;

private static java.lang.String[] S;

private static java.util.Map T;

private static long[] U;

private static java.lang.Integer[] V;

private static java.util.Map W;

public Camera(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_798025ff290f693a(com.moon.module.impl.Camera receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.Camera.Q ^ 95462033356199L);

    com.moon.module.impl.Camera.__sourceConstructorInit_798025ff290f693a_0(((com.moon.module.impl.Camera)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Camera)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_5(1277, (2449393404020223624L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_8(13149, (7559832509393426734L ^ local5_life2)))), ((boolean)(true))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_11(26822, (3148705869945733817L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_16(619, (9177104707388696579L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_19(5276, (6097496190945853183L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_24(27877, (687123504719562376L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_27(21846, (6149563213298351904L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_32(11061, (8909022319819440475L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_35(12907, (3168212192168499218L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_40(14636, (7301385197891212110L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_43(10305, (1686527839525290534L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_48(4654, (898817165272053850L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_51(14913, (8024667038739157052L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.Camera __sourceSpill148_58 = receiver;

    com.moon.me __sourceSpill148_59 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill148_60 = __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_57(6210, (3656516622522905124L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp148_61_0 = new com.moon.setting.Setting[4];

    com.moon.setting.Setting[] __sourceSpill148_63 = __stackOp148_61_0;

    (__stackOp148_61_0)[0] = ((com.moon.module.impl.Camera)(receiver)).v;

    com.moon.setting.Setting[] __stackOp148_64_0 = __sourceSpill148_63;

    com.moon.setting.Setting[] __sourceSpill148_66 = __stackOp148_64_0;

    (__stackOp148_64_0)[1] = ((com.moon.module.impl.Camera)(receiver)).w;

    com.moon.setting.Setting[] __stackOp148_67_0 = __sourceSpill148_66;

    com.moon.setting.Setting[] __sourceSpill148_69 = __stackOp148_67_0;

    (__stackOp148_67_0)[2] = ((com.moon.module.impl.Camera)(receiver)).x;

    com.moon.setting.Setting[] __stackOp148_70_0 = __sourceSpill148_69;

    com.moon.setting.Setting[] __sourceSpill148_72 = __stackOp148_70_0;

    (__stackOp148_70_0)[3] = ((com.moon.module.impl.Camera)(receiver)).y;

    ((com.moon.module.impl.Camera)(__sourceSpill148_58)).z = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill148_59)).a(((java.lang.String)(__sourceSpill148_60)), ((com.moon.setting.Setting[])(__sourceSpill148_72))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).A = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_77(13580, (2895026990442667881L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_80(1538, (145667696237341810L ^ local5_life2)))), ((int)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_82(28097, (3423870384854698699L ^ local5_life2)))), ((int)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_84(22987, (6998193863613071052L ^ local5_life2)))), ((int)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_86(12603, (3718470680384689719L ^ local5_life2)))), ((int)(1))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).B = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_91(5869, (4193425911045618823L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_94(1675, (4099250096824282338L ^ local5_life2)))), ((int)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_96(3231, (91841779779988379L ^ local5_life2)))), ((int)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_98(18811, (5933724962716757622L ^ local5_life2)))), ((int)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_100(10177, (1874657954204565718L ^ local5_life2)))), ((int)(1))))).a()));

    com.moon.module.impl.Camera __sourceSpill148_107 = receiver;

    com.moon.me __sourceSpill148_108 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill148_109 = __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_106(3631, (5309972138683622484L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp148_110_0 = new com.moon.setting.Setting[2];

    com.moon.setting.Setting[] __sourceSpill148_112 = __stackOp148_110_0;

    (__stackOp148_110_0)[0] = ((com.moon.module.impl.Camera)(receiver)).A;

    com.moon.setting.Setting[] __stackOp148_113_0 = __sourceSpill148_112;

    com.moon.setting.Setting[] __sourceSpill148_115 = __stackOp148_113_0;

    (__stackOp148_113_0)[1] = ((com.moon.module.impl.Camera)(receiver)).B;

    ((com.moon.module.impl.Camera)(__sourceSpill148_107)).C = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill148_108)).a(((java.lang.String)(__sourceSpill148_109)), ((com.moon.setting.Setting[])(__sourceSpill148_115))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).D = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_120(10409, (6670880098916090590L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_123(9493, (8409318901758447440L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).E = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_128(7331, (9106819819638060738L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_131(15050, (5080890048037114022L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).F = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_136(4969, (1127677725904337175L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_139(7585, (1387407461446678489L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).G = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_144(17424, (8346427669692591739L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_147(10472, (6691084161381909128L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).H = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_152(25727, (5274664186736872976L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_155(16986, (4849583361022011454L ^ local5_life2)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).I = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_160(5763, (3928012194785852657L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_163(8093, (3034846994872956385L ^ local5_life2)))), ((boolean)(false))))).a()));

    com.moon.module.impl.Camera __sourceSpill148_172 = receiver;

    com.moon.me __sourceSpill148_173 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill148_174 = __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_169(4639, (2318509713554405477L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp148_175_0 = new com.moon.setting.Setting[__sourceIntrinsic_798025ff290f693a_originalDynamicSite148_171(7776, (4586413983160596848L ^ local5_life2))];

    com.moon.setting.Setting[] __sourceSpill148_177 = __stackOp148_175_0;

    (__stackOp148_175_0)[0] = ((com.moon.module.impl.Camera)(receiver)).D;

    com.moon.setting.Setting[] __stackOp148_178_0 = __sourceSpill148_177;

    com.moon.setting.Setting[] __sourceSpill148_180 = __stackOp148_178_0;

    (__stackOp148_178_0)[1] = ((com.moon.module.impl.Camera)(receiver)).E;

    com.moon.setting.Setting[] __stackOp148_181_0 = __sourceSpill148_180;

    com.moon.setting.Setting[] __sourceSpill148_183 = __stackOp148_181_0;

    (__stackOp148_181_0)[2] = ((com.moon.module.impl.Camera)(receiver)).F;

    com.moon.setting.Setting[] __stackOp148_184_0 = __sourceSpill148_183;

    com.moon.setting.Setting[] __sourceSpill148_186 = __stackOp148_184_0;

    (__stackOp148_184_0)[3] = ((com.moon.module.impl.Camera)(receiver)).G;

    com.moon.setting.Setting[] __stackOp148_187_0 = __sourceSpill148_186;

    com.moon.setting.Setting[] __sourceSpill148_189 = __stackOp148_187_0;

    (__stackOp148_187_0)[4] = ((com.moon.module.impl.Camera)(receiver)).H;

    com.moon.setting.Setting[] __stackOp148_190_0 = __sourceSpill148_189;

    com.moon.setting.Setting[] __sourceSpill148_192 = __stackOp148_190_0;

    (__stackOp148_190_0)[5] = ((com.moon.module.impl.Camera)(receiver)).I;

    ((com.moon.module.impl.Camera)(__sourceSpill148_172)).J = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill148_173)).a(((java.lang.String)(__sourceSpill148_174)), ((com.moon.setting.Setting[])(__sourceSpill148_192))))).a()));

    ((com.moon.module.impl.Camera)(receiver)).K = ((net.minecraft.client.shader.Framebuffer)(new net.minecraft.client.shader.Framebuffer(1, 1, true)));

    ((com.moon.module.impl.Camera)(receiver)).L = ((boolean)(true));

    ((com.moon.module.impl.Camera)(receiver)).M = ((boolean)(true));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_798025ff290f693a_0(com.moon.module.impl.Camera a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
Q = ((long)(((moom._a)(moom._c.a(((long)(3252574814062614596L)), ((long)(-2544119831283854251L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(132681186610095L)))));
    long local20_life6 = (com.moon.module.impl.Camera.Q ^ 25707043909387L);
    T = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life9;
    javax.crypto.Cipher __sourceSpill263_11 = (local11_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill263_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill263_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill263_14 = new byte[8];
    (__sourceSpill263_14)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local12_life15 = 1;
    while ((local12_life15 < 8)) {
        (__sourceSpill263_14)[local12_life15] = ((byte) ((int) ((local20_life6 << (local12_life15 * 8)) >>> 56)));
        local12_life15 += 1;
    }
    byte[] __sourcePreallocation263_16 = __sourceSpill263_14;
    ((javax.crypto.Cipher)(__sourceSpill263_11)).init(((int)(__sourceSpill263_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill263_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation263_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local18_life19 = new java.lang.String[33];
    int local16_life20 = 0;
    java.lang.String local15_life21;
    int local17_life23 = ((java.lang.String)((local15_life21 = "Åâ.íOåT8ßx¢À\030{£sSÊÀ}ã\017\002\033\023r0\017\027Ø¸T0\b\033r(/!²ÛÕ>\036Òsä\025ÐÒç6\003\006ÞCD\003t)`ñ\rÂ>&³í#&1\017\027\n(üMÞÃÌíneéZ\003ì\022ÿûè©§*MFxy$Ä[ã\032H¨_\025 Y©Üºz{å³¦/IÄ\000j¸\nkz\026¡è:mÓb°}Ã\t\002yÆ &j}îÐBvSfBMìÈÁ7\006\031\024öj§\035\003(Dh{æÃ\004ü®\013TòH£©\\@mRíòüÁ\035}=\020uå\021C~í«Ð[k\016 J(f0l\016öÝØ×©<bG5\021g\033**¤\000Q'ú\006õ¹¬_(ôà¸V³LÃ\017]:ÁøièwÖN\024I-.ÕæBîo¢\tC&\032K\032\035Q *\000M×¬Uô®Ul\026ímF^¨#­-\027\\Î©÷WC¥> \001Á`f¾wû\033S º\004{h6PãE\007xwè\f­\033¯K\bI(Tz|fS¥\016¹\b®\037=\013\016³¾JÕ\032\036\033\032$¨Ø4t\016÷_Ü#,(\006\177\024íkaÑÿÒ<§çÞ\002 Ç\\ÆÑúÜ\r>*0&¦°äL¤T¤B8è¥%\177Q\023\"ú<\0318zÉÀïP¦¤e\003\013+yÿhs\036<C+3¦¢\002Ëe¥õÛ¥TfdRÆÕlyäà(\r\\@\bgñüÁß\025\017ºÇçzM\036E Í\\\023ÿ\006Ôg%I.\024g¬(­\030t´Ü\002à\177rµëf`~è@À\035\006\004Iª\016.÷o¾Ùõ®f \031 ¥²0`¡­LÒ\006ó+ë\f0ò\025f5\026éâä®ò»ìíø\\öµ¥²ÔÙÄóè\032Ñã2\030¢qfJj:Öã\036»¤\030+)ôÓ\002\b8z\025æ'\006Rbx\022¤ h.µY_«\026\\\017S>7\007ªXùîºXÅö÷-²´Àßú»\005ðë íô9\"vþí\022ª2\017/òn¸Ê\023\rBù¿Æ¤\rÈöð\001?Ò\036\030\030·ÇëÉ­/ÎUIuø)3\004ø{)4Iù0<\037i°þESR\016­Ám1­ÛWÚJ\016oih\017kÎ\035%Þ(ãAà/ø²)(³¨Aµ+Yãà¢<æN\n¾ûÿð\007w}'¸í÷ãí[KZ\\©ÕçêK\\ ¬­{µècL)5ê:/æVºûr\016LÙÝut)S\032\022\024(kØ+ã8wÃ»§k\nMå´ßdëCN\032ÙjLg.}°W({nV,iÃ0|½\017\026b](0¥aÑÌe\035<k\017ºÎ\031~n>}Þ@Wß8À<Ì\002½ 2axVÛ0ã¹Ëi¢Ör-þI¡ 8eöÃ\027ãþ¿ eC A^g\002¾\rÞ\0022§J\tH^zÁì\021Ü½l!7\0071¢\\ôþL×åûy Ã+T¦\027r\004Ý5Ë\fY\beÏØþù\004ì9o Ö¸¯a«\022kÏHüµf8}§A| Ï8Bº\0302Ø\005÷Â}\031ÔTâ\t\003U¯%`åív·(ÂÈ+¼i_x3rØõ\023¦fËg\000±KQñÍûÍÊ\013\024àn0ON5 ê?ó¥Ì\002\004aÊP¦Í\031ðLà|Ã~>GcîÛ\007¯2(V!ÃbR³\033Ý\004\t4ÔFõìs)\rf¸\017¨*ÂGo\"\016îrA­ "))).length();
    int local14_life24 = 40;
    int local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill263_28 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill263_29 = local11_life9;
        byte[] local19_life31 = ((javax.crypto.Cipher)(__sourceSpill263_29)).doFinal(((byte[])(__sourceSpill263_28)));
        java.lang.String __sourceSpill263_34 = ((java.lang.String)(com.moon.module.impl.Camera.c(((byte[])(local19_life31))))).intern();
        java.lang.String[] __sourceSpill263_35 = local18_life19;
        int __sourceSpill263_36 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill263_35)[__sourceSpill263_36] = __sourceSpill263_34;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    local17_life23 = ((java.lang.String)((local15_life21 = "\\µÃ¶ròÄÍ¿eËDÒ\005­\0302à0Å\024<GÏ}\020D7f«\016×\027\034rã\017\bøÅ"))).length();
    local14_life24 = 16;
    local13_life25 = -1;
    while (true) {
        local13_life25 += 1;
        byte[] __sourceSpill263_41 = ((java.lang.String)(((java.lang.String)(local15_life21)).substring(((int)(local13_life25)), ((int)((local13_life25 + local14_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill263_42 = local11_life9;
        byte[] local19_life44 = ((javax.crypto.Cipher)(__sourceSpill263_42)).doFinal(((byte[])(__sourceSpill263_41)));
        java.lang.String __sourceSpill263_47 = ((java.lang.String)(com.moon.module.impl.Camera.c(((byte[])(local19_life44))))).intern();
        java.lang.String[] __sourceSpill263_48 = local18_life19;
        int __sourceSpill263_49 = local16_life20;
        local16_life20 += 1;
        (__sourceSpill263_48)[__sourceSpill263_49] = __sourceSpill263_47;
        if (!(((local13_life25 = (local13_life25 + local14_life24)) < local17_life23))) { break; }
        local14_life24 = ((java.lang.String)(local15_life21)).charAt(((int)(local13_life25)));
    }
    R = ((java.lang.String[])(local18_life19));
    S = ((java.lang.String[])(new java.lang.String[33]));
    W = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill263_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill263_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill263_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill263_60 = new byte[8];
    (__sourceSpill263_60)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill263_60)[local1_life61] = ((byte) ((int) ((local20_life6 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation263_62 = __sourceSpill263_60;
    ((javax.crypto.Cipher)(__sourceSpill263_57)).init(((int)(__sourceSpill263_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill263_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation263_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[25];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "*`¸kÑT\017N FêG0aZÍ»{\023\035ò;E\032Fo§j=bÄÊþâ¶cñ(\002º¹E Ìs´\023=£pËÓibOü½$\t}¸¬kÈm>xt¼£[~$bzÒÓ\023ò¡¢mí[¯^R7´\003Æ\035-\nÐ\037u\013ßá´¢MAÖjP|ØªD@[ýi6àxD´\\Þ%$þajKb1\021d\036\017ðÕÁlC¸èã:9_à7'Äßª\021»W9\021\031 Ë\004Qî½"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill263_71 = local4_life67;
        int __sourceSpill263_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill263_71)).substring(((int)(__sourceSpill263_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill263_76 = local6_life65;
        int __sourceSpill263_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill263_79 = new byte[8];
        (__sourceSpill263_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill263_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill263_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill263_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill263_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill263_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill263_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill263_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill263_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill263_80)).doFinal(((byte[])(__sourceSpill263_79)));
        (__sourceSpill263_76)[__sourceSpill263_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "y\177\002æ&Ûø¯ÐÃ´vjð¨"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill263_84 = local4_life67;
        int __sourceSpill263_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill263_84)).substring(((int)(__sourceSpill263_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill263_89 = local6_life65;
        int __sourceSpill263_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill263_92 = new byte[8];
        (__sourceSpill263_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill263_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill263_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill263_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill263_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill263_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill263_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill263_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill263_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill263_93)).doFinal(((byte[])(__sourceSpill263_92)));
        (__sourceSpill263_89)[__sourceSpill263_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    U = ((long[])(local6_life65));
    V = ((java.lang.Integer[])(new java.lang.Integer[25]));
    s = ((moom.DD)(new moom.DD(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite263_98(16490, (8677389912725696695L ^ local20_life6)))));
}


public com.moon.setting.BooleanSetting i() {
return this.F;
}


private void b(com.moon.d_ p0) {
int forwardValue808_16_0;
    net.minecraft.client.shader.Framebuffer forwardValue808_58_0;
    int forwardValue808_58_1;
    int forwardValue808_72_0;
    boolean spill808_0;
    boolean spill808_1;
    net.minecraft.client.shader.Framebuffer spill808_2;
    int spill808_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_22;
    int life6_25;
    forward_join_85: {
    forward_join_72: {
    forward_join_63: {
    forward_join_58: {
    forward_join_52: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.Camera.Q ^ 57824538679589L);
    life4_5 = com.moon.bY.b();
    spill808_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue808_16_0 = ((spill808_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill808_0)) {
        break forward_join_85;
    }
    forwardValue808_16_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).G;
    }
    life5_22 = forwardValue808_16_0;
    life6_25 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).H;
    spill808_1 = this.L;
    if (!((life4_5 == null))) {
        forwardValue808_72_0 = ((spill808_1) ? 1 : 0);
        break forward_join_72;
    }
    if (!(spill808_1)) {
        break forward_join_63;
    }
    ((net.minecraft.client.shader.Framebuffer)(this.K)).e = ((boolean)(true));
    spill808_2 = this.K;
    spill808_3 = life5_22;
    if (!((life4_5 == null))) {
        forwardValue808_58_0 = spill808_2;
        forwardValue808_58_1 = spill808_3;
        break forward_join_58;
    }
    if (!(((net.minecraft.client.shader.Framebuffer)(spill808_2)).a__Boolean(((int)(spill808_3)), ((int)(life6_25))))) {
        break forward_join_52;
    }
    ((net.minecraft.client.shader.Framebuffer)(this.K)).a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    ((net.minecraft.client.shader.Framebuffer)(this.K)).a(((int)(__sourceIntrinsic_aa1ab8975269_invokedynamic808_20(27802, (1603991261467125530L ^ life2_3)))));
    }
    ((net.minecraft.client.shader.Framebuffer)(this.K)).f();
    forwardValue808_58_0 = this.K;
    forwardValue808_58_1 = 1;
    }
    ((net.minecraft.client.shader.Framebuffer)(forwardValue808_58_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue808_58_1))));
    moom.kZ.j();
    moom.kZ.d__Void();
    if (!((life4_5 != null))) {
        break forward_join_85;
    }
    }
    ((com.moon.d_)(p0)).setCancelled(((boolean)(true)));
    forwardValue808_72_0 = __sourceIntrinsic_aa1ab8975269_invokedynamic808_29(28496, (40151629928604887L ^ life2_3));
    }
    moom.kZ.b(((int)(forwardValue808_72_0)), ((int)(__sourceIntrinsic_aa1ab8975269_invokedynamic808_30(9889, (4758078927507221808L ^ life2_3)))));
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    moom.kZ.f();
    moom.kZ.d__Void();
    }
    return;
}


public int b() {
return this.P;
}


public com.moon.hW b__hW() {
return this.O;
}


public com.moon.setting.IntegerSetting b__k1() {
return this.B;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.u;
}


public com.moon.setting.SettingGroup b__k0() {
return this.C;
}


public com.moon.setting.BooleanSetting e() {
return this.x;
}


public com.moon.setting.SettingGroup c() {
return this.J;
}


public com.moon.setting.BooleanSetting c__kV() {
return this.v;
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
        byte[] spill1056_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1056_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1056_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1056_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1056_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1056_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8774);
    if (((com.moon.module.impl.Camera.S)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Camera.T)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Camera.T)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lQ", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Camera.R)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Camera.S)[life5_8] = com.moon.module.impl.Camera.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Camera.S)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Camera.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2414_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean c__Boolean() {
return ((((this.L) ? 1 : 0)) != 0);
}


public com.moon.setting.BooleanSetting h() {
return this.E;
}


public com.moon.setting.BooleanSetting f() {
return this.y;
}


private void f__Void() {
int forwardValue809_63_0;
    com.moon.module.impl.Camera forwardValue809_74_0;
    com.moon.hW forwardValue809_84_0;
    com.moon.hW forwardValue809_109_0;
    int forwardValue809_257_0;
    int forwardValue809_257_1;
    net.minecraft.client.gui.GuiIngame forwardValue809_337_0;
    boolean spill809_0;
    int spill809_1;
    com.moon.module.impl.Camera spill809_2;
    int spill809_3;
    int spill809_4;
    com.moon.hW spill809_5;
    int spill809_6;
    long spill809_7;
    net.minecraft.client.gui.GuiIngame spill809_8;
    int spill809_9;
    long spill809_10;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    moom.ir life4_13;
    int life5_155;
    int life6_213;
    moom.ir life5_288;
    int life6_300;
    int life7_304;
    forward_join_345: {
    forward_join_337: {
    forward_join_335: {
    forward_join_257: {
    forward_join_231: {
    forward_join_109: {
    forward_join_91: {
    forward_join_84: {
    forward_join_82: {
    forward_join_74: {
    forward_join_73: {
    forward_join_63: {
    forward_join_26: {
    life1_3 = (com.moon.module.impl.Camera.Q ^ 14640552675564L);
    life3_5 = com.moon.bY.b();
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue())) {
        break forward_join_345;
    }
    life4_13 = com.moon.nS.a();
    spill809_0 = this.L;
    if (!((life3_5 == null))) {
        forwardValue809_63_0 = ((spill809_0) ? 1 : 0);
        break forward_join_63;
    }
    if (!(spill809_0)) {
        break forward_join_26;
    }
    ((net.minecraft.client.shader.Framebuffer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).a__pA())).a(((boolean)(false)));
    this.L = ((boolean)(false));
    }
    moom.kZ.l();
    spill809_1 = 21286;
    moom.kZ.d__Void();
    moom.kZ.a(((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_15(spill809_1, (7239719346369317243L ^ life1_3)))), ((float)(0x1.99999ap-4f)));
    moom.kZ.b(((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_17(22022, (2845110196552518725L ^ life1_3)))), ((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_18(12841, (1604720640641575027L ^ life1_3)))));
    moom.kZ.a(((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_20(22022, (2845110196552518725L ^ life1_3)))), ((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_21(12841, (1604720640641575027L ^ life1_3)))), ((int)(1)), ((int)(0)));
    spill809_2 = this;
    if (!((life3_5 == null))) {
        forwardValue809_74_0 = spill809_2;
        break forward_join_74;
    }
    forwardValue809_63_0 = ((((com.moon.module.impl.Camera)(spill809_2)).M) ? 1 : 0);
    }
    if (!((forwardValue809_63_0 == 0))) {
        break forward_join_73;
    }
    spill809_3 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).K)).bD)).c;
    spill809_4 = this.P;
    if (!((life3_5 == null))) {
        forwardValue809_257_0 = spill809_3;
        forwardValue809_257_1 = spill809_4;
        break forward_join_257;
    }
    if (!((spill809_3 != spill809_4))) {
        break forward_join_231;
    }
    }
    forwardValue809_74_0 = this;
    }
    spill809_5 = ((com.moon.module.impl.Camera)(forwardValue809_74_0)).N;
    if (!((life3_5 == null))) {
        forwardValue809_84_0 = spill809_5;
        break forward_join_84;
    }
    if (!((spill809_5 != null))) {
        break forward_join_82;
    }
    ((com.moon.hY)(((com.moon.hW)(this.N)).a__hY())).g();
    }
    forwardValue809_84_0 = this.O;
    }
    if (!((life3_5 == null))) {
        forwardValue809_109_0 = forwardValue809_84_0;
        break forward_join_109;
    }
    if (!((forwardValue809_84_0 != null))) {
        break forward_join_91;
    }
    ((com.moon.hY)(((com.moon.hW)(this.O)).a__hY())).g();
    }
    this.N = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TEXTURE_COL))))).a__hX())).c())).a()));
    this.O = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TEXTURE_COL))))).a__hX())).c())).a()));
    forwardValue809_109_0 = this.N;
    }
    ((com.moon.hW)(forwardValue809_109_0)).a(((com.moon.iX)(com.moon.i7.a(((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(((float) ((moom.ir)(life4_13)).a()))), ((float)(((float) ((moom.ir)(life4_13)).b()))), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((int)(-1))))));
    life5_155 = (((moom.ir)(life4_13)).a__Int() / 2);
    ((com.moon.hW)(this.O)).a(((com.moon.iX)(com.moon.i7.a(((float)(((float) (life5_155 - __sourceIntrinsic_93a5090229a0_invokedynamic809_59(27467, (6169102823916007680L ^ life1_3)))))), ((float)(((float) (((moom.ir)(life4_13)).b__Int() - __sourceIntrinsic_93a5090229a0_invokedynamic809_61(29265, (6525047544124172302L ^ life1_3)))))), ((float)(((float) (life5_155 + __sourceIntrinsic_93a5090229a0_invokedynamic809_62(32296, (6131185653090477154L ^ life1_3)))))), ((float)(((float) ((moom.ir)(life4_13)).b__Int()))), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.6cp-1f)), ((float)(0x1.6p-4f)), ((int)(-1))))));
    life6_213 = (((life5_155 - __sourceIntrinsic_93a5090229a0_invokedynamic809_66(32296, (6131185653090477154L ^ life1_3))) - 1) + (((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).K)).bD)).c * __sourceIntrinsic_93a5090229a0_invokedynamic809_71(3938, (7089790676940330274L ^ life1_3))));
    ((com.moon.hW)(this.O)).a(((com.moon.iX)(com.moon.i7.a(((float)(((float) life6_213))), ((float)(((float) ((((moom.ir)(life4_13)).b__Int() - __sourceIntrinsic_93a5090229a0_invokedynamic809_74(5315, (9190123465679507083L ^ life1_3))) - 1)))), ((float)(((float) (life6_213 + __sourceIntrinsic_93a5090229a0_invokedynamic809_75(26789, (9028572207648305888L ^ life1_3)))))), ((float)(((float) (((moom.ir)(life4_13)).b__Int() - 1)))), ((float)(0x0.0p0f)), ((float)(0x1.6p-4f)), ((float)(0x1.8p-4f)), ((float)(0x1.6p-3f)), ((int)(-1))))));
    this.M = ((boolean)(false));
    this.P = ((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).K)).bD)).c));
    }
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).a__ok())).a__Void(((moom.DD)(com.moon.module.impl.Camera.s)));
    spill809_6 = 22022;
    moom.kZ.j();
    spill809_7 = (2845110196552518725L ^ life1_3);
    ((com.moon.hW)(this.O)).b();
    moom.kZ.i();
    ((net.minecraft.client.shader.Framebuffer)(this.K)).c__Void();
    ((com.moon.hW)(this.N)).b();
    moom.kZ.l();
    forwardValue809_257_0 = __sourceIntrinsic_93a5090229a0_invokedynamic809_98(spill809_6, spill809_7);
    forwardValue809_257_1 = __sourceIntrinsic_93a5090229a0_invokedynamic809_99(12841, (1604720640641575027L ^ life1_3));
    }
    moom.kZ.a(((int)(forwardValue809_257_0)), ((int)(forwardValue809_257_1)), ((int)(1)), ((int)(0)));
    life5_288 = com.moon.nS.a();
    spill809_8 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).T;
    if (!((life3_5 == null))) {
        forwardValue809_337_0 = spill809_8;
        break forward_join_337;
    }
    if (!(((net.minecraft.client.gui.GuiIngame)(spill809_8)).a__Boolean())) {
        break forward_join_335;
    }
    life6_300 = ((moom.ir)(life5_288)).a__Int();
    spill809_9 = 11643;
    life7_304 = ((moom.ir)(life5_288)).b__Int();
    spill809_10 = (3521874728924493625L ^ life1_3);
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.c)));
    moom.kZ.a(((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_111(spill809_9, spill809_10))), ((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_112(30645, (1781859645268422116L ^ life1_3)))), ((int)(1)), ((int)(0)));
    com.moon.module.impl.Camera.a(((int)(((life6_300 / 2) - __sourceIntrinsic_93a5090229a0_invokedynamic809_114(11376, (1224760038614677044L ^ life1_3))))), ((int)(((life7_304 / 2) - __sourceIntrinsic_93a5090229a0_invokedynamic809_115(11376, (1224760038614677044L ^ life1_3))))), ((int)(0)), ((int)(0)), ((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_116(10299, (8871965470195200610L ^ life1_3)))), ((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_117(9307, (6945241364097777174L ^ life1_3)))));
    moom.kZ.a(((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_119(22022, (2845110196552518725L ^ life1_3)))), ((int)(__sourceIntrinsic_93a5090229a0_invokedynamic809_120(12841, (1604720640641575027L ^ life1_3)))), ((int)(1)), ((int)(0)));
    }
    forwardValue809_337_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).T;
    }
    ((net.minecraft.client.gui.GuiIngame)(forwardValue809_337_0)).a(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).K)).a(((float)(((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).l)).b))))), ((moom.ir)(com.moon.nS.a())));
    }
    return;
}


public com.moon.setting.BooleanSetting l() {
return this.I;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Camera.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2416_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lQ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12065;
      if (V[var3] == null) {
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
         long var5 = U[var3];
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
         Object[] var9 = (Object[])W.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               W.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lQ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         V[var3] = var15;
      }

      return V[var3];
}


public boolean d__Boolean() {
return ((((this.M) ? 1 : 0)) != 0);
}


public com.moon.setting.BooleanSetting d() {
return this.w;
}


public void a(com.moon.d3 p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 21684820458607L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.d3)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.d8 p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 69433570195352L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.E)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.d8)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.dO p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 96242784192956L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.D)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.dO)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.d5 p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 1180478919482L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.G)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.d5)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public com.moon.hW a() {
return this.N;
}


public com.moon.setting.IntegerSetting a__k1() {
return this.A;
}


public void a(com.moon.eM p0) {
this.M = ((boolean)(true));
    return;
}


public void a(com.moon.eS p0) {
this.M = ((boolean)(true));
    return;
}


public void a(com.moon.ec p0) {
int forwardValue807_18_0;
    net.minecraft.entity.Entity forwardValue807_32_0;
    int forwardValue807_59_0;
    int forwardValue807_67_0;
    boolean spill807_0;
    net.minecraft.entity.Entity spill807_1;
    int spill807_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.entity.Entity life5_43;
    forward_join_72: {
    forward_join_67: {
    forward_join_59: {
    forward_join_57: {
    forward_join_32: {
    forward_join_30: {
    forward_join_18: {
    forward_join_13: {
    life2_3 = (com.moon.module.impl.Camera.Q ^ 98900052502417L);
    life4_5 = com.moon.bY.b();
    spill807_0 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).a__nw())).g();
    if (!((life4_5 == null))) {
        forwardValue807_18_0 = ((spill807_0) ? 1 : 0);
        break forward_join_18;
    }
    if (!(spill807_0)) {
        break forward_join_13;
    }
    return;
    }
    spill807_1 = ((com.moon.ec)(p0)).a__sourceReturn_09c029d8c3();
    if (!((life4_5 == null))) {
        forwardValue807_32_0 = spill807_1;
        break forward_join_32;
    }
    forwardValue807_18_0 = ((((net.minecraft.entity.Entity)(spill807_1)).aC) ? 1 : 0);
    }
    if (!((forwardValue807_18_0 != 0))) {
        break forward_join_30;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.v)).getValue())))).booleanValue())) {
        break forward_join_30;
    }
    ((com.moon.ec)(p0)).setCancelled(((boolean)(true)));
    return;
    }
    forwardValue807_32_0 = ((com.moon.ec)(p0)).a__sourceReturn_09c029d8c3();
    }
    life5_43 = forwardValue807_32_0;
    spill807_2 = recovery.source.CarrierOps.dcmpl(((double)(((net.minecraft.entity.Entity)(life5_43)).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).K))))), ((double)(((double) (((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.A)).getValue())))).intValue() * ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.A)).getValue())))).intValue())))));
    if (!((life4_5 == null))) {
        forwardValue807_59_0 = spill807_2;
        break forward_join_59;
    }
    if (!((spill807_2 > 0))) {
        break forward_join_57;
    }
    ((com.moon.ec)(p0)).setCancelled(((boolean)(true)));
    }
    forwardValue807_59_0 = ((life5_43 instanceof net.minecraft.entity.item.EntityArmorStand) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue807_67_0 = forwardValue807_59_0;
        break forward_join_67;
    }
    if (!((forwardValue807_59_0 != 0))) {
        break forward_join_72;
    }
    forwardValue807_67_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue807_67_0 != 0))) {
        break forward_join_72;
    }
    ((com.moon.ec)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.ef p0) {
long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    int life5_9;
    net.minecraft.tileentity.TileEntity life6_34;
    net.minecraft.client.entity.EntityPlayerSP life7_37;
    moom.DT life8_40;
    int life9_43;
    double life10_68;
    double life12_81;
    forward_join_103: {
    forward_join_93: {
    forward_join_60: {
    forward_join_32: {
    forward_join_19: {
    forward_join_15: {
    life2_3 = (com.moon.module.impl.Camera.Q ^ 114937366849698L);
    life4_5 = com.moon.bY.b();
    life5_9 = ((((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).a__nw())).g()) ? 1 : 0);
    if (!((life4_5 == null))) { break forward_join_19; }
    if (!((life5_9 != 0))) { break forward_join_15; }
    return;
    }
    life5_9 = ((((net.minecraft.tileentity.TileEntity)(__sourceExactCall_0e09a83f07887b(((com.moon.ef)(p0))))).i) ? 1 : 0);
    }
    if (!((life5_9 != 0))) { break forward_join_32; }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.v)).getValue())))).booleanValue())) { break forward_join_32; }
    ((com.moon.ef)(p0)).setCancelled(((boolean)(true)));
    return;
    }
    life6_34 = __sourceExactCall_0e09a83f07887b(((com.moon.ef)(p0)));
    life7_37 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Camera.d)).K;
    life8_40 = ((net.minecraft.tileentity.TileEntity)(life6_34)).a__DT();
    life9_43 = ((moom.DT)(life8_40)).a();
    if (!((life4_5 == null))) { break forward_join_60; }
    if (!((life9_43 != 0))) { break forward_join_60; }
    life9_43 = ((moom.DT)(life8_40)).b();
    if (!((life9_43 != 0))) { break forward_join_60; }
    life9_43 = ((moom.DT)(life8_40)).c();
    if (!((life9_43 != 0))) { break forward_join_60; }
    life9_43 = 1;
    }
    life10_68 = ((net.minecraft.tileentity.TileEntity)(life6_34)).a(((double)(((net.minecraft.client.entity.EntityPlayerSP)(life7_37)).n)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(life7_37)).o)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(life7_37)).p)));
    life12_81 = ((double) (((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue() * ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.B)).getValue())))).intValue()));
    if (!((life4_5 != null))) { break forward_join_93; }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life10_68)), ((double)(life12_81))) != 0))) { break forward_join_103; }
    ((com.moon.ef)(p0)).setCancelled(((boolean)(true)));
    break forward_join_103;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life10_68)), ((double)(life12_81))) > 0))) { break forward_join_103; }
    if (!((life9_43 != 0))) { break forward_join_103; }
    ((com.moon.ef)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.eg p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 36472594473163L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.F)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.eg)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 99557706297012L);
    if ((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.POST)) {
        this.L = ((boolean)(true));
    }
    return;
}


public com.moon.setting.SettingGroup a__k0() {
return this.z;
}


public void a(com.moon.eh p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 111322076850566L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.eh)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private static void a(int p0, int p1, int p2, int p3, int p4, int p5) {
long local6 = (com.moon.module.impl.Camera.Q ^ 80231562910889L);
    float local8 = 0x1.0p-8f;
    float local9 = 0x1.0p-8f;
    net.minecraft.client.renderer.Tessellator local10 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local11 = ((net.minecraft.client.renderer.Tessellator)(local10)).a__lw();
    ((moom.lw)(local11)).a(((int)(__sourceIntrinsic_499f7b7391d8_originalDynamicSite517_3(22359, (1239205928653707596L ^ local6)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(((double) p0))), ((double)(((double) (p1 + p5)))), ((double)(0x1.9p6d))))).a(((double)(((double) (((float) p2) * local8)))), ((double)(((double) (((float) (p3 + p5)) * local9))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(((double) (p0 + p4)))), ((double)(((double) (p1 + p5)))), ((double)(0x1.9p6d))))).a(((double)(((double) (((float) (p2 + p4)) * local8)))), ((double)(((double) (((float) (p3 + p5)) * local9))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(((double) (p0 + p4)))), ((double)(((double) p1))), ((double)(0x1.9p6d))))).a(((double)(((double) (((float) (p2 + p4)) * local8)))), ((double)(((double) (((float) p3) * local9))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local11)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(0x1.9p6d))))).a(((double)(((double) (((float) p2) * local8)))), ((double)(((double) (((float) p3) * local9))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local10)).a__Void();
    return;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.t;
}


public void a(com.moon.ea p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 98466977641504L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue()) != 0)) {
        ((com.moon.ea)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public net.minecraft.client.shader.Framebuffer a__pA() {
return this.K;
}


public void a(com.moon.d_ p0) {
((com.moon.module.impl.Camera)(this)).b(((com.moon.d_)(p0)));
    return;
}


public void a(com.moon.event.Render2DEvent p0) {
long local2 = (com.moon.module.impl.Camera.Q ^ 59024734782936L);
    if ((((com.moon.event.Render2DEvent)(p0)).getPhase() == com.moon.event.RenderPhase.POST)) {
        ((com.moon.module.impl.Camera)(this)).f__Void();
    }
    return;
}


public com.moon.setting.BooleanSetting k() {
return this.H;
}


public com.moon.setting.BooleanSetting g() {
return this.D;
}


public com.moon.setting.BooleanSetting j() {
return this.G;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_27(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_77(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_82(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_84(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_86(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_91(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_106(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_120(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_123(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_128(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_131(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_136(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_139(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_144(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_147(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_152(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_155(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_160(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_163(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_169(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_798025ff290f693a_originalDynamicSite148_171(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_eb8803ad1f63_originalDynamicSite263_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa1ab8975269_invokedynamic808_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa1ab8975269_invokedynamic808_29(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_aa1ab8975269_invokedynamic808_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2414_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_18(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_75(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_98(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_111(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_112(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_114(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_115(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_116(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_117(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_119(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_93a5090229a0_invokedynamic809_120(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2416_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_499f7b7391d8_originalDynamicSite517_3(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native net.minecraft.tileentity.TileEntity __sourceExactCall_0e09a83f07887b(com.moon.ef p0);
}
