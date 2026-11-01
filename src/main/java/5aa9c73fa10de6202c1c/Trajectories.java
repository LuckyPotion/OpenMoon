package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class Trajectories extends com.moon.module.Module {

private com.moon.setting.ColorSetting s;

private static long t;

private static java.lang.String[] u;

private static java.lang.String[] v;

private static java.util.Map w;

private static long[] x;

private static java.lang.Integer[] y;

private static java.util.Map z;

public Trajectories(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_0df68b482c45a441(com.moon.module.impl.Trajectories receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.Trajectories.t ^ 128345141419810L);

    com.moon.module.impl.Trajectories.__sourceConstructorInit_0df68b482c45a441_0(((com.moon.module.impl.Trajectories)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.Trajectories)(receiver)).s = ((com.moon.setting.ColorSetting)(((com.moon.mb)(((com.moon.mb)(com.moon.setting.ColorSetting.builder(((java.lang.String)(__sourceIntrinsic_0df68b482c45a441_originalDynamicSite1316_2(17358, (4215703003570046158L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_0df68b482c45a441_originalDynamicSite1316_4(1214, (6467505379492742079L ^ local5)))), ((int)(-1))))).a()));

    return;

}



static {
t = ((long)(((moom._a)(moom._c.a(((long)(-6272225467840816903L)), ((long)(2484440807360850997L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(219452837606051L)))));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.Trajectories.t ^ 23475639898673L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill295_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill295_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill295_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill295_14 = new byte[8];
    (__sourceSpill295_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill295_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation295_16 = __sourceSpill295_14;
    ((javax.crypto.Cipher)(__sourceSpill295_11)).init(((int)(__sourceSpill295_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill295_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation295_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "F\032Ûü`q\021G¢\006}£\020Î)\032ä+°\020+ÝÇ²É»"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill295_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill295_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill295_29)).doFinal(((byte[])(__sourceSpill295_28)));
        java.lang.String __sourceSpill295_34 = ((java.lang.String)(com.moon.module.impl.Trajectories.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill295_35 = local20_life19;
        int __sourceSpill295_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill295_35)[__sourceSpill295_36] = __sourceSpill295_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    u = ((java.lang.String[])(local20_life19));
    v = ((java.lang.String[])(new java.lang.String[2]));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill295_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill295_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill295_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill295_47 = new byte[8];
    (__sourceSpill295_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill295_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation295_49 = __sourceSpill295_47;
    ((javax.crypto.Cipher)(__sourceSpill295_44)).init(((int)(__sourceSpill295_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill295_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation295_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[4];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "d®Ht1¶#Ý_|7\026\005V¹{"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill295_58 = local4_life54;
        int __sourceSpill295_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill295_58)).substring(((int)(__sourceSpill295_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill295_63 = local6_life52;
        int __sourceSpill295_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill295_66 = new byte[8];
        (__sourceSpill295_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill295_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill295_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill295_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill295_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill295_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill295_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill295_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill295_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill295_67)).doFinal(((byte[])(__sourceSpill295_66)));
        (__sourceSpill295_63)[__sourceSpill295_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    local5_life56 = ((java.lang.String)((local4_life54 = "þ)\nÜ£\b3½CiË*$ò"))).length();
    local2_life57 = 0;
    do {
        java.lang.String __sourceSpill295_71 = local4_life54;
        int __sourceSpill295_72 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life75 = ((java.lang.String)(((java.lang.String)(__sourceSpill295_71)).substring(((int)(__sourceSpill295_72)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill295_76 = local6_life52;
        int __sourceSpill295_77 = local3_life53;
        local3_life53 += 1;
        long local8_life78 = (((((((((((long) (local7_life75)[0]) & 255L) << 56) | ((((long) (local7_life75)[1]) & 255L) << 48)) | ((((long) (local7_life75)[2]) & 255L) << 40)) | ((((long) (local7_life75)[3]) & 255L) << 32)) | ((((long) (local7_life75)[4]) & 255L) << 24)) | ((((long) (local7_life75)[5]) & 255L) << 16)) | ((((long) (local7_life75)[6]) & 255L) << 8)) | (((long) (local7_life75)[7]) & 255L));
        byte[] __sourceSpill295_79 = new byte[8];
        (__sourceSpill295_79)[0] = ((byte) ((int) (local8_life78 >>> 56)));
        (__sourceSpill295_79)[1] = ((byte) ((int) (local8_life78 >>> 48)));
        (__sourceSpill295_79)[2] = ((byte) ((int) (local8_life78 >>> 40)));
        (__sourceSpill295_79)[3] = ((byte) ((int) (local8_life78 >>> 32)));
        (__sourceSpill295_79)[4] = ((byte) ((int) (local8_life78 >>> 24)));
        (__sourceSpill295_79)[5] = ((byte) ((int) (local8_life78 >>> 16)));
        (__sourceSpill295_79)[6] = ((byte) ((int) (local8_life78 >>> 8)));
        (__sourceSpill295_79)[7] = ((byte) ((int) local8_life78));
        javax.crypto.Cipher __sourceSpill295_80 = local0_life42;
        byte[] local10_life82 = ((javax.crypto.Cipher)(__sourceSpill295_80)).doFinal(((byte[])(__sourceSpill295_79)));
        (__sourceSpill295_76)[__sourceSpill295_77] = (((((((((((long) (local10_life82)[0]) & 255L) << 56) | ((((long) (local10_life82)[1]) & 255L) << 48)) | ((((long) (local10_life82)[2]) & 255L) << 40)) | ((((long) (local10_life82)[3]) & 255L) << 32)) | ((((long) (local10_life82)[4]) & 255L) << 24)) | ((((long) (local10_life82)[5]) & 255L) << 16)) | ((((long) (local10_life82)[6]) & 255L) << 8)) | (((long) (local10_life82)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    x = ((long[])(local6_life52));
    y = ((java.lang.Integer[])(new java.lang.Integer[4]));
}

private static native <E extends Throwable> void __sourceConstructorInit_0df68b482c45a441_0(com.moon.module.impl.Trajectories a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

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
        byte[] spill1255_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1255_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1255_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1255_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1255_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1255_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 14288);
    if (((com.moon.module.impl.Trajectories.v)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.Trajectories.w)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.Trajectories.w)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/l6", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.Trajectories.u)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.Trajectories.v)[life5_8] = com.moon.module.impl.Trajectories.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.Trajectories.v)[life5_8];
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.Trajectories.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2743_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 16281;
      if (y[var3] == null) {
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
         long var5 = x[var3];
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
         Object[] var9 = (Object[])z.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               z.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/l6", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         y[var3] = var15;
      }

      return y[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.Trajectories.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2744_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l6"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private float a(net.minecraft.item.ItemStack p0, net.minecraft.entity.player.EntityPlayer p1) {
int forwardValue964_31_0;
    int forwardValue964_37_0;
    int forwardValue964_43_0;
    int forwardValue964_51_0;
    int forwardValue964_59_0;
    int spill964_0;
    long life3_3;
    net.minecraft.entity.Entity[] life5_5;
    int life6_17;
    int life7_23;
    float life8_26;
    forward_join_62: {
    forward_join_59: {
    forward_join_56: {
    forward_join_51: {
    forward_join_48: {
    forward_join_46: {
    forward_join_43: {
    forward_join_37: {
    forward_join_31: {
    forward_join_28: {
    life3_3 = (com.moon.module.impl.Trajectories.t ^ 25119871536125L);
    life5_5 = com.moon.bY.b();
    spill964_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    if (!((life5_5 == null))) {
        forwardValue964_31_0 = spill964_0;
        break forward_join_31;
    }
    if (!((spill964_0 != 0))) {
        break forward_join_28;
    }
    life6_17 = ((net.minecraft.entity.player.EntityPlayer)(p1)).l__Int();
    life7_23 = (((net.minecraft.item.ItemBow)(net.minecraft.init.Items.f)).a__Int(((net.minecraft.item.ItemStack)(p0))) - life6_17);
    life8_26 = __sourceExactCall_83948e598c96c5(((int)(life7_23)));
    return (0x1.8p1f * life8_26);
    }
    forwardValue964_31_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof moom.xO) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue964_37_0 = forwardValue964_31_0;
        break forward_join_37;
    }
    if (!((forwardValue964_31_0 == 0))) {
        break forward_join_46;
    }
    forwardValue964_37_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof moom.xi) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue964_43_0 = forwardValue964_37_0;
        break forward_join_43;
    }
    if (!((forwardValue964_37_0 == 0))) {
        break forward_join_46;
    }
    forwardValue964_43_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof moom.xf) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue964_51_0 = forwardValue964_43_0;
        break forward_join_51;
    }
    if (!((forwardValue964_43_0 != 0))) {
        break forward_join_48;
    }
    }
    return 0x1.8p0f;
    }
    forwardValue964_51_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof moom.xj) ? 1 : 0);
    }
    if (!((life5_5 == null))) {
        forwardValue964_59_0 = forwardValue964_51_0;
        break forward_join_59;
    }
    if (!((forwardValue964_51_0 != 0))) {
        break forward_join_56;
    }
    return 0x1.666666p-1f;
    }
    forwardValue964_59_0 = ((((net.minecraft.item.ItemStack)(p0)).a__wQ() instanceof net.minecraft.item.ItemPotion) ? 1 : 0);
    }
    if (!((forwardValue964_59_0 != 0))) {
        break forward_join_62;
    }
    return 0x1.0p-1f;
    }
    return 0x0.0p0f;
}


public void a(com.moon.event.Render3DEvent p0) {
net.minecraft.entity.Entity forestValue131_455_0;
    net.minecraft.entity.Entity forestValue131_461_0;
    int forestValue131_513_0;
    int forestValue131_554_0;
    int forestValue131_558_0;
    moom.DZ forestValue131_573_0;
    int forestValue131_1130_0;
    net.minecraft.entity.Entity[] spill131_0;
    int spill131_1;
    long spill131_2;
    int spill131_3;
    net.minecraft.entity.Entity spill131_4;
    boolean spill131_5;
    int spill131_6;
    moom.DZ spill131_7;
    long life2_3;
    net.minecraft.client.entity.EntityPlayerSP life5_7;
    net.minecraft.entity.Entity[] life4_8;
    double life6_24;
    double life8_29;
    double life10_36;
    com.moon.hW life12_46;
    com.moon.hW life13_54;
    net.minecraft.item.ItemStack life14_58;
    float life15_62;
    float life16_66;
    double life17_89;
    double life19_109;
    double life21_132;
    float life23_134;
    double life24_158;
    double life26_173;
    double life28_183;
    double life30_196;
    double life24_200;
    double life28_204;
    double life26_208;
    float life32_214;
    double life24_219;
    double life28_224;
    double life26_229;
    double life33_236;
    moom.DR life35_250;
    float life36_252;
    moom.DZ life37_254;
    net.minecraft.util.MovingObjectPosition life38_256;
    int life39_258;
    int life40_260;
    com.moon.iv life41_264;
    int life42_270;
    int life43_272;
    moom.DR life44_309;
    moom.CA life45_368;
    int life46_377;
    int life47_386;
    int life48_395;
    int life49_404;
    java.util.ArrayList life50_408;
    int life51_410;
    int life52_417;
    java.util.Iterator life51_443;
    net.minecraft.entity.Entity life52_450;
    moom.CA life53_477;
    net.minecraft.util.MovingObjectPosition life54_498;
    double life28_556;
    float life43_593;
    float life44_599;
    float life45_605;
    float life46_607;
    moom.DZ life47_621;
    moom.DZ life48_635;
    moom.DZ life49_649;
    moom.DZ life50_663;
    float life51_665;
    moom.DZ life52_679;
    moom.DZ life53_693;
    moom.DZ life54_707;
    moom.DZ life55_721;
    moom.DZ life56_736;
    forest_join_1131: {
    forest_join_1130: {
    forest_join_1125: {
    forest_join_1121: {
    forest_join_1108: {
    forest_join_921: {
    forest_join_825: {
    forest_join_727: {
    forest_join_573: {
    forest_join_564: {
    forest_join_142: {
    life2_3 = (com.moon.module.impl.Trajectories.t ^ 25846194424669L);
    spill131_0 = com.moon.bY.b();
    life5_7 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K;
    life4_8 = spill131_0;
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).c__xW() != null))) {
        break forest_join_1131;
    }
    if (!(((com.moon.module.impl.Trajectories)(this)).a__Boolean(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).c__xW())).a__wQ()))))) {
        break forest_join_1131;
    }
    life6_24 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).a__nw())).a();
    spill131_1 = 5346;
    life8_29 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).a__nw())).b();
    spill131_2 = (7493641732468379606L ^ life2_3);
    life10_36 = ((net.minecraft.client.renderer.entity.RenderManager)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).a__nw())).c();
    org.lwjgl.opengl.GL11.glEnable(((int)(__sourceIntrinsic_2a96c96660b0_invokedynamic131_21(spill131_1, spill131_2))));
    life12_46 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.WORLD))))).b())).a(((int)(3))))).a();
    life13_54 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.WORLD))))).b())).a(((int)(3))))).a();
    life14_58 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).c__xW();
    life15_62 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).w;
    life16_66 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).x;
    life17_89 = ((((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).M + ((((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).n - ((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).M) * ((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).l)).b))) - ((double) (moom.Dr.b(((float)(((float) java.lang.Math.toRadians(((double)(((double) life15_62)))))))) * 0x1.47ae14p-3f)));
    life19_109 = (((((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).N + ((((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).o - ((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).N) * ((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).l)).b))) + ((double) ((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).e__Float())) - 0x1.9a35d9999aaebp-4d);
    life21_132 = ((((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).O + ((((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).p - ((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).O) * ((double) ((moom.DM)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).l)).b))) - ((double) (moom.Dr.a(((float)(((float) java.lang.Math.toRadians(((double)(((double) life15_62)))))))) * 0x1.47ae14p-3f)));
    life23_134 = 0x1.0p0f;
    if (!((((((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).bD)).a__xW())).a__wQ() instanceof net.minecraft.item.ItemBow) ? 1 : 0) == 0))) {
        break forest_join_142;
    }
    life23_134 = 0x1.99999ap-2f;
    }
    life24_158 = ((double) (((-moom.Dr.a(((float)(((float) java.lang.Math.toRadians(((double)(((double) life15_62))))))))) * moom.Dr.b(((float)(((float) java.lang.Math.toRadians(((double)(((double) life16_66))))))))) * life23_134));
    life26_173 = ((double) ((moom.Dr.b(((float)(((float) java.lang.Math.toRadians(((double)(((double) life15_62)))))))) * moom.Dr.b(((float)(((float) java.lang.Math.toRadians(((double)(((double) life16_66))))))))) * life23_134));
    life28_183 = ((double) ((-moom.Dr.a(((float)(((float) java.lang.Math.toRadians(((double)(((double) life16_66))))))))) * life23_134));
    life30_196 = java.lang.Math.sqrt(((double)((((life24_158 * life24_158) + (life28_183 * life28_183)) + (life26_173 * life26_173)))));
    life24_200 = (life24_158 / life30_196);
    life28_204 = (life28_183 / life30_196);
    life26_208 = (life26_173 / life30_196);
    life32_214 = ((com.moon.module.impl.Trajectories)(this)).a(((net.minecraft.item.ItemStack)(life14_58)), ((net.minecraft.entity.player.EntityPlayer)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)));
    life24_219 = (life24_200 * ((double) life32_214));
    life28_224 = (life28_204 * ((double) life32_214));
    life26_229 = (life26_208 * ((double) life32_214));
    life33_236 = ((com.moon.module.impl.Trajectories)(this)).a(((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).bD)).a__xW())).a__wQ())));
    life35_250 = new moom.DR(((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).n, (((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).o + ((double) ((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).e__Float())), ((net.minecraft.client.entity.EntityPlayerSP)(life5_7)).p);
    life36_252 = 0x1.333334p-2f;
    life37_254 = null;
    life38_256 = null;
    life39_258 = 0;
    life40_260 = 0;
    life41_264 = ((com.moon.hY)(((com.moon.hW)(life12_46)).a__hY())).a__iv();
    life42_270 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(this.s)).getValue())))).intValue();
    life43_272 = 0;
    forest_cycle_272: while (true) {
    forest_join_561: {
    forest_join_558: {
    forest_join_554: {
    forest_join_525: {
    forest_join_437: {
    forest_join_330: {
    forest_join_328: {
    if (!((life43_272 < __sourceIntrinsic_2a96c96660b0_invokedynamic131_99(23613, (3695611826608097032L ^ life2_3))))) {
        break forest_join_564;
    }
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)((life17_89 - life6_24))), ((double)((life19_109 - life8_29))), ((double)((life21_132 - life10_36)))))).a(((int)(life42_270)));
    ((com.moon.hY)(((com.moon.hW)(life12_46)).a__hY())).b(((int)((((com.moon.hY)(((com.moon.hW)(life12_46)).a__hY())).b__Int() + 1))));
    life44_309 = new moom.DR(life17_89, life19_109, life21_132);
    life38_256 = ((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM())).I)).a(((moom.DR)(life35_250)), ((moom.DR)(life44_309)));
    if (!((life4_8 == null))) {
        break forest_join_1125;
    }
    if (!((life4_8 == null))) {
        break forest_join_328;
    }
    if (!((life38_256 != null))) {
        break forest_join_330;
    }
    life37_254 = new moom.DZ(life17_89, life19_109, life21_132);
    }
    life40_260 = 1;
    }
    life45_368 = ((moom.CA)(((moom.CA)(new moom.CA((life17_89 - ((double) life36_252)), (life19_109 - ((double) life36_252)), (life21_132 - ((double) life36_252)), (life17_89 + ((double) life36_252)), (life19_109 + ((double) life36_252)), (life21_132 + ((double) life36_252))))).a(((double)(life24_219)), ((double)(life28_224)), ((double)(life26_229))))).b(((double)(0x1.0p0d)), ((double)(0x1.0p0d)), ((double)(0x1.0p0d)));
    life46_377 = ((int) java.lang.Math.floor(((double)(((((moom.CA)(life45_368)).b - 0x1.0p1d) / 0x1.0p4d)))));
    life47_386 = ((int) java.lang.Math.floor(((double)(((((moom.CA)(life45_368)).e + 0x1.0p1d) / 0x1.0p4d)))));
    life48_395 = ((int) java.lang.Math.floor(((double)(((((moom.CA)(life45_368)).d - 0x1.0p1d) / 0x1.0p4d)))));
    life49_404 = ((int) java.lang.Math.floor(((double)(((((moom.CA)(life45_368)).g + 0x1.0p1d) / 0x1.0p4d)))));
    life50_408 = new java.util.ArrayList();
    life51_410 = life46_377;
    forest_cycle_408: while (true) {
    forest_join_435: {
    forest_join_434: {
    if (!((life51_410 <= life47_386))) {
        break forest_join_437;
    }
    spill131_3 = life48_395;
    if (!((life4_8 == null))) {
        forestValue131_1130_0 = spill131_3;
        break forest_join_1130;
    }
    life52_417 = spill131_3;
    forest_cycle_415: while (true) {
    if (!((life52_417 <= life49_404))) {
        break forest_join_434;
    }
    ((net.minecraft.world.chunk.Chunk)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).I)).a__Fk(((int)(life51_410)), ((int)(life52_417))))).a(((net.minecraft.entity.Entity)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)), ((moom.CA)(life45_368)), ((java.util.List)(life50_408)), ((com.google.common.base.Predicate)(null)));
    life52_417 += 1;
    if (!((life4_8 == null))) {
        break forest_join_435;
    }
    if (!((life4_8 != null))) {
        continue forest_cycle_415;
    }
    break forest_cycle_415;
    }
    }
    life51_410 += 1;
    }
    if (!((life4_8 != null))) {
        continue forest_cycle_408;
    }
    break forest_cycle_408;
    }
    }
    life51_443 = ((java.util.List)(life50_408)).iterator();
    forest_cycle_440: while (true) {
    forest_join_523: {
    forest_join_513: {
    forest_join_508: {
    forest_join_495: {
    forest_join_461: {
    forest_join_455: {
    if (!(((java.util.Iterator)(life51_443)).hasNext())) {
        break forest_join_525;
    }
    life52_450 = ((net.minecraft.entity.Entity)(((java.util.Iterator)(life51_443)).next()));
    spill131_4 = life52_450;
    if (!((life4_8 == null))) {
        forestValue131_455_0 = spill131_4;
        break forest_join_455;
    }
    spill131_5 = ((net.minecraft.entity.Entity)(spill131_4)).m__Boolean();
    if (!((life4_8 == null))) {
        forestValue131_554_0 = ((spill131_5) ? 1 : 0);
        break forest_join_554;
    }
    if (!(spill131_5)) {
        break forest_join_523;
    }
    forestValue131_455_0 = life52_450;
    }
    if (!((life4_8 == null))) {
        forestValue131_461_0 = forestValue131_455_0;
        break forest_join_461;
    }
    if (!((forestValue131_455_0 != ((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K))) {
        break forest_join_523;
    }
    forestValue131_461_0 = life52_450;
    }
    life53_477 = ((moom.CA)(((net.minecraft.entity.Entity)(forestValue131_461_0)).b())).b(((double)(((double) life36_252))), ((double)(((double) life36_252))), ((double)(((double) life36_252))));
    life54_498 = ((moom.CA)(life53_477)).a(((moom.DR)(new moom.DR(life17_89, life19_109, life21_132))), ((moom.DR)(new moom.DR((life17_89 + life24_219), (life19_109 + life28_224), (life21_132 + life26_229)))));
    if (!((life54_498 == null))) {
        break forest_join_495;
    }
    if (!((life4_8 != null))) {
        continue forest_cycle_440;
    }
    }
    spill131_6 = recovery.source.CarrierOps.dcmpg(((double)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).b(((double)(life17_89)), ((double)(life19_109)), ((double)(life21_132))))), ((double)(0x1.8p1d)));
    if (!((life4_8 == null))) {
        forestValue131_513_0 = spill131_6;
        break forest_join_513;
    }
    if (!((spill131_6 < 0))) {
        break forest_join_508;
    }
    if (!((life4_8 != null))) {
        continue forest_cycle_440;
    }
    }
    life38_256 = life54_498;
    life39_258 = 1;
    forestValue131_513_0 = 1;
    }
    life40_260 = forestValue131_513_0;
    life37_254 = new moom.DZ(life17_89, life19_109, life21_132);
    if (!((life4_8 != null))) {
        break forest_join_525;
    }
    }
    if (!((life4_8 != null))) {
        continue forest_cycle_440;
    }
    break forest_cycle_440;
    }
    }
    life17_89 = (life17_89 + life24_219);
    life19_109 = (life19_109 + life28_224);
    life21_132 = (life21_132 + life26_229);
    life24_219 = (life24_219 * 0x1.fae147ae147aep-1d);
    life28_556 = (life28_224 * 0x1.fae147ae147aep-1d);
    life26_229 = (life26_229 * 0x1.fae147ae147aep-1d);
    life28_224 = (life28_556 - life33_236);
    forestValue131_554_0 = life39_258;
    }
    if (!((life4_8 == null))) {
        forestValue131_558_0 = forestValue131_554_0;
        break forest_join_558;
    }
    if (!((forestValue131_554_0 == 0))) {
        break forest_join_564;
    }
    forestValue131_558_0 = life40_260;
    }
    if (!((forestValue131_558_0 != 0))) {
        break forest_join_561;
    }
    if (!((life4_8 != null))) {
        break forest_join_564;
    }
    }
    life43_272 += 1;
    if (!((life4_8 != null))) {
        continue forest_cycle_272;
    }
    break forest_cycle_272;
    }
    }
    spill131_7 = life37_254;
    if (!((life4_8 == null))) {
        forestValue131_573_0 = spill131_7;
        break forest_join_573;
    }
    if (!((spill131_7 != null))) {
        break forest_join_1121;
    }
    life41_264 = ((com.moon.hY)(((com.moon.hW)(life13_54)).a__hY())).a__iv();
    forestValue131_573_0 = life37_254;
    }
    life43_593 = ((float) (((moom.DZ)(forestValue131_573_0)).a - life6_24));
    life44_599 = ((float) (((moom.DZ)(life37_254)).b - life8_29));
    life45_605 = ((float) (((moom.DZ)(life37_254)).c - life10_36));
    life46_607 = 0x1.99999ap-2f;
    life47_621 = new moom.DZ(((double) (life43_593 - life46_607)), ((double) life44_599), ((double) (life45_605 - life46_607)));
    life48_635 = new moom.DZ(((double) (life43_593 - life46_607)), ((double) life44_599), ((double) (life45_605 + life46_607)));
    life49_649 = new moom.DZ(((double) (life43_593 + life46_607)), ((double) life44_599), ((double) (life45_605 + life46_607)));
    life50_663 = new moom.DZ(((double) (life43_593 + life46_607)), ((double) life44_599), ((double) (life45_605 - life46_607)));
    life51_665 = 0x1.99999ap-3f;
    life52_679 = new moom.DZ(((double) (life43_593 - life51_665)), ((double) life44_599), ((double) (life45_605 - life51_665)));
    life53_693 = new moom.DZ(((double) (life43_593 - life51_665)), ((double) life44_599), ((double) (life45_605 + life51_665)));
    life54_707 = new moom.DZ(((double) (life43_593 + life51_665)), ((double) life44_599), ((double) (life45_605 + life51_665)));
    life55_721 = new moom.DZ(((double) (life43_593 + life51_665)), ((double) life44_599), ((double) (life45_605 - life51_665)));
    if (!((life4_8 == null))) {
        break forest_join_1108;
    }
    if (!((life38_256 != null))) {
        break forest_join_921;
    }
    life56_736 = new moom.DZ(((double) life43_593), ((double) life44_599), ((double) life45_605));
    if (!((life4_8 == null))) {
        break forest_join_1108;
    }
    switch (((net.minecraft.util.EnumFacing$Axis)(((moom.bs)(((net.minecraft.util.MovingObjectPosition)(life38_256)).c)).a__bt())).ordinal()) {
case 0:
{
        break forest_join_727;
    }
case 2:
{
        break forest_join_825;
    }
default:
{
        break forest_join_921;
    }
}
    }
    life47_621 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life47_621)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    life48_635 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life48_635)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    life49_649 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life49_649)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    life50_663 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life50_663)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    life52_679 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life52_679)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    life53_693 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life53_693)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    life54_707 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life54_707)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    life55_721 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life55_721)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x0.0p0d, 0x0.0p0d, 0x1.0p0d))));
    if (!((life4_8 != null))) {
        break forest_join_921;
    }
    }
    life47_621 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life47_621)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    life48_635 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life48_635)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    life49_649 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life49_649)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    life50_663 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life50_663)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    life52_679 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life52_679)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    life53_693 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life53_693)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    life54_707 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life54_707)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    life55_721 = ((com.moon.module.impl.Trajectories)(this)).a(((moom.DZ)(life55_721)), ((moom.DZ)(life56_736)), ((float)(0x1.68p6f)), ((moom.DZ)(new moom.DZ(0x1.0p0d, 0x0.0p0d, 0x0.0p0d))));
    }
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life47_621)).a)), ((double)(((moom.DZ)(life47_621)).b)), ((double)(((moom.DZ)(life47_621)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life48_635)).a)), ((double)(((moom.DZ)(life48_635)).b)), ((double)(((moom.DZ)(life48_635)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life49_649)).a)), ((double)(((moom.DZ)(life49_649)).b)), ((double)(((moom.DZ)(life49_649)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life50_663)).a)), ((double)(((moom.DZ)(life50_663)).b)), ((double)(((moom.DZ)(life50_663)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life47_621)).a)), ((double)(((moom.DZ)(life47_621)).b)), ((double)(((moom.DZ)(life47_621)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life52_679)).a)), ((double)(((moom.DZ)(life52_679)).b)), ((double)(((moom.DZ)(life52_679)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life53_693)).a)), ((double)(((moom.DZ)(life53_693)).b)), ((double)(((moom.DZ)(life53_693)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life54_707)).a)), ((double)(((moom.DZ)(life54_707)).b)), ((double)(((moom.DZ)(life54_707)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life55_721)).a)), ((double)(((moom.DZ)(life55_721)).b)), ((double)(((moom.DZ)(life55_721)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life52_679)).a)), ((double)(((moom.DZ)(life52_679)).b)), ((double)(((moom.DZ)(life52_679)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life47_621)).a)), ((double)(((moom.DZ)(life47_621)).b)), ((double)(((moom.DZ)(life47_621)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life48_635)).a)), ((double)(((moom.DZ)(life48_635)).b)), ((double)(((moom.DZ)(life48_635)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life53_693)).a)), ((double)(((moom.DZ)(life53_693)).b)), ((double)(((moom.DZ)(life53_693)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life54_707)).a)), ((double)(((moom.DZ)(life54_707)).b)), ((double)(((moom.DZ)(life54_707)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life49_649)).a)), ((double)(((moom.DZ)(life49_649)).b)), ((double)(((moom.DZ)(life49_649)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life50_663)).a)), ((double)(((moom.DZ)(life50_663)).b)), ((double)(((moom.DZ)(life50_663)).c))))).a(((int)(life42_270)));
    ((com.moon.iv)(((com.moon.iv)(life41_264)).a(((double)(((moom.DZ)(life55_721)).a)), ((double)(((moom.DZ)(life55_721)).b)), ((double)(((moom.DZ)(life55_721)).c))))).a(((int)(life42_270)));
    }
    ((com.moon.hY)(((com.moon.hW)(life13_54)).a__hY())).b(((int)((((com.moon.hY)(((com.moon.hW)(life13_54)).a__hY())).b__Int() + __sourceIntrinsic_2a96c96660b0_invokedynamic131_252(1450, (4428526035813703324L ^ life2_3))))));
    }
    ((com.moon.hW)(life12_46)).b();
    ((com.moon.hW)(life13_54)).b();
    }
    forestValue131_1130_0 = __sourceIntrinsic_2a96c96660b0_invokedynamic131_256(4291, (4749123471341751284L ^ life2_3));
    }
    org.lwjgl.opengl.GL11.glDisable(((int)(forestValue131_1130_0)));
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private double a(net.minecraft.item.Item p0) {
long local2 = (com.moon.module.impl.Trajectories.t ^ 126236834818399L);
    return ((((p0 instanceof net.minecraft.item.ItemBow) ? 1 : 0) != 0) ? 0x1.99999ap-5d : 0x1.eb851eb851eb8p-6d);
}


