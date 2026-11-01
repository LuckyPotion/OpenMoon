package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class hq implements com.moon.hn {

private final java.util.List<com.moon.module.Module> b;

private final java.util.List<com.moon.module.Module> c;

private final java.util.Map<com.moon.module.Module, java.lang.Integer> d;

private long e;

private com.moon.module.impl.Effects f;

private com.moon.module.impl.HUD g;

private static java.lang.String[] h;

private static final long j;

private static final java.lang.String[] k;

private static final java.lang.String[] l;

private static final java.util.Map m;

private static final long[] q;

private static final java.lang.Integer[] r;

private static final java.util.Map s;

private static final long[] w;

private static final java.lang.Long[] x;

private static final java.util.Map y;

public hq() {
super();
    this.b = new java.util.concurrent.CopyOnWriteArrayList();
    this.c = new java.util.concurrent.CopyOnWriteArrayList();
    this.d = new java.util.HashMap();
    this.e = java.lang.System.currentTimeMillis();
    this.f = null;
    this.g = null;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(3332867712647715997L)), ((long)(-1724829448753738748L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(178974374108416L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill143_7 = null;
    long local22_life8 = (com.moon.hq.j ^ 44221736621978L);
    com.moon.hq.b(((java.lang.String[])(__sourceSpill143_7)));
    javax.crypto.Cipher local24_life11;
    javax.crypto.Cipher __sourceSpill143_13 = (local24_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill143_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill143_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill143_16 = new byte[8];
    (__sourceSpill143_16)[0] = ((byte) ((int) (local22_life8 >>> 56)));
    int local25_life17 = 1;
    while ((local25_life17 < 8)) {
        (__sourceSpill143_16)[local25_life17] = ((byte) ((int) ((local22_life8 << (local25_life17 * 8)) >>> 56)));
        local25_life17 += 1;
    }
    byte[] __sourcePreallocation143_18 = __sourceSpill143_16;
    ((javax.crypto.Cipher)(__sourceSpill143_13)).init(((int)(__sourceSpill143_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill143_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation143_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life21 = new java.lang.String[5];
    int local29_life22 = 0;
    java.lang.String local28_life23;
    int local30_life25 = ((java.lang.String)((local28_life23 = "Òú\bfw4r5V\023· #¶õCÚ¯\024\016ð\003ôþ8ÇKtÅÔ& ø«(Û¼ë|ýRüwÐÇPvN:\037¡ý\017Ê2Ji±\030í½R1<<ÍëÂÜ\020²×ièF=Gu§ZÆ* "))).length();
    int local27_life26 = 40;
    int local26_life27 = -1;
    while (true) {
        local26_life27 += 1;
        byte[] __sourceSpill143_30 = ((java.lang.String)(((java.lang.String)(local28_life23)).substring(((int)(local26_life27)), ((int)((local26_life27 + local27_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill143_31 = local24_life11;
        byte[] local32_life33 = ((javax.crypto.Cipher)(__sourceSpill143_31)).doFinal(((byte[])(__sourceSpill143_30)));
        java.lang.String __sourceSpill143_36 = ((java.lang.String)(com.moon.hq.a(((byte[])(local32_life33))))).intern();
        java.lang.String[] __sourceSpill143_37 = local31_life21;
        int __sourceSpill143_38 = local29_life22;
        local29_life22 += 1;
        (__sourceSpill143_37)[__sourceSpill143_38] = __sourceSpill143_36;
        if (!(((local26_life27 = (local26_life27 + local27_life26)) < local30_life25))) { break; }
        local27_life26 = ((java.lang.String)(local28_life23)).charAt(((int)(local26_life27)));
    }
    local30_life25 = ((java.lang.String)((local28_life23 = "Q®ÁÕÿ®$É'5\036Uá\020j\f\032\033.²/k|µøDÙwÜ"))).length();
    local27_life26 = 16;
    local26_life27 = -1;
    while (true) {
        local26_life27 += 1;
        byte[] __sourceSpill143_43 = ((java.lang.String)(((java.lang.String)(local28_life23)).substring(((int)(local26_life27)), ((int)((local26_life27 + local27_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill143_44 = local24_life11;
        byte[] local32_life46 = ((javax.crypto.Cipher)(__sourceSpill143_44)).doFinal(((byte[])(__sourceSpill143_43)));
        java.lang.String __sourceSpill143_49 = ((java.lang.String)(com.moon.hq.a(((byte[])(local32_life46))))).intern();
        java.lang.String[] __sourceSpill143_50 = local31_life21;
        int __sourceSpill143_51 = local29_life22;
        local29_life22 += 1;
        (__sourceSpill143_50)[__sourceSpill143_51] = __sourceSpill143_49;
        if (!(((local26_life27 = (local26_life27 + local27_life26)) < local30_life25))) { break; }
        local27_life26 = ((java.lang.String)(local28_life23)).charAt(((int)(local26_life27)));
    }
    k = ((java.lang.String[])(local31_life21));
    l = ((java.lang.String[])(new java.lang.String[5]));
    s = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life57;
    javax.crypto.Cipher __sourceSpill143_59 = (local11_life57 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill143_60 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill143_61 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill143_62 = new byte[8];
    (__sourceSpill143_62)[0] = ((byte) ((int) (local22_life8 >>> 56)));
    int local12_life63 = 1;
    while ((local12_life63 < 8)) {
        (__sourceSpill143_62)[local12_life63] = ((byte) ((int) ((local22_life8 << (local12_life63 * 8)) >>> 56)));
        local12_life63 += 1;
    }
    byte[] __sourcePreallocation143_64 = __sourceSpill143_62;
    ((javax.crypto.Cipher)(__sourceSpill143_59)).init(((int)(__sourceSpill143_60)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill143_61)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation143_64)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life67 = new long[17];
    int local14_life68 = 0;
    java.lang.String local15_life69;
    int local16_life71 = ((java.lang.String)((local15_life69 = "ÿO\021M0FÔ4bÂ|ÊÈâ!\\?å©OÖ\037ÎiUÌ_\025_\032ô¥\b ^è\177\001\024$jÿÛò3HÛ\037ûÍ>³\025\003k\032Ñ@<òÿ¡º)¨\n\032S0\004ÆééúéØÞñ(«#P»a\025÷ ¬\0006q\b FøDD¿\021xGM="))).length();
    int local13_life72 = 0;
    do {
        java.lang.String __sourceSpill143_73 = local15_life69;
        int __sourceSpill143_74 = local13_life72;
        local13_life72 += 8;
        byte[] local18_life77 = ((java.lang.String)(((java.lang.String)(__sourceSpill143_73)).substring(((int)(__sourceSpill143_74)), ((int)(local13_life72))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill143_78 = local17_life67;
        int __sourceSpill143_79 = local14_life68;
        local14_life68 += 1;
        long local19_life80 = (((((((((((long) (local18_life77)[0]) & 255L) << 56) | ((((long) (local18_life77)[1]) & 255L) << 48)) | ((((long) (local18_life77)[2]) & 255L) << 40)) | ((((long) (local18_life77)[3]) & 255L) << 32)) | ((((long) (local18_life77)[4]) & 255L) << 24)) | ((((long) (local18_life77)[5]) & 255L) << 16)) | ((((long) (local18_life77)[6]) & 255L) << 8)) | (((long) (local18_life77)[7]) & 255L));
        byte[] __sourceSpill143_81 = new byte[8];
        (__sourceSpill143_81)[0] = ((byte) ((int) (local19_life80 >>> 56)));
        (__sourceSpill143_81)[1] = ((byte) ((int) (local19_life80 >>> 48)));
        (__sourceSpill143_81)[2] = ((byte) ((int) (local19_life80 >>> 40)));
        (__sourceSpill143_81)[3] = ((byte) ((int) (local19_life80 >>> 32)));
        (__sourceSpill143_81)[4] = ((byte) ((int) (local19_life80 >>> 24)));
        (__sourceSpill143_81)[5] = ((byte) ((int) (local19_life80 >>> 16)));
        (__sourceSpill143_81)[6] = ((byte) ((int) (local19_life80 >>> 8)));
        (__sourceSpill143_81)[7] = ((byte) ((int) local19_life80));
        javax.crypto.Cipher __sourceSpill143_82 = local11_life57;
        byte[] local21_life84 = ((javax.crypto.Cipher)(__sourceSpill143_82)).doFinal(((byte[])(__sourceSpill143_81)));
        (__sourceSpill143_78)[__sourceSpill143_79] = (((((((((((long) (local21_life84)[0]) & 255L) << 56) | ((((long) (local21_life84)[1]) & 255L) << 48)) | ((((long) (local21_life84)[2]) & 255L) << 40)) | ((((long) (local21_life84)[3]) & 255L) << 32)) | ((((long) (local21_life84)[4]) & 255L) << 24)) | ((((long) (local21_life84)[5]) & 255L) << 16)) | ((((long) (local21_life84)[6]) & 255L) << 8)) | (((long) (local21_life84)[7]) & 255L));
    } while ((!(local13_life72 >= local16_life71)));
    local16_life71 = ((java.lang.String)((local15_life69 = "o\000¶Ù<\\j¶Ì`Â"))).length();
    local13_life72 = 0;
    do {
        java.lang.String __sourceSpill143_86 = local15_life69;
        int __sourceSpill143_87 = local13_life72;
        local13_life72 += 8;
        byte[] local18_life90 = ((java.lang.String)(((java.lang.String)(__sourceSpill143_86)).substring(((int)(__sourceSpill143_87)), ((int)(local13_life72))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill143_91 = local17_life67;
        int __sourceSpill143_92 = local14_life68;
        local14_life68 += 1;
        long local19_life93 = (((((((((((long) (local18_life90)[0]) & 255L) << 56) | ((((long) (local18_life90)[1]) & 255L) << 48)) | ((((long) (local18_life90)[2]) & 255L) << 40)) | ((((long) (local18_life90)[3]) & 255L) << 32)) | ((((long) (local18_life90)[4]) & 255L) << 24)) | ((((long) (local18_life90)[5]) & 255L) << 16)) | ((((long) (local18_life90)[6]) & 255L) << 8)) | (((long) (local18_life90)[7]) & 255L));
        byte[] __sourceSpill143_94 = new byte[8];
        (__sourceSpill143_94)[0] = ((byte) ((int) (local19_life93 >>> 56)));
        (__sourceSpill143_94)[1] = ((byte) ((int) (local19_life93 >>> 48)));
        (__sourceSpill143_94)[2] = ((byte) ((int) (local19_life93 >>> 40)));
        (__sourceSpill143_94)[3] = ((byte) ((int) (local19_life93 >>> 32)));
        (__sourceSpill143_94)[4] = ((byte) ((int) (local19_life93 >>> 24)));
        (__sourceSpill143_94)[5] = ((byte) ((int) (local19_life93 >>> 16)));
        (__sourceSpill143_94)[6] = ((byte) ((int) (local19_life93 >>> 8)));
        (__sourceSpill143_94)[7] = ((byte) ((int) local19_life93));
        javax.crypto.Cipher __sourceSpill143_95 = local11_life57;
        byte[] local21_life97 = ((javax.crypto.Cipher)(__sourceSpill143_95)).doFinal(((byte[])(__sourceSpill143_94)));
        (__sourceSpill143_91)[__sourceSpill143_92] = (((((((((((long) (local21_life97)[0]) & 255L) << 56) | ((((long) (local21_life97)[1]) & 255L) << 48)) | ((((long) (local21_life97)[2]) & 255L) << 40)) | ((((long) (local21_life97)[3]) & 255L) << 32)) | ((((long) (local21_life97)[4]) & 255L) << 24)) | ((((long) (local21_life97)[5]) & 255L) << 16)) | ((((long) (local21_life97)[6]) & 255L) << 8)) | (((long) (local21_life97)[7]) & 255L));
    } while ((!(local13_life72 >= local16_life71)));
    q = ((long[])(local17_life67));
    r = ((java.lang.Integer[])(new java.lang.Integer[17]));
    y = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life102;
    javax.crypto.Cipher __sourceSpill143_104 = (local0_life102 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill143_105 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill143_106 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill143_107 = new byte[8];
    (__sourceSpill143_107)[0] = ((byte) ((int) (local22_life8 >>> 56)));
    int local1_life108 = 1;
    while ((local1_life108 < 8)) {
        (__sourceSpill143_107)[local1_life108] = ((byte) ((int) ((local22_life8 << (local1_life108 * 8)) >>> 56)));
        local1_life108 += 1;
    }
    byte[] __sourcePreallocation143_109 = __sourceSpill143_107;
    ((javax.crypto.Cipher)(__sourceSpill143_104)).init(((int)(__sourceSpill143_105)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill143_106)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation143_109)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life112 = new long[3];
    int local3_life113 = 0;
    java.lang.String local4_life114;
    int local5_life116 = ((java.lang.String)((local4_life114 = "]N´lb÷pä9l±\03175L¶`aVäó²"))).length();
    int local2_life117 = 0;
    do {
        java.lang.String __sourceSpill143_118 = local4_life114;
        int __sourceSpill143_119 = local2_life117;
        local2_life117 += 8;
        byte[] local7_life122 = ((java.lang.String)(((java.lang.String)(__sourceSpill143_118)).substring(((int)(__sourceSpill143_119)), ((int)(local2_life117))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill143_123 = local6_life112;
        int __sourceSpill143_124 = local3_life113;
        local3_life113 += 1;
        long local8_life125 = (((((((((((long) (local7_life122)[0]) & 255L) << 56) | ((((long) (local7_life122)[1]) & 255L) << 48)) | ((((long) (local7_life122)[2]) & 255L) << 40)) | ((((long) (local7_life122)[3]) & 255L) << 32)) | ((((long) (local7_life122)[4]) & 255L) << 24)) | ((((long) (local7_life122)[5]) & 255L) << 16)) | ((((long) (local7_life122)[6]) & 255L) << 8)) | (((long) (local7_life122)[7]) & 255L));
        byte[] __sourceSpill143_126 = new byte[8];
        (__sourceSpill143_126)[0] = ((byte) ((int) (local8_life125 >>> 56)));
        (__sourceSpill143_126)[1] = ((byte) ((int) (local8_life125 >>> 48)));
        (__sourceSpill143_126)[2] = ((byte) ((int) (local8_life125 >>> 40)));
        (__sourceSpill143_126)[3] = ((byte) ((int) (local8_life125 >>> 32)));
        (__sourceSpill143_126)[4] = ((byte) ((int) (local8_life125 >>> 24)));
        (__sourceSpill143_126)[5] = ((byte) ((int) (local8_life125 >>> 16)));
        (__sourceSpill143_126)[6] = ((byte) ((int) (local8_life125 >>> 8)));
        (__sourceSpill143_126)[7] = ((byte) ((int) local8_life125));
        javax.crypto.Cipher __sourceSpill143_127 = local0_life102;
        byte[] local10_life129 = ((javax.crypto.Cipher)(__sourceSpill143_127)).doFinal(((byte[])(__sourceSpill143_126)));
        (__sourceSpill143_123)[__sourceSpill143_124] = (((((((((((long) (local10_life129)[0]) & 255L) << 56) | ((((long) (local10_life129)[1]) & 255L) << 48)) | ((((long) (local10_life129)[2]) & 255L) << 40)) | ((((long) (local10_life129)[3]) & 255L) << 32)) | ((((long) (local10_life129)[4]) & 255L) << 24)) | ((((long) (local10_life129)[5]) & 255L) << 16)) | ((((long) (local10_life129)[6]) & 255L) << 8)) | (((long) (local10_life129)[7]) & 255L));
    } while ((!(local2_life117 >= local5_life116)));
    w = ((long[])(local6_life112));
    x = ((java.lang.Long[])(new java.lang.Long[3]));
}


public java.util.List<com.moon.module.Module> b() {
return this.c;
}


private java.lang.String b(com.moon.module.Module p0) {
return ((java.lang.String)(((java.util.function.Function)(((com.moon.bZ)(((com.moon.bZ)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).e__kY())).getValue())))).a__Function())).apply(((java.lang.Object)(((com.moon.module.Module)(p0)).getDisplayText())))));
}


public int b(float p0, double p1) {
int forestValue58_190_0;
    java.lang.String[] spill58_0;
    int spill58_1;
    int spill58_2;
    int[] spill58_3;
    int[] spill58_4;
    int[] spill58_5;
    int[] spill58_6;
    int[] spill58_7;
    int[] spill58_8;
    int[] spill58_9;
    int[] spill58_10;
    int[] spill58_11;
    int[] spill58_12;
    int[] spill58_13;
    int[] spill58_14;
    int[] spill58_15;
    int[] spill58_16;
    long life4_3;
    int life7_6;
    java.lang.String[] life6_7;
    long life8_9;
    int life10_16;
    int life11_23;
    long life12_39;
    int life14_48;
    int[] life15_86;
    int life7_109;
    long life12_120;
    int[] life14_159;
    forest_join_191: {
    forest_join_190: {
    forest_join_184: {
    forest_join_115: {
    forest_join_35: {
    life4_3 = (com.moon.hq.j ^ 56698136521412L);
    spill58_0 = com.moon.hq.b__ArrayString();
    life7_6 = -1;
    life6_7 = spill58_0;
    life8_9 = java.lang.System.currentTimeMillis();
    life10_16 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.g)).h__kX())).getValue())))).intValue();
    life11_23 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.g)).i__kX())).getValue())))).intValue();
    spill58_1 = (com.moon.hr.c)[((com.moon.b1)(((com.moon.b1)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).h__kY())).getValue())))).ordinal()];
    if (!((life6_7 == null))) {
        forestValue58_190_0 = spill58_1;
        break forest_join_190;
    }
    switch (spill58_1) {
case 1:
{
        break forest_join_35;
    }
case 2:
{
        break forest_join_115;
    }
default:
{
        break forest_join_184;
    }
}
    }
    life12_39 = ((long) (0x1.8p0d * p1));
    spill58_2 = 21572;
    life14_48 = ((java.awt.Color)(((java.awt.Color)(((java.awt.Color)(new java.awt.Color(life10_16))).darker())).darker())).getRGB();
    int[] __stackOp58_23_0 = new int[__sourceIntrinsic_00fff17ad487_invokedynamic58_22(spill58_2, (6859951067938255862L ^ life4_3))];
    spill58_3 = __stackOp58_23_0;
    (__stackOp58_23_0)[0] = life10_16;
    int[] __stackOp58_24_0 = spill58_3;
    spill58_4 = __stackOp58_24_0;
    (__stackOp58_24_0)[1] = life14_48;
    int[] __stackOp58_25_0 = spill58_4;
    spill58_5 = __stackOp58_25_0;
    (__stackOp58_25_0)[2] = life10_16;
    int[] __stackOp58_26_0 = spill58_5;
    spill58_6 = __stackOp58_26_0;
    (__stackOp58_26_0)[3] = life14_48;
    int[] __stackOp58_27_0 = spill58_6;
    spill58_7 = __stackOp58_27_0;
    (__stackOp58_27_0)[4] = life10_16;
    int[] __stackOp58_28_0 = spill58_7;
    spill58_8 = __stackOp58_28_0;
    (__stackOp58_28_0)[5] = life14_48;
    int[] __stackOp58_29_0 = spill58_8;
    spill58_9 = __stackOp58_29_0;
    (__stackOp58_29_0)[__sourceIntrinsic_00fff17ad487_invokedynamic58_30(14769, (1951264390267379208L ^ life4_3))] = life10_16;
    life15_86 = spill58_9;
    life7_109 = com.moon.nD.a(((int[])(life15_86)), ((double)(((double) (((float) ((life8_9 + (((long) ((int) p0)) * __sourceIntrinsic_00fff17ad487_invokedynamic58_31(4685, (3603955905752553975L ^ life4_3)))) % life12_39)) / (((float) life12_39) / 0x1.0p1f))))));
    if (!((life6_7 != null))) {
        break forest_join_191;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    life12_120 = ((long) (0x1.8p0d * p1));
    int[] __stackOp58_35_0 = new int[__sourceIntrinsic_00fff17ad487_invokedynamic58_34(12877, (6793151531634267645L ^ life4_3))];
    spill58_10 = __stackOp58_35_0;
    (__stackOp58_35_0)[0] = life10_16;
    int[] __stackOp58_36_0 = spill58_10;
    spill58_11 = __stackOp58_36_0;
    (__stackOp58_36_0)[1] = life11_23;
    int[] __stackOp58_37_0 = spill58_11;
    spill58_12 = __stackOp58_37_0;
    (__stackOp58_37_0)[2] = life10_16;
    int[] __stackOp58_38_0 = spill58_12;
    spill58_13 = __stackOp58_38_0;
    (__stackOp58_38_0)[3] = life11_23;
    int[] __stackOp58_39_0 = spill58_13;
    spill58_14 = __stackOp58_39_0;
    (__stackOp58_39_0)[4] = life10_16;
    int[] __stackOp58_40_0 = spill58_14;
    spill58_15 = __stackOp58_40_0;
    (__stackOp58_40_0)[5] = life11_23;
    int[] __stackOp58_41_0 = spill58_15;
    spill58_16 = __stackOp58_41_0;
    (__stackOp58_41_0)[__sourceIntrinsic_00fff17ad487_invokedynamic58_42(11932, (4078376987976927524L ^ life4_3))] = life10_16;
    life14_159 = spill58_16;
    life7_109 = com.moon.nD.a(((int[])(life14_159)), ((double)(((double) (((float) ((life8_9 + (((long) ((int) p0)) * __sourceIntrinsic_00fff17ad487_invokedynamic58_43(8975, (4033258327583549620L ^ life4_3)))) % life12_120)) / (((float) life12_120) / 0x1.0p1f))))));
    if (!((life6_7 != null))) {
        break forest_join_191;
    }
    }
    forestValue58_190_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.g)).e__kX())).getValue())))).intValue();
    }
    return forestValue58_190_0;
    }
    return life7_109;
}


