package com.moon;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;


import java.util.Map;
public class cj extends sourcebuild.EnumConstructor<com.moon.cj> {

public static com.moon.cj QUINT_SIN;

public static com.moon.cj EASE_IN_SINE_OUT;

public static com.moon.cj LINEAR;

public static com.moon.cj EASE_OUT_CIRC;

public static com.moon.cj TEST;

public static com.moon.cj EASE_OUT_ELASTIC;

public static com.moon.cj EASE_OUT_BACK;

public static com.moon.cj EASE_OUT_EXPO;

public static com.moon.cj EASE_IN_BACK;

public static com.moon.cj EASE_IN_OUT_BACK;

public static com.moon.cj EASE_IN_OUT_CUBIC;

private static com.moon.cj[] a;

private static long b;

private static long[] c;

private static java.lang.Integer[] d;

private static java.util.Map e;

private cj(java.lang.String p0, int p1) {
super(p0, p1);
}


private static void initialize() {
b = ((long)(((moom._a)(moom._c.a(((long)(-7144349236680219515L)), ((long)(-9123924079968263363L)), ((java.lang.Object)(((java.lang.invoke.MethodHandles.Lookup)(java.lang.invoke.MethodHandles.lookup())).lookupClass()))))).a(((long)(116424874951348L)))));
    long local20_life6 = (com.moon.cj.b ^ 57725790778146L);
    javax.crypto.Cipher local12_life8;
    javax.crypto.Cipher __sourceSpill59_10 = (local12_life8 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/PKCS5Padding"))));
    int __sourceSpill59_11 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill59_12 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill59_13 = new byte[8];
    (__sourceSpill59_13)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local13_life14 = 1;
    while ((local13_life14 < 8)) {
        (__sourceSpill59_13)[local13_life14] = ((byte) ((int) ((local20_life6 << (local13_life14 * 8)) >>> 56)));
        local13_life14 += 1;
    }
    byte[] __sourcePreallocation59_15 = __sourceSpill59_13;
    ((javax.crypto.Cipher)(__sourceSpill59_10)).init(((int)(__sourceSpill59_11)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill59_12)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation59_15)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    java.lang.String[] local11_life18 = new java.lang.String[11];
    int local17_life19 = 0;
    java.lang.String local16_life20;
    int local18_life22 = ((java.lang.String)((local16_life20 = "ÐÆù%%4Aj¶AàR\000ÝÝÈ2\bx\022zÑ\020\002Aã1\177~sÅ5)\030Ó`û/\020ÐÆù%%4Aj¢\017°qð£c×\bÿ\1778qr¼Ó\030ÐÆù%%4AjuðôòRÎn+tÍ¶\032^Ä\000y\020\002Aã1\177~sÅSdA]{\023©â\030ÐÆù%%4Ajy©qM\017Ö ï^çË:N¨/È\bnÈTùll\002\030\002Aã1\177~sÅA¼Á`ÃEüÈÁÙ\f£©"))).length();
    int local15_life23 = 24;
    int local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill59_27 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill59_28 = local12_life8;
        byte[] local19_life30 = ((javax.crypto.Cipher)(__sourceSpill59_28)).doFinal(((byte[])(__sourceSpill59_27)));
        java.lang.String __sourceSpill59_33 = ((java.lang.String)(com.moon.cj.a(((byte[])(local19_life30))))).intern();
        java.lang.String[] __sourceSpill59_34 = local11_life18;
        int __sourceSpill59_35 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill59_34)[__sourceSpill59_35] = __sourceSpill59_33;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    local18_life22 = ((java.lang.String)((local16_life20 = "\002Aã1\177~sÅ\"÷&5:ç4\020ÕJ\177\002(mª\017=Lã\032\177\036î"))).length();
    local15_life23 = 16;
    local14_life24 = -1;
    while (true) {
        local14_life24 += 1;
        byte[] __sourceSpill59_40 = ((java.lang.String)(((java.lang.String)(local16_life20)).substring(((int)(local14_life24)), ((int)((local14_life24 + local15_life23)))))).getBytes(((java.lang.String)("ISO-8859-1")));
        javax.crypto.Cipher __sourceSpill59_41 = local12_life8;
        byte[] local19_life43 = ((javax.crypto.Cipher)(__sourceSpill59_41)).doFinal(((byte[])(__sourceSpill59_40)));
        java.lang.String __sourceSpill59_46 = ((java.lang.String)(com.moon.cj.a(((byte[])(local19_life43))))).intern();
        java.lang.String[] __sourceSpill59_47 = local11_life18;
        int __sourceSpill59_48 = local17_life19;
        local17_life19 += 1;
        (__sourceSpill59_47)[__sourceSpill59_48] = __sourceSpill59_46;
        if (!(((local14_life24 = (local14_life24 + local15_life23)) < local18_life22))) { break; }
        local15_life23 = ((java.lang.String)(local16_life20)).charAt(((int)(local14_life24)));
    }
    e = ((java.util.Map)(new java.util.HashMap(13)));
    javax.crypto.Cipher local0_life52;
    javax.crypto.Cipher __sourceSpill59_54 = (local0_life52 = javax.crypto.Cipher.getInstance(((java.lang.String)("DES/CBC/NoPadding"))));
    int __sourceSpill59_55 = 2;
    javax.crypto.SecretKeyFactory __sourceSpill59_56 = javax.crypto.SecretKeyFactory.getInstance(((java.lang.String)("DES")));
    byte[] __sourceSpill59_57 = new byte[8];
    (__sourceSpill59_57)[0] = ((byte) ((int) (local20_life6 >>> 56)));
    int local1_life58 = 1;
    while ((local1_life58 < 8)) {
        (__sourceSpill59_57)[local1_life58] = ((byte) ((int) ((local20_life6 << (local1_life58 * 8)) >>> 56)));
        local1_life58 += 1;
    }
    byte[] __sourcePreallocation59_59 = __sourceSpill59_57;
    ((javax.crypto.Cipher)(__sourceSpill59_54)).init(((int)(__sourceSpill59_55)), ((java.security.Key)(((javax.crypto.SecretKeyFactory)(__sourceSpill59_56)).generateSecret(((java.security.spec.KeySpec)(new javax.crypto.spec.DESKeySpec(__sourcePreallocation59_59)))))), ((java.security.spec.AlgorithmParameterSpec)(new javax.crypto.spec.IvParameterSpec(new byte[8]))));
    long[] local6_life62 = new long[11];
    int local3_life63 = 0;
    java.lang.String local4_life64;
    int local5_life66 = ((java.lang.String)((local4_life64 = "seD\026h\034\0002ü6ZFpvä\fºÕõR=¸[»~0\037pjGA%Eú\t\035¬Ð©8y¬\032½÷L,\"PøÀê¬tÀ¬öt\n¾"))).length();
    int local2_life67 = 0;
    do {
        java.lang.String __sourceSpill59_68 = local4_life64;
        int __sourceSpill59_69 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life72 = ((java.lang.String)(((java.lang.String)(__sourceSpill59_68)).substring(((int)(__sourceSpill59_69)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill59_73 = local6_life62;
        int __sourceSpill59_74 = local3_life63;
        local3_life63 += 1;
        long local8_life75 = (((((((((((long) (local7_life72)[0]) & 255L) << 56) | ((((long) (local7_life72)[1]) & 255L) << 48)) | ((((long) (local7_life72)[2]) & 255L) << 40)) | ((((long) (local7_life72)[3]) & 255L) << 32)) | ((((long) (local7_life72)[4]) & 255L) << 24)) | ((((long) (local7_life72)[5]) & 255L) << 16)) | ((((long) (local7_life72)[6]) & 255L) << 8)) | (((long) (local7_life72)[7]) & 255L));
        byte[] __sourceSpill59_76 = new byte[8];
        (__sourceSpill59_76)[0] = ((byte) ((int) (local8_life75 >>> 56)));
        (__sourceSpill59_76)[1] = ((byte) ((int) (local8_life75 >>> 48)));
        (__sourceSpill59_76)[2] = ((byte) ((int) (local8_life75 >>> 40)));
        (__sourceSpill59_76)[3] = ((byte) ((int) (local8_life75 >>> 32)));
        (__sourceSpill59_76)[4] = ((byte) ((int) (local8_life75 >>> 24)));
        (__sourceSpill59_76)[5] = ((byte) ((int) (local8_life75 >>> 16)));
        (__sourceSpill59_76)[6] = ((byte) ((int) (local8_life75 >>> 8)));
        (__sourceSpill59_76)[7] = ((byte) ((int) local8_life75));
        javax.crypto.Cipher __sourceSpill59_77 = local0_life52;
        byte[] local10_life79 = ((javax.crypto.Cipher)(__sourceSpill59_77)).doFinal(((byte[])(__sourceSpill59_76)));
        (__sourceSpill59_73)[__sourceSpill59_74] = (((((((((((long) (local10_life79)[0]) & 255L) << 56) | ((((long) (local10_life79)[1]) & 255L) << 48)) | ((((long) (local10_life79)[2]) & 255L) << 40)) | ((((long) (local10_life79)[3]) & 255L) << 32)) | ((((long) (local10_life79)[4]) & 255L) << 24)) | ((((long) (local10_life79)[5]) & 255L) << 16)) | ((((long) (local10_life79)[6]) & 255L) << 8)) | (((long) (local10_life79)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    local5_life66 = ((java.lang.String)((local4_life64 = "NK\032-Ö68Æj1Ivª \023"))).length();
    local2_life67 = 0;
    do {
        java.lang.String __sourceSpill59_81 = local4_life64;
        int __sourceSpill59_82 = local2_life67;
        local2_life67 += 8;
        byte[] local7_life85 = ((java.lang.String)(((java.lang.String)(__sourceSpill59_81)).substring(((int)(__sourceSpill59_82)), ((int)(local2_life67))))).getBytes(((java.lang.String)("ISO-8859-1")));
        long[] __sourceSpill59_86 = local6_life62;
        int __sourceSpill59_87 = local3_life63;
        local3_life63 += 1;
        long local8_life88 = (((((((((((long) (local7_life85)[0]) & 255L) << 56) | ((((long) (local7_life85)[1]) & 255L) << 48)) | ((((long) (local7_life85)[2]) & 255L) << 40)) | ((((long) (local7_life85)[3]) & 255L) << 32)) | ((((long) (local7_life85)[4]) & 255L) << 24)) | ((((long) (local7_life85)[5]) & 255L) << 16)) | ((((long) (local7_life85)[6]) & 255L) << 8)) | (((long) (local7_life85)[7]) & 255L));
        byte[] __sourceSpill59_89 = new byte[8];
        (__sourceSpill59_89)[0] = ((byte) ((int) (local8_life88 >>> 56)));
        (__sourceSpill59_89)[1] = ((byte) ((int) (local8_life88 >>> 48)));
        (__sourceSpill59_89)[2] = ((byte) ((int) (local8_life88 >>> 40)));
        (__sourceSpill59_89)[3] = ((byte) ((int) (local8_life88 >>> 32)));
        (__sourceSpill59_89)[4] = ((byte) ((int) (local8_life88 >>> 24)));
        (__sourceSpill59_89)[5] = ((byte) ((int) (local8_life88 >>> 16)));
        (__sourceSpill59_89)[6] = ((byte) ((int) (local8_life88 >>> 8)));
        (__sourceSpill59_89)[7] = ((byte) ((int) local8_life88));
        javax.crypto.Cipher __sourceSpill59_90 = local0_life52;
        byte[] local10_life92 = ((javax.crypto.Cipher)(__sourceSpill59_90)).doFinal(((byte[])(__sourceSpill59_89)));
        (__sourceSpill59_86)[__sourceSpill59_87] = (((((((((((long) (local10_life92)[0]) & 255L) << 56) | ((((long) (local10_life92)[1]) & 255L) << 48)) | ((((long) (local10_life92)[2]) & 255L) << 40)) | ((((long) (local10_life92)[3]) & 255L) << 32)) | ((((long) (local10_life92)[4]) & 255L) << 24)) | ((((long) (local10_life92)[5]) & 255L) << 16)) | ((((long) (local10_life92)[6]) & 255L) << 8)) | (((long) (local10_life92)[7]) & 255L));
    } while ((!(local2_life67 >= local5_life66)));
    c = ((long[])(local6_life62));
    d = ((java.lang.Integer[])(new java.lang.Integer[11]));
    QUINT_SIN = ((com.moon.cj)(new com.moon.cj((local11_life18)[10], 0)));
    EASE_IN_SINE_OUT = ((com.moon.cj)(new com.moon.cj((local11_life18)[0], 1)));
    LINEAR = ((com.moon.cj)(new com.moon.cj((local11_life18)[3], 2)));
    EASE_OUT_CIRC = ((com.moon.cj)(new com.moon.cj((local11_life18)[5], 3)));
    TEST = ((com.moon.cj)(new com.moon.cj((local11_life18)[7], 4)));
    EASE_OUT_ELASTIC = ((com.moon.cj)(new com.moon.cj((local11_life18)[8], 5)));
    EASE_OUT_BACK = ((com.moon.cj)(new com.moon.cj((local11_life18)[1], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_101(20898, (82250021912116461L ^ local20_life6)))));
    EASE_OUT_EXPO = ((com.moon.cj)(new com.moon.cj((local11_life18)[9], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_103(5842, (8139959810350005150L ^ local20_life6)))));
    EASE_IN_BACK = ((com.moon.cj)(new com.moon.cj((local11_life18)[2], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_105(16848, (6239073715910896797L ^ local20_life6)))));
    EASE_IN_OUT_BACK = ((com.moon.cj)(new com.moon.cj((local11_life18)[6], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_107(6332, (2599541648689903093L ^ local20_life6)))));
    EASE_IN_OUT_CUBIC = ((com.moon.cj)(new com.moon.cj((local11_life18)[4], __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_109(23627, (241699406527557900L ^ local20_life6)))));
    a = ((com.moon.cj[])(com.moon.cj.a()));
}


public static com.moon.cj[] values() {
return ((com.moon.cj[])(((com.moon.cj[])(com.moon.cj.a)).clone()));
}


public static com.moon.cj valueOf(java.lang.String p0) {
return ((com.moon.cj)(java.lang.Enum.valueOf(((java.lang.Class)(com.moon.cj.class)), ((java.lang.String)(p0)))));
}


private static int a(int p0, long p1) {
int var3 = p0 ^ (int)(p1 & 32767L) ^ 15222;
      if (d[var3] == null) {
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
         long var5 = c[var3];
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
         Object[] var9 = (Object[])e.get(var8);

         byte[] var10;
         try {
            if (var9 == null) {
               var9 = new Object[3];
var9[0] = Cipher.getInstance("DES/CBC/NoPadding");
var9[1] = SecretKeyFactory.getInstance("DES");
var9[2] = new IvParameterSpec(new byte[8]);
               e.put(var8, var9);
            }

            DESKeySpec var11 = new DESKeySpec(var4);
            SecretKey var12 = ((SecretKeyFactory)var9[1]).generateSecret(var11);
            Cipher var13 = (Cipher)var9[0];
            var13.init(2, var12, (IvParameterSpec)var9[2]);
            var10 = var13.doFinal(var7);
         } catch (Exception var14) {
            throw new RuntimeException("com/moon/cj", var14);
         }

         int var15 = (var10[4] & 255) << 24 | (var10[5] & 255) << 16 | (var10[6] & 255) << 8 | var10[7] & 255;
         d[var3] = var15;
      }

      return d[var3];
}


private static int a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.invoke.MutableCallSite p1, java.lang.String p2, java.lang.Object[] p3) {
int local4 = ((java.lang.Integer)(((java.lang.Integer)((p3)[0])))).intValue();
    long local5 = ((java.lang.Long)(((java.lang.Long)((p3)[1])))).longValue();
    int local7 = com.moon.cj.a(((int)(local4)), ((long)(local5)));
    java.lang.invoke.MethodHandle local8 = java.lang.invoke.MethodHandles.constant(((java.lang.Class)(java.lang.Integer.TYPE)), ((java.lang.Object)(java.lang.Integer.valueOf(((int)(local7))))));
    ((java.lang.invoke.MutableCallSite)(p1)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.dropArguments(((java.lang.invoke.MethodHandle)(local8)), ((int)(0)), ((java.lang.Class[])(new java.lang.Class[] {java.lang.Integer.TYPE, java.lang.Long.TYPE}))))));
    return local7;
}


private static java.lang.invoke.CallSite a(java.lang.invoke.MethodHandles.Lookup p0, java.lang.String p1, java.lang.invoke.MethodType p2) {
java.lang.invoke.MutableCallSite local3 = new java.lang.invoke.MutableCallSite(p2);
    try {
        ((java.lang.invoke.MutableCallSite)(local3)).setTarget(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.explicitCastArguments(((java.lang.invoke.MethodHandle)(java.lang.invoke.MethodHandles.insertArguments(((java.lang.invoke.MethodHandle)(((java.lang.invoke.MethodHandle)(__sourceIntrinsic_a027964b87ab_methodHandleLiteral847_0())).asCollector(((java.lang.Class)(java.lang.Object[].class)), ((int)(((java.lang.invoke.MethodType)(p2)).parameterCount()))))), ((int)(0)), ((java.lang.Object[])(new java.lang.Object[] {p0, local3, p1}))))), ((java.lang.invoke.MethodType)(p2))))));
    } catch (java.lang.Exception caught4) {
        throw new java.lang.RuntimeException(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(((java.lang.StringBuilder)(new java.lang.StringBuilder())).append(((java.lang.String)("com/moon/cj"))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(p1))))).append(((java.lang.String)(" : "))))).append(((java.lang.String)(((java.lang.invoke.MethodType)(p2)).toString()))))).toString(), caught4);
    }
    return local3;
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
        byte[] spill129_0 = p0;
        life4_9 += 1;
        life5_44 = (spill129_0)[life4_9];
        life6_52 = ((int)(((char) (life6_39 | ((char) (life5_44 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_52));
    } else {
        if ((life4_9 < (life2_5 - 2))) {
        life6_71 = ((int)(((char) (((char) (life5_19 & 15)) << 12))));
        byte[] spill129_1 = p0;
        life4_9 += 1;
        life5_76 = (spill129_1)[life4_9];
        life6_86 = ((int)(((char) (life6_71 | (((char) (life5_76 & 63)) << 6)))));
        byte[] spill129_2 = p0;
        life4_9 += 1;
        life5_91 = (spill129_2)[life4_9];
        life6_99 = ((int)(((char) (life6_86 | ((char) (life5_91 & 63))))));
        (life3_7)[(life1_1++)] = ((char)(life6_99));
    }
    }
    }
        life4_9 += 1;
    }
    return new java.lang.String(life3_7, 0, life1_1);
}


