package net.minecraft.nbt;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class NBTTagCompound extends net.minecraft.nbt.NBTBase {

private java.util.Map<java.lang.String, net.minecraft.nbt.NBTBase> c;

private static boolean d;

private static long e;

private static long[] g;

private static java.lang.Integer[] h;

private static java.util.Map i;

private static long[] j;

private static java.lang.Long[] k;

private static java.util.Map l;

public NBTTagCompound() {
super();
    this.c = com.google.common.collect.Maps.newHashMap();
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-4572922526646553628L)), ((long)(-8134778870045541963L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(2860884028517L)))));
    i = ((java.util.Map)(new java.util.HashMap(13)));
    int __sourceSpill1348_7 = 1;
    long local11_life8 = (net.minecraft.nbt.NBTTagCompound.e ^ 85985055991620L);
    net.minecraft.nbt.NBTTagCompound.b(((boolean)__sourceIntrinsic_integerToBoolean((__sourceSpill1348_7))));
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill1348_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1348_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1348_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1348_16 = new byte[8];
    (__sourceSpill1348_16)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill1348_16)[local14_life17] = ((byte) ((int) ((local11_life8 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation1348_18 = __sourceSpill1348_16;
    ((javax.crypto.Cipher)(__sourceSpill1348_13)).init(((int)(__sourceSpill1348_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1348_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1348_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[16];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "Èæ{ÿ\022­\002$®æ?\177D$µ|E¼ÞPâá¯16¯òý\000NÍ=Òe³`Ä4¤¼\023µ\026¶K\032Ô¾ÜÄ6Uéüs.^ì»»]5olÒGÙ¸:uÀ82Cåm¼\025\024;\0357\017I½ô+¯ZÏù\005\033G1\020>ºë!:ý}d"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1348_27 = local17_life23;
        int __sourceSpill1348_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1348_27)).substring(((int)(__sourceSpill1348_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1348_32 = local19_life21;
        int __sourceSpill1348_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill1348_35 = new byte[8];
        (__sourceSpill1348_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill1348_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill1348_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill1348_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill1348_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill1348_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill1348_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill1348_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill1348_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill1348_36)).doFinal(((byte[])(__sourceSpill1348_35)));
        (__sourceSpill1348_32)[__sourceSpill1348_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "\"æ*Æð¬|\005ÏÍ×"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1348_40 = local17_life23;
        int __sourceSpill1348_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1348_40)).substring(((int)(__sourceSpill1348_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1348_45 = local19_life21;
        int __sourceSpill1348_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill1348_48 = new byte[8];
        (__sourceSpill1348_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill1348_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill1348_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill1348_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill1348_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill1348_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill1348_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill1348_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill1348_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill1348_49)).doFinal(((byte[])(__sourceSpill1348_48)));
        (__sourceSpill1348_45)[__sourceSpill1348_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    g = ((long[])(local19_life21));
    h = ((java.lang.Integer[])(new java.lang.Integer[16]));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill1348_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1348_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1348_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1348_61 = new byte[8];
    (__sourceSpill1348_61)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill1348_61)[local1_life62] = ((byte) ((int) ((local11_life8 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation1348_63 = __sourceSpill1348_61;
    ((javax.crypto.Cipher)(__sourceSpill1348_58)).init(((int)(__sourceSpill1348_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1348_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1348_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[4];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "ÏÄÄ1[ù$á\013\034Ó¦"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1348_72 = local4_life68;
        int __sourceSpill1348_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill1348_72)).substring(((int)(__sourceSpill1348_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1348_77 = local6_life66;
        int __sourceSpill1348_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill1348_80 = new byte[8];
        (__sourceSpill1348_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill1348_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill1348_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill1348_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill1348_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill1348_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill1348_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill1348_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill1348_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill1348_81)).doFinal(((byte[])(__sourceSpill1348_80)));
        (__sourceSpill1348_77)[__sourceSpill1348_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    local5_life70 = ((java.lang.String)((local4_life68 = "·\000Ô+w©¸\nÊÚ\002ù8"))).length();
    local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1348_85 = local4_life68;
        int __sourceSpill1348_86 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life89 = ((java.lang.String)(((java.lang.String)(__sourceSpill1348_85)).substring(((int)(__sourceSpill1348_86)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1348_90 = local6_life66;
        int __sourceSpill1348_91 = local3_life67;
        local3_life67 += 1;
        long local8_life92 = (((((((((((long) (local7_life89)[0]) & 255L) << 56) | ((((long) (local7_life89)[1]) & 255L) << 48)) | ((((long) (local7_life89)[2]) & 255L) << 40)) | ((((long) (local7_life89)[3]) & 255L) << 32)) | ((((long) (local7_life89)[4]) & 255L) << 24)) | ((((long) (local7_life89)[5]) & 255L) << 16)) | ((((long) (local7_life89)[6]) & 255L) << 8)) | (((long) (local7_life89)[7]) & 255L));
        byte[] __sourceSpill1348_93 = new byte[8];
        (__sourceSpill1348_93)[0] = ((byte) ((int) (local8_life92 >>> 56)));
        (__sourceSpill1348_93)[1] = ((byte) ((int) (local8_life92 >>> 48)));
        (__sourceSpill1348_93)[2] = ((byte) ((int) (local8_life92 >>> 40)));
        (__sourceSpill1348_93)[3] = ((byte) ((int) (local8_life92 >>> 32)));
        (__sourceSpill1348_93)[4] = ((byte) ((int) (local8_life92 >>> 24)));
        (__sourceSpill1348_93)[5] = ((byte) ((int) (local8_life92 >>> 16)));
        (__sourceSpill1348_93)[6] = ((byte) ((int) (local8_life92 >>> 8)));
        (__sourceSpill1348_93)[7] = ((byte) ((int) local8_life92));
        javax.crypto.Cipher __sourceSpill1348_94 = local0_life56;
        byte[] local10_life96 = ((javax.crypto.Cipher)(__sourceSpill1348_94)).doFinal(((byte[])(__sourceSpill1348_93)));
        (__sourceSpill1348_90)[__sourceSpill1348_91] = (((((((((((long) (local10_life96)[0]) & 255L) << 56) | ((((long) (local10_life96)[1]) & 255L) << 48)) | ((((long) (local10_life96)[2]) & 255L) << 40)) | ((((long) (local10_life96)[3]) & 255L) << 32)) | ((((long) (local10_life96)[4]) & 255L) << 24)) | ((((long) (local10_life96)[5]) & 255L) << 16)) | ((((long) (local10_life96)[6]) & 255L) << 8)) | (((long) (local10_life96)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    j = ((long[])(local6_life66));
    k = ((java.lang.Long[])(new java.lang.Long[4]));
}

private static native <E extends Throwable> void __sourceHandlerCall_423fa283c9e0c56d9163(net.minecraft.nbt.NBTTagCompound a0, java.io.DataInput a1, int a2, moom.yB a3) throws E;
private static final class __SourceHandler_423fa283c9e0c56d9163 {

public static void f687(net.minecraft.nbt.NBTTagCompound receiver, java.io.DataInput p0, int p1, moom.yB p2) throws Throwable {
    java.lang.String spill687_0;
    java.lang.RuntimeException spill687_1;
    long life4_3;
    java.lang.String life6_12;
    int life7_32;
    java.lang.String life8_37;
    net.minecraft.nbt.NBTBase life9_63;
    forest_join_79: {
    forest_join_25: {
    life4_3 = (__fieldRead687_0() ^ 2152651979736L);
    spill687_0 = __call687_1();
    __call687_3(p2, __invokedynamic687_2(8619, (5091997241517486120L ^ life4_3)));
    life6_12 = spill687_0;
    if (!((p1 > __invokedynamic687_4(7811, (7945159916885960908L ^ life4_3))))) {
        break forest_join_25;
    }
    java.lang.RuntimeException __stackOp687_6_0 = __sourceUninitializedNEW687_5();
    spill687_1 = __stackOp687_6_0;
    __explicitNewInit687_7(__stackOp687_6_0, "Tried to read NBT tag with too high complexity, depth > 512");
    throw spill687_1;
    }
    __call687_9(__fieldRead687_8(receiver));
    forest_cycle_28: while (true) {
    forest_join_77: {
    if (!(((life7_32 = __call687_10(p0, p2)) != 0))) {
        break forest_join_79;
    }
    life8_37 = __call687_11(p0, p2);
    __call687_15(p2, (__invokedynamic687_12(27216, (3405237680725621714L ^ life4_3)) + (__invokedynamic687_13(4299, (5879328392316059978L ^ life4_3)) * ((long) __call687_14(life8_37)))));
    life9_63 = __call687_16(life7_32, life8_37, p0, (p1 + 1), p2);
    if (!((__call687_18(__fieldRead687_17(receiver), life8_37, life9_63) != null))) {
        break forest_join_77;
    }
    __call687_20(p2, __invokedynamic687_19(30888, (7392815091267922216L ^ life4_3)));
    }
    if (!((life6_12 != null))) {
        continue forest_cycle_28;
    }
    break forest_cycle_28;
    }
    }
    return;
}
public static void h687_0(java.io.IOException p0) throws Throwable {
    throw __call3068700_0(p0);
}
public static void h687_1(java.io.IOException p0) throws Throwable {
    throw __call3068701_0(p0);
}
private static native long __fieldRead687_0() throws Throwable;
private static native java.lang.String __call687_1() throws Throwable;
private static native long __invokedynamic687_2(int a0, long a1) throws Throwable;
private static native void __call687_3(moom.yB a0, long a1) throws Throwable;
private static native int __invokedynamic687_4(int a0, long a1) throws Throwable;
private static native java.lang.RuntimeException __sourceUninitializedNEW687_5() throws Throwable;
private static native void __explicitNewInit687_7(java.lang.RuntimeException a0, java.lang.String a1) throws Throwable;
private static native java.util.Map __fieldRead687_8(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native void __call687_9(java.util.Map a0) throws Throwable;
private static native byte __call687_10(java.io.DataInput a0, moom.yB a1) throws Throwable;
private static native java.lang.String __call687_11(java.io.DataInput a0, moom.yB a1) throws Throwable;
private static native long __invokedynamic687_12(int a0, long a1) throws Throwable;
private static native long __invokedynamic687_13(int a0, long a1) throws Throwable;
private static native int __call687_14(java.lang.String a0) throws Throwable;
private static native void __call687_15(moom.yB a0, long a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call687_16(int a0, java.lang.String a1, java.io.DataInput a2, int a3, moom.yB a4) throws Throwable;
private static native java.util.Map __fieldRead687_17(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call687_18(java.util.Map a0, java.lang.String a1, net.minecraft.nbt.NBTBase a2) throws Throwable;
private static native long __invokedynamic687_19(int a0, long a1) throws Throwable;
private static native void __call687_20(moom.yB a0, long a1) throws Throwable;
private static native java.lang.Exception __call3068700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call3068701_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_163bbfae7d48f87805c6(net.minecraft.nbt.NBTTagCompound a0, java.io.DataOutput a1) throws E;
private static final class __SourceHandler_163bbfae7d48f87805c6 {

public static void f1603(net.minecraft.nbt.NBTTagCompound receiver, java.io.DataOutput p0) throws Throwable {
    java.lang.String spill1603_0;
    long life2_3;
    java.util.Iterator life5_9;
    java.lang.String life4_10;
    java.lang.String life6_17;
    net.minecraft.nbt.NBTBase life7_23;
    lexical_join_35: {
    lexical_join_32: {
    life2_3 = (__fieldRead1603_0() ^ 47569670596007L);
    spill1603_0 = __call1603_1();
    life5_9 = __call1603_4(__call1603_3(__fieldRead1603_2(receiver)));
    life4_10 = spill1603_0;
    lexical_cycle_11: while (true) {
    if (!(__call1603_5(life5_9))) {
        break lexical_join_32;
    }
    life6_17 = __cast1603_7(__call1603_6(life5_9));
    life7_23 = __cast1603_10(__call1603_9(__fieldRead1603_8(receiver), life6_17));
    __call1603_11(life6_17, life7_23, p0);
    if (!((life4_10 == null))) {
        break lexical_join_35;
    }
    if (!((life4_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    __call1603_12(p0, 0);
    }
    return;
}
public static void h1603_0(java.io.IOException p0) throws Throwable {
    throw __call1160300_0(p0);
}
private static native long __fieldRead1603_0() throws Throwable;
private static native java.lang.String __call1603_1() throws Throwable;
private static native java.util.Map __fieldRead1603_2(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Set __call1603_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1603_4(java.util.Set a0) throws Throwable;
private static native boolean __call1603_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1603_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1603_7(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1603_8(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call1603_9(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1603_10(java.lang.Object a0) throws Throwable;
private static native void __call1603_11(java.lang.String a0, net.minecraft.nbt.NBTBase a1, java.io.DataOutput a2) throws Throwable;
private static native void __call1603_12(java.io.DataOutput a0, int a1) throws Throwable;
private static native java.lang.Exception __call1160300_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> byte __sourceHandlerCall_163dcb7803971cb7f67a(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_163dcb7803971cb7f67a {

public static byte f1604(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    net.minecraft.nbt.NBTBase forwardValue1604_17_0;
    int forwardValue1604_20_0;
    java.lang.String spill1604_0;
    net.minecraft.nbt.NBTBase spill1604_1;
    long life2_3;
    net.minecraft.nbt.NBTBase life5_10;
    java.lang.String life4_11;
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life2_3 = (__fieldRead1604_0() ^ 111510806763599L);
    spill1604_0 = __call1604_1();
    life5_10 = __cast1604_4(__call1604_3(__fieldRead1604_2(receiver), p0));
    life4_11 = spill1604_0;
    spill1604_1 = life5_10;
    if (!((life4_11 == null))) {
        forwardValue1604_17_0 = spill1604_1;
        break forward_join_17;
    }
    if (!((spill1604_1 != null))) {
        break forward_join_19;
    }
    forwardValue1604_17_0 = life5_10;
    }
    forwardValue1604_20_0 = __integerCategory1604_6(__call1604_5(forwardValue1604_17_0));
    break forward_join_20;
    }
    forwardValue1604_20_0 = 0;
    }
    return __integerCategory1604_7(forwardValue1604_20_0);
}
public static void h1604_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160400_0(p0);
}
private static native long __fieldRead1604_0() throws Throwable;
private static native java.lang.String __call1604_1() throws Throwable;
private static native java.util.Map __fieldRead1604_2(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call1604_3(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1604_4(java.lang.Object a0) throws Throwable;
private static native byte __call1604_5(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __integerCategory1604_6(byte value) throws Throwable;
private static native byte __integerCategory1604_7(int value) throws Throwable;
private static native java.lang.Exception __call1160400_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagList __sourceHandlerCall_9451f4f2a12e1f707acd(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws E;
private static final class __SourceHandler_9451f4f2a12e1f707acd {

public static net.minecraft.nbt.NBTTagList f575(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0, int p1) throws Throwable {
    java.lang.Object forwardValue575_25_0;
    int forwardValue575_36_0;
    net.minecraft.nbt.NBTTagList forwardValue575_41_0;
    net.minecraft.nbt.NBTTagList forwardValue575_43_0;
    net.minecraft.nbt.NBTTagCompound spill575_0;
    int spill575_1;
    net.minecraft.nbt.NBTTagList spill575_2;
    long life3_3;
    java.lang.String life5_5;
    net.minecraft.nbt.NBTTagList life6_29;
    forward_join_43: {
    forward_join_42: {
    forward_join_41: {
    forward_join_36: {
    forward_join_25: {
    forward_join_21: {
    life3_3 = (__fieldRead575_0() ^ 93730057931091L);
    life5_5 = __call575_1();
    spill575_0 = receiver;
    if (!((life5_5 == null))) {
        forwardValue575_25_0 = spill575_0;
        break forward_join_25;
    }
    if (!((__call575_2(spill575_0, p0) != __invokedynamic575_3(26470, (7156648829532480416L ^ life3_3))))) {
        break forward_join_21;
    }
    return new net.minecraft.nbt.NBTTagList();
    }
    forwardValue575_25_0 = __call575_5(__fieldRead575_4(receiver), p0);
    }
    life6_29 = __cast575_6(forwardValue575_25_0);
    spill575_1 = __call575_7(life6_29);
    if (!((life5_5 == null))) {
        forwardValue575_36_0 = spill575_1;
        break forward_join_36;
    }
    if (!((spill575_1 > 0))) {
        break forward_join_42;
    }
    spill575_2 = life6_29;
    if (!((life5_5 == null))) {
        forwardValue575_41_0 = spill575_2;
        break forward_join_41;
    }
    forwardValue575_36_0 = __call575_8(spill575_2);
    }
    if (!((forwardValue575_36_0 != p1))) {
        break forward_join_42;
    }
    forwardValue575_41_0 = new net.minecraft.nbt.NBTTagList();
    }
    forwardValue575_43_0 = forwardValue575_41_0;
    break forward_join_43;
    }
    forwardValue575_43_0 = life6_29;
    }
    return forwardValue575_43_0;
}
public static net.minecraft.nbt.NBTTagList h575_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057500_0(p0);
}
public static net.minecraft.nbt.NBTTagList h575_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057501_0(p0);
}
public static net.minecraft.nbt.NBTTagList h575_2(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057502_0(p0);
}
public static net.minecraft.nbt.NBTTagList h575_3(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057503_0(p0);
}
public static net.minecraft.nbt.NBTTagList h575_4(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057504_0(p0);
}
public static net.minecraft.nbt.NBTTagList h575_5(java.lang.ClassCastException p0, net.minecraft.nbt.NBTTagCompound p1, java.lang.String p2, long p3) throws Throwable {
    java.lang.ClassCastException local5 = p0;
    throw new moom.Oo(__call2057505_1(p1, p2, __invokedynamic2057505_0(18788, (6079395511138422180L ^ p3)), local5));
}
private static native long __fieldRead575_0() throws Throwable;
private static native java.lang.String __call575_1() throws Throwable;
private static native byte __call575_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic575_3(int a0, long a1) throws Throwable;
private static native java.util.Map __fieldRead575_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call575_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagList __cast575_6(java.lang.Object a0) throws Throwable;
private static native int __call575_7(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native int __call575_8(net.minecraft.nbt.NBTTagList a0) throws Throwable;
private static native java.lang.Exception __call2057500_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2057501_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2057502_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2057503_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2057504_0(java.lang.ClassCastException a0) throws Throwable;
private static native int __invokedynamic2057505_0(int a0, long a1) throws Throwable;
private static native moom.qY __call2057505_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2, java.lang.ClassCastException a3) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6c574e3ec788ae104597(java.lang.String a0, net.minecraft.nbt.NBTBase a1, java.io.DataOutput a2) throws E;
private static final class __SourceHandler_6c574e3ec788ae104597 {

public static void f1605(java.lang.String p0, net.minecraft.nbt.NBTBase p1, java.io.DataOutput p2) throws Throwable {
    net.minecraft.nbt.NBTBase forwardValue1605_19_0;
    java.lang.String spill1605_0;
    net.minecraft.nbt.NBTBase spill1605_1;
    long life3_3;
    java.lang.String life5_9;
    forward_join_21: {
    forward_join_19: {
    life3_3 = (__fieldRead1605_0() ^ 94355379797491L);
    spill1605_0 = __call1605_1();
    __call1605_3(p2, __call1605_2(p1));
    life5_9 = spill1605_0;
    spill1605_1 = p1;
    if (!((life5_9 == null))) {
        forwardValue1605_19_0 = spill1605_1;
        break forward_join_19;
    }
    if (!((__call1605_4(spill1605_1) != 0))) {
        break forward_join_21;
    }
    __call1605_5(p2, p0);
    forwardValue1605_19_0 = p1;
    }
    __call1605_6(forwardValue1605_19_0, p2);
    }
    return;
}
public static void h1605_0(java.io.IOException p0) throws Throwable {
    throw __call1160500_0(p0);
}
public static void h1605_1(java.io.IOException p0) throws Throwable {
    throw __call1160501_0(p0);
}
private static native long __fieldRead1605_0() throws Throwable;
private static native java.lang.String __call1605_1() throws Throwable;
private static native byte __call1605_2(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __call1605_3(java.io.DataOutput a0, byte a1) throws Throwable;
private static native byte __call1605_4(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __call1605_5(java.io.DataOutput a0, java.lang.String a1) throws Throwable;
private static native void __call1605_6(net.minecraft.nbt.NBTBase a0, java.io.DataOutput a1) throws Throwable;
private static native java.lang.Exception __call1160500_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1160501_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_0847222c25805a834914(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, boolean a2) throws E;
private static final class __SourceHandler_0847222c25805a834914 {

public static void f1606(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0, boolean p1) throws Throwable {
    net.minecraft.nbt.NBTTagCompound forwardValue1606_13_0;
    java.lang.String forwardValue1606_13_1;
    int forwardValue1606_13_2;
    net.minecraft.nbt.NBTTagCompound forwardValue1606_14_0;
    java.lang.String forwardValue1606_14_1;
    net.minecraft.nbt.NBTTagCompound forwardValue1606_15_0;
    java.lang.String forwardValue1606_15_1;
    int forwardValue1606_15_2;
    net.minecraft.nbt.NBTTagCompound spill1606_0;
    java.lang.String spill1606_1;
    boolean spill1606_2;
    long life3_3;
    java.lang.String life5_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life3_3 = (__fieldRead1606_0() ^ 47427616339083L);
    life5_5 = __call1606_1();
    spill1606_0 = receiver;
    spill1606_1 = p0;
    spill1606_2 = p1;
    if (!((life5_5 == null))) {
        forwardValue1606_13_0 = spill1606_0;
        forwardValue1606_13_1 = spill1606_1;
        forwardValue1606_13_2 = __integerCategory1606_2(spill1606_2);
        break forward_join_13;
    }
    if (!(spill1606_2)) {
        forwardValue1606_14_0 = spill1606_0;
        forwardValue1606_14_1 = spill1606_1;
        break forward_join_14;
    }
    forwardValue1606_13_0 = spill1606_0;
    forwardValue1606_13_1 = spill1606_1;
    forwardValue1606_13_2 = 1;
    }
    forwardValue1606_15_0 = forwardValue1606_13_0;
    forwardValue1606_15_1 = forwardValue1606_13_1;
    forwardValue1606_15_2 = forwardValue1606_13_2;
    break forward_join_15;
    }
    forwardValue1606_15_0 = forwardValue1606_14_0;
    forwardValue1606_15_1 = forwardValue1606_14_1;
    forwardValue1606_15_2 = 0;
    }
    __call1606_3(forwardValue1606_15_0, forwardValue1606_15_1, ((byte) forwardValue1606_15_2));
    return;
}
public static void h1606_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160600_0(p0);
}
private static native long __fieldRead1606_0() throws Throwable;
private static native java.lang.String __call1606_1() throws Throwable;
private static native int __integerCategory1606_2(boolean value) throws Throwable;
private static native void __call1606_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, byte a2) throws Throwable;
private static native java.lang.Exception __call1160600_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_93fdcb98609e94dbb674(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1) throws E;
private static final class __SourceHandler_93fdcb98609e94dbb674 {

public static void f1607(net.minecraft.nbt.NBTTagCompound receiver, net.minecraft.nbt.NBTTagCompound p0) throws Throwable {
    int lexicalValue1607_44_0;
    net.minecraft.nbt.NBTTagCompound lexicalValue1607_57_0;
    java.lang.String lexicalValue1607_57_1;
    java.lang.String spill1607_0;
    byte spill1607_1;
    net.minecraft.nbt.NBTTagCompound spill1607_2;
    java.lang.String spill1607_3;
    long life2_3;
    java.util.Iterator life5_9;
    java.lang.String life4_10;
    java.lang.String life6_17;
    net.minecraft.nbt.NBTBase life7_23;
    net.minecraft.nbt.NBTTagCompound life8_57;
    lexical_join_69: {
    life2_3 = (__fieldRead1607_0() ^ 3815554858420L);
    spill1607_0 = __call1607_1();
    life5_9 = __call1607_4(__call1607_3(__fieldRead1607_2(p0)));
    life4_10 = spill1607_0;
    lexical_cycle_11: while (true) {
    lexical_join_67: {
    lexical_join_62: {
    lexical_join_57: {
    lexical_join_55: {
    lexical_join_44: {
    if (!(__call1607_5(life5_9))) {
        break lexical_join_69;
    }
    life6_17 = __cast1607_7(__call1607_6(life5_9));
    life7_23 = __cast1607_10(__call1607_9(__fieldRead1607_8(p0), life6_17));
    spill1607_1 = __call1607_11(life7_23);
    if (!((life4_10 == null))) {
        lexicalValue1607_44_0 = __integerCategory1607_12(spill1607_1);
        break lexical_join_44;
    }
    if (!((spill1607_1 == __invokedynamic1607_13(6828, (6481495548727863937L ^ life2_3))))) {
        break lexical_join_62;
    }
    spill1607_2 = receiver;
    spill1607_3 = life6_17;
    if (!((life4_10 == null))) {
        lexicalValue1607_57_0 = spill1607_2;
        lexicalValue1607_57_1 = spill1607_3;
        break lexical_join_57;
    }
    lexicalValue1607_44_0 = __integerCategory1607_16(__call1607_15(spill1607_2, spill1607_3, __invokedynamic1607_14(8167, (3275439183737401292L ^ life2_3))));
    }
    if (!((lexicalValue1607_44_0 != 0))) {
        break lexical_join_55;
    }
    life8_57 = __call1607_17(receiver, life6_17);
    __call1607_19(life8_57, __cast1607_18(life7_23));
    if (!((life4_10 != null))) {
        break lexical_join_67;
    }
    }
    lexicalValue1607_57_0 = receiver;
    lexicalValue1607_57_1 = life6_17;
    }
    __call1607_21(lexicalValue1607_57_0, lexicalValue1607_57_1, __call1607_20(life7_23));
    if (!((life4_10 != null))) {
        break lexical_join_67;
    }
    }
    __call1607_23(receiver, life6_17, __call1607_22(life7_23));
    }
    if (!((life4_10 != null))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    return;
}
public static void h1607_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160700_0(p0);
}
public static void h1607_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160701_0(p0);
}
public static void h1607_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160702_0(p0);
}
public static void h1607_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160703_0(p0);
}
public static void h1607_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160704_0(p0);
}
private static native long __fieldRead1607_0() throws Throwable;
private static native java.lang.String __call1607_1() throws Throwable;
private static native java.util.Map __fieldRead1607_2(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Set __call1607_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1607_4(java.util.Set a0) throws Throwable;
private static native boolean __call1607_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1607_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.String __cast1607_7(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1607_8(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call1607_9(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast1607_10(java.lang.Object a0) throws Throwable;
private static native byte __call1607_11(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native int __integerCategory1607_12(byte value) throws Throwable;
private static native int __invokedynamic1607_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic1607_14(int a0, long a1) throws Throwable;
private static native boolean __call1607_15(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native int __integerCategory1607_16(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __call1607_17(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast1607_18(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __call1607_19(net.minecraft.nbt.NBTTagCompound a0, net.minecraft.nbt.NBTTagCompound a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1607_20(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __call1607_21(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTBase a2) throws Throwable;
private static native net.minecraft.nbt.NBTBase __call1607_22(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native void __call1607_23(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, net.minecraft.nbt.NBTBase a2) throws Throwable;
private static native java.lang.Exception __call1160700_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1160701_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1160702_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1160703_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1160704_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> byte[] __sourceHandlerCall_cfef05859fe96206e625(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_cfef05859fe96206e625 {

public static byte[] f576(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue576_24_0;
    byte[] forwardValue576_26_0;
    net.minecraft.nbt.NBTTagCompound spill576_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (__fieldRead576_0() ^ 86167050617333L);
    life4_5 = __call576_1();
    spill576_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue576_24_0 = spill576_0;
        break forward_join_24;
    }
    if (!((!__call576_3(spill576_0, p0, __invokedynamic576_2(21713, (5597684977258191030L ^ life2_3)))))) {
        break forward_join_20;
    }
    forwardValue576_26_0 = new byte[0];
    break forward_join_26;
    }
    forwardValue576_24_0 = __call576_5(__fieldRead576_4(receiver), p0);
    }
    forwardValue576_26_0 = __call576_7(__cast576_6(forwardValue576_24_0));
    }
    return forwardValue576_26_0;
}
public static byte[] h576_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057600_0(p0);
}
public static byte[] h576_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057601_0(p0);
}
public static byte[] h576_2(java.lang.ClassCastException p0, net.minecraft.nbt.NBTTagCompound p1, java.lang.String p2, long p3) throws Throwable {
    java.lang.ClassCastException local5 = p0;
    throw new moom.Oo(__call2057602_1(p1, p2, __invokedynamic2057602_0(22454, (2287900094238579672L ^ p3)), local5));
}
private static native long __fieldRead576_0() throws Throwable;
private static native java.lang.String __call576_1() throws Throwable;
private static native int __invokedynamic576_2(int a0, long a1) throws Throwable;
private static native boolean __call576_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead576_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call576_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.yv __cast576_6(java.lang.Object a0) throws Throwable;
private static native byte[] __call576_7(moom.yv a0) throws Throwable;
private static native java.lang.Exception __call2057600_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2057601_0(java.lang.ClassCastException a0) throws Throwable;
private static native int __invokedynamic2057602_0(int a0, long a1) throws Throwable;
private static native moom.qY __call2057602_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2, java.lang.ClassCastException a3) throws Throwable;

}

private static native <E extends Throwable> int[] __sourceHandlerCall_9543e01516fdec35c087(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_9543e01516fdec35c087 {

public static int[] f577(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue577_24_0;
    int[] forwardValue577_26_0;
    net.minecraft.nbt.NBTTagCompound spill577_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_26: {
    forward_join_24: {
    forward_join_20: {
    life2_3 = (__fieldRead577_0() ^ 134174468767826L);
    life4_5 = __call577_1();
    spill577_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue577_24_0 = spill577_0;
        break forward_join_24;
    }
    if (!((!__call577_3(spill577_0, p0, __invokedynamic577_2(3883, (672475751245873891L ^ life2_3)))))) {
        break forward_join_20;
    }
    forwardValue577_26_0 = new int[0];
    break forward_join_26;
    }
    forwardValue577_24_0 = __call577_5(__fieldRead577_4(receiver), p0);
    }
    forwardValue577_26_0 = __call577_7(__cast577_6(forwardValue577_24_0));
    }
    return forwardValue577_26_0;
}
public static int[] h577_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057700_0(p0);
}
public static int[] h577_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057701_0(p0);
}
public static int[] h577_2(java.lang.ClassCastException p0, net.minecraft.nbt.NBTTagCompound p1, java.lang.String p2, long p3) throws Throwable {
    java.lang.ClassCastException local5 = p0;
    throw new moom.Oo(__call2057702_1(p1, p2, __invokedynamic2057702_0(32596, (4196991379299922576L ^ p3)), local5));
}
private static native long __fieldRead577_0() throws Throwable;
private static native java.lang.String __call577_1() throws Throwable;
private static native int __invokedynamic577_2(int a0, long a1) throws Throwable;
private static native boolean __call577_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead577_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call577_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native moom.yy __cast577_6(java.lang.Object a0) throws Throwable;
private static native int[] __call577_7(moom.yy a0) throws Throwable;
private static native java.lang.Exception __call2057700_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2057701_0(java.lang.ClassCastException a0) throws Throwable;
private static native int __invokedynamic2057702_0(int a0, long a1) throws Throwable;
private static native moom.qY __call2057702_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2, java.lang.ClassCastException a3) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_f9e754ee8b9c6d19d855(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws E;
private static final class __SourceHandler_f9e754ee8b9c6d19d855 {

public static boolean f688(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0, int p1) throws Throwable {
    int forestValue688_23_0;
    int forestValue688_23_1;
    int forestValue688_34_0;
    int forestValue688_34_1;
    int forestValue688_65_0;
    int forestValue688_67_0;
    java.lang.String spill688_0;
    int spill688_1;
    int spill688_2;
    int spill688_3;
    int spill688_4;
    int spill688_5;
    int spill688_6;
    int spill688_7;
    int spill688_8;
    long life3_3;
    int life6_8;
    java.lang.String life5_9;
    forest_join_67: {
    forest_join_66: {
    forest_join_65: {
    forest_join_64: {
    forest_join_34: {
    forest_join_30: {
    forest_join_28: {
    forest_join_23: {
    forest_join_17: {
    life3_3 = (__fieldRead688_0() ^ 121934129895515L);
    spill688_0 = __call688_1();
    life6_8 = __call688_2(receiver, p0);
    life5_9 = spill688_0;
    spill688_1 = life6_8;
    spill688_2 = p1;
    if (!((life5_9 == null))) {
        forestValue688_23_0 = spill688_1;
        forestValue688_23_1 = spill688_2;
        break forest_join_23;
    }
    if (!((spill688_1 == spill688_2))) {
        break forest_join_17;
    }
    return __integerCategory688_3(1);
    }
    forestValue688_23_0 = p1;
    forestValue688_23_1 = __invokedynamic688_4(20660, (7005221441083262331L ^ life3_3));
    }
    if (!((life5_9 == null))) {
        forestValue688_34_0 = forestValue688_23_0;
        forestValue688_34_1 = forestValue688_23_1;
        break forest_join_34;
    }
    if (!((forestValue688_23_0 != forestValue688_23_1))) {
        break forest_join_30;
    }
    if (!((life6_8 > 0))) {
        break forest_join_28;
    }
    }
    return __integerCategory688_5(0);
    }
    spill688_3 = life6_8;
    if (!((life5_9 == null))) {
        forestValue688_65_0 = spill688_3;
        break forest_join_65;
    }
    forestValue688_34_0 = spill688_3;
    forestValue688_34_1 = 1;
    }
    if (!((forestValue688_34_0 != forestValue688_34_1))) {
        break forest_join_64;
    }
    spill688_4 = life6_8;
    if (!((life5_9 == null))) {
        forestValue688_65_0 = spill688_4;
        break forest_join_65;
    }
    if (!((spill688_4 != 2))) {
        break forest_join_64;
    }
    spill688_5 = life6_8;
    if (!((life5_9 == null))) {
        forestValue688_65_0 = spill688_5;
        break forest_join_65;
    }
    if (!((spill688_5 != 3))) {
        break forest_join_64;
    }
    spill688_6 = life6_8;
    if (!((life5_9 == null))) {
        forestValue688_65_0 = spill688_6;
        break forest_join_65;
    }
    if (!((spill688_6 != 4))) {
        break forest_join_64;
    }
    spill688_7 = life6_8;
    if (!((life5_9 == null))) {
        forestValue688_65_0 = spill688_7;
        break forest_join_65;
    }
    if (!((spill688_7 != 5))) {
        break forest_join_64;
    }
    spill688_8 = life6_8;
    if (!((life5_9 == null))) {
        forestValue688_65_0 = spill688_8;
        break forest_join_65;
    }
    if (!((spill688_8 == __invokedynamic688_6(845, (4787230443507455626L ^ life3_3))))) {
        break forest_join_66;
    }
    }
    forestValue688_65_0 = 1;
    }
    forestValue688_67_0 = forestValue688_65_0;
    break forest_join_67;
    }
    forestValue688_67_0 = 0;
    }
    return __integerCategory688_7(forestValue688_67_0);
}
public static boolean h688_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068800_0(p0);
}
public static boolean h688_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068801_0(p0);
}
public static boolean h688_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068802_0(p0);
}
public static boolean h688_3(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068803_0(p0);
}
public static boolean h688_4(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068804_0(p0);
}
public static boolean h688_5(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068805_0(p0);
}
public static boolean h688_6(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068806_0(p0);
}
public static boolean h688_7(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068807_0(p0);
}
public static boolean h688_8(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068808_0(p0);
}
public static boolean h688_9(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068809_0(p0);
}
public static boolean h688_10(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068810_0(p0);
}
public static boolean h688_11(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068811_0(p0);
}
public static boolean h688_12(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068812_0(p0);
}
public static boolean h688_13(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068813_0(p0);
}
public static boolean h688_14(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068814_0(p0);
}
public static boolean h688_15(java.lang.RuntimeException p0) throws Throwable {
    throw __call3068815_0(p0);
}
private static native long __fieldRead688_0() throws Throwable;
private static native java.lang.String __call688_1() throws Throwable;
private static native byte __call688_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native boolean __integerCategory688_3(int value) throws Throwable;
private static native int __invokedynamic688_4(int a0, long a1) throws Throwable;
private static native boolean __integerCategory688_5(int value) throws Throwable;
private static native int __invokedynamic688_6(int a0, long a1) throws Throwable;
private static native boolean __integerCategory688_7(int value) throws Throwable;
private static native java.lang.Exception __call3068800_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068801_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068802_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068803_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068804_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068805_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068806_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068807_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068808_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068809_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068810_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068811_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068812_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068813_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068814_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call3068815_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> double __sourceHandlerCall_11df39d33087adfb9cab(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_11df39d33087adfb9cab {

public static double f595(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue595_23_0;
    double forwardValue595_25_0;
    net.minecraft.nbt.NBTTagCompound spill595_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (__fieldRead595_0() ^ 26274290890512L);
    life4_5 = __call595_1();
    spill595_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue595_23_0 = spill595_0;
        break forward_join_23;
    }
    if (!((!__call595_3(spill595_0, p0, __invokedynamic595_2(20660, (7005334696490838576L ^ life2_3)))))) {
        break forward_join_19;
    }
    forwardValue595_25_0 = 0x0.0p0d;
    break forward_join_25;
    }
    forwardValue595_23_0 = __call595_5(__fieldRead595_4(receiver), p0);
    }
    forwardValue595_25_0 = __call595_7(__cast595_6(forwardValue595_23_0));
    }
    return forwardValue595_25_0;
}
public static double h595_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059500_0(p0);
}
public static double h595_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059501_0(p0);
}
public static double h595_2(java.lang.ClassCastException p0) throws Throwable {
    java.lang.ClassCastException local1 = p0;
    return 0x0.0p0d;
}
private static native long __fieldRead595_0() throws Throwable;
private static native java.lang.String __call595_1() throws Throwable;
private static native int __invokedynamic595_2(int a0, long a1) throws Throwable;
private static native boolean __call595_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead595_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call595_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase$NBTPrimitive __cast595_6(java.lang.Object a0) throws Throwable;
private static native double __call595_7(net.minecraft.nbt.NBTBase$NBTPrimitive a0) throws Throwable;
private static native java.lang.Exception __call2059500_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2059501_0(java.lang.ClassCastException a0) throws Throwable;

}

private static native <E extends Throwable> float __sourceHandlerCall_6438296d182bde19f8a7(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_6438296d182bde19f8a7 {

public static float f596(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue596_23_0;
    float forwardValue596_25_0;
    net.minecraft.nbt.NBTTagCompound spill596_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (__fieldRead596_0() ^ 58389060269498L);
    life4_5 = __call596_1();
    spill596_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue596_23_0 = spill596_0;
        break forward_join_23;
    }
    if (!((!__call596_3(spill596_0, p0, __invokedynamic596_2(20660, (7005296675006343322L ^ life2_3)))))) {
        break forward_join_19;
    }
    forwardValue596_25_0 = 0x0.0p0f;
    break forward_join_25;
    }
    forwardValue596_23_0 = __call596_5(__fieldRead596_4(receiver), p0);
    }
    forwardValue596_25_0 = __call596_7(__cast596_6(forwardValue596_23_0));
    }
    return forwardValue596_25_0;
}
public static float h596_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059600_0(p0);
}
public static float h596_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059601_0(p0);
}
public static float h596_2(java.lang.ClassCastException p0) throws Throwable {
    java.lang.ClassCastException local1 = p0;
    return 0x0.0p0f;
}
private static native long __fieldRead596_0() throws Throwable;
private static native java.lang.String __call596_1() throws Throwable;
private static native int __invokedynamic596_2(int a0, long a1) throws Throwable;
private static native boolean __call596_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead596_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call596_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase$NBTPrimitive __cast596_6(java.lang.Object a0) throws Throwable;
private static native float __call596_7(net.minecraft.nbt.NBTBase$NBTPrimitive a0) throws Throwable;
private static native java.lang.Exception __call2059600_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2059601_0(java.lang.ClassCastException a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_d9adedb23aca9567f4bf(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_d9adedb23aca9567f4bf {

public static int f597(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue597_23_0;
    int forwardValue597_25_0;
    net.minecraft.nbt.NBTTagCompound spill597_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (__fieldRead597_0() ^ 7685639137260L);
    life4_5 = __call597_1();
    spill597_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue597_23_0 = spill597_0;
        break forward_join_23;
    }
    if (!((!__call597_3(spill597_0, p0, __invokedynamic597_2(20660, (7005318238141823692L ^ life2_3)))))) {
        break forward_join_19;
    }
    forwardValue597_25_0 = 0;
    break forward_join_25;
    }
    forwardValue597_23_0 = __call597_5(__fieldRead597_4(receiver), p0);
    }
    forwardValue597_25_0 = __call597_7(__cast597_6(forwardValue597_23_0));
    }
    return forwardValue597_25_0;
}
public static int h597_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059700_0(p0);
}
public static int h597_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059701_0(p0);
}
public static int h597_2(java.lang.ClassCastException p0) throws Throwable {
    java.lang.ClassCastException local1 = p0;
    return 0;
}
private static native long __fieldRead597_0() throws Throwable;
private static native java.lang.String __call597_1() throws Throwable;
private static native int __invokedynamic597_2(int a0, long a1) throws Throwable;
private static native boolean __call597_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead597_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call597_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase$NBTPrimitive __cast597_6(java.lang.Object a0) throws Throwable;
private static native int __call597_7(net.minecraft.nbt.NBTBase$NBTPrimitive a0) throws Throwable;
private static native java.lang.Exception __call2059700_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2059701_0(java.lang.ClassCastException a0) throws Throwable;

}

private static native <E extends Throwable> long __sourceHandlerCall_fb5a15f8f6105ee8b3e5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_fb5a15f8f6105ee8b3e5 {

public static long f598(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue598_23_0;
    long forwardValue598_25_0;
    net.minecraft.nbt.NBTTagCompound spill598_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (__fieldRead598_0() ^ 82055711237429L);
    life4_5 = __call598_1();
    spill598_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue598_23_0 = spill598_0;
        break forward_join_23;
    }
    if (!((!__call598_3(spill598_0, p0, __invokedynamic598_2(20257, (3491061556774004618L ^ life2_3)))))) {
        break forward_join_19;
    }
    forwardValue598_25_0 = 0L;
    break forward_join_25;
    }
    forwardValue598_23_0 = __call598_5(__fieldRead598_4(receiver), p0);
    }
    forwardValue598_25_0 = __call598_7(__cast598_6(forwardValue598_23_0));
    }
    return forwardValue598_25_0;
}
public static long h598_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059800_0(p0);
}
public static long h598_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059801_0(p0);
}
public static long h598_2(java.lang.ClassCastException p0) throws Throwable {
    java.lang.ClassCastException local1 = p0;
    return 0L;
}
private static native long __fieldRead598_0() throws Throwable;
private static native java.lang.String __call598_1() throws Throwable;
private static native int __invokedynamic598_2(int a0, long a1) throws Throwable;
private static native boolean __call598_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead598_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call598_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase$NBTPrimitive __cast598_6(java.lang.Object a0) throws Throwable;
private static native long __call598_7(net.minecraft.nbt.NBTBase$NBTPrimitive a0) throws Throwable;
private static native java.lang.Exception __call2059800_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2059801_0(java.lang.ClassCastException a0) throws Throwable;

}

private static native <E extends Throwable> short __sourceHandlerCall_a4dc28f24df0c33367a5(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_a4dc28f24df0c33367a5 {

public static short f599(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue599_23_0;
    int forwardValue599_25_0;
    net.minecraft.nbt.NBTTagCompound spill599_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (__fieldRead599_0() ^ 41023784533120L);
    life4_5 = __call599_1();
    spill599_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue599_23_0 = spill599_0;
        break forward_join_23;
    }
    if (!((!__call599_3(spill599_0, p0, __invokedynamic599_2(20660, (7005279266243010976L ^ life2_3)))))) {
        break forward_join_19;
    }
    forwardValue599_25_0 = 0;
    break forward_join_25;
    }
    forwardValue599_23_0 = __call599_5(__fieldRead599_4(receiver), p0);
    }
    forwardValue599_25_0 = __integerCategory599_8(__call599_7(__cast599_6(forwardValue599_23_0)));
    }
    return __integerCategory599_9(forwardValue599_25_0);
}
public static short h599_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059900_0(p0);
}
public static short h599_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2059901_0(p0);
}
public static short h599_2(java.lang.ClassCastException p0) throws Throwable {
    java.lang.ClassCastException local1 = p0;
    return ((short) 0);
}
private static native long __fieldRead599_0() throws Throwable;
private static native java.lang.String __call599_1() throws Throwable;
private static native int __invokedynamic599_2(int a0, long a1) throws Throwable;
private static native boolean __call599_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead599_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call599_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase$NBTPrimitive __cast599_6(java.lang.Object a0) throws Throwable;
private static native short __call599_7(net.minecraft.nbt.NBTBase$NBTPrimitive a0) throws Throwable;
private static native int __integerCategory599_8(short value) throws Throwable;
private static native short __integerCategory599_9(int value) throws Throwable;
private static native java.lang.Exception __call2059900_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2059901_0(java.lang.ClassCastException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_5514ce60757736630ec3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_5514ce60757736630ec3 {

public static java.lang.String f600(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    net.minecraft.nbt.NBTBase forwardValue600_24_0;
    java.lang.String forwardValue600_25_0;
    net.minecraft.nbt.NBTTagCompound spill600_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_24: {
    forward_join_19: {
    life2_3 = (__fieldRead600_0() ^ 51674838171506L);
    life4_5 = __call600_1();
    spill600_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue600_24_0 = spill600_0;
        break forward_join_24;
    }
    if (!((!__call600_3(spill600_0, p0, __invokedynamic600_2(579, (6285904392229318817L ^ life2_3)))))) {
        break forward_join_19;
    }
    forwardValue600_25_0 = "";
    break forward_join_25;
    }
    forwardValue600_24_0 = __cast600_6(__call600_5(__fieldRead600_4(receiver), p0));
    }
    forwardValue600_25_0 = __call600_7(forwardValue600_24_0);
    }
    return forwardValue600_25_0;
}
public static java.lang.String h600_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2060000_0(p0);
}
public static java.lang.String h600_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2060001_0(p0);
}
public static java.lang.String h600_2(java.lang.ClassCastException p0) throws Throwable {
    java.lang.ClassCastException local1 = p0;
    return "";
}
private static native long __fieldRead600_0() throws Throwable;
private static native java.lang.String __call600_1() throws Throwable;
private static native int __invokedynamic600_2(int a0, long a1) throws Throwable;
private static native boolean __call600_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead600_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call600_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase __cast600_6(java.lang.Object a0) throws Throwable;
private static native java.lang.String __call600_7(net.minecraft.nbt.NBTBase a0) throws Throwable;
private static native java.lang.Exception __call2060000_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2060001_0(java.lang.ClassCastException a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.nbt.NBTTagCompound __sourceHandlerCall_b7ebd94b96d67f98003a(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_b7ebd94b96d67f98003a {

public static net.minecraft.nbt.NBTTagCompound f578(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue578_25_0;
    net.minecraft.nbt.NBTTagCompound forwardValue578_26_0;
    net.minecraft.nbt.NBTTagCompound spill578_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_26: {
    forward_join_25: {
    forward_join_21: {
    life2_3 = (__fieldRead578_0() ^ 51512920865212L);
    life4_5 = __call578_1();
    spill578_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue578_25_0 = spill578_0;
        break forward_join_25;
    }
    if (!((!__call578_3(spill578_0, p0, __invokedynamic578_2(8167, (3275417878173838276L ^ life2_3)))))) {
        break forward_join_21;
    }
    forwardValue578_26_0 = new net.minecraft.nbt.NBTTagCompound();
    break forward_join_26;
    }
    forwardValue578_25_0 = __call578_5(__fieldRead578_4(receiver), p0);
    }
    forwardValue578_26_0 = __cast578_6(forwardValue578_25_0);
    }
    return forwardValue578_26_0;
}
public static net.minecraft.nbt.NBTTagCompound h578_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057800_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h578_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2057801_0(p0);
}
public static net.minecraft.nbt.NBTTagCompound h578_2(java.lang.ClassCastException p0, net.minecraft.nbt.NBTTagCompound p1, java.lang.String p2, long p3) throws Throwable {
    java.lang.ClassCastException local5 = p0;
    throw new moom.Oo(__call2057802_1(p1, p2, __invokedynamic2057802_0(8167, (3275417878173838276L ^ p3)), local5));
}
private static native long __fieldRead578_0() throws Throwable;
private static native java.lang.String __call578_1() throws Throwable;
private static native int __invokedynamic578_2(int a0, long a1) throws Throwable;
private static native boolean __call578_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead578_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call578_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast578_6(java.lang.Object a0) throws Throwable;
private static native java.lang.Exception __call2057800_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2057801_0(java.lang.ClassCastException a0) throws Throwable;
private static native int __invokedynamic2057802_0(int a0, long a1) throws Throwable;
private static native moom.qY __call2057802_1(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2, java.lang.ClassCastException a3) throws Throwable;

}

private static native <E extends Throwable> byte __sourceHandlerCall_3001b368874d0645930d(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_3001b368874d0645930d {

public static byte f602(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    java.lang.Object forwardValue602_23_0;
    int forwardValue602_25_0;
    net.minecraft.nbt.NBTTagCompound spill602_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_25: {
    forward_join_23: {
    forward_join_19: {
    life2_3 = (__fieldRead602_0() ^ 53848429496456L);
    life4_5 = __call602_1();
    spill602_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue602_23_0 = spill602_0;
        break forward_join_23;
    }
    if (!((!__call602_3(spill602_0, p0, __invokedynamic602_2(20660, (7005302862650234280L ^ life2_3)))))) {
        break forward_join_19;
    }
    forwardValue602_25_0 = 0;
    break forward_join_25;
    }
    forwardValue602_23_0 = __call602_5(__fieldRead602_4(receiver), p0);
    }
    forwardValue602_25_0 = __integerCategory602_8(__call602_7(__cast602_6(forwardValue602_23_0)));
    }
    return __integerCategory602_9(forwardValue602_25_0);
}
public static byte h602_0(java.lang.ClassCastException p0) throws Throwable {
    throw __call2060200_0(p0);
}
public static byte h602_1(java.lang.ClassCastException p0) throws Throwable {
    throw __call2060201_0(p0);
}
public static byte h602_2(java.lang.ClassCastException p0) throws Throwable {
    java.lang.ClassCastException local1 = p0;
    return ((byte) 0);
}
private static native long __fieldRead602_0() throws Throwable;
private static native java.lang.String __call602_1() throws Throwable;
private static native int __invokedynamic602_2(int a0, long a1) throws Throwable;
private static native boolean __call602_3(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1, int a2) throws Throwable;
private static native java.util.Map __fieldRead602_4(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.lang.Object __call602_5(java.util.Map a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.nbt.NBTBase$NBTPrimitive __cast602_6(java.lang.Object a0) throws Throwable;
private static native byte __call602_7(net.minecraft.nbt.NBTBase$NBTPrimitive a0) throws Throwable;
private static native int __integerCategory602_8(byte value) throws Throwable;
private static native byte __integerCategory602_9(int value) throws Throwable;
private static native java.lang.Exception __call2060200_0(java.lang.ClassCastException a0) throws Throwable;
private static native java.lang.Exception __call2060201_0(java.lang.ClassCastException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_ce69e5a535f7bf76e707(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;
private static final class __SourceHandler_ce69e5a535f7bf76e707 {

public static boolean f1609(net.minecraft.nbt.NBTTagCompound receiver, java.lang.String p0) throws Throwable {
    int forwardValue1609_13_0;
    int forwardValue1609_15_0;
    byte spill1609_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_15: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (__fieldRead1609_0() ^ 18042648874183L);
    life4_5 = __call1609_1();
    spill1609_0 = __call1609_2(receiver, p0);
    if (!((life4_5 == null))) {
        forwardValue1609_13_0 = __integerCategory1609_3(spill1609_0);
        break forward_join_13;
    }
    if (!((spill1609_0 != 0))) {
        break forward_join_14;
    }
    forwardValue1609_13_0 = 1;
    }
    forwardValue1609_15_0 = forwardValue1609_13_0;
    break forward_join_15;
    }
    forwardValue1609_15_0 = 0;
    }
    return __integerCategory1609_4(forwardValue1609_15_0);
}
public static void h1609_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1160900_0(p0);
}
private static native long __fieldRead1609_0() throws Throwable;
private static native java.lang.String __call1609_1() throws Throwable;
private static native byte __call1609_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws Throwable;
private static native int __integerCategory1609_3(byte value) throws Throwable;
private static native boolean __integerCategory1609_4(int value) throws Throwable;
private static native java.lang.Exception __call1160900_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_8107d2ba6a2c36ee25ff() throws E;
private static final class __SourceHandler_8107d2ba6a2c36ee25ff {

public static boolean f2900() throws Throwable {
    int life0_1;
    life0_1 = __integerCategory2900_1(__call2900_0());
    if ((life0_1 == 0)) {
        return true;
    }
    return false;
}
public static void h2900_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1290000_0(p0);
}
private static native boolean __call2900_0() throws Throwable;
private static native int __integerCategory2900_1(boolean value) throws Throwable;
private static native java.lang.Exception __call1290000_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_cf20ab2938cd52f3d352(net.minecraft.nbt.NBTTagCompound a0, java.lang.Object a1) throws E;
private static final class __SourceHandler_cf20ab2938cd52f3d352 {

public static boolean f1610(net.minecraft.nbt.NBTTagCompound receiver, java.lang.Object p0) throws Throwable {
    int forwardValue1610_24_0;
    boolean spill1610_0;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.nbt.NBTTagCompound life5_17;
    forward_join_24: {
    forward_join_23: {
    life2_3 = (__fieldRead1610_0() ^ 126413825231006L);
    life4_5 = __call1610_1();
    spill1610_0 = __call1610_2(receiver, p0);
    if (!((life4_5 == null))) {
        forwardValue1610_24_0 = __integerCategory1610_3(spill1610_0);
        break forward_join_24;
    }
    if (!(spill1610_0)) {
        break forward_join_23;
    }
    life5_17 = __cast1610_4(p0);
    return __call1610_9(__call1610_6(__fieldRead1610_5(receiver)), __call1610_8(__fieldRead1610_7(life5_17)));
    }
    forwardValue1610_24_0 = 0;
    }
    return __integerCategory1610_10(forwardValue1610_24_0);
}
public static void h1610_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1161000_0(p0);
}
private static native long __fieldRead1610_0() throws Throwable;
private static native java.lang.String __call1610_1() throws Throwable;
private static native boolean __call1610_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.Object a1) throws Throwable;
private static native int __integerCategory1610_3(boolean value) throws Throwable;
private static native net.minecraft.nbt.NBTTagCompound __cast1610_4(java.lang.Object a0) throws Throwable;
private static native java.util.Map __fieldRead1610_5(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Set __call1610_6(java.util.Map a0) throws Throwable;
private static native java.util.Map __fieldRead1610_7(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Set __call1610_8(java.util.Map a0) throws Throwable;
private static native boolean __call1610_9(java.util.Set a0, java.util.Set a1) throws Throwable;
private static native boolean __integerCategory1610_10(int value) throws Throwable;
private static native java.lang.Exception __call1161000_0(java.lang.RuntimeException a0) throws Throwable;

}

private static native <E extends Throwable> java.lang.String __sourceHandlerCall_e67f1110755f810cd221(net.minecraft.nbt.NBTTagCompound a0) throws E;
private static final class __SourceHandler_e67f1110755f810cd221 {

public static java.lang.String f263(net.minecraft.nbt.NBTTagCompound receiver) throws Throwable {
    java.lang.StringBuilder lexicalValue263_53_0;
    java.lang.StringBuilder lexicalValue263_63_0;
    java.lang.String spill263_0;
    java.lang.StringBuilder spill263_1;
    long life1_3;
    java.lang.StringBuilder life4_9;
    java.lang.String life3_10;
    java.util.Iterator life5_15;
    java.util.Map.Entry life6_22;
    lexical_join_63: {
    lexical_join_56: {
    life1_3 = (__fieldRead263_0() ^ 50303845871349L);
    spill263_0 = __call263_1();
    life4_9 = new java.lang.StringBuilder("{");
    life3_10 = spill263_0;
    life5_15 = __call263_4(__call263_3(__fieldRead263_2(receiver)));
    lexical_cycle_16: while (true) {
    lexical_join_53: {
    lexical_join_39: {
    if (!(__call263_5(life5_15))) {
        break lexical_join_56;
    }
    life6_22 = __cast263_7(__call263_6(life5_15));
    spill263_1 = life4_9;
    if (!((life3_10 == null))) {
        lexicalValue263_63_0 = spill263_1;
        break lexical_join_63;
    }
    if (!((life3_10 == null))) {
        lexicalValue263_53_0 = spill263_1;
        break lexical_join_53;
    }
    if (!((__call263_8(spill263_1) != 1))) {
        break lexical_join_39;
    }
    __call263_10(life4_9, __invokedynamic263_9(18538, (137951845502970631L ^ life1_3)));
    }
    lexicalValue263_53_0 = __call263_17(__call263_15(__call263_13(life4_9, __cast263_12(__call263_11(life6_22))), __invokedynamic263_14(12032, (9214254355328699496L ^ life1_3))), __call263_16(life6_22));
    }
    __discardScalar263_18(lexicalValue263_53_0);
    if (!((life3_10 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    lexicalValue263_63_0 = __call263_20(life4_9, __invokedynamic263_19(17946, (9096068208133006718L ^ life1_3)));
    }
    return __call263_21(lexicalValue263_63_0);
}
public static void h263_0(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026300_0(p0);
}
public static void h263_1(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026301_0(p0);
}
public static void h263_2(java.lang.RuntimeException p0) throws Throwable {
    throw __call1026302_0(p0);
}
private static native long __fieldRead263_0() throws Throwable;
private static native java.lang.String __call263_1() throws Throwable;
private static native java.util.Map __fieldRead263_2(net.minecraft.nbt.NBTTagCompound a0) throws Throwable;
private static native java.util.Set __call263_3(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call263_4(java.util.Set a0) throws Throwable;
private static native boolean __call263_5(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call263_6(java.util.Iterator a0) throws Throwable;
private static native java.util.Map.Entry __cast263_7(java.lang.Object a0) throws Throwable;
private static native int __call263_8(java.lang.StringBuilder a0) throws Throwable;
private static native int __invokedynamic263_9(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call263_10(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.Object __call263_11(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.String __cast263_12(java.lang.Object a0) throws Throwable;
private static native java.lang.StringBuilder __call263_13(java.lang.StringBuilder a0, java.lang.String a1) throws Throwable;
private static native int __invokedynamic263_14(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call263_15(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.Object __call263_16(java.util.Map.Entry a0) throws Throwable;
private static native java.lang.StringBuilder __call263_17(java.lang.StringBuilder a0, java.lang.Object a1) throws Throwable;
private static native void __discardScalar263_18(java.lang.StringBuilder a0) throws Throwable;
private static native int __invokedynamic263_19(int a0, long a1) throws Throwable;
private static native java.lang.StringBuilder __call263_20(java.lang.StringBuilder a0, int a1) throws Throwable;
private static native java.lang.String __call263_21(java.lang.StringBuilder a0) throws Throwable;
private static native java.lang.Exception __call1026300_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026301_0(java.lang.RuntimeException a0) throws Throwable;
private static native java.lang.Exception __call1026302_0(java.lang.RuntimeException a0) throws Throwable;

}


public boolean equals(java.lang.Object p0) { return __sourceHandlerCall_cf20ab2938cd52f3d352(this, p0); }


public java.lang.String toString() { return __sourceHandlerCall_e67f1110755f810cd221(this); }


public int hashCode() {
return (super.hashCode() ^ ((java.util.Map)(this.c)).hashCode());
}


public byte b__sourceReturn_d4c7a9581c(java.lang.String p0) { return __sourceHandlerCall_3001b368874d0645930d(this, p0); }


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11987_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public boolean b__Boolean(java.lang.String p0) { return __sourceHandlerCall_ce69e5a535f7bf76e707(this, p0); }


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.nbt.NBTTagCompound.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 7635);
    if (((net.minecraft.nbt.NBTTagCompound.k)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.nbt.NBTTagCompound.j)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.nbt.NBTTagCompound.l)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.nbt.NBTTagCompound.l)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/yw", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.nbt.NBTTagCompound.k)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.nbt.NBTTagCompound.k)[life3_8])).longValue();
}


public static void b(boolean p0) {
d = ((boolean)(p0));
    return;
}


public static boolean c() {
return ((((net.minecraft.nbt.NBTTagCompound.d) ? 1 : 0)) != 0);
}


public static boolean d() { return __sourceHandlerCall_8107d2ba6a2c36ee25ff(); }


private static void a(java.lang.String p0, net.minecraft.nbt.NBTBase p1, java.io.DataOutput p2) throws java.io.IOException { __sourceHandlerCall_6c574e3ec788ae104597(p0, p1, p2); }


private static byte a(java.io.DataInput p0, moom.yB p1) throws java.io.IOException {
return ((java.io.DataInput)(p0)).readByte();
}


static net.minecraft.nbt.NBTBase a(byte p0, java.lang.String p1, java.io.DataInput p2, int p3, moom.yB p4) throws java.io.IOException {
net.minecraft.nbt.NBTBase life5_2;
    moom.qY life7_14;
    moom.qZ life8_18;
    life5_2 = net.minecraft.nbt.NBTBase.a(((byte)(p0)));
    try {
        ((net.minecraft.nbt.NBTBase)(life5_2)).a(((java.io.DataInput)(p2)), ((int)(p3)), ((moom.yB)(p4)));
        return life5_2;
    } catch (java.io.IOException life6_10) {
        life7_14 = moom.qY.a(((java.lang.Throwable)(life6_10)), ((java.lang.String)("Loading NBT data")));
        life8_18 = ((moom.qY)(life7_14)).a(((java.lang.String)("NBT Tag")));
        ((moom.qZ)(life8_18)).a(((java.lang.String)("Tag name")), ((java.lang.Object)(p1)));
        ((moom.qZ)(life8_18)).a(((java.lang.String)("Tag type")), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(p0))))));
        throw new moom.Oo(life7_14);
    }
}


private static java.lang.String a__String(java.io.DataInput p0, moom.yB p1) throws java.io.IOException {
return ((java.io.DataInput)(p0)).readUTF();
}


public void a(java.lang.String p0, short p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yu(p1))));
    return;
}


public boolean a__Boolean() {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.c)).isEmpty())) != 0);
}


private moom.qY a(java.lang.String p0, int p1, java.lang.ClassCastException p2) {
moom.qY local4 = moom.qY.a(((java.lang.Throwable)(p2)), ((java.lang.String)("Reading NBT data")));
    moom.qZ local5 = ((moom.qY)(local4)).a(((java.lang.String)("Corrupt NBT tag")), ((int)(1)));
    ((moom.qZ)(local5)).a(((java.lang.String)("Tag type found")), ((java.util.concurrent.Callable)(__sourceIntrinsic_a4f0e78b0adc_originalDynamicSite2027_2(this, p0))));
    ((moom.qZ)(local5)).a(((java.lang.String)("Tag type expected")), ((java.util.concurrent.Callable)(__sourceIntrinsic_a4f0e78b0adc_originalDynamicSite2027_4(p1))));
    ((moom.qZ)(local5)).a(((java.lang.String)("Tag name")), ((java.lang.Object)(p0)));
    return local4;
}


public net.minecraft.nbt.NBTBase a__yn() {
long local1 = (net.minecraft.nbt.NBTTagCompound.e ^ 47059364017867L);
    net.minecraft.nbt.NBTTagCompound local3 = new net.minecraft.nbt.NBTTagCompound();
    java.util.Iterator local4 = ((java.util.Set)(((java.util.Map)(this.c)).keySet())).iterator();
    while (((java.util.Iterator)(local4)).hasNext()) {
        java.lang.String local5 = ((java.lang.String)(((java.util.Iterator)(local4)).next()));
        ((net.minecraft.nbt.NBTTagCompound)(local3)).a(((java.lang.String)(local5)), ((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTBase)(((java.util.Map)(this.c)).get(((java.lang.Object)(local5))))))).a__yn())));
    }
    return local3;
}


public void a(java.lang.String p0, byte p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yp(p1))));
    return;
}


public void a(java.lang.String p0, net.minecraft.nbt.NBTBase p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(p1)));
    return;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.nbt.NBTTagCompound.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral11994_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/yw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


void a(java.io.DataInput p0, int p1, moom.yB p2) throws java.io.IOException { __sourceHandlerCall_423fa283c9e0c56d9163(this, p0, p1, p2); }


void a(java.io.DataOutput p0) throws java.io.IOException { __sourceHandlerCall_163bbfae7d48f87805c6(this, p0); }


public int[] a__ArrayInt(java.lang.String p0) { return __sourceHandlerCall_9543e01516fdec35c087(this, p0); }


public void a(net.minecraft.nbt.NBTTagCompound p0) { __sourceHandlerCall_93fdcb98609e94dbb674(this, p0); }


public byte a() {
long life1_3;
    life1_3 = (net.minecraft.nbt.NBTTagCompound.e ^ 48376979589946L);
    return ((byte)(__sourceIntrinsic_f90ab603e3aa_invokedynamic1129_1(8167, (3275412233830897986L ^ life1_3))));
}


public java.util.Set<java.lang.String> a__Set() {
return ((java.util.Map)(this.c)).keySet();
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31248;
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
            throw new RuntimeException("moom/yw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         h[var3] = var15;
      }

      return h[var3];
}


public byte a(java.lang.String p0) { return __sourceHandlerCall_163dcb7803971cb7f67a(this, p0); }


public boolean a__Boolean(java.lang.String p0) {
return (__sourceIntrinsic_booleanComparison((((java.util.Map)(this.c)).containsKey(((java.lang.Object)(p0))))) != 0);
}


public boolean a__Boolean(java.lang.String p0, int p1) { return __sourceHandlerCall_f9e754ee8b9c6d19d855(this, p0, p1); }


public void a(java.lang.String p0, float p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yr(p1))));
    return;
}


public short a__Short(java.lang.String p0) { return __sourceHandlerCall_a4dc28f24df0c33367a5(this, p0); }


public void a(java.lang.String p0, double p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yq(p1))));
    return;
}


