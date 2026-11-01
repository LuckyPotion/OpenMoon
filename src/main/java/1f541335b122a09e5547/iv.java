package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class iv {

public long a;

public int b;

public int c;

private static int[] d;

private static final long e;

private static final long[] f;

private static final java.lang.Integer[] g;

private static final java.util.Map h;

public iv(int p0) {
super();
    this.a = ((long)(org.lwjgl.system.MemoryUtil.nmemAlloc(((long)(((long) p0))))));
    this.c = ((int)(p0));
    return;
}


static {
e = ((long)(((moom._a)(moom._c.a(((long)(-2037543245504227216L)), ((long)(-2446622985899192336L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(122185034660974L)))));
    int[] __sourceSpill289_6 = new int[2];
    h = ((java.util.Map)(new java.util.HashMap(13)));
    com.moon.iv.b(((int[])(__sourceSpill289_6)));
    long local0_life9 = (com.moon.iv.e ^ 7990768620398L);
    javax.crypto.Cipher local2_life11;
    javax.crypto.Cipher __sourceSpill289_13 = (local2_life11 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill289_14 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill289_15 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill289_16 = new byte[8];
    (__sourceSpill289_16)[0] = ((byte) ((int) (local0_life9 >>> 56)));
    int local3_life17 = 1;
    while ((local3_life17 < 8)) {
        (__sourceSpill289_16)[local3_life17] = ((byte) ((int) ((local0_life9 << (local3_life17 * 8)) >>> 56)));
        local3_life17 += 1;
    }
    byte[] __sourcePreallocation289_18 = __sourceSpill289_16;
    ((javax.crypto.Cipher)(__sourceSpill289_13)).init(((int)(__sourceSpill289_14)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill289_15)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation289_18)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local8_life21 = new long[5];
    int local5_life22 = 0;
    java.lang.String local6_life23;
    int local7_life25 = ((java.lang.String)((local6_life23 = "\021g.eR}åÒ^\034ûÀÐ\025±\007\005;¹å,"))).length();
    int local4_life26 = 0;
    do {
        java.lang.String __sourceSpill289_27 = local6_life23;
        int __sourceSpill289_28 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life31 = ((java.lang.String)(((java.lang.String)(__sourceSpill289_27)).substring(((int)(__sourceSpill289_28)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill289_32 = local8_life21;
        int __sourceSpill289_33 = local5_life22;
        local5_life22 += 1;
        long local10_life34 = (((((((((((long) (local9_life31)[0]) & 255L) << 56) | ((((long) (local9_life31)[1]) & 255L) << 48)) | ((((long) (local9_life31)[2]) & 255L) << 40)) | ((((long) (local9_life31)[3]) & 255L) << 32)) | ((((long) (local9_life31)[4]) & 255L) << 24)) | ((((long) (local9_life31)[5]) & 255L) << 16)) | ((((long) (local9_life31)[6]) & 255L) << 8)) | (((long) (local9_life31)[7]) & 255L));
        byte[] __sourceSpill289_35 = new byte[8];
        (__sourceSpill289_35)[0] = ((byte) ((int) (local10_life34 >>> 56)));
        (__sourceSpill289_35)[1] = ((byte) ((int) (local10_life34 >>> 48)));
        (__sourceSpill289_35)[2] = ((byte) ((int) (local10_life34 >>> 40)));
        (__sourceSpill289_35)[3] = ((byte) ((int) (local10_life34 >>> 32)));
        (__sourceSpill289_35)[4] = ((byte) ((int) (local10_life34 >>> 24)));
        (__sourceSpill289_35)[5] = ((byte) ((int) (local10_life34 >>> 16)));
        (__sourceSpill289_35)[6] = ((byte) ((int) (local10_life34 >>> 8)));
        (__sourceSpill289_35)[7] = ((byte) ((int) local10_life34));
        javax.crypto.Cipher __sourceSpill289_36 = local2_life11;
        byte[] local12_life38 = ((javax.crypto.Cipher)(__sourceSpill289_36)).doFinal(((byte[])(__sourceSpill289_35)));
        (__sourceSpill289_32)[__sourceSpill289_33] = (((((((((((long) (local12_life38)[0]) & 255L) << 56) | ((((long) (local12_life38)[1]) & 255L) << 48)) | ((((long) (local12_life38)[2]) & 255L) << 40)) | ((((long) (local12_life38)[3]) & 255L) << 32)) | ((((long) (local12_life38)[4]) & 255L) << 24)) | ((((long) (local12_life38)[5]) & 255L) << 16)) | ((((long) (local12_life38)[6]) & 255L) << 8)) | (((long) (local12_life38)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    local7_life25 = ((java.lang.String)((local6_life23 = "CäCE*`¯*vã<Æß"))).length();
    local4_life26 = 0;
    do {
        java.lang.String __sourceSpill289_40 = local6_life23;
        int __sourceSpill289_41 = local4_life26;
        local4_life26 += 8;
        byte[] local9_life44 = ((java.lang.String)(((java.lang.String)(__sourceSpill289_40)).substring(((int)(__sourceSpill289_41)), ((int)(local4_life26))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill289_45 = local8_life21;
        int __sourceSpill289_46 = local5_life22;
        local5_life22 += 1;
        long local10_life47 = (((((((((((long) (local9_life44)[0]) & 255L) << 56) | ((((long) (local9_life44)[1]) & 255L) << 48)) | ((((long) (local9_life44)[2]) & 255L) << 40)) | ((((long) (local9_life44)[3]) & 255L) << 32)) | ((((long) (local9_life44)[4]) & 255L) << 24)) | ((((long) (local9_life44)[5]) & 255L) << 16)) | ((((long) (local9_life44)[6]) & 255L) << 8)) | (((long) (local9_life44)[7]) & 255L));
        byte[] __sourceSpill289_48 = new byte[8];
        (__sourceSpill289_48)[0] = ((byte) ((int) (local10_life47 >>> 56)));
        (__sourceSpill289_48)[1] = ((byte) ((int) (local10_life47 >>> 48)));
        (__sourceSpill289_48)[2] = ((byte) ((int) (local10_life47 >>> 40)));
        (__sourceSpill289_48)[3] = ((byte) ((int) (local10_life47 >>> 32)));
        (__sourceSpill289_48)[4] = ((byte) ((int) (local10_life47 >>> 24)));
        (__sourceSpill289_48)[5] = ((byte) ((int) (local10_life47 >>> 16)));
        (__sourceSpill289_48)[6] = ((byte) ((int) (local10_life47 >>> 8)));
        (__sourceSpill289_48)[7] = ((byte) ((int) local10_life47));
        javax.crypto.Cipher __sourceSpill289_49 = local2_life11;
        byte[] local12_life51 = ((javax.crypto.Cipher)(__sourceSpill289_49)).doFinal(((byte[])(__sourceSpill289_48)));
        (__sourceSpill289_45)[__sourceSpill289_46] = (((((((((((long) (local12_life51)[0]) & 255L) << 56) | ((((long) (local12_life51)[1]) & 255L) << 48)) | ((((long) (local12_life51)[2]) & 255L) << 40)) | ((((long) (local12_life51)[3]) & 255L) << 32)) | ((((long) (local12_life51)[4]) & 255L) << 24)) | ((((long) (local12_life51)[5]) & 255L) << 16)) | ((((long) (local12_life51)[6]) & 255L) << 8)) | (((long) (local12_life51)[7]) & 255L));
    } while ((!(local4_life26 >= local7_life25)));
    f = ((long[])(local8_life21));
    g = ((java.lang.Integer[])(new java.lang.Integer[5]));
}


public static void b(int[] p0) {
com.moon.iv.d = ((int[])(p0));
    return;
}


public com.moon.iv b(float p0, float p1) {
((com.moon.iv)(this.a(((float)(p0))))).a(((float)(p1)));
    return this;
}


public com.moon.iv b(float p0, float p1, float p2, float p3) {
((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(this.a(((float)(p0))))).a(((float)(p1))))).a(((float)(p2))))).a(((float)(p3)));
    return this;
}


private com.moon.iv b(float p0) {
org.lwjgl.system.MemoryUtil.memPutFloat(((long)((this.a + ((long) this.b)))), ((float)(p0)));
    this.b += 4;
    return this;
}


public com.moon.iv b(int p0) {
this.b = ((int)(p0));
    return this;
}


public int b() {
return this.c;
}


public void b__Void() {
org.lwjgl.system.MemoryUtil.nmemFree(((long)(this.a)));
    return;
}


public static int[] b__ArrayInt() {
return com.moon.iv.d;
}


public com.moon.iv c(int p0) {
this.c = ((int)(p0));
    return this;
}


public com.moon.iv a(long p0) {
this.a = ((long)(p0));
    return this;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.iv.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral1688_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/iv"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24684;
      if (g[var3] == null) {
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
         long var5 = f[var3];
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
         Object[] var9 = (Object[])h.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               h.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/iv", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         g[var3] = var15;
      }

      return g[var3];
}


public com.moon.iv a(float p0, float p1, float p2) {
((com.moon.iv)(((com.moon.iv)(this.a(((float)(p0))))).a(((float)(p1))))).a(((float)(p2)));
    return this;
}


public com.moon.iv a(float p0, float p1) {
((com.moon.iv)(this.a(((float)(p0))))).a(((float)(p1)));
    return this;
}


public com.moon.iv a(float p0) {
com.moon.iv lexicalValue93_22_0;
    com.moon.iv spill93_0;
    long life2_3;
    int[] life4_5;
    lexical_join_22: {
    lexical_join_19: {
    life2_3 = (com.moon.iv.e ^ 123108566028214L);
    life4_5 = com.moon.iv.b__ArrayInt();
    lexical_cycle_6: while (true) {
    if (!(((this.c - this.b) < 4))) {
        break lexical_join_19;
    }
    spill93_0 = this;
    if (!((life4_5 != null))) {
        lexicalValue93_22_0 = spill93_0;
        break lexical_join_22;
    }
    ((com.moon.iv)(spill93_0)).a__Void();
    if (!((life4_5 == null))) { continue lexical_cycle_6; }
    break lexical_cycle_6;
    }
    }
    lexicalValue93_22_0 = this.b(((float)(p0)));
    }
    return lexicalValue93_22_0;
}


public void a__Void(int p0) {
int local2 = (this.c + p0);
    long local3 = org.lwjgl.system.MemoryUtil.nmemRealloc(((long)(this.a)), ((long)(((long) local2))));
    this.c = ((int)(local2));
    this.a = ((long)(local3));
    return;
}


private void a__Void() {
int local1 = ((int) (((float) this.c) * 0x1.8p0f));
    long local2 = org.lwjgl.system.MemoryUtil.nmemRealloc(((long)(this.a)), ((long)(((long) local1))));
    this.c = ((int)(local1));
    this.a = ((long)(local2));
    return;
}


public int a() {
return this.b;
}


public long a__Long() {
return this.a;
}


public com.moon.iv a(int p0) {
long life2_3;
    float life5_5;
    float life6_23;
    float life7_40;
    float life8_51;
    int[] life4_52;
    float life9_71;
    life2_3 = (com.moon.iv.e ^ 23650737305575L);
    life5_5 = com.moon.hU.k();
    int[] spill1436_0 = com.moon.iv.b__ArrayInt();
    life6_23 = (((float) ((p0 >> __sourceIntrinsic_c222c17edd9a_invokedynamic1436_3(31301, (6965506111177123807L ^ life2_3))) & __sourceIntrinsic_c222c17edd9a_invokedynamic1436_4(20784, (4595964149785218217L ^ life2_3)))) / 0x1.fep7f);
    life7_40 = (((float) ((p0 >> __sourceIntrinsic_c222c17edd9a_invokedynamic1436_5(9761, (2906204106235853758L ^ life2_3))) & __sourceIntrinsic_c222c17edd9a_invokedynamic1436_6(25903, (6755960971722619063L ^ life2_3)))) / 0x1.fep7f);
    life8_51 = (((float) (p0 & __sourceIntrinsic_c222c17edd9a_invokedynamic1436_7(25903, (6755960971722619063L ^ life2_3)))) / 0x1.fep7f);
    life4_52 = spill1436_0;
    life9_71 = ((((float) ((p0 >> __sourceIntrinsic_c222c17edd9a_invokedynamic1436_8(30009, (701967442487503010L ^ life2_3))) & __sourceIntrinsic_c222c17edd9a_invokedynamic1436_9(25903, (6755960971722619063L ^ life2_3)))) / 0x1.fep7f) * life5_5);
    ((com.moon.iv)(((com.moon.iv)(((com.moon.iv)(this.a(((float)(life6_23))))).a(((float)(life7_40))))).a(((float)(life8_51))))).a(((float)(life9_71)));
    com.moon.iv spill1436_1 = this;
    if ((life4_52 == null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[4])));
    }
    return spill1436_1;
}


public com.moon.iv a(float p0, float p1, float p2, float p3) {
((com.moon.iv)(this.a(((float)((p0 / p2)))))).a(((float)((p1 / p3))));
    return this;
}


public com.moon.iv a(double p0, double p1, double p2) {
((com.moon.iv)(((com.moon.iv)(this.a(((float)(((float) p0)))))).a(((float)(((float) p1)))))).a(((float)(((float) p2))));
    return this;
}


private static native <E extends Throwable> int __sourceIntrinsic_c222c17edd9a_invokedynamic1436_3(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c222c17edd9a_invokedynamic1436_4(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c222c17edd9a_invokedynamic1436_5(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c222c17edd9a_invokedynamic1436_6(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c222c17edd9a_invokedynamic1436_7(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c222c17edd9a_invokedynamic1436_8(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_c222c17edd9a_invokedynamic1436_9(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral1688_0() throws E;
}
