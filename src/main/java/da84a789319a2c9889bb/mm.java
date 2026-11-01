package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class mm {

private com.moon.mk[] a;

private static final long b;

private static final java.lang.String c;

private static final long[] d;

private static final java.lang.Integer[] e;

private static final java.util.Map f;

public mm() {
super();
}


public mm(com.moon.mk[] p0) {
super();
    this.a = p0;
}


static {
b = ((long)(((moom._a)(moom._c.a(((long)(-5419488397649126695L)), ((long)(4805610127978576841L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(76143661149062L)))));
    long local11_life6 = (com.moon.mm.b ^ 67268832409738L);
    javax.crypto.Cipher local13_life8;
    javax.crypto.Cipher __sourceSpill249_10 = (local13_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill249_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill249_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill249_13 = new byte[8];
    (__sourceSpill249_13)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local14_life14 = 1;
    while ((local14_life14 < 8)) {
        (__sourceSpill249_13)[local14_life14] = ((byte) ((int) ((local11_life6 << (local14_life14 * 8)) >>> 56)));
        local14_life14 += 1;
    }
    byte[] __sourcePreallocation249_15 = __sourceSpill249_13;
    ((javax.crypto.Cipher)(__sourceSpill249_10)).init(((int)(__sourceSpill249_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill249_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation249_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill249_19 = ((java.lang.String)("\0044wªW\033\026\023y÷ùHïd?dSÒ\036á-")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill249_20 = local13_life8;
    byte[] local15_life22 = ((javax.crypto.Cipher)(__sourceSpill249_20)).doFinal(((byte[])(__sourceSpill249_19)));
    c = ((java.lang.String)(((java.lang.String)(com.moon.mm.a(((byte[])(local15_life22))))).intern()));
    f = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life28;
    javax.crypto.Cipher __sourceSpill249_30 = (local0_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill249_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill249_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill249_33 = new byte[8];
    (__sourceSpill249_33)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life34 = 1;
    while ((local1_life34 < 8)) {
        (__sourceSpill249_33)[local1_life34] = ((byte) ((int) ((local11_life6 << (local1_life34 * 8)) >>> 56)));
        local1_life34 += 1;
    }
    byte[] __sourcePreallocation249_35 = __sourceSpill249_33;
    ((javax.crypto.Cipher)(__sourceSpill249_30)).init(((int)(__sourceSpill249_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill249_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation249_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life38 = new long[2];
    int local3_life39 = 0;
    java.lang.String local4_life40;
    int local5_life42 = ((java.lang.String)((local4_life40 = "òçpM²,Ú¯\032pj"))).length();
    int local2_life43 = 0;
    do {
        java.lang.String __sourceSpill249_44 = local4_life40;
        int __sourceSpill249_45 = local2_life43;
        local2_life43 += 8;
        byte[] local7_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill249_44)).substring(((int)(__sourceSpill249_45)), ((int)(local2_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill249_49 = local6_life38;
        int __sourceSpill249_50 = local3_life39;
        local3_life39 += 1;
        long local8_life51 = (((((((((((long) (local7_life48)[0]) & 255L) << 56) | ((((long) (local7_life48)[1]) & 255L) << 48)) | ((((long) (local7_life48)[2]) & 255L) << 40)) | ((((long) (local7_life48)[3]) & 255L) << 32)) | ((((long) (local7_life48)[4]) & 255L) << 24)) | ((((long) (local7_life48)[5]) & 255L) << 16)) | ((((long) (local7_life48)[6]) & 255L) << 8)) | (((long) (local7_life48)[7]) & 255L));
        byte[] __sourceSpill249_52 = new byte[8];
        (__sourceSpill249_52)[0] = ((byte) ((int) (local8_life51 >>> 56)));
        (__sourceSpill249_52)[1] = ((byte) ((int) (local8_life51 >>> 48)));
        (__sourceSpill249_52)[2] = ((byte) ((int) (local8_life51 >>> 40)));
        (__sourceSpill249_52)[3] = ((byte) ((int) (local8_life51 >>> 32)));
        (__sourceSpill249_52)[4] = ((byte) ((int) (local8_life51 >>> 24)));
        (__sourceSpill249_52)[5] = ((byte) ((int) (local8_life51 >>> 16)));
        (__sourceSpill249_52)[6] = ((byte) ((int) (local8_life51 >>> 8)));
        (__sourceSpill249_52)[7] = ((byte) ((int) local8_life51));
        javax.crypto.Cipher __sourceSpill249_53 = local0_life28;
        byte[] local10_life55 = ((javax.crypto.Cipher)(__sourceSpill249_53)).doFinal(((byte[])(__sourceSpill249_52)));
        (__sourceSpill249_49)[__sourceSpill249_50] = (((((((((((long) (local10_life55)[0]) & 255L) << 56) | ((((long) (local10_life55)[1]) & 255L) << 48)) | ((((long) (local10_life55)[2]) & 255L) << 40)) | ((((long) (local10_life55)[3]) & 255L) << 32)) | ((((long) (local10_life55)[4]) & 255L) << 24)) | ((((long) (local10_life55)[5]) & 255L) << 16)) | ((((long) (local10_life55)[6]) & 255L) << 8)) | (((long) (local10_life55)[7]) & 255L));
    } while ((!(local2_life43 >= local5_life42)));
    d = ((long[])(local6_life38));
    e = ((java.lang.Integer[])(new java.lang.Integer[2]));
}


public boolean equals(java.lang.Object p0) {
java.lang.Object forwardValue772_14_0;
    java.lang.Object forwardValue772_21_0;
    int forwardValue772_36_0;
    int forwardValue772_42_0;
    java.lang.Object spill772_0;
    boolean spill772_1;
    long life2_3;
    java.lang.String life4_5;
    com.moon.mm life5_32;
    forward_join_42: {
    forward_join_41: {
    forward_join_36: {
    forward_join_31: {
    forward_join_21: {
    forward_join_20: {
    forward_join_14: {
    forward_join_13: {
    life2_3 = (com.moon.mm.b ^ 14265783001989L);
    life4_5 = com.moon.ml.b();
    spill772_0 = p0;
    if (!((life4_5 == null))) {
        forwardValue772_14_0 = spill772_0;
        break forward_join_14;
    }
    if (!((spill772_0 == this))) {
        break forward_join_13;
    }
    return ((1) != 0);
    }
    forwardValue772_14_0 = p0;
    }
    if (!((life4_5 == null))) {
        forwardValue772_21_0 = forwardValue772_14_0;
        break forward_join_21;
    }
    if (!((((forwardValue772_14_0 instanceof com.moon.mm) ? 1 : 0) == 0))) {
        break forward_join_20;
    }
    return ((0) != 0);
    }
    forwardValue772_21_0 = p0;
    }
    life5_32 = ((com.moon.mm)(forwardValue772_21_0));
    spill772_1 = ((com.moon.mm)(life5_32)).a(((java.lang.Object)(this)));
    if (!((life4_5 == null))) {
        forwardValue772_36_0 = ((spill772_1) ? 1 : 0);
        break forward_join_36;
    }
    if (!((!spill772_1))) {
        break forward_join_31;
    }
    return ((0) != 0);
    }
    forwardValue772_36_0 = ((java.util.Arrays.deepEquals(((java.lang.Object[])(this.a())), ((java.lang.Object[])(((com.moon.mm)(life5_32)).a())))) ? 1 : 0);
    }
    if (!((life4_5 == null))) {
        forwardValue772_42_0 = forwardValue772_36_0;
        break forward_join_42;
    }
    if (!((forwardValue772_36_0 == 0))) {
        break forward_join_41;
    }
    return ((0) != 0);
    }
    forwardValue772_42_0 = 1;
    }
    return ((forwardValue772_42_0) != 0);
}


public java.lang.String toString() {
long local1_life2 = (com.moon.mm.b ^ 13745558191376L);
    java.lang.String __stackOp142_6_0 = java.util.Arrays.deepToString(((java.lang.Object[])(this.a())));
    java.lang.String __stackOp142_6_1 = com.moon.mm.c;
    return __sourceIntrinsic_a86c261fcdee_originalDynamicSite142_7(__stackOp142_6_1, __stackOp142_6_0, ")");
}


public int hashCode() {
long life1_3;
    int life4_10;
    java.lang.String life3_11;
    int life5_13;
    int life5_25;
    life1_3 = (com.moon.mm.b ^ 84299970710833L);
    java.lang.String spill1917_0 = com.moon.ml.b();
    life4_10 = __sourceIntrinsic_1861091996aa_invokedynamic1917_2(20706, (6770350828714445472L ^ life1_3));
    life3_11 = spill1917_0;
    life5_13 = 1;
    life5_25 = ((life5_13 * __sourceIntrinsic_1861091996aa_invokedynamic1917_3(10679, (7986991354365228020L ^ life1_3))) + java.util.Arrays.deepHashCode(((java.lang.Object[])(this.a()))));
    int spill1917_1 = life5_25;
    if ((life3_11 != null)) {
        net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[5])));
    }
    return spill1917_1;
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
        byte[] spill1003_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1003_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1003_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1003_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1003_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1003_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 28879;
      if (e[var3] == null) {
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
         long var5 = d[var3];
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
         Object[] var9 = (Object[])f.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               f.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/mm", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         e[var3] = var15;
      }

      return e[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral2303_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/mm"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.mm.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public com.moon.mk[] a() {
return this.a;
}


public com.moon.mm a(com.moon.mk[] p0) {
this.a = ((com.moon.mk[])(p0));
    return this;
}


protected boolean a(java.lang.Object p0) {
return ((((p0 instanceof com.moon.mm) ? 1 : 0)) != 0);
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


private static native <E extends Throwable> java.lang.String __sourceIntrinsic_a86c261fcdee_originalDynamicSite142_7(java.lang.String a0, java.lang.String a1, java.lang.String a2) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1917_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_1861091996aa_invokedynamic1917_3(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral2303_0() throws E;
}
