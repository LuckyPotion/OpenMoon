package moom;

import io.netty.buffer.ByteBuf;


public class z9 implements moom.yK<moom.y2> {

private double a;

private double b;

private double c;

private float d;

private java.util.List<moom.DT> e;

private float f;

private float g;

private float h;

private static long i;

public z9() {
super();
}


public z9(double p0, double p1, double p2, float p3, java.util.List<moom.DT> p4, moom.DR p5) { super(); __sourceHandlerCall_d3bfbb1c315f22b2fa99(this, p0, p1, p2, p3, p4, p5); }


static {
moom.z9.i = (moom._c.a(1214402826279019148L, -7934621000602148800L, (java.lang.invoke.MethodHandles.lookup()).lookupClass())).a(67274942139492L);
}

private static native <E extends Throwable> void __sourceHandlerCall_d3bfbb1c315f22b2fa99(moom.z9 a0, double a1, double a2, double a3, float a4, java.util.List a5, moom.DR a6) throws E;
private static final class __SourceHandler_d3bfbb1c315f22b2fa99 {

public static void f516(moom.z9 receiver, double p0, double p1, double p2, float p3, java.util.List p4, moom.DR p5) throws Throwable {
    long life10_3;
    int[] life12_19;
    forward_join_43: {
    forward_join_38: {
    life10_3 = (__fieldRead516_0() ^ 95023369715277L);
    __directSuperInit516_1(receiver);
    int[] spill516_0 = __call516_2();
    __fieldWrite516_3(receiver, p0);
    __fieldWrite516_4(receiver, p1);
    __fieldWrite516_5(receiver, p2);
    __fieldWrite516_6(receiver, p3);
    life12_19 = spill516_0;
    __fieldWrite516_8(receiver, __call516_7(p4));
    if (!((life12_19 == null))) { break forward_join_38; }
    if (!((p5 != null))) { break forward_join_43; }
    __fieldWrite516_10(receiver, ((float) __fieldRead516_9(p5)));
    __fieldWrite516_12(receiver, ((float) __fieldRead516_11(p5)));
    }
    __fieldWrite516_14(receiver, ((float) __fieldRead516_13(p5)));
    }
    return;
}
public static void h516_0(moom.Oo p0) throws Throwable {
    throw __call3051600_0(p0);
}
public static void h516_1(moom.Oo p0) throws Throwable {
    throw __call3051601_0(p0);
}
private static native long __fieldRead516_0() throws Throwable;
private static native void __directSuperInit516_1(moom.z9 a0) throws Throwable;
private static native int[] __call516_2() throws Throwable;
private static native void __fieldWrite516_3(moom.z9 a0, double a1) throws Throwable;
private static native void __fieldWrite516_4(moom.z9 a0, double a1) throws Throwable;
private static native void __fieldWrite516_5(moom.z9 a0, double a1) throws Throwable;
private static native void __fieldWrite516_6(moom.z9 a0, float a1) throws Throwable;
private static native java.util.ArrayList __call516_7(java.util.List a0) throws Throwable;
private static native void __fieldWrite516_8(moom.z9 a0, java.util.ArrayList a1) throws Throwable;
private static native double __fieldRead516_9(moom.DR a0) throws Throwable;
private static native void __fieldWrite516_10(moom.z9 a0, float a1) throws Throwable;
private static native double __fieldRead516_11(moom.DR a0) throws Throwable;
private static native void __fieldWrite516_12(moom.z9 a0, float a1) throws Throwable;
private static native double __fieldRead516_13(moom.DR a0) throws Throwable;
private static native void __fieldWrite516_14(moom.z9 a0, float a1) throws Throwable;
private static native java.lang.Exception __call3051600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3051601_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_32d6b572fc52d33dba05(moom.z9 a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_32d6b572fc52d33dba05 {

public static void f1249(moom.z9 receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int[] spill1249_0;
    long life2_3;
    int life5_26;
    int[] life4_31;
    int life6_35;
    int life7_39;
    int life8_43;
    int life9_45;
    int life10_53;
    int life11_58;
    int life12_63;
    lexical_join_91: {
    lexical_join_79: {
    life2_3 = (__fieldRead1249_0() ^ 12095948680130L);
    __fieldWrite1249_2(receiver, ((double) __call1249_1(p0)));
    __fieldWrite1249_4(receiver, ((double) __call1249_3(p0)));
    __fieldWrite1249_6(receiver, ((double) __call1249_5(p0)));
    __fieldWrite1249_8(receiver, __call1249_7(p0));
    spill1249_0 = __call1249_9();
    life5_26 = __call1249_10(p0);
    __fieldWrite1249_12(receiver, __call1249_11(life5_26));
    life4_31 = spill1249_0;
    life6_35 = ((int) __fieldRead1249_13(receiver));
    life7_39 = ((int) __fieldRead1249_14(receiver));
    life8_43 = ((int) __fieldRead1249_15(receiver));
    life9_45 = 0;
    lexical_cycle_46: while (true) {
    if (!((life9_45 < life5_26))) {
        break lexical_join_79;
    }
    life10_53 = (__call1249_16(p0) + life6_35);
    life11_58 = (__call1249_17(p0) + life7_39);
    life12_63 = (__call1249_18(p0) + life8_43);
    __call1249_20(__fieldRead1249_19(receiver), new moom.DT(life10_53, life11_58, life12_63));
    life9_45 += 1;
    if (!((life4_31 == null))) {
        break lexical_join_91;
    }
    if (!((life4_31 != null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    __fieldWrite1249_22(receiver, __call1249_21(p0));
    __fieldWrite1249_24(receiver, __call1249_23(p0));
    __fieldWrite1249_26(receiver, __call1249_25(p0));
    }
    return;
}
public static void h1249_0(java.io.IOException p0) throws Throwable {
    throw __call1124900_0(p0);
}
private static native long __fieldRead1249_0() throws Throwable;
private static native float __call1249_1(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1249_2(moom.z9 a0, double a1) throws Throwable;
private static native float __call1249_3(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1249_4(moom.z9 a0, double a1) throws Throwable;
private static native float __call1249_5(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1249_6(moom.z9 a0, double a1) throws Throwable;
private static native float __call1249_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1249_8(moom.z9 a0, float a1) throws Throwable;
private static native int[] __call1249_9() throws Throwable;
private static native int __call1249_10(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.util.ArrayList __call1249_11(int a0) throws Throwable;
private static native void __fieldWrite1249_12(moom.z9 a0, java.util.ArrayList a1) throws Throwable;
private static native double __fieldRead1249_13(moom.z9 a0) throws Throwable;
private static native double __fieldRead1249_14(moom.z9 a0) throws Throwable;
private static native double __fieldRead1249_15(moom.z9 a0) throws Throwable;
private static native byte __call1249_16(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native byte __call1249_17(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native byte __call1249_18(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.util.List __fieldRead1249_19(moom.z9 a0) throws Throwable;
private static native boolean __call1249_20(java.util.List a0, moom.DT a1) throws Throwable;
private static native float __call1249_21(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1249_22(moom.z9 a0, float a1) throws Throwable;
private static native float __call1249_23(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1249_24(moom.z9 a0, float a1) throws Throwable;
private static native float __call1249_25(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1249_26(moom.z9 a0, float a1) throws Throwable;
private static native java.lang.Exception __call1124900_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_8d75d3d4d2852d9c73b2(moom.z9 a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_8d75d3d4d2852d9c73b2 {

public static void f1250(moom.z9 receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int[] spill1250_0;
    long life2_3;
    int life5_36;
    int life6_40;
    int life7_44;
    java.util.Iterator life8_49;
    int[] life4_50;
    moom.DT life9_57;
    int life10_62;
    int life11_67;
    int life12_72;
    lexical_join_104: {
    lexical_join_89: {
    life2_3 = (__fieldRead1250_0() ^ 138356950841419L);
    __call1250_2(p0, ((float) __fieldRead1250_1(receiver)));
    __call1250_4(p0, ((float) __fieldRead1250_3(receiver)));
    __call1250_6(p0, ((float) __fieldRead1250_5(receiver)));
    __call1250_8(p0, __fieldRead1250_7(receiver));
    __call1250_11(p0, __call1250_10(__fieldRead1250_9(receiver)));
    life5_36 = ((int) __fieldRead1250_12(receiver));
    life6_40 = ((int) __fieldRead1250_13(receiver));
    life7_44 = ((int) __fieldRead1250_14(receiver));
    spill1250_0 = __call1250_15();
    life8_49 = __call1250_17(__fieldRead1250_16(receiver));
    life4_50 = spill1250_0;
    lexical_cycle_51: while (true) {
    if (!(__call1250_18(life8_49))) {
        break lexical_join_89;
    }
    life9_57 = __cast1250_20(__call1250_19(life8_49));
    life10_62 = (__call1250_21(life9_57) - life5_36);
    life11_67 = (__call1250_22(life9_57) - life6_40);
    life12_72 = (__call1250_23(life9_57) - life7_44);
    __call1250_24(p0, life10_62);
    __call1250_25(p0, life11_67);
    __call1250_26(p0, life12_72);
    if (!((life4_50 == null))) {
        break lexical_join_104;
    }
    if (!((life4_50 != null))) { continue lexical_cycle_51; }
    break lexical_cycle_51;
    }
    }
    __call1250_28(p0, __fieldRead1250_27(receiver));
    __call1250_30(p0, __fieldRead1250_29(receiver));
    __call1250_32(p0, __fieldRead1250_31(receiver));
    }
    return;
}
public static void h1250_0(java.io.IOException p0) throws Throwable {
    throw __call1125000_0(p0);
}
private static native long __fieldRead1250_0() throws Throwable;
private static native double __fieldRead1250_1(moom.z9 a0) throws Throwable;
private static native ByteBuf __call1250_2(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native double __fieldRead1250_3(moom.z9 a0) throws Throwable;
private static native ByteBuf __call1250_4(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native double __fieldRead1250_5(moom.z9 a0) throws Throwable;
private static native ByteBuf __call1250_6(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native float __fieldRead1250_7(moom.z9 a0) throws Throwable;
private static native ByteBuf __call1250_8(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native java.util.List __fieldRead1250_9(moom.z9 a0) throws Throwable;
private static native int __call1250_10(java.util.List a0) throws Throwable;
private static native ByteBuf __call1250_11(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native double __fieldRead1250_12(moom.z9 a0) throws Throwable;
private static native double __fieldRead1250_13(moom.z9 a0) throws Throwable;
private static native double __fieldRead1250_14(moom.z9 a0) throws Throwable;
private static native int[] __call1250_15() throws Throwable;
private static native java.util.List __fieldRead1250_16(moom.z9 a0) throws Throwable;
private static native java.util.Iterator __call1250_17(java.util.List a0) throws Throwable;
private static native boolean __call1250_18(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1250_19(java.util.Iterator a0) throws Throwable;
private static native moom.DT __cast1250_20(java.lang.Object a0) throws Throwable;
private static native int __call1250_21(moom.DT a0) throws Throwable;
private static native int __call1250_22(moom.DT a0) throws Throwable;
private static native int __call1250_23(moom.DT a0) throws Throwable;
private static native ByteBuf __call1250_24(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native ByteBuf __call1250_25(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native ByteBuf __call1250_26(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native float __fieldRead1250_27(moom.z9 a0) throws Throwable;
private static native ByteBuf __call1250_28(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native float __fieldRead1250_29(moom.z9 a0) throws Throwable;
private static native ByteBuf __call1250_30(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native float __fieldRead1250_31(moom.z9 a0) throws Throwable;
private static native ByteBuf __call1250_32(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native java.lang.Exception __call1125000_0(java.io.IOException a0) throws Throwable;

}


public double b() {
return this.b;
}


public float b__Float() {
return this.g;
}


public void b(double p0) {
this.b = ((double)(p0));
    return;
}


public void b(float p0) {
this.f = ((float)(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_8d75d3d4d2852d9c73b2(this, p0); }


public void c(double p0) {
this.c = ((double)(p0));
    return;
}


public void c(float p0) {
this.g = ((float)(p0));
    return;
}


public double c() {
return this.c;
}


public float c__Float() {
return this.h;
}


public void d(float p0) {
this.h = ((float)(p0));
    return;
}


public float d() {
return this.d;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public java.util.List<moom.DT> a__List() {
return this.e;
}


public void a(double p0) {
this.a = ((double)(p0));
    return;
}


public float a__Float() {
return this.f;
}


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.z9)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_32d6b572fc52d33dba05(this, p0); }


public void a(float p0) {
this.d = ((float)(p0));
    return;
}


public void a(java.util.List<moom.DT> p0) {
this.e = ((java.util.List)(p0));
    return;
}


public double a() {
return this.a;
}

}
