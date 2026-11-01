package net.minecraft.world.chunk.storage;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class AnvilChunkLoader implements net.minecraft.world.chunk.storage.IChunkLoader, net.minecraft.world.storage.IThreadedFileIO {

private static org.apache.logging.log4j.Logger a;

private java.util.Map<moom.Ee, net.minecraft.nbt.NBTTagCompound> b;

private java.util.Set<moom.Ee> c;

private java.io.File d;

private boolean e;

private static long f;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

public AnvilChunkLoader(java.io.File p0) {
super();
    this.b = new java.util.concurrent.ConcurrentHashMap();
    this.c = java.util.Collections.newSetFromMap(new java.util.concurrent.ConcurrentHashMap());
    this.e = false;
    this.d = p0;
}


static {
f = ((long)(((moom._a)(moom._c.a(((long)(-4359316814837237880L)), ((long)(-5534273096964265952L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(145733332122642L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (net.minecraft.world.chunk.storage.AnvilChunkLoader.f ^ 5866788378583L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1947_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1947_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1947_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1947_14 = new byte[8];
    (__sourceSpill1947_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1947_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1947_16 = __sourceSpill1947_14;
    ((javax.crypto.Cipher)(__sourceSpill1947_11)).init(((int)(__sourceSpill1947_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1947_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1947_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[15];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\034\022$&ùRt7\031þVuO¿\020I\032³¥\017Nú\031ò7ä\034wÞ×Ð»\n´\n«ð}ÒÍ$\"\tBÛp°Ýn£'³uª\tfÚmK5ÁÞ84ØWZ!I4µÐHÃW×$\003tî\023ÿTwÃ=ÁÅ6\023\013J"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1947_25 = local6_life21;
        int __sourceSpill1947_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1947_25)).substring(((int)(__sourceSpill1947_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1947_30 = local8_life19;
        int __sourceSpill1947_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1947_33 = new byte[8];
        (__sourceSpill1947_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1947_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1947_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1947_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1947_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1947_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1947_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1947_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1947_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1947_34)).doFinal(((byte[])(__sourceSpill1947_33)));
        (__sourceSpill1947_30)[__sourceSpill1947_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "ð\n(Ax7ÚÔë>N\020Fä"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1947_38 = local6_life21;
        int __sourceSpill1947_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1947_38)).substring(((int)(__sourceSpill1947_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1947_43 = local8_life19;
        int __sourceSpill1947_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill1947_46 = new byte[8];
        (__sourceSpill1947_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill1947_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill1947_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill1947_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill1947_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill1947_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill1947_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill1947_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill1947_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill1947_47)).doFinal(((byte[])(__sourceSpill1947_46)));
        (__sourceSpill1947_43)[__sourceSpill1947_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    g = ((long[])(local8_life19));
    h = ((java.lang.Integer[])(new java.lang.Integer[15]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_5d0e0c09e4b309e94883(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, moom.Ee a1, net.minecraft.nbt.NBTTagCompound a2) throws E;
private static final class __SourceHandler_5d0e0c09e4b309e94883 {

public static void f3194(net.minecraft.world.chunk.storage.AnvilChunkLoader receiver, moom.Ee p0, net.minecraft.nbt.NBTTagCompound p1) throws Throwable {
    long life3_3;
    int life5_5;
    life3_3 = (__fieldRead3194_0() ^ 69771125827081L);
    life5_5 = __call3194_1();
    if ((life5_5 != 0)) {
        if ((!__call3194_3(__fieldRead3194_2(receiver), p0))) {
        __call3194_5(__fieldRead3194_4(receiver), p0, p1);
    }
        __call3194_7(__call3194_6(), receiver);
    }
    return;
}
public static void h3194_0(moom.Oo p0) throws Throwable {
    throw __call1319400_0(p0);
}
public static void h3194_1(moom.Oo p0) throws Throwable {
    throw __call1319401_0(p0);
}
private static native long __fieldRead3194_0() throws Throwable;
private static native int __call3194_1() throws Throwable;
private static native java.util.Set __fieldRead3194_2(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native boolean __call3194_3(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native java.util.Map __fieldRead3194_4(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native java.lang.Object __call3194_5(java.util.Map a0, moom.Ee a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native moom.IW __call3194_6() throws Throwable;
private static native void __call3194_7(moom.IW a0, net.minecraft.world.chunk.storage.AnvilChunkLoader a1) throws Throwable;
private static native java.lang.Exception __call1319400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1319401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.chunk.Chunk __sourceHandlerCall_4457575aecded6f04956(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, net.minecraft.world.World a1, int a2, int a3) throws E;
private static final class __SourceHandler_4457575aecded6f04956 {

public static net.minecraft.world.chunk.Chunk f1830(net.minecraft.world.chunk.storage.AnvilChunkLoader receiver, net.minecraft.world.World p0, int p1, int p2) throws Throwable {
    java.io.DataInputStream forwardValue1830_33_0;
    int spill1830_0;
    java.io.DataInputStream spill1830_1;
    long life4_3;
    moom.Ee life7_10;
    net.minecraft.nbt.NBTTagCompound life8_16;
    int life6_17;
    java.io.DataInputStream life9_25;
    forward_join_35: {
    forward_join_33: {
    forward_join_32: {
    life4_3 = (__fieldRead1830_0() ^ 66239448524079L);
    spill1830_0 = __call1830_1();
    life7_10 = new moom.Ee(p1, p2);
    life8_16 = __cast1830_4(__call1830_3(__fieldRead1830_2(receiver), life7_10));
    life6_17 = spill1830_0;
    if (!((life8_16 == null))) {
        break forward_join_35;
    }
    life9_25 = __call1830_6(__fieldRead1830_5(receiver), p1, p2);
    spill1830_1 = life9_25;
    if (!((life6_17 == 0))) {
        forwardValue1830_33_0 = spill1830_1;
        break forward_join_33;
    }
    if (!((spill1830_1 == null))) {
        break forward_join_32;
    }
    return null;
    }
    forwardValue1830_33_0 = life9_25;
    }
    life8_16 = __call1830_7(forwardValue1830_33_0);
    }
    return __call1830_8(receiver, p0, p1, p2, life8_16);
}
public static void h1830_0(java.io.IOException p0) throws Throwable {
    throw __call1183000_0(p0);
}
public static void h1830_1(java.io.IOException p0) throws Throwable {
    throw __call1183001_0(p0);
}
private static native long __fieldRead1830_0() throws Throwable;
private static native int __call1830_1() throws Throwable;
private static native java.util.Map __fieldRead1830_2(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native java.lang.Object __call1830_3(java.util.Map a0, moom.Ee a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast1830_4(java.lang.Object a0) throws Throwable;
private static native java.io.File __fieldRead1830_5(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native java.io.DataInputStream __call1830_6(java.io.File a0, int a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1830_7(java.io.DataInputStream a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1830_8(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, net.minecraft.world.World a1, int a2, int a3, net.minecraft.nbt.NBTTagCompound a4) throws Throwable;
private static native java.lang.Exception __call1183000_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1183001_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.chunk.Chunk __sourceHandlerCall_b50f34d72cf104939291(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, net.minecraft.world.World a1, int a2, int a3, net.minecraft.nbt.NBTTagCompound a4) throws E;
private static final class __SourceHandler_b50f34d72cf104939291 {

public static net.minecraft.world.chunk.Chunk f1831(net.minecraft.world.chunk.storage.AnvilChunkLoader receiver, net.minecraft.world.World p0, int p1, int p2, net.minecraft.nbt.NBTTagCompound p3) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forwardValue1831_26_0;
    java.lang.String forwardValue1831_26_1;
    net.minecraft.world.chunk.Chunk forwardValue1831_83_0;
    net.minecraft.nbt.NBTTagCompound spill1831_0;
    java.lang.String spill1831_1;
    net.minecraft.world.chunk.Chunk spill1831_2;
    long life5_3;
    int life7_5;
    net.minecraft.nbt.NBTTagCompound life8_32;
    net.minecraft.world.chunk.Chunk life9_61;
    forward_join_83: {
    forward_join_82: {
    forward_join_46: {
    forward_join_44: {
    forward_join_26: {
    forward_join_24: {
    life5_3 = (__fieldRead1831_0() ^ 5755508682831L);
    life7_5 = __call1831_1();
    spill1831_0 = p3;
    spill1831_1 = "Level";
    if (!((life7_5 == 0))) {
        forwardValue1831_26_0 = spill1831_0;
        forwardValue1831_26_1 = spill1831_1;
        break forward_join_26;
    }
    if (!((!__call1831_3(spill1831_0, spill1831_1, __invokedynamic1831_2(14426, (8814092922239098775L ^ life5_3)))))) {
        break forward_join_24;
    }
    __call1831_6(__fieldRead1831_4(), __invokedynamic1831_5(p1, p2));
    return null;
    }
    forwardValue1831_26_0 = p3;
    forwardValue1831_26_1 = "Level";
    }
    life8_32 = __call1831_7(forwardValue1831_26_0, forwardValue1831_26_1);
    if (!((life7_5 == 0))) {
        break forward_join_44;
    }
    if (!((!__call1831_9(life8_32, "Sections", __invokedynamic1831_8(15188, (8585365036112649374L ^ life5_3)))))) {
        break forward_join_46;
    }
    __call1831_12(__fieldRead1831_10(), __invokedynamic1831_11(p1, p2));
    }
    return null;
    }
    life9_61 = __call1831_13(receiver, p0, life8_32);
    spill1831_2 = life9_61;
    if (!((life7_5 == 0))) {
        forwardValue1831_83_0 = spill1831_2;
        break forward_join_83;
    }
    if (!((!__call1831_14(spill1831_2, p1, p2)))) {
        break forward_join_82;
    }
    __call1831_19(__fieldRead1831_15(), __invokedynamic1831_18(p1, p2, p1, p2, __fieldRead1831_16(life9_61), __fieldRead1831_17(life9_61)));
    __call1831_20(life8_32, "xPos", p1);
    __call1831_21(life8_32, "zPos", p2);
    life9_61 = __call1831_22(receiver, p0, life8_32);
    }
    forwardValue1831_83_0 = life9_61;
    }
    return forwardValue1831_83_0;
}
public static void h1831_0(moom.Oo p0) throws Throwable {
    throw __call1183100_0(p0);
}
public static void h1831_1(moom.Oo p0) throws Throwable {
    throw __call1183101_0(p0);
}
public static void h1831_2(moom.Oo p0) throws Throwable {
    throw __call1183102_0(p0);
}
public static void h1831_3(moom.Oo p0) throws Throwable {
    throw __call1183103_0(p0);
}
public static void h1831_4(moom.Oo p0) throws Throwable {
    throw __call1183104_0(p0);
}
private static native long __fieldRead1831_0() throws Throwable;
private static native int __call1831_1() throws Throwable;
private static native int __invokedynamic1831_2(int a0, long a1) throws Throwable;
private static native boolean __call1831_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1831_4() throws Throwable;
private static native java.lang.String __invokedynamic1831_5(int a0, int a1) throws Throwable;
private static native void __call1831_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1831_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1831_8(int a0, long a1) throws Throwable;
private static native boolean __call1831_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1831_10() throws Throwable;
private static native java.lang.String __invokedynamic1831_11(int a0, int a1) throws Throwable;
private static native void __call1831_12(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1831_13(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, net.minecraft.world.World a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native boolean __call1831_14(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1831_15() throws Throwable;
private static native int __fieldRead1831_16(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1831_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.String __invokedynamic1831_18(int a0, int a1, int a2, int a3, int a4, int a5) throws Throwable;
private static native void __call1831_19(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native void __call1831_20(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call1831_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1831_22(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, net.minecraft.world.World a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.lang.Exception __call1183100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call1183104_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.chunk.Chunk __sourceHandlerCall_9a3fbce0d4e8f3ec0e14(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, net.minecraft.world.World a1, net.minecraft.nbt.NBTTagCompound a2) throws E;
private static final class __SourceHandler_9a3fbce0d4e8f3ec0e14 {

public static net.minecraft.world.chunk.Chunk f1174(net.minecraft.world.chunk.storage.AnvilChunkLoader receiver, net.minecraft.world.World p0, net.minecraft.nbt.NBTTagCompound p1) throws Throwable {
    int forestValue1174_66_0;
    int forestValue1174_68_0;
    moom.Fo forestValue1174_101_0;
    moom.Fo forestValue1174_121_0;
    moom.Fo forestValue1174_171_0;
    int forestValue1174_177_0;
    int forestValue1174_255_0;
    net.minecraft.nbt.NBTTagCompound forestValue1174_268_0;
    java.lang.String forestValue1174_268_1;
    int forestValue1174_268_2;
    net.minecraft.entity.Entity forestValue1174_296_0;
    net.minecraft.entity.Entity forestValue1174_332_0;
    net.minecraft.nbt.NBTTagCompound forestValue1174_343_0;
    net.minecraft.nbt.NBTTagList forestValue1174_350_0;
    net.minecraft.nbt.NBTTagCompound forestValue1174_396_0;
    java.lang.String forestValue1174_396_1;
    int forestValue1174_396_2;
    int forestValue1174_431_0;
    int spill1174_0;
    boolean spill1174_1;
    boolean spill1174_2;
    moom.Fo spill1174_3;
    net.minecraft.nbt.NBTTagCompound spill1174_4;
    java.lang.String spill1174_5;
    int spill1174_6;
    net.minecraft.nbt.NBTTagList spill1174_7;
    net.minecraft.nbt.NBTTagCompound spill1174_8;
    net.minecraft.entity.Entity spill1174_9;
    net.minecraft.nbt.NBTTagCompound spill1174_10;
    java.lang.String spill1174_11;
    int spill1174_12;
    boolean spill1174_13;
    long life3_3;
    int life6_7;
    int life7_12;
    int life5_13;
    net.minecraft.world.chunk.Chunk life8_20;
    net.minecraft.nbt.NBTTagList life9_49;
    int life10_55;
    moom.Fs[] life11_58;
    int life12_69;
    int life13_71;
    net.minecraft.nbt.NBTTagCompound life14_79;
    int life15_83;
    moom.Fs life16_91;
    byte[] life17_95;
    moom.Fo life18_102;
    moom.Fo life19_122;
    char[] life20_126;
    int life21_128;
    int life22_140;
    int life23_154;
    int life24_164;
    int life25_179;
    net.minecraft.nbt.NBTTagList life13_275;
    int life14_282;
    net.minecraft.nbt.NBTTagCompound life15_290;
    net.minecraft.entity.Entity life16_296;
    net.minecraft.entity.Entity life17_309;
    net.minecraft.nbt.NBTTagCompound life18_311;
    net.minecraft.entity.Entity life19_326;
    net.minecraft.nbt.NBTTagList life14_360;
    int life15_364;
    net.minecraft.nbt.NBTTagCompound life16_372;
    net.minecraft.tileentity.TileEntity life17_375;
    net.minecraft.nbt.NBTTagList life15_412;
    int life16_416;
    net.minecraft.nbt.NBTTagCompound life17_424;
    net.minecraft.block.Block life18_441;
    forest_join_457: {
    forest_join_396: {
    forest_join_378: {
    forest_join_350: {
    forest_join_343: {
    forest_join_342: {
    forest_join_268: {
    forest_join_261: {
    forest_join_255: {
    forest_join_242: {
    forest_join_68: {
    forest_join_67: {
    forest_join_66: {
    life3_3 = (__fieldRead1174_0() ^ 139407232402034L);
    life6_7 = __call1174_1(p1, "xPos");
    spill1174_0 = __call1174_2();
    life7_12 = __call1174_3(p1, "zPos");
    life5_13 = spill1174_0;
    life8_20 = new net.minecraft.world.chunk.Chunk(p0, life6_7, life7_12);
    __call1174_5(life8_20, __call1174_4(p1, "HeightMap"));
    __call1174_7(life8_20, __call1174_6(p1, "TerrainPopulated"));
    __call1174_9(life8_20, __call1174_8(p1, "LightPopulated"));
    __call1174_11(life8_20, __call1174_10(p1, "InhabitedTime"));
    life9_49 = __call1174_13(p1, "Sections", __invokedynamic1174_12(32576, (8178020697119500988L ^ life3_3)));
    life10_55 = __invokedynamic1174_14(22752, (5172078969146477851L ^ life3_3));
    life11_58 = new moom.Fs[life10_55];
    spill1174_1 = __call1174_16(__fieldRead1174_15(p0));
    if (!((life5_13 == 0))) {
        forestValue1174_66_0 = __integerCategory1174_17(spill1174_1);
        break forest_join_66;
    }
    if (!((!spill1174_1))) {
        break forest_join_67;
    }
    forestValue1174_66_0 = 1;
    }
    forestValue1174_68_0 = forestValue1174_66_0;
    break forest_join_68;
    }
    forestValue1174_68_0 = 0;
    }
    life12_69 = forestValue1174_68_0;
    life13_71 = 0;
    forest_cycle_71: while (true) {
    forest_join_240: {
    forest_join_233: {
    forest_join_210: {
    if (!((life13_71 < __call1174_18(life9_49)))) {
        break forest_join_242;
    }
    life14_79 = __call1174_19(life9_49, life13_71);
    life15_83 = __call1174_20(life14_79, "Y");
    life16_91 = new moom.Fs((life15_83 << 4), __integerCategory1174_21(life12_69));
    life17_95 = __call1174_22(life14_79, "Blocks");
    forestValue1174_101_0 = new moom.Fo(__call1174_23(life14_79, "Data"));
    forest_cycle_101: while (true) {
    forest_join_121: {
    forest_join_120: {
    life18_102 = forestValue1174_101_0;
    spill1174_2 = __call1174_25(life14_79, "Add", __invokedynamic1174_24(15477, (1889272229393918344L ^ life3_3)));
    if (!((life5_13 == 0))) {
        forestValue1174_255_0 = __integerCategory1174_26(spill1174_2);
        break forest_join_255;
    }
    if (!(spill1174_2)) {
        break forest_join_120;
    }
    forestValue1174_121_0 = new moom.Fo(__call1174_27(life14_79, "Add"));
    break forest_join_121;
    }
    forestValue1174_121_0 = null;
    }
    life19_122 = forestValue1174_121_0;
    life20_126 = new char[(life17_95).length];
    life21_128 = 0;
    forest_cycle_128: while (true) {
    forest_join_177: {
    forest_join_176: {
    forest_join_171: {
    if (!((life21_128 < (life20_126).length))) {
        break forest_join_210;
    }
    life22_140 = (life21_128 & __invokedynamic1174_28(18847, (6631213335456554087L ^ life3_3)));
    life23_154 = ((life21_128 >> __invokedynamic1174_29(27018, (7750060285960174709L ^ life3_3))) & __invokedynamic1174_30(24068, (1632333034842033150L ^ life3_3)));
    life24_164 = ((life21_128 >> 4) & __invokedynamic1174_31(24068, (1632333034842033150L ^ life3_3)));
    spill1174_3 = life19_122;
    if (!((life5_13 == 0))) {
        forestValue1174_101_0 = spill1174_3;
        continue forest_cycle_101;
    }
    if (!((life5_13 == 0))) {
        forestValue1174_171_0 = spill1174_3;
        break forest_join_171;
    }
    if (!((spill1174_3 != null))) {
        break forest_join_176;
    }
    forestValue1174_171_0 = life19_122;
    }
    forestValue1174_177_0 = __call1174_32(forestValue1174_171_0, life22_140, life23_154, life24_164);
    break forest_join_177;
    }
    forestValue1174_177_0 = 0;
    }
    life25_179 = forestValue1174_177_0;
    (life20_126)[life21_128] = ((char) (((life25_179 << __invokedynamic1174_33(16574, (1516700362232239437L ^ life3_3))) | (((life17_95)[life21_128] & __invokedynamic1174_34(20862, (3877174654386635919L ^ life3_3))) << 4)) | __call1174_35(life18_102, life22_140, life23_154, life24_164)));
    life21_128 += 1;
    if (!((life5_13 != 0))) {
        continue forest_cycle_128;
    }
    break forest_cycle_128;
    }
    break forest_cycle_101;
    }
    }
    __call1174_36(life16_91, life20_126);
    __call1174_38(life16_91, new moom.Fo(__call1174_37(life14_79, "BlockLight")));
    if (!((life5_13 == 0))) {
        break forest_join_240;
    }
    if (!((life12_69 != 0))) {
        break forest_join_233;
    }
    __call1174_40(life16_91, new moom.Fo(__call1174_39(life14_79, "SkyLight")));
    }
    __call1174_41(life16_91);
    (life11_58)[life15_83] = life16_91;
    life13_71 += 1;
    }
    if (!((life5_13 != 0))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    }
    __call1174_42(life8_20, life11_58);
    spill1174_4 = p1;
    spill1174_5 = "Biomes";
    spill1174_6 = __invokedynamic1174_43(27304, (6962705773225656156L ^ life3_3));
    if (!((life5_13 == 0))) {
        forestValue1174_268_0 = spill1174_4;
        forestValue1174_268_1 = spill1174_5;
        forestValue1174_268_2 = spill1174_6;
        break forest_join_268;
    }
    forestValue1174_255_0 = __integerCategory1174_45(__call1174_44(spill1174_4, spill1174_5, spill1174_6));
    }
    if (!((forestValue1174_255_0 != 0))) {
        break forest_join_261;
    }
    __call1174_47(life8_20, __call1174_46(p1, "Biomes"));
    }
    forestValue1174_268_0 = p1;
    forestValue1174_268_1 = "Entities";
    forestValue1174_268_2 = __invokedynamic1174_48(14426, (8813976742156135850L ^ life3_3));
    }
    life13_275 = __call1174_49(forestValue1174_268_0, forestValue1174_268_1, forestValue1174_268_2);
    spill1174_7 = life13_275;
    if (!((life5_13 == 0))) {
        forestValue1174_350_0 = spill1174_7;
        break forest_join_350;
    }
    if (!((spill1174_7 != null))) {
        break forest_join_342;
    }
    life14_282 = 0;
    forest_cycle_276: while (true) {
    forest_join_340: {
    forest_join_339: {
    if (!((life14_282 < __call1174_50(life13_275)))) {
        break forest_join_342;
    }
    life15_290 = __call1174_51(life13_275, life14_282);
    spill1174_8 = life15_290;
    if (!((life5_13 == 0))) {
        forestValue1174_343_0 = spill1174_8;
        break forest_join_343;
    }
    life16_296 = __call1174_52(spill1174_8, p0);
    __call1174_53(life8_20, 1);
    if (!((life5_13 == 0))) {
        break forest_join_340;
    }
    forestValue1174_296_0 = life16_296;
    forest_cycle_296: while (true) {
    if (!((forestValue1174_296_0 != null))) {
        break forest_join_339;
    }
    __call1174_54(life8_20, life16_296);
    life17_309 = life16_296;
    life18_311 = life15_290;
    forest_cycle_304: while (true) {
    forest_join_332: {
    forest_join_331: {
    if (!(__call1174_56(life18_311, "Riding", __invokedynamic1174_55(14426, (8813976742156135850L ^ life3_3))))) {
        break forest_join_339;
    }
    life19_326 = __call1174_58(__call1174_57(life18_311, "Riding"), p0);
    spill1174_9 = life19_326;
    if (!((life5_13 == 0))) {
        forestValue1174_296_0 = spill1174_9;
        continue forest_cycle_296;
    }
    if (!((life5_13 == 0))) {
        forestValue1174_332_0 = spill1174_9;
        break forest_join_332;
    }
    if (!((spill1174_9 != null))) {
        break forest_join_331;
    }
    __call1174_59(life8_20, life19_326);
    __call1174_60(life17_309, life19_326);
    }
    forestValue1174_332_0 = life19_326;
    }
    life17_309 = forestValue1174_332_0;
    life18_311 = __call1174_61(life18_311, "Riding");
    if (!((life5_13 != 0))) {
        continue forest_cycle_304;
    }
    break forest_cycle_304;
    }
    break forest_cycle_296;
    }
    }
    life14_282 += 1;
    }
    if (!((life5_13 != 0))) {
        continue forest_cycle_276;
    }
    break forest_cycle_276;
    }
    }
    forestValue1174_343_0 = p1;
    }
    forestValue1174_350_0 = __call1174_63(forestValue1174_343_0, "TileEntities", __invokedynamic1174_62(14426, (8813976742156135850L ^ life3_3)));
    }
    life14_360 = forestValue1174_350_0;
    if (!((life14_360 != null))) {
        break forest_join_378;
    }
    life15_364 = 0;
    forest_cycle_355: while (true) {
    forest_join_376: {
    forest_join_375: {
    if (!((life15_364 < __call1174_64(life14_360)))) {
        break forest_join_378;
    }
    life16_372 = __call1174_65(life14_360, life15_364);
    life17_375 = __call1174_66(life16_372);
    if (!((life5_13 == 0))) {
        break forest_join_457;
    }
    if (!((life5_13 == 0))) {
        break forest_join_376;
    }
    if (!((life17_375 != null))) {
        break forest_join_375;
    }
    __call1174_67(life8_20, life17_375);
    }
    life15_364 += 1;
    }
    if (!((life5_13 != 0))) {
        continue forest_cycle_355;
    }
    break forest_cycle_355;
    }
    }
    spill1174_10 = p1;
    spill1174_11 = "TileTicks";
    spill1174_12 = __invokedynamic1174_68(305, (3589235726396413127L ^ life3_3));
    if (!((life5_13 == 0))) {
        forestValue1174_396_0 = spill1174_10;
        forestValue1174_396_1 = spill1174_11;
        forestValue1174_396_2 = spill1174_12;
        break forest_join_396;
    }
    if (!(__call1174_69(spill1174_10, spill1174_11, spill1174_12))) {
        break forest_join_457;
    }
    forestValue1174_396_0 = p1;
    forestValue1174_396_1 = "TileTicks";
    forestValue1174_396_2 = __invokedynamic1174_70(14426, (8813976742156135850L ^ life3_3));
    }
    life15_412 = __call1174_71(forestValue1174_396_0, forestValue1174_396_1, forestValue1174_396_2);
    if (!((life15_412 != null))) {
        break forest_join_457;
    }
    life16_416 = 0;
    forest_cycle_402: while (true) {
    forest_join_433: {
    forest_join_431: {
    forest_join_428: {
    if (!((life16_416 < __call1174_72(life15_412)))) {
        break forest_join_457;
    }
    life17_424 = __call1174_73(life15_412, life16_416);
    spill1174_13 = __call1174_75(life17_424, "i", __invokedynamic1174_74(29683, (4691363209412388358L ^ life3_3)));
    if (!((life5_13 == 0))) {
        forestValue1174_431_0 = __integerCategory1174_76(spill1174_13);
        break forest_join_431;
    }
    if (!(spill1174_13)) {
        break forest_join_428;
    }
    life18_441 = __call1174_78(__call1174_77(life17_424, "i"));
    if (!((life5_13 != 0))) {
        break forest_join_433;
    }
    }
    forestValue1174_431_0 = __call1174_79(life17_424, "i");
    }
    life18_441 = __call1174_80(forestValue1174_431_0);
    }
    __call1174_86(p0, new moom.DT(__call1174_81(life17_424, "x"), __call1174_82(life17_424, "y"), __call1174_83(life17_424, "z")), life18_441, __call1174_84(life17_424, "t"), __call1174_85(life17_424, "p"));
    life16_416 += 1;
    if (!((life5_13 != 0))) {
        continue forest_cycle_402;
    }
    break forest_cycle_402;
    }
    }
    return life8_20;
}
public static net.minecraft.world.chunk.Chunk h1174_0(moom.Oo p0) throws Throwable {
    throw __call3117400_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_1(moom.Oo p0) throws Throwable {
    throw __call3117401_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_2(moom.Oo p0) throws Throwable {
    throw __call3117402_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_3(moom.Oo p0) throws Throwable {
    throw __call3117403_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_4(moom.Oo p0) throws Throwable {
    throw __call3117404_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_5(moom.Oo p0) throws Throwable {
    throw __call3117405_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_6(moom.Oo p0) throws Throwable {
    throw __call3117406_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_7(moom.Oo p0) throws Throwable {
    throw __call3117407_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_8(moom.Oo p0) throws Throwable {
    throw __call3117408_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_9(moom.Oo p0) throws Throwable {
    throw __call3117409_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_10(moom.Oo p0) throws Throwable {
    throw __call3117410_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_11(moom.Oo p0) throws Throwable {
    throw __call3117411_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_12(moom.Oo p0) throws Throwable {
    throw __call3117412_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_13(moom.Oo p0) throws Throwable {
    throw __call3117413_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_14(moom.Oo p0) throws Throwable {
    throw __call3117414_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_15(moom.Oo p0) throws Throwable {
    throw __call3117415_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_16(moom.Oo p0) throws Throwable {
    throw __call3117416_0(p0);
}
public static net.minecraft.world.chunk.Chunk h1174_17(moom.Oo p0) throws Throwable {
    throw __call3117417_0(p0);
}
private static native long __fieldRead1174_0() throws Throwable;
private static native int __call1174_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call1174_2() throws Throwable;
private static native int __call1174_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int[] __call1174_4(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_5(net.minecraft.world.chunk.Chunk a0, int[] a1) throws Throwable;
private static native boolean __call1174_6(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_7(net.minecraft.world.chunk.Chunk a0, boolean a1) throws Throwable;
private static native boolean __call1174_8(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_9(net.minecraft.world.chunk.Chunk a0, boolean a1) throws Throwable;
private static native long __call1174_10(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_11(net.minecraft.world.chunk.Chunk a0, long a1) throws Throwable;
private static native int __invokedynamic1174_12(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call1174_13(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic1174_14(int a0, long a1) throws Throwable;
private static native moom.EA __fieldRead1174_15(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1174_16(moom.EA a0) throws Throwable;
private static native int __integerCategory1174_17(boolean value) throws Throwable;
private static native int __call1174_18(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1174_19(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native byte __call1174_20(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory1174_21(int value) throws Throwable;
private static native byte[] __call1174_22(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native byte[] __call1174_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1174_24(int a0, long a1) throws Throwable;
private static native boolean __call1174_25(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1174_26(boolean value) throws Throwable;
private static native byte[] __call1174_27(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1174_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic1174_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic1174_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic1174_31(int a0, long a1) throws Throwable;
private static native int __call1174_32(moom.Fo a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1174_33(int a0, long a1) throws Throwable;
private static native int __invokedynamic1174_34(int a0, long a1) throws Throwable;
private static native int __call1174_35(moom.Fo a0, int a1, int a2, int a3) throws Throwable;
private static native void __call1174_36(moom.Fs a0, char[] a1) throws Throwable;
private static native byte[] __call1174_37(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_38(moom.Fs a0, moom.Fo a1) throws Throwable;
private static native byte[] __call1174_39(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_40(moom.Fs a0, moom.Fo a1) throws Throwable;
private static native void __call1174_41(moom.Fs a0) throws Throwable;
private static native void __call1174_42(net.minecraft.world.chunk.Chunk a0, moom.Fs[] a1) throws Throwable;
private static native int __invokedynamic1174_43(int a0, long a1) throws Throwable;
private static native boolean __call1174_44(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1174_45(boolean value) throws Throwable;
private static native byte[] __call1174_46(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_47(net.minecraft.world.chunk.Chunk a0, byte[] a1) throws Throwable;
private static native int __invokedynamic1174_48(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call1174_49(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1174_50(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1174_51(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native net.minecraft.entity.Entity __call1174_52(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws Throwable;
private static native void __call1174_53(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native void __call1174_54(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __invokedynamic1174_55(int a0, long a1) throws Throwable;
private static native boolean __call1174_56(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1174_57(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.entity.Entity __call1174_58(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.world.World a1) throws Throwable;
private static native void __call1174_59(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native void __call1174_60(net.minecraft.entity.Entity a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1174_61(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic1174_62(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call1174_63(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1174_64(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1174_65(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1174_66(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call1174_67(net.minecraft.world.chunk.Chunk a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __invokedynamic1174_68(int a0, long a1) throws Throwable;
private static native boolean __call1174_69(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __invokedynamic1174_70(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __call1174_71(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __call1174_72(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1174_73(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native int __invokedynamic1174_74(int a0, long a1) throws Throwable;
private static native boolean __call1174_75(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1174_76(boolean value) throws Throwable;
private static native java.lang.String __call1174_77(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call1174_78(java.lang.String a0) throws Throwable;
private static native int __call1174_79(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.block.Block __call1174_80(int a0) throws Throwable;
private static native int __call1174_81(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call1174_82(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call1174_83(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call1174_84(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __call1174_85(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native void __call1174_86(net.minecraft.world.World a0, moom.DT a1, net.minecraft.block.Block a2, int a3, int a4) throws Throwable;
private static native java.lang.Exception __call3117400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117417_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_9bb10920860b7df4c9e6(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, net.minecraft.world.chunk.Chunk a1, net.minecraft.world.World a2, net.minecraft.nbt.NBTTagCompound a3) throws E;
private static final class __SourceHandler_9bb10920860b7df4c9e6 {

public static void f1175(net.minecraft.world.chunk.storage.AnvilChunkLoader receiver, net.minecraft.world.chunk.Chunk p0, net.minecraft.world.World p1, net.minecraft.nbt.NBTTagCompound p2) throws Throwable {
    int forestValue1175_59_0;
    int forestValue1175_61_0;
    moom.Fo forestValue1175_176_0;
    int forestValue1175_242_0;
    net.minecraft.nbt.NBTTagCompound forestValue1175_258_0;
    java.lang.String forestValue1175_258_1;
    byte[] forestValue1175_258_2;
    int forestValue1175_284_0;
    net.minecraft.nbt.NBTTagCompound forestValue1175_408_0;
    java.lang.String forestValue1175_408_1;
    net.minecraft.nbt.NBTTagCompound forestValue1175_409_0;
    java.lang.String forestValue1175_409_1;
    moom.DD forestValue1175_409_2;
    net.minecraft.nbt.NBTTagCompound forestValue1175_410_0;
    java.lang.String forestValue1175_410_1;
    java.lang.String forestValue1175_410_2;
    net.minecraft.nbt.NBTTagCompound forestValue1175_449_0;
    java.lang.String forestValue1175_449_1;
    int spill1175_0;
    boolean spill1175_1;
    int spill1175_2;
    moom.Fo spill1175_3;
    net.minecraft.nbt.NBTTagCompound spill1175_4;
    java.lang.String spill1175_5;
    byte[] spill1175_6;
    boolean spill1175_7;
    net.minecraft.nbt.NBTTagCompound spill1175_8;
    java.lang.String spill1175_9;
    moom.DD spill1175_10;
    long life4_3;
    int life6_34;
    moom.Fs[] life7_47;
    net.minecraft.nbt.NBTTagList life8_51;
    int life9_62;
    moom.Fs[] life10_64;
    int life11_67;
    int life12_69;
    moom.Fs life13_76;
    net.minecraft.nbt.NBTTagCompound life14_88;
    byte[] life15_107;
    moom.Fo life16_111;
    moom.Fo life17_113;
    int life18_115;
    int life19_125;
    int life20_133;
    int life21_147;
    int life22_157;
    net.minecraft.nbt.NBTTagList life10_292;
    int life11_294;
    java.util.Iterator life12_307;
    net.minecraft.entity.Entity life13_314;
    net.minecraft.nbt.NBTTagCompound life14_318;
    net.minecraft.nbt.NBTTagList life11_347;
    java.util.Iterator life12_352;
    net.minecraft.tileentity.TileEntity life13_359;
    net.minecraft.nbt.NBTTagCompound life14_363;
    java.util.List life12_383;
    long life13_388;
    net.minecraft.nbt.NBTTagList life15_392;
    java.util.Iterator life16_395;
    moom.Er life17_402;
    net.minecraft.nbt.NBTTagCompound life18_406;
    moom.DD life19_412;
    forest_join_451: {
    forest_join_449: {
    forest_join_447: {
    forest_join_364: {
    forest_join_360: {
    forest_join_330: {
    forest_join_326: {
    forest_join_277: {
    forest_join_265: {
    forest_join_61: {
    forest_join_60: {
    forest_join_59: {
    life4_3 = (__fieldRead1175_0() ^ 74312911437558L);
    __call1175_1(p2, "V", 1);
    __call1175_3(p2, "xPos", __fieldRead1175_2(p0));
    __call1175_5(p2, "zPos", __fieldRead1175_4(p0));
    __call1175_7(p2, "LastUpdate", __call1175_6(p1));
    __call1175_9(p2, "HeightMap", __call1175_8(p0));
    spill1175_0 = __call1175_10();
    __call1175_12(p2, "TerrainPopulated", __call1175_11(p0));
    life6_34 = spill1175_0;
    __call1175_14(p2, "LightPopulated", __call1175_13(p0));
    __call1175_16(p2, "InhabitedTime", __call1175_15(p0));
    life7_47 = __call1175_17(p0);
    life8_51 = new net.minecraft.nbt.NBTTagList();
    spill1175_1 = __call1175_19(__fieldRead1175_18(p1));
    if (!((life6_34 == 0))) {
        forestValue1175_59_0 = __integerCategory1175_20(spill1175_1);
        break forest_join_59;
    }
    if (!((!spill1175_1))) {
        break forest_join_60;
    }
    forestValue1175_59_0 = 1;
    }
    forestValue1175_61_0 = forestValue1175_59_0;
    break forest_join_61;
    }
    forestValue1175_61_0 = 0;
    }
    life9_62 = forestValue1175_61_0;
    life10_64 = life7_47;
    life11_67 = (life10_64).length;
    life12_69 = 0;
    forest_cycle_69: while (true) {
    forest_join_263: {
    forest_join_262: {
    forest_join_259: {
    forest_join_258: {
    forest_join_251: {
    forest_join_242: {
    forest_join_241: {
    forest_join_233: {
    forest_join_215: {
    if (!((life12_69 < life11_67))) {
        break forest_join_265;
    }
    life13_76 = (life10_64)[life12_69];
    if (!((life6_34 == 0))) {
        break forest_join_277;
    }
    if (!((life6_34 == 0))) {
        break forest_join_263;
    }
    if (!((life13_76 != null))) {
        break forest_join_262;
    }
    life14_88 = new net.minecraft.nbt.NBTTagCompound();
    __call1175_23(life14_88, "Y", ((byte) ((__call1175_21(life13_76) >> 4) & __invokedynamic1175_22(22982, (4610814789424525500L ^ life4_3)))));
    life15_107 = new byte[(__call1175_24(life13_76)).length];
    life16_111 = new moom.Fo();
    life17_113 = null;
    life18_115 = 0;
    forest_cycle_113: while (true) {
    forest_join_213: {
    forest_join_187: {
    forest_join_176: {
    forest_join_175: {
    if (!((life18_115 < (__call1175_25(life13_76)).length))) {
        break forest_join_215;
    }
    life19_125 = __integerCategory1175_27((__call1175_26(life13_76))[life18_115]);
    life20_133 = (life18_115 & __invokedynamic1175_28(24068, (1632285910794254202L ^ life4_3)));
    life21_147 = ((life18_115 >> __invokedynamic1175_29(29683, (4691392535786789506L ^ life4_3))) & __invokedynamic1175_30(24068, (1632285910794254202L ^ life4_3)));
    life22_157 = ((life18_115 >> 4) & __invokedynamic1175_31(24068, (1632285910794254202L ^ life4_3)));
    if (!((life6_34 == 0))) {
        break forest_join_213;
    }
    spill1175_2 = (life19_125 >> __invokedynamic1175_32(18331, (3432245449783684845L ^ life4_3)));
    if (!((life6_34 == 0))) {
        forestValue1175_242_0 = spill1175_2;
        break forest_join_242;
    }
    if (!((spill1175_2 != 0))) {
        break forest_join_187;
    }
    spill1175_3 = life17_113;
    if (!((life6_34 == 0))) {
        forestValue1175_176_0 = spill1175_3;
        break forest_join_176;
    }
    if (!((spill1175_3 == null))) {
        break forest_join_175;
    }
    life17_113 = new moom.Fo();
    }
    forestValue1175_176_0 = life17_113;
    }
    __call1175_34(forestValue1175_176_0, life20_133, life21_147, life22_157, (life19_125 >> __invokedynamic1175_33(18331, (3432245449783684845L ^ life4_3))));
    }
    (life15_107)[life18_115] = ((byte) ((life19_125 >> 4) & __invokedynamic1175_35(22982, (4610814789424525500L ^ life4_3))));
    __call1175_37(life16_111, life20_133, life21_147, life22_157, (life19_125 & __invokedynamic1175_36(24068, (1632285910794254202L ^ life4_3))));
    life18_115 += 1;
    }
    if (!((life6_34 != 0))) {
        continue forest_cycle_113;
    }
    break forest_cycle_113;
    }
    }
    __call1175_38(life14_88, "Blocks", life15_107);
    __call1175_40(life14_88, "Data", __call1175_39(life16_111));
    if (!((life6_34 == 0))) {
        break forest_join_241;
    }
    if (!((life17_113 != null))) {
        break forest_join_233;
    }
    __call1175_42(life14_88, "Add", __call1175_41(life17_113));
    }
    spill1175_4 = life14_88;
    spill1175_5 = "BlockLight";
    spill1175_6 = __call1175_44(__call1175_43(life13_76));
    if (!((life6_34 == 0))) {
        forestValue1175_258_0 = spill1175_4;
        forestValue1175_258_1 = spill1175_5;
        forestValue1175_258_2 = spill1175_6;
        break forest_join_258;
    }
    __call1175_45(spill1175_4, spill1175_5, spill1175_6);
    }
    forestValue1175_242_0 = life9_62;
    }
    if (!((forestValue1175_242_0 != 0))) {
        break forest_join_251;
    }
    __call1175_48(life14_88, "SkyLight", __call1175_47(__call1175_46(life13_76)));
    if (!((life6_34 != 0))) {
        break forest_join_259;
    }
    }
    forestValue1175_258_0 = life14_88;
    forestValue1175_258_1 = "SkyLight";
    forestValue1175_258_2 = new byte[(__call1175_50(__call1175_49(life13_76))).length];
    }
    __call1175_51(forestValue1175_258_0, forestValue1175_258_1, forestValue1175_258_2);
    }
    __call1175_52(life8_51, life14_88);
    }
    life12_69 += 1;
    }
    if (!((life6_34 != 0))) {
        continue forest_cycle_69;
    }
    break forest_cycle_69;
    }
    }
    __call1175_53(p2, "Sections", life8_51);
    __call1175_55(p2, "Biomes", __call1175_54(p0));
    __call1175_56(p0, 0);
    }
    life10_292 = new net.minecraft.nbt.NBTTagList();
    life11_294 = 0;
    forest_cycle_283: while (true) {
    forest_join_323: {
    forestValue1175_284_0 = life11_294;
    forest_cycle_284: while (true) {
    if (!((forestValue1175_284_0 < (__call1175_57(p0)).length))) {
        break forest_join_326;
    }
    if (!((life6_34 == 0))) {
        break forest_join_330;
    }
    life12_307 = __call1175_59((__call1175_58(p0))[life11_294]);
    forest_cycle_296: while (true) {
    forest_join_321: {
    forest_join_318: {
    if (!(__call1175_60(life12_307))) {
        break forest_join_323;
    }
    life13_314 = __cast1175_62(__call1175_61(life12_307));
    life14_318 = new net.minecraft.nbt.NBTTagCompound();
    if (!((life6_34 == 0))) {
        break forest_join_318;
    }
    spill1175_7 = __call1175_63(life13_314, life14_318);
    if (!((life6_34 == 0))) {
        forestValue1175_284_0 = __integerCategory1175_64(spill1175_7);
        continue forest_cycle_284;
    }
    if (!(spill1175_7)) {
        break forest_join_321;
    }
    __call1175_65(p0, 1);
    }
    __call1175_66(life10_292, life14_318);
    }
    if (!((life6_34 != 0))) {
        continue forest_cycle_296;
    }
    break forest_cycle_296;
    }
    break forest_cycle_284;
    }
    }
    life11_294 += 1;
    if (!((life6_34 != 0))) {
        continue forest_cycle_283;
    }
    break forest_cycle_283;
    }
    }
    __call1175_67(p2, "Entities", life10_292);
    }
    life11_347 = new net.minecraft.nbt.NBTTagList();
    life12_352 = __call1175_70(__call1175_69(__call1175_68(p0)));
    forest_cycle_339: while (true) {
    if (!(__call1175_71(life12_352))) {
        break forest_join_360;
    }
    life13_359 = __cast1175_73(__call1175_72(life12_352));
    life14_363 = new net.minecraft.nbt.NBTTagCompound();
    __call1175_74(life13_359, life14_363);
    __call1175_75(life11_347, life14_363);
    if (!((life6_34 == 0))) {
        break forest_join_364;
    }
    if (!((life6_34 != 0))) {
        continue forest_cycle_339;
    }
    break forest_cycle_339;
    }
    }
    __call1175_76(p2, "TileEntities", life11_347);
    }
    life12_383 = __call1175_77(p1, p0, 0);
    if (!((life12_383 != null))) {
        break forest_join_451;
    }
    life13_388 = __call1175_78(p1);
    life15_392 = new net.minecraft.nbt.NBTTagList();
    life16_395 = __call1175_79(life12_383);
    forest_cycle_381: while (true) {
    forest_join_410: {
    forest_join_409: {
    forest_join_408: {
    if (!(__call1175_80(life16_395))) {
        break forest_join_447;
    }
    life17_402 = __cast1175_82(__call1175_81(life16_395));
    life18_406 = new net.minecraft.nbt.NBTTagCompound();
    life19_412 = __cast1175_86(__call1175_85(__fieldRead1175_83(), __call1175_84(life17_402)));
    spill1175_8 = life18_406;
    spill1175_9 = "i";
    if (!((life6_34 == 0))) {
        forestValue1175_449_0 = spill1175_8;
        forestValue1175_449_1 = spill1175_9;
        break forest_join_449;
    }
    spill1175_10 = life19_412;
    if (!((life6_34 == 0))) {
        forestValue1175_409_0 = spill1175_8;
        forestValue1175_409_1 = spill1175_9;
        forestValue1175_409_2 = spill1175_10;
        break forest_join_409;
    }
    if (!((spill1175_10 == null))) {
        forestValue1175_408_0 = spill1175_8;
        forestValue1175_408_1 = spill1175_9;
        break forest_join_408;
    }
    forestValue1175_410_0 = spill1175_8;
    forestValue1175_410_1 = spill1175_9;
    forestValue1175_410_2 = "";
    break forest_join_410;
    }
    forestValue1175_409_0 = forestValue1175_408_0;
    forestValue1175_409_1 = forestValue1175_408_1;
    forestValue1175_409_2 = life19_412;
    }
    forestValue1175_410_0 = forestValue1175_409_0;
    forestValue1175_410_1 = forestValue1175_409_1;
    forestValue1175_410_2 = __call1175_87(forestValue1175_409_2);
    }
    __call1175_88(forestValue1175_410_0, forestValue1175_410_1, forestValue1175_410_2);
    __call1175_91(life18_406, "x", __call1175_90(__fieldRead1175_89(life17_402)));
    __call1175_94(life18_406, "y", __call1175_93(__fieldRead1175_92(life17_402)));
    __call1175_97(life18_406, "z", __call1175_96(__fieldRead1175_95(life17_402)));
    __call1175_99(life18_406, "t", ((int) (__fieldRead1175_98(life17_402) - life13_388)));
    __call1175_101(life18_406, "p", __fieldRead1175_100(life17_402));
    __call1175_102(life15_392, life18_406);
    if (!((life6_34 != 0))) {
        continue forest_cycle_381;
    }
    break forest_cycle_381;
    }
    }
    forestValue1175_449_0 = p2;
    forestValue1175_449_1 = "TileTicks";
    }
    __call1175_103(forestValue1175_449_0, forestValue1175_449_1, life15_392);
    }
    return;
}
public static void h1175_0(moom.Oo p0) throws Throwable {
    throw __call3117500_0(p0);
}
public static void h1175_1(moom.Oo p0) throws Throwable {
    throw __call3117501_0(p0);
}
public static void h1175_2(moom.Oo p0) throws Throwable {
    throw __call3117502_0(p0);
}
public static void h1175_3(moom.Oo p0) throws Throwable {
    throw __call3117503_0(p0);
}
public static void h1175_4(moom.Oo p0) throws Throwable {
    throw __call3117504_0(p0);
}
public static void h1175_5(moom.Oo p0) throws Throwable {
    throw __call3117505_0(p0);
}
public static void h1175_6(moom.Oo p0) throws Throwable {
    throw __call3117506_0(p0);
}
public static void h1175_7(moom.Oo p0) throws Throwable {
    throw __call3117507_0(p0);
}
public static void h1175_8(moom.Oo p0) throws Throwable {
    throw __call3117508_0(p0);
}
public static void h1175_9(moom.Oo p0) throws Throwable {
    throw __call3117509_0(p0);
}
public static void h1175_10(moom.Oo p0) throws Throwable {
    throw __call3117510_0(p0);
}
public static void h1175_11(moom.Oo p0) throws Throwable {
    throw __call3117511_0(p0);
}
public static void h1175_12(moom.Oo p0) throws Throwable {
    throw __call3117512_0(p0);
}
public static void h1175_13(moom.Oo p0) throws Throwable {
    throw __call3117513_0(p0);
}
public static void h1175_14(moom.Oo p0) throws Throwable {
    throw __call3117514_0(p0);
}
public static void h1175_15(moom.Oo p0) throws Throwable {
    throw __call3117515_0(p0);
}
public static void h1175_16(moom.Oo p0) throws Throwable {
    throw __call3117516_0(p0);
}
public static void h1175_17(moom.Oo p0) throws Throwable {
    throw __call3117517_0(p0);
}
private static native long __fieldRead1175_0() throws Throwable;
private static native void __call1175_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead1175_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1175_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead1175_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1175_5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native long __call1175_6(net.minecraft.world.World a0) throws Throwable;
private static native void __call1175_7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native int[] __call1175_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1175_9(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int[] a2) throws Throwable;
private static native int __call1175_10() throws Throwable;
private static native boolean __call1175_11(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1175_12(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native boolean __call1175_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1175_14(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws Throwable;
private static native long __call1175_15(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1175_16(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, long a2) throws Throwable;
private static native moom.Fs[] __call1175_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1175_18(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1175_19(moom.EA a0) throws Throwable;
private static native int __integerCategory1175_20(boolean value) throws Throwable;
private static native int __call1175_21(moom.Fs a0) throws Throwable;
private static native int __invokedynamic1175_22(int a0, long a1) throws Throwable;
private static native void __call1175_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native char[] __call1175_24(moom.Fs a0) throws Throwable;
private static native char[] __call1175_25(moom.Fs a0) throws Throwable;
private static native char[] __call1175_26(moom.Fs a0) throws Throwable;
private static native int __integerCategory1175_27(char value) throws Throwable;
private static native int __invokedynamic1175_28(int a0, long a1) throws Throwable;
private static native int __invokedynamic1175_29(int a0, long a1) throws Throwable;
private static native int __invokedynamic1175_30(int a0, long a1) throws Throwable;
private static native int __invokedynamic1175_31(int a0, long a1) throws Throwable;
private static native int __invokedynamic1175_32(int a0, long a1) throws Throwable;
private static native int __invokedynamic1175_33(int a0, long a1) throws Throwable;
private static native void __call1175_34(moom.Fo a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int __invokedynamic1175_35(int a0, long a1) throws Throwable;
private static native int __invokedynamic1175_36(int a0, long a1) throws Throwable;
private static native void __call1175_37(moom.Fo a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1175_38(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte[] a2) throws Throwable;
private static native byte[] __call1175_39(moom.Fo a0) throws Throwable;
private static native void __call1175_40(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte[] a2) throws Throwable;
private static native byte[] __call1175_41(moom.Fo a0) throws Throwable;
private static native void __call1175_42(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte[] a2) throws Throwable;
private static native moom.Fo __call1175_43(moom.Fs a0) throws Throwable;
private static native byte[] __call1175_44(moom.Fo a0) throws Throwable;
private static native void __call1175_45(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte[] a2) throws Throwable;
private static native moom.Fo __call1175_46(moom.Fs a0) throws Throwable;
private static native byte[] __call1175_47(moom.Fo a0) throws Throwable;
private static native void __call1175_48(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte[] a2) throws Throwable;
private static native moom.Fo __call1175_49(moom.Fs a0) throws Throwable;
private static native byte[] __call1175_50(moom.Fo a0) throws Throwable;
private static native void __call1175_51(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte[] a2) throws Throwable;
private static native void __call1175_52(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1175_53(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native byte[] __call1175_54(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1175_55(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte[] a2) throws Throwable;
private static native void __call1175_56(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __call1175_57(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __call1175_58(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Iterator __call1175_59(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native boolean __call1175_60(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1175_61(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1175_62(java.lang.Object a0) throws Throwable;
private static native boolean __call1175_63(net.minecraft.entity.Entity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native int __integerCategory1175_64(boolean value) throws Throwable;
private static native void __call1175_65(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native void __call1175_66(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1175_67(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native java.util.Map __call1175_68(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Collection __call1175_69(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1175_70(java.util.Collection a0) throws Throwable;
private static native boolean __call1175_71(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1175_72(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast1175_73(java.lang.Object a0) throws Throwable;
private static native void __call1175_74(net.minecraft.tileentity.TileEntity a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1175_75(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1175_76(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native java.util.List __call1175_77(net.minecraft.world.World a0, net.minecraft.world.chunk.Chunk a1, int a2) throws Throwable;
private static native long __call1175_78(net.minecraft.world.World a0) throws Throwable;
private static native java.util.Iterator __call1175_79(java.util.List a0) throws Throwable;
private static native boolean __call1175_80(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1175_81(java.util.Iterator a0) throws Throwable;
private static native moom.Er __cast1175_82(java.lang.Object a0) throws Throwable;
private static native moom.DC __fieldRead1175_83() throws Throwable;
private static native net.minecraft.block.Block __call1175_84(moom.Er a0) throws Throwable;
private static native java.lang.Object __call1175_85(moom.DC a0, net.minecraft.block.Block a1) throws Throwable;
private static native moom.DD __cast1175_86(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call1175_87(moom.DD a0) throws Throwable;
private static native void __call1175_88(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native moom.DT __fieldRead1175_89(moom.Er a0) throws Throwable;
private static native int __call1175_90(moom.DT a0) throws Throwable;
private static native void __call1175_91(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native moom.DT __fieldRead1175_92(moom.Er a0) throws Throwable;
private static native int __call1175_93(moom.DT a0) throws Throwable;
private static native void __call1175_94(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native moom.DT __fieldRead1175_95(moom.Er a0) throws Throwable;
private static native int __call1175_96(moom.DT a0) throws Throwable;
private static native void __call1175_97(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native long __fieldRead1175_98(moom.Er a0) throws Throwable;
private static native void __call1175_99(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __fieldRead1175_100(moom.Er a0) throws Throwable;
private static native void __call1175_101(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native void __call1175_102(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native void __call1175_103(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTTagList a2) throws Throwable;
private static native java.lang.Exception __call3117500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117512_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117513_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117514_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117515_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117516_0(moom.Oo a0) throws Throwable;
private static native java.lang.Exception __call3117517_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_1f955462ba6ddb29fdc6(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws E;
private static final class __SourceHandler_1f955462ba6ddb29fdc6 {

public static boolean f725(net.minecraft.world.chunk.storage.AnvilChunkLoader receiver) throws Throwable {
    int forwardValue725_29_0;
    java.lang.Object forwardValue725_35_0;
    java.util.Map spill725_0;
    boolean spill725_1;
    org.apache.logging.log4j.Logger spill725_2;
    java.lang.String spill725_3;
    java.lang.Object[] spill725_4;
    long life1_3;
    int life3_5;
    moom.Ee life4_48;
    net.minecraft.nbt.NBTTagCompound life6_59;
    int life5_78;
    forward_join_56: {
    forward_join_35: {
    forward_join_30: {
    forward_join_29: {
    forward_join_28: {
    life1_3 = (__fieldRead725_0() ^ 50710959303078L);
    life3_5 = __call725_1();
    spill725_0 = __fieldRead725_2(receiver);
    if (!((life3_5 == 0))) {
        forwardValue725_35_0 = spill725_0;
        break forward_join_35;
    }
    if (!(__call725_3(spill725_0))) {
        break forward_join_30;
    }
    spill725_1 = __fieldRead725_4(receiver);
    if (!((life3_5 == 0))) {
        forwardValue725_29_0 = __integerCategory725_5(spill725_1);
        break forward_join_29;
    }
    if (!(spill725_1)) {
        break forward_join_28;
    }
    spill725_2 = __fieldRead725_6();
    spill725_3 = "ThreadedAnvilChunkStorage ({}): All chunks are saved";
    java.lang.Object[] __stackOp725_7_0 = new java.lang.Object[1];
    spill725_4 = __stackOp725_7_0;
    (__stackOp725_7_0)[0] = __call725_9(__fieldRead725_8(receiver));
    __call725_10(spill725_2, spill725_3, spill725_4);
    }
    forwardValue725_29_0 = 0;
    }
    return __integerCategory725_11(forwardValue725_29_0);
    }
    forwardValue725_35_0 = __call725_15(__call725_14(__call725_13(__fieldRead725_12(receiver))));
    }
    life4_48 = __cast725_16(forwardValue725_35_0);
    __call725_18(__fieldRead725_17(receiver), life4_48);
    life6_59 = __cast725_21(__call725_20(__fieldRead725_19(receiver), life4_48));
    if (!((life3_5 == 0))) {
        break forward_join_56;
    }
    if (!((life6_59 != null))) {
        break forward_join_56;
    }
    __call725_22(receiver, life4_48, life6_59);
    }
    life5_78 = 1;
    __call725_24(__fieldRead725_23(receiver), life4_48);
    return __integerCategory725_25(life5_78);
}
public static boolean h725_0(java.lang.Exception p0) throws Throwable {
    throw __call3072500_0(p0);
}
public static boolean h725_1(java.lang.Exception p0) throws Throwable {
    throw __call3072501_0(p0);
}
public static boolean h725_2(java.lang.Exception p0) throws Throwable {
    throw __call3072502_0(p0);
}
public static boolean h725_3(java.lang.Exception p0) throws Throwable {
    throw __call3072503_0(p0);
}
public static boolean h725_4(java.lang.Exception p0) throws Throwable {
    throw __call3072504_0(p0);
}
public static boolean h725_5(java.lang.Exception p0, net.minecraft.world.chunk.storage.AnvilChunkLoader p1, moom.Ee p2, int p3) throws Throwable {
    java.lang.Exception life4_2;
    int life3_8;
    life4_2 = p0;
    __call3072505_1(__fieldRead3072505_0(), "Failed to save chunk", life4_2);
    life3_8 = 1;
    __call3072505_3(__fieldRead3072505_2(p1), p2);
    return __integerCategory3072505_4(life3_8);
}
public static boolean h725_6(java.lang.Throwable p0, net.minecraft.world.chunk.storage.AnvilChunkLoader p1, moom.Ee p2) throws Throwable {
    java.lang.Throwable life3_2;
    life3_2 = p0;
    __call3072506_1(__fieldRead3072506_0(p1), p2);
    throw life3_2;
}
private static native long __fieldRead725_0() throws Throwable;
private static native int __call725_1() throws Throwable;
private static native java.util.Map __fieldRead725_2(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native boolean __call725_3(java.util.Map a0) throws Throwable;
private static native boolean __fieldRead725_4(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native int __integerCategory725_5(boolean value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead725_6() throws Throwable;
private static native java.io.File __fieldRead725_8(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native java.lang.String __call725_9(java.io.File a0) throws Throwable;
private static native void __call725_10(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native boolean __integerCategory725_11(int value) throws Throwable;
private static native java.util.Map __fieldRead725_12(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native java.util.Set __call725_13(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call725_14(java.util.Set a0) throws Throwable;
private static native java.lang.Object __call725_15(java.util.Iterator a0) throws Throwable;
private static native moom.Ee __cast725_16(java.lang.Object a0) throws Throwable;
private static native java.util.Set __fieldRead725_17(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native boolean __call725_18(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native java.util.Map __fieldRead725_19(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native java.lang.Object __call725_20(java.util.Map a0, moom.Ee a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast725_21(java.lang.Object a0) throws Throwable;
private static native void __call725_22(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, moom.Ee a1, net.minecraft.nbt.NBTTagCompound a2) throws Throwable;
private static native java.util.Set __fieldRead725_23(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native boolean __call725_24(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native boolean __integerCategory725_25(int value) throws Throwable;
private static native java.lang.Exception __call3072500_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3072501_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3072502_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3072503_0(java.lang.Exception a0) throws Throwable;
private static native java.lang.Exception __call3072504_0(java.lang.Exception a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead3072505_0() throws Throwable;
private static native void __call3072505_1(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Exception a2) throws Throwable;
private static native java.util.Set __fieldRead3072505_2(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native boolean __call3072505_3(java.util.Set a0, moom.Ee a1) throws Throwable;
private static native boolean __integerCategory3072505_4(int value) throws Throwable;
private static native java.util.Set __fieldRead3072506_0(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native boolean __call3072506_1(java.util.Set a0, moom.Ee a1) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_dd906dd50a3abb49b25f(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws E;
private static final class __SourceHandler_dd906dd50a3abb49b25f {

public static void f726(net.minecraft.world.chunk.storage.AnvilChunkLoader receiver) throws Throwable {
    long life1_3;
    life1_3 = (__fieldRead726_0() ^ 45194653375233L);
    __fieldWrite726_1(receiver, 1);
    forest_cycle_7: while (true) {
    if (!(__call726_2(receiver))) {
        continue forest_cycle_7;
    }
    continue forest_cycle_7;
    }
}
public static void h726_0(moom.Oo p0) throws Throwable {
    throw __call3072600_0(p0);
}
public static void h726_1(java.lang.Throwable p0, net.minecraft.world.chunk.storage.AnvilChunkLoader p1) throws Throwable {
    java.lang.Throwable life2_2;
    life2_2 = p0;
    __fieldWrite3072601_0(p1, 0);
    throw life2_2;
}
private static native long __fieldRead726_0() throws Throwable;
private static native void __fieldWrite726_1(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, int a1) throws Throwable;
private static native boolean __call726_2(net.minecraft.world.chunk.storage.AnvilChunkLoader a0) throws Throwable;
private static native java.lang.Exception __call3072600_0(moom.Oo a0) throws Throwable;
private static native void __fieldWrite3072601_0(net.minecraft.world.chunk.storage.AnvilChunkLoader a0, int a1) throws Throwable;

}


public void b(net.minecraft.world.World p0, net.minecraft.world.chunk.Chunk p1) throws java.io.IOException {
return;
}


public void b() { __sourceHandlerCall_dd906dd50a3abb49b25f(this); }


private void b(moom.Ee p0, net.minecraft.nbt.NBTTagCompound p1) throws java.io.IOException {
java.lang.Object local3 = moom.Fw.a__DataOutputStream(((java.io.File)(this.d)), ((int)(((moom.Ee)(p0)).a)), ((int)(((moom.Ee)(p0)).b)));
    moom.yh.a(((net.minecraft.nbt.NBTTagCompound)(p1)), ((java.io.DataOutput)(local3)));
    ((java.io.DataOutputStream)(local3)).close();
    return;
}


private net.minecraft.world.chunk.Chunk a(net.minecraft.world.World p0, net.minecraft.nbt.NBTTagCompound p1) { return __sourceHandlerCall_9a3fbce0d4e8f3ec0e14(this, p0, p1); }


private void a(net.minecraft.world.chunk.Chunk p0, net.minecraft.world.World p1, net.minecraft.nbt.NBTTagCompound p2) { __sourceHandlerCall_9bb10920860b7df4c9e6(this, p0, p1, p2); }


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 735;
      if (h[var3] == null) {
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
         long var5 = g[var3];
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
         Object[] var9 = (Object[])i.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               i.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Fp", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12669_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fp"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.chunk.storage.AnvilChunkLoader.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public net.minecraft.world.chunk.Chunk a(net.minecraft.world.World p0, int p1, int p2) throws java.io.IOException { return __sourceHandlerCall_4457575aecded6f04956(this, p0, p1, p2); }


protected net.minecraft.world.chunk.Chunk a(net.minecraft.world.World p0, int p1, int p2, net.minecraft.nbt.NBTTagCompound p3) { return __sourceHandlerCall_b50f34d72cf104939291(this, p0, p1, p2, p3); }


public void a(net.minecraft.world.World p0, net.minecraft.world.chunk.Chunk p1) throws net.minecraft.world.MinecraftException, java.io.IOException {
net.minecraft.nbt.NBTTagCompound life3_5;
    net.minecraft.nbt.NBTTagCompound life4_9;
    ((net.minecraft.world.World)(p0)).j();
    try {
        life3_5 = new net.minecraft.nbt.NBTTagCompound();
        life4_9 = new net.minecraft.nbt.NBTTagCompound();
        ((net.minecraft.nbt.NBTTagCompound)(life3_5)).a(((java.lang.String)("Level")), ((net.minecraft.nbt.NBTBase)(life4_9)));
        ((net.minecraft.world.chunk.storage.AnvilChunkLoader)(this)).a(((net.minecraft.world.chunk.Chunk)(p1)), ((net.minecraft.world.World)(p0)), ((net.minecraft.nbt.NBTTagCompound)(life4_9)));
        ((net.minecraft.world.chunk.storage.AnvilChunkLoader)(this)).a(((moom.Ee)(((net.minecraft.world.chunk.Chunk)(p1)).a__Ee())), ((net.minecraft.nbt.NBTTagCompound)(life3_5)));
    } catch (java.lang.Exception life3_25) {
        ((org.apache.logging.log4j.Logger)(net.minecraft.world.chunk.storage.AnvilChunkLoader.a)).error(((java.lang.String)("Failed to save chunk")), ((java.lang.Throwable)(life3_25)));
    }
    return;
}


protected void a(moom.Ee p0, net.minecraft.nbt.NBTTagCompound p1) { __sourceHandlerCall_5d0e0c09e4b309e94883(this, p0, p1); }


public boolean a__Boolean() { return __sourceHandlerCall_1f955462ba6ddb29fdc6(this); }


public void a() {
return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12669_0() throws E;
}
