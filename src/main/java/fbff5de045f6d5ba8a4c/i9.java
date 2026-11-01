package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class i9 implements com.moon.iX {

private final moom.CA a;

private final int b;

private static net.minecraft.entity.Entity[] c;

private static final long d;

private static final long[] e;

private static final java.lang.Integer[] f;

private static final java.util.Map g;

private i9(moom.CA p0, int p1) {
super();
    this.a = p0;
    this.b = p1;
}


static {
d = ((long)(((moom._a)(moom._c.a(((long)(4894909004614209213L)), ((long)(353773087054425133L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(165826670342861L)))));
    net.minecraft.entity.Entity[] __sourceSpill157_6 = new net.minecraft.entity.Entity[2];
    g = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.i9.b(((net.minecraft.entity.Entity[])(__sourceSpill157_6)));
    long local0_life9 = (com.moon.i9.d ^ 31133674388102L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill157_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill157_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill157_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill157_16 = new byte[8];
    (__sourceSpill157_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill157_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation157_18 = __sourceSpill157_16;
    ((javax.crypto.Cipher)(__sourceSpill157_13)).init(((int)(__sourceSpill157_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill157_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation157_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[2];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "$yÁ×%íM¡þ2\020©S"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill157_27 = local6_life23;
        int __sourceSpill157_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill157_27)).substring(((int)(__sourceSpill157_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill157_32 = local8_life21;
        int __sourceSpill157_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill157_35 = new byte[8];
        (__sourceSpill157_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill157_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill157_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill157_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill157_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill157_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill157_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill157_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill157_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill157_36)).doFinal(((byte[])(__sourceSpill157_35)));
        (__sourceSpill157_32)[__sourceSpill157_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    e = ((long[])(local8_life21));
    f = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public static net.minecraft.entity.Entity[] b__Arrayr3() {
return com.moon.i9.c;
}


public int b() {
return this.b;
}


public static void b(net.minecraft.entity.Entity[] p0) {
com.moon.i9.c = ((net.minecraft.entity.Entity[])(p0));
    return;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.i9.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 7312;
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
            throw new RuntimeException("com/moon/i9", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1570_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/i9"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public int a__Int() {
long local1 = (com.moon.i9.d ^ 68906756927234L);
    return __sourceIntrinsic_0bbed5b41c99_originalDynamicSite409_1(25721, (6122768022153249813L ^ local1));
}


public moom.CA a__CA() {
return this.a;
}


public static com.moon.i9 a(moom.CA p0, int p1) {
return new com.moon.i9(p0, p1);
}


public int a(com.moon.iv p0, float p1, float p2) {
long life4_3;
    double life7_7;
    double life9_11;
    double life11_15;
    double life13_19;
    double life15_23;
    double life17_27;
    net.minecraft.entity.Entity[] life6_281;
    life4_3 = (com.moon.i9.d ^ 3106641372166L);
    life7_7 = ((moom.CA)(this.a)).b;
    life9_11 = ((moom.CA)(this.a)).e;
    life11_15 = ((moom.CA)(this.a)).c;
    life13_19 = ((moom.CA)(this.a)).f;
    life15_23 = ((moom.CA)(this.a)).d;
    life17_27 = ((moom.CA)(this.a)).g;
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    net.minecraft.entity.Entity[] spill1348_0 = com.moon.i9.b__Arrayr3();
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    life6_281 = spill1348_0;
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life7_7)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life15_23))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life13_19)), ((double)(life17_27))))).a(((int)(this.b)));
    ((com.moon.iv)(((com.moon.iv)(p0)).a(((double)(life9_11)), ((double)(life11_15)), ((double)(life17_27))))).a(((int)(this.b)));
    int spill1348_1 = __sourceIntrinsic_67647d706fde_invokedynamic1348_158(538, (7982104717573106035L ^ life4_3));
    if ((life6_281 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[2])));
    }
    return spill1348_1;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1570_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0bbed5b41c99_originalDynamicSite409_1(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_67647d706fde_invokedynamic1348_158(int a0, long a1) throws E;
}
