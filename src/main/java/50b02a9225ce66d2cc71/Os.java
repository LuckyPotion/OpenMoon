package moom;


public class Os extends java.lang.Thread {

private static java.util.concurrent.atomic.AtomicInteger a;

private static org.apache.logging.log4j.Logger b;

private java.lang.String c;

private java.net.DatagramSocket d;

private boolean e;

private java.lang.String f;

private static long g;

private static long h;

private static long i;

public Os(java.lang.String p0, java.lang.String p1) throws java.io.IOException {
super(__sourceIntrinsic_6f54e34a4dee_originalDynamicSite4111_2(((java.util.concurrent.atomic.AtomicInteger)(moom.Os.a)).incrementAndGet()));
    this.e = ((boolean)(true));
    this.c = ((java.lang.String)(p0));
    this.f = ((java.lang.String)(p1));
    ((moom.Os)(this)).setDaemon(((boolean)(true)));
    this.d = ((java.net.DatagramSocket)(new java.net.DatagramSocket()));
    return;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(514218343335679541L)), ((long)(-1767942579980524759L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(19936752777198L)))));
    long local5_life6 = (moom.Os.g ^ 15186790244901L);
    javax.crypto.Cipher local7_life8;
    javax.crypto.Cipher __sourceSpill751_10 = (local7_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill751_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill751_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill751_13 = new byte[8];
    (__sourceSpill751_13)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local8_life14 = 1;
    while ((local8_life14 < 8)) {
        (__sourceSpill751_13)[local8_life14] = ((byte) ((int) ((local5_life6 << (local8_life14 * 8)) >>> 56)));
        local8_life14 += 1;
    }
    byte[] __sourcePreallocation751_15 = __sourceSpill751_13;
    ((javax.crypto.Cipher)(__sourceSpill751_10)).init(((int)(__sourceSpill751_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill751_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation751_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local9_life18 = -624193887218222486L;
    byte[] __sourceSpill751_19 = new byte[8];
    (__sourceSpill751_19)[0] = ((byte) ((int) (local9_life18 >>> 56)));
    (__sourceSpill751_19)[1] = ((byte) ((int) (local9_life18 >>> 48)));
    (__sourceSpill751_19)[2] = ((byte) ((int) (local9_life18 >>> 40)));
    (__sourceSpill751_19)[3] = ((byte) ((int) (local9_life18 >>> 32)));
    (__sourceSpill751_19)[4] = ((byte) ((int) (local9_life18 >>> 24)));
    (__sourceSpill751_19)[5] = ((byte) ((int) (local9_life18 >>> 16)));
    (__sourceSpill751_19)[6] = ((byte) ((int) (local9_life18 >>> 8)));
    (__sourceSpill751_19)[7] = ((byte) ((int) local9_life18));
    javax.crypto.Cipher __sourceSpill751_20 = local7_life8;
    byte[] local11_life22 = ((javax.crypto.Cipher)(__sourceSpill751_20)).doFinal(((byte[])(__sourceSpill751_19)));
    h = ((long)((((((((((((long) (local11_life22)[0]) & 255L) << 56) | ((((long) (local11_life22)[1]) & 255L) << 48)) | ((((long) (local11_life22)[2]) & 255L) << 40)) | ((((long) (local11_life22)[3]) & 255L) << 32)) | ((((long) (local11_life22)[4]) & 255L) << 24)) | ((((long) (local11_life22)[5]) & 255L) << 16)) | ((((long) (local11_life22)[6]) & 255L) << 8)) | (((long) (local11_life22)[7]) & 255L))));
    javax.crypto.Cipher local0_life25;
    javax.crypto.Cipher __sourceSpill751_27 = (local0_life25 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill751_28 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill751_29 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill751_30 = new byte[8];
    (__sourceSpill751_30)[0] = ((byte) ((int) (local5_life6 >>> 56)));
    int local1_life31 = 1;
    while ((local1_life31 < 8)) {
        (__sourceSpill751_30)[local1_life31] = ((byte) ((int) ((local5_life6 << (local1_life31 * 8)) >>> 56)));
        local1_life31 += 1;
    }
    byte[] __sourcePreallocation751_32 = __sourceSpill751_30;
    ((javax.crypto.Cipher)(__sourceSpill751_27)).init(((int)(__sourceSpill751_28)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill751_29)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation751_32)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life35 = 8961963621651750118L;
    byte[] __sourceSpill751_36 = new byte[8];
    (__sourceSpill751_36)[0] = ((byte) ((int) (local2_life35 >>> 56)));
    (__sourceSpill751_36)[1] = ((byte) ((int) (local2_life35 >>> 48)));
    (__sourceSpill751_36)[2] = ((byte) ((int) (local2_life35 >>> 40)));
    (__sourceSpill751_36)[3] = ((byte) ((int) (local2_life35 >>> 32)));
    (__sourceSpill751_36)[4] = ((byte) ((int) (local2_life35 >>> 24)));
    (__sourceSpill751_36)[5] = ((byte) ((int) (local2_life35 >>> 16)));
    (__sourceSpill751_36)[6] = ((byte) ((int) (local2_life35 >>> 8)));
    (__sourceSpill751_36)[7] = ((byte) ((int) local2_life35));
    javax.crypto.Cipher __sourceSpill751_37 = local0_life25;
    byte[] local4_life39 = ((javax.crypto.Cipher)(__sourceSpill751_37)).doFinal(((byte[])(__sourceSpill751_36)));
    i = ((long)((((((((((((long) (local4_life39)[0]) & 255L) << 56) | ((((long) (local4_life39)[1]) & 255L) << 48)) | ((((long) (local4_life39)[2]) & 255L) << 40)) | ((((long) (local4_life39)[3]) & 255L) << 32)) | ((((long) (local4_life39)[4]) & 255L) << 24)) | ((((long) (local4_life39)[5]) & 255L) << 16)) | ((((long) (local4_life39)[6]) & 255L) << 8)) | (((long) (local4_life39)[7]) & 255L))));
    a = ((java.util.concurrent.atomic.AtomicInteger)(new java.util.concurrent.atomic.AtomicInteger(0)));
    b = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_31bacb391d956a92fe84(java.lang.String a0) throws E;
private static final class __SourceHandler_31bacb391d956a92fe84 {

public static java.lang.String f1024(java.lang.String p0) throws Throwable {
    int forwardValue1024_23_0;
    java.lang.String forwardValue1024_36_0;
    net.minecraft.entity.Entity[] spill1024_0;
    int spill1024_1;
    long life1_3;
    int life4_8;
    net.minecraft.entity.Entity[] life3_9;
    int life5_28;
    forward_join_36: {
    forward_join_29: {
    forward_join_23: {
    forward_join_16: {
    life1_3 = (__fieldRead1024_0() ^ 60683803662849L);
    spill1024_0 = __call1024_1();
    life4_8 = __call1024_2(p0, "[MOTD]");
    life3_9 = spill1024_0;
    spill1024_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue1024_23_0 = spill1024_1;
        break forward_join_23;
    }
    if (!((spill1024_1 < 0))) {
        break forward_join_16;
    }
    return "missing no";
    }
    forwardValue1024_23_0 = __call1024_4(p0, "[/MOTD]", (life4_8 + __call1024_3("[MOTD]")));
    }
    life5_28 = forwardValue1024_23_0;
    if (!((life5_28 < life4_8))) {
        break forward_join_29;
    }
    forwardValue1024_36_0 = "missing no";
    break forward_join_36;
    }
    forwardValue1024_36_0 = __call1024_6(p0, (life4_8 + __call1024_5("[MOTD]")), life5_28);
    }
    return forwardValue1024_36_0;
}
public static void h1024_0(moom.Oo p0) throws Throwable {
    throw __call1102400_0(p0);
}
public static void h1024_1(moom.Oo p0) throws Throwable {
    throw __call1102401_0(p0);
}
public static void h1024_2(moom.Oo p0) throws Throwable {
    throw __call1102402_0(p0);
}
private static native long __fieldRead1024_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1024_1() throws Throwable;
private static native int __call1024_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call1024_3(java.lang.String a0) throws Throwable;
private static native int __call1024_4(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1024_5(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1024_6(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1102400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102402_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_319eede3a71626a08048(java.lang.String a0) throws E;
private static final class __SourceHandler_319eede3a71626a08048 {

public static java.lang.String f1025(java.lang.String p0) throws Throwable {
    int forwardValue1025_23_0;
    int forwardValue1025_37_0;
    int forwardValue1025_51_0;
    java.lang.String forwardValue1025_64_0;
    net.minecraft.entity.Entity[] spill1025_0;
    int spill1025_1;
    int spill1025_2;
    int spill1025_3;
    long life1_3;
    int life4_8;
    net.minecraft.entity.Entity[] life3_9;
    int life5_28;
    int life6_47;
    int life7_66;
    forward_join_64: {
    forward_join_57: {
    forward_join_51: {
    forward_join_44: {
    forward_join_37: {
    forward_join_30: {
    forward_join_23: {
    forward_join_16: {
    life1_3 = (__fieldRead1025_0() ^ 126965288593437L);
    spill1025_0 = __call1025_1();
    life4_8 = __call1025_2(p0, "[/MOTD]");
    life3_9 = spill1025_0;
    spill1025_1 = life4_8;
    if (!((life3_9 == null))) {
        forwardValue1025_23_0 = spill1025_1;
        break forward_join_23;
    }
    if (!((spill1025_1 < 0))) {
        break forward_join_16;
    }
    return null;
    }
    forwardValue1025_23_0 = __call1025_4(p0, "[/MOTD]", (life4_8 + __call1025_3("[/MOTD]")));
    }
    life5_28 = forwardValue1025_23_0;
    spill1025_2 = life5_28;
    if (!((life3_9 == null))) {
        forwardValue1025_37_0 = spill1025_2;
        break forward_join_37;
    }
    if (!((spill1025_2 >= 0))) {
        break forward_join_30;
    }
    return null;
    }
    forwardValue1025_37_0 = __call1025_6(p0, "[AD]", (life4_8 + __call1025_5("[/MOTD]")));
    }
    life6_47 = forwardValue1025_37_0;
    spill1025_3 = life6_47;
    if (!((life3_9 == null))) {
        forwardValue1025_51_0 = spill1025_3;
        break forward_join_51;
    }
    if (!((spill1025_3 < 0))) {
        break forward_join_44;
    }
    return null;
    }
    forwardValue1025_51_0 = __call1025_8(p0, "[/AD]", (life6_47 + __call1025_7("[AD]")));
    }
    life7_66 = forwardValue1025_51_0;
    if (!((life7_66 < life6_47))) {
        break forward_join_57;
    }
    forwardValue1025_64_0 = null;
    break forward_join_64;
    }
    forwardValue1025_64_0 = __call1025_10(p0, (life6_47 + __call1025_9("[AD]")), life7_66);
    }
    return forwardValue1025_64_0;
}
public static void h1025_0(moom.Oo p0) throws Throwable {
    throw __call1102500_0(p0);
}
public static void h1025_1(moom.Oo p0) throws Throwable {
    throw __call1102501_0(p0);
}
public static void h1025_2(moom.Oo p0) throws Throwable {
    throw __call1102502_0(p0);
}
public static void h1025_3(moom.Oo p0) throws Throwable {
    throw __call1102503_0(p0);
}
public static void h1025_4(moom.Oo p0) throws Throwable {
    throw __call1102504_0(p0);
}
public static void h1025_5(moom.Oo p0) throws Throwable {
    throw __call1102505_0(p0);
}
public static void h1025_6(moom.Oo p0) throws Throwable {
    throw __call1102506_0(p0);
}
private static native long __fieldRead1025_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call1025_1() throws Throwable;
private static native int __call1025_2(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native int __call1025_3(java.lang.String a0) throws Throwable;
private static native int __call1025_4(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1025_5(java.lang.String a0) throws Throwable;
private static native int __call1025_6(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1025_7(java.lang.String a0) throws Throwable;
private static native int __call1025_8(java.lang.String a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1025_9(java.lang.String a0) throws Throwable;
private static native java.lang.String __call1025_10(java.lang.String a0, int a1, int a2) throws Throwable;
private static native java.lang.Exception __call1102500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1102506_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_41ae29ad494fc30e24ac(moom.Os a0) throws E;
private static final class __SourceHandler_41ae29ad494fc30e24ac {

public static void f814(moom.Os receiver) throws Throwable {
    net.minecraft.entity.Entity[] spill814_0;
    long life1_3;
    java.lang.String life4_9;
    byte[] life5_13;
    net.minecraft.entity.Entity[] life3_14;
    java.net.InetAddress life6_24;
    java.net.DatagramPacket life7_34;
    forest_join_41: {
    life1_3 = (__fieldRead814_0() ^ 45110727680101L);
    life4_9 = __call814_3(__fieldRead814_1(receiver), __fieldRead814_2(receiver));
    spill814_0 = __call814_4();
    life5_13 = __call814_5(life4_9);
    life3_14 = spill814_0;
    forest_cycle_15: while (true) {
    if (!((!__call814_6(receiver)))) {
        break forest_join_41;
    }
    if (!(__fieldRead814_7(receiver))) {
        break forest_join_41;
    }
    life6_24 = __call814_8("224.0.2.60");
    life7_34 = new java.net.DatagramPacket(life5_13, (life5_13).length, life6_24, ((int) __fieldRead814_9()));
    __call814_11(__fieldRead814_10(receiver), life7_34);
    __call814_13(__fieldRead814_12());
    continue forest_cycle_15;
    }
    }
    return;
}
public static void h814_0(java.io.IOException p0) throws Throwable {
    throw __call3081400_0(p0);
}
public static void h814_1(java.io.IOException p0, java.net.InetAddress p1) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3081401_3(__fieldRead3081401_0(), __invokedynamic3081401_2(__call3081401_1(life1_2)));
    return;
}
public static void h814_2(java.lang.InterruptedException p0, moom.Os p1, net.minecraft.entity.Entity[] p2, byte[] p3, java.net.InetAddress p4, java.net.DatagramPacket p5) throws Throwable {
    java.lang.InterruptedException life4_2;
    java.net.InetAddress life4_15;
    java.net.DatagramPacket life5_25;
    forest_join_31: {
    forest_join_5: {
    life4_2 = p0;
    if (!((p2 != null))) {
        break forest_join_5;
    }
    break forest_join_31;
    }
    forest_cycle_5: while (true) {
    if (!((!__call3081402_0(p1)))) {
        break forest_join_31;
    }
    if (!(__fieldRead3081402_1(p1))) {
        break forest_join_31;
    }
    life4_15 = __call3081402_2("224.0.2.60");
    life5_25 = new java.net.DatagramPacket(p3, (p3).length, life4_15, ((int) __fieldRead3081402_3()));
    __call3081402_5(__fieldRead3081402_4(p1), life5_25);
    __call3081402_7(__fieldRead3081402_6());
    continue forest_cycle_5;
    }
    }
    return;
}
private static native long __fieldRead814_0() throws Throwable;
private static native java.lang.String __fieldRead814_1(moom.Os a0) throws Throwable;
private static native java.lang.String __fieldRead814_2(moom.Os a0) throws Throwable;
private static native java.lang.String __call814_3(java.lang.String a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call814_4() throws Throwable;
private static native byte[] __call814_5(java.lang.String a0) throws Throwable;
private static native boolean __call814_6(moom.Os a0) throws Throwable;
private static native boolean __fieldRead814_7(moom.Os a0) throws Throwable;
private static native java.net.InetAddress __call814_8(java.lang.String a0) throws Throwable;
private static native long __fieldRead814_9() throws Throwable;
private static native java.net.DatagramSocket __fieldRead814_10(moom.Os a0) throws Throwable;
private static native void __call814_11(java.net.DatagramSocket a0, java.net.DatagramPacket a1) throws Throwable;
private static native long __fieldRead814_12() throws Throwable;
private static native void __call814_13(long a0) throws Throwable;
private static native java.lang.Exception __call3081400_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3081401_0() throws Throwable;
private static native java.lang.String __call3081401_1(java.io.IOException a0) throws Throwable;
private static native java.lang.String __invokedynamic3081401_2(java.lang.String a0) throws Throwable;
private static native void __call3081401_3(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native boolean __call3081402_0(moom.Os a0) throws Throwable;
private static native boolean __fieldRead3081402_1(moom.Os a0) throws Throwable;
private static native java.net.InetAddress __call3081402_2(java.lang.String a0) throws Throwable;
private static native long __fieldRead3081402_3() throws Throwable;
private static native java.net.DatagramSocket __fieldRead3081402_4(moom.Os a0) throws Throwable;
private static native void __call3081402_5(java.net.DatagramSocket a0, java.net.DatagramPacket a1) throws Throwable;
private static native long __fieldRead3081402_6() throws Throwable;
private static native void __call3081402_7(long a0) throws Throwable;

}


public void run() { __sourceHandlerCall_41ae29ad494fc30e24ac(this); }


public static java.lang.String b(java.lang.String p0) { return __sourceHandlerCall_319eede3a71626a08048(p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public static java.lang.String a(java.lang.String p0) { return __sourceHandlerCall_31bacb391d956a92fe84(p0); }


public static java.lang.String a(java.lang.String p0, java.lang.String p1) {
return __sourceIntrinsic_5fad0e3eb62c_originalDynamicSite1359_0(p0, p1);
}


public void interrupt() {
super.interrupt();
    this.e = ((boolean)(false));
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_6f54e34a4dee_originalDynamicSite4111_2(int a0) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_5fad0e3eb62c_originalDynamicSite1359_0(java.lang.String a0, java.lang.String a1) throws E;
}
