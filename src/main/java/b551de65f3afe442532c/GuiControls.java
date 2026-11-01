package net.minecraft.client.gui;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class GuiControls extends net.minecraft.client.gui.GuiScreen {

private static net.minecraft.client.settings.GameSettings$Options[] w;

private net.minecraft.client.gui.GuiScreen x;

protected java.lang.String y;

private net.minecraft.client.settings.GameSettings z;

public moom.pz A;

public long B;

private moom.h6 C;

private moom.gc D;

private static long E;

private static long[] F;

private static java.lang.Integer[] G;

private static java.util.Map H;

public GuiControls(net.minecraft.client.gui.GuiScreen p0, net.minecraft.client.settings.GameSettings p1) {
super();
    this.y = "Controls";
    this.A = null;
    this.x = p0;
    this.z = p1;
}


static {
E = ((long)(((moom._a)(moom._c.a(((long)(3026223579926235444L)), ((long)(-2465717368861414624L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(176193252939647L)))));
    H = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.client.gui.GuiControls.E ^ 34427261943768L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1769_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1769_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1769_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1769_14 = new byte[8];
    (__sourceSpill1769_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1769_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1769_16 = __sourceSpill1769_14;
    ((javax.crypto.Cipher)(__sourceSpill1769_11)).init(((int)(__sourceSpill1769_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1769_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1769_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[23];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "»aÚ\"ÈáktÍ\003ß\000t¶G4,ÉWg\004\031\020\002\1772üÒì¾ù²qÛG×\033¦hP-c[¶O)QÎ\0300__I\013\r=\032Ã7â\002ëh\006Í ²\031Y)PÛè«6­ÀOã\"\021F\035\016£ïlsÂÓÊ3Lz\rä«QÚ>N&\006ÂÃõ~ÙæÏÂÂ¬KsR)ÓÛ¹o´·käX¼q\002úí\024¤Ýó~ºQw\037øªX"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1769_25 = local6_life21;
        int __sourceSpill1769_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1769_25)).substring(((int)(__sourceSpill1769_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1769_30 = local8_life19;
        int __sourceSpill1769_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1769_33 = new byte[8];
        (__sourceSpill1769_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1769_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1769_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1769_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1769_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1769_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1769_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1769_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1769_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1769_34)).doFinal(((byte[])(__sourceSpill1769_33)));
        (__sourceSpill1769_30)[__sourceSpill1769_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "+àâî¡ò!ýS@[X:"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1769_38 = local6_life21;
        int __sourceSpill1769_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1769_38)).substring(((int)(__sourceSpill1769_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1769_43 = local8_life19;
        int __sourceSpill1769_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1769_46 = new byte[8];
        (__sourceSpill1769_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1769_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1769_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1769_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1769_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1769_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1769_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1769_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1769_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1769_47)).doFinal(((byte[])(__sourceSpill1769_46)));
        (__sourceSpill1769_43)[__sourceSpill1769_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    F = ((long[])(local8_life19));
    G = ((java.lang.Integer[])(new java.lang.Integer[23]));
    net.minecraft.client.settings.GameSettings$Options[] __sourceSpill1769_53 = new net.minecraft.client.settings.GameSettings$Options[3];
    (__sourceSpill1769_53)[0] = net.minecraft.client.settings.GameSettings$Options.INVERT_MOUSE;
    (__sourceSpill1769_53)[1] = net.minecraft.client.settings.GameSettings$Options.SENSITIVITY;
    (__sourceSpill1769_53)[2] = net.minecraft.client.settings.GameSettings$Options.TOUCHSCREEN;
    w = ((net.minecraft.client.settings.GameSettings$Options[])(__sourceSpill1769_53));
}

private static native <E extends Throwable> void __sourceHandlerCall_ceeb7ad714ffc634bd8a(net.minecraft.client.gui.GuiControls a0, char a1, int a2) throws E;
private static final class __SourceHandler_ceeb7ad714ffc634bd8a {

public static void f2223(net.minecraft.client.gui.GuiControls receiver, char p0, int p1) throws Throwable {
    long life3_3;
    life3_3 = (__fieldRead2223_0() ^ 52721676663789L);
    if ((__fieldRead2223_1(receiver) != null)) {
        if ((p1 == 1)) {
        __call2223_4(__fieldRead2223_2(receiver), __fieldRead2223_3(receiver), 0);
    } else {
        if ((p1 != 0)) {
        __call2223_7(__fieldRead2223_5(receiver), __fieldRead2223_6(receiver), p1);
    } else {
        if ((p0 > 0)) {
        __call2223_11(__fieldRead2223_8(receiver), __fieldRead2223_9(receiver), (p0 + __invokedynamic2223_10(2185, (7991529866537161034L ^ life3_3))));
    }
    }
    }
        __fieldWrite2223_12(receiver, null);
        __fieldWrite2223_14(receiver, __call2223_13());
        __call2223_15();
    } else {
        __call2223_16(receiver, p0, p1);
    }
    return;
}
public static void h2223_0(java.io.IOException p0) throws Throwable {
    throw __call1222300_0(p0);
}
public static void h2223_1(java.io.IOException p0) throws Throwable {
    throw __call1222301_0(p0);
}
public static void h2223_2(java.io.IOException p0) throws Throwable {
    throw __call1222302_0(p0);
}
public static void h2223_3(java.io.IOException p0) throws Throwable {
    throw __call1222303_0(p0);
}
private static native long __fieldRead2223_0() throws Throwable;
private static native moom.pz __fieldRead2223_1(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2223_2(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native moom.pz __fieldRead2223_3(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native void __call2223_4(net.minecraft.client.settings.GameSettings a0, moom.pz a1, int a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2223_5(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native moom.pz __fieldRead2223_6(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native void __call2223_7(net.minecraft.client.settings.GameSettings a0, moom.pz a1, int a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2223_8(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native moom.pz __fieldRead2223_9(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic2223_10(int a0, long a1) throws Throwable;
private static native void __call2223_11(net.minecraft.client.settings.GameSettings a0, moom.pz a1, int a2) throws Throwable;
private static native void __fieldWrite2223_12(net.minecraft.client.gui.GuiControls a0, java.lang.Object a1) throws Throwable;
private static native long __call2223_13() throws Throwable;
private static native void __fieldWrite2223_14(net.minecraft.client.gui.GuiControls a0, long a1) throws Throwable;
private static native void __call2223_15() throws Throwable;
private static native void __call2223_16(net.minecraft.client.gui.GuiControls a0, char a1, int a2) throws Throwable;
private static native java.lang.Exception __call1222300_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222301_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222302_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222303_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_367901cd100f192f20c0(net.minecraft.client.gui.GuiControls a0, int a1, int a2, float a3) throws E;
private static final class __SourceHandler_367901cd100f192f20c0 {

public static void f2224(net.minecraft.client.gui.GuiControls receiver, int p0, int p1, float p2) throws Throwable {
    long life4_3;
    int life6_33;
    moom.pz[] life7_37;
    int life8_40;
    int life9_42;
    moom.pz life10_49;
    life4_3 = (__fieldRead2224_0() ^ 29293218816550L);
    __call2224_1(receiver);
    __call2224_3(__fieldRead2224_2(receiver), p0, p1, p2);
    __call2224_9(receiver, __fieldRead2224_4(receiver), __fieldRead2224_5(receiver), (__fieldRead2224_6(receiver) / 2), __invokedynamic2224_7(4136, (7444876228710633517L ^ life4_3)), __invokedynamic2224_8(9792, (8289487287141213785L ^ life4_3)));
    life6_33 = 1;
    life7_37 = __fieldRead2224_11(__fieldRead2224_10(receiver));
    life8_40 = (life7_37).length;
    life9_42 = 0;
    loop_region_43: while ((life9_42 < life8_40)) {
        life10_49 = (life7_37)[life9_42];
        if ((__call2224_12(life10_49) != __call2224_13(life10_49))) {
        life6_33 = 0;
        break loop_region_43;
    }
        life9_42 += 1;
    }
    moom.gc spill2224_0 = __fieldRead2224_14(receiver);
    __fieldWrite2224_15(spill2224_0, ((life6_33 == 0) ? 1 : 0));
    __call2224_16(receiver, p0, p1, p2);
    return;
}
public static void h2224_0(moom.Oo p0) throws Throwable {
    throw __call1222400_0(p0);
}
private static native long __fieldRead2224_0() throws Throwable;
private static native void __call2224_1(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native moom.h6 __fieldRead2224_2(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native void __call2224_3(moom.h6 a0, int a1, int a2, float a3) throws Throwable;
private static native net.minecraft.client.gui.FontRenderer __fieldRead2224_4(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native java.lang.String __fieldRead2224_5(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __fieldRead2224_6(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic2224_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic2224_8(int a0, long a1) throws Throwable;
private static native void __call2224_9(net.minecraft.client.gui.GuiControls a0, net.minecraft.client.gui.FontRenderer a1, java.lang.String a2, int a3, int a4, int a5) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2224_10(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native moom.pz[] __fieldRead2224_11(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call2224_12(moom.pz a0) throws Throwable;
private static native int __call2224_13(moom.pz a0) throws Throwable;
private static native moom.gc __fieldRead2224_14(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native void __fieldWrite2224_15(moom.gc a0, int a1) throws Throwable;
private static native void __call2224_16(net.minecraft.client.gui.GuiControls a0, int a1, int a2, float a3) throws Throwable;
private static native java.lang.Exception __call1222400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9055fa49fffd49aeb272(net.minecraft.client.gui.GuiControls a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_9055fa49fffd49aeb272 {

public static void f1302(net.minecraft.client.gui.GuiControls receiver, int p0, int p1, int p2) throws Throwable {
    long life4_3;
    forward_join_38: {
    forward_join_33: {
    forward_join_24: {
    life4_3 = (__fieldRead1302_0() ^ 131632284039482L);
    if (!((__fieldRead1302_1(receiver) != null))) { break forward_join_24; }
    __call1302_5(__fieldRead1302_2(receiver), __fieldRead1302_3(receiver), (__invokedynamic1302_4(966, (2525729287381850324L ^ life4_3)) + p2));
    __fieldWrite1302_6(receiver, null);
    __call1302_7();
    break forward_join_38;
    }
    if (!((p2 == 0))) { break forward_join_33; }
    if (!((!__call1302_9(__fieldRead1302_8(receiver), p0, p1, p2)))) { break forward_join_38; }
    }
    __call1302_10(receiver, p0, p1, p2);
    }
    return;
}
public static void h1302_0(java.io.IOException p0) throws Throwable {
    throw __call1130200_0(p0);
}
public static void h1302_1(java.io.IOException p0) throws Throwable {
    throw __call1130201_0(p0);
}
public static void h1302_2(java.io.IOException p0) throws Throwable {
    throw __call1130202_0(p0);
}
private static native long __fieldRead1302_0() throws Throwable;
private static native moom.pz __fieldRead1302_1(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead1302_2(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native moom.pz __fieldRead1302_3(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic1302_4(int a0, long a1) throws Throwable;
private static native void __call1302_5(net.minecraft.client.settings.GameSettings a0, moom.pz a1, int a2) throws Throwable;
private static native void __fieldWrite1302_6(net.minecraft.client.gui.GuiControls a0, java.lang.Object a1) throws Throwable;
private static native void __call1302_7() throws Throwable;
private static native moom.h6 __fieldRead1302_8(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native boolean __call1302_9(moom.h6 a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1302_10(net.minecraft.client.gui.GuiControls a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1130200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130201_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1130202_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bf41dc8823a04eb4300a(net.minecraft.client.gui.GuiControls a0, moom.gc a1) throws E;
private static final class __SourceHandler_bf41dc8823a04eb4300a {

public static void f2226(net.minecraft.client.gui.GuiControls receiver, moom.gc p0) throws Throwable {
    long life2_3;
    moom.pz[] life4_32;
    int life5_35;
    int life6_37;
    moom.pz life7_44;
    life2_3 = (__fieldRead2226_0() ^ 110453514892865L);
    if ((__fieldRead2226_1(p0) == __invokedynamic2226_2(22012, (2723549994640097691L ^ life2_3)))) {
        __call2226_5(__fieldRead2226_3(receiver), __fieldRead2226_4(receiver));
    } else {
        if ((__fieldRead2226_6(p0) == __invokedynamic2226_7(7507, (7482450731826121001L ^ life2_3)))) {
        life4_32 = __fieldRead2226_10(__fieldRead2226_9(__fieldRead2226_8(receiver)));
        life5_35 = (life4_32).length;
        life6_37 = 0;
        loop_region_36: while ((life6_37 < life5_35)) {
        life7_44 = (life4_32)[life6_37];
        __call2226_12(life7_44, __call2226_11(life7_44));
        life6_37 += 1;
    }
        __call2226_13();
    } else {
        if ((__fieldRead2226_14(p0) < __invokedynamic2226_15(19053, (979445468859915797L ^ life2_3)))) {
        if ((__instanceOf2226_16(p0) != 0)) {
        __call2226_20(__fieldRead2226_17(receiver), __call2226_19(__cast2226_18(p0)), 1);
        __fieldWrite2226_25(p0, __call2226_24(__fieldRead2226_21(receiver), __call2226_23(__fieldRead2226_22(p0))));
    }
    }
    }
    }
    return;
}
public static void h2226_0(java.io.IOException p0) throws Throwable {
    throw __call1222600_0(p0);
}
public static void h2226_1(java.io.IOException p0) throws Throwable {
    throw __call1222601_0(p0);
}
public static void h2226_2(java.io.IOException p0) throws Throwable {
    throw __call1222602_0(p0);
}
private static native long __fieldRead2226_0() throws Throwable;
private static native int __fieldRead2226_1(moom.gc a0) throws Throwable;
private static native int __invokedynamic2226_2(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2226_3(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native net.minecraft.client.gui.GuiScreen __fieldRead2226_4(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native void __call2226_5(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiScreen a1) throws Throwable;
private static native int __fieldRead2226_6(moom.gc a0) throws Throwable;
private static native int __invokedynamic2226_7(int a0, long a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead2226_8(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2226_9(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.pz[] __fieldRead2226_10(net.minecraft.client.settings.GameSettings a0) throws Throwable;
private static native int __call2226_11(moom.pz a0) throws Throwable;
private static native void __call2226_12(moom.pz a0, int a1) throws Throwable;
private static native void __call2226_13() throws Throwable;
private static native int __fieldRead2226_14(moom.gc a0) throws Throwable;
private static native int __invokedynamic2226_15(int a0, long a1) throws Throwable;
private static native int __instanceOf2226_16(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2226_17(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native moom.gi __cast2226_18(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __call2226_19(moom.gi a0) throws Throwable;
private static native void __call2226_20(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1, int a2) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead2226_21(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __fieldRead2226_22(moom.gc a0) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options __call2226_23(int a0) throws Throwable;
private static native java.lang.String __call2226_24(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native void __fieldWrite2226_25(moom.gc a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1222600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222601_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1222602_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_20bd55bba6176161bdc5(net.minecraft.client.gui.GuiControls a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_20bd55bba6176161bdc5 {

public static void f1303(net.minecraft.client.gui.GuiControls receiver, int p0, int p1, int p2) throws Throwable {
    forward_join_14: {
    forward_join_9: {
    if (!((p2 == 0))) { break forward_join_9; }
    if (!((!__call1303_1(__fieldRead1303_0(receiver), p0, p1, p2)))) { break forward_join_14; }
    }
    __call1303_2(receiver, p0, p1, p2);
    }
    return;
}
public static void h1303_0(moom.Oo p0) throws Throwable {
    throw __call1130300_0(p0);
}
public static void h1303_1(moom.Oo p0) throws Throwable {
    throw __call1130301_0(p0);
}
private static native moom.h6 __fieldRead1303_0(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native boolean __call1303_1(moom.h6 a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1303_2(net.minecraft.client.gui.GuiControls a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Exception __call1130300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1130301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bd4ef777fbadcdd808fa(net.minecraft.client.gui.GuiControls a0) throws E;
private static final class __SourceHandler_bd4ef777fbadcdd808fa {

public static void f200(net.minecraft.client.gui.GuiControls receiver) throws Throwable {
    long life1_3;
    int life3_116;
    net.minecraft.client.settings.GameSettings$Options[] life4_118;
    int life5_121;
    int life6_123;
    net.minecraft.client.settings.GameSettings$Options life7_130;
    life1_3 = (__fieldRead200_0() ^ 43949782165408L);
    __fieldWrite200_2(receiver, new moom.h6(receiver, __fieldRead200_1(receiver)));
    __call200_12(__fieldRead200_3(receiver), new moom.gc(__invokedynamic200_4(10278, (7395957987125800364L ^ life1_3)), ((__fieldRead200_5(receiver) / 2) - __invokedynamic200_6(27741, (3574718936566032861L ^ life1_3))), (__fieldRead200_7(receiver) - __invokedynamic200_8(11836, (5354462053952531389L ^ life1_3))), __invokedynamic200_9(26902, (5557094041831140494L ^ life1_3)), __invokedynamic200_10(29867, (3358766323869544753L ^ life1_3)), __call200_11("gui.done", new java.lang.Object[0])));
    java.util.List spill200_0 = __fieldRead200_13(receiver);
    net.minecraft.client.gui.GuiControls __stackOp200_23_0 = receiver;
    moom.gc __stackOp200_23_1 = new moom.gc(__invokedynamic200_14(19726, (4906524308698450051L ^ life1_3)), (((__fieldRead200_15(receiver) / 2) - __invokedynamic200_16(26865, (4170784831514242424L ^ life1_3))) + __invokedynamic200_17(8654, (8702836225849959490L ^ life1_3))), (__fieldRead200_18(receiver) - __invokedynamic200_19(1596, (4287220580088578976L ^ life1_3))), __invokedynamic200_20(19483, (459793204869613968L ^ life1_3)), __invokedynamic200_21(3978, (154427587200387597L ^ life1_3)), __call200_22("controls.resetAll", new java.lang.Object[0]));
    moom.gc spill200_1 = __stackOp200_23_1;
    __fieldWrite200_24(__stackOp200_23_0, __stackOp200_23_1);
    __call200_25(spill200_0, spill200_1);
    __fieldWrite200_27(receiver, __call200_26("controls.title", new java.lang.Object[0]));
    life3_116 = 0;
    life4_118 = __fieldRead200_28();
    life5_121 = (life4_118).length;
    life6_123 = 0;
    loop_region_124: while ((life6_123 < life5_121)) {
        life7_130 = (life4_118)[life6_123];
        if (__call200_29(life7_130)) {
        __call200_37(__fieldRead200_30(receiver), new moom.gk(__call200_31(life7_130), (((__fieldRead200_32(receiver) / 2) - __invokedynamic200_33(26865, (4170784831514242424L ^ life1_3))) + ((life3_116 % 2) * __invokedynamic200_34(16755, (6736872235957470449L ^ life1_3)))), (__invokedynamic200_35(14539, (123699523273309519L ^ life1_3)) + (__invokedynamic200_36(6492, (1349380740196343001L ^ life1_3)) * (life3_116 >> 1))), life7_130));
    } else {
        __call200_47(__fieldRead200_38(receiver), new moom.gi(__call200_39(life7_130), (((__fieldRead200_40(receiver) / 2) - __invokedynamic200_41(26865, (4170784831514242424L ^ life1_3))) + ((life3_116 % 2) * __invokedynamic200_42(16755, (6736872235957470449L ^ life1_3)))), (__invokedynamic200_43(28260, (1014840386992794617L ^ life1_3)) + (__invokedynamic200_44(21753, (341541159483462006L ^ life1_3)) * (life3_116 >> 1))), life7_130, __call200_46(__fieldRead200_45(receiver), life7_130)));
    }
        life3_116 += 1;
        life6_123 += 1;
    }
    return;
}
public static void h200_0(moom.Oo p0) throws Throwable {
    throw __call1020000_0(p0);
}
private static native long __fieldRead200_0() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead200_1(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native void __fieldWrite200_2(net.minecraft.client.gui.GuiControls a0, moom.h6 a1) throws Throwable;
private static native java.util.List __fieldRead200_3(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_4(int a0, long a1) throws Throwable;
private static native int __fieldRead200_5(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_6(int a0, long a1) throws Throwable;
private static native int __fieldRead200_7(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_9(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_10(int a0, long a1) throws Throwable;
private static native java.lang.String __call200_11(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native boolean __call200_12(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.util.List __fieldRead200_13(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_14(int a0, long a1) throws Throwable;
private static native int __fieldRead200_15(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_16(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_17(int a0, long a1) throws Throwable;
private static native int __fieldRead200_18(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_21(int a0, long a1) throws Throwable;
private static native java.lang.String __call200_22(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite200_24(net.minecraft.client.gui.GuiControls a0, moom.gc a1) throws Throwable;
private static native boolean __call200_25(java.util.List a0, moom.gc a1) throws Throwable;
private static native java.lang.String __call200_26(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __fieldWrite200_27(net.minecraft.client.gui.GuiControls a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings$Options[] __fieldRead200_28() throws Throwable;
private static native boolean __call200_29(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native java.util.List __fieldRead200_30(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __call200_31(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __fieldRead200_32(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_34(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_36(int a0, long a1) throws Throwable;
private static native boolean __call200_37(java.util.List a0, moom.gk a1) throws Throwable;
private static native java.util.List __fieldRead200_38(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __call200_39(net.minecraft.client.settings.GameSettings$Options a0) throws Throwable;
private static native int __fieldRead200_40(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native int __invokedynamic200_41(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_42(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_43(int a0, long a1) throws Throwable;
private static native int __invokedynamic200_44(int a0, long a1) throws Throwable;
private static native net.minecraft.client.settings.GameSettings __fieldRead200_45(net.minecraft.client.gui.GuiControls a0) throws Throwable;
private static native java.lang.String __call200_46(net.minecraft.client.settings.GameSettings a0, net.minecraft.client.settings.GameSettings$Options a1) throws Throwable;
private static native boolean __call200_47(java.util.List a0, moom.gi a1) throws Throwable;
private static native java.lang.Exception __call1020000_0(moom.Oo a0) throws Throwable;

}


protected void b(int p0, int p1, int p2) { __sourceHandlerCall_20bd55bba6176161bdc5(this, p0, p1, p2); }


public void e() throws java.io.IOException {
super.e();
    ((moom.h6)(this.C)).c__Void();
    return;
}


public void c__Void() { __sourceHandlerCall_bd4ef777fbadcdd808fa(this); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.client.gui.GuiControls.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22270;
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
            throw new RuntimeException("moom/gJ", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         G[var3] = var15;
      }

      return G[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral10226_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gJ"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_bf41dc8823a04eb4300a(this, p0); }


protected void a(int p0, int p1, int p2) throws java.io.IOException { __sourceHandlerCall_9055fa49fffd49aeb272(this, p0, p1, p2); }


protected void a(char p0, int p1) throws java.io.IOException { __sourceHandlerCall_ceeb7ad714ffc634bd8a(this, p0, p1); }


public void a(int p0, int p1, float p2) { __sourceHandlerCall_367901cd100f192f20c0(this, p0, p1, p2); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral10226_0() throws E;
}
