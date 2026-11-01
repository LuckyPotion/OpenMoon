package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class TimeChanger extends com.moon.module.Module {

private com.moon.setting.IntegerSetting s;

private static long t;

private static java.lang.String[] u;

private static java.lang.String[] v;

private static java.util.Map w;

private static long[] x;

private static java.lang.Integer[] y;

private static java.util.Map z;

public TimeChanger(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_7b38baad6da3f851(com.moon.module.impl.TimeChanger receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.TimeChanger.t ^ 60356434604247L);

    com.moon.module.impl.TimeChanger.__sourceConstructorInit_7b38baad6da3f851_0(((com.moon.module.impl.TimeChanger)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.TimeChanger)(receiver)).s = ((com.moon.setting.IntegerSetting)(((com.moon.mf)(((com.moon.mf)(com.moon.setting.IntegerSetting.builder(((java.lang.String)(__sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_2(24788, (8422031969123669272L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_4(231, (6685132414040962346L ^ local5)))), ((int)(__sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_5(2806, (2514560254446624598L ^ local5)))), ((int)(0)), ((int)(__sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_6(32397, (8508403825695632175L ^ local5)))), ((int)(__sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_7(11128, (2353938338216312537L ^ local5))))))).a()));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_7b38baad6da3f851_0(com.moon.module.impl.TimeChanger a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
t = ((long)(((moom._a)(moom._c.a(((long)(-2239727021849725656L)), ((long)(-5759241662729526248L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(58836362833241L)))));
    w = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.TimeChanger.t ^ 66067188083165L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill294_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill294_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill294_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill294_14 = new byte[8];
    (__sourceSpill294_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill294_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation294_16 = __sourceSpill294_14;
    ((javax.crypto.Cipher)(__sourceSpill294_11)).init(((int)(__sourceSpill294_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill294_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation294_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "CÆXj×æöM\nÝ\n\001#y;\020Eøj×\001\001\"0¾j\032Øè§;"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill294_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill294_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill294_29)).doFinal(((byte[])(__sourceSpill294_28)));
        java.lang.String __sourceSpill294_34 = ((java.lang.String)(com.moon.module.impl.TimeChanger.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill294_35 = local20_life19;
        int __sourceSpill294_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill294_35)[__sourceSpill294_36] = __sourceSpill294_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    u = ((java.lang.String[])(local20_life19));
    v = ((java.lang.String[])(new java.lang.String[2]));
    z = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill294_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill294_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill294_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill294_47 = new byte[8];
    (__sourceSpill294_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill294_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation294_49 = __sourceSpill294_47;
    ((javax.crypto.Cipher)(__sourceSpill294_44)).init(((int)(__sourceSpill294_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill294_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation294_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[3];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "Þú +*ÓaªvQyf]Á\001§Q®b|"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill294_58 = local4_life54;
        int __sourceSpill294_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill294_58)).substring(((int)(__sourceSpill294_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill294_63 = local6_life52;
        int __sourceSpill294_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill294_66 = new byte[8];
        (__sourceSpill294_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill294_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill294_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill294_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill294_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill294_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill294_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill294_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill294_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill294_67)).doFinal(((byte[])(__sourceSpill294_66)));
        (__sourceSpill294_63)[__sourceSpill294_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    x = ((long[])(local6_life52));
    y = ((java.lang.Integer[])(new java.lang.Integer[3]));
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
        byte[] spill1249_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1249_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1249_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1249_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1249_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1249_2)[life4_9];
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 30211);
    if (((com.moon.module.impl.TimeChanger.v)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.TimeChanger.w)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.TimeChanger.w)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/l5", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.TimeChanger.u)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.TimeChanger.v)[life5_8] = com.moon.module.impl.TimeChanger.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.TimeChanger.v)[life5_8];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2733_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.TimeChanger.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.TimeChanger.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2734_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/l5"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 22126;
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
            throw new RuntimeException("com/moon/l5", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         y[var3] = var15;
      }

      return y[var3];
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.multiplayer.WorldClient forwardValue961_14_0;
    net.minecraft.client.multiplayer.WorldClient spill961_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_14: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.TimeChanger.t ^ 23979841122116L);
    life4_5 = com.moon.bY.b();
    spill961_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.TimeChanger.d)).I;
    if (!((life4_5 == null))) {
        forwardValue961_14_0 = spill961_0;
        break forward_join_14;
    }
    if (!((spill961_0 == null))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue961_14_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.TimeChanger.d)).I;
    }
    ((net.minecraft.client.multiplayer.WorldClient)(forwardValue961_14_0)).b(((long)(((long) ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.IntegerSetting)(this.s)).getValue())))).intValue()))));
    return;
}


public void a(com.moon.event.PacketEvent p0) {
com.moon.event.CancellableEvent forwardValue960_15_0;
    com.moon.event.PacketEvent spill960_0;
    long life2_3;
    net.minecraft.entity.Entity[] life4_5;
    forward_join_16: {
    forward_join_15: {
    life2_3 = (com.moon.module.impl.TimeChanger.t ^ 109872289020542L);
    life4_5 = com.moon.bY.b();
    spill960_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue960_15_0 = spill960_0;
        break forward_join_15;
    }
    if (!((((((com.moon.event.PacketEvent)(spill960_0)).getPacket() instanceof moom.zw) ? 1 : 0) != 0))) {
        break forward_join_16;
    }
    forwardValue960_15_0 = ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    }
    recovery.source.CarrierOps.discard(forwardValue960_15_0);
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7b38baad6da3f851_originalDynamicSite1312_7(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2733_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2734_0() throws E;
}
