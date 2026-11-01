package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;

public interface hn {
public static final net.minecraft.client.Minecraft a = null;
public static final long i = 0L;
public static final long[] n = null;
public static final java.lang.Integer[] o = null;
public static final java.util.Map p = null;
public static final long[] t = null;
public static final java.lang.Long[] u = null;
public static final java.util.Map v = null;
public void b(com.moon.hW p0);
public void c(com.moon.hW p0);
public void d(com.moon.hW p0);
public void a__Void();
public void a(com.moon.hW p0);
default int a(float p0, com.moon.module.impl.HUD p1, com.moon.b0 p2, int p3, int p4) { return __SourceInterface_hn.__sourceInterfaceCall_4bfa5e28fc70fba7(this, p0, p1, p2, p3, p4); }
default int a(float p0, double p1, com.moon.module.impl.HUD p2, com.moon.b0 p3, int p4, int p5) { return __SourceInterface_hn.__sourceInterfaceCall_96a894c32cfa9dcc(this, p0, p1, p2, p3, p4, p5); }
}
abstract class __SourceInterface_hn  implements com.moon.hn {

public static net.minecraft.client.Minecraft a;

public static long i;

public static long[] n;

public static java.lang.Integer[] o;

public static java.util.Map p;

public static long[] t;

public static java.lang.Long[] u;

public static java.util.Map v;

private static void initialize() {
i = ((long)(((moom._a)(moom._c.a(((long)(7682899091735216984L)), ((long)(-3758244003008148648L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(120222748054328L)))));
    p = ((java.util.Map)(new java.util.HashMap(13)));
    long local11_life7 = (com.moon.__SourceInterface_hn.i ^ 135713058918610L);
    javax.crypto.Cipher local13_life9;
    javax.crypto.Cipher __sourceSpill142_11 = (local13_life9 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill142_12 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill142_13 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill142_14 = new byte[8];
    (__sourceSpill142_14)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local14_life15 = 1;
    while ((local14_life15 < 8)) {
        (__sourceSpill142_14)[local14_life15] = ((byte) ((int) ((local11_life7 << (local14_life15 * 8)) >>> 56)));
        local14_life15 += 1;
    }
    byte[] __sourcePreallocation142_16 = __sourceSpill142_14;
    ((javax.crypto.Cipher)(__sourceSpill142_11)).init(((int)(__sourceSpill142_12)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill142_13)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation142_16)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local19_life19 = new long[4];
    int local16_life20 = 0;
    java.lang.String local17_life21;
    int local18_life23 = ((java.lang.String)((local17_life21 = "Í#Ô6°.\022S±¼n+"))).length();
    int local15_life24 = 0;
    do {
        java.lang.String __sourceSpill142_25 = local17_life21;
        int __sourceSpill142_26 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life29 = ((java.lang.String)(((java.lang.String)(__sourceSpill142_25)).substring(((int)(__sourceSpill142_26)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill142_30 = local19_life19;
        int __sourceSpill142_31 = local16_life20;
        local16_life20 += 1;
        long local21_life32 = (((((((((((long) (local20_life29)[0]) & 255L) << 56) | ((((long) (local20_life29)[1]) & 255L) << 48)) | ((((long) (local20_life29)[2]) & 255L) << 40)) | ((((long) (local20_life29)[3]) & 255L) << 32)) | ((((long) (local20_life29)[4]) & 255L) << 24)) | ((((long) (local20_life29)[5]) & 255L) << 16)) | ((((long) (local20_life29)[6]) & 255L) << 8)) | (((long) (local20_life29)[7]) & 255L));
        byte[] __sourceSpill142_33 = new byte[8];
        (__sourceSpill142_33)[0] = ((byte) ((int) (local21_life32 >>> 56)));
        (__sourceSpill142_33)[1] = ((byte) ((int) (local21_life32 >>> 48)));
        (__sourceSpill142_33)[2] = ((byte) ((int) (local21_life32 >>> 40)));
        (__sourceSpill142_33)[3] = ((byte) ((int) (local21_life32 >>> 32)));
        (__sourceSpill142_33)[4] = ((byte) ((int) (local21_life32 >>> 24)));
        (__sourceSpill142_33)[5] = ((byte) ((int) (local21_life32 >>> 16)));
        (__sourceSpill142_33)[6] = ((byte) ((int) (local21_life32 >>> 8)));
        (__sourceSpill142_33)[7] = ((byte) ((int) local21_life32));
        javax.crypto.Cipher __sourceSpill142_34 = local13_life9;
        byte[] local23_life36 = ((javax.crypto.Cipher)(__sourceSpill142_34)).doFinal(((byte[])(__sourceSpill142_33)));
        (__sourceSpill142_30)[__sourceSpill142_31] = (((((((((((long) (local23_life36)[0]) & 255L) << 56) | ((((long) (local23_life36)[1]) & 255L) << 48)) | ((((long) (local23_life36)[2]) & 255L) << 40)) | ((((long) (local23_life36)[3]) & 255L) << 32)) | ((((long) (local23_life36)[4]) & 255L) << 24)) | ((((long) (local23_life36)[5]) & 255L) << 16)) | ((((long) (local23_life36)[6]) & 255L) << 8)) | (((long) (local23_life36)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    local18_life23 = ((java.lang.String)((local17_life21 = " 0Ã×\\ú\027¾(VÏ\"Ï"))).length();
    local15_life24 = 0;
    do {
        java.lang.String __sourceSpill142_38 = local17_life21;
        int __sourceSpill142_39 = local15_life24;
        local15_life24 += 8;
        byte[] local20_life42 = ((java.lang.String)(((java.lang.String)(__sourceSpill142_38)).substring(((int)(__sourceSpill142_39)), ((int)(local15_life24))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill142_43 = local19_life19;
        int __sourceSpill142_44 = local16_life20;
        local16_life20 += 1;
        long local21_life45 = (((((((((((long) (local20_life42)[0]) & 255L) << 56) | ((((long) (local20_life42)[1]) & 255L) << 48)) | ((((long) (local20_life42)[2]) & 255L) << 40)) | ((((long) (local20_life42)[3]) & 255L) << 32)) | ((((long) (local20_life42)[4]) & 255L) << 24)) | ((((long) (local20_life42)[5]) & 255L) << 16)) | ((((long) (local20_life42)[6]) & 255L) << 8)) | (((long) (local20_life42)[7]) & 255L));
        byte[] __sourceSpill142_46 = new byte[8];
        (__sourceSpill142_46)[0] = ((byte) ((int) (local21_life45 >>> 56)));
        (__sourceSpill142_46)[1] = ((byte) ((int) (local21_life45 >>> 48)));
        (__sourceSpill142_46)[2] = ((byte) ((int) (local21_life45 >>> 40)));
        (__sourceSpill142_46)[3] = ((byte) ((int) (local21_life45 >>> 32)));
        (__sourceSpill142_46)[4] = ((byte) ((int) (local21_life45 >>> 24)));
        (__sourceSpill142_46)[5] = ((byte) ((int) (local21_life45 >>> 16)));
        (__sourceSpill142_46)[6] = ((byte) ((int) (local21_life45 >>> 8)));
        (__sourceSpill142_46)[7] = ((byte) ((int) local21_life45));
        javax.crypto.Cipher __sourceSpill142_47 = local13_life9;
        byte[] local23_life49 = ((javax.crypto.Cipher)(__sourceSpill142_47)).doFinal(((byte[])(__sourceSpill142_46)));
        (__sourceSpill142_43)[__sourceSpill142_44] = (((((((((((long) (local23_life49)[0]) & 255L) << 56) | ((((long) (local23_life49)[1]) & 255L) << 48)) | ((((long) (local23_life49)[2]) & 255L) << 40)) | ((((long) (local23_life49)[3]) & 255L) << 32)) | ((((long) (local23_life49)[4]) & 255L) << 24)) | ((((long) (local23_life49)[5]) & 255L) << 16)) | ((((long) (local23_life49)[6]) & 255L) << 8)) | (((long) (local23_life49)[7]) & 255L));
    } while ((!(local15_life24 >= local18_life23)));
    n = ((long[])(local19_life19));
    o = ((java.lang.Integer[])(new java.lang.Integer[4]));
    v = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life54;
    javax.crypto.Cipher __sourceSpill142_56 = (local0_life54 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill142_57 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill142_58 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill142_59 = new byte[8];
    (__sourceSpill142_59)[0] = ((byte) ((int) (local11_life7 >>> 56)));
    int local1_life60 = 1;
    while ((local1_life60 < 8)) {
        (__sourceSpill142_59)[local1_life60] = ((byte) ((int) ((local11_life7 << (local1_life60 * 8)) >>> 56)));
        local1_life60 += 1;
    }
    byte[] __sourcePreallocation142_61 = __sourceSpill142_59;
    ((javax.crypto.Cipher)(__sourceSpill142_56)).init(((int)(__sourceSpill142_57)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill142_58)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation142_61)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life64 = new long[2];
    int local3_life65 = 0;
    java.lang.String local4_life66;
    int local5_life68 = ((java.lang.String)((local4_life66 = "½ûLÈý\007-÷$Käø"))).length();
    int local2_life69 = 0;
    do {
        java.lang.String __sourceSpill142_70 = local4_life66;
        int __sourceSpill142_71 = local2_life69;
        local2_life69 += 8;
        byte[] local7_life74 = ((java.lang.String)(((java.lang.String)(__sourceSpill142_70)).substring(((int)(__sourceSpill142_71)), ((int)(local2_life69))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill142_75 = local6_life64;
        int __sourceSpill142_76 = local3_life65;
        local3_life65 += 1;
        long local8_life77 = (((((((((((long) (local7_life74)[0]) & 255L) << 56) | ((((long) (local7_life74)[1]) & 255L) << 48)) | ((((long) (local7_life74)[2]) & 255L) << 40)) | ((((long) (local7_life74)[3]) & 255L) << 32)) | ((((long) (local7_life74)[4]) & 255L) << 24)) | ((((long) (local7_life74)[5]) & 255L) << 16)) | ((((long) (local7_life74)[6]) & 255L) << 8)) | (((long) (local7_life74)[7]) & 255L));
        byte[] __sourceSpill142_78 = new byte[8];
        (__sourceSpill142_78)[0] = ((byte) ((int) (local8_life77 >>> 56)));
        (__sourceSpill142_78)[1] = ((byte) ((int) (local8_life77 >>> 48)));
        (__sourceSpill142_78)[2] = ((byte) ((int) (local8_life77 >>> 40)));
        (__sourceSpill142_78)[3] = ((byte) ((int) (local8_life77 >>> 32)));
        (__sourceSpill142_78)[4] = ((byte) ((int) (local8_life77 >>> 24)));
        (__sourceSpill142_78)[5] = ((byte) ((int) (local8_life77 >>> 16)));
        (__sourceSpill142_78)[6] = ((byte) ((int) (local8_life77 >>> 8)));
        (__sourceSpill142_78)[7] = ((byte) ((int) local8_life77));
        javax.crypto.Cipher __sourceSpill142_79 = local0_life54;
        byte[] local10_life81 = ((javax.crypto.Cipher)(__sourceSpill142_79)).doFinal(((byte[])(__sourceSpill142_78)));
        (__sourceSpill142_75)[__sourceSpill142_76] = (((((((((((long) (local10_life81)[0]) & 255L) << 56) | ((((long) (local10_life81)[1]) & 255L) << 48)) | ((((long) (local10_life81)[2]) & 255L) << 40)) | ((((long) (local10_life81)[3]) & 255L) << 32)) | ((((long) (local10_life81)[4]) & 255L) << 24)) | ((((long) (local10_life81)[5]) & 255L) << 16)) | ((((long) (local10_life81)[6]) & 255L) << 8)) | (((long) (local10_life81)[7]) & 255L));
    } while ((!(local2_life69 >= local5_life68)));
    t = ((long[])(local6_life64));
    u = ((java.lang.Long[])(new java.lang.Long[2]));
    a = ((net.minecraft.client.Minecraft)(net.minecraft.client.Minecraft.a__fM()));
}


private static int b(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 5798;
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
            throw new RuntimeException("com/moon/hn", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         o[var3] = var15;
      }

      return o[var3];
}


private static java.lang.invoke.CallSite b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_641ba07ca8f5_methodHandleLiteral1472_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int b(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.__SourceInterface_hn.b(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public abstract void b(com.moon.hW p0);

public abstract void c(com.moon.hW p0);

private static long d(int p0, long p1) {
int life3_8;
    byte[] life4_77;
    long life5_81;
    byte[] life7_146;
    java.lang.Long life8_150;
    java.lang.Object[] life9_155;
    javax.crypto.spec.DESKeySpec life11_188;
    javax.crypto.SecretKey life12_195;
    javax.crypto.Cipher life13_200;
    byte[] life10_212;
    long life11_290;
    life3_8 = ((p0 ^ ((int) (p1 & 32767L))) ^ 6405);
    if (((com.moon.__SourceInterface_hn.u)[life3_8] == null)) {
        life4_77 = new byte[] {((byte) ((int) (p1 >>> 56))), ((byte) ((int) (p1 >>> 48))), ((byte) ((int) (p1 >>> 40))), ((byte) ((int) (p1 >>> 32))), ((byte) ((int) (p1 >>> 24))), ((byte) ((int) (p1 >>> 16))), ((byte) ((int) (p1 >>> 8))), ((byte) ((int) p1))};
        life5_81 = (com.moon.__SourceInterface_hn.t)[life3_8];
        life7_146 = new byte[] {((byte) ((int) (life5_81 >>> 56))), ((byte) ((int) (life5_81 >>> 48))), ((byte) ((int) (life5_81 >>> 40))), ((byte) ((int) (life5_81 >>> 32))), ((byte) ((int) (life5_81 >>> 24))), ((byte) ((int) (life5_81 >>> 16))), ((byte) ((int) (life5_81 >>> 8))), ((byte) ((int) life5_81))};
        life8_150 = java.lang.Long.valueOf(((long)(((java.lang.Thread)(java.lang.Thread.currentThread())).getId())));
        life9_155 = ((java.lang.Object[])(((java.util.Map)(com.moon.__SourceInterface_hn.v)).get(((java.lang.Object)(life8_150)))));
        try {
        if ((life9_155 == null)) {
        life9_155 = new java.lang.Object[3];
        (life9_155)[0] = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding")));
        (life9_155)[1] = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
        (life9_155)[2] = new javax.crypto.spec.IvParameterSpec(new byte[8]);
        ((java.util.Map)(com.moon.__SourceInterface_hn.v)).put(((java.lang.Object)(life8_150)), ((java.lang.Object)(life9_155)));
    }
        life11_188 = new javax.crypto.spec.DESKeySpec(life4_77);
        life12_195 = ((javax.crypto.SecretKeyFactory)(((javax.crypto.SecretKeyFactory)((life9_155)[1])))).generateSecret(((java.security.spec.KeySpec)(life11_188)));
        life13_200 = ((javax.crypto.Cipher)((life9_155)[0]));
        ((javax.crypto.Cipher)(life13_200)).init(((int)(2)), ((java.security.Key)(life12_195)), ((java.security.spec.AlgorithmParameterSpec)(((javax.crypto.spec.IvParameterSpec)((life9_155)[2])))));
        life10_212 = ((javax.crypto.Cipher)(life13_200)).doFinal(((byte[])(life7_146)));
    } catch (java.lang.Exception life11_214) {
        throw new java.lang.RuntimeException("com/moon/hn", life11_214);
    }
        life11_290 = (((((((((((long) (life10_212)[0]) & 255L) << 56) | ((((long) (life10_212)[1]) & 255L) << 48)) | ((((long) (life10_212)[2]) & 255L) << 40)) | ((((long) (life10_212)[3]) & 255L) << 32)) | ((((long) (life10_212)[4]) & 255L) << 24)) | ((((long) (life10_212)[5]) & 255L) << 16)) | ((((long) (life10_212)[6]) & 255L) << 8)) | (((long) (life10_212)[7]) & 255L));
        (com.moon.__SourceInterface_hn.u)[life3_8] = java.lang.Long.valueOf(((long)(life11_290)));
    }
    return ((java.lang.Long)((com.moon.__SourceInterface_hn.u)[life3_8])).longValue();
}


private static long d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    long local7 = com.moon.__SourceInterface_hn.d(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local9 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Long.TYPE)), ((java.lang.Object)(java.lang.Long.valueOf(((long)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local9)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


public abstract void d(com.moon.hW p0);

private static java.lang.invoke.CallSite d(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_e2e9f1c18f50_methodHandleLiteral1474_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/hn"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public abstract void a__Void();

public abstract void a(com.moon.hW p0);

public int a(float p0, com.moon.module.impl.HUD p1, com.moon.b0 p2, int p3, int p4) {
return ((com.moon.hn)(this)).a(((float)(p0)), ((double)(0x1.194p12d)), ((com.moon.module.impl.HUD)(p1)), ((com.moon.b0)(p2)), ((int)(p3)), ((int)(p4)));
}


public int a(float p0, double p1, com.moon.module.impl.HUD p2, com.moon.b0 p3, int p4, int p5) {
java.lang.Object forwardValue31_29_0;
    int forwardValue31_189_0;
    net.minecraft.entity.Entity[] spill31_0;
    com.moon.b0 spill31_1;
    int spill31_2;
    int spill31_3;
    int[] spill31_4;
    int[] spill31_5;
    int[] spill31_6;
    int[] spill31_7;
    int[] spill31_8;
    int[] spill31_9;
    int[] spill31_10;
    int[] spill31_11;
    int[] spill31_12;
    int[] spill31_13;
    int[] spill31_14;
    int[] spill31_15;
    int[] spill31_16;
    int[] spill31_17;
    long life8_3;
    int life11_7;
    net.minecraft.entity.Entity[] life10_8;
    int life12_38;
    long life13_40;
    long life15_51;
    int life17_60;
    int[] life18_98;
    int life12_121;
    long life15_128;
    int[] life17_167;
    forward_join_190: {
    forward_join_189: {
    forward_join_188: {
    forward_join_119: {
    forward_join_42: {
    forward_join_34: {
    forward_join_29: {
    life8_3 = (com.moon.__SourceInterface_hn.i ^ 112304864691285L);
    spill31_0 = com.moon.hl.b__Arrayr3();
    life11_7 = ((com.moon.b0)(p3)).ordinal();
    life10_8 = spill31_0;
    spill31_1 = p3;
    if (!((life10_8 == null))) {
        forwardValue31_29_0 = spill31_1;
        break forward_join_29;
    }
    if (!((spill31_1 == com.moon.b0.SYNC))) {
        break forward_join_34;
    }
    p4 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(p2)).e__kX())).getValue())))).intValue();
    p5 = ((java.lang.Integer)(((java.lang.Integer)(((com.moon.setting.ColorSetting)(((com.moon.module.impl.HUD)(p2)).f__kX())).getValue())))).intValue();
    forwardValue31_29_0 = ((com.moon.setting.ModeSetting)(((com.moon.module.impl.HUD)(p2)).f__kY())).getValue();
    }
    life11_7 = (((com.moon.bY)(((com.moon.bY)(forwardValue31_29_0)))).ordinal() + 1);
    }
    life12_38 = -1;
    life13_40 = java.lang.System.currentTimeMillis();
    spill31_2 = life11_7;
    if (!((life10_8 == null))) {
        forwardValue31_189_0 = spill31_2;
        break forward_join_189;
    }
    switch (spill31_2) {
case 3:
{
        break forward_join_42;
    }
case 2:
{
        break forward_join_119;
    }
default:
{
        break forward_join_188;
    }
}
    }
    life15_51 = ((long) (0x1.8p0d * p1));
    spill31_3 = 28438;
    life17_60 = ((java.awt.Color)(((java.awt.Color)(((java.awt.Color)(new java.awt.Color(p4))).darker())).darker())).getRGB();
    int[] __stackOp31_21_0 = new int[__SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_96a894c32cfa_invokedynamic31_20(spill31_3, (2915973307704750159L ^ life8_3))];
    spill31_4 = __stackOp31_21_0;
    (__stackOp31_21_0)[0] = p4;
    int[] __stackOp31_22_0 = spill31_4;
    spill31_5 = __stackOp31_22_0;
    (__stackOp31_22_0)[1] = life17_60;
    int[] __stackOp31_23_0 = spill31_5;
    spill31_6 = __stackOp31_23_0;
    (__stackOp31_23_0)[2] = p4;
    int[] __stackOp31_24_0 = spill31_6;
    spill31_7 = __stackOp31_24_0;
    (__stackOp31_24_0)[3] = life17_60;
    int[] __stackOp31_25_0 = spill31_7;
    spill31_8 = __stackOp31_25_0;
    (__stackOp31_25_0)[4] = p4;
    int[] __stackOp31_26_0 = spill31_8;
    spill31_9 = __stackOp31_26_0;
    (__stackOp31_26_0)[5] = life17_60;
    int[] __stackOp31_27_0 = spill31_9;
    spill31_10 = __stackOp31_27_0;
    (__stackOp31_27_0)[__SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_96a894c32cfa_invokedynamic31_28(25543, (53665203151387805L ^ life8_3))] = p4;
    life18_98 = spill31_10;
    life12_121 = com.moon.nD.a(((int[])(life18_98)), ((double)(((double) (((float) ((life13_40 + (((long) ((int) p0)) * __SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_96a894c32cfa_invokedynamic31_29(9602, (3894756513458419066L ^ life8_3)))) % life15_51)) / (((float) life15_51) / 0x1.0p1f))))));
    if (!((life10_8 != null))) {
        break forward_join_190;
    }
    }
    life15_128 = ((long) (0x1.8p0d * p1));
    int[] __stackOp31_32_0 = new int[__SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_96a894c32cfa_invokedynamic31_31(32508, (2757930143550513575L ^ life8_3))];
    spill31_11 = __stackOp31_32_0;
    (__stackOp31_32_0)[0] = p4;
    int[] __stackOp31_33_0 = spill31_11;
    spill31_12 = __stackOp31_33_0;
    (__stackOp31_33_0)[1] = p5;
    int[] __stackOp31_34_0 = spill31_12;
    spill31_13 = __stackOp31_34_0;
    (__stackOp31_34_0)[2] = p4;
    int[] __stackOp31_35_0 = spill31_13;
    spill31_14 = __stackOp31_35_0;
    (__stackOp31_35_0)[3] = p5;
    int[] __stackOp31_36_0 = spill31_14;
    spill31_15 = __stackOp31_36_0;
    (__stackOp31_36_0)[4] = p4;
    int[] __stackOp31_37_0 = spill31_15;
    spill31_16 = __stackOp31_37_0;
    (__stackOp31_37_0)[5] = p5;
    int[] __stackOp31_38_0 = spill31_16;
    spill31_17 = __stackOp31_38_0;
    (__stackOp31_38_0)[__SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_96a894c32cfa_invokedynamic31_39(989, (662639064431975557L ^ life8_3))] = p4;
    life17_167 = spill31_17;
    life12_121 = com.moon.nD.a(((int[])(life17_167)), ((double)(((double) (((float) ((life13_40 + (((long) ((int) p0)) * __SourceIntrinsics_0609655e41427d8c9207.__sourceIntrinsic_96a894c32cfa_invokedynamic31_40(5037, (2547630884271047508L ^ life8_3)))) % life15_128)) / (((float) life15_128) / 0x1.0p1f))))));
    if (!((life10_8 != null))) {
        break forward_join_190;
    }
    }
    forwardValue31_189_0 = p4;
    }
    return forwardValue31_189_0;
    }
    return life12_121;
}


private static moom.Oo a(moom.Oo p0) {
return p0;
}


static native int __sourceInterfaceCall_4bfa5e28fc70fba7(com.moon.hn receiver, float p0, com.moon.module.impl.HUD p1, com.moon.b0 p2, int p3, int p4);
static native int __sourceInterfaceCall_96a894c32cfa9dcc(com.moon.hn receiver, float p0, double p1, com.moon.module.impl.HUD p2, com.moon.b0 p3, int p4, int p5);
}
