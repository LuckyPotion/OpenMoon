package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Effects extends com.moon.module.Module {

private java.lang.Boolean s;

private net.minecraft.client.shader.Framebuffer t;

private net.minecraft.client.shader.Framebuffer u;

private net.minecraft.client.shader.Framebuffer[] v;

private com.moon.gV w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.BooleanSetting y;

private com.moon.setting.FloatSetting z;

private com.moon.setting.IntegerSetting A;

private com.moon.setting.IntegerSetting B;

private com.moon.setting.SettingGroup C;

private com.moon.gW D;

private com.moon.setting.BooleanSetting E;

private com.moon.setting.IntegerSetting F;

private com.moon.setting.IntegerSetting G;

private com.moon.setting.FloatSetting H;

private com.moon.setting.SettingGroup I;

private static long J;

private static java.lang.String[] K;

private static java.lang.String[] L;

private static java.util.Map M;

private static long[] N;

private static java.lang.Integer[] O;

private static java.util.Map P;

public Effects(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_40d04fb561fffa03(com.moon.module.impl.Effects receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2;

    net.minecraft.entity.Entity[] local7_life6;

    int local8_life13;

    init_join_370: {

    init_join_61: {

    local5_life2 = (com.moon.module.impl.Effects.J ^ 25164509605130L);

    net.minecraft.entity.Entity[] __sourceSpill153_4 = com.moon.bY.b();

    com.moon.module.impl.Effects.__sourceConstructorInit_40d04fb561fffa03_0(((com.moon.module.impl.Effects)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    local7_life6 = __sourceSpill153_4;

    ((com.moon.module.impl.Effects)(receiver)).s = ((java.lang.Boolean)(null));

    ((com.moon.module.impl.Effects)(receiver)).t = ((net.minecraft.client.shader.Framebuffer)(new net.minecraft.client.shader.Framebuffer(1, 1, false)));

    ((com.moon.module.impl.Effects)(receiver)).u = ((net.minecraft.client.shader.Framebuffer)(new net.minecraft.client.shader.Framebuffer(1, 1, false)));

    ((com.moon.module.impl.Effects)(receiver)).v = ((net.minecraft.client.shader.Framebuffer[])(new net.minecraft.client.shader.Framebuffer[__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_11(17972, (2964091333180674182L ^ local5_life2))]));

    local8_life13 = 0;

    init_cycle_41: while (true) {

    if (!((local8_life13 < (((com.moon.module.impl.Effects)(receiver)).v).length))) {

        break init_join_61;

    }

    (((com.moon.module.impl.Effects)(receiver)).v)[local8_life13] = new net.minecraft.client.shader.Framebuffer(1, 1, false);

    local8_life13 += 1;

    if (!((local7_life6 == null))) {

        break init_join_370;

    }

    if (!((local7_life6 != null))) { continue init_cycle_41; }

    break init_cycle_41;

    }

    }

    ((com.moon.module.impl.Effects)(receiver)).w = ((com.moon.gV)(new com.moon.gV(((com.moon.module.impl.Effects)(receiver)).t, ((com.moon.module.impl.Effects)(receiver)).v, 3, 3)));

    ((com.moon.module.impl.Effects)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_20(32132, (7797394880597669806L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_23(8863, (4410463879044688045L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Effects)(receiver)).y = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_28(1240, (5650329412151299823L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_31(3236, (5042214520602838676L ^ local5_life2)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_33()))))).a()));

    ((com.moon.module.impl.Effects)(receiver)).z = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_38(7445, (5104494992937735996L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_41(29652, (3655135460135287295L ^ local5_life2)))), ((float)(1061158912)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(1008981770))))).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_45()))))).a()));

    com.moon.module.impl.Effects __sourceSpill153_56 = receiver;

    com.moon.mf __sourceSpill153_57 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_50(2457, (2020048686425490356L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_53(16748, (811398625215515480L ^ local5_life2)))), ((int)(3)), ((int)(1)), ((int)(5)), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp153_58_0 = ((com.moon.module.impl.Effects)(receiver)).x;

    com.moon.setting.BooleanSetting __sourceSpill153_60 = __stackOp153_58_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp153_58_0)));

    ((com.moon.module.impl.Effects)(__sourceSpill153_56)).A = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(__sourceSpill153_57)).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_61(__sourceSpill153_60)))))).a(((com.moon.kR)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_63(receiver)))))).a()));

    com.moon.module.impl.Effects __sourceSpill153_76 = receiver;

    com.moon.mf __sourceSpill153_77 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_68(22754, (8448774541660787412L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_71(8423, (5232281916003314393L ^ local5_life2)))), ((int)(3)), ((int)(0)), ((int)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_73(18308, (4399468491748692276L ^ local5_life2)))), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp153_78_0 = ((com.moon.module.impl.Effects)(receiver)).x;

    com.moon.setting.BooleanSetting __sourceSpill153_80 = __stackOp153_78_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp153_78_0)));

    ((com.moon.module.impl.Effects)(__sourceSpill153_76)).B = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(__sourceSpill153_77)).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_81(__sourceSpill153_80)))))).a(((com.moon.kR)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_83(receiver)))))).a()));

    com.moon.module.impl.Effects __sourceSpill153_90 = receiver;

    com.moon.me __sourceSpill153_91 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill153_92 = __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_89(13138, (1513962627063413097L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp153_93_0 = new com.moon.setting.Setting[2];

    com.moon.setting.Setting[] __sourceSpill153_95 = __stackOp153_93_0;

    (__stackOp153_93_0)[0] = ((com.moon.module.impl.Effects)(receiver)).A;

    com.moon.setting.Setting[] __stackOp153_96_0 = __sourceSpill153_95;

    com.moon.setting.Setting[] __sourceSpill153_98 = __stackOp153_96_0;

    (__stackOp153_96_0)[1] = ((com.moon.module.impl.Effects)(receiver)).B;

    com.moon.me __sourceSpill153_101 = ((com.moon.me)(__sourceSpill153_91)).a(((java.lang.String)(__sourceSpill153_92)), ((com.moon.setting.Setting[])(__sourceSpill153_98)));

    com.moon.setting.BooleanSetting __stackOp153_102_0 = ((com.moon.module.impl.Effects)(receiver)).x;

    com.moon.setting.BooleanSetting __sourceSpill153_104 = __stackOp153_102_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp153_102_0)));

    ((com.moon.module.impl.Effects)(__sourceSpill153_90)).C = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill153_101)).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_105(__sourceSpill153_104)))))).a()));

    ((com.moon.module.impl.Effects)(receiver)).D = ((com.moon.gW)(new com.moon.gW(((com.moon.module.impl.Effects)(receiver)).u, ((com.moon.module.impl.Effects)(receiver)).v, 3, 4)));

    ((com.moon.module.impl.Effects)(receiver)).E = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_113(28064, (4862153152920397715L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_116(14432, (3725747773520704081L ^ local5_life2)))), ((boolean)(true))))).a()));

    com.moon.module.impl.Effects __sourceSpill153_127 = receiver;

    com.moon.mf __sourceSpill153_128 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_121(246, (1117403139969174217L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_124(5259, (5536112958955187L ^ local5_life2)))), ((int)(3)), ((int)(1)), ((int)(5)), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp153_129_0 = ((com.moon.module.impl.Effects)(receiver)).E;

    com.moon.setting.BooleanSetting __sourceSpill153_131 = __stackOp153_129_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp153_129_0)));

    ((com.moon.module.impl.Effects)(__sourceSpill153_127)).F = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(__sourceSpill153_128)).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_132(__sourceSpill153_131)))))).a(((com.moon.kR)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_134(receiver)))))).a()));

    com.moon.module.impl.Effects __sourceSpill153_147 = receiver;

    com.moon.mf __sourceSpill153_148 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_139(19519, (849031096921490947L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_142(31789, (3546678819095328276L ^ local5_life2)))), ((int)(4)), ((int)(0)), ((int)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_144(20256, (3107840055048198547L ^ local5_life2)))), ((int)(1)));

    com.moon.setting.BooleanSetting __stackOp153_149_0 = ((com.moon.module.impl.Effects)(receiver)).E;

    com.moon.setting.BooleanSetting __sourceSpill153_151 = __stackOp153_149_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp153_149_0)));

    ((com.moon.module.impl.Effects)(__sourceSpill153_147)).G = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(__sourceSpill153_148)).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_152(__sourceSpill153_151)))))).a(((com.moon.kR)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_154(receiver)))))).a()));

    com.moon.module.impl.Effects __sourceSpill153_167 = receiver;

    com.moon.md __sourceSpill153_168 = ((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_159(13742, (707149388380798875L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_162(24713, (6381824583598844596L ^ local5_life2)))), ((float)(0x1.0p0f)), ((float)(1036831949)), ((float)(0x1.0p0f)), ((float)(1028443341)));

    com.moon.setting.BooleanSetting __stackOp153_169_0 = ((com.moon.module.impl.Effects)(receiver)).E;

    com.moon.setting.BooleanSetting __sourceSpill153_171 = __stackOp153_169_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp153_169_0)));

    ((com.moon.module.impl.Effects)(__sourceSpill153_167)).H = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(((com.moon.md)(__sourceSpill153_168)).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_172(__sourceSpill153_171)))))).a(((com.moon.kR)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_174(receiver)))))).a()));

    com.moon.module.impl.Effects __sourceSpill153_181 = receiver;

    com.moon.me __sourceSpill153_182 = com.moon.setting.SettingGroup.a__me();

    java.lang.String __sourceSpill153_183 = __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_180(8058, (2669929049027597650L ^ local5_life2));

    com.moon.setting.Setting[] __stackOp153_184_0 = new com.moon.setting.Setting[3];

    com.moon.setting.Setting[] __sourceSpill153_186 = __stackOp153_184_0;

    (__stackOp153_184_0)[0] = ((com.moon.module.impl.Effects)(receiver)).F;

    com.moon.setting.Setting[] __stackOp153_187_0 = __sourceSpill153_186;

    com.moon.setting.Setting[] __sourceSpill153_189 = __stackOp153_187_0;

    (__stackOp153_187_0)[1] = ((com.moon.module.impl.Effects)(receiver)).G;

    com.moon.setting.Setting[] __stackOp153_190_0 = __sourceSpill153_189;

    com.moon.setting.Setting[] __sourceSpill153_192 = __stackOp153_190_0;

    (__stackOp153_190_0)[2] = ((com.moon.module.impl.Effects)(receiver)).H;

    com.moon.me __sourceSpill153_195 = ((com.moon.me)(__sourceSpill153_182)).a(((java.lang.String)(__sourceSpill153_183)), ((com.moon.setting.Setting[])(__sourceSpill153_192)));

    com.moon.setting.BooleanSetting __stackOp153_196_0 = ((com.moon.module.impl.Effects)(receiver)).E;

    com.moon.setting.BooleanSetting __sourceSpill153_198 = __stackOp153_196_0;

    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp153_196_0)));

    ((com.moon.module.impl.Effects)(__sourceSpill153_181)).I = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill153_195)).a(((java.util.function.Supplier)(__sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_199(__sourceSpill153_198)))))).a()));

    }

    return;

}



