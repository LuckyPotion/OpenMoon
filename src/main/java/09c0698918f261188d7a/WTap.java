package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class WTap extends com.moon.module.Module {

private com.moon.setting.EnumSetting<com.moon.bh> s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.ModeSetting<com.moon.bg> u;

private com.moon.setting.IntegerSetting v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.IntegerSetting x;

private static long y;

private static java.lang.String[] z;

private static java.lang.String[] A;

private static java.util.Map B;

private static long[] C;

private static java.lang.Integer[] D;

private static java.util.Map E;

public WTap(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_437897ba5526f98a(com.moon.module.impl.WTap receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.WTap.y ^ 121295753311661L);

    com.moon.module.impl.WTap.__sourceConstructorInit_437897ba5526f98a_0(((com.moon.module.impl.WTap)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.WTap)(receiver)).s = ((com.moon.setting.EnumSetting)(((com.moon.mg)(((com.moon.mg)(com.moon.setting.EnumSetting.builder(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_2(6170, (8378658752426949866L ^ local5)))), ((java.lang.Class)(com.moon.bh.class)), ((com.moon.module.Module)(receiver))))).a(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_5(24743, (1285368853411349589L ^ local5)))), ((java.lang.Enum)(com.moon.bh.BLATANT))))).a()));

    ((com.moon.module.impl.WTap)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_10(30936, (8519999022297111593L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_12(8946, (394928655163950599L ^ local5)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_14(receiver)))))).a()));

    ((com.moon.module.impl.WTap)(receiver)).u = ((com.moon.setting.ModeSetting)(((com.moon.mc)(((com.moon.mc)(((com.moon.mc)(com.moon.setting.ModeSetting.builder(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_18(10058, (8316077131572872124L ^ local5)))), ((java.lang.Class)(com.moon.bg.class))))).a(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_21(29329, (5223925552699528805L ^ local5)))), ((java.lang.Enum)(com.moon.bg.HURT_TIME))))).a(((java.util.function.Supplier)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_24(receiver)))))).a()));

    ((com.moon.module.impl.WTap)(receiver)).v = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_28(13907, (2385129681349546668L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_30(31832, (1647123381644187814L ^ local5)))), ((int)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_31(732, (6771701649409859724L ^ local5)))), ((int)(0)), ((int)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_32(28790, (4543184956490846759L ^ local5)))), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_34(receiver)))))).a()));

    ((com.moon.module.impl.WTap)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_38(21290, (182126417174984662L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_40(5526, (8598057351739322725L ^ local5)))), ((boolean)(false))))).a(((java.util.function.Supplier)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_42(receiver)))))).a()));

    ((com.moon.module.impl.WTap)(receiver)).x = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_46(28490, (8695825253656415159L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_48(13883, (4143420825288446668L ^ local5)))), ((int)(1)), ((int)(0)), ((int)(5)), ((int)(1))))).a(((java.util.function.Supplier)(__sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_50(receiver)))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_437897ba5526f98a_0(com.moon.module.impl.WTap a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
y = ((long)(((moom._a)(moom._c.a(((long)(4275010178501549021L)), ((long)(7049652876779332389L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(83575796004521L)))));
    B = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.WTap.y ^ 90344131220816L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill297_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill297_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill297_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill297_14 = new byte[8];
    (__sourceSpill297_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill297_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation297_16 = __sourceSpill297_14;
    ((javax.crypto.Cipher)(__sourceSpill297_11)).init(((int)(__sourceSpill297_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill297_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation297_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[12];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "96 \020ï\031&ØááhàÈæî~PsØÔ\035VX\bd\n\001N D·\017R)4\006r\003\b\013fzú\002õ¤å]Z\"Æú|ßß\\(YTp\016U§s[- ¹c:\000\rúÛýàê1Úùu\035óDrÐÔ´e;Èü³Ô nî}\0167m$û&°ú{\r3n´ó­§$oM¨T Ó\002`¯\031i\021Y®Yå\bP¯~c:k*«¢q³ÿßÛ|þæf\020mMëg7ìî=;ÞOVÃ?\004(Ï¦¤(I0AÙ^ ¶\004Ùã©\031B5øQZZ|·JØqõþ(\027]³{_\020\0062\024>\027,#»Ùá\000çuµ\0240¨ ²¹­\025*\toU]\017Óàî \004?éJÉ0ûá¸¢\024ÉéØÜKf^\\>FÏ\001)sF®\030xÒ q¡íà7OÞ&\177£ÜÀ¥\nÎx Áy\006\\"))).length();
    int local16_life24 = 32;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill297_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill297_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill297_29)).doFinal(((byte[])(__sourceSpill297_28)));
        java.lang.String __sourceSpill297_34 = ((java.lang.String)(com.moon.module.impl.WTap.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill297_35 = local20_life19;
        int __sourceSpill297_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill297_35)[__sourceSpill297_36] = __sourceSpill297_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "­¼ ¢Z>ø;6±òÝR\022n¡ÜÃ\032\b <(\020Ö1õ5\n\017ÐÁ{ÀÉåV¸Õë§´Å\037p\004¬\013D9\f"))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill297_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill297_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill297_42)).doFinal(((byte[])(__sourceSpill297_41)));
        java.lang.String __sourceSpill297_47 = ((java.lang.String)(com.moon.module.impl.WTap.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill297_48 = local20_life19;
        int __sourceSpill297_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill297_48)[__sourceSpill297_49] = __sourceSpill297_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    z = ((java.lang.String[])(local20_life19));
    A = ((java.lang.String[])(new java.lang.String[12]));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill297_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill297_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill297_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill297_60 = new byte[8];
    (__sourceSpill297_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill297_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation297_62 = __sourceSpill297_60;
    ((javax.crypto.Cipher)(__sourceSpill297_57)).init(((int)(__sourceSpill297_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill297_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation297_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ëXYd¯í\005«P¹§Ô\023çA"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill297_71 = local4_life67;
        int __sourceSpill297_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill297_71)).substring(((int)(__sourceSpill297_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill297_76 = local6_life65;
        int __sourceSpill297_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill297_79 = new byte[8];
        (__sourceSpill297_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill297_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill297_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill297_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill297_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill297_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill297_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill297_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill297_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill297_80)).doFinal(((byte[])(__sourceSpill297_79)));
        (__sourceSpill297_76)[__sourceSpill297_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    C = ((long[])(local6_life65));
    D = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public com.moon.setting.BooleanSetting b__kV() {
return this.w;
}


public com.moon.setting.IntegerSetting b() {
return this.x;
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
        byte[] spill1257_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1257_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1257_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1257_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1257_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1257_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 10886);
    if (((com.moon.module.impl.WTap.A)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.WTap.B)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.WTap.B)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lf", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.WTap.z)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.WTap.A)[life5_8] = com.moon.module.impl.WTap.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.WTap.A)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.WTap.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2754_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.WTap.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2755_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27682;
      if (D[var3] == null) {
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
         long var5 = C[var3];
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
         Object[] var9 = (Object[])E.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               E.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         D[var3] = var15;
      }

      return D[var3];
}


public com.moon.setting.ModeSetting<com.moon.bg> a__kY() {
return this.u;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.t;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public com.moon.setting.EnumSetting<com.moon.bh> a__k2() {
return this.s;
}


public com.moon.setting.IntegerSetting a() {
return this.v;
}


private java.lang.Boolean lambda$new$0() {
long local1 = (com.moon.module.impl.WTap.y ^ 13036100510313L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bh.BLATANT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$1() {
long local1 = (com.moon.module.impl.WTap.y ^ 52655718299032L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bh.LEGIT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$3() {
long local1 = (com.moon.module.impl.WTap.y ^ 77686622894761L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bh.LEGIT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$2() {
long local1 = (com.moon.module.impl.WTap.y ^ 96951383840124L);
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((((((com.moon.setting.EnumSetting)(this.s)).getValue() == com.moon.bh.LEGIT) ? 1 : 0)))));
}


private java.lang.Boolean lambda$new$4() {
java.lang.Object forwardValue966_16_0;
    int forwardValue966_22_0;
    int forwardValue966_24_0;
    java.lang.Object spill966_0;
    boolean spill966_1;
    long life1_3;
    int life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_16: {
    life1_3 = (com.moon.module.impl.WTap.y ^ 16425884330324L);
    life3_5 = ((com.moon.bg.c()) ? 1 : 0);
    spill966_0 = ((com.moon.setting.EnumSetting)(this.s)).getValue();
    if (!((life3_5 != 0))) {
        forwardValue966_16_0 = spill966_0;
        break forward_join_16;
    }
    if (!((spill966_0 == com.moon.bh.LEGIT))) {
        break forward_join_23;
    }
    forwardValue966_16_0 = ((com.moon.setting.BooleanSetting)(this.w)).getValue();
    }
    spill966_1 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue966_16_0)))).booleanValue();
    if (!((life3_5 != 0))) {
        forwardValue966_22_0 = ((spill966_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill966_1)) {
        break forward_join_23;
    }
    forwardValue966_22_0 = 1;
    }
    forwardValue966_24_0 = forwardValue966_22_0;
    break forward_join_24;
    }
    forwardValue966_24_0 = 0;
    }
    return java.lang.Boolean.valueOf(((boolean)__sourceIntrinsic_integerToBoolean((forwardValue966_24_0))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_14(com.moon.module.impl.WTap a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_24(com.moon.module.impl.WTap a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_31(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_34(com.moon.module.impl.WTap a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_38(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_42(com.moon.module.impl.WTap a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_46(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_48(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_437897ba5526f98a_originalDynamicSite1320_50(com.moon.module.impl.WTap a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2754_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2755_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