public int b(float p0) {
return this.b(((float)(p0)), ((double)(0x1.194p12d)));
}


public static void b(java.lang.String[] p0) {
com.moon.hq.h = ((java.lang.String[])(p0));
    return;
}


public static java.lang.String[] b__ArrayString() {
return com.moon.hq.h;
}


private static moom.Oo b(moom.Oo p0) {
return p0;
}


public void b(com.moon.hW p0) {
int forwardValue369_28_0;
    java.lang.String[] spill369_0;
    boolean spill369_1;
    long life2_3;
    java.lang.String[] life4_7;
    com.moon.gW life5_35;
    forward_join_40: {
    forward_join_28: {
    forward_join_18: {
    life2_3 = (com.moon.hq.j ^ 48105715169399L);
    spill369_0 = com.moon.hq.b__ArrayString();
    this.c();
    life4_7 = spill369_0;
    spill369_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).p())).getValue())))).booleanValue();
    if (!((life4_7 == null))) {
        forwardValue369_28_0 = ((spill369_1) ? 1 : 0);
        break forward_join_28;
    }
    if (!((!spill369_1))) {
        break forward_join_18;
    }
    return;
    }
    forwardValue369_28_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.e))), ((long)(__sourceIntrinsic_a2a3c1850a33_invokedynamic369_11(1181, (7230975049854967191L ^ life2_3)))));
    }
    if (!((forwardValue369_28_0 < 0))) {
        break forward_join_40;
    }
    life5_35 = ((com.moon.module.impl.Effects)(this.f)).a__gW();
    ((com.moon.gW)(life5_35)).c();
    ((com.moon.module.impl.HUD)(this.g)).a(((boolean)(true)));
    }
    ((com.moon.hq)(this)).a(((com.moon.hW)(p0)), ((boolean)(false)));
    return;
}


private void b__Void() {
((java.util.List)(this.b)).sort(((java.util.Comparator)(java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction)(__sourceIntrinsic_9bf881b104f5_originalDynamicSite400_1(this)))))));
    ((com.moon.module.impl.HUD)(this.g)).a(((boolean)(true)));
    return;
}


private static java.lang.invoke.CallSite e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral1482_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27423);
    if (((com.moon.hq.x)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.hq.w)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.hq.y)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hq.y)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/hq", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.hq.x)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.hq.x)[life3_8])).longValue();
}


private static long e(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.hq.e(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void c(com.moon.hW p0) {
com.moon.hq forwardValue371_19_0;
    java.lang.String[] spill371_0;
    com.moon.hq spill371_1;
    long life2_3;
    java.lang.String[] life4_7;
    forward_join_19: {
    forward_join_18: {
    life2_3 = (com.moon.hq.j ^ 60125946690664L);
    spill371_0 = com.moon.hq.b__ArrayString();
    this.c();
    life4_7 = spill371_0;
    spill371_1 = this;
    if (!((life4_7 == null))) {
        forwardValue371_19_0 = spill371_1;
        break forward_join_19;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(((com.moon.hq)(spill371_1)).g)).p())).getValue())))).booleanValue()))) {
        break forward_join_18;
    }
    return;
    }
    forwardValue371_19_0 = this;
    }
    ((com.moon.hq)(forwardValue371_19_0)).a(((com.moon.hW)(p0)), ((boolean)(true)));
    return;
}


