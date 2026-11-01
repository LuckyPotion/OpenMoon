package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiWinGame extends net.minecraft.client.gui.GuiScreen {

private static org.apache.logging.log4j.Logger w;

private static moom.DD x;

private static moom.DD y;

private int z;

private java.util.List<java.lang.String> A;

private int B;

private float C;

private static long D;

private static long[] E;

private static java.lang.Integer[] F;

private static java.util.Map G;

private static long[] H;

private static java.lang.Long[] I;

private static java.util.Map J;

public GuiWinGame() {
super();
    this.C = 0x1.0000000000000p-1f;
}


static {
D = ((long)(((moom._a)(moom._c.a(((long)(2351529977117091001L)), ((long)(8785683023243627417L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(175684724933263L)))));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (net.minecraft.client.gui.GuiWinGame.D ^ 113523926248338L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1165_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1165_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1165_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1165_14 = new byte[8];
    (__sourceSpill1165_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1165_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1165_16 = __sourceSpill1165_14;
    ((javax.crypto.Cipher)(__sourceSpill1165_11)).init(((int)(__sourceSpill1165_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1165_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1165_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[19];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "'àø<T$¬\000\031»1íÄrMNvjÃá´TÁg¶k·\037_ÁV¥t¬ÁrT«+²\001\035OW3Î:+ÃYÐL\030äÚúñëë)Ó]Òk]=áB\007gx¾#´¼BnZRa¶Èm¡y\033\026k¡j\f\025(A\006spC\004g²\035É\022¯âÐÔ\\lûXw'Á ÆU\0268"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1165_25 = local17_life21;
        int __sourceSpill1165_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1165_25)).substring(((int)(__sourceSpill1165_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1165_30 = local19_life19;
        int __sourceSpill1165_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1165_33 = new byte[8];
        (__sourceSpill1165_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1165_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1165_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1165_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1165_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1165_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1165_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1165_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1165_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1165_34)).doFinal(((byte[])(__sourceSpill1165_33)));
        (__sourceSpill1165_30)[__sourceSpill1165_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = ",6ßû\177Àâýø1t"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1165_38 = local17_life21;
        int __sourceSpill1165_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1165_38)).substring(((int)(__sourceSpill1165_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1165_43 = local19_life19;
        int __sourceSpill1165_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1165_46 = new byte[8];
        (__sourceSpill1165_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1165_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1165_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1165_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1165_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1165_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1165_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1165_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1165_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1165_47)).doFinal(((byte[])(__sourceSpill1165_46)));
        (__sourceSpill1165_43)[__sourceSpill1165_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    E = ((long[])(local19_life19));
    F = ((java.lang.Integer[])(new java.lang.Integer[19]));
    J = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1165_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1165_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1165_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1165_59 = new byte[8];
    (__sourceSpill1165_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1165_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1165_61 = __sourceSpill1165_59;
    ((javax.crypto.Cipher)(__sourceSpill1165_56)).init(((int)(__sourceSpill1165_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1165_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1165_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "º\017\026\034ÉÝÈ&9\004ëÂÉ\nè"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1165_70 = local4_life66;
        int __sourceSpill1165_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1165_70)).substring(((int)(__sourceSpill1165_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1165_75 = local6_life64;
        int __sourceSpill1165_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1165_78 = new byte[8];
        (__sourceSpill1165_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1165_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1165_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1165_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1165_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1165_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1165_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1165_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1165_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1165_79)).doFinal(((byte[])(__sourceSpill1165_78)));
        (__sourceSpill1165_75)[__sourceSpill1165_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    H = ((long[])(local6_life64));
    I = ((java.lang.Long[])(new java.lang.Long[2]));
    w = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    x = ((moom.DD)(new moom.DD("textures/gui/title/minecraft.png")));
    y = ((moom.DD)(new moom.DD("textures/misc/vignette.png")));
}

private static native <E extends Throwable> void __sourceHandlerCall_292dde66442a0b515c22(net.minecraft.client.gui.GuiWinGame a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_292dde66442a0b515c22 {

public static void f2325(net.minecraft.client.gui.GuiWinGame receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    net.minecraft.client.renderer.Tessellator life6_10;
    moom.lw life7_13;
    int life8_19;
    int life9_28;
    int life10_37;
    float life11_49;
    int life12_114;
    int life13_116;
    float life14_148;
    java.lang.String life14_189;
    int life13_275;
    int life14_278;
    life4_3 = (__fieldRead2325_0() ^ 34580519402900L);
    __call2325_1(receiver, p0, p1, p2);
    life6_10 = __call2325_2();
    life7_13 = __call2325_3(life6_10);
    life8_19 = __invokedynamic2325_4(4041, (1215902587380894238L ^ life4_3));
    life9_28 = ((__fieldRead2325_5(receiver) / 2) - (life8_19 / 2));
    life10_37 = (__fieldRead2325_6(receiver) + __invokedynamic2325_7(14475, (4351730670867725661L ^ life4_3)));
    float spill2325_0 = (-(((float) __fieldRead2325_8(receiver)) + p2));
    __call2325_9(receiver);
    life11_49 = (spill2325_0 * 0x1.0p-1f);
    __call2325_10();
    __call2325_11(0x0.0p0f, life11_49, 0x0.0p0f);
    __call2325_15(__call2325_13(__fieldRead2325_12(receiver)), __fieldRead2325_14());
    __call2325_16(0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f);
    __call2325_19(receiver, life9_28, life10_37, 0, 0, __invokedynamic2325_17(16686, (4954070476925158642L ^ life4_3)), __invokedynamic2325_18(3615, (4505462203448265670L ^ life4_3)));
    __call2325_24(receiver, (life9_28 + __invokedynamic2325_20(23218, (3368934523453431663L ^ life4_3))), life10_37, 0, __invokedynamic2325_21(13614, (3231951863997608191L ^ life4_3)), __invokedynamic2325_22(23218, (3368934523453431663L ^ life4_3)), __invokedynamic2325_23(17402, (4499316017067509290L ^ life4_3)));
    life12_114 = (life10_37 + __invokedynamic2325_25(5607, (7851721072219099192L ^ life4_3)));
    life13_116 = 0;
    loop_region_117: while ((life13_116 < __call2325_27(__fieldRead2325_26(receiver)))) {
        if ((life13_116 == (__call2325_29(__fieldRead2325_28(receiver)) - 1))) {
        life14_148 = ((((float) life12_114) + life11_49) - ((float) ((__fieldRead2325_30(receiver) / 2) - __invokedynamic2325_31(10607, (5391287199665237152L ^ life4_3)))));
        if ((life14_148 < 0x0.0p0f)) {
        __call2325_32(0x0.0p0f, (-life14_148), 0x0.0p0f);
    }
    }
        if (((((((float) life12_114) + life11_49) + 0x1.8p3f) + 0x1.0p3f) > 0x0.0p0f)) {
        if (((((float) life12_114) + life11_49) < ((float) __fieldRead2325_33(receiver)))) {
        life14_189 = __cast2325_36(__call2325_35(__fieldRead2325_34(receiver), life13_116));
        if (__call2325_37(life14_189, "[C]")) {
        __call2325_44(__fieldRead2325_38(receiver), __call2325_39(life14_189, 3), ((float) (life9_28 + ((life8_19 - __call2325_42(__fieldRead2325_40(receiver), __call2325_41(life14_189, 3))) / 2))), ((float) life12_114), __invokedynamic2325_43(19719, (6791295988254263507L ^ life4_3)));
    } else {
        __call2325_49(__fieldRead2325_46(__fieldRead2325_45(receiver)), ((((long) life13_116) * __invokedynamic2325_47(23295, (1367925618854494875L ^ life4_3))) + ((long) (__fieldRead2325_48(receiver) / 4))));
        __call2325_52(__fieldRead2325_50(receiver), life14_189, ((float) life9_28), ((float) life12_114), __invokedynamic2325_51(9373, (2037010690160370000L ^ life4_3)));
    }
    }
    }
        life12_114 += 12;
        life13_116 += 1;
    }
    __call2325_53();
    __call2325_57(__call2325_55(__fieldRead2325_54(receiver)), __fieldRead2325_56());
    __call2325_58();
    __call2325_60(0, __invokedynamic2325_59(23795, (9181104650788067629L ^ life4_3)));
    life13_275 = __fieldRead2325_61(receiver);
    life14_278 = __fieldRead2325_62(receiver);
    __call2325_65(life7_13, __invokedynamic2325_63(681, (9201733696971999100L ^ life4_3)), __fieldRead2325_64());
    __call2325_70(__call2325_69(__call2325_68(__call2325_67(life7_13, 0x0.0p0d, ((double) life14_278), ((double) __fieldRead2325_66(receiver))), 0x0.0p0d, 0x1.0p0d), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2325_75(__call2325_74(__call2325_73(__call2325_72(life7_13, ((double) life13_275), ((double) life14_278), ((double) __fieldRead2325_71(receiver))), 0x1.0p0d, 0x1.0p0d), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2325_80(__call2325_79(__call2325_78(__call2325_77(life7_13, ((double) life13_275), 0x0.0p0d, ((double) __fieldRead2325_76(receiver))), 0x1.0p0d, 0x0.0p0d), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2325_85(__call2325_84(__call2325_83(__call2325_82(life7_13, 0x0.0p0d, 0x0.0p0d, ((double) __fieldRead2325_81(receiver))), 0x0.0p0d, 0x0.0p0d), 0x1.0p0f, 0x1.0p0f, 0x1.0p0f, 0x1.0p0f));
    __call2325_86(life6_10);
    __call2325_87();
    __call2325_88(receiver, p0, p1, p2);
    return;
}
public static void h2325_0(moom.Oo p0) throws Throwable {
    throw __call1232500_0(p0);
}
public static void h2325_1(moom.Oo p0) throws Throwable {
    throw __call1232501_0(p0);
}
public static void h2325_2(moom.Oo p0) throws Throwable {
    throw __call1232502_0(p0);
}
public static void h2325_3(moom.Oo p0) throws Throwable {
    throw __call1232503_0(p0);
}
private static native long __fieldRead2325_0() throws Throwable;
private static native void __call2325_1(net.minecraft.client.gui.GuiWinGame a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.client.renderer.Tessellator __call2325_2() throws Throwable;
private static native moom.lw __call2325_3(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native int __invokedynamic2325_4(int a0, long a1) throws Throwable;
private static native int __fieldRead2325_5(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __fieldRead2325_6(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __invokedynamic2325_7(int a0, long a1) throws Throwable;
private static native int __fieldRead2325_8(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.lang.Object __call2325_9(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native void __call2325_10() throws Throwable;
private static native void __call2325_11(float a0, float a1, float a2) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2325_12(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call2325_13(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead2325_14() throws Throwable;
private static native void __call2325_15(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call2325_16(float a0, float a1, float a2, float a3) throws Throwable;
private static native int __invokedynamic2325_17(int a0, long a1) throws Throwable;
private static native int __invokedynamic2325_18(int a0, long a1) throws Throwable;
private static native void __call2325_19(net.minecraft.client.gui.GuiWinGame a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic2325_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic2325_21(int a0, long a1) throws Throwable;
private static native int __invokedynamic2325_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic2325_23(int a0, long a1) throws Throwable;
private static native void __call2325_24(net.minecraft.client.gui.GuiWinGame a0, int a1, int a2, int a3, int a4, int a5, int a6) throws Throwable;
private static native int __invokedynamic2325_25(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead2325_26(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __call2325_27(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead2325_28(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __call2325_29(java.util.List a0) throws Throwable;
private static native int __fieldRead2325_30(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __invokedynamic2325_31(int a0, long a1) throws Throwable;
private static native void __call2325_32(float a0, float a1, float a2) throws Throwable;
private static native int __fieldRead2325_33(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.util.List __fieldRead2325_34(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.lang.Object __call2325_35(java.util.List a0, int a1) throws Throwable;
private static native java.lang.String __cast2325_36(java.lang.Object a0) throws Throwable;
private static native boolean __call2325_37(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2325_38(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.lang.String __call2325_39(java.lang.String a0, int a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2325_40(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.lang.String __call2325_41(java.lang.String a0, int a1) throws Throwable;
private static native int __call2325_42(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic2325_43(int a0, long a1) throws Throwable;
private static native int __call2325_44(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2325_45(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.util.Random __fieldRead2325_46(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native long __invokedynamic2325_47(int a0, long a1) throws Throwable;
private static native int __fieldRead2325_48(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native void __call2325_49(java.util.Random a0, long a1) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2325_50(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __invokedynamic2325_51(int a0, long a1) throws Throwable;
private static native int __call2325_52(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, float a2, float a3, int a4) throws Throwable;
private static native void __call2325_53() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2325_54(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.client.renderer.texture.TextureManager __call2325_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.DD __fieldRead2325_56() throws Throwable;
private static native void __call2325_57(net.minecraft.client.renderer.texture.TextureManager a0, moom.DD a1) throws Throwable;
private static native void __call2325_58() throws Throwable;
private static native int __invokedynamic2325_59(int a0, long a1) throws Throwable;
private static native void __call2325_60(int a0, int a1) throws Throwable;
private static native int __fieldRead2325_61(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __fieldRead2325_62(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __invokedynamic2325_63(int a0, long a1) throws Throwable;
private static native moom.oD __fieldRead2325_64() throws Throwable;
private static native void __call2325_65(moom.lw a0, int a1, moom.oD a2) throws Throwable;
private static native float __fieldRead2325_66(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native moom.lw __call2325_67(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2325_68(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2325_69(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2325_70(moom.lw a0) throws Throwable;
private static native float __fieldRead2325_71(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native moom.lw __call2325_72(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2325_73(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2325_74(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2325_75(moom.lw a0) throws Throwable;
private static native float __fieldRead2325_76(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native moom.lw __call2325_77(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2325_78(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2325_79(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2325_80(moom.lw a0) throws Throwable;
private static native float __fieldRead2325_81(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native moom.lw __call2325_82(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native moom.lw __call2325_83(moom.lw a0, double a1, double a2) throws Throwable;
private static native moom.lw __call2325_84(moom.lw a0, float a1, float a2, float a3, float a4) throws Throwable;
private static native void __call2325_85(moom.lw a0) throws Throwable;
private static native void __call2325_86(net.minecraft.client.renderer.Tessellator a0) throws Throwable;
private static native void __call2325_87() throws Throwable;
private static native void __call2325_88(net.minecraft.client.gui.GuiWinGame a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1232500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1232501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1232502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1232503_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_78bd2b3d7ecd8f1994d3(net.minecraft.client.gui.GuiWinGame a0) throws E;
private static final class __SourceHandler_78bd2b3d7ecd8f1994d3 {

public static void f229(net.minecraft.client.gui.GuiWinGame receiver) throws Throwable {
    long life1_3;
    java.lang.String life3_11;
    java.lang.String life4_18;
    int life5_23;
    java.io.InputStream life6_33;
    java.io.BufferedReader life7_42;
    java.util.Random life8_51;
    java.lang.String life3_55;
    java.lang.String life3_64;
    int life11_72;
    java.lang.String life9_77;
    java.lang.String life10_84;
    int life9_119;
    java.io.InputStream life6_145;
    java.io.BufferedReader life7_154;
    java.lang.String life3_158;
    java.lang.String life3_167;
    java.lang.String life3_172;
    life1_3 = (__fieldRead229_0() ^ 37589139765266L);
    if ((__fieldRead229_1(receiver) == null)) {
        __fieldWrite229_3(receiver, __call229_2());
        life3_11 = "";
        int spill229_0 = 18228;
        life4_18 = __invokedynamic229_8(__fieldRead229_4(), __fieldRead229_5(), __fieldRead229_6(), __fieldRead229_7());
        life5_23 = __invokedynamic229_9(spill229_0, (3329128866545616746L ^ life1_3));
        life6_33 = __call229_13(__call229_12(__call229_11(__fieldRead229_10(receiver)), new moom.DD("texts/end.txt")));
        life7_42 = new java.io.BufferedReader(new java.io.InputStreamReader(life6_33, __fieldRead229_14()));
        life8_51 = new java.util.Random(__invokedynamic229_15(13726, (8105849194845595773L ^ life1_3)));
        loop_region_52: while (((life3_55 = __call229_16(life7_42)) != null)) {
        life3_64 = __call229_20(life3_55, "PLAYERNAME", __call229_19(__call229_18(__fieldRead229_17(receiver))));
        loop_region_65: while (__call229_21(life3_64, life4_18)) {
        life11_72 = __call229_22(life3_64, life4_18);
        life9_77 = __call229_23(life3_64, 0, life11_72);
        life10_84 = __call229_25(life3_64, (life11_72 + __call229_24(life4_18)));
        life3_64 = __invokedynamic229_30(life9_77, __fieldRead229_26(), __fieldRead229_27(), __call229_29("XXXXXXXX", 0, (__call229_28(life8_51, 4) + 3)), life10_84);
    }
        __call229_35(__fieldRead229_31(receiver), __call229_34(__fieldRead229_33(__fieldRead229_32(receiver)), life3_64, life5_23));
        __call229_37(__fieldRead229_36(receiver), "");
    }
        __call229_38(life6_33);
        life9_119 = 0;
        loop_region_120: while ((life9_119 < __invokedynamic229_39(28686, (380804956991942747L ^ life1_3)))) {
        __call229_41(__fieldRead229_40(receiver), "");
        life9_119 += 1;
    }
        life6_145 = __call229_45(__call229_44(__call229_43(__fieldRead229_42(receiver)), new moom.DD("texts/credits.txt")));
        life7_154 = new java.io.BufferedReader(new java.io.InputStreamReader(life6_145, __fieldRead229_46()));
        loop_region_153: while (((life3_158 = __call229_47(life7_154)) != null)) {
        life3_167 = __call229_51(life3_158, "PLAYERNAME", __call229_50(__call229_49(__fieldRead229_48(receiver))));
        life3_172 = __call229_52(life3_167, "\t", "    ");
        __call229_57(__fieldRead229_53(receiver), __call229_56(__fieldRead229_55(__fieldRead229_54(receiver)), life3_172, life5_23));
        __call229_59(__fieldRead229_58(receiver), "");
    }
        __call229_60(life6_145);
        __fieldWrite229_64(receiver, (__call229_62(__fieldRead229_61(receiver)) * __invokedynamic229_63(17720, (6585145217442202981L ^ life1_3))));
    }
    return;
}
public static void h229_0(java.lang.Exception p0) throws Throwable {
    throw __call2022900_0(p0);
}
public static void h229_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2022901_1(__fieldRead2022901_0(), "Couldn't load credits", local1);
    return;
}
private static native long __fieldRead229_0() throws Throwable;
private static native java.util.List __fieldRead229_1(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.util.ArrayList __call229_2() throws Throwable;
private static native void __fieldWrite229_3(net.minecraft.client.gui.GuiWinGame a0, java.util.ArrayList a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead229_4() throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead229_5() throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead229_6() throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead229_7() throws Throwable;
private static native java.lang.String __invokedynamic229_8(net.minecraft.util.EnumChatFormatting a0, net.minecraft.util.EnumChatFormatting a1, net.minecraft.util.EnumChatFormatting a2, net.minecraft.util.EnumChatFormatting a3) throws Throwable;
private static native int __invokedynamic229_9(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead229_10(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native moom.oR __call229_11(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call229_12(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call229_13(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead229_14() throws Throwable;
private static native long __invokedynamic229_15(int a0, long a1) throws Throwable;
private static native java.lang.String __call229_16(java.io.BufferedReader a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead229_17(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.util.Session __call229_18(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call229_19(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __call229_20(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native boolean __call229_21(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call229_22(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native java.lang.String __call229_23(java.lang.String a0, int a1, int a2) throws Throwable;
private static native int __call229_24(java.lang.String a0) throws Throwable;
private static native java.lang.String __call229_25(java.lang.String a0, int a1) throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead229_26() throws Throwable;
private static native net.minecraft.util.EnumChatFormatting __fieldRead229_27() throws Throwable;
private static native int __call229_28(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.String __call229_29(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.String __invokedynamic229_30(java.lang.String a0, net.minecraft.util.EnumChatFormatting a1, net.minecraft.util.EnumChatFormatting a2, java.lang.String a3, java.lang.String a4) throws Throwable;
private static native java.util.List __fieldRead229_31(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead229_32(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead229_33(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call229_34(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call229_35(java.util.List a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead229_36(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native boolean __call229_37(java.util.List a0, java.lang.String a1) throws Throwable;
private static native void __call229_38(java.io.InputStream a0) throws Throwable;
private static native int __invokedynamic229_39(int a0, long a1) throws Throwable;
private static native java.util.List __fieldRead229_40(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native boolean __call229_41(java.util.List a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead229_42(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native moom.oR __call229_43(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.resources.IResource __call229_44(moom.oR a0, moom.DD a1) throws Throwable;
private static native java.io.InputStream __call229_45(net.minecraft.client.resources.IResource a0) throws Throwable;
private static native java.nio.charset.Charset __fieldRead229_46() throws Throwable;
private static native java.lang.String __call229_47(java.io.BufferedReader a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead229_48(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.util.Session __call229_49(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.lang.String __call229_50(net.minecraft.util.Session a0) throws Throwable;
private static native java.lang.String __call229_51(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.String __call229_52(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.util.List __fieldRead229_53(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead229_54(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead229_55(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.util.List __call229_56(net.minecraft.client.gui.FontRenderer a0, java.lang.String a1, int a2) throws Throwable;
private static native boolean __call229_57(java.util.List a0, java.util.List a1) throws Throwable;
private static native java.util.List __fieldRead229_58(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native boolean __call229_59(java.util.List a0, java.lang.String a1) throws Throwable;
private static native void __call229_60(java.io.InputStream a0) throws Throwable;
private static native java.util.List __fieldRead229_61(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __call229_62(java.util.List a0) throws Throwable;
private static native int __invokedynamic229_63(int a0, long a1) throws Throwable;
private static native void __fieldWrite229_64(net.minecraft.client.gui.GuiWinGame a0, int a1) throws Throwable;
private static native java.lang.Exception __call2022900_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2022901_0() throws Throwable;
private static native void __call2022901_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_44dc3a2165a0fdbb734a(net.minecraft.client.gui.GuiWinGame a0) throws E;
private static final class __SourceHandler_44dc3a2165a0fdbb734a {

public static void f212(net.minecraft.client.gui.GuiWinGame receiver) throws Throwable {
    long life1_3;
    moom.fS life3_7;
    net.minecraft.client.audio.SoundHandler life4_11;
    float life5_53;
    life1_3 = (__fieldRead212_0() ^ 82660823662265L);
    life3_7 = __call212_2(__fieldRead212_1(receiver));
    life4_11 = __call212_4(__fieldRead212_3(receiver));
    if ((__fieldRead212_5(receiver) == 0)) {
        __call212_6(life3_7);
        __call212_8(life3_7, __fieldRead212_7());
        __call212_9(life4_11);
    }
    __call212_10(life4_11);
    net.minecraft.client.gui.GuiWinGame __stackOp212_11_0 = receiver;
    __fieldWrite212_13(__stackOp212_11_0, (__fieldRead212_12(__stackOp212_11_0) + 1));
    float spill212_0 = ((float) (((__fieldRead212_14(receiver) + __fieldRead212_15(receiver)) + __fieldRead212_16(receiver)) + __invokedynamic212_17(28222, (3802126414537926879L ^ life1_3))));
    __call212_18(receiver);
    life5_53 = (spill212_0 / 0x1.0p-1f);
    if ((((float) __fieldRead212_19(receiver)) > life5_53)) {
        __call212_20(receiver);
    }
    return;
}
public static void h212_0(moom.Oo p0) throws Throwable {
    throw __call1021200_0(p0);
}
public static void h212_1(moom.Oo p0) throws Throwable {
    throw __call1021201_0(p0);
}
private static native long __fieldRead212_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead212_1(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native moom.fS __call212_2(net.minecraft.client.Minecraft a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead212_3(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native net.minecraft.client.audio.SoundHandler __call212_4(net.minecraft.client.Minecraft a0) throws Throwable;
private static native int __fieldRead212_5(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native void __call212_6(moom.fS a0) throws Throwable;
private static native net.minecraft.client.audio.MusicTicker$MusicType __fieldRead212_7() throws Throwable;
private static native void __call212_8(moom.fS a0, net.minecraft.client.audio.MusicTicker$MusicType a1) throws Throwable;
private static native void __call212_9(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native void __call212_10(net.minecraft.client.audio.SoundHandler a0) throws Throwable;
private static native int __fieldRead212_12(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native void __fieldWrite212_13(net.minecraft.client.gui.GuiWinGame a0, int a1) throws Throwable;
private static native int __fieldRead212_14(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __fieldRead212_15(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __fieldRead212_16(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __invokedynamic212_17(int a0, long a1) throws Throwable;
private static native java.lang.Object __call212_18(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native int __fieldRead212_19(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native void __call212_20(net.minecraft.client.gui.GuiWinGame a0) throws Throwable;
private static native java.lang.Exception __call1021200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021201_0(moom.Oo a0) throws Throwable;

}


private void b(int p0, int p1, float p2) {
long local4 = (net.minecraft.client.gui.GuiWinGame.D ^ 30882612743768L);
    net.minecraft.client.renderer.Tessellator local6 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local7 = ((net.minecraft.client.renderer.Tessellator)(local6)).a__lw();
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.Gui.a)));
    ((moom.lw)(local7)).a(((int)(__sourceIntrinsic_6d58e0f3b382_invokedynamic8566_7(5906, (3910579892687380740L ^ local4)))), ((moom.oD)(moom.oB.k)));
    int local8 = this.k;
    float spill8566_0 = 0x0.0p0f;
    float spill8566_1 = ((((float) this.z) + p2) * 0x1.0p-1f);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    float local9 = (spill8566_0 - (spill8566_1 * 0x1.0p-1f));
    float spill8566_2 = ((float) this.l);
    float spill8566_3 = ((((float) this.z) + p2) * 0x1.0p-1f);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    float local10 = (spill8566_2 - (spill8566_3 * 0x1.0p-1f));
    float local11 = 0x1.0p-6f;
    float local12 = (((((float) this.z) + p2) - 0x0.0p0f) * 0x1.47ae14p-6f);
    float spill8566_4 = ((float) (((this.B + this.l) + this.l) + __sourceIntrinsic_6d58e0f3b382_invokedynamic8566_20(12835, (6284761176751572029L ^ local4))));
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    float local13 = (spill8566_4 / 0x1.0p-1f);
    float local14 = (((local13 - 0x1.4p4f) - (((float) this.z) + p2)) * 0x1.47ae14p-8f);
    if ((local14 < local12)) {
        local12 = local14;
    }
    if ((local12 > 0x1.0p0f)) {
        local12 = 0x1.0p0f;
    }
    local12 = (local12 * local12);
    local12 = ((local12 * 0x1.8p6f) / 0x1.fep7f);
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local7)).a(((double)(0x0.0p0d)), ((double)(((double) this.l))), ((double)(((double) this.d)))))).a(((double)(0x0.0p0d)), ((double)(((double) (local9 * local11))))))).a(((float)(local12)), ((float)(local12)), ((float)(local12)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local7)).a(((double)(((double) local8))), ((double)(((double) this.l))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) local8) * local11)))), ((double)(((double) (local9 * local11))))))).a(((float)(local12)), ((float)(local12)), ((float)(local12)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local7)).a(((double)(((double) local8))), ((double)(0x0.0p0d)), ((double)(((double) this.d)))))).a(((double)(((double) (((float) local8) * local11)))), ((double)(((double) (local10 * local11))))))).a(((float)(local12)), ((float)(local12)), ((float)(local12)), ((float)(0x1.0p0f))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(((moom.lw)(local7)).a(((double)(0x0.0p0d)), ((double)(0x0.0p0d)), ((double)(((double) this.d)))))).a(((double)(0x0.0p0d)), ((double)(((double) (local10 * local11))))))).a(((float)(local12)), ((float)(local12)), ((float)(local12)), ((float)(0x1.0p0f))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local6)).a__Void();
    return;
}


public void c__Void() { __sourceHandlerCall_78bd2b3d7ecd8f1994d3(this); }


private static long d(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 3732);
    if (((net.minecraft.client.gui.GuiWinGame.I)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.client.gui.GuiWinGame.H)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.client.gui.GuiWinGame.J)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.client.gui.GuiWinGame.J)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/ha", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.client.gui.GuiWinGame.I)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.client.gui.GuiWinGame.I)[life3_8])).longValue();
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10398_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ha"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.client.gui.GuiWinGame.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21292;
      if (F[var3] == null) {
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
         long var5 = E[var3];
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
         Object[] var9 = (Object[])G.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               G.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/ha", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         F[var3] = var15;
      }

      return F[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiWinGame.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10399_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ha"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a(char p0, int p1) throws java.io.IOException {
try {
        if ((p1 == 1)) {
        ((net.minecraft.client.gui.GuiWinGame)(this)).a();
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw net.minecraft.client.gui.GuiWinGame.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private void a() {
((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(this.i)).K)).cm)).a(((moom.yK)(new moom.zp(net.minecraft.network.play.client.C16PacketClientStatus$EnumState.PERFORM_RESPAWN))));
    ((net.minecraft.client.Minecraft)(this.i)).a(((net.minecraft.client.gui.GuiScreen)(null)));
    return;
}


public boolean a__Boolean() {
return ((1) != 0);
}


public void a(int p0, int p1, float p2) { __sourceHandlerCall_292dde66442a0b515c22(this, p0, p1, p2); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void g() { __sourceHandlerCall_44dc3a2165a0fdbb734a(this); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10399_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d58e0f3b382_invokedynamic8566_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_6d58e0f3b382_invokedynamic8566_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral10398_0() throws E;
}
