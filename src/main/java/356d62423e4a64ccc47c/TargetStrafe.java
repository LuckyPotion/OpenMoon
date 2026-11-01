package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TargetStrafe extends com.moon.module.Module {

private com.moon.setting.FloatSetting s;

private com.moon.setting.IntegerSetting t;

private com.moon.setting.BooleanSetting u;

private com.moon.setting.BooleanSetting v;

private java.util.List<com.moon.gw> w;

private com.moon.gw x;

private net.minecraft.entity.EntityLivingBase y;

private int z;

private com.moon.module.impl.KillAura A;

private static long B;

private static java.lang.String[] C;

private static java.lang.String[] D;

private static java.util.Map E;

private static long[] F;

private static java.lang.Integer[] G;

private static java.util.Map H;

public TargetStrafe(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_56634c39e033d7dc(com.moon.module.impl.TargetStrafe receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.TargetStrafe.B ^ 7284560964624L);

    com.moon.module.impl.TargetStrafe.__sourceConstructorInit_56634c39e033d7dc_0(((com.moon.module.impl.TargetStrafe)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.TargetStrafe)(receiver)).s = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_2(2846, (2986511414975104130L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_4(29578, (3945903174248496148L ^ local5)))), ((float)(0x1.8p0f)), ((float)(0x1.0p-1f)), ((float)(0x1.0p2f)), ((float)(0x1.99999ap-4f))))).a()));

    ((com.moon.module.impl.TargetStrafe)(receiver)).t = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_8(8410, (7887365840640388931L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_10(28713, (7298355084380372916L ^ local5)))), ((int)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_11(31042, (5624032054615067399L ^ local5)))), ((int)(5)), ((int)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_12(9274, (9202172055312504445L ^ local5)))), ((int)(1))))).a()));

    ((com.moon.module.impl.TargetStrafe)(receiver)).u = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_16(13182, (3311170940958031076L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_18(12031, (1860015994825253216L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.TargetStrafe)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_22(5308, (6500876801698044708L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_24(16584, (9023520890521669459L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.TargetStrafe)(receiver)).w = ((java.util.List)(new java.util.ArrayList()));

    ((com.moon.module.impl.TargetStrafe)(receiver)).z = ((int)(1));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_56634c39e033d7dc_0(com.moon.module.impl.TargetStrafe a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
B = ((long)(((moom._a)(moom._c.a(((long)(5561943216856700188L)), ((long)(875199154983740244L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(170318310866030L)))));
    E = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.TargetStrafe.B ^ 117670582002072L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill291_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill291_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill291_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill291_14 = new byte[8];
    (__sourceSpill291_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill291_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation291_16 = __sourceSpill291_14;
    ((javax.crypto.Cipher)(__sourceSpill291_11)).init(((int)(__sourceSpill291_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill291_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation291_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[8];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "\032ìµ!\000¬~ÈD¹\020\004\016bâ#\020À\036òe\017\031D4\025÷L@¿§#\030\013\013ôH\037­-#5¾ ´_Î\\Ö?¡ñX[\020·-W\037àÍÊ_\003«l7®Õ\020B=YoîÈ¼!©F|T\022n\030ðöâØ\030ù'¿J\037¶O1n¾U$¦"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill291_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill291_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill291_29)).doFinal(((byte[])(__sourceSpill291_28)));
        java.lang.String __sourceSpill291_34 = ((java.lang.String)(com.moon.module.impl.TargetStrafe.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill291_35 = local20_life19;
        int __sourceSpill291_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill291_35)[__sourceSpill291_36] = __sourceSpill291_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "0\006«íXÂ²\036\\u·$6\025÷ä§Â¸eà -[\017-ÝÈ_%ñ\000\bÕ\027 #Û:+´ÏÈ~3®Hsi¸Z"))).length();
    local16_life24 = 24;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill291_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill291_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill291_42)).doFinal(((byte[])(__sourceSpill291_41)));
        java.lang.String __sourceSpill291_47 = ((java.lang.String)(com.moon.module.impl.TargetStrafe.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill291_48 = local20_life19;
        int __sourceSpill291_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill291_48)[__sourceSpill291_49] = __sourceSpill291_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    C = ((java.lang.String[])(local20_life19));
    D = ((java.lang.String[])(new java.lang.String[8]));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill291_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill291_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill291_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill291_60 = new byte[8];
    (__sourceSpill291_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill291_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation291_62 = __sourceSpill291_60;
    ((javax.crypto.Cipher)(__sourceSpill291_57)).init(((int)(__sourceSpill291_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill291_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation291_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[4];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "a2c²c`h;\\\0045\036ß§g"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill291_71 = local4_life67;
        int __sourceSpill291_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill291_71)).substring(((int)(__sourceSpill291_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill291_76 = local6_life65;
        int __sourceSpill291_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill291_79 = new byte[8];
        (__sourceSpill291_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill291_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill291_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill291_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill291_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill291_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill291_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill291_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill291_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill291_80)).doFinal(((byte[])(__sourceSpill291_79)));
        (__sourceSpill291_76)[__sourceSpill291_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    local5_life69 = ((java.lang.String)((local4_life67 = "U¡|\n\004ñXòÿ\022LÒ"))).length();
    local2_life70 = 0;
    do {
        java.lang.String __sourceSpill291_84 = local4_life67;
        int __sourceSpill291_85 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life88 = ((java.lang.String)(((java.lang.String)(__sourceSpill291_84)).substring(((int)(__sourceSpill291_85)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill291_89 = local6_life65;
        int __sourceSpill291_90 = local3_life66;
        local3_life66 += 1;
        long local8_life91 = (((((((((((long) (local7_life88)[0]) & 255L) << 56) | ((((long) (local7_life88)[1]) & 255L) << 48)) | ((((long) (local7_life88)[2]) & 255L) << 40)) | ((((long) (local7_life88)[3]) & 255L) << 32)) | ((((long) (local7_life88)[4]) & 255L) << 24)) | ((((long) (local7_life88)[5]) & 255L) << 16)) | ((((long) (local7_life88)[6]) & 255L) << 8)) | (((long) (local7_life88)[7]) & 255L));
        byte[] __sourceSpill291_92 = new byte[8];
        (__sourceSpill291_92)[0] = ((byte) ((int) (local8_life91 >>> 56)));
        (__sourceSpill291_92)[1] = ((byte) ((int) (local8_life91 >>> 48)));
        (__sourceSpill291_92)[2] = ((byte) ((int) (local8_life91 >>> 40)));
        (__sourceSpill291_92)[3] = ((byte) ((int) (local8_life91 >>> 32)));
        (__sourceSpill291_92)[4] = ((byte) ((int) (local8_life91 >>> 24)));
        (__sourceSpill291_92)[5] = ((byte) ((int) (local8_life91 >>> 16)));
        (__sourceSpill291_92)[6] = ((byte) ((int) (local8_life91 >>> 8)));
        (__sourceSpill291_92)[7] = ((byte) ((int) local8_life91));
        javax.crypto.Cipher __sourceSpill291_93 = local0_life55;
        byte[] local10_life95 = ((javax.crypto.Cipher)(__sourceSpill291_93)).doFinal(((byte[])(__sourceSpill291_92)));
        (__sourceSpill291_89)[__sourceSpill291_90] = (((((((((((long) (local10_life95)[0]) & 255L) << 56) | ((((long) (local10_life95)[1]) & 255L) << 48)) | ((((long) (local10_life95)[2]) & 255L) << 40)) | ((((long) (local10_life95)[3]) & 255L) << 32)) | ((((long) (local10_life95)[4]) & 255L) << 24)) | ((((long) (local10_life95)[5]) & 255L) << 16)) | ((((long) (local10_life95)[6]) & 255L) << 8)) | (((long) (local10_life95)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    F = ((long[])(local6_life65));
    G = ((java.lang.Integer[])(new java.lang.Integer[4]));
}


private boolean b(moom.DR p0) {
int lexicalValue253_49_0;
    int lexicalValue253_51_0;
    int lexicalValue253_59_0;
    int[] spill253_0;
    boolean spill253_1;
    int spill253_2;
    long life2_3;
    double life5_7;
    double life7_11;
    int[] life4_12;
    net.minecraft.block.state.IBlockState life9_29;
    lexical_join_59: {
    lexical_join_58: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 120121957034511L);
    spill253_0 = com.moon.bx.b();
    life5_7 = ((moom.DR)(p0)).b;
    life7_11 = (life5_7 - 0x1.999999999999ap-4d);
    life4_12 = spill253_0;
    lexical_cycle_13: while (true) {
    lexical_join_56: {
    lexical_join_52: {
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((recovery.source.CarrierOps.dcmpl(((double)(life7_11)), ((double)(0x0.0p0d))) > 0))) {
        break lexical_join_58;
    }
    life9_29 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).I)).a__fE(((moom.DT)(new moom.DT(((moom.DR)(p0)).a, java.lang.Math.floor(((double)(life7_11))), ((moom.DR)(p0)).c))));
    if (!((life4_12 == null))) {
        break lexical_join_56;
    }
    spill253_1 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life9_29)).a__ch())).a(((net.minecraft.block.state.IBlockState)(life9_29)), ((boolean)(false)));
    if (!((life4_12 == null))) {
        lexicalValue253_59_0 = ((spill253_1) ? 1 : 0);
        break lexical_join_59;
    }
    if (!(spill253_1)) {
        break lexical_join_52;
    }
    spill253_2 = recovery.source.CarrierOps.dcmpl(((double)((life5_7 - life7_11))), ((double)(0x1.8p1d)));
    if (!((life4_12 == null))) {
        lexicalValue253_49_0 = spill253_2;
        break lexical_join_49;
    }
    if (!((spill253_2 > 0))) {
        break lexical_join_50;
    }
    lexicalValue253_49_0 = 1;
    }
    lexicalValue253_51_0 = lexicalValue253_49_0;
    break lexical_join_51;
    }
    lexicalValue253_51_0 = 0;
    }
    return ((lexicalValue253_51_0) != 0);
    }
    life7_11 = (life7_11 - 0x1.0p0d);
    }
    if (!((life4_12 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue253_59_0 = 1;
    }
    return ((lexicalValue253_59_0) != 0);
}


private com.moon.gw b(java.util.List<com.moon.gw> p0) {
com.moon.gw lexicalValue252_28_0;
    double lexicalValue252_43_0;
    com.moon.gw lexicalValue252_47_0;
    int[] spill252_0;
    com.moon.gw spill252_1;
    double spill252_2;
    long life2_3;
    double life5_6;
    com.moon.gw life7_8;
    int[] life4_9;
    java.util.Iterator life8_12;
    com.moon.gw life9_19;
    double life10_42;
    lexical_join_47: {
    lexical_join_46: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 16366064868203L);
    spill252_0 = com.moon.bx.b();
    life5_6 = 0x1.fffffffcp30d;
    life7_8 = null;
    life4_9 = spill252_0;
    life8_12 = ((java.util.List)(p0)).iterator();
    lexical_cycle_13: while (true) {
    lexical_join_44: {
    lexical_join_43: {
    lexical_join_28: {
    if (!(((java.util.Iterator)(life8_12)).hasNext())) {
        break lexical_join_46;
    }
    life9_19 = ((com.moon.gw)(((java.util.Iterator)(life8_12)).next()));
    spill252_1 = life9_19;
    if (!((life4_9 == null))) {
        lexicalValue252_47_0 = spill252_1;
        break lexical_join_47;
    }
    if (!((life4_9 == null))) {
        lexicalValue252_28_0 = spill252_1;
        break lexical_join_28;
    }
    if (!(((com.moon.gw)(spill252_1)).a__Boolean())) {
        break lexical_join_44;
    }
    lexicalValue252_28_0 = life9_19;
    }
    life10_42 = ((moom.DR)(((com.moon.gw)(lexicalValue252_28_0)).c())).b(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).K)).a__DR())));
    spill252_2 = life10_42;
    if (!((life4_9 == null))) {
        lexicalValue252_43_0 = spill252_2;
        break lexical_join_43;
    }
    if (!((recovery.source.CarrierOps.dcmpg(((double)(spill252_2)), ((double)(life5_6))) < 0))) {
        break lexical_join_44;
    }
    life7_8 = life9_19;
    lexicalValue252_43_0 = life10_42;
    }
    life5_6 = lexicalValue252_43_0;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    lexicalValue252_47_0 = life7_8;
    }
    return lexicalValue252_47_0;
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
        byte[] spill1238_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1238_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1238_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1238_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1238_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1238_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 23157);
    if (((com.moon.module.impl.TargetStrafe.D)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.TargetStrafe.E)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.TargetStrafe.E)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lw", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.TargetStrafe.C)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.TargetStrafe.D)[life5_8] = com.moon.module.impl.TargetStrafe.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.TargetStrafe.D)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.TargetStrafe.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2706_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private void f() {
com.moon.module.impl.TargetStrafe forwardValue955_12_0;
    com.moon.module.impl.TargetStrafe spill955_0;
    long life1_3;
    int[] life3_5;
    forward_join_18: {
    forward_join_12: {
    life1_3 = (com.moon.module.impl.TargetStrafe.B ^ 29116006688810L);
    life3_5 = com.moon.bx.b();
    spill955_0 = this;
    if (!((life3_5 == null))) {
        forwardValue955_12_0 = spill955_0;
        break forward_join_12;
    }
    if (!((((com.moon.module.impl.TargetStrafe)(spill955_0)).A == null))) {
        break forward_join_18;
    }
    forwardValue955_12_0 = this;
    }
    ((com.moon.module.impl.TargetStrafe)(forwardValue955_12_0)).A = ((com.moon.module.impl.KillAura)(((com.moon.module.impl.KillAura)(((com.moon.fU)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__fU())).a(((java.lang.Class)(com.moon.module.impl.KillAura.class)))))));
    }
    return;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.TargetStrafe.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26540;
      if (G[var3] == null) {
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
         long var5 = F[var3];
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
         Object[] var9 = (Object[])H.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               H.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2708_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.event.MotionEvent p0) {
int forwardValue948_22_0;
    int forwardValue948_24_0;
    com.moon.module.impl.TargetStrafe forwardValue948_31_0;
    boolean spill948_0;
    boolean spill948_1;
    com.moon.module.impl.TargetStrafe spill948_2;
    long life2_3;
    int[] life4_5;
    int life5_33;
    float life6_69;
    double life7_87;
    double life9_104;
    forward_join_108: {
    forward_join_31: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 130050821310349L);
    life4_5 = com.moon.bx.b();
    spill948_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue948_22_0 = ((spill948_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill948_0)) {
        break forward_join_21;
    }
    spill948_1 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).W)).ap)).a__Boolean();
    if (!((life4_5 == null))) {
        forwardValue948_22_0 = ((spill948_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill948_1)) {
        break forward_join_23;
    }
    }
    forwardValue948_22_0 = 1;
    }
    forwardValue948_24_0 = forwardValue948_22_0;
    break forward_join_24;
    }
    forwardValue948_24_0 = 0;
    }
    life5_33 = forwardValue948_24_0;
    spill948_2 = this;
    if (!((life4_5 == null))) {
        forwardValue948_31_0 = spill948_2;
        break forward_join_31;
    }
    if (!((((com.moon.module.impl.TargetStrafe)(spill948_2)).y != null))) {
        break forward_join_108;
    }
    forwardValue948_31_0 = this;
    }
    if (!((((com.moon.module.impl.TargetStrafe)(forwardValue948_31_0)).x != null))) {
        break forward_join_108;
    }
    if (!((life5_33 != 0))) {
        break forward_join_108;
    }
    life6_69 = (((com.moon.module.impl.TargetStrafe)(this)).a(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(this.y)).a__DR()))) + ((float) (__sourceIntrinsic_ec6de7cefe2c_invokedynamic948_17(1443, (3532505776617577592L ^ life2_3)) * (-this.z))));
    life7_87 = (((double) ((-moom.Dr.a(((float)(((float) java.lang.Math.toRadians(((double)(((double) life6_69))))))))) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())) + ((net.minecraft.entity.EntityLivingBase)(this.y)).n);
    life9_104 = (((double) (moom.Dr.b(((float)(((float) java.lang.Math.toRadians(((double)(((double) life6_69)))))))) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())) + ((net.minecraft.entity.EntityLivingBase)(this.y)).p);
    ((com.moon.event.MotionEvent)(p0)).a(((float)(0x1.0p0f)));
    ((com.moon.event.MotionEvent)(p0)).b(((float)(0x0.0p0f)));
    ((com.moon.event.MotionEvent)(p0)).c(((float)(((com.moon.module.impl.TargetStrafe)(this)).a(((moom.DR)(new moom.DR(life7_87, ((net.minecraft.entity.EntityLivingBase)(this.y)).o, life9_104)))))));
    }
    return;
}


