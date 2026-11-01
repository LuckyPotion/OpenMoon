package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class AutoTool extends com.moon.module.Module {

private com.moon.setting.BooleanSetting s;

private moom.DT t;

private boolean u;

private static int v;

private int w;

private static long x;

private static java.lang.String[] y;

private static java.lang.String[] z;

private static java.util.Map A;

private static long[] B;

private static java.lang.Integer[] C;

private static java.util.Map D;

public AutoTool(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) { super((java.lang.String)null, (java.lang.String)null, (java.lang.String)null, (com.moon.module.ModuleCategory)null); }


private static void __sourceConstructorBody_e89c46ebe29ecb35(com.moon.module.impl.AutoTool receiver, java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) throws Throwable {

long local5 = (com.moon.module.impl.AutoTool.x ^ 66483222307913L);

    com.moon.module.impl.AutoTool.__sourceConstructorInit_e89c46ebe29ecb35_0(((com.moon.module.impl.AutoTool)(receiver)), ((java.lang.String)(p0)), ((java.lang.String)(p1)), ((java.lang.String)(p2)), ((com.moon.module.ModuleCategory)(p3)));

    ((com.moon.module.impl.AutoTool)(receiver)).s = ((com.moon.setting.BooleanSetting)(((com.moon.l_)(((com.moon.l_)(com.moon.setting.BooleanSetting.builder(((java.lang.String)(__sourceIntrinsic_e89c46ebe29ecb35_originalDynamicSite1220_2(22403, (1047362629374246889L ^ local5))))))).a(((java.lang.String)(__sourceIntrinsic_e89c46ebe29ecb35_originalDynamicSite1220_4(13928, (3710589878997818883L ^ local5)))), ((boolean)(false))))).a()));

    ((com.moon.module.impl.AutoTool)(receiver)).u = ((boolean)(false));

    ((com.moon.module.impl.AutoTool)(receiver)).w = ((int)(com.moon.module.impl.AutoTool.v));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_e89c46ebe29ecb35_0(com.moon.module.impl.AutoTool a0, java.lang.String a1, java.lang.String a2, java.lang.String a3, com.moon.module.ModuleCategory a4) throws E;

static {
x = ((long)(((moom._a)(moom._c.a(((long)(-1336955156509875829L)), ((long)(2705423345474228108L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(272543471487136L)))));
    A = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.module.impl.AutoTool.x ^ 108206997960272L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill259_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill259_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill259_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill259_14 = new byte[8];
    (__sourceSpill259_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill259_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation259_16 = __sourceSpill259_14;
    ((javax.crypto.Cipher)(__sourceSpill259_11)).init(((int)(__sourceSpill259_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill259_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation259_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life19 = new java.lang.String[2];
    int local18_life20 = 0;
    java.lang.String local17_life21;
    int local19_life23 = ((java.lang.String)((local17_life21 = "ù¯¢+:\003i\002ï>ÒúPÚ\020LáÂil³õ\004b±(89\021"))).length();
    int local16_life24 = 16;
    int local15_life25 = -1;
    while (true) {
        local15_life25 += 1;
        byte[] __sourceSpill259_28 = ((java.lang.String)(((java.lang.String)(local17_life21)).substring(((int)(local15_life25)), ((int)((local15_life25 + local16_life24)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill259_29 = local13_life9;
        byte[] local21_life31 = ((javax.crypto.Cipher)(__sourceSpill259_29)).doFinal(((byte[])(__sourceSpill259_28)));
        java.lang.String __sourceSpill259_34 = ((java.lang.String)(com.moon.module.impl.AutoTool.c(((byte[])(local21_life31))))).intern();
        java.lang.String[] __sourceSpill259_35 = local20_life19;
        int __sourceSpill259_36 = local18_life20;
        local18_life20 += 1;
        (__sourceSpill259_35)[__sourceSpill259_36] = __sourceSpill259_34;
        if (!(((local15_life25 = (local15_life25 + local16_life24)) < local19_life23))) { break; }
        local16_life24 = ((java.lang.String)(local17_life21)).charAt(((int)(local15_life25)));
    }
    y = ((java.lang.String[])(local20_life19));
    z = ((java.lang.String[])(new java.lang.String[2]));
    D = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life42;
    javax.crypto.Cipher __sourceSpill259_44 = (local0_life42 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill259_45 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill259_46 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill259_47 = new byte[8];
    (__sourceSpill259_47)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life48 = 1;
    while ((local1_life48 < 8)) {
        (__sourceSpill259_47)[local1_life48] = ((byte) ((int) ((local11_life7 << (local1_life48 * 8)) >>> 56)));
        local1_life48 += 1;
    }
    byte[] __sourcePreallocation259_49 = __sourceSpill259_47;
    ((javax.crypto.Cipher)(__sourceSpill259_44)).init(((int)(__sourceSpill259_45)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill259_46)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation259_49)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life52 = new long[3];
    int local3_life53 = 0;
    java.lang.String local4_life54;
    int local5_life56 = ((java.lang.String)((local4_life54 = "­»\020¢J×\006º\030ÞeCÑw\035a¯V/iä?"))).length();
    int local2_life57 = 0;
    do {
        java.lang.String __sourceSpill259_58 = local4_life54;
        int __sourceSpill259_59 = local2_life57;
        local2_life57 += 8;
        byte[] local7_life62 = ((java.lang.String)(((java.lang.String)(__sourceSpill259_58)).substring(((int)(__sourceSpill259_59)), ((int)(local2_life57))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill259_63 = local6_life52;
        int __sourceSpill259_64 = local3_life53;
        local3_life53 += 1;
        long local8_life65 = (((((((((((long) (local7_life62)[0]) & 255L) << 56) | ((((long) (local7_life62)[1]) & 255L) << 48)) | ((((long) (local7_life62)[2]) & 255L) << 40)) | ((((long) (local7_life62)[3]) & 255L) << 32)) | ((((long) (local7_life62)[4]) & 255L) << 24)) | ((((long) (local7_life62)[5]) & 255L) << 16)) | ((((long) (local7_life62)[6]) & 255L) << 8)) | (((long) (local7_life62)[7]) & 255L));
        byte[] __sourceSpill259_66 = new byte[8];
        (__sourceSpill259_66)[0] = ((byte) ((int) (local8_life65 >>> 56)));
        (__sourceSpill259_66)[1] = ((byte) ((int) (local8_life65 >>> 48)));
        (__sourceSpill259_66)[2] = ((byte) ((int) (local8_life65 >>> 40)));
        (__sourceSpill259_66)[3] = ((byte) ((int) (local8_life65 >>> 32)));
        (__sourceSpill259_66)[4] = ((byte) ((int) (local8_life65 >>> 24)));
        (__sourceSpill259_66)[5] = ((byte) ((int) (local8_life65 >>> 16)));
        (__sourceSpill259_66)[6] = ((byte) ((int) (local8_life65 >>> 8)));
        (__sourceSpill259_66)[7] = ((byte) ((int) local8_life65));
        javax.crypto.Cipher __sourceSpill259_67 = local0_life42;
        byte[] local10_life69 = ((javax.crypto.Cipher)(__sourceSpill259_67)).doFinal(((byte[])(__sourceSpill259_66)));
        (__sourceSpill259_63)[__sourceSpill259_64] = (((((((((((long) (local10_life69)[0]) & 255L) << 56) | ((((long) (local10_life69)[1]) & 255L) << 48)) | ((((long) (local10_life69)[2]) & 255L) << 40)) | ((((long) (local10_life69)[3]) & 255L) << 32)) | ((((long) (local10_life69)[4]) & 255L) << 24)) | ((((long) (local10_life69)[5]) & 255L) << 16)) | ((((long) (local10_life69)[6]) & 255L) << 8)) | (((long) (local10_life69)[7]) & 255L));
    } while ((!(local2_life57 >= local5_life56)));
    B = ((long[])(local6_life52));
    C = ((java.lang.Integer[])(new java.lang.Integer[3]));
    v = ((int)(-1));
}


private void b(com.moon.event.PacketEvent p0, moom.za p1) {
this.t = ((moom.DT)(null));
    ((com.moon.event.PacketEvent)(p0)).setCancelled(((boolean)(true)));
    ((net.minecraft.client.network.NetHandlerPlayClient)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).cm)).b(((moom.yK)(p1)));
    ((com.moon.gF)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).bC)).a(((int)(this.w)));
    this.w = ((int)(com.moon.module.impl.AutoTool.v));
    return;
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 22018);
    if (((com.moon.module.impl.AutoTool.z)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.module.impl.AutoTool.A)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.module.impl.AutoTool.A)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/lB", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.module.impl.AutoTool.y)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.module.impl.AutoTool.z)[life5_8] = com.moon.module.impl.AutoTool.c(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.module.impl.AutoTool.z)[life5_8];
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2357_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill1034_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1034_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1034_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1034_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1034_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1034_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


public void onEnable() {
this.t = ((moom.DT)(null));
    this.w = ((int)(com.moon.module.impl.AutoTool.v));
    return;
}


private static java.lang.Object c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.module.impl.AutoTool.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void f() {
this.t = ((moom.DT)(null));
    ((com.moon.gF)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).bC)).a(((int)(this.w)));
    this.w = ((int)(com.moon.module.impl.AutoTool.v));
    return;
}


public void onDisable() {
this.w = ((int)(com.moon.module.impl.AutoTool.v));
    return;
}


private static int d(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10522;
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
            throw new RuntimeException("com/moon/lB", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         C[var3] = var15;
      }

      return C[var3];
}


private static int d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.AutoTool.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2359_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lB"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(com.moon.eN p0) {
int forwardValue786_16_0;
    boolean spill786_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_28: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.AutoTool.x ^ 61567061826577L);
    life4_5 = com.moon.bF.b();
    spill786_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue786_16_0 = ((spill786_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill786_0)) {
        break forward_join_28;
    }
    forwardValue786_16_0 = this.w;
    }
    if (!((forwardValue786_16_0 != com.moon.module.impl.AutoTool.v))) {
        break forward_join_28;
    }
    if (!((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).F)).a__bE() != net.minecraft.world.WorldSettings$GameType.CREATIVE))) {
        break forward_join_28;
    }
    ((com.moon.eN)(p0)).a(((int)(this.w)));
    }
    return;
}


public void a(com.moon.event.TickEvent p0) {
net.minecraft.client.entity.EntityPlayerSP forwardValue789_17_0;
    net.minecraft.client.entity.EntityPlayerSP spill789_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_23: {
    forward_join_17: {
    life2_3 = (com.moon.module.impl.AutoTool.x ^ 126513858902473L);
    life4_5 = com.moon.bF.b();
    if (!((((com.moon.event.TickEvent)(p0)).getPhase() == com.moon.event.TickPhase.PRE))) {
        break forward_join_23;
    }
    spill789_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K;
    if (!((life4_5 != null))) {
        forwardValue789_17_0 = spill789_0;
        break forward_join_17;
    }
    if (!((spill789_0 != null))) {
        break forward_join_23;
    }
    forwardValue789_17_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K;
    }
    if (!((((net.minecraft.client.entity.EntityPlayerSP)(forwardValue789_17_0)).S <= 2))) {
        break forward_join_23;
    }
    this.w = ((int)(com.moon.module.impl.AutoTool.v));
    }
    return;
}


private void a(com.moon.event.PacketEvent p0, moom.za p1) {
long local3 = (com.moon.module.impl.AutoTool.x ^ 30491467765338L);
    this.t = ((moom.DT)(((moom.za)(p1)).a()));
    this.w = ((int)(((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).bD)).c));
    if ((((((net.minecraft.entity.player.PlayerCapabilities)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).b1)).d) ? 1 : 0) != 0)) {
        return;
    }
    java.lang.Object local5 = ((moom.za)(p1)).a();
    if ((local5 == null)) {
        return;
    }
    int local6 = ((com.moon.module.impl.AutoTool)(this)).a(((moom.DT)(local5)));
    ((com.moon.gF)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).bC)).a(((int)(local6)));
    ((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).F)).c();
    return;
}


