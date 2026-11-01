package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Blink extends com.moon.module.Module {

private com.moon.setting.ModeSetting<com.moon.bk> s;

private com.moon.setting.IntegerSetting t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.IntegerSetting v;

public com.moon.setting.MultiSelectSetting<com.moon.bl> w;

private com.moon.setting.BooleanSetting x;

private com.moon.gs y;

private com.moon.gt z;

private com.moon.gr A;

private java.util.LinkedList<moom.DN<moom.yK<?>, java.lang.Long>> B;

private long C;

private double D;

private static long E;

private static java.lang.String[] F;

private static java.lang.String[] G;

private static java.util.Map H;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

public Blink(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_8ea7be9e53b5b8cd(com.moon.module.impl.Blink receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.Blink.E ^ 99040869665274L);

    int __sourceSpill2_4 = com.moon.bk.c();

    com.moon.module.impl.Blink.__sourceConstructorInit_8ea7be9e53b5b8cd_0(((com.moon.module.impl.Blink)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    int local7_life6 = __sourceSpill2_4;

    ((com.moon.module.impl.Blink)(receiver)).s = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_8(19576, (1856404188496268254L ^ local5_life2)))), ((java.lang.Class)(com.moon.bk.class))))).a(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_12(21766, (2278510199458042537L ^ local5_life2)))), ((java.lang.Enum)(com.moon.bk.NORMAL))))).a()));

    ((com.moon.module.impl.Blink)(receiver)).t = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_18(4953, (6353923285781763313L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_21(15968, (8922012708807113166L ^ local5_life2)))), ((int)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_23(7152, (5846901977740301219L ^ local5_life2)))), ((int)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_25(19552, (4998459389051634738L ^ local5_life2)))), ((int)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_27(10526, (1735542629525774664L ^ local5_life2)))), ((int)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_29(15543, (8821416620622312679L ^ local5_life2))))))).a()));

    ((com.moon.module.impl.Blink)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_34(10413, (6111457851689070344L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_37(7355, (3051926306097748752L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_39(receiver)))))).a()));

    com.moon.module.impl.Blink __sourceSpill2_54 = receiver;

    com.moon.mf __sourceSpill2_55 = ((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_44(4432, (8875052131747256057L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_47(8989, (1510501986832770234L ^ local5_life2)))), ((int)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_49(32685, (4543975615692453884L ^ local5_life2)))), ((int)(2)), ((int)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_51(5555, (8269609177120857572L ^ local5_life2)))), ((int)(2)));

    com.moon.setting.BooleanSetting __sourceEffectfulDup2_56 = ((com.moon.module.impl.Blink)(receiver)).u;

    com.moon.setting.BooleanSetting __sourceSpill2_58 = __sourceEffectfulDup2_56;

    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup2_56)));

    ((com.moon.module.impl.Blink)(__sourceSpill2_54)).v = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(__sourceSpill2_55)).a(((java.util.function.Supplier)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_59(__sourceSpill2_58)))))).a()));

    ((com.moon.module.impl.Blink)(receiver)).w = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_64(6249, (7520331551292153805L ^ local5_life2)))), ((java.lang.Class)(com.moon.bl.class))))).a(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_68(28071, (4995638726248770058L ^ local5_life2)))), ((java.lang.Enum[])(new com.moon.bl[0]))))).a()));

    ((com.moon.module.impl.Blink)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_73(30134, (9095159493838090780L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_76(5676, (328482571346825600L ^ local5_life2)))), ((boolean)(true))))).a(((java.util.function.Supplier)(__sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_78(receiver)))))).a()));

    ((com.moon.module.impl.Blink)(receiver)).y = ((com.moon.gs)(new com.moon.gs()));

    ((com.moon.module.impl.Blink)(receiver)).z = ((com.moon.gt)(new com.moon.gt()));

    ((com.moon.module.impl.Blink)(receiver)).A = ((com.moon.gr)(new com.moon.gr(((com.moon.module.impl.Blink)(receiver)).y, ((com.moon.module.impl.Blink)(receiver)).z)));

    ((com.moon.module.impl.Blink)(receiver)).B = ((java.util.LinkedList)(new java.util.LinkedList()));

    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {

        local7_life6 += 1;

        com.moon.bk.b(((int)(local7_life6)));

    }

    return;

}



