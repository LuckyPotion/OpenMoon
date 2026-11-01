package net.minecraft.world.gen;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ChunkProviderServer implements moom.Fn {

private static org.apache.logging.log4j.Logger a;

private java.util.Set<java.lang.Long> b;

private net.minecraft.world.chunk.Chunk c;

private moom.Fn d;

private net.minecraft.world.chunk.storage.IChunkLoader e;

public boolean f;

private moom.Do<net.minecraft.world.chunk.Chunk> g;

private java.util.List<net.minecraft.world.chunk.Chunk> h;

private net.minecraft.world.WorldServer i;

private static long j;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public ChunkProviderServer(net.minecraft.world.WorldServer p0, net.minecraft.world.chunk.storage.IChunkLoader p1, moom.Fn p2) {
super();
    this.b = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    this.f = true;
    this.g = new moom.Do();
    this.h = com.google.common.collect.Lists.newArrayList();
    this.c = new moom.Fl(p0, 0, 0);
    this.i = p0;
    this.e = p1;
    this.d = p2;
}


static {
j = ((long)(((moom._a)(moom._c.a(((long)(-891164478729044695L)), ((long)(-3143784407651818495L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(177023244601290L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.world.gen.ChunkProviderServer.j ^ 79681932551155L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1219_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1219_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1219_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1219_14 = new byte[8];
    (__sourceSpill1219_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1219_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1219_16 = __sourceSpill1219_14;
    ((javax.crypto.Cipher)(__sourceSpill1219_11)).init(((int)(__sourceSpill1219_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1219_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1219_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "¤\032u¸È1\007HÃç^I"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1219_25 = local6_life21;
        int __sourceSpill1219_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1219_25)).substring(((int)(__sourceSpill1219_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1219_30 = local8_life19;
        int __sourceSpill1219_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1219_33 = new byte[8];
        (__sourceSpill1219_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1219_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1219_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1219_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1219_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1219_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1219_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1219_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1219_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1219_34)).doFinal(((byte[])(__sourceSpill1219_33)));
        (__sourceSpill1219_30)[__sourceSpill1219_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    k = ((long[])(local8_life19));
    l = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> net.minecraft.world.chunk.Chunk __sourceHandlerCall_19b28f04be218e349bb1(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws E;
private static final class __SourceHandler_19b28f04be218e349bb1 {

public static net.minecraft.world.chunk.Chunk f1838(net.minecraft.world.gen.ChunkProviderServer receiver, int p0, int p1) throws Throwable {
    net.minecraft.world.gen.ChunkProviderServer forwardValue1838_31_0;
    net.minecraft.world.chunk.Chunk forwardValue1838_36_0;
    java.lang.String[] spill1838_0;
    net.minecraft.world.gen.ChunkProviderServer spill1838_1;
    net.minecraft.world.gen.ChunkProviderServer spill1838_2;
    long life3_3;
    net.minecraft.world.chunk.Chunk life6_12;
    java.lang.String[] life5_13;
    forward_join_36: {
    forward_join_35: {
    forward_join_31: {
    forward_join_30: {
    life3_3 = (__fieldRead1838_0() ^ 6204108839034L);
    spill1838_0 = __call1838_1();
    life6_12 = __cast1838_5(__call1838_4(__fieldRead1838_2(receiver), __call1838_3(p0, p1)));
    life5_13 = spill1838_0;
    if (!((life6_12 == null))) {
        break forward_join_35;
    }
    spill1838_1 = receiver;
    if (!((life5_13 != null))) {
        forwardValue1838_31_0 = spill1838_1;
        break forward_join_31;
    }
    if (!((!__call1838_7(__fieldRead1838_6(spill1838_1))))) {
        break forward_join_30;
    }
    spill1838_2 = receiver;
    if (!((life5_13 != null))) {
        forwardValue1838_31_0 = spill1838_2;
        break forward_join_31;
    }
    if (!((!__fieldRead1838_8(spill1838_2)))) {
        break forward_join_30;
    }
    forwardValue1838_36_0 = __fieldRead1838_9(receiver);
    break forward_join_36;
    }
    forwardValue1838_31_0 = receiver;
    }
    forwardValue1838_36_0 = __call1838_10(forwardValue1838_31_0, p0, p1);
    break forward_join_36;
    }
    forwardValue1838_36_0 = life6_12;
    }
    return forwardValue1838_36_0;
}
public static void h1838_0(moom.Oo p0) throws Throwable {
    throw __call1183800_0(p0);
}
public static void h1838_1(moom.Oo p0) throws Throwable {
    throw __call1183801_0(p0);
}
public static void h1838_2(moom.Oo p0) throws Throwable {
    throw __call1183802_0(p0);
}
public static void h1838_3(moom.Oo p0) throws Throwable {
    throw __call1183803_0(p0);
}
public static void h1838_4(moom.Oo p0) throws Throwable {
    throw __call1183804_0(p0);
}
private static native long __fieldRead1838_0() throws Throwable;
private static native java.lang.String[] __call1838_1() throws Throwable;
private static native moom.Do __fieldRead1838_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native long __call1838_3(int a0, int a1) throws Throwable;
private static native java.lang.Object __call1838_4(moom.Do a0, long a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast1838_5(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead1838_6(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call1838_7(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __fieldRead1838_8(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __fieldRead1838_9(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1838_10(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1183800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_d5179180e90b82859fa4(net.minecraft.world.gen.ChunkProviderServer a0, moom.Fn a1, int a2, int a3) throws E;
private static final class __SourceHandler_d5179180e90b82859fa4 {

public static void f1839(net.minecraft.world.gen.ChunkProviderServer receiver, moom.Fn p0, int p1, int p2) throws Throwable {
    net.minecraft.world.chunk.Chunk forwardValue1839_17_0;
    moom.Fn forwardValue1839_25_0;
    java.lang.String[] spill1839_0;
    net.minecraft.world.chunk.Chunk spill1839_1;
    moom.Fn spill1839_2;
    long life4_3;
    net.minecraft.world.chunk.Chunk life7_9;
    java.lang.String[] life6_10;
    forward_join_31: {
    forward_join_25: {
    forward_join_17: {
    life4_3 = (__fieldRead1839_0() ^ 5081364348563L);
    spill1839_0 = __call1839_1();
    life7_9 = __call1839_2(receiver, p1, p2);
    life6_10 = spill1839_0;
    spill1839_1 = life7_9;
    if (!((life6_10 != null))) {
        forwardValue1839_17_0 = spill1839_1;
        break forward_join_17;
    }
    if (!((!__call1839_3(spill1839_1)))) {
        break forward_join_31;
    }
    forwardValue1839_17_0 = life7_9;
    }
    __call1839_4(forwardValue1839_17_0);
    spill1839_2 = __fieldRead1839_5(receiver);
    if (!((life6_10 != null))) {
        forwardValue1839_25_0 = spill1839_2;
        break forward_join_25;
    }
    if (!((spill1839_2 != null))) {
        break forward_join_31;
    }
    forwardValue1839_25_0 = __fieldRead1839_6(receiver);
    }
    __call1839_7(forwardValue1839_25_0, p0, p1, p2);
    __call1839_8(life7_9);
    }
    return;
}
public static void h1839_0(moom.Oo p0) throws Throwable {
    throw __call1183900_0(p0);
}
public static void h1839_1(moom.Oo p0) throws Throwable {
    throw __call1183901_0(p0);
}
public static void h1839_2(moom.Oo p0) throws Throwable {
    throw __call1183902_0(p0);
}
public static void h1839_3(moom.Oo p0) throws Throwable {
    throw __call1183903_0(p0);
}
private static native long __fieldRead1839_0() throws Throwable;
private static native java.lang.String[] __call1839_1() throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1839_2(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws Throwable;
private static native boolean __call1839_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1839_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fn __fieldRead1839_5(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native moom.Fn __fieldRead1839_6(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native void __call1839_7(moom.Fn a0, moom.Fn a1, int a2, int a3) throws Throwable;
private static native void __call1839_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Throwable __call1183900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1183903_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_292ad6e8a120579d0487(net.minecraft.world.gen.ChunkProviderServer a0, moom.Fn a1, net.minecraft.world.chunk.Chunk a2, int a3, int a4) throws E;
private static final class __SourceHandler_292ad6e8a120579d0487 {

public static boolean f1840(net.minecraft.world.gen.ChunkProviderServer receiver, moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) throws Throwable {
    moom.Fn forwardValue1840_13_0;
    int forwardValue1840_31_0;
    moom.Fn spill1840_0;
    boolean spill1840_1;
    long life5_3;
    java.lang.String[] life7_5;
    net.minecraft.world.chunk.Chunk life8_34;
    forward_join_31: {
    forward_join_30: {
    forward_join_13: {
    life5_3 = (__fieldRead1840_0() ^ 137062756637645L);
    life7_5 = __call1840_1();
    spill1840_0 = __fieldRead1840_2(receiver);
    if (!((life7_5 != null))) {
        forwardValue1840_13_0 = spill1840_0;
        break forward_join_13;
    }
    if (!((spill1840_0 != null))) {
        break forward_join_30;
    }
    forwardValue1840_13_0 = __fieldRead1840_3(receiver);
    }
    spill1840_1 = __call1840_4(forwardValue1840_13_0, p0, p1, p2, p3);
    if (!((life7_5 != null))) {
        forwardValue1840_31_0 = __integerCategory1840_5(spill1840_1);
        break forward_join_31;
    }
    if (!(spill1840_1)) {
        break forward_join_30;
    }
    life8_34 = __call1840_6(receiver, p2, p3);
    __call1840_7(life8_34);
    return __integerCategory1840_8(1);
    }
    forwardValue1840_31_0 = 0;
    }
    return __integerCategory1840_9(forwardValue1840_31_0);
}
public static void h1840_0(moom.Oo p0) throws Throwable {
    throw __call1184000_0(p0);
}
public static void h1840_1(moom.Oo p0) throws Throwable {
    throw __call1184001_0(p0);
}
public static void h1840_2(moom.Oo p0) throws Throwable {
    throw __call1184002_0(p0);
}
private static native long __fieldRead1840_0() throws Throwable;
private static native java.lang.String[] __call1840_1() throws Throwable;
private static native moom.Fn __fieldRead1840_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native moom.Fn __fieldRead1840_3(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call1840_4(moom.Fn a0, moom.Fn a1, net.minecraft.world.chunk.Chunk a2, int a3, int a4) throws Throwable;
private static native int __integerCategory1840_5(boolean value) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1840_6(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws Throwable;
private static native void __call1840_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __integerCategory1840_8(int value) throws Throwable;
private static native boolean __integerCategory1840_9(int value) throws Throwable;
private static native java.lang.Throwable __call1184000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e7cb4b26c05f5da07178(net.minecraft.world.gen.ChunkProviderServer a0, net.minecraft.world.chunk.Chunk a1) throws E;
private static final class __SourceHandler_e7cb4b26c05f5da07178 {

public static void f276(net.minecraft.world.gen.ChunkProviderServer receiver, net.minecraft.world.chunk.Chunk p0) throws Throwable {
    net.minecraft.world.chunk.storage.IChunkLoader forwardValue276_13_0;
    net.minecraft.world.chunk.storage.IChunkLoader spill276_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_17: {
    forward_join_13: {
    life2_3 = (__fieldRead276_0() ^ 117296978555059L);
    life4_5 = __call276_1();
    spill276_0 = __fieldRead276_2(receiver);
    if (!((life4_5 != null))) {
        forwardValue276_13_0 = spill276_0;
        break forward_join_13;
    }
    if (!((spill276_0 != null))) {
        break forward_join_17;
    }
    forwardValue276_13_0 = __fieldRead276_3(receiver);
    }
    __call276_5(forwardValue276_13_0, __fieldRead276_4(receiver), p0);
    }
    return;
}
public static void h276_0(java.lang.Exception p0) throws Throwable {
    throw __call2027600_0(p0);
}
public static void h276_1(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2027601_1(__fieldRead2027601_0(), "Couldn't save entities", local1);
    return;
}
private static native long __fieldRead276_0() throws Throwable;
private static native java.lang.String[] __call276_1() throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead276_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead276_3(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead276_4(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native void __call276_5(net.minecraft.world.chunk.storage.IChunkLoader a0, net.minecraft.world.WorldServer a1, net.minecraft.world.chunk.Chunk a2) throws Throwable;
private static native java.lang.Throwable __call2027600_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2027601_0() throws Throwable;
private static native void __call2027601_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_3a6ab31f1b0d002d7631(net.minecraft.world.gen.ChunkProviderServer a0, boolean a1, net.minecraft.util.IProgressUpdate a2) throws E;
private static final class __SourceHandler_3a6ab31f1b0d002d7631 {

public static boolean f1841(net.minecraft.world.gen.ChunkProviderServer receiver, boolean p0, net.minecraft.util.IProgressUpdate p1) throws Throwable {
    int lexicalValue1841_35_0;
    int lexicalValue1841_48_0;
    int lexicalValue1841_59_0;
    int lexicalValue1841_64_0;
    java.lang.String[] spill1841_0;
    boolean spill1841_1;
    boolean spill1841_2;
    long life3_3;
    int life6_6;
    java.util.ArrayList life7_10;
    java.lang.String[] life5_11;
    int life8_13;
    net.minecraft.world.chunk.Chunk life9_22;
    lexical_join_64: {
    lexical_join_63: {
    life3_3 = (__fieldRead1841_0() ^ 28248684233430L);
    spill1841_0 = __call1841_1();
    life6_6 = 0;
    life7_10 = __call1841_3(__fieldRead1841_2(receiver));
    life5_11 = spill1841_0;
    life8_13 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_61: {
    lexical_join_60: {
    lexical_join_59: {
    lexical_join_48: {
    lexical_join_35: {
    lexical_join_32: {
    if (!((life8_13 < __call1841_4(life7_10)))) {
        break lexical_join_63;
    }
    life9_22 = __cast1841_6(__call1841_5(life7_10, life8_13));
    spill1841_1 = p0;
    if (!((life5_11 != null))) {
        lexicalValue1841_64_0 = __integerCategory1841_7(spill1841_1);
        break lexical_join_64;
    }
    if (!((life5_11 != null))) {
        lexicalValue1841_35_0 = __integerCategory1841_8(spill1841_1);
        break lexical_join_35;
    }
    if (!(spill1841_1)) {
        break lexical_join_32;
    }
    __call1841_9(receiver, life9_22);
    }
    lexicalValue1841_35_0 = __integerCategory1841_11(__call1841_10(life9_22, p0));
    }
    if (!((life5_11 != null))) {
        lexicalValue1841_48_0 = lexicalValue1841_35_0;
        break lexical_join_48;
    }
    if (!((lexicalValue1841_35_0 != 0))) {
        break lexical_join_60;
    }
    __call1841_12(receiver, life9_22);
    __call1841_13(life9_22, 0);
    life6_6 += 1;
    if (!((life5_11 != null))) {
        break lexical_join_61;
    }
    lexicalValue1841_48_0 = life6_6;
    }
    if (!((lexicalValue1841_48_0 == __invokedynamic1841_14(667, (4511939095481888796L ^ life3_3))))) {
        break lexical_join_60;
    }
    spill1841_2 = p0;
    if (!((life5_11 != null))) {
        lexicalValue1841_59_0 = __integerCategory1841_15(spill1841_2);
        break lexical_join_59;
    }
    if (!((!spill1841_2))) {
        break lexical_join_60;
    }
    lexicalValue1841_59_0 = 0;
    }
    return __integerCategory1841_16(lexicalValue1841_59_0);
    }
    life8_13 += 1;
    }
    if (!((life5_11 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1841_64_0 = 1;
    }
    return __integerCategory1841_17(lexicalValue1841_64_0);
}
public static void h1841_0(moom.Oo p0) throws Throwable {
    throw __call1184100_0(p0);
}
public static void h1841_1(moom.Oo p0) throws Throwable {
    throw __call1184101_0(p0);
}
public static void h1841_2(moom.Oo p0) throws Throwable {
    throw __call1184102_0(p0);
}
public static void h1841_3(moom.Oo p0) throws Throwable {
    throw __call1184103_0(p0);
}
public static void h1841_4(moom.Oo p0) throws Throwable {
    throw __call1184104_0(p0);
}
public static void h1841_5(moom.Oo p0) throws Throwable {
    throw __call1184105_0(p0);
}
public static void h1841_6(moom.Oo p0) throws Throwable {
    throw __call1184106_0(p0);
}
public static void h1841_7(moom.Oo p0) throws Throwable {
    throw __call1184107_0(p0);
}
private static native long __fieldRead1841_0() throws Throwable;
private static native java.lang.String[] __call1841_1() throws Throwable;
private static native java.util.List __fieldRead1841_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native java.util.ArrayList __call1841_3(java.util.List a0) throws Throwable;
private static native int __call1841_4(java.util.ArrayList a0) throws Throwable;
private static native java.lang.Object __call1841_5(java.util.ArrayList a0, int a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast1841_6(java.lang.Object a0) throws Throwable;
private static native int __integerCategory1841_7(boolean value) throws Throwable;
private static native int __integerCategory1841_8(boolean value) throws Throwable;
private static native void __call1841_9(net.minecraft.world.gen.ChunkProviderServer a0, net.minecraft.world.chunk.Chunk a1) throws Throwable;
private static native boolean __call1841_10(net.minecraft.world.chunk.Chunk a0, boolean a1) throws Throwable;
private static native int __integerCategory1841_11(boolean value) throws Throwable;
private static native void __call1841_12(net.minecraft.world.gen.ChunkProviderServer a0, net.minecraft.world.chunk.Chunk a1) throws Throwable;
private static native void __call1841_13(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native int __invokedynamic1841_14(int a0, long a1) throws Throwable;
private static native int __integerCategory1841_15(boolean value) throws Throwable;
private static native boolean __integerCategory1841_16(int value) throws Throwable;
private static native boolean __integerCategory1841_17(int value) throws Throwable;
private static native java.lang.Throwable __call1184100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184107_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f9c8383c250bdbea85c8(net.minecraft.world.gen.ChunkProviderServer a0) throws E;
private static final class __SourceHandler_f9c8383c250bdbea85c8 {

public static boolean f297(net.minecraft.world.gen.ChunkProviderServer receiver) throws Throwable {
    java.lang.Object lexicalValue297_33_0;
    java.lang.Object lexicalValue297_59_0;
    moom.Fn lexicalValue297_83_0;
    int lexicalValue297_84_0;
    boolean spill297_0;
    java.util.Set spill297_1;
    boolean spill297_2;
    net.minecraft.world.chunk.Chunk spill297_3;
    net.minecraft.world.gen.ChunkProviderServer spill297_4;
    long life1_3;
    java.lang.String[] life3_5;
    int life4_16;
    java.lang.Long life5_46;
    net.minecraft.world.chunk.Chunk life6_53;
    lexical_join_84: {
    lexical_join_83: {
    lexical_join_81: {
    lexical_join_73: {
    life1_3 = (__fieldRead297_0() ^ 139908992490581L);
    life3_5 = __call297_1();
    spill297_0 = __fieldRead297_3(__fieldRead297_2(receiver));
    if (!((life3_5 != null))) {
        lexicalValue297_84_0 = __integerCategory297_4(spill297_0);
        break lexical_join_84;
    }
    if (!((!spill297_0))) {
        break lexical_join_81;
    }
    life4_16 = 0;
    lexical_cycle_14: while (true) {
    lexical_join_70: {
    lexical_join_65: {
    lexical_join_59: {
    lexical_join_33: {
    if (!((life4_16 < __invokedynamic297_5(1437, (1889438233590098328L ^ life1_3))))) {
        break lexical_join_73;
    }
    spill297_1 = __fieldRead297_6(receiver);
    if (!((life3_5 != null))) {
        lexicalValue297_33_0 = spill297_1;
        break lexical_join_33;
    }
    spill297_2 = __call297_7(spill297_1);
    if (!((life3_5 != null))) {
        lexicalValue297_84_0 = __integerCategory297_8(spill297_2);
        break lexical_join_84;
    }
    if (!((!spill297_2))) {
        break lexical_join_70;
    }
    lexicalValue297_33_0 = __call297_11(__call297_10(__fieldRead297_9(receiver)));
    }
    life5_46 = __cast297_12(lexicalValue297_33_0);
    life6_53 = __cast297_16(__call297_15(__fieldRead297_13(receiver), __call297_14(life5_46)));
    spill297_3 = life6_53;
    if (!((life3_5 != null))) {
        lexicalValue297_59_0 = spill297_3;
        break lexical_join_59;
    }
    if (!((spill297_3 != null))) {
        break lexical_join_65;
    }
    __call297_17(life6_53);
    __call297_18(receiver, life6_53);
    __call297_19(receiver, life6_53);
    lexicalValue297_59_0 = __call297_22(__fieldRead297_20(receiver), __call297_21(life5_46));
    }
    __discardScalar297_23(lexicalValue297_59_0);
    __call297_25(__fieldRead297_24(receiver), life6_53);
    }
    __call297_27(__fieldRead297_26(receiver), life5_46);
    }
    life4_16 += 1;
    if (!((life3_5 == null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    spill297_4 = receiver;
    if (!((life3_5 != null))) {
        lexicalValue297_83_0 = spill297_4;
        break lexical_join_83;
    }
    if (!((__fieldRead297_28(spill297_4) != null))) {
        break lexical_join_81;
    }
    __call297_30(__fieldRead297_29(receiver));
    }
    lexicalValue297_83_0 = __fieldRead297_31(receiver);
    }
    lexicalValue297_84_0 = __integerCategory297_33(__call297_32(lexicalValue297_83_0));
    }
    return __integerCategory297_34(lexicalValue297_84_0);
}
public static void h297_0(moom.Oo p0) throws Throwable {
    throw __call1029700_0(p0);
}
public static void h297_1(moom.Oo p0) throws Throwable {
    throw __call1029701_0(p0);
}
public static void h297_2(moom.Oo p0) throws Throwable {
    throw __call1029702_0(p0);
}
public static void h297_3(moom.Oo p0) throws Throwable {
    throw __call1029703_0(p0);
}
public static void h297_4(moom.Oo p0) throws Throwable {
    throw __call1029704_0(p0);
}
public static void h297_5(moom.Oo p0) throws Throwable {
    throw __call1029705_0(p0);
}
public static void h297_6(moom.Oo p0) throws Throwable {
    throw __call1029706_0(p0);
}
public static void h297_7(moom.Oo p0) throws Throwable {
    throw __call1029707_0(p0);
}
private static native long __fieldRead297_0() throws Throwable;
private static native java.lang.String[] __call297_1() throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead297_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __fieldRead297_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory297_4(boolean value) throws Throwable;
private static native int __invokedynamic297_5(int a0, long a1) throws Throwable;
private static native java.util.Set __fieldRead297_6(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call297_7(java.util.Set a0) throws Throwable;
private static native int __integerCategory297_8(boolean value) throws Throwable;
private static native java.util.Set __fieldRead297_9(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native java.util.Iterator __call297_10(java.util.Set a0) throws Throwable;
private static native java.lang.Object __call297_11(java.util.Iterator a0) throws Throwable;
private static native java.lang.Long __cast297_12(java.lang.Object a0) throws Throwable;
private static native moom.Do __fieldRead297_13(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native long __call297_14(java.lang.Long a0) throws Throwable;
private static native java.lang.Object __call297_15(moom.Do a0, long a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast297_16(java.lang.Object a0) throws Throwable;
private static native void __call297_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call297_18(net.minecraft.world.gen.ChunkProviderServer a0, net.minecraft.world.chunk.Chunk a1) throws Throwable;
private static native void __call297_19(net.minecraft.world.gen.ChunkProviderServer a0, net.minecraft.world.chunk.Chunk a1) throws Throwable;
private static native moom.Do __fieldRead297_20(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native long __call297_21(java.lang.Long a0) throws Throwable;
private static native java.lang.Object __call297_22(moom.Do a0, long a1) throws Throwable;
private static native void __discardScalar297_23(java.lang.Object a0) throws Throwable;
private static native java.util.List __fieldRead297_24(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call297_25(java.util.List a0, net.minecraft.world.chunk.Chunk a1) throws Throwable;
private static native java.util.Set __fieldRead297_26(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call297_27(java.util.Set a0, java.lang.Long a1) throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead297_28(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead297_29(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native void __call297_30(net.minecraft.world.chunk.storage.IChunkLoader a0) throws Throwable;
private static native moom.Fn __fieldRead297_31(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call297_32(moom.Fn a0) throws Throwable;
private static native int __integerCategory297_33(boolean value) throws Throwable;
private static native boolean __integerCategory297_34(int value) throws Throwable;
private static native java.lang.Throwable __call1029700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029705_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029706_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029707_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_553dd538d27f69e77347(net.minecraft.world.gen.ChunkProviderServer a0) throws E;
private static final class __SourceHandler_553dd538d27f69e77347 {

public static void f1843(net.minecraft.world.gen.ChunkProviderServer receiver) throws Throwable {
    net.minecraft.world.chunk.storage.IChunkLoader forwardValue1843_13_0;
    net.minecraft.world.chunk.storage.IChunkLoader spill1843_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead1843_0() ^ 122618740273226L);
    life3_5 = __call1843_1();
    spill1843_0 = __fieldRead1843_2(receiver);
    if (!((life3_5 != null))) {
        forwardValue1843_13_0 = spill1843_0;
        break forward_join_13;
    }
    if (!((spill1843_0 != null))) {
        break forward_join_14;
    }
    forwardValue1843_13_0 = __fieldRead1843_3(receiver);
    }
    __call1843_4(forwardValue1843_13_0);
    }
    return;
}
public static void h1843_0(moom.Oo p0) throws Throwable {
    throw __call1184300_0(p0);
}
public static void h1843_1(moom.Oo p0) throws Throwable {
    throw __call1184301_0(p0);
}
private static native long __fieldRead1843_0() throws Throwable;
private static native java.lang.String[] __call1843_1() throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead1843_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead1843_3(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native void __call1843_4(net.minecraft.world.chunk.storage.IChunkLoader a0) throws Throwable;
private static native java.lang.Throwable __call1184300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1184301_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c598d280891faa32a25c(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws E;
private static final class __SourceHandler_c598d280891faa32a25c {

public static void f298(net.minecraft.world.gen.ChunkProviderServer receiver, int p0, int p1) throws Throwable {
    int forwardValue298_28_0;
    int forwardValue298_38_0;
    boolean spill298_0;
    boolean spill298_1;
    long life3_3;
    java.lang.String[] life5_5;
    forward_join_39: {
    forward_join_38: {
    forward_join_31: {
    forward_join_28: {
    life3_3 = (__fieldRead298_0() ^ 57749890318077L);
    life5_5 = __call298_1();
    spill298_0 = __call298_4(__fieldRead298_3(__fieldRead298_2(receiver)));
    if (!((life5_5 != null))) {
        forwardValue298_38_0 = __integerCategory298_5(spill298_0);
        break forward_join_38;
    }
    if (!(spill298_0)) {
        break forward_join_31;
    }
    spill298_1 = __call298_7(__fieldRead298_6(receiver), p0, p1);
    if (!((life5_5 != null))) {
        forwardValue298_28_0 = __integerCategory298_8(spill298_1);
        break forward_join_28;
    }
    if (!((!spill298_1))) {
        break forward_join_39;
    }
    forwardValue298_28_0 = __integerCategory298_13(__call298_12(__fieldRead298_9(receiver), __call298_11(__call298_10(p0, p1))));
    }
    __discardScalar298_14(forwardValue298_28_0);
    if (!((life5_5 == null))) {
        break forward_join_39;
    }
    }
    forwardValue298_38_0 = __integerCategory298_19(__call298_18(__fieldRead298_15(receiver), __call298_17(__call298_16(p0, p1))));
    }
    __discardScalar298_20(forwardValue298_38_0);
    }
    return;
}
public static void h298_0(moom.Oo p0) throws Throwable {
    throw __call1029800_0(p0);
}
public static void h298_1(moom.Oo p0) throws Throwable {
    throw __call1029801_0(p0);
}
public static void h298_2(moom.Oo p0) throws Throwable {
    throw __call1029802_0(p0);
}
public static void h298_3(moom.Oo p0) throws Throwable {
    throw __call1029803_0(p0);
}
public static void h298_4(moom.Oo p0) throws Throwable {
    throw __call1029804_0(p0);
}
private static native long __fieldRead298_0() throws Throwable;
private static native java.lang.String[] __call298_1() throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead298_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native moom.EA __fieldRead298_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native boolean __call298_4(moom.EA a0) throws Throwable;
private static native int __integerCategory298_5(boolean value) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead298_6(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call298_7(net.minecraft.world.WorldServer a0, int a1, int a2) throws Throwable;
private static native int __integerCategory298_8(boolean value) throws Throwable;
private static native java.util.Set __fieldRead298_9(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native long __call298_10(int a0, int a1) throws Throwable;
private static native java.lang.Long __call298_11(long a0) throws Throwable;
private static native boolean __call298_12(java.util.Set a0, java.lang.Long a1) throws Throwable;
private static native int __integerCategory298_13(boolean value) throws Throwable;
private static native void __discardScalar298_14(int a0) throws Throwable;
private static native java.util.Set __fieldRead298_15(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native long __call298_16(int a0, int a1) throws Throwable;
private static native java.lang.Long __call298_17(long a0) throws Throwable;
private static native boolean __call298_18(java.util.Set a0, java.lang.Long a1) throws Throwable;
private static native int __integerCategory298_19(boolean value) throws Throwable;
private static native void __discardScalar298_20(int a0) throws Throwable;
private static native java.lang.Throwable __call1029800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.chunk.Chunk __sourceHandlerCall_653112321fe55446b6cc(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws E;
private static final class __SourceHandler_653112321fe55446b6cc {

public static net.minecraft.world.chunk.Chunk f639(net.minecraft.world.gen.ChunkProviderServer receiver, int p0, int p1) throws Throwable {
    moom.Fn forwardValue639_47_0;
    net.minecraft.world.chunk.Chunk forwardValue639_64_0;
    net.minecraft.world.chunk.Chunk forwardValue639_70_0;
    java.lang.String[] spill639_0;
    net.minecraft.world.chunk.Chunk spill639_1;
    net.minecraft.world.chunk.Chunk spill639_2;
    moom.Fn spill639_3;
    long life3_3;
    long life6_7;
    net.minecraft.world.chunk.Chunk life8_20;
    java.lang.String[] life5_21;
    forward_join_70: {
    forward_join_69: {
    forward_join_64: {
    forward_join_51: {
    forward_join_47: {
    forward_join_45: {
    life3_3 = (__fieldRead639_0() ^ 100346906198289L);
    life6_7 = __call639_1(p0, p1);
    __call639_4(__fieldRead639_2(receiver), __call639_3(life6_7));
    spill639_0 = __call639_5();
    life8_20 = __cast639_8(__call639_7(__fieldRead639_6(receiver), life6_7));
    life5_21 = spill639_0;
    spill639_1 = life8_20;
    if (!((life5_21 != null))) {
        forwardValue639_70_0 = spill639_1;
        break forward_join_70;
    }
    if (!((spill639_1 == null))) {
        break forward_join_69;
    }
    life8_20 = __call639_9(receiver, p0, p1);
    spill639_2 = life8_20;
    if (!((life5_21 != null))) {
        forwardValue639_64_0 = spill639_2;
        break forward_join_64;
    }
    if (!((spill639_2 == null))) {
        break forward_join_51;
    }
    spill639_3 = __fieldRead639_10(receiver);
    if (!((life5_21 != null))) {
        forwardValue639_47_0 = spill639_3;
        break forward_join_47;
    }
    if (!((spill639_3 == null))) {
        break forward_join_45;
    }
    life8_20 = __fieldRead639_11(receiver);
    if (!((life5_21 == null))) {
        break forward_join_51;
    }
    }
    forwardValue639_47_0 = __fieldRead639_12(receiver);
    }
    life8_20 = __call639_13(forwardValue639_47_0, p0, p1);
    }
    __call639_15(__fieldRead639_14(receiver), life6_7, life8_20);
    __call639_17(__fieldRead639_16(receiver), life8_20);
    __call639_18(life8_20);
    forwardValue639_64_0 = life8_20;
    }
    __call639_19(forwardValue639_64_0, receiver, receiver, p0, p1);
    }
    forwardValue639_70_0 = life8_20;
    }
    return forwardValue639_70_0;
}
public static net.minecraft.world.chunk.Chunk h639_0(java.lang.Throwable p0) throws Throwable {
    throw __call2063900_0(p0);
}
public static net.minecraft.world.chunk.Chunk h639_1(java.lang.Throwable p0) throws Throwable {
    throw __call2063901_0(p0);
}
public static net.minecraft.world.chunk.Chunk h639_2(java.lang.Throwable p0) throws Throwable {
    throw __call2063902_0(p0);
}
public static net.minecraft.world.chunk.Chunk h639_3(java.lang.Throwable p0) throws Throwable {
    throw __call2063903_0(p0);
}
public static net.minecraft.world.chunk.Chunk h639_4(java.lang.Throwable p0, net.minecraft.world.gen.ChunkProviderServer p1, int p2, int p3, long p4) throws Throwable {
    java.lang.Throwable local6 = p0;
    moom.qY local7 = __call2063904_0(local6, "Exception generating new chunk");
    moom.qZ local8 = __call2063904_1(local7, "Chunk to be generated");
    moom.qZ spill2063904_0 = local8;
    java.lang.String spill2063904_1 = "Location";
    java.lang.String spill2063904_2 = "%d,%d";
    java.lang.Object[] __stackOp2063904_2_0 = new java.lang.Object[2];
    java.lang.Object[] spill2063904_3 = __stackOp2063904_2_0;
    (__stackOp2063904_2_0)[0] = __call2063904_3(p2);
    java.lang.Object[] __stackOp2063904_4_0 = spill2063904_3;
    java.lang.Object[] spill2063904_4 = __stackOp2063904_4_0;
    (__stackOp2063904_4_0)[1] = __call2063904_5(p3);
    __call2063904_7(spill2063904_0, spill2063904_1, __call2063904_6(spill2063904_2, spill2063904_4));
    __call2063904_9(local8, "Position hash", __call2063904_8(p4));
    __call2063904_12(local8, "Generator", __call2063904_11(__fieldRead2063904_10(p1)));
    throw new moom.Oo(local7);
}
private static native long __fieldRead639_0() throws Throwable;
private static native long __call639_1(int a0, int a1) throws Throwable;
private static native java.util.Set __fieldRead639_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native java.lang.Long __call639_3(long a0) throws Throwable;
private static native boolean __call639_4(java.util.Set a0, java.lang.Long a1) throws Throwable;
private static native java.lang.String[] __call639_5() throws Throwable;
private static native moom.Do __fieldRead639_6(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native java.lang.Object __call639_7(moom.Do a0, long a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast639_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call639_9(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws Throwable;
private static native moom.Fn __fieldRead639_10(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __fieldRead639_11(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native moom.Fn __fieldRead639_12(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call639_13(moom.Fn a0, int a1, int a2) throws Throwable;
private static native moom.Do __fieldRead639_14(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native void __call639_15(moom.Do a0, long a1, net.minecraft.world.chunk.Chunk a2) throws Throwable;
private static native java.util.List __fieldRead639_16(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __call639_17(java.util.List a0, net.minecraft.world.chunk.Chunk a1) throws Throwable;
private static native void __call639_18(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call639_19(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.gen.ChunkProviderServer a1, net.minecraft.world.gen.ChunkProviderServer a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call2063900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063903_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2063904_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2063904_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __call2063904_3(int a0) throws Throwable;
private static native java.lang.Integer __call2063904_5(int a0) throws Throwable;
private static native java.lang.String __call2063904_6(java.lang.String a0, java.lang.Object[] a1) throws Throwable;
private static native void __call2063904_7(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Long __call2063904_8(long a0) throws Throwable;
private static native void __call2063904_9(moom.qZ a0, java.lang.String a1, java.lang.Long a2) throws Throwable;
private static native moom.Fn __fieldRead2063904_10(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native java.lang.String __call2063904_11(moom.Fn a0) throws Throwable;
private static native void __call2063904_12(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4bb21da88547eec3a977(net.minecraft.world.gen.ChunkProviderServer a0, net.minecraft.world.chunk.Chunk a1) throws E;
private static final class __SourceHandler_4bb21da88547eec3a977 {

public static void f729(net.minecraft.world.gen.ChunkProviderServer receiver, net.minecraft.world.chunk.Chunk p0) throws Throwable {
    net.minecraft.world.chunk.storage.IChunkLoader forwardValue729_18_0;
    net.minecraft.world.chunk.storage.IChunkLoader spill729_0;
    long life2_3;
    java.lang.String[] life4_5;
    forward_join_22: {
    forward_join_18: {
    life2_3 = (__fieldRead729_0() ^ 33111690177326L);
    life4_5 = __call729_1();
    spill729_0 = __fieldRead729_2(receiver);
    if (!((life4_5 != null))) {
        forwardValue729_18_0 = spill729_0;
        break forward_join_18;
    }
    if (!((spill729_0 != null))) {
        break forward_join_22;
    }
    __call729_5(p0, __call729_4(__fieldRead729_3(receiver)));
    forwardValue729_18_0 = __fieldRead729_6(receiver);
    }
    __call729_8(forwardValue729_18_0, __fieldRead729_7(receiver), p0);
    }
    return;
}
public static void h729_0(java.io.IOException p0) throws Throwable {
    throw __call3072900_0(p0);
}
public static void h729_1(java.io.IOException p0) throws Throwable {
    java.io.IOException life1_2;
    life1_2 = p0;
    __call3072901_1(__fieldRead3072901_0(), "Couldn't save chunk", life1_2);
    return;
}
public static void h729_2(net.minecraft.world.MinecraftException p0) throws Throwable {
    net.minecraft.world.MinecraftException life1_2;
    life1_2 = p0;
    __call3072902_1(__fieldRead3072902_0(), "Couldn't save chunk; already in use by another instance of Minecraft?", life1_2);
    return;
}
private static native long __fieldRead729_0() throws Throwable;
private static native java.lang.String[] __call729_1() throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead729_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead729_3(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native long __call729_4(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call729_5(net.minecraft.world.chunk.Chunk a0, long a1) throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead729_6(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead729_7(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native void __call729_8(net.minecraft.world.chunk.storage.IChunkLoader a0, net.minecraft.world.WorldServer a1, net.minecraft.world.chunk.Chunk a2) throws Throwable;
private static native java.lang.Throwable __call3072900_0(java.io.IOException a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3072901_0() throws Throwable;
private static native void __call3072901_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.io.IOException a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3072902_0() throws Throwable;
private static native void __call3072902_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, net.minecraft.world.MinecraftException a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_613360e8c4a7fe663d26(net.minecraft.world.gen.ChunkProviderServer a0) throws E;
private static final class __SourceHandler_613360e8c4a7fe663d26 {

public static boolean f1845(net.minecraft.world.gen.ChunkProviderServer receiver) throws Throwable {
    int forwardValue1845_13_0;
    int forwardValue1845_15_0;
    boolean spill1845_0;
    long life1_3;
    java.lang.String[] life3_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life1_3 = (__fieldRead1845_0() ^ 121191165696281L);
    life3_5 = __call1845_1();
    spill1845_0 = __fieldRead1845_3(__fieldRead1845_2(receiver));
    if (!((life3_5 != null))) {
        forwardValue1845_13_0 = __integerCategory1845_4(spill1845_0);
        break forward_join_13;
    }
    if (!((!spill1845_0))) {
        break forward_join_14;
    }
    forwardValue1845_13_0 = 1;
    }
    forwardValue1845_15_0 = forwardValue1845_13_0;
    break forward_join_15;
    }
    forwardValue1845_15_0 = 0;
    }
    return __integerCategory1845_5(forwardValue1845_15_0);
}
public static void h1845_0(moom.Oo p0) throws Throwable {
    throw __call1184500_0(p0);
}
private static native long __fieldRead1845_0() throws Throwable;
private static native java.lang.String[] __call1845_1() throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead1845_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native boolean __fieldRead1845_3(net.minecraft.world.WorldServer a0) throws Throwable;
private static native int __integerCategory1845_4(boolean value) throws Throwable;
private static native boolean __integerCategory1845_5(int value) throws Throwable;
private static native java.lang.Throwable __call1184500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.chunk.Chunk __sourceHandlerCall_b7b725123b75adf6ba11(net.minecraft.world.gen.ChunkProviderServer a0, int a1, int a2) throws E;
private static final class __SourceHandler_b7b725123b75adf6ba11 {

public static net.minecraft.world.chunk.Chunk f651(net.minecraft.world.gen.ChunkProviderServer receiver, int p0, int p1) throws Throwable {
    net.minecraft.world.chunk.storage.IChunkLoader forwardValue651_15_0;
    net.minecraft.world.chunk.Chunk forwardValue651_42_0;
    net.minecraft.world.chunk.storage.IChunkLoader spill651_0;
    net.minecraft.world.chunk.Chunk spill651_1;
    net.minecraft.world.chunk.Chunk spill651_2;
    long life3_3;
    java.lang.String[] life5_5;
    net.minecraft.world.chunk.Chunk life6_25;
    forward_join_42: {
    forward_join_41: {
    forward_join_15: {
    forward_join_13: {
    life3_3 = (__fieldRead651_0() ^ 133334845941654L);
    life5_5 = __call651_1();
    spill651_0 = __fieldRead651_2(receiver);
    if (!((life5_5 != null))) {
        forwardValue651_15_0 = spill651_0;
        break forward_join_15;
    }
    if (!((spill651_0 == null))) {
        break forward_join_13;
    }
    return null;
    }
    forwardValue651_15_0 = __fieldRead651_3(receiver);
    }
    life6_25 = __call651_5(forwardValue651_15_0, __fieldRead651_4(receiver), p0, p1);
    spill651_1 = life6_25;
    if (!((life5_5 != null))) {
        forwardValue651_42_0 = spill651_1;
        break forward_join_42;
    }
    if (!((spill651_1 != null))) {
        break forward_join_41;
    }
    spill651_2 = life6_25;
    if (!((life5_5 != null))) {
        forwardValue651_42_0 = spill651_2;
        break forward_join_42;
    }
    __call651_8(spill651_2, __call651_7(__fieldRead651_6(receiver)));
    if (!((__fieldRead651_9(receiver) != null))) {
        break forward_join_41;
    }
    __call651_11(__fieldRead651_10(receiver), life6_25, p0, p1);
    }
    forwardValue651_42_0 = life6_25;
    }
    return forwardValue651_42_0;
}
public static net.minecraft.world.chunk.Chunk h651_0(java.lang.Exception p0) throws Throwable {
    throw __call2065100_0(p0);
}
public static net.minecraft.world.chunk.Chunk h651_1(java.lang.Exception p0) throws Throwable {
    throw __call2065101_0(p0);
}
public static net.minecraft.world.chunk.Chunk h651_2(java.lang.Exception p0) throws Throwable {
    throw __call2065102_0(p0);
}
public static net.minecraft.world.chunk.Chunk h651_3(java.lang.Exception p0) throws Throwable {
    throw __call2065103_0(p0);
}
public static net.minecraft.world.chunk.Chunk h651_4(java.lang.Exception p0) throws Throwable {
    throw __call2065104_0(p0);
}
public static net.minecraft.world.chunk.Chunk h651_5(java.lang.Exception p0) throws Throwable {
    throw __call2065105_0(p0);
}
public static net.minecraft.world.chunk.Chunk h651_6(java.lang.Exception p0) throws Throwable {
    java.lang.Exception local1 = p0;
    __call2065106_1(__fieldRead2065106_0(), "Couldn't load chunk", local1);
    return null;
}
private static native long __fieldRead651_0() throws Throwable;
private static native java.lang.String[] __call651_1() throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead651_2(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.storage.IChunkLoader __fieldRead651_3(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead651_4(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call651_5(net.minecraft.world.chunk.storage.IChunkLoader a0, net.minecraft.world.WorldServer a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.WorldServer __fieldRead651_6(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native long __call651_7(net.minecraft.world.WorldServer a0) throws Throwable;
private static native void __call651_8(net.minecraft.world.chunk.Chunk a0, long a1) throws Throwable;
private static native moom.Fn __fieldRead651_9(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native moom.Fn __fieldRead651_10(net.minecraft.world.gen.ChunkProviderServer a0) throws Throwable;
private static native void __call651_11(moom.Fn a0, net.minecraft.world.chunk.Chunk a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call2065100_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2065101_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2065102_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2065103_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2065104_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Throwable __call2065105_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead2065106_0() throws Throwable;
private static native void __call2065106_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;

}


public boolean b__Boolean() { return __sourceHandlerCall_613360e8c4a7fe663d26(this); }


public net.minecraft.world.chunk.Chunk b(int p0, int p1) { return __sourceHandlerCall_653112321fe55446b6cc(this, p0, p1); }


public void b() {
java.lang.String[] spill1757_0;
    long life1_3;
    java.util.Iterator life4_8;
    java.lang.String[] life3_9;
    net.minecraft.world.chunk.Chunk life5_16;
    lexical_join_25: {
    life1_3 = (net.minecraft.world.gen.ChunkProviderServer.j ^ 123651460268150L);
    spill1757_0 = moom.FI.b();
    life4_8 = ((java.util.List)(this.h)).iterator();
    life3_9 = spill1757_0;
    lexical_cycle_10: while (true) {
    if (!(((java.util.Iterator)(life4_8)).hasNext())) {
        break lexical_join_25;
    }
    life5_16 = ((net.minecraft.world.chunk.Chunk)(((java.util.Iterator)(life4_8)).next()));
    ((net.minecraft.world.gen.ChunkProviderServer)(this)).a__Void(((int)(((net.minecraft.world.chunk.Chunk)(life5_16)).i)), ((int)(((net.minecraft.world.chunk.Chunk)(life5_16)).j)));
    if (!((life3_9 == null))) { continue lexical_cycle_10; }
    break lexical_cycle_10;
    }
    }
    return;
}


private void b(net.minecraft.world.chunk.Chunk p0) { __sourceHandlerCall_4bb21da88547eec3a977(this, p0); }


private net.minecraft.world.chunk.Chunk c(int p0, int p1) { return __sourceHandlerCall_b7b725123b75adf6ba11(this, p0, p1); }


public void a(net.minecraft.world.chunk.Chunk p0, int p1, int p2) {
return;
}


public int a() {
return ((moom.Do)(this.g)).a__Int();
}


public moom.DT a(net.minecraft.world.World p0, java.lang.String p1, moom.DT p2) {
return ((moom.Fn)(this.d)).a(((net.minecraft.world.World)(p0)), ((java.lang.String)(p1)), ((moom.DT)(p2)));
}


public java.util.List<moom.D7> a(net.minecraft.entity.EnumCreatureType p0, moom.DT p1) {
return ((moom.Fn)(this.d)).a(((net.minecraft.entity.EnumCreatureType)(p0)), ((moom.DT)(p1)));
}


public java.lang.String a__String() {
return __sourceIntrinsic_64ccfb84e285_originalDynamicSite2077_4(((moom.Do)(this.g)).a__Int(), ((java.util.Set)(this.b)).size());
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 21867;
      if (l[var3] == null) {
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
         long var5 = k[var3];
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
         Object[] var9 = (Object[])m.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               m.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/FC", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12696_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/FC"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.gen.ChunkProviderServer.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.world.chunk.Chunk a(moom.DT p0) {
return ((net.minecraft.world.gen.ChunkProviderServer)(this)).a(((int)((((moom.DT)(p0)).a() >> 4))), ((int)((((moom.DT)(p0)).c() >> 4))));
}


private void a(net.minecraft.world.chunk.Chunk p0) { __sourceHandlerCall_e7cb4b26c05f5da07178(this, p0); }


public net.minecraft.world.chunk.Chunk a(int p0, int p1) { return __sourceHandlerCall_19b28f04be218e349bb1(this, p0, p1); }


public void a__Void(int p0, int p1) { __sourceHandlerCall_c598d280891faa32a25c(this, p0, p1); }


public java.util.List<net.minecraft.world.chunk.Chunk> a__List() {
return this.h;
}


public boolean a__Boolean(int p0, int p1) {
return (__sourceIntrinsic_booleanComparison((((moom.Do)(this.g)).a__Boolean(((long)(moom.Ee.a(((int)(p0)), ((int)(p1)))))))) != 0);
}


public boolean a__Boolean() { return __sourceHandlerCall_f9c8383c250bdbea85c8(this); }


public void a__Void() { __sourceHandlerCall_553dd538d27f69e77347(this); }


public boolean a(boolean p0, net.minecraft.util.IProgressUpdate p1) { return __sourceHandlerCall_3a6ab31f1b0d002d7631(this, p0, p1); }


public boolean a(moom.Fn p0, net.minecraft.world.chunk.Chunk p1, int p2, int p3) { return __sourceHandlerCall_292ad6e8a120579d0487(this, p0, p1, p2, p3); }


public void a(moom.Fn p0, int p1, int p2) { __sourceHandlerCall_d5179180e90b82859fa4(this, p0, p1, p2); }


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12696_0() throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_64ccfb84e285_originalDynamicSite2077_4(int a0, int a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
