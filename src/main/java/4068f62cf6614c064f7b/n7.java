package moom;


public class n7 extends moom.n6 {

private static org.apache.logging.log4j.Logger l;

private static java.util.concurrent.atomic.AtomicInteger m;

private java.io.File n;

private java.lang.String o;

private moom.lh p;

private java.awt.image.BufferedImage q;

private java.lang.Thread r;

private boolean s;

public java.lang.Boolean t;

public boolean u;

private static long v;

private static long w;

public n7(java.io.File p0, java.lang.String p1, moom.DD p2, moom.lh p3) {
super(p2);
    this.t = null;
    this.u = false;
    this.n = p0;
    this.o = p1;
    this.p = p3;
}


static {
v = ((long)(((moom._a)(moom._c.a(((long)(-2958782552589174964L)), ((long)(-4157632100834742375L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(134586328278087L)))));
    long local0_life6 = (moom.n7.v ^ 65179682804996L);
    javax.crypto.Cipher local2_life8;
    javax.crypto.Cipher __sourceSpill937_10 = (local2_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill937_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill937_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill937_13 = new byte[8];
    (__sourceSpill937_13)[0] = ((byte) ((int) (local0_life6 >>> 56)));
    int local3_life14 = 1;
    while ((local3_life14 < 8)) {
        (__sourceSpill937_13)[local3_life14] = ((byte) ((int) ((local0_life6 << (local3_life14 * 8)) >>> 56)));
        local3_life14 += 1;
    }
    byte[] __sourcePreallocation937_15 = __sourceSpill937_13;
    ((javax.crypto.Cipher)(__sourceSpill937_10)).init(((int)(__sourceSpill937_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill937_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation937_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local4_life18 = 3434389950057815697L;
    byte[] __sourceSpill937_19 = new byte[8];
    (__sourceSpill937_19)[0] = ((byte) ((int) (local4_life18 >>> 56)));
    (__sourceSpill937_19)[1] = ((byte) ((int) (local4_life18 >>> 48)));
    (__sourceSpill937_19)[2] = ((byte) ((int) (local4_life18 >>> 40)));
    (__sourceSpill937_19)[3] = ((byte) ((int) (local4_life18 >>> 32)));
    (__sourceSpill937_19)[4] = ((byte) ((int) (local4_life18 >>> 24)));
    (__sourceSpill937_19)[5] = ((byte) ((int) (local4_life18 >>> 16)));
    (__sourceSpill937_19)[6] = ((byte) ((int) (local4_life18 >>> 8)));
    (__sourceSpill937_19)[7] = ((byte) ((int) local4_life18));
    javax.crypto.Cipher __sourceSpill937_20 = local2_life8;
    byte[] local6_life22 = ((javax.crypto.Cipher)(__sourceSpill937_20)).doFinal(((byte[])(__sourceSpill937_19)));
    w = ((long)((((((((((((long) (local6_life22)[0]) & 255L) << 56) | ((((long) (local6_life22)[1]) & 255L) << 48)) | ((((long) (local6_life22)[2]) & 255L) << 40)) | ((((long) (local6_life22)[3]) & 255L) << 32)) | ((((long) (local6_life22)[4]) & 255L) << 24)) | ((((long) (local6_life22)[5]) & 255L) << 16)) | ((((long) (local6_life22)[6]) & 255L) << 8)) | (((long) (local6_life22)[7]) & 255L))));
    l = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    m = ((java.util.concurrent.atomic.AtomicInteger)(new java.util.concurrent.atomic.AtomicInteger(0)));
}

private static native <E extends Throwable> void __sourceHandlerCall_f087c53a830f7be91d25(moom.n7 a0, java.awt.image.BufferedImage a1) throws E;
private static final class __SourceHandler_f087c53a830f7be91d25 {

public static void f1861(moom.n7 receiver, java.awt.image.BufferedImage p0) throws Throwable {
    __fieldWrite1861_0(receiver, p0);
    if ((__fieldRead1861_1(receiver) != null)) {
        __call1861_3(__fieldRead1861_2(receiver));
    }
    moom.n7 spill1861_0 = receiver;
    __fieldWrite1861_6(spill1861_0, __call1861_5(((__fieldRead1861_4(receiver) != null) ? 1 : 0)));
    return;
}
public static void h1861_0(moom.Oo p0) throws Throwable {
    throw __call1186100_0(p0);
}
public static void h1861_1(moom.Oo p0) throws Throwable {
    throw __call1186101_0(p0);
}
private static native void __fieldWrite1861_0(moom.n7 a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native moom.lh __fieldRead1861_1(moom.n7 a0) throws Throwable;
private static native moom.lh __fieldRead1861_2(moom.n7 a0) throws Throwable;
private static native void __call1861_3(moom.lh a0) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead1861_4(moom.n7 a0) throws Throwable;
private static native java.lang.Boolean __call1861_5(int a0) throws Throwable;
private static native void __fieldWrite1861_6(moom.n7 a0, java.lang.Boolean a1) throws Throwable;
private static native java.lang.Exception __call1186100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1186101_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_7644959f7ba56c1aaafb(moom.n7 a0, moom.oR a1) throws E;
private static final class __SourceHandler_7644959f7ba56c1aaafb {

public static void f467(moom.n7 receiver, moom.oR p0) throws Throwable {
    forward_join_49: {
    forward_join_47: {
    forward_join_44: {
    forward_join_9: {
    if (!((__fieldRead467_0(receiver) == null))) { break forward_join_9; }
    if (!((__fieldRead467_1(receiver) != null))) { break forward_join_9; }
    __call467_2(receiver, p0);
    }
    if (!((__fieldRead467_3(receiver) == null))) { break forward_join_49; }
    if (!((__fieldRead467_4(receiver) != null))) { break forward_join_47; }
    if (!(__call467_6(__fieldRead467_5(receiver)))) { break forward_join_47; }
    org.apache.logging.log4j.Logger spill467_0 = __fieldRead467_7();
    java.lang.String spill467_1 = "Loading http texture from local cache ({})";
    java.lang.Object[] __stackOp467_8_0 = new java.lang.Object[1];
    java.lang.Object[] spill467_2 = __stackOp467_8_0;
    (__stackOp467_8_0)[0] = __fieldRead467_9(receiver);
    __call467_10(spill467_0, spill467_1, spill467_2);
    __fieldWrite467_13(receiver, __call467_12(__fieldRead467_11(receiver)));
    if (!((__fieldRead467_14(receiver) != null))) { break forward_join_44; }
    __call467_18(receiver, __call467_17(__fieldRead467_15(receiver), __fieldRead467_16(receiver)));
    }
    __call467_19(receiver);
    break forward_join_49;
    }
    __call467_20(receiver);
    }
    return;
}
public static void h467_0(java.io.IOException p0) throws Throwable {
    throw __call3046700_0(p0);
}
public static void h467_1(java.io.IOException p0) throws Throwable {
    throw __call3046701_0(p0);
}
public static void h467_2(java.io.IOException p0) throws Throwable {
    throw __call3046702_0(p0);
}
public static void h467_3(java.io.IOException p0) throws Throwable {
    throw __call3046703_0(p0);
}
public static void h467_4(java.io.IOException p0, moom.n7 p1) throws Throwable {
    java.io.IOException life2_2;
    life2_2 = p0;
    __call3046704_3(__fieldRead3046704_0(), __invokedynamic3046704_2(__fieldRead3046704_1(p1)), life2_2);
    __call3046704_4(p1);
    return;
}
private static native java.awt.image.BufferedImage __fieldRead467_0(moom.n7 a0) throws Throwable;
private static native moom.DD __fieldRead467_1(moom.n7 a0) throws Throwable;
private static native void __call467_2(moom.n7 a0, moom.oR a1) throws Throwable;
private static native java.lang.Thread __fieldRead467_3(moom.n7 a0) throws Throwable;
private static native java.io.File __fieldRead467_4(moom.n7 a0) throws Throwable;
private static native java.io.File __fieldRead467_5(moom.n7 a0) throws Throwable;
private static native boolean __call467_6(java.io.File a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead467_7() throws Throwable;
private static native java.io.File __fieldRead467_9(moom.n7 a0) throws Throwable;
private static native void __call467_10(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native java.io.File __fieldRead467_11(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __call467_12(java.io.File a0) throws Throwable;
private static native void __fieldWrite467_13(moom.n7 a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native moom.lh __fieldRead467_14(moom.n7 a0) throws Throwable;
private static native moom.lh __fieldRead467_15(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead467_16(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __call467_17(moom.lh a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native void __call467_18(moom.n7 a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native void __call467_19(moom.n7 a0) throws Throwable;
private static native void __call467_20(moom.n7 a0) throws Throwable;
private static native java.lang.Exception __call3046700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3046701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3046702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3046703_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3046704_0() throws Throwable;
private static native java.io.File __fieldRead3046704_1(moom.n7 a0) throws Throwable;
private static native java.lang.String __invokedynamic3046704_2(java.io.File a0) throws Throwable;
private static native void __call3046704_3(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native void __call3046704_4(moom.n7 a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_761bf23d15a39b6b4811(moom.n7 a0) throws E;
private static final class __SourceHandler_761bf23d15a39b6b4811 {

public static boolean f1080(moom.n7 receiver) throws Throwable {
    int forwardValue1080_24_0;
    java.net.Proxy life1_9;
    forward_join_24: {
    forward_join_23: {
    forward_join_16: {
    forward_join_5: {
    if (!((!__fieldRead1080_0(receiver)))) {
        break forward_join_5;
    }
    return __integerCategory1080_1(0);
    }
    life1_9 = __call1080_3(__call1080_2());
    if (!((__call1080_4(life1_9) != __fieldRead1080_5()))) {
        break forward_join_16;
    }
    if (!((__call1080_6(life1_9) == __fieldRead1080_7()))) {
        break forward_join_23;
    }
    }
    if (!(__call1080_9(__fieldRead1080_8(receiver), "http://"))) {
        break forward_join_23;
    }
    forwardValue1080_24_0 = 1;
    break forward_join_24;
    }
    forwardValue1080_24_0 = 0;
    }
    return __integerCategory1080_10(forwardValue1080_24_0);
}
public static void h1080_0(moom.Oo p0) throws Throwable {
    throw __call1108000_0(p0);
}
public static void h1080_1(moom.Oo p0) throws Throwable {
    throw __call1108001_0(p0);
}
public static void h1080_2(moom.Oo p0) throws Throwable {
    throw __call1108002_0(p0);
}
public static void h1080_3(moom.Oo p0) throws Throwable {
    throw __call1108003_0(p0);
}
private static native boolean __fieldRead1080_0(moom.n7 a0) throws Throwable;
private static native boolean __integerCategory1080_1(int value) throws Throwable;
private static native net.minecraft.client.Minecraft __call1080_2() throws Throwable;
private static native java.net.Proxy __call1080_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native java.net.Proxy.Type __call1080_4(java.net.Proxy a0) throws Throwable;
private static native java.net.Proxy.Type __fieldRead1080_5() throws Throwable;
private static native java.net.Proxy.Type __call1080_6(java.net.Proxy a0) throws Throwable;
private static native java.net.Proxy.Type __fieldRead1080_7() throws Throwable;
private static native java.lang.String __fieldRead1080_8(moom.n7 a0) throws Throwable;
private static native boolean __call1080_9(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory1080_10(int value) throws Throwable;
private static native java.lang.Exception __call1108000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1108001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1108002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1108003_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0baad2f3246b6184cab0(moom.n7 a0) throws E;
private static final class __SourceHandler_0baad2f3246b6184cab0 {

public static void f1864(moom.n7 receiver) throws Throwable {
    if ((!__fieldRead1864_0(receiver))) {
        if ((__fieldRead1864_1(receiver) != null)) {
        __fieldWrite1864_2(receiver, 1);
        if ((__fieldRead1864_3(receiver) != null)) {
        __call1864_4(receiver);
    }
        if (__call1864_5()) {
        __call1864_11(__call1864_6(receiver), __fieldRead1864_7(receiver), 0, 0, __call1864_8(), __fieldRead1864_9(receiver), __call1864_10(receiver));
    } else {
        __call1864_14(__call1864_12(receiver), __fieldRead1864_13(receiver));
    }
    }
    }
    return;
}
public static void h1864_0(moom.Oo p0) throws Throwable {
    throw __call1186400_0(p0);
}
public static void h1864_1(moom.Oo p0) throws Throwable {
    throw __call1186401_0(p0);
}
public static void h1864_2(moom.Oo p0) throws Throwable {
    throw __call1186402_0(p0);
}
public static void h1864_3(moom.Oo p0) throws Throwable {
    throw __call1186403_0(p0);
}
private static native boolean __fieldRead1864_0(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead1864_1(moom.n7 a0) throws Throwable;
private static native void __fieldWrite1864_2(moom.n7 a0, int a1) throws Throwable;
private static native moom.DD __fieldRead1864_3(moom.n7 a0) throws Throwable;
private static native void __call1864_4(moom.n7 a0) throws Throwable;
private static native boolean __call1864_5() throws Throwable;
private static native int __call1864_6(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead1864_7(moom.n7 a0) throws Throwable;
private static native moom.oR __call1864_8() throws Throwable;
private static native moom.DD __fieldRead1864_9(moom.n7 a0) throws Throwable;
private static native moom.MA __call1864_10(moom.n7 a0) throws Throwable;
private static native int __call1864_11(int a0, java.awt.image.BufferedImage a1, int a2, int a3, moom.oR a4, moom.DD a5, moom.MA a6) throws Throwable;
private static native int __call1864_12(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __fieldRead1864_13(moom.n7 a0) throws Throwable;
private static native int __call1864_14(int a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native java.lang.Exception __call1186400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1186401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1186402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1186403_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3deca0836060ec235bf5(moom.n7 a0) throws E;
private static final class __SourceHandler_3deca0836060ec235bf5 {

public static void f468(moom.n7 receiver) throws Throwable {
    long life1_3;
    moom.LS life3_9;
    moom.LT life4_12;
    byte[] life5_25;
    java.io.ByteArrayInputStream life6_30;
    java.awt.image.BufferedImage life7_41;
    forest_join_54: {
    forest_join_46: {
    forest_join_43: {
    forest_join_23: {
    life1_3 = (__fieldRead468_0() ^ 64854828774648L);
    life3_9 = __call468_4(__fieldRead468_1(receiver), __call468_3(__call468_2()));
    life4_12 = __call468_5(life3_9);
    if (!(((__call468_6(life4_12) / ((int) __fieldRead468_7())) != 2))) {
        break forest_join_23;
    }
    __call468_8(receiver);
    return;
    }
    life5_25 = __call468_9(life4_12);
    life6_30 = new java.io.ByteArrayInputStream(life5_25);
    if (!((__fieldRead468_10(receiver) != null))) {
        break forest_join_43;
    }
    __call468_12(life6_30, __fieldRead468_11(receiver));
    life7_41 = __call468_14(__fieldRead468_13(receiver));
    break forest_join_46;
    }
    life7_41 = __call468_15(life6_30);
    }
    if (!((__fieldRead468_16(receiver) != null))) {
        break forest_join_54;
    }
    life7_41 = __call468_18(__fieldRead468_17(receiver), life7_41);
    }
    __call468_19(receiver, life7_41);
    __call468_20(receiver);
    return;
}
public static void h468_0(java.lang.Exception p0, moom.n7 p1, moom.LS p2) throws Throwable {
    java.lang.Exception life2_2;
    life2_2 = p0;
    __call3046800_5(__fieldRead3046800_0(), __invokedynamic3046800_4(__call3046800_2(__call3046800_1(life2_2)), __call3046800_3(life2_2)));
    __call3046800_6(p1);
    return;
}
public static void h468_1(java.lang.Throwable p0, moom.n7 p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3046801_0(p1);
    throw life2_2;
}
private static native long __fieldRead468_0() throws Throwable;
private static native java.lang.String __fieldRead468_1(moom.n7 a0) throws Throwable;
private static native net.minecraft.client.Minecraft __call468_2() throws Throwable;
private static native java.net.Proxy __call468_3(net.minecraft.client.Minecraft a0) throws Throwable;
private static native moom.LS __call468_4(java.lang.String a0, java.net.Proxy a1) throws Throwable;
private static native moom.LT __call468_5(moom.LS a0) throws Throwable;
private static native int __call468_6(moom.LT a0) throws Throwable;
private static native long __fieldRead468_7() throws Throwable;
private static native void __call468_8(moom.n7 a0) throws Throwable;
private static native byte[] __call468_9(moom.LT a0) throws Throwable;
private static native java.io.File __fieldRead468_10(moom.n7 a0) throws Throwable;
private static native java.io.File __fieldRead468_11(moom.n7 a0) throws Throwable;
private static native void __call468_12(java.io.ByteArrayInputStream a0, java.io.File a1) throws Throwable;
private static native java.io.File __fieldRead468_13(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __call468_14(java.io.File a0) throws Throwable;
private static native java.awt.image.BufferedImage __call468_15(java.io.ByteArrayInputStream a0) throws Throwable;
private static native moom.lh __fieldRead468_16(moom.n7 a0) throws Throwable;
private static native moom.lh __fieldRead468_17(moom.n7 a0) throws Throwable;
private static native java.awt.image.BufferedImage __call468_18(moom.lh a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native void __call468_19(moom.n7 a0, java.awt.image.BufferedImage a1) throws Throwable;
private static native void __call468_20(moom.n7 a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3046800_0() throws Throwable;
private static native java.lang.Class __call3046800_1(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __call3046800_2(java.lang.Class a0) throws Throwable;
private static native java.lang.String __call3046800_3(java.lang.Exception a0) throws Throwable;
private static native java.lang.String __invokedynamic3046800_4(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native void __call3046800_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call3046800_6(moom.n7 a0) throws Throwable;
private static native void __call3046801_0(moom.n7 a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4d4c05c730384c063f22(moom.n7 a0) throws E;
private static final class __SourceHandler_4d4c05c730384c063f22 {

public static void f1866(moom.n7 receiver) throws Throwable {
    moom.lh life2_13;
    moom.lj life1_19;
    moom.n7 spill1866_0 = receiver;
    __fieldWrite1866_2(spill1866_0, __call1866_1(((__fieldRead1866_0(receiver) != null) ? 1 : 0)));
    life2_13 = __fieldRead1866_3(receiver);
    if ((__instanceOf1866_4(life2_13) != 0)) {
        life1_19 = __cast1866_5(life2_13);
        __call1866_6(life1_19);
    }
    return;
}
public static void h1866_0(moom.Oo p0) throws Throwable {
    throw __call1186600_0(p0);
}
private static native java.awt.image.BufferedImage __fieldRead1866_0(moom.n7 a0) throws Throwable;
private static native java.lang.Boolean __call1866_1(int a0) throws Throwable;
private static native void __fieldWrite1866_2(moom.n7 a0, java.lang.Boolean a1) throws Throwable;
private static native moom.lh __fieldRead1866_3(moom.n7 a0) throws Throwable;
private static native int __instanceOf1866_4(moom.lh a0) throws Throwable;
private static native moom.lj __cast1866_5(moom.lh a0) throws Throwable;
private static native void __call1866_6(moom.lj a0) throws Throwable;
private static native java.lang.Exception __call1186600_0(moom.Oo a0) throws Throwable;

}


private void b__sourceReturn_da8c82d5d4() { __sourceHandlerCall_0baad2f3246b6184cab0(this); }


private void e() { __sourceHandlerCall_3deca0836060ec235bf5(this); }


private void f() { __sourceHandlerCall_4d4c05c730384c063f22(this); }


protected void d() {
this.r = ((java.lang.Thread)(new moom.Ou(this, __sourceIntrinsic_6cce62949456_originalDynamicSite1571_2(((java.util.concurrent.atomic.AtomicInteger)(moom.n7.m)).incrementAndGet()))));
    ((java.lang.Thread)(this.r)).setDaemon(((boolean)(true)));
    ((java.lang.Thread)(this.r)).start();
    return;
}


public moom.lh a__lh() {
return this.p;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public int a() {
((moom.n7)(this)).b__sourceReturn_da8c82d5d4();
    return super.a();
}


public void a(java.awt.image.BufferedImage p0) { __sourceHandlerCall_f087c53a830f7be91d25(this, p0); }


public void a(moom.oR p0) throws java.io.IOException { __sourceHandlerCall_7644959f7ba56c1aaafb(this, p0); }


private boolean a__Boolean() { return __sourceHandlerCall_761bf23d15a39b6b4811(this); }


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6cce62949456_originalDynamicSite1571_2(int a0) throws E;
}
