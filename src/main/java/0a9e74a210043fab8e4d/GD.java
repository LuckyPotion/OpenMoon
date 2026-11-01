package moom;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public abstract class GD {

private long a;

protected moom.GD b;

private long c;

protected long d;

private static net.minecraft.entity.Entity[] e;

private static long k;

private static long[] m;

private static java.lang.Integer[] n;

private static java.util.Map o;

private static long[] s;

private static java.lang.Long[] t;

private static java.util.Map u;

public GD(long p0) { super(); }

private static void __sourceConstructorBody_f1503469504a33e0(moom.GD receiver, long p0) throws Throwable {
long local3_life1 = (moom.GD.k ^ 4445066630833L);
    moom.GD.__sourceConstructorInit_f1503469504a33e0_0(((moom.GD)(receiver)));
    ((moom.GD)(receiver)).d = ((long)(p0));
    receiver.d *= ((((moom.GD)(receiver)).d * __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_6(27564, (9167126293241282584L ^ local3_life1))) + __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_7(27789, (5308816946206623549L ^ local3_life1)));
    receiver.d += p0;
    receiver.d *= ((((moom.GD)(receiver)).d * __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_11(27564, (9167126293241282584L ^ local3_life1))) + __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_12(27789, (5308816946206623549L ^ local3_life1)));
    receiver.d += p0;
    receiver.d *= ((((moom.GD)(receiver)).d * __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_16(27564, (9167126293241282584L ^ local3_life1))) + __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_17(27789, (5308816946206623549L ^ local3_life1)));
    receiver.d += p0;
    return;
}


static {
k = ((long)(((moom._a)(moom._c.a(((long)(4401739997739069356L)), ((long)(1582450901891571004L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(222824878750325L)))));
    net.minecraft.entity.Entity[] __sourceSpill548_6 = new net.minecraft.entity.Entity[3];
    o = ((java.util.Map)(new java.util.HashMap(13)));
    moom.GD.b(((net.minecraft.entity.Entity[])(__sourceSpill548_6)));
    long local11_life9 = (moom.GD.k ^ 23802046735010L);
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill548_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill548_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill548_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill548_16 = new byte[8];
    (__sourceSpill548_16)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill548_16)[local14_life17] = ((byte) ((int) ((local11_life9 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation548_18 = __sourceSpill548_16;
    ((javax.crypto.Cipher)(__sourceSpill548_13)).init(((int)(__sourceSpill548_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill548_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation548_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[3];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "9\037Ô\tûl\177Gj¿®0 ÖÉ\\NKý@ZW\016"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill548_27 = local17_life23;
        int __sourceSpill548_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill548_27)).substring(((int)(__sourceSpill548_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill548_32 = local19_life21;
        int __sourceSpill548_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill548_35 = new byte[8];
        (__sourceSpill548_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill548_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill548_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill548_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill548_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill548_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill548_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill548_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill548_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill548_36)).doFinal(((byte[])(__sourceSpill548_35)));
        (__sourceSpill548_32)[__sourceSpill548_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    m = ((long[])(local19_life21));
    n = ((java.lang.Integer[])(new java.lang.Integer[3]));
    u = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life43;
    javax.crypto.Cipher __sourceSpill548_45 = (local0_life43 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill548_46 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill548_47 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill548_48 = new byte[8];
    (__sourceSpill548_48)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local1_life49 = 1;
    while ((local1_life49 < 8)) {
        (__sourceSpill548_48)[local1_life49] = ((byte) ((int) ((local11_life9 << (local1_life49 * 8)) >>> 56)));
        local1_life49 += 1;
    }
    byte[] __sourcePreallocation548_50 = __sourceSpill548_48;
    ((javax.crypto.Cipher)(__sourceSpill548_45)).init(((int)(__sourceSpill548_46)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill548_47)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation548_50)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life53 = new long[24];
    int local3_life54 = 0;
    java.lang.String local4_life55;
    int local5_life57 = ((java.lang.String)((local4_life55 = "óBÙ»©s´Ø÷\031_ðE\004|Ù¬¯Ï\021¦\035f¸hCµÍQù0äÔÐ/ÖS\\1îoYý\035\\]/ñsþS×éî]\005\0323l\021÷\003%\031çºx±_Óª¶5ñ-õé×*ìÀ'\017\031÷\\¤B\006Zä¦F³\036\023Ïü\030äÌV8þM\032æüø\025\nt\020\f>\020ë!S\020¼/Zª`M\030÷ \b\027Ó`\020½¥Éê¢jªCÔÔ¹ÀÍÊ7N"))).length();
    int local2_life58 = 0;
    do {
        java.lang.String __sourceSpill548_59 = local4_life55;
        int __sourceSpill548_60 = local2_life58;
        local2_life58 += 8;
        byte[] local7_life63 = ((java.lang.String)(((java.lang.String)(__sourceSpill548_59)).substring(((int)(__sourceSpill548_60)), ((int)(local2_life58))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill548_64 = local6_life53;
        int __sourceSpill548_65 = local3_life54;
        local3_life54 += 1;
        long local8_life66 = (((((((((((long) (local7_life63)[0]) & 255L) << 56) | ((((long) (local7_life63)[1]) & 255L) << 48)) | ((((long) (local7_life63)[2]) & 255L) << 40)) | ((((long) (local7_life63)[3]) & 255L) << 32)) | ((((long) (local7_life63)[4]) & 255L) << 24)) | ((((long) (local7_life63)[5]) & 255L) << 16)) | ((((long) (local7_life63)[6]) & 255L) << 8)) | (((long) (local7_life63)[7]) & 255L));
        byte[] __sourceSpill548_67 = new byte[8];
        (__sourceSpill548_67)[0] = ((byte) ((int) (local8_life66 >>> 56)));
        (__sourceSpill548_67)[1] = ((byte) ((int) (local8_life66 >>> 48)));
        (__sourceSpill548_67)[2] = ((byte) ((int) (local8_life66 >>> 40)));
        (__sourceSpill548_67)[3] = ((byte) ((int) (local8_life66 >>> 32)));
        (__sourceSpill548_67)[4] = ((byte) ((int) (local8_life66 >>> 24)));
        (__sourceSpill548_67)[5] = ((byte) ((int) (local8_life66 >>> 16)));
        (__sourceSpill548_67)[6] = ((byte) ((int) (local8_life66 >>> 8)));
        (__sourceSpill548_67)[7] = ((byte) ((int) local8_life66));
        javax.crypto.Cipher __sourceSpill548_68 = local0_life43;
        byte[] local10_life70 = ((javax.crypto.Cipher)(__sourceSpill548_68)).doFinal(((byte[])(__sourceSpill548_67)));
        (__sourceSpill548_64)[__sourceSpill548_65] = (((((((((((long) (local10_life70)[0]) & 255L) << 56) | ((((long) (local10_life70)[1]) & 255L) << 48)) | ((((long) (local10_life70)[2]) & 255L) << 40)) | ((((long) (local10_life70)[3]) & 255L) << 32)) | ((((long) (local10_life70)[4]) & 255L) << 24)) | ((((long) (local10_life70)[5]) & 255L) << 16)) | ((((long) (local10_life70)[6]) & 255L) << 8)) | (((long) (local10_life70)[7]) & 255L));
    } while ((!(local2_life58 >= local5_life57)));
    local5_life57 = ((java.lang.String)((local4_life55 = "\\¤<g%sqË\020÷üèfª"))).length();
    local2_life58 = 0;
    do {
        java.lang.String __sourceSpill548_72 = local4_life55;
        int __sourceSpill548_73 = local2_life58;
        local2_life58 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill548_72)).substring(((int)(__sourceSpill548_73)), ((int)(local2_life58))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill548_77 = local6_life53;
        int __sourceSpill548_78 = local3_life54;
        local3_life54 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill548_80 = new byte[8];
        (__sourceSpill548_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill548_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill548_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill548_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill548_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill548_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill548_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill548_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill548_81 = local0_life43;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill548_81)).doFinal(((byte[])(__sourceSpill548_80)));
        (__sourceSpill548_77)[__sourceSpill548_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life58 >= local5_life57)));
    s = ((long[])(local6_life53));
    t = ((java.lang.Long[])(new java.lang.Long[24]));
}

private static native <E extends Throwable> void __sourceConstructorInit_f1503469504a33e0_0(moom.GD a0) throws E;
private static native <E extends Throwable> int __sourceHandlerCall_8f5859eb60c7be1d9ec1(moom.GD a0, int a1) throws E;
private static final class __SourceHandler_8f5859eb60c7be1d9ec1 {

public static int f64(moom.GD receiver, int p0) throws Throwable {
    int forwardValue64_54_0;
    net.minecraft.entity.Entity[] spill64_0;
    int spill64_1;
    long life2_3;
    int life5_17;
    net.minecraft.entity.Entity[] life4_18;
    forward_join_54: {
    forward_join_27: {
    life2_3 = (__fieldRead64_0() ^ 86565267758540L);
    spill64_0 = __call64_1();
    life5_17 = ((int) ((__fieldRead64_2(receiver) >> __invokedynamic64_3(24873, (1386459835276793559L ^ life2_3))) % ((long) p0)));
    life4_18 = spill64_0;
    spill64_1 = life5_17;
    if (!((life4_18 != null))) {
        forwardValue64_54_0 = spill64_1;
        break forward_join_54;
    }
    if (!((spill64_1 < 0))) {
        break forward_join_27;
    }
    life5_17 = (life5_17 + p0);
    }
    moom.GD __stackOp64_4_0 = receiver;
    __fieldWrite64_9(__stackOp64_4_0, (__fieldRead64_5(__stackOp64_4_0) * ((__fieldRead64_6(receiver) * __invokedynamic64_7(3481, (6574324758192352584L ^ life2_3))) + __invokedynamic64_8(3940, (2769788302929620926L ^ life2_3)))));
    moom.GD __stackOp64_10_0 = receiver;
    __fieldWrite64_13(__stackOp64_10_0, (__fieldRead64_11(__stackOp64_10_0) + __fieldRead64_12(receiver)));
    forwardValue64_54_0 = life5_17;
    }
    return forwardValue64_54_0;
}
public static void h64_0(moom.Oo p0) throws Throwable {
    throw __call1006400_0(p0);
}
private static native long __fieldRead64_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call64_1() throws Throwable;
private static native long __fieldRead64_2(moom.GD a0) throws Throwable;
private static native int __invokedynamic64_3(int a0, long a1) throws Throwable;
private static native long __fieldRead64_5(moom.GD a0) throws Throwable;
private static native long __fieldRead64_6(moom.GD a0) throws Throwable;
private static native long __invokedynamic64_7(int a0, long a1) throws Throwable;
private static native long __invokedynamic64_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite64_9(moom.GD a0, long a1) throws Throwable;
private static native long __fieldRead64_11(moom.GD a0) throws Throwable;
private static native long __fieldRead64_12(moom.GD a0) throws Throwable;
private static native void __fieldWrite64_13(moom.GD a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1006400_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_066b5a960295ebac01d6(int a0, int a1) throws E;
private static final class __SourceHandler_066b5a960295ebac01d6 {

public static boolean f179(int p0, int p1) throws Throwable {
    int forwardValue179_16_0;
    int forwardValue179_16_1;
    net.minecraft.world.biome.BiomeGenBase forwardValue179_36_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue179_40_0;
    int forwardValue179_46_0;
    int forwardValue179_48_0;
    int forwardValue179_54_0;
    int forwardValue179_54_1;
    int forwardValue179_62_0;
    int forwardValue179_64_0;
    int spill179_0;
    int spill179_1;
    int spill179_2;
    int spill179_3;
    net.minecraft.world.biome.BiomeGenBase spill179_4;
    boolean spill179_5;
    int spill179_6;
    int spill179_7;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    net.minecraft.world.biome.BiomeGenBase life5_41;
    net.minecraft.world.biome.BiomeGenBase life6_44;
    forward_join_64: {
    forward_join_63: {
    forward_join_62: {
    forward_join_61: {
    forward_join_54: {
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_40: {
    forward_join_36: {
    forward_join_16: {
    forward_join_13: {
    life2_3 = (__fieldRead179_0() ^ 2843720349727L);
    life4_5 = __call179_1();
    spill179_0 = p0;
    spill179_1 = p1;
    if (!((life4_5 != null))) {
        forwardValue179_16_0 = spill179_0;
        forwardValue179_16_1 = spill179_1;
        break forward_join_16;
    }
    if (!((spill179_0 == spill179_1))) {
        break forward_join_13;
    }
    return __integerCategory179_2(1);
    }
    forwardValue179_16_0 = p0;
    forwardValue179_16_1 = __fieldRead179_4(__fieldRead179_3());
    }
    if (!((life4_5 != null))) {
        forwardValue179_54_0 = forwardValue179_16_0;
        forwardValue179_54_1 = forwardValue179_16_1;
        break forward_join_54;
    }
    if (!((forwardValue179_16_0 != forwardValue179_16_1))) {
        break forward_join_49;
    }
    spill179_2 = p0;
    spill179_3 = __fieldRead179_6(__fieldRead179_5());
    if (!((life4_5 != null))) {
        forwardValue179_54_0 = spill179_2;
        forwardValue179_54_1 = spill179_3;
        break forward_join_54;
    }
    if (!((spill179_2 != spill179_3))) {
        break forward_join_49;
    }
    life5_41 = __call179_7(p0);
    life6_44 = __call179_8(p1);
    spill179_4 = life5_41;
    if (!((life4_5 != null))) {
        forwardValue179_36_0 = spill179_4;
        break forward_join_36;
    }
    if (!((spill179_4 != null))) {
        break forward_join_47;
    }
    forwardValue179_36_0 = life6_44;
    }
    if (!((life4_5 != null))) {
        forwardValue179_40_0 = forwardValue179_36_0;
        break forward_join_40;
    }
    if (!((forwardValue179_36_0 != null))) {
        break forward_join_47;
    }
    forwardValue179_40_0 = life5_41;
    }
    spill179_5 = __call179_9(forwardValue179_40_0, life6_44);
    if (!((life4_5 != null))) {
        forwardValue179_46_0 = __integerCategory179_10(spill179_5);
        break forward_join_46;
    }
    if (!(spill179_5)) {
        break forward_join_47;
    }
    forwardValue179_46_0 = 1;
    }
    forwardValue179_48_0 = forwardValue179_46_0;
    break forward_join_48;
    }
    forwardValue179_48_0 = 0;
    }
    return __integerCategory179_11(forwardValue179_48_0);
    }
    spill179_6 = p1;
    if (!((life4_5 != null))) {
        forwardValue179_62_0 = spill179_6;
        break forward_join_62;
    }
    forwardValue179_54_0 = spill179_6;
    forwardValue179_54_1 = __fieldRead179_13(__fieldRead179_12());
    }
    if (!((forwardValue179_54_0 != forwardValue179_54_1))) {
        break forward_join_61;
    }
    spill179_7 = p1;
    if (!((life4_5 != null))) {
        forwardValue179_62_0 = spill179_7;
        break forward_join_62;
    }
    if (!((spill179_7 == __fieldRead179_15(__fieldRead179_14())))) {
        break forward_join_63;
    }
    }
    forwardValue179_62_0 = 1;
    }
    forwardValue179_64_0 = forwardValue179_62_0;
    break forward_join_64;
    }
    forwardValue179_64_0 = 0;
    }
    return __integerCategory179_16(forwardValue179_64_0);
}
public static boolean h179_0(java.lang.Throwable p0) throws Throwable {
    throw __call2017900_0(p0);
}
public static boolean h179_1(java.lang.Throwable p0) throws Throwable {
    throw __call2017901_0(p0);
}
public static boolean h179_2(java.lang.Throwable p0) throws Throwable {
    throw __call2017902_0(p0);
}
public static boolean h179_3(java.lang.Throwable p0) throws Throwable {
    throw __call2017903_0(p0);
}
public static boolean h179_4(java.lang.Throwable p0) throws Throwable {
    throw __call2017904_0(p0);
}
public static boolean h179_5(java.lang.Throwable p0) throws Throwable {
    throw __call2017905_0(p0);
}
public static boolean h179_6(java.lang.Throwable p0) throws Throwable {
    throw __call2017906_0(p0);
}
public static boolean h179_7(java.lang.Throwable p0) throws Throwable {
    throw __call2017907_0(p0);
}
public static boolean h179_8(java.lang.Throwable p0, int p1, int p2, net.minecraft.world.biome.BiomeGenBase p3, net.minecraft.world.biome.BiomeGenBase p4) throws Throwable {
    java.lang.Throwable local5 = p0;
    moom.qY local6 = __call2017908_0(local5, "Comparing biomes");
    moom.qZ local7 = __call2017908_1(local6, "Biomes being compared");
    __call2017908_3(local7, "Biome A ID", __call2017908_2(p1));
    __call2017908_5(local7, "Biome B ID", __call2017908_4(p2));
    __call2017908_7(local7, "Biome A", __invokedynamic2017908_6(p3));
    __call2017908_9(local7, "Biome B", __invokedynamic2017908_8(p4));
    throw new moom.Oo(local6);
}
public static boolean h179_9(java.lang.Throwable p0) throws Throwable {
    throw __call2017909_0(p0);
}
public static boolean h179_10(java.lang.Throwable p0) throws Throwable {
    throw __call2017910_0(p0);
}
public static boolean h179_11(java.lang.Throwable p0) throws Throwable {
    throw __call2017911_0(p0);
}
public static boolean h179_12(java.lang.Throwable p0) throws Throwable {
    throw __call2017912_0(p0);
}
private static native long __fieldRead179_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call179_1() throws Throwable;
private static native boolean __integerCategory179_2(int value) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead179_3() throws Throwable;
private static native int __fieldRead179_4(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead179_5() throws Throwable;
private static native int __fieldRead179_6(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call179_7(int a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call179_8(int a0) throws Throwable;
private static native boolean __call179_9(net.minecraft.world.biome.BiomeGenBase a0, net.minecraft.world.biome.BiomeGenBase a1) throws Throwable;
private static native int __integerCategory179_10(boolean value) throws Throwable;
private static native boolean __integerCategory179_11(int value) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead179_12() throws Throwable;
private static native int __fieldRead179_13(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead179_14() throws Throwable;
private static native int __fieldRead179_15(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native boolean __integerCategory179_16(int value) throws Throwable;
private static native java.lang.Throwable __call2017900_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017901_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017902_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017903_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017904_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017905_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017906_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017907_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2017908_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2017908_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __call2017908_2(int a0) throws Throwable;
private static native void __call2017908_3(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2017908_4(int a0) throws Throwable;
private static native void __call2017908_5(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2017908_6(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native void __call2017908_7(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2017908_8(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native void __call2017908_9(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;
private static native java.lang.Throwable __call2017909_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017910_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017911_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2017912_0(java.lang.Throwable a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_8dbee49c7289e602d211(moom.GD a0, int a1, int a2, int a3, int a4) throws E;
private static final class __SourceHandler_8dbee49c7289e602d211 {

public static int f640(moom.GD receiver, int p0, int p1, int p2, int p3) throws Throwable {
    int forwardValue640_20_0;
    int forwardValue640_20_1;
    int forwardValue640_32_0;
    int forwardValue640_32_1;
    int forwardValue640_44_0;
    int forwardValue640_44_1;
    int forwardValue640_56_0;
    int forwardValue640_56_1;
    int forwardValue640_68_0;
    int forwardValue640_68_1;
    int forwardValue640_80_0;
    int forwardValue640_80_1;
    int forwardValue640_92_0;
    int forwardValue640_92_1;
    int forwardValue640_104_0;
    int forwardValue640_104_1;
    int forwardValue640_116_0;
    int forwardValue640_116_1;
    int forwardValue640_123_0;
    int forwardValue640_123_1;
    int forwardValue640_125_0;
    int forwardValue640_146_0;
    int spill640_0;
    int spill640_1;
    int spill640_2;
    int spill640_3;
    int spill640_4;
    int spill640_5;
    int spill640_6;
    int spill640_7;
    int spill640_8;
    int spill640_9;
    int spill640_10;
    int spill640_11;
    int spill640_12;
    int spill640_13;
    int spill640_14;
    int spill640_15;
    int spill640_16;
    int spill640_17;
    int spill640_18;
    int spill640_19;
    int spill640_20;
    long life5_3;
    net.minecraft.entity.Entity[] life7_5;
    forward_join_146: {
    forward_join_126: {
    forward_join_125: {
    forward_join_123: {
    forward_join_116: {
    forward_join_114: {
    forward_join_104: {
    forward_join_102: {
    forward_join_92: {
    forward_join_90: {
    forward_join_80: {
    forward_join_78: {
    forward_join_68: {
    forward_join_66: {
    forward_join_56: {
    forward_join_54: {
    forward_join_44: {
    forward_join_42: {
    forward_join_32: {
    forward_join_30: {
    forward_join_20: {
    forward_join_18: {
    life5_3 = (__fieldRead640_0() ^ 8408398601604L);
    life7_5 = __call640_1();
    spill640_0 = p1;
    spill640_1 = p2;
    if (!((life7_5 != null))) {
        forwardValue640_20_0 = spill640_0;
        forwardValue640_20_1 = spill640_1;
        break forward_join_20;
    }
    if (!((spill640_0 == spill640_1))) {
        break forward_join_18;
    }
    spill640_2 = p2;
    spill640_3 = p3;
    if (!((life7_5 != null))) {
        forwardValue640_20_0 = spill640_2;
        forwardValue640_20_1 = spill640_3;
        break forward_join_20;
    }
    if (!((spill640_2 == spill640_3))) {
        break forward_join_18;
    }
    forwardValue640_146_0 = p1;
    break forward_join_146;
    }
    forwardValue640_20_0 = p0;
    forwardValue640_20_1 = p1;
    }
    if (!((life7_5 != null))) {
        forwardValue640_32_0 = forwardValue640_20_0;
        forwardValue640_32_1 = forwardValue640_20_1;
        break forward_join_32;
    }
    if (!((forwardValue640_20_0 == forwardValue640_20_1))) {
        break forward_join_30;
    }
    spill640_4 = p0;
    spill640_5 = p2;
    if (!((life7_5 != null))) {
        forwardValue640_32_0 = spill640_4;
        forwardValue640_32_1 = spill640_5;
        break forward_join_32;
    }
    if (!((spill640_4 == spill640_5))) {
        break forward_join_30;
    }
    forwardValue640_146_0 = p0;
    break forward_join_146;
    }
    forwardValue640_32_0 = p0;
    forwardValue640_32_1 = p1;
    }
    if (!((life7_5 != null))) {
        forwardValue640_44_0 = forwardValue640_32_0;
        forwardValue640_44_1 = forwardValue640_32_1;
        break forward_join_44;
    }
    if (!((forwardValue640_32_0 == forwardValue640_32_1))) {
        break forward_join_42;
    }
    spill640_6 = p0;
    spill640_7 = p3;
    if (!((life7_5 != null))) {
        forwardValue640_44_0 = spill640_6;
        forwardValue640_44_1 = spill640_7;
        break forward_join_44;
    }
    if (!((spill640_6 == spill640_7))) {
        break forward_join_42;
    }
    forwardValue640_146_0 = p0;
    break forward_join_146;
    }
    forwardValue640_44_0 = p0;
    forwardValue640_44_1 = p2;
    }
    if (!((life7_5 != null))) {
        forwardValue640_56_0 = forwardValue640_44_0;
        forwardValue640_56_1 = forwardValue640_44_1;
        break forward_join_56;
    }
    if (!((forwardValue640_44_0 == forwardValue640_44_1))) {
        break forward_join_54;
    }
    spill640_8 = p0;
    spill640_9 = p3;
    if (!((life7_5 != null))) {
        forwardValue640_56_0 = spill640_8;
        forwardValue640_56_1 = spill640_9;
        break forward_join_56;
    }
    if (!((spill640_8 == spill640_9))) {
        break forward_join_54;
    }
    forwardValue640_146_0 = p0;
    break forward_join_146;
    }
    forwardValue640_56_0 = p0;
    forwardValue640_56_1 = p1;
    }
    if (!((life7_5 != null))) {
        forwardValue640_68_0 = forwardValue640_56_0;
        forwardValue640_68_1 = forwardValue640_56_1;
        break forward_join_68;
    }
    if (!((forwardValue640_56_0 == forwardValue640_56_1))) {
        break forward_join_66;
    }
    spill640_10 = p2;
    spill640_11 = p3;
    if (!((life7_5 != null))) {
        forwardValue640_68_0 = spill640_10;
        forwardValue640_68_1 = spill640_11;
        break forward_join_68;
    }
    if (!((spill640_10 != spill640_11))) {
        break forward_join_66;
    }
    forwardValue640_146_0 = p0;
    break forward_join_146;
    }
    forwardValue640_68_0 = p0;
    forwardValue640_68_1 = p2;
    }
    if (!((life7_5 != null))) {
        forwardValue640_80_0 = forwardValue640_68_0;
        forwardValue640_80_1 = forwardValue640_68_1;
        break forward_join_80;
    }
    if (!((forwardValue640_68_0 == forwardValue640_68_1))) {
        break forward_join_78;
    }
    spill640_12 = p1;
    spill640_13 = p3;
    if (!((life7_5 != null))) {
        forwardValue640_80_0 = spill640_12;
        forwardValue640_80_1 = spill640_13;
        break forward_join_80;
    }
    if (!((spill640_12 != spill640_13))) {
        break forward_join_78;
    }
    forwardValue640_146_0 = p0;
    break forward_join_146;
    }
    forwardValue640_80_0 = p0;
    forwardValue640_80_1 = p3;
    }
    if (!((life7_5 != null))) {
        forwardValue640_92_0 = forwardValue640_80_0;
        forwardValue640_92_1 = forwardValue640_80_1;
        break forward_join_92;
    }
    if (!((forwardValue640_80_0 == forwardValue640_80_1))) {
        break forward_join_90;
    }
    spill640_14 = p1;
    spill640_15 = p2;
    if (!((life7_5 != null))) {
        forwardValue640_92_0 = spill640_14;
        forwardValue640_92_1 = spill640_15;
        break forward_join_92;
    }
    if (!((spill640_14 != spill640_15))) {
        break forward_join_90;
    }
    forwardValue640_146_0 = p0;
    break forward_join_146;
    }
    forwardValue640_92_0 = p1;
    forwardValue640_92_1 = p2;
    }
    if (!((life7_5 != null))) {
        forwardValue640_104_0 = forwardValue640_92_0;
        forwardValue640_104_1 = forwardValue640_92_1;
        break forward_join_104;
    }
    if (!((forwardValue640_92_0 == forwardValue640_92_1))) {
        break forward_join_102;
    }
    spill640_16 = p0;
    spill640_17 = p3;
    if (!((life7_5 != null))) {
        forwardValue640_104_0 = spill640_16;
        forwardValue640_104_1 = spill640_17;
        break forward_join_104;
    }
    if (!((spill640_16 != spill640_17))) {
        break forward_join_102;
    }
    forwardValue640_146_0 = p1;
    break forward_join_146;
    }
    forwardValue640_104_0 = p1;
    forwardValue640_104_1 = p3;
    }
    if (!((life7_5 != null))) {
        forwardValue640_116_0 = forwardValue640_104_0;
        forwardValue640_116_1 = forwardValue640_104_1;
        break forward_join_116;
    }
    if (!((forwardValue640_104_0 == forwardValue640_104_1))) {
        break forward_join_114;
    }
    spill640_18 = p0;
    spill640_19 = p2;
    if (!((life7_5 != null))) {
        forwardValue640_116_0 = spill640_18;
        forwardValue640_116_1 = spill640_19;
        break forward_join_116;
    }
    if (!((spill640_18 != spill640_19))) {
        break forward_join_114;
    }
    forwardValue640_146_0 = p1;
    break forward_join_146;
    }
    forwardValue640_116_0 = p2;
    forwardValue640_116_1 = p3;
    }
    if (!((life7_5 != null))) {
        forwardValue640_123_0 = forwardValue640_116_0;
        forwardValue640_123_1 = forwardValue640_116_1;
        break forward_join_123;
    }
    if (!((forwardValue640_116_0 == forwardValue640_116_1))) {
        break forward_join_126;
    }
    spill640_20 = p0;
    if (!((life7_5 != null))) {
        forwardValue640_125_0 = spill640_20;
        break forward_join_125;
    }
    forwardValue640_123_0 = spill640_20;
    forwardValue640_123_1 = p1;
    }
    if (!((forwardValue640_123_0 != forwardValue640_123_1))) {
        break forward_join_126;
    }
    forwardValue640_125_0 = p2;
    }
    forwardValue640_146_0 = forwardValue640_125_0;
    break forward_join_146;
    }
    forwardValue640_146_0 = __call640_2(receiver, new int[] {p0, p1, p2, p3});
    }
    return forwardValue640_146_0;
}
public static void h640_0(moom.Oo p0) throws Throwable {
    throw __call1064000_0(p0);
}
public static void h640_1(moom.Oo p0) throws Throwable {
    throw __call1064001_0(p0);
}
public static void h640_2(moom.Oo p0) throws Throwable {
    throw __call1064002_0(p0);
}
public static void h640_3(moom.Oo p0) throws Throwable {
    throw __call1064003_0(p0);
}
public static void h640_4(moom.Oo p0) throws Throwable {
    throw __call1064004_0(p0);
}
public static void h640_5(moom.Oo p0) throws Throwable {
    throw __call1064005_0(p0);
}
public static void h640_6(moom.Oo p0) throws Throwable {
    throw __call1064006_0(p0);
}
public static void h640_7(moom.Oo p0) throws Throwable {
    throw __call1064007_0(p0);
}
public static void h640_8(moom.Oo p0) throws Throwable {
    throw __call1064008_0(p0);
}
public static void h640_9(moom.Oo p0) throws Throwable {
    throw __call1064009_0(p0);
}
public static void h640_10(moom.Oo p0) throws Throwable {
    throw __call1064010_0(p0);
}
public static void h640_11(moom.Oo p0) throws Throwable {
    throw __call1064011_0(p0);
}
public static void h640_12(moom.Oo p0) throws Throwable {
    throw __call1064012_0(p0);
}
public static void h640_13(moom.Oo p0) throws Throwable {
    throw __call1064013_0(p0);
}
public static void h640_14(moom.Oo p0) throws Throwable {
    throw __call1064014_0(p0);
}
public static void h640_15(moom.Oo p0) throws Throwable {
    throw __call1064015_0(p0);
}
public static void h640_16(moom.Oo p0) throws Throwable {
    throw __call1064016_0(p0);
}
public static void h640_17(moom.Oo p0) throws Throwable {
    throw __call1064017_0(p0);
}
public static void h640_18(moom.Oo p0) throws Throwable {
    throw __call1064018_0(p0);
}
public static void h640_19(moom.Oo p0) throws Throwable {
    throw __call1064019_0(p0);
}
public static void h640_20(moom.Oo p0) throws Throwable {
    throw __call1064020_0(p0);
}
public static void h640_21(moom.Oo p0) throws Throwable {
    throw __call1064021_0(p0);
}
public static void h640_22(moom.Oo p0) throws Throwable {
    throw __call1064022_0(p0);
}
public static void h640_23(moom.Oo p0) throws Throwable {
    throw __call1064023_0(p0);
}
public static void h640_24(moom.Oo p0) throws Throwable {
    throw __call1064024_0(p0);
}
public static void h640_25(moom.Oo p0) throws Throwable {
    throw __call1064025_0(p0);
}
public static void h640_26(moom.Oo p0) throws Throwable {
    throw __call1064026_0(p0);
}
public static void h640_27(moom.Oo p0) throws Throwable {
    throw __call1064027_0(p0);
}
public static void h640_28(moom.Oo p0) throws Throwable {
    throw __call1064028_0(p0);
}
public static void h640_29(moom.Oo p0) throws Throwable {
    throw __call1064029_0(p0);
}
public static void h640_30(moom.Oo p0) throws Throwable {
    throw __call1064030_0(p0);
}
public static void h640_31(moom.Oo p0) throws Throwable {
    throw __call1064031_0(p0);
}
public static void h640_32(moom.Oo p0) throws Throwable {
    throw __call1064032_0(p0);
}
public static void h640_33(moom.Oo p0) throws Throwable {
    throw __call1064033_0(p0);
}
public static void h640_34(moom.Oo p0) throws Throwable {
    throw __call1064034_0(p0);
}
public static void h640_35(moom.Oo p0) throws Throwable {
    throw __call1064035_0(p0);
}
public static void h640_36(moom.Oo p0) throws Throwable {
    throw __call1064036_0(p0);
}
public static void h640_37(moom.Oo p0) throws Throwable {
    throw __call1064037_0(p0);
}
public static void h640_38(moom.Oo p0) throws Throwable {
    throw __call1064038_0(p0);
}
private static native long __fieldRead640_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call640_1() throws Throwable;
private static native int __call640_2(moom.GD a0, int[] a1) throws Throwable;
private static native java.lang.Throwable __call1064000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064004_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064005_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064006_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064007_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064008_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064009_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064010_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064011_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064012_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064013_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064014_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064015_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064016_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064017_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064018_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064019_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064020_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064021_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064022_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064023_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064024_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064025_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064026_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064027_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064028_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064029_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064030_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064031_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064032_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064033_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064034_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064035_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064036_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064037_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064038_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ceb872f40d029b715330(moom.GD a0, long a1) throws E;
private static final class __SourceHandler_ceb872f40d029b715330 {

public static void f65(moom.GD receiver, long p0) throws Throwable {
    moom.GD forwardValue65_90_0;
    net.minecraft.entity.Entity[] spill65_0;
    moom.GD spill65_1;
    long life3_3;
    net.minecraft.entity.Entity[] life5_8;
    forward_join_90: {
    forward_join_18: {
    life3_3 = (__fieldRead65_0() ^ 24845772391588L);
    spill65_0 = __call65_1();
    __fieldWrite65_2(receiver, p0);
    life5_8 = spill65_0;
    spill65_1 = __fieldRead65_3(receiver);
    if (!((life5_8 != null))) {
        forwardValue65_90_0 = spill65_1;
        break forward_join_90;
    }
    if (!((spill65_1 != null))) {
        break forward_join_18;
    }
    __call65_5(__fieldRead65_4(receiver), p0);
    }
    moom.GD __stackOp65_6_0 = receiver;
    __fieldWrite65_11(__stackOp65_6_0, (__fieldRead65_7(__stackOp65_6_0) * ((__fieldRead65_8(receiver) * __invokedynamic65_9(27564, (9167145595199312397L ^ life3_3))) + __invokedynamic65_10(27789, (5308801063042045224L ^ life3_3)))));
    moom.GD __stackOp65_12_0 = receiver;
    __fieldWrite65_15(__stackOp65_12_0, (__fieldRead65_13(__stackOp65_12_0) + __fieldRead65_14(receiver)));
    moom.GD __stackOp65_16_0 = receiver;
    __fieldWrite65_21(__stackOp65_16_0, (__fieldRead65_17(__stackOp65_16_0) * ((__fieldRead65_18(receiver) * __invokedynamic65_19(27564, (9167145595199312397L ^ life3_3))) + __invokedynamic65_20(27789, (5308801063042045224L ^ life3_3)))));
    moom.GD __stackOp65_22_0 = receiver;
    __fieldWrite65_25(__stackOp65_22_0, (__fieldRead65_23(__stackOp65_22_0) + __fieldRead65_24(receiver)));
    moom.GD __stackOp65_26_0 = receiver;
    __fieldWrite65_31(__stackOp65_26_0, (__fieldRead65_27(__stackOp65_26_0) * ((__fieldRead65_28(receiver) * __invokedynamic65_29(27564, (9167145595199312397L ^ life3_3))) + __invokedynamic65_30(27789, (5308801063042045224L ^ life3_3)))));
    forwardValue65_90_0 = receiver;
    }
    moom.GD __stackOp65_32_0 = forwardValue65_90_0;
    __fieldWrite65_35(__stackOp65_32_0, (__fieldRead65_33(__stackOp65_32_0) + __fieldRead65_34(receiver)));
    return;
}
public static void h65_0(moom.Oo p0) throws Throwable {
    throw __call1006500_0(p0);
}
public static void h65_1(moom.Oo p0) throws Throwable {
    throw __call1006501_0(p0);
}
private static native long __fieldRead65_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call65_1() throws Throwable;
private static native void __fieldWrite65_2(moom.GD a0, long a1) throws Throwable;
private static native moom.GD __fieldRead65_3(moom.GD a0) throws Throwable;
private static native moom.GD __fieldRead65_4(moom.GD a0) throws Throwable;
private static native void __call65_5(moom.GD a0, long a1) throws Throwable;
private static native long __fieldRead65_7(moom.GD a0) throws Throwable;
private static native long __fieldRead65_8(moom.GD a0) throws Throwable;
private static native long __invokedynamic65_9(int a0, long a1) throws Throwable;
private static native long __invokedynamic65_10(int a0, long a1) throws Throwable;
private static native void __fieldWrite65_11(moom.GD a0, long a1) throws Throwable;
private static native long __fieldRead65_13(moom.GD a0) throws Throwable;
private static native long __fieldRead65_14(moom.GD a0) throws Throwable;
private static native void __fieldWrite65_15(moom.GD a0, long a1) throws Throwable;
private static native long __fieldRead65_17(moom.GD a0) throws Throwable;
private static native long __fieldRead65_18(moom.GD a0) throws Throwable;
private static native long __invokedynamic65_19(int a0, long a1) throws Throwable;
private static native long __invokedynamic65_20(int a0, long a1) throws Throwable;
private static native void __fieldWrite65_21(moom.GD a0, long a1) throws Throwable;
private static native long __fieldRead65_23(moom.GD a0) throws Throwable;
private static native long __fieldRead65_24(moom.GD a0) throws Throwable;
private static native void __fieldWrite65_25(moom.GD a0, long a1) throws Throwable;
private static native long __fieldRead65_27(moom.GD a0) throws Throwable;
private static native long __fieldRead65_28(moom.GD a0) throws Throwable;
private static native long __invokedynamic65_29(int a0, long a1) throws Throwable;
private static native long __invokedynamic65_30(int a0, long a1) throws Throwable;
private static native void __fieldWrite65_31(moom.GD a0, long a1) throws Throwable;
private static native long __fieldRead65_33(moom.GD a0) throws Throwable;
private static native long __fieldRead65_34(moom.GD a0) throws Throwable;
private static native void __fieldWrite65_35(moom.GD a0, long a1) throws Throwable;
private static native java.lang.Throwable __call1006500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1006501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.GD[] __sourceHandlerCall_649f6e8895ad2a756f78(long a0, net.minecraft.world.WorldType a1, java.lang.String a2) throws E;
private static final class __SourceHandler_649f6e8895ad2a756f78 {

public static moom.GD[] f266(long p0, net.minecraft.world.WorldType p1, java.lang.String p2) throws Throwable {
    java.lang.String forestValue266_204_0;
    int forestValue266_369_0;
    int forestValue266_375_0;
    int forestValue266_375_1;
    net.minecraft.entity.Entity[] spill266_0;
    java.lang.String spill266_1;
    int spill266_2;
    int spill266_3;
    moom.GD[] spill266_4;
    moom.GD[] spill266_5;
    moom.GD[] spill266_6;
    long life4_3;
    moom.GM life7_8;
    moom.GW life7_18;
    moom.GE life8_24;
    moom.GV life9_34;
    moom.GE life10_44;
    moom.GE life10_54;
    moom.GE life10_64;
    moom.GO life11_74;
    moom.GG life12_84;
    moom.GE life13_94;
    moom.GK life14_106;
    moom.GK life14_117;
    moom.GK life14_128;
    moom.GV life15_138;
    moom.GV life15_148;
    moom.GE life16_158;
    moom.GF life17_168;
    moom.GJ life18_178;
    net.minecraft.entity.Entity[] life6_179;
    moom.GD life19_188;
    java.lang.Object life20_190;
    int life21_192;
    int life22_194;
    moom.FD life20_209;
    moom.GD life23_233;
    moom.GQ life24_243;
    moom.GH life25_255;
    moom.GD life26_264;
    moom.GI life27_274;
    moom.GD life28_283;
    moom.GL life29_294;
    moom.GD life30_303;
    moom.GD life30_312;
    moom.GP life31_318;
    moom.GT life32_328;
    moom.GD life29_338;
    int life33_340;
    moom.GT life33_407;
    moom.GR life34_418;
    moom.GU life35_428;
    forest_join_392: {
    forest_join_222: {
    forest_join_213: {
    forest_join_204: {
    life4_3 = (__fieldRead266_0() ^ 50050690057283L);
    life7_8 = new moom.GM(1L);
    life7_18 = new moom.GW(__invokedynamic266_1(26937, (6078100046789202046L ^ life4_3)), life7_8);
    life8_24 = new moom.GE(1L, life7_18);
    life9_34 = new moom.GV(__invokedynamic266_2(18153, (2084323528813936557L ^ life4_3)), life8_24);
    life10_44 = new moom.GE(__invokedynamic266_3(4415, (6080986815177828448L ^ life4_3)), life9_34);
    life10_54 = new moom.GE(__invokedynamic266_4(9845, (7633516991105539878L ^ life4_3)), life10_44);
    life10_64 = new moom.GE(__invokedynamic266_5(16608, (1800476385953085874L ^ life4_3)), life10_54);
    life11_74 = new moom.GO(__invokedynamic266_6(10161, (5989162599989583600L ^ life4_3)), life10_64);
    life12_84 = new moom.GG(__invokedynamic266_7(10161, (5989162599989583600L ^ life4_3)), life11_74);
    life13_94 = new moom.GE(__invokedynamic266_8(20234, (1125497986200434263L ^ life4_3)), life12_84);
    spill266_0 = __call266_9();
    life14_106 = new moom.GK(__invokedynamic266_10(10161, (5989162599989583600L ^ life4_3)), life13_94, __fieldRead266_11());
    life14_117 = new moom.GK(__invokedynamic266_12(10161, (5989162599989583600L ^ life4_3)), life14_106, __fieldRead266_13());
    life14_128 = new moom.GK(__invokedynamic266_14(5147, (5455656263353183563L ^ life4_3)), life14_117, __fieldRead266_15());
    life15_138 = new moom.GV(__invokedynamic266_16(24576, (3013902291360766297L ^ life4_3)), life14_128);
    life15_148 = new moom.GV(__invokedynamic266_17(12137, (4917850901614794296L ^ life4_3)), life15_138);
    life16_158 = new moom.GE(__invokedynamic266_18(30608, (694803004426964682L ^ life4_3)), life15_148);
    life17_168 = new moom.GF(__invokedynamic266_19(23549, (6546130939057988286L ^ life4_3)), life16_158);
    life18_178 = new moom.GJ(__invokedynamic266_20(31709, (6146140648844575370L ^ life4_3)), life17_168);
    life6_179 = spill266_0;
    life19_188 = __call266_22(__invokedynamic266_21(29752, (909294583203908960L ^ life4_3)), life18_178, 0);
    life20_190 = null;
    life21_192 = 4;
    life22_194 = life21_192;
    if (!((p1 == __fieldRead266_23()))) {
        break forest_join_213;
    }
    spill266_1 = p2;
    if (!((life6_179 != null))) {
        forestValue266_204_0 = spill266_1;
        break forest_join_204;
    }
    if (!((__call266_24(spill266_1) > 0))) {
        break forest_join_213;
    }
    forestValue266_204_0 = p2;
    }
    life20_209 = __call266_26(__call266_25(forestValue266_204_0));
    life21_192 = __fieldRead266_27(life20_209);
    life22_194 = __fieldRead266_28(life20_209);
    }
    if (!((p1 == __fieldRead266_29()))) {
        break forest_join_222;
    }
    life21_192 = __invokedynamic266_30(28983, (1701397959109107525L ^ life4_3));
    }
    life23_233 = __call266_32(__invokedynamic266_31(26359, (3027732529588232108L ^ life4_3)), life19_188, 0);
    life24_243 = new moom.GQ(__invokedynamic266_33(8703, (2596932036786722979L ^ life4_3)), life23_233);
    life25_255 = new moom.GH(__invokedynamic266_34(19078, (1421874801423643602L ^ life4_3)), life19_188, p1, p2);
    life26_264 = __call266_36(__invokedynamic266_35(26359, (3027732529588232108L ^ life4_3)), life25_255, 2);
    life27_274 = new moom.GI(__invokedynamic266_37(26359, (3027732529588232108L ^ life4_3)), life26_264);
    life28_283 = __call266_39(__invokedynamic266_38(26359, (3027732529588232108L ^ life4_3)), life24_243, 2);
    life29_294 = new moom.GL(__invokedynamic266_40(26359, (3027732529588232108L ^ life4_3)), life27_274, life28_283);
    life30_303 = __call266_42(__invokedynamic266_41(26359, (3027732529588232108L ^ life4_3)), life24_243, 2);
    life30_312 = __call266_44(__invokedynamic266_43(26359, (3027732529588232108L ^ life4_3)), life30_303, life22_194);
    life31_318 = new moom.GP(1L, life30_312);
    life32_328 = new moom.GT(__invokedynamic266_45(26359, (3027732529588232108L ^ life4_3)), life31_318);
    life29_338 = new moom.GN(__invokedynamic266_46(16332, (4188620041737340553L ^ life4_3)), life29_294);
    life33_340 = 0;
    forest_cycle_338: while (true) {
    forest_join_386: {
    forest_join_376: {
    forest_join_375: {
    forest_join_369: {
    forest_join_368: {
    if (!((life33_340 < life21_192))) {
        break forest_join_392;
    }
    life29_338 = new moom.GV(((long) (__invokedynamic266_47(29969, (996635243721972577L ^ life4_3)) + life33_340)), life29_338);
    spill266_2 = life33_340;
    if (!((life6_179 != null))) {
        forestValue266_369_0 = spill266_2;
        break forest_join_369;
    }
    if (!((spill266_2 == 0))) {
        break forest_join_368;
    }
    life29_338 = new moom.GE(__invokedynamic266_48(5147, (5455656263353183563L ^ life4_3)), life29_338);
    }
    forestValue266_369_0 = life33_340;
    }
    spill266_3 = 1;
    if (!((life6_179 != null))) {
        forestValue266_375_0 = forestValue266_369_0;
        forestValue266_375_1 = spill266_3;
        break forest_join_375;
    }
    if (!((forestValue266_369_0 != spill266_3))) {
        break forest_join_376;
    }
    forestValue266_375_0 = life21_192;
    forestValue266_375_1 = 1;
    }
    if (!((forestValue266_375_0 == forestValue266_375_1))) {
        break forest_join_386;
    }
    }
    life29_338 = new moom.GS(__invokedynamic266_49(26359, (3027732529588232108L ^ life4_3)), life29_338);
    }
    life33_340 += 1;
    if (!((life6_179 == null))) {
        continue forest_cycle_338;
    }
    break forest_cycle_338;
    }
    __call266_50(new java.lang.String[3]);
    }
    life33_407 = new moom.GT(__invokedynamic266_51(26359, (3027732529588232108L ^ life4_3)), life29_338);
    life34_418 = new moom.GR(__invokedynamic266_52(30019, (7477372551215729685L ^ life4_3)), life33_407, life32_328);
    life35_428 = new moom.GU(__invokedynamic266_53(25508, (2262913235635559140L ^ life4_3)), life34_418);
    __call266_54(life34_418, p0);
    __call266_55(life35_428, p0);
    moom.GD[] __stackOp266_56_0 = new moom.GD[3];
    spill266_4 = __stackOp266_56_0;
    (__stackOp266_56_0)[0] = life34_418;
    moom.GD[] __stackOp266_57_0 = spill266_4;
    spill266_5 = __stackOp266_57_0;
    (__stackOp266_57_0)[1] = life35_428;
    moom.GD[] __stackOp266_58_0 = spill266_5;
    spill266_6 = __stackOp266_58_0;
    (__stackOp266_58_0)[2] = life34_418;
    return spill266_6;
}
public static moom.GD[] h266_0(moom.Oo p0) throws Throwable {
    throw __call3026600_0(p0);
}
public static moom.GD[] h266_1(moom.Oo p0) throws Throwable {
    throw __call3026601_0(p0);
}
public static moom.GD[] h266_2(moom.Oo p0) throws Throwable {
    throw __call3026602_0(p0);
}
public static moom.GD[] h266_3(moom.Oo p0) throws Throwable {
    throw __call3026603_0(p0);
}
public static moom.GD[] h266_4(moom.Oo p0) throws Throwable {
    throw __call3026604_0(p0);
}
public static moom.GD[] h266_5(moom.Oo p0) throws Throwable {
    throw __call3026605_0(p0);
}
private static native long __fieldRead266_0() throws Throwable;
private static native long __invokedynamic266_1(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_2(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_3(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_4(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_5(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_6(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_7(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_8(int a0, long a1) throws Throwable;
private static native net.minecraft.entity.Entity[] __call266_9() throws Throwable;
private static native long __invokedynamic266_10(int a0, long a1) throws Throwable;
private static native moom.bI __fieldRead266_11() throws Throwable;
private static native long __invokedynamic266_12(int a0, long a1) throws Throwable;
private static native moom.bI __fieldRead266_13() throws Throwable;
private static native long __invokedynamic266_14(int a0, long a1) throws Throwable;
private static native moom.bI __fieldRead266_15() throws Throwable;
private static native long __invokedynamic266_16(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_17(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_18(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_19(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_20(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_21(int a0, long a1) throws Throwable;
private static native moom.GD __call266_22(long a0, moom.GJ a1, int a2) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead266_23() throws Throwable;
private static native int __call266_24(java.lang.String a0) throws Throwable;
private static native moom.FE __call266_25(java.lang.String a0) throws Throwable;
private static native moom.FD __call266_26(moom.FE a0) throws Throwable;
private static native int __fieldRead266_27(moom.FD a0) throws Throwable;
private static native int __fieldRead266_28(moom.FD a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead266_29() throws Throwable;
private static native int __invokedynamic266_30(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_31(int a0, long a1) throws Throwable;
private static native moom.GD __call266_32(long a0, moom.GD a1, int a2) throws Throwable;
private static native long __invokedynamic266_33(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_34(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_35(int a0, long a1) throws Throwable;
private static native moom.GD __call266_36(long a0, moom.GH a1, int a2) throws Throwable;
private static native long __invokedynamic266_37(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_38(int a0, long a1) throws Throwable;
private static native moom.GD __call266_39(long a0, moom.GQ a1, int a2) throws Throwable;
private static native long __invokedynamic266_40(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_41(int a0, long a1) throws Throwable;
private static native moom.GD __call266_42(long a0, moom.GQ a1, int a2) throws Throwable;
private static native long __invokedynamic266_43(int a0, long a1) throws Throwable;
private static native moom.GD __call266_44(long a0, moom.GD a1, int a2) throws Throwable;
private static native long __invokedynamic266_45(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_46(int a0, long a1) throws Throwable;
private static native int __invokedynamic266_47(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_48(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_49(int a0, long a1) throws Throwable;
private static native void __call266_50(java.lang.String[] a0) throws Throwable;
private static native long __invokedynamic266_51(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_52(int a0, long a1) throws Throwable;
private static native long __invokedynamic266_53(int a0, long a1) throws Throwable;
private static native void __call266_54(moom.GR a0, long a1) throws Throwable;
private static native void __call266_55(moom.GU a0, long a1) throws Throwable;
private static native java.lang.Throwable __call3026600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3026601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3026602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3026603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3026604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3026605_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_2e7ea92a562be7b4a814(int a0) throws E;
private static final class __SourceHandler_2e7ea92a562be7b4a814 {

public static boolean f641(int p0) throws Throwable {
    int forwardValue641_25_0;
    int forwardValue641_27_0;
    int spill641_0;
    int spill641_1;
    int spill641_2;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_27: {
    forward_join_26: {
    forward_join_25: {
    forward_join_24: {
    life1_3 = (__fieldRead641_0() ^ 3583447141456L);
    life3_5 = __call641_1();
    spill641_0 = p0;
    if (!((life3_5 != null))) {
        forwardValue641_25_0 = spill641_0;
        break forward_join_25;
    }
    if (!((spill641_0 != __fieldRead641_3(__fieldRead641_2())))) {
        break forward_join_24;
    }
    spill641_1 = p0;
    if (!((life3_5 != null))) {
        forwardValue641_25_0 = spill641_1;
        break forward_join_25;
    }
    if (!((spill641_1 != __fieldRead641_5(__fieldRead641_4())))) {
        break forward_join_24;
    }
    spill641_2 = p0;
    if (!((life3_5 != null))) {
        forwardValue641_25_0 = spill641_2;
        break forward_join_25;
    }
    if (!((spill641_2 == __fieldRead641_7(__fieldRead641_6())))) {
        break forward_join_26;
    }
    }
    forwardValue641_25_0 = 1;
    }
    forwardValue641_27_0 = forwardValue641_25_0;
    break forward_join_27;
    }
    forwardValue641_27_0 = 0;
    }
    return __integerCategory641_8(forwardValue641_27_0);
}
public static void h641_0(moom.Oo p0) throws Throwable {
    throw __call1064100_0(p0);
}
public static void h641_1(moom.Oo p0) throws Throwable {
    throw __call1064101_0(p0);
}
public static void h641_2(moom.Oo p0) throws Throwable {
    throw __call1064102_0(p0);
}
public static void h641_3(moom.Oo p0) throws Throwable {
    throw __call1064103_0(p0);
}
public static void h641_4(moom.Oo p0) throws Throwable {
    throw __call1064104_0(p0);
}
public static void h641_5(moom.Oo p0) throws Throwable {
    throw __call1064105_0(p0);
}
private static native long __fieldRead641_0() throws Throwable;
private static native net.minecraft.entity.Entity[] __call641_1() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead641_2() throws Throwable;
private static native int __fieldRead641_3(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead641_4() throws Throwable;
private static native int __fieldRead641_5(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead641_6() throws Throwable;
private static native int __fieldRead641_7(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native boolean __integerCategory641_8(int value) throws Throwable;
private static native java.lang.Throwable __call1064100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1064105_0(moom.Oo a0) throws Throwable;

}


public static void b(net.minecraft.entity.Entity[] p0) {
e = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return moom.GD.e;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral4617_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static long c(int p0, long p1) {
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 5130);
    if (((moom.GD.t)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (moom.GD.s)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(moom.GD.u)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(moom.GD.u)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/GD", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (moom.GD.t)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((moom.GD.t)[life3_8])).longValue();
}


private static long c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = moom.GD.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public static moom.GD[] a(long p0, net.minecraft.world.WorldType p1, java.lang.String p2) { return __sourceHandlerCall_649f6e8895ad2a756f78(p0, p1, p2); }


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral4620_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/GD"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.GD.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int n2 = p0 ^ (int)(p1 & 0x7FFFL) ^ 0x32A;
        if (GD.n[n2] == null) {
            
            byte[] byArray2 = new byte[]{(byte)(p1 >>> 56), (byte)(p1 >>> 48), (byte)(p1 >>> 40), (byte)(p1 >>> 32), (byte)(p1 >>> 24), (byte)(p1 >>> 16), (byte)(p1 >>> 8), (byte)p1};
            long l2 = m[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])o.get(l3);
byte[] byArray;
            try {
                if (objectArray == null) {
                    objectArray = new Object[3];
objectArray[0] = Cipher.getInstance("DES/CBC/NoPadding");
objectArray[1] = SecretKeyFactory.getInstance("DES");
objectArray[2] = new IvParameterSpec(new byte[8]);
                    o.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("moom/GD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            GD.n[n2] = n3;
        }
        return GD.n[n2];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


protected static boolean a(int p0, int p1) { return __sourceHandlerCall_066b5a960295ebac01d6(p0, p1); }


public void a(long p0) { __sourceHandlerCall_ceb872f40d029b715330(this, p0); }


protected int a(int p0) { return __sourceHandlerCall_8f5859eb60c7be1d9ec1(this, p0); }


public void a(long p0, long p1) {
long local5_life1 = (moom.GD.k ^ 8435487746373L);
    this.c = ((long)(this.a));
    this.c *= ((this.c * __sourceIntrinsic_45a6da219052_originalDynamicSite598_6(27564, (9167129189782159340L ^ local5_life1))) + __sourceIntrinsic_45a6da219052_originalDynamicSite598_7(27789, (5308819564940130505L ^ local5_life1)));
    this.c += p0;
    this.c *= ((this.c * __sourceIntrinsic_45a6da219052_originalDynamicSite598_11(27564, (9167129189782159340L ^ local5_life1))) + __sourceIntrinsic_45a6da219052_originalDynamicSite598_12(27789, (5308819564940130505L ^ local5_life1)));
    this.c += p1;
    this.c *= ((this.c * __sourceIntrinsic_45a6da219052_originalDynamicSite598_16(27564, (9167129189782159340L ^ local5_life1))) + __sourceIntrinsic_45a6da219052_originalDynamicSite598_17(27789, (5308819564940130505L ^ local5_life1)));
    this.c += p0;
    this.c *= ((this.c * __sourceIntrinsic_45a6da219052_originalDynamicSite598_21(27564, (9167129189782159340L ^ local5_life1))) + __sourceIntrinsic_45a6da219052_originalDynamicSite598_22(27789, (5308819564940130505L ^ local5_life1)));
    this.c += p1;
    return;
}


public abstract int[] a__ArrayInt(int p0, int p1, int p2, int p3);

protected int a(int p0, int p1, int p2, int p3) { return __sourceHandlerCall_8dbee49c7289e602d211(this, p0, p1, p2, p3); }


protected int a(int[] p0) {
return (p0)[((moom.GD)(this)).a(((int)((p0).length)))];
}


protected static boolean a__Boolean(int p0) { return __sourceHandlerCall_2e7ea92a562be7b4a814(p0); }


private static java.lang.String lambda$biomesEqualOrMesaPlateau$0(net.minecraft.world.biome.BiomeGenBase p0) throws java.lang.Exception {
return java.lang.String.valueOf(((java.lang.Object)(p0)));
}


private static java.lang.String lambda$biomesEqualOrMesaPlateau$1(net.minecraft.world.biome.BiomeGenBase p0) throws java.lang.Exception {
return java.lang.String.valueOf(((java.lang.Object)(p0)));
}


private static native <E extends Throwable> long __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_11(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_12(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_16(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_f1503469504a33e0_originalDynamicSite597_17(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_6(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_11(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_12(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_16(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_17(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_21(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_45a6da219052_originalDynamicSite598_22(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral4620_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral4617_0() throws E;
}
