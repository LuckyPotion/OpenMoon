package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Nametags extends com.moon.module.Module {

private com.moon.setting.MultiSelectSetting<com.moon.b5> s;

private com.moon.setting.BooleanSetting t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.SettingGroup v;

private com.moon.setting.BooleanSetting w;

private com.moon.setting.BooleanSetting x;

private com.moon.setting.SettingGroup y;

private com.moon.module.impl.Teams z;

private com.moon.hW A;

private com.moon.hW B;

private com.moon.gX C;

private boolean D;

private static long E;

private static java.lang.String[] F;

private static java.lang.String[] G;

private static java.util.Map H;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

public Nametags(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_ab95951395e4860e(com.moon.module.impl.Nametags receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Nametags.E ^ 43332172990001L);

    com.moon.module.impl.Nametags.__sourceConstructorInit_ab95951395e4860e_0(((com.moon.module.impl.Nametags)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Nametags)(receiver)).s = ((com.moon.setting.MultiSelectSetting)(((com.moon.mi)(((com.moon.mi)(com.moon.setting.MultiSelectSetting.builder(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_2(29731, (1909927444882762319L ^ local5)))), ((java.lang.Class)(com.moon.b5.class))))).a(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_5(6187, (7567700210817517122L ^ local5)))), ((java.lang.Enum[])(new com.moon.b5[] {com.moon.b5.PLAYER}))))).a()));

    ((com.moon.module.impl.Nametags)(receiver)).t = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_10(24690, (6474139624296857100L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_12(18780, (3865990151241176894L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Nametags)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_16(18964, (3617035688274728051L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_18(14412, (5381212134442034740L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Nametags)(receiver)).v = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(com.moon.setting.SettingGroup.a__me())).a(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_23(238, (7876362733689888394L ^ local5)))), ((com.moon.setting.Setting[])(new com.moon.setting.Setting[] {((com.moon.module.impl.Nametags)(receiver)).t, ((com.moon.module.impl.Nametags)(receiver)).u}))))).a()));

    ((com.moon.module.impl.Nametags)(receiver)).w = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_29(10472, (3139934074786084501L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_31(15886, (2222837640567283821L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Nametags)(receiver)).x = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_35(23481, (8108581536775898579L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_37(8236, (4468740634274790992L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.Nametags)(receiver)).y = ((com.moon.setting.SettingGroup)(((com.moon.me)(((com.moon.me)(com.moon.setting.SettingGroup.a__me())).a(((java.lang.String)(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_42(16448, (8798988918406094369L ^ local5)))), ((com.moon.setting.Setting[])(new com.moon.setting.Setting[] {((com.moon.module.impl.Nametags)(receiver)).w, ((com.moon.module.impl.Nametags)(receiver)).x}))))).a()));

    ((com.moon.module.impl.Nametags)(receiver)).C = ((com.moon.gX)(new com.moon.gX()));

    ((com.moon.module.impl.Nametags)(receiver)).D = ((boolean)(true));

    ((java.lang.Thread)(new java.lang.Thread(__sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_50(receiver), __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_51(23922, (2589494852221666073L ^ local5))))).start();

    return;

}



static {
E = ((long)(((moom._a)(moom._c.a(((long)(-8358019253531068913L)), ((long)(435876493969554089L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(26165793089095L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Nametags.E ^ 107952309945420L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill280_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill280_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill280_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill280_14 = new byte[8];
    (__sourceSpill280_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill280_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation280_16 = __sourceSpill280_14;
    ((javax.crypto.Cipher)(__sourceSpill280_11)).init(((int)(__sourceSpill280_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill280_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation280_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[22];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ÍuÜóêêcÜ EÚ/\tãL\020g#,¦\003÷-ÿ¸íÙËïP\177\020ÒhfFÏlÚVÚWN^³\003É\020{[\020Í \016&¿dB}RÂ\fI\020/I:'\002kKøó\026\022ý!\020]W¬å÷=\007\013C\017®B\n«\023Ð(Þìð:ò>V\022Rò!keùÂ\\M\f\0249\"j­ú0ïJ×Am£:Õ·Ø\020çÕ£\033ÆVé¾²\n*>qü\030\034ù\"Wâ¬Ë°±Õïªjc·z¾\025¾\003å(¢\023ø)¨Â !2Yþ=ö¥Xy¡ã¿Ø6¥\nWÞx}øRIÄ (ä?\002fþ\033\003\030ÕÊ)Âþ\013]µé~b/æ\025CÞ [¬ýy ¿2fr\032CqR[\037\001£è\036^#Xµ\n»Ð¹r}[ã(°JÆ+Y|\031.T²\025*Ë\"q'õð¼z\t^8uÌQD\020ú³çÿ×,X\020jJ¶²»=¿Íé\025\037\023\013(\036Éð\026PõÈ\021\027«´Îr\npÈø,âåÐªÛ.\tH\030¢F8ÿCØ\030­{ÄÐ*Ô=÷ÛãJÇ\007\027XÑ#ZP¢(õWl,1ø \\«=3IJ\020]K\1775_\177p\006\001ED\030×mðÔÅ­ÂIµ(Ä $Ø\007­/Ä\013úHä39ê3Ü%^§AÀ A<³\027TFÞQ\002Í@\020\007=Mat\bÌ°¦8\\ñÆå6\020_{ß¤d±\031û©ë®?óNÚ"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill280_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill280_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill280_29)).doFinal(((byte[])(__sourceSpill280_28)));
        java.lang.String __sourceSpill280_34 = ((java.lang.String)(com.moon.module.impl.Nametags.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill280_35 = local20_life19;
        int __sourceSpill280_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill280_35)[__sourceSpill280_36] = __sourceSpill280_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "È\037£Ëâ7ÍdÂ¶V­äð\030\tõv³s¢õ\021Øihk,³\001¯\005\003X\003EK"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill280_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill280_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill280_42)).doFinal(((byte[])(__sourceSpill280_41)));
        java.lang.String __sourceSpill280_47 = ((java.lang.String)(com.moon.module.impl.Nametags.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill280_48 = local20_life19;
        int __sourceSpill280_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill280_48)[__sourceSpill280_49] = __sourceSpill280_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    F = ((java.lang.String[])(local20_life19));
    G = ((java.lang.String[])(new java.lang.String[22]));
    K = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill280_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill280_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill280_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill280_60 = new byte[8];
    (__sourceSpill280_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill280_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation280_62 = __sourceSpill280_60;
    ((javax.crypto.Cipher)(__sourceSpill280_57)).init(((int)(__sourceSpill280_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill280_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation280_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[5];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ª|àQX\013nf¯å±Ë1¹È\037ÔÌÝì\003\005.ä"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill280_71 = local4_life67;
        int __sourceSpill280_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill280_71)).substring(((int)(__sourceSpill280_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill280_76 = local6_life65;
        int __sourceSpill280_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill280_79 = new byte[8];
        (__sourceSpill280_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill280_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill280_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill280_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill280_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill280_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill280_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill280_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill280_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill280_80)).doFinal(((byte[])(__sourceSpill280_79)));
        (__sourceSpill280_76)[__sourceSpill280_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "¢\030Gª$§±ýd?\n¦ÉRW"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill280_84 = local4_life67;
        int __sourceSpill280_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill280_84)).substring(((int)(__sourceSpill280_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill280_89 = local6_life65;
        int __sourceSpill280_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill280_92 = new byte[8];
        (__sourceSpill280_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill280_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill280_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill280_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill280_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill280_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill280_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill280_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill280_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill280_93)).doFinal(((byte[])(__sourceSpill280_92)));
        (__sourceSpill280_89)[__sourceSpill280_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    I = ((long[])(local6_life65));
    J = ((java.lang.Integer[])(new java.lang.Integer[5]));
}

private static native <E extends Throwable> void __sourceConstructorInit_ab95951395e4860e_0(com.moon.module.impl.Nametags a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

public int b() {
return java.lang.Math.max(((int)((net.minecraft.client.Minecraft.b() / 5))), ((int)(((org.lwjgl.opengl.DisplayMode)(org.lwjgl.opengl.Display.getDesktopDisplayMode())).getFrequency())));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 24916);
    if (((com.moon.module.impl.Nametags.G)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Nametags.H)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Nametags.H)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/l0", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Nametags.F)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Nametags.G)[life5_8] = com.moon.module.impl.Nametags.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Nametags.G)[life5_8];
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
        byte[] spill1154_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1154_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1154_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1154_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1154_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1154_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Nametags.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2566_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void f() {
float forestValue100033_22_0;
    com.moon.module.impl.Nametags forestValue100033_38_0;
    com.moon.hW forestValue100033_50_0;
    com.moon.module.impl.Nametags forestValue100033_66_0;
    int forestValue100033_80_0;
    int forestValue100033_96_0;
    org.lwjgl.util.vector.Vector4f forestValue100033_106_0;
    com.moon.module.impl.Teams forestValue100033_144_0;
    int forestValue100033_150_0;
    int forestValue100033_152_0;
    com.moon.eU forestValue100033_158_0;
    java.lang.String forestValue100033_175_0;
    java.lang.String forestValue100033_182_0;
    int forestValue100033_216_0;
    int forestValue100033_223_0;
    net.minecraft.entity.Entity forestValue100033_225_0;
    int forestValue100033_238_0;
    java.lang.String forestValue100033_252_0;
    int forestValue100033_266_0;
    java.lang.String forestValue100033_276_0;
    float forestValue100033_331_0;
    float forestValue100033_331_1;
    float forestValue100033_331_2;
    float forestValue100033_331_3;
    float forestValue100033_331_4;
    float forestValue100033_332_0;
    float forestValue100033_332_1;
    float forestValue100033_332_2;
    float forestValue100033_332_3;
    float forestValue100033_333_0;
    float forestValue100033_333_1;
    float forestValue100033_333_2;
    float forestValue100033_333_3;
    float forestValue100033_333_4;
    int forestValue100033_384_0;
    int forestValue100033_392_0;
    float forestValue100033_458_0;
    float forestValue100033_458_1;
    float forestValue100033_458_2;
    float forestValue100033_458_3;
    float forestValue100033_458_4;
    float forestValue100033_459_0;
    float forestValue100033_459_1;
    float forestValue100033_459_2;
    float forestValue100033_459_3;
    float forestValue100033_460_0;
    float forestValue100033_460_1;
    float forestValue100033_460_2;
    float forestValue100033_460_3;
    float forestValue100033_460_4;
    com.moon.module.impl.Nametags forestValue100033_509_0;
    int forestValue100033_517_0;
    int forestValue100033_525_0;
    float forestValue100033_578_0;
    float forestValue100033_578_1;
    float forestValue100033_578_2;
    float forestValue100033_578_3;
    float forestValue100033_578_4;
    float forestValue100033_579_0;
    float forestValue100033_579_1;
    float forestValue100033_579_2;
    float forestValue100033_579_3;
    float forestValue100033_580_0;
    float forestValue100033_580_1;
    float forestValue100033_580_2;
    float forestValue100033_580_3;
    float forestValue100033_580_4;
    com.moon.module.impl.Nametags forestValue100033_627_0;
    net.minecraft.entity.Entity[] spill100033_0;
    com.moon.module.impl.Nametags spill100033_1;
    com.moon.hW spill100033_2;
    com.moon.module.impl.Nametags spill100033_3;
    boolean spill100033_4;
    org.lwjgl.util.vector.Vector4f spill100033_5;
    int spill100033_6;
    com.moon.module.impl.Teams spill100033_7;
    boolean spill100033_8;
    com.moon.eU spill100033_9;
    java.lang.String spill100033_10;
    int spill100033_11;
    boolean spill100033_12;
    net.minecraft.entity.Entity spill100033_13;
    boolean spill100033_14;
    boolean spill100033_15;
    float spill100033_16;
    float spill100033_17;
    float spill100033_18;
    float spill100033_19;
    float spill100033_20;
    float spill100033_21;
    boolean spill100033_22;
    float spill100033_23;
    float spill100033_24;
    float spill100033_25;
    float spill100033_26;
    float spill100033_27;
    float spill100033_28;
    com.moon.module.impl.Nametags spill100033_29;
    float spill100033_30;
    float spill100033_31;
    float spill100033_32;
    float spill100033_33;
    float spill100033_34;
    float spill100033_35;
    com.moon.module.impl.Nametags spill100033_36;
    long life1_3;
    com.moon.jm life4_8;
    float life5_11;
    net.minecraft.entity.Entity[] life3_12;
    float life6_22;
    float life7_24;
    java.util.Iterator life8_83;
    net.minecraft.entity.Entity life9_90;
    org.lwjgl.util.vector.Vector4f life10_93;
    float life11_116;
    float life12_119;
    float life13_124;
    java.lang.String life14_127;
    net.minecraft.entity.player.EntityPlayer life15_136;
    com.moon.eU life16_141;
    com.moon.mk life17_146;
    int life18_165;
    net.minecraft.entity.EntityLivingBase life15_247;
    java.lang.String life16_275;
    java.lang.String life17_301;
    float life15_311;
    float life16_316;
    com.moon.i3 life17_366;
    java.lang.String life18_439;
    float life19_444;
    com.moon.i3 life20_500;
    java.lang.String life18_571;
    float life19_576;
    com.moon.i3 life20_626;
    forest_join_632: {
    forest_join_66: {
    forest_join_55: {
    forest_join_50: {
    forest_join_46: {
    forest_join_38: {
    forest_join_37: {
    forest_join_22: {
    forest_join_21: {
    life1_3 = (com.moon.module.impl.Nametags.E ^ 128360139845123L);
    life4_8 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    spill100033_0 = com.moon.bY.b();
    life5_11 = 0x1.8p2f;
    life3_12 = spill100033_0;
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())) {
        break forest_join_21;
    }
    forestValue100033_22_0 = 0x1.4p1f;
    break forest_join_22;
    }
    forestValue100033_22_0 = 0x1.0p1f;
    }
    life6_22 = forestValue100033_22_0;
    life7_24 = 0x1.0p1f;
    spill100033_1 = this;
    if (!((life3_12 == null))) {
        forestValue100033_38_0 = spill100033_1;
        break forest_join_38;
    }
    if (!((((com.moon.module.impl.Nametags)(spill100033_1)).z == null))) {
        break forest_join_37;
    }
    this.z = ((com.moon.module.impl.Teams)(((com.moon.module.impl.Teams)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Teams.class)))))));
    }
    forestValue100033_38_0 = this;
    }
    spill100033_2 = ((com.moon.module.impl.Nametags)(forestValue100033_38_0)).A;
    if (!((life3_12 == null))) {
        forestValue100033_50_0 = spill100033_2;
        break forest_join_50;
    }
    if (!((spill100033_2 != null))) {
        break forest_join_46;
    }
    ((com.moon.hY)(((com.moon.hW)(this.A)).a__hY())).g();
    }
    spill100033_3 = this;
    if (!((life3_12 == null))) {
        forestValue100033_66_0 = spill100033_3;
        break forest_join_66;
    }
    forestValue100033_50_0 = ((com.moon.module.impl.Nametags)(spill100033_3)).B;
    }
    if (!((forestValue100033_50_0 != null))) {
        break forest_join_55;
    }
    ((com.moon.hY)(((com.moon.hW)(this.B)).a__hY())).g();
    }
    this.B = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life4_8))))).c())).a__hX())).a()));
    forestValue100033_66_0 = this;
    }
    ((com.moon.module.impl.Nametags)(forestValue100033_66_0)).A = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).c())).a__hX())).a()));
    life8_83 = ((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Nametags.d)).I)).c)).iterator();
    forest_cycle_78: while (true) {
    forest_join_630: {
    forest_join_627: {
    forest_join_599: {
    forest_join_580: {
    forest_join_579: {
    forest_join_578: {
    forest_join_525: {
    forest_join_517: {
    forest_join_512: {
    forest_join_509: {
    forest_join_479: {
    forest_join_460: {
    forest_join_459: {
    forest_join_458: {
    forest_join_392: {
    forest_join_384: {
    forest_join_352: {
    forest_join_333: {
    forest_join_332: {
    forest_join_331: {
    forest_join_282: {
    forest_join_276: {
    forest_join_275: {
    forest_join_266: {
    forest_join_252: {
    forest_join_251: {
    forest_join_238: {
    forest_join_225: {
    forest_join_223: {
    forest_join_216: {
    forest_join_211: {
    forest_join_193: {
    forest_join_183: {
    forest_join_182: {
    forest_join_175: {
    forest_join_173: {
    forest_join_158: {
    forest_join_152: {
    forest_join_151: {
    forest_join_150: {
    forest_join_144: {
    forest_join_106: {
    forest_join_105: {
    forestValue100033_80_0 = ((((java.util.Iterator)(life8_83)).hasNext()) ? 1 : 0);
    forest_cycle_80: while (true) {
    forest_join_96: {
    if (!((forestValue100033_80_0 != 0))) {
        break forest_join_632;
    }
    life9_90 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life8_83)).next()));
    life10_93 = ((net.minecraft.entity.Entity)(life9_90)).a__Vector4f();
    spill100033_4 = ((com.moon.module.impl.Nametags)(this)).a(((net.minecraft.entity.Entity)(life9_90)));
    if (!((life3_12 == null))) {
        forestValue100033_96_0 = ((spill100033_4) ? 1 : 0);
        break forest_join_96;
    }
    if (!(spill100033_4)) {
        continue forest_cycle_78;
    }
    forestValue100033_96_0 = ((com.moon.nG.a(((net.minecraft.entity.Entity)(life9_90)))) ? 1 : 0);
    }
    if (!((life3_12 == null))) {
        forestValue100033_80_0 = forestValue100033_96_0;
        continue forest_cycle_80;
    }
    break forest_cycle_80;
    }
    if (!((forestValue100033_96_0 != 0))) {
        continue forest_cycle_78;
    }
    spill100033_5 = life10_93;
    if (!((life3_12 == null))) {
        forestValue100033_106_0 = spill100033_5;
        break forest_join_106;
    }
    if (!((spill100033_5 == null))) {
        break forest_join_105;
    }
    if (!((life3_12 != null))) {
        continue forest_cycle_78;
    }
    }
    forestValue100033_106_0 = life10_93;
    }
    life11_116 = ((org.lwjgl.util.vector.Vector4f)(forestValue100033_106_0)).x;
    life12_119 = ((org.lwjgl.util.vector.Vector4f)(life10_93)).y;
    life13_124 = (((org.lwjgl.util.vector.Vector4f)(life10_93)).z - life11_116);
    life14_127 = ((net.minecraft.entity.Entity)(life9_90)).a__String();
    spill100033_6 = ((life9_90 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    if (!((life3_12 == null))) {
        forestValue100033_216_0 = spill100033_6;
        break forest_join_216;
    }
    if (!((spill100033_6 != 0))) {
        break forest_join_211;
    }
    life15_136 = ((net.minecraft.entity.player.EntityPlayer)(life9_90));
    life16_141 = ((com.moon.eV)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__eV())).a(((net.minecraft.entity.player.EntityPlayer)(life15_136)));
    life17_146 = ((com.moon.ml)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__ml())).a(((net.minecraft.entity.player.EntityPlayer)(life15_136)));
    spill100033_7 = this.z;
    if (!((life3_12 == null))) {
        forestValue100033_144_0 = spill100033_7;
        break forest_join_144;
    }
    if (!((spill100033_7 != null))) {
        break forest_join_151;
    }
    forestValue100033_144_0 = this.z;
    }
    spill100033_8 = ((com.moon.module.impl.Teams)(forestValue100033_144_0)).a__Boolean(((net.minecraft.entity.player.EntityPlayer)(life15_136)));
    if (!((life3_12 == null))) {
        forestValue100033_150_0 = ((spill100033_8) ? 1 : 0);
        break forest_join_150;
    }
    if (!(spill100033_8)) {
        break forest_join_151;
    }
    forestValue100033_150_0 = 1;
    }
    forestValue100033_152_0 = forestValue100033_150_0;
    break forest_join_152;
    }
    forestValue100033_152_0 = 0;
    }
    life18_165 = forestValue100033_152_0;
    spill100033_9 = life16_141;
    if (!((life3_12 == null))) {
        forestValue100033_158_0 = spill100033_9;
        break forest_join_158;
    }
    if (!((spill100033_9 != null))) {
        break forest_join_183;
    }
    forestValue100033_158_0 = life16_141;
    }
    spill100033_10 = ((com.moon.eU)(forestValue100033_158_0)).b();
    if (!((life3_12 == null))) {
        forestValue100033_175_0 = spill100033_10;
        break forest_join_175;
    }
    if (!(((java.lang.String)(spill100033_10)).isEmpty())) {
        break forest_join_173;
    }
    java.lang.String __stackOp100033_73_0 = ((com.moon.eU)(life16_141)).a();
    java.lang.String __stackOp100033_73_1 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_72(15106, (5296352599919218000L ^ life1_3));
    forestValue100033_182_0 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_74(__stackOp100033_73_1, __stackOp100033_73_0);
    break forest_join_182;
    }
    forestValue100033_175_0 = ((com.moon.eU)(life16_141)).b();
    }
    java.lang.String __stackOp100033_77_0 = forestValue100033_175_0;
    java.lang.String __stackOp100033_77_1 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_76(2880, (2583667922797427997L ^ life1_3));
    forestValue100033_182_0 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_78(__stackOp100033_77_1, __stackOp100033_77_0);
    }
    life14_127 = forestValue100033_182_0;
    }
    if (!((life17_146 != null))) {
        break forest_join_193;
    }
    life14_127 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_80(life14_127, __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_79(15665, (661774318499613542L ^ life1_3)));
    }
    spill100033_11 = life18_165;
    if (!((life3_12 == null))) {
        forestValue100033_216_0 = spill100033_11;
        break forest_join_216;
    }
    if (!((spill100033_11 != 0))) {
        break forest_join_211;
    }
    spill100033_12 = ((com.moon.module.impl.Teams)(this.z)).isEnabled();
    if (!((life3_12 == null))) {
        forestValue100033_216_0 = ((spill100033_12) ? 1 : 0);
        break forest_join_216;
    }
    if (!(spill100033_12)) {
        break forest_join_211;
    }
    life14_127 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_85(life14_127, __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_84(6828, (1601971759472897272L ^ life1_3)));
    }
    forestValue100033_216_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_12 == null))) {
        forestValue100033_223_0 = forestValue100033_216_0;
        break forest_join_223;
    }
    if (!((forestValue100033_216_0 == 0))) {
        break forest_join_282;
    }
    spill100033_13 = life9_90;
    if (!((life3_12 == null))) {
        forestValue100033_225_0 = spill100033_13;
        break forest_join_225;
    }
    forestValue100033_223_0 = ((spill100033_13 instanceof net.minecraft.entity.EntityLivingBase) ? 1 : 0);
    }
    if (!((forestValue100033_223_0 != 0))) {
        break forest_join_282;
    }
    forestValue100033_225_0 = life9_90;
    }
    life15_247 = ((net.minecraft.entity.EntityLivingBase)(forestValue100033_225_0));
    spill100033_14 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue();
    if (!((life3_12 == null))) {
        forestValue100033_238_0 = ((spill100033_14) ? 1 : 0);
        break forest_join_238;
    }
    if (!(spill100033_14)) {
        break forest_join_251;
    }
    forestValue100033_238_0 = java.lang.Math.round(((float)(((net.minecraft.entity.EntityLivingBase)(life15_247)).b__sourceReturn_bc607678b6())));
    }
    int __stackOp100033_101_0 = forestValue100033_238_0;
    java.lang.String __stackOp100033_101_1 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_100(20727, (2008232363414234812L ^ life1_3));
    forestValue100033_252_0 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_103(__stackOp100033_101_1, __stackOp100033_101_0, __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_102(25571, (1417541447438276025L ^ life1_3)));
    break forest_join_252;
    }
    forestValue100033_252_0 = "";
    }
    life16_275 = forestValue100033_252_0;
    spill100033_15 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue();
    if (!((life3_12 == null))) {
        forestValue100033_266_0 = ((spill100033_15) ? 1 : 0);
        break forest_join_266;
    }
    if (!(spill100033_15)) {
        break forest_join_275;
    }
    forestValue100033_266_0 = java.lang.Math.round(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Nametags.d)).K)).a__Float(((net.minecraft.entity.Entity)(life15_247))))));
    }
    int __stackOp100033_114_0 = forestValue100033_266_0;
    java.lang.String __stackOp100033_114_1 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_113(11484, (3483907984441760387L ^ life1_3));
    forestValue100033_276_0 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_115(__stackOp100033_114_1, __stackOp100033_114_0, "m");
    break forest_join_276;
    }
    forestValue100033_276_0 = "";
    }
    life17_301 = forestValue100033_276_0;
    life14_127 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_116(life16_275, life14_127, life17_301);
    }
    life15_311 = ((com.moon.jm)(life4_8)).a(((java.lang.String)(life14_127)), ((float)(life5_11)));
    life16_316 = ((com.moon.jm)(life4_8)).b(((java.lang.String)(life14_127)), ((float)(life5_11)));
    spill100033_16 = (((life11_116 + (life13_124 / 0x1.0p1f)) - (life15_311 / 0x1.0p1f)) - life6_22);
    spill100033_17 = ((life12_119 - (life16_316 + (life6_22 * 0x1.0p1f))) - 0x1.0p0f);
    spill100033_18 = (life15_311 + (life6_22 * 0x1.0p1f));
    spill100033_19 = life16_316;
    spill100033_20 = (life6_22 * 0x1.0p1f);
    if (!((life3_12 == null))) {
        forestValue100033_331_0 = spill100033_16;
        forestValue100033_331_1 = spill100033_17;
        forestValue100033_331_2 = spill100033_18;
        forestValue100033_331_3 = spill100033_19;
        forestValue100033_331_4 = spill100033_20;
        break forest_join_331;
    }
    spill100033_21 = (spill100033_19 + spill100033_20);
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())) {
        forestValue100033_332_0 = spill100033_16;
        forestValue100033_332_1 = spill100033_17;
        forestValue100033_332_2 = spill100033_18;
        forestValue100033_332_3 = spill100033_21;
        break forest_join_332;
    }
    forestValue100033_331_0 = spill100033_16;
    forestValue100033_331_1 = spill100033_17;
    forestValue100033_331_2 = spill100033_18;
    forestValue100033_331_3 = spill100033_21;
    forestValue100033_331_4 = 0x1.8p1f;
    }
    forestValue100033_333_0 = forestValue100033_331_0;
    forestValue100033_333_1 = forestValue100033_331_1;
    forestValue100033_333_2 = forestValue100033_331_2;
    forestValue100033_333_3 = forestValue100033_331_3;
    forestValue100033_333_4 = forestValue100033_331_4;
    break forest_join_333;
    }
    forestValue100033_333_0 = forestValue100033_332_0;
    forestValue100033_333_1 = forestValue100033_332_1;
    forestValue100033_333_2 = forestValue100033_332_2;
    forestValue100033_333_3 = forestValue100033_332_3;
    forestValue100033_333_4 = 0x0.0p0f;
    }
    life17_366 = com.moon.i3.a(((float)(forestValue100033_333_0)), ((float)(forestValue100033_333_1)), ((float)(forestValue100033_333_2)), ((float)(forestValue100033_333_3)), ((float)(forestValue100033_333_4)), ((int)(__sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_123(13339, (2122302447593939311L ^ life1_3)))));
    spill100033_22 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue();
    if (!((life3_12 == null))) {
        forestValue100033_384_0 = ((spill100033_22) ? 1 : 0);
        break forest_join_384;
    }
    if (!((!spill100033_22))) {
        break forest_join_352;
    }
    ((com.moon.i3)(life17_366)).e(((boolean)(false)));
    }
    ((com.moon.jm)(life4_8)).b(((com.moon.hW)(this.B)), ((java.lang.String)(life14_127)), ((float)(life5_11)), ((float)(((life11_116 + (life13_124 / 0x1.0p1f)) - (life15_311 / 0x1.0p1f)))), ((float)((((life12_119 - life16_316) - life6_22) - 0x1.0p-1f))), ((int)(-1)));
    ((com.moon.hW)(this.A)).a(((com.moon.iX)(life17_366)));
    forestValue100033_384_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.w)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_12 == null))) {
        forestValue100033_392_0 = forestValue100033_384_0;
        break forest_join_392;
    }
    if (!((forestValue100033_384_0 != 0))) {
        break forest_join_630;
    }
    forestValue100033_392_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.t)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_12 == null))) {
        forestValue100033_517_0 = forestValue100033_392_0;
        break forest_join_517;
    }
    if (!((forestValue100033_392_0 != 0))) {
        break forest_join_512;
    }
    int __stackOp100033_149_0 = java.lang.Math.round(((float)(((net.minecraft.entity.EntityLivingBase)(((net.minecraft.entity.EntityLivingBase)(life9_90)))).b__sourceReturn_bc607678b6())));
    java.lang.String __stackOp100033_149_1 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_148(31778, (1856273121421888111L ^ life1_3));
    life18_439 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_150(__stackOp100033_149_1, __stackOp100033_149_0, "♥");
    life19_444 = ((com.moon.jm)(life4_8)).a(((java.lang.String)(life18_439)), ((float)(life5_11)));
    spill100033_23 = (((((life11_116 + (life13_124 / 0x1.0p1f)) - (life15_311 / 0x1.0p1f)) - life19_444) - life7_24) - (life6_22 * 0x1.0p1f));
    spill100033_24 = ((life12_119 - (life16_316 + (life6_22 * 0x1.0p1f))) - 0x1.0p0f);
    spill100033_25 = (life19_444 + (life6_22 * 0x1.0p1f));
    spill100033_26 = life16_316;
    spill100033_27 = (life6_22 * 0x1.0p1f);
    if (!((life3_12 == null))) {
        forestValue100033_458_0 = spill100033_23;
        forestValue100033_458_1 = spill100033_24;
        forestValue100033_458_2 = spill100033_25;
        forestValue100033_458_3 = spill100033_26;
        forestValue100033_458_4 = spill100033_27;
        break forest_join_458;
    }
    spill100033_28 = (spill100033_26 + spill100033_27);
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())) {
        forestValue100033_459_0 = spill100033_23;
        forestValue100033_459_1 = spill100033_24;
        forestValue100033_459_2 = spill100033_25;
        forestValue100033_459_3 = spill100033_28;
        break forest_join_459;
    }
    forestValue100033_458_0 = spill100033_23;
    forestValue100033_458_1 = spill100033_24;
    forestValue100033_458_2 = spill100033_25;
    forestValue100033_458_3 = spill100033_28;
    forestValue100033_458_4 = 0x1.8p1f;
    }
    forestValue100033_460_0 = forestValue100033_458_0;
    forestValue100033_460_1 = forestValue100033_458_1;
    forestValue100033_460_2 = forestValue100033_458_2;
    forestValue100033_460_3 = forestValue100033_458_3;
    forestValue100033_460_4 = forestValue100033_458_4;
    break forest_join_460;
    }
    forestValue100033_460_0 = forestValue100033_459_0;
    forestValue100033_460_1 = forestValue100033_459_1;
    forestValue100033_460_2 = forestValue100033_459_2;
    forestValue100033_460_3 = forestValue100033_459_3;
    forestValue100033_460_4 = 0x0.0p0f;
    }
    life20_500 = com.moon.i3.a(((float)(forestValue100033_460_0)), ((float)(forestValue100033_460_1)), ((float)(forestValue100033_460_2)), ((float)(forestValue100033_460_3)), ((float)(forestValue100033_460_4)), ((int)(__sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_156(22793, (1962449452702502014L ^ life1_3)))));
    spill100033_29 = this;
    if (!((life3_12 == null))) {
        forestValue100033_509_0 = spill100033_29;
        break forest_join_509;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Nametags)(spill100033_29)).x)).getValue())))).booleanValue()))) {
        break forest_join_479;
    }
    ((com.moon.i3)(life20_500)).e(((boolean)(false)));
    }
    ((com.moon.jm)(life4_8)).b(((com.moon.hW)(this.B)), ((java.lang.String)(life18_439)), ((float)(life5_11)), ((float)((((((life11_116 + (life13_124 / 0x1.0p1f)) - (life15_311 / 0x1.0p1f)) - life19_444) - life7_24) - life6_22))), ((float)((((life12_119 - life16_316) - life6_22) - 0x1.0p-1f))), ((int)(-1)));
    forestValue100033_509_0 = this;
    }
    ((com.moon.hW)(((com.moon.module.impl.Nametags)(forestValue100033_509_0)).A)).a(((com.moon.iX)(life20_500)));
    }
    forestValue100033_517_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((life3_12 == null))) {
        forestValue100033_525_0 = forestValue100033_517_0;
        break forest_join_525;
    }
    if (!((forestValue100033_517_0 != 0))) {
        break forest_join_630;
    }
    forestValue100033_525_0 = java.lang.Math.round(((float)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Nametags.d)).K)).a__Float(((net.minecraft.entity.Entity)(life9_90))))));
    }
    int __stackOp100033_177_0 = forestValue100033_525_0;
    java.lang.String __stackOp100033_177_1 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_176(13538, (8991399446935519934L ^ life1_3));
    life18_571 = __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_178(__stackOp100033_177_1, __stackOp100033_177_0, "m");
    life19_576 = ((com.moon.jm)(life4_8)).a(((java.lang.String)(life18_571)), ((float)(life5_11)));
    spill100033_30 = (((life11_116 + (life13_124 / 0x1.0p1f)) + (life15_311 / 0x1.0p1f)) + life7_24);
    spill100033_31 = ((life12_119 - (life16_316 + (life6_22 * 0x1.0p1f))) - 0x1.0p0f);
    spill100033_32 = (life19_576 + (life6_22 * 0x1.0p1f));
    spill100033_33 = life16_316;
    spill100033_34 = (life6_22 * 0x1.0p1f);
    if (!((life3_12 == null))) {
        forestValue100033_578_0 = spill100033_30;
        forestValue100033_578_1 = spill100033_31;
        forestValue100033_578_2 = spill100033_32;
        forestValue100033_578_3 = spill100033_33;
        forestValue100033_578_4 = spill100033_34;
        break forest_join_578;
    }
    spill100033_35 = (spill100033_33 + spill100033_34);
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.x)).getValue())))).booleanValue())) {
        forestValue100033_579_0 = spill100033_30;
        forestValue100033_579_1 = spill100033_31;
        forestValue100033_579_2 = spill100033_32;
        forestValue100033_579_3 = spill100033_35;
        break forest_join_579;
    }
    forestValue100033_578_0 = spill100033_30;
    forestValue100033_578_1 = spill100033_31;
    forestValue100033_578_2 = spill100033_32;
    forestValue100033_578_3 = spill100033_35;
    forestValue100033_578_4 = 0x1.8p1f;
    }
    forestValue100033_580_0 = forestValue100033_578_0;
    forestValue100033_580_1 = forestValue100033_578_1;
    forestValue100033_580_2 = forestValue100033_578_2;
    forestValue100033_580_3 = forestValue100033_578_3;
    forestValue100033_580_4 = forestValue100033_578_4;
    break forest_join_580;
    }
    forestValue100033_580_0 = forestValue100033_579_0;
    forestValue100033_580_1 = forestValue100033_579_1;
    forestValue100033_580_2 = forestValue100033_579_2;
    forestValue100033_580_3 = forestValue100033_579_3;
    forestValue100033_580_4 = 0x0.0p0f;
    }
    life20_626 = com.moon.i3.a(((float)(forestValue100033_580_0)), ((float)(forestValue100033_580_1)), ((float)(forestValue100033_580_2)), ((float)(forestValue100033_580_3)), ((float)(forestValue100033_580_4)), ((int)(__sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_184(22793, (1962449452702502014L ^ life1_3)))));
    spill100033_36 = this;
    if (!((life3_12 == null))) {
        forestValue100033_627_0 = spill100033_36;
        break forest_join_627;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Nametags)(spill100033_36)).x)).getValue())))).booleanValue()))) {
        break forest_join_599;
    }
    ((com.moon.i3)(life20_626)).e(((boolean)(false)));
    }
    ((com.moon.jm)(life4_8)).b(((com.moon.hW)(this.B)), ((java.lang.String)(life18_571)), ((float)(life5_11)), ((float)(((((life11_116 + (life13_124 / 0x1.0p1f)) + (life15_311 / 0x1.0p1f)) + life7_24) + life6_22))), ((float)((((life12_119 - life16_316) - life6_22) - 0x1.0p-1f))), ((int)(-1)));
    forestValue100033_627_0 = this;
    }
    ((com.moon.hW)(((com.moon.module.impl.Nametags)(forestValue100033_627_0)).A)).a(((com.moon.iX)(life20_626)));
    }
    if (!((life3_12 != null))) {
        continue forest_cycle_78;
    }
    break forest_cycle_78;
    }
    }
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 17020;
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
            throw new RuntimeException("com/moon/l0", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         J[var3] = var15;
      }

      return J[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Nametags.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2568_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l0"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.event.EntityEvent p0) {
long local2 = (com.moon.module.impl.Nametags.E ^ 94105310377098L);
    if ((__sourceIntrinsic_booleanComparison(((com.moon.module.impl.Nametags)(this)).a(((net.minecraft.entity.Entity)(((com.moon.event.EntityEvent)(p0)).getEntity())))) != 0)) {
        ((com.moon.event.EntityEvent)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


public void a(com.moon.event.Render3DEvent p0) {
int forwardValue886_20_0;
    com.moon.module.impl.Nametags forwardValue886_27_0;
    com.moon.module.impl.Nametags spill886_0;
    boolean spill886_1;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_26: {
    forward_join_20: {
    life2_3 = (com.moon.module.impl.Nametags.E ^ 125073680287567L);
    life4_5 = com.moon.bY.b();
    spill886_0 = this;
    if (!((life4_5 == null))) {
        forwardValue886_27_0 = spill886_0;
        break forward_join_27;
    }
    if (!((!((com.moon.module.impl.Nametags)(spill886_0)).D))) {
        break forward_join_26;
    }
    spill886_1 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Nametags.d)).W)).E;
    if (!((life4_5 == null))) {
        forwardValue886_20_0 = ((spill886_1) ? 1 : 0);
        break forward_join_20;
    }
    if (!((!spill886_1))) {
        break forward_join_26;
    }
    forwardValue886_20_0 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Nametags.d)).W)).r;
    }
    if (!((forwardValue886_20_0 < __sourceIntrinsic_2a96c96660b0_invokedynamic886_10(22, (3136301710664236076L ^ life2_3))))) {
        break forward_join_28;
    }
    }
    forwardValue886_27_0 = this;
    }
    ((com.moon.module.impl.Nametags)(forwardValue886_27_0)).f();
    }
    moom.kZ.l();
    ((com.moon.hW)(this.A)).b();
    ((com.moon.hW)(this.B)).b();
    this.D = ((boolean)(false));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public boolean a(net.minecraft.entity.Entity p0) {
int forwardValue887_19_0;
    int forwardValue887_21_0;
    net.minecraft.entity.Entity forwardValue887_23_0;
    int forwardValue887_43_0;
    int forwardValue887_46_0;
    int forwardValue887_60_0;
    int forwardValue887_74_0;
    int forwardValue887_91_0;
    int forwardValue887_98_0;
    int forwardValue887_105_0;
    int forwardValue887_109_0;
    int forwardValue887_111_0;
    net.minecraft.entity.Entity spill887_0;
    int spill887_1;
    int spill887_2;
    int spill887_3;
    boolean spill887_4;
    boolean spill887_5;
    int spill887_6;
    int spill887_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_111: {
    forward_join_110: {
    forward_join_109: {
    forward_join_105: {
    forward_join_98: {
    forward_join_96: {
    forward_join_91: {
    forward_join_87: {
    forward_join_74: {
    forward_join_72: {
    forward_join_60: {
    forward_join_58: {
    forward_join_46: {
    forward_join_44: {
    forward_join_43: {
    forward_join_42: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    life2_3 = (com.moon.module.impl.Nametags.E ^ 47851046949276L);
    life4_5 = com.moon.bY.b();
    spill887_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue887_23_0 = spill887_0;
        break forward_join_23;
    }
    if (!((spill887_0 == ((net.minecraft.client.Minecraft)(com.moon.module.impl.Nametags.d)).K))) {
        break forward_join_22;
    }
    spill887_1 = ((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Nametags.d)).W)).aP;
    if (!((life4_5 == null))) {
        forwardValue887_19_0 = spill887_1;
        break forward_join_19;
    }
    if (!((spill887_1 != 0))) {
        break forward_join_20;
    }
    forwardValue887_19_0 = 1;
    }
    forwardValue887_21_0 = forwardValue887_19_0;
    break forward_join_21;
    }
    forwardValue887_21_0 = 0;
    }
    return ((forwardValue887_21_0) != 0);
    }
    forwardValue887_23_0 = p0;
    }
    spill887_2 = ((net.minecraft.entity.Entity)(forwardValue887_23_0)).e__Int();
    if (!((life4_5 == null))) {
        forwardValue887_43_0 = spill887_2;
        break forward_join_43;
    }
    if (!((spill887_2 != __sourceIntrinsic_376c3b2efa03_invokedynamic887_9(1568, (7005365124976045260L ^ life2_3))))) {
        break forward_join_42;
    }
    spill887_3 = ((net.minecraft.entity.Entity)(p0)).e__Int();
    if (!((life4_5 == null))) {
        forwardValue887_46_0 = spill887_3;
        break forward_join_46;
    }
    if (!((spill887_3 == __sourceIntrinsic_376c3b2efa03_invokedynamic887_11(20049, (5844914657113318587L ^ life2_3))))) {
        break forward_join_44;
    }
    }
    forwardValue887_43_0 = 0;
    }
    return ((forwardValue887_43_0) != 0);
    }
    forwardValue887_46_0 = ((((net.minecraft.entity.Entity)(p0)).v__Boolean()) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue887_60_0 = forwardValue887_46_0;
        break forward_join_60;
    }
    if (!((forwardValue887_46_0 != 0))) {
        break forward_join_58;
    }
    spill887_4 = ((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b5.INVISIBLE)));
    if (!((life4_5 == null))) {
        forwardValue887_60_0 = ((spill887_4) ? 1 : 0);
        break forward_join_60;
    }
    if (!((!spill887_4))) {
        break forward_join_58;
    }
    return ((0) != 0);
    }
    forwardValue887_60_0 = ((p0 instanceof moom.sZ) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue887_74_0 = forwardValue887_60_0;
        break forward_join_74;
    }
    if (!((forwardValue887_60_0 != 0))) {
        break forward_join_72;
    }
    spill887_5 = ((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b5.MOB)));
    if (!((life4_5 == null))) {
        forwardValue887_74_0 = ((spill887_5) ? 1 : 0);
        break forward_join_74;
    }
    if (!(spill887_5)) {
        break forward_join_72;
    }
    return ((1) != 0);
    }
    forwardValue887_74_0 = ((p0 instanceof moom.sK) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue887_91_0 = forwardValue887_74_0;
        break forward_join_91;
    }
    if (!((forwardValue887_74_0 == 0))) {
        break forward_join_87;
    }
    spill887_6 = ((p0 instanceof net.minecraft.entity.passive.EntityVillager) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue887_91_0 = spill887_6;
        break forward_join_91;
    }
    if (!((spill887_6 == 0))) {
        break forward_join_87;
    }
    spill887_7 = ((p0 instanceof moom.tl) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue887_98_0 = spill887_7;
        break forward_join_98;
    }
    if (!((spill887_7 != 0))) {
        break forward_join_96;
    }
    }
    forwardValue887_91_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b5.ANIMAL)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue887_98_0 = forwardValue887_91_0;
        break forward_join_98;
    }
    if (!((forwardValue887_91_0 != 0))) {
        break forward_join_96;
    }
    return ((1) != 0);
    }
    forwardValue887_98_0 = ((p0 instanceof net.minecraft.entity.player.EntityPlayer) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue887_105_0 = forwardValue887_98_0;
        break forward_join_105;
    }
    if (!((forwardValue887_98_0 != 0))) {
        break forward_join_110;
    }
    forwardValue887_105_0 = ((((com.moon.setting.MultiSelectSetting)(this.s)).isSelected(((java.lang.Enum)(com.moon.b5.PLAYER)))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue887_109_0 = forwardValue887_105_0;
        break forward_join_109;
    }
    if (!((forwardValue887_105_0 != 0))) {
        break forward_join_110;
    }
    forwardValue887_109_0 = 1;
    }
    forwardValue887_111_0 = forwardValue887_109_0;
    break forward_join_111;
    }
    forwardValue887_111_0 = 0;
    }
    return ((forwardValue887_111_0) != 0);
}


private void lambda$new$0() {
terminal_cycle_0: while (true) {
        ((com.moon.gX)(this.C)).a(((int)(((com.moon.module.impl.Nametags)(this)).b())));
        this.D = ((boolean)(true));
        continue terminal_cycle_0;
    }
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_23(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_29(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_31(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_42(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_50(com.moon.module.impl.Nametags a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_ab95951395e4860e_originalDynamicSite1268_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a96c96660b0_invokedynamic886_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic887_9(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_376c3b2efa03_invokedynamic887_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2566_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2568_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_72(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_74(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_76(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_78(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_79(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_80(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_84(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_85(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_102(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_103(java.lang.String a0, int a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_113(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_115(java.lang.String a0, int a1, java.lang.String a2) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_116(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_123(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_148(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_150(java.lang.String a0, int a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_156(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_176(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_178(java.lang.String a0, int a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0e8bb1a2e971_invokedynamic100033_184(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
