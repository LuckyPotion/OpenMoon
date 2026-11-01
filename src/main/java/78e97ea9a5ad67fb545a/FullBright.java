package com.moon.module.impl;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class FullBright extends com.moon.module.Module {

private static final long s;

private static final long[] t;

private static final java.lang.Integer[] u;

private static final java.util.Map v;

public FullBright(java.lang.String p0, java.lang.String p1, java.lang.String p2, com.moon.module.ModuleCategory p3) {
super(p0, p1, p2, p3);
}


static {
s = ((long)(((moom._a)(moom._c.a(((long)(-1377499699366753323L)), ((long)(4564402091205997969L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(278178902773810L)))));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    long local0_life7 = (com.moon.module.impl.FullBright.s ^ 16706388314762L);
    javax.crypto.Cipher local2_life9;
    javax.crypto.Cipher __sourceSpill274_11 = (local2_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill274_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill274_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill274_14 = new byte[8];
    (__sourceSpill274_14)[0] = ((byte) ((int) (local0_life7 >>> 56)));
    int local3_life15 = 1;
    while ((local3_life15 < 8)) {
        (__sourceSpill274_14)[local3_life15] = ((byte) ((int) ((local0_life7 << (local3_life15 * 8)) >>> 56)));
        local3_life15 += 1;
    }
    byte[] __sourcePreallocation274_16 = __sourceSpill274_14;
    ((javax.crypto.Cipher)(__sourceSpill274_11)).init(((int)(__sourceSpill274_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill274_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation274_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life19 = new long[2];
    int local5_life20 = 0;
    java.lang.String local6_life21;
    int local7_life23 = ((java.lang.String)((local6_life21 = "\000'3<ZG\025mó©\023\005\036"))).length();
    int local4_life24 = 0;
    do {
        java.lang.String __sourceSpill274_25 = local6_life21;
        int __sourceSpill274_26 = local4_life24;
        local4_life24 += 8;
        byte[] local9_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill274_25)).substring(((int)(__sourceSpill274_26)), ((int)(local4_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill274_30 = local8_life19;
        int __sourceSpill274_31 = local5_life20;
        local5_life20 += 1;
        long local10_life32 = (((((((((((long) (local9_life29)[0]) & 255L) << 56) | ((((long) (local9_life29)[1]) & 255L) << 48)) | ((((long) (local9_life29)[2]) & 255L) << 40)) | ((((long) (local9_life29)[3]) & 255L) << 32)) | ((((long) (local9_life29)[4]) & 255L) << 24)) | ((((long) (local9_life29)[5]) & 255L) << 16)) | ((((long) (local9_life29)[6]) & 255L) << 8)) | (((long) (local9_life29)[7]) & 255L));
        byte[] __sourceSpill274_33 = new byte[8];
        (__sourceSpill274_33)[0] = ((byte) ((int) (local10_life32 >>> 56)));
        (__sourceSpill274_33)[1] = ((byte) ((int) (local10_life32 >>> 48)));
        (__sourceSpill274_33)[2] = ((byte) ((int) (local10_life32 >>> 40)));
        (__sourceSpill274_33)[3] = ((byte) ((int) (local10_life32 >>> 32)));
        (__sourceSpill274_33)[4] = ((byte) ((int) (local10_life32 >>> 24)));
        (__sourceSpill274_33)[5] = ((byte) ((int) (local10_life32 >>> 16)));
        (__sourceSpill274_33)[6] = ((byte) ((int) (local10_life32 >>> 8)));
        (__sourceSpill274_33)[7] = ((byte) ((int) local10_life32));
        javax.crypto.Cipher __sourceSpill274_34 = local2_life9;
        byte[] local12_life36 = ((javax.crypto.Cipher)(__sourceSpill274_34)).doFinal(((byte[])(__sourceSpill274_33)));
        (__sourceSpill274_30)[__sourceSpill274_31] = (((((((((((long) (local12_life36)[0]) & 255L) << 56) | ((((long) (local12_life36)[1]) & 255L) << 48)) | ((((long) (local12_life36)[2]) & 255L) << 40)) | ((((long) (local12_life36)[3]) & 255L) << 32)) | ((((long) (local12_life36)[4]) & 255L) << 24)) | ((((long) (local12_life36)[5]) & 255L) << 16)) | ((((long) (local12_life36)[6]) & 255L) << 8)) | (((long) (local12_life36)[7]) & 255L));
    } while ((!(local4_life24 >= local7_life23)));
    t = ((long[])(local8_life19));
    u = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


private static java.lang.invoke.CallSite c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_e887d890fab5_methodHandleLiteral2480_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/lW"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int c(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 743;
      if (u[var3] == null) {
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
         long var5 = t[var3];
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
         Object[] var9 = (Object[])v.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               v.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/lW", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         u[var3] = var15;
      }

      return u[var3];
}


private static int c(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.module.impl.FullBright.c(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public void onDisable() {
net.minecraft.client.entity.EntityPlayerSP forwardValue835_13_0;
    net.minecraft.client.entity.EntityPlayerSP forwardValue835_21_0;
    net.minecraft.potion.Potion forwardValue835_21_1;
    net.minecraft.client.entity.EntityPlayerSP spill835_0;
    net.minecraft.potion.Potion spill835_1;
    long life1_3;
    net.minecraft.entity.Entity[] life3_5;
    forward_join_23: {
    forward_join_21: {
    forward_join_13: {
    life1_3 = (com.moon.module.impl.FullBright.s ^ 130401567257197L);
    life3_5 = com.moon.bY.b();
    spill835_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.FullBright.d)).K;
    if (!((life3_5 == null))) {
        forwardValue835_13_0 = spill835_0;
        break forward_join_13;
    }
    if (!((spill835_0 != null))) {
        break forward_join_23;
    }
    forwardValue835_13_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.FullBright.d)).K;
    }
    spill835_1 = net.minecraft.potion.Potion.s;
    if (!((life3_5 == null))) {
        forwardValue835_21_0 = forwardValue835_13_0;
        forwardValue835_21_1 = spill835_1;
        break forward_join_21;
    }
    if (!(((net.minecraft.client.entity.EntityPlayerSP)(forwardValue835_13_0)).a__Boolean(((net.minecraft.potion.Potion)(spill835_1))))) {
        break forward_join_23;
    }
    forwardValue835_21_0 = ((net.minecraft.client.Minecraft)(com.moon.module.impl.FullBright.d)).K;
    forwardValue835_21_1 = net.minecraft.potion.Potion.s;
    }
    ((net.minecraft.client.entity.EntityPlayerSP)(forwardValue835_21_0)).h(((int)(((net.minecraft.potion.Potion)(forwardValue835_21_1)).I)));
    }
    return;
}


public void a(com.moon.event.MoveEvent p0) {
long local2 = (com.moon.module.impl.FullBright.s ^ 139456354719335L);
    net.minecraft.potion.PotionEffect local4 = new net.minecraft.potion.PotionEffect(((net.minecraft.potion.Potion)(net.minecraft.potion.Potion.s)).I, __sourceIntrinsic_9f71572286bb_originalDynamicSite519_3(21838, (3150542025285862837L ^ local2)), __sourceIntrinsic_9f71572286bb_originalDynamicSite519_4(7207, (7911181676509940957L ^ local2)));
    ((net.minecraft.client.entity.EntityPlayerSP)(((net.minecraft.client.Minecraft)(com.moon.module.impl.FullBright.d)).K)).a(((net.minecraft.potion.PotionEffect)(local4)));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_e887d890fab5_methodHandleLiteral2480_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_originalDynamicSite519_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_9f71572286bb_originalDynamicSite519_4(int a0, long a1) throws E;
}