public void a(com.moon.eo p0) {
int forwardValue947_22_0;
    int forwardValue947_24_0;
    com.moon.module.impl.TargetStrafe forwardValue947_31_0;
    boolean spill947_0;
    boolean spill947_1;
    com.moon.module.impl.TargetStrafe spill947_2;
    long life2_3;
    int[] life4_5;
    int life5_33;
    float life6_69;
    double life7_87;
    double life9_104;
    forward_join_108: {
    forward_join_31: {
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 22146669168906L);
    life4_5 = com.moon.bx.b();
    spill947_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.u)).getValue())))).booleanValue();
    if (!((life4_5 == null))) {
        forwardValue947_22_0 = ((spill947_0) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill947_0)) {
        break forward_join_21;
    }
    spill947_1 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).W)).ap)).a__Boolean();
    if (!((life4_5 == null))) {
        forwardValue947_22_0 = ((spill947_1) ? 1 : 0);
        break forward_join_22;
    }
    if (!(spill947_1)) {
        break forward_join_23;
    }
    }
    forwardValue947_22_0 = 1;
    }
    forwardValue947_24_0 = forwardValue947_22_0;
    break forward_join_24;
    }
    forwardValue947_24_0 = 0;
    }
    life5_33 = forwardValue947_24_0;
    spill947_2 = this;
    if (!((life4_5 == null))) {
        forwardValue947_31_0 = spill947_2;
        break forward_join_31;
    }
    if (!((((com.moon.module.impl.TargetStrafe)(spill947_2)).y != null))) {
        break forward_join_108;
    }
    forwardValue947_31_0 = this;
    }
    if (!((((com.moon.module.impl.TargetStrafe)(forwardValue947_31_0)).x != null))) {
        break forward_join_108;
    }
    if (!((life5_33 != 0))) {
        break forward_join_108;
    }
    life6_69 = (((com.moon.module.impl.TargetStrafe)(this)).a(((moom.DR)(((net.minecraft.entity.EntityLivingBase)(this.y)).a__DR()))) + ((float) (__sourceIntrinsic_a51a63b9419a_invokedynamic947_17(10001, (8441427254069719119L ^ life2_3)) * (-this.z))));
    life7_87 = (((double) ((-moom.Dr.a(((float)(((float) java.lang.Math.toRadians(((double)(((double) life6_69))))))))) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())) + ((net.minecraft.entity.EntityLivingBase)(this.y)).n);
    life9_104 = (((double) (moom.Dr.b(((float)(((float) java.lang.Math.toRadians(((double)(((double) life6_69)))))))) * ((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())) + ((net.minecraft.entity.EntityLivingBase)(this.y)).p);
    ((com.moon.eo)(p0)).a(((float)(0x1.0p0f)));
    ((com.moon.eo)(p0)).b(((float)(0x0.0p0f)));
    ((com.moon.eo)(p0)).c(((float)(((com.moon.module.impl.TargetStrafe)(this)).a(((moom.DR)(new moom.DR(life7_87, ((net.minecraft.entity.EntityLivingBase)(this.y)).o, life9_104)))))));
    }
    return;
}


