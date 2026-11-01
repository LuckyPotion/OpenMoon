package net.minecraft.entity;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class DataWatcher {

private net.minecraft.entity.Entity a;

private boolean b;

private static java.util.Map<java.lang.Class<?>, java.lang.Integer> c;

private java.util.Map<java.lang.Integer, moom.r2> d;

private boolean e;

private java.util.concurrent.locks.ReadWriteLock f;

public net.minecraft.world.biome.BiomeGenBase g;

public moom.DT h;

private static long i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

public DataWatcher(net.minecraft.entity.Entity p0) {
super();
    this.b = true;
    this.d = com.google.common.collect.Maps.newHashMap();
    this.f = new java.util.concurrent.locks.ReentrantReadWriteLock();
    this.g = net.minecraft.world.biome.BiomeGenBase.s;
    this.h = moom.DT.f;
    this.a = p0;
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(-3159277523959093656L)), ((long)(-1431226724357473500L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(203739154325900L)))));
    long local11_life6 = (net.minecraft.entity.DataWatcher.i ^ 127056102520189L);
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1846_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1846_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1846_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1846_14 = new byte[8];
    (__sourceSpill1846_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1846_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1846_16 = __sourceSpill1846_14;
    ((javax.crypto.Cipher)(__sourceSpill1846_11)).init(((int)(__sourceSpill1846_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1846_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1846_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[9];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "à¢»î´pÁbià<@°èT²×»\013n\fÊ\016\002£ï¦z¼±}r&87uëàçosìß±´Ü\013\033\bP"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1846_25 = local4_life21;
        int __sourceSpill1846_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1846_25)).substring(((int)(__sourceSpill1846_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1846_30 = local6_life19;
        int __sourceSpill1846_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1846_33 = new byte[8];
        (__sourceSpill1846_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1846_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1846_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1846_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1846_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1846_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1846_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1846_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1846_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1846_34)).doFinal(((byte[])(__sourceSpill1846_33)));
        (__sourceSpill1846_30)[__sourceSpill1846_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "ks²¿ºE#\r|I%[wP"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1846_38 = local4_life21;
        int __sourceSpill1846_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1846_38)).substring(((int)(__sourceSpill1846_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1846_43 = local6_life19;
        int __sourceSpill1846_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1846_46 = new byte[8];
        (__sourceSpill1846_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1846_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1846_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1846_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1846_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1846_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1846_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1846_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1846_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1846_47)).doFinal(((byte[])(__sourceSpill1846_46)));
        (__sourceSpill1846_43)[__sourceSpill1846_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    j = ((long[])(local6_life19));
    k = ((java.lang.Integer[])(new java.lang.Integer[9]));
    c = ((java.util.Map)(com.google.common.collect.Maps.newHashMap()));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(java.lang.Byte.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(0))))));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(java.lang.Short.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(1))))));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(java.lang.Integer.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(2))))));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(java.lang.Float.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(3))))));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(java.lang.String.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(4))))));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(net.minecraft.item.ItemStack.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(5))))));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(moom.DT.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1846_80(1020, (8484935179657700449L ^ local11_life6))))))));
    ((java.util.Map)(net.minecraft.entity.DataWatcher.c)).put(((java.lang.Object)(net.minecraft.util.Rotations.class)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(__sourceIntrinsic_eb8803ad1f63_originalDynamicSite1846_85(18709, (6619449932084129422L ^ local11_life6))))))));
}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_63373924b13305dd2667(net.minecraft.entity.DataWatcher a0) throws E;
private static final class __SourceHandler_63373924b13305dd2667 {

public static java.util.List f1482(net.minecraft.entity.DataWatcher receiver) throws Throwable {
    net.minecraft.entity.DataWatcher lexicalValue1482_18_0;
    moom.r2 lexicalValue1482_37_0;
    java.util.ArrayList lexicalValue1482_46_0;
    int spill1482_0;
    net.minecraft.entity.DataWatcher spill1482_1;
    moom.r2 spill1482_2;
    java.util.ArrayList spill1482_3;
    long life1_3;
    java.util.ArrayList life4_6;
    int life3_7;
    java.util.Iterator life5_27;
    moom.r2 life6_34;
    lexical_join_58: {
    lexical_join_55: {
    lexical_join_51: {
    lexical_join_18: {
    life1_3 = (__fieldRead1482_0() ^ 79671543240144L);
    spill1482_0 = __call1482_1();
    life4_6 = null;
    life3_7 = spill1482_0;
    spill1482_1 = receiver;
    if (!((life3_7 == 0))) {
        lexicalValue1482_18_0 = spill1482_1;
        break lexical_join_18;
    }
    if (!(__fieldRead1482_2(spill1482_1))) {
        break lexical_join_55;
    }
    __call1482_5(__call1482_4(__fieldRead1482_3(receiver)));
    lexicalValue1482_18_0 = receiver;
    }
    life5_27 = __call1482_8(__call1482_7(__fieldRead1482_6(lexicalValue1482_18_0)));
    lexical_cycle_22: while (true) {
    lexical_join_49: {
    lexical_join_46: {
    lexical_join_45: {
    lexical_join_37: {
    if (!(__call1482_9(life5_27))) {
        break lexical_join_51;
    }
    life6_34 = __cast1482_11(__call1482_10(life5_27));
    if (!((life3_7 == 0))) {
        break lexical_join_58;
    }
    spill1482_2 = life6_34;
    if (!((life3_7 == 0))) {
        lexicalValue1482_37_0 = spill1482_2;
        break lexical_join_37;
    }
    if (!(__call1482_12(spill1482_2))) {
        break lexical_join_49;
    }
    lexicalValue1482_37_0 = life6_34;
    }
    __call1482_13(lexicalValue1482_37_0, 0);
    spill1482_3 = life4_6;
    if (!((life3_7 == 0))) {
        lexicalValue1482_46_0 = spill1482_3;
        break lexical_join_46;
    }
    if (!((spill1482_3 == null))) {
        break lexical_join_45;
    }
    life4_6 = __call1482_14();
    }
    lexicalValue1482_46_0 = life4_6;
    }
    __call1482_15(lexicalValue1482_46_0, life6_34);
    }
    if (!((life3_7 != 0))) { continue lexical_cycle_22; }
    break lexical_cycle_22;
    }
    }
    __call1482_18(__call1482_17(__fieldRead1482_16(receiver)));
    }
    __fieldWrite1482_19(receiver, 0);
    }
    return life4_6;
}
public static void h1482_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148200_0(p0);
}
public static void h1482_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148201_0(p0);
}
public static void h1482_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148202_0(p0);
}
public static void h1482_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148203_0(p0);
}
public static void h1482_4(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148204_0(p0);
}
public static void h1482_5(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148205_0(p0);
}
private static native long __fieldRead1482_0() throws Throwable;
private static native int __call1482_1() throws Throwable;
private static native boolean __fieldRead1482_2(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1482_3(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1482_4(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1482_5(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native java.util.Map __fieldRead1482_6(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.Collection __call1482_7(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1482_8(java.util.Collection a0) throws Throwable;
private static native boolean __call1482_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1482_10(java.util.Iterator a0) throws Throwable;
private static native moom.r2 __cast1482_11(java.lang.Object a0) throws Throwable;
private static native boolean __call1482_12(moom.r2 a0) throws Throwable;
private static native void __call1482_13(moom.r2 a0, int a1) throws Throwable;
private static native java.util.ArrayList __call1482_14() throws Throwable;
private static native boolean __call1482_15(java.util.ArrayList a0, moom.r2 a1) throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1482_16(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1482_17(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1482_18(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native void __fieldWrite1482_19(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native java.lang.Exception __call1148200_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148201_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148202_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148203_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148204_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148205_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c5de2d5533c6cd5b4d9b(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Object a2) throws E;
private static final class __SourceHandler_c5de2d5533c6cd5b4d9b {

public static void f1483(net.minecraft.entity.DataWatcher receiver, int p0, java.lang.Object p1) throws Throwable {
    int forwardValue1483_41_0;
    int spill1483_0;
    int spill1483_1;
    long life3_3;
    java.lang.Integer life6_10;
    int life5_11;
    moom.r2 life7_64;
    forward_join_48: {
    forward_join_41: {
    forward_join_36: {
    forward_join_21: {
    life3_3 = (__fieldRead1483_0() ^ 53321948380062L);
    spill1483_0 = __call1483_1();
    life6_10 = __cast1483_5(__call1483_4(__fieldRead1483_2(), __call1483_3(p1)));
    life5_11 = spill1483_0;
    if (!((life6_10 == null))) {
        break forward_join_21;
    }
    throw new java.lang.IllegalArgumentException(__invokedynamic1483_7(__call1483_6(p1)));
    }
    spill1483_1 = p0;
    if (!((life5_11 == 0))) {
        forwardValue1483_41_0 = spill1483_1;
        break forward_join_41;
    }
    if (!((spill1483_1 > __invokedynamic1483_8(25863, (5404372126127148156L ^ life3_3))))) {
        break forward_join_36;
    }
    throw new java.lang.IllegalArgumentException(__invokedynamic1483_9(p0));
    }
    forwardValue1483_41_0 = __integerCategory1483_13(__call1483_12(__fieldRead1483_10(receiver), __call1483_11(p0)));
    }
    if (!((forwardValue1483_41_0 != 0))) {
        break forward_join_48;
    }
    throw new java.lang.IllegalArgumentException(__invokedynamic1483_14(p0));
    }
    life7_64 = new moom.r2(__call1483_15(life6_10), p0, p1);
    __call1483_18(__call1483_17(__fieldRead1483_16(receiver)));
    __call1483_21(__fieldRead1483_19(receiver), __call1483_20(p0), life7_64);
    __call1483_24(__call1483_23(__fieldRead1483_22(receiver)));
    __fieldWrite1483_25(receiver, 0);
    return;
}
public static void h1483_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148300_0(p0);
}
public static void h1483_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148301_0(p0);
}
public static void h1483_2(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148302_0(p0);
}
public static void h1483_3(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148303_0(p0);
}
private static native long __fieldRead1483_0() throws Throwable;
private static native int __call1483_1() throws Throwable;
private static native java.util.Map __fieldRead1483_2() throws Throwable;
private static native java.lang.Class __call1483_3(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1483_4(java.util.Map a0, java.lang.Class a1) throws Throwable;
private static native java.lang.Integer __cast1483_5(java.lang.Object a0) throws Throwable;
private static native java.lang.Class __call1483_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __invokedynamic1483_7(java.lang.Class a0) throws Throwable;
private static native int __invokedynamic1483_8(int a0, long a1) throws Throwable;
private static native java.lang.String __invokedynamic1483_9(int a0) throws Throwable;
private static native java.util.Map __fieldRead1483_10(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.lang.Integer __call1483_11(int a0) throws Throwable;
private static native boolean __call1483_12(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native int __integerCategory1483_13(boolean value) throws Throwable;
private static native java.lang.String __invokedynamic1483_14(int a0) throws Throwable;
private static native int __call1483_15(java.lang.Integer a0) throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1483_16(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1483_17(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1483_18(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native java.util.Map __fieldRead1483_19(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.lang.Integer __call1483_20(int a0) throws Throwable;
private static native java.lang.Object __call1483_21(java.util.Map a0, java.lang.Integer a1, moom.r2 a2) throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1483_22(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1483_23(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1483_24(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native void __fieldWrite1483_25(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native java.lang.Exception __call1148300_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148301_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148302_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148303_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aee42921b5a0ebad3d03(net.minecraft.entity.DataWatcher a0, java.util.List a1) throws E;
private static final class __SourceHandler_aee42921b5a0ebad3d03 {

public static void f1484(net.minecraft.entity.DataWatcher receiver, java.util.List p0) throws Throwable {
    moom.r2 lexicalValue1484_35_0;
    int spill1484_0;
    moom.r2 spill1484_1;
    long life2_3;
    int life4_9;
    java.util.Iterator life5_12;
    moom.r2 life6_19;
    moom.r2 life7_27;
    lexical_join_52: {
    lexical_join_45: {
    life2_3 = (__fieldRead1484_0() ^ 39107858350246L);
    spill1484_0 = __call1484_1();
    __call1484_4(__call1484_3(__fieldRead1484_2(receiver)));
    life4_9 = spill1484_0;
    life5_12 = __call1484_5(p0);
    lexical_cycle_13: while (true) {
    lexical_join_43: {
    lexical_join_35: {
    if (!(__call1484_6(life5_12))) {
        break lexical_join_45;
    }
    life6_19 = __cast1484_8(__call1484_7(life5_12));
    life7_27 = __cast1484_13(__call1484_12(__fieldRead1484_9(receiver), __call1484_11(__call1484_10(life6_19))));
    if (!((life4_9 != 0))) {
        break lexical_join_52;
    }
    spill1484_1 = life7_27;
    if (!((life4_9 != 0))) {
        lexicalValue1484_35_0 = spill1484_1;
        break lexical_join_35;
    }
    if (!((spill1484_1 != null))) {
        break lexical_join_43;
    }
    lexicalValue1484_35_0 = life7_27;
    }
    __call1484_15(lexicalValue1484_35_0, __call1484_14(life6_19));
    __call1484_18(__fieldRead1484_16(receiver), __call1484_17(life6_19));
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    __call1484_21(__call1484_20(__fieldRead1484_19(receiver)));
    __fieldWrite1484_22(receiver, 1);
    }
    return;
}
public static void h1484_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148400_0(p0);
}
public static void h1484_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148401_0(p0);
}
private static native long __fieldRead1484_0() throws Throwable;
private static native int __call1484_1() throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1484_2(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1484_3(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1484_4(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native java.util.Iterator __call1484_5(java.util.List a0) throws Throwable;
private static native boolean __call1484_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1484_7(java.util.Iterator a0) throws Throwable;
private static native moom.r2 __cast1484_8(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1484_9(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native int __call1484_10(moom.r2 a0) throws Throwable;
private static native java.lang.Integer __call1484_11(int a0) throws Throwable;
private static native java.lang.Object __call1484_12(java.util.Map a0, java.lang.Integer a1) throws Throwable;
private static native moom.r2 __cast1484_13(java.lang.Object a0) throws Throwable;
private static native java.lang.Object __call1484_14(moom.r2 a0) throws Throwable;
private static native void __call1484_15(moom.r2 a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1484_16(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native int __call1484_17(moom.r2 a0) throws Throwable;
private static native void __call1484_18(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1484_19(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1484_20(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1484_21(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native void __fieldWrite1484_22(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native java.lang.Exception __call1148400_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148401_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f489b35046268ed92eda(java.util.List a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_f489b35046268ed92eda {

public static void f1485(java.util.List p0, net.minecraft.network.PacketBuffer p1) throws Throwable {
    long life2_3;
    int life4_5;
    java.util.Iterator life5_15;
    moom.r2 life6_22;
    lexical_join_35: {
    lexical_join_27: {
    life2_3 = (__fieldRead1485_0() ^ 33626968350823L);
    life4_5 = __call1485_1();
    if (!((life4_5 == 0))) {
        break lexical_join_35;
    }
    if (!((p0 != null))) {
        break lexical_join_27;
    }
    life5_15 = __call1485_2(p0);
    lexical_cycle_13: while (true) {
    if (!(__call1485_3(life5_15))) {
        break lexical_join_27;
    }
    life6_22 = __cast1485_5(__call1485_4(life5_15));
    __call1485_6(p1, life6_22);
    if (!((life4_5 == 0))) {
        break lexical_join_35;
    }
    if (!((life4_5 != 0))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    __call1485_8(p1, __invokedynamic1485_7(29360, (4835925120555450422L ^ life2_3)));
    }
    return;
}
public static void h1485_0(java.io.IOException p0) throws Throwable {
    throw __call1148500_0(p0);
}
public static void h1485_1(java.io.IOException p0) throws Throwable {
    throw __call1148501_0(p0);
}
private static native long __fieldRead1485_0() throws Throwable;
private static native int __call1485_1() throws Throwable;
private static native java.util.Iterator __call1485_2(java.util.List a0) throws Throwable;
private static native boolean __call1485_3(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1485_4(java.util.Iterator a0) throws Throwable;
private static native moom.r2 __cast1485_5(java.lang.Object a0) throws Throwable;
private static native void __call1485_6(net.minecraft.network.PacketBuffer a0, moom.r2 a1) throws Throwable;
private static native int __invokedynamic1485_7(int a0, long a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1485_8(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1148500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1148501_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_d4aabef69f3a17d31209(net.minecraft.network.PacketBuffer a0) throws E;
private static final class __SourceHandler_d4aabef69f3a17d31209 {

public static java.util.List f1102(net.minecraft.network.PacketBuffer p0) throws Throwable {
    java.util.ArrayList forestValue1102_25_0;
    java.util.ArrayList forestValue1102_164_0;
    int spill1102_0;
    java.util.ArrayList spill1102_1;
    long life1_3;
    java.util.ArrayList life4_6;
    int life3_7;
    int life5_10;
    int life6_37;
    int life7_45;
    moom.r2 life8_47;
    int life9_115;
    int life10_118;
    int life11_121;
    float life12_137;
    float life13_140;
    float life14_143;
    forest_join_164: {
    forest_join_163: {
    life1_3 = (__fieldRead1102_0() ^ 16623767497976L);
    spill1102_0 = __call1102_1();
    life4_6 = null;
    life3_7 = spill1102_0;
    life5_10 = __call1102_2(p0);
    forest_cycle_11: while (true) {
    forest_join_154: {
    forest_join_133: {
    forest_join_111: {
    forest_join_102: {
    forest_join_88: {
    forest_join_78: {
    forest_join_68: {
    forest_join_58: {
    forest_join_48: {
    forest_join_26: {
    forest_join_25: {
    if (!((life5_10 != __invokedynamic1102_3(12925, (382890668090395751L ^ life1_3))))) {
        break forest_join_163;
    }
    spill1102_1 = life4_6;
    if (!((life3_7 == 0))) {
        forestValue1102_164_0 = spill1102_1;
        break forest_join_164;
    }
    if (!((life3_7 == 0))) {
        forestValue1102_25_0 = spill1102_1;
        break forest_join_25;
    }
    if (!((spill1102_1 == null))) {
        break forest_join_26;
    }
    forestValue1102_25_0 = __call1102_4();
    }
    life4_6 = forestValue1102_25_0;
    }
    life6_37 = ((life5_10 & __invokedynamic1102_5(22777, (2891378307704219362L ^ life1_3))) >> 5);
    life7_45 = (life5_10 & __invokedynamic1102_6(19524, (3987054995185627731L ^ life1_3)));
    life8_47 = null;
    switch (life6_37) {
case 0:
{
        break forest_join_48;
    }
case 1:
{
        break forest_join_58;
    }
case 2:
{
        break forest_join_68;
    }
case 3:
{
        break forest_join_78;
    }
case 4:
{
        break forest_join_88;
    }
case 5:
{
        break forest_join_102;
    }
case 6:
{
        break forest_join_111;
    }
case 7:
{
        break forest_join_133;
    }
default:
{
        break forest_join_154;
    }
}
    }
    life8_47 = new moom.r2(life6_37, life7_45, __call1102_8(__call1102_7(p0)));
    break forest_join_154;
    }
    life8_47 = new moom.r2(life6_37, life7_45, __call1102_10(__call1102_9(p0)));
    break forest_join_154;
    }
    life8_47 = new moom.r2(life6_37, life7_45, __call1102_12(__call1102_11(p0)));
    break forest_join_154;
    }
    life8_47 = new moom.r2(life6_37, life7_45, __call1102_14(__call1102_13(p0)));
    break forest_join_154;
    }
    life8_47 = new moom.r2(life6_37, life7_45, __call1102_16(p0, __invokedynamic1102_15(26846, (5669836781429839553L ^ life1_3))));
    break forest_join_154;
    }
    life8_47 = new moom.r2(life6_37, life7_45, __call1102_17(p0));
    break forest_join_154;
    }
    life9_115 = __call1102_18(p0);
    life10_118 = __call1102_19(p0);
    life11_121 = __call1102_20(p0);
    life8_47 = new moom.r2(life6_37, life7_45, new moom.DT(life9_115, life10_118, life11_121));
    break forest_join_154;
    }
    life12_137 = __call1102_21(p0);
    life13_140 = __call1102_22(p0);
    life14_143 = __call1102_23(p0);
    life8_47 = new moom.r2(life6_37, life7_45, new net.minecraft.util.Rotations(life12_137, life13_140, life14_143));
    }
    __call1102_24(life4_6, life8_47);
    life5_10 = __call1102_25(p0);
    if (!((life3_7 != 0))) {
        continue forest_cycle_11;
    }
    break forest_cycle_11;
    }
    }
    forestValue1102_164_0 = life4_6;
    }
    return forestValue1102_164_0;
}
public static java.util.List h1102_0(java.io.IOException p0) throws Throwable {
    throw __call3110200_0(p0);
}
public static java.util.List h1102_1(java.io.IOException p0) throws Throwable {
    throw __call3110201_0(p0);
}
private static native long __fieldRead1102_0() throws Throwable;
private static native int __call1102_1() throws Throwable;
private static native byte __call1102_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __invokedynamic1102_3(int a0, long a1) throws Throwable;
private static native java.util.ArrayList __call1102_4() throws Throwable;
private static native int __invokedynamic1102_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1102_6(int a0, long a1) throws Throwable;
private static native byte __call1102_7(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Byte __call1102_8(byte a0) throws Throwable;
private static native short __call1102_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Short __call1102_10(short a0) throws Throwable;
private static native int __call1102_11(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Integer __call1102_12(int a0) throws Throwable;
private static native float __call1102_13(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Float __call1102_14(float a0) throws Throwable;
private static native int __invokedynamic1102_15(int a0, long a1) throws Throwable;
private static native java.lang.String __call1102_16(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native net.minecraft.item.ItemStack __call1102_17(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call1102_18(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call1102_19(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __call1102_20(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native float __call1102_21(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native float __call1102_22(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native float __call1102_23(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native boolean __call1102_24(java.util.ArrayList a0, moom.r2 a1) throws Throwable;
private static native byte __call1102_25(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native java.lang.Exception __call3110200_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3110201_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0df0778f371269674c5e(net.minecraft.network.PacketBuffer a0, moom.r2 a1) throws E;
private static final class __SourceHandler_0df0778f371269674c5e {

public static void f517(net.minecraft.network.PacketBuffer p0, moom.r2 p1) throws Throwable {
    int spill517_0;
    long life2_3;
    int life5_24;
    int life4_25;
    net.minecraft.item.ItemStack life6_99;
    moom.DT life7_108;
    net.minecraft.util.Rotations life8_129;
    forward_join_128: {
    forward_join_109: {
    forward_join_88: {
    forward_join_79: {
    forward_join_71: {
    forward_join_62: {
    forward_join_53: {
    forward_join_44: {
    forward_join_42: {
    forward_join_35: {
    life2_3 = (__fieldRead517_0() ^ 60428697725150L);
    spill517_0 = __call517_1();
    life5_24 = (((__call517_2(p1) << 5) | (__call517_3(p1) & __invokedynamic517_4(19524, (3987062876940678773L ^ life2_3)))) & __invokedynamic517_5(31594, (6361242074137723216L ^ life2_3)));
    life4_25 = spill517_0;
    __call517_6(p0, life5_24);
    if (!((life4_25 != 0))) {
        break forward_join_42;
    }
    switch (__call517_7(p1)) {
case 0:
{
        break forward_join_35;
    }
case 1:
{
        break forward_join_44;
    }
case 2:
{
        break forward_join_53;
    }
case 3:
{
        break forward_join_62;
    }
case 4:
{
        break forward_join_71;
    }
case 5:
{
        break forward_join_79;
    }
case 6:
{
        break forward_join_88;
    }
case 7:
{
        break forward_join_109;
    }
default:
{
        break forward_join_128;
    }
}
    }
    __call517_11(p0, __call517_10(__cast517_9(__call517_8(p1))));
    }
    if (!((life4_25 == 0))) {
        break forward_join_128;
    }
    }
    __call517_15(p0, __call517_14(__cast517_13(__call517_12(p1))));
    if (!((life4_25 == 0))) {
        break forward_join_128;
    }
    }
    __call517_19(p0, __call517_18(__cast517_17(__call517_16(p1))));
    if (!((life4_25 == 0))) {
        break forward_join_128;
    }
    }
    __call517_23(p0, __call517_22(__cast517_21(__call517_20(p1))));
    if (!((life4_25 == 0))) {
        break forward_join_128;
    }
    }
    __call517_26(p0, __cast517_25(__call517_24(p1)));
    if (!((life4_25 == 0))) {
        break forward_join_128;
    }
    }
    life6_99 = __cast517_28(__call517_27(p1));
    __call517_29(p0, life6_99);
    if (!((life4_25 == 0))) {
        break forward_join_128;
    }
    }
    life7_108 = __cast517_31(__call517_30(p1));
    __call517_33(p0, __call517_32(life7_108));
    __call517_35(p0, __call517_34(life7_108));
    __call517_37(p0, __call517_36(life7_108));
    if (!((life4_25 == 0))) {
        break forward_join_128;
    }
    }
    life8_129 = __cast517_39(__call517_38(p1));
    __call517_41(p0, __call517_40(life8_129));
    __call517_43(p0, __call517_42(life8_129));
    __call517_45(p0, __call517_44(life8_129));
    }
    return;
}
public static void h517_0(java.io.IOException p0) throws Throwable {
    throw __call2051700_0(p0);
}
public static void h517_1(java.io.IOException p0) throws Throwable {
    throw __call2051701_0(p0);
}
public static void h517_2(java.io.IOException p0) throws Throwable {
    throw __call2051702_0(p0);
}
public static void h517_3(java.io.IOException p0) throws Throwable {
    throw __call2051703_0(p0);
}
public static void h517_4(java.io.IOException p0) throws Throwable {
    throw __call2051704_0(p0);
}
public static void h517_5(java.io.IOException p0) throws Throwable {
    throw __call2051705_0(p0);
}
private static native long __fieldRead517_0() throws Throwable;
private static native int __call517_1() throws Throwable;
private static native int __call517_2(moom.r2 a0) throws Throwable;
private static native int __call517_3(moom.r2 a0) throws Throwable;
private static native int __invokedynamic517_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic517_5(int a0, long a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_6(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __call517_7(moom.r2 a0) throws Throwable;
private static native java.lang.Object __call517_8(moom.r2 a0) throws Throwable;
private static native java.lang.Byte __cast517_9(java.lang.Object a0) throws Throwable;
private static native byte __call517_10(java.lang.Byte a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_11(net.minecraft.network.PacketBuffer a0, byte a1) throws Throwable;
private static native java.lang.Object __call517_12(moom.r2 a0) throws Throwable;
private static native java.lang.Short __cast517_13(java.lang.Object a0) throws Throwable;
private static native short __call517_14(java.lang.Short a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_15(net.minecraft.network.PacketBuffer a0, short a1) throws Throwable;
private static native java.lang.Object __call517_16(moom.r2 a0) throws Throwable;
private static native java.lang.Integer __cast517_17(java.lang.Object a0) throws Throwable;
private static native int __call517_18(java.lang.Integer a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_19(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Object __call517_20(moom.r2 a0) throws Throwable;
private static native java.lang.Float __cast517_21(java.lang.Object a0) throws Throwable;
private static native float __call517_22(java.lang.Float a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_23(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native java.lang.Object __call517_24(moom.r2 a0) throws Throwable;
private static native java.lang.String __cast517_25(java.lang.Object a0) throws Throwable;
private static native net.minecraft.network.PacketBuffer __call517_26(net.minecraft.network.PacketBuffer a0, java.lang.String a1) throws Throwable;
private static native java.lang.Object __call517_27(moom.r2 a0) throws Throwable;
private static native net.minecraft.item.ItemStack __cast517_28(java.lang.Object a0) throws Throwable;
private static native void __call517_29(net.minecraft.network.PacketBuffer a0, net.minecraft.item.ItemStack a1) throws Throwable;
private static native java.lang.Object __call517_30(moom.r2 a0) throws Throwable;
private static native moom.DT __cast517_31(java.lang.Object a0) throws Throwable;
private static native int __call517_32(moom.DT a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_33(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __call517_34(moom.DT a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_35(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int __call517_36(moom.DT a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_37(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Object __call517_38(moom.r2 a0) throws Throwable;
private static native net.minecraft.util.Rotations __cast517_39(java.lang.Object a0) throws Throwable;
private static native float __call517_40(net.minecraft.util.Rotations a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_41(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native float __call517_42(net.minecraft.util.Rotations a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_43(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native float __call517_44(net.minecraft.util.Rotations a0) throws Throwable;
private static native io.netty.buffer.ByteBuf __call517_45(net.minecraft.network.PacketBuffer a0, float a1) throws Throwable;
private static native java.lang.Exception __call2051700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2051701_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2051702_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2051703_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2051704_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call2051705_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_15c595252932e4029b23(net.minecraft.entity.DataWatcher a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_15c595252932e4029b23 {

public static void f1487(net.minecraft.entity.DataWatcher receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int spill1487_0;
    long life2_3;
    int life4_9;
    java.util.Iterator life5_14;
    moom.r2 life6_21;
    lexical_join_41: {
    lexical_join_29: {
    life2_3 = (__fieldRead1487_0() ^ 50292890393982L);
    spill1487_0 = __call1487_1();
    __call1487_4(__call1487_3(__fieldRead1487_2(receiver)));
    life4_9 = spill1487_0;
    life5_14 = __call1487_7(__call1487_6(__fieldRead1487_5(receiver)));
    lexical_cycle_15: while (true) {
    if (!(__call1487_8(life5_14))) {
        break lexical_join_29;
    }
    life6_21 = __cast1487_10(__call1487_9(life5_14));
    __call1487_11(p0, life6_21);
    if (!((life4_9 != 0))) {
        break lexical_join_41;
    }
    if (!((life4_9 == 0))) { continue lexical_cycle_15; }
    break lexical_cycle_15;
    }
    }
    __call1487_14(__call1487_13(__fieldRead1487_12(receiver)));
    __call1487_16(p0, __invokedynamic1487_15(29360, (4835910999343480111L ^ life2_3)));
    }
    return;
}
public static void h1487_0(java.io.IOException p0) throws Throwable {
    throw __call1148700_0(p0);
}
private static native long __fieldRead1487_0() throws Throwable;
private static native int __call1487_1() throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1487_2(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1487_3(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1487_4(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native java.util.Map __fieldRead1487_5(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.Collection __call1487_6(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1487_7(java.util.Collection a0) throws Throwable;
private static native boolean __call1487_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1487_9(java.util.Iterator a0) throws Throwable;
private static native moom.r2 __cast1487_10(java.lang.Object a0) throws Throwable;
private static native void __call1487_11(net.minecraft.network.PacketBuffer a0, moom.r2 a1) throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1487_12(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1487_13(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1487_14(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native int __invokedynamic1487_15(int a0, long a1) throws Throwable;
private static native io.netty.buffer.ByteBuf __call1487_16(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native java.lang.Exception __call1148700_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> java.util.List __sourceHandlerCall_c3cfbcba377709c0ec34(net.minecraft.entity.DataWatcher a0) throws E;
private static final class __SourceHandler_c3cfbcba377709c0ec34 {

public static java.util.List f1488(net.minecraft.entity.DataWatcher receiver) throws Throwable {
    java.util.ArrayList lexicalValue1488_33_0;
    java.util.ArrayList lexicalValue1488_43_0;
    int spill1488_0;
    java.util.ArrayList spill1488_1;
    long life1_3;
    java.util.ArrayList life4_5;
    java.util.Iterator life5_15;
    int life3_16;
    moom.r2 life6_23;
    lexical_join_43: {
    lexical_join_38: {
    life1_3 = (__fieldRead1488_0() ^ 34966667557154L);
    life4_5 = null;
    __call1488_3(__call1488_2(__fieldRead1488_1(receiver)));
    spill1488_0 = __call1488_4();
    life5_15 = __call1488_7(__call1488_6(__fieldRead1488_5(receiver)));
    life3_16 = spill1488_0;
    lexical_cycle_17: while (true) {
    lexical_join_33: {
    lexical_join_32: {
    if (!(__call1488_8(life5_15))) {
        break lexical_join_38;
    }
    life6_23 = __cast1488_10(__call1488_9(life5_15));
    spill1488_1 = life4_5;
    if (!((life3_16 == 0))) {
        lexicalValue1488_43_0 = spill1488_1;
        break lexical_join_43;
    }
    if (!((life3_16 == 0))) {
        lexicalValue1488_33_0 = spill1488_1;
        break lexical_join_33;
    }
    if (!((spill1488_1 == null))) {
        break lexical_join_32;
    }
    life4_5 = __call1488_11();
    }
    lexicalValue1488_33_0 = life4_5;
    }
    __call1488_12(lexicalValue1488_33_0, life6_23);
    if (!((life3_16 != 0))) { continue lexical_cycle_17; }
    break lexical_cycle_17;
    }
    }
    __call1488_15(__call1488_14(__fieldRead1488_13(receiver)));
    lexicalValue1488_43_0 = life4_5;
    }
    return lexicalValue1488_43_0;
}
public static void h1488_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148800_0(p0);
}
public static void h1488_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148801_0(p0);
}
private static native long __fieldRead1488_0() throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1488_1(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1488_2(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1488_3(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native int __call1488_4() throws Throwable;
private static native java.util.Map __fieldRead1488_5(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.Collection __call1488_6(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1488_7(java.util.Collection a0) throws Throwable;
private static native boolean __call1488_8(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1488_9(java.util.Iterator a0) throws Throwable;
private static native moom.r2 __cast1488_10(java.lang.Object a0) throws Throwable;
private static native java.util.ArrayList __call1488_11() throws Throwable;
private static native boolean __call1488_12(java.util.ArrayList a0, moom.r2 a1) throws Throwable;
private static native java.util.concurrent.locks.ReadWriteLock __fieldRead1488_13(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native java.util.concurrent.locks.Lock __call1488_14(java.util.concurrent.locks.ReadWriteLock a0) throws Throwable;
private static native void __call1488_15(java.util.concurrent.locks.Lock a0) throws Throwable;
private static native java.lang.Exception __call1148800_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148801_0(java.lang.IllegalArgumentException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_70d08c51c4d85dfad5e2(net.minecraft.entity.DataWatcher a0, int a1, java.lang.Object a2) throws E;
private static final class __SourceHandler_70d08c51c4d85dfad5e2 {

public static void f1489(net.minecraft.entity.DataWatcher receiver, int p0, java.lang.Object p1) throws Throwable {
    long life3_3;
    moom.r2 life6_8;
    int life5_9;
    forward_join_30: {
    forward_join_27: {
    life3_3 = (__fieldRead1489_0() ^ 9377639246531L);
    int spill1489_0 = __call1489_1();
    life6_8 = __call1489_2(receiver, p0);
    life5_9 = spill1489_0;
    if (!((life5_9 == 0))) { break forward_join_27; }
    if (!(__call1489_4(p1, __call1489_3(life6_8)))) { break forward_join_30; }
    __call1489_5(life6_8, p1);
    __call1489_7(__fieldRead1489_6(receiver), p0);
    __call1489_8(life6_8, 1);
    }
    __fieldWrite1489_9(receiver, 1);
    }
    return;
}
public static void h1489_0(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148900_0(p0);
}
public static void h1489_1(java.lang.IllegalArgumentException p0) throws Throwable {
    throw __call1148901_0(p0);
}
private static native long __fieldRead1489_0() throws Throwable;
private static native int __call1489_1() throws Throwable;
private static native moom.r2 __call1489_2(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native java.lang.Object __call1489_3(moom.r2 a0) throws Throwable;
private static native boolean __call1489_4(java.lang.Object a0, java.lang.Object a1) throws Throwable;
private static native void __call1489_5(moom.r2 a0, java.lang.Object a1) throws Throwable;
private static native net.minecraft.entity.Entity __fieldRead1489_6(net.minecraft.entity.DataWatcher a0) throws Throwable;
private static native void __call1489_7(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __call1489_8(moom.r2 a0, int a1) throws Throwable;
private static native void __fieldWrite1489_9(net.minecraft.entity.DataWatcher a0, int a1) throws Throwable;
private static native java.lang.Exception __call1148900_0(java.lang.IllegalArgumentException a0) throws Throwable;
private static native java.lang.Exception __call1148901_0(java.lang.IllegalArgumentException a0) throws Throwable;

}


public java.util.List<moom.r2> b() { return __sourceHandlerCall_c3cfbcba377709c0ec34(this); }


public boolean b__Boolean() {
return ((((this.b) ? 1 : 0)) != 0);
}


public <T> void b(int p0, T p1) { __sourceHandlerCall_70d08c51c4d85dfad5e2(this, p0, p1); }


private static void a(net.minecraft.network.PacketBuffer p0, moom.r2 p1) throws java.io.IOException { __sourceHandlerCall_0df0778f371269674c5e(p0, p1); }


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.entity.DataWatcher.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11070_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/r1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a__Void(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_15c595252932e4029b23(this, p0); }


public java.util.List<moom.r2> a() { return __sourceHandlerCall_63373924b13305dd2667(this); }


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a__Void() {
this.e = ((boolean)(false));
    return;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23564;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/r1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


public void a(java.util.List<moom.r2> p0) { __sourceHandlerCall_aee42921b5a0ebad3d03(this, p0); }


public static java.util.List<moom.r2> a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { return __sourceHandlerCall_d4aabef69f3a17d31209(p0); }


public short a__Short(int p0) {
return ((java.lang.Short)(((java.lang.Short)(((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).a__Object())))).shortValue();
}


public int a__Int(int p0) {
return ((java.lang.Integer)(((java.lang.Integer)(((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).a__Object())))).intValue();
}


public float a__Float(int p0) {
return ((java.lang.Float)(((java.lang.Float)(((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).a__Object())))).floatValue();
}


public java.lang.String a__String(int p0) {
return ((java.lang.String)(((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).a__Object()));
}


public byte a(int p0) {
return ((java.lang.Byte)(((java.lang.Byte)(((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).a__Object())))).byteValue();
}


public void a(int p0, int p1) {
moom.r2 local3 = new moom.r2(p1, p0, null);
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.f)).writeLock())).lock();
    ((java.util.Map)(this.d)).put(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))), ((java.lang.Object)(local3)));
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.f)).writeLock())).unlock();
    this.b = ((boolean)(false));
    return;
}


public <T> void a(int p0, T p1) { __sourceHandlerCall_c5de2d5533c6cd5b4d9b(this, p0, p1); }


public static void a(java.util.List<moom.r2> p0, net.minecraft.network.PacketBuffer p1) throws java.io.IOException { __sourceHandlerCall_f489b35046268ed92eda(p0, p1); }


public boolean a__Boolean() {
return ((((this.e) ? 1 : 0)) != 0);
}


public void a__Void(int p0) {
((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).d = ((boolean)(true));
    this.e = ((boolean)(true));
    return;
}


public net.minecraft.util.Rotations a__DF(int p0) {
return ((net.minecraft.util.Rotations)(((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).a__Object()));
}


private moom.r2 a__r2(int p0) {
moom.r2 life2_10;
    moom.qY life4_16;
    moom.qZ life5_20;
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.f)).readLock())).lock();
    try {
        life2_10 = ((moom.r2)(((java.util.Map)(this.d)).get(((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))))));
    } catch (java.lang.Throwable life3_12) {
        life4_16 = moom.qY.a(((java.lang.Throwable)(life3_12)), ((java.lang.String)("Getting synched entity data")));
        life5_20 = ((moom.qY)(life4_16)).a(((java.lang.String)("Synched entity data")));
        ((moom.qZ)(life5_20)).a(((java.lang.String)("Data ID")), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(p0))))));
        throw new moom.Oo(life4_16);
    }
    ((java.util.concurrent.locks.Lock)(((java.util.concurrent.locks.ReadWriteLock)(this.f)).readLock())).unlock();
    return life2_10;
}


public net.minecraft.item.ItemStack a__xW(int p0) {
return ((net.minecraft.item.ItemStack)(((moom.r2)(((net.minecraft.entity.DataWatcher)(this)).a__r2(((int)(p0))))).a__Object()));
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1846_80(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1846_85(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11070_0() throws E;
}
