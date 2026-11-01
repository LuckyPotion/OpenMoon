package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hu implements com.moon.hn {

private moom.DD b;

private com.moon.module.impl.HUD c;

private com.moon.module.impl.Effects d;

private boolean e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

private static long[] q;

private static java.lang.Long[] r;

private static java.util.Map s;

public hu() { super(); }


private static void __sourceConstructorBody_a3fdf9c8ffd686be(com.moon.hu receiver) throws Throwable {

long local1 = (com.moon.hu.f ^ 67095169736214L);

    com.moon.hu.__sourceConstructorInit_a3fdf9c8ffd686be_0(((com.moon.hu)(receiver)));

    ((com.moon.hu)(receiver)).b = ((moom.DD)(new moom.DD(__sourceIntrinsic_a3fdf9c8ffd686be_originalDynamicSite980_2(6665, (4601279264427802722L ^ local1)))));

    ((com.moon.hu)(receiver)).c = ((com.moon.module.impl.HUD)(null));

    ((com.moon.hu)(receiver)).e = ((boolean)(false));

    return;

}



static {
f = ((long)(((moom._a)(moom._c.a(((long)(6245168195570106621L)), ((long)(2010236645814362228L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122157021514310L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.hu.f ^ 94121317002362L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill146_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill146_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill146_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill146_14 = new byte[8];
    (__sourceSpill146_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill146_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation146_16 = __sourceSpill146_14;
    ((javax.crypto.Cipher)(__sourceSpill146_11)).init(((int)(__sourceSpill146_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill146_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation146_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[10];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "¥#v@}\020Êyí+l¸¯\007&îH[\nuÛØ\004\035·àH Õ^á\001¤0G\013\"Ïiý$¦_\rbU\021m\013¿Yùz\177ë\036é~Ó\035¨ö\003ßÓØUZä\026\bå­\0202Ú+\017dß\013uïßZõð¬: 3àVjêÆl l`Z\027\013qtu\021U]Å~q6²¿ T¡ ;:ëæ%7R4\006ÞdÛaZõâ·ÿ\f×ïÊ\004#\004¦\020­ ®¤ÈqØ+óH\033¹»ç\026{qÕ\024k¦\\+¨©P¯Bù:¤\030æ\031£ÌÜ*'§^0Â±ò\001½gÁü`Ú5\002\030$\000¦å®+ì·A¥/mÊØ\177ß\033\013=þ Þ}ºsüë¬\0374\007gX \035\035bÉ¢Ë\"Ç¢c=4»\t\023"))).length();
    int local27_life24 = 80;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill146_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill146_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill146_29)).doFinal(((byte[])(__sourceSpill146_28)));
        java.lang.String __sourceSpill146_34 = ((java.lang.String)(com.moon.hu.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill146_35 = local31_life19;
        int __sourceSpill146_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill146_35)[__sourceSpill146_36] = __sourceSpill146_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    local30_life23 = ((java.lang.String)((local28_life21 = "ãJÏmÜ´§C%\177l\020T¡\020*\rL¿¹·p¸\035Ä~\002="))).length();
    local27_life24 = 16;
    local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill146_41 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill146_42 = local24_life9;
        byte[] local32_life44 = ((javax.crypto.Cipher)(__sourceSpill146_42)).doFinal(((byte[])(__sourceSpill146_41)));
        java.lang.String __sourceSpill146_47 = ((java.lang.String)(com.moon.hu.a(((byte[])(local32_life44))))).intern();
        java.lang.String[] __sourceSpill146_48 = local31_life19;
        int __sourceSpill146_49 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill146_48)[__sourceSpill146_49] = __sourceSpill146_47;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    g = ((java.lang.String[])(local31_life19));
    h = ((java.lang.String[])(new java.lang.String[10]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life55;
    javax.crypto.Cipher __sourceSpill146_57 = (local11_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill146_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill146_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill146_60 = new byte[8];
    (__sourceSpill146_60)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life61 = 1;
    while ((local12_life61 < 8)) {
        (__sourceSpill146_60)[local12_life61] = ((byte) ((int) ((local22_life7 << (local12_life61 * 8)) >>> 56)));
        local12_life61 += 1;
    }
    byte[] __sourcePreallocation146_62 = __sourceSpill146_60;
    ((javax.crypto.Cipher)(__sourceSpill146_57)).init(((int)(__sourceSpill146_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill146_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation146_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life65 = new long[22];
    int local14_life66 = 0;
    java.lang.String local15_life67;
    int local16_life69 = ((java.lang.String)((local15_life67 = "Æ¶\034=0ì¿ci@áÇÕû\bdÖ7z!»V1*\002ËßLÊvWzßW4£\032½¬í\006ð ï\022¾ÑZj4c\006=&r\0045¯Wdßph\033&nUqó¥½>i¥ÛS\\þtÎArÇm3ø\032XË4\013Î ÒpUä@ëNÐ\017\035n¹\024þÐ/\027\021ÖýjA/ø\026AèSý\037Î2Ô).\016ø®êÒtxë'\003öo"))).length();
    int local13_life70 = 0;
    do {
        java.lang.String __sourceSpill146_71 = local15_life67;
        int __sourceSpill146_72 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill146_71)).substring(((int)(__sourceSpill146_72)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill146_76 = local17_life65;
        int __sourceSpill146_77 = local14_life66;
        local14_life66 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill146_79 = new byte[8];
        (__sourceSpill146_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill146_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill146_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill146_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill146_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill146_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill146_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill146_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill146_80 = local11_life55;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill146_80)).doFinal(((byte[])(__sourceSpill146_79)));
        (__sourceSpill146_76)[__sourceSpill146_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    local16_life69 = ((java.lang.String)((local15_life67 = ";*ùi'´Vx/¼-¿iö¢S"))).length();
    local13_life70 = 0;
    do {
        java.lang.String __sourceSpill146_84 = local15_life67;
        int __sourceSpill146_85 = local13_life70;
        local13_life70 += 8;
        byte[] local18_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill146_84)).substring(((int)(__sourceSpill146_85)), ((int)(local13_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill146_89 = local17_life65;
        int __sourceSpill146_90 = local14_life66;
        local14_life66 += 1;
        long local19_life91 = (((((((((((long) (local18_life88)[0]) & 255L) << 56) | ((((long) (local18_life88)[1]) & 255L) << 48)) | ((((long) (local18_life88)[2]) & 255L) << 40)) | ((((long) (local18_life88)[3]) & 255L) << 32)) | ((((long) (local18_life88)[4]) & 255L) << 24)) | ((((long) (local18_life88)[5]) & 255L) << 16)) | ((((long) (local18_life88)[6]) & 255L) << 8)) | (((long) (local18_life88)[7]) & 255L));
        byte[] __sourceSpill146_92 = new byte[8];
        (__sourceSpill146_92)[0] = ((byte) ((int) (local19_life91 >>> 56)));
        (__sourceSpill146_92)[1] = ((byte) ((int) (local19_life91 >>> 48)));
        (__sourceSpill146_92)[2] = ((byte) ((int) (local19_life91 >>> 40)));
        (__sourceSpill146_92)[3] = ((byte) ((int) (local19_life91 >>> 32)));
        (__sourceSpill146_92)[4] = ((byte) ((int) (local19_life91 >>> 24)));
        (__sourceSpill146_92)[5] = ((byte) ((int) (local19_life91 >>> 16)));
        (__sourceSpill146_92)[6] = ((byte) ((int) (local19_life91 >>> 8)));
        (__sourceSpill146_92)[7] = ((byte) ((int) local19_life91));
        javax.crypto.Cipher __sourceSpill146_93 = local11_life55;
        byte[] local21_life95 = ((javax.crypto.Cipher)(__sourceSpill146_93)).doFinal(((byte[])(__sourceSpill146_92)));
        (__sourceSpill146_89)[__sourceSpill146_90] = (((((((((((long) (local21_life95)[0]) & 255L) << 56) | ((((long) (local21_life95)[1]) & 255L) << 48)) | ((((long) (local21_life95)[2]) & 255L) << 40)) | ((((long) (local21_life95)[3]) & 255L) << 32)) | ((((long) (local21_life95)[4]) & 255L) << 24)) | ((((long) (local21_life95)[5]) & 255L) << 16)) | ((((long) (local21_life95)[6]) & 255L) << 8)) | (((long) (local21_life95)[7]) & 255L));
    } while ((!(local13_life70 >= local16_life69)));
    k = ((long[])(local17_life65));
    l = ((java.lang.Integer[])(new java.lang.Integer[22]));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life100;
    javax.crypto.Cipher __sourceSpill146_102 = (local0_life100 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill146_103 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill146_104 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill146_105 = new byte[8];
    (__sourceSpill146_105)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life106 = 1;
    while ((local1_life106 < 8)) {
        (__sourceSpill146_105)[local1_life106] = ((byte) ((int) ((local22_life7 << (local1_life106 * 8)) >>> 56)));
        local1_life106 += 1;
    }
    byte[] __sourcePreallocation146_107 = __sourceSpill146_105;
    ((javax.crypto.Cipher)(__sourceSpill146_102)).init(((int)(__sourceSpill146_103)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill146_104)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation146_107)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life110 = new long[2];
    int local3_life111 = 0;
    java.lang.String local4_life112;
    int local5_life114 = ((java.lang.String)((local4_life112 = "|ÌÆw¬Y¦BG`Å£@\027"))).length();
    int local2_life115 = 0;
    do {
        java.lang.String __sourceSpill146_116 = local4_life112;
        int __sourceSpill146_117 = local2_life115;
        local2_life115 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill146_116)).substring(((int)(__sourceSpill146_117)), ((int)(local2_life115))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill146_121 = local6_life110;
        int __sourceSpill146_122 = local3_life111;
        local3_life111 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill146_124 = new byte[8];
        (__sourceSpill146_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill146_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill146_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill146_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill146_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill146_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill146_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill146_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill146_125 = local0_life100;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill146_125)).doFinal(((byte[])(__sourceSpill146_124)));
        (__sourceSpill146_121)[__sourceSpill146_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life115 >= local5_life114)));
    q = ((long[])(local6_life110));
    r = ((java.lang.Long[])(new java.lang.Long[2]));
}

private static native <E extends Throwable> void __sourceConstructorInit_a3fdf9c8ffd686be_0(com.moon.hu a0) throws E;

private static moom.Oo b(moom.Oo p0) {
return p0;
}


private void b() {
com.moon.hu forwardValue390_12_0;
    com.moon.hu spill390_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.hu.f ^ 19846777372395L);
    life3_5 = com.moon.hq.b__ArrayString();
    spill390_0 = this;
    if (!((life3_5 == null))) {
        forwardValue390_12_0 = spill390_0;
        break forward_join_12;
    }
    if (!((((com.moon.hu)(spill390_0)).c == null))) {
        break forward_join_18;
    }
    forwardValue390_12_0 = this;
    }
    ((com.moon.hu)(forwardValue390_12_0)).c = ((com.moon.module.impl.HUD)(((com.moon.module.impl.HUD)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))))));
    }
    return;
}


private java.lang.String[] b__ArrayString() {
return new java.lang.String[] {"", "", "", ""};
}


public void b(com.moon.hW p0) {
java.lang.Object forwardValue391_27_0;
    java.lang.Object forwardValue391_49_0;
    com.moon.hu forwardValue391_52_0;
    com.moon.hW forwardValue391_133_0;
    float forwardValue391_133_1;
    float forwardValue391_133_2;
    float forwardValue391_133_3;
    float forwardValue391_133_4;
    float forwardValue391_133_5;
    com.moon.aO forwardValue391_133_6;
    int forwardValue391_133_7;
    com.moon.hW forwardValue391_136_0;
    float forwardValue391_136_1;
    float forwardValue391_136_2;
    float forwardValue391_136_3;
    float forwardValue391_136_4;
    float forwardValue391_136_5;
    com.moon.aO forwardValue391_136_6;
    com.moon.hW forwardValue391_137_0;
    float forwardValue391_137_1;
    float forwardValue391_137_2;
    float forwardValue391_137_3;
    float forwardValue391_137_4;
    float forwardValue391_137_5;
    com.moon.aO forwardValue391_137_6;
    float forwardValue391_137_7;
    com.moon.module.impl.Effects spill391_0;
    java.lang.Boolean spill391_1;
    com.moon.hu spill391_2;
    int spill391_3;
    com.moon.hW spill391_4;
    float spill391_5;
    float spill391_6;
    float spill391_7;
    float spill391_8;
    float spill391_9;
    com.moon.aO spill391_10;
    boolean spill391_11;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.jm life5_34;
    com.moon.jm life6_39;
    java.lang.String[] life7_71;
    java.lang.String[] life8_75;
    java.lang.String life9_82;
    java.lang.String life10_86;
    float life11_98;
    float life12_104;
    int life13_127;
    forward_join_141: {
    forward_join_137: {
    forward_join_136: {
    forward_join_133: {
    forward_join_52: {
    forward_join_49: {
    forward_join_27: {
    forward_join_18: {
    life2_3 = (com.moon.hu.f ^ 68383960566329L);
    life4_5 = com.moon.hq.b__ArrayString();
    spill391_0 = this.d;
    if (!((life4_5 == null))) {
        forwardValue391_27_0 = spill391_0;
        break forward_join_27;
    }
    if (!((spill391_0 == null))) {
        break forward_join_18;
    }
    this.d = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    ((com.moon.hu)(this)).b();
    forwardValue391_27_0 = ((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).i__kY())).getValue())))).a__Supplier())).get();
    }
    life5_34 = ((com.moon.jm)(forwardValue391_27_0));
    life6_39 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    spill391_1 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.c)).a__kV())).getValue()));
    if (!((life4_5 == null))) {
        forwardValue391_49_0 = spill391_1;
        break forward_join_49;
    }
    if (!(((java.lang.Boolean)(spill391_1)).booleanValue())) {
        break forward_join_141;
    }
    spill391_2 = this;
    if (!((life4_5 == null))) {
        forwardValue391_52_0 = spill391_2;
        break forward_join_52;
    }
    forwardValue391_49_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(((com.moon.hu)(spill391_2)).c)).a__kY())).getValue();
    }
    if (!((forwardValue391_49_0 == com.moon.b3.INFORMATIVE))) {
        break forward_join_141;
    }
    forwardValue391_52_0 = this;
    }
    life7_71 = ((com.moon.hu)(forwardValue391_52_0)).a__ArrayString();
    spill391_3 = 6477;
    life8_75 = ((com.moon.hu)(this)).b__ArrayString();
    life9_82 = java.lang.String.join(((java.lang.CharSequence)(__sourceIntrinsic_a2a3c1850a33_invokedynamic391_32(spill391_3, (2183558534324885262L ^ life2_3)))), ((java.lang.CharSequence[])(life7_71)));
    life10_86 = java.lang.String.join(((java.lang.CharSequence)("")), ((java.lang.CharSequence[])(life8_75)));
    life11_98 = ((((com.moon.jm)(life5_34)).a(((java.lang.String)(life9_82)), ((float)(0x1.766666p2f))) + ((com.moon.jm)(life6_39)).a(((java.lang.String)(life10_86)), ((float)(0x1.766666p2f)))) + 0x1.6p3f);
    life12_104 = (((com.moon.jm)(life5_34)).a(((float)(0x1.766666p2f))) + 0x1.6p3f);
    life13_127 = ((com.moon.hu)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.c)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).b__kX())).getValue())))).intValue())));
    spill391_4 = p0;
    spill391_5 = 0x1.dp2f;
    spill391_6 = 0x1.08p3f;
    spill391_7 = life11_98;
    spill391_8 = life12_104;
    spill391_9 = 0x1.ap2f;
    spill391_10 = new com.moon.aO(((java.awt.Color)(java.awt.Color.BLACK)).getRGB());
    spill391_11 = ((com.moon.module.impl.Effects)(this.d)).isEnabled();
    if (!((life4_5 == null))) {
        forwardValue391_133_0 = spill391_4;
        forwardValue391_133_1 = spill391_5;
        forwardValue391_133_2 = spill391_6;
        forwardValue391_133_3 = spill391_7;
        forwardValue391_133_4 = spill391_8;
        forwardValue391_133_5 = spill391_9;
        forwardValue391_133_6 = spill391_10;
        forwardValue391_133_7 = ((spill391_11) ? 1 : 0);
        break forward_join_133;
    }
    if (!(spill391_11)) {
        forwardValue391_136_0 = spill391_4;
        forwardValue391_136_1 = spill391_5;
        forwardValue391_136_2 = spill391_6;
        forwardValue391_136_3 = spill391_7;
        forwardValue391_136_4 = spill391_8;
        forwardValue391_136_5 = spill391_9;
        forwardValue391_136_6 = spill391_10;
        break forward_join_136;
    }
    forwardValue391_133_0 = spill391_4;
    forwardValue391_133_1 = spill391_5;
    forwardValue391_133_2 = spill391_6;
    forwardValue391_133_3 = spill391_7;
    forwardValue391_133_4 = spill391_8;
    forwardValue391_133_5 = spill391_9;
    forwardValue391_133_6 = spill391_10;
    forwardValue391_133_7 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Effects)(this.d)).b__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue391_133_7 != 0))) {
        forwardValue391_136_0 = forwardValue391_133_0;
        forwardValue391_136_1 = forwardValue391_133_1;
        forwardValue391_136_2 = forwardValue391_133_2;
        forwardValue391_136_3 = forwardValue391_133_3;
        forwardValue391_136_4 = forwardValue391_133_4;
        forwardValue391_136_5 = forwardValue391_133_5;
        forwardValue391_136_6 = forwardValue391_133_6;
        break forward_join_136;
    }
    forwardValue391_137_0 = forwardValue391_133_0;
    forwardValue391_137_1 = forwardValue391_133_1;
    forwardValue391_137_2 = forwardValue391_133_2;
    forwardValue391_137_3 = forwardValue391_133_3;
    forwardValue391_137_4 = forwardValue391_133_4;
    forwardValue391_137_5 = forwardValue391_133_5;
    forwardValue391_137_6 = forwardValue391_133_6;
    forwardValue391_137_7 = 0x1.19999ap-2f;
    break forward_join_137;
    }
    forwardValue391_137_0 = forwardValue391_136_0;
    forwardValue391_137_1 = forwardValue391_136_1;
    forwardValue391_137_2 = forwardValue391_136_2;
    forwardValue391_137_3 = forwardValue391_136_3;
    forwardValue391_137_4 = forwardValue391_136_4;
    forwardValue391_137_5 = forwardValue391_136_5;
    forwardValue391_137_6 = forwardValue391_136_6;
    forwardValue391_137_7 = 0x1.99999ap-2f;
    }
    ((com.moon.hW)(forwardValue391_137_0)).a(((com.moon.iX)(com.moon.i3.a(((float)(forwardValue391_137_1)), ((float)(forwardValue391_137_2)), ((float)(forwardValue391_137_3)), ((float)(forwardValue391_137_4)), ((float)(forwardValue391_137_5)), ((int)(((com.moon.aO)(((com.moon.aO)(forwardValue391_137_6)).a(((float)(forwardValue391_137_7))))).getRGB()))))));
    }
    return;
}


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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12812);
    if (((com.moon.hu.r)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.hu.q)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.hu.s)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hu.s)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/hu", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.hu.r)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.hu.r)[life3_8])).longValue();
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.hu.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral1525_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral1526_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 25511;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/hu", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hu.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c(com.moon.hW p0) {
java.lang.Object forwardValue392_37_0;
    com.moon.hu forwardValue392_40_0;
    java.lang.String[] spill392_0;
    java.lang.Boolean spill392_1;
    com.moon.hu spill392_2;
    int spill392_3;
    long life2_3;
    com.moon.jm life5_15;
    java.lang.String[] life4_16;
    com.moon.jm life6_21;
    java.lang.String[] life7_53;
    java.lang.String[] life8_57;
    java.lang.String life9_64;
    java.lang.String life10_68;
    float life11_80;
    float life12_86;
    int life13_109;
    forward_join_112: {
    forward_join_40: {
    forward_join_37: {
    life2_3 = (com.moon.hu.f ^ 38889654603302L);
    ((com.moon.hu)(this)).b();
    spill392_0 = com.moon.hq.b__ArrayString();
    life5_15 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).i__kY())).getValue())))).a__Supplier())).get()));
    life4_16 = spill392_0;
    life6_21 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    spill392_1 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.c)).a__kV())).getValue()));
    if (!((life4_16 == null))) {
        forwardValue392_37_0 = spill392_1;
        break forward_join_37;
    }
    if (!(((java.lang.Boolean)(spill392_1)).booleanValue())) {
        break forward_join_112;
    }
    spill392_2 = this;
    if (!((life4_16 == null))) {
        forwardValue392_40_0 = spill392_2;
        break forward_join_40;
    }
    forwardValue392_37_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(((com.moon.hu)(spill392_2)).c)).a__kY())).getValue();
    }
    if (!((forwardValue392_37_0 == com.moon.b3.INFORMATIVE))) {
        break forward_join_112;
    }
    forwardValue392_40_0 = this;
    }
    life7_53 = ((com.moon.hu)(forwardValue392_40_0)).a__ArrayString();
    spill392_3 = 9756;
    life8_57 = ((com.moon.hu)(this)).b__ArrayString();
    life9_64 = java.lang.String.join(((java.lang.CharSequence)(__sourceIntrinsic_2e9a6a59f6f0_invokedynamic392_25(spill392_3, (6401958728148446274L ^ life2_3)))), ((java.lang.CharSequence[])(life7_53)));
    life10_68 = java.lang.String.join(((java.lang.CharSequence)("")), ((java.lang.CharSequence[])(life8_57)));
    life11_80 = ((((com.moon.jm)(life5_15)).a(((java.lang.String)(life9_64)), ((float)(0x1.766666p2f))) + ((com.moon.jm)(life6_21)).a(((java.lang.String)(life10_68)), ((float)(0x1.766666p2f)))) + 0x1.6p3f);
    life12_86 = (((com.moon.jm)(life5_15)).a(((float)(0x1.766666p2f))) + 0x1.6p3f);
    life13_109 = ((com.moon.hu)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.c)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).b__kX())).getValue())))).intValue())));
    ((com.moon.hW)(p0)).a(((com.moon.iX)(com.moon.i3.a(((float)(0x1.cp2f)), ((float)(0x1.0p3f)), ((float)((life11_80 + 0x1.0p-1f))), ((float)((life12_86 + 0x1.0p-1f))), ((float)(0x1.ap2f)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    }
    return;
}


public void d(com.moon.hW p0) {
java.lang.Object forestValue78_33_0;
    int forestValue78_46_0;
    int forestValue78_55_0;
    int forestValue78_125_0;
    int forestValue78_127_0;
    int forestValue78_137_0;
    int forestValue78_139_0;
    float forestValue78_154_0;
    float forestValue78_167_0;
    java.lang.String forestValue78_177_0;
    java.lang.String forestValue78_190_0;
    com.moon.jn forestValue78_222_0;
    com.moon.hW forestValue78_222_1;
    java.lang.String forestValue78_222_2;
    float forestValue78_222_3;
    float forestValue78_222_4;
    float forestValue78_222_5;
    int forestValue78_222_6;
    com.moon.jn forestValue78_223_0;
    com.moon.hW forestValue78_223_1;
    java.lang.String forestValue78_223_2;
    float forestValue78_223_3;
    float forestValue78_223_4;
    float forestValue78_223_5;
    com.moon.jn forestValue78_245_0;
    com.moon.hW forestValue78_245_1;
    java.lang.String forestValue78_245_2;
    float forestValue78_245_3;
    float forestValue78_245_4;
    float forestValue78_245_5;
    int forestValue78_245_6;
    java.lang.String[] spill78_0;
    com.moon.hW spill78_1;
    boolean spill78_2;
    int spill78_3;
    int spill78_4;
    com.moon.jn spill78_5;
    com.moon.hW spill78_6;
    java.lang.String spill78_7;
    float spill78_8;
    float spill78_9;
    float spill78_10;
    int spill78_11;
    long life2_3;
    java.lang.String[] life4_7;
    com.moon.jn life5_16;
    com.moon.jn life6_22;
    java.lang.String[] life7_104;
    java.lang.String[] life8_107;
    float life9_109;
    float life10_115;
    int life11_117;
    java.lang.String life12_125;
    int life13_134;
    int life14_148;
    int life15_152;
    float life16_163;
    float life17_176;
    java.lang.String life18_186;
    java.lang.String life19_199;
    forest_join_302: {
    forest_join_96: {
    forest_join_55: {
    forest_join_49: {
    forest_join_46: {
    forest_join_33: {
    life2_3 = (com.moon.hu.f ^ 72704961317045L);
    spill78_0 = com.moon.hq.b__ArrayString();
    ((com.moon.hu)(this)).b();
    life4_7 = spill78_0;
    life5_16 = ((com.moon.jn)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).i__kY())).getValue())))).a__Supplier())).get()));
    life6_22 = ((com.moon.jn)(((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)))));
    spill78_1 = ((com.moon.module.impl.HUD)(this.c)).e();
    if (!((life4_7 == null))) {
        forestValue78_33_0 = spill78_1;
        break forest_join_33;
    }
    if (!((spill78_1 != null))) {
        break forest_join_302;
    }
    forestValue78_33_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.c)).a__kV())).getValue();
    }
    spill78_2 = ((java.lang.Boolean)(((java.lang.Boolean)(forestValue78_33_0)))).booleanValue();
    if (!((life4_7 == null))) {
        forestValue78_46_0 = ((spill78_2) ? 1 : 0);
        break forest_join_46;
    }
    if (!(spill78_2)) {
        break forest_join_302;
    }
    forestValue78_46_0 = (com.moon.hv.a)[((com.moon.b3)(((com.moon.b3)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).a__kY())).getValue())))).ordinal()];
    }
    if (!((life4_7 == null))) {
        forestValue78_55_0 = forestValue78_46_0;
        break forest_join_55;
    }
    switch (forestValue78_46_0) {
case 1:
{
        break forest_join_49;
    }
case 2:
{
        break forest_join_96;
    }
default:
{
        break forest_join_302;
    }
}
    }
    forestValue78_55_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.c)).b__kV())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue78_55_0 != 0))) {
        break forest_join_302;
    }
    ((com.moon.jn)(life5_16)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.c)).e())), ((java.lang.String)(((java.lang.String)(((java.lang.String)(((com.moon.k5)(((com.moon.module.impl.HUD)(this.c)).a__k5())).getValue())))).replace(((java.lang.CharSequence)("&")), ((java.lang.CharSequence)("§"))))), ((float)(0x1.2p3f)), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((int)(((com.moon.hu)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.c)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).b__kX())).getValue())))).intValue()))))));
    if (!((life4_7 != null))) {
        break forest_join_302;
    }
    }
    life7_104 = ((com.moon.hu)(this)).a__ArrayString();
    life8_107 = ((com.moon.hu)(this)).b__ArrayString();
    life9_109 = 0x0.0p0f;
    life10_115 = (((com.moon.jn)(life5_16)).a(((float)(0x1.766666p2f))) + 0x1.6p3f);
    life11_117 = 0;
    forest_cycle_112: while (true) {
    forest_join_300: {
    forest_join_288: {
    forest_join_245: {
    forest_join_223: {
    forest_join_222: {
    forest_join_190: {
    forest_join_189: {
    forest_join_177: {
    forest_join_176: {
    forest_join_167: {
    forest_join_166: {
    forest_join_154: {
    forest_join_153: {
    forest_join_139: {
    forest_join_138: {
    forest_join_137: {
    forest_join_127: {
    forest_join_126: {
    forest_join_125: {
    if (!((life11_117 < (life7_104).length))) {
        break forest_join_302;
    }
    life12_125 = (life7_104)[life11_117];
    spill78_3 = life11_117;
    if (!((life4_7 == null))) {
        forestValue78_125_0 = spill78_3;
        break forest_join_125;
    }
    if (!((spill78_3 > 0))) {
        break forest_join_126;
    }
    forestValue78_125_0 = 1;
    }
    forestValue78_127_0 = forestValue78_125_0;
    break forest_join_127;
    }
    forestValue78_127_0 = 0;
    }
    life13_134 = forestValue78_127_0;
    spill78_4 = life11_117;
    if (!((life4_7 == null))) {
        forestValue78_137_0 = spill78_4;
        break forest_join_137;
    }
    if (!((spill78_4 < ((life7_104).length - 1)))) {
        break forest_join_138;
    }
    forestValue78_137_0 = 1;
    }
    forestValue78_139_0 = forestValue78_137_0;
    break forest_join_139;
    }
    forestValue78_139_0 = 0;
    }
    life14_148 = forestValue78_139_0;
    life15_152 = (life11_117 - 1);
    if (!((life13_134 != 0))) {
        break forest_join_153;
    }
    forestValue78_154_0 = ((com.moon.jn)(life6_22)).a(((java.lang.String)((life8_107)[life15_152])), ((float)(0x1.766666p2f)));
    break forest_join_154;
    }
    forestValue78_154_0 = 0x0.0p0f;
    }
    life16_163 = forestValue78_154_0;
    if (!((life14_148 != 0))) {
        break forest_join_166;
    }
    forestValue78_167_0 = ((com.moon.jn)(life5_16)).a(((java.lang.String)(__sourceIntrinsic_f0efb0c1e576_invokedynamic78_63(18961, (1954628334375159517L ^ life2_3)))), ((float)(0x1.766666p2f)));
    break forest_join_167;
    }
    forestValue78_167_0 = 0x0.0p0f;
    }
    life17_176 = forestValue78_167_0;
    if (!((life14_148 != 0))) {
        break forest_join_176;
    }
    forestValue78_177_0 = __sourceIntrinsic_f0efb0c1e576_invokedynamic78_65(3035, (2588196521501853458L ^ life2_3));
    break forest_join_177;
    }
    forestValue78_177_0 = "";
    }
    life18_186 = forestValue78_177_0;
    if (!((life13_134 != 0))) {
        break forest_join_189;
    }
    java.lang.String __stackOp78_67_0 = life12_125;
    java.lang.String __stackOp78_67_1 = __sourceIntrinsic_f0efb0c1e576_invokedynamic78_66(31292, (2984704673953216254L ^ life2_3));
    forestValue78_190_0 = __sourceIntrinsic_f0efb0c1e576_invokedynamic78_68(__stackOp78_67_1, __stackOp78_67_0);
    break forest_join_190;
    }
    forestValue78_190_0 = life12_125;
    }
    life19_199 = forestValue78_190_0;
    spill78_5 = life5_16;
    spill78_6 = ((com.moon.module.impl.HUD)(this.c)).e();
    spill78_7 = __sourceIntrinsic_f0efb0c1e576_invokedynamic78_71(life19_199, life18_186);
    spill78_8 = 0x1.766666p2f;
    spill78_9 = ((0x1.98p3f + life9_109) + life16_163);
    spill78_10 = (((0x1.08p3f + (life10_115 / 0x1.0p1f)) - (((com.moon.jn)(life5_16)).a(((float)(0x1.766666p2f))) / 0x1.0p1f)) + 0x1.0p-1f);
    spill78_11 = life13_134;
    if (!((life4_7 == null))) {
        forestValue78_222_0 = spill78_5;
        forestValue78_222_1 = spill78_6;
        forestValue78_222_2 = spill78_7;
        forestValue78_222_3 = spill78_8;
        forestValue78_222_4 = spill78_9;
        forestValue78_222_5 = spill78_10;
        forestValue78_222_6 = spill78_11;
        break forest_join_222;
    }
    if (!((spill78_11 != 0))) {
        forestValue78_223_0 = spill78_5;
        forestValue78_223_1 = spill78_6;
        forestValue78_223_2 = spill78_7;
        forestValue78_223_3 = spill78_8;
        forestValue78_223_4 = spill78_9;
        forestValue78_223_5 = spill78_10;
        break forest_join_223;
    }
    forestValue78_222_0 = spill78_5;
    forestValue78_222_1 = spill78_6;
    forestValue78_222_2 = spill78_7;
    forestValue78_222_3 = spill78_8;
    forestValue78_222_4 = spill78_9;
    forestValue78_222_5 = spill78_10;
    forestValue78_222_6 = -1;
    }
    forestValue78_245_0 = forestValue78_222_0;
    forestValue78_245_1 = forestValue78_222_1;
    forestValue78_245_2 = forestValue78_222_2;
    forestValue78_245_3 = forestValue78_222_3;
    forestValue78_245_4 = forestValue78_222_4;
    forestValue78_245_5 = forestValue78_222_5;
    forestValue78_245_6 = forestValue78_222_6;
    break forest_join_245;
    }
    forestValue78_245_0 = forestValue78_223_0;
    forestValue78_245_1 = forestValue78_223_1;
    forestValue78_245_2 = forestValue78_223_2;
    forestValue78_245_3 = forestValue78_223_3;
    forestValue78_245_4 = forestValue78_223_4;
    forestValue78_245_5 = forestValue78_223_5;
    forestValue78_245_6 = ((com.moon.hu)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.c)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).b__kX())).getValue())))).intValue())));
    }
    ((com.moon.jn)(forestValue78_245_0)).a(((com.moon.hW)(forestValue78_245_1)), ((java.lang.String)(forestValue78_245_2)), ((float)(forestValue78_245_3)), ((float)(forestValue78_245_4)), ((float)(forestValue78_245_5)), ((int)(forestValue78_245_6)), ((boolean)(true)), ((boolean)(false)), ((float)(0x0.0p0f)), ((float)(-0x1.47ae14p-6f)));
    if (!((life4_7 == null))) {
        break forest_join_300;
    }
    if (!((life13_134 != 0))) {
        break forest_join_288;
    }
    ((com.moon.jn)(life6_22)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.c)).g())), ((java.lang.String)((life8_107)[life15_152])), ((float)(0x1.766666p2f)), ((float)((0x1.98p3f + life9_109))), ((float)(((0x1.08p3f + (life10_115 / 0x1.0p1f)) - (((com.moon.jn)(life6_22)).b(((java.lang.String)((life8_107)[life15_152])), ((float)(0x1.766666p2f))) / 0x1.0p2f)))), ((int)(__sourceIntrinsic_f0efb0c1e576_invokedynamic78_93(4834, (7185044973545144781L ^ life2_3)))), ((boolean)(true)), ((boolean)(false)), ((float)(0x0.0p0f)));
    }
    life9_109 = (life9_109 + ((((com.moon.jn)(life5_16)).a(((java.lang.String)(life19_199)), ((float)(0x1.766666p2f))) + life17_176) + life16_163));
    life11_117 += 1;
    }
    if (!((life4_7 != null))) {
        continue forest_cycle_112;
    }
    break forest_cycle_112;
    }
    }
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1529_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hu"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void() {
int forestValue77_25_0;
    int forestValue77_36_0;
    int forestValue77_60_0;
    int forestValue77_132_0;
    java.lang.Object forestValue77_170_0;
    com.moon.b0 forestValue77_170_1;
    int forestValue77_195_0;
    java.lang.Object forestValue77_240_0;
    int forestValue77_301_0;
    java.lang.String[] spill77_0;
    boolean spill77_1;
    java.lang.Object spill77_2;
    com.moon.b0 spill77_3;
    int spill77_4;
    java.lang.Object spill77_5;
    int spill77_6;
    boolean spill77_7;
    long life1_3;
    java.lang.String[] life3_7;
    com.moon.hW life4_83;
    int life5_102;
    int life6_104;
    forest_join_302: {
    forest_join_301: {
    forest_join_257: {
    forest_join_240: {
    forest_join_236: {
    forest_join_228: {
    forest_join_220: {
    forest_join_198: {
    forest_join_195: {
    forest_join_182: {
    forest_join_170: {
    forest_join_163: {
    forest_join_155: {
    forest_join_135: {
    forest_join_132: {
    forest_join_119: {
    forest_join_74: {
    forest_join_60: {
    forest_join_36: {
    forest_join_28: {
    forest_join_25: {
    life1_3 = (com.moon.hu.f ^ 89359063049530L);
    spill77_0 = com.moon.hq.b__ArrayString();
    ((com.moon.hu)(this)).b();
    life3_7 = spill77_0;
    spill77_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.c)).a__kV())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        forestValue77_25_0 = ((spill77_1) ? 1 : 0);
        break forest_join_25;
    }
    if (!(spill77_1)) {
        break forest_join_302;
    }
    forestValue77_25_0 = (com.moon.hv.a)[((com.moon.b3)(((com.moon.b3)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).a__kY())).getValue())))).ordinal()];
    }
    if (!((life3_7 == null))) {
        forestValue77_36_0 = forestValue77_25_0;
        break forest_join_36;
    }
    switch (forestValue77_25_0) {
case 3:
{
        break forest_join_28;
    }
case 1:
{
        break forest_join_257;
    }
default:
{
        break forest_join_302;
    }
}
    }
    moom.kZ.u();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).a__ok())).a__Void(((moom.DD)(this.b)));
    forestValue77_36_0 = ((this.e) ? 1 : 0);
    }
    if (!((life3_7 == null))) {
        forestValue77_60_0 = forestValue77_36_0;
        break forest_join_60;
    }
    if (!((forestValue77_36_0 == 0))) {
        break forest_join_74;
    }
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_22(8865, (8512247494424239132L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_23(25976, (4779265442305235918L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_24(4884, (1603982613455580577L ^ life1_3)))));
    forestValue77_60_0 = __sourceIntrinsic_b82a5b29b709_invokedynamic77_26(2394, (2281925554565429229L ^ life1_3));
    }
    org.lwjgl.opengl.GL11.glTexParameteri(((int)(forestValue77_60_0)), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_27(9568, (4195474674743286740L ^ life1_3)))), ((int)(__sourceIntrinsic_b82a5b29b709_invokedynamic77_28(31903, (9176288564329988653L ^ life1_3)))));
    this.e = ((boolean)(true));
    }
    life4_83 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TEXTURE))))).a();
    ((com.moon.hW)(life4_83)).a(((com.moon.iX)(com.moon.i7.a(((float)(0x1.0p2f)), ((float)(0x1.0p2f)), ((float)(0x1.1p6f)), ((float)(0x1.1p6f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue()))))));
    life5_102 = -1;
    life6_104 = -1;
    spill77_2 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue();
    spill77_3 = com.moon.b0.STATIC;
    if (!((life3_7 == null))) {
        forestValue77_170_0 = spill77_2;
        forestValue77_170_1 = spill77_3;
        break forest_join_170;
    }
    if (!((spill77_2 != spill77_3))) {
        break forest_join_163;
    }
    spill77_4 = (com.moon.hv.b)[((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue())))).ordinal()];
    if (!((life3_7 == null))) {
        forestValue77_132_0 = spill77_4;
        break forest_join_132;
    }
    switch (spill77_4) {
case 1:
{
        break forest_join_119;
    }
case 2:
{
        break forest_join_135;
    }
default:
{
        break forest_join_155;
    }
}
    }
    life5_102 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue();
    forestValue77_132_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).b__kX())).getValue())))).intValue();
    }
    life6_104 = forestValue77_132_0;
    if (!((life3_7 != null))) {
        break forest_join_155;
    }
    }
    life5_102 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue();
    life6_104 = ((java.awt.Color)(((java.awt.Color)(((java.awt.Color)(new java.awt.Color(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue()))).darker())).darker())).getRGB();
    }
    ((com.moon.hW)(life4_83)).a(((com.moon.jA)(com.moon.jB.a(((int)(life5_102)), ((int)(life6_104)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((boolean)(false))))));
    }
    spill77_5 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue();
    if (!((life3_7 == null))) {
        forestValue77_240_0 = spill77_5;
        break forest_join_240;
    }
    forestValue77_170_0 = spill77_5;
    forestValue77_170_1 = com.moon.b0.SYNC;
    }
    if (!((forestValue77_170_0 == forestValue77_170_1))) {
        break forest_join_236;
    }
    spill77_6 = (com.moon.hv.c)[((com.moon.bY)(((com.moon.bY)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).f__kY())).getValue())))).ordinal()];
    if (!((life3_7 == null))) {
        forestValue77_195_0 = spill77_6;
        break forest_join_195;
    }
    switch (spill77_6) {
case 1:
{
        break forest_join_182;
    }
case 2:
{
        break forest_join_198;
    }
case 3:
case 4:
{
        break forest_join_220;
    }
default:
{
        break forest_join_228;
    }
}
    }
    life5_102 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).e__kX())).getValue())))).intValue();
    forestValue77_195_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).f__kX())).getValue())))).intValue();
    }
    life6_104 = forestValue77_195_0;
    if (!((life3_7 != null))) {
        break forest_join_228;
    }
    }
    life5_102 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).e__kX())).getValue())))).intValue();
    life6_104 = ((java.awt.Color)(((java.awt.Color)(((java.awt.Color)(new java.awt.Color(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).e__kX())).getValue())))).intValue()))).darker())).darker())).getRGB();
    if (!((life3_7 != null))) {
        break forest_join_228;
    }
    }
    life5_102 = ((com.moon.hu)(this)).a(((float)(0x0.0p0f)));
    life6_104 = ((com.moon.hu)(this)).a(((float)(0x1.4p3f)));
    }
    ((com.moon.hW)(life4_83)).a(((com.moon.jA)(com.moon.jB.a(((int)(life5_102)), ((int)(life6_104)), ((float)(0x1.0p0f)), ((float)(0x0.0p0f)), ((boolean)(false))))));
    }
    forestValue77_240_0 = ((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.c)).e__kZ())).getValue();
    }
    com.moon.hU.a(((float)(((java.lang.Float)(((java.lang.Float)(forestValue77_240_0)))).floatValue())), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.c)).e__kZ())).getValue())))).floatValue())), ((float)(0x1.0p0f)));
    ((com.moon.hW)(life4_83)).b();
    com.moon.hU.a__Void();
    moom.kZ.i(((int)(0)));
    if (!((life3_7 != null))) {
        break forest_join_302;
    }
    }
    spill77_7 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.c)).b__kV())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        forestValue77_301_0 = ((spill77_7) ? 1 : 0);
        break forest_join_301;
    }
    if (!((!spill77_7))) {
        break forest_join_302;
    }
    forestValue77_301_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hu.a)).N)).a(((java.lang.String)(((java.lang.String)(((java.lang.String)(((com.moon.k5)(((com.moon.module.impl.HUD)(this.c)).a__k5())).getValue())))).replace(((java.lang.CharSequence)("&")), ((java.lang.CharSequence)("§"))))), ((float)(0x1.0p1f)), ((float)(0x1.0p1f)), ((int)(((com.moon.hu)(this)).a(((float)(0x0.0p0f)), ((com.moon.module.impl.HUD)(this.c)), ((com.moon.b0)(((com.moon.b0)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).b__kY())).getValue())))), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).a__kX())).getValue())))).intValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).b__kX())).getValue())))).intValue()))))));
    }
    recovery.source.CarrierOps.discard(forestValue77_301_0);
    }
    return;
}


