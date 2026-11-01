package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pj extends net.minecraft.client.gui.GuiScreen {

private com.moon.module.impl.ClickGUI w;

private java.util.List<com.moon.mY> x;

private java.util.Map<com.moon.cj, com.moon.nY> y;

private java.util.Map<com.moon.cj, com.moon.nY> z;

private com.moon.mQ A;

private boolean B;

private com.moon.module.impl.Effects C;

private com.moon.mZ D;

private int E;

private com.moon.mz F;

private static long G;

private static java.lang.String H;

private static long[] I;

private static java.lang.Integer[] J;

private static java.util.Map K;

public pj(com.moon.module.impl.ClickGUI p0) { super(); __sourceHandlerCall_0dad69ee03aa12957ccf(this, p0); }


static {
G = ((long)(((moom._a)(moom._c.a(((long)(-3161115954236176450L)), ((long)(1538044187882805524L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(1148864258133L)))));
    long local11_life6 = (com.moon.pj.G ^ 137894280823071L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill376_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill376_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill376_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill376_13 = new byte[8];
    (__sourceSpill376_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill376_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation376_15 = __sourceSpill376_13;
    ((javax.crypto.Cipher)(__sourceSpill376_10)).init(((int)(__sourceSpill376_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill376_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation376_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill376_19 = ((java.lang.String)("i³kÝY=«è¿¸Ï\000ænp\036")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill376_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill376_20)).doFinal(((byte[])(__sourceSpill376_19)));
    H = ((java.lang.String)(((java.lang.String)(com.moon.pj.a(((byte[])(local15_life22))))).intern()));
    K = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill376_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill376_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill376_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill376_33 = new byte[8];
    (__sourceSpill376_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill376_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation376_35 = __sourceSpill376_33;
    ((javax.crypto.Cipher)(__sourceSpill376_30)).init(((int)(__sourceSpill376_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill376_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation376_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[3];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "n÷²ñ¨_f©Ä\r \022øCm)JF§"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill376_44 = local4_life40;
        int __sourceSpill376_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill376_44)).substring(((int)(__sourceSpill376_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill376_49 = local6_life38;
        int __sourceSpill376_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill376_52 = new byte[8];
        (__sourceSpill376_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill376_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill376_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill376_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill376_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill376_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill376_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill376_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill376_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill376_53)).doFinal(((byte[])(__sourceSpill376_52)));
        (__sourceSpill376_49)[__sourceSpill376_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    I = ((long[])(local6_life38));
    J = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_0dad69ee03aa12957ccf(com.moon.pj a0, com.moon.module.impl.ClickGUI a1) throws E;
private static final class __SourceHandler_0dad69ee03aa12957ccf {

public static void f267(com.moon.pj receiver, com.moon.module.impl.ClickGUI p0) throws Throwable {
    long local2_life2 = (__fieldRead267_0() ^ __originalNumericLdc267_1());
    int[] __sourceSpill267_4 = __call267_3();
    __directSuperInit267_5(receiver);
    __fieldWrite267_6(receiver, new java.util.ArrayList());
    __fieldWrite267_7(receiver, new com.moon.pB(receiver));
    __fieldWrite267_8(receiver, new com.moon.pC(receiver));
    int[] local4_life9 = __sourceSpill267_4;
    try {
        __fieldWrite267_10(receiver, null);
        __fieldWrite267_11(receiver, 0);
        __fieldWrite267_12(receiver, null);
        __fieldWrite267_13(receiver, 0);
        __fieldWrite267_14(receiver, p0);
        if ((__call267_15() != null)) {
        __call267_16(new int[1]);
    }
    } catch (moom.Oo __catchStack267) {
        throw __call267_17(__catchStack267);
    }
    return;
}
private static native long __fieldRead267_0() throws Throwable;
private static native long __originalNumericLdc267_1() throws Throwable;
private static native int[] __call267_3() throws Throwable;
private static native void __directSuperInit267_5(com.moon.pj a0) throws Throwable;
private static native void __fieldWrite267_6(com.moon.pj a0, java.util.ArrayList a1) throws Throwable;
private static native void __fieldWrite267_7(com.moon.pj a0, com.moon.pB a1) throws Throwable;
private static native void __fieldWrite267_8(com.moon.pj a0, com.moon.pC a1) throws Throwable;
private static native void __fieldWrite267_10(com.moon.pj a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite267_11(com.moon.pj a0, int a1) throws Throwable;
private static native void __fieldWrite267_12(com.moon.pj a0, java.lang.Object a1) throws Throwable;
private static native void __fieldWrite267_13(com.moon.pj a0, int a1) throws Throwable;
private static native void __fieldWrite267_14(com.moon.pj a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native java.lang.String[] __call267_15() throws Throwable;
private static native void __call267_16(int[] a0) throws Throwable;
private static native java.lang.Exception __call267_17(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_12cb2a61a1081b55dd42(com.moon.pj a0, char a1, int a2) throws E;
private static final class __SourceHandler_12cb2a61a1081b55dd42 {

public static void f554(com.moon.pj receiver, char p0, int p1) throws Throwable {
    java.lang.Object lexicalValue554_24_0;
    int lexicalValue554_50_0;
    net.minecraft.client.gui.GuiScreen lexicalValue554_62_0;
    net.minecraft.client.Minecraft lexicalValue554_65_0;
    com.moon.pj lexicalValue554_81_0;
    com.moon.mQ spill554_0;
    com.moon.pj spill554_1;
    boolean spill554_2;
    net.minecraft.client.Minecraft spill554_3;
    com.moon.pj spill554_4;
    long life3_3;
    int[] life5_5;
    java.util.Iterator life6_117;
    com.moon.mY life7_124;
    lexical_join_103: {
    lexical_join_99: {
    lexical_join_81: {
    lexical_join_80: {
    lexical_join_69: {
    lexical_join_68: {
    lexical_join_66: {
    lexical_join_65: {
    lexical_join_62: {
    lexical_join_53: {
    lexical_join_50: {
    lexical_join_24: {
    lexical_join_18: {
    life3_3 = (__fieldRead554_0() ^ 40837292671716L);
    life5_5 = __call554_1();
    if (!((p1 == 1))) {
        break lexical_join_69;
    }
    spill554_0 = __fieldRead554_2(receiver);
    if (!((life5_5 == null))) {
        lexicalValue554_24_0 = spill554_0;
        break lexical_join_24;
    }
    if (!((spill554_0 != null))) {
        break lexical_join_18;
    }
    __call554_3(receiver, null);
    return;
    }
    spill554_1 = receiver;
    if (!((life5_5 == null))) {
        lexicalValue554_62_0 = spill554_1;
        break lexical_join_62;
    }
    lexicalValue554_24_0 = __call554_6(__call554_5(__fieldRead554_4(spill554_1)));
    }
    if (!(__call554_8(__cast554_7(lexicalValue554_24_0)))) {
        break lexical_join_53;
    }
    spill554_2 = __fieldRead554_9(receiver);
    if (!((life5_5 == null))) {
        lexicalValue554_50_0 = __integerCategory554_10(spill554_2);
        break lexical_join_50;
    }
    if (!((!spill554_2))) {
        break lexical_join_68;
    }
    __fieldWrite554_11(receiver, 1);
    __call554_14(receiver, __call554_13(__fieldRead554_12(receiver)), 0x1.0p0f, 0);
    __call554_17(receiver, __call554_16(__fieldRead554_15(receiver)), 0x1.0p0f, 0);
    lexicalValue554_50_0 = 0;
    }
    __call554_18(lexicalValue554_50_0);
    if (!((life5_5 != null))) {
        break lexical_join_68;
    }
    }
    __call554_20(__fieldRead554_19(receiver), null);
    spill554_3 = __fieldRead554_21(receiver);
    if (!((life5_5 == null))) {
        lexicalValue554_65_0 = spill554_3;
        break lexical_join_65;
    }
    lexicalValue554_62_0 = __fieldRead554_22(spill554_3);
    }
    if (!((lexicalValue554_62_0 == null))) {
        break lexical_join_66;
    }
    lexicalValue554_65_0 = __fieldRead554_23(receiver);
    }
    __call554_24(lexicalValue554_65_0);
    }
    __call554_25(0);
    }
    return;
    }
    spill554_4 = receiver;
    if (!((life5_5 == null))) {
        lexicalValue554_81_0 = spill554_4;
        break lexical_join_81;
    }
    if (!((__fieldRead554_26(spill554_4) != null))) {
        break lexical_join_80;
    }
    __call554_28(__fieldRead554_27(receiver), p0, p1);
    return;
    }
    lexicalValue554_81_0 = receiver;
    }
    life6_117 = __call554_30(__fieldRead554_29(lexicalValue554_81_0));
    lexical_cycle_84: while (true) {
    if (!(__call554_31(life6_117))) {
        break lexical_join_99;
    }
    life7_124 = __cast554_33(__call554_32(life6_117));
    __call554_34(life7_124, p0, p1);
    if (!((life5_5 == null))) {
        break lexical_join_103;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_84; }
    break lexical_cycle_84;
    }
    }
    __call554_35(receiver, p0, p1);
    }
    return;
}
public static void h554_0(java.io.IOException p0) throws Throwable {
    throw __call1055400_0(p0);
}
public static void h554_1(java.io.IOException p0) throws Throwable {
    throw __call1055401_0(p0);
}
public static void h554_2(java.io.IOException p0) throws Throwable {
    throw __call1055402_0(p0);
}
public static void h554_3(java.io.IOException p0) throws Throwable {
    throw __call1055403_0(p0);
}
public static void h554_4(java.io.IOException p0) throws Throwable {
    throw __call1055404_0(p0);
}
public static void h554_5(java.io.IOException p0) throws Throwable {
    throw __call1055405_0(p0);
}
public static void h554_6(java.io.IOException p0) throws Throwable {
    throw __call1055406_0(p0);
}
public static void h554_7(java.io.IOException p0) throws Throwable {
    throw __call1055407_0(p0);
}
public static void h554_8(java.io.IOException p0) throws Throwable {
    throw __call1055408_0(p0);
}
public static void h554_9(java.io.IOException p0) throws Throwable {
    throw __call1055409_0(p0);
}
public static void h554_10(java.io.IOException p0) throws Throwable {
    throw __call1055410_0(p0);
}
public static void h554_11(java.io.IOException p0) throws Throwable {
    throw __call1055411_0(p0);
}
public static void h554_12(java.io.IOException p0) throws Throwable {
    throw __call1055412_0(p0);
}
private static native long __fieldRead554_0() throws Throwable;
private static native int[] __call554_1() throws Throwable;
private static native com.moon.mQ __fieldRead554_2(com.moon.pj a0) throws Throwable;
private static native void __call554_3(com.moon.pj a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead554_4(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call554_5(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call554_6(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast554_7(java.lang.Object a0) throws Throwable;
private static native boolean __call554_8(java.lang.Boolean a0) throws Throwable;
private static native boolean __fieldRead554_9(com.moon.pj a0) throws Throwable;
private static native int __integerCategory554_10(boolean value) throws Throwable;
private static native void __fieldWrite554_11(com.moon.pj a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead554_12(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call554_13(java.util.Map a0) throws Throwable;
private static native void __call554_14(com.moon.pj a0, java.util.Collection a1, float a2, int a3) throws Throwable;
private static native java.util.Map __fieldRead554_15(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call554_16(java.util.Map a0) throws Throwable;
private static native void __call554_17(com.moon.pj a0, java.util.Collection a1, float a2, int a3) throws Throwable;
private static native void __call554_18(int a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead554_19(com.moon.pj a0) throws Throwable;
private static native void __call554_20(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead554_21(com.moon.pj a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead554_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead554_23(com.moon.pj a0) throws Throwable;
private static native void __call554_24(net.minecraft.client.Minecraft a0) throws Throwable;
private static native void __call554_25(int a0) throws Throwable;
private static native com.moon.mQ __fieldRead554_26(com.moon.pj a0) throws Throwable;
private static native com.moon.mQ __fieldRead554_27(com.moon.pj a0) throws Throwable;
private static native void __call554_28(com.moon.mQ a0, char a1, int a2) throws Throwable;
private static native java.util.List __fieldRead554_29(com.moon.pj a0) throws Throwable;
private static native java.util.Iterator __call554_30(java.util.List a0) throws Throwable;
private static native boolean __call554_31(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call554_32(java.util.Iterator a0) throws Throwable;
private static native com.moon.mY __cast554_33(java.lang.Object a0) throws Throwable;
private static native void __call554_34(com.moon.mY a0, char a1, int a2) throws Throwable;
private static native void __call554_35(com.moon.pj a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1055400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055405_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055406_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055407_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055408_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055409_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055410_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055411_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055412_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4116c52869066a75b68b(com.moon.pj a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_4116c52869066a75b68b {

public static void f555(com.moon.pj receiver, int p0, int p1, int p2) throws Throwable {
    com.moon.pj lexicalValue555_19_0;
    com.moon.pj lexicalValue555_54_0;
    com.moon.pj spill555_0;
    com.moon.pj spill555_1;
    long life4_3;
    int[] life6_5;
    java.util.Iterator life7_26;
    com.moon.mY life8_33;
    lexical_join_58: {
    lexical_join_54: {
    lexical_join_53: {
    lexical_join_38: {
    lexical_join_19: {
    lexical_join_18: {
    life4_3 = (__fieldRead555_0() ^ 137916015312947L);
    life6_5 = __call555_1();
    spill555_0 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue555_19_0 = spill555_0;
        break lexical_join_19;
    }
    if (!((__fieldRead555_2(spill555_0) != null))) {
        break lexical_join_18;
    }
    __call555_4(__fieldRead555_3(receiver), p0, p1, p2);
    return;
    }
    lexicalValue555_19_0 = receiver;
    }
    life7_26 = __call555_6(__fieldRead555_5(lexicalValue555_19_0));
    lexical_cycle_22: while (true) {
    if (!(__call555_7(life7_26))) {
        break lexical_join_38;
    }
    life8_33 = __cast555_9(__call555_8(life7_26));
    __call555_10(life8_33, p0, p1, p2);
    if (!((life6_5 == null))) {
        break lexical_join_58;
    }
    if (!((life6_5 != null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    spill555_1 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue555_54_0 = spill555_1;
        break lexical_join_54;
    }
    if (!(__call555_12(__fieldRead555_11(spill555_1), p0, p1, p2))) {
        break lexical_join_53;
    }
    __call555_14(__fieldRead555_13(receiver), new com.moon.pl());
    }
    lexicalValue555_54_0 = receiver;
    }
    __call555_15(lexicalValue555_54_0, p0, p1, p2);
    }
    return;
}
public static void h555_0(java.io.IOException p0) throws Throwable {
    throw __call1055500_0(p0);
}
public static void h555_1(java.io.IOException p0) throws Throwable {
    throw __call1055501_0(p0);
}
public static void h555_2(java.io.IOException p0) throws Throwable {
    throw __call1055502_0(p0);
}
public static void h555_3(java.io.IOException p0) throws Throwable {
    throw __call1055503_0(p0);
}
public static void h555_4(java.io.IOException p0) throws Throwable {
    throw __call1055504_0(p0);
}
private static native long __fieldRead555_0() throws Throwable;
private static native int[] __call555_1() throws Throwable;
private static native com.moon.mQ __fieldRead555_2(com.moon.pj a0) throws Throwable;
private static native com.moon.mQ __fieldRead555_3(com.moon.pj a0) throws Throwable;
private static native void __call555_4(com.moon.mQ a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.List __fieldRead555_5(com.moon.pj a0) throws Throwable;
private static native java.util.Iterator __call555_6(java.util.List a0) throws Throwable;
private static native boolean __call555_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call555_8(java.util.Iterator a0) throws Throwable;
private static native com.moon.mY __cast555_9(java.lang.Object a0) throws Throwable;
private static native void __call555_10(com.moon.mY a0, int a1, int a2, int a3) throws Throwable;
private static native com.moon.mz __fieldRead555_11(com.moon.pj a0) throws Throwable;
private static native boolean __call555_12(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead555_13(com.moon.pj a0) throws Throwable;
private static native void __call555_14(net.minecraft.client.Minecraft a0, com.moon.pl a1) throws Throwable;
private static native void __call555_15(com.moon.pj a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1055500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055502_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055503_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1055504_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e5d4bbdb8d5059f3e7b7(com.moon.pj a0, com.moon.ej a1) throws E;
private static final class __SourceHandler_e5d4bbdb8d5059f3e7b7 {

public static void f556(com.moon.pj receiver, com.moon.ej p0) throws Throwable {
    com.moon.pj lexicalValue556_21_0;
    java.util.Collection lexicalValue556_21_1;
    float lexicalValue556_21_2;
    float lexicalValue556_21_3;
    int lexicalValue556_21_4;
    com.moon.pj lexicalValue556_22_0;
    java.util.Collection lexicalValue556_22_1;
    float lexicalValue556_22_2;
    float lexicalValue556_22_3;
    com.moon.pj lexicalValue556_23_0;
    java.util.Collection lexicalValue556_23_1;
    float lexicalValue556_23_2;
    float lexicalValue556_23_3;
    int lexicalValue556_23_4;
    com.moon.pj lexicalValue556_36_0;
    java.util.Collection lexicalValue556_36_1;
    float lexicalValue556_36_2;
    float lexicalValue556_36_3;
    int lexicalValue556_36_4;
    com.moon.pj lexicalValue556_37_0;
    java.util.Collection lexicalValue556_37_1;
    float lexicalValue556_37_2;
    float lexicalValue556_37_3;
    com.moon.pj lexicalValue556_38_0;
    java.util.Collection lexicalValue556_38_1;
    float lexicalValue556_38_2;
    float lexicalValue556_38_3;
    int lexicalValue556_38_4;
    float lexicalValue556_68_0;
    float lexicalValue556_68_1;
    com.moon.pj spill556_0;
    java.util.Collection spill556_1;
    float spill556_2;
    float spill556_3;
    boolean spill556_4;
    com.moon.pj spill556_5;
    java.util.Collection spill556_6;
    float spill556_7;
    float spill556_8;
    boolean spill556_9;
    float spill556_10;
    float spill556_11;
    long life2_3;
    int[] life4_5;
    java.util.Iterator life5_51;
    com.moon.mY life6_58;
    float life7_63;
    float life8_68;
    float life9_84;
    float life10_88;
    float life11_92;
    lexical_join_100: {
    lexical_join_38: {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_23: {
    lexical_join_22: {
    lexical_join_21: {
    life2_3 = (__fieldRead556_0() ^ 59378036618312L);
    life4_5 = __call556_1();
    if (!(__call556_2(p0))) {
        break lexical_join_100;
    }
    spill556_0 = receiver;
    spill556_1 = __call556_4(__fieldRead556_3(receiver));
    spill556_2 = 0x0.0p0f;
    spill556_3 = 0x1.0p0f;
    spill556_4 = __fieldRead556_5(receiver);
    if (!((life4_5 == null))) {
        lexicalValue556_21_0 = spill556_0;
        lexicalValue556_21_1 = spill556_1;
        lexicalValue556_21_2 = spill556_2;
        lexicalValue556_21_3 = spill556_3;
        lexicalValue556_21_4 = __integerCategory556_6(spill556_4);
        break lexical_join_21;
    }
    if (!((!spill556_4))) {
        lexicalValue556_22_0 = spill556_0;
        lexicalValue556_22_1 = spill556_1;
        lexicalValue556_22_2 = spill556_2;
        lexicalValue556_22_3 = spill556_3;
        break lexical_join_22;
    }
    lexicalValue556_21_0 = spill556_0;
    lexicalValue556_21_1 = spill556_1;
    lexicalValue556_21_2 = spill556_2;
    lexicalValue556_21_3 = spill556_3;
    lexicalValue556_21_4 = 1;
    }
    lexicalValue556_23_0 = lexicalValue556_21_0;
    lexicalValue556_23_1 = lexicalValue556_21_1;
    lexicalValue556_23_2 = lexicalValue556_21_2;
    lexicalValue556_23_3 = lexicalValue556_21_3;
    lexicalValue556_23_4 = lexicalValue556_21_4;
    break lexical_join_23;
    }
    lexicalValue556_23_0 = lexicalValue556_22_0;
    lexicalValue556_23_1 = lexicalValue556_22_1;
    lexicalValue556_23_2 = lexicalValue556_22_2;
    lexicalValue556_23_3 = lexicalValue556_22_3;
    lexicalValue556_23_4 = 0;
    }
    __call556_7(lexicalValue556_23_0, lexicalValue556_23_1, lexicalValue556_23_2, lexicalValue556_23_3, lexicalValue556_23_4);
    spill556_5 = receiver;
    spill556_6 = __call556_9(__fieldRead556_8(receiver));
    spill556_7 = 0x0.0p0f;
    spill556_8 = 0x1.0p0f;
    spill556_9 = __fieldRead556_10(receiver);
    if (!((life4_5 == null))) {
        lexicalValue556_36_0 = spill556_5;
        lexicalValue556_36_1 = spill556_6;
        lexicalValue556_36_2 = spill556_7;
        lexicalValue556_36_3 = spill556_8;
        lexicalValue556_36_4 = __integerCategory556_11(spill556_9);
        break lexical_join_36;
    }
    if (!((!spill556_9))) {
        lexicalValue556_37_0 = spill556_5;
        lexicalValue556_37_1 = spill556_6;
        lexicalValue556_37_2 = spill556_7;
        lexicalValue556_37_3 = spill556_8;
        break lexical_join_37;
    }
    lexicalValue556_36_0 = spill556_5;
    lexicalValue556_36_1 = spill556_6;
    lexicalValue556_36_2 = spill556_7;
    lexicalValue556_36_3 = spill556_8;
    lexicalValue556_36_4 = 1;
    }
    lexicalValue556_38_0 = lexicalValue556_36_0;
    lexicalValue556_38_1 = lexicalValue556_36_1;
    lexicalValue556_38_2 = lexicalValue556_36_2;
    lexicalValue556_38_3 = lexicalValue556_36_3;
    lexicalValue556_38_4 = lexicalValue556_36_4;
    break lexical_join_38;
    }
    lexicalValue556_38_0 = lexicalValue556_37_0;
    lexicalValue556_38_1 = lexicalValue556_37_1;
    lexicalValue556_38_2 = lexicalValue556_37_2;
    lexicalValue556_38_3 = lexicalValue556_37_3;
    lexicalValue556_38_4 = 0;
    }
    __call556_12(lexicalValue556_38_0, lexicalValue556_38_1, lexicalValue556_38_2, lexicalValue556_38_3, lexicalValue556_38_4);
    life5_51 = __call556_14(__fieldRead556_13(receiver));
    lexical_cycle_43: while (true) {
    lexical_join_98: {
    lexical_join_68: {
    if (!(__call556_15(life5_51))) {
        break lexical_join_100;
    }
    life6_58 = __cast556_17(__call556_16(life5_51));
    life7_63 = __call556_19(__call556_18(receiver, 0));
    life8_68 = __call556_21(__call556_20(receiver, 1));
    spill556_10 = life8_68;
    spill556_11 = 0x1.0p-1f;
    if (!((life4_5 == null))) {
        lexicalValue556_68_0 = spill556_10;
        lexicalValue556_68_1 = spill556_11;
        break lexical_join_68;
    }
    if (!((__numericCompare556_22(spill556_10, spill556_11) > 0))) {
        break lexical_join_98;
    }
    lexicalValue556_68_0 = 0x1.0p0f;
    lexicalValue556_68_1 = life7_63;
    }
    life9_84 = (lexicalValue556_68_0 - lexicalValue556_68_1);
    life10_88 = (life9_84 / 0x1.0p1f);
    life11_92 = (life9_84 / 0x1.0p1f);
    __call556_23(life7_63, life7_63, 0x1.0p0f);
    __call556_24(life10_88, life11_92, 0x0.0p0f);
    __call556_25(life8_68);
    __call556_28(life6_58, p0, __call556_27(__call556_26(receiver, 0)));
    __call556_29();
    __call556_30();
    __call556_31();
    }
    if (!((life4_5 != null))) { continue lexical_cycle_43; }
    break lexical_cycle_43;
    }
    }
    return;
}
public static void h556_0(moom.Oo p0) throws Throwable {
    throw __call1055600_0(p0);
}
public static void h556_1(moom.Oo p0) throws Throwable {
    throw __call1055601_0(p0);
}
public static void h556_2(moom.Oo p0) throws Throwable {
    throw __call1055602_0(p0);
}
public static void h556_3(moom.Oo p0) throws Throwable {
    throw __call1055603_0(p0);
}
public static void h556_4(moom.Oo p0) throws Throwable {
    throw __call1055604_0(p0);
}
private static native long __fieldRead556_0() throws Throwable;
private static native int[] __call556_1() throws Throwable;
private static native boolean __call556_2(com.moon.ej a0) throws Throwable;
private static native java.util.Map __fieldRead556_3(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call556_4(java.util.Map a0) throws Throwable;
private static native boolean __fieldRead556_5(com.moon.pj a0) throws Throwable;
private static native int __integerCategory556_6(boolean value) throws Throwable;
private static native void __call556_7(com.moon.pj a0, java.util.Collection a1, float a2, float a3, int a4) throws Throwable;
private static native java.util.Map __fieldRead556_8(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call556_9(java.util.Map a0) throws Throwable;
private static native boolean __fieldRead556_10(com.moon.pj a0) throws Throwable;
private static native int __integerCategory556_11(boolean value) throws Throwable;
private static native void __call556_12(com.moon.pj a0, java.util.Collection a1, float a2, float a3, int a4) throws Throwable;
private static native java.util.List __fieldRead556_13(com.moon.pj a0) throws Throwable;
private static native java.util.Iterator __call556_14(java.util.List a0) throws Throwable;
private static native boolean __call556_15(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call556_16(java.util.Iterator a0) throws Throwable;
private static native com.moon.mY __cast556_17(java.lang.Object a0) throws Throwable;
private static native com.moon.nY __call556_18(com.moon.pj a0, int a1) throws Throwable;
private static native float __call556_19(com.moon.nY a0) throws Throwable;
private static native com.moon.nY __call556_20(com.moon.pj a0, int a1) throws Throwable;
private static native float __call556_21(com.moon.nY a0) throws Throwable;
private static native int __numericCompare556_22(float a0, float a1) throws Throwable;
private static native void __call556_23(float a0, float a1, float a2) throws Throwable;
private static native void __call556_24(float a0, float a1, float a2) throws Throwable;
private static native void __call556_25(float a0) throws Throwable;
private static native com.moon.nY __call556_26(com.moon.pj a0, int a1) throws Throwable;
private static native float __call556_27(com.moon.nY a0) throws Throwable;
private static native void __call556_28(com.moon.mY a0, com.moon.ej a1, float a2) throws Throwable;
private static native void __call556_29() throws Throwable;
private static native void __call556_30() throws Throwable;
private static native void __call556_31() throws Throwable;
private static native java.lang.Exception __call1055600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055604_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_16923a928f2b89bb2173(com.moon.pj a0, com.moon.mQ a1) throws E;
private static final class __SourceHandler_16923a928f2b89bb2173 {

public static void f557(com.moon.pj receiver, com.moon.mQ p0) throws Throwable {
    com.moon.mQ forwardValue557_14_0;
    int[] spill557_0;
    com.moon.mQ spill557_1;
    long life2_3;
    int[] life4_8;
    forward_join_15: {
    forward_join_14: {
    life2_3 = (__fieldRead557_0() ^ 89777767155763L);
    spill557_0 = __call557_1();
    __fieldWrite557_2(receiver, p0);
    life4_8 = spill557_0;
    spill557_1 = p0;
    if (!((life4_8 == null))) {
        forwardValue557_14_0 = spill557_1;
        break forward_join_14;
    }
    if (!((spill557_1 != null))) {
        break forward_join_15;
    }
    forwardValue557_14_0 = p0;
    }
    __call557_3(forwardValue557_14_0);
    }
    return;
}
public static void h557_0(moom.Oo p0) throws Throwable {
    throw __call1055700_0(p0);
}
private static native long __fieldRead557_0() throws Throwable;
private static native int[] __call557_1() throws Throwable;
private static native void __fieldWrite557_2(com.moon.pj a0, com.moon.mQ a1) throws Throwable;
private static native void __call557_3(com.moon.mQ a0) throws Throwable;
private static native java.lang.Exception __call1055700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4e2e90e4cae21b5b5498(com.moon.pj a0, java.util.Collection a1, float a2, boolean a3) throws E;
private static final class __SourceHandler_4e2e90e4cae21b5b5498 {

public static void f558(com.moon.pj receiver, java.util.Collection p0, float p1, boolean p2) throws Throwable {
    int[] spill558_0;
    long life4_3;
    java.util.Iterator life7_7;
    int[] life6_8;
    com.moon.nY life8_15;
    lexical_join_32: {
    life4_3 = (__fieldRead558_0() ^ 67697204280888L);
    spill558_0 = __call558_1();
    life7_7 = __call558_2(p0);
    life6_8 = spill558_0;
    lexical_cycle_9: while (true) {
    lexical_join_30: {
    lexical_join_27: {
    lexical_join_25: {
    if (!(__call558_3(life7_7))) {
        break lexical_join_32;
    }
    life8_15 = __cast558_5(__call558_4(life7_7));
    if (!((life6_8 == null))) {
        break lexical_join_25;
    }
    if (!(p2)) {
        break lexical_join_27;
    }
    __call558_6(life8_15, p1);
    __call558_7(life8_15);
    }
    if (!((life6_8 != null))) {
        break lexical_join_30;
    }
    }
    __call558_8(life8_15, p1);
    }
    if (!((life6_8 != null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}
public static void h558_0(moom.Oo p0) throws Throwable {
    throw __call1055800_0(p0);
}
public static void h558_1(moom.Oo p0) throws Throwable {
    throw __call1055801_0(p0);
}
public static void h558_2(moom.Oo p0) throws Throwable {
    throw __call1055802_0(p0);
}
private static native long __fieldRead558_0() throws Throwable;
private static native int[] __call558_1() throws Throwable;
private static native java.util.Iterator __call558_2(java.util.Collection a0) throws Throwable;
private static native boolean __call558_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call558_4(java.util.Iterator a0) throws Throwable;
private static native com.moon.nY __cast558_5(java.lang.Object a0) throws Throwable;
private static native void __call558_6(com.moon.nY a0, float a1) throws Throwable;
private static native void __call558_7(com.moon.nY a0) throws Throwable;
private static native void __call558_8(com.moon.nY a0, float a1) throws Throwable;
private static native java.lang.Exception __call1055800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> com.moon.nY __sourceHandlerCall_ec88254f94a72ce9420d(com.moon.pj a0, boolean a1) throws E;
private static final class __SourceHandler_ec88254f94a72ce9420d {

public static com.moon.nY f559(com.moon.pj receiver, boolean p0) throws Throwable {
    int forwardValue559_36_0;
    boolean spill559_0;
    long life2_3;
    int[] life4_5;
    forward_join_48: {
    forward_join_36: {
    forward_join_35: {
    forward_join_24: {
    life2_3 = (__fieldRead559_0() ^ 118562733111364L);
    life4_5 = __call559_1();
    spill559_0 = __fieldRead559_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue559_36_0 = __integerCategory559_3(spill559_0);
        break forward_join_36;
    }
    if (!(spill559_0)) {
        break forward_join_35;
    }
    if (!(p0)) {
        break forward_join_24;
    }
    return __cast559_11(__call559_10(__fieldRead559_4(receiver), __call559_9(__cast559_8(__call559_7(__call559_6(__fieldRead559_5(receiver)))))));
    }
    return __cast559_19(__call559_18(__fieldRead559_12(receiver), __call559_17(__cast559_16(__call559_15(__call559_14(__fieldRead559_13(receiver)))))));
    }
    forwardValue559_36_0 = __integerCategory559_20(p0);
    }
    if (!((forwardValue559_36_0 != 0))) {
        break forward_join_48;
    }
    return __cast559_28(__call559_27(__fieldRead559_21(receiver), __call559_26(__cast559_25(__call559_24(__call559_23(__fieldRead559_22(receiver)))))));
    }
    return __cast559_36(__call559_35(__fieldRead559_29(receiver), __call559_34(__cast559_33(__call559_32(__call559_31(__fieldRead559_30(receiver)))))));
}
public static void h559_0(moom.Oo p0) throws Throwable {
    throw __call1055900_0(p0);
}
public static void h559_1(moom.Oo p0) throws Throwable {
    throw __call1055901_0(p0);
}
public static void h559_2(moom.Oo p0) throws Throwable {
    throw __call1055902_0(p0);
}
public static void h559_3(moom.Oo p0) throws Throwable {
    throw __call1055903_0(p0);
}
private static native long __fieldRead559_0() throws Throwable;
private static native int[] __call559_1() throws Throwable;
private static native boolean __fieldRead559_2(com.moon.pj a0) throws Throwable;
private static native int __integerCategory559_3(boolean value) throws Throwable;
private static native java.util.Map __fieldRead559_4(com.moon.pj a0) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead559_5(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.ModeSetting __call559_6(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call559_7(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bN __cast559_8(java.lang.Object a0) throws Throwable;
private static native com.moon.cj __call559_9(com.moon.bN a0) throws Throwable;
private static native java.lang.Object __call559_10(java.util.Map a0, com.moon.cj a1) throws Throwable;
private static native com.moon.nY __cast559_11(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead559_12(com.moon.pj a0) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead559_13(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.ModeSetting __call559_14(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call559_15(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bN __cast559_16(java.lang.Object a0) throws Throwable;
private static native com.moon.cj __call559_17(com.moon.bN a0) throws Throwable;
private static native java.lang.Object __call559_18(java.util.Map a0, com.moon.cj a1) throws Throwable;
private static native com.moon.nY __cast559_19(java.lang.Object a0) throws Throwable;
private static native int __integerCategory559_20(boolean value) throws Throwable;
private static native java.util.Map __fieldRead559_21(com.moon.pj a0) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead559_22(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.ModeSetting __call559_23(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call559_24(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bQ __cast559_25(java.lang.Object a0) throws Throwable;
private static native com.moon.cj __call559_26(com.moon.bQ a0) throws Throwable;
private static native java.lang.Object __call559_27(java.util.Map a0, com.moon.cj a1) throws Throwable;
private static native com.moon.nY __cast559_28(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead559_29(com.moon.pj a0) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead559_30(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.ModeSetting __call559_31(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call559_32(com.moon.setting.ModeSetting a0) throws Throwable;
private static native com.moon.bQ __cast559_33(java.lang.Object a0) throws Throwable;
private static native com.moon.cj __call559_34(com.moon.bQ a0) throws Throwable;
private static native java.lang.Object __call559_35(java.util.Map a0, com.moon.cj a1) throws Throwable;
private static native com.moon.nY __cast559_36(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1055900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1055903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_722aebf08ab233ac1934(com.moon.pj a0) throws E;
private static final class __SourceHandler_722aebf08ab233ac1934 {

public static void f560(com.moon.pj receiver) throws Throwable {
    int[] spill560_0;
    long life1_3;
    float life4_6;
    int[] life3_7;
    float life5_9;
    com.moon.module.ModuleCategory[] life6_11;
    com.moon.module.ModuleCategory[] life7_13;
    int life8_16;
    int life9_18;
    com.moon.module.ModuleCategory life10_25;
    com.moon.mZ life11_34;
    lexical_join_72: {
    life1_3 = (__fieldRead560_0() ^ 97251620518124L);
    spill560_0 = __call560_1();
    life4_6 = 0x1.4p3f;
    life3_7 = spill560_0;
    life5_9 = 0x1.4p3f;
    life6_11 = __call560_2();
    life7_13 = life6_11;
    life8_16 = (life7_13).length;
    life9_18 = 0;
    lexical_cycle_19: while (true) {
    lexical_join_70: {
    lexical_join_69: {
    if (!((life9_18 < life8_16))) {
        break lexical_join_72;
    }
    life10_25 = (life7_13)[life9_18];
    life11_34 = new com.moon.mZ(life10_25, life4_6, life5_9, 0x1.32p7f, 0x1.5ep8f);
    __call560_4(life11_34, __fieldRead560_3(receiver));
    __call560_11(life11_34, __call560_10(__call560_9(__cast560_8(__call560_7(__call560_6(__fieldRead560_5(receiver)))))));
    __call560_13(__fieldRead560_12(receiver), life11_34);
    __call560_14(life11_34);
    life4_6 = (life4_6 + 0x1.3ap7f);
    if (!((life3_7 == null))) {
        break lexical_join_70;
    }
    if (!((life10_25 == __fieldRead560_15()))) {
        break lexical_join_69;
    }
    __fieldWrite560_16(receiver, life11_34);
    }
    life9_18 += 1;
    }
    if (!((life3_7 != null))) { continue lexical_cycle_19; }
    break lexical_cycle_19;
    }
    }
    return;
}
public static void h560_0(moom.Oo p0) throws Throwable {
    throw __call1056000_0(p0);
}
public static void h560_1(moom.Oo p0) throws Throwable {
    throw __call1056001_0(p0);
}
private static native long __fieldRead560_0() throws Throwable;
private static native int[] __call560_1() throws Throwable;
private static native com.moon.module.ModuleCategory[] __call560_2() throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead560_3(com.moon.pj a0) throws Throwable;
private static native com.moon.mY __call560_4(com.moon.mZ a0, com.moon.module.impl.ClickGUI a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead560_5(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.ColorSetting __call560_6(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call560_7(com.moon.setting.ColorSetting a0) throws Throwable;
private static native java.lang.Integer __cast560_8(java.lang.Object a0) throws Throwable;
private static native int __call560_9(java.lang.Integer a0) throws Throwable;
private static native com.v __call560_10(int a0) throws Throwable;
private static native com.moon.mY __call560_11(com.moon.mZ a0, com.v a1) throws Throwable;
private static native java.util.List __fieldRead560_12(com.moon.pj a0) throws Throwable;
private static native boolean __call560_13(java.util.List a0, com.moon.mZ a1) throws Throwable;
private static native void __call560_14(com.moon.mZ a0) throws Throwable;
private static native com.moon.module.ModuleCategory __fieldRead560_15() throws Throwable;
private static native void __fieldWrite560_16(com.moon.pj a0, com.moon.mZ a1) throws Throwable;
private static native java.lang.Exception __call1056000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056001_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b7da47b8f6ffcac2c8cc(com.moon.pj a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_b7da47b8f6ffcac2c8cc {

public static void f561(com.moon.pj receiver, int p0, int p1, int p2) throws Throwable {
    com.moon.pj lexicalValue561_19_0;
    com.moon.pj spill561_0;
    long life4_3;
    int[] life6_5;
    java.util.Iterator life7_26;
    com.moon.mY life8_33;
    lexical_join_43: {
    lexical_join_38: {
    lexical_join_19: {
    lexical_join_18: {
    life4_3 = (__fieldRead561_0() ^ 60267317394991L);
    life6_5 = __call561_1();
    spill561_0 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue561_19_0 = spill561_0;
        break lexical_join_19;
    }
    if (!((__fieldRead561_2(spill561_0) != null))) {
        break lexical_join_18;
    }
    __call561_4(__fieldRead561_3(receiver), p0, p1, p2);
    return;
    }
    lexicalValue561_19_0 = receiver;
    }
    life7_26 = __call561_6(__fieldRead561_5(lexicalValue561_19_0));
    lexical_cycle_22: while (true) {
    if (!(__call561_7(life7_26))) {
        break lexical_join_38;
    }
    life8_33 = __cast561_9(__call561_8(life7_26));
    __call561_10(life8_33, p0, p1, p2);
    if (!((life6_5 == null))) {
        break lexical_join_43;
    }
    if (!((life6_5 != null))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    __call561_11(receiver, p0, p1, p2);
    }
    return;
}
public static void h561_0(moom.Oo p0) throws Throwable {
    throw __call1056100_0(p0);
}
public static void h561_1(moom.Oo p0) throws Throwable {
    throw __call1056101_0(p0);
}
public static void h561_2(moom.Oo p0) throws Throwable {
    throw __call1056102_0(p0);
}
private static native long __fieldRead561_0() throws Throwable;
private static native int[] __call561_1() throws Throwable;
private static native com.moon.mQ __fieldRead561_2(com.moon.pj a0) throws Throwable;
private static native com.moon.mQ __fieldRead561_3(com.moon.pj a0) throws Throwable;
private static native void __call561_4(com.moon.mQ a0, int a1, int a2, int a3) throws Throwable;
private static native java.util.List __fieldRead561_5(com.moon.pj a0) throws Throwable;
private static native java.util.Iterator __call561_6(java.util.List a0) throws Throwable;
private static native boolean __call561_7(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call561_8(java.util.Iterator a0) throws Throwable;
private static native com.moon.mY __cast561_9(java.lang.Object a0) throws Throwable;
private static native void __call561_10(com.moon.mY a0, int a1, int a2, int a3) throws Throwable;
private static native void __call561_11(com.moon.pj a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1056100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0094d5bcd1e1aebf7329(com.moon.pj a0) throws E;
private static final class __SourceHandler_0094d5bcd1e1aebf7329 {

public static void f562(com.moon.pj receiver) throws Throwable {
    com.moon.pj lexicalValue562_21_0;
    com.moon.module.impl.Effects lexicalValue562_34_0;
    com.moon.pj lexicalValue562_37_0;
    com.moon.pj spill562_0;
    com.moon.pj spill562_1;
    com.moon.module.impl.Effects spill562_2;
    long life1_3;
    int[] life3_5;
    java.util.Iterator life4_57;
    com.moon.mY life5_64;
    lexical_join_51: {
    lexical_join_37: {
    lexical_join_36: {
    lexical_join_34: {
    lexical_join_32: {
    lexical_join_21: {
    lexical_join_20: {
    life1_3 = (__fieldRead562_0() ^ 111950729219463L);
    life3_5 = __call562_1();
    spill562_0 = receiver;
    if (!((life3_5 == null))) {
        lexicalValue562_21_0 = spill562_0;
        break lexical_join_21;
    }
    if (!(__call562_3(__call562_2(spill562_0, 1)))) {
        break lexical_join_20;
    }
    spill562_1 = receiver;
    if (!((life3_5 == null))) {
        lexicalValue562_37_0 = spill562_1;
        break lexical_join_37;
    }
    if (!((!__call562_5(__call562_4(spill562_1, 0))))) {
        break lexical_join_36;
    }
    }
    lexicalValue562_21_0 = receiver;
    }
    spill562_2 = __fieldRead562_6(lexicalValue562_21_0);
    if (!((life3_5 == null))) {
        lexicalValue562_34_0 = spill562_2;
        break lexical_join_34;
    }
    if (!((spill562_2 == null))) {
        break lexical_join_32;
    }
    __fieldWrite562_12(receiver, __cast562_11(__call562_10(__call562_8(__call562_7()), __classLiteral562_9())));
    }
    lexicalValue562_34_0 = __fieldRead562_13(receiver);
    }
    __call562_15(__call562_14(lexicalValue562_34_0));
    }
    lexicalValue562_37_0 = receiver;
    }
    life4_57 = __call562_17(__fieldRead562_16(lexicalValue562_37_0));
    lexical_cycle_40: while (true) {
    if (!(__call562_18(life4_57))) {
        break lexical_join_51;
    }
    life5_64 = __cast562_20(__call562_19(life4_57));
    __call562_21(life5_64);
    if (!((life3_5 != null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    return;
}
public static void h562_0(moom.Oo p0) throws Throwable {
    throw __call1056200_0(p0);
}
public static void h562_1(moom.Oo p0) throws Throwable {
    throw __call1056201_0(p0);
}
public static void h562_2(moom.Oo p0) throws Throwable {
    throw __call1056202_0(p0);
}
public static void h562_3(moom.Oo p0) throws Throwable {
    throw __call1056203_0(p0);
}
public static void h562_4(moom.Oo p0) throws Throwable {
    throw __call1056204_0(p0);
}
public static void h562_5(moom.Oo p0) throws Throwable {
    throw __call1056205_0(p0);
}
private static native long __fieldRead562_0() throws Throwable;
private static native int[] __call562_1() throws Throwable;
private static native com.moon.nY __call562_2(com.moon.pj a0, int a1) throws Throwable;
private static native boolean __call562_3(com.moon.nY a0) throws Throwable;
private static native com.moon.nY __call562_4(com.moon.pj a0, int a1) throws Throwable;
private static native boolean __call562_5(com.moon.nY a0) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead562_6(com.moon.pj a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call562_7() throws Throwable;
private static native com.moon.fU __call562_8(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Object __classLiteral562_9() throws Throwable;
private static native com.moon.module.Module __call562_10(com.moon.fU a0, java.lang.Object a1) throws Throwable;
private static native com.moon.module.impl.Effects __cast562_11(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite562_12(com.moon.pj a0, com.moon.module.impl.Effects a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead562_13(com.moon.pj a0) throws Throwable;
private static native com.moon.gW __call562_14(com.moon.module.impl.Effects a0) throws Throwable;
private static native void __call562_15(com.moon.gW a0) throws Throwable;
private static native java.util.List __fieldRead562_16(com.moon.pj a0) throws Throwable;
private static native java.util.Iterator __call562_17(java.util.List a0) throws Throwable;
private static native boolean __call562_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call562_19(java.util.Iterator a0) throws Throwable;
private static native com.moon.mY __cast562_20(java.lang.Object a0) throws Throwable;
private static native void __call562_21(com.moon.mY a0) throws Throwable;
private static native java.lang.Exception __call1056200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1056205_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4c937f2b185444ecc8bb(com.moon.pj a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_4c937f2b185444ecc8bb {

public static void f9100(com.moon.pj receiver, int p0, int p1, float p2) throws Throwable {
    com.moon.pj lexicalValue9100_53_0;
    com.moon.pj lexicalValue9100_60_0;
    java.lang.Object lexicalValue9100_77_0;
    com.moon.pj lexicalValue9100_87_0;
    com.moon.pj lexicalValue9100_98_0;
    java.util.Collection lexicalValue9100_98_1;
    float lexicalValue9100_98_2;
    float lexicalValue9100_98_3;
    int lexicalValue9100_98_4;
    com.moon.pj lexicalValue9100_99_0;
    java.util.Collection lexicalValue9100_99_1;
    float lexicalValue9100_99_2;
    float lexicalValue9100_99_3;
    com.moon.pj lexicalValue9100_100_0;
    java.util.Collection lexicalValue9100_100_1;
    float lexicalValue9100_100_2;
    float lexicalValue9100_100_3;
    int lexicalValue9100_100_4;
    com.moon.pj lexicalValue9100_113_0;
    java.util.Collection lexicalValue9100_113_1;
    float lexicalValue9100_113_2;
    float lexicalValue9100_113_3;
    int lexicalValue9100_113_4;
    com.moon.pj lexicalValue9100_114_0;
    java.util.Collection lexicalValue9100_114_1;
    float lexicalValue9100_114_2;
    float lexicalValue9100_114_3;
    com.moon.pj lexicalValue9100_115_0;
    java.util.Collection lexicalValue9100_115_1;
    float lexicalValue9100_115_2;
    float lexicalValue9100_115_3;
    int lexicalValue9100_115_4;
    com.moon.pj lexicalValue9100_130_0;
    com.moon.pj lexicalValue9100_224_0;
    com.moon.pj lexicalValue9100_234_0;
    com.moon.pj spill9100_0;
    int spill9100_1;
    com.moon.pj spill9100_2;
    com.moon.module.impl.Effects spill9100_3;
    com.moon.pj spill9100_4;
    com.moon.pj spill9100_5;
    java.util.Collection spill9100_6;
    float spill9100_7;
    float spill9100_8;
    boolean spill9100_9;
    com.moon.pj spill9100_10;
    java.util.Collection spill9100_11;
    float spill9100_12;
    float spill9100_13;
    boolean spill9100_14;
    com.moon.pj spill9100_15;
    com.moon.pj spill9100_16;
    com.moon.pj spill9100_17;
    long life4_3;
    int[] life6_5;
    float life7_172;
    float life8_177;
    float life9_181;
    float life10_185;
    float life11_189;
    java.util.Iterator life12_203;
    com.moon.mY life13_210;
    lexical_join_234: {
    lexical_join_233: {
    lexical_join_224: {
    lexical_join_223: {
    lexical_join_195: {
    lexical_join_192: {
    lexical_join_130: {
    lexical_join_116: {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_113: {
    lexical_join_100: {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_77: {
    lexical_join_71: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_53: {
    lexical_join_45: {
    life4_3 = (__fieldRead9100_0() ^ 18087440751407L);
    life6_5 = __call9100_1();
    spill9100_0 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue9100_60_0 = spill9100_0;
        break lexical_join_60;
    }
    com.moon.pj __stackOp9100_2_0 = spill9100_0;
    com.moon.pj __stackOp9100_4_0 = __stackOp9100_2_0;
    int __stackOp9100_4_1 = __fieldRead9100_3(__stackOp9100_2_0);
    spill9100_1 = __stackOp9100_4_1;
    __fieldWrite9100_5(__stackOp9100_4_0, (__stackOp9100_4_1 + 1));
    if (!((spill9100_1 == 1))) {
        break lexical_join_59;
    }
    spill9100_2 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue9100_53_0 = spill9100_2;
        break lexical_join_53;
    }
    if (!(__call9100_10(__cast9100_9(__call9100_8(__call9100_7(__fieldRead9100_6(spill9100_2))))))) {
        break lexical_join_45;
    }
    __call9100_13(receiver, __call9100_12(__fieldRead9100_11(receiver)), 0x1.0p-1f, 0);
    __call9100_16(receiver, __call9100_15(__fieldRead9100_14(receiver)), 0x0.0p0f, 0);
    if (!((life6_5 != null))) {
        break lexical_join_59;
    }
    __call9100_17(new java.lang.String[4]);
    }
    __call9100_20(receiver, __call9100_19(__fieldRead9100_18(receiver)), 0x1.0p0f, 1);
    lexicalValue9100_53_0 = receiver;
    }
    __call9100_23(lexicalValue9100_53_0, __call9100_22(__fieldRead9100_21(receiver)), 0x1.0p0f, 1);
    }
    lexicalValue9100_60_0 = receiver;
    }
    spill9100_3 = __fieldRead9100_24(lexicalValue9100_60_0);
    if (!((life6_5 == null))) {
        lexicalValue9100_77_0 = spill9100_3;
        break lexical_join_77;
    }
    if (!((spill9100_3 == null))) {
        break lexical_join_71;
    }
    __fieldWrite9100_30(receiver, __cast9100_29(__call9100_28(__call9100_26(__call9100_25()), __classLiteral9100_27())));
    }
    spill9100_4 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue9100_87_0 = spill9100_4;
        break lexical_join_87;
    }
    lexicalValue9100_77_0 = __call9100_33(__call9100_32(__fieldRead9100_31(spill9100_4)));
    }
    if (!(__call9100_35(__cast9100_34(lexicalValue9100_77_0)))) {
        break lexical_join_86;
    }
    spill9100_5 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue9100_130_0 = spill9100_5;
        break lexical_join_130;
    }
    if (!((!__call9100_37(__fieldRead9100_36(spill9100_5))))) {
        break lexical_join_116;
    }
    }
    lexicalValue9100_87_0 = receiver;
    }
    spill9100_6 = __call9100_39(__fieldRead9100_38(receiver));
    spill9100_7 = 0x0.0p0f;
    spill9100_8 = 0x1.0p0f;
    spill9100_9 = __fieldRead9100_40(receiver);
    if (!((life6_5 == null))) {
        lexicalValue9100_98_0 = lexicalValue9100_87_0;
        lexicalValue9100_98_1 = spill9100_6;
        lexicalValue9100_98_2 = spill9100_7;
        lexicalValue9100_98_3 = spill9100_8;
        lexicalValue9100_98_4 = __integerCategory9100_41(spill9100_9);
        break lexical_join_98;
    }
    if (!((!spill9100_9))) {
        lexicalValue9100_99_0 = lexicalValue9100_87_0;
        lexicalValue9100_99_1 = spill9100_6;
        lexicalValue9100_99_2 = spill9100_7;
        lexicalValue9100_99_3 = spill9100_8;
        break lexical_join_99;
    }
    lexicalValue9100_98_0 = lexicalValue9100_87_0;
    lexicalValue9100_98_1 = spill9100_6;
    lexicalValue9100_98_2 = spill9100_7;
    lexicalValue9100_98_3 = spill9100_8;
    lexicalValue9100_98_4 = 1;
    }
    lexicalValue9100_100_0 = lexicalValue9100_98_0;
    lexicalValue9100_100_1 = lexicalValue9100_98_1;
    lexicalValue9100_100_2 = lexicalValue9100_98_2;
    lexicalValue9100_100_3 = lexicalValue9100_98_3;
    lexicalValue9100_100_4 = lexicalValue9100_98_4;
    break lexical_join_100;
    }
    lexicalValue9100_100_0 = lexicalValue9100_99_0;
    lexicalValue9100_100_1 = lexicalValue9100_99_1;
    lexicalValue9100_100_2 = lexicalValue9100_99_2;
    lexicalValue9100_100_3 = lexicalValue9100_99_3;
    lexicalValue9100_100_4 = 0;
    }
    __call9100_42(lexicalValue9100_100_0, lexicalValue9100_100_1, lexicalValue9100_100_2, lexicalValue9100_100_3, lexicalValue9100_100_4);
    spill9100_10 = receiver;
    spill9100_11 = __call9100_44(__fieldRead9100_43(receiver));
    spill9100_12 = 0x0.0p0f;
    spill9100_13 = 0x1.0p0f;
    spill9100_14 = __fieldRead9100_45(receiver);
    if (!((life6_5 == null))) {
        lexicalValue9100_113_0 = spill9100_10;
        lexicalValue9100_113_1 = spill9100_11;
        lexicalValue9100_113_2 = spill9100_12;
        lexicalValue9100_113_3 = spill9100_13;
        lexicalValue9100_113_4 = __integerCategory9100_46(spill9100_14);
        break lexical_join_113;
    }
    if (!((!spill9100_14))) {
        lexicalValue9100_114_0 = spill9100_10;
        lexicalValue9100_114_1 = spill9100_11;
        lexicalValue9100_114_2 = spill9100_12;
        lexicalValue9100_114_3 = spill9100_13;
        break lexical_join_114;
    }
    lexicalValue9100_113_0 = spill9100_10;
    lexicalValue9100_113_1 = spill9100_11;
    lexicalValue9100_113_2 = spill9100_12;
    lexicalValue9100_113_3 = spill9100_13;
    lexicalValue9100_113_4 = 1;
    }
    lexicalValue9100_115_0 = lexicalValue9100_113_0;
    lexicalValue9100_115_1 = lexicalValue9100_113_1;
    lexicalValue9100_115_2 = lexicalValue9100_113_2;
    lexicalValue9100_115_3 = lexicalValue9100_113_3;
    lexicalValue9100_115_4 = lexicalValue9100_113_4;
    break lexical_join_115;
    }
    lexicalValue9100_115_0 = lexicalValue9100_114_0;
    lexicalValue9100_115_1 = lexicalValue9100_114_1;
    lexicalValue9100_115_2 = lexicalValue9100_114_2;
    lexicalValue9100_115_3 = lexicalValue9100_114_3;
    lexicalValue9100_115_4 = 0;
    }
    __call9100_47(lexicalValue9100_115_0, lexicalValue9100_115_1, lexicalValue9100_115_2, lexicalValue9100_115_3, lexicalValue9100_115_4);
    }
    __call9100_48();
    __call9100_52(__fieldRead9100_49(receiver), __call9100_51(__fieldRead9100_50(receiver)));
    __call9100_54(__fieldRead9100_53(receiver), p0, p1);
    lexicalValue9100_130_0 = receiver;
    }
    life7_172 = __call9100_56(__call9100_55(lexicalValue9100_130_0, 0));
    life8_177 = __call9100_58(__call9100_57(receiver, 1));
    life9_181 = (0x1.0p0f - life7_172);
    life10_185 = (life9_181 / 0x1.0p1f);
    life11_189 = (life9_181 / 0x1.0p1f);
    __call9100_59(life7_172, life7_172, 0x1.0p0f);
    __call9100_60(life10_185, life11_189, 0x0.0p0f);
    __call9100_61(life8_177);
    life12_203 = __call9100_63(__fieldRead9100_62(receiver));
    lexical_cycle_165: while (true) {
    if (!(__call9100_64(life12_203))) {
        break lexical_join_192;
    }
    life13_210 = __cast9100_66(__call9100_65(life12_203));
    __call9100_67();
    __call9100_70(__invokedynamic9100_68(12832, (5397159271177700694L ^ life4_3)), __invokedynamic9100_69(18021, (7733557379851071761L ^ life4_3)));
    __call9100_71(life13_210, p0, p1);
    if (!((life6_5 == null))) {
        break lexical_join_195;
    }
    if (!((life6_5 != null))) { continue lexical_cycle_165; }
    break lexical_cycle_165;
    }
    }
    __call9100_72();
    __call9100_73();
    __call9100_74();
    }
    spill9100_15 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue9100_224_0 = spill9100_15;
        break lexical_join_224;
    }
    if (!((__numericCompare9100_77(((double) __call9100_76(__call9100_75(spill9100_15, 0))), 0x1.0p-1d) < 0))) {
        break lexical_join_223;
    }
    spill9100_16 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue9100_224_0 = spill9100_16;
        break lexical_join_224;
    }
    if (!(__fieldRead9100_78(spill9100_16))) {
        break lexical_join_223;
    }
    __call9100_80(__fieldRead9100_79(receiver), null);
    spill9100_17 = receiver;
    if (!((life6_5 == null))) {
        lexicalValue9100_224_0 = spill9100_17;
        break lexical_join_224;
    }
    if (!((__fieldRead9100_82(__fieldRead9100_81(spill9100_17)) == null))) {
        break lexical_join_223;
    }
    __call9100_84(__fieldRead9100_83(receiver));
    }
    lexicalValue9100_224_0 = receiver;
    }
    if (!((life6_5 == null))) {
        lexicalValue9100_234_0 = lexicalValue9100_224_0;
        break lexical_join_234;
    }
    if (!((__fieldRead9100_85(lexicalValue9100_224_0) != null))) {
        break lexical_join_233;
    }
    __call9100_87(__fieldRead9100_86(receiver), p0, p1);
    }
    lexicalValue9100_234_0 = receiver;
    }
    __call9100_88(lexicalValue9100_234_0, p0, p1, p2);
    return;
}
public static void h9100_0(moom.Oo p0) throws Throwable {
    throw __call1910000_0(p0);
}
public static void h9100_1(moom.Oo p0) throws Throwable {
    throw __call1910001_0(p0);
}
public static void h9100_2(moom.Oo p0) throws Throwable {
    throw __call1910002_0(p0);
}
public static void h9100_3(moom.Oo p0) throws Throwable {
    throw __call1910003_0(p0);
}
public static void h9100_4(moom.Oo p0) throws Throwable {
    throw __call1910004_0(p0);
}
public static void h9100_5(moom.Oo p0) throws Throwable {
    throw __call1910005_0(p0);
}
public static void h9100_6(moom.Oo p0) throws Throwable {
    throw __call1910006_0(p0);
}
public static void h9100_7(moom.Oo p0) throws Throwable {
    throw __call1910007_0(p0);
}
public static void h9100_8(moom.Oo p0) throws Throwable {
    throw __call1910008_0(p0);
}
public static void h9100_9(moom.Oo p0) throws Throwable {
    throw __call1910009_0(p0);
}
public static void h9100_10(moom.Oo p0) throws Throwable {
    throw __call1910010_0(p0);
}
public static void h9100_11(moom.Oo p0) throws Throwable {
    throw __call1910011_0(p0);
}
public static void h9100_12(moom.Oo p0) throws Throwable {
    throw __call1910012_0(p0);
}
public static void h9100_13(moom.Oo p0) throws Throwable {
    throw __call1910013_0(p0);
}
public static void h9100_14(moom.Oo p0) throws Throwable {
    throw __call1910014_0(p0);
}
public static void h9100_15(moom.Oo p0) throws Throwable {
    throw __call1910015_0(p0);
}
public static void h9100_16(moom.Oo p0) throws Throwable {
    throw __call1910016_0(p0);
}
public static void h9100_17(moom.Oo p0) throws Throwable {
    throw __call1910017_0(p0);
}
public static void h9100_18(moom.Oo p0) throws Throwable {
    throw __call1910018_0(p0);
}
public static void h9100_19(moom.Oo p0) throws Throwable {
    throw __call1910019_0(p0);
}
public static void h9100_20(moom.Oo p0) throws Throwable {
    throw __call1910020_0(p0);
}
public static void h9100_21(moom.Oo p0) throws Throwable {
    throw __call1910021_0(p0);
}
private static native long __fieldRead9100_0() throws Throwable;
private static native int[] __call9100_1() throws Throwable;
private static native java.lang.Object __inlineStack9100_2Pack(com.moon.pj a0) throws Throwable;
private static native com.moon.pj __inlineStack9100_2Output0(java.lang.Object token) throws Throwable;
private static native com.moon.pj __inlineStack9100_2Output1(java.lang.Object token) throws Throwable;
private static native int __fieldRead9100_3(com.moon.pj a0) throws Throwable;
private static native java.lang.Object __inlineStack9100_4Pack(com.moon.pj a0, int a1) throws Throwable;
private static native int __inlineStack9100_4Output0(java.lang.Object token) throws Throwable;
private static native com.moon.pj __inlineStack9100_4Output1(java.lang.Object token) throws Throwable;
private static native int __inlineStack9100_4Output2(java.lang.Object token) throws Throwable;
private static native void __fieldWrite9100_5(com.moon.pj a0, int a1) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead9100_6(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call9100_7(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native java.lang.Object __call9100_8(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast9100_9(java.lang.Object a0) throws Throwable;
private static native boolean __call9100_10(java.lang.Boolean a0) throws Throwable;
private static native java.util.Map __fieldRead9100_11(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call9100_12(java.util.Map a0) throws Throwable;
private static native void __call9100_13(com.moon.pj a0, java.util.Collection a1, float a2, int a3) throws Throwable;
private static native java.util.Map __fieldRead9100_14(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call9100_15(java.util.Map a0) throws Throwable;
private static native void __call9100_16(com.moon.pj a0, java.util.Collection a1, float a2, int a3) throws Throwable;
private static native void __call9100_17(java.lang.String[] a0) throws Throwable;
private static native java.util.Map __fieldRead9100_18(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call9100_19(java.util.Map a0) throws Throwable;
private static native void __call9100_20(com.moon.pj a0, java.util.Collection a1, float a2, int a3) throws Throwable;
private static native java.util.Map __fieldRead9100_21(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call9100_22(java.util.Map a0) throws Throwable;
private static native void __call9100_23(com.moon.pj a0, java.util.Collection a1, float a2, int a3) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead9100_24(com.moon.pj a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call9100_25() throws Throwable;
private static native com.moon.fU __call9100_26(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.lang.Class __classLiteral9100_27() throws Throwable;
private static native com.moon.module.Module __call9100_28(com.moon.fU a0, java.lang.Class a1) throws Throwable;
private static native com.moon.module.impl.Effects __cast9100_29(com.moon.module.Module a0) throws Throwable;
private static native void __fieldWrite9100_30(com.moon.pj a0, com.moon.module.impl.Effects a1) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead9100_31(com.moon.pj a0) throws Throwable;
private static native com.moon.setting.BooleanSetting __call9100_32(com.moon.module.impl.Effects a0) throws Throwable;
private static native java.lang.Object __call9100_33(com.moon.setting.BooleanSetting a0) throws Throwable;
private static native java.lang.Boolean __cast9100_34(java.lang.Object a0) throws Throwable;
private static native boolean __call9100_35(java.lang.Boolean a0) throws Throwable;
private static native com.moon.module.impl.Effects __fieldRead9100_36(com.moon.pj a0) throws Throwable;
private static native boolean __call9100_37(com.moon.module.impl.Effects a0) throws Throwable;
private static native java.util.Map __fieldRead9100_38(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call9100_39(java.util.Map a0) throws Throwable;
private static native boolean __fieldRead9100_40(com.moon.pj a0) throws Throwable;
private static native int __integerCategory9100_41(boolean value) throws Throwable;
private static native void __call9100_42(com.moon.pj a0, java.util.Collection a1, float a2, float a3, int a4) throws Throwable;
private static native java.util.Map __fieldRead9100_43(com.moon.pj a0) throws Throwable;
private static native java.util.Collection __call9100_44(java.util.Map a0) throws Throwable;
private static native boolean __fieldRead9100_45(com.moon.pj a0) throws Throwable;
private static native int __integerCategory9100_46(boolean value) throws Throwable;
private static native void __call9100_47(com.moon.pj a0, java.util.Collection a1, float a2, float a3, int a4) throws Throwable;
private static native void __call9100_48() throws Throwable;
private static native com.moon.mz __fieldRead9100_49(com.moon.pj a0) throws Throwable;
private static native com.moon.module.impl.ClickGUI __fieldRead9100_50(com.moon.pj a0) throws Throwable;
private static native com.v __call9100_51(com.moon.module.impl.ClickGUI a0) throws Throwable;
private static native com.moon.mz __call9100_52(com.moon.mz a0, com.v a1) throws Throwable;
private static native com.moon.mz __fieldRead9100_53(com.moon.pj a0) throws Throwable;
private static native void __call9100_54(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.nY __call9100_55(com.moon.pj a0, int a1) throws Throwable;
private static native float __call9100_56(com.moon.nY a0) throws Throwable;
private static native com.moon.nY __call9100_57(com.moon.pj a0, int a1) throws Throwable;
private static native float __call9100_58(com.moon.nY a0) throws Throwable;
private static native void __call9100_59(float a0, float a1, float a2) throws Throwable;
private static native void __call9100_60(float a0, float a1, float a2) throws Throwable;
private static native void __call9100_61(float a0) throws Throwable;
private static native java.util.List __fieldRead9100_62(com.moon.pj a0) throws Throwable;
private static native java.util.Iterator __call9100_63(java.util.List a0) throws Throwable;
private static native boolean __call9100_64(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call9100_65(java.util.Iterator a0) throws Throwable;
private static native com.moon.mY __cast9100_66(java.lang.Object a0) throws Throwable;
private static native void __call9100_67() throws Throwable;
private static native int __invokedynamic9100_68(int a0, long a1) throws Throwable;
private static native int __invokedynamic9100_69(int a0, long a1) throws Throwable;
private static native void __call9100_70(int a0, int a1) throws Throwable;
private static native void __call9100_71(com.moon.mY a0, int a1, int a2) throws Throwable;
private static native void __call9100_72() throws Throwable;
private static native void __call9100_73() throws Throwable;
private static native void __call9100_74() throws Throwable;
private static native com.moon.nY __call9100_75(com.moon.pj a0, int a1) throws Throwable;
private static native float __call9100_76(com.moon.nY a0) throws Throwable;
private static native int __numericCompare9100_77(double a0, double a1) throws Throwable;
private static native boolean __fieldRead9100_78(com.moon.pj a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead9100_79(com.moon.pj a0) throws Throwable;
private static native void __call9100_80(net.minecraft.client.Minecraft a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead9100_81(com.moon.pj a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead9100_82(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead9100_83(com.moon.pj a0) throws Throwable;
private static native void __call9100_84(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.mQ __fieldRead9100_85(com.moon.pj a0) throws Throwable;
private static native com.moon.mQ __fieldRead9100_86(com.moon.pj a0) throws Throwable;
private static native void __call9100_87(com.moon.mQ a0, int a1, int a2) throws Throwable;
private static native void __call9100_88(com.moon.pj a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1910000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1910021_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1, int p2) { __sourceHandlerCall_b7da47b8f6ffcac2c8cc(this, p0, p1, p2); }


public java.util.Map<com.moon.cj, com.moon.nY> b() {
return this.z;
}


public void b__Void() {
((java.util.List)(this.x)).forEach(((java.util.function.Consumer)(__sourceIntrinsic_9bf881b104f5_originalDynamicSite615_1())));
    return;
}


public boolean e__sourceReturn_aae029aa0a() {
return ((((this.B) ? 1 : 0)) != 0);
}


public void c__Void() {
long local1_life2 = (com.moon.pj.G ^ 49683371826857L);
    super.c__Void();
    this.B = ((boolean)__sourceIntrinsic_integerToBoolean((0)));
    this.E = ((int)(0));
    moom.ir local3_life7 = com.moon.nS.a();
    this.F = ((com.moon.mz)(new com.moon.mz(0x1.2000000000000p+2F, ((float) (((moom.ir)(local3_life7)).b__Int() - __sourceIntrinsic_7ac46ee229a8_originalDynamicSite268_11(13343, (6651577127386400492L ^ local1_life2)))), 0x1.9000000000000p+6F, 0x1.6000000000000p+4F, com.moon.pj.H, false, ((com.moon.module.impl.ClickGUI)(this.w)).a__v())));
    return;
}


public int a() {
return this.E;
}


public com.moon.mZ a__mZ() {
return this.D;
}


public com.moon.module.impl.Effects a__lU() {
return this.C;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8581;
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
            throw new RuntimeException("com/moon/pj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         J[var3] = var15;
      }

      return J[var3];
}


public com.moon.mQ a__mQ() {
return this.A;
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
        byte[] spill1554_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1554_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1554_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1554_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1554_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1554_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pj.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3252_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.mz a__mz() {
return this.F;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_4116c52869066a75b68b(this, p0, p1, p2); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_12cb2a61a1081b55dd42(this, p0, p1); }


public boolean a__Boolean() {
return ((0) != 0);
}


public void a(com.moon.ej p0) { __sourceHandlerCall_e5d4bbdb8d5059f3e7b7(this, p0); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_4c937f2b185444ecc8bb(this, p0, p1, p2); }


public void a(com.moon.mQ p0) { __sourceHandlerCall_16923a928f2b89bb2173(this, p0); }


public void a__Void() { __sourceHandlerCall_722aebf08ab233ac1934(this); }


public java.util.List<com.moon.mY> a__List() {
return this.x;
}


public com.moon.module.impl.ClickGUI a__lS() {
return this.w;
}


public java.util.Map<com.moon.cj, com.moon.nY> a__Map() {
return this.y;
}


private void a(java.util.Collection<com.moon.nY> p0, float p1, boolean p2) { __sourceHandlerCall_4e2e90e4cae21b5b5498(this, p0, p1, p2); }


public com.moon.nY a(boolean p0) { return __sourceHandlerCall_ec88254f94a72ce9420d(this, p0); }


private void a(java.util.Collection<com.moon.nY> p0, float p1, float p2, boolean p3) {
int[] spill372_0;
    long life5_3;
    java.util.Iterator life8_7;
    int[] life7_8;
    com.moon.nY life9_15;
    lexical_join_23: {
    life5_3 = (com.moon.pj.G ^ 118713646055688L);
    spill372_0 = moom.DR.b();
    life8_7 = ((java.util.Collection)(p0)).iterator();
    life7_8 = spill372_0;
    lexical_cycle_9: while (true) {
    if (!(((java.util.Iterator)(life8_7)).hasNext())) {
        break lexical_join_23;
    }
    life9_15 = ((com.moon.nY)(((java.util.Iterator)(life8_7)).next()));
    ((com.moon.nY)(life9_15)).a(((float)(p1)), ((float)(p2)), ((boolean)(p3)));
    if (!((life7_8 != null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    return;
}


public void j() { __sourceHandlerCall_0094d5bcd1e1aebf7329(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3252_0() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_9bf881b104f5_originalDynamicSite615_1() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite268_11(int a0, long a1) throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