public void a(java.lang.String p0, java.lang.String p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yA(p1))));
    return;
}


public void a(java.lang.String p0, byte[] p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yv(p1))));
    return;
}


public void a(java.lang.String p0, int[] p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yy(p1))));
    return;
}


public void a(java.lang.String p0, boolean p1) { __sourceHandlerCall_0847222c25805a834914(this, p0, p1); }


public net.minecraft.nbt.NBTBase a__yn(java.lang.String p0) {
return ((net.minecraft.nbt.NBTBase)(((java.util.Map)(this.c)).get(((java.lang.Object)(p0)))));
}


public java.lang.String a__String(java.lang.String p0) { return __sourceHandlerCall_5514ce60757736630ec3(this, p0); }


public void a__Void(java.lang.String p0) {
((java.util.Map)(this.c)).remove(((java.lang.Object)(p0)));
    return;
}


public void a(java.lang.String p0, long p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.yt(p1))));
    return;
}


public net.minecraft.nbt.NBTTagCompound a__yw(java.lang.String p0) { return __sourceHandlerCall_b7ebd94b96d67f98003a(this, p0); }


public net.minecraft.nbt.NBTTagList a(java.lang.String p0, int p1) { return __sourceHandlerCall_9451f4f2a12e1f707acd(this, p0, p1); }