private void c() {
com.moon.hq forwardValue370_19_0;
    com.moon.hq forwardValue370_24_0;
    com.moon.hq spill370_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_30: {
    forward_join_24: {
    forward_join_19: {
    forward_join_18: {
    life1_3 = (com.moon.hq.j ^ 98902574527753L);
    life3_5 = com.moon.hq.b__ArrayString();
    spill370_0 = this;
    if (!((life3_5 == null))) {
        forwardValue370_19_0 = spill370_0;
        break forward_join_19;
    }
    if (!((((com.moon.hq)(spill370_0)).f == null))) {
        break forward_join_18;
    }
    this.f = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    forwardValue370_19_0 = this;
    }
    if (!((life3_5 == null))) {
        forwardValue370_24_0 = forwardValue370_19_0;
        break forward_join_24;
    }
    if (!((((com.moon.hq)(forwardValue370_19_0)).g == null))) {
        break forward_join_30;
    }
    forwardValue370_24_0 = this;
    }
    ((com.moon.hq)(forwardValue370_24_0)).g = ((com.moon.module.impl.HUD)(((com.moon.module.impl.HUD)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.HUD.class)))))));
    }
    return;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral1486_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 1816;
      if (r[var3] == null) {
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
         long var5 = q[var3];
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
         Object[] var9 = (Object[])s.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               s.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/hq", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         r[var3] = var15;
      }

      return r[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.hq.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void d(com.moon.hW p0) {
int forestValue76_26_0;
    java.lang.Object forestValue76_34_0;
    java.lang.Object forestValue76_65_0;
    float forestValue76_70_0;
    com.moon.hq forestValue76_158_0;
    int forestValue76_168_0;
    int forestValue76_277_0;
    java.lang.Object forestValue76_336_0;
    java.lang.String[] spill76_0;
    boolean spill76_1;
    java.lang.Boolean spill76_2;
    java.lang.Boolean spill76_3;
    com.moon.hq spill76_4;
    java.lang.Object spill76_5;
    boolean spill76_6;
    java.lang.Object spill76_7;
    long life2_3;
    java.lang.String[] life4_7;
    com.moon.jm life5_42;
    moom.ir life6_44;
    float life7_56;
    int life8_58;
    float life9_83;
    java.util.Iterator life10_87;
    com.moon.module.Module life11_96;
    int life12_103;
    float life13_124;
    float life14_141;
    java.lang.String life15_145;
    int life16_159;
    int life17_190;
    java.lang.String life18_194;
    java.util.Iterator life10_356;
    com.moon.module.Module life11_366;
    com.moon.module.Module life11_379;
    forest_join_357: {
    forest_join_354: {
    forest_join_336: {
    forest_join_313: {
    forest_join_70: {
    forest_join_69: {
    forest_join_65: {
    forest_join_34: {
    forest_join_26: {
    forest_join_18: {
    life2_3 = (com.moon.hq.j ^ 96681540025083L);
    spill76_0 = com.moon.hq.b__ArrayString();
    this.c();
    life4_7 = spill76_0;
    spill76_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).p())).getValue())))).booleanValue();
    if (!((life4_7 == null))) {
        forestValue76_26_0 = ((spill76_1) ? 1 : 0);
        break forest_join_26;
    }
    if (!((!spill76_1))) {
        break forest_join_18;
    }
    return;
    }
    spill76_2 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).q())).getValue()));
    if (!((life4_7 == null))) {
        forestValue76_34_0 = spill76_2;
        break forest_join_34;
    }
    forestValue76_26_0 = ((((java.lang.Boolean)(spill76_2)).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue76_26_0 != 0))) {
        break forest_join_357;
    }
    forestValue76_34_0 = ((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).i__kY())).getValue())))).a__Supplier())).get();
    }
    life5_42 = ((com.moon.jm)(forestValue76_34_0));
    life6_44 = com.moon.nS.a();
    ((moom.ir)(life6_44)).a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).e__kZ())).getValue())))).floatValue()))));
    life7_56 = 0x0.0p0f;
    life8_58 = 0;
    spill76_3 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).v())).getValue()));
    if (!((life4_7 == null))) {
        forestValue76_65_0 = spill76_3;
        break forest_join_65;
    }
    if (!(((java.lang.Boolean)(spill76_3)).booleanValue())) {
        break forest_join_69;
    }
    forestValue76_65_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).g__kY())).getValue();
    }
    if (!((forestValue76_65_0 == com.moon.b2.RIGHT))) {
        break forest_join_69;
    }
    forestValue76_70_0 = 0x1.0p0f;
    break forest_join_70;
    }
    forestValue76_70_0 = 0x0.0p0f;
    }
    life9_83 = forestValue76_70_0;
    life10_87 = ((java.util.List)(this.b)).iterator();
    forest_cycle_75: while (true) {
    forest_join_311: {
    forest_join_305: {
    forest_join_277: {
    forest_join_233: {
    forest_join_168: {
    forest_join_158: {
    forest_join_157: {
    if (!(((java.util.Iterator)(life10_87)).hasNext())) {
        break forest_join_313;
    }
    life11_96 = ((com.moon.module.Module)(((java.util.Iterator)(life10_87)).next()));
    life12_103 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).d__k1())).getValue())))).intValue();
    life13_124 = (((((((float) ((moom.ir)(life6_44)).a__Int()) - ((com.moon.module.Module)(life11_96)).a__Float()) - ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue()) - life9_83) - ((float) life12_103)) + 0x1.0p-1f);
    life14_141 = (((life7_56 + ((float) life12_103)) + (((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).e__k1())).getValue())))).intValue()) / 0x1.0p1f)) - 0x1.0p-1f);
    life15_145 = ((com.moon.hq)(this)).a(((com.moon.module.Module)(life11_96)));
    ((java.util.Map)(this.d)).computeIfAbsent(((java.lang.Object)(life11_96)), ((java.util.function.Function)(__sourceIntrinsic_f0efb0c1e576_invokedynamic76_62(life11_96))));
    life16_159 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(this.d)).get(((java.lang.Object)(life11_96))))))).intValue();
    spill76_4 = this;
    if (!((life4_7 == null))) {
        forestValue76_158_0 = spill76_4;
        break forest_join_158;
    }
    spill76_5 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(((com.moon.hq)(spill76_4)).g)).f__kY())).getValue();
    if (!((life4_7 == null))) {
        forestValue76_336_0 = spill76_5;
        break forest_join_336;
    }
    if (!((spill76_5 == com.moon.bY.INDIVIDUAL))) {
        break forest_join_157;
    }
    forestValue76_168_0 = life16_159;
    break forest_join_168;
    }
    forestValue76_158_0 = this;
    }
    forestValue76_168_0 = ((com.moon.hq)(forestValue76_158_0)).a__Int(((float)((((float) life8_58) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).a__kZ())).getValue())))).floatValue()))));
    }
    life17_190 = forestValue76_168_0;
    life18_194 = this.b(((com.moon.module.Module)(life11_96)));
    spill76_6 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).r())).getValue())))).booleanValue();
    if (!((life4_7 == null))) {
        forestValue76_277_0 = ((spill76_6) ? 1 : 0);
        break forest_join_277;
    }
    if (!((!spill76_6))) {
        break forest_join_233;
    }
    ((com.moon.jm)(life5_42)).a(((com.moon.hW)(p0)), ((java.lang.String)(life18_194)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())), ((float)(life13_124)), ((float)((life14_141 + 0x1.0p-1f))), ((int)(life17_190)), ((boolean)(true)));
    if (!((life4_7 == null))) {
        break forest_join_311;
    }
    if (!((!((java.lang.String)(life15_145)).isEmpty()))) {
        break forest_join_305;
    }
    ((com.moon.jm)(life5_42)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).e())), ((java.lang.String)(life15_145)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())), ((float)((life13_124 + ((com.moon.jm)(life5_42)).a(((java.lang.String)(life18_194)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())))))), ((float)((life14_141 + 0x1.0p-1f))), ((int)(-1)), ((boolean)(true)));
    if (!((life4_7 != null))) {
        break forest_join_305;
    }
    }
    ((com.moon.jm)(life5_42)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).e())), ((java.lang.String)(life18_194)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())), ((float)((life13_124 + 0x1.0p-1f))), ((float)((life14_141 + 0x1.0p0f))), ((int)(__sourceIntrinsic_f0efb0c1e576_invokedynamic76_113(703, (1657098747519743292L ^ life2_3)))), ((boolean)(false)));
    ((com.moon.jm)(life5_42)).a(((com.moon.hW)(p0)), ((java.lang.String)(life18_194)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())), ((float)(life13_124)), ((float)((life14_141 + 0x1.0p-1f))), ((int)(life17_190)), ((boolean)(false)));
    if (!((life4_7 == null))) {
        break forest_join_311;
    }
    forestValue76_277_0 = ((((java.lang.String)(life15_145)).isEmpty()) ? 1 : 0);
    }
    if (!((forestValue76_277_0 == 0))) {
        break forest_join_305;
    }
    ((com.moon.jm)(life5_42)).a(((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).e())), ((java.lang.String)(life15_145)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())), ((float)((life13_124 + ((com.moon.jm)(life5_42)).a(((java.lang.String)(life18_194)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())))))), ((float)((life14_141 + 0x1.0p-1f))), ((int)(-1)));
    }
    life7_56 = (life7_56 + ((com.moon.module.Module)(life11_96)).b__Float());
    life8_58 += 1;
    }
    if (!((life4_7 != null))) {
        continue forest_cycle_75;
    }
    break forest_cycle_75;
    }
    }
    ((moom.ir)(life6_44)).a__Void();
    life10_356 = ((java.util.List)(this.c)).iterator();
    forest_cycle_319: while (true) {
    if (!(((java.util.Iterator)(life10_356)).hasNext())) {
        break forest_join_354;
    }
    life11_366 = ((com.moon.module.Module)(((java.util.Iterator)(life10_356)).next()));
    ((java.util.List)(this.b)).remove(((java.lang.Object)(life11_366)));
    if (!((life4_7 == null))) {
        break forest_join_357;
    }
    if (!((life4_7 != null))) {
        continue forest_cycle_319;
    }
    break forest_cycle_319;
    }
    break forest_join_354;
    }
    forest_cycle_336: while (true) {
    forest_join_348: {
    life11_379 = ((com.moon.module.Module)(forestValue76_336_0));
    ((java.util.List)(this.b)).remove(((java.lang.Object)(life11_379)));
    if (!((life4_7 == null))) {
        break forest_join_357;
    }
    if (!((life4_7 != null))) {
        break forest_join_348;
    }
    break forest_join_354;
    }
    if (!(((java.util.Iterator)(life10_87)).hasNext())) {
        break forest_join_354;
    }
    spill76_7 = ((java.util.Iterator)(life10_87)).next();
    forestValue76_336_0 = spill76_7;
    continue forest_cycle_336;
    }
    }
    ((java.util.List)(this.c)).clear();
    }
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.hq.a(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 17107);
    if (((com.moon.hq.l)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.hq.m)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.hq.m)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/hq", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.hq.k)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.hq.l)[life5_8] = com.moon.hq.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.hq.l)[life5_8];
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
        byte[] spill539_0 = p0;
        life4_9 += 1;
        life5_44 = (spill539_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill539_1 = p0;
        life4_9 += 1;
        life5_76 = (spill539_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill539_2 = p0;
        life4_9 += 1;
        life5_91 = (spill539_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void a(com.moon.event.CategoryEvent p0) {
int lexicalValue73_29_0;
    int lexicalValue73_34_0;
    int lexicalValue73_38_0;
    int lexicalValue73_40_0;
    int lexicalValue73_56_0;
    java.lang.String[] spill73_0;
    boolean spill73_1;
    int spill73_2;
    long life2_3;
    java.util.List life5_10;
    java.lang.String[] life4_11;
    java.util.Iterator life6_14;
    com.moon.module.Module life7_21;
    int life8_55;
    lexical_join_63: {
    life2_3 = (com.moon.hq.j ^ 67711681107953L);
    spill73_0 = com.moon.hq.b__ArrayString();
    life5_10 = ((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((com.moon.module.ModuleCategory)(((com.moon.event.CategoryEvent)(p0)).getCategory())));
    life4_11 = spill73_0;
    life6_14 = ((java.util.List)(life5_10)).iterator();
    lexical_cycle_15: while (true) {
    lexical_join_61: {
    lexical_join_56: {
    lexical_join_52: {
    lexical_join_40: {
    lexical_join_39: {
    lexical_join_38: {
    lexical_join_34: {
    lexical_join_29: {
    if (!(((java.util.Iterator)(life6_14)).hasNext())) {
        break lexical_join_63;
    }
    life7_21 = ((com.moon.module.Module)(((java.util.Iterator)(life6_14)).next()));
    spill73_1 = ((com.moon.module.Module)(life7_21)).isEnabled();
    if (!((life4_11 == null))) {
        lexicalValue73_29_0 = ((spill73_1) ? 1 : 0);
        break lexical_join_29;
    }
    if (!(spill73_1)) {
        break lexical_join_61;
    }
    lexicalValue73_29_0 = ((((com.moon.module.Module)(life7_21)).isHidden()) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        lexicalValue73_34_0 = lexicalValue73_29_0;
        break lexical_join_34;
    }
    if (!((lexicalValue73_29_0 == 0))) {
        break lexical_join_61;
    }
    lexicalValue73_34_0 = ((((com.moon.event.CategoryEvent)(p0)).a()) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        lexicalValue73_38_0 = lexicalValue73_34_0;
        break lexical_join_38;
    }
    if (!((lexicalValue73_34_0 == 0))) {
        break lexical_join_39;
    }
    lexicalValue73_38_0 = 1;
    }
    lexicalValue73_40_0 = lexicalValue73_38_0;
    break lexical_join_40;
    }
    lexicalValue73_40_0 = 0;
    }
    life8_55 = lexicalValue73_40_0;
    spill73_2 = life8_55;
    if (!((life4_11 == null))) {
        lexicalValue73_56_0 = spill73_2;
        break lexical_join_56;
    }
    if (!((spill73_2 != 0))) {
        break lexical_join_52;
    }
    ((java.util.List)(this.c)).add(((java.lang.Object)(life7_21)));
    if (!((life4_11 != null))) {
        break lexical_join_61;
    }
    }
    lexicalValue73_56_0 = ((((java.util.List)(this.b)).add(((java.lang.Object)(life7_21)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(lexicalValue73_56_0);
    ((com.moon.nY)(((com.moon.module.Module)(life7_21)).getListAnimation())).a(((float)(0x0.0p0f)));
    }
    if (!((life4_11 != null))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    return;
}


public void a(com.moon.event.ModuleToggleEvent p0) {
int forwardValue363_19_0;
    int forwardValue363_25_0;
    int forwardValue363_32_0;
    int forwardValue363_43_0;
    com.moon.hq forwardValue363_62_0;
    java.lang.String[] spill363_0;
    int spill363_1;
    com.moon.hq spill363_2;
    long life2_3;
    java.lang.String[] life4_7;
    com.moon.module.Module life5_10;
    forward_join_62: {
    forward_join_61: {
    forward_join_55: {
    forward_join_43: {
    forward_join_32: {
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (com.moon.hq.j ^ 5850367037488L);
    spill363_0 = com.moon.hq.b__ArrayString();
    this.c();
    life4_7 = spill363_0;
    life5_10 = ((com.moon.event.ModuleToggleEvent)(p0)).getModule();
    spill363_1 = ((life5_10 instanceof com.moon.module.impl.ClickGUI) ? 1 : 0);
    if (!((life4_7 == null))) {
        forwardValue363_19_0 = spill363_1;
        break forward_join_19;
    }
    if (!((spill363_1 != 0))) {
        break forward_join_17;
    }
    return;
    }
    forwardValue363_19_0 = ((((com.moon.module.Module)(life5_10)).isHidden()) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        forwardValue363_25_0 = forwardValue363_19_0;
        break forward_join_25;
    }
    if (!((forwardValue363_19_0 != 0))) {
        break forward_join_23;
    }
    return;
    }
    forwardValue363_25_0 = ((((com.moon.event.ModuleToggleEvent)(p0)).isEnabled()) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        forwardValue363_32_0 = forwardValue363_25_0;
        break forward_join_32;
    }
    if (!((forwardValue363_25_0 != 0))) {
        break forward_join_55;
    }
    forwardValue363_32_0 = ((((java.util.List)(this.b)).contains(((java.lang.Object)(life5_10)))) ? 1 : 0);
    }
    if (!((life4_7 == null))) {
        forwardValue363_43_0 = forwardValue363_32_0;
        break forward_join_43;
    }
    if (!((forwardValue363_32_0 == 0))) {
        break forward_join_55;
    }
    spill363_2 = this;
    if (!((life4_7 == null))) {
        forwardValue363_62_0 = spill363_2;
        break forward_join_62;
    }
    forwardValue363_43_0 = ((((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.HUD)(((com.moon.hq)(spill363_2)).g)).a__k4())).isSelected(((java.lang.Enum)(((com.moon.module.Module)(life5_10)).getCategory())))) ? 1 : 0);
    }
    if (!((forwardValue363_43_0 != 0))) {
        break forward_join_61;
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(life5_10)));
    ((com.moon.nY)(((com.moon.module.Module)(life5_10)).getListAnimation())).a(((float)(0x0.0p0f)));
    if (!((life4_7 != null))) {
        break forward_join_61;
    }
    }
    ((com.moon.nY)(((com.moon.module.Module)(life5_10)).getListAnimation())).a(((float)(((com.moon.nY)(((com.moon.module.Module)(life5_10)).getListAnimation())).c())));
    }
    forwardValue363_62_0 = this;
    }
    ((com.moon.hq)(forwardValue363_62_0)).b__Void();
    return;
}


public void a(com.moon.el p0) {
int forwardValue361_19_0;
    int forwardValue361_56_0;
    int forwardValue361_63_0;
    com.moon.hq forwardValue361_65_0;
    java.lang.String[] spill361_0;
    int spill361_1;
    boolean spill361_2;
    boolean spill361_3;
    com.moon.hq spill361_4;
    long life2_3;
    com.moon.module.Module life5_9;
    java.lang.String[] life4_10;
    forward_join_65: {
    forward_join_64: {
    forward_join_63: {
    forward_join_56: {
    forward_join_54: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (com.moon.hq.j ^ 138774626171418L);
    spill361_0 = com.moon.hq.b__ArrayString();
    this.c();
    life5_9 = ((com.moon.el)(p0)).a();
    life4_10 = spill361_0;
    spill361_1 = ((life5_9 instanceof com.moon.module.impl.ClickGUI) ? 1 : 0);
    if (!((life4_10 == null))) {
        forwardValue361_19_0 = spill361_1;
        break forward_join_19;
    }
    if (!((spill361_1 != 0))) {
        break forward_join_17;
    }
    return;
    }
    forwardValue361_19_0 = ((((com.moon.el)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_10 == null))) {
        forwardValue361_56_0 = forwardValue361_19_0;
        break forward_join_56;
    }
    if (!((forwardValue361_19_0 == 0))) {
        break forward_join_54;
    }
    spill361_2 = ((com.moon.el)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_10 == null))) {
        forwardValue361_56_0 = ((spill361_2) ? 1 : 0);
        break forward_join_56;
    }
    if (!(spill361_2)) {
        break forward_join_54;
    }
    spill361_3 = ((java.util.List)(this.b)).contains(((java.lang.Object)(life5_9)));
    if (!((life4_10 == null))) {
        forwardValue361_56_0 = ((spill361_3) ? 1 : 0);
        break forward_join_56;
    }
    if (!((!spill361_3))) {
        break forward_join_54;
    }
    spill361_4 = this;
    if (!((life4_10 == null))) {
        forwardValue361_65_0 = spill361_4;
        break forward_join_65;
    }
    if (!(((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.HUD)(((com.moon.hq)(spill361_4)).g)).a__k4())).isSelected(((java.lang.Enum)(((com.moon.module.Module)(life5_9)).getCategory()))))) {
        break forward_join_64;
    }
    ((java.util.List)(this.b)).add(((java.lang.Object)(life5_9)));
    ((com.moon.nY)(((com.moon.module.Module)(life5_9)).getListAnimation())).a(((float)(0x0.0p0f)));
    if (!((life4_10 != null))) {
        break forward_join_64;
    }
    }
    forwardValue361_56_0 = ((((com.moon.el)(p0)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_10 == null))) {
        forwardValue361_63_0 = forwardValue361_56_0;
        break forward_join_63;
    }
    if (!((forwardValue361_56_0 != 0))) {
        break forward_join_64;
    }
    forwardValue361_63_0 = ((((java.util.List)(this.c)).add(((java.lang.Object)(life5_9)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forwardValue361_63_0);
    }
    forwardValue361_65_0 = this;
    }
    ((com.moon.hq)(forwardValue361_65_0)).b__Void();
    return;
}


public void a__Void() {
int forestValue900020_24_0;
    java.lang.Object forestValue900020_54_0;
    float forestValue900020_59_0;
    com.moon.hq forestValue900020_145_0;
    int forestValue900020_155_0;
    int forestValue900020_194_0;
    java.lang.Object forestValue900020_226_0;
    java.lang.String[] spill900020_0;
    boolean spill900020_1;
    java.lang.Boolean spill900020_2;
    com.moon.hq spill900020_3;
    java.lang.Object spill900020_4;
    boolean spill900020_5;
    java.lang.Object spill900020_6;
    long life1_3;
    java.lang.String[] life3_7;
    moom.ir life4_31;
    float life5_43;
    int life6_45;
    float life7_70;
    java.util.Iterator life8_74;
    com.moon.module.Module life9_83;
    int life10_90;
    float life11_111;
    float life12_126;
    java.lang.String life13_130;
    int life14_144;
    int life15_175;
    java.lang.String life16_179;
    java.util.Iterator life8_236;
    com.moon.module.Module life9_246;
    com.moon.module.Module life9_259;
    forest_join_247: {
    forest_join_244: {
    forest_join_226: {
    forest_join_203: {
    forest_join_59: {
    forest_join_58: {
    forest_join_54: {
    forest_join_24: {
    forest_join_18: {
    life1_3 = (com.moon.hq.j ^ 75540329928564L);
    spill900020_0 = com.moon.hq.b__ArrayString();
    this.c();
    life3_7 = spill900020_0;
    spill900020_1 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).p())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        forestValue900020_24_0 = ((spill900020_1) ? 1 : 0);
        break forest_join_24;
    }
    if (!((!spill900020_1))) {
        break forest_join_18;
    }
    return;
    }
    forestValue900020_24_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).q())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue900020_24_0 == 0))) {
        break forest_join_247;
    }
    life4_31 = com.moon.nS.a();
    ((moom.ir)(life4_31)).a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).e__kZ())).getValue())))).floatValue()))));
    life5_43 = 0x0.0p0f;
    life6_45 = 0;
    spill900020_2 = ((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).v())).getValue()));
    if (!((life3_7 == null))) {
        forestValue900020_54_0 = spill900020_2;
        break forest_join_54;
    }
    if (!(((java.lang.Boolean)(spill900020_2)).booleanValue())) {
        break forest_join_58;
    }
    forestValue900020_54_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).g__kY())).getValue();
    }
    if (!((forestValue900020_54_0 == com.moon.b2.RIGHT))) {
        break forest_join_58;
    }
    forestValue900020_59_0 = 0x1.0p0f;
    break forest_join_59;
    }
    forestValue900020_59_0 = 0x0.0p0f;
    }
    life7_70 = forestValue900020_59_0;
    life8_74 = ((java.util.List)(this.b)).iterator();
    forest_cycle_64: while (true) {
    forest_join_195: {
    forest_join_194: {
    forest_join_183: {
    forest_join_155: {
    forest_join_145: {
    forest_join_144: {
    if (!(((java.util.Iterator)(life8_74)).hasNext())) {
        break forest_join_203;
    }
    life9_83 = ((com.moon.module.Module)(((java.util.Iterator)(life8_74)).next()));
    life10_90 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).d__k1())).getValue())))).intValue();
    life11_111 = (((((((float) ((moom.ir)(life4_31)).a__Int()) - ((com.moon.module.Module)(life9_83)).a__Float()) - ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue()) - life7_70) - ((float) life10_90)) + 0x1.0p-1f);
    life12_126 = ((life5_43 + ((float) life10_90)) + (((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).e__k1())).getValue())))).intValue()) / 0x1.0p1f));
    life13_130 = ((com.moon.hq)(this)).a(((com.moon.module.Module)(life9_83)));
    ((java.util.Map)(this.d)).computeIfAbsent(((java.lang.Object)(life9_83)), ((java.util.function.Function)(__sourceIntrinsic_b82a5b29b709_invokedynamic900020_55(life9_83))));
    life14_144 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(this.d)).get(((java.lang.Object)(life9_83))))))).intValue();
    spill900020_3 = this;
    if (!((life3_7 == null))) {
        forestValue900020_145_0 = spill900020_3;
        break forest_join_145;
    }
    spill900020_4 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(((com.moon.hq)(spill900020_3)).g)).f__kY())).getValue();
    if (!((life3_7 == null))) {
        forestValue900020_226_0 = spill900020_4;
        break forest_join_226;
    }
    if (!((spill900020_4 == com.moon.bY.INDIVIDUAL))) {
        break forest_join_144;
    }
    forestValue900020_155_0 = life14_144;
    break forest_join_155;
    }
    forestValue900020_145_0 = this;
    }
    forestValue900020_155_0 = ((com.moon.hq)(forestValue900020_145_0)).a__Int(((float)((((float) life6_45) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).a__kZ())).getValue())))).floatValue()))));
    }
    life15_175 = forestValue900020_155_0;
    life16_179 = this.b(((com.moon.module.Module)(life9_83)));
    spill900020_5 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).r())).getValue())))).booleanValue();
    if (!((life3_7 == null))) {
        forestValue900020_194_0 = ((spill900020_5) ? 1 : 0);
        break forest_join_194;
    }
    if (!((!spill900020_5))) {
        break forest_join_183;
    }
    ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hq.a)).N)).b(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic900020_80(life16_179, life13_130))), ((float)(life11_111)), ((float)((life12_126 + 0x1.0p-1f))), ((int)(life15_175)));
    if (!((life3_7 != null))) {
        break forest_join_195;
    }
    }
    forestValue900020_194_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hq.a)).N)).a(((java.lang.String)(__sourceIntrinsic_b82a5b29b709_invokedynamic900020_84(life16_179, life13_130))), ((float)(life11_111)), ((float)((life12_126 + 0x1.0p-1f))), ((int)(life15_175)));
    }
    recovery.source.CarrierOps.discard(forestValue900020_194_0);
    }
    life5_43 = (life5_43 + ((com.moon.module.Module)(life9_83)).b__Float());
    life6_45 += 1;
    if (!((life3_7 != null))) {
        continue forest_cycle_64;
    }
    break forest_cycle_64;
    }
    }
    ((moom.ir)(life4_31)).a__Void();
    life8_236 = ((java.util.List)(this.c)).iterator();
    forest_cycle_209: while (true) {
    if (!(((java.util.Iterator)(life8_236)).hasNext())) {
        break forest_join_244;
    }
    life9_246 = ((com.moon.module.Module)(((java.util.Iterator)(life8_236)).next()));
    ((java.util.List)(this.b)).remove(((java.lang.Object)(life9_246)));
    if (!((life3_7 == null))) {
        break forest_join_247;
    }
    if (!((life3_7 != null))) {
        continue forest_cycle_209;
    }
    break forest_cycle_209;
    }
    break forest_join_244;
    }
    forest_cycle_226: while (true) {
    forest_join_238: {
    life9_259 = ((com.moon.module.Module)(forestValue900020_226_0));
    ((java.util.List)(this.b)).remove(((java.lang.Object)(life9_259)));
    if (!((life3_7 == null))) {
        break forest_join_247;
    }
    if (!((life3_7 != null))) {
        break forest_join_238;
    }
    break forest_join_244;
    }
    if (!(((java.util.Iterator)(life8_74)).hasNext())) {
        break forest_join_244;
    }
    spill900020_6 = ((java.util.Iterator)(life8_74)).next();
    forestValue900020_226_0 = spill900020_6;
    continue forest_cycle_226;
    }
    }
    ((java.util.List)(this.c)).clear();
    }
    return;
}