public void a(com.moon.event.Render2DEvent p0) {
java.lang.Object lexicalValue250_17_0;
    com.moon.module.impl.TargetStrafe lexicalValue250_21_0;
    com.moon.module.impl.TargetStrafe lexicalValue250_26_0;
    com.moon.gw lexicalValue250_123_0;
    int lexicalValue250_131_0;
    com.moon.event.RenderPhase spill250_0;
    com.moon.module.impl.TargetStrafe spill250_1;
    com.moon.gw spill250_2;
    long life2_3;
    int[] life4_5;
    com.moon.hW life5_53;
    float life6_55;
    float life7_57;
    double life8_61;
    double life10_65;
    double life12_69;
    java.util.Iterator life14_73;
    com.moon.gw life15_80;
    moom.DR life16_83;
    double life17_86;
    double life19_89;
    double life21_92;
    moom.CA life23_129;
    int life24_159;
    com.moon.aO life25_164;
    lexical_join_150: {
    lexical_join_149: {
    lexical_join_147: {
    lexical_join_26: {
    lexical_join_21: {
    lexical_join_17: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 12042513256229L);
    life4_5 = com.moon.bx.b();
    spill250_0 = ((com.moon.event.Render2DEvent)(p0)).getPhase();
    if (!((life4_5 == null))) {
        lexicalValue250_17_0 = spill250_0;
        break lexical_join_17;
    }
    if (!((spill250_0 == com.moon.event.RenderPhase.POST))) {
        break lexical_join_150;
    }
    spill250_1 = this;
    if (!((life4_5 == null))) {
        lexicalValue250_21_0 = spill250_1;
        break lexical_join_21;
    }
    lexicalValue250_17_0 = ((com.moon.setting.BooleanSetting)(((com.moon.module.impl.TargetStrafe)(spill250_1)).v)).getValue();
    }
    if (!(((java.lang.Boolean)(((java.lang.Boolean)(lexicalValue250_17_0)))).booleanValue())) {
        break lexical_join_150;
    }
    lexicalValue250_21_0 = this;
    }
    if (!((life4_5 == null))) {
        lexicalValue250_26_0 = lexicalValue250_21_0;
        break lexical_join_26;
    }
    if (!((((com.moon.module.impl.TargetStrafe)(lexicalValue250_21_0)).y != null))) {
        break lexical_join_150;
    }
    lexicalValue250_26_0 = this;
    }
    if (!((((com.moon.module.impl.TargetStrafe)(lexicalValue250_26_0)).x != null))) {
        break lexical_join_150;
    }
    moom.kZ.o();
    moom.kZ.i();
    life5_53 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.WORLD))))).b())).a();
    life6_55 = 0x1.47ae14p-6f;
    life7_57 = 0x1.47ae14p-5f;
    life8_61 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).a__nw())).a();
    life10_65 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).a__nw())).b();
    life12_69 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).a__nw())).c();
    life14_73 = ((java.util.List)(this.w)).iterator();
    lexical_cycle_56: while (true) {
    lexical_join_131: {
    lexical_join_129: {
    lexical_join_123: {
    lexical_join_122: {
    if (!(((java.util.Iterator)(life14_73)).hasNext())) {
        break lexical_join_147;
    }
    life15_80 = ((com.moon.gw)(((java.util.Iterator)(life14_73)).next()));
    life16_83 = ((com.moon.gw)(life15_80)).a();
    life17_86 = ((moom.DR)(life16_83)).a;
    life19_89 = ((moom.DR)(life16_83)).b;
    life21_92 = ((moom.DR)(life16_83)).c;
    life23_129 = new moom.CA(((life17_86 - life8_61) - ((double) life6_55)), (life19_89 - life10_65), ((life21_92 - life12_69) - ((double) life6_55)), ((life17_86 - life8_61) + ((double) life6_55)), ((life19_89 - life10_65) + ((double) life7_57)), ((life21_92 - life12_69) + ((double) life6_55)));
    if (!((life4_5 == null))) {
        break lexical_join_149;
    }
    spill250_2 = life15_80;
    if (!((life4_5 == null))) {
        lexicalValue250_123_0 = spill250_2;
        break lexical_join_123;
    }
    if (!((!((com.moon.gw)(spill250_2)).a__Boolean()))) {
        break lexical_join_122;
    }
    lexicalValue250_131_0 = ((java.awt.Color)(java.awt.Color.RED)).getRGB();
    break lexical_join_131;
    }
    lexicalValue250_123_0 = life15_80;
    }
    if (!((lexicalValue250_123_0 == this.x))) {
        break lexical_join_129;
    }
    lexicalValue250_131_0 = ((java.awt.Color)(java.awt.Color.GREEN)).getRGB();
    break lexical_join_131;
    }
    lexicalValue250_131_0 = ((java.awt.Color)(java.awt.Color.WHITE)).getRGB();
    }
    life24_159 = lexicalValue250_131_0;
    life25_164 = new com.moon.aO(life24_159);
    ((com.moon.hW)(life5_53)).a(((com.moon.iX)(com.moon.i9.a(((moom.CA)(life23_129)), ((int)(((com.moon.aO)(((com.moon.aO)(life25_164)).a(((float)(0x1.0p-1f))))).getRGB()))))));
    if (!((life4_5 != null))) { continue lexical_cycle_56; }
    break lexical_cycle_56;
    }
    }
    ((com.moon.hW)(life5_53)).b();
    }
    moom.kZ.j();
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
int forwardValue949_37_0;
    boolean spill949_0;
    long life2_3;
    int[] life4_5;
    forward_join_61: {
    forward_join_41: {
    forward_join_37: {
    forward_join_33: {
    forward_join_20: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 6715874524162L);
    life4_5 = com.moon.bx.b();
    if (!((life4_5 == null))) {
        break forward_join_20;
    }
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_61;
    }
    ((com.moon.module.impl.TargetStrafe)(this)).f();
    this.y = ((net.minecraft.entity.EntityLivingBase)(((com.moon.gd)(((com.moon.module.impl.KillAura)(this.A)).a__gd())).a__sG()));
    }
    if (!((this.y != null))) {
        break forward_join_61;
    }
    spill949_0 = ((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).W)).am)).b__Boolean();
    if (!((life4_5 == null))) {
        forwardValue949_37_0 = ((spill949_0) ? 1 : 0);
        break forward_join_37;
    }
    if (!(spill949_0)) {
        break forward_join_33;
    }
    this.z = ((int)(1));
    }
    forwardValue949_37_0 = ((((moom.pz)(((net.minecraft.client.settings.GameSettings)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).W)).ao)).b__Boolean()) ? 1 : 0);
    }
    if (!((forwardValue949_37_0 != 0))) {
        break forward_join_41;
    }
    this.z = ((int)(-1));
    }
    ((com.moon.module.impl.TargetStrafe)(this)).a(((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.s)).getValue())))).floatValue())), ((int)(((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.t)).getValue())))).intValue())), ((net.minecraft.entity.EntityLivingBase)(this.y)));
    this.x = ((com.moon.gw)(((com.moon.module.impl.TargetStrafe)(this)).a(((java.util.List)(this.w)))));
    }
    return;
}


