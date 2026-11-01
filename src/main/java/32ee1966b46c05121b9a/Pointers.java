package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Pointers extends com.moon.module.Module {

private com.moon.setting.MultiSelectSetting<com.moon.b6> s;

private com.moon.setting.FloatSetting t;

private com.moon.setting.FloatSetting u;

private com.moon.setting.BooleanSetting v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.ColorSetting x;

private com.moon.setting.FloatSetting y;

private com.moon.setting.SettingGroup z;

private com.moon.setting.BooleanSetting A;

private com.moon.setting.BooleanSetting B;

private com.moon.setting.BooleanSetting C;

private com.moon.setting.BooleanSetting D;

private com.moon.setting.SettingGroup E;

private com.moon.gX F;

private boolean G;

private com.moon.hW H;

private com.moon.hW I;

private com.moon.hW J;

private com.google.common.cache.Cache<net.minecraft.entity.EntityLivingBase, java.lang.Double> K;

private static long L;

private static java.lang.String[] M;

private static java.lang.String[] N;

private static java.util.Map O;

private static long[] P;

private static java.lang.Integer[] Q;

private static java.util.Map R;

private static long S;

public Pointers(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }

private static void __sourceConstructorBody_5610a7faacea4a20(com.moon.module.impl.Pointers receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {
long local5_life2 = (com.moon.module.impl.Pointers.L ^ 27587741030725L);
    com.moon.module.impl.Pointers.__sourceConstructorInit_5610a7faacea4a20_0(((com.moon.module.impl.Pointers)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));
    com.moon.module.impl.Pointers __sourceSpill158_10 = receiver;
    com.moon.mi __sourceSpill158_11 = com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_5(21445, (910889441407555546L ^ local5_life2)))), ((java.lang.Class)(com.moon.b6.class)));
    java.lang.String __sourceSpill158_12 = __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_9(27495, (7058135150933798753L ^ local5_life2));
    com.moon.b6[] __stackOp158_13_0 = new com.moon.b6[1];
    com.moon.b6[] __sourceSpill158_15 = __stackOp158_13_0;
    (__stackOp158_13_0)[0] = com.moon.b6.PLAYER;
    ((com.moon.module.impl.Pointers)(__sourceSpill158_10)).s = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(__sourceSpill158_11)).a(((java.lang.String)(__sourceSpill158_12)), ((java.lang.Enum[])(__sourceSpill158_15))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).t = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_20(13545, (8709450730952601833L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_23(26537, (7002538747864245162L ^ local5_life2)))), ((float)(0x1.4000000000000p+3F)), ((float)(0x1.4000000000000p+2F)), ((float)(0x1.9000000000000p+4F)), ((float)(0x1.99999a0000000p-4F))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).u = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_32(23764, (8221510775293040840L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_35(658, (3324754050534999680L ^ local5_life2)))), ((float)(0x1.6800000000000p+5F)), ((float)(0x1.4000000000000p+3F)), ((float)(0x1.9000000000000p+7F)), ((float)(0x1.0p0f))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_43(4757, (2111897305169860240L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_46(18854, (8455619376325217724L ^ local5_life2)))), ((boolean)(false))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_51(8159, (1336716688704478156L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_54(3790, (394980147811683039L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).x = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_59(7988, (2745082203006343981L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_62(10070, (583854505399296840L ^ local5_life2)))), ((int)(-1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_64(receiver)))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).y = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_69(28474, (9024600483169430319L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_72(25425, (471003709103761237L ^ local5_life2)))), ((float)(0x1.0000000000000p-1F)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.99999a0000000p-5F))))).a()));
    com.moon.module.impl.Pointers __sourceSpill158_83 = receiver;
    com.moon.me __sourceSpill158_84 = com.moon.setting.SettingGroup.a__me();
    java.lang.String __sourceSpill158_85 = __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_80(10751, (5528940409266449895L ^ local5_life2));
    com.moon.setting.Setting[] __stackOp158_86_0 = new com.moon.setting.Setting[__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_82(16192, (572312819686267445L ^ local5_life2))];
    com.moon.setting.Setting[] __sourceSpill158_88 = __stackOp158_86_0;
    (__stackOp158_86_0)[0] = ((com.moon.module.impl.Pointers)(receiver)).t;
    com.moon.setting.Setting[] __stackOp158_89_0 = __sourceSpill158_88;
    com.moon.setting.Setting[] __sourceSpill158_91 = __stackOp158_89_0;
    (__stackOp158_89_0)[1] = ((com.moon.module.impl.Pointers)(receiver)).u;
    com.moon.setting.Setting[] __stackOp158_92_0 = __sourceSpill158_91;
    com.moon.setting.Setting[] __sourceSpill158_94 = __stackOp158_92_0;
    (__stackOp158_92_0)[2] = ((com.moon.module.impl.Pointers)(receiver)).v;
    com.moon.setting.Setting[] __stackOp158_95_0 = __sourceSpill158_94;
    com.moon.setting.Setting[] __sourceSpill158_97 = __stackOp158_95_0;
    (__stackOp158_95_0)[3] = ((com.moon.module.impl.Pointers)(receiver)).w;
    com.moon.setting.Setting[] __stackOp158_98_0 = __sourceSpill158_97;
    com.moon.setting.Setting[] __sourceSpill158_100 = __stackOp158_98_0;
    (__stackOp158_98_0)[4] = ((com.moon.module.impl.Pointers)(receiver)).x;
    com.moon.setting.Setting[] __stackOp158_101_0 = __sourceSpill158_100;
    com.moon.setting.Setting[] __sourceSpill158_103 = __stackOp158_101_0;
    (__stackOp158_101_0)[5] = ((com.moon.module.impl.Pointers)(receiver)).y;
    ((com.moon.module.impl.Pointers)(__sourceSpill158_83)).z = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill158_84)).a(((java.lang.String)(__sourceSpill158_85)), ((com.moon.setting.Setting[])(__sourceSpill158_103))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).A = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_108(29187, (2803508204551239189L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_111(14986, (6296123382257696392L ^ local5_life2)))), ((boolean)(false))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).B = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_116(16527, (4832717489022125211L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_119(194, (3980775215825061059L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).C = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_124(10480, (3462451509167828215L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_127(12686, (8303585692533175710L ^ local5_life2)))), ((boolean)(true))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).D = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_132(16182, (1585770252050938657L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_135(27051, (1348568780135656886L ^ local5_life2)))), ((boolean)(true))))).a()));
    com.moon.module.impl.Pointers __sourceSpill158_142 = receiver;
    com.moon.me __sourceSpill158_143 = com.moon.setting.SettingGroup.a__me();
    java.lang.String __sourceSpill158_144 = __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_141(10037, (8962668670916567864L ^ local5_life2));
    com.moon.setting.Setting[] __stackOp158_145_0 = new com.moon.setting.Setting[4];
    com.moon.setting.Setting[] __sourceSpill158_147 = __stackOp158_145_0;
    (__stackOp158_145_0)[0] = ((com.moon.module.impl.Pointers)(receiver)).A;
    com.moon.setting.Setting[] __stackOp158_148_0 = __sourceSpill158_147;
    com.moon.setting.Setting[] __sourceSpill158_150 = __stackOp158_148_0;
    (__stackOp158_148_0)[1] = ((com.moon.module.impl.Pointers)(receiver)).B;
    com.moon.setting.Setting[] __stackOp158_151_0 = __sourceSpill158_150;
    com.moon.setting.Setting[] __sourceSpill158_153 = __stackOp158_151_0;
    (__stackOp158_151_0)[2] = ((com.moon.module.impl.Pointers)(receiver)).D;
    com.moon.setting.Setting[] __stackOp158_154_0 = __sourceSpill158_153;
    com.moon.setting.Setting[] __sourceSpill158_156 = __stackOp158_154_0;
    (__stackOp158_154_0)[3] = ((com.moon.module.impl.Pointers)(receiver)).C;
    ((com.moon.module.impl.Pointers)(__sourceSpill158_142)).E = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(__sourceSpill158_143)).a(((java.lang.String)(__sourceSpill158_144)), ((com.moon.setting.Setting[])(__sourceSpill158_156))))).a()));
    ((com.moon.module.impl.Pointers)(receiver)).F = ((com.moon.gX)(new com.moon.gX()));
    ((com.moon.module.impl.Pointers)(receiver)).G = ((boolean)(true));
    ((com.moon.module.impl.Pointers)(receiver)).K = ((com.google.common.cache.Cache)(((com.google.common.cache.CacheBuilder)(((com.google.common.cache.CacheBuilder)(com.google.common.cache.CacheBuilder.newBuilder())).expireAfterWrite(((java.time.Duration)(java.time.Duration.ofMinutes(((long)(com.moon.module.impl.Pointers.S)))))))).build()));
    ((java.lang.Thread)(new java.lang.Thread(__sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_168(receiver), __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_170(6883, (3720711728028524280L ^ local5_life2))))).start();
    return;
}