public void a(com.moon.event.PacketEvent p0) {
com.moon.event.PacketEvent forwardValue788_13_0;
    moom.yK forwardValue788_21_0;
    com.moon.event.PacketEvent spill788_0;
    moom.yK spill788_1;
    long life2_3;
    java.lang.String life4_5;
    moom.yK life6_19;
    moom.za life5_33;
    forward_join_42: {
    forward_join_38: {
    forward_join_21: {
    forward_join_13: {
    forward_join_12: {
    life2_3 = (com.moon.module.impl.AutoTool.x ^ 27225834071942L);
    life4_5 = com.moon.bF.b();
    spill788_0 = p0;
    if (!((life4_5 != null))) {
        forwardValue788_13_0 = spill788_0;
        break forward_join_13;
    }
    if (!((!((com.moon.event.PacketEvent)(spill788_0)).b__sourceReturn_aae029aa0a()))) {
        break forward_join_12;
    }
    return;
    }
    forwardValue788_13_0 = p0;
    }
    life6_19 = ((com.moon.event.PacketEvent)(forwardValue788_13_0)).getPacket();
    spill788_1 = life6_19;
    if (!((life4_5 != null))) {
        forwardValue788_21_0 = spill788_1;
        break forward_join_21;
    }
    if (!((((spill788_1 instanceof moom.za) ? 1 : 0) != 0))) {
        break forward_join_42;
    }
    forwardValue788_21_0 = life6_19;
    }
    life5_33 = ((moom.za)(forwardValue788_21_0));
    if (!((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).F)).a__bE() != net.minecraft.world.WorldSettings$GameType.CREATIVE))) {
        break forward_join_42;
    }
    if (!((((moom.za)(life5_33)).a__bd() == net.minecraft.network.play.client.C07PacketPlayerDigging$Action.START_DESTROY_BLOCK))) {
        break forward_join_38;
    }
    ((com.moon.module.impl.AutoTool)(this)).a(((com.moon.event.PacketEvent)(p0)), ((moom.za)(life5_33)));
    if (!((life4_5 == null))) {
        break forward_join_42;
    }
    }
    ((com.moon.module.impl.AutoTool)(this)).b(((com.moon.event.PacketEvent)(p0)), ((moom.za)(life5_33)));
    }
    return;
}


