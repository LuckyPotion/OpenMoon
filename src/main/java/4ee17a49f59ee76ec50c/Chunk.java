package net.minecraft.world.chunk;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Chunk {

private static org.apache.logging.log4j.Logger a;

private moom.Fs[] b;

private byte[] c;

public int[] d;

private boolean[] e;

private boolean f;

private net.minecraft.world.World g;

private int[] h;

public int i;

public int j;

private boolean k;

private java.util.Map<moom.DT, net.minecraft.tileentity.TileEntity> l;

private net.minecraft.util.ClassInheritanceMultiMap<net.minecraft.entity.Entity>[] m;

private boolean n;

private boolean o;

private boolean p;

private boolean q;

public boolean r;

private long s;

private int t;

private long u;

private int v;

private java.util.concurrent.ConcurrentLinkedQueue<moom.DT> w;

private static java.lang.String x;

private static long y;

private static long[] A;

private static java.lang.Integer[] B;

private static java.util.Map C;

private static long[] E;

private static java.lang.Long[] F;

private static java.util.Map G;

public Chunk(net.minecraft.world.World p0, int p1, int p2) { super(); __sourceHandlerCall_ed092092eb539b5c51c6(this, p0, p1, p2); }


public Chunk(net.minecraft.world.World p0, moom.Fm p1, int p2, int p3) { this((net.minecraft.world.World)null, 0, 0); __sourceHandlerCall_4f8ae1f48a90ef02ad9d(this, p0, p1, p2, p3); }


static {
y = ((long)(((moom._a)(moom._c.a(((long)(-5318582926005288384L)), ((long)(1322627017554056272L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(142642535146134L)))));
    java.lang.Object __sourceSpill1370_6 = null;
    C = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.world.chunk.Chunk.b(((java.lang.String)(__sourceSpill1370_6)));
    long local11_life9 = (net.minecraft.world.chunk.Chunk.y ^ 22729762021126L);
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill1370_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1370_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1370_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1370_16 = new byte[8];
    (__sourceSpill1370_16)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill1370_16)[local14_life17] = ((byte) ((int) ((local11_life9 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation1370_18 = __sourceSpill1370_16;
    ((javax.crypto.Cipher)(__sourceSpill1370_13)).init(((int)(__sourceSpill1370_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1370_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1370_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life21 = new long[18];
    int local16_life22 = 0;
    java.lang.String local17_life23;
    int local18_life25 = ((java.lang.String)((local17_life23 = "6²\023ûjZSÚÚàéjmÝ\016uúÉ©l/ÒÛN¶DÊÅ¿\017f_æ\032;\001Ô}4\037\f§\031°x\ngSt·ñ|'wAÐ\025\037M¾\021/eÝGâ4ø<¢ÓKö8¾á¤K¬\001¯TQ¶4«Ox|wÞ¶®XOª¢é­#¹hêLî¥ÙÀTGõgÞÞ"))).length();
    int local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1370_27 = local17_life23;
        int __sourceSpill1370_28 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill1370_27)).substring(((int)(__sourceSpill1370_28)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1370_32 = local19_life21;
        int __sourceSpill1370_33 = local16_life22;
        local16_life22 += 1;
        long local21_life34 = (((((((((((long) (local20_life31)[0]) & 255L) << 56) | ((((long) (local20_life31)[1]) & 255L) << 48)) | ((((long) (local20_life31)[2]) & 255L) << 40)) | ((((long) (local20_life31)[3]) & 255L) << 32)) | ((((long) (local20_life31)[4]) & 255L) << 24)) | ((((long) (local20_life31)[5]) & 255L) << 16)) | ((((long) (local20_life31)[6]) & 255L) << 8)) | (((long) (local20_life31)[7]) & 255L));
        byte[] __sourceSpill1370_35 = new byte[8];
        (__sourceSpill1370_35)[0] = ((byte) ((int) (local21_life34 >>> 56)));
        (__sourceSpill1370_35)[1] = ((byte) ((int) (local21_life34 >>> 48)));
        (__sourceSpill1370_35)[2] = ((byte) ((int) (local21_life34 >>> 40)));
        (__sourceSpill1370_35)[3] = ((byte) ((int) (local21_life34 >>> 32)));
        (__sourceSpill1370_35)[4] = ((byte) ((int) (local21_life34 >>> 24)));
        (__sourceSpill1370_35)[5] = ((byte) ((int) (local21_life34 >>> 16)));
        (__sourceSpill1370_35)[6] = ((byte) ((int) (local21_life34 >>> 8)));
        (__sourceSpill1370_35)[7] = ((byte) ((int) local21_life34));
        javax.crypto.Cipher __sourceSpill1370_36 = local13_life11;
        byte[] local23_life38 = ((javax.crypto.Cipher)(__sourceSpill1370_36)).doFinal(((byte[])(__sourceSpill1370_35)));
        (__sourceSpill1370_32)[__sourceSpill1370_33] = (((((((((((long) (local23_life38)[0]) & 255L) << 56) | ((((long) (local23_life38)[1]) & 255L) << 48)) | ((((long) (local23_life38)[2]) & 255L) << 40)) | ((((long) (local23_life38)[3]) & 255L) << 32)) | ((((long) (local23_life38)[4]) & 255L) << 24)) | ((((long) (local23_life38)[5]) & 255L) << 16)) | ((((long) (local23_life38)[6]) & 255L) << 8)) | (((long) (local23_life38)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    local18_life25 = ((java.lang.String)((local17_life23 = "\000EXrð.\027T@ÞgM]¹ÃX"))).length();
    local15_life26 = 0;
    do {
        java.lang.String __sourceSpill1370_40 = local17_life23;
        int __sourceSpill1370_41 = local15_life26;
        local15_life26 += 8;
        byte[] local20_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill1370_40)).substring(((int)(__sourceSpill1370_41)), ((int)(local15_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1370_45 = local19_life21;
        int __sourceSpill1370_46 = local16_life22;
        local16_life22 += 1;
        long local21_life47 = (((((((((((long) (local20_life44)[0]) & 255L) << 56) | ((((long) (local20_life44)[1]) & 255L) << 48)) | ((((long) (local20_life44)[2]) & 255L) << 40)) | ((((long) (local20_life44)[3]) & 255L) << 32)) | ((((long) (local20_life44)[4]) & 255L) << 24)) | ((((long) (local20_life44)[5]) & 255L) << 16)) | ((((long) (local20_life44)[6]) & 255L) << 8)) | (((long) (local20_life44)[7]) & 255L));
        byte[] __sourceSpill1370_48 = new byte[8];
        (__sourceSpill1370_48)[0] = ((byte) ((int) (local21_life47 >>> 56)));
        (__sourceSpill1370_48)[1] = ((byte) ((int) (local21_life47 >>> 48)));
        (__sourceSpill1370_48)[2] = ((byte) ((int) (local21_life47 >>> 40)));
        (__sourceSpill1370_48)[3] = ((byte) ((int) (local21_life47 >>> 32)));
        (__sourceSpill1370_48)[4] = ((byte) ((int) (local21_life47 >>> 24)));
        (__sourceSpill1370_48)[5] = ((byte) ((int) (local21_life47 >>> 16)));
        (__sourceSpill1370_48)[6] = ((byte) ((int) (local21_life47 >>> 8)));
        (__sourceSpill1370_48)[7] = ((byte) ((int) local21_life47));
        javax.crypto.Cipher __sourceSpill1370_49 = local13_life11;
        byte[] local23_life51 = ((javax.crypto.Cipher)(__sourceSpill1370_49)).doFinal(((byte[])(__sourceSpill1370_48)));
        (__sourceSpill1370_45)[__sourceSpill1370_46] = (((((((((((long) (local23_life51)[0]) & 255L) << 56) | ((((long) (local23_life51)[1]) & 255L) << 48)) | ((((long) (local23_life51)[2]) & 255L) << 40)) | ((((long) (local23_life51)[3]) & 255L) << 32)) | ((((long) (local23_life51)[4]) & 255L) << 24)) | ((((long) (local23_life51)[5]) & 255L) << 16)) | ((((long) (local23_life51)[6]) & 255L) << 8)) | (((long) (local23_life51)[7]) & 255L));
    } while ((!(local15_life26 >= local18_life25)));
    A = ((long[])(local19_life21));
    B = ((java.lang.Integer[])(new java.lang.Integer[18]));
    G = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life56;
    javax.crypto.Cipher __sourceSpill1370_58 = (local0_life56 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1370_59 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1370_60 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1370_61 = new byte[8];
    (__sourceSpill1370_61)[0] = ((byte) ((int) (local11_life9 >>> 56)));
    int local1_life62 = 1;
    while ((local1_life62 < 8)) {
        (__sourceSpill1370_61)[local1_life62] = ((byte) ((int) ((local11_life9 << (local1_life62 * 8)) >>> 56)));
        local1_life62 += 1;
    }
    byte[] __sourcePreallocation1370_63 = __sourceSpill1370_61;
    ((javax.crypto.Cipher)(__sourceSpill1370_58)).init(((int)(__sourceSpill1370_59)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1370_60)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1370_63)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life66 = new long[5];
    int local3_life67 = 0;
    java.lang.String local4_life68;
    int local5_life70 = ((java.lang.String)((local4_life68 = "½\004p»Qot<NíVjrÈát=±\020ÏÐ'ñ"))).length();
    int local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1370_72 = local4_life68;
        int __sourceSpill1370_73 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life76 = ((java.lang.String)(((java.lang.String)(__sourceSpill1370_72)).substring(((int)(__sourceSpill1370_73)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1370_77 = local6_life66;
        int __sourceSpill1370_78 = local3_life67;
        local3_life67 += 1;
        long local8_life79 = (((((((((((long) (local7_life76)[0]) & 255L) << 56) | ((((long) (local7_life76)[1]) & 255L) << 48)) | ((((long) (local7_life76)[2]) & 255L) << 40)) | ((((long) (local7_life76)[3]) & 255L) << 32)) | ((((long) (local7_life76)[4]) & 255L) << 24)) | ((((long) (local7_life76)[5]) & 255L) << 16)) | ((((long) (local7_life76)[6]) & 255L) << 8)) | (((long) (local7_life76)[7]) & 255L));
        byte[] __sourceSpill1370_80 = new byte[8];
        (__sourceSpill1370_80)[0] = ((byte) ((int) (local8_life79 >>> 56)));
        (__sourceSpill1370_80)[1] = ((byte) ((int) (local8_life79 >>> 48)));
        (__sourceSpill1370_80)[2] = ((byte) ((int) (local8_life79 >>> 40)));
        (__sourceSpill1370_80)[3] = ((byte) ((int) (local8_life79 >>> 32)));
        (__sourceSpill1370_80)[4] = ((byte) ((int) (local8_life79 >>> 24)));
        (__sourceSpill1370_80)[5] = ((byte) ((int) (local8_life79 >>> 16)));
        (__sourceSpill1370_80)[6] = ((byte) ((int) (local8_life79 >>> 8)));
        (__sourceSpill1370_80)[7] = ((byte) ((int) local8_life79));
        javax.crypto.Cipher __sourceSpill1370_81 = local0_life56;
        byte[] local10_life83 = ((javax.crypto.Cipher)(__sourceSpill1370_81)).doFinal(((byte[])(__sourceSpill1370_80)));
        (__sourceSpill1370_77)[__sourceSpill1370_78] = (((((((((((long) (local10_life83)[0]) & 255L) << 56) | ((((long) (local10_life83)[1]) & 255L) << 48)) | ((((long) (local10_life83)[2]) & 255L) << 40)) | ((((long) (local10_life83)[3]) & 255L) << 32)) | ((((long) (local10_life83)[4]) & 255L) << 24)) | ((((long) (local10_life83)[5]) & 255L) << 16)) | ((((long) (local10_life83)[6]) & 255L) << 8)) | (((long) (local10_life83)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    local5_life70 = ((java.lang.String)((local4_life68 = "\007ºzñQ¼¼ .Æ\b{"))).length();
    local2_life71 = 0;
    do {
        java.lang.String __sourceSpill1370_85 = local4_life68;
        int __sourceSpill1370_86 = local2_life71;
        local2_life71 += 8;
        byte[] local7_life89 = ((java.lang.String)(((java.lang.String)(__sourceSpill1370_85)).substring(((int)(__sourceSpill1370_86)), ((int)(local2_life71))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1370_90 = local6_life66;
        int __sourceSpill1370_91 = local3_life67;
        local3_life67 += 1;
        long local8_life92 = (((((((((((long) (local7_life89)[0]) & 255L) << 56) | ((((long) (local7_life89)[1]) & 255L) << 48)) | ((((long) (local7_life89)[2]) & 255L) << 40)) | ((((long) (local7_life89)[3]) & 255L) << 32)) | ((((long) (local7_life89)[4]) & 255L) << 24)) | ((((long) (local7_life89)[5]) & 255L) << 16)) | ((((long) (local7_life89)[6]) & 255L) << 8)) | (((long) (local7_life89)[7]) & 255L));
        byte[] __sourceSpill1370_93 = new byte[8];
        (__sourceSpill1370_93)[0] = ((byte) ((int) (local8_life92 >>> 56)));
        (__sourceSpill1370_93)[1] = ((byte) ((int) (local8_life92 >>> 48)));
        (__sourceSpill1370_93)[2] = ((byte) ((int) (local8_life92 >>> 40)));
        (__sourceSpill1370_93)[3] = ((byte) ((int) (local8_life92 >>> 32)));
        (__sourceSpill1370_93)[4] = ((byte) ((int) (local8_life92 >>> 24)));
        (__sourceSpill1370_93)[5] = ((byte) ((int) (local8_life92 >>> 16)));
        (__sourceSpill1370_93)[6] = ((byte) ((int) (local8_life92 >>> 8)));
        (__sourceSpill1370_93)[7] = ((byte) ((int) local8_life92));
        javax.crypto.Cipher __sourceSpill1370_94 = local0_life56;
        byte[] local10_life96 = ((javax.crypto.Cipher)(__sourceSpill1370_94)).doFinal(((byte[])(__sourceSpill1370_93)));
        (__sourceSpill1370_90)[__sourceSpill1370_91] = (((((((((((long) (local10_life96)[0]) & 255L) << 56) | ((((long) (local10_life96)[1]) & 255L) << 48)) | ((((long) (local10_life96)[2]) & 255L) << 40)) | ((((long) (local10_life96)[3]) & 255L) << 32)) | ((((long) (local10_life96)[4]) & 255L) << 24)) | ((((long) (local10_life96)[5]) & 255L) << 16)) | ((((long) (local10_life96)[6]) & 255L) << 8)) | (((long) (local10_life96)[7]) & 255L));
    } while ((!(local2_life71 >= local5_life70)));
    E = ((long[])(local6_life66));
    F = ((java.lang.Long[])(new java.lang.Long[5]));
    a = ((org.apache.logging.log4j.Logger)(org.apache.logging.log4j.LogManager.getLogger()));
}

private static native <E extends Throwable> void __sourceHandlerCall_ed092092eb539b5c51c6(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.World a1, int a2, int a3) throws E;
private static final class __SourceHandler_ed092092eb539b5c51c6 {

public static void f579(net.minecraft.world.chunk.Chunk receiver, net.minecraft.world.World p0, int p1, int p2) throws Throwable {
    java.lang.String spill579_0;
    long life4_3;
    java.lang.String life6_52;
    int life7_79;
    forest_join_114: {
    forest_join_110: {
    forest_join_98: {
    life4_3 = (__fieldRead579_0() ^ 95739765713052L);
    __directSuperInit579_1(receiver);
    __fieldWrite579_3(receiver, new moom.Fs[__invokedynamic579_2(765, (3484944761558810204L ^ life4_3))]);
    __fieldWrite579_5(receiver, new byte[__invokedynamic579_4(5972, (7001624718751443965L ^ life4_3))]);
    __fieldWrite579_7(receiver, new int[__invokedynamic579_6(5972, (7001624718751443965L ^ life4_3))]);
    __fieldWrite579_9(receiver, new boolean[__invokedynamic579_8(5972, (7001624718751443965L ^ life4_3))]);
    spill579_0 = __call579_10();
    __fieldWrite579_12(receiver, __call579_11());
    __fieldWrite579_14(receiver, __invokedynamic579_13(9165, (4283882402651742049L ^ life4_3)));
    __fieldWrite579_16(receiver, __call579_15());
    life6_52 = spill579_0;
    __fieldWrite579_18(receiver, new net.minecraft.util.ClassInheritanceMultiMap[__invokedynamic579_17(9267, (2224678158124718213L ^ life4_3))]);
    __fieldWrite579_19(receiver, p0);
    __fieldWrite579_20(receiver, p1);
    __fieldWrite579_21(receiver, p2);
    __fieldWrite579_23(receiver, new int[__invokedynamic579_22(5972, (7001624718751443965L ^ life4_3))]);
    life7_79 = 0;
    forest_cycle_80: while (true) {
    if (!((life7_79 < (__fieldRead579_24(receiver)).length))) {
        break forest_join_98;
    }
    (__fieldRead579_25(receiver))[life7_79] = new net.minecraft.util.ClassInheritanceMultiMap(__classLiteral579_26());
    life7_79 += 1;
    if (!((life6_52 == null))) {
        break forest_join_110;
    }
    if (!((life6_52 != null))) {
        continue forest_cycle_80;
    }
    break forest_cycle_80;
    }
    }
    __call579_29(__fieldRead579_27(receiver), __invokedynamic579_28(690, (8263186876143648280L ^ life4_3)));
    __call579_31(__fieldRead579_30(receiver), -1);
    }
    if (!((__call579_32() != null))) {
        break forest_join_114;
    }
    __call579_33("Fo1CWc");
    }
    return;
}
public static void h579_0(moom.Oo p0) throws Throwable {
    throw __call3057900_0(p0);
}
public static void h579_1(moom.Oo p0) throws Throwable {
    throw __call3057901_0(p0);
}
private static native long __fieldRead579_0() throws Throwable;
private static native void __directSuperInit579_1(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic579_2(int a0, long a1) throws Throwable;
private static native void __fieldWrite579_3(net.minecraft.world.chunk.Chunk a0, moom.Fs[] a1) throws Throwable;
private static native int __invokedynamic579_4(int a0, long a1) throws Throwable;
private static native void __fieldWrite579_5(net.minecraft.world.chunk.Chunk a0, byte[] a1) throws Throwable;
private static native int __invokedynamic579_6(int a0, long a1) throws Throwable;
private static native void __fieldWrite579_7(net.minecraft.world.chunk.Chunk a0, int[] a1) throws Throwable;
private static native int __invokedynamic579_8(int a0, long a1) throws Throwable;
private static native void __fieldWrite579_9(net.minecraft.world.chunk.Chunk a0, boolean[] a1) throws Throwable;
private static native java.lang.String __call579_10() throws Throwable;
private static native java.util.HashMap __call579_11() throws Throwable;
private static native void __fieldWrite579_12(net.minecraft.world.chunk.Chunk a0, java.util.HashMap a1) throws Throwable;
private static native int __invokedynamic579_13(int a0, long a1) throws Throwable;
private static native void __fieldWrite579_14(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.util.concurrent.ConcurrentLinkedQueue __call579_15() throws Throwable;
private static native void __fieldWrite579_16(net.minecraft.world.chunk.Chunk a0, java.util.concurrent.ConcurrentLinkedQueue a1) throws Throwable;
private static native int __invokedynamic579_17(int a0, long a1) throws Throwable;
private static native void __fieldWrite579_18(net.minecraft.world.chunk.Chunk a0, net.minecraft.util.ClassInheritanceMultiMap[] a1) throws Throwable;
private static native void __fieldWrite579_19(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.World a1) throws Throwable;
private static native void __fieldWrite579_20(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native void __fieldWrite579_21(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native int __invokedynamic579_22(int a0, long a1) throws Throwable;
private static native void __fieldWrite579_23(net.minecraft.world.chunk.Chunk a0, int[] a1) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead579_24(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead579_25(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Class __classLiteral579_26() throws Throwable;
private static native int[] __fieldRead579_27(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic579_28(int a0, long a1) throws Throwable;
private static native void __call579_29(int[] a0, int a1) throws Throwable;
private static native byte[] __fieldRead579_30(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call579_31(byte[] a0, int a1) throws Throwable;
private static native java.lang.String[] __call579_32() throws Throwable;
private static native void __call579_33(java.lang.String a0) throws Throwable;
private static native java.lang.Throwable __call3057900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3057901_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4f8ae1f48a90ef02ad9d(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.World a1, moom.Fm a2, int a3, int a4) throws E;
private static final class __SourceHandler_4f8ae1f48a90ef02ad9d {

public static void f580(net.minecraft.world.chunk.Chunk receiver, net.minecraft.world.World p0, moom.Fm p1, int p2, int p3) throws Throwable {
    int forestValue580_24_0;
    int forestValue580_26_0;
    int forestValue580_30_0;
    moom.Fs forestValue580_107_0;
    java.lang.String spill580_0;
    boolean spill580_1;
    int spill580_2;
    moom.Fs spill580_3;
    long life5_3;
    java.lang.String life7_10;
    int life8_16;
    int life9_27;
    int life10_29;
    int life11_38;
    int life12_49;
    int life13_68;
    net.minecraft.block.state.IBlockState life14_72;
    int life15_87;
    forest_join_127: {
    forest_join_26: {
    forest_join_25: {
    forest_join_24: {
    life5_3 = (__fieldRead580_0() ^ 51829198579811L);
    spill580_0 = __call580_1();
    __directThisInit580_2(receiver, p0, p2, p3);
    life7_10 = spill580_0;
    life8_16 = __invokedynamic580_3(5972, (7001615990400723714L ^ life5_3));
    spill580_1 = __call580_5(__fieldRead580_4(p0));
    if (!((life7_10 == null))) {
        forestValue580_24_0 = __integerCategory580_6(spill580_1);
        break forest_join_24;
    }
    if (!((!spill580_1))) {
        break forest_join_25;
    }
    forestValue580_24_0 = 1;
    }
    forestValue580_26_0 = forestValue580_24_0;
    break forest_join_26;
    }
    forestValue580_26_0 = 0;
    }
    life9_27 = forestValue580_26_0;
    life10_29 = 0;
    forest_cycle_29: while (true) {
    forest_join_124: {
    forestValue580_30_0 = life10_29;
    forest_cycle_30: while (true) {
    if (!((forestValue580_30_0 < __invokedynamic580_7(9267, (2224739523380222074L ^ life5_3))))) {
        break forest_join_127;
    }
    life11_38 = 0;
    forest_cycle_38: while (true) {
    forest_join_122: {
    forest_join_121: {
    if (!((life11_38 < __invokedynamic580_8(9267, (2224739523380222074L ^ life5_3))))) {
        break forest_join_124;
    }
    spill580_2 = 0;
    if (!((life7_10 == null))) {
        forestValue580_30_0 = spill580_2;
        continue forest_cycle_30;
    }
    life12_49 = spill580_2;
    forest_cycle_49: while (true) {
    forest_join_119: {
    forest_join_118: {
    forest_join_107: {
    forest_join_103: {
    if (!((life12_49 < life8_16))) {
        break forest_join_121;
    }
    life13_68 = ((((life10_29 * life8_16) * __invokedynamic580_9(9267, (2224739523380222074L ^ life5_3))) | (life11_38 * life8_16)) | life12_49);
    life14_72 = __call580_10(p1, life13_68);
    if (!((life7_10 == null))) {
        break forest_join_122;
    }
    if (!((life7_10 == null))) {
        break forest_join_119;
    }
    if (!((__call580_12(__call580_11(life14_72)) != __fieldRead580_13()))) {
        break forest_join_118;
    }
    life15_87 = (life12_49 >> 4);
    spill580_3 = (__fieldRead580_14(receiver))[life15_87];
    if (!((life7_10 == null))) {
        forestValue580_107_0 = spill580_3;
        break forest_join_107;
    }
    if (!((spill580_3 == null))) {
        break forest_join_103;
    }
    (__fieldRead580_15(receiver))[life15_87] = new moom.Fs((life15_87 << 4), __integerCategory580_16(life9_27));
    }
    forestValue580_107_0 = (__fieldRead580_17(receiver))[life15_87];
    }
    __call580_19(forestValue580_107_0, life10_29, (life12_49 & __invokedynamic580_18(5269, (2548047022673897673L ^ life5_3))), life11_38, life14_72);
    }
    life12_49 += 1;
    }
    if (!((life7_10 != null))) {
        continue forest_cycle_49;
    }
    break forest_cycle_49;
    }
    }
    life11_38 += 1;
    }
    if (!((life7_10 != null))) {
        continue forest_cycle_38;
    }
    break forest_cycle_38;
    }
    break forest_cycle_30;
    }
    }
    life10_29 += 1;
    if (!((life7_10 != null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    }
    return;
}
public static void h580_0(moom.Oo p0) throws Throwable {
    throw __call3058000_0(p0);
}
public static void h580_1(moom.Oo p0) throws Throwable {
    throw __call3058001_0(p0);
}
public static void h580_2(moom.Oo p0) throws Throwable {
    throw __call3058002_0(p0);
}
public static void h580_3(moom.Oo p0) throws Throwable {
    throw __call3058003_0(p0);
}
public static void h580_4(moom.Oo p0) throws Throwable {
    throw __call3058004_0(p0);
}
private static native long __fieldRead580_0() throws Throwable;
private static native java.lang.String __call580_1() throws Throwable;
private static native void __directThisInit580_2(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.World a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic580_3(int a0, long a1) throws Throwable;
private static native moom.EA __fieldRead580_4(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call580_5(moom.EA a0) throws Throwable;
private static native int __integerCategory580_6(boolean value) throws Throwable;
private static native int __invokedynamic580_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic580_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic580_9(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call580_10(moom.Fm a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __call580_11(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.fn __call580_12(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead580_13() throws Throwable;
private static native moom.Fs[] __fieldRead580_14(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead580_15(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __integerCategory580_16(int value) throws Throwable;
private static native moom.Fs[] __fieldRead580_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic580_18(int a0, long a1) throws Throwable;
private static native void __call580_19(moom.Fs a0, int a1, int a2, int a3, net.minecraft.block.state.IBlockState a4) throws Throwable;
private static native java.lang.Throwable __call3058000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058002_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058003_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3058004_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_60ce0a295f9edfcba0d2(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_60ce0a295f9edfcba0d2 {

public static int f1792(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    moom.Fs lexicalValue1792_25_0;
    java.lang.String spill1792_0;
    moom.Fs spill1792_1;
    long life1_3;
    int life4_10;
    java.lang.String life3_11;
    lexical_join_30: {
    life1_3 = (__fieldRead1792_0() ^ 127450709184904L);
    spill1792_0 = __call1792_1();
    life4_10 = ((__fieldRead1792_2(receiver)).length - 1);
    life3_11 = spill1792_0;
    lexical_cycle_12: while (true) {
    lexical_join_27: {
    lexical_join_25: {
    if (!((life4_10 >= 0))) {
        break lexical_join_30;
    }
    spill1792_1 = (__fieldRead1792_3(receiver))[life4_10];
    if (!((life3_11 == null))) {
        lexicalValue1792_25_0 = spill1792_1;
        break lexical_join_25;
    }
    if (!((spill1792_1 != null))) {
        break lexical_join_27;
    }
    lexicalValue1792_25_0 = (__fieldRead1792_4(receiver))[life4_10];
    }
    return __call1792_5(lexicalValue1792_25_0);
    }
    life4_10 += -1;
    if (!((life3_11 != null))) { continue lexical_cycle_12; }
    break lexical_cycle_12;
    }
    }
    return 0;
}
public static void h1792_0(moom.Oo p0) throws Throwable {
    throw __call1179200_0(p0);
}
public static void h1792_1(moom.Oo p0) throws Throwable {
    throw __call1179201_0(p0);
}
private static native long __fieldRead1792_0() throws Throwable;
private static native java.lang.String __call1792_1() throws Throwable;
private static native moom.Fs[] __fieldRead1792_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead1792_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead1792_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1792_5(moom.Fs a0) throws Throwable;
private static native java.lang.Throwable __call1179200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_e3d04987767b8a1258d6(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3, int a4) throws E;
private static final class __SourceHandler_e3d04987767b8a1258d6 {

public static void f1793(net.minecraft.world.chunk.Chunk receiver, int p0, int p1, int p2, int p3) throws Throwable {
    int lexicalValue1793_25_0;
    int lexicalValue1793_29_0;
    int spill1793_0;
    long life5_3;
    java.lang.String life7_5;
    int life8_38;
    lexical_join_52: {
    lexical_join_49: {
    lexical_join_29: {
    lexical_join_25: {
    life5_3 = (__fieldRead1793_0() ^ 112752079073079L);
    life7_5 = __call1793_1();
    spill1793_0 = p3;
    if (!((life7_5 == null))) {
        lexicalValue1793_25_0 = spill1793_0;
        break lexical_join_25;
    }
    if (!((spill1793_0 > p2))) {
        break lexical_join_52;
    }
    lexicalValue1793_25_0 = __integerCategory1793_5(__call1793_4(__fieldRead1793_2(receiver), new moom.DT(p0, 0, p1), __invokedynamic1793_3(9267, (2224660982636945198L ^ life5_3))));
    }
    if (!((life7_5 == null))) {
        lexicalValue1793_29_0 = lexicalValue1793_25_0;
        break lexical_join_29;
    }
    if (!((lexicalValue1793_25_0 != 0))) {
        break lexical_join_52;
    }
    lexicalValue1793_29_0 = p2;
    }
    life8_38 = lexicalValue1793_29_0;
    lexical_cycle_30: while (true) {
    if (!((life8_38 < p3))) {
        break lexical_join_49;
    }
    __call1793_8(__fieldRead1793_6(receiver), __fieldRead1793_7(), new moom.DT(p0, life8_38, p1));
    life8_38 += 1;
    if (!((life7_5 == null))) {
        break lexical_join_52;
    }
    if (!((life7_5 != null))) { continue lexical_cycle_30; }
    break lexical_cycle_30;
    }
    }
    __fieldWrite1793_9(receiver, 1);
    }
    return;
}
public static void h1793_0(moom.Oo p0) throws Throwable {
    throw __call1179300_0(p0);
}
public static void h1793_1(moom.Oo p0) throws Throwable {
    throw __call1179301_0(p0);
}
public static void h1793_2(moom.Oo p0) throws Throwable {
    throw __call1179302_0(p0);
}
public static void h1793_3(moom.Oo p0) throws Throwable {
    throw __call1179303_0(p0);
}
private static native long __fieldRead1793_0() throws Throwable;
private static native java.lang.String __call1793_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1793_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1793_3(int a0, long a1) throws Throwable;
private static native boolean __call1793_4(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native int __integerCategory1793_5(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1793_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1793_7() throws Throwable;
private static native boolean __call1793_8(net.minecraft.world.World a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native void __fieldWrite1793_9(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1179300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179303_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_12086451a11a601c8541(net.minecraft.world.chunk.Chunk a0, java.lang.Class a1, moom.CA a2, java.util.List a3, com.google.common.base.Predicate a4) throws E;
private static final class __SourceHandler_12086451a11a601c8541 {

public static void f1171(net.minecraft.world.chunk.Chunk receiver, java.lang.Class p0, moom.CA p1, java.util.List p2, com.google.common.base.Predicate p3) throws Throwable {
    int forestValue1171_43_0;
    com.google.common.base.Predicate forestValue1171_72_0;
    int forestValue1171_80_0;
    java.lang.String spill1171_0;
    boolean spill1171_1;
    com.google.common.base.Predicate spill1171_2;
    boolean spill1171_3;
    long life5_3;
    int life8_12;
    int life9_20;
    java.lang.String life7_21;
    int life8_30;
    int life9_39;
    int life10_41;
    java.util.Iterator life11_52;
    net.minecraft.entity.Entity life12_59;
    forest_join_86: {
    life5_3 = (__fieldRead1171_0() ^ 10332669650270L);
    spill1171_0 = __call1171_1();
    life8_12 = __call1171_3(((__fieldRead1171_2(p1) - 0x1.0p1d) / 0x1.0p4d));
    life9_20 = __call1171_5(((__fieldRead1171_4(p1) + 0x1.0p1d) / 0x1.0p4d));
    life7_21 = spill1171_0;
    life8_30 = __call1171_7(life8_12, 0, ((__fieldRead1171_6(receiver)).length - 1));
    life9_39 = __call1171_9(life9_20, 0, ((__fieldRead1171_8(receiver)).length - 1));
    life10_41 = life8_30;
    forest_cycle_42: while (true) {
    forest_join_83: {
    forestValue1171_43_0 = life10_41;
    forest_cycle_43: while (true) {
    if (!((forestValue1171_43_0 <= life9_39))) {
        break forest_join_86;
    }
    life11_52 = __call1171_12(__call1171_11((__fieldRead1171_10(receiver))[life10_41], p0));
    forest_cycle_53: while (true) {
    forest_join_81: {
    forest_join_80: {
    forest_join_77: {
    forest_join_72: {
    if (!(__call1171_13(life11_52))) {
        break forest_join_83;
    }
    life12_59 = __cast1171_15(__call1171_14(life11_52));
    spill1171_1 = __call1171_17(__call1171_16(life12_59), p1);
    if (!((life7_21 == null))) {
        forestValue1171_43_0 = __integerCategory1171_18(spill1171_1);
        continue forest_cycle_43;
    }
    if (!(spill1171_1)) {
        break forest_join_81;
    }
    spill1171_2 = p3;
    if (!((life7_21 == null))) {
        forestValue1171_72_0 = spill1171_2;
        break forest_join_72;
    }
    if (!((spill1171_2 != null))) {
        break forest_join_77;
    }
    forestValue1171_72_0 = p3;
    }
    spill1171_3 = __call1171_19(forestValue1171_72_0, life12_59);
    if (!((life7_21 == null))) {
        forestValue1171_80_0 = __integerCategory1171_20(spill1171_3);
        break forest_join_80;
    }
    if (!(spill1171_3)) {
        break forest_join_81;
    }
    }
    forestValue1171_80_0 = __integerCategory1171_22(__call1171_21(p2, life12_59));
    }
    __discardScalar1171_23(forestValue1171_80_0);
    }
    if (!((life7_21 != null))) {
        continue forest_cycle_53;
    }
    break forest_cycle_53;
    }
    break forest_cycle_43;
    }
    }
    life10_41 += 1;
    if (!((life7_21 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    }
    return;
}
public static void h1171_0(moom.Oo p0) throws Throwable {
    throw __call3117100_0(p0);
}
public static void h1171_1(moom.Oo p0) throws Throwable {
    throw __call3117101_0(p0);
}
public static void h1171_2(moom.Oo p0) throws Throwable {
    throw __call3117102_0(p0);
}
public static void h1171_3(moom.Oo p0) throws Throwable {
    throw __call3117103_0(p0);
}
private static native long __fieldRead1171_0() throws Throwable;
private static native java.lang.String __call1171_1() throws Throwable;
private static native double __fieldRead1171_2(moom.CA a0) throws Throwable;
private static native int __call1171_3(double a0) throws Throwable;
private static native double __fieldRead1171_4(moom.CA a0) throws Throwable;
private static native int __call1171_5(double a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1171_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1171_7(int a0, int a1, int a2) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1171_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1171_9(int a0, int a1, int a2) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1171_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Iterable __call1171_11(net.minecraft.util.ClassInheritanceMultiMap a0, java.lang.Class a1) throws Throwable;
private static native java.util.Iterator __call1171_12(java.lang.Iterable a0) throws Throwable;
private static native boolean __call1171_13(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1171_14(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1171_15(java.lang.Object a0) throws Throwable;
private static native moom.CA __call1171_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1171_17(moom.CA a0, moom.CA a1) throws Throwable;
private static native int __integerCategory1171_18(boolean value) throws Throwable;
private static native boolean __call1171_19(com.google.common.base.Predicate a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1171_20(boolean value) throws Throwable;
private static native boolean __call1171_21(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1171_22(boolean value) throws Throwable;
private static native void __discardScalar1171_23(int a0) throws Throwable;
private static native java.lang.Throwable __call3117100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117103_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_e1773f849446d63e77ee(net.minecraft.world.chunk.Chunk a0, moom.DT a1, int a2) throws E;
private static final class __SourceHandler_e1773f849446d63e77ee {

public static int f1795(net.minecraft.world.chunk.Chunk receiver, moom.DT p0, int p1) throws Throwable {
    int forwardValue1795_44_0;
    int forwardValue1795_52_0;
    int forwardValue1795_52_1;
    int forwardValue1795_55_0;
    int forwardValue1795_64_0;
    int forwardValue1795_76_0;
    int forwardValue1795_101_0;
    java.lang.String spill1795_0;
    boolean spill1795_1;
    int spill1795_2;
    boolean spill1795_3;
    int spill1795_4;
    long life3_3;
    int life6_13;
    int life7_16;
    java.lang.String life5_17;
    int life8_26;
    moom.Fs life9_33;
    int life10_91;
    int life10_95;
    int life11_107;
    forward_join_101: {
    forward_join_100: {
    forward_join_76: {
    forward_join_65: {
    forward_join_64: {
    forward_join_56: {
    forward_join_55: {
    forward_join_54: {
    forward_join_52: {
    forward_join_44: {
    life3_3 = (__fieldRead1795_0() ^ 3961063436041L);
    spill1795_0 = __call1795_1();
    life6_13 = (__call1795_2(p0) & __invokedynamic1795_3(5269, (2548008235274022819L ^ life3_3)));
    life7_16 = __call1795_4(p0);
    life5_17 = spill1795_0;
    life8_26 = (__call1795_5(p0) & __invokedynamic1795_6(5269, (2548008235274022819L ^ life3_3)));
    life9_33 = (__fieldRead1795_7(receiver))[(life7_16 >> 4)];
    if (!((life9_33 == null))) {
        break forward_join_56;
    }
    spill1795_1 = __call1795_10(__fieldRead1795_9(__fieldRead1795_8(receiver)));
    if (!((life5_17 == null))) {
        forwardValue1795_44_0 = __integerCategory1795_11(spill1795_1);
        break forward_join_44;
    }
    if (!((!spill1795_1))) {
        break forward_join_54;
    }
    forwardValue1795_44_0 = p1;
    }
    spill1795_2 = __fieldRead1795_13(__fieldRead1795_12());
    if (!((life5_17 == null))) {
        forwardValue1795_52_0 = forwardValue1795_44_0;
        forwardValue1795_52_1 = spill1795_2;
        break forward_join_52;
    }
    if (!((forwardValue1795_44_0 < spill1795_2))) {
        break forward_join_54;
    }
    forwardValue1795_52_0 = __fieldRead1795_15(__fieldRead1795_14());
    forwardValue1795_52_1 = p1;
    }
    forwardValue1795_55_0 = (forwardValue1795_52_0 - forwardValue1795_52_1);
    break forward_join_55;
    }
    forwardValue1795_55_0 = 0;
    }
    return forwardValue1795_55_0;
    }
    spill1795_3 = __call1795_18(__fieldRead1795_17(__fieldRead1795_16(receiver)));
    if (!((life5_17 == null))) {
        forwardValue1795_64_0 = __integerCategory1795_19(spill1795_3);
        break forward_join_64;
    }
    if (!(spill1795_3)) {
        break forward_join_65;
    }
    forwardValue1795_64_0 = 0;
    }
    forwardValue1795_76_0 = forwardValue1795_64_0;
    break forward_join_76;
    }
    forwardValue1795_76_0 = __call1795_21(life9_33, life6_13, (life7_16 & __invokedynamic1795_20(5269, (2548008235274022819L ^ life3_3))), life8_26);
    }
    life10_91 = forwardValue1795_76_0;
    life10_95 = (life10_91 - p1);
    life11_107 = __call1795_23(life9_33, life6_13, (life7_16 & __invokedynamic1795_22(5269, (2548008235274022819L ^ life3_3))), life8_26);
    spill1795_4 = life11_107;
    if (!((life5_17 == null))) {
        forwardValue1795_101_0 = spill1795_4;
        break forward_join_101;
    }
    if (!((spill1795_4 > life10_95))) {
        break forward_join_100;
    }
    life10_95 = life11_107;
    }
    forwardValue1795_101_0 = life10_95;
    }
    return forwardValue1795_101_0;
}
public static void h1795_0(moom.Oo p0) throws Throwable {
    throw __call1179500_0(p0);
}
public static void h1795_1(moom.Oo p0) throws Throwable {
    throw __call1179501_0(p0);
}
public static void h1795_2(moom.Oo p0) throws Throwable {
    throw __call1179502_0(p0);
}
public static void h1795_3(moom.Oo p0) throws Throwable {
    throw __call1179503_0(p0);
}
public static void h1795_4(moom.Oo p0) throws Throwable {
    throw __call1179504_0(p0);
}
public static void h1795_5(moom.Oo p0) throws Throwable {
    throw __call1179505_0(p0);
}
private static native long __fieldRead1795_0() throws Throwable;
private static native java.lang.String __call1795_1() throws Throwable;
private static native int __call1795_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic1795_3(int a0, long a1) throws Throwable;
private static native int __call1795_4(moom.DT a0) throws Throwable;
private static native int __call1795_5(moom.DT a0) throws Throwable;
private static native int __invokedynamic1795_6(int a0, long a1) throws Throwable;
private static native moom.Fs[] __fieldRead1795_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1795_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1795_9(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1795_10(moom.EA a0) throws Throwable;
private static native int __integerCategory1795_11(boolean value) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1795_12() throws Throwable;
private static native int __fieldRead1795_13(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1795_14() throws Throwable;
private static native int __fieldRead1795_15(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1795_16(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1795_17(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1795_18(moom.EA a0) throws Throwable;
private static native int __integerCategory1795_19(boolean value) throws Throwable;
private static native int __invokedynamic1795_20(int a0, long a1) throws Throwable;
private static native int __call1795_21(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1795_22(int a0, long a1) throws Throwable;
private static native int __call1795_23(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1179500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179505_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.block.state.IBlockState __sourceHandlerCall_93f428fdc04fb10edfad(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.block.state.IBlockState a2) throws E;
private static final class __SourceHandler_93f428fdc04fb10edfad {

public static net.minecraft.block.state.IBlockState f300139(net.minecraft.world.chunk.Chunk receiver, moom.DT p0, net.minecraft.block.state.IBlockState p1) throws Throwable {
    int forestValue300139_56_0;
    net.minecraft.block.state.IBlockState forestValue300139_69_0;
    moom.Fs[] forestValue300139_111_0;
    int forestValue300139_111_1;
    moom.Fs forestValue300139_111_2;
    moom.Fs forestValue300139_111_3;
    int forestValue300139_111_4;
    moom.Fs[] forestValue300139_112_0;
    int forestValue300139_112_1;
    moom.Fs forestValue300139_112_2;
    moom.Fs forestValue300139_112_3;
    int forestValue300139_112_4;
    int forestValue300139_112_5;
    int forestValue300139_122_0;
    int forestValue300139_124_0;
    moom.Fs forestValue300139_126_0;
    int forestValue300139_160_0;
    net.minecraft.block.Block forestValue300139_176_0;
    net.minecraft.block.Block forestValue300139_177_0;
    net.minecraft.block.Block forestValue300139_177_1;
    int forestValue300139_190_0;
    int forestValue300139_213_0;
    int forestValue300139_228_0;
    int forestValue300139_228_1;
    int forestValue300139_240_0;
    net.minecraft.world.chunk.Chunk forestValue300139_249_0;
    int forestValue300139_254_0;
    net.minecraft.world.chunk.Chunk forestValue300139_269_0;
    int forestValue300139_271_0;
    net.minecraft.block.Block forestValue300139_286_0;
    int forestValue300139_287_0;
    net.minecraft.tileentity.TileEntity forestValue300139_312_0;
    net.minecraft.tileentity.TileEntity forestValue300139_316_0;
    java.lang.String spill300139_0;
    int spill300139_1;
    net.minecraft.block.state.IBlockState spill300139_2;
    moom.Fs spill300139_3;
    moom.Fs[] spill300139_4;
    int spill300139_5;
    moom.Fs spill300139_6;
    moom.Fs spill300139_7;
    int spill300139_8;
    moom.Fs spill300139_9;
    int spill300139_10;
    net.minecraft.block.Block spill300139_11;
    net.minecraft.block.Block spill300139_12;
    boolean spill300139_13;
    net.minecraft.block.Block spill300139_14;
    int spill300139_15;
    int spill300139_16;
    int spill300139_17;
    int spill300139_18;
    int spill300139_19;
    int spill300139_20;
    int spill300139_21;
    net.minecraft.world.chunk.Chunk spill300139_22;
    int spill300139_23;
    net.minecraft.world.chunk.Chunk spill300139_24;
    net.minecraft.block.Block spill300139_25;
    net.minecraft.tileentity.TileEntity spill300139_26;
    long life3_3;
    int life6_13;
    java.lang.String life5_14;
    int life7_17;
    int life8_26;
    int life9_32;
    int life10_58;
    net.minecraft.block.state.IBlockState life11_62;
    net.minecraft.block.Block life12_73;
    net.minecraft.block.Block life13_76;
    moom.Fs life14_83;
    int life15_85;
    int life16_207;
    int life17_210;
    net.minecraft.tileentity.TileEntity life16_296;
    net.minecraft.tileentity.TileEntity life16_330;
    forest_join_317: {
    forest_join_316: {
    forest_join_312: {
    forest_join_311: {
    forest_join_287: {
    forest_join_286: {
    forest_join_285: {
    forest_join_271: {
    forest_join_269: {
    forest_join_268: {
    forest_join_254: {
    forest_join_252: {
    forest_join_249: {
    forest_join_248: {
    forest_join_240: {
    forest_join_228: {
    forest_join_224: {
    forest_join_213: {
    forest_join_212: {
    forest_join_190: {
    forest_join_188: {
    forest_join_180: {
    forest_join_177: {
    forest_join_176: {
    forest_join_165: {
    forest_join_160: {
    forest_join_156: {
    forest_join_126: {
    forest_join_125: {
    forest_join_124: {
    forest_join_123: {
    forest_join_122: {
    forest_join_112: {
    forest_join_111: {
    forest_join_92: {
    forest_join_69: {
    forest_join_68: {
    forest_join_56: {
    forest_join_52: {
    life3_3 = (__fieldRead300139_0() ^ 68800982024470L);
    spill300139_0 = __call300139_1();
    life6_13 = (__call300139_2(p0) & __invokedynamic300139_3(5269, (2548029093167251900L ^ life3_3)));
    life5_14 = spill300139_0;
    life7_17 = __call300139_4(p0);
    life8_26 = (__call300139_5(p0) & __invokedynamic300139_6(5269, (2548029093167251900L ^ life3_3)));
    life9_32 = ((life8_26 << 4) | life6_13);
    spill300139_1 = life7_17;
    if (!((life5_14 == null))) {
        forestValue300139_56_0 = spill300139_1;
        break forest_join_56;
    }
    if (!((spill300139_1 >= ((__fieldRead300139_7(receiver))[life9_32] - 1)))) {
        break forest_join_52;
    }
    (__fieldRead300139_8(receiver))[life9_32] = __invokedynamic300139_9(2718, (2426979143242506175L ^ life3_3));
    }
    forestValue300139_56_0 = (__fieldRead300139_10(receiver))[life9_32];
    }
    life10_58 = forestValue300139_56_0;
    life11_62 = __call300139_11(receiver, p0);
    spill300139_2 = life11_62;
    if (!((life5_14 == null))) {
        forestValue300139_69_0 = spill300139_2;
        break forest_join_69;
    }
    if (!((spill300139_2 == p1))) {
        break forest_join_68;
    }
    return null;
    }
    forestValue300139_69_0 = p1;
    }
    life12_73 = __call300139_12(forestValue300139_69_0);
    life13_76 = __call300139_13(life11_62);
    life14_83 = (__fieldRead300139_14(receiver))[(life7_17 >> 4)];
    life15_85 = 0;
    spill300139_3 = life14_83;
    if (!((life5_14 == null))) {
        forestValue300139_126_0 = spill300139_3;
        break forest_join_126;
    }
    if (!((spill300139_3 == null))) {
        break forest_join_125;
    }
    if (!((life12_73 == __fieldRead300139_15()))) {
        break forest_join_92;
    }
    return null;
    }
    spill300139_4 = __fieldRead300139_16(receiver);
    spill300139_5 = (life7_17 >> 4);
    moom.Fs __stackOp300139_18_0 = __sourceUninitializedNEW300139_17();
    spill300139_6 = __stackOp300139_18_0;
    spill300139_7 = __stackOp300139_18_0;
    spill300139_8 = ((life7_17 >> 4) << 4);
    if (!((!__call300139_21(__fieldRead300139_20(__fieldRead300139_19(receiver)))))) {
        forestValue300139_111_0 = spill300139_4;
        forestValue300139_111_1 = spill300139_5;
        forestValue300139_111_2 = spill300139_6;
        forestValue300139_111_3 = spill300139_7;
        forestValue300139_111_4 = spill300139_8;
        break forest_join_111;
    }
    forestValue300139_112_0 = spill300139_4;
    forestValue300139_112_1 = spill300139_5;
    forestValue300139_112_2 = spill300139_6;
    forestValue300139_112_3 = spill300139_7;
    forestValue300139_112_4 = spill300139_8;
    forestValue300139_112_5 = 1;
    break forest_join_112;
    }
    forestValue300139_112_0 = forestValue300139_111_0;
    forestValue300139_112_1 = forestValue300139_111_1;
    forestValue300139_112_2 = forestValue300139_111_2;
    forestValue300139_112_3 = forestValue300139_111_3;
    forestValue300139_112_4 = forestValue300139_111_4;
    forestValue300139_112_5 = 0;
    }
    __explicitNewInit300139_22(forestValue300139_112_3, forestValue300139_112_4, __integerCategory300139_23(forestValue300139_112_5));
    moom.Fs[] __stackOp300139_24_0 = forestValue300139_112_0;
    int __stackOp300139_24_1 = forestValue300139_112_1;
    moom.Fs __stackOp300139_24_2 = forestValue300139_112_2;
    spill300139_9 = __stackOp300139_24_2;
    (__stackOp300139_24_0)[__stackOp300139_24_1] = __stackOp300139_24_2;
    life14_83 = spill300139_9;
    spill300139_10 = life7_17;
    if (!((life5_14 == null))) {
        forestValue300139_122_0 = spill300139_10;
        break forest_join_122;
    }
    if (!((spill300139_10 >= life10_58))) {
        break forest_join_123;
    }
    forestValue300139_122_0 = 1;
    }
    forestValue300139_124_0 = forestValue300139_122_0;
    break forest_join_124;
    }
    forestValue300139_124_0 = 0;
    }
    life15_85 = forestValue300139_124_0;
    }
    forestValue300139_126_0 = life14_83;
    }
    __call300139_26(forestValue300139_126_0, life6_13, (life7_17 & __invokedynamic300139_25(5269, (2548029093167251900L ^ life3_3))), life8_26, p1);
    spill300139_11 = life13_76;
    spill300139_12 = life12_73;
    if (!((life5_14 == null))) {
        forestValue300139_177_0 = spill300139_11;
        forestValue300139_177_1 = spill300139_12;
        break forest_join_177;
    }
    if (!((spill300139_11 != spill300139_12))) {
        break forest_join_165;
    }
    spill300139_13 = __fieldRead300139_28(__fieldRead300139_27(receiver));
    if (!((life5_14 == null))) {
        forestValue300139_160_0 = __integerCategory300139_29(spill300139_13);
        break forest_join_160;
    }
    if (!((!spill300139_13))) {
        break forest_join_156;
    }
    __call300139_31(life13_76, __fieldRead300139_30(receiver), p0, life11_62);
    if (!((life5_14 != null))) {
        break forest_join_165;
    }
    }
    spill300139_14 = life13_76;
    if (!((life5_14 == null))) {
        forestValue300139_176_0 = spill300139_14;
        break forest_join_176;
    }
    forestValue300139_160_0 = __instanceOf300139_32(spill300139_14);
    }
    if (!((forestValue300139_160_0 != 0))) {
        break forest_join_165;
    }
    __call300139_34(__fieldRead300139_33(receiver), p0);
    }
    forestValue300139_176_0 = __call300139_36(life14_83, life6_13, (life7_17 & __invokedynamic300139_35(5269, (2548029093167251900L ^ life3_3))), life8_26);
    }
    forestValue300139_177_0 = forestValue300139_176_0;
    forestValue300139_177_1 = life12_73;
    }
    if (!((forestValue300139_177_0 != forestValue300139_177_1))) {
        break forest_join_180;
    }
    return null;
    }
    spill300139_15 = life15_85;
    if (!((life5_14 == null))) {
        forestValue300139_190_0 = spill300139_15;
        break forest_join_190;
    }
    if (!((spill300139_15 != 0))) {
        break forest_join_188;
    }
    __call300139_37(receiver);
    if (!((life5_14 != null))) {
        break forest_join_252;
    }
    }
    forestValue300139_190_0 = __call300139_38(life12_73);
    }
    life16_207 = forestValue300139_190_0;
    life17_210 = __call300139_39(life13_76);
    spill300139_16 = life16_207;
    if (!((life5_14 == null))) {
        forestValue300139_213_0 = spill300139_16;
        break forest_join_213;
    }
    if (!((spill300139_16 > 0))) {
        break forest_join_212;
    }
    spill300139_17 = life7_17;
    spill300139_18 = life10_58;
    if (!((life5_14 == null))) {
        forestValue300139_228_0 = spill300139_17;
        forestValue300139_228_1 = spill300139_18;
        break forest_join_228;
    }
    if (!((spill300139_17 >= spill300139_18))) {
        break forest_join_224;
    }
    __call300139_40(receiver, life6_13, (life7_17 + 1), life8_26);
    if (!((life5_14 != null))) {
        break forest_join_224;
    }
    }
    forestValue300139_213_0 = life7_17;
    }
    spill300139_19 = (life10_58 - 1);
    if (!((life5_14 == null))) {
        forestValue300139_228_0 = forestValue300139_213_0;
        forestValue300139_228_1 = spill300139_19;
        break forest_join_228;
    }
    if (!((forestValue300139_213_0 == spill300139_19))) {
        break forest_join_224;
    }
    __call300139_41(receiver, life6_13, life7_17, life8_26);
    }
    spill300139_20 = life16_207;
    if (!((life5_14 == null))) {
        forestValue300139_254_0 = spill300139_20;
        break forest_join_254;
    }
    forestValue300139_228_0 = spill300139_20;
    forestValue300139_228_1 = life17_210;
    }
    if (!((forestValue300139_228_0 != forestValue300139_228_1))) {
        break forest_join_252;
    }
    spill300139_21 = life16_207;
    if (!((life5_14 == null))) {
        forestValue300139_240_0 = spill300139_21;
        break forest_join_240;
    }
    if (!((spill300139_21 >= life17_210))) {
        break forest_join_248;
    }
    spill300139_22 = receiver;
    if (!((life5_14 == null))) {
        forestValue300139_249_0 = spill300139_22;
        break forest_join_249;
    }
    forestValue300139_240_0 = __call300139_43(spill300139_22, __fieldRead300139_42(), p0);
    }
    if (!((forestValue300139_240_0 <= 0))) {
        break forest_join_248;
    }
    spill300139_23 = __call300139_45(receiver, __fieldRead300139_44(), p0);
    if (!((life5_14 == null))) {
        forestValue300139_254_0 = spill300139_23;
        break forest_join_254;
    }
    if (!((spill300139_23 > 0))) {
        break forest_join_252;
    }
    }
    forestValue300139_249_0 = receiver;
    }
    __call300139_46(forestValue300139_249_0, life6_13, life8_26);
    }
    forestValue300139_254_0 = __instanceOf300139_47(life13_76);
    }
    if (!((life5_14 == null))) {
        forestValue300139_271_0 = forestValue300139_254_0;
        break forest_join_271;
    }
    if (!((forestValue300139_254_0 != 0))) {
        break forest_join_268;
    }
    spill300139_24 = receiver;
    if (!((life5_14 == null))) {
        forestValue300139_269_0 = spill300139_24;
        break forest_join_269;
    }
    life16_296 = __call300139_49(spill300139_24, p0, __fieldRead300139_48());
    if (!((life16_296 != null))) {
        break forest_join_268;
    }
    __call300139_50(life16_296);
    }
    forestValue300139_269_0 = receiver;
    }
    forestValue300139_271_0 = __integerCategory300139_53(__fieldRead300139_52(__fieldRead300139_51(forestValue300139_269_0)));
    }
    if (!((life5_14 == null))) {
        forestValue300139_287_0 = forestValue300139_271_0;
        break forest_join_287;
    }
    if (!((forestValue300139_271_0 == 0))) {
        break forest_join_285;
    }
    spill300139_25 = life13_76;
    if (!((life5_14 == null))) {
        forestValue300139_286_0 = spill300139_25;
        break forest_join_286;
    }
    if (!((spill300139_25 != life12_73))) {
        break forest_join_285;
    }
    __call300139_55(life12_73, __fieldRead300139_54(receiver), p0, p1);
    }
    forestValue300139_286_0 = life12_73;
    }
    forestValue300139_287_0 = __instanceOf300139_56(forestValue300139_286_0);
    }
    if (!((forestValue300139_287_0 != 0))) {
        break forest_join_317;
    }
    life16_330 = __call300139_58(receiver, p0, __fieldRead300139_57());
    spill300139_26 = life16_330;
    if (!((life5_14 == null))) {
        forestValue300139_312_0 = spill300139_26;
        break forest_join_312;
    }
    if (!((spill300139_26 == null))) {
        break forest_join_311;
    }
    life16_330 = __call300139_62(__cast300139_59(life12_73), __fieldRead300139_60(receiver), __call300139_61(life12_73, p1));
    __call300139_64(__fieldRead300139_63(receiver), p0, life16_330);
    }
    forestValue300139_312_0 = life16_330;
    }
    if (!((life5_14 == null))) {
        forestValue300139_316_0 = forestValue300139_312_0;
        break forest_join_316;
    }
    if (!((forestValue300139_312_0 != null))) {
        break forest_join_317;
    }
    forestValue300139_316_0 = life16_330;
    }
    __call300139_65(forestValue300139_316_0);
    }
    __fieldWrite300139_66(receiver, 1);
    return life11_62;
}
public static net.minecraft.block.state.IBlockState h300139_0(moom.Oo p0) throws Throwable {
    throw __call33013900_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_1(moom.Oo p0) throws Throwable {
    throw __call33013901_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_2(moom.Oo p0) throws Throwable {
    throw __call33013902_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_3(moom.Oo p0) throws Throwable {
    throw __call33013903_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_4(moom.Oo p0) throws Throwable {
    throw __call33013904_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_5(moom.Oo p0) throws Throwable {
    throw __call33013905_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_6(moom.Oo p0) throws Throwable {
    throw __call33013906_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_7(moom.Oo p0) throws Throwable {
    throw __call33013907_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_8(moom.Oo p0) throws Throwable {
    throw __call33013908_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_9(moom.Oo p0) throws Throwable {
    throw __call33013909_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_10(moom.Oo p0) throws Throwable {
    throw __call33013910_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_11(moom.Oo p0) throws Throwable {
    throw __call33013911_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_12(moom.Oo p0) throws Throwable {
    throw __call33013912_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_13(moom.Oo p0) throws Throwable {
    throw __call33013913_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_14(moom.Oo p0) throws Throwable {
    throw __call33013914_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_15(moom.Oo p0) throws Throwable {
    throw __call33013915_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_16(moom.Oo p0) throws Throwable {
    throw __call33013916_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_17(moom.Oo p0) throws Throwable {
    throw __call33013917_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_18(moom.Oo p0) throws Throwable {
    throw __call33013918_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_19(moom.Oo p0) throws Throwable {
    throw __call33013919_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_20(moom.Oo p0) throws Throwable {
    throw __call33013920_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_21(moom.Oo p0) throws Throwable {
    throw __call33013921_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_22(moom.Oo p0) throws Throwable {
    throw __call33013922_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_23(moom.Oo p0) throws Throwable {
    throw __call33013923_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_24(moom.Oo p0) throws Throwable {
    throw __call33013924_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_25(moom.Oo p0) throws Throwable {
    throw __call33013925_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_26(moom.Oo p0) throws Throwable {
    throw __call33013926_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_27(moom.Oo p0) throws Throwable {
    throw __call33013927_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_28(moom.Oo p0) throws Throwable {
    throw __call33013928_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_29(moom.Oo p0) throws Throwable {
    throw __call33013929_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_30(moom.Oo p0) throws Throwable {
    throw __call33013930_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_31(moom.Oo p0) throws Throwable {
    throw __call33013931_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_32(moom.Oo p0) throws Throwable {
    throw __call33013932_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_33(moom.Oo p0) throws Throwable {
    throw __call33013933_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_34(moom.Oo p0) throws Throwable {
    throw __call33013934_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_35(moom.Oo p0) throws Throwable {
    throw __call33013935_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_36(moom.Oo p0) throws Throwable {
    throw __call33013936_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_37(moom.Oo p0) throws Throwable {
    throw __call33013937_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_38(moom.Oo p0) throws Throwable {
    throw __call33013938_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_39(moom.Oo p0) throws Throwable {
    throw __call33013939_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_40(moom.Oo p0) throws Throwable {
    throw __call33013940_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_41(moom.Oo p0) throws Throwable {
    throw __call33013941_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_42(moom.Oo p0) throws Throwable {
    throw __call33013942_0(p0);
}
public static net.minecraft.block.state.IBlockState h300139_43(moom.Oo p0) throws Throwable {
    throw __call33013943_0(p0);
}
private static native long __fieldRead300139_0() throws Throwable;
private static native java.lang.String __call300139_1() throws Throwable;
private static native int __call300139_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic300139_3(int a0, long a1) throws Throwable;
private static native int __call300139_4(moom.DT a0) throws Throwable;
private static native int __call300139_5(moom.DT a0) throws Throwable;
private static native int __invokedynamic300139_6(int a0, long a1) throws Throwable;
private static native int[] __fieldRead300139_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int[] __fieldRead300139_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic300139_9(int a0, long a1) throws Throwable;
private static native int[] __fieldRead300139_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call300139_11(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call300139_12(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native net.minecraft.block.Block __call300139_13(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native moom.Fs[] __fieldRead300139_14(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.block.Block __fieldRead300139_15() throws Throwable;
private static native moom.Fs[] __fieldRead300139_16(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs __sourceUninitializedNEW300139_17() throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_19(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead300139_20(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call300139_21(moom.EA a0) throws Throwable;
private static native boolean __integerCategory300139_23(int value) throws Throwable;
private static native void __explicitNewInit300139_22(moom.Fs a0, int a1, boolean a2) throws Throwable;
private static native int __invokedynamic300139_25(int a0, long a1) throws Throwable;
private static native void __call300139_26(moom.Fs a0, int a1, int a2, int a3, net.minecraft.block.state.IBlockState a4) throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_27(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __fieldRead300139_28(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory300139_29(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_30(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call300139_31(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws Throwable;
private static native int __instanceOf300139_32(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_33(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call300139_34(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic300139_35(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call300139_36(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native void __call300139_37(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call300139_38(net.minecraft.block.Block a0) throws Throwable;
private static native int __call300139_39(net.minecraft.block.Block a0) throws Throwable;
private static native void __call300139_40(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native void __call300139_41(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead300139_42() throws Throwable;
private static native int __call300139_43(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead300139_44() throws Throwable;
private static native int __call300139_45(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws Throwable;
private static native void __call300139_46(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native int __instanceOf300139_47(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk$EnumCreateEntityType __fieldRead300139_48() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call300139_49(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.chunk.Chunk$EnumCreateEntityType a2) throws Throwable;
private static native void __call300139_50(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_51(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __fieldRead300139_52(net.minecraft.world.World a0) throws Throwable;
private static native int __integerCategory300139_53(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_54(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call300139_55(net.minecraft.block.Block a0, net.minecraft.world.World a1, moom.DT a2, net.minecraft.block.state.IBlockState a3) throws Throwable;
private static native int __instanceOf300139_56(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk$EnumCreateEntityType __fieldRead300139_57() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call300139_58(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.chunk.Chunk$EnumCreateEntityType a2) throws Throwable;
private static native net.minecraft.block.ITileEntityProvider __cast300139_59(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_60(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call300139_61(net.minecraft.block.Block a0, net.minecraft.block.state.IBlockState a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call300139_62(net.minecraft.block.ITileEntityProvider a0, net.minecraft.world.World a1, int a2) throws Throwable;
private static native net.minecraft.world.World __fieldRead300139_63(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call300139_64(net.minecraft.world.World a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native void __call300139_65(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __fieldWrite300139_66(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.lang.Throwable __call33013900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013910_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013911_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013912_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013913_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013914_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013915_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013916_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013917_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013918_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013919_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013920_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013921_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013922_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013923_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013924_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013925_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013926_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013927_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013928_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013929_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013930_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013931_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013932_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013933_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013934_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013935_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013936_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013937_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013938_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013939_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013940_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013941_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013942_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call33013943_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6228750a79b053b6af52(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws E;
private static final class __SourceHandler_6228750a79b053b6af52 {

public static void f1797(net.minecraft.world.chunk.Chunk receiver, moom.DT p0, net.minecraft.tileentity.TileEntity p1) throws Throwable {
    int forwardValue1797_26_0;
    java.util.Map forwardValue1797_38_0;
    moom.DT forwardValue1797_38_1;
    java.lang.String spill1797_0;
    int spill1797_1;
    java.util.Map spill1797_2;
    moom.DT spill1797_3;
    long life3_3;
    java.lang.String life5_9;
    forward_join_41: {
    forward_join_38: {
    forward_join_33: {
    forward_join_26: {
    life3_3 = (__fieldRead1797_0() ^ 112672644148372L);
    spill1797_0 = __call1797_1();
    __call1797_3(p1, __fieldRead1797_2(receiver));
    life5_9 = spill1797_0;
    __call1797_4(p1, p0);
    spill1797_1 = __instanceOf1797_6(__call1797_5(receiver, p0));
    if (!((life5_9 == null))) {
        forwardValue1797_26_0 = spill1797_1;
        break forward_join_26;
    }
    if (!((spill1797_1 != 0))) {
        break forward_join_41;
    }
    spill1797_2 = __fieldRead1797_7(receiver);
    spill1797_3 = p0;
    if (!((life5_9 == null))) {
        forwardValue1797_38_0 = spill1797_2;
        forwardValue1797_38_1 = spill1797_3;
        break forward_join_38;
    }
    forwardValue1797_26_0 = __integerCategory1797_9(__call1797_8(spill1797_2, spill1797_3));
    }
    if (!((forwardValue1797_26_0 != 0))) {
        break forward_join_33;
    }
    __call1797_13(__cast1797_12(__call1797_11(__fieldRead1797_10(receiver), p0)));
    }
    __call1797_14(p1);
    forwardValue1797_38_0 = __fieldRead1797_15(receiver);
    forwardValue1797_38_1 = p0;
    }
    __call1797_16(forwardValue1797_38_0, forwardValue1797_38_1, p1);
    }
    return;
}
public static void h1797_0(moom.Oo p0) throws Throwable {
    throw __call1179700_0(p0);
}
public static void h1797_1(moom.Oo p0) throws Throwable {
    throw __call1179701_0(p0);
}
public static void h1797_2(moom.Oo p0) throws Throwable {
    throw __call1179702_0(p0);
}
public static void h1797_3(moom.Oo p0) throws Throwable {
    throw __call1179703_0(p0);
}
private static native long __fieldRead1797_0() throws Throwable;
private static native java.lang.String __call1797_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1797_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1797_3(net.minecraft.tileentity.TileEntity a0, net.minecraft.world.World a1) throws Throwable;
private static native void __call1797_4(net.minecraft.tileentity.TileEntity a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1797_5(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native int __instanceOf1797_6(net.minecraft.block.Block a0) throws Throwable;
private static native java.util.Map __fieldRead1797_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1797_8(java.util.Map a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1797_9(boolean value) throws Throwable;
private static native java.util.Map __fieldRead1797_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Object __call1797_11(java.util.Map a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast1797_12(java.lang.Object a0) throws Throwable;
private static native void __call1797_13(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call1797_14(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.util.Map __fieldRead1797_15(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Object __call1797_16(java.util.Map a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native java.lang.Throwable __call1179700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.world.biome.BiomeGenBase __sourceHandlerCall_1a8ac5802a5a5ecc36b0(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.biome.WorldChunkManager a2) throws E;
private static final class __SourceHandler_1a8ac5802a5a5ecc36b0 {

public static net.minecraft.world.biome.BiomeGenBase f1798(net.minecraft.world.chunk.Chunk receiver, moom.DT p0, net.minecraft.world.biome.WorldChunkManager p1) throws Throwable {
    int forwardValue1798_73_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue1798_80_0;
    net.minecraft.world.biome.BiomeGenBase forwardValue1798_82_0;
    java.lang.String spill1798_0;
    int spill1798_1;
    net.minecraft.world.biome.BiomeGenBase spill1798_2;
    long life3_3;
    int life6_13;
    java.lang.String life5_14;
    int life7_23;
    int life8_38;
    net.minecraft.world.biome.BiomeGenBase life9_55;
    net.minecraft.world.biome.BiomeGenBase life9_77;
    forward_join_82: {
    forward_join_81: {
    forward_join_80: {
    forward_join_73: {
    forward_join_72: {
    life3_3 = (__fieldRead1798_0() ^ 122924653718606L);
    spill1798_0 = __call1798_1();
    life6_13 = (__call1798_2(p0) & __invokedynamic1798_3(19571, (2674683969983689742L ^ life3_3)));
    life5_14 = spill1798_0;
    life7_23 = (__call1798_4(p0) & __invokedynamic1798_5(5269, (2547977097323867364L ^ life3_3)));
    life8_38 = ((__fieldRead1798_6(receiver))[((life7_23 << 4) | life6_13)] & __invokedynamic1798_7(9073, (6926390539131706117L ^ life3_3)));
    spill1798_1 = life8_38;
    if (!((life5_14 == null))) {
        forwardValue1798_73_0 = spill1798_1;
        break forward_join_73;
    }
    if (!((spill1798_1 == __invokedynamic1798_8(9073, (6926390539131706117L ^ life3_3))))) {
        break forward_join_72;
    }
    life9_55 = __call1798_10(p1, p0, __fieldRead1798_9());
    life8_38 = __fieldRead1798_11(life9_55);
    (__fieldRead1798_12(receiver))[((life7_23 << 4) | life6_13)] = ((byte) (life8_38 & __invokedynamic1798_13(9073, (6926390539131706117L ^ life3_3))));
    }
    forwardValue1798_73_0 = life8_38;
    }
    life9_77 = __call1798_14(forwardValue1798_73_0);
    spill1798_2 = life9_77;
    if (!((life5_14 == null))) {
        forwardValue1798_80_0 = spill1798_2;
        break forward_join_80;
    }
    if (!((spill1798_2 == null))) {
        break forward_join_81;
    }
    forwardValue1798_80_0 = __fieldRead1798_15();
    }
    forwardValue1798_82_0 = forwardValue1798_80_0;
    break forward_join_82;
    }
    forwardValue1798_82_0 = life9_77;
    }
    return forwardValue1798_82_0;
}
public static void h1798_0(moom.Oo p0) throws Throwable {
    throw __call1179800_0(p0);
}
public static void h1798_1(moom.Oo p0) throws Throwable {
    throw __call1179801_0(p0);
}
private static native long __fieldRead1798_0() throws Throwable;
private static native java.lang.String __call1798_1() throws Throwable;
private static native int __call1798_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic1798_3(int a0, long a1) throws Throwable;
private static native int __call1798_4(moom.DT a0) throws Throwable;
private static native int __invokedynamic1798_5(int a0, long a1) throws Throwable;
private static native byte[] __fieldRead1798_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1798_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic1798_8(int a0, long a1) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead1798_9() throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1798_10(net.minecraft.world.biome.WorldChunkManager a0, moom.DT a1, net.minecraft.world.biome.BiomeGenBase a2) throws Throwable;
private static native int __fieldRead1798_11(net.minecraft.world.biome.BiomeGenBase a0) throws Throwable;
private static native byte[] __fieldRead1798_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1798_13(int a0, long a1) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __call1798_14(int a0) throws Throwable;
private static native net.minecraft.world.biome.BiomeGenBase __fieldRead1798_15() throws Throwable;
private static native java.lang.Throwable __call1179800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179801_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.tileentity.TileEntity __sourceHandlerCall_f031c5cf727d01311bbd(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.chunk.Chunk$EnumCreateEntityType a2) throws E;
private static final class __SourceHandler_f031c5cf727d01311bbd {

public static net.minecraft.tileentity.TileEntity f1799(net.minecraft.world.chunk.Chunk receiver, moom.DT p0, net.minecraft.world.chunk.Chunk$EnumCreateEntityType p1) throws Throwable {
    net.minecraft.world.chunk.Chunk$EnumCreateEntityType forwardValue1799_34_0;
    net.minecraft.world.chunk.Chunk$EnumCreateEntityType forwardValue1799_34_1;
    net.minecraft.tileentity.TileEntity forwardValue1799_43_0;
    net.minecraft.tileentity.TileEntity forwardValue1799_55_0;
    java.lang.String spill1799_0;
    net.minecraft.tileentity.TileEntity spill1799_1;
    net.minecraft.world.chunk.Chunk$EnumCreateEntityType spill1799_2;
    net.minecraft.world.chunk.Chunk$EnumCreateEntityType spill1799_3;
    long life3_3;
    net.minecraft.tileentity.TileEntity life6_10;
    java.lang.String life5_11;
    forward_join_55: {
    forward_join_54: {
    forward_join_43: {
    forward_join_42: {
    forward_join_34: {
    forward_join_32: {
    life3_3 = (__fieldRead1799_0() ^ 106445229612102L);
    spill1799_0 = __call1799_1();
    life6_10 = __cast1799_4(__call1799_3(__fieldRead1799_2(receiver), p0));
    life5_11 = spill1799_0;
    spill1799_1 = life6_10;
    if (!((life5_11 == null))) {
        forwardValue1799_43_0 = spill1799_1;
        break forward_join_43;
    }
    if (!((spill1799_1 == null))) {
        break forward_join_42;
    }
    spill1799_2 = p1;
    spill1799_3 = __fieldRead1799_5();
    if (!((life5_11 == null))) {
        forwardValue1799_34_0 = spill1799_2;
        forwardValue1799_34_1 = spill1799_3;
        break forward_join_34;
    }
    if (!((spill1799_2 == spill1799_3))) {
        break forward_join_32;
    }
    life6_10 = __call1799_6(receiver, p0);
    __call1799_8(__fieldRead1799_7(receiver), p0, life6_10);
    if (!((life5_11 != null))) {
        break forward_join_54;
    }
    }
    forwardValue1799_34_0 = p1;
    forwardValue1799_34_1 = __fieldRead1799_9();
    }
    if (!((forwardValue1799_34_0 == forwardValue1799_34_1))) {
        break forward_join_54;
    }
    __call1799_11(__fieldRead1799_10(receiver), p0);
    if (!((life5_11 != null))) {
        break forward_join_54;
    }
    }
    forwardValue1799_43_0 = life6_10;
    }
    if (!((life5_11 == null))) {
        forwardValue1799_55_0 = forwardValue1799_43_0;
        break forward_join_55;
    }
    if (!(__call1799_12(forwardValue1799_43_0))) {
        break forward_join_54;
    }
    __call1799_14(__fieldRead1799_13(receiver), p0);
    return null;
    }
    forwardValue1799_55_0 = life6_10;
    }
    return forwardValue1799_55_0;
}
public static void h1799_0(moom.Oo p0) throws Throwable {
    throw __call1179900_0(p0);
}
public static void h1799_1(moom.Oo p0) throws Throwable {
    throw __call1179901_0(p0);
}
public static void h1799_2(moom.Oo p0) throws Throwable {
    throw __call1179902_0(p0);
}
public static void h1799_3(moom.Oo p0) throws Throwable {
    throw __call1179903_0(p0);
}
public static void h1799_4(moom.Oo p0) throws Throwable {
    throw __call1179904_0(p0);
}
public static void h1799_5(moom.Oo p0) throws Throwable {
    throw __call1179905_0(p0);
}
public static void h1799_6(moom.Oo p0) throws Throwable {
    throw __call1179906_0(p0);
}
public static void h1799_7(moom.Oo p0) throws Throwable {
    throw __call1179907_0(p0);
}
private static native long __fieldRead1799_0() throws Throwable;
private static native java.lang.String __call1799_1() throws Throwable;
private static native java.util.Map __fieldRead1799_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Object __call1799_3(java.util.Map a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast1799_4(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk$EnumCreateEntityType __fieldRead1799_5() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1799_6(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1799_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1799_8(net.minecraft.world.World a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native net.minecraft.world.chunk.Chunk$EnumCreateEntityType __fieldRead1799_9() throws Throwable;
private static native java.util.concurrent.ConcurrentLinkedQueue __fieldRead1799_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1799_11(java.util.concurrent.ConcurrentLinkedQueue a0, moom.DT a1) throws Throwable;
private static native boolean __call1799_12(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.util.Map __fieldRead1799_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Object __call1799_14(java.util.Map a0, moom.DT a1) throws Throwable;
private static native java.lang.Throwable __call1179900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1179907_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_3d10618f392e980c7dde(net.minecraft.world.chunk.Chunk a0, moom.Fn a1, moom.Fn a2, int a3, int a4) throws E;
private static final class __SourceHandler_3d10618f392e980c7dde {

public static void f292(net.minecraft.world.chunk.Chunk receiver, moom.Fn p0, moom.Fn p1, int p2, int p3) throws Throwable {
    int forwardValue292_103_0;
    int forwardValue292_105_0;
    int forwardValue292_145_0;
    int forwardValue292_147_0;
    int forwardValue292_187_0;
    int forwardValue292_189_0;
    int forwardValue292_193_0;
    int forwardValue292_197_0;
    int forwardValue292_233_0;
    java.lang.String spill292_0;
    int spill292_1;
    int spill292_2;
    int spill292_3;
    boolean spill292_4;
    int spill292_5;
    int spill292_6;
    boolean spill292_7;
    int spill292_8;
    int spill292_9;
    boolean spill292_10;
    boolean spill292_11;
    long life5_3;
    int life8_10;
    int life9_17;
    int life10_24;
    int life11_32;
    int life12_41;
    int life13_50;
    int life14_59;
    java.lang.String life7_60;
    int life15_69;
    net.minecraft.world.chunk.Chunk life16_164;
    net.minecraft.world.chunk.Chunk life16_230;
    net.minecraft.world.chunk.Chunk life16_287;
    forward_join_234: {
    forward_join_233: {
    forward_join_223: {
    forward_join_197: {
    forward_join_193: {
    forward_join_189: {
    forward_join_188: {
    forward_join_187: {
    forward_join_179: {
    forward_join_147: {
    forward_join_146: {
    forward_join_145: {
    forward_join_137: {
    forward_join_105: {
    forward_join_104: {
    forward_join_103: {
    forward_join_97: {
    life5_3 = (__fieldRead292_0() ^ 123032244428088L);
    life8_10 = __integerCategory292_2(__call292_1(p0, p2, (p3 - 1)));
    life9_17 = __integerCategory292_4(__call292_3(p0, (p2 + 1), p3));
    life10_24 = __integerCategory292_6(__call292_5(p0, p2, (p3 + 1)));
    spill292_0 = __call292_7();
    life11_32 = __integerCategory292_9(__call292_8(p0, (p2 - 1), p3));
    life12_41 = __integerCategory292_11(__call292_10(p0, (p2 - 1), (p3 - 1)));
    life13_50 = __integerCategory292_13(__call292_12(p0, (p2 + 1), (p3 + 1)));
    life14_59 = __integerCategory292_15(__call292_14(p0, (p2 - 1), (p3 + 1)));
    life7_60 = spill292_0;
    life15_69 = __integerCategory292_17(__call292_16(p0, (p2 + 1), (p3 - 1)));
    spill292_1 = life9_17;
    if (!((life7_60 == null))) {
        forwardValue292_105_0 = spill292_1;
        break forward_join_105;
    }
    if (!((spill292_1 != 0))) {
        break forward_join_104;
    }
    spill292_2 = life10_24;
    if (!((life7_60 == null))) {
        forwardValue292_105_0 = spill292_2;
        break forward_join_105;
    }
    if (!((spill292_2 != 0))) {
        break forward_join_104;
    }
    spill292_3 = life13_50;
    if (!((life7_60 == null))) {
        forwardValue292_105_0 = spill292_3;
        break forward_join_105;
    }
    if (!((spill292_3 != 0))) {
        break forward_join_104;
    }
    spill292_4 = __fieldRead292_18(receiver);
    if (!((life7_60 == null))) {
        forwardValue292_103_0 = __integerCategory292_19(spill292_4);
        break forward_join_103;
    }
    if (!((!spill292_4))) {
        break forward_join_97;
    }
    __call292_20(p0, p1, p2, p3);
    if (!((life7_60 != null))) {
        break forward_join_104;
    }
    __call292_21(new java.lang.String[3]);
    }
    forwardValue292_103_0 = __integerCategory292_23(__call292_22(p0, p1, receiver, p2, p3));
    }
    __discardScalar292_24(forwardValue292_103_0);
    }
    forwardValue292_105_0 = life11_32;
    }
    if (!((life7_60 == null))) {
        forwardValue292_147_0 = forwardValue292_105_0;
        break forward_join_147;
    }
    if (!((forwardValue292_105_0 != 0))) {
        break forward_join_146;
    }
    spill292_5 = life10_24;
    if (!((life7_60 == null))) {
        forwardValue292_147_0 = spill292_5;
        break forward_join_147;
    }
    if (!((spill292_5 != 0))) {
        break forward_join_146;
    }
    spill292_6 = life14_59;
    if (!((life7_60 == null))) {
        forwardValue292_147_0 = spill292_6;
        break forward_join_147;
    }
    if (!((spill292_6 != 0))) {
        break forward_join_146;
    }
    life16_164 = __call292_25(p0, (p2 - 1), p3);
    spill292_7 = __fieldRead292_26(life16_164);
    if (!((life7_60 == null))) {
        forwardValue292_145_0 = __integerCategory292_27(spill292_7);
        break forward_join_145;
    }
    if (!((!spill292_7))) {
        break forward_join_137;
    }
    __call292_28(p0, p1, (p2 - 1), p3);
    if (!((life7_60 != null))) {
        break forward_join_146;
    }
    }
    forwardValue292_145_0 = __integerCategory292_30(__call292_29(p0, p1, life16_164, (p2 - 1), p3));
    }
    __discardScalar292_31(forwardValue292_145_0);
    }
    forwardValue292_147_0 = life8_10;
    }
    if (!((life7_60 == null))) {
        forwardValue292_189_0 = forwardValue292_147_0;
        break forward_join_189;
    }
    if (!((forwardValue292_147_0 != 0))) {
        break forward_join_188;
    }
    spill292_8 = life9_17;
    if (!((life7_60 == null))) {
        forwardValue292_189_0 = spill292_8;
        break forward_join_189;
    }
    if (!((spill292_8 != 0))) {
        break forward_join_188;
    }
    spill292_9 = life15_69;
    if (!((life7_60 == null))) {
        forwardValue292_189_0 = spill292_9;
        break forward_join_189;
    }
    if (!((spill292_9 != 0))) {
        break forward_join_188;
    }
    life16_230 = __call292_32(p0, p2, (p3 - 1));
    spill292_10 = __fieldRead292_33(life16_230);
    if (!((life7_60 == null))) {
        forwardValue292_187_0 = __integerCategory292_34(spill292_10);
        break forward_join_187;
    }
    if (!((!spill292_10))) {
        break forward_join_179;
    }
    __call292_35(p0, p1, p2, (p3 - 1));
    if (!((life7_60 != null))) {
        break forward_join_188;
    }
    }
    forwardValue292_187_0 = __integerCategory292_37(__call292_36(p0, p1, life16_230, p2, (p3 - 1)));
    }
    __discardScalar292_38(forwardValue292_187_0);
    }
    forwardValue292_189_0 = life12_41;
    }
    if (!((life7_60 == null))) {
        forwardValue292_193_0 = forwardValue292_189_0;
        break forward_join_193;
    }
    if (!((forwardValue292_189_0 != 0))) {
        break forward_join_234;
    }
    forwardValue292_193_0 = life8_10;
    }
    if (!((life7_60 == null))) {
        forwardValue292_197_0 = forwardValue292_193_0;
        break forward_join_197;
    }
    if (!((forwardValue292_193_0 != 0))) {
        break forward_join_234;
    }
    forwardValue292_197_0 = life11_32;
    }
    if (!((forwardValue292_197_0 != 0))) {
        break forward_join_234;
    }
    life16_287 = __call292_39(p0, (p2 - 1), (p3 - 1));
    spill292_11 = __fieldRead292_40(life16_287);
    if (!((life7_60 == null))) {
        forwardValue292_233_0 = __integerCategory292_41(spill292_11);
        break forward_join_233;
    }
    if (!((!spill292_11))) {
        break forward_join_223;
    }
    __call292_42(p0, p1, (p2 - 1), (p3 - 1));
    if (!((life7_60 != null))) {
        break forward_join_234;
    }
    }
    forwardValue292_233_0 = __integerCategory292_44(__call292_43(p0, p1, life16_287, (p2 - 1), (p3 - 1)));
    }
    __discardScalar292_45(forwardValue292_233_0);
    }
    return;
}
public static void h292_0(moom.Oo p0) throws Throwable {
    throw __call1029200_0(p0);
}
public static void h292_1(moom.Oo p0) throws Throwable {
    throw __call1029201_0(p0);
}
public static void h292_2(moom.Oo p0) throws Throwable {
    throw __call1029202_0(p0);
}
public static void h292_3(moom.Oo p0) throws Throwable {
    throw __call1029203_0(p0);
}
public static void h292_4(moom.Oo p0) throws Throwable {
    throw __call1029204_0(p0);
}
public static void h292_5(moom.Oo p0) throws Throwable {
    throw __call1029205_0(p0);
}
public static void h292_6(moom.Oo p0) throws Throwable {
    throw __call1029206_0(p0);
}
public static void h292_7(moom.Oo p0) throws Throwable {
    throw __call1029207_0(p0);
}
public static void h292_8(moom.Oo p0) throws Throwable {
    throw __call1029208_0(p0);
}
public static void h292_9(moom.Oo p0) throws Throwable {
    throw __call1029209_0(p0);
}
public static void h292_10(moom.Oo p0) throws Throwable {
    throw __call1029210_0(p0);
}
public static void h292_11(moom.Oo p0) throws Throwable {
    throw __call1029211_0(p0);
}
public static void h292_12(moom.Oo p0) throws Throwable {
    throw __call1029212_0(p0);
}
public static void h292_13(moom.Oo p0) throws Throwable {
    throw __call1029213_0(p0);
}
public static void h292_14(moom.Oo p0) throws Throwable {
    throw __call1029214_0(p0);
}
public static void h292_15(moom.Oo p0) throws Throwable {
    throw __call1029215_0(p0);
}
public static void h292_16(moom.Oo p0) throws Throwable {
    throw __call1029216_0(p0);
}
public static void h292_17(moom.Oo p0) throws Throwable {
    throw __call1029217_0(p0);
}
public static void h292_18(moom.Oo p0) throws Throwable {
    throw __call1029218_0(p0);
}
public static void h292_19(moom.Oo p0) throws Throwable {
    throw __call1029219_0(p0);
}
public static void h292_20(moom.Oo p0) throws Throwable {
    throw __call1029220_0(p0);
}
public static void h292_21(moom.Oo p0) throws Throwable {
    throw __call1029221_0(p0);
}
public static void h292_22(moom.Oo p0) throws Throwable {
    throw __call1029222_0(p0);
}
public static void h292_23(moom.Oo p0) throws Throwable {
    throw __call1029223_0(p0);
}
public static void h292_24(moom.Oo p0) throws Throwable {
    throw __call1029224_0(p0);
}
public static void h292_25(moom.Oo p0) throws Throwable {
    throw __call1029225_0(p0);
}
public static void h292_26(moom.Oo p0) throws Throwable {
    throw __call1029226_0(p0);
}
public static void h292_27(moom.Oo p0) throws Throwable {
    throw __call1029227_0(p0);
}
public static void h292_28(moom.Oo p0) throws Throwable {
    throw __call1029228_0(p0);
}
public static void h292_29(moom.Oo p0) throws Throwable {
    throw __call1029229_0(p0);
}
private static native long __fieldRead292_0() throws Throwable;
private static native boolean __call292_1(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_2(boolean value) throws Throwable;
private static native boolean __call292_3(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_4(boolean value) throws Throwable;
private static native boolean __call292_5(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_6(boolean value) throws Throwable;
private static native java.lang.String __call292_7() throws Throwable;
private static native boolean __call292_8(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_9(boolean value) throws Throwable;
private static native boolean __call292_10(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_11(boolean value) throws Throwable;
private static native boolean __call292_12(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_13(boolean value) throws Throwable;
private static native boolean __call292_14(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_15(boolean value) throws Throwable;
private static native boolean __call292_16(moom.Fn a0, int a1, int a2) throws Throwable;
private static native int __integerCategory292_17(boolean value) throws Throwable;
private static native boolean __fieldRead292_18(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory292_19(boolean value) throws Throwable;
private static native void __call292_20(moom.Fn a0, moom.Fn a1, int a2, int a3) throws Throwable;
private static native void __call292_21(java.lang.String[] a0) throws Throwable;
private static native boolean __call292_22(moom.Fn a0, moom.Fn a1, net.minecraft.world.chunk.Chunk a2, int a3, int a4) throws Throwable;
private static native int __integerCategory292_23(boolean value) throws Throwable;
private static native void __discardScalar292_24(int a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call292_25(moom.Fn a0, int a1, int a2) throws Throwable;
private static native boolean __fieldRead292_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory292_27(boolean value) throws Throwable;
private static native void __call292_28(moom.Fn a0, moom.Fn a1, int a2, int a3) throws Throwable;
private static native boolean __call292_29(moom.Fn a0, moom.Fn a1, net.minecraft.world.chunk.Chunk a2, int a3, int a4) throws Throwable;
private static native int __integerCategory292_30(boolean value) throws Throwable;
private static native void __discardScalar292_31(int a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call292_32(moom.Fn a0, int a1, int a2) throws Throwable;
private static native boolean __fieldRead292_33(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory292_34(boolean value) throws Throwable;
private static native void __call292_35(moom.Fn a0, moom.Fn a1, int a2, int a3) throws Throwable;
private static native boolean __call292_36(moom.Fn a0, moom.Fn a1, net.minecraft.world.chunk.Chunk a2, int a3, int a4) throws Throwable;
private static native int __integerCategory292_37(boolean value) throws Throwable;
private static native void __discardScalar292_38(int a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call292_39(moom.Fn a0, int a1, int a2) throws Throwable;
private static native boolean __fieldRead292_40(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory292_41(boolean value) throws Throwable;
private static native void __call292_42(moom.Fn a0, moom.Fn a1, int a2, int a3) throws Throwable;
private static native boolean __call292_43(moom.Fn a0, moom.Fn a1, net.minecraft.world.chunk.Chunk a2, int a3, int a4) throws Throwable;
private static native int __integerCategory292_44(boolean value) throws Throwable;
private static native void __discardScalar292_45(int a0) throws Throwable;
private static native java.lang.Throwable __call1029200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029212_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029213_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029214_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029215_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029216_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029217_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029218_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029219_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029220_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029221_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029222_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029223_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029224_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029225_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029226_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029227_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029228_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029229_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5ef3c2e10cbddc31c0ce(net.minecraft.world.chunk.Chunk a0, moom.bs a1) throws E;
private static final class __SourceHandler_5ef3c2e10cbddc31c0ce {

public static void f1801(net.minecraft.world.chunk.Chunk receiver, moom.bs p0) throws Throwable {
    moom.bs lexicalValue1801_41_0;
    moom.bs lexicalValue1801_41_1;
    moom.bs lexicalValue1801_67_0;
    moom.bs lexicalValue1801_67_1;
    moom.bs lexicalValue1801_97_0;
    moom.bs lexicalValue1801_97_1;
    moom.bs spill1801_0;
    moom.bs spill1801_1;
    long life2_3;
    java.lang.String life4_5;
    int life5_21;
    int life5_60;
    int life5_95;
    int life5_129;
    lexical_join_115: {
    lexical_join_97: {
    lexical_join_95: {
    lexical_join_93: {
    lexical_join_67: {
    lexical_join_65: {
    lexical_join_63: {
    lexical_join_41: {
    lexical_join_39: {
    lexical_join_37: {
    life2_3 = (__fieldRead1801_0() ^ 118362051665772L);
    life4_5 = __call1801_1();
    if (!(__fieldRead1801_2(receiver))) {
        break lexical_join_115;
    }
    spill1801_0 = p0;
    spill1801_1 = __fieldRead1801_3();
    if (!((life4_5 == null))) {
        lexicalValue1801_41_0 = spill1801_0;
        lexicalValue1801_41_1 = spill1801_1;
        break lexical_join_41;
    }
    if (!((spill1801_0 == spill1801_1))) {
        break lexical_join_39;
    }
    life5_21 = 0;
    lexical_cycle_16: while (true) {
    if (!((life5_21 < __invokedynamic1801_4(9267, (2224664184743440245L ^ life2_3))))) {
        break lexical_join_37;
    }
    __call1801_6(receiver, __invokedynamic1801_5(5269, (2547981589049712582L ^ life2_3)), life5_21);
    life5_21 += 1;
    if (!((life4_5 == null))) {
        break lexical_join_115;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_16; }
    break lexical_cycle_16;
    }
    }
    if (!((life4_5 != null))) {
        break lexical_join_115;
    }
    }
    lexicalValue1801_41_0 = p0;
    lexicalValue1801_41_1 = __fieldRead1801_7();
    }
    if (!((life4_5 == null))) {
        lexicalValue1801_67_0 = lexicalValue1801_41_0;
        lexicalValue1801_67_1 = lexicalValue1801_41_1;
        break lexical_join_67;
    }
    if (!((lexicalValue1801_41_0 == lexicalValue1801_41_1))) {
        break lexical_join_65;
    }
    life5_60 = 0;
    lexical_cycle_46: while (true) {
    if (!((life5_60 < __invokedynamic1801_8(9267, (2224664184743440245L ^ life2_3))))) {
        break lexical_join_63;
    }
    __call1801_9(receiver, 0, life5_60);
    life5_60 += 1;
    if (!((life4_5 == null))) {
        break lexical_join_115;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_46; }
    break lexical_cycle_46;
    }
    }
    if (!((life4_5 != null))) {
        break lexical_join_115;
    }
    }
    lexicalValue1801_67_0 = p0;
    lexicalValue1801_67_1 = __fieldRead1801_10();
    }
    if (!((life4_5 == null))) {
        lexicalValue1801_97_0 = lexicalValue1801_67_0;
        lexicalValue1801_97_1 = lexicalValue1801_67_1;
        break lexical_join_97;
    }
    if (!((lexicalValue1801_67_0 == lexicalValue1801_67_1))) {
        break lexical_join_95;
    }
    life5_95 = 0;
    lexical_cycle_72: while (true) {
    if (!((life5_95 < __invokedynamic1801_11(9267, (2224664184743440245L ^ life2_3))))) {
        break lexical_join_93;
    }
    __call1801_13(receiver, life5_95, __invokedynamic1801_12(5269, (2547981589049712582L ^ life2_3)));
    life5_95 += 1;
    if (!((life4_5 == null))) {
        break lexical_join_115;
    }
    if (!((life4_5 != null))) { continue lexical_cycle_72; }
    break lexical_cycle_72;
    }
    }
    if (!((life4_5 != null))) {
        break lexical_join_115;
    }
    }
    lexicalValue1801_97_0 = p0;
    lexicalValue1801_97_1 = __fieldRead1801_14();
    }
    if (!((lexicalValue1801_97_0 == lexicalValue1801_97_1))) {
        break lexical_join_115;
    }
    life5_129 = 0;
    lexical_cycle_100: while (true) {
    if (!((life5_129 < __invokedynamic1801_15(9267, (2224664184743440245L ^ life2_3))))) {
        break lexical_join_115;
    }
    __call1801_16(receiver, life5_129, 0);
    life5_129 += 1;
    if (!((life4_5 != null))) { continue lexical_cycle_100; }
    break lexical_cycle_100;
    }
    }
    return;
}
public static void h1801_0(moom.Oo p0) throws Throwable {
    throw __call1180100_0(p0);
}
public static void h1801_1(moom.Oo p0) throws Throwable {
    throw __call1180101_0(p0);
}
public static void h1801_2(moom.Oo p0) throws Throwable {
    throw __call1180102_0(p0);
}
public static void h1801_3(moom.Oo p0) throws Throwable {
    throw __call1180103_0(p0);
}
public static void h1801_4(moom.Oo p0) throws Throwable {
    throw __call1180104_0(p0);
}
public static void h1801_5(moom.Oo p0) throws Throwable {
    throw __call1180105_0(p0);
}
public static void h1801_6(moom.Oo p0) throws Throwable {
    throw __call1180106_0(p0);
}
public static void h1801_7(moom.Oo p0) throws Throwable {
    throw __call1180107_0(p0);
}
public static void h1801_8(moom.Oo p0) throws Throwable {
    throw __call1180108_0(p0);
}
public static void h1801_9(moom.Oo p0) throws Throwable {
    throw __call1180109_0(p0);
}
private static native long __fieldRead1801_0() throws Throwable;
private static native java.lang.String __call1801_1() throws Throwable;
private static native boolean __fieldRead1801_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.bs __fieldRead1801_3() throws Throwable;
private static native int __invokedynamic1801_4(int a0, long a1) throws Throwable;
private static native int __invokedynamic1801_5(int a0, long a1) throws Throwable;
private static native boolean __call1801_6(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native moom.bs __fieldRead1801_7() throws Throwable;
private static native int __invokedynamic1801_8(int a0, long a1) throws Throwable;
private static native boolean __call1801_9(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native moom.bs __fieldRead1801_10() throws Throwable;
private static native int __invokedynamic1801_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1801_12(int a0, long a1) throws Throwable;
private static native boolean __call1801_13(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native moom.bs __fieldRead1801_14() throws Throwable;
private static native int __invokedynamic1801_15(int a0, long a1) throws Throwable;
private static native boolean __call1801_16(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1180100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180109_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_68aa4d810ebc15e5b6c5(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1) throws E;
private static final class __SourceHandler_68aa4d810ebc15e5b6c5 {

public static void f293(net.minecraft.world.chunk.Chunk receiver, net.minecraft.entity.Entity p0) throws Throwable {
    int forwardValue293_56_0;
    int forwardValue293_64_0;
    int forwardValue293_96_0;
    java.lang.String spill293_0;
    int spill293_1;
    org.apache.logging.log4j.Logger spill293_2;
    java.lang.String spill293_3;
    java.lang.Object[] spill293_4;
    int spill293_5;
    long life2_3;
    int life5_12;
    int life6_19;
    java.lang.String life4_20;
    int life7_68;
    forward_join_96: {
    forward_join_76: {
    forward_join_64: {
    forward_join_63: {
    forward_join_56: {
    forward_join_51: {
    forward_join_49: {
    forward_join_33: {
    life2_3 = (__fieldRead293_0() ^ 107114362929597L);
    __fieldWrite293_1(receiver, 1);
    life5_12 = __call293_3((__fieldRead293_2(p0) / 0x1.0p4d));
    spill293_0 = __call293_4();
    life6_19 = __call293_6((__fieldRead293_5(p0) / 0x1.0p4d));
    life4_20 = spill293_0;
    if (!((life4_20 == null))) {
        break forward_join_49;
    }
    if (!((life5_12 == __fieldRead293_7(receiver)))) {
        break forward_join_33;
    }
    spill293_1 = life6_19;
    if (!((life4_20 == null))) {
        forwardValue293_56_0 = spill293_1;
        break forward_join_56;
    }
    if (!((spill293_1 != __fieldRead293_8(receiver)))) {
        break forward_join_51;
    }
    }
    spill293_2 = __fieldRead293_9();
    spill293_3 = __invokedynamic293_12(life5_12, life6_19, __fieldRead293_10(receiver), __fieldRead293_11(receiver), p0);
    java.lang.Object[] __stackOp293_13_0 = new java.lang.Object[1];
    spill293_4 = __stackOp293_13_0;
    (__stackOp293_13_0)[0] = p0;
    __call293_14(spill293_2, spill293_3, spill293_4);
    }
    __call293_15(p0);
    }
    forwardValue293_56_0 = __call293_17((__fieldRead293_16(p0) / 0x1.0p4d));
    }
    life7_68 = forwardValue293_56_0;
    spill293_5 = life7_68;
    if (!((life4_20 == null))) {
        forwardValue293_64_0 = spill293_5;
        break forward_join_64;
    }
    if (!((spill293_5 < 0))) {
        break forward_join_63;
    }
    life7_68 = 0;
    }
    forwardValue293_64_0 = life7_68;
    }
    if (!((life4_20 == null))) {
        forwardValue293_96_0 = forwardValue293_64_0;
        break forward_join_96;
    }
    if (!((forwardValue293_64_0 >= (__fieldRead293_18(receiver)).length))) {
        break forward_join_76;
    }
    life7_68 = ((__fieldRead293_19(receiver)).length - 1);
    }
    __fieldWrite293_20(p0, 1);
    __fieldWrite293_22(p0, __fieldRead293_21(receiver));
    __fieldWrite293_23(p0, life7_68);
    __fieldWrite293_25(p0, __fieldRead293_24(receiver));
    forwardValue293_96_0 = __integerCategory293_28(__call293_27((__fieldRead293_26(receiver))[life7_68], p0));
    }
    __discardScalar293_29(forwardValue293_96_0);
    return;
}
public static void h293_0(moom.Oo p0) throws Throwable {
    throw __call1029300_0(p0);
}
public static void h293_1(moom.Oo p0) throws Throwable {
    throw __call1029301_0(p0);
}
public static void h293_2(moom.Oo p0) throws Throwable {
    throw __call1029302_0(p0);
}
public static void h293_3(moom.Oo p0) throws Throwable {
    throw __call1029303_0(p0);
}
public static void h293_4(moom.Oo p0) throws Throwable {
    throw __call1029304_0(p0);
}
public static void h293_5(moom.Oo p0) throws Throwable {
    throw __call1029305_0(p0);
}
private static native long __fieldRead293_0() throws Throwable;
private static native void __fieldWrite293_1(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native double __fieldRead293_2(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call293_3(double a0) throws Throwable;
private static native java.lang.String __call293_4() throws Throwable;
private static native double __fieldRead293_5(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call293_6(double a0) throws Throwable;
private static native int __fieldRead293_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead293_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead293_9() throws Throwable;
private static native int __fieldRead293_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead293_11(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.String __invokedynamic293_12(int a0, int a1, int a2, int a3, net.minecraft.entity.Entity a4) throws Throwable;
private static native void __call293_14(org.apache.logging.log4j.Logger a0, java.lang.String a1, java.lang.Object[] a2) throws Throwable;
private static native void __call293_15(net.minecraft.entity.Entity a0) throws Throwable;
private static native double __fieldRead293_16(net.minecraft.entity.Entity a0) throws Throwable;
private static native int __call293_17(double a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead293_18(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead293_19(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite293_20(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead293_21(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite293_22(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native void __fieldWrite293_23(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native int __fieldRead293_24(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite293_25(net.minecraft.entity.Entity a0, int a1) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead293_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call293_27(net.minecraft.util.ClassInheritanceMultiMap a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory293_28(boolean value) throws Throwable;
private static native void __discardScalar293_29(int a0) throws Throwable;
private static native java.lang.Throwable __call1029300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029305_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_1f2b244ec63149e2ec16(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1, int a2) throws E;
private static final class __SourceHandler_1f2b244ec63149e2ec16 {

public static void f294(net.minecraft.world.chunk.Chunk receiver, net.minecraft.entity.Entity p0, int p1) throws Throwable {
    int forwardValue294_13_0;
    int forwardValue294_31_0;
    int spill294_0;
    long life3_3;
    java.lang.String life5_5;
    forward_join_31: {
    forward_join_25: {
    forward_join_13: {
    forward_join_12: {
    life3_3 = (__fieldRead294_0() ^ 52094727641245L);
    life5_5 = __call294_1();
    spill294_0 = p1;
    if (!((life5_5 == null))) {
        forwardValue294_13_0 = spill294_0;
        break forward_join_13;
    }
    if (!((spill294_0 < 0))) {
        break forward_join_12;
    }
    p1 = 0;
    }
    forwardValue294_13_0 = p1;
    }
    if (!((life5_5 == null))) {
        forwardValue294_31_0 = forwardValue294_13_0;
        break forward_join_31;
    }
    if (!((forwardValue294_13_0 >= (__fieldRead294_2(receiver)).length))) {
        break forward_join_25;
    }
    p1 = ((__fieldRead294_3(receiver)).length - 1);
    }
    forwardValue294_31_0 = __integerCategory294_6(__call294_5((__fieldRead294_4(receiver))[p1], p0));
    }
    __discardScalar294_7(forwardValue294_31_0);
    return;
}
public static void h294_0(moom.Oo p0) throws Throwable {
    throw __call1029400_0(p0);
}
public static void h294_1(moom.Oo p0) throws Throwable {
    throw __call1029401_0(p0);
}
private static native long __fieldRead294_0() throws Throwable;
private static native java.lang.String __call294_1() throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead294_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead294_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead294_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call294_5(net.minecraft.util.ClassInheritanceMultiMap a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory294_6(boolean value) throws Throwable;
private static native void __discardScalar294_7(int a0) throws Throwable;
private static native java.lang.Throwable __call1029400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_461968754145f61117c7(net.minecraft.world.chunk.Chunk a0, net.minecraft.entity.Entity a1, moom.CA a2, java.util.List a3, com.google.common.base.Predicate a4) throws E;
private static final class __SourceHandler_461968754145f61117c7 {

public static void f1172(net.minecraft.world.chunk.Chunk receiver, net.minecraft.entity.Entity p0, moom.CA p1, java.util.List p2, com.google.common.base.Predicate p3) throws Throwable {
    int forestValue1172_43_0;
    net.minecraft.util.ClassInheritanceMultiMap forestValue1172_57_0;
    net.minecraft.entity.Entity forestValue1172_76_0;
    net.minecraft.entity.Entity forestValue1172_77_0;
    net.minecraft.entity.Entity forestValue1172_77_1;
    com.google.common.base.Predicate forestValue1172_83_0;
    int forestValue1172_91_0;
    net.minecraft.entity.Entity[] forestValue1172_100_0;
    com.google.common.base.Predicate forestValue1172_132_0;
    int forestValue1172_140_0;
    java.lang.String spill1172_0;
    net.minecraft.util.ClassInheritanceMultiMap spill1172_1;
    net.minecraft.entity.Entity spill1172_2;
    boolean spill1172_3;
    com.google.common.base.Predicate spill1172_4;
    boolean spill1172_5;
    net.minecraft.entity.Entity[] spill1172_6;
    net.minecraft.entity.Entity spill1172_7;
    net.minecraft.entity.Entity spill1172_8;
    com.google.common.base.Predicate spill1172_9;
    boolean spill1172_10;
    long life5_3;
    int life8_12;
    java.lang.String life7_13;
    int life9_21;
    int life8_30;
    int life9_39;
    int life10_41;
    java.util.Iterator life11_60;
    net.minecraft.entity.Entity life12_67;
    net.minecraft.entity.Entity[] life13_100;
    net.minecraft.entity.Entity[] life14_107;
    int life15_110;
    int life16_112;
    net.minecraft.entity.Entity life17_119;
    forest_join_149: {
    life5_3 = (__fieldRead1172_0() ^ 56260817463507L);
    spill1172_0 = __call1172_1();
    life8_12 = __call1172_3(((__fieldRead1172_2(p1) - 0x1.0p1d) / 0x1.0p4d));
    life7_13 = spill1172_0;
    life9_21 = __call1172_5(((__fieldRead1172_4(p1) + 0x1.0p1d) / 0x1.0p4d));
    life8_30 = __call1172_7(life8_12, 0, ((__fieldRead1172_6(receiver)).length - 1));
    life9_39 = __call1172_9(life9_21, 0, ((__fieldRead1172_8(receiver)).length - 1));
    life10_41 = life8_30;
    forest_cycle_42: while (true) {
    forest_join_146: {
    forestValue1172_43_0 = life10_41;
    forest_cycle_43: while (true) {
    forest_join_57: {
    if (!((forestValue1172_43_0 <= life9_39))) {
        break forest_join_149;
    }
    spill1172_1 = (__fieldRead1172_10(receiver))[life10_41];
    if (!((life7_13 == null))) {
        forestValue1172_57_0 = spill1172_1;
        break forest_join_57;
    }
    if (!((!__call1172_11(spill1172_1)))) {
        break forest_join_146;
    }
    forestValue1172_57_0 = (__fieldRead1172_12(receiver))[life10_41];
    }
    life11_60 = __call1172_13(forestValue1172_57_0);
    forest_cycle_59: while (true) {
    forest_join_144: {
    forest_join_76: {
    if (!(__call1172_14(life11_60))) {
        break forest_join_146;
    }
    life12_67 = __cast1172_16(__call1172_15(life11_60));
    spill1172_2 = life12_67;
    if (!((life7_13 == null))) {
        forestValue1172_76_0 = spill1172_2;
        break forest_join_76;
    }
    spill1172_3 = __call1172_18(__call1172_17(spill1172_2), p1);
    if (!((life7_13 == null))) {
        forestValue1172_43_0 = __integerCategory1172_19(spill1172_3);
        continue forest_cycle_43;
    }
    if (!(spill1172_3)) {
        break forest_join_144;
    }
    forestValue1172_76_0 = life12_67;
    }
    forestValue1172_77_0 = forestValue1172_76_0;
    forestValue1172_77_1 = p0;
    forest_cycle_77: while (true) {
    forest_join_100: {
    forest_join_92: {
    forest_join_91: {
    forest_join_88: {
    forest_join_83: {
    if (!((forestValue1172_77_0 != forestValue1172_77_1))) {
        break forest_join_144;
    }
    spill1172_4 = p3;
    if (!((life7_13 == null))) {
        forestValue1172_83_0 = spill1172_4;
        break forest_join_83;
    }
    if (!((spill1172_4 != null))) {
        break forest_join_88;
    }
    forestValue1172_83_0 = p3;
    }
    spill1172_5 = __call1172_20(forestValue1172_83_0, life12_67);
    if (!((life7_13 == null))) {
        forestValue1172_91_0 = __integerCategory1172_21(spill1172_5);
        break forest_join_91;
    }
    if (!(spill1172_5)) {
        break forest_join_92;
    }
    }
    forestValue1172_91_0 = __integerCategory1172_23(__call1172_22(p2, life12_67));
    }
    __discardScalar1172_24(forestValue1172_91_0);
    }
    life13_100 = __call1172_25(life12_67);
    spill1172_6 = life13_100;
    if (!((life7_13 == null))) {
        forestValue1172_100_0 = spill1172_6;
        break forest_join_100;
    }
    if (!((spill1172_6 != null))) {
        break forest_join_144;
    }
    forestValue1172_100_0 = life13_100;
    }
    life14_107 = forestValue1172_100_0;
    life15_110 = (life14_107).length;
    life16_112 = 0;
    forest_cycle_106: while (true) {
    forest_join_142: {
    forest_join_141: {
    forest_join_140: {
    forest_join_137: {
    forest_join_132: {
    if (!((life16_112 < life15_110))) {
        break forest_join_144;
    }
    life17_119 = (life14_107)[life16_112];
    life12_67 = life17_119;
    if (!((life7_13 == null))) {
        break forest_join_142;
    }
    spill1172_7 = life12_67;
    spill1172_8 = p0;
    if (!((life7_13 == null))) {
        forestValue1172_77_0 = spill1172_7;
        forestValue1172_77_1 = spill1172_8;
        continue forest_cycle_77;
    }
    if (!((spill1172_7 != spill1172_8))) {
        break forest_join_141;
    }
    if (!(__call1172_27(__call1172_26(life12_67), p1))) {
        break forest_join_141;
    }
    spill1172_9 = p3;
    if (!((life7_13 == null))) {
        forestValue1172_132_0 = spill1172_9;
        break forest_join_132;
    }
    if (!((spill1172_9 != null))) {
        break forest_join_137;
    }
    forestValue1172_132_0 = p3;
    }
    spill1172_10 = __call1172_28(forestValue1172_132_0, life12_67);
    if (!((life7_13 == null))) {
        forestValue1172_140_0 = __integerCategory1172_29(spill1172_10);
        break forest_join_140;
    }
    if (!(spill1172_10)) {
        break forest_join_141;
    }
    }
    forestValue1172_140_0 = __integerCategory1172_31(__call1172_30(p2, life12_67));
    }
    __discardScalar1172_32(forestValue1172_140_0);
    }
    life16_112 += 1;
    }
    if (!((life7_13 != null))) {
        continue forest_cycle_106;
    }
    break forest_cycle_106;
    }
    break forest_cycle_77;
    }
    }
    if (!((life7_13 != null))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    break forest_cycle_43;
    }
    }
    life10_41 += 1;
    if (!((life7_13 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    }
    return;
}
public static void h1172_0(moom.Oo p0) throws Throwable {
    throw __call3117200_0(p0);
}
public static void h1172_1(moom.Oo p0) throws Throwable {
    throw __call3117201_0(p0);
}
public static void h1172_2(moom.Oo p0) throws Throwable {
    throw __call3117202_0(p0);
}
public static void h1172_3(moom.Oo p0) throws Throwable {
    throw __call3117203_0(p0);
}
public static void h1172_4(moom.Oo p0) throws Throwable {
    throw __call3117204_0(p0);
}
public static void h1172_5(moom.Oo p0) throws Throwable {
    throw __call3117205_0(p0);
}
public static void h1172_6(moom.Oo p0) throws Throwable {
    throw __call3117206_0(p0);
}
public static void h1172_7(moom.Oo p0) throws Throwable {
    throw __call3117207_0(p0);
}
public static void h1172_8(moom.Oo p0) throws Throwable {
    throw __call3117208_0(p0);
}
public static void h1172_9(moom.Oo p0) throws Throwable {
    throw __call3117209_0(p0);
}
public static void h1172_10(moom.Oo p0) throws Throwable {
    throw __call3117210_0(p0);
}
public static void h1172_11(moom.Oo p0) throws Throwable {
    throw __call3117211_0(p0);
}
public static void h1172_12(moom.Oo p0) throws Throwable {
    throw __call3117212_0(p0);
}
private static native long __fieldRead1172_0() throws Throwable;
private static native java.lang.String __call1172_1() throws Throwable;
private static native double __fieldRead1172_2(moom.CA a0) throws Throwable;
private static native int __call1172_3(double a0) throws Throwable;
private static native double __fieldRead1172_4(moom.CA a0) throws Throwable;
private static native int __call1172_5(double a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1172_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1172_7(int a0, int a1, int a2) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1172_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1172_9(int a0, int a1, int a2) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1172_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1172_11(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1172_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Iterator __call1172_13(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native boolean __call1172_14(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1172_15(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1172_16(java.lang.Object a0) throws Throwable;
private static native moom.CA __call1172_17(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1172_18(moom.CA a0, moom.CA a1) throws Throwable;
private static native int __integerCategory1172_19(boolean value) throws Throwable;
private static native boolean __call1172_20(com.google.common.base.Predicate a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1172_21(boolean value) throws Throwable;
private static native boolean __call1172_22(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1172_23(boolean value) throws Throwable;
private static native void __discardScalar1172_24(int a0) throws Throwable;
private static native net.minecraft.entity.Entity[] __call1172_25(net.minecraft.entity.Entity a0) throws Throwable;
private static native moom.CA __call1172_26(net.minecraft.entity.Entity a0) throws Throwable;
private static native boolean __call1172_27(moom.CA a0, moom.CA a1) throws Throwable;
private static native boolean __call1172_28(com.google.common.base.Predicate a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1172_29(boolean value) throws Throwable;
private static native boolean __call1172_30(java.util.List a0, net.minecraft.entity.Entity a1) throws Throwable;
private static native int __integerCategory1172_31(boolean value) throws Throwable;
private static native void __discardScalar1172_32(int a0) throws Throwable;
private static native java.lang.Throwable __call3117200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117204_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117205_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117206_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117207_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117208_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117209_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117210_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117211_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117212_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_5f4a3dba1659c6e634b8(net.minecraft.world.chunk.Chunk a0, net.minecraft.tileentity.TileEntity a1) throws E;
private static final class __SourceHandler_5f4a3dba1659c6e634b8 {

public static void f295(net.minecraft.world.chunk.Chunk receiver, net.minecraft.tileentity.TileEntity p0) throws Throwable {
    int forwardValue295_20_0;
    java.lang.String spill295_0;
    boolean spill295_1;
    long life2_3;
    java.lang.String life4_10;
    forward_join_21: {
    forward_join_20: {
    life2_3 = (__fieldRead295_0() ^ 46920844642862L);
    spill295_0 = __call295_1();
    __call295_3(receiver, __call295_2(p0), p0);
    life4_10 = spill295_0;
    spill295_1 = __fieldRead295_4(receiver);
    if (!((life4_10 == null))) {
        forwardValue295_20_0 = __integerCategory295_5(spill295_1);
        break forward_join_20;
    }
    if (!(spill295_1)) {
        break forward_join_21;
    }
    forwardValue295_20_0 = __integerCategory295_8(__call295_7(__fieldRead295_6(receiver), p0));
    }
    __discardScalar295_9(forwardValue295_20_0);
    }
    return;
}
public static void h295_0(moom.Oo p0) throws Throwable {
    throw __call1029500_0(p0);
}
public static void h295_1(moom.Oo p0) throws Throwable {
    throw __call1029501_0(p0);
}
private static native long __fieldRead295_0() throws Throwable;
private static native java.lang.String __call295_1() throws Throwable;
private static native moom.DT __call295_2(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native void __call295_3(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native boolean __fieldRead295_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory295_5(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead295_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call295_7(net.minecraft.world.World a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native int __integerCategory295_8(boolean value) throws Throwable;
private static native void __discardScalar295_9(int a0) throws Throwable;
private static native java.lang.Throwable __call1029500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1029501_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_ec92fd3b48da0bcf7b4f(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2) throws E;
private static final class __SourceHandler_ec92fd3b48da0bcf7b4f {

public static int f1806(net.minecraft.world.chunk.Chunk receiver, net.minecraft.world.EnumSkyBlock p0, moom.DT p1) throws Throwable {
    int forwardValue1806_46_0;
    int forwardValue1806_72_0;
    net.minecraft.world.EnumSkyBlock forwardValue1806_77_0;
    net.minecraft.world.EnumSkyBlock forwardValue1806_77_1;
    net.minecraft.world.EnumSkyBlock forwardValue1806_91_0;
    int forwardValue1806_92_0;
    java.lang.String spill1806_0;
    boolean spill1806_1;
    net.minecraft.world.EnumSkyBlock spill1806_2;
    net.minecraft.world.EnumSkyBlock spill1806_3;
    boolean spill1806_4;
    net.minecraft.world.EnumSkyBlock spill1806_5;
    long life3_3;
    int life6_13;
    int life7_16;
    java.lang.String life5_17;
    int life8_26;
    moom.Fs life9_33;
    forward_join_92: {
    forward_join_91: {
    forward_join_90: {
    forward_join_77: {
    forward_join_73: {
    forward_join_72: {
    forward_join_61: {
    forward_join_47: {
    forward_join_46: {
    forward_join_45: {
    life3_3 = (__fieldRead1806_0() ^ 85539871379816L);
    spill1806_0 = __call1806_1();
    life6_13 = (__call1806_2(p1) & __invokedynamic1806_3(5269, (2547939713430688194L ^ life3_3)));
    life7_16 = __call1806_4(p1);
    life5_17 = spill1806_0;
    life8_26 = (__call1806_5(p1) & __invokedynamic1806_6(5269, (2547939713430688194L ^ life3_3)));
    life9_33 = (__fieldRead1806_7(receiver))[(life7_16 >> 4)];
    if (!((life9_33 == null))) {
        break forward_join_47;
    }
    spill1806_1 = __call1806_8(receiver, p1);
    if (!((life5_17 == null))) {
        forwardValue1806_46_0 = __integerCategory1806_9(spill1806_1);
        break forward_join_46;
    }
    if (!(spill1806_1)) {
        break forward_join_45;
    }
    forwardValue1806_92_0 = __fieldRead1806_10(p0);
    break forward_join_92;
    }
    forwardValue1806_46_0 = 0;
    }
    forwardValue1806_92_0 = forwardValue1806_46_0;
    break forward_join_92;
    }
    spill1806_2 = p0;
    spill1806_3 = __fieldRead1806_11();
    if (!((life5_17 == null))) {
        forwardValue1806_77_0 = spill1806_2;
        forwardValue1806_77_1 = spill1806_3;
        break forward_join_77;
    }
    if (!((spill1806_2 == spill1806_3))) {
        break forward_join_73;
    }
    spill1806_4 = __call1806_14(__fieldRead1806_13(__fieldRead1806_12(receiver)));
    if (!((life5_17 == null))) {
        forwardValue1806_72_0 = __integerCategory1806_15(spill1806_4);
        break forward_join_72;
    }
    if (!(spill1806_4)) {
        break forward_join_61;
    }
    forwardValue1806_92_0 = 0;
    break forward_join_92;
    }
    forwardValue1806_72_0 = __call1806_17(life9_33, life6_13, (life7_16 & __invokedynamic1806_16(5269, (2547939713430688194L ^ life3_3))), life8_26);
    }
    forwardValue1806_92_0 = forwardValue1806_72_0;
    break forward_join_92;
    }
    spill1806_5 = p0;
    if (!((life5_17 == null))) {
        forwardValue1806_91_0 = spill1806_5;
        break forward_join_91;
    }
    forwardValue1806_77_0 = spill1806_5;
    forwardValue1806_77_1 = __fieldRead1806_18();
    }
    if (!((forwardValue1806_77_0 == forwardValue1806_77_1))) {
        break forward_join_90;
    }
    forwardValue1806_92_0 = __call1806_20(life9_33, life6_13, (life7_16 & __invokedynamic1806_19(5269, (2547939713430688194L ^ life3_3))), life8_26);
    break forward_join_92;
    }
    forwardValue1806_91_0 = p0;
    }
    forwardValue1806_92_0 = __fieldRead1806_21(forwardValue1806_91_0);
    }
    return forwardValue1806_92_0;
}
public static void h1806_0(moom.Oo p0) throws Throwable {
    throw __call1180600_0(p0);
}
public static void h1806_1(moom.Oo p0) throws Throwable {
    throw __call1180601_0(p0);
}
public static void h1806_2(moom.Oo p0) throws Throwable {
    throw __call1180602_0(p0);
}
public static void h1806_3(moom.Oo p0) throws Throwable {
    throw __call1180603_0(p0);
}
public static void h1806_4(moom.Oo p0) throws Throwable {
    throw __call1180604_0(p0);
}
public static void h1806_5(moom.Oo p0) throws Throwable {
    throw __call1180605_0(p0);
}
public static void h1806_6(moom.Oo p0) throws Throwable {
    throw __call1180606_0(p0);
}
public static void h1806_7(moom.Oo p0) throws Throwable {
    throw __call1180607_0(p0);
}
public static void h1806_8(moom.Oo p0) throws Throwable {
    throw __call1180608_0(p0);
}
private static native long __fieldRead1806_0() throws Throwable;
private static native java.lang.String __call1806_1() throws Throwable;
private static native int __call1806_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic1806_3(int a0, long a1) throws Throwable;
private static native int __call1806_4(moom.DT a0) throws Throwable;
private static native int __call1806_5(moom.DT a0) throws Throwable;
private static native int __invokedynamic1806_6(int a0, long a1) throws Throwable;
private static native moom.Fs[] __fieldRead1806_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1806_8(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1806_9(boolean value) throws Throwable;
private static native int __fieldRead1806_10(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1806_11() throws Throwable;
private static native net.minecraft.world.World __fieldRead1806_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1806_13(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1806_14(moom.EA a0) throws Throwable;
private static native int __integerCategory1806_15(boolean value) throws Throwable;
private static native int __invokedynamic1806_16(int a0, long a1) throws Throwable;
private static native int __call1806_17(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead1806_18() throws Throwable;
private static native int __invokedynamic1806_19(int a0, long a1) throws Throwable;
private static native int __call1806_20(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native int __fieldRead1806_21(net.minecraft.world.EnumSkyBlock a0) throws Throwable;
private static native java.lang.Throwable __call1180600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180608_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b3929f4f0047fc07928e(net.minecraft.world.chunk.Chunk a0, net.minecraft.world.EnumSkyBlock a1, moom.DT a2, int a3) throws E;
private static final class __SourceHandler_b3929f4f0047fc07928e {

public static void f724(net.minecraft.world.chunk.Chunk receiver, net.minecraft.world.EnumSkyBlock p0, moom.DT p1, int p2) throws Throwable {
    moom.Fs[] forestValue724_57_0;
    int forestValue724_57_1;
    moom.Fs forestValue724_57_2;
    moom.Fs forestValue724_57_3;
    int forestValue724_57_4;
    moom.Fs[] forestValue724_58_0;
    int forestValue724_58_1;
    moom.Fs forestValue724_58_2;
    moom.Fs forestValue724_58_3;
    int forestValue724_58_4;
    int forestValue724_58_5;
    net.minecraft.world.EnumSkyBlock forestValue724_93_0;
    net.minecraft.world.EnumSkyBlock forestValue724_93_1;
    java.lang.String spill724_0;
    moom.Fs[] spill724_1;
    int spill724_2;
    moom.Fs spill724_3;
    moom.Fs spill724_4;
    int spill724_5;
    moom.Fs spill724_6;
    net.minecraft.world.EnumSkyBlock spill724_7;
    net.minecraft.world.EnumSkyBlock spill724_8;
    long life4_3;
    int life7_13;
    java.lang.String life6_14;
    int life8_17;
    int life9_26;
    moom.Fs life10_33;
    forest_join_106: {
    forest_join_93: {
    forest_join_91: {
    forest_join_67: {
    forest_join_64: {
    forest_join_58: {
    forest_join_57: {
    life4_3 = (__fieldRead724_0() ^ 118064941412767L);
    spill724_0 = __call724_1();
    life7_13 = (__call724_2(p1) & __invokedynamic724_3(5269, (2547980784579703093L ^ life4_3)));
    life6_14 = spill724_0;
    life8_17 = __call724_4(p1);
    life9_26 = (__call724_5(p1) & __invokedynamic724_6(5269, (2547980784579703093L ^ life4_3)));
    life10_33 = (__fieldRead724_7(receiver))[(life8_17 >> 4)];
    if (!((life6_14 == null))) {
        break forest_join_67;
    }
    if (!((life10_33 == null))) {
        break forest_join_64;
    }
    spill724_1 = __fieldRead724_8(receiver);
    spill724_2 = (life8_17 >> 4);
    moom.Fs __stackOp724_10_0 = __sourceUninitializedNEW724_9();
    spill724_3 = __stackOp724_10_0;
    spill724_4 = __stackOp724_10_0;
    spill724_5 = ((life8_17 >> 4) << 4);
    if (!((!__call724_13(__fieldRead724_12(__fieldRead724_11(receiver)))))) {
        forestValue724_57_0 = spill724_1;
        forestValue724_57_1 = spill724_2;
        forestValue724_57_2 = spill724_3;
        forestValue724_57_3 = spill724_4;
        forestValue724_57_4 = spill724_5;
        break forest_join_57;
    }
    forestValue724_58_0 = spill724_1;
    forestValue724_58_1 = spill724_2;
    forestValue724_58_2 = spill724_3;
    forestValue724_58_3 = spill724_4;
    forestValue724_58_4 = spill724_5;
    forestValue724_58_5 = 1;
    break forest_join_58;
    }
    forestValue724_58_0 = forestValue724_57_0;
    forestValue724_58_1 = forestValue724_57_1;
    forestValue724_58_2 = forestValue724_57_2;
    forestValue724_58_3 = forestValue724_57_3;
    forestValue724_58_4 = forestValue724_57_4;
    forestValue724_58_5 = 0;
    }
    __explicitNewInit724_14(forestValue724_58_3, forestValue724_58_4, __integerCategory724_15(forestValue724_58_5));
    moom.Fs[] __stackOp724_16_0 = forestValue724_58_0;
    int __stackOp724_16_1 = forestValue724_58_1;
    moom.Fs __stackOp724_16_2 = forestValue724_58_2;
    spill724_6 = __stackOp724_16_2;
    (__stackOp724_16_0)[__stackOp724_16_1] = __stackOp724_16_2;
    life10_33 = spill724_6;
    __call724_17(receiver);
    }
    __fieldWrite724_18(receiver, 1);
    }
    spill724_7 = p0;
    spill724_8 = __fieldRead724_19();
    if (!((life6_14 == null))) {
        forestValue724_93_0 = spill724_7;
        forestValue724_93_1 = spill724_8;
        break forest_join_93;
    }
    if (!((spill724_7 == spill724_8))) {
        break forest_join_91;
    }
    if (!((!__call724_22(__fieldRead724_21(__fieldRead724_20(receiver)))))) {
        break forest_join_106;
    }
    __call724_24(life10_33, life7_13, (life8_17 & __invokedynamic724_23(5269, (2547980784579703093L ^ life4_3))), life9_26, p2);
    if (!((life6_14 != null))) {
        break forest_join_106;
    }
    }
    forestValue724_93_0 = p0;
    forestValue724_93_1 = __fieldRead724_25();
    }
    if (!((forestValue724_93_0 == forestValue724_93_1))) {
        break forest_join_106;
    }
    __call724_27(life10_33, life7_13, (life8_17 & __invokedynamic724_26(5269, (2547980784579703093L ^ life4_3))), life9_26, p2);
    }
    return;
}
public static void h724_0(moom.Oo p0) throws Throwable {
    throw __call3072400_0(p0);
}
public static void h724_1(moom.Oo p0) throws Throwable {
    throw __call3072401_0(p0);
}
public static void h724_2(moom.Oo p0) throws Throwable {
    throw __call3072402_0(p0);
}
public static void h724_3(moom.Oo p0) throws Throwable {
    throw __call3072403_0(p0);
}
public static void h724_4(moom.Oo p0) throws Throwable {
    throw __call3072404_0(p0);
}
public static void h724_5(moom.Oo p0) throws Throwable {
    throw __call3072405_0(p0);
}
public static void h724_6(moom.Oo p0) throws Throwable {
    throw __call3072406_0(p0);
}
public static void h724_7(moom.Oo p0) throws Throwable {
    throw __call3072407_0(p0);
}
private static native long __fieldRead724_0() throws Throwable;
private static native java.lang.String __call724_1() throws Throwable;
private static native int __call724_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic724_3(int a0, long a1) throws Throwable;
private static native int __call724_4(moom.DT a0) throws Throwable;
private static native int __call724_5(moom.DT a0) throws Throwable;
private static native int __invokedynamic724_6(int a0, long a1) throws Throwable;
private static native moom.Fs[] __fieldRead724_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead724_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs __sourceUninitializedNEW724_9() throws Throwable;
private static native net.minecraft.world.World __fieldRead724_11(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead724_12(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call724_13(moom.EA a0) throws Throwable;
private static native boolean __integerCategory724_15(int value) throws Throwable;
private static native void __explicitNewInit724_14(moom.Fs a0, int a1, boolean a2) throws Throwable;
private static native void __call724_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite724_18(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead724_19() throws Throwable;
private static native net.minecraft.world.World __fieldRead724_20(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead724_21(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call724_22(moom.EA a0) throws Throwable;
private static native int __invokedynamic724_23(int a0, long a1) throws Throwable;
private static native void __call724_24(moom.Fs a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.EnumSkyBlock __fieldRead724_25() throws Throwable;
private static native int __invokedynamic724_26(int a0, long a1) throws Throwable;
private static native void __call724_27(moom.Fs a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call3072400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3072401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3072402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3072403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3072404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3072405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3072406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3072407_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4b6d3c3ec7fe819a55be(net.minecraft.world.chunk.Chunk a0, boolean a1) throws E;
private static final class __SourceHandler_4b6d3c3ec7fe819a55be {

public static void f1167(net.minecraft.world.chunk.Chunk receiver, boolean p0) throws Throwable {
    int forestValue1167_57_0;
    int forestValue1167_108_0;
    net.minecraft.world.World forestValue1167_215_0;
    java.lang.String spill1167_0;
    net.minecraft.world.World spill1167_1;
    boolean spill1167_2;
    long life2_3;
    java.lang.String life4_10;
    int life5_56;
    int life6_67;
    int life7_111;
    int life8_122;
    int life9_133;
    int life10_139;
    java.util.Iterator life11_142;
    moom.bs life12_149;
    java.util.Iterator life11_176;
    moom.bs life12_183;
    forest_join_217: {
    forest_join_215: {
    forest_join_213: {
    forest_join_210: {
    forest_join_205: {
    life2_3 = (__fieldRead1167_0() ^ 14396322261690L);
    spill1167_0 = __call1167_1();
    __call1167_4(__fieldRead1167_3(__fieldRead1167_2(receiver)), "recheckGaps");
    life4_10 = spill1167_0;
    spill1167_1 = __fieldRead1167_5(receiver);
    if (!((life4_10 == null))) {
        forestValue1167_215_0 = spill1167_1;
        break forest_join_215;
    }
    if (!(__call1167_13(spill1167_1, new moom.DT(((__fieldRead1167_6(receiver) * __invokedynamic1167_7(9267, (2224777098081163939L ^ life2_3))) + __invokedynamic1167_8(28542, (4697596687533249018L ^ life2_3))), 0, ((__fieldRead1167_9(receiver) * __invokedynamic1167_10(9267, (2224777098081163939L ^ life2_3))) + __invokedynamic1167_11(28542, (4697596687533249018L ^ life2_3)))), __invokedynamic1167_12(9267, (2224777098081163939L ^ life2_3))))) {
        break forest_join_213;
    }
    life5_56 = 0;
    forest_cycle_56: while (true) {
    forest_join_201: {
    forestValue1167_57_0 = life5_56;
    forest_cycle_57: while (true) {
    if (!((forestValue1167_57_0 < __invokedynamic1167_14(9267, (2224777098081163939L ^ life2_3))))) {
        break forest_join_210;
    }
    if (!((life4_10 == null))) {
        break forest_join_217;
    }
    life6_67 = 0;
    forest_cycle_67: while (true) {
    forest_join_199: {
    forest_join_198: {
    forest_join_195: {
    forest_join_170: {
    forest_join_165: {
    forest_join_108: {
    if (!((life6_67 < __invokedynamic1167_15(9267, (2224777098081163939L ^ life2_3))))) {
        break forest_join_201;
    }
    spill1167_2 = (__fieldRead1167_16(receiver))[(life5_56 + (life6_67 * __invokedynamic1167_17(9267, (2224777098081163939L ^ life2_3))))];
    if (!((life4_10 == null))) {
        forestValue1167_57_0 = __integerCategory1167_18(spill1167_2);
        continue forest_cycle_57;
    }
    if (!((life4_10 == null))) {
        forestValue1167_108_0 = __integerCategory1167_19(spill1167_2);
        break forest_join_108;
    }
    if (!(spill1167_2)) {
        break forest_join_198;
    }
    (__fieldRead1167_20(receiver))[(life5_56 + (life6_67 * __invokedynamic1167_21(9267, (2224777098081163939L ^ life2_3))))] = __integerCategory1167_22(0);
    forestValue1167_108_0 = __call1167_23(receiver, life5_56, life6_67);
    }
    life7_111 = forestValue1167_108_0;
    life8_122 = ((__fieldRead1167_24(receiver) * __invokedynamic1167_25(9267, (2224777098081163939L ^ life2_3))) + life5_56);
    life9_133 = ((__fieldRead1167_26(receiver) * __invokedynamic1167_27(9267, (2224777098081163939L ^ life2_3))) + life6_67);
    life10_139 = __invokedynamic1167_28(1436, (5012658163697220381L ^ life2_3));
    life11_142 = __call1167_30(__fieldRead1167_29());
    forest_cycle_140: while (true) {
    if (!(__call1167_31(life11_142))) {
        break forest_join_165;
    }
    life12_149 = __cast1167_33(__call1167_32(life11_142));
    life10_139 = __call1167_38(life10_139, __call1167_37(__fieldRead1167_34(receiver), (life8_122 + __call1167_35(life12_149)), (life9_133 + __call1167_36(life12_149))));
    if (!((life4_10 == null))) {
        break forest_join_170;
    }
    if (!((life4_10 != null))) {
        continue forest_cycle_140;
    }
    break forest_cycle_140;
    }
    }
    __call1167_39(receiver, life8_122, life9_133, life10_139);
    }
    life11_176 = __call1167_41(__fieldRead1167_40());
    forest_cycle_173: while (true) {
    if (!(__call1167_42(life11_176))) {
        break forest_join_195;
    }
    life12_183 = __cast1167_44(__call1167_43(life11_176));
    __call1167_47(receiver, (life8_122 + __call1167_45(life12_183)), (life9_133 + __call1167_46(life12_183)), life7_111);
    if (!((life4_10 == null))) {
        break forest_join_199;
    }
    if (!((life4_10 != null))) {
        continue forest_cycle_173;
    }
    break forest_cycle_173;
    }
    }
    if (!(p0)) {
        break forest_join_198;
    }
    break forest_join_205;
    }
    life6_67 += 1;
    }
    if (!((life4_10 != null))) {
        continue forest_cycle_67;
    }
    break forest_cycle_67;
    }
    break forest_cycle_57;
    }
    }
    life5_56 += 1;
    if (!((life4_10 != null))) {
        continue forest_cycle_56;
    }
    break forest_cycle_56;
    }
    break forest_join_210;
    }
    __call1167_50(__fieldRead1167_49(__fieldRead1167_48(receiver)));
    return;
    }
    __fieldWrite1167_51(receiver, 0);
    }
    forestValue1167_215_0 = __fieldRead1167_52(receiver);
    }
    __call1167_54(__fieldRead1167_53(forestValue1167_215_0));
    }
    return;
}
public static void h1167_0(moom.Oo p0) throws Throwable {
    throw __call3116700_0(p0);
}
public static void h1167_1(moom.Oo p0) throws Throwable {
    throw __call3116701_0(p0);
}
public static void h1167_2(moom.Oo p0) throws Throwable {
    throw __call3116702_0(p0);
}
public static void h1167_3(moom.Oo p0) throws Throwable {
    throw __call3116703_0(p0);
}
public static void h1167_4(moom.Oo p0) throws Throwable {
    throw __call3116704_0(p0);
}
public static void h1167_5(moom.Oo p0) throws Throwable {
    throw __call3116705_0(p0);
}
private static native long __fieldRead1167_0() throws Throwable;
private static native java.lang.String __call1167_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1167_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.A9 __fieldRead1167_3(net.minecraft.world.World a0) throws Throwable;
private static native void __call1167_4(moom.A9 a0, java.lang.String a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1167_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1167_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1167_7(int a0, long a1) throws Throwable;
private static native int __invokedynamic1167_8(int a0, long a1) throws Throwable;
private static native int __fieldRead1167_9(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1167_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1167_11(int a0, long a1) throws Throwable;
private static native int __invokedynamic1167_12(int a0, long a1) throws Throwable;
private static native boolean __call1167_13(net.minecraft.world.World a0, moom.DT a1, int a2) throws Throwable;
private static native int __invokedynamic1167_14(int a0, long a1) throws Throwable;
private static native int __invokedynamic1167_15(int a0, long a1) throws Throwable;
private static native boolean[] __fieldRead1167_16(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1167_17(int a0, long a1) throws Throwable;
private static native int __integerCategory1167_18(boolean value) throws Throwable;
private static native int __integerCategory1167_19(boolean value) throws Throwable;
private static native boolean[] __fieldRead1167_20(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1167_21(int a0, long a1) throws Throwable;
private static native boolean __integerCategory1167_22(int value) throws Throwable;
private static native int __call1167_23(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native int __fieldRead1167_24(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1167_25(int a0, long a1) throws Throwable;
private static native int __fieldRead1167_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1167_27(int a0, long a1) throws Throwable;
private static native int __invokedynamic1167_28(int a0, long a1) throws Throwable;
private static native net.minecraft.util.EnumFacing$Plane __fieldRead1167_29() throws Throwable;
private static native java.util.Iterator __call1167_30(net.minecraft.util.EnumFacing$Plane a0) throws Throwable;
private static native boolean __call1167_31(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1167_32(java.util.Iterator a0) throws Throwable;
private static native moom.bs __cast1167_33(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1167_34(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1167_35(moom.bs a0) throws Throwable;
private static native int __call1167_36(moom.bs a0) throws Throwable;
private static native int __call1167_37(net.minecraft.world.World a0, int a1, int a2) throws Throwable;
private static native int __call1167_38(int a0, int a1) throws Throwable;
private static native void __call1167_39(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.util.EnumFacing$Plane __fieldRead1167_40() throws Throwable;
private static native java.util.Iterator __call1167_41(net.minecraft.util.EnumFacing$Plane a0) throws Throwable;
private static native boolean __call1167_42(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1167_43(java.util.Iterator a0) throws Throwable;
private static native moom.bs __cast1167_44(java.lang.Object a0) throws Throwable;
private static native int __call1167_45(moom.bs a0) throws Throwable;
private static native int __call1167_46(moom.bs a0) throws Throwable;
private static native void __call1167_47(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.World __fieldRead1167_48(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.A9 __fieldRead1167_49(net.minecraft.world.World a0) throws Throwable;
private static native void __call1167_50(moom.A9 a0) throws Throwable;
private static native void __fieldWrite1167_51(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1167_52(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.A9 __fieldRead1167_53(net.minecraft.world.World a0) throws Throwable;
private static native void __call1167_54(moom.A9 a0) throws Throwable;
private static native java.lang.Throwable __call3116700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116703_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116704_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116705_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_4038cf25f55bed9ba1cc(net.minecraft.world.chunk.Chunk a0, byte[] a1) throws E;
private static final class __SourceHandler_4038cf25f55bed9ba1cc {

public static void f1808(net.minecraft.world.chunk.Chunk receiver, byte[] p0) throws Throwable {
    byte[] forwardValue1808_25_0;
    byte[] spill1808_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_33: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (__fieldRead1808_0() ^ 66476772274841L);
    life4_5 = __call1808_1();
    spill1808_0 = __fieldRead1808_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue1808_25_0 = spill1808_0;
        break forward_join_25;
    }
    if (!(((spill1808_0).length != (p0).length))) {
        break forward_join_24;
    }
    __call1808_6(__fieldRead1808_3(), __invokedynamic1808_5((p0).length, (__fieldRead1808_4(receiver)).length));
    if (!((life4_5 != null))) {
        break forward_join_33;
    }
    }
    forwardValue1808_25_0 = p0;
    }
    __call1808_9(forwardValue1808_25_0, 0, __fieldRead1808_7(receiver), 0, (__fieldRead1808_8(receiver)).length);
    }
    return;
}
public static void h1808_0(moom.Oo p0) throws Throwable {
    throw __call1180800_0(p0);
}
public static void h1808_1(moom.Oo p0) throws Throwable {
    throw __call1180801_0(p0);
}
public static void h1808_2(moom.Oo p0) throws Throwable {
    throw __call1180802_0(p0);
}
private static native long __fieldRead1808_0() throws Throwable;
private static native java.lang.String __call1808_1() throws Throwable;
private static native byte[] __fieldRead1808_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1808_3() throws Throwable;
private static native byte[] __fieldRead1808_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.String __invokedynamic1808_5(int a0, int a1) throws Throwable;
private static native void __call1808_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native byte[] __fieldRead1808_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native byte[] __fieldRead1808_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1808_9(byte[] a0, int a1, byte[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1180800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1180802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f753a0ae3c32c3f8bd25(net.minecraft.world.chunk.Chunk a0, byte[] a1, int a2, boolean a3) throws E;
private static final class __SourceHandler_f753a0ae3c32c3f8bd25 {

public static void f900111(net.minecraft.world.chunk.Chunk receiver, byte[] p0, int p1, boolean p2) throws Throwable {
    int forestValue900111_16_0;
    int forestValue900111_18_0;
    moom.Fs forestValue900111_58_0;
    int forestValue900111_106_0;
    moom.Fs[] forestValue900111_117_0;
    int forestValue900111_117_1;
    int forestValue900111_123_0;
    moom.Fs forestValue900111_148_0;
    int forestValue900111_169_0;
    moom.Fs forestValue900111_198_0;
    int forestValue900111_219_0;
    int forestValue900111_238_0;
    net.minecraft.world.chunk.Chunk forestValue900111_274_0;
    java.lang.String spill900111_0;
    boolean spill900111_1;
    int spill900111_2;
    moom.Fs spill900111_3;
    moom.Fs[] spill900111_4;
    int spill900111_5;
    int spill900111_6;
    moom.Fs spill900111_7;
    int spill900111_8;
    moom.Fs spill900111_9;
    net.minecraft.world.chunk.Chunk spill900111_10;
    long life4_3;
    int life7_6;
    java.lang.String life6_7;
    int life8_23;
    int life9_25;
    char[] life10_77;
    int life11_79;
    int life9_158;
    moom.Fo life10_194;
    int life9_224;
    moom.Fo life10_260;
    int life9_303;
    int life9_307;
    java.util.Iterator life9_356;
    net.minecraft.tileentity.TileEntity life10_365;
    forest_join_289: {
    forest_join_274: {
    forest_join_265: {
    forest_join_238: {
    forest_join_237: {
    forest_join_219: {
    forest_join_218: {
    forest_join_169: {
    forest_join_168: {
    forest_join_123: {
    forest_join_122: {
    forest_join_18: {
    forest_join_17: {
    forest_join_16: {
    life4_3 = (__fieldRead900111_0() ^ 103460167445304L);
    spill900111_0 = __call900111_1();
    life7_6 = 0;
    life6_7 = spill900111_0;
    spill900111_1 = __call900111_4(__fieldRead900111_3(__fieldRead900111_2(receiver)));
    if (!((life6_7 == null))) {
        forestValue900111_16_0 = __integerCategory900111_5(spill900111_1);
        break forest_join_16;
    }
    if (!((!spill900111_1))) {
        break forest_join_17;
    }
    forestValue900111_16_0 = 1;
    }
    forestValue900111_18_0 = forestValue900111_16_0;
    break forest_join_18;
    }
    forestValue900111_18_0 = 0;
    }
    life8_23 = forestValue900111_18_0;
    life9_25 = 0;
    forest_cycle_21: while (true) {
    forest_join_120: {
    forest_join_119: {
    forest_join_117: {
    forest_join_106: {
    forest_join_105: {
    forest_join_103: {
    forest_join_58: {
    forest_join_54: {
    if (!((life9_25 < (__fieldRead900111_6(receiver)).length))) {
        break forest_join_122;
    }
    spill900111_2 = (p1 & (1 << life9_25));
    if (!((life6_7 == null))) {
        forestValue900111_123_0 = spill900111_2;
        break forest_join_123;
    }
    if (!((life6_7 == null))) {
        forestValue900111_106_0 = spill900111_2;
        break forest_join_106;
    }
    if (!((spill900111_2 != 0))) {
        break forest_join_105;
    }
    spill900111_3 = (__fieldRead900111_7(receiver))[life9_25];
    if (!((life6_7 == null))) {
        forestValue900111_58_0 = spill900111_3;
        break forest_join_58;
    }
    if (!((spill900111_3 == null))) {
        break forest_join_54;
    }
    (__fieldRead900111_8(receiver))[life9_25] = new moom.Fs((life9_25 << 4), __integerCategory900111_9(life8_23));
    }
    forestValue900111_58_0 = (__fieldRead900111_10(receiver))[life9_25];
    }
    life10_77 = __call900111_11(forestValue900111_58_0);
    life11_79 = 0;
    forest_cycle_62: while (true) {
    if (!((life11_79 < (life10_77).length))) {
        break forest_join_103;
    }
    (life10_77)[life11_79] = ((char) ((((p0)[(life7_6 + 1)] & __invokedynamic900111_12(9073, (6926336852337400947L ^ life4_3))) << __invokedynamic900111_13(766, (5305434603940363762L ^ life4_3))) | ((p0)[life7_6] & __invokedynamic900111_14(9073, (6926336852337400947L ^ life4_3)))));
    life7_6 += 2;
    life11_79 += 1;
    if (!((life6_7 == null))) {
        break forest_join_120;
    }
    if (!((life6_7 != null))) {
        continue forest_cycle_62;
    }
    break forest_cycle_62;
    }
    }
    if (!((life6_7 != null))) {
        break forest_join_119;
    }
    }
    forestValue900111_106_0 = __integerCategory900111_15(p2);
    }
    if (!((forestValue900111_106_0 != 0))) {
        break forest_join_119;
    }
    spill900111_4 = __fieldRead900111_16(receiver);
    spill900111_5 = life9_25;
    if (!((life6_7 == null))) {
        forestValue900111_117_0 = spill900111_4;
        forestValue900111_117_1 = spill900111_5;
        break forest_join_117;
    }
    if (!(((spill900111_4)[spill900111_5] != null))) {
        break forest_join_119;
    }
    forestValue900111_117_0 = __fieldRead900111_17(receiver);
    forestValue900111_117_1 = life9_25;
    }
    (forestValue900111_117_0)[forestValue900111_117_1] = null;
    }
    life9_25 += 1;
    }
    if (!((life6_7 != null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    }
    forestValue900111_123_0 = 0;
    }
    life9_158 = forestValue900111_123_0;
    forest_cycle_124: while (true) {
    forest_join_165: {
    forest_join_148: {
    if (!((life9_158 < (__fieldRead900111_18(receiver)).length))) {
        break forest_join_168;
    }
    spill900111_6 = (p1 & (1 << life9_158));
    if (!((life6_7 == null))) {
        forestValue900111_169_0 = spill900111_6;
        break forest_join_169;
    }
    if (!((spill900111_6 != 0))) {
        break forest_join_165;
    }
    spill900111_7 = (__fieldRead900111_19(receiver))[life9_158];
    if (!((life6_7 == null))) {
        forestValue900111_148_0 = spill900111_7;
        break forest_join_148;
    }
    if (!((spill900111_7 != null))) {
        break forest_join_165;
    }
    forestValue900111_148_0 = (__fieldRead900111_20(receiver))[life9_158];
    }
    life10_194 = __call900111_21(forestValue900111_148_0);
    __call900111_24(p0, life7_6, __call900111_22(life10_194), 0, (__call900111_23(life10_194)).length);
    life7_6 = (life7_6 + (__call900111_25(life10_194)).length);
    }
    life9_158 += 1;
    if (!((life6_7 != null))) {
        continue forest_cycle_124;
    }
    break forest_cycle_124;
    }
    }
    forestValue900111_169_0 = life8_23;
    }
    if (!((life6_7 == null))) {
        forestValue900111_219_0 = forestValue900111_169_0;
        break forest_join_219;
    }
    if (!((forestValue900111_169_0 != 0))) {
        break forest_join_218;
    }
    life9_224 = 0;
    forest_cycle_174: while (true) {
    forest_join_215: {
    forest_join_198: {
    if (!((life9_224 < (__fieldRead900111_26(receiver)).length))) {
        break forest_join_218;
    }
    spill900111_8 = (p1 & (1 << life9_224));
    if (!((life6_7 == null))) {
        forestValue900111_219_0 = spill900111_8;
        break forest_join_219;
    }
    if (!((spill900111_8 != 0))) {
        break forest_join_215;
    }
    spill900111_9 = (__fieldRead900111_27(receiver))[life9_224];
    if (!((life6_7 == null))) {
        forestValue900111_198_0 = spill900111_9;
        break forest_join_198;
    }
    if (!((spill900111_9 != null))) {
        break forest_join_215;
    }
    forestValue900111_198_0 = (__fieldRead900111_28(receiver))[life9_224];
    }
    life10_260 = __call900111_29(forestValue900111_198_0);
    __call900111_32(p0, life7_6, __call900111_30(life10_260), 0, (__call900111_31(life10_260)).length);
    life7_6 = (life7_6 + (__call900111_33(life10_260)).length);
    }
    life9_224 += 1;
    if (!((life6_7 != null))) {
        continue forest_cycle_174;
    }
    break forest_cycle_174;
    }
    }
    forestValue900111_219_0 = __integerCategory900111_34(p2);
    }
    if (!((life6_7 == null))) {
        forestValue900111_238_0 = forestValue900111_219_0;
        break forest_join_238;
    }
    if (!((forestValue900111_219_0 != 0))) {
        break forest_join_237;
    }
    __call900111_37(p0, life7_6, __fieldRead900111_35(receiver), 0, (__fieldRead900111_36(receiver)).length);
    life9_303 = (life7_6 + (__fieldRead900111_38(receiver)).length);
    life9_303 = life9_303;
    }
    forestValue900111_238_0 = 0;
    }
    life9_307 = forestValue900111_238_0;
    forest_cycle_239: while (true) {
    forest_join_262: {
    if (!((life9_307 < (__fieldRead900111_39(receiver)).length))) {
        break forest_join_265;
    }
    spill900111_10 = receiver;
    if (!((life6_7 == null))) {
        forestValue900111_274_0 = spill900111_10;
        break forest_join_274;
    }
    if (!(((__fieldRead900111_40(spill900111_10))[life9_307] != null))) {
        break forest_join_262;
    }
    if (!(((p1 & (1 << life9_307)) != 0))) {
        break forest_join_262;
    }
    __call900111_42((__fieldRead900111_41(receiver))[life9_307]);
    }
    life9_307 += 1;
    if (!((life6_7 != null))) {
        continue forest_cycle_239;
    }
    break forest_cycle_239;
    }
    }
    __fieldWrite900111_43(receiver, 1);
    __fieldWrite900111_44(receiver, 1);
    __call900111_45(receiver);
    forestValue900111_274_0 = receiver;
    }
    life9_356 = __call900111_48(__call900111_47(__fieldRead900111_46(forestValue900111_274_0)));
    forest_cycle_278: while (true) {
    if (!(__call900111_49(life9_356))) {
        break forest_join_289;
    }
    life10_365 = __cast900111_51(__call900111_50(life9_356));
    __call900111_52(life10_365);
    if (!((life6_7 != null))) {
        continue forest_cycle_278;
    }
    break forest_cycle_278;
    }
    }
    return;
}
public static void h900111_0(moom.Oo p0) throws Throwable {
    throw __call93011100_0(p0);
}
public static void h900111_1(moom.Oo p0) throws Throwable {
    throw __call93011101_0(p0);
}
public static void h900111_2(moom.Oo p0) throws Throwable {
    throw __call93011102_0(p0);
}
public static void h900111_3(moom.Oo p0) throws Throwable {
    throw __call93011103_0(p0);
}
public static void h900111_4(moom.Oo p0) throws Throwable {
    throw __call93011104_0(p0);
}
public static void h900111_5(moom.Oo p0) throws Throwable {
    throw __call93011105_0(p0);
}
public static void h900111_6(moom.Oo p0) throws Throwable {
    throw __call93011106_0(p0);
}
public static void h900111_7(moom.Oo p0) throws Throwable {
    throw __call93011107_0(p0);
}
public static void h900111_8(moom.Oo p0) throws Throwable {
    throw __call93011108_0(p0);
}
public static void h900111_9(moom.Oo p0) throws Throwable {
    throw __call93011109_0(p0);
}
public static void h900111_10(moom.Oo p0) throws Throwable {
    throw __call93011110_0(p0);
}
public static void h900111_11(moom.Oo p0) throws Throwable {
    throw __call93011111_0(p0);
}
public static void h900111_12(moom.Oo p0) throws Throwable {
    throw __call93011112_0(p0);
}
public static void h900111_13(moom.Oo p0) throws Throwable {
    throw __call93011113_0(p0);
}
public static void h900111_14(moom.Oo p0) throws Throwable {
    throw __call93011114_0(p0);
}
public static void h900111_15(moom.Oo p0) throws Throwable {
    throw __call93011115_0(p0);
}
public static void h900111_16(moom.Oo p0) throws Throwable {
    throw __call93011116_0(p0);
}
public static void h900111_17(moom.Oo p0) throws Throwable {
    throw __call93011117_0(p0);
}
public static void h900111_18(moom.Oo p0) throws Throwable {
    throw __call93011118_0(p0);
}
public static void h900111_19(moom.Oo p0) throws Throwable {
    throw __call93011119_0(p0);
}
public static void h900111_20(moom.Oo p0) throws Throwable {
    throw __call93011120_0(p0);
}
public static void h900111_21(moom.Oo p0) throws Throwable {
    throw __call93011121_0(p0);
}
public static void h900111_22(moom.Oo p0) throws Throwable {
    throw __call93011122_0(p0);
}
public static void h900111_23(moom.Oo p0) throws Throwable {
    throw __call93011123_0(p0);
}
private static native long __fieldRead900111_0() throws Throwable;
private static native java.lang.String __call900111_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead900111_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead900111_3(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call900111_4(moom.EA a0) throws Throwable;
private static native int __integerCategory900111_5(boolean value) throws Throwable;
private static native moom.Fs[] __fieldRead900111_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __integerCategory900111_9(int value) throws Throwable;
private static native moom.Fs[] __fieldRead900111_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native char[] __call900111_11(moom.Fs a0) throws Throwable;
private static native int __invokedynamic900111_12(int a0, long a1) throws Throwable;
private static native int __invokedynamic900111_13(int a0, long a1) throws Throwable;
private static native int __invokedynamic900111_14(int a0, long a1) throws Throwable;
private static native int __integerCategory900111_15(boolean value) throws Throwable;
private static native moom.Fs[] __fieldRead900111_16(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_18(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_19(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_20(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fo __call900111_21(moom.Fs a0) throws Throwable;
private static native byte[] __call900111_22(moom.Fo a0) throws Throwable;
private static native byte[] __call900111_23(moom.Fo a0) throws Throwable;
private static native void __call900111_24(byte[] a0, int a1, byte[] a2, int a3, int a4) throws Throwable;
private static native byte[] __call900111_25(moom.Fo a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_27(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_28(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fo __call900111_29(moom.Fs a0) throws Throwable;
private static native byte[] __call900111_30(moom.Fo a0) throws Throwable;
private static native byte[] __call900111_31(moom.Fo a0) throws Throwable;
private static native void __call900111_32(byte[] a0, int a1, byte[] a2, int a3, int a4) throws Throwable;
private static native byte[] __call900111_33(moom.Fo a0) throws Throwable;
private static native int __integerCategory900111_34(boolean value) throws Throwable;
private static native byte[] __fieldRead900111_35(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native byte[] __fieldRead900111_36(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call900111_37(byte[] a0, int a1, byte[] a2, int a3, int a4) throws Throwable;
private static native byte[] __fieldRead900111_38(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_39(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_40(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead900111_41(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call900111_42(moom.Fs a0) throws Throwable;
private static native void __fieldWrite900111_43(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native void __fieldWrite900111_44(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native void __call900111_45(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Map __fieldRead900111_46(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Collection __call900111_47(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call900111_48(java.util.Collection a0) throws Throwable;
private static native boolean __call900111_49(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call900111_50(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast900111_51(java.lang.Object a0) throws Throwable;
private static native void __call900111_52(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Throwable __call93011100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011102_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011103_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011104_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011105_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011106_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011107_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011108_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011109_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011110_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011111_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011112_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011113_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011114_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011115_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011116_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011117_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011118_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011119_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011120_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011121_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011122_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call93011123_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_10e62c1414c059aa79da(net.minecraft.world.chunk.Chunk a0, int[] a1) throws E;
private static final class __SourceHandler_10e62c1414c059aa79da {

public static void f1810(net.minecraft.world.chunk.Chunk receiver, int[] p0) throws Throwable {
    int[] forwardValue1810_25_0;
    int[] spill1810_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_33: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (__fieldRead1810_0() ^ 12796147570088L);
    life4_5 = __call1810_1();
    spill1810_0 = __fieldRead1810_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue1810_25_0 = spill1810_0;
        break forward_join_25;
    }
    if (!(((spill1810_0).length != (p0).length))) {
        break forward_join_24;
    }
    __call1810_6(__fieldRead1810_3(), __invokedynamic1810_5((p0).length, (__fieldRead1810_4(receiver)).length));
    if (!((life4_5 != null))) {
        break forward_join_33;
    }
    }
    forwardValue1810_25_0 = p0;
    }
    __call1810_9(forwardValue1810_25_0, 0, __fieldRead1810_7(receiver), 0, (__fieldRead1810_8(receiver)).length);
    }
    return;
}
public static void h1810_0(moom.Oo p0) throws Throwable {
    throw __call1181000_0(p0);
}
public static void h1810_1(moom.Oo p0) throws Throwable {
    throw __call1181001_0(p0);
}
public static void h1810_2(moom.Oo p0) throws Throwable {
    throw __call1181002_0(p0);
}
private static native long __fieldRead1810_0() throws Throwable;
private static native java.lang.String __call1810_1() throws Throwable;
private static native int[] __fieldRead1810_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1810_3() throws Throwable;
private static native int[] __fieldRead1810_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.String __invokedynamic1810_5(int a0, int a1) throws Throwable;
private static native void __call1810_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native int[] __fieldRead1810_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int[] __fieldRead1810_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1810_9(int[] a0, int a1, int[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1181000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_535a5df82a6a0474300f(net.minecraft.world.chunk.Chunk a0, moom.Fs[] a1) throws E;
private static final class __SourceHandler_535a5df82a6a0474300f {

public static void f1811(net.minecraft.world.chunk.Chunk receiver, moom.Fs[] p0) throws Throwable {
    moom.Fs[] forwardValue1811_25_0;
    moom.Fs[] spill1811_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_33: {
    forward_join_25: {
    forward_join_24: {
    life2_3 = (__fieldRead1811_0() ^ 79965647789242L);
    life4_5 = __call1811_1();
    spill1811_0 = __fieldRead1811_2(receiver);
    if (!((life4_5 == null))) {
        forwardValue1811_25_0 = spill1811_0;
        break forward_join_25;
    }
    if (!(((spill1811_0).length != (p0).length))) {
        break forward_join_24;
    }
    __call1811_6(__fieldRead1811_3(), __invokedynamic1811_5((p0).length, (__fieldRead1811_4(receiver)).length));
    if (!((life4_5 != null))) {
        break forward_join_33;
    }
    }
    forwardValue1811_25_0 = p0;
    }
    __call1811_9(forwardValue1811_25_0, 0, __fieldRead1811_7(receiver), 0, (__fieldRead1811_8(receiver)).length);
    }
    return;
}
public static void h1811_0(moom.Oo p0) throws Throwable {
    throw __call1181100_0(p0);
}
public static void h1811_1(moom.Oo p0) throws Throwable {
    throw __call1181101_0(p0);
}
public static void h1811_2(moom.Oo p0) throws Throwable {
    throw __call1181102_0(p0);
}
private static native long __fieldRead1811_0() throws Throwable;
private static native java.lang.String __call1811_1() throws Throwable;
private static native moom.Fs[] __fieldRead1811_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native org.apache.logging.log4j.Logger __fieldRead1811_3() throws Throwable;
private static native moom.Fs[] __fieldRead1811_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.String __invokedynamic1811_5(int a0, int a1) throws Throwable;
private static native void __call1811_6(org.apache.logging.log4j.Logger a0, java.lang.String a1) throws Throwable;
private static native moom.Fs[] __fieldRead1811_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead1811_8(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1811_9(moom.Fs[] a0, int a1, moom.Fs[] a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1181100_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181101_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181102_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.tileentity.TileEntity __sourceHandlerCall_f6d4f180c473d6eaaa11(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws E;
private static final class __SourceHandler_f6d4f180c473d6eaaa11 {

public static net.minecraft.tileentity.TileEntity f1812(net.minecraft.world.chunk.Chunk receiver, moom.DT p0) throws Throwable {
    net.minecraft.block.Block forwardValue1812_18_0;
    net.minecraft.tileentity.TileEntity forwardValue1812_25_0;
    java.lang.String spill1812_0;
    net.minecraft.block.Block spill1812_1;
    long life2_3;
    net.minecraft.block.Block life5_8;
    java.lang.String life4_9;
    forward_join_25: {
    forward_join_18: {
    forward_join_17: {
    life2_3 = (__fieldRead1812_0() ^ 56187618643991L);
    spill1812_0 = __call1812_1();
    life5_8 = __call1812_2(receiver, p0);
    life4_9 = spill1812_0;
    spill1812_1 = life5_8;
    if (!((life4_9 == null))) {
        forwardValue1812_18_0 = spill1812_1;
        break forward_join_18;
    }
    if (!((!__call1812_3(spill1812_1)))) {
        break forward_join_17;
    }
    forwardValue1812_25_0 = null;
    break forward_join_25;
    }
    forwardValue1812_18_0 = life5_8;
    }
    forwardValue1812_25_0 = __call1812_7(__cast1812_4(forwardValue1812_18_0), __fieldRead1812_5(receiver), __call1812_6(receiver, p0));
    }
    return forwardValue1812_25_0;
}
public static void h1812_0(moom.Oo p0) throws Throwable {
    throw __call1181200_0(p0);
}
public static void h1812_1(moom.Oo p0) throws Throwable {
    throw __call1181201_0(p0);
}
private static native long __fieldRead1812_0() throws Throwable;
private static native java.lang.String __call1812_1() throws Throwable;
private static native net.minecraft.block.Block __call1812_2(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native boolean __call1812_3(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.block.ITileEntityProvider __cast1812_4(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1812_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1812_6(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1812_7(net.minecraft.block.ITileEntityProvider a0, net.minecraft.world.World a1, int a2) throws Throwable;
private static native java.lang.Throwable __call1181200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181201_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4e1150ae8a9c25f62df7(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws E;
private static final class __SourceHandler_4e1150ae8a9c25f62df7 {

public static boolean f1813(net.minecraft.world.chunk.Chunk receiver, int p0, int p1) throws Throwable {
    int forwardValue1813_17_0;
    int forwardValue1813_17_1;
    int forwardValue1813_19_0;
    int forwardValue1813_21_0;
    int spill1813_0;
    int spill1813_1;
    int spill1813_2;
    long life3_3;
    java.lang.String life5_5;
    forward_join_21: {
    forward_join_20: {
    forward_join_19: {
    forward_join_17: {
    life3_3 = (__fieldRead1813_0() ^ 17621771963067L);
    life5_5 = __call1813_1();
    spill1813_0 = p0;
    spill1813_1 = __fieldRead1813_2(receiver);
    if (!((life5_5 == null))) {
        forwardValue1813_17_0 = spill1813_0;
        forwardValue1813_17_1 = spill1813_1;
        break forward_join_17;
    }
    if (!((spill1813_0 == spill1813_1))) {
        break forward_join_20;
    }
    spill1813_2 = p1;
    if (!((life5_5 == null))) {
        forwardValue1813_19_0 = spill1813_2;
        break forward_join_19;
    }
    forwardValue1813_17_0 = spill1813_2;
    forwardValue1813_17_1 = __fieldRead1813_3(receiver);
    }
    if (!((forwardValue1813_17_0 == forwardValue1813_17_1))) {
        break forward_join_20;
    }
    forwardValue1813_19_0 = 1;
    }
    forwardValue1813_21_0 = forwardValue1813_19_0;
    break forward_join_21;
    }
    forwardValue1813_21_0 = 0;
    }
    return __integerCategory1813_4(forwardValue1813_21_0);
}
public static void h1813_0(moom.Oo p0) throws Throwable {
    throw __call1181300_0(p0);
}
public static void h1813_1(moom.Oo p0) throws Throwable {
    throw __call1181301_0(p0);
}
public static void h1813_2(moom.Oo p0) throws Throwable {
    throw __call1181302_0(p0);
}
private static native long __fieldRead1813_0() throws Throwable;
private static native java.lang.String __call1813_1() throws Throwable;
private static native int __fieldRead1813_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1813_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __integerCategory1813_4(int value) throws Throwable;
private static native java.lang.Throwable __call1181300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181302_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_4399e68ba65a68b023d2(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws E;
private static final class __SourceHandler_4399e68ba65a68b023d2 {

public static boolean f1814(net.minecraft.world.chunk.Chunk receiver, moom.DT p0) throws Throwable {
    int forwardValue1814_40_0;
    int forwardValue1814_42_0;
    java.lang.String spill1814_0;
    int spill1814_1;
    long life2_3;
    int life5_13;
    java.lang.String life4_14;
    int life6_17;
    int life7_26;
    forward_join_42: {
    forward_join_41: {
    forward_join_40: {
    life2_3 = (__fieldRead1814_0() ^ 101552346729390L);
    spill1814_0 = __call1814_1();
    life5_13 = (__call1814_2(p0) & __invokedynamic1814_3(5269, (2547920539923368708L ^ life2_3)));
    life4_14 = spill1814_0;
    life6_17 = __call1814_4(p0);
    life7_26 = (__call1814_5(p0) & __invokedynamic1814_6(5269, (2547920539923368708L ^ life2_3)));
    spill1814_1 = life6_17;
    if (!((life4_14 == null))) {
        forwardValue1814_40_0 = spill1814_1;
        break forward_join_40;
    }
    if (!((spill1814_1 >= (__fieldRead1814_7(receiver))[((life7_26 << 4) | life5_13)]))) {
        break forward_join_41;
    }
    forwardValue1814_40_0 = 1;
    }
    forwardValue1814_42_0 = forwardValue1814_40_0;
    break forward_join_42;
    }
    forwardValue1814_42_0 = 0;
    }
    return __integerCategory1814_8(forwardValue1814_42_0);
}
public static void h1814_0(moom.Oo p0) throws Throwable {
    throw __call1181400_0(p0);
}
public static void h1814_1(moom.Oo p0) throws Throwable {
    throw __call1181401_0(p0);
}
private static native long __fieldRead1814_0() throws Throwable;
private static native java.lang.String __call1814_1() throws Throwable;
private static native int __call1814_2(moom.DT a0) throws Throwable;
private static native int __invokedynamic1814_3(int a0, long a1) throws Throwable;
private static native int __call1814_4(moom.DT a0) throws Throwable;
private static native int __call1814_5(moom.DT a0) throws Throwable;
private static native int __invokedynamic1814_6(int a0, long a1) throws Throwable;
private static native int[] __fieldRead1814_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __integerCategory1814_8(int value) throws Throwable;
private static native java.lang.Throwable __call1181400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181401_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_223492bd4a8201b34008(net.minecraft.world.chunk.Chunk a0, boolean a1) throws E;
private static final class __SourceHandler_223492bd4a8201b34008 {

public static boolean f639(net.minecraft.world.chunk.Chunk receiver, boolean p0) throws Throwable {
    int forwardValue639_26_0;
    int forwardValue639_30_0;
    int forwardValue639_33_0;
    int forwardValue639_55_0;
    boolean spill639_0;
    boolean spill639_1;
    int spill639_2;
    int spill639_3;
    long life2_3;
    java.lang.String life4_5;
    forward_join_55: {
    forward_join_53: {
    forward_join_33: {
    forward_join_31: {
    forward_join_30: {
    forward_join_29: {
    forward_join_26: {
    forward_join_24: {
    life2_3 = (__fieldRead639_0() ^ 92165279649899L);
    life4_5 = __call639_1();
    spill639_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue639_33_0 = __integerCategory639_2(spill639_0);
        break forward_join_33;
    }
    if (!(spill639_0)) {
        break forward_join_31;
    }
    spill639_1 = __fieldRead639_3(receiver);
    if (!((life4_5 == null))) {
        forwardValue639_26_0 = __integerCategory639_4(spill639_1);
        break forward_join_26;
    }
    if (!(spill639_1)) {
        break forward_join_24;
    }
    spill639_2 = __numericCompare639_8(__call639_6(__fieldRead639_5(receiver)), __fieldRead639_7(receiver));
    if (!((life4_5 == null))) {
        forwardValue639_30_0 = spill639_2;
        break forward_join_30;
    }
    if (!((spill639_2 == 0))) {
        break forward_join_29;
    }
    }
    forwardValue639_26_0 = __integerCategory639_10(__fieldRead639_9(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue639_55_0 = forwardValue639_26_0;
        break forward_join_55;
    }
    if (!((forwardValue639_26_0 != 0))) {
        break forward_join_53;
    }
    }
    forwardValue639_30_0 = 1;
    }
    return __integerCategory639_11(forwardValue639_30_0);
    }
    forwardValue639_33_0 = __integerCategory639_13(__fieldRead639_12(receiver));
    }
    if (!((life4_5 == null))) {
        forwardValue639_55_0 = forwardValue639_33_0;
        break forward_join_55;
    }
    if (!((forwardValue639_33_0 != 0))) {
        break forward_join_53;
    }
    spill639_3 = __numericCompare639_18(__call639_15(__fieldRead639_14(receiver)), (__fieldRead639_16(receiver) + __invokedynamic639_17(24008, (3195012510350879897L ^ life2_3))));
    if (!((life4_5 == null))) {
        forwardValue639_55_0 = spill639_3;
        break forward_join_55;
    }
    if (!((spill639_3 >= 0))) {
        break forward_join_53;
    }
    return __integerCategory639_19(1);
    }
    forwardValue639_55_0 = __integerCategory639_21(__fieldRead639_20(receiver));
    }
    return __integerCategory639_22(forwardValue639_55_0);
}
public static boolean h639_0(moom.Oo p0) throws Throwable {
    throw __call2063900_0(p0);
}
public static boolean h639_1(moom.Oo p0) throws Throwable {
    throw __call2063901_0(p0);
}
public static boolean h639_2(moom.Oo p0) throws Throwable {
    throw __call2063902_0(p0);
}
public static boolean h639_3(moom.Oo p0) throws Throwable {
    throw __call2063903_0(p0);
}
public static boolean h639_4(moom.Oo p0) throws Throwable {
    throw __call2063904_0(p0);
}
public static boolean h639_5(moom.Oo p0) throws Throwable {
    throw __call2063905_0(p0);
}
public static boolean h639_6(moom.Oo p0) throws Throwable {
    throw __call2063906_0(p0);
}
public static boolean h639_7(moom.Oo p0) throws Throwable {
    throw __call2063907_0(p0);
}
public static boolean h639_8(moom.Oo p0) throws Throwable {
    throw __call2063908_0(p0);
}
public static boolean h639_9(moom.Oo p0) throws Throwable {
    throw __call2063909_0(p0);
}
public static boolean h639_10(moom.Oo p0) throws Throwable {
    throw __call2063910_0(p0);
}
private static native long __fieldRead639_0() throws Throwable;
private static native java.lang.String __call639_1() throws Throwable;
private static native int __integerCategory639_2(boolean value) throws Throwable;
private static native boolean __fieldRead639_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory639_4(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead639_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native long __call639_6(net.minecraft.world.World a0) throws Throwable;
private static native long __fieldRead639_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __numericCompare639_8(long a0, long a1) throws Throwable;
private static native boolean __fieldRead639_9(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory639_10(boolean value) throws Throwable;
private static native boolean __integerCategory639_11(int value) throws Throwable;
private static native boolean __fieldRead639_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory639_13(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead639_14(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native long __call639_15(net.minecraft.world.World a0) throws Throwable;
private static native long __fieldRead639_16(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native long __invokedynamic639_17(int a0, long a1) throws Throwable;
private static native int __numericCompare639_18(long a0, long a1) throws Throwable;
private static native boolean __integerCategory639_19(int value) throws Throwable;
private static native boolean __fieldRead639_20(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory639_21(boolean value) throws Throwable;
private static native boolean __integerCategory639_22(int value) throws Throwable;
private static native java.lang.Throwable __call2063900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063904_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063905_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063906_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063907_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063908_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063909_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call2063910_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> moom.DT __sourceHandlerCall_cb5cca18d9090e3da611(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws E;
private static final class __SourceHandler_cb5cca18d9090e3da611 {

public static moom.DT f1815(net.minecraft.world.chunk.Chunk receiver, moom.DT p0) throws Throwable {
    int lexicalValue1815_104_0;
    moom.DT lexicalValue1815_123_0;
    java.lang.String spill1815_0;
    moom.DT spill1815_1;
    boolean spill1815_2;
    boolean spill1815_3;
    long life2_3;
    int life5_12;
    int life6_22;
    int life7_28;
    moom.DT life8_40;
    java.lang.String life4_41;
    int life9_63;
    moom.DT life8_72;
    int life10_74;
    net.minecraft.block.Block life11_84;
    moom.fn life12_87;
    lexical_join_123: {
    lexical_join_112: {
    lexical_join_107: {
    life2_3 = (__fieldRead1815_0() ^ 98578151909788L);
    life5_12 = (__call1815_1(p0) & __invokedynamic1815_2(5269, (2547926672804047158L ^ life2_3)));
    spill1815_0 = __call1815_3();
    life6_22 = (__call1815_4(p0) & __invokedynamic1815_5(5269, (2547926672804047158L ^ life2_3)));
    life7_28 = (life5_12 | (life6_22 << 4));
    life8_40 = new moom.DT(__call1815_6(p0), (__fieldRead1815_7(receiver))[life7_28], __call1815_8(p0));
    life4_41 = spill1815_0;
    spill1815_1 = life8_40;
    if (!((life4_41 == null))) {
        lexicalValue1815_123_0 = spill1815_1;
        break lexical_join_123;
    }
    if (!((__call1815_9(spill1815_1) == __invokedynamic1815_10(2718, (2426942768789223221L ^ life2_3))))) {
        break lexical_join_112;
    }
    life9_63 = (__call1815_11(receiver) + __invokedynamic1815_12(5269, (2547926672804047158L ^ life2_3)));
    life8_72 = new moom.DT(__call1815_13(p0), life9_63, __call1815_14(p0));
    life10_74 = -1;
    lexical_cycle_72: while (true) {
    lexical_join_105: {
    lexical_join_104: {
    lexical_join_100: {
    if (!((__call1815_15(life8_72) > 0))) {
        break lexical_join_107;
    }
    if (!((life10_74 == -1))) {
        break lexical_join_107;
    }
    life11_84 = __call1815_16(receiver, life8_72);
    life12_87 = __call1815_17(life11_84);
    spill1815_2 = __call1815_18(life12_87);
    if (!((life4_41 == null))) {
        lexicalValue1815_104_0 = __integerCategory1815_19(spill1815_2);
        break lexical_join_104;
    }
    if (!((!spill1815_2))) {
        break lexical_join_100;
    }
    spill1815_3 = __call1815_20(life12_87);
    if (!((life4_41 == null))) {
        lexicalValue1815_104_0 = __integerCategory1815_21(spill1815_3);
        break lexical_join_104;
    }
    if (!((!spill1815_3))) {
        break lexical_join_100;
    }
    life8_72 = __call1815_22(life8_72);
    if (!((life4_41 != null))) {
        break lexical_join_105;
    }
    }
    lexicalValue1815_104_0 = (__call1815_23(life8_72) + 1);
    }
    life10_74 = lexicalValue1815_104_0;
    }
    if (!((life4_41 != null))) { continue lexical_cycle_72; }
    break lexical_cycle_72;
    }
    }
    (__fieldRead1815_24(receiver))[life7_28] = life10_74;
    }
    lexicalValue1815_123_0 = new moom.DT(__call1815_25(p0), (__fieldRead1815_26(receiver))[life7_28], __call1815_27(p0));
    }
    return lexicalValue1815_123_0;
}
public static void h1815_0(moom.Oo p0) throws Throwable {
    throw __call1181500_0(p0);
}
public static void h1815_1(moom.Oo p0) throws Throwable {
    throw __call1181501_0(p0);
}
public static void h1815_2(moom.Oo p0) throws Throwable {
    throw __call1181502_0(p0);
}
public static void h1815_3(moom.Oo p0) throws Throwable {
    throw __call1181503_0(p0);
}
public static void h1815_4(moom.Oo p0) throws Throwable {
    throw __call1181504_0(p0);
}
private static native long __fieldRead1815_0() throws Throwable;
private static native int __call1815_1(moom.DT a0) throws Throwable;
private static native int __invokedynamic1815_2(int a0, long a1) throws Throwable;
private static native java.lang.String __call1815_3() throws Throwable;
private static native int __call1815_4(moom.DT a0) throws Throwable;
private static native int __invokedynamic1815_5(int a0, long a1) throws Throwable;
private static native int __call1815_6(moom.DT a0) throws Throwable;
private static native int[] __fieldRead1815_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1815_8(moom.DT a0) throws Throwable;
private static native int __call1815_9(moom.DT a0) throws Throwable;
private static native int __invokedynamic1815_10(int a0, long a1) throws Throwable;
private static native int __call1815_11(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1815_12(int a0, long a1) throws Throwable;
private static native int __call1815_13(moom.DT a0) throws Throwable;
private static native int __call1815_14(moom.DT a0) throws Throwable;
private static native int __call1815_15(moom.DT a0) throws Throwable;
private static native net.minecraft.block.Block __call1815_16(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native moom.fn __call1815_17(net.minecraft.block.Block a0) throws Throwable;
private static native boolean __call1815_18(moom.fn a0) throws Throwable;
private static native int __integerCategory1815_19(boolean value) throws Throwable;
private static native boolean __call1815_20(moom.fn a0) throws Throwable;
private static native int __integerCategory1815_21(boolean value) throws Throwable;
private static native moom.DT __call1815_22(moom.DT a0) throws Throwable;
private static native int __call1815_23(moom.DT a0) throws Throwable;
private static native int[] __fieldRead1815_24(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1815_25(moom.DT a0) throws Throwable;
private static native int[] __fieldRead1815_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1815_27(moom.DT a0) throws Throwable;
private static native java.lang.Throwable __call1181500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181504_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_29cb1090906b6439f94d(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_29cb1090906b6439f94d {

public static void f1168(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    int forestValue1168_19_0;
    int forestValue1168_30_0;
    java.lang.String spill1168_0;
    int spill1168_1;
    int spill1168_2;
    long life1_3;
    int life4_7;
    java.lang.String life3_8;
    int life5_17;
    int life6_28;
    int life7_58;
    net.minecraft.block.Block life8_68;
    forest_join_108: {
    forest_join_105: {
    life1_3 = (__fieldRead1168_0() ^ 87591932937305L);
    spill1168_0 = __call1168_1();
    life4_7 = __call1168_2(receiver);
    life3_8 = spill1168_0;
    __fieldWrite1168_4(receiver, __invokedynamic1168_3(29936, (5328826829301015704L ^ life1_3)));
    life5_17 = 0;
    forest_cycle_18: while (true) {
    forest_join_102: {
    forestValue1168_19_0 = life5_17;
    forest_cycle_19: while (true) {
    if (!((forestValue1168_19_0 < __invokedynamic1168_5(9267, (2224703751022556224L ^ life1_3))))) {
        break forest_join_105;
    }
    if (!((life3_8 == null))) {
        break forest_join_108;
    }
    life6_28 = 0;
    forest_cycle_29: while (true) {
    forest_join_100: {
    forest_join_99: {
    forestValue1168_30_0 = life6_28;
    forest_cycle_30: while (true) {
    if (!((forestValue1168_30_0 < __invokedynamic1168_6(9267, (2224703751022556224L ^ life1_3))))) {
        break forest_join_102;
    }
    (__fieldRead1168_7(receiver))[(life5_17 + (life6_28 << 4))] = __invokedynamic1168_8(2718, (2426927366674848496L ^ life1_3));
    spill1168_1 = (life4_7 + __invokedynamic1168_9(9267, (2224703751022556224L ^ life1_3)));
    if (!((life3_8 == null))) {
        forestValue1168_19_0 = spill1168_1;
        continue forest_cycle_19;
    }
    life7_58 = spill1168_1;
    forest_cycle_59: while (true) {
    forest_join_97: {
    forest_join_96: {
    if (!((life7_58 > 0))) {
        break forest_join_99;
    }
    life8_68 = __call1168_10(receiver, life5_17, (life7_58 - 1), life6_28);
    if (!((life3_8 == null))) {
        break forest_join_97;
    }
    spill1168_2 = __call1168_11(life8_68);
    if (!((life3_8 == null))) {
        forestValue1168_30_0 = spill1168_2;
        continue forest_cycle_30;
    }
    if (!((spill1168_2 != 0))) {
        break forest_join_96;
    }
    (__fieldRead1168_12(receiver))[((life6_28 << 4) | life5_17)] = life7_58;
    if (!((life3_8 == null))) {
        break forest_join_100;
    }
    if (!((life7_58 < __fieldRead1168_13(receiver)))) {
        break forest_join_99;
    }
    __fieldWrite1168_14(receiver, life7_58);
    if (!((life3_8 != null))) {
        break forest_join_99;
    }
    }
    life7_58 += -1;
    }
    if (!((life3_8 != null))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    break forest_cycle_30;
    }
    }
    life6_28 += 1;
    }
    if (!((life3_8 != null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    break forest_cycle_19;
    }
    }
    life5_17 += 1;
    if (!((life3_8 != null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    __fieldWrite1168_15(receiver, 1);
    }
    return;
}
public static void h1168_0(moom.Oo p0) throws Throwable {
    throw __call3116800_0(p0);
}
public static void h1168_1(moom.Oo p0) throws Throwable {
    throw __call3116801_0(p0);
}
public static void h1168_2(moom.Oo p0) throws Throwable {
    throw __call3116802_0(p0);
}
public static void h1168_3(moom.Oo p0) throws Throwable {
    throw __call3116803_0(p0);
}
public static void h1168_4(moom.Oo p0) throws Throwable {
    throw __call3116804_0(p0);
}
private static native long __fieldRead1168_0() throws Throwable;
private static native java.lang.String __call1168_1() throws Throwable;
private static native int __call1168_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1168_3(int a0, long a1) throws Throwable;
private static native void __fieldWrite1168_4(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native int __invokedynamic1168_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1168_6(int a0, long a1) throws Throwable;
private static native int[] __fieldRead1168_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1168_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1168_9(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call1168_10(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native int __call1168_11(net.minecraft.block.Block a0) throws Throwable;
private static native int[] __fieldRead1168_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1168_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite1168_14(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native void __fieldWrite1168_15(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3116800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116802_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116803_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116804_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b66c734f7ac51e6fa726(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_b66c734f7ac51e6fa726 {

public static void f1817(net.minecraft.world.chunk.Chunk receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue1817_34_0;
    int forwardValue1817_34_1;
    java.lang.String spill1817_0;
    int spill1817_1;
    int spill1817_2;
    long life4_3;
    int life7_15;
    java.lang.String life6_16;
    forward_join_43: {
    forward_join_34: {
    forward_join_32: {
    life4_3 = (__fieldRead1817_0() ^ 60566374680568L);
    spill1817_0 = __call1817_1();
    life7_15 = __call1817_4(__call1817_3(__fieldRead1817_2(receiver), new moom.DT(p0, 0, p1)));
    life6_16 = spill1817_0;
    spill1817_1 = life7_15;
    spill1817_2 = p2;
    if (!((life6_16 == null))) {
        forwardValue1817_34_0 = spill1817_1;
        forwardValue1817_34_1 = spill1817_2;
        break forward_join_34;
    }
    if (!((spill1817_1 > spill1817_2))) {
        break forward_join_32;
    }
    __call1817_5(receiver, p0, p1, p2, (life7_15 + 1));
    if (!((life6_16 != null))) {
        break forward_join_43;
    }
    }
    forwardValue1817_34_0 = life7_15;
    forwardValue1817_34_1 = p2;
    }
    if (!((forwardValue1817_34_0 < forwardValue1817_34_1))) {
        break forward_join_43;
    }
    __call1817_6(receiver, p0, p1, life7_15, (p2 + 1));
    }
    return;
}
public static void h1817_0(moom.Oo p0) throws Throwable {
    throw __call1181700_0(p0);
}
public static void h1817_1(moom.Oo p0) throws Throwable {
    throw __call1181701_0(p0);
}
public static void h1817_2(moom.Oo p0) throws Throwable {
    throw __call1181702_0(p0);
}
public static void h1817_3(moom.Oo p0) throws Throwable {
    throw __call1181703_0(p0);
}
private static native long __fieldRead1817_0() throws Throwable;
private static native java.lang.String __call1817_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead1817_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.DT __call1817_3(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __call1817_4(moom.DT a0) throws Throwable;
private static native void __call1817_5(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1817_6(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native java.lang.Throwable __call1181700_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181701_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181702_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181703_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_b1c9a6d255def766a591(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws E;
private static final class __SourceHandler_b1c9a6d255def766a591 {

public static void f1818(net.minecraft.world.chunk.Chunk receiver, moom.DT p0) throws Throwable {
    java.lang.Object forwardValue1818_15_0;
    net.minecraft.tileentity.TileEntity forwardValue1818_22_0;
    net.minecraft.world.chunk.Chunk spill1818_0;
    net.minecraft.tileentity.TileEntity spill1818_1;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.tileentity.TileEntity life5_22;
    forward_join_23: {
    forward_join_22: {
    forward_join_15: {
    life2_3 = (__fieldRead1818_0() ^ 110006020550703L);
    life4_5 = __call1818_1();
    spill1818_0 = receiver;
    if (!((life4_5 == null))) {
        forwardValue1818_15_0 = spill1818_0;
        break forward_join_15;
    }
    if (!(__fieldRead1818_2(spill1818_0))) {
        break forward_join_23;
    }
    forwardValue1818_15_0 = __call1818_4(__fieldRead1818_3(receiver), p0);
    }
    life5_22 = __cast1818_5(forwardValue1818_15_0);
    spill1818_1 = life5_22;
    if (!((life4_5 == null))) {
        forwardValue1818_22_0 = spill1818_1;
        break forward_join_22;
    }
    if (!((spill1818_1 != null))) {
        break forward_join_23;
    }
    forwardValue1818_22_0 = life5_22;
    }
    __call1818_6(forwardValue1818_22_0);
    }
    return;
}
public static void h1818_0(moom.Oo p0) throws Throwable {
    throw __call1181800_0(p0);
}
public static void h1818_1(moom.Oo p0) throws Throwable {
    throw __call1181801_0(p0);
}
public static void h1818_2(moom.Oo p0) throws Throwable {
    throw __call1181802_0(p0);
}
private static native long __fieldRead1818_0() throws Throwable;
private static native java.lang.String __call1818_1() throws Throwable;
private static native boolean __fieldRead1818_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Map __fieldRead1818_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Object __call1818_4(java.util.Map a0, moom.DT a1) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast1818_5(java.lang.Object a0) throws Throwable;
private static native void __call1818_6(net.minecraft.tileentity.TileEntity a0) throws Throwable;
private static native java.lang.Throwable __call1181800_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181801_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181802_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.block.Block __sourceHandlerCall_9faef396086c0c7c6708(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_9faef396086c0c7c6708 {

public static net.minecraft.block.Block f643(net.minecraft.world.chunk.Chunk receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue643_15_0;
    moom.Fs forwardValue643_31_0;
    java.lang.String spill643_0;
    int spill643_1;
    moom.Fs spill643_2;
    long life4_3;
    net.minecraft.block.Block life7_6;
    java.lang.String life6_7;
    moom.Fs life8_31;
    forward_join_42: {
    forward_join_31: {
    forward_join_15: {
    life4_3 = (__fieldRead643_0() ^ 47008008640730L);
    spill643_0 = __call643_1();
    life7_6 = __fieldRead643_2();
    life6_7 = spill643_0;
    spill643_1 = p1;
    if (!((life6_7 == null))) {
        forwardValue643_15_0 = spill643_1;
        break forward_join_15;
    }
    if (!((spill643_1 >= 0))) {
        break forward_join_42;
    }
    forwardValue643_15_0 = (p1 >> 4);
    }
    if (!((forwardValue643_15_0 < (__fieldRead643_3(receiver)).length))) {
        break forward_join_42;
    }
    life8_31 = (__fieldRead643_4(receiver))[(p1 >> 4)];
    spill643_2 = life8_31;
    if (!((life6_7 == null))) {
        forwardValue643_31_0 = spill643_2;
        break forward_join_31;
    }
    if (!((spill643_2 != null))) {
        break forward_join_42;
    }
    forwardValue643_31_0 = life8_31;
    }
    life7_6 = __call643_6(forwardValue643_31_0, p0, (p1 & __invokedynamic643_5(5269, (2548050748435355760L ^ life4_3))), p2);
    }
    return life7_6;
}
public static net.minecraft.block.Block h643_0(java.lang.Throwable p0) throws Throwable {
    throw __call2064300_0(p0);
}
public static net.minecraft.block.Block h643_1(java.lang.Throwable p0) throws Throwable {
    throw __call2064301_0(p0);
}
public static net.minecraft.block.Block h643_2(java.lang.Throwable p0) throws Throwable {
    throw __call2064302_0(p0);
}
public static net.minecraft.block.Block h643_3(java.lang.Throwable p0) throws Throwable {
    java.lang.Throwable local1 = p0;
    moom.qY local2 = __call2064303_0(local1, "Getting block");
    throw new moom.Oo(local2);
}
private static native long __fieldRead643_0() throws Throwable;
private static native java.lang.String __call643_1() throws Throwable;
private static native net.minecraft.block.Block __fieldRead643_2() throws Throwable;
private static native moom.Fs[] __fieldRead643_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead643_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic643_5(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __call643_6(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call2064300_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2064301_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2064302_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2064303_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;

}

private static native <E extends Throwable> net.minecraft.block.state.IBlockState __sourceHandlerCall_38d178d3a829fe6b1842(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws E;
private static final class __SourceHandler_38d178d3a829fe6b1842 {

public static net.minecraft.block.state.IBlockState f630(net.minecraft.world.chunk.Chunk receiver, moom.DT p0) throws Throwable {
    int forwardValue630_38_0;
    int forwardValue630_38_1;
    net.minecraft.block.state.IBlockState forwardValue630_46_0;
    net.minecraft.block.state.IBlockState forwardValue630_48_0;
    int forwardValue630_58_0;
    int spill630_0;
    int spill630_1;
    net.minecraft.block.state.IBlockState spill630_2;
    int spill630_3;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.block.state.IBlockState life5_12;
    moom.Fs life5_87;
    int life6_98;
    int life7_107;
    int life8_116;
    forward_join_105: {
    forward_join_58: {
    forward_join_49: {
    forward_join_48: {
    forward_join_47: {
    forward_join_46: {
    forward_join_40: {
    forward_join_38: {
    forward_join_24: {
    life2_3 = (__fieldRead630_0() ^ 67314172169744L);
    life4_5 = __call630_1();
    if (!((__call630_3(__fieldRead630_2(receiver)) == __fieldRead630_4()))) {
        break forward_join_49;
    }
    life5_12 = null;
    if (!((__call630_5(p0) == __invokedynamic630_6(28434, (7975394532689720635L ^ life2_3))))) {
        break forward_join_24;
    }
    life5_12 = __call630_8(__fieldRead630_7());
    }
    spill630_0 = __call630_9(p0);
    spill630_1 = __invokedynamic630_10(2045, (750553515699330513L ^ life2_3));
    if (!((life4_5 == null))) {
        forwardValue630_38_0 = spill630_0;
        forwardValue630_38_1 = spill630_1;
        break forward_join_38;
    }
    if (!((spill630_0 == spill630_1))) {
        break forward_join_40;
    }
    forwardValue630_38_0 = __call630_11(p0);
    forwardValue630_38_1 = __call630_12(p0);
    }
    life5_12 = __call630_13(forwardValue630_38_0, forwardValue630_38_1);
    }
    spill630_2 = life5_12;
    if (!((life4_5 == null))) {
        forwardValue630_46_0 = spill630_2;
        break forward_join_46;
    }
    if (!((spill630_2 == null))) {
        break forward_join_47;
    }
    forwardValue630_46_0 = __call630_15(__fieldRead630_14());
    }
    forwardValue630_48_0 = forwardValue630_46_0;
    break forward_join_48;
    }
    forwardValue630_48_0 = life5_12;
    }
    return forwardValue630_48_0;
    }
    spill630_3 = __call630_16(p0);
    if (!((life4_5 == null))) {
        forwardValue630_58_0 = spill630_3;
        break forward_join_58;
    }
    if (!((spill630_3 >= 0))) {
        break forward_join_105;
    }
    forwardValue630_58_0 = (__call630_17(p0) >> 4);
    }
    if (!((forwardValue630_58_0 < (__fieldRead630_18(receiver)).length))) {
        break forward_join_105;
    }
    life5_87 = (__fieldRead630_19(receiver))[(__call630_20(p0) >> 4)];
    if (!((life5_87 != null))) {
        break forward_join_105;
    }
    life6_98 = (__call630_21(p0) & __invokedynamic630_22(5269, (2548027350102199994L ^ life2_3)));
    life7_107 = (__call630_23(p0) & __invokedynamic630_24(5269, (2548027350102199994L ^ life2_3)));
    life8_116 = (__call630_25(p0) & __invokedynamic630_26(5269, (2548027350102199994L ^ life2_3)));
    return __call630_27(life5_87, life6_98, life7_107, life8_116);
    }
    return __call630_29(__fieldRead630_28());
}
public static net.minecraft.block.state.IBlockState h630_0(java.lang.Throwable p0) throws Throwable {
    throw __call2063000_0(p0);
}
public static net.minecraft.block.state.IBlockState h630_1(java.lang.Throwable p0) throws Throwable {
    throw __call2063001_0(p0);
}
public static net.minecraft.block.state.IBlockState h630_2(java.lang.Throwable p0) throws Throwable {
    throw __call2063002_0(p0);
}
public static net.minecraft.block.state.IBlockState h630_3(java.lang.Throwable p0) throws Throwable {
    throw __call2063003_0(p0);
}
public static net.minecraft.block.state.IBlockState h630_4(java.lang.Throwable p0) throws Throwable {
    throw __call2063004_0(p0);
}
public static net.minecraft.block.state.IBlockState h630_5(java.lang.Throwable p0) throws Throwable {
    throw __call2063005_0(p0);
}
public static net.minecraft.block.state.IBlockState h630_6(java.lang.Throwable p0, moom.DT p1) throws Throwable {
    java.lang.Throwable local2 = p0;
    moom.qY local3 = __call2063006_0(local2, "Getting block state");
    moom.qZ local4 = __call2063006_1(local3, "Block being got");
    __call2063006_3(local4, "Location", __invokedynamic2063006_2(p1));
    throw new moom.Oo(local3);
}
private static native long __fieldRead630_0() throws Throwable;
private static native java.lang.String __call630_1() throws Throwable;
private static native net.minecraft.world.World __fieldRead630_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.world.WorldType __call630_3(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.WorldType __fieldRead630_4() throws Throwable;
private static native int __call630_5(moom.DT a0) throws Throwable;
private static native int __invokedynamic630_6(int a0, long a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead630_7() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_8(net.minecraft.block.Block a0) throws Throwable;
private static native int __call630_9(moom.DT a0) throws Throwable;
private static native int __invokedynamic630_10(int a0, long a1) throws Throwable;
private static native int __call630_11(moom.DT a0) throws Throwable;
private static native int __call630_12(moom.DT a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_13(int a0, int a1) throws Throwable;
private static native net.minecraft.block.Block __fieldRead630_14() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_15(net.minecraft.block.Block a0) throws Throwable;
private static native int __call630_16(moom.DT a0) throws Throwable;
private static native int __call630_17(moom.DT a0) throws Throwable;
private static native moom.Fs[] __fieldRead630_18(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead630_19(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call630_20(moom.DT a0) throws Throwable;
private static native int __call630_21(moom.DT a0) throws Throwable;
private static native int __invokedynamic630_22(int a0, long a1) throws Throwable;
private static native int __call630_23(moom.DT a0) throws Throwable;
private static native int __invokedynamic630_24(int a0, long a1) throws Throwable;
private static native int __call630_25(moom.DT a0) throws Throwable;
private static native int __invokedynamic630_26(int a0, long a1) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_27(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.Block __fieldRead630_28() throws Throwable;
private static native net.minecraft.block.state.IBlockState __call630_29(net.minecraft.block.Block a0) throws Throwable;
private static native java.lang.Throwable __call2063000_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063001_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063002_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063003_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063004_0(java.lang.Throwable a0) throws Throwable;
private static native java.lang.Throwable __call2063005_0(java.lang.Throwable a0) throws Throwable;
private static native moom.qY __call2063006_0(java.lang.Throwable a0, java.lang.String a1) throws Throwable;
private static native moom.qZ __call2063006_1(moom.qY a0, java.lang.String a1) throws Throwable;
private static native java.util.concurrent.Callable __invokedynamic2063006_2(moom.DT a0) throws Throwable;
private static native void __call2063006_3(moom.qZ a0, java.lang.String a1, java.util.concurrent.Callable a2) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_84aa463c5e82c5dae2be(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws E;
private static final class __SourceHandler_84aa463c5e82c5dae2be {

public static boolean f1819(net.minecraft.world.chunk.Chunk receiver, int p0, int p1) throws Throwable {
    int lexicalValue1819_13_0;
    int lexicalValue1819_28_0;
    int lexicalValue1819_49_0;
    int spill1819_0;
    boolean spill1819_1;
    long life3_3;
    java.lang.String life5_5;
    int life6_34;
    moom.Fs life7_44;
    lexical_join_53: {
    lexical_join_28: {
    lexical_join_27: {
    lexical_join_13: {
    lexical_join_12: {
    life3_3 = (__fieldRead1819_0() ^ 36335590675050L);
    life5_5 = __call1819_1();
    spill1819_0 = p0;
    if (!((life5_5 == null))) {
        lexicalValue1819_13_0 = spill1819_0;
        break lexical_join_13;
    }
    if (!((spill1819_0 < 0))) {
        break lexical_join_12;
    }
    p0 = 0;
    }
    lexicalValue1819_13_0 = p1;
    }
    if (!((life5_5 == null))) {
        lexicalValue1819_28_0 = lexicalValue1819_13_0;
        break lexical_join_28;
    }
    if (!((lexicalValue1819_13_0 >= __invokedynamic1819_2(12629, (2029941686237460231L ^ life3_3))))) {
        break lexical_join_27;
    }
    p1 = __invokedynamic1819_3(31925, (8035861464442682100L ^ life3_3));
    }
    lexicalValue1819_28_0 = p0;
    }
    life6_34 = lexicalValue1819_28_0;
    lexical_cycle_29: while (true) {
    lexical_join_51: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((life6_34 <= p1))) {
        break lexical_join_53;
    }
    life7_44 = (__fieldRead1819_4(receiver))[(life6_34 >> 4)];
    if (!((life5_5 == null))) {
        break lexical_join_51;
    }
    if (!((life7_44 != null))) {
        break lexical_join_50;
    }
    spill1819_1 = __call1819_5(life7_44);
    if (!((life5_5 == null))) {
        lexicalValue1819_49_0 = __integerCategory1819_6(spill1819_1);
        break lexical_join_49;
    }
    if (!((!spill1819_1))) {
        break lexical_join_50;
    }
    lexicalValue1819_49_0 = 0;
    }
    return __integerCategory1819_7(lexicalValue1819_49_0);
    }
    life6_34 += 16;
    }
    if (!((life5_5 != null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return __integerCategory1819_8(1);
}
public static void h1819_0(moom.Oo p0) throws Throwable {
    throw __call1181900_0(p0);
}
public static void h1819_1(moom.Oo p0) throws Throwable {
    throw __call1181901_0(p0);
}
public static void h1819_2(moom.Oo p0) throws Throwable {
    throw __call1181902_0(p0);
}
public static void h1819_3(moom.Oo p0) throws Throwable {
    throw __call1181903_0(p0);
}
public static void h1819_4(moom.Oo p0) throws Throwable {
    throw __call1181904_0(p0);
}
private static native long __fieldRead1819_0() throws Throwable;
private static native java.lang.String __call1819_1() throws Throwable;
private static native int __invokedynamic1819_2(int a0, long a1) throws Throwable;
private static native int __invokedynamic1819_3(int a0, long a1) throws Throwable;
private static native moom.Fs[] __fieldRead1819_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1819_5(moom.Fs a0) throws Throwable;
private static native int __integerCategory1819_6(boolean value) throws Throwable;
private static native boolean __integerCategory1819_7(int value) throws Throwable;
private static native boolean __integerCategory1819_8(int value) throws Throwable;
private static native java.lang.Throwable __call1181900_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181901_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181902_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181903_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1181904_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> int __sourceHandlerCall_3ed6323c5572c216ca5f(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_3ed6323c5572c216ca5f {

public static int f1820(net.minecraft.world.chunk.Chunk receiver, int p0, int p1, int p2) throws Throwable {
    int forwardValue1820_16_0;
    moom.Fs forwardValue1820_29_0;
    int forwardValue1820_41_0;
    int spill1820_0;
    moom.Fs spill1820_1;
    long life4_3;
    java.lang.String life6_5;
    moom.Fs life7_29;
    forward_join_41: {
    forward_join_40: {
    forward_join_29: {
    forward_join_17: {
    forward_join_16: {
    life4_3 = (__fieldRead1820_0() ^ 128148123701623L);
    life6_5 = __call1820_1();
    spill1820_0 = (p1 >> 4);
    if (!((life6_5 == null))) {
        forwardValue1820_16_0 = spill1820_0;
        break forward_join_16;
    }
    if (!((spill1820_0 >= (__fieldRead1820_2(receiver)).length))) {
        break forward_join_17;
    }
    forwardValue1820_16_0 = 0;
    }
    return forwardValue1820_16_0;
    }
    life7_29 = (__fieldRead1820_3(receiver))[(p1 >> 4)];
    spill1820_1 = life7_29;
    if (!((life6_5 == null))) {
        forwardValue1820_29_0 = spill1820_1;
        break forward_join_29;
    }
    if (!((spill1820_1 != null))) {
        break forward_join_40;
    }
    forwardValue1820_29_0 = life7_29;
    }
    forwardValue1820_41_0 = __call1820_5(forwardValue1820_29_0, p0, (p1 & __invokedynamic1820_4(5269, (2547947687083512285L ^ life4_3))), p2);
    break forward_join_41;
    }
    forwardValue1820_41_0 = 0;
    }
    return forwardValue1820_41_0;
}
public static void h1820_0(moom.Oo p0) throws Throwable {
    throw __call1182000_0(p0);
}
public static void h1820_1(moom.Oo p0) throws Throwable {
    throw __call1182001_0(p0);
}
public static void h1820_2(moom.Oo p0) throws Throwable {
    throw __call1182002_0(p0);
}
private static native long __fieldRead1820_0() throws Throwable;
private static native java.lang.String __call1820_1() throws Throwable;
private static native moom.Fs[] __fieldRead1820_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead1820_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1820_4(int a0, long a1) throws Throwable;
private static native int __call1820_5(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native java.lang.Throwable __call1182000_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182001_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182002_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_f5fbb34aecc4edae3849(net.minecraft.world.chunk.Chunk a0, boolean a1) throws E;
private static final class __SourceHandler_f5fbb34aecc4edae3849 {

public static void f1164(net.minecraft.world.chunk.Chunk receiver, boolean p0) throws Throwable {
    int forestValue1164_32_0;
    net.minecraft.world.chunk.Chunk forestValue1164_60_0;
    moom.DT forestValue1164_60_1;
    net.minecraft.world.chunk.Chunk forestValue1164_67_0;
    moom.DT forestValue1164_67_1;
    int forestValue1164_82_0;
    net.minecraft.world.chunk.Chunk forestValue1164_97_0;
    moom.DT forestValue1164_97_1;
    net.minecraft.world.chunk.Chunk forestValue1164_104_0;
    moom.DT forestValue1164_104_1;
    boolean spill1164_0;
    boolean spill1164_1;
    boolean spill1164_2;
    boolean spill1164_3;
    net.minecraft.world.chunk.Chunk spill1164_4;
    moom.DT spill1164_5;
    net.minecraft.world.chunk.Chunk spill1164_6;
    moom.DT spill1164_7;
    boolean spill1164_8;
    long life2_3;
    java.lang.String life4_5;
    moom.DT life5_73;
    net.minecraft.tileentity.TileEntity life6_99;
    moom.DT life5_120;
    net.minecraft.tileentity.TileEntity life6_146;
    forest_join_123: {
    forest_join_82: {
    forest_join_42: {
    forest_join_32: {
    forest_join_27: {
    life2_3 = (__fieldRead1164_0() ^ 83129748241778L);
    life4_5 = __call1164_1();
    spill1164_0 = __fieldRead1164_2(receiver);
    if (!((life4_5 == null))) {
        forestValue1164_32_0 = __integerCategory1164_3(spill1164_0);
        break forest_join_32;
    }
    if (!(spill1164_0)) {
        break forest_join_27;
    }
    spill1164_1 = __call1164_6(__fieldRead1164_5(__fieldRead1164_4(receiver)));
    if (!((life4_5 == null))) {
        forestValue1164_32_0 = __integerCategory1164_7(spill1164_1);
        break forest_join_32;
    }
    if (!((!spill1164_1))) {
        break forest_join_27;
    }
    spill1164_2 = p0;
    if (!((life4_5 == null))) {
        forestValue1164_32_0 = __integerCategory1164_8(spill1164_2);
        break forest_join_32;
    }
    if (!((!spill1164_2))) {
        break forest_join_27;
    }
    __call1164_11(receiver, __fieldRead1164_10(__fieldRead1164_9(receiver)));
    }
    __fieldWrite1164_12(receiver, 1);
    forestValue1164_32_0 = __integerCategory1164_14(__fieldRead1164_13(receiver));
    }
    if (!((life4_5 == null))) {
        forestValue1164_82_0 = forestValue1164_32_0;
        break forest_join_82;
    }
    if (!((forestValue1164_32_0 == 0))) {
        break forest_join_42;
    }
    spill1164_3 = __fieldRead1164_15(receiver);
    if (!((life4_5 == null))) {
        forestValue1164_82_0 = __integerCategory1164_16(spill1164_3);
        break forest_join_82;
    }
    if (!(spill1164_3)) {
        break forest_join_42;
    }
    __call1164_17(receiver);
    }
    forest_cycle_42: while (true) {
    forest_join_79: {
    forest_join_67: {
    forest_join_60: {
    if (!((!__call1164_19(__fieldRead1164_18(receiver))))) {
        break forest_join_123;
    }
    life5_73 = __cast1164_22(__call1164_21(__fieldRead1164_20(receiver)));
    spill1164_4 = receiver;
    spill1164_5 = life5_73;
    if (!((life4_5 == null))) {
        forestValue1164_60_0 = spill1164_4;
        forestValue1164_60_1 = spill1164_5;
        break forest_join_60;
    }
    if (!((__call1164_24(spill1164_4, spill1164_5, __fieldRead1164_23()) == null))) {
        break forest_join_79;
    }
    forestValue1164_60_0 = receiver;
    forestValue1164_60_1 = life5_73;
    }
    if (!((life4_5 == null))) {
        forestValue1164_67_0 = forestValue1164_60_0;
        forestValue1164_67_1 = forestValue1164_60_1;
        break forest_join_67;
    }
    if (!(__call1164_26(__call1164_25(forestValue1164_60_0, forestValue1164_60_1)))) {
        break forest_join_79;
    }
    forestValue1164_67_0 = receiver;
    forestValue1164_67_1 = life5_73;
    }
    life6_99 = __call1164_27(forestValue1164_67_0, forestValue1164_67_1);
    __call1164_29(__fieldRead1164_28(receiver), life5_73, life6_99);
    __call1164_31(__fieldRead1164_30(receiver), life5_73, life5_73);
    }
    if (!((life4_5 != null))) {
        continue forest_cycle_42;
    }
    break forest_cycle_42;
    }
    break forest_join_123;
    }
    forest_cycle_82: while (true) {
    forest_join_119: {
    forest_join_116: {
    forest_join_104: {
    forest_join_97: {
    if (!((forestValue1164_82_0 == 0))) {
        break forest_join_123;
    }
    life5_120 = __cast1164_34(__call1164_33(__fieldRead1164_32(receiver)));
    spill1164_6 = receiver;
    spill1164_7 = life5_120;
    if (!((life4_5 == null))) {
        forestValue1164_97_0 = spill1164_6;
        forestValue1164_97_1 = spill1164_7;
        break forest_join_97;
    }
    if (!((__call1164_36(spill1164_6, spill1164_7, __fieldRead1164_35()) == null))) {
        break forest_join_116;
    }
    forestValue1164_97_0 = receiver;
    forestValue1164_97_1 = life5_120;
    }
    if (!((life4_5 == null))) {
        forestValue1164_104_0 = forestValue1164_97_0;
        forestValue1164_104_1 = forestValue1164_97_1;
        break forest_join_104;
    }
    if (!(__call1164_38(__call1164_37(forestValue1164_97_0, forestValue1164_97_1)))) {
        break forest_join_116;
    }
    forestValue1164_104_0 = receiver;
    forestValue1164_104_1 = life5_120;
    }
    life6_146 = __call1164_39(forestValue1164_104_0, forestValue1164_104_1);
    __call1164_41(__fieldRead1164_40(receiver), life5_120, life6_146);
    __call1164_43(__fieldRead1164_42(receiver), life5_120, life5_120);
    }
    if (!((life4_5 != null))) {
        break forest_join_119;
    }
    break forest_join_123;
    }
    spill1164_8 = __call1164_45(__fieldRead1164_44(receiver));
    forestValue1164_82_0 = __integerCategory1164_46(spill1164_8);
    continue forest_cycle_82;
    }
    }
    return;
}
public static void h1164_0(moom.Oo p0) throws Throwable {
    throw __call3116400_0(p0);
}
public static void h1164_1(moom.Oo p0) throws Throwable {
    throw __call3116401_0(p0);
}
public static void h1164_2(moom.Oo p0) throws Throwable {
    throw __call3116402_0(p0);
}
public static void h1164_3(moom.Oo p0) throws Throwable {
    throw __call3116403_0(p0);
}
public static void h1164_4(moom.Oo p0) throws Throwable {
    throw __call3116404_0(p0);
}
public static void h1164_5(moom.Oo p0) throws Throwable {
    throw __call3116405_0(p0);
}
public static void h1164_6(moom.Oo p0) throws Throwable {
    throw __call3116406_0(p0);
}
public static void h1164_7(moom.Oo p0) throws Throwable {
    throw __call3116407_0(p0);
}
public static void h1164_8(moom.Oo p0) throws Throwable {
    throw __call3116408_0(p0);
}
public static void h1164_9(moom.Oo p0) throws Throwable {
    throw __call3116409_0(p0);
}
public static void h1164_10(moom.Oo p0) throws Throwable {
    throw __call3116410_0(p0);
}
public static void h1164_11(moom.Oo p0) throws Throwable {
    throw __call3116411_0(p0);
}
public static void h1164_12(moom.Oo p0) throws Throwable {
    throw __call3116412_0(p0);
}
public static void h1164_13(moom.Oo p0) throws Throwable {
    throw __call3116413_0(p0);
}
private static native long __fieldRead1164_0() throws Throwable;
private static native java.lang.String __call1164_1() throws Throwable;
private static native boolean __fieldRead1164_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1164_3(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1164_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1164_5(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1164_6(moom.EA a0) throws Throwable;
private static native int __integerCategory1164_7(boolean value) throws Throwable;
private static native int __integerCategory1164_8(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1164_9(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __fieldRead1164_10(net.minecraft.world.World a0) throws Throwable;
private static native void __call1164_11(net.minecraft.world.chunk.Chunk a0, boolean a1) throws Throwable;
private static native void __fieldWrite1164_12(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native boolean __fieldRead1164_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1164_14(boolean value) throws Throwable;
private static native boolean __fieldRead1164_15(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1164_16(boolean value) throws Throwable;
private static native void __call1164_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.concurrent.ConcurrentLinkedQueue __fieldRead1164_18(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1164_19(java.util.concurrent.ConcurrentLinkedQueue a0) throws Throwable;
private static native java.util.concurrent.ConcurrentLinkedQueue __fieldRead1164_20(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Object __call1164_21(java.util.concurrent.ConcurrentLinkedQueue a0) throws Throwable;
private static native moom.DT __cast1164_22(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk$EnumCreateEntityType __fieldRead1164_23() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1164_24(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.chunk.Chunk$EnumCreateEntityType a2) throws Throwable;
private static native net.minecraft.block.Block __call1164_25(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native boolean __call1164_26(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1164_27(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1164_28(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1164_29(net.minecraft.world.World a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native net.minecraft.world.World __fieldRead1164_30(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1164_31(net.minecraft.world.World a0, moom.DT a1, moom.DT a2) throws Throwable;
private static native java.util.concurrent.ConcurrentLinkedQueue __fieldRead1164_32(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.Object __call1164_33(java.util.concurrent.ConcurrentLinkedQueue a0) throws Throwable;
private static native moom.DT __cast1164_34(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.chunk.Chunk$EnumCreateEntityType __fieldRead1164_35() throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1164_36(net.minecraft.world.chunk.Chunk a0, moom.DT a1, net.minecraft.world.chunk.Chunk$EnumCreateEntityType a2) throws Throwable;
private static native net.minecraft.block.Block __call1164_37(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native boolean __call1164_38(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __call1164_39(net.minecraft.world.chunk.Chunk a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1164_40(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1164_41(net.minecraft.world.World a0, moom.DT a1, net.minecraft.tileentity.TileEntity a2) throws Throwable;
private static native net.minecraft.world.World __fieldRead1164_42(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1164_43(net.minecraft.world.World a0, moom.DT a1, moom.DT a2) throws Throwable;
private static native java.util.concurrent.ConcurrentLinkedQueue __fieldRead1164_44(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1164_45(java.util.concurrent.ConcurrentLinkedQueue a0) throws Throwable;
private static native int __integerCategory1164_46(boolean value) throws Throwable;
private static native java.lang.Throwable __call3116400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116413_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_22c0f9ee334c3dfdb41f(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_22c0f9ee334c3dfdb41f {

public static boolean f1822(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    int forwardValue1822_13_0;
    int forwardValue1822_18_0;
    int forwardValue1822_22_0;
    int forwardValue1822_24_0;
    boolean spill1822_0;
    long life1_3;
    java.lang.String life3_5;
    forward_join_24: {
    forward_join_23: {
    forward_join_22: {
    forward_join_18: {
    forward_join_13: {
    life1_3 = (__fieldRead1822_0() ^ 119542618193059L);
    life3_5 = __call1822_1();
    spill1822_0 = __fieldRead1822_2(receiver);
    if (!((life3_5 == null))) {
        forwardValue1822_13_0 = __integerCategory1822_3(spill1822_0);
        break forward_join_13;
    }
    if (!(spill1822_0)) {
        break forward_join_23;
    }
    forwardValue1822_13_0 = __integerCategory1822_5(__fieldRead1822_4(receiver));
    }
    if (!((life3_5 == null))) {
        forwardValue1822_18_0 = forwardValue1822_13_0;
        break forward_join_18;
    }
    if (!((forwardValue1822_13_0 != 0))) {
        break forward_join_23;
    }
    forwardValue1822_18_0 = __integerCategory1822_7(__fieldRead1822_6(receiver));
    }
    if (!((life3_5 == null))) {
        forwardValue1822_22_0 = forwardValue1822_18_0;
        break forward_join_22;
    }
    if (!((forwardValue1822_18_0 != 0))) {
        break forward_join_23;
    }
    forwardValue1822_22_0 = 1;
    }
    forwardValue1822_24_0 = forwardValue1822_22_0;
    break forward_join_24;
    }
    forwardValue1822_24_0 = 0;
    }
    return __integerCategory1822_8(forwardValue1822_24_0);
}
public static void h1822_0(moom.Oo p0) throws Throwable {
    throw __call1182200_0(p0);
}
public static void h1822_1(moom.Oo p0) throws Throwable {
    throw __call1182201_0(p0);
}
public static void h1822_2(moom.Oo p0) throws Throwable {
    throw __call1182202_0(p0);
}
public static void h1822_3(moom.Oo p0) throws Throwable {
    throw __call1182203_0(p0);
}
public static void h1822_4(moom.Oo p0) throws Throwable {
    throw __call1182204_0(p0);
}
private static native long __fieldRead1822_0() throws Throwable;
private static native java.lang.String __call1822_1() throws Throwable;
private static native boolean __fieldRead1822_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1822_3(boolean value) throws Throwable;
private static native boolean __fieldRead1822_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1822_5(boolean value) throws Throwable;
private static native boolean __fieldRead1822_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1822_7(boolean value) throws Throwable;
private static native boolean __integerCategory1822_8(int value) throws Throwable;
private static native java.lang.Throwable __call1182200_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182201_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182202_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182203_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182204_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_348e22dbc00fde3e0b67(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_348e22dbc00fde3e0b67 {

public static void f1165(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    int forestValue1165_19_0;
    int forestValue1165_83_0;
    int forestValue1165_100_0;
    int forestValue1165_118_0;
    int forestValue1165_140_0;
    int forestValue1165_140_1;
    int forestValue1165_192_0;
    java.lang.String spill1165_0;
    int spill1165_1;
    int spill1165_2;
    int spill1165_3;
    int spill1165_4;
    int spill1165_5;
    long life1_3;
    int life4_7;
    int life5_16;
    java.lang.String life3_17;
    int life6_28;
    int life7_58;
    int life8_125;
    int life9_131;
    moom.Fs life10_161;
    forest_join_204: {
    forest_join_201: {
    life1_3 = (__fieldRead1165_0() ^ 15654922769762L);
    spill1165_0 = __call1165_1();
    life4_7 = __call1165_2(receiver);
    __fieldWrite1165_4(receiver, __invokedynamic1165_3(29936, (5328754870816011683L ^ life1_3)));
    life5_16 = 0;
    life3_17 = spill1165_0;
    forest_cycle_18: while (true) {
    forest_join_198: {
    forestValue1165_19_0 = life5_16;
    forest_cycle_19: while (true) {
    if (!((forestValue1165_19_0 < __invokedynamic1165_5(9267, (2224775813662614907L ^ life1_3))))) {
        break forest_join_201;
    }
    if (!((life3_17 == null))) {
        break forest_join_204;
    }
    life6_28 = 0;
    forest_cycle_29: while (true) {
    forest_join_196: {
    forest_join_195: {
    forest_join_118: {
    forest_join_100: {
    forest_join_96: {
    if (!((life6_28 < __invokedynamic1165_6(9267, (2224775813662614907L ^ life1_3))))) {
        break forest_join_198;
    }
    (__fieldRead1165_7(receiver))[(life5_16 + (life6_28 << 4))] = __invokedynamic1165_8(2718, (2426996005150133195L ^ life1_3));
    spill1165_1 = (life4_7 + __invokedynamic1165_9(9267, (2224775813662614907L ^ life1_3)));
    if (!((life3_17 == null))) {
        forestValue1165_19_0 = spill1165_1;
        continue forest_cycle_19;
    }
    life7_58 = spill1165_1;
    forest_cycle_59: while (true) {
    forest_join_93: {
    forest_join_83: {
    if (!((life7_58 > 0))) {
        break forest_join_96;
    }
    spill1165_2 = __call1165_10(receiver, life5_16, (life7_58 - 1), life6_28);
    if (!((life3_17 == null))) {
        forestValue1165_100_0 = spill1165_2;
        break forest_join_100;
    }
    if (!((life3_17 == null))) {
        forestValue1165_83_0 = spill1165_2;
        break forest_join_83;
    }
    if (!((spill1165_2 != 0))) {
        break forest_join_93;
    }
    (__fieldRead1165_11(receiver))[((life6_28 << 4) | life5_16)] = life7_58;
    forestValue1165_83_0 = life7_58;
    }
    if (!((life3_17 == null))) {
        forestValue1165_100_0 = forestValue1165_83_0;
        break forest_join_100;
    }
    if (!((forestValue1165_83_0 < __fieldRead1165_12(receiver)))) {
        break forest_join_96;
    }
    __fieldWrite1165_13(receiver, life7_58);
    if (!((life3_17 != null))) {
        break forest_join_96;
    }
    }
    life7_58 += -1;
    if (!((life3_17 != null))) {
        continue forest_cycle_59;
    }
    break forest_cycle_59;
    }
    }
    forestValue1165_100_0 = __integerCategory1165_17(__call1165_16(__fieldRead1165_15(__fieldRead1165_14(receiver))));
    }
    if (!((life3_17 == null))) {
        forestValue1165_118_0 = forestValue1165_100_0;
        break forest_join_118;
    }
    if (!((forestValue1165_100_0 == 0))) {
        break forest_join_195;
    }
    life7_58 = __invokedynamic1165_18(5269, (2548010839422277064L ^ life1_3));
    forestValue1165_118_0 = ((life4_7 + __invokedynamic1165_19(9267, (2224775813662614907L ^ life1_3))) - 1);
    }
    life8_125 = forestValue1165_118_0;
    forest_cycle_119: while (true) {
    forest_join_192: {
    forest_join_189: {
    forest_join_188: {
    forest_join_140: {
    forest_join_138: {
    life9_131 = __call1165_20(receiver, life5_16, life8_125, life6_28);
    if (!((life9_131 == 0))) {
        break forest_join_138;
    }
    spill1165_3 = life7_58;
    spill1165_4 = __invokedynamic1165_21(5269, (2548010839422277064L ^ life1_3));
    if (!((life3_17 == null))) {
        forestValue1165_140_0 = spill1165_3;
        forestValue1165_140_1 = spill1165_4;
        break forest_join_140;
    }
    if (!((spill1165_3 != spill1165_4))) {
        break forest_join_138;
    }
    life9_131 = 1;
    }
    forestValue1165_140_0 = life7_58;
    forestValue1165_140_1 = life9_131;
    }
    life7_58 = (forestValue1165_140_0 - forestValue1165_140_1);
    spill1165_5 = life7_58;
    if (!((life3_17 == null))) {
        forestValue1165_192_0 = spill1165_5;
        break forest_join_192;
    }
    if (!((spill1165_5 > 0))) {
        break forest_join_188;
    }
    life10_161 = (__fieldRead1165_22(receiver))[(life8_125 >> 4)];
    if (!((life3_17 == null))) {
        break forest_join_189;
    }
    if (!((life10_161 != null))) {
        break forest_join_188;
    }
    __call1165_24(life10_161, life5_16, (life8_125 & __invokedynamic1165_23(5269, (2548010839422277064L ^ life1_3))), life6_28, life7_58);
    __call1165_28(__fieldRead1165_25(receiver), new moom.DT(((__fieldRead1165_26(receiver) << 4) + life5_16), life8_125, ((__fieldRead1165_27(receiver) << 4) + life6_28)));
    }
    life8_125 += -1;
    }
    if (!((life3_17 == null))) {
        break forest_join_196;
    }
    forestValue1165_192_0 = life8_125;
    }
    if (!((forestValue1165_192_0 > 0))) {
        break forest_join_195;
    }
    if (!((life7_58 <= 0))) {
        continue forest_cycle_119;
    }
    break forest_cycle_119;
    }
    }
    life6_28 += 1;
    }
    if (!((life3_17 != null))) {
        continue forest_cycle_29;
    }
    break forest_cycle_29;
    }
    break forest_cycle_19;
    }
    }
    life5_16 += 1;
    if (!((life3_17 != null))) {
        continue forest_cycle_18;
    }
    break forest_cycle_18;
    }
    }
    __fieldWrite1165_29(receiver, 1);
    }
    return;
}
public static void h1165_0(moom.Oo p0) throws Throwable {
    throw __call3116500_0(p0);
}
public static void h1165_1(moom.Oo p0) throws Throwable {
    throw __call3116501_0(p0);
}
public static void h1165_2(moom.Oo p0) throws Throwable {
    throw __call3116502_0(p0);
}
public static void h1165_3(moom.Oo p0) throws Throwable {
    throw __call3116503_0(p0);
}
public static void h1165_4(moom.Oo p0) throws Throwable {
    throw __call3116504_0(p0);
}
public static void h1165_5(moom.Oo p0) throws Throwable {
    throw __call3116505_0(p0);
}
public static void h1165_6(moom.Oo p0) throws Throwable {
    throw __call3116506_0(p0);
}
public static void h1165_7(moom.Oo p0) throws Throwable {
    throw __call3116507_0(p0);
}
public static void h1165_8(moom.Oo p0) throws Throwable {
    throw __call3116508_0(p0);
}
public static void h1165_9(moom.Oo p0) throws Throwable {
    throw __call3116509_0(p0);
}
public static void h1165_10(moom.Oo p0) throws Throwable {
    throw __call3116510_0(p0);
}
public static void h1165_11(moom.Oo p0) throws Throwable {
    throw __call3116511_0(p0);
}
public static void h1165_12(moom.Oo p0) throws Throwable {
    throw __call3116512_0(p0);
}
private static native long __fieldRead1165_0() throws Throwable;
private static native java.lang.String __call1165_1() throws Throwable;
private static native int __call1165_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1165_3(int a0, long a1) throws Throwable;
private static native void __fieldWrite1165_4(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native int __invokedynamic1165_5(int a0, long a1) throws Throwable;
private static native int __invokedynamic1165_6(int a0, long a1) throws Throwable;
private static native int[] __fieldRead1165_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1165_8(int a0, long a1) throws Throwable;
private static native int __invokedynamic1165_9(int a0, long a1) throws Throwable;
private static native int __call1165_10(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native int[] __fieldRead1165_11(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1165_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite1165_13(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1165_14(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1165_15(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1165_16(moom.EA a0) throws Throwable;
private static native int __integerCategory1165_17(boolean value) throws Throwable;
private static native int __invokedynamic1165_18(int a0, long a1) throws Throwable;
private static native int __invokedynamic1165_19(int a0, long a1) throws Throwable;
private static native int __call1165_20(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1165_21(int a0, long a1) throws Throwable;
private static native moom.Fs[] __fieldRead1165_22(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1165_23(int a0, long a1) throws Throwable;
private static native void __call1165_24(moom.Fs a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.World __fieldRead1165_25(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1165_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1165_27(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1165_28(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native void __fieldWrite1165_29(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3116500_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116501_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116502_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116503_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116504_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116505_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116506_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116507_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116508_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116509_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116510_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116511_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116512_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_487c670f131b91df1325(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws E;
private static final class __SourceHandler_487c670f131b91df1325 {

public static void f1824(net.minecraft.world.chunk.Chunk receiver, int p0, int p1, int p2) throws Throwable {
    int lexicalValue1824_43_0;
    int lexicalValue1824_90_0;
    int lexicalValue1824_90_1;
    int lexicalValue1824_174_0;
    int lexicalValue1824_257_0;
    int lexicalValue1824_261_0;
    moom.Fs lexicalValue1824_274_0;
    int lexicalValue1824_295_0;
    int lexicalValue1824_297_0;
    int lexicalValue1824_314_0;
    int lexicalValue1824_314_1;
    int lexicalValue1824_324_0;
    net.minecraft.world.chunk.Chunk lexicalValue1824_358_0;
    java.lang.String spill1824_0;
    int spill1824_1;
    int spill1824_2;
    boolean spill1824_3;
    int spill1824_4;
    int spill1824_5;
    int spill1824_6;
    moom.Fs spill1824_7;
    int spill1824_8;
    int spill1824_9;
    int spill1824_10;
    net.minecraft.world.chunk.Chunk spill1824_11;
    long life4_3;
    int life7_19;
    int life8_23;
    java.lang.String life6_24;
    int life9_106;
    int life10_117;
    int life11_140;
    moom.Fs life12_150;
    int life11_210;
    moom.Fs life12_220;
    int life12_299;
    moom.Fs life13_328;
    int life12_360;
    int life13_362;
    java.util.Iterator life14_402;
    moom.bs life15_409;
    lexical_join_360: {
    lexical_join_358: {
    lexical_join_357: {
    lexical_join_351: {
    lexical_join_324: {
    lexical_join_318: {
    lexical_join_314: {
    lexical_join_309: {
    lexical_join_297: {
    lexical_join_295: {
    lexical_join_287: {
    lexical_join_231: {
    lexical_join_225: {
    lexical_join_174: {
    lexical_join_173: {
    lexical_join_171: {
    lexical_join_90: {
    lexical_join_43: {
    lexical_join_42: {
    life4_3 = (__fieldRead1824_0() ^ 6598349669978L);
    spill1824_0 = __call1824_1();
    life7_19 = ((__fieldRead1824_2(receiver))[((p2 << 4) | p0)] & __invokedynamic1824_3(9073, (6926275314084098321L ^ life4_3)));
    life8_23 = __call1824_4(p1, life7_19);
    life6_24 = spill1824_0;
    lexical_cycle_25: while (true) {
    if (!((life8_23 > 0))) {
        break lexical_join_42;
    }
    spill1824_1 = __call1824_5(receiver, p0, (life8_23 - 1), p2);
    if (!((life6_24 == null))) {
        lexicalValue1824_43_0 = spill1824_1;
        break lexical_join_43;
    }
    if (!((life6_24 == null))) {
        lexicalValue1824_43_0 = spill1824_1;
        break lexical_join_43;
    }
    if (!((spill1824_1 == 0))) {
        break lexical_join_42;
    }
    life8_23 += -1;
    if (!((life6_24 != null))) { continue lexical_cycle_25; }
    break lexical_cycle_25;
    }
    }
    lexicalValue1824_43_0 = life8_23;
    }
    spill1824_2 = life7_19;
    if (!((life6_24 == null))) {
        lexicalValue1824_90_0 = lexicalValue1824_43_0;
        lexicalValue1824_90_1 = spill1824_2;
        break lexical_join_90;
    }
    if (!((lexicalValue1824_43_0 != spill1824_2))) {
        break lexical_join_360;
    }
    __call1824_11(__fieldRead1824_6(receiver), (p0 + (__fieldRead1824_7(receiver) * __invokedynamic1824_8(9267, (2224767135180666435L ^ life4_3)))), (p2 + (__fieldRead1824_9(receiver) * __invokedynamic1824_10(9267, (2224767135180666435L ^ life4_3)))), life8_23, life7_19);
    (__fieldRead1824_12(receiver))[((p2 << 4) | p0)] = life8_23;
    lexicalValue1824_90_0 = (__fieldRead1824_13(receiver) * __invokedynamic1824_14(9267, (2224767135180666435L ^ life4_3)));
    lexicalValue1824_90_1 = p0;
    }
    life9_106 = (lexicalValue1824_90_0 + lexicalValue1824_90_1);
    life10_117 = ((__fieldRead1824_15(receiver) * __invokedynamic1824_16(9267, (2224767135180666435L ^ life4_3))) + p2);
    spill1824_3 = __call1824_19(__fieldRead1824_18(__fieldRead1824_17(receiver)));
    if (!((life6_24 == null))) {
        lexicalValue1824_295_0 = __integerCategory1824_20(spill1824_3);
        break lexical_join_295;
    }
    if (!((!spill1824_3))) {
        break lexical_join_287;
    }
    spill1824_4 = life8_23;
    if (!((life6_24 == null))) {
        lexicalValue1824_174_0 = spill1824_4;
        break lexical_join_174;
    }
    if (!((spill1824_4 < life7_19))) {
        break lexical_join_173;
    }
    life11_140 = life8_23;
    lexical_cycle_117: while (true) {
    lexical_join_169: {
    lexical_join_168: {
    if (!((life11_140 < life7_19))) {
        break lexical_join_171;
    }
    life12_150 = (__fieldRead1824_21(receiver))[(life11_140 >> 4)];
    if (!((life6_24 == null))) {
        break lexical_join_225;
    }
    if (!((life6_24 == null))) {
        break lexical_join_169;
    }
    if (!((life12_150 != null))) {
        break lexical_join_168;
    }
    __call1824_24(life12_150, p0, (life11_140 & __invokedynamic1824_22(5269, (2548002093563217648L ^ life4_3))), p2, __invokedynamic1824_23(5269, (2548002093563217648L ^ life4_3)));
    __call1824_28(__fieldRead1824_25(receiver), new moom.DT(((__fieldRead1824_26(receiver) << 4) + p0), life11_140, ((__fieldRead1824_27(receiver) << 4) + p2)));
    }
    life11_140 += 1;
    }
    if (!((life6_24 != null))) { continue lexical_cycle_117; }
    break lexical_cycle_117;
    }
    }
    if (!((life6_24 != null))) {
        break lexical_join_225;
    }
    }
    lexicalValue1824_174_0 = life7_19;
    }
    life11_210 = lexicalValue1824_174_0;
    lexical_cycle_175: while (true) {
    lexical_join_223: {
    lexical_join_222: {
    if (!((life11_210 < life8_23))) {
        break lexical_join_225;
    }
    life12_220 = (__fieldRead1824_29(receiver))[(life11_210 >> 4)];
    if (!((life6_24 == null))) {
        break lexical_join_231;
    }
    if (!((life6_24 == null))) {
        break lexical_join_223;
    }
    if (!((life12_220 != null))) {
        break lexical_join_222;
    }
    __call1824_31(life12_220, p0, (life11_210 & __invokedynamic1824_30(5269, (2548002093563217648L ^ life4_3))), p2, 0);
    __call1824_35(__fieldRead1824_32(receiver), new moom.DT(((__fieldRead1824_33(receiver) << 4) + p0), life11_210, ((__fieldRead1824_34(receiver) << 4) + p2)));
    }
    life11_210 += 1;
    }
    if (!((life6_24 != null))) { continue lexical_cycle_175; }
    break lexical_cycle_175;
    }
    }
    life11_210 = __invokedynamic1824_36(5269, (2548002093563217648L ^ life4_3));
    }
    lexical_cycle_231: while (true) {
    lexical_join_285: {
    lexical_join_274: {
    lexical_join_262: {
    lexical_join_261: {
    lexical_join_257: {
    lexical_join_252: {
    if (!((life8_23 > 0))) {
        break lexical_join_287;
    }
    spill1824_5 = life11_210;
    if (!((life6_24 == null))) {
        lexicalValue1824_297_0 = spill1824_5;
        break lexical_join_297;
    }
    if (!((life6_24 == null))) {
        lexicalValue1824_297_0 = spill1824_5;
        break lexical_join_297;
    }
    if (!((spill1824_5 > 0))) {
        break lexical_join_287;
    }
    life8_23 += -1;
    life12_299 = __call1824_37(receiver, p0, life8_23, p2);
    spill1824_6 = life12_299;
    if (!((life6_24 == null))) {
        lexicalValue1824_257_0 = spill1824_6;
        break lexical_join_257;
    }
    if (!((spill1824_6 == 0))) {
        break lexical_join_252;
    }
    life12_299 = 1;
    }
    life11_210 = (life11_210 - life12_299);
    lexicalValue1824_257_0 = life11_210;
    }
    if (!((life6_24 == null))) {
        lexicalValue1824_261_0 = lexicalValue1824_257_0;
        break lexical_join_261;
    }
    if (!((lexicalValue1824_257_0 < 0))) {
        break lexical_join_262;
    }
    lexicalValue1824_261_0 = 0;
    }
    life11_210 = lexicalValue1824_261_0;
    }
    life13_328 = (__fieldRead1824_38(receiver))[(life8_23 >> 4)];
    spill1824_7 = life13_328;
    if (!((life6_24 == null))) {
        lexicalValue1824_274_0 = spill1824_7;
        break lexical_join_274;
    }
    if (!((spill1824_7 != null))) {
        break lexical_join_285;
    }
    lexicalValue1824_274_0 = life13_328;
    }
    __call1824_40(lexicalValue1824_274_0, p0, (life8_23 & __invokedynamic1824_39(5269, (2548002093563217648L ^ life4_3))), p2, life11_210);
    }
    if (!((life6_24 != null))) { continue lexical_cycle_231; }
    break lexical_cycle_231;
    }
    }
    lexicalValue1824_295_0 = (__fieldRead1824_41(receiver))[((p2 << 4) | p0)];
    }
    life11_210 = lexicalValue1824_295_0;
    lexicalValue1824_297_0 = life7_19;
    }
    life12_360 = lexicalValue1824_297_0;
    life13_362 = life11_210;
    spill1824_8 = life11_210;
    spill1824_9 = life7_19;
    if (!((life6_24 == null))) {
        lexicalValue1824_314_0 = spill1824_8;
        lexicalValue1824_314_1 = spill1824_9;
        break lexical_join_314;
    }
    if (!((spill1824_8 < spill1824_9))) {
        break lexical_join_309;
    }
    life12_360 = life11_210;
    life13_362 = life7_19;
    }
    spill1824_10 = life11_210;
    if (!((life6_24 == null))) {
        lexicalValue1824_324_0 = spill1824_10;
        break lexical_join_324;
    }
    lexicalValue1824_314_0 = spill1824_10;
    lexicalValue1824_314_1 = __fieldRead1824_42(receiver);
    }
    if (!((lexicalValue1824_314_0 < lexicalValue1824_314_1))) {
        break lexical_join_318;
    }
    __fieldWrite1824_43(receiver, life11_210);
    }
    spill1824_11 = receiver;
    if (!((life6_24 == null))) {
        lexicalValue1824_358_0 = spill1824_11;
        break lexical_join_358;
    }
    lexicalValue1824_324_0 = __integerCategory1824_47(__call1824_46(__fieldRead1824_45(__fieldRead1824_44(spill1824_11))));
    }
    if (!((lexicalValue1824_324_0 == 0))) {
        break lexical_join_357;
    }
    life14_402 = __call1824_49(__fieldRead1824_48());
    lexical_cycle_328: while (true) {
    if (!(__call1824_50(life14_402))) {
        break lexical_join_351;
    }
    life15_409 = __cast1824_52(__call1824_51(life14_402));
    __call1824_55(receiver, (life9_106 + __call1824_53(life15_409)), (life10_117 + __call1824_54(life15_409)), life12_360, life13_362);
    if (!((life6_24 == null))) {
        break lexical_join_357;
    }
    if (!((life6_24 != null))) { continue lexical_cycle_328; }
    break lexical_cycle_328;
    }
    }
    __call1824_56(receiver, life9_106, life10_117, life12_360, life13_362);
    }
    lexicalValue1824_358_0 = receiver;
    }
    __fieldWrite1824_57(lexicalValue1824_358_0, 1);
    }
    return;
}
public static void h1824_0(moom.Oo p0) throws Throwable {
    throw __call1182400_0(p0);
}
public static void h1824_1(moom.Oo p0) throws Throwable {
    throw __call1182401_0(p0);
}
public static void h1824_2(moom.Oo p0) throws Throwable {
    throw __call1182402_0(p0);
}
public static void h1824_3(moom.Oo p0) throws Throwable {
    throw __call1182403_0(p0);
}
public static void h1824_4(moom.Oo p0) throws Throwable {
    throw __call1182404_0(p0);
}
public static void h1824_5(moom.Oo p0) throws Throwable {
    throw __call1182405_0(p0);
}
public static void h1824_6(moom.Oo p0) throws Throwable {
    throw __call1182406_0(p0);
}
public static void h1824_7(moom.Oo p0) throws Throwable {
    throw __call1182407_0(p0);
}
public static void h1824_8(moom.Oo p0) throws Throwable {
    throw __call1182408_0(p0);
}
public static void h1824_9(moom.Oo p0) throws Throwable {
    throw __call1182409_0(p0);
}
public static void h1824_10(moom.Oo p0) throws Throwable {
    throw __call1182410_0(p0);
}
public static void h1824_11(moom.Oo p0) throws Throwable {
    throw __call1182411_0(p0);
}
public static void h1824_12(moom.Oo p0) throws Throwable {
    throw __call1182412_0(p0);
}
public static void h1824_13(moom.Oo p0) throws Throwable {
    throw __call1182413_0(p0);
}
public static void h1824_14(moom.Oo p0) throws Throwable {
    throw __call1182414_0(p0);
}
public static void h1824_15(moom.Oo p0) throws Throwable {
    throw __call1182415_0(p0);
}
public static void h1824_16(moom.Oo p0) throws Throwable {
    throw __call1182416_0(p0);
}
public static void h1824_17(moom.Oo p0) throws Throwable {
    throw __call1182417_0(p0);
}
public static void h1824_18(moom.Oo p0) throws Throwable {
    throw __call1182418_0(p0);
}
public static void h1824_19(moom.Oo p0) throws Throwable {
    throw __call1182419_0(p0);
}
public static void h1824_20(moom.Oo p0) throws Throwable {
    throw __call1182420_0(p0);
}
public static void h1824_21(moom.Oo p0) throws Throwable {
    throw __call1182421_0(p0);
}
public static void h1824_22(moom.Oo p0) throws Throwable {
    throw __call1182422_0(p0);
}
public static void h1824_23(moom.Oo p0) throws Throwable {
    throw __call1182423_0(p0);
}
public static void h1824_24(moom.Oo p0) throws Throwable {
    throw __call1182424_0(p0);
}
public static void h1824_25(moom.Oo p0) throws Throwable {
    throw __call1182425_0(p0);
}
private static native long __fieldRead1824_0() throws Throwable;
private static native java.lang.String __call1824_1() throws Throwable;
private static native int[] __fieldRead1824_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_3(int a0, long a1) throws Throwable;
private static native int __call1824_4(int a0, int a1) throws Throwable;
private static native int __call1824_5(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.world.World __fieldRead1824_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1824_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_8(int a0, long a1) throws Throwable;
private static native int __fieldRead1824_9(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_10(int a0, long a1) throws Throwable;
private static native void __call1824_11(net.minecraft.world.World a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int[] __fieldRead1824_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1824_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_14(int a0, long a1) throws Throwable;
private static native int __fieldRead1824_15(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_16(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1824_17(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1824_18(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1824_19(moom.EA a0) throws Throwable;
private static native int __integerCategory1824_20(boolean value) throws Throwable;
private static native moom.Fs[] __fieldRead1824_21(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_22(int a0, long a1) throws Throwable;
private static native int __invokedynamic1824_23(int a0, long a1) throws Throwable;
private static native void __call1824_24(moom.Fs a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.World __fieldRead1824_25(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1824_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1824_27(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1824_28(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.Fs[] __fieldRead1824_29(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_30(int a0, long a1) throws Throwable;
private static native void __call1824_31(moom.Fs a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native net.minecraft.world.World __fieldRead1824_32(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1824_33(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1824_34(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1824_35(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __invokedynamic1824_36(int a0, long a1) throws Throwable;
private static native int __call1824_37(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws Throwable;
private static native moom.Fs[] __fieldRead1824_38(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1824_39(int a0, long a1) throws Throwable;
private static native void __call1824_40(moom.Fs a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native int[] __fieldRead1824_41(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1824_42(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite1824_43(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1824_44(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1824_45(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1824_46(moom.EA a0) throws Throwable;
private static native int __integerCategory1824_47(boolean value) throws Throwable;
private static native net.minecraft.util.EnumFacing$Plane __fieldRead1824_48() throws Throwable;
private static native java.util.Iterator __call1824_49(net.minecraft.util.EnumFacing$Plane a0) throws Throwable;
private static native boolean __call1824_50(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1824_51(java.util.Iterator a0) throws Throwable;
private static native moom.bs __cast1824_52(java.lang.Object a0) throws Throwable;
private static native int __call1824_53(moom.bs a0) throws Throwable;
private static native int __call1824_54(moom.bs a0) throws Throwable;
private static native void __call1824_55(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __call1824_56(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3, int a4) throws Throwable;
private static native void __fieldWrite1824_57(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.lang.Throwable __call1182400_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182401_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182402_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182403_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182404_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182405_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182406_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182407_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182408_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182409_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182410_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182411_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182412_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182413_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182414_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182415_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182416_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182417_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182418_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182419_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182420_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182421_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182422_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182423_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182424_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182425_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_43925fe55e8e761956b8(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_43925fe55e8e761956b8 {

public static void f1825(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    java.lang.String spill1825_0;
    long life1_3;
    java.lang.String life3_8;
    net.minecraft.util.ClassInheritanceMultiMap[] life4_17;
    int life5_20;
    int life6_22;
    net.minecraft.util.ClassInheritanceMultiMap life7_29;
    java.util.Iterator life8_32;
    net.minecraft.entity.Entity life9_39;
    lexical_join_53: {
    life1_3 = (__fieldRead1825_0() ^ 62833894907544L);
    spill1825_0 = __call1825_1();
    __fieldWrite1825_2(receiver, 1);
    life3_8 = spill1825_0;
    __call1825_6(__fieldRead1825_3(receiver), __call1825_5(__fieldRead1825_4(receiver)));
    life4_17 = __fieldRead1825_7(receiver);
    life5_20 = (life4_17).length;
    life6_22 = 0;
    lexical_cycle_23: while (true) {
    lexical_join_51: {
    lexical_join_46: {
    if (!((life6_22 < life5_20))) {
        break lexical_join_53;
    }
    life7_29 = (life4_17)[life6_22];
    life8_32 = __call1825_8(life7_29);
    lexical_cycle_33: while (true) {
    if (!(__call1825_9(life8_32))) {
        break lexical_join_46;
    }
    life9_39 = __cast1825_11(__call1825_10(life8_32));
    __call1825_12(life9_39);
    if (!((life3_8 == null))) {
        break lexical_join_51;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_33; }
    break lexical_cycle_33;
    }
    }
    __call1825_14(__fieldRead1825_13(receiver), life7_29);
    life6_22 += 1;
    }
    if (!((life3_8 != null))) { continue lexical_cycle_23; }
    break lexical_cycle_23;
    }
    }
    return;
}
public static void h1825_0(moom.Oo p0) throws Throwable {
    throw __call1182500_0(p0);
}
private static native long __fieldRead1825_0() throws Throwable;
private static native java.lang.String __call1825_1() throws Throwable;
private static native void __fieldWrite1825_2(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1825_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Map __fieldRead1825_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Collection __call1825_5(java.util.Map a0) throws Throwable;
private static native void __call1825_6(net.minecraft.world.World a0, java.util.Collection a1) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1825_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Iterator __call1825_8(net.minecraft.util.ClassInheritanceMultiMap a0) throws Throwable;
private static native boolean __call1825_9(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1825_10(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.entity.Entity __cast1825_11(java.lang.Object a0) throws Throwable;
private static native void __call1825_12(net.minecraft.entity.Entity a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1825_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1825_14(net.minecraft.world.World a0, net.minecraft.util.ClassInheritanceMultiMap a1) throws Throwable;
private static native java.lang.Throwable __call1182500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> boolean __sourceHandlerCall_a2da75f45711fe2df696(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws E;
private static final class __SourceHandler_a2da75f45711fe2df696 {

public static boolean f1826(net.minecraft.world.chunk.Chunk receiver, int p0, int p1) throws Throwable {
    int lexicalValue1826_66_0;
    int lexicalValue1826_87_0;
    int lexicalValue1826_99_0;
    int lexicalValue1826_103_0;
    int lexicalValue1826_110_0;
    int lexicalValue1826_114_0;
    int lexicalValue1826_120_0;
    int lexicalValue1826_149_0;
    java.lang.String spill1826_0;
    int spill1826_1;
    int spill1826_2;
    int spill1826_3;
    int spill1826_4;
    int spill1826_5;
    int spill1826_6;
    long life3_3;
    int life6_7;
    int life7_9;
    int life8_11;
    java.lang.String life5_12;
    moom.DU life9_29;
    int life10_39;
    int life11_81;
    int life10_168;
    lexical_join_149: {
    lexical_join_148: {
    lexical_join_120: {
    lexical_join_118: {
    life3_3 = (__fieldRead1826_0() ^ 88409134555505L);
    spill1826_0 = __call1826_1();
    life6_7 = __call1826_2(receiver);
    life7_9 = 0;
    life8_11 = 0;
    life5_12 = spill1826_0;
    life9_29 = new moom.DU(((__fieldRead1826_3(receiver) << 4) + p0), 0, ((__fieldRead1826_4(receiver) << 4) + p1));
    life10_39 = ((life6_7 + __invokedynamic1826_5(9267, (2224676528395817320L ^ life3_3))) - 1);
    lexical_cycle_40: while (true) {
    lexical_join_115: {
    lexical_join_114: {
    lexical_join_110: {
    lexical_join_103: {
    lexical_join_99: {
    lexical_join_98: {
    lexical_join_87: {
    lexical_join_86: {
    lexical_join_66: {
    lexical_join_55: {
    if (!((life10_39 <= __call1826_7(__fieldRead1826_6(receiver))))) {
        break lexical_join_55;
    }
    spill1826_1 = life10_39;
    if (!((life5_12 == null))) {
        lexicalValue1826_66_0 = spill1826_1;
        break lexical_join_66;
    }
    if (!((life5_12 == null))) {
        lexicalValue1826_120_0 = spill1826_1;
        break lexical_join_120;
    }
    if (!((spill1826_1 > 0))) {
        break lexical_join_118;
    }
    spill1826_2 = life8_11;
    if (!((life5_12 == null))) {
        lexicalValue1826_120_0 = spill1826_2;
        break lexical_join_120;
    }
    if (!((spill1826_2 == 0))) {
        break lexical_join_118;
    }
    }
    __call1826_10(life9_29, __call1826_8(life9_29), life10_39, __call1826_9(life9_29));
    lexicalValue1826_66_0 = __call1826_11(receiver, life9_29);
    }
    life11_81 = lexicalValue1826_66_0;
    spill1826_3 = life11_81;
    if (!((life5_12 == null))) {
        lexicalValue1826_87_0 = spill1826_3;
        break lexical_join_87;
    }
    if (!((spill1826_3 == __invokedynamic1826_12(9073, (6926330461854406202L ^ life3_3))))) {
        break lexical_join_86;
    }
    spill1826_4 = __call1826_13(life9_29);
    if (!((life5_12 == null))) {
        lexicalValue1826_87_0 = spill1826_4;
        break lexical_join_87;
    }
    if (!((spill1826_4 < __call1826_15(__fieldRead1826_14(receiver))))) {
        break lexical_join_86;
    }
    life8_11 = 1;
    }
    lexicalValue1826_87_0 = life7_9;
    }
    if (!((life5_12 == null))) {
        lexicalValue1826_99_0 = lexicalValue1826_87_0;
        break lexical_join_99;
    }
    if (!((lexicalValue1826_87_0 == 0))) {
        break lexical_join_98;
    }
    spill1826_5 = life11_81;
    if (!((life5_12 == null))) {
        lexicalValue1826_99_0 = spill1826_5;
        break lexical_join_99;
    }
    if (!((spill1826_5 > 0))) {
        break lexical_join_98;
    }
    life7_9 = 1;
    if (!((life5_12 != null))) {
        break lexical_join_115;
    }
    }
    lexicalValue1826_99_0 = life7_9;
    }
    if (!((life5_12 == null))) {
        lexicalValue1826_103_0 = lexicalValue1826_99_0;
        break lexical_join_103;
    }
    if (!((lexicalValue1826_99_0 != 0))) {
        break lexical_join_115;
    }
    lexicalValue1826_103_0 = life11_81;
    }
    if (!((life5_12 == null))) {
        lexicalValue1826_110_0 = lexicalValue1826_103_0;
        break lexical_join_110;
    }
    if (!((lexicalValue1826_103_0 == 0))) {
        break lexical_join_115;
    }
    lexicalValue1826_110_0 = __integerCategory1826_18(__call1826_17(__fieldRead1826_16(receiver), life9_29));
    }
    if (!((life5_12 == null))) {
        lexicalValue1826_114_0 = lexicalValue1826_110_0;
        break lexical_join_114;
    }
    if (!((lexicalValue1826_110_0 == 0))) {
        break lexical_join_115;
    }
    lexicalValue1826_114_0 = 0;
    }
    return __integerCategory1826_19(lexicalValue1826_114_0);
    }
    life10_39 += -1;
    if (!((life5_12 != null))) { continue lexical_cycle_40; }
    break lexical_cycle_40;
    }
    }
    lexicalValue1826_120_0 = __call1826_20(life9_29);
    }
    life10_168 = lexicalValue1826_120_0;
    lexical_cycle_121: while (true) {
    lexical_join_146: {
    lexical_join_145: {
    if (!((life10_168 > 0))) {
        break lexical_join_148;
    }
    __call1826_23(life9_29, __call1826_21(life9_29), life10_168, __call1826_22(life9_29));
    if (!((life5_12 == null))) {
        break lexical_join_146;
    }
    spill1826_6 = __call1826_25(__call1826_24(receiver, life9_29));
    if (!((life5_12 == null))) {
        lexicalValue1826_149_0 = spill1826_6;
        break lexical_join_149;
    }
    if (!((spill1826_6 > 0))) {
        break lexical_join_145;
    }
    __call1826_27(__fieldRead1826_26(receiver), life9_29);
    }
    life10_168 += -1;
    }
    if (!((life5_12 != null))) { continue lexical_cycle_121; }
    break lexical_cycle_121;
    }
    }
    lexicalValue1826_149_0 = 1;
    }
    return __integerCategory1826_28(lexicalValue1826_149_0);
}
public static void h1826_0(moom.Oo p0) throws Throwable {
    throw __call1182600_0(p0);
}
public static void h1826_1(moom.Oo p0) throws Throwable {
    throw __call1182601_0(p0);
}
public static void h1826_2(moom.Oo p0) throws Throwable {
    throw __call1182602_0(p0);
}
public static void h1826_3(moom.Oo p0) throws Throwable {
    throw __call1182603_0(p0);
}
public static void h1826_4(moom.Oo p0) throws Throwable {
    throw __call1182604_0(p0);
}
public static void h1826_5(moom.Oo p0) throws Throwable {
    throw __call1182605_0(p0);
}
public static void h1826_6(moom.Oo p0) throws Throwable {
    throw __call1182606_0(p0);
}
public static void h1826_7(moom.Oo p0) throws Throwable {
    throw __call1182607_0(p0);
}
public static void h1826_8(moom.Oo p0) throws Throwable {
    throw __call1182608_0(p0);
}
public static void h1826_9(moom.Oo p0) throws Throwable {
    throw __call1182609_0(p0);
}
public static void h1826_10(moom.Oo p0) throws Throwable {
    throw __call1182610_0(p0);
}
public static void h1826_11(moom.Oo p0) throws Throwable {
    throw __call1182611_0(p0);
}
public static void h1826_12(moom.Oo p0) throws Throwable {
    throw __call1182612_0(p0);
}
public static void h1826_13(moom.Oo p0) throws Throwable {
    throw __call1182613_0(p0);
}
public static void h1826_14(moom.Oo p0) throws Throwable {
    throw __call1182614_0(p0);
}
public static void h1826_15(moom.Oo p0) throws Throwable {
    throw __call1182615_0(p0);
}
public static void h1826_16(moom.Oo p0) throws Throwable {
    throw __call1182616_0(p0);
}
public static void h1826_17(moom.Oo p0) throws Throwable {
    throw __call1182617_0(p0);
}
public static void h1826_18(moom.Oo p0) throws Throwable {
    throw __call1182618_0(p0);
}
private static native long __fieldRead1826_0() throws Throwable;
private static native java.lang.String __call1826_1() throws Throwable;
private static native int __call1826_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1826_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1826_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1826_5(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1826_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1826_7(net.minecraft.world.World a0) throws Throwable;
private static native int __call1826_8(moom.DU a0) throws Throwable;
private static native int __call1826_9(moom.DU a0) throws Throwable;
private static native moom.DU __call1826_10(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native int __call1826_11(net.minecraft.world.chunk.Chunk a0, moom.DU a1) throws Throwable;
private static native int __invokedynamic1826_12(int a0, long a1) throws Throwable;
private static native int __call1826_13(moom.DU a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1826_14(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1826_15(net.minecraft.world.World a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1826_16(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1826_17(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native int __integerCategory1826_18(boolean value) throws Throwable;
private static native boolean __integerCategory1826_19(int value) throws Throwable;
private static native int __call1826_20(moom.DU a0) throws Throwable;
private static native int __call1826_21(moom.DU a0) throws Throwable;
private static native int __call1826_22(moom.DU a0) throws Throwable;
private static native moom.DU __call1826_23(moom.DU a0, int a1, int a2, int a3) throws Throwable;
private static native net.minecraft.block.Block __call1826_24(net.minecraft.world.chunk.Chunk a0, moom.DU a1) throws Throwable;
private static native int __call1826_25(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1826_26(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1826_27(net.minecraft.world.World a0, moom.DU a1) throws Throwable;
private static native boolean __integerCategory1826_28(int value) throws Throwable;
private static native java.lang.Throwable __call1182600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182608_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182609_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182610_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182611_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182612_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182613_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182614_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182615_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182616_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182617_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call1182618_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_90c3545da042e66e9e74(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_90c3545da042e66e9e74 {

public static void f1827(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    net.minecraft.world.chunk.Chunk lexicalValue1827_30_0;
    java.lang.String spill1827_0;
    net.minecraft.world.chunk.Chunk spill1827_1;
    long life1_3;
    java.lang.String life3_8;
    java.util.Iterator life4_13;
    net.minecraft.tileentity.TileEntity life5_20;
    net.minecraft.util.ClassInheritanceMultiMap[] life4_34;
    int life5_37;
    int life6_39;
    net.minecraft.util.ClassInheritanceMultiMap life7_46;
    lexical_join_51: {
    lexical_join_30: {
    lexical_join_29: {
    life1_3 = (__fieldRead1827_0() ^ 126167230750950L);
    spill1827_0 = __call1827_1();
    __fieldWrite1827_2(receiver, 0);
    life3_8 = spill1827_0;
    life4_13 = __call1827_5(__call1827_4(__fieldRead1827_3(receiver)));
    lexical_cycle_14: while (true) {
    if (!(__call1827_6(life4_13))) {
        break lexical_join_29;
    }
    life5_20 = __cast1827_8(__call1827_7(life4_13));
    spill1827_1 = receiver;
    if (!((life3_8 == null))) {
        lexicalValue1827_30_0 = spill1827_1;
        break lexical_join_30;
    }
    __call1827_10(__fieldRead1827_9(spill1827_1), life5_20);
    if (!((life3_8 != null))) { continue lexical_cycle_14; }
    break lexical_cycle_14;
    }
    }
    lexicalValue1827_30_0 = receiver;
    }
    life4_34 = __fieldRead1827_11(lexicalValue1827_30_0);
    life5_37 = (life4_34).length;
    life6_39 = 0;
    lexical_cycle_37: while (true) {
    if (!((life6_39 < life5_37))) {
        break lexical_join_51;
    }
    life7_46 = (life4_34)[life6_39];
    __call1827_13(__fieldRead1827_12(receiver), life7_46);
    life6_39 += 1;
    if (!((life3_8 != null))) { continue lexical_cycle_37; }
    break lexical_cycle_37;
    }
    }
    return;
}
public static void h1827_0(moom.Oo p0) throws Throwable {
    throw __call1182700_0(p0);
}
private static native long __fieldRead1827_0() throws Throwable;
private static native java.lang.String __call1827_1() throws Throwable;
private static native void __fieldWrite1827_2(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.util.Map __fieldRead1827_3(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.util.Collection __call1827_4(java.util.Map a0) throws Throwable;
private static native java.util.Iterator __call1827_5(java.util.Collection a0) throws Throwable;
private static native boolean __call1827_6(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1827_7(java.util.Iterator a0) throws Throwable;
private static native net.minecraft.tileentity.TileEntity __cast1827_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1827_9(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1827_10(net.minecraft.world.World a0, net.minecraft.tileentity.TileEntity a1) throws Throwable;
private static native net.minecraft.util.ClassInheritanceMultiMap[] __fieldRead1827_11(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1827_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __call1827_13(net.minecraft.world.World a0, net.minecraft.util.ClassInheritanceMultiMap a1) throws Throwable;
private static native java.lang.Throwable __call1182700_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_6873abdb1de0e0528279(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_6873abdb1de0e0528279 {

public static void f1173(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    int forestValue1173_22_0;
    int forestValue1173_46_0;
    int forestValue1173_46_1;
    int forestValue1173_139_0;
    int forestValue1173_141_0;
    moom.Fs forestValue1173_155_0;
    moom.Fs forestValue1173_162_0;
    int forestValue1173_210_0;
    java.lang.String spill1173_0;
    int spill1173_1;
    int spill1173_2;
    int spill1173_3;
    int spill1173_4;
    int spill1173_5;
    int spill1173_6;
    int spill1173_7;
    int spill1173_8;
    moom.Fs spill1173_9;
    int spill1173_10;
    long life1_3;
    moom.DT life4_16;
    int life5_19;
    java.lang.String life3_20;
    int life6_47;
    int life7_62;
    int life8_71;
    int life9_79;
    moom.DT life10_96;
    int life11_153;
    moom.bs[] life12_187;
    int life13_190;
    int life14_192;
    moom.bs life15_199;
    moom.DT life16_203;
    forest_join_219: {
    forest_join_218: {
    life1_3 = (__fieldRead1173_0() ^ 116059537482778L);
    life4_16 = new moom.DT((__fieldRead1173_1(receiver) << 4), 0, (__fieldRead1173_2(receiver) << 4));
    spill1173_0 = __call1173_3();
    life5_19 = 0;
    life3_20 = spill1173_0;
    forest_cycle_21: while (true) {
    forest_join_214: {
    forestValue1173_22_0 = life5_19;
    forest_cycle_22: while (true) {
    forest_join_46: {
    forest_join_39: {
    if (!((forestValue1173_22_0 < __invokedynamic1173_4(28542, (4697628063609200474L ^ life1_3))))) {
        break forest_join_219;
    }
    spill1173_1 = __fieldRead1173_5(receiver);
    spill1173_2 = __invokedynamic1173_6(13305, (1129479505784325073L ^ life1_3));
    if (!((life3_20 == null))) {
        forestValue1173_46_0 = spill1173_1;
        forestValue1173_46_1 = spill1173_2;
        break forest_join_46;
    }
    if (!((spill1173_1 >= spill1173_2))) {
        break forest_join_39;
    }
    break forest_join_218;
    }
    forestValue1173_46_0 = __fieldRead1173_7(receiver);
    forestValue1173_46_1 = __invokedynamic1173_8(9267, (2224666488447489027L ^ life1_3));
    }
    life6_47 = (forestValue1173_46_0 % forestValue1173_46_1);
    life7_62 = ((__fieldRead1173_9(receiver) / __invokedynamic1173_10(9267, (2224666488447489027L ^ life1_3))) % __invokedynamic1173_11(9267, (2224666488447489027L ^ life1_3)));
    life8_71 = (__fieldRead1173_12(receiver) / __invokedynamic1173_13(5972, (7001683487044331387L ^ life1_3)));
    net.minecraft.world.chunk.Chunk __stackOp1173_14_0 = receiver;
    __fieldWrite1173_16(__stackOp1173_14_0, (__fieldRead1173_15(__stackOp1173_14_0) + 1));
    life9_79 = 0;
    forest_cycle_80: while (true) {
    forest_join_211: {
    forest_join_210: {
    forest_join_206: {
    forest_join_169: {
    forest_join_162: {
    forest_join_155: {
    forest_join_151: {
    forest_join_141: {
    forest_join_140: {
    forest_join_139: {
    forest_join_138: {
    if (!((life9_79 < __invokedynamic1173_17(9267, (2224666488447489027L ^ life1_3))))) {
        break forest_join_214;
    }
    life10_96 = __call1173_18(life4_16, life7_62, ((life6_47 << 4) + life9_79), life8_71);
    spill1173_3 = life9_79;
    if (!((life3_20 == null))) {
        forestValue1173_22_0 = spill1173_3;
        continue forest_cycle_22;
    }
    if (!((life3_20 == null))) {
        forestValue1173_139_0 = spill1173_3;
        break forest_join_139;
    }
    if (!((spill1173_3 != 0))) {
        break forest_join_138;
    }
    spill1173_4 = life9_79;
    if (!((life3_20 == null))) {
        forestValue1173_139_0 = spill1173_4;
        break forest_join_139;
    }
    if (!((spill1173_4 != __invokedynamic1173_19(5269, (2547979560155178160L ^ life1_3))))) {
        break forest_join_138;
    }
    spill1173_5 = life7_62;
    if (!((life3_20 == null))) {
        forestValue1173_139_0 = spill1173_5;
        break forest_join_139;
    }
    if (!((spill1173_5 != 0))) {
        break forest_join_138;
    }
    spill1173_6 = life7_62;
    if (!((life3_20 == null))) {
        forestValue1173_139_0 = spill1173_6;
        break forest_join_139;
    }
    if (!((spill1173_6 != __invokedynamic1173_20(5269, (2547979560155178160L ^ life1_3))))) {
        break forest_join_138;
    }
    spill1173_7 = life8_71;
    if (!((life3_20 == null))) {
        forestValue1173_139_0 = spill1173_7;
        break forest_join_139;
    }
    if (!((spill1173_7 != 0))) {
        break forest_join_138;
    }
    spill1173_8 = life8_71;
    if (!((life3_20 == null))) {
        forestValue1173_139_0 = spill1173_8;
        break forest_join_139;
    }
    if (!((spill1173_8 == __invokedynamic1173_21(5269, (2547979560155178160L ^ life1_3))))) {
        break forest_join_140;
    }
    }
    forestValue1173_139_0 = 1;
    }
    forestValue1173_141_0 = forestValue1173_139_0;
    break forest_join_141;
    }
    forestValue1173_141_0 = 0;
    }
    life11_153 = forestValue1173_141_0;
    spill1173_9 = (__fieldRead1173_22(receiver))[life6_47];
    if (!((life3_20 == null))) {
        forestValue1173_155_0 = spill1173_9;
        break forest_join_155;
    }
    if (!((spill1173_9 == null))) {
        break forest_join_151;
    }
    if (!((life11_153 == 0))) {
        break forest_join_169;
    }
    }
    forestValue1173_155_0 = (__fieldRead1173_23(receiver))[life6_47];
    }
    if (!((life3_20 == null))) {
        forestValue1173_162_0 = forestValue1173_155_0;
        break forest_join_162;
    }
    if (!((forestValue1173_155_0 != null))) {
        break forest_join_211;
    }
    forestValue1173_162_0 = (__fieldRead1173_24(receiver))[life6_47];
    }
    if (!((__call1173_26(__call1173_25(forestValue1173_162_0, life7_62, life9_79, life8_71)) == __fieldRead1173_27()))) {
        break forest_join_211;
    }
    }
    life12_187 = __call1173_28();
    life13_190 = (life12_187).length;
    life14_192 = 0;
    forest_cycle_176: while (true) {
    forest_join_204: {
    forest_join_203: {
    if (!((life14_192 < life13_190))) {
        break forest_join_206;
    }
    life15_199 = (life12_187)[life14_192];
    life16_203 = __call1173_29(life10_96, life15_199);
    if (!((life3_20 == null))) {
        break forest_join_204;
    }
    spill1173_10 = __call1173_33(__call1173_32(__call1173_31(__fieldRead1173_30(receiver), life16_203)));
    if (!((life3_20 == null))) {
        forestValue1173_210_0 = spill1173_10;
        break forest_join_210;
    }
    if (!((spill1173_10 > 0))) {
        break forest_join_203;
    }
    __call1173_35(__fieldRead1173_34(receiver), life16_203);
    }
    life14_192 += 1;
    }
    if (!((life3_20 != null))) {
        continue forest_cycle_176;
    }
    break forest_cycle_176;
    }
    }
    forestValue1173_210_0 = __integerCategory1173_38(__call1173_37(__fieldRead1173_36(receiver), life10_96));
    }
    __discardScalar1173_39(forestValue1173_210_0);
    }
    life9_79 += 1;
    if (!((life3_20 != null))) {
        continue forest_cycle_80;
    }
    break forest_cycle_80;
    }
    break forest_cycle_22;
    }
    }
    life5_19 += 1;
    if (!((life3_20 != null))) {
        continue forest_cycle_21;
    }
    break forest_cycle_21;
    }
    break forest_join_219;
    }
    return;
    }
    return;
}
public static void h1173_0(moom.Oo p0) throws Throwable {
    throw __call3117300_0(p0);
}
public static void h1173_1(moom.Oo p0) throws Throwable {
    throw __call3117301_0(p0);
}
public static void h1173_2(moom.Oo p0) throws Throwable {
    throw __call3117302_0(p0);
}
public static void h1173_3(moom.Oo p0) throws Throwable {
    throw __call3117303_0(p0);
}
public static void h1173_4(moom.Oo p0) throws Throwable {
    throw __call3117304_0(p0);
}
public static void h1173_5(moom.Oo p0) throws Throwable {
    throw __call3117305_0(p0);
}
public static void h1173_6(moom.Oo p0) throws Throwable {
    throw __call3117306_0(p0);
}
public static void h1173_7(moom.Oo p0) throws Throwable {
    throw __call3117307_0(p0);
}
public static void h1173_8(moom.Oo p0) throws Throwable {
    throw __call3117308_0(p0);
}
public static void h1173_9(moom.Oo p0) throws Throwable {
    throw __call3117309_0(p0);
}
public static void h1173_10(moom.Oo p0) throws Throwable {
    throw __call3117310_0(p0);
}
public static void h1173_11(moom.Oo p0) throws Throwable {
    throw __call3117311_0(p0);
}
public static void h1173_12(moom.Oo p0) throws Throwable {
    throw __call3117312_0(p0);
}
public static void h1173_13(moom.Oo p0) throws Throwable {
    throw __call3117313_0(p0);
}
public static void h1173_14(moom.Oo p0) throws Throwable {
    throw __call3117314_0(p0);
}
public static void h1173_15(moom.Oo p0) throws Throwable {
    throw __call3117315_0(p0);
}
public static void h1173_16(moom.Oo p0) throws Throwable {
    throw __call3117316_0(p0);
}
public static void h1173_17(moom.Oo p0) throws Throwable {
    throw __call3117317_0(p0);
}
public static void h1173_18(moom.Oo p0) throws Throwable {
    throw __call3117318_0(p0);
}
public static void h1173_19(moom.Oo p0) throws Throwable {
    throw __call3117319_0(p0);
}
public static void h1173_20(moom.Oo p0) throws Throwable {
    throw __call3117320_0(p0);
}
private static native long __fieldRead1173_0() throws Throwable;
private static native int __fieldRead1173_1(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1173_2(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native java.lang.String __call1173_3() throws Throwable;
private static native int __invokedynamic1173_4(int a0, long a1) throws Throwable;
private static native int __fieldRead1173_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1173_6(int a0, long a1) throws Throwable;
private static native int __fieldRead1173_7(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1173_8(int a0, long a1) throws Throwable;
private static native int __fieldRead1173_9(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1173_10(int a0, long a1) throws Throwable;
private static native int __invokedynamic1173_11(int a0, long a1) throws Throwable;
private static native int __fieldRead1173_12(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __invokedynamic1173_13(int a0, long a1) throws Throwable;
private static native int __fieldRead1173_15(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite1173_16(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native int __invokedynamic1173_17(int a0, long a1) throws Throwable;
private static native moom.DT __call1173_18(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1173_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1173_20(int a0, long a1) throws Throwable;
private static native int __invokedynamic1173_21(int a0, long a1) throws Throwable;
private static native moom.Fs[] __fieldRead1173_22(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead1173_23(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.Fs[] __fieldRead1173_24(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.block.Block __call1173_25(moom.Fs a0, int a1, int a2, int a3) throws Throwable;
private static native moom.fn __call1173_26(net.minecraft.block.Block a0) throws Throwable;
private static native moom.fn __fieldRead1173_27() throws Throwable;
private static native moom.bs[] __call1173_28() throws Throwable;
private static native moom.DT __call1173_29(moom.DT a0, moom.bs a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1173_30(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.block.state.IBlockState __call1173_31(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.block.Block __call1173_32(net.minecraft.block.state.IBlockState a0) throws Throwable;
private static native int __call1173_33(net.minecraft.block.Block a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1173_34(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1173_35(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1173_36(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native boolean __call1173_37(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native int __integerCategory1173_38(boolean value) throws Throwable;
private static native void __discardScalar1173_39(int a0) throws Throwable;
private static native java.lang.Throwable __call3117300_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117301_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117302_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117303_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117304_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117305_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117306_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117307_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117308_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117309_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117310_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117311_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117312_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117313_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117314_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117315_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117316_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117317_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117318_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117319_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3117320_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_ff9f456c9f972648ab3a(net.minecraft.world.chunk.Chunk a0) throws E;
private static final class __SourceHandler_ff9f456c9f972648ab3a {

public static void f1166(net.minecraft.world.chunk.Chunk receiver) throws Throwable {
    int forestValue1166_57_0;
    int forestValue1166_61_0;
    net.minecraft.world.chunk.Chunk forestValue1166_89_0;
    int forestValue1166_89_1;
    int forestValue1166_100_0;
    int forestValue1166_124_0;
    net.minecraft.world.chunk.Chunk forestValue1166_142_0;
    java.lang.String spill1166_0;
    boolean spill1166_1;
    net.minecraft.world.chunk.Chunk spill1166_2;
    int spill1166_3;
    net.minecraft.world.chunk.Chunk spill1166_4;
    int spill1166_5;
    boolean spill1166_6;
    long life1_3;
    java.lang.String life3_8;
    moom.DT life4_24;
    int life5_62;
    int life6_73;
    java.util.Iterator life5_109;
    moom.bs life6_116;
    int life7_131;
    forest_join_144: {
    forest_join_142: {
    forest_join_141: {
    forest_join_139: {
    forest_join_137: {
    forest_join_100: {
    forest_join_98: {
    forest_join_57: {
    life1_3 = (__fieldRead1166_0() ^ 28685062972639L);
    spill1166_0 = __call1166_1();
    __fieldWrite1166_2(receiver, 1);
    life3_8 = spill1166_0;
    __fieldWrite1166_3(receiver, 1);
    life4_24 = new moom.DT((__fieldRead1166_4(receiver) << 4), 0, (__fieldRead1166_5(receiver) << 4));
    spill1166_1 = __call1166_8(__fieldRead1166_7(__fieldRead1166_6(receiver)));
    if (!((life3_8 == null))) {
        forestValue1166_57_0 = __integerCategory1166_9(spill1166_1);
        break forest_join_57;
    }
    if (!((!spill1166_1))) {
        break forest_join_144;
    }
    spill1166_2 = receiver;
    if (!((life3_8 == null))) {
        forestValue1166_142_0 = spill1166_2;
        break forest_join_142;
    }
    forestValue1166_57_0 = __integerCategory1166_18(__call1166_17(__fieldRead1166_10(spill1166_2), __call1166_11(life4_24, -1, 0, -1), __call1166_16(life4_24, __invokedynamic1166_12(9267, (2224754003560682694L ^ life1_3)), __call1166_14(__fieldRead1166_13(receiver)), __invokedynamic1166_15(9267, (2224754003560682694L ^ life1_3)))));
    }
    if (!((forestValue1166_57_0 != 0))) {
        break forest_join_141;
    }
    life5_62 = 0;
    forest_cycle_60: while (true) {
    forest_join_95: {
    forestValue1166_61_0 = life5_62;
    forest_cycle_61: while (true) {
    if (!((forestValue1166_61_0 < __invokedynamic1166_19(9267, (2224754003560682694L ^ life1_3))))) {
        break forest_join_98;
    }
    spill1166_3 = 0;
    if (!((life3_8 == null))) {
        forestValue1166_100_0 = spill1166_3;
        break forest_join_100;
    }
    life6_73 = spill1166_3;
    forest_cycle_71: while (true) {
    forest_join_92: {
    forest_join_89: {
    if (!((life6_73 < __invokedynamic1166_20(9267, (2224754003560682694L ^ life1_3))))) {
        break forest_join_95;
    }
    spill1166_4 = receiver;
    spill1166_5 = life5_62;
    if (!((life3_8 == null))) {
        forestValue1166_89_0 = spill1166_4;
        forestValue1166_89_1 = spill1166_5;
        break forest_join_89;
    }
    spill1166_6 = __call1166_21(spill1166_4, spill1166_5, life6_73);
    if (!((life3_8 == null))) {
        forestValue1166_61_0 = __integerCategory1166_22(spill1166_6);
        continue forest_cycle_61;
    }
    if (!((!spill1166_6))) {
        break forest_join_92;
    }
    forestValue1166_89_0 = receiver;
    forestValue1166_89_1 = 0;
    }
    __fieldWrite1166_23(forestValue1166_89_0, forestValue1166_89_1);
    if (!((life3_8 != null))) {
        break forest_join_98;
    }
    }
    life6_73 += 1;
    if (!((life3_8 != null))) {
        continue forest_cycle_71;
    }
    break forest_cycle_71;
    }
    break forest_cycle_61;
    }
    }
    life5_62 += 1;
    if (!((life3_8 != null))) {
        continue forest_cycle_60;
    }
    break forest_cycle_60;
    }
    }
    forestValue1166_100_0 = __integerCategory1166_25(__fieldRead1166_24(receiver));
    }
    if (!((forestValue1166_100_0 != 0))) {
        break forest_join_144;
    }
    life5_109 = __call1166_27(__fieldRead1166_26());
    forest_cycle_104: while (true) {
    forest_join_124: {
    forest_join_123: {
    if (!(__call1166_28(life5_109))) {
        break forest_join_137;
    }
    life6_116 = __cast1166_30(__call1166_29(life5_109));
    if (!((life3_8 == null))) {
        break forest_join_139;
    }
    if (!((__call1166_31(life6_116) == __fieldRead1166_32()))) {
        break forest_join_123;
    }
    forestValue1166_124_0 = __invokedynamic1166_33(9267, (2224754003560682694L ^ life1_3));
    break forest_join_124;
    }
    forestValue1166_124_0 = 1;
    }
    life7_131 = forestValue1166_124_0;
    __call1166_38(__call1166_36(__fieldRead1166_34(receiver), __call1166_35(life4_24, life6_116, life7_131)), __call1166_37(life6_116));
    if (!((life3_8 != null))) {
        continue forest_cycle_104;
    }
    break forest_cycle_104;
    }
    }
    __call1166_39(receiver);
    }
    if (!((life3_8 != null))) {
        break forest_join_144;
    }
    }
    forestValue1166_142_0 = receiver;
    }
    __fieldWrite1166_40(forestValue1166_142_0, 0);
    }
    return;
}
public static void h1166_0(moom.Oo p0) throws Throwable {
    throw __call3116600_0(p0);
}
public static void h1166_1(moom.Oo p0) throws Throwable {
    throw __call3116601_0(p0);
}
public static void h1166_2(moom.Oo p0) throws Throwable {
    throw __call3116602_0(p0);
}
public static void h1166_3(moom.Oo p0) throws Throwable {
    throw __call3116603_0(p0);
}
public static void h1166_4(moom.Oo p0) throws Throwable {
    throw __call3116604_0(p0);
}
public static void h1166_5(moom.Oo p0) throws Throwable {
    throw __call3116605_0(p0);
}
public static void h1166_6(moom.Oo p0) throws Throwable {
    throw __call3116606_0(p0);
}
public static void h1166_7(moom.Oo p0) throws Throwable {
    throw __call3116607_0(p0);
}
public static void h1166_8(moom.Oo p0) throws Throwable {
    throw __call3116608_0(p0);
}
private static native long __fieldRead1166_0() throws Throwable;
private static native java.lang.String __call1166_1() throws Throwable;
private static native void __fieldWrite1166_2(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native void __fieldWrite1166_3(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native int __fieldRead1166_4(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __fieldRead1166_5(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native net.minecraft.world.World __fieldRead1166_6(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead1166_7(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call1166_8(moom.EA a0) throws Throwable;
private static native int __integerCategory1166_9(boolean value) throws Throwable;
private static native net.minecraft.world.World __fieldRead1166_10(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.DT __call1166_11(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native int __invokedynamic1166_12(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1166_13(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __call1166_14(net.minecraft.world.World a0) throws Throwable;
private static native int __invokedynamic1166_15(int a0, long a1) throws Throwable;
private static native moom.DT __call1166_16(moom.DT a0, int a1, int a2, int a3) throws Throwable;
private static native boolean __call1166_17(net.minecraft.world.World a0, moom.DT a1, moom.DT a2) throws Throwable;
private static native int __integerCategory1166_18(boolean value) throws Throwable;
private static native int __invokedynamic1166_19(int a0, long a1) throws Throwable;
private static native int __invokedynamic1166_20(int a0, long a1) throws Throwable;
private static native boolean __call1166_21(net.minecraft.world.chunk.Chunk a0, int a1, int a2) throws Throwable;
private static native int __integerCategory1166_22(boolean value) throws Throwable;
private static native void __fieldWrite1166_23(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native boolean __fieldRead1166_24(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int __integerCategory1166_25(boolean value) throws Throwable;
private static native net.minecraft.util.EnumFacing$Plane __fieldRead1166_26() throws Throwable;
private static native java.util.Iterator __call1166_27(net.minecraft.util.EnumFacing$Plane a0) throws Throwable;
private static native boolean __call1166_28(java.util.Iterator a0) throws Throwable;
private static native java.lang.Object __call1166_29(java.util.Iterator a0) throws Throwable;
private static native moom.bs __cast1166_30(java.lang.Object a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection __call1166_31(moom.bs a0) throws Throwable;
private static native net.minecraft.util.EnumFacing$AxisDirection __fieldRead1166_32() throws Throwable;
private static native int __invokedynamic1166_33(int a0, long a1) throws Throwable;
private static native net.minecraft.world.World __fieldRead1166_34(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.DT __call1166_35(moom.DT a0, moom.bs a1, int a2) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __call1166_36(net.minecraft.world.World a0, moom.DT a1) throws Throwable;
private static native moom.bs __call1166_37(moom.bs a0) throws Throwable;
private static native void __call1166_38(net.minecraft.world.chunk.Chunk a0, moom.bs a1) throws Throwable;
private static native void __call1166_39(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native void __fieldWrite1166_40(net.minecraft.world.chunk.Chunk a0, int a1) throws Throwable;
private static native java.lang.Throwable __call3116600_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116601_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116602_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116603_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116604_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116605_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116606_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116607_0(moom.Oo a0) throws Throwable;
private static native java.lang.Throwable __call3116608_0(moom.Oo a0) throws Throwable;

}


private void i() {
java.util.Arrays.fill(((boolean[])(this.e)), ((boolean)(true)));
    ((net.minecraft.world.chunk.Chunk)(this)).a(((boolean)(false)));
    return;
}


public void b(boolean p0) { __sourceHandlerCall_f5fbb34aecc4edae3849(this, p0); }


public boolean b(int p0, int p1) { return __sourceHandlerCall_84aa463c5e82c5dae2be(this, p0, p1); }


public net.minecraft.block.Block b__ch(int p0, int p1, int p2) {
long local4 = (net.minecraft.world.chunk.Chunk.y ^ 29599118672730L);
    try {
        return ((net.minecraft.world.chunk.Chunk)(this)).a__ch(((int)((p0 & __sourceIntrinsic_459a1bdbfa69_invokedynamic12621_1(5269, (2547997855095981040L ^ local4))))), ((int)(p1)), ((int)((p2 & __sourceIntrinsic_459a1bdbfa69_invokedynamic12621_2(5269, (2547997855095981040L ^ local4))))));
    } catch (moom.Oo caught6) {
        moom.qZ local7 = ((moom.qY)(((moom.Oo)(caught6)).a())).a(((java.lang.String)("Block being got")));
        ((moom.qZ)(local7)).a(((java.lang.String)("Location")), ((java.util.concurrent.Callable)(__sourceIntrinsic_459a1bdbfa69_invokedynamic12621_6(this, p0, p1, p2))));
        throw caught6;
    }
}


public boolean b__Boolean() { return __sourceHandlerCall_22c0f9ee334c3dfdb41f(this); }


private int b(int p0, int p1, int p2) { return __sourceHandlerCall_3ed6323c5572c216ca5f(this, p0, p1, p2); }


public void b(net.minecraft.entity.Entity p0) {
((net.minecraft.world.chunk.Chunk)(this)).a(((net.minecraft.entity.Entity)(p0)), ((int)(((net.minecraft.entity.Entity)(p0)).X)));
    return;
}


public static java.lang.String b__String() {
return net.minecraft.world.chunk.Chunk.x;
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
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 20074);
    if (((net.minecraft.world.chunk.Chunk.F)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (net.minecraft.world.chunk.Chunk.E)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(net.minecraft.world.chunk.Chunk.G)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(net.minecraft.world.chunk.Chunk.G)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("moom/Fk", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (net.minecraft.world.chunk.Chunk.F)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((net.minecraft.world.chunk.Chunk.F)[life3_8])).longValue();
}


private static long b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = net.minecraft.world.chunk.Chunk.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12625_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public static void b(java.lang.String p0) {
x = ((java.lang.String)(p0));
    return;
}


public void b(long p0) {
this.u = ((long)(p0));
    return;
}


public int b() {
return this.t;
}


private void b__Void(int p0, int p1, int p2) { __sourceHandlerCall_487c670f131b91df1325(this, p0, p1, p2); }


public void b__Void() { __sourceHandlerCall_348e22dbc00fde3e0b67(this); }


public int b(moom.DT p0) {
return ((net.minecraft.block.Block)(((net.minecraft.world.chunk.Chunk)(this)).a__ch(((moom.DT)(p0))))).a__Int();
}


public boolean e__Boolean() {
return ((((this.o) ? 1 : 0)) != 0);
}


public void e() {
this.q = ((boolean)(true));
    return;
}


public void e(boolean p0) {
this.o = ((boolean)(p0));
    return;
}


public void c() { __sourceHandlerCall_43925fe55e8e761956b8(this); }


private boolean c(int p0, int p1) { return __sourceHandlerCall_a2da75f45711fe2df696(this, p0, p1); }


public boolean c__Boolean() {
return ((((this.f) ? 1 : 0)) != 0);
}


public void c(boolean p0) {
this.f = ((boolean)(p0));
    return;
}


public int c(moom.DT p0) {
long local2 = (net.minecraft.world.chunk.Chunk.y ^ 73040907840236L);
    return ((net.minecraft.world.chunk.Chunk)(this)).b(((int)((((moom.DT)(p0)).a() & __sourceIntrinsic_ad22be2f9b9c_originalDynamicSite2071_2(5269, (2547935717579680326L ^ local2))))), ((int)(((moom.DT)(p0)).b())), ((int)((((moom.DT)(p0)).c() & __sourceIntrinsic_ad22be2f9b9c_originalDynamicSite2071_5(5269, (2547935717579680326L ^ local2))))));
}


public void h() { __sourceHandlerCall_ff9f456c9f972648ab3a(this); }


public void f(boolean p0) {
this.q = ((boolean)(p0));
    return;
}


public void f() {
this.v = ((int)(0));
    return;
}


public void d(boolean p0) {
this.n = ((boolean)(p0));
    return;
}


public void d() { __sourceHandlerCall_90c3545da042e66e9e74(this); }


public boolean d__Boolean() {
return ((((this.n) ? 1 : 0)) != 0);
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = net.minecraft.world.chunk.Chunk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int[] a__ArrayInt() {
return this.h;
}


public net.minecraft.world.World a__Eu() {
return this.g;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 31599;
      if (B[var3] == null) {
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
         long var5 = A[var3];
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
         Object[] var9 = (Object[])C.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               C.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/Fk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         B[var3] = var15;
      }

      return B[var3];
}


public boolean a__Boolean(int p0, int p1) { return __sourceHandlerCall_4e1150ae8a9c25f62df7(this, p0, p1); }


public int a(moom.DT p0) {
long local2 = (net.minecraft.world.chunk.Chunk.y ^ 88299893067560L);
    return ((net.minecraft.world.chunk.Chunk)(this)).a(((int)((((moom.DT)(p0)).a() & __sourceIntrinsic_d85576047056_originalDynamicSite2072_2(5269, (2547916067053948802L ^ local2))))), ((int)((((moom.DT)(p0)).c() & __sourceIntrinsic_d85576047056_originalDynamicSite2072_4(5269, (2547916067053948802L ^ local2))))));
}


private void a(boolean p0) { __sourceHandlerCall_4b6d3c3ec7fe819a55be(this, p0); }


private void a(moom.bs p0) { __sourceHandlerCall_5ef3c2e10cbddc31c0ce(this, p0); }


public int a(int p0, int p1) {
return (this.h)[((p1 << 4) | p0)];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral12635_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/Fk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public moom.Fs[] a__ArrayFs() {
return this.b;
}


protected void a__Void() { __sourceHandlerCall_29cb1090906b6439f94d(this); }


public long a__Long() {
return this.u;
}


public void a__Void(long p0) {
this.s = ((long)(p0));
    return;
}


private void a__Void(int p0, int p1) {
long local3 = (net.minecraft.world.chunk.Chunk.y ^ 9475032380411L);
    (this.e)[(p0 + (p1 * __sourceIntrinsic_02b72693edd3_originalDynamicSite2073_2(9267, (2224773209328288738L ^ local3))))] = true;
    this.k = ((boolean)(true));
    return;
}


public void a(int[] p0) { __sourceHandlerCall_10e62c1414c059aa79da(this, p0); }


public java.util.Map<moom.DT, net.minecraft.tileentity.TileEntity> a__Map() {
return this.l;
}


public net.minecraft.util.ClassInheritanceMultiMap<net.minecraft.entity.Entity>[] a__ArrayOE() {
return this.m;
}


private static java.lang.Throwable a(java.lang.Throwable p0) {
return p0;
}


public int a() { return __sourceHandlerCall_60ce0a295f9edfcba0d2(this); }


public net.minecraft.tileentity.TileEntity a(moom.DT p0, net.minecraft.world.chunk.Chunk$EnumCreateEntityType p1) { return __sourceHandlerCall_f031c5cf727d01311bbd(this, p0, p1); }


private net.minecraft.tileentity.TileEntity a__B9(moom.DT p0) { return __sourceHandlerCall_f6d4f180c473d6eaaa11(this, p0); }


public boolean a__Boolean(moom.DT p0) { return __sourceHandlerCall_4399e68ba65a68b023d2(this, p0); }


public void a(net.minecraft.entity.Entity p0, int p1) { __sourceHandlerCall_1f2b244ec63149e2ec16(this, p0, p1); }


public void a__Void(moom.DT p0) { __sourceHandlerCall_b1c9a6d255def766a591(this, p0); }


public void a(moom.DT p0, net.minecraft.tileentity.TileEntity p1) { __sourceHandlerCall_6228750a79b053b6af52(this, p0, p1); }


private net.minecraft.block.Block a__ch(int p0, int p1, int p2) { return __sourceHandlerCall_9faef396086c0c7c6708(this, p0, p1, p2); }


public void a(net.minecraft.tileentity.TileEntity p0) { __sourceHandlerCall_5f4a3dba1659c6e634b8(this, p0); }


public net.minecraft.block.state.IBlockState a(moom.DT p0, net.minecraft.block.state.IBlockState p1) { return __sourceHandlerCall_93f428fdc04fb10edfad(this, p0, p1); }


private int a(int p0, int p1, int p2) {
return ((net.minecraft.block.Block)(((net.minecraft.world.chunk.Chunk)(this)).a__ch(((int)(p0)), ((int)(p1)), ((int)(p2))))).a__Int();
}


public net.minecraft.block.state.IBlockState a__fE(moom.DT p0) { return __sourceHandlerCall_38d178d3a829fe6b1842(this, p0); }


public net.minecraft.block.Block a__ch(moom.DT p0) {
long local2 = (net.minecraft.world.chunk.Chunk.y ^ 45780819909415L);
    try {
        return ((net.minecraft.world.chunk.Chunk)(this)).a__ch(((int)((((moom.DT)(p0)).a() & __sourceIntrinsic_15f917cd2432_invokedynamic12649_2(5269, (2548049770354727821L ^ local2))))), ((int)(((moom.DT)(p0)).b())), ((int)((((moom.DT)(p0)).c() & __sourceIntrinsic_15f917cd2432_invokedynamic12649_5(5269, (2548049770354727821L ^ local2))))));
    } catch (moom.Oo caught4) {
        moom.qZ local5 = ((moom.qY)(((moom.Oo)(caught4)).a())).a(((java.lang.String)("Block being got")));
        ((moom.qZ)(local5)).a(((java.lang.String)("Location")), ((java.util.concurrent.Callable)(__sourceIntrinsic_15f917cd2432_invokedynamic12649_9(p0))));
        throw caught4;
    }
}


public void a(net.minecraft.entity.Entity p0) { __sourceHandlerCall_68aa4d810ebc15e5b6c5(this, p0); }


public int a(moom.DT p0, int p1) { return __sourceHandlerCall_e1773f849446d63e77ee(this, p0, p1); }


public void a(net.minecraft.world.EnumSkyBlock p0, moom.DT p1, int p2) { __sourceHandlerCall_b3929f4f0047fc07928e(this, p0, p1, p2); }


public int a(net.minecraft.world.EnumSkyBlock p0, moom.DT p1) { return __sourceHandlerCall_ec92fd3b48da0bcf7b4f(this, p0, p1); }


public void a(moom.Fs[] p0) { __sourceHandlerCall_535a5df82a6a0474300f(this, p0); }


private void a__Void(int p0, int p1, int p2) { __sourceHandlerCall_b66c734f7ac51e6fa726(this, p0, p1, p2); }


public moom.Ee a__Ee() {
return new moom.Ee(this.i, this.j);
}


private void a(int p0, int p1, int p2, int p3) { __sourceHandlerCall_e3d04987767b8a1258d6(this, p0, p1, p2, p3); }


public void a(byte[] p0) { __sourceHandlerCall_4038cf25f55bed9ba1cc(this, p0); }


public byte[] a__ArrayByte() {
return this.c;
}


public net.minecraft.world.biome.BiomeGenBase a(moom.DT p0, net.minecraft.world.biome.WorldChunkManager p1) { return __sourceHandlerCall_1a8ac5802a5a5ecc36b0(this, p0, p1); }


public void a(byte[] p0, int p1, boolean p2) { __sourceHandlerCall_f753a0ae3c32c3f8bd25(this, p0, p1, p2); }


public void a(moom.Fn p0, moom.Fn p1, int p2, int p3) { __sourceHandlerCall_3d10618f392e980c7dde(this, p0, p1, p2, p3); }


public boolean a__Boolean() {
return ((0) != 0);
}


public <T extends net.minecraft.entity.Entity> void a(java.lang.Class<? extends T> p0, moom.CA p1, java.util.List<T> p2, com.google.common.base.Predicate<? super T> p3) { __sourceHandlerCall_12086451a11a601c8541(this, p0, p1, p2, p3); }


public boolean a__Boolean(boolean p0) { return __sourceHandlerCall_223492bd4a8201b34008(this, p0); }


public java.util.Random a(long p0) {
long local3 = (net.minecraft.world.chunk.Chunk.y ^ 38960388010523L);
    return new java.util.Random((((((((net.minecraft.world.World)(this.g)).a__Long() + ((((long) this.i) * ((long) this.i)) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_5(1938, (8039068394176255159L ^ local3)))) + (((long) this.i) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_7(18770, (7601370327904442998L ^ local3)))) + ((((long) this.j) * ((long) this.j)) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_10(26303, (4200710535456028056L ^ local3)))) + (((long) this.j) * __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_12(29456, (3861530233693364278L ^ local3)))) ^ p0));
}


public void a(net.minecraft.entity.Entity p0, moom.CA p1, java.util.List<net.minecraft.entity.Entity> p2, com.google.common.base.Predicate<? super net.minecraft.entity.Entity> p3) { __sourceHandlerCall_461968754145f61117c7(this, p0, p1, p2, p3); }


public moom.DT a__DT(moom.DT p0) { return __sourceHandlerCall_cb5cca18d9090e3da611(this, p0); }


public void g() { __sourceHandlerCall_6873abdb1de0e0528279(this); }


public void g(boolean p0) {
this.r = ((boolean)(p0));
    return;
}


private static java.lang.String lambda$getBlock$1(moom.DT p0) throws java.lang.Exception {
return moom.qZ.a(((moom.DT)(p0)));
}


private java.lang.String lambda$getBlock$0(int p0, int p1, int p2) throws java.lang.Exception {
long local4 = (net.minecraft.world.chunk.Chunk.y ^ 5708406595921L);
    return moom.qZ.a(((moom.DT)(new moom.DT(((this.i * __sourceIntrinsic_58184c31e4e6_originalDynamicSite2075_2(9267, (2224768171262202184L ^ local4))) + p0), p1, ((this.j * __sourceIntrinsic_58184c31e4e6_originalDynamicSite2075_4(9267, (2224768171262202184L ^ local4))) + p2)))));
}


private static java.lang.String lambda$getBlockState$2(moom.DT p0) throws java.lang.Exception {
return moom.qZ.a(((moom.DT)(p0)));
}


private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_5(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_7(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_10(int a0, long a1) throws E;

private static native <E extends Throwable> long __sourceIntrinsic_8226ceefacb8_originalDynamicSite2074_12(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral12635_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_originalDynamicSite2072_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_originalDynamicSite2072_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_02b72693edd3_originalDynamicSite2073_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15f917cd2432_invokedynamic12649_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_15f917cd2432_invokedynamic12649_5(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_15f917cd2432_invokedynamic12649_9(moom.DT a0) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral12625_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_459a1bdbfa69_invokedynamic12621_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_459a1bdbfa69_invokedynamic12621_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_459a1bdbfa69_invokedynamic12621_6(net.minecraft.world.chunk.Chunk a0, int a1, int a2, int a3) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad22be2f9b9c_originalDynamicSite2071_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_ad22be2f9b9c_originalDynamicSite2071_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_58184c31e4e6_originalDynamicSite2075_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_58184c31e4e6_originalDynamicSite2075_4(int a0, long a1) throws E;
}
