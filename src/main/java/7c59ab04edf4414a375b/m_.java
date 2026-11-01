package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class m_ extends com.moon.m5 {

private com.moon.nY n;

private com.moon.nX o;

private com.moon.nX p;

private com.moon.nX q;

private java.util.Map<java.lang.Integer, com.moon.nY> r;

private com.moon.nX s;

private com.moon.nX t;

private java.util.Map<java.lang.String, com.moon.nX> u;

private com.moon.setting.StringListSetting v;

private int w;

private int x;

private boolean y;

private boolean z;

private java.lang.String A;

private boolean B;

private boolean C;

private long D;

private boolean E;

private boolean F;

private static long H;

private static java.lang.String[] J;

private static java.lang.String[] K;

private static java.util.Map L;

private static long[] N;

private static java.lang.Integer[] O;

private static java.util.Map P;

private static long[] R;

private static java.lang.Long[] S;

private static java.util.Map T;

public m_(com.moon.nh p0, com.moon.setting.StringListSetting p1, float p2, float p3, float p4, float p5) { super((com.moon.nh)null, 0.0F, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_7839a24ccc30e040(com.moon.m_ receiver, com.moon.nh p0, com.moon.setting.StringListSetting p1, float p2, float p3, float p4, float p5) throws Throwable {
init_join_101: {
    init_join_98: {
    long local7_life2 = (com.moon.m_.H ^ 75264771238175L);
    net.minecraft.entity.Entity[] __sourceSpill139_4 = moom.lw.b__Arrayr3();
    com.moon.m_.__sourceConstructorInit_7839a24ccc30e040_0(((com.moon.m_)(receiver)), ((com.moon.nh)(p0)), ((float)(p2)), ((float)(p3)), ((float)(p4)), ((float)(p5)));
    ((com.moon.m_)(receiver)).n = ((com.moon.nY)(new com.moon.nY(__sourceIntrinsic_7839a24ccc30e040_originalDynamicSite139_7(24592, (8442626886994651218L ^ local7_life2)), com.moon.cj.EASE_IN_OUT_CUBIC)));
    ((com.moon.m_)(receiver)).o = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.m_)(receiver)).p = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.m_)(receiver)).q = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.m_)(receiver)).r = ((java.util.Map)(new java.util.HashMap()));
    ((com.moon.m_)(receiver)).s = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.m_)(receiver)).t = ((com.moon.nX)(new com.moon.nX()));
    ((com.moon.m_)(receiver)).u = ((java.util.Map)(new java.util.HashMap()));
    net.minecraft.entity.Entity[] local9_life17 = __sourceSpill139_4;
    ((com.moon.m_)(receiver)).w = ((int)(-1));
    ((com.moon.m_)(receiver)).x = ((int)(-1));
    ((com.moon.m_)(receiver)).A = ((java.lang.String)(""));
    ((com.moon.m_)(receiver)).v = ((com.moon.setting.StringListSetting)(p1));
    int local10_life22 = 0;
    init_cycle_73: while (true) {
    if (!((local10_life22 < ((java.util.List)(((com.moon.setting.StringListSetting)(p1)).getValues())).size()))) {
        break init_join_98;
    }
    ((java.util.Map)(((com.moon.m_)(receiver)).r)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(local10_life22))))), ((java.lang.Object)(new com.moon.nY(__sourceIntrinsic_7839a24ccc30e040_originalDynamicSite139_28(7191, (8232562651178931284L ^ local7_life2)), com.moon.cj.EASE_IN_OUT_CUBIC))));
    local10_life22 += 1;
    if (!((local9_life17 == null))) {
        break init_join_101;
    }
    if (!((local9_life17 != null))) { continue init_cycle_73; }
    break init_cycle_73;
    }
    }
    ((com.moon.nY)(((com.moon.m_)(receiver)).n)).b__Void();
    }
    return;
}