private int a(moom.DT p0) {
net.minecraft.item.ItemStack lexicalValue223_50_0;
    java.lang.String spill223_0;
    net.minecraft.item.ItemStack spill223_1;
    long life2_3;
    int life5_9;
    java.lang.String life4_10;
    net.minecraft.block.Block life6_16;
    float life7_24;
    int life8_30;
    net.minecraft.item.ItemStack life9_44;
    float life10_65;
    lexical_join_74: {
    lexical_join_21: {
    life2_3 = (com.moon.module.impl.AutoTool.x ^ 23785225741172L);
    spill223_0 = com.moon.bF.b();
    life5_9 = ((net.minecraft.entity.player.InventoryPlayer)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).bD)).c;
    life4_10 = spill223_0;
    life6_16 = ((net.minecraft.block.state.IBlockState)(((net.minecraft.client.multiplayer.WorldClient)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).I)).a__fE(((moom.DT)(p0))))).a__ch();
    if (!((life6_16 == null))) {
        break lexical_join_21;
    }
    return life5_9;
    }
    life7_24 = 0x1.0p0f;
    life8_30 = __sourceIntrinsic_d85576047056_invokedynamic223_10(11140, (424125873103502283L ^ life2_3));
    lexical_cycle_29: while (true) {
    lexical_join_72: {
    lexical_join_71: {
    lexical_join_50: {
    lexical_join_49: {
    if (!((life8_30 < __sourceIntrinsic_d85576047056_invokedynamic223_11(22225, (501072806426478236L ^ life2_3))))) {
        break lexical_join_74;
    }
    life9_44 = ((moom.wB)(((moom.v8)(((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).K)).bF)).a__wB(((int)(life8_30))))).a__xW();
    spill223_1 = life9_44;
    if (!((life4_10 != null))) {
        lexicalValue223_50_0 = spill223_1;
        break lexical_join_50;
    }
    if (!((spill223_1 == null))) {
        break lexical_join_49;
    }
    if (!((life4_10 == null))) {
        break lexical_join_71;
    }
    }
    lexicalValue223_50_0 = life9_44;
    }
    life10_65 = ((net.minecraft.item.Item)(((net.minecraft.item.ItemStack)(lexicalValue223_50_0)).a__wQ())).a(((net.minecraft.item.ItemStack)(life9_44)), ((net.minecraft.block.Block)(life6_16)));
    if (!((life4_10 != null))) {
        break lexical_join_72;
    }
    if (!((recovery.source.CarrierOps.fcmpl(((float)(life10_65)), ((float)(life7_24))) > 0))) {
        break lexical_join_71;
    }
    life5_9 = (life8_30 - __sourceIntrinsic_d85576047056_invokedynamic223_20(26373, (3827111306615338827L ^ life2_3)));
    life7_24 = life10_65;
    }
    life8_30 += 1;
    }
    if (!((life4_10 == null))) { continue lexical_cycle_29; }
    break lexical_cycle_29;
    }
    }
    return life5_9;
}


