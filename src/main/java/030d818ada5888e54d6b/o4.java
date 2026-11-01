package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import io.netty.channel.EventLoop;
import io.netty.channel.local.LocalEventLoopGroup;

import java.util.Map;
public class o4 {

private static com.moon.o4 a;

private int b;

private java.util.logging.Logger c;

private java.util.concurrent.CompletableFuture<java.lang.Void> d;

private java.util.concurrent.ExecutorService e;

private EventLoop f;

private java.io.File g;

private int h;

private static int[] i;

private static long j;

private static java.lang.String[] k;

private static java.lang.String[] l;

private static java.util.Map m;

private static long[] n;

private static java.lang.Integer[] o;

private static java.util.Map p;

public o4() { super(); }


private static void __sourceConstructorBody_9e0d52986fc19252(com.moon.o4 receiver) throws Throwable {

long local1 = (com.moon.o4.j ^ 24473162953849L);

    com.moon.o4.__sourceConstructorInit_9e0d52986fc19252_0(((com.moon.o4)(receiver)));

    ((com.moon.o4)(receiver)).b = ((int)(__sourceIntrinsic_9e0d52986fc19252_originalDynamicSite1391_2(1751, (2062134367600228326L ^ local1))));

    ((com.moon.o4)(receiver)).c = ((java.util.logging.Logger)(new com.moon.pD(org.apache.logging.log4j.LogManager.getLogger(((java.lang.String)(__sourceIntrinsic_9e0d52986fc19252_originalDynamicSite1391_4(9099, (7847809633096512962L ^ local1))))))));

    ((com.moon.o4)(receiver)).d = ((java.util.concurrent.CompletableFuture)(new java.util.concurrent.CompletableFuture()));

    return;

}



static {
j = ((long)(((moom._a)(moom._c.a(((long)(-766948684524852736L)), ((long)(53505515833593925L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(40025293293966L)))));
    m = ((java.util.Map)(new java.util.HashMap(13)));
    java.lang.Object __sourceSpill321_7 = null;
    long local11_life8 = (com.moon.o4.j ^ 129713235026477L);
    com.moon.o4.b(((int[])(__sourceSpill321_7)));
    javax.crypto.Cipher local13_life11;
    javax.crypto.Cipher __sourceSpill321_13 = (local13_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill321_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill321_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill321_16 = new byte[8];
    (__sourceSpill321_16)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local14_life17 = 1;
    while ((local14_life17 < 8)) {
        (__sourceSpill321_16)[local14_life17] = ((byte) ((int) ((local11_life8 << (local14_life17 * 8)) >>> 56)));
        local14_life17 += 1;
    }
    byte[] __sourcePreallocation321_18 = __sourceSpill321_16;
    ((javax.crypto.Cipher)(__sourceSpill321_13)).init(((int)(__sourceSpill321_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill321_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation321_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local20_life21 = new java.lang.String[3];
    int local18_life22 = 0;
    java.lang.String local17_life23;
    int local19_life25 = ((java.lang.String)((local17_life23 = "T\021ãhó?6ÚßTç\t\bí\026hx~PöóºF4P2JñÂø¢%´î\nr(\0017\023\031;¶ùá¾qc¼ë\"ª\001\007sG7®*7þZ8Ù¿¸¾ë\032ñW Ý\036¹tÖQæ²â2½ðÃ\034}è®Bp!cWß\177"))).length();
    int local16_life26 = 40;
    int local15_life27 = -1;
    while (true) {
        local15_life27 += 1;
        byte[] __sourceSpill321_30 = ((java.lang.String)(((java.lang.String)(local17_life23)).substring(((int)(local15_life27)), ((int)((local15_life27 + local16_life26)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill321_31 = local13_life11;
        byte[] local21_life33 = ((javax.crypto.Cipher)(__sourceSpill321_31)).doFinal(((byte[])(__sourceSpill321_30)));
        java.lang.String __sourceSpill321_36 = ((java.lang.String)(com.moon.o4.a(((byte[])(local21_life33))))).intern();
        java.lang.String[] __sourceSpill321_37 = local20_life21;
        int __sourceSpill321_38 = local18_life22;
        local18_life22 += 1;
        (__sourceSpill321_37)[__sourceSpill321_38] = __sourceSpill321_36;
        if (!(((local15_life27 = (local15_life27 + local16_life26)) < local19_life25))) { break; }
        local16_life26 = ((java.lang.String)(local17_life23)).charAt(((int)(local15_life27)));
    }
    k = ((java.lang.String[])(local20_life21));
    l = ((java.lang.String[])(new java.lang.String[3]));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life44;
    javax.crypto.Cipher __sourceSpill321_46 = (local0_life44 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill321_47 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill321_48 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill321_49 = new byte[8];
    (__sourceSpill321_49)[0] = ((byte) ((int) (local11_life8 >>> 56)));
    int local1_life50 = 1;
    while ((local1_life50 < 8)) {
        (__sourceSpill321_49)[local1_life50] = ((byte) ((int) ((local11_life8 << (local1_life50 * 8)) >>> 56)));
        local1_life50 += 1;
    }
    byte[] __sourcePreallocation321_51 = __sourceSpill321_49;
    ((javax.crypto.Cipher)(__sourceSpill321_46)).init(((int)(__sourceSpill321_47)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill321_48)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation321_51)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life54 = new long[2];
    int local3_life55 = 0;
    java.lang.String local4_life56;
    int local5_life58 = ((java.lang.String)((local4_life56 = "×\"Ö\"á\r3o\"¯ìtÑR"))).length();
    int local2_life59 = 0;
    do {
        java.lang.String __sourceSpill321_60 = local4_life56;
        int __sourceSpill321_61 = local2_life59;
        local2_life59 += 8;
        byte[] local7_life64 = ((java.lang.String)(((java.lang.String)(__sourceSpill321_60)).substring(((int)(__sourceSpill321_61)), ((int)(local2_life59))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill321_65 = local6_life54;
        int __sourceSpill321_66 = local3_life55;
        local3_life55 += 1;
        long local8_life67 = (((((((((((long) (local7_life64)[0]) & 255L) << 56) | ((((long) (local7_life64)[1]) & 255L) << 48)) | ((((long) (local7_life64)[2]) & 255L) << 40)) | ((((long) (local7_life64)[3]) & 255L) << 32)) | ((((long) (local7_life64)[4]) & 255L) << 24)) | ((((long) (local7_life64)[5]) & 255L) << 16)) | ((((long) (local7_life64)[6]) & 255L) << 8)) | (((long) (local7_life64)[7]) & 255L));
        byte[] __sourceSpill321_68 = new byte[8];
        (__sourceSpill321_68)[0] = ((byte) ((int) (local8_life67 >>> 56)));
        (__sourceSpill321_68)[1] = ((byte) ((int) (local8_life67 >>> 48)));
        (__sourceSpill321_68)[2] = ((byte) ((int) (local8_life67 >>> 40)));
        (__sourceSpill321_68)[3] = ((byte) ((int) (local8_life67 >>> 32)));
        (__sourceSpill321_68)[4] = ((byte) ((int) (local8_life67 >>> 24)));
        (__sourceSpill321_68)[5] = ((byte) ((int) (local8_life67 >>> 16)));
        (__sourceSpill321_68)[6] = ((byte) ((int) (local8_life67 >>> 8)));
        (__sourceSpill321_68)[7] = ((byte) ((int) local8_life67));
        javax.crypto.Cipher __sourceSpill321_69 = local0_life44;
        byte[] local10_life71 = ((javax.crypto.Cipher)(__sourceSpill321_69)).doFinal(((byte[])(__sourceSpill321_68)));
        (__sourceSpill321_65)[__sourceSpill321_66] = (((((((((((long) (local10_life71)[0]) & 255L) << 56) | ((((long) (local10_life71)[1]) & 255L) << 48)) | ((((long) (local10_life71)[2]) & 255L) << 40)) | ((((long) (local10_life71)[3]) & 255L) << 32)) | ((((long) (local10_life71)[4]) & 255L) << 24)) | ((((long) (local10_life71)[5]) & 255L) << 16)) | ((((long) (local10_life71)[6]) & 255L) << 8)) | (((long) (local10_life71)[7]) & 255L));
    } while ((!(local2_life59 >= local5_life58)));
    n = ((long[])(local6_life54));
    o = ((java.lang.Integer[])(new java.lang.Integer[2]));
    a = ((com.moon.o4)(new com.moon.o4()));
}

private static native <E extends Throwable> void __sourceConstructorInit_9e0d52986fc19252_0(com.moon.o4 a0) throws E;

public int b() {
return this.h;
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3045_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/o4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void b(java.io.File p0) {
this.g = ((java.io.File)(p0));
    return;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.o4.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 494;
      if (o[var3] == null) {
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
         long var5 = n[var3];
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
         Object[] var9 = (Object[])p.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               p.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/o4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


public static int[] b__ArrayInt() {
return com.moon.o4.i;
}


public static void b(int[] p0) {
i = ((int[])(p0));
    return;
}


private static java.lang.Object a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    java.lang.String local7 = com.moon.o4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.String.class)), ((java.lang.Object)(local7)));
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
    life5_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 9877);
    if (((com.moon.o4.l)[life5_8] == null)) {
        try {
        life3_16 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life4_21 = ((java.lang.Object[])(((java.util.Map)(com.moon.o4.m)).get(((java.lang.Object)(life3_16)))));
        if ((life4_21 == null)) {
        life4_21 = new java.lang.Object[3];
        (life4_21)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding")));
        (life4_21)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life4_21)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.o4.m)).put(((java.lang.Object)(life3_16)), ((java.lang.Object)(life4_21)));
    }
    } catch (java.lang.Exception life9_51) {
        throw new java.lang.RuntimeException("com/moon/o4", life9_51);
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
        life9_116 = ((java.lang.String)((com.moon.o4.k)[life5_8])).getBytes(((java.lang.String)("ISO-8859-1")));
        (com.moon.o4.l)[life5_8] = com.moon.o4.a(((byte[])(((javax.crypto.Cipher)(((javax.crypto.Cipher)((life4_21)[0])))).doFinal(((byte[])(life9_116))))));
    }
    return (com.moon.o4.l)[life5_8];
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
        byte[] spill1137_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1137_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1137_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1137_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1137_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1137_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


public void a(int p0) {
this.h = ((int)(p0));
    return;
}


public void a(java.io.File p0) {
int forestValue100037_108_0;
    int[] spill100037_0;
    EventLoop spill100037_1;
    java.util.concurrent.CompletableFuture spill100037_2;
    boolean spill100037_3;
    long life2_3;
    java.util.concurrent.ThreadFactory life5_17;
    int[] life4_60;
    forest_join_114: {
    forest_join_108: {
    forest_join_71: {
    life2_3 = (com.moon.o4.j ^ 91443092303042L);
    spill100037_0 = com.moon.o4.b__ArrayInt();
    life5_17 = ((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(((com.google.common.util.concurrent.ThreadFactoryBuilder)(new com.google.common.util.concurrent.ThreadFactoryBuilder())).setDaemon(((boolean)(true))))).setNameFormat(((java.lang.String)(__sourceIntrinsic_a2a27ba450de_invokedynamic100037_3(26068, (2508395650989386533L ^ life2_3))))))).build();
    this.e = ((java.util.concurrent.ExecutorService)(java.util.concurrent.Executors.newFixedThreadPool(((int)(((java.lang.Runtime)(java.lang.Runtime.getRuntime())).availableProcessors())), ((java.util.concurrent.ThreadFactory)(life5_17)))));
    this.f = ((EventLoop)(((LocalEventLoopGroup)(new LocalEventLoopGroup(1, life5_17))).next()));
    spill100037_1 = this.f;
    java.util.concurrent.CompletableFuture __stackOp100037_14_0 = this.d;
    spill100037_2 = __stackOp100037_14_0;
    java.util.Objects.requireNonNull(((java.lang.Object)(__stackOp100037_14_0)));
    ((EventLoop)(spill100037_1)).submit(((java.util.concurrent.Callable)(__sourceIntrinsic_a2a27ba450de_invokedynamic100037_16(spill100037_2))));
    ((com.moon.o4)(this)).a(((int)(__sourceIntrinsic_a2a27ba450de_invokedynamic100037_18(1751, (2062201268776480605L ^ life2_3)))));
    this.g = ((java.io.File)(new java.io.File(p0, __sourceIntrinsic_a2a27ba450de_invokedynamic100037_20(7936, (3483365249332613616L ^ life2_3)))));
    life4_60 = spill100037_0;
    spill100037_3 = ((java.io.File)(this.g)).exists();
    if (!((life4_60 == null))) {
        forestValue100037_108_0 = ((spill100037_3) ? 1 : 0);
        break forest_join_108;
    }
    if (!((!spill100037_3))) {
        break forest_join_71;
    }
    ((java.io.File)(this.g)).mkdirs();
    }
    com.viaversion.viaversion.api.Via.init(((com.viaversion.viaversion.api.ViaManager)(((com.viaversion.viaversion.ViaManagerImpl.ViaManagerBuilder)(((com.viaversion.viaversion.ViaManagerImpl.ViaManagerBuilder)(((com.viaversion.viaversion.ViaManagerImpl.ViaManagerBuilder)(((com.viaversion.viaversion.ViaManagerImpl.ViaManagerBuilder)(com.viaversion.viaversion.ViaManagerImpl.builder())).injector(((com.viaversion.viaversion.api.platform.ViaInjector)(new com.moon.o8()))))).loader(((com.viaversion.viaversion.api.platform.ViaPlatformLoader)(new com.moon.o_()))))).platform(((com.viaversion.viaversion.api.platform.ViaPlatform)(new com.moon.o9(this.g)))))).build())));
    com.viaversion.viaversion.api.data.MappingDataLoader.enableMappingsCache();
    ((com.viaversion.viaversion.ViaManagerImpl)(((com.viaversion.viaversion.ViaManagerImpl)(com.viaversion.viaversion.api.Via.getManager())))).init();
    new com.moon.o7(this.g);
    new com.moon.pa(this.g);
    forestValue100037_108_0 = ((((java.util.concurrent.CompletableFuture)(this.d)).complete(((java.lang.Object)(null)))) ? 1 : 0);
    }
    recovery.source.CarrierOps.discard(forestValue100037_108_0);
    if (!((life4_60 != null))) {
        break forest_join_114;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[3])));
    }
    return;
}


public int a() {
long local1 = (com.moon.o4.j ^ 132715607462445L);
    java.util.Objects.requireNonNull(((java.lang.Object)(this)));
    return __sourceIntrinsic_8aebf151eadb_originalDynamicSite588_2(18323, (6045968092984791287L ^ local1));
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3049_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/o4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public EventLoop a__EventLoop() {
return this.f;
}


public java.io.File a__File() {
return this.g;
}


public void a(EventLoop p0) {
this.f = ((EventLoop)(p0));
    return;
}


public void a(java.util.concurrent.ExecutorService p0) {
this.e = ((java.util.concurrent.ExecutorService)(p0));
    return;
}


public java.util.logging.Logger a__Logger() {
return this.c;
}


public java.util.concurrent.CompletableFuture<java.lang.Void> a__CompletableFuture() {
return this.d;
}


public java.util.concurrent.ExecutorService a__ExecutorService() {
return this.e;
}


public static com.moon.o4 a__o4() {
return com.moon.o4.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_9e0d52986fc19252_originalDynamicSite1391_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_9e0d52986fc19252_originalDynamicSite1391_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_8aebf151eadb_originalDynamicSite588_2(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a2a27ba450de_invokedynamic100037_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.concurrent.Callable __sourceIntrinsic_a2a27ba450de_invokedynamic100037_16(java.util.concurrent.CompletableFuture a0) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_a2a27ba450de_invokedynamic100037_18(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a2a27ba450de_invokedynamic100037_20(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3049_0() throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_641ba07ca8f5_methodHandleLiteral3045_0() throws E;
}
