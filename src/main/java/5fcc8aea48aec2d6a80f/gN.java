package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;

import java.util.Map;
public class gN {

private static net.minecraft.client.Minecraft a;

private moom.DD b;

private moom.jL c;

private moom.n3 d;

private boolean e;

private static long f;

private static java.lang.String[] g;

private static java.lang.String[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public gN(moom.jL p0) { super(); __sourceHandlerCall_4a65e53b62f48b2df9e5(this, p0); }


static {
f = ((long)(((moom._a)(moom._c.a(((long)(5968016802913815465L)), ((long)(-2434913331265093120L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(208076067922394L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.gN.f ^ 23206776768894L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill109_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill109_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill109_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill109_14 = new byte[8];
    (__sourceSpill109_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill109_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation109_16 = __sourceSpill109_14;
    ((javax.crypto.Cipher)(__sourceSpill109_11)).init(((int)(__sourceSpill109_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill109_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation109_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[4];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Ð¾¬Ç¾\034ÞÌlzNá/ö+ ò¥Ý.¹ëä\034»Í\013£dEòÔÆAù$d¼ª& t>¦o\013A"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill109_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill109_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill109_29)).doFinal(((byte[])(__sourceSpill109_28)));
        java.lang.String __sourceSpill109_34 = ((java.lang.String)(com.moon.gN.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill109_35 = local20_life19;
        int __sourceSpill109_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill109_35)[__sourceSpill109_36] = __sourceSpill109_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "º~\002K\037à\017ç\004)(z£îöMÄ\006Z|¼\026õ~¦6\töí§\032¿\034\020((jã*\rO×\031¹K>òÈó\004Ú±Ü4¥ò1\034|üb½i\003·þ¹\034¨\024 pcò\034"))).length();
    local16_life24 = 40;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill109_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill109_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill109_42)).doFinal(((byte[])(__sourceSpill109_41)));
        java.lang.String __sourceSpill109_47 = ((java.lang.String)(com.moon.gN.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill109_48 = local20_life19;
        int __sourceSpill109_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill109_48)[__sourceSpill109_49] = __sourceSpill109_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    g = ((java.lang.String[])(local20_life19));
    h = ((java.lang.String[])(new java.lang.String[4]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill109_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill109_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill109_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill109_60 = new byte[8];
    (__sourceSpill109_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill109_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation109_62 = __sourceSpill109_60;
    ((javax.crypto.Cipher)(__sourceSpill109_57)).init(((int)(__sourceSpill109_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill109_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation109_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "~®YQ°5TH\r?jÃåÅñ\006"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill109_71 = local4_life67;
        int __sourceSpill109_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill109_71)).substring(((int)(__sourceSpill109_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill109_76 = local6_life65;
        int __sourceSpill109_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill109_79 = new byte[8];
        (__sourceSpill109_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill109_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill109_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill109_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill109_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill109_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill109_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill109_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill109_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill109_80)).doFinal(((byte[])(__sourceSpill109_79)));
        (__sourceSpill109_76)[__sourceSpill109_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    j = ((long[])(local6_life65));
    k = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}

private static native <E extends Throwable> void __sourceHandlerCall_4a65e53b62f48b2df9e5(com.moon.gN a0, moom.jL a1) throws E;
private static final class __SourceHandler_4a65e53b62f48b2df9e5 {

public static void f1(com.moon.gN receiver, moom.jL p0) throws Throwable {
    int[] spill1_0;
    long life2_3;
    net.minecraft.client.renderer.texture.ITextureObject life5_37;
    int[] life4_38;
    life2_3 = (__fieldRead1_0() ^ 87200872662806L);
    __directSuperInit1_1(receiver);
    __fieldWrite1_2(receiver, 0);
    __fieldWrite1_3(receiver, p0);
    java.lang.Object __inlineStack1_7Token;
    spill1_0 = __call1_4();
    __fieldWrite1_10(receiver, new moom.DD(__invokedynamic1_9(__inlineStack1_7Output0((__inlineStack1_7Token = __inlineStack1_7Pack(__fieldRead1_5(p0), __invokedynamic1_6(1363, (3394438778808219733L ^ life2_3))))), __inlineStack1_7Output1(__inlineStack1_7Token), __invokedynamic1_8(15889, (8486610385781654294L ^ life2_3)))));
    life5_37 = __call1_14(__call1_12(__fieldRead1_11()), __fieldRead1_13(receiver));
    life4_38 = spill1_0;
    if ((life4_38 == null)) {
        if ((life5_37 != null)) {
        __fieldWrite1_16(receiver, __cast1_15(life5_37));
    } else {
        
    }
        __call1_17(receiver);
    } else {
        
    }
    if ((life4_38 != null)) {
        __call1_18(new java.lang.String[3]);
    } else {
        
    }
    return;
}
public static void h1_0(moom.Oo p0) throws Throwable {
    throw __call3000100_0(p0);
}
public static void h1_1(moom.Oo p0) throws Throwable {
    throw __call3000101_0(p0);
}
public static void h1_2(moom.Oo p0) throws Throwable {
    throw __call3000102_0(p0);
}
private static native long __fieldRead1_0() throws Throwable;
private static native void __directSuperInit1_1(com.moon.gN a0) throws Throwable;
private static native void __fieldWrite1_2(com.moon.gN a0, int a1) throws Throwable;
private static native void __fieldWrite1_3(com.moon.gN a0, moom.jL a1) throws Throwable;
private static native int[] __call1_4() throws Throwable;
private static native java.lang.String __fieldRead1_5(moom.jL a0) throws Throwable;
private static native java.lang.String __invokedynamic1_6(int a0, long a1) throws Throwable;
private static native java.lang.Object __inlineStack1_7Pack(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __inlineStack1_7Output0(java.lang.Object token) throws Throwable;
private static native java.lang.String __inlineStack1_7Output1(java.lang.Object token) throws Throwable;
private static native java.lang.String __invokedynamic1_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1_9(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native void __fieldWrite1_10(com.moon.gN a0, moom.DD a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1_11() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call1_12(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead1_13(com.moon.gN a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call1_14(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native moom.n3 __cast1_15(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __fieldWrite1_16(com.moon.gN a0, moom.n3 a1) throws Throwable;
private static native void __call1_17(com.moon.gN a0) throws Throwable;
private static native void __call1_18(java.lang.String[] a0) throws Throwable;
private static native java.lang.Throwable __call3000100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3000101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3000102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_de43f1a3e1590da92af1(com.moon.gN a0) throws E;
private static final class __SourceHandler_de43f1a3e1590da92af1 {

public static void f59(com.moon.gN receiver) throws Throwable {
    java.lang.String forestValue59_22_0;
    int forestValue59_45_0;
    int forestValue59_47_0;
    int forestValue59_66_0;
    int forestValue59_68_0;
    moom.n3 forestValue59_104_0;
    moom.n3 forestValue59_125_0;
    java.lang.String spill59_0;
    int spill59_1;
    int spill59_2;
    moom.n3 spill59_3;
    long life1_3;
    int[] life3_5;
    ByteBuf life4_27;
    ByteBuf life5_30;
    java.awt.image.BufferedImage life6_36;
    moom.n3 life7_103;
    forest_join_129: {
    forest_join_125: {
    forest_join_108: {
    forest_join_104: {
    forest_join_102: {
    forest_join_68: {
    forest_join_67: {
    forest_join_66: {
    forest_join_47: {
    forest_join_46: {
    forest_join_45: {
    forest_join_22: {
    forest_join_19: {
    life1_3 = (__fieldRead59_0() ^ 17924742592845L);
    life3_5 = __call59_1();
    spill59_0 = __call59_3(__fieldRead59_2(receiver));
    if (!((life3_5 == null))) {
        forestValue59_22_0 = spill59_0;
        break forest_join_22;
    }
    if (!((spill59_0 == null))) {
        break forest_join_19;
    }
    __call59_7(__call59_5(__fieldRead59_4()), __fieldRead59_6(receiver));
    if (!((life3_5 != null))) {
        break forest_join_129;
    }
    }
    forestValue59_22_0 = __call59_9(__fieldRead59_8(receiver));
    }
    life4_27 = __call59_11(forestValue59_22_0, __fieldRead59_10());
    life5_30 = __call59_12(life4_27);
    life6_36 = __call59_13(new ByteBufInputStream(life5_30));
    spill59_1 = __call59_14(life6_36);
    if (!((life3_5 == null))) {
        forestValue59_45_0 = spill59_1;
        break forest_join_45;
    }
    if (!((spill59_1 == __invokedynamic59_15(19777, (7156147546146457709L ^ life1_3))))) {
        break forest_join_46;
    }
    forestValue59_45_0 = 1;
    }
    forestValue59_47_0 = forestValue59_45_0;
    break forest_join_47;
    }
    forestValue59_47_0 = 0;
    }
    __call59_17(forestValue59_47_0, __invokedynamic59_16(9949, (1858483438325278082L ^ life1_3)), new java.lang.Object[0]);
    spill59_2 = __call59_18(life6_36);
    if (!((life3_5 == null))) {
        forestValue59_66_0 = spill59_2;
        break forest_join_66;
    }
    if (!((spill59_2 == __invokedynamic59_19(14702, (3125457437404773443L ^ life1_3))))) {
        break forest_join_67;
    }
    forestValue59_66_0 = 1;
    }
    forestValue59_68_0 = forestValue59_66_0;
    break forest_join_68;
    }
    forestValue59_68_0 = 0;
    }
    __call59_21(forestValue59_68_0, __invokedynamic59_20(4397, (5334737540442133107L ^ life1_3)), new java.lang.Object[0]);
    __call59_22(life4_27);
    __call59_23(life5_30);
    spill59_3 = __fieldRead59_24(receiver);
    if (!((life3_5 == null))) {
        forestValue59_104_0 = spill59_3;
        break forest_join_104;
    }
    if (!((spill59_3 == null))) {
        break forest_join_102;
    }
    life7_103 = new moom.n3(__call59_25(life6_36), __call59_26(life6_36));
    __call59_30(__call59_28(__fieldRead59_27()), __fieldRead59_29(receiver), life7_103);
    }
    forestValue59_104_0 = __fieldRead59_31(receiver);
    }
    if (!((life3_5 == null))) {
        forestValue59_125_0 = forestValue59_104_0;
        break forest_join_125;
    }
    if (!((forestValue59_104_0 == null))) {
        break forest_join_108;
    }
    return;
    }
    __call59_37(life6_36, 0, 0, __call59_32(life6_36), __call59_33(life6_36), __call59_35(__fieldRead59_34(receiver)), 0, __call59_36(life6_36));
    forestValue59_125_0 = __fieldRead59_38(receiver);
    }
    __call59_39(forestValue59_125_0);
    __fieldWrite59_40(receiver, 1);
    }
    return;
}
public static void h59_0(java.lang.Throwable p0) throws Throwable {
    throw __call3005900_0(p0);
}
public static void h59_1(java.lang.Throwable p0) throws Throwable {
    throw __call3005901_0(p0);
}
public static void h59_2(java.lang.Throwable p0) throws Throwable {
    throw __call3005902_0(p0);
}
public static void h59_3(java.lang.Throwable p0) throws Throwable {
    throw __call3005903_0(p0);
}
public static void h59_4(java.lang.Throwable p0) throws Throwable {
    throw __call3005904_0(p0);
}
public static void h59_5(java.lang.Throwable p0) throws Throwable {
    throw __call3005905_0(p0);
}
public static void h59_6(java.lang.Throwable p0) throws Throwable {
    throw __call3005906_0(p0);
}
public static void h59_7(java.lang.Throwable p0, com.moon.gN p1, ByteBuf p2, ByteBuf p3, moom.n3 p4) throws Throwable {
    java.lang.Throwable life4_2;
    life4_2 = p0;
    __fieldWrite3005907_0(p1, 0);
    __call3005907_2(__fieldRead3005907_1(p1), null);
    __call3005907_3(p2);
    __call3005907_4(p3);
    return;
}
public static void h59_8(java.lang.Throwable p0, ByteBuf p1, ByteBuf p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call3005908_0(p1);
    __call3005908_1(p2);
    throw life3_2;
}
public static void h59_9(java.lang.Throwable p0) throws Throwable {
    throw __call3005909_0(p0);
}
public static void h59_10(java.lang.Throwable p0) throws Throwable {
    throw __call3005910_0(p0);
}
private static native long __fieldRead59_0() throws Throwable;
private static native int[] __call59_1() throws Throwable;
private static native moom.jL __fieldRead59_2(com.moon.gN a0) throws Throwable;
private static native java.lang.String __call59_3(moom.jL a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead59_4() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call59_5(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead59_6(com.moon.gN a0) throws Throwable;
private static native void __call59_7(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native moom.jL __fieldRead59_8(com.moon.gN a0) throws Throwable;
private static native java.lang.String __call59_9(moom.jL a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead59_10() throws Throwable;
private static native ByteBuf __call59_11(java.lang.String a0, java.nio.charset.Charset a1) throws Throwable;
private static native ByteBuf __call59_12(ByteBuf a0) throws Throwable;
private static native java.awt.image.BufferedImage __call59_13(ByteBufInputStream a0) throws Throwable;
private static native int __call59_14(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic59_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic59_16(int a0, long a1) throws Throwable;
private static native void __call59_17(int a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native int __call59_18(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __invokedynamic59_19(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic59_20(int a0, long a1) throws Throwable;
private static native void __call59_21(int a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __call59_22(ByteBuf a0) throws Throwable;
private static native boolean __call59_23(ByteBuf a0) throws Throwable;
private static native moom.n3 __fieldRead59_24(com.moon.gN a0) throws Throwable;
private static native int __call59_25(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call59_26(java.awt.image.BufferedImage a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead59_27() throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call59_28(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead59_29(com.moon.gN a0) throws Throwable;
private static native boolean __call59_30(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1, moom.n3 a2) throws Throwable;
private static native moom.n3 __fieldRead59_31(com.moon.gN a0) throws Throwable;
private static native int __call59_32(java.awt.image.BufferedImage a0) throws Throwable;
private static native int __call59_33(java.awt.image.BufferedImage a0) throws Throwable;
private static native moom.n3 __fieldRead59_34(com.moon.gN a0) throws Throwable;
private static native int[] __call59_35(moom.n3 a0) throws Throwable;
private static native int __call59_36(java.awt.image.BufferedImage a0) throws Throwable;
private static native int[] __call59_37(java.awt.image.BufferedImage a0, int a1, int a2, int a3, int a4, int[] a5, int a6, int a7) throws Throwable;
private static native moom.n3 __fieldRead59_38(com.moon.gN a0) throws Throwable;
private static native void __call59_39(moom.n3 a0) throws Throwable;
private static native void __fieldWrite59_40(com.moon.gN a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3005900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3005901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3005902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3005903_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3005904_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3005905_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3005906_0(java.lang.Throwable a0) throws Throwable;
private static native void __fieldWrite3005907_0(com.moon.gN a0, int a1) throws Throwable;
private static native moom.jL __fieldRead3005907_1(com.moon.gN a0) throws Throwable;
private static native void __call3005907_2(moom.jL a0, java.lang.Object a1) throws Throwable;
private static native boolean __call3005907_3(ByteBuf a0) throws Throwable;
private static native boolean __call3005907_4(ByteBuf a0) throws Throwable;
private static native boolean __call3005908_0(ByteBuf a0) throws Throwable;
private static native boolean __call3005908_1(ByteBuf a0) throws Throwable;
private static native java.lang.Throwable __call3005909_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call3005910_0(java.lang.Throwable a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.gN.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1236_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12359;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/gN", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.gN.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1237_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/gN"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.DD a() {
return this.b;
}


private void a__Void() { __sourceHandlerCall_de43f1a3e1590da92af1(this); }


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public moom.n3 a__n3() {
return this.d;
}


public moom.jL a__jL() {
return this.c;
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
        byte[] spill396_0 = p0;
        life4_9 += 1;
        life5_44 = (spill396_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill396_1 = p0;
        life4_9 += 1;
        life5_76 = (spill396_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill396_2 = p0;
        life4_9 += 1;
        life5_91 = (spill396_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 13879);
    if (((com.moon.gN.h)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.gN.i)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.gN.i)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/gN", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.gN.g)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.gN.h)[life5_8] = com.moon.gN.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.gN.h)[life5_8];
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1237_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1236_0() throws E;
}