static {
H = ((long)(((moom._a)(moom._c.a(((long)(8974986867813766291L)), ((long)(-5937352215194127396L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272170672151001L)))));
    L = ((java.util.Map)(new java.util.HashMap(13)));
    long local22_life7 = (com.moon.m_.H ^ 67557141527744L);
    javax.crypto.Cipher local24_life9;
    javax.crypto.Cipher __sourceSpill248_11 = (local24_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill248_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill248_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill248_14 = new byte[8];
    (__sourceSpill248_14)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local25_life15 = 1;
    while ((local25_life15 < 8)) {
        (__sourceSpill248_14)[local25_life15] = ((byte) ((int) ((local22_life7 << (local25_life15 * 8)) >>> 56)));
        local25_life15 += 1;
    }
    byte[] __sourcePreallocation248_16 = __sourceSpill248_14;
    ((javax.crypto.Cipher)(__sourceSpill248_11)).init(((int)(__sourceSpill248_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill248_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation248_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local31_life19 = new java.lang.String[2];
    int local29_life20 = 0;
    java.lang.String local28_life21;
    int local30_life23 = ((java.lang.String)((local28_life21 = "\néAªVï÷sA±ÎGq>*ìÔ\004(+ô>Ê»Óá\nP¨\024\020öõ X\033)æî<¸Ùp\037¯üì\005qöjÎ\002S\007øu¬PIÿQw\005¦\031è^a¶M~\":l\036O¡\013Hà :\033£§Ñm\035<²ÚÙ\033¡Õ/D\030\025uxå"))).length();
    int local27_life24 = 32;
    int local26_life25 = -1;
    while (true) {
        local26_life25 += 1;
        byte[] __sourceSpill248_28 = ((java.lang.String)(((java.lang.String)(local28_life21)).substring(((int)(local26_life25)), ((int)((local26_life25 + local27_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill248_29 = local24_life9;
        byte[] local32_life31 = ((javax.crypto.Cipher)(__sourceSpill248_29)).doFinal(((byte[])(__sourceSpill248_28)));
        java.lang.String __sourceSpill248_34 = ((java.lang.String)(com.moon.m_.a(((byte[])(local32_life31))))).intern();
        java.lang.String[] __sourceSpill248_35 = local31_life19;
        int __sourceSpill248_36 = local29_life20;
        local29_life20 += 1;
        (__sourceSpill248_35)[__sourceSpill248_36] = __sourceSpill248_34;
        if (!(((local26_life25 = (local26_life25 + local27_life24)) < local30_life23))) { break; }
        local27_life24 = ((java.lang.String)(local28_life21)).charAt(((int)(local26_life25)));
    }
    J = ((java.lang.String[])(local31_life19));
    K = ((java.lang.String[])(new java.lang.String[2]));
    P = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local11_life42;
    javax.crypto.Cipher __sourceSpill248_44 = (local11_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill248_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill248_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill248_47 = new byte[8];
    (__sourceSpill248_47)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local12_life48 = 1;
    while ((local12_life48 < 8)) {
        (__sourceSpill248_47)[local12_life48] = ((byte) ((int) ((local22_life7 << (local12_life48 * 8)) >>> 56)));
        local12_life48 += 1;
    }
    byte[] __sourcePreallocation248_49 = __sourceSpill248_47;
    ((javax.crypto.Cipher)(__sourceSpill248_44)).init(((int)(__sourceSpill248_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill248_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation248_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local17_life52 = new long[11];
    int local14_life53 = 0;
    java.lang.String local15_life54;
    int local16_life56 = ((java.lang.String)((local15_life54 = "[Ñ+¼`k\024uËo|àÚÕ.\037ÂÜ~ÎÒË¥Å©Q\036\004PñÀôØä+áüõQa\016ùÑÛµÑ±nYÆ7¸A\027ã~'K7eó"))).length();
    int local13_life57 = 0;
    do {
        java.lang.String __sourceSpill248_58 = local15_life54;
        int __sourceSpill248_59 = local13_life57;
        local13_life57 += 8;
        byte[] local18_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill248_58)).substring(((int)(__sourceSpill248_59)), ((int)(local13_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill248_63 = local17_life52;
        int __sourceSpill248_64 = local14_life53;
        local14_life53 += 1;
        long local19_life65 = (((((((((((long) (local18_life62)[0]) & 255L) << 56) | ((((long) (local18_life62)[1]) & 255L) << 48)) | ((((long) (local18_life62)[2]) & 255L) << 40)) | ((((long) (local18_life62)[3]) & 255L) << 32)) | ((((long) (local18_life62)[4]) & 255L) << 24)) | ((((long) (local18_life62)[5]) & 255L) << 16)) | ((((long) (local18_life62)[6]) & 255L) << 8)) | (((long) (local18_life62)[7]) & 255L));
        byte[] __sourceSpill248_66 = new byte[8];
        (__sourceSpill248_66)[0] = ((byte) ((int) (local19_life65 >>> 56)));
        (__sourceSpill248_66)[1] = ((byte) ((int) (local19_life65 >>> 48)));
        (__sourceSpill248_66)[2] = ((byte) ((int) (local19_life65 >>> 40)));
        (__sourceSpill248_66)[3] = ((byte) ((int) (local19_life65 >>> 32)));
        (__sourceSpill248_66)[4] = ((byte) ((int) (local19_life65 >>> 24)));
        (__sourceSpill248_66)[5] = ((byte) ((int) (local19_life65 >>> 16)));
        (__sourceSpill248_66)[6] = ((byte) ((int) (local19_life65 >>> 8)));
        (__sourceSpill248_66)[7] = ((byte) ((int) local19_life65));
        javax.crypto.Cipher __sourceSpill248_67 = local11_life42;
        byte[] local21_life69 = ((javax.crypto.Cipher)(__sourceSpill248_67)).doFinal(((byte[])(__sourceSpill248_66)));
        (__sourceSpill248_63)[__sourceSpill248_64] = (((((((((((long) (local21_life69)[0]) & 255L) << 56) | ((((long) (local21_life69)[1]) & 255L) << 48)) | ((((long) (local21_life69)[2]) & 255L) << 40)) | ((((long) (local21_life69)[3]) & 255L) << 32)) | ((((long) (local21_life69)[4]) & 255L) << 24)) | ((((long) (local21_life69)[5]) & 255L) << 16)) | ((((long) (local21_life69)[6]) & 255L) << 8)) | (((long) (local21_life69)[7]) & 255L));
    } while ((!(local13_life57 >= local16_life56)));
    local16_life56 = ((java.lang.String)((local15_life54 = "«>@÷µI´ÔÀû8"))).length();
    local13_life57 = 0;
    do {
        java.lang.String __sourceSpill248_71 = local15_life54;
        int __sourceSpill248_72 = local13_life57;
        local13_life57 += 8;
        byte[] local18_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill248_71)).substring(((int)(__sourceSpill248_72)), ((int)(local13_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill248_76 = local17_life52;
        int __sourceSpill248_77 = local14_life53;
        local14_life53 += 1;
        long local19_life78 = (((((((((((long) (local18_life75)[0]) & 255L) << 56) | ((((long) (local18_life75)[1]) & 255L) << 48)) | ((((long) (local18_life75)[2]) & 255L) << 40)) | ((((long) (local18_life75)[3]) & 255L) << 32)) | ((((long) (local18_life75)[4]) & 255L) << 24)) | ((((long) (local18_life75)[5]) & 255L) << 16)) | ((((long) (local18_life75)[6]) & 255L) << 8)) | (((long) (local18_life75)[7]) & 255L));
        byte[] __sourceSpill248_79 = new byte[8];
        (__sourceSpill248_79)[0] = ((byte) ((int) (local19_life78 >>> 56)));
        (__sourceSpill248_79)[1] = ((byte) ((int) (local19_life78 >>> 48)));
        (__sourceSpill248_79)[2] = ((byte) ((int) (local19_life78 >>> 40)));
        (__sourceSpill248_79)[3] = ((byte) ((int) (local19_life78 >>> 32)));
        (__sourceSpill248_79)[4] = ((byte) ((int) (local19_life78 >>> 24)));
        (__sourceSpill248_79)[5] = ((byte) ((int) (local19_life78 >>> 16)));
        (__sourceSpill248_79)[6] = ((byte) ((int) (local19_life78 >>> 8)));
        (__sourceSpill248_79)[7] = ((byte) ((int) local19_life78));
        javax.crypto.Cipher __sourceSpill248_80 = local11_life42;
        byte[] local21_life82 = ((javax.crypto.Cipher)(__sourceSpill248_80)).doFinal(((byte[])(__sourceSpill248_79)));
        (__sourceSpill248_76)[__sourceSpill248_77] = (((((((((((long) (local21_life82)[0]) & 255L) << 56) | ((((long) (local21_life82)[1]) & 255L) << 48)) | ((((long) (local21_life82)[2]) & 255L) << 40)) | ((((long) (local21_life82)[3]) & 255L) << 32)) | ((((long) (local21_life82)[4]) & 255L) << 24)) | ((((long) (local21_life82)[5]) & 255L) << 16)) | ((((long) (local21_life82)[6]) & 255L) << 8)) | (((long) (local21_life82)[7]) & 255L));
    } while ((!(local13_life57 >= local16_life56)));
    N = ((long[])(local17_life52));
    O = ((java.lang.Integer[])(new java.lang.Integer[11]));
    T = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life87;
    javax.crypto.Cipher __sourceSpill248_89 = (local0_life87 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill248_90 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill248_91 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill248_92 = new byte[8];
    (__sourceSpill248_92)[0] = ((byte) ((int) (local22_life7 >>> 56)));
    int local1_life93 = 1;
    while ((local1_life93 < 8)) {
        (__sourceSpill248_92)[local1_life93] = ((byte) ((int) ((local22_life7 << (local1_life93 * 8)) >>> 56)));
        local1_life93 += 1;
    }
    byte[] __sourcePreallocation248_94 = __sourceSpill248_92;
    ((javax.crypto.Cipher)(__sourceSpill248_89)).init(((int)(__sourceSpill248_90)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill248_91)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation248_94)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life97 = new long[5];
    int local3_life98 = 0;
    java.lang.String local4_life99;
    int local5_life101 = ((java.lang.String)((local4_life99 = "¬§8tõºÂ\fA`ývBrbþ=ðD\031Ñ"))).length();
    int local2_life102 = 0;
    do {
        java.lang.String __sourceSpill248_103 = local4_life99;
        int __sourceSpill248_104 = local2_life102;
        local2_life102 += 8;
        byte[] local7_life107 = ((java.lang.String)(((java.lang.String)(__sourceSpill248_103)).substring(((int)(__sourceSpill248_104)), ((int)(local2_life102))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill248_108 = local6_life97;
        int __sourceSpill248_109 = local3_life98;
        local3_life98 += 1;
        long local8_life110 = (((((((((((long) (local7_life107)[0]) & 255L) << 56) | ((((long) (local7_life107)[1]) & 255L) << 48)) | ((((long) (local7_life107)[2]) & 255L) << 40)) | ((((long) (local7_life107)[3]) & 255L) << 32)) | ((((long) (local7_life107)[4]) & 255L) << 24)) | ((((long) (local7_life107)[5]) & 255L) << 16)) | ((((long) (local7_life107)[6]) & 255L) << 8)) | (((long) (local7_life107)[7]) & 255L));
        byte[] __sourceSpill248_111 = new byte[8];
        (__sourceSpill248_111)[0] = ((byte) ((int) (local8_life110 >>> 56)));
        (__sourceSpill248_111)[1] = ((byte) ((int) (local8_life110 >>> 48)));
        (__sourceSpill248_111)[2] = ((byte) ((int) (local8_life110 >>> 40)));
        (__sourceSpill248_111)[3] = ((byte) ((int) (local8_life110 >>> 32)));
        (__sourceSpill248_111)[4] = ((byte) ((int) (local8_life110 >>> 24)));
        (__sourceSpill248_111)[5] = ((byte) ((int) (local8_life110 >>> 16)));
        (__sourceSpill248_111)[6] = ((byte) ((int) (local8_life110 >>> 8)));
        (__sourceSpill248_111)[7] = ((byte) ((int) local8_life110));
        javax.crypto.Cipher __sourceSpill248_112 = local0_life87;
        byte[] local10_life114 = ((javax.crypto.Cipher)(__sourceSpill248_112)).doFinal(((byte[])(__sourceSpill248_111)));
        (__sourceSpill248_108)[__sourceSpill248_109] = (((((((((((long) (local10_life114)[0]) & 255L) << 56) | ((((long) (local10_life114)[1]) & 255L) << 48)) | ((((long) (local10_life114)[2]) & 255L) << 40)) | ((((long) (local10_life114)[3]) & 255L) << 32)) | ((((long) (local10_life114)[4]) & 255L) << 24)) | ((((long) (local10_life114)[5]) & 255L) << 16)) | ((((long) (local10_life114)[6]) & 255L) << 8)) | (((long) (local10_life114)[7]) & 255L));
    } while ((!(local2_life102 >= local5_life101)));
    local5_life101 = ((java.lang.String)((local4_life99 = "\001ôÚtÏg\016¿q}¦«X"))).length();
    local2_life102 = 0;
    do {
        java.lang.String __sourceSpill248_116 = local4_life99;
        int __sourceSpill248_117 = local2_life102;
        local2_life102 += 8;
        byte[] local7_life120 = ((java.lang.String)(((java.lang.String)(__sourceSpill248_116)).substring(((int)(__sourceSpill248_117)), ((int)(local2_life102))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill248_121 = local6_life97;
        int __sourceSpill248_122 = local3_life98;
        local3_life98 += 1;
        long local8_life123 = (((((((((((long) (local7_life120)[0]) & 255L) << 56) | ((((long) (local7_life120)[1]) & 255L) << 48)) | ((((long) (local7_life120)[2]) & 255L) << 40)) | ((((long) (local7_life120)[3]) & 255L) << 32)) | ((((long) (local7_life120)[4]) & 255L) << 24)) | ((((long) (local7_life120)[5]) & 255L) << 16)) | ((((long) (local7_life120)[6]) & 255L) << 8)) | (((long) (local7_life120)[7]) & 255L));
        byte[] __sourceSpill248_124 = new byte[8];
        (__sourceSpill248_124)[0] = ((byte) ((int) (local8_life123 >>> 56)));
        (__sourceSpill248_124)[1] = ((byte) ((int) (local8_life123 >>> 48)));
        (__sourceSpill248_124)[2] = ((byte) ((int) (local8_life123 >>> 40)));
        (__sourceSpill248_124)[3] = ((byte) ((int) (local8_life123 >>> 32)));
        (__sourceSpill248_124)[4] = ((byte) ((int) (local8_life123 >>> 24)));
        (__sourceSpill248_124)[5] = ((byte) ((int) (local8_life123 >>> 16)));
        (__sourceSpill248_124)[6] = ((byte) ((int) (local8_life123 >>> 8)));
        (__sourceSpill248_124)[7] = ((byte) ((int) local8_life123));
        javax.crypto.Cipher __sourceSpill248_125 = local0_life87;
        byte[] local10_life127 = ((javax.crypto.Cipher)(__sourceSpill248_125)).doFinal(((byte[])(__sourceSpill248_124)));
        (__sourceSpill248_121)[__sourceSpill248_122] = (((((((((((long) (local10_life127)[0]) & 255L) << 56) | ((((long) (local10_life127)[1]) & 255L) << 48)) | ((((long) (local10_life127)[2]) & 255L) << 40)) | ((((long) (local10_life127)[3]) & 255L) << 32)) | ((((long) (local10_life127)[4]) & 255L) << 24)) | ((((long) (local10_life127)[5]) & 255L) << 16)) | ((((long) (local10_life127)[6]) & 255L) << 8)) | (((long) (local10_life127)[7]) & 255L));
    } while ((!(local2_life102 >= local5_life101)));
    R = ((long[])(local6_life97));
    S = ((java.lang.Long[])(new java.lang.Long[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_7839a24ccc30e040_0(com.moon.m_ a0, com.moon.nh a1, float a2, float a3, float a4, float a5) throws E;

private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = __sourceExactCall_f036cdf2d1f299(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2272_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17411;
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
            throw new RuntimeException("com/moon/m_", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         O[var3] = var15;
      }

      return O[var3];
}


public void b(int p0, int p1) {
((com.moon.m_)(this)).d__sourceReturn_da8c82d5d4();
    super.b(((int)(p0)), ((int)(p1)));
    return;
}


private void e__sourceReturn_da8c82d5d4() {
java.util.Map lexicalValue216_39_0;
    com.moon.nY lexicalValue216_78_0;
    float lexicalValue216_78_1;
    float lexicalValue216_78_2;
    int lexicalValue216_78_3;
    com.moon.nY lexicalValue216_79_0;
    float lexicalValue216_79_1;
    float lexicalValue216_79_2;
    com.moon.nY lexicalValue216_80_0;
    float lexicalValue216_80_1;
    float lexicalValue216_80_2;
    int lexicalValue216_80_3;
    net.minecraft.entity.Entity[] spill216_0;
    java.util.Map spill216_1;
    com.moon.nY spill216_2;
    float spill216_3;
    float spill216_4;
    int spill216_5;
    long life1_3;
    int life4_9;
    net.minecraft.entity.Entity[] life3_10;
    java.util.Iterator life4_44;
    java.lang.Integer life5_51;
    com.moon.nY life6_57;
    java.lang.String life7_65;
    int life8_72;
    lexical_join_85: {
    lexical_join_39: {
    lexical_join_37: {
    life1_3 = (com.moon.m_.H ^ 80638242349326L);
    ((java.util.Map)(this.r)).clear();
    spill216_0 = moom.lw.b__Arrayr3();
    life4_9 = 0;
    life3_10 = spill216_0;
    lexical_cycle_11: while (true) {
    if (!((life4_9 < ((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).size()))) {
        break lexical_join_37;
    }
    spill216_1 = this.r;
    if (!((life3_10 == null))) {
        lexicalValue216_39_0 = spill216_1;
        break lexical_join_39;
    }
    ((java.util.Map)(spill216_1)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life4_9))))), ((java.lang.Object)(new com.moon.nY(__sourceIntrinsic_85f1dd884e89_invokedynamic216_9(22720, (7046293033503561873L ^ life1_3)), com.moon.cj.EASE_IN_OUT_CUBIC))));
    life4_9 += 1;
    if (!((life3_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    lexicalValue216_39_0 = this.r;
    }
    life4_44 = ((java.util.Set)(((java.util.Map)(lexicalValue216_39_0)).keySet())).iterator();
    lexical_cycle_42: while (true) {
    lexical_join_80: {
    lexical_join_79: {
    lexical_join_78: {
    if (!(((java.util.Iterator)(life4_44)).hasNext())) {
        break lexical_join_85;
    }
    life5_51 = ((java.lang.Integer)(((java.util.Iterator)(life4_44)).next()));
    life6_57 = ((com.moon.nY)(((java.util.Map)(this.r)).get(((java.lang.Object)(life5_51)))));
    life7_65 = ((java.lang.String)(((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).get(((int)(((java.lang.Integer)(life5_51)).intValue())))));
    life8_72 = ((((java.lang.String)(((java.lang.String)(((com.moon.setting.StringListSetting)(this.v)).getValue())))).equals(((java.lang.Object)(life7_65)))) ? 1 : 0);
    spill216_2 = life6_57;
    spill216_3 = 0x0.0p0f;
    spill216_4 = 0x1.0p0f;
    spill216_5 = life8_72;
    if (!((life3_10 == null))) {
        lexicalValue216_78_0 = spill216_2;
        lexicalValue216_78_1 = spill216_3;
        lexicalValue216_78_2 = spill216_4;
        lexicalValue216_78_3 = spill216_5;
        break lexical_join_78;
    }
    if (!((spill216_5 == 0))) {
        lexicalValue216_79_0 = spill216_2;
        lexicalValue216_79_1 = spill216_3;
        lexicalValue216_79_2 = spill216_4;
        break lexical_join_79;
    }
    lexicalValue216_78_0 = spill216_2;
    lexicalValue216_78_1 = spill216_3;
    lexicalValue216_78_2 = spill216_4;
    lexicalValue216_78_3 = 1;
    }
    lexicalValue216_80_0 = lexicalValue216_78_0;
    lexicalValue216_80_1 = lexicalValue216_78_1;
    lexicalValue216_80_2 = lexicalValue216_78_2;
    lexicalValue216_80_3 = lexicalValue216_78_3;
    break lexical_join_80;
    }
    lexicalValue216_80_0 = lexicalValue216_79_0;
    lexicalValue216_80_1 = lexicalValue216_79_1;
    lexicalValue216_80_2 = lexicalValue216_79_2;
    lexicalValue216_80_3 = 0;
    }
    ((com.moon.nY)(lexicalValue216_80_0)).a(((float)(lexicalValue216_80_1)), ((float)(lexicalValue216_80_2)), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue216_80_3))));
    ((com.moon.nY)(life6_57)).b__Void();
    if (!((life3_10 != null))) { continue lexical_cycle_42; }
    break lexical_cycle_42;
    }
    }
    return;
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = __sourceExactCall_b0b0453d28a21a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2274_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 12781);
    if (((com.moon.m_.S)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.m_.R)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.m_.T)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.m_.T)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/m_", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.m_.S)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.m_.S)[life3_8])).longValue();
}


public boolean c__Boolean() {
return (__sourceIntrinsic_booleanComparison((((com.moon.setting.StringListSetting)(this.v)).isAvailable())) != 0);
}


public void c(int p0, int p1) {
com.moon.nX forestValue100029_336_0;
    com.moon.nX forestValue100029_337_0;
    float forestValue100029_337_1;
    com.moon.m_ forestValue100029_381_0;
    com.moon.nX forestValue100029_438_0;
    com.moon.nX forestValue100029_439_0;
    float forestValue100029_439_1;
    int forestValue100029_516_0;
    com.moon.nX forestValue100029_526_0;
    com.moon.nX forestValue100029_527_0;
    float forestValue100029_527_1;
    int forestValue100029_555_0;
    int forestValue100029_562_0;
    com.moon.m_ forestValue100029_577_0;
    net.minecraft.entity.Entity[] spill100029_0;
    com.moon.m_ spill100029_1;
    int spill100029_2;
    long spill100029_3;
    int spill100029_4;
    com.moon.nX spill100029_5;
    com.moon.nX spill100029_6;
    int spill100029_7;
    boolean spill100029_8;
    boolean spill100029_9;
    com.moon.nX spill100029_10;
    int spill100029_11;
    com.moon.m_ spill100029_12;
    long life3_3;
    float life6_11;
    float life7_16;
    float life8_21;
    com.moon.jm life9_26;
    com.moon.hW life10_31;
    com.moon.hW life11_38;
    net.minecraft.entity.Entity[] life5_39;
    com.moon.hW life12_50;
    com.moon.i3 life13_97;
    float life14_117;
    float life15_123;
    org.lwjgl.util.vector.Vector2f life16_141;
    org.lwjgl.util.vector.Vector2f life17_157;
    org.lwjgl.util.vector.Vector2f life18_173;
    org.lwjgl.util.vector.Vector2f life19_185;
    org.lwjgl.util.vector.Vector2f life20_193;
    org.lwjgl.util.vector.Vector2f life21_201;
    org.lwjgl.util.vector.Vector2f life22_209;
    float life23_288;
    float life24_292;
    com.moon.jm life25_297;
    float life26_299;
    java.lang.String life27_301;
    com.moon.hW life28_308;
    float life29_313;
    float life30_318;
    int life31_327;
    com.moon.jm life12_390;
    com.moon.hW life13_397;
    float life14_403;
    float life15_407;
    float life16_409;
    java.lang.String life17_411;
    float life18_416;
    float life19_421;
    int life20_430;
    float life18_510;
    float life19_515;
    int life20_524;
    float life12_622;
    forest_join_587: {
    forest_join_581: {
    forest_join_579: {
    forest_join_577: {
    forest_join_562: {
    forest_join_555: {
    forest_join_527: {
    forest_join_526: {
    forest_join_516: {
    forest_join_484: {
    forest_join_439: {
    forest_join_438: {
    forest_join_381: {
    forest_join_380: {
    forest_join_337: {
    forest_join_336: {
    life3_3 = (com.moon.m_.H ^ 59658253435301L);
    spill100029_0 = moom.lw.b__Arrayr3();
    ((com.moon.m_)(this)).d__sourceReturn_da8c82d5d4();
    life6_11 = (((com.moon.m_)(this)).a() + 0x1.0p3f);
    life7_16 = (((com.moon.m_)(this)).b() + 0x1.2p2f);
    life8_21 = (((com.moon.m_)(this)).c() - 0x1.0p4f);
    life9_26 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life10_31 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life11_38 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life9_26))))).a();
    life5_39 = spill100029_0;
    spill100029_1 = this;
    if (!((life5_39 == null))) {
        forestValue100029_381_0 = spill100029_1;
        break forest_join_381;
    }
    if (!((!((com.moon.m_)(spill100029_1)).z))) {
        break forest_join_380;
    }
    life12_50 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    ((com.moon.hW)(life10_31)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_11 - 0x1.0p-1f))), ((float)(((life7_16 + 0x1.0p0f) + ((com.moon.jm)(life9_26)).a(((float)(0x1.cp2f)))))), ((float)((life8_21 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic100029_25(4210, (1020591461494506853L ^ life3_3))))))));
    spill100029_2 = 27110;
    life13_97 = com.moon.i3.a(((float)(((life6_11 + life8_21) - 0x1.1p4f))), ((float)(((life7_16 + 0x1.0p0f) + ((com.moon.jm)(life9_26)).a(((float)(0x1.cp2f)))))), ((float)(0x1.1p4f)), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m_)(this)).a__lS())).a__kX())).getValue())))).intValue())));
    spill100029_3 = (4060902744752536823L ^ life3_3);
    ((com.moon.i3)(life13_97)).a(((boolean)(false)));
    ((com.moon.i3)(life13_97)).c(((boolean)(false)));
    ((com.moon.i3)(life13_97)).e(((boolean)(false)));
    ((com.moon.hW)(life10_31)).a(((com.moon.iX)(life13_97)));
    life14_117 = 0x1.4p2f;
    life15_123 = (-0x1.68p6f * ((com.moon.nY)(this.n)).c());
    life16_141 = new org.lwjgl.util.vector.Vector2f(((life6_11 + life8_21) - 0x1.1p3f), (((life7_16 + 0x1.0p0f) + ((com.moon.jm)(life9_26)).a(((float)(0x1.cp2f)))) + 0x1.1p3f));
    life17_157 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life16_141)).x + (life14_117 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life16_141)).y + (life14_117 / 0x1.0p1f)));
    life18_173 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(life16_141)).x - (life14_117 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(life16_141)).y + (life14_117 / 0x1.0p1f)));
    life19_185 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(life16_141)).x, (((org.lwjgl.util.vector.Vector2f)(life16_141)).y - (life14_117 / 0x1.0p1f)));
    life20_193 = ((com.moon.m_)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_141)), ((org.lwjgl.util.vector.Vector2f)(life19_185)), ((float)((0x1.68p7f + life15_123))));
    life21_201 = ((com.moon.m_)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_141)), ((org.lwjgl.util.vector.Vector2f)(life18_173)), ((float)((0x1.68p7f + life15_123))));
    life22_209 = ((com.moon.m_)(this)).a(((org.lwjgl.util.vector.Vector2f)(life16_141)), ((org.lwjgl.util.vector.Vector2f)(life17_157)), ((float)((0x1.68p7f + life15_123))));
    ((com.moon.hW)(life12_50)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(life20_193)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life20_193)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life21_201)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life21_201)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(life22_209)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(life22_209)).y)), ((int)(-1))))));
    ((com.moon.jm)(life9_26)).b(((com.moon.hW)(life11_38)), ((java.lang.String)(((com.moon.setting.StringListSetting)(this.v)).getDisplayName())), ((float)(0x1.cp2f)), ((float)(life6_11)), ((float)(life7_16)), ((int)(-1)));
    ((com.moon.jm)(life9_26)).b(((com.moon.hW)(life11_38)), ((java.lang.String)(((java.lang.String)(((com.moon.setting.StringListSetting)(this.v)).getValue())))), ((float)(0x1.cp2f)), ((float)((life6_11 + 0x1.0p2f))), ((float)(((((life7_16 + 0x1.8p0f) + ((com.moon.jm)(life9_26)).a(((float)(0x1.cp2f)))) + 0x1.1p3f) - (((com.moon.jm)(life9_26)).b(((java.lang.String)(((java.lang.String)(((com.moon.setting.StringListSetting)(this.v)).getValue())))), ((float)(0x1.cp2f))) / 0x1.0p1f)))), ((int)(-1)));
    ((com.moon.hW)(life10_31)).b();
    ((com.moon.hW)(life11_38)).b();
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic100029_73(spill100029_2, spill100029_3))));
    spill100029_4 = 30873;
    ((com.moon.hW)(life12_50)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_505b8c2844d4_invokedynamic100029_76(spill100029_4, (6990692332768505231L ^ life3_3)))));
    life23_288 = (((life6_11 + life8_21) - 0x1.1p4f) - 0x1.6p3f);
    life24_292 = (life7_16 + 0x1.ep3f);
    life25_297 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life26_299 = 0x1.08p3f;
    life27_301 = "";
    life28_308 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life25_297))))).a();
    life29_313 = ((com.moon.jm)(life25_297)).a(((java.lang.String)(life27_301)), ((float)(life26_299)));
    life30_318 = ((com.moon.jm)(life25_297)).b(((java.lang.String)(life27_301)), ((float)(life26_299)));
    life31_327 = ((((com.moon.m_)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life23_288)), ((float)(life24_292)), ((float)(life29_313)), ((float)(life30_318)))) ? 1 : 0);
    this.l = ((boolean)__sourceIntrinsic_integerToBoolean((life31_327)));
    spill100029_5 = this.o;
    if (!((life31_327 != 0))) {
        forestValue100029_336_0 = spill100029_5;
        break forest_join_336;
    }
    forestValue100029_337_0 = spill100029_5;
    forestValue100029_337_1 = 0x1.0p-1f;
    break forest_join_337;
    }
    forestValue100029_337_0 = forestValue100029_336_0;
    forestValue100029_337_1 = 0x1.0p0f;
    }
    ((com.moon.nX)(forestValue100029_337_0)).a(((float)(forestValue100029_337_1)), ((double)(0x1.99999ap-2d)));
    ((com.moon.jm)(life25_297)).b(((com.moon.hW)(life28_308)), ((java.lang.String)(life27_301)), ((float)(life26_299)), ((float)(life23_288)), ((float)(life24_292)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_505b8c2844d4_invokedynamic100029_94(17513, (663165666329923962L ^ life3_3))))).a(((float)(((com.moon.nX)(this.o)).b()))))).getRGB())));
    ((com.moon.hW)(life28_308)).b();
    ((com.moon.m_)(this)).a(((float)((((life6_11 + life8_21) - 0x1.1p4f) - 0x1.58p4f))), ((float)((life7_16 + 0x1.ep3f))), ((int)(p0)), ((int)(p1)));
    if (!((life5_39 != null))) {
        break forest_join_581;
    }
    __sourceExactCall_6604345f74a40b(((java.lang.String[])(new java.lang.String[4])));
    }
    forestValue100029_381_0 = this;
    }
    ((com.moon.m_)(forestValue100029_381_0)).a(((float)(life6_11)), ((float)(life7_16)));
    life12_390 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life13_397 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life12_390))))).a();
    life14_403 = ((life6_11 + life8_21) - 0x1.58p4f);
    life15_407 = (life7_16 + 0x1.ep3f);
    life16_409 = 0x1.08p3f;
    life17_411 = "";
    life18_416 = ((com.moon.jm)(life12_390)).a(((java.lang.String)(life17_411)), ((float)(life16_409)));
    life19_421 = ((com.moon.jm)(life12_390)).b(((java.lang.String)(life17_411)), ((float)(life16_409)));
    life20_430 = ((((com.moon.m_)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life14_403)), ((float)(life15_407)), ((float)(life18_416)), ((float)(life19_421)))) ? 1 : 0);
    this.l = ((boolean)__sourceIntrinsic_integerToBoolean((life20_430)));
    spill100029_6 = this.p;
    if (!((life20_430 != 0))) {
        forestValue100029_438_0 = spill100029_6;
        break forest_join_438;
    }
    forestValue100029_439_0 = spill100029_6;
    forestValue100029_439_1 = 0x1.0p-1f;
    break forest_join_439;
    }
    forestValue100029_439_0 = forestValue100029_438_0;
    forestValue100029_439_1 = 0x1.0p0f;
    }
    ((com.moon.nX)(forestValue100029_439_0)).a(((float)(forestValue100029_439_1)), ((double)(0x1.99999ap-2d)));
    ((com.moon.jm)(life12_390)).b(((com.moon.hW)(life13_397)), ((java.lang.String)(life17_411)), ((float)(life16_409)), ((float)(life14_403)), ((float)(life15_407)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_505b8c2844d4_invokedynamic100029_120(16015, (5099448564136143773L ^ life3_3))))).a(((float)(((com.moon.nX)(this.p)).b()))))).getRGB())));
    spill100029_7 = life20_430;
    if (!((life5_39 == null))) {
        forestValue100029_516_0 = spill100029_7;
        break forest_join_516;
    }
    if (!((spill100029_7 != 0))) {
        break forest_join_484;
    }
    spill100029_8 = org.lwjgl.input.Mouse.isButtonDown(((int)(0)));
    if (!((life5_39 == null))) {
        forestValue100029_516_0 = ((spill100029_8) ? 1 : 0);
        break forest_join_516;
    }
    if (!(spill100029_8)) {
        break forest_join_484;
    }
    spill100029_9 = this.F;
    if (!((life5_39 == null))) {
        forestValue100029_516_0 = ((spill100029_9) ? 1 : 0);
        break forest_join_516;
    }
    if (!((!spill100029_9))) {
        break forest_join_484;
    }
    this.z = ((boolean)(false));
    this.A = ((java.lang.String)(""));
    this.E = ((boolean)(true));
    }
    life14_403 = ((life6_11 + life8_21) - 0x1.6p3f);
    life15_407 = (life7_16 + 0x1.ep3f);
    life16_409 = 0x1.08p3f;
    life17_411 = "";
    life18_510 = ((com.moon.jm)(life12_390)).a(((java.lang.String)(life17_411)), ((float)(life16_409)));
    life19_515 = ((com.moon.jm)(life12_390)).b(((java.lang.String)(life17_411)), ((float)(life16_409)));
    forestValue100029_516_0 = ((((com.moon.m_)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life14_403)), ((float)(life15_407)), ((float)(life18_510)), ((float)(life19_515)))) ? 1 : 0);
    }
    life20_524 = forestValue100029_516_0;
    this.l = ((boolean)__sourceIntrinsic_integerToBoolean((life20_524)));
    spill100029_10 = this.q;
    if (!((life20_524 != 0))) {
        forestValue100029_526_0 = spill100029_10;
        break forest_join_526;
    }
    forestValue100029_527_0 = spill100029_10;
    forestValue100029_527_1 = 0x1.0p-1f;
    break forest_join_527;
    }
    forestValue100029_527_0 = forestValue100029_526_0;
    forestValue100029_527_1 = 0x1.0p0f;
    }
    ((com.moon.nX)(forestValue100029_527_0)).a(((float)(forestValue100029_527_1)), ((double)(0x1.99999ap-2d)));
    ((com.moon.jm)(life12_390)).b(((com.moon.hW)(life13_397)), ((java.lang.String)(life17_411)), ((float)(life16_409)), ((float)(life14_403)), ((float)(life15_407)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_505b8c2844d4_invokedynamic100029_140(16015, (5099448564136143773L ^ life3_3))))).a(((float)(((com.moon.nX)(this.q)).b()))))).getRGB())));
    spill100029_11 = life20_524;
    if (!((life5_39 == null))) {
        forestValue100029_555_0 = spill100029_11;
        break forest_join_555;
    }
    if (!((spill100029_11 != 0))) {
        break forest_join_579;
    }
    forestValue100029_555_0 = ((org.lwjgl.input.Mouse.isButtonDown(((int)(0)))) ? 1 : 0);
    }
    if (!((life5_39 == null))) {
        forestValue100029_562_0 = forestValue100029_555_0;
        break forest_join_562;
    }
    if (!((forestValue100029_555_0 != 0))) {
        break forest_join_579;
    }
    spill100029_12 = this;
    if (!((life5_39 == null))) {
        forestValue100029_577_0 = spill100029_12;
        break forest_join_577;
    }
    forestValue100029_562_0 = ((((com.moon.m_)(spill100029_12)).F) ? 1 : 0);
    }
    if (!((forestValue100029_562_0 == 0))) {
        break forest_join_579;
    }
    ((com.moon.setting.StringListSetting)(this.v)).add(((java.lang.String)(this.A)));
    ((com.moon.m_)(this)).e__sourceReturn_da8c82d5d4();
    this.z = ((boolean)(false));
    this.A = ((java.lang.String)(""));
    forestValue100029_577_0 = this;
    }
    ((com.moon.m_)(forestValue100029_577_0)).E = ((boolean)(true));
    }
    ((com.moon.hW)(life13_397)).b();
    }
    if (!((!org.lwjgl.input.Mouse.isButtonDown(((int)(0)))))) {
        break forest_join_587;
    }
    this.F = ((boolean)(false));
    }
    ((com.moon.m_)(this)).d(((int)(p0)), ((int)(p1)));
    ((com.moon.nY)(this.n)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(this.y)));
    life12_622 = (0x1.4p1f + (((float) ((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).size()) * 0x1.1p4f));
    this.k = ((float)((0x1.f8p4f + (life12_622 * ((com.moon.nY)(this.n)).c()))));
    super.c(((int)(p0)), ((int)(p1)));
    return;
}


