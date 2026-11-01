package moom;

import io.netty.buffer.ByteBuf;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class z8 implements moom.yK<moom.y2> {

private int[] a;

private int[] b;

private moom.z2[] c;

private boolean d;

private static long e;

private static long[] f;

private static java.lang.Integer[] g;

private static java.util.Map h;

public z8() {
super();
}


public z8(java.util.List<net.minecraft.world.chunk.Chunk> p0) { super(); __sourceHandlerCall_4c82348c8211a337e0a3(this, p0); }


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-9161431326396789676L)), ((long)(586247544078821881L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(270505769261996L)))));
    h = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (moom.z8.e ^ 110472040927095L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill1141_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1141_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1141_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1141_14 = new byte[8];
    (__sourceSpill1141_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill1141_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation1141_16 = __sourceSpill1141_14;
    ((javax.crypto.Cipher)(__sourceSpill1141_11)).init(((int)(__sourceSpill1141_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1141_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1141_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "zzTqÞ\r7\0230ø|F¹"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill1141_25 = local6_life21;
        int __sourceSpill1141_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1141_25)).substring(((int)(__sourceSpill1141_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1141_30 = local8_life19;
        int __sourceSpill1141_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill1141_33 = new byte[8];
        (__sourceSpill1141_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill1141_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill1141_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill1141_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill1141_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill1141_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill1141_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill1141_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill1141_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill1141_34)).doFinal(((byte[])(__sourceSpill1141_33)));
        (__sourceSpill1141_30)[__sourceSpill1141_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    f = ((long[])(local8_life19));
    g = ((java.lang.Integer[])(new java.lang.Integer[2]));
}

private static native <E extends Throwable> void __sourceHandlerCall_4c82348c8211a337e0a3(moom.z8 a0, java.util.List a1) throws E;
private static final class __SourceHandler_4c82348c8211a337e0a3 {

public static void f515(moom.z8 receiver, java.util.List p0) throws Throwable {
    moom.z8 forestValue515_35_0;
    int forestValue515_35_1;
    moom.z8 forestValue515_36_0;
    moom.z8 forestValue515_37_0;
    int forestValue515_37_1;
    int[] spill515_0;
    moom.z8 spill515_1;
    boolean spill515_2;
    long life2_3;
    int life5_9;
    int[] life4_18;
    int life6_40;
    net.minecraft.world.chunk.Chunk life7_48;
    moom.z2 life8_59;
    forest_join_79: {
    forest_join_37: {
    forest_join_36: {
    forest_join_35: {
    life2_3 = (__fieldRead515_0() ^ 57163270522917L);
    __directSuperInit515_1(receiver);
    spill515_0 = __call515_2();
    life5_9 = __call515_3(p0);
    __fieldWrite515_4(receiver, new int[life5_9]);
    __fieldWrite515_5(receiver, new int[life5_9]);
    life4_18 = spill515_0;
    __fieldWrite515_6(receiver, new moom.z2[life5_9]);
    spill515_1 = receiver;
    spill515_2 = __call515_11(__fieldRead515_10(__call515_9(__cast515_8(__call515_7(p0, 0)))));
    if (!((life4_18 == null))) {
        forestValue515_35_0 = spill515_1;
        forestValue515_35_1 = __integerCategory515_12(spill515_2);
        break forest_join_35;
    }
    if (!((!spill515_2))) {
        forestValue515_36_0 = spill515_1;
        break forest_join_36;
    }
    forestValue515_35_0 = spill515_1;
    forestValue515_35_1 = 1;
    }
    forestValue515_37_0 = forestValue515_35_0;
    forestValue515_37_1 = forestValue515_35_1;
    break forest_join_37;
    }
    forestValue515_37_0 = forestValue515_36_0;
    forestValue515_37_1 = 0;
    }
    __fieldWrite515_13(forestValue515_37_0, forestValue515_37_1);
    life6_40 = 0;
    forest_cycle_40: while (true) {
    if (!((life6_40 < life5_9))) {
        break forest_join_79;
    }
    life7_48 = __cast515_15(__call515_14(p0, life6_40));
    life8_59 = __call515_18(life7_48, 1, __fieldRead515_16(receiver), __invokedynamic515_17(3672, (6122050971613907669L ^ life2_3)));
    (__fieldRead515_19(receiver))[life6_40] = __fieldRead515_20(life7_48);
    (__fieldRead515_21(receiver))[life6_40] = __fieldRead515_22(life7_48);
    (__fieldRead515_23(receiver))[life6_40] = life8_59;
    life6_40 += 1;
    if (!((life4_18 != null))) {
        continue forest_cycle_40;
    }
    break forest_cycle_40;
    }
    }
    return;
}
public static void h515_0(moom.Oo p0) throws Throwable {
    throw __call3051500_0(p0);
}
private static native long __fieldRead515_0() throws Throwable;
private static native void __directSuperInit515_1(moom.z8 a0) throws Throwable;
private static native int[] __call515_2() throws Throwable;
private static native int __call515_3(java.util.List a0) throws Throwable;
private static native void __fieldWrite515_4(moom.z8 a0, int[] a1) throws Throwable;
private static native void __fieldWrite515_5(moom.z8 a0, int[] a1) throws Throwable;
private static native void __fieldWrite515_6(moom.z8 a0, moom.z2[] a1) throws Throwable;
private static native java.lang.Object __call515_7(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast515_8(java.lang.Object a0) throws Throwable;
private static native net.minecraft.world.World __call515_9(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.EA __fieldRead515_10(net.minecraft.world.World a0) throws Throwable;
private static native boolean __call515_11(moom.EA a0) throws Throwable;
private static native int __integerCategory515_12(boolean value) throws Throwable;
private static native void __fieldWrite515_13(moom.z8 a0, int a1) throws Throwable;
private static native java.lang.Object __call515_14(java.util.List a0, int a1) throws Throwable;
private static native net.minecraft.world.chunk.Chunk __cast515_15(java.lang.Object a0) throws Throwable;
private static native boolean __fieldRead515_16(moom.z8 a0) throws Throwable;
private static native int __invokedynamic515_17(int a0, long a1) throws Throwable;
private static native moom.z2 __call515_18(net.minecraft.world.chunk.Chunk a0, int a1, boolean a2, int a3) throws Throwable;
private static native int[] __fieldRead515_19(moom.z8 a0) throws Throwable;
private static native int __fieldRead515_20(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native int[] __fieldRead515_21(moom.z8 a0) throws Throwable;
private static native int __fieldRead515_22(net.minecraft.world.chunk.Chunk a0) throws Throwable;
private static native moom.z2[] __fieldRead515_23(moom.z8 a0) throws Throwable;
private static native java.lang.Exception __call3051500_0(moom.Oo a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_2c7d6bd7e5e3c38c7ff0(moom.z8 a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_2c7d6bd7e5e3c38c7ff0 {

public static void f1247(moom.z8 receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int[] spill1247_0;
    long life2_3;
    int[] life4_9;
    int life5_12;
    int life6_26;
    lexical_join_99: {
    lexical_join_85: {
    lexical_join_83: {
    life2_3 = (__fieldRead1247_0() ^ 38429700795359L);
    spill1247_0 = __call1247_1();
    __fieldWrite1247_3(receiver, __call1247_2(p0));
    life4_9 = spill1247_0;
    life5_12 = __call1247_4(p0);
    __fieldWrite1247_5(receiver, new int[life5_12]);
    __fieldWrite1247_6(receiver, new int[life5_12]);
    __fieldWrite1247_7(receiver, new moom.z2[life5_12]);
    life6_26 = 0;
    lexical_cycle_27: while (true) {
    if (!((life6_26 < life5_12))) {
        break lexical_join_83;
    }
    (__fieldRead1247_8(receiver))[life6_26] = __call1247_9(p0);
    (__fieldRead1247_10(receiver))[life6_26] = __call1247_11(p0);
    (__fieldRead1247_12(receiver))[life6_26] = new moom.z2();
    __fieldWrite1247_16((__fieldRead1247_13(receiver))[life6_26], (__call1247_14(p0) & __invokedynamic1247_15(3672, (6122069623570753839L ^ life2_3))));
    __fieldWrite1247_23((__fieldRead1247_17(receiver))[life6_26], new byte[__call1247_22(__call1247_20(__fieldRead1247_19((__fieldRead1247_18(receiver))[life6_26])), __fieldRead1247_21(receiver), 1)]);
    life6_26 += 1;
    if (!((life4_9 == null))) {
        break lexical_join_85;
    }
    if (!((life4_9 != null))) { continue lexical_cycle_27; }
    break lexical_cycle_27;
    }
    }
    life6_26 = 0;
    }
    lexical_cycle_85: while (true) {
    if (!((life6_26 < life5_12))) {
        break lexical_join_99;
    }
    __call1247_26(p0, __fieldRead1247_25((__fieldRead1247_24(receiver))[life6_26]));
    life6_26 += 1;
    if (!((life4_9 != null))) { continue lexical_cycle_85; }
    break lexical_cycle_85;
    }
    }
    return;
}
public static void h1247_0(java.io.IOException p0) throws Throwable {
    throw __call1124700_0(p0);
}
public static void h1247_1(java.io.IOException p0) throws Throwable {
    throw __call1124701_0(p0);
}
private static native long __fieldRead1247_0() throws Throwable;
private static native int[] __call1247_1() throws Throwable;
private static native boolean __call1247_2(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1247_3(moom.z8 a0, boolean a1) throws Throwable;
private static native int __call1247_4(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native void __fieldWrite1247_5(moom.z8 a0, int[] a1) throws Throwable;
private static native void __fieldWrite1247_6(moom.z8 a0, int[] a1) throws Throwable;
private static native void __fieldWrite1247_7(moom.z8 a0, moom.z2[] a1) throws Throwable;
private static native int[] __fieldRead1247_8(moom.z8 a0) throws Throwable;
private static native int __call1247_9(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int[] __fieldRead1247_10(moom.z8 a0) throws Throwable;
private static native int __call1247_11(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native moom.z2[] __fieldRead1247_12(moom.z8 a0) throws Throwable;
private static native moom.z2[] __fieldRead1247_13(moom.z8 a0) throws Throwable;
private static native short __call1247_14(net.minecraft.network.PacketBuffer a0) throws Throwable;
private static native int __invokedynamic1247_15(int a0, long a1) throws Throwable;
private static native void __fieldWrite1247_16(moom.z2 a0, int a1) throws Throwable;
private static native moom.z2[] __fieldRead1247_17(moom.z8 a0) throws Throwable;
private static native moom.z2[] __fieldRead1247_18(moom.z8 a0) throws Throwable;
private static native int __fieldRead1247_19(moom.z2 a0) throws Throwable;
private static native int __call1247_20(int a0) throws Throwable;
private static native boolean __fieldRead1247_21(moom.z8 a0) throws Throwable;
private static native int __call1247_22(int a0, boolean a1, int a2) throws Throwable;
private static native void __fieldWrite1247_23(moom.z2 a0, byte[] a1) throws Throwable;
private static native moom.z2[] __fieldRead1247_24(moom.z8 a0) throws Throwable;
private static native byte[] __fieldRead1247_25(moom.z2 a0) throws Throwable;
private static native ByteBuf __call1247_26(net.minecraft.network.PacketBuffer a0, byte[] a1) throws Throwable;
private static native java.lang.Exception __call1124700_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1124701_0(java.io.IOException a0) throws Throwable;

}

private static native <E extends Throwable> void __sourceHandlerCall_231e93c137f169038feb(moom.z8 a0, net.minecraft.network.PacketBuffer a1) throws E;
private static final class __SourceHandler_231e93c137f169038feb {

public static void f1248(moom.z8 receiver, net.minecraft.network.PacketBuffer p0) throws Throwable {
    int[] spill1248_0;
    long life2_3;
    int[] life4_10;
    int life5_17;
    lexical_join_75: {
    lexical_join_59: {
    lexical_join_57: {
    life2_3 = (__fieldRead1248_0() ^ 92524047464534L);
    spill1248_0 = __call1248_1();
    __call1248_3(p0, __fieldRead1248_2(receiver));
    life4_10 = spill1248_0;
    __call1248_5(p0, (__fieldRead1248_4(receiver)).length);
    life5_17 = 0;
    lexical_cycle_18: while (true) {
    if (!((life5_17 < (__fieldRead1248_6(receiver)).length))) {
        break lexical_join_57;
    }
    __call1248_8(p0, (__fieldRead1248_7(receiver))[life5_17]);
    __call1248_10(p0, (__fieldRead1248_9(receiver))[life5_17]);
    __call1248_14(p0, ((short) (__fieldRead1248_12((__fieldRead1248_11(receiver))[life5_17]) & __invokedynamic1248_13(30450, (8895348002976678413L ^ life2_3)))));
    life5_17 += 1;
    if (!((life4_10 == null))) {
        break lexical_join_59;
    }
    if (!((life4_10 != null))) { continue lexical_cycle_18; }
    break lexical_cycle_18;
    }
    }
    life5_17 = 0;
    }
    lexical_cycle_59: while (true) {
    if (!((life5_17 < (__fieldRead1248_15(receiver)).length))) {
        break lexical_join_75;
    }
    __call1248_18(p0, __fieldRead1248_17((__fieldRead1248_16(receiver))[life5_17]));
    life5_17 += 1;
    if (!((life4_10 != null))) { continue lexical_cycle_59; }
    break lexical_cycle_59;
    }
    }
    return;
}
public static void h1248_0(java.io.IOException p0) throws Throwable {
    throw __call1124800_0(p0);
}
public static void h1248_1(java.io.IOException p0) throws Throwable {
    throw __call1124801_0(p0);
}
private static native long __fieldRead1248_0() throws Throwable;
private static native int[] __call1248_1() throws Throwable;
private static native boolean __fieldRead1248_2(moom.z8 a0) throws Throwable;
private static native ByteBuf __call1248_3(net.minecraft.network.PacketBuffer a0, boolean a1) throws Throwable;
private static native moom.z2[] __fieldRead1248_4(moom.z8 a0) throws Throwable;
private static native void __call1248_5(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int[] __fieldRead1248_6(moom.z8 a0) throws Throwable;
private static native int[] __fieldRead1248_7(moom.z8 a0) throws Throwable;
private static native ByteBuf __call1248_8(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native int[] __fieldRead1248_9(moom.z8 a0) throws Throwable;
private static native ByteBuf __call1248_10(net.minecraft.network.PacketBuffer a0, int a1) throws Throwable;
private static native moom.z2[] __fieldRead1248_11(moom.z8 a0) throws Throwable;
private static native int __fieldRead1248_12(moom.z2 a0) throws Throwable;
private static native int __invokedynamic1248_13(int a0, long a1) throws Throwable;
private static native ByteBuf __call1248_14(net.minecraft.network.PacketBuffer a0, short a1) throws Throwable;
private static native int[] __fieldRead1248_15(moom.z8 a0) throws Throwable;
private static native moom.z2[] __fieldRead1248_16(moom.z8 a0) throws Throwable;
private static native byte[] __fieldRead1248_17(moom.z2 a0) throws Throwable;
private static native ByteBuf __call1248_18(net.minecraft.network.PacketBuffer a0, byte[] a1) throws Throwable;
private static native java.lang.Exception __call1124800_0(java.io.IOException a0) throws Throwable;
private static native java.lang.Exception __call1124801_0(java.io.IOException a0) throws Throwable;

}


public void b(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_231e93c137f169038feb(this, p0); }


public int b(int p0) {
return (this.b)[p0];
}


public int c(int p0) {
return ((moom.z2)((this.c)[p0])).b;
}


private static java.lang.Exception a(java.lang.Exception p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22814;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("moom/z8", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.z8.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral9872_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/z8"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(net.minecraft.network.PacketBuffer p0) throws java.io.IOException { __sourceHandlerCall_2c7d6bd7e5e3c38c7ff0(this, p0); }


public void a(moom.y2 p0) {
((moom.y2)(p0)).a(((moom.z8)(this)));
    return;
}


public int a(int p0) {
return (this.a)[p0];
}


public int a() {
return (this.a).length;
}


public byte[] a__ArrayByte(int p0) {
return ((moom.z2)((this.c)[p0])).a;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral9872_0() throws E;
}
