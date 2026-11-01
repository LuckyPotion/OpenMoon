package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class ou {

private static final java.util.Map<java.lang.Class<? extends com.google.protobuf.GeneratedMessageV3>, java.lang.Byte> a;

private static final long b;

private static final long[] c;

private static final java.lang.Integer[] d;

private static final java.util.Map e;

public ou() {
super();
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-4217676772002110695L)), ((long)(-51781933396908200L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(251988873786329L)))));
    e = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.ou.b ^ 107227886006109L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill492_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill492_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill492_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill492_14 = new byte[8];
    (__sourceSpill492_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill492_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation492_16 = __sourceSpill492_14;
    ((javax.crypto.Cipher)(__sourceSpill492_11)).init(((int)(__sourceSpill492_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill492_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation492_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[13];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "x\020on21\\¨9GÊ\036\f[\03062~>X'Å\023Ìh²\001µíÛ[_¼Îw4 \025:¿\034xQ\"»×@²[õªtNò[)MÌSØ¹ò4è;v\0356\t,\000±Mk°"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill492_25 = local6_life21;
        int __sourceSpill492_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill492_25)).substring(((int)(__sourceSpill492_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill492_30 = local8_life19;
        int __sourceSpill492_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill492_33 = new byte[8];
        (__sourceSpill492_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill492_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill492_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill492_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill492_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill492_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill492_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill492_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill492_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill492_34)).doFinal(((byte[])(__sourceSpill492_33)));
        (__sourceSpill492_30)[__sourceSpill492_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    local7_life23 = ((java.lang.String)((local6_life21 = "a|\032\033 ÷\035\032\000'üºîd"))).length();
    local4_life24 = 0;
    do {
        java.lang.String __sourceSpill492_38 = local6_life21;
        int __sourceSpill492_39 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill492_38)).substring(((int)(__sourceSpill492_39)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill492_43 = local8_life19;
        int __sourceSpill492_44 = local5_life20;
        local5_life20 += 1;
        long local10_life45 = (((((((((((long) (local9_life42)[0]) & 255L) << 56) | ((((long) (local9_life42)[1]) & 255L) << 48)) | ((((long) (local9_life42)[2]) & 255L) << 40)) | ((((long) (local9_life42)[3]) & 255L) << 32)) | ((((long) (local9_life42)[4]) & 255L) << 24)) | ((((long) (local9_life42)[5]) & 255L) << 16)) | ((((long) (local9_life42)[6]) & 255L) << 8)) | (((long) (local9_life42)[7]) & 255L));
        byte[] __sourceSpill492_46 = new byte[8];
        (__sourceSpill492_46)[0] = ((byte) ((int) (local10_life45 >>> 56)));
        (__sourceSpill492_46)[1] = ((byte) ((int) (local10_life45 >>> 48)));
        (__sourceSpill492_46)[2] = ((byte) ((int) (local10_life45 >>> 40)));
        (__sourceSpill492_46)[3] = ((byte) ((int) (local10_life45 >>> 32)));
        (__sourceSpill492_46)[4] = ((byte) ((int) (local10_life45 >>> 24)));
        (__sourceSpill492_46)[5] = ((byte) ((int) (local10_life45 >>> 16)));
        (__sourceSpill492_46)[6] = ((byte) ((int) (local10_life45 >>> 8)));
        (__sourceSpill492_46)[7] = ((byte) ((int) local10_life45));
        javax.crypto.Cipher __sourceSpill492_47 = local2_life9;
        byte[] local12_life49 = ((javax.crypto.Cipher)(__sourceSpill492_47)).doFinal(((byte[])(__sourceSpill492_46)));
        (__sourceSpill492_43)[__sourceSpill492_44] = (((((((((((long) (local12_life49)[0]) & 255L) << 56) | ((((long) (local12_life49)[1]) & 255L) << 48)) | ((((long) (local12_life49)[2]) & 255L) << 40)) | ((((long) (local12_life49)[3]) & 255L) << 32)) | ((((long) (local12_life49)[4]) & 255L) << 24)) | ((((long) (local12_life49)[5]) & 255L) << 16)) | ((((long) (local12_life49)[6]) & 255L) << 8)) | (((long) (local12_life49)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    c = ((long[])(local8_life19));
    d = ((java.lang.Integer[])(new java.lang.Integer[13]));
    a = ((java.util.Map)(new java.util.HashMap()));
    com.moon.ou.a();
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3097_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ou"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.ou.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 23883;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ou", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


public static byte a(java.lang.Class<? extends com.google.protobuf.GeneratedMessageV3> p0) {
return ((java.lang.Byte)(((java.lang.Byte)(((java.util.Map)(com.moon.ou.a)).getOrDefault(((java.lang.Object)(p0)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(-1)))))))))).byteValue();
}


private static void a() {
long local0 = (com.moon.ou.b ^ 2360737418963L);
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.M.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(1))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.N.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(2))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.Z.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(3))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.ab.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(4))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.Y.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(5))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.L.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_23(19251, (5393275320283026815L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.aa.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_28(22548, (4549532259827435099L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.W.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_33(5746, (5899668241689839671L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.X.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_38(26102, (8101888660878064566L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.ac.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_43(15179, (8191294278175532300L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.U.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_48(25618, (6953290832692836947L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.S.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_53(11604, (88357696184660758L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.T.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_58(3487, (6606034574367265746L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.O.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_63(5859, (1150271642284558509L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.P.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_68(3591, (4564191186548822081L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.R.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_73(9879, (4352865261236959455L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.V.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_78(25773, (2095669309333043950L ^ local0))))))));
    ((java.util.Map)(com.moon.ou.a)).put(((java.lang.Object)(com.moon.Q.class)), ((java.lang.Object)(java.lang.Byte.valueOf(((byte)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_83(14182, (2218609243043211554L ^ local0))))))));
    return;
}


public static java.nio.ByteBuffer a(com.google.protobuf.GeneratedMessageV3 p0) {
java.io.ByteArrayOutputStream local1 = new java.io.ByteArrayOutputStream();
    try {
        ((com.google.protobuf.GeneratedMessageV3)(p0)).writeTo(((java.io.OutputStream)(local1)));
    } catch (java.io.IOException caught2) {
        return java.nio.ByteBuffer.allocate(((int)(0)));
    }
    java.nio.ByteBuffer local2 = java.nio.ByteBuffer.allocate(((int)((1 + ((java.io.ByteArrayOutputStream)(local1)).size()))));
    ((java.nio.ByteBuffer)(local2)).put(((byte)(com.moon.ou.a(((java.lang.Class)(((java.lang.Object)(p0)).getClass()))))));
    ((java.nio.ByteBuffer)(local2)).put(((byte[])(((java.io.ByteArrayOutputStream)(local1)).toByteArray())));
    ((java.nio.ByteBuffer)(local2)).flip();
    return local2;
}


private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_23(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_28(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_33(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_38(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_43(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_48(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_53(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_63(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_68(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_73(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_78(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2c8ae721fed4_originalDynamicSite606_83(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3097_0() throws E;
}
