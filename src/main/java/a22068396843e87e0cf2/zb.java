package moom;

import io.netty.buffer.ByteBuf;


public class zb implements moom.yK<moom.y3> {

public static moom.DT a;

private moom.DT b;

private int c;

private net.minecraft.item.ItemStack d;

private net.minecraft.item.ItemStack e;

private float f;

private float g;

private float h;

private static long i;

private static long j;

public zb(moom.DT p0, int p1, net.minecraft.item.ItemStack p2, float p3, float p4, float p5) { super(); __sourceHandlerCall_02c94858f5fad6280677(this, p0, p1, p2, p3, p4, p5); }


public zb(net.minecraft.item.ItemStack p0) { this((moom.DT)null, 0, (net.minecraft.item.ItemStack)null, 0.0F, 0.0F, 0.0F); }

private static void __sourceConstructorBody_60118b6035dc6765(moom.zb receiver, net.minecraft.item.ItemStack p0) throws Throwable {
long local2_life1 = (moom.zb.i ^ 38343847665097L);
    moom.zb.__sourceConstructorInit_60118b6035dc6765_0(((moom.zb)(receiver)), ((moom.DT)(moom.zb.a)), ((int)(((int) moom.zb.j))), ((net.minecraft.item.ItemStack)(p0)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)), ((float)(0x0.0p0f)));
    return;
}


