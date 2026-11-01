package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class CustomMinecraft extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private com.moon.setting.StringListSetting t;

private com.moon.setting.BooleanSetting u;

public com.moon.setting.BooleanSetting v;

private com.moon.module.impl.Camera w;

private com.moon.module.impl.Effects x;

private boolean y;

private com.moon.hW z;

private com.moon.hW A;

private com.moon.hW B;

private net.minecraft.scoreboard.ScoreObjective C;

private int D;

private int E;

private float F;

private float G;

private float H;

private float I;

private static long J;

private static java.lang.String[] K;

private static java.lang.String[] L;

private static java.util.Map M;

private static long[] N;

private static java.lang.Integer[] O;

private static java.util.Map P;

public CustomMinecraft(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_e9d8e2b871fbb4f4(com.moon.module.impl.CustomMinecraft receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5_life2 = (com.moon.module.impl.CustomMinecraft.J ^ 86470554776811L);

    com.moon.module.impl.CustomMinecraft.__sourceConstructorInit_e9d8e2b871fbb4f4_0(((com.moon.module.impl.CustomMinecraft)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.CustomMinecraft)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_5(30546, (7651939587525443544L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_8(28636, (5895304768001468249L ^ local5_life2)))), ((boolean)(false))))).a(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_11(29958, (6260617907787464065L ^ local5_life2))))))).a()));

    com.moon.module.impl.CustomMinecraft __sourceSpill4_27 = receiver;

    com.moon.mh __sourceSpill4_28 = ((com.moon.mh)(((com.moon.mh)(com.moon.setting.StringListSetting.builder(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_16(15230, (8811874639881319408L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_19(30798, (7514049203863843013L ^ local5_life2)))), ((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_21(5634, (755563620545011328L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_24(192, (5180360672001001566L ^ local5_life2)))));

    com.moon.setting.BooleanSetting __sourceEffectfulDup4_29 = ((com.moon.module.impl.CustomMinecraft)(receiver)).s;

    com.moon.setting.BooleanSetting __sourceSpill4_31 = __sourceEffectfulDup4_29;

    java.util.Objects.requireNonNull(((java.lang.Object)(__sourceEffectfulDup4_29)));

    ((com.moon.module.impl.CustomMinecraft)(__sourceSpill4_27)).t = ((com.moon.setting.StringListSetting)(((com.moon.mh)(((com.moon.mh)(__sourceSpill4_28)).a(((java.util.function.Supplier)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_32(__sourceSpill4_31)))))).a()));

    ((com.moon.module.impl.CustomMinecraft)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_37(15424, (7829720033176335560L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_40(29154, (8770111101218453887L ^ local5_life2)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.CustomMinecraft)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_45(31289, (3860481346999284390L ^ local5_life2))))))).a(((java.lang.String)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_48(29454, (5638281261087226766L ^ local5_life2)))), ((boolean)(true))))).a(((com.moon.kR)(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_50()))))).a()));

    com.moon.gX local7_life54 = new com.moon.gX();

    ((java.lang.Thread)(new java.lang.Thread(__sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_55(receiver, local7_life54)))).start();

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e9d8e2b871fbb4f4_0(com.moon.module.impl.CustomMinecraft a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
J = ((long)(((moom._a)(moom._c.a(((long)(5139759092755462725L)), ((long)(-1576420712134556079L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(264606546970360L)))));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.CustomMinecraft.J ^ 3155943861634L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill268_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill268_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill268_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill268_14 = new byte[8];
    (__sourceSpill268_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill268_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation268_16 = __sourceSpill268_14;
    ((javax.crypto.Cipher)(__sourceSpill268_11)).init(((int)(__sourceSpill268_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill268_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation268_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[20];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ñÄ\036a[\002ß!ØÙkß>:÷Ûã3ö/¦E)TKhæèíý+\0217\032Ò\020ÂufIØc\020\020³~§s\013p¿\020\0234G{õdÀ7¶4°(ã\020¨h(Ñj\032ö\025_ K_DFZ m¹«PAÖ\024g=¾åÅxGA<Ôü`dª\006èëþÅ(L.ÍáP77Ôã\rÆ\021ïÍ\031Æ<1X¬3ß2æûjÄT&\032ºÙ) ÛO¥\013\027uH\026M«(i\016Nçb.\032´.\021\n<â¦-\033=ô\020¬\006KVawÌèîÄÒFt\034 \036õÜ^Ð¸¥\003\022Mk4ÀZ\t3æ´e\037Æ¾÷K(\030µ@gÌHêïF|beÅ\016Ê¥KB­ÅûðvH±Á\020ë\034½û{óñß×!ÏS}Ý?Þ¬\001åÊ·Z\007²¿¥½¯Xy®\r=µFRÑ\0065mXa\020²[Ù´\004ÒtÒöNX®a \tP\033W¥4²t~õTÆñ2v¥aTêÓø f^êN\021 ÍAhpèsÃ\0342ßk\001Çë\f\032Ï@òüyÃÿ\021k\016Ó6(2¨åÞ\017\004Ê\ftXãûäñÍq:¾pX\n41É÷§j\022(ì·\006@/ö»ÐW\020}ýý´ÝñHaB+\020ÙW\006à(\0075_\\5Yª|\001(_l}A©\006kðÓ«ûÔ ©(8@ÿ.ªp¢0\007ÃT`H[\002\027½iß¹Çþ±µ>\032rÕ\020\rÜ)w£:\023Ü\fR¥M\001¬:äÀÌRK\003÷t(+/&_]9>ú]¨ÜG<ÏkM\000ã/+2#«\020Ø¤°1¢xXxd¦W\035x"))).length();
    int local16_life24 = 40;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill268_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill268_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill268_29)).doFinal(((byte[])(__sourceSpill268_28)));
        java.lang.String __sourceSpill268_34 = ((java.lang.String)(com.moon.module.impl.CustomMinecraft.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill268_35 = local20_life19;
        int __sourceSpill268_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill268_35)[__sourceSpill268_36] = __sourceSpill268_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "ÕWª\037P¼àê\n\001\023\020\032d2\0232GZJGÆî±ª6O\030Æ½Wñd|#9p#Þ÷RÖ¤0î´\177X:¶"))).length();
    local16_life24 = 32;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill268_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill268_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill268_42)).doFinal(((byte[])(__sourceSpill268_41)));
        java.lang.String __sourceSpill268_47 = ((java.lang.String)(com.moon.module.impl.CustomMinecraft.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill268_48 = local20_life19;
        int __sourceSpill268_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill268_48)[__sourceSpill268_49] = __sourceSpill268_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    K = ((java.lang.String[])(local20_life19));
    L = ((java.lang.String[])(new java.lang.String[20]));
    P = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill268_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill268_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill268_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill268_60 = new byte[8];
    (__sourceSpill268_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill268_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation268_62 = __sourceSpill268_60;
    ((javax.crypto.Cipher)(__sourceSpill268_57)).init(((int)(__sourceSpill268_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill268_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation268_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[8];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "ã¢Jw4Üö}òög?k?ÜÍ;=\007Ò¡Æ3\022a\002OzÍ\\ìG\0270s6¬\034dþM*{½c"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill268_71 = local4_life67;
        int __sourceSpill268_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill268_71)).substring(((int)(__sourceSpill268_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill268_76 = local6_life65;
        int __sourceSpill268_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill268_79 = new byte[8];
        (__sourceSpill268_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill268_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill268_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill268_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill268_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill268_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill268_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill268_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill268_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill268_80)).doFinal(((byte[])(__sourceSpill268_79)));
        (__sourceSpill268_76)[__sourceSpill268_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "\036ä°\\t\006Q£\023Jce¸´¡#"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill268_84 = local4_life67;
        int __sourceSpill268_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill268_84)).substring(((int)(__sourceSpill268_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill268_89 = local6_life65;
        int __sourceSpill268_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill268_92 = new byte[8];
        (__sourceSpill268_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill268_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill268_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill268_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill268_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill268_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill268_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill268_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill268_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill268_93)).doFinal(((byte[])(__sourceSpill268_92)));
        (__sourceSpill268_89)[__sourceSpill268_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    N = ((long[])(local6_life65));
    O = ((java.lang.Integer[])(new java.lang.Integer[8]));
}


public com.moon.hW b__hW() {
return this.A;
}


public com.moon.setting.BooleanSetting b__kV() {
return this.u;
}


public int b() {
return this.D;
}


public int e__Int() {
return this.E;
}


public float e() {
return this.H;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.CustomMinecraft.c(((int)(local4)), ((long)(local5)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 16406);
    if (((com.moon.module.impl.CustomMinecraft.L)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.CustomMinecraft.M)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.CustomMinecraft.M)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lT", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.CustomMinecraft.K)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.CustomMinecraft.L)[life5_8] = com.moon.module.impl.CustomMinecraft.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.CustomMinecraft.L)[life5_8];
}


private boolean c__Boolean() {
com.moon.hW forwardValue823_13_0;
    int forwardValue823_17_0;
    com.moon.hW spill823_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_17: {
    forward_join_16: {
    forward_join_13: {
    life1_3 = (com.moon.module.impl.CustomMinecraft.J ^ 103071656200311L);
    life3_5 = com.moon.bY.b();
    spill823_0 = this.z;
    if (!((life3_5 == null))) {
        forwardValue823_13_0 = spill823_0;
        break forward_join_13;
    }
    if (!((spill823_0 != null))) {
        break forward_join_16;
    }
    forwardValue823_13_0 = this.A;
    }
    if (!((forwardValue823_13_0 != null))) {
        break forward_join_16;
    }
    forwardValue823_17_0 = 1;
    break forward_join_17;
    }
    forwardValue823_17_0 = 0;
    }
    return ((forwardValue823_17_0) != 0);
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
        byte[] spill1074_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1074_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1074_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1074_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1074_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1074_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public com.moon.setting.BooleanSetting c__kV() {
return this.v;
}


public void c__Void() {
((com.moon.module.impl.CustomMinecraft)(this)).g();
    return;
}


public com.moon.hW c__hW() {
return this.B;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2442_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public float c() {
return this.F;
}


public float f() {
return this.I;
}


private void f__Void() {
moom.kZ.l();
    ((com.moon.hW)(this.A)).b();
    ((com.moon.hW)(this.z)).b();
    moom.kZ.k();
    return;
}


public float d() {
return this.G;
}


public boolean d__Boolean() {
return ((((this.y) ? 1 : 0)) != 0);
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.CustomMinecraft.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23068;
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
            throw new RuntimeException("com/moon/lT", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         O[var3] = var15;
      }

      return O[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2443_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lT"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void d__Void() {
((com.moon.module.impl.CustomMinecraft)(this)).g();
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.ei p0) {
com.moon.module.impl.Effects forwardValue819_31_0;
    int forwardValue819_46_0;
    com.moon.module.impl.CustomMinecraft forwardValue819_56_0;
    com.moon.module.impl.Effects forwardValue819_73_0;
    int spill819_0;
    com.moon.module.impl.Effects spill819_1;
    com.moon.module.impl.CustomMinecraft spill819_2;
    com.moon.module.impl.CustomMinecraft spill819_3;
    com.moon.module.impl.Effects spill819_4;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_85: {
    forward_join_73: {
    forward_join_67: {
    forward_join_56: {
    forward_join_55: {
    forward_join_46: {
    forward_join_39: {
    forward_join_31: {
    forward_join_25: {
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 13901961056245L);
    life4_5 = com.moon.bY.b();
    spill819_0 = this.D;
    if (!((life4_5 == null))) {
        forwardValue819_46_0 = spill819_0;
        break forward_join_46;
    }
    if (!((spill819_0 != this.E))) {
        break forward_join_39;
    }
    spill819_1 = this.x;
    if (!((life4_5 == null))) {
        forwardValue819_31_0 = spill819_1;
        break forward_join_31;
    }
    if (!((spill819_1 == null))) {
        break forward_join_25;
    }
    this.x = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.x)).a__gW())).c();
    forwardValue819_31_0 = this.x;
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(forwardValue819_31_0)).a())).a(((boolean)(true)));
    this.D = ((int)(this.E));
    }
    spill819_2 = this;
    if (!((life4_5 == null))) {
        forwardValue819_56_0 = spill819_2;
        break forward_join_56;
    }
    forwardValue819_46_0 = recovery.source.CarrierOps.fcmpl(((float)(((com.moon.module.impl.CustomMinecraft)(spill819_2)).F)), ((float)(this.H)));
    }
    if (!((forwardValue819_46_0 == 0))) {
        break forward_join_55;
    }
    spill819_3 = this;
    if (!((life4_5 == null))) {
        forwardValue819_56_0 = spill819_3;
        break forward_join_56;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(((com.moon.module.impl.CustomMinecraft)(spill819_3)).G)), ((float)(this.I))) != 0))) {
        break forward_join_85;
    }
    }
    forwardValue819_56_0 = this;
    }
    spill819_4 = ((com.moon.module.impl.CustomMinecraft)(forwardValue819_56_0)).x;
    if (!((life4_5 == null))) {
        forwardValue819_73_0 = spill819_4;
        break forward_join_73;
    }
    if (!((spill819_4 == null))) {
        break forward_join_67;
    }
    this.x = ((com.moon.module.impl.Effects)(((com.moon.module.impl.Effects)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Effects.class)))))));
    }
    ((com.moon.gW)(((com.moon.module.impl.Effects)(this.x)).a__gW())).c();
    forwardValue819_73_0 = this.x;
    }
    ((com.moon.gV)(((com.moon.module.impl.Effects)(forwardValue819_73_0)).a())).a(((boolean)(true)));
    this.F = ((float)(this.H));
    this.G = ((float)(this.I));
    }
    return;
}


