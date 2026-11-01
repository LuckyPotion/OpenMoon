package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class bs extends sourcebuild.EnumConstructor<com.moon.bs> implements com.moon.l8, com.moon.kS<com.moon.module.impl.Flight> {

public static com.moon.bs VANILLA;

public static com.moon.bs VELOCITY;

public static com.moon.bs FUN_CRAFT;

public static com.moon.bs BLOCK_DROP;

public static com.moon.bs NEGATIVITY;

public static com.moon.bs COLLISION;

public static com.moon.bs VERUS;

java.lang.String a;

com.moon.e2<com.moon.module.impl.Flight> b;

private static com.moon.bs[] c;

private static long d;

private static long[] e;

private static java.lang.Integer[] f;

private static java.util.Map g;

private bs(java.lang.String p0, int p1, java.lang.String p2, com.moon.e2<com.moon.module.impl.Flight> p3) {
super(p0, p1);
    this.a = p2;
    this.b = p3;
}


private static void initialize() {
d = ((long)(((moom._a)(moom._c.a(((long)(-6533029201958502588L)), ((long)(3386891786926352081L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(518606721153L)))));
    long local20_life6 = (com.moon.bs.d ^ 111988212204384L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill27_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill27_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill27_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill27_13 = new byte[8];
    (__sourceSpill27_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill27_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation27_15 = __sourceSpill27_13;
    ((javax.crypto.Cipher)(__sourceSpill27_10)).init(((int)(__sourceSpill27_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill27_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation27_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[14];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "¥[Ó'\022\025Äë\020_R|Ã\023.¯nT}¥%#\fs\020P®Ø>\004ÌÌµ^ë\001Óû\020&¬Àû/RfÈáÌÛm\to\bÄ\020þ°(ç\031\032[4O7@\tÅÛ>\020\007©#0XþHÜmDTÙ\002I#\020äß |Þ!\034\024(íGSÎÀ«\020ÏÅ;äoK¼¿íì¸ÿÕ«\020õ¤\034\002Kíà½æ\0219ºÐz\023\byÃ\037\f~cÏ\020ÅâMMÉ\tc0zî\030;h:\020òG1B/Þú'\\E>tg"))).length();
    int local15_life23 = 8;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill27_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill27_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill27_28)).doFinal(((byte[])(__sourceSpill27_27)));
        java.lang.String __sourceSpill27_33 = ((java.lang.String)(com.moon.bs.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill27_34 = local11_life18;
        int __sourceSpill27_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill27_34)[__sourceSpill27_35] = __sourceSpill27_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "#\020³ÖUO¹¯\bt·\001|ç±ÔÖ"))).length();
    local15_life23 = 8;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill27_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill27_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill27_41)).doFinal(((byte[])(__sourceSpill27_40)));
        java.lang.String __sourceSpill27_46 = ((java.lang.String)(com.moon.bs.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill27_47 = local11_life18;
        int __sourceSpill27_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill27_47)[__sourceSpill27_48] = __sourceSpill27_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    g = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill27_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill27_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill27_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill27_57 = new byte[8];
    (__sourceSpill27_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill27_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation27_59 = __sourceSpill27_57;
    ((javax.crypto.Cipher)(__sourceSpill27_54)).init(((int)(__sourceSpill27_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill27_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation27_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[3];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "ÉþhENlY·³üÑ°«iëÛ½LÕ\021\030"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill27_68 = local4_life64;
        int __sourceSpill27_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill27_68)).substring(((int)(__sourceSpill27_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill27_73 = local6_life62;
        int __sourceSpill27_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill27_76 = new byte[8];
        (__sourceSpill27_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill27_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill27_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill27_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill27_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill27_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill27_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill27_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill27_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill27_77)).doFinal(((byte[])(__sourceSpill27_76)));
        (__sourceSpill27_73)[__sourceSpill27_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    e = ((long[])(local6_life62));
    f = ((java.lang.Integer[])(new java.lang.Integer[3]));
    VANILLA = ((com.moon.bs)(new com.moon.bs((local11_life18)[13], 0, (local11_life18)[0], new com.moon.fr())));
    VELOCITY = ((com.moon.bs)(new com.moon.bs((local11_life18)[7], 1, (local11_life18)[4], new com.moon.fs())));
    FUN_CRAFT = ((com.moon.bs)(new com.moon.bs((local11_life18)[6], 2, (local11_life18)[10], new com.moon.fp())));
    BLOCK_DROP = ((com.moon.bs)(new com.moon.bs((local11_life18)[5], 3, (local11_life18)[2], new com.moon.fn())));
    NEGATIVITY = ((com.moon.bs)(new com.moon.bs((local11_life18)[11], 4, (local11_life18)[8], new com.moon.fq())));
    COLLISION = ((com.moon.bs)(new com.moon.bs((local11_life18)[3], 5, (local11_life18)[1], new com.moon.fo())));
    VERUS = ((com.moon.bs)(new com.moon.bs((local11_life18)[9], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite27_88(19572, (4432614164598238780L ^ local20_life6)), (local11_life18)[12], new com.moon.ft())));
    c = ((com.moon.bs[])(com.moon.bs.a__Arraybs()));
}


public static com.moon.bs[] values() {
return ((com.moon.bs[])(((com.moon.bs[])(com.moon.bs.c)).clone()));
}


public static com.moon.bs valueOf(java.lang.String p0) {
return ((com.moon.bs)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.bs.class)), ((java.lang.String)(p0)))));
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
        byte[] spill88_0 = p0;
        life4_9 += 1;
        life5_44 = (spill88_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill88_1 = p0;
        life4_9 += 1;
        life5_76 = (spill88_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill88_2 = p0;
        life4_9 += 1;
        life5_91 = (spill88_2)[life4_9];
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
int var3 = p0 ^ (int)(p1 & 32767L) ^ 12438;
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
            throw new RuntimeException("com/moon/bs", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         f[var3] = var15;
      }

      return f[var3];
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral717_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/bs"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.bs.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static com.moon.bs[] a__Arraybs() {
long local0_life1 = (com.moon.bs.d ^ 138037861567900L);
    com.moon.bs[] __sourceSharedArray20_4 = new com.moon.bs[__sourceIntrinsic_f1576d000874_originalDynamicSite20_2(6649, (5643338793440851279L ^ local0_life1))];
    __sourceSharedArray20_4[0] = com.moon.bs.VANILLA;
    __sourceSharedArray20_4[1] = com.moon.bs.VELOCITY;
    __sourceSharedArray20_4[2] = com.moon.bs.FUN_CRAFT;
    __sourceSharedArray20_4[3] = com.moon.bs.BLOCK_DROP;
    __sourceSharedArray20_4[4] = com.moon.bs.NEGATIVITY;
    __sourceSharedArray20_4[5] = com.moon.bs.COLLISION;
    __sourceSharedArray20_4[__sourceIntrinsic_f1576d000874_originalDynamicSite20_10(17507, (3535964158584023254L ^ local0_life1))] = com.moon.bs.VERUS;
    return __sourceSharedArray20_4;
}


public java.lang.String a__String() {
return this.a;
}


public com.moon.e2<com.moon.module.impl.Flight> a() {
return this.b;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite27_88(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral717_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f1576d000874_originalDynamicSite20_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_f1576d000874_originalDynamicSite20_10(int a0, long a1) throws E;
}
