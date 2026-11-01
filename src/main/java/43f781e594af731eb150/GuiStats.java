package net.minecraft.client.gui.achievement;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiStats extends net.minecraft.client.gui.GuiScreen implements net.minecraft.client.gui.IProgressMeter {

protected net.minecraft.client.gui.GuiScreen w;

protected java.lang.String x;

private moom.ij y;

private moom.ii z;

private moom.ih A;

private moom.ik B;

private moom.B2 C;

private moom.h1 D;

private boolean E;

private static long F;

private static long[] G;

private static java.lang.Integer[] H;

private static java.util.Map I;

private static long J;

public GuiStats(net.minecraft.client.gui.GuiScreen p0, moom.B2 p1) {
super();
    this.x = "Select world";
    this.E = true;
    this.w = p0;
    this.C = p1;
}

private static native <E extends Throwable> void __sourceHandlerCall_019c474f1760ebc30196(net.minecraft.client.gui.achievement.GuiStats a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_019c474f1760ebc30196 {

public static void f2334(net.minecraft.client.gui.achievement.GuiStats receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    life4_3 = (__fieldRead2334_0() ^ 128850058477379L);
    if (__fieldRead2334_1(receiver)) {
        __call2334_2(receiver);
        __call2334_8(receiver, __fieldRead2334_3(receiver), __call2334_4("multiplayer.downloadingStats", new java.lang.Object[0]), (__fieldRead2334_5(receiver) / 2), (__fieldRead2334_6(receiver) / 2), __invokedynamic2334_7(6546, (3187193055360702500L ^ life4_3)));
        __call2334_19(receiver, __fieldRead2334_9(receiver), (__fieldRead2334_10())[((int) ((__call2334_11() / __fieldRead2334_12()) % ((long) (__fieldRead2334_13()).length)))], (__fieldRead2334_14(receiver) / 2), ((__fieldRead2334_15(receiver) / 2) + (__fieldRead2334_17(__fieldRead2334_16(receiver)) * 2)), __invokedynamic2334_18(27921, (2782064946839071914L ^ life4_3)));
    } else {
        __call2334_21(__fieldRead2334_20(receiver), p0, p1, p2);
        __call2334_27(receiver, __fieldRead2334_22(receiver), __fieldRead2334_23(receiver), (__fieldRead2334_24(receiver) / 2), __invokedynamic2334_25(4770, (2169516994889306907L ^ life4_3)), __invokedynamic2334_26(27921, (2782064946839071914L ^ life4_3)));
        __call2334_28(receiver, p0, p1, p2);
    }
    return;
}
public static void h2334_0(moom.Oo p0) throws Throwable {
    throw __call1233400_0(p0);
}
private static native long __fieldRead2334_0() throws Throwable;
private static native boolean __fieldRead2334_1(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __call2334_2(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2334_3(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native java.lang.String __call2334_4(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native int __fieldRead2334_5(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead2334_6(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic2334_7(int a0, long a1) throws Throwable;
private static native void __call2334_8(net.minecraft.client.gui.achievement.GuiStats a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2334_9(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native java.lang.String[] __fieldRead2334_10() throws Throwable;
private static native long __call2334_11() throws Throwable;
private static native long __fieldRead2334_12() throws Throwable;
private static native java.lang.String[] __fieldRead2334_13() throws Throwable;
private static native int __fieldRead2334_14(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead2334_15(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2334_16(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead2334_17(net.minecraft.client.gui.FontRenderer a0) throws Throwable;
private static native int __invokedynamic2334_18(int a0, long a1) throws Throwable;
private static native void __call2334_19(net.minecraft.client.gui.achievement.GuiStats a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native moom.h1 __fieldRead2334_20(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __call2334_21(moom.h1 a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2334_22(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native java.lang.String __fieldRead2334_23(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead2334_24(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic2334_25(int a0, long a1) throws Throwable;
private static native int __invokedynamic2334_26(int a0, long a1) throws Throwable;
private static native void __call2334_27(net.minecraft.client.gui.achievement.GuiStats a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native void __call2334_28(net.minecraft.client.gui.achievement.GuiStats a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1233400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_22ecf553018c14e70ce0(net.minecraft.client.gui.achievement.GuiStats a0, moom.gc a1) throws E;
private static final class __SourceHandler_22ecf553018c14e70ce0 {

public static void f2336(net.minecraft.client.gui.achievement.GuiStats receiver, moom.gc p0) throws Throwable {
    if (__fieldRead2336_0(p0)) {
        if ((__fieldRead2336_1(p0) == 0)) {
        __call2336_4(__fieldRead2336_2(receiver), __fieldRead2336_3(receiver));
    } else {
        if ((__fieldRead2336_5(p0) == 1)) {
        __fieldWrite2336_7(receiver, __fieldRead2336_6(receiver));
    } else {
        if ((__fieldRead2336_8(p0) == 3)) {
        __fieldWrite2336_10(receiver, __fieldRead2336_9(receiver));
    } else {
        if ((__fieldRead2336_11(p0) == 2)) {
        __fieldWrite2336_13(receiver, __fieldRead2336_12(receiver));
    } else {
        if ((__fieldRead2336_14(p0) == 4)) {
        __fieldWrite2336_16(receiver, __fieldRead2336_15(receiver));
    } else {
        __call2336_18(__fieldRead2336_17(receiver), p0);
    }
    }
    }
    }
    }
    }
    return;
}
public static void h2336_0(java.io.IOException p0) throws Throwable {
    throw __call1233600_0(p0);
}
public static void h2336_1(java.io.IOException p0) throws Throwable {
    throw __call1233601_0(p0);
}
public static void h2336_2(java.io.IOException p0) throws Throwable {
    throw __call1233602_0(p0);
}
public static void h2336_3(java.io.IOException p0) throws Throwable {
    throw __call1233603_0(p0);
}
public static void h2336_4(java.io.IOException p0) throws Throwable {
    throw __call1233604_0(p0);
}
public static void h2336_5(java.io.IOException p0) throws Throwable {
    throw __call1233605_0(p0);
}
private static native boolean __fieldRead2336_0(moom.gc a0) throws Throwable;
private static native int __fieldRead2336_1(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2336_2(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2336_3(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __call2336_4(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead2336_5(moom.gc a0) throws Throwable;
private static native moom.ij __fieldRead2336_6(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __fieldWrite2336_7(net.minecraft.client.gui.achievement.GuiStats a0, moom.ij a1) throws Throwable;
private static native int __fieldRead2336_8(moom.gc a0) throws Throwable;
private static native moom.ii __fieldRead2336_9(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __fieldWrite2336_10(net.minecraft.client.gui.achievement.GuiStats a0, moom.ii a1) throws Throwable;
private static native int __fieldRead2336_11(moom.gc a0) throws Throwable;
private static native moom.ih __fieldRead2336_12(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __fieldWrite2336_13(net.minecraft.client.gui.achievement.GuiStats a0, moom.ih a1) throws Throwable;
private static native int __fieldRead2336_14(moom.gc a0) throws Throwable;
private static native moom.ik __fieldRead2336_15(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __fieldWrite2336_16(net.minecraft.client.gui.achievement.GuiStats a0, moom.ik a1) throws Throwable;
private static native moom.h1 __fieldRead2336_17(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native void __call2336_18(moom.h1 a0, moom.gc a1) throws Throwable;
private static native java.lang.Exception __call1233600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233602_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233603_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233604_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1233605_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_d6407f78581d3ec0d78a(net.minecraft.client.gui.achievement.GuiStats a0) throws E;
private static final class __SourceHandler_d6407f78581d3ec0d78a {

public static boolean f2335(net.minecraft.client.gui.achievement.GuiStats receiver) throws Throwable {
    return ((!__fieldRead2335_0(receiver)) ? true : false);
}
public static void h2335_0(moom.Oo p0) throws Throwable {
    throw __call1233500_0(p0);
}
private static native boolean __fieldRead2335_0(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native java.lang.Exception __call1233500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2e1b4bd3c9e9d9e3fa4f(net.minecraft.client.gui.achievement.GuiStats a0) throws E;
private static final class __SourceHandler_2e1b4bd3c9e9d9e3fa4f {

public static void f215(net.minecraft.client.gui.achievement.GuiStats receiver) throws Throwable {
    long life1_3;
    moom.gc life3_119;
    moom.gc life4_155;
    moom.gc life5_197;
    life1_3 = (__fieldRead215_0() ^ 78536466518751L);
    __call215_8(__fieldRead215_1(receiver), new moom.gc(0, ((__fieldRead215_2(receiver) / 2) + 4), (__fieldRead215_3(receiver) - __invokedynamic215_4(28236, (1416258146618704495L ^ life1_3))), __invokedynamic215_5(2396, (2674157939918136688L ^ life1_3)), __invokedynamic215_6(11764, (3385019689268101588L ^ life1_3)), __call215_7("gui.done", new java.lang.Object[0])));
    __call215_17(__fieldRead215_9(receiver), new moom.gc(1, ((__fieldRead215_10(receiver) / 2) - __invokedynamic215_11(14058, (3241246142493809347L ^ life1_3))), (__fieldRead215_12(receiver) - __invokedynamic215_13(5645, (6748578816399997487L ^ life1_3))), __invokedynamic215_14(9661, (7032476369954097561L ^ life1_3)), __invokedynamic215_15(4770, (2169501831553252999L ^ life1_3)), __call215_16("stat.generalButton", new java.lang.Object[0])));
    __call215_26(__fieldRead215_18(receiver), (life3_119 = new moom.gc(2, ((__fieldRead215_19(receiver) / 2) - __invokedynamic215_20(13023, (5948969036024536820L ^ life1_3))), (__fieldRead215_21(receiver) - __invokedynamic215_22(13931, (5034654362281302605L ^ life1_3))), __invokedynamic215_23(13023, (5948969036024536820L ^ life1_3)), __invokedynamic215_24(4770, (2169501831553252999L ^ life1_3)), __call215_25("stat.blocksButton", new java.lang.Object[0]))));
    __call215_34(__fieldRead215_27(receiver), (life4_155 = new moom.gc(3, (__fieldRead215_28(receiver) / 2), (__fieldRead215_29(receiver) - __invokedynamic215_30(13931, (5034654362281302605L ^ life1_3))), __invokedynamic215_31(13023, (5948969036024536820L ^ life1_3)), __invokedynamic215_32(4770, (2169501831553252999L ^ life1_3)), __call215_33("stat.itemsButton", new java.lang.Object[0]))));
    __call215_43(__fieldRead215_35(receiver), (life5_197 = new moom.gc(4, ((__fieldRead215_36(receiver) / 2) + __invokedynamic215_37(13023, (5948969036024536820L ^ life1_3))), (__fieldRead215_38(receiver) - __invokedynamic215_39(13931, (5034654362281302605L ^ life1_3))), __invokedynamic215_40(13023, (5948969036024536820L ^ life1_3)), __invokedynamic215_41(4770, (2169501831553252999L ^ life1_3)), __call215_42("stat.mobsButton", new java.lang.Object[0]))));
    if ((__call215_45(__fieldRead215_44(receiver)) == 0)) {
        __fieldWrite215_46(life3_119, 0);
    }
    if ((__call215_48(__fieldRead215_47(receiver)) == 0)) {
        __fieldWrite215_49(life4_155, 0);
    }
    if ((__call215_51(__fieldRead215_50(receiver)) == 0)) {
        __fieldWrite215_52(life5_197, 0);
    }
    return;
}
public static void h215_0(moom.Oo p0) throws Throwable {
    throw __call1021500_0(p0);
}
public static void h215_1(moom.Oo p0) throws Throwable {
    throw __call1021501_0(p0);
}
public static void h215_2(moom.Oo p0) throws Throwable {
    throw __call1021502_0(p0);
}
private static native long __fieldRead215_0() throws Throwable;
private static native java.util.List __fieldRead215_1(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead215_2(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead215_3(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_6(int a0, long a1) throws Throwable;
private static native java.lang.String __call215_7(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call215_8(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead215_9(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead215_10(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_11(int a0, long a1) throws Throwable;
private static native int __fieldRead215_12(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_15(int a0, long a1) throws Throwable;
private static native java.lang.String __call215_16(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call215_17(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead215_18(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead215_19(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_20(int a0, long a1) throws Throwable;
private static native int __fieldRead215_21(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_23(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_24(int a0, long a1) throws Throwable;
private static native java.lang.String __call215_25(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call215_26(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead215_27(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead215_28(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead215_29(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_32(int a0, long a1) throws Throwable;
private static native java.lang.String __call215_33(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call215_34(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead215_35(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __fieldRead215_36(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_37(int a0, long a1) throws Throwable;
private static native int __fieldRead215_38(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __invokedynamic215_39(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_40(int a0, long a1) throws Throwable;
private static native int __invokedynamic215_41(int a0, long a1) throws Throwable;
private static native java.lang.String __call215_42(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call215_43(java.util.List a0, moom.gc a1) throws Throwable;
private static native moom.ih __fieldRead215_44(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __call215_45(moom.ih a0) throws Throwable;
private static native void __fieldWrite215_46(moom.gc a0, int a1) throws Throwable;
private static native moom.ii __fieldRead215_47(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __call215_48(moom.ii a0) throws Throwable;
private static native void __fieldWrite215_49(moom.gc a0, int a1) throws Throwable;
private static native moom.ik __fieldRead215_50(net.minecraft.client.gui.achievement.GuiStats a0) throws Throwable;
private static native int __call215_51(moom.ik a0) throws Throwable;
private static native void __fieldWrite215_52(moom.gc a0, int a1) throws Throwable;
private static native java.lang.Exception __call1021500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1021502_0(moom.Oo a0) throws Throwable;

}


static {
F = ((long)(((moom._a)(moom._c.a(((long)(7045039034684820099L)), ((long)(-6183333068552812032L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(13251498897856L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    long local5_life7 = (net.minecraft.client.gui.achievement.GuiStats.F ^ 111956397967010L);
    javax.crypto.Cipher local7_life9;
    javax.crypto.Cipher __sourceSpill1167_11 = (local7_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1167_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1167_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1167_14 = new byte[8];
    (__sourceSpill1167_14)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local8_life15 = 1;
    while ((local8_life15 < 8)) {
        (__sourceSpill1167_14)[local8_life15] = ((byte) ((int) ((local5_life7 << (local8_life15 * 8)) >>> 56)));
        local8_life15 += 1;
    }
    byte[] __sourcePreallocation1167_16 = __sourceSpill1167_14;
    ((javax.crypto.Cipher)(__sourceSpill1167_11)).init(((int)(__sourceSpill1167_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1167_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1167_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local13_life19 = new long[14];
    int local10_life20 = 0;
    java.lang.String local11_life21;
    int local12_life23 = ((java.lang.String)((local11_life21 = "@mTN\037K7¤zdV\002åS8ËÎúÖ\017Z\024ÏtéÛG\036?\030|BFö0\r9\r \"ê:\036\020z\026uû\022o\027mÑT°³:\003À\017I5´@`%QÒ|«V\037ãV»¨"))).length();
    int local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1167_25 = local11_life21;
        int __sourceSpill1167_26 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1167_25)).substring(((int)(__sourceSpill1167_26)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1167_30 = local13_life19;
        int __sourceSpill1167_31 = local10_life20;
        local10_life20 += 1;
        long local15_life32 = (((((((((((long) (local14_life29)[0]) & 255L) << 56) | ((((long) (local14_life29)[1]) & 255L) << 48)) | ((((long) (local14_life29)[2]) & 255L) << 40)) | ((((long) (local14_life29)[3]) & 255L) << 32)) | ((((long) (local14_life29)[4]) & 255L) << 24)) | ((((long) (local14_life29)[5]) & 255L) << 16)) | ((((long) (local14_life29)[6]) & 255L) << 8)) | (((long) (local14_life29)[7]) & 255L));
        byte[] __sourceSpill1167_33 = new byte[8];
        (__sourceSpill1167_33)[0] = ((byte) ((int) (local15_life32 >>> 56)));
        (__sourceSpill1167_33)[1] = ((byte) ((int) (local15_life32 >>> 48)));
        (__sourceSpill1167_33)[2] = ((byte) ((int) (local15_life32 >>> 40)));
        (__sourceSpill1167_33)[3] = ((byte) ((int) (local15_life32 >>> 32)));
        (__sourceSpill1167_33)[4] = ((byte) ((int) (local15_life32 >>> 24)));
        (__sourceSpill1167_33)[5] = ((byte) ((int) (local15_life32 >>> 16)));
        (__sourceSpill1167_33)[6] = ((byte) ((int) (local15_life32 >>> 8)));
        (__sourceSpill1167_33)[7] = ((byte) ((int) local15_life32));
        javax.crypto.Cipher __sourceSpill1167_34 = local7_life9;
        byte[] local17_life36 = ((javax.crypto.Cipher)(__sourceSpill1167_34)).doFinal(((byte[])(__sourceSpill1167_33)));
        (__sourceSpill1167_30)[__sourceSpill1167_31] = (((((((((((long) (local17_life36)[0]) & 255L) << 56) | ((((long) (local17_life36)[1]) & 255L) << 48)) | ((((long) (local17_life36)[2]) & 255L) << 40)) | ((((long) (local17_life36)[3]) & 255L) << 32)) | ((((long) (local17_life36)[4]) & 255L) << 24)) | ((((long) (local17_life36)[5]) & 255L) << 16)) | ((((long) (local17_life36)[6]) & 255L) << 8)) | (((long) (local17_life36)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    local12_life23 = ((java.lang.String)((local11_life21 = "\035%ªj²¶D½Æ¤~æ"))).length();
    local9_life24 = 0;
    do {
        java.lang.String __sourceSpill1167_38 = local11_life21;
        int __sourceSpill1167_39 = local9_life24;
        local9_life24 += 8;
        byte[] local14_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1167_38)).substring(((int)(__sourceSpill1167_39)), ((int)(local9_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1167_43 = local13_life19;
        int __sourceSpill1167_44 = local10_life20;
        local10_life20 += 1;
        long local15_life45 = (((((((((((long) (local14_life42)[0]) & 255L) << 56) | ((((long) (local14_life42)[1]) & 255L) << 48)) | ((((long) (local14_life42)[2]) & 255L) << 40)) | ((((long) (local14_life42)[3]) & 255L) << 32)) | ((((long) (local14_life42)[4]) & 255L) << 24)) | ((((long) (local14_life42)[5]) & 255L) << 16)) | ((((long) (local14_life42)[6]) & 255L) << 8)) | (((long) (local14_life42)[7]) & 255L));
        byte[] __sourceSpill1167_46 = new byte[8];
        (__sourceSpill1167_46)[0] = ((byte) ((int) (local15_life45 >>> 56)));
        (__sourceSpill1167_46)[1] = ((byte) ((int) (local15_life45 >>> 48)));
        (__sourceSpill1167_46)[2] = ((byte) ((int) (local15_life45 >>> 40)));
        (__sourceSpill1167_46)[3] = ((byte) ((int) (local15_life45 >>> 32)));
        (__sourceSpill1167_46)[4] = ((byte) ((int) (local15_life45 >>> 24)));
        (__sourceSpill1167_46)[5] = ((byte) ((int) (local15_life45 >>> 16)));
        (__sourceSpill1167_46)[6] = ((byte) ((int) (local15_life45 >>> 8)));
        (__sourceSpill1167_46)[7] = ((byte) ((int) local15_life45));
        javax.crypto.Cipher __sourceSpill1167_47 = local7_life9;
        byte[] local17_life49 = ((javax.crypto.Cipher)(__sourceSpill1167_47)).doFinal(((byte[])(__sourceSpill1167_46)));
        (__sourceSpill1167_43)[__sourceSpill1167_44] = (((((((((((long) (local17_life49)[0]) & 255L) << 56) | ((((long) (local17_life49)[1]) & 255L) << 48)) | ((((long) (local17_life49)[2]) & 255L) << 40)) | ((((long) (local17_life49)[3]) & 255L) << 32)) | ((((long) (local17_life49)[4]) & 255L) << 24)) | ((((long) (local17_life49)[5]) & 255L) << 16)) | ((((long) (local17_life49)[6]) & 255L) << 8)) | (((long) (local17_life49)[7]) & 255L));
    } while ((!(local9_life24 >= local12_life23)));
    G = ((long[])(local13_life19));
    H = ((java.lang.Integer[])(new java.lang.Integer[14]));
    javax.crypto.Cipher local0_life53;
    javax.crypto.Cipher __sourceSpill1167_55 = (local0_life53 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1167_56 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1167_57 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1167_58 = new byte[8];
    (__sourceSpill1167_58)[0] = ((byte) ((int) (local5_life7 >>> 56)));
    int local1_life59 = 1;
    while ((local1_life59 < 8)) {
        (__sourceSpill1167_58)[local1_life59] = ((byte) ((int) ((local5_life7 << (local1_life59 * 8)) >>> 56)));
        local1_life59 += 1;
    }
    byte[] __sourcePreallocation1167_60 = __sourceSpill1167_58;
    ((javax.crypto.Cipher)(__sourceSpill1167_55)).init(((int)(__sourceSpill1167_56)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1167_57)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1167_60)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life63 = -8937141976895341011L;
    byte[] __sourceSpill1167_64 = new byte[8];
    (__sourceSpill1167_64)[0] = ((byte) ((int) (local2_life63 >>> 56)));
    (__sourceSpill1167_64)[1] = ((byte) ((int) (local2_life63 >>> 48)));
    (__sourceSpill1167_64)[2] = ((byte) ((int) (local2_life63 >>> 40)));
    (__sourceSpill1167_64)[3] = ((byte) ((int) (local2_life63 >>> 32)));
    (__sourceSpill1167_64)[4] = ((byte) ((int) (local2_life63 >>> 24)));
    (__sourceSpill1167_64)[5] = ((byte) ((int) (local2_life63 >>> 16)));
    (__sourceSpill1167_64)[6] = ((byte) ((int) (local2_life63 >>> 8)));
    (__sourceSpill1167_64)[7] = ((byte) ((int) local2_life63));
    javax.crypto.Cipher __sourceSpill1167_65 = local0_life53;
    byte[] local4_life67 = ((javax.crypto.Cipher)(__sourceSpill1167_65)).doFinal(((byte[])(__sourceSpill1167_64)));
    J = ((long)((((((((((((long) (local4_life67)[0]) & 255L) << 56) | ((((long) (local4_life67)[1]) & 255L) << 48)) | ((((long) (local4_life67)[2]) & 255L) << 40)) | ((((long) (local4_life67)[3]) & 255L) << 32)) | ((((long) (local4_life67)[4]) & 255L) << 24)) | ((((long) (local4_life67)[5]) & 255L) << 16)) | ((((long) (local4_life67)[6]) & 255L) << 8)) | (((long) (local4_life67)[7]) & 255L))));
}


static net.minecraft.client.gui.FontRenderer i(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


private void b(int p0, int p1) {
((net.minecraft.client.gui.achievement.GuiStats)(this)).c(((int)(p0)), ((int)(p1)), ((int)(0)), ((int)(0)));
    return;
}


static void b(net.minecraft.client.gui.achievement.GuiStats p0, int p1, int p2, int p3, int p4, int p5, int p6) {
((net.minecraft.client.gui.achievement.GuiStats)(p0)).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)));
    return;
}


public void b() {
this.y = ((moom.ij)(new moom.ij(this, this.i)));
    ((moom.ij)(this.y)).c(((int)(1)), ((int)(1)));
    this.z = ((moom.ii)(new moom.ii(this, this.i)));
    ((moom.ii)(this.z)).c(((int)(1)), ((int)(1)));
    this.A = ((moom.ih)(new moom.ih(this, this.i)));
    ((moom.ih)(this.A)).c(((int)(1)), ((int)(1)));
    this.B = ((moom.ik)(new moom.ik(this, this.i)));
    ((moom.ik)(this.B)).c(((int)(1)), ((int)(1)));
    return;
}


static net.minecraft.client.gui.FontRenderer b(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer e(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


public void e() throws java.io.IOException {
try {
        super.e();
        if ((this.D != null)) {
        ((moom.h1)(this.D)).c__Void();
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw net.minecraft.client.gui.achievement.GuiStats.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


private void c(int p0, int p1, int p2, int p3) {
long local5 = (net.minecraft.client.gui.achievement.GuiStats.F ^ 37928395132900L);
    moom.kZ.c(((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)), ((float)(0x1.0p0f)));
    ((net.minecraft.client.renderer.texture.TextureManager)(((net.minecraft.client.Minecraft)(this.i)).a__ok())).a__Void(((moom.DD)(net.minecraft.client.gui.achievement.GuiStats.b)));
    float local7 = 0x1.0p-7f;
    float local8 = 0x1.0p-7f;
    int local9 = __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_6(21953, (5800307423194522843L ^ local5));
    int local10 = __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_7(3980, (493502030920351386L ^ local5));
    net.minecraft.client.renderer.Tessellator local11 = net.minecraft.client.renderer.Tessellator.a();
    moom.lw local12 = ((net.minecraft.client.renderer.Tessellator)(local11)).a__lw();
    ((moom.lw)(local12)).a(((int)(__sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_10(4164, (7795182843588043095L ^ local5)))), ((moom.oD)(moom.oB.i)));
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) (p1 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_13(3980, (493502030920351386L ^ local5)))))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) p2) * 0x1.0p-7f)))), ((double)(((double) (((float) (p3 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_16(3980, (493502030920351386L ^ local5)))) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_19(3980, (493502030920351386L ^ local5)))))), ((double)(((double) (p1 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_20(3980, (493502030920351386L ^ local5)))))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) (p2 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_23(3980, (493502030920351386L ^ local5)))) * 0x1.0p-7f)))), ((double)(((double) (((float) (p3 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_24(3980, (493502030920351386L ^ local5)))) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) (p0 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_27(3980, (493502030920351386L ^ local5)))))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) (p2 + __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_30(3980, (493502030920351386L ^ local5)))) * 0x1.0p-7f)))), ((double)(((double) (((float) p3) * 0x1.0p-7f))))))).c__Void();
    ((moom.lw)(((moom.lw)(((moom.lw)(local12)).a(((double)(((double) p0))), ((double)(((double) p1))), ((double)(((double) this.d)))))).a(((double)(((double) (((float) p2) * 0x1.0p-7f)))), ((double)(((double) (((float) p3) * 0x1.0p-7f))))))).c__Void();
    ((net.minecraft.client.renderer.Tessellator)(local11)).a__Void();
    return;
}


static net.minecraft.client.gui.FontRenderer c(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


public void c__Void() {
this.x = ((java.lang.String)(moom.oO.a(((java.lang.String)("gui.stats")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.E = ((boolean)(true));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.Minecraft)(this.i)).a__jS())).a(((moom.yK)(new moom.zp(net.minecraft.network.play.client.C16PacketClientStatus$EnumState.REQUEST_STATS))));
    return;
}


static net.minecraft.client.gui.FontRenderer n(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer h(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer f(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer l(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer d(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


public void a(int p0, int p1, float p2) { __sourceHandlerCall_019c474f1760ebc30196(this, p0, p1, p2); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10417_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/hf"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_22ecf553018c14e70ce0(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5964;
      if (H[var3] == null) {
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
         long var5 = G[var3];
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
         Object[] var9 = (Object[])I.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               I.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/hf", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         H[var3] = var15;
      }

      return H[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.achievement.GuiStats.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


static net.minecraft.client.gui.FontRenderer a(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


public boolean a__Boolean() { return __sourceHandlerCall_d6407f78581d3ec0d78a(this); }


public void a() {
try {
        if (this.E) {
        ((net.minecraft.client.gui.achievement.GuiStats)(this)).b();
        ((net.minecraft.client.gui.achievement.GuiStats)(this)).j();
        this.D = ((moom.h1)(this.y));
        this.E = ((boolean)(false));
    }
    } catch (moom.Oo caught_rethrow_0) {
        throw net.minecraft.client.gui.achievement.GuiStats.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}


static void a(net.minecraft.client.gui.achievement.GuiStats p0, int p1, int p2, int p3, int p4, int p5, int p6) {
((net.minecraft.client.gui.achievement.GuiStats)(p0)).a(((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((int)(p5)), ((int)(p6)));
    return;
}


private void a(int p0, int p1, net.minecraft.item.Item p2) {
((net.minecraft.client.gui.achievement.GuiStats)(this)).b(((int)((p0 + 1))), ((int)((p1 + 1))));
    moom.kZ.y();
    moom.lt.c();
    ((net.minecraft.client.renderer.entity.RenderItem)(this.j)).a(((net.minecraft.item.ItemStack)(new net.minecraft.item.ItemStack(p2, 1, 0))), ((float)(((float) (p0 + 2)))), ((float)(((float) (p1 + 2)))));
    moom.lt.a();
    moom.kZ.z();
    return;
}


static net.minecraft.client.gui.FontRenderer m(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer o(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer p(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer k(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer g(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer j(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


public void j() { __sourceHandlerCall_2e1b4bd3c9e9d9e3fa4f(this); }


static net.minecraft.client.gui.FontRenderer q(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


static net.minecraft.client.gui.FontRenderer r(net.minecraft.client.gui.achievement.GuiStats p0) {
return ((net.minecraft.client.gui.achievement.GuiStats)(p0)).p;
}


private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_13(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_19(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8f97abcbcfce_originalDynamicSite1805_30(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10417_0() throws E;
}
