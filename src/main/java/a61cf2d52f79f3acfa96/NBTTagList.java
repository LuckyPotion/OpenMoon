package net.minecraft.nbt;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NBTTagList extends net.minecraft.nbt.NBTBase {

private static org.apache.logging.log4j.Logger c;

private java.util.List<net.minecraft.nbt.NBTBase> d;

private byte e;

private static long g;

private static long[] h;

private static java.lang.Integer[] i;

private static java.util.Map j;

private static long[] k;

private static java.lang.Long[] l;

private static java.util.Map m;

public NBTTagList() {
super();
    this.d = com.google.common.collect.Lists.newArrayList();
    this.e = 0;
}


static {
g = ((long)(((moom._a)(moom._c.a(((long)(91104208629806843L)), ((long)(-912442565337458360L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(37380239139145L)))));
    j = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (net.minecraft.nbt.NBTTagList.g ^ 109939975746853L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill1200_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1200_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1200_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1200_14 = new byte[8];
    (__sourceSpill1200_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill1200_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation1200_16 = __sourceSpill1200_14;
    ((javax.crypto.Cipher)(__sourceSpill1200_11)).init(((int)(__sourceSpill1200_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1200_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1200_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[9];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = ">0oä.\007K\024Ä¡b/W<Y¸Ì\023£´©ó£\024\030M¼H'?Ì]\\Úu!á4µ.ð\003×¯Pg6µI¼"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1200_25 = local17_life21;
        int __sourceSpill1200_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1200_25)).substring(((int)(__sourceSpill1200_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1200_30 = local19_life19;
        int __sourceSpill1200_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill1200_33 = new byte[8];
        (__sourceSpill1200_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill1200_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill1200_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill1200_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill1200_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill1200_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill1200_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill1200_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill1200_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill1200_34)).doFinal(((byte[])(__sourceSpill1200_33)));
        (__sourceSpill1200_30)[__sourceSpill1200_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = "ûB@XØÏoàOÜ¦då"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill1200_38 = local17_life21;
        int __sourceSpill1200_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1200_38)).substring(((int)(__sourceSpill1200_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1200_43 = local19_life19;
        int __sourceSpill1200_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill1200_46 = new byte[8];
        (__sourceSpill1200_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill1200_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill1200_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill1200_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill1200_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill1200_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill1200_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill1200_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill1200_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill1200_47)).doFinal(((byte[])(__sourceSpill1200_46)));
        (__sourceSpill1200_43)[__sourceSpill1200_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    h = ((long[])(local19_life19));
    i = ((java.lang.Integer[])(new java.lang.Integer[9]));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill1200_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1200_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1200_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1200_59 = new byte[8];
    (__sourceSpill1200_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill1200_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation1200_61 = __sourceSpill1200_59;
    ((javax.crypto.Cipher)(__sourceSpill1200_56)).init(((int)(__sourceSpill1200_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1200_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1200_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "­£}-çe¯,ÊÁ´0¦"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill1200_70 = local4_life66;
        int __sourceSpill1200_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill1200_70)).substring(((int)(__sourceSpill1200_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1200_75 = local6_life64;
        int __sourceSpill1200_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill1200_78 = new byte[8];
        (__sourceSpill1200_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill1200_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill1200_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill1200_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill1200_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill1200_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill1200_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill1200_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill1200_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill1200_79)).doFinal(((byte[])(__sourceSpill1200_78)));
        (__sourceSpill1200_75)[__sourceSpill1200_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    k = ((long[])(local6_life64));
    l = ((java.lang.Long[])(new java.lang.Long[2]));
    c = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> double __sourceHandlerCall_3dc42f2694837736149c(net.minecraft.nbt.NBTTagList a0, int a1) throws E;
private static final class __SourceHandler_3dc42f2694837736149c {

public static double f1612(net.minecraft.nbt.NBTTagList receiver, int p0) throws Throwable {
    int forwardValue1612_11_0;
    net.minecraft.nbt.NBTBase forwardValue1612_32_0;
    double forwardValue1612_36_0;
    int spill1612_0;
    net.minecraft.nbt.NBTBase spill1612_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTBase life5_23;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_32: {
    forward_join_11: {
    life2_3 = (__fieldRead1612_0() ^ 80330431056289L);
    life4_5 = __call1612_1();
    spill1612_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1612_11_0 = spill1612_0;
        break forward_join_11;
    }
    if (!((spill1612_0 >= 0))) {
        break forward_join_37;
    }
    forwardValue1612_11_0 = p0;
    }
    if (!((forwardValue1612_11_0 < __call1612_3(__fieldRead1612_2(receiver))))) {
        break forward_join_37;
    }
    life5_23 = __cast1612_6(__call1612_5(__fieldRead1612_4(receiver), p0));
    spill1612_1 = life5_23;
    if (!((life4_5 == null))) {
        forwardValue1612_32_0 = spill1612_1;
        break forward_join_32;
    }
    if (!((__call1612_7(spill1612_1) == __invokedynamic1612_8(4323, (9152134568092946516L ^ life2_3))))) {
        break forward_join_35;
    }
    forwardValue1612_32_0 = life5_23;
    }
    forwardValue1612_36_0 = __call1612_10(__cast1612_9(forwardValue1612_32_0));
    break forward_join_36;
    }
    forwardValue1612_36_0 = 0x0.0p0d;
    }
    return forwardValue1612_36_0;
    }
    return 0x0.0p0d;
}
public static void h1612_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161200_0(p0);
}
public static void h1612_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161201_0(p0);
}
public static void h1612_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161202_0(p0);
}
private static native long __fieldRead1612_0() throws Throwable;
private static native java.lang.String __call1612_1() throws Throwable;
private static native java.util.List __fieldRead1612_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1612_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1612_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1612_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1612_6(java.lang.Object a0) throws Throwable;
private static native byte __call1612_7(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __invokedynamic1612_8(int a0, long a1) throws Throwable;
private static native moom.yq __cast1612_9(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native double __call1612_10(moom.yq a0) throws Throwable;
private static native java.lang.Exception __call1161200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161201_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161202_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3e1a423123cc5ede0a79(net.minecraft.nbt.NBTTagList a0, int a1, net.minecraft.nbt.NBTBase a2) throws E;
private static final class __SourceHandler_3e1a423123cc5ede0a79 {

public static void f264(net.minecraft.nbt.NBTTagList receiver, int p0, net.minecraft.nbt.NBTBase p1) throws Throwable {
    int forwardValue264_17_0;
    int forwardValue264_21_0;
    int forwardValue264_29_0;
    int forwardValue264_42_0;
    java.lang.Object forwardValue264_54_0;
    byte spill264_0;
    net.minecraft.nbt.NBTTagList spill264_1;
    long life3_3;
    java.lang.String life5_5;
    forward_join_60: {
    forward_join_57: {
    forward_join_54: {
    forward_join_49: {
    forward_join_42: {
    forward_join_38: {
    forward_join_29: {
    forward_join_21: {
    forward_join_17: {
    forward_join_16: {
    life3_3 = (__fieldRead264_0() ^ 78357550727928L);
    life5_5 = __call264_1();
    spill264_0 = __call264_2(p1);
    if (!((life5_5 == null))) {
        forwardValue264_17_0 = __integerCategory264_3(spill264_0);
        break forward_join_17;
    }
    if (!((spill264_0 == 0))) {
        break forward_join_16;
    }
    __call264_5(__fieldRead264_4(), "Invalid TagEnd added to ListTag");
    if (!((life5_5 != null))) {
        break forward_join_60;
    }
    }
    forwardValue264_17_0 = p0;
    }
    if (!((life5_5 == null))) {
        forwardValue264_21_0 = forwardValue264_17_0;
        break forward_join_21;
    }
    if (!((forwardValue264_17_0 >= 0))) {
        break forward_join_57;
    }
    forwardValue264_21_0 = p0;
    }
    if (!((life5_5 == null))) {
        forwardValue264_29_0 = forwardValue264_21_0;
        break forward_join_29;
    }
    if (!((forwardValue264_21_0 < __call264_7(__fieldRead264_6(receiver))))) {
        break forward_join_57;
    }
    forwardValue264_29_0 = __integerCategory264_9(__fieldRead264_8(receiver));
    }
    if (!((life5_5 == null))) {
        forwardValue264_42_0 = forwardValue264_29_0;
        break forward_join_42;
    }
    if (!((forwardValue264_29_0 == 0))) {
        break forward_join_38;
    }
    __fieldWrite264_11(receiver, __call264_10(p1));
    if (!((life5_5 != null))) {
        break forward_join_49;
    }
    }
    spill264_1 = receiver;
    if (!((life5_5 == null))) {
        forwardValue264_54_0 = spill264_1;
        break forward_join_54;
    }
    forwardValue264_42_0 = __integerCategory264_13(__fieldRead264_12(spill264_1));
    }
    if (!((forwardValue264_42_0 != __call264_14(p1)))) {
        break forward_join_49;
    }
    __call264_16(__fieldRead264_15(), "Adding mismatching tag types to tag list");
    return;
    }
    forwardValue264_54_0 = __call264_18(__fieldRead264_17(receiver), p0, p1);
    }
    __discardScalar264_19(forwardValue264_54_0);
    if (!((life5_5 != null))) {
        break forward_join_60;
    }
    }
    __call264_21(__fieldRead264_20(), "index out of bounds to set tag in tag list");
    }
    return;
}
public static void h264_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026400_0(p0);
}
public static void h264_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026401_0(p0);
}
public static void h264_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026402_0(p0);
}
public static void h264_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026403_0(p0);
}
public static void h264_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026404_0(p0);
}
public static void h264_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026405_0(p0);
}
public static void h264_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026406_0(p0);
}
public static void h264_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026407_0(p0);
}
public static void h264_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026408_0(p0);
}
public static void h264_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026409_0(p0);
}
public static void h264_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026410_0(p0);
}
public static void h264_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026411_0(p0);
}
private static native long __fieldRead264_0() throws Throwable;
private static native java.lang.String __call264_1() throws Throwable;
private static native byte __call264_2(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __integerCategory264_3(byte value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead264_4() throws Throwable;
private static native void __call264_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead264_6(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call264_7(java.util.List a0) throws Throwable;
private static native byte __fieldRead264_8(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __integerCategory264_9(byte value) throws Throwable;
private static native byte __call264_10(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __fieldWrite264_11(net.minecraft.nbt.NBTTagList a0, byte a1) throws Throwable;
private static native byte __fieldRead264_12(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __integerCategory264_13(byte value) throws Throwable;
private static native byte __call264_14(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead264_15() throws Throwable;
private static native void __call264_16(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead264_17(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call264_18(java.util.List a0, int a1, net.minecraft.nbt.NBTBase a2) throws Throwable;
private static native void __discardScalar264_19(java.lang.Object a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead264_20() throws Throwable;
private static native void __call264_21(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.lang.Exception __call1026400_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026401_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026402_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026403_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026404_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026405_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026406_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026407_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026408_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026409_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026410_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026411_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_aebfeb22a6a3c745745d(net.minecraft.nbt.NBTTagList a0, java.io.DataInput a1, int a2, moom.yB a3) throws E;
private static final class __SourceHandler_aebfeb22a6a3c745745d {

public static void f1614(net.minecraft.nbt.NBTTagList receiver, java.io.DataInput p0, int p1, moom.yB p2) throws Throwable {
    int lexicalValue1614_33_0;
    int lexicalValue1614_63_0;
    java.lang.String spill1614_0;
    int spill1614_1;
    byte spill1614_2;
    int spill1614_3;
    long life4_3;
    java.lang.String life6_12;
    int life7_38;
    int life8_79;
    net.minecraft.nbt.NBTBase life9_86;
    lexical_join_89: {
    lexical_join_63: {
    lexical_join_48: {
    lexical_join_33: {
    lexical_join_27: {
    life4_3 = (__fieldRead1614_0() ^ 59814988190428L);
    spill1614_0 = __call1614_1();
    __call1614_3(p2, __invokedynamic1614_2(3445, (2996914372388507586L ^ life4_3)));
    life6_12 = spill1614_0;
    spill1614_1 = p1;
    if (!((life6_12 == null))) {
        lexicalValue1614_33_0 = spill1614_1;
        break lexical_join_33;
    }
    if (!((spill1614_1 > __invokedynamic1614_4(28735, (1220912034996218865L ^ life4_3))))) {
        break lexical_join_27;
    }
    throw new java.lang.RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
    }
    __fieldWrite1614_6(receiver, __call1614_5(p0));
    lexicalValue1614_33_0 = __call1614_7(p0);
    }
    life7_38 = lexicalValue1614_33_0;
    spill1614_2 = __fieldRead1614_8(receiver);
    if (!((life6_12 == null))) {
        lexicalValue1614_63_0 = __integerCategory1614_9(spill1614_2);
        break lexical_join_63;
    }
    if (!((spill1614_2 == 0))) {
        break lexical_join_48;
    }
    spill1614_3 = life7_38;
    if (!((life6_12 == null))) {
        lexicalValue1614_63_0 = spill1614_3;
        break lexical_join_63;
    }
    if (!((spill1614_3 > 0))) {
        break lexical_join_48;
    }
    throw new java.lang.RuntimeException("Missing type on ListTag");
    }
    __call1614_11(p2, (__invokedynamic1614_10(30712, (1390765661312136526L ^ life4_3)) * ((long) life7_38)));
    __fieldWrite1614_13(receiver, __call1614_12(life7_38));
    lexicalValue1614_63_0 = 0;
    }
    life8_79 = lexicalValue1614_63_0;
    lexical_cycle_64: while (true) {
    if (!((life8_79 < life7_38))) {
        break lexical_join_89;
    }
    life9_86 = __call1614_15(__fieldRead1614_14(receiver));
    __call1614_16(life9_86, p0, (p1 + 1), p2);
    __call1614_18(__fieldRead1614_17(receiver), life9_86);
    life8_79 += 1;
    if (!((life6_12 != null))) { continue lexical_cycle_64; }
    break lexical_cycle_64;
    }
    __call1614_19(new java.lang.String[4]);
    }
    return;
}
public static void h1614_0(java.io.IOException p0) throws Throwable {
    throw __call1161400_0(p0);
}
public static void h1614_1(java.io.IOException p0) throws Throwable {
    throw __call1161401_0(p0);
}
public static void h1614_2(java.io.IOException p0) throws Throwable {
    throw __call1161402_0(p0);
}
public static void h1614_3(java.io.IOException p0) throws Throwable {
    throw __call1161403_0(p0);
}
public static void h1614_4(java.io.IOException p0) throws Throwable {
    throw __call1161404_0(p0);
}
public static void h1614_5(java.io.IOException p0) throws Throwable {
    throw __call1161405_0(p0);
}
private static native long __fieldRead1614_0() throws Throwable;
private static native java.lang.String __call1614_1() throws Throwable;
private static native long __invokedynamic1614_2(int a0, long a1) throws Throwable;
private static native void __call1614_3(moom.yB a0, long a1) throws Throwable;
private static native int __invokedynamic1614_4(int a0, long a1) throws Throwable;
private static native byte __call1614_5(java.io.DataInput a0) throws Throwable;
private static native void __fieldWrite1614_6(net.minecraft.nbt.NBTTagList a0, byte a1) throws Throwable;
private static native int __call1614_7(java.io.DataInput a0) throws Throwable;
private static native byte __fieldRead1614_8(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __integerCategory1614_9(byte value) throws Throwable;
private static native long __invokedynamic1614_10(int a0, long a1) throws Throwable;
private static native void __call1614_11(moom.yB a0, long a1) throws Throwable;
private static native java.util.ArrayList __call1614_12(int a0) throws Throwable;
private static native void __fieldWrite1614_13(net.minecraft.nbt.NBTTagList a0, java.util.ArrayList a1) throws Throwable;
private static native byte __fieldRead1614_14(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1614_15(byte a0) throws Throwable;
private static native void __call1614_16(net.minecraft.nbt.NBTBase a0, java.io.DataInput a1, int a2, moom.yB a3) throws Throwable;
private static native java.util.List __fieldRead1614_17(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native boolean __call1614_18(java.util.List a0, net.minecraft.nbt.NBTBase a1) throws Throwable;
private static native void __call1614_19(java.lang.String[] a0) throws Throwable;
private static native java.lang.Exception __call1161400_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1161401_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1161402_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1161403_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1161404_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1161405_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_c8aa505eff1823347782(net.minecraft.nbt.NBTTagList a0, java.io.DataOutput a1) throws E;
private static final class __SourceHandler_c8aa505eff1823347782 {

public static void f1615(net.minecraft.nbt.NBTTagList receiver, java.io.DataOutput p0) throws Throwable {
    net.minecraft.nbt.NBTTagList lexicalValue1615_23_0;
    net.minecraft.nbt.NBTTagList spill1615_0;
    long life2_3;
    java.lang.String life4_5;
    java.util.Iterator life5_46;
    net.minecraft.nbt.NBTBase life6_53;
    lexical_join_50: {
    lexical_join_25: {
    lexical_join_23: {
    lexical_join_22: {
    life2_3 = (__fieldRead1615_0() ^ 31681192955043L);
    life4_5 = __call1615_1();
    spill1615_0 = receiver;
    if (!((life4_5 == null))) {
        lexicalValue1615_23_0 = spill1615_0;
        break lexical_join_23;
    }
    if (!((!__call1615_3(__fieldRead1615_2(spill1615_0))))) {
        break lexical_join_22;
    }
    __fieldWrite1615_8(receiver, __call1615_7(__cast1615_6(__call1615_5(__fieldRead1615_4(receiver), 0))));
    if (!((life4_5 != null))) {
        break lexical_join_25;
    }
    }
    lexicalValue1615_23_0 = receiver;
    }
    __fieldWrite1615_9(lexicalValue1615_23_0, 0);
    }
    __call1615_11(p0, __fieldRead1615_10(receiver));
    __call1615_14(p0, __call1615_13(__fieldRead1615_12(receiver)));
    life5_46 = __call1615_16(__fieldRead1615_15(receiver));
    lexical_cycle_38: while (true) {
    if (!(__call1615_17(life5_46))) {
        break lexical_join_50;
    }
    life6_53 = __cast1615_19(__call1615_18(life5_46));
    __call1615_20(life6_53, p0);
    if (!((life4_5 != null))) { continue lexical_cycle_38; }
    break lexical_cycle_38;
    }
    }
    return;
}
public static void h1615_0(java.io.IOException p0) throws Throwable {
    throw __call1161500_0(p0);
}
public static void h1615_1(java.io.IOException p0) throws Throwable {
    throw __call1161501_0(p0);
}
public static void h1615_2(java.io.IOException p0) throws Throwable {
    throw __call1161502_0(p0);
}
private static native long __fieldRead1615_0() throws Throwable;
private static native java.lang.String __call1615_1() throws Throwable;
private static native java.util.List __fieldRead1615_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native boolean __call1615_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1615_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1615_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1615_6(java.lang.Object a0) throws Throwable;
private static native byte __call1615_7(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __fieldWrite1615_8(net.minecraft.nbt.NBTTagList a0, byte a1) throws Throwable;
private static native void __fieldWrite1615_9(net.minecraft.nbt.NBTTagList a0, int a1) throws Throwable;
private static native byte __fieldRead1615_10(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native void __call1615_11(java.io.DataOutput a0, byte a1) throws Throwable;
private static native java.util.List __fieldRead1615_12(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1615_13(java.util.List a0) throws Throwable;
private static native void __call1615_14(java.io.DataOutput a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1615_15(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.util.Iterator __call1615_16(java.util.List a0) throws Throwable;
private static native boolean __call1615_17(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1615_18(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1615_19(java.lang.Object a0) throws Throwable;
private static native void __call1615_20(net.minecraft.nbt.NBTBase a0, java.io.DataOutput a1) throws Throwable;
private static native java.lang.Exception __call1161500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1161501_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1161502_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1b9acb3df106bd9a52a9(net.minecraft.nbt.NBTTagList a0, net.minecraft.nbt.NBTBase a1) throws E;
private static final class __SourceHandler_1b9acb3df106bd9a52a9 {

public static void f265(net.minecraft.nbt.NBTTagList receiver, net.minecraft.nbt.NBTBase p0) throws Throwable {
    int forwardValue265_18_0;
    int forwardValue265_29_0;
    int forwardValue265_42_0;
    byte spill265_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_43: {
    forward_join_42: {
    forward_join_38: {
    forward_join_29: {
    forward_join_27: {
    forward_join_18: {
    forward_join_16: {
    life2_3 = (__fieldRead265_0() ^ 87296389385239L);
    life4_5 = __call265_1();
    spill265_0 = __call265_2(p0);
    if (!((life4_5 == null))) {
        forwardValue265_18_0 = __integerCategory265_3(spill265_0);
        break forward_join_18;
    }
    if (!((spill265_0 == 0))) {
        break forward_join_16;
    }
    __call265_5(__fieldRead265_4(), "Invalid TagEnd added to ListTag");
    if (!((life4_5 != null))) {
        break forward_join_43;
    }
    }
    forwardValue265_18_0 = __integerCategory265_7(__fieldRead265_6(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue265_29_0 = forwardValue265_18_0;
        break forward_join_29;
    }
    if (!((forwardValue265_18_0 == 0))) {
        break forward_join_27;
    }
    __fieldWrite265_9(receiver, __call265_8(p0));
    if (!((life4_5 != null))) {
        break forward_join_38;
    }
    }
    forwardValue265_29_0 = __integerCategory265_11(__fieldRead265_10(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue265_42_0 = forwardValue265_29_0;
        break forward_join_42;
    }
    if (!((forwardValue265_29_0 != __call265_12(p0)))) {
        break forward_join_38;
    }
    __call265_14(__fieldRead265_13(), "Adding mismatching tag types to tag list");
    return;
    }
    forwardValue265_42_0 = __integerCategory265_17(__call265_16(__fieldRead265_15(receiver), p0));
    }
    __discardScalar265_18(forwardValue265_42_0);
    }
    return;
}
public static void h265_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026500_0(p0);
}
public static void h265_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026501_0(p0);
}
public static void h265_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026502_0(p0);
}
public static void h265_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026503_0(p0);
}
public static void h265_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026504_0(p0);
}
public static void h265_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026505_0(p0);
}
public static void h265_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026506_0(p0);
}
public static void h265_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026507_0(p0);
}
private static native long __fieldRead265_0() throws Throwable;
private static native java.lang.String __call265_1() throws Throwable;
private static native byte __call265_2(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __integerCategory265_3(byte value) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead265_4() throws Throwable;
private static native void __call265_5(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native byte __fieldRead265_6(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __integerCategory265_7(byte value) throws Throwable;
private static native byte __call265_8(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __fieldWrite265_9(net.minecraft.nbt.NBTTagList a0, byte a1) throws Throwable;
private static native byte __fieldRead265_10(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __integerCategory265_11(byte value) throws Throwable;
private static native byte __call265_12(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead265_13() throws Throwable;
private static native void __call265_14(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native java.util.List __fieldRead265_15(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native boolean __call265_16(java.util.List a0, net.minecraft.nbt.NBTBase a1) throws Throwable;
private static native int __integerCategory265_17(boolean value) throws Throwable;
private static native void __discardScalar265_18(int a0) throws Throwable;
private static native java.lang.Exception __call1026500_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026501_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026502_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026503_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026504_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026505_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026506_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026507_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_b2f127bc9a0c53ee61b7(net.minecraft.nbt.NBTTagList a0, int a1) throws E;
private static final class __SourceHandler_b2f127bc9a0c53ee61b7 {

public static int[] f1617(net.minecraft.nbt.NBTTagList receiver, int p0) throws Throwable {
    int forwardValue1617_38_0;
    int[] forwardValue1617_39_0;
    int forwardValue1617_41_0;
    int spill1617_0;
    int spill1617_1;
    byte spill1617_2;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTBase life5_31;
    forward_join_41: {
    forward_join_40: {
    forward_join_39: {
    forward_join_38: {
    forward_join_37: {
    life2_3 = (__fieldRead1617_0() ^ 20709782898434L);
    life4_5 = __call1617_1();
    spill1617_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1617_41_0 = spill1617_0;
        break forward_join_41;
    }
    if (!((spill1617_0 >= 0))) {
        break forward_join_40;
    }
    spill1617_1 = p0;
    if (!((life4_5 == null))) {
        forwardValue1617_41_0 = spill1617_1;
        break forward_join_41;
    }
    if (!((spill1617_1 < __call1617_3(__fieldRead1617_2(receiver))))) {
        break forward_join_40;
    }
    life5_31 = __cast1617_6(__call1617_5(__fieldRead1617_4(receiver), p0));
    spill1617_2 = __call1617_7(life5_31);
    if (!((life4_5 == null))) {
        forwardValue1617_38_0 = __integerCategory1617_8(spill1617_2);
        break forward_join_38;
    }
    if (!((spill1617_2 == __invokedynamic1617_9(11733, (473217980424283074L ^ life2_3))))) {
        break forward_join_37;
    }
    forwardValue1617_39_0 = __call1617_11(__cast1617_10(life5_31));
    break forward_join_39;
    }
    forwardValue1617_38_0 = 0;
    }
    forwardValue1617_39_0 = new int[forwardValue1617_38_0];
    }
    return forwardValue1617_39_0;
    }
    forwardValue1617_41_0 = 0;
    }
    return new int[forwardValue1617_41_0];
}
public static void h1617_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161700_0(p0);
}
public static void h1617_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161701_0(p0);
}
public static void h1617_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161702_0(p0);
}
public static void h1617_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161703_0(p0);
}
public static void h1617_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161704_0(p0);
}
private static native long __fieldRead1617_0() throws Throwable;
private static native java.lang.String __call1617_1() throws Throwable;
private static native java.util.List __fieldRead1617_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1617_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1617_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1617_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1617_6(java.lang.Object a0) throws Throwable;
private static native byte __call1617_7(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __integerCategory1617_8(byte value) throws Throwable;
private static native int __invokedynamic1617_9(int a0, long a1) throws Throwable;
private static native moom.yy __cast1617_10(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int[] __call1617_11(moom.yy a0) throws Throwable;
private static native java.lang.Exception __call1161700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161701_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161702_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161703_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161704_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_89aa0c23f4f187ac2ddd(net.minecraft.nbt.NBTTagList a0, int a1) throws E;
private static final class __SourceHandler_89aa0c23f4f187ac2ddd {

public static float f1618(net.minecraft.nbt.NBTTagList receiver, int p0) throws Throwable {
    int forwardValue1618_11_0;
    net.minecraft.nbt.NBTBase forwardValue1618_28_0;
    float forwardValue1618_32_0;
    int spill1618_0;
    net.minecraft.nbt.NBTBase spill1618_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTBase life5_23;
    forward_join_33: {
    forward_join_32: {
    forward_join_31: {
    forward_join_28: {
    forward_join_11: {
    life2_3 = (__fieldRead1618_0() ^ 12315619136128L);
    life4_5 = __call1618_1();
    spill1618_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1618_11_0 = spill1618_0;
        break forward_join_11;
    }
    if (!((spill1618_0 >= 0))) {
        break forward_join_33;
    }
    forwardValue1618_11_0 = p0;
    }
    if (!((forwardValue1618_11_0 < __call1618_3(__fieldRead1618_2(receiver))))) {
        break forward_join_33;
    }
    life5_23 = __cast1618_6(__call1618_5(__fieldRead1618_4(receiver), p0));
    spill1618_1 = life5_23;
    if (!((life4_5 == null))) {
        forwardValue1618_28_0 = spill1618_1;
        break forward_join_28;
    }
    if (!((__call1618_7(spill1618_1) == 5))) {
        break forward_join_31;
    }
    forwardValue1618_28_0 = life5_23;
    }
    forwardValue1618_32_0 = __call1618_9(__cast1618_8(forwardValue1618_28_0));
    break forward_join_32;
    }
    forwardValue1618_32_0 = 0x0.0p0f;
    }
    return forwardValue1618_32_0;
    }
    return 0x0.0p0f;
}
public static void h1618_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161800_0(p0);
}
public static void h1618_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161801_0(p0);
}
public static void h1618_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161802_0(p0);
}
private static native long __fieldRead1618_0() throws Throwable;
private static native java.lang.String __call1618_1() throws Throwable;
private static native java.util.List __fieldRead1618_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1618_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1618_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1618_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1618_6(java.lang.Object a0) throws Throwable;
private static native byte __call1618_7(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native moom.yr __cast1618_8(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native float __call1618_9(moom.yr a0) throws Throwable;
private static native java.lang.Exception __call1161800_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161801_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161802_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_59a64bcecc797937eff0(net.minecraft.nbt.NBTTagList a0, int a1) throws E;
private static final class __SourceHandler_59a64bcecc797937eff0 {

public static java.lang.String f1619(net.minecraft.nbt.NBTTagList receiver, int p0) throws Throwable {
    int forwardValue1619_11_0;
    net.minecraft.nbt.NBTBase forwardValue1619_35_0;
    java.lang.String forwardValue1619_36_0;
    int spill1619_0;
    net.minecraft.nbt.NBTBase spill1619_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTBase life5_23;
    forward_join_37: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    forward_join_11: {
    life2_3 = (__fieldRead1619_0() ^ 125997817036190L);
    life4_5 = __call1619_1();
    spill1619_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1619_11_0 = spill1619_0;
        break forward_join_11;
    }
    if (!((spill1619_0 >= 0))) {
        break forward_join_37;
    }
    forwardValue1619_11_0 = p0;
    }
    if (!((forwardValue1619_11_0 < __call1619_3(__fieldRead1619_2(receiver))))) {
        break forward_join_37;
    }
    life5_23 = __cast1619_6(__call1619_5(__fieldRead1619_4(receiver), p0));
    spill1619_1 = life5_23;
    if (!((life4_5 == null))) {
        forwardValue1619_35_0 = spill1619_1;
        break forward_join_35;
    }
    if (!((__call1619_7(spill1619_1) == __invokedynamic1619_8(6358, (7954514914016029791L ^ life2_3))))) {
        break forward_join_34;
    }
    forwardValue1619_36_0 = __call1619_9(life5_23);
    break forward_join_36;
    }
    forwardValue1619_35_0 = life5_23;
    }
    forwardValue1619_36_0 = __call1619_10(forwardValue1619_35_0);
    }
    return forwardValue1619_36_0;
    }
    return "";
}
public static void h1619_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161900_0(p0);
}
public static void h1619_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161901_0(p0);
}
public static void h1619_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161902_0(p0);
}
private static native long __fieldRead1619_0() throws Throwable;
private static native java.lang.String __call1619_1() throws Throwable;
private static native java.util.List __fieldRead1619_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1619_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1619_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1619_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1619_6(java.lang.Object a0) throws Throwable;
private static native byte __call1619_7(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __invokedynamic1619_8(int a0, long a1) throws Throwable;
private static native java.lang.String __call1619_9(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.lang.String __call1619_10(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.lang.Exception __call1161900_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161901_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1161902_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTBase __sourceHandlerCall_d40445f7cb079db3ac99(net.minecraft.nbt.NBTTagList a0) throws E;
private static final class __SourceHandler_d40445f7cb079db3ac99 {

public static net.minecraft.nbt.NBTBase f1620(net.minecraft.nbt.NBTTagList receiver) throws Throwable {
    net.minecraft.nbt.NBTTagList lexicalValue1620_38_0;
    java.lang.String spill1620_0;
    net.minecraft.nbt.NBTTagList spill1620_1;
    long life1_3;
    net.minecraft.nbt.NBTTagList life4_8;
    java.lang.String life3_9;
    java.util.Iterator life5_17;
    net.minecraft.nbt.NBTBase life6_24;
    net.minecraft.nbt.NBTBase life7_27;
    lexical_join_38: {
    lexical_join_37: {
    life1_3 = (__fieldRead1620_0() ^ 32294592913359L);
    spill1620_0 = __call1620_1();
    life4_8 = new net.minecraft.nbt.NBTTagList();
    life3_9 = spill1620_0;
    __fieldWrite1620_3(life4_8, __fieldRead1620_2(receiver));
    life5_17 = __call1620_5(__fieldRead1620_4(receiver));
    lexical_cycle_18: while (true) {
    if (!(__call1620_6(life5_17))) {
        break lexical_join_37;
    }
    life6_24 = __cast1620_8(__call1620_7(life5_17));
    life7_27 = __call1620_9(life6_24);
    spill1620_1 = life4_8;
    if (!((life3_9 == null))) {
        lexicalValue1620_38_0 = spill1620_1;
        break lexical_join_38;
    }
    __call1620_11(__fieldRead1620_10(spill1620_1), life7_27);
    if (!((life3_9 != null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    lexicalValue1620_38_0 = life4_8;
    }
    return lexicalValue1620_38_0;
}
public static void h1620_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162000_0(p0);
}
private static native long __fieldRead1620_0() throws Throwable;
private static native java.lang.String __call1620_1() throws Throwable;
private static native byte __fieldRead1620_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native void __fieldWrite1620_3(net.minecraft.nbt.NBTTagList a0, byte a1) throws Throwable;
private static native java.util.List __fieldRead1620_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.util.Iterator __call1620_5(java.util.List a0) throws Throwable;
private static native boolean __call1620_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1620_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1620_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1620_9(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.util.List __fieldRead1620_10(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native boolean __call1620_11(java.util.List a0, net.minecraft.nbt.NBTBase a1) throws Throwable;
private static native java.lang.Exception __call1162000_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_92ff41aec33e85a314c2(net.minecraft.nbt.NBTTagList a0, int a1) throws E;
private static final class __SourceHandler_92ff41aec33e85a314c2 {

public static net.minecraft.nbt.NBTTagCompound f1621(net.minecraft.nbt.NBTTagList receiver, int p0) throws Throwable {
    int forwardValue1621_11_0;
    net.minecraft.nbt.NBTBase forwardValue1621_32_0;
    net.minecraft.nbt.NBTTagCompound forwardValue1621_37_0;
    int spill1621_0;
    net.minecraft.nbt.NBTBase spill1621_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTBase life5_23;
    forward_join_38: {
    forward_join_37: {
    forward_join_34: {
    forward_join_32: {
    forward_join_11: {
    life2_3 = (__fieldRead1621_0() ^ 30565885635704L);
    life4_5 = __call1621_1();
    spill1621_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1621_11_0 = spill1621_0;
        break forward_join_11;
    }
    if (!((spill1621_0 >= 0))) {
        break forward_join_38;
    }
    forwardValue1621_11_0 = p0;
    }
    if (!((forwardValue1621_11_0 < __call1621_3(__fieldRead1621_2(receiver))))) {
        break forward_join_38;
    }
    life5_23 = __cast1621_6(__call1621_5(__fieldRead1621_4(receiver), p0));
    spill1621_1 = life5_23;
    if (!((life4_5 == null))) {
        forwardValue1621_32_0 = spill1621_1;
        break forward_join_32;
    }
    if (!((__call1621_7(spill1621_1) == __invokedynamic1621_8(5408, (6701516083799748680L ^ life2_3))))) {
        break forward_join_34;
    }
    forwardValue1621_32_0 = life5_23;
    }
    forwardValue1621_37_0 = __cast1621_9(forwardValue1621_32_0);
    break forward_join_37;
    }
    forwardValue1621_37_0 = new net.minecraft.nbt.NBTTagCompound();
    }
    return forwardValue1621_37_0;
    }
    return new net.minecraft.nbt.NBTTagCompound();
}
public static void h1621_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162100_0(p0);
}
public static void h1621_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162101_0(p0);
}
public static void h1621_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162102_0(p0);
}
private static native long __fieldRead1621_0() throws Throwable;
private static native java.lang.String __call1621_1() throws Throwable;
private static native java.util.List __fieldRead1621_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1621_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1621_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1621_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1621_6(java.lang.Object a0) throws Throwable;
private static native byte __call1621_7(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __invokedynamic1621_8(int a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast1621_9(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.lang.Exception __call1162100_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1162101_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1162102_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTBase __sourceHandlerCall_8f986ca959f68d8a95b4(net.minecraft.nbt.NBTTagList a0, int a1) throws E;
private static final class __SourceHandler_8f986ca959f68d8a95b4 {

public static net.minecraft.nbt.NBTBase f1622(net.minecraft.nbt.NBTTagList receiver, int p0) throws Throwable {
    int forwardValue1622_11_0;
    net.minecraft.nbt.NBTBase forwardValue1622_24_0;
    int spill1622_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_24: {
    forward_join_21: {
    forward_join_11: {
    life2_3 = (__fieldRead1622_0() ^ 133221895791426L);
    life4_5 = __call1622_1();
    spill1622_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue1622_11_0 = spill1622_0;
        break forward_join_11;
    }
    if (!((spill1622_0 >= 0))) {
        break forward_join_21;
    }
    forwardValue1622_11_0 = p0;
    }
    if (!((forwardValue1622_11_0 < __call1622_3(__fieldRead1622_2(receiver))))) {
        break forward_join_21;
    }
    forwardValue1622_24_0 = __cast1622_6(__call1622_5(__fieldRead1622_4(receiver), p0));
    break forward_join_24;
    }
    forwardValue1622_24_0 = new moom.yx();
    }
    return forwardValue1622_24_0;
}
public static void h1622_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162200_0(p0);
}
public static void h1622_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162201_0(p0);
}
private static native long __fieldRead1622_0() throws Throwable;
private static native java.lang.String __call1622_1() throws Throwable;
private static native java.util.List __fieldRead1622_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1622_3(java.util.List a0) throws Throwable;
private static native java.util.List __fieldRead1622_4(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1622_5(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1622_6(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call1162200_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1162201_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ae74f1665c0a1fd7b93d(net.minecraft.nbt.NBTTagList a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_ae74f1665c0a1fd7b93d {

public static boolean f1623(net.minecraft.nbt.NBTTagList receiver, java.lang.Object p0) throws Throwable {
    int forwardValue1623_29_0;
    boolean spill1623_0;
    byte spill1623_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTTagList life5_17;
    forward_join_29: {
    forward_join_28: {
    life2_3 = (__fieldRead1623_0() ^ 48787275443381L);
    life4_5 = __call1623_1();
    spill1623_0 = __call1623_2(receiver, p0);
    if (!((life4_5 == null))) {
        forwardValue1623_29_0 = __integerCategory1623_3(spill1623_0);
        break forward_join_29;
    }
    if (!(spill1623_0)) {
        break forward_join_28;
    }
    life5_17 = __cast1623_4(p0);
    spill1623_1 = __fieldRead1623_5(receiver);
    if (!((life4_5 == null))) {
        forwardValue1623_29_0 = __integerCategory1623_6(spill1623_1);
        break forward_join_29;
    }
    if (!((spill1623_1 == __fieldRead1623_7(life5_17)))) {
        break forward_join_28;
    }
    return __call1623_10(__fieldRead1623_8(receiver), __fieldRead1623_9(life5_17));
    }
    forwardValue1623_29_0 = 0;
    }
    return __integerCategory1623_11(forwardValue1623_29_0);
}
public static void h1623_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162300_0(p0);
}
public static void h1623_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162301_0(p0);
}
public static void h1623_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162302_0(p0);
}
private static native long __fieldRead1623_0() throws Throwable;
private static native java.lang.String __call1623_1() throws Throwable;
private static native boolean __call1623_2(net.minecraft.nbt.NBTTagList a0, java.lang.Object a1) throws Throwable;
private static native int __integerCategory1623_3(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __cast1623_4(java.lang.Object a0) throws Throwable;
private static native byte __fieldRead1623_5(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __integerCategory1623_6(byte value) throws Throwable;
private static native byte __fieldRead1623_7(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.util.List __fieldRead1623_8(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.util.List __fieldRead1623_9(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native boolean __call1623_10(java.util.List a0, java.util.List a1) throws Throwable;
private static native boolean __integerCategory1623_11(int value) throws Throwable;
private static native java.lang.Exception __call1162300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1162301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1162302_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_7845ba4ccd2045e1c48d(net.minecraft.nbt.NBTTagList a0) throws E;
private static final class __SourceHandler_7845ba4ccd2045e1c48d {

public static java.lang.String f1624(net.minecraft.nbt.NBTTagList receiver) throws Throwable {
    java.lang.String spill1624_0;
    long life1_3;
    java.lang.StringBuilder life4_9;
    java.lang.String life3_10;
    int life5_12;
    lexical_join_46: {
    life1_3 = (__fieldRead1624_0() ^ 56190405022999L);
    spill1624_0 = __call1624_1();
    life4_9 = new java.lang.StringBuilder("[");
    life3_10 = spill1624_0;
    life5_12 = 0;
    lexical_cycle_13: while (true) {
    lexical_join_28: {
    if (!((life5_12 < __call1624_3(__fieldRead1624_2(receiver))))) {
        break lexical_join_46;
    }
    if (!((life5_12 != 0))) {
        break lexical_join_28;
    }
    __call1624_5(life4_9, __invokedynamic1624_4(32670, (3526259022587650961L ^ life1_3)));
    }
    __call1624_11(__call1624_8(__call1624_6(life4_9, life5_12), __invokedynamic1624_7(21831, (6655398913845381444L ^ life1_3))), __call1624_10(__fieldRead1624_9(receiver), life5_12));
    life5_12 += 1;
    if (!((life3_10 != null))) { continue lexical_cycle_13; }
    break lexical_cycle_13;
    }
    }
    return __call1624_14(__call1624_13(life4_9, __invokedynamic1624_12(29077, (6085358318796959123L ^ life1_3))));
}
public static void h1624_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1162400_0(p0);
}
private static native long __fieldRead1624_0() throws Throwable;
private static native java.lang.String __call1624_1() throws Throwable;
private static native java.util.List __fieldRead1624_2(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call1624_3(java.util.List a0) throws Throwable;
private static native int __invokedynamic1624_4(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call1624_5(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call1624_6(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native int __invokedynamic1624_7(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call1624_8(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.util.List __fieldRead1624_9(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Object __call1624_10(java.util.List a0, int a1) throws Throwable;
private static native java.lang.StringBuilder __call1624_11(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native int __invokedynamic1624_12(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call1624_13(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __call1624_14(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Exception __call1162400_0(java.lang.RuntimeException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_ae74f1665c0a1fd7b93d(this, p0); }


public java.lang.String toString() { return __sourceHandlerCall_7845ba4ccd2045e1c48d(this); }


public int hashCode() {
return (super.hashCode() ^ ((java.util.List)(this.d)).hashCode());
}


public int b__sourceReturn_8abf5c6871() {
return this.e;
}


public net.minecraft.nbt.NBTBase b(int p0) { return __sourceHandlerCall_8f986ca959f68d8a95b4(this, p0); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12014_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20199);
    if (((net.minecraft.nbt.NBTTagList.l)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.nbt.NBTTagList.k)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.nbt.NBTTagList.m)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.nbt.NBTTagList.m)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/yz", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.nbt.NBTTagList.l)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.nbt.NBTTagList.l)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.nbt.NBTTagList.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.nbt.NBTTagList.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 6045;
      if (i[var3] == null) {
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
         long var5 = h[var3];
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
         Object[] var9 = (Object[])j.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               j.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/yz", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         i[var3] = var15;
      }

      return i[var3];
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


public void a(net.minecraft.nbt.NBTBase p0) { __sourceHandlerCall_1b9acb3df106bd9a52a9(this, p0); }


public void a(int p0, net.minecraft.nbt.NBTBase p1) { __sourceHandlerCall_3e1a423123cc5ede0a79(this, p0, p1); }


void a(java.io.DataOutput p0) throws java.io.IOException { __sourceHandlerCall_c8aa505eff1823347782(this, p0); }


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException { __sourceHandlerCall_aebfeb22a6a3c745745d(this, p0, p1, p2); }


public byte a() {
long life1_3;
    life1_3 = (net.minecraft.nbt.NBTTagList.g ^ 31251587064382L);
    return ((byte)(__sourceIntrinsic_f90ab603e3aa_invokedynamic1130_1(1951, (6877433081995422898L ^ life1_3))));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12020_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yz"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public net.minecraft.nbt.NBTTagCompound a__yw(int p0) { return __sourceHandlerCall_92ff41aec33e85a314c2(this, p0); }


public java.lang.String a__String(int p0) { return __sourceHandlerCall_59a64bcecc797937eff0(this, p0); }


public float a__Float(int p0) { return __sourceHandlerCall_89aa0c23f4f187ac2ddd(this, p0); }


public double a(int p0) { return __sourceHandlerCall_3dc42f2694837736149c(this, p0); }


public int[] a__ArrayInt(int p0) { return __sourceHandlerCall_b2f127bc9a0c53ee61b7(this, p0); }


public net.minecraft.nbt.NBTBase a__yn(int p0) {
return ((net.minecraft.nbt.NBTBase)(((java.util.List)(this.d)).remove(((int)(p0)))));
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((java.util.List)(this.d)).isEmpty())) != 0);
}


public net.minecraft.nbt.NBTBase a__yn() { return __sourceHandlerCall_d40445f7cb079db3ac99(this); }


public int a__Int() {
return ((java.util.List)(this.d)).size();
}


private static native <E extends Throwable> int __sourceIntrinsic_f90ab603e3aa_invokedynamic1130_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12020_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12014_0() throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
