package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class gK extends net.minecraft.client.gui.GuiScreen {

private net.minecraft.client.gui.GuiCreateWorld w;

private moom.FG x;

private java.lang.String y;

private java.lang.String z;

private java.lang.String A;

private moom.h2 B;

private moom.gc C;

private moom.gc D;

private moom.gc E;

private static long F;

private static long[] G;

private static java.lang.Integer[] H;

private static java.util.Map I;

public gK(net.minecraft.client.gui.GuiCreateWorld p0, java.lang.String p1) {
super();
    this.x = moom.FG.a__FG();
    this.w = p0;
    (this).a(p1);
}


static {
F = ((long)(((moom._a)(moom._c.a(((long)(8757629463041540476L)), ((long)(8689486889820848329L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(258100475139144L)))));
    I = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.gK.F ^ 80000885697325L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1213_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1213_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1213_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1213_14 = new byte[8];
    (__sourceSpill1213_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1213_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1213_16 = __sourceSpill1213_14;
    ((javax.crypto.Cipher)(__sourceSpill1213_11)).init(((int)(__sourceSpill1213_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1213_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1213_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[22];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\037ÞT¯ÐÍ)%ã¹^´\026y£ñ]³°\023Ü½½}ºI\026Ò\005+HNí5(\013 qT&¥\021Ä\030!OÆ\036×Û»aî§\034\020\001C×â4=ÄÝ\000¢\033ið\003µH\002ÅK\"Aõ\"ÃhÃ%Æ¦,BÉ©\017f»2è\r\022µEÉ£¶ÈÄ°h@ï£ll\"*Zbû62O·\035+ É8=\022H'l=×;z\"LÜ\037FR&=Xeß1\t­r"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1213_25 = local6_life21;
        int __sourceSpill1213_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1213_25)).substring(((int)(__sourceSpill1213_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1213_30 = local8_life19;
        int __sourceSpill1213_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1213_33 = new byte[8];
        (__sourceSpill1213_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1213_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1213_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1213_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1213_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1213_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1213_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1213_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1213_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1213_34)).doFinal(((byte[])(__sourceSpill1213_33)));
        (__sourceSpill1213_30)[__sourceSpill1213_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "øÔO\022\000\004B;ãz_x¸Ìõ"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1213_38 = local6_life21;
        int __sourceSpill1213_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1213_38)).substring(((int)(__sourceSpill1213_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1213_43 = local8_life19;
        int __sourceSpill1213_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1213_46 = new byte[8];
        (__sourceSpill1213_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1213_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1213_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1213_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1213_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1213_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1213_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1213_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1213_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1213_47)).doFinal(((byte[])(__sourceSpill1213_46)));
        (__sourceSpill1213_43)[__sourceSpill1213_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    G = ((long[])(local8_life19));
    H = ((java.lang.Integer[])(new java.lang.Integer[22]));
}

private static native <E extends Throwable> void __sourceHandlerCall_bed9dce63c3b9bec2111(moom.gK a0, moom.gc a1) throws E;
private static final class __SourceHandler_bed9dce63c3b9bec2111 {

public static void f1740(moom.gK receiver, moom.gc p0) throws Throwable {
    int life2_10;
    life2_10 = ((__call1740_2(__call1740_1(__fieldRead1740_0(receiver))) - __fieldRead1740_4(__fieldRead1740_3(receiver))) - 1);
    if ((__fieldRead1740_5(p0) == 1)) {
        __call1740_8(__fieldRead1740_6(receiver), __fieldRead1740_7(receiver));
    } else {
        if ((__fieldRead1740_9(p0) == 0)) {
        __fieldWrite1740_12(__fieldRead1740_10(receiver), __call1740_11(receiver));
        __call1740_15(__fieldRead1740_13(receiver), __fieldRead1740_14(receiver));
    } else {
        if ((__fieldRead1740_16(p0) == 5)) {
        __call1740_18(__fieldRead1740_17(receiver), new moom.gR(receiver));
    } else {
        if ((__fieldRead1740_19(p0) == 4)) {
        if (__call1740_20(receiver)) {
        __call1740_23(__call1740_22(__fieldRead1740_21(receiver)), life2_10);
        __fieldWrite1740_31(__fieldRead1740_24(receiver), __call1740_30(__fieldRead1740_26(__fieldRead1740_25(receiver)), (__call1740_29(__call1740_28(__fieldRead1740_27(receiver))) - 1)));
    }
    }
    }
    }
    }
    __call1740_33(__fieldRead1740_32(receiver));
    __call1740_34(receiver);
    return;
}
public static void h1740_0(java.io.IOException p0) throws Throwable {
    throw __call1174000_0(p0);
}
public static void h1740_1(java.io.IOException p0) throws Throwable {
    throw __call1174001_0(p0);
}
public static void h1740_2(java.io.IOException p0) throws Throwable {
    throw __call1174002_0(p0);
}
public static void h1740_3(java.io.IOException p0) throws Throwable {
    throw __call1174003_0(p0);
}
public static void h1740_4(java.io.IOException p0) throws Throwable {
    throw __call1174004_0(p0);
}
private static native moom.FG __fieldRead1740_0(moom.gK a0) throws Throwable;
private static native java.util.List __call1740_1(moom.FG a0) throws Throwable;
private static native int __call1740_2(java.util.List a0) throws Throwable;
private static native moom.h2 __fieldRead1740_3(moom.gK a0) throws Throwable;
private static native int __fieldRead1740_4(moom.h2 a0) throws Throwable;
private static native int __fieldRead1740_5(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1740_6(moom.gK a0) throws Throwable;
private static native net.minecraft.client.gui.GuiCreateWorld __fieldRead1740_7(moom.gK a0) throws Throwable;
private static native void __call1740_8(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiCreateWorld a1) throws Throwable;
private static native int __fieldRead1740_9(moom.gc a0) throws Throwable;
private static native net.minecraft.client.gui.GuiCreateWorld __fieldRead1740_10(moom.gK a0) throws Throwable;
private static native java.lang.String __call1740_11(moom.gK a0) throws Throwable;
private static native void __fieldWrite1740_12(net.minecraft.client.gui.GuiCreateWorld a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1740_13(moom.gK a0) throws Throwable;
private static native net.minecraft.client.gui.GuiCreateWorld __fieldRead1740_14(moom.gK a0) throws Throwable;
private static native void __call1740_15(net.minecraft.client.Minecraft a0, net.minecraft.client.gui.GuiCreateWorld a1) throws Throwable;
private static native int __fieldRead1740_16(moom.gc a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead1740_17(moom.gK a0) throws Throwable;
private static native void __call1740_18(net.minecraft.client.Minecraft a0, moom.gR a1) throws Throwable;
private static native int __fieldRead1740_19(moom.gc a0) throws Throwable;
private static native boolean __call1740_20(moom.gK a0) throws Throwable;
private static native moom.FG __fieldRead1740_21(moom.gK a0) throws Throwable;
private static native java.util.List __call1740_22(moom.FG a0) throws Throwable;
private static native java.lang.Object __call1740_23(java.util.List a0, int a1) throws Throwable;
private static native moom.h2 __fieldRead1740_24(moom.gK a0) throws Throwable;
private static native moom.h2 __fieldRead1740_25(moom.gK a0) throws Throwable;
private static native int __fieldRead1740_26(moom.h2 a0) throws Throwable;
private static native moom.FG __fieldRead1740_27(moom.gK a0) throws Throwable;
private static native java.util.List __call1740_28(moom.FG a0) throws Throwable;
private static native int __call1740_29(java.util.List a0) throws Throwable;
private static native int __call1740_30(int a0, int a1) throws Throwable;
private static native void __fieldWrite1740_31(moom.h2 a0, int a1) throws Throwable;
private static native moom.FG __fieldRead1740_32(moom.gK a0) throws Throwable;
private static native void __call1740_33(moom.FG a0) throws Throwable;
private static native void __call1740_34(moom.gK a0) throws Throwable;
private static native java.lang.Exception __call1174000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174001_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174002_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174003_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1174004_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_35c30a454963378e18cf(moom.gK a0) throws E;
private static final class __SourceHandler_35c30a454963378e18cf {

public static boolean f1036(moom.gK receiver) throws Throwable {
    int forwardValue1036_16_0;
    forward_join_16: {
    forward_join_15: {
    if (!((__fieldRead1036_1(__fieldRead1036_0(receiver)) > -1))) {
        break forward_join_15;
    }
    if (!((__fieldRead1036_3(__fieldRead1036_2(receiver)) < __call1036_6(__call1036_5(__fieldRead1036_4(receiver)))))) {
        break forward_join_15;
    }
    forwardValue1036_16_0 = 1;
    break forward_join_16;
    }
    forwardValue1036_16_0 = 0;
    }
    return __integerCategory1036_7(forwardValue1036_16_0);
}
public static void h1036_0(moom.Oo p0) throws Throwable {
    throw __call1103600_0(p0);
}
public static void h1036_1(moom.Oo p0) throws Throwable {
    throw __call1103601_0(p0);
}
private static native moom.h2 __fieldRead1036_0(moom.gK a0) throws Throwable;
private static native int __fieldRead1036_1(moom.h2 a0) throws Throwable;
private static native moom.h2 __fieldRead1036_2(moom.gK a0) throws Throwable;
private static native int __fieldRead1036_3(moom.h2 a0) throws Throwable;
private static native moom.FG __fieldRead1036_4(moom.gK a0) throws Throwable;
private static native java.util.List __call1036_5(moom.FG a0) throws Throwable;
private static native int __call1036_6(java.util.List a0) throws Throwable;
private static native boolean __integerCategory1036_7(int value) throws Throwable;
private static native java.lang.Exception __call1103600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1103601_0(moom.Oo a0) throws Throwable;

}


public void e() throws java.io.IOException {
super.e();
    ((moom.h2)(this.B)).c__Void();
    return;
}


private boolean e__Boolean() { return __sourceHandlerCall_35c30a454963378e18cf(this); }


public java.lang.String c() {
return ((moom.FG)(this.x)).toString();
}


public void c__Void() {
long life1_3;
    life1_3 = (moom.gK.F ^ 43033466348255L);
    ((java.util.List)(this.m)).clear();
    this.y = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.flat.title")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.z = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.flat.tile")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.A = ((java.lang.String)(moom.oO.a(((java.lang.String)("createWorld.customize.flat.height")), ((java.lang.Object[])(new java.lang.Object[0])))));
    this.B = ((moom.h2)(new moom.h2(this)));
    java.util.List spill369_0 = this.m;
    moom.gK __stackOp369_19_0 = this;
    moom.gc __stackOp369_19_1 = new moom.gc(2, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_12(14309, (5119644710260026909L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_14(3254, (3924121031481398593L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_15(13655, (5073659900972674209L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_16(6451, (393269796212965584L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_18(moom.oO.a(((java.lang.String)("createWorld.customize.flat.addLayer")), ((java.lang.Object[])(new java.lang.Object[0])))));
    moom.gc spill369_1 = __stackOp369_19_1;
    ((moom.gK)(__stackOp369_19_0)).C = ((moom.gc)(__stackOp369_19_1));
    ((java.util.List)(spill369_0)).add(((java.lang.Object)(spill369_1)));
    java.util.List spill369_2 = this.m;
    moom.gK __stackOp369_31_0 = this;
    moom.gc __stackOp369_31_1 = new moom.gc(3, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_24(12149, (8171135633334613646L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_26(3604, (4154234620895926250L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_27(16144, (6238821557499733741L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_28(12593, (2880707322534832325L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_30(moom.oO.a(((java.lang.String)("createWorld.customize.flat.editLayer")), ((java.lang.Object[])(new java.lang.Object[0])))));
    moom.gc spill369_3 = __stackOp369_31_1;
    ((moom.gK)(__stackOp369_31_0)).D = ((moom.gc)(__stackOp369_31_1));
    ((java.util.List)(spill369_2)).add(((java.lang.Object)(spill369_3)));
    java.util.List spill369_4 = this.m;
    moom.gK __stackOp369_42_0 = this;
    moom.gc __stackOp369_42_1 = new moom.gc(4, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_36(18274, (6039316999647878808L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_38(3604, (4154234620895926250L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_39(26693, (7202302042742354362L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_40(12593, (2880707322534832325L ^ life1_3)), moom.oO.a(((java.lang.String)("createWorld.customize.flat.removeLayer")), ((java.lang.Object[])(new java.lang.Object[0]))));
    moom.gc spill369_5 = __stackOp369_42_1;
    ((moom.gK)(__stackOp369_42_0)).E = ((moom.gc)(__stackOp369_42_1));
    ((java.util.List)(spill369_4)).add(((java.lang.Object)(spill369_5)));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(0, ((this.k / 2) - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_47(8574, (2182196448147781788L ^ life1_3))), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_49(16920, (6866809544835193849L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_50(2357, (209389292666917063L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_51(12593, (2880707322534832325L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.done")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(5, ((this.k / 2) + 5), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_57(3604, (4154234620895926250L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_58(2357, (209389292666917063L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_59(12593, (2880707322534832325L ^ life1_3)), moom.oO.a(((java.lang.String)("createWorld.customize.presets")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    ((java.util.List)(this.m)).add(((java.lang.Object)(new moom.gc(1, ((this.k / 2) + 5), (this.l - __sourceIntrinsic_7ac46ee229a8_invokedynamic369_65(20423, (8856767650601883168L ^ life1_3))), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_66(2357, (209389292666917063L ^ life1_3)), __sourceIntrinsic_7ac46ee229a8_invokedynamic369_67(12593, (2880707322534832325L ^ life1_3)), moom.oO.a(((java.lang.String)("gui.cancel")), ((java.lang.Object[])(new java.lang.Object[0])))))));
    moom.gc spill369_6 = this.C;
    moom.gc __stackOp369_72_0 = this.D;
    int __stackOp369_72_1 = 0;
    int spill369_7 = __stackOp369_72_1;
    ((moom.gc)(__stackOp369_72_0)).n = ((boolean)__sourceIntrinsic_integerToBoolean((__stackOp369_72_1)));
    ((moom.gc)(spill369_6)).n = ((boolean)__sourceIntrinsic_integerToBoolean((spill369_7)));
    ((moom.FG)(this.x)).a__Void();
    ((moom.gK)(this)).a();
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x4A85;
        if (H[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = G[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])I.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    I.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/gK", exception);
            }
            int n4 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            gK.H[n2] = n4;
        }
        return H[n2];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.gK.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral7710_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/gK"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a() {
int local1 = __sourceIntrinsic_booleanToInteger(((moom.gK)(this)).e__Boolean());
    ((moom.gc)(this.E)).m = ((boolean)__sourceIntrinsic_integerToBoolean((local1)));
    ((moom.gc)(this.D)).m = ((boolean)__sourceIntrinsic_integerToBoolean((local1)));
    ((moom.gc)(this.D)).m = ((boolean)(false));
    ((moom.gc)(this.C)).m = ((boolean)(false));
    return;
}


public void a(java.lang.String p0) {
this.x = ((moom.FG)(moom.FG.a(((java.lang.String)(p0)))));
    return;
}


public void a(int p0, int p1, float p2) {
long local4 = (moom.gK.F ^ 29132808791897L);
    ((moom.gK)(this)).i();
    ((moom.h2)(this.B)).a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    ((moom.gK)(this)).a(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.y)), ((int)((this.k / 2))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_7(32367, (419836443149099545L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_8(24970, (6662060680563260921L ^ local4)))));
    int local6 = (((this.k / 2) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_11(15826, (6474644725378884005L ^ local4))) - __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_12(7274, (8240627956666433548L ^ local4)));
    ((moom.gK)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.z)), ((int)(local6)), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_15(7850, (6821197569177420496L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_16(8213, (1482792099817766005L ^ local4)))));
    ((moom.gK)(this)).b(((net.minecraft.client.gui.FontRenderer)(this.p)), ((java.lang.String)(this.A)), ((int)((((local6 + 2) + __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_20(19484, (5799958406860820585L ^ local4))) - ((net.minecraft.client.gui.FontRenderer)(this.p)).a(((java.lang.String)(this.A)))))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_24(26701, (3947867854288679986L ^ local4)))), ((int)(__sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_25(8213, (1482792099817766005L ^ local4)))));
    super.a(((int)(p0)), ((int)(p1)), ((float)(p2)));
    return;
}


protected void a__Void(moom.gc p0) throws java.io.IOException { __sourceHandlerCall_bed9dce63c3b9bec2111(this, p0); }


private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_20(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_95e4e99d9b0c_originalDynamicSite1449_25(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral7710_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_15(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_16(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic369_18(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_24(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_26(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_27(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_28(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7ac46ee229a8_invokedynamic369_30(java.lang.String a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_36(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_39(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_40(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_47(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_49(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_50(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_51(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_57(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_65(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_66(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7ac46ee229a8_invokedynamic369_67(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanToInteger(boolean value);
private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