public float a(moom.DR p0) {
java.lang.Object local2 = ((moom.DR)(p0)).c__DR(((moom.DR)(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).K)).a__DR())).b(((double)(0x0.0p0d)), ((double)(((double) ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).K)).e__Float()))), ((double)(0x0.0p0d))))));
    return (((float) (moom.Dr.b(((double)(((moom.DR)(local2)).c)), ((double)(((moom.DR)(local2)).a))) * 0x1.ca5dc1a63c1f8p5d)) - 0x1.68p6f);
}


private com.moon.gw a(java.util.List<com.moon.gw> p0) {
int lexicalValue251_27_0;
    int lexicalValue251_54_0;
    int lexicalValue251_59_0;
    int lexicalValue251_78_0;
    int[] spill251_0;
    int spill251_1;
    int spill251_2;
    boolean spill251_3;
    long life2_3;
    com.moon.gw life5_8;
    int[] life4_9;
    int life6_18;
    int life8_34;
    int life9_37;
    int life10_39;
    int life11_49;
    com.moon.gw life7_83;
    lexical_join_27: {
    lexical_join_24: {
    lexical_join_14: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 97195462998139L);
    spill251_0 = com.moon.bx.b();
    life5_8 = ((com.moon.module.impl.TargetStrafe)(this)).b(((java.util.List)(p0)));
    life4_9 = spill251_0;
    if (!((life5_8 == null))) {
        break lexical_join_14;
    }
    return null;
    }
    life6_18 = ((java.util.List)(p0)).size();
    spill251_1 = life6_18;
    if (!((life4_9 == null))) {
        lexicalValue251_27_0 = spill251_1;
        break lexical_join_27;
    }
    if (!((spill251_1 == 1))) {
        break lexical_join_24;
    }
    return life5_8;
    }
    lexicalValue251_27_0 = ((java.util.List)(p0)).indexOf(((java.lang.Object)(life5_8)));
    }
    life8_34 = lexicalValue251_27_0;
    life9_37 = ((java.util.List)(p0)).size();
    life10_39 = 0;
    lexical_cycle_33: while (true) {
    lexical_join_78: {
    lexical_join_75: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_38: {
    if (!((life10_39 > life9_37))) {
        break lexical_join_38;
    }
    return null;
    }
    life11_49 = (life8_34 + this.z);
    spill251_2 = life11_49;
    if (!((life4_9 == null))) {
        lexicalValue251_54_0 = spill251_2;
        break lexical_join_54;
    }
    if (!((spill251_2 < 0))) {
        break lexical_join_53;
    }
    life11_49 = (life9_37 - 1);
    if (!((life4_9 != null))) {
        break lexical_join_60;
    }
    }
    lexicalValue251_54_0 = life11_49;
    }
    if (!((life4_9 == null))) {
        lexicalValue251_59_0 = lexicalValue251_54_0;
        break lexical_join_59;
    }
    if (!((lexicalValue251_54_0 >= life9_37))) {
        break lexical_join_60;
    }
    lexicalValue251_59_0 = 0;
    }
    life11_49 = lexicalValue251_59_0;
    }
    life7_83 = ((com.moon.gw)(((java.util.List)(p0)).get(((int)(life11_49)))));
    spill251_3 = ((com.moon.gw)(life7_83)).a__Boolean();
    if (!((life4_9 == null))) {
        lexicalValue251_78_0 = ((spill251_3) ? 1 : 0);
        break lexical_join_78;
    }
    if (!((!spill251_3))) {
        break lexical_join_75;
    }
    this.z = ((int)((-this.z)));
    }
    life10_39 += 1;
    lexicalValue251_78_0 = ((((com.moon.gw)(life7_83)).a__Boolean()) ? 1 : 0);
    }
    if (!((lexicalValue251_78_0 != 0))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    return life7_83;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean a__Boolean(moom.DR p0) {
net.minecraft.util.MovingObjectPosition forwardValue952_22_0;
    int forwardValue952_51_0;
    int forwardValue952_55_0;
    int forwardValue952_89_0;
    int forwardValue952_93_0;
    int forwardValue952_95_0;
    int[] spill952_0;
    net.minecraft.util.MovingObjectPosition spill952_1;
    boolean spill952_2;
    boolean spill952_3;
    boolean spill952_4;
    long life2_3;
    net.minecraft.util.MovingObjectPosition life5_15;
    int[] life4_16;
    moom.DT life6_36;
    net.minecraft.block.state.IBlockState life7_41;
    moom.DT life8_75;
    net.minecraft.block.state.IBlockState life9_80;
    forward_join_95: {
    forward_join_94: {
    forward_join_93: {
    forward_join_89: {
    forward_join_86: {
    forward_join_56: {
    forward_join_55: {
    forward_join_51: {
    forward_join_27: {
    forward_join_22: {
    life2_3 = (com.moon.module.impl.TargetStrafe.B ^ 75332193233987L);
    spill952_0 = com.moon.bx.b();
    life5_15 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).I)).a(((moom.DR)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).K)).a__DR())), ((moom.DR)(p0)), ((boolean)(false)), ((boolean)(true)), ((boolean)(false)));
    life4_16 = spill952_0;
    spill952_1 = life5_15;
    if (!((life4_16 == null))) {
        forwardValue952_22_0 = spill952_1;
        break forward_join_22;
    }
    if (!((spill952_1 != null))) {
        break forward_join_27;
    }
    forwardValue952_22_0 = life5_15;
    }
    if (!((((net.minecraft.util.MovingObjectPosition)(forwardValue952_22_0)).b == net.minecraft.util.MovingObjectPosition$MovingObjectType.BLOCK))) {
        break forward_join_27;
    }
    return ((0) != 0);
    }
    life6_36 = new moom.DT(p0);
    life7_41 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).I)).a__fE(((moom.DT)(life6_36)));
    spill952_2 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life7_41)).a__ch())).a(((net.minecraft.block.state.IBlockState)(life7_41)), ((boolean)(false)));
    if (!((life4_16 == null))) {
        forwardValue952_51_0 = ((spill952_2) ? 1 : 0);
        break forward_join_51;
    }
    if (!(spill952_2)) {
        break forward_join_56;
    }
    forwardValue952_51_0 = ((((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life7_41)).a__ch())).a__Boolean(((net.minecraft.world.IBlockAccess)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).I)), ((moom.DT)(life6_36)))) ? 1 : 0);
    }
    if (!((life4_16 == null))) {
        forwardValue952_55_0 = forwardValue952_51_0;
        break forward_join_55;
    }
    if (!((forwardValue952_51_0 == 0))) {
        break forward_join_56;
    }
    forwardValue952_55_0 = 0;
    }
    return ((forwardValue952_55_0) != 0);
    }
    life8_75 = ((moom.DT)(life6_36)).a(((int)(0)), ((int)(1)), ((int)(0)));
    life9_80 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).I)).a__fE(((moom.DT)(life8_75)));
    spill952_3 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life9_80)).a__ch())).a(((net.minecraft.block.state.IBlockState)(life7_41)), ((boolean)(false)));
    if (!((life4_16 == null))) {
        forwardValue952_89_0 = ((spill952_3) ? 1 : 0);
        break forward_join_89;
    }
    if (!(spill952_3)) {
        break forward_join_86;
    }
    spill952_4 = ((net.minecraft.block.Block)(((net.minecraft.block.state.IBlockState)(life9_80)).a__ch())).a__Boolean(((net.minecraft.world.IBlockAccess)(((net.minecraft.client.Minecraft)(com.moon.module.impl.TargetStrafe.d)).I)), ((moom.DT)(life8_75)));
    if (!((life4_16 == null))) {
        forwardValue952_89_0 = ((spill952_4) ? 1 : 0);
        break forward_join_89;
    }
    if (!((!spill952_4))) {
        break forward_join_86;
    }
    return ((0) != 0);
    }
    forwardValue952_89_0 = ((((com.moon.module.impl.TargetStrafe)(this)).b(((moom.DR)(p0)))) ? 1 : 0);
    }
    if (!((life4_16 == null))) {
        forwardValue952_93_0 = forwardValue952_89_0;
        break forward_join_93;
    }
    if (!((forwardValue952_89_0 == 0))) {
        break forward_join_94;
    }
    forwardValue952_93_0 = 1;
    }
    forwardValue952_95_0 = forwardValue952_93_0;
    break forward_join_95;
    }
    forwardValue952_95_0 = 0;
    }
    return ((forwardValue952_95_0) != 0);
}


