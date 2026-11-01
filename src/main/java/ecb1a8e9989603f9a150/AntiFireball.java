package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class AntiFireball extends com.moon.module.Module {

public static float s;

public static float t;

private com.moon.setting.FloatSetting u;

private com.moon.setting.BooleanSetting v;

private java.util.List<net.minecraft.entity.Entity> w;

private static long x;

private static java.lang.String[] y;

private static java.lang.String[] z;

private static java.util.Map A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public AntiFireball(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_9a454fcb2d721772(com.moon.module.impl.AntiFireball receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.AntiFireball.x ^ 75770523936069L);

    com.moon.module.impl.AntiFireball.__sourceConstructorInit_9a454fcb2d721772_0(((com.moon.module.impl.AntiFireball)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.AntiFireball)(receiver)).u = ((com.moon.setting.FloatSetting)(((com.moon.md)(((com.moon.md)(com.moon.setting.FloatSetting.builder(((java.lang.String)(__sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_2(18575, (4831211118546710339L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_4(1118, (4492086354712175507L ^ local5)))), ((float)(0x1.4p2f)), ((float)(0x1.8p1f)), ((float)(0x1.cp2f)), ((float)(0x1.99999ap-4f))))).a()));

    ((com.moon.module.impl.AntiFireball)(receiver)).v = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_8(25195, (5304199951453734309L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_10(16018, (5004517462147570013L ^ local5)))), ((boolean)(true))))).a()));

    ((com.moon.module.impl.AntiFireball)(receiver)).w = ((java.util.List)(new java.util.ArrayList()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_9a454fcb2d721772_0(com.moon.module.impl.AntiFireball a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
x = ((long)(((moom._a)(moom._c.a(((long)(1125457583251720233L)), ((long)(-9007534089903883831L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(57479562743185L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.AntiFireball.x ^ 14292479771542L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill257_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill257_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill257_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill257_14 = new byte[8];
    (__sourceSpill257_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill257_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation257_16 = __sourceSpill257_14;
    ((javax.crypto.Cipher)(__sourceSpill257_11)).init(((int)(__sourceSpill257_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill257_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation257_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[4];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "_È×ÅÿG\n\\°­³0£zv \020\000%'9½ºmÛVWÐ´%`"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill257_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill257_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill257_29)).doFinal(((byte[])(__sourceSpill257_28)));
        java.lang.String __sourceSpill257_34 = ((java.lang.String)(com.moon.module.impl.AntiFireball.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill257_35 = local20_life19;
        int __sourceSpill257_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill257_35)[__sourceSpill257_36] = __sourceSpill257_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    local19_life23 = ((java.lang.String)((local17_life21 = "8R½Oö\n]\037ÇÏ<$í\020Ç\032\027Wg(3wÛ\r½ç;"))).length();
    local16_life24 = 16;
    local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill257_41 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill257_42 = local13_life9;
        byte[] local21_life44 = ((javax.crypto.Cipher)(__sourceSpill257_42)).doFinal(((byte[])(__sourceSpill257_41)));
        java.lang.String __sourceSpill257_47 = ((java.lang.String)(com.moon.module.impl.AntiFireball.c(((byte[])(local21_life44))))).intern();
        java.lang.String[] __sourceSpill257_48 = local20_life19;
        int __sourceSpill257_49 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill257_48)[__sourceSpill257_49] = __sourceSpill257_47;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    y = ((java.lang.String[])(local20_life19));
    z = ((java.lang.String[])(new java.lang.String[4]));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life55;
    javax.crypto.Cipher __sourceSpill257_57 = (local0_life55 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill257_58 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill257_59 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill257_60 = new byte[8];
    (__sourceSpill257_60)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life61 = 1;
    while ((local1_life61 < 8)) {
        (__sourceSpill257_60)[local1_life61] = ((byte) ((int) ((local11_life7 << (local1_life61 * 8)) >>> 56)));
        local1_life61 += 1;
    }
    byte[] __sourcePreallocation257_62 = __sourceSpill257_60;
    ((javax.crypto.Cipher)(__sourceSpill257_57)).init(((int)(__sourceSpill257_58)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill257_59)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation257_62)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life65 = new long[2];
    int local3_life66 = 0;
    java.lang.String local4_life67;
    int local5_life69 = ((java.lang.String)((local4_life67 = "íIè¹¸%n7Ó¶Æ&¡"))).length();
    int local2_life70 = 0;
    do {
        java.lang.String __sourceSpill257_71 = local4_life67;
        int __sourceSpill257_72 = local2_life70;
        local2_life70 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill257_71)).substring(((int)(__sourceSpill257_72)), ((int)(local2_life70))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill257_76 = local6_life65;
        int __sourceSpill257_77 = local3_life66;
        local3_life66 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill257_79 = new byte[8];
        (__sourceSpill257_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill257_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill257_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill257_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill257_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill257_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill257_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill257_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill257_80 = local0_life55;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill257_80)).doFinal(((byte[])(__sourceSpill257_79)));
        (__sourceSpill257_76)[__sourceSpill257_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life70 >= local5_life69)));
    B = ((long[])(local6_life65));
    C = ((java.lang.Integer[])(new java.lang.Integer[2]));
    s = ((float)(0x1.921fb6p1f));
    t = ((float)((0x1.68p7f / com.moon.module.impl.AntiFireball.s)));
}


private static java.lang.String c(byte[] p0) {
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
        byte[] spill1020_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1020_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1020_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1020_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1020_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1020_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static java.lang.String c(int p0, long p1) {
int life5_8;
    java.lang.Long life3_16;
    java.lang.Object[] life4_21;
    byte[] life6_60;
    int life7_70;
    javax.crypto.spec.DESKeySpec life7_92;
    javax.crypto.SecretKey life8_99;
    byte[] life9_116;
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 27907);
    if (((com.moon.module.impl.AntiFireball.z)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.AntiFireball.A)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.AntiFireball.A)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/ly", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.AntiFireball.y)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.AntiFireball.z)[life5_8] = com.moon.module.impl.AntiFireball.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.AntiFireball.z)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.AntiFireball.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2337_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ly"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 8619;
      if (C[var3] == null) {
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
         long var5 = B[var3];
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
         Object[] var9 = (Object[])D.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               D.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/ly", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.AntiFireball.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2338_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/ly"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.event.MoveEvent p0) {
net.minecraft.client.Minecraft forwardValue780_16_0;
    net.minecraft.client.Minecraft forwardValue780_22_0;
    net.minecraft.entity.Entity forwardValue780_49_0;
    java.lang.Object forwardValue780_58_0;
    moom.DR forwardValue780_130_0;
    moom.DR forwardValue780_151_0;
    moom.DR forwardValue780_172_0;
    int forwardValue780_234_0;
    int forwardValue780_260_0;
    int forwardValue780_260_1;
    net.minecraft.client.Minecraft forwardValue780_262_0;
    net.minecraft.client.Minecraft spill780_0;
    net.minecraft.client.entity.EntityPlayerSP spill780_1;
    net.minecraft.entity.Entity spill780_2;
    boolean spill780_3;
    moom.DR spill780_4;
    moom.DR spill780_5;
    moom.DR spill780_6;
    int spill780_7;
    net.minecraft.client.Minecraft spill780_8;
    long life2_3;
    java.lang.String life4_5;
    net.minecraft.entity.Entity life5_69;
    net.minecraft.client.entity.EntityPlayerSP life6_91;
    com.moon.pw life7_107;
    moom.DR life8_112;
    moom.CA life9_140;
    com.moon.pw life10_245;
    float life11_258;
    float life12_268;
    float life13_276;
    forward_join_264: {
    forward_join_262: {
    forward_join_260: {
    forward_join_245: {
    forward_join_234: {
    forward_join_232: {
    forward_join_178: {
    forward_join_172: {
    forward_join_171: {
    forward_join_157: {
    forward_join_151: {
    forward_join_150: {
    forward_join_136: {
    forward_join_130: {
    forward_join_129: {
    forward_join_58: {
    forward_join_55: {
    forward_join_49: {
    forward_join_31: {
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.AntiFireball.x ^ 38149998747192L);
    life4_5 = com.moon.bF.b();
    if (!((((com.moon.event.MoveEvent)(p0)).getPhase() == com.moon.event.MovePhase.PRE))) {
        break forward_join_264;
    }
    spill780_0 = com.moon.module.impl.AntiFireball.d;
    if (!((life4_5 != null))) {
        forwardValue780_16_0 = spill780_0;
        break forward_join_16;
    }
    if (!((((net.minecraft.client.Minecraft)(spill780_0)).K != null))) {
        break forward_join_20;
    }
    forwardValue780_16_0 = com.moon.module.impl.AntiFireball.d;
    }
    if (!((life4_5 != null))) {
        forwardValue780_22_0 = forwardValue780_16_0;
        break forward_join_22;
    }
    if (!((((net.minecraft.client.Minecraft)(forwardValue780_16_0)).I == null))) {
        break forward_join_21;
    }
    }
    return;
    }
    forwardValue780_22_0 = com.moon.module.impl.AntiFireball.d;
    }
    spill780_1 = ((net.minecraft.client.Minecraft)(forwardValue780_22_0)).K;
    if (!((life4_5 != null))) {
        forwardValue780_49_0 = spill780_1;
        break forward_join_49;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(spill780_1)).S <= 1))) {
        break forward_join_31;
    }
    ((java.util.List)(this.w)).clear();
    }
    forwardValue780_49_0 = ((net.minecraft.entity.Entity)(((java.util.Optional)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.stream.Stream)(((java.util.List)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiFireball.d)).I)).c)).stream())).filter(((java.util.function.Predicate)(__sourceIntrinsic_9f71572286bb_invokedynamic780_17()))))).filter(((java.util.function.Predicate)(__sourceIntrinsic_9f71572286bb_invokedynamic780_19(this)))))).filter(((java.util.function.Predicate)(__sourceIntrinsic_9f71572286bb_invokedynamic780_21(this)))))).min(((java.util.Comparator)(java.util.Comparator.comparingDouble(((java.util.function.ToDoubleFunction)(__sourceIntrinsic_9f71572286bb_invokedynamic780_23())))))))).orElse(((java.lang.Object)(null)))));
    }
    life5_69 = forwardValue780_49_0;
    spill780_2 = life5_69;
    if (!((life4_5 != null))) {
        forwardValue780_58_0 = spill780_2;
        break forward_join_58;
    }
    if (!((spill780_2 == null))) {
        break forward_join_55;
    }
    return;
    }
    forwardValue780_58_0 = ((com.moon.setting.BooleanSetting)(this.v)).getValue();
    }
    spill780_3 = ((java.lang.Boolean)(((java.lang.Boolean)(forwardValue780_58_0)))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue780_234_0 = ((spill780_3) ? 1 : 0);
        break forward_join_234;
    }
    if (!(spill780_3)) {
        break forward_join_232;
    }
    life6_91 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiFireball.d)).K;
    life7_107 = new com.moon.pw(((float) ((net.minecraft.client.entity.EntityPlayerSP)(life6_91)).n), (((float) ((net.minecraft.client.entity.EntityPlayerSP)(life6_91)).o) + ((net.minecraft.client.entity.EntityPlayerSP)(life6_91)).e__Float()), ((float) ((net.minecraft.client.entity.EntityPlayerSP)(life6_91)).p));
    life8_112 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiFireball.d)).K)).b(((float)(0x1.0p0f)));
    life9_140 = new moom.CA((((net.minecraft.entity.Entity)(life5_69)).n - 0x1.99999ap-2d), ((net.minecraft.entity.Entity)(life5_69)).o, (((net.minecraft.entity.Entity)(life5_69)).p - 0x1.99999ap-2d), (((net.minecraft.entity.Entity)(life5_69)).n + 0x1.99999ap-2d), (((net.minecraft.entity.Entity)(life5_69)).o + ((double) ((net.minecraft.entity.Entity)(life5_69)).H)), (((net.minecraft.entity.Entity)(life5_69)).p + 0x1.99999ap-2d));
    spill780_4 = life8_112;
    if (!((life4_5 != null))) {
        forwardValue780_130_0 = spill780_4;
        break forward_join_130;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(spill780_4)).a)), ((double)(((moom.CA)(life9_140)).e))) > 0))) {
        break forward_join_129;
    }
    ((moom.DR)(life8_112)).a = ((double)(((moom.CA)(life9_140)).e));
    if (!((life4_5 == null))) {
        break forward_join_136;
    }
    }
    forwardValue780_130_0 = life8_112;
    }
    ((moom.DR)(forwardValue780_130_0)).a = ((double)(java.lang.Math.max(((double)(((moom.DR)(life8_112)).a)), ((double)(((moom.CA)(life9_140)).b)))));
    }
    spill780_5 = life8_112;
    if (!((life4_5 != null))) {
        forwardValue780_151_0 = spill780_5;
        break forward_join_151;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(spill780_5)).b)), ((double)(((moom.CA)(life9_140)).f))) > 0))) {
        break forward_join_150;
    }
    ((moom.DR)(life8_112)).b = ((double)(((moom.CA)(life9_140)).f));
    if (!((life4_5 == null))) {
        break forward_join_157;
    }
    }
    forwardValue780_151_0 = life8_112;
    }
    ((moom.DR)(forwardValue780_151_0)).b = ((double)(java.lang.Math.max(((double)(((moom.DR)(life8_112)).b)), ((double)(((moom.CA)(life9_140)).c)))));
    }
    spill780_6 = life8_112;
    if (!((life4_5 != null))) {
        forwardValue780_172_0 = spill780_6;
        break forward_join_172;
    }
    if (!((recovery.source.CarrierOps.dcmpl(((double)(((moom.DR)(spill780_6)).c)), ((double)(((moom.CA)(life9_140)).g))) > 0))) {
        break forward_join_171;
    }
    ((moom.DR)(life8_112)).c = ((double)(((moom.CA)(life9_140)).g));
    if (!((life4_5 == null))) {
        break forward_join_178;
    }
    }
    forwardValue780_172_0 = life8_112;
    }
    ((moom.DR)(forwardValue780_172_0)).c = ((double)(java.lang.Math.max(((double)(((moom.DR)(life8_112)).c)), ((double)(((moom.CA)(life9_140)).d)))));
    }
    life10_245 = ((com.moon.pw)(new com.moon.pw(((float) ((moom.DR)(life8_112)).a), ((float) ((moom.DR)(life8_112)).b), ((float) ((moom.DR)(life8_112)).c)))).b(((com.moon.pw)(life7_107)));
    life11_258 = moom.Dr.c(((float)(((((com.moon.pw)(life10_245)).p() * ((com.moon.pw)(life10_245)).p()) + (((com.moon.pw)(life10_245)).r() * ((com.moon.pw)(life10_245)).r())))));
    life12_268 = ((moom.Dr.a(((float)(((com.moon.pw)(life10_245)).r())), ((float)(((com.moon.pw)(life10_245)).p()))) * com.moon.module.impl.AntiFireball.t) - 0x1.68p6f);
    life13_276 = ((-moom.Dr.a(((float)(((com.moon.pw)(life10_245)).q())), ((float)(life11_258)))) * com.moon.module.impl.AntiFireball.t);
    ((com.moon.event.MoveEvent)(p0)).a(((float)(life12_268)));
    ((com.moon.event.MoveEvent)(p0)).b(((float)(life13_276)));
    }
    forwardValue780_234_0 = ((com.moon.o4)(com.moon.o4.a__o4())).b();
    }
    spill780_7 = __sourceIntrinsic_9f71572286bb_invokedynamic780_96(5214, (886040447374754887L ^ life2_3));
    if (!((life4_5 != null))) {
        forwardValue780_260_0 = forwardValue780_234_0;
        forwardValue780_260_1 = spill780_7;
        break forward_join_260;
    }
    if (!((forwardValue780_234_0 <= spill780_7))) {
        break forward_join_245;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiFireball.d)).K)).B__sourceReturn_da8c82d5d4();
    }
    spill780_8 = com.moon.module.impl.AntiFireball.d;
    if (!((life4_5 != null))) {
        forwardValue780_262_0 = spill780_8;
        break forward_join_262;
    }
    ((moom.jI)(((net.minecraft.client.Minecraft)(spill780_8)).F)).a(((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiFireball.d)).K)), ((net.minecraft.entity.Entity)(life5_69)));
    forwardValue780_260_0 = ((com.moon.o4)(com.moon.o4.a__o4())).b();
    forwardValue780_260_1 = __sourceIntrinsic_9f71572286bb_invokedynamic780_107(16292, (2518497512790798268L ^ life2_3));
    }
    if (!((forwardValue780_260_0 > forwardValue780_260_1))) {
        break forward_join_264;
    }
    forwardValue780_262_0 = com.moon.module.impl.AntiFireball.d;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(forwardValue780_262_0)).K)).B__sourceReturn_da8c82d5d4();
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private boolean lambda$receiveUpdate$1(net.minecraft.entity.Entity p0) {
int forwardValue781_14_0;
    int forwardValue781_16_0;
    boolean spill781_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_16: {
    forward_join_15: {
    forward_join_14: {
    life2_3 = (com.moon.module.impl.AntiFireball.x ^ 6676845547568L);
    life4_5 = com.moon.bF.b();
    spill781_0 = ((java.util.List)(this.w)).contains(((java.lang.Object)(p0)));
    if (!((life4_5 != null))) {
        forwardValue781_14_0 = ((spill781_0) ? 1 : 0);
        break forward_join_14;
    }
    if (!((!spill781_0))) {
        break forward_join_15;
    }
    forwardValue781_14_0 = 1;
    }
    forwardValue781_16_0 = forwardValue781_14_0;
    break forward_join_16;
    }
    forwardValue781_16_0 = 0;
    }
    return ((forwardValue781_16_0) != 0);
}