static {
J = ((long)(((moom._a)(moom._c.a(((long)(7575085290949364328L)), ((long)(-8076457379446825720L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(123781204926610L)))));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Effects.J ^ 136667512993572L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill271_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill271_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill271_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill271_14 = new byte[8];
    (__sourceSpill271_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill271_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation271_16 = __sourceSpill271_14;
    ((javax.crypto.Cipher)(__sourceSpill271_11)).init(((int)(__sourceSpill271_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill271_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation271_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[21];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "¹øÛFGIÇ\"_\026º£, çÚ\r½ý²\nð5©Ï¨LóV\rR5óLe\026z\001\002TJF ®©@u\033hþhN\000jIQ>^~X9aÖ\002R¨[\"u\022\007\n(*\002\002ì§U6syk©\035\tõ\027Á`½\022IFÑôúëLt\002®-©BfÛN5L\020a($\\wh\017i:°ÿ3¨<\016\030øº½¼¹Ý\036¨¹tN§\022AñFÅØ7KpÎ\"0\013Ýný_¯\025KD/û@2Í\000Å³àCcß!AË¤ö¡¤\013Ä)*ôw\007OQ\020Ã\020 \t\rÞMö#WvÛ\033d\t\031'=\020Õ¹¹ÍJûuBW\021%Ú\"pW lmÌNÅÅ*-\026Õ\tã.½Î~ÿ\035-\005\027[k\f´YHu.\020+¹\b}k|\003¨\013èfÒ+;\020\022\001À$\002[Os$3t\031zFç¹\0303>¹ª=;{\033\031Xq¨j«+\r¸(\030\\#ÊÞM¯d¡¨\032¾*\005©\036ËêÝùÊ Þ¦ØD:{²\036º'´Ò&\004ñÊÊ=XärÞËÍRz_\022\030z`4V'\177ÚUÔÈ;ÑºLO\025SlöÒÊ9ó(\"¡XÓäÊ¸Âôq'ø(xÇ|$\036\n  Ý\t\035â\f\000â\rÎ¾í6MN\003òVa Ö/v};1ª9O=riÖÌÂ8\017â%Ôê\037X ç0c\\MòHµÏ'×o\tqDà,ü\027X¢i©ýá¬\000\023"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill271_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill271_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill271_29)).doFinal(((byte[])(__sourceSpill271_28)));
        java.lang.String __sourceSpill271_34 = ((java.lang.String)(com.moon.module.impl.Effects.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill271_35 = local20_life19;
        int __sourceSpill271_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill271_35)[__sourceSpill271_36] = __sourceSpill271_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "7óqý\nMêÓIp.ø%:ê ð\"Gmh(ü:\024¹iT\033!G¾¾Ð`>I\032Y5m¼\rg"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill271_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill271_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill271_42)).doFinal(((byte[])(__sourceSpill271_41)));
        java.lang.String __sourceSpill271_47 = ((java.lang.String)(com.moon.module.impl.Effects.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill271_48 = local20_life19;
        int __sourceSpill271_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill271_48)[__sourceSpill271_49] = __sourceSpill271_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    K = ((java.lang.String[])(local20_life19));
    L = ((java.lang.String[])(new java.lang.String[21]));
    P = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill271_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill271_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill271_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill271_60 = new byte[8];
    (__sourceSpill271_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill271_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation271_62 = __sourceSpill271_60;
    ((javax.crypto.Cipher)(__sourceSpill271_57)).init(((int)(__sourceSpill271_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill271_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation271_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[7];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ãÕÛ\005eü\177ÒAJ#}\017±n£ï#ôa\\.\027\003âÂ@º\003lQ©F³"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill271_71 = local4_life67;
        int __sourceSpill271_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill271_71)).substring(((int)(__sourceSpill271_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill271_76 = local6_life65;
        int __sourceSpill271_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill271_79 = new byte[8];
        (__sourceSpill271_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill271_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill271_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill271_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill271_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill271_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill271_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill271_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill271_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill271_80)).doFinal(((byte[])(__sourceSpill271_79)));
        (__sourceSpill271_76)[__sourceSpill271_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "'É\033\fØs¼dFoK÷å\013_e"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill271_84 = local4_life67;
        int __sourceSpill271_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill271_84)).substring(((int)(__sourceSpill271_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill271_89 = local6_life65;
        int __sourceSpill271_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill271_92 = new byte[8];
        (__sourceSpill271_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill271_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill271_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill271_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill271_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill271_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill271_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill271_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill271_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill271_93)).doFinal(((byte[])(__sourceSpill271_92)));
        (__sourceSpill271_89)[__sourceSpill271_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    N = ((long[])(local6_life65));
    O = ((java.lang.Integer[])(new java.lang.Integer[7]));
}

private static native <E extends Throwable> void __sourceConstructorInit_40d04fb561fffa03_0(com.moon.module.impl.Effects a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public com.moon.setting.IntegerSetting b__k1() {
return this.B;
}


public net.minecraft.client.shader.Framebuffer b__pA() {
return this.u;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.x;
}


public com.moon.setting.FloatSetting b__kZ() {
return this.H;
}


public com.moon.setting.SettingGroup b() {
return this.I;
}


public com.moon.setting.BooleanSetting c__kV() {
return this.E;
}


public com.moon.setting.IntegerSetting c() {
return this.F;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Effects.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2463_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
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
        byte[] spill1085_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1085_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1085_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1085_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1085_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1085_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3484);
    if (((com.moon.module.impl.Effects.L)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Effects.M)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Effects.M)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lU", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Effects.K)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Effects.L)[life5_8] = com.moon.module.impl.Effects.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Effects.L)[life5_8];
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 20758;
      if (O[var3] == null) {
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
         long var5 = N[var3];
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
         Object[] var9 = (Object[])P.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               P.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lU", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         O[var3] = var15;
      }

      return O[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Effects.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2466_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lU"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.setting.IntegerSetting d() {
return this.G;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public net.minecraft.client.shader.Framebuffer[] a__ArraypA() {
return this.v;
}


public net.minecraft.client.shader.Framebuffer a__pA() {
return this.t;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.y;
}


public com.moon.gW a__gW() {
return this.D;
}


public void a(com.moon.event.TickEvent p0) {
long local2 = (com.moon.module.impl.Effects.J ^ 81200057668073L);
    if ((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE)) {
        ((com.moon.gW)(this.D)).c();
    }
    return;
}


public void a(com.moon.eP p0) {
com.moon.module.impl.Effects forwardValue829_15_0;
    com.moon.module.impl.Effects spill829_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_17: {
    forward_join_15: {
    life2_3 = (com.moon.module.impl.Effects.J ^ 16736414637950L);
    life4_5 = com.moon.bY.b();
    spill829_0 = this;
    if (!((life4_5 == null))) {
        forwardValue829_15_0 = spill829_0;
        break forward_join_15;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Effects)(spill829_0)).x)).getValue())))).booleanValue())) {
        break forward_join_17;
    }
    forwardValue829_15_0 = this;
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(forwardValue829_15_0)).w)).b__Void();
    }
    return;
}


public void a(com.moon.event.Render2DEvent p0) {
com.moon.module.impl.Effects forwardValue830_25_0;
    com.moon.module.impl.Effects forwardValue830_26_0;
    int forwardValue830_26_1;
    java.lang.Boolean forwardValue830_32_0;
    com.moon.module.impl.Effects forwardValue830_52_0;
    int forwardValue830_81_0;
    int forwardValue830_117_0;
    com.moon.events.EventBus forwardValue830_125_0;
    com.moon.module.impl.Effects forwardValue830_152_0;
    java.lang.Boolean spill830_0;
    com.moon.module.impl.Effects spill830_1;
    com.moon.module.impl.Effects spill830_2;
    com.moon.setting.BooleanSetting spill830_3;
    com.moon.setting.BooleanSetting spill830_4;
    int spill830_5;
    com.moon.events.EventBus spill830_6;
    int spill830_7;
    long spill830_8;
    com.moon.module.impl.Effects spill830_9;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.moon.ei life5_80;
    net.minecraft.client.gui.GuiScreen life8_83;
    com.moon.pj life6_94;
    com.moon.pk life7_112;
    forward_join_155: {
    forward_join_154: {
    forward_join_152: {
    forward_join_129: {
    forward_join_125: {
    forward_join_123: {
    forward_join_117: {
    forward_join_90: {
    forward_join_81: {
    forward_join_76: {
    forward_join_57: {
    forward_join_52: {
    forward_join_41: {
    forward_join_32: {
    forward_join_28: {
    forward_join_26: {
    forward_join_25: {
    life2_3 = (com.moon.module.impl.Effects.J ^ 111329056925571L);
    life4_5 = com.moon.bY.b();
    if (!((((com.moon.event.Render2DEvent)(p0)).getPhase() == com.moon.event.RenderPhase.PRE))) {
        break forward_join_155;
    }
    spill830_0 = this.s;
    if (!((life4_5 == null))) {
        forwardValue830_32_0 = spill830_0;
        break forward_join_32;
    }
    if (!((spill830_0 == null))) {
        break forward_join_28;
    }
    spill830_1 = this;
    if (!((java.lang.System.getProperty(((java.lang.String)(__sourceIntrinsic_cd0609abcd78_invokedynamic830_5(28449, (4309335366750400402L ^ life2_3))))) != null))) {
        forwardValue830_25_0 = spill830_1;
        break forward_join_25;
    }
    forwardValue830_26_0 = spill830_1;
    forwardValue830_26_1 = 1;
    break forward_join_26;
    }
    forwardValue830_26_0 = forwardValue830_25_0;
    forwardValue830_26_1 = 0;
    }
    ((com.moon.module.impl.Effects)(forwardValue830_26_0)).s = ((java.lang.Boolean)(java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue830_26_1))))));
    }
    spill830_2 = this;
    if (!((life4_5 == null))) {
        forwardValue830_52_0 = spill830_2;
        break forward_join_52;
    }
    forwardValue830_32_0 = ((com.moon.module.impl.Effects)(spill830_2)).s;
    }
    if (!((!((java.lang.Boolean)(forwardValue830_32_0)).booleanValue()))) {
        break forward_join_41;
    }
    ((com.moon.setting.BooleanSetting)(this.y)).setValue(((java.lang.Boolean.valueOf(((boolean)(false))))));
    if (!((life4_5 != null))) {
        break forward_join_57;
    }
    }
    spill830_3 = this.y;
    com.moon.setting.BooleanSetting __stackOp830_16_0 = this.x;
    spill830_4 = __stackOp830_16_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp830_16_0)));
    ((com.moon.setting.BooleanSetting)(spill830_3)).setAvailabilityPredicate(((java.util.function.Supplier)(__sourceIntrinsic_cd0609abcd78_invokedynamic830_18(spill830_4))));
    forwardValue830_52_0 = this;
    }
    ((com.moon.setting.FloatSetting)(((com.moon.module.impl.Effects)(forwardValue830_52_0)).z)).setAvailabilityPredicate(((java.util.function.Supplier)(__sourceIntrinsic_cd0609abcd78_invokedynamic830_21(this))));
    }
    life5_80 = new com.moon.ei();
    life8_83 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Effects.d)).P;
    spill830_5 = ((life8_83 instanceof com.moon.pj) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue830_81_0 = spill830_5;
        break forward_join_81;
    }
    if (!((spill830_5 != 0))) {
        break forward_join_76;
    }
    life6_94 = ((com.moon.pj)(life8_83));
    ((com.moon.pj)(life6_94)).j();
    if (!((life4_5 != null))) {
        break forward_join_90;
    }
    }
    life8_83 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Effects.d)).P;
    forwardValue830_81_0 = ((life8_83 instanceof com.moon.pk) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue830_117_0 = forwardValue830_81_0;
        break forward_join_117;
    }
    if (!((forwardValue830_81_0 != 0))) {
        break forward_join_90;
    }
    life7_112 = ((com.moon.pk)(life8_83));
    ((com.moon.pk)(life7_112)).a(((com.moon.ei)(life5_80)));
    }
    spill830_6 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus();
    if (!((life4_5 == null))) {
        forwardValue830_125_0 = spill830_6;
        break forward_join_125;
    }
    ((com.moon.events.EventBus)(spill830_6)).publish(((java.lang.Object)(life5_80)));
    spill830_7 = 7135;
    moom.kZ.f();
    spill830_8 = (944083815192086503L ^ life2_3);
    moom.kZ.l();
    moom.kZ.i();
    moom.kZ.a(((int)(__sourceIntrinsic_cd0609abcd78_invokedynamic830_39(spill830_7, spill830_8))), ((int)(__sourceIntrinsic_cd0609abcd78_invokedynamic830_40(30220, (6557657930905922098L ^ life2_3)))), ((int)(1)), ((int)(0)));
    forwardValue830_117_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue830_117_0 != 0))) {
        break forward_join_123;
    }
    ((com.moon.gV)(this.w)).a__Void();
    if (!((life4_5 != null))) {
        break forward_join_129;
    }
    }
    forwardValue830_125_0 = ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).getEventBus();
    }
    ((com.moon.events.EventBus)(forwardValue830_125_0)).publish(((java.lang.Object)(new com.moon.event.Render3DEvent())));
    }
    moom.kZ.a(((int)(__sourceIntrinsic_cd0609abcd78_invokedynamic830_52(29849, (4420309375760836773L ^ life2_3)))), ((int)(__sourceIntrinsic_cd0609abcd78_invokedynamic830_53(7933, (9215523461741593282L ^ life2_3)))), ((int)(1)), ((int)(0)));
    moom.kZ.i();
    spill830_9 = this;
    if (!((life4_5 == null))) {
        forwardValue830_152_0 = spill830_9;
        break forward_join_152;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Effects)(spill830_9)).E)).getValue())))).booleanValue())) {
        break forward_join_154;
    }
    forwardValue830_152_0 = this;
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(forwardValue830_152_0)).D)).a__Void();
    }
    moom.kZ.j();
    }
    return;
}