public void a(com.moon.dN p0) {
long local2 = (com.moon.module.impl.AutoTool.x ^ 35183693933467L);
    if ((__sourceIntrinsic_booleanComparison(((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue()) != 0)) {
        if ((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).F)).a__bE() != net.minecraft.world.WorldSettings$GameType.CREATIVE)) {
        if ((this.w != com.moon.module.impl.AutoTool.v)) {
        ((com.moon.dN)(p0)).setCancelled(((boolean)(true)));
    }
    }
    }
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(com.moon.et p0) {
int forwardValue787_16_0;
    boolean spill787_0;
    long life2_3;
    java.lang.String life4_5;
    forward_join_28: {
    forward_join_16: {
    life2_3 = (com.moon.module.impl.AutoTool.x ^ 113199576734108L);
    life4_5 = com.moon.bF.b();
    spill787_0 = ((java.lang.Boolean)(((java.lang.Boolean)(((com.moon.setting.BooleanSetting)(this.s)).getValue())))).booleanValue();
    if (!((life4_5 != null))) {
        forwardValue787_16_0 = ((spill787_0) ? 1 : 0);
        break forward_join_16;
    }
    if (!(spill787_0)) {
        break forward_join_28;
    }
    forwardValue787_16_0 = this.w;
    }
    if (!((forwardValue787_16_0 != com.moon.module.impl.AutoTool.v))) {
        break forward_join_28;
    }
    if (!((((moom.jI)(((net.minecraft.client.Minecraft)(com.moon.module.impl.AutoTool.d)).F)).a__bE() != net.minecraft.world.WorldSettings$GameType.CREATIVE))) {
        break forward_join_28;
    }
    ((com.moon.et)(p0)).a(((int)(this.w)));
    }
    return;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e89c46ebe29ecb35_originalDynamicSite1220_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_e89c46ebe29ecb35_originalDynamicSite1220_4(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2357_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral2359_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_invokedynamic223_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_invokedynamic223_11(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_d85576047056_invokedynamic223_20(int a0, long a1) throws E;

private static native int __sourceIntrinsic_booleanComparison(boolean value);
}