public void a(com.moon.hW p0) {
return;
}


private java.lang.String[] a__ArrayString() {
moom.jL forwardValue388_19_0;
    java.lang.String[] spill388_0;
    moom.jL spill388_1;
    long life1_3;
    java.lang.String life4_10;
    java.lang.String[] life3_11;
    forward_join_21: {
    forward_join_19: {
    life1_3 = (com.moon.hu.f ^ 2604446576897L);
    spill388_0 = com.moon.hq.b__ArrayString();
    life4_10 = __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_2(3779, (7872925098808409017L ^ life1_3));
    life3_11 = spill388_0;
    spill388_1 = ((net.minecraft.client.Minecraft)(com.moon.hu.a)).a__jL();
    if (!((life3_11 == null))) {
        forwardValue388_19_0 = spill388_1;
        break forward_join_19;
    }
    if (!((spill388_1 != null))) {
        break forward_join_21;
    }
    forwardValue388_19_0 = ((net.minecraft.client.Minecraft)(com.moon.hu.a)).a__jL();
    }
    life4_10 = ((moom.jL)(forwardValue388_19_0)).b;
    }
    return new java.lang.String[] {__sourceIntrinsic_b40ddfd35a1d_invokedynamic388_8(29012, (102994700551029803L ^ life1_3)), ((java.lang.String)(__sourceIntrinsic_b40ddfd35a1d_invokedynamic388_9(10346, (6805837156312243476L ^ life1_3)))).substring(((int)(0)), ((int)(__sourceIntrinsic_b40ddfd35a1d_invokedynamic388_10(19016, (2015013811223027907L ^ life1_3))))), ((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__String(), life4_10, __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_16(net.minecraft.client.Minecraft.b(), __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_15(11165, (7616785274278338282L ^ life1_3)))};
}


public int a(float p0, double p1) {
int forestValue63_197_0;
    java.lang.String[] spill63_0;
    int spill63_1;
    int[] spill63_2;
    int[] spill63_3;
    int[] spill63_4;
    int[] spill63_5;
    int[] spill63_6;
    int[] spill63_7;
    int[] spill63_8;
    int[] spill63_9;
    int[] spill63_10;
    int[] spill63_11;
    int[] spill63_12;
    int[] spill63_13;
    long life4_3;
    int life7_6;
    long life8_8;
    java.lang.String[] life6_9;
    long life10_25;
    int[] life12_80;
    int life7_103;
    long life10_110;
    int[] life12_165;
    forest_join_198: {
    forest_join_197: {
    forest_join_191: {
    forest_join_106: {
    forest_join_21: {
    life4_3 = (com.moon.hu.f ^ 56539089666434L);
    spill63_0 = com.moon.hq.b__ArrayString();
    life7_6 = -1;
    life8_8 = java.lang.System.currentTimeMillis();
    life6_9 = spill63_0;
    spill63_1 = (com.moon.hv.c)[((com.moon.bY)(((com.moon.bY)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.c)).f__kY())).getValue())))).ordinal()];
    if (!((life6_9 == null))) {
        forestValue63_197_0 = spill63_1;
        break forest_join_197;
    }
    switch (spill63_1) {
case 3:
{
        break forest_join_21;
    }
case 4:
{
        break forest_join_106;
    }
default:
{
        break forest_join_191;
    }
}
    }
    life10_25 = ((long) (0x1.8p0d * p1));
    int[] __stackOp63_10_0 = new int[__sourceIntrinsic_fd155ad6626c_invokedynamic63_9(7420, (5461068601041897213L ^ life4_3))];
    spill63_2 = __stackOp63_10_0;
    (__stackOp63_10_0)[0] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_11(32736, (8795172913352484351L ^ life4_3));
    int[] __stackOp63_12_0 = spill63_2;
    spill63_3 = __stackOp63_12_0;
    (__stackOp63_12_0)[1] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_13(32704, (4201446884039796190L ^ life4_3));
    int[] __stackOp63_14_0 = spill63_3;
    spill63_4 = __stackOp63_14_0;
    (__stackOp63_14_0)[2] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_15(22763, (7348411175077806824L ^ life4_3));
    int[] __stackOp63_16_0 = spill63_4;
    spill63_5 = __stackOp63_16_0;
    (__stackOp63_16_0)[3] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_17(31561, (88144994956714304L ^ life4_3));
    int[] __stackOp63_18_0 = spill63_5;
    spill63_6 = __stackOp63_18_0;
    (__stackOp63_18_0)[4] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_19(15542, (5816666197645977260L ^ life4_3));
    int[] __stackOp63_20_0 = spill63_6;
    spill63_7 = __stackOp63_20_0;
    (__stackOp63_20_0)[5] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_21(9422, (1083705795248553672L ^ life4_3));
    life12_80 = spill63_7;
    life7_103 = com.moon.nD.a(((int[])(life12_80)), ((double)(((double) (((float) ((life8_8 + (((long) ((int) p0)) * __sourceIntrinsic_fd155ad6626c_invokedynamic63_22(23795, (8178327295894574931L ^ life4_3)))) % life10_25)) / (((float) life10_25) / 0x1.0p1f))))));
    if (!((life6_9 != null))) {
        break forest_join_198;
    }
    }
    life10_110 = ((long) (0x1.8p0d * p1));
    int[] __stackOp63_25_0 = new int[__sourceIntrinsic_fd155ad6626c_invokedynamic63_24(13015, (8927832989738002652L ^ life4_3))];
    spill63_8 = __stackOp63_25_0;
    (__stackOp63_25_0)[0] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_26(16771, (2911209130988051329L ^ life4_3));
    int[] __stackOp63_27_0 = spill63_8;
    spill63_9 = __stackOp63_27_0;
    (__stackOp63_27_0)[1] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_28(18165, (2234343928910879982L ^ life4_3));
    int[] __stackOp63_29_0 = spill63_9;
    spill63_10 = __stackOp63_29_0;
    (__stackOp63_29_0)[2] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_30(21730, (1707739942649073378L ^ life4_3));
    int[] __stackOp63_31_0 = spill63_10;
    spill63_11 = __stackOp63_31_0;
    (__stackOp63_31_0)[3] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_32(29954, (9066962160670289691L ^ life4_3));
    int[] __stackOp63_33_0 = spill63_11;
    spill63_12 = __stackOp63_33_0;
    (__stackOp63_33_0)[4] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_34(18472, (2511120676894642732L ^ life4_3));
    int[] __stackOp63_35_0 = spill63_12;
    spill63_13 = __stackOp63_35_0;
    (__stackOp63_35_0)[5] = __sourceIntrinsic_fd155ad6626c_invokedynamic63_36(10045, (3257809723754216762L ^ life4_3));
    life12_165 = spill63_13;
    life7_103 = com.moon.nD.a(((int[])(life12_165)), ((double)(((double) (((float) ((life8_8 + (((long) ((int) p0)) * __sourceIntrinsic_fd155ad6626c_invokedynamic63_37(28992, (3885126810231864033L ^ life4_3)))) % life10_110)) / (((float) life10_110) / 0x1.0p1f))))));
    if (!((life6_9 != null))) {
        break forest_join_198;
    }
    }
    forestValue63_197_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.c)).e__kX())).getValue())))).intValue();
    }
    return forestValue63_197_0;
    }
    return life7_103;
}


