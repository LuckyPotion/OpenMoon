package net.minecraft.world.biome;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class WorldChunkManager {

private moom.GD a;

private moom.GD b;

private moom.EM c;

private java.util.List<net.minecraft.world.biome.BiomeGenBase> d;

private java.lang.String e;

private static java.lang.String f;

private static long i;

private static long[] k;

private static java.lang.Integer[] l;

private static java.util.Map m;

public WorldChunkManager(net.minecraft.world.World p0) {
this(((long)(((net.minecraft.world.World)(p0)).a__Long())), ((net.minecraft.world.WorldType)(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p0)).a__IX())).a__EL())), ((java.lang.String)(((net.minecraft.world.storage.WorldInfo)(((net.minecraft.world.World)(p0)).a__IX())).b__String())));
    return;
}


public WorldChunkManager(long p0, net.minecraft.world.WorldType p1, java.lang.String p2) {
this();
    this.e = ((java.lang.String)(p2));
    moom.GD[] local5 = moom.GD.a(((long)(p0)), ((net.minecraft.world.WorldType)(p1)), ((java.lang.String)(p2)));
    this.a = ((moom.GD)((local5)[0]));
    this.b = ((moom.GD)((local5)[1]));
    return;
}


protected WorldChunkManager() {
super();
    this.c = new moom.EM(this);
    this.e = "";
    this.d = com.google.common.collect.Lists.newArrayList();
    (this.d).add(net.minecraft.world.biome.BiomeGenBase.v);
    (this.d).add(net.minecraft.world.biome.BiomeGenBase.s);
    (this.d).add(net.minecraft.world.biome.BiomeGenBase.w);
    (this.d).add(net.minecraft.world.biome.BiomeGenBase.K);
    (this.d).add(net.minecraft.world.biome.BiomeGenBase.J);
    (this.d).add(net.minecraft.world.biome.BiomeGenBase.M);
    (this.d).add(net.minecraft.world.biome.BiomeGenBase.N);
}