private static com.moon.cj[] a() {
long local0_life1 = (com.moon.cj.b ^ 122600754627837L);
    com.moon.cj[] __sourceSharedArray40_4 = new com.moon.cj[__sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_2(19709, (7751635470541346410L ^ local0_life1))];
    __sourceSharedArray40_4[0] = com.moon.cj.QUINT_SIN;
    __sourceSharedArray40_4[1] = com.moon.cj.EASE_IN_SINE_OUT;
    __sourceSharedArray40_4[2] = com.moon.cj.LINEAR;
    __sourceSharedArray40_4[3] = com.moon.cj.EASE_OUT_CIRC;
    __sourceSharedArray40_4[4] = com.moon.cj.TEST;
    __sourceSharedArray40_4[5] = com.moon.cj.EASE_OUT_ELASTIC;
    __sourceSharedArray40_4[__sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_10(18192, (8453703082658028933L ^ local0_life1))] = com.moon.cj.EASE_OUT_BACK;
    __sourceSharedArray40_4[__sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_12(2284, (821745390226772597L ^ local0_life1))] = com.moon.cj.EASE_OUT_EXPO;
    __sourceSharedArray40_4[__sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_14(29241, (2870032424819878056L ^ local0_life1))] = com.moon.cj.EASE_IN_BACK;
    __sourceSharedArray40_4[__sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_16(8514, (8221923840967031769L ^ local0_life1))] = com.moon.cj.EASE_IN_OUT_BACK;
    __sourceSharedArray40_4[__sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_18(8618, (3049613857685125950L ^ local0_life1))] = com.moon.cj.EASE_IN_OUT_CUBIC;
    return __sourceSharedArray40_4;
}


private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_101(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_103(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_105(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_107(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_eb8803ad1f63_originalDynamicSite59_109(int a0, long a1) throws E;

private static native <E extends Throwable> java.lang.invoke.MethodHandle __sourceIntrinsic_a027964b87ab_methodHandleLiteral847_0() throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_2(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_10(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_12(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_14(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_16(int a0, long a1) throws E;

private static native <E extends Throwable> int __sourceIntrinsic_0cf6e57579b2_originalDynamicSite40_18(int a0, long a1) throws E;
}