private void a(com.moon.hW p0, boolean p1) {
float forestValue75_46_0;
    com.moon.module.Module forestValue75_82_0;
    int forestValue75_94_0;
    int forestValue75_116_0;
    float forestValue75_230_0;
    int forestValue75_251_0;
    int forestValue75_253_0;
    com.moon.module.Module forestValue75_274_0;
    int forestValue75_276_0;
    int forestValue75_285_0;
    float forestValue75_286_0;
    float forestValue75_358_0;
    float forestValue75_358_1;
    float forestValue75_358_2;
    float forestValue75_358_3;
    float forestValue75_358_4;
    int forestValue75_358_5;
    float forestValue75_363_0;
    float forestValue75_363_1;
    float forestValue75_363_2;
    float forestValue75_363_3;
    float forestValue75_363_4;
    float forestValue75_365_0;
    float forestValue75_365_1;
    float forestValue75_365_2;
    float forestValue75_365_3;
    float forestValue75_365_4;
    int forestValue75_365_5;
    float forestValue75_366_0;
    float forestValue75_366_1;
    float forestValue75_366_2;
    float forestValue75_366_3;
    float forestValue75_366_4;
    float forestValue75_386_0;
    float forestValue75_386_1;
    float forestValue75_386_2;
    float forestValue75_386_3;
    float forestValue75_386_4;
    int forestValue75_386_5;
    int forestValue75_398_0;
    com.moon.module.Module forestValue75_412_0;
    com.moon.module.Module forestValue75_428_0;
    int forestValue75_448_0;
    int forestValue75_467_0;
    int forestValue75_471_0;
    int forestValue75_487_0;
    com.moon.hq forestValue75_499_0;
    int forestValue75_509_0;
    com.moon.hq forestValue75_521_0;
    int forestValue75_531_0;
    float forestValue75_573_0;
    float forestValue75_573_1;
    float forestValue75_573_2;
    float forestValue75_573_3;
    float forestValue75_574_0;
    float forestValue75_574_1;
    float forestValue75_574_2;
    float forestValue75_574_3;
    float forestValue75_574_4;
    com.moon.i3 forestValue75_587_0;
    int forestValue75_587_1;
    com.moon.i3 forestValue75_588_0;
    com.moon.i3 forestValue75_589_0;
    int forestValue75_589_1;
    com.moon.i3 forestValue75_606_0;
    int forestValue75_606_1;
    com.moon.i3 forestValue75_607_0;
    com.moon.i3 forestValue75_608_0;
    int forestValue75_608_1;
    float forestValue75_645_0;
    float forestValue75_645_1;
    float forestValue75_645_2;
    float forestValue75_645_3;
    float forestValue75_646_0;
    float forestValue75_646_1;
    float forestValue75_646_2;
    float forestValue75_646_3;
    float forestValue75_646_4;
    com.moon.i3 forestValue75_659_0;
    int forestValue75_659_1;
    com.moon.i3 forestValue75_660_0;
    com.moon.i3 forestValue75_661_0;
    int forestValue75_661_1;
    com.moon.i3 forestValue75_683_0;
    com.moon.i3 forestValue75_684_0;
    int forestValue75_684_1;
    com.moon.i3 forestValue75_685_0;
    com.moon.i3 forestValue75_686_0;
    int forestValue75_686_1;
    float forestValue75_721_0;
    float forestValue75_833_0;
    float forestValue75_833_1;
    float forestValue75_834_0;
    float forestValue75_834_1;
    float forestValue75_834_2;
    float forestValue75_836_0;
    float forestValue75_836_1;
    float forestValue75_836_2;
    com.moon.module.Module forestValue75_851_0;
    com.moon.module.Module forestValue75_865_0;
    boolean spill75_0;
    boolean spill75_1;
    boolean spill75_2;
    boolean spill75_3;
    boolean spill75_4;
    com.moon.module.impl.HUD spill75_5;
    boolean spill75_6;
    float spill75_7;
    float spill75_8;
    float spill75_9;
    float spill75_10;
    float spill75_11;
    boolean spill75_12;
    int spill75_13;
    com.moon.module.impl.HUD spill75_14;
    com.moon.module.impl.HUD spill75_15;
    int spill75_16;
    com.moon.hq spill75_17;
    com.moon.hq spill75_18;
    float spill75_19;
    float spill75_20;
    float spill75_21;
    float spill75_22;
    com.moon.i3 spill75_23;
    int spill75_24;
    com.moon.i3 spill75_25;
    com.moon.i3 spill75_26;
    int spill75_27;
    float spill75_28;
    float spill75_29;
    float spill75_30;
    float spill75_31;
    com.moon.i3 spill75_32;
    int spill75_33;
    com.moon.i3 spill75_34;
    com.moon.i3 spill75_35;
    int spill75_36;
    int spill75_37;
    com.moon.module.Module spill75_38;
    com.moon.module.Module spill75_39;
    float spill75_40;
    float spill75_41;
    float spill75_42;
    float spill75_43;
    long life3_3;
    java.lang.String[] life5_5;
    moom.ir life6_15;
    float life7_27;
    int life8_34;
    float life9_47;
    com.moon.module.Module life10_49;
    int life11_51;
    int life12_53;
    com.moon.module.Module life13_64;
    com.moon.module.Module life14_84;
    float life15_142;
    java.lang.String life16_146;
    java.lang.String life17_152;
    float life18_162;
    float life19_171;
    float life20_173;
    int life21_204;
    float life22_217;
    float life23_221;
    float life24_230;
    float life25_241;
    float life26_246;
    int life27_266;
    float life28_303;
    float life29_308;
    float life30_320;
    int life31_342;
    com.moon.i3 life32_408;
    int life31_526;
    int life32_549;
    int life33_572;
    float life34_585;
    float life35_589;
    com.moon.i3 life36_618;
    float life34_677;
    com.moon.i3 life36_694;
    float life36_773;
    float life34_784;
    com.moon.i3 life37_805;
    com.moon.i3 life38_813;
    com.moon.i3 life39_832;
    com.moon.i3 life40_897;
    forest_join_872: {
    forest_join_870: {
    forest_join_46: {
    forest_join_45: {
    forest_join_14: {
    life3_3 = (com.moon.hq.j ^ 27443468909171L);
    life5_5 = com.moon.hq.b__ArrayString();
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).p())).getValue())))).booleanValue()))) {
        break forest_join_14;
    }
    return;
    }
    life6_15 = com.moon.nS.a();
    ((moom.ir)(life6_15)).a(((float)((0x1.0p0f / ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).e__kZ())).getValue())))).floatValue()))));
    life7_27 = 0x1.4p1f;
    life8_34 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).v())).getValue())))).booleanValue()) ? 1 : 0);
    if (!((life8_34 != 0))) {
        break forest_join_45;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).g__kY())).getValue() == com.moon.b2.RIGHT))) {
        break forest_join_45;
    }
    forestValue75_46_0 = 0x1.0p0f;
    break forest_join_46;
    }
    forestValue75_46_0 = 0x0.0p0f;
    }
    life9_47 = forestValue75_46_0;
    life10_49 = null;
    life11_51 = 0;
    life12_53 = 0;
    forest_cycle_53: while (true) {
    forest_join_868: {
    forest_join_865: {
    forest_join_859: {
    forest_join_851: {
    forest_join_850: {
    forest_join_836: {
    forest_join_834: {
    forest_join_833: {
    forest_join_721: {
    forest_join_720: {
    forest_join_699: {
    forest_join_686: {
    forest_join_685: {
    forest_join_684: {
    forest_join_683: {
    forest_join_661: {
    forest_join_660: {
    forest_join_659: {
    forest_join_646: {
    forest_join_645: {
    forest_join_621: {
    forest_join_608: {
    forest_join_607: {
    forest_join_606: {
    forest_join_589: {
    forest_join_588: {
    forest_join_587: {
    forest_join_574: {
    forest_join_573: {
    forest_join_560: {
    forest_join_531: {
    forest_join_521: {
    forest_join_520: {
    forest_join_509: {
    forest_join_499: {
    forest_join_498: {
    forest_join_487: {
    forest_join_471: {
    forest_join_467: {
    forest_join_466: {
    forest_join_459: {
    forest_join_448: {
    forest_join_447: {
    forest_join_433: {
    forest_join_429: {
    forest_join_428: {
    forest_join_427: {
    forest_join_417: {
    forest_join_412: {
    forest_join_411: {
    forest_join_407: {
    forest_join_398: {
    forest_join_386: {
    forest_join_366: {
    forest_join_365: {
    forest_join_363: {
    forest_join_358: {
    forest_join_286: {
    forest_join_285: {
    forest_join_284: {
    forest_join_276: {
    forest_join_274: {
    forest_join_273: {
    forest_join_253: {
    forest_join_252: {
    forest_join_251: {
    forest_join_230: {
    forest_join_224: {
    forest_join_124: {
    forest_join_116: {
    forest_join_115: {
    forest_join_94: {
    forest_join_92: {
    forest_join_82: {
    forest_join_81: {
    if (!((life12_53 < ((java.util.List)(this.b)).size()))) {
        break forest_join_870;
    }
    life13_64 = ((com.moon.module.Module)(((java.util.List)(this.b)).get(((int)(life12_53)))));
    if (!((life5_5 == null))) {
        break forest_join_872;
    }
    if (!((life12_53 < (((java.util.List)(this.b)).size() - 1)))) {
        break forest_join_81;
    }
    forestValue75_82_0 = ((com.moon.module.Module)(((java.util.List)(this.b)).get(((int)((life12_53 + 1))))));
    break forest_join_82;
    }
    forestValue75_82_0 = null;
    }
    life14_84 = forestValue75_82_0;
    spill75_0 = ((com.moon.nY)(((com.moon.module.Module)(life13_64)).getListAnimation())).a__Boolean();
    if (!((life5_5 == null))) {
        forestValue75_94_0 = ((spill75_0) ? 1 : 0);
        break forest_join_94;
    }
    if (!((!spill75_0))) {
        break forest_join_92;
    }
    this.e = ((long)(java.lang.System.currentTimeMillis()));
    }
    forestValue75_94_0 = ((((com.moon.module.Module)(life13_64)).isEnabled()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forestValue75_116_0 = forestValue75_94_0;
        break forest_join_116;
    }
    if (!((forestValue75_94_0 == 0))) {
        break forest_join_115;
    }
    spill75_1 = ((com.moon.nY)(((com.moon.module.Module)(life13_64)).getListAnimation())).a__Boolean();
    if (!((life5_5 == null))) {
        forestValue75_116_0 = ((spill75_1) ? 1 : 0);
        break forest_join_116;
    }
    if (!(spill75_1)) {
        break forest_join_115;
    }
    spill75_2 = ((java.util.List)(this.c)).contains(((java.lang.Object)(life13_64)));
    if (!((life5_5 == null))) {
        forestValue75_116_0 = ((spill75_2) ? 1 : 0);
        break forest_join_116;
    }
    if (!((!spill75_2))) {
        break forest_join_115;
    }
    ((java.util.List)(this.c)).add(((java.lang.Object)(life13_64)));
    }
    forestValue75_116_0 = ((p1) ? 1 : 0);
    }
    if (!((forestValue75_116_0 == 0))) {
        break forest_join_124;
    }
    ((com.moon.nY)(((com.moon.module.Module)(life13_64)).getListAnimation())).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(((com.moon.module.Module)(life13_64)).isEnabled())));
    }
    life15_142 = ((float) com.moon.nI.a(((double)(((double) ((com.moon.nY)(((com.moon.module.Module)(life13_64)).getListAnimation())).c()))), ((int)(2))));
    life16_146 = ((com.moon.hq)(this)).a(((com.moon.module.Module)(life13_64)));
    life17_152 = __sourceIntrinsic_dd8b543400f2_invokedynamic75_58(this.b(((com.moon.module.Module)(life13_64))), life16_146);
    life18_162 = ((com.moon.hq)(this)).a(((java.lang.String)(life17_152)), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())));
    life19_171 = ((com.moon.hq)(this)).a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())));
    life20_173 = 0x1.cp1f;
    ((com.moon.module.Module)(life13_64)).a(((float)((life18_162 * life15_142))));
    ((com.moon.module.Module)(life13_64)).b(((float)(((life19_171 + ((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).e__k1())).getValue())))).intValue())) * java.lang.Math.max(((float)(java.lang.Math.min(((float)(life15_142)), ((float)(0x1.0p0f))))), ((float)(0x0.0p0f)))))));
    life21_204 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).d__k1())).getValue())))).intValue();
    life22_217 = (((-((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue()) - life9_47) - ((float) life21_204));
    life23_221 = ((float) ((moom.ir)(life6_15)).a__Int());
    life24_230 = (((life23_221 - ((com.moon.module.Module)(life13_64)).a__Float()) + life22_217) + 0x1.0p0f);
    if (!((life14_84 == null))) {
        break forest_join_224;
    }
    forestValue75_230_0 = 0x0.0p0f;
    break forest_join_230;
    }
    forestValue75_230_0 = ((life23_221 - ((com.moon.module.Module)(life14_84)).a__Float()) + life22_217);
    }
    life25_241 = forestValue75_230_0;
    life26_246 = (life7_27 + ((float) life21_204));
    spill75_3 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).u())).getValue())))).booleanValue();
    if (!((life5_5 == null))) {
        forestValue75_251_0 = ((spill75_3) ? 1 : 0);
        break forest_join_251;
    }
    if (!(spill75_3)) {
        break forest_join_252;
    }
    forestValue75_251_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).c__k1())).getValue())))).intValue();
    }
    forestValue75_253_0 = forestValue75_251_0;
    break forest_join_253;
    }
    forestValue75_253_0 = 0;
    }
    life27_266 = forestValue75_253_0;
    spill75_4 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).v())).getValue())))).booleanValue();
    if (!((life5_5 == null))) {
        forestValue75_276_0 = ((spill75_4) ? 1 : 0);
        break forest_join_276;
    }
    if (!(spill75_4)) {
        break forest_join_273;
    }
    spill75_5 = this.g;
    if (!((life5_5 == null))) {
        forestValue75_274_0 = spill75_5;
        break forest_join_274;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(spill75_5)).g__kY())).getValue() == com.moon.b2.OUTLINE))) {
        break forest_join_273;
    }
    life27_266 = 0;
    }
    forestValue75_274_0 = life13_64;
    }
    forestValue75_276_0 = ((((com.moon.nY)(((com.moon.module.Module)(forestValue75_274_0)).getListAnimation())).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forestValue75_285_0 = forestValue75_276_0;
        break forest_join_285;
    }
    if (!((forestValue75_276_0 != 0))) {
        break forest_join_284;
    }
    forestValue75_286_0 = java.lang.Math.abs(((float)((life25_241 - life24_230))));
    break forest_join_286;
    }
    forestValue75_285_0 = life27_266;
    }
    forestValue75_286_0 = ((float) forestValue75_285_0);
    }
    life28_303 = forestValue75_286_0;
    life29_308 = java.lang.Math.min(((float)(((float) life27_266))), ((float)(life28_303)));
    life30_320 = ((life19_171 + ((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).e__k1())).getValue())))).intValue())) + 0x1.0p0f);
    spill75_6 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).s())).getValue())))).booleanValue();
    if (!((life5_5 == null))) {
        forestValue75_467_0 = ((spill75_6) ? 1 : 0);
        break forest_join_467;
    }
    if (!(spill75_6)) {
        break forest_join_466;
    }
    life31_342 = ((com.moon.hq)(this)).a__Int(((float)((((float) life11_51) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).a__kZ())).getValue())))).floatValue()))));
    spill75_7 = (life24_230 - ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue());
    spill75_8 = (life26_246 - life20_173);
    spill75_9 = (life18_162 + (((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue() * 0x1.0p1f));
    spill75_10 = life30_320;
    spill75_11 = life29_308;
    spill75_12 = p1;
    if (!((life5_5 == null))) {
        forestValue75_358_0 = spill75_7;
        forestValue75_358_1 = spill75_8;
        forestValue75_358_2 = spill75_9;
        forestValue75_358_3 = spill75_10;
        forestValue75_358_4 = spill75_11;
        forestValue75_358_5 = ((spill75_12) ? 1 : 0);
        break forest_join_358;
    }
    if (!(spill75_12)) {
        forestValue75_366_0 = spill75_7;
        forestValue75_366_1 = spill75_8;
        forestValue75_366_2 = spill75_9;
        forestValue75_366_3 = spill75_10;
        forestValue75_366_4 = spill75_11;
        break forest_join_366;
    }
    forestValue75_358_0 = spill75_7;
    forestValue75_358_1 = spill75_8;
    forestValue75_358_2 = spill75_9;
    forestValue75_358_3 = spill75_10;
    forestValue75_358_4 = spill75_11;
    forestValue75_358_5 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).t())).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forestValue75_365_0 = forestValue75_358_0;
        forestValue75_365_1 = forestValue75_358_1;
        forestValue75_365_2 = forestValue75_358_2;
        forestValue75_365_3 = forestValue75_358_3;
        forestValue75_365_4 = forestValue75_358_4;
        forestValue75_365_5 = forestValue75_358_5;
        break forest_join_365;
    }
    if (!((forestValue75_358_5 != 0))) {
        forestValue75_363_0 = forestValue75_358_0;
        forestValue75_363_1 = forestValue75_358_1;
        forestValue75_363_2 = forestValue75_358_2;
        forestValue75_363_3 = forestValue75_358_3;
        forestValue75_363_4 = forestValue75_358_4;
        break forest_join_363;
    }
    forestValue75_386_0 = forestValue75_358_0;
    forestValue75_386_1 = forestValue75_358_1;
    forestValue75_386_2 = forestValue75_358_2;
    forestValue75_386_3 = forestValue75_358_3;
    forestValue75_386_4 = forestValue75_358_4;
    forestValue75_386_5 = life31_342;
    break forest_join_386;
    }
    forestValue75_365_0 = forestValue75_363_0;
    forestValue75_365_1 = forestValue75_363_1;
    forestValue75_365_2 = forestValue75_363_2;
    forestValue75_365_3 = forestValue75_363_3;
    forestValue75_365_4 = forestValue75_363_4;
    forestValue75_365_5 = ((java.awt.Color)(java.awt.Color.BLACK)).getRGB();
    }
    forestValue75_386_0 = forestValue75_365_0;
    forestValue75_386_1 = forestValue75_365_1;
    forestValue75_386_2 = forestValue75_365_2;
    forestValue75_386_3 = forestValue75_365_3;
    forestValue75_386_4 = forestValue75_365_4;
    forestValue75_386_5 = forestValue75_365_5;
    break forest_join_386;
    }
    forestValue75_386_0 = forestValue75_366_0;
    forestValue75_386_1 = forestValue75_366_1;
    forestValue75_386_2 = forestValue75_366_2;
    forestValue75_386_3 = forestValue75_366_3;
    forestValue75_386_4 = forestValue75_366_4;
    forestValue75_386_5 = ((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.g)).g__kX())).getValue())))).intValue()))).a(((float)((((float) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(((com.moon.module.impl.HUD)(this.g)).b__k1())).getValue())))).intValue()) / 0x1.fep7f)))))).getRGB();
    }
    life32_408 = com.moon.i3.a(((float)(forestValue75_386_0)), ((float)(forestValue75_386_1)), ((float)(forestValue75_386_2)), ((float)(forestValue75_386_3)), ((float)(forestValue75_386_4)), ((int)(forestValue75_386_5)));
    spill75_13 = life12_53;
    if (!((life5_5 == null))) {
        forestValue75_398_0 = spill75_13;
        break forest_join_398;
    }
    if (!((spill75_13 == (((java.util.List)(this.b)).size() - 1)))) {
        break forest_join_407;
    }
    forestValue75_398_0 = life8_34;
    }
    if (!((forestValue75_398_0 != 0))) {
        break forest_join_411;
    }
    spill75_14 = this.g;
    if (!((life5_5 == null))) {
        forestValue75_412_0 = spill75_14;
        break forest_join_412;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(spill75_14)).g__kY())).getValue() == com.moon.b2.RIGHT))) {
        break forest_join_411;
    }
    }
    ((com.moon.i3)(life32_408)).d(((boolean)(false)));
    }
    forestValue75_412_0 = life10_49;
    }
    if (!((forestValue75_412_0 != null))) {
        break forest_join_417;
    }
    ((com.moon.i3)(life32_408)).b(((boolean)(false)));
    }
    if (!((life8_34 != 0))) {
        break forest_join_427;
    }
    spill75_15 = this.g;
    if (!((life5_5 == null))) {
        forestValue75_428_0 = spill75_15;
        break forest_join_428;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(spill75_15)).g__kY())).getValue() == com.moon.b2.RIGHT))) {
        break forest_join_429;
    }
    }
    forestValue75_428_0 = life10_49;
    }
    if (!((forestValue75_428_0 != null))) {
        break forest_join_433;
    }
    }
    ((com.moon.i3)(life32_408)).a(((boolean)(false)));
    }
    spill75_16 = life8_34;
    if (!((life5_5 == null))) {
        forestValue75_448_0 = spill75_16;
        break forest_join_448;
    }
    if (!((spill75_16 != 0))) {
        break forest_join_447;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).g__kY())).getValue() == com.moon.b2.RIGHT))) {
        break forest_join_447;
    }
    ((com.moon.i3)(life32_408)).b(((boolean)(false)));
    }
    forestValue75_448_0 = life8_34;
    }
    if (!((forestValue75_448_0 != 0))) {
        break forest_join_459;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).g__kY())).getValue() != com.moon.b2.RIGHT))) {
        break forest_join_459;
    }
    ((com.moon.i3)(life32_408)).c(((boolean)(false)));
    }
    ((com.moon.i3)(life32_408)).e(((boolean)(false)));
    ((com.moon.hW)(p0)).a(((com.moon.iX)(life32_408)));
    }
    forestValue75_467_0 = life8_34;
    }
    if (!((life5_5 == null))) {
        forestValue75_471_0 = forestValue75_467_0;
        break forest_join_471;
    }
    if (!((forestValue75_467_0 != 0))) {
        break forest_join_859;
    }
    forestValue75_471_0 = ((p1) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forestValue75_487_0 = forestValue75_471_0;
        break forest_join_487;
    }
    if (!((forestValue75_471_0 == 0))) {
        break forest_join_859;
    }
    ((java.util.Map)(this.d)).computeIfAbsent(((java.lang.Object)(life13_64)), ((java.util.function.Function)(__sourceIntrinsic_dd8b543400f2_invokedynamic75_195(life13_64))));
    forestValue75_487_0 = ((java.lang.Integer)(((java.lang.Integer)(((java.util.Map)(this.d)).get(((java.lang.Object)(life13_64))))))).intValue();
    }
    life31_526 = forestValue75_487_0;
    spill75_17 = this;
    if (!((life5_5 == null))) {
        forestValue75_499_0 = spill75_17;
        break forest_join_499;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(((com.moon.hq)(spill75_17)).g)).f__kY())).getValue() == com.moon.bY.INDIVIDUAL))) {
        break forest_join_498;
    }
    forestValue75_509_0 = life31_526;
    break forest_join_509;
    }
    forestValue75_499_0 = this;
    }
    forestValue75_509_0 = ((com.moon.hq)(forestValue75_499_0)).a__Int(((float)((((float) life11_51) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).a__kZ())).getValue())))).floatValue()))));
    }
    life32_549 = forestValue75_509_0;
    spill75_18 = this;
    if (!((life5_5 == null))) {
        forestValue75_521_0 = spill75_18;
        break forest_join_521;
    }
    if (!((((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(((com.moon.hq)(spill75_18)).g)).h__kY())).getValue() == com.moon.b1.SYNC))) {
        break forest_join_520;
    }
    forestValue75_531_0 = life32_549;
    break forest_join_531;
    }
    forestValue75_521_0 = this;
    }
    forestValue75_531_0 = ((com.moon.hq)(forestValue75_521_0)).b(((float)((((float) life11_51) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).c__kZ())).getValue())))).floatValue()))));
    }
    life33_572 = forestValue75_531_0;
    life34_585 = (((life24_230 + life18_162) + ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue()) - 0x1.8p0f);
    life35_589 = (life26_246 - life20_173);
    if (!((life5_5 == null))) {
        break forest_join_868;
    }
    switch ((com.moon.hr.a)[((com.moon.b2)(((com.moon.b2)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).g__kY())).getValue())))).ordinal()]) {
case 1:
{
        break forest_join_560;
    }
case 2:
{
        break forest_join_621;
    }
case 3:
{
        break forest_join_699;
    }
default:
{
        break forest_join_859;
    }
}
    }
    spill75_19 = life34_585;
    spill75_20 = life35_589;
    spill75_21 = 0x1.0p1f;
    spill75_22 = life30_320;
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).u())).getValue())))).booleanValue())) {
        forestValue75_573_0 = spill75_19;
        forestValue75_573_1 = spill75_20;
        forestValue75_573_2 = spill75_21;
        forestValue75_573_3 = spill75_22;
        break forest_join_573;
    }
    forestValue75_574_0 = spill75_19;
    forestValue75_574_1 = spill75_20;
    forestValue75_574_2 = spill75_21;
    forestValue75_574_3 = spill75_22;
    forestValue75_574_4 = 0x1.0p0f;
    break forest_join_574;
    }
    forestValue75_574_0 = forestValue75_573_0;
    forestValue75_574_1 = forestValue75_573_1;
    forestValue75_574_2 = forestValue75_573_2;
    forestValue75_574_3 = forestValue75_573_3;
    forestValue75_574_4 = 0x0.0p0f;
    }
    life36_618 = com.moon.i3.a(((float)(forestValue75_574_0)), ((float)(forestValue75_574_1)), ((float)(forestValue75_574_2)), ((float)(forestValue75_574_3)), ((float)(forestValue75_574_4)), ((int)(life33_572)));
    spill75_23 = life36_618;
    spill75_24 = 0;
    if (!((life5_5 == null))) {
        forestValue75_587_0 = spill75_23;
        forestValue75_587_1 = spill75_24;
        break forest_join_587;
    }
    ((com.moon.i3)(spill75_23)).a(((boolean)__sourceIntrinsic_integerToBoolean((spill75_24))));
    spill75_25 = life36_618;
    if (!((life10_49 == null))) {
        forestValue75_588_0 = spill75_25;
        break forest_join_588;
    }
    forestValue75_587_0 = spill75_25;
    forestValue75_587_1 = 1;
    }
    forestValue75_589_0 = forestValue75_587_0;
    forestValue75_589_1 = forestValue75_587_1;
    break forest_join_589;
    }
    forestValue75_589_0 = forestValue75_588_0;
    forestValue75_589_1 = 0;
    }
    ((com.moon.i3)(forestValue75_589_0)).b(((boolean)__sourceIntrinsic_integerToBoolean((forestValue75_589_1))));
    ((com.moon.i3)(life36_618)).c(((boolean)(false)));
    spill75_26 = life36_618;
    spill75_27 = life12_53;
    if (!((life5_5 == null))) {
        forestValue75_606_0 = spill75_26;
        forestValue75_606_1 = spill75_27;
        break forest_join_606;
    }
    if (!((spill75_27 == (((java.util.List)(this.b)).size() - 1)))) {
        forestValue75_607_0 = spill75_26;
        break forest_join_607;
    }
    forestValue75_606_0 = spill75_26;
    forestValue75_606_1 = 1;
    }
    forestValue75_608_0 = forestValue75_606_0;
    forestValue75_608_1 = forestValue75_606_1;
    break forest_join_608;
    }
    forestValue75_608_0 = forestValue75_607_0;
    forestValue75_608_1 = 0;
    }
    ((com.moon.i3)(forestValue75_608_0)).d(((boolean)__sourceIntrinsic_integerToBoolean((forestValue75_608_1))));
    ((com.moon.i3)(life36_618)).e(((boolean)(false)));
    ((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).f())).a(((com.moon.iX)(life36_618)));
    if (!((life5_5 != null))) {
        break forest_join_859;
    }
    }
    life34_677 = ((life24_230 - ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue()) - 0x1.0p0f);
    spill75_28 = life34_677;
    spill75_29 = life35_589;
    spill75_30 = 0x1.0p1f;
    spill75_31 = life30_320;
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).u())).getValue())))).booleanValue())) {
        forestValue75_645_0 = spill75_28;
        forestValue75_645_1 = spill75_29;
        forestValue75_645_2 = spill75_30;
        forestValue75_645_3 = spill75_31;
        break forest_join_645;
    }
    forestValue75_646_0 = spill75_28;
    forestValue75_646_1 = spill75_29;
    forestValue75_646_2 = spill75_30;
    forestValue75_646_3 = spill75_31;
    forestValue75_646_4 = 0x1.0p1f;
    break forest_join_646;
    }
    forestValue75_646_0 = forestValue75_645_0;
    forestValue75_646_1 = forestValue75_645_1;
    forestValue75_646_2 = forestValue75_645_2;
    forestValue75_646_3 = forestValue75_645_3;
    forestValue75_646_4 = 0x0.0p0f;
    }
    life36_694 = com.moon.i3.a(((float)(forestValue75_646_0)), ((float)(forestValue75_646_1)), ((float)(forestValue75_646_2)), ((float)(forestValue75_646_3)), ((float)(forestValue75_646_4)), ((int)(life33_572)));
    spill75_32 = life36_694;
    spill75_33 = 0;
    if (!((life5_5 == null))) {
        forestValue75_659_0 = spill75_32;
        forestValue75_659_1 = spill75_33;
        break forest_join_659;
    }
    ((com.moon.i3)(spill75_32)).b(((boolean)__sourceIntrinsic_integerToBoolean((spill75_33))));
    spill75_34 = life36_694;
    if (!((life10_49 == null))) {
        forestValue75_660_0 = spill75_34;
        break forest_join_660;
    }
    forestValue75_659_0 = spill75_34;
    forestValue75_659_1 = 1;
    }
    forestValue75_661_0 = forestValue75_659_0;
    forestValue75_661_1 = forestValue75_659_1;
    break forest_join_661;
    }
    forestValue75_661_0 = forestValue75_660_0;
    forestValue75_661_1 = 0;
    }
    ((com.moon.i3)(forestValue75_661_0)).a(((boolean)__sourceIntrinsic_integerToBoolean((forestValue75_661_1))));
    ((com.moon.i3)(life36_694)).d(((boolean)(false)));
    spill75_35 = life36_694;
    spill75_36 = life12_53;
    if (!((life5_5 == null))) {
        forestValue75_684_0 = spill75_35;
        forestValue75_684_1 = spill75_36;
        break forest_join_684;
    }
    if (!((spill75_36 != (((java.util.List)(this.b)).size() - 1)))) {
        forestValue75_683_0 = spill75_35;
        break forest_join_683;
    }
    spill75_37 = recovery.source.CarrierOps.fcmpl(((float)(life29_308)), ((float)(0x1.0p0f)));
    if (!((life5_5 == null))) {
        forestValue75_684_0 = spill75_35;
        forestValue75_684_1 = spill75_37;
        break forest_join_684;
    }
    if (!((spill75_37 > 0))) {
        forestValue75_685_0 = spill75_35;
        break forest_join_685;
    }
    forestValue75_683_0 = spill75_35;
    }
    forestValue75_684_0 = forestValue75_683_0;
    forestValue75_684_1 = 1;
    }
    forestValue75_686_0 = forestValue75_684_0;
    forestValue75_686_1 = forestValue75_684_1;
    break forest_join_686;
    }
    forestValue75_686_0 = forestValue75_685_0;
    forestValue75_686_1 = 0;
    }
    ((com.moon.i3)(forestValue75_686_0)).c(((boolean)__sourceIntrinsic_integerToBoolean((forestValue75_686_1))));
    ((com.moon.i3)(life36_694)).e(((boolean)(false)));
    ((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).f())).a(((com.moon.iX)(life36_694)));
    if (!((life5_5 != null))) {
        break forest_join_859;
    }
    }
    if (!((life14_84 != null))) {
        break forest_join_720;
    }
    forestValue75_721_0 = java.lang.Math.abs(((float)((life18_162 - ((com.moon.hq)(this)).a(((java.lang.String)(__sourceIntrinsic_dd8b543400f2_invokedynamic75_272(this.b(((com.moon.module.Module)(life14_84))), ((com.moon.hq)(this)).a(((com.moon.module.Module)(life14_84)))))), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())))))));
    break forest_join_721;
    }
    forestValue75_721_0 = 0x0.0p0f;
    }
    life36_773 = forestValue75_721_0;
    life34_784 = ((life24_230 - ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue()) - 0x1.0p0f);
    life37_805 = com.moon.i3.a(((float)(life34_784)), ((float)((life35_589 - 0x1.0p0f))), ((float)(((life18_162 + (((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue() * 0x1.0p1f)) + 0x1.0p1f))), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)), ((int)(life33_572)));
    life38_813 = com.moon.i3.a(((float)(life34_784)), ((float)(life35_589)), ((float)(0x1.0p1f)), ((float)(life30_320)), ((float)(0x0.0p0f)), ((int)(life33_572)));
    life39_832 = com.moon.i3.a(((float)((((life24_230 + life18_162) + ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue()) - 0x1.0p0f))), ((float)(life35_589)), ((float)(0x1.0p1f)), ((float)(life30_320)), ((float)(0x0.0p0f)), ((int)(life33_572)));
    ((com.moon.i3)(life38_813)).e(((boolean)(false)));
    ((com.moon.i3)(life39_832)).e(((boolean)(false)));
    ((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).f())).a(((com.moon.iX)(life38_813)));
    ((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).f())).a(((com.moon.iX)(life39_832)));
    spill75_38 = life13_64;
    if (!((life5_5 == null))) {
        forestValue75_851_0 = spill75_38;
        break forest_join_851;
    }
    if (!(((com.moon.nY)(((com.moon.module.Module)(spill75_38)).getListAnimation())).a__Boolean())) {
        break forest_join_850;
    }
    spill75_39 = life13_64;
    if (!((life5_5 == null))) {
        forestValue75_851_0 = spill75_39;
        break forest_join_851;
    }
    if (!(((com.moon.module.Module)(spill75_39)).isEnabled())) {
        break forest_join_850;
    }
    spill75_40 = life34_784;
    spill75_41 = (life35_589 + life30_320);
    spill75_42 = 0x1.0p0f;
    if (!((life5_5 == null))) {
        forestValue75_834_0 = spill75_40;
        forestValue75_834_1 = spill75_41;
        forestValue75_834_2 = spill75_42;
        break forest_join_834;
    }
    spill75_43 = (spill75_41 - spill75_42);
    if (!((life14_84 == null))) {
        forestValue75_833_0 = spill75_40;
        forestValue75_833_1 = spill75_43;
        break forest_join_833;
    }
    forestValue75_836_0 = spill75_40;
    forestValue75_836_1 = spill75_43;
    forestValue75_836_2 = ((life18_162 + (((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).d__kZ())).getValue())))).floatValue() * 0x1.0p1f)) + 0x1.0p1f);
    break forest_join_836;
    }
    forestValue75_834_0 = forestValue75_833_0;
    forestValue75_834_1 = forestValue75_833_1;
    forestValue75_834_2 = life36_773;
    }
    forestValue75_836_0 = forestValue75_834_0;
    forestValue75_836_1 = forestValue75_834_1;
    forestValue75_836_2 = (forestValue75_834_2 + 0x1.0p1f);
    }
    life40_897 = com.moon.i3.a(((float)(forestValue75_836_0)), ((float)(forestValue75_836_1)), ((float)(forestValue75_836_2)), ((float)(0x1.0p1f)), ((float)(0x0.0p0f)), ((int)(life33_572)));
    ((com.moon.i3)(life40_897)).e(((boolean)(false)));
    ((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).f())).a(((com.moon.iX)(life40_897)));
    }
    forestValue75_851_0 = life10_49;
    }
    if (!((life5_5 == null))) {
        forestValue75_865_0 = forestValue75_851_0;
        break forest_join_865;
    }
    if (!((forestValue75_851_0 == null))) {
        break forest_join_859;
    }
    ((com.moon.hW)(((com.moon.module.impl.HUD)(this.g)).f())).a(((com.moon.iX)(life37_805)));
    }
    life7_27 = (life7_27 + ((com.moon.module.Module)(life13_64)).b__Float());
    forestValue75_865_0 = life13_64;
    }
    life10_49 = forestValue75_865_0;
    life11_51 += 1;
    life12_53 += 1;
    }
    if (!((life5_5 != null))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    }
    ((moom.ir)(life6_15)).a__Void();
    }
    return;
}


