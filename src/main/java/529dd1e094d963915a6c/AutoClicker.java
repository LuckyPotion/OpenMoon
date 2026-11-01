package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class AutoClicker extends com.moon.module.Module {

public com.moon.setting.FloatSetting s;

public com.moon.setting.BooleanSetting t;

public com.moon.setting.BooleanSetting u;

public com.moon.setting.BooleanSetting v;

public com.moon.setting.BooleanSetting w;

public com.moon.setting.BooleanSetting x;

private com.moon.fZ y;

private double z;

private double A;

private double B;

private int C;

private com.moon.nW D;

private long E;

private double F;

private double G;

private net.minecraft.entity.Entity H;

private static long I;

private static java.lang.String[] J;

private static java.lang.String[] K;

private static java.util.Map L;

private static long[] M;

private static java.lang.Integer[] N;

private static java.util.Map O;

public AutoClicker(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_770b1e009cd0fd50(com.moon.module.impl.AutoClicker receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.AutoClicker.I ^ 64370940865206L);

    com.moon.module.impl.AutoClicker.__sourceConstructorInit_770b1e009cd0fd50_0(((com.moon.module.impl.AutoClicker)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.AutoClicker)(receiver)).s = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_2(8367, (848445032271405711L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_4(23774, (6689174689852792562L ^ local5)))), ((float)(0x1.cp3f)), ((float)(0x1.0p0f)), ((float)(0x1.4p4f)), ((float)(0x1.99999ap-4f))))).a()));

    ((com.moon.module.impl.AutoClicker)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_8(3395, (4019964687055966048L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_10(19107, (376502887177914508L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.AutoClicker)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_14(15635, (8740270865527275316L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_16(3791, (8406320993789299940L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.AutoClicker)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_20(15943, (2416137406278073445L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_22(27471, (2696976556907506025L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.AutoClicker)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_26(16803, (6917949117129655181L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_28(719, (4200341978546684130L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.AutoClicker)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_32(1238, (7164329091765028599L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_34(10890, (72505788129077423L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.AutoClicker)(receiver)).y = ((com.moon.fZ)(new com.moon.fZ()));

    ((com.moon.module.impl.AutoClicker)(receiver)).z = ((double)(0x1.fffffffffffffp1023d));

    ((com.moon.module.impl.AutoClicker)(receiver)).A = ((double)(((com.moon.module.impl.AutoClicker)(receiver)).a(((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.AutoClicker)(receiver)).s)).getValue())))).floatValue()))), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.AutoClicker)(receiver)).w)).getValue())))).booleanValue())), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.AutoClicker)(receiver)).x)).getValue())))).booleanValue())))));

    ((com.moon.module.impl.AutoClicker)(receiver)).D = ((com.moon.nW)(new com.moon.nW()));

    ((com.moon.module.impl.AutoClicker)(receiver)).E = ((long)(((long) com.moon.nI.a(((int)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_55(15323, (2863776275794879024L ^ local5)))), ((int)(__sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_56(25309, (6611231826443057982L ^ local5))))))));

    ((com.moon.module.impl.AutoClicker)(receiver)).F = ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.AutoClicker)(receiver)).s)).getValue())))).floatValue())));

    ((com.moon.module.impl.AutoClicker)(receiver)).G = ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(((com.moon.module.impl.AutoClicker)(receiver)).s)).getValue())))).floatValue())));

    return;

}