public com.moon.setting.BooleanSetting a__kV() {
return this.s;
}


public com.moon.setting.StringListSetting a__k3() {
return this.t;
}


public void a(com.moon.ej p0) {
java.lang.Object forwardValue820_16_0;
    com.moon.module.impl.CustomMinecraft forwardValue820_28_0;
    com.moon.hW spill820_0;
    com.moon.module.impl.CustomMinecraft spill820_1;
    com.moon.module.impl.CustomMinecraft spill820_2;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_30: {
    forward_join_28: {
    forward_join_27: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 92559459741219L);
    life4_5 = com.moon.bY.b();
    spill820_0 = this.B;
    if (!((life4_5 == null))) {
        forwardValue820_16_0 = spill820_0;
        break forward_join_16;
    }
    if (!((spill820_0 != null))) {
        break forward_join_30;
    }
    spill820_1 = this;
    if (!((life4_5 == null))) {
        forwardValue820_28_0 = spill820_1;
        break forward_join_28;
    }
    forwardValue820_16_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(spill820_1)).v)).getValue();
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(forwardValue820_16_0)))).booleanValue()))) {
        break forward_join_27;
    }
    spill820_2 = this;
    if (!((life4_5 == null))) {
        forwardValue820_28_0 = spill820_2;
        break forward_join_28;
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(spill820_2)).u)).getValue())))).booleanValue())) {
        break forward_join_30;
    }
    }
    forwardValue820_28_0 = this;
    }
    ((com.moon.hW)(((com.moon.module.impl.CustomMinecraft)(forwardValue820_28_0)).B)).b();
    }
    return;
}