private float a(java.lang.String p0, float p1) {
int forwardValue366_33_0;
    boolean spill366_0;
    long life3_3;
    java.lang.String[] life5_5;
    com.moon.jm life6_26;
    forward_join_33: {
    forward_join_29: {
    life3_3 = (com.moon.hq.j ^ 92423037494921L);
    life5_5 = com.moon.hq.b__ArrayString();
    spill366_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).q())).getValue())))).booleanValue();
    if (!((life5_5 == null))) {
        forwardValue366_33_0 = ((spill366_0) ? 1 : 0);
        break forward_join_33;
    }
    if (!(spill366_0)) {
        break forward_join_29;
    }
    life6_26 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).i__kY())).getValue())))).a__Supplier())).get()));
    return ((com.moon.jm)(life6_26)).a(((java.lang.String)(p0)), ((float)(p1)));
    }
    forwardValue366_33_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hq.a)).N)).a(((java.lang.String)(p0)));
    }
    return ((float) forwardValue366_33_0);
}


private float a(float p0) {
int forwardValue359_31_0;
    boolean spill359_0;
    long life2_3;
    java.lang.String[] life4_5;
    com.moon.jm life5_26;
    forward_join_31: {
    forward_join_28: {
    life2_3 = (com.moon.hq.j ^ 125072339975886L);
    life4_5 = com.moon.hq.b__ArrayString();
    spill359_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.HUD)(this.g)).q())).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue359_31_0 = ((spill359_0) ? 1 : 0);
        break forward_join_31;
    }
    if (!(spill359_0)) {
        break forward_join_28;
    }
    life5_26 = ((com.moon.jm)(((java.util.function.Supplier)(((com.moon.bW)(((com.moon.bW)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).i__kY())).getValue())))).a__Supplier())).get()));
    return ((com.moon.jm)(life5_26)).a(((float)(p0)));
    }
    forwardValue359_31_0 = ((net.minecraft.client.gui.FontRenderer)(((net.minecraft.client.Minecraft)(com.moon.hq.a)).N)).c;
    }
    return ((float) forwardValue359_31_0);
}


