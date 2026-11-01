package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class i4 implements com.moon.iX {

private final float a;

private final float b;

private final float c;

private final float d;

private final int e;

private final int f;

private static net.minecraft.entity.Entity[] g;

private static final long h;

private static final long[] i;

private static final java.lang.Integer[] j;

private static final java.util.Map k;

private i4(float p0, float p1, float p2, float p3, int p4, int p5) {
super();
    this.a = p0;
    this.b = p1;
    this.c = p2;
    this.d = p3;
    this.e = p4;
    this.f = p5;
}


static {
h = ((long)(((moom._a)(moom._c.a(((long)(-7710626331923831755L)), ((long)(-6556139112865891755L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(1686791971131L)))));
    k = ((java.util.Map)(new java.util.HashMap(13)));
    net.minecraft.entity.Entity[] __sourceSpill152_7 = new net.minecraft.entity.Entity[1];
    long local0_life8 = (com.moon.i4.h ^ 54159097351718L);
    com.moon.i4.b(((net.minecraft.entity.Entity[])(__sourceSpill152_7)));
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill152_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill152_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill152_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill152_16 = new byte[8];
    (__sourceSpill152_16)[0] = ((byte) ((int) (local0_life8 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill152_16)[local3_life17] = ((byte) ((int) ((local0_life8 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation152_18 = __sourceSpill152_16;
    ((javax.crypto.Cipher)(__sourceSpill152_13)).init(((int)(__sourceSpill152_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill152_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation152_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "aÑ9°\005\013i°ÓQ«4Ú"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill152_27 = local6_life23;
        int __sourceSpill152_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill152_27)).substring(((int)(__sourceSpill152_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill152_32 = local8_life21;
        int __sourceSpill152_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill152_35 = new byte[8];
        (__sourceSpill152_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill152_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill152_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill152_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill152_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill152_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill152_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill152_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill152_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill152_36)).doFinal(((byte[])(__sourceSpill152_35)));
        (__sourceSpill152_32)[__sourceSpill152_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    i = ((long[])(local8_life21));
    j = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.i4.g = ((net.minecraft.entity.Entity[])(p0));
    return;
}


public static net.minecraft.entity.Entity[] b() {
return com.moon.i4.g;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 10998;
      if (j[var3] == null) {
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
         long var5 = i[var3];
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
         Object[] var9 = (Object[])k.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               k.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/i4", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         j[var3] = var15;
      }

      return j[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1563_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/i4"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.i4.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public int a(com.moon.iv p0, float p1, float p2) {
long life4_3;
    float life7_8;
    float life8_13;
    float life9_18;
    float life10_23;
    net.minecraft.entity.Entity[] life6_441;
    life4_3 = (com.moon.i4.h ^ 137810909922357L);
    life7_8 = (this.a / p1);
    life8_13 = (this.c / p1);
    life9_18 = (this.b / p2);
    life10_23 = (this.d / p2);
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life9_18))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life7_8)), ((float)(life10_23))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.8p0f / p1)))), ((float)(life10_23))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.8p0f / p1)))), ((float)(life9_18))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.8p0f / p1)))), ((float)(life9_18))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.8p0f / p1)))), ((float)(life10_23))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_13)), ((float)(life10_23))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)(life8_13)), ((float)(life9_18))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.8p0f / p1)))), ((float)(life9_18))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.8p0f / p1)))), ((float)((life9_18 + (0x1.8p0f / p2))))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.8p0f / p1)))), ((float)((life9_18 + (0x1.8p0f / p2))))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.8p0f / p1)))), ((float)(life9_18))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.8p0f / p1)))), ((float)((life10_23 - (0x1.8p0f / p2))))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.8p0f / p1)))), ((float)(life10_23))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.8p0f / p1)))), ((float)(life10_23))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.8p0f / p1)))), ((float)((life10_23 - (0x1.8p0f / p2))))))).a(((int)(this.e)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p-1f / p1)))), ((float)((life9_18 + (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p-1f / p1)))), ((float)((life10_23 - (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p0f / p1)))), ((float)((life10_23 - (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p0f / p1)))), ((float)((life9_18 + (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p0f / p1)))), ((float)((life9_18 + (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p0f / p1)))), ((float)((life10_23 - (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p-1f / p1)))), ((float)((life10_23 - (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p-1f / p1)))), ((float)((life9_18 + (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p-1f / p1)))), ((float)((life9_18 + (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p-1f / p1)))), ((float)((life9_18 + (0x1.0p0f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p-1f / p1)))), ((float)((life9_18 + (0x1.0p0f / p2))))))).a(((int)(this.f)));
    net.minecraft.entity.Entity[] spill1343_0 = com.moon.i4.b();
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p-1f / p1)))), ((float)((life9_18 + (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p-1f / p1)))), ((float)((life10_23 - (0x1.0p0f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life7_8 + (0x1.0p-1f / p1)))), ((float)((life10_23 - (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    life6_441 = spill1343_0;
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p-1f / p1)))), ((float)((life10_23 - (0x1.0p-1f / p2))))))).a(((int)(this.f)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((float)((life8_13 - (0x1.0p-1f / p1)))), ((float)((life10_23 - (0x1.0p0f / p2))))))).a(((int)(this.f)));
    int spill1343_1 = __sourceIntrinsic_67647d706fde_invokedynamic1343_102(106, (6907443910436887909L ^ life4_3));
    if ((life6_441 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return spill1343_1;
}


public static com.moon.i4 a(float p0, float p1, float p2, float p3, int p4, int p5) {
long life6_3;
    net.minecraft.entity.Entity[] life8_5;
    life6_3 = (com.moon.i4.h ^ 38168743930601L);
    life8_5 = com.moon.i4.b();
    com.moon.i4 spill30_0 = new com.moon.i4(p0, p1, p2, p3, p4, p5);
    if ((net.minecraft.entity.Entity.b__ArrayString() != null)) {
        com.moon.i4.b(((net.minecraft.entity.Entity[])(new net.minecraft.entity.Entity[1])));
    }
    return spill30_0;
}


public int a__Int() {
long local1 = (com.moon.i4.h ^ 71667213700913L);
    return __sourceIntrinsic_0bbed5b41c99_originalDynamicSite408_1(24898, (5494752612242290504L ^ local1));
}


private static native <E extends Throwable> int __sourceIntrinsic_67647d706fde_invokedynamic1343_102(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1563_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bbed5b41c99_originalDynamicSite408_1(int a0, long a1) throws E;
}