static {
I = ((long)(((moom._a)(moom._c.a(((long)(6798236560263572115L)), ((long)(-7862459363682027752L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(171814251830204L)))));
    L = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.AutoClicker.I ^ 24001900788300L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill258_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill258_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill258_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill258_14 = new byte[8];
    (__sourceSpill258_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill258_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation258_16 = __sourceSpill258_14;
    ((javax.crypto.Cipher)(__sourceSpill258_11)).init(((int)(__sourceSpill258_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill258_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation258_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[13];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Åje\037\004\031ù*nÞX\033sÝªM·4¤¼7É3(£ÝFE\\A\005à\030(Ê\n\0342ï,ö(Oìazµ§§\032á×IP®\\ÃSÉ¢ÙvÊ$'¢Õ#£ZMJS6v÷J0E4bª·'v\030þ·\005.ú( >ñi\030iöÂFÆ³µ+ôÊª\017òFwyB-ð©Võ0\020¶äa\025ôv£EY/t\037\030&D_Þ<\"~\025KÓËoìE8Ð¢ø!÷(H|¹[\\w°\001©cx\001*¿¢kö£\000íø½\ráõ\026\026iøª\bW¥µ¥¹Æ\\8\034\006\"ÂéìÉNö\027\005$©ì*ÃG©ÚGLYÎ>¼Ï¾¥Çù\004Ñ\r\023gMXæ÷\030\013©Æ`ó×ú=\013\020ç@§ö÷á\177#äZ¸3Ý\013\r ÚSGtRegâ\\ ìHDòûª3MY9Ë¬¨¢Ø6U\000Ñ\020qÀ\025@®\003*Y^Oþ$´[ ´£\t'þk¡1Â'\035}êoûX®õ\007N)}æÝQb\\iÈÅ"))).length();
    int local16_life24 = 48;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill258_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill258_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill258_29)).doFinal(((byte[])(__sourceSpill258_28)));
        java.lang.String __sourceSpill258_34 = ((java.lang.String)(com.moon.module.impl.AutoClicker.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill258_35 = local20_life19;
        int __sourceSpill258_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill258_35)[__sourceSpill258_36] = __sourceSpill258_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "âª\f¿ºD\017&&[£ds&\006mÈ\005j]I¦ú\034IÓsfØ5á\027 £@\035({n\025 _«Àñá\032¨\002Ìû2O<2[U¤7W\036¹ÝlåíZ"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill258_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill258_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill258_42)).doFinal(((byte[])(__sourceSpill258_41)));
        java.lang.String __sourceSpill258_47 = ((java.lang.String)(com.moon.module.impl.AutoClicker.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill258_48 = local20_life19;
        int __sourceSpill258_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill258_48)[__sourceSpill258_49] = __sourceSpill258_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    J = ((java.lang.String[])(local20_life19));
    K = ((java.lang.String[])(new java.lang.String[13]));
    O = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill258_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill258_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill258_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill258_60 = new byte[8];
    (__sourceSpill258_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill258_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation258_62 = __sourceSpill258_60;
    ((javax.crypto.Cipher)(__sourceSpill258_57)).init(((int)(__sourceSpill258_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill258_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation258_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[9];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "\t»\004DBÈú¹Ë8èÇífi½Oµ4ÝUOÿ*©D\025\nânÉÎ©7Øõ[K!¹\003\034fg®\031Rû"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill258_71 = local4_life67;
        int __sourceSpill258_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill258_71)).substring(((int)(__sourceSpill258_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill258_76 = local6_life65;
        int __sourceSpill258_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill258_79 = new byte[8];
        (__sourceSpill258_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill258_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill258_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill258_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill258_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill258_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill258_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill258_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill258_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill258_80)).doFinal(((byte[])(__sourceSpill258_79)));
        (__sourceSpill258_76)[__sourceSpill258_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = ":î\nà\007 ÿbnéÏ¶Ö¢Î"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill258_84 = local4_life67;
        int __sourceSpill258_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill258_84)).substring(((int)(__sourceSpill258_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill258_89 = local6_life65;
        int __sourceSpill258_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill258_92 = new byte[8];
        (__sourceSpill258_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill258_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill258_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill258_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill258_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill258_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill258_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill258_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill258_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill258_93)).doFinal(((byte[])(__sourceSpill258_92)));
        (__sourceSpill258_89)[__sourceSpill258_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    M = ((long[])(local6_life65));
    N = ((java.lang.Integer[])(new java.lang.Integer[9]));
}

private static native <E extends Throwable> void __sourceConstructorInit_770b1e009cd0fd50_0(com.moon.module.impl.AutoClicker a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2349_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.AutoClicker.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
        byte[] spill1027_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1027_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1027_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1027_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1027_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1027_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30349);
    if (((com.moon.module.impl.AutoClicker.K)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.AutoClicker.L)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.AutoClicker.L)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/k9", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.AutoClicker.J)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.AutoClicker.K)[life5_8] = com.moon.module.impl.AutoClicker.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.AutoClicker.K)[life5_8];
}


private void c(boolean p0) {
int local2 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).W)).at)).b();
    moom.pz.a(((int)(local2)), ((boolean)(p0)));
    return;
}


private void f() {
int local1 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).W)).av)).b();
    moom.pz.a(((int)(local1)), ((boolean)(true)));
    moom.pz.a(((int)(local1)));
    moom.pz.a(((int)(local1)), ((boolean)(false)));
    moom.pz.a(((int)(local1)));
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.AutoClicker.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 27977;
      if (N[var3] == null) {
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
         long var5 = M[var3];
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
         Object[] var9 = (Object[])O.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               O.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/k9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         N[var3] = var15;
      }

      return N[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2352_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/k9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private double a(double p0, double p1) {
double local5 = ((double) (0x1.4p4f - ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue()));
    return java.lang.Math.max(((double)(p1)), ((double)((p0 - (local5 / 0x1.0p2d)))));
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.Minecraft forestValue117_16_0;
    com.moon.module.impl.AutoClicker forestValue117_59_0;
    float forestValue117_83_0;
    int forestValue117_130_0;
    java.lang.Object forestValue117_189_0;
    int forestValue117_191_0;
    int forestValue117_198_0;
    int forestValue117_202_0;
    int forestValue117_204_0;
    int forestValue117_224_0;
    int forestValue117_234_0;
    com.moon.module.impl.AutoClicker forestValue117_259_0;
    com.moon.module.impl.AutoClicker forestValue117_262_0;
    net.minecraft.client.Minecraft spill117_0;
    com.moon.module.impl.AutoClicker spill117_1;
    int spill117_2;
    boolean spill117_3;
    net.minecraft.client.gui.GuiScreen spill117_4;
    net.minecraft.util.MovingObjectPosition spill117_5;
    net.minecraft.util.MovingObjectPosition$MovingObjectType spill117_6;
    com.moon.module.impl.AutoClicker spill117_7;
    com.moon.module.impl.AutoClicker spill117_8;
    com.moon.module.impl.AutoClicker spill117_9;
    long life2_3;
    int life4_5;
    double life5_68;
    double life7_79;
    double life9_98;
    int life5_136;
    int life6_138;
    int life7_223;
    forest_join_262: {
    forest_join_261: {
    forest_join_259: {
    forest_join_258: {
    forest_join_234: {
    forest_join_224: {
    forest_join_222: {
    forest_join_130: {
    forest_join_120: {
    forest_join_83: {
    forest_join_82: {
    forest_join_59: {
    forest_join_58: {
    forest_join_19: {
    forest_join_18: {
    forest_join_16: {
    life2_3 = (com.moon.module.impl.AutoClicker.I ^ 100862449839756L);
    life4_5 = ((com.moon.bg.b()) ? 1 : 0);
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forest_join_18;
    }
    spill117_0 = com.moon.module.impl.AutoClicker.d;
    if (!((life4_5 == 0))) {
        forestValue117_16_0 = spill117_0;
        break forest_join_16;
    }
    if (!((((net.minecraft.client.Minecraft)(spill117_0)).K != null))) {
        break forest_join_18;
    }
    forestValue117_16_0 = com.moon.module.impl.AutoClicker.d;
    }
    if (!((((net.minecraft.client.Minecraft)(forestValue117_16_0)).I == null))) {
        break forest_join_19;
    }
    }
    return;
    }
    ((com.moon.module.impl.AutoClicker)(this)).setSuffix(((java.lang.String)(java.lang.String.format(((java.lang.String)(__sourceIntrinsic_be06bc302d53_invokedynamic117_15(com.moon.nI.a(((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue()))), ((int)(1))), __sourceIntrinsic_be06bc302d53_invokedynamic117_14(18802, (6669385607207587692L ^ life2_3))))), ((java.lang.Object[])(new java.lang.Object[0]))))));
    spill117_1 = this;
    if (!((life4_5 == 0))) {
        forestValue117_59_0 = spill117_1;
        break forest_join_59;
    }
    if (!((!((com.moon.nW)(((com.moon.module.impl.AutoClicker)(spill117_1)).D)).b(((long)(this.E)))))) {
        break forest_join_58;
    }
    spill117_2 = recovery.source.CarrierOps.dcmpl(((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue()))), ((double)(this.G)));
    if (!((life4_5 == 0))) {
        forestValue117_130_0 = spill117_2;
        break forest_join_130;
    }
    if (!((spill117_2 != 0))) {
        break forest_join_120;
    }
    }
    forestValue117_59_0 = this;
    }
    life5_68 = ((com.moon.module.impl.AutoClicker)(forestValue117_59_0)).a(((double)(0x1.2p2d)), ((double)(0x1.0p0d)));
    life7_79 = java.lang.Math.max(((double)(0x1.0p0d)), ((double)((((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue()) - life5_68))));
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue())) {
        break forest_join_82;
    }
    forestValue117_83_0 = 0x1.6p4f;
    break forest_join_83;
    }
    forestValue117_83_0 = 0x1.4p4f;
    }
    life9_98 = ((double) java.lang.Math.min(((float)(forestValue117_83_0)), ((float)((((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue() + 0x1.0p1f)))));
    this.F = ((double)(com.moon.nI.a(((double)(life7_79)), ((double)(life9_98)))));
    this.G = ((double)(((double) ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())));
    this.E = ((long)(((long) com.moon.nI.a(((int)(__sourceIntrinsic_be06bc302d53_invokedynamic117_49(24073, (4499839434606773201L ^ life2_3)))), ((int)(__sourceIntrinsic_be06bc302d53_invokedynamic117_50(28858, (3218469070932946276L ^ life2_3))))))));
    }
    forestValue117_130_0 = (((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).W)).av)).b() + __sourceIntrinsic_be06bc302d53_invokedynamic117_57(3442, (7322760981031440553L ^ life2_3)));
    }
    life5_136 = forestValue117_130_0;
    life6_138 = 0;
    forest_cycle_133: while (true) {
    forest_join_204: {
    forest_join_203: {
    forest_join_202: {
    forest_join_198: {
    forest_join_191: {
    forest_join_189: {
    forest_join_182: {
    forest_join_181: {
    forest_join_172: {
    forest_join_170: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((double) this.C))), ((double)(this.A))) >= 0))) {
        break forest_join_222;
    }
    spill117_3 = org.lwjgl.input.Mouse.isButtonDown(((int)(life5_136)));
    if (!((life4_5 == 0))) {
        forestValue117_224_0 = ((spill117_3) ? 1 : 0);
        break forest_join_224;
    }
    if (!((life4_5 == 0))) {
        forestValue117_191_0 = ((spill117_3) ? 1 : 0);
        break forest_join_191;
    }
    if (!(spill117_3)) {
        break forest_join_182;
    }
    spill117_4 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).P;
    if (!((life4_5 == 0))) {
        forestValue117_189_0 = spill117_4;
        break forest_join_189;
    }
    if (!((spill117_4 == null))) {
        break forest_join_182;
    }
    spill117_5 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).V;
    if (!((life4_5 == 0))) {
        forestValue117_189_0 = spill117_5;
        break forest_join_189;
    }
    if (!((spill117_5 != null))) {
        break forest_join_182;
    }
    spill117_6 = ((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).V)).b;
    if (!((life4_5 == 0))) {
        forestValue117_189_0 = spill117_6;
        break forest_join_189;
    }
    if (!((spill117_6 != null))) {
        break forest_join_182;
    }
    switch ((com.moon.fX.a)[((net.minecraft.util.MovingObjectPosition$MovingObjectType)(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).V)).b)).ordinal()]) {
case 1:
case 2:
{
        break forest_join_170;
    }
default:
{
        break forest_join_172;
    }
}
    }
    ((com.moon.module.impl.AutoClicker)(this)).f();
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).V)).e != null))) {
        break forest_join_181;
    }
    this.H = ((net.minecraft.entity.Entity)(((net.minecraft.util.MovingObjectPosition)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoClicker.d)).V)).e));
    }
    life6_138 += 1;
    }
    this.B = ((double)(this.A));
    forestValue117_189_0 = ((com.moon.setting.BooleanSetting)(this.w)).getValue();
    }
    forestValue117_191_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(forestValue117_189_0)))).booleanValue()) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue117_198_0 = forestValue117_191_0;
        break forest_join_198;
    }
    if (!((forestValue117_191_0 != 0))) {
        break forest_join_203;
    }
    forestValue117_198_0 = recovery.source.CarrierOps.dcmpl(((double)(this.B)), ((double)(0x0.0p0d)));
    }
    if (!((life4_5 == 0))) {
        forestValue117_202_0 = forestValue117_198_0;
        break forest_join_202;
    }
    if (!((forestValue117_198_0 > 0))) {
        break forest_join_203;
    }
    forestValue117_202_0 = 1;
    }
    forestValue117_204_0 = forestValue117_202_0;
    break forest_join_204;
    }
    forestValue117_204_0 = 0;
    }
    life7_223 = forestValue117_204_0;
    this.A = ((double)(((com.moon.module.impl.AutoClicker)(this)).a(((double)(this.F)), ((boolean)__sourceIntrinsic_integerToBoolean((life7_223))), ((boolean)(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())))));
    this.C = ((int)(0));
    if (!((life4_5 != 0))) {
        continue forest_cycle_133;
    }
    break forest_cycle_133;
    }
    }
    forestValue117_224_0 = ((org.lwjgl.input.Mouse.isButtonDown(((int)(life5_136)))) ? 1 : 0);
    }
    if (!((life4_5 == 0))) {
        forestValue117_234_0 = forestValue117_224_0;
        break forest_join_234;
    }
    if (!((forestValue117_224_0 != 0))) {
        break forest_join_261;
    }
    spill117_7 = this;
    if (!((life4_5 == 0))) {
        forestValue117_262_0 = spill117_7;
        break forest_join_262;
    }
    forestValue117_234_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.AutoClicker)(spill117_7)).t)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forestValue117_234_0 != 0))) {
        break forest_join_261;
    }
    spill117_8 = this;
    if (!((life4_5 == 0))) {
        forestValue117_259_0 = spill117_8;
        break forest_join_259;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(((double) (((com.moon.module.impl.AutoClicker)(spill117_8)).C + 1)))), ((double)(this.A))) < 0))) {
        break forest_join_258;
    }
    spill117_9 = this;
    if (!((life4_5 == 0))) {
        forestValue117_259_0 = spill117_9;
        break forest_join_259;
    }
    if (!((((com.moon.module.impl.AutoClicker)(spill117_9)).C <= 2))) {
        break forest_join_258;
    }
    ((com.moon.module.impl.AutoClicker)(this)).c(((boolean)(org.lwjgl.input.Mouse.isButtonDown(((int)(1))))));
    if (!((life4_5 != 0))) {
        break forest_join_261;
    }
    }
    forestValue117_259_0 = this;
    }
    ((com.moon.module.impl.AutoClicker)(forestValue117_259_0)).c(((boolean)(false)));
    }
    forestValue117_262_0 = this;
    }
    com.moon.module.impl.AutoClicker __stackOp117_115_0 = forestValue117_262_0;
    ((com.moon.module.impl.AutoClicker)(__stackOp117_115_0)).C = ((int)((((com.moon.module.impl.AutoClicker)(__stackOp117_115_0)).C + 1)));
    return;
}