public int a__Int(float p0) {
return ((com.moon.hq)(this)).a(((float)(p0)), ((double)(0x1.194p12d)));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1497_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hq"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.module.impl.Effects a__lU() {
return this.f;
}


public long a() {
return this.e;
}


public java.util.Map<com.moon.module.Module, java.lang.Integer> a__Map() {
return this.d;
}


private java.lang.String a(com.moon.module.Module p0) {
java.lang.String forestValue60_57_0;
    java.lang.String forestValue60_69_0;
    java.lang.String spill60_0;
    long life2_3;
    java.lang.String[] life4_5;
    java.lang.String life5_58;
    forest_join_69: {
    forest_join_68: {
    forest_join_57: {
    forest_join_56: {
    forest_join_45: {
    forest_join_35: {
    forest_join_25: {
    forest_join_21: {
    life2_3 = (com.moon.hq.j ^ 131024880955502L);
    life4_5 = com.moon.hq.b__ArrayString();
    spill60_0 = ((com.moon.module.Module)(p0)).getSuffix();
    if (!((life4_5 == null))) {
        forestValue60_69_0 = spill60_0;
        break forest_join_69;
    }
    if (!((!((java.lang.String)(spill60_0)).isEmpty()))) {
        break forest_join_68;
    }
    switch ((com.moon.hr.d)[((com.moon.bX)(((com.moon.bX)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).d__kY())).getValue())))).ordinal()]) {
default:
{
        break forest_join_21;
    }
case 1:
{
        break forest_join_25;
    }
case 2:
{
        break forest_join_35;
    }
case 3:
{
        break forest_join_45;
    }
case 4:
{
        break forest_join_56;
    }
}
    }
    throw new java.lang.IncompatibleClassChangeError();
    }
    java.lang.String __stackOp60_12_0 = ((com.moon.module.Module)(p0)).getSuffix();
    java.lang.String __stackOp60_12_1 = __sourceIntrinsic_2255f5732a55_invokedynamic60_11(9170, (1965644896606051083L ^ life2_3));
    forestValue60_57_0 = __sourceIntrinsic_2255f5732a55_invokedynamic60_13(__stackOp60_12_1, __stackOp60_12_0);
    break forest_join_57;
    }
    java.lang.String __stackOp60_16_0 = ((com.moon.module.Module)(p0)).getSuffix();
    java.lang.String __stackOp60_16_1 = __sourceIntrinsic_2255f5732a55_invokedynamic60_15(13796, (8555127915696868667L ^ life2_3));
    forestValue60_57_0 = __sourceIntrinsic_2255f5732a55_invokedynamic60_17(__stackOp60_16_1, __stackOp60_16_0);
    break forest_join_57;
    }
    java.lang.String __stackOp60_20_0 = ((com.moon.module.Module)(p0)).getSuffix();
    java.lang.String __stackOp60_20_1 = __sourceIntrinsic_2255f5732a55_invokedynamic60_19(26319, (6493016137032146449L ^ life2_3));
    forestValue60_57_0 = __sourceIntrinsic_2255f5732a55_invokedynamic60_21(__stackOp60_20_1, __stackOp60_20_0, ")");
    break forest_join_57;
    }
    forestValue60_57_0 = "";
    }
    life5_58 = forestValue60_57_0;
    return ((java.lang.String)(((java.util.function.Function)(((com.moon.bZ)(((com.moon.bZ)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).e__kY())).getValue())))).a__Function())).apply(((java.lang.Object)(life5_58)))));
    }
    forestValue60_69_0 = "";
    }
    return forestValue60_69_0;
}