static {
i = ((long)(((moom._a)(moom._c.a(((long)(4372470474289288932L)), ((long)(-7398240090266960808L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(112818727664312L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill1943_7 = null;
    long local0_life8 = (net.minecraft.world.biome.WorldChunkManager.i ^ 124948447624792L);
    net.minecraft.world.biome.WorldChunkManager.b(((java.lang.String)(__sourceSpill1943_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill1943_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1943_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1943_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1943_16 = new byte[8];
    (__sourceSpill1943_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill1943_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation1943_18 = __sourceSpill1943_16;
    ((javax.crypto.Cipher)(__sourceSpill1943_13)).init(((int)(__sourceSpill1943_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1943_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1943_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[4];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "yÍ\034ÃKN/wââ("))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1943_27 = local6_life23;
        int __sourceSpill1943_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1943_27)).substring(((int)(__sourceSpill1943_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1943_32 = local8_life21;
        int __sourceSpill1943_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill1943_35 = new byte[8];
        (__sourceSpill1943_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill1943_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill1943_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill1943_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill1943_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill1943_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill1943_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill1943_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill1943_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill1943_36)).doFinal(((byte[])(__sourceSpill1943_35)));
        (__sourceSpill1943_32)[__sourceSpill1943_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "\030|²ú¨øÙÍÏu\001\023c\013"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill1943_40 = local6_life23;
        int __sourceSpill1943_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1943_40)).substring(((int)(__sourceSpill1943_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1943_45 = local8_life21;
        int __sourceSpill1943_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill1943_48 = new byte[8];
        (__sourceSpill1943_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill1943_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill1943_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill1943_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill1943_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill1943_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill1943_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill1943_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill1943_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill1943_49)).doFinal(((byte[])(__sourceSpill1943_48)));
        (__sourceSpill1943_45)[__sourceSpill1943_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    k = ((long[])(local8_life21));
    l = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> boolean __sourceHandlerCall_e29f5be0ecf83220fc16(net.minecraft.world.biome.WorldChunkManager a0, int a1, int a2, int a3, java.util.List a4) throws E;
private static final class __SourceHandler_e29f5be0ecf83220fc16 {

public static boolean f621(net.minecraft.world.biome.WorldChunkManager receiver, int p0, int p1, int p2, java.util.List p3) throws Throwable {
    int lexicalValue621_77_0;
    java.lang.String spill621_0;
    boolean spill621_1;
    long life5_3;
    int life8_10;
    int life9_16;
    int life10_22;
    int life11_29;
    int life12_35;
    java.lang.String life7_36;
    int life13_42;
    int[] life14_50;
    int life15_52;
    net.minecraft.world.biome.BiomeGenBase life16_62;
    lexical_join_77: {
    lexical_join_76: {
    life5_3 = (__fieldRead621_0() ^ 56046821734241L);
    __call621_1();
    life8_10 = ((p0 - p2) >> 2);
    life9_16 = ((p1 - p2) >> 2);
    life10_22 = ((p0 + p2) >> 2);
    spill621_0 = __call621_2();
    life11_29 = ((p1 + p2) >> 2);
    life12_35 = ((life10_22 - life8_10) + 1);
    life7_36 = spill621_0;
    life13_42 = ((life11_29 - life9_16) + 1);
    life14_50 = __call621_4(__fieldRead621_3(receiver), life8_10, life9_16, life12_35, life13_42);
    life15_52 = 0;
    lexical_cycle_53: while (true) {
    lexical_join_74: {
    lexical_join_73: {
    if (!((life15_52 < (life12_35 * life13_42)))) {
        break lexical_join_76;
    }
    life16_62 = __call621_5((life14_50)[life15_52]);
    if (!((life7_36 == null))) {
        break lexical_join_74;
    }
    spill621_1 = __call621_6(p3, life16_62);
    if (!((life7_36 == null))) {
        lexicalValue621_77_0 = __integerCategory621_7(spill621_1);
        break lexical_join_77;
    }
    if (!((!spill621_1))) {
        break lexical_join_73;
    }
    return __integerCategory621_8(0);
    }
    life15_52 += 1;
    }
    if (!((life7_36 != null))) { continue lexical_cycle_53; }
    break lexical_cycle_53;
    }
    }
    lexicalValue621_77_0 = 1;
    }
    return __integerCategory621_9(lexicalValue621_77_0);
}
public static boolean h621_0(java.lang.Throwable p0) throws Throwable {
    throw __call2062100_0(p0);
}
public static boolean h621_1(java.lang.Throwable p0) throws Throwable {
    throw __call2062101_0(p0);
}
public static boolean h621_2(java.lang.Throwable p0, net.minecraft.world.biome.WorldChunkManager p1, int p2, int p3, int p4, java.util.List p5) throws Throwable {
    java.lang.Throwable local6 = p0;
    moom.qY local7 = __call2062102_0(local6, "Invalid Biome id");
    moom.qZ local8 = __call2062102_1(local7, "Layer");
    __call2062102_4(local8, "Layer", __call2062102_3(__fieldRead2062102_2(p1)));
    __call2062102_6(local8, "x", __call2062102_5(p2));
    __call2062102_8(local8, "z", __call2062102_7(p3));
    __call2062102_10(local8, "radius", __call2062102_9(p4));
    __call2062102_11(local8, "allowed", p5);
    throw new moom.Oo(local7);
}
private static native long __fieldRead621_0() throws Throwable;
private static native void __call621_1() throws Throwable;
private static native java.lang.String __call621_2() throws Throwable;
private static native moom.GD __fieldRead621_3(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native int[] __call621_4(moom.GD a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call621_5(int a0) throws Throwable;
private static native boolean __call621_6(java.util.List a0, net.minecraft.world.biome.BiomeGenBase a1) throws Throwable;
private static native int __integerCategory621_7(boolean value) throws Throwable;
private static native boolean __integerCategory621_8(int value) throws Throwable;
private static native boolean __integerCategory621_9(int value) throws Throwable;
private static native java.lang.Throwable __call2062100_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062101_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2062102_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2062102_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native moom.GD __fieldRead2062102_2(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native java.lang.String __call2062102_3(moom.GD a0) throws Throwable;
private static native void __call2062102_4(moom.qZ a0, java.lang.String a1, java.lang.String a2) throws Throwable;
private static native java.lang.Integer __call2062102_5(int a0) throws Throwable;
private static native void __call2062102_6(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062102_7(int a0) throws Throwable;
private static native void __call2062102_8(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062102_9(int a0) throws Throwable;
private static native void __call2062102_10(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native void __call2062102_11(moom.qZ a0, java.lang.String a1, java.util.List a2) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_d09505c47630a7b912a0(net.minecraft.world.biome.WorldChunkManager a0, int a1, int a2, int a3, java.util.List a4, java.util.Random a5) throws E;
private static final class __SourceHandler_d09505c47630a7b912a0 {

public static moom.DT f1790(net.minecraft.world.biome.WorldChunkManager receiver, int p0, int p1, int p2, java.util.List p3, java.util.Random p4) throws Throwable {
    moom.DT lexicalValue1790_105_0;
    java.lang.String spill1790_0;
    moom.DT spill1790_1;
    long life6_3;
    java.lang.String life8_6;
    int life9_12;
    int life10_18;
    int life11_24;
    int life12_30;
    int life13_36;
    int life14_42;
    int[] life15_50;
    moom.DT life16_52;
    int life17_54;
    int life18_56;
    int life19_69;
    int life20_77;
    net.minecraft.world.biome.BiomeGenBase life21_82;
    lexical_join_110: {
    life6_3 = (__fieldRead1790_0() ^ 107260946528432L);
    spill1790_0 = __call1790_1();
    __call1790_2();
    life8_6 = spill1790_0;
    life9_12 = ((p0 - p2) >> 2);
    life10_18 = ((p1 - p2) >> 2);
    life11_24 = ((p0 + p2) >> 2);
    life12_30 = ((p1 + p2) >> 2);
    life13_36 = ((life11_24 - life9_12) + 1);
    life14_42 = ((life12_30 - life10_18) + 1);
    life15_50 = __call1790_4(__fieldRead1790_3(receiver), life9_12, life10_18, life13_36, life14_42);
    life16_52 = null;
    life17_54 = 0;
    life18_56 = 0;
    lexical_cycle_57: while (true) {
    lexical_join_108: {
    lexical_join_107: {
    lexical_join_105: {
    lexical_join_99: {
    if (!((life18_56 < (life13_36 * life14_42)))) {
        break lexical_join_110;
    }
    life19_69 = ((life9_12 + (life18_56 % life13_36)) << 2);
    life20_77 = ((life10_18 + (life18_56 / life13_36)) << 2);
    life21_82 = __call1790_5((life15_50)[life18_56]);
    if (!((life8_6 == null))) {
        break lexical_join_108;
    }
    if (!(__call1790_6(p3, life21_82))) {
        break lexical_join_107;
    }
    spill1790_1 = life16_52;
    if (!((life8_6 == null))) {
        lexicalValue1790_105_0 = spill1790_1;
        break lexical_join_105;
    }
    if (!((spill1790_1 != null))) {
        break lexical_join_99;
    }
    if (!((__call1790_7(p4, (life17_54 + 1)) == 0))) {
        break lexical_join_107;
    }
    }
    lexicalValue1790_105_0 = new moom.DT(life19_69, 0, life20_77);
    }
    life16_52 = lexicalValue1790_105_0;
    life17_54 += 1;
    }
    life18_56 += 1;
    }
    if (!((life8_6 != null))) { continue lexical_cycle_57; }
    break lexical_cycle_57;
    }
    }
    return life16_52;
}
public static void h1790_0(moom.Oo p0) throws Throwable {
    throw __call1179000_0(p0);
}
public static void h1790_1(moom.Oo p0) throws Throwable {
    throw __call1179001_0(p0);
}
public static void h1790_2(moom.Oo p0) throws Throwable {
    throw __call1179002_0(p0);
}
public static void h1790_3(moom.Oo p0) throws Throwable {
    throw __call1179003_0(p0);
}
public static void h1790_4(moom.Oo p0) throws Throwable {
    throw __call1179004_0(p0);
}
private static native long __fieldRead1790_0() throws Throwable;
private static native java.lang.String __call1790_1() throws Throwable;
private static native void __call1790_2() throws Throwable;
private static native moom.GD __fieldRead1790_3(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native int[] __call1790_4(moom.GD a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1790_5(int a0) throws Throwable;
private static native boolean __call1790_6(java.util.List a0, net.minecraft.world.biome.BiomeGenBase a1) throws Throwable;
private static native int __call1790_7(java.util.Random a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1179000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179004_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> float[] __sourceHandlerCall_d5ec037ac7f78cf5f91f(net.minecraft.world.biome.WorldChunkManager a0, float[] a1, int a2, int a3, int a4, int a5) throws E;
private static final class __SourceHandler_d5ec037ac7f78cf5f91f {

public static float[] f622(net.minecraft.world.biome.WorldChunkManager receiver, float[] p0, int p1, int p2, int p3, int p4) throws Throwable {
    int lexicalValue622_21_0;
    int lexicalValue622_21_1;
    float[] lexicalValue622_23_0;
    java.lang.String spill622_0;
    float[] spill622_1;
    int spill622_2;
    int spill622_3;
    long life6_3;
    java.lang.String life8_6;
    int[] life9_43;
    int life10_45;
    float life11_60;
    lexical_join_64: {
    lexical_join_24: {
    lexical_join_23: {
    lexical_join_21: {
    lexical_join_19: {
    life6_3 = (__fieldRead622_0() ^ 72104836834492L);
    spill622_0 = __call622_1();
    __call622_2();
    life8_6 = spill622_0;
    spill622_1 = p0;
    if (!((life8_6 == null))) {
        lexicalValue622_23_0 = spill622_1;
        break lexical_join_23;
    }
    if (!((spill622_1 != null))) {
        break lexical_join_19;
    }
    spill622_2 = (p0).length;
    spill622_3 = (p3 * p4);
    if (!((life8_6 == null))) {
        lexicalValue622_21_0 = spill622_2;
        lexicalValue622_21_1 = spill622_3;
        break lexical_join_21;
    }
    if (!((spill622_2 < spill622_3))) {
        break lexical_join_24;
    }
    }
    lexicalValue622_21_0 = p3;
    lexicalValue622_21_1 = p4;
    }
    lexicalValue622_23_0 = new float[(lexicalValue622_21_0 * lexicalValue622_21_1)];
    }
    p0 = lexicalValue622_23_0;
    }
    life9_43 = __call622_4(__fieldRead622_3(receiver), p1, p2, p3, p4);
    life10_45 = 0;
    lexical_cycle_34: while (true) {
    lexical_join_61: {
    lexical_join_57: {
    if (!((life10_45 < (p3 * p4)))) {
        break lexical_join_64;
    }
    life11_60 = (((float) __call622_7(__call622_6((life9_43)[life10_45], __fieldRead622_5()))) / 0x1.0p16f);
    if (!((life8_6 == null))) {
        break lexical_join_61;
    }
    if (!((__numericCompare622_8(life11_60, 0x1.0p0f) > 0))) {
        break lexical_join_57;
    }
    life11_60 = 0x1.0p0f;
    }
    (p0)[life10_45] = life11_60;
    }
    life10_45 += 1;
    if (!((life8_6 != null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    return p0;
}
public static float[] h622_0(java.lang.Throwable p0) throws Throwable {
    throw __call2062200_0(p0);
}
public static float[] h622_1(java.lang.Throwable p0) throws Throwable {
    throw __call2062201_0(p0);
}
public static float[] h622_2(java.lang.Throwable p0) throws Throwable {
    throw __call2062202_0(p0);
}
public static float[] h622_3(java.lang.Throwable p0) throws Throwable {
    throw __call2062203_0(p0);
}
public static float[] h622_4(java.lang.Throwable p0) throws Throwable {
    throw __call2062204_0(p0);
}
public static float[] h622_5(java.lang.Throwable p0, float[] p1, int p2, int p3, int p4, int p5, int p6) throws Throwable {
    java.lang.Throwable local7 = p0;
    moom.qY local8 = __call2062205_0(local7, "Invalid Biome id");
    moom.qZ local9 = __call2062205_1(local8, "DownfallBlock");
    __call2062205_3(local9, "biome id", __call2062205_2(p6));
    __call2062205_5(local9, "downfalls[] size", __call2062205_4((p1).length));
    __call2062205_7(local9, "x", __call2062205_6(p2));
    __call2062205_9(local9, "z", __call2062205_8(p3));
    __call2062205_11(local9, "w", __call2062205_10(p4));
    __call2062205_13(local9, "h", __call2062205_12(p5));
    throw new moom.Oo(local8);
}
private static native long __fieldRead622_0() throws Throwable;
private static native java.lang.String __call622_1() throws Throwable;
private static native void __call622_2() throws Throwable;
private static native moom.GD __fieldRead622_3(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native int[] __call622_4(moom.GD a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead622_5() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call622_6(int a0, net.minecraft.world.biome.BiomeGenBase a1) throws Throwable;
private static native int __call622_7(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native int __numericCompare622_8(float a0, float a1) throws Throwable;
private static native java.lang.Throwable __call2062200_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062201_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062202_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062203_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062204_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2062205_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2062205_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __call2062205_2(int a0) throws Throwable;
private static native void __call2062205_3(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062205_4(int a0) throws Throwable;
private static native void __call2062205_5(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062205_6(int a0) throws Throwable;
private static native void __call2062205_7(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062205_8(int a0) throws Throwable;
private static native void __call2062205_9(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062205_10(int a0) throws Throwable;
private static native void __call2062205_11(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062205_12(int a0) throws Throwable;
private static native void __call2062205_13(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.biome.BiomeGenBase[] __sourceHandlerCall_571de18b2e9169581bb4(net.minecraft.world.biome.WorldChunkManager a0, net.minecraft.world.biome.BiomeGenBase[] a1, int a2, int a3, int a4, int a5) throws E;
private static final class __SourceHandler_571de18b2e9169581bb4 {

public static net.minecraft.world.biome.BiomeGenBase[] f623(net.minecraft.world.biome.WorldChunkManager receiver, net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4) throws Throwable {
    int lexicalValue623_21_0;
    int lexicalValue623_21_1;
    net.minecraft.world.biome.BiomeGenBase[] lexicalValue623_23_0;
    net.minecraft.world.biome.BiomeGenBase[] lexicalValue623_53_0;
    java.lang.String spill623_0;
    net.minecraft.world.biome.BiomeGenBase[] spill623_1;
    int spill623_2;
    int spill623_3;
    net.minecraft.world.biome.BiomeGenBase[] spill623_4;
    long life6_3;
    java.lang.String life8_6;
    int[] life9_43;
    int life10_45;
    lexical_join_53: {
    lexical_join_52: {
    lexical_join_24: {
    lexical_join_23: {
    lexical_join_21: {
    lexical_join_19: {
    life6_3 = (__fieldRead623_0() ^ 42761609908106L);
    spill623_0 = __call623_1();
    __call623_2();
    life8_6 = spill623_0;
    spill623_1 = p0;
    if (!((life8_6 == null))) {
        lexicalValue623_23_0 = spill623_1;
        break lexical_join_23;
    }
    if (!((spill623_1 != null))) {
        break lexical_join_19;
    }
    spill623_2 = (p0).length;
    spill623_3 = (p3 * p4);
    if (!((life8_6 == null))) {
        lexicalValue623_21_0 = spill623_2;
        lexicalValue623_21_1 = spill623_3;
        break lexical_join_21;
    }
    if (!((spill623_2 < spill623_3))) {
        break lexical_join_24;
    }
    }
    lexicalValue623_21_0 = p3;
    lexicalValue623_21_1 = p4;
    }
    lexicalValue623_23_0 = new net.minecraft.world.biome.BiomeGenBase[(lexicalValue623_21_0 * lexicalValue623_21_1)];
    }
    p0 = lexicalValue623_23_0;
    }
    life9_43 = __call623_4(__fieldRead623_3(receiver), p1, p2, p3, p4);
    life10_45 = 0;
    lexical_cycle_34: while (true) {
    if (!((life10_45 < (p3 * p4)))) {
        break lexical_join_52;
    }
    spill623_4 = p0;
    if (!((life8_6 == null))) {
        lexicalValue623_53_0 = spill623_4;
        break lexical_join_53;
    }
    (spill623_4)[life10_45] = __call623_6((life9_43)[life10_45], __fieldRead623_5());
    life10_45 += 1;
    if (!((life8_6 != null))) { continue lexical_cycle_34; }
    break lexical_cycle_34;
    }
    }
    lexicalValue623_53_0 = p0;
    }
    return lexicalValue623_53_0;
}
public static net.minecraft.world.biome.BiomeGenBase[] h623_0(java.lang.Throwable p0) throws Throwable {
    throw __call2062300_0(p0);
}
public static net.minecraft.world.biome.BiomeGenBase[] h623_1(java.lang.Throwable p0) throws Throwable {
    throw __call2062301_0(p0);
}
public static net.minecraft.world.biome.BiomeGenBase[] h623_2(java.lang.Throwable p0) throws Throwable {
    throw __call2062302_0(p0);
}
public static net.minecraft.world.biome.BiomeGenBase[] h623_3(java.lang.Throwable p0) throws Throwable {
    throw __call2062303_0(p0);
}
public static net.minecraft.world.biome.BiomeGenBase[] h623_4(java.lang.Throwable p0) throws Throwable {
    throw __call2062304_0(p0);
}
public static net.minecraft.world.biome.BiomeGenBase[] h623_5(java.lang.Throwable p0, net.minecraft.world.biome.BiomeGenBase[] p1, int p2, int p3, int p4, int p5) throws Throwable {
    java.lang.Throwable local6 = p0;
    moom.qY local7 = __call2062305_0(local6, "Invalid Biome id");
    moom.qZ local8 = __call2062305_1(local7, "RawBiomeBlock");
    __call2062305_3(local8, "biomes[] size", __call2062305_2((p1).length));
    __call2062305_5(local8, "x", __call2062305_4(p2));
    __call2062305_7(local8, "z", __call2062305_6(p3));
    __call2062305_9(local8, "w", __call2062305_8(p4));
    __call2062305_11(local8, "h", __call2062305_10(p5));
    throw new moom.Oo(local7);
}
private static native long __fieldRead623_0() throws Throwable;
private static native java.lang.String __call623_1() throws Throwable;
private static native void __call623_2() throws Throwable;
private static native moom.GD __fieldRead623_3(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native int[] __call623_4(moom.GD a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead623_5() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call623_6(int a0, net.minecraft.world.biome.BiomeGenBase a1) throws Throwable;
private static native java.lang.Throwable __call2062300_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062301_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062302_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062303_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2062304_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2062305_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2062305_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.lang.Integer __call2062305_2(int a0) throws Throwable;
private static native void __call2062305_3(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062305_4(int a0) throws Throwable;
private static native void __call2062305_5(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062305_6(int a0) throws Throwable;
private static native void __call2062305_7(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062305_8(int a0) throws Throwable;
private static native void __call2062305_9(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;
private static native java.lang.Integer __call2062305_10(int a0) throws Throwable;
private static native void __call2062305_11(moom.qZ a0, java.lang.String a1, java.lang.Integer a2) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.biome.BiomeGenBase[] __sourceHandlerCall_38f3a838cb06f68c351c(net.minecraft.world.biome.WorldChunkManager a0, net.minecraft.world.biome.BiomeGenBase[] a1, int a2, int a3, int a4, int a5, boolean a6) throws E;
private static final class __SourceHandler_38f3a838cb06f68c351c {

public static net.minecraft.world.biome.BiomeGenBase[] f1791(net.minecraft.world.biome.WorldChunkManager receiver, net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4, boolean p5) throws Throwable {
    net.minecraft.world.biome.BiomeGenBase[] lexicalValue1791_23_0;
    int lexicalValue1791_25_0;
    int lexicalValue1791_29_0;
    int lexicalValue1791_43_0;
    int lexicalValue1791_43_1;
    int lexicalValue1791_52_0;
    int lexicalValue1791_52_1;
    int lexicalValue1791_63_0;
    net.minecraft.world.biome.BiomeGenBase[] lexicalValue1791_109_0;
    java.lang.String spill1791_0;
    net.minecraft.world.biome.BiomeGenBase[] spill1791_1;
    int spill1791_2;
    int spill1791_3;
    int spill1791_4;
    net.minecraft.world.biome.BiomeGenBase[] spill1791_5;
    long life7_3;
    java.lang.String life9_6;
    net.minecraft.world.biome.BiomeGenBase[] life10_102;
    int[] life10_120;
    int life11_122;
    lexical_join_109: {
    lexical_join_108: {
    lexical_join_80: {
    lexical_join_63: {
    lexical_join_52: {
    lexical_join_43: {
    lexical_join_29: {
    lexical_join_25: {
    lexical_join_24: {
    lexical_join_23: {
    lexical_join_19: {
    life7_3 = (__fieldRead1791_0() ^ 78627410112164L);
    spill1791_0 = __call1791_1();
    __call1791_2();
    life9_6 = spill1791_0;
    spill1791_1 = p0;
    if (!((life9_6 == null))) {
        lexicalValue1791_23_0 = spill1791_1;
        break lexical_join_23;
    }
    if (!((spill1791_1 != null))) {
        break lexical_join_19;
    }
    spill1791_2 = (p0).length;
    if (!((life9_6 == null))) {
        lexicalValue1791_25_0 = spill1791_2;
        break lexical_join_25;
    }
    if (!((spill1791_2 < (p3 * p4)))) {
        break lexical_join_24;
    }
    }
    lexicalValue1791_23_0 = new net.minecraft.world.biome.BiomeGenBase[(p3 * p4)];
    }
    p0 = lexicalValue1791_23_0;
    }
    lexicalValue1791_25_0 = __integerCategory1791_3(p5);
    }
    if (!((life9_6 == null))) {
        lexicalValue1791_29_0 = lexicalValue1791_25_0;
        break lexical_join_29;
    }
    if (!((lexicalValue1791_25_0 != 0))) {
        break lexical_join_80;
    }
    lexicalValue1791_29_0 = p3;
    }
    spill1791_3 = __invokedynamic1791_4(497, (849264190774555514L ^ life7_3));
    if (!((life9_6 == null))) {
        lexicalValue1791_43_0 = lexicalValue1791_29_0;
        lexicalValue1791_43_1 = spill1791_3;
        break lexical_join_43;
    }
    if (!((lexicalValue1791_29_0 == spill1791_3))) {
        break lexical_join_80;
    }
    lexicalValue1791_43_0 = p4;
    lexicalValue1791_43_1 = __invokedynamic1791_5(24431, (7217171387205479909L ^ life7_3));
    }
    if (!((life9_6 == null))) {
        lexicalValue1791_52_0 = lexicalValue1791_43_0;
        lexicalValue1791_52_1 = lexicalValue1791_43_1;
        break lexical_join_52;
    }
    if (!((lexicalValue1791_43_0 == lexicalValue1791_43_1))) {
        break lexical_join_80;
    }
    lexicalValue1791_52_0 = p1;
    lexicalValue1791_52_1 = __invokedynamic1791_6(15443, (471875444925140698L ^ life7_3));
    }
    spill1791_4 = (lexicalValue1791_52_0 & lexicalValue1791_52_1);
    if (!((life9_6 == null))) {
        lexicalValue1791_63_0 = spill1791_4;
        break lexical_join_63;
    }
    if (!((spill1791_4 == 0))) {
        break lexical_join_80;
    }
    lexicalValue1791_63_0 = (p2 & __invokedynamic1791_7(32407, (5684528798594452511L ^ life7_3)));
    }
    if (!((lexicalValue1791_63_0 == 0))) {
        break lexical_join_80;
    }
    life10_102 = __call1791_9(__fieldRead1791_8(receiver), p1, p2);
    __call1791_10(life10_102, 0, p0, 0, (p3 * p4));
    if (!((life9_6 != null))) {
        break lexical_join_108;
    }
    }
    life10_120 = __call1791_12(__fieldRead1791_11(receiver), p1, p2, p3, p4);
    life11_122 = 0;
    lexical_cycle_90: while (true) {
    if (!((life11_122 < (p3 * p4)))) {
        break lexical_join_108;
    }
    spill1791_5 = p0;
    if (!((life9_6 == null))) {
        lexicalValue1791_109_0 = spill1791_5;
        break lexical_join_109;
    }
    (spill1791_5)[life11_122] = __call1791_14((life10_120)[life11_122], __fieldRead1791_13());
    life11_122 += 1;
    if (!((life9_6 != null))) { continue lexical_cycle_90; }
    break lexical_cycle_90;
    }
    }
    lexicalValue1791_109_0 = p0;
    }
    return lexicalValue1791_109_0;
}
public static void h1791_0(moom.Oo p0) throws Throwable {
    throw __call1179100_0(p0);
}
public static void h1791_1(moom.Oo p0) throws Throwable {
    throw __call1179101_0(p0);
}
public static void h1791_2(moom.Oo p0) throws Throwable {
    throw __call1179102_0(p0);
}
public static void h1791_3(moom.Oo p0) throws Throwable {
    throw __call1179103_0(p0);
}
public static void h1791_4(moom.Oo p0) throws Throwable {
    throw __call1179104_0(p0);
}
public static void h1791_5(moom.Oo p0) throws Throwable {
    throw __call1179105_0(p0);
}
public static void h1791_6(moom.Oo p0) throws Throwable {
    throw __call1179106_0(p0);
}
public static void h1791_7(moom.Oo p0) throws Throwable {
    throw __call1179107_0(p0);
}
public static void h1791_8(moom.Oo p0) throws Throwable {
    throw __call1179108_0(p0);
}
public static void h1791_9(moom.Oo p0) throws Throwable {
    throw __call1179109_0(p0);
}
public static void h1791_10(moom.Oo p0) throws Throwable {
    throw __call1179110_0(p0);
}
public static void h1791_11(moom.Oo p0) throws Throwable {
    throw __call1179111_0(p0);
}
private static native long __fieldRead1791_0() throws Throwable;
private static native java.lang.String __call1791_1() throws Throwable;
private static native void __call1791_2() throws Throwable;
private static native int __integerCategory1791_3(boolean value) throws Throwable;
private static native int __invokedynamic1791_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_6(int a0, long a1) throws Throwable;
private static native int __invokedynamic1791_7(int a0, long a1) throws Throwable;
private static native moom.EM __fieldRead1791_8(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase[] __call1791_9(moom.EM a0, int a1, int a2) throws Throwable;
private static native void __call1791_10(net.minecraft.world.biome.BiomeGenBase[] a0, int a1, net.minecraft.world.biome.BiomeGenBase[] a2, int a3, int a4) throws Throwable;
private static native moom.GD __fieldRead1791_11(net.minecraft.world.biome.WorldChunkManager a0) throws Throwable;
private static native int[] __call1791_12(moom.GD a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead1791_13() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1791_14(int a0, net.minecraft.world.biome.BiomeGenBase a1) throws Throwable;
private static native java.lang.Throwable __call1179100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179111_0(moom.Oo a0) throws Throwable;

}


public net.minecraft.world.biome.BiomeGenBase[] b(net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4) {
return ((net.minecraft.world.biome.WorldChunkManager)(this)).a(((net.minecraft.world.biome.BiomeGenBase[])(p0)), ((int)(p1)), ((int)(p2)), ((int)(p3)), ((int)(p4)), ((boolean)(true)));
}


public static void b(java.lang.String p0) {
f = ((java.lang.String)(p0));
    return;
}


public static java.lang.String b() {
return net.minecraft.world.biome.WorldChunkManager.f;
}


public moom.DT a(int p0, int p1, int p2, java.util.List<net.minecraft.world.biome.BiomeGenBase> p3, java.util.Random p4) { return __sourceHandlerCall_d09505c47630a7b912a0(this, p0, p1, p2, p3, p4); }


public void a__Void() {
((moom.EM)(this.c)).a();
    return;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12594_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Ff"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.biome.WorldChunkManager.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30319;
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
            throw new RuntimeException("moom/Ff", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         l[var3] = var15;
      }

      return l[var3];
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public float[] a(float[] p0, int p1, int p2, int p3, int p4) { return __sourceHandlerCall_d5ec037ac7f78cf5f91f(this, p0, p1, p2, p3, p4); }


public net.minecraft.world.biome.BiomeGenBase a(moom.DT p0, net.minecraft.world.biome.BiomeGenBase p1) {
return ((moom.EM)(this.c)).a(((int)(((moom.DT)(p0)).a())), ((int)(((moom.DT)(p0)).c())), ((net.minecraft.world.biome.BiomeGenBase)(p1)));
}


public net.minecraft.world.biome.BiomeGenBase a(moom.DT p0) {
return ((net.minecraft.world.biome.WorldChunkManager)(this)).a(((moom.DT)(p0)), ((net.minecraft.world.biome.BiomeGenBase)(null)));
}


public java.util.List<net.minecraft.world.biome.BiomeGenBase> a() {
return this.d;
}


public boolean a(int p0, int p1, int p2, java.util.List<net.minecraft.world.biome.BiomeGenBase> p3) { return __sourceHandlerCall_e29f5be0ecf83220fc16(this, p0, p1, p2, p3); }


public net.minecraft.world.biome.BiomeGenBase[] a(net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4, boolean p5) { return __sourceHandlerCall_38f3a838cb06f68c351c(this, p0, p1, p2, p3, p4, p5); }


public net.minecraft.world.biome.BiomeGenBase[] a(net.minecraft.world.biome.BiomeGenBase[] p0, int p1, int p2, int p3, int p4) { return __sourceHandlerCall_571de18b2e9169581bb4(this, p0, p1, p2, p3, p4); }


public float a(float p0, int p1) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12594_0() throws E;
}