static {
L = ((long)(((moom._a)(moom._c.a(((long)(-3793809854536828858L)), ((long)(2990806616253106293L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(80078218204814L)))));
    O = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (com.moon.module.impl.Pointers.L ^ 14834163815626L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill283_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill283_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill283_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill283_14 = new byte[8];
    (__sourceSpill283_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill283_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation283_16 = __sourceSpill283_14;
    ((javax.crypto.Cipher)(__sourceSpill283_11)).init(((int)(__sourceSpill283_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill283_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation283_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[25];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "ëðe\t½\006Rw®uÒ'9\017\020¯s±÷?¥÷»WaTÁÜêÅ\020\nq¶½¦É\0215Ú¡éå$m\020÷ó©\034B¸Ö\033L\023\005#\"y(NÊäb\177qGá°(Å\006JD\004[è¿\031(ñ ¸½ú\024¦%áÌ,L}ð°.\030\021¹ÌBÃá|@ñt\033è\\é¤ÿ¦o­G(µ;WÕE\177Ñ«¸#ýÃÍ\177SÊöû5è'òR±k\036/C§æZËaúdKVÏ\020ß±WëÙ°Ç¯eÌ}\t¾±\020¥þ-\023î4\0254\032û6º¯R5\020ã¦\032·î\031{ªSç\026Ð|\020wá¶¨(\177_u3\023$áy%Å\020\037W\016\026ÁÌ¥iú»ò8ì0\020yyÄ\037_°KÏ\025\030SfÙ# ì\003SÃwHÆkéöü°Çí¾¬òöñ\f¤þ\177\017t\036¾q·8(Ê <\"Ù»\031ëÍ\f[¼÷Ügç:àÅLÎ~­Ó?s- R`\001¤é3G\020Ê9OXòwPô@Ð2bA6r\020\n¾_S·\036)Ç¤ÉãÓ·óå\020Rç\b`¯äIö+ÇXý±Íu\016 \n¥û\022à\036\004\023/Ú\007-QJÒ\032\026®2Ü\034ïÄ=êP\007âX\020ÅJ\"--k\031n>­\020øØ\020±ÌUÑä8AnífBgê}×\020\016fkw[)d,QNÊc°9\020\037nÊs\002pÑà-"))).length();
    int local21_life24 = 16;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill283_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill283_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill283_29)).doFinal(((byte[])(__sourceSpill283_28)));
        java.lang.String __sourceSpill283_34 = ((java.lang.String)(com.moon.module.impl.Pointers.c(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill283_35 = local25_life19;
        int __sourceSpill283_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill283_35)[__sourceSpill283_36] = __sourceSpill283_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    local24_life23 = ((java.lang.String)((local22_life21 = "ÄãÚýn9¨¢s\177Ö9ÔTú ÆÞúã$Qv\fÐW-1ì÷gã0\021\030v~Y¾Ïðùä\002À-;"))).length();
    local21_life24 = 16;
    local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill283_41 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill283_42 = local18_life9;
        byte[] local26_life44 = ((javax.crypto.Cipher)(__sourceSpill283_42)).doFinal(((byte[])(__sourceSpill283_41)));
        java.lang.String __sourceSpill283_47 = ((java.lang.String)(com.moon.module.impl.Pointers.c(((byte[])(local26_life44))))).intern();
        java.lang.String[] __sourceSpill283_48 = local25_life19;
        int __sourceSpill283_49 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill283_48)[__sourceSpill283_49] = __sourceSpill283_47;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    M = ((java.lang.String[])(local25_life19));
    N = ((java.lang.String[])(new java.lang.String[25]));
    R = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life55;
    javax.crypto.Cipher __sourceSpill283_57 = (local5_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill283_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill283_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill283_60 = new byte[8];
    (__sourceSpill283_60)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local6_life61 = 1;
    while ((local6_life61 < 8)) {
        (__sourceSpill283_60)[local6_life61] = ((byte) ((int) ((local16_life7 << (local6_life61 * 8)) >>> 56)));
        local6_life61 += 1;
    }
    byte[] __sourcePreallocation283_62 = __sourceSpill283_60;
    ((javax.crypto.Cipher)(__sourceSpill283_57)).init(((int)(__sourceSpill283_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill283_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation283_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life65 = new long[10];
    int local8_life66 = 0;
    java.lang.String local9_life67;
    int local10_life69 = ((java.lang.String)((local9_life67 = "Ø3è,þêÔB\003¨/>¤Â,+I[\003\037õ_\023ÑZóý]ÃÔG |¥ï\024$´\030\f\005Ü*»©ÌÑÌ:\007'"))).length();
    int local7_life70 = 0;
    do {
        java.lang.String __sourceSpill283_71 = local9_life67;
        int __sourceSpill283_72 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill283_71)).substring(((int)(__sourceSpill283_72)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill283_76 = local11_life65;
        int __sourceSpill283_77 = local8_life66;
        local8_life66 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill283_79 = new byte[8];
        (__sourceSpill283_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill283_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill283_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill283_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill283_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill283_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill283_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill283_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill283_80 = local5_life55;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill283_80)).doFinal(((byte[])(__sourceSpill283_79)));
        (__sourceSpill283_76)[__sourceSpill283_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    local10_life69 = ((java.lang.String)((local9_life67 = "Q}X\003XÄêÒù=B*ã"))).length();
    local7_life70 = 0;
    do {
        java.lang.String __sourceSpill283_84 = local9_life67;
        int __sourceSpill283_85 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill283_84)).substring(((int)(__sourceSpill283_85)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill283_89 = local11_life65;
        int __sourceSpill283_90 = local8_life66;
        local8_life66 += 1;
        long local13_life91 = (((((((((((long) (local12_life88)[0]) & 255L) << 56) | ((((long) (local12_life88)[1]) & 255L) << 48)) | ((((long) (local12_life88)[2]) & 255L) << 40)) | ((((long) (local12_life88)[3]) & 255L) << 32)) | ((((long) (local12_life88)[4]) & 255L) << 24)) | ((((long) (local12_life88)[5]) & 255L) << 16)) | ((((long) (local12_life88)[6]) & 255L) << 8)) | (((long) (local12_life88)[7]) & 255L));
        byte[] __sourceSpill283_92 = new byte[8];
        (__sourceSpill283_92)[0] = ((byte) ((int) (local13_life91 >>> 56)));
        (__sourceSpill283_92)[1] = ((byte) ((int) (local13_life91 >>> 48)));
        (__sourceSpill283_92)[2] = ((byte) ((int) (local13_life91 >>> 40)));
        (__sourceSpill283_92)[3] = ((byte) ((int) (local13_life91 >>> 32)));
        (__sourceSpill283_92)[4] = ((byte) ((int) (local13_life91 >>> 24)));
        (__sourceSpill283_92)[5] = ((byte) ((int) (local13_life91 >>> 16)));
        (__sourceSpill283_92)[6] = ((byte) ((int) (local13_life91 >>> 8)));
        (__sourceSpill283_92)[7] = ((byte) ((int) local13_life91));
        javax.crypto.Cipher __sourceSpill283_93 = local5_life55;
        byte[] local15_life95 = ((javax.crypto.Cipher)(__sourceSpill283_93)).doFinal(((byte[])(__sourceSpill283_92)));
        (__sourceSpill283_89)[__sourceSpill283_90] = (((((((((((long) (local15_life95)[0]) & 255L) << 56) | ((((long) (local15_life95)[1]) & 255L) << 48)) | ((((long) (local15_life95)[2]) & 255L) << 40)) | ((((long) (local15_life95)[3]) & 255L) << 32)) | ((((long) (local15_life95)[4]) & 255L) << 24)) | ((((long) (local15_life95)[5]) & 255L) << 16)) | ((((long) (local15_life95)[6]) & 255L) << 8)) | (((long) (local15_life95)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    P = ((long[])(local11_life65));
    Q = ((java.lang.Integer[])(new java.lang.Integer[10]));
    javax.crypto.Cipher local0_life99;
    javax.crypto.Cipher __sourceSpill283_101 = (local0_life99 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill283_102 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill283_103 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill283_104 = new byte[8];
    (__sourceSpill283_104)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life105 = 1;
    while ((local1_life105 < 8)) {
        (__sourceSpill283_104)[local1_life105] = ((byte) ((int) ((local16_life7 << (local1_life105 * 8)) >>> 56)));
        local1_life105 += 1;
    }
    byte[] __sourcePreallocation283_106 = __sourceSpill283_104;
    ((javax.crypto.Cipher)(__sourceSpill283_101)).init(((int)(__sourceSpill283_102)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill283_103)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation283_106)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life109 = 2707296257953871352L;
    byte[] __sourceSpill283_110 = new byte[8];
    (__sourceSpill283_110)[0] = ((byte) ((int) (local2_life109 >>> 56)));
    (__sourceSpill283_110)[1] = ((byte) ((int) (local2_life109 >>> 48)));
    (__sourceSpill283_110)[2] = ((byte) ((int) (local2_life109 >>> 40)));
    (__sourceSpill283_110)[3] = ((byte) ((int) (local2_life109 >>> 32)));
    (__sourceSpill283_110)[4] = ((byte) ((int) (local2_life109 >>> 24)));
    (__sourceSpill283_110)[5] = ((byte) ((int) (local2_life109 >>> 16)));
    (__sourceSpill283_110)[6] = ((byte) ((int) (local2_life109 >>> 8)));
    (__sourceSpill283_110)[7] = ((byte) ((int) local2_life109));
    javax.crypto.Cipher __sourceSpill283_111 = local0_life99;
    byte[] local4_life113 = ((javax.crypto.Cipher)(__sourceSpill283_111)).doFinal(((byte[])(__sourceSpill283_110)));
    S = ((long)((((((((((((long) (local4_life113)[0]) & 255L) << 56) | ((((long) (local4_life113)[1]) & 255L) << 48)) | ((((long) (local4_life113)[2]) & 255L) << 40)) | ((((long) (local4_life113)[3]) & 255L) << 32)) | ((((long) (local4_life113)[4]) & 255L) << 24)) | ((((long) (local4_life113)[5]) & 255L) << 16)) | ((((long) (local4_life113)[6]) & 255L) << 8)) | (((long) (local4_life113)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_5610a7faacea4a20_0(com.moon.module.impl.Pointers a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_3b932db52cc2fbe0a239(com.moon.module.impl.Pointers a0, com.moon.event.Render2DEvent a1) throws E;
private static final class __SourceHandler_3b932db52cc2fbe0a239 {

public static void f124(com.moon.module.impl.Pointers receiver, com.moon.event.Render2DEvent p0) throws Throwable {
    int forestValue124_33_0;
    int forestValue124_37_0;
    com.moon.module.impl.Pointers forestValue124_41_0;
    com.moon.hW forestValue124_51_0;
    com.moon.hW forestValue124_60_0;
    java.lang.Object forestValue124_70_0;
    net.minecraft.entity.Entity forestValue124_119_0;
    int forestValue124_129_0;
    com.moon.aO forestValue124_142_0;
    com.moon.aO forestValue124_142_1;
    com.moon.aO forestValue124_147_0;
    com.moon.aO forestValue124_147_1;
    int forestValue124_147_2;
    int forestValue124_734_0;
    int forestValue124_862_0;
    int forestValue124_896_0;
    int forestValue124_904_0;
    int forestValue124_949_0;
    com.moon.hW forestValue124_952_0;
    com.moon.hW forestValue124_962_0;
    com.moon.module.impl.Pointers forestValue124_967_0;
    com.moon.module.impl.Pointers spill124_0;
    int spill124_1;
    com.moon.hW spill124_2;
    net.minecraft.entity.Entity spill124_3;
    int spill124_4;
    boolean spill124_5;
    com.moon.aO spill124_6;
    com.moon.aO spill124_7;
    org.lwjgl.util.vector.Vector3f spill124_8;
    org.lwjgl.util.vector.Vector2f spill124_9;
    org.lwjgl.util.vector.Vector2f spill124_10;
    org.lwjgl.util.vector.Vector2f spill124_11;
    org.lwjgl.util.vector.Vector2f spill124_12;
    org.lwjgl.util.vector.Vector2f spill124_13;
    boolean spill124_14;
    com.moon.hW spill124_15;
    int spill124_16;
    com.moon.module.impl.Pointers spill124_17;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.moon.jm life5_14;
    float life6_84;
    java.util.Iterator life7_115;
    net.minecraft.entity.Entity life8_122;
    net.minecraft.entity.EntityLivingBase life9_134;
    int life10_172;
    double life11_182;
    double life13_192;
    double life15_202;
    double life17_214;
    double life19_226;
    double life21_238;
    org.lwjgl.util.vector.Vector3f life23_254;
    org.lwjgl.util.vector.Vector3f life23_258;
    org.lwjgl.util.vector.Vector3f life24_262;
    org.lwjgl.util.vector.Vector2f life25_270;
    org.lwjgl.util.vector.Vector2f life26_286;
    org.lwjgl.util.vector.Vector2f life27_302;
    org.lwjgl.util.vector.Vector2f life28_314;
    org.lwjgl.util.vector.Vector2f life29_328;
    float life30_343;
    double life31_349;
    float life33_358;
    float life34_361;
    org.lwjgl.util.vector.Vector2f life35_367;
    org.lwjgl.util.vector.Vector2f life36_373;
    org.lwjgl.util.vector.Vector2f life37_379;
    float life38_399;
    float life39_402;
    float life40_405;
    float life41_408;
    float life42_411;
    float life43_414;
    double life44_421;
    double life46_428;
    double life48_435;
    double life50_442;
    double life52_452;
    double life54_462;
    float life56_479;
    float life57_489;
    float life58_495;
    float life59_501;
    float life60_507;
    float life61_511;
    float life62_515;
    int life63_527;
    int life64_530;
    float life63_757;
    float life64_761;
    int life65_765;
    float life66_767;
    float life67_773;
    float life68_777;
    java.lang.String life63_928;
    forest_join_969: {
    forest_join_967: {
    forest_join_966: {
    forest_join_962: {
    forest_join_958: {
    forest_join_952: {
    forest_join_950: {
    forest_join_949: {
    forest_join_930: {
    forest_join_70: {
    forest_join_67: {
    forest_join_60: {
    forest_join_58: {
    forest_join_51: {
    forest_join_49: {
    forest_join_41: {
    forest_join_40: {
    forest_join_37: {
    forest_join_33: {
    life2_3 = (__fieldRead124_0() ^ 22949608999412L);
    life4_5 = __call124_1();
    if (!((__call124_2(p0) == __fieldRead124_3()))) {
        break forest_join_969;
    }
    life5_14 = __call124_7(__call124_5(__call124_4()), __fieldRead124_6());
    __call124_8();
    spill124_0 = receiver;
    if (!((life4_5 == null))) {
        forestValue124_41_0 = spill124_0;
        break forest_join_41;
    }
    if (!((!__fieldRead124_9(spill124_0)))) {
        break forest_join_40;
    }
    spill124_1 = __numericCompare124_13(((float) __fieldRead124_12(__fieldRead124_11(__fieldRead124_10()))), 0x1.04p8f);
    if (!((life4_5 == null))) {
        forestValue124_33_0 = spill124_1;
        break forest_join_33;
    }
    if (!((spill124_1 == 0))) {
        break forest_join_40;
    }
    forestValue124_33_0 = __integerCategory124_17(__fieldRead124_16(__fieldRead124_15(__fieldRead124_14())));
    }
    if (!((life4_5 == null))) {
        forestValue124_37_0 = forestValue124_33_0;
        break forest_join_37;
    }
    if (!((forestValue124_33_0 == 0))) {
        break forest_join_40;
    }
    forestValue124_37_0 = __call124_18();
    }
    if (!((forestValue124_37_0 < __call124_19(receiver)))) {
        break forest_join_930;
    }
    }
    forestValue124_41_0 = receiver;
    }
    spill124_2 = __fieldRead124_20(forestValue124_41_0);
    if (!((life4_5 == null))) {
        forestValue124_51_0 = spill124_2;
        break forest_join_51;
    }
    if (!((spill124_2 != null))) {
        break forest_join_49;
    }
    __call124_23(__call124_22(__fieldRead124_21(receiver)));
    }
    forestValue124_51_0 = __fieldRead124_24(receiver);
    }
    if (!((life4_5 == null))) {
        forestValue124_60_0 = forestValue124_51_0;
        break forest_join_60;
    }
    if (!((forestValue124_51_0 != null))) {
        break forest_join_58;
    }
    __call124_27(__call124_26(__fieldRead124_25(receiver)));
    }
    forestValue124_60_0 = __fieldRead124_28(receiver);
    }
    if (!((life4_5 == null))) {
        forestValue124_70_0 = forestValue124_60_0;
        break forest_join_70;
    }
    if (!((forestValue124_60_0 != null))) {
        break forest_join_67;
    }
    __call124_31(__call124_30(__fieldRead124_29(receiver)));
    }
    forestValue124_70_0 = __call124_33(__fieldRead124_32(receiver));
    }
    life6_84 = __call124_35(__cast124_34(forestValue124_70_0));
    __fieldWrite124_42(receiver, __call124_41(__call124_40(__call124_39(__call124_38(__call124_36(), __fieldRead124_37())))));
    __fieldWrite124_49(receiver, __call124_48(__call124_47(__call124_46(__call124_45(__call124_43(), __fieldRead124_44())))));
    __fieldWrite124_57(receiver, __call124_56(__call124_55(__call124_54(__call124_53(__call124_52(__call124_50(), __fieldRead124_51())), life5_14))));
    life7_115 = __call124_61(__fieldRead124_60(__fieldRead124_59(__fieldRead124_58())));
    forest_cycle_104: while (true) {
    forest_join_928: {
    forest_join_904: {
    forest_join_896: {
    forest_join_891: {
    forest_join_862: {
    forest_join_857: {
    forest_join_734: {
    forest_join_729: {
    forest_join_147: {
    forest_join_142: {
    forest_join_129: {
    forest_join_119: {
    if (!(__call124_62(life7_115))) {
        break forest_join_930;
    }
    life8_122 = __cast124_64(__call124_63(life7_115));
    spill124_3 = life8_122;
    if (!((life4_5 == null))) {
        forestValue124_119_0 = spill124_3;
        break forest_join_119;
    }
    spill124_4 = __instanceOf124_65(spill124_3);
    if (!((life4_5 == null))) {
        forestValue124_949_0 = spill124_4;
        break forest_join_949;
    }
    if (!((spill124_4 != 0))) {
        break forest_join_928;
    }
    forestValue124_119_0 = life8_122;
    }
    life9_134 = __cast124_66(forestValue124_119_0);
    spill124_5 = __call124_67(receiver, life8_122);
    if (!((life4_5 == null))) {
        forestValue124_129_0 = __integerCategory124_68(spill124_5);
        break forest_join_129;
    }
    if (!(spill124_5)) {
        break forest_join_928;
    }
    forestValue124_129_0 = __integerCategory124_70(__call124_69(life8_122));
    }
    if (!((forestValue124_129_0 == 0))) {
        break forest_join_928;
    }
    com.moon.aO __stackOp124_72_0 = __sourceUninitializedNEW124_71();
    spill124_6 = __stackOp124_72_0;
    spill124_7 = __stackOp124_72_0;
    if (!(__call124_76(__cast124_75(__call124_74(__fieldRead124_73(receiver)))))) {
        forestValue124_142_0 = spill124_6;
        forestValue124_142_1 = spill124_7;
        break forest_join_142;
    }
    forestValue124_147_0 = spill124_6;
    forestValue124_147_1 = spill124_7;
    forestValue124_147_2 = __call124_77(receiver, life9_134);
    break forest_join_147;
    }
    forestValue124_147_0 = forestValue124_142_0;
    forestValue124_147_1 = forestValue124_142_1;
    forestValue124_147_2 = __call124_81(__cast124_80(__call124_79(__fieldRead124_78(receiver))));
    }
    __explicitNewInit124_82(forestValue124_147_1, forestValue124_147_2);
    life10_172 = __call124_88(__call124_87(forestValue124_147_0, __call124_86(__cast124_85(__call124_84(__fieldRead124_83(receiver))))));
    life11_182 = __call124_94(__fieldRead124_89(life9_134), __fieldRead124_90(life9_134), ((double) __fieldRead124_93(__fieldRead124_92(__fieldRead124_91()))));
    life13_192 = __call124_100(__fieldRead124_95(life9_134), __fieldRead124_96(life9_134), ((double) __fieldRead124_99(__fieldRead124_98(__fieldRead124_97()))));
    life15_202 = __call124_106(__fieldRead124_101(life9_134), __fieldRead124_102(life9_134), ((double) __fieldRead124_105(__fieldRead124_104(__fieldRead124_103()))));
    life17_214 = __call124_116(__fieldRead124_109(__fieldRead124_108(__fieldRead124_107())), __fieldRead124_112(__fieldRead124_111(__fieldRead124_110())), ((double) __fieldRead124_115(__fieldRead124_114(__fieldRead124_113()))));
    life19_226 = __call124_126(__fieldRead124_119(__fieldRead124_118(__fieldRead124_117())), __fieldRead124_122(__fieldRead124_121(__fieldRead124_120())), ((double) __fieldRead124_125(__fieldRead124_124(__fieldRead124_123()))));
    life21_238 = __call124_136(__fieldRead124_129(__fieldRead124_128(__fieldRead124_127())), __fieldRead124_132(__fieldRead124_131(__fieldRead124_130())), ((double) __fieldRead124_135(__fieldRead124_134(__fieldRead124_133()))));
    org.lwjgl.util.vector.Vector3f __stackOp124_138_0 = __sourceUninitializedNEW124_137();
    spill124_8 = __stackOp124_138_0;
    __explicitNewInit124_139(__stackOp124_138_0, ((float) (life15_202 - life21_238)), ((float) (life11_182 - life17_214)), ((float) (life13_192 - life19_226)));
    life23_254 = spill124_8;
    life23_258 = __call124_140(receiver, life23_254);
    life24_262 = __call124_141(receiver, life23_258);
    org.lwjgl.util.vector.Vector2f __stackOp124_143_0 = __sourceUninitializedNEW124_142();
    spill124_9 = __stackOp124_143_0;
    __explicitNewInit124_146(__stackOp124_143_0, __fieldRead124_144(life24_262), __fieldRead124_145(life24_262));
    life25_270 = spill124_9;
    org.lwjgl.util.vector.Vector2f __stackOp124_148_0 = __sourceUninitializedNEW124_147();
    spill124_10 = __stackOp124_148_0;
    __explicitNewInit124_151(__stackOp124_148_0, (__fieldRead124_149(life24_262) + (life6_84 / 0x1.0p1f)), (__fieldRead124_150(life24_262) + (life6_84 / 0x1.0p1f)));
    life26_286 = spill124_10;
    org.lwjgl.util.vector.Vector2f __stackOp124_153_0 = __sourceUninitializedNEW124_152();
    spill124_11 = __stackOp124_153_0;
    __explicitNewInit124_156(__stackOp124_153_0, (__fieldRead124_154(life24_262) - (life6_84 / 0x1.0p1f)), (__fieldRead124_155(life24_262) + (life6_84 / 0x1.0p1f)));
    life27_302 = spill124_11;
    org.lwjgl.util.vector.Vector2f __stackOp124_158_0 = __sourceUninitializedNEW124_157();
    spill124_12 = __stackOp124_158_0;
    __explicitNewInit124_161(__stackOp124_158_0, __fieldRead124_159(life24_262), (__fieldRead124_160(life24_262) - (life6_84 / 0x1.0p1f)));
    life28_314 = spill124_12;
    org.lwjgl.util.vector.Vector2f __stackOp124_163_0 = __sourceUninitializedNEW124_162();
    spill124_13 = __stackOp124_163_0;
    __explicitNewInit124_168(__stackOp124_163_0, (__fieldRead124_164(life28_314) - __fieldRead124_165(life27_302)), (__fieldRead124_166(life28_314) - __fieldRead124_167(life27_302)));
    life29_328 = spill124_13;
    life30_343 = ((float) __call124_173(((double) ((__fieldRead124_169(life29_328) * __fieldRead124_170(life29_328)) + (__fieldRead124_171(life29_328) * __fieldRead124_172(life29_328))))));
    life31_349 = __call124_174(((double) (life6_84 / life30_343)));
    life33_358 = ((float) (((double) life30_343) / (0x1.0p1d * __call124_175(life31_349))));
    life34_361 = __fieldRead124_176(life24_262);
    life35_367 = __call124_177(receiver, life25_270, life28_314, life34_361);
    life36_373 = __call124_178(receiver, life25_270, life27_302, life34_361);
    life37_379 = __call124_179(receiver, life25_270, life26_286, life34_361);
    __call124_188(__fieldRead124_180(receiver), __call124_187(__fieldRead124_181(life35_367), __fieldRead124_182(life35_367), __fieldRead124_183(life36_373), __fieldRead124_184(life36_373), __fieldRead124_185(life37_379), __fieldRead124_186(life37_379), life10_172));
    life38_399 = __fieldRead124_189(life36_373);
    life39_402 = __fieldRead124_190(life36_373);
    life40_405 = __fieldRead124_191(life37_379);
    life41_408 = __fieldRead124_192(life37_379);
    life42_411 = __fieldRead124_193(life35_367);
    life43_414 = __fieldRead124_194(life35_367);
    life44_421 = ((double) ((life38_399 + life40_405) / 0x1.0p1f));
    life46_428 = ((double) ((life39_402 + life41_408) / 0x1.0p1f));
    life48_435 = ((double) ((life40_405 + life42_411) / 0x1.0p1f));
    life50_442 = ((double) ((life41_408 + life43_414) / 0x1.0p1f));
    life52_452 = ((double) ((-(life40_405 - life38_399)) / (life41_408 - life39_402)));
    life54_462 = ((double) ((-(life42_411 - life40_405)) / (life43_414 - life41_408)));
    life56_479 = ((float) ((((life50_442 - life46_428) - (life54_462 * life48_435)) + (life52_452 * life44_421)) / (life52_452 - life54_462)));
    life57_489 = ((float) (life46_428 + (life52_452 * (((double) life56_479) - life44_421))));
    life58_495 = ((life33_358 * 0x1.0p1f) + 0x1.0p2f);
    life59_501 = ((life56_479 - life33_358) - 0x1.0p1f);
    life60_507 = ((life57_489 - life33_358) - 0x1.0p1f);
    life61_511 = (life59_501 + life58_495);
    life62_515 = (life60_507 + life58_495);
    spill124_14 = __call124_198(__cast124_197(__call124_196(__fieldRead124_195(receiver))));
    if (!((life4_5 == null))) {
        forestValue124_734_0 = __integerCategory124_199(spill124_14);
        break forest_join_734;
    }
    if (!(spill124_14)) {
        break forest_join_729;
    }
    life63_527 = __call124_201(__fieldRead124_200());
    life64_530 = __call124_203(__fieldRead124_202());
    __call124_206(__fieldRead124_204(receiver), __call124_205(life59_501, life60_507, life58_495, 0x1.8p0f, life63_527));
    __call124_209(__fieldRead124_207(receiver), __call124_208(life59_501, life60_507, 0x1.8p0f, life58_495, life63_527));
    __call124_212(__fieldRead124_210(receiver), __call124_211((life61_511 - life58_495), life60_507, life58_495, 0x1.8p0f, life63_527));
    __call124_215(__fieldRead124_213(receiver), __call124_214((life61_511 - 0x1.8p0f), life60_507, 0x1.8p0f, life58_495, life63_527));
    __call124_218(__fieldRead124_216(receiver), __call124_217(life59_501, (life62_515 - 0x1.8p0f), life58_495, 0x1.8p0f, life63_527));
    __call124_221(__fieldRead124_219(receiver), __call124_220(life59_501, (life62_515 - life58_495), 0x1.8p0f, life58_495, life63_527));
    __call124_224(__fieldRead124_222(receiver), __call124_223((life61_511 - life58_495), (life62_515 - 0x1.8p0f), life58_495, 0x1.8p0f, life63_527));
    __call124_227(__fieldRead124_225(receiver), __call124_226((life61_511 - 0x1.8p0f), (life62_515 - life58_495), 0x1.8p0f, life58_495, life63_527));
    __call124_230(__fieldRead124_228(receiver), __call124_229((life59_501 + 0x1.0p-1f), (life60_507 + 0x1.0p-1f), (life58_495 - 0x1.0p0f), 0x1.0p-1f, life64_530));
    __call124_233(__fieldRead124_231(receiver), __call124_232((life59_501 + 0x1.0p-1f), (life60_507 + 0x1.0p-1f), 0x1.0p-1f, (life58_495 - 0x1.0p0f), life64_530));
    __call124_236(__fieldRead124_234(receiver), __call124_235(((life61_511 - life58_495) + 0x1.0p-1f), (life60_507 + 0x1.0p-1f), (life58_495 - 0x1.0p0f), 0x1.0p-1f, life64_530));
    __call124_239(__fieldRead124_237(receiver), __call124_238((life61_511 - 0x1.0p0f), (life60_507 + 0x1.0p-1f), 0x1.0p-1f, (life58_495 - 0x1.0p0f), life64_530));
    __call124_242(__fieldRead124_240(receiver), __call124_241((life59_501 + 0x1.0p-1f), (life62_515 - 0x1.0p0f), (life58_495 - 0x1.0p0f), 0x1.0p-1f, life64_530));
    __call124_245(__fieldRead124_243(receiver), __call124_244((life59_501 + 0x1.0p-1f), ((life62_515 - life58_495) + 0x1.0p-1f), 0x1.0p-1f, (life58_495 - 0x1.0p0f), life64_530));
    __call124_248(__fieldRead124_246(receiver), __call124_247(((life61_511 - life58_495) + 0x1.0p-1f), (life62_515 - 0x1.0p0f), (life58_495 - 0x1.0p0f), 0x1.0p-1f, life64_530));
    __call124_251(__fieldRead124_249(receiver), __call124_250((life61_511 - 0x1.0p0f), ((life62_515 - life58_495) + 0x1.0p-1f), 0x1.0p-1f, (life58_495 - 0x1.0p0f), life64_530));
    }
    forestValue124_734_0 = __integerCategory124_256(__call124_255(__cast124_254(__call124_253(__fieldRead124_252(receiver)))));
    }
    if (!((life4_5 == null))) {
        forestValue124_862_0 = forestValue124_734_0;
        break forest_join_862;
    }
    if (!((forestValue124_734_0 != 0))) {
        break forest_join_857;
    }
    life63_757 = 0x1.0p-1f;
    life64_761 = __call124_257(receiver, life9_134);
    life65_765 = __call124_258(receiver, life9_134);
    life66_767 = 0x1.0p1f;
    life67_773 = ((life59_501 - life66_767) - life63_757);
    life68_777 = (life64_761 * life58_495);
    __call124_262(__fieldRead124_259(receiver), __call124_261(life67_773, life60_507, 0x1.0p-1f, life58_495, __invokedynamic124_260(23978, (9049424721385777257L ^ life2_3))));
    __call124_266(__fieldRead124_263(receiver), __call124_265(life67_773, life60_507, life66_767, 0x1.0p-1f, __invokedynamic124_264(29879, (5872456747683692919L ^ life2_3))));
    __call124_270(__fieldRead124_267(receiver), __call124_269(((life67_773 + life66_767) - life63_757), life60_507, 0x1.0p-1f, life58_495, __invokedynamic124_268(29879, (5872456747683692919L ^ life2_3))));
    __call124_274(__fieldRead124_271(receiver), __call124_273(life67_773, ((life60_507 + life58_495) - life63_757), life66_767, 0x1.0p-1f, __invokedynamic124_272(29879, (5872456747683692919L ^ life2_3))));
    __call124_278(__fieldRead124_275(receiver), __call124_277(life67_773, life60_507, life66_767, life58_495, __invokedynamic124_276(29879, (5872456747683692919L ^ life2_3))));
    __call124_281(__fieldRead124_279(receiver), __call124_280((life67_773 + life63_757), ((life60_507 + life63_757) + (life58_495 - life68_777)), (life66_767 - (life63_757 * 0x1.0p1f)), (life68_777 - (life63_757 * 0x1.0p1f)), life65_765));
    }
    forestValue124_862_0 = __integerCategory124_286(__call124_285(__cast124_284(__call124_283(__fieldRead124_282(receiver)))));
    }
    if (!((life4_5 == null))) {
        forestValue124_896_0 = forestValue124_862_0;
        break forest_join_896;
    }
    if (!((forestValue124_862_0 != 0))) {
        break forest_join_891;
    }
    __call124_292(life5_14, __fieldRead124_287(receiver), __call124_288(life8_122), 0x1.8p2f, ((life59_501 + (life58_495 / 0x1.0p1f)) - (__call124_290(life5_14, __call124_289(life8_122), 0x1.8p2f) / 0x1.0p1f)), (life60_507 - __call124_291(life5_14, 0x1.8p2f)), -1);
    }
    forestValue124_896_0 = __integerCategory124_297(__call124_296(__cast124_295(__call124_294(__fieldRead124_293(receiver)))));
    }
    if (!((life4_5 == null))) {
        forestValue124_904_0 = forestValue124_896_0;
        break forest_join_904;
    }
    if (!((forestValue124_896_0 != 0))) {
        break forest_join_928;
    }
    forestValue124_904_0 = __call124_301(__call124_300(__fieldRead124_299(__fieldRead124_298()), life8_122));
    }
    life63_928 = __invokedynamic124_302(forestValue124_904_0);
    __call124_305(life5_14, __fieldRead124_303(receiver), life63_928, 0x1.8p2f, ((life59_501 + (life58_495 / 0x1.0p1f)) - (__call124_304(life5_14, life63_928, 0x1.8p2f) / 0x1.0p1f)), (life60_507 + life58_495), -1);
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_104;
    }
    break forest_cycle_104;
    }
    }
    spill124_15 = __fieldRead124_306(receiver);
    if (!((life4_5 == null))) {
        forestValue124_952_0 = spill124_15;
        break forest_join_952;
    }
    if (!((spill124_15 != null))) {
        break forest_join_950;
    }
    __call124_308(__invokedynamic124_307(16386, (4814555963204761028L ^ life2_3)));
    spill124_16 = 13142;
    __call124_310(__fieldRead124_309(receiver));
    forestValue124_949_0 = __invokedynamic124_311(spill124_16, (7533933862548244124L ^ life2_3));
    }
    __call124_312(forestValue124_949_0);
    }
    forestValue124_952_0 = __fieldRead124_313(receiver);
    }
    if (!((life4_5 == null))) {
        forestValue124_962_0 = forestValue124_952_0;
        break forest_join_962;
    }
    if (!((forestValue124_952_0 != null))) {
        break forest_join_958;
    }
    __call124_315(__fieldRead124_314(receiver));
    }
    spill124_17 = receiver;
    if (!((life4_5 == null))) {
        forestValue124_967_0 = spill124_17;
        break forest_join_967;
    }
    forestValue124_962_0 = __fieldRead124_316(spill124_17);
    }
    if (!((forestValue124_962_0 != null))) {
        break forest_join_966;
    }
    __call124_318(__fieldRead124_317(receiver));
    }
    forestValue124_967_0 = receiver;
    }
    __fieldWrite124_319(forestValue124_967_0, 0);
    }
    return;
}
private static native long __fieldRead124_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call124_1() throws Throwable;
private static native com.moon.event.RenderPhase __call124_2(com.moon.event.Render2DEvent a0) throws Throwable;
private static native com.moon.event.RenderPhase __fieldRead124_3() throws Throwable;
private static native com.moon.runtime.ClientContext __call124_4() throws Throwable;
private static native com.moon.jo __call124_5(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead124_6() throws Throwable;
private static native com.moon.jm __call124_7(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native void __call124_8() throws Throwable;
private static native boolean __fieldRead124_9(com.moon.module.impl.Pointers a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_10() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead124_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead124_12(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __numericCompare124_13(float a0, float a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_14() throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead124_15(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __fieldRead124_16(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __integerCategory124_17(boolean value) throws Throwable;
private static native int __call124_18() throws Throwable;
private static native int __call124_19(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hW __fieldRead124_20(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hW __fieldRead124_21(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hY __call124_22(com.moon.hW a0) throws Throwable;
private static native void __call124_23(com.moon.hY a0) throws Throwable;
private static native com.moon.hW __fieldRead124_24(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hW __fieldRead124_25(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hY __call124_26(com.moon.hW a0) throws Throwable;
private static native void __call124_27(com.moon.hY a0) throws Throwable;
private static native com.moon.hW __fieldRead124_28(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hW __fieldRead124_29(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hY __call124_30(com.moon.hW a0) throws Throwable;
private static native void __call124_31(com.moon.hY a0) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead124_32(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_33(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast124_34(java.lang.Object a0) throws Throwable;
private static native float __call124_35(java.lang.Float a0) throws Throwable;
private static native com.moon.hX __call124_36() throws Throwable;
private static native com.moon.cb __fieldRead124_37() throws Throwable;
private static native com.moon.hX __call124_38(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call124_39(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call124_40(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call124_41(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite124_42(com.moon.module.impl.Pointers a0, com.moon.hW a1) throws Throwable;
private static native com.moon.hX __call124_43() throws Throwable;
private static native com.moon.cb __fieldRead124_44() throws Throwable;
private static native com.moon.hX __call124_45(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call124_46(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call124_47(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call124_48(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite124_49(com.moon.module.impl.Pointers a0, com.moon.hW a1) throws Throwable;
private static native com.moon.hX __call124_50() throws Throwable;
private static native com.moon.cb __fieldRead124_51() throws Throwable;
private static native com.moon.hX __call124_52(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call124_53(com.moon.hX a0) throws Throwable;
private static native com.moon.hX __call124_54(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hX __call124_55(com.moon.hX a0) throws Throwable;
private static native com.moon.hW __call124_56(com.moon.hX a0) throws Throwable;
private static native void __fieldWrite124_57(com.moon.module.impl.Pointers a0, com.moon.hW a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_58() throws Throwable;
private static native net.minecraft.client.multiplayer.WorldClient __fieldRead124_59(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __fieldRead124_60(net.minecraft.client.multiplayer.WorldClient a0) throws Throwable;
private static native java.util.Iterator __call124_61(java.util.List a0) throws Throwable;
private static native boolean __call124_62(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call124_63(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast124_64(java.lang.Object a0) throws Throwable;
private static native int __instanceOf124_65(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.entity.EntityLivingBase __cast124_66(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call124_67(com.moon.module.impl.Pointers a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory124_68(boolean value) throws Throwable;
private static native boolean __call124_69(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __integerCategory124_70(boolean value) throws Throwable;
private static native com.moon.aO __sourceUninitializedNEW124_71() throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead124_73(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_74(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast124_75(java.lang.Object a0) throws Throwable;
private static native boolean __call124_76(java.lang.Boolean a0) throws Throwable;
private static native int __call124_77(com.moon.module.impl.Pointers a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native com.moon.setting.ColorSetting __fieldRead124_78(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_79(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast124_80(java.lang.Object a0) throws Throwable;
private static native int __call124_81(java.lang.Integer a0) throws Throwable;
private static native void __explicitNewInit124_82(com.moon.aO a0, int a1) throws Throwable;
private static native com.moon.setting.FloatSetting __fieldRead124_83(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_84(com.moon.setting.FloatSetting a0) throws Throwable;
private static native java.lang.Float __cast124_85(java.lang.Object a0) throws Throwable;
private static native float __call124_86(java.lang.Float a0) throws Throwable;
private static native com.moon.aO __call124_87(com.moon.aO a0, float a1) throws Throwable;
private static native int __call124_88(com.moon.aO a0) throws Throwable;
private static native double __fieldRead124_89(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native double __fieldRead124_90(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_91() throws Throwable;
private static native moom.DM __fieldRead124_92(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead124_93(moom.DM a0) throws Throwable;
private static native double __call124_94(double a0, double a1, double a2) throws Throwable;
private static native double __fieldRead124_95(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native double __fieldRead124_96(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_97() throws Throwable;
private static native moom.DM __fieldRead124_98(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead124_99(moom.DM a0) throws Throwable;
private static native double __call124_100(double a0, double a1, double a2) throws Throwable;
private static native double __fieldRead124_101(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native double __fieldRead124_102(net.minecraft.entity.EntityLivingBase a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_103() throws Throwable;
private static native moom.DM __fieldRead124_104(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead124_105(moom.DM a0) throws Throwable;
private static native double __call124_106(double a0, double a1, double a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_107() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead124_108(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead124_109(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_110() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead124_111(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead124_112(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_113() throws Throwable;
private static native moom.DM __fieldRead124_114(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead124_115(moom.DM a0) throws Throwable;
private static native double __call124_116(double a0, double a1, double a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_117() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead124_118(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead124_119(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_120() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead124_121(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead124_122(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_123() throws Throwable;
private static native moom.DM __fieldRead124_124(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead124_125(moom.DM a0) throws Throwable;
private static native double __call124_126(double a0, double a1, double a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_127() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead124_128(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead124_129(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_130() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead124_131(net.minecraft.client.Minecraft a0) throws Throwable;
private static native double __fieldRead124_132(net.minecraft.client.entity.EntityPlayerSP a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_133() throws Throwable;
private static native moom.DM __fieldRead124_134(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __fieldRead124_135(moom.DM a0) throws Throwable;
private static native double __call124_136(double a0, double a1, double a2) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __sourceUninitializedNEW124_137() throws Throwable;
private static native void __explicitNewInit124_139(org.lwjgl.util.vector.Vector3f a0, float a1, float a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __call124_140(com.moon.module.impl.Pointers a0, org.lwjgl.util.vector.Vector3f a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector3f __call124_141(com.moon.module.impl.Pointers a0, org.lwjgl.util.vector.Vector3f a1) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __sourceUninitializedNEW124_142() throws Throwable;
private static native float __fieldRead124_144(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native float __fieldRead124_145(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native void __explicitNewInit124_146(org.lwjgl.util.vector.Vector2f a0, float a1, float a2) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __sourceUninitializedNEW124_147() throws Throwable;
private static native float __fieldRead124_149(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native float __fieldRead124_150(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native void __explicitNewInit124_151(org.lwjgl.util.vector.Vector2f a0, float a1, float a2) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __sourceUninitializedNEW124_152() throws Throwable;
private static native float __fieldRead124_154(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native float __fieldRead124_155(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native void __explicitNewInit124_156(org.lwjgl.util.vector.Vector2f a0, float a1, float a2) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __sourceUninitializedNEW124_157() throws Throwable;
private static native float __fieldRead124_159(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native float __fieldRead124_160(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native void __explicitNewInit124_161(org.lwjgl.util.vector.Vector2f a0, float a1, float a2) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __sourceUninitializedNEW124_162() throws Throwable;
private static native float __fieldRead124_164(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_165(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_166(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_167(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native void __explicitNewInit124_168(org.lwjgl.util.vector.Vector2f a0, float a1, float a2) throws Throwable;
private static native float __fieldRead124_169(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_170(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_171(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_172(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native double __call124_173(double a0) throws Throwable;
private static native double __call124_174(double a0) throws Throwable;
private static native double __call124_175(double a0) throws Throwable;
private static native float __fieldRead124_176(org.lwjgl.util.vector.Vector3f a0) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __call124_177(com.moon.module.impl.Pointers a0, org.lwjgl.util.vector.Vector2f a1, org.lwjgl.util.vector.Vector2f a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __call124_178(com.moon.module.impl.Pointers a0, org.lwjgl.util.vector.Vector2f a1, org.lwjgl.util.vector.Vector2f a2, float a3) throws Throwable;
private static native org.lwjgl.util.vector.Vector2f __call124_179(com.moon.module.impl.Pointers a0, org.lwjgl.util.vector.Vector2f a1, org.lwjgl.util.vector.Vector2f a2, float a3) throws Throwable;
private static native com.moon.hW __fieldRead124_180(com.moon.module.impl.Pointers a0) throws Throwable;
private static native float __fieldRead124_181(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_182(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_183(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_184(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_185(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_186(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native com.moon.i8 __call124_187(float a0, float a1, float a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call124_188(com.moon.hW a0, com.moon.i8 a1) throws Throwable;
private static native float __fieldRead124_189(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_190(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_191(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_192(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_193(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native float __fieldRead124_194(org.lwjgl.util.vector.Vector2f a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead124_195(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_196(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast124_197(java.lang.Object a0) throws Throwable;
private static native boolean __call124_198(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory124_199(boolean value) throws Throwable;
private static native java.awt.Color __fieldRead124_200() throws Throwable;
private static native int __call124_201(java.awt.Color a0) throws Throwable;
private static native java.awt.Color __fieldRead124_202() throws Throwable;
private static native int __call124_203(java.awt.Color a0) throws Throwable;
private static native com.moon.hW __fieldRead124_204(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_205(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_206(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_207(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_208(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_209(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_210(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_211(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_212(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_213(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_214(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_215(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_216(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_217(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_218(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_219(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_220(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_221(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_222(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_223(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_224(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_225(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_226(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_227(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_228(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_229(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_230(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_231(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_232(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_233(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_234(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_235(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_236(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_237(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_238(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_239(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_240(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_241(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_242(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_243(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_244(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_245(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_246(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_247(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_248(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_249(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_250(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_251(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead124_252(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_253(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast124_254(java.lang.Object a0) throws Throwable;
private static native boolean __call124_255(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory124_256(boolean value) throws Throwable;
private static native float __call124_257(com.moon.module.impl.Pointers a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native int __call124_258(com.moon.module.impl.Pointers a0, net.minecraft.entity.EntityLivingBase a1) throws Throwable;
private static native com.moon.hW __fieldRead124_259(com.moon.module.impl.Pointers a0) throws Throwable;
private static native int __invokedynamic124_260(int a0, long a1) throws Throwable;
private static native com.moon.i2 __call124_261(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_262(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_263(com.moon.module.impl.Pointers a0) throws Throwable;
private static native int __invokedynamic124_264(int a0, long a1) throws Throwable;
private static native com.moon.i2 __call124_265(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_266(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_267(com.moon.module.impl.Pointers a0) throws Throwable;
private static native int __invokedynamic124_268(int a0, long a1) throws Throwable;
private static native com.moon.i2 __call124_269(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_270(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_271(com.moon.module.impl.Pointers a0) throws Throwable;
private static native int __invokedynamic124_272(int a0, long a1) throws Throwable;
private static native com.moon.i2 __call124_273(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_274(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_275(com.moon.module.impl.Pointers a0) throws Throwable;
private static native int __invokedynamic124_276(int a0, long a1) throws Throwable;
private static native com.moon.i2 __call124_277(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_278(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.hW __fieldRead124_279(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.i2 __call124_280(float a0, float a1, float a2, float a3, int a4) throws Throwable;
private static native void __call124_281(com.moon.hW a0, com.moon.i2 a1) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead124_282(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_283(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast124_284(java.lang.Object a0) throws Throwable;
private static native boolean __call124_285(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory124_286(boolean value) throws Throwable;
private static native com.moon.hW __fieldRead124_287(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.String __call124_288(net.minecraft.entity.Entity a0) throws Throwable;
private static native java.lang.String __call124_289(net.minecraft.entity.Entity a0) throws Throwable;
private static native float __call124_290(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native float __call124_291(com.moon.jm a0, float a1) throws Throwable;
private static native void __call124_292(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native com.moon.setting.BooleanSetting __fieldRead124_293(com.moon.module.impl.Pointers a0) throws Throwable;
private static native java.lang.Object __call124_294(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast124_295(java.lang.Object a0) throws Throwable;
private static native boolean __call124_296(java.lang.Boolean a0) throws Throwable;
private static native int __integerCategory124_297(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead124_298() throws Throwable;
private static native net.minecraft.client.entity.EntityPlayerSP __fieldRead124_299(net.minecraft.client.Minecraft a0) throws Throwable;
private static native float __call124_300(net.minecraft.client.entity.EntityPlayerSP a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __call124_301(float a0) throws Throwable;
private static native java.lang.String __invokedynamic124_302(int a0) throws Throwable;
private static native com.moon.hW __fieldRead124_303(com.moon.module.impl.Pointers a0) throws Throwable;
private static native float __call124_304(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native void __call124_305(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native com.moon.hW __fieldRead124_306(com.moon.module.impl.Pointers a0) throws Throwable;
private static native int __invokedynamic124_307(int a0, long a1) throws Throwable;
private static native void __call124_308(int a0) throws Throwable;
private static native com.moon.hW __fieldRead124_309(com.moon.module.impl.Pointers a0) throws Throwable;
private static native void __call124_310(com.moon.hW a0) throws Throwable;
private static native int __invokedynamic124_311(int a0, long a1) throws Throwable;
private static native void __call124_312(int a0) throws Throwable;
private static native com.moon.hW __fieldRead124_313(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hW __fieldRead124_314(com.moon.module.impl.Pointers a0) throws Throwable;
private static native void __call124_315(com.moon.hW a0) throws Throwable;
private static native com.moon.hW __fieldRead124_316(com.moon.module.impl.Pointers a0) throws Throwable;
private static native com.moon.hW __fieldRead124_317(com.moon.module.impl.Pointers a0) throws Throwable;
private static native void __call124_318(com.moon.hW a0) throws Throwable;
private static native void __fieldWrite124_319(com.moon.module.impl.Pointers a0, int a1) throws Throwable;

}


private int b__Int(net.minecraft.entity.EntityLivingBase p0) {
long local2 = (com.moon.module.impl.Pointers.L ^ 16789319046117L);
    float local4 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).K)).a__Float(((net.minecraft.entity.Entity)(p0)));
    float local5 = 0x1.4p5f;
    float local6 = java.lang.Math.max(((float)(0x0.0p0f)), ((float)((java.lang.Math.min(((float)(local4)), ((float)(local5))) / local5))));
    java.awt.Color local7 = new java.awt.Color((java.awt.Color.HSBtoRGB(((float)((local6 / 0x1.8p1f))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f))) | __sourceIntrinsic_086ba0952f01_originalDynamicSite522_7(26074, (230721813137377801L ^ local2))));
    return ((java.awt.Color)(local7)).getRGB();
}


private org.lwjgl.util.vector.Vector3f b(org.lwjgl.util.vector.Vector3f p0) {
float local2_life2 = ((float) java.lang.Math.toRadians(((double)(((double) ((org.lwjgl.util.vector.Vector3f)(p0)).getX())))));
    float local3_life5 = ((float) java.lang.Math.toRadians(((double)(((double) ((org.lwjgl.util.vector.Vector3f)(p0)).getY())))));
    float local4_life7 = ((float) java.lang.Math.cos(((double)(((double) local2_life2)))));
    float local5_life9 = ((float) java.lang.Math.sin(((double)(((double) local2_life2)))));
    float local6_life11 = ((float) java.lang.Math.cos(((double)(((double) local3_life5)))));
    float local7_life13 = ((float) java.lang.Math.sin(((double)(((double) local3_life5)))));
    return new org.lwjgl.util.vector.Vector3f((local4_life7 * local6_life11), (local4_life7 * local7_life13), (-local5_life9));
}


private float b(net.minecraft.entity.EntityLivingBase p0) {
double local2 = (com.moon.nR.a(((double)(((net.minecraft.entity.EntityLivingBase)(p0)).n)), ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).M)), ((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).l)).b)))) - com.moon.nR.a(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).K)).n)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).K)).M)), ((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).l)).b)))));
    double local4 = (com.moon.nR.a(((double)(((net.minecraft.entity.EntityLivingBase)(p0)).p)), ((double)(((net.minecraft.entity.EntityLivingBase)(p0)).O)), ((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).l)).b)))) - com.moon.nR.a(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).K)).p)), ((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).K)).O)), ((double)(((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).l)).b)))));
    return ((float) (-((java.lang.Math.atan2(((double)(local2)), ((double)(local4))) * 0x1.68p7d) / 0x1.921fb54442d18p1d)));
}


private int b() {
long local1_life2 = (com.moon.module.impl.Pointers.L ^ 1161533207493L);
    return java.lang.Math.min(((int)(java.lang.Math.max(((int)((net.minecraft.client.Minecraft.b() / 3))), ((int)(((org.lwjgl.opengl.DisplayMode)(org.lwjgl.opengl.Display.getDesktopDisplayMode())).getFrequency()))))), ((int)(__sourceIntrinsic_e1958f95391c_originalDynamicSite161_8(1810, (9164173009071196392L ^ local1_life2)))));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2593_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Pointers.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12980);
    if (((com.moon.module.impl.Pointers.N)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Pointers.O)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Pointers.O)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/l1", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Pointers.M)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Pointers.N)[life5_8] = __sourceExactCall_91987ae49548de(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Pointers.N)[life5_8];
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
        byte[] spill902_0 = p0;
        life4_9 += 1;
        life5_44 = (spill902_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill902_1 = p0;
        life4_9 += 1;
        life5_76 = (spill902_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill902_2 = p0;
        life4_9 += 1;
        life5_91 = (spill902_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private org.lwjgl.util.vector.Vector3f c(org.lwjgl.util.vector.Vector3f p0) {
float local2_life1 = ((com.moon.module.impl.Pointers)(this)).a(((org.lwjgl.util.vector.Vector3f)(p0)));
    return new org.lwjgl.util.vector.Vector3f((((org.lwjgl.util.vector.Vector3f)(p0)).x / local2_life1), (((org.lwjgl.util.vector.Vector3f)(p0)).y / local2_life1), (((org.lwjgl.util.vector.Vector3f)(p0)).z / local2_life1));
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2596_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21458;
      if (Q[var3] == null) {
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
         long var5 = P[var3];
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
         Object[] var9 = (Object[])R.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               R.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/l1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         Q[var3] = var15;
      }

      return Q[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Pointers.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public boolean a(net.minecraft.entity.Entity p0) {
net.minecraft.entity.Entity forwardValue899_15_0;
    int forwardValue899_35_0;
    int forwardValue899_38_0;
    int forwardValue899_52_0;
    int forwardValue899_66_0;
    int forwardValue899_83_0;
    int forwardValue899_90_0;
    int forwardValue899_97_0;
    int forwardValue899_101_0;
    int forwardValue899_103_0;
    net.minecraft.entity.Entity spill899_0;
    int spill899_1;
    int spill899_2;
    boolean spill899_3;
    boolean spill899_4;
    int spill899_5;
    int spill899_6;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_103: {
    forward_join_102: {
    forward_join_101: {
    forward_join_97: {
    forward_join_90: {
    forward_join_88: {
    forward_join_83: {
    forward_join_79: {
    forward_join_66: {
    forward_join_64: {
    forward_join_52: {
    forward_join_50: {
    forward_join_38: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (com.moon.module.impl.Pointers.L ^ 54749452579717L);
    life4_5 = com.moon.bY.b();
    spill899_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue899_15_0 = spill899_0;
        break forward_join_15;
    }
    if (!((spill899_0 == ((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).K))) {
        break forward_join_14;
    }
    return ((0) != 0);
    }
    forwardValue899_15_0 = p0;
    }
    spill899_1 = ((net.minecraft.entity.Entity)(forwardValue899_15_0)).e__Int();
    if (!((life4_5 == null))) {
        forwardValue899_35_0 = spill899_1;
        break forward_join_35;
    }
    if (!((spill899_1 != __sourceIntrinsic_376c3b2efa03_invokedynamic899_6(16871, (3943702411535715927L ^ life2_3))))) {
        break forward_join_34;
    }
    spill899_2 = ((net.minecraft.entity.Entity)(p0)).e__Int();
    if (!((life4_5 == null))) {
        forwardValue899_38_0 = spill899_2;
        break forward_join_38;
    }
    if (!((spill899_2 == __sourceIntrinsic_376c3b2efa03_invokedynamic899_8(5183, (6382628318914927499L ^ life2_3))))) {
        break forward_join_36;
    }
    }
    forwardValue899_35_0 = 0;
    }
    return ((forwardValue899_35_0) != 0);
    }
    forwardValue899_38_0 = ((((net.minecraft.entity.Entity)(p0)).v__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue899_52_0 = forwardValue899_38_0;
        break forward_join_52;
    }
    if (!((forwardValue899_38_0 != 0))) {
        break forward_join_50;
    }
    spill899_3 = ((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b6.INVISIBLE)));
    if (!((life4_5 == null))) {
        forwardValue899_52_0 = ((spill899_3) ? 1 : 0);
        break forward_join_52;
    }
    if (!((!spill899_3))) {
        break forward_join_50;
    }
    return ((0) != 0);
    }
    forwardValue899_52_0 = ((p0 instanceof moom.sZ) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue899_66_0 = forwardValue899_52_0;
        break forward_join_66;
    }
    if (!((forwardValue899_52_0 != 0))) {
        break forward_join_64;
    }
    spill899_4 = ((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b6.MOB)));
    if (!((life4_5 == null))) {
        forwardValue899_66_0 = ((spill899_4) ? 1 : 0);
        break forward_join_66;
    }
    if (!(spill899_4)) {
        break forward_join_64;
    }
    return ((1) != 0);
    }
    forwardValue899_66_0 = ((p0 instanceof moom.sK) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue899_83_0 = forwardValue899_66_0;
        break forward_join_83;
    }
    if (!((forwardValue899_66_0 == 0))) {
        break forward_join_79;
    }
    spill899_5 = ((p0 instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue899_83_0 = spill899_5;
        break forward_join_83;
    }
    if (!((spill899_5 == 0))) {
        break forward_join_79;
    }
    spill899_6 = ((p0 instanceof moom.tl) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue899_90_0 = spill899_6;
        break forward_join_90;
    }
    if (!((spill899_6 != 0))) {
        break forward_join_88;
    }
    }
    forwardValue899_83_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b6.ANIMAL)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue899_90_0 = forwardValue899_83_0;
        break forward_join_90;
    }
    if (!((forwardValue899_83_0 != 0))) {
        break forward_join_88;
    }
    return ((1) != 0);
    }
    forwardValue899_90_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue899_97_0 = forwardValue899_90_0;
        break forward_join_97;
    }
    if (!((forwardValue899_90_0 != 0))) {
        break forward_join_102;
    }
    forwardValue899_97_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b6.PLAYER)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue899_101_0 = forwardValue899_97_0;
        break forward_join_101;
    }
    if (!((forwardValue899_97_0 != 0))) {
        break forward_join_102;
    }
    forwardValue899_101_0 = 1;
    }
    forwardValue899_103_0 = forwardValue899_101_0;
    break forward_join_103;
    }
    forwardValue899_103_0 = 0;
    }
    return ((forwardValue899_103_0) != 0);
}


private float a(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1) {
return (((((org.lwjgl.util.vector.Vector3f)(p0)).x * ((org.lwjgl.util.vector.Vector3f)(p1)).x) + (((org.lwjgl.util.vector.Vector3f)(p0)).y * ((org.lwjgl.util.vector.Vector3f)(p1)).y)) + (((org.lwjgl.util.vector.Vector3f)(p0)).z * ((org.lwjgl.util.vector.Vector3f)(p1)).z));
}


private org.lwjgl.util.vector.Vector3f a__Vector3f(org.lwjgl.util.vector.Vector3f p0, org.lwjgl.util.vector.Vector3f p1) {
return new org.lwjgl.util.vector.Vector3f(((((org.lwjgl.util.vector.Vector3f)(p0)).y * ((org.lwjgl.util.vector.Vector3f)(p1)).z) - (((org.lwjgl.util.vector.Vector3f)(p0)).z * ((org.lwjgl.util.vector.Vector3f)(p1)).y)), ((((org.lwjgl.util.vector.Vector3f)(p0)).z * ((org.lwjgl.util.vector.Vector3f)(p1)).x) - (((org.lwjgl.util.vector.Vector3f)(p0)).x * ((org.lwjgl.util.vector.Vector3f)(p1)).z)), ((((org.lwjgl.util.vector.Vector3f)(p0)).x * ((org.lwjgl.util.vector.Vector3f)(p1)).y) - (((org.lwjgl.util.vector.Vector3f)(p0)).y * ((org.lwjgl.util.vector.Vector3f)(p1)).x)));
}


private float a(net.minecraft.entity.EntityLivingBase p0) {
java.lang.Double forwardValue900_27_0;
    net.minecraft.entity.Entity[] spill900_0;
    java.lang.Double spill900_1;
    long life2_3;
    java.lang.Double life5_9;
    double life6_19;
    net.minecraft.entity.Entity[] life4_20;
    double life8_39;
    forward_join_28: {
    forward_join_27: {
    life2_3 = (com.moon.module.impl.Pointers.L ^ 100929773884145L);
    life5_9 = ((java.lang.Double)(((com.google.common.cache.Cache)(this.K)).getIfPresent(((java.lang.Object)(p0)))));
    spill900_0 = com.moon.bY.b();
    life6_19 = ((double) java.lang.Math.min(((float)((((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_bc607678b6() / ((net.minecraft.entity.EntityLivingBase)(p0)).a()))), ((float)(0x1.0p0f))));
    life4_20 = spill900_0;
    spill900_1 = life5_9;
    if (!((life4_20 == null))) {
        forwardValue900_27_0 = spill900_1;
        break forward_join_27;
    }
    if (!((spill900_1 == null))) {
        break forward_join_28;
    }
    forwardValue900_27_0 = java.lang.Double.valueOf(((double)(life6_19)));
    }
    life5_9 = forwardValue900_27_0;
    }
    life8_39 = com.moon.nR.a(((double)(life6_19)), ((double)(((java.lang.Double)(life5_9)).doubleValue())), ((double)(0x1.99999ap-4d)));
    ((com.google.common.cache.Cache)(this.K)).put(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Double.valueOf(((double)(life8_39))))));
    return ((float) life8_39);
}


private int a__Int(net.minecraft.entity.EntityLivingBase p0) {
long local2 = (com.moon.module.impl.Pointers.L ^ 69487226461218L);
    return (java.awt.Color.HSBtoRGB(((float)((java.lang.Math.max(((float)(0x0.0p0f)), ((float)((java.lang.Math.min(((float)(((net.minecraft.entity.EntityLivingBase)(p0)).b__sourceReturn_bc607678b6())), ((float)(((net.minecraft.entity.EntityLivingBase)(p0)).a()))) / ((net.minecraft.entity.EntityLivingBase)(p0)).a())))) / 0x1.8p1f))), ((float)(0x1.0p0f)), ((float)(0x1.0p0f))) | __sourceIntrinsic_68f558266c89_originalDynamicSite527_7(4486, (4823844261049692567L ^ local2)));
}


private float a(org.lwjgl.util.vector.Vector3f p0) {
return ((float) java.lang.Math.sqrt(((double)(((double) (((((org.lwjgl.util.vector.Vector3f)(p0)).x * ((org.lwjgl.util.vector.Vector3f)(p0)).x) + (((org.lwjgl.util.vector.Vector3f)(p0)).y * ((org.lwjgl.util.vector.Vector3f)(p0)).y)) + (((org.lwjgl.util.vector.Vector3f)(p0)).z * ((org.lwjgl.util.vector.Vector3f)(p0)).z)))))));
}


private org.lwjgl.util.vector.Vector2f a(org.lwjgl.util.vector.Vector2f p0, org.lwjgl.util.vector.Vector2f p1, float p2) {
double local4_life1 = java.lang.Math.toRadians(((double)(((double) p2))));
    float local6_life3 = ((float) java.lang.Math.cos(((double)(local4_life1))));
    float local7_life5 = ((float) java.lang.Math.sin(((double)(local4_life1))));
    return new org.lwjgl.util.vector.Vector2f(((((org.lwjgl.util.vector.Vector2f)(p0)).x + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local6_life3)) - ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local7_life5)), ((((org.lwjgl.util.vector.Vector2f)(p0)).y + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local7_life5)) + ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local6_life3)));
}


private org.lwjgl.util.vector.Vector3f a__Vector3f(org.lwjgl.util.vector.Vector3f p0) {
float forwardValue901_114_0;
    int forwardValue901_114_1;
    float forwardValue901_115_0;
    float forwardValue901_116_0;
    int forwardValue901_116_1;
    net.minecraft.entity.Entity[] spill901_0;
    float spill901_1;
    boolean spill901_2;
    long life2_3;
    moom.ir life5_6;
    float life6_10;
    float life7_14;
    float life8_24;
    org.lwjgl.util.vector.Vector3f life9_36;
    org.lwjgl.util.vector.Vector3f life10_43;
    org.lwjgl.util.vector.Vector3f life11_47;
    org.lwjgl.util.vector.Vector3f life11_54;
    org.lwjgl.util.vector.Vector3f life12_59;
    float life13_64;
    net.minecraft.entity.Entity[] life4_65;
    float life14_70;
    org.lwjgl.util.vector.Vector2f life15_82;
    float life16_94;
    float life17_100;
    float life18_121;
    float life19_126;
    forward_join_116: {
    forward_join_115: {
    forward_join_114: {
    life2_3 = (com.moon.module.impl.Pointers.L ^ 97603803897156L);
    spill901_0 = com.moon.bY.b();
    life5_6 = com.moon.nS.a();
    life6_10 = ((float) ((moom.ir)(life5_6)).a__Int());
    life7_14 = ((float) ((moom.ir)(life5_6)).b__Int());
    life8_24 = (((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.u)).getValue())))).floatValue() * (life7_14 / 0x1.ep8f));
    life9_36 = new org.lwjgl.util.vector.Vector3f(0x0.0p0f, (0x1.68p8f - moom.Dr.e(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Pointers.d)).K)).w)))), 0x0.0p0f);
    life10_43 = new org.lwjgl.util.vector.Vector3f(0x0.0p0f, 0x0.0p0f, 0x1.0p0f);
    life11_47 = ((com.moon.module.impl.Pointers)(this)).b(((org.lwjgl.util.vector.Vector3f)(life9_36)));
    ((org.lwjgl.util.vector.Vector3f)(life11_47)).setZ(((float)(0x0.0p0f)));
    life11_54 = ((com.moon.module.impl.Pointers)(this)).c(((org.lwjgl.util.vector.Vector3f)(life11_47)));
    life12_59 = ((com.moon.module.impl.Pointers)(this)).a__Vector3f(((org.lwjgl.util.vector.Vector3f)(life10_43)), ((org.lwjgl.util.vector.Vector3f)(life11_54)));
    life13_64 = ((com.moon.module.impl.Pointers)(this)).a(((org.lwjgl.util.vector.Vector3f)(p0)), ((org.lwjgl.util.vector.Vector3f)(life11_54)));
    life4_65 = spill901_0;
    life14_70 = ((com.moon.module.impl.Pointers)(this)).a(((org.lwjgl.util.vector.Vector3f)(p0)), ((org.lwjgl.util.vector.Vector3f)(life12_59)));
    life15_82 = new org.lwjgl.util.vector.Vector2f((life8_24 * (-life14_70)), (life8_24 * (-life13_64)));
    life16_94 = ((float) java.lang.Math.toDegrees(((double)((java.lang.Math.atan2(((double)(((double) ((org.lwjgl.util.vector.Vector2f)(life15_82)).x))), ((double)(((double) ((org.lwjgl.util.vector.Vector2f)(life15_82)).y)))) + 0x1.921fb54442d18p1d)))));
    life17_100 = ((float) (-java.lang.Math.toRadians(((double)(((double) life16_94))))));
    spill901_1 = ((float) java.lang.Math.sin(((double)(((double) life17_100)))));
    spill901_2 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.v)).getValue())))).booleanValue();
    if (!((life4_65 == null))) {
        forwardValue901_114_0 = spill901_1;
        forwardValue901_114_1 = ((spill901_2) ? 1 : 0);
        break forward_join_114;
    }
    if (!(spill901_2)) {
        forwardValue901_115_0 = spill901_1;
        break forward_join_115;
    }
    forwardValue901_114_0 = spill901_1;
    forwardValue901_114_1 = 2;
    }
    forwardValue901_116_0 = forwardValue901_114_0;
    forwardValue901_116_1 = forwardValue901_114_1;
    break forward_join_116;
    }
    forwardValue901_116_0 = forwardValue901_115_0;
    forwardValue901_116_1 = 1;
    }
    life18_121 = (forwardValue901_116_0 * ((float) forwardValue901_116_1));
    life19_126 = ((float) java.lang.Math.cos(((double)(((double) life17_100)))));
    ((org.lwjgl.util.vector.Vector2f)(life15_82)).setX(((float)(((life6_10 / 0x1.0p1f) + (life8_24 * life18_121)))));
    ((org.lwjgl.util.vector.Vector2f)(life15_82)).setY(((float)(((life7_14 / 0x1.0p1f) - (life8_24 * life19_126)))));
    return new org.lwjgl.util.vector.Vector3f(((org.lwjgl.util.vector.Vector2f)(life15_82)).x, ((org.lwjgl.util.vector.Vector2f)(life15_82)).y, (-life16_94));
}


public void a(com.moon.event.Render2DEvent p0) { __sourceHandlerCall_3b932db52cc2fbe0a239(this, p0); }


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private java.lang.Boolean lambda$new$0() {
int forwardValue903_15_0;
    int forwardValue903_17_0;
    boolean spill903_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_15: {
    life1_3 = (com.moon.module.impl.Pointers.L ^ 11746688594432L);
    life3_5 = com.moon.bY.b();
    spill903_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue();
    if (!((life3_5 == null))) {
        forwardValue903_15_0 = ((spill903_0) ? 1 : 0);
        break forward_join_15;
    }
    if (!((!spill903_0))) {
        break forward_join_16;
    }
    forwardValue903_15_0 = 1;
    }
    forwardValue903_17_0 = forwardValue903_15_0;
    break forward_join_17;
    }
    forwardValue903_17_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue903_17_0))));
}


private void lambda$new$1() {
terminal_cycle_0: while (true) {
        this.G = ((boolean)(true));
        ((com.moon.gX)(this.F)).a(((int)(((com.moon.module.impl.Pointers)(this)).b())));
        continue terminal_cycle_0;
    }
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_43(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_54(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_59(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_64(com.moon.module.impl.Pointers a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_69(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_82(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_108(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_111(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_116(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_119(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_124(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_127(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_132(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_135(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_141(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_168(com.moon.module.impl.Pointers a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5610a7faacea4a20_originalDynamicSite158_170(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic899_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic899_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_68f558266c89_originalDynamicSite527_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_e1958f95391c_originalDynamicSite161_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_086ba0952f01_originalDynamicSite522_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2593_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2596_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native java.lang.String __sourceExactCall_91987ae49548de(byte[] p0);
}
