package moom;


class Op extends java.lang.Thread {

net.minecraft.client.Minecraft a;

private static long b;

private static long c;

Op(net.minecraft.client.Minecraft p0, java.lang.String p1) { super((java.lang.String)null); }

private static void __sourceConstructorBody_4a0843789eaa50bf(moom.Op receiver, net.minecraft.client.Minecraft p0, java.lang.String p1) throws Throwable {
((moom.Op)(receiver)).a = ((net.minecraft.client.Minecraft)(p0));
    moom.Op.__sourceConstructorInit_4a0843789eaa50bf_0(((moom.Op)(receiver)), ((java.lang.String)(p1)));
    return;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-3019726078639197763L)), ((long)(5756235221309053204L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(193778242268882L)))));
    long local0_life6 = (moom.Op.b ^ 3297740337947L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill749_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill749_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill749_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill749_13 = new byte[8];
    (__sourceSpill749_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill749_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation749_15 = __sourceSpill749_13;
    ((javax.crypto.Cipher)(__sourceSpill749_10)).init(((int)(__sourceSpill749_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill749_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation749_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 1251856864409640382L;
    byte[] __sourceSpill749_19 = new byte[8];
    (__sourceSpill749_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill749_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill749_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill749_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill749_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill749_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill749_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill749_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill749_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill749_20)).doFinal(((byte[])(__sourceSpill749_19)));
    c = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
}

private static native <E extends Throwable> void __sourceConstructorInit_4a0843789eaa50bf_0(moom.Op a0, java.lang.String a1) throws E;
private static native <E extends Throwable> void __sourceHandlerCall_51d3f13a6ff15afa132e(moom.Op a0) throws E;
private static final class __SourceHandler_51d3f13a6ff15afa132e {

public static void f813(moom.Op receiver) throws Throwable {
    long life1_3;
    int[] life3_5;
    forest_join_13: {
    life1_3 = (__fieldRead813_0() ^ 80252230202433L);
    life3_5 = __call813_1();
    forest_cycle_6: while (true) {
    if (!(__fieldRead813_3(__fieldRead813_2(receiver)))) {
        break forest_join_13;
    }
    __call813_5(__fieldRead813_4());
    continue forest_cycle_6;
    }
    }
    return;
}
public static void h813_0(moom.Oo p0) throws Throwable {
    throw __call3081300_0(p0);
}
public static void h813_1(java.lang.InterruptedException p0, moom.Op p1, int[] p2) throws Throwable {
    java.lang.InterruptedException life3_2;
    forest_join_12: {
    forest_join_5: {
    life3_2 = p0;
    if (!((p2 == null))) {
        break forest_join_5;
    }
    break forest_join_12;
    }
    forest_cycle_5: while (true) {
    if (!(__fieldRead3081301_1(__fieldRead3081301_0(p1)))) {
        break forest_join_12;
    }
    __call3081301_3(__fieldRead3081301_2());
    continue forest_cycle_5;
    }
    }
    return;
}
private static native long __fieldRead813_0() throws Throwable;
private static native int[] __call813_1() throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead813_2(moom.Op a0) throws Throwable;
private static native boolean __fieldRead813_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __fieldRead813_4() throws Throwable;
private static native void __call813_5(long a0) throws Throwable;
private static native moom.Oo __call3081300_0(moom.Oo a0) throws Throwable;
private static native net.minecraft.client.Minecraft __fieldRead3081301_0(moom.Op a0) throws Throwable;
private static native boolean __fieldRead3081301_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native long __fieldRead3081301_2() throws Throwable;
private static native void __call3081301_3(long a0) throws Throwable;

}


public void run() { __sourceHandlerCall_51d3f13a6ff15afa132e(this); }


private static moom.Oo a(moom.Oo p0) {
return p0;
}

}