private void a(float p0, int p1, net.minecraft.entity.EntityLivingBase p2) {
int[] spill249_0;
    long life4_3;
    int[] life6_8;
    int life7_10;
    double life8_25;
    double life10_37;
    moom.DR life12_44;
    moom.DR life13_49;
    com.moon.gw life14_59;
    lexical_join_68: {
    life4_3 = (com.moon.module.impl.TargetStrafe.B ^ 90075407115995L);
    spill249_0 = com.moon.bx.b();
    ((java.util.List)(this.w)).clear();
    life6_8 = spill249_0;
    life7_10 = 0;
    lexical_cycle_11: while (true) {
    if (!((life7_10 < p1))) {
        break lexical_join_68;
    }
    life8_25 = (((double) p0) * java.lang.Math.cos(((double)(((((double) life7_10) * 0x1.921fb54442d18p2d) / ((double) p1))))));
    life10_37 = (((double) p0) * java.lang.Math.sin(((double)(((((double) life7_10) * 0x1.921fb54442d18p2d) / ((double) p1))))));
    life12_44 = new moom.DR(life8_25, 0x0.0p0d, life10_37);
    life13_49 = ((moom.DR)(((net.minecraft.entity.EntityLivingBase)(p2)).a__DR())).d(((moom.DR)(life12_44)));
    life14_59 = new com.moon.gw(p2, life12_44, life13_49, ((com.moon.module.impl.TargetStrafe)(this)).a__Boolean(((moom.DR)(life13_49))));
    ((java.util.List)(this.w)).add(((java.lang.Object)(life14_59)));
    life7_10 += 1;
    if (!((life6_8 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_56634c39e033d7dc_originalDynamicSite1304_24(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2706_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2708_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ec6de7cefe2c_invokedynamic948_17(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a51a63b9419a_invokedynamic947_17(int a0, long a1) throws E;
}
