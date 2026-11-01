package moom;


public class IW implements java.lang.Runnable {

private static moom.IW a;

private java.util.List<net.minecraft.world.storage.IThreadedFileIO> b;

private volatile long c;

private volatile long d;

private volatile boolean e;

private static long f;

private static long[] g;

private static java.lang.Long[] h;

private static java.util.Map i;

private IW() {
super();
    this.b = ((java.util.List)(java.util.Collections.synchronizedList(((java.util.List)(com.google.common.collect.Lists.newArrayList())))));
    java.lang.Thread local1 = new java.lang.Thread(this, "File IO Thread");
    ((java.lang.Thread)(local1)).setPriority(((int)(1)));
    ((java.lang.Thread)(local1)).start();
    return;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(7492413763100485917L)), ((long)(1344695292524624636L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(245381585546692L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.IW.f ^ 10329048389574L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill580_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill580_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill580_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill580_14 = new byte[8];
    (__sourceSpill580_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill580_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation580_16 = __sourceSpill580_14;
    ((javax.crypto.Cipher)(__sourceSpill580_11)).init(((int)(__sourceSpill580_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill580_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation580_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[3];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\021ò\036=\023cV<\000\tr£=È:«ª\007F"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill580_25 = local6_life21;
        int __sourceSpill580_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill580_25)).substring(((int)(__sourceSpill580_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill580_30 = local8_life19;
        int __sourceSpill580_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill580_33 = new byte[8];
        (__sourceSpill580_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill580_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill580_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill580_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill580_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill580_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill580_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill580_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill580_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill580_34)).doFinal(((byte[])(__sourceSpill580_33)));
        (__sourceSpill580_30)[__sourceSpill580_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Long[])(new java.lang.Long[3]));
    a = ((moom.IW)(new moom.IW()));
}

private static native <E extends Throwable> void __sourceHandlerCall_2448a136fcdaf29fd5b4(moom.IW a0, net.minecraft.world.storage.IThreadedFileIO a1) throws E;
private static final class __SourceHandler_2448a136fcdaf29fd5b4 {

public static void f68(moom.IW receiver, net.minecraft.world.storage.IThreadedFileIO p0) throws Throwable {
    int forwardValue68_23_0;
    boolean spill68_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead68_0() ^ 5553609860535L);
    life4_5 = __call68_1();
    spill68_0 = __call68_3(__fieldRead68_2(receiver), p0);
    if (!((life4_5 != null))) {
        forwardValue68_23_0 = __integerCategory68_4(spill68_0);
        break forward_join_23;
    }
    if (!((!spill68_0))) {
        break forward_join_24;
    }
    moom.IW __stackOp68_5_0 = receiver;
    __fieldWrite68_7(__stackOp68_5_0, (__fieldRead68_6(__stackOp68_5_0) + 1L));
    forwardValue68_23_0 = __integerCategory68_10(__call68_9(__fieldRead68_8(receiver), p0));
    }
    __discardScalar68_11(forwardValue68_23_0);
    }
    return;
}
public static void h68_0(moom.Oo p0) throws Throwable {
    throw __call1006800_0(p0);
}
public static void h68_1(moom.Oo p0) throws Throwable {
    throw __call1006801_0(p0);
}
private static native long __fieldRead68_0() throws Throwable;
private static native java.lang.String __call68_1() throws Throwable;
private static native java.util.List __fieldRead68_2(moom.IW a0) throws Throwable;
private static native boolean __call68_3(java.util.List a0, net.minecraft.world.storage.IThreadedFileIO a1) throws Throwable;
private static native int __integerCategory68_4(boolean value) throws Throwable;
private static native long __fieldRead68_6(moom.IW a0) throws Throwable;
private static native void __fieldWrite68_7(moom.IW a0, long a1) throws Throwable;
private static native java.util.List __fieldRead68_8(moom.IW a0) throws Throwable;
private static native boolean __call68_9(java.util.List a0, net.minecraft.world.storage.IThreadedFileIO a1) throws Throwable;
private static native int __integerCategory68_10(boolean value) throws Throwable;
private static native void __discardScalar68_11(int a0) throws Throwable;
private static native java.lang.Exception __call1006800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1006801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_76d79b074a1bba5a0128(moom.IW a0) throws E;
private static final class __SourceHandler_76d79b074a1bba5a0128 {

public static void f682(moom.IW receiver) throws Throwable {
    int forestValue682_42_0;
    long forestValue682_50_0;
    int forestValue682_57_0;
    java.lang.String spill682_0;
    int spill682_1;
    long life1_3;
    int life4_6;
    java.lang.String life3_7;
    net.minecraft.world.storage.IThreadedFileIO life5_18;
    int life6_21;
    forest_join_64: {
    forest_join_57: {
    forest_join_54: {
    life1_3 = (__fieldRead682_0() ^ 92065414521608L);
    spill682_0 = __call682_1();
    life4_6 = 0;
    life3_7 = spill682_0;
    forest_cycle_8: while (true) {
    forest_join_50: {
    forest_join_45: {
    forest_join_42: {
    forest_join_40: {
    if (!((life4_6 < __call682_3(__fieldRead682_2(receiver))))) {
        break forest_join_54;
    }
    life5_18 = __cast682_6(__call682_5(__fieldRead682_4(receiver), life4_6));
    life6_21 = __integerCategory682_8(__call682_7(life5_18));
    spill682_1 = life6_21;
    if (!((life3_7 != null))) {
        forestValue682_57_0 = spill682_1;
        break forest_join_57;
    }
    if (!((life3_7 != null))) {
        forestValue682_42_0 = spill682_1;
        break forest_join_42;
    }
    if (!((spill682_1 == 0))) {
        break forest_join_40;
    }
    __call682_10(__fieldRead682_9(receiver), (life4_6--));
    moom.IW __stackOp682_11_0 = receiver;
    __fieldWrite682_13(__stackOp682_11_0, (__fieldRead682_12(__stackOp682_11_0) + 1L));
    }
    forestValue682_42_0 = __integerCategory682_15(__fieldRead682_14(receiver));
    }
    if (!((forestValue682_42_0 != 0))) {
        break forest_join_45;
    }
    forestValue682_50_0 = 0L;
    break forest_join_50;
    }
    forestValue682_50_0 = __invokedynamic682_16(174, (1334785170504856035L ^ life1_3));
    }
    __call682_17(forestValue682_50_0);
    life4_6 += 1;
    if (!((life3_7 == null))) {
        continue forest_cycle_8;
    }
    break forest_cycle_8;
    }
    }
    forestValue682_57_0 = __integerCategory682_20(__call682_19(__fieldRead682_18(receiver)));
    }
    if (!((forestValue682_57_0 != 0))) {
        break forest_join_64;
    }
    __call682_22(__invokedynamic682_21(17964, (524940455694497632L ^ life1_3)));
    }
    return;
}
public static void h682_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call3068200_0(p0);
}
public static void h682_1(java.lang.InterruptedException p0) throws Throwable {
    throw __call3068201_0(p0);
}
public static void h682_2(java.lang.InterruptedException p0) throws Throwable {
    throw __call3068202_0(p0);
}
public static void h682_3(java.lang.InterruptedException p0) throws Throwable {
    throw __call3068203_0(p0);
}
public static void h682_4(java.lang.InterruptedException p0, moom.IW p1, long p2, java.lang.String p3, int p4, net.minecraft.world.storage.IThreadedFileIO p5, int p6) throws Throwable {
    int forestValue3068204_42_0;
    long forestValue3068204_50_0;
    int forestValue3068204_55_0;
    int spill3068204_0;
    java.lang.InterruptedException life8_2;
    net.minecraft.world.storage.IThreadedFileIO life6_19;
    int life7_22;
    forest_join_62: {
    forest_join_55: {
    forest_join_52: {
    life8_2 = p0;
    __call3068204_0(life8_2);
    forest_cycle_4: while (true) {
    forest_join_50: {
    forest_join_45: {
    forest_join_42: {
    forest_join_40: {
    forest_join_8: {
    p4 += 1;
    if (!((p3 == null))) {
        break forest_join_8;
    }
    break forest_join_52;
    }
    if (!((p4 < __call3068204_2(__fieldRead3068204_1(p1))))) {
        break forest_join_52;
    }
    life6_19 = __cast3068204_5(__call3068204_4(__fieldRead3068204_3(p1), p4));
    life7_22 = __integerCategory3068204_7(__call3068204_6(life6_19));
    spill3068204_0 = life7_22;
    if (!((p3 != null))) {
        forestValue3068204_55_0 = spill3068204_0;
        break forest_join_55;
    }
    if (!((p3 != null))) {
        forestValue3068204_42_0 = spill3068204_0;
        break forest_join_42;
    }
    if (!((spill3068204_0 == 0))) {
        break forest_join_40;
    }
    __call3068204_9(__fieldRead3068204_8(p1), (p4--));
    moom.IW __stackOp3068204_10_0 = p1;
    __fieldWrite3068204_12(__stackOp3068204_10_0, (__fieldRead3068204_11(__stackOp3068204_10_0) + 1L));
    }
    forestValue3068204_42_0 = __integerCategory3068204_14(__fieldRead3068204_13(p1));
    }
    if (!((forestValue3068204_42_0 != 0))) {
        break forest_join_45;
    }
    forestValue3068204_50_0 = 0L;
    break forest_join_50;
    }
    forestValue3068204_50_0 = __invokedynamic3068204_15(174, (1334785170504856035L ^ p2));
    }
    __call3068204_16(forestValue3068204_50_0);
    continue forest_cycle_4;
    }
    }
    forestValue3068204_55_0 = __integerCategory3068204_19(__call3068204_18(__fieldRead3068204_17(p1)));
    }
    if (!((forestValue3068204_55_0 != 0))) {
        break forest_join_62;
    }
    __call3068204_21(__invokedynamic3068204_20(17964, (524940455694497632L ^ p2)));
    }
    return;
}
public static void h682_5(moom.Oo p0) throws Throwable {
    throw __call3068205_0(p0);
}
public static void h682_6(java.lang.InterruptedException p0, int p1) throws Throwable {
    java.lang.InterruptedException life1_2;
    life1_2 = p0;
    __call3068206_0(life1_2);
    return;
}
private static native long __fieldRead682_0() throws Throwable;
private static native java.lang.String __call682_1() throws Throwable;
private static native java.util.List __fieldRead682_2(moom.IW a0) throws Throwable;
private static native int __call682_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead682_4(moom.IW a0) throws Throwable;
private static native java.lang.Object __call682_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.IThreadedFileIO __cast682_6(java.lang.Object a0) throws Throwable;
private static native boolean __call682_7(net.minecraft.world.storage.IThreadedFileIO a0) throws Throwable;
private static native int __integerCategory682_8(boolean value) throws Throwable;
private static native java.util.List __fieldRead682_9(moom.IW a0) throws Throwable;
private static native java.lang.Object __call682_10(java.util.List a0, int a1) throws Throwable;
private static native long __fieldRead682_12(moom.IW a0) throws Throwable;
private static native void __fieldWrite682_13(moom.IW a0, long a1) throws Throwable;
private static native boolean __fieldRead682_14(moom.IW a0) throws Throwable;
private static native int __integerCategory682_15(boolean value) throws Throwable;
private static native long __invokedynamic682_16(int a0, long a1) throws Throwable;
private static native void __call682_17(long a0) throws Throwable;
private static native java.util.List __fieldRead682_18(moom.IW a0) throws Throwable;
private static native boolean __call682_19(java.util.List a0) throws Throwable;
private static native int __integerCategory682_20(boolean value) throws Throwable;
private static native long __invokedynamic682_21(int a0, long a1) throws Throwable;
private static native void __call682_22(long a0) throws Throwable;
private static native java.lang.Exception __call3068200_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3068201_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3068202_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3068203_0(java.lang.InterruptedException a0) throws Throwable;
private static native void __call3068204_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.util.List __fieldRead3068204_1(moom.IW a0) throws Throwable;
private static native int __call3068204_2(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead3068204_3(moom.IW a0) throws Throwable;
private static native java.lang.Object __call3068204_4(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.world.storage.IThreadedFileIO __cast3068204_5(java.lang.Object a0) throws Throwable;
private static native boolean __call3068204_6(net.minecraft.world.storage.IThreadedFileIO a0) throws Throwable;
private static native int __integerCategory3068204_7(boolean value) throws Throwable;
private static native java.util.List __fieldRead3068204_8(moom.IW a0) throws Throwable;
private static native java.lang.Object __call3068204_9(java.util.List a0, int a1) throws Throwable;
private static native long __fieldRead3068204_11(moom.IW a0) throws Throwable;
private static native void __fieldWrite3068204_12(moom.IW a0, long a1) throws Throwable;
private static native boolean __fieldRead3068204_13(moom.IW a0) throws Throwable;
private static native int __integerCategory3068204_14(boolean value) throws Throwable;
private static native long __invokedynamic3068204_15(int a0, long a1) throws Throwable;
private static native void __call3068204_16(long a0) throws Throwable;
private static native java.util.List __fieldRead3068204_17(moom.IW a0) throws Throwable;
private static native boolean __call3068204_18(java.util.List a0) throws Throwable;
private static native int __integerCategory3068204_19(boolean value) throws Throwable;
private static native long __invokedynamic3068204_20(int a0, long a1) throws Throwable;
private static native void __call3068204_21(long a0) throws Throwable;
private static native java.lang.Exception __call3068205_0(moom.Oo a0) throws Throwable;
private static native void __call3068206_0(java.lang.InterruptedException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_bb1b3db491ee033f5e19(moom.IW a0) throws E;
private static final class __SourceHandler_bb1b3db491ee033f5e19 {

public static void f652(moom.IW receiver) throws Throwable {
    java.lang.String spill652_0;
    long life1_3;
    java.lang.String life3_8;
    lexical_join_28: {
    lexical_join_25: {
    life1_3 = (__fieldRead652_0() ^ 60870667103617L);
    spill652_0 = __call652_1();
    __fieldWrite652_2(receiver, 1);
    life3_8 = spill652_0;
    lexical_cycle_9: while (true) {
    if (!((__numericCompare652_5(__fieldRead652_3(receiver), __fieldRead652_4(receiver)) != 0))) {
        break lexical_join_25;
    }
    __call652_7(__invokedynamic652_6(6411, (3448370653713786573L ^ life1_3)));
    if (!((life3_8 != null))) {
        break lexical_join_28;
    }
    if (!((life3_8 == null))) { continue lexical_cycle_9; }
    break lexical_cycle_9;
    }
    }
    __fieldWrite652_8(receiver, 0);
    }
    return;
}
public static void h652_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call1065200_0(p0);
}
private static native long __fieldRead652_0() throws Throwable;
private static native java.lang.String __call652_1() throws Throwable;
private static native void __fieldWrite652_2(moom.IW a0, int a1) throws Throwable;
private static native long __fieldRead652_3(moom.IW a0) throws Throwable;
private static native long __fieldRead652_4(moom.IW a0) throws Throwable;
private static native int __numericCompare652_5(long a0, long a1) throws Throwable;
private static native long __invokedynamic652_6(int a0, long a1) throws Throwable;
private static native void __call652_7(long a0) throws Throwable;
private static native void __fieldWrite652_8(moom.IW a0, int a1) throws Throwable;
private static native java.lang.Exception __call1065200_0(java.lang.InterruptedException a0) throws Throwable;

}


public void run() {
terminal_cycle_0: while (true) {
        ((moom.IW)(this)).a__Void();
        continue terminal_cycle_0;
    }
}


public void b() throws java.lang.InterruptedException { __sourceHandlerCall_bb1b3db491ee033f5e19(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static long a(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 21597);
    if (((moom.IW.h)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.IW.g)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.IW.i)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.IW.i)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/IW", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.IW.h)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.IW.h)[life3_8])).longValue();
}


private static long a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.IW.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4944_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/IW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static moom.IW a() {
return moom.IW.a;
}


private void a__Void() { __sourceHandlerCall_76d79b074a1bba5a0128(this); }


public void a(net.minecraft.world.storage.IThreadedFileIO p0) { __sourceHandlerCall_2448a136fcdaf29fd5b4(this, p0); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4944_0() throws E;
}