private boolean a__Boolean(net.minecraft.item.Item p0) {
int forwardValue965_21_0;
    int forwardValue965_36_0;
    int forwardValue965_51_0;
    int forwardValue965_80_0;
    int forwardValue965_82_0;
    int spill965_0;
    int spill965_1;
    boolean spill965_2;
    boolean spill965_3;
    int spill965_4;
    int spill965_5;
    int spill965_6;
    int spill965_7;
    int spill965_8;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_82: {
    forward_join_81: {
    forward_join_80: {
    forward_join_79: {
    forward_join_51: {
    forward_join_49: {
    forward_join_36: {
    forward_join_34: {
    forward_join_21: {
    forward_join_19: {
    life2_3 = (com.moon.module.impl.Trajectories.t ^ 7277685502764L);
    life4_5 = com.moon.bY.b();
    spill965_0 = ((p0 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue965_21_0 = spill965_0;
        break forward_join_21;
    }
    if (!((spill965_0 != 0))) {
        break forward_join_19;
    }
    spill965_1 = ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).l__Int();
    if (!((life4_5 == null))) {
        forwardValue965_21_0 = spill965_1;
        break forward_join_21;
    }
    if (!((spill965_1 == 0))) {
        break forward_join_19;
    }
    return ((0) != 0);
    }
    forwardValue965_21_0 = ((p0 instanceof net.minecraft.item.ItemPotion) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue965_36_0 = forwardValue965_21_0;
        break forward_join_36;
    }
    if (!((forwardValue965_21_0 != 0))) {
        break forward_join_34;
    }
    spill965_2 = __sourceExactCall_dfc78c0199fd67(((int)(((net.minecraft.item.ItemStack)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).c__xW())).b())));
    if (!((life4_5 == null))) {
        forwardValue965_36_0 = ((spill965_2) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill965_2))) {
        break forward_join_34;
    }
    return ((0) != 0);
    }
    forwardValue965_36_0 = ((p0 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue965_51_0 = forwardValue965_36_0;
        break forward_join_51;
    }
    if (!((forwardValue965_36_0 != 0))) {
        break forward_join_49;
    }
    spill965_3 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.Trajectories.d)).K)).bD)).b(((net.minecraft.item.Item)(net.minecraft.init.Items.g)));
    if (!((life4_5 == null))) {
        forwardValue965_51_0 = ((spill965_3) ? 1 : 0);
        break forward_join_51;
    }
    if (!((!spill965_3))) {
        break forward_join_49;
    }
    return ((0) != 0);
    }
    forwardValue965_51_0 = ((p0 instanceof net.minecraft.item.ItemBow) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue965_80_0 = forwardValue965_51_0;
        break forward_join_80;
    }
    if (!((forwardValue965_51_0 == 0))) {
        break forward_join_79;
    }
    spill965_4 = ((p0 instanceof moom.xO) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue965_80_0 = spill965_4;
        break forward_join_80;
    }
    if (!((spill965_4 == 0))) {
        break forward_join_79;
    }
    spill965_5 = ((p0 instanceof moom.xf) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue965_80_0 = spill965_5;
        break forward_join_80;
    }
    if (!((spill965_5 == 0))) {
        break forward_join_79;
    }
    spill965_6 = ((p0 instanceof moom.xi) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue965_80_0 = spill965_6;
        break forward_join_80;
    }
    if (!((spill965_6 == 0))) {
        break forward_join_79;
    }
    spill965_7 = ((p0 instanceof net.minecraft.item.ItemPotion) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue965_80_0 = spill965_7;
        break forward_join_80;
    }
    if (!((spill965_7 == 0))) {
        break forward_join_79;
    }
    spill965_8 = ((p0 instanceof moom.xj) ? 1 : 0);
    if (!((life4_5 == null))) {
        forwardValue965_80_0 = spill965_8;
        break forward_join_80;
    }
    if (!((spill965_8 != 0))) {
        break forward_join_81;
    }
    }
    forwardValue965_80_0 = 1;
    }
    forwardValue965_82_0 = forwardValue965_80_0;
    break forward_join_82;
    }
    forwardValue965_82_0 = 0;
    }
    return ((forwardValue965_82_0) != 0);
}