public void a__Void(java.lang.String p0, int p1) {
((java.util.Map)(this.c)).put(((java.lang.Object)(p0)), ((java.lang.Object)(new moom.ys(p1))));
    return;
}


public byte[] a__ArrayByte(java.lang.String p0) { return __sourceHandlerCall_cfef05859fe96206e625(this, p0); }


public int a__Int(java.lang.String p0) { return __sourceHandlerCall_d9adedb23aca9567f4bf(this, p0); }


public long a__Long(java.lang.String p0) { return __sourceHandlerCall_fb5a15f8f6105ee8b3e5(this, p0); }


public float a__Float(java.lang.String p0) { return __sourceHandlerCall_6438296d182bde19f8a7(this, p0); }


public double a__Double(java.lang.String p0) { return __sourceHandlerCall_11df39d33087adfb9cab(this, p0); }


private static java.lang.String lambda$createCrashReport$1(int p0) throws java.lang.Exception {
return (net.minecraft.nbt.NBTBase.a)[p0];
}


private java.lang.String lambda$createCrashReport$0(java.lang.String p0) throws java.lang.Exception {
return (net.minecraft.nbt.NBTBase.a)[((net.minecraft.nbt.NBTBase)(((net.minecraft.nbt.NBTBase)(((java.util.Map)(this.c)).get(((java.lang.Object)(p0))))))).a()];
}


private static native <E extends Throwable> int __sourceIntrinsic_f90ab603e3aa_invokedynamic1129_1(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_a4f0e78b0adc_originalDynamicSite2027_2(net.minecraft.nbt.NBTTagCompound a0, java.lang.String a1) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_a4f0e78b0adc_originalDynamicSite2027_4(int a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral11994_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral11987_0() throws E;

private static native boolean __sourceIntrinsic_integerToBoolean(int value);

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