public com.moon.module.impl.Camera a__lQ() {
return this.w;
}


public void a(com.moon.dY p0) {
com.moon.module.impl.CustomMinecraft forwardValue818_16_0;
    com.moon.module.impl.CustomMinecraft forwardValue818_28_0;
    com.moon.module.impl.CustomMinecraft spill818_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_28: {
    forward_join_27: {
    forward_join_16: {
    forward_join_15: {
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 111998835622649L);
    life4_5 = com.moon.bY.b();
    spill818_0 = this;
    if (!((life4_5 == null))) {
        forwardValue818_16_0 = spill818_0;
        break forward_join_16;
    }
    if (!((!((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(spill818_0)).u)).getValue())))).booleanValue()))) {
        break forward_join_15;
    }
    return;
    }
    forwardValue818_16_0 = this;
    }
    if (!((life4_5 == null))) {
        forwardValue818_28_0 = forwardValue818_16_0;
        break forward_join_28;
    }
    if (!((((com.moon.module.impl.CustomMinecraft)(forwardValue818_16_0)).w == null))) {
        break forward_join_27;
    }
    this.w = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    forwardValue818_28_0 = this;
    }
    ((com.moon.module.impl.CustomMinecraft)(forwardValue818_28_0)).C = ((net.minecraft.scoreboard.ScoreObjective)(((com.moon.dY)(p0)).a__sourceReturn_9a115a8a6d()));
    ((com.moon.dY)(p0)).setCancelled(((boolean)(true)));
    return;
}


public void a(com.moon.dX p0) {
long local2 = (com.moon.module.impl.CustomMinecraft.J ^ 77627309911171L);
    java.lang.Object[] local4 = com.moon.bY.b();
    if ((local4 == null)) {
        if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.v)).getValue())))).booleanValue()) == 0)) {
        return;
    }
        ((com.moon.dX)(p0)).setCancelled(((boolean)(true)));
    }
    return;
}