static {
E = ((long)(((moom._a)(moom._c.a(((long)(8419454741674025305L)), ((long)(3132165932199194757L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(267909985328118L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Blink.E ^ 125214914225070L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill262_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill262_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill262_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill262_14 = new byte[8];
    (__sourceSpill262_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill262_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation262_16 = __sourceSpill262_14;
    ((javax.crypto.Cipher)(__sourceSpill262_11)).init(((int)(__sourceSpill262_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill262_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation262_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[12];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\177,7s?o¨ {7sæÝ}®AçÀ]A\\éîk¸N P\037pª¤Émd\r®©Ðy&\030KÑ õtÖ\036Y$óÅ¥\020¼ì2©2¬`j)\024G(1Zç\020t\006É;`J\026\001Aá'lè0ÑW$\030á¢*ïp¿3Æ\032>6QÿºÕ\002\026LÇPr ÁIK¤ û§û¦\032Z¼\020¡í³Xt;çÇÙ¹\\\024lÞB\030Ì®Ðâì\023ÌR&ÕÑ0Þj&\030c`Õzk(\005±ú\\àíÝÞâÅ\017V\\ãGMeØÚàA\020|{R®\b8méÚ$å,zd ;Çnoß´\031X:|\026ä¹?à÷0pê\177ÙfC\fª vã¬CV}Z¢Èl\033\177 eJ7F\000¾U¥ÈhÞB\000\000¨"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill262_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill262_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill262_29)).doFinal(((byte[])(__sourceSpill262_28)));
        java.lang.String __sourceSpill262_34 = ((java.lang.String)(com.moon.module.impl.Blink.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill262_35 = local20_life19;
        int __sourceSpill262_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill262_35)[__sourceSpill262_36] = __sourceSpill262_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "¡(gÌ\037Ø÷¤\000Ü¶cPÓGÊh! Kä:üô¢\031\036´2=;\017¾\030Ð\177\025\030h°ã©kÇF3&YKý5FÏ{°"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill262_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill262_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill262_42)).doFinal(((byte[])(__sourceSpill262_41)));
        java.lang.String __sourceSpill262_47 = ((java.lang.String)(com.moon.module.impl.Blink.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill262_48 = local20_life19;
        int __sourceSpill262_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill262_48)[__sourceSpill262_49] = __sourceSpill262_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    F = ((java.lang.String[])(local20_life19));
    G = ((java.lang.String[])(new java.lang.String[12]));
    K = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill262_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill262_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill262_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill262_60 = new byte[8];
    (__sourceSpill262_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill262_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation262_62 = __sourceSpill262_60;
    ((javax.crypto.Cipher)(__sourceSpill262_57)).init(((int)(__sourceSpill262_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill262_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation262_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[6];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ã\021æÉ:êV} G«eöÉ`R<úÂ\032y{(¨m(lqJ¹"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill262_71 = local4_life67;
        int __sourceSpill262_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill262_71)).substring(((int)(__sourceSpill262_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill262_76 = local6_life65;
        int __sourceSpill262_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill262_79 = new byte[8];
        (__sourceSpill262_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill262_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill262_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill262_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill262_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill262_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill262_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill262_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill262_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill262_80)).doFinal(((byte[])(__sourceSpill262_79)));
        (__sourceSpill262_76)[__sourceSpill262_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "§Öpj>Â¨ªMi\004»câ{­"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill262_84 = local4_life67;
        int __sourceSpill262_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill262_84)).substring(((int)(__sourceSpill262_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill262_89 = local6_life65;
        int __sourceSpill262_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill262_92 = new byte[8];
        (__sourceSpill262_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill262_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill262_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill262_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill262_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill262_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill262_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill262_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill262_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill262_93)).doFinal(((byte[])(__sourceSpill262_92)));
        (__sourceSpill262_89)[__sourceSpill262_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    I = ((long[])(local6_life65));
    J = ((java.lang.Integer[])(new java.lang.Integer[6]));
}

private static native <E extends Throwable> void __sourceConstructorInit_8ea7be9e53b5b8cd_0(com.moon.module.impl.Blink a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Blink.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2404_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 28447);
    if (((com.moon.module.impl.Blink.G)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Blink.H)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Blink.H)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lh", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Blink.F)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Blink.G)[life5_8] = com.moon.module.impl.Blink.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Blink.G)[life5_8];
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
        byte[] spill1052_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1052_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1052_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1052_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1052_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1052_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void onEnable() {
((com.moon.gs)(this.y)).a(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).K)));
    ((com.moon.gt)(this.z)).a__Void();
    return;
}


private void f() {
double local1 = (((double) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.t)).getValue())))).intValue()) * (((double) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.v)).getValue())))).intValue()) / 0x1.9p6d));
    this.D = ((double)(java.lang.Math.min(((double)(((double) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.t)).getValue())))).intValue()))), ((double)((this.D + local1))))));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24800;
      if (J[var3] == null) {
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
         long var5 = I[var3];
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
         Object[] var9 = (Object[])K.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               K.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lh", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         J[var3] = var15;
      }

      return J[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Blink.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2407_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lh"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void onDisable() {
((com.moon.module.impl.Blink)(this)).a(((long)(0L)));
    return;
}


public void a(com.moon.eQ p0) {
int forwardValue77_52_0;
    int spill77_0;
    long life2_3;
    int life4_5;
    long life5_48;
    forward_join_62: {
    forward_join_58: {
    forward_join_52: {
    forward_join_45: {
    forward_join_33: {
    forward_join_32: {
    forward_join_29: {
    forward_join_20: {
    forward_join_13: {
    life2_3 = (com.moon.module.impl.Blink.E ^ 102131595865905L);
    life4_5 = com.moon.bk.c();
    if (!((life4_5 != 0))) {
        break forward_join_20;
    }
    if (!((((com.moon.eQ)(p0)).a() != com.moon.a1.PRE))) {
        break forward_join_13;
    }
    return;
    }
    ((com.moon.module.impl.Blink)(this)).setSuffix(((java.lang.String)(((com.moon.bk)(((com.moon.bk)(((com.moon.setting.ModeSetting)(this.s)).getValue())))).a__String())));
    }
    if (!((life4_5 != 0))) {
        break forward_join_32;
    }
    if (!((((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).K != null))) {
        break forward_join_29;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).K)).F)) {
        break forward_join_33;
    }
    }
    ((com.moon.module.impl.Blink)(this)).a(((long)(0L)));
    }
    return;
    }
    life5_48 = java.lang.System.currentTimeMillis();
    spill77_0 = (com.moon.gq.a)[((com.moon.bk)(((com.moon.bk)(((com.moon.setting.ModeSetting)(this.s)).getValue())))).ordinal()];
    if (!((life4_5 != 0))) {
        forwardValue77_52_0 = spill77_0;
        break forward_join_52;
    }
    switch (spill77_0) {
case 1:
{
        break forward_join_45;
    }
case 2:
{
        break forward_join_58;
    }
default:
{
        break forward_join_62;
    }
}
    }
    forwardValue77_52_0 = recovery.source.CarrierOps.lcmp(((long)((life5_48 - this.C))), ((long)(((com.moon.module.impl.Blink)(this)).a())));
    }
    if (!((forwardValue77_52_0 > 0))) {
        break forward_join_62;
    }
    ((com.moon.module.impl.Blink)(this)).a(((long)(0L)));
    if (!((life4_5 == 0))) {
        break forward_join_62;
    }
    }
    ((com.moon.module.impl.Blink)(this)).a(((long)(((com.moon.module.impl.Blink)(this)).a())));
    }
    return;
}


private long a() {
return ((long) this.D);
}


public void a(com.moon.event.PacketEvent p0) {
moom.yK forwardValue806_20_0;
    int forwardValue806_35_0;
    int forwardValue806_85_0;
    int forwardValue806_97_0;
    com.moon.module.impl.Blink forwardValue806_108_0;
    int forwardValue806_112_0;
    int forwardValue806_119_0;
    int forwardValue806_129_0;
    int forwardValue806_147_0;
    com.moon.module.impl.Blink forwardValue806_149_0;
    int spill806_0;
    boolean spill806_1;
    moom.yK spill806_2;
    int spill806_3;
    int spill806_4;
    com.moon.module.impl.Blink spill806_5;
    boolean spill806_6;
    com.moon.module.impl.Blink spill806_7;
    long life2_3;
    moom.yK life5_7;
    int life4_8;
    moom.zL life6_33;
    long life6_52;
    moom.DN life8_59;
    moom.y6 life9_79;
    net.minecraft.entity.Entity life10_84;
    net.minecraft.entity.player.EntityPlayer life11_95;
    forward_join_151: {
    forward_join_149: {
    forward_join_147: {
    forward_join_142: {
    forward_join_129: {
    forward_join_125: {
    forward_join_119: {
    forward_join_112: {
    forward_join_110: {
    forward_join_108: {
    forward_join_107: {
    forward_join_97: {
    forward_join_95: {
    forward_join_85: {
    forward_join_83: {
    forward_join_37: {
    forward_join_35: {
    forward_join_33: {
    forward_join_32: {
    forward_join_29: {
    forward_join_20: {
    life2_3 = (com.moon.module.impl.Blink.E ^ 28424825156430L);
    spill806_0 = com.moon.bk.b();
    life5_7 = ((com.moon.event.PacketEvent)(p0)).getPacket();
    life4_8 = spill806_0;
    spill806_1 = ((com.moon.event.PacketEvent)(p0)).b__sourceReturn_aae029aa0a();
    if (!((life4_8 == 0))) {
        forwardValue806_35_0 = ((spill806_1) ? 1 : 0);
        break forward_join_35;
    }
    if (!((!spill806_1))) {
        break forward_join_33;
    }
    spill806_2 = life5_7;
    if (!((life4_8 == 0))) {
        forwardValue806_20_0 = spill806_2;
        break forward_join_20;
    }
    if (!((((spill806_2 instanceof moom.zL) ? 1 : 0) != 0))) {
        break forward_join_32;
    }
    forwardValue806_20_0 = life5_7;
    }
    life6_33 = ((moom.zL)(forwardValue806_20_0));
    if (!((((moom.zL)(life6_33)).a() != ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).K)).e__Int()))) {
        break forward_join_29;
    }
    return;
    }
    ((com.moon.gr)(this.A)).b();
    }
    return;
    }
    forwardValue806_35_0 = ((((com.moon.event.PacketEvent)(p0)).isCancelled()) ? 1 : 0);
    }
    if (!((forwardValue806_35_0 != 0))) {
        break forward_join_37;
    }
    return;
    }
    life6_52 = java.lang.System.currentTimeMillis();
    life8_59 = new moom.DN(life5_7, java.lang.Long.valueOf(((long)(life6_52))));
    ((java.util.LinkedList)(this.B)).add(((java.lang.Object)(life8_59)));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    spill806_3 = ((life5_7 instanceof moom.y6) ? 1 : 0);
    if (!((life4_8 == 0))) {
        forwardValue806_85_0 = spill806_3;
        break forward_join_85;
    }
    if (!((spill806_3 != 0))) {
        break forward_join_83;
    }
    life9_79 = ((moom.y6)(life5_7));
    life10_84 = ((moom.y6)(life9_79)).a(((net.minecraft.world.World)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).I)));
    spill806_4 = ((life10_84 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life4_8 == 0))) {
        forwardValue806_85_0 = spill806_4;
        break forward_join_85;
    }
    if (!((spill806_4 != 0))) {
        break forward_join_83;
    }
    life11_95 = ((net.minecraft.entity.player.EntityPlayer)(life10_84));
    ((com.moon.gt)(this.z)).a(((net.minecraft.entity.player.EntityPlayer)(life11_95)));
    ((com.moon.gr)(this.A)).c();
    }
    forwardValue806_85_0 = ((life5_7 instanceof moom.za) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue806_97_0 = forwardValue806_85_0;
        break forward_join_97;
    }
    if (!((forwardValue806_85_0 != 0))) {
        break forward_join_95;
    }
    spill806_5 = this;
    if (!((life4_8 == 0))) {
        forwardValue806_108_0 = spill806_5;
        break forward_join_108;
    }
    if (!((!((com.moon.setting.MultiSelectSetting)(((com.moon.module.impl.Blink)(spill806_5)).w)).isSelected(((java.lang.Enum)(com.moon.bl.DIGGING)))))) {
        break forward_join_107;
    }
    }
    forwardValue806_97_0 = ((life5_7 instanceof moom.zb) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue806_112_0 = forwardValue806_97_0;
        break forward_join_112;
    }
    if (!((forwardValue806_97_0 != 0))) {
        break forward_join_110;
    }
    spill806_6 = ((com.moon.setting.MultiSelectSetting)(this.w)).isSelected(((java.lang.Enum)(com.moon.bl.RIGHT_CLICK)));
    if (!((life4_8 == 0))) {
        forwardValue806_112_0 = ((spill806_6) ? 1 : 0);
        break forward_join_112;
    }
    if (!(spill806_6)) {
        break forward_join_110;
    }
    }
    forwardValue806_108_0 = this;
    }
    ((com.moon.gr)(((com.moon.module.impl.Blink)(forwardValue806_108_0)).A)).a();
    }
    forwardValue806_112_0 = ((life5_7 instanceof moom.y7) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue806_119_0 = forwardValue806_112_0;
        break forward_join_119;
    }
    if (!((forwardValue806_112_0 != 0))) {
        break forward_join_151;
    }
    forwardValue806_119_0 = ((((com.moon.setting.MultiSelectSetting)(this.w)).isSelected(((java.lang.Enum)(com.moon.bl.ATTACK_DAMAGE)))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue806_129_0 = forwardValue806_119_0;
        break forward_join_129;
    }
    if (!((forwardValue806_119_0 != 0))) {
        break forward_join_125;
    }
    ((com.moon.gr)(this.A)).d();
    }
    forwardValue806_129_0 = ((((com.moon.setting.MultiSelectSetting)(this.w)).isSelected(((java.lang.Enum)(com.moon.bl.EXIT_TARGET_RANGE)))) ? 1 : 0);
    }
    if (!((life4_8 == 0))) {
        forwardValue806_147_0 = forwardValue806_129_0;
        break forward_join_147;
    }
    if (!((forwardValue806_129_0 != 0))) {
        break forward_join_142;
    }
    ((com.moon.gr)(this.A)).a(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).K)), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())));
    }
    spill806_7 = this;
    if (!((life4_8 == 0))) {
        forwardValue806_149_0 = spill806_7;
        break forward_join_149;
    }
    forwardValue806_147_0 = ((((com.moon.gr)(((com.moon.module.impl.Blink)(spill806_7)).A)).a__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue806_147_0 != 0))) {
        break forward_join_151;
    }
    forwardValue806_149_0 = this;
    }
    ((com.moon.module.impl.Blink)(forwardValue806_149_0)).a(((long)(0L)));
    }
    return;
}


private void a(long p0) {
java.lang.Object lexicalValue229_55_0;
    net.minecraft.client.network.NetHandlerPlayClient spill229_0;
    long life3_3;
    int life5_5;
    long life6_14;
    moom.DN life8_20;
    moom.yK life9_25;
    long life10_30;
    lexical_join_61: {
    lexical_join_58: {
    lexical_join_11: {
    life3_3 = (com.moon.module.impl.Blink.E ^ 136801793052950L);
    life5_5 = com.moon.bk.c();
    if (!(((java.util.LinkedList)(this.B)).isEmpty())) {
        break lexical_join_11;
    }
    return;
    }
    life6_14 = java.lang.System.currentTimeMillis();
    lexical_cycle_13: while (true) {
    lexical_join_55: {
    lexical_join_52: {
    lexical_join_39: {
    if (!(((life8_20 = ((moom.DN)(((java.util.LinkedList)(this.B)).peek()))) != null))) {
        break lexical_join_58;
    }
    life9_25 = ((moom.yK)(((moom.DN)(life8_20)).a()));
    life10_30 = ((java.lang.Long)(((java.lang.Long)(((moom.DN)(life8_20)).b())))).longValue();
    if (!((life5_5 != 0))) {
        break lexical_join_61;
    }
    if (!((recovery.source.CarrierOps.lcmp(((long)((life6_14 - life10_30))), ((long)(p0))) < 0))) {
        break lexical_join_39;
    }
    if (!((life5_5 == 0))) {
        break lexical_join_58;
    }
    }
    spill229_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).a__jS();
    if (!((life5_5 != 0))) {
        lexicalValue229_55_0 = spill229_0;
        break lexical_join_55;
    }
    if (!((spill229_0 != null))) {
        break lexical_join_52;
    }
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Blink.d)).a__jS())).b(((moom.yK)(life9_25)));
    ((com.moon.gs)(this.y)).a(((moom.yK)(life9_25)));
    }
    lexicalValue229_55_0 = ((java.util.LinkedList)(this.B)).poll();
    }
    recovery.source.CarrierOps.discard(lexicalValue229_55_0);
    if (!((life5_5 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    this.C = ((long)(life6_14));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.MoveEvent p0) {
long local2 = (com.moon.module.impl.Blink.E ^ 122071752793497L);
    int local4 = com.moon.bk.b();
    if ((local4 == 0)) {
        if ((((com.moon.event.MoveEvent)(p0)).getPhase() != com.moon.event.MovePhase.PRE)) {
        return;
    }
        ((com.moon.module.impl.Blink)(this)).f();
    }
    return;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.Blink.E ^ 76105899554300L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.ModeSetting)(this.s)).getValue() != com.moon.bk.NORMAL) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
return java.lang.Boolean.valueOf(((boolean)(((com.moon.setting.MultiSelectSetting)(this.w)).isSelected(((java.lang.Enum)(com.moon.bl.EXIT_TARGET_RANGE))))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_39(com.moon.module.impl.Blink a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_51(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_59(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_73(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_8ea7be9e53b5b8cd_originalDynamicSite2_78(com.moon.module.impl.Blink a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2404_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2407_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
