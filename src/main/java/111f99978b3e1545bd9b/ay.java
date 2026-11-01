package moom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
class ay extends sourcebuild.EnumConstructor<moom.ay> {

public static moom.ay LOCKED;

public static moom.ay LOCKED_HOVER;

public static moom.ay LOCKED_DISABLED;

public static moom.ay UNLOCKED;

public static moom.ay UNLOCKED_HOVER;

public static moom.ay UNLOCKED_DISABLED;

private int a;

private int b;

private static moom.ay[] c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private ay(java.lang.String p0, int p1, int p2, int p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(386042034793295912L)), ((long)(-5686847398421010232L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(58245424925470L)))));
    long local11_life6 = (moom.ay.d ^ 39132559946478L);
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life9;
    javax.crypto.Cipher __sourceSpill1092_11 = (local0_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill1092_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill1092_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill1092_14 = new byte[8];
    (__sourceSpill1092_14)[0] = ((byte) ((int) (local11_life6 >>> 56)));
    int local1_life15 = 1;
    while ((local1_life15 < 8)) {
        (__sourceSpill1092_14)[local1_life15] = ((byte) ((int) ((local11_life6 << (local1_life15 * 8)) >>> 56)));
        local1_life15 += 1;
    }
    byte[] __sourcePreallocation1092_16 = __sourceSpill1092_14;
    ((javax.crypto.Cipher)(__sourceSpill1092_11)).init(((int)(__sourceSpill1092_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill1092_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation1092_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life19 = new long[9];
    int local3_life20 = 0;
    java.lang.String local4_life21;
    int local5_life23 = ((java.lang.String)((local4_life21 = "pÉzÁÉÒ\000Mo$\fk\031÷¤<#\177|p\023te\003¸ðJ¾ò7½¤üklÄ\n\tÑÒ\031ÒÎ3rG;1"))).length();
    int local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1092_25 = local4_life21;
        int __sourceSpill1092_26 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill1092_25)).substring(((int)(__sourceSpill1092_26)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1092_30 = local6_life19;
        int __sourceSpill1092_31 = local3_life20;
        local3_life20 += 1;
        long local8_life32 = (((((((((((long) (local7_life29)[0]) & 255L) << 56) | ((((long) (local7_life29)[1]) & 255L) << 48)) | ((((long) (local7_life29)[2]) & 255L) << 40)) | ((((long) (local7_life29)[3]) & 255L) << 32)) | ((((long) (local7_life29)[4]) & 255L) << 24)) | ((((long) (local7_life29)[5]) & 255L) << 16)) | ((((long) (local7_life29)[6]) & 255L) << 8)) | (((long) (local7_life29)[7]) & 255L));
        byte[] __sourceSpill1092_33 = new byte[8];
        (__sourceSpill1092_33)[0] = ((byte) ((int) (local8_life32 >>> 56)));
        (__sourceSpill1092_33)[1] = ((byte) ((int) (local8_life32 >>> 48)));
        (__sourceSpill1092_33)[2] = ((byte) ((int) (local8_life32 >>> 40)));
        (__sourceSpill1092_33)[3] = ((byte) ((int) (local8_life32 >>> 32)));
        (__sourceSpill1092_33)[4] = ((byte) ((int) (local8_life32 >>> 24)));
        (__sourceSpill1092_33)[5] = ((byte) ((int) (local8_life32 >>> 16)));
        (__sourceSpill1092_33)[6] = ((byte) ((int) (local8_life32 >>> 8)));
        (__sourceSpill1092_33)[7] = ((byte) ((int) local8_life32));
        javax.crypto.Cipher __sourceSpill1092_34 = local0_life9;
        byte[] local10_life36 = ((javax.crypto.Cipher)(__sourceSpill1092_34)).doFinal(((byte[])(__sourceSpill1092_33)));
        (__sourceSpill1092_30)[__sourceSpill1092_31] = (((((((((((long) (local10_life36)[0]) & 255L) << 56) | ((((long) (local10_life36)[1]) & 255L) << 48)) | ((((long) (local10_life36)[2]) & 255L) << 40)) | ((((long) (local10_life36)[3]) & 255L) << 32)) | ((((long) (local10_life36)[4]) & 255L) << 24)) | ((((long) (local10_life36)[5]) & 255L) << 16)) | ((((long) (local10_life36)[6]) & 255L) << 8)) | (((long) (local10_life36)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    local5_life23 = ((java.lang.String)((local4_life21 = "0;RÜ\023;q/roùíJe¤ñ"))).length();
    local2_life24 = 0;
    do {
        java.lang.String __sourceSpill1092_38 = local4_life21;
        int __sourceSpill1092_39 = local2_life24;
        local2_life24 += 8;
        byte[] local7_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill1092_38)).substring(((int)(__sourceSpill1092_39)), ((int)(local2_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill1092_43 = local6_life19;
        int __sourceSpill1092_44 = local3_life20;
        local3_life20 += 1;
        long local8_life45 = (((((((((((long) (local7_life42)[0]) & 255L) << 56) | ((((long) (local7_life42)[1]) & 255L) << 48)) | ((((long) (local7_life42)[2]) & 255L) << 40)) | ((((long) (local7_life42)[3]) & 255L) << 32)) | ((((long) (local7_life42)[4]) & 255L) << 24)) | ((((long) (local7_life42)[5]) & 255L) << 16)) | ((((long) (local7_life42)[6]) & 255L) << 8)) | (((long) (local7_life42)[7]) & 255L));
        byte[] __sourceSpill1092_46 = new byte[8];
        (__sourceSpill1092_46)[0] = ((byte) ((int) (local8_life45 >>> 56)));
        (__sourceSpill1092_46)[1] = ((byte) ((int) (local8_life45 >>> 48)));
        (__sourceSpill1092_46)[2] = ((byte) ((int) (local8_life45 >>> 40)));
        (__sourceSpill1092_46)[3] = ((byte) ((int) (local8_life45 >>> 32)));
        (__sourceSpill1092_46)[4] = ((byte) ((int) (local8_life45 >>> 24)));
        (__sourceSpill1092_46)[5] = ((byte) ((int) (local8_life45 >>> 16)));
        (__sourceSpill1092_46)[6] = ((byte) ((int) (local8_life45 >>> 8)));
        (__sourceSpill1092_46)[7] = ((byte) ((int) local8_life45));
        javax.crypto.Cipher __sourceSpill1092_47 = local0_life9;
        byte[] local10_life49 = ((javax.crypto.Cipher)(__sourceSpill1092_47)).doFinal(((byte[])(__sourceSpill1092_46)));
        (__sourceSpill1092_43)[__sourceSpill1092_44] = (((((((((((long) (local10_life49)[0]) & 255L) << 56) | ((((long) (local10_life49)[1]) & 255L) << 48)) | ((((long) (local10_life49)[2]) & 255L) << 40)) | ((((long) (local10_life49)[3]) & 255L) << 32)) | ((((long) (local10_life49)[4]) & 255L) << 24)) | ((((long) (local10_life49)[5]) & 255L) << 16)) | ((((long) (local10_life49)[6]) & 255L) << 8)) | (((long) (local10_life49)[7]) & 255L));
    } while ((!(local2_life24 >= local5_life23)));
    e = ((long[])(local6_life19));
    f = ((java.lang.Integer[])(new java.lang.Integer[9]));
    LOCKED = ((moom.ay)(new moom.ay("LOCKED", 0, 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_52(8396, (9217450843075924362L ^ local11_life6)))));
    LOCKED_HOVER = ((moom.ay)(new moom.ay("LOCKED_HOVER", 1, 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_54(23670, (4028054680163659063L ^ local11_life6)))));
    LOCKED_DISABLED = ((moom.ay)(new moom.ay("LOCKED_DISABLED", 2, 0, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_56(940, (5803988130574856942L ^ local11_life6)))));
    UNLOCKED = ((moom.ay)(new moom.ay("UNLOCKED", 3, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_58(14752, (7300093865365358816L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_59(21802, (76205822018135149L ^ local11_life6)))));
    UNLOCKED_HOVER = ((moom.ay)(new moom.ay("UNLOCKED_HOVER", 4, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_61(8571, (3346879239677071422L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_62(22351, (6926924634360227333L ^ local11_life6)))));
    UNLOCKED_DISABLED = ((moom.ay)(new moom.ay("UNLOCKED_DISABLED", 5, __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_64(8571, (3346879239677071422L ^ local11_life6)), __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_65(1702, (8478306482778634213L ^ local11_life6)))));
    c = ((moom.ay[])(moom.ay.a__Arrayay()));
}


public static moom.ay[] values() {
return ((moom.ay[])(((moom.ay[])(moom.ay.c)).clone()));
}


public static moom.ay valueOf(java.lang.String p0) {
return ((moom.ay)(java.lang.Enum.valueOf(((java.lang.Class)(moom.ay.class)), ((java.lang.String)(p0)))));
}


public int b() {
return this.b;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = moom.ay.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral6910_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("moom/ay"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24684;
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
            throw new RuntimeException("moom/ay", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static moom.ay[] a__Arrayay() {
long local0_life1 = (moom.ay.d ^ 6798019979348L);
    moom.ay[] __sourceSharedArray749_4 = new moom.ay[__sourceIntrinsic_0b1ab3de587d_originalDynamicSite749_2(5530, (8168239217222499940L ^ local0_life1))];
    __sourceSharedArray749_4[0] = moom.ay.LOCKED;
    __sourceSharedArray749_4[1] = moom.ay.LOCKED_HOVER;
    __sourceSharedArray749_4[2] = moom.ay.LOCKED_DISABLED;
    __sourceSharedArray749_4[3] = moom.ay.UNLOCKED;
    __sourceSharedArray749_4[4] = moom.ay.UNLOCKED_HOVER;
    __sourceSharedArray749_4[5] = moom.ay.UNLOCKED_DISABLED;
    return __sourceSharedArray749_4;
}


public int a() {
return this.a;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_52(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_54(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_56(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_58(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_59(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_61(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_62(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_64(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite1092_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral6910_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0b1ab3de587d_originalDynamicSite749_2(int a0, long a1) throws E;
}