private void a(int p0) {
int lexicalValue232_54_0;
    int lexicalValue232_60_0;
    int lexicalValue232_108_0;
    int lexicalValue232_154_0;
    int lexicalValue232_196_0;
    int lexicalValue232_200_0;
    net.minecraft.entity.Entity[] spill232_0;
    int spill232_1;
    int spill232_2;
    int spill232_3;
    int spill232_4;
    int spill232_5;
    long life2_3;
    moom.gB life5_7;
    float life6_10;
    net.minecraft.entity.Entity[] life4_11;
    com.moon.jm life7_16;
    moom.ir life8_18;
    int life9_26;
    int life10_28;
    int life11_30;
    int life12_34;
    float life13_42;
    int life14_47;
    int life15_69;
    moom.f_ life16_99;
    int life17_111;
    double life18_138;
    double life18_142;
    double life18_146;
    double life18_151;
    double life18_155;
    int life20_160;
    int life20_179;
    int life21_190;
    float life22_198;
    java.lang.String life23_202;
    float life24_212;
    float life15_243;
    float life16_257;
    float life17_259;
    lexical_join_258: {
    lexical_join_255: {
    lexical_join_200: {
    lexical_join_196: {
    lexical_join_195: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_54: {
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 70435033365559L);
    life5_7 = ((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).T)).a__gB();
    spill232_0 = com.moon.bY.b();
    life6_10 = 0x1.2p3f;
    life4_11 = spill232_0;
    life7_16 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life8_18 = com.moon.nS.a();
    if (!((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).W)).x != net.minecraft.entity.player.EntityPlayer$EnumChatVisibility.HIDDEN))) {
        break lexical_join_258;
    }
    life9_26 = ((moom.gB)(life5_7)).c();
    life10_28 = 0;
    life11_30 = 0;
    life12_34 = ((java.util.List)(((moom.gB)(life5_7)).d__List())).size();
    life13_42 = ((((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).W)).B * 0x1.ccccccp-1f) + 0x1.99999ap-4f);
    life14_47 = moom.Dr.b__Int(((float)(((float) ((moom.gB)(life5_7)).a__Int()))));
    spill232_1 = life12_34;
    if (!((life4_11 == null))) {
        lexicalValue232_54_0 = spill232_1;
        break lexical_join_54;
    }
    if (!((spill232_1 > 0))) {
        break lexical_join_255;
    }
    lexicalValue232_54_0 = ((((moom.gB)(life5_7)).a__Boolean()) ? 1 : 0);
    }
    if (!((life4_11 == null))) {
        lexicalValue232_60_0 = lexicalValue232_54_0;
        break lexical_join_60;
    }
    if (!((lexicalValue232_54_0 != 0))) {
        break lexical_join_59;
    }
    life10_28 = 1;
    }
    lexicalValue232_60_0 = 0;
    }
    life15_69 = lexicalValue232_60_0;
    lexical_cycle_61: while (true) {
    lexical_join_193: {
    lexical_join_192: {
    lexical_join_154: {
    lexical_join_144: {
    lexical_join_108: {
    lexical_join_107: {
    if (!(((life15_69 + ((moom.gB)(life5_7)).d()) < ((java.util.List)(((moom.gB)(life5_7)).d__List())).size()))) {
        break lexical_join_195;
    }
    spill232_2 = life15_69;
    if (!((life4_11 == null))) {
        lexicalValue232_196_0 = spill232_2;
        break lexical_join_196;
    }
    if (!((life4_11 == null))) {
        lexicalValue232_196_0 = spill232_2;
        break lexical_join_196;
    }
    if (!((spill232_2 < life9_26))) {
        break lexical_join_195;
    }
    life16_99 = ((moom.f_)(((java.util.List)(((moom.gB)(life5_7)).d__List())).get(((int)((life15_69 + ((moom.gB)(life5_7)).d()))))));
    if (!((life4_11 == null))) {
        break lexical_join_193;
    }
    if (!((life16_99 != null))) {
        break lexical_join_192;
    }
    life17_111 = (p0 - ((moom.f_)(life16_99)).a());
    spill232_3 = life17_111;
    if (!((life4_11 == null))) {
        lexicalValue232_108_0 = spill232_3;
        break lexical_join_108;
    }
    if (!((spill232_3 >= __sourceIntrinsic_b4a3d886a4d9_invokedynamic232_32(27423, (2770258208770568519L ^ life2_3))))) {
        break lexical_join_107;
    }
    spill232_4 = life10_28;
    if (!((life4_11 == null))) {
        lexicalValue232_108_0 = spill232_4;
        break lexical_join_108;
    }
    if (!((spill232_4 != 0))) {
        break lexical_join_192;
    }
    }
    lexicalValue232_108_0 = life17_111;
    }
    life18_138 = (((double) lexicalValue232_108_0) / 0x1.9p7d);
    life18_142 = (0x1.0p0d - life18_138);
    life18_146 = (life18_142 * 0x1.4p3d);
    life18_151 = moom.Dr.a(((double)(life18_146)), ((double)(0x0.0p0d)), ((double)(0x1.0p0d)));
    life18_155 = (life18_151 * life18_151);
    life20_160 = ((int) (0x1.fep7d * life18_155));
    spill232_5 = life10_28;
    if (!((life4_11 == null))) {
        lexicalValue232_154_0 = spill232_5;
        break lexical_join_154;
    }
    if (!((spill232_5 != 0))) {
        break lexical_join_144;
    }
    life20_160 = __sourceIntrinsic_b4a3d886a4d9_invokedynamic232_34(6285, (8210967000977818320L ^ life2_3));
    }
    life20_179 = ((int) (((float) life20_160) * life13_42));
    life11_30 += 1;
    if (!((life4_11 == null))) {
        break lexical_join_193;
    }
    lexicalValue232_154_0 = life20_179;
    }
    if (!((lexicalValue232_154_0 > 3))) {
        break lexical_join_192;
    }
    life21_190 = 0;
    life22_198 = (((float) (-life15_69)) * ((com.moon.jm)(life7_16)).a(((float)(life6_10))));
    life23_202 = ((net.minecraft.util.IChatComponent)(((moom.f_)(life16_99)).a__C5())).c();
    life24_212 = (((float) ((moom.ir)(life8_18)).b__Int()) + ((life22_198 - 0x1.0p3f) - 0x1.bp4f));
    ((com.moon.jm)(life7_16)).a(((com.moon.hW)(this.z)), ((java.lang.String)(life23_202)), ((float)(life6_10)), ((float)(((float) (life21_190 + 5)))), ((float)(life24_212)), ((int)(-1)));
    }
    life15_69 += 1;
    }
    if (!((life4_11 != null))) { continue lexical_cycle_61; }
    break lexical_cycle_61;
    }
    }
    lexicalValue232_196_0 = life11_30;
    }
    if (!((life4_11 == null))) {
        lexicalValue232_200_0 = lexicalValue232_196_0;
        break lexical_join_200;
    }
    if (!((lexicalValue232_196_0 > 0))) {
        break lexical_join_255;
    }
    lexicalValue232_200_0 = life11_30;
    }
    life15_243 = ((((float) lexicalValue232_200_0) * ((com.moon.jm)(life7_16)).a(((float)(life6_10)))) + 0x1.4p2f);
    life16_257 = ((((float) (((moom.ir)(life8_18)).b__Int() - __sourceIntrinsic_b4a3d886a4d9_invokedynamic232_43(30416, (3732749283976457353L ^ life2_3)))) - life15_243) + 0x1.2p2f);
    life17_259 = 0x1.0p1f;
    ((com.moon.hW)(this.A)).a(((com.moon.iX)(com.moon.i3.a(((float)(life17_259)), ((float)(life16_257)), ((float)(((float) (life14_47 + 3)))), ((float)(life15_243)), ((float)(0x1.0p2f)), ((int)(__sourceIntrinsic_b4a3d886a4d9_invokedynamic232_45(21093, (1496008687864907839L ^ life2_3))))))));
    ((com.moon.hW)(this.B)).a(((com.moon.iX)(com.moon.i3.a(((float)(life17_259)), ((float)(life16_257)), ((float)(((float) (life14_47 + 3)))), ((float)(life15_243)), ((float)(0x1.0p2f)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    }
    this.E = ((int)(life11_30));
    }
    return;
}


private void a(net.minecraft.scoreboard.ScoreObjective p0) {
java.util.ArrayList lexicalValue233_58_0;
    float lexicalValue233_112_0;
    int lexicalValue233_268_0;
    com.moon.jm lexicalValue233_294_0;
    com.moon.hW lexicalValue233_294_1;
    java.lang.String lexicalValue233_294_2;
    float lexicalValue233_294_3;
    float lexicalValue233_294_4;
    float lexicalValue233_294_5;
    int lexicalValue233_294_6;
    int lexicalValue233_294_7;
    int lexicalValue233_296_0;
    int lexicalValue233_338_0;
    java.lang.String lexicalValue233_344_0;
    float lexicalValue233_373_0;
    net.minecraft.entity.Entity[] spill233_0;
    java.util.ArrayList spill233_1;
    java.lang.String spill233_2;
    net.minecraft.util.EnumChatFormatting spill233_3;
    float spill233_4;
    float spill233_5;
    boolean spill233_6;
    boolean spill233_7;
    com.moon.jm spill233_8;
    com.moon.hW spill233_9;
    java.lang.String spill233_10;
    float spill233_11;
    float spill233_12;
    float spill233_13;
    int spill233_14;
    int spill233_15;
    boolean spill233_16;
    boolean spill233_17;
    java.lang.String spill233_18;
    long life2_3;
    float life5_6;
    net.minecraft.entity.Entity[] life4_7;
    float life6_9;
    com.moon.jm life7_14;
    moom.ir life8_16;
    net.minecraft.scoreboard.Scoreboard life9_19;
    java.util.Collection life10_23;
    java.util.ArrayList life11_32;
    java.util.ArrayList life10_57;
    float life12_70;
    java.util.Iterator life13_73;
    net.minecraft.scoreboard.Score life14_80;
    moom.Bk life15_85;
    int life27_93;
    net.minecraft.util.EnumChatFormatting life28_94;
    java.lang.String life16_103;
    float life13_118;
    int life14_127;
    int life15_143;
    int life16_145;
    int life17_159;
    int life18_161;
    java.util.Iterator life19_164;
    net.minecraft.scoreboard.Score life20_171;
    moom.Bk life21_177;
    java.lang.String life22_182;
    java.lang.String life23_187;
    int life24_198;
    int life25_213;
    java.lang.String life26_328;
    float life19_409;
    float life20_443;
    float life21_455;
    lexical_join_373: {
    lexical_join_372: {
    lexical_join_112: {
    lexical_join_109: {
    lexical_join_59: {
    lexical_join_58: {
    lexical_join_57: {
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 38288535357261L);
    spill233_0 = com.moon.bY.b();
    life5_6 = 0x1.2p3f;
    life4_7 = spill233_0;
    life6_9 = 0x1.8p2f;
    life7_14 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    life8_16 = com.moon.nS.a();
    life9_19 = ((net.minecraft.scoreboard.ScoreObjective)(p0)).a__Bh();
    life10_23 = ((net.minecraft.scoreboard.Scoreboard)(life9_19)).a(((net.minecraft.scoreboard.ScoreObjective)(p0)));
    life11_32 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(((java.lang.Iterable)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.Collection)(life10_23)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_10()))))).collect(((java.util.stream.Collector)(java.util.stream.Collectors.toList()))))))));
    spill233_1 = life11_32;
    if (!((life4_7 == null))) {
        lexicalValue233_58_0 = spill233_1;
        break lexical_join_58;
    }
    if (!((((java.util.List)(spill233_1)).size() > __sourceIntrinsic_9132ceb2c887_invokedynamic233_17(24801, (3469014549883158983L ^ life2_3))))) {
        break lexical_join_57;
    }
    life10_57 = com.google.common.collect.Lists.newArrayList(((java.lang.Iterable)(com.google.common.collect.Iterables.skip(((java.lang.Iterable)(life11_32)), ((int)((((java.util.Collection)(life10_23)).size() - __sourceIntrinsic_9132ceb2c887_invokedynamic233_19(13713, (5258260113663841456L ^ life2_3)))))))));
    if (!((life4_7 != null))) {
        break lexical_join_59;
    }
    }
    lexicalValue233_58_0 = life11_32;
    }
    life10_57 = lexicalValue233_58_0;
    }
    life12_70 = ((com.moon.jm)(life7_14)).a(((java.lang.String)(((net.minecraft.scoreboard.ScoreObjective)(p0)).b())), ((float)(life5_6)));
    life13_73 = ((java.util.Collection)(life10_57)).iterator();
    lexical_cycle_68: while (true) {
    if (!(((java.util.Iterator)(life13_73)).hasNext())) {
        break lexical_join_109;
    }
    life14_80 = ((net.minecraft.scoreboard.Score)(((java.util.Iterator)(life13_73)).next()));
    life15_85 = ((net.minecraft.scoreboard.Scoreboard)(life9_19)).c(((java.lang.String)(((net.minecraft.scoreboard.Score)(life14_80)).a__String())));
    spill233_2 = moom.Bk.a(((moom.Bj)(life15_85)), ((java.lang.String)(((net.minecraft.scoreboard.Score)(life14_80)).a__String())));
    spill233_3 = net.minecraft.util.EnumChatFormatting.RED;
    life27_93 = ((net.minecraft.scoreboard.Score)(life14_80)).a();
    life28_94 = spill233_3;
    life16_103 = __sourceIntrinsic_9132ceb2c887_invokedynamic233_35(spill233_2, __sourceIntrinsic_9132ceb2c887_invokedynamic233_34(32163, (4015488561082402444L ^ life2_3)), life28_94, life27_93);
    spill233_4 = java.lang.Math.max(((float)(life12_70)), ((float)(((com.moon.jm)(life7_14)).a(((java.lang.String)(life16_103)), ((float)(life5_6))))));
    if (!((life4_7 == null))) {
        lexicalValue233_112_0 = spill233_4;
        break lexical_join_112;
    }
    life12_70 = spill233_4;
    if (!((life4_7 != null))) { continue lexical_cycle_68; }
    break lexical_cycle_68;
    }
    }
    lexicalValue233_112_0 = ((com.moon.jm)(life7_14)).a(((float)(life5_6)));
    }
    life13_118 = lexicalValue233_112_0;
    life14_127 = ((int) java.lang.Math.ceil(((double)(((double) (((float) ((java.util.Collection)(life10_57)).size()) * life13_118))))));
    life15_143 = ((int) java.lang.Math.ceil(((double)(((double) (((((float) ((moom.ir)(life8_16)).b__Int()) / 0x1.0p1f) + (((float) life14_127) / 0x1.8p1f)) + 0x1.9p6f))))));
    life16_145 = 3;
    life17_159 = ((int) java.lang.Math.ceil(((double)(((double) (((((float) ((moom.ir)(life8_16)).a__Int()) - life12_70) - ((float) life16_145)) - life6_9))))));
    life18_161 = 0;
    life19_164 = ((java.util.Collection)(life10_57)).iterator();
    lexical_cycle_159: while (true) {
    lexical_join_370: {
    lexical_join_345: {
    lexical_join_344: {
    lexical_join_338: {
    lexical_join_296: {
    lexical_join_295: {
    lexical_join_294: {
    lexical_join_278: {
    lexical_join_268: {
    lexical_join_251: {
    if (!(((java.util.Iterator)(life19_164)).hasNext())) {
        break lexical_join_372;
    }
    life20_171 = ((net.minecraft.scoreboard.Score)(((java.util.Iterator)(life19_164)).next()));
    life18_161 += 1;
    life21_177 = ((net.minecraft.scoreboard.Scoreboard)(life9_19)).c(((java.lang.String)(((net.minecraft.scoreboard.Score)(life20_171)).a__String())));
    life22_182 = moom.Bk.a(((moom.Bj)(life21_177)), ((java.lang.String)(((net.minecraft.scoreboard.Score)(life20_171)).a__String())));
    life23_187 = __sourceIntrinsic_9132ceb2c887_invokedynamic233_55(net.minecraft.util.EnumChatFormatting.RED, ((net.minecraft.scoreboard.Score)(life20_171)).a());
    life24_198 = ((int) java.lang.Math.ceil(((double)(((double) (((float) life15_143) - (((float) life18_161) * life13_118)))))));
    spill233_5 = (((float) ((((moom.ir)(life8_16)).a__Int() - life16_145) + 2)) - life6_9);
    if (!((life4_7 == null))) {
        lexicalValue233_373_0 = spill233_5;
        break lexical_join_373;
    }
    life25_213 = ((int) java.lang.Math.ceil(((double)(((double) spill233_5)))));
    spill233_6 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue();
    if (!((life4_7 == null))) {
        lexicalValue233_268_0 = ((spill233_6) ? 1 : 0);
        break lexical_join_268;
    }
    if (!(spill233_6)) {
        break lexical_join_251;
    }
    spill233_7 = ((java.lang.String)(((java.lang.String)(((java.lang.String)(((java.lang.String)(life22_182)).replaceAll(((java.lang.String)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_64(27447, (7576545100148215829L ^ life2_3)))), ((java.lang.String)(""))))).replaceAll(((java.lang.String)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_66(20355, (749100694779999400L ^ life2_3)))), ((java.lang.String)(""))))).replaceAll(((java.lang.String)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_68(1611, (1080030378059496811L ^ life2_3)))), ((java.lang.String)(""))))).equals(((java.lang.Object)(((com.moon.setting.StringListSetting)(this.t)).getValue())));
    if (!((life4_7 == null))) {
        lexicalValue233_268_0 = ((spill233_7) ? 1 : 0);
        break lexical_join_268;
    }
    if (!(spill233_7)) {
        break lexical_join_251;
    }
    life22_182 = __sourceIntrinsic_9132ceb2c887_invokedynamic233_74(30781, (9166322788885299994L ^ life2_3));
    }
    spill233_8 = life7_14;
    spill233_9 = this.z;
    spill233_10 = life22_182;
    spill233_11 = life5_6;
    spill233_12 = ((float) life17_159);
    spill233_13 = ((float) life24_198);
    spill233_14 = -1;
    spill233_15 = 1;
    if (!((life4_7 == null))) {
        lexicalValue233_294_0 = spill233_8;
        lexicalValue233_294_1 = spill233_9;
        lexicalValue233_294_2 = spill233_10;
        lexicalValue233_294_3 = spill233_11;
        lexicalValue233_294_4 = spill233_12;
        lexicalValue233_294_5 = spill233_13;
        lexicalValue233_294_6 = spill233_14;
        lexicalValue233_294_7 = spill233_15;
        break lexical_join_294;
    }
    ((com.moon.jm)(spill233_8)).a(((com.moon.hW)(spill233_9)), ((java.lang.String)(spill233_10)), ((float)(spill233_11)), ((float)(spill233_12)), ((float)(spill233_13)), ((int)(spill233_14)), ((boolean)__sourceIntrinsic_integerToBoolean((spill233_15))));
    lexicalValue233_268_0 = ((((com.moon.module.impl.Camera)(this.w)).isEnabled()) ? 1 : 0);
    }
    if (!((lexicalValue233_268_0 != 0))) {
        break lexical_join_278;
    }
    spill233_16 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.Camera)(this.w)).k())).getValue())))).booleanValue();
    if (!((life4_7 == null))) {
        lexicalValue233_296_0 = ((spill233_16) ? 1 : 0);
        break lexical_join_296;
    }
    if (!((!spill233_16))) {
        break lexical_join_295;
    }
    }
    lexicalValue233_294_0 = life7_14;
    lexicalValue233_294_1 = this.z;
    lexicalValue233_294_2 = life23_187;
    lexicalValue233_294_3 = life5_6;
    lexicalValue233_294_4 = (((float) life25_213) - ((com.moon.jm)(life7_14)).a(((java.lang.String)(life23_187)), ((float)(life5_6))));
    lexicalValue233_294_5 = ((float) life24_198);
    lexicalValue233_294_6 = -1;
    lexicalValue233_294_7 = 1;
    }
    ((com.moon.jm)(lexicalValue233_294_0)).a(((com.moon.hW)(lexicalValue233_294_1)), ((java.lang.String)(lexicalValue233_294_2)), ((float)(lexicalValue233_294_3)), ((float)(lexicalValue233_294_4)), ((float)(lexicalValue233_294_5)), ((int)(lexicalValue233_294_6)), ((boolean)__sourceIntrinsic_integerToBoolean((lexicalValue233_294_7))));
    }
    lexicalValue233_296_0 = life18_161;
    }
    if (!((lexicalValue233_296_0 == ((java.util.Collection)(life10_57)).size()))) {
        break lexical_join_370;
    }
    life26_328 = ((net.minecraft.scoreboard.ScoreObjective)(p0)).b();
    spill233_17 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue();
    if (!((life4_7 == null))) {
        lexicalValue233_338_0 = ((spill233_17) ? 1 : 0);
        break lexical_join_338;
    }
    if (!(spill233_17)) {
        break lexical_join_345;
    }
    spill233_18 = ((java.lang.String)(((java.lang.String)(((java.lang.String)(life26_328)).replaceAll(((java.lang.String)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_96(2357, (8676497944356483612L ^ life2_3)))), ((java.lang.String)(""))))).replaceAll(((java.lang.String)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_98(15568, (1214655208710555642L ^ life2_3)))), ((java.lang.String)(""))))).replaceAll(((java.lang.String)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_100(9532, (1492091138676252166L ^ life2_3)))), ((java.lang.String)("")));
    if (!((life4_7 == null))) {
        lexicalValue233_344_0 = spill233_18;
        break lexical_join_344;
    }
    lexicalValue233_338_0 = ((((java.lang.String)(spill233_18)).equals(((java.lang.Object)(((com.moon.setting.StringListSetting)(this.t)).getValue())))) ? 1 : 0);
    }
    if (!((lexicalValue233_338_0 != 0))) {
        break lexical_join_345;
    }
    lexicalValue233_344_0 = __sourceIntrinsic_9132ceb2c887_invokedynamic233_106(19162, (4270956235752878591L ^ life2_3));
    }
    life26_328 = lexicalValue233_344_0;
    }
    ((com.moon.jm)(life7_14)).a(((com.moon.hW)(this.z)), ((java.lang.String)(life26_328)), ((float)(life5_6)), ((float)(((((float) life17_159) + (life12_70 / 0x1.0p1f)) - (((com.moon.jm)(life7_14)).a(((java.lang.String)(life26_328)), ((float)(life5_6))) / 0x1.0p1f)))), ((float)((((float) life24_198) - life13_118))), ((int)(-1)), ((boolean)(true)));
    }
    if (!((life4_7 != null))) { continue lexical_cycle_159; }
    break lexical_cycle_159;
    }
    }
    lexicalValue233_373_0 = 0x1.8p1f;
    }
    life19_409 = lexicalValue233_373_0;
    this.H = ((float)((((float) life17_159) - life19_409)));
    this.I = ((float)((((((float) life15_143) - (((float) life18_161) * life13_118)) - life13_118) - life19_409)));
    life20_443 = (((((float) ((((moom.ir)(life8_16)).a__Int() - life16_145) + 2)) - this.H) - life6_9) + life19_409);
    life21_455 = ((((float) (((java.util.Collection)(life10_57)).size() + 1)) * life13_118) + (life19_409 * 0x1.0p1f));
    ((com.moon.hW)(this.A)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.H)), ((float)(this.I)), ((float)(life20_443)), ((float)(life21_455)), ((float)(0x1.0p2f)), ((int)(__sourceIntrinsic_9132ceb2c887_invokedynamic233_118(5417, (6896887229679498253L ^ life2_3))))))));
    ((com.moon.hW)(this.B)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.H)), ((float)(this.I)), ((float)(life20_443)), ((float)(life21_455)), ((float)(0x1.0p2f)), ((int)(((java.awt.Color)(java.awt.Color.BLACK)).getRGB()))))));
    return;
}


