package moom;

import io.netty.buffer.ByteBuf;


public class Ae implements moom.yK<moom.y2> {

private int a;

private java.lang.String b;

private net.minecraft.util.IChatComponent c;

private int d;

private int e;

private static long f;

private static long g;

public Ae(int p0, java.lang.String p1, net.minecraft.util.IChatComponent p2, int p3, int p4) {
this(p0, p1, p2, p3);
    this.e = p4;
}

private static native <E extends Throwable> void __sourceHandlerCall_5696d216df5f643ff66d(moom.Ae a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_5696d216df5f643ff66d {

public static void f57(moom.Ae receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    ByteBuf forwardValue57_36_0;
    int[] spill57_0;
    ByteBuf spill57_1;
    long life2_3;
    int[] life4_19;
    forward_join_37: {
    forward_join_36: {
    life2_3 = (__fieldRead57_0() ^ 23416941482718L);
    spill57_0 = __call57_1();
    __call57_3(p0, __fieldRead57_2(receiver));
    __call57_5(p0, __fieldRead57_4(receiver));
    __call57_7(p0, __fieldRead57_6(receiver));
    life4_19 = spill57_0;
    spill57_1 = __call57_9(p0, __fieldRead57_8(receiver));
    if (!((life4_19 == null))) {
        forwardValue57_36_0 = spill57_1;
        break forward_join_36;
    }
    __discardScalar57_10(spill57_1);
    if (!(__call57_12(__fieldRead57_11(receiver), "EntityHorse"))) {
        break forward_join_37;
    }
    forwardValue57_36_0 = __call57_14(p0, __fieldRead57_13(receiver));
    }
    __discardScalar57_15(forwardValue57_36_0);
    }
    return;
}
public static void h57_0(java.io.IOException p0) throws Throwable {
    throw __call1005700_0(p0);
}
public static void h57_1(java.io.IOException p0) throws Throwable {
    throw __call1005701_0(p0);
}
private static native long __fieldRead57_0() throws Throwable;
private static native int[] __call57_1() throws Throwable;
private static native int __fieldRead57_2(moom.Ae a0) throws Throwable;
private static native ByteBuf __call57_3(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.String __fieldRead57_4(moom.Ae a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call57_5(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __fieldRead57_6(moom.Ae a0) throws Throwable;
private static native void __call57_7(net.minecraft.network.PacketBuffer a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native int __fieldRead57_8(moom.Ae a0) throws Throwable;
private static native ByteBuf __call57_9(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __discardScalar57_10(ByteBuf a0) throws Throwable;
private static native java.lang.String __fieldRead57_11(moom.Ae a0) throws Throwable;
private static native boolean __call57_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __fieldRead57_13(moom.Ae a0) throws Throwable;
private static native ByteBuf __call57_14(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __discardScalar57_15(ByteBuf a0) throws Throwable;
private static native java.lang.Exception __call1005700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1005701_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1f99dc86d4009a14d828(moom.Ae a0) throws E;
private static final class __SourceHandler_1f99dc86d4009a14d828 {

public static boolean f577(moom.Ae receiver) throws Throwable {
    int forwardValue577_12_0;
    int forwardValue577_14_0;
    int spill577_0;
    long life1_3;
    int[] life3_5;
    forward_join_14: {
    forward_join_13: {
    forward_join_12: {
    life1_3 = (__fieldRead577_0() ^ 8509978006398L);
    life3_5 = __call577_1();
    spill577_0 = __fieldRead577_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue577_12_0 = spill577_0;
        break forward_join_12;
    }
    if (!((spill577_0 > 0))) {
        break forward_join_13;
    }
    forwardValue577_12_0 = 1;
    }
    forwardValue577_14_0 = forwardValue577_12_0;
    break forward_join_14;
    }
    forwardValue577_14_0 = 0;
    }
    return __integerCategory577_3(forwardValue577_14_0);
}
public static void h577_0(moom.Oo p0) throws Throwable {
    throw __call1057700_0(p0);
}
private static native long __fieldRead577_0() throws Throwable;
private static native int[] __call577_1() throws Throwable;
private static native int __fieldRead577_2(moom.Ae a0) throws Throwable;
private static native boolean __integerCategory577_3(int value) throws Throwable;
private static native java.lang.Exception __call1057700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ba06ed6902feb5ab47ea(moom.Ae a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_ba06ed6902feb5ab47ea {

public static void f576(moom.Ae receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    moom.Ae forwardValue576_32_0;
    int[] spill576_0;
    moom.Ae spill576_1;
    long life2_3;
    int[] life4_9;
    forward_join_35: {
    forward_join_32: {
    life2_3 = (__fieldRead576_0() ^ 109512475001175L);
    spill576_0 = __call576_1();
    __fieldWrite576_3(receiver, __call576_2(p0));
    life4_9 = spill576_0;
    __fieldWrite576_6(receiver, __call576_5(p0, ((int) __fieldRead576_4())));
    __fieldWrite576_8(receiver, __call576_7(p0));
    __fieldWrite576_10(receiver, __call576_9(p0));
    spill576_1 = receiver;
    if (!((life4_9 == null))) {
        forwardValue576_32_0 = spill576_1;
        break forward_join_32;
    }
    if (!(__call576_12(__fieldRead576_11(spill576_1), "EntityHorse"))) {
        break forward_join_35;
    }
    forwardValue576_32_0 = receiver;
    }
    __fieldWrite576_14(forwardValue576_32_0, __call576_13(p0));
    }
    return;
}
public static void h576_0(java.io.IOException p0) throws Throwable {
    throw __call1057600_0(p0);
}
public static void h576_1(java.io.IOException p0) throws Throwable {
    throw __call1057601_0(p0);
}
private static native long __fieldRead576_0() throws Throwable;
private static native int[] __call576_1() throws Throwable;
private static native short __call576_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite576_3(moom.Ae a0, short a1) throws Throwable;
private static native long __fieldRead576_4() throws Throwable;
private static native java.lang.String __call576_5(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite576_6(moom.Ae a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.util.IChatComponent __call576_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite576_8(moom.Ae a0, net.minecraft.util.IChatComponent a1) throws Throwable;
private static native short __call576_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite576_10(moom.Ae a0, short a1) throws Throwable;
private static native java.lang.String __fieldRead576_11(moom.Ae a0) throws Throwable;
private static native boolean __call576_12(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call576_13(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite576_14(moom.Ae a0, int a1) throws Throwable;
private static native java.lang.Exception __call1057600_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1057601_0(java.io.IOException a0) throws Throwable;

}


public Ae(int p0, java.lang.String p1, net.minecraft.util.IChatComponent p2, int p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


public Ae(int p0, java.lang.String p1, net.minecraft.util.IChatComponent p2) {
this(p0, p1, p2, 0);
}


public Ae() {
super();
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-8735680302506181679L)), ((long)(-6847374539491926988L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(248479920130049L)))));
    long local0_life6 = (moom.Ae.f ^ 135196282528121L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill476_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill476_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill476_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill476_13 = new byte[8];
    (__sourceSpill476_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill476_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation476_15 = __sourceSpill476_13;
    ((javax.crypto.Cipher)(__sourceSpill476_10)).init(((int)(__sourceSpill476_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill476_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation476_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = -8541317660002433923L;
    byte[] __sourceSpill476_19 = new byte[8];
    (__sourceSpill476_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill476_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill476_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill476_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill476_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill476_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill476_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill476_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill476_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill476_20)).doFinal(((byte[])(__sourceSpill476_19)));
    g = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}


public int b() {
return this.d;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_5696d216df5f643ff66d(this, p0); }


public int c() {
return this.e;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public boolean a__Boolean() { return __sourceHandlerCall_1f99dc86d4009a14d828(this); }


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.Ae)(this)));
    return;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_ba06ed6902feb5ab47ea(this, p0); }


public int a() {
return this.a;
}


public java.lang.String a__String() {
return this.b;
}


public net.minecraft.util.IChatComponent a__C5() {
return this.c;
}

}