public int a(float p0) {
return ((com.moon.hu)(this)).a(((float)(p0)), ((double)(0x1.194p12d)));
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
        byte[] spill563_0 = p0;
        life4_9 += 1;
        life5_44 = (spill563_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill563_1 = p0;
        life4_9 += 1;
        life5_76 = (spill563_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill563_2 = p0;
        life4_9 += 1;
        life5_91 = (spill563_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 15441);
    if (((com.moon.hu.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hu.j)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hu.j)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hu", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hu.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hu.h)[life5_8] = com.moon.hu.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hu.h)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hu.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a3fdf9c8ffd686be_originalDynamicSite980_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_21(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fd155ad6626c_invokedynamic63_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic63_36(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fd155ad6626c_invokedynamic63_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1529_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b40ddfd35a1d_invokedynamic388_16(int a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b82a5b29b709_invokedynamic77_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a2a3c1850a33_invokedynamic391_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2e9a6a59f6f0_invokedynamic392_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral1526_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0efb0c1e576_invokedynamic78_63(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0efb0c1e576_invokedynamic78_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0efb0c1e576_invokedynamic78_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0efb0c1e576_invokedynamic78_68(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f0efb0c1e576_invokedynamic78_71(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic78_93(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral1525_0() throws E;
}