public void a(com.moon.event.Render2DEvent p0) {
com.moon.module.impl.CustomMinecraft forwardValue821_12_0;
    com.moon.hW forwardValue821_43_0;
    com.moon.hW forwardValue821_52_0;
    java.lang.Object forwardValue821_88_0;
    int forwardValue821_105_0;
    com.moon.module.impl.CustomMinecraft forwardValue821_116_0;
    com.moon.event.RenderPhase forwardValue821_123_0;
    com.moon.event.RenderPhase forwardValue821_123_1;
    com.moon.module.impl.CustomMinecraft forwardValue821_130_0;
    com.moon.module.impl.CustomMinecraft spill821_0;
    com.moon.event.RenderPhase spill821_1;
    com.moon.event.RenderPhase spill821_2;
    com.moon.hW spill821_3;
    boolean spill821_4;
    com.moon.module.impl.CustomMinecraft spill821_5;
    com.moon.module.impl.CustomMinecraft spill821_6;
    com.moon.module.impl.CustomMinecraft spill821_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.moon.jm life5_43;
    forward_join_131: {
    forward_join_130: {
    forward_join_123: {
    forward_join_120: {
    forward_join_116: {
    forward_join_115: {
    forward_join_105: {
    forward_join_98: {
    forward_join_88: {
    forward_join_59: {
    forward_join_52: {
    forward_join_50: {
    forward_join_43: {
    forward_join_41: {
    forward_join_18: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 116817826260983L);
    life4_5 = com.moon.bY.b();
    spill821_0 = this;
    if (!((life4_5 == null))) {
        forwardValue821_12_0 = spill821_0;
        break forward_join_12;
    }
    if (!((((com.moon.module.impl.CustomMinecraft)(spill821_0)).w == null))) {
        break forward_join_18;
    }
    forwardValue821_12_0 = this;
    }
    ((com.moon.module.impl.CustomMinecraft)(forwardValue821_12_0)).w = ((com.moon.module.impl.Camera)(((com.moon.module.impl.Camera)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.Camera.class)))))));
    }
    spill821_1 = ((com.moon.event.Render2DEvent)(p0)).getPhase();
    spill821_2 = com.moon.event.RenderPhase.PRE;
    if (!((life4_5 == null))) {
        forwardValue821_123_0 = spill821_1;
        forwardValue821_123_1 = spill821_2;
        break forward_join_123;
    }
    if (!((spill821_1 == spill821_2))) {
        break forward_join_120;
    }
    if (!(this.y)) {
        break forward_join_131;
    }
    life5_43 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.INTER_MEDIUM)));
    spill821_3 = this.z;
    if (!((life4_5 == null))) {
        forwardValue821_43_0 = spill821_3;
        break forward_join_43;
    }
    if (!((spill821_3 != null))) {
        break forward_join_41;
    }
    ((com.moon.hY)(((com.moon.hW)(this.z)).a__hY())).g();
    }
    forwardValue821_43_0 = this.A;
    }
    if (!((life4_5 == null))) {
        forwardValue821_52_0 = forwardValue821_43_0;
        break forward_join_52;
    }
    if (!((forwardValue821_43_0 != null))) {
        break forward_join_50;
    }
    ((com.moon.hY)(((com.moon.hW)(this.A)).a__hY())).g();
    }
    forwardValue821_52_0 = this.B;
    }
    if (!((life4_5 == null))) {
        forwardValue821_88_0 = forwardValue821_52_0;
        break forward_join_88;
    }
    if (!((forwardValue821_52_0 != null))) {
        break forward_join_59;
    }
    ((com.moon.hY)(((com.moon.hW)(this.B)).a__hY())).g();
    }
    this.z = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life5_43))))).c())).a__hX())).a()));
    this.A = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).c())).a__hX())).a()));
    this.B = ((com.moon.hW)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).c())).a__hX())).a()));
    forwardValue821_88_0 = ((com.moon.setting.BooleanSetting)(this.v)).getValue();
    }
    spill821_4 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue821_88_0)))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue821_105_0 = ((spill821_4) ? 1 : 0);
        break forward_join_105;
    }
    if (!(spill821_4)) {
        break forward_join_98;
    }
    ((com.moon.module.impl.CustomMinecraft)(this)).a(((int)(((net.minecraft.client.gui.GuiIngame)(((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).T)).a())));
    }
    spill821_5 = this;
    if (!((life4_5 == null))) {
        forwardValue821_116_0 = spill821_5;
        break forward_join_116;
    }
    forwardValue821_105_0 = ((((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(((com.moon.module.impl.CustomMinecraft)(spill821_5)).u)).getValue())))).booleanValue()) ? 1 : 0);
    }
    if (!((forwardValue821_105_0 != 0))) {
        break forward_join_115;
    }
    spill821_6 = this;
    if (!((life4_5 == null))) {
        forwardValue821_116_0 = spill821_6;
        break forward_join_116;
    }
    if (!((((com.moon.module.impl.CustomMinecraft)(spill821_6)).C != null))) {
        break forward_join_115;
    }
    ((com.moon.module.impl.CustomMinecraft)(this)).a(((net.minecraft.scoreboard.ScoreObjective)(this.C)));
    }
    forwardValue821_116_0 = this;
    }
    ((com.moon.module.impl.CustomMinecraft)(forwardValue821_116_0)).y = ((boolean)(false));
    if (!((life4_5 != null))) {
        break forward_join_131;
    }
    }
    forwardValue821_123_0 = ((com.moon.event.Render2DEvent)(p0)).getPhase();
    forwardValue821_123_1 = com.moon.event.RenderPhase.POST;
    }
    if (!((forwardValue821_123_0 == forwardValue821_123_1))) {
        break forward_join_131;
    }
    spill821_7 = this;
    if (!((life4_5 == null))) {
        forwardValue821_130_0 = spill821_7;
        break forward_join_130;
    }
    if (!(((com.moon.module.impl.CustomMinecraft)(spill821_7)).c__Boolean())) {
        break forward_join_131;
    }
    forwardValue821_130_0 = this;
    }
    ((com.moon.module.impl.CustomMinecraft)(forwardValue821_130_0)).f__Void();
    }
    return;
}


