package moom;


public class yT implements moom.yK<moom.yS> {

private int a;

private java.lang.String b;

private int c;

private net.minecraft.network.EnumConnectionState d;

private static boolean e;

private static long f;

private static long g;

public yT() {
super();
}


public yT(int p0, java.lang.String p1, int p2, net.minecraft.network.EnumConnectionState p3) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-1858271660423387756L)), ((long)(4098791920841657588L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(8291338856581L)))));
    int __sourceSpill1123_6 = 0;
    long local0_life7 = (moom.yT.f ^ 10238483483997L);
    moom.yT.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1123_6))));
    javax.crypto.Cipher local2_life10;
    javax.crypto.Cipher __sourceSpill1123_12 = (local2_life10 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1123_13 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1123_14 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1123_15 = new byte[8];
    (__sourceSpill1123_15)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life16 = 1;
    while ((local3_life16 < 8)) {
        (__sourceSpill1123_15)[local3_life16] = ((byte) ((int) ((local0_life7 << (local3_life16 * 8)) >>> 56)));
        local3_life16 += 1;
    }
    byte[] __sourcePreallocation1123_17 = __sourceSpill1123_15;
    ((javax.crypto.Cipher)(__sourceSpill1123_12)).init(((int)(__sourceSpill1123_13)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1123_14)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1123_17)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life20 = -6495692453183622804L;
    byte[] __sourceSpill1123_21 = new byte[8];
    (__sourceSpill1123_21)[0] = ((byte) ((int) (local4_life20 >>> 56)));
    (__sourceSpill1123_21)[1] = ((byte) ((int) (local4_life20 >>> 48)));
    (__sourceSpill1123_21)[2] = ((byte) ((int) (local4_life20 >>> 40)));
    (__sourceSpill1123_21)[3] = ((byte) ((int) (local4_life20 >>> 32)));
    (__sourceSpill1123_21)[4] = ((byte) ((int) (local4_life20 >>> 24)));
    (__sourceSpill1123_21)[5] = ((byte) ((int) (local4_life20 >>> 16)));
    (__sourceSpill1123_21)[6] = ((byte) ((int) (local4_life20 >>> 8)));
    (__sourceSpill1123_21)[7] = ((byte) ((int) local4_life20));
    javax.crypto.Cipher __sourceSpill1123_22 = local2_life10;
    byte[] local6_life24 = ((javax.crypto.Cipher)(__sourceSpill1123_22)).doFinal(((byte[])(__sourceSpill1123_21)));
    g = ((long)((((((((((((long) (local6_life24)[0]) & 255L) << 56) | ((((long) (local6_life24)[1]) & 255L) << 48)) | ((((long) (local6_life24)[2]) & 255L) << 40)) | ((((long) (local6_life24)[3]) & 255L) << 32)) | ((((long) (local6_life24)[4]) & 255L) << 24)) | ((((long) (local6_life24)[5]) & 255L) << 16)) | ((((long) (local6_life24)[6]) & 255L) << 8)) | (((long) (local6_life24)[7]) & 255L))));
}


public static boolean b() {
return ((((moom.yT.e) ? 1 : 0)) != 0);
}


public static void b(boolean p0) {
e = ((boolean)(p0));
    return;
}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException {
long life2_3;
    int life4_24;
    life2_3 = (moom.yT.f ^ 13986495674160L);
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(this.a)));
    boolean spill2145_0 = moom.yT.b();
    ((net.minecraft.network.PacketBuffer)(p0)).a(((java.lang.String)(this.b)));
    ((net.minecraft.network.PacketBuffer)(p0)).writeShort(((int)(this.c)));
    ((net.minecraft.network.PacketBuffer)(p0)).a__Void(((int)(((net.minecraft.network.EnumConnectionState)(this.d)).a())));
    life4_24 = ((spill2145_0) ? 1 : 0);
    try {
        if ((life4_24 != 0)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    } catch (java.io.IOException caught_rethrow_0) {
        throw moom.yT.a(((java.lang.Exception)(caught_rethrow_0)));
    }
    return;
}

private static native <E extends Throwable> boolean __sourceHandlerCall_cceb270bdf64572c1a32() throws E;
private static final class __SourceHandler_cceb270bdf64572c1a32 {

public static boolean f2106() throws Throwable {
    int life0_1;
    life0_1 = __integerCategory2106_1(__call2106_0());
    if ((life0_1 == 0)) {
        return true;
    }
    return false;
}
public static void h2106_0(moom.Oo p0) throws Throwable {
    throw __call1210600_0(p0);
}
private static native boolean __call2106_0() throws Throwable;
private static native int __integerCategory2106_1(boolean value) throws Throwable;
private static native java.lang.Exception __call1210600_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_38badc16f2627adc7f15(moom.yT a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_38badc16f2627adc7f15 {

public static void f2105(moom.yT receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    long life2_3;
    int life4_24;
    life2_3 = (__fieldRead2105_0() ^ 134610957264057L);
    __fieldWrite2105_2(receiver, __call2105_1(p0));
    __fieldWrite2105_5(receiver, __call2105_4(p0, ((int) __fieldRead2105_3())));
    __fieldWrite2105_7(receiver, __call2105_6(p0));
    boolean spill2105_0 = __call2105_8();
    __fieldWrite2105_11(receiver, __call2105_10(__call2105_9(p0)));
    life4_24 = __integerCategory2105_12(spill2105_0);
    if ((__call2105_13() != null)) {
        __call2105_14(((life4_24 != 0) ? 0 : 1));
    }
    return;
}
public static void h2105_0(java.io.IOException p0) throws Throwable {
    throw __call1210500_0(p0);
}
public static void h2105_1(java.io.IOException p0) throws Throwable {
    throw __call1210501_0(p0);
}
private static native long __fieldRead2105_0() throws Throwable;
private static native int __call2105_1(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite2105_2(moom.yT a0, int a1) throws Throwable;
private static native long __fieldRead2105_3() throws Throwable;
private static native java.lang.String __call2105_4(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native void __fieldWrite2105_5(moom.yT a0, java.lang.String a1) throws Throwable;
private static native int __call2105_6(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite2105_7(moom.yT a0, int a1) throws Throwable;
private static native boolean __call2105_8() throws Throwable;
private static native int __call2105_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native net.minecraft.network.EnumConnectionState __call2105_10(int a0) throws Throwable;
private static native void __fieldWrite2105_11(moom.yT a0, net.minecraft.network.EnumConnectionState a1) throws Throwable;
private static native int __integerCategory2105_12(boolean value) throws Throwable;
private static native java.lang.String[] __call2105_13() throws Throwable;
private static native void __call2105_14(int a0) throws Throwable;
private static native java.lang.Exception __call1210500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1210501_0(java.io.IOException a0) throws Throwable;

}


public static boolean c() { return __sourceHandlerCall_cceb270bdf64572c1a32(); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_38badc16f2627adc7f15(this, p0); }


public void a(moom.yS p0) {
((moom.yS)(p0)).a(((moom.yT)(this)));
    return;
}


public net.minecraft.network.EnumConnectionState a__a7() {
return this.d;
}


public int a() {
return this.a;
}


private static native boolean __sourceIntrinsic_integerToBoolean(int value);
}
