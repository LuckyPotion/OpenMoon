package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class JC {

private static moom.JD[][] a;

private static long b;

private static java.lang.String[] c;

private static java.lang.String[] d;

private static java.util.Map e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

private static long i;

public JC() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(6329812083781199440L)), ((long)(-7813110886508144736L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(259672602589272L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local16_life7 = (moom.JC.b ^ 133420176184741L);
    javax.crypto.Cipher local18_life9;
    javax.crypto.Cipher __sourceSpill591_11 = (local18_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill591_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill591_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill591_14 = new byte[8];
    (__sourceSpill591_14)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local19_life15 = 1;
    while ((local19_life15 < 8)) {
        (__sourceSpill591_14)[local19_life15] = ((byte) ((int) ((local16_life7 << (local19_life15 * 8)) >>> 56)));
        local19_life15 += 1;
    }
    byte[] __sourcePreallocation591_16 = __sourceSpill591_14;
    ((javax.crypto.Cipher)(__sourceSpill591_11)).init(((int)(__sourceSpill591_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill591_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation591_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local25_life19 = new java.lang.String[6];
    int local23_life20 = 0;
    java.lang.String local22_life21;
    int local24_life23 = ((java.lang.String)((local22_life21 = "½õÑG\021ÓT©YùûL\t\022¦¼Óñú\b\023ÞÎ¥r¥°+¡#^Ç\013\177GÌtÞV¾äZ\030«£6Þ¥êNì¶Jº½ð£K\\Ï]q\000ù(¥_ºI@7\021\016|\020»È+ÓÿOn\"¤\013Ðä=\013e(¨\r\t\020®\021\001(£\020©Fý·*;)Ì9-|9§"))).length();
    int local21_life24 = 48;
    int local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill591_28 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill591_29 = local18_life9;
        byte[] local26_life31 = ((javax.crypto.Cipher)(__sourceSpill591_29)).doFinal(((byte[])(__sourceSpill591_28)));
        java.lang.String __sourceSpill591_34 = ((java.lang.String)(moom.JC.a(((byte[])(local26_life31))))).intern();
        java.lang.String[] __sourceSpill591_35 = local25_life19;
        int __sourceSpill591_36 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill591_35)[__sourceSpill591_36] = __sourceSpill591_34;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    local24_life23 = ((java.lang.String)((local22_life21 = "À\017'V;}Öé:wÒå.W(ø³Á°El\016×âs'À$%©¹\026³\021ÁÂ¤ïûÅÜ»\024s+c\022K"))).length();
    local21_life24 = 16;
    local20_life25 = -1;
    while (true) {
        local20_life25 += 1;
        byte[] __sourceSpill591_41 = ((java.lang.String)(((java.lang.String)(local22_life21)).substring(((int)(local20_life25)), ((int)((local20_life25 + local21_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill591_42 = local18_life9;
        byte[] local26_life44 = ((javax.crypto.Cipher)(__sourceSpill591_42)).doFinal(((byte[])(__sourceSpill591_41)));
        java.lang.String __sourceSpill591_47 = ((java.lang.String)(moom.JC.a(((byte[])(local26_life44))))).intern();
        java.lang.String[] __sourceSpill591_48 = local25_life19;
        int __sourceSpill591_49 = local23_life20;
        local23_life20 += 1;
        (__sourceSpill591_48)[__sourceSpill591_49] = __sourceSpill591_47;
        if (!(((local20_life25 = (local20_life25 + local21_life24)) < local24_life23))) { break; }
        local21_life24 = ((java.lang.String)(local22_life21)).charAt(((int)(local20_life25)));
    }
    c = ((java.lang.String[])(local25_life19));
    d = ((java.lang.String[])(new java.lang.String[6]));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life55;
    javax.crypto.Cipher __sourceSpill591_57 = (local5_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill591_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill591_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill591_60 = new byte[8];
    (__sourceSpill591_60)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local6_life61 = 1;
    while ((local6_life61 < 8)) {
        (__sourceSpill591_60)[local6_life61] = ((byte) ((int) ((local16_life7 << (local6_life61 * 8)) >>> 56)));
        local6_life61 += 1;
    }
    byte[] __sourcePreallocation591_62 = __sourceSpill591_60;
    ((javax.crypto.Cipher)(__sourceSpill591_57)).init(((int)(__sourceSpill591_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill591_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation591_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life65 = new long[2];
    int local8_life66 = 0;
    java.lang.String local9_life67;
    int local10_life69 = ((java.lang.String)((local9_life67 = "ÞªãçÀ`\b\017\024bn\025¹¼æ]"))).length();
    int local7_life70 = 0;
    do {
        java.lang.String __sourceSpill591_71 = local9_life67;
        int __sourceSpill591_72 = local7_life70;
        local7_life70 += 8;
        byte[] local12_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill591_71)).substring(((int)(__sourceSpill591_72)), ((int)(local7_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill591_76 = local11_life65;
        int __sourceSpill591_77 = local8_life66;
        local8_life66 += 1;
        long local13_life78 = (((((((((((long) (local12_life75)[0]) & 255L) << 56) | ((((long) (local12_life75)[1]) & 255L) << 48)) | ((((long) (local12_life75)[2]) & 255L) << 40)) | ((((long) (local12_life75)[3]) & 255L) << 32)) | ((((long) (local12_life75)[4]) & 255L) << 24)) | ((((long) (local12_life75)[5]) & 255L) << 16)) | ((((long) (local12_life75)[6]) & 255L) << 8)) | (((long) (local12_life75)[7]) & 255L));
        byte[] __sourceSpill591_79 = new byte[8];
        (__sourceSpill591_79)[0] = ((byte) ((int) (local13_life78 >>> 56)));
        (__sourceSpill591_79)[1] = ((byte) ((int) (local13_life78 >>> 48)));
        (__sourceSpill591_79)[2] = ((byte) ((int) (local13_life78 >>> 40)));
        (__sourceSpill591_79)[3] = ((byte) ((int) (local13_life78 >>> 32)));
        (__sourceSpill591_79)[4] = ((byte) ((int) (local13_life78 >>> 24)));
        (__sourceSpill591_79)[5] = ((byte) ((int) (local13_life78 >>> 16)));
        (__sourceSpill591_79)[6] = ((byte) ((int) (local13_life78 >>> 8)));
        (__sourceSpill591_79)[7] = ((byte) ((int) local13_life78));
        javax.crypto.Cipher __sourceSpill591_80 = local5_life55;
        byte[] local15_life82 = ((javax.crypto.Cipher)(__sourceSpill591_80)).doFinal(((byte[])(__sourceSpill591_79)));
        (__sourceSpill591_76)[__sourceSpill591_77] = (((((((((((long) (local15_life82)[0]) & 255L) << 56) | ((((long) (local15_life82)[1]) & 255L) << 48)) | ((((long) (local15_life82)[2]) & 255L) << 40)) | ((((long) (local15_life82)[3]) & 255L) << 32)) | ((((long) (local15_life82)[4]) & 255L) << 24)) | ((((long) (local15_life82)[5]) & 255L) << 16)) | ((((long) (local15_life82)[6]) & 255L) << 8)) | (((long) (local15_life82)[7]) & 255L));
    } while ((!(local7_life70 >= local10_life69)));
    f = ((long[])(local11_life65));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
    javax.crypto.Cipher local0_life86;
    javax.crypto.Cipher __sourceSpill591_88 = (local0_life86 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill591_89 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill591_90 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill591_91 = new byte[8];
    (__sourceSpill591_91)[0] = ((byte) ((int) (local16_life7 >>> 56)));
    int local1_life92 = 1;
    while ((local1_life92 < 8)) {
        (__sourceSpill591_91)[local1_life92] = ((byte) ((int) ((local16_life7 << (local1_life92 * 8)) >>> 56)));
        local1_life92 += 1;
    }
    byte[] __sourcePreallocation591_93 = __sourceSpill591_91;
    ((javax.crypto.Cipher)(__sourceSpill591_88)).init(((int)(__sourceSpill591_89)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill591_90)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation591_93)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life96 = -1795045250480386403L;
    byte[] __sourceSpill591_97 = new byte[8];
    (__sourceSpill591_97)[0] = ((byte) ((int) (local2_life96 >>> 56)));
    (__sourceSpill591_97)[1] = ((byte) ((int) (local2_life96 >>> 48)));
    (__sourceSpill591_97)[2] = ((byte) ((int) (local2_life96 >>> 40)));
    (__sourceSpill591_97)[3] = ((byte) ((int) (local2_life96 >>> 32)));
    (__sourceSpill591_97)[4] = ((byte) ((int) (local2_life96 >>> 24)));
    (__sourceSpill591_97)[5] = ((byte) ((int) (local2_life96 >>> 16)));
    (__sourceSpill591_97)[6] = ((byte) ((int) (local2_life96 >>> 8)));
    (__sourceSpill591_97)[7] = ((byte) ((int) local2_life96));
    javax.crypto.Cipher __sourceSpill591_98 = local0_life86;
    byte[] local4_life100 = ((javax.crypto.Cipher)(__sourceSpill591_98)).doFinal(((byte[])(__sourceSpill591_97)));
    i = ((long)((((((((((((long) (local4_life100)[0]) & 255L) << 56) | ((((long) (local4_life100)[1]) & 255L) << 48)) | ((((long) (local4_life100)[2]) & 255L) << 40)) | ((((long) (local4_life100)[3]) & 255L) << 32)) | ((((long) (local4_life100)[4]) & 255L) << 24)) | ((((long) (local4_life100)[5]) & 255L) << 16)) | ((((long) (local4_life100)[6]) & 255L) << 8)) | (((long) (local4_life100)[7]) & 255L))));
    a = ((moom.JD[][])(null));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_8ce0af79e24513a36612(net.minecraft.world.World a0) throws E;
private static final class __SourceHandler_8ce0af79e24513a36612 {

public static boolean f659(net.minecraft.world.World p0) throws Throwable {
    moom.JD[] forwardValue659_33_0;
    int forwardValue659_38_0;
    int forwardValue659_40_0;
    int forwardValue659_42_0;
    int spill659_0;
    int spill659_1;
    moom.JD[] spill659_2;
    int spill659_3;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    int life4_15;
    moom.JD[] life5_38;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_33: {
    forward_join_10: {
    life1_3 = (__fieldRead659_0() ^ 41108831231341L);
    life3_5 = __call659_1();
    if (!((__fieldRead659_2() == null))) {
        break forward_join_10;
    }
    return __integerCategory659_3(0);
    }
    life4_15 = __call659_5(__fieldRead659_4(p0));
    spill659_0 = life4_15;
    if (!((life3_5 != null))) {
        forwardValue659_42_0 = spill659_0;
        break forward_join_42;
    }
    if (!((spill659_0 >= 0))) {
        break forward_join_41;
    }
    spill659_1 = life4_15;
    if (!((life3_5 != null))) {
        forwardValue659_42_0 = spill659_1;
        break forward_join_42;
    }
    if (!((spill659_1 < (__fieldRead659_6()).length))) {
        break forward_join_41;
    }
    life5_38 = (__fieldRead659_7())[life4_15];
    spill659_2 = life5_38;
    if (!((life3_5 != null))) {
        forwardValue659_33_0 = spill659_2;
        break forward_join_33;
    }
    if (!((spill659_2 != null))) {
        break forward_join_39;
    }
    forwardValue659_33_0 = life5_38;
    }
    spill659_3 = (forwardValue659_33_0).length;
    if (!((life3_5 != null))) {
        forwardValue659_38_0 = spill659_3;
        break forward_join_38;
    }
    if (!((spill659_3 > 0))) {
        break forward_join_39;
    }
    forwardValue659_38_0 = 1;
    }
    forwardValue659_40_0 = forwardValue659_38_0;
    break forward_join_40;
    }
    forwardValue659_40_0 = 0;
    }
    return __integerCategory659_8(forwardValue659_40_0);
    }
    forwardValue659_42_0 = 0;
    }
    return __integerCategory659_9(forwardValue659_42_0);
}
public static void h659_0(moom.Oo p0) throws Throwable {
    throw __call1065900_0(p0);
}
public static void h659_1(moom.Oo p0) throws Throwable {
    throw __call1065901_0(p0);
}
public static void h659_2(moom.Oo p0) throws Throwable {
    throw __call1065902_0(p0);
}
public static void h659_3(moom.Oo p0) throws Throwable {
    throw __call1065903_0(p0);
}
public static void h659_4(moom.Oo p0) throws Throwable {
    throw __call1065904_0(p0);
}
public static void h659_5(moom.Oo p0) throws Throwable {
    throw __call1065905_0(p0);
}
private static native long __fieldRead659_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call659_1() throws Throwable;
private static native moom.JD[][] __fieldRead659_2() throws Throwable;
private static native boolean __integerCategory659_3(int value) throws Throwable;
private static native moom.EA __fieldRead659_4(net.minecraft.world.World a0) throws Throwable;
private static native int __call659_5(moom.EA a0) throws Throwable;
private static native moom.JD[][] __fieldRead659_6() throws Throwable;
private static native moom.JD[][] __fieldRead659_7() throws Throwable;
private static native boolean __integerCategory659_8(int value) throws Throwable;
private static native boolean __integerCategory659_9(int value) throws Throwable;
private static native java.lang.Exception __call1065900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1065905_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_370fb7d9839abffe1ca9(net.minecraft.world.World a0, net.minecraft.client.renderer.texture.TextureManager a1, float a2) throws E;
private static final class __SourceHandler_370fb7d9839abffe1ca9 {

public static void f660(net.minecraft.world.World p0, net.minecraft.client.renderer.texture.TextureManager p1, float p2) throws Throwable {
    int lexicalValue660_17_0;
    float lexicalValue660_54_0;
    float lexicalValue660_54_1;
    int spill660_0;
    float spill660_1;
    float spill660_2;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_11;
    moom.JD[] life7_26;
    long life8_31;
    int life10_36;
    float life11_40;
    float life12_44;
    float life13_48;
    moom.JD[] life14_66;
    int life15_69;
    int life16_71;
    moom.JD life17_78;
    float life14_110;
    lexical_join_95: {
    lexical_join_89: {
    lexical_join_56: {
    lexical_join_54: {
    lexical_join_17: {
    life3_3 = (__fieldRead660_0() ^ 101025622063532L);
    life5_5 = __call660_1();
    if (!((__fieldRead660_2() != null))) {
        break lexical_join_95;
    }
    life6_11 = __call660_4(__fieldRead660_3(p0));
    spill660_0 = life6_11;
    if (!((life5_5 != null))) {
        lexicalValue660_17_0 = spill660_0;
        break lexical_join_17;
    }
    if (!((spill660_0 >= 0))) {
        break lexical_join_95;
    }
    lexicalValue660_17_0 = life6_11;
    }
    if (!((lexicalValue660_17_0 < (__fieldRead660_5()).length))) {
        break lexical_join_95;
    }
    life7_26 = (__fieldRead660_6())[life6_11];
    if (!((life7_26 != null))) {
        break lexical_join_95;
    }
    life8_31 = __call660_7(p0);
    life10_36 = ((int) (life8_31 % __fieldRead660_8()));
    life11_40 = __call660_9(p0, p2);
    life12_44 = __call660_10(p0, p2);
    life13_48 = __call660_11(p0, p2);
    spill660_1 = life12_44;
    spill660_2 = 0x0.0p0f;
    if (!((life5_5 != null))) {
        lexicalValue660_54_0 = spill660_1;
        lexicalValue660_54_1 = spill660_2;
        break lexical_join_54;
    }
    if (!((__numericCompare660_12(spill660_1, spill660_2) > 0))) {
        break lexical_join_56;
    }
    lexicalValue660_54_0 = life13_48;
    lexicalValue660_54_1 = life12_44;
    }
    life13_48 = (lexicalValue660_54_0 / lexicalValue660_54_1);
    }
    life14_66 = life7_26;
    life15_69 = (life14_66).length;
    life16_71 = 0;
    lexical_cycle_63: while (true) {
    lexical_join_87: {
    lexical_join_86: {
    if (!((life16_71 < life15_69))) {
        break lexical_join_89;
    }
    life17_78 = (life14_66)[life16_71];
    if (!((life5_5 != null))) {
        break lexical_join_95;
    }
    if (!((life5_5 != null))) {
        break lexical_join_87;
    }
    if (!(__call660_13(life17_78, p0, life10_36))) {
        break lexical_join_86;
    }
    __call660_14(life17_78, p0, life10_36, life11_40, life12_44, life13_48);
    }
    life16_71 += 1;
    }
    if (!((life5_5 == null))) { continue lexical_cycle_63; }
    break lexical_cycle_63;
    }
    }
    life14_110 = (0x1.0p0f - life12_44);
    __call660_15(life14_110);
    }
    return;
}
public static void h660_0(moom.Oo p0) throws Throwable {
    throw __call1066000_0(p0);
}
public static void h660_1(moom.Oo p0) throws Throwable {
    throw __call1066001_0(p0);
}
public static void h660_2(moom.Oo p0) throws Throwable {
    throw __call1066002_0(p0);
}
public static void h660_3(moom.Oo p0) throws Throwable {
    throw __call1066003_0(p0);
}
public static void h660_4(moom.Oo p0) throws Throwable {
    throw __call1066004_0(p0);
}
public static void h660_5(moom.Oo p0) throws Throwable {
    throw __call1066005_0(p0);
}
private static native long __fieldRead660_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call660_1() throws Throwable;
private static native moom.JD[][] __fieldRead660_2() throws Throwable;
private static native moom.EA __fieldRead660_3(net.minecraft.world.World a0) throws Throwable;
private static native int __call660_4(moom.EA a0) throws Throwable;
private static native moom.JD[][] __fieldRead660_5() throws Throwable;
private static native moom.JD[][] __fieldRead660_6() throws Throwable;
private static native long __call660_7(net.minecraft.world.World a0) throws Throwable;
private static native long __fieldRead660_8() throws Throwable;
private static native float __call660_9(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __call660_10(net.minecraft.world.World a0, float a1) throws Throwable;
private static native float __call660_11(net.minecraft.world.World a0, float a1) throws Throwable;
private static native int __numericCompare660_12(float a0, float a1) throws Throwable;
private static native boolean __call660_13(moom.JD a0, net.minecraft.world.World a1, int a2) throws Throwable;
private static native void __call660_14(moom.JD a0, net.minecraft.world.World a1, int a2, float a3, float a4, float a5) throws Throwable;
private static native void __call660_15(float a0) throws Throwable;
private static native java.lang.Exception __call1066000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1066005_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.JD[][] __sourceHandlerCall_9b03c20d7f1fded55708() throws E;
private static final class __SourceHandler_9b03c20d7f1fded55708 {

public static moom.JD[][] f100086() throws Throwable {
    java.util.ArrayList forestValue100086_155_0;
    int forestValue100086_170_0;
    int forestValue100086_180_0;
    net.minecraft.entity.Entity[] spill100086_0;
    int spill100086_1;
    java.util.ArrayList spill100086_2;
    long life0_3;
    moom.JD[][] life3_12;
    java.lang.String life4_18;
    int life5_20;
    int life6_22;
    net.minecraft.entity.Entity[] life2_23;
    java.lang.String life7_36;
    java.util.ArrayList life8_40;
    int life9_44;
    java.lang.String life10_60;
    moom.DD life11_65;
    java.io.InputStream life12_68;
    moom.OH life13_79;
    java.lang.String life14_102;
    moom.JD life15_108;
    moom.DD life16_118;
    net.minecraft.client.renderer.texture.ITextureObject life17_121;
    moom.JD[] life9_166;
    int life6_186;
    moom.JD[][] life7_190;
    forest_join_180: {
    forest_join_175: {
    forest_join_170: {
    forest_join_169: {
    life0_3 = (__fieldRead100086_0() ^ 59364876185124L);
    spill100086_0 = __call100086_1();
    life3_12 = __call100086_3(__invokedynamic100086_2(30552, (4538344096400173288L ^ life0_3)), 0);
    life4_18 = __invokedynamic100086_4(27210, (1986766865055354302L ^ life0_3));
    life5_20 = -1;
    life6_22 = 0;
    life2_23 = spill100086_0;
    forest_cycle_24: while (true) {
    forest_join_167: {
    forest_join_166: {
    forest_join_155: {
    forest_join_149: {
    if (!((life6_22 < (life3_12).length))) {
        break forest_join_169;
    }
    life7_36 = __invokedynamic100086_6(life4_18, life6_22, __invokedynamic100086_5(5202, (4680184545488958368L ^ life0_3)));
    life8_40 = new java.util.ArrayList();
    spill100086_1 = 1;
    if (!((life2_23 != null))) {
        forestValue100086_170_0 = spill100086_1;
        break forest_join_170;
    }
    life9_44 = spill100086_1;
    forest_cycle_45: while (true) {
    forest_join_146: {
    forest_join_144: {
    forest_join_136: {
    forest_join_75: {
    if (!((life9_44 < __invokedynamic100086_7(22159, (2194005101984368958L ^ life0_3))))) {
        break forest_join_149;
    }
    life10_60 = __invokedynamic100086_9(life7_36, life9_44, __invokedynamic100086_8(6465, (6735463079949041334L ^ life0_3)));
    life11_65 = new moom.DD(life10_60);
    life12_68 = __call100086_10(life11_65);
    if (!((life2_23 != null))) {
        break forest_join_167;
    }
    if (!((life12_68 == null))) {
        break forest_join_75;
    }
    if (!((life2_23 == null))) {
        break forest_join_149;
    }
    }
    life13_79 = new moom.OH();
    __call100086_11(life13_79, life12_68);
    __call100086_12(life12_68);
    java.lang.String __stackOp100086_14_0 = life10_60;
    java.lang.String __stackOp100086_14_1 = __invokedynamic100086_13(15157, (2050174878356626630L ^ life0_3));
    __call100086_16(__invokedynamic100086_15(__stackOp100086_14_1, __stackOp100086_14_0));
    life14_102 = __invokedynamic100086_18(life7_36, life9_44, __invokedynamic100086_17(12325, (3941484569372874704L ^ life0_3)));
    life15_108 = new moom.JD(life13_79, life14_102);
    if (!(__call100086_19(life15_108, life10_60))) {
        break forest_join_146;
    }
    life16_118 = new moom.DD(__fieldRead100086_20(life15_108));
    life17_121 = __call100086_21(life16_118);
    if (!((life2_23 != null))) {
        break forest_join_144;
    }
    if (!((life17_121 == null))) {
        break forest_join_136;
    }
    moom.DD __stackOp100086_23_0 = life16_118;
    java.lang.String __stackOp100086_23_1 = __invokedynamic100086_22(15670, (4068768028449823424L ^ life0_3));
    __call100086_25(__invokedynamic100086_24(__stackOp100086_23_1, __stackOp100086_23_0));
    if (!((life2_23 == null))) {
        break forest_join_146;
    }
    }
    __fieldWrite100086_27(life15_108, __call100086_26(life17_121));
    __call100086_28(life8_40, life15_108);
    }
    __call100086_29(life12_68);
    }
    life9_44 += 1;
    if (!((life2_23 == null))) {
        continue forest_cycle_45;
    }
    break forest_cycle_45;
    }
    }
    spill100086_2 = life8_40;
    if (!((life2_23 != null))) {
        forestValue100086_155_0 = spill100086_2;
        break forest_join_155;
    }
    if (!((__call100086_30(spill100086_2) > 0))) {
        break forest_join_166;
    }
    forestValue100086_155_0 = life8_40;
    }
    life9_166 = __cast100086_32(__call100086_31(forestValue100086_155_0, new moom.JD[0]));
    (life3_12)[life6_22] = life9_166;
    life5_20 = life6_22;
    }
    life6_22 += 1;
    }
    if (!((life2_23 == null))) {
        continue forest_cycle_24;
    }
    break forest_cycle_24;
    }
    }
    forestValue100086_170_0 = life5_20;
    }
    if (!((life2_23 != null))) {
        forestValue100086_180_0 = forestValue100086_170_0;
        break forest_join_180;
    }
    if (!((forestValue100086_170_0 < 0))) {
        break forest_join_175;
    }
    return null;
    }
    life6_186 = (life5_20 + 1);
    forestValue100086_180_0 = life6_186;
    }
    life7_190 = __call100086_33(forestValue100086_180_0, 0);
    __call100086_34(life3_12, 0, life7_190, 0, (life7_190).length);
    return life7_190;
}
public static moom.JD[][] h100086_0(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008600_0(p0);
}
public static moom.JD[][] h100086_1(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008601_0(p0);
}
public static moom.JD[][] h100086_2(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008602_0(p0);
}
public static moom.JD[][] h100086_3(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008603_0(p0);
}
public static moom.JD[][] h100086_4(java.io.FileNotFoundException p0, long p1, net.minecraft.entity.Entity[] p2, moom.JD[][] p3, java.lang.String p4, int p5, int p6, java.util.ArrayList p7) throws Throwable {
    java.util.ArrayList forestValue13008604_8_0;
    int forestValue13008604_150_0;
    int forestValue13008604_160_0;
    java.util.ArrayList spill13008604_0;
    int spill13008604_1;
    java.io.FileNotFoundException life12_2;
    moom.JD[] life10_16;
    java.lang.String life9_39;
    int life10_47;
    java.lang.String life11_63;
    moom.DD life12_68;
    java.io.InputStream life13_71;
    moom.OH life14_82;
    java.lang.String life15_105;
    moom.JD life16_111;
    moom.DD life17_121;
    net.minecraft.client.renderer.texture.ITextureObject life18_124;
    int life7_168;
    moom.JD[][] life9_172;
    forest_join_160: {
    forest_join_155: {
    forest_join_150: {
    forest_join_149: {
    life12_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_19: {
    forest_join_8: {
    spill13008604_0 = p7;
    if (!((p2 != null))) {
        forestValue13008604_8_0 = spill13008604_0;
        break forest_join_8;
    }
    if (!((__call13008604_0(spill13008604_0) > 0))) {
        break forest_join_19;
    }
    forestValue13008604_8_0 = p7;
    }
    life10_16 = __cast13008604_2(__call13008604_1(forestValue13008604_8_0, new moom.JD[0]));
    (p3)[p6] = life10_16;
    p5 = p6;
    }
    p6 += 1;
    forest_cycle_20: while (true) {
    forest_join_23: {
    if (!((p2 == null))) {
        break forest_join_23;
    }
    break forest_join_149;
    }
    if (!((p6 < (p3).length))) {
        break forest_join_149;
    }
    life9_39 = __invokedynamic13008604_4(p4, p6, __invokedynamic13008604_3(5202, (4680184545488958368L ^ p1)));
    p7 = new java.util.ArrayList();
    spill13008604_1 = 1;
    if (!((p2 != null))) {
        forestValue13008604_150_0 = spill13008604_1;
        break forest_join_150;
    }
    life10_47 = spill13008604_1;
    forest_cycle_44: while (true) {
    forest_join_145: {
    forest_join_143: {
    forest_join_135: {
    forest_join_74: {
    if (!((life10_47 < __invokedynamic13008604_5(22159, (2194005101984368958L ^ p1))))) {
        continue forest_cycle_2;
    }
    life11_63 = __invokedynamic13008604_7(life9_39, life10_47, __invokedynamic13008604_6(6465, (6735463079949041334L ^ p1)));
    life12_68 = new moom.DD(life11_63);
    life13_71 = __call13008604_8(life12_68);
    if (!((p2 != null))) {
        continue forest_cycle_20;
    }
    if (!((life13_71 == null))) {
        break forest_join_74;
    }
    if (!((p2 == null))) {
        continue forest_cycle_2;
    }
    }
    life14_82 = new moom.OH();
    __call13008604_9(life14_82, life13_71);
    __call13008604_10(life13_71);
    java.lang.String __stackOp13008604_12_0 = life11_63;
    java.lang.String __stackOp13008604_12_1 = __invokedynamic13008604_11(15157, (2050174878356626630L ^ p1));
    __call13008604_14(__invokedynamic13008604_13(__stackOp13008604_12_1, __stackOp13008604_12_0));
    life15_105 = __invokedynamic13008604_16(life9_39, life10_47, __invokedynamic13008604_15(12325, (3941484569372874704L ^ p1)));
    life16_111 = new moom.JD(life14_82, life15_105);
    if (!(__call13008604_17(life16_111, life11_63))) {
        break forest_join_145;
    }
    life17_121 = new moom.DD(__fieldRead13008604_18(life16_111));
    life18_124 = __call13008604_19(life17_121);
    if (!((p2 != null))) {
        break forest_join_143;
    }
    if (!((life18_124 == null))) {
        break forest_join_135;
    }
    moom.DD __stackOp13008604_21_0 = life17_121;
    java.lang.String __stackOp13008604_21_1 = __invokedynamic13008604_20(15670, (4068768028449823424L ^ p1));
    __call13008604_23(__invokedynamic13008604_22(__stackOp13008604_21_1, __stackOp13008604_21_0));
    if (!((p2 == null))) {
        break forest_join_145;
    }
    }
    __fieldWrite13008604_25(life16_111, __call13008604_24(life18_124));
    __call13008604_26(p7, life16_111);
    }
    __call13008604_27(life13_71);
    }
    life10_47 += 1;
    if (!((p2 == null))) {
        continue forest_cycle_44;
    }
    break forest_cycle_44;
    }
    break forest_cycle_20;
    }
    continue forest_cycle_2;
    }
    }
    forestValue13008604_150_0 = p5;
    }
    if (!((p2 != null))) {
        forestValue13008604_160_0 = forestValue13008604_150_0;
        break forest_join_160;
    }
    if (!((forestValue13008604_150_0 < 0))) {
        break forest_join_155;
    }
    return null;
    }
    life7_168 = (p5 + 1);
    forestValue13008604_160_0 = life7_168;
    }
    life9_172 = __call13008604_28(forestValue13008604_160_0, 0);
    __call13008604_29(p3, 0, life9_172, 0, (life9_172).length);
    return life9_172;
}
public static moom.JD[][] h100086_5(java.io.IOException p0, long p1, net.minecraft.entity.Entity[] p2, moom.JD[][] p3, java.lang.String p4, int p5, int p6, java.lang.String p7, java.util.ArrayList p8, int p9) throws Throwable {
    java.util.ArrayList forestValue13008605_45_0;
    java.util.ArrayList forestValue13008605_89_0;
    int forestValue13008605_228_0;
    int forestValue13008605_238_0;
    java.util.ArrayList spill13008605_0;
    int spill13008605_1;
    java.util.ArrayList spill13008605_2;
    int spill13008605_3;
    java.io.IOException life12_2;
    java.lang.String life11_26;
    moom.DD life12_31;
    java.io.InputStream life13_34;
    moom.JD[] life10_59;
    moom.JD[] life10_111;
    moom.DD life12_169;
    moom.OH life14_186;
    java.lang.String life15_209;
    moom.JD life16_215;
    moom.DD life17_226;
    net.minecraft.client.renderer.texture.ITextureObject life18_229;
    int life7_278;
    moom.JD[][] life8_283;
    forest_join_238: {
    forest_join_233: {
    forest_join_228: {
    forest_join_227: {
    life12_2 = p0;
    __call13008605_0(life12_2);
    forest_cycle_4: while (true) {
    forest_join_226: {
    forest_join_224: {
    forest_join_216: {
    forest_join_155: {
    forest_join_83: {
    forest_join_82: {
    forest_join_8: {
    p9 += 1;
    if (!((p2 == null))) {
        break forest_join_8;
    }
    break forest_join_83;
    }
    forest_cycle_8: while (true) {
    forest_join_60: {
    forest_join_57: {
    forest_join_56: {
    forest_join_45: {
    forest_join_39: {
    if (!((p9 < __invokedynamic13008605_1(22159, (2194005101984368958L ^ p1))))) {
        break forest_join_39;
    }
    life11_26 = __invokedynamic13008605_3(p7, p9, __invokedynamic13008605_2(6465, (6735463079949041334L ^ p1)));
    life12_31 = new moom.DD(life11_26);
    life13_34 = __call13008605_4(life12_31);
    if (!((p2 != null))) {
        break forest_join_57;
    }
    if (!((life13_34 == null))) {
        break forest_join_155;
    }
    if (!((p2 == null))) {
        break forest_join_39;
    }
    break forest_join_82;
    }
    spill13008605_0 = p8;
    if (!((p2 != null))) {
        forestValue13008605_45_0 = spill13008605_0;
        break forest_join_45;
    }
    if (!((__call13008605_5(spill13008605_0) > 0))) {
        break forest_join_56;
    }
    forestValue13008605_45_0 = p8;
    }
    life10_59 = __cast13008605_7(__call13008605_6(forestValue13008605_45_0, new moom.JD[0]));
    (p3)[p6] = life10_59;
    p5 = p6;
    }
    p6 += 1;
    }
    if (!((p2 == null))) {
        break forest_join_60;
    }
    break forest_join_227;
    }
    if (!((p6 < (p3).length))) {
        break forest_join_227;
    }
    p7 = __invokedynamic13008605_9(p4, p6, __invokedynamic13008605_8(5202, (4680184545488958368L ^ p1)));
    p8 = new java.util.ArrayList();
    spill13008605_1 = 1;
    if (!((p2 != null))) {
        forestValue13008605_228_0 = spill13008605_1;
        break forest_join_228;
    }
    p9 = spill13008605_1;
    continue forest_cycle_8;
    }
    }
    break forest_join_155;
    }
    forest_cycle_83: while (true) {
    forest_join_100: {
    forest_join_89: {
    spill13008605_2 = p8;
    if (!((p2 != null))) {
        forestValue13008605_89_0 = spill13008605_2;
        break forest_join_89;
    }
    if (!((__call13008605_10(spill13008605_2) > 0))) {
        break forest_join_100;
    }
    forestValue13008605_89_0 = p8;
    }
    life10_111 = __cast13008605_12(__call13008605_11(forestValue13008605_89_0, new moom.JD[0]));
    (p3)[p6] = life10_111;
    p5 = p6;
    }
    p6 += 1;
    forest_cycle_101: while (true) {
    forest_join_104: {
    if (!((p2 == null))) {
        break forest_join_104;
    }
    break forest_join_227;
    }
    if (!((p6 < (p3).length))) {
        break forest_join_227;
    }
    p7 = __invokedynamic13008605_14(p4, p6, __invokedynamic13008605_13(5202, (4680184545488958368L ^ p1)));
    p8 = new java.util.ArrayList();
    spill13008605_3 = 1;
    if (!((p2 != null))) {
        forestValue13008605_228_0 = spill13008605_3;
        break forest_join_228;
    }
    p9 = spill13008605_3;
    if (!((p9 < __invokedynamic13008605_15(22159, (2194005101984368958L ^ p1))))) {
        continue forest_cycle_83;
    }
    life11_26 = __invokedynamic13008605_17(p7, p9, __invokedynamic13008605_16(6465, (6735463079949041334L ^ p1)));
    life12_169 = new moom.DD(life11_26);
    life13_34 = __call13008605_18(life12_169);
    if (!((p2 != null))) {
        continue forest_cycle_101;
    }
    break forest_cycle_101;
    }
    if (!((life13_34 == null))) {
        break forest_join_155;
    }
    if (!((p2 == null))) {
        continue forest_cycle_83;
    }
    break forest_cycle_83;
    }
    }
    life14_186 = new moom.OH();
    __call13008605_19(life14_186, life13_34);
    __call13008605_20(life13_34);
    java.lang.String __stackOp13008605_22_0 = life11_26;
    java.lang.String __stackOp13008605_22_1 = __invokedynamic13008605_21(15157, (2050174878356626630L ^ p1));
    __call13008605_24(__invokedynamic13008605_23(__stackOp13008605_22_1, __stackOp13008605_22_0));
    life15_209 = __invokedynamic13008605_26(p7, p9, __invokedynamic13008605_25(12325, (3941484569372874704L ^ p1)));
    life16_215 = new moom.JD(life14_186, life15_209);
    if (!(__call13008605_27(life16_215, life11_26))) {
        break forest_join_226;
    }
    life17_226 = new moom.DD(__fieldRead13008605_28(life16_215));
    life18_229 = __call13008605_29(life17_226);
    if (!((p2 != null))) {
        break forest_join_224;
    }
    if (!((life18_229 == null))) {
        break forest_join_216;
    }
    moom.DD __stackOp13008605_31_0 = life17_226;
    java.lang.String __stackOp13008605_31_1 = __invokedynamic13008605_30(15670, (4068768028449823424L ^ p1));
    __call13008605_33(__invokedynamic13008605_32(__stackOp13008605_31_1, __stackOp13008605_31_0));
    if (!((p2 == null))) {
        break forest_join_226;
    }
    }
    __fieldWrite13008605_35(life16_215, __call13008605_34(life18_229));
    __call13008605_36(p8, life16_215);
    }
    __call13008605_37(life13_34);
    }
    continue forest_cycle_4;
    }
    }
    forestValue13008605_228_0 = p5;
    }
    if (!((p2 != null))) {
        forestValue13008605_238_0 = forestValue13008605_228_0;
        break forest_join_238;
    }
    if (!((forestValue13008605_228_0 < 0))) {
        break forest_join_233;
    }
    return null;
    }
    life7_278 = (p5 + 1);
    forestValue13008605_238_0 = life7_278;
    }
    life8_283 = __call13008605_38(forestValue13008605_238_0, 0);
    __call13008605_39(p3, 0, life8_283, 0, (life8_283).length);
    return life8_283;
}
public static moom.JD[][] h100086_6(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008606_0(p0);
}
public static moom.JD[][] h100086_7(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008607_0(p0);
}
public static moom.JD[][] h100086_8(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008608_0(p0);
}
public static moom.JD[][] h100086_9(java.io.FileNotFoundException p0) throws Throwable {
    throw __call13008609_0(p0);
}
private static native long __fieldRead100086_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call100086_1() throws Throwable;
private static native int __invokedynamic100086_2(int a0, long a1) throws Throwable;
private static native moom.JD[][] __call100086_3(int a0, int a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_4(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_6(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native int __invokedynamic100086_7(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_9(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native java.io.InputStream __call100086_10(moom.DD a0) throws Throwable;
private static native void __call100086_11(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call100086_12(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic100086_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_15(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call100086_16(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic100086_17(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_18(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native boolean __call100086_19(moom.JD a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead100086_20(moom.JD a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call100086_21(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic100086_22(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic100086_24(java.lang.String a0, moom.DD a1) throws Throwable;
private static native void __call100086_25(java.lang.String a0) throws Throwable;
private static native int __call100086_26(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __fieldWrite100086_27(moom.JD a0, int a1) throws Throwable;
private static native boolean __call100086_28(java.util.ArrayList a0, moom.JD a1) throws Throwable;
private static native void __call100086_29(java.io.InputStream a0) throws Throwable;
private static native int __call100086_30(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object[] __call100086_31(java.util.ArrayList a0, moom.JD[] a1) throws Throwable;
private static native moom.JD[] __cast100086_32(java.lang.Object[] a0) throws Throwable;
private static native moom.JD[][] __call100086_33(int a0, int a1) throws Throwable;
private static native void __call100086_34(moom.JD[][] a0, int a1, moom.JD[][] a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call13008600_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008601_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008602_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008603_0(java.io.FileNotFoundException a0) throws Throwable;
private static native int __call13008604_0(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object[] __call13008604_1(java.util.ArrayList a0, moom.JD[] a1) throws Throwable;
private static native moom.JD[] __cast13008604_2(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __invokedynamic13008604_3(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008604_4(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native int __invokedynamic13008604_5(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008604_6(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008604_7(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native java.io.InputStream __call13008604_8(moom.DD a0) throws Throwable;
private static native void __call13008604_9(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call13008604_10(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic13008604_11(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008604_13(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13008604_14(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13008604_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008604_16(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native boolean __call13008604_17(moom.JD a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead13008604_18(moom.JD a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call13008604_19(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic13008604_20(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008604_22(java.lang.String a0, moom.DD a1) throws Throwable;
private static native void __call13008604_23(java.lang.String a0) throws Throwable;
private static native int __call13008604_24(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __fieldWrite13008604_25(moom.JD a0, int a1) throws Throwable;
private static native boolean __call13008604_26(java.util.ArrayList a0, moom.JD a1) throws Throwable;
private static native void __call13008604_27(java.io.InputStream a0) throws Throwable;
private static native moom.JD[][] __call13008604_28(int a0, int a1) throws Throwable;
private static native void __call13008604_29(moom.JD[][] a0, int a1, moom.JD[][] a2, int a3, int a4) throws Throwable;
private static native void __call13008605_0(java.io.IOException a0) throws Throwable;
private static native int __invokedynamic13008605_1(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_2(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_3(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native java.io.InputStream __call13008605_4(moom.DD a0) throws Throwable;
private static native int __call13008605_5(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object[] __call13008605_6(java.util.ArrayList a0, moom.JD[] a1) throws Throwable;
private static native moom.JD[] __cast13008605_7(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __invokedynamic13008605_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_9(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native int __call13008605_10(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object[] __call13008605_11(java.util.ArrayList a0, moom.JD[] a1) throws Throwable;
private static native moom.JD[] __cast13008605_12(java.lang.Object[] a0) throws Throwable;
private static native java.lang.String __invokedynamic13008605_13(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_14(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native int __invokedynamic13008605_15(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_16(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_17(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native java.io.InputStream __call13008605_18(moom.DD a0) throws Throwable;
private static native void __call13008605_19(moom.OH a0, java.io.InputStream a1) throws Throwable;
private static native void __call13008605_20(java.io.InputStream a0) throws Throwable;
private static native java.lang.String __invokedynamic13008605_21(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_23(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call13008605_24(java.lang.String a0) throws Throwable;
private static native java.lang.String __invokedynamic13008605_25(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_26(java.lang.String a0, int a1, java.lang.String a2) throws Throwable;
private static native boolean __call13008605_27(moom.JD a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __fieldRead13008605_28(moom.JD a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.ITextureObject __call13008605_29(moom.DD a0) throws Throwable;
private static native java.lang.String __invokedynamic13008605_30(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic13008605_32(java.lang.String a0, moom.DD a1) throws Throwable;
private static native void __call13008605_33(java.lang.String a0) throws Throwable;
private static native int __call13008605_34(net.minecraft.client.renderer.texture.ITextureObject a0) throws Throwable;
private static native void __fieldWrite13008605_35(moom.JD a0, int a1) throws Throwable;
private static native boolean __call13008605_36(java.util.ArrayList a0, moom.JD a1) throws Throwable;
private static native void __call13008605_37(java.io.InputStream a0) throws Throwable;
private static native moom.JD[][] __call13008605_38(int a0, int a1) throws Throwable;
private static native void __call13008605_39(moom.JD[][] a0, int a1, moom.JD[][] a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call13008606_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008607_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008608_0(java.io.FileNotFoundException a0) throws Throwable;
private static native java.lang.Exception __call13008609_0(java.io.FileNotFoundException a0) throws Throwable;

}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.JC.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5051_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 26853;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/JC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public static void b() {
long life0_3;
    life0_3 = (moom.JC.b ^ 29613005324444L);
    try {
        moom.JC.a();
        if (moom.BU.ah()) {
        a = ((moom.JD[][])(moom.JC.a__ArrayArrayJD()));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw moom.JC.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = moom.JC.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral5053_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/JC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static void a() {
a = ((moom.JD[][])(null));
    return;
}


public static boolean a(net.minecraft.world.World p0) { return __sourceHandlerCall_8ce0af79e24513a36612(p0); }


public static void a(net.minecraft.world.World p0, net.minecraft.client.renderer.texture.TextureManager p1, float p2) { __sourceHandlerCall_370fb7d9839abffe1ca9(p0, p1, p2); }


private static moom.JD[][] a__ArrayArrayJD() { return __sourceHandlerCall_9b03c20d7f1fded55708(); }


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
        byte[] spill2619_0 = p0;
        life4_9 += 1;
        life5_44 = (spill2619_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill2619_1 = p0;
        life4_9 += 1;
        life5_76 = (spill2619_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill2619_2 = p0;
        life4_9 += 1;
        life5_91 = (spill2619_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 4259);
    if (((moom.JC.d)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(moom.JC.e)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.JC.e)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("moom/JC", life9_51);
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
        life9_116 = ((java.lang.String)((moom.JC.c)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (moom.JC.d)[life5_8] = moom.JC.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (moom.JC.d)[life5_8];
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral5053_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral5051_0() throws E;
}