public zb() {
super();
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(6044536315843112128L)), ((long)(-8881351233828587064L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(179467353775209L)))));
    long local0_life6 = (moom.zb.i ^ 47058905304511L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill1145_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1145_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1145_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1145_13 = new byte[8];
    (__sourceSpill1145_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill1145_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation1145_15 = __sourceSpill1145_13;
    ((javax.crypto.Cipher)(__sourceSpill1145_10)).init(((int)(__sourceSpill1145_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1145_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1145_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 954009978937339219L;
    byte[] __sourceSpill1145_19 = new byte[8];
    (__sourceSpill1145_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill1145_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill1145_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill1145_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill1145_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill1145_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill1145_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill1145_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill1145_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill1145_20)).doFinal(((byte[])(__sourceSpill1145_19)));
    j = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    a = ((moom.DT)(new moom.DT(1, 1, 1)));
}

private static native <E extends Throwable> void __sourceConstructorInit_60118b6035dc6765_0(moom.zb a0, moom.DT a1, int a2, net.minecraft.item.ItemStack a3, float a4, float a5, float a6) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_02c94858f5fad6280677(moom.zb a0, moom.DT a1, int a2, net.minecraft.item.ItemStack a3, float a4, float a5, float a6) throws E;
private static final class __SourceHandler_02c94858f5fad6280677 {

public static void f519(moom.zb receiver, moom.DT p0, int p1, net.minecraft.item.ItemStack p2, float p3, float p4, float p5) throws Throwable {
    moom.zb forwardValue519_21_0;
    net.minecraft.item.ItemStack forwardValue519_21_1;
    moom.zb forwardValue519_22_0;
    moom.zb forwardValue519_23_0;
    net.minecraft.item.ItemStack forwardValue519_23_1;
    boolean spill519_0;
    moom.zb spill519_1;
    net.minecraft.item.ItemStack spill519_2;
    long life7_3;
    int life9_10;
    forward_join_23: {
    forward_join_22: {
    forward_join_21: {
    life7_3 = (__fieldRead519_0() ^ 48526559925277L);
    spill519_0 = __call519_1();
    __directSuperInit519_2(receiver);
    __fieldWrite519_3(receiver, p0);
    life9_10 = __integerCategory519_4(spill519_0);
    __fieldWrite519_5(receiver, p1);
    spill519_1 = receiver;
    spill519_2 = p2;
    if (!((life9_10 != 0))) {
        forwardValue519_21_0 = spill519_1;
        forwardValue519_21_1 = spill519_2;
        break forward_join_21;
    }
    if (!((spill519_2 != null))) {
        forwardValue519_22_0 = spill519_1;
        break forward_join_22;
    }
    forwardValue519_21_0 = spill519_1;
    forwardValue519_21_1 = __call519_6(p2);
    }
    forwardValue519_23_0 = forwardValue519_21_0;
    forwardValue519_23_1 = forwardValue519_21_1;
    break forward_join_23;
    }
    forwardValue519_23_0 = forwardValue519_22_0;
    forwardValue519_23_1 = null;
    }
    __fieldWrite519_7(forwardValue519_23_0, forwardValue519_23_1);
    __fieldWrite519_8(receiver, p2);
    __fieldWrite519_9(receiver, p3);
    __fieldWrite519_10(receiver, p4);
    __fieldWrite519_11(receiver, p5);
    return;
}
public static void h519_0(moom.Oo p0) throws Throwable {
    throw __call3051900_0(p0);
}
public static void h519_1(moom.Oo p0) throws Throwable {
    throw __call3051901_0(p0);
}
private static native long __fieldRead519_0() throws Throwable;
private static native boolean __call519_1() throws Throwable;
private static native void __directSuperInit519_2(moom.zb a0) throws Throwable;
private static native void __fieldWrite519_3(moom.zb a0, moom.DT a1) throws Throwable;
private static native int __integerCategory519_4(boolean value) throws Throwable;
private static native void __fieldWrite519_5(moom.zb a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call519_6(net.minecraft.item.ItemStack a0) throws Throwable;
private static native void __fieldWrite519_7(moom.zb a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite519_8(moom.zb a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native void __fieldWrite519_9(moom.zb a0, float a1) throws Throwable;
private static native void __fieldWrite519_10(moom.zb a0, float a1) throws Throwable;
private static native void __fieldWrite519_11(moom.zb a0, float a1) throws Throwable;
private static native java.lang.Exception __call3051900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3051901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_193c71c25c13905aba61(moom.zb a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_193c71c25c13905aba61 {

public static void f2128(moom.zb receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    long life2_3;
    int life4_42;
    life2_3 = (__fieldRead2128_0() ^ 46129140220103L);
    __call2128_2(p0, __fieldRead2128_1(receiver));
    __call2128_4(p0, __fieldRead2128_3(receiver));
    boolean spill2128_0 = __call2128_5();
    __call2128_7(p0, __fieldRead2128_6(receiver));
    __call2128_9(p0, ((int) (__fieldRead2128_8(receiver) * 0x1.0p4f)));
    __call2128_11(p0, ((int) (__fieldRead2128_10(receiver) * 0x1.0p4f)));
    __call2128_13(p0, ((int) (__fieldRead2128_12(receiver) * 0x1.0p4f)));
    life4_42 = __integerCategory2128_14(spill2128_0);
    if ((__call2128_15() != null)) {
        __call2128_16(((life4_42 != 0) ? 0 : 1));
    }
    return;
}
public static void h2128_0(java.io.IOException p0) throws Throwable {
    throw __call1212800_0(p0);
}
public static void h2128_1(java.io.IOException p0) throws Throwable {
    throw __call1212801_0(p0);
}
private static native long __fieldRead2128_0() throws Throwable;
private static native moom.DT __fieldRead2128_1(moom.zb a0) throws Throwable;
private static native void __call2128_2(net.minecraft.network.PacketBuffer a0, moom.DT a1) throws Throwable;
private static native int __fieldRead2128_3(moom.zb a0) throws Throwable;
private static native ByteBuf __call2128_4(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native boolean __call2128_5() throws Throwable;
private static native net.minecraft.item.ItemStack __fieldRead2128_6(moom.zb a0) throws Throwable;
private static native void __call2128_7(net.minecraft.network.PacketBuffer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native float __fieldRead2128_8(moom.zb a0) throws Throwable;
private static native ByteBuf __call2128_9(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native float __fieldRead2128_10(moom.zb a0) throws Throwable;
private static native ByteBuf __call2128_11(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native float __fieldRead2128_12(moom.zb a0) throws Throwable;
private static native ByteBuf __call2128_13(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __integerCategory2128_14(boolean value) throws Throwable;
private static native java.lang.String[] __call2128_15() throws Throwable;
private static native void __call2128_16(int a0) throws Throwable;
private static native java.lang.Exception __call1212800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1212801_0(java.io.IOException a0) throws Throwable;

}


public float b() {
return this.g;
}


public moom.DT b__DT() {
return this.b;
}


public int b__Int() {
return this.c;
}


public net.minecraft.item.ItemStack b__xW() {
return this.d;
}


public moom.zb b(net.minecraft.item.ItemStack p0) {
this.e = ((net.minecraft.item.ItemStack)(p0));
    return this;
}


public moom.zb b(float p0) {
this.g = ((float)(p0));
    return this;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_193c71c25c13905aba61(this, p0); }


public float e() {
return this.g;
}


public net.minecraft.item.ItemStack c__xW() {
return this.e;
}


public moom.zb c(float p0) {
this.h = ((float)(p0));
    return this;
}


public float c() {
return this.h;
}


public float f() {
return this.h;
}


public float d() {
return this.f;
}


public moom.zb a(float p0) {
this.f = ((float)(p0));
    return this;
}


public void a(moom.y3 p0) {
((moom.y3)(p0)).a(((moom.zb)(this)));
    return;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
this.b = ((moom.DT)(((net.minecraft.network.PacketBuffer)(p0)).a__DT()));
    this.c = ((int)(((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()));
    this.d = ((net.minecraft.item.ItemStack)(((net.minecraft.network.PacketBuffer)(p0)).a__xW()));
    this.f = ((float)((((float) ((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()) / 0x1.0p4f)));
    this.g = ((float)((((float) ((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()) / 0x1.0p4f)));
    this.h = ((float)((((float) ((net.minecraft.network.PacketBuffer)(p0)).readUnsignedByte()) / 0x1.0p4f)));
    return;
}


public moom.DT a__DT() {
return this.b;
}


public int a__Int() {
return this.c;
}


public net.minecraft.item.ItemStack a__xW() {
return this.d;
}


public float a() {
return this.f;
}


public moom.zb a(moom.DT p0) {
this.b = ((moom.DT)(p0));
    return this;
}


public moom.zb a(int p0) {
this.c = ((int)(p0));
    return this;
}


public moom.zb a(net.minecraft.item.ItemStack p0) {
this.d = ((net.minecraft.item.ItemStack)(p0));
    return this;
}

}