public com.moon.hW a() {
return this.z;
}


public net.minecraft.scoreboard.ScoreObjective a__Bg() {
return this.C;
}


public com.moon.module.impl.Effects a__lU() {
return this.x;
}


private void g() {
net.minecraft.client.gui.GuiIngame forwardValue824_13_0;
    net.minecraft.client.gui.GuiIngame spill824_0;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_15: {
    forward_join_13: {
    life1_3 = (com.moon.module.impl.CustomMinecraft.J ^ 85645185678111L);
    life3_5 = com.moon.bY.b();
    spill824_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).T;
    if (!((life3_5 == null))) {
        forwardValue824_13_0 = spill824_0;
        break forward_join_13;
    }
    if (!((spill824_0 != null))) {
        break forward_join_15;
    }
    forwardValue824_13_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).T;
    }
    ((moom.gB)(((net.minecraft.client.gui.GuiIngame)(forwardValue824_13_0)).a__gB())).b__Void();
    }
    return;
}


private static void lambda$new$0(java.lang.Boolean p0, java.lang.Boolean p1) {
net.minecraft.client.gui.GuiIngame forwardValue825_13_0;
    net.minecraft.client.gui.GuiIngame spill825_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_15: {
    forward_join_13: {
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 106355463313496L);
    life4_5 = com.moon.bY.b();
    spill825_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).T;
    if (!((life4_5 == null))) {
        forwardValue825_13_0 = spill825_0;
        break forward_join_13;
    }
    if (!((spill825_0 != null))) {
        break forward_join_15;
    }
    forwardValue825_13_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.CustomMinecraft.d)).T;
    }
    ((moom.gB)(((net.minecraft.client.gui.GuiIngame)(forwardValue825_13_0)).a__gB())).b__Void();
    }
    return;
}