public java.util.List<com.moon.module.Module> a__List() {
return this.b;
}


public void a(com.moon.hW p0) {
this.c();
    return;
}


public com.moon.module.impl.HUD a__lY() {
return this.g;
}


public int a(float p0, double p1) {
int forestValue61_357_0;
    int forestValue61_364_0;
    java.lang.String[] spill61_0;
    int spill61_1;
    int spill61_2;
    int[] spill61_3;
    int[] spill61_4;
    int[] spill61_5;
    int[] spill61_6;
    int[] spill61_7;
    int[] spill61_8;
    int[] spill61_9;
    int[] spill61_10;
    int[] spill61_11;
    int[] spill61_12;
    int[] spill61_13;
    int[] spill61_14;
    int[] spill61_15;
    int[] spill61_16;
    int[] spill61_17;
    int[] spill61_18;
    int[] spill61_19;
    int[] spill61_20;
    int[] spill61_21;
    int[] spill61_22;
    int[] spill61_23;
    int[] spill61_24;
    int[] spill61_25;
    int[] spill61_26;
    int[] spill61_27;
    int[] spill61_28;
    int spill61_29;
    long life4_3;
    int life7_5;
    long life8_7;
    int life10_15;
    java.lang.String[] life6_16;
    int life11_23;
    long life12_39;
    int life14_48;
    int[] life15_86;
    int life7_109;
    long life12_116;
    int[] life14_155;
    long life12_185;
    int[] life14_240;
    long life12_270;
    int[] life14_325;
    forest_join_364: {
    forest_join_358: {
    forest_join_357: {
    forest_join_351: {
    forest_join_266: {
    forest_join_181: {
    forest_join_112: {
    forest_join_35: {
    life4_3 = (com.moon.hq.j ^ 94596250996824L);
    life7_5 = -1;
    life8_7 = java.lang.System.currentTimeMillis();
    spill61_0 = com.moon.hq.b__ArrayString();
    life10_15 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.g)).e__kX())).getValue())))).intValue();
    life6_16 = spill61_0;
    life11_23 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.g)).f__kX())).getValue())))).intValue();
    spill61_1 = (com.moon.hr.b)[((com.moon.bY)(((com.moon.bY)(((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(this.g)).f__kY())).getValue())))).ordinal()];
    if (!((life6_16 == null))) {
        forestValue61_357_0 = spill61_1;
        break forest_join_357;
    }
    switch (spill61_1) {
case 1:
{
        break forest_join_35;
    }
case 2:
{
        break forest_join_112;
    }
case 3:
{
        break forest_join_181;
    }
case 4:
{
        break forest_join_266;
    }
default:
{
        break forest_join_351;
    }
}
    }
    life12_39 = ((long) (0x1.8p0d * p1));
    spill61_2 = 12877;
    life14_48 = ((java.awt.Color)(((java.awt.Color)(((java.awt.Color)(new java.awt.Color(life10_15))).darker())).darker())).getRGB();
    int[] __stackOp61_23_0 = new int[__sourceIntrinsic_fd155ad6626c_invokedynamic61_22(spill61_2, (6793252098014146401L ^ life4_3))];
    spill61_3 = __stackOp61_23_0;
    (__stackOp61_23_0)[0] = life10_15;
    int[] __stackOp61_24_0 = spill61_3;
    spill61_4 = __stackOp61_24_0;
    (__stackOp61_24_0)[1] = life14_48;
    int[] __stackOp61_25_0 = spill61_4;
    spill61_5 = __stackOp61_25_0;
    (__stackOp61_25_0)[2] = life10_15;
    int[] __stackOp61_26_0 = spill61_5;
    spill61_6 = __stackOp61_26_0;
    (__stackOp61_26_0)[3] = life14_48;
    int[] __stackOp61_27_0 = spill61_6;
    spill61_7 = __stackOp61_27_0;
    (__stackOp61_27_0)[4] = life10_15;
    int[] __stackOp61_28_0 = spill61_7;
    spill61_8 = __stackOp61_28_0;
    (__stackOp61_28_0)[5] = life14_48;
    int[] __stackOp61_29_0 = spill61_8;
    spill61_9 = __stackOp61_29_0;
    (__stackOp61_29_0)[__sourceIntrinsic_fd155ad6626c_invokedynamic61_30(11932, (4078339156550841272L ^ life4_3))] = life10_15;
    life15_86 = spill61_9;
    life7_109 = com.moon.nD.a(((int[])(life15_86)), ((double)(((double) (((float) ((life8_7 + (((long) ((int) p0)) * __sourceIntrinsic_fd155ad6626c_invokedynamic61_31(8975, (4033367699625710120L ^ life4_3)))) % life12_39)) / (((float) life12_39) / 0x1.0p1f))))));
    if (!((life6_16 != null))) {
        break forest_join_358;
    }
    }
    life12_116 = ((long) (0x1.8p0d * p1));
    int[] __stackOp61_34_0 = new int[__sourceIntrinsic_fd155ad6626c_invokedynamic61_33(12877, (6793252098014146401L ^ life4_3))];
    spill61_10 = __stackOp61_34_0;
    (__stackOp61_34_0)[0] = life10_15;
    int[] __stackOp61_35_0 = spill61_10;
    spill61_11 = __stackOp61_35_0;
    (__stackOp61_35_0)[1] = life11_23;
    int[] __stackOp61_36_0 = spill61_11;
    spill61_12 = __stackOp61_36_0;
    (__stackOp61_36_0)[2] = life10_15;
    int[] __stackOp61_37_0 = spill61_12;
    spill61_13 = __stackOp61_37_0;
    (__stackOp61_37_0)[3] = life11_23;
    int[] __stackOp61_38_0 = spill61_13;
    spill61_14 = __stackOp61_38_0;
    (__stackOp61_38_0)[4] = life10_15;
    int[] __stackOp61_39_0 = spill61_14;
    spill61_15 = __stackOp61_39_0;
    (__stackOp61_39_0)[5] = life11_23;
    int[] __stackOp61_40_0 = spill61_15;
    spill61_16 = __stackOp61_40_0;
    (__stackOp61_40_0)[__sourceIntrinsic_fd155ad6626c_invokedynamic61_41(11932, (4078339156550841272L ^ life4_3))] = life10_15;
    life14_155 = spill61_16;
    life7_109 = com.moon.nD.a(((int[])(life14_155)), ((double)(((double) (((float) ((life8_7 + (((long) ((int) p0)) * __sourceIntrinsic_fd155ad6626c_invokedynamic61_42(8975, (4033367699625710120L ^ life4_3)))) % life12_116)) / (((float) life12_116) / 0x1.0p1f))))));
    if (!((life6_16 != null))) {
        break forest_join_358;
    }
    }
    life12_185 = ((long) (0x1.8p0d * p1));
    int[] __stackOp61_45_0 = new int[__sourceIntrinsic_fd155ad6626c_invokedynamic61_44(11932, (4078339156550841272L ^ life4_3))];
    spill61_17 = __stackOp61_45_0;
    (__stackOp61_45_0)[0] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_46(14100, (4566513949986908733L ^ life4_3));
    int[] __stackOp61_47_0 = spill61_17;
    spill61_18 = __stackOp61_47_0;
    (__stackOp61_47_0)[1] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_48(3505, (3578121519663468695L ^ life4_3));
    int[] __stackOp61_49_0 = spill61_18;
    spill61_19 = __stackOp61_49_0;
    (__stackOp61_49_0)[2] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_50(29210, (4751914989253734201L ^ life4_3));
    int[] __stackOp61_51_0 = spill61_19;
    spill61_20 = __stackOp61_51_0;
    (__stackOp61_51_0)[3] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_52(18864, (4592694107146589336L ^ life4_3));
    int[] __stackOp61_53_0 = spill61_20;
    spill61_21 = __stackOp61_53_0;
    (__stackOp61_53_0)[4] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_54(30221, (3712838677960928047L ^ life4_3));
    int[] __stackOp61_55_0 = spill61_21;
    spill61_22 = __stackOp61_55_0;
    (__stackOp61_55_0)[5] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_56(11277, (4589082087212544288L ^ life4_3));
    life14_240 = spill61_22;
    life7_109 = com.moon.nD.a(((int[])(life14_240)), ((double)(((double) (((float) ((life8_7 + (((long) ((int) p0)) * __sourceIntrinsic_fd155ad6626c_invokedynamic61_57(8975, (4033367699625710120L ^ life4_3)))) % life12_185)) / (((float) life12_185) / 0x1.0p1f))))));
    if (!((life6_16 != null))) {
        break forest_join_358;
    }
    }
    life12_270 = ((long) (0x1.8p0d * p1));
    int[] __stackOp61_60_0 = new int[__sourceIntrinsic_fd155ad6626c_invokedynamic61_59(11932, (4078339156550841272L ^ life4_3))];
    spill61_23 = __stackOp61_60_0;
    (__stackOp61_60_0)[0] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_61(9687, (1862284281453574392L ^ life4_3));
    int[] __stackOp61_62_0 = spill61_23;
    spill61_24 = __stackOp61_62_0;
    (__stackOp61_62_0)[1] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_63(287, (3149838358099483695L ^ life4_3));
    int[] __stackOp61_64_0 = spill61_24;
    spill61_25 = __stackOp61_64_0;
    (__stackOp61_64_0)[2] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_65(18666, (1330453449096598987L ^ life4_3));
    int[] __stackOp61_66_0 = spill61_25;
    spill61_26 = __stackOp61_66_0;
    (__stackOp61_66_0)[3] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_67(10311, (5553386721669838176L ^ life4_3));
    int[] __stackOp61_68_0 = spill61_26;
    spill61_27 = __stackOp61_68_0;
    (__stackOp61_68_0)[4] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_69(25888, (680806003448952843L ^ life4_3));
    int[] __stackOp61_70_0 = spill61_27;
    spill61_28 = __stackOp61_70_0;
    (__stackOp61_70_0)[5] = __sourceIntrinsic_fd155ad6626c_invokedynamic61_71(14619, (11874496534209585L ^ life4_3));
    life14_325 = spill61_28;
    life7_109 = com.moon.nD.a(((int[])(life14_325)), ((double)(((double) (((float) ((life8_7 + (((long) ((int) p0)) * __sourceIntrinsic_fd155ad6626c_invokedynamic61_72(8975, (4033367699625710120L ^ life4_3)))) % life12_270)) / (((float) life12_270) / 0x1.0p1f))))));
    if (!((life6_16 != null))) {
        break forest_join_358;
    }
    }
    forestValue61_357_0 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(this.g)).e__kX())).getValue())))).intValue();
    }
    return forestValue61_357_0;
    }
    spill61_29 = life7_109;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forestValue61_364_0 = spill61_29;
        break forest_join_364;
    }
    com.moon.hq.b(((java.lang.String[])(new java.lang.String[4])));
    forestValue61_364_0 = spill61_29;
    }
    return forestValue61_364_0;
}


