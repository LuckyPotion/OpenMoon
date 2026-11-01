package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bw extends sourcebuild.EnumConstructor<com.moon.bw> implements com.moon.l8, com.moon.kS<com.moon.module.impl.Speed> {

public static com.moon.bw VANILLA;

public static com.moon.bw NCP;

public static com.moon.bw WATCHDOG;

public static com.moon.bw LEGIT;

public static com.moon.bw VULCAN;

public static com.moon.bw VERUS;

public static com.moon.bw STRAFE;

public static com.moon.bw UNIVERSO;

java.lang.String a;

com.moon.e2<com.moon.module.impl.Speed> b;

private static com.moon.bw[] c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private bw(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.Speed> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-8898460790381391455L)), ((long)(-7549421125309596731L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(15247859758083L)))));
    long local20_life6 = (com.moon.bw.d ^ 108273423725073L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill29_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill29_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill29_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill29_13 = new byte[8];
    (__sourceSpill29_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill29_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation29_15 = __sourceSpill29_13;
    ((javax.crypto.Cipher)(__sourceSpill29_10)).init(((int)(__sourceSpill29_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill29_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation29_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[16];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "·Îcë,Ú%/\020;ÇÎd¡\177ËeÐ\023¯\026÷\020C3\021\006S°b/SArc\bðH°\\¡÷¯\bË\037èçN\b¼\036_|?á\b¶Üê+\024pR\b]\bÇ\016>áÎ\bªv§&CÆþ'\020Ò_¬v\024\\g}Yo+§\026\b£õõ>æ&å\bsnÏúg«=\020apñ<Ù\005\020ù,Ûü\032ÐÒ\t\bË\037èçN"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill29_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill29_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill29_28)).doFinal(((byte[])(__sourceSpill29_27)));
        java.lang.String __sourceSpill29_33 = ((java.lang.String)(com.moon.bw.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill29_34 = local11_life18;
        int __sourceSpill29_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill29_34)[__sourceSpill29_35] = __sourceSpill29_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "þÆ\020oTñ\034¢\bOóXû±;"))).length();
    local15_life23 = 8;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill29_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill29_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill29_41)).doFinal(((byte[])(__sourceSpill29_40)));
        java.lang.String __sourceSpill29_46 = ((java.lang.String)(com.moon.bw.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill29_47 = local11_life18;
        int __sourceSpill29_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill29_47)[__sourceSpill29_48] = __sourceSpill29_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill29_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill29_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill29_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill29_57 = new byte[8];
    (__sourceSpill29_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill29_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation29_59 = __sourceSpill29_57;
    ((javax.crypto.Cipher)(__sourceSpill29_54)).init(((int)(__sourceSpill29_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill29_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation29_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[5];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "ºÁÞvÕÓÄ\032É¦k?(Õ¤¯8\004O>à"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill29_68 = local4_life64;
        int __sourceSpill29_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill29_68)).substring(((int)(__sourceSpill29_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill29_73 = local6_life62;
        int __sourceSpill29_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill29_76 = new byte[8];
        (__sourceSpill29_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill29_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill29_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill29_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill29_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill29_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill29_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill29_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill29_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill29_77)).doFinal(((byte[])(__sourceSpill29_76)));
        (__sourceSpill29_73)[__sourceSpill29_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "\177f\003ÂE]¢Ñ¸ÙR.)ól"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill29_81 = local4_life64;
        int __sourceSpill29_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill29_81)).substring(((int)(__sourceSpill29_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill29_86 = local6_life62;
        int __sourceSpill29_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill29_89 = new byte[8];
        (__sourceSpill29_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill29_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill29_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill29_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill29_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill29_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill29_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill29_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill29_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill29_90)).doFinal(((byte[])(__sourceSpill29_89)));
        (__sourceSpill29_86)[__sourceSpill29_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    e = ((long[])(local6_life62));
    f = ((java.lang.Integer[])(new java.lang.Integer[5]));
    VANILLA = ((com.moon.bw)(new com.moon.bw((local11_life18)[15], 0, (local11_life18)[6], new com.moon.fG())));
    NCP = ((com.moon.bw)(new com.moon.bw((local11_life18)[13], 1, (local11_life18)[4], new com.moon.fD())));
    WATCHDOG = ((com.moon.bw)(new com.moon.bw((local11_life18)[1], 2, (local11_life18)[9], new com.moon.fJ())));
    LEGIT = ((com.moon.bw)(new com.moon.bw((local11_life18)[0], 3, (local11_life18)[10], new com.moon.fC())));
    VULCAN = ((com.moon.bw)(new com.moon.bw((local11_life18)[11], 4, (local11_life18)[8], new com.moon.fI())));
    VERUS = ((com.moon.bw)(new com.moon.bw((local11_life18)[14], 5, (local11_life18)[3], new com.moon.fH())));
    STRAFE = ((com.moon.bw)(new com.moon.bw((local11_life18)[5], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite29_101(3573, (2396447628674987599L ^ local20_life6)), (local11_life18)[7], new com.moon.fE())));
    UNIVERSO = ((com.moon.bw)(new com.moon.bw((local11_life18)[12], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite29_103(5806, (52500943733157142L ^ local20_life6)), (local11_life18)[2], new com.moon.fF())));
    c = ((com.moon.bw[])(com.moon.bw.a__Arraybw()));
}


public static com.moon.bw[] values() {
return ((com.moon.bw[])(((com.moon.bw[])(com.moon.bw.c)).clone()));
}


public static com.moon.bw valueOf(java.lang.String p0) {
return ((com.moon.bw)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bw.class)), ((java.lang.String)(p0)))));
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
        byte[] spill90_0 = p0;
        life4_9 += 1;
        life5_44 = (spill90_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill90_1 = p0;
        life4_9 += 1;
        life5_76 = (spill90_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill90_2 = p0;
        life4_9 += 1;
        life5_91 = (spill90_2)[life4_9];
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
int var3 = p0 ^ (int)(p1 & 32767L) ^ 24977;
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
            throw new RuntimeException("com/moon/bw", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral720_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/bw"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.bw.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static com.moon.bw[] a__Arraybw() {
long local0_life1 = (com.moon.bw.d ^ 68653563101317L);
    com.moon.bw[] __sourceSharedArray22_4 = new com.moon.bw[__sourceIntrinsic_7f980dd2c78e_originalDynamicSite22_2(31670, (1865110632302211737L ^ local0_life1))];
    __sourceSharedArray22_4[0] = com.moon.bw.VANILLA;
    __sourceSharedArray22_4[1] = com.moon.bw.NCP;
    __sourceSharedArray22_4[2] = com.moon.bw.WATCHDOG;
    __sourceSharedArray22_4[3] = com.moon.bw.LEGIT;
    __sourceSharedArray22_4[4] = com.moon.bw.VULCAN;
    __sourceSharedArray22_4[5] = com.moon.bw.VERUS;
    __sourceSharedArray22_4[__sourceIntrinsic_7f980dd2c78e_originalDynamicSite22_10(31887, (3995666553109345702L ^ local0_life1))] = com.moon.bw.STRAFE;
    __sourceSharedArray22_4[__sourceIntrinsic_7f980dd2c78e_originalDynamicSite22_12(29502, (5500482012789930515L ^ local0_life1))] = com.moon.bw.UNIVERSO;
    return __sourceSharedArray22_4;
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.e2<com.moon.module.impl.Speed> a() {
return this.b;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite29_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite29_103(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral720_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f980dd2c78e_originalDynamicSite22_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f980dd2c78e_originalDynamicSite22_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_7f980dd2c78e_originalDynamicSite22_12(int a0, long a1) throws E;
}
