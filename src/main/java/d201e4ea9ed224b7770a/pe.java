package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class pe extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.shader.Framebuffer w;

private net.minecraft.client.shader.Framebuffer[] x;

private com.moon.gW y;

private com.moon.pn z;

private com.moon.mz A;

private com.moon.mz B;

private com.moon.mz C;

private com.moon.mz D;

private com.moon.mz E;

private com.moon.mz F;

private static long G;

private static java.lang.String[] H;

private static java.lang.String[] I;

private static java.util.Map J;

private static long[] K;

private static java.lang.Integer[] L;

private static java.util.Map M;

public pe() { super(); __sourceHandlerCall_43b020c5648c030fffaf(this); }


static {
G = ((long)(((moom._a)(moom._c.a(((long)(-7614510260717609987L)), ((long)(-6803283168884291876L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(222119200002925L)))));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.pe.G ^ 21359666407829L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill371_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill371_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill371_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill371_14 = new byte[8];
    (__sourceSpill371_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill371_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation371_16 = __sourceSpill371_14;
    ((javax.crypto.Cipher)(__sourceSpill371_11)).init(((int)(__sourceSpill371_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill371_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation371_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[8];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Õ.arÝ|²[Çgn[\004³FQØ òÇð(ÌxÝ¾#×²Ñ\003aûpÕ1`^Iá\tÁ¸ÎÎ%\bÝËüm\032U®N8ö&\020\005+[ÙÂX-Tª\"\f,ñË\030Fb6}ï\023¶qo´¼ò\0017Ö½V¸¾v Ñ\177ù\004´\rÈ%¡ÚtU\002·ï4ýÇb\035\007å\0058òØu­m[\020F\034Ú7{+s¸L\021\035\013Þ"))).length();
    int local16_life24 = 24;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill371_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill371_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill371_29)).doFinal(((byte[])(__sourceSpill371_28)));
        java.lang.String __sourceSpill371_34 = ((java.lang.String)(com.moon.pe.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill371_35 = local20_life19;
        int __sourceSpill371_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill371_35)[__sourceSpill371_36] = __sourceSpill371_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "\t9\032\021·9Î'ð®9\017J»b´ õÍÞ7\\>¥Ë/ñµ¿½\027Ý_Î\020êÿq\031à \177t}t)\\"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill371_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill371_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill371_42)).doFinal(((byte[])(__sourceSpill371_41)));
        java.lang.String __sourceSpill371_47 = ((java.lang.String)(com.moon.pe.a(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill371_48 = local20_life19;
        int __sourceSpill371_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill371_48)[__sourceSpill371_49] = __sourceSpill371_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    H = ((java.lang.String[])(local20_life19));
    I = ((java.lang.String[])(new java.lang.String[8]));
    M = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill371_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill371_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill371_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill371_60 = new byte[8];
    (__sourceSpill371_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill371_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation371_62 = __sourceSpill371_60;
    ((javax.crypto.Cipher)(__sourceSpill371_57)).init(((int)(__sourceSpill371_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill371_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation371_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[3];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "²\020\n~À¦x^äAáw÷W\026\":×òÊh"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill371_71 = local4_life67;
        int __sourceSpill371_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill371_71)).substring(((int)(__sourceSpill371_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill371_76 = local6_life65;
        int __sourceSpill371_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill371_79 = new byte[8];
        (__sourceSpill371_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill371_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill371_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill371_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill371_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill371_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill371_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill371_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill371_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill371_80)).doFinal(((byte[])(__sourceSpill371_79)));
        (__sourceSpill371_76)[__sourceSpill371_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    K = ((long[])(local6_life65));
    L = ((java.lang.Integer[])(new java.lang.Integer[3]));
}

private static native <E extends Throwable> void __sourceHandlerCall_43b020c5648c030fffaf(com.moon.pe a0) throws E;
private static final class __SourceHandler_43b020c5648c030fffaf {

public static void f128(com.moon.pe receiver) throws Throwable {
    boolean spill128_0;
    long life1_3;
    int life3_7;
    int life4_25;
    forest_join_57: {
    forest_join_46: {
    life1_3 = (__fieldRead128_0() ^ 28836214618657L);
    spill128_0 = __call128_1();
    __directSuperInit128_2(receiver);
    life3_7 = __integerCategory128_3(spill128_0);
    __fieldWrite128_4(receiver, new net.minecraft.client.shader.Framebuffer(1, 1, false));
    __fieldWrite128_6(receiver, new net.minecraft.client.shader.Framebuffer[__invokedynamic128_5(11514, (7008868005567160653L ^ life1_3))]);
    life4_25 = 0;
    forest_cycle_26: while (true) {
    if (!((life4_25 < (__fieldRead128_7(receiver)).length))) {
        break forest_join_46;
    }
    (__fieldRead128_8(receiver))[life4_25] = new net.minecraft.client.shader.Framebuffer(1, 1, false);
    life4_25 += 1;
    if (!((life3_7 != 0))) {
        break forest_join_57;
    }
    if (!((life3_7 == 0))) {
        continue forest_cycle_26;
    }
    break forest_cycle_26;
    }
    }
    __fieldWrite128_11(receiver, new com.moon.gW(__fieldRead128_9(receiver), __fieldRead128_10(receiver), 2, 2));
    }
    return;
}
public static void h128_0(moom.Oo p0) throws Throwable {
    throw __call3012800_0(p0);
}
private static native long __fieldRead128_0() throws Throwable;
private static native boolean __call128_1() throws Throwable;
private static native void __directSuperInit128_2(com.moon.pe a0) throws Throwable;
private static native int __integerCategory128_3(boolean value) throws Throwable;
private static native void __fieldWrite128_4(com.moon.pe a0, net.minecraft.client.shader.Framebuffer a1) throws Throwable;
private static native int __invokedynamic128_5(int a0, long a1) throws Throwable;
private static native void __fieldWrite128_6(com.moon.pe a0, net.minecraft.client.shader.Framebuffer[] a1) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer[] __fieldRead128_7(com.moon.pe a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer[] __fieldRead128_8(com.moon.pe a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer __fieldRead128_9(com.moon.pe a0) throws Throwable;
private static native net.minecraft.client.shader.Framebuffer[] __fieldRead128_10(com.moon.pe a0) throws Throwable;
private static native void __fieldWrite128_11(com.moon.pe a0, com.moon.gW a1) throws Throwable;
private static native java.lang.Exception __call3012800_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_70683e41297283290918(com.moon.pe a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_70683e41297283290918 {

public static void f50(com.moon.pe receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    moom.ir life7_8;
    com.v life8_13;
    com.moon.hW life9_18;
    java.lang.String life10_59;
    java.lang.String life11_65;
    com.moon.jm life12_70;
    com.moon.hW life13_77;
    int life6_169;
    life4_3 = (__fieldRead50_0() ^ 134540165460338L);
    life7_8 = new moom.ir(__call50_1());
    boolean spill50_0 = __call50_2();
    life8_13 = __call50_5(__call50_4(__call50_3()));
    life9_18 = __call50_9(__call50_8(__call50_6(), __fieldRead50_7()));
    __call50_16(life9_18, __call50_15(-0x1.0p0f, -0x1.0p0f, ((float) (__fieldRead50_11(__fieldRead50_10(receiver)) + 1)), ((float) (__fieldRead50_13(__fieldRead50_12(receiver)) + 1)), 0x0.0p0f, __call50_14(life8_13)));
    __call50_17(life9_18);
    __call50_19(__fieldRead50_18(receiver), p0, p1, p2);
    __call50_20();
    java.lang.String __stackOp50_25_0 = __call50_23(__call50_22(__fieldRead50_21(receiver)));
    java.lang.String __stackOp50_25_1 = __invokedynamic50_24(18417, (6855160421297751555L ^ life4_3));
    life10_59 = __invokedynamic50_26(__stackOp50_25_1, __stackOp50_25_0);
    life11_65 = __invokedynamic50_27(32436, (146181655537139520L ^ life4_3));
    life12_70 = __call50_31(__call50_29(__call50_28()), __fieldRead50_30());
    life13_77 = __call50_36(__call50_35(__call50_34(__call50_32(), __fieldRead50_33()), life12_70));
    __call50_40(life12_70, life13_77, life11_65, 0x1.8p3f, ((((float) __fieldRead50_37(receiver)) / 0x1.0p1f) - (__call50_38(life12_70, life11_65, 0x1.8p3f) / 0x1.0p1f)), 0x1.cp2f, __call50_39(life8_13));
    __call50_44(life12_70, life13_77, life10_59, 0x1.0p3f, ((((float) __fieldRead50_41(receiver)) / 0x1.0p1f) - (__call50_42(life12_70, life10_59, 0x1.0p3f) / 0x1.0p1f)), 0x1.4p4f, __call50_43(life8_13));
    __call50_45(life13_77);
    __call50_47(__fieldRead50_46(receiver), p0, p1);
    __call50_49(__fieldRead50_48(receiver), p0, p1);
    __call50_51(__fieldRead50_50(receiver), p0, p1);
    __call50_53(__fieldRead50_52(receiver), p0, p1);
    __call50_55(__fieldRead50_54(receiver), p0, p1);
    __call50_57(__fieldRead50_56(receiver), p0, p1);
    __call50_58();
    __call50_59(receiver, p0, p1, p2);
    __call50_60();
    __call50_61(1, 0);
    __call50_62();
    __call50_64(__fieldRead50_63(receiver), 0x1.8p2f);
    __call50_66(__fieldRead50_65(receiver));
    life6_169 = __integerCategory50_67(spill50_0);
    __call50_69(__fieldRead50_68(receiver));
    __call50_70();
    if ((life6_169 != 0)) {
        __call50_71(new java.lang.String[2]);
    }
    return;
}
public static void h50_0(moom.Oo p0) throws Throwable {
    throw __call1005000_0(p0);
}
private static native long __fieldRead50_0() throws Throwable;
private static native net.minecraft.client.Minecraft __call50_1() throws Throwable;
private static native boolean __call50_2() throws Throwable;
private static native com.moon.runtime.ClientContext __call50_3() throws Throwable;
private static native com.moon.cs __call50_4(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.v __call50_5(com.moon.cs a0) throws Throwable;
private static native com.moon.hX __call50_6() throws Throwable;
private static native com.moon.cb __fieldRead50_7() throws Throwable;
private static native com.moon.hX __call50_8(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hW __call50_9(com.moon.hX a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead50_10(com.moon.pe a0) throws Throwable;
private static native int __fieldRead50_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead50_12(com.moon.pe a0) throws Throwable;
private static native int __fieldRead50_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __call50_14(com.v a0) throws Throwable;
private static native com.moon.i3 __call50_15(float a0, float a1, float a2, float a3, float a4, int a5) throws Throwable;
private static native void __call50_16(com.moon.hW a0, com.moon.i3 a1) throws Throwable;
private static native void __call50_17(com.moon.hW a0) throws Throwable;
private static native com.moon.pn __fieldRead50_18(com.moon.pe a0) throws Throwable;
private static native void __call50_19(com.moon.pn a0, int a1, int a2, float a3) throws Throwable;
private static native void __call50_20() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead50_21(com.moon.pe a0) throws Throwable;
private static native net.minecraft.util.Session __call50_22(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call50_23(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __invokedynamic50_24(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic50_26(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __invokedynamic50_27(int a0, long a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call50_28() throws Throwable;
private static native com.moon.jo __call50_29(com.moon.runtime.ClientContext a0) throws Throwable;
private static native com.moon.ce __fieldRead50_30() throws Throwable;
private static native com.moon.jm __call50_31(com.moon.jo a0, com.moon.ce a1) throws Throwable;
private static native com.moon.hX __call50_32() throws Throwable;
private static native com.moon.cb __fieldRead50_33() throws Throwable;
private static native com.moon.hX __call50_34(com.moon.hX a0, com.moon.cb a1) throws Throwable;
private static native com.moon.hX __call50_35(com.moon.hX a0, com.moon.jm a1) throws Throwable;
private static native com.moon.hW __call50_36(com.moon.hX a0) throws Throwable;
private static native int __fieldRead50_37(com.moon.pe a0) throws Throwable;
private static native float __call50_38(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native int __call50_39(com.v a0) throws Throwable;
private static native void __call50_40(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native int __fieldRead50_41(com.moon.pe a0) throws Throwable;
private static native float __call50_42(com.moon.jm a0, java.lang.String a1, float a2) throws Throwable;
private static native int __call50_43(com.v a0) throws Throwable;
private static native void __call50_44(com.moon.jm a0, com.moon.hW a1, java.lang.String a2, float a3, float a4, float a5, int a6) throws Throwable;
private static native void __call50_45(com.moon.hW a0) throws Throwable;
private static native com.moon.mz __fieldRead50_46(com.moon.pe a0) throws Throwable;
private static native void __call50_47(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead50_48(com.moon.pe a0) throws Throwable;
private static native void __call50_49(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead50_50(com.moon.pe a0) throws Throwable;
private static native void __call50_51(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead50_52(com.moon.pe a0) throws Throwable;
private static native void __call50_53(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead50_54(com.moon.pe a0) throws Throwable;
private static native void __call50_55(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native com.moon.mz __fieldRead50_56(com.moon.pe a0) throws Throwable;
private static native void __call50_57(com.moon.mz a0, int a1, int a2) throws Throwable;
private static native void __call50_58() throws Throwable;
private static native void __call50_59(com.moon.pe a0, int a1, int a2, float a3) throws Throwable;
private static native void __call50_60() throws Throwable;
private static native void __call50_61(int a0, int a1) throws Throwable;
private static native void __call50_62() throws Throwable;
private static native com.moon.gW __fieldRead50_63(com.moon.pe a0) throws Throwable;
private static native com.moon.gW __call50_64(com.moon.gW a0, float a1) throws Throwable;
private static native com.moon.gW __fieldRead50_65(com.moon.pe a0) throws Throwable;
private static native void __call50_66(com.moon.gW a0) throws Throwable;
private static native int __integerCategory50_67(boolean value) throws Throwable;
private static native com.moon.gW __fieldRead50_68(com.moon.pe a0) throws Throwable;
private static native void __call50_69(com.moon.gW a0) throws Throwable;
private static native void __call50_70() throws Throwable;
private static native void __call50_71(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call1005000_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_fb110f05d6a1c8dcce89(com.moon.pe a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_fb110f05d6a1c8dcce89 {

public static void f51(com.moon.pe receiver, int p0, int p1, int p2) throws Throwable {
    java.lang.Object forwardValue51_32_0;
    int forwardValue51_46_0;
    java.lang.Object forwardValue51_75_0;
    int forwardValue51_82_0;
    int forwardValue51_97_0;
    int forwardValue51_112_0;
    int forwardValue51_149_0;
    com.moon.pe forwardValue51_154_0;
    boolean spill51_0;
    boolean spill51_1;
    com.moon.pn spill51_2;
    com.moon.cq spill51_3;
    boolean spill51_4;
    com.moon.pe spill51_5;
    long life4_3;
    com.moon.cs life7_7;
    int life6_8;
    com.moon.cq life8_44;
    java.util.List life8_170;
    com.moon.cq life9_180;
    forward_join_154: {
    forward_join_153: {
    forward_join_149: {
    forward_join_141: {
    forward_join_112: {
    forward_join_106: {
    forward_join_97: {
    forward_join_91: {
    forward_join_82: {
    forward_join_76: {
    forward_join_75: {
    forward_join_69: {
    forward_join_54: {
    forward_join_46: {
    forward_join_40: {
    forward_join_32: {
    forward_join_26: {
    life4_3 = (__fieldRead51_0() ^ 25569259694702L);
    spill51_0 = __call51_1();
    life7_7 = __call51_3(__call51_2());
    life6_8 = __integerCategory51_4(spill51_0);
    spill51_1 = __call51_6(__fieldRead51_5(receiver), p0, p1, p2);
    if (!((life6_8 != 0))) {
        forwardValue51_46_0 = __integerCategory51_7(spill51_1);
        break forward_join_46;
    }
    if (!(spill51_1)) {
        break forward_join_40;
    }
    spill51_2 = __fieldRead51_8(receiver);
    if (!((life6_8 != 0))) {
        forwardValue51_32_0 = spill51_2;
        break forward_join_32;
    }
    if (!((__fieldRead51_9(spill51_2) == -1))) {
        break forward_join_26;
    }
    return;
    }
    forwardValue51_32_0 = __call51_13(__call51_10(life7_7), __fieldRead51_12(__fieldRead51_11(receiver)));
    }
    life8_44 = __cast51_14(forwardValue51_32_0);
    __call51_15(life8_44);
    __call51_17(__call51_16(), life8_44);
    }
    forwardValue51_46_0 = __integerCategory51_20(__call51_19(__fieldRead51_18(receiver), p0, p1, p2));
    }
    if (!((life6_8 != 0))) {
        forwardValue51_82_0 = forwardValue51_46_0;
        break forward_join_82;
    }
    if (!((forwardValue51_46_0 != 0))) {
        break forward_join_76;
    }
    if (!(__call51_22(__call51_21(life7_7)))) {
        break forward_join_54;
    }
    return;
    }
    spill51_3 = __call51_24(__call51_23());
    if (!((life6_8 != 0))) {
        forwardValue51_75_0 = spill51_3;
        break forward_join_75;
    }
    if (!((spill51_3 == __call51_28(__call51_25(life7_7), __fieldRead51_27(__fieldRead51_26(receiver)))))) {
        break forward_join_69;
    }
    __call51_30(__call51_29(), null);
    }
    forwardValue51_75_0 = __call51_34(__call51_31(life7_7), __fieldRead51_33(__fieldRead51_32(receiver)));
    }
    __discardScalar51_35(forwardValue51_75_0);
    }
    forwardValue51_82_0 = __integerCategory51_38(__call51_37(__fieldRead51_36(receiver), p0, p1, p2));
    }
    if (!((life6_8 != 0))) {
        forwardValue51_97_0 = forwardValue51_82_0;
        break forward_join_97;
    }
    if (!((forwardValue51_82_0 != 0))) {
        break forward_join_91;
    }
    __call51_40(__fieldRead51_39(receiver), new com.moon.pf());
    }
    forwardValue51_97_0 = __integerCategory51_43(__call51_42(__fieldRead51_41(receiver), p0, p1, p2));
    }
    if (!((life6_8 != 0))) {
        forwardValue51_112_0 = forwardValue51_97_0;
        break forward_join_112;
    }
    if (!((forwardValue51_97_0 != 0))) {
        break forward_join_106;
    }
    __call51_45(__fieldRead51_44(receiver), new com.moon.pg());
    }
    forwardValue51_112_0 = __integerCategory51_48(__call51_47(__fieldRead51_46(receiver), p0, p1, p2));
    }
    if (!((life6_8 != 0))) {
        forwardValue51_149_0 = forwardValue51_112_0;
        break forward_join_149;
    }
    if (!((forwardValue51_112_0 != 0))) {
        break forward_join_141;
    }
    spill51_4 = __call51_50(__call51_49(life7_7));
    if (!((life6_8 != 0))) {
        forwardValue51_149_0 = __integerCategory51_51(spill51_4);
        break forward_join_149;
    }
    if (!((!spill51_4))) {
        break forward_join_141;
    }
    life8_170 = __call51_54(__call51_53(__call51_52()));
    life9_180 = __cast51_58(__call51_57(life8_170, __call51_56(0, (__call51_55(life8_170) - 1))));
    __call51_59(life9_180);
    __call51_61(__call51_60(), life9_180);
    }
    spill51_5 = receiver;
    if (!((life6_8 != 0))) {
        forwardValue51_154_0 = spill51_5;
        break forward_join_154;
    }
    forwardValue51_149_0 = __integerCategory51_64(__call51_63(__fieldRead51_62(spill51_5), p0, p1, p2));
    }
    if (!((forwardValue51_149_0 != 0))) {
        break forward_join_153;
    }
    __call51_66(__call51_65(life7_7));
    }
    forwardValue51_154_0 = receiver;
    }
    __call51_67(forwardValue51_154_0, p0, p1, p2);
    return;
}
public static void h51_0(java.io.IOException p0) throws Throwable {
    throw __call1005100_0(p0);
}
public static void h51_1(java.io.IOException p0) throws Throwable {
    throw __call1005101_0(p0);
}
public static void h51_2(java.io.IOException p0) throws Throwable {
    throw __call1005102_0(p0);
}
public static void h51_3(java.io.IOException p0) throws Throwable {
    throw __call1005103_0(p0);
}
public static void h51_4(java.io.IOException p0) throws Throwable {
    throw __call1005104_0(p0);
}
public static void h51_5(java.io.IOException p0) throws Throwable {
    throw __call1005105_0(p0);
}
public static void h51_6(java.io.IOException p0) throws Throwable {
    throw __call1005106_0(p0);
}
public static void h51_7(java.io.IOException p0) throws Throwable {
    throw __call1005107_0(p0);
}
public static void h51_8(java.io.IOException p0) throws Throwable {
    throw __call1005108_0(p0);
}
public static void h51_9(java.io.IOException p0) throws Throwable {
    throw __call1005109_0(p0);
}
public static void h51_10(java.io.IOException p0) throws Throwable {
    throw __call1005110_0(p0);
}
public static void h51_11(java.io.IOException p0) throws Throwable {
    throw __call1005111_0(p0);
}
public static void h51_12(java.io.IOException p0) throws Throwable {
    throw __call1005112_0(p0);
}
public static void h51_13(java.io.IOException p0) throws Throwable {
    throw __call1005113_0(p0);
}
public static void h51_14(java.io.IOException p0) throws Throwable {
    throw __call1005114_0(p0);
}
public static void h51_15(java.io.IOException p0) throws Throwable {
    throw __call1005115_0(p0);
}
public static void h51_16(java.io.IOException p0) throws Throwable {
    throw __call1005116_0(p0);
}
public static void h51_17(java.io.IOException p0) throws Throwable {
    throw __call1005117_0(p0);
}
private static native long __fieldRead51_0() throws Throwable;
private static native boolean __call51_1() throws Throwable;
private static native com.moon.runtime.ClientContext __call51_2() throws Throwable;
private static native com.moon.cs __call51_3(com.moon.runtime.ClientContext a0) throws Throwable;
private static native int __integerCategory51_4(boolean value) throws Throwable;
private static native com.moon.mz __fieldRead51_5(com.moon.pe a0) throws Throwable;
private static native boolean __call51_6(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory51_7(boolean value) throws Throwable;
private static native com.moon.pn __fieldRead51_8(com.moon.pe a0) throws Throwable;
private static native int __fieldRead51_9(com.moon.pn a0) throws Throwable;
private static native java.util.List __call51_10(com.moon.cs a0) throws Throwable;
private static native com.moon.pn __fieldRead51_11(com.moon.pe a0) throws Throwable;
private static native int __fieldRead51_12(com.moon.pn a0) throws Throwable;
private static native java.lang.Object __call51_13(java.util.List a0, int a1) throws Throwable;
private static native com.moon.cq __cast51_14(java.lang.Object a0) throws Throwable;
private static native void __call51_15(com.moon.cq a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call51_16() throws Throwable;
private static native com.moon.runtime.ClientContext __call51_17(com.moon.runtime.ClientContext a0, com.moon.cq a1) throws Throwable;
private static native com.moon.mz __fieldRead51_18(com.moon.pe a0) throws Throwable;
private static native boolean __call51_19(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory51_20(boolean value) throws Throwable;
private static native java.util.List __call51_21(com.moon.cs a0) throws Throwable;
private static native boolean __call51_22(java.util.List a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call51_23() throws Throwable;
private static native com.moon.cq __call51_24(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.util.List __call51_25(com.moon.cs a0) throws Throwable;
private static native com.moon.pn __fieldRead51_26(com.moon.pe a0) throws Throwable;
private static native int __fieldRead51_27(com.moon.pn a0) throws Throwable;
private static native java.lang.Object __call51_28(java.util.List a0, int a1) throws Throwable;
private static native com.moon.runtime.ClientContext __call51_29() throws Throwable;
private static native com.moon.runtime.ClientContext __call51_30(com.moon.runtime.ClientContext a0, java.lang.Object a1) throws Throwable;
private static native java.util.List __call51_31(com.moon.cs a0) throws Throwable;
private static native com.moon.pn __fieldRead51_32(com.moon.pe a0) throws Throwable;
private static native int __fieldRead51_33(com.moon.pn a0) throws Throwable;
private static native java.lang.Object __call51_34(java.util.List a0, int a1) throws Throwable;
private static native void __discardScalar51_35(java.lang.Object a0) throws Throwable;
private static native com.moon.mz __fieldRead51_36(com.moon.pe a0) throws Throwable;
private static native boolean __call51_37(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory51_38(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead51_39(com.moon.pe a0) throws Throwable;
private static native void __call51_40(net.minecraft.client.Minecraft a0, com.moon.pf a1) throws Throwable;
private static native com.moon.mz __fieldRead51_41(com.moon.pe a0) throws Throwable;
private static native boolean __call51_42(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory51_43(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead51_44(com.moon.pe a0) throws Throwable;
private static native void __call51_45(net.minecraft.client.Minecraft a0, com.moon.pg a1) throws Throwable;
private static native com.moon.mz __fieldRead51_46(com.moon.pe a0) throws Throwable;
private static native boolean __call51_47(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory51_48(boolean value) throws Throwable;
private static native java.util.List __call51_49(com.moon.cs a0) throws Throwable;
private static native boolean __call51_50(java.util.List a0) throws Throwable;
private static native int __integerCategory51_51(boolean value) throws Throwable;
private static native com.moon.runtime.ClientContext __call51_52() throws Throwable;
private static native com.moon.cs __call51_53(com.moon.runtime.ClientContext a0) throws Throwable;
private static native java.util.List __call51_54(com.moon.cs a0) throws Throwable;
private static native int __call51_55(java.util.List a0) throws Throwable;
private static native int __call51_56(int a0, int a1) throws Throwable;
private static native java.lang.Object __call51_57(java.util.List a0, int a1) throws Throwable;
private static native com.moon.cq __cast51_58(java.lang.Object a0) throws Throwable;
private static native void __call51_59(com.moon.cq a0) throws Throwable;
private static native com.moon.runtime.ClientContext __call51_60() throws Throwable;
private static native com.moon.runtime.ClientContext __call51_61(com.moon.runtime.ClientContext a0, com.moon.cq a1) throws Throwable;
private static native com.moon.mz __fieldRead51_62(com.moon.pe a0) throws Throwable;
private static native boolean __call51_63(com.moon.mz a0, int a1, int a2, int a3) throws Throwable;
private static native int __integerCategory51_64(boolean value) throws Throwable;
private static native java.util.List __call51_65(com.moon.cs a0) throws Throwable;
private static native void __call51_66(java.util.List a0) throws Throwable;
private static native void __call51_67(com.moon.pe a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1005100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005101_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005102_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005103_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005104_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005105_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005106_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005107_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005108_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005109_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005110_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005111_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005112_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005113_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005114_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005115_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005116_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005117_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c9adb0bacf0405287b75(com.moon.pe a0) throws E;
private static final class __SourceHandler_c9adb0bacf0405287b75 {

public static void f544(com.moon.pe receiver) throws Throwable {
    com.moon.pe forwardValue544_14_0;
    com.moon.pn forwardValue544_20_0;
    com.moon.pe spill544_0;
    com.moon.pn spill544_1;
    long life1_3;
    int life3_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    life1_3 = (__fieldRead544_0() ^ 87286910109826L);
    life3_5 = __integerCategory544_2(__call544_1());
    spill544_0 = receiver;
    if (!((life3_5 == 0))) {
        forwardValue544_14_0 = spill544_0;
        break forward_join_14;
    }
    if (!((__fieldRead544_4(__fieldRead544_3(spill544_0)) == receiver))) {
        break forward_join_21;
    }
    forwardValue544_14_0 = receiver;
    }
    spill544_1 = __fieldRead544_5(forwardValue544_14_0);
    if (!((life3_5 == 0))) {
        forwardValue544_20_0 = spill544_1;
        break forward_join_20;
    }
    if (!((spill544_1 != null))) {
        break forward_join_21;
    }
    forwardValue544_20_0 = __fieldRead544_6(receiver);
    }
    __call544_7(forwardValue544_20_0);
    }
    return;
}
public static void h544_0(moom.Oo p0) throws Throwable {
    throw __call1054400_0(p0);
}
public static void h544_1(moom.Oo p0) throws Throwable {
    throw __call1054401_0(p0);
}
public static void h544_2(moom.Oo p0) throws Throwable {
    throw __call1054402_0(p0);
}
public static void h544_3(moom.Oo p0) throws Throwable {
    throw __call1054403_0(p0);
}
private static native long __fieldRead544_0() throws Throwable;
private static native boolean __call544_1() throws Throwable;
private static native int __integerCategory544_2(boolean value) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead544_3(com.moon.pe a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead544_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native com.moon.pn __fieldRead544_5(com.moon.pe a0) throws Throwable;
private static native com.moon.pn __fieldRead544_6(com.moon.pe a0) throws Throwable;
private static native void __call544_7(com.moon.pn a0) throws Throwable;
private static native java.lang.Exception __call1054400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1054403_0(moom.Oo a0) throws Throwable;

}


public void e() throws java.io.IOException {
super.e();
    ((com.moon.pn)(this.z)).c__Void();
    return;
}


public void c__Void() {
long local1_life2 = (com.moon.pe.G ^ 78072070321396L);
    ((com.moon.gW)(this.y)).a(((java.util.function.Consumer)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_4(this))));
    com.v local3_life9 = ((com.moon.cs)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__cs())).a();
    this.z = ((com.moon.pn)(new com.moon.pn(this)));
    ((com.moon.pn)(this.z)).c(((int)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_13(5251, (2735584632859744224L ^ local1_life2)))), ((int)(__sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_15(30259, (6216086544404723027L ^ local1_life2)))));
    ((com.moon.pn)(this.z)).a(((int)(-1)), ((boolean)(false)), ((int)(0)), ((int)(0)));
    this.A = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) + 0x1.a000000000000p+5F), (((float) this.l) - 0x1.9800000000000p+5F), 0x1.9000000000000p+6F, 0x1.6000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_26(11175, (5103258167698845655L ^ local1_life2)), false, local3_life9)));
    this.B = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.3000000000000p+7F), (((float) this.l) - 0x1.b000000000000p+4F), 0x1.9000000000000p+6F, 0x1.6000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_35(19615, (8791602876550056168L ^ local1_life2)), false, local3_life9)));
    this.C = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.3000000000000p+7F), (((float) this.l) - 0x1.9800000000000p+5F), 0x1.9000000000000p+6F, 0x1.6000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_44(8745, (4954786782321370714L ^ local1_life2)), false, local3_life9)));
    this.D = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.9000000000000p+5F), (((float) this.l) - 0x1.9800000000000p+5F), 0x1.9000000000000p+6F, 0x1.6000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_53(22389, (3285694418938008323L ^ local1_life2)), false, local3_life9)));
    this.E = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) + 0x1.a000000000000p+5F), (((float) this.l) - 0x1.b000000000000p+4F), 0x1.9000000000000p+6F, 0x1.6000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_62(20095, (1458766227712936458L ^ local1_life2)), false, local3_life9)));
    this.F = ((com.moon.mz)(new com.moon.mz(((((float) this.k) / 0x1.0p1f) - 0x1.9000000000000p+5F), (((float) this.l) - 0x1.b000000000000p+4F), 0x1.9000000000000p+6F, 0x1.6000000000000p+4F, __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_71(20568, (5111036646801544233L ^ local1_life2)), false, local3_life9)));
    super.c__Void();
    return;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3207_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pe"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 4117;
      if (L[var3] == null) {
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
         long var5 = K[var3];
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
         Object[] var9 = (Object[])M.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               M.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/pe", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         L[var3] = var15;
      }

      return L[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.pe.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5890);
    if (((com.moon.pe.I)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.pe.J)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.pe.J)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/pe", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.pe.H)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.pe.I)[life5_8] = com.moon.pe.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.pe.I)[life5_8];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3209_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/pe"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_fb110f05d6a1c8dcce89(this, p0, p1, p2); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_70683e41297283290918(this, p0, p1, p2); }


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.pe.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void a__Void() { __sourceHandlerCall_c9adb0bacf0405287b75(this); }


public com.moon.gW a() {
return this.y;
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
        byte[] spill1546_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1546_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1546_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1546_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1546_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1546_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private void lambda$initGui$0(java.lang.Boolean p0) {
((com.moon.pe)(this)).a__Void();
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3209_0() throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_4(com.moon.pe a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_15(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_26(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_35(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_53(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_62(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_originalDynamicSite259_71(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral3207_0() throws E;
}
