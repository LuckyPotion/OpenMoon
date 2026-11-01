package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mi {

private static org.apache.logging.log4j.Logger a;

private static java.util.concurrent.ThreadFactory b;

private java.util.List<net.minecraft.client.renderer.chunk.ChunkRenderWorker> c;

private java.util.concurrent.BlockingQueue<net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator> d;

private java.util.concurrent.BlockingQueue<moom.lp> e;

private moom.lz f;

private moom.lA g;

private java.util.Queue<com.google.common.util.concurrent.ListenableFutureTask<?>> h;

private net.minecraft.client.renderer.chunk.ChunkRenderWorker i;

private int j;

private java.util.List<moom.lp> k;

private static long l;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private static long[] p;

private static java.lang.Long[] q;

private static java.util.Map r;

public mi() {
this(((int)(-1)));
    return;
}


public mi(int p0) { super(); __sourceHandlerCall_0f7deb8950807582d4c8(this, p0); }


static {
l = ((long)(((moom._a)(moom._c.a(((long)(6564307108631687448L)), ((long)(-4737714688146252100L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(47230433322191L)))));
    o = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (moom.mi.l ^ 12448646083120L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill934_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill934_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill934_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill934_14 = new byte[8];
    (__sourceSpill934_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill934_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation934_16 = __sourceSpill934_14;
    ((javax.crypto.Cipher)(__sourceSpill934_11)).init(((int)(__sourceSpill934_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill934_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation934_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[4];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "÷\0007ÚXÑ[å\1776&¬ÌÄ"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill934_25 = local17_life21;
        int __sourceSpill934_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill934_25)).substring(((int)(__sourceSpill934_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill934_30 = local19_life19;
        int __sourceSpill934_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill934_33 = new byte[8];
        (__sourceSpill934_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill934_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill934_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill934_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill934_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill934_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill934_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill934_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill934_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill934_34)).doFinal(((byte[])(__sourceSpill934_33)));
        (__sourceSpill934_30)[__sourceSpill934_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "[R+\177»­¬\001Ö,\025n"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill934_38 = local17_life21;
        int __sourceSpill934_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill934_38)).substring(((int)(__sourceSpill934_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill934_43 = local19_life19;
        int __sourceSpill934_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill934_46 = new byte[8];
        (__sourceSpill934_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill934_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill934_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill934_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill934_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill934_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill934_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill934_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill934_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill934_47)).doFinal(((byte[])(__sourceSpill934_46)));
        (__sourceSpill934_43)[__sourceSpill934_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    m = ((long[])(local19_life19));
    n = ((java.lang.Integer[])(new java.lang.Integer[4]));
    r = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill934_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill934_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill934_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill934_59 = new byte[8];
    (__sourceSpill934_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill934_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation934_61 = __sourceSpill934_59;
    ((javax.crypto.Cipher)(__sourceSpill934_56)).init(((int)(__sourceSpill934_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill934_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation934_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "L\\ì~?rw¤ÎÉÛ\023>"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill934_70 = local4_life66;
        int __sourceSpill934_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill934_70)).substring(((int)(__sourceSpill934_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill934_75 = local6_life64;
        int __sourceSpill934_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill934_78 = new byte[8];
        (__sourceSpill934_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill934_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill934_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill934_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill934_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill934_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill934_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill934_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill934_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill934_79)).doFinal(((byte[])(__sourceSpill934_78)));
        (__sourceSpill934_75)[__sourceSpill934_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    p = ((long[])(local6_life64));
    q = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
    b = ((java.util.concurrent.ThreadFactory)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setNameFormat(((java.lang.String)("Chunk Batcher %d"))))).setDaemon(((boolean)(true))))).build()));
}

private static native <E extends Throwable> void __sourceHandlerCall_0f7deb8950807582d4c8(moom.mi a0, int a1) throws E;
private static final class __SourceHandler_0f7deb8950807582d4c8 {

public static void f482(moom.mi receiver, int p0) throws Throwable {
    long life2_3;
    int life4_49;
    int life5_61;
    int life6_81;
    net.minecraft.client.renderer.chunk.ChunkRenderWorker life7_89;
    java.lang.Thread life8_93;
    int life6_109;
    forest_join_123: {
    forest_join_103: {
    forest_join_80: {
    forest_join_77: {
    life2_3 = (__fieldRead482_0() ^ 15752667344284L);
    __directSuperInit482_1(receiver);
    __fieldWrite482_3(receiver, __call482_2());
    __fieldWrite482_6(receiver, __call482_5(__invokedynamic482_4(4720, (3157984560311099125L ^ life2_3))));
    __fieldWrite482_7(receiver, new moom.lz());
    __fieldWrite482_8(receiver, new moom.lA());
    __fieldWrite482_10(receiver, __call482_9());
    __fieldWrite482_11(receiver, new java.util.ArrayList());
    life4_49 = __call482_15(1, (((int) (((double) __call482_13(__call482_12())) * 0x1.3333333333333p-2d)) / __invokedynamic482_14(20967, (6952401407620685155L ^ life2_3))));
    life5_61 = __call482_19(1, __call482_18((__call482_17(__call482_16()) - 2), 1, (life4_49 / 5)));
    if (!((p0 < 0))) {
        break forest_join_77;
    }
    __fieldWrite482_22(receiver, __call482_21((life5_61 * __invokedynamic482_20(31994, (826418726601928829L ^ life2_3))), 1, life4_49));
    break forest_join_80;
    }
    __fieldWrite482_23(receiver, p0);
    }
    life6_81 = 0;
    forest_cycle_82: while (true) {
    if (!((life6_81 < life5_61))) {
        break forest_join_103;
    }
    life7_89 = new net.minecraft.client.renderer.chunk.ChunkRenderWorker(receiver);
    life8_93 = __call482_25(__fieldRead482_24(), life7_89);
    __call482_26(life8_93);
    __call482_28(__fieldRead482_27(receiver), life7_89);
    life6_81 += 1;
    continue forest_cycle_82;
    }
    }
    __fieldWrite482_31(receiver, __call482_30(__fieldRead482_29(receiver)));
    life6_109 = 0;
    forest_cycle_110: while (true) {
    if (!((life6_109 < __fieldRead482_32(receiver)))) {
        break forest_join_123;
    }
    __call482_34(__fieldRead482_33(receiver), new moom.lp());
    life6_109 += 1;
    continue forest_cycle_110;
    }
    }
    __fieldWrite482_35(receiver, new net.minecraft.client.renderer.chunk.ChunkRenderWorker(receiver, new moom.lp()));
    return;
}
public static void h482_0(moom.Oo p0) throws Throwable {
    throw __call3048200_0(p0);
}
public static void h482_1(moom.Oo p0) throws Throwable {
    throw __call3048201_0(p0);
}
private static native long __fieldRead482_0() throws Throwable;
private static native void __directSuperInit482_1(moom.mi a0) throws Throwable;
private static native java.util.ArrayList __call482_2() throws Throwable;
private static native void __fieldWrite482_3(moom.mi a0, java.util.ArrayList a1) throws Throwable;
private static native int __invokedynamic482_4(int a0, long a1) throws Throwable;
private static native java.util.concurrent.ArrayBlockingQueue __call482_5(int a0) throws Throwable;
private static native void __fieldWrite482_6(moom.mi a0, java.util.concurrent.ArrayBlockingQueue a1) throws Throwable;
private static native void __fieldWrite482_7(moom.mi a0, moom.lz a1) throws Throwable;
private static native void __fieldWrite482_8(moom.mi a0, moom.lA a1) throws Throwable;
private static native java.util.ArrayDeque __call482_9() throws Throwable;
private static native void __fieldWrite482_10(moom.mi a0, java.util.ArrayDeque a1) throws Throwable;
private static native void __fieldWrite482_11(moom.mi a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Runtime __call482_12() throws Throwable;
private static native long __call482_13(java.lang.Runtime a0) throws Throwable;
private static native int __invokedynamic482_14(int a0, long a1) throws Throwable;
private static native int __call482_15(int a0, int a1) throws Throwable;
private static native java.lang.Runtime __call482_16() throws Throwable;
private static native int __call482_17(java.lang.Runtime a0) throws Throwable;
private static native int __call482_18(int a0, int a1, int a2) throws Throwable;
private static native int __call482_19(int a0, int a1) throws Throwable;
private static native int __invokedynamic482_20(int a0, long a1) throws Throwable;
private static native int __call482_21(int a0, int a1, int a2) throws Throwable;
private static native void __fieldWrite482_22(moom.mi a0, int a1) throws Throwable;
private static native void __fieldWrite482_23(moom.mi a0, int a1) throws Throwable;
private static native java.util.concurrent.ThreadFactory __fieldRead482_24() throws Throwable;
private static native java.lang.Thread __call482_25(java.util.concurrent.ThreadFactory a0, net.minecraft.client.renderer.chunk.ChunkRenderWorker a1) throws Throwable;
private static native void __call482_26(java.lang.Thread a0) throws Throwable;
private static native java.util.List __fieldRead482_27(moom.mi a0) throws Throwable;
private static native boolean __call482_28(java.util.List a0, net.minecraft.client.renderer.chunk.ChunkRenderWorker a1) throws Throwable;
private static native int __fieldRead482_29(moom.mi a0) throws Throwable;
private static native java.util.concurrent.ArrayBlockingQueue __call482_30(int a0) throws Throwable;
private static native void __fieldWrite482_31(moom.mi a0, java.util.concurrent.ArrayBlockingQueue a1) throws Throwable;
private static native int __fieldRead482_32(moom.mi a0) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead482_33(moom.mi a0) throws Throwable;
private static native boolean __call482_34(java.util.concurrent.BlockingQueue a0, moom.lp a1) throws Throwable;
private static native void __fieldWrite482_35(moom.mi a0, net.minecraft.client.renderer.chunk.ChunkRenderWorker a1) throws Throwable;
private static native java.lang.Exception __call3048200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3048201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_50acd62e8a7de7333071(moom.mi a0, long a1) throws E;
private static final class __SourceHandler_50acd62e8a7de7333071 {

public static boolean f459(moom.mi receiver, long p0) throws Throwable {
    int life3_1;
    int life4_3;
    java.lang.Object life5_5;
    java.util.Queue life6_9;
    com.google.common.util.concurrent.ListenableFutureTask life5_15;
    long life6_37;
    forest_join_43: {
    life3_1 = 0;
    forest_cycle_2: while (true) {
    forest_join_42: {
    forest_join_33: {
    forest_join_26: {
    life4_3 = 0;
    life5_5 = null;
    __monitorEnter459_1((life6_9 = __fieldRead459_0(receiver)));
    life5_15 = __cast459_4(__call459_3(__fieldRead459_2(receiver)));
    __monitorExit459_5(life6_9);
    if (!((life5_15 != null))) {
        break forest_join_26;
    }
    __call459_6(life5_15);
    life4_3 = 1;
    life3_1 = 1;
    }
    if (!((__numericCompare459_7(p0, 0L) != 0))) {
        break forest_join_43;
    }
    if (!((life4_3 == 0))) {
        break forest_join_33;
    }
    break forest_join_43;
    }
    life6_37 = (p0 - __call459_8());
    if (!((__numericCompare459_9(life6_37, 0L) < 0))) {
        break forest_join_42;
    }
    break forest_join_43;
    }
    continue forest_cycle_2;
    }
    }
    return __integerCategory459_10(life3_1);
}
public static boolean h459_0(java.lang.Throwable p0, java.util.Queue p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3045900_0(p1);
    throw life2_2;
}
public static boolean h459_1(moom.Oo p0) throws Throwable {
    throw __call3045901_0(p0);
}
public static boolean h459_2(moom.Oo p0) throws Throwable {
    throw __call3045902_0(p0);
}
public static boolean h459_3(moom.Oo p0) throws Throwable {
    throw __call3045903_0(p0);
}
private static native java.util.Queue __fieldRead459_0(moom.mi a0) throws Throwable;
private static native void __monitorEnter459_1(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead459_2(moom.mi a0) throws Throwable;
private static native java.lang.Object __call459_3(java.util.Queue a0) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFutureTask __cast459_4(java.lang.Object a0) throws Throwable;
private static native void __monitorExit459_5(java.util.Queue a0) throws Throwable;
private static native void __call459_6(com.google.common.util.concurrent.ListenableFutureTask a0) throws Throwable;
private static native int __numericCompare459_7(long a0, long a1) throws Throwable;
private static native long __call459_8() throws Throwable;
private static native int __numericCompare459_9(long a0, long a1) throws Throwable;
private static native boolean __integerCategory459_10(int value) throws Throwable;
private static native void __monitorExit3045900_0(java.util.Queue a0) throws Throwable;
private static native java.lang.Exception __call3045901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3045902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3045903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_e39d59a7a3b1aa7085b7(moom.mi a0, moom.mp a1) throws E;
private static final class __SourceHandler_e39d59a7a3b1aa7085b7 {

public static boolean f412(moom.mi receiver, moom.mp p0) throws Throwable {
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator life3_5;
    int life4_15;
    int life2_24;
    forward_join_20: {
    __call412_1(__call412_0(p0));
    life3_5 = __call412_2(p0);
    __call412_4(life3_5, __invokedynamic412_3(receiver, life3_5));
    life4_15 = __integerCategory412_7(__call412_6(__fieldRead412_5(receiver), life3_5));
    if (!((life4_15 == 0))) {
        break forward_join_20;
    }
    __call412_8(life3_5);
    }
    life2_24 = life4_15;
    __call412_10(__call412_9(p0));
    return __integerCategory412_11(life2_24);
}
public static boolean h412_0(moom.Oo p0) throws Throwable {
    throw __call2041200_0(p0);
}
public static boolean h412_1(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2041201_1(__call2041201_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __call412_0(moom.mp a0) throws Throwable;
private static native void __call412_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __call412_2(moom.mp a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic412_3(moom.mi a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native void __call412_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, java.lang.Runnable a1) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead412_5(moom.mi a0) throws Throwable;
private static native boolean __call412_6(java.util.concurrent.BlockingQueue a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native int __integerCategory412_7(boolean value) throws Throwable;
private static native void __call412_8(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call412_9(moom.mp a0) throws Throwable;
private static native void __call412_10(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native boolean __integerCategory412_11(int value) throws Throwable;
private static native java.lang.Exception __call2041200_0(moom.Oo a0) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call2041201_0(moom.mp a0) throws Throwable;
private static native void __call2041201_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> com.google.common.util.concurrent.ListenableFuture __sourceHandlerCall_aadc379001586579ef3c(moom.mi a0, net.minecraft.util.EnumWorldBlockLayer a1, moom.lw a2, moom.mp a3, net.minecraft.client.renderer.chunk.CompiledChunk a4) throws E;
private static final class __SourceHandler_aadc379001586579ef3c {

public static com.google.common.util.concurrent.ListenableFuture f460(moom.mi receiver, net.minecraft.util.EnumWorldBlockLayer p0, moom.lw p1, moom.mp p2, net.minecraft.client.renderer.chunk.CompiledChunk p3) throws Throwable {
    com.google.common.util.concurrent.ListenableFutureTask spill460_0;
    com.google.common.util.concurrent.ListenableFutureTask life5_39;
    java.util.Queue life6_43;
    forest_join_30: {
    forest_join_22: {
    forest_join_13: {
    if (!(__call460_1(__call460_0()))) {
        break forest_join_30;
    }
    if (!(__call460_2())) {
        break forest_join_13;
    }
    __call460_5(receiver, p1, __call460_4(p2, __call460_3(p0)));
    break forest_join_22;
    }
    __call460_8(receiver, p1, __call460_7(__cast460_6(p2), p0, p3), p2);
    }
    __call460_9(p1, 0x0.0p0d, 0x0.0p0d, 0x0.0p0d);
    return __call460_10(null);
    }
    life5_39 = __call460_12(__invokedynamic460_11(receiver, p0, p1, p2, p3), null);
    __monitorEnter460_14((life6_43 = __fieldRead460_13(receiver)));
    __call460_16(__fieldRead460_15(receiver), life5_39);
    spill460_0 = life5_39;
    __monitorExit460_17(life6_43);
    return spill460_0;
}
public static com.google.common.util.concurrent.ListenableFuture h460_0(moom.Oo p0) throws Throwable {
    throw __call3046000_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h460_1(moom.Oo p0) throws Throwable {
    throw __call3046001_0(p0);
}
public static com.google.common.util.concurrent.ListenableFuture h460_2(java.lang.Throwable p0, java.util.Queue p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __monitorExit3046002_0(p1);
    throw life2_2;
}
private static native net.minecraft.client.Minecraft __call460_0() throws Throwable;
private static native boolean __call460_1(net.minecraft.client.Minecraft a0) throws Throwable;
private static native boolean __call460_2() throws Throwable;
private static native int __call460_3(net.minecraft.util.EnumWorldBlockLayer a0) throws Throwable;
private static native moom.oC __call460_4(moom.mp a0, int a1) throws Throwable;
private static native void __call460_5(moom.mi a0, moom.lw a1, moom.oC a2) throws Throwable;
private static native moom.mq __cast460_6(moom.mp a0) throws Throwable;
private static native int __call460_7(moom.mq a0, net.minecraft.util.EnumWorldBlockLayer a1, net.minecraft.client.renderer.chunk.CompiledChunk a2) throws Throwable;
private static native void __call460_8(moom.mi a0, moom.lw a1, int a2, moom.mp a3) throws Throwable;
private static native void __call460_9(moom.lw a0, double a1, double a2, double a3) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFuture __call460_10(java.lang.Object a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic460_11(moom.mi a0, net.minecraft.util.EnumWorldBlockLayer a1, moom.lw a2, moom.mp a3, net.minecraft.client.renderer.chunk.CompiledChunk a4) throws Throwable;
private static native com.google.common.util.concurrent.ListenableFutureTask __call460_12(java.lang.Runnable a0, java.lang.Object a1) throws Throwable;
private static native java.util.Queue __fieldRead460_13(moom.mi a0) throws Throwable;
private static native void __monitorEnter460_14(java.util.Queue a0) throws Throwable;
private static native java.util.Queue __fieldRead460_15(moom.mi a0) throws Throwable;
private static native boolean __call460_16(java.util.Queue a0, com.google.common.util.concurrent.ListenableFutureTask a1) throws Throwable;
private static native void __monitorExit460_17(java.util.Queue a0) throws Throwable;
private static native java.lang.Exception __call3046000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3046001_0(moom.Oo a0) throws Throwable;
private static native void __monitorExit3046002_0(java.util.Queue a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_858e45393e2235da4987(moom.mi a0) throws E;
private static final class __SourceHandler_858e45393e2235da4987 {

public static boolean f1079(moom.mi receiver) throws Throwable {
    int forwardValue1079_11_0;
    forward_join_11: {
    forward_join_10: {
    if (!(__call1079_1(__fieldRead1079_0(receiver)))) {
        break forward_join_10;
    }
    if (!(__call1079_3(__fieldRead1079_2(receiver)))) {
        break forward_join_10;
    }
    forwardValue1079_11_0 = 1;
    break forward_join_11;
    }
    forwardValue1079_11_0 = 0;
    }
    return __integerCategory1079_4(forwardValue1079_11_0);
}
public static void h1079_0(moom.Oo p0) throws Throwable {
    throw __call1107900_0(p0);
}
public static void h1079_1(moom.Oo p0) throws Throwable {
    throw __call1107901_0(p0);
}
private static native java.util.concurrent.BlockingQueue __fieldRead1079_0(moom.mi a0) throws Throwable;
private static native boolean __call1079_1(java.util.concurrent.BlockingQueue a0) throws Throwable;
private static native java.util.Queue __fieldRead1079_2(moom.mi a0) throws Throwable;
private static native boolean __call1079_3(java.util.Queue a0) throws Throwable;
private static native boolean __integerCategory1079_4(int value) throws Throwable;
private static native java.lang.Exception __call1107900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1107901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c1564ea1f32bc571dc1c(moom.mi a0) throws E;
private static final class __SourceHandler_c1564ea1f32bc571dc1c {

public static void f898(moom.mi receiver) throws Throwable {
    java.util.ArrayList life1_8;
    forest_join_20: {
    forest_join_7: {
    __call898_0(receiver);
    forest_cycle_2: while (true) {
    if (!(__call898_1(receiver, 0L))) {
        break forest_join_7;
    }
    continue forest_cycle_2;
    }
    }
    life1_8 = __call898_2();
    forest_cycle_9: while (true) {
    if (!((__call898_3(life1_8) != __fieldRead898_4(receiver)))) {
        break forest_join_20;
    }
    __call898_6(life1_8, __call898_5(receiver));
    continue forest_cycle_9;
    }
    }
    __call898_8(__fieldRead898_7(receiver), life1_8);
    return;
}
public static void h898_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call3089800_0(p0);
}
public static void h898_1(moom.Oo p0) throws Throwable {
    throw __call3089801_0(p0);
}
public static void h898_2(java.lang.InterruptedException p0, moom.mi p1, java.util.ArrayList p2) throws Throwable {
    java.lang.InterruptedException life3_2;
    forest_join_13: {
    life3_2 = p0;
    forest_cycle_2: while (true) {
    if (!((__call3089802_0(p2) != __fieldRead3089802_1(p1)))) {
        break forest_join_13;
    }
    __call3089802_3(p2, __call3089802_2(p1));
    continue forest_cycle_2;
    }
    }
    __call3089802_5(__fieldRead3089802_4(p1), p2);
    return;
}
private static native void __call898_0(moom.mi a0) throws Throwable;
private static native boolean __call898_1(moom.mi a0, long a1) throws Throwable;
private static native java.util.ArrayList __call898_2() throws Throwable;
private static native int __call898_3(java.util.ArrayList a0) throws Throwable;
private static native int __fieldRead898_4(moom.mi a0) throws Throwable;
private static native moom.lp __call898_5(moom.mi a0) throws Throwable;
private static native boolean __call898_6(java.util.ArrayList a0, moom.lp a1) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead898_7(moom.mi a0) throws Throwable;
private static native boolean __call898_8(java.util.concurrent.BlockingQueue a0, java.util.ArrayList a1) throws Throwable;
private static native java.lang.Exception __call3089800_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.lang.Exception __call3089801_0(moom.Oo a0) throws Throwable;
private static native int __call3089802_0(java.util.ArrayList a0) throws Throwable;
private static native int __fieldRead3089802_1(moom.mi a0) throws Throwable;
private static native moom.lp __call3089802_2(moom.mi a0) throws Throwable;
private static native boolean __call3089802_3(java.util.ArrayList a0, moom.lp a1) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead3089802_4(moom.mi a0) throws Throwable;
private static native boolean __call3089802_5(java.util.concurrent.BlockingQueue a0, java.util.ArrayList a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2d907907ef952cea6a78(moom.mi a0) throws E;
private static final class __SourceHandler_2d907907ef952cea6a78 {

public static void f461(moom.mi receiver) throws Throwable {
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator life1_8;
    forest_join_14: {
    forest_cycle_0: while (true) {
    forest_join_13: {
    if (!((!__call461_1(__fieldRead461_0(receiver))))) {
        break forest_join_14;
    }
    life1_8 = __cast461_4(__call461_3(__fieldRead461_2(receiver)));
    if (!((life1_8 != null))) {
        break forest_join_13;
    }
    __call461_5(life1_8);
    }
    continue forest_cycle_0;
    }
    }
    return;
}
public static void h461_0(moom.Oo p0) throws Throwable {
    throw __call3046100_0(p0);
}
private static native java.util.concurrent.BlockingQueue __fieldRead461_0(moom.mi a0) throws Throwable;
private static native boolean __call461_1(java.util.concurrent.BlockingQueue a0) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead461_2(moom.mi a0) throws Throwable;
private static native java.lang.Object __call461_3(java.util.concurrent.BlockingQueue a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __cast461_4(java.lang.Object a0) throws Throwable;
private static native void __call461_5(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0) throws Throwable;
private static native java.lang.Exception __call3046100_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_9bc48aae72182350507b(moom.mi a0, moom.mp a1) throws E;
private static final class __SourceHandler_9bc48aae72182350507b {

public static boolean f462(moom.mi receiver, moom.mp p0) throws Throwable {
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator life3_5;
    int life2_13;
    __call462_1(__call462_0(p0));
    life3_5 = __call462_2(p0);
    __call462_4(__fieldRead462_3(receiver), life3_5);
    life2_13 = 1;
    __call462_6(__call462_5(p0));
    return __integerCategory462_7(life2_13);
}
public static boolean h462_0(java.lang.InterruptedException p0, moom.mp p1, int p2) throws Throwable {
    java.lang.InterruptedException life3_2;
    int life2_4;
    life3_2 = p0;
    life2_4 = 1;
    __call3046200_1(__call3046200_0(p1));
    return __integerCategory3046200_2(life2_4);
}
public static boolean h462_1(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __call3046201_1(__call3046201_0(p1));
    throw life2_2;
}
private static native java.util.concurrent.locks.ReentrantLock __call462_0(moom.mp a0) throws Throwable;
private static native void __call462_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __call462_2(moom.mp a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkRenderWorker __fieldRead462_3(moom.mi a0) throws Throwable;
private static native void __call462_4(net.minecraft.client.renderer.chunk.ChunkRenderWorker a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call462_5(moom.mp a0) throws Throwable;
private static native void __call462_6(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native boolean __integerCategory462_7(int value) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call3046200_0(moom.mp a0) throws Throwable;
private static native void __call3046200_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native boolean __integerCategory3046200_2(int value) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call3046201_0(moom.mp a0) throws Throwable;
private static native void __call3046201_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5ddf7948802f1ba4cc7e(moom.mi a0) throws E;
private static final class __SourceHandler_5ddf7948802f1ba4cc7e {

public static void f897(moom.mi receiver) throws Throwable {
    long life1_3;
    moom.lp life3_28;
    forest_join_37: {
    life1_3 = (__fieldRead897_0() ^ 125232955308766L);
    forest_cycle_4: while (true) {
    forest_join_36: {
    if (!((__call897_2(__fieldRead897_1(receiver)) != __fieldRead897_3(receiver)))) {
        break forest_join_37;
    }
    __call897_5(receiver, __invokedynamic897_4(27753, (7242805638435227364L ^ life1_3)));
    life3_28 = __cast897_10(__call897_9(__fieldRead897_6(receiver), __invokedynamic897_7(11849, (7895385485465617605L ^ life1_3)), __fieldRead897_8()));
    if (!((life3_28 != null))) {
        break forest_join_36;
    }
    __call897_12(__fieldRead897_11(receiver), life3_28);
    }
    continue forest_cycle_4;
    }
    }
    return;
}
public static void h897_0(java.lang.InterruptedException p0) throws Throwable {
    throw __call3089700_0(p0);
}
public static void h897_1(java.lang.InterruptedException p0, moom.mi p1, long p2, moom.lp p3) throws Throwable {
    java.lang.InterruptedException life4_2;
    moom.lp life4_28;
    forest_join_35: {
    life4_2 = p0;
    forest_cycle_2: while (true) {
    forest_join_34: {
    if (!((__call3089701_1(__fieldRead3089701_0(p1)) != __fieldRead3089701_2(p1)))) {
        break forest_join_35;
    }
    __call3089701_4(p1, __invokedynamic3089701_3(27753, (7242805638435227364L ^ p2)));
    life4_28 = __cast3089701_9(__call3089701_8(__fieldRead3089701_5(p1), __invokedynamic3089701_6(11849, (7895385485465617605L ^ p2)), __fieldRead3089701_7()));
    if (!((life4_28 != null))) {
        break forest_join_34;
    }
    __call3089701_11(__fieldRead3089701_10(p1), life4_28);
    }
    continue forest_cycle_2;
    }
    }
    return;
}
private static native long __fieldRead897_0() throws Throwable;
private static native java.util.List __fieldRead897_1(moom.mi a0) throws Throwable;
private static native int __call897_2(java.util.List a0) throws Throwable;
private static native int __fieldRead897_3(moom.mi a0) throws Throwable;
private static native long __invokedynamic897_4(int a0, long a1) throws Throwable;
private static native boolean __call897_5(moom.mi a0, long a1) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead897_6(moom.mi a0) throws Throwable;
private static native long __invokedynamic897_7(int a0, long a1) throws Throwable;
private static native java.util.concurrent.TimeUnit __fieldRead897_8() throws Throwable;
private static native java.lang.Object __call897_9(java.util.concurrent.BlockingQueue a0, long a1, java.util.concurrent.TimeUnit a2) throws Throwable;
private static native moom.lp __cast897_10(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead897_11(moom.mi a0) throws Throwable;
private static native boolean __call897_12(java.util.List a0, moom.lp a1) throws Throwable;
private static native java.lang.Exception __call3089700_0(java.lang.InterruptedException a0) throws Throwable;
private static native java.util.List __fieldRead3089701_0(moom.mi a0) throws Throwable;
private static native int __call3089701_1(java.util.List a0) throws Throwable;
private static native int __fieldRead3089701_2(moom.mi a0) throws Throwable;
private static native long __invokedynamic3089701_3(int a0, long a1) throws Throwable;
private static native boolean __call3089701_4(moom.mi a0, long a1) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead3089701_5(moom.mi a0) throws Throwable;
private static native long __invokedynamic3089701_6(int a0, long a1) throws Throwable;
private static native java.util.concurrent.TimeUnit __fieldRead3089701_7() throws Throwable;
private static native java.lang.Object __call3089701_8(java.util.concurrent.BlockingQueue a0, long a1, java.util.concurrent.TimeUnit a2) throws Throwable;
private static native moom.lp __cast3089701_9(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead3089701_10(moom.mi a0) throws Throwable;
private static native boolean __call3089701_11(java.util.List a0, moom.lp a1) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ef11edc8c02d580446ef(moom.mi a0, moom.mp a1) throws E;
private static final class __SourceHandler_ef11edc8c02d580446ef {

public static boolean f417(moom.mi receiver, moom.mp p0) throws Throwable {
    net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator life3_5;
    int life4_17;
    int life2_24;
    forward_join_23: {
    __call417_1(__call417_0(p0));
    life3_5 = __call417_2(p0);
    if (!((life3_5 != null))) {
        break forward_join_23;
    }
    __call417_4(life3_5, __invokedynamic417_3(receiver, life3_5));
    life4_17 = __integerCategory417_7(__call417_6(__fieldRead417_5(receiver), life3_5));
    __call417_9(__call417_8(p0));
    return __integerCategory417_10(life4_17);
    }
    life2_24 = 1;
    __call417_12(__call417_11(p0));
    return __integerCategory417_13(life2_24);
}
public static boolean h417_0(java.lang.Throwable p0, moom.mp p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    __call2041700_1(__call2041700_0(p1));
    throw local2;
}
private static native java.util.concurrent.locks.ReentrantLock __call417_0(moom.mp a0) throws Throwable;
private static native void __call417_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator __call417_2(moom.mp a0) throws Throwable;
private static native java.lang.Runnable __invokedynamic417_3(moom.mi a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native void __call417_4(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a0, java.lang.Runnable a1) throws Throwable;
private static native java.util.concurrent.BlockingQueue __fieldRead417_5(moom.mi a0) throws Throwable;
private static native boolean __call417_6(java.util.concurrent.BlockingQueue a0, net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a1) throws Throwable;
private static native int __integerCategory417_7(boolean value) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call417_8(moom.mp a0) throws Throwable;
private static native void __call417_9(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native boolean __integerCategory417_10(int value) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call417_11(moom.mp a0) throws Throwable;
private static native void __call417_12(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;
private static native boolean __integerCategory417_13(int value) throws Throwable;
private static native java.util.concurrent.locks.ReentrantLock __call2041700_0(moom.mp a0) throws Throwable;
private static native void __call2041700_1(java.util.concurrent.locks.ReentrantLock a0) throws Throwable;

}


private static long b(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 612);
    if (((moom.mi.q)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.mi.p)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.mi.r)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.mi.r)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/mi", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.mi.q)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.mi.q)[life3_8])).longValue();
}


public void b() { __sourceHandlerCall_2d907907ef952cea6a78(this); }


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.mi.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8422_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b(moom.mp p0) { return __sourceHandlerCall_9bc48aae72182350507b(this, p0); }


public void c() { __sourceHandlerCall_5ddf7948802f1ba4cc7e(this); }


public boolean c(moom.mp p0) { return __sourceHandlerCall_ef11edc8c02d580446ef(this, p0); }


public void d() {
((java.util.concurrent.BlockingQueue)(this.e)).addAll(((java.util.Collection)(this.k)));
    ((java.util.List)(this.k)).clear();
    return;
}


public java.lang.String a() {
return java.lang.String.format(((java.lang.String)("pC: %03d, pU: %1d, aB: %1d")), ((java.lang.Object[])(new java.lang.Object[] {java.lang.Integer.valueOf(((int)(((java.util.concurrent.BlockingQueue)(this.d)).size()))), java.lang.Integer.valueOf(((int)(((java.util.Queue)(this.h)).size()))), java.lang.Integer.valueOf(((int)(((java.util.concurrent.BlockingQueue)(this.e)).size())))})));
}


public boolean a(long p0) { return __sourceHandlerCall_50acd62e8a7de7333071(this, p0); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public boolean a(moom.mp p0) { return __sourceHandlerCall_e39d59a7a3b1aa7085b7(this, p0); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral8428_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/mi"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.mi.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 29486;
      if (n[var3] == null) {
         byte[] var4 = new byte[]{
            (byte)(p1 >>> 56),
            (byte)(p1 >>> 48),
            (byte)(p1 >>> 40),
            (byte)(p1 >>> 32),
            (byte)(p1 >>> 24),
            (byte)(p1 >>> 16),
            (byte)(p1 >>> 8),
            (byte)p1
         };
         long var5 = m[var3];
         byte[] var7 = new byte[]{
            (byte)(var5 >>> 56),
            (byte)(var5 >>> 48),
            (byte)(var5 >>> 40),
            (byte)(var5 >>> 32),
            (byte)(var5 >>> 24),
            (byte)(var5 >>> 16),
            (byte)(var5 >>> 8),
            (byte)var5
         };
         Long var8 = Thread.currentThread().getId();
         Object[] var9 = (Object[])o.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               o.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/mi", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         n[var3] = var15;
      }

      return n[var3];
}


private void a(moom.lw p0, int p1, moom.mp p2) {
long local4_life2 = (moom.mi.l ^ 114891784408428L);
    org.lwjgl.opengl.GL11.glNewList(((int)(p1)), ((int)(__sourceIntrinsic_76a2b8e5da42_originalDynamicSite703_4(4634, (6703187561117236844L ^ local4_life2)))));
    moom.kZ.B();
    ((moom.mp)(p2)).c__Void();
    ((moom.lz)(this.f)).a(((moom.lw)(p0)));
    moom.kZ.C();
    org.lwjgl.opengl.GL11.glEndList();
    return;
}


public com.google.common.util.concurrent.ListenableFuture<java.lang.Object> a(net.minecraft.util.EnumWorldBlockLayer p0, moom.lw p1, moom.mp p2, net.minecraft.client.renderer.chunk.CompiledChunk p3) { return __sourceHandlerCall_aadc379001586579ef3c(this, p0, p1, p2, p3); }


public net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator a__mh() throws java.lang.InterruptedException {
return ((net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator)(((java.util.concurrent.BlockingQueue)(this.d)).take()));
}


public moom.lp a__lp() throws java.lang.InterruptedException {
return ((moom.lp)(((java.util.concurrent.BlockingQueue)(this.e)).take()));
}


public void a(moom.lp p0) {
((java.util.concurrent.BlockingQueue)(this.e)).add(((java.lang.Object)(p0)));
    return;
}


public boolean a__Boolean() { return __sourceHandlerCall_858e45393e2235da4987(this); }


public void a__Void() { __sourceHandlerCall_c1564ea1f32bc571dc1c(this); }


private void a(moom.lw p0, moom.oC p1) {
((moom.lA)(this.g)).a(((moom.oC)(p1)));
    ((moom.lA)(this.g)).a(((moom.lw)(p0)));
    return;
}


private void lambda$updateChunkLater$0(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p0) {
((java.util.concurrent.BlockingQueue)(this.d)).remove(((java.lang.Object)(p0)));
    return;
}


private void lambda$updateTransparencyLater$1(net.minecraft.client.renderer.chunk.ChunkCompileTaskGenerator p0) {
((java.util.concurrent.BlockingQueue)(this.d)).remove(((java.lang.Object)(p0)));
    return;
}


private void lambda$uploadChunk$2(net.minecraft.util.EnumWorldBlockLayer p0, moom.lw p1, moom.mp p2, net.minecraft.client.renderer.chunk.CompiledChunk p3) {
((moom.mi)(this)).a(((net.minecraft.util.EnumWorldBlockLayer)(p0)), ((moom.lw)(p1)), ((moom.mp)(p2)), ((net.minecraft.client.renderer.chunk.CompiledChunk)(p3)));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral8428_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_76a2b8e5da42_originalDynamicSite703_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral8422_0() throws E;
}
