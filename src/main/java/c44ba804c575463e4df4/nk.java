package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class nk {

private com.moon.nY a;

private com.moon.nl b;

private com.moon.module.impl.ClickGUI c;

private float d;

private float e;

private float f;

private float g;

private static long h;

private static java.lang.String i;

private static long[] j;

private static java.lang.Integer[] k;

private static java.util.Map l;

private static long m;

public nk(com.moon.nl p0) { super(); }


private static void __sourceConstructorBody_c2c224cc098b517e(com.moon.nk receiver, com.moon.nl p0) throws Throwable {

long local2 = (com.moon.nk.h ^ 29254830281537L);

    com.moon.nk.__sourceConstructorInit_c2c224cc098b517e_0(((com.moon.nk)(receiver)));

    ((com.moon.nk)(receiver)).a = ((com.moon.nY)(new com.moon.nY(com.moon.nk.m, com.moon.cj.LINEAR)));

    ((com.moon.nk)(receiver)).b = ((com.moon.nl)(p0));

    return;

}


private static native <E extends Throwable> void __sourceConstructorInit_c2c224cc098b517e_0(com.moon.nk a0) throws E;

static {
h = ((long)(((moom._a)(moom._c.a(((long)(8535225541609495224L)), ((long)(3013148906803903276L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(16645266649809L)))));
    long local16_life6 = (com.moon.nk.h ^ 82621010772128L);
    javax.crypto.Cipher local18_life8;
    javax.crypto.Cipher __sourceSpill316_10 = (local18_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill316_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill316_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill316_13 = new byte[8];
    (__sourceSpill316_13)[0] = ((byte) ((int) (local16_life6 >>> 56)));
    int local19_life14 = 1;
    while ((local19_life14 < 8)) {
        (__sourceSpill316_13)[local19_life14] = ((byte) ((int) ((local16_life6 << (local19_life14 * 8)) >>> 56)));
        local19_life14 += 1;
    }
    byte[] __sourcePreallocation316_15 = __sourceSpill316_13;
    ((javax.crypto.Cipher)(__sourceSpill316_10)).init(((int)(__sourceSpill316_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill316_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation316_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    byte[] __sourceSpill316_19 = ((java.lang.String)("uhÕ\005p7")).getBytes(((java.lang.String)("ISO-8859-1")));
    javax.crypto.Cipher __sourceSpill316_20 = local18_life8;
    byte[] local20_life22 = ((javax.crypto.Cipher)(__sourceSpill316_20)).doFinal(((byte[])(__sourceSpill316_19)));
    i = ((java.lang.String)(((java.lang.String)(com.moon.nk.a(((byte[])(local20_life22))))).intern()));
    l = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local5_life28;
    javax.crypto.Cipher __sourceSpill316_30 = (local5_life28 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill316_31 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill316_32 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill316_33 = new byte[8];
    (__sourceSpill316_33)[0] = ((byte) ((int) (local16_life6 >>> 56)));
    int local6_life34 = 1;
    while ((local6_life34 < 8)) {
        (__sourceSpill316_33)[local6_life34] = ((byte) ((int) ((local16_life6 << (local6_life34 * 8)) >>> 56)));
        local6_life34 += 1;
    }
    byte[] __sourcePreallocation316_35 = __sourceSpill316_33;
    ((javax.crypto.Cipher)(__sourceSpill316_30)).init(((int)(__sourceSpill316_31)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill316_32)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation316_35)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local11_life38 = new long[4];
    int local8_life39 = 0;
    java.lang.String local9_life40;
    int local10_life42 = ((java.lang.String)((local9_life40 = "ª ÏB'zÜð\030«e;°{"))).length();
    int local7_life43 = 0;
    do {
        java.lang.String __sourceSpill316_44 = local9_life40;
        int __sourceSpill316_45 = local7_life43;
        local7_life43 += 8;
        byte[] local12_life48 = ((java.lang.String)(((java.lang.String)(__sourceSpill316_44)).substring(((int)(__sourceSpill316_45)), ((int)(local7_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill316_49 = local11_life38;
        int __sourceSpill316_50 = local8_life39;
        local8_life39 += 1;
        long local13_life51 = (((((((((((long) (local12_life48)[0]) & 255L) << 56) | ((((long) (local12_life48)[1]) & 255L) << 48)) | ((((long) (local12_life48)[2]) & 255L) << 40)) | ((((long) (local12_life48)[3]) & 255L) << 32)) | ((((long) (local12_life48)[4]) & 255L) << 24)) | ((((long) (local12_life48)[5]) & 255L) << 16)) | ((((long) (local12_life48)[6]) & 255L) << 8)) | (((long) (local12_life48)[7]) & 255L));
        byte[] __sourceSpill316_52 = new byte[8];
        (__sourceSpill316_52)[0] = ((byte) ((int) (local13_life51 >>> 56)));
        (__sourceSpill316_52)[1] = ((byte) ((int) (local13_life51 >>> 48)));
        (__sourceSpill316_52)[2] = ((byte) ((int) (local13_life51 >>> 40)));
        (__sourceSpill316_52)[3] = ((byte) ((int) (local13_life51 >>> 32)));
        (__sourceSpill316_52)[4] = ((byte) ((int) (local13_life51 >>> 24)));
        (__sourceSpill316_52)[5] = ((byte) ((int) (local13_life51 >>> 16)));
        (__sourceSpill316_52)[6] = ((byte) ((int) (local13_life51 >>> 8)));
        (__sourceSpill316_52)[7] = ((byte) ((int) local13_life51));
        javax.crypto.Cipher __sourceSpill316_53 = local5_life28;
        byte[] local15_life55 = ((javax.crypto.Cipher)(__sourceSpill316_53)).doFinal(((byte[])(__sourceSpill316_52)));
        (__sourceSpill316_49)[__sourceSpill316_50] = (((((((((((long) (local15_life55)[0]) & 255L) << 56) | ((((long) (local15_life55)[1]) & 255L) << 48)) | ((((long) (local15_life55)[2]) & 255L) << 40)) | ((((long) (local15_life55)[3]) & 255L) << 32)) | ((((long) (local15_life55)[4]) & 255L) << 24)) | ((((long) (local15_life55)[5]) & 255L) << 16)) | ((((long) (local15_life55)[6]) & 255L) << 8)) | (((long) (local15_life55)[7]) & 255L));
    } while ((!(local7_life43 >= local10_life42)));
    local10_life42 = ((java.lang.String)((local9_life40 = "DKQRÈ;Í(\036ÍÚÌV «"))).length();
    local7_life43 = 0;
    do {
        java.lang.String __sourceSpill316_57 = local9_life40;
        int __sourceSpill316_58 = local7_life43;
        local7_life43 += 8;
        byte[] local12_life61 = ((java.lang.String)(((java.lang.String)(__sourceSpill316_57)).substring(((int)(__sourceSpill316_58)), ((int)(local7_life43))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill316_62 = local11_life38;
        int __sourceSpill316_63 = local8_life39;
        local8_life39 += 1;
        long local13_life64 = (((((((((((long) (local12_life61)[0]) & 255L) << 56) | ((((long) (local12_life61)[1]) & 255L) << 48)) | ((((long) (local12_life61)[2]) & 255L) << 40)) | ((((long) (local12_life61)[3]) & 255L) << 32)) | ((((long) (local12_life61)[4]) & 255L) << 24)) | ((((long) (local12_life61)[5]) & 255L) << 16)) | ((((long) (local12_life61)[6]) & 255L) << 8)) | (((long) (local12_life61)[7]) & 255L));
        byte[] __sourceSpill316_65 = new byte[8];
        (__sourceSpill316_65)[0] = ((byte) ((int) (local13_life64 >>> 56)));
        (__sourceSpill316_65)[1] = ((byte) ((int) (local13_life64 >>> 48)));
        (__sourceSpill316_65)[2] = ((byte) ((int) (local13_life64 >>> 40)));
        (__sourceSpill316_65)[3] = ((byte) ((int) (local13_life64 >>> 32)));
        (__sourceSpill316_65)[4] = ((byte) ((int) (local13_life64 >>> 24)));
        (__sourceSpill316_65)[5] = ((byte) ((int) (local13_life64 >>> 16)));
        (__sourceSpill316_65)[6] = ((byte) ((int) (local13_life64 >>> 8)));
        (__sourceSpill316_65)[7] = ((byte) ((int) local13_life64));
        javax.crypto.Cipher __sourceSpill316_66 = local5_life28;
        byte[] local15_life68 = ((javax.crypto.Cipher)(__sourceSpill316_66)).doFinal(((byte[])(__sourceSpill316_65)));
        (__sourceSpill316_62)[__sourceSpill316_63] = (((((((((((long) (local15_life68)[0]) & 255L) << 56) | ((((long) (local15_life68)[1]) & 255L) << 48)) | ((((long) (local15_life68)[2]) & 255L) << 40)) | ((((long) (local15_life68)[3]) & 255L) << 32)) | ((((long) (local15_life68)[4]) & 255L) << 24)) | ((((long) (local15_life68)[5]) & 255L) << 16)) | ((((long) (local15_life68)[6]) & 255L) << 8)) | (((long) (local15_life68)[7]) & 255L));
    } while ((!(local7_life43 >= local10_life42)));
    j = ((long[])(local11_life38));
    k = ((java.lang.Integer[])(new java.lang.Integer[4]));
    javax.crypto.Cipher local0_life72;
    javax.crypto.Cipher __sourceSpill316_74 = (local0_life72 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill316_75 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill316_76 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill316_77 = new byte[8];
    (__sourceSpill316_77)[0] = ((byte) ((int) (local16_life6 >>> 56)));
    int local1_life78 = 1;
    while ((local1_life78 < 8)) {
        (__sourceSpill316_77)[local1_life78] = ((byte) ((int) ((local16_life6 << (local1_life78 * 8)) >>> 56)));
        local1_life78 += 1;
    }
    byte[] __sourcePreallocation316_79 = __sourceSpill316_77;
    ((javax.crypto.Cipher)(__sourceSpill316_74)).init(((int)(__sourceSpill316_75)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill316_76)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation316_79)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long local2_life82 = -5520663687158134627L;
    byte[] __sourceSpill316_83 = new byte[8];
    (__sourceSpill316_83)[0] = ((byte) ((int) (local2_life82 >>> 56)));
    (__sourceSpill316_83)[1] = ((byte) ((int) (local2_life82 >>> 48)));
    (__sourceSpill316_83)[2] = ((byte) ((int) (local2_life82 >>> 40)));
    (__sourceSpill316_83)[3] = ((byte) ((int) (local2_life82 >>> 32)));
    (__sourceSpill316_83)[4] = ((byte) ((int) (local2_life82 >>> 24)));
    (__sourceSpill316_83)[5] = ((byte) ((int) (local2_life82 >>> 16)));
    (__sourceSpill316_83)[6] = ((byte) ((int) (local2_life82 >>> 8)));
    (__sourceSpill316_83)[7] = ((byte) ((int) local2_life82));
    javax.crypto.Cipher __sourceSpill316_84 = local0_life72;
    byte[] local4_life86 = ((javax.crypto.Cipher)(__sourceSpill316_84)).doFinal(((byte[])(__sourceSpill316_83)));
    m = ((long)((((((((((((long) (local4_life86)[0]) & 255L) << 56) | ((((long) (local4_life86)[1]) & 255L) << 48)) | ((((long) (local4_life86)[2]) & 255L) << 40)) | ((((long) (local4_life86)[3]) & 255L) << 32)) | ((((long) (local4_life86)[4]) & 255L) << 24)) | ((((long) (local4_life86)[5]) & 255L) << 16)) | ((((long) (local4_life86)[6]) & 255L) << 8)) | (((long) (local4_life86)[7]) & 255L))));
}


private void b() {
java.lang.Object local1 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    float local2 = java.lang.Math.max(((float)((((com.moon.nn)(((com.moon.nl)(this.b)).a__nn())).c() + 0x1.4p4f))), ((float)(0x1.9p7f)));
    float local3 = ((((((com.moon.nn)(((com.moon.nl)(this.b)).a__nn())).d() + 0x1.2p5f) + 0x1.4p4f) + ((com.moon.jm)(local1)).a(((float)(0x1.cp2f)))) + ((com.moon.jm)(local1)).a(((float)(0x1.8p3f))));
    this.f = ((float)(local2));
    this.g = ((float)(local3));
    this.d = ((float)((((java.lang.Float)(((java.lang.Float)(((java.util.function.Supplier)(((com.moon.nl)(this.b)).a__Supplier())).get())))).floatValue() - (local2 / 0x1.0p1f))));
    this.e = ((float)((((java.lang.Float)(((java.lang.Float)(((java.util.function.Supplier)(((com.moon.nl)(this.b)).b__Supplier())).get())))).floatValue() - (local3 / 0x1.0p1f))));
    return;
}


public void b(int p0, int p1, int p2) {
((com.moon.nn)(((com.moon.nl)(this.b)).a__nn())).b(((int)(p0)), ((int)(p1)), ((int)(p2)));
    return;
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
        byte[] spill1415_0 = p0;
        life4_9 += 1;
        life5_44 = (spill1415_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill1415_1 = p0;
        life4_9 += 1;
        life5_76 = (spill1415_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill1415_2 = p0;
        life4_9 += 1;
        life5_91 = (spill1415_2)[life4_9];
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


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 14283;
      if (k[var3] == null) {
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
         long var5 = j[var3];
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
         Object[] var9 = (Object[])l.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               l.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/nk", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         k[var3] = var15;
      }

      return k[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.nk.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral3007_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/nk"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


public void a(int p0, int p1) {
int spill317_0;
    com.moon.jm spill317_1;
    com.moon.hW spill317_2;
    long life3_3;
    float life6_15;
    float life7_19;
    float life8_23;
    float life9_34;
    float life10_45;
    com.moon.jm life11_60;
    com.moon.nn life12_65;
    int life5_66;
    com.moon.hW life13_71;
    com.moon.hW life14_76;
    java.lang.String life15_136;
    java.lang.String life16_140;
    float life17_145;
    float life18_150;
    float life19_155;
    float life20_164;
    com.moon.hW life21_171;
    float life22_196;
    java.util.Iterator life23_201;
    com.moon.np life24_208;
    lexical_join_291: {
    lexical_join_256: {
    life3_3 = (com.moon.nk.h ^ 31144436403169L);
    ((com.moon.nk)(this)).b();
    ((com.moon.nY)(this.a)).a(((float)(0x0.0p0f)), ((float)(0x1.0p0f)), ((boolean)(true)));
    life6_15 = ((float) ((moom.ir)(com.moon.nS.a())).a__Int());
    life7_19 = ((float) ((moom.ir)(com.moon.nS.a())).b__Int());
    life8_23 = ((com.moon.nY)(this.a)).c();
    life9_34 = (((this.d + 0x1.9p6f) / life6_15) * (0x1.0p0f - life8_23));
    life10_45 = (((this.e + 0x1.f4p6f) / life7_19) * (0x1.0p0f - life8_23));
    com.moon.hU.b(((float)(life9_34)), ((float)(life10_45)), ((float)(0x0.0p0f)));
    com.moon.hU.a(((float)(life8_23)), ((float)(life8_23)), ((float)(0x1.0p0f)));
    com.moon.hU.a(((float)(life8_23)));
    life11_60 = ((com.moon.jo)(((com.moon.runtime.ClientContext)(com.moon.runtime.ClientContext.getInstance())).a__jo())).a(((com.moon.ce)(com.moon.ce.ROBOTO_MEDIUM)));
    spill317_0 = com.moon.nn.b__Int();
    life12_65 = ((com.moon.nl)(this.b)).a__nn();
    life5_66 = spill317_0;
    life13_71 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.ROUNDED_RECTANGLE))))).a();
    life14_76 = ((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.OUTLINE_ROUNDED_RECTANGLE))))).a();
    ((com.moon.hW)(life13_71)).a(((com.moon.iX)(com.moon.i3.a(((float)(-0x1.388p14f)), ((float)(-0x1.388p14f)), ((float)(0x1.388p15f)), ((float)(0x1.388p15f)), ((float)(0x0.0p0f)), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic317_30(27579, (5112286887594055158L ^ life3_3))))))));
    ((com.moon.hW)(life13_71)).a(((com.moon.iX)(com.moon.i3.a(((float)(this.d)), ((float)(this.e)), ((float)(this.f)), ((float)(this.g)), ((float)(0x1.0p4f)), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic317_37(30215, (4646205148367669320L ^ life3_3))))))));
    ((com.moon.hW)(life14_76)).a(((com.moon.iX)(com.moon.i1.a(((float)((this.d - 0x1.0p0f))), ((float)((this.e - 0x1.0p0f))), ((float)((this.f + 0x1.0p1f))), ((float)((this.g + 0x1.0p1f))), ((float)(0x1.1p4f)), ((float)(0x1.0p-2f)), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic317_44(5651, (7243046469015414877L ^ life3_3))))))));
    life15_136 = ((com.moon.nl)(this.b)).a__String();
    life16_140 = ((com.moon.nl)(this.b)).b();
    life17_145 = (this.d + 0x1.4p3f);
    life18_150 = (this.e + 0x1.4p3f);
    life19_155 = (this.d + 0x1.4p3f);
    life20_164 = ((this.e + 0x1.4p3f) + ((com.moon.jm)(life11_60)).a(((float)(0x1.8p3f))));
    life21_171 = ((com.moon.hX)(((com.moon.hX)(((com.moon.hX)(com.moon.hW.a())).a(((com.moon.cb)(com.moon.cb.MSDF))))).a(((com.moon.jm)(life11_60))))).a();
    spill317_1 = life11_60;
    spill317_2 = life21_171;
    java.lang.String __stackOp317_62_0 = life15_136;
    java.lang.String __stackOp317_62_1 = com.moon.nk.i;
    ((com.moon.jm)(spill317_1)).b(((com.moon.hW)(spill317_2)), ((java.lang.String)(__sourceIntrinsic_fd0ba049c90e_invokedynamic317_63(__stackOp317_62_1, __stackOp317_62_0))), ((float)(0x1.8p3f)), ((float)(life17_145)), ((float)(life18_150)), ((int)(-1)));
    ((com.moon.jm)(life11_60)).b(((com.moon.hW)(life21_171)), ((java.lang.String)(life16_140)), ((float)(0x1.cp2f)), ((float)(life19_155)), ((float)(life20_164)), ((int)(__sourceIntrinsic_fd0ba049c90e_invokedynamic317_65(2167, (5999239747735107131L ^ life3_3)))));
    life22_196 = 0x0.0p0f;
    life23_201 = ((java.util.List)(((com.moon.nl)(this.b)).a__List())).iterator();
    lexical_cycle_202: while (true) {
    if (!(((java.util.Iterator)(life23_201)).hasNext())) {
        break lexical_join_256;
    }
    life24_208 = ((com.moon.np)(((java.util.Iterator)(life23_201)).next()));
    ((com.moon.np)(life24_208)).a(((float)(((((this.d + 0x1.9p7f) - 0x1.4p3f) - ((com.moon.np)(life24_208)).h) - life22_196))));
    ((com.moon.np)(life24_208)).b(((float)((((this.e + this.g) - 0x1.4p3f) - ((com.moon.np)(life24_208)).i))));
    ((com.moon.np)(life24_208)).a(((com.moon.hW)(life13_71)), ((com.moon.hW)(life21_171)), ((com.moon.module.impl.ClickGUI)(this.c)));
    life22_196 = (life22_196 + (((com.moon.np)(life24_208)).h + 0x1.4p3f));
    if (!((life5_66 != 0))) {
        break lexical_join_291;
    }
    if (!((life5_66 == 0))) { continue lexical_cycle_202; }
    break lexical_cycle_202;
    }
    net.minecraft.entity.Entity.b(((java.lang.String[])(new java.lang.String[1])));
    }
    ((com.moon.hW)(life13_71)).b();
    ((com.moon.hW)(life14_76)).b();
    ((com.moon.hW)(life21_171)).b();
    ((com.moon.nn)(life12_65)).a(((float)(((this.d + 0x1.9p6f) - (((com.moon.nn)(life12_65)).c / 0x1.0p1f)))));
    ((com.moon.nn)(life12_65)).b(((float)(((life20_164 + ((com.moon.jm)(life11_60)).a(((float)(0x1.cp2f)))) + 0x1.8p3f))));
    ((com.moon.nn)(life12_65)).a(((int)(p0)), ((int)(p1)));
    com.moon.hU.a__Void();
    com.moon.hU.d__Void();
    com.moon.hU.b__Void();
    }
    return;
}


public void a(int p0, int p1, int p2) {
com.moon.np lexicalValue318_30_0;
    int spill318_0;
    com.moon.np spill318_1;
    long life4_3;
    java.util.Iterator life7_9;
    int life6_10;
    com.moon.np life8_17;
    lexical_join_43: {
    lexical_join_36: {
    life4_3 = (com.moon.nk.h ^ 52620969013592L);
    spill318_0 = com.moon.nn.b__Int();
    life7_9 = ((java.util.List)(((com.moon.nl)(this.b)).a__List())).iterator();
    life6_10 = spill318_0;
    lexical_cycle_11: while (true) {
    lexical_join_34: {
    lexical_join_30: {
    if (!(((java.util.Iterator)(life7_9)).hasNext())) {
        break lexical_join_36;
    }
    life8_17 = ((com.moon.np)(((java.util.Iterator)(life7_9)).next()));
    if (!((life6_10 != 0))) {
        break lexical_join_43;
    }
    spill318_1 = life8_17;
    if (!((life6_10 != 0))) {
        lexicalValue318_30_0 = spill318_1;
        break lexical_join_30;
    }
    if (!(((com.moon.np)(spill318_1)).a(((float)(((float) p0))), ((float)(((float) p1)))))) {
        break lexical_join_34;
    }
    lexicalValue318_30_0 = life8_17;
    }
    ((java.util.function.Consumer)(((com.moon.np)(lexicalValue318_30_0)).a__Consumer())).accept(((java.lang.Object)(null)));
    return;
    }
    if (!((life6_10 == 0))) { continue lexical_cycle_11; }
    break lexical_cycle_11;
    }
    }
    ((com.moon.nn)(((com.moon.nl)(this.b)).a__nn())).a(((int)(p0)), ((int)(p1)), ((int)(p2)));
    }
    return;
}


public void a(char p0, int p1) {
((com.moon.nn)(((com.moon.nl)(this.b)).a__nn())).a(((char)(p0)), ((int)(p1)));
    return;
}


public void a() {
this.c = ((com.moon.module.impl.ClickGUI)(((com.moon.pk)(((com.moon.nl)(this.b)).a__pk())).a__lS()));
    ((com.moon.nn)(((com.moon.nl)(this.b)).a__nn())).a__Void();
    ((java.util.List)(((com.moon.nl)(this.b)).a__List())).forEach(((java.util.function.Consumer)(__sourceIntrinsic_2c8ae721fed4_originalDynamicSite586_9())));
    return;
}


private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral3007_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic317_30(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic317_37(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic317_44(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.String __sourceIntrinsic_fd0ba049c90e_invokedynamic317_63(java.lang.String a0, java.lang.String a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_fd0ba049c90e_invokedynamic317_65(int a0, long a1) throws E;

private static native <E extends Throwable> java.util.function.Consumer __sourceIntrinsic_2c8ae721fed4_originalDynamicSite586_9() throws E;
}