private void d(int p0, int p1) {
int lexicalValue215_116_0;
    java.lang.Object lexicalValue215_304_0;
    int lexicalValue215_311_0;
    int lexicalValue215_345_0;
    com.moon.nX lexicalValue215_351_0;
    com.moon.nX lexicalValue215_352_0;
    float lexicalValue215_352_1;
    int lexicalValue215_373_0;
    int lexicalValue215_378_0;
    int lexicalValue215_386_0;
    int lexicalValue215_426_0;
    com.moon.m_ lexicalValue215_436_0;
    com.moon.nX lexicalValue215_443_0;
    com.moon.nX lexicalValue215_444_0;
    float lexicalValue215_444_1;
    net.minecraft.entity.Entity[] spill215_0;
    boolean spill215_1;
    int spill215_2;
    boolean spill215_3;
    int spill215_4;
    com.moon.m_ spill215_5;
    int spill215_6;
    int spill215_7;
    com.moon.nX spill215_8;
    int spill215_9;
    com.moon.m_ spill215_10;
    com.moon.nX spill215_11;
    long life3_3;
    float life6_10;
    float life7_15;
    float life8_20;
    float life9_30;
    float life10_36;
    com.moon.jm life11_41;
    com.moon.jm life12_47;
    com.moon.jC life13_54;
    com.moon.hW life14_59;
    com.moon.hW life15_66;
    com.moon.hW life16_73;
    net.minecraft.entity.Entity[] life5_95;
    float life17_99;
    int life18_101;
    int life19_125;
    com.moon.nY life20_138;
    java.lang.String life21_145;
    com.moon.nX life22_159;
    com.moon.nY life23_319;
    com.moon.nY life23_332;
    int life23_390;
    java.util.Iterator life19_544;
    java.lang.Integer life20_551;
    com.moon.nY life21_557;
    java.lang.String life22_565;
    lexical_join_499: {
    lexical_join_444: {
    lexical_join_443: {
    lexical_join_436: {
    lexical_join_435: {
    lexical_join_426: {
    lexical_join_422: {
    lexical_join_386: {
    lexical_join_384: {
    lexical_join_378: {
    lexical_join_377: {
    lexical_join_116: {
    lexical_join_115: {
    life3_3 = (com.moon.m_.H ^ 7171605075497L);
    ((com.moon.m_)(this)).d__sourceReturn_da8c82d5d4();
    life6_10 = (((com.moon.m_)(this)).a() + 0x1.0p3f);
    life7_15 = (((com.moon.m_)(this)).b() + 0x1.2p2f);
    life8_20 = (((com.moon.m_)(this)).c() - 0x1.0p4f);
    life9_30 = (0x1.8p1f + (((float) ((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).size()) * 0x1.1p4f));
    life10_36 = (life9_30 * ((com.moon.nY)(this.n)).c());
    life11_41 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    spill215_0 = moom.lw.b__Arrayr3();
    life12_47 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life13_54 = com.moon.jC.a(((float)(life6_10)), ((float)(life7_15)), ((float)(life8_20)), ((float)(this.k)));
    life14_59 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life15_66 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life11_41))))).a();
    life16_73 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life12_47))))).a();
    ((com.moon.hW)(life14_59)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_10 - 0x1.0p-1f))), ((float)((life7_15 + 0x1.dp4f))), ((float)((life8_20 + 0x1.0p0f))), ((float)((life10_36 - 0x1.8p1f))), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_84bf6114351d_invokedynamic215_35(1428, (1849992631238903560L ^ life3_3))))))));
    life5_95 = spill215_0;
    life17_99 = (life7_15 + 0x1.dp4f);
    life18_101 = 0;
    spill215_1 = this.y;
    if (!((life5_95 == null))) {
        lexicalValue215_116_0 = ((spill215_1) ? 1 : 0);
        break lexical_join_116;
    }
    if (!((!spill215_1))) {
        break lexical_join_115;
    }
    spill215_2 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.nY)(this.n)).c())), ((float)(0x0.0p0f)));
    if (!((life5_95 == null))) {
        lexicalValue215_378_0 = spill215_2;
        break lexical_join_378;
    }
    if (!((spill215_2 > 0))) {
        break lexical_join_377;
    }
    }
    lexicalValue215_116_0 = 0;
    }
    life19_125 = lexicalValue215_116_0;
    lexical_cycle_117: while (true) {
    lexical_join_375: {
    lexical_join_374: {
    lexical_join_373: {
    lexical_join_369: {
    lexical_join_352: {
    lexical_join_351: {
    lexical_join_345: {
    lexical_join_330: {
    lexical_join_311: {
    lexical_join_309: {
    lexical_join_304: {
    lexical_join_296: {
    if (!((life19_125 < ((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).size()))) {
        break lexical_join_377;
    }
    life20_138 = ((com.moon.nY)(((java.util.Map)(this.r)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life19_125))))))));
    life21_145 = ((java.lang.String)(((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).get(((int)(life19_125)))));
    ((java.util.Map)(this.u)).putIfAbsent(((java.lang.Object)(life21_145)), ((java.lang.Object)(new com.moon.nX())));
    life22_159 = ((com.moon.nX)(((java.util.Map)(this.u)).get(((java.lang.Object)(life21_145)))));
    ((com.moon.jm)(life11_41)).b(((com.moon.hW)(life15_66)), ((java.lang.String)(life21_145)), ((float)(0x1.cp2f)), ((float)((life6_10 + 0x1.0p2f))), ((float)(((((life17_99 + (((float) life19_125) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life11_41)).b(((java.lang.String)(life21_145)), ((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    ((com.moon.jm)(life12_47)).b(((com.moon.hW)(life16_73)), ((java.lang.String)("")), ((float)(0x1.cp2f)), ((float)((((life6_10 + life8_20) - 0x1.1p3f) - 0x1.0p2f))), ((float)(((((life17_99 + (((float) life19_125) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life12_47)).a(((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p0f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.ClickGUI)(((com.moon.m_)(this)).a__lS())).a__kX())).getValue())))).intValue()))).a(((float)(java.lang.Math.min(((float)(((com.moon.nY)(life20_138)).c())), ((float)((0x1.0p0f - ((com.moon.nX)(life22_159)).b()))))))))).getRGB())));
    ((com.moon.jm)(life12_47)).b(((com.moon.hW)(life16_73)), ((java.lang.String)("")), ((float)(0x1.0p3f)), ((float)((((life6_10 + life8_20) - 0x1.1p3f) - 0x1.0p2f))), ((float)(((((life17_99 + (((float) life19_125) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life12_47)).a(((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_84bf6114351d_invokedynamic215_74(5658, (4306326758088037512L ^ life3_3))))).a(((float)(((com.moon.nX)(life22_159)).b()))))).getRGB())));
    spill215_3 = ((java.lang.String)(life21_145)).equals(((java.lang.Object)(((com.moon.setting.StringListSetting)(this.v)).getValue())));
    if (!((life5_95 == null))) {
        lexicalValue215_378_0 = ((spill215_3) ? 1 : 0);
        break lexical_join_378;
    }
    if (!((life5_95 == null))) {
        lexicalValue215_311_0 = ((spill215_3) ? 1 : 0);
        break lexical_join_311;
    }
    if (!(spill215_3)) {
        break lexical_join_309;
    }
    spill215_4 = this.w;
    if (!((life5_95 == null))) {
        lexicalValue215_311_0 = spill215_4;
        break lexical_join_311;
    }
    if (!((spill215_4 != life19_125))) {
        break lexical_join_309;
    }
    spill215_5 = this;
    if (!((life5_95 == null))) {
        lexicalValue215_304_0 = spill215_5;
        break lexical_join_304;
    }
    if (!((((com.moon.m_)(spill215_5)).w != -1))) {
        break lexical_join_296;
    }
    life23_319 = ((com.moon.nY)(((java.util.Map)(this.r)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(this.w))))))));
    ((com.moon.nY)(life23_319)).a(((float)(0x1.0p0f)));
    }
    this.w = ((int)(life19_125));
    lexicalValue215_304_0 = ((java.util.Map)(this.r)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(life19_125))))));
    }
    life23_332 = ((com.moon.nY)(lexicalValue215_304_0));
    ((com.moon.nY)(life23_332)).a(((float)(0x0.0p0f)));
    }
    lexicalValue215_311_0 = ((((com.moon.nY)(life20_138)).a__Boolean()) ? 1 : 0);
    }
    if (!((life5_95 == null))) {
        lexicalValue215_345_0 = lexicalValue215_311_0;
        break lexical_join_345;
    }
    if (!((lexicalValue215_311_0 != 0))) {
        break lexical_join_330;
    }
    spill215_6 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.nY)(life20_138)).c())), ((float)(0x1.0p0f)));
    if (!((life5_95 == null))) {
        lexicalValue215_345_0 = spill215_6;
        break lexical_join_345;
    }
    if (!((spill215_6 == 0))) {
        break lexical_join_330;
    }
    spill215_7 = this.w;
    if (!((life5_95 == null))) {
        lexicalValue215_345_0 = spill215_7;
        break lexical_join_345;
    }
    if (!((spill215_7 != life19_125))) {
        break lexical_join_330;
    }
    ((com.moon.nY)(life20_138)).a(((float)(0x1.0p0f)));
    }
    lexicalValue215_345_0 = ((((com.moon.m_)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life6_10)), ((float)(((life17_99 + (((float) life19_125) * 0x1.1p4f)) - 0x1.0p-1f))), ((float)(life8_20)), ((float)(0x1.2p4f)))) ? 1 : 0);
    }
    life23_390 = lexicalValue215_345_0;
    spill215_8 = life22_159;
    if (!((life23_390 != 0))) {
        lexicalValue215_351_0 = spill215_8;
        break lexical_join_351;
    }
    lexicalValue215_352_0 = spill215_8;
    lexicalValue215_352_1 = 0x1.0p0f;
    break lexical_join_352;
    }
    lexicalValue215_352_0 = lexicalValue215_351_0;
    lexicalValue215_352_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue215_352_0)).a(((float)(lexicalValue215_352_1)), ((double)(0x1.99999ap-2d)));
    if (!((life5_95 == null))) {
        break lexical_join_375;
    }
    if (!((life23_390 != 0))) {
        break lexical_join_374;
    }
    spill215_9 = this.x;
    if (!((life5_95 == null))) {
        lexicalValue215_373_0 = spill215_9;
        break lexical_join_373;
    }
    if (!((spill215_9 == -1))) {
        break lexical_join_369;
    }
    ((com.moon.nX)(this.s)).a(((float)(((float) life19_125))));
    }
    this.x = ((int)(life19_125));
    lexicalValue215_373_0 = 1;
    }
    life18_101 = lexicalValue215_373_0;
    }
    life19_125 += 1;
    }
    if (!((life5_95 != null))) { continue lexical_cycle_117; }
    break lexical_cycle_117;
    }
    }
    lexicalValue215_378_0 = life18_101;
    }
    if (!((life5_95 == null))) {
        lexicalValue215_386_0 = lexicalValue215_378_0;
        break lexical_join_386;
    }
    if (!((lexicalValue215_378_0 == 0))) {
        break lexical_join_384;
    }
    this.x = ((int)(-1));
    }
    lexicalValue215_386_0 = ((this.y) ? 1 : 0);
    }
    if (!((life5_95 == null))) {
        lexicalValue215_426_0 = lexicalValue215_386_0;
        break lexical_join_426;
    }
    if (!((lexicalValue215_386_0 != 0))) {
        break lexical_join_422;
    }
    ((com.moon.hW)(life14_59)).a(((com.moon.iX)(com.moon.i3.a(((float)((life6_10 - 0x1.0p-1f))), ((float)((life17_99 + (((com.moon.nX)(this.s)).b() * 0x1.1p4f)))), ((float)((life8_20 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(((com.moon.aO)(((com.moon.aO)(new com.moon.aO(__sourceIntrinsic_84bf6114351d_invokedynamic215_116(19811, (4918155822213664755L ^ life3_3))))).a(((float)((((com.moon.nX)(this.t)).b() * 0x1.0p-2f)))))).getRGB()))))));
    }
    spill215_10 = this;
    if (!((life5_95 == null))) {
        lexicalValue215_436_0 = spill215_10;
        break lexical_join_436;
    }
    lexicalValue215_426_0 = ((com.moon.m_)(spill215_10)).x;
    }
    if (!((lexicalValue215_426_0 != -1))) {
        break lexical_join_435;
    }
    ((com.moon.nX)(this.s)).a(((float)(((float) this.x))), ((double)(0x1.99999ap-2d)));
    }
    lexicalValue215_436_0 = this;
    }
    spill215_11 = ((com.moon.m_)(lexicalValue215_436_0)).t;
    if (!((this.x != -1))) {
        lexicalValue215_443_0 = spill215_11;
        break lexical_join_443;
    }
    lexicalValue215_444_0 = spill215_11;
    lexicalValue215_444_1 = 0x1.0p0f;
    break lexical_join_444;
    }
    lexicalValue215_444_0 = lexicalValue215_443_0;
    lexicalValue215_444_1 = 0x0.0p0f;
    }
    ((com.moon.nX)(lexicalValue215_444_0)).a(((float)(lexicalValue215_444_1)), ((double)(0x1.99999ap-2d)));
    ((com.moon.hW)(life14_59)).a(((com.moon.jA)(life13_54)));
    ((com.moon.hW)(life15_66)).a(((com.moon.jA)(life13_54)));
    ((com.moon.hW)(life16_73)).a(((com.moon.jA)(life13_54)));
    ((com.moon.hW)(life14_59)).b();
    ((com.moon.hW)(life15_66)).b();
    ((com.moon.hW)(life16_73)).b();
    life19_544 = ((java.util.Set)(((java.util.Map)(this.r)).keySet())).iterator();
    lexical_cycle_466: while (true) {
    if (!(((java.util.Iterator)(life19_544)).hasNext())) {
        break lexical_join_499;
    }
    life20_551 = ((java.lang.Integer)(((java.util.Iterator)(life19_544)).next()));
    life21_557 = ((com.moon.nY)(((java.util.Map)(this.r)).get(((java.lang.Object)(life20_551)))));
    life22_565 = ((java.lang.String)(((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).get(((int)(((java.lang.Integer)(life20_551)).intValue())))));
    ((com.moon.nY)(life21_557)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(((java.lang.String)(((java.lang.String)(((com.moon.setting.StringListSetting)(this.v)).getValue())))).equals(((java.lang.Object)(life22_565))))));
    if (!((life5_95 != null))) { continue lexical_cycle_466; }
    break lexical_cycle_466;
    }
    }
    return;
}