private void lambda$new$1(com.moon.gX p0) {
long life2_3;
    life2_3 = (com.moon.module.impl.CustomMinecraft.J ^ 95728367925300L);
    terminal_cycle_4: while (true) {
        ((com.moon.gX)(p0)).a(((int)(__sourceIntrinsic_5288cb3cd114_invokedynamic237_1(15234, (452122296075986398L ^ life2_3)))));
        this.y = ((boolean)(true));
        continue terminal_cycle_4;
    }
}


private static boolean lambda$uploadScoreboardBuffers$2(net.minecraft.scoreboard.Score p0) {
java.lang.String forwardValue827_13_0;
    int forwardValue827_19_0;
    int forwardValue827_21_0;
    java.lang.String spill827_0;
    boolean spill827_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_13: {
    life1_3 = (com.moon.module.impl.CustomMinecraft.J ^ 8173265329853L);
    life3_5 = com.moon.bY.b();
    spill827_0 = ((net.minecraft.scoreboard.Score)(p0)).a__String();
    if (!((life3_5 == null))) {
        forwardValue827_13_0 = spill827_0;
        break forward_join_13;
    }
    if (!((spill827_0 != null))) {
        break forward_join_20;
    }
    forwardValue827_13_0 = ((net.minecraft.scoreboard.Score)(p0)).a__String();
    }
    spill827_1 = ((java.lang.String)(forwardValue827_13_0)).startsWith(((java.lang.String)("#")));
    if (!((life3_5 == null))) {
        forwardValue827_19_0 = ((spill827_1) ? 1 : 0);
        break forward_join_19;
    }
    if (!((!spill827_1))) {
        break forward_join_20;
    }
    forwardValue827_19_0 = 1;
    }
    forwardValue827_21_0 = forwardValue827_19_0;
    break forward_join_21;
    }
    forwardValue827_21_0 = 0;
    }
    return ((forwardValue827_21_0) != 0);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_11(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_21(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Supplier __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_32(com.moon.setting.BooleanSetting a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_37(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_40(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_48(int a0, long a1) throws E;

private static native <E extends Throwable> com.moon.kR __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_50() throws E;

private static native <E extends Throwable> java.lang.Runnable __sourceIntrinsic_e9d8e2b871fbb4f4_originalDynamicSite4_55(com.moon.module.impl.CustomMinecraft a0, com.moon.gX a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2442_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2443_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic232_32(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic232_34(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic232_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_b4a3d886a4d9_invokedynamic232_45(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_9132ceb2c887_invokedynamic233_10() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9132ceb2c887_invokedynamic233_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9132ceb2c887_invokedynamic233_19(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_34(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_35(java.lang.String a0, java.lang.String a1, net.minecraft.util.EnumChatFormatting a2, int a3) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_55(net.minecraft.util.EnumChatFormatting a0, int a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_64(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_66(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_68(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_74(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_96(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_98(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_100(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9132ceb2c887_invokedynamic233_106(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9132ceb2c887_invokedynamic233_118(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_5288cb3cd114_invokedynamic237_1(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