private moom.DZ a(moom.DZ p0, moom.DZ p1, float p2, moom.DZ p3) {
double local5 = java.lang.Math.toRadians(((double)(((double) p2))));
    double local7 = (((moom.DZ)(p0)).a - ((moom.DZ)(p1)).a);
    double local9 = (((moom.DZ)(p0)).b - ((moom.DZ)(p1)).b);
    double local11 = (((moom.DZ)(p0)).c - ((moom.DZ)(p1)).c);
    double local13 = ((((moom.DZ)(p3)).b * local11) - (((moom.DZ)(p3)).c * local9));
    double local15 = ((((moom.DZ)(p3)).c * local7) - (((moom.DZ)(p3)).a * local11));
    double local17 = ((((moom.DZ)(p3)).a * local9) - (((moom.DZ)(p3)).b * local7));
    double local19 = (((((moom.DZ)(p3)).a * local7) + (((moom.DZ)(p3)).b * local9)) + (((moom.DZ)(p3)).c * local11));
    double local21 = (((local7 * java.lang.Math.cos(((double)(local5)))) + (local13 * java.lang.Math.sin(((double)(local5))))) + ((local19 * (0x1.0p0d - java.lang.Math.cos(((double)(local5))))) * ((moom.DZ)(p3)).a));
    double local23 = (((local9 * java.lang.Math.cos(((double)(local5)))) + (local15 * java.lang.Math.sin(((double)(local5))))) + ((local19 * (0x1.0p0d - java.lang.Math.cos(((double)(local5))))) * ((moom.DZ)(p3)).b));
    double local25 = (((local11 * java.lang.Math.cos(((double)(local5)))) + (local17 * java.lang.Math.sin(((double)(local5))))) + ((local19 * (0x1.0p0d - java.lang.Math.cos(((double)(local5))))) * ((moom.DZ)(p3)).c));
    local21 = (local21 + ((moom.DZ)(p1)).a);
    local23 = (local23 + ((moom.DZ)(p1)).b);
    local25 = (local25 + ((moom.DZ)(p1)).c);
    return new moom.DZ(local21, local23, local25);
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0df68b482c45a441_originalDynamicSite1316_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_0df68b482c45a441_originalDynamicSite1316_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a96c96660b0_invokedynamic131_21(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a96c96660b0_invokedynamic131_99(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a96c96660b0_invokedynamic131_252(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_2a96c96660b0_invokedynamic131_256(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2743_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2744_0() throws E;

private static native float __sourceExactCall_83948e598c96c5(int p0);
private static native boolean __sourceExactCall_dfc78c0199fd67(int p0);
}