private static boolean lambda$receiveUpdate$0(net.minecraft.entity.Entity p0) {
return ((((p0 instanceof net.minecraft.entity.projectile.EntityFireball) ? 1 : 0)) != 0);
}


private boolean lambda$receiveUpdate$2(net.minecraft.entity.Entity p0) {
int forwardValue782_20_0;
    int forwardValue782_22_0;
    int spill782_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_22: {
    forward_join_21: {
    forward_join_20: {
    life2_3 = (com.moon.module.impl.AntiFireball.x ^ 95089184435439L);
    life4_5 = com.moon.bF.b();
    spill782_0 = recovery.source.CarrierOps.fcmpg(((float)(((net.minecraft.entity.Entity)(p0)).a__Float(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiFireball.d)).K))))), ((float)(((java.lang.Float)(((java.lang.Float)(((com.moon.setting.FloatSetting)(this.u)).getValue())))).floatValue())));
    if (!((life4_5 != null))) {
        forwardValue782_20_0 = spill782_0;
        break forward_join_20;
    }
    if (!((spill782_0 < 0))) {
        break forward_join_21;
    }
    forwardValue782_20_0 = 1;
    }
    forwardValue782_22_0 = forwardValue782_20_0;
    break forward_join_22;
    }
    forwardValue782_22_0 = 0;
    }
    return ((forwardValue782_22_0) != 0);
}


private static double lambda$receiveUpdate$3(net.minecraft.entity.Entity p0) {
return ((double) ((net.minecraft.entity.Entity)(p0)).a__Float(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AntiFireball.d)).K))));
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_8(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9a454fcb2d721772_originalDynamicSite1213_10(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2337_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2338_0() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_9f71572286bb_invokedynamic780_17() throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_9f71572286bb_invokedynamic780_19(com.moon.module.impl.AntiFireball a0) throws E;

private static native <E extends Throwable> java.util.function.Predicate __sourceIntrinsic_9f71572286bb_invokedynamic780_21(com.moon.module.impl.AntiFireball a0) throws E;

private static native <E extends Throwable> java.util.function.ToDoubleFunction __sourceIntrinsic_9f71572286bb_invokedynamic780_23() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic780_96(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_invokedynamic780_107(int a0, long a1) throws E;
}