public void a(com.moon.event.ModuleSuffixEvent p0) {
this.c();
    ((com.moon.hq)(this)).b__Void();
    return;
}


private double lambda$sortArraylist$0(com.moon.module.Module p0) {
return ((double) (-((com.moon.hq)(this)).a(((java.lang.String)(__sourceIntrinsic_8f006d7b518b_originalDynamicSite401_2(this.b(((com.moon.module.Module)(p0))), ((com.moon.hq)(this)).a(((com.moon.module.Module)(p0)))))), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.HUD)(this.g)).b__kZ())).getValue())))).floatValue())))));
}


private static java.lang.Integer lambda$renderPost$2(com.moon.module.Module p0, com.moon.module.Module p1) {
long local2 = (com.moon.hq.j ^ 90563184339691L);
    return ((java.lang.Integer)(((com.moon.setting.Setting)(((com.moon.module.Module)(p0)).getSetting(((java.lang.String)(__sourceIntrinsic_22d99261312b_originalDynamicSite402_1(15648, (6735493363615342456L ^ local2))))))).getValue()));
}


private static java.lang.Integer lambda$renderBackgroundPass$3(com.moon.module.Module p0, com.moon.module.Module p1) {
long local2 = (com.moon.hq.j ^ 98428718780999L);
    return ((java.lang.Integer)(((com.moon.setting.Setting)(((com.moon.module.Module)(p0)).getSetting(((java.lang.String)(__sourceIntrinsic_f314a6828bb8_originalDynamicSite403_1(24035, (8389131661970917142L ^ local2))))))).getValue()));
}


private static java.lang.Integer lambda$renderText$1(com.moon.module.Module p0, com.moon.module.Module p1) {
long local2 = (com.moon.hq.j ^ 82856041418470L);
    return ((java.lang.Integer)(((com.moon.setting.Setting)(((com.moon.module.Module)(p0)).getSetting(((java.lang.String)(__sourceIntrinsic_c14c1b7f0373_originalDynamicSite404_1(24035, (8389146257548467127L ^ local2))))))).getValue()));
}


private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_30(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fd155ad6626c_invokedynamic61_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_41(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fd155ad6626c_invokedynamic61_42(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_44(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_56(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fd155ad6626c_invokedynamic61_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_67(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_69(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd155ad6626c_invokedynamic61_71(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_fd155ad6626c_invokedynamic61_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dd8b543400f2_invokedynamic75_58(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_dd8b543400f2_invokedynamic75_195(com.moon.module.Module a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_dd8b543400f2_invokedynamic75_272(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2255f5732a55_invokedynamic60_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2255f5732a55_invokedynamic60_13(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2255f5732a55_invokedynamic60_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2255f5732a55_invokedynamic60_17(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2255f5732a55_invokedynamic60_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_2255f5732a55_invokedynamic60_21(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1497_0() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_b82a5b29b709_invokedynamic900020_55(com.moon.module.Module a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic900020_80(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_b82a5b29b709_invokedynamic900020_84(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_00fff17ad487_invokedynamic58_22(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_00fff17ad487_invokedynamic58_30(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_00fff17ad487_invokedynamic58_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_00fff17ad487_invokedynamic58_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_00fff17ad487_invokedynamic58_42(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_00fff17ad487_invokedynamic58_43(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_a2a3c1850a33_invokedynamic369_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.ToDoubleFunction __sourceIntrinsic_9bf881b104f5_originalDynamicSite400_1(com.moon.hq a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral1486_0() throws E;

private static native <E extends Throwable> java.util.function.Function __sourceIntrinsic_f0efb0c1e576_invokedynamic76_62(com.moon.module.Module a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f0efb0c1e576_invokedynamic76_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_5c8d2e4b3bac_methodHandleLiteral1482_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f314a6828bb8_originalDynamicSite403_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_22d99261312b_originalDynamicSite402_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_c14c1b7f0373_originalDynamicSite404_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8f006d7b518b_originalDynamicSite401_2(java.lang.String a0, java.lang.String a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
