package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class h1 {

private java.lang.String path;

private com.moon.h2[] data;

private static final long a;

private static final java.lang.String[] b;

private static final java.lang.String[] c;

private static final java.util.Map d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

public h1() {
super();
}


static {
a = ((long)(((moom._a)(moom._c.a(((long)(1576126018496560524L)), ((long)(2607454887403318220L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(276216416892119L)))));
    d = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.h1.a ^ 132518886171903L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill123_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill123_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill123_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill123_14 = new byte[8];
    (__sourceSpill123_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill123_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation123_16 = __sourceSpill123_14;
    ((javax.crypto.Cipher)(__sourceSpill123_11)).init(((int)(__sourceSpill123_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill123_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation123_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "Ð\034ô³o8^ò\020@U(K (â\000È4=»:ý£P\t@~Â\0235GNA9»$´p\026!'ôV\027\031%&Â£="))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill123_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill123_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill123_29)).doFinal(((byte[])(__sourceSpill123_28)));
        java.lang.String __sourceSpill123_34 = ((java.lang.String)(com.moon.h1.a(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill123_35 = local20_life19;
        int __sourceSpill123_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill123_35)[__sourceSpill123_36] = __sourceSpill123_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    b = ((java.lang.String[])(local20_life19));
    c = ((java.lang.String[])(new java.lang.String[2]));
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill123_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill123_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill123_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill123_47 = new byte[8];
    (__sourceSpill123_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill123_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation123_49 = __sourceSpill123_47;
    ((javax.crypto.Cipher)(__sourceSpill123_44)).init(((int)(__sourceSpill123_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill123_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation123_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[3];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "ï]lûº\0047ýÎ«Ï\035F£SøÇ\f"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill123_58 = local4_life54;
        int __sourceSpill123_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill123_58)).substring(((int)(__sourceSpill123_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill123_63 = local6_life52;
        int __sourceSpill123_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill123_66 = new byte[8];
        (__sourceSpill123_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill123_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill123_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill123_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill123_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill123_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill123_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill123_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill123_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill123_67)).doFinal(((byte[])(__sourceSpill123_66)));
        (__sourceSpill123_63)[__sourceSpill123_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    e = ((long[])(local6_life52));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forestValue43_14_0;
    java.lang.Object forestValue43_21_0;
    com.moon.h1 forestValue43_32_0;
    java.lang.String forestValue43_45_0;
    int forestValue43_57_0;
    int forestValue43_63_0;
    java.lang.Object spill43_0;
    com.moon.h1 spill43_1;
    java.lang.String spill43_2;
    boolean spill43_3;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    com.moon.h1 life5_24;
    java.lang.String life6_36;
    java.lang.String life7_39;
    forest_join_63: {
    forest_join_62: {
    forest_join_57: {
    forest_join_52: {
    forest_join_50: {
    forest_join_45: {
    forest_join_44: {
    forest_join_32: {
    forest_join_31: {
    forest_join_21: {
    forest_join_20: {
    forest_join_14: {
    forest_join_13: {
    life2_3 = (com.moon.h1.a ^ 12585552379761L);
    life4_5 = com.moon.h4.b();
    spill43_0 = p0;
    if (!((life4_5 != null))) {
        forestValue43_14_0 = spill43_0;
        break forest_join_14;
    }
    if (!((spill43_0 == this))) {
        break forest_join_13;
    }
    return ((1) != 0);
    }
    forestValue43_14_0 = p0;
    }
    if (!((life4_5 != null))) {
        forestValue43_21_0 = forestValue43_14_0;
        break forest_join_21;
    }
    if (!((((forestValue43_14_0 instanceof com.moon.h1) ? 1 : 0) == 0))) {
        break forest_join_20;
    }
    return ((0) != 0);
    }
    forestValue43_21_0 = p0;
    }
    life5_24 = ((com.moon.h1)(forestValue43_21_0));
    spill43_1 = life5_24;
    if (!((life4_5 != null))) {
        forestValue43_32_0 = spill43_1;
        break forest_join_32;
    }
    if (!((!((com.moon.h1)(spill43_1)).a(((java.lang.Object)(this)))))) {
        break forest_join_31;
    }
    return ((0) != 0);
    }
    forestValue43_32_0 = this;
    }
    life6_36 = ((com.moon.h1)(forestValue43_32_0)).a();
    life7_39 = ((com.moon.h1)(life5_24)).a();
    spill43_2 = life6_36;
    if (!((life4_5 != null))) {
        forestValue43_45_0 = spill43_2;
        break forest_join_45;
    }
    if (!((spill43_2 == null))) {
        break forest_join_44;
    }
    if (!((life7_39 != null))) {
        break forest_join_52;
    }
    break forest_join_50;
    }
    forestValue43_45_0 = life6_36;
    }
    spill43_3 = ((java.lang.Object)(forestValue43_45_0)).equals(((java.lang.Object)(life7_39)));
    if (!((life4_5 != null))) {
        forestValue43_57_0 = ((spill43_3) ? 1 : 0);
        break forest_join_57;
    }
    if (!((!spill43_3))) {
        break forest_join_52;
    }
    }
    return ((0) != 0);
    }
    forestValue43_57_0 = ((java.util.Arrays.deepEquals(((java.lang.Object[])(((com.moon.h1)(this)).a__Arrayh2())), ((java.lang.Object[])(((com.moon.h1)(life5_24)).a__Arrayh2())))) ? 1 : 0);
    }
    if (!((life4_5 != null))) {
        forestValue43_63_0 = forestValue43_57_0;
        break forest_join_63;
    }
    if (!((forestValue43_57_0 == 0))) {
        break forest_join_62;
    }
    return ((0) != 0);
    }
    forestValue43_63_0 = 1;
    }
    return ((forestValue43_63_0) != 0);
}


public java.lang.String toString() {
long local1_life2 = (com.moon.h1.a ^ 102204610144740L);
    java.lang.String __stackOp32_8_0 = this.a();
    java.lang.String __stackOp32_8_1 = java.util.Arrays.deepToString(((java.lang.Object[])(((com.moon.h1)(this)).a__Arrayh2())));
    java.lang.String __stackOp32_8_2 = __sourceIntrinsic_a86c261fcdee_originalDynamicSite32_7(20264, (7957319994219993842L ^ local1_life2));
    java.lang.String __sourceSpill32_10 = __stackOp32_8_2;
    java.lang.String __sourceSpill32_11 = __stackOp32_8_0;
    java.lang.String __sourceSpill32_12 = __stackOp32_8_1;
    recovery.source.CarrierOps.discard(__stackOp32_8_2);
    java.lang.String __stackOp32_15_0 = __sourceSpill32_12;
    java.lang.String __stackOp32_15_1 = __sourceIntrinsic_a86c261fcdee_originalDynamicSite32_14(8637, (3269496926637683814L ^ local1_life2));
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite32_16(__sourceSpill32_10, __sourceSpill32_11, __stackOp32_15_1, __stackOp32_15_0, ")");
}


public int hashCode() {
int forwardValue302_34_0;
    int forwardValue302_35_0;
    java.lang.String forwardValue302_35_1;
    int forwardValue302_36_0;
    int forwardValue302_36_1;
    int forwardValue302_56_0;
    net.minecraft.entity.Entity[] spill302_0;
    int spill302_1;
    java.lang.String spill302_2;
    int spill302_3;
    long life1_3;
    int life4_9;
    int life5_12;
    net.minecraft.entity.Entity[] life3_13;
    java.lang.String life6_16;
    int life5_42;
    int life5_54;
    forward_join_56: {
    forward_join_36: {
    forward_join_35: {
    forward_join_34: {
    life1_3 = (com.moon.h1.a ^ 85012697388616L);
    life4_9 = __sourceIntrinsic_1861091996aa_invokedynamic302_1(13065, (5870801424333556993L ^ life1_3));
    spill302_0 = com.moon.h4.b();
    life5_12 = 1;
    life3_13 = spill302_0;
    life6_16 = this.a();
    spill302_1 = (life5_12 * __sourceIntrinsic_1861091996aa_invokedynamic302_4(14929, (1027201015627334746L ^ life1_3)));
    spill302_2 = life6_16;
    if (!((life3_13 != null))) {
        forwardValue302_35_0 = spill302_1;
        forwardValue302_35_1 = spill302_2;
        break forward_join_35;
    }
    if (!((spill302_2 == null))) {
        forwardValue302_34_0 = spill302_1;
        break forward_join_34;
    }
    forwardValue302_36_0 = spill302_1;
    forwardValue302_36_1 = __sourceIntrinsic_1861091996aa_invokedynamic302_5(21413, (2014844965578943919L ^ life1_3));
    break forward_join_36;
    }
    forwardValue302_35_0 = forwardValue302_34_0;
    forwardValue302_35_1 = life6_16;
    }
    forwardValue302_36_0 = forwardValue302_35_0;
    forwardValue302_36_1 = ((java.lang.Object)(forwardValue302_35_1)).hashCode();
    }
    life5_42 = (forwardValue302_36_0 + forwardValue302_36_1);
    life5_54 = ((life5_42 * __sourceIntrinsic_1861091996aa_invokedynamic302_7(14929, (1027201015627334746L ^ life1_3))) + java.util.Arrays.deepHashCode(((java.lang.Object[])(((com.moon.h1)(this)).a__Arrayh2()))));
    spill302_3 = life5_54;
    if (!((net.minecraft.entity.Entity.b__ArrayString() != null))) {
        forwardValue302_56_0 = spill302_3;
        break forward_join_56;
    }
    com.moon.h4.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    forwardValue302_56_0 = spill302_3;
    }
    return forwardValue302_56_0;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 30101;
      if (f[var3] == null) {
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
         long var5 = e[var3];
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
         Object[] var9 = (Object[])g.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               g.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/h1", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1322_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.h1.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.String a(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 8680);
    if (((com.moon.h1.c)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.h1.d)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.h1.d)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/h1", life9_51);
    }
        life6_60 = new byte[8];
        (life6_60)[0] = ((byte) ((int) (p1 >>> 56)));
        life7_70 = 1;
        loop_region_71: while ((life7_70 < 8)) {
        (life6_60)[life7_70] = ((byte) ((int) ((p1 << (life7_70 * 8)) >>> 56)));
        life7_70 += 1;
    }
        life7_92 = new javax.crypto.spec.DESKeySpec(life6_60);
        life8_99 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life4_21)[1])))).generateSecret(((java.security.spec.KeySpec)(life7_92)));
        ((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).init(((int)(2)), ((java.security.Key)(life8_99)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life4_21)[2])))));
        life9_116 = ((java.lang.String)((com.moon.h1.b)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.h1.c)[life5_8] = com.moon.h1.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.h1.c)[life5_8];
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.h1.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1324_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/h1"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public com.moon.h2[] a__Arrayh2() {
return this.data;
}


public com.moon.h1 a(java.lang.String p0) {
this.path = ((java.lang.String)(p0));
    return this;
}


public com.moon.h1 a(com.moon.h2[] p0) {
this.data = ((com.moon.h2[])(p0));
    return this;
}


protected boolean a(java.lang.Object p0) {
return ((((p0 instanceof com.moon.h1) ? 1 : 0)) != 0);
}


public java.lang.String a() {
return this.path;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static java.lang.String a(byte[] p0) {
int life1_1;
    int life2_5;
    char[] life3_7;
    int life4_9;
    int life5_19;
    int life6_39;
    int life5_44;
    int life6_52;
    int life6_71;
    int life5_76;
    int life6_86;
    int life5_91;
    int life6_99;
    life1_1 = 0;
    life3_7 = new char[(life2_5 = (p0).length)];
    life4_9 = 0;
    loop_region_10: while ((life4_9 < life2_5)) {
        if (((life5_19 = (255 & (p0)[life4_9])) < 192)) {
        (life3_7)[(life1_1++)] = ((char) life5_19);
    } else {
        if ((life5_19 < 224)) {
        life6_39 = ((int)(((char) (((char) (life5_19 & 31)) << 6))));
        byte[] spill450_0 = p0;
        life4_9 += 1;
        life5_44 = (spill450_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill450_1 = p0;
        life4_9 += 1;
        life5_76 = (spill450_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill450_2 = p0;
        life4_9 += 1;
        life5_91 = (spill450_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1324_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1322_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic302_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic302_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic302_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic302_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite32_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite32_14(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite32_16(java.lang.String a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, java.lang.String a4) throws E;
}
