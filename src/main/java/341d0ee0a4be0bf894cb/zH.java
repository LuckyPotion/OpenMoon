package moom;

import io.netty.buffer.ByteBuf;


public class zH implements moom.yK<moom.y2> {

private int a;

private int b;

private int c;

private int d;

private int e;

private int f;

private int g;

private int h;

private int i;

private int j;

private int k;

private static long l;

public zH(net.minecraft.entity.Entity p0, int p1, int p2) { super(); __sourceHandlerCall_e910956cd23a723e77a8(this, p0, p1, p2); }


public zH(net.minecraft.entity.Entity p0, int p1) {
this(((net.minecraft.entity.Entity)(p0)), ((int)(p1)), ((int)(0)));
    return;
}


public zH() {
super();
}


static {
moom.zH.l = (moom._c.a(6274240091577246872L, -1296461837223219131L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(22496734189818L);
}

private static native <E extends Throwable> void __sourceHandlerCall_e910956cd23a723e77a8(moom.zH a0, net.minecraft.entity.Entity a1, int a2, int a3) throws E;
private static final class __SourceHandler_e910956cd23a723e77a8 {

public static void f517(moom.zH receiver, net.minecraft.entity.Entity p0, int p1, int p2) throws Throwable {
    int forwardValue517_84_0;
    int forwardValue517_94_0;
    int forwardValue517_103_0;
    int forwardValue517_111_0;
    int forwardValue517_121_0;
    double forwardValue517_123_0;
    int[] spill517_0;
    int spill517_1;
    double spill517_2;
    long life4_3;
    int[] life6_7;
    double life7_61;
    double life9_64;
    double life11_67;
    double life13_69;
    forward_join_142: {
    forward_join_124: {
    forward_join_123: {
    forward_join_121: {
    forward_join_116: {
    forward_join_111: {
    forward_join_108: {
    forward_join_103: {
    forward_join_100: {
    forward_join_94: {
    forward_join_90: {
    forward_join_84: {
    forward_join_80: {
    life4_3 = (__fieldRead517_0() ^ 114439920578692L);
    spill517_0 = __call517_1();
    __directSuperInit517_2(receiver);
    life6_7 = spill517_0;
    __fieldWrite517_4(receiver, __call517_3(p0));
    __fieldWrite517_7(receiver, __call517_6((__fieldRead517_5(p0) * 0x1.0p5d)));
    __fieldWrite517_10(receiver, __call517_9((__fieldRead517_8(p0) * 0x1.0p5d)));
    __fieldWrite517_13(receiver, __call517_12((__fieldRead517_11(p0) * 0x1.0p5d)));
    __fieldWrite517_16(receiver, __call517_15(((__fieldRead517_14(p0) * 0x1.0p8f) / 0x1.68p8f)));
    __fieldWrite517_19(receiver, __call517_18(((__fieldRead517_17(p0) * 0x1.0p8f) / 0x1.68p8f)));
    __fieldWrite517_20(receiver, p1);
    __fieldWrite517_21(receiver, p2);
    if (!((p2 > 0))) {
        break forward_join_142;
    }
    life7_61 = __fieldRead517_22(p0);
    life9_64 = __fieldRead517_23(p0);
    life11_67 = __fieldRead517_24(p0);
    life13_69 = 0x1.f333333333333p1d;
    spill517_1 = __numericCompare517_25(life7_61, (-life13_69));
    if (!((life6_7 == null))) {
        forwardValue517_84_0 = spill517_1;
        break forward_join_84;
    }
    if (!((spill517_1 < 0))) {
        break forward_join_80;
    }
    life7_61 = (-life13_69);
    }
    forwardValue517_84_0 = __numericCompare517_26(life9_64, (-life13_69));
    }
    if (!((life6_7 == null))) {
        forwardValue517_94_0 = forwardValue517_84_0;
        break forward_join_94;
    }
    if (!((forwardValue517_84_0 < 0))) {
        break forward_join_90;
    }
    life9_64 = (-life13_69);
    }
    forwardValue517_94_0 = __numericCompare517_27(life11_67, (-life13_69));
    }
    if (!((life6_7 == null))) {
        forwardValue517_103_0 = forwardValue517_94_0;
        break forward_join_103;
    }
    if (!((forwardValue517_94_0 < 0))) {
        break forward_join_100;
    }
    life11_67 = (-life13_69);
    }
    forwardValue517_103_0 = __numericCompare517_28(life7_61, life13_69);
    }
    if (!((life6_7 == null))) {
        forwardValue517_111_0 = forwardValue517_103_0;
        break forward_join_111;
    }
    if (!((forwardValue517_103_0 > 0))) {
        break forward_join_108;
    }
    life7_61 = life13_69;
    }
    forwardValue517_111_0 = __numericCompare517_29(life9_64, life13_69);
    }
    if (!((life6_7 == null))) {
        forwardValue517_121_0 = forwardValue517_111_0;
        break forward_join_121;
    }
    if (!((forwardValue517_111_0 > 0))) {
        break forward_join_116;
    }
    life9_64 = life13_69;
    }
    spill517_2 = life11_67;
    if (!((life6_7 == null))) {
        forwardValue517_123_0 = spill517_2;
        break forward_join_123;
    }
    forwardValue517_121_0 = __numericCompare517_30(spill517_2, life13_69);
    }
    if (!((forwardValue517_121_0 > 0))) {
        break forward_join_124;
    }
    forwardValue517_123_0 = life13_69;
    }
    life11_67 = forwardValue517_123_0;
    }
    __fieldWrite517_31(receiver, ((int) (life7_61 * 0x1.f4p12d)));
    __fieldWrite517_32(receiver, ((int) (life9_64 * 0x1.f4p12d)));
    __fieldWrite517_33(receiver, ((int) (life11_67 * 0x1.f4p12d)));
    }
    return;
}
public static void h517_0(moom.Oo p0) throws Throwable {
    throw __call3051700_0(p0);
}
public static void h517_1(moom.Oo p0) throws Throwable {
    throw __call3051701_0(p0);
}
public static void h517_2(moom.Oo p0) throws Throwable {
    throw __call3051702_0(p0);
}
public static void h517_3(moom.Oo p0) throws Throwable {
    throw __call3051703_0(p0);
}
public static void h517_4(moom.Oo p0) throws Throwable {
    throw __call3051704_0(p0);
}
public static void h517_5(moom.Oo p0) throws Throwable {
    throw __call3051705_0(p0);
}
private static native long __fieldRead517_0() throws Throwable;
private static native int[] __call517_1() throws Throwable;
private static native void __directSuperInit517_2(moom.zH a0) throws Throwable;
private static native int __call517_3(net.minecraft.entity.Entity a0) throws Throwable;
private static native void __fieldWrite517_4(moom.zH a0, int a1) throws Throwable;
private static native double __fieldRead517_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call517_6(double a0) throws Throwable;
private static native void __fieldWrite517_7(moom.zH a0, int a1) throws Throwable;
private static native double __fieldRead517_8(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call517_9(double a0) throws Throwable;
private static native void __fieldWrite517_10(moom.zH a0, int a1) throws Throwable;
private static native double __fieldRead517_11(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call517_12(double a0) throws Throwable;
private static native void __fieldWrite517_13(moom.zH a0, int a1) throws Throwable;
private static native float __fieldRead517_14(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call517_15(float a0) throws Throwable;
private static native void __fieldWrite517_16(moom.zH a0, int a1) throws Throwable;
private static native float __fieldRead517_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call517_18(float a0) throws Throwable;
private static native void __fieldWrite517_19(moom.zH a0, int a1) throws Throwable;
private static native void __fieldWrite517_20(moom.zH a0, int a1) throws Throwable;
private static native void __fieldWrite517_21(moom.zH a0, int a1) throws Throwable;
private static native double __fieldRead517_22(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead517_23(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead517_24(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __numericCompare517_25(double a0, double a1) throws Throwable;
private static native int __numericCompare517_26(double a0, double a1) throws Throwable;
private static native int __numericCompare517_27(double a0, double a1) throws Throwable;
private static native int __numericCompare517_28(double a0, double a1) throws Throwable;
private static native int __numericCompare517_29(double a0, double a1) throws Throwable;
private static native int __numericCompare517_30(double a0, double a1) throws Throwable;
private static native void __fieldWrite517_31(moom.zH a0, int a1) throws Throwable;
private static native void __fieldWrite517_32(moom.zH a0, int a1) throws Throwable;
private static native void __fieldWrite517_33(moom.zH a0, int a1) throws Throwable;
private static native java.lang.Exception __call3051700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3051701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3051702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3051703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3051704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3051705_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1cab7e3771e3f89c75f6(moom.zH a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_1cab7e3771e3f89c75f6 {

public static void f1251(moom.zH receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    moom.zH forwardValue1251_52_0;
    int[] spill1251_0;
    moom.zH spill1251_1;
    long life2_3;
    int[] life4_25;
    forward_join_55: {
    forward_join_52: {
    life2_3 = (__fieldRead1251_0() ^ 17705976930581L);
    __fieldWrite1251_2(receiver, __call1251_1(p0));
    __fieldWrite1251_4(receiver, __call1251_3(p0));
    __fieldWrite1251_6(receiver, __call1251_5(p0));
    __fieldWrite1251_8(receiver, __call1251_7(p0));
    spill1251_0 = __call1251_9();
    __fieldWrite1251_11(receiver, __call1251_10(p0));
    life4_25 = spill1251_0;
    __fieldWrite1251_13(receiver, __call1251_12(p0));
    __fieldWrite1251_15(receiver, __call1251_14(p0));
    __fieldWrite1251_17(receiver, __call1251_16(p0));
    spill1251_1 = receiver;
    if (!((life4_25 == null))) {
        forwardValue1251_52_0 = spill1251_1;
        break forward_join_52;
    }
    if (!((__fieldRead1251_18(spill1251_1) > 0))) {
        break forward_join_55;
    }
    __fieldWrite1251_20(receiver, __call1251_19(p0));
    __fieldWrite1251_22(receiver, __call1251_21(p0));
    forwardValue1251_52_0 = receiver;
    }
    __fieldWrite1251_24(forwardValue1251_52_0, __call1251_23(p0));
    }
    return;
}
public static void h1251_0(java.io.IOException p0) throws Throwable {
    throw __call1125100_0(p0);
}
public static void h1251_1(java.io.IOException p0) throws Throwable {
    throw __call1125101_0(p0);
}
private static native long __fieldRead1251_0() throws Throwable;
private static native int __call1251_1(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_2(moom.zH a0, int a1) throws Throwable;
private static native byte __call1251_3(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_4(moom.zH a0, byte a1) throws Throwable;
private static native int __call1251_5(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_6(moom.zH a0, int a1) throws Throwable;
private static native int __call1251_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_8(moom.zH a0, int a1) throws Throwable;
private static native int[] __call1251_9() throws Throwable;
private static native int __call1251_10(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_11(moom.zH a0, int a1) throws Throwable;
private static native byte __call1251_12(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_13(moom.zH a0, byte a1) throws Throwable;
private static native byte __call1251_14(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_15(moom.zH a0, byte a1) throws Throwable;
private static native int __call1251_16(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_17(moom.zH a0, int a1) throws Throwable;
private static native int __fieldRead1251_18(moom.zH a0) throws Throwable;
private static native short __call1251_19(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_20(moom.zH a0, short a1) throws Throwable;
private static native short __call1251_21(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_22(moom.zH a0, short a1) throws Throwable;
private static native short __call1251_23(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1251_24(moom.zH a0, short a1) throws Throwable;
private static native java.lang.Exception __call1125100_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1125101_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2413d9a3abf5e7186804(moom.zH a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_2413d9a3abf5e7186804 {

public static void f1252(moom.zH receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    long life2_3;
    int[] life4_24;
    forward_join_65: {
    forward_join_60: {
    life2_3 = (__fieldRead1252_0() ^ 113041595593372L);
    int[] spill1252_0 = __call1252_1();
    __call1252_3(p0, __fieldRead1252_2(receiver));
    __call1252_5(p0, __fieldRead1252_4(receiver));
    __call1252_7(p0, __fieldRead1252_6(receiver));
    __call1252_9(p0, __fieldRead1252_8(receiver));
    life4_24 = spill1252_0;
    __call1252_11(p0, __fieldRead1252_10(receiver));
    __call1252_13(p0, __fieldRead1252_12(receiver));
    __call1252_15(p0, __fieldRead1252_14(receiver));
    __call1252_17(p0, __fieldRead1252_16(receiver));
    if (!((life4_24 == null))) { break forward_join_60; }
    if (!((__fieldRead1252_18(receiver) > 0))) { break forward_join_65; }
    __call1252_20(p0, __fieldRead1252_19(receiver));
    __call1252_22(p0, __fieldRead1252_21(receiver));
    }
    __call1252_24(p0, __fieldRead1252_23(receiver));
    }
    return;
}
public static void h1252_0(java.io.IOException p0) throws Throwable {
    throw __call1125200_0(p0);
}
public static void h1252_1(java.io.IOException p0) throws Throwable {
    throw __call1125201_0(p0);
}
private static native long __fieldRead1252_0() throws Throwable;
private static native int[] __call1252_1() throws Throwable;
private static native int __fieldRead1252_2(moom.zH a0) throws Throwable;
private static native void __call1252_3(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_4(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_5(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_6(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_7(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_8(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_9(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_10(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_11(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_12(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_13(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_14(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_15(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_16(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_17(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_18(moom.zH a0) throws Throwable;
private static native int __fieldRead1252_19(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_20(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_21(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_22(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __fieldRead1252_23(moom.zH a0) throws Throwable;
private static native ByteBuf __call1252_24(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1125200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1125201_0(java.io.IOException a0) throws Throwable;

}


public int i() {
return this.i;
}


public int b() {
return this.b;
}


public void b(int p0) {
this.c = ((int)(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_2413d9a3abf5e7186804(this, p0); }


public void e(int p0) {
this.f = ((int)(p0));
    return;
}


public int e() {
return this.e;
}


public int c() {
return this.c;
}


public void c(int p0) {
this.d = ((int)(p0));
    return;
}


public int h() {
return this.h;
}


public void f(int p0) {
this.g = ((int)(p0));
    return;
}


public int f() {
return this.f;
}


public void d(int p0) {
this.e = ((int)(p0));
    return;
}


public int d() {
return this.d;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.zH)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_1cab7e3771e3f89c75f6(this, p0); }


public int a() {
return this.a;
}


public void a(int p0) {
this.b = ((int)(p0));
    return;
}


public int k() {
return this.k;
}


public void g(int p0) {
this.k = ((int)(p0));
    return;
}


public int g() {
return this.g;
}


public int j() {
return this.j;
}

}