public java.lang.Boolean a__Boolean() {
return this.s;
}


public com.moon.setting.FloatSetting a__kZ() {
return this.z;
}


public com.moon.setting.IntegerSetting a__k1() {
return this.A;
}


public com.moon.gV a() {
return this.w;
}


public com.moon.setting.SettingGroup a__k0() {
return this.C;
}


private static java.lang.Boolean lambda$new$0() {
return java.lang.Boolean.valueOf(((boolean)(false)));
}


private static java.lang.Boolean lambda$new$1() {
return java.lang.Boolean.valueOf(((boolean)(false)));
}


private java.lang.Boolean lambda$receiveOverlayRender$7() {
int forwardValue831_19_0;
    int forwardValue831_23_0;
    int forwardValue831_25_0;
    boolean spill831_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_23: {
    forward_join_19: {
    life1_3 = (com.moon.module.impl.Effects.J ^ 71501012085863L);
    life3_5 = com.moon.bY.b();
    spill831_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue831_19_0 = ((spill831_0) ? 1 : 0);
        break forward_join_19;
    }
    if (!(spill831_0)) {
        break forward_join_24;
    }
    forwardValue831_19_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.y)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue831_23_0 = forwardValue831_19_0;
        break forward_join_23;
    }
    if (!((forwardValue831_19_0 != 0))) {
        break forward_join_24;
    }
    forwardValue831_23_0 = 1;
    }
    forwardValue831_25_0 = forwardValue831_23_0;
    break forward_join_25;
    }
    forwardValue831_25_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue831_25_0))));
}