private void d__sourceReturn_da8c82d5d4() {
com.moon.m_ forwardValue765_17_0;
    com.moon.m_ spill765_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_18: {
    forward_join_17: {
    life1_3 = (com.moon.m_.H ^ 71405800935877L);
    life3_5 = moom.lw.b__Arrayr3();
    spill765_0 = this;
    if (!((life3_5 == null))) {
        forwardValue765_17_0 = spill765_0;
        break forward_join_17;
    }
    if (!((((java.util.Map)(((com.moon.m_)(spill765_0)).r)).size() != ((java.util.List)(((com.moon.setting.StringListSetting)(this.v)).getValues())).size()))) {
        break forward_join_18;
    }
    forwardValue765_17_0 = this;
    }
    ((com.moon.m_)(forwardValue765_17_0)).e__sourceReturn_da8c82d5d4();
    }
    return;
}


private void a(float p0, float p1) {
com.moon.jm forwardValue760_112_0;
    com.moon.hW forwardValue760_112_1;
    java.lang.String forwardValue760_112_2;
    float forwardValue760_112_3;
    float forwardValue760_112_4;
    float forwardValue760_112_5;
    com.moon.jm forwardValue760_113_0;
    com.moon.hW forwardValue760_113_1;
    java.lang.String forwardValue760_113_2;
    float forwardValue760_113_3;
    float forwardValue760_113_4;
    com.moon.jm forwardValue760_114_0;
    com.moon.hW forwardValue760_114_1;
    java.lang.String forwardValue760_114_2;
    float forwardValue760_114_3;
    float forwardValue760_114_4;
    float forwardValue760_114_5;
    int forwardValue760_178_0;
    com.moon.m_ forwardValue760_186_0;
    int forwardValue760_186_1;
    com.moon.m_ forwardValue760_187_0;
    com.moon.m_ forwardValue760_188_0;
    int forwardValue760_188_1;
    int forwardValue760_214_0;
    net.minecraft.entity.Entity[] spill760_0;
    com.moon.jm spill760_1;
    com.moon.hW spill760_2;
    java.lang.String spill760_3;
    float spill760_4;
    float spill760_5;
    float spill760_6;
    boolean spill760_7;
    com.moon.m_ spill760_8;
    boolean spill760_9;
    int spill760_10;
    long life3_3;
    float life6_9;
    com.moon.jm life7_14;
    com.moon.hW life8_19;
    com.moon.hW life9_26;
    com.moon.hW life10_33;
    com.moon.jC life11_49;
    float life12_78;
    float life13_84;
    net.minecraft.entity.Entity[] life5_85;
    float life14_155;
    float life14_210;
    float life15_216;
    forward_join_232: {
    forward_join_214: {
    forward_join_212: {
    forward_join_192: {
    forward_join_188: {
    forward_join_187: {
    forward_join_186: {
    forward_join_178: {
    forward_join_168: {
    forward_join_114: {
    forward_join_113: {
    forward_join_112: {
    life3_3 = (com.moon.m_.H ^ 102529270982635L);
    spill760_0 = moom.lw.b__Arrayr3();
    life6_9 = (((com.moon.m_)(this)).c() - 0x1.0p4f);
    life7_14 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life8_19 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life9_26 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_14))))).a();
    life10_33 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life7_14))))).a();
    life11_49 = com.moon.jC.a(((float)((p0 + 0x1.0p2f))), ((float)(((p1 + 0x1.0p0f) + ((com.moon.jm)(life7_14)).a(((float)(0x1.cp2f)))))), ((float)((life6_9 - 0x1.0p3f))), ((float)(0x1.1p4f)));
    ((com.moon.hW)(life8_19)).a(((com.moon.iX)(com.moon.i3.a(((float)((p0 - 0x1.0p-1f))), ((float)(((p1 + 0x1.0p0f) + ((com.moon.jm)(life7_14)).a(((float)(0x1.cp2f)))))), ((float)((life6_9 + 0x1.0p0f))), ((float)(0x1.1p4f)), ((float)(0x1.8p1f)), ((int)(__sourceIntrinsic_9229ce90378e_invokedynamic760_24(4210, (1020546881608672043L ^ life3_3))))))));
    life12_78 = ((com.moon.jm)(life7_14)).a(((java.lang.String)(this.A)), ((float)(0x1.cp2f)));
    life13_84 = ((life12_78 - life6_9) + 0x1.cp4f);
    life5_85 = spill760_0;
    ((com.moon.jm)(life7_14)).b(((com.moon.hW)(life9_26)), ((java.lang.String)(((com.moon.setting.StringListSetting)(this.v)).getDisplayName())), ((float)(0x1.cp2f)), ((float)(p0)), ((float)(p1)), ((int)(-1)));
    spill760_1 = life7_14;
    spill760_2 = life10_33;
    spill760_3 = this.A;
    spill760_4 = 0x1.cp2f;
    spill760_5 = (p0 + 0x1.0p2f);
    spill760_6 = life13_84;
    if (!((life5_85 == null))) {
        forwardValue760_112_0 = spill760_1;
        forwardValue760_112_1 = spill760_2;
        forwardValue760_112_2 = spill760_3;
        forwardValue760_112_3 = spill760_4;
        forwardValue760_112_4 = spill760_5;
        forwardValue760_112_5 = spill760_6;
        break forward_join_112;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(spill760_6)), ((float)(0x0.0p0f))) > 0))) {
        forwardValue760_113_0 = spill760_1;
        forwardValue760_113_1 = spill760_2;
        forwardValue760_113_2 = spill760_3;
        forwardValue760_113_3 = spill760_4;
        forwardValue760_113_4 = spill760_5;
        break forward_join_113;
    }
    forwardValue760_112_0 = spill760_1;
    forwardValue760_112_1 = spill760_2;
    forwardValue760_112_2 = spill760_3;
    forwardValue760_112_3 = spill760_4;
    forwardValue760_112_4 = spill760_5;
    forwardValue760_112_5 = (-life13_84);
    }
    forwardValue760_114_0 = forwardValue760_112_0;
    forwardValue760_114_1 = forwardValue760_112_1;
    forwardValue760_114_2 = forwardValue760_112_2;
    forwardValue760_114_3 = forwardValue760_112_3;
    forwardValue760_114_4 = forwardValue760_112_4;
    forwardValue760_114_5 = forwardValue760_112_5;
    break forward_join_114;
    }
    forwardValue760_114_0 = forwardValue760_113_0;
    forwardValue760_114_1 = forwardValue760_113_1;
    forwardValue760_114_2 = forwardValue760_113_2;
    forwardValue760_114_3 = forwardValue760_113_3;
    forwardValue760_114_4 = forwardValue760_113_4;
    forwardValue760_114_5 = 0x0.0p0f;
    }
    ((com.moon.jm)(forwardValue760_114_0)).b(((com.moon.hW)(forwardValue760_114_1)), ((java.lang.String)(forwardValue760_114_2)), ((float)(forwardValue760_114_3)), ((float)((forwardValue760_114_4 + forwardValue760_114_5))), ((float)((((((p1 + 0x1.0p0f) + ((com.moon.jm)(life7_14)).a(((float)(0x1.cp2f)))) + 0x1.1p3f) - (((com.moon.jm)(life7_14)).a(((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((int)(-1)));
    spill760_7 = this.C;
    if (!((life5_85 == null))) {
        forwardValue760_178_0 = ((spill760_7) ? 1 : 0);
        break forward_join_178;
    }
    if (!(spill760_7)) {
        break forward_join_168;
    }
    life14_155 = java.lang.Math.min(((float)((life12_78 + 0x1.0p2f))), ((float)((life6_9 - 0x1.8p4f))));
    ((com.moon.hW)(life8_19)).a(((com.moon.iX)(com.moon.i3.a(((float)((p0 + 0x1.0p1f))), ((float)(((p1 + 0x1.8p1f) + ((com.moon.jm)(life7_14)).a(((float)(0x1.cp2f)))))), ((float)(life14_155)), ((float)(0x1.ap3f)), ((float)(0x1.0p1f)), ((int)(__sourceIntrinsic_9229ce90378e_invokedynamic760_41(23290, (4720912603078535585L ^ life3_3))))))));
    }
    forwardValue760_178_0 = recovery.source.CarrierOps.lcmp(((long)((java.lang.System.currentTimeMillis() - this.D))), ((long)(__sourceIntrinsic_9229ce90378e_invokedynamic760_46(9724, (8444583002237838158L ^ life3_3)))));
    }
    if (!((forwardValue760_178_0 > 0))) {
        break forward_join_192;
    }
    spill760_8 = this;
    spill760_9 = this.B;
    if (!((life5_85 == null))) {
        forwardValue760_186_0 = spill760_8;
        forwardValue760_186_1 = ((spill760_9) ? 1 : 0);
        break forward_join_186;
    }
    if (!((!spill760_9))) {
        forwardValue760_187_0 = spill760_8;
        break forward_join_187;
    }
    forwardValue760_186_0 = spill760_8;
    forwardValue760_186_1 = 1;
    }
    forwardValue760_188_0 = forwardValue760_186_0;
    forwardValue760_188_1 = forwardValue760_186_1;
    break forward_join_188;
    }
    forwardValue760_188_0 = forwardValue760_187_0;
    forwardValue760_188_1 = 0;
    }
    ((com.moon.m_)(forwardValue760_188_0)).B = ((boolean)__sourceIntrinsic_integerToBoolean((forwardValue760_188_1)));
    this.D = ((long)(java.lang.System.currentTimeMillis()));
    }
    life14_210 = (life12_78 + 0x1.0p2f);
    life15_216 = ((life12_78 - life6_9) + 0x1.cp4f);
    spill760_10 = recovery.source.CarrierOps.fcmpl(((float)(life15_216)), ((float)(0x0.0p0f)));
    if (!((life5_85 == null))) {
        forwardValue760_214_0 = spill760_10;
        break forward_join_214;
    }
    if (!((spill760_10 > 0))) {
        break forward_join_212;
    }
    life14_210 = (life14_210 - life15_216);
    }
    forwardValue760_214_0 = ((this.B) ? 1 : 0);
    }
    if (!((forwardValue760_214_0 != 0))) {
        break forward_join_232;
    }
    ((com.moon.hW)(life8_19)).a(((com.moon.iX)(com.moon.i3.a(((float)((p0 + life14_210))), ((float)(((p1 + 0x1.0p2f) + ((com.moon.jm)(life7_14)).a(((float)(0x1.cp2f)))))), ((float)(0x1.0p1f)), ((float)(0x1.6p3f)), ((float)(0x1.0p-1f)), ((int)(-1))))));
    }
    ((com.moon.hW)(life8_19)).b();
    ((com.moon.hW)(life9_26)).b();
    ((com.moon.hW)(life10_33)).a(((com.moon.jA)(life11_49)));
    ((com.moon.hW)(life10_33)).b();
    return;
}