private double a(double p0, boolean p1, boolean p2) {
double lexicalValue221_22_0;
    com.moon.module.impl.AutoClicker lexicalValue221_103_0;
    net.minecraft.entity.Entity lexicalValue221_109_0;
    int lexicalValue221_115_0;
    int lexicalValue221_115_1;
    int lexicalValue221_128_0;
    int lexicalValue221_128_1;
    int lexicalValue221_130_0;
    int lexicalValue221_132_0;
    int lexicalValue221_152_0;
    double lexicalValue221_154_0;
    double lexicalValue221_156_0;
    int lexicalValue221_193_0;
    int lexicalValue221_195_0;
    double lexicalValue221_205_0;
    com.moon.module.impl.AutoClicker lexicalValue221_217_0;
    net.minecraft.entity.Entity lexicalValue221_223_0;
    double lexicalValue221_244_0;
    double lexicalValue221_244_1;
    double lexicalValue221_247_0;
    boolean spill221_0;
    int spill221_1;
    int spill221_2;
    int spill221_3;
    com.moon.module.impl.AutoClicker spill221_4;
    net.minecraft.entity.Entity spill221_5;
    int spill221_6;
    int spill221_7;
    double spill221_8;
    double spill221_9;
    double spill221_10;
    int spill221_11;
    com.moon.module.impl.AutoClicker spill221_12;
    net.minecraft.entity.Entity spill221_13;
    double spill221_14;
    double spill221_15;
    long life5_3;
    double life8_9;
    int life7_10;
    double life10_16;
    double life12_28;
    double life14_32;
    double life16_40;
    double life18_53;
    int life20_58;
    int life21_60;
    int life20_164;
    double life21_194;
    double life23_203;
    int life25_248;
    double life26_260;
    double life28_262;
    lexical_join_247: {
    lexical_join_246: {
    lexical_join_244: {
    lexical_join_239: {
    lexical_join_223: {
    lexical_join_217: {
    lexical_join_205: {
    lexical_join_202: {
    lexical_join_195: {
    lexical_join_194: {
    lexical_join_193: {
    lexical_join_156: {
    lexical_join_155: {
    lexical_join_154: {
    lexical_join_152: {
    lexical_join_139: {
    lexical_join_132: {
    lexical_join_131: {
    lexical_join_130: {
    lexical_join_128: {
    lexical_join_115: {
    lexical_join_109: {
    lexical_join_103: {
    lexical_join_86: {
    lexical_join_83: {
    lexical_join_22: {
    lexical_join_21: {
    life5_3 = (com.moon.module.impl.AutoClicker.I ^ 79272612849634L);
    spill221_0 = com.moon.bg.b();
    life8_9 = ((com.moon.module.impl.AutoClicker)(this)).a(((double)(0x1.8p2d)), ((double)(0x1.0p1d)));
    life7_10 = ((spill221_0) ? 1 : 0);
    life10_16 = java.lang.Math.max(((double)(0x1.0p0d)), ((double)((p0 - life8_9))));
    if (!(p1)) {
        break lexical_join_21;
    }
    lexicalValue221_22_0 = 0x1.6p4d;
    break lexical_join_22;
    }
    lexicalValue221_22_0 = 0x1.4p4d;
    }
    life12_28 = java.lang.Math.min(((double)(lexicalValue221_22_0)), ((double)((p0 + 0x1.8p2d))));
    life14_32 = com.moon.nI.a(((double)(life10_16)), ((double)(life12_28)));
    if (!(p2)) {
        break lexical_join_86;
    }
    life16_40 = ((life10_16 + life12_28) / 0x1.0p1d);
    spill221_1 = 31068;
    life18_53 = (java.lang.Math.min(((double)((p0 - 0x1.0p0d))), ((double)(java.lang.Math.min(((double)((0x1.6p4d - p0))), ((double)(life16_40)))))) * 0x1.3333333333333p-1d);
    life20_58 = __sourceIntrinsic_907485cceaa2_invokedynamic221_9(spill221_1, (6441134177363078639L ^ life5_3));
    life21_60 = 0;
    lexical_cycle_59: while (true) {
    lexical_join_81: {
    lexical_join_77: {
    if (!((recovery.source.CarrierOps.dcmpg(((double)(java.lang.Math.abs(((double)((life14_32 - this.z)))))), ((double)(life18_53))) <= 0))) {
        break lexical_join_83;
    }
    life21_60 += 1;
    if (!((life7_10 == 0))) {
        break lexical_join_81;
    }
    spill221_2 = life21_60;
    spill221_3 = life20_58;
    if (!((life7_10 == 0))) {
        lexicalValue221_115_0 = spill221_2;
        lexicalValue221_115_1 = spill221_3;
        break lexical_join_115;
    }
    if (!((spill221_2 >= spill221_3))) {
        break lexical_join_77;
    }
    if (!((life7_10 != 0))) {
        break lexical_join_83;
    }
    }
    life14_32 = com.moon.nI.a(((double)(life10_16)), ((double)(life12_28)));
    }
    if (!((life7_10 != 0))) { continue lexical_cycle_59; }
    break lexical_cycle_59;
    }
    }
    this.z = ((double)(life14_32));
    }
    life16_40 = (0x1.4p4d / life14_32);
    life18_53 = com.moon.nI.a(((double)(0x1.3333333333333p-3d)), ((double)(0x1.8p-1d)));
    spill221_4 = this;
    if (!((life7_10 == 0))) {
        lexicalValue221_103_0 = spill221_4;
        break lexical_join_103;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.AutoClicker)(spill221_4)).u)).getValue())))).booleanValue())) {
        break lexical_join_131;
    }
    lexicalValue221_103_0 = this;
    }
    spill221_5 = ((com.moon.module.impl.AutoClicker)(lexicalValue221_103_0)).H;
    if (!((life7_10 == 0))) {
        lexicalValue221_109_0 = spill221_5;
        break lexical_join_109;
    }
    if (!((spill221_5 != null))) {
        break lexical_join_131;
    }
    lexicalValue221_109_0 = this.H;
    }
    lexicalValue221_115_0 = ((net.minecraft.entity.Entity)(lexicalValue221_109_0)).U;
    lexicalValue221_115_1 = __sourceIntrinsic_907485cceaa2_invokedynamic221_23(19341, (6665158428155453247L ^ life5_3));
    }
    if (!((life7_10 == 0))) {
        lexicalValue221_128_0 = lexicalValue221_115_0;
        lexicalValue221_128_1 = lexicalValue221_115_1;
        break lexical_join_128;
    }
    if (!((lexicalValue221_115_0 >= lexicalValue221_115_1))) {
        break lexical_join_131;
    }
    spill221_6 = ((net.minecraft.entity.Entity)(this.H)).U;
    if (!((life7_10 == 0))) {
        lexicalValue221_130_0 = spill221_6;
        break lexical_join_130;
    }
    lexicalValue221_128_0 = spill221_6;
    lexicalValue221_128_1 = __sourceIntrinsic_907485cceaa2_invokedynamic221_26(15578, (6156264125912541294L ^ life5_3));
    }
    if (!((lexicalValue221_128_0 <= lexicalValue221_128_1))) {
        break lexical_join_131;
    }
    lexicalValue221_130_0 = 1;
    }
    lexicalValue221_132_0 = lexicalValue221_130_0;
    break lexical_join_132;
    }
    lexicalValue221_132_0 = 0;
    }
    life20_164 = lexicalValue221_132_0;
    spill221_7 = life20_164;
    if (!((life7_10 == 0))) {
        lexicalValue221_152_0 = spill221_7;
        break lexical_join_152;
    }
    if (!((spill221_7 != 0))) {
        break lexical_join_139;
    }
    life18_53 = 0x1.0p0d;
    }
    life16_40 = ((com.moon.fZ)(this.y)).a(((double)(life16_40)), ((double)(life18_53)));
    spill221_8 = ((com.moon.fZ)(this.y)).c();
    if (!((life7_10 == 0))) {
        lexicalValue221_154_0 = spill221_8;
        break lexical_join_154;
    }
    lexicalValue221_152_0 = recovery.source.CarrierOps.dcmpl(((double)(spill221_8)), ((double)(0x1.9p5d)));
    }
    if (!((lexicalValue221_152_0 >= 0))) {
        break lexical_join_155;
    }
    lexicalValue221_154_0 = 0x1.4p5d;
    }
    lexicalValue221_156_0 = lexicalValue221_154_0;
    break lexical_join_156;
    }
    lexicalValue221_156_0 = 0x1.ep3d;
    }
    life21_194 = lexicalValue221_156_0;
    life23_203 = ((double) com.moon.nI.a(((int)(0)), ((int)(__sourceIntrinsic_907485cceaa2_invokedynamic221_32(5966, (3524113459625673727L ^ life5_3))))));
    spill221_9 = life23_203;
    if (!((life7_10 == 0))) {
        lexicalValue221_247_0 = spill221_9;
        break lexical_join_247;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill221_9)), ((double)(life21_194))) <= 0))) {
        break lexical_join_246;
    }
    spill221_10 = ((com.moon.fZ)(this.y)).c();
    if (!((life7_10 == 0))) {
        lexicalValue221_247_0 = spill221_10;
        break lexical_join_247;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill221_10)), ((double)(0x1.8p2d))) >= 0))) {
        break lexical_join_246;
    }
    spill221_11 = recovery.source.CarrierOps.dcmpg(((double)(life23_203)), ((double)((life21_194 * (0x1.999999999999ap-5d + (p0 * 0x1.47ae147ae147bp-7d))))));
    if (!((life7_10 == 0))) {
        lexicalValue221_193_0 = spill221_11;
        break lexical_join_193;
    }
    if (!((spill221_11 <= 0))) {
        break lexical_join_194;
    }
    lexicalValue221_193_0 = 1;
    }
    lexicalValue221_195_0 = lexicalValue221_193_0;
    break lexical_join_195;
    }
    lexicalValue221_195_0 = 0;
    }
    life25_248 = lexicalValue221_195_0;
    if (!((life25_248 != 0))) {
        break lexical_join_202;
    }
    lexicalValue221_205_0 = com.moon.nI.a(((double)(0x1.cp1d)), ((double)(0x1.6p3d)));
    break lexical_join_205;
    }
    lexicalValue221_205_0 = com.moon.nI.a(((double)(0x1.8p0d)), ((double)(0x1.b333333333333p1d)));
    }
    life26_260 = lexicalValue221_205_0;
    life28_262 = 0x1.8p3d;
    spill221_12 = this;
    if (!((life7_10 == 0))) {
        lexicalValue221_217_0 = spill221_12;
        break lexical_join_217;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.AutoClicker)(spill221_12)).u)).getValue())))).booleanValue())) {
        break lexical_join_239;
    }
    lexicalValue221_217_0 = this;
    }
    spill221_13 = ((com.moon.module.impl.AutoClicker)(lexicalValue221_217_0)).H;
    if (!((life7_10 == 0))) {
        lexicalValue221_223_0 = spill221_13;
        break lexical_join_223;
    }
    if (!((spill221_13 != null))) {
        break lexical_join_239;
    }
    lexicalValue221_223_0 = this.H;
    }
    spill221_14 = ((double) ((net.minecraft.entity.Entity)(lexicalValue221_223_0)).U);
    spill221_15 = life28_262;
    if (!((life7_10 == 0))) {
        lexicalValue221_244_0 = spill221_14;
        lexicalValue221_244_1 = spill221_15;
        break lexical_join_244;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(spill221_14)), ((double)(spill221_15))) >= 0))) {
        break lexical_join_239;
    }
    life26_260 = java.lang.Math.min(((double)((((double) ((net.minecraft.entity.Entity)(this.H)).U) - life28_262))), ((double)(life26_260)));
    }
    lexicalValue221_244_0 = life16_40;
    lexicalValue221_244_1 = ((com.moon.fZ)(this.y)).a(((double)(life26_260)));
    }
    life16_40 = (lexicalValue221_244_0 + lexicalValue221_244_1);
    }
    lexicalValue221_247_0 = life16_40;
    }
    return lexicalValue221_247_0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_55(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_770b1e009cd0fd50_originalDynamicSite1218_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_907485cceaa2_invokedynamic221_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_907485cceaa2_invokedynamic221_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_907485cceaa2_invokedynamic221_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_907485cceaa2_invokedynamic221_32(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be06bc302d53_invokedynamic117_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_be06bc302d53_invokedynamic117_15(double a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic117_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic117_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_be06bc302d53_invokedynamic117_57(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2349_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2352_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