private void lambda$new$3(java.lang.Integer p0, java.lang.Integer p1) {
((com.moon.gV)(this.w)).b(((int)(((java.lang.Integer)(p1)).intValue())));
    return;
}


private void lambda$new$2(java.lang.Integer p0, java.lang.Integer p1) {
((com.moon.gV)(this.w)).a(((int)(((java.lang.Integer)(p1)).intValue())));
    return;
}


private void lambda$new$4(java.lang.Integer p0, java.lang.Integer p1) {
((com.moon.gW)(this.D)).a(((int)(((java.lang.Integer)(p1)).intValue())));
    return;
}


private void lambda$new$6(java.lang.Float p0, java.lang.Float p1) {
((com.moon.gW)(this.D)).b(((float)(((java.lang.Float)(p1)).floatValue())));
    return;
}


private void lambda$new$5(java.lang.Integer p0, java.lang.Integer p1) {
((com.moon.gW)(this.D)).a(((float)(((float) ((java.lang.Integer)(p1)).intValue()))));
    return;
}


private static native <E extends Throwable> int __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_33() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_41(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_45() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_50(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_61(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_63(com.moon.module.impl.Effects a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_71(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_81(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_83(com.moon.module.impl.Effects a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_89(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_105(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_121(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_124(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_132(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_134(com.moon.module.impl.Effects a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_139(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_142(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_144(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_152(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_154(com.moon.module.impl.Effects a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_159(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_162(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_172(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_174(com.moon.module.impl.Effects a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_180(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_40d04fb561fffa03_originalDynamicSite153_199(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_cd0609abcd78_invokedynamic830_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cd0609abcd78_invokedynamic830_18(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_cd0609abcd78_invokedynamic830_21(com.moon.module.impl.Effects a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd0609abcd78_invokedynamic830_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd0609abcd78_invokedynamic830_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd0609abcd78_invokedynamic830_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_cd0609abcd78_invokedynamic830_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2463_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2466_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