public void a(int p0, int p1, int p2) {
com.moon.m_ lexicalValue213_37_0;
    com.moon.m_ lexicalValue213_103_0;
    int lexicalValue213_124_0;
    com.moon.nY lexicalValue213_139_0;
    com.moon.nY lexicalValue213_140_0;
    float lexicalValue213_140_1;
    com.moon.m_ lexicalValue213_148_0;
    int lexicalValue213_148_1;
    com.moon.m_ lexicalValue213_149_0;
    com.moon.m_ lexicalValue213_150_0;
    int lexicalValue213_150_1;
    int lexicalValue213_155_0;
    int lexicalValue213_280_0;
    int lexicalValue213_305_0;
    int lexicalValue213_309_0;
    com.moon.m_ lexicalValue213_325_0;
    com.moon.m_ lexicalValue213_327_0;
    int lexicalValue213_327_1;
    int lexicalValue213_327_2;
    net.minecraft.entity.Entity[] spill213_0;
    com.moon.m_ spill213_1;
    int spill213_2;
    com.moon.m_ spill213_3;
    boolean spill213_4;
    com.moon.nY spill213_5;
    com.moon.m_ spill213_6;
    boolean spill213_7;
    com.moon.m_ spill213_8;
    com.moon.m_ spill213_9;
    int spill213_10;
    int spill213_11;
    boolean spill213_12;
    int spill213_13;
    long life4_3;
    float life7_9;
    float life8_14;
    net.minecraft.entity.Entity[] life6_15;
    float life9_20;
    com.moon.jm life10_25;
    com.moon.jm life11_30;
    float life12_53;
    float life13_57;
    com.moon.jm life14_62;
    float life15_64;
    java.lang.String life16_66;
    float life17_71;
    float life18_76;
    int life19_85;
    float life20_197;
    java.util.List life21_201;
    int life22_203;
    java.lang.String life23_212;
    float life24_219;
    java.lang.String life25_221;
    float life26_226;
    float life27_233;
    int life28_279;
    lexical_join_327: {
    lexical_join_325: {
    lexical_join_324: {
    lexical_join_155: {
    lexical_join_151: {
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_148: {
    lexical_join_140: {
    lexical_join_139: {
    lexical_join_124: {
    lexical_join_106: {
    lexical_join_103: {
    lexical_join_102: {
    lexical_join_40: {
    lexical_join_37: {
    life4_3 = (com.moon.m_.H ^ 31948195154427L);
    spill213_0 = moom.lw.b__Arrayr3();
    life7_9 = (((com.moon.m_)(this)).a() + 0x1.0p3f);
    life8_14 = (((com.moon.m_)(this)).b() + 0x1.2p2f);
    life6_15 = spill213_0;
    life9_20 = (((com.moon.m_)(this)).c() - 0x1.0p4f);
    life10_25 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life11_30 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    spill213_1 = this;
    if (!((life6_15 == null))) {
        lexicalValue213_37_0 = spill213_1;
        break lexical_join_37;
    }
    if (!(((com.moon.m_)(spill213_1)).E)) {
        break lexical_join_40;
    }
    lexicalValue213_37_0 = this;
    }
    ((com.moon.m_)(lexicalValue213_37_0)).E = ((boolean)(false));
    return;
    }
    life12_53 = (((life7_9 + life9_20) - 0x1.1p4f) - 0x1.6p3f);
    life13_57 = (life8_14 + 0x1.ep3f);
    life14_62 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.MATERIAL_ICONS)));
    life15_64 = 0x1.08p3f;
    life16_66 = "";
    life17_71 = ((com.moon.jm)(life14_62)).a(((java.lang.String)(life16_66)), ((float)(life15_64)));
    life18_76 = ((com.moon.jm)(life14_62)).b(((java.lang.String)(life16_66)), ((float)(life15_64)));
    life19_85 = ((((com.moon.m_)(this)).a(((int)(p0)), ((int)(p1)), ((float)(life12_53)), ((float)(life13_57)), ((float)(life17_71)), ((float)(life18_76)))) ? 1 : 0);
    spill213_2 = life19_85;
    if (!((life6_15 == null))) {
        lexicalValue213_124_0 = spill213_2;
        break lexical_join_124;
    }
    if (!((spill213_2 != 0))) {
        break lexical_join_106;
    }
    this.F = ((boolean)(true));
    this.z = ((boolean)(true));
    this.A = ((java.lang.String)(""));
    spill213_3 = this;
    if (!((life6_15 == null))) {
        lexicalValue213_103_0 = spill213_3;
        break lexical_join_103;
    }
    if (!((!((com.moon.m_)(spill213_3)).y))) {
        break lexical_join_102;
    }
    ((com.moon.nY)(this.n)).a(((float)(0x0.0p0f)));
    }
    lexicalValue213_103_0 = this;
    }
    ((com.moon.m_)(lexicalValue213_103_0)).y = ((boolean)(true));
    return;
    }
    lexicalValue213_124_0 = ((((com.moon.m_)(this)).a(((int)(p0)), ((int)(p1)), ((float)((life7_9 - 0x1.0p-1f))), ((float)(((life8_14 + 0x1.8p1f) + ((com.moon.jm)(life10_25)).a(((float)(0x1.cp2f)))))), ((float)((life9_20 + 0x1.0p0f))), ((float)(0x1.1p4f)))) ? 1 : 0);
    }
    if (!((life6_15 == null))) {
        lexicalValue213_155_0 = lexicalValue213_124_0;
        break lexical_join_155;
    }
    if (!((lexicalValue213_124_0 != 0))) {
        break lexical_join_151;
    }
    spill213_4 = this.z;
    if (!((life6_15 == null))) {
        lexicalValue213_155_0 = ((spill213_4) ? 1 : 0);
        break lexical_join_155;
    }
    if (!((!spill213_4))) {
        break lexical_join_151;
    }
    spill213_5 = this.n;
    if (!(this.y)) {
        lexicalValue213_139_0 = spill213_5;
        break lexical_join_139;
    }
    lexicalValue213_140_0 = spill213_5;
    lexicalValue213_140_1 = 0x1.0p0f;
    break lexical_join_140;
    }
    lexicalValue213_140_0 = lexicalValue213_139_0;
    lexicalValue213_140_1 = 0x0.0p0f;
    }
    ((com.moon.nY)(lexicalValue213_140_0)).a(((float)(lexicalValue213_140_1)));
    spill213_6 = this;
    spill213_7 = this.y;
    if (!((life6_15 == null))) {
        lexicalValue213_148_0 = spill213_6;
        lexicalValue213_148_1 = ((spill213_7) ? 1 : 0);
        break lexical_join_148;
    }
    if (!((!spill213_7))) {
        lexicalValue213_149_0 = spill213_6;
        break lexical_join_149;
    }
    lexicalValue213_148_0 = spill213_6;
    lexicalValue213_148_1 = 1;
    }
    lexicalValue213_150_0 = lexicalValue213_148_0;
    lexicalValue213_150_1 = lexicalValue213_148_1;
    break lexical_join_150;
    }
    lexicalValue213_150_0 = lexicalValue213_149_0;
    lexicalValue213_150_1 = 0;
    }
    ((com.moon.m_)(lexicalValue213_150_0)).y = ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue213_150_1)));
    }
    spill213_8 = this;
    if (!((life6_15 == null))) {
        lexicalValue213_325_0 = spill213_8;
        break lexical_join_325;
    }
    lexicalValue213_155_0 = ((((com.moon.m_)(spill213_8)).y) ? 1 : 0);
    }
    if (!((lexicalValue213_155_0 != 0))) {
        break lexical_join_324;
    }
    life20_197 = (life8_14 + 0x1.dp4f);
    life21_201 = ((com.moon.setting.StringListSetting)(this.v)).getValues();
    life22_203 = 0;
    lexical_cycle_166: while (true) {
    lexical_join_321: {
    lexical_join_309: {
    lexical_join_305: {
    lexical_join_293: {
    lexical_join_291: {
    lexical_join_288: {
    lexical_join_280: {
    lexical_join_268: {
    if (!((life22_203 < ((java.util.List)(life21_201)).size()))) {
        break lexical_join_324;
    }
    life23_212 = ((java.lang.String)(((java.util.List)(life21_201)).get(((int)(life22_203)))));
    life24_219 = (life20_197 + (((float) life22_203) * 0x1.1p4f));
    life25_221 = "";
    life26_226 = ((com.moon.jm)(life11_30)).a(((java.lang.String)(life25_221)), ((float)(0x1.0p3f)));
    life27_233 = (((com.moon.jm)(life11_30)).b(((java.lang.String)(life25_221)), ((float)(0x1.0p3f))) - 0x1.8p2f);
    spill213_9 = this;
    spill213_10 = p0;
    spill213_11 = p1;
    if (!((life6_15 == null))) {
        lexicalValue213_327_0 = spill213_9;
        lexicalValue213_327_1 = spill213_10;
        lexicalValue213_327_2 = spill213_11;
        break lexical_join_327;
    }
    spill213_12 = ((com.moon.m_)(spill213_9)).a(((int)(spill213_10)), ((int)(spill213_11)), ((float)((((life7_9 + life9_20) - 0x1.1p3f) - 0x1.0p2f))), ((float)(((((life20_197 + (((float) life22_203) * 0x1.1p4f)) + 0x1.1p3f) - (((com.moon.jm)(life11_30)).a(((float)(0x1.cp2f))) / 0x1.0p1f)) + 0x1.0p-1f))), ((float)(life26_226)), ((float)(life27_233)));
    if (!((life6_15 == null))) {
        lexicalValue213_305_0 = ((spill213_12) ? 1 : 0);
        break lexical_join_305;
    }
    if (!(spill213_12)) {
        break lexical_join_293;
    }
    life28_279 = ((((java.lang.String)(life23_212)).equals(((java.lang.Object)(((com.moon.setting.StringListSetting)(this.v)).getValue())))) ? 1 : 0);
    spill213_13 = ((java.util.List)(life21_201)).size();
    if (!((life6_15 == null))) {
        lexicalValue213_280_0 = spill213_13;
        break lexical_join_280;
    }
    if (!((spill213_13 == 1))) {
        break lexical_join_268;
    }
    ((com.moon.hD)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__hD())).a(((com.moon.hA)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(((com.moon.hB)(com.moon.hA.a__hB())).a(((java.lang.String)(__sourceIntrinsic_e4d4f5a69301_invokedynamic213_61(30271, (2503314984642553230L ^ life4_3))))))).b(((java.lang.String)(__sourceIntrinsic_e4d4f5a69301_invokedynamic213_63(26139, (750594761438082475L ^ life4_3))))))).a(((long)(__sourceIntrinsic_e4d4f5a69301_invokedynamic213_65(1601, (7492534228510240484L ^ life4_3))))))).a(((com.moon.b8)(com.moon.b8.ERROR))))).a())));
    return;
    }
    ((java.util.Map)(this.u)).remove(((java.lang.Object)(life23_212)));
    ((java.util.List)(life21_201)).remove(((int)(life22_203)));
    if (!((life6_15 == null))) {
        break lexical_join_291;
    }
    lexicalValue213_280_0 = life28_279;
    }
    if (!((lexicalValue213_280_0 != 0))) {
        break lexical_join_288;
    }
    ((com.moon.setting.StringListSetting)(this.v)).setValue(((((java.lang.String)(((java.util.List)(life21_201)).get(((int)(0))))))));
    }
    this.w = ((int)(0));
    }
    if (!((life6_15 != null))) {
        break lexical_join_324;
    }
    }
    lexicalValue213_305_0 = ((((com.moon.m_)(this)).a(((int)(p0)), ((int)(p1)), ((float)((life7_9 - 0x1.0p-1f))), ((float)(life24_219)), ((float)((life9_20 + 0x1.0p0f))), ((float)(0x1.1p4f)))) ? 1 : 0);
    }
    if (!((life6_15 == null))) {
        lexicalValue213_309_0 = lexicalValue213_305_0;
        break lexical_join_309;
    }
    if (!((lexicalValue213_305_0 != 0))) {
        break lexical_join_321;
    }
    lexicalValue213_309_0 = p2;
    }
    if (!((lexicalValue213_309_0 == 0))) {
        break lexical_join_321;
    }
    ((com.moon.setting.StringListSetting)(this.v)).setValue(((((java.lang.String)(((com.moon.m_)(this)).a(((java.lang.Object)(((java.util.List)(life21_201)).get(((int)(life22_203)))))))))));
    if (!((life6_15 != null))) {
        break lexical_join_324;
    }
    }
    life22_203 += 1;
    if (!((life6_15 != null))) { continue lexical_cycle_166; }
    break lexical_cycle_166;
    }
    }
    lexicalValue213_325_0 = this;
    }
    lexicalValue213_327_0 = lexicalValue213_325_0;
    lexicalValue213_327_1 = p0;
    lexicalValue213_327_2 = p1;
    }
    __sourceIntrinsic_e4d4f5a69301_call213_86(lexicalValue213_327_0, lexicalValue213_327_1, lexicalValue213_327_2, p2);
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2281_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/m_"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private org.lwjgl.util.vector.Vector2f a(org.lwjgl.util.vector.Vector2f p0, org.lwjgl.util.vector.Vector2f p1, float p2) {
double local4_life1 = java.lang.Math.toRadians(((double)(((double) p2))));
    float local6_life3 = ((float) java.lang.Math.cos(((double)(local4_life1))));
    float local7_life5 = ((float) java.lang.Math.sin(((double)(local4_life1))));
    return new org.lwjgl.util.vector.Vector2f(((((org.lwjgl.util.vector.Vector2f)(p0)).x + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local6_life3)) - ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local7_life5)), ((((org.lwjgl.util.vector.Vector2f)(p0)).y + ((((org.lwjgl.util.vector.Vector2f)(p1)).x - ((org.lwjgl.util.vector.Vector2f)(p0)).x) * local7_life5)) + ((((org.lwjgl.util.vector.Vector2f)(p1)).y - ((org.lwjgl.util.vector.Vector2f)(p0)).y) * local6_life3)));
}


public void a(int p0, int p1) {
long local3_life2 = (com.moon.m_.H ^ 106673418438591L);
    ((com.moon.m_)(this)).d__sourceReturn_da8c82d5d4();
    float local5_life6 = (((com.moon.m_)(this)).a() + 0x1.0000000000000p+3F);
    float local6_life9 = (((com.moon.m_)(this)).b() + 0x1.2000000000000p+2F);
    float local7_life12 = (((com.moon.m_)(this)).c() - 0x1.0000000000000p+4F);
    com.moon.jm local8_life17 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    com.moon.hW local9_life22 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.TRIANGLE))))).a();
    float local10_life24 = 0x1.4000000000000p+2F;
    float local11_life28 = (-0x1.6800000000000p+6F * ((com.moon.nY)(this.n)).c());
    org.lwjgl.util.vector.Vector2f local12_life33 = new org.lwjgl.util.vector.Vector2f(((local5_life6 + local7_life12) - 0x1.1000000000000p+3F), (((local6_life9 + 0x1.0p0f) + ((com.moon.jm)(local8_life17)).a(((float)(0x1.c000000000000p+2F)))) + 0x1.1000000000000p+3F));
    org.lwjgl.util.vector.Vector2f local13_life36 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local12_life33)).x + (local10_life24 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local12_life33)).y + (local10_life24 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local14_life39 = new org.lwjgl.util.vector.Vector2f((((org.lwjgl.util.vector.Vector2f)(local12_life33)).x - (local10_life24 / 0x1.0p1f)), (((org.lwjgl.util.vector.Vector2f)(local12_life33)).y + (local10_life24 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local15_life42 = new org.lwjgl.util.vector.Vector2f(((org.lwjgl.util.vector.Vector2f)(local12_life33)).x, (((org.lwjgl.util.vector.Vector2f)(local12_life33)).y - (local10_life24 / 0x1.0p1f)));
    org.lwjgl.util.vector.Vector2f local16_life45 = ((com.moon.m_)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life33)), ((org.lwjgl.util.vector.Vector2f)(local15_life42)), ((float)((0x1.6800000000000p+7F + local11_life28))));
    org.lwjgl.util.vector.Vector2f local17_life48 = ((com.moon.m_)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life33)), ((org.lwjgl.util.vector.Vector2f)(local14_life39)), ((float)((0x1.6800000000000p+7F + local11_life28))));
    org.lwjgl.util.vector.Vector2f local18_life51 = ((com.moon.m_)(this)).a(((org.lwjgl.util.vector.Vector2f)(local12_life33)), ((org.lwjgl.util.vector.Vector2f)(local13_life36)), ((float)((0x1.6800000000000p+7F + local11_life28))));
    ((com.moon.hW)(local9_life22)).a(((com.moon.iX)(com.moon.i8.a(((float)(((org.lwjgl.util.vector.Vector2f)(local16_life45)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local16_life45)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local17_life48)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local17_life48)).y)), ((float)(((org.lwjgl.util.vector.Vector2f)(local18_life51)).x)), ((float)(((org.lwjgl.util.vector.Vector2f)(local18_life51)).y)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite140_63(30873, (6990636543589297045L ^ local3_life2)))));
    ((com.moon.hW)(local9_life22)).b();
    org.lwjgl.opengl.GL11.glDisable(((int)(__sourceIntrinsic_fd0ba049c90e_originalDynamicSite140_67(30873, (6990636543589297045L ^ local3_life2)))));
    super.a(((int)(p0)), ((int)(p1)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(char p0, int p1) {
int forestValue100030_13_0;
    int forestValue100030_23_0;
    int forestValue100030_40_0;
    com.moon.m_ forestValue100030_49_0;
    com.moon.m_ forestValue100030_50_0;
    com.moon.m_ forestValue100030_50_1;
    com.moon.m_ forestValue100030_60_0;
    java.lang.String forestValue100030_60_1;
    int forestValue100030_67_0;
    com.moon.m_ forestValue100030_82_0;
    int forestValue100030_88_0;
    boolean spill100030_0;
    boolean spill100030_1;
    com.moon.m_ spill100030_2;
    com.moon.m_ spill100030_3;
    com.moon.m_ spill100030_4;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    forest_join_89: {
    forest_join_88: {
    forest_join_87: {
    forest_join_82: {
    forest_join_81: {
    forest_join_67: {
    forest_join_65: {
    forest_join_64: {
    forest_join_60: {
    forest_join_50: {
    forest_join_49: {
    forest_join_40: {
    forest_join_23: {
    forest_join_22: {
    forest_join_13: {
    life3_3 = (com.moon.m_.H ^ 129835152246723L);
    life5_5 = moom.lw.b__Arrayr3();
    spill100030_0 = this.z;
    if (!((life5_5 == null))) {
        forestValue100030_13_0 = ((spill100030_0) ? 1 : 0);
        break forest_join_13;
    }
    if (!(spill100030_0)) {
        break forest_join_89;
    }
    forestValue100030_13_0 = ((__sourceExactCall_87e260e21a2d7a(((int)(p1)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forestValue100030_23_0 = forestValue100030_13_0;
        break forest_join_23;
    }
    if (!((forestValue100030_13_0 != 0))) {
        break forest_join_22;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)(false)));
    this.C = ((boolean)(true));
    return;
    }
    forestValue100030_23_0 = p1;
    }
    if (!((life5_5 == null))) {
        forestValue100030_67_0 = forestValue100030_23_0;
        break forest_join_67;
    }
    if (!((forestValue100030_23_0 == __sourceIntrinsic_f7d59ba1def0_invokedynamic100030_8(30451, (8270358835283109249L ^ life3_3))))) {
        break forest_join_65;
    }
    spill100030_1 = ((java.lang.String)(((java.lang.String)(((com.moon.setting.StringListSetting)(this.v)).getValue())))).isEmpty();
    if (!((life5_5 == null))) {
        forestValue100030_40_0 = ((spill100030_1) ? 1 : 0);
        break forest_join_40;
    }
    if (!((!spill100030_1))) {
        break forest_join_64;
    }
    forestValue100030_40_0 = 1;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forestValue100030_40_0))));
    spill100030_2 = this;
    spill100030_3 = this;
    if (!((life5_5 == null))) {
        forestValue100030_50_0 = spill100030_2;
        forestValue100030_50_1 = spill100030_3;
        break forest_join_50;
    }
    if (!(((com.moon.m_)(spill100030_3)).C)) {
        forestValue100030_49_0 = spill100030_2;
        break forest_join_49;
    }
    forestValue100030_60_0 = spill100030_2;
    forestValue100030_60_1 = "";
    break forest_join_60;
    }
    forestValue100030_50_0 = forestValue100030_49_0;
    forestValue100030_50_1 = this;
    }
    forestValue100030_60_0 = forestValue100030_50_0;
    forestValue100030_60_1 = ((java.lang.String)(((com.moon.m_)(forestValue100030_50_1)).A)).substring(((int)(0)), ((int)(java.lang.Math.max(((int)((((java.lang.String)(this.A)).length() - 1))), ((int)(0))))));
    }
    ((com.moon.m_)(forestValue100030_60_0)).A = ((java.lang.String)(forestValue100030_60_1));
    this.C = ((boolean)(false));
    }
    return;
    }
    forestValue100030_67_0 = ((moom.CH.a(((char)(p0)))) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forestValue100030_88_0 = forestValue100030_67_0;
        break forest_join_88;
    }
    if (!((forestValue100030_67_0 != 0))) {
        break forest_join_87;
    }
    spill100030_4 = this;
    if (!((life5_5 == null))) {
        forestValue100030_82_0 = spill100030_4;
        break forest_join_82;
    }
    if (!(((com.moon.m_)(spill100030_4)).C)) {
        break forest_join_81;
    }
    this.A = ((java.lang.String)(""));
    this.C = ((boolean)(false));
    }
    forestValue100030_82_0 = this;
    }
    ((com.moon.m_)(forestValue100030_82_0)).A = ((java.lang.String)(__sourceIntrinsic_f7d59ba1def0_invokedynamic100030_29(this.A, p0)));
    }
    forestValue100030_88_0 = 0;
    }
    org.lwjgl.input.Keyboard.enableRepeatEvents(((boolean)__sourceIntrinsic_integerToBoolean((forestValue100030_88_0))));
    }
    return;
}


public static boolean a(int p0) {
int forwardValue761_16_0;
    int forwardValue761_20_0;
    int forwardValue761_24_0;
    int forwardValue761_28_0;
    int forwardValue761_30_0;
    int spill761_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    forward_join_24: {
    forward_join_20: {
    forward_join_16: {
    life1_3 = (com.moon.m_.H ^ 62288264773967L);
    life3_5 = moom.lw.b__Arrayr3();
    spill761_0 = p0;
    if (!((life3_5 == null))) {
        forwardValue761_16_0 = spill761_0;
        break forward_join_16;
    }
    if (!((spill761_0 == __sourceIntrinsic_f3a7748b91d1_invokedynamic761_2(24951, (3702259972934562946L ^ life1_3))))) {
        break forward_join_29;
    }
    forwardValue761_16_0 = ((net.minecraft.client.gui.GuiScreen.b__BooleanStatic()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue761_20_0 = forwardValue761_16_0;
        break forward_join_20;
    }
    if (!((forwardValue761_16_0 != 0))) {
        break forward_join_29;
    }
    forwardValue761_20_0 = ((net.minecraft.client.gui.GuiScreen.c__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue761_24_0 = forwardValue761_20_0;
        break forward_join_24;
    }
    if (!((forwardValue761_20_0 == 0))) {
        break forward_join_29;
    }
    forwardValue761_24_0 = ((net.minecraft.client.gui.GuiScreen.d__Boolean()) ? 1 : 0);
    }
    if (!((life3_5 == null))) {
        forwardValue761_28_0 = forwardValue761_24_0;
        break forward_join_28;
    }
    if (!((forwardValue761_24_0 == 0))) {
        break forward_join_29;
    }
    forwardValue761_28_0 = 1;
    }
    forwardValue761_30_0 = forwardValue761_28_0;
    break forward_join_30;
    }
    forwardValue761_30_0 = 0;
    }
    return ((forwardValue761_30_0) != 0);
}


public com.moon.setting.Setting a__sourceReturn_7d3c444d39() {
return this.v;
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
        byte[] spill763_0 = p0;
        life4_9 += 1;
        life5_44 = (spill763_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill763_1 = p0;
        life4_9 += 1;
        life5_76 = (spill763_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill763_2 = p0;
        life4_9 += 1;
        life5_91 = (spill763_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 2810);
    if (((com.moon.m_.K)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.m_.L)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.m_.L)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/m_", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.m_.J)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.m_.K)[life5_8] = __sourceExactCall_cd53d953252b59(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.m_.K)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = __sourceExactCall_1657f3cceaabfc(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static native <E extends Throwable> long __sourceIntrinsic_7839a24ccc30e040_originalDynamicSite139_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_7839a24ccc30e040_originalDynamicSite139_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f7d59ba1def0_invokedynamic100030_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_f7d59ba1def0_invokedynamic100030_29(java.lang.String a0, char a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9229ce90378e_invokedynamic760_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9229ce90378e_invokedynamic760_41(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_9229ce90378e_invokedynamic760_46(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f3a7748b91d1_invokedynamic761_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite140_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_originalDynamicSite140_67(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e4d4f5a69301_invokedynamic213_61(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e4d4f5a69301_invokedynamic213_63(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_e4d4f5a69301_invokedynamic213_65(int a0, long a1) throws E;

private static native <E extends Throwable> void __sourceIntrinsic_e4d4f5a69301_call213_86(com.moon.m_ a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2281_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral2272_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic100029_25(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic100029_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic100029_76(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic100029_94(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic100029_120(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_505b8c2844d4_invokedynamic100029_140(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2274_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84bf6114351d_invokedynamic215_35(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84bf6114351d_invokedynamic215_74(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_84bf6114351d_invokedynamic215_116(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_85f1dd884e89_invokedynamic216_9(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);

private static native int __sourceExactCall_f036cdf2d1f299(int p0, long p1);
private static native long __sourceExactCall_b0b0453d28a21a(int p0, long p1);
private static native void __sourceExactCall_6604345f74a40b(java.lang.String[] p0);
private static native boolean __sourceExactCall_87e260e21a2d7a(int p0);
private static native java.lang.String __sourceExactCall_cd53d953252b59(byte[] p0);
private static native java.lang.String __sourceExactCall_1657f3cceaabfc(int p0, long p1);
}
